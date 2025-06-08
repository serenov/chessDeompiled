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

public final class f {
    public Image a;
    public int b;
    public int c;
    public int d;
    public int e;

    public f(String string) throws Exception {
        DataInputStream dataInputStream = new DataInputStream(this.getClass().getResourceAsStream(string));
        this.b = -dataInputStream.readInt();
        this.c = -dataInputStream.readInt();
        byte[] byArray = this.a(string);
        dataInputStream.readFully(byArray);
        this.a = Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
        this.d = this.a.getWidth();
        this.e = this.a.getHeight();
        dataInputStream.close();
    }

    private byte[] a(String string) {
        byte[] byArray = null;
        int n = 0;
        int n2 = 0;
        try {
            InputStream inputStream = this.getClass().getResourceAsStream(string);
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

    public f(Image image, int n, int n2) {
        this.a = image;
        this.d = image.getWidth();
        this.e = image.getHeight();
        this.b = -n;
        this.c = -n2;
    }

    public f(byte[] byArray) throws Exception {
        this.b = -f.a(byArray, 0);
        this.c = -f.a(byArray, 4);
        this.a = Image.createImage((byte[])byArray, (int)8, (int)(byArray.length - 8));
        this.d = this.a.getWidth();
        this.e = this.a.getHeight();
    }

    private static int a(byte[] byArray, int n) {
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
            n -= this.d;
        } else if ((n3 & 1) != 0) {
            n -= this.d >> 1;
        }
        if ((n3 & 0x20) != 0) {
            n2 -= this.e;
        } else if ((n3 & 2) != 0) {
            n2 -= this.e >> 1;
        }
        if (bl) {
            n4 = n;
            n5 = n2;
            byte by = 0;
            if (this.b != 0) {
                by = (byte)((this.d - Math.abs(this.b)) * -1);
            }
            int n6 = graphics.getClipX();
            int n7 = graphics.getClipY();
            int n8 = graphics.getClipWidth();
            int n9 = graphics.getClipHeight();
            int n10 = 0;
            while (n10 < this.d) {
                graphics.setClip(n4 + n10 + by, n5 + this.c, 1, this.e);
                graphics.drawImage(this.a, n4 - (this.d - 1 - n10 * 2) + by, n5 + this.c, 0);
                ++n10;
            }
            graphics.setClip(n6, n7, n8, n9);
            return;
        }
        graphics.drawImage(this.a, n4 + this.b, n5 + this.c, n3);
    }
}

