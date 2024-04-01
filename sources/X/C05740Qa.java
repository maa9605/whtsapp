package X;

import java.util.Arrays;

/* renamed from: X.0Qa  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C05740Qa {
    public final int A00;
    public final byte[] A01;
    public final byte[] A02;

    public C05740Qa(int i, byte[] bArr, byte[] bArr2) {
        this.A00 = i;
        this.A02 = bArr;
        this.A01 = bArr2;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("GetCipherKeyResult [code=");
        A0P.append(this.A00);
        A0P.append(", key=");
        A0P.append(Arrays.toString(this.A02));
        A0P.append(", accountHash=");
        A0P.append(Arrays.toString(this.A01));
        A0P.append("]");
        return A0P.toString();
    }
}
