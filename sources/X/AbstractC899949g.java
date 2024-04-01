package X;

import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaInAppBrowsingActivity;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.49g */
/* loaded from: classes3.dex */
public abstract class AbstractC899949g {
    public int A00;
    public C0KJ A01;
    public final C018508q A02;
    public final C02L A03;
    public final ActivityC02270An A04;
    public final C0E7 A05;
    public final AnonymousClass012 A06;
    public final C002301c A07;
    public final C42031uu A08;
    public final C28S A09;
    public final C0EU A0A;
    public final C463026g A0B;
    public final C895947p A0C;
    public final C899048w A0D;
    public final AnonymousClass493 A0E;
    public final AnonymousClass499 A0F;
    public final InterfaceC899849f A0G;

    public AbstractC899949g(AnonymousClass012 anonymousClass012, C018508q c018508q, C02L c02l, C895947p c895947p, C002301c c002301c, C0EU c0eu, C0E7 c0e7, AnonymousClass499 anonymousClass499, C463026g c463026g, C28S c28s, AnonymousClass493 anonymousClass493, C899048w c899048w, C42031uu c42031uu, ActivityC02270An activityC02270An) {
        this.A06 = anonymousClass012;
        this.A02 = c018508q;
        this.A03 = c02l;
        this.A0C = c895947p;
        this.A07 = c002301c;
        this.A0A = c0eu;
        this.A05 = c0e7;
        this.A0F = anonymousClass499;
        this.A0B = c463026g;
        this.A09 = c28s;
        this.A0E = anonymousClass493;
        this.A0D = c899048w;
        this.A08 = c42031uu;
        this.A04 = activityC02270An;
        this.A0G = (InterfaceC899849f) activityC02270An;
    }

    public static void A00(AbstractC899949g abstractC899949g) {
        ActivityC02270An activityC02270An = abstractC899949g.A04;
        String A06 = abstractC899949g.A07.A06(R.string.payments_generic_error);
        C019208x c019208x = new C019208x(activityC02270An);
        c019208x.A01.A0E = A06;
        c019208x.A06(R.string.ok, null);
        DialogInterfaceC019408z A00 = c019208x.A00();
        A00.setOnDismissListener(null);
        A00.show();
    }

    public void A01() {
        this.A0G.ASf(false);
        this.A0A.A04().edit().remove("payment_step_up_info").apply();
        this.A08.A01();
    }

    public void A02() {
        C77543iN c77543iN;
        C0KJ c0kj = this.A01;
        if (c0kj != null && (c77543iN = c0kj.A00) != null && c77543iN.A00.equals("WEBVIEW")) {
            if (c77543iN.A02) {
                if (Build.VERSION.SDK_INT >= 23) {
                    AnonymousClass493 anonymousClass493 = this.A0E;
                    if (anonymousClass493.A05() && anonymousClass493.A01() == 1) {
                        FingerprintBottomSheet A00 = FingerprintBottomSheet.A00(R.string.payment_bio_bottom_sheet_title, R.string.cancel, R.string.use_payments_pin, R.layout.pay_header);
                        AnonymousClass012 anonymousClass012 = this.A06;
                        AnonymousClass492 anonymousClass492 = new AnonymousClass492(anonymousClass012, this.A03, this.A0B, anonymousClass493, "AUTH");
                        AnonymousClass499 anonymousClass499 = this.A0F;
                        ActivityC02270An activityC02270An = this.A04;
                        A00.A04 = new C4H7(anonymousClass012, anonymousClass499, activityC02270An, A00, anonymousClass492, new C91224Ec(this, A00));
                        activityC02270An.AUh(A00);
                        return;
                    }
                }
                PinBottomSheetDialogFragment pinBottomSheetDialogFragment = new PinBottomSheetDialogFragment();
                pinBottomSheetDialogFragment.A0A = new C90834Cp();
                pinBottomSheetDialogFragment.A0B = new C91204Ea(this, pinBottomSheetDialogFragment);
                this.A04.AUh(pinBottomSheetDialogFragment);
                return;
            }
            A03(null, null);
        }
    }

    public final void A03(C02590Ca c02590Ca, PinBottomSheetDialogFragment pinBottomSheetDialogFragment) {
        final C48S c48s = new C48S(this.A04, this.A02, this.A05, this.A0B, this.A09);
        C0KJ c0kj = this.A01;
        final C91244Ee c91244Ee = new C91244Ee(this, pinBottomSheetDialogFragment);
        C02590Ca c02590Ca2 = new C02590Ca("step_up", new C04P[]{new C04P("step_up_id", c0kj.A02, null, (byte) 0)}, null, null);
        C02590Ca c02590Ca3 = new C02590Ca("step_up_challenge", new C04P[]{new C04P("challenge_id", c0kj.A00.A01, null, (byte) 0)}, null, null);
        c48s.A04.A0F("get", new C02590Ca("account", new C04P[]{new C04P("action", "get-step-up-webview-url", null, (byte) 0)}, c02590Ca != null ? new C02590Ca[]{c02590Ca2, c02590Ca3, c02590Ca} : new C02590Ca[]{c02590Ca2, c02590Ca3}, null), new C28V(c48s.A00, c48s.A01, c48s.A02, c48s.A03) { // from class: X.4Gq
            @Override // X.C28V
            public void A02(C28Q c28q) {
                c91244Ee.A00(c28q);
            }

            @Override // X.C28V
            public void A03(C28Q c28q) {
                c91244Ee.A00(c28q);
            }

            @Override // X.C28V
            public void A04(C02590Ca c02590Ca4) {
                String str;
                try {
                    C02590Ca A0E = c02590Ca4.A0E("account");
                    C28Q A00 = C28Q.A00(A0E);
                    if (A00 != null) {
                        c91244Ee.A00(A00);
                        return;
                    }
                    C04P A0A = A0E.A0A("webview_url");
                    if (A0A != null) {
                        str = A0A.A03;
                    } else {
                        str = null;
                    }
                    if (TextUtils.isEmpty(str)) {
                        c91244Ee.A00(new C28Q());
                        return;
                    }
                    C04P A0A2 = A0E.A0A("callback_url");
                    String str2 = A0A2 != null ? A0A2.A03 : null;
                    C91244Ee c91244Ee2 = c91244Ee;
                    PinBottomSheetDialogFragment pinBottomSheetDialogFragment2 = c91244Ee2.A00;
                    if (pinBottomSheetDialogFragment2 != null) {
                        pinBottomSheetDialogFragment2.A11();
                    }
                    AbstractC899949g abstractC899949g = c91244Ee2.A01;
                    if (abstractC899949g != null) {
                        ActivityC02270An activityC02270An = abstractC899949g.A04;
                        Intent intent = new Intent(activityC02270An, WaInAppBrowsingActivity.class);
                        C000700j.A03(str);
                        intent.putExtra("webview_url", str);
                        if (!TextUtils.isEmpty(str2)) {
                            intent.putExtra("webview_callback", str2);
                        }
                        intent.putExtra("webview_javascript_enabled", true);
                        intent.putExtra("webview_hide_url", true);
                        activityC02270An.startActivityForResult(intent, abstractC899949g.A00);
                        return;
                    }
                    throw null;
                } catch (C0L4 e) {
                    c48s.A05.A08("PAY: PaymentStepUpWebviewAction : invalid response", e);
                    c91244Ee.A00(new C28Q());
                }
            }
        }, 0L);
    }

    public void A04(String str) {
        C0KJ A05 = this.A0A.A05();
        this.A01 = A05;
        if (A05 != null && A05.A03 && A05.A01.equals(str)) {
            this.A0G.ASf(true);
        } else {
            this.A0G.ASf(false);
        }
    }

    public void A05(String str, String str2, int i) {
        this.A00 = i;
        A04(str2);
        if (TextUtils.isEmpty(str) || !str.equals("STEP_UP")) {
            return;
        }
        C000200d.A0l(this.A0A, "payment_step_up_update_ack", true);
        this.A08.A01();
    }
}
