package com.whatsapp.conversation.conversationrow;

import X.AbstractC58882rr;
import X.C09H;
import X.C2JE;
import X.C38H;
import X.C3Jc;
import X.C656938e;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class ConversationRowVideo$RowVideoView extends C3Jc {
    public int A00;
    public int A01;
    public Paint A02;
    public RectF A03;
    public Shader A04;
    public Drawable A05;
    public AbstractC58882rr A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    public ConversationRowVideo$RowVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = new Paint(1);
        this.A03 = new RectF();
        A00();
    }

    public final void A00() {
        AbstractC58882rr abstractC58882rr;
        C09H c09h;
        final int A01 = C2JE.A01(getContext());
        AbstractC58882rr abstractC58882rr2 = this.A06;
        C09H c09h2 = (abstractC58882rr2 == null || (c09h = abstractC58882rr2.A00) == null) ? null : new C09H(c09h);
        if (this.A07 && this.A08) {
            abstractC58882rr = new C38H(A01) { // from class: X.3JT
            };
            this.A06 = abstractC58882rr;
        } else if (this.A08) {
            abstractC58882rr = new AbstractC58882rr(A01) { // from class: X.38j
            };
            this.A06 = abstractC58882rr;
        } else {
            abstractC58882rr = new C656938e(A01) { // from class: X.3JX
            };
            this.A06 = abstractC58882rr;
        }
        if (c09h2 != null) {
            abstractC58882rr.A00 = c09h2;
        }
    }

    public void A01(int i, int i2, boolean z) {
        int i3;
        int i4 = this.A01;
        if (i4 <= 0 || (i3 = this.A00) <= 0 || z) {
            hashCode();
            this.A01 = i;
            i4 = i;
            this.A00 = i2;
            i3 = i2;
        }
        C09H c09h = new C09H();
        c09h.A08 = i4;
        c09h.A06 = i3;
        this.A06.A00 = c09h;
    }

    public int getRowWidth() {
        return this.A06.A02();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode()) {
            return;
        }
        float dimension = getResources().getDimension(R.dimen.conversation_row_video_bottom_padding);
        int width = getWidth();
        this.A02.setColor(1711276032);
        this.A02.setShader(this.A04);
        this.A02.setStyle(Paint.Style.FILL);
        this.A03.set(0.0f, getHeight() - ((dimension * 4.0f) / 3.0f), width, getHeight());
        canvas.drawRect(this.A03, this.A02);
        Drawable drawable = this.A05;
        if (drawable == null || this.A07) {
            return;
        }
        if (this.A09) {
            AbstractC58882rr abstractC58882rr = this.A06;
            int width2 = getWidth();
            int height = getHeight();
            if (abstractC58882rr != null) {
                RectF rectF = new RectF(0.0f, 0.0f, width2, height);
                this.A05.setBounds(new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom)));
            } else {
                throw null;
            }
        } else {
            drawable.setBounds(0, 0, getWidth(), getHeight());
        }
        this.A05.draw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int A01;
        int i3;
        AbstractC58882rr abstractC58882rr;
        if (isInEditMode()) {
            if (this.A08) {
                super.onMeasure(i, i2);
            } else {
                setMeasuredDimension(600, 600);
            }
        } else if (this.A09) {
            if (getDrawable() != null && !(getDrawable() instanceof ColorDrawable)) {
                int intrinsicWidth = getDrawable().getIntrinsicWidth();
                int intrinsicHeight = getDrawable().getIntrinsicHeight();
                C09H c09h = new C09H();
                c09h.A08 = intrinsicWidth;
                c09h.A06 = intrinsicHeight;
                abstractC58882rr = this.A06;
                abstractC58882rr.A00 = c09h;
            } else {
                int i4 = this.A01;
                int i5 = this.A00;
                C09H c09h2 = new C09H();
                c09h2.A08 = i4;
                c09h2.A06 = i5;
                abstractC58882rr = this.A06;
                abstractC58882rr.A00 = c09h2;
            }
            Pair A04 = abstractC58882rr.A04(i, i2);
            setMeasuredDimension(((Number) A04.first).intValue(), ((Number) A04.second).intValue());
        } else {
            if (this.A07) {
                A01 = View.MeasureSpec.getSize(i);
            } else {
                A01 = (C2JE.A01(getContext()) * 72) / 100;
            }
            if (View.MeasureSpec.getMode(i) != 0) {
                A01 = Math.min(A01, View.MeasureSpec.getSize(i));
            }
            if (this.A08) {
                if (getDrawable() != null && !(getDrawable() instanceof ColorDrawable)) {
                    A01(getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight(), false);
                }
                i3 = (int) ((A01 / this.A01) * this.A00);
            } else {
                i3 = A01;
            }
            if (View.MeasureSpec.getMode(i2) != 0) {
                i3 = Math.min(View.MeasureSpec.getSize(i2), i3);
            }
            hashCode();
            setMeasuredDimension(A01, i3);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (isInEditMode()) {
            return;
        }
        float f = i2;
        this.A04 = new LinearGradient(0.0f, f - ((getResources().getDimension(R.dimen.conversation_row_video_bottom_padding) * 4.0f) / 3.0f), 0.0f, f, 0, -16777216, Shader.TileMode.CLAMP);
    }

    public void setFrameDrawable(Drawable drawable) {
        this.A05 = drawable;
    }

    public void setFullWidth(boolean z) {
        this.A07 = z;
        A00();
    }

    public void setKeepRatio(boolean z) {
        this.A08 = z;
        A00();
    }

    public void setMediaPreviewV2Enabled(boolean z) {
        this.A09 = z;
    }
}
