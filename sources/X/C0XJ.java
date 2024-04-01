package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;

/* renamed from: X.0XJ  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0XJ {
    public static final ThreadLocal A00 = new ThreadLocal();

    public static boolean A00(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return paint.hasGlyph(str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("\udfffd");
        float measureText2 = paint.measureText("m");
        float measureText3 = paint.measureText(str);
        float f = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, length) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i = 0;
            while (i < length) {
                int charCount = Character.charCount(str.codePointAt(i)) + i;
                f += paint.measureText(str, i, charCount);
                i = charCount;
            }
            if (measureText3 >= f) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        ThreadLocal threadLocal = A00;
        C0FK c0fk = (C0FK) threadLocal.get();
        if (c0fk == null) {
            c0fk = new C0FK(new Rect(), new Rect());
            threadLocal.set(c0fk);
        } else {
            ((Rect) c0fk.A00).setEmpty();
            ((Rect) c0fk.A01).setEmpty();
        }
        Rect rect = (Rect) c0fk.A00;
        paint.getTextBounds("\udfffd", 0, 2, rect);
        Object obj = c0fk.A01;
        paint.getTextBounds(str, 0, length, (Rect) obj);
        return !rect.equals(obj);
    }
}
