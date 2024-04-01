package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.3SJ  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3SJ extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ PaymentView A00;
    public final /* synthetic */ C4AI A01;

    public /* synthetic */ C3SJ(PaymentView paymentView, C4AI c4ai) {
        this.A00 = paymentView;
        this.A01 = c4ai;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.A00.A09(this.A01);
    }
}
