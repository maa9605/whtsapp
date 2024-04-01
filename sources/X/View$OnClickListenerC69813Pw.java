package X;

import android.view.View;
import android.widget.Button;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity;

/* renamed from: X.3Pw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class View$OnClickListenerC69813Pw extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ Button A00;
    public final /* synthetic */ IndiaUpiPaymentsTosActivity A01;

    public /* synthetic */ View$OnClickListenerC69813Pw(IndiaUpiPaymentsTosActivity indiaUpiPaymentsTosActivity, Button button) {
        this.A01 = indiaUpiPaymentsTosActivity;
        this.A00 = button;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.A01.A1d(this.A00);
    }
}
