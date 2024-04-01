package X;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.0Y9  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Y9 {
    public final int A00;
    public final int A01;
    public final TextDirectionHeuristic A02;
    public final TextPaint A03;

    public C0Y9(PrecomputedText.Params params) {
        this.A03 = params.getTextPaint();
        this.A02 = params.getTextDirection();
        this.A00 = params.getBreakStrategy();
        this.A01 = params.getHyphenationFrequency();
    }

    public C0Y9(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.A03 = textPaint;
        this.A02 = textDirectionHeuristic;
        this.A00 = i;
        this.A01 = i2;
    }

    public boolean A00(C0Y9 c0y9) {
        if (Build.VERSION.SDK_INT < 23 || (this.A00 == c0y9.A00 && this.A01 == c0y9.A01)) {
            TextPaint textPaint = this.A03;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = c0y9.A03;
            if (textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX()) {
                if ((Build.VERSION.SDK_INT < 21 || (textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()))) && textPaint.getFlags() == textPaint2.getFlags()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 24) {
                        if (!textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
                            return false;
                        }
                    } else if (i >= 17 && !textPaint.getTextLocale().equals(textPaint2.getTextLocale())) {
                        return false;
                    }
                    return textPaint.getTypeface() == null ? textPaint2.getTypeface() == null : textPaint.getTypeface().equals(textPaint2.getTypeface());
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0Y9) {
            C0Y9 c0y9 = (C0Y9) obj;
            if (A00(c0y9)) {
                return Build.VERSION.SDK_INT < 18 || this.A02 == c0y9.A02;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            TextPaint textPaint = this.A03;
            return C07O.A0D(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.A02, Integer.valueOf(this.A00), Integer.valueOf(this.A01));
        } else if (i >= 21) {
            TextPaint textPaint2 = this.A03;
            return C07O.A0D(Float.valueOf(textPaint2.getTextSize()), Float.valueOf(textPaint2.getTextScaleX()), Float.valueOf(textPaint2.getTextSkewX()), Float.valueOf(textPaint2.getLetterSpacing()), Integer.valueOf(textPaint2.getFlags()), textPaint2.getTextLocale(), textPaint2.getTypeface(), Boolean.valueOf(textPaint2.isElegantTextHeight()), this.A02, Integer.valueOf(this.A00), Integer.valueOf(this.A01));
        } else if (i >= 18) {
            TextPaint textPaint3 = this.A03;
            return C07O.A0D(Float.valueOf(textPaint3.getTextSize()), Float.valueOf(textPaint3.getTextScaleX()), Float.valueOf(textPaint3.getTextSkewX()), Integer.valueOf(textPaint3.getFlags()), textPaint3.getTextLocale(), textPaint3.getTypeface(), this.A02, Integer.valueOf(this.A00), Integer.valueOf(this.A01));
        } else if (i >= 17) {
            TextPaint textPaint4 = this.A03;
            return C07O.A0D(Float.valueOf(textPaint4.getTextSize()), Float.valueOf(textPaint4.getTextScaleX()), Float.valueOf(textPaint4.getTextSkewX()), Integer.valueOf(textPaint4.getFlags()), textPaint4.getTextLocale(), textPaint4.getTypeface(), this.A02, Integer.valueOf(this.A00), Integer.valueOf(this.A01));
        } else {
            TextPaint textPaint5 = this.A03;
            return C07O.A0D(Float.valueOf(textPaint5.getTextSize()), Float.valueOf(textPaint5.getTextScaleX()), Float.valueOf(textPaint5.getTextSkewX()), Integer.valueOf(textPaint5.getFlags()), textPaint5.getTypeface(), this.A02, Integer.valueOf(this.A00), Integer.valueOf(this.A01));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder A0P = C000200d.A0P("textSize=");
        TextPaint textPaint = this.A03;
        A0P.append(textPaint.getTextSize());
        sb.append(A0P.toString());
        StringBuilder sb2 = new StringBuilder(", textScaleX=");
        sb2.append(textPaint.getTextScaleX());
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder(", textSkewX=");
        sb3.append(textPaint.getTextSkewX());
        sb.append(sb3.toString());
        if (Build.VERSION.SDK_INT >= 21) {
            StringBuilder A0P2 = C000200d.A0P(", letterSpacing=");
            A0P2.append(textPaint.getLetterSpacing());
            sb.append(A0P2.toString());
            StringBuilder sb4 = new StringBuilder(", elegantTextHeight=");
            sb4.append(textPaint.isElegantTextHeight());
            sb.append(sb4.toString());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            StringBuilder A0P3 = C000200d.A0P(", textLocale=");
            A0P3.append(textPaint.getTextLocales());
            sb.append(A0P3.toString());
        } else if (i >= 17) {
            StringBuilder A0P4 = C000200d.A0P(", textLocale=");
            A0P4.append(textPaint.getTextLocale());
            sb.append(A0P4.toString());
        }
        StringBuilder A0P5 = C000200d.A0P(", typeface=");
        A0P5.append(textPaint.getTypeface());
        sb.append(A0P5.toString());
        if (i >= 26) {
            StringBuilder A0P6 = C000200d.A0P(", variationSettings=");
            A0P6.append(textPaint.getFontVariationSettings());
            sb.append(A0P6.toString());
        }
        StringBuilder A0P7 = C000200d.A0P(", textDir=");
        A0P7.append(this.A02);
        sb.append(A0P7.toString());
        StringBuilder sb5 = new StringBuilder(", breakStrategy=");
        sb5.append(this.A00);
        sb.append(sb5.toString());
        StringBuilder sb6 = new StringBuilder(", hyphenationFrequency=");
        sb6.append(this.A01);
        sb.append(sb6.toString());
        sb.append("}");
        return sb.toString();
    }
}
