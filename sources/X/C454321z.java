package X;

import com.whatsapp.util.Log;

/* renamed from: X.21z */
/* loaded from: classes2.dex */
public class C454321z {
    public final AnonymousClass012 A00;
    public final C001200o A01;
    public final C000500h A02;
    public final C05Y A03;
    public final InterfaceC002901k A04;

    public C454321z(AnonymousClass012 anonymousClass012, C001200o c001200o, InterfaceC002901k interfaceC002901k, C05Y c05y, C000500h c000500h) {
        this.A00 = anonymousClass012;
        this.A01 = c001200o;
        this.A04 = interfaceC002901k;
        this.A03 = c05y;
        this.A02 = c000500h;
    }

    public void A00() {
        Log.i("BackupTokenProtocolHelper/sendBackupTokenRequest");
        String A0J = this.A02.A0J();
        if (AnonymousClass024.A0j(A0J)) {
            return;
        }
        byte[] A0B = C02A.A0B();
        C05Y c05y = this.A03;
        String A02 = c05y.A02();
        c05y.A07(226, A02, new C02590Ca("iq", new C04P[]{new C04P("to", "s.whatsapp.net", null, (byte) 0), new C04P("xmlns", "w:auth:backup:token", null, (byte) 0), new C04P("type", "set", null, (byte) 0), new C04P("id", A02, null, (byte) 0)}, new C02590Ca("token", null, null, A0B)), new C79883mN(this, A0B, A0J), 32000L);
    }
}
