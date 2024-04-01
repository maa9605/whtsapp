package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.whatsapp.payments.ui.widget.MandatePaymentBottomSheetFragment;

/* renamed from: X.3Rz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class View$OnClickListenerC70363Rz extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ MandatePaymentBottomSheetFragment A01;

    public /* synthetic */ View$OnClickListenerC70363Rz(MandatePaymentBottomSheetFragment mandatePaymentBottomSheetFragment, View view) {
        this.A01 = mandatePaymentBottomSheetFragment;
        this.A00 = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.A01.A17(this.A00);
    }
}
