package X;

import android.content.res.TypedArray;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.search.verification.client.R;

/* renamed from: X.0cv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09250cv extends AbstractC09260cw {
    public static final int[] A02 = {R.attr.snackbarButtonStyle};
    public boolean A00;
    public final AccessibilityManager A01;

    public C09250cv(ViewGroup viewGroup, View view, C1BE c1be) {
        super(viewGroup, view, c1be);
        this.A01 = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static C09250cv A00(View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        do {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            } else if (view == null) {
                break;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        } while (view != null);
        viewGroup = viewGroup2;
        if (viewGroup != null) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(A02);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            int i2 = R.layout.design_layout_snackbar_include;
            if (resourceId != -1) {
                i2 = R.layout.mtrl_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i2, viewGroup, false);
            C09250cv c09250cv = new C09250cv(viewGroup, snackbarContentLayout, snackbarContentLayout);
            ((SnackbarContentLayout) c09250cv.A05.getChildAt(0)).A03.setText(charSequence);
            ((AbstractC09260cw) c09250cv).A00 = i;
            return c09250cv;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    public void A04() {
        C1BJ A00 = C1BJ.A00();
        int i = (this.A00 && this.A01.isTouchExplorationEnabled()) ? -2 : super.A00;
        C1BH c1bh = this.A07;
        synchronized (A00.A03) {
            if (A00.A05(c1bh)) {
                C1BI c1bi = A00.A00;
                c1bi.A00 = i;
                A00.A02.removeCallbacksAndMessages(c1bi);
                A00.A04(A00.A00);
                return;
            }
            C1BI c1bi2 = A00.A01;
            boolean z = false;
            if (c1bi2 != null && c1bh != null && c1bi2.A02.get() == c1bh) {
                z = true;
            }
            if (z) {
                c1bi2.A00 = i;
            } else {
                A00.A01 = new C1BI(i, c1bh);
            }
            C1BI c1bi3 = A00.A00;
            if (c1bi3 == null || !A00.A06(c1bi3, 4)) {
                A00.A00 = null;
                A00.A01();
            }
        }
    }

    public void A05(int i) {
        ((SnackbarContentLayout) this.A05.getChildAt(0)).A02.setTextColor(i);
    }

    public void A06(CharSequence charSequence, final View.OnClickListener onClickListener) {
        Button button = ((SnackbarContentLayout) this.A05.getChildAt(0)).A02;
        if (!TextUtils.isEmpty(charSequence) && onClickListener != null) {
            this.A00 = true;
            button.setVisibility(0);
            button.setText(charSequence);
            button.setOnClickListener(new View.OnClickListener() { // from class: X.1BF
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    onClickListener.onClick(view);
                    C09250cv.this.A02(1);
                }
            });
            return;
        }
        button.setVisibility(8);
        button.setOnClickListener(null);
        this.A00 = false;
    }
}
