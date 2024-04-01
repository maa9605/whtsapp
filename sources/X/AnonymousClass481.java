package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.481 */
/* loaded from: classes3.dex */
public abstract class AnonymousClass481 {
    public final Context A00;
    public final C018508q A01;
    public final C0E7 A02;
    public final C013406l A03;
    public final C28S A04;
    public final C463026g A05;
    public final C0DV A06;
    public final C899048w A07;

    public AnonymousClass481(Context context, C018508q c018508q, C013406l c013406l, C0DV c0dv, C0E7 c0e7, C463026g c463026g, C28S c28s, C899048w c899048w) {
        this.A00 = context;
        this.A01 = c018508q;
        this.A03 = c013406l;
        this.A06 = c0dv;
        this.A02 = c0e7;
        this.A05 = c463026g;
        this.A04 = c28s;
        this.A07 = c899048w;
    }

    public void A00() {
        Log.i("PAY: BrazilStepUpVerificationBase getProviderEncryptionKeyAsync");
        C899048w c899048w = this.A07;
        C77343i3 A02 = c899048w.A02("VISA", "STEP-UP", true);
        if (A02 == null) {
            new C48R(this.A00, this.A01, this.A02, this.A05, this.A04, c899048w, "STEP-UP").A00("VISA", new C48Q() { // from class: X.4Bx
                {
                    AnonymousClass481.this = this;
                }

                @Override // X.C48Q
                public void AJs(C28Q c28q) {
                    Log.e("PAY: BrazilVerifyCardOTPSendAction getProviderEncryptionKeyAsync iq returned null");
                    AnonymousClass481.this.A01(null, new C28Q());
                }

                @Override // X.C48Q
                public void AO6(C77343i3 c77343i3) {
                    AnonymousClass481.this.A01(c77343i3, null);
                }
            });
        } else {
            A01(A02, null);
        }
    }

    public void A01(C77343i3 c77343i3, C28Q c28q) {
        if (!(this instanceof C90674Bz)) {
            C90664By c90664By = (C90664By) this;
            if (c28q != null) {
                c90664By.A04.A00(null, c28q);
                return;
            }
            String A03 = c90664By.A03.A03(c90664By.A07, c77343i3);
            if (TextUtils.isEmpty(A03)) {
                Log.e("PAY: BrazilVerifyCardOTPSendAction encryptAndSendOtp/enc otp failure");
                c90664By.A04.A00(null, new C28Q());
                return;
            }
            Log.i("PAY: BrazilVerifyCardOTPSendAction encryptAndSendOtp");
            c90664By.A02(A03);
            return;
        }
        C90674Bz c90674Bz = (C90674Bz) this;
        if (c28q != null) {
            C000200d.A1M(C000200d.A0P("PAY: BrazilVerifyCardSendAuthCodeAction  onProviderKeyFetched auth code failure "), c28q.A06);
            c90674Bz.A04.A00(c28q);
            return;
        }
        String A032 = c90674Bz.A03.A03(c90674Bz.A05, c77343i3);
        if (TextUtils.isEmpty(A032)) {
            Log.e("PAY: BrazilVerifyCardSendAuthCodeAction  onProviderKeyFetched auth code failure");
            c90674Bz.A04.A00(new C28Q());
            return;
        }
        Log.i("PAY: BrazilVerifyCardSendAuthCodeAction onProviderKeyFetched success");
        c90674Bz.A02(A032);
    }
}
