package X;

import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.31H  reason: invalid class name */
/* loaded from: classes2.dex */
public class C31H extends RunnableEmptyBase implements Runnable {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public long A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final PhotoView A09;

    public C31H(PhotoView photoView) {
        this.A09 = photoView;
    }

    public void A00(float f, float f2, float f3, float f4, long j) {
        if (this.A06) {
            return;
        }
        this.A00 = f3;
        this.A01 = f4;
        this.A03 = f2;
        this.A05 = System.currentTimeMillis();
        this.A02 = f;
        this.A08 = f2 > f;
        this.A04 = (f2 - f) / ((float) j);
        this.A06 = true;
        this.A07 = false;
        this.A09.post(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r6.A08 == (r5 > r3)) goto L16;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r6 = this;
            boolean r0 = r6.A07
            if (r0 == 0) goto L5
            return
        L5:
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r6.A05
            long r2 = r2 - r0
            float r1 = r6.A02
            float r5 = r6.A04
            float r0 = (float) r2
            float r5 = r5 * r0
            float r5 = r5 + r1
            com.whatsapp.mediaview.PhotoView r4 = r6.A09
            float r1 = r6.A00
            float r0 = r6.A01
            r4.A05(r5, r1, r0)
            float r3 = r6.A03
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L2c
            boolean r2 = r6.A08
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L2a
            r0 = 1
        L2a:
            if (r2 != r0) goto L39
        L2c:
            float r1 = r6.A00
            float r0 = r6.A01
            r4.A05(r3, r1, r0)
            r0 = 0
            r6.A06 = r0
            r0 = 1
            r6.A07 = r0
        L39:
            boolean r0 = r6.A07
            if (r0 != 0) goto L40
            r4.post(r6)
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31H.run():void");
    }
}
