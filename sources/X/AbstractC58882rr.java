package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Pair;
import android.view.View;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.2rr */
/* loaded from: classes2.dex */
public abstract class AbstractC58882rr {
    public C09H A00;
    public final int A01;

    public AbstractC58882rr(int i) {
        this.A01 = i;
    }

    public static float A00(int i, float f) {
        return View.MeasureSpec.getMode(i) != 0 ? Math.min(View.MeasureSpec.getSize(i), f) : f;
    }

    public static Pair A01(float f, float f2) {
        return Pair.create(Integer.valueOf(Math.round(f)), Integer.valueOf(Math.round(f2)));
    }

    public int A02() {
        if (this instanceof C657438j) {
            return Math.round((this.A01 * 72.0f) / 100.0f);
        }
        if (this instanceof C657338i) {
            return Math.round((this.A01 * 72.0f) / 100.0f);
        }
        if (!(this instanceof C656938e)) {
            return this.A01;
        }
        C09H c09h = this.A00;
        return Math.round((this.A01 * (((float) c09h.A06) > ((float) c09h.A08) ? 65 : 72)) / 100.0f);
    }

    public final RectF A03(int i, int i2, C58872rq c58872rq) {
        float f;
        C09H c09h = this.A00;
        if (c09h != null && i2 > 0 && i > 0) {
            float f2 = c09h.A08;
            float f3 = c09h.A06;
            PointF pointF = new PointF(f2 / 2.0f, f3 / 2.0f);
            float f4 = i;
            float f5 = i2;
            PointF pointF2 = new PointF(f4 / 2.0f, f5 / 2.0f);
            if (f5 > f4) {
                int i3 = this.A00.A03;
                pointF.y = i3 > 0 ? i3 : f3 / 3.0f;
                pointF2.y = f5 / 3.0f;
            }
            float f6 = f2 / f4;
            float f7 = f5 * f6;
            float f8 = f2 / f3;
            if (f8 > c58872rq.A01 / c58872rq.A00) {
                f6 = f3 / f5;
                f = f4 * f6;
                f7 = f3;
            } else {
                f = f2;
            }
            PointF pointF3 = new PointF(pointF2.x * f6, pointF2.y * f6);
            RectF rectF = new RectF();
            float f9 = pointF.x - pointF3.x;
            rectF.left = f9;
            float f10 = pointF.y - pointF3.y;
            rectF.top = f10;
            rectF.right = f9 + f;
            float f11 = f10 + f7;
            rectF.bottom = f11;
            if (f10 < 0.0f) {
                rectF.top = 0.0f;
                rectF.bottom = f7;
                f11 = f7;
            }
            if (f11 > f3) {
                rectF.bottom = f3;
                rectF.top = f3 - f7;
            }
            Locale locale = Locale.US;
            C09H c09h2 = this.A00;
            String.format(locale, "ConversationRowSingleImagePreviewCalculator/getSourceRect bitmap=%f,%f(%f) face=%d,%d preview=%d,%d(%f) scaled=%f,%f(%f) rect=%s", Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f8), Integer.valueOf(c09h2.A02), Integer.valueOf(c09h2.A03), Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f4 / f5), Float.valueOf(f), Float.valueOf(f7), Float.valueOf(f / f7), rectF.toString());
            return rectF;
        }
        return null;
    }

    public Pair A04(int i, int i2) {
        Float A02;
        C09H c09h;
        int i3;
        if (this instanceof C657438j) {
            int A022 = A02();
            C09H c09h2 = this.A00;
            C000700j.A04(c09h2, "setMediaData() must be called prior.");
            float f = c09h2.A08;
            float f2 = c09h2.A06;
            float A00 = A00(i, A022);
            return A01(A00, A00(i2, (f2 * A00) / f));
        } else if (this instanceof C657338i) {
            float A002 = A00(i, (this.A01 * 72) / 100.0f);
            return A01(A002, A00(i2, (A002 * 100.0f) / 191.0f));
        } else if (!(this instanceof C656938e)) {
            C38H c38h = (C38H) this;
            if (c38h.A00 <= 0) {
                int size = View.MeasureSpec.getSize(i);
                C09H c09h3 = ((AbstractC58882rr) c38h).A00;
                C000700j.A04(c09h3, "setMediaData() must be called prior.");
                float f3 = c09h3.A08;
                float f4 = c09h3.A06;
                float A003 = A00(i, size);
                return A01(A003, A00(i2, (f4 * A003) / f3));
            }
            C09H c09h4 = ((AbstractC58882rr) c38h).A00;
            float f5 = c09h4.A08;
            float f6 = c09h4.A06;
            float size2 = View.MeasureSpec.getSize(i);
            return A01(size2, A00(i2, Math.min(i3 << 1, (f6 * size2) / f5)));
        } else {
            C656938e c656938e = (C656938e) this;
            Iterator it = c656938e.A01.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C58872rq c58872rq = (C58872rq) it.next();
                boolean z = c58872rq.A03;
                C09H c09h5 = ((AbstractC58882rr) c656938e).A00;
                if (z == (((float) c09h5.A06) > ((float) c09h5.A08)) && (A02 = C656938e.A02((((AbstractC58882rr) c656938e).A01 * c58872rq.A02) / 100.0f, i)) != null) {
                    float floatValue = A02.floatValue();
                    C09H c09h6 = ((AbstractC58882rr) c656938e).A00;
                    Float A023 = C656938e.A02((c09h6.A06 * floatValue) / c09h6.A08, i2);
                    if (A023 != null) {
                        float f7 = ((AbstractC58882rr) c656938e).A00.A08;
                        float floatValue2 = A023.floatValue();
                        float f8 = floatValue2 / c09h.A06;
                        if (f8 < floatValue / f7) {
                            A02 = Float.valueOf(f7 * f8);
                        }
                        float floatValue3 = A02.floatValue();
                        float f9 = (floatValue3 * c58872rq.A00) / c58872rq.A01;
                        Locale locale = Locale.US;
                        C09H c09h7 = ((AbstractC58882rr) c656938e).A00;
                        int i4 = c09h7.A08;
                        int i5 = c09h7.A06;
                        String.format(locale, "ConversationRowSingleImagePreviewCalculator/getMeasuredDimension %s bitmap=%d,%d(%f) face=%d,%d preview=%f,%f(%f) required_height=%f", c58872rq.toString(), Integer.valueOf(i4), Integer.valueOf(i5), Float.valueOf(i4 / i5), Integer.valueOf(c09h7.A02), Integer.valueOf(c09h7.A03), A02, A023, Float.valueOf(floatValue3 / floatValue2), Float.valueOf(f9));
                        Pair A01 = A01(floatValue3, (z ? Float.valueOf(Math.min(floatValue2, f9)) : Float.valueOf(Math.max(floatValue2, f9))).floatValue());
                        if (A01 != null) {
                            return A01;
                        }
                    }
                }
            }
            C58872rq c58872rq2 = c656938e.A00;
            float f10 = (((AbstractC58882rr) c656938e).A01 * c58872rq2.A02) / 100.0f;
            return A01(f10, (f10 * c58872rq2.A00) / c58872rq2.A01);
        }
    }
}
