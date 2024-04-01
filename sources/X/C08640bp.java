package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Property;
import android.util.StateSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

/* renamed from: X.0bp */
/* loaded from: classes.dex */
public class C08640bp {
    public float A00;
    public float A01;
    public float A03;
    public float A04;
    public int A06;
    public Animator A07;
    public Drawable A08;
    public Drawable A09;
    public Drawable A0A;
    public ViewTreeObserver.OnPreDrawListener A0B;
    public C08570bi A0C;
    public C08570bi A0D;
    public C08570bi A0E;
    public C08570bi A0F;
    public C08750c0 A0G;
    public C08770c2 A0H;
    public ArrayList A0I;
    public ArrayList A0J;
    public final C08650bq A0O;
    public final C08290bB A0P;
    public final InterfaceC08630bo A0Q;
    public static final TimeInterpolator A0R = C08580bj.A01;
    public static final int[] A0X = {16842919, 16842910};
    public static final int[] A0W = {16843623, 16842908, 16842910};
    public static final int[] A0U = {16842908, 16842910};
    public static final int[] A0V = {16843623, 16842910};
    public static final int[] A0T = {16842910};
    public static final int[] A0S = new int[0];
    public int A05 = 0;
    public float A02 = 1.0f;
    public final Rect A0L = new Rect();
    public final RectF A0M = new RectF();
    public final RectF A0N = new RectF();
    public final Matrix A0K = new Matrix();

    public void A07() {
    }

    public void A0F(Rect rect) {
    }

    public boolean A0H() {
        return true;
    }

    public C08640bp(C08290bB c08290bB, InterfaceC08630bo interfaceC08630bo) {
        this.A0P = c08290bB;
        this.A0Q = interfaceC08630bo;
        C08650bq c08650bq = new C08650bq();
        this.A0O = c08650bq;
        c08650bq.A00(A0X, A00(new AbstractC08680bt() { // from class: X.0bs
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this);
                C08640bp.this = this;
            }

            @Override // X.AbstractC08680bt
            public float A00() {
                C08640bp c08640bp = C08640bp.this;
                return c08640bp.A00 + c08640bp.A03;
            }
        }));
        this.A0O.A00(A0W, A00(new AbstractC08680bt() { // from class: X.0bv
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this);
                C08640bp.this = this;
            }

            @Override // X.AbstractC08680bt
            public float A00() {
                C08640bp c08640bp = C08640bp.this;
                return c08640bp.A00 + c08640bp.A01;
            }
        }));
        this.A0O.A00(A0U, A00(new AbstractC08680bt() { // from class: X.0bv
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this);
                C08640bp.this = this;
            }

            @Override // X.AbstractC08680bt
            public float A00() {
                C08640bp c08640bp = C08640bp.this;
                return c08640bp.A00 + c08640bp.A01;
            }
        }));
        this.A0O.A00(A0V, A00(new AbstractC08680bt() { // from class: X.0bv
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this);
                C08640bp.this = this;
            }

            @Override // X.AbstractC08680bt
            public float A00() {
                C08640bp c08640bp = C08640bp.this;
                return c08640bp.A00 + c08640bp.A01;
            }
        }));
        this.A0O.A00(A0T, A00(new AbstractC08680bt() { // from class: X.0bw
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this);
                C08640bp.this = this;
            }

            @Override // X.AbstractC08680bt
            public float A00() {
                return C08640bp.this.A00;
            }
        }));
        this.A0O.A00(A0S, A00(new AbstractC08680bt(this) { // from class: X.0bx
            @Override // X.AbstractC08680bt
            public float A00() {
                return 0.0f;
            }

            {
                super(this);
            }
        }));
        this.A04 = this.A0P.getRotation();
    }

    public static final ValueAnimator A00(AbstractC08680bt abstractC08680bt) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(A0R);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(abstractC08680bt);
        valueAnimator.addUpdateListener(abstractC08680bt);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public float A01() {
        return this.A00;
    }

    public final AnimatorSet A02(C08570bi c08570bi, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        C08290bB c08290bB = this.A0P;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c08290bB, View.ALPHA, f);
        c08570bi.A03("opacity").A00(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c08290bB, View.SCALE_X, f2);
        c08570bi.A03("scale").A00(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c08290bB, View.SCALE_Y, f2);
        c08570bi.A03("scale").A00(ofFloat3);
        arrayList.add(ofFloat3);
        Matrix matrix = this.A0K;
        A0B(f3, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(c08290bB, new Property() { // from class: X.1AM
            public final Matrix A00 = new Matrix();

            @Override // android.util.Property
            public Object get(Object obj) {
                Matrix matrix2 = this.A00;
                matrix2.set(((ImageView) obj).getImageMatrix());
                return matrix2;
            }

            @Override // android.util.Property
            public void set(Object obj, Object obj2) {
                ((ImageView) obj).setImageMatrix((Matrix) obj2);
            }
        }, new TypeEvaluator() { // from class: X.1AN
            public final float[] A02 = new float[9];
            public final float[] A01 = new float[9];
            public final Matrix A00 = new Matrix();

            @Override // android.animation.TypeEvaluator
            public Object evaluate(float f4, Object obj, Object obj2) {
                float[] fArr = this.A02;
                ((Matrix) obj).getValues(fArr);
                float[] fArr2 = this.A01;
                ((Matrix) obj2).getValues(fArr2);
                int i = 0;
                do {
                    float f5 = fArr2[i];
                    float f6 = fArr[i];
                    fArr2[i] = ((f5 - f6) * f4) + f6;
                    i++;
                } while (i < 9);
                Matrix matrix2 = this.A00;
                matrix2.setValues(fArr2);
                return matrix2;
            }
        }, new Matrix(matrix));
        c08570bi.A03("iconScale").A00(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AnonymousClass088.A1B(animatorSet, arrayList);
        return animatorSet;
    }

    public GradientDrawable A03() {
        return new GradientDrawable();
    }

    public C08750c0 A04() {
        return new C08750c0();
    }

    public C08750c0 A05(int i, ColorStateList colorStateList) {
        Context context = this.A0P.getContext();
        C08750c0 A04 = A04();
        int A00 = C02160Ac.A00(context, R.color.design_fab_stroke_top_outer_color);
        int A002 = C02160Ac.A00(context, R.color.design_fab_stroke_top_inner_color);
        int A003 = C02160Ac.A00(context, R.color.design_fab_stroke_end_inner_color);
        int A004 = C02160Ac.A00(context, R.color.design_fab_stroke_end_outer_color);
        A04.A06 = A00;
        A04.A05 = A002;
        A04.A03 = A003;
        A04.A02 = A004;
        float f = i;
        if (A04.A00 != f) {
            A04.A00 = f;
            A04.A09.setStrokeWidth(f * 1.3333f);
            A04.A08 = true;
            A04.invalidateSelf();
        }
        if (colorStateList != null) {
            A04.A04 = colorStateList.getColorForState(A04.getState(), A04.A04);
        }
        A04.A07 = colorStateList;
        A04.A08 = true;
        A04.invalidateSelf();
        return A04;
    }

    public void A06() {
        C08650bq c08650bq = this.A0O;
        ValueAnimator valueAnimator = c08650bq.A00;
        if (valueAnimator != null) {
            valueAnimator.end();
            c08650bq.A00 = null;
        }
    }

    public final void A08() {
        Rect rect = this.A0L;
        A0E(rect);
        A0F(rect);
        InterfaceC08630bo interfaceC08630bo = this.A0Q;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        C08280bA c08280bA = ((C08620bn) interfaceC08630bo).A00;
        c08280bA.A0C.set(i, i2, i3, i4);
        int i5 = c08280bA.A02;
        c08280bA.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }

    public final void A09(float f) {
        this.A02 = f;
        Matrix matrix = this.A0K;
        A0B(f, matrix);
        this.A0P.setImageMatrix(matrix);
    }

    public void A0A(float f, float f2, float f3) {
        C08770c2 c08770c2 = this.A0H;
        if (c08770c2 != null) {
            c08770c2.A00(f, this.A03 + f);
            A08();
        }
    }

    public final void A0B(float f, Matrix matrix) {
        Drawable drawable;
        matrix.reset();
        if (this.A0P.getDrawable() == null || this.A06 == 0) {
            return;
        }
        RectF rectF = this.A0M;
        RectF rectF2 = this.A0N;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        float f2 = this.A06;
        rectF2.set(0.0f, 0.0f, f2, f2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f3 = this.A06 / 2.0f;
        matrix.postScale(f, f, f3, f3);
    }

    public void A0C(ColorStateList colorStateList) {
        Drawable drawable = this.A09;
        if (drawable != null) {
            C07O.A0Z(drawable, C08740bz.A01(colorStateList));
        }
    }

    public void A0D(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable[] drawableArr;
        GradientDrawable A03 = A03();
        A03.setShape(1);
        A03.setColor(-1);
        Drawable A0I = C07O.A0I(A03);
        this.A0A = A0I;
        C07O.A0Z(A0I, colorStateList);
        if (mode != null) {
            C07O.A0a(this.A0A, mode);
        }
        GradientDrawable A032 = A03();
        A032.setShape(1);
        A032.setColor(-1);
        Drawable A0I2 = C07O.A0I(A032);
        this.A09 = A0I2;
        C07O.A0Z(A0I2, C08740bz.A01(colorStateList2));
        if (i > 0) {
            C08750c0 A05 = A05(i, colorStateList);
            this.A0G = A05;
            drawableArr = new Drawable[]{A05, this.A0A, this.A09};
        } else {
            this.A0G = null;
            drawableArr = new Drawable[]{this.A0A, this.A09};
        }
        this.A08 = new LayerDrawable(drawableArr);
        Context context = this.A0P.getContext();
        Drawable drawable = this.A08;
        C08280bA c08280bA = ((C08620bn) this.A0Q).A00;
        float f = this.A00;
        C08770c2 c08770c2 = new C08770c2(context, drawable, c08280bA.A02(c08280bA.A04) / 2.0f, f, f + this.A03);
        this.A0H = c08770c2;
        c08770c2.A06 = false;
        c08770c2.invalidateSelf();
        super/*android.widget.ImageButton*/.setBackgroundDrawable(this.A0H);
    }

    public void A0E(Rect rect) {
        this.A0H.getPadding(rect);
    }

    public void A0G(int[] iArr) {
        C08690bu c08690bu;
        ValueAnimator valueAnimator;
        C08650bq c08650bq = this.A0O;
        ArrayList arrayList = c08650bq.A03;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c08690bu = null;
                break;
            }
            c08690bu = (C08690bu) arrayList.get(i);
            if (StateSet.stateSetMatches(c08690bu.A01, iArr)) {
                break;
            }
            i++;
        }
        C08690bu c08690bu2 = c08650bq.A01;
        if (c08690bu != c08690bu2) {
            if (c08690bu2 != null && (valueAnimator = c08650bq.A00) != null) {
                valueAnimator.cancel();
                c08650bq.A00 = null;
            }
            c08650bq.A01 = c08690bu;
            if (c08690bu != null) {
                ValueAnimator valueAnimator2 = c08690bu.A00;
                c08650bq.A00 = valueAnimator2;
                valueAnimator2.start();
            }
        }
    }
}
