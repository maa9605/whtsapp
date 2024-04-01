package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindActivity;

/* renamed from: X.3PE  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3PE extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ IndiaUpiDeviceBindActivity A02;

    public /* synthetic */ C3PE(IndiaUpiDeviceBindActivity indiaUpiDeviceBindActivity, int i, int i2) {
        this.A02 = indiaUpiDeviceBindActivity;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.A02.A1f(this.A00, this.A01);
    }
}
