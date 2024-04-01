package X;

/* renamed from: X.0cr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09210cr {
    public final int A00;
    public final long A01;
    public final String A02;

    public C09210cr(String str, int i, long j) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C09210cr) {
            C09210cr c09210cr = (C09210cr) obj;
            return this.A02.equals(c09210cr.A02) && this.A00 == c09210cr.A00 && this.A01 == c09210cr.A01;
        }
        return false;
    }

    public int hashCode() {
        int i = this.A00;
        int hashCode = ((this.A02.hashCode() * 31) + (i ^ (i >>> 32))) * 31;
        long j = this.A01;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A02);
        sb.append(":");
        sb.append(this.A00);
        sb.append(":");
        sb.append(this.A01);
        sb.append(";");
        return sb.toString();
    }
}
