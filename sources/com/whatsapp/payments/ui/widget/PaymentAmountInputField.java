package com.whatsapp.payments.ui.widget;

import X.C000200d;
import X.C002301c;
import X.C018508q;
import X.C02160Ac;
import X.C02E;
import X.C0DJ;
import X.C2YG;
import X.C3SB;
import X.C42041uv;
import X.C4AA;
import X.C4AP;
import X.C4Jk;
import X.C69133Ng;
import X.InterfaceC013706o;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.widget.PaymentAmountInputField;
import java.util.HashSet;

/* loaded from: classes3.dex */
public class PaymentAmountInputField extends C4Jk {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public ValueAnimator A05;
    public ValueAnimator A06;
    public TextPaint A07;
    public View A08;
    public Animation A09;
    public TextView A0A;
    public C018508q A0B;
    public C02E A0C;
    public C002301c A0D;
    public C002301c A0E;
    public InterfaceC013706o A0F;
    public C4AA A0G;
    public C4AP A0H;
    public Runnable A0I;
    public String A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    public PaymentAmountInputField(Context context, AttributeSet attributeSet) {
        new C2YG(context, attributeSet) { // from class: X.4Jk
            public boolean A00;

            {
                A00();
            }

            @Override // X.C2YH, X.AbstractC08220ax, X.AbstractC04840Ma
            public void A00() {
                if (this.A00) {
                    return;
                }
                this.A00 = true;
                ((AbstractC07960aN) generatedComponent()).A2B((PaymentAmountInputField) this);
            }
        };
        this.A0I = new C3SB(this);
        boolean z = false;
        this.A0N = false;
        this.A0K = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C69133Ng.A1o);
            boolean z2 = obtainStyledAttributes.getBoolean(0, false);
            this.A0M = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
            z = z2;
        } else {
            this.A0M = false;
        }
        this.A0E = this.A0D;
        this.A0J = getText().toString();
        this.A02 = -1;
        this.A04 = getContext().getResources().getConfiguration().orientation;
        setInputType(2);
        A05();
        setFilterTouchesWhenObscured(true);
        setCursorVisible(true);
        setFocusable(true);
        setSingleLine(true);
        addTextChangedListener(this);
        setAutoScaleTextSize(z);
        this.A0N = true;
    }

    public static String A00(C002301c c002301c) {
        return (C42041uv.A05(c002301c).contains(",") ? "." : ",").equals(".") ? "\\." : ",";
    }

    public final float A04(String str, float f) {
        String str2;
        String str3;
        float f2 = 0.0f;
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        if (this.A07 == null) {
            TextPaint textPaint = new TextPaint();
            this.A07 = textPaint;
            textPaint.setTypeface(Typeface.DEFAULT);
        }
        int indexOf = TextUtils.indexOf(str, C42041uv.A05(this.A0E).charAt(0));
        if (indexOf > 0) {
            str2 = str.substring(0, indexOf);
            str3 = str.substring(indexOf);
        } else {
            str2 = str;
            str3 = "";
        }
        this.A07.setTextSize(f);
        float measureText = this.A07.measureText(str2);
        if (!TextUtils.isEmpty(str3)) {
            this.A07.setTextSize(f * 0.5f);
            f2 = this.A07.measureText(str3);
        }
        return measureText + f2;
    }

    public final void A05() {
        String str = "0123456789";
        if (this.A0K) {
            StringBuilder A0P = C000200d.A0P("0123456789");
            A0P.append(C42041uv.A05(this.A0E).charAt(0));
            str = A0P.toString();
        }
        setKeyListener(DigitsKeyListener.getInstance(str));
    }

    public /* synthetic */ void A06() {
        TextView textView = this.A0A;
        if (textView != null) {
            textView.startAnimation(this.A09);
        }
    }

    public /* synthetic */ void A07(ValueAnimator valueAnimator) {
        super.setTextSize(0, ((Number) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x007c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A08(java.lang.String r10) {
        /*
            r9 = this;
            float r8 = r9.getTextSize()
            boolean r0 = r9.A0N
            r5 = 2
            r7 = 0
            r4 = 1
            if (r0 == 0) goto L83
            int r0 = r9.A02
            if (r0 <= 0) goto L83
            r6 = 0
        L10:
            float r3 = r9.A00
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = (float) r6
            r0 = 1041865114(0x3e19999a, float:0.15)
            float r1 = r1 * r0
            float r2 = r2 - r1
            float r3 = r3 * r2
            float r2 = r9.A04(r10, r3)
            if (r6 != 0) goto L6b
            int r0 = r9.A02
            float r1 = (float) r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L78
        L2b:
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L6a
            android.animation.ValueAnimator r0 = r9.A06
            if (r0 == 0) goto L3e
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L3e
            android.animation.ValueAnimator r0 = r9.A06
            r0.cancel()
        L3e:
            float[] r0 = new float[r5]
            r0[r7] = r8
            r0[r4] = r3
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            r9.A06 = r2
            r1 = 1073741824(0x40000000, float:2.0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>(r1)
            r2.setInterpolator(r0)
            android.animation.ValueAnimator r2 = r9.A06
            r0 = 100
            r2.setDuration(r0)
            android.animation.ValueAnimator r1 = r9.A06
            X.3S9 r0 = new X.3S9
            r0.<init>()
            r1.addUpdateListener(r0)
            android.animation.ValueAnimator r0 = r9.A06
            r0.start()
        L6a:
            return
        L6b:
            if (r6 != r4) goto L78
            int r0 = r9.A02
            float r1 = (float) r0
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L78
            goto L2b
        L78:
            int r6 = r6 + 1
            if (r6 <= r5) goto L10
            float r0 = r9.A01
            float r3 = java.lang.Math.max(r3, r0)
            goto L2b
        L83:
            float r3 = r9.A00
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.widget.PaymentAmountInputField.A08(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x006c, code lost:
        if (r4 != false) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0067  */
    @Override // X.C2YG, android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void afterTextChanged(android.text.Editable r12) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.widget.PaymentAmountInputField.afterTextChanged(android.text.Editable):void");
    }

    @Override // X.C2YG
    public int getCursorColor() {
        return C02160Ac.A00(getContext(), R.color.primary_light);
    }

    @Override // X.C2YG
    public int getCursorVerticalPadding() {
        return getResources().getDimensionPixelSize(R.dimen.pay_amount_cursor_vertical_padding);
    }

    @Override // X.C2YG
    public int getCursorWidth() {
        return getResources().getDimensionPixelSize(R.dimen.pay_amount_cursor_width);
    }

    private ViewGroup getFirstNonWrapContentParent() {
        if (getParent() != null) {
            for (ViewGroup viewGroup = (ViewGroup) getParent(); viewGroup != null; viewGroup = (ViewGroup) viewGroup.getParent()) {
                if (viewGroup.getLayoutParams().width != -2) {
                    return viewGroup;
                }
            }
            return null;
        }
        return null;
    }

    public C002301c getWhatsAppLocale() {
        return this.A0E;
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        int i = configuration.orientation;
        if (i != this.A04) {
            this.A04 = i;
            this.A02 = -1;
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A0L && this.A02 == -1) {
            if (getLayoutParams().width == -2) {
                ViewGroup firstNonWrapContentParent = getFirstNonWrapContentParent();
                if (firstNonWrapContentParent == null) {
                    this.A02 = (Resources.getSystem().getDisplayMetrics().widthPixels - getCompoundPaddingLeft()) - getCompoundPaddingRight();
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) getParent();
                HashSet hashSet = new HashSet();
                int width = firstNonWrapContentParent.getWidth();
                while (!hashSet.contains(firstNonWrapContentParent)) {
                    for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                        View childAt = viewGroup.getChildAt(i5);
                        if (childAt != this && !hashSet.contains(childAt)) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                            width -= (childAt.getWidth() + marginLayoutParams.rightMargin) + marginLayoutParams.leftMargin;
                            hashSet.add(childAt);
                        }
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                    int paddingRight = viewGroup.getPaddingRight();
                    width -= viewGroup.getPaddingLeft() + (paddingRight + (marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin));
                    hashSet.add(viewGroup);
                    viewGroup = (ViewGroup) viewGroup.getParent();
                }
                this.A02 = width;
                return;
            }
            this.A02 = (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        Editable text = getText();
        if (!TextUtils.isEmpty(text) && (i != text.length() || i2 != text.length())) {
            setSelection(text.length(), text.length());
        } else {
            super.onSelectionChanged(i, i2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if ((i == 4 || i == 8) && this.A0A != null) {
            C018508q c018508q = this.A0B;
            c018508q.A02.removeCallbacks(this.A0I);
            this.A09.cancel();
            this.A09.reset();
            this.A0A.setVisibility(8);
        }
    }

    public void setAllowDecimal(boolean z) {
        this.A0K = z;
        A05();
    }

    public void setAutoScaleTextSize(boolean z) {
        this.A0L = z;
        if (z) {
            float textSize = getTextSize();
            this.A00 = textSize;
            this.A01 = textSize * 0.7f;
        }
    }

    public void setCurrency(InterfaceC013706o interfaceC013706o) {
        this.A0F = interfaceC013706o;
    }

    public void setErrorTextView(final TextView textView) {
        this.A0A = textView;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.A09 = alphaAnimation;
        alphaAnimation.setDuration(500L);
        this.A09.setAnimationListener(new C0DJ() { // from class: X.4FY
            @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                textView.setVisibility(8);
            }
        });
    }

    public void setFormatWithCommas(boolean z) {
        this.A0M = z;
    }

    public void setInputAmountType(int i) {
        this.A03 = i;
    }

    public void setInputAmountValidator(C4AP c4ap) {
        this.A0H = c4ap;
    }

    public void setOnAmountChangedLister(C4AA c4aa) {
        this.A0G = c4aa;
    }

    public void setPaymentAmountContainer(View view) {
        this.A08 = view;
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        super.setTextSize(f);
        if (this.A0L) {
            float textSize = getTextSize();
            this.A00 = textSize;
            this.A01 = textSize * 0.7f;
            A08(this.A0J);
        }
    }

    public void setWhatsAppLocale(C002301c c002301c) {
        this.A0E = c002301c;
    }
}
