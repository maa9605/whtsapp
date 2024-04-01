package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.location.Location;

/* renamed from: X.1X4 */
/* loaded from: classes.dex */
public class C1X4 extends C0SK implements C0T7 {
    public float A00;
    public float A01;
    public float A02;
    public boolean A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final Paint A0B;
    public final Path A0C;
    public final C18630u3 A0D;
    public final C18670u7 A0E;

    public C1X4(C0T4 c0t4) {
        super(c0t4);
        this.A0B = new Paint(1);
        this.A0C = new Path();
        this.A0D = new C18630u3();
        super.A03 = 3;
        super.A02 = 0.0f;
        float f = super.A06;
        this.A08 = 8.0f * f;
        float f2 = 11.0f * f;
        this.A0A = f2;
        this.A09 = f2 + 1.5f;
        this.A07 = 12.0f * f;
        this.A06 = 10.0f * f;
        float f3 = f * 24.0f;
        this.A05 = f3;
        this.A04 = f3 * 2.0f;
        C18670u7 A00 = C18670u7.A00(0.0f, 1.0f);
        this.A0E = A00;
        A00.A05 = -1;
        A00.A07(this);
        A00.A05(2100L);
    }

    @Override // X.C0SK
    public void A0B(Canvas canvas) {
        C18630u3 c18630u3;
        Location location = super.A0A.A0U.A00;
        if (location != null) {
            float max = Math.max(this.A05, Math.min(this.A04, location.getAccuracy()));
            Paint paint = this.A0B;
            paint.setColor(-12888163);
            paint.setAlpha((int) ((1.0f - this.A01) * 255.0f));
            C18450tl c18450tl = super.A0B;
            c18450tl.A0A(this.A0D);
            double A02 = C18450tl.A02(location.getLongitude());
            double A01 = C18450tl.A01(location.getLatitude());
            float[] fArr = super.A0D;
            c18450tl.A08(((int) Math.ceil(c18630u3.A01 - A02)) + A02, A01, fArr);
            float f = fArr[0];
            float f2 = fArr[1];
            canvas.drawCircle(f, f2, max * this.A01, paint);
            paint.setColor(-3355444);
            float f3 = this.A09;
            canvas.drawCircle(f, f2, f3, paint);
            paint.setColor(-1);
            canvas.drawCircle(f, f2, this.A0A, paint);
            paint.setColor(-12888163);
            paint.setAlpha((int) (this.A00 * 255.0f));
            canvas.drawCircle(f, f2, this.A00 * this.A08, paint);
            if (location.hasBearing()) {
                canvas.save();
                float f4 = c18450tl.A00.A0E.A0B;
                if (f4 < 0.0f) {
                    f4 += 360.0f;
                }
                canvas.rotate(location.getBearing() + f4, f, f2);
                float f5 = this.A07;
                float f6 = f5 / 2.0f;
                float f7 = f - f6;
                float f8 = f2 - f3;
                Path path = this.A0C;
                path.reset();
                path.moveTo(f7, f8);
                float f9 = this.A06;
                path.lineTo(f6 + f7, f8 - f9);
                path.lineTo(f5 + f7, f8);
                path.lineTo((f5 * 0.5f) + f7, f8 - (f9 * 0.25f));
                path.lineTo(f7, f8);
                path.close();
                canvas.drawPath(path, paint);
                canvas.restore();
            }
        }
    }

    @Override // X.C0T7
    public void AHF(C18670u7 c18670u7) {
        float f = c18670u7.A00;
        this.A01 = f;
        if (f < this.A02) {
            this.A03 = !this.A03;
        }
        if (this.A03) {
            this.A00 = 1.0f - ((1.0f - f) * 0.25f);
        } else {
            this.A00 = 1.0f - (f * 0.25f);
        }
        this.A02 = f;
        A01();
    }
}
