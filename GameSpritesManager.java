/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GameSpritesManager {
    public Image spriteImage;
    public int offsetX;
    public int offsetY;
    public int width;
    public int height;

    public GameSpritesManager(String spritePath) throws Exception {
        DataInputStream dataInputStream = new DataInputStream(this.getClass().getResourceAsStream(spritePath));

        this.offsetX = -dataInputStream.readInt();
        this.offsetY = -dataInputStream.readInt();

        byte[] byArray = this.loadSpriteIntoByteArray(spritePath);

        dataInputStream.readFully(byArray);

        this.spriteImage = Image.createImage((byte[])byArray, (int)0, (int)byArray.length);

        this.width = this.spriteImage.getWidth();
        this.height = this.spriteImage.getHeight();

        dataInputStream.close();
    }

    private byte[] loadSpriteIntoByteArray(String spritePath) {
        byte[] byArray = null;
        int n = 0;
        int n2 = 0;
        try {
            InputStream inputStream = this.getClass().getResourceAsStream(spritePath);
            byte[] byArray2 = new byte[4096];
            while ((n2 = inputStream.read(byArray2)) > 0) {
                n += n2;
                if (byArray != null) {
                    byte[] byArray3 = new byte[byArray.length];
                    System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                    byArray = null;
                    byArray = new byte[n];
                    System.arraycopy(byArray3, 0, byArray, 0, byArray3.length);
                    System.arraycopy(byArray2, 0, byArray, n - n2, n2);
                    continue;
                }
                byArray = new byte[n2 - 8];
                System.out.println("_szRead_szRead = " + n2);
                System.arraycopy(byArray2, 0, byArray, 0, byArray.length);
            }
        }
        catch (Exception exception) {}
        return byArray;
    }

    public GameSpritesManager(Image image, int n, int n2) {
        this.spriteImage = image;
        this.width = image.getWidth();
        this.height = image.getHeight();
        this.offsetX = -n;
        this.offsetY = -n2;
    }

    public GameSpritesManager(byte[] byArray) throws Exception {
        this.offsetX = -GameSpritesManager.convertFourBytesToInt(byArray, 0);
        this.offsetY = -GameSpritesManager.convertFourBytesToInt(byArray, 4);

        this.spriteImage = Image.createImage((byte[])byArray, (int)8, (int)(byArray.length - 8));

        this.width = this.spriteImage.getWidth();
        this.height = this.spriteImage.getHeight();
    }

    private static int convertFourBytesToInt(byte[] byArray, int n) {
        int n2 = (byArray[n++] << 24) + (byArray[n++] << 16) + (byArray[n++] << 8) + (byArray[n] << 0);

        return n2;
    }

    public final void a(Graphics graphics, int n, int n2) {
        this.a(graphics, n, n2, 20, false);
    }

    public final void a(Graphics graphics, int n, int n2, int n3) {
        this.a(graphics, n, n2, n3, false);
    }

    public final void a(Graphics graphics, int n, int n2, int n3, boolean bl) {
        int n4 = n;
        int n5 = n2;
        if ((n3 & 8) != 0) {
            n -= this.width;
        } else if ((n3 & 1) != 0) {
            n -= this.width >> 1;
        }
        if ((n3 & 0x20) != 0) {
            n2 -= this.height;
        } else if ((n3 & 2) != 0) {
            n2 -= this.height >> 1;
        }
        if (bl) {
            n4 = n;
            n5 = n2;
            byte by = 0;
            if (this.offsetX != 0) {
                by = (byte)((this.width - Math.abs(this.offsetX)) * -1);
            }
            int n6 = graphics.getClipX();
            int n7 = graphics.getClipY();
            int n8 = graphics.getClipWidth();
            int n9 = graphics.getClipHeight();
            int n10 = 0;
            while (n10 < this.width) {
                graphics.setClip(n4 + n10 + by, n5 + this.offsetY, 1, this.height);
                graphics.drawImage(this.spriteImage, n4 - (this.width - 1 - n10 * 2) + by, n5 + this.offsetY, 0);
                ++n10;
            }
            graphics.setClip(n6, n7, n8, n9);
            return;
        }
        graphics.drawImage(this.spriteImage, n4 + this.offsetX, n5 + this.offsetY, n3);
    }
}

