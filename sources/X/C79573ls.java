package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3ls  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C79573ls implements InterfaceC010405f {
    public final C018508q A00;
    public final C05Y A01;
    public final AbstractC52172aB A02;

    public C79573ls(C018508q c018508q, C05Y c05y, AbstractC52172aB abstractC52172aB) {
        this.A00 = c018508q;
        this.A01 = c05y;
        this.A02 = abstractC52172aB;
    }

    public final void A00(int i) {
        this.A00.A0G(new RunnableEBaseShape6S0200000_I1(this, new C40711sk(-1, null, null, null, i), 14));
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        Log.e("sendScanContactQr/delivery-error");
        A00(408);
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        Log.e("sendScanContactQr/response-error");
        A00(C40731sm.A01(c02590Ca));
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        String str2;
        String str3;
        String str4;
        int i;
        C02590Ca A0D = c02590Ca.A0D("qr");
        if (A0D != null) {
            C04P A0A = A0D.A0A("jid");
            if (A0A != null) {
                str2 = A0A.A03;
            } else {
                str2 = null;
            }
            C04P A0A2 = A0D.A0A("notify");
            if (A0A2 != null) {
                str3 = A0A2.A03;
            } else {
                str3 = null;
            }
            UserJid nullable = UserJid.getNullable(str2);
            if (nullable == null) {
                Log.e("sendScanContactQr/error: invalid jid");
                A00(0);
                return;
            }
            C04P A0A3 = A0D.A0A("type");
            if (A0A3 != null) {
                str4 = A0A3.A03;
            } else {
                str4 = null;
            }
            if ("contact".equals(str4)) {
                i = 0;
            } else if ("subscribe".equals(str4)) {
                i = 1;
            } else if ("message".equals(str4)) {
                C02590Ca A0D2 = A0D.A0D("message");
                r7 = A0D2 != null ? A0D2.A0F() : null;
                i = 2;
            } else {
                StringBuilder sb = new StringBuilder("sendScanContactQr/error: invalid type ");
                sb.append(str4);
                Log.e(sb.toString());
                A00(0);
                return;
            }
            Log.e("sendScanContactQr/success");
            this.A00.A0G(new RunnableEBaseShape6S0200000_I1(this, new C40711sk(i, nullable, str3, r7, 0), 14));
            return;
        }
        Log.e("sendScanContactQr/error: missing node");
        A00(0);
    }
}
