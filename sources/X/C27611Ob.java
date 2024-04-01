package X;

import java.util.Arrays;

/* renamed from: X.1Ob  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27611Ob {
    public final String A00;
    public final byte[] A01;
    public final byte[] A02;

    public C27611Ob(String str, byte[] bArr, byte[] bArr2) {
        this.A00 = str;
        this.A02 = bArr;
        this.A01 = bArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C27611Ob.class == obj.getClass()) {
            C27611Ob c27611Ob = (C27611Ob) obj;
            return Arrays.equals(this.A01, c27611Ob.A01) && Arrays.equals(this.A02, c27611Ob.A02) && AnonymousClass024.A0l(this.A00, c27611Ob.A00);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (Arrays.hashCode(this.A02) + ((Arrays.hashCode(this.A01) + 31) * 31)) * 31;
        String str = this.A00;
        return hashCode + (str == null ? 0 : str.hashCode());
    }
}
