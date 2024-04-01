package X;

/* renamed from: X.1rV  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40051rV {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C40051rV(String str, String str2, String str3, String str4, long j, long j2) {
        if (str != null) {
            this.A05 = str;
            if (str2 != null) {
                this.A04 = str2;
                if (str3 != null) {
                    this.A03 = str3;
                    if (str4 != null) {
                        this.A02 = str4;
                        this.A00 = j;
                        this.A01 = j2;
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C40051rV.class != obj.getClass()) {
            return false;
        }
        C40051rV c40051rV = (C40051rV) obj;
        if (this.A00 == c40051rV.A00 && this.A01 == c40051rV.A01 && this.A04.equals(c40051rV.A04) && this.A03.equals(c40051rV.A03)) {
            return this.A02.equals(c40051rV.A02);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.A04.hashCode() * 31;
        int hashCode2 = this.A02.hashCode();
        long j = this.A00;
        long j2 = this.A01;
        return ((((hashCode2 + ((this.A03.hashCode() + hashCode) * 31)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("RemoteFile{name='");
        C000200d.A1P(A0P, this.A04, '\'', ", mimeType='");
        C000200d.A1P(A0P, this.A03, '\'', ", md5Hash='");
        C000200d.A1P(A0P, this.A02, '\'', ", sizeBytes=");
        A0P.append(this.A00);
        A0P.append(", updateTime=");
        A0P.append(this.A01);
        A0P.append('}');
        return A0P.toString();
    }
}
