package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;

/* renamed from: X.2YX  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2YX extends C2YY {
    public C2YX(final Context context) {
        new C2YZ(context) { // from class: X.2YY
            {
                A01();
            }
        };
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.search_attachment_height_regular));
    }
}
