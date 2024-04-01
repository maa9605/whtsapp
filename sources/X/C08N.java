package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.08N  reason: invalid class name */
/* loaded from: classes.dex */
public final class C08N {
    public static float A00 = 1.0f;
    public static long A01;
    public static Context A02;
    public static final HashMap A04 = new HashMap(16);
    public static final float A03 = ((float) Math.sqrt(3.0d)) / 2.0f;

    public static C18690uA A00(Bitmap bitmap) {
        return new C18690uA(bitmap.copy(bitmap.getConfig(), false));
    }

    public static C18690uA A01(String str, InterfaceC18700uB interfaceC18700uB) {
        C18690uA c18690uA;
        HashMap hashMap = A04;
        Reference reference = (Reference) hashMap.get(str);
        if (reference == null || (c18690uA = (C18690uA) reference.get()) == null) {
            Bitmap A6j = interfaceC18700uB.A6j();
            if (A6j == null) {
                return null;
            }
            c18690uA = new C18690uA(A6j);
            hashMap.put(str, new WeakReference(c18690uA));
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = A01;
        if (j >= 600000 || j == 0) {
            A01 = uptimeMillis;
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (((Reference) ((Map.Entry) it.next()).getValue()).get() == null) {
                    it.remove();
                }
            }
        }
        return c18690uA;
    }

    public static void A02(Canvas canvas, Paint paint, float f, float f2, float f3) {
        Path path = new Path();
        float f4 = 2.0f * f3;
        float f5 = f2 - f4;
        path.moveTo(f, f5);
        path.arcTo(new RectF(f - f3, f5 - f3, f + f3, f5 + f3), 30.0f, -240.0f, true);
        path.lineTo(f, f4 + f5);
        path.lineTo((A03 * f3) + f, (f3 * 0.5f) + f5);
        path.close();
        canvas.drawPath(path, paint);
    }
}
