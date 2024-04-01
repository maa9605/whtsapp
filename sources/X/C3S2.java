package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.whatsapp.payments.ui.widget.MandatePaymentBottomSheetFragment;

/* renamed from: X.3S2  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3S2 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ C894647c A00;
    public final /* synthetic */ MandatePaymentBottomSheetFragment A01;

    public /* synthetic */ C3S2(MandatePaymentBottomSheetFragment mandatePaymentBottomSheetFragment, C894647c c894647c) {
        this.A01 = mandatePaymentBottomSheetFragment;
        this.A00 = c894647c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.A01.A19(this.A00);
    }
}
