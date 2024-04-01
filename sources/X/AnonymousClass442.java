package X;

import android.os.Build;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;

/* renamed from: X.442 */
/* loaded from: classes3.dex */
public class AnonymousClass442 {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public Pair A04;
    public Float A05;
    public Long A06;
    public Long A07;
    public boolean A08;
    public byte[] A09;
    public float[] A0A;
    public AnonymousClass441[] A0B;

    public void A00() {
        if (this.A0B != null) {
            int i = 0;
            while (true) {
                AnonymousClass441[] anonymousClass441Arr = this.A0B;
                if (i >= anonymousClass441Arr.length) {
                    break;
                }
                AnonymousClass441 anonymousClass441 = anonymousClass441Arr[i];
                ByteBuffer byteBuffer = anonymousClass441.A02;
                if (byteBuffer != null) {
                    byteBuffer.clear();
                    anonymousClass441.A02 = null;
                }
                i++;
            }
            this.A0B = null;
        }
        this.A09 = null;
        this.A0A = null;
        this.A04 = null;
        this.A07 = null;
        this.A05 = null;
        this.A06 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x000c, code lost:
        if (r0 != r3) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(android.media.Image r6, boolean r7, float[] r8, android.util.Pair r9, java.lang.Long r10, java.lang.Float r11, java.lang.Long r12) {
        /*
            r5 = this;
            r5.A08 = r7
            android.media.Image$Plane[] r4 = r6.getPlanes()
            X.441[] r0 = r5.A0B
            if (r0 == 0) goto Le
            int r0 = r0.length
            int r3 = r4.length
            if (r0 == r3) goto L13
        Le:
            int r3 = r4.length
            X.441[] r0 = new X.AnonymousClass441[r3]
            r5.A0B = r0
        L13:
            r2 = 0
        L14:
            if (r2 >= r3) goto L48
            X.441[] r1 = r5.A0B
            r0 = r1[r2]
            if (r0 != 0) goto L23
            X.441 r0 = new X.441
            r0.<init>()
            r1[r2] = r0
        L23:
            r1 = r1[r2]
            r0 = r4[r2]
            java.nio.ByteBuffer r0 = r0.getBuffer()
            r1.A02 = r0
            X.441[] r0 = r5.A0B
            r1 = r0[r2]
            r0 = r4[r2]
            int r0 = r0.getPixelStride()
            r1.A00 = r0
            X.441[] r0 = r5.A0B
            r1 = r0[r2]
            r0 = r4[r2]
            int r0 = r0.getRowStride()
            r1.A01 = r0
            int r2 = r2 + 1
            goto L14
        L48:
            r5.A0A = r8
            r5.A04 = r9
            r5.A07 = r10
            r5.A05 = r11
            r5.A06 = r12
            int r0 = r6.getFormat()
            r5.A01 = r0
            long r0 = r6.getTimestamp()
            r5.A03 = r0
            int r0 = r6.getWidth()
            r5.A02 = r0
            int r0 = r6.getHeight()
            r5.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass442.A01(android.media.Image, boolean, float[], android.util.Pair, java.lang.Long, java.lang.Float, java.lang.Long):void");
    }

    public void A02(byte[] bArr, int i, int i2, int i3) {
        this.A09 = bArr;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A03 = Build.VERSION.SDK_INT >= 17 ? SystemClock.elapsedRealtimeNanos() : System.nanoTime();
    }
}
