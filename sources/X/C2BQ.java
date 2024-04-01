package X;

/* renamed from: X.2BQ  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2BQ {
    public static volatile C2BQ A08;
    public C61352w0 A00;
    public C2BT A01;
    public C2BS A02;
    public C2BZ A03;
    public final AbstractC000600i A04;
    public final C012005w A05;
    public final C001200o A06;
    public final C04Z A07;

    public C2BQ(AbstractC000600i abstractC000600i, C001200o c001200o, C012005w c012005w, C04Z c04z) {
        this.A04 = abstractC000600i;
        this.A06 = c001200o;
        this.A05 = c012005w;
        this.A07 = c04z;
    }

    public static C2BQ A00() {
        if (A08 == null) {
            synchronized (C2BQ.class) {
                if (A08 == null) {
                    A08 = new C2BQ(AbstractC000600i.A00(), C001200o.A01, C012005w.A00(), C04Z.A00());
                }
            }
        }
        return A08;
    }

    public synchronized C2BT A01() {
        C2BT c2bt;
        c2bt = this.A01;
        if (c2bt == null) {
            c2bt = new C2BT(this.A04, this.A06, this.A07, this.A05);
            this.A01 = c2bt;
        }
        return c2bt;
    }

    public synchronized C2BS A02() {
        C2BS c2bs;
        c2bs = this.A02;
        if (c2bs == null) {
            c2bs = new C2BS(A01());
            this.A02 = c2bs;
        }
        return c2bs;
    }
}
