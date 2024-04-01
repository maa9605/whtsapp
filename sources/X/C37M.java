package X;

/* renamed from: X.37M  reason: invalid class name */
/* loaded from: classes2.dex */
public class C37M implements C0EQ {
    public static volatile C37M A04;
    public final C02L A00;
    public final C41321tj A01;
    public final C05G A02;
    public final InterfaceC002901k A03;

    public C37M(C02L c02l, InterfaceC002901k interfaceC002901k, C41321tj c41321tj, C05G c05g) {
        this.A00 = c02l;
        this.A03 = interfaceC002901k;
        this.A01 = c41321tj;
        this.A02 = c05g;
    }

    @Override // X.C0EQ
    public void AKy() {
        C02L c02l = this.A00;
        c02l.A05();
        if (c02l.A00 == null || !this.A02.A02()) {
            return;
        }
        this.A03.AS1(new RunnableEBaseShape8S0100000_I1_0(this.A01, 18));
    }
}
