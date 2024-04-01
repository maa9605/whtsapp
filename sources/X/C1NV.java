package X;

/* renamed from: X.1NV  reason: invalid class name */
/* loaded from: classes.dex */
public class C1NV implements InterfaceC37941nI {
    public final /* synthetic */ C03310Fe A00;
    public final /* synthetic */ InterfaceC37941nI A01;

    public C1NV(C03310Fe c03310Fe, InterfaceC37941nI interfaceC37941nI) {
        this.A00 = c03310Fe;
        this.A01 = interfaceC37941nI;
    }

    @Override // X.C1Q6
    public void AJu(String str, int i) {
        C03310Fe c03310Fe = this.A00;
        Long A01 = c03310Fe.A03.A01();
        if (c03310Fe == null) {
            throw null;
        }
        if ((i != 500 && i != 3) || A01 == null) {
            this.A01.AJu(str, i);
            return;
        }
        InterfaceC002901k interfaceC002901k = c03310Fe.A04;
        final InterfaceC37941nI interfaceC37941nI = this.A01;
        interfaceC002901k.ASB(new Runnable() { // from class: X.1N0
            @Override // java.lang.Runnable
            public final void run() {
                C1NV c1nv = C1NV.this;
                c1nv.A00.A01(interfaceC37941nI);
            }
        }, A01.longValue());
    }

    @Override // X.InterfaceC37941nI
    public void APE() {
        this.A00.A03.A02();
        this.A01.APE();
    }
}
