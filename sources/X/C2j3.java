package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;

/* renamed from: X.2j3  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2j3 extends PopupWindow {
    public View A00;
    public InterfaceC54612j4 A01;
    public int[] A02;
    public final int[][] A03;

    public C2j3(C40081rY c40081rY, View view, int[] iArr) {
        super(new LinearLayout(view.getContext()), -2, -2);
        this.A02 = new int[2];
        LinearLayout linearLayout = (LinearLayout) getContentView();
        linearLayout.setOrientation(0);
        linearLayout.setFocusableInTouchMode(true);
        linearLayout.setFocusable(true);
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.emoji_picker_item);
        int dimensionPixelSize2 = (dimensionPixelSize - view.getContext().getResources().getDimensionPixelSize(R.dimen.emoji_picker_icon)) / 2;
        this.A03 = C60712uv.A06(iArr);
        int i = 0;
        while (true) {
            int[][] iArr2 = this.A03;
            if (i < iArr2.length) {
                int[] iArr3 = iArr2[i];
                ImageView imageView = new ImageView(view.getContext());
                imageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                imageView.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                imageView.setImageDrawable(c40081rY.A02(view.getContext(), -1, new C43941yG(iArr3), 0.75f));
                imageView.setTag(Integer.valueOf(i));
                imageView.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 46));
                imageView.setBackgroundResource(R.drawable.selector_orange_gradient);
                imageView.setContentDescription(C2CI.A00(iArr3));
                linearLayout.addView(imageView);
                i++;
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                setTouchable(true);
                setFocusable(true);
                setOutsideTouchable(true);
                setInputMethodMode(2);
                setBackgroundDrawable(C02180Ae.A0O(view.getContext(), R.drawable.panel, R.color.skinTonePopupBackground));
                linearLayout.requestFocus();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return;
            }
        }
    }
}
