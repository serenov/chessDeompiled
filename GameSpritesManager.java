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

    public final void drawUnmirroredTopLeft(Graphics graphics, int initialX, int initialY) {

        this.drawAlingedSprite(
            graphics,
            initialX,
            initialY,
            Graphics.TOP | Graphics.LEFT,
            false
        );
    }

    public final void drawUnmirrored(Graphics graphics, int initialX, int initialY, int alignmentBitmask) {

        this.drawAlingedSprite(
            graphics,
            initialX,
            initialY,
            alignmentBitmask,
            false
        );
    }

    public final void drawAlingedSprite(
        Graphics graphics,
        int x,
        int y,
        int anchorPoint,
        boolean isMirrored
    ) {
        if (!isMirrored) {
            graphics.drawImage(
                this.spriteImage,
                x + this.offsetX,
                y + this.offsetY,
                anchorPoint
            );

            return;
        }

        if ((anchorPoint & Graphics.RIGHT) != 0) { 

            x -= this.width;
        }
        else if ((anchorPoint & Graphics.HCENTER) != 0) { 

            x -= this.width >> 1;
        }

        if ((anchorPoint & (Graphics.TOP | Graphics.LEFT)) != 0) {

            y -= this.height;
        }
        else if ((anchorPoint & Graphics.VCENTER) != 0) {

            y -= this.height >> 1;
        }

        int baseX = x;
        int baseY = y;

        byte mirrorOffsetX = 0;

        if (this.offsetX != 0) {

            mirrorOffsetX = (byte)((this.width - Math.abs(this.offsetX)) * -1);
        }

        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();

        int col = 0;

        while (col < this.width) {

            graphics.setClip(
                baseX + col + mirrorOffsetX,
                baseY + this.offsetY,
                1,
                this.height
            );

            graphics.drawImage(
                this.spriteImage,
                baseX - (this.width - 1 - col * 2) + mirrorOffsetX,
                baseY + this.offsetY,
                0
            );

            ++col;
        }

        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }
}

