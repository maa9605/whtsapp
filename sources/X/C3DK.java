package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3DK  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3DK extends C0TS {
    public final ImageView A00;
    public final TextView A01;

    public C3DK(View view) {
        super(view);
        this.A00 = (ImageView) view.findViewById(R.id.participant_avatar);
        this.A01 = (TextView) view.findViewById(R.id.participant_name);
    }
}
