package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.location.Location;

/* renamed from: X.0tm  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18460tm {
    public C0T4 A00;
    public boolean A01 = true;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public C18460tm(C0T4 c0t4) {
        this.A00 = c0t4;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.1X3] */
    public void A00() {
        if (this.A01) {
            final C0T4 c0t4 = this.A00;
            if (c0t4.A0N && c0t4.A0H != null) {
                if (c0t4.A0G == null) {
                    c0t4.A0G = new C0SK(c0t4) { // from class: X.1X3
                        public float A00;
                        public float A01;
                        public float A02;
                        public float A03;
                        public float A04;
                        public float A05;
                        public float A06;
                        public float A07;
                        public float A08;
                        public float A09;
                        public float A0A;
                        public float A0B;
                        public float A0C;
                        public boolean A0D;
                        public final float A0E;
                        public final Paint A0F = new Paint(1);

                        {
                            float f = super.A06;
                            this.A08 = 12.0f * f;
                            float f2 = 37.0f * f;
                            this.A05 = f2;
                            this.A00 = 0.5f * f;
                            this.A0B = f * 2.0f;
                            this.A07 = 5.0f * f;
                            this.A09 = 8.0f * f;
                            this.A0A = f * 3.0f;
                            float f3 = f * 48.0f;
                            this.A0E = f3;
                            super.A03 = 5;
                            super.A02 = 3.0f;
                            this.A03 = (f3 - f2) / 2.0f;
                            super.A05 = false;
                        }

                        @Override // X.C0SK
                        public int A00(float f, float f2) {
                            float f3 = this.A04;
                            float f4 = this.A05;
                            float f5 = f3 - f4;
                            if (f >= f5 && f <= f3) {
                                float f6 = this.A06;
                                if (f2 >= f6 && f2 <= f6 + f4) {
                                    this.A0D = true;
                                    return 2;
                                }
                            }
                            float f7 = this.A03;
                            if (f >= f5 - f7 && f <= f3 + f7) {
                                float f8 = this.A06;
                                if (f2 >= f8 - f7 && f2 <= f8 + f4 + f7) {
                                    this.A0D = true;
                                    return 1;
                                }
                            }
                            this.A0D = false;
                            return 0;
                        }

                        @Override // X.C0SK
                        public void A04(float f, float f2) {
                            A01();
                        }

                        @Override // X.C0SK
                        public void A05(float f, float f2) {
                            this.A0D = false;
                            A01();
                        }

                        @Override // X.C0SK
                        public boolean A08(float f, float f2) {
                            C0T4 c0t42 = super.A0A;
                            if (c0t42.A0E.A0U != null) {
                                Location location = c0t42.A0U.A00;
                                if (location != null) {
                                    c0t42.A08(C07K.A0i(new C016007m(location.getLatitude(), location.getLongitude()), 15.0f), 1500, null);
                                    return true;
                                }
                                return true;
                            }
                            throw null;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
                            if (r6 <= (r1 + r2)) goto L14;
                         */
                        @Override // X.C0SK
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public boolean A09(float r5, float r6, float r7, float r8) {
                            /*
                                r4 = this;
                                boolean r0 = r4.A0D
                                r3 = 0
                                if (r0 == 0) goto L25
                                float r1 = r4.A04
                                float r2 = r4.A05
                                float r0 = r1 - r2
                                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                                if (r0 < 0) goto L1e
                                int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                                if (r0 > 0) goto L1e
                                float r1 = r4.A06
                                int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                                if (r0 < 0) goto L1e
                                float r1 = r1 + r2
                                int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                                if (r0 <= 0) goto L25
                            L1e:
                                r4.A0D = r3
                                r4.A01()
                                r0 = 1
                                return r0
                            L25:
                                return r3
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1X3.A09(float, float, float, float):boolean");
                        }

                        @Override // X.C0SK
                        public void A0B(Canvas canvas) {
                            C0T4 c0t42 = super.A0A;
                            float f = this.A08;
                            float width = (c0t42.A0E.getWidth() - f) - c0t42.A05;
                            this.A04 = width;
                            float f2 = f + c0t42.A06;
                            this.A06 = f2;
                            float f3 = this.A05 / 2.0f;
                            this.A01 = width - f3;
                            this.A02 = f3 + f2;
                            this.A0C = this.A09 + this.A0A;
                            Paint paint = this.A0F;
                            paint.setStyle(Paint.Style.FILL);
                            paint.setColor(this.A0D ? -2236963 : -1);
                            paint.setAlpha(230);
                            float f4 = this.A04;
                            float f5 = this.A05;
                            float f6 = this.A06;
                            canvas.drawRect(f4 - f5, f6, f4, f6 + f5, paint);
                            paint.setColor(-7829368);
                            canvas.drawCircle(this.A01, this.A02, this.A07, paint);
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setStrokeWidth(this.A0B);
                            canvas.drawCircle(this.A01, this.A02, this.A09, paint);
                            float f7 = this.A01;
                            float f8 = this.A02;
                            canvas.drawLine(f7, f8 - this.A09, f7, f8 - this.A0C, paint);
                            float f9 = this.A01;
                            float f10 = this.A02;
                            canvas.drawLine(f9, f10 + this.A09, f9, f10 + this.A0C, paint);
                            float f11 = this.A01;
                            float f12 = this.A02;
                            canvas.drawLine(f11 - this.A09, f12, f11 - this.A0C, f12, paint);
                            float f13 = this.A01;
                            float f14 = this.A02;
                            canvas.drawLine(f13 + this.A09, f14, f13 + this.A0C, f14, paint);
                            paint.setStrokeWidth(this.A00);
                            paint.setColor(-3355444);
                            float f15 = this.A04;
                            float f16 = this.A05;
                            float f17 = this.A06;
                            canvas.drawRect(f15 - f16, f17, f15, f17 + f16, paint);
                        }
                    };
                    C0T4 c0t42 = this.A00;
                    c0t42.A09(c0t42.A0G);
                    return;
                }
                return;
            }
        }
        C0T4 c0t43 = this.A00;
        C1X3 c1x3 = c0t43.A0G;
        if (c1x3 == null) {
            return;
        }
        c0t43.A0A(c1x3);
        this.A00.A0G = null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1Ws] */
    public void A01(boolean z) {
        if (z) {
            final C0T4 c0t4 = this.A00;
            if (c0t4.A0F == null) {
                c0t4.A0F = new C0SK(c0t4) { // from class: X.1Ws
                    public float A00;
                    public float A01;
                    public float A02;
                    public float A03;
                    public float A04;
                    public float A05;
                    public float A06;
                    public float A07;
                    public Bitmap A08;
                    public final float A09;

                    {
                        float f = super.A06;
                        float f2 = f * 12.0f;
                        this.A05 = f2;
                        this.A00 = 0.4f * f;
                        float f3 = 16.0f * f;
                        this.A03 = f3;
                        this.A06 = f2;
                        this.A07 = 4.8f * f;
                        this.A04 = 1.6f * f;
                        this.A09 = f * 44.0f;
                        super.A03 = 5;
                        super.A02 = 1.0f;
                        super.A05 = false;
                        int ceil = (int) Math.ceil(f3 * 1.08f * 2.0f);
                        Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil, Bitmap.Config.ARGB_8888);
                        this.A08 = createBitmap;
                        Canvas canvas = new Canvas(createBitmap);
                        float f4 = ceil / 2.0f;
                        float f5 = this.A04;
                        float f6 = f4 - f5;
                        float f7 = f5 + f4;
                        RectF rectF = new RectF(f6, f6, f7, f7);
                        float f8 = 1.08f * this.A03;
                        RadialGradient radialGradient = new RadialGradient(f4, f4, f8, new int[]{570425344, 570425344, 0}, new float[]{0.9259259f, 0.9259259f, 1.0f}, Shader.TileMode.CLAMP);
                        Path path = new Path();
                        Paint paint = new Paint(1);
                        Paint.Style style = Paint.Style.FILL;
                        paint.setStyle(style);
                        paint.setShader(radialGradient);
                        canvas.drawCircle(f4, f4, f8, paint);
                        paint.reset();
                        paint.setFlags(1);
                        paint.setStyle(style);
                        paint.setColor(-2046820353);
                        canvas.drawCircle(f4, f4, this.A03, paint);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setColor(-6118750);
                        paint.setStrokeWidth(this.A00);
                        canvas.drawCircle(f4, f4, this.A03, paint);
                        paint.setFlags(1);
                        paint.setStyle(style);
                        paint.setColor(-1365724);
                        path.reset();
                        path.moveTo(f4 - this.A07, f4);
                        path.lineTo(f4 - this.A04, f4);
                        path.addArc(rectF, 180.0f, 90.0f);
                        path.lineTo(f4, f4 - this.A06);
                        path.lineTo(f4 - this.A07, f4);
                        path.close();
                        canvas.drawPath(path, paint);
                        paint.setStyle(style);
                        paint.setColor(-2811114);
                        path.reset();
                        path.moveTo(this.A07 + f4, f4);
                        path.lineTo(this.A04 + f4, f4);
                        path.addArc(rectF, 0.0f, -90.0f);
                        path.lineTo(f4, f4 - this.A06);
                        path.lineTo(this.A07 + f4, f4);
                        path.close();
                        canvas.drawPath(path, paint);
                        paint.setStyle(Paint.Style.FILL);
                        paint.setColor(-4013374);
                        path.reset();
                        path.moveTo(f4 - this.A07, f4);
                        path.lineTo(f4 - this.A04, f4);
                        path.addArc(rectF, 180.0f, -90.0f);
                        path.lineTo(f4, this.A06 + f4);
                        path.lineTo(f4 - this.A07, f4);
                        path.close();
                        canvas.drawPath(path, paint);
                        paint.setStyle(Paint.Style.FILL);
                        paint.setColor(-2434342);
                        path.reset();
                        path.moveTo(this.A07 + f4, f4);
                        path.lineTo(this.A04 + f4, f4);
                        path.addArc(rectF, 0.0f, 90.0f);
                        path.lineTo(f4, this.A06 + f4);
                        path.lineTo(this.A07 + f4, f4);
                        path.close();
                        canvas.drawPath(path, paint);
                    }

                    @Override // X.C0SK
                    public int A00(float f, float f2) {
                        float f3 = this.A01;
                        float f4 = this.A03;
                        if (f >= f3 - f4 && f <= f3 + f4) {
                            float f5 = this.A02;
                            if (f2 >= f5 - f4 && f2 <= f5 + f4) {
                                return 2;
                            }
                        }
                        float f6 = this.A09;
                        if (f < f3 - f6 || f > f3 + f6) {
                            return 0;
                        }
                        float f7 = this.A02;
                        return (f2 < f7 - f6 || f2 > f7 + f6) ? 0 : 1;
                    }

                    @Override // X.C0SK
                    public boolean A08(float f, float f2) {
                        C0T4 c0t42 = this.A0A;
                        C015807k c015807k = new C015807k();
                        c015807k.A00 = 0.0f;
                        c0t42.A08(c015807k, 1500, null);
                        return true;
                    }

                    @Override // X.C0SK
                    public void A0A() {
                        float f = this.A05;
                        float f2 = 0 + f;
                        float f3 = f + this.A0A.A06;
                        float f4 = this.A03;
                        this.A01 = f2 + f4;
                        this.A02 = f3 + f4;
                    }

                    @Override // X.C0SK
                    public void A0B(Canvas canvas) {
                        canvas.save();
                        float f = this.A0A.A0R.A00.A0E.A0B;
                        if (f < 0.0f) {
                            f += 360.0f;
                        }
                        canvas.rotate(f, this.A01, this.A02);
                        Bitmap bitmap = this.A08;
                        float f2 = this.A01;
                        float f3 = this.A03;
                        canvas.drawBitmap(bitmap, f2 - f3, this.A02 - f3, (Paint) null);
                        canvas.restore();
                    }
                };
                C0T4 c0t42 = this.A00;
                c0t42.A09(c0t42.A0F);
                return;
            }
            return;
        }
        C0T4 c0t43 = this.A00;
        C29421Ws c29421Ws = c0t43.A0F;
        if (c29421Ws == null) {
            return;
        }
        c0t43.A0A(c29421Ws);
        this.A00.A0F = null;
    }
}
