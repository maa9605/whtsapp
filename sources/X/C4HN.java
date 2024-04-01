package X;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.4HN  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4HN extends AbstractC91264Eg {
    public Button A00;
    public ImageView A01;
    public LinearLayout A02;
    public TextView A03;
    public TextView A04;

    public C4HN(View view) {
        super(view);
        this.A01 = (ImageView) C0AT.A0D(view, R.id.payout_bank_icon);
        this.A04 = (TextView) C0AT.A0D(view, R.id.payout_bank_name);
        this.A03 = (TextView) C0AT.A0D(view, R.id.payout_bank_status);
        this.A02 = (LinearLayout) C0AT.A0D(view, R.id.warning_container);
        this.A00 = (Button) C0AT.A0D(view, R.id.cta_button);
    }
}
