package X;

import java.util.Arrays;

/* renamed from: X.1R5  reason: invalid class name */
/* loaded from: classes.dex */
public class C1R5 {
    public final int A00;
    public final byte[] A01;

    public C1R5(byte[] bArr) {
        this.A01 = bArr;
        this.A00 = Arrays.hashCode(bArr);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1R5) {
            return Arrays.equals(this.A01, ((C1R5) obj).A01);
        }
        return false;
    }

    public int hashCode() {
        return this.A00;
    }
}
