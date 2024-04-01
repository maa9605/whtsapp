package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiInvitePaymentActivity;

/* renamed from: X.3PK  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3PK extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ IndiaUpiInvitePaymentActivity A01;

    public /* synthetic */ C3PK(IndiaUpiInvitePaymentActivity indiaUpiInvitePaymentActivity, UserJid userJid) {
        this.A01 = indiaUpiInvitePaymentActivity;
        this.A00 = userJid;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.A01.A1a(this.A00);
    }
}
