package X;

import android.util.Pair;
import com.whatsapp.util.Log;

/* renamed from: X.345 */
/* loaded from: classes2.dex */
public class AnonymousClass345 implements InterfaceC010405f {
    public C0Ml A00 = new C0Ml();
    public final C56342n8 A01;
    public final C56352n9 A02;
    public final C05Y A03;

    public AnonymousClass345(C05Y c05y, C56342n8 c56342n8, C56352n9 c56352n9) {
        this.A02 = c56352n9;
        this.A03 = c05y;
        this.A01 = c56342n8;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        C000200d.A19("GetOrderProtocol/delivery-error with iqId ", str, ">");
        this.A00.A00(new C3TL(str));
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        Pair A09 = C40731sm.A09(c02590Ca);
        if (A09 != null) {
            C0Ml c0Ml = this.A00;
            c0Ml.A01 = new C49432Kk(null, A09);
            c0Ml.A02 = true;
            c0Ml.A03.countDown();
            StringBuilder sb = new StringBuilder("GetOrderProtocol/response-error with iqId <");
            sb.append(str);
            sb.append("> and error ");
            sb.append(A09);
            Log.w(sb.toString());
            return;
        }
        C0Ml c0Ml2 = this.A00;
        c0Ml2.A01 = new C49432Kk(null, new Pair(1, "error code is null"));
        c0Ml2.A02 = true;
        c0Ml2.A03.countDown();
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0122  */
    @Override // X.InterfaceC010405f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void APJ(java.lang.String r25, X.C02590Ca r26) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass345.APJ(java.lang.String, X.0Ca):void");
    }
}
