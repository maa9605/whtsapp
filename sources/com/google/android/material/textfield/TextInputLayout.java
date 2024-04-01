package com.google.android.material.textfield;

import X.AbstractC014907a;
import X.AbstractC13390lB;
import X.AnonymousClass088;
import X.C02160Ac;
import X.C02700Cn;
import X.C07O;
import X.C07X;
import X.C07Y;
import X.C08550bg;
import X.C08560bh;
import X.C08580bj;
import X.C09L;
import X.C0AS;
import X.C0AT;
import X.C0UV;
import X.C0V9;
import X.C0YO;
import X.C1B1;
import X.C1B2;
import X.C1BT;
import X.C1BV;
import X.C32831eo;
import X.C32841ep;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.search.verification.client.R;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public ValueAnimator A0A;
    public ColorStateList A0B;
    public ColorStateList A0C;
    public ColorStateList A0D;
    public PorterDuff.Mode A0E;
    public Typeface A0F;
    public Drawable A0G;
    public Drawable A0H;
    public Drawable A0I;
    public Drawable A0J;
    public GradientDrawable A0K;
    public EditText A0L;
    public TextView A0M;
    public CheckableImageButton A0N;
    public CharSequence A0O;
    public CharSequence A0P;
    public CharSequence A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public final int A0e;
    public final int A0f;
    public final int A0g;
    public final int A0h;
    public final int A0i;
    public final int A0j;
    public final int A0k;
    public final int A0l;
    public final int A0m;
    public final int A0n;
    public final Rect A0o;
    public final RectF A0p;
    public final FrameLayout A0q;
    public final C1B1 A0r;
    public final C1BV A0s;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textInputStyle);
        this.A0s = new C1BV(this);
        this.A0o = new Rect();
        this.A0p = new RectF();
        this.A0r = new C1B1(this);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.A0q = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(this.A0q);
        C1B1 c1b1 = this.A0r;
        TimeInterpolator timeInterpolator = C08580bj.A03;
        c1b1.A0O = timeInterpolator;
        c1b1.A07();
        C1B1 c1b12 = this.A0r;
        c1b12.A0N = timeInterpolator;
        c1b12.A07();
        C1B1 c1b13 = this.A0r;
        if (c1b13.A0K != 8388659) {
            c1b13.A0K = 8388659;
            c1b13.A07();
        }
        int[] iArr = C08550bg.A0x;
        C08560bh.A01(context, attributeSet, R.attr.textInputStyle, 2131952453);
        C08560bh.A02(context, attributeSet, iArr, R.attr.textInputStyle, 2131952453, new int[0]);
        C0V9 c0v9 = new C0V9(context, context.obtainStyledAttributes(attributeSet, iArr, R.attr.textInputStyle, 2131952453));
        TypedArray typedArray = c0v9.A02;
        this.A0X = typedArray.getBoolean(21, true);
        setHint(typedArray.getText(1));
        this.A0W = typedArray.getBoolean(20, true);
        this.A0e = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_bottom_offset);
        this.A0g = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.A0f = typedArray.getDimensionPixelOffset(4, 0);
        this.A03 = typedArray.getDimension(8, 0.0f);
        this.A02 = typedArray.getDimension(7, 0.0f);
        this.A00 = typedArray.getDimension(5, 0.0f);
        this.A01 = typedArray.getDimension(6, 0.0f);
        this.A04 = typedArray.getColor(2, 0);
        this.A09 = typedArray.getColor(9, 0);
        this.A0h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default);
        this.A0i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused);
        this.A07 = this.A0h;
        setBoxBackgroundMode(typedArray.getInt(3, 0));
        if (typedArray.hasValue(0)) {
            ColorStateList A01 = c0v9.A01(0);
            this.A0C = A01;
            this.A0B = A01;
        }
        this.A0l = C02160Ac.A00(context, R.color.mtrl_textinput_default_box_stroke_color);
        this.A0m = C02160Ac.A00(context, R.color.mtrl_textinput_disabled_color);
        this.A0n = C02160Ac.A00(context, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (typedArray.getResourceId(22, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(22, 0));
        }
        int resourceId = typedArray.getResourceId(16, 0);
        boolean z = typedArray.getBoolean(15, false);
        int resourceId2 = typedArray.getResourceId(19, 0);
        boolean z2 = typedArray.getBoolean(18, false);
        CharSequence text = typedArray.getText(17);
        boolean z3 = typedArray.getBoolean(11, false);
        setCounterMaxLength(typedArray.getInt(12, -1));
        this.A0k = typedArray.getResourceId(14, 0);
        this.A0j = typedArray.getResourceId(13, 0);
        this.A0b = typedArray.getBoolean(25, false);
        this.A0I = c0v9.A02(24);
        this.A0Q = typedArray.getText(23);
        if (typedArray.hasValue(26)) {
            this.A0T = true;
            this.A0D = c0v9.A01(26);
        }
        if (typedArray.hasValue(27)) {
            this.A0U = true;
            this.A0E = AnonymousClass088.A0N(typedArray.getInt(27, -1), null);
        }
        typedArray.recycle();
        setHelperTextEnabled(z2);
        setHelperText(text);
        setHelperTextTextAppearance(resourceId2);
        setErrorEnabled(z);
        setErrorTextAppearance(resourceId);
        setCounterEnabled(z3);
        A05();
        C0AT.A0V(this, 2);
    }

    public static void A00(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                A00((ViewGroup) childAt, z);
            }
        }
    }

    public final int A01() {
        float A03;
        if (this.A0X) {
            int i = this.A05;
            if (i == 0 || i == 1) {
                A03 = this.A0r.A03();
            } else if (i != 2) {
                return 0;
            } else {
                A03 = this.A0r.A03() / 2.0f;
            }
            return (int) A03;
        }
        return 0;
    }

    public void A02() {
        Drawable background;
        Drawable background2;
        TextView textView;
        EditText editText = this.A0L;
        if (editText == null || (background = editText.getBackground()) == null) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if ((i == 21 || i == 22) && (background2 = this.A0L.getBackground()) != null && !this.A0V) {
            Drawable newDrawable = background2.getConstantState().newDrawable();
            if (background2 instanceof DrawableContainer) {
                Drawable.ConstantState constantState = newDrawable.getConstantState();
                boolean z = false;
                if (!AnonymousClass088.A07) {
                    try {
                        Method declaredMethod = DrawableContainer.class.getDeclaredMethod("setConstantState", DrawableContainer.DrawableContainerState.class);
                        AnonymousClass088.A06 = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException unused) {
                        Log.e("DrawableUtils", "Could not fetch setConstantState(). Oh well.");
                    }
                    AnonymousClass088.A07 = true;
                }
                Method method = AnonymousClass088.A06;
                if (method != null) {
                    try {
                        method.invoke(background2, constantState);
                        z = true;
                    } catch (Exception unused2) {
                        Log.e("DrawableUtils", "Could not invoke setConstantState(). Oh well.");
                    }
                }
                this.A0V = z;
            }
            if (!this.A0V) {
                this.A0L.setBackground(newDrawable);
                this.A0V = true;
                A06();
            }
        }
        if (C0YO.A03(background)) {
            background = background.mutate();
        }
        C1BV c1bv = this.A0s;
        if (c1bv.A07()) {
            TextView textView2 = c1bv.A0A;
            background.setColorFilter(C0UV.A00(textView2 != null ? textView2.getCurrentTextColor() : -1, PorterDuff.Mode.SRC_IN));
        } else if (this.A0S && (textView = this.A0M) != null) {
            background.setColorFilter(C0UV.A00(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            C07O.A0U(background);
            this.A0L.refreshDrawableState();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0012, code lost:
        if (r0.hasFocus() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0030, code lost:
        if (r2 == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03() {
        /*
            r4 = this;
            android.graphics.drawable.GradientDrawable r0 = r4.A0K
            if (r0 == 0) goto L3f
            int r0 = r4.A05
            if (r0 == 0) goto L3f
            android.widget.EditText r0 = r4.A0L
            r3 = 1
            if (r0 == 0) goto L14
            boolean r0 = r0.hasFocus()
            r2 = 1
            if (r0 != 0) goto L15
        L14:
            r2 = 0
        L15:
            android.widget.EditText r0 = r4.A0L
            if (r0 == 0) goto L7b
            boolean r0 = r0.isHovered()
            if (r0 == 0) goto L7b
        L1f:
            int r1 = r4.A05
            r0 = 2
            if (r1 != r0) goto L3f
            boolean r0 = r4.isEnabled()
            if (r0 != 0) goto L40
            int r0 = r4.A0m
            r4.A06 = r0
        L2e:
            if (r3 != 0) goto L32
            if (r2 == 0) goto L76
        L32:
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L76
            int r0 = r4.A0i
            r4.A07 = r0
        L3c:
            r4.A04()
        L3f:
            return
        L40:
            X.1BV r1 = r4.A0s
            boolean r0 = r1.A07()
            if (r0 == 0) goto L55
            android.widget.TextView r0 = r1.A0A
            if (r0 == 0) goto L53
            int r0 = r0.getCurrentTextColor()
        L50:
            r4.A06 = r0
            goto L2e
        L53:
            r0 = -1
            goto L50
        L55:
            boolean r0 = r4.A0S
            if (r0 == 0) goto L64
            android.widget.TextView r0 = r4.A0M
            if (r0 == 0) goto L64
            int r0 = r0.getCurrentTextColor()
            r4.A06 = r0
            goto L2e
        L64:
            if (r2 == 0) goto L6b
            int r0 = r4.A09
            r4.A06 = r0
            goto L2e
        L6b:
            if (r3 == 0) goto L72
            int r0 = r4.A0n
            r4.A06 = r0
            goto L32
        L72:
            int r0 = r4.A0l
            r4.A06 = r0
        L76:
            int r0 = r4.A0h
            r4.A07 = r0
            goto L3c
        L7b:
            r3 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A03():void");
    }

    public final void A04() {
        int i;
        Drawable drawable;
        if (this.A0K == null) {
            return;
        }
        int i2 = this.A05;
        if (i2 != 1) {
            if (i2 == 2 && this.A09 == 0) {
                this.A09 = this.A0C.getColorForState(getDrawableState(), this.A0C.getDefaultColor());
            }
        } else {
            this.A07 = 0;
        }
        EditText editText = this.A0L;
        if (editText != null && this.A05 == 2) {
            if (editText.getBackground() != null) {
                this.A0G = this.A0L.getBackground();
            }
            this.A0L.setBackground(null);
        }
        EditText editText2 = this.A0L;
        if (editText2 != null && this.A05 == 1 && (drawable = this.A0G) != null) {
            editText2.setBackground(drawable);
        }
        int i3 = this.A07;
        if (i3 > -1 && (i = this.A06) != 0) {
            this.A0K.setStroke(i3, i);
        }
        this.A0K.setCornerRadii(getCornerRadiiAsArray());
        this.A0K.setColor(this.A04);
        invalidate();
    }

    public final void A05() {
        Drawable drawable = this.A0I;
        if (drawable != null) {
            if (this.A0T || this.A0U) {
                Drawable mutate = C07O.A0I(drawable).mutate();
                this.A0I = mutate;
                if (this.A0T) {
                    C07O.A0Z(mutate, this.A0D);
                }
                if (this.A0U) {
                    C07O.A0a(this.A0I, this.A0E);
                }
                CheckableImageButton checkableImageButton = this.A0N;
                if (checkableImageButton != null) {
                    Drawable drawable2 = checkableImageButton.getDrawable();
                    Drawable drawable3 = this.A0I;
                    if (drawable2 != drawable3) {
                        this.A0N.setImageDrawable(drawable3);
                    }
                }
            }
        }
    }

    public final void A06() {
        int i = this.A05;
        if (i == 0) {
            this.A0K = null;
        } else if (i == 2 && this.A0X && !(this.A0K instanceof C1BT)) {
            this.A0K = new C1BT();
        } else if (this.A0K == null) {
            this.A0K = new GradientDrawable();
        }
        if (this.A05 != 0) {
            A08();
        }
        A0A();
    }

    public final void A07() {
        C07X c07x;
        float f;
        if (A0G()) {
            RectF rectF = this.A0p;
            C1B1 c1b1 = this.A0r;
            CharSequence charSequence = c1b1.A0W;
            if (C0AT.A05(c1b1.A0i) == 1) {
                c07x = C07Y.A02;
            } else {
                c07x = C07Y.A01;
            }
            boolean A01 = ((AbstractC014907a) c07x).A01(charSequence, charSequence.length());
            Rect rect = c1b1.A0d;
            float A02 = !A01 ? rect.left : rect.right - c1b1.A02();
            rectF.left = A02;
            rectF.top = rect.top;
            if (!A01) {
                f = c1b1.A02() + A02;
            } else {
                f = rect.right;
            }
            rectF.right = f;
            float A03 = c1b1.A03() + rect.top;
            rectF.bottom = A03;
            float f2 = rectF.left;
            float f3 = this.A0g;
            float f4 = f2 - f3;
            rectF.left = f4;
            float f5 = rectF.top - f3;
            rectF.top = f5;
            float f6 = rectF.right + f3;
            rectF.right = f6;
            float f7 = A03 + f3;
            rectF.bottom = f7;
            C1BT c1bt = (C1BT) this.A0K;
            if (c1bt != null) {
                c1bt.A00(f4, f5, f6, f7);
                return;
            }
            throw null;
        }
    }

    public final void A08() {
        FrameLayout frameLayout = this.A0q;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
        int A01 = A01();
        if (A01 != layoutParams.topMargin) {
            layoutParams.topMargin = A01;
            frameLayout.requestLayout();
        }
    }

    public final void A09() {
        EditText editText = this.A0L;
        if (editText == null) {
            return;
        }
        if (this.A0b && ((editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) || this.A0c)) {
            if (this.A0N == null) {
                LayoutInflater from = LayoutInflater.from(getContext());
                FrameLayout frameLayout = this.A0q;
                CheckableImageButton checkableImageButton = (CheckableImageButton) from.inflate(R.layout.design_text_input_password_icon, (ViewGroup) frameLayout, false);
                this.A0N = checkableImageButton;
                checkableImageButton.setImageDrawable(this.A0I);
                this.A0N.setContentDescription(this.A0Q);
                frameLayout.addView(this.A0N);
                this.A0N.setOnClickListener(new View.OnClickListener() { // from class: X.1BX
                    {
                        TextInputLayout.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        TextInputLayout.this.A0E(false);
                    }
                });
            }
            EditText editText2 = this.A0L;
            if (editText2 != null && editText2.getMinimumHeight() <= 0) {
                this.A0L.setMinimumHeight(this.A0N.getMinimumHeight());
            }
            this.A0N.setVisibility(0);
            this.A0N.setChecked(this.A0c);
            Drawable drawable = this.A0J;
            if (drawable == null) {
                drawable = new ColorDrawable();
                this.A0J = drawable;
            }
            drawable.setBounds(0, 0, this.A0N.getMeasuredWidth(), 1);
            Drawable[] A1B = C07O.A1B(this.A0L);
            Drawable drawable2 = A1B[2];
            Drawable drawable3 = this.A0J;
            if (drawable2 != drawable3) {
                this.A0H = drawable2;
            }
            C07O.A0r(this.A0L, A1B[0], A1B[1], drawable3, A1B[3]);
            this.A0N.setPadding(this.A0L.getPaddingLeft(), this.A0L.getPaddingTop(), this.A0L.getPaddingRight(), this.A0L.getPaddingBottom());
            return;
        }
        CheckableImageButton checkableImageButton2 = this.A0N;
        if (checkableImageButton2 != null && checkableImageButton2.getVisibility() == 0) {
            this.A0N.setVisibility(8);
        }
        if (this.A0J == null) {
            return;
        }
        Drawable[] A1B2 = C07O.A1B(this.A0L);
        if (A1B2[2] != this.A0J) {
            return;
        }
        C07O.A0r(this.A0L, A1B2[0], A1B2[1], this.A0H, A1B2[3]);
        this.A0J = null;
    }

    public final void A0A() {
        Drawable background;
        if (this.A05 == 0 || this.A0K == null || this.A0L == null || getRight() == 0) {
            return;
        }
        int left = this.A0L.getLeft();
        EditText editText = this.A0L;
        int i = 0;
        if (editText != null) {
            int i2 = this.A05;
            if (i2 == 1) {
                i = editText.getTop();
            } else if (i2 == 2) {
                i = A01() + editText.getTop();
            }
        }
        int right = this.A0L.getRight();
        int bottom = this.A0L.getBottom() + this.A0e;
        if (this.A05 == 2) {
            int i3 = this.A0i;
            int i4 = i3 >> 1;
            left += i4;
            i -= i4;
            right -= i4;
            bottom += i3 / 2;
        }
        this.A0K.setBounds(left, i, right, bottom);
        A04();
        EditText editText2 = this.A0L;
        if (editText2 == null || (background = editText2.getBackground()) == null) {
            return;
        }
        if (C0YO.A03(background)) {
            background = background.mutate();
        }
        C1B2.A00(this, this.A0L, new Rect());
        Rect bounds = background.getBounds();
        if (bounds.left != bounds.right) {
            Rect rect = new Rect();
            background.getPadding(rect);
            background.setBounds(bounds.left - rect.left, bounds.top, (rect.right << 1) + bounds.right, this.A0L.getBottom());
        }
    }

    public void A0B(float f) {
        C1B1 c1b1 = this.A0r;
        if (c1b1.A0B == f) {
            return;
        }
        if (this.A0A == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.A0A = valueAnimator;
            valueAnimator.setInterpolator(C08580bj.A02);
            this.A0A.setDuration(167L);
            this.A0A.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.1BY
                {
                    TextInputLayout.this = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TextInputLayout.this.A0r.A08(((Number) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        }
        this.A0A.setFloatValues(c1b1.A0B, f);
        this.A0A.start();
    }

    public void A0C(int i) {
        boolean z = this.A0S;
        if (this.A08 == -1) {
            this.A0M.setText(String.valueOf(i));
            this.A0M.setContentDescription(null);
            this.A0S = false;
        } else {
            if (C0AT.A03(this.A0M) == 1) {
                C0AT.A0U(this.A0M, 0);
            }
            boolean z2 = i > this.A08;
            this.A0S = z2;
            if (z != z2) {
                A0D(this.A0M, z2 ? this.A0j : this.A0k);
                if (this.A0S) {
                    C0AT.A0U(this.A0M, 1);
                }
            }
            TextView textView = this.A0M;
            Context context = getContext();
            Integer valueOf = Integer.valueOf(i);
            textView.setText(context.getString(R.string.character_counter_pattern, valueOf, Integer.valueOf(this.A08)));
            this.A0M.setContentDescription(getContext().getString(R.string.character_counter_content_description, valueOf, Integer.valueOf(this.A08)));
        }
        if (this.A0L == null || z == this.A0S) {
            return;
        }
        A0F(false, false);
        A03();
        A02();
    }

    public void A0D(TextView textView, int i) {
        try {
            C07O.A0o(textView, i);
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
            C07O.A0o(textView, 2131952108);
            textView.setTextColor(C02160Ac.A00(getContext(), R.color.design_error));
        }
    }

    public void A0E(boolean z) {
        boolean z2;
        if (this.A0b) {
            int selectionEnd = this.A0L.getSelectionEnd();
            EditText editText = this.A0L;
            if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                this.A0L.setTransformationMethod(null);
                this.A0c = true;
                z2 = true;
            } else {
                this.A0L.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.A0c = false;
                z2 = false;
            }
            this.A0N.setChecked(z2);
            if (z) {
                this.A0N.jumpDrawablesToCurrentState();
            }
            this.A0L.setSelection(selectionEnd);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0013, code lost:
        if (android.text.TextUtils.isEmpty(r0.getText()) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x001f, code lost:
        if (r0.hasFocus() == false) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0F(boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0F(boolean, boolean):void");
    }

    public final boolean A0G() {
        return this.A0X && !TextUtils.isEmpty(this.A0O) && (this.A0K instanceof C1BT);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.A0q;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        A08();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.A0P != null && (editText = this.A0L) != null) {
            boolean z = this.A0a;
            this.A0a = false;
            CharSequence hint = editText.getHint();
            this.A0L.setHint(this.A0P);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.A0L.setHint(hint);
                this.A0a = z;
            }
        }
        super.dispatchProvideAutofillStructure(viewStructure, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.A0d = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.A0d = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        GradientDrawable gradientDrawable = this.A0K;
        if (gradientDrawable != null) {
            gradientDrawable.draw(canvas);
        }
        super.draw(canvas);
        if (this.A0X) {
            this.A0r.A0F(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        ColorStateList colorStateList;
        if (this.A0Z) {
            return;
        }
        boolean z = true;
        this.A0Z = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        A0F((C0AT.A0h(this) && isEnabled()) ? false : false, false);
        A02();
        A0A();
        A03();
        C1B1 c1b1 = this.A0r;
        if (c1b1 != null) {
            c1b1.A0c = drawableState;
            ColorStateList colorStateList2 = c1b1.A0P;
            boolean z2 = true;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = c1b1.A0Q) != null && colorStateList.isStateful())) {
                c1b1.A07();
            } else {
                z2 = false;
            }
            if (z2 | false) {
                invalidate();
            }
        }
        this.A0Z = false;
    }

    private Drawable getBoxBackground() {
        int i = this.A05;
        if (i != 1 && i != 2) {
            throw new IllegalStateException();
        }
        return this.A0K;
    }

    public int getBoxBackgroundColor() {
        return this.A04;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.A00;
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.A01;
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.A02;
    }

    public float getBoxCornerRadiusTopStart() {
        return this.A03;
    }

    public int getBoxStrokeColor() {
        return this.A09;
    }

    private float[] getCornerRadiiAsArray() {
        float[] fArr = new float[8];
        if (!(C0AT.A05(this) == 1)) {
            float f = this.A03;
            fArr[0] = f;
            fArr[1] = f;
            float f2 = this.A02;
            fArr[2] = f2;
            fArr[3] = f2;
            float f3 = this.A00;
            fArr[4] = f3;
            fArr[5] = f3;
            float f4 = this.A01;
            fArr[6] = f4;
            fArr[7] = f4;
            return fArr;
        }
        float f5 = this.A02;
        fArr[0] = f5;
        fArr[1] = f5;
        float f6 = this.A03;
        fArr[2] = f6;
        fArr[3] = f6;
        float f7 = this.A01;
        fArr[4] = f7;
        fArr[5] = f7;
        float f8 = this.A00;
        fArr[6] = f8;
        fArr[7] = f8;
        return fArr;
    }

    public int getCounterMaxLength() {
        return this.A08;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.A0R && this.A0S && (textView = this.A0M) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.A0B;
    }

    public EditText getEditText() {
        return this.A0L;
    }

    public CharSequence getError() {
        C1BV c1bv = this.A0s;
        if (c1bv.A0E) {
            return c1bv.A0C;
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        TextView textView = this.A0s.A0A;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int getErrorTextCurrentColor() {
        TextView textView = this.A0s.A0A;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHelperText() {
        C1BV c1bv = this.A0s;
        if (c1bv.A0F) {
            return c1bv.A0D;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.A0s.A0B;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.A0X) {
            return this.A0O;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.A0r.A03();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.A0r.A04();
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.A0Q;
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.A0I;
    }

    public Typeface getTypeface() {
        return this.A0F;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        EditText editText;
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (this.A0K != null) {
            A0A();
        }
        if (!this.A0X || (editText = this.A0L) == null) {
            return;
        }
        Rect rect = this.A0o;
        C1B2.A00(this, editText, rect);
        int compoundPaddingLeft = this.A0L.getCompoundPaddingLeft() + rect.left;
        int compoundPaddingRight = rect.right - this.A0L.getCompoundPaddingRight();
        int i6 = this.A05;
        if (i6 == 1) {
            i5 = getBoxBackground().getBounds().top + this.A0f;
        } else if (i6 != 2) {
            i5 = getPaddingTop();
        } else {
            i5 = getBoxBackground().getBounds().top - A01();
        }
        C1B1 c1b1 = this.A0r;
        int compoundPaddingTop = this.A0L.getCompoundPaddingTop() + rect.top;
        int compoundPaddingBottom = rect.bottom - this.A0L.getCompoundPaddingBottom();
        Rect rect2 = c1b1.A0e;
        if (!C1B1.A01(rect2, compoundPaddingLeft, compoundPaddingTop, compoundPaddingRight, compoundPaddingBottom)) {
            rect2.set(compoundPaddingLeft, compoundPaddingTop, compoundPaddingRight, compoundPaddingBottom);
            c1b1.A0Y = true;
            c1b1.A06();
        }
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        Rect rect3 = c1b1.A0d;
        if (!C1B1.A01(rect3, compoundPaddingLeft, i5, compoundPaddingRight, paddingBottom)) {
            rect3.set(compoundPaddingLeft, i5, compoundPaddingRight, paddingBottom);
            c1b1.A0Y = true;
            c1b1.A06();
        }
        c1b1.A07();
        if (!A0G() || this.A0Y) {
            return;
        }
        A07();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        A09();
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C32841ep)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C32841ep c32841ep = (C32841ep) parcelable;
        super.onRestoreInstanceState(((AbstractC13390lB) c32841ep).A00);
        setError(c32841ep.A00);
        if (c32841ep.A01) {
            A0E(true);
        }
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C32841ep c32841ep = new C32841ep(super.onSaveInstanceState());
        if (this.A0s.A07()) {
            c32841ep.A00 = getError();
        }
        c32841ep.A01 = this.A0c;
        return c32841ep;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.A04 != i) {
            this.A04 = i;
            A04();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C02160Ac.A00(getContext(), i));
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.A05) {
            return;
        }
        this.A05 = i;
        A06();
    }

    public void setBoxStrokeColor(int i) {
        if (this.A09 != i) {
            this.A09 = i;
            A03();
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.A0R != z) {
            if (z) {
                C02700Cn c02700Cn = new C02700Cn(getContext(), null);
                this.A0M = c02700Cn;
                c02700Cn.setId(R.id.textinput_counter);
                Typeface typeface = this.A0F;
                if (typeface != null) {
                    this.A0M.setTypeface(typeface);
                }
                this.A0M.setMaxLines(1);
                A0D(this.A0M, this.A0k);
                this.A0s.A04(this.A0M, 2);
                EditText editText = this.A0L;
                if (editText == null) {
                    A0C(0);
                } else {
                    A0C(editText.getText().length());
                }
            } else {
                this.A0s.A05(this.A0M, 2);
                this.A0M = null;
            }
            this.A0R = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.A08 != i) {
            if (i > 0) {
                this.A08 = i;
            } else {
                this.A08 = -1;
            }
            if (this.A0R) {
                EditText editText = this.A0L;
                A0C(editText == null ? 0 : editText.getText().length());
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.A0B = colorStateList;
        this.A0C = colorStateList;
        if (this.A0L != null) {
            A0F(false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1eo] */
    private void setEditText(EditText editText) {
        if (this.A0L == null) {
            if (!(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.A0L = editText;
            A06();
            setTextInputAccessibilityDelegate(new C0AS(this) { // from class: X.1eo
                public final TextInputLayout A00;

                {
                    this.A00 = this;
                }

                @Override // X.C0AS
                public void A03(View view, AccessibilityEvent accessibilityEvent) {
                    CharSequence charSequence;
                    this.A01.onPopulateAccessibilityEvent(view, accessibilityEvent);
                    TextInputLayout textInputLayout = this.A00;
                    EditText editText2 = textInputLayout.A0L;
                    if (editText2 != null) {
                        charSequence = editText2.getText();
                    } else {
                        charSequence = null;
                    }
                    if (TextUtils.isEmpty(charSequence)) {
                        charSequence = textInputLayout.getHint();
                    }
                    if (TextUtils.isEmpty(charSequence)) {
                        return;
                    }
                    accessibilityEvent.getText().add(charSequence);
                }

                /* JADX WARN: Code restructure failed: missing block: B:47:0x0035, code lost:
                    if (android.text.TextUtils.isEmpty(r12) == false) goto L37;
                 */
                @Override // X.C0AS
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void A04(android.view.View r14, X.C08420bS r15) {
                    /*
                        r13 = this;
                        android.view.View$AccessibilityDelegate r0 = r13.A01
                        android.view.accessibility.AccessibilityNodeInfo r6 = r15.A02
                        r0.onInitializeAccessibilityNodeInfo(r14, r6)
                        com.google.android.material.textfield.TextInputLayout r1 = r13.A00
                        android.widget.EditText r0 = r1.A0L
                        if (r0 == 0) goto L7f
                        android.text.Editable r2 = r0.getText()
                    L11:
                        java.lang.CharSequence r10 = r1.getHint()
                        java.lang.CharSequence r7 = r1.getError()
                        java.lang.CharSequence r12 = r1.getCounterOverflowDescription()
                        boolean r11 = android.text.TextUtils.isEmpty(r2)
                        r5 = 1
                        r11 = r11 ^ r5
                        boolean r1 = android.text.TextUtils.isEmpty(r10)
                        r1 = r1 ^ r5
                        boolean r9 = android.text.TextUtils.isEmpty(r7)
                        r9 = r9 ^ r5
                        r8 = 0
                        if (r9 != 0) goto L37
                        boolean r0 = android.text.TextUtils.isEmpty(r12)
                        r4 = 0
                        if (r0 != 0) goto L38
                    L37:
                        r4 = 1
                    L38:
                        if (r11 == 0) goto L79
                        r6.setText(r2)
                    L3d:
                        r3 = 19
                        if (r1 == 0) goto L54
                        int r0 = android.os.Build.VERSION.SDK_INT
                        r2 = 26
                        if (r0 < r2) goto L6d
                        r6.setHintText(r10)
                    L4a:
                        if (r11 != 0) goto L4d
                        r8 = 1
                    L4d:
                        int r0 = android.os.Build.VERSION.SDK_INT
                        if (r0 < r2) goto L68
                        r6.setShowingHintText(r8)
                    L54:
                        if (r4 == 0) goto L67
                        if (r9 != 0) goto L59
                        r7 = r12
                    L59:
                        int r1 = android.os.Build.VERSION.SDK_INT
                        r0 = 21
                        if (r1 < r0) goto L62
                        r6.setError(r7)
                    L62:
                        if (r1 < r3) goto L67
                        r6.setContentInvalid(r5)
                    L67:
                        return
                    L68:
                        r0 = 4
                        r15.A05(r0, r8)
                        goto L54
                    L6d:
                        if (r0 < r3) goto L4a
                        android.os.Bundle r1 = r6.getExtras()
                        java.lang.String r0 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY"
                        r1.putCharSequence(r0, r10)
                        goto L4a
                    L79:
                        if (r1 == 0) goto L3d
                        r6.setText(r10)
                        goto L3d
                    L7f:
                        r2 = 0
                        goto L11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C32831eo.A04(android.view.View, X.0bS):void");
                }
            });
            EditText editText2 = this.A0L;
            if (editText2 == null || !(editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                C1B1 c1b1 = this.A0r;
                Typeface typeface = this.A0L.getTypeface();
                c1b1.A0V = typeface;
                c1b1.A0T = typeface;
                c1b1.A07();
            }
            C1B1 c1b12 = this.A0r;
            float textSize = this.A0L.getTextSize();
            if (c1b12.A0F != textSize) {
                c1b12.A0F = textSize;
                c1b12.A07();
            }
            int gravity = this.A0L.getGravity();
            int i = (gravity & (-113)) | 48;
            if (c1b12.A0K != i) {
                c1b12.A0K = i;
                c1b12.A07();
            }
            if (c1b12.A0M != gravity) {
                c1b12.A0M = gravity;
                c1b12.A07();
            }
            this.A0L.addTextChangedListener(new TextWatcher() { // from class: X.1BW
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                {
                    TextInputLayout.this = this;
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    TextInputLayout textInputLayout = TextInputLayout.this;
                    textInputLayout.A0F(!textInputLayout.A0d, false);
                    if (textInputLayout.A0R) {
                        textInputLayout.A0C(editable.length());
                    }
                }
            });
            if (this.A0B == null) {
                this.A0B = this.A0L.getHintTextColors();
            }
            if (this.A0X) {
                if (TextUtils.isEmpty(this.A0O)) {
                    CharSequence hint = this.A0L.getHint();
                    this.A0P = hint;
                    setHint(hint);
                    this.A0L.setHint((CharSequence) null);
                }
                this.A0a = true;
            }
            if (this.A0M != null) {
                A0C(this.A0L.getText().length());
            }
            this.A0s.A01();
            A09();
            A0F(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) childAt;
                int childCount2 = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt2 = viewGroup.getChildAt(i2);
                    childAt2.setEnabled(z);
                    if (childAt2 instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) childAt2;
                        int childCount3 = viewGroup2.getChildCount();
                        for (int i3 = 0; i3 < childCount3; i3++) {
                            View childAt3 = viewGroup2.getChildAt(i3);
                            childAt3.setEnabled(z);
                            if (childAt3 instanceof ViewGroup) {
                                A00((ViewGroup) childAt3, z);
                            }
                        }
                    }
                }
            }
        }
        super.setEnabled(z);
    }

    public void setError(CharSequence charSequence) {
        C1BV c1bv = this.A0s;
        if (!c1bv.A0E) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (TextUtils.isEmpty(charSequence)) {
            c1bv.A02();
            return;
        }
        Animator animator = c1bv.A06;
        if (animator != null) {
            animator.cancel();
        }
        c1bv.A0C = charSequence;
        c1bv.A0A.setText(charSequence);
        int i = c1bv.A00;
        if (i != 1) {
            c1bv.A01 = 1;
        }
        c1bv.A03(i, c1bv.A01, c1bv.A08(c1bv.A0A, charSequence));
    }

    public void setErrorEnabled(boolean z) {
        C1BV c1bv = this.A0s;
        if (c1bv.A0E != z) {
            Animator animator = c1bv.A06;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                C02700Cn c02700Cn = new C02700Cn(c1bv.A0H, null);
                c1bv.A0A = c02700Cn;
                c02700Cn.setId(R.id.textinput_error);
                Typeface typeface = c1bv.A07;
                if (typeface != null) {
                    c1bv.A0A.setTypeface(typeface);
                }
                int i = c1bv.A03;
                c1bv.A03 = i;
                TextView textView = c1bv.A0A;
                if (textView != null) {
                    c1bv.A0I.A0D(textView, i);
                }
                c1bv.A0A.setVisibility(4);
                C0AT.A0U(c1bv.A0A, 1);
                c1bv.A04(c1bv.A0A, 0);
            } else {
                c1bv.A02();
                c1bv.A05(c1bv.A0A, 0);
                c1bv.A0A = null;
                TextInputLayout textInputLayout = c1bv.A0I;
                textInputLayout.A02();
                textInputLayout.A03();
            }
            c1bv.A0E = z;
        }
    }

    public void setErrorTextAppearance(int i) {
        C1BV c1bv = this.A0s;
        c1bv.A03 = i;
        TextView textView = c1bv.A0A;
        if (textView != null) {
            c1bv.A0I.A0D(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        TextView textView = this.A0s.A0A;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.A0s.A0F) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        C1BV c1bv = this.A0s;
        if (!c1bv.A0F) {
            setHelperTextEnabled(true);
        }
        Animator animator = c1bv.A06;
        if (animator != null) {
            animator.cancel();
        }
        c1bv.A0D = charSequence;
        c1bv.A0B.setText(charSequence);
        int i = c1bv.A00;
        if (i != 2) {
            c1bv.A01 = 2;
        }
        c1bv.A03(i, c1bv.A01, c1bv.A08(c1bv.A0B, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        TextView textView = this.A0s.A0B;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        C1BV c1bv = this.A0s;
        if (c1bv.A0F != z) {
            Animator animator = c1bv.A06;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                C02700Cn c02700Cn = new C02700Cn(c1bv.A0H, null);
                c1bv.A0B = c02700Cn;
                c02700Cn.setId(R.id.textinput_helper_text);
                Typeface typeface = c1bv.A07;
                if (typeface != null) {
                    c1bv.A0B.setTypeface(typeface);
                }
                c1bv.A0B.setVisibility(4);
                C0AT.A0U(c1bv.A0B, 1);
                int i = c1bv.A04;
                c1bv.A04 = i;
                TextView textView = c1bv.A0B;
                if (textView != null) {
                    C07O.A0o(textView, i);
                }
                c1bv.A04(c1bv.A0B, 1);
            } else {
                Animator animator2 = c1bv.A06;
                if (animator2 != null) {
                    animator2.cancel();
                }
                int i2 = c1bv.A00;
                if (i2 == 2) {
                    c1bv.A01 = 0;
                }
                c1bv.A03(i2, c1bv.A01, c1bv.A08(c1bv.A0B, null));
                c1bv.A05(c1bv.A0B, 1);
                c1bv.A0B = null;
                TextInputLayout textInputLayout = c1bv.A0I;
                textInputLayout.A02();
                textInputLayout.A03();
            }
            c1bv.A0F = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        C1BV c1bv = this.A0s;
        c1bv.A04 = i;
        TextView textView = c1bv.A0B;
        if (textView != null) {
            C07O.A0o(textView, i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.A0X) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.A0W = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.A0X) {
            this.A0X = z;
            if (!z) {
                this.A0a = false;
                if (!TextUtils.isEmpty(this.A0O) && TextUtils.isEmpty(this.A0L.getHint())) {
                    this.A0L.setHint(this.A0O);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.A0L.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.A0O)) {
                        setHint(hint);
                    }
                    this.A0L.setHint((CharSequence) null);
                }
                this.A0a = true;
            }
            if (this.A0L != null) {
                A08();
            }
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.A0O)) {
            return;
        }
        this.A0O = charSequence;
        this.A0r.A0G(charSequence);
        if (this.A0Y) {
            return;
        }
        A07();
    }

    public void setHintTextAppearance(int i) {
        C1B1 c1b1 = this.A0r;
        c1b1.A0C(i);
        this.A0C = c1b1.A0P;
        if (this.A0L != null) {
            A0F(false, false);
            A08();
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setPasswordVisibilityToggleContentDescription(charSequence);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.A0Q = charSequence;
        CheckableImageButton checkableImageButton = this.A0N;
        if (checkableImageButton != null) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setPasswordVisibilityToggleDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C09L.A01(getContext(), i);
        } else {
            drawable = null;
        }
        setPasswordVisibilityToggleDrawable(drawable);
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.A0I = drawable;
        CheckableImageButton checkableImageButton = this.A0N;
        if (checkableImageButton != null) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        EditText editText;
        if (this.A0b != z) {
            this.A0b = z;
            if (!z && this.A0c && (editText = this.A0L) != null) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.A0c = false;
            A09();
        }
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.A0D = colorStateList;
        this.A0T = true;
        A05();
    }

    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.A0E = mode;
        this.A0U = true;
        A05();
    }

    public void setTextInputAccessibilityDelegate(C32831eo c32831eo) {
        EditText editText = this.A0L;
        if (editText != null) {
            C0AT.A0c(editText, c32831eo);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.A0F) {
            this.A0F = typeface;
            C1B1 c1b1 = this.A0r;
            c1b1.A0V = typeface;
            c1b1.A0T = typeface;
            c1b1.A07();
            C1BV c1bv = this.A0s;
            if (typeface != c1bv.A07) {
                c1bv.A07 = typeface;
                TextView textView = c1bv.A0A;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = c1bv.A0B;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.A0M;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }
}
