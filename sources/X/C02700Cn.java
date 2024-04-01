package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: X.0Cn */
/* loaded from: classes.dex */
public class C02700Cn extends TextView implements InterfaceC02710Co, InterfaceC02720Cp, InterfaceC02730Cq {
    public Future A00;
    public final C07980aP A01;
    public final C08000aR A02;
    public final C07990aQ A03;

    public C02700Cn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C02700Cn(Context context, AttributeSet attributeSet, int i) {
        super(C07970aO.A00(context), attributeSet, i);
        C07980aP c07980aP = new C07980aP(this);
        this.A01 = c07980aP;
        c07980aP.A08(attributeSet, i);
        C07990aQ c07990aQ = new C07990aQ(this);
        this.A03 = c07990aQ;
        c07990aQ.A07(attributeSet, i);
        this.A03.A01();
        this.A02 = new C08000aR(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C07980aP c07980aP = this.A01;
        if (c07980aP != null) {
            c07980aP.A02();
        }
        C07990aQ c07990aQ = this.A03;
        if (c07990aQ != null) {
            c07990aQ.A01();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC02730Cq.A00) {
            return super.getAutoSizeMaxTextSize();
        }
        C07990aQ c07990aQ = this.A03;
        if (c07990aQ != null) {
            return Math.round(c07990aQ.A0C.A00);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC02730Cq.A00) {
            return super.getAutoSizeMinTextSize();
        }
        C07990aQ c07990aQ = this.A03;
        if (c07990aQ != null) {
            return Math.round(c07990aQ.A0C.A01);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC02730Cq.A00) {
            return super.getAutoSizeStepGranularity();
        }
        C07990aQ c07990aQ = this.A03;
        if (c07990aQ != null) {
            return Math.round(c07990aQ.A0C.A02);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC02730Cq.A00) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C07990aQ c07990aQ = this.A03;
        return c07990aQ != null ? c07990aQ.A0C.A07 : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (InterfaceC02730Cq.A00) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C07990aQ c07990aQ = this.A03;
        if (c07990aQ != null) {
            return c07990aQ.A0C.A03;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // X.InterfaceC02710Co
    public ColorStateList getSupportBackgroundTintList() {
        C07980aP c07980aP = this.A01;
        if (c07980aP != null) {
            return c07980aP.A00();
        }
        return null;
    }

    @Override // X.InterfaceC02710Co
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C07980aP c07980aP = this.A01;
        if (c07980aP != null) {
            return c07980aP.A01();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C08020aT c08020aT = this.A03.A08;
        if (c08020aT != null) {
            return c08020aT.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C08020aT c08020aT = this.A03.A08;
        if (c08020aT != null) {
            return c08020aT.A01;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.A00;
        if (future != null) {
            try {
                this.A00 = null;
                future.get();
                C07O.A0s(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C08000aR c08000aR;
        if (Build.VERSION.SDK_INT < 28 && (c08000aR = this.A02) != null) {
            TextClassifier textClassifier = c08000aR.A00;
            if (textClassifier == null) {
                TextClassificationManager textClassificationManager = (TextClassificationManager) c08000aR.A01.getContext().getSystemService(TextClassificationManager.class);
                if (textClassificationManager != null) {
                    return textClassificationManager.getTextClassifier();
                }
                return TextClassifier.NO_OP;
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public C0Y9 getTextMetricsParamsCompat() {
        return C07O.A0N(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C07O.A0f(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C07990aQ c07990aQ = this.A03;
        if (c07990aQ == null || InterfaceC02730Cq.A00) {
            return;
        }
        c07990aQ.A0C.A03();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.A00;
        if (future != null) {
            try {
                this.A00 = null;
                future.get();
                C07O.A0s(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C07990aQ c07990aQ = this.A03;
        if (c07990aQ == null || InterfaceC02730Cq.A00 || !c07990aQ.A09()) {
            return;
        }
        c07990aQ.A0C.A03();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (InterfaceC02730Cq.A00) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C07990aQ c07990aQ = this.A03;
        if (c07990aQ == null) {
            return;
        }
        c07990aQ.A03(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (InterfaceC02730Cq.A00) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C07990aQ c07990aQ = this.A03;
        if (c07990aQ == null) {
            return;
        }
        c07990aQ.A08(iArr, i);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (InterfaceC02730Cq.A00) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C07990aQ c07990aQ = this.A03;
        if (c07990aQ == null) {
            return;
        }
        c07990aQ.A02(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C07980aP c07980aP = this.A01;
        if (c07980aP != null) {
            c07980aP.A03();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C07980aP c07980aP = this.A01;
        if (c07980aP != null) {
            c07980aP.A04(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C07990aQ c07990aQ = this.A03;
        if (c07990aQ != null) {
            c07990aQ.A01();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C07990aQ c07990aQ = this.A03;
        if (c07990aQ != null) {
            c07990aQ.A01();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        if (i != 0) {
            drawable = C09L.A01(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = C09L.A01(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = C09L.A01(context, i3);
        } else {
            drawable3 = null;
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, i4 != 0 ? C09L.A01(context, i4) : null);
        C07990aQ c07990aQ = this.A03;
        if (c07990aQ != null) {
            c07990aQ.A01();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C07990aQ c07990aQ = this.A03;
        if (c07990aQ != null) {
            c07990aQ.A01();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        if (i != 0) {
            drawable = C09L.A01(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = C09L.A01(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = C09L.A01(context, i3);
        } else {
            drawable3 = null;
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, i4 != 0 ? C09L.A01(context, i4) : null);
        C07990aQ c07990aQ = this.A03;
        if (c07990aQ != null) {
            c07990aQ.A01();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C07990aQ c07990aQ = this.A03;
        if (c07990aQ != null) {
            c07990aQ.A01();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C07O.A0K(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C07O.A0l(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C07O.A0m(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        C07O.A0n(this, i);
    }

    public void setPrecomputedText(C0YC c0yc) {
        C07O.A0s(this, c0yc);
    }

    @Override // X.InterfaceC02710Co
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C07980aP c07980aP = this.A01;
        if (c07980aP != null) {
            c07980aP.A06(colorStateList);
        }
    }

    @Override // X.InterfaceC02710Co
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C07980aP c07980aP = this.A01;
        if (c07980aP != null) {
            c07980aP.A07(mode);
        }
    }

    @Override // X.InterfaceC02720Cp
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C07990aQ c07990aQ = this.A03;
        C08020aT c08020aT = c07990aQ.A08;
        if (c08020aT == null) {
            c08020aT = new C08020aT();
            c07990aQ.A08 = c08020aT;
        }
        c08020aT.A00 = colorStateList;
        c08020aT.A02 = colorStateList != null;
        c07990aQ.A05 = c08020aT;
        c07990aQ.A09 = c08020aT;
        c07990aQ.A06 = c08020aT;
        c07990aQ.A03 = c08020aT;
        c07990aQ.A07 = c08020aT;
        c07990aQ.A04 = c08020aT;
        c07990aQ.A01();
    }

    @Override // X.InterfaceC02720Cp
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C07990aQ c07990aQ = this.A03;
        C08020aT c08020aT = c07990aQ.A08;
        if (c08020aT == null) {
            c08020aT = new C08020aT();
            c07990aQ.A08 = c08020aT;
        }
        c08020aT.A01 = mode;
        c08020aT.A03 = mode != null;
        c07990aQ.A05 = c08020aT;
        c07990aQ.A09 = c08020aT;
        c07990aQ.A06 = c08020aT;
        c07990aQ.A03 = c08020aT;
        c07990aQ.A07 = c08020aT;
        c07990aQ.A04 = c08020aT;
        c07990aQ.A01();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C07990aQ c07990aQ = this.A03;
        if (c07990aQ != null) {
            c07990aQ.A04(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C08000aR c08000aR;
        if (Build.VERSION.SDK_INT < 28 && (c08000aR = this.A02) != null) {
            c08000aR.A00 = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future future) {
        this.A00 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0Y9 c0y9) {
        TextDirectionHeuristic textDirectionHeuristic;
        if (Build.VERSION.SDK_INT >= 18) {
            TextDirectionHeuristic textDirectionHeuristic2 = c0y9.A02;
            TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
            int i = 1;
            if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
                if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                    i = 2;
                } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                    i = 3;
                } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                    i = 4;
                } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                    i = 5;
                } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                    i = 6;
                } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                    i = 7;
                }
            }
            setTextDirection(i);
        }
        if (Build.VERSION.SDK_INT < 23) {
            TextPaint textPaint = c0y9.A03;
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(c0y9.A03);
        setBreakStrategy(c0y9.A00);
        setHyphenationFrequency(c0y9.A01);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (InterfaceC02730Cq.A00) {
            super.setTextSize(i, f);
            return;
        }
        C07990aQ c07990aQ = this.A03;
        if (c07990aQ == null || c07990aQ.A09()) {
            return;
        }
        c07990aQ.A0C.A05(i, f);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface A00;
        if (typeface != null && i > 0 && (A00 = C0X2.A00(getContext(), typeface, i)) != null) {
            typeface = A00;
        }
        super.setTypeface(typeface, i);
    }
}
