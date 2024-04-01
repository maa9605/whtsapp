package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.whatsapp.payments.ui.invites.PaymentInviteFragment;
import java.util.List;

/* renamed from: X.3RA  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3RA extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ PaymentInviteFragment A01;
    public final /* synthetic */ List A02;

    public /* synthetic */ C3RA(PaymentInviteFragment paymentInviteFragment, List list, int i) {
        this.A01 = paymentInviteFragment;
        this.A02 = list;
        this.A00 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.A01.A0y(this.A02, this.A00);
    }
}
