package com.whatsapp;

import X.AbstractC02680Ck;
import X.AbstractC02790Cw;
import X.AbstractC54772jK;
import X.AnonymousClass029;
import X.C000200d;
import X.C002301c;
import X.C002701i;
import X.C02160Ac;
import X.C02770Cu;
import X.C02E;
import X.C02O;
import X.C09990f7;
import X.C0AT;
import X.C2RY;
import X.C40081rY;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.text.style.MetricAffectingSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.List;

/* loaded from: classes.dex */
public class TextEmojiLabel extends AbstractC02680Ck {
    public static boolean A0D;
    public static final Spannable.Factory A0E;
    public static final boolean A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Paint A04;
    public TextView.BufferType A05;
    public AbstractC02790Cw A06;
    public C02770Cu A07;
    public C02E A08;
    public C002301c A09;
    public C40081rY A0A;
    public C02O A0B;
    public CharSequence A0C;

    static {
        boolean z;
        try {
            Class cls = Integer.TYPE;
            Layout.class.getDeclaredMethod("processToSupportEmoji", CharSequence.class, cls, cls);
            z = true;
        } catch (NoSuchMethodException | SecurityException unused) {
            z = false;
        }
        A0D = z;
        A0F = Build.VERSION.SDK_INT < 19;
        A0E = new Spannable.Factory() { // from class: X.0f6
            @Override // android.text.Spannable.Factory
            public Spannable newSpannable(CharSequence charSequence) {
                return new C1LF(new SpannableString(charSequence));
            }
        };
    }

    public TextEmojiLabel(Context context) {
        super(context);
        if (A0F) {
            setSpannableFactory(A0E);
        }
        if (Build.VERSION.SDK_INT == 29) {
            setBreakStrategy(0);
        }
    }

    public TextEmojiLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (A0F) {
            setSpannableFactory(A0E);
        }
        if (Build.VERSION.SDK_INT == 29) {
            setBreakStrategy(0);
        }
    }

    public static final String A00(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length * 6);
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            sb.append("0x");
            sb.append(Integer.toHexString(charAt));
            sb.append(", ");
        }
        return sb.toString();
    }

    public void A02(int i) {
        Drawable A03 = C02160Ac.A03(getContext(), i);
        if (this.A09.A0N()) {
            setCompoundDrawablesWithIntrinsicBounds(A03, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, A03, (Drawable) null);
        }
        setCompoundDrawablePadding(getResources().getDimensionPixelSize(R.dimen.verified_indicator_padding));
    }

    public void A03(CharSequence charSequence) {
        A06(charSequence, null, false, 0);
    }

    public void A04(CharSequence charSequence, List list, AbstractC54772jK abstractC54772jK, boolean z, int i) {
        A05(charSequence, list, abstractC54772jK, z, i, false, 0);
    }

    public void A05(CharSequence charSequence, List list, AbstractC54772jK abstractC54772jK, boolean z, int i, boolean z2, int i2) {
        if (z) {
            C02E c02e = this.A08;
            if (z2) {
                charSequence = AnonymousClass029.A0R(c02e, this.A0B, charSequence, true, i2);
            } else {
                charSequence = AnonymousClass029.A0Q(c02e, this.A0B, charSequence);
            }
        }
        if (i > 0 && charSequence != null && charSequence.length() > i) {
            int charCount = (Character.charCount(Character.codePointAt(charSequence, i - 1)) - 1) + i;
            if (charSequence instanceof Editable) {
                charSequence = ((Editable) charSequence).delete(charCount, charSequence.length());
            } else {
                charSequence = TextUtils.substring(charSequence, 0, charCount);
            }
        }
        CharSequence A0d = C002701i.A0d(charSequence, getContext(), getPaint(), this.A0A);
        if (abstractC54772jK == null) {
            abstractC54772jK = AbstractC54772jK.A04;
        }
        setText(AbstractC54772jK.A03(getContext(), A0d, list, abstractC54772jK, this.A09));
    }

    public void A06(CharSequence charSequence, List list, boolean z, int i) {
        A04(charSequence, list, null, z, i);
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        AbstractC02790Cw abstractC02790Cw = this.A06;
        return (abstractC02790Cw != null && abstractC02790Cw.A0I(motionEvent)) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC02790Cw abstractC02790Cw = this.A06;
        return (abstractC02790Cw != null && abstractC02790Cw.A0H(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int lineStart;
        if (this.A03 > 0) {
            canvas.drawRect(getPaddingLeft() + getScrollX(), ((getHeight() - getPaddingBottom()) - this.A01) - this.A02, (getWidth() + getScrollX()) - getPaddingRight(), (getHeight() - getPaddingBottom()) - this.A01, this.A04);
            return;
        }
        try {
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException unused) {
            setText(getText());
        } catch (Exception e) {
            Log.e(e);
            StringBuilder sb = new StringBuilder("measuredwidth: ");
            sb.append(getMeasuredWidth());
            Log.e(sb.toString());
            CharSequence text = getText();
            StringBuilder A0P = C000200d.A0P("text: ");
            A0P.append(A00(text));
            Log.e(A0P.toString());
            Layout layout = getLayout();
            StringBuilder A0P2 = C000200d.A0P("line_count: ");
            A0P2.append(layout.getLineCount());
            Log.e(A0P2.toString());
            for (int i = 0; i < layout.getLineCount(); i++) {
                int lineStart2 = layout.getLineStart(i);
                if (i == layout.getLineCount() - 1) {
                    lineStart = text.length();
                } else {
                    lineStart = layout.getLineStart(i + 1);
                }
                if (lineStart2 <= lineStart) {
                    StringBuilder A0R = C000200d.A0R("line ", i, " (", lineStart2, "-");
                    A0R.append(lineStart);
                    A0R.append("): ");
                    A0R.append(A00(text.subSequence(lineStart2, lineStart)));
                    Log.e(A0R.toString());
                } else {
                    StringBuilder A0R2 = C000200d.A0R("line ", i, " (", lineStart2, "-");
                    A0R2.append(lineStart);
                    A0R2.append(")");
                    Log.e(A0R2.toString());
                }
            }
            throw new RuntimeException(e);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        AbstractC02790Cw abstractC02790Cw = this.A06;
        if (abstractC02790Cw != null) {
            int i2 = abstractC02790Cw.A01;
            if (i2 != Integer.MIN_VALUE) {
                abstractC02790Cw.A0D(i2);
            }
            if (z) {
                abstractC02790Cw.A0G(i, rect);
            }
        }
    }

    @Override // X.C02700Cn, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int size;
        CharSequence charSequence;
        int measuredWidth;
        if (this.A03 > 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size2 = View.MeasureSpec.getSize(i);
            super.onMeasure(i, i2);
            if (mode != 1073741824) {
                measuredWidth = (size2 * this.A03) / 100;
            } else {
                measuredWidth = getMeasuredWidth();
            }
            setMeasuredDimension(measuredWidth, getMeasuredHeight());
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 != 16 && i3 != 17) {
            super.onMeasure(i, i2);
        } else {
            try {
                super.onMeasure(i, i2);
            } catch (IndexOutOfBoundsException e) {
                Log.e("textemojilabel/measure ", e);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A0C);
                for (int nextSpanTransition = spannableStringBuilder.nextSpanTransition(0, spannableStringBuilder.length(), MetricAffectingSpan.class); nextSpanTransition >= 0 && nextSpanTransition < spannableStringBuilder.length(); nextSpanTransition = spannableStringBuilder.nextSpanTransition(nextSpanTransition + 1, spannableStringBuilder.length(), MetricAffectingSpan.class)) {
                    spannableStringBuilder.insert(nextSpanTransition, (CharSequence) " ");
                }
                try {
                    this.A0C = spannableStringBuilder;
                    super.setText(spannableStringBuilder);
                    super.onMeasure(i, i2);
                } catch (ArrayIndexOutOfBoundsException e2) {
                    Log.e("textemojilabel/measure1 ", e2);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.A0C);
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder2, '\n', 0);
                    while (indexOf >= 0) {
                        int i4 = indexOf + 1;
                        spannableStringBuilder2 = spannableStringBuilder2.replace(indexOf, i4, (CharSequence) " ");
                        indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder2, '\n', i4);
                    }
                    this.A0C = spannableStringBuilder2;
                    super.setText(spannableStringBuilder2);
                    super.onMeasure(i, i2);
                }
            }
        }
        if (View.MeasureSpec.getMode(i) == 0 || (size = (View.MeasureSpec.getSize(i) - getCompoundPaddingLeft()) - getCompoundPaddingRight()) <= 0 || this.A00 == size || !(this.A0C instanceof Spanned) || getEllipsize() == null || !(getTransformationMethod() instanceof SingleLineTransformationMethod)) {
            return;
        }
        this.A00 = size;
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(this.A0C, this);
        } else {
            charSequence = this.A0C;
        }
        CharSequence ellipsize = TextUtils.ellipsize(charSequence, getPaint(), size, getEllipsize());
        if (ellipsize == null || ellipsize.equals(charSequence)) {
            return;
        }
        super.setText(ellipsize, this.A05);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.A07 != null) {
            CharSequence text = getText();
            return (!(text instanceof Spannable) || getLayout() == null) ? onTouchEvent : onTouchEvent | this.A07.onTouchEvent(this, (Spannable) text, motionEvent);
        }
        return onTouchEvent;
    }

    public void setAccessibilityHelper(AbstractC02790Cw abstractC02790Cw) {
        this.A06 = abstractC02790Cw;
        C0AT.A0c(this, abstractC02790Cw);
    }

    public void setLinkHandler(C02770Cu c02770Cu) {
        this.A07 = c02770Cu;
    }

    public void setPlaceholder(int i) {
        if (this.A03 == i) {
            return;
        }
        this.A03 = i;
        if (i > 0) {
            Paint.FontMetricsInt A00 = C2RY.A00(getPaint());
            this.A02 = ((-A00.ascent) * 6) / 10;
            this.A01 = A00.bottom;
            Paint paint = this.A04;
            if (paint == null) {
                paint = new Paint();
                this.A04 = paint;
            }
            paint.setColor(C09990f7.A03(getPaint().getColor(), (Color.alpha(getPaint().getColor()) * 12) / 255));
        }
        invalidate();
    }

    @Override // com.whatsapp.WaTextView, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (A0D && charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            for (int i = 0; i < charSequence.length(); i++) {
                char charAt = charSequence.charAt(i);
                if (55296 <= charAt && charAt <= 57343) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    }
                    spannableStringBuilder.replace(i, i + 1, (CharSequence) "□");
                }
            }
            if (spannableStringBuilder != null) {
                charSequence = spannableStringBuilder;
            }
        }
        this.A0C = charSequence;
        this.A05 = bufferType;
        this.A00 = 0;
        if (charSequence != null && charSequence.length() >= 3000) {
            charSequence.length();
        }
        if ((A0F || this.A07 != null) && (charSequence instanceof Spanned)) {
            super.setText(charSequence, TextView.BufferType.SPANNABLE);
        } else {
            super.setText(charSequence, bufferType);
        }
    }
}
