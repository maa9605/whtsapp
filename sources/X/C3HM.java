package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3HM  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3HM extends C0TS {
    public ImageView A00;
    public TextView A01;

    public C3HM(View view) {
        super(view);
        this.A01 = (TextView) view.findViewById(R.id.no_results);
        this.A00 = (ImageView) view.findViewById(R.id.shrug_emoji);
    }
}
