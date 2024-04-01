package X;

import java.util.Arrays;

/* renamed from: X.0IR  reason: invalid class name */
/* loaded from: classes.dex */
public class C0IR {
    public final byte A00;
    public final byte[] A01;

    public C0IR(byte[] bArr, byte b) {
        this.A01 = bArr;
        this.A00 = b;
    }

    public byte[] A00() {
        return AnonymousClass029.A1h(new byte[]{this.A00}, this.A01);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0IR)) {
            return Arrays.equals(this.A01, ((C0IR) obj).A01);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A01);
    }
}
