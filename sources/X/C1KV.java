package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.1KV  reason: invalid class name */
/* loaded from: classes.dex */
public class C1KV {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;

    public C1KV(View view) {
        this.A01 = (ImageView) view.findViewById(R.id.icon);
        this.A04 = (TextView) view.findViewById(R.id.title);
        this.A03 = (TextView) view.findViewById(R.id.size);
        this.A02 = (TextView) view.findViewById(R.id.date);
        this.A00 = view.findViewById(R.id.selection_check);
    }
}
