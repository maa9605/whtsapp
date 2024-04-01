package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.payments.ui.widget.PayToolbar;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4Kv */
/* loaded from: classes3.dex */
public abstract class C4Kv extends C4Ki {
    public FrameLayout A00;
    public C0C9 A01;
    public C28S A02;
    public C42021ut A03;
    public C0EU A04;
    public C463026g A05;
    public C47302Ar A06;
    public C0DV A07;
    public C014406v A08 = C014406v.A00("PaymentCardDetailsActivity", "payment-settings", "COMMON");
    public C48z A09;
    public C92194Hx A0A;
    public C92204Hy A0B;
    public C49682Lx A0C;
    public InterfaceC002901k A0D;

    @Override // X.C4KP
    public void A1U(C0N2 c0n2, boolean z) {
        super.A1U(c0n2, z);
        C0N7 c0n7 = (C0N7) c0n2;
        if (c0n7 != null) {
            ((C4KP) this).A05.setText(C40841sx.A0E(((ActivityC02310Ar) this).A01, c0n7));
            C0N0 c0n0 = c0n7.A06;
            if (c0n0 != null) {
                if (!c0n0.A09()) {
                    ((C4KP) this).A06.setText(R.string.payment_method_unverified);
                    ((C4KP) this).A06.A03 = null;
                    A1X(1);
                    C92194Hx c92194Hx = this.A0A;
                    if (c92194Hx != null) {
                        c92194Hx.setAlertButtonClickListener(new C3OL((BrazilPaymentCardDetailsActivity) this, ((C4KP) this).A07.A07));
                    }
                } else {
                    ((C4KP) this).A06.setVisibility(8);
                }
            }
            C0N0 c0n02 = c0n2.A06;
            if (c0n02 == null) {
                throw null;
            }
            if (c0n02.A09()) {
                C92194Hx c92194Hx2 = this.A0A;
                if (c92194Hx2 != null) {
                    c92194Hx2.setVisibility(8);
                    C92204Hy c92204Hy = this.A0B;
                    if (c92204Hy != null) {
                        c92204Hy.setBottomDividerSpaceVisibility(0);
                    }
                }
                ((C4KP) this).A06.setVisibility(8);
                return;
            }
            return;
        }
        throw null;
    }

    public void A1W() {
        C42021ut c42021ut = this.A03;
        List<String> singletonList = Collections.singletonList(((C4KP) this).A07.A07);
        synchronized (c42021ut) {
            for (String str : singletonList) {
                c42021ut.A03(str);
            }
            if (TextUtils.isEmpty(c42021ut.A04.A02("unread_payment_method_credential_ids"))) {
                c42021ut.A01.A05(null, 22);
            }
        }
        C0DV c0dv = this.A07;
        c0dv.A04();
        C0N2 A08 = c0dv.A08.A08(((C4KP) this).A07.A07);
        C018508q c018508q = ((ActivityC02290Ap) this).A0A;
        c018508q.A02.post(new C3QW(this, A08));
    }

    public final void A1X(int i) {
        this.A0A = new C92194Hx(this);
        this.A00.removeAllViews();
        this.A00.addView(this.A0A);
        C92204Hy c92204Hy = this.A0B;
        if (c92204Hy != null) {
            c92204Hy.setBottomDividerSpaceVisibility(8);
            this.A0A.setTopDividerVisibility(8);
        }
        this.A0A.setAlertType(i);
    }

    public /* synthetic */ void A1Y(C0N2 c0n2) {
        A1U(c0n2, false);
    }

    public void lambda$addCardRemovedAlertRow$75$PaymentCardDetailsActivity(View view) {
        C002701i.A19(this, 201);
    }

    public void lambda$addCardSuspendedAlertRow$74$PaymentCardDetailsActivity(View view) {
        C002701i.A19(this, 201);
    }

    @Override // X.C4KP, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        this.A08.A07(null, "onActivityResult 1", null);
        this.A0D.AS1(new C3QZ(this));
    }

    @Override // X.C4Ki, X.C4KP, X.C4K9, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A08(R.string.payment_card_details_title);
            C0U1 A0c2 = A0c();
            if (A0c2 != null) {
                A0c2.A0L(true);
                int currentContentInsetRight = ((C4KP) this).A0E.getCurrentContentInsetRight();
                int A1P = A1P(2131952441);
                PayToolbar payToolbar = ((C4KP) this).A0E;
                payToolbar.A0A();
                payToolbar.A0P.A00(A1P, currentContentInsetRight);
            }
            int A1P2 = A1P(2131952376);
            int currentContentInsetLeft = ((C4KP) this).A0E.getCurrentContentInsetLeft();
            PayToolbar payToolbar2 = ((C4KP) this).A0E;
            payToolbar2.A0A();
            payToolbar2.A0P.A00(currentContentInsetLeft, A1P2);
        }
        if (!TextUtils.isEmpty(null)) {
            ((TextView) findViewById(R.id.footer_processed_by_psp)).setText((CharSequence) null);
        }
        this.A00 = (FrameLayout) findViewById(R.id.method_details_alert_container);
    }
}
