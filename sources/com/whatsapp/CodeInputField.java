package com.whatsapp;

import X.AbstractC08160ao;
import X.AnonymousClass088;
import X.C002701i;
import X.C02E;
import X.C0AS;
import X.C0AT;
import X.C0LX;
import X.C26611Jx;
import X.C26631Jz;
import X.InterfaceC26591Jv;
import X.InterfaceC26601Jw;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import com.google.android.search.verification.client.R;
import com.whatsapp.CodeInputField;

/* loaded from: classes.dex */
public final class CodeInputField extends AbstractC08160ao {
    public static Typeface A08;
    public static Typeface A09;
    public char A00;
    public char A01;
    public int A02;
    public ValueAnimator A03;
    public Context A04;
    public C26631Jz A05;
    public C02E A06;
    public boolean A07;

    public CodeInputField(Context context, AttributeSet attributeSet) {
        new WaEditText(context, attributeSet) { // from class: X.0ao
            public boolean A00;

            {
                A00();
            }

            @Override // X.AbstractC04840Ma
            public void A00() {
                if (this.A00) {
                    return;
                }
                this.A00 = true;
                ((AbstractC07960aN) generatedComponent()).A05((CodeInputField) this);
            }
        };
        this.A04 = context;
    }

    public void A04() {
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        } else {
            final float x = getX();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(x, getResources().getDimensionPixelSize(R.dimen.error_wiggle_animation_offset) + x);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setRepeatCount(3);
            ofFloat.setRepeatMode(2);
            ofFloat.setDuration(50L);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.1Fm
                {
                    CodeInputField.this = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    CodeInputField.this.setX(((Number) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: X.1Ju
                {
                    CodeInputField.this = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    CodeInputField.this.setX(x);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    CodeInputField.this.setX(x);
                }
            });
            this.A03 = ofFloat;
        }
        this.A03.start();
        AnonymousClass088.A1g(this.A06);
    }

    public void A05(int i, InterfaceC26591Jv interfaceC26591Jv, final int i2) {
        InterfaceC26601Jw interfaceC26601Jw = new InterfaceC26601Jw() { // from class: X.1h4
            {
                CodeInputField.this = this;
            }

            @Override // X.InterfaceC26601Jw
            public final SpannableStringBuilder ADD(String str) {
                CodeInputField codeInputField = CodeInputField.this;
                int i3 = i2;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                for (int i4 = 0; i4 < spannableStringBuilder.length(); i4++) {
                    if (spannableStringBuilder.charAt(i4) == ')') {
                        int i5 = i4 + 1;
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.9f), i4, i5, 33);
                        spannableStringBuilder.setSpan(new C1K0(codeInputField.A04, i3 != 0 ? i3 : C02160Ac.A00(codeInputField.getContext(), R.color.accent_dark)), i4, i5, 33);
                    } else if (spannableStringBuilder.charAt(i4) != 160) {
                        spannableStringBuilder.setSpan(new C1K0(codeInputField.A04, i3 != 0 ? i3 : C02160Ac.A00(codeInputField.getContext(), R.color.accent_dark)), i4, i4 + 1, 33);
                    }
                }
                return spannableStringBuilder;
            }
        };
        setPasswordTransformationEnabled(true);
        setOnClickListener(new View.OnClickListener() { // from class: X.1Fk
            {
                CodeInputField.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CodeInputField codeInputField = CodeInputField.this;
                codeInputField.setSelection(codeInputField.getText().length());
            }
        });
        setCursorVisible(false);
        A07(interfaceC26591Jv, i, ')', '(', "pin_font", interfaceC26601Jw, null);
    }

    public void A06(InterfaceC26591Jv interfaceC26591Jv, int i) {
        A07(interfaceC26591Jv, i, (char) 8211, (char) 8226, null, new InterfaceC26601Jw() { // from class: X.1hk
            {
                CodeInputField.this = this;
            }

            @Override // X.InterfaceC26601Jw
            public final SpannableStringBuilder ADD(String str) {
                CodeInputField codeInputField = CodeInputField.this;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                    if (spannableStringBuilder.charAt(i2) == codeInputField.A01) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(C02160Ac.A00(codeInputField.getContext(), R.color.code_input_hint_color)), i2, i2 + 1, 33);
                    }
                }
                return spannableStringBuilder;
            }
        }, null);
    }

    public void A07(InterfaceC26591Jv interfaceC26591Jv, int i, char c, char c2, String str, InterfaceC26601Jw interfaceC26601Jw, final String str2) {
        this.A02 = i;
        this.A01 = c;
        this.A00 = c2;
        C26631Jz c26631Jz = new C26631Jz(interfaceC26591Jv, this, interfaceC26601Jw);
        this.A05 = c26631Jz;
        addTextChangedListener(c26631Jz);
        setCode("");
        if (TextUtils.equals(str, "pin_font")) {
            Typeface typeface = A08;
            if (typeface == null) {
                typeface = C002701i.A0B(getContext());
                A08 = typeface;
            }
            setTypeface(typeface);
        } else {
            Typeface typeface2 = A09;
            if (typeface2 == null) {
                typeface2 = Typeface.createFromAsset(getContext().getAssets(), "fonts/RobotoMono-Regular.ttf");
                A09 = typeface2;
            }
            setTypeface(typeface2);
        }
        C0LX.A03(this);
        if (str2 != null) {
            C0AT.A0c(this, new C0AS() { // from class: X.1hy
                @Override // X.C0AS
                public void A04(View view, C08420bS c08420bS) {
                    View.AccessibilityDelegate accessibilityDelegate = this.A01;
                    AccessibilityNodeInfo accessibilityNodeInfo = c08420bS.A02;
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    accessibilityNodeInfo.setClassName(C34711hy.class.getName());
                    accessibilityNodeInfo.setContentDescription(str2);
                }
            });
        }
    }

    public String getCode() {
        return getText().toString().replaceAll("[^0-9]", "");
    }

    public boolean getErrorState() {
        return this.A07;
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        int indexOf;
        if (i == i2 && (indexOf = getText().toString().indexOf(this.A01)) > -1 && i > indexOf) {
            setSelection(indexOf);
        }
        super.onSelectionChanged(i, i2);
    }

    public void setCode(String str) {
        StringBuilder sb = new StringBuilder(str);
        int length = str.length();
        while (true) {
            int i = this.A02;
            if (length < i + 1) {
                sb.append(this.A01);
                length++;
            } else {
                sb.insert(i >> 1, (char) 160);
                this.A05.A01 = true;
                setText(sb);
                setSelection(length + 1);
                this.A05.A01 = false;
                return;
            }
        }
    }

    public void setErrorState(boolean z) {
        if (this.A07 != z) {
            this.A07 = z;
            setCode("");
        }
    }

    public void setPasswordTransformationEnabled(boolean z) {
        setTransformationMethod(z ? new C26611Jx(this) : null);
    }

    public void setRegistrationVoiceCodeLength(int i) {
        this.A02 = i;
    }
}
