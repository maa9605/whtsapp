package com.facebook.rendercore.text;

import X.C07140Wz;
import X.C0AS;
import X.C0AT;
import X.C39151pf;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class RCTextView extends View {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ColorStateList A05;
    public Paint A06;
    public Path A07;
    public Layout A08;
    public CharSequence A09;
    public boolean A0A;
    public ClickableSpan[] A0B;
    public ImageSpan[] A0C;
    public final C39151pf A0D;

    public RCTextView(Context context) {
        super(context);
        if (getImportantForAccessibility() == 0) {
            C39151pf c39151pf = new C39151pf(this);
            this.A0D = c39151pf;
            C0AT.A0c(this, c39151pf);
            return;
        }
        this.A0D = null;
    }

    public final int A00(int i, int i2) {
        float paragraphLeft;
        float lineMax;
        int lineForVertical = this.A08.getLineForVertical(i2);
        if (this.A08.getAlignment() == Layout.Alignment.ALIGN_CENTER) {
            paragraphLeft = this.A08.getLineLeft(lineForVertical);
            lineMax = this.A08.getLineRight(lineForVertical);
        } else {
            boolean z = this.A08.getParagraphDirection(lineForVertical) == -1;
            Layout layout = this.A08;
            if (z) {
                paragraphLeft = layout.getWidth() - this.A08.getLineMax(lineForVertical);
                lineMax = this.A08.getParagraphRight(lineForVertical);
            } else {
                paragraphLeft = layout.getParagraphLeft(lineForVertical);
                lineMax = this.A08.getLineMax(lineForVertical);
            }
        }
        float f = i;
        if (f >= paragraphLeft && f <= lineMax) {
            try {
                return this.A08.getOffsetForHorizontal(lineForVertical, f);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return -1;
    }

    public final void A01(int i, int i2) {
        if (Color.alpha(this.A01) != 0) {
            if (this.A04 == i && this.A03 == i2) {
                return;
            }
            this.A04 = i;
            this.A03 = i2;
            Paint paint = this.A06;
            if (paint == null) {
                paint = new Paint();
                this.A06 = paint;
            }
            paint.setColor(this.A01);
            this.A0A = true;
            invalidate();
        }
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.A0D.A0I(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int save;
        boolean z;
        super.draw(canvas);
        if (this.A08 == null) {
            return;
        }
        if (this.A00 == 0.0f && getPaddingTop() == 0 && getPaddingLeft() == 0) {
            save = 0;
            z = false;
        } else {
            save = canvas.save();
            canvas.translate(0.0f, this.A00);
            canvas.translate(getPaddingLeft(), getPaddingTop());
            z = true;
        }
        this.A08.draw(canvas, getSelectionPath(), this.A06, 0);
        if (z) {
            canvas.restoreToCount(save);
        }
    }

    private Path getSelectionPath() {
        if (this.A04 == this.A03 || Color.alpha(this.A01) == 0) {
            return null;
        }
        if (this.A0A) {
            Path path = this.A07;
            if (path == null) {
                path = new Path();
                this.A07 = path;
            }
            this.A08.getSelectionPath(this.A04, this.A03, path);
            this.A0A = false;
        }
        return this.A07;
    }

    public CharSequence getText() {
        return this.A09;
    }

    public static CharSequence getTextForAccessibility(RCTextView rCTextView) {
        CharSequence charSequence = rCTextView.A09;
        if (charSequence != null && charSequence.length() >= 1000000) {
            if (Character.isHighSurrogate(rCTextView.A09.charAt(999999)) && Character.isLowSurrogate(rCTextView.A09.charAt(1000000))) {
                return rCTextView.A09.subSequence(0, 999999);
            }
            return rCTextView.A09.subSequence(0, 1000000);
        }
        return rCTextView.A09;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ClickableSpan[] clickableSpanArr;
        ClickableSpan clickableSpan;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            A01(0, 0);
            return false;
        }
        int A00 = A00((int) motionEvent.getX(), (int) motionEvent.getY());
        CharSequence charSequence = this.A09;
        if ((charSequence instanceof Spanned) && A00 >= 0 && (clickableSpanArr = (ClickableSpan[]) ((Spanned) charSequence).getSpans(A00, A00, ClickableSpan.class)) != null && clickableSpanArr.length > 0 && (clickableSpan = clickableSpanArr[0]) != null) {
            if (actionMasked == 1) {
                A01(0, 0);
                clickableSpan.onClick(this);
            } else if (actionMasked == 0) {
                setSelection(clickableSpan);
                return true;
            }
            return true;
        }
        A01(0, 0);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        C0AS c0as;
        super.setAccessibilityDelegate(accessibilityDelegate);
        View.AccessibilityDelegate A0C = C0AT.A0C(this);
        if (A0C == null) {
            c0as = null;
        } else if (A0C instanceof C07140Wz) {
            c0as = ((C07140Wz) A0C).A00;
        } else {
            c0as = new C0AS(A0C);
        }
        C39151pf c39151pf = this.A0D;
        if (c39151pf == null || c0as == c39151pf) {
            return;
        }
        c39151pf.A00 = c0as;
        C0AT.A0c(this, c39151pf);
    }

    private void setSelection(ClickableSpan clickableSpan) {
        Spanned spanned = (Spanned) this.A09;
        A01(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }
}
