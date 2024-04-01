package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.whatsapp.TextData;

/* renamed from: X.3ZG  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3ZG extends Drawable {
    public static final C3ZF A08;
    public float A00;
    public int A01;
    public int A02;
    public Layout A03;
    public final Paint A04 = new Paint(1);
    public final Typeface A05;
    public final TextData A06;
    public final CharSequence A07;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            A08 = new C3ZF() { // from class: X.3s8
                @Override // X.C3ZF
                public Layout A6p(CharSequence charSequence, TextPaint textPaint, int i) {
                    return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setAlignment(Layout.Alignment.ALIGN_CENTER).setBreakStrategy(1).build();
                }
            };
        } else {
            A08 = new C3ZF() { // from class: X.3s9
                @Override // X.C3ZF
                public Layout A6p(CharSequence charSequence, TextPaint textPaint, int i) {
                    return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
                }
            };
        }
    }

    public C3ZG(Context context, C40081rY c40081rY, C02E c02e, C02O c02o, String str, TextData textData, Typeface typeface) {
        this.A07 = AnonymousClass024.A09(AnonymousClass029.A0Q(c02e, c02o, C002701i.A0g(str, context, c40081rY)));
        this.A06 = textData;
        this.A05 = typeface;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Paint paint = this.A04;
        TextData textData = this.A06;
        paint.setColor((textData == null || (r0 = textData.backgroundColor) == 0) ? 1711276032 : 1711276032);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), (bounds.width() >> 1) - this.A00, paint);
        if (this.A03 != null) {
            canvas.translate((bounds.width() - this.A03.getWidth()) >> 1, (bounds.height() - this.A03.getHeight()) >> 1);
            this.A03.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = this.A00 * 2.0f;
        double sqrt = Math.sqrt(2.0d);
        int i5 = (int) (((i3 - i) - f) / sqrt);
        int i6 = (int) (((i4 - i2) - f) / sqrt);
        if (this.A01 == i6 && this.A02 == i5) {
            return;
        }
        this.A02 = i5;
        this.A01 = i6;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(i6 >> 1);
        TextData textData = this.A06;
        textPaint.setColor((textData == null || (r0 = textData.textColor) == 0) ? -1 : -1);
        textPaint.setTypeface(this.A05);
        CharSequence charSequence = this.A07;
        if (charSequence != null && charSequence.length() > 100) {
            charSequence = charSequence.subSequence(0, 100);
        }
        while (!TextUtils.isEmpty(charSequence)) {
            C2RX.A00(charSequence, textPaint);
            Layout A6p = A08.A6p(charSequence, textPaint, i5);
            this.A03 = A6p;
            if (A6p.getHeight() > i6) {
                if (textPaint.getTextSize() < Math.max(2, i6 >> 3)) {
                    charSequence = charSequence.subSequence(0, charSequence.length() / 2);
                } else {
                    textPaint.setTextSize(textPaint.getTextSize() - 1.0f);
                }
            } else {
                return;
            }
        }
    }
}
