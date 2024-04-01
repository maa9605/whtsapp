package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;

/* renamed from: X.3OL  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3OL extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ BrazilPaymentCardDetailsActivity A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C3OL(BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity, String str) {
        this.A00 = brazilPaymentCardDetailsActivity;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.A00.A1Z(this.A01);
    }
}
