package X;

import android.graphics.Paint;
import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: X.2uw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C60722uw extends Paint {
    public final float A00;
    public final float A01;

    public C60722uw(Paint paint, int i) {
        super(paint);
        float textSize;
        Number number;
        this.A00 = C72543aC.A00(paint);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29) {
            textSize = paint.getUnderlineThickness();
        } else {
            Method method = C72543aC.A01;
            if (method != null && (number = (Number) C72543aC.A01(method, paint, Float.class, new Object[0])) != null) {
                textSize = number.floatValue();
            } else {
                textSize = paint.getTextSize() / 18.0f;
            }
        }
        this.A01 = textSize;
        setColor(i);
        setStrokeWidth(this.A01);
        int i2 = Build.VERSION.SDK_INT;
        setAntiAlias((i2 <= 23 || i2 >= 27) ? true : true);
    }

    @Override // android.graphics.Paint
    public float getUnderlinePosition() {
        return this.A00;
    }

    @Override // android.graphics.Paint
    public float getUnderlineThickness() {
        return this.A01;
    }
}
