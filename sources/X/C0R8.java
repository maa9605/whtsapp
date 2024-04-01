package X;

import java.util.Arrays;

/* renamed from: X.0R8  reason: invalid class name */
/* loaded from: classes.dex */
public class C0R8 {
    public final byte A00;
    public final byte[] A01;

    public C0R8(byte[] bArr, byte b) {
        this.A01 = bArr;
        this.A00 = b;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0R8)) {
            return Arrays.equals(this.A01, ((C0R8) obj).A01);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A01);
    }
}
