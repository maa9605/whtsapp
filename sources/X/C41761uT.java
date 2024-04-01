package X;

/* renamed from: X.1uT  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41761uT {
    public static volatile C41761uT A09;
    public final C02L A00;
    public final C0E6 A01;
    public final AnonymousClass012 A02;
    public final C01R A03;
    public final C41401tr A04;
    public final C0EC A05;
    public final C41421tt A06;
    public final C0EG A07;
    public final C41631uG A08;

    public C41761uT(AnonymousClass012 anonymousClass012, C02L c02l, C0EG c0eg, C0E6 c0e6, C01R c01r, C41421tt c41421tt, C0EC c0ec, C41631uG c41631uG, C41401tr c41401tr) {
        this.A02 = anonymousClass012;
        this.A00 = c02l;
        this.A07 = c0eg;
        this.A01 = c0e6;
        this.A03 = c01r;
        this.A06 = c41421tt;
        this.A05 = c0ec;
        this.A08 = c41631uG;
        this.A04 = c41401tr;
    }

    public static C41761uT A00() {
        if (A09 == null) {
            synchronized (C41761uT.class) {
                if (A09 == null) {
                    A09 = new C41761uT(AnonymousClass012.A00(), C02L.A00(), C0EG.A00(), C0E6.A00(), C01R.A02, C41421tt.A00(), C0EC.A00(), C41631uG.A00(), C41401tr.A01());
                }
            }
        }
        return A09;
    }
}
