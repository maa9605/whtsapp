package X;

import java.util.Arrays;

/* renamed from: X.1zy  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44981zy {
    public final long A00;
    public final C44971zx A01;
    public final byte[] A02;

    public String toString() {
        return "SyncdKeyData";
    }

    public C44981zy(byte[] bArr, long j, C44971zx c44971zx) {
        this.A02 = bArr;
        this.A00 = j;
        this.A01 = c44971zx;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44981zy) {
            C44981zy c44981zy = (C44981zy) obj;
            return this.A00 == c44981zy.A00 && Arrays.equals(this.A02, c44981zy.A02) && this.A01.equals(c44981zy.A01);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A02) + (Arrays.hashCode(new Object[]{Long.valueOf(this.A00), this.A01}) * 31);
    }
}
