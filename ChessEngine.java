/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public final class ChessEngine
implements Runnable {
    private int v;
    private static int w;
    private static int x;
    private static int y;
    public static byte[] a;
    public static byte[] chessBoard;
    private byte[] chessboardSus = new byte[64];
    public static volatile LittleEndianInt c;
    public static volatile boolean d;
    public static int[] e;
    public static int f;
    private static int[] A;
    private static int[] B;
    private static int[] C;
    private static int[] D;
    private static int[] E;
    private static int F;
    private static int G;
    private static int H;
    private static int I;
    public static int g;
    public static int h;
    private int J;
    private int K;
    private int L;
    private int M;
    private static int N;
    private int[] O;
    private int[] P;
    private static final int[] Q;
    private static int R;
    private static int S;
    private static int T;
    public static Random i;
    private static int U;
    private static int V;
    private static int W;
    private int X;
    private static int[][] Y;
    private static int[] Z;
    private static short[] aa;
    private static int[] ab;
    private int[][] ac;
    private int[] ad;
    private int[] ae;
    private static boolean af;
    private static boolean ag;
    private static boolean ah;
    private static volatile Thread ai;
    private boolean aj = true;
    public static boolean j;
    private static int ak;
    private int al;
    public static int k;
    private int am;
    public static int l;
    private static int blackKingSquareIndex;
    private static int whiteKingSquareIndex;
    private int blackKingSquare;
    private int whiteKingSquare;
    public static int castlingStatusMask; // First 2 bits for white castling (left and right) next two bits for black castling.
    private int castlingMask;
    private int as;
    private int at;
    public static int n;
    private int au;
    public static LittleEndianInt[] o;
    private static final byte[] av;
    private static int aw;
    public static final byte[] p;
    public static final byte[] q;
    public static final int[] r;
    public static final int[] s;
    public static final int[] t;
    public long u = 0L;

    static {
        a = new byte[64];
        chessBoard = new byte[64];
        d = false;
        e = new int[512];
        A = new int[8];
        B = new int[32];
        C = new int[32];
        D = new int[32];
        E = new int[32];
        N = 2;
        Q = new int[0];
        S = 0;
        i = new Random();
        Y = new int[64][];
        Z = new int[1024];
        aa = new short[512];
        af = false;
        ag = false;
        ah = false;
        byte[] byArray = new byte[64];
        byArray[0] = 22;
        byArray[1] = 20;
        byArray[2] = 18;
        byArray[3] = 16;
        byArray[4] = 16;
        byArray[5] = 18;
        byArray[6] = 20;
        byArray[7] = 22;
        byArray[8] = 20;
        byArray[9] = 16;
        byArray[10] = 12;
        byArray[11] = 8;
        byArray[12] = 8;
        byArray[13] = 12;
        byArray[14] = 16;
        byArray[15] = 20;
        byArray[16] = 18;
        byArray[17] = 12;
        byArray[18] = 6;
        byArray[19] = 4;
        byArray[20] = 4;
        byArray[21] = 6;
        byArray[22] = 12;
        byArray[23] = 18;
        byArray[24] = 16;
        byArray[25] = 8;
        byArray[26] = 4;
        byArray[29] = 4;
        byArray[30] = 8;
        byArray[31] = 16;
        byArray[32] = 16;
        byArray[33] = 8;
        byArray[34] = 4;
        byArray[37] = 4;
        byArray[38] = 8;
        byArray[39] = 16;
        byArray[40] = 18;
        byArray[41] = 12;
        byArray[42] = 6;
        byArray[43] = 4;
        byArray[44] = 4;
        byArray[45] = 6;
        byArray[46] = 12;
        byArray[47] = 17;
        byArray[48] = 20;
        byArray[49] = 16;
        byArray[50] = 12;
        byArray[51] = 8;
        byArray[52] = 8;
        byArray[53] = 12;
        byArray[54] = 16;
        byArray[55] = 20;
        byArray[56] = 22;
        byArray[57] = 22;
        byArray[58] = 18;
        byArray[59] = 16;
        byArray[60] = 16;
        byArray[61] = 18;
        byArray[62] = 20;
        byArray[63] = 22;
        av = byArray;
        byte[] byArray2 = new byte[64];
        byArray2[8] = 91;
        byArray2[9] = 99;
        byArray2[10] = 103;
        byArray2[11] = 102;
        byArray2[12] = 102;
        byArray2[13] = 106;
        byArray2[14] = 100;
        byArray2[15] = 100;
        byArray2[16] = 93;
        byArray2[17] = 102;
        byArray2[18] = 105;
        byArray2[19] = 110;
        byArray2[20] = 110;
        byArray2[21] = 105;
        byArray2[22] = 102;
        byArray2[23] = 102;
        byArray2[24] = 95;
        byArray2[25] = 104;
        byArray2[26] = 107;
        byArray2[27] = 115;
        byArray2[28] = 115;
        byArray2[29] = 107;
        byArray2[30] = 104;
        byArray2[31] = 101;
        byArray2[32] = 99;
        byArray2[33] = 108;
        byArray2[34] = 109;
        byArray2[35] = 118;
        byArray2[36] = 118;
        byArray2[37] = 109;
        byArray2[38] = 106;
        byArray2[39] = 103;
        byArray2[40] = 103;
        byArray2[41] = 110;
        byArray2[42] = 113;
        byArray2[43] = 123;
        byArray2[44] = 123;
        byArray2[45] = 113;
        byArray2[46] = 107;
        byArray2[47] = 104;
        byArray2[48] = 120;
        byArray2[49] = 127;
        byArray2[50] = 125;
        byArray2[51] = 127;
        byArray2[52] = 127;
        byArray2[53] = 125;
        byArray2[54] = 127;
        byArray2[55] = 124;
        p = byArray2;
        byte[] byArray3 = new byte[64];
        byArray3[8] = 120;
        byArray3[9] = 127;
        byArray3[10] = 125;
        byArray3[11] = 127;
        byArray3[12] = 127;
        byArray3[13] = 125;
        byArray3[14] = 127;
        byArray3[15] = 124;
        byArray3[16] = 103;
        byArray3[17] = 110;
        byArray3[18] = 113;
        byArray3[19] = 123;
        byArray3[20] = 123;
        byArray3[21] = 113;
        byArray3[22] = 107;
        byArray3[23] = 104;
        byArray3[24] = 99;
        byArray3[25] = 108;
        byArray3[26] = 109;
        byArray3[27] = 118;
        byArray3[28] = 118;
        byArray3[29] = 109;
        byArray3[30] = 106;
        byArray3[31] = 103;
        byArray3[32] = 95;
        byArray3[33] = 104;
        byArray3[34] = 107;
        byArray3[35] = 115;
        byArray3[36] = 115;
        byArray3[37] = 107;
        byArray3[38] = 104;
        byArray3[39] = 101;
        byArray3[40] = 93;
        byArray3[41] = 102;
        byArray3[42] = 105;
        byArray3[43] = 110;
        byArray3[44] = 110;
        byArray3[45] = 105;
        byArray3[46] = 102;
        byArray3[47] = 102;
        byArray3[48] = 91;
        byArray3[49] = 99;
        byArray3[50] = 103;
        byArray3[51] = 102;
        byArray3[52] = 102;
        byArray3[53] = 106;
        byArray3[54] = 100;
        byArray3[55] = 100;
        q = byArray3;
        r = new int[]{305, 310, 315, 317, 317, 315, 310, 305, 313, 328, 328, 328, 328, 328, 328, 313, 313, 330, 333, 330, 330, 333, 330, 313, 315, 325, 335, 340, 340, 335, 325, 315, 320, 330, 338, 340, 340, 338, 330, 320, 325, 335, 339, 340, 340, 339, 335, 325, 325, 335, 339, 340, 340, 339, 335, 325, 325, 335, 339, 340, 340, 339, 335, 325};
        s = new int[]{325, 335, 339, 340, 340, 339, 335, 325, 325, 335, 339, 340, 340, 339, 335, 325, 325, 335, 339, 340, 340, 339, 335, 325, 320, 330, 338, 340, 340, 338, 330, 320, 315, 325, 335, 340, 340, 335, 325, 315, 313, 330, 333, 330, 330, 333, 330, 313, 313, 328, 328, 328, 328, 328, 328, 313, 305, 310, 315, 317, 317, 315, 310, 305};
        t = new int[]{275, 280, 290, 290, 290, 290, 280, 275, 280, 295, 300, 305, 305, 300, 295, 280, 290, 305, 310, 313, 313, 310, 305, 290, 290, 305, 313, 315, 315, 313, 305, 290, 290, 305, 313, 315, 315, 313, 305, 290, 290, 305, 310, 313, 313, 310, 305, 290, 280, 295, 300, 305, 305, 300, 295, 280, 275, 280, 290, 290, 290, 290, 280, 275};
    }

    public static final void a(int n) {
        int[][] nArrayArray = new int[][]{{1, 2047}, {1, 511}, {1, 63}, {1, 15}, {1, 7}, {2, 15}, {2, 7}, {2, 3}, {3, 3}, {5, 3}, {6, 3}};
        T = (byte)nArrayArray[n][0];
        R = nArrayArray[n][1];
    }

    public static final void a(LittleEndianInt i2) {
        ChessEngine.c(i2.a());
        ChessEngine.o();
    }

    private static void c(int n) {
        int n2;
        int n3;
        @SuppressWarnings("unused")
        int n4;
        int n5 = n & 0xFF;
        int n6 = n >> 8 & 0xFF;
        int n7 = n >> 16 & 0xFF;
        byte by = (byte)(n >> 24 & 0xFF);
        int n8 = castlingStatusMask;
        ChessEngine.Z[ChessEngine.U] = n4 = (k << 16) + (ChessEngine.n << 8) + n8 + (chessBoard[n6] << 24);
        ++k;
        ChessEngine.n = 10;
        int n9 = l * chessBoard[n5];
        if (n9 == 1) {
            k = 0;
            n3 = n5 - n6;
            if (n3 == -16 || n3 == 16) {
                n2 = n5 & 7;
                if (n2 > 0 && chessBoard[n6 - 1] == -l) {
                    ChessEngine.n = (byte)n2;
                }
                if (n2 < 7 && chessBoard[n6 + 1] == -l) {
                    ChessEngine.n = (byte)n2;
                }
            }
        }
        if (chessBoard[n6] != 0) {
            k = 0;
            n3 = n6;
            n2 = chessBoard[n6];
            if (n2 > 0) {
                if (n2 == 1) {
                    H -= p[n3];
                    W = 30000;
                } else if (n2 == 2) {
                    g -= t[n3];
                } else if (n2 == 3) {
                    g -= r[n3];
                } else if (n2 == 4) {
                    g -= 510;
                } else if (n2 == 5) {
                    g -= 960;
                } else {
                    whiteKingSquareIndex = -1;
                }
            } else if (n2 == -1) {
                I -= q[n3];
                W = 30000;
            } else if (n2 == -2) {
                h -= t[n3];
            } else if (n2 == -3) {
                h -= s[n3];
            } else if (n2 == -4) {
                h -= 510;
            } else if (n2 == -5) {
                h -= 960;
            } else {
                blackKingSquareIndex = -1;
            }
        }
        if ((n7 & 0x40) != 0) {
            ChessEngine.chessBoard[n6 - (ChessEngine.l << 3)] = 0;
            if (l == 1) {
                I -= q[n6 - 8];
            } else {
                H -= p[n6 + 8];
            }
        }
        if ((n3 = chessBoard[n5]) == 1) {
            H -= p[n5];
            H += p[n6];
            W = 30000;
        } else if (n3 == -1) {
            I -= q[n5];
            I += q[n6];
            W = 30000;
        } else if (n3 == 2) {
            g -= t[n5];
            g += t[n6];
        } else if (n3 == -2) {
            h -= t[n5];
            h += t[n6];
        } else if (n3 == 3) {
            g -= r[n5];
            g += r[n6];
        } else if (n3 == -3) {
            h -= s[n5];
            h += s[n6];
        } else if (n3 == 6) {
            whiteKingSquareIndex = n6;
            W = 30000;
            ChessEngine.evaluateKingFileDistances();
        } else if (n3 == -6) {
            blackKingSquareIndex = n6;
            W = 30000;
            ChessEngine.evaluateKingFileDistances();
        }
        ChessEngine.chessBoard[n6] = chessBoard[n5];
        ChessEngine.chessBoard[n5] = 0;
        if (n9 == 6) {
            if (n6 - n5 == -2) {
                ChessEngine.chessBoard[n5 & 0xFFFFFFF8] = 0;
                ChessEngine.chessBoard[(n5 & 0xFFFFFFF8) + 3] = (byte)(4 * l);
                ak += l * 52;
            } else if (n6 - n5 == 2) {
                ChessEngine.chessBoard[(n5 & 0xFFFFFFF8) + 7] = 0;
                ChessEngine.chessBoard[(n5 & 0xFFFFFFF8) + 5] = (byte)(4 * l);
                ak += l * 65;
            }
            castlingStatusMask = l < 0 ? (castlingStatusMask &= 0xFFFFFFF3) : (castlingStatusMask &= 0xFFFFFFFC);
        }
        if (n9 == 1) {
            ChessEngine.w(n5 & 7);
            if ((n5 - n6 & 7) != 0) {
                ChessEngine.w(n6 & 7);
            }
        }
        if (l == 1) {
            if (n9 == 6) {
                if (n6 - n5 == -2) {
                    ChessEngine.chessBoard[0] = 0;
                    ChessEngine.chessBoard[3] = 4;
                } else if (n6 - n5 == 2) {
                    ChessEngine.chessBoard[7] = 0;
                    ChessEngine.chessBoard[5] = 4;
                }
            }
            if (n5 == 0) {
                castlingStatusMask &= 0xFFFFFFFD;
            }
            if (n5 == 7) {
                castlingStatusMask &= 0xFFFFFFFE;
            }
            if (n6 == 56) {
                castlingStatusMask &= 0xFFFFFFF7;
            }
            if (n6 == 63) {
                castlingStatusMask &= 0xFFFFFFFB;
            }
            if (by != 0) {
                ChessEngine.chessBoard[n6] = by;
                ChessEngine.A();
            }
        } else {
            if (n9 == 6) {
                if (n6 - n5 == -2) {
                    ChessEngine.chessBoard[56] = 0;
                    ChessEngine.chessBoard[59] = -4;
                } else if (n6 - n5 == 2) {
                    ChessEngine.chessBoard[63] = 0;
                    ChessEngine.chessBoard[61] = -4;
                }
            }
            if (n5 == 56) {
                castlingStatusMask &= 0xFFFFFFF7;
            }
            if (n5 == 63) {
                castlingStatusMask &= 0xFFFFFFFB;
            }
            if (n6 == 0) {
                castlingStatusMask &= 0xFFFFFFFD;
            }
            if (n6 == 7) {
                castlingStatusMask &= 0xFFFFFFFE;
            }
            if (by != 0) {
                ChessEngine.chessBoard[n6] = by;
                ChessEngine.A();
            }
        }
        l = -l;
        if (Y[U >>> 8] == null) {
            ChessEngine.Y[ChessEngine.U >>> 8] = new int[256];
        }
        ChessEngine.Y[ChessEngine.U >>> 8][ChessEngine.U & 0xFF] = n;
        if (U < 512) {
            ChessEngine.aa[ChessEngine.U] = (short)W;
        }
        ++U;
    }

    private static LittleEndianInt d(int n) {
        return new LittleEndianInt(Y[n >>> 8][n & 0xFF] & 0xFF, Y[n >>> 8][n & 0xFF] >>> 8 & 0xFF, Y[n >>> 8][n & 0xFF] >>> 16 & 0xFF, Y[n >>> 8][n & 0xFF] >>> 24);
    }

    private static void setKingsSquareIndices() {
        whiteKingSquareIndex = -1;
        blackKingSquareIndex = -1;

        int squareIndex = 63;

        while (squareIndex >= 0) {
            if (chessBoard[squareIndex] == -6) { // Black King
                blackKingSquareIndex = squareIndex;
                break;
            }
            squareIndex = (byte)(squareIndex - 1);
        }

        squareIndex = 0;
        while (squareIndex < 64) {
            if (chessBoard[squareIndex] == 6) {
                whiteKingSquareIndex = squareIndex;
                return;
            }
            squareIndex = (byte)(squareIndex + 1);
        }
    }

    private static void a(boolean bl) {
        int n;
        int n2;
        int n3;
        int n4 = Y[U >>> 8][--U & 0xFF];
        int n5 = n4 & 0xFF;
        int n6 = n4 >> 8 & 0xFF;
        int n7 = n4 >> 24 & 0xFF;
        int n8 = Z[U];
        int n9 = n8 & 0xFF;
        castlingStatusMask = n9 & 0xF;
        k = n8 >> 16 & 0xFF;
        ChessEngine.n = n8 >> 8 & 0xFF;
        l = -l;

        n3 = (int)(n8 >> 24);
        ChessEngine.chessBoard[n5] = chessBoard[n6];
        ChessEngine.chessBoard[n6] = (byte) n3;

        W = U < 512 ? aa[U] : 30000;
        if (bl) {
            n2 = n6;
            n = n3;
            if (n != 0) {
                if (n == 1) {
                    ChessEngine.w(n2 & 7);
                    H += p[n2];
                } else if (n == -1) {
                    ChessEngine.w(n2 & 7);
                    I += q[n2];
                } else if (n == 2) {
                    g += t[n2];
                } else if (n == -2) {
                    h += t[n2];
                } else if (n == 3) {
                    g += r[n2];
                } else if (n == -3) {
                    h += s[n2];
                } else if (n == 4) {
                    g += 510;
                } else if (n == -4) {
                    h += 510;
                } else if (n == 5) {
                    g += 960;
                } else if (n == -5) {
                    h += 960;
                }
            }
            if (n == 6) {
                whiteKingSquareIndex = n6;
                ChessEngine.evaluateKingFileDistances();
            } else if (n == -6) {
                blackKingSquareIndex = n6;
                ChessEngine.evaluateKingFileDistances();
            }
            n2 = chessBoard[n5];
            if (n2 == 1) {
                H -= p[n6];
                H += p[n5];
                ChessEngine.w(n6 & 7);
                if ((n6 - n5 & 7) != 0) {
                    ChessEngine.w(n5 & 7);
                }
            } else if (n2 == -1) {
                I -= q[n6];
                I += q[n5];
                ChessEngine.w(n6 & 7);
                if ((n6 - n5 & 7) != 0) {
                    ChessEngine.w(n5 & 7);
                }
            } else if (n2 == 2) {
                g -= t[n6];
                g += t[n5];
            } else if (n2 == -2) {
                h -= t[n6];
                h += t[n5];
            } else if (n2 == 3) {
                g -= r[n6];
                g += r[n5];
            } else if (n2 == -3) {
                h -= s[n6];
                h += s[n5];
            } else if (n2 == 6) {
                whiteKingSquareIndex = n5;
            } else if (n2 == -6) {
                blackKingSquareIndex = n5;
            }
        }
        if (n7 != 0) {
            ChessEngine.chessBoard[n5] = (byte)l;
            ChessEngine.A();
        }
        if ((n2 = l * chessBoard[n5]) == 1 && ChessEngine.n >= 0 && n3 == 0 && (n6 & 7) != (n5 & 7)) {
            ChessEngine.chessBoard[(n5 & 0xF8) + ChessEngine.n] = (byte)(-l);
            ChessEngine.A();
        }
        if (n2 == 6) {
            if (n6 - n5 == -2) {
                n = n5 & 0xFFFFFFF8;
                int n10 = (n5 & 0xFFFFFFF8) + 3;
                ChessEngine.chessBoard[n] = chessBoard[n10];
                ChessEngine.chessBoard[n10] = 0;
                ak -= l * 52;
                return;
            }
            if (n6 - n5 == 2) {
                n = n5 | 7;
                int n11 = (n5 & 0xFFFFFFF8) + 5;
                ChessEngine.chessBoard[n] = chessBoard[n11];
                ChessEngine.chessBoard[n11] = 0;
                ak -= l * 65;
            }
        }
    }

    private static void a(int n, int n2, int n3) {
        int n4 = n & 7;
        int n5 = n >> 3;
        int n6 = 0;
        while (n6 < 7) {
            if ((((n4 += n2) | (n5 += n3)) & 0xFF) >= 8) {
                return;
            }
            int n7 = n4 + (n5 << 3);
            if (chessBoard[n7] != 0) {
                return;
            }
            ChessEngine.e[ChessEngine.f++] = n + (n7 << 8);
            ++n6;
        }
    }

    private static void e(int n) {
        int n2;
        int n3 = n & 7;
        int n4 = n - 8;
        while (n4 >= 0) {
            n2 = chessBoard[n4];
            if (n2 != 0) {
                if (n2 <= 0) break;
                ChessEngine.e[ChessEngine.f++] = n + (n4 << 8) + 65536;
                break;
            }
            n4 -= 8;
        }
        n4 = n + 8;
        while (n4 < 64) {
            n2 = chessBoard[n4];
            if (n2 != 0) {
                if (n2 <= 0) break;
                ChessEngine.e[ChessEngine.f++] = n + (n4 << 8) + 65536;
                break;
            }
            n4 += 8;
        }
        n4 = 1;
        while (n4 <= n3) {
            n2 = chessBoard[n - n4];
            if (n2 != 0) {
                if (n2 <= 0) break;
                ChessEngine.e[ChessEngine.f++] = n + (n - n4 << 8) + 65536;
                break;
            }
            ++n4;
        }
        n4 = 7 - n3;
        n2 = 1;
        while (n2 <= n4) {
            byte by = chessBoard[n + n2];
            if (by != 0) {
                if (by <= 0) break;
                ChessEngine.e[ChessEngine.f++] = n + (n + n2 << 8) + 65536;
                return;
            }
            ++n2;
        }
    }

    private static void f(int n) {
        int n2;
        int n3 = n & 7;
        int n4 = n - 8;
        while (n4 >= 0) {
            n2 = chessBoard[n4];
            if (n2 != 0) {
                if (n2 >= 0) break;
                ChessEngine.e[ChessEngine.f++] = n + (n4 << 8) + 65536;
                break;
            }
            n4 -= 8;
        }
        n4 = n + 8;
        while (n4 < 64) {
            n2 = chessBoard[n4];
            if (n2 != 0) {
                if (n2 >= 0) break;
                ChessEngine.e[ChessEngine.f++] = n + (n4 << 8) + 65536;
                break;
            }
            n4 += 8;
        }
        n4 = 1;
        while (n4 <= n3) {
            n2 = chessBoard[n - n4];
            if (n2 != 0) {
                if (n2 >= 0) break;
                ChessEngine.e[ChessEngine.f++] = n + (n - n4 << 8) + 65536;
                break;
            }
            ++n4;
        }
        n4 = 7 - n3;
        n2 = 1;
        while (n2 <= n4) {
            byte by = chessBoard[n + n2];
            if (by != 0) {
                if (by >= 0) break;
                ChessEngine.e[ChessEngine.f++] = n + (n + n2 << 8) + 65536;
                return;
            }
            ++n2;
        }
    }

    private static void g(int n) {
        byte by;
        int n2 = n & 7;
        int n3 = n2;
        int n4 = n >> 3;
        if (n3 > n4) {
            n3 = n4;
        }
        int n5 = n;
        int n6 = 1;
        while (n6 <= n3) {
            by = chessBoard[n5 -= 9];
            if (by != 0) {
                if (by <= 0) break;
                ChessEngine.e[ChessEngine.f++] = n + (n5 << 8) + 65536;
                break;
            }
            ++n6;
        }
        if ((n3 = 7 - n2) > n4) {
            n3 = n4;
        }
        n5 = n;
        n6 = 1;
        while (n6 <= n3) {
            by = chessBoard[n5 -= 7];
            if (by != 0) {
                if (by <= 0) break;
                ChessEngine.e[ChessEngine.f++] = n + (n5 << 8) + 65536;
                break;
            }
            ++n6;
        }
        if ((n3 = n2) > 7 - n4) {
            n3 = 7 - n4;
        }
        n5 = n;
        n6 = 1;
        while (n6 <= n3) {
            by = chessBoard[n5 += 7];
            if (by != 0) {
                if (by <= 0) break;
                ChessEngine.e[ChessEngine.f++] = n + (n5 << 8) + 65536;
                break;
            }
            ++n6;
        }
        if ((n3 = n2) < n4) {
            n3 = n4;
        }
        n3 = 7 - n3;
        n5 = n;
        n6 = 1;
        while (n6 <= n3) {
            by = chessBoard[n5 += 9];
            if (by != 0) {
                if (by <= 0) break;
                ChessEngine.e[ChessEngine.f++] = n + (n5 << 8) + 65536;
                return;
            }
            ++n6;
        }
    }

    private static void h(int n) {
        byte by;
        int n2 = n & 7;
        int n3 = n2;
        int n4 = n >> 3;
        if (n3 > n4) {
            n3 = n4;
        }
        int n5 = n;
        int n6 = 1;
        while (n6 <= n3) {
            by = chessBoard[n5 -= 9];
            if (by != 0) {
                if (by >= 0) break;
                ChessEngine.e[ChessEngine.f++] = n + (n5 << 8) + 65536;
                break;
            }
            ++n6;
        }
        if ((n3 = 7 - n2) > n4) {
            n3 = n4;
        }
        n5 = n;
        n6 = 1;
        while (n6 <= n3) {
            by = chessBoard[n5 -= 7];
            if (by != 0) {
                if (by >= 0) break;
                ChessEngine.e[ChessEngine.f++] = n + (n5 << 8) + 65536;
                break;
            }
            ++n6;
        }
        if ((n3 = n2) > 7 - n4) {
            n3 = 7 - n4;
        }
        n5 = n;
        n6 = 1;
        while (n6 <= n3) {
            by = chessBoard[n5 += 7];
            if (by != 0) {
                if (by >= 0) break;
                ChessEngine.e[ChessEngine.f++] = n + (n5 << 8) + 65536;
                break;
            }
            ++n6;
        }
        if ((n3 = n2) < n4) {
            n3 = n4;
        }
        n3 = 7 - n3;
        n5 = n;
        n6 = 1;
        while (n6 <= n3) {
            by = chessBoard[n5 += 9];
            if (by != 0) {
                if (by >= 0) break;
                ChessEngine.e[ChessEngine.f++] = n + (n5 << 8) + 65536;
                return;
            }
            ++n6;
        }
    }

    private static void i(int n) {
        ChessEngine.a(n, 1, 1);
        ChessEngine.a(n, -1, 1);
        ChessEngine.a(n, -1, -1);
        ChessEngine.a(n, 1, -1);
    }

    private static void j(int n) {
        ChessEngine.a(n, 1, 0);
        ChessEngine.a(n, -1, 0);
        ChessEngine.a(n, 0, 1);
        ChessEngine.a(n, 0, -1);
    }

    private static void k(int n) {
        ChessEngine.a(n, 1, 0);
        ChessEngine.a(n, -1, 0);
        ChessEngine.a(n, 0, 1);
        ChessEngine.a(n, 0, -1);
        ChessEngine.a(n, 1, 1);
        ChessEngine.a(n, -1, 1);
        ChessEngine.a(n, -1, -1);
        ChessEngine.a(n, 1, -1);
    }

    private static final void checkBlackPawnAttackForCastleRight() {
        // Checking if white castling right is possile with respect to the black pawn attack
        if (F != 0 && chessBoard[5] == 0 && chessBoard[6] == 0 && chessBoard[11] != -1 && chessBoard[12] != -1 && chessBoard[13] != -1 && chessBoard[14] != -1 && chessBoard[15] != -1) {
            ChessEngine.e[ChessEngine.f++] = 263684;
        }
    }

    private static void checkBlackPawnAttackForCastleLeft() {
        if (F != 0 && chessBoard[1] == 0 && chessBoard[2] == 0 && chessBoard[3] == 0 && chessBoard[8] != -1 && chessBoard[9] != -1 && chessBoard[10] != -1 && chessBoard[11] != -1 && chessBoard[12] != -1) {
            ChessEngine.e[ChessEngine.f++] = 524804;
        }
    }

    private static final void checkWhitePawnAttackForCastleRight() {
        if (F != 0 && chessBoard[61] == 0 && chessBoard[62] == 0 && chessBoard[51] != 1 && chessBoard[52] != 1 && chessBoard[53] != 1 && chessBoard[54] != 1 && chessBoard[55] != 1) {
            ChessEngine.e[ChessEngine.f++] = 278076;
        }
    }

    private static void checkWhitePawnAttackForCastleLeft() {
        if (F != 0 && chessBoard[57] == 0 && chessBoard[58] == 0 && chessBoard[59] == 0 && chessBoard[48] != 1 && chessBoard[49] != 1 && chessBoard[50] != 1 && chessBoard[51] != 1 && chessBoard[52] != 1) {
            ChessEngine.e[ChessEngine.f++] = 539196;
        }
    }

    private static void l(int n) {
        int n2 = n & 7;
        int n3 = n >> 3;
        if (n2 > 0) {
            if (chessBoard[n - 1] == 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 1 << 8);
            }
            if (n3 > 0 && chessBoard[n - 9] == 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 9 << 8);
            }
            if (n3 < 7 && chessBoard[n + 7] == 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 7 << 8);
            }
        }
        if (n3 > 0 && chessBoard[n - 8] == 0) {
            ChessEngine.e[ChessEngine.f++] = n + (n - 8 << 8);
        }
        if (n3 < 7 && chessBoard[n + 8] == 0) {
            ChessEngine.e[ChessEngine.f++] = n + (n + 8 << 8);
        }
        if (n2 < 7) {
            if (chessBoard[n + 1] == 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 1 << 8);
            }
            if (n3 > 0 && chessBoard[n - 7] == 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 7 << 8);
            }
            if (n3 < 7 && chessBoard[n + 9] == 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 9 << 8);
            }
        }
    }

    private static void m(int n) {
        int n2 = n & 7;
        int n3 = n >> 3;
        if (n2 > 0) {
            if (chessBoard[n - 1] > 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 1 << 8) + 65536;
            }
            if (n3 > 0 && chessBoard[n - 9] > 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 9 << 8) + 65536;
            }
            if (n3 < 7 && chessBoard[n + 7] > 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 7 << 8) + 65536;
            }
        }
        if (n3 > 0 && chessBoard[n - 8] > 0) {
            ChessEngine.e[ChessEngine.f++] = n + (n - 8 << 8) + 65536;
        }
        if (n3 < 7 && chessBoard[n + 8] > 0) {
            ChessEngine.e[ChessEngine.f++] = n + (n + 8 << 8) + 65536;
        }
        if (n2 < 7) {
            if (chessBoard[n + 1] > 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 1 << 8) + 65536;
            }
            if (n3 > 0 && chessBoard[n - 7] > 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 7 << 8) + 65536;
            }
            if (n3 < 7 && chessBoard[n + 9] > 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 9 << 8) + 65536;
            }
        }
    }

    private static void n(int n) {
        int n2 = n & 7;
        int n3 = n >> 3;
        if (n2 > 0) {
            if (chessBoard[n - 1] < 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 1 << 8) + 65536;
            }
            if (n3 > 0 && chessBoard[n - 9] < 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 9 << 8) + 65536;
            }
            if (n3 < 7 && chessBoard[n + 7] < 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 7 << 8) + 65536;
            }
        }
        if (n3 > 0 && chessBoard[n - 8] < 0) {
            ChessEngine.e[ChessEngine.f++] = n + (n - 8 << 8) + 65536;
        }
        if (n3 < 7 && chessBoard[n + 8] < 0) {
            ChessEngine.e[ChessEngine.f++] = n + (n + 8 << 8) + 65536;
        }
        if (n2 < 7) {
            if (chessBoard[n + 1] < 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 1 << 8) + 65536;
            }
            if (n3 > 0 && chessBoard[n - 7] < 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 7 << 8) + 65536;
            }
            if (n3 < 7 && chessBoard[n + 9] < 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 9 << 8) + 65536;
            }
        }
    }

    private static void o(int n) {
        int n2 = n & 7;
        int n3 = n >> 3;
        if (n2 < 6) {
            if (n3 < 7 && chessBoard[n + 10] == 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 10 << 8);
            }
            if (n3 > 0 && chessBoard[n - 6] == 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 6 << 8);
            }
        }
        if (n2 >= 2) {
            if (n3 < 7 && chessBoard[n + 6] == 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 6 << 8);
            }
            if (n3 > 0 && chessBoard[n - 10] == 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 10 << 8);
            }
        }
        if (n3 < 6) {
            if (n2 < 7 && chessBoard[n + 17] == 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 17 << 8);
            }
            if (n2 > 0 && chessBoard[n + 15] == 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 15 << 8);
            }
        }
        if (n3 >= 2) {
            if (n2 < 7 && chessBoard[n - 15] == 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 15 << 8);
            }
            if (n2 > 0 && chessBoard[n - 17] == 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 17 << 8);
            }
        }
    }

    private static void p(int n) {
        int n2 = n & 7;
        int n3 = n >> 3;
        if (n2 < 6) {
            if (n3 < 7 && chessBoard[n + 10] < 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 10 << 8) + 65536;
            }
            if (n3 > 0 && chessBoard[n - 6] < 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 6 << 8) + 65536;
            }
        }
        if (n2 >= 2) {
            if (n3 < 7 && chessBoard[n + 6] < 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 6 << 8) + 65536;
            }
            if (n3 > 0 && chessBoard[n - 10] < 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 10 << 8) + 65536;
            }
        }
        if (n3 < 6) {
            if (n2 < 7 && chessBoard[n + 17] < 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 17 << 8) + 65536;
            }
            if (n2 > 0 && chessBoard[n + 15] < 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 15 << 8) + 65536;
            }
        }
        if (n3 >= 2) {
            if (n2 < 7 && chessBoard[n - 15] < 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 15 << 8) + 65536;
            }
            if (n2 > 0 && chessBoard[n - 17] < 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 17 << 8) + 65536;
            }
        }
    }

    private static void q(int n) {
        int n2 = n & 7;
        int n3 = n >> 3;
        if (n2 < 6) {
            if (n3 < 7 && chessBoard[n + 10] > 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 10 << 8) + 65536;
            }
            if (n3 > 0 && chessBoard[n - 6] > 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 6 << 8) + 65536;
            }
        }
        if (n2 >= 2) {
            if (n3 < 7 && chessBoard[n + 6] > 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 6 << 8) + 65536;
            }
            if (n3 > 0 && chessBoard[n - 10] > 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 10 << 8) + 65536;
            }
        }
        if (n3 < 6) {
            if (n2 < 7 && chessBoard[n + 17] > 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 17 << 8) + 65536;
            }
            if (n2 > 0 && chessBoard[n + 15] > 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 15 << 8) + 65536;
            }
        }
        if (n3 >= 2) {
            if (n2 < 7 && chessBoard[n - 15] > 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 15 << 8) + 65536;
            }
            if (n2 > 0 && chessBoard[n - 17] > 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 17 << 8) + 65536;
            }
        }
    }

    private static void r(int n) {
        int n2;
        int n3 = n >> 3;
        int n4 = 1;
        int n5 = 6;
        if (l < 0) {
            n4 = 6;
            n5 = 1;
        }
        int n6 = n + 8 * l;
        if (n3 == n4 && chessBoard[n2 = n + 16 * l] == 0 && chessBoard[n6] == 0) {
            ChessEngine.e[ChessEngine.f++] = n + (n2 << 8);
        }
        if (n3 != n5 && chessBoard[n6] == 0) {
            ChessEngine.e[ChessEngine.f++] = n + (n6 << 8);
        }
    }

    private static void s(int n) {
        int n2 = n & 7;
        if (n < 48) {
            if (n2 > 0 && chessBoard[n + 7] < 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 7 << 8) + 65536;
            }
            if (n2 < 7 && chessBoard[n + 9] < 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n + 9 << 8) + 65536;
                return;
            }
        } else {
            int n3 = N;
            while (n3 <= 5) {
                int n4 = n + 7;
                if (n2 > 0 && chessBoard[n4] < 0) {
                    ChessEngine.e[ChessEngine.f++] = n + (n4 << 8) + 65536 + (n3 << 24);
                }
                if (chessBoard[++n4] == 0) {
                    ChessEngine.e[ChessEngine.f++] = n + (n4 << 8) + 0 + (n3 << 24);
                }
                if (n2 < 7 && chessBoard[++n4] < 0) {
                    ChessEngine.e[ChessEngine.f++] = n + (n4 << 8) + 65536 + (n3 << 24);
                }
                ++n3;
            }
        }
    }

    private static void t(int n) {
        int n2 = n & 7;
        if (n >= 16) {
            if (n2 > 0 && chessBoard[n - 9] > 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 9 << 8) + 65536;
            }
            if (n2 < 7 && chessBoard[n - 7] > 0) {
                ChessEngine.e[ChessEngine.f++] = n + (n - 7 << 8) + 65536;
                return;
            }
        } else {
            int n3 = -N;
            while (n3 >= -5) {
                int n4 = n - 9;
                if (n2 > 0 && chessBoard[n4] > 0) {
                    ChessEngine.e[ChessEngine.f++] = n + (n4 << 8) + 65536 + (n3 << 24);
                }
                if (chessBoard[++n4] == 0) {
                    ChessEngine.e[ChessEngine.f++] = n + (n4 << 8) + 0 + (n3 << 24);
                }
                if (n2 < 7 && chessBoard[++n4] > 0) {
                    ChessEngine.e[ChessEngine.f++] = n + (n4 << 8) + 65536 + (n3 << 24);
                }
                --n3;
            }
        }
    }

    public static final LittleEndianInt[] a() {
        return o;
    }

    private static void o() {
        int[] nArray = ChessEngine.p();
        o = new LittleEndianInt[nArray.length];
        int n = 0;
        int n2 = 0;
        while (n2 < 8) {
            int n3 = n2;
            while (n3 < nArray.length) {
                ChessEngine.o[n] = new LittleEndianInt(nArray[n3] & 0xFF, nArray[n3] >>> 8 & 0xFF, nArray[n3] >>> 16 & 0xFF, nArray[n3] >>> 24);
                n3 += 8;
                ++n;
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < 64) {
            ChessEngine.a[n2] = chessBoard[n2];
            ++n2;
        }
    }

    private static int[] p() {
        int n;
        int n2;
        F = 99;
        int[] nArray = ChessEngine.s();
        F = 0;
        boolean bl = false;
        int n3 = 0;
        int n4 = 0;
        while (n4 < nArray.length) {
            n2 = nArray[n4] >> 16 & 0xFF;
            if (n2 == 4 || n2 == 8) {
                bl = true;
            }
            ++n4;
        }
        n4 = 0;
        while (n4 < nArray.length) {
            ChessEngine.c(nArray[n4]);
            if (ChessEngine.b(-l)) {
                ++n3;
                nArray[n4] = -1;
            }
            ChessEngine.a(true);
            ++n4;
        }
        if (bl) {
            int n5;
            l = -l;
            int[] nArray2 = ChessEngine.s();
            l = -l;
            n2 = 0;
            n = 0;
            int n6 = 0;
            if (l < 0) {
                n6 = 56;
            }
            int n7 = n6 + 4;
            int n8 = n7 - 2;
            int n9 = n7 + 3;
            int n10 = 0;
            while (n10 < nArray2.length) {
                n5 = nArray2[n10] >> 8 & 0xFF;
                if (n5 >= n8 && n5 < n9) {
                    if (n5 >= n7) {
                        n2 = 1;
                    }
                    if (n5 <= n7) {
                        n = 1;
                    }
                }
                ++n10;
            }
            n10 = 0;
            while (n10 < nArray.length) {
                n5 = nArray[n10] >> 16 & 0xFF;
                if (n2 != 0 && n5 == 4 || n != 0 && n5 == 8) {
                    ++n3;
                    nArray[n10] = -1;
                }
                ++n10;
            }
        }
        if (n3 == 0) {
            return nArray;
        }
        int[] nArray3 = new int[nArray.length - n3];
        n2 = 0;
        n = 0;
        while (n < nArray.length) {
            if (nArray[n] != -1) {
                nArray3[n2++] = nArray[n];
            }
            ++n;
        }
        return nArray3;
    }

    private static void q() {
        int n;
        if (whiteKingSquareIndex < 0 || blackKingSquareIndex < 0) {
            return;
        }
        if (l > 0) {
            int n2;
            int n3 = 0;
            while (n3 < 64) {
                n2 = chessBoard[n3];
                if (n2 > 0) {
                    if (n2 == 1) {
                        ChessEngine.s(n3);
                    } else if (n2 == 4) {
                        ChessEngine.f(n3);
                    } else if (n2 == 3) {
                        ChessEngine.h(n3);
                    } else if (n2 == 2) {
                        ChessEngine.p(n3);
                    } else if (n2 == 5) {
                        ChessEngine.h(n3);
                        ChessEngine.f(n3);
                    }
                }
                ++n3;
            }
            if (ChessEngine.n != 10) {
                if (ChessEngine.n < 7 && chessBoard[33 + ChessEngine.n] == 1) {
                    ChessEngine.e[ChessEngine.f++] = 33 + ChessEngine.n + (40 + ChessEngine.n << 8) + 0x410000;
                }
                if (ChessEngine.n >= 1 && chessBoard[31 + ChessEngine.n] == 1) {
                    ChessEngine.e[ChessEngine.f++] = 31 + ChessEngine.n + (40 + ChessEngine.n << 8) + 0x410000;
                }
            }
            ChessEngine.n(whiteKingSquareIndex);
            n3 = 0;
            while (n3 < f) {
                n2 = e[n3];
                int n4 = n2 >> 8 & 0xFF;
                int n5 = n2 & 0xFF;
                int n6 = (chessBoard[n4] << 4) + chessBoard[n5];
                int n7 = n3 + 1;
                while (n7 < f) {
                    int n8 = e[n7];
                    int n9 = n8 >> 8 & 0xFF;
                    int n10 = n8 & 0xFF;
                    int n11 = (chessBoard[n9] << 4) + chessBoard[n10];
                    if (n11 < n6) {
                        ChessEngine.e[n7] = n2;
                        ChessEngine.e[n3] = n8;
                        n2 = n8;
                        n6 = n11;
                    }
                    ++n7;
                }
                ++n3;
            }
            return;
        }
        int n12 = 63;
        while (n12 >= 0) {
            n = chessBoard[n12];
            if (n < 0) {
                if (n == -1) {
                    ChessEngine.t(n12);
                } else if (n == -4) {
                    ChessEngine.e(n12);
                } else if (n == -3) {
                    ChessEngine.g(n12);
                } else if (n == -2) {
                    ChessEngine.q(n12);
                } else if (n == -5) {
                    ChessEngine.g(n12);
                    ChessEngine.e(n12);
                }
            }
            --n12;
        }
        if (ChessEngine.n != 10) {
            if (ChessEngine.n < 7 && chessBoard[25 + ChessEngine.n] == -1) {
                ChessEngine.e[ChessEngine.f++] = 25 + ChessEngine.n + (16 + ChessEngine.n << 8) + 0x410000;
            }
            if (ChessEngine.n >= 1 && chessBoard[23 + ChessEngine.n] == -1) {
                ChessEngine.e[ChessEngine.f++] = 23 + ChessEngine.n + (16 + ChessEngine.n << 8) + 0x410000;
            }
        }
        ChessEngine.m(blackKingSquareIndex);
        n12 = 0;
        while (n12 < f) {
            n = e[n12];
            int n13 = n >> 8 & 0xFF;
            int n14 = n & 0xFF;
            int n15 = (chessBoard[n13] << 4) + chessBoard[n14];
            int n16 = n12 + 1;
            while (n16 < f) {
                int n17 = e[n16];
                int n18 = n17 >> 8 & 0xFF;
                int n19 = n17 & 0xFF;
                int n20 = (chessBoard[n18] << 4) + chessBoard[n19];
                if (n20 > n15) {
                    ChessEngine.e[n16] = n;
                    ChessEngine.e[n12] = n17;
                    n = n17;
                    n15 = n20;
                }
                ++n16;
            }
            ++n12;
        }
    }

    private static int[] r() {
        if (whiteKingSquareIndex < 0 || blackKingSquareIndex < 0) {
            return Q;
        }
        f = 0;
        ChessEngine.q();
        int[] nArray = new int[f];
        int n = 0;
        while (n < f) {
            nArray[n] = e[n];
            ++n;
        }
        return nArray;
    }

    private static int[] s() {
        if (whiteKingSquareIndex < 0 || blackKingSquareIndex < 0) {
            return Q;
        }
        f = 0;
        ChessEngine.q();
        ChessEngine.t();
        int[] nArray = new int[f];
        int n = 0;
        while (n < f) {
            nArray[n] = e[n];
            ++n;
        }
        return nArray;
    }

    private static void t() {
        if (l < 0) {
            if ((castlingStatusMask & 4) != 0) {
                ChessEngine.checkWhitePawnAttackForCastleRight();
            }
            if ((castlingStatusMask & 8) != 0) {
                ChessEngine.checkWhitePawnAttackForCastleLeft();
            }
            int n = 0;
            while (n < 64) {
                byte by = chessBoard[n];
                if (by < 0) {
                    if (by == -1) {
                        ChessEngine.r(n);
                    } else if (by == -4) {
                        ChessEngine.j(n);
                    } else if (by == -3) {
                        ChessEngine.i(n);
                    } else if (by == -2) {
                        ChessEngine.o(n);
                    } else if (by == -6) {
                        ChessEngine.l(n);
                    } else if (by == -5) {
                        ChessEngine.k(n);
                    }
                }
                ++n;
            }
            return;
        }
        if ((castlingStatusMask & 1) != 0) {
            ChessEngine.checkBlackPawnAttackForCastleRight();
        }
        if ((castlingStatusMask & 2) != 0) {
            ChessEngine.checkBlackPawnAttackForCastleLeft();
        }
        int n = 63;
        while (n >= 0) {
            byte by = chessBoard[n];
            if (by > 0) {
                if (by == 1) {
                    ChessEngine.r(n);
                } else if (by == 6) {
                    ChessEngine.l(n);
                } else if (by == 5) {
                    ChessEngine.k(n);
                } else if (by == 4) {
                    ChessEngine.j(n);
                } else if (by == 3) {
                    ChessEngine.i(n);
                } else if (by == 2) {
                    ChessEngine.o(n);
                }
            }
            --n;
        }
    }

    public static final boolean b(int n) {
        byte by;
        int n2 = f;
        if (n > 0) {
            byte by2;
            int n3 = whiteKingSquareIndex;
            int n4 = n3 & 7;
            if (n3 < 56) {
                if (n4 > 0 && chessBoard[n3 + 7] == -1) {
                    return true;
                }
                if (n4 < 7 && chessBoard[n3 + 9] == -1) {
                    return true;
                }
            }
            f = n2;
            ChessEngine.p(n3);
            int n5 = n2;
            while (n5 < f) {
                if (chessBoard[e[n5] >> 8 & 0xFF] == -2) {
                    f = n2;
                    return true;
                }
                ++n5;
            }
            f = n2;
            ChessEngine.f(n3);
            n5 = n2;
            while (n5 < f) {
                by2 = chessBoard[e[n5] >> 8 & 0xFF];
                if (by2 == -4 || by2 == -5) {
                    f = n2;
                    return true;
                }
                ++n5;
            }
            f = n2;
            ChessEngine.h(n3);
            n5 = n2;
            while (n5 < f) {
                by2 = chessBoard[e[n5] >> 8 & 0xFF];
                if (by2 == -3 || by2 == -5) {
                    f = n2;
                    return true;
                }
                ++n5;
            }
            f = n2;
            ChessEngine.n(n3);
            n5 = n2;
            while (n5 < f) {
                by2 = chessBoard[e[n5] >> 8 & 0xFF];
                if (by2 == -6) {
                    f = n2;
                    return true;
                }
                ++n5;
            }
            f = n2;
            return false;
        }
        int n6 = blackKingSquareIndex;
        int n7 = n6 & 7;
        if (n6 >= 8) {
            if (n7 > 0 && chessBoard[n6 - 9] == 1) {
                return true;
            }
            if (n7 < 7 && chessBoard[n6 - 7] == 1) {
                return true;
            }
        }
        f = n2;
        ChessEngine.q(n6);
        int n8 = n2;
        while (n8 < f) {
            if (chessBoard[e[n8] >> 8 & 0xFF] == 2) {
                f = n2;
                return true;
            }
            ++n8;
        }
        f = n2;
        ChessEngine.e(n6);
        n8 = n2;
        while (n8 < f) {
            by = chessBoard[e[n8] >> 8 & 0xFF];
            if (by == 4 || by == 5) {
                f = n2;
                return true;
            }
            ++n8;
        }
        f = n2;
        ChessEngine.g(n6);
        n8 = n2;
        while (n8 < f) {
            by = chessBoard[e[n8] >> 8 & 0xFF];
            if (by == 3 || by == 5) {
                f = n2;
                return true;
            }
            ++n8;
        }
        f = n2;
        ChessEngine.m(n6);
        n8 = n2;
        while (n8 < f) {
            by = chessBoard[e[n8] >> 8 & 0xFF];
            if (by == 6) {
                f = n2;
                return true;
            }
            ++n8;
        }
        f = n2;
        return false;
    }

    public static final boolean a(LittleEndianInt[] iArray) {
        if (ChessEngine.b() || k >= 100 || ChessEngine.g() >= 3) {
            return true;
        }
        return iArray.length == 0;
    }

    public static final boolean b() {
        return H == 0 && I == 0 && g < 400 && h < 400;
    }

    public static final int b(LittleEndianInt[] iArray) {
        if (whiteKingSquareIndex < 0) {
            return -1;
        }
        if (blackKingSquareIndex < 0) {
            return 1;
        }
        if (ChessEngine.b(l) && iArray.length == 0) {
            return -l;
        }
        if (ChessEngine.g() >= 3 || k < 100) {
            // empty if block
        }
        return 0;
    }

    public final void c() {
        d = true;
        j = false;
        ah = true;
        ag = false;
        if (ai == null) {
            ai = new Thread(this);
            ai.start();
        }
    }

    private void u() {
        int n;
        Object object;
        Runtime.getRuntime().gc();
        N = 5;
        this.at = -1;
        this.as = -1;
        int[] nArray = ChessEngine.p();
        if (nArray.length == 1) {
            this.as = nArray[0];
        }
        int n2 = 0;
        this.P = null;
        if (U > 0 && this.as == -1 && ab != null && (object = ChessEngine.d(U - 1)) != null) {
            n = 0;
            while (n < ab.length) {
                if (this.ac[n] != null && ab[n] == ((LittleEndianInt)object).a()) {
                    this.P = this.ac[n];
                    n2 = this.ad[n];
                }
                ++n;
            }
        }
        if (R >= 511 && i.nextInt() % 10 < 4 && this.as == -1 || R >= 1024 && this.as == -1) {
            // int[] nArray2 = ChessEngine.p();
            // object = nArray2;
            // if (nArray2.length > 0) {
            //     n = (i.nextInt() >>> 8) % ((Object)object).length;
            //     this.as = (int)object[n];
            // }
        }
        if (this.as == -1) {
            if (this.P != null) {
                this.at = this.as = this.P[0];
            }
            // boolean bl = false;
            n = n2 + 1;
            while (n <= T) {
                Runtime.getRuntime().gc();
                if (n == n2 + 1 && this.as == -1) {
                    this.aj = false;
                }
                this.c(-100000000, 100000000, n);
                if (!j || !this.aj) {
                    this.aj = true;
                    new LittleEndianInt(this.at & 0xFF, this.at >>> 8 & 0xFF, this.at >>> 16 & 0xFF, this.at >>> 24);
                    this.as = this.at;
                    this.P = this.O;
                }
                if (++this.u > 20L) {
                    this.u = 0L;
                    j = true;
                }
                if (j) break;
                ++n;
            }
        }
        if (this.as != -1) {
            ChessEngine.c(this.as);
        }
        ab = null;
        N = 2;
        ChessEngine.o();
        Runtime.getRuntime().gc();
    }

    public static final synchronized void d() {
        try {
            if (ai != null) {
                ag = false;
                ah = false;
                j = true;
                while (af || d) {
                    Thread.sleep(500L);
                }
                j = false;
                return;
            }
        }
        catch (Throwable throwable) {}
    }

    public static final int e() {
        return l;
    }

    public final synchronized void run() {
        try {
            block2: while (true) {
                if (!j && ah) {
                    ah = false;
                    this.u();
                    c = new LittleEndianInt(this.as & 0xFF, this.as >>> 8 & 0xFF, this.as >>> 16 & 0xFF, this.as >>> 24);
                }
                while (j || !ah && !ag) {
                    ChessR.a();
                    Thread.sleep(400L);
                }
                if (!j && !ah && ag) {
                    ag = false;
                    af = true;
                    this.v();
                    af = false;
                    j = false;
                }
                while (true) {
                    if (!j && (ah || ag)) continue block2;
                    Thread.sleep(400L);
                }
                // break;
            }
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private void v() {
        int n;
        ab = ChessEngine.p();
        this.ac = new int[ab.length][];
        if (this.ad == null || this.ad.length < ab.length) {
            this.ad = new int[ab.length + 32];
            this.ae = new int[ab.length + 32];
        } else {
            n = 0;
            while (n < ab.length) {
                this.ad[n] = 0;
                this.ae[n] = 0;
                ++n;
            }
        }
        n = 0;
        int n2 = 0;
        while (!j) {
            int n3;
            int n4;
            int n5 = 0;
            while (n5 < ab.length) {
                n4 = this.ae[n5];
                n3 = n2 - this.ad[n5];
                if (n2 == 0 || n - n4 < n3 * 35) {
                    if (this.ac[n5] != null) {
                        this.P = this.ac[n5];
                    }
                    int n6 = this.ad[n5] + 1;
                    ChessEngine.c(ab[n5]);
                    this.at = -1;
                    int n7 = -this.c(-10000000, 10000000, n6);
                    ChessEngine.a(true);
                    if (!j) {
                        this.ae[n5] = n7;
                        this.ad[n5] = n6;
                        this.ac[n5] = this.O;
                    }
                }
                ++n5;
            }
            n5 = 0;
            while (n5 < ab.length) {
                n4 = n5 + 1;
                while (n4 < ab.length) {
                    if (this.ae[n5] < this.ae[n4]) {
                        n3 = this.ae[n5];
                        this.ae[n5] = this.ae[n4];
                        this.ae[n4] = n3;
                        n3 = ab[n5];
                        ChessEngine.ab[n5] = ab[n4];
                        ChessEngine.ab[n4] = n3;
                        n3 = this.ad[n5];
                        this.ad[n5] = this.ad[n4];
                        this.ad[n4] = n3;
                        int[] nArray = this.ac[n5];
                        this.ac[n5] = this.ac[n4];
                        this.ac[n4] = nArray;
                    }
                    ++n4;
                }
                ++n5;
            }
            if (ab.length > 0) {
                new LittleEndianInt(ab[0] & 0xFF, ab[0] >>> 8 & 0xFF, ab[0] >>> 16 & 0xFF, ab[0] >>> 24);
                n = this.ae[0];
            }
            ++n2;
        }
        return;
    }

    public static final int f() {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        if (whiteKingSquareIndex < 0) {
            return -100000 + U;
        }
        if (blackKingSquareIndex < 0) {
            return 100000 - U;
        }
        int n6 = g + H;
        int n7 = h + I;
        int n8 = g;
        int n9 = h;
        int n10 = n6 - n7;
        int n11 = ChessEngine.C();
        n10 += n11;
        n10 += l << 3;
        if (G > 2000) {
            n5 = 0;
            while (n5 < 8) {
                if (B[n5] == -1) {
                    if (chessBoard[n5] == 4) {
                        n10 += 8;
                    }
                    if (chessBoard[n5 + 8] == 4) {
                        n10 += 9;
                    }
                }
                if (C[n5] == -1) {
                    if (chessBoard[56 + n5] == -4) {
                        n10 -= 8;
                    }
                    if (chessBoard[48 + n5] == -4) {
                        n10 -= 9;
                    }
                }
                ++n5;
            }
        }
        if (((n5 = whiteKingSquareIndex) & 7) == 0) {
            ++n5;
        } else if ((n5 & 7) == 7) {
            --n5;
        }
        int n12 = blackKingSquareIndex;
        if ((n12 & 7) == 0) {
            ++n12;
        } else if ((n12 & 7) == 7) {
            --n12;
        }
        int n13 = 7;
        while (n13 < 10) {
            if (n5 < 32) {
                if (chessBoard[n5 + n13] == 1) {
                    n10 += h >> 8;
                }
                if (chessBoard[n5 + n13 + 8] == 1) {
                    n10 += h >> 9;
                }
            }
            if (n12 >= 32) {
                if (chessBoard[n12 - n13] == -1) {
                    n10 -= g >> 8;
                }
                if (chessBoard[n12 - n13 - 8] == -1) {
                    n10 -= g >> 9;
                }
            }
            ++n13;
        }
        if (n8 > 800) {
            n10 += (n8 - 800) * (7 - (blackKingSquareIndex >> 3)) >> 8;
        }
        if (n9 > 800) {
            n10 -= (n9 - 800) * (whiteKingSquareIndex >> 3) >> 8;
        }
        if (aw != 0) {
            n13 = blackKingSquareIndex;
            if (aw == 1) {
                n13 = whiteKingSquareIndex;
            }
            n10 -= aw * ChessEngine.b(whiteKingSquareIndex, blackKingSquareIndex) << 3;
            n4 = (blackKingSquareIndex & 7) - (whiteKingSquareIndex & 7);
            n3 = (blackKingSquareIndex >> 3) - (whiteKingSquareIndex >> 3);
            if (n4 < 0) {
                n4 = -n4;
            }
            if (n3 < 0) {
                n3 = -n3;
            }
            if ((n2 = blackKingSquareIndex - whiteKingSquareIndex) < 0) {
                n2 = -n2;
            }
            if (l == aw) {
                if (n4 == 2 && n3 == 1 || n4 == 1 && n3 == 2) {
                    n10 -= aw << 4;
                }
            } else {
                n = n2 != 16 && (n3 != 2 || n4 != 2) ? 0 : 1;
                if (n != 0) {
                    n10 -= aw << 4;
                }
            }
            if (n13 >= 0) {
                n10 -= aw * (av[n13] - 10) << 3;
            }
            n10 += ChessEngine.u(-aw);
        }
        if (G < 1200) {
            n10 -= av[whiteKingSquareIndex] - 10;
            n10 += av[blackKingSquareIndex] - 10;
        }
        if ((n13 = 330 - (n6 + n7 + 64 >> 7)) < 200) {
            n13 = 200;
        }
        if (k > 92) {
            n13 = k > 100 ? 0 : n13 * (100 - k) + 4 >> 3;
        }
        n10 *= n13;
        n10 = n10 + 128 >> 8;
        if (G > 2500) {
            int n14;
            int n15;
            if (chessBoard[11] == 1 && chessBoard[19] != 0) {
                n10 -= 10;
            }
            if (chessBoard[12] == 1 && chessBoard[20] != 0) {
                n10 -= 10;
            }
            if (chessBoard[51] == -1 && chessBoard[43] != 0) {
                n10 += 10;
            }
            if (chessBoard[52] == -1 && chessBoard[44] != 0) {
                n10 += 10;
            }
            n10 += ak;
            n4 = 0;
            n3 = 0;
            if ((castlingStatusMask & 1) != 0) {
                n4 += 20;
                if (chessBoard[5] == 0) {
                    n4 += 6;
                }
                if (chessBoard[6] == 0) {
                    n4 += 6;
                }
            }
            if ((castlingStatusMask & 1) != 0 || whiteKingSquareIndex == 6 || whiteKingSquareIndex == 7) {
                if (chessBoard[13] == 1) {
                    n4 += 8;
                }
                if (chessBoard[14] == 1 || chessBoard[14] == 3 && chessBoard[22] == 1) {
                    n4 += 8;
                }
                if (chessBoard[15] == 1 || chessBoard[14] == 1 && chessBoard[23] == 1) {
                    n4 += 8;
                }
            }
            if ((castlingStatusMask & 2) != 0) {
                n3 += 10;
                if (chessBoard[1] == 0) {
                    n3 += 4;
                }
                if (chessBoard[2] == 0) {
                    n3 += 4;
                }
                if (chessBoard[3] == 0) {
                    n3 += 4;
                }
            }
            if ((castlingStatusMask & 2) != 0 || whiteKingSquareIndex < 4) {
                if (chessBoard[8] == 1 || chessBoard[16] == 1) {
                    n3 += 8;
                }
                if (chessBoard[9] == 1) {
                    n3 += 8;
                }
                if (chessBoard[10] == 1) {
                    n3 += 8;
                }
            }
            if ((n = n4 + (n3 >> 2)) > (n2 = n3 + (n4 >> 1))) {
                n2 = n;
            }
            n10 += n2;
            n2 = 0;
            n = 0;
            if ((castlingStatusMask & 4) != 0) {
                n2 += 20;
                if (chessBoard[61] == 0) {
                    n2 += 6;
                }
                if (chessBoard[62] == 0) {
                    n2 += 6;
                }
            }
            if ((castlingStatusMask & 4) != 0 || blackKingSquareIndex >= 62) {
                if (chessBoard[53] == -1) {
                    n2 += 8;
                }
                if (chessBoard[54] == -1 || chessBoard[54] == -3 && chessBoard[46] == -1) {
                    n2 += 8;
                }
                if (chessBoard[55] == -1 || chessBoard[54] == -1 && chessBoard[47] == -1) {
                    n2 += 8;
                }
            }
            if ((castlingStatusMask & 8) != 0) {
                n += 12;
                if (chessBoard[57] == 0) {
                    n += 4;
                }
                if (chessBoard[58] == 0) {
                    n += 4;
                }
                if (chessBoard[59] == 0) {
                    n += 4;
                }
            }
            if ((castlingStatusMask & 8) != 0 || blackKingSquareIndex < 60 && blackKingSquareIndex >= 56) {
                if (chessBoard[48] == -1 || chessBoard[40] == -1) {
                    n += 8;
                }
                if (chessBoard[49] == -1) {
                    n += 8;
                }
                if (chessBoard[50] == -1) {
                    n += 8;
                }
            }
            if ((n15 = n2 + (n >> 2)) > (n14 = n + (n2 >> 1))) {
                n14 = n15;
            }
            n10 -= n14;
        }
        if (U >= 10) {
            n4 = Y[U - 1 >>> 8][U - 1 & 0xFF];
            n3 = 0;
            while (n3 < 8) {
                n2 = Y[U - 3 - n3 >>> 8][U - 3 - n3 & 0xFF];
                if ((n2 >> 8 & 0xFF) == (n4 & 0xFF) && (n2 & 0xFF) == (n4 >> 8 & 0xFF)) {
                    n10 += (15 - n3) * l;
                }
                n3 += 2;
            }
        }
        return n10 += S;
    }

    private static int u(int n) {
        int n2 = 0;
        if (n > 0) {
            int n3 = blackKingSquareIndex;
            int n4 = 63;
            while (n4 >= 0) {
                byte by = chessBoard[n4];
                if (by > 0) {
                    if (by == 4) {
                        int n5 = (whiteKingSquareIndex & 7) - (n4 & 7);
                        int n6 = (whiteKingSquareIndex >> 3) - (n4 >> 3);
                        if (n5 < 0) {
                            n5 = -n5;
                        }
                        if (n6 < 0) {
                            n6 = -n6;
                        }
                        if (n5 < n6) {
                            n6 = n5;
                        }
                        if (n6 > 3) {
                            n6 = 3;
                        }
                        n2 += n6 << 3;
                        n2 += ChessEngine.c(n4, n3) << 3;
                        if ((n4 + 8 & 0x3F) < 16) {
                            n2 += 9;
                        }
                        if ((n4 + 1 & 7) < 2) {
                            n2 += 9;
                        }
                    } else if (by == 2 || by == 3 || by == 6) {
                        n2 -= av[n4];
                    }
                }
                --n4;
            }
        } else {
            int n7 = whiteKingSquareIndex;
            int n8 = 63;
            while (n8 >= 0) {
                byte by = chessBoard[n8];
                if (by < 0) {
                    if (by == -4) {
                        int n9 = (blackKingSquareIndex & 7) - (n8 & 7);
                        int n10 = (blackKingSquareIndex >> 3) - (n8 >> 3);
                        if (n9 < 0) {
                            n9 = -n9;
                        }
                        if (n10 < 0) {
                            n10 = -n10;
                        }
                        if (n9 < n10) {
                            n10 = n9;
                        }
                        if (n10 > 3) {
                            n10 = 3;
                        }
                        n2 -= n10 << 3;
                        n2 -= ChessEngine.c(n8, n7) << 3;
                        if (ChessEngine.isRank1Rank8FileAFileB(n8)) {
                            n2 -= 9;
                        }
                    } else if (by == -2 || by == -3 || by == -6) {
                        n2 += av[n8];
                    }
                }
                --n8;
            }
        }
        return n2;
    }

    private static int b(int n, int n2) {
        int n3;
        int n4 = (n & 7) - (n2 & 7);
        int n5 = (n >> 3) - (n2 >> 3);
        if (n4 < 0) {
            n4 = -n4;
        }
        if (n5 < 0) {
            n5 = -n5;
        }
        if ((n3 = n4) > n5) {
            n3 = n5;
        }
        return 4 - n4 - n5 - n3;
    }

    private static int c(int n, int n2) {
        int n3;
        int n4 = (n & 7) - (n2 & 7);
        int n5 = (n >> 3) - (n2 >> 3);
        if (n4 < 0) {
            n4 = -n4;
        }
        if (n5 < 0) {
            n5 = -n5;
        }
        if ((n3 = n4) > n5) {
            n3 = n5;
        }
        return 4 - n3;
    }

    private void w() {
        int n = 63;
        while (n >= 0) {
            this.chessboardSus[n] = chessBoard[n];
            --n;
        }
        this.X = W;
        this.blackKingSquare = blackKingSquareIndex;
        this.whiteKingSquare = whiteKingSquareIndex;
        this.al = ak;
        this.castlingMask = castlingStatusMask;
        this.au = ChessEngine.n;
        this.J = H;
        this.K = I;
        this.L = g;
        this.M = h;
        this.am = k;
    }

    private void x() {
        int n = 63;
        while (n >= 0) {
            ChessEngine.chessBoard[n] = this.chessboardSus[n];
            --n;
        }
        W = this.X;
        blackKingSquareIndex = this.blackKingSquare;
        whiteKingSquareIndex = this.whiteKingSquare;
        ak = this.al;
        castlingStatusMask = this.castlingMask;
        ChessEngine.n = this.au;
        H = this.J;
        I = this.K;
        g = this.L;
        h = this.M;
        k = this.am;
    }

    private boolean y() {
        int n = 0;
        while (n < 64) {
            if ((this.chessboardSus[n] * l > 0 || chessBoard[n] * l > 0) && this.chessboardSus[n] != chessBoard[n]) {
                return false;
            }
            ++n;
        }
        return this.castlingMask == castlingStatusMask && this.au == ChessEngine.n;
    }

    public static int g() {
        return 1;
    }

    private int z() {
        if (U < 3) {
            return 1;
        }
        int n = U;
        this.w();
        int n2 = 1;
        int n3 = U - k - 1;
        if (n3 < 0) {
            n3 = 0;
        }
        ChessEngine.a(false);
        ChessEngine.a(false);
        ChessEngine.a(false);
        int n4 = U;
        while (n4 >= n3) {
            if (this.y()) {
                ++n2;
            }
            if (U > 1) {
                ChessEngine.a(false);
                ChessEngine.a(false);
            }
            n4 -= 2;
        }
        l = -l;
        this.x();
        U = n;
        return n2;
    }

    private int b(int n, int n2, int n3) {
        int n4 = ChessEngine.f() * l;
        if (n4 > n && (n = n4) >= n2) {
            return n;
        }
        int[] nArray = ChessEngine.r();
        if (nArray.length == 0) {
            return n;
        }
        int n5 = 0;
        while (n5 < nArray.length) {
            int n6 = nArray[n5];
            ChessEngine.c(n6);
            if (l > 0) {
                if (whiteKingSquareIndex < 0) {
                    if (this.v > U) {
                        this.v = U;
                    }
                    ChessEngine.a(true);
                    return 100000 - U;
                }
            } else if (blackKingSquareIndex < 0) {
                if (this.v > U) {
                    this.v = U;
                }
                ChessEngine.a(true);
                return 100000 - U;
            }
            int n7 = -this.b(-n2, -n, n3 - 1);
            ChessEngine.a(true);
            if (n < n7 && (n = n7) >= n2) break;
            ++n5;
        }
        if (j && this.aj) {
            return 0;
        }
        return n;
    }

    private int c(int n, int n2, int n3) {
        if (this.P == null) {
            this.P = Q;
        }
        aw = 0;
        if (g > h + 160 && h < 700) {
            aw = -1;
        } else if (h > g + 160 && g < 700) {
            aw = 1;
        }
        G = g + h;
        this.v = U + 99;
        V = U;
        if (G < 800) {
            ++n3;
        }
        if (G < 200) {
            n3 += 2;
        }
        return this.a(n, n2, n3, true);
    }

    @SuppressWarnings("null")
    private int a(int n, int n2, int n3, boolean bl) {
        int n4;
        int n5;
        int n6;
        int n7;
        int[] nArray = null;
        int n8 = 0;
        int[] nArray2 = null;
        int n9 = 0;
        this.O = null;
        if (j && this.aj) {
            return 0;
        }
        int n10 = -1;
        @SuppressWarnings("unused")
        int n11 = 0;
        boolean bl2 = false;
        int n12 = 0;
        if (n3 < 1) {
            n12 = this.b(n, n2, n3);
        } else {
            n11 = T == 1 ? this.z() : ChessEngine.g();
        }
        // boolean bl3 = bl2 = n11 >= 2;
        if (n3 <= 0) {
            if (bl2) {
                return 30;
            }
            return n12;
        }
        nArray2 = new int[48];
        int n13 = n3 - 1;
        if (n3 > 1 && whiteKingSquareIndex >= 0 && blackKingSquareIndex >= 0) {
            ChessEngine.C();
        }
        if ((nArray = (n7 = U - V) < 3 ? ChessEngine.p() : ChessEngine.s()).length == 0) {
            if (l > 0 && whiteKingSquareIndex < 0 || l < 0 && blackKingSquareIndex < 0) {
                if (this.v > U) {
                    this.v = U;
                }
                return -100000 + U;
            }
            if (ChessEngine.b(l)) {
                return -100000 + U;
            }
            return 0;
        }
        if (nArray.length == 1) {
            n13 = n3;
        }
        int n14 = 0;
        if (bl && n7 < this.P.length) {
            n6 = this.P[n7];
            n8 = nArray.length;
            n5 = 0;
            while (n5 < n8) {
                if (nArray[n5] == n6) {
                    n4 = n5 - 1;
                    while (n4 >= 0) {
                        nArray[n4 + 1] = nArray[n4];
                        --n4;
                    }
                    nArray[0] = n6;
                    break;
                }
                ++n5;
            }
        }
        n8 = nArray.length;
        n6 = 0;
        while (n6 < n8) {
            if (n >= n2) break;
            n5 = nArray[n6];
            if (U == V) {
                S = (U + n6) * w + n6 * x + U * y & R;
            }
            ChessEngine.c(n5);
            if (l > 0) {
                if (whiteKingSquareIndex < 0) {
                    if (this.v > U) {
                        this.v = U;
                    }
                    ChessEngine.a(true);
                    return 100000 - U;
                }
            } else if (blackKingSquareIndex < 0) {
                if (this.v > U) {
                    this.v = U;
                }
                ChessEngine.a(true);
                return 100000 - U;
            }
            n4 = this.v;
            this.v = U + 2;
            int n15 = n13;
            if (n7 < 2) {
                if (l > 0 && I < 300 && h < 700) {
                    if (chessBoard[n5 >> 8 & 0xFF] == 1) {
                        n15 = n3;
                    }
                } else if (l < 0 && H < 300 && g < 700 && chessBoard[n5 >> 8 & 0xFF] == -1) {
                    n15 = n3;
                }
                if ((n5 >> 16 & 0xFF) == 1) {
                    n15 = n3;
                }
            }
            if (n15 != n3 && n7 < 5 && ChessEngine.b(l)) {
                n15 = n3;
            }
            int n16 = -this.a(-n2, -n, n15, n6 == 0 && bl);
            if (this.v == U + 1) {
                ++n14;
            }
            this.v = n4;
            ChessEngine.a(true);
            if (j && this.aj) {
                return 0;
            }
            if (n16 > n) {
                n = n16;
                n10 = n5;
                nArray2[0] = n5;
                n9 = nArray2.length;
                int n17 = 1;
                while (n17 < n9) {
                    nArray2[n17] = this.O == null ? -1 : this.O[n17 - 1];
                    ++n17;
                }
            }
            ++n6;
        }
        if (n14 == nArray.length) {
            if (ChessEngine.b(l)) {
                return -100000 + U;
            }
            return 0;
        }
        this.at = n10;
        this.O = nArray2;
        if (U == V) {
            this.O[0] = this.at;
        }
        if (bl2) {
            return 30;
        }
        return n;
    }

    private static boolean isRank1Rank8FileAFileB(int squareIndex) {
        return squareIndex < 8 || squareIndex >= 56 || (squareIndex + 1 & 7) < 2;
    }

    public static void initializeTheBoard() {
        int squareIndex;
        w = i.nextInt() >>> 8 | 0x11;
        x = i.nextInt() >>> 8 | 0x104;
        y = i.nextInt() >>> 8 | 0x402;
        W = 30000;
        ChessEngine.d();
        ab = null;
        ChessEngine.n = 10;
        ak = 0;
        k = 0;
        U = 0;
        l = 1;
        if (!PlayStage.i) {
            squareIndex = 63;
            while (squareIndex >= 0) {
                ChessEngine.chessBoard[squareIndex] = 0;

                // (squareIndex & 7) can only count upto 0-7
                // so that it could never be more than 15 and less than 8
                // similarly for (squareIndex & 7) + 48
                // very clever way of doing things...
                ChessEngine.chessBoard[8 + (squareIndex & 7)] = 1;
                ChessEngine.chessBoard[48 + (squareIndex & 7)] = -1;
                --squareIndex;
            }
            ChessEngine.chessBoard[7] = 4;
            ChessEngine.chessBoard[0] = 4;
            ChessEngine.chessBoard[6] = 2;
            ChessEngine.chessBoard[1] = 2;
            ChessEngine.chessBoard[5] = 3;
            ChessEngine.chessBoard[2] = 3;
            ChessEngine.chessBoard[3] = 5;
            ChessEngine.chessBoard[4] = 6;
            ChessEngine.chessBoard[63] = -4;
            ChessEngine.chessBoard[56] = -4;
            ChessEngine.chessBoard[62] = -2;
            ChessEngine.chessBoard[57] = -2;
            ChessEngine.chessBoard[61] = -3;
            ChessEngine.chessBoard[58] = -3;
            ChessEngine.chessBoard[59] = -5;
            ChessEngine.chessBoard[60] = -6;
            castlingStatusMask = 15;
        }
        ChessEngine.setKingsSquareIndices();
        ChessEngine.A();
        ChessEngine.evaluateKingFileDistances();
        squareIndex = 0;
        while (squareIndex < 8) {
            ChessEngine.w(squareIndex);
            ++squareIndex;
        }
        ChessEngine.o();
    }

    private static void A() {
        H = 0;
        I = 0;
        g = 0;
        h = 0;
        int n = 0;
        while (n < 64) {
            byte by = chessBoard[n];
            if (by != 0) {
                if (by > 0) {
                    if (by == 1) {
                        H += p[n];
                    } else if (by == 2) {
                        g += t[n];
                    } else if (by == 3) {
                        g += r[n];
                    } else if (by == 4) {
                        g += 510;
                    } else if (by == 5) {
                        g += 960;
                    }
                } else if (by == -1) {
                    I += q[n];
                } else if (by == -2) {
                    h += t[n];
                } else if (by == -3) {
                    h += s[n];
                } else if (by == -4) {
                    h += 510;
                } else if (by == -5) {
                    h += 960;
                }
            }
            ++n;
        }
    }

    public static void i() {
        if (U == 0) {
            return;
        }
        ab = null;
        ChessEngine.a(true);
        ChessEngine.o();
    }

    private static void evaluateKingFileDistances() {
        int blackKingFile = blackKingSquareIndex & 7;

        if (blackKingFile < 2) {
            // AB File 
            blackKingFile = 2;
        }
        if (blackKingFile >= 6) {
            // GH File
            blackKingFile = 5;
        }

        int whiteKingFile;
        if ((whiteKingFile = whiteKingSquareIndex & 7) < 2) {
            // AB File
            whiteKingFile = 2;
        }
        if (whiteKingFile >= 6) {
            // GH File
            whiteKingFile = 5;
        }

        int file = 0;
        while (file < 8) {
            int blackKingFileDistance = file - blackKingFile;

            if (blackKingFileDistance < 0) {

                blackKingFileDistance = -blackKingFileDistance;
            }

            int whiteKingFileDistance;

            if ((whiteKingFileDistance = file - whiteKingFile) < 0) {

                whiteKingFileDistance = -whiteKingFileDistance;
            }

            ChessEngine.A[file] = (G - 700) * (whiteKingFileDistance - blackKingFileDistance) >> 10; // G is 

            ++file;
        }
    }

    private static void w(int n) {
        ChessEngine.B[n] = -1;
        ChessEngine.C[n] = -1;
        ChessEngine.D[n] = 8;
        ChessEngine.E[n] = 8;
        int n2 = n;
        while (n2 < 64) {
            byte by = chessBoard[n2];
            if (by != 0) {
                int n3;
                if (by == 1) {
                    n3 = n2 >> 3;
                    if (B[n] < n3) {
                        ChessEngine.B[n] = n3;
                    }
                    if (D[n] > n3) {
                        ChessEngine.D[n] = n3;
                    }
                } else if (by == -1) {
                    n3 = n2 >> 3;
                    if (C[n] < n3) {
                        ChessEngine.C[n] = n3;
                    }
                    if (E[n] > n3) {
                        ChessEngine.E[n] = n3;
                    }
                }
            }
            n2 += 8;
        }
    }

    private static int C() {
        if (W != 30000) {
            return W;
        }
        int n = 0;
        int n2 = 0;
        while (n2 < 7) {
            int n3;
            if (B[n2] < 0 && (n3 = B[n2] - B[n2 + 1]) >= -1 && n3 < 2) {
                n += 12;
            }
            if (C[n2] < 0 && (n3 = E[n2] - E[n2 + 1]) >= -1 && n3 < 2) {
                n -= 12;
            }
            if ((n3 = B[n2]) != -1) {
                if (n3 != D[n2]) {
                    n -= 25;
                }
                if (!(n2 != 0 && B[n2 - 1] != -1 || n2 != 7 && B[n2 + 1] != -1)) {
                    n -= 27;
                }
            }
            if ((n3 = E[n2]) != 8) {
                if (n3 != C[n2]) {
                    n += 25;
                }
                if (!(n2 != 0 && C[n2 - 1] != -1 || n2 != 7 && C[n2 + 1] != -1)) {
                    n += 27;
                }
            }
            ++n2;
        }
        if (V < 50) {
            if (chessBoard[11] == 1) {
                if (chessBoard[9] == 1) {
                    n -= 6;
                }
                n -= 10;
            }
            if (chessBoard[12] == 1) {
                n -= 10;
                if (chessBoard[14] == 1) {
                    n -= 6;
                }
            }
            if (chessBoard[51] == -1) {
                if (chessBoard[53] == -1) {
                    n += 6;
                }
                n += 10;
            }
            if (chessBoard[52] == -1) {
                if (chessBoard[49] == -1) {
                    n += 6;
                }
                n += 10;
            }
            if (chessBoard[34] == -1 && chessBoard[44] == -1) {
                n -= 10;
            }
        }
        W = n;
        return n;
    }

    public static void a(int n, int n2) {
        ChessEngine.chessBoard[n2] = (byte)n;
        ++U;
        ChessEngine.a[n2] = chessBoard[n2];
        ChessEngine.setKingsSquareIndices();
        ChessEngine.A();
        ChessEngine.evaluateKingFileDistances();
        int n3 = 0;
        while (n3 < 8) {
            ChessEngine.w(n3);
            ++n3;
        }
        ChessEngine.o();
        PlayStage.j();
        PlayStage.k();
    }

    public static void initializeTheChessEngine(byte[] byArray) {
        w = i.nextInt() >>> 8 | 0x11;
        x = i.nextInt() >>> 8 | 0x104;
        y = i.nextInt() >>> 8 | 0x402;
        W = 30000;
        ChessEngine.d();
        ab = null;
        n = 10;
        ak = 0;
        k = 0;
        U = 0;
        l = PlayStage.bk == 2 ? (l == 1 ? -1 : 1) : 1;
        int n = 0;
        n = 0;
        while (n < 64) {
            ChessEngine.chessBoard[n] = byArray[n];
            ++n;
        }
        castlingStatusMask = byArray[64];
        ChessEngine.setKingsSquareIndices();
        ChessEngine.A();
        ChessEngine.evaluateKingFileDistances();
        int n2 = 0;
        while (n2 < 8) {
            ChessEngine.w(n2);
            ++n2;
        }
        ChessEngine.o();
    }
}

