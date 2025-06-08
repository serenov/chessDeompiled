/*
 * Decompiled with CFR 0.152.
 */
public final class LittleEndianInt {
    public byte a;
    public byte b;
    public byte c;
    public byte d;

    public LittleEndianInt(int n, int n2, int n3, int n4) {
        this.a = (byte)n;
        this.b = (byte)n2;
        this.c = (byte)n3;
        this.d = (byte)n4;
    }

    public final int a() {
        return this.a + (this.b << 8) + (this.c << 16) + (this.d << 24);
    }
}

