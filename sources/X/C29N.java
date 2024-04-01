package X;

/* renamed from: X.29N */
/* loaded from: classes2.dex */
public class C29N {
    public final Integer A00;
    public final Long A01;
    public final Long A02;
    public final boolean A03;

    public C29N(boolean z, Long l, Long l2, Integer num) {
        this.A03 = z;
        this.A02 = l;
        this.A01 = l2;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("[success=");
        A0P.append(this.A03);
        StringBuilder sb = new StringBuilder(A0P.toString());
        Long l = this.A02;
        if (l != null) {
            sb.append(" refresh=");
            sb.append(l);
        }
        Long l2 = this.A01;
        if (l2 != null) {
            sb.append(" backoff=");
            sb.append(l2);
        }
        Integer num = this.A00;
        if (num != null) {
            sb.append(" errorCode=");
            sb.append(num);
        }
        sb.append("]");
        return sb.toString();
    }
}
