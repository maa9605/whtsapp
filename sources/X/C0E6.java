package X;

import org.whispersystems.jobqueue.Job;

/* renamed from: X.0E6  reason: invalid class name */
/* loaded from: classes.dex */
public class C0E6 {
    public static volatile C0E6 A04;
    public C0I8 A00;
    public final AbstractC000600i A01;
    public final C001200o A02;
    public final C003701t A03;

    public C0E6(C001200o c001200o, C003701t c003701t, AbstractC000600i abstractC000600i) {
        this.A02 = c001200o;
        this.A03 = c003701t;
        this.A01 = abstractC000600i;
    }

    public static C0E6 A00() {
        if (A04 == null) {
            synchronized (C0E6.class) {
                if (A04 == null) {
                    A04 = new C0E6(C001200o.A01, C003701t.A00(), AbstractC000600i.A00());
                }
            }
        }
        return A04;
    }

    public void A01(Job job) {
        this.A00.A01(job);
    }
}
