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

    public static ChessCanvas b;
    public static LittleEndianInt c;
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
        b = new ChessCanvas(this);
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
        if (ChessEngine.d && ChessCanvas.bu == 3) {
            if (ChessEngine.c != null) {
                c = ChessEngine.c;
                i = 0;
                ChessEngine.j = false;
                ChessEngine.d = false;
                if (ChessR.c.d == 0) {
                    r = o[ChessR.c.a];
                    s = o[ChessR.c.b];
                }
                ChessCanvas.j();
                b.a(c);
                if (ChessR.c.d == 0) {
                    r = o[ChessR.c.a];
                    s = o[ChessR.c.b];
                }
                ChessEngine.c = null;
                ChessEngine.f();
                LittleEndianInt[] iArray = ChessCanvas.e();
                if (ChessEngine.a(iArray)) {
                    if (ChessEngine.b(iArray) == 0) {
                        GameConfig.G = ChessEngine.b() ? 2 : (ChessEngine.g() >= 3 ? 1 : 0);
                        if (ChessCanvas.dM) {
                            ChessCanvas.dM = false;
                            b.d();
                        } else {
                            ChessCanvas.a(44);
                            ChessR.b();
                        }
                        t = true;
                    } else {
                        GameConfig.G = ChessEngine.b(iArray) == 1 ? 20 : 30;
                        ChessCanvas.a(44);
                        t = true;
                        ChessR.b();
                    }
                } else {
                    ChessCanvas.au = false;
                    if (ChessEngine.b(ChessEngine.l) && !ChessCanvas.bI) {
                        ChessCanvas.j = true;
                        if (ChessCanvas.bv != 44) {
                            ChessCanvas.dv = 1;
                            ChessCanvas.a(1000);
                        }
                    }
                    // int n = ChessCanvas.bL = ChessCanvas.bL == 0 ? 1 : 0;
                    if (ChessCanvas.bk == 1) {
                        ChessCanvas.h();
                    } else {
                        b.b();
                        ChessEngine.d();
                        ChessCanvas.af = true;
                        ChessR.b();
                    }
                    if (GameConfig.L) {
                        b.c();
                    }
                }
            }
        } else if (ChessCanvas.bk == 1 && ChessCanvas.bu == 2) {
            ChessEngine.d();
            ChessCanvas.bL = ChessCanvas.bL == 0 ? 1 : 0;
            ChessCanvas.h();
        }
        ++d;
        if (ChessEngine.d) {
            if (d >= 3) {
                d = -1;
            }
        } else if (d >= 2) {
            d = 0;
        }
        j = 0;
    }

    @SuppressWarnings("unchecked")
    public static void b() {
        if (ChessCanvas.ba <= 0) {
            return;
        }
        ChessCanvas.bG = true;
        ChessCanvas.bu = 444;
        int n = Math.abs(r);
        int n2 = Math.abs(s);
        if (ChessCanvas.bk != 2 && r != 0 && s != 0) {
            if (ChessCanvas.af) {
                ChessR.b.l.addElement(new ActionPair(s, q));
            }
            if (!ChessCanvas.af && ResourceManger.c(23, n2)) {
                ChessCanvas.a(888);
            }
        }
        if (GameConfig.E == 1 && GameConfig.F == 1) {
            ChessR.b.aE.b();
            if (r != 0 && s != 0) {
                try {
                    ChessR.b.aF = new SpriteAnimator("/ea_" + n + ".dpr");
                    Runtime.getRuntime().gc();
                    ChessR.b.aG = new SpriteAnimator("/ed_" + n2 + ".dpr");
                    Runtime.getRuntime().gc();
                    l = ChessR.b.aG.a[0].d;
                    ChessCanvas.a(666);
                    ChessCanvas.aK = Image.createImage((String)"/img/effect_bg.png");
                    if (n == 3 || n == 6 || n == 5) {
                        ChessR.b.aH = new SpriteAnimator("/" + n + "effect.dpr");
                    }
                }
                catch (Throwable throwable) {}
                Runtime.getRuntime().gc();
            }
            if (ChessCanvas.ew) {
                ChessR.b.aE.g = true;
            }
        }
    }

    public static void c() {
        // int n = ChessCanvas.bu = ChessCanvas.bL == 0 ? 2 : 3;
        if (ChessCanvas.bu == 2) {
            b.g();
            b.b(3);
            b.c(1);
            b.d(41);
        }
        ChessR.b.aF = null;
        ChessR.b.aG = null;
        ChessR.b.aH = null;
        ChessCanvas.aK = null;
        Runtime.getRuntime().gc();
        s = 0;
        r = 0;
        ChessCanvas.ew = false;
        ChessCanvas.a();
        if (ChessCanvas.bk == 2) {
            ChessCanvas.af = (ChessCanvas.bl ^= 1) == 1;
            b.b();
        }
        System.arraycopy(ChessEngine.a, 0, o, 0, 64);
        ChessCanvas.bG = false;
    }
}

