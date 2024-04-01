package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.4HY  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4HY extends AbstractC91274Eh {
    public final Context A00;
    public final ImageView A01;
    public final ProgressBar A02;
    public final RelativeLayout A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final C0L7 A07;
    public final C0L5 A08;

    public C4HY(View view, C0L5 c0l5, C0L7 c0l7) {
        super(view);
        this.A08 = c0l5;
        this.A07 = c0l7;
        this.A00 = view.getContext();
        this.A05 = (TextView) C0AT.A0D(view, R.id.payment_send_action);
        this.A06 = (TextView) C0AT.A0D(view, R.id.payment_send_action_time);
        this.A04 = (TextView) C0AT.A0D(view, R.id.payment_people_info);
        this.A03 = (RelativeLayout) C0AT.A0D(view, R.id.payment_people_container);
        this.A01 = (ImageView) C0AT.A0D(view, R.id.payment_people_icon);
        this.A02 = (ProgressBar) C0AT.A0D(view, R.id.payment_people_progress_bar);
    }
}
