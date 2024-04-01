package X;

import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.4HH  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4HH extends AbstractC91274Eh {
    public Space A00;
    public TextView A01;
    public TextView A02;

    public C4HH(View view) {
        super(view);
        this.A01 = (TextView) C0AT.A0D(view, R.id.payment_amount_header);
        this.A02 = (TextView) C0AT.A0D(view, R.id.payment_amount_text);
        this.A00 = (Space) C0AT.A0D(view, R.id.space);
    }
}
