package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* renamed from: X.2KQ  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2KQ {
    public float A00;
    public int A01;
    public Matrix A03;
    public Rect A04;
    public RectF A05;
    public RectF A06;
    public View A07;
    public boolean A09;
    public int A02 = 0;
    public boolean A0A = false;
    public boolean A08 = false;
    public final Paint A0B = new Paint();
    public final Paint A0C = new Paint();
    public final Paint A0D = new Paint();

    public C2KQ(View view) {
        this.A07 = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
        if (r11 >= (r3.bottom + r4)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
        if (r6 == false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A00(float r10, float r11) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2KQ.A00(float, float):int");
    }

    public Rect A01() {
        RectF rectF = this.A05;
        return new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final Rect A02() {
        RectF rectF = this.A05;
        RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.A03.mapRect(rectF2);
        return new Rect(Math.round(rectF2.left), Math.round(rectF2.top), Math.round(rectF2.right), Math.round(rectF2.bottom));
    }
}
