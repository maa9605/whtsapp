package X;

import com.whatsapp.util.Log;

/* renamed from: X.3lq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C79553lq implements InterfaceC010405f {
    public final C018508q A00;
    public final C05Y A01;
    public final C79533lo A02;

    public C79553lq(C018508q c018508q, C05Y c05y, C79533lo c79533lo) {
        this.A00 = c018508q;
        this.A01 = c05y;
        this.A02 = c79533lo;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        Log.e("sendGetContactQrCode/delivery-error");
        this.A00.A0G(new RunnableEBaseShape0S1101000_I1(this, null, 0, 1));
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        Log.e("sendGetContactQrCode/response-error");
        this.A00.A0G(new RunnableEBaseShape0S1101000_I1(this, null, C40731sm.A01(c02590Ca), 1));
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        String str2;
        C04P A0A;
        C02590Ca A0D = c02590Ca.A0D("qr");
        String str3 = null;
        if (A0D != null) {
            C04P A0A2 = A0D.A0A("type");
            if (A0A2 != null) {
                str2 = A0A2.A03;
            } else {
                str2 = null;
            }
            if ("contact".equals(str2) && (A0A = A0D.A0A("code")) != null && (str3 = A0A.A03) != null) {
                Log.e("sendGetContactQrCode/success");
                this.A00.A0G(new RunnableEBaseShape0S1101000_I1(this, str3, 0, 1));
            }
        }
        Log.e("sendGetContactQrCode/error: invalid response");
        this.A00.A0G(new RunnableEBaseShape0S1101000_I1(this, str3, 0, 1));
    }
}
