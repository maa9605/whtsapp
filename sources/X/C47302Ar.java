package X;

/* renamed from: X.2Ar */
/* loaded from: classes2.dex */
public class C47302Ar {
    public static volatile C47302Ar A05;
    public boolean A00;
    public final C41821uZ A01;
    public final C0DW A02;
    public final C0DV A03;
    public final C014406v A04 = C014406v.A00("PaymentsLifecycleManager", "network", "COMMON");

    public C47302Ar(C0DV c0dv, C0DW c0dw, C28S c28s, C41821uZ c41821uZ) {
        this.A03 = c0dv;
        this.A02 = c0dw;
        this.A01 = c41821uZ;
        c28s.A00 = this;
    }

    public static C47302Ar A00() {
        if (A05 == null) {
            synchronized (C47302Ar.class) {
                if (A05 == null) {
                    A05 = new C47302Ar(C0DV.A00(), C0DW.A00(), C28S.A00(), C41821uZ.A00());
                }
            }
        }
        return A05;
    }

    public synchronized void A01() {
        if (this.A00) {
            this.A04.A07(null, "payments was already initialized", null);
            return;
        }
        if (this.A02.A04()) {
            this.A04.A07(null, "initializing payments", null);
            C41821uZ c41821uZ = this.A01;
            synchronized (c41821uZ) {
                c41821uZ.A00 = true;
                C018508q c018508q = c41821uZ.A02;
                c018508q.A02.post(new RunnableEBaseShape4S0100000_I0_4(c41821uZ, 40));
                c41821uZ.A04.A00(c41821uZ);
            }
            this.A00 = true;
        }
    }

    public synchronized void A02(boolean z, boolean z2) {
        this.A04.A07(null, "reinitializing payments", null);
        this.A00 = false;
        this.A03.A06(z, z2);
        C41821uZ c41821uZ = this.A01;
        synchronized (c41821uZ) {
            c41821uZ.A00 = false;
            C018508q c018508q = c41821uZ.A02;
            c018508q.A02.post(new RunnableEBaseShape4S0100000_I0_4(c41821uZ, 41));
            c41821uZ.A04.A01(c41821uZ);
        }
        A01();
    }
}
