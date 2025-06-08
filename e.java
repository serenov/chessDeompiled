/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

public final class e {
    public f[] a;
    public int b = 0;
    public byte[][] c;
    public int[][] d;
    public int[][] e;
    public boolean f = true;
    public boolean g;
    public int h;
    public boolean i = true;

    public e(String string) throws Exception {
        DataInputStream dataInputStream = new DataInputStream(this.getClass().getResourceAsStream(string));
        int n = dataInputStream.readByte();
        int n2 = dataInputStream.readByte();
        this.a = new f[n];
        this.c = new byte[n2][];
        this.d = new int[n2][];
        this.e = new int[n2][];
        int n3 = 0;
        int n4 = 0;
        while (n4 < n2) {
            n3 = dataInputStream.readByte();
            this.c[n4] = new byte[n3];
            this.d[n4] = new int[n3];
            this.e[n4] = new int[n3];
            int n5 = 0;
            while (n5 < n3) {
                this.c[n4][n5] = dataInputStream.readByte();
                this.d[n4][n5] = dataInputStream.readInt();
                this.e[n4][n5] = dataInputStream.readInt();
                ++n5;
            }
            ++n4;
        }
        long l = 0L;
        long l2 = 0L;
        int n6 = 0;
        while (n6 < n) {
            dataInputStream.readLong();
            l2 = dataInputStream.readLong();
            byte[] byArray = new byte[(int)l2];
            dataInputStream.read(byArray);
            this.a[n6] = new f(byArray);
            ++n6;
        }
        dataInputStream.close();
    }

    public final void a() {
        byte by;
        if (this.g) {
            return;
        }
        if (this.i) {
            this.h = 0;
            this.i = false;
            return;
        }
        if ((by = this.c[this.b][++this.h]) < 0) {
            if (by == -100) {
                this.d();
                return;
            }
            if (by == -101) {
                this.e();
                return;
            }
            if (by == -127) {
                return;
            }
            this.h = 0;
            this.b = -by - 1;
            return;
        }
        this.f = true;
    }

    public final void b() {
        this.a(0);
    }

    private void d() {
        this.g = true;
    }

    private void e() {
        this.g = true;
        this.f = false;
    }

    private void a(int n) {
        this.f = true;
        this.g = false;
        this.i = true;
        this.b = n;
        this.h = 0;
    }

    public final void c() {
        if (this.b < this.c.length - 1) {
            ++this.b;
        } else {
            return;
        }
        this.f = true;
        this.g = false;
        this.i = true;
        this.h = 0;
    }

    public final void a(Graphics graphics, int n, int n2) {
        this.a(graphics, n, n2, 20, false);
    }

    public final void a(Graphics graphics, int n, int n2, int n3, boolean bl) {
        if (!this.f || this.c[this.b][this.h] == -127) {
            return;
        }
        if (this.h < 0) {
            this.h = 0;
        }
        int n4 = this.h;
        if (this.g) {
            n4 = this.h - 1;
        }
        int n5 = this.d[this.b][n4];
        int n6 = this.e[this.b][n4];
        if (bl) {
            n5 *= -1;
        }
        this.a[this.c[this.b][n4]].a(graphics, n + n5, n2 + n6, n3, bl);
    }
}

