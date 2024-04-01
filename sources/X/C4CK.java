package X;

/* renamed from: X.4CK  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4CK implements InterfaceC895747n {
    public final /* synthetic */ C48O A00;
    public final /* synthetic */ C48P A01;
    public final /* synthetic */ C49A A02;

    public C4CK(C48P c48p, C49A c49a, C48O c48o) {
        this.A01 = c48p;
        this.A02 = c49a;
        this.A00 = c48o;
    }

    @Override // X.InterfaceC895747n
    public void AJs(C28Q c28q) {
        this.A00.AJs(c28q);
    }

    @Override // X.InterfaceC895747n
    public void API(String str) {
        C49A c49a = this.A02;
        C48P c48p = this.A01;
        C02590Ca A00 = c49a.A00(C49B.A00("AUTH", Boolean.TRUE, str, c48p.A0I.A00.A05() / 1000, null, null, new Object[0]));
        byte[] A03 = C05V.A03(c48p.A04, c48p.A02, false);
        if (A03 != null) {
            C48P.A00(c48p, C02A.A03(A03), A00, this.A00);
            return;
        }
        throw null;
    }
}
