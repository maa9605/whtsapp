package X;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.whatsapp.payments.ui.widget.PeerPaymentTransactionRow;

/* renamed from: X.3SK  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3SK extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ PeerPaymentTransactionRow A00;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.A00.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.whatsapp")));
    }
}
