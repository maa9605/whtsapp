package X;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import com.google.android.search.verification.client.R;

/* renamed from: X.0q3  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16230q3 {
    public float A00(View view) {
        Number number = (Number) view.getTag(R.id.save_non_transition_alpha);
        float alpha = view.getAlpha();
        if (number != null) {
            return alpha / number.floatValue();
        }
        return alpha;
    }

    public void A01(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(R.id.save_non_transition_alpha, null);
        }
    }

    public void A02(View view) {
        if (view.getTag(R.id.save_non_transition_alpha) == null) {
            view.setTag(R.id.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    public void A03(View view, float f) {
        Number number = (Number) view.getTag(R.id.save_non_transition_alpha);
        if (number != null) {
            view.setAlpha(number.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    public void A04(View view, int i, int i2, int i3, int i4) {
        view.setLeft(i);
        view.setTop(i2);
        view.setRight(i3);
        view.setBottom(i4);
    }

    public void A05(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            A05(view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    public void A06(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            A06(view2, matrix);
            matrix.postTranslate(view2.getScrollX(), view2.getScrollY());
        }
        matrix.postTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}
