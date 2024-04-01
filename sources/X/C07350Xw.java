package X;

import android.graphics.Paint;

/* renamed from: X.0Xw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07350Xw extends AbstractC07360Xx {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public Paint.Cap A07;
    public Paint.Join A08;
    public C07370Xy A09;
    public C07370Xy A0A;
    public int[] A0B;

    public C07350Xw() {
        this.A03 = 0.0f;
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        this.A06 = 0.0f;
        this.A04 = 1.0f;
        this.A05 = 0.0f;
        this.A07 = Paint.Cap.BUTT;
        this.A08 = Paint.Join.MITER;
        this.A02 = 4.0f;
    }

    public C07350Xw(C07350Xw c07350Xw) {
        super(c07350Xw);
        this.A03 = 0.0f;
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        this.A06 = 0.0f;
        this.A04 = 1.0f;
        this.A05 = 0.0f;
        this.A07 = Paint.Cap.BUTT;
        this.A08 = Paint.Join.MITER;
        this.A02 = 4.0f;
        this.A0B = c07350Xw.A0B;
        this.A0A = c07350Xw.A0A;
        this.A03 = c07350Xw.A03;
        this.A01 = c07350Xw.A01;
        this.A09 = c07350Xw.A09;
        super.A01 = ((AbstractC07360Xx) c07350Xw).A01;
        this.A00 = c07350Xw.A00;
        this.A06 = c07350Xw.A06;
        this.A04 = c07350Xw.A04;
        this.A05 = c07350Xw.A05;
        this.A07 = c07350Xw.A07;
        this.A08 = c07350Xw.A08;
        this.A02 = c07350Xw.A02;
    }

    @Override // X.AbstractC07340Xv
    public boolean A00() {
        return this.A09.A00() || this.A0A.A00();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // X.AbstractC07340Xv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A01(int[] r5) {
        /*
            r4 = this;
            X.0Xy r2 = r4.A09
            boolean r0 = r2.A00()
            if (r0 == 0) goto L36
            android.content.res.ColorStateList r1 = r2.A01
            int r0 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r5, r0)
            int r0 = r2.A00
            if (r1 == r0) goto L36
            r3 = 1
            r2.A00 = r1
        L19:
            X.0Xy r2 = r4.A0A
            boolean r0 = r2.A00()
            if (r0 == 0) goto L34
            android.content.res.ColorStateList r1 = r2.A01
            int r0 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r5, r0)
            int r0 = r2.A00
            if (r1 == r0) goto L34
            r0 = 1
            r2.A00 = r1
        L32:
            r0 = r0 | r3
            return r0
        L34:
            r0 = 0
            goto L32
        L36:
            r3 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07350Xw.A01(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.A00;
    }

    public int getFillColor() {
        return this.A09.A00;
    }

    public float getStrokeAlpha() {
        return this.A01;
    }

    public int getStrokeColor() {
        return this.A0A.A00;
    }

    public float getStrokeWidth() {
        return this.A03;
    }

    public float getTrimPathEnd() {
        return this.A04;
    }

    public float getTrimPathOffset() {
        return this.A05;
    }

    public float getTrimPathStart() {
        return this.A06;
    }

    public void setFillAlpha(float f) {
        this.A00 = f;
    }

    public void setFillColor(int i) {
        this.A09.A00 = i;
    }

    public void setStrokeAlpha(float f) {
        this.A01 = f;
    }

    public void setStrokeColor(int i) {
        this.A0A.A00 = i;
    }

    public void setStrokeWidth(float f) {
        this.A03 = f;
    }

    public void setTrimPathEnd(float f) {
        this.A04 = f;
    }

    public void setTrimPathOffset(float f) {
        this.A05 = f;
    }

    public void setTrimPathStart(float f) {
        this.A06 = f;
    }
}
