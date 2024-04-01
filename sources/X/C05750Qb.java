package X;

import java.util.Arrays;

/* renamed from: X.0Qb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05750Qb {
    public final String A00;
    public final byte[] A01;

    public C05750Qb(String str, byte[] bArr) {
        this.A00 = str;
        this.A01 = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C05750Qb.class == obj.getClass()) {
            C05750Qb c05750Qb = (C05750Qb) obj;
            return Arrays.equals(this.A01, c05750Qb.A01) && AnonymousClass024.A0l(this.A00, c05750Qb.A00);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (Arrays.hashCode(this.A01) + 31) * 31;
        String str = this.A00;
        return hashCode + (str == null ? 0 : str.hashCode());
    }
}
