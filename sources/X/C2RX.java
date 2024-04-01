package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.Spanned;

/* renamed from: X.2RX  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2RX {
    public float A00;
    public final Context A01;
    public final Paint A02;

    public C2RX(Context context, Paint paint) {
        this.A00 = 1.0f;
        this.A01 = context;
        this.A02 = paint;
    }

    public C2RX(Context context, Paint paint, float f) {
        this.A00 = 1.0f;
        this.A01 = context;
        this.A02 = paint;
        this.A00 = f;
    }

    public static void A00(CharSequence charSequence, Paint paint) {
        if (charSequence instanceof Spanned) {
            Paint.FontMetricsInt A00 = C2RY.A00(paint);
            int textSize = (int) ((paint.getTextSize() * 1.1f) + 0.5f);
            C2RZ[] c2rzArr = (C2RZ[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), C2RZ.class);
            if (c2rzArr != null) {
                for (C2RZ c2rz : c2rzArr) {
                    c2rz.A01 = A00;
                    c2rz.A03().setBounds(0, 0, textSize, textSize);
                }
            }
        }
    }
}
