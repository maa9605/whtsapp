package X;

import android.graphics.Paint;
import android.os.Build;

/* renamed from: X.2RY  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2RY {
    public static final C06F A00 = new C06F(50);

    public static Paint.FontMetricsInt A00(Paint paint) {
        if (Build.VERSION.SDK_INT <= 23 && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
            String str = Build.MODEL;
            if (str.startsWith("SM-G532") || str.startsWith("SM-G530")) {
                int floatToIntBits = (Float.floatToIntBits(paint.isFakeBoldText() ? 1.0f : 0.0f) + ((Float.floatToIntBits(paint.getTextSkewX()) + ((Float.floatToIntBits(paint.getTextSize()) + 31) * 31)) * 31)) * 31;
                int hashCode = paint.getTypeface() != null ? paint.getTypeface().hashCode() : 0;
                C06F c06f = A00;
                Integer valueOf = Integer.valueOf(floatToIntBits + hashCode);
                Paint.FontMetricsInt fontMetricsInt = (Paint.FontMetricsInt) c06f.A04(valueOf);
                if (fontMetricsInt == null) {
                    Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                    c06f.A08(valueOf, fontMetricsInt2);
                    return fontMetricsInt2;
                }
                return fontMetricsInt;
            }
        }
        return paint.getFontMetricsInt();
    }
}
