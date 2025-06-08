/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Image
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;

public class ChessR
extends MIDlet {
    public Display a;
    public static c b;
    public static i c;
    public static int d;
    public static int e;
    public static int f;
    public static int g;
    public static int h;
    public static int i;
    public static int j;
    public static int k;
    public static int l;
    public static byte[] m;
    public static int[] n;
    public static byte[] o;
    public static int p;
    public static int q;
    public static byte r;
    public static byte s;
    public static boolean t;

    static {
        d = 2;
        e = 0;
        f = 0;
        g = -1;
        h = -1;
        j = 0;
        m = null;
        n = null;
        o = null;
        r = 0;
        s = 0;
    }

    public ChessR() {
        b = new c(this);
    }

    public void startApp() {
        this.a = Display.getDisplay((MIDlet)this);
        this.a.setCurrent((Displayable)b);
    }

    public void destroyApp(boolean bl) {
        b.f();
        this.notifyDestroyed();
    }

    public void pauseApp() {
    }

    public static void a() {
        if (t) {
            return;
        }
        if (j++ > 0) {
            if ((j -= 2) < 0) {
                j = 0;
            }
            return;
        }
        j = 12;
        if (g.d && c.bu == 3) {
            if (g.c != null) {
                c = g.c;
                i = 0;
                g.j = false;
                g.d = false;
                if (ChessR.c.d == 0) {
                    r = o[ChessR.c.a];
                    s = o[ChessR.c.b];
                }
                c.j();
                b.a(c);
                if (ChessR.c.d == 0) {
                    r = o[ChessR.c.a];
                    s = o[ChessR.c.b];
                }
                g.c = null;
                g.f();
                i[] iArray = c.e();
                if (g.a(iArray)) {
                    if (g.b(iArray) == 0) {
                        d.G = g.b() ? 2 : (g.g() >= 3 ? 1 : 0);
                        if (c.dM) {
                            c.dM = false;
                            b.d();
                        } else {
                            c.a(44);
                            ChessR.b();
                        }
                        t = true;
                    } else {
                        d.G = g.b(iArray) == 1 ? 20 : 30;
                        c.a(44);
                        t = true;
                        ChessR.b();
                    }
                } else {
                    c.au = false;
                    if (g.b(g.l) && !c.bI) {
                        c.j = true;
                        if (c.bv != 44) {
                            c.dv = 1;
                            c.a(1000);
                        }
                    }
                    int n = c.bL = c.bL == 0 ? 1 : 0;
                    if (c.bk == 1) {
                        c.h();
                    } else {
                        b.b();
                        g.d();
                        c.af = true;
                        ChessR.b();
                    }
                    if (d.L) {
                        b.c();
                    }
                }
            }
        } else if (c.bk == 1 && c.bu == 2) {
            g.d();
            c.bL = c.bL == 0 ? 1 : 0;
            c.h();
        }
        ++d;
        if (g.d) {
            if (d >= 3) {
                d = -1;
            }
        } else if (d >= 2) {
            d = 0;
        }
        j = 0;
    }

    public static void b() {
        if (c.ba <= 0) {
            return;
        }
        c.bG = true;
        c.bu = 444;
        int n = Math.abs(r);
        int n2 = Math.abs(s);
        if (c.bk != 2 && r != 0 && s != 0) {
            if (c.af) {
                ChessR.b.l.addElement(new a(s, q));
            }
            if (!c.af && b.c(23, n2)) {
                c.a(888);
            }
        }
        if (d.E == 1 && d.F == 1) {
            ChessR.b.aE.b();
            if (r != 0 && s != 0) {
                try {
                    ChessR.b.aF = new e("/ea_" + n + ".dpr");
                    Runtime.getRuntime().gc();
                    ChessR.b.aG = new e("/ed_" + n2 + ".dpr");
                    Runtime.getRuntime().gc();
                    l = ChessR.b.aG.a[0].d;
                    c.a(666);
                    c.aK = Image.createImage((String)"/img/effect_bg.png");
                    if (n == 3 || n == 6 || n == 5) {
                        ChessR.b.aH = new e("/" + n + "effect.dpr");
                    }
                }
                catch (Throwable throwable) {}
                Runtime.getRuntime().gc();
            }
            if (c.ew) {
                ChessR.b.aE.g = true;
            }
        }
    }

    public static void c() {
        int n = c.bu = c.bL == 0 ? 2 : 3;
        if (c.bu == 2) {
            b.g();
            b.b(3);
            b.c(1);
            b.d(41);
        }
        ChessR.b.aF = null;
        ChessR.b.aG = null;
        ChessR.b.aH = null;
        c.aK = null;
        Runtime.getRuntime().gc();
        s = 0;
        r = 0;
        c.ew = false;
        c.a();
        if (c.bk == 2) {
            c.af = (c.bl ^= 1) == 1;
            b.b();
        }
        System.arraycopy(g.a, 0, o, 0, 64);
        c.bG = false;
    }
}

