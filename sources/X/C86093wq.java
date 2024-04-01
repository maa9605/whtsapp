package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3wq */
/* loaded from: classes2.dex */
public class C86093wq extends AbstractC81023oE {
    public final Context A00;
    public final ViewGroup.MarginLayoutParams A01;
    public final TextView A02;

    public C86093wq(Context context) {
        super(context);
        this.A00 = context;
        FrameLayout.inflate(getContext(), R.layout.search_group_header, this);
        this.A02 = (TextView) C0AT.A0D(this, R.id.title);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        this.A01 = marginLayoutParams;
        setLayoutParams(marginLayoutParams);
        setBackgroundResource(R.color.primary_surface);
    }

    public void A00(String str, boolean z, int i) {
        this.A02.setText(str);
        ViewGroup.MarginLayoutParams marginLayoutParams = this.A01;
        if (z) {
            marginLayoutParams.bottomMargin = 0;
        } else {
            marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(R.dimen.search_header_bottom_margin) - AnonymousClass088.A02(this.A00, i);
        }
        setLayoutParams(marginLayoutParams);
    }
}
