package X;

/* renamed from: X.1t2 */
/* loaded from: classes2.dex */
public class C40891t2 {
    public final C40911t4 A00;
    public final C40901t3 A01;
    public final C40901t3 A02;

    public C40891t2(C40901t3 c40901t3, C40911t4 c40911t4, C40901t3 c40901t32) {
        this.A02 = c40901t3;
        this.A00 = c40911t4;
        this.A01 = c40901t32;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("UserNoticeContentTiming{start=");
        A0P.append(this.A02);
        A0P.append(", duration=");
        A0P.append(this.A00);
        A0P.append(", end=");
        A0P.append(this.A01);
        A0P.append('}');
        return A0P.toString();
    }
}
