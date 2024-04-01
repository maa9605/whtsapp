package X;

import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.3wu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86133wu extends AbstractC09080cc {
    public final View A00;

    public C86133wu(View view) {
        super(view);
        this.A00 = C0AT.A0D(this.A0H, R.id.search_no_matches);
    }

    public void A0I(Boolean bool) {
        View view;
        int dimensionPixelSize;
        if (bool != null && !bool.booleanValue()) {
            view = this.A0H;
            dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.search_no_result_short_top_margin) - view.getContext().getResources().getDimensionPixelSize(R.dimen.search_header_bottom_margin);
        } else {
            view = this.A0H;
            dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.search_no_result_tall_top_margin);
        }
        this.A00.setPadding(view.getPaddingLeft(), dimensionPixelSize, view.getPaddingRight(), view.getPaddingBottom());
    }
}
