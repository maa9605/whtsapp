package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.payments.ui.IndiaUpiResetPinActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.4C7  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4C7 extends C48B {
    public final Context A00;
    public final C018508q A01;
    public final C02L A02;
    public final C0E7 A03;
    public final C013606n A04;
    public final C90564Bm A05;
    public final C28S A06;
    public final C0DV A07;
    public final C4CV A08;
    public final C49682Lx A09;

    public C4C7(Context context, C018508q c018508q, C02L c02l, C49682Lx c49682Lx, C0DV c0dv, C0E7 c0e7, C894947f c894947f, C463026g c463026g, C013606n c013606n, C4CV c4cv, C28S c28s, C90564Bm c90564Bm) {
        super(c463026g, c894947f.A04);
        this.A00 = context;
        this.A01 = c018508q;
        this.A02 = c02l;
        this.A09 = c49682Lx;
        this.A07 = c0dv;
        this.A03 = c0e7;
        this.A04 = c013606n;
        this.A08 = c4cv;
        this.A06 = c28s;
        this.A05 = c90564Bm;
    }

    public void A00(final C4IA c4ia, final C48C c48c) {
        C000200d.A1V(C000200d.A0P("PAY: IndiaUpiOtpAction requestOtp withCallback: "), c48c != null);
        C4CV c4cv = this.A08;
        c4cv.A03.A04();
        String str = c4ia.A0D;
        String str2 = c4ia.A0E;
        if (!TextUtils.isEmpty(str)) {
            A01(str, str2, c4ia, c48c);
            return;
        }
        C4C4 c4c4 = new C4C4(this.A00, this.A01, this.A02, this.A07, this.A03, super.A01, this.A04, c4cv, this.A06, this.A05, null);
        AnonymousClass486 anonymousClass486 = new AnonymousClass486() { // from class: X.4C6
            @Override // X.AnonymousClass486
            public void AIz(C4GI c4gi) {
                C4C7.this.A01(c4gi.A01, c4gi.A02, c4ia, c48c);
            }

            @Override // X.AnonymousClass486
            public void AJs(C28Q c28q) {
                Log.w("PAY: IndiaUpiOtpAction: could not fetch VPA information to request OTP");
                C48C c48c2 = c48c;
                if (c48c2 != null) {
                    ((IndiaUpiResetPinActivity) c48c2).A1w(c28q);
                }
            }
        };
        C02L c02l = c4c4.A02;
        c02l.A05();
        c4c4.A00(c02l.A03, new C4C3(c4c4, anonymousClass486));
    }

    public final void A01(String str, String str2, C4IA c4ia, final C48C c48c) {
        final C3NV c3nv = super.A00;
        c3nv.A04("upi-generate-otp");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C04P("vpa", str, null, (byte) 0));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new C04P("vpa-id", str2, null, (byte) 0));
        }
        arrayList.add(new C04P("action", "upi-generate-otp", null, (byte) 0));
        arrayList.add(new C04P("device-id", this.A09.A02(), null, (byte) 0));
        arrayList.add(new C04P("upi-bank-info", c4ia.A0A, null, (byte) 0));
        String A03 = this.A05.A03();
        if (!TextUtils.isEmpty(A03)) {
            arrayList.add(new C04P("provider-type", A03, null, (byte) 0));
        }
        C463026g c463026g = super.A01;
        C02590Ca c02590Ca = new C02590Ca("account", (C04P[]) arrayList.toArray(new C04P[0]), null, null);
        final Context context = this.A00;
        final C018508q c018508q = this.A01;
        final C0E7 c0e7 = this.A03;
        final C28S c28s = this.A06;
        c463026g.A0F("set", c02590Ca, new C91754Gd(context, c018508q, c0e7, c28s, c3nv) { // from class: X.4IQ
            @Override // X.C91754Gd, X.C28V
            public void A02(C28Q c28q) {
                super.A02(c28q);
                C48C c48c2 = c48c;
                if (c48c2 != null) {
                    ((IndiaUpiResetPinActivity) c48c2).A1w(c28q);
                }
            }

            @Override // X.C91754Gd, X.C28V
            public void A03(C28Q c28q) {
                super.A03(c28q);
                C48C c48c2 = c48c;
                if (c48c2 != null) {
                    ((IndiaUpiResetPinActivity) c48c2).A1w(c28q);
                }
            }

            @Override // X.C91754Gd, X.C28V
            public void A04(C02590Ca c02590Ca2) {
                super.A04(c02590Ca2);
                C48C c48c2 = c48c;
                if (c48c2 != null) {
                    ((IndiaUpiResetPinActivity) c48c2).A1w(null);
                }
            }
        }, 0L);
    }
}
