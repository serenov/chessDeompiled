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

    public static PlayStage b;
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
        b = new PlayStage(this);
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
        if (ChessEngine.d && PlayStage.bu == 3) {
            if (ChessEngine.c != null) {
                c = ChessEngine.c;
                i = 0;
                ChessEngine.j = false;
                ChessEngine.d = false;
                if (ChessR.c.d == 0) {
                    r = o[ChessR.c.a];
                    s = o[ChessR.c.b];
                }
                PlayStage.j();
                b.a(c);
                if (ChessR.c.d == 0) {
                    r = o[ChessR.c.a];
                    s = o[ChessR.c.b];
                }
                ChessEngine.c = null;
                ChessEngine.f();
                LittleEndianInt[] iArray = PlayStage.e();
                if (ChessEngine.a(iArray)) {
                    if (ChessEngine.b(iArray) == 0) {
                        Constants.G = ChessEngine.b() ? 2 : (ChessEngine.g() >= 3 ? 1 : 0);
                        if (PlayStage.dM) {
                            PlayStage.dM = false;
                            b.d();
                        } else {
                            PlayStage.a(44);
                            ChessR.b();
                        }
                        t = true;
                    } else {
                        Constants.G = ChessEngine.b(iArray) == 1 ? 20 : 30;
                        PlayStage.a(44);
                        t = true;
                        ChessR.b();
                    }
                } else {
                    PlayStage.au = false;
                    if (ChessEngine.b(ChessEngine.l) && !PlayStage.bI) {
                        PlayStage.j = true;
                        if (PlayStage.bv != 44) {
                            PlayStage.dv = 1;
                            PlayStage.a(1000);
                        }
                    }
                    // int n = ChessCanvas.bL = ChessCanvas.bL == 0 ? 1 : 0;
                    if (PlayStage.bk == 1) {
                        PlayStage.h();
                    } else {
                        b.b();
                        ChessEngine.d();
                        PlayStage.af = true;
                        ChessR.b();
                    }
                    if (Constants.L) {
                        b.c();
                    }
                }
            }
        } else if (PlayStage.bk == 1 && PlayStage.bu == 2) {
            ChessEngine.d();
            PlayStage.bL = PlayStage.bL == 0 ? 1 : 0;
            PlayStage.h();
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
        if (PlayStage.ba <= 0) {
            return;
        }
        PlayStage.bG = true;
        PlayStage.bu = 444;
        int n = Math.abs(r);
        int n2 = Math.abs(s);
        if (PlayStage.bk != 2 && r != 0 && s != 0) {
            if (PlayStage.af) {
                ChessR.b.l.addElement(new ActionPair(s, q));
            }
            if (!PlayStage.af && Util.c(23, n2)) {
                PlayStage.a(888);
            }
        }
        if (Constants.E == 1 && Constants.F == 1) {
            ChessR.b.aE.b();
            if (r != 0 && s != 0) {
                try {
                    ChessR.b.aF = new SpriteAnimator("/ea_" + n + ".dpr");
                    Runtime.getRuntime().gc();
                    ChessR.b.aG = new SpriteAnimator("/ed_" + n2 + ".dpr");
                    Runtime.getRuntime().gc();
                    l = ChessR.b.aG.a[0].d;
                    PlayStage.a(666);
                    PlayStage.aK = Image.createImage((String)"/img/effect_bg.png");
                    if (n == 3 || n == 6 || n == 5) {
                        ChessR.b.aH = new SpriteAnimator("/" + n + "effect.dpr");
                    }
                }
                catch (Throwable throwable) {}
                Runtime.getRuntime().gc();
            }
            if (PlayStage.ew) {
                ChessR.b.aE.g = true;
            }
        }
    }

    public static void c() {
        // int n = ChessCanvas.bu = ChessCanvas.bL == 0 ? 2 : 3;
        if (PlayStage.bu == 2) {
            b.g();
            b.b(3);
            b.c(1);
            b.d(41);
        }
        ChessR.b.aF = null;
        ChessR.b.aG = null;
        ChessR.b.aH = null;
        PlayStage.aK = null;
        Runtime.getRuntime().gc();
        s = 0;
        r = 0;
        PlayStage.ew = false;
        PlayStage.a();
        if (PlayStage.bk == 2) {
            PlayStage.af = (PlayStage.bl ^= 1) == 1;
            b.b();
        }
        System.arraycopy(ChessEngine.a, 0, o, 0, 64);
        PlayStage.bG = false;
    }
}

