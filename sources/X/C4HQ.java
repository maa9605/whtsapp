package X;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.4HQ  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4HQ extends AbstractC91264Eg {
    public Button A00;
    public ImageView A01;
    public TextView A02;

    public C4HQ(View view) {
        super(view);
        this.A01 = (ImageView) C0AT.A0D(view, R.id.warning_icon);
        this.A02 = (TextView) C0AT.A0D(view, R.id.warning_message);
        this.A00 = (Button) C0AT.A0D(view, R.id.cta_button);
    }
}
