package X;

import com.whatsapp.util.Log;

/* renamed from: X.33K  reason: invalid class name */
/* loaded from: classes2.dex */
public class C33K implements InterfaceC010405f {
    public final C2L3 A00;
    public final C60042tp A01;
    public final C05Y A02;

    public C33K(C05Y c05y, C2L3 c2l3, C60042tp c60042tp) {
        this.A02 = c05y;
        this.A00 = c2l3;
        this.A01 = c60042tp;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        Log.e("sendReportBizProduct/delivery-error");
        this.A00.A02(this.A01, false);
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        Log.e("sendReportBizProduct/response-error");
        this.A00.A02(this.A01, false);
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        C02590Ca A0D = c02590Ca.A0D("response");
        if (A0D != null) {
            C02590Ca A0D2 = A0D.A0D("success");
            if (A0D2 != null) {
                if ("true".equals(A0D2.A0F())) {
                    this.A00.A02(this.A01, true);
                    return;
                } else {
                    this.A00.A02(this.A01, false);
                    return;
                }
            }
            return;
        }
        StringBuilder A0P = C000200d.A0P("sendReportBizProduct/corrupted-response:");
        A0P.append(c02590Ca.toString());
        Log.e(A0P.toString());
        this.A00.A02(this.A01, false);
    }
}
