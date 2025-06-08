/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class b {
    public int a;
    public int b;
    public byte[][] c;
    public int[][] d;
    public int[] e;
    public int[] f;
    public int[] g;
    public int[] h;
    public int[] i;
    public int j;
    public byte[][] k = null;
    private int t = 0;
    private int u = 0;
    private char v;
    private boolean w = false;
    public int l = 0;
    public Image[] m;
    public int[] n;
    public int[] o;
    public byte[] p;
    public int[] q;
    public int[] r;
    public static final Random s = new Random();

    public static Image a(String string) {
        Image image = null;
        try {
            try {
                image = Image.createImage((String)("/img/" + string + ".png"));
            }
            catch (Throwable throwable) {}
        }
        finally {
            Runtime.getRuntime().gc();
        }
        return image;
    }

    public static Image b(String string) {
        try {
            return Image.createImage((String)string);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static byte[] a(int n) {
        byte[] byArray = new byte[4];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)((n & 0xFF000000) >> 24);
        byArray2[1] = (byte)((n & 0xFF0000) >> 16);
        byArray2[2] = (byte)((n & 0xFF00) >> 8);
        byArray2[3] = (byte)(n & 0xFF);
        return byArray2;
    }

    public static int a(byte[] byArray) {
        return (byArray[0] << 24) + (byArray[1] << 16) + (byArray[2] << 8) + (byArray[3] << 0);
    }

    public static int[] a() {
        int[] nArray = new int[5];
        Calendar calendar = Calendar.getInstance();
        nArray[0] = calendar.get(2);
        nArray[1] = calendar.get(5);
        nArray[2] = calendar.get(11);
        nArray[3] = calendar.get(12);
        nArray[4] = calendar.get(1);
        return nArray;
    }

    public final int[] c(String string) {
        int[] nArray = null;
        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(this.getClass().getResourceAsStream("/date/" + string + ".dat"));
            int n = dataInputStream.readInt();
            nArray = new int[n];
            int n2 = 0;
            while (n2 < n) {
                nArray[n2] = dataInputStream.readInt();
                ++n2;
            }
            dataInputStream.close();
        }
        catch (Exception exception) {}
        return nArray;
    }

    public static void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6) {
        graphics.setColor(n);
        graphics.fillRect(n2, n3, n4, n6);
        graphics.fillRect(n2 + n4 - n6, n3, n6, n5);
        graphics.fillRect(n2, n3 + n5 - n6, n4, n6);
        graphics.fillRect(n2, n3, n6, n5);
    }

    private static byte[] b(byte[] byArray, int[][] nArray, int[][] nArray2, int n, int n2) {
        try {
            int n3 = 33;
            int n4 = 0;
            int n5 = byArray.length - 3;
            while (n4 < n5) {
                if (byArray[n4] == 80 && byArray[n4 + 1] == 76 && byArray[n4 + 2] == 84) {
                    n3 = n4 - 4;
                    break;
                }
                ++n4;
            }
            n4 = -1;
            n5 = n3;
            int n6 = ((byArray[n5] & 0xFF) << 24 | (byArray[n5 + 1] & 0xFF) << 16 | (byArray[n5 + 2] & 0xFF) << 8 | byArray[n5 + 3] & 0xFF) & 0xFFFFFFFF;
            n5 += 4;
            int n7 = 0;
            while (n7 < 4) {
                n4 = b.a(byArray[n5 + n7], n4);
                ++n7;
            }
            n7 = n5 += 4;
            while (n7 < n5 + n6) {
                int n8;
                int n9 = byArray[n7] & 0xFF;
                int n10 = byArray[n7 + 1] & 0xFF;
                int n11 = byArray[n7 + 2] & 0xFF;
                if (!((n & 4) != 4 && (n & 0x10) != 16 || n9 == 244 && n10 == 244 && n11 == 230)) {
                    n8 = (n & 0x10) == 16 ? (int)n2 : (n9 + n10 + n11) / 3;
                    n9 = n8;
                    n10 = n8;
                    n11 = n8;
                    byArray[n7] = (byte)n9;
                    byArray[n7 + 1] = (byte)n10;
                    byArray[n7 + 2] = (byte)n11;
                }
                if ((n & 8) == 8 && nArray != null) {
                    n8 = 0;
                    while (n8 < nArray.length) {
                        if (nArray[n8][0] == n9 && nArray[n8][1] == n10 && nArray[n8][2] == n11) {
                            byArray[n7] = (byte)(nArray2[n8][0] & 0xFF);
                            byArray[n7 + 1] = (byte)(nArray2[n8][1] & 0xFF);
                            byArray[n7 + 2] = (byte)(nArray2[n8][2] & 0xFF);
                            n9 = byArray[n7] & 0xFF;
                            n10 = byArray[n7 + 1] & 0xFF;
                            n11 = byArray[n7 + 2] & 0xFF;
                            break;
                        }
                        ++n8;
                    }
                }
                if (!((n & 1) != 1 && (n & 2) != 2 || n9 == 244 && n10 == 244 && n11 == 230)) {
                    n8 = 0;
                    if ((n & 1) == 1) {
                        n8 = 0;
                    } else if ((n & 2) == 2) {
                        n8 = 255;
                    }
                    if (n2 >= 255) {
                        n2 = 255;
                    }
                    int n12 = n8 * n2 / 255 + n9 * (255 - n2) / 255;
                    int n13 = n8 * n2 / 255 + n10 * (255 - n2) / 255;
                    int n14 = n8 * n2 / 255 + n11 * (255 - n2) / 255;
                    byArray[n7] = (byte)n12;
                    byArray[n7 + 1] = (byte)n13;
                    byArray[n7 + 2] = (byte)n14;
                }
                n4 = b.a(byArray[n7], n4);
                n4 = b.a(byArray[n7 + 1], n4);
                n4 = b.a(byArray[n7 + 2], n4);
                n7 += 3;
            }
            n7 = n3 + 8 + n6;
            byArray[n7] = (byte)((n4 ^= 0xFFFFFFFF) >> 24);
            byArray[n7 + 1] = (byte)(n4 >> 16);
            byArray[n7 + 2] = (byte)(n4 >> 8);
            byArray[n7 + 3] = (byte)n4;
        }
        catch (Exception exception) {}
        return byArray;
    }

    private static int a(byte by, int n) {
        int n2 = by & 0xFF;
        n ^= n2;
        int n3 = 0;
        while (n3 < 8) {
            n = (n & 1) != 0 ? n >>> 1 ^ 0xEDB88320 : (n >>>= 1);
            ++n3;
        }
        return n;
    }

    public static Image a(byte[] byArray, int[][] nArray, int[][] nArray2, int n, int n2) {
        byte[] byArray2 = new byte[byArray.length];
        System.arraycopy(byArray, 0, byArray2, 0, byArray.length);
        b.b(byArray2, nArray, nArray2, n, n2);
        byArray = byArray2;
        Image image = Image.createImage((byte[])byArray2, (int)0, (int)byArray.length);
        System.gc();
        return image;
    }

    public final void a(int n, int n2, int n3, int n4) {
        this.a = n;
        this.b = n2;
        this.c = new byte[n3][];
        this.d = new int[n3][];
        this.e = new int[n3];
        this.f = new int[n3];
        this.g = new int[n3];
        this.h = new int[n3];
        this.i = new int[n3];
        this.j = n4;
    }

    public final void a(int n, int n2, int n3) {
        this.c[n] = null;
        this.c[n] = new byte[n2];
        this.g[n] = n3;
        this.d[n] = null;
        this.d[n] = new int[this.g[n]];
    }

    public final void b(int n) {
        this.c[n] = null;
        this.d[n] = null;
    }

    /*
     * Unable to fully structure code
     */
    public final int a(int var1_1, int var2_2) {
        var3_3 = 0;
        var4_4 = 0;
        while (var4_4 < this.g[var2_2]) {
            this.d[var2_2][var4_4] = this.j;
            ++var4_4;
        }
        this.h[var2_2] = this.f(var1_1, var2_2);
        if (this.h[var2_2] != -1) ** GOTO lbl13
        this.h[var2_2] = 0;
        return -1;
lbl-1000:
        // 1 sources

        {
            this.d[var2_2][var3_3] = this.e(this.h[var2_2], var2_2);
            ++var3_3;
lbl13:
            // 2 sources

            ** while (this.a((char)'+', (int)var2_2))
        }
lbl14:
        // 1 sources

        v0 = var2_2;
        this.h[v0] = this.h[v0] + 2;
        return var3_3;
    }

    public final byte[] c(int n) {
        byte[] byArray = null;
        int n2 = this.h[n];
        while (n2 < this.f[n]) {
            if (this.c[n][n2] == 60) {
                this.h[n] = n2;
                return null;
            }
            if (this.c[n][n2] == 13) {
                byArray = new byte[n2 - this.h[n]];
                System.arraycopy(this.c[n], this.h[n], byArray, 0, n2 - this.h[n]);
                this.i[n] = n2 - this.h[n];
                break;
            }
            ++n2;
        }
        this.h[n] = n2 + 2;
        return byArray;
    }

    private void g(int n) {
        this.e[n] = 0;
        int n2 = 0;
        while (n2 < this.f[n]) {
            if (this.c[n][n2] == 10) {
                int n3 = n;
                this.e[n3] = this.e[n3] + 1;
            }
            ++n2;
        }
    }

    private int e(int n, int n2) {
        int n3 = 0;
        int n4 = n;
        while (n4 < this.f[n2]) {
            if (this.c[n2][n4] >= 48 && this.c[n2][n4] <= 57 || this.c[n2][n4] == 45) break;
            ++n4;
        }
        boolean bl = false;
        while (n4 < this.f[n2]) {
            if ((this.c[n2][n4] < 48 || this.c[n2][n4] > 57) && this.c[n2][n4] != 45) break;
            if (this.c[n2][n4] == 45) {
                bl = true;
            } else {
                n3 *= 10;
                n3 += this.c[n2][n4] - 48;
            }
            ++n4;
        }
        if (bl) {
            n3 *= -1;
        }
        this.h[n2] = n4;
        return n3;
    }

    private boolean a(char c2, int n) {
        int n2 = this.h[n];
        while (n2 < this.f[n]) {
            if (this.c[n][n2] == 10) {
                this.h[n] = n2 - 1;
                return false;
            }
            if (this.c[n][n2] == c2) break;
            ++n2;
        }
        this.h[n] = n2;
        return true;
    }

    private int f(int n, int n2) {
        int n3 = 0;
        while (n3 < this.f[n2]) {
            if (this.c[n2][n3] == 60 && this.e(n3, n2) == n) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    private byte[] e(String string) {
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
                byArray = new byte[n2];
                System.arraycopy(byArray2, 0, byArray, 0, byArray.length);
            }
        }
        catch (Exception exception) {}
        return byArray;
    }

    public final void d(int n) {
        this.m = new Image[n];
        this.n = new int[n];
        this.o = new int[n];
    }

    public final void a(Image image, int n, int n2) {
        this.m[n] = image;
        this.n[n] = this.m[n].getWidth() / 32;
        this.o[n] = this.m[n].getHeight() / n2;
    }

    public final void a(Graphics graphics, byte[] byArray, int n, int n2, int n3, int n4) {
        int n5 = this.n[n4];
        int n6 = this.o[n4];
        if ((n3 & 1) == 1) {
            n -= n5 * byArray.length / 2;
        } else if ((n3 & 8) == 8) {
            n -= n5 * byArray.length;
        }
        if ((n3 & 2) == 2) {
            n2 -= n6 / 2;
        } else if ((n3 & 0x20) == 32) {
            n2 -= n6;
        }
        int n7 = 0;
        while (n7 < byArray.length) {
            char c2 = (char)(byArray[n7] & 0xFF);
            int n8 = c2 - 32;
            if (c2 >= '\u0080') {
                n8 -= 32;
            }
            int n9 = n8 % 32;
            int n10 = n8 / 32;
            if (n8 >= 0 && n8 < 192) {
                graphics.setClip(n + n5 * n7, n2, n5, n6);
                graphics.drawImage(this.m[n4], n + n5 * n7 - n9 * n5, n2 - n10 * n6, 20);
            }
            ++n7;
        }
        graphics.setClip(0, 0, this.a, this.b);
    }

    public final Image e(int n) {
        Image image = null;
        try {
            byte[] byArray = this.h(n);
            try {
                image = Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
            }
            catch (Exception exception) {}
        }
        catch (Exception exception) {}
        return image;
    }

    public final void b(int n, int n2) {
        System.arraycopy(this.p, this.r[n], this.c[n2], 0, this.q[n]);
        this.f[n2] = this.q[n];
        this.c[n2][this.f[n2]] = 0;
        this.g(n2);
        this.h[n2] = 0;
    }

    private byte[] h(int n) {
        byte[] byArray = new byte[this.q[n]];
        System.arraycopy(this.p, this.r[n], byArray, 0, this.q[n]);
        return byArray;
    }

    public final int d(String string) {
        this.p = this.e(string);
        int n = b.a(this.p, 0);
        this.q = new int[n];
        this.r = new int[n];
        int n2 = 0;
        while (n2 < n) {
            this.q[n2] = b.a(this.p, 4 + n2 * 8);
            this.r[n2] = b.a(this.p, 8 + n2 * 8);
            ++n2;
        }
        return n;
    }

    public final void b() {
        this.p = null;
        this.q = null;
        this.r = null;
    }

    private static int a(byte[] byArray, int n) {
        int n2 = 0;
        n2 = (byArray[n + 3] & 0xFF) << 24;
        n2 += (byArray[n + 2] & 0xFF) << 16;
        n2 += (byArray[n + 1] & 0xFF) << 8;
        return n2 += byArray[n] & 0xFF;
    }

    public final void a(char c2) {
        this.w = true;
        this.v = c2;
    }

    public final int f(int n) {
        if (this.k == null) {
            return 0;
        }
        System.out.println("maxLineWordCntY = " + this.u);
        System.out.println("_lineCountPerOnePage = " + n);
        return this.u / n + (this.u % n > 0 ? 1 : 0);
    }

    public final byte[][] a(byte[] byArray, int n, int n2, int n3, int n4, int n5) {
        this.l = n2 / (n4 + n5);
        System.out.println("Util.stringParser() onePageYLineCount = " + this.l);
        System.out.println("Util.stringParser() maxLineWordCntX = " + this.t);
        System.out.println("Util.stringParser() maxLineWordCntY = " + this.u);
        this.t = n / n3;
        this.u = this.a(byArray, false);
        if (this.k != null) {
            this.k = null;
        }
        this.k = new byte[this.u][];
        this.a(byArray, true);
        return this.k;
    }

    private int a(byte[] byArray, boolean bl) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = byArray.length;
        while (n <= n6) {
            n4 = this.b(byArray, n);
            if (n4 >= 10000 && n2 + (n4 - 10000) <= this.t) {
                if (bl && (n3 == 0 || n3 % this.l != 0 || (n4 -= 10000) != 0)) {
                    this.k[n3] = new byte[n2 + n4];
                    System.arraycopy(byArray, n - n2, this.k[n3++], 0, n2 + n4);
                } else if (n5 == 0 || n5 % this.l != 0 || n4 != 0) {
                    ++n5;
                }
                n += n4 + 1;
                n2 = 0;
                continue;
            }
            if ((n4 >= 10000 ? n4 - 10000 : n4) > this.t && n2 == 0) {
                int n7 = n4 = n4 >= 10000 ? n4 - 10000 : n4;
                if (bl) {
                    this.k[n3] = new byte[this.t];
                    System.arraycopy(byArray, n, this.k[n3++], 0, this.t);
                } else {
                    ++n5;
                }
                n += n4 + 1;
                n2 = 0;
                continue;
            }
            if (n2 + n4 > this.t) {
                if (bl) {
                    this.k[n3] = new byte[n2];
                    System.arraycopy(byArray, n - n2, this.k[n3++], 0, n2);
                } else {
                    ++n5;
                }
                n2 = 0;
                continue;
            }
            if (n2 + n4 == this.t || n2 + n4 + 1 == this.t || n + n4 >= n6) {
                if (bl) {
                    this.k[n3] = new byte[n2 + n4];
                    System.arraycopy(byArray, n - n2, this.k[n3++], 0, n2 + n4);
                } else {
                    ++n5;
                }
                n += n4 + 1;
                n2 = 0;
                continue;
            }
            n += n4 + 1;
            n2 += n4 + 1;
        }
        return n5;
    }

    private int b(byte[] byArray, int n) {
        boolean bl = true;
        int n2 = n;
        while (bl) {
            if (n2 >= byArray.length) {
                return n2 - n;
            }
            if (byArray[n2] == 32) {
                bl = false;
                continue;
            }
            if (this.w && byArray[n2] == this.v) {
                return n2 - n + 10000;
            }
            ++n2;
        }
        return n2 - n;
    }

    private static void a(Graphics graphics, int n, int n2, int n3, int n4) {
        if (n4 <= 2) {
            graphics.fillRect(n, n2, n3, n4);
            return;
        }
        graphics.fillRect(n, n2 + 1, n3, n4 - 2);
        graphics.fillRect(n + 1, n2, n3 - 2, n4);
    }

    public static void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        graphics.setColor(n6);
        b.a(graphics, n, n2, n3, n4);
        graphics.setColor(n7);
        b.a(graphics, n + n8, n2 + n8, n3 - n8, n4 - n8);
        graphics.setColor(n5);
        b.a(graphics, n + n8, n2 + n8, n3 - n8 * 2, n4 - n8 * 2);
    }

    public static void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if ((n9 & 8) != 0) {
            n -= n3;
        } else if ((n9 & 1) != 0) {
            n -= n3 >> 1;
        }
        if ((n9 & 0x20) != 0) {
            n2 -= n4;
        } else if ((n9 & 2) != 0) {
            n2 -= n4 >> 1;
        }
        b.a(graphics, n, n2, n3, n4, n5, n6, n7, n8);
    }

    public static boolean c(int n, int n2) {
        int n3 = b.d(0, n);
        return n3 <= n2;
    }

    public static int d(int n, int n2) {
        return Math.abs(s.nextInt() % (n2 - n + 1)) + n;
    }

    public final void a(Graphics graphics, Image image, int n, int n2, int n3, int n4, int n5, int n6) {
        b.a(graphics, image, n, n2, n3, n4, n5, n6, 20);
    }

    public static void a(Graphics graphics, Image image, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        if ((n7 & 8) != 0) {
            n -= n3;
        } else if ((n7 & 1) != 0) {
            n -= n3 >> 1;
        }
        if ((n7 & 0x20) != 0) {
            n2 -= n4;
        } else if ((n7 & 2) != 0) {
            n2 -= n4 >> 1;
        }
        graphics.setClip(n, n2, n3, n4);
        graphics.drawImage(image, n - n5 * n3, n2 - n6 * n4, 20);
        graphics.setClip(0, 0, c.bA, c.bB);
    }

    public static void b(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        graphics.setColor(n6);
        graphics.fillRect(n, n2, n3, n4);
        graphics.setColor(n7);
        graphics.fillRect(n + n8, n2 + n8, n3 - n8, n4 - n8);
        graphics.setColor(n5);
        graphics.fillRect(n + n8, n2 + n8, n3 - n8 * 2, n4 - n8 * 2);
    }

    public final int a(Graphics graphics, Image image, int n, int n2, int n3, int n4) {
        String string = Integer.toString(n3);
        String string2 = "0123456789";
        int n5 = image.getWidth();
        int n6 = image.getHeight() / string2.length();
        int n7 = string.length();
        if ((n4 & 8) != 0) {
            n -= n5 * n7;
        } else if ((n4 & 1) != 0) {
            n -= n5 * n7 >> 1;
        }
        if ((n4 & 0x20) != 0) {
            n2 -= n6;
        } else if ((n4 & 2) != 0) {
            n2 -= n6 >> 1;
        }
        int n8 = 0;
        while (n8 < n7) {
            char c2 = string.charAt(n8);
            int n9 = string2.indexOf(c2);
            this.a(graphics, image, n + n8 * n5, n2, n5, n6, 0, n9);
            ++n8;
        }
        return n7 * n5;
    }

    public static void a(Graphics graphics, int n, int n2, int n3, int n4, int n5) {
        if ((n5 & 8) != 0) {
            n -= n3;
        } else if ((n5 & 1) != 0) {
            n -= n3 >> 1;
        }
        if ((n5 & 0x20) != 0) {
            n2 -= n4;
        } else if ((n5 & 2) != 0) {
            n2 -= n4 >> 1;
        }
        graphics.fillRect(n, n2, n3, n4);
    }

    public static void b(Graphics graphics, int n, int n2, int n3, int n4, int n5) {
        if ((n5 & 8) != 0) {
            n -= n3;
        } else if ((n5 & 1) != 0) {
            n -= n3 >> 1;
        }
        if ((n5 & 0x20) != 0) {
            n2 -= n4;
        } else if ((n5 & 2) != 0) {
            n2 -= n4 >> 1;
        }
        graphics.drawRect(n, n2, n3, n4);
    }

    public static void a(Graphics graphics, int[] nArray, int[] nArray2, int n) {
        int n2 = nArray.length;
        int n3 = nArray2.length;
        if (n2 <= 1 || n3 <= 1 || n2 != n3) {
            return;
        }
        graphics.setColor(n);
        int n4 = 0;
        while (n4 < n2) {
            if (n4 == n2 - 1) {
                graphics.drawLine(nArray[n4], nArray2[n4], nArray[0], nArray2[0]);
            } else {
                graphics.drawLine(nArray[n4], nArray2[n4], nArray[n4 + 1], nArray2[n4 + 1]);
            }
            ++n4;
        }
    }

    public static void a(Graphics graphics) {
        graphics.setClip(0, 0, c.bA, c.bB);
    }

    public static void c(Graphics graphics, int n, int n2, int n3, int n4, int n5) {
        if ((n5 & 8) != 0) {
            n -= n3;
        } else if ((n5 & 1) != 0) {
            n -= n3 >> 1;
        }
        if ((n5 & 0x20) != 0) {
            n2 -= n4;
        } else if ((n5 & 2) != 0) {
            n2 -= n4 >> 1;
        }
        graphics.setClip(n, n2, n3, n4);
    }
}

