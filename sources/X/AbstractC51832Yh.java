package X;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

/* renamed from: X.2Yh */
/* loaded from: classes2.dex */
public abstract class AbstractC51832Yh extends C2Yi {
    public C002301c A00;
    public final C32651eT A01;

    public AbstractC51832Yh(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        C32651eT c32651eT = new C32651eT(context, null);
        this.A01 = c32651eT;
        c32651eT.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(this.A01);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.search_token_list_vertical_margin);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.search_item_horizontal_margin);
        setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        this.A01.setChipSpacing(getChipSpacingPx());
    }

    private int getChipSpacingPx() {
        return getResources().getDimensionPixelSize(R.dimen.search_token_list_yg_margin_all) << 1;
    }
}
