package X;

import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.4HP  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4HP extends AbstractC91264Eg {
    public View A00;
    public TextView A01;
    public TextView A02;

    public C4HP(View view) {
        super(view);
        this.A02 = (TextView) C0AT.A0D(view, R.id.date);
        this.A01 = (TextView) C0AT.A0D(view, R.id.amount);
        this.A00 = C0AT.A0D(view, R.id.divider);
    }
}
