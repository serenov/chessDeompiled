/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.rms.RecordEnumeration
 *  javax.microedition.rms.RecordStore
 *  javax.microedition.rms.RecordStoreException
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

@SuppressWarnings("rawtypes")
public final class PlayStage
extends Canvas
implements Runnable {
    public ChessR a;
    public Util utilService;
    public AudioManager audioService;
    public static ChessEngine chessEngine;
    public Graphics e;
    public Thread f;
    public boolean isImgLoading;
    public boolean h = false;
    public static boolean i;
    public static boolean j;
    public byte k = 0;
    public Vector l = null;
    public Image m;
    public int n = 141;
    public int o = 146;
    public int p = 142;
    public int q = 145;
    public int r = 148;
    public int s = 8;
    public int t = 129;
    public int u = 131;
    public Image[] v;
    public Image[] w;
    public Image x;
    public int[][] y;
    public int z = 0;
    public int A = 0;
    public int[] B = new int[6];
    public long C = 0L;
    public int D = 0;
    public int E = 0;
    public int F = 0;
    public int G = 0;
    public int H = 0;
    public int I = 0;
    public final int[] J;
    public final int[] K;
    public final int[] L;
    public int M;
    public int[] N;
    public int O;
    public static int P;
    public static int[] Q;
    public int R;
    public int S;
    public byte[] T;
    public int U;
    public boolean V;
    public boolean W;
    public int[][] X;
    public int[][][] Y;
    public int Z;
    public int[] aa;
    public Image ab;
    public int ac;
    public int ad;
    public int ae;
    public static boolean af;
    public Image ag;
    public Image ah;
    public Image ai;
    public Image aj;
    public Image[] ak;
    public Image al;
    public Image[] am;
    public Image[] an;
    public Image ao;
    public Image ap;
    public Image aq;
    public Image ar;
    public Image[] as;
    public Image[] at;
    public static boolean au;
    public int av;
    public int[] aw;
    public static String[] ax;
    public int[] ay;
    public Image[] az;
    public Image[] aA;
    public GameSpritesManager[] aB;
    public Image[] aC;
    public Image[] aD;
    public SpriteAnimator aE;
    public SpriteAnimator aF;
    public SpriteAnimator aG;
    public SpriteAnimator aH;
    public Image[] aI;
    public Image aJ;
    public static Image aK;
    public int aL;
    public Image[] aM;
    public GameSpritesManager[] aN;
    public GameSpritesManager[] aO;
    public GameSpritesManager[] aP;
    public GameSpritesManager[] aQ;
    public Image[][] aR;
    public int aS;
    public static int aT;
    public static boolean aU;
    public static boolean aV;
    public static boolean aW;
    public static boolean aX;
    public int aY;
    public Image[] aZ;
    public static int ba;
    public static int bb;
    public int bc;
    public int bd;
    public static int be;
    public static int bf;
    public static int bg;
    public static int bh;
    public static boolean is3D;
    public int bj;
    public static int bk;
    public static int bl;
    public int bm;
    public int bn;
    public int bo;
    public int bp;
    public int bq;
    public int keyProcess_nState;
    public int bs;
    public int bt;
    public static int bu;
    public static int bv;
    public static int bw;
    public static int bx;
    public static int by;
    public static int bz;
    public static int canvasWidth;
    public static int canvasHeight;
    public int bC;
    public int bD;
    public boolean bE;
    public boolean bF;
    public static boolean bG;
    public boolean bH;
    public static boolean bI;
    public LittleEndianInt bJ;
    public static boolean bK;
    public static int bL;
    public int bM;
    public int bN;
    public int bO;
    public int[] bP;
    public int bQ;
    public int bR;
    public int bS;
    public int bT;
    public boolean bU;
    public int bV;
    public int bW;
    public boolean bX;
    public int bY;
    public int bZ;
    public int ca;
    public byte[] cb;
    public byte[] cc;
    public byte[] cd;
    public byte[][] ce;
    public byte[][] cf;
    public byte[][][] cg;
    public int ch;
    public int ci;
    public int cj;
    public int ck;
    public int cl;
    public int cm;
    public int cn;
    public int co;
    public int cp;
    public int cq;
    public int cr;
    public int cs;
    public int ct;
    public int cu;
    public int cv;
    public int cw;
    public int cx;
    public int cy;
    public int cz;
    public int cA;
    public int cB;
    public int cC;
    public boolean cD;
    public int cE;
    public int cF;
    public int cG;
    public boolean cH;
    public boolean cI;
    public static byte[] cJ;
    public Image[] cK;
    public Image cL;
    public Image cM;
    public int cN;
    public int cO;
    public int cP;
    public boolean cQ;
    public int[] cR;
    public int cS;
    public int cT;
    public boolean cU;
    public int cV;
    public int cW;
    public SpriteAnimator cX;
    public Image[] cY;
    public Image cZ;
    public Image[] da;
    public int db;
    public int dc;
    public static Vector dd;
    public static int de;
    public Image df;
    public boolean dg;
    public int dh;
    public int[] di;
    public int[] dj;
    public boolean dk;
    public int dl;
    public int dm;
    public int[] dn;
    public int[] cfr_renamed_0;
    public int[] dp;
    public int dq;
    public byte dr;
    public int ds;
    public int dt;
    public boolean du;
    public static int dv;
    public int[] dw;
    public static int dx;
    public int dy;
    public boolean dz;
    public Image dA;
    public int dB;
    public boolean dC;
    public int dD;
    public int dE;
    public GameSpritesManager dF;
    public ActionPair dG;
    public int spriteId;
    public int dI;
    private int eA;
    public Image dJ;
    public static boolean dK;
    public int dL;
    public static boolean dM;
    public int dN;
    public int dO;
    public int dP;
    public boolean dQ;
    public int dR;
    public static int dS;
    public long dT;
    public long dU;
    public long dV;
    public boolean dW;
    public boolean dX;
    public String dY;
    public String dZ;
    public String ea;
    public String eb;
    public String ec;
    public byte[][] ed;
    public boolean ee;
    public int ef;
    public long eg;
    public static boolean eh;
    public static boolean ei;
    public static int ej;
    public boolean ek;
    public Image[][] el;
    public int[][] em;
    public Image en;
    public int eo;
    public int ep;
    public long eq;
    public long er;
    public int es;
    public static Vector et;
    public byte[] eu;
    public byte[] ev;
    public static boolean ew;
    public static int ex;
    public byte ey;
    public boolean ez;

    static {
        i = false;
        j = false;
        P = 0;
        Q = new int[7];
        af = false;
        au = false;
        ax = new String[3];
        aK = null;
        be = 0;
        bf = 0;
        bg = 0;
        bh = 0;
        is3D = true;
        bk = 0;
        bl = 0;
        bI = false;
        bK = false;
        bL = 0;
        cJ = new byte[3];
        dd = null;
        de = 0;
        dv = -4132;
        dx = -4132;
        dK = false;
        dM = false;
        dS = 0;
        @SuppressWarnings("unused")
        int[] nArray = new int[]{500, 1000, 2000, 5000, 1000, 1000};
        et = new Vector();
        ex = 0;
    }

    public PlayStage(ChessR chessR) {
        int[] nArray = new int[7];
        nArray[1] = -80;
        nArray[2] = -80;
        nArray[3] = -80;
        nArray[4] = -80;
        nArray[5] = -80;
        nArray[6] = -80;
        this.J = nArray;
        int[] nArray2 = new int[7];
        nArray2[1] = -20;
        nArray2[2] = -20;
        nArray2[3] = -20;
        nArray2[4] = -20;
        nArray2[5] = -20;
        nArray2[6] = -20;
        this.K = nArray2;
        int[] nArray3 = new int[7];
        nArray3[1] = 7;
        nArray3[2] = 10;
        nArray3[3] = 17;
        nArray3[4] = 4;
        nArray3[5] = 10;
        nArray3[6] = 11;
        this.L = nArray3;
        this.M = 0;
        this.O = 0;
        this.S = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        int[][] nArrayArray = new int[7][];
        int[] nArray4 = new int[2];
        nArray4[1] = 7;
        nArrayArray[0] = nArray4;
        int[] nArray5 = new int[2];
        nArray5[1] = 6;
        nArrayArray[1] = nArray5;
        int[] nArray6 = new int[2];
        nArray6[1] = 5;
        nArrayArray[2] = nArray6;
        int[] nArray7 = new int[2];
        nArray7[1] = 4;
        nArrayArray[3] = nArray7;
        int[] nArray8 = new int[2];
        nArray8[1] = 3;
        nArrayArray[4] = nArray8;
        int[] nArray9 = new int[3];
        nArray9[1] = 2;
        nArray9[2] = 1;
        nArrayArray[5] = nArray9;
        int[] nArray10 = new int[2];
        nArray10[1] = 8;
        nArrayArray[6] = nArray10;
        this.X = nArrayArray;
        this.Y = new int[][][]{new int[][]{new int[1], {1}, {1}, {2, 1}, {3, 2, 1}, {3, 2, 2}, {3, 3, 2}, {4}}, new int[][]{new int[1], {1}, {2}, {3, 4}, {3, 3, 2}, {4, 3, 2}, {4, 4, 3}, {5}}, new int[][]{{1}, {2}, {3}, {4, 3}, {5, 4, 3}, {6, 5, 4}, {7, 6, 5}, {8}}};
        this.Z = 0;
        this.aa = new int[8];
        this.ab = null;
        this.ac = 0;
        this.ad = 0;
        this.at = null;
        this.av = -4132;
        this.aw = new int[]{1, 1, 1, 1};
        this.ay = new int[6];
        this.az = new Image[2];
        this.aA = new Image[2];
        this.aB = new GameSpritesManager[24];
        this.aM = null;
        this.aN = null;
        this.aO = null;
        this.aP = null;
        this.aQ = null;
        this.aR = new Image[1][18];
        this.aS = 2;
        this.bc = 0;
        this.bd = 0;
        this.bj = 1;
        this.bm = 0;
        this.bn = 0;
        this.bo = 0;
        this.bJ = null;
        this.bM = 0;
        this.bN = 0;
        this.bO = 0;
        this.bQ = -4132;
        this.bR = -4132;
        this.bS = -4132;
        this.bT = -4132;
        this.bU = false;
        this.bW = -1;
        this.cb = null;
        this.cc = null;
        this.cd = null;
        this.ce = null;
        this.cf = null;
        this.cg = null;
        this.cz = 0;
        this.cA = 3;
        this.cB = 0;
        this.cC = 0;
        this.cD = false;
        this.cE = 0;
        this.cF = 1;
        this.cG = 3;
        this.cH = false;
        this.cI = false;
        this.cN = 7;
        this.cO = -4132;
        this.cP = -4132;
        this.cS = 0;
        this.cT = 0;
        this.cU = false;
        this.cV = 0;
        this.cW = 0;
        this.cX = null;
        this.cY = null;
        this.cZ = null;
        this.da = null;
        this.db = 0;
        this.dc = 0;
        this.dg = false;
        this.dh = 0;
        this.dl = 7;
        this.dm = -4132;
        this.dn = null;
        this.cfr_renamed_0 = null;
        this.dp = null;
        this.dq = 0;
        this.dr = 0;
        this.ds = 0;
        this.dt = -4132;
        this.du = false;
        this.dw = new int[2];
        this.dy = 0;
        this.dz = false;
        int[][] nArrayArray2 = new int[6][];
        nArrayArray2[0] = new int[]{60, 6};
        nArrayArray2[1] = new int[]{37, 23};
        nArrayArray2[2] = new int[]{24, 13};
        nArrayArray2[3] = new int[]{14, 10};
        nArrayArray2[4] = new int[]{7, 7};
        int[] nArray11 = new int[2];
        nArray11[1] = 7;
        nArrayArray2[5] = nArray11;
        this.dB = -4132;
        this.dC = false;
        this.dF = null;
        this.dG = null;
        this.spriteId = 0;
        this.dI = -4132;
        this.eA = 0;
        this.dJ = null;
        this.dL = 0;
        this.dN = 10;
        this.dO = 7;
        this.dP = 0;
        this.dQ = false;
        this.dR = 0;
        this.dT = 0L;
        this.dU = 0L;
        this.dV = 100L;
        this.dW = false;
        this.dX = false;
        this.dY = null;
        this.dZ = null;
        this.ea = null;
        this.eb = null;
        this.ec = null;
        this.ed = new byte[][]{{21, 47}, {25, 45}, {20, 44}, {26, 44}, {30, 46}, {30, 47}, {33, 50}, {18, 44}, {7, 38}};
        this.ee = false;
        this.eg = 0L;
        this.ek = false;
        this.el = null;
        this.em = new int[][]{{34, 107}, {116, 78}, {195, 3}, {93, 174}, {178, 225}};
        this.eo = 0;
        this.ep = 0;
        this.eq = 0L;
        this.er = 0L;
        this.es = 0;
        this.eu = null;
        this.ev = null;
        this.ey = 0;
        this.a = chessR;

        this.setFullScreenMode(true);

        this.utilService = new Util();
        this.audioService = new AudioManager();

        canvasWidth = this.getWidth();
        canvasHeight = this.getHeight();

        this.initManifestAttributes();

        chessEngine = new ChessEngine();

        this.T = new byte[9];

        this.LoadOption();

        this.keyProcess_nState = 0;
        this.startGameThread();
    }

    private void l() {
        by = canvasWidth >> 1;
        bz = canvasHeight >> 1;
        this.isImgLoading = true;
        bG = true;
        bg = by - 121;
        bh = bz - 96;
        bv = -4132;
        this.bM = 0;
        this.bP = new int[2];
        this.bP[0] = 1;
        this.bP[1] = 0;
        this.utilService.a(canvasWidth, canvasHeight, 2, -1000);
        this.utilService.d(2);
        this.a("font");
        this.utilService.a(this.utilService.e(0), 0, 6);
        this.utilService.a(this.utilService.e(1), 1, 6);
        this.utilService.unsetTheFileBytes();
        this.bV = -1;
        this.at = new Image[9];
        this.a("logo");
        int n = 0;
        while (n < this.at.length) {
            this.at[n] = this.utilService.e(n);
            ++n;
        }
        this.utilService.unsetTheFileBytes();
        this.keyProcess_nState = 6;
    }

    private void a(Graphics graphics) {
        PlayStage.V(graphics);
        this.utilService.a(graphics, this.cf[0], by, bz, 17, 1);
        graphics.setColor(0xFFFFFF);
        graphics.fillRect(0, bz + this.cf[0].length + 9, canvasWidth, 10);
        graphics.setColor(0);
        graphics.fillRect(2, bz + this.cf[0].length + 11, this.cE * canvasWidth / 6 - 4, 6);
        if (this.cD) {
            try {
                if (this.cE == 1) {
                    this.w = new Image[2];
                    this.a("ui_effect");
                    this.w[0] = this.utilService.e(1);
                    this.w[1] = this.utilService.e(2);
                    this.utilService.unsetTheFileBytes();
                    this.o();
                    this.v = new Image[8];
                    this.a("loading_0");
                    this.ap = this.utilService.e(0);
                    this.aq = this.utilService.e(1);
                    this.ar = this.utilService.e(2);
                    this.utilService.unsetTheFileBytes();
                    this.bO = 0;
                    this.a("boardPiece");
                    int n = 0;
                    while (n < 18) {
                        this.aR[this.bO][n] = this.utilService.e(n);
                        ++n;
                    }
                    this.utilService.unsetTheFileBytes();
                    this.bc = this.aR[this.bO][4].getHeight();
                    this.bd = this.aR[this.bO][0] == null ? this.aR[this.bO][1].getHeight() : this.aR[this.bO][0].getHeight();
                    this.aL = this.bc >> 1;
                    be = (this.getWidth() - this.bc * 8 - this.bd * 2) / 2 + this.bd;
                    bf = (this.getHeight() - this.bc * 8 - this.bd * 2) / 2 + this.bd;
                    this.aR = null;
                    System.gc();
                } else if (this.cE == 2) {
                    int[][] nArrayArray = new int[7][];
                    nArrayArray[0] = new int[]{1, 160, 206};
                    nArrayArray[1] = new int[]{2, 127, 263};
                    int[] nArray = new int[3];
                    nArray[1] = 40;
                    nArray[2] = 212;
                    nArrayArray[2] = nArray;
                    int[] nArray2 = new int[3];
                    nArray2[1] = 57;
                    nArray2[2] = 141;
                    nArrayArray[3] = nArray2;
                    nArrayArray[4] = new int[]{3, 106, 68};
                    nArrayArray[5] = new int[]{1, 193, 112};
                    nArrayArray[6] = new int[]{2, 151, 185};
                    this.y = nArrayArray;
                    try {
                        Constants.O = this.utilService.loadGameDataById("anMapX");
                        Constants.P = this.utilService.loadGameDataById("anMapY");
                        Constants.Q = this.utilService.loadGameDataById("anMapCenterY");
                        Constants.R = this.utilService.loadGameDataById("anMapEdgeY");
                        Constants.S = this.utilService.loadGameDataById("anMapEdgeX");
                    }
                    catch (Exception exception) {}
                    ChessR.m = new byte[64];
                    ChessR.n = new int[64];
                    ChessR.o = new byte[64];
                    this.al = Image.createImage((String)"/img/ui_num.png");
                    this.bW = -1;
                    this.bX = false;
                    this.bV = -1;
                }
                if (++this.cE > 3) {
                    this.b(13, false);
                    this.a(256, true);
                    this.cD = false;
                    return;
                }
            }
            catch (Exception exception) {}
        }
    }

    private void initManifestAttributes() {
        Constants.a = this.a.getAppProperty("Default-Logo").equals("ON") ? 0 : 1;
        Constants.isMoreGamesOn = this.a.getAppProperty("More_Games").equals("ON");
        Constants.downloadUrl = this.a.getAppProperty("Download-URL");
        Constants.isCheatModeOn = this.a.getAppProperty("Default-Cheat").equals("ON");

        int n = this.a.getAppProperty("Default-Vendor-Key").equals("MOTO1") ? 1 : (this.a.getAppProperty("Default-Vendor-Key").equals("MOTO2") ? 2 : (this.a.getAppProperty("Default-Vendor-Key").equals("SIEMENS") ? 3 : (this.a.getAppProperty("Default-Vendor-Key").equals("SAGEM") ? 4 : (this.a.getAppProperty("Default-Vendor-Key").equals("LGT") ? 5 : 0))));

        this.r = Constants.o[n][0];
        this.t = Constants.o[n][1];
        this.u = Constants.o[n][2];
        this.n = Constants.o[n][3];
        this.o = Constants.o[n][4];
        this.p = Constants.o[n][5];
        this.q = Constants.o[n][6];

        Constants.midletVersion = this.a.getAppProperty("MIDlet-Version");

        if (this.a.getAppProperty("Force-Language").equals("EN")) {
            Constants.forcedLocaleLanguageCode = 0;
            return;
        }

        if (this.a.getAppProperty("Force-Language").equals("DE")) {
            Constants.forcedLocaleLanguageCode = 1;
            return;
        }

        if (this.a.getAppProperty("Force-Language").equals("FR")) {
            Constants.forcedLocaleLanguageCode = 2;
            return;
        }
        if (this.a.getAppProperty("Force-Language").equals("ES")) {
            Constants.forcedLocaleLanguageCode = 3;
            return;
        }
        if (this.a.getAppProperty("Force-Language").equals("IT")) {
            Constants.forcedLocaleLanguageCode = 4;
            return;
        }
        if (this.a.getAppProperty("Force-Language").equals("PT")) {
            Constants.forcedLocaleLanguageCode = 5;
            return;
        }
        Constants.forcedLocaleLanguageCode = 6;
    }

    private void b(Graphics graphics) {
        PlayStage.V(graphics);
        graphics.setColor(255, 255, 0);
        graphics.fillRect(0, 58 + Constants.v * 15, canvasWidth, this.utilService.o[1] + 4);
        this.utilService.a(graphics, this.cf[0], by, 40, 17, 1);
        int n = 0;
        while (n < 6) {
            this.utilService.a(graphics, this.cf[1 + n], by, 60 + 15 * n, 17, 1);
            ++n;
        }
        graphics.setColor(0x555555);
        graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
        this.utilService.a(graphics, this.cf[7], 0, canvasHeight, 36, 1);
    }

    private void c(Graphics graphics) {
        PlayStage.V(graphics);
        this.utilService.a(graphics, this.cf[0], by, bz, 17, 1);
        this.utilService.a(graphics, "?".getBytes(), by + 30, bz, 17, 1);
        graphics.setColor(0x555555);
        graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
        this.utilService.a(graphics, this.cf[1], 0, canvasHeight, 36, 1);
        this.utilService.a(graphics, this.cf[2], canvasWidth, canvasHeight, 40, 1);
    }

    private void d(Graphics graphics) {
        PlayStage.U(graphics);
        int n = this.bN;
        if (this.bN > 5 && this.bN <= 17) {
            n = 6;
        } else if (this.bN > 17 && this.bN <= 30) {
            n = Constants.a == 0 ? 7 : 8;
        } else if (this.bN > 30) {
            n = 8;
        }
        if (this.at != null && this.at[n] != null) {
            graphics.drawImage(this.at[n], by, bz, 3);
        }
        if (Constants.a == 0) {
            if (++this.bN > 45) {
                this.at = null;
                if (Constants.forcedLocaleLanguageCode == 6 && Constants.C == -1) {
                    Constants.C = 0;
                    this.a(2, true);
                    return;
                }
                if (Constants.forcedLocaleLanguageCode != 6) {
                    Constants.C = Constants.forcedLocaleLanguageCode;
                }
                this.a(3, true);
                Constants.v = Constants.C;
                return;
            }
        } else if (++this.bN > 30) {
            this.at = null;
            if (Constants.forcedLocaleLanguageCode == 6) {
                this.a(2, true);
                return;
            }
            this.a(3, true);
            Constants.v = Constants.C;
        }
    }

    private void e(int n) {
        try {
            Thread.sleep(n * 3 * this.cF / this.cG);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void n() {
        this.v = null;
        this.w = null;
        System.gc();
    }

    private void o() {
        if (this.m != null) {
            return;
        }
        try {
            this.m = Image.createImage((String)"/img/title.png");
        }
        catch (Exception exception) {}
        System.gc();
    }

    private void p() {
        this.m = null;
        this.ab = null;
        System.gc();
    }

    private static void a(Graphics graphics, Image[] imageArray) {
        bw = by - (imageArray[0].getWidth() / 2 + imageArray[0].getWidth());
        bx = bz - (imageArray[0].getHeight() / 2 + imageArray[0].getHeight());
        int n = imageArray[0].getWidth();
        int n2 = imageArray[0].getHeight();
        int n3 = 0;
        while (n3 < 3) {
            int n4 = 0;
            while (n4 < 3) {
                graphics.drawImage(imageArray[n3 * 3 + n4], bw + n4 * n, bx + n3 * n2, 20);
                ++n4;
            }
            ++n3;
        }
    }

    private void e(Graphics graphics) {
        PlayStage.V(graphics);
        bw = by - (this.m.getWidth() / 6 + this.m.getWidth() / 3);
        bx = bz - (this.m.getHeight() / 6 + this.m.getHeight() / 3);
        graphics.drawImage(this.m, by, bz, 3);
        if (this.keyProcess_nState == 256) {
            @SuppressWarnings("unused")
            int n = 0;
            if (++this.R > 20) {
                this.R = 0;
            }
            if ((n = this.R) % 2 == 0) {
                this.utilService.a(graphics, this.ce[0], by, canvasHeight - 20, 33, 1);
            }
            if (this.bM != -4132 && ++this.bM > 7) {
                this.q();
                return;
            }
        }
    }

    private void q() {
        bu = 0;
        this.bq = PlayStage.S(512);
        chessEngine = null;
        switch (this.keyProcess_nState) {
            case 257: {
                this.bp = 0;
                break;
            }
            case 272: {
                this.bp = 1;
                break;
            }
            case 2048: {
                this.bp = 4;
                break;
            }
            case 2304: {
                this.bp = 4;
                break;
            }
            case 1280: {
                this.bp = 2;
                break;
            }
            case 1536: {
                this.bp = 3;
                break;
            }
            default: {
                this.bp = 0;
            }
        }
        this.bm = 0;
        this.o();
        this.bw();
        this.n();
        this.v = null;
        this.v = new Image[5];
        this.a("fm_0");
        this.v[0] = this.utilService.e(0);
        this.v[1] = this.utilService.e(1);
        this.v[3] = this.utilService.e(2);
        this.v[4] = this.utilService.e(3);
        this.utilService.unsetTheFileBytes();
        this.nullSomeVariables();
        this.b(0);
        this.ac(3);
        this.keyProcess_nState = 512;
        this.bM = 0;
        this.bD();
        this.l = null;
        Constants.L = false;
    }

    private void f(Graphics graphics) {
        if (this.bR == 0) {
            this.h(graphics);
            return;
        }
        int n = 0;
        this.e(graphics);
        int n2 = 0;
        if (this.bM != -4132 && ++this.bM > 2) {
            this.bM = -4132;
        }
        int n3 = 0;
        while (n3 < this.bq + 1) {
            n = 100 + n3 * 25;
            if (this.bp == n3) {
                graphics.setColor(0x8D8D8D);
                n2 = 40;
                Util.a(graphics, -5, n, 160, 20, 0x8D8D8D, 0, 0, 1, 6);
            } else {
                graphics.setColor(0x575757);
                n2 = 20;
                Util.a(graphics, -5, n, 140, 20, 0x575757, 0, 0, 1, 6);
            }
            if (!Constants.isMoreGamesOn) {
                if (n3 == 5) {
                    this.utilService.a(graphics, this.cf[6], n2, n - 6, 20, 1);
                } else {
                    this.utilService.a(graphics, this.cf[n3], n2, n - 6, 20, 1);
                }
            } else {
                this.utilService.a(graphics, this.cf[n3], n2, n - 6, 20, 1);
            }
            graphics.setColor(0x555555);
            graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
            this.utilService.a(graphics, this.cf[7], 0, canvasHeight, 36, 1);
            ++n3;
        }
    }

    private void r() {
        this.bQ = -4132;
        this.keyProcess_nState = 257;
        this.bs = 257;
        this.bq = PlayStage.S(this.keyProcess_nState);
        this.bp = Constants.D != 0 ? 1 : 0;
        this.ac(4);
        this.data_Text(17);
    }

    private void g(Graphics graphics) {
        int n = 0;
        this.e(graphics);
        int n2 = 0;
        if (this.bM != -4132 && ++this.bM > 100) {
            this.bM = 0;
        }
        int n3 = 0;
        while (n3 < this.bq + 1) {
            n = 100 + n3 * 25;
            if (this.bp == n3) {
                n2 = 40;
                Util.a(graphics, -5, n, 150, 20, 0x8D8D8D, 0, 0, 1, 6);
            } else {
                n2 = 20;
                Util.a(graphics, -5, n, 130, 20, 0x575757, 0, 0, 1, 6);
            }
            this.utilService.a(graphics, this.cf[n3], n2, n - 6, 20, 1);
            ++n3;
        }
        if (this.bQ == 1) {
            this.h(graphics);
        }
        if (this.cH) {
            if (this.bM < 30) {
                this.i(graphics);
                return;
            }
            bG = false;
            this.cH = false;
            this.bM = -4132;
            return;
        }
        graphics.setColor(0x555555);
        graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
        if (this.bQ != 1) {
            this.utilService.a(graphics, this.cf[2], 0, canvasHeight, 36, 1);
            this.utilService.a(graphics, this.cf[3], canvasWidth, canvasHeight, 40, 1);
        }
    }

    private void h(Graphics graphics) {
        int n = this.ce.length;
        int n2 = bz - (8 + 17 * n);
        int n3 = n2 - 22;
        int n4 = 22 + (8 + 17 * n);
        graphics.setColor(0x575757);
        Util.a(graphics, by, n3, 156, n4 - 4, 17);
        this.a(graphics, this.aq, by, n3, 160, n4, 17);
        int n5 = by - 80 + 3;
        int n6 = n3 + n4 - 22;
        graphics.setColor(0x212020);
        Util.a(graphics, n5, n6, 152, 19, 20);
        if (this.keyProcess_nState != 768) {
            this.utilService.a(graphics, this.cf[4], by - 75, n6 + 3, 20, 1);
            this.utilService.a(graphics, this.cf[5], by + 5, n6 + 3, 20, 1);
        } else {
            this.utilService.a(graphics, this.cf[8], by - 75, n6 + 3, 20, 1);
            this.utilService.a(graphics, this.cf[9], by + 5, n6 + 3, 20, 1);
        }
        graphics.setColor(0xDDDDDD);
        Constants.T = 0;
        this.bZ = n2 -= 12;
        this.a(this.ce, this.cy, this.cx, this.co);
    }

    private void i(Graphics graphics) {
        int n = this.ce.length;
        int n2 = bz - (8 + 17 * n);
        int n3 = n2 - 22;
        int n4 = 22 + 17 * n;
        graphics.setColor(0x575757);
        Util.a(graphics, by, n3, 156, n4 - 4, 17);
        this.a(graphics, this.aq, by, n3, 160, n4, 17);
        graphics.setColor(0xDDDDDD);
        Constants.T = 0;
        this.bZ = n2 -= 12;
        this.a(this.ce, this.cy, this.cx, this.co);
    }

    private void s() {
        this.keyProcess_nState = 258;
        this.bq = PlayStage.S(258);
        this.bp = 0;
        this.cI = false;
        Constants.H = -4132;
        this.aX();
    }

    private void j(Graphics graphics) {
        this.e(graphics);
        int n = bz - 95;
        graphics.setColor(0x212020);
        Util.a(graphics, by, n, 96, 19, 3);
        this.a(graphics, this.v[4], by, n, 100, 21, 3);
        this.utilService.a(graphics, this.cf[2], by, n, 3, 1);
        this.S(graphics);
        if (this.cI) {
            this.a(graphics, 9, 18);
        }
        graphics.setColor(0x555555);
        graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
        this.utilService.a(graphics, this.cf[4], 0, canvasHeight, 36, 1);
        this.utilService.a(graphics, this.cf[5], canvasWidth, canvasHeight, 40, 1);
    }

    private void t() {
        this.keyProcess_nState = 272;
        this.bs = 272;
        this.bq = PlayStage.S(272);
        this.bp = 0;
        Constants.L = false;
        this.ac(5);
    }

    private void k(Graphics graphics) {
        int n = 0;
        this.e(graphics);
        int n2 = 0;
        if (this.bM != -4132 && ++this.bM > 4) {
            this.bM = -4132;
        }
        int n3 = 0;
        while (n3 < this.bq) {
            n = 100 + n3 * 25;
            if (this.bp == n3) {
                n2 = 30;
                Util.a(graphics, -5, n, 190, 20, 0x8D8D8D, 0, 0, 1, 6);
            } else {
                n2 = 10;
                Util.a(graphics, -5, n, 170, 20, 0x575757, 0, 0, 1, 6);
            }
            this.utilService.a(graphics, this.cf[n3], n2, n - 6, 20, 1);
            ++n3;
        }
        graphics.setColor(0x555555);
        graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
        this.utilService.a(graphics, this.cf[4], 0, canvasHeight, 36, 1);
        this.utilService.a(graphics, this.cf[5], canvasWidth, canvasHeight, 40, 1);
    }

    private void u() {
        this.keyProcess_nState = 273;
        this.bq = PlayStage.S(273);
        this.bp = 0;
        this.ac(8);
        this.cO = -4132;
        this.cR = new int[3];
        this.T[0] = 1;
        try {
            this.cK = new Image[9];
            int n = 0;
            int n2 = 0;
            while (n2 < this.cN) {
                if (this.T[n2] == 0) {
                    this.a("char_talk");
                    switch (n2) {
                        case 0: {
                            n = 7;
                            break;
                        }
                        case 1: {
                            n = 6;
                            break;
                        }
                        case 2: {
                            n = 5;
                            break;
                        }
                        case 3: {
                            n = 4;
                            break;
                        }
                        case 4: {
                            n = 3;
                            break;
                        }
                        case 5: {
                            n = 2;
                            break;
                        }
                        case 6: {
                            n = 8;
                        }
                    }
                    this.cK[n2] = this.utilService.e(n);
                    this.utilService.unsetTheFileBytes();
                } else {
                    this.a("char_talk");
                    switch (n2) {
                        case 0: {
                            n = 7;
                            break;
                        }
                        case 1: {
                            n = 6;
                            break;
                        }
                        case 2: {
                            n = 5;
                            break;
                        }
                        case 3: {
                            n = 4;
                            break;
                        }
                        case 4: {
                            n = 3;
                            break;
                        }
                        case 5: {
                            n = 2;
                            break;
                        }
                        case 6: {
                            n = 8;
                        }
                    }
                    this.cK[n2] = this.utilService.e(n);
                    this.utilService.unsetTheFileBytes();
                    this.cM = Image.createImage((String)"/img/vs_grid.png");
                }
                ++n2;
            }
            this.cL = Image.createImage((String)"/img/vs_arrow.png");
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void v() {
        this.cR = null;
        this.cL = null;
        this.cK = null;
        System.gc();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void w() {
        if (this.cO != -4132) {
            int n = 0;
            int n2 = this.cR.length;
            if (++this.cO <= 4) {
                if (this.cQ) {
                    this.cR[2] = this.cO * this.cO * 4;
                    return;
                }
                this.cR[0] = -(this.cO * this.cO * 4);
                return;
            }
            if (this.cO <= 8) {
                if (this.cO == 5) {
                    this.bD();
                    this.b(17, false);
                    if (this.cQ) {
                        if (--this.bp < 0) {
                            this.bp = this.cN - 1;
                        }
                    } else if (++this.bp >= this.cN) {
                        this.bp = 0;
                    }
                    int n3 = 0;
                    while (n3 < n2) {
                        this.cR[n3] = this.cQ ? -63 : 63;
                        ++n3;
                    }
                    return;
                }
                n = this.cO - 5;
                int n4 = 0;
                while (n4 < n) {
                    if (this.cQ) {
                        int n5 = 2 - n4;
                        this.cR[n5] = this.cR[n5] + n * n * 2;
                    } else {
                        int n6 = n4;
                        this.cR[n6] = this.cR[n6] - n * n * 2;
                    }
                    ++n4;
                }
                return;
            }
            if (this.cO <= 12) {
                if (this.cO == 12) return;
                n = 14 - this.cO;
                if (n < 0) {
                    n = 0;
                }
                int n7 = 0;
                while (n7 < 3) {
                    if (this.cQ) {
                        int n8 = n7;
                        this.cR[n8] = this.cR[n8] + n * n;
                    } else {
                        int n9 = n7;
                        this.cR[n9] = this.cR[n9] - n * n;
                    }
                    ++n7;
                }
                return;
            }
            int n10 = 0;
            while (n10 < n2) {
                this.cR[n10] = 0;
                ++n10;
            }
            this.cO = -4132;
            return;
        }
        if (this.cP == -4132 || ++this.cP <= 20) return;
        this.cP = -4132;
    }

    private void l(Graphics graphics) {
        this.e(graphics);
        int n = bz - 125;
        graphics.setColor(0x212020);
        Util.a(graphics, by, n, 172, 23, 3);
        this.a(graphics, this.v[4], by, n, 176, 25, 3);
        this.utilService.a(graphics, this.cf[10], by, n - 5, 17, 1);
        PlayStage.a(graphics, by, bz, 176, 220, 3);
        int n2 = by - 88 + 19;
        Util.a(graphics, this.cL, n2, bz - 110 + (aU ? 8 : 6), 36, 7, 0, 0, 20);
        Util.a(graphics, this.cL, n2, bz + 110 - (aU ? 8 : 6), 36, 7, 0, 1, 36);
        int n3 = bz - 110 + 46;
        int n4 = by - 88 + 38;
        this.a(graphics, this.ap, by, n3 + 63 + 1, 160, 64, 3);
        graphics.setColor(0x373737);
        Util.a(graphics, by, n3 + 63, 156, 61, 3);
        int n5 = this.bp - 1;
        int n6 = 0;
        int n7 = 0;
        n7 = this.bp == 6 ? 9 : (this.bp == 7 ? 2 : (this.bp == 8 ? 1 : 8 - this.bp));
        int n8 = 0;
        while (n8 < 3) {
            Util.c(graphics, by, bz, 160, 190, 3);
            graphics.setColor(0xFFFFFF);
            int n9 = n3 + n8 * 63 + this.cR[n8];
            Util.a(graphics, n4, n9, 55, 55, 3);
            graphics.setColor(n8 == 1 ? 0x373737 : 0);
            Util.a(graphics, n4, n9, 53, 53, 3);
            n6 = n5 < 0 ? this.cN - 1 : (n5 >= this.cN ? 0 : n5);
            Util.c(graphics, n4, n9, 53, 53, 3);
            if (this.T[n6] == 0) {
                graphics.drawImage(this.cK[n6], n4, n9, 3);
                graphics.drawImage(this.cM, n4, n9, 3);
            } else {
                graphics.drawImage(this.cK[n6], n4, n9, 3);
            }
            int n10 = this.bp + 1;
            String string = "   " + n10;
            if (this.cO == -4132 && n8 == 1) {
                if (this.T[n6] == 1) {
                    this.utilService.a(graphics, this.cf[n7 - 1], by + 22, n9 - 3, 33, 1);
                    this.utilService.a(graphics, this.cf[9], by + 22 - 5, n9 + 3, 17, 1);
                    this.utilService.a(graphics, string.getBytes(), by + 22 + this.cf[9].length, n9 + 3, 17, 1);
                } else {
                    this.utilService.a(graphics, "???".getBytes(), by + 22, n9 - 3, 33, 1);
                    this.utilService.a(graphics, this.cf[9], by + 22 - 5, n9 + 3, 17, 1);
                    this.utilService.a(graphics, "   ?".getBytes(), by + 22 + this.cf[9].length, n9 + 3, 17, 1);
                }
            }
            ++n5;
            ++n8;
        }
        graphics.setColor(0x555555);
        graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
        graphics.setColor(150, 200, 200);
        graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
        this.utilService.a(graphics, this.cf[11], 0, canvasHeight, 36, 1);
        this.utilService.a(graphics, this.cf[12], canvasWidth, canvasHeight, 40, 1);
        if (this.cP != -4132) {
            this.m(graphics);
        }
    }

    private void m(Graphics graphics) {
        int n = this.ce.length;
        int n2 = n * 23;
        System.out.println("len len == " + n);
        System.out.println("height == " + n2);
        int n3 = 0;
        int n4 = 0;
        int n5 = this.cP;
        int n6 = bz - n / 2;
        if (n5 <= 3) {
            n3 = 186 * n5 * n5 / 9;
            n4 = n2 * n5 * n5 / 9;
            PlayStage.a(graphics, by, n6, n3, n4, 17);
            return;
        }
        if (n5 < 15) {
            PlayStage.a(graphics, by, n6, 186, n2, 17);
            graphics.setColor(0xFFFFFF);
            int n7 = 0;
            while (n7 < (this.cy != this.co - 1 ? this.cx : (this.ch % this.cx == 0 ? this.cx : this.ch % this.cx))) {
                this.utilService.a(graphics, this.ce[n7], by, n6 + 10 + n7 * (this.utilService.o[0] + 2), 17, 0);
                ++n7;
            }
            return;
        }
        if (n5 >= 18) {
            return;
        }
        n3 = 186 * (18 - n5) * (18 - n5) / 9;
        n4 = n2 * (18 - n5) * (18 - n5) / 9;
        PlayStage.a(graphics, by, n6, n3, n4, 17);
    }

    private void x() {
        int n = this.G + this.H;
        this.z = (this.z * (n - 1) + ba) / n;
    }

    private void y() {
        this.keyProcess_nState = bu == 200 ? 210 : 1280;
        this.bq = PlayStage.S(1280);
        this.bp = 1;
        this.nullSomeVariables();
        this.b(0);
        this.ac(12);
    }

    private void d_option(Graphics graphics) {
        block23: {
            int n;
            block24: {
                block22: {
                    if (this.keyProcess_nState == 1280) {
                        this.e(graphics);
                        if (++this.cE > 500) {
                            this.cE = 0;
                        }
                    } else {
                        this.D(graphics);
                    }
                    int n2 = bz;
                    int n3 = bz - n2 / 2;
                    n = 0;
                    int n4 = 160;
                    if (Constants.E != 1) {
                        ++n;
                        n4 -= 30;
                    }
                    if (!Constants.L) {
                        ++n;
                        n4 -= 30;
                    }
                    PlayStage.a(graphics, by, n3 - 40, 100, 30, 17);
                    this.utilService.a(graphics, this.cf[13], by, n3 - 30, 17, 1);
                    PlayStage.a(graphics, by, n3, 176, n4 + 30, 17);
                    System.out.println("PlayStage.d_option() height = " + n4);
                    graphics.setColor(0, 0, 255);
                    graphics.fillRect(by - 88 + 6, n3 - 24 + 30 * this.bp, 164, 27);
                    int n5 = 0;
                    while (n5 < 4) {
                        this.utilService.a(graphics, this.cf[n5], by - 70, bz - 70 + 30 * n5, 20, 1);
                        ++n5;
                    }
                    n5 = 0;
                    while (n5 < 6 - n) {
                        if (n5 == this.bp - 1) {
                            if (Constants.forcedLocaleLanguageCode == 6) {
                                if (this.cE % 3 == 1) {
                                    this.utilService.a(graphics, "<<".getBytes(), by - 40, bz - 60 + 30 * n5, 20, 1);
                                    this.utilService.a(graphics, ">>".getBytes(), by + 80, bz - 60 + 30 * n5, 24, 1);
                                }
                            } else if (this.cE % 3 == 1 && n5 != 0) {
                                this.utilService.a(graphics, "<<".getBytes(), by - 40, bz - 60 + 30 * n5, 20, 1);
                                this.utilService.a(graphics, ">>".getBytes(), by + 80, bz - 60 + 30 * n5, 24, 1);
                            }
                        } else if (Constants.forcedLocaleLanguageCode == 6) {
                            this.utilService.a(graphics, "<<".getBytes(), by - 40, bz - 60 + 30 * n5, 20, 1);
                            this.utilService.a(graphics, ">>".getBytes(), by + 80, bz - 60 + 30 * n5, 24, 1);
                        } else if (n5 != 0) {
                            this.utilService.a(graphics, "<<".getBytes(), by - 40, bz - 60 + 30 * n5, 20, 1);
                            this.utilService.a(graphics, ">>".getBytes(), by + 80, bz - 60 + 30 * n5, 24, 1);
                        }
                        ++n5;
                    }
                    this.utilService.a(graphics, this.cf[14 + Constants.C], by + 20, bz - 60 + 0, 17, 1);
                    this.utilService.a(graphics, this.cf[20 + Constants.soundVolumeLevel], by + 20, bz - 60 + 30, 17, 1);
                    this.utilService.a(graphics, this.cf[6 + Constants.E], by + 20, bz - 60 + 60, 17, 1);
                    this.utilService.a(graphics, this.cf[10 + Constants.B], by + 20, bz - 60 + 90, 17, 1);
                    if (Constants.E != 1) break block22;
                    this.utilService.a(graphics, this.cf[4], by - 70, bz - 70 + 120, 20, 1);
                    this.utilService.a(graphics, this.cf[10 + Constants.F], by + 20, bz - 60 + 120, 17, 1);
                    if (!Constants.L) break block23;
                    this.utilService.a(graphics, this.cf[5], by - 70, bz - 70 + 150, 20, 1);
                    if (this.bp == 6) break block24;
                    this.utilService.a(graphics, this.cf[8 + Constants.w], by + 20, bz - 60 + 30 * (5 - n), 17, 1);
                    break block23;
                }
                if (!Constants.L) break block23;
                this.utilService.a(graphics, this.cf[5], by - 70, bz - 70 + 120, 20, 1);
                if (this.bp == 5) {
                    // empty if block
                }
            }
            this.utilService.a(graphics, this.cf[8 + Constants.w], by + 20, bz - 60 + 30 * (5 - n), 17, 1);
        }
        graphics.setColor(0x555555);
        graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
        this.utilService.a(graphics, this.cf[12], canvasWidth, canvasHeight, 40, 1);
    }

    private void f(int n) {
        Constants.w = n == -3 || n == 52 ? (Constants.w ^= 1) : (Constants.w ^= 1);
        ChessEngine.a(this.L());
    }

    private void z() {
        try {
            this.A();
        }
        catch (Exception exception) {}
        this.keyProcess_nState = bu == 200 ? 220 : 1536;
        this.cT = 0;
        this.bp = 0;
        this.bq = PlayStage.S(1536);
        this.ad(18);
        this.v = null;
    }

    private void A() {
        try {
            if (this.ao == null) {
                this.ao = Image.createImage((String)"/img/h_arrow.png");
            }
            if (Constants.E == 0) {
                this.B();
                return;
            }
            if (this.aD == null) {
                this.aD = new Image[6];
                this.a("pieceblack");
                int n = 0;
                while (n < this.aD.length) {
                    this.aD[n] = this.utilService.e(n);
                    ++n;
                }
                this.utilService.unsetTheFileBytes();
                return;
            }
        }
        catch (Exception exception) {}
    }

    private void B() {
        Image image = null;
        int n = 0;
        int n2 = 0;
        this.a("boardPiece");
        int n3 = 6;
        while (n3 <= 11) {
            if (this.aB[n3] == null) {
                image = this.utilService.e(n3);
                if (n3 > 5) {
                    n = image.getWidth() >> 1;
                    n2 = image.getHeight() >> 1;
                }
                this.aB[n3] = new GameSpritesManager(image, n, n2);
            }
            System.gc();
            ++n3;
        }
        this.utilService.unsetTheFileBytes();
    }

    private void C() {
        this.ao = null;
        if (is3D) {
            int n = 6;
            while (n <= 11) {
                this.aB[n] = null;
                ++n;
            }
        } else {
            this.aD = null;
        }
        if (this.keyProcess_nState != 220) {
            this.aD = null;
        }
        System.gc();
    }

    private void D() {
        this.cT = 1;
        this.dateLong_HelpText(1);
        this.ad(19);
        this.bq = this.cf.length - 1;
        this.cU = true;
        this.bD();
        this.b(0, false);
    }

    private void E() {
        this.bq = PlayStage.S(2);
        this.v = this.bp == 5 ? new Image[2] : new Image[3];
        try {
            this.a("help_show");
            int n = 0;
            while (n < 17) {
                this.v[n] = this.utilService.e(n);
                ++n;
            }
            this.utilService.unsetTheFileBytes();
        }
        catch (Exception exception) {}
        this.dateLong_HelpText(2);
        this.cT = 2;
        this.bM = 0;
        this.bp = 0;
    }

    private void F() {
        this.cU = false;
        this.bp = 0;
        this.bq = PlayStage.S(3);
        this.cT = 3;
        this.dateLong_HelpText(3);
        this.ad(20);
    }

    private void o(Graphics graphics) {
        if (this.keyProcess_nState == 1536) {
            this.e(graphics);
        } else {
            this.D(graphics);
        }
        int n = Constants.t;
        int n2 = bz;
        int n3 = bz - n2 / 2;
        PlayStage.a(graphics, by, n3 - 40, 100, 30, 17);
        this.utilService.a(graphics, this.cf[0], by, n3 - 30, 17, 1);
        PlayStage.a(graphics, by, bz + 10, n, n2 + 30, 3);
        int n4 = 0;
        int n5 = bz - 22;
        if (++this.cV > 75) {
            this.cV = -75;
        }
        switch (this.cT) {
            case 0: {
                int n6 = 0;
                while (n6 < Constants.l + 1) {
                    if (n6 == 1 && this.cf[2].length * 8 <= 150) {
                        this.utilService.a(graphics, this.cf[n6 + 1], by, n5 + n6 * 30, 17, 1);
                    } else {
                        this.utilService.a(graphics, this.cf[n6 + 1], by, n5 + n6 * 30, 17, 1);
                    }
                    ++n6;
                }
                Util.a(graphics, this.ao, aU ? by - by / 2 - 20 : by - by / 2 + 2 - 20, n5 + this.bp * 30, 10, 12, 0, 1, 20);
                Util.a(graphics, this.ao, aU ? by + by / 2 + 20 : by + by / 2 - 2 + 20, n5 + this.bp * 30, 10, 12, 0, 0, 24);
                graphics.setColor(0xFFFFFF);
                graphics.drawLine(by - by / 2, n5 + this.bp * 30 + 15, by + by / 2, n5 + this.bp * 30 + 15);
                graphics.setColor(0x555555);
                graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
                this.utilService.a(graphics, this.cf[4], 0, canvasHeight, 36, 1);
                this.utilService.a(graphics, this.cf[5], canvasWidth, canvasHeight, 40, 1);
                return;
            }
            case 1: {
                this.cB = 0;
                this.cC = this.cz;
                switch (this.cz) {
                    case 0: {
                        int n7 = 0;
                        while (n7 < (this.cB != this.cp - 1 ? this.cx : (this.ci % this.cx == 0 ? this.cx : this.ci % this.cx))) {
                            this.utilService.a(graphics, this.cg[this.cC + 6][this.cB * this.cx + n7], by - 80, this.bZ + n7 * (this.utilService.o[0] + 2), 20, 0);
                            ++n7;
                        }
                        break;
                    }
                    case 1: {
                        int n8 = 0;
                        while (n8 < (this.cB != this.cq - 1 ? this.cx : (this.cj % this.cx == 0 ? this.cx : this.cj % this.cx))) {
                            this.utilService.a(graphics, this.cg[this.cC + 6][this.cB * this.cx + n8], by - 80, this.bZ + n8 * (this.utilService.o[0] + 2), 20, 0);
                            ++n8;
                        }
                        break;
                    }
                    case 2: {
                        int n9 = 0;
                        while (n9 < (this.cB != this.cr - 1 ? this.cx : (this.ck % this.cx == 0 ? this.cx : this.ck % this.cx))) {
                            this.utilService.a(graphics, this.cg[this.cC + 6][this.cB * this.cx + n9], by - 80, this.bZ + n9 * (this.utilService.o[0] + 2), 20, 0);
                            ++n9;
                        }
                        break;
                    }
                    case 3: {
                        int n10 = 0;
                        while (n10 < (this.cB != this.cs - 1 ? this.cx : (this.cl % this.cx == 0 ? this.cx : this.cl % this.cx))) {
                            this.utilService.a(graphics, this.cg[this.cC + 6][this.cB * this.cx + n10], by - 80, this.bZ + n10 * (this.utilService.o[0] + 2), 20, 0);
                            ++n10;
                        }
                        break;
                    }
                }
                if (this.cz == 0) {
                    Util.a(graphics, this.ao, aU ? by + by / 2 : by + by / 2 - 2, this.bZ - 15, 10, 12, 0, 1, 20);
                } else if (this.cz == this.cA - 1) {
                    Util.a(graphics, this.ao, aU ? by - by / 2 : by - by / 2 + 2, this.bZ - 15, 10, 12, 0, 0, 24);
                } else {
                    Util.a(graphics, this.ao, aU ? by + by / 2 : by + by / 2 - 2, this.bZ - 15, 10, 12, 0, 1, 20);
                    Util.a(graphics, this.ao, aU ? by - by / 2 : by - by / 2 + 2, this.bZ - 15, 10, 12, 0, 0, 24);
                }
                graphics.setColor(0x555555);
                graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
                this.utilService.a(graphics, this.cf[this.cC + 1], by, this.bZ - 15, 17, 1);
                this.utilService.a(graphics, this.cf[5], canvasWidth, canvasHeight, 40, 1);
                return;
            }
            case 2: {
                n4 = n3 + 30;
                if (Constants.E == 0) {
                    this.aB[this.bp + 6].a(graphics, by, n4);
                } else {
                    graphics.drawImage(this.aD[this.bp], by, n4 + 17, 33);
                }
                System.out.println("PlayStage.d_help() nMenuFlay = " + this.bp);
                this.cC = this.cz + 4;
                if (this.cz < this.cp) {
                    int n11 = 0;
                    while (n11 < (this.cz != this.cp - 1 ? this.cx : (this.ci % this.cx == 0 ? this.cx : this.ci % this.cx))) {
                        this.utilService.a(graphics, this.cg[10][this.cz * this.cx + n11], by - 80, this.bZ + n11 * (this.utilService.o[0] + 2), 20, 0);
                        ++n11;
                    }
                } else if (this.cz >= this.cp && this.cz < this.cp + this.cq) {
                    int n12 = 0;
                    while (n12 < (this.cz - this.cp != this.cq - 1 ? this.cx : (this.cj % this.cx == 0 ? this.cx : this.cj % this.cx))) {
                        this.utilService.a(graphics, this.cg[11][(this.cz - this.cp) * this.cx + n12], by - 80, this.bZ + n12 * (this.utilService.o[0] + 2), 20, 0);
                        ++n12;
                    }
                } else if (this.cz >= this.cp + this.cq && this.cz < this.cp + this.cq + this.cr) {
                    int n13 = 0;
                    while (n13 < (this.cz - (this.cp + this.cq) != this.cr - 1 ? this.cx : (this.ck % this.cx == 0 ? this.cx : this.ck % this.cx))) {
                        this.utilService.a(graphics, this.cg[12][(this.cz - (this.cp + this.cq)) * this.cx + n13], by - 80, this.bZ + n13 * (this.utilService.o[0] + 2), 20, 0);
                        ++n13;
                    }
                } else if (this.cz >= this.cp + this.cq + this.cr && this.cz < this.cp + this.cq + this.cr + this.cs) {
                    int n14 = 0;
                    while (n14 < (this.cz - (this.cp + this.cq + this.cr) != this.cs - 1 ? this.cx : (this.cl % this.cx == 0 ? this.cx : this.cl % this.cx))) {
                        this.utilService.a(graphics, this.cg[13][(this.cz - (this.cp + this.cq + this.cr)) * this.cx + n14], by - 80, this.bZ + n14 * (this.utilService.o[0] + 2), 20, 0);
                        ++n14;
                    }
                } else if (this.cz >= this.cp + this.cq + this.cr + this.cs && this.cz < this.cp + this.cq + this.cr + this.cs + this.ct) {
                    int n15 = 0;
                    while (n15 < (this.cz - (this.cp + this.cq + this.cr + this.cs) != this.ct - 1 ? this.cx : (this.cm % this.cx == 0 ? this.cx : this.cm % this.cx))) {
                        this.utilService.a(graphics, this.cg[14][(this.cz - (this.cp + this.cq + this.cr + this.cs)) * this.cx + n15], by - 80, this.bZ + n15 * (this.utilService.o[0] + 2), 20, 0);
                        ++n15;
                    }
                } else if (this.cz >= this.cp + this.cq + this.cr + this.cs + this.ct && this.cz < this.cp + this.cq + this.cr + this.cs + this.ct + this.cu) {
                    int n16 = 0;
                    while (n16 < (this.cz - (this.cp + this.cq + this.cr + this.cs + this.ct) != this.cu - 1 ? this.cx : (this.cn % this.cx == 0 ? this.cx : this.cn % this.cx))) {
                        this.utilService.a(graphics, this.cg[15][(this.cz - (this.cp + this.cq + this.cr + this.cs + this.ct)) * this.cx + n16], by - 80, this.bZ + n16 * (this.utilService.o[0] + 2), 20, 0);
                        ++n16;
                    }
                }
                if (this.cz == 0) {
                    Util.a(graphics, this.ao, aU ? by + by / 2 : by + by / 2 - 2, n4, 10, 12, 0, 1, 20);
                } else if (this.cz == 5) {
                    Util.a(graphics, this.ao, aU ? by - by / 2 : by - by / 2 + 2, n4, 10, 12, 0, 0, 24);
                } else {
                    Util.a(graphics, this.ao, aU ? by + by / 2 : by + by / 2 - 2, n4, 10, 12, 0, 1, 20);
                    Util.a(graphics, this.ao, aU ? by - by / 2 : by - by / 2 + 2, n4, 10, 12, 0, 0, 24);
                }
                graphics.setColor(0x555555);
                graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
                this.utilService.a(graphics, this.cf[5], canvasWidth, canvasHeight, 40, 1);
                return;
            }
            case 3: {
                if (!this.cU) {
                    n5 = bz - 50;
                    int n17 = this.cf.length;
                    int n18 = 0;
                    while (n18 < n17 - 3) {
                        this.utilService.a(graphics, this.cf[n18 + 1], by, n5 + 20 * n18, 17, 1);
                        ++n18;
                    }
                    Util.a(graphics, this.ao, aU ? by - by / 2 - 20 : by - by / 2 + 2 - 20, n5 + this.bp * 20, 10, 12, 0, 1, 20);
                    Util.a(graphics, this.ao, aU ? by + by / 2 + 20 : by + by / 2 - 2 + 20, n5 + this.bp * 20, 10, 12, 0, 0, 24);
                    graphics.setColor(0xFFFFFF);
                    graphics.drawLine(by - by / 2, n5 + this.bp * 20 + 15, by + by / 2, n5 + this.bp * 20 + 15);
                    graphics.setColor(0x555555);
                    graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
                    this.utilService.a(graphics, this.cf[7], 0, canvasHeight, 36, 1);
                } else {
                    graphics.setColor(0x555555);
                    graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
                    if (this.bp < 3) {
                        this.a(this.cg[this.bp + 3], this.cy, this.cx, this.co);
                    } else {
                        this.a(this.cg[this.bp - 3], this.cy, this.cx, this.co);
                    }
                }
                this.utilService.a(graphics, this.cf[8], canvasWidth, canvasHeight, 40, 1);
            }
        }
    }

    private void G() {
        this.Z(20);
        this.d(21);
        System.out.println("aaaaaaaaaaaaaa");
        this.keyProcess_nState = 2048;
        this.bp = 0;
        this.cW = 0;
    }

    private void p(Graphics graphics) {
        int n = by;
        int n2 = bz - 100;
        this.e(graphics);
        PlayStage.a(graphics, n, n2, 176, 220, 17);
        this.bZ = n2 + 10;
        Constants.T = 1;
        this.a(this.ce, this.cy, this.cx, this.co);
        graphics.setColor(0x555555);
        graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
        this.utilService.a(graphics, this.cf[0], canvasWidth, canvasHeight, 40, 1);
    }

    private void q(Graphics graphics) {
        PlayStage.V(graphics);
        graphics.setColor(0xFFFFFF);
        graphics.drawString("Inquiry", by, bz, 17);
    }

    private void H() {
        this.p();
        this.bw();
        this.bD();
        this.n();
        is3D = Constants.E != 0;
        this.aY = 1;
        this.nullSomeVariables();
        this.b(3);
        this.c(1);
        this.d(41);
        Constants.H = -4132;
        bv = -4132;
        ChessR.j = -4132;
        bI = false;
        ChessR.c = null;
        this.bJ = null;
        bK = false;
        bL = 0;
        if (chessEngine == null) {
            chessEngine = new ChessEngine();
        }
        this.bJ = null;
        ChessR.c = null;
        ChessR.t = false;
        if (!this.h) {
            this.l = new Vector();
            if (i) {
                this.bA();
            }
            chessEngine = null;
            chessEngine = new ChessEngine();
            ChessR.k = 0;
            ChessEngine.h();
            ChessEngine.a(this.L());
            ba = 0;
            j = false;
        } else {
            if (this.l == null) {
                this.l = new Vector();
            }
            j = ChessEngine.b(1);
        }
        ChessR.k = 0;
        PlayStage.j();
        PlayStage.k();
        System.arraycopy(ChessEngine.a, 0, ChessR.o, 0, 64);
        ChessR.k = 1;
        audioService.stopSound();
        bb = -4132;
        this.ez = false;
        ChessR.r = 0;
        ChessR.s = 0;
        Constants.G = 0;
        this.aF();
        ew = false;
        ChessR.e = 3;
        ChessR.f = 1;
        this.X();
        if (Constants.L) {
            this.bm = 0;
        }
        this.W = false;
        dK = false;
        this.dI = -4132;
        et = new Vector();
        this.dX = false;
        Constants.f = false;
        this.a(259, true);
    }

    private void I() {
        this.keyProcess_nState = 624;
        try {
            this.R = Util.d(1, 6);
            this.R = 3;
            this.cX = new SpriteAnimator("/ea_" + this.R + ".dpr");
            if (this.R == 3 || this.R == 6 || this.R == 5) {
                this.aH = new SpriteAnimator("/" + this.R + "effect.dpr");
            }
            int n = this.cX.d.length - 1;
            int n2 = 0;
            while (n2 < n) {
                this.cX.d[0][n2] = 0;
                this.cX.e[0][n2] = 0;
                ++n2;
            }
            this.x = this.ap;
            this.cX.b();
            this.cY = new Image[3];
            n = this.cY.length;
            this.a("boardPiece");
            n2 = 0;
            while (n2 < n) {
                this.cY[n2] = this.utilService.e(Util.d(0, 8) + 6);
                ++n2;
            }
            this.utilService.unsetTheFileBytes();
            this.nullSomeVariables();
            this.b(3);
            this.d(34);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void J() {
        this.cX = null;
        this.cY = null;
        this.aH = null;
        this.x = null;
        System.gc();
    }

    private void r(Graphics graphics) {
        PlayStage.V(graphics);
        int n = bz - 93 + 15;
        int n2 = n - 22;
        graphics.setColor(0x575757);
        Util.a(graphics, by, n2, 156, 111 + this.ar.getHeight() + 10, 17);
        this.a(graphics, this.aq, by, n2, 160, 115 + this.ar.getHeight() + 10, 17);
        int n3 = by - 80 + 3;
        int n4 = n2 + 115 - 22;
        graphics.setColor(0x212020);
        Util.a(graphics, n3, n4, 152, 17, 20);
        this.a(graphics, this.ar, n3, n4, 154, 20, 20);
        Util.a(graphics, n3, n4 + 21, 152, 17, 20);
        this.a(graphics, this.ar, n3, n4 + 21, 154, 20, 20);
        int n5 = n2 + 57;
        graphics.drawImage(this.cY[1], by + 40 - 10, n5, 3);
        graphics.drawImage(this.cY[2], by + 40 + 10, n5, 3);
        graphics.drawImage(this.cY[0], by + 40, n5 + 7, 3);
        this.cX.a();
        if (this.cX.g) {
            this.cX.b();
        }
        this.cX.a(graphics, n3 + 5, n4 - 5);
        if (this.R == 3 || this.R == 6 || this.R == 5) {
            this.aH.a();
            if (this.aH.g) {
                this.aH.b();
            }
            this.aH.a(graphics, n3 + 5, n4 - 5);
        }
        this.utilService.a(graphics, this.cf[1], n3 + 5, n4 + 5, 20, 1);
        this.utilService.a(graphics, this.cf[2], n3 + 5, n4 + 26, 20, 1);
        int n6 = by + 80;
        graphics.setColor(0);
        graphics.fillRect(n6, n2, canvasWidth - n6, 115);
        graphics.fillRect(0, n2, canvasWidth - n6, 115);
        graphics.setColor(0x212020);
        Util.a(graphics, by, n2 - 5, 76, 19, 33);
        this.a(graphics, this.x, by, n2 - 5, 80, 21, 33);
        this.utilService.a(graphics, this.cf[0], by, n2 - 22, 17, 1);
    }

    private void K() {
        this.bD();
        this.b(20, false);
        this.nullSomeVariables();
        this.b(0);
        this.q();
        this.bq = PlayStage.S(512);
        this.bp = 0;
    }

    private int L() {
        if (Constants.L) {
            int n = this.Y[Constants.w + 1][this.U][this.ae];
            this.E = n + 1;
            return n;
        }
        return this.E;
    }

    private void M() {
        this.bD();
        this.br();
        this.bu();
        this.bt();
        this.v();
        Constants.M = false;
        this.I();
        Constants.G = 0;
        this.aS |= 4;
        System.out.println("3333333333333333333333333333333333");
    }

    public static void a(int n) {
        int n2 = Q.length;
        if (P + 1 >= n2) {
            return;
        }
        PlayStage.Q[PlayStage.P++] = n;
    }

    private static int N() {
        int n = 0;
        if (Q[0] == 0) {
            n = 0;
        } else {
            n = Q[--P];
            PlayStage.Q[PlayStage.P] = 0;
        }
        return n;
    }

    public static void a() {
        int n = 0;
        while (n < Q.length) {
            PlayStage.Q[n] = 0;
            ++n;
        }
        P = 0;
    }

    private void O() {
        int n = PlayStage.N();
        System.out.println("PlayStage.EventAction()_event = " + n);
        switch (n) {
            case 666: {
                this.P();
                return;
            }
            case 44: {
                this.d();
                return;
            }
            case 20: {
                return;
            }
            case 1000: {
                if (Constants.L) {
                    this.c();
                }
            }
            case 2000: 
            case 3000: {
                this.j(n);
                return;
            }
            case 888: {
                this.S();
                return;
            }
            case 40: {
                this.ak();
                return;
            }
        }
        if (bL != 0 && bk != 2) {
            PlayStage.h();
        }
        ChessR.c();
    }

    private void P() {
        bu = 666;
        if (Constants.E == 1 && Constants.F == 1) {
            this.aF.b();
            this.aG.b();
        }
    }

    private void Q() {
        try {
            this.da = new Image[3];
            this.db = 0;
            this.a("getitem");
            this.cZ = Constants.C == 0 || Constants.C == 1 ? this.utilService.e(3) : this.utilService.e(3 + Constants.C - 1);
            int n = 0;
            while (n < this.da.length) {
                this.da[n] = this.utilService.e(n);
                ++n;
            }
            this.utilService.unsetTheFileBytes();
            this.data_Text(21);
            if (!this.du) {
                n = Util.d(0, 100);
                this.dc = n < 10 ? 0 : (n < 20 ? 1 : (n < 60 ? 2 : 3));
            }
            this.v = new Image[2];
            this.a("i_icon");
            this.v[0] = this.utilService.e(this.dc);
            this.utilService.unsetTheFileBytes();
            this.d(37);
        }
        catch (Exception exception) {}
        System.gc();
    }

    private void R() {
        this.cZ = null;
        this.da = null;
        this.x = null;
    }

    private void S() {
        this.bD();
        this.b(20, false);
        this.Q();
        int n = this.dc;
        this.aw[n] = this.aw[n] + 1;
        bu = 888;
    }

    private void T() {
        this.R();
        this.O();
    }

    private void s(Graphics graphics) {
        if (this.db < 20) {
            int n = by - 15;
            int n2 = bz + 30;
            int n3 = this.db - 1 > 2 ? 2 : this.db - 1;
            if (n3 < 0) {
                n3 = 0;
            }
            graphics.drawImage(this.da[n3], n, n2, 36);
            if (this.db >= 7) {
                int n4 = this.db - 7;
                int n5 = 0;
                if (n4 == 0) {
                    this.b(9, false);
                    n5 = -15;
                } else {
                    n5 = n4 == 1 ? -29 : (n4 == 2 ? -44 : -48 - (aT & 1));
                }
                graphics.drawImage(this.cZ, n + 15, n2 + n5, 33);
                return;
            }
        } else {
            this.a(graphics, this.db - 20, 18);
        }
    }

    @SuppressWarnings({ "unchecked" })
    private void U() {
        bu = 110;
        this.bn();
        de = 0;
        dd = new Vector();
        int n = 0;
        while (n < 2) {
            int n2 = 27 + 8 * n;
            int n3 = 28 + 8 * n;
            if (ChessR.m[n2] == 0) {
                dd.addElement(String.valueOf(n2));
            }
            if (ChessR.m[n3] == 0) {
                dd.addElement(String.valueOf(n3));
            }
            ++n;
        }
        if (dd.size() == 0 || j) {
            dd = null;
            bu = 2;
            if (j) {
                this.data_Text(25);
            } else {
                this.data_Text(24);
            }
            this.d(41);
            this.W();
            return;
        }
        this.dJ = Util.GetImageByAssetName("makepiece");
    }

    private void V() {
        bu = 2;
        dd = null;
        this.dJ = null;
        this.d(41);
        System.gc();
    }

    private void k_makePiece(int n) {
        int n2 = dd.size();
        System.out.println("PlayStage.k_makePiece() length =" + n2);
        switch (n) {
            case -3: 
            case -1: 
            case 50: 
            case 52: {
                if (--de >= 0) break;
                de = n2 - 1;
                break;
            }
            case -4: 
            case -2: 
            case 54: 
            case 56: {
                if (++de < n2) break;
                de = 0;
                break;
            }
            case -6: 
            case -5: 
            case 53: {
                int n3 = Integer.parseInt(dd.elementAt(de).toString());
                this.bD();
                this.b(11, false);
                ++ba;
                ChessR.e = n3 & 7;
                ChessR.f = n3 >>> 3;
                int n4 = this.bp;
                this.aw[n4] = this.aw[n4] - 1;
                this.bJ = null;
                this.k(n3);
                break;
            }
            case -7: {
                this.V();
            }
        }
        System.out.println("PlayStage.k_makePiece() _nMakePieceCursorIndex= " + de);
    }

    private void W() {
        this.bt = bu;
        bu = 170;
        this.R = 0;
    }

    private void t(Graphics graphics) {
        if (this.a(graphics, ++this.R, 18)) {
            bu = this.bt;
        }
    }

    private void u(Graphics graphics) {
        if (this.T(graphics)) {
            bu = this.bt;
        }
    }

    public final void b() {
        this.X();
        if (ChessR.t) {
            return;
        }
        ChessEngine.d();
        bu = 2;
        this.ez = false;
    }

    private void X() {
        LittleEndianInt[] iArray = PlayStage.i();
        if (iArray == null) {
            return;
        }
        int n = iArray.length;
        int n2 = ChessR.g + ChessR.h * 8;
        if (bK) {
            int n3 = 0;
            int[] nArray = new int[n];
            int n4 = 0;
            while (n4 < iArray.length) {
                if (iArray[n4].a == n2) {
                    nArray[n3++] = iArray[n4].b;
                }
                ++n4;
            }
            if (n3 == 0) {
                return;
            }
            this.N = new int[n3];
            this.M = n3;
            System.arraycopy(nArray, 0, this.N, 0, n3);
        } else {
            this.N = new int[n];
            this.M = n;
            int n5 = 0;
            while (n5 < n) {
                this.N[n5] = iArray[n5].a;
                ++n5;
            }
        }
        this.Y();
        this.O = 0;
    }

    private void Y() {
        int n;
        int n2;
        if (this.N == null) {
            return;
        }
        int n3 = this.N.length;
        int n4 = 0;
        while (n4 < n3 - 1) {
            n2 = n4 + 1;
            while (n2 < n3) {
                if (this.N[n4] < this.N[n2]) {
                    n = this.N[n4];
                    this.N[n4] = this.N[n2];
                    this.N[n2] = n;
                }
                ++n2;
            }
            ++n4;
        }
        int[] nArray = new int[n3];
        n2 = 0;
        while (n2 < n3) {
            nArray[n2] = -1;
            ++n2;
        }
        n2 = 1;
        nArray[0] = this.N[0];
        n = 1;
        while (n < n3) {
            if (nArray[n2 - 1] != this.N[n]) {
                nArray[n2++] = this.N[n];
            }
            ++n;
        }
        this.N = null;
        this.N = new int[n2];
        System.arraycopy(nArray, 0, this.N, 0, n2);
        this.M = n2;
    }

    private void Z() {
        if (++this.O >= this.M) {
            this.O = 0;
        }
        ChessR.e = this.N[this.O] & 7;
        ChessR.f = this.N[this.O] >>> 3;
    }

    private void v(Graphics graphics) {
        if (ChessEngine.d && bu >= 2 && bu <= 9 || bu == 158) {
            graphics.drawImage(this.aZ[aT % 5], by, bz, 3);
        }
    }

    private void aa() {
        this.df = null;
        System.gc();
    }

    private void ab() {
        if (!this.ek) {
            ++this.U;
        }
        this.ek = false;
        this.ae = 0;
        this.Z = 0;
        this.n();
        this.bm = 0;
    }

    private void w(Graphics graphics) {
        PlayStage.a(graphics, this.aM);
        this.W(graphics);
        this.utilService.a(graphics, this.cf[2], 0, canvasHeight, 36, 1);
    }

    private void x(Graphics graphics) {
        System.out.println("PlayStage.d_storyTalk()");
        if (this.cS == -4132) {
            PlayStage.V(graphics);
            return;
        }
        if (!this.dg) {
            ++this.cS;
        } else {
            --this.cS;
            if (this.cS <= 0) {
                this.dg = false;
                bG = false;
                this.ad();
                return;
            }
        }
        int n = 0;
        if (this.cS < 2) {
            graphics.setColor(0);
            n = 70 + this.cS * 6;
            graphics.fillRect(0, 0, canvasWidth, n);
            graphics.fillRect(0, canvasHeight - n, canvasWidth, n);
            Util.DrawRectBorder(graphics, 0, 0, 0, canvasWidth, canvasHeight, 7 * this.cS * this.cS);
            return;
        }
        if (this.cS < 4) {
            this.bD();
            n = 80 + this.cS * 13;
            graphics.setColor(0);
            graphics.fillRect(0, 0, canvasWidth, n);
            graphics.fillRect(0, canvasHeight - n, canvasWidth, n);
            Util.DrawRectBorder(graphics, 0, 0, 0, canvasWidth, canvasHeight, 7 * this.cS * this.cS);
            return;
        }
        if (this.cS == 4 && !this.dg) {
            eh = true;
            this.bD();
            this.b(22, false);
            this.ee = true;
            bG = false;
        }
        graphics.drawImage(this.df, by, bz + -60, 3);
        if (this.cS >= 4) {
            this.T(graphics);
        }
    }

    private void ac() {
        try {
            this.l = null;
            this.p();
            this.bq();
            int n = this.U > 6 ? 6 : this.U;
            this.b(this.X[n]);
            this.bB();
        }
        catch (Exception exception) {}
        System.gc();
        this.h = false;
        this.keyProcess_nState = 593;
        eh = false;
        ej = 0;
        this.cS = 0;
        this.dg = false;
        if (this.W) {
            this.ef = 0;
            this.bm = 11 + dS;
            this.nullSomeVariables();
            this.b(4 + this.U);
            this.dateLong_StageText(5);
            this.d(42);
            return;
        }
        if (!this.V) {
            this.bm = 8;
            this.ef = 0;
            System.out.println("PlayStage.i_storyEndTalk() nStage = " + this.U);
            this.nullSomeVariables();
            this.b(4 + this.U);
            this.dateLong_StageText(2);
            this.d(42);
        } else {
            this.bm = 7;
            this.ef = 0;
            this.nullSomeVariables();
            this.b(4 + this.U);
            this.dateLong_StageText(2);
            this.d(42);
        }
        if (this.V) {
            this.bd();
        }
    }

    private void ad() {
        try {
            this.bq();
            this.bs();
            this.a("arrow");
            this.en = this.utilService.e(this.y[this.ek ? 0 : this.U + 1][0]);
            this.utilService.unsetTheFileBytes();
            int n = this.ek ? 0 : this.U + 1;
            if (n < 0) {
                n = 0;
            } else if (n > 6) {
                n = 6;
            }
            this.a("CastleCursor");
            this.ab = this.utilService.e(n);
            this.utilService.unsetTheFileBytes();
            System.out.println("PlayStage.i_storyEndAni() nStage = " + this.U);
            this.nullSomeVariables();
            this.b(4 + this.U);
            this.dateLong_StageText(0);
            this.d(42);
            int[][] nArrayArray = new int[7][];
            nArrayArray[0] = new int[]{115, 223};
            nArrayArray[1] = new int[]{35, 173};
            int[] nArray = new int[2];
            nArray[1] = 114;
            nArrayArray[2] = nArray;
            nArrayArray[3] = new int[]{8, 63};
            nArrayArray[4] = new int[]{156, 9};
            nArrayArray[5] = new int[]{166, 152};
            nArrayArray[6] = new int[]{76, 92};
            int[][] nArrayArray2 = nArrayArray;
            this.ac = nArrayArray2[n][0];
            this.ad = nArrayArray2[n][1];
        }
        catch (Exception exception) {
            System.out.println("22222222222222222222222222222222222222222222222222");
        }
        this.n();
        this.bu();
        this.keyProcess_nState = 594;
        this.cS = -4132;
    }

    private void y(Graphics graphics) {
        if (this.cS != -4132 && this.cS < 4 || this.cS == -4132) {
            this.w(graphics);
            if (this.ab != null && aU) {
                graphics.drawImage(this.ab, bw + this.ac, bx + this.ad, 20);
            }
            this.X(graphics);
        }
        if (this.cS != -4132) {
            int n = 0;
            if (++this.cS < 2) {
                graphics.setColor(0);
                n = 70 + this.cS * 6;
                graphics.fillRect(0, 0, canvasWidth, n);
                graphics.fillRect(0, canvasHeight - n, canvasWidth, n);
                Util.DrawRectBorder(graphics, 0, 0, 0, canvasWidth, canvasHeight, 7 * this.cS * this.cS);
                return;
            }
            if (this.cS < 4) {
                n = 80 + this.cS * 13;
                graphics.setColor(0);
                graphics.fillRect(0, 0, canvasWidth, n);
                graphics.fillRect(0, canvasHeight - n, canvasWidth, n);
                Util.DrawRectBorder(graphics, 0, 0, 0, canvasWidth, canvasHeight, 7 * this.cS * this.cS);
                return;
            }
            PlayStage.V(graphics);
            this.ab();
            Constants.f = true;
            this.a(259, true);
            return;
        }
    }

    private void ae() {
        this.keyProcess_nState = 596;
        this.ee = true;
        try {
            this.b(this.X[this.U]);
        }
        catch (Exception exception) {}
        if (this.aa[this.U] >= ++this.Z) {
            this.Z = this.aa[this.U] - 1;
        }
    }

    private void af() {
        if (Constants.N != -4132 && ++Constants.N == 18) {
            Constants.N = -4132;
            this.M();
        }
    }

    private boolean a(Graphics graphics, int n, int n2) {
        if (bu == 40) {
            // empty if block
        }
        int n3 = bz;
        int n4 = this.ce.length;
        int n5 = n4 * 17 + 10;
        int n6 = 0;
        if (bu == 888 || bu == 40) {
            n6 = this.v[0].getHeight() + 4;
            n5 += n6 + 8;
        }
        int n7 = n3 - (n5 >> 1) + 5;
        int n8 = 0;
        int n9 = 0;
        if (n <= 3) {
            n8 = 156 * n * n / 9;
            n9 = n5 * n * n / 9;
            PlayStage.a(graphics, by, n3, n8, n9, 3);
        } else if (n < 15) {
            PlayStage.a(graphics, by, n3, 156, n5, 3);
            graphics.setColor(0xFFFFFF);
            int n10 = 0;
            n10 = bu == 888 || bu == 40 ? n7 + 0 + n6 + 4 : n7 + 0;
            Constants.T = 0;
            this.bZ = n10 + 5;
            this.a(this.ce, this.cy, this.cx, this.co);
            if (bu == 888 || bu == 40) {
                int n11 = n6 >> 3;
                int n12 = this.v[0].getWidth() >> 1;
                int n13 = this.cf[this.dc].length >> 1;
                int n14 = by - (n12 + n13) - 30;
                if (bu == 40) {
                    n14 -= 13;
                }
                graphics.drawImage(this.v[0], n14 - 1 - 15, n7 + n11, 20);
                this.utilService.a(graphics, this.cf[this.dc], n14 + (n12 << 1) + 3 - 15, n7 + n11 + 8, 20, 0);
            }
        } else {
            if (n >= n2) {
                return true;
            }
            n8 = 156 * (18 - n) * (18 - n) / 9;
            n9 = n5 * (18 - n) * (18 - n) / 9;
            PlayStage.a(graphics, by, n3, n8, n9, 3);
        }
        return false;
    }

    private static int a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = 0;
        int n8 = 0;
        if (n6 <= n4) {
            n7 = n2 * n6 * n6 / (n4 * n4);
            n8 = n3 * n6 * n6 / (n4 * n4);
            PlayStage.a(graphics, by, n, n7, n8, 3);
            return 0;
        }
        if (n6 < n5 - n4) {
            PlayStage.a(graphics, by, n, n2, n3, 3);
            return 1;
        }
        if (n6 >= n5) {
            return 2;
        }
        n7 = n2 * (n5 - n6) * (n5 - n6) / (n4 * n4);
        n8 = n3 * (n5 - n6) * (n5 - n6) / (n4 * n4);
        PlayStage.a(graphics, by, n, n7, n8, 3);
        return 0;
    }

    private void z(Graphics graphics) {
        graphics.drawImage(this.df, by, bz + -60, 3);
        this.T(graphics);
        if (Constants.N != -4132) {
            this.a(graphics, Constants.N, 18);
        }
    }

    private void ag() {
        this.keyProcess_nState = 595;
        Constants.M = true;
        this.ee = true;
        this.bm = 10;
        this.ef = 0;
        this.nullSomeVariables();
        this.b(4 + this.U);
        this.dateLong_StageText(4);
        this.d(42);
    }

    private void A(Graphics graphics) {
        graphics.drawImage(this.df, by, bz + -60, 3);
        this.T(graphics);
    }

    private void ah() {
        int n = this.T.length;
        int n2 = 0;
        while (n2 < n) {
            if (this.T[n2] == 0) {
                this.T[n2] = 1;
                break;
            }
            ++n2;
        }
        String[] stringArray = new String[]{"e_bg", "e_0", "e_1", "e_2"};
        this.bw();
        this.br();
        this.bu();
        this.bt();
        this.p();
        eh = false;
        ei = false;
        this.dz = false;
        this.dy = 0;
        ej = 0;
        this.nullSomeVariables();
        this.b(4 + this.U);
        this.Y(6);
        this.d(42);
        this.bD();
        this.b(18, false);
        this.keyProcess_nState = 597;
        this.v = null;
        this.v = new Image[4];
        this.a("ending");
        if (stringArray[0] != null) {
            this.v[0] = this.utilService.e(2);
        }
        if (stringArray[1] != null) {
            this.v[1] = this.utilService.e(0);
        }
        if (stringArray[2] != null) {
            this.v[2] = this.utilService.e(1);
        }
        this.utilService.unsetTheFileBytes();
        this.cy = 0;
        this.dh = 0;
    }

    private void ai() {
        int n = this.T.length;
        int n2 = 0;
        while (n2 < n) {
            if (this.T[n2] == 0) {
                this.T[n2] = 1;
                break;
            }
            ++n2;
        }
        String[] stringArray = new String[]{"e_bg1"};
        Constants.D = 0;
        this.bw();
        this.br();
        this.bu();
        this.bt();
        this.p();
        eh = false;
        ei = false;
        this.dz = false;
        this.dy = 0;
        ej = 0;
        this.nullSomeVariables();
        this.b(4 + this.U);
        this.Y(7);
        this.d(42);
        this.bD();
        this.b(18, false);
        this.keyProcess_nState = 597;
        this.v = null;
        this.v = new Image[1];
        if (stringArray[0] != null) {
            this.a("ending");
            this.v[0] = this.utilService.e(3);
            this.utilService.unsetTheFileBytes();
        }
        this.cy = 0;
        this.dh = 0;
        ++this.S;
    }

    private void a(Graphics graphics, int n) {
        eh = false;
        ei = false;
        this.dz = false;
        this.dy = 0;
        ej = 0;
        this.n();
        (new String[1])[0] = "e_bg" + n;
        this.v = null;
        this.v = new Image[1];
        System.out.println("scene = " + n);
        this.a("ending");
        this.v[0] = this.utilService.e(2 + n);
        this.utilService.unsetTheFileBytes();
        PlayStage.V(graphics);
    }

    private void B(Graphics graphics) {
        int n = by - this.v[0].getWidth() / 2;
        int n2 = this.v[0].getWidth();
        int n3 = this.v[0].getHeight();
        graphics.drawImage(this.v[0], n, 0, 20);
        int n4 = 0;
        if (this.dh == 0 && this.U != 7) {
            if (aT % 4 == 0) {
                n4 = 1;
            } else if (aT % 4 == 1) {
                n4 = 2;
            } else if (aT % 4 == 2) {
                n4 = 1;
            } else if (aT % 4 == 3) {
                n4 = 2;
            }
            graphics.drawImage(this.v[n4], n, 0 + this.v[0].getHeight(), 36);
        }
        if (!eh) {
            eh = PlayStage.a(graphics, 0, ej++, 18, true, n, 0, n2, n3, true);
        } else if (!ei && this.dz && (ei = PlayStage.a(graphics, 0, ej++, 17, false, n, 0, n2, n3, false))) {
            if (this.U == 7) {
                this.U = 0;
                this.f();
                this.bd();
                this.q();
            } else if (this.dh == 1) {
                this.a(graphics, this.dh);
            } else if (this.dh == 2) {
                this.a(graphics, this.dh);
            } else if (this.dh == 3) {
                this.Z = 0;
                Constants.x = false;
                this.n();
                this.bw();
                this.U = 7;
                this.bm = 0;
                Constants.f = true;
                this.a(259, true);
            }
            PlayStage.V(graphics);
            return;
        }
        if (eh && !this.dz) {
            this.bZ = n3 + 10;
            this.a(this.cg[(this.U > 6 ? 33 : 30) + this.cy], this.cy, this.cx, this.co);
            graphics.setColor(0x555555);
            graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
            if (this.U != 7) {
                if (this.dh < 2) {
                    this.utilService.a(graphics, this.cf[1], 0, canvasHeight, 36, 1);
                    this.utilService.a(graphics, this.cf[0], canvasWidth, canvasHeight, 40, 1);
                    return;
                }
                this.utilService.a(graphics, this.cf[2], 0, canvasHeight, 36, 1);
                return;
            }
            if (this.U == 7) {
                this.utilService.a(graphics, this.cf[2], 0, canvasHeight, 36, 1);
            }
        }
    }

    private void aj() {
        if (this.h) {
            this.dm = 17;
            return;
        }
        if (this.U == 0) {
            if (this.dr != 0) {
                this.dm = 17;
                return;
            }
            this.dr = 1;
        } else if (this.U == 1) {
            if (this.dr != 1) {
                this.dm = 17;
                return;
            }
            this.dr = (byte)2;
        }
        this.f();
        dv = -4132;
        this.dm = -4132;
        this.dl = Util.d(0, 14);
        switch (this.dl) {
            case 0: {
                this.dn = new int[]{4};
                this.cfr_renamed_0 = new int[]{2};
                this.dp = new int[]{-3, -2};
                return;
            }
            case 1: {
                this.dn = new int[]{4, 2};
                this.cfr_renamed_0 = new int[]{2, 2};
                this.dp = new int[]{-4, -2};
                return;
            }
            case 2: {
                this.dn = new int[]{5, 2};
                this.cfr_renamed_0 = new int[]{1, 2};
                this.dp = new int[]{-5, -4};
                return;
            }
            case 3: {
                this.dn = new int[]{2};
                this.cfr_renamed_0 = new int[]{2};
                this.dp = new int[]{-5};
                return;
            }
            case 4: {
                this.dn = new int[]{5, 2};
                this.cfr_renamed_0 = new int[]{1, 2};
                this.dp = new int[]{-1};
                return;
            }
            case 5: {
                this.dn = new int[]{1};
                this.cfr_renamed_0 = new int[]{6};
                this.dp = new int[]{-2};
                return;
            }
            case 6: {
                this.dn = new int[]{5};
                this.cfr_renamed_0 = new int[]{1};
                this.dp = new int[]{-4, -3};
                return;
            }
            case 7: {
                this.dn = new int[]{3, 2};
                this.dq = -5;
                return;
            }
            case 8: {
                this.dn = new int[]{2};
                this.dq = -4;
                return;
            }
            case 9: {
                this.dn = new int[]{1};
                this.dq = -2;
            }
        }
    }

    public final void c() {
        if (this.dm != -4132) {
            return;
        }
        switch (this.dl) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                this.h(this.a(this.dn, this.cfr_renamed_0, this.dp));
                return;
            }
            case 7: 
            case 8: 
            case 9: {
                this.h(this.a(this.dn, this.dq));
                return;
            }
            case 10: {
                this.h(PlayStage.am());
                return;
            }
            case 11: {
                this.h(PlayStage.an());
                return;
            }
            case 12: {
                this.h(this.ao());
                return;
            }
            case 13: {
                this.h(this.ap());
                return;
            }
            case 14: {
                this.h(this.aq());
                return;
            }
            case 15: {
                this.h(PlayStage.ar());
                return;
            }
            case 16: {
                this.h(this.as());
            }
        }
    }

    private void h(int n) {
        if (n == 0) {
            this.dm = 0;
            audioService.setVolumeLevel(40);
            return;
        }
        if (n != -4132) {
            this.dm = 1;
        }
    }

    private void ak() {
        try {
            bu = 40;
            this.dm = 0;
            this.aF();
            this.dt = -4132;
            this.ak = new Image[2];
            this.a(String.valueOf(Constants.C) + "_imgText");
            this.ak[0] = this.utilService.e(Constants.Y);
            this.ak[1] = this.utilService.e(Constants.Z);
            this.utilService.unsetTheFileBytes();
            this.b(24, false);
            this.a("ui_effect");
            this.ag = this.utilService.e(0);
            this.ah = this.utilService.e(2);
            this.utilService.unsetTheFileBytes();
            int n = Util.d(0, 100);
            this.dc = n < 10 ? 0 : (n < 20 ? 1 : (n < 60 ? 2 : 3));
            this.du = true;
            this.Q();
            this.du = false;
            this.ds = Util.d(1, 5);
            int n2 = this.dc;
            this.aw[n2] = this.aw[n2] + this.ds;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void al() {
        this.ak = null;
        this.ag = null;
        this.ah = null;
        this.R();
        System.gc();
    }

    private void C(Graphics graphics) {
        this.K(graphics);
    }

    private static boolean a(int[] nArray) {
        int n = 0;
        int n2 = nArray.length;
        int n3 = 0;
        while (n3 < n2) {
            n = nArray[n3];
            int n4 = 0;
            while (n4 < 64) {
                if (n == ChessEngine.a[n4]) {
                    return false;
                }
                ++n4;
            }
            ++n3;
        }
        return true;
    }

    private int a(int[] nArray, int[] nArray2, int[] nArray3) {
        int n = 0;
        int n2 = nArray.length;
        int[] nArray4 = new int[n2];
        int n3 = 0;
        while (n3 < n2) {
            n = nArray[n3];
            int n4 = 0;
            while (n4 < 64) {
                if (n == ChessEngine.a[n4]) {
                    int n5 = n3;
                    nArray4[n5] = nArray4[n5] + 1;
                }
                ++n4;
            }
            ++n3;
        }
        n3 = 0;
        while (n3 < n2) {
            if (nArray2[n3] > nArray4[n3]) {
                return 1;
            }
            ++n3;
        }
        if (PlayStage.a(nArray3)) {
            return 0;
        }
        return -4132;
    }

    private static boolean i(int n) {
        int n2 = 0;
        while (n2 < 64) {
            if (n == ChessEngine.a[n2]) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    private int a(int[] nArray, int n) {
        int n2 = nArray.length;
        boolean bl = true;
        int n3 = 0;
        while (n3 < n2) {
            if (ChessR.r == nArray[n3] && ChessR.s == n) {
                return 0;
            }
            if (PlayStage.i(nArray[n3])) {
                bl = false;
            }
            ++n3;
        }
        if (bl || !PlayStage.i(n)) {
            return 1;
        }
        return -4132;
    }

    private static int am() {
        if (dv == -4132) {
            return -4132;
        }
        if (dv == 0) {
            return 0;
        }
        return 1;
    }

    private static int an() {
        if (dv == -4132) {
            return -4132;
        }
        if (dv != 0) {
            return 1;
        }
        if (ChessR.s == -5) {
            return 0;
        }
        return -4132;
    }

    private int ao() {
        if (bu != 2 && bu != 9) {
            return -4132;
        }
        int n = 0;
        int n2 = 0;
        while (n2 < 64) {
            if (ChessEngine.a[n2] < 0 && ++n > 2) break;
            ++n2;
        }
        if (n < 3) {
            return 1;
        }
        this.dw[0] = this.dw[1];
        this.dw[1] = ChessR.s;
        if (this.dw[0] != 0 && this.dw[1] != 0) {
            return 0;
        }
        return -4132;
    }

    private int ap() {
        if (ChessR.r == 2) {
            return 1;
        }
        int[] nArray = new int[]{-2};
        if (PlayStage.a(nArray)) {
            return 0;
        }
        return -4132;
    }

    private int aq() {
        if (bu == 9) {
            return 0;
        }
        if (!PlayStage.i(1)) {
            return 1;
        }
        return -4132;
    }

    private static int ar() {
        if (dx == -4132) {
            return -4132;
        }
        if (dx == 0) {
            return 0;
        }
        return 1;
    }

    private int as() {
        if (!PlayStage.i(1)) {
            return 1;
        }
        if (dv == 0 && ChessR.r == 1) {
            return 0;
        }
        return -4132;
    }

    private void D(Graphics graphics) {
        this.Y(graphics);
        this.F(graphics);
    }

    private void at() {
        switch (bu) {
            case 0: {
                if (!this.aG() || !Constants.L) break;
                this.aH();
                return;
            }
            case 1: {
                this.aI();
                return;
            }
            case 2: {
                return;
            }
            case 3: {
                return;
            }
            case 99: {
                return;
            }
            case 114: {
                return;
            }
            case 110: {
                return;
            }
            case 9: {
                return;
            }
            case 160: {
                return;
            }
            case 100: {
                this.aA();
                return;
            }
            case 101: {
                this.aE();
                return;
            }
            case 150: {
                return;
            }
            case 200: {
                return;
            }
            case 44: {
                if (!this.aZ()) break;
                if (!this.V) {
                    this.x = null;
                    System.gc();
                    this.d(39);
                    bu = 48;
                    bG = false;
                    return;
                }
                this.au();
                return;
            }
            case 48: {
                return;
            }
            case 2457: {
                if (this.aZ()) {
                    bG = false;
                    this.aY();
                    bu = 2;
                    this.aS();
                    this.bp = 2;
                    return;
                }
                if (Constants.H != 12) break;
                this.f();
                return;
            }
            case 1000: 
            case 2000: 
            case 3000: {
                if (!this.aZ()) break;
                if (dK) {
                    this.aC();
                    return;
                }
                this.O();
                return;
            }
            case 444: {
                if (this.aE.g || Constants.E == 0 || Constants.F == 0) {
                    this.O();
                    PlayStage.k();
                    return;
                }
                this.aE.a();
                return;
            }
            case 666: {
                switch (bb++) {
                    case 1: 
                    case 2: 
                    case 3: {
                        return;
                    }
                }
                if (Constants.E == 0 || Constants.F == 0) {
                    if (bL == 1 && bk != 2) {
                        PlayStage.h();
                    }
                    ChessR.c();
                    PlayStage.k();
                    bb = -4132;
                    return;
                }
                if (this.aF.g && this.aG.g) {
                    this.O();
                    PlayStage.k();
                    bb = -4132;
                    return;
                }
                this.av();
                this.aF.a();
                if (this.aF.h == this.L[Math.abs(ChessR.r)]) {
                    this.aG.c();
                }
                this.aG.a();
                return;
            }
            case 888: {
                if (++this.db <= 38) break;
                this.T();
                return;
            }
            case 40: {
                if (this.dt == -4132) {
                    if (!this.aG()) break;
                    this.dt = 0;
                    return;
                }
                if (++this.dt <= 20) break;
                this.al();
                this.O();
            }
        }
    }

    private void au() {
        this.x = null;
        if (!Constants.L && bk != 2 && !this.dX) {
            if (Constants.G == 20) {
                if (ba < this.A || this.A == 0) {
                    this.A = ba;
                }
                ++this.G;
            } else {
                ++this.H;
            }
            this.F += this.b(Constants.G == 20);
            this.x();
        }
        this.bw();
        if (Constants.L) {
            if (this.U >= 6 && Constants.G == 20) {
                if (this.U == 6) {
                    this.ah();
                } else {
                    this.ai();
                }
            } else {
                this.ac();
            }
        } else {
            this.q();
            this.t();
            if (bk != 2) {
                bk = 0;
                int n = this.E;
                this.u();
                this.bp = n;
            } else {
                this.bp = 1;
            }
            bG = false;
        }
        this.f();
    }

    private void av() {
        int n = Math.abs(ChessR.r);
        switch (n) {
            case 6: {
                if (this.aF.h == 2) {
                    this.bD();
                    this.b(11, false);
                    return;
                }
                if (this.aF.h != this.L[n] - 4) break;
                this.bD();
                this.b(12, false);
                return;
            }
            case 5: {
                if (this.aF.h == 2) {
                    this.bD();
                    this.b(9, false);
                    return;
                }
                if (this.aF.h != this.L[n] - 3) break;
                this.bD();
                this.b(10, false);
                return;
            }
            case 4: {
                if (this.aF.h == 1) {
                    this.bD();
                    this.b(7, false);
                    return;
                }
                if (this.aF.h != this.L[n]) break;
                this.bD();
                this.b(8, false);
                return;
            }
            case 3: {
                if (this.aF.h == 3) {
                    this.bD();
                    this.b(5, false);
                    return;
                }
                if (this.aF.h != 12) break;
                this.bD();
                this.b(6, false);
                return;
            }
            case 2: {
                if (this.aF.h != 5) break;
                this.bD();
                this.b(5, false);
                return;
            }
            case 1: {
                if (this.aF.h != this.L[n] - 1) break;
                this.bD();
                this.b(2, false);
            }
        }
    }

    private void aw() {
        System.out.println("PlayStage.i_prologue()");
        this.p();
        this.U = 0;
        this.keyProcess_nState = 769;
        eh = false;
        ei = false;
        this.dz = false;
        this.dy = 0;
        ej = 0;
        this.ax();
        this.nullSomeVariables();
        this.b(2);
        this.W(0);
        this.d(9);
        this.bD();
        this.b(18, false);
    }

    private void ax() {
        try {
            this.dA = null;
            System.gc();
            this.a("prologue");
            this.dA = this.utilService.e(this.dy);
            this.utilService.unsetTheFileBytes();
        }
        catch (Exception exception) {}
        System.gc();
    }

    private void ay() {
        this.dA = null;
        System.gc();
    }

    private void E(Graphics graphics) {
        int n = by - this.dA.getWidth() / 2;
        int n2 = this.dA.getWidth();
        int n3 = this.dA.getHeight();
        graphics.drawImage(this.dA, n, 0, 20);
        if (!eh) {
            eh = PlayStage.a(graphics, 0, ej++, 18, true, n, 0, n2, n3, true);
        } else if (!ei && this.dz && (ei = PlayStage.a(graphics, 0, ej++, 17, false, n, 0, n2, n3, false))) {
            if (++this.dy == 4) {
                this.bD();
                this.ay();
                bG = false;
                PlayStage.V(graphics);
                return;
            }
            this.ax();
            ej = 0;
            eh = false;
            this.dz = false;
            graphics.setColor(0);
            graphics.fillRect(n, 0, n2, n3);
        }
        int n4 = 0 + n3 + 10;
        int n5 = canvasHeight - n4 - 20;
        if (eh && !this.dz) {
            graphics.setClip(0, n4, canvasWidth, n5);
            this.bZ = 100;
            int n6 = 0;
            while (n6 < this.cg[this.dy].length) {
                this.utilService.a(graphics, this.cg[this.dy][n6], by, this.bZ + n6 * (this.utilService.o[1] + 2), 17, 1);
                ++n6;
            }
            graphics.setColor(0x555555);
            graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
            if (this.dy != 3) {
                this.utilService.a(graphics, this.cf[1], 0, canvasHeight, 36, 1);
                this.utilService.a(graphics, this.cf[0], canvasWidth, canvasHeight, 40, 1);
                return;
            }
            if (this.dy == 3) {
                this.utilService.a(graphics, this.cf[2], 0, canvasHeight, 36, 1);
            }
        }
    }

    private void F(Graphics graphics) {
        int n = canvasWidth - 6;
        int n2 = canvasHeight - 2;
        int n3 = canvasWidth - 12;
        int n4 = canvasHeight - 10;
        int n5 = canvasWidth - 1;
        int n6 = canvasHeight - 10;
        this.cE = this.cE < 500 ? ++this.cE : 0;
        switch (bu) {
            case 0: {
                this.M(graphics);
                return;
            }
            case 1: {
                this.N(graphics);
                return;
            }
            case 2: {
                graphics.setColor(0x555555);
                graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
                if (bk != 2) {
                    if (!Constants.I) {
                        if (this.cE % 4 == 0) {
                            graphics.setColor(16729600);
                            graphics.fillTriangle(n, n2, n3, n4, n5, n6);
                        }
                        this.utilService.a(graphics, this.cf[10], 0, canvasHeight, 36, 1);
                    } else {
                        if (Constants.L) {
                            graphics.setColor(0x555555);
                            graphics.fillRect(canvasWidth - 72, canvasHeight - 43, 72, 38);
                            graphics.setColor(0xDDDDDD);
                            graphics.fillRect(canvasWidth - 70, canvasHeight - 42 + 15 * Constants.J, 70, 13);
                            this.utilService.a(graphics, this.cf[6], canvasWidth - 67, canvasHeight - 15, 36, 1);
                            this.utilService.a(graphics, this.cf[7], canvasWidth - 67, canvasHeight - 30, 36, 1);
                        } else {
                            graphics.setColor(0x555555);
                            graphics.fillRect(canvasWidth - 72, canvasHeight - 28, 72, 20);
                            graphics.setColor(0xDDDDDD);
                            graphics.fillRect(canvasWidth - 72, canvasHeight - 27, 72, 13);
                            this.utilService.a(graphics, this.cf[7], canvasWidth - 67, canvasHeight - 15, 36, 1);
                        }
                        this.utilService.a(graphics, this.cf[8], 0, canvasHeight, 36, 1);
                        this.utilService.a(graphics, this.cf[9], canvasWidth, canvasHeight, 40, 1);
                    }
                }
                if (this.ey == 1) break;
                int n7 = Math.abs(ChessEngine.a[ChessR.e + ChessR.f * 8]);
                if (n7 != 0) {
                    this.utilService.a(graphics, this.cf[n7 - 1], by, canvasHeight - 30, 17, 1);
                    Util.a(graphics);
                }
                if (Constants.I) break;
                this.utilService.a(graphics, this.cf[10], 0, canvasHeight, 36, 1);
            }
            case 3: {
                return;
            }
            case 48: {
                graphics.setColor(0x555555);
                graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
                this.utilService.a(graphics, this.cf[6], 0, canvasHeight, 36, 1);
                return;
            }
            case 158: {
                this.v(graphics);
                return;
            }
            case 110: {
                return;
            }
            case 114: {
                this.I(graphics);
                return;
            }
            case 160: {
                return;
            }
            case 150: {
                this.u(graphics);
                return;
            }
            case 170: {
                this.t(graphics);
                return;
            }
            case 99: {
                this.T(graphics);
                return;
            }
            case 888: {
                this.s(graphics);
                return;
            }
            case 8: {
                return;
            }
            case 9: {
                this.O(graphics);
                return;
            }
            case 100: {
                this.H(graphics);
                return;
            }
            case 101: {
                this.J(graphics);
                return;
            }
            case 200: {
                this.L(graphics);
                return;
            }
            case 44: {
                this.P(graphics);
                return;
            }
            case 1000: 
            case 2000: 
            case 3000: {
                this.G(graphics);
                return;
            }
            case 2457: {
                this.S(graphics);
                return;
            }
            case 40: {
                this.C(graphics);
            }
        }
    }

    private void j(int n) {
        bu = n;
        Constants.H = 0;
        int n2 = 0;
        switch (n) {
            case 1000: {
                this.bD();
                this.b(14, false);
                n2 = Constants.ad;
                break;
            }
            case 2000: {
                this.bD();
                this.b(15, false);
                n2 = Constants.ae;
                break;
            }
            case 3000: {
                this.bD();
                this.b(15, false);
                n2 = Constants.af;
            }
        }
        try {
            this.a(String.valueOf(Constants.C) + "_imgText");
            this.aj = this.utilService.e(n2);
            this.utilService.unsetTheFileBytes();
            this.a("ui_effect");
            this.ag = this.utilService.e(0);
            this.ah = this.utilService.e(2);
            this.utilService.unsetTheFileBytes();
        }
        catch (Throwable throwable) {}
        System.gc();
    }

    private void G(Graphics graphics) {
        int n = this.aj.getWidth();
        int n2 = this.aj.getHeight();
        if (Constants.H < 4) {
            n = n * Constants.H * Constants.H / 16;
            n2 = n2 * Constants.H * Constants.H / 16;
        }
        Util.c(graphics, by, bz, n, n2, 3);
        graphics.drawImage(this.aj, by, bz, 3);
        Util.a(graphics);
        if (Constants.H >= 4) {
            Util.a(graphics, this.ag, by - n / 2, bz - n2 / 2, this.ag.getWidth(), this.ag.getHeight() / 3, 0, aT % 3, 3);
            Util.a(graphics, this.ah, n / 2 + by, bz - n2 / 2, this.ah.getWidth(), this.ah.getHeight() / 5, 0, aT % 5, 3);
        }
    }

    private void az() {
        this.bt = bu;
        bu = 100;
        this.bp = bk == 2 ? 2 : 0;
        this.bq = PlayStage.S(100);
        this.dD = 0;
        this.dC = true;
        this.dE = 0;
        this.dB = -4132;
        this.bD();
        this.b(17, false);
        bK = false;
        try {
            this.bm();
            this.nullSomeVariables();
            this.b(3);
            this.c(0);
            this.d(37);
            this.data_Text(22);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private void aA() {
        if (Constants.H != -4132) {
            ++Constants.H;
        }
        if (this.dC) {
            if (this.dB == -4132) {
                ++this.dD;
                ++this.dE;
                return;
            }
            if (this.dB++ > 4) {
                switch (this.bp) {
                    case 0: {
                        this.dC = false;
                        this.dD = 0;
                        this.U();
                        return;
                    }
                    case 1: {
                        this.dC = false;
                        this.dD = 0;
                        this.aB();
                        this.d(41);
                        return;
                    }
                    case 2: {
                        this.dC = false;
                        this.dD = 0;
                        this.aP();
                        return;
                    }
                    case 3: {
                        this.dC = false;
                        this.dD = 0;
                        this.d(41);
                        this.aQ();
                    }
                }
                return;
            }
        } else if (--this.dD <= 0) {
            this.bn();
            this.aT();
        }
    }

    private void H(Graphics graphics) {
        int n;
        int n2 = canvasHeight - 70 - 5 - 24;
        n2 = this.dD >= 0 && this.dD <= 3 ? (n2 += 70 / (this.dD + 1) - 24) : canvasHeight - 70 - 5 - 24;
        PlayStage.a(graphics, by, n2, 170, 90, 17);
        int n3 = by - 55;
        int n4 = n2 + 6;
        this.utilService.a(graphics, this.cf[this.bp], by, n4 + 6, 3, 1);
        Util.a(graphics, n3 + 90 + 4 + 20, n2 + 6 + 20, 20, 13, 0, 0x393939, 0x868686, 1);
        int n5 = by - 14 * (Constants.n + 1);
        int n6 = n4 + 13 + 4;
        int n7 = 0;
        if (this.dB != -4132) {
            n7 = bk == 2 ? n5 + 14 * ((this.bp - 1) * 2) + 10 : n5 + 14 * (this.bp * 2) + 10;
            n = n6 + 11;
            switch (aT % 4) {
                case 3: {
                    graphics.setColor(5525760);
                    Util.b(graphics, n7, n, 28, 28, 3);
                    graphics.setColor(9801729);
                    Util.b(graphics, n7, n, 26, 26, 3);
                    graphics.setColor(0xFFF600);
                    Util.b(graphics, n7, n, 24, 24, 3);
                    graphics.setColor(16776085);
                    Util.b(graphics, n7, n, 22, 22, 3);
                    break;
                }
                case 2: {
                    graphics.setColor(9801729);
                    Util.b(graphics, n7, n, 28, 28, 3);
                    graphics.setColor(0xFFF600);
                    Util.b(graphics, n7, n, 26, 26, 3);
                    graphics.setColor(16776085);
                    Util.b(graphics, n7, n, 24, 24, 3);
                    break;
                }
                case 1: {
                    graphics.setColor(0xFFF600);
                    Util.b(graphics, n7, n, 28, 28, 3);
                    graphics.setColor(16776085);
                    Util.b(graphics, n7, n, 26, 26, 3);
                    break;
                }
                case 0: {
                    graphics.setColor(16776085);
                    Util.b(graphics, n7, n, 28, 28, 3);
                }
            }
        }
        if (bk == 2) {
            n5 -= 28;
        }
        n = bk == 2 ? 2 : 0;

        // FIXME: GameConfig.n and ChessEngine.n both are contesting...
        while (n < Constants.n + 1) {
            Util.b(graphics, n5 + 14 * (n * 2) - 2, n6, 24, 24, 0, 0x393939, 0x868686, 1);
            graphics.drawImage(this.am[n], n5 + 10 + 14 * (n * 2), n6 + 2 + 10, 3);
            ++n;
        }
        this.utilService.a(graphics, this.al, n3 + 90 + 4 + 10 + 20, n4 + 6 + 20, this.aw[this.bp], 3);
        if (this.dB == -4132) {
            n7 = n5 + 14 * (this.bp * 2) - 2;
            PlayStage.a(graphics, this.an[0], n7 + 20 + 4, n6, 2, 0, this.dE, 24);
            PlayStage.a(graphics, this.an[1], n7, n6, 2, 1, this.dE, 24);
            PlayStage.a(graphics, this.an[2], n7, n6 + 20 + 3, 2, 2, this.dE, 24);
            PlayStage.a(graphics, this.an[3], n7 + 20 + 3, n6 + 20 + 4, 2, 3, this.dE, 24);
        }
        graphics.setColor(0);
        this.bZ = n6 + 20 + 8;
        this.a(this.cg[this.bp], this.cy, this.cx, this.co);
        if (Constants.H != -4132) {
            int n8 = PlayStage.a(graphics, bz, 176, 40, 2, 16, Constants.H);
            graphics.setColor(0xFFFFFF);
            if (n8 == 1) {
                this.utilService.a(graphics, this.ce[0], by, bz - 8, 17, 0);
            } else if (n8 == 2) {
                Constants.H = -4132;
            }
        }
        graphics.setColor(0x555555);
        graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
        this.utilService.a(graphics, this.cf[4], 0, canvasHeight, 36, 1);
        this.utilService.a(graphics, this.cf[5], canvasWidth, canvasHeight, 40, 1);
    }

    private void k(int n) {
        PlayStage.bE();
        this.spriteId = Util.d(1, 5);
        ChessEngine.d();
        au = true;
        ChessEngine.a(this.spriteId, n);
        System.arraycopy(ChessEngine.a, 0, ChessR.o, 0, 64);
        bG = true;
        this.dI = 0;
        try {
            this.dJ = Image.createImage((String)"/img/makepiece.png");
            if (is3D) {
                String string = "/date/" + this.spriteId + "w.dmg";
                this.dF = new GameSpritesManager("filename");
                DataInputStream dataInputStream = new DataInputStream(this.getClass().getResourceAsStream(string));
                byte[] byArray = this.b(string);
                dataInputStream.readInt();
                dataInputStream.readInt();
                dataInputStream.read(byArray, 0, byArray.length);
                this.dF.spriteImage = Util.a(byArray, null, null, 16, 255);
                dataInputStream.close();
            }
        }
        catch (Throwable throwable) {}
        System.gc();
    }

    private void aB() {
        Vector<String> vector = new Vector<String>();
        int n = this.l.size();
        int[] nArray = new int[n];
        if (n < 1 || j) {
            bu = 2;
            if (j) {
                this.data_Text(25);
            } else {
                this.data_Text(27);
            }
            this.W();
            return;
        }
        int n2 = 0;
        int n3 = 0;
        while (n3 < n) {
            this.dG = (ActionPair)this.l.elementAt(n3);
            if (ChessEngine.a[this.dG.b] == 0) {
                nArray[n3] = 5;
                ++n2;
            }
            block1 : switch (this.dG.a) {
                case 1: {
                    int n4 = 8;
                    while (n4 < 16) {
                        if (ChessEngine.a[n4] == 0) {
                            ++n2;
                            int n5 = n3;
                            nArray[n5] = nArray[n5] + 1;
                            break block1;
                        }
                        ++n4;
                    }
                    break;
                }
                case 2: {
                    if (ChessEngine.a[1] == 0) {
                        ++n2;
                        int n6 = n3;
                        nArray[n6] = nArray[n6] + 1;
                    }
                    if (ChessEngine.a[6] != 0) break;
                    ++n2;
                    int n7 = n3;
                    nArray[n7] = nArray[n7] + 1;
                    break;
                }
                case 3: {
                    if (ChessEngine.a[2] == 0) {
                        ++n2;
                        int n8 = n3;
                        nArray[n8] = nArray[n8] + 1;
                    }
                    if (ChessEngine.a[5] != 0) break;
                    ++n2;
                    int n9 = n3;
                    nArray[n9] = nArray[n9] + 1;
                    break;
                }
                case 4: {
                    if (ChessEngine.a[0] == 0) {
                        ++n2;
                        int n10 = n3;
                        nArray[n10] = nArray[n10] + 1;
                    }
                    if (ChessEngine.a[7] != 0) break;
                    ++n2;
                    int n11 = n3;
                    nArray[n11] = nArray[n11] + 1;
                    break;
                }
                case 5: {
                    if (ChessEngine.a[3] != 0) break;
                    ++n2;
                    int n12 = n3;
                    nArray[n12] = nArray[n12] + 1;
                }
            }
            ++n3;
        }
        if (n2 == 0) {
            bu = 2;
            this.data_Text(23);
            this.W();
            return;
        }
        n2 = 0;
        n3 = Util.d(0, n - 1);
        while (n3 <= n) {
            if (n3 == n) {
                n3 = 0;
            }
            if (nArray[n3] != 0) {
                n2 = n3;
                break;
            }
            ++n3;
        }
        this.dG = (ActionPair)this.l.elementAt(n2);
        this.l.removeElementAt(n2);
        this.spriteId = this.dG.a;
        if (nArray[n2] <= 2) {
            block8 : switch (this.spriteId) {
                case 1: {
                    n3 = 8;
                    while (n3 < 16) {
                        if (ChessEngine.a[n3] == 0) {
                            vector.addElement(String.valueOf(n3));
                            break block8;
                        }
                        ++n3;
                    }
                    break;
                }
                case 2: {
                    if (ChessEngine.a[1] == 0) {
                        vector.addElement("1");
                    }
                    if (ChessEngine.a[6] != 0) break;
                    vector.addElement("6");
                    break;
                }
                case 3: {
                    if (ChessEngine.a[2] == 0) {
                        vector.addElement("2");
                    }
                    if (ChessEngine.a[5] != 0) break;
                    vector.addElement("5");
                    break;
                }
                case 4: {
                    if (ChessEngine.a[0] == 0) {
                        vector.addElement("0");
                    }
                    if (ChessEngine.a[7] != 0) break;
                    vector.addElement("7");
                    break;
                }
                case 5: {
                    if (ChessEngine.a[3] != 0) break;
                    vector.addElement("3");
                }
            }
            this.eA = Integer.parseInt(vector.elementAt(Util.d(0, vector.size() - 1)).toString());
        }
        if (nArray[n2] >= 6) {
            this.dL = 0;
            bu = 114;
        } else if (nArray[n2] <= 2) {
            this.dL = 1;
            this.l(-5);
        } else {
            this.dL = 0;
            this.l(-5);
        }
        System.arraycopy(ChessEngine.a, 0, ChessR.o, 0, 64);
        try {
            this.dJ = Image.createImage((String)"/img/resurrection.png");
            if (is3D) {
                String string = "/date/" + this.spriteId + "w.dmg";
                this.dF = new GameSpritesManager(string);
                DataInputStream dataInputStream = new DataInputStream(this.getClass().getResourceAsStream(string));
                byte[] byArray = this.b(string);
                dataInputStream.readInt();
                dataInputStream.readInt();
                dataInputStream.read(byArray, 0, byArray.length);
                this.dF.spriteImage = Util.a(byArray, null, null, 4, 0);
                dataInputStream.close();
            }
        }
        catch (Throwable throwable) {}
        System.gc();
        this.bD();
        this.b(7, false);
    }

    private void I(Graphics graphics) {
        int n = bz - 30;
        int n2 = canvasWidth > 150 ? 176 : 96;
        PlayStage.a(graphics, by, n, n2, 61, 17);
        graphics.setColor(0xDDDDDD);
        this.utilService.a(graphics, this.cf[14], by, (n += 5) + 5, 17, 1);
        this.utilService.a(graphics, this.cf[15], by, n + 26, 17, 1);
    }

    private void l(int n) {
        switch (n) {
            case -5: 
            case 49: 
            case 50: {
                PlayStage.bE();
                if (n == 49 || n == -5) {
                    if (this.dL != 0) {
                        this.dG.b = this.eA;
                    }
                } else if (n == 50) {
                    this.dG.b = this.eA;
                }
                ChessR.e = this.dG.b & 7;
                ChessR.f = this.dG.b >>> 3;
                int n2 = this.bp;
                this.aw[n2] = this.aw[n2] - 1;
                this.bJ = null;
                ChessEngine.a(this.spriteId, this.dG.b);
                bG = true;
                bu = 115;
                this.dI = 0;
                ++ba;
                System.arraycopy(ChessEngine.a, 0, ChessR.o, 0, 64);
                this.d(41);
            }
        }
    }

    private boolean b(Graphics graphics, int n, int n2) {
        int n3;
        int n4 = 0;
        int n5 = 0;
        if (this.dF != null) {
            n4 = this.dF.width;
            n5 = this.dF.height;
        }
        if ((n3 = n5 - ++this.dI * 3) <= 0 || !is3D || Constants.F != 1) {
            ChessEngine.l = -1;
            bL = 1;
            if (bu == 1000) {
                return false;
            }
            if (ChessEngine.b(ChessEngine.l) && !dK) {
                this.j(1000);
                dK = true;
                return false;
            }
            this.aC();
            return true;
        }
        if (bu == 110) {
            if (this.dI < 5 && (this.dI & 1) == 1) {
                return false;
            }
        } else {
            graphics.setClip(n + this.dF.offsetX, n2 + this.dF.offsetY, n4, n3);
            this.dF.a(graphics, n, n2);
            Util.a(graphics);
        }
        return false;
    }

    private void aC() {
        dK = false;
        PlayStage.h();
        bG = false;
        this.dI = -4132;
        this.dF = null;
        this.dJ = null;
        System.gc();
        ChessEngine.c = null;
        dM = true;
    }

    private void aD() {
        this.bt = bu;
        bu = 101;
        this.dD = 0;
        this.dC = true;
        this.dE = 0;
        this.nullSomeVariables();
        this.b(3);
        this.c(1);
        this.d(38);
        this.bD();
        this.b(17, false);
    }

    private void m(int n) {
        System.out.println("PlayStage.k_mission() = " + n);
        if (n == -7 && this.dC) {
            this.dC = false;
            this.dD = 4;
            Constants.I = false;
            Constants.J = 0;
        }
    }

    private void aE() {
        if (Constants.H != -4132) {
            ++Constants.H;
        }
        if (this.dC) {
            ++this.dD;
            ++this.dE;
            return;
        }
        if (--this.dD <= 0) {
            System.gc();
            this.aT();
            this.bD();
            this.b(17, false);
        }
    }

    private void J(Graphics graphics) {
        int n = this.dm != -4132 ? 27 : this.cg[this.dl + 4].length * 17 + 10;
        int n2 = canvasHeight - n - 5 - 12;
        n2 = this.dD >= 0 && this.dD <= 3 ? (n2 += n / (this.dD + 1)) : canvasHeight - n - 5;
        PlayStage.a(graphics, by, n2, 179, n + 20, 17);
        this.b(graphics, n2);
        graphics.setColor(0x555555);
        graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
        this.utilService.a(graphics, this.cf[3], canvasWidth, canvasHeight, 40, 1);
    }

    private void b(Graphics graphics, int n) {
        if (this.dm != -4132) {
            int n2 = this.dm == 17 ? 2 : (this.dm == 1 ? 1 : 0);
            this.utilService.a(graphics, this.cf[n2], by, n + 8, 17, 1);
            return;
        }
        this.bZ = n + 10;
        this.a(this.cg[this.dl + 4], this.cy, this.cx, this.co);
    }

    private void K(Graphics graphics) {
        if (this.dt == -4132) {
            int n = bz;
            graphics.drawImage(this.ak[0], this.dN - 5, n, 33);
            graphics.drawImage(this.ak[1], canvasWidth - this.dN + 5, n, 17);
            return;
        }
        this.a(graphics, 14, 18);
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    private static void a(Graphics graphics, Image image, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = (n4 & 1) == 0 ? image.getWidth() : image.getHeight();
        int n8 = n5 * n3 % n6;
        if ((n8 += n7) > n6) {
            int n9 = Integer.MIN_VALUE;
            block14: do {
                switch (n9 == Integer.MIN_VALUE ? n4 : n9) {
                    case 0: {
                        Util.c(graphics, n, n2, n6, image.getHeight(), 24);
                        n9 = 5;
                        continue block14;
                    }
                    case 1: {
                        Util.c(graphics, n, n2, image.getWidth(), n6, 20);
                        graphics.drawImage(image, n, n2 + n8, 36);
                        graphics.drawImage(image, n, n2 + n8 % n6, 36);
                        break;
                    }
                    case 2: {
                        Util.c(graphics, n, n2, n6, image.getHeight(), 20);
                        graphics.drawImage(image, n + n8, n2, 24);
                        graphics.drawImage(image, n + n8 % n6, n2, 24);
                        break;
                    }
                    case 3: {
                        Util.c(graphics, n, n2, image.getWidth(), n6, 36);
                        graphics.drawImage(image, n, n2 - n8, 20);
                        graphics.drawImage(image, n, n2 - n8 % n6, 20);
                        break;
                    }
                    case 5: {
                        graphics.drawImage(image, n - n8, n2, 20);
                        graphics.drawImage(image, n - n8 % n6, n2, 20);
                        break;
                    }
                }
                break;
            } while (true);
            Util.a(graphics);
            return;
        }
        switch (n4) {
            case 0: {
                graphics.drawImage(image, n - n8, n2, 20);
                return;
            }
            case 1: {
                graphics.drawImage(image, n, n2 + n8, 36);
                return;
            }
            case 2: {
                graphics.drawImage(image, n + n8, n2, 24);
                return;
            }
            case 3: {
                graphics.drawImage(image, n, n2 - n8, 20);
                return;
            }
            case 5: {
                graphics.drawImage(image, n - n8, n2, 20);
                return;
            }
        }
    }

    private void L(Graphics graphics) {
        if (this.keyProcess_nState != 768) {
            return;
        }
        int n = Constants.j + 1;
        int n2 = 16 + n * 18;
        int n3 = bz - n2 / 2;
        if (this.bS != -4132 || this.bT != -4132) {
            this.h(graphics);
            return;
        }
        PlayStage.a(graphics, by, n3, 150, n2, 17);
        graphics.setColor(0, 0, 255);
        graphics.fillRect(canvasWidth - (by + by / 2), n3 + 8 + 18 * this.bp, canvasWidth - by, 15);
        int n4 = 0;
        while (n4 < n) {
            this.utilService.a(graphics, this.cf[n4], by, n3 + 10 + n4 * 18, 17, 1);
            ++n4;
        }
        graphics.setColor(0x555555);
        graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
        this.utilService.a(graphics, this.cf[6], 0, canvasHeight, 36, 1);
        this.utilService.a(graphics, this.cf[7], canvasWidth, canvasHeight, 40, 1);
    }

    private void aF() {
        this.dN = 10;
        this.dO = 7;
        this.dP = 0;
        this.dQ = false;
        this.dR = 0;
        if (bu != 40) {
            bu = 0;
        }
    }

    private boolean aG() {
        this.dN += this.dO;
        if (++this.dR == 2) {
            this.bD();
            this.b(21, false);
        }
        if (this.dN + this.dO >= by) {
            this.dN = by;
            this.dP += !this.dQ ? 1 : -1;
            if (this.dP <= 3) {
                this.dN = this.dP <= 3 ? (this.dN += this.dP * 2) : (this.dN += this.dP - (this.dP >> 1) - 1);
            }
        }
        this.dO += !this.dQ ? 5 : -5;
        if (this.dO >= 100) {
            if (bu != 40) {
                bu = 2;
            }
            this.ai = null;
            System.gc();
            return true;
        }
        return false;
    }

    private void M(Graphics graphics) {
        int n = this.ai.getWidth();
        int n2 = this.ai.getHeight() >> 1;
        Util.a(graphics, this.ai, this.dN, bz, n, n2, 0, 0, 33);
        Util.a(graphics, this.ai, canvasWidth - this.dN, bz, n, n2, 0, 1, 17);
    }

    private void aH() {
        this.dN = 10;
        this.dO = 7;
        this.dP = 0;
        this.dQ = false;
        this.dR = 0;
        this.aj();
        this.nullSomeVariables();
        this.b(3);
        this.c(1);
        this.d(38);
        this.a(String.valueOf(Constants.C) + "_imgText");
        this.x = this.utilService.e(Constants.Y);
        this.utilService.unsetTheFileBytes();
        bu = 1;
    }

    private boolean aI() {
        this.dN += this.dO;
        ++this.dR;
        if (this.dN + this.dO >= by) {
            this.dN = by;
            this.dP += !this.dQ ? 1 : -1;
            if (this.dP <= 3) {
                this.dN = this.dP <= 3 ? (this.dN += this.dP * 2) : (this.dN += this.dP - (this.dP >> 1) - 1);
            }
        }
        this.dO += !this.dQ ? 5 : -5;
        if (!this.dQ && this.dO >= 100) {
            System.out.println("aaaaaaaaaaaaaaaaaa");
            if (this.bU) {
                this.aJ();
            } else {
                bu = 2;
                this.nullSomeVariables();
                this.b(3);
                this.d(41);
            }
            this.ai = null;
            System.gc();
            return true;
        }
        return false;
    }

    private void aJ() {
        int n = this.U > 6 ? 6 : this.U;
        try {
            this.b(this.X[n]);
        }
        catch (Throwable throwable) {}
        this.nullSomeVariables();
        this.b(4 + this.U);
        this.dateLong_StageText(3);
        this.d(42);
        this.bm = 9;
        this.ef = 0;
        this.ee = true;
        bu = 99;
        this.bU = false;
    }

    private void N(Graphics graphics) {
        int n = this.dm != -4132 ? 17 : this.cg[this.dl + 4].length * 17;
        int n2 = bz - n / 2;
        int n3 = this.x.getWidth();
        int n4 = this.x.getHeight() >> 1;
        Util.a(graphics, this.x, this.dN, n2 - n4, n3, n4, 0, 0, 33);
        Util.a(graphics, this.x, canvasWidth - this.dN, n2 - n4, n3, n4, 0, 1, 17);
        PlayStage.a(graphics, by, n2, 179, n + 20, 17);
        this.b(graphics, n2);
    }

    private void aK() {
        this.R = 0;
        this.bo = 0;
        bu = 9;
        this.bD();
        this.b(15, false);
    }

    private void O(Graphics graphics) {
        int n;
        int n2 = this.bc * 4 + 14;
        int n3 = by - n2 / 2;
        int n4 = this.bc + 10 + 17 + 10;
        int n5 = bz - n4 / 3 * 2;
        if (is3D) {
            n2 += 60;
            n3 -= 30;
            n4 += 30;
        }
        if (this.R >= 13) {
            this.R = -5;
        }
        PlayStage.a(graphics, n3, n5, n2, n4, 20);
        if (!is3D) {
            n = 0;
            while (n < 4) {
                this.aB[10 - n].a(graphics, n3 + 7 + this.bc * n + this.aL, n5 + 5 + this.aL);
                ++n;
            }
            this.aB[aU ? 18 : 19].a(graphics, n3 + 7 + this.bc * this.bo + this.aL, n5 + 5 + this.aL);
        } else {
            n = n2 / 4;
            graphics.drawImage(this.az[aT & 1], n3 + 22 + this.bo * n, n5 + 33, 33);
            int n6 = 0;
            while (n6 < 4) {
                graphics.drawImage(this.aC[4 - n6], n3 + 22 + n6 * n, n5 + 53, 33);
                ++n6;
            }
            graphics.drawImage(this.aA[aT & 1], n3 + 22 + this.bo * n, n5 + 43, 33);
        }
        n = 0;
        if (this.bo == 0) {
            n = 4;
        } else if (this.bo == 1) {
            n = 3;
        } else if (this.bo == 2) {
            n = 2;
        } else if (this.bo == 3) {
            n = 1;
        }
        this.utilService.a(graphics, this.cf[n], by, n5 + n4 - 5, 33, 1);
        graphics.setColor(0x555555);
        graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
        this.utilService.a(graphics, this.cf[8], 0, canvasHeight, 36, 1);
    }

    public final void d() {
        try {
            Constants.H = 0;
            bu = 44;
            this.bD();
            switch (Constants.G) {
                case 0: {
                    this.W = true;
                    this.V = false;
                    this.a(String.valueOf(Constants.C) + "_imgText");
                    this.aj = this.utilService.e(Constants.ac);
                    this.utilService.unsetTheFileBytes();
                    dS = 0;
                    this.b(16, false);
                    break;
                }
                case 1: {
                    this.W = true;
                    this.V = false;
                    this.a(String.valueOf(Constants.C) + "_imgText");
                    this.aj = this.utilService.e(Constants.ac);
                    this.utilService.unsetTheFileBytes();
                    dS = 1;
                    this.b(16, false);
                    break;
                }
                case 2: {
                    this.W = true;
                    this.a(String.valueOf(Constants.C) + "_imgText");
                    this.aj = this.utilService.e(Constants.ac);
                    this.utilService.unsetTheFileBytes();
                    this.V = false;
                    dS = 2;
                    this.b(16, false);
                    break;
                }
                case 20: {
                    this.a(String.valueOf(Constants.C) + "_imgText");
                    this.aj = this.utilService.e(Constants.aa);
                    this.utilService.unsetTheFileBytes();
                    this.V = true;
                    this.bm = 7;
                    this.b(24, false);
                    break;
                }
                case 30: {
                    this.a(String.valueOf(Constants.C) + "_imgText");
                    this.aj = this.utilService.e(Constants.ab);
                    this.utilService.unsetTheFileBytes();
                    this.V = false;
                    this.bm = 8;
                    this.b(16, false);
                }
            }
            this.a("ui_effect");
            this.ag = this.utilService.e(0);
            this.ah = this.utilService.e(2);
            this.utilService.unsetTheFileBytes();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private void P(Graphics graphics) {
        this.G(graphics);
    }

    private void a(Graphics graphics, int n, int n2, int n3) {
        if (bu == 2 || bu == 110) {
            if (!is3D) {
                n += be;
                n2 += bf;
            }
            if (n3 == 1 || n3 == 5) {
                int n4 = n;
                int n5 = n2;
                if (!is3D) {
                    this.aB[aU ? 18 : 19].a(graphics, n4 += this.aL, n5 += this.aL);
                    return;
                }
                if (!bG && bu == 2 && this.aA != null && this.az != null) {
                    n5 -= 8;
                    if (n3 == 1) {
                        graphics.drawImage(this.az[aT & 1], n4 - 13, n5 - 9, 20);
                        return;
                    }
                    graphics.drawImage(this.aA[aT & 1], n4 - 16, n5 - 4, 20);
                }
                return;
            }
            if (n3 == 3 || n3 == 4) {
                graphics.setColor(16384);
                int n6 = n;
                int n7 = n2;
                if (!is3D) {
                    this.aB[n + n2 % 2 == 0 ? 20 : 21].a(graphics, n + this.aL, n2 + this.aL);
                    n6 = n + (this.bc >> 1);
                    n7 = n2 + (this.bc >> 1);
                }
                graphics.drawRect(n6 - 2, n7 - 2, 4, 4);
                if (n3 == 3) {
                    graphics.setColor(65535);
                } else {
                    graphics.setColor(65280);
                }
                graphics.drawRect(n6 - 1, n7 - 1, 2, 2);
                graphics.setColor(0);
                graphics.drawRect(n6, n7, 0, 0);
            }
        }
    }

    private void a(Graphics graphics, int n, int n2, int n3, int n4) {
        if (bu == 2 || bu == 110) {
            if (!is3D) {
                this.aB[n3 == 1 ? ((n + n2) % 2 == 0 ? 22 : 23) : ((n + n2) % 2 == 0 ? 20 : 21)].a(graphics, this.ae(n) + this.aL + be, this.ag(n2) + this.aL + bf);
            } else {
                int[] nArray = new int[]{bg + Constants.S[n + n2 * 9], bg + Constants.S[n + n2 * 9 + 1], bg + Constants.S[n + (n2 + 1) * 9 + 1], bg + Constants.S[n + (n2 + 1) * 9]};
                int[] nArray2 = new int[]{bh + Constants.R[n2], bh + Constants.R[n2], bh + Constants.R[n2 + 1], bh + Constants.R[n2 + 1]};
                int[] nArray3 = new int[]{bg + Constants.S[n + n2 * 9] + 1, bg + Constants.S[n + n2 * 9 + 1] + 1, bg + Constants.S[n + (n2 + 1) * 9 + 1] + 1, bg + Constants.S[n + (n2 + 1) * 9] + 1};
                int[] nArray4 = new int[]{bh + Constants.R[n2] - 1, bh + Constants.R[n2] - 1, bh + Constants.R[n2 + 1] - 1, bh + Constants.R[n2 + 1] - 1};
                int n5 = 0;
                if (n3 == 0) {
                    n5 = 0xF9FF94;
                    if (ChessEngine.a[n + n2 * 8] != 0 && (ChessR.g != n || ChessR.h != n2)) {
                        n5 = 0xFF00FF;
                    }
                } else {
                    n5 = n3 == 1 ? 388864 : 0xFF6600;
                }
                if (bu == 110 || n4 != 0) {
                    n5 = 0xFF6600;
                }
                Util.a(graphics, nArray, nArray2, n5);
                Util.a(graphics, nArray3, nArray4, n5);
            }
            graphics.setColor(0x555555);
            graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
            this.utilService.a(graphics, this.cf[4], 0, canvasHeight, 36, 1);
            this.utilService.a(graphics, this.cf[5], canvasWidth, canvasHeight, 40, 1);
        }
    }

    private void Q(Graphics graphics) {
        if (!is3D) {
            this.aB[0].a(graphics, be, bf, 36);
            this.aB[1].a(graphics, be, bf + (this.bc << 3));
            this.aB[2].a(graphics, be - this.aB[2].width, bf - this.aB[0].height);
            this.aB[3].a(graphics, be + (this.bc << 3), bf - this.aB[0].height);
            int n = 0;
            while (n < 8) {
                int n2 = 0;
                while (n2 < 8) {
                    this.aB[(n + n2) % 2 == 0 ? 4 : 5].a(graphics, be + this.ae(n), bf + this.ag(n2));
                    ++n2;
                }
                ++n;
            }
            return;
        }
        if (is3D && this.aJ != null) {
            graphics.drawImage(this.aJ, by - 120, bz - 94, 20);
        }
    }

    private static void aL() {
        if (bu == 3) {
            return;
        }
        bu = 3;
    }

    public static LittleEndianInt[] e() {
        try {
            LittleEndianInt[] iArray;
            while (true) {
                iArray = ChessEngine.a();
                boolean bl = true;
                if (iArray == null) continue;
                int n = 0;
                while (n < iArray.length) {
                    if (iArray[n] == null) {
                        bl = false;
                        break;
                    }
                    ++n;
                }
                if (bl) break;
            }
            return iArray;
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void run() {
        this.dT = System.currentTimeMillis();
        while (true) {
            try {
                while (true) {
                    PlayStage c2 = this;
                    synchronized (c2) {
                        this.dU = System.currentTimeMillis();
                        if (this.dU - this.dT > this.dV) {
                            this.dT = this.dU;
                            if (this.bE && this.bD < aT) {
                                this.bF = true;
                            }
                            if (this.bF) {
                                this.o(this.bC);
                                this.bE = false;
                                this.bF = false;
                            }
                            this.i_storyTalk();
                            this.bC();
                            this.aO();
                            this.repaint();
                            this.serviceRepaints();
                        }
                    }
                    Thread.yield();
                }
            }
            catch (Exception exception) {
                continue;
            }
            // break;
        }
    }

    private void startGameThread() {
        if (this.f != null) {
            return;
        }

        this.bH = true;
        this.f = new Thread(this);
        this.f.start();
    }

    private void a(int n, boolean bl) {
        this.keyProcess_nState = n;
        this.isImgLoading = bl;
        System.out.println("setState = " + this.keyProcess_nState);
        this.bE = false;
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    private void i_storyTalk() {
        if (!this.isImgLoading) {
            return;
        }
        int n = 0;
        block10: do {
            switch (n == 0 ? this.keyProcess_nState : n) {
                case 2: {
                    bG = false;
                    this.b(0);
                    this.ac(0);
                    this.isImgLoading = false;
                    break;
                }
                case 3: {
                    bG = false;
                    this.nullSomeVariables();
                    this.b(0);
                    this.ac(1);
                    this.isImgLoading = false;
                    break;
                }
                case 4: {
                    this.ac(14);
                    this.cE = 0;
                    bG = true;
                    this.cD = true;
                    this.isImgLoading = false;
                    break;
                }
                case 6: {
                    this.bN = 0;
                    bG = true;
                    this.isImgLoading = false;
                    break;
                }
                case 256: {
                    this.R = 0;
                    this.bM = -4132;
                    @SuppressWarnings("unused")
                    int[][] nArrayArray = new int[][]{{26, 173}, {26, 180}, {26, 192}, {28, 211}, {35, 230}, {61, 244}};
                    this.data_Text(2);
                    n = 768;
                    continue block10;
                }
                case 259: {
                    System.out.println("updateData is3D = " + is3D);
                    this.aY = 1;
                    this.isImgLoading = false;
                    break;
                }
                case 592: {
                    System.out.println("PlayStage.i_storyTalk()");
                    this.p();
                    this.ab = null;
                    bG = true;
                    eh = true;
                    this.ee = true;
                    Constants.M = false;
                    ej = 0;
                    this.ef = 0;
                    this.dg = false;
                    int n2 = this.U > 6 ? 6 : this.U;
                    this.T[n2] = 1;
                    Constants.D = 1;
                    this.f();
                    this.bd();
                    this.cS = 0;
                    this.h = false;
                    this.isImgLoading = false;
                    this.bE = false;
                    this.aY = 0;
                    break;
                }
                case 768: {
                    bG = false;
                    this.isImgLoading = false;
                    break;
                }
            }
            break;
        } while (true);
        System.out.println("isImgLoading = " + this.isImgLoading);
    }

    private void R(Graphics graphics) {
        graphics.setColor(0);
        graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
        graphics.drawImage(Util.GetImageByImagePath("/" + Constants.C + ".png"), this.getWidth() / 2, this.getHeight() / 2, 17);
    }

    public final void paint(Graphics graphics) {
        this.e = graphics;
        if (this.getWidth() > 300) {
            this.R(graphics);
            return;
        }
        if (this.isImgLoading) {
            return;
        }
        PlayStage.V(graphics);
        switch (this.keyProcess_nState) {
            case 0: {
                this.l();
                return;
            }
            case 2: {
                this.b(graphics);
                return;
            }
            case 3: {
                this.c(graphics);
                return;
            }
            case 4: {
                this.a(graphics);
                return;
            }
            case 6: {
                this.d(graphics);
                return;
            }
            case 256: {
                this.e(graphics);
                return;
            }
            case 512: {
                this.f(graphics);
                return;
            }
            case 769: {
                this.E(graphics);
                return;
            }
            case 257: {
                this.g(graphics);
                return;
            }
            case 258: {
                this.j(graphics);
                return;
            }
            case 272: {
                this.k(graphics);
                return;
            }
            case 273: {
                this.l(graphics);
                return;
            }
            case 2048: {
                this.p(graphics);
                return;
            }
            case 2304: {
                this.q(graphics);
                return;
            }
            case 259: {
                this.d_LoadResource();
                return;
            }
            case 592: {
                this.x(graphics);
                return;
            }
            case 593: {
                this.x(graphics);
                return;
            }
            case 594: {
                this.y(graphics);
                return;
            }
            case 595: {
                this.A(graphics);
                return;
            }
            case 596: {
                this.z(graphics);
                return;
            }
            case 597: {
                this.B(graphics);
                return;
            }
            case 624: {
                this.r(graphics);
                return;
            }
            case 768: {
                this.D(graphics);
                return;
            }
            case 4626: {
                this.T(graphics);
                return;
            }
            case 210: 
            case 1280: {
                this.d_option(graphics);
                return;
            }
            case 220: 
            case 1536: {
                this.o(graphics);
                return;
            }
            case 26214: {
                graphics.setColor(0);
                graphics.fillRect(0, 0, canvasWidth, canvasHeight);
                graphics.setColor(0xFFFFFF);
                graphics.drawString("<5>", by, bz, 17);
            }
        }
    }

    private void aO() {
        if (this.aY != 0) {
            return;
        }
        switch (this.keyProcess_nState) {
            case 2: {
                break;
            }
            case 3: {
                break;
            }
            case 256: {
                break;
            }
            case 512: {
                break;
            }
            case 273: {
                this.w();
                break;
            }
            case 769: {
                break;
            }
            case 596: {
                this.af();
            }
            case 592: 
            case 593: 
            case 594: 
            case 595: {
                break;
            }
            case 768: {
                this.at();
            }
        }
        PlayStage.ba();
        this.bb();
    }

    private int n(int n) {
        int n2 = n == this.n ? -1 : (n == this.o ? -2 : (n == this.p ? -3 : (n == this.q ? -4 : (n == this.r ? -5 : (n == this.s ? -8 : (n == this.t ? -6 : (n == this.u ? -7 : n)))))));
        return n2;
    }

    public final void keyPressed(int n) {
        if (this.bE || bG || this.isImgLoading) {
            return;
        }
        int n2 = this.n(n);
        this.bE = true;
        this.bD = aT;
        this.bC = n2;
    }

    public final void keyReleased(int n) {
        if (bG) {
            return;
        }
    }

    private void o(int n) {
        System.out.println("keyProcess_nState = " + this.keyProcess_nState);
        if (this.aY != 0) {
            return;
        }
        if (this.dW) {
            this.dW = false;
            return;
        }
        if (n == -7) {
            if (this.k >= 1) {
                return;
            }
            this.k = 1;
        }
        switch (this.keyProcess_nState) {
            case 2: {
                this.p(n);
                return;
            }
            case 3: {
                this.q(n);
                return;
            }
            case 4: {
                return;
            }
            case 256: {
                this.r(n);
                return;
            }
            case 512: {
                this.s(n);
                return;
            }
            case 257: {
                this.k_fmStory(n);
                return;
            }
            case 258: {
                this.u(n);
                return;
            }
            case 272: {
                this.v(n);
                return;
            }
            case 273: {
                this.w(n);
                return;
            }
            case 2048: {
                this.x(n);
                return;
            }
            case 2304: {
                this.y(n);
                return;
            }
            case 769: {
                this.z(n);
                return;
            }
            case 592: {
                this.A(n);
                return;
            }
            case 593: {
                this.B(n);
                return;
            }
            case 594: {
                this.C(n);
                return;
            }
            case 595: {
                this.D(n);
                return;
            }
            case 596: {
                this.E(n);
                return;
            }
            case 597: {
                this.F(n);
                return;
            }
            case 624: {
                this.G(n);
                return;
            }
            case 768: {
                this.H(n);
                return;
            }
            case 4626: {
                this.I(n);
                return;
            }
            case 210: 
            case 1280: {
                this.J(n);
                return;
            }
            case 220: 
            case 1536: {
                this.K(n);
                return;
            }
            case 26214: {
                this.T(n);
            }
        }
    }

    private void p(int n) {
        switch (n) {
            case -2: {
                if (Constants.v < 5) {
                    ++Constants.v;
                    return;
                }
                if (Constants.v < 5) break;
                Constants.v = 0;
                return;
            }
            case -1: {
                if (Constants.v > 0) {
                    --Constants.v;
                    return;
                }
                if (Constants.v > 0) break;
                Constants.v = 5;
                return;
            }
            case -6: 
            case -5: {
                this.bP[1] = Constants.v;
                Constants.C = this.bP[1];
                this.a(3, true);
            }
        }
    }

    private void q(int n) {
        switch (n) {
            case -6: {
                this.bP[0] = 1;
                this.a(4, true);
                return;
            }
            case -7: {
                Constants.soundVolumeLevel = 0;
                this.bP[0] = 0;
                this.a(4, true);
            }
        }
    }

    private void r(int n) {
        if (this.bM != -4132) {
            return;
        }
        switch (n) {
            case 53: {
                this.bM = 0;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void s(int n) {
        if (this.bM != -4132) {
            return;
        }
        if (this.bR == -4132) {
            switch (n) {
                case -1: 
                case 50: {
                    if (--this.bp >= 0) return;
                    this.bp = PlayStage.S(512);
                    return;
                }
                case -2: 
                case 56: {
                    if (++this.bp <= PlayStage.S(512)) return;
                    this.bp = 0;
                    return;
                }
                case -3: 
                case 52: {
                    return;
                }
                case -4: 
                case 54: {
                    return;
                }
                case -6: 
                case -5: {
                    this.bD();
                    this.b(20, false);
                    switch (this.bp) {
                        case 0: {
                            this.bM = 0;
                            this.r();
                            return;
                        }
                        case 1: {
                            this.bM = 0;
                            this.t();
                            return;
                        }
                        case 2: {
                            this.bM = 0;
                            this.y();
                            return;
                        }
                        case 3: {
                            this.bM = 0;
                            this.nullSomeVariables();
                            this.b(1);
                            this.z();
                            return;
                        }
                        case 4: {
                            this.bM = 0;
                            this.G();
                            return;
                        }
                        case 5: {
                            if (!Constants.isMoreGamesOn) {
                                this.bR = 0;
                                this.data_Text(18);
                                this.d(4);
                                return;
                            }
                            try {
                                // this.a.platformRequest(GameConfig.c);
                                this.a.destroyApp(false);
                                this.a.notifyDestroyed();
                                return;
                            }
                            catch (Exception exception) {
                                return;
                            }
                        }
                        case 6: {
                            if (!Constants.isMoreGamesOn) return;
                            this.bR = 0;
                            this.data_Text(18);
                            this.d(4);
                        }
                    }
                }
            }
            return;
        }
        switch (n) {
            case 49: {
                this.a.destroyApp(false);
                this.bR = -4132;
                return;
            }
            case 50: {
                this.ac(3);
                this.bR = -4132;
                return;
            }
        }
    }

    private void k_fmStory(int n) {
        block25: {
            block24: {
                if (this.bQ != -4132) break block24;
                switch (n) {
                    case -1: 
                    case 50: {
                        if (--this.bp < 0) {
                            this.bp = this.bq;
                            return;
                        }
                        break block25;
                    }
                    case -2: 
                    case 56: {
                        if (++this.bp > this.bq) {
                            this.bp = 0;
                            return;
                        }
                        break block25;
                    }
                    case -3: 
                    case 52: {
                        return;
                    }
                    case -4: 
                    case 54: {
                        return;
                    }
                    case -6: 
                    case -5: {
                        Constants.L = true;
                        bk = 0;
                        if (this.bp == 0) {
                            this.h = false;
                            if (Constants.D == 0) {
                                this.aw();
                                return;
                            }
                            this.bQ = 1;
                            return;
                        }
                        if (this.bp == 1) {
                            this.bc();
                            System.out.println("PlayStage.k_fmStory() _nSituation = " + this.bm);
                            if (Constants.x) {
                                this.h = true;
                                this.aY();
                                this.I();
                                this.R(100);
                                this.bc();
                                this.bU = true;
                            } else if (Constants.y == 593) {
                                this.h = false;
                                this.aY();
                                this.ac();
                            } else if (Constants.D == 0) {
                                this.data_Text(16);
                                this.bM = 0;
                                bG = true;
                                this.cH = true;
                            } else {
                                Constants.f = true;
                                this.a(259, true);
                            }
                            Constants.L = true;
                            return;
                        }
                        break block25;
                    }
                    case -7: {
                        this.q();
                    }
                    default: {
                        return;
                    }
                }
            }
            if (this.bQ == 1) {
                switch (n) {
                    case 49: {
                        this.aw();
                    }
                    case 50: {
                        this.bQ = -4132;
                    }
                }
            }
        }
    }

    private void u(int n) {
        if (this.cI) {
            this.cI = false;
            return;
        }
        switch (n) {
            case -1: 
            case 50: {
                if (--this.bp >= 0) break;
                this.bp = this.bq;
                return;
            }
            case -2: 
            case 56: {
                if (++this.bp <= this.bq) break;
                this.bp = 0;
                return;
            }
            case -6: 
            case -5: {
                if (cJ[this.bp] == 0) {
                    this.data_Text(16);
                    this.cI = true;
                } else {
                    this.h = true;
                    this.aY();
                    this.I();
                    this.E = cJ[this.bp] - 1;
                    this.R(this.bp);
                }
                this.bD();
                this.b(20, false);
                return;
            }
            case -7: {
                if (this.bs == 257) {
                    this.aY();
                    this.r();
                    return;
                }
                this.aY();
                this.t();
                this.bp = 2;
            }
        }
    }

    private void v(int n) {
        switch (n) {
            case -1: 
            case 50: {
                if (--this.bp >= 0) break;
                this.bp = this.bq - 1;
                return;
            }
            case -2: 
            case 56: {
                if (++this.bp <= this.bq - 1) break;
                this.bp = 0;
                return;
            }
            case -3: 
            case 52: {
                return;
            }
            case -4: 
            case 54: {
                return;
            }
            case -6: 
            case -5: {
                this.bD();
                this.b(20, false);
                if (this.bp == 0) {
                    bk = 0;
                    this.u();
                    return;
                }
                if (this.bp == 1) {
                    bk = 2;
                    this.h = false;
                    bL = 0;
                    bl = 0;
                    this.M();
                    return;
                }
                if (this.bp != 2) break;
                this.s();
                return;
            }
            case -7: {
                this.q();
            }
        }
    }

    private void w(int n) {
        if (this.cO != -4132) {
            return;
        }
        if (this.cP != -4132) {
            if (n == 53 || n == -5 || n == -7) {
                this.cP = -4132;
            }
            return;
        }
        switch (n) {
            case -1: 
            case 50: {
                if (--this.bp < 0) {
                    this.bp = 6;
                }
                this.cO = -4132;
                return;
            }
            case -2: 
            case 56: {
                if (++this.bp > 6) {
                    this.bp = 0;
                }
                this.cO = -4132;
                return;
            }
            case -3: 
            case 52: {
                return;
            }
            case -4: 
            case 54: {
                return;
            }
            case -6: 
            case -5: {
                if (this.T[this.bp] == 1) {
                    System.out.println("111111111111111111");
                    Constants.L = false;
                    this.E = this.bp;
                    this.h = false;
                    this.M();
                } else {
                    this.data_Text(15);
                    this.cP = 0;
                }
                this.bD();
                this.b(20, false);
                return;
            }
            case -7: {
                this.t();
            }
        }
    }

    private void x(int n) {
        switch (n) {
            case -1: 
            case 50: {
                this.bp = 0;
                return;
            }
            case -2: 
            case 56: {
                this.bp = 1;
                return;
            }
            case -3: 
            case 52: {
                this.cW = this.cW == 0 ? 3 : 0;
                this.bp = 0;
                return;
            }
            case -4: 
            case 54: {
                this.cW = this.cW == 0 ? 3 : 0;
                this.bp = 0;
                return;
            }
            case -7: {
                this.C();
                this.q();
            }
        }
    }

    private void y(int n) {
        switch (n) {
            case -1: 
            case 50: {
                if (--this.bp >= 0) break;
                this.bp = this.bq;
                return;
            }
            case -2: 
            case 56: {
                if (++this.bp <= this.bq) break;
                this.bp = 0;
                return;
            }
            case -3: 
            case 52: {
                return;
            }
            case -4: 
            case 54: {
                return;
            }
            case -5: 
            case 53: {
                return;
            }
            case -7: {
                this.q();
            }
        }
    }

    private void z(int n) {
        if (n == -6 || n == -5) {
            if (++this.dy >= 4) {
                this.dy = 4;
            }
            switch (this.dy) {
                case 0: {
                    this.cp = this.cp;
                    this.ci = this.ci;
                    break;
                }
                case 1: {
                    this.cp = this.cq;
                    this.ci = this.cj;
                    break;
                }
                case 2: {
                    this.cp = this.cr;
                    this.ci = this.ck;
                    break;
                }
                case 3: {
                    this.cp = this.cs;
                    this.ci = this.cl;
                }
            }
            if (this.dy != 4) {
                this.b(18, false);
                this.ax();
                ej = 0;
                eh = false;
                this.dz = false;
                return;
            }
            this.bD();
            this.ay();
            bG = false;
            this.p();
            this.n();
            this.ay();
            this.U = 0;
            this.ek = true;
            this.ad();
            return;
        }
        if (n == -7 && this.dy != 3) {
            this.bD();
            this.ay();
            bG = false;
            this.p();
            this.n();
            this.ay();
            this.U = 0;
            this.ek = true;
            this.ad();
        }
    }

    private void A(int n) {
        if (!eh) {
            return;
        }
        if (this.I(n)) {
            this.M();
        }
    }

    private void B(int n) {
        if (this.dg) {
            return;
        }
        if (this.I(n) || Constants.M) {
            if (!this.V) {
                this.ag();
                return;
            }
            this.dg = true;
            this.cS = 6;
        }
    }

    private void C(int n) {
        if (this.cS != -4132) {
            return;
        }
        if (n == 53 || n == -5 || n == -6) {
            this.cS = 0;
        }
    }

    private void D(int n) {
        if (n == 49) {
            this.br();
            this.bu();
            this.bt();
            if (this.aa[this.U] != 0) {
                this.ae();
            } else {
                this.M();
            }
            Constants.M = false;
            return;
        }
        if (n == 50) {
            this.q();
        }
    }

    private void E(int n) {
        if (!eh) {
            return;
        }
        if (this.I(n) && Constants.N == -4132) {
            this.h = false;
            this.M();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void F(int n) {
        if (n == -6 || n == -5) {
            if (this.U != 7) {
                if (this.dh >= 3) return;
                this.bD();
                this.b(18, false);
                ++this.cy;
                ++this.dh;
                this.dz = true;
                ei = false;
                return;
            }
            this.U = 0;
            this.f();
            this.bd();
            this.q();
            return;
        }
        if (n != -7 || this.U == 7 || this.dh >= 2) return;
        this.dh = 3;
        this.dz = true;
        ei = false;
    }

    private void G(int n) {
        if (n == 49) {
            Constants.E = 1;
            is3D = true;
            this.J();
            this.H();
            return;
        }
        if (n == 50) {
            Constants.E = 0;
            is3D = false;
            this.J();
            this.H();
        }
    }

    private void H(int n) {
        if (n == 48 && Constants.isCheatModeOn) {
            this.bz();
        }
        block0 : switch (bu) {
            case 99: {
                if (!this.I(n)) break;
                this.bu();
                this.bt();
                this.nullSomeVariables();
                this.b(3);
                this.d(41);
                bu = 2;
                return;
            }
            case 9: {
                this.L(n);
                return;
            }
            case 110: {
                this.k_makePiece(n);
                return;
            }
            case 114: {
                this.l(n);
                return;
            }
            case 100: {
                this.k_skillPopup(n);
                return;
            }
            case 101: {
                this.m(n);
                return;
            }
            case 200: {
                this.N(n);
                return;
            }
            case 160: {
                return;
            }
            case 8: 
            case 44: 
            case 1000: {
                return;
            }
            case 48: {
                if (n != 53 && n != -5 && n != -6) break;
                this.au();
                return;
            }
            case 2457: {
                this.O(n);
                return;
            }
            case 150: {
                this.I(n);
                return;
            }
            case 2: {
                if (!Constants.I) {
                    if (n == 48) {
                        this.Z();
                    }
                    if (n == -6) {
                        this.aS();
                    }
                    if (n == 42 || n == 35) break;
                    if (n == -7) {
                        if (bk == 2) break;
                        Constants.I = true;
                        return;
                    }
                    this.ai(n);
                    return;
                }
                if (n == -6 || n == -5) {
                    switch (Constants.J) {
                        case 0: {
                            if (bk == 2) break block0;
                            this.az();
                            return;
                        }
                        case 1: {
                            if (!Constants.L) break block0;
                            this.aD();
                        }
                    }
                    return;
                }
                if (n == 50 || n == -1) {
                    if (!Constants.L || --Constants.J >= 0) break;
                    Constants.J = 1;
                    return;
                }
                if (n == 56 || n == -2) {
                    if (!Constants.L || ++Constants.J <= Constants.K) break;
                    Constants.J = 0;
                    return;
                }
                if (n != -7) break;
                Constants.I = false;
                Constants.J = 0;
            }
        }
    }

    private boolean I(int n) {
        boolean bl = false;
        if (n == -5 || n == -6 || n == -7) {
            if (this.ef < Constants.U[this.U][this.bm].length - 1 && n == -7) {
                this.ee = false;
                bl = true;
            } else if (this.ef < Constants.U[this.U][this.bm].length - 1 || n == -6 || n == -5) {
                ++this.ef;
            }
            if (this.ef >= Constants.U[this.U][this.bm].length) {
                if (n == -6 || n == -5) {
                    this.ee = false;
                    bl = true;
                } else {
                    bl = false;
                }
            }
        }
        return bl;
    }

    private void J(int n) {
        int n2;
        @SuppressWarnings("unused")
        int n3 = n2 = Constants.E == 1 ? 0 : 1;
        if (Constants.L) {
            --n2;
        }
        block0 : switch (n) {
            case -1: 
            case 50: {
                if (--this.bp >= 1) break;
                this.bp = this.bq - n2;
                return;
            }
            case -2: 
            case 56: {
                if (++this.bp <= this.bq - n2) break;
                this.bp = 1;
                return;
            }
            case -4: 
            case -3: 
            case 52: 
            case 54: {
                switch (this.bp) {
                    case 1: {
                        if (Constants.forcedLocaleLanguageCode != 6) break block0;
                        if (n == -3 || n == 52) {
                            if (--Constants.v < 0) {
                                Constants.v = 5;
                            }
                        } else if ((n == -4 || n == 54) && ++Constants.v > 5) {
                            Constants.v = 0;
                        }
                        this.bP[1] = Constants.v;
                        Constants.C = this.bP[1];
                        return;
                    }
                    case 2: {
                        if (n == -3 || n == 52) {
                            if (--Constants.soundVolumeLevel < 0) {
                                Constants.soundVolumeLevel = 2;
                            }
                        } else if ((n == -4 || n == 54) && ++Constants.soundVolumeLevel > 2) {
                            Constants.soundVolumeLevel = 0;
                        }
                        this.bP[0] = Constants.soundVolumeLevel == 0 ? 0 : 1;
                        this.bD();
                        this.b(0, false);
                        return;
                    }
                    case 3: {
                        Constants.E ^= 1;
                        return;
                    }
                    case 4: {
                        Constants.B ^= 1;
                        return;
                    }
                    case 5: {
                        if (Constants.E == 1) {
                            Constants.F ^= 1;
                            return;
                        }
                        if (n == -3 || n == 52) {
                            Constants.w ^= 1;
                            return;
                        }
                        Constants.w ^= 1;
                        return;
                    }
                    case 6: {
                        this.f(n);
                    }
                }
                return;
            }
            case -5: 
            case 53: {
                this.f();
                return;
            }
            case -7: {
                if (this.keyProcess_nState == 210) {
                    this.keyProcess_nState = 768;
                    this.nullSomeVariables();
                    this.b(3);
                    this.d(39);
                    if (is3D != (Constants.E == 1)) {
                        this.aY = 1;
                        is3D = Constants.E == 1;
                        Constants.f = false;
                        this.a(259, true);
                    }
                    this.bq = PlayStage.S(200);
                    this.bp = 1;
                } else {
                    this.q();
                }
                this.f();
            }
        }
    }

    private void K(int n) {
        block60: {
            block0 : switch (this.cT) {
                case 0: {
                    switch (n) {
                        case -1: 
                        case 50: {
                            if (--this.bp >= 0) break block0;
                            this.bp = this.bq;
                            return;
                        }
                        case -2: 
                        case 56: {
                            if (++this.bp <= this.bq) break block0;
                            this.bp = 0;
                            return;
                        }
                        case -6: 
                        case -5: {
                            if (this.bp == 0) {
                                this.D();
                            } else if (this.bp == 1) {
                                this.bp = 0;
                                this.E();
                            } else if (this.bp == 2) {
                                this.F();
                            }
                            this.bD();
                            this.b(1, false);
                            return;
                        }
                        case -7: {
                            this.C();
                            if (this.keyProcess_nState == 220) {
                                this.nullSomeVariables();
                                this.b(3);
                                this.d(39);
                                this.keyProcess_nState = 768;
                                this.bq = PlayStage.S(200);
                                this.bp = 3;
                                return;
                            }
                            this.q();
                        }
                    }
                    return;
                }
                case 1: {
                    switch (n) {
                        case -3: 
                        case 52: {
                            if (this.cz <= 0) break block0;
                            --this.cz;
                            return;
                        }
                        case -4: 
                        case 54: {
                            if (this.cz >= this.cA - 1) break block0;
                            ++this.cz;
                            return;
                        }
                        case -7: {
                            this.cz = 0;
                            this.z();
                            this.cB = 0;
                            this.bp = 0;
                        }
                    }
                    return;
                }
                case 2: {
                    switch (n) {
                        case -3: 
                        case 52: {
                            if (this.cz > 0) {
                                --this.cz;
                            }
                            this.cB = 0;
                            if (this.cp != 1) {
                                if (this.cz == 0 || this.cz == 1) {
                                    this.bp = 0;
                                    return;
                                }
                                this.bp = this.cz - 1;
                                return;
                            }
                            this.bp = this.cz;
                            return;
                        }
                        case -4: 
                        case 54: {
                            if (this.cz < this.cp + this.cq + this.cr + this.cs + this.ct + this.cu - 1) {
                                ++this.cz;
                            }
                            this.cB = 0;
                            if (this.cp != 1) {
                                if (this.cz == 0 || this.cz == 1) {
                                    this.bp = 0;
                                    return;
                                }
                                this.bp = this.cz - 1;
                                return;
                            }
                            this.bp = this.cz;
                            return;
                        }
                        case -6: 
                        case -5: {
                            return;
                        }
                        case -7: {
                            this.cz = 0;
                            this.z();
                            this.bp = 1;
                            this.v = null;
                        }
                    }
                    return;
                }
                case 3: {
                    switch (n) {
                        case -1: 
                        case 50: {
                            if (!this.cU && --this.bp < 0) {
                                this.bp = this.bq;
                                return;
                            }
                            break block60;
                        }
                        case -2: 
                        case 56: {
                            if (!this.cU && ++this.bp > this.bq) {
                                this.bp = 0;
                                return;
                            }
                            break block60;
                        }
                        case -3: 
                        case 52: {
                            if (this.cU && this.cy > 0) {
                                --this.cy;
                                return;
                            }
                            break block60;
                        }
                        case -4: 
                        case 54: {
                            if (this.cU) {
                                switch (this.bp) {
                                    case 0: {
                                        this.co = this.cp;
                                        break;
                                    }
                                    case 1: {
                                        this.co = this.cq;
                                        break;
                                    }
                                    case 2: {
                                        this.co = this.cr;
                                        break;
                                    }
                                    case 3: {
                                        this.co = this.cs;
                                        break;
                                    }
                                    case 4: {
                                        this.co = this.ct;
                                        break;
                                    }
                                    case 5: {
                                        this.co = this.cu;
                                        break;
                                    }
                                    case 6: {
                                        this.co = this.cv;
                                        break;
                                    }
                                    case 7: {
                                        this.co = this.cw;
                                    }
                                }
                                if (this.cy < this.co - 1) {
                                    ++this.cy;
                                    return;
                                }
                            }
                            break block60;
                        }
                        case -6: 
                        case -5: {
                            if (!this.cU) {
                                this.cU = true;
                                this.bD();
                                this.b(0, false);
                                return;
                            }
                            break block60;
                        }
                        case -7: {
                            this.v = null;
                            if (this.cU) {
                                this.cU = false;
                                return;
                            }
                            this.z();
                            this.bp = 2;
                        }
                    }
                }
            }
        }
    }

    private void aP() {
        this.bn();
        bu = 158;
        this.d(41);
        ChessEngine.d();
        ChessEngine.a(5);
        bG = true;
        ChessEngine.c = null;
        this.bJ = null;
        chessEngine.c();
        while (ChessEngine.c == null) {
            PlayStage.ba();
            this.repaint(0, 0, canvasWidth, canvasHeight);
            this.serviceRepaints();
            this.e(300);
        }
        this.bJ = ChessEngine.c;
        ChessEngine.i();
        ChessEngine.c = null;
        ChessEngine.d = false;
        bu = 2;
        ChessEngine.a(this.E);
        bG = false;
        int n = this.bp;
        this.aw[n] = this.aw[n] - 1;
    }

    private void aQ() {
        this.bn();
        if (!this.aR()) {
            bu = 2;
            this.data_Text(26);
            this.W();
            return;
        }
        this.d(41);
        ChessR.c = null;
        this.bJ = null;
        bu = 2;
        int n = this.bp;
        this.aw[n] = this.aw[n] - 1;
    }

    private boolean aR() {
        byte[] byArray = null;
        if (et == null) {
            return false;
        }
        int n = et.size();
        if (n <= 0) {
            return false;
        }
        byArray = (byte[])et.elementAt(--n);
        et.removeElementAt(n);
        j = byArray[65] != 0;
        byte[] byArray2 = new byte[65];
        System.arraycopy(byArray, 0, byArray2, 0, 65);
        this.b(byArray2);
        if (bk == 2) {
            af = (bl ^= 1) == 1;
            this.b();
        }
        return true;
    }

    private void aS() {
        this.bt = bu;
        bu = 200;
        this.bp = 0;
        this.bq = PlayStage.S(200);
        this.b(20, false);
        try {
            System.out.println("i_gmenui_gmenui_gmenu");
            this.nullSomeVariables();
            this.b(3);
            this.d(39);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private void aT() {
        bu = this.bt;
        this.d(41);
    }

    private void L(int n) {
        switch (n) {
            case -3: 
            case 52: {
                if (--this.bo >= 0) break;
                this.bo = Constants.i;
                return;
            }
            case -4: 
            case 54: {
                if (++this.bo <= Constants.i) break;
                this.bo = 0;
                return;
            }
            case -6: 
            case -5: 
            case 53: {
                this.n();
                if (is3D) {
                    this.a(false);
                }
                int n2 = 5 - this.bo;
                LittleEndianInt[] iArray = PlayStage.i();
                byte by = 0;
                int n3 = iArray.length;
                int n4 = 0;
                while (n4 < n3) {
                    LittleEndianInt i2 = iArray[n4];
                    if (i2.a == ChessR.h * 8 + ChessR.g && i2.b == ChessR.f * 8 + ChessR.e && (i2.d == n2 || i2.d == -n2)) {
                        by = i2.b;
                        ChessR.r = (byte)n2;
                        ChessR.s = (byte)ChessR.n[by];
                        this.b(i2);
                        if (bk != 2) break;
                        ChessR.c = i2;
                        this.bJ = null;
                        break;
                    }
                    ++n4;
                }
                bK = false;
                ChessR.h = -1;
                ChessR.g = -1;
                bL = 1;
                bu = 3;
                this.bo = 0;
                if (ChessR.r != 0 && ChessR.s != 0) {
                    bb = 0;
                }
                if (ChessEngine.b(ChessEngine.l) && !bI) {
                    dv = 0;
                    audioService.setVolumeLevel(1000);
                }
                ChessR.b();
                if (bk == 2) break;
                af = false;
            }
        }
    }

    private void k_skillPopup(int n) {
        if (Constants.H != -4132 || this.dB != -4132) {
            return;
        }
        System.out.println("PlayStage.k_skillPopup()" + n);
        switch (n) {
            case -3: 
            case 52: {
                if (bk == 2) {
                    this.bp = this.bp == 2 ? 3 : 2;
                } else if (--this.bp < 0) {
                    this.bp = this.bq;
                }
                this.dE = 0;
                return;
            }
            case -4: 
            case 54: {
                if (bk == 2) {
                    this.bp = this.bp == 2 ? 3 : 2;
                } else if (++this.bp > this.bq) {
                    this.bp = 0;
                }
                this.dE = 0;
                return;
            }
            case -6: 
            case -5: {
                if (this.aw[this.bp] <= 0) {
                    Constants.H = 0;
                    Constants.I = false;
                    Constants.J = 0;
                    return;
                }
                this.dB = 0;
                this.bD();
                this.b(23, false);
                Constants.I = false;
                Constants.J = 0;
                return;
            }
        }
        if (-7 == n && this.dC) {
            this.dC = false;
            this.dD = 4;
            Constants.I = false;
            Constants.J = 0;
            this.bD();
            this.b(17, false);
        }
    }

    private void N(int n) {
        block24: {
            block23: {
                if (this.bS != -4132 || this.bT != -4132) break block23;
                switch (n) {
                    case -1: 
                    case 50: {
                        if (--this.bp < 0) {
                            this.bp = this.bq;
                            return;
                        }
                        break block24;
                    }
                    case -2: 
                    case 56: {
                        if (++this.bp > this.bq) {
                            this.bp = 0;
                            return;
                        }
                        break block24;
                    }
                    case -3: 
                    case 52: {
                        return;
                    }
                    case -4: 
                    case 54: {
                        return;
                    }
                    case -6: 
                    case -5: {
                        switch (this.bp) {
                            case 0: {
                                this.bD();
                                this.b(20, false);
                                bu = 2;
                                this.d(41);
                                return;
                            }
                            case 1: {
                                this.bD();
                                this.b(20, false);
                                this.y();
                                return;
                            }
                            case 2: {
                                this.bD();
                                this.b(20, false);
                                this.aU();
                                return;
                            }
                            case 3: {
                                this.bD();
                                this.b(20, false);
                                this.nullSomeVariables();
                                this.b(1);
                                this.z();
                                return;
                            }
                            case 4: {
                                this.bD();
                                this.b(20, false);
                                this.data_Text(33);
                                this.bT = 0;
                                return;
                            }
                            case 5: {
                                this.bD();
                                this.b(20, false);
                                this.data_Text(32);
                                this.bS = 0;
                            }
                        }
                        return;
                    }
                    case -7: {
                        bu = 2;
                        this.d(41);
                    }
                    default: {
                        return;
                    }
                }
            }
            switch (n) {
                case 49: {
                    this.bD();
                    this.b(20, false);
                    if (this.bS == 0) {
                        this.bS = -4132;
                        this.K();
                        return;
                    }
                    if (this.bT != 0) break;
                    this.bT = -4132;
                    this.aV();
                    return;
                }
                case 50: {
                    this.bT = -4132;
                    this.bS = -4132;
                }
            }
        }
    }

    private void aU() {
        if (Constants.L) {
            bG = true;
            this.aW();
            this.aY();
            this.Q(100);
            this.f();
            this.bd();
            Constants.D = 1;
            Constants.H = 0;
            this.av = -4132;
            return;
        }
        this.aW();
    }

    private void aV() {
        bu = 44;
        Constants.G = 30;
        Constants.H = 0;
        this.a(String.valueOf(Constants.C) + "_imgText");
        this.aj = this.utilService.e(Constants.ab);
        this.utilService.unsetTheFileBytes();
        this.a("ui_effect");
        this.ag = this.utilService.e(0);
        this.ah = this.utilService.e(2);
        this.utilService.unsetTheFileBytes();
        this.V = false;
        PlayStage.P(44);
        this.bD();
        this.b(16, false);
        if (!Constants.L && bk != 2) {
            this.dX = true;
            ++this.I;
            this.F -= 50;
            if (this.F < 0) {
                this.F = 0;
            }
        }
    }

    private void aW() {
        this.bt = bu;
        bu = 2457;
        this.bq = PlayStage.S(2457);
        this.bp = 0;
        this.aX();
    }

    private void aX() {
        this.as = new Image[2];
        try {
            this.as[0] = Image.createImage((String)"/img/slot_0.png");
            this.as[1] = Image.createImage((String)"/img/slot_1.png");
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private void aY() {
        this.as = null;
        System.gc();
    }

    private void S(Graphics graphics) {
        int n = bz - 67;
        if (!Constants.L) {
            int n2 = 0;
            PlayStage.a(graphics, by, n - 5, 176, 159, 17);
            int n3 = 0;
            while (n3 < 3) {
                n2 = n + 45 * n3;
                if (n2 + 45 < canvasHeight) {
                    if (this.bp == n3) {
                        graphics.setColor(0xC8C8C8);
                        Util.a(graphics, by, n2 + 1, 164, 43, 17);
                    }
                    this.a(graphics, this.as[this.bp == n3 ? 0 : 1], by, n2, 166, 45, 17);
                    if (ax[n3] == null) {
                        PlayStage.ax[n3] = " - ";
                    }
                    this.utilService.a(graphics, ax[n3].getBytes(), by, n2 + 22 - 8, 17, 0);
                }
                ++n3;
            }
            if (this.keyProcess_nState == 768) {
                graphics.setColor(0x555555);
                graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
                this.utilService.a(graphics, this.cf[6], 0, canvasHeight, 36, 1);
                this.utilService.a(graphics, this.cf[7], canvasWidth, canvasHeight, 40, 1);
            }
        }
        if (this.av != -4132) {
            String string = "\uc800\uc7a5 \ud30c\uc77c\uba85\uc744 \uc785\ub825\ud558\uc138\uc694.";
            PlayStage.a(graphics, by, n - 15, 176, 27, 33);
            graphics.setColor(0xFFFFFF);
            graphics.drawString(string, by, n - 19, 33);
        }
        if (Constants.H != -4132) {
            graphics.setColor(0);
            graphics.fillRect(0, bz - 3, canvasWidth, 20);
            if (Constants.H < 15) {
                if (aT % 3 == 0) {
                    this.utilService.a(graphics, this.cf[10], by, bz, 17, 1);
                    return;
                }
            } else if (aT % 3 == 0) {
                this.utilService.a(graphics, this.cf[11], by, bz, 17, 1);
            }
        }
    }

    private void O(int n) {
        if (this.av == -4132) {
            switch (n) {
                case -1: 
                case 50: {
                    if (--this.bp >= 0) break;
                    this.bp = this.bq;
                    return;
                }
                case -2: 
                case 56: {
                    if (++this.bp <= this.bq) break;
                    this.bp = 0;
                    return;
                }
                case -3: 
                case 52: {
                    return;
                }
                case -4: 
                case 54: {
                    return;
                }
                case -6: 
                case -5: {
                    int[] nArray;
                    bG = true;
                    this.av = 0;
                    if (!Constants.L) {
                        PlayStage.cJ[this.bp] = (byte)(this.E == 0 ? 1 : this.E + 1);
                    }
                    this.dY = (nArray = Util.GetCurrentDateTimeParts())[0] + 1 < 10 ? "0" + (nArray[0] + 1) : "" + nArray[0];
                    this.dZ = nArray[1] < 10 ? "0" + nArray[1] : "" + nArray[1];
                    this.ea = nArray[2] < 10 ? "0" + nArray[2] : "" + nArray[2];
                    this.eb = nArray[3] < 10 ? "0" + nArray[3] : "" + nArray[3];
                    this.ec = "" + nArray[4];
                    PlayStage.ax[this.bp] = String.valueOf(this.dZ) + "/" + this.dY + "/" + this.ec + " " + this.ea + ":" + this.eb;
                    this.Q(this.bp);
                    this.f();
                    Constants.H = 0;
                    this.av = -4132;
                    return;
                }
                case -7: {
                    this.aS();
                    this.bp = 2;
                }
            }
        }
    }

    private boolean T(Graphics graphics) {
        if (!this.ee) {
            return true;
        }
        int n = 19 * Constants.s + 14;
        int n2 = canvasHeight - n;
        if (this.keyProcess_nState != 768) {
            n2 -= 80;
        }
        int n3 = 0;
        n3 = Constants.U[this.U][this.bm][this.ef] < 2 ? 1 : 2;
        int n4 = Constants.U[this.U][this.bm][this.ef];
        byte by = Constants.V[this.U][this.bm][this.ef];
        if (Constants.L && (bu == 150 || bu == 99) && n4 != 0) {
            int n5 = this.U > 6 ? 6 : this.U;
            n4 = this.X[n5][1];
        }
        System.out.println("nStage = " + this.U);
        this.aN[n4].a(graphics, n3 == 1 ? 0 : canvasWidth, n2, n3 == 1 ? 20 : 24, n3 != 1);
        GameSpritesManager f2 = null;
        f2 = by == 2 ? this.aP[n4] : (by == 3 ? this.aQ[n4] : this.aO[n4]);
        if (by != 1 || aU) {
            if (n3 == 1) {
                f2.a(graphics, this.ed[n4][0], n2 - this.ed[n4][1], 20, false);
            } else {
                f2.a(graphics, canvasWidth - 35 - this.ed[n4][0], n2 - this.ed[n4][1], 20, true);
            }
        }
        PlayStage.a(graphics, 0, n2 - 2, canvasWidth, n + 8 + 5, 20);
        this.bZ = n2 + 5;
        System.out.println("situation ====" + Constants.W);
        System.out.println("nStage=====" + this.U);
        System.out.println("_nSituation=====" + this.bm);
        this.a(this.cg[Constants.W[this.U][this.bm] + this.ef], this.cy, this.cx, this.co);
        if (this.bm != 10) {
            graphics.setColor(0x555555);
            graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
            if (this.ef < Constants.U[this.U][this.bm].length - 1) {
                this.utilService.a(graphics, this.cf[1], 0, canvasHeight, 36, 1);
                this.utilService.a(graphics, this.cf[0], canvasWidth, canvasHeight, 40, 1);
            } else {
                this.utilService.a(graphics, this.cf[2], 0, canvasHeight, 36, 1);
            }
        }
        Util.a(graphics);
        return false;
    }

    private static void P(int n) {
        bv = n;
    }

    private boolean aZ() {
        if (Constants.H != -4132 && ++Constants.H > 20) {
            this.aj = null;
            this.ag = null;
            this.ah = null;
            System.gc();
            Constants.H = -4132;
            bv = -4132;
            return true;
        }
        return false;
    }

    private static void U(Graphics graphics) {
        graphics.setColor(0xFFFFFF);
        graphics.fillRect(0, 0, canvasWidth, canvasHeight);
    }

    private static void V(Graphics graphics) {
        graphics.setColor(0);
        graphics.fillRect(0, 0, canvasWidth, canvasHeight);
    }

    private static void ba() {
        if (++aT % 2 == 0) {
            @SuppressWarnings("unused")
            boolean bl = aU = !aU;
        }
        if (aT % 3 == 0) {
            @SuppressWarnings("unused")
            boolean bl = aV = !aV;
        }
        if (aT % 4 == 0) {
            @SuppressWarnings("unused")
            boolean bl = aW = !aW;
        }
        if (aT % 5 == 0) {
            aX = !aX;
        }
    }

    private void bb() {
        if (this.k != 0 && (this.k = (byte)(this.k + 1)) > 2) {
            this.k = 0;
        }
    }

    private void a(DataOutputStream dataOutputStream) {
        try {
            int n = this.l == null ? 0 : this.l.size();
            dataOutputStream.writeByte((byte)n);
            int n2 = 0;
            while (n2 < n) {
                dataOutputStream.writeByte(((ActionPair)this.l.elementAt((int)n2)).a);
                dataOutputStream.writeByte(((ActionPair)this.l.elementAt((int)n2)).b);
                ++n2;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    @SuppressWarnings({ "unchecked" })
    private void a(DataInputStream dataInputStream) {
        try {
            int n = dataInputStream.readByte();
            ++this.eg;
            if (n == 0) {
                return;
            }
            this.l = new Vector();
            int n2 = 0;
            while (n2 < n) {
                this.eg += 2L;
                this.l.addElement(new ActionPair(dataInputStream.readByte(), dataInputStream.readByte()));
                ++n2;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean bc() {
        RecordStore recordStore;
        FilterInputStream filterInputStream;
        ByteArrayInputStream byteArrayInputStream;
        boolean bl;
        block34: {
            block33: {
                bl = false;
                byteArrayInputStream = null;
                filterInputStream = null;
                recordStore = null;
                try {
                    try {
                        @SuppressWarnings("unused")
                        String string = "ctroy";
                        recordStore = RecordStore.openRecordStore((String)"ctroy", (boolean)true);
                        RecordEnumeration recordEnumeration = recordStore.enumerateRecords(null, null, false);
                        if (!recordEnumeration.hasNextElement()) {
                            bl = false;
                            break block33;
                        }
                        while (true) {
                            if (!recordEnumeration.hasNextElement()) {
                                bl = true;
                                break;
                            }
                            int n = recordEnumeration.nextRecordId();
                            byteArrayInputStream = new ByteArrayInputStream(recordStore.getRecord(n));
                            filterInputStream = new DataInputStream(byteArrayInputStream);
                            byte[] byArray = new byte[9];
                            System.out.println("dis.available() = " + filterInputStream.available());
                            System.out.println("buf = " + byArray);
                            ((DataInputStream)filterInputStream).read(byArray);
                            this.a(byArray);
                            filterInputStream.reset();
                        }
                    }
                    catch (IOException iOException) {
                        break block34;
                    }
                    catch (RecordStoreException recordStoreException) {
                        break block34;
                    }
                    catch (Exception exception) {
                        break block34;
                    }
                }
                catch (Throwable throwable) {
                    try {
                        if (byteArrayInputStream != null) {
                            byteArrayInputStream.close();
                        }
                    }
                    catch (Exception exception) {}
                    try {
                        if (filterInputStream != null) {
                            filterInputStream.close();
                        }
                    }
                    catch (Exception exception) {}
                    try {
                        recordStore.closeRecordStore();
                        throw throwable;
                    }
                    catch (Exception exception) {}
                    throw throwable;
                }
            }
            try {
                if (byteArrayInputStream != null) {
                    byteArrayInputStream.close();
                }
            }
            catch (Exception exception) {}
            try {
                if (filterInputStream != null) {
                    filterInputStream.close();
                }
            }
            catch (Exception exception) {}
            try {
                recordStore.closeRecordStore();
                return bl;
            }
            catch (Exception exception) {
                return bl;
            }
        }
        try {
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
            }
        }
        catch (Exception exception) {}
        try {
            if (filterInputStream != null) {
                filterInputStream.close();
            }
        }
        catch (Exception exception) {}
        try {
            recordStore.closeRecordStore();
            return bl;
        }
        catch (Exception exception) {}
        return bl;
    }

    private synchronized boolean bd() {
        boolean bl;
        block28: {
            RecordStore recordStore;
            DataOutputStream dataOutputStream;
            ByteArrayOutputStream byteArrayOutputStream;
            block27: {
                bl = false;
                byteArrayOutputStream = new ByteArrayOutputStream();
                dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                recordStore = null;
                try {
                    try {
                        @SuppressWarnings("unused")
                        String string = "ctroy";
                        recordStore = RecordStore.openRecordStore((String)"ctroy", (boolean)true);
                        RecordEnumeration recordEnumeration = recordStore.enumerateRecords(null, null, false);
                        if (!recordEnumeration.hasNextElement()) {
                            byteArrayOutputStream.reset();
                            ((OutputStream)dataOutputStream).write(this.be());
                            dataOutputStream.flush();
                            byte[] byArray = byteArrayOutputStream.toByteArray();
                            recordStore.addRecord(byArray, 0, byArray.length);
                            bl = true;
                        } else {
                            byteArrayOutputStream.reset();
                            ((OutputStream)dataOutputStream).write(this.be());
                            dataOutputStream.flush();
                            byte[] byArray = byteArrayOutputStream.toByteArray();
                            recordStore.setRecord(1, byArray, 0, byArray.length);
                            bl = true;
                        }
                    }
                    catch (IOException iOException) {
                        break block27;
                    }
                    catch (RecordStoreException recordStoreException) {
                        bl = false;
                        break block27;
                    }
                    catch (Exception exception) {
                        break block27;
                    }
                }
                catch (Throwable throwable) {
                    try {
                        byteArrayOutputStream.close();
                    }
                    catch (Exception exception) {}
                    try {
                        dataOutputStream.close();
                    }
                    catch (Exception exception) {}
                    try {
                        recordStore.closeRecordStore();
                    }
                    catch (Exception exception) {}
                    throw throwable;
                }
                try {
                    byteArrayOutputStream.close();
                }
                catch (Exception exception) {}
                try {
                    dataOutputStream.close();
                }
                catch (Exception exception) {}
                try {
                    recordStore.closeRecordStore();
                }
                catch (Exception exception) {}
                break block28;
            }
            try {
                byteArrayOutputStream.close();
            }
            catch (Exception exception) {}
            try {
                dataOutputStream.close();
            }
            catch (Exception exception) {}
            try {
                recordStore.closeRecordStore();
            }
            catch (Exception exception) {}
        }
        return bl;
    }

    private synchronized boolean Q(int n) {
        boolean bl;
        block30: {
            RecordStore recordStore;
            DataOutputStream dataOutputStream;
            ByteArrayOutputStream byteArrayOutputStream;
            block29: {
                bl = false;
                String string = Constants.L ? "chrs" : "chr" + n;
                byteArrayOutputStream = new ByteArrayOutputStream();
                dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                recordStore = null;
                try {
                    try {
                        recordStore = RecordStore.openRecordStore((String)string, (boolean)true);
                        RecordEnumeration recordEnumeration = recordStore.enumerateRecords(null, null, false);
                        if (!recordEnumeration.hasNextElement()) {
                            byteArrayOutputStream.reset();
                            byte[] byArray = this.bf();
                            dataOutputStream.writeInt(bk);
                            if (bk == 2) {
                                dataOutputStream.writeInt(PlayStage.bl);
                            }
                            dataOutputStream.writeInt(bL);
                            dataOutputStream.writeInt(ba);
                            this.a(dataOutputStream);
                            dataOutputStream.writeInt(byArray.length);
                            ((OutputStream)dataOutputStream).write(byArray);
                            dataOutputStream.flush();
                            byte[] byArray2 = byteArrayOutputStream.toByteArray();
                            recordStore.addRecord(byArray2, 0, byArray2.length);
                            bl = true;
                        } else {
                            byteArrayOutputStream.reset();
                            byte[] byArray = this.bf();
                            dataOutputStream.writeInt(bk);
                            if (bk == 2) {
                                dataOutputStream.writeInt(PlayStage.bl);
                            }
                            dataOutputStream.writeInt(bL);
                            dataOutputStream.writeInt(ba);
                            this.a(dataOutputStream);
                            dataOutputStream.writeInt(byArray.length);
                            ((OutputStream)dataOutputStream).write(byArray);
                            dataOutputStream.flush();
                            byte[] byArray3 = byteArrayOutputStream.toByteArray();
                            recordStore.setRecord(1, byArray3, 0, byArray3.length);
                            bl = true;
                        }
                    }
                    catch (IOException iOException) {
                        break block29;
                    }
                    catch (RecordStoreException recordStoreException) {
                        bl = false;
                        break block29;
                    }
                    catch (Throwable throwable) {
                        break block29;
                    }
                }
                catch (Throwable throwable) {
                    try {
                        byteArrayOutputStream.close();
                    }
                    catch (Exception exception) {}
                    try {
                        dataOutputStream.close();
                    }
                    catch (Exception exception) {}
                    try {
                        recordStore.closeRecordStore();
                    }
                    catch (Exception exception) {}
                    throw throwable;
                }
                try {
                    byteArrayOutputStream.close();
                }
                catch (Exception exception) {}
                try {
                    dataOutputStream.close();
                }
                catch (Exception exception) {}
                try {
                    recordStore.closeRecordStore();
                }
                catch (Exception exception) {}
                break block30;
            }
            try {
                byteArrayOutputStream.close();
            }
            catch (Exception exception) {}
            try {
                dataOutputStream.close();
            }
            catch (Exception exception) {}
            try {
                recordStore.closeRecordStore();
            }
            catch (Exception exception) {}
        }
        return bl;
    }

    private byte[] be() {
        int n;
        int n2 = 0;
        int n3 = 5;
        if (this.di != null) {
            n3 = 5 + (this.di.length + 1);
        }
        if (this.dj != null) {
            n3 += this.dj.length + 1;
        }
        byte[] byArray = new byte[n3 += 4];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)this.U;
        byArray2[1] = (byte)this.Z;
        byArray2[2] = (byte)(!this.dk ? 1 : 0);
        byArray2[3] = (byte)(this.di != null ? 1 : 0);
        byArray2[4] = (byte)(this.dj != null ? 1 : 0);
        n2 = 5;
        if (byArray2[3] == 1) {
            ++n2;
            byArray2[5] = (byte)this.di.length;
            n = 0;
            while (n < this.di.length) {
                byArray2[n2++] = (byte)this.di[n];
                ++n;
            }
        }
        if (byArray2[4] == 1) {
            byArray2[n2++] = (byte)this.dj.length;
            n = 0;
            while (n < this.dj.length) {
                byArray2[n2++] = (byte)this.dj[n];
                ++n;
            }
        }
        byte[] byArray3 = Util.ConvertIntToByteArray(this.keyProcess_nState);
        System.arraycopy(byArray3, 0, byArray2, n2, 4);
        return byArray2;
    }

    private void a(byte[] byArray) {
        int n;
        int n2 = 0;
        Constants.y = 0;
        this.U = byArray[0];
        this.Z = byArray[1];
        this.dk = byArray[2] == 0;
        n2 = 5;
        if (byArray[3] == 1) {
            ++n2;
            this.di = new int[byArray[5]];
            n = 0;
            while (n < this.di.length) {
                this.di[n] = byArray[n2++];
                ++n;
            }
        }
        if (byArray[4] == 1) {
            this.dj = new int[byArray[n2++]];
            n = 0;
            while (n < this.dj.length) {
                this.dj[n] = byArray[n2++];
                ++n;
            }
        }
        byte[] byArray2 = new byte[4];
        System.arraycopy(byArray, n2, byArray2, 0, 4);
        int n3 = Util.ConvertByteArrayToInt(byArray2);
        if (n3 == 768) {
            Constants.x = true;
            return;
        }
        if (n3 == 593) {
            this.keyProcess_nState = 593;
            this.V = true;
            Constants.y = 593;
        }
        Constants.x = false;
    }

    private byte[] bf() {
        byte[] byArray = PlayStage.bg();
        return byArray;
    }

    private static byte[] bg() {
        byte[] byArray = new byte[65];
        int n = 0;
        while (n < 64) {
            byArray[n] = ChessEngine.a[n];
            ++n;
        }
        byArray[64] = (byte)ChessEngine.castlingStatusMask;
        return byArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean R(int n) {
        RecordStore recordStore;
        FilterInputStream filterInputStream;
        ByteArrayInputStream byteArrayInputStream;
        boolean bl;
        block38: {
            block37: {
                bl = false;
                String string = Constants.L ? "chrs" : "chr" + n;
                byteArrayInputStream = null;
                filterInputStream = null;
                recordStore = null;
                try {
                    try {
                        recordStore = RecordStore.openRecordStore((String)string, (boolean)true);
                        RecordEnumeration recordEnumeration = recordStore.enumerateRecords(null, null, false);
                        if (!recordEnumeration.hasNextElement()) {
                            bl = false;
                            break block37;
                        }
                        while (true) {
                            if (!recordEnumeration.hasNextElement()) {
                                bl = true;
                                break;
                            }
                            int n2 = recordEnumeration.nextRecordId();
                            byteArrayInputStream = new ByteArrayInputStream(recordStore.getRecord(n2));
                            filterInputStream = new DataInputStream(byteArrayInputStream);
                            bk = ((DataInputStream)filterInputStream).readInt();
                            if (bk == 2) {
                                PlayStage.bl = ((DataInputStream)filterInputStream).readInt();
                                af = PlayStage.bl == 1;
                            }
                            bL = ((DataInputStream)filterInputStream).readInt();
                            ba = ((DataInputStream)filterInputStream).readInt();
                            this.a((DataInputStream)filterInputStream);
                            byte[] byArray = new byte[((DataInputStream)filterInputStream).readInt()];
                            ((DataInputStream)filterInputStream).read(byArray);
                            if (bk == 2) {
                                if (!af) {
                                    ChessEngine.l = -1;
                                    bL = 1;
                                } else {
                                    ChessEngine.l = 1;
                                    bL = 0;
                                }
                            }
                            this.b(byArray);
                            filterInputStream.reset();
                        }
                    }
                    catch (IOException iOException) {
                        break block38;
                    }
                    catch (RecordStoreException recordStoreException) {
                        break block38;
                    }
                    catch (Throwable throwable) {
                        break block38;
                    }
                }
                catch (Throwable throwable) {
                    try {
                        if (byteArrayInputStream != null) {
                            byteArrayInputStream.close();
                        }
                    }
                    catch (Exception exception) {}
                    try {
                        if (filterInputStream != null) {
                            filterInputStream.close();
                        }
                    }
                    catch (Exception exception) {}
                    try {
                        recordStore.closeRecordStore();
                        throw throwable;
                    }
                    catch (Exception exception) {}
                    throw throwable;
                }
            }
            try {
                if (byteArrayInputStream != null) {
                    byteArrayInputStream.close();
                }
            }
            catch (Exception exception) {}
            try {
                if (filterInputStream != null) {
                    filterInputStream.close();
                }
            }
            catch (Exception exception) {}
            try {
                recordStore.closeRecordStore();
                return bl;
            }
            catch (Exception exception) {
                return bl;
            }
        }
        try {
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
            }
        }
        catch (Exception exception) {}
        try {
            if (filterInputStream != null) {
                filterInputStream.close();
            }
        }
        catch (Exception exception) {}
        try {
            recordStore.closeRecordStore();
            return bl;
        }
        catch (Exception exception) {}
        return bl;
    }

    private void b(byte[] byArray) {
        ChessEngine.a(byArray);
        this.bn = ChessEngine.e();
        bL = this.bn == 1 ? 0 : 1;
        System.arraycopy(ChessEngine.a, 0, ChessR.o, 0, 64);
        ChessR.k = 0;
        PlayStage.j();
        PlayStage.k();
        ChessEngine.a(this.L());
        ChessR.k = 1;
    }

    private static boolean a(Graphics graphics, int n, int n2, int n3, boolean bl, int n4, int n5, int n6, int n7, boolean bl2) {
        bG = true;
        int n8 = n6 / Constants.p + 1;
        int n9 = n7 / Constants.q;
        int n10 = n3 - (Constants.p - 1) * Constants.r;
        graphics.setColor(n);
        if (ej > n3) {
            if (!bl) {
                graphics.fillRect(n4, n5, n6, n5);
            }
            bG = false;
            return true;
        }
        int n11 = 0;
        while (n11 < Constants.p) {
            int n12;
            int n13 = n2 - n11 * Constants.r;
            if (n13 < 0) {
                n13 = 0;
            }
            int n14 = n13 >= n10 ? n8 : n8 * n13 / n10;
            if (bl) {
                n12 = n11 * n8 + n14;
                n14 = n8 - n14;
            } else {
                n12 = n11 * n8;
            }
            int n15 = 0;
            while (n15 < Constants.q) {
                if (bl2) {
                    graphics.fillRect(n4 + n12, n5, n14, n9);
                } else {
                    graphics.fillRect(n4 + n6 - (n12 + n14), n5, n14, n9);
                }
                ++n15;
            }
            ++n11;
        }
        return false;
    }

    private static int S(int n) {
        int n2 = 0;
        switch (n) {
            case 512: {
                if (Constants.isMoreGamesOn) {
                    n2 = Constants.h + 1;
                    break;
                }
                n2 = Constants.h;
                break;
            }
            case 9: {
                n2 = Constants.i;
                break;
            }
            case 200: {
                n2 = Constants.j;
                break;
            }
            case 257: {
                n2 = 1;
                break;
            }
            case 272: {
                n2 = 3;
                break;
            }
            case 258: 
            case 2457: {
                n2 = 2;
                break;
            }
            case 273: {
                n2 = 6;
                break;
            }
            case 1280: {
                n2 = Constants.k;
                break;
            }
            case 1536: {
                n2 = Constants.l;
                break;
            }
            case 2: {
                n2 = Constants.m;
                break;
            }
            case 3: {
                n2 = 5;
                break;
            }
            case 100: {
                n2 = Constants.n;
            }
        }
        return n2;
    }

    private void a(Graphics graphics, Image image, int n, int n2, int n3, int n4, int n5) {
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
        int n6 = image.getWidth() / 3;
        int n7 = image.getHeight() / 3;
        int n8 = n3 / n6;
        int n9 = n4 / n7;
        int n10 = 0;
        int n11 = 0;
        if (n3 % n6 != 0) {
            ++n8;
        }
        if (n4 % n7 != 0) {
            ++n9;
        }
        int n12 = 0;
        int n13 = 0;
        ++n9;
        ++n8;
        int n14 = 0;
        while (n14 < n9) {
            if (n14 == 0) {
                n13 = 0;
                n10 = n2;
            } else if (n14 == n9 - 2) {
                n13 = 1;
                n10 = n2 + n4 - n7 * 2;
            } else if (n14 == n9 - 1) {
                n13 = 2;
                n10 = n2 + n4 - n7;
            } else {
                n13 = 1;
                n10 = n2 + n14 * n7;
            }
            int n15 = 0;
            while (n15 < n8) {
                if (n15 == 0) {
                    n12 = 0;
                    n11 = n + n15 * n6;
                } else if (n15 == n8 - 2) {
                    n12 = 1;
                    n11 = n + n3 - n6 * 2;
                } else if (n15 == n8 - 1) {
                    n12 = 2;
                    n11 = n + n3 - n6;
                } else {
                    n12 = 1;
                    n11 = n + n15 * n6;
                }
                if (n12 != 1 || n13 != 1) {
                    this.utilService.a(graphics, image, n11, n10, n6, n7, n12, n13);
                }
                ++n15;
            }
            ++n14;
        }
    }

    private static void a(Graphics graphics, int n, int n2, int n3, int n4, int n5) {
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
        int n6 = 1;
        int n7 = 0;
        graphics.setColor(0);
        graphics.fillRect(n + 1, n2, n3 - 2, n4);
        graphics.fillRect(n, n2 + 1, n3, n4 - 2);
        int[] nArray = new int[]{0xC3C1C1, 0x868686, 0x393939};
        int n8 = nArray.length;
        int n9 = 0;
        while (n9 < n8) {
            n7 = ++n6 << 1;
            graphics.setColor(nArray[n9]);
            graphics.fillRect(n + n6, n2 + n6, n3 - n7, n4 - n7);
            ++n9;
        }
        n7 = ++n6 << 1;
        graphics.setColor(0);
        graphics.fillRect(n + n6, n2 + n6, n3 - n7, n4 - n7);
    }

    private void d_LoadResource() {
        try {
            if (Constants.f) {
                switch (this.aY) {
                    case 1: {
                        this.b(this.X[this.U > 6 ? 6 : this.U]);
                        break;
                    }
                    case 2: {
                        this.bq();
                        break;
                    }
                    case 3: {
                        this.bB();
                        System.out.println("PlayStage.d_LoadResource() nStage = " + this.U);
                        this.nullSomeVariables();
                        this.b(4 + this.U);
                        this.dateLong_StageText(0);
                        this.d(42);
                        break;
                    }
                    case 4: {
                        this.aY = 1;
                        this.a(592, true);
                        return;
                    }
                }
                ++this.aY;
                System.out.println("nResourceLoad=== " + this.aY);
                return;
            }
            if (!is3D) {
                switch (this.aY) {
                    case 1: {
                        break;
                    }
                    case 2: {
                        this.a(true);
                        break;
                    }
                    case 3: {
                        this.bv();
                        break;
                    }
                    case 4: {
                        this.bl();
                        this.bo();
                        break;
                    }
                    case 5: {
                        this.aE = new SpriteAnimator("/me.dpr");
                        break;
                    }
                    default: {
                        this.aY = 0;
                        this.a(768, true);
                        return;
                    }
                }
                ++this.aY;
                System.out.println("nResourceLoad=== " + this.aY);
                return;
            }
            switch (this.aY) {
                case 1: {
                    break;
                }
                case 2: {
                    this.a(true);
                    break;
                }
                case 3: {
                    this.aJ = Image.createImage((String)"/img/board3.png");
                    this.aC = new Image[6];
                    this.aD = new Image[6];
                    break;
                }
                case 4: {
                    int n = 0;
                    this.a("piecewhite");
                    n = 0;
                    while (n < this.aC.length) {
                        this.aC[n] = this.utilService.e(n);
                        ++n;
                    }
                    this.utilService.unsetTheFileBytes();
                    this.a("pieceblack");
                    n = 0;
                    while (n < this.aC.length) {
                        this.aD[n] = this.utilService.e(n);
                        ++n;
                    }
                    this.utilService.unsetTheFileBytes();
                    break;
                }
                case 5: {
                    this.bk();
                    this.nullSomeVariables();
                    this.b(3);
                    if (bu != 200) {
                        this.c(1);
                        if (Constants.L) {
                            this.d(38);
                            break;
                        }
                        this.d(41);
                        break;
                    }
                    this.nullSomeVariables();
                    this.b(3);
                    this.d(39);
                    break;
                }
                case 6: {
                    break;
                }
                case 7: {
                    this.bi();
                    break;
                }
                case 8: {
                    this.bl();
                    this.bo();
                    this.aE = new SpriteAnimator("/me.dpr");
                    break;
                }
                case 9: {
                    this.aY = 0;
                    this.keyProcess_nState = 768;
                    this.a(768, true);
                    return;
                }
            }
            ++this.aY;
            System.out.println("nResourceLoad=== " + this.aY);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void bi() {
        this.aI = new Image[5];
        this.a("effect");
        int n = 0;
        while (n < this.aI.length) {
            this.aI[n] = this.utilService.e(n);
            ++n;
        }
        this.utilService.unsetTheFileBytes();
    }

    private void bj() {
        this.aI = null;
        System.gc();
    }

    private void bk() {
        this.az = new Image[2];
        this.aA = new Image[2];
        this.a("3dcursor");
        this.aA[0] = this.utilService.e(0);
        this.aA[1] = this.utilService.e(1);
        this.az[0] = this.utilService.e(2);
        this.az[1] = this.utilService.e(3);
        this.utilService.unsetTheFileBytes();
    }

    private void bl() {
        try {
            this.a(String.valueOf(Constants.C) + "_imgText");
            this.ai = this.utilService.e(Constants.X);
            this.utilService.unsetTheFileBytes();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void bm() {
        this.am = new Image[4];
        this.an = new Image[4];
        int n = this.am.length;
        this.a("i_icon");
        int n2 = 0;
        while (n2 < n) {
            this.am[n2] = this.utilService.e(n2);
            this.an[n2] = this.utilService.e(4 + n2);
            ++n2;
        }
        this.utilService.unsetTheFileBytes();
    }

    private void bn() {
        this.am = null;
        this.an = null;
        System.gc();
    }

    private void bo() {
        this.aZ = new Image[5];
        this.a("watch");
        int n = 0;
        while (n < this.aZ.length) {
            this.aZ[n] = this.utilService.e(n);
            ++n;
        }
        this.utilService.unsetTheFileBytes();
    }

    private void bp() {
        this.aZ = null;
        System.gc();
    }

    private void bq() {
        this.br();
        this.aM = new Image[9];
        this.a("worldMap");
        int n = 0;
        while (n < this.aM.length) {
            this.aM[n] = this.utilService.e(10 + n);
            ++n;
        }
        this.utilService.unsetTheFileBytes();
    }

    private void br() {
        if (this.aM != null) {
            int n = 0;
            while (n < this.aM.length) {
                this.aM[n] = null;
                ++n;
            }
        }
        this.aM = null;
        System.gc();
    }

    private void b(int[] nArray) {
        int n = nArray.length;
        System.out.println("len = " + n);
        this.bu();
        this.aN = new GameSpritesManager[9];
        this.aP = new GameSpritesManager[9];
        this.aQ = new GameSpritesManager[9];
        this.aO = new GameSpritesManager[9];
        Image image = null;
        this.a("char_talk");
        int n2 = 0;
        while (n2 < n) {
            image = this.utilService.e(nArray[n2]);
            this.aN[nArray[n2]] = new GameSpritesManager(image, 0, image.getHeight());
            this.aP[nArray[n2]] = new GameSpritesManager(this.utilService.e(nArray[n2] + 27), 0, 0);
            this.aQ[nArray[n2]] = new GameSpritesManager(this.utilService.e(nArray[n2] + 9), 0, 0);
            this.aO[nArray[n2]] = new GameSpritesManager(this.utilService.e(nArray[n2] + 18), 0, 0);
            ++n2;
        }
        this.utilService.unsetTheFileBytes();
        this.bs();
    }

    private void bs() {
        this.el = new Image[5][2];
        int n = this.el.length;
        int n2 = this.el[0].length;
        this.a("worldMap");
        int n3 = 0;
        while (n3 < n) {
            int n4 = 0;
            while (n4 < n2) {
                this.el[n3][n4] = this.utilService.e(n3 * 2 + n4);
                ++n4;
            }
            ++n3;
        }
        this.utilService.unsetTheFileBytes();
    }

    private void bt() {
        this.el = null;
        System.gc();
    }

    private void W(Graphics graphics) {
        int n = this.el.length;
        int n2 = 0;
        while (n2 < n) {
            graphics.drawImage(this.el[n2][aT & 1], this.em[n2][0], bx + this.em[n2][1], n2 < 3 ? 24 : 20);
            ++n2;
        }
    }

    private void X(Graphics graphics) {
        int n;
        @SuppressWarnings("unused")
        int n2 = n = this.ek ? 0 : this.U + 1;
        if (aU) {
            int n3 = this.y[n][0];
            int n4 = 0;
            n4 = n3 == 0 ? 33 : (n3 == 1 ? 17 : (n3 == 2 ? 40 : 20));
            graphics.drawImage(this.en, this.y[n][1], this.y[n][2], n4);
        }
    }

    private void bu() {
        this.aN = null;
        this.aQ = null;
        this.aP = null;
        this.aO = null;
        System.gc();
    }

    private void bv() {
        int n = 0;
        int n2 = 0;
        Image image = null;
        int n3 = this.aB.length;
        this.a("boardPiece");
        int n4 = 0;
        while (n4 < n3) {
            if (this.aB[n4] == null) {
                image = this.utilService.e(n4);
                System.out.println("11111111111111111111111111111111");
                if (n4 > 5) {
                    n = image.getWidth() >> 1;
                    n2 = image.getHeight() >> 1;
                }
                this.aB[n4] = new GameSpritesManager(image, n, n2);
            }
            System.gc();
            ++n4;
        }
        this.utilService.unsetTheFileBytes();
    }

    private void a(boolean bl) {
        if (bl || is3D) {
            int n = this.aB.length;
            int n2 = 0;
            while (n2 < n) {
                if (n2 < 6 || n2 > 11) {
                    this.aB[n2] = null;
                }
                ++n2;
            }
        }
        if (bl || !is3D) {
            this.aC = null;
            this.aD = null;
            this.aA = null;
            this.az = null;
            this.aJ = null;
        }
        System.gc();
    }

    private void bw() {
        this.a(true);
        this.bn();
        this.bj();
        this.bp();
        this.aa();
        this.bu();
        this.br();
        this.bt();
        this.en = null;
        this.ag = null;
        this.ah = null;
        this.ai = null;
        this.aj = null;
        this.aF = null;
        this.aG = null;
        this.aH = null;
        this.aE = null;
        System.gc();
    }

    private String bx() {
        int n = 0;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.valueOf(Constants.soundVolumeLevel) + "*");
        stringBuffer.append(String.valueOf(Constants.C) + "*");
        stringBuffer.append(String.valueOf(Constants.E) + "*");
        stringBuffer.append(String.valueOf(Constants.F) + "*");
        n = this.aw.length;
        int n2 = 0;
        while (n2 < n) {
            stringBuffer.append(String.valueOf(this.aw[n2]) + "*");
            ++n2;
        }
        n2 = 0;
        while (n2 < 3) {
            stringBuffer.append(String.valueOf(ax[n2]) + "*");
            ++n2;
        }
        n = this.T.length;
        n2 = 0;
        while (n2 < n) {
            stringBuffer.append(String.valueOf(this.T[n2]) + "*");
            ++n2;
        }
        stringBuffer.append(String.valueOf(this.S) + "*");
        stringBuffer.append(String.valueOf(Constants.B) + "*");
        stringBuffer.append(String.valueOf(Constants.z) + "*");
        stringBuffer.append(String.valueOf(Constants.D) + "*");
        stringBuffer.append(String.valueOf(Constants.w) + "*");
        stringBuffer.append(String.valueOf(this.F) + "*");
        stringBuffer.append(String.valueOf(this.G) + "*");
        stringBuffer.append(String.valueOf(this.H) + "*");
        stringBuffer.append(String.valueOf(this.I) + "*");
        stringBuffer.append(String.valueOf(this.eo) + "*");
        stringBuffer.append(String.valueOf(this.ep) + "*");
        stringBuffer.append(String.valueOf(this.eq) + "*");
        stringBuffer.append(String.valueOf(this.er) + "*");
        stringBuffer.append(String.valueOf(this.ay[0]) + "*");
        stringBuffer.append(String.valueOf(this.ay[1]) + "*");
        stringBuffer.append(String.valueOf(this.ay[2]) + "*");
        stringBuffer.append(String.valueOf(this.ay[3]) + "*");
        stringBuffer.append(String.valueOf(this.ay[4]) + "*");
        stringBuffer.append(String.valueOf(this.ay[5]) + "*");
        n2 = 0;
        while (n2 < 3) {
            stringBuffer.append(String.valueOf(cJ[n2]) + "*");
            ++n2;
        }
        stringBuffer.append(String.valueOf(this.z) + "*");
        stringBuffer.append(String.valueOf(this.A) + "*");
        n = this.B.length;
        n2 = 0;
        while (n2 < n) {
            stringBuffer.append(String.valueOf(this.B[n2]) + "*");
            ++n2;
        }
        stringBuffer.append(String.valueOf(this.D) + "*");
        stringBuffer.append(String.valueOf(this.C) + "*");
        stringBuffer.append(String.valueOf(this.dr) + "*");
        return stringBuffer.toString();
    }

    public final synchronized boolean f() {
        boolean bl;
        block28: {
            RecordStore recordStore;
            DataOutputStream dataOutputStream;
            ByteArrayOutputStream byteArrayOutputStream;
            block27: {
                bl = false;
                byteArrayOutputStream = new ByteArrayOutputStream();
                dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                recordStore = null;
                try {
                    try {
                        recordStore = RecordStore.openRecordStore((String)"chess", (boolean)true);
                        RecordEnumeration recordEnumeration = recordStore.enumerateRecords(null, null, false);
                        if (!recordEnumeration.hasNextElement()) {
                            byteArrayOutputStream.reset();
                            dataOutputStream.writeUTF(this.bx());
                            dataOutputStream.flush();
                            byte[] byArray = byteArrayOutputStream.toByteArray();
                            recordStore.addRecord(byArray, 0, byArray.length);
                            bl = true;
                        } else {
                            byteArrayOutputStream.reset();
                            dataOutputStream.writeUTF(this.bx());
                            dataOutputStream.flush();
                            byte[] byArray = byteArrayOutputStream.toByteArray();
                            recordStore.setRecord(1, byArray, 0, byArray.length);
                            bl = true;
                        }
                    }
                    catch (IOException iOException) {
                        break block27;
                    }
                    catch (RecordStoreException recordStoreException) {
                        bl = false;
                        break block27;
                    }
                    catch (Exception exception) {
                        break block27;
                    }
                }
                catch (Throwable throwable) {
                    try {
                        byteArrayOutputStream.close();
                    }
                    catch (Exception exception) {}
                    try {
                        dataOutputStream.close();
                    }
                    catch (Exception exception) {}
                    try {
                        recordStore.closeRecordStore();
                    }
                    catch (Exception exception) {}
                    throw throwable;
                }
                try {
                    byteArrayOutputStream.close();
                }
                catch (Exception exception) {}
                try {
                    dataOutputStream.close();
                }
                catch (Exception exception) {}
                try {
                    recordStore.closeRecordStore();
                }
                catch (Exception exception) {}
                break block28;
            }
            try {
                byteArrayOutputStream.close();
            }
            catch (Exception exception) {}
            try {
                dataOutputStream.close();
            }
            catch (Exception exception) {}
            try {
                recordStore.closeRecordStore();
            }
            catch (Exception exception) {}
        }
        return bl;
    }

    private boolean LoadOption() {
        boolean bl;
        block41: {
            RecordStore recordStore;
            FilterInputStream filterInputStream;
            ByteArrayInputStream byteArrayInputStream;
            block40: {
                bl = false;
                byteArrayInputStream = null;
                filterInputStream = null;
                String string = null;
                recordStore = null;
                try {
                    try {
                        recordStore = RecordStore.openRecordStore((String)"chess", (boolean)true);
                        RecordEnumeration recordEnumeration = recordStore.enumerateRecords(null, null, false);
                        if (!recordEnumeration.hasNextElement()) {
                            bl = false;
                            this.f();
                            this.audioService.setVolumeLevel(Constants.soundVolumeLevel);
                        } else {
                            int n = 0;
                            while (recordEnumeration.hasNextElement()) {
                                int n2 = recordEnumeration.nextRecordId();
                                byteArrayInputStream = new ByteArrayInputStream(recordStore.getRecord(n2));
                                filterInputStream = new DataInputStream(byteArrayInputStream);
                                string = ((DataInputStream)filterInputStream).readUTF();
                                n = string.indexOf("*", 0);
                                Constants.soundVolumeLevel = Integer.parseInt(string.substring(0, n));
                                int n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                Constants.C = Integer.parseInt(string.substring(n3 + 1, n));
                                n3 = n;
                                Constants.E = Integer.parseInt(string.substring(n3 + 1, n = string.indexOf(42, n3 + 1)));
                                is3D = Constants.E == 1;
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                Constants.F = Integer.parseInt(string.substring(n3 + 1, n));
                                int n4 = this.aw.length;
                                n2 = 0;
                                while (n2 < n4) {
                                    n3 = n;
                                    n = string.indexOf(42, n3 + 1);
                                    this.aw[n2] = Integer.parseInt(string.substring(n3 + 1, n));
                                    ++n2;
                                }
                                n2 = 0;
                                while (n2 < 3) {
                                    n3 = n;
                                    String string2 = string.substring(n3 + 1, n = string.indexOf(42, n3 + 1));
                                    if (string2.equals("null")) {
                                        string2 = " - ";
                                    }
                                    PlayStage.ax[n2] = string2;
                                    ++n2;
                                }
                                n4 = this.T.length;
                                n2 = 0;
                                while (n2 < n4) {
                                    n3 = n;
                                    n = string.indexOf(42, n3 + 1);
                                    this.T[n2] = Byte.parseByte(string.substring(n3 + 1, n));
                                    ++n2;
                                }
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                this.S = Integer.parseInt(string.substring(n3 + 1, n));
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                Constants.B = Integer.parseInt(string.substring(n3 + 1, n));
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                Constants.z = Integer.parseInt(string.substring(n3 + 1, n));
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                Constants.D = Integer.parseInt(string.substring(n3 + 1, n));
                                System.out.println("PlayStage.LoadOption() Constants.nFirstStory = " + Constants.D);
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                Constants.w = Integer.parseInt(string.substring(n3 + 1, n));
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                this.F = Integer.parseInt(string.substring(n3 + 1, n));
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                this.G = Integer.parseInt(string.substring(n3 + 1, n));
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                this.H = Integer.parseInt(string.substring(n3 + 1, n));
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                this.I = Integer.parseInt(string.substring(n3 + 1, n));
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                this.eo = Integer.parseInt(string.substring(n3 + 1, n));
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                this.ep = Integer.parseInt(string.substring(n3 + 1, n));
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                this.eq = Long.parseLong(string.substring(n3 + 1, n));
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                this.er = Long.parseLong(string.substring(n3 + 1, n));
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                this.ay[0] = Integer.parseInt(string.substring(n3 + 1, n));
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                this.ay[1] = Integer.parseInt(string.substring(n3 + 1, n));
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                this.ay[2] = Integer.parseInt(string.substring(n3 + 1, n));
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                this.ay[3] = Integer.parseInt(string.substring(n3 + 1, n));
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                this.ay[4] = Integer.parseInt(string.substring(n3 + 1, n));
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                this.ay[5] = Integer.parseInt(string.substring(n3 + 1, n));
                                n2 = 0;
                                while (n2 < 3) {
                                    n3 = n;
                                    n = string.indexOf(42, n3 + 1);
                                    PlayStage.cJ[n2] = Byte.parseByte(string.substring(n3 + 1, n));
                                    ++n2;
                                }
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                this.z = Integer.parseInt(string.substring(n3 + 1, n));
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                this.A = Integer.parseInt(string.substring(n3 + 1, n));
                                n4 = this.B.length;
                                n2 = 0;
                                while (n2 < n4) {
                                    n3 = n;
                                    n = string.indexOf(42, n3 + 1);
                                    this.B[n2] = Integer.parseInt(string.substring(n3 + 1, n));
                                    ++n2;
                                }
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                this.D = Integer.parseInt(string.substring(n3 + 1, n));
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                this.C = Long.parseLong(string.substring(n3 + 1, n));
                                n3 = n;
                                n = string.indexOf(42, n3 + 1);
                                this.dr = Byte.parseByte(string.substring(n3 + 1, n));
                            }
                            bl = true;
                        }
                    }
                    catch (IOException iOException) {
                        break block40;
                    }
                    catch (RecordStoreException recordStoreException) {
                        break block40;
                    }
                    catch (Exception exception) {
                        break block40;
                    }
                }
                catch (Throwable throwable) {
                    try {
                        if (byteArrayInputStream != null) {
                            byteArrayInputStream.close();
                        }
                    }
                    catch (Exception exception) {}
                    try {
                        if (filterInputStream != null) {
                            filterInputStream.close();
                        }
                    }
                    catch (Exception exception) {}
                    try {
                        recordStore.closeRecordStore();
                    }
                    catch (Exception exception) {}
                    throw throwable;
                }
                try {
                    if (byteArrayInputStream != null) {
                        byteArrayInputStream.close();
                    }
                }
                catch (Exception exception) {}
                try {
                    if (filterInputStream != null) {
                        filterInputStream.close();
                    }
                }
                catch (Exception exception) {}
                try {
                    recordStore.closeRecordStore();
                }
                catch (Exception exception) {}
                break block41;
            }
            try {
                if (byteArrayInputStream != null) {
                    byteArrayInputStream.close();
                }
            }
            catch (Exception exception) {}
            try {
                if (filterInputStream != null) {
                    filterInputStream.close();
                }
            }
            catch (Exception exception) {}
            try {
                recordStore.closeRecordStore();
            }
            catch (Exception exception) {}
        }
        return bl;
    }

    private int b(boolean bl) {
        int n = 0;
        int n2 = 0;
        while (n2 < 64) {
            switch (Math.abs(ChessR.m[n2])) {
                case 1: {
                    ++n;
                    break;
                }
                case 2: 
                case 3: {
                    n += 3;
                    break;
                }
                case 4: {
                    n += 5;
                    break;
                }
                case 5: {
                    n += 9;
                }
            }
            ++n2;
        }
        if (bl) {
            return (this.E + 1) * n;
        }
        return n;
    }

    private void bz() {
        Constants.G = 20;
        bu = 44;
        this.d();
    }

    private void bA() {
        try {
            DataInputStream dataInputStream = new DataInputStream(this.getClass().getResourceAsStream("/draw.mss"));
            dataInputStream.readByte();
            int n = 0;
            while (n < 64) {
                ChessEngine.chessBoard[n] = dataInputStream.readByte();
                ++n;
            }
            dataInputStream.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void bB() {
        this.df = null;
        this.a("stagemap");
        this.df = this.utilService.e(this.U > 6 ? 6 : this.U);
        this.utilService.unsetTheFileBytes();
    }

    public final void showNotify() {
        System.out.println("111111111111111111");
    }

    public final void hideNotify() {
    }

    private void T(int n) {
        if (n == 53) {
            this.keyProcess_nState = this.es;
        }
    }

    private int a(String string) {
        int n = 0;
        n = this.utilService.deserializeAsset("/img/" + string + ".mgd");
        return n;
    }

    public final void b(int n) {
        this.utilService.someByteAllocation(1, 5000, 1);
        this.bY = Constants.C;
        this.a(this.bY, n);
    }

    private void a(int assetSerialId, int n2) {
        this.utilService.deserializeAsset("/txt/ChessText_" + assetSerialId + ".mgd");
        this.utilService.b(n2, 1);
        this.utilService.unsetTheFileBytes();
    }

    private byte[] U(int n) {
        this.utilService.a(n, 1);
        byte[] byArray = this.utilService.c(1);
        return byArray;
    }

    private void dateLong_HelpText(int n) {
        int n2 = 0;
        int n3 = 0;
        Constants.T = 0;
        this.cg = new byte[50][][];
        switch (n) {
            case 1: {
                this.cx = 18;
                n3 = 6;
                n2 = 4;
                this.bZ = bz - 60;
                break;
            }
            case 2: {
                this.cx = 18;
                n3 = 10;
                n2 = 6;
                this.bZ = bz - 5 - 20;
                break;
            }
            case 3: {
                this.cx = 50;
                n3 = 0;
                n2 = 6;
                this.bZ = bz - 70;
            }
        }
        int n4 = n3;
        while (n4 < n3 + n2) {
            this.cd = this.U(n4);
            this.utilService.a(';');
            this.cg[n4] = this.utilService.stringParser(this.cd, this.utilService.n[0] * 27, (this.utilService.o[0] + this.utilService.o[0] / 2) * this.cx, this.utilService.n[0], this.utilService.o[0], this.utilService.o[0] / 2);
            if (n4 == n3) {
                this.cp = this.utilService.getTotalPageCount(this.cx);
                this.ci = this.cg[n3].length;
                System.out.println("PlayStage.dateLong_HelpText() nPage_0 = " + this.cg[n3].length);
            } else if (n4 == n3 + 1) {
                this.cq = this.utilService.getTotalPageCount(this.cx);
                this.cj = this.cg[n3 + 1].length;
                System.out.println("PlayStage.dateLong_HelpText() nPage_1 = " + this.cg[n3 + 1].length);
            } else if (n4 == n3 + 2) {
                this.cr = this.utilService.getTotalPageCount(this.cx);
                this.ck = this.cg[n3 + 2].length;
                System.out.println("PlayStage.dateLong_HelpText() nPage_2 = " + this.cg[n3 + 2].length);
            } else if (n4 == n3 + 3) {
                this.cs = this.utilService.getTotalPageCount(this.cx);
                this.cl = this.cg[n3 + 3].length;
                System.out.println("PlayStage.dateLong_HelpText() nPage_3 = " + this.cg[n3 + 3].length);
            } else if (n4 == n3 + 4) {
                this.ct = this.utilService.getTotalPageCount(this.cx);
                this.cm = this.cg[n3 + 4].length;
                System.out.println("PlayStage.dateLong_HelpText() nPage_4 = " + this.cg[n3 + 4].length);
            } else if (n4 == n3 + 5) {
                this.cu = this.utilService.getTotalPageCount(this.cx);
                this.cn = this.cg[n3 + 5].length;
            }
            ++n4;
        }
    }

    private void W(int n) {
        int n2 = 0;
        this.cg = new byte[50][][];
        switch (n) {
            case 0: {
                this.cx = 20;
                n2 = 4;
                Constants.T = 1;
            }
        }
        int n3 = 0;
        while (n3 < 0 + n2) {
            this.cd = this.U(n3);
            this.utilService.a(';');
            this.cg[n3] = this.utilService.stringParser(this.cd, canvasWidth - this.utilService.n[Constants.T] * 2, (this.utilService.o[Constants.T] + this.utilService.o[Constants.T] / 2) * this.cx, this.utilService.n[Constants.T], this.utilService.o[Constants.T], this.utilService.o[Constants.T] / 2);
            if (n3 == 0) {
                this.cp = this.utilService.getTotalPageCount(this.cx);
                this.ci = this.cg[0].length;
            } else if (n3 == 1) {
                this.cq = this.utilService.getTotalPageCount(this.cx);
                this.cj = this.cg[1].length;
            } else if (n3 == 2) {
                this.cr = this.utilService.getTotalPageCount(this.cx);
                this.ck = this.cg[2].length;
            } else if (n3 == 3) {
                this.cs = this.utilService.getTotalPageCount(this.cx);
                this.cl = this.cg[3].length;
            } else if (n3 == 4) {
                this.ct = this.utilService.getTotalPageCount(this.cx);
                this.cm = this.cg[4].length;
            }
            ++n3;
        }
    }

    private void dateLong_StageText(int n) {
        int n2;
        int n3 = 0;
        int n4 = 0;
        this.cg = new byte[50][][];
        int n5 = 0;
        System.out.println("dateLong_StageText nStage = " + n);
        switch (n) {
            case 0: {
                this.cx = 8;
                n4 = Constants.W[this.U][0];
                n3 = Constants.U[this.U][0].length;
                Constants.T = 0;
                break;
            }
            case 1: {
                n2 = 1;
                while (n2 < 7) {
                    n5 += Constants.U[this.U][n2].length;
                    ++n2;
                }
                System.out.println("WhoFaceLenght = " + n5);
                this.cx = 8;
                n4 = Constants.W[this.U][1];
                n3 = n5;
                Constants.T = 0;
                break;
            }
            case 2: {
                n2 = 7;
                while (n2 < 9) {
                    n5 += Constants.U[this.U][n2].length;
                    ++n2;
                }
                this.cx = 8;
                n4 = Constants.W[this.U][7];
                n3 = n5;
                System.out.println("bufferLoad_start = " + n4);
                System.out.println("bufferLoad = " + n3);
                Constants.T = 0;
                break;
            }
            case 3: {
                this.cx = 5;
                n4 = Constants.W[this.U][9];
                n3 = 1;
                Constants.T = 0;
                break;
            }
            case 4: {
                this.cx = 5;
                n4 = Constants.W[this.U][10];
                n3 = 1;
                Constants.T = 1;
                break;
            }
            case 5: {
                this.cx = 5;
                n4 = 39;
                n3 = 3;
                Constants.T = 1;
            }
        }
        n2 = n4;
        while (n2 < n4 + n3) {
            System.out.println("PlayStage.dateLong_StageText() = " + n2);
            this.cd = this.U(n2);
            this.utilService.a(';');
            this.cg[n2] = this.utilService.stringParser(this.cd, canvasWidth - this.utilService.n[Constants.T] * 2, (this.utilService.o[Constants.T] + this.utilService.o[Constants.T] / 2) * this.cx, this.utilService.n[Constants.T], this.utilService.o[Constants.T], this.utilService.o[Constants.T] / 2);
            if (n2 == n4) {
                this.cp = this.utilService.getTotalPageCount(this.cx);
                this.ci = this.cg[n4].length;
            } else if (n2 == n4 + 1) {
                this.cq = this.utilService.getTotalPageCount(this.cx);
                this.cj = this.cg[n4 + 1].length;
            } else if (n2 == n4 + 2) {
                this.cr = this.utilService.getTotalPageCount(this.cx);
                this.ck = this.cg[n4 + 2].length;
            } else if (n2 == n4 + 3) {
                this.cs = this.utilService.getTotalPageCount(this.cx);
                this.cl = this.cg[n4 + 3].length;
            } else if (n2 == n4 + 4) {
                this.ct = this.utilService.getTotalPageCount(this.cx);
                this.cm = this.cg[n4 + 4].length;
            }
            System.out.println("i = " + n2);
            ++n2;
        }
    }

    public final void c(int n) {
        int n2 = 0;
        int n3 = 0;
        this.cg = new byte[50][][];
        switch (n) {
            case 0: {
                this.cx = 5;
                n3 = 0;
                n2 = 4;
                Constants.T = 0;
                break;
            }
            case 1: {
                this.cx = 6;
                n3 = 4;
                n2 = 17;
                Constants.T = 0;
            }
        }
        int n4 = n3;
        while (n4 < n3 + n2) {
            this.cd = this.U(n4);
            this.utilService.a(';');
            this.cg[n4] = this.utilService.stringParser(this.cd, canvasWidth - this.utilService.n[Constants.T] * 16, (this.utilService.o[Constants.T] + this.utilService.o[Constants.T] / 2) * this.cx, this.utilService.n[Constants.T], this.utilService.o[Constants.T], this.utilService.o[Constants.T] / 2);
            if (n4 == n3) {
                this.cp = this.utilService.getTotalPageCount(this.cx);
                this.ci = this.cg[n3].length;
            } else if (n4 == n3 + 1) {
                this.cq = this.utilService.getTotalPageCount(this.cx);
                this.cj = this.cg[n3 + 1].length;
            } else if (n4 == n3 + 2) {
                this.cr = this.utilService.getTotalPageCount(this.cx);
                this.ck = this.cg[n3 + 2].length;
            } else if (n4 == n3 + 3) {
                this.cs = this.utilService.getTotalPageCount(this.cx);
                this.cl = this.cg[n3 + 3].length;
            } else if (n4 == n3 + 4) {
                this.ct = this.utilService.getTotalPageCount(this.cx);
                this.cm = this.cg[n3 + 4].length;
            }
            ++n4;
        }
    }

    private void Y(int n) {
        int n2 = 0;
        int n3 = 0;
        this.cg = new byte[50][][];
        switch (n) {
            case 6: {
                this.cx = 20;
                n3 = 30;
                n2 = 3;
                Constants.T = 1;
                break;
            }
            case 7: {
                this.cx = 20;
                n3 = 33;
                n2 = 1;
                Constants.T = 1;
            }
        }
        int n4 = n3;
        while (n4 < n3 + n2) {
            this.cd = this.U(n4);
            this.utilService.a(';');
            this.cg[n4] = this.utilService.stringParser(this.cd, canvasWidth - this.utilService.n[Constants.T] * 2, (this.utilService.o[Constants.T] + this.utilService.o[Constants.T] / 2) * this.cx, this.utilService.n[Constants.T], this.utilService.o[Constants.T], this.utilService.o[Constants.T] / 2);
            if (n4 == n3) {
                this.cp = this.utilService.getTotalPageCount(this.cx);
                this.ci = this.cg[n3].length;
            } else if (n4 == n3 + 1) {
                this.cq = this.utilService.getTotalPageCount(this.cx);
                this.cj = this.cg[n3 + 1].length;
            } else if (n4 == n3 + 2) {
                this.cr = this.utilService.getTotalPageCount(this.cx);
                this.ck = this.cg[n3 + 2].length;
            } else if (n4 == n3 + 3) {
                this.cs = this.utilService.getTotalPageCount(this.cx);
                this.cl = this.cg[n3 + 3].length;
            } else if (n4 == n3 + 4) {
                this.ct = this.utilService.getTotalPageCount(this.cx);
                this.cm = this.cg[n3 + 4].length;
            }
            ++n4;
        }
    }

    private void Z(int n) {
        this.cx = 15;
        this.cb = this.U(22);
        this.eu = Constants.midletVersion.getBytes();
        this.ev = this.U(n);
        this.cc = new byte[this.cb.length + this.eu.length + this.ev.length];
        System.arraycopy(this.cb, 0, this.cc, 0, this.cb.length);
        System.arraycopy(this.eu, 0, this.cc, this.cb.length, this.eu.length);
        System.arraycopy(this.ev, 0, this.cc, this.cb.length + this.eu.length, this.ev.length);
        this.utilService.a(';');
        this.ce = this.utilService.stringParser(this.cc, canvasWidth - this.utilService.n[1] * 10, (this.utilService.o[1] + this.utilService.o[1] / 2) * this.cx, this.utilService.n[1], this.utilService.o[1], this.utilService.o[1] / 2);
        this.ch = this.ce.length;
        this.co = this.utilService.getTotalPageCount(this.cx);
    }

    private void data_Text(int n) {
        this.cx = 5;
        this.ca = (canvasHeight - 64 - 15) / 2;
        this.bZ = canvasHeight - 13 - this.ca - this.utilService.o[0] / 2 * 3 * 3;
        this.cb = this.U(n);
        this.utilService.a(';');
        this.ce = this.utilService.stringParser(this.cb, canvasWidth - this.utilService.n[0] * 16, (this.utilService.o[0] + this.utilService.o[0] / 2) * this.cx, this.utilService.n[0], this.utilService.o[0], this.utilService.o[0] / 2);
        this.ch = this.ce.length;
        System.out.println("PlayStage.data_Text() str2DimensionCount = " + this.ch);
        this.co = this.utilService.getTotalPageCount(this.cx);
    }

    public final void nullSomeVariables() {
        this.utilService.somenullification(1);
        this.cb = null;
        this.cc = null;
        this.cd = null;
        this.ce = null;
        this.cf = null;
        this.cg = null;
    }

    private byte[][] ab(int n) {
        this.utilService.a(n, 1);
        int n2 = this.utilService.d[1][0];
        byte[][] byArray = new byte[n2][];
        int n3 = 0;
        while (n3 < n2) {
            byArray[n3] = this.utilService.c(1);
            ++n3;
        }
        return byArray;
    }

    private void ac(int n) {
        this.cf = this.ab(n);
    }

    private void ad(int n) {
        this.cf = this.ab(n);
    }

    public final void d(int n) {
        this.cf = this.ab(n);
    }

    private void a(byte[][] byArray, int n, int n2, int n3) {
        if (byArray.length <= n2) {
            int n4 = 0;
            while (n4 < byArray.length) {
                this.utilService.a(this.e, byArray[n4], by, this.bZ + n4 * (this.utilService.o[Constants.T] + 2), 17, Constants.T);
                ++n4;
            }
            return;
        }
        int n5 = 0;
        while (n5 < (n != n3 - 1 ? n2 : (byArray.length % n2 == 0 ? n2 : byArray.length % n2))) {
            this.utilService.a(this.e, byArray[n * n2 + n5], by, this.bZ + n5 * (this.utilService.o[0] + 2), 17, 0);
            ++n5;
        }
    }

    private void bC() {
        if (this.bW == -1) {
            return;
        }
        this.audioService.a(this.bW, this.bX);
        this.bW = -1;
    }

    private void b(int n, boolean bl) {
        if (n == -1 || this.bP[0] == 0 || this.bX && n == this.bV) {
            return;
        }
        this.bW = n;
        this.bX = bl;
    }

    private void bD() {
        this.audioService.stopSound();
        this.bW = -1;
        this.bX = false;
    }

    public static void h() {
        if (ChessR.t) {
            return;
        }
        ChessEngine.d();
        PlayStage.aL();
        chessEngine.c();
    }

    public static LittleEndianInt[] i() {
        return ChessEngine.o;
    }

    private void Y(Graphics graphics) {
        int n;
        this.Q(graphics);
        if (Constants.B == 1) {
            this.Z(graphics);
        } else if (bu == 110) {
            graphics.setColor(0x555555);
            graphics.fillRect(0, canvasHeight - 12, canvasWidth, 12);
            this.utilService.a(graphics, this.cf[4], 0, canvasHeight, 36, 1);
            this.utilService.a(graphics, this.cf[5], canvasWidth, canvasHeight, 40, 1);
        }
        this.a(graphics, ChessR.c, 136);
        if (this.bJ != null && !is3D) {
            this.a(graphics, this.bJ, 0xFF6600);
        }
        if (is3D && Constants.B == 1) {
            this.aa(graphics);
        }
        if (this.bJ != null && is3D && bu != 110) {
            this.a(graphics, this.bJ.a & 7, this.bJ.a >>> 3, 2, 0);
            this.a(graphics, this.bJ.b & 7, this.bJ.b >>> 3, 2, 0);
        }
        int n2 = 7;
        while (n2 >= 0) {
            n = 7;
            while (n >= 0) {
                this.paintPiece(graphics, n, n2, ChessR.n[n + n2 * 8]);
                --n;
            }
            --n2;
        }
        if (Constants.E == 1 && Constants.F == 1) {
            if (bu == 444) {
                if (!is3D) {
                    n2 = be + this.af(ChessR.p & 7);
                    n = bf + this.ah(ChessR.p >>> 3);
                } else {
                    n2 = bg + Constants.O[ChessR.p];
                    n = bh + Constants.Q[ChessR.p >>> 3];
                }
                if (!(ew || au || bI)) {
                    this.aE.a(graphics, n2, n);
                }
                this.paintPiece(graphics, ChessR.p & 7, ChessR.p >>> 3, ChessR.n[ChessR.p]);
            } else if (bu == 666) {
                n = bz - 25;
                Util.a(graphics, aK, by, n, canvasWidth, 50, 0, aT % 3, 17);
                int n3 = Math.abs(ChessR.r);
                int n4 = this.J[n3];
                int n5 = this.K[n3] - ChessR.l;
                int n6 = 20;
                int n7 = 20;
                if (!af) {
                    n5 *= -1;
                    n7 = 24;
                } else {
                    n4 *= -1;
                    n6 = 24;
                }
                n = bz + 25;
                this.aF.a(graphics, by + n4, n, n6, af);
                this.aG.a(graphics, by + n5, n, n7, !af);
                if (n3 == 3 || n3 == 6 || n3 == 5) {
                    this.aH.a();
                    if (this.aH.g) {
                        this.aH.b();
                    }
                    this.aH.a(graphics, by + n4, n, n6, af);
                }
                int n8 = this.L[n3] - 2;
                int n9 = 0;
                int n10 = 0;
                if (n3 == 1 || n3 == 3 || n3 == 2 || n3 == 4) {
                    System.out.println("select == " + n3);
                    if (this.aF.h >= n8 && this.aF.h < n8 + 5) {
                        if (this.aF.h - n8 >= 0 && this.aF.h - n8 <= 4) {
                            n9 = -14;
                            n10 = -12;
                        }
                        graphics.drawImage(this.aI[this.aF.h - n8], by + n5 - (!af ? this.aG.a[0].width : -this.aG.a[0].width) + n9, n - 20 + n10, 20);
                    }
                }
            }
        }
        this.v(graphics);
    }

    private void paintPiece(Graphics graphics, int n, int n2, int n3) {
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        if (is3D) {
            n6 = n + n2 * 8;
            n4 = bg + Constants.O[n6];
            n5 = bh + Constants.P[n2];
        } else {
            n4 = this.ae(n);
            n5 = this.ag(n2);
        }
        if (bK && ChessR.g == n && ChessR.h == n2) {
            this.a(graphics, n, n2, 0, 0);
            this.a(graphics, n4, n5, 2);
        }
        if (ChessR.e == n && ChessR.f == n2) {
            if (is3D) {
                if (ChessR.n[n + n2 * 8] != 0) {
                    n7 -= 6;
                } else {
                    switch (n2) {
                        case 0: {
                            n7 = -5;
                            break;
                        }
                        case 1: {
                            n7 = -6;
                            break;
                        }
                        case 2: {
                            n7 = -6;
                            break;
                        }
                        case 3: {
                            n7 = -6;
                            break;
                        }
                        case 4: {
                            n7 = -3;
                            break;
                        }
                        case 5: {
                            n7 = -3;
                            break;
                        }
                        case 6: {
                            n7 = -3;
                            break;
                        }
                        case 7: {
                            n7 = -2;
                        }
                    }
                }
                if (ChessR.n[n6] != 0) {
                    n7 -= 6;
                }
            }
            if (bu != 110) {
                this.a(graphics, n4, n5 + n7, 1);
            }
        }
        if (is3D) {
            if (n3 > 0) {
                graphics.drawImage(this.aC[n3 - 1], n4, n5, 33);
            } else if (n3 < 0) {
                graphics.drawImage(this.aD[Math.abs(n3) - 1], n4, n5, 33);
            }
            if (ChessR.e == n && ChessR.f == n2) {
                this.a(graphics, n4, n5 + n7, 5);
            }
            if (this.dI != -4132 || bu == 110) {
                if (bu == 110) {
                    int n8 = Integer.parseInt(dd.elementAt(de).toString());
                    if (n == (n8 & 7) && n2 == n8 >>> 3) {
                        Util.a(graphics, this.dJ, n4, n5 - 10, 31, 24, 0, aT % 4, 3);
                    }
                    System.out.println("PlayStage.paintPiece()1111");
                    if (this.dI != -4132 && n == (n8 & 7) && n2 == n8 >>> 3) {
                        if (this.dI < 1 || this.dI == 2) {
                            PlayStage.V(graphics);
                        } else if (this.dI < 2 || this.dI == 3) {
                            PlayStage.U(graphics);
                        }
                        this.b(graphics, n4, n5);
                        System.out.println("PlayStage.paintPiece()22222");
                        return;
                    }
                } else if (bu == 115 && n == (this.dG.b & 7) && n2 == this.dG.b >>> 3) {
                    Util.a(graphics, this.dJ, n4, n5 + n7, 33, 25, 0, aT % 4, 3);
                    if (this.dI < 1 || this.dI == 2) {
                        PlayStage.V(graphics);
                    } else if (this.dI < 2 || this.dI == 3) {
                        PlayStage.U(graphics);
                    }
                    this.b(graphics, n4, n5);
                    return;
                }
            }
        } else {
            if (n3 != 0) {
                this.aB[5 + Math.abs(n3) + (n3 > 0 ? 0 : 6)].a(graphics, be + n4 + this.aL, bf + n5 + this.aL);
            }
            if (this.dI != -4132 || bu == 110) {
                if (bu == 110) {
                    int n9 = Integer.parseInt(dd.elementAt(de).toString());
                    if (n == (n9 & 7) && n2 == n9 >>> 3) {
                        this.a(graphics, this.ae(n9 & 7), this.ag(n9 >>> 3), 5);
                    }
                    if (this.dI != -4132 && n == (n9 & 7) && n2 == n9 >>> 3) {
                        this.b(graphics, n4, n5);
                        System.out.println("PlayStage.paintPiece()333333333");
                        return;
                    }
                } else if (this.dG != null && n == (this.dG.b & 7) && n2 == this.dG.b >>> 3) {
                    this.b(graphics, n4, n5);
                    System.out.println("PlayStage.paintPiece()4444444");
                }
            }
        }
    }

    private int ae(int n) {
        int n2 = this.bj == 1 ? n * this.bc : this.bc * 7 - n * this.bc;
        return n2;
    }

    private int af(int n) {
        return this.ae(n) + (this.bc >> 1);
    }

    private int ag(int n) {
        int n2 = this.bj == 1 ? this.bc * 7 - n * this.bc : n * this.bc;
        return n2;
    }

    private int ah(int n) {
        return this.ag(n) + (this.bc >> 1);
    }

    public static void j() {
        int n = 0;
        ex = 0;
        int n2 = 0;
        while (n2 < ChessR.m.length) {
            if (ChessR.m[n2] != ChessEngine.a[n2]) {
                ++n;
                ChessR.m[n2] = ChessEngine.a[n2];
            }
            switch (Math.abs(ChessR.m[n2])) {
                case 1: {
                    ex += ChessR.m[n2] * 3;
                    break;
                }
                case 2: {
                    ex += ChessR.m[n2] * 7;
                    break;
                }
                case 3: {
                    ex += ChessR.m[n2] * 9;
                    break;
                }
                case 4: {
                    ex += ChessR.m[n2] * 17;
                    break;
                }
                case 5: {
                    ex += ChessR.m[n2] * 30;
                }
            }
            ++n2;
        }
        if (ChessR.k != 0) {
            if (n == 4) {
                dx = bu == 2 ? 0 : 1;
                PlayStage.a(2000);
                ew = true;
                return;
            }
            if (n == 3) {
                PlayStage.a(3000);
                ew = true;
            }
        }
    }

    public static void k() {
        int n = 0;
        while (n < ChessR.m.length) {
            if (ChessR.n[n] != ChessEngine.a[n]) {
                ChessR.n[n] = ChessEngine.a[n];
            }
            ++n;
        }
    }

    private void a(Graphics graphics, LittleEndianInt i2, int n) {
        if (i2 == null || i2.a == i2.b) {
            return;
        }
        int n2 = i2.a & 7;
        int n3 = i2.a >>> 3;
        int n4 = i2.b & 7;
        int n5 = i2.b >>> 3;
        int n6 = is3D ? Constants.O[i2.a] : this.ae(n2) + this.bc / 2;
        int n7 = is3D ? Constants.Q[n3] : this.ag(n3) + this.bc / 2;
        int n8 = is3D ? Constants.O[i2.b] : this.ae(n4) + this.bc / 2;
        int n9 = is3D ? Constants.Q[n5] : this.ag(n5) + this.bc / 2;
        graphics.setColor(n);
        int n10 = is3D ? bg + n6 : be + n6;
        int n11 = is3D ? bh + n7 : bf + n7;
        int n12 = is3D ? bg + n8 : be + n8;
        int n13 = is3D ? bh + n9 : bf + n9;
        graphics.drawLine(n10, n11, n12, n13);
        graphics.drawLine(n10 + 1, n11, n12 + 1, n13);
        graphics.drawLine(n10, n11 + 1, n12, n13 + 1);
        graphics.drawLine(n10 + 1, n11 + 1, n12 + 1, n13 + 1);
    }

    private void Z(Graphics graphics) {
        byte by = 0;
        this.ey = 0;
        if (bu == 110) {
            int n = dd.size();
            if (is3D) {
                int n2 = 0;
                while (n2 < n) {
                    int n3 = Integer.parseInt(dd.elementAt(n2).toString());
                    this.a(graphics, n3 & 7, n3 >>> 3, 1, 0);
                    ++n2;
                }
                return;
            }
            int n4 = 0;
            while (n4 < n) {
                int n5 = Integer.parseInt(dd.elementAt(n4).toString());
                this.a(graphics, n5 & 7, n5 >>> 3, 1, 0);
                ++n4;
            }
            return;
        }
        LittleEndianInt[] iArray = PlayStage.i();
        int n = ChessR.g + ChessR.h * 8;
        if (!ChessEngine.d) {
            LittleEndianInt i2;
            int n6 = 0;
            while (n6 < iArray.length) {
                i2 = iArray[n6];
                if (bK) {
                    if (i2.a == n) {
                        by = i2.b;
                        this.a(graphics, by & 7, by >>> 3, 0, 0);
                    }
                } else if (!is3D) {
                    by = i2.a;
                    this.a(graphics, by & 7, by >>> 3, 1, 0);
                }
                ++n6;
            }
            n6 = 0;
            while (n6 < iArray.length) {
                i2 = iArray[n6];
                if (!(bK || i2.c != 4 && i2.c != 8)) {
                    this.ey = 1;
                }
                ++n6;
            }
        }
    }

    private void aa(Graphics graphics) {
        if (bu == 110) {
            return;
        }
        byte by = 0;
        LittleEndianInt[] iArray = PlayStage.i();
        this.ey = 0;
        if (!ChessEngine.d) {
            LittleEndianInt i2;
            int n = 0;
            while (n < iArray.length) {
                i2 = iArray[n];
                if (!bK) {
                    by = i2.a;
                    this.a(graphics, by & 7, by >>> 3, 1, 0);
                }
                ++n;
            }
            n = 0;
            while (n < iArray.length) {
                i2 = iArray[n];
                if (!(bK || i2.c != 4 && i2.c != 8)) {
                    by = i2.a;
                    this.a(graphics, by & 7, by >>> 3, 1, i2.c);
                    by = i2.b;
                    this.a(graphics, by & 7, by >>> 3, 1, i2.c);
                    this.ey = 1;
                }
                ++n;
            }
        }
    }

    private void ai(int n) {
        if (this.ez) {
            return;
        }
        if (ChessR.c != null && ++ChessR.i > 5) {
            ChessR.c = null;
            ChessR.i = 0;
        }
        switch (n) {
            case 49: {
                PlayStage.b(-this.bj, this.bj);
                return;
            }
            case -1: 
            case 50: {
                PlayStage.b(0, this.bj);
                return;
            }
            case 51: {
                PlayStage.b(this.bj, this.bj);
                return;
            }
            case -3: 
            case 52: {
                PlayStage.b(-this.bj, 0);
                return;
            }
            case -4: 
            case 54: {
                PlayStage.b(this.bj, 0);
                return;
            }
            case 55: {
                PlayStage.b(-this.bj, -this.bj);
                return;
            }
            case -2: 
            case 56: {
                PlayStage.b(0, -this.bj);
                return;
            }
            case 57: {
                PlayStage.b(this.bj, -this.bj);
                return;
            }
            case -5: 
            case 53: {
                if (bK && ChessR.g == ChessR.e && ChessR.h == ChessR.f) {
                    bK = false;
                    return;
                }
                if (!ChessEngine.d && bK) {
                    LittleEndianInt[] iArray = PlayStage.i();
                    int n2 = 0;
                    while (n2 < iArray.length) {
                        if (iArray[n2].a == ChessR.g + ChessR.h * 8 && iArray[n2].b == ChessR.e + ChessR.f * 8) break;
                        ++n2;
                    }
                    if (n2 < iArray.length) {
                        ChessEngine.d();
                        ++ba;
                        if (bk != 2) {
                            int n3 = ChessR.r - 1;
                            this.B[n3] = this.B[n3] + 1;
                        }
                        if (iArray[n2].d != 0) {
                            this.aK();
                            ChessR.p = iArray[n2].a;
                            return;
                        }
                        this.b(iArray[n2]);
                        if (this.bJ != null) {
                            this.bJ = null;
                        }
                        this.ez = true;
                        if (bk == 2) {
                            ChessR.c = iArray[n2];
                            this.bJ = null;
                        }
                        bK = false;
                        ChessR.h = -1;
                        ChessR.g = -1;
                        if (ChessEngine.b(ChessEngine.l) && !bI && Constants.G == 0) {
                            dv = 0;
                            audioService.setVolumeLevel(1000);
                        }
                        ChessR.b();
                        return;
                    }
                    bK = false;
                    this.X();
                    if (ChessR.m[ChessR.e + ChessR.f * 8] == 0) break;
                    ChessR.r = ChessR.o[ChessR.e + ChessR.f * 8];
                    ChessR.g = ChessR.e;
                    ChessR.h = ChessR.f;
                    bK = true;
                    this.X();
                    return;
                }
                if (ChessR.m[ChessR.e + ChessR.f * 8] == 0) break;
                ChessR.r = ChessR.o[ChessR.e + ChessR.f * 8];
                if (bk != 2) {
                    af = false;
                }
                bK = true;
                ChessR.g = ChessR.e;
                ChessR.h = ChessR.f;
                this.X();
            }
        }
    }

    private static void b(int n, int n2) {
        ChessR.f += n2;
        ChessR.d = -1;
        if ((ChessR.e += n) < 0) {
            ChessR.e = 7;
        } else if (ChessR.e > 7) {
            ChessR.e = 0;
        }
        if (ChessR.f < 0) {
            ChessR.f = 7;
            return;
        }
        if (ChessR.f > 7) {
            ChessR.f = 0;
        }
    }

    private void b(LittleEndianInt i2) {
        if (chessEngine != null) {
            ChessEngine.d();
        }
        PlayStage.bE();
        ChessEngine.a(i2);
        LittleEndianInt[] iArray = PlayStage.i();
        PlayStage.j();
        this.a(i2);
        if (ChessEngine.a(iArray)) {
            bI = true;
            if (ChessEngine.b(iArray) == 0) {
                Constants.G = ChessEngine.b() ? 2 : (ChessEngine.g() >= 3 ? 1 : 0);
                audioService.setVolumeLevel(44);
            } else {
                Constants.G = ChessEngine.b(iArray) == 1 ? 20 : 30;
                audioService.setVolumeLevel(44);
            }
        } else {
            if (Constants.L) {
                this.c();
            }
            @SuppressWarnings("unused")
            int n = bL = bL == 0 ? 1 : 0;
        }
        if (bk != 2) {
            af = false;
        }
        j = false;
    }

    @SuppressWarnings("unchecked")
    private static void bE() {
        byte[] byArray = new byte[66];
        System.arraycopy(ChessEngine.a, 0, byArray, 0, 64);
        byArray[64] = (byte)ChessEngine.castlingStatusMask;
        byArray[65] = (byte)(j ? 1 : 0);
        et.addElement(byArray);
    }

    public final void a(LittleEndianInt i2) {
        if ((i2.c & 0xC) == 0) {
            if (i2.d == 0) {
                byte by = ChessR.m[i2.b];
                ChessR.p = i2.a;
                ChessR.q = i2.b;
                if (ChessR.o[ChessR.q] != 0) {
                    if (bu == 2) {
                        ChessR.s = ChessR.o[ChessR.q];
                    }
                    if (Constants.E == 0 || Constants.F == 0) {
                        bb = 0;
                    }
                    if (Constants.F == 0 || Constants.E == 0) {
                        this.b(3, false);
                    }
                }
                if (by < 0) {
                    return;
                }
            } else if (i2.d != 0 && bu == 3) {
                ChessR.p = i2.a;
                ChessR.q = i2.b;
            }
        }
    }

    private byte[] b(String string) {
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
                System.arraycopy(byArray2, 0, byArray, 0, byArray.length);
            }
        }
        catch (Exception exception) {}
        return byArray;
    }
}

