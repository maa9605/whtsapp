package com.whatsapp.conversation.conversationrow;

import X.AbstractC58882rr;
import X.C002301c;
import X.C018308n;
import X.C02160Ac;
import X.C02180Ae;
import X.C09H;
import X.C0We;
import X.C2JE;
import X.C2WV;
import X.C2WW;
import X.C38H;
import X.C3JX;
import X.C656938e;
import X.C657338i;
import X.C657438j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;

/* loaded from: classes2.dex */
public class ConversationRowImage$RowImageView extends C2WV {
    public Bitmap A00;
    public Drawable A01;
    public C09H A02;
    public AbstractC58882rr A03;
    public C002301c A04;
    public C2WW A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Matrix A0D;
    public final RectF A0E;
    public final RectF A0F;

    public ConversationRowImage$RowImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0F = new RectF();
        this.A0E = new RectF();
        this.A0D = new Matrix();
        A01();
        A02();
    }

    public final void A00() {
        RectF A03;
        if (this.A09) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            AbstractC58882rr abstractC58882rr = this.A03;
            if (!(abstractC58882rr instanceof C657438j)) {
                if (abstractC58882rr instanceof C657338i) {
                    A03 = abstractC58882rr.A03(measuredWidth, measuredHeight, C657338i.A00);
                } else if (!(abstractC58882rr instanceof C656938e)) {
                    A03 = null;
                } else {
                    C656938e c656938e = (C656938e) abstractC58882rr;
                    if (!(c656938e instanceof C3JX)) {
                        A03 = c656938e.A03(measuredWidth, measuredHeight, c656938e.A00);
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
                if (this.A03 != null) {
                    RectF rectF = new RectF(0.0f, 0.0f, measuredWidth, measuredHeight);
                    if (A03 != null) {
                        RectF rectF2 = this.A0E;
                        rectF2.set(A03);
                        RectF rectF3 = this.A0F;
                        rectF3.set(rectF);
                        Matrix matrix = this.A0D;
                        matrix.setRectToRect(rectF2, rectF3, Matrix.ScaleToFit.FILL);
                        setImageMatrix(matrix);
                        return;
                    }
                    return;
                }
                throw null;
            }
            throw new UnsupportedOperationException();
        } else if (this.A00 == null || this.A07) {
        } else {
            C09H c09h = this.A02;
            int i = c09h.A08;
            int i2 = c09h.A06;
            RectF rectF4 = this.A0E;
            float f = i;
            float f2 = i2;
            rectF4.set(0.0f, 0.0f, f, f2);
            if (i2 > i) {
                rectF4.bottom = f;
                int i3 = this.A02.A03;
                if (i3 <= 0) {
                    i3 = i2 / 3;
                }
                if (i3 > i / 3) {
                    float min = Math.min(f2, ((2.0f * f) / 3.0f) + i3);
                    rectF4.bottom = min;
                    float f3 = min - f;
                    rectF4.top = f3;
                    if (f3 < 0.0f) {
                        rectF4.top = 0.0f;
                        rectF4.bottom = f;
                    }
                }
            } else {
                int i4 = i2 * 24;
                if (i * 10 > i4) {
                    int i5 = i4 / 10;
                    rectF4.left = (i - i5) >> 1;
                    rectF4.right = (i + i5) >> 1;
                }
            }
            RectF rectF5 = this.A0F;
            rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Matrix matrix2 = this.A0D;
            matrix2.setRectToRect(rectF4, rectF5, Matrix.ScaleToFit.FILL);
            setImageMatrix(matrix2);
        }
    }

    public final void A01() {
        Drawable A0L;
        if (this.A05 == null) {
            return;
        }
        if (this.A0A) {
            if (this.A0B) {
                Context context = getContext();
                A0L = C02160Ac.A03(context, R.drawable.balloon_live_location_outgoing_frame);
                int A00 = C02160Ac.A00(context, R.color.bubbleOutgoingTint);
                if (A0L != null) {
                    if (A00 != 0) {
                        A0L = C02180Ae.A0Q(A0L, A00);
                    }
                } else {
                    throw null;
                }
            } else {
                A0L = C02180Ae.A0M(getContext());
            }
        } else if (this.A0B) {
            Context context2 = getContext();
            A0L = C02160Ac.A03(context2, R.drawable.balloon_live_location_incoming_frame);
            int A002 = C02160Ac.A00(context2, R.color.bubbleIncomingTint);
            if (A0L != null) {
                if (A002 != 0) {
                    A0L = C02180Ae.A0Q(A0L, A002);
                }
            } else {
                throw null;
            }
        } else {
            A0L = C02180Ae.A0L(getContext());
        }
        this.A01 = A0L;
    }

    public final void A02() {
        AbstractC58882rr c656938e;
        C09H c09h;
        int A01 = C2JE.A01(getContext());
        AbstractC58882rr abstractC58882rr = this.A03;
        C09H c09h2 = (abstractC58882rr == null || (c09h = abstractC58882rr.A00) == null) ? null : new C09H(c09h);
        if (this.A07) {
            c656938e = new C38H(A01, C018308n.A00(getContext()).getWindow().getDecorView().getHeight());
            this.A03 = c656938e;
        } else if (this.A0C) {
            c656938e = new C657338i(A01);
            this.A03 = c656938e;
        } else {
            c656938e = new C656938e(A01);
            this.A03 = c656938e;
        }
        if (c09h2 != null) {
            c656938e.A00 = c09h2;
        }
    }

    public void A03(int i, int i2) {
        C09H c09h = this.A02;
        c09h.A08 = i;
        c09h.A06 = i2;
        setImageData(c09h);
    }

    public int getRowWidth() {
        return this.A03.A02();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        super.onDraw(canvas);
        if (isInEditMode()) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        Context context = getContext();
        if (context != null) {
            C2WW c2ww = this.A05;
            if (c2ww != null) {
                if (this.A06) {
                    Drawable drawable2 = c2ww.A00;
                    if (drawable2 == null) {
                        drawable2 = new C0We(c2ww.A01, context.getResources().getDrawable(R.drawable.balloon_media_botshade));
                        c2ww.A00 = drawable2;
                    }
                    if (this.A04.A0M()) {
                        drawable2.setBounds(width - drawable2.getIntrinsicWidth(), height - drawable2.getIntrinsicHeight(), width, height);
                    } else {
                        drawable2.setBounds(paddingLeft, height - drawable2.getIntrinsicHeight(), drawable2.getIntrinsicWidth() + paddingLeft, height);
                    }
                    drawable2.draw(canvas);
                }
                if (this.A07 || (drawable = this.A01) == null) {
                    return;
                }
                drawable.setBounds(paddingLeft, paddingTop, width, height);
                this.A01.draw(canvas);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int A01;
        int i3;
        if (isInEditMode()) {
            setMeasuredDimension(800, 600);
        } else if (this.A09) {
            Pair A04 = this.A03.A04(i, i2);
            setMeasuredDimension(((Number) A04.first).intValue(), ((Number) A04.second).intValue());
        } else {
            C09H c09h = this.A02;
            int i4 = c09h.A08;
            int i5 = c09h.A06;
            if (this.A07) {
                View decorView = C018308n.A00(getContext()).getWindow().getDecorView();
                A01 = View.MeasureSpec.getSize(i);
                if (decorView.getHeight() > 0) {
                    i3 = Math.min(decorView.getHeight() << 1, (i5 * A01) / i4);
                } else {
                    i3 = (i5 * A01) / i4;
                }
            } else {
                A01 = (C2JE.A01(getContext()) * 72) / 100;
                if (View.MeasureSpec.getMode(i) != 0) {
                    A01 = Math.min(A01, View.MeasureSpec.getSize(i));
                }
                i3 = (i5 * A01) / i4;
                if (i3 > A01) {
                    i3 = A01;
                } else {
                    int i6 = A01 * 10;
                    if (i6 > i3 * 24) {
                        i3 = i6 / 24;
                    }
                }
            }
            if (View.MeasureSpec.getMode(i2) != 0) {
                i3 = Math.min(View.MeasureSpec.getSize(i2), i3);
            }
            if (this.A0C) {
                i3 = Math.min(i3, (A01 * 100) / 191);
            }
            setMeasuredDimension(A01, i3);
        }
    }

    public void setFullWidth(boolean z) {
        this.A07 = z;
        A02();
    }

    public void setHasLabels(boolean z) {
        this.A08 = z;
    }

    @Override // X.C0S5, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.A00 = bitmap;
        if (bitmap == null) {
            super.setImageDrawable(null);
        } else {
            super.setImageDrawable(new BitmapDrawable(getContext().getResources(), bitmap) { // from class: X.2rk
                {
                    ConversationRowImage$RowImageView.this = this;
                }

                @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
                public int getIntrinsicHeight() {
                    return ConversationRowImage$RowImageView.this.A02.A06;
                }

                @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
                public int getIntrinsicWidth() {
                    return ConversationRowImage$RowImageView.this.A02.A08;
                }
            });
        }
        A00();
    }

    public void setImageData(C09H c09h) {
        this.A02 = c09h;
        this.A03.A00 = new C09H(c09h);
    }

    public void setMediaPreviewV2Enabled(boolean z) {
        this.A09 = z;
    }

    public void setOutgoing(boolean z) {
        if (this.A0A != z) {
            this.A0A = z;
            A01();
        }
    }

    public void setPaddingOnTopOnly(boolean z) {
        if (z != this.A0B) {
            this.A0B = z;
            A01();
        }
    }

    public void setTemplateImageRatio(boolean z) {
        this.A0C = z;
        A02();
    }
}
