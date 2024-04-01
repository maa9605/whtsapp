package X;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;

/* renamed from: X.0np */
/* loaded from: classes.dex */
public abstract class AbstractC14940np {
    public static final Interpolator A01 = new animation.InterpolatorC14920nn();
    public static final Interpolator A02 = new animation.InterpolatorC14930no();
    public int A00 = -1;

    public static void A00(C0TS c0ts) {
        View view = c0ts.A0H;
        if (Build.VERSION.SDK_INT >= 21) {
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag != null && (tag instanceof Float)) {
                C0AT.A0P(view, ((Number) tag).floatValue());
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public static void A01(RecyclerView recyclerView, C0TS c0ts, float f, float f2, boolean z) {
        View view = c0ts.A0H;
        if (Build.VERSION.SDK_INT >= 21 && z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            Float valueOf = Float.valueOf(C0AT.A00(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != view) {
                    float A00 = C0AT.A00(childAt);
                    if (A00 > f3) {
                        f3 = A00;
                    }
                }
            }
            C0AT.A0P(view, f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public final int A02(RecyclerView recyclerView) {
        int i = 196611;
        int i2 = 3084;
        if (C0AT.A05(recyclerView) != 0) {
            i = 198667;
            i2 = 1028;
        }
        return i | i2;
    }

    public int A03(RecyclerView recyclerView, int i, int i2, long j) {
        int i3 = this.A00;
        if (i3 == -1) {
            i3 = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            this.A00 = i3;
        }
        int interpolation = (int) (((animation.InterpolatorC14920nn) A01).getInterpolation(j <= 2000 ? ((float) j) / 2000.0f : 1.0f) * ((int) (((animation.InterpolatorC14930no) A02).getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * i3)));
        return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
    }
}
