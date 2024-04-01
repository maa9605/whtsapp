package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* renamed from: X.11L  reason: invalid class name */
/* loaded from: classes.dex */
public final class C11L {
    public static final byte[] A07 = {0, 7, 8, 15};
    public static final byte[] A08 = {0, 119, -120, -1};
    public static final byte[] A09 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02;
    public final Paint A03;
    public final C11D A04;
    public final C11E A05;
    public final C11K A06;

    public C11L(int i, int i2) {
        Paint paint = new Paint();
        this.A02 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A02.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.A02.setPathEffect(null);
        Paint paint2 = new Paint();
        this.A03 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.A03.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.A03.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new C11E(719, 575, 0, 719, 0, 575);
        this.A04 = new C11D(0, new int[]{0, -1, -16777216, -8421505}, A03(), A04());
        this.A06 = new C11K(i, i2);
    }

    public static C11D A00(C223712e c223712e, int i) {
        int A00;
        int A002;
        int A003;
        int A004;
        int i2 = 8;
        int A005 = c223712e.A00(8);
        c223712e.A02(8);
        int i3 = i - 2;
        int i4 = 4;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] A03 = A03();
        int[] A04 = A04();
        while (i3 > 0) {
            int A006 = c223712e.A00(i2);
            int A007 = c223712e.A00(i2);
            int i5 = i3 - 2;
            int[] iArr2 = iArr;
            if ((A007 & 128) == 0) {
                iArr2 = A04;
                if ((A007 & 64) != 0) {
                    iArr2 = A03;
                }
            }
            if ((A007 & 1) != 0) {
                A00 = c223712e.A00(i2);
                A002 = c223712e.A00(i2);
                A003 = c223712e.A00(i2);
                A004 = c223712e.A00(i2);
                i3 = i5 - 4;
            } else {
                A00 = c223712e.A00(6) << 2;
                A002 = c223712e.A00(i4) << i4;
                A003 = c223712e.A00(i4) << i4;
                A004 = c223712e.A00(2) << 6;
                i3 = i5 - 2;
            }
            if (A00 == 0) {
                A002 = 0;
                A003 = 0;
                A004 = 255;
            }
            double d = A00;
            double d2 = A002 - 128;
            double d3 = A003 - 128;
            int max = Math.max(0, Math.min((int) ((1.402d * d2) + d), 255));
            int max2 = Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255));
            iArr2[A006] = (((byte) (255 - (A004 & 255))) << 24) | (max << 16) | (max2 << 8) | Math.max(0, Math.min((int) ((d3 * 1.772d) + d), 255));
            i2 = 8;
            i4 = 4;
        }
        return new C11D(A005, iArr, A03, A04);
    }

    public static C11F A01(C223712e c223712e) {
        byte[] bArr;
        int A00 = c223712e.A00(16);
        c223712e.A02(4);
        int A002 = c223712e.A00(2);
        boolean A04 = c223712e.A04();
        c223712e.A02(1);
        byte[] bArr2 = null;
        if (A002 == 1) {
            c223712e.A02(c223712e.A00(8) << 4);
        } else if (A002 == 0) {
            int A003 = c223712e.A00(16);
            int A004 = c223712e.A00(16);
            if (A003 > 0) {
                bArr2 = new byte[A003];
                c223712e.A03(bArr2, A003);
            }
            if (A004 > 0) {
                bArr = new byte[A004];
                c223712e.A03(bArr, A004);
                return new C11F(A00, A04, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C11F(A00, A04, bArr2, bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d6, code lost:
        if (r1 != 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (r11 != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0119, code lost:
        if (r0 == 0) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x013e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6 A[LOOP:1: B:28:0x006b->B:43:0x00b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014f A[LOOP:2: B:68:0x0104->B:85:0x014f, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11L.A02(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        r4 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] A03() {
        /*
            r7 = 16
            int[] r6 = new int[r7]
            r0 = 0
            r6[r0] = r0
            r5 = 1
        L8:
            r4 = 255(0xff, float:3.57E-43)
        La:
            r0 = r5 & 2
            r3 = 0
            if (r0 == 0) goto L11
            r3 = 255(0xff, float:3.57E-43)
        L11:
            r0 = r5 & 4
            r2 = 0
            if (r0 == 0) goto L18
            r2 = 255(0xff, float:3.57E-43)
        L18:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = r4 << 16
            r1 = r1 | r0
            int r0 = r3 << 8
            r1 = r1 | r0
            r1 = r1 | r2
            r6[r5] = r1
        L23:
            int r5 = r5 + 1
            if (r5 >= r7) goto L52
            r0 = 8
            if (r5 >= r0) goto L31
            r0 = r5 & 1
            r4 = 0
            if (r0 == 0) goto La
            goto L8
        L31:
            r0 = r5 & 1
            r4 = 127(0x7f, float:1.78E-43)
            r3 = 0
            if (r0 == 0) goto L3a
            r3 = 127(0x7f, float:1.78E-43)
        L3a:
            r0 = r5 & 2
            r2 = 0
            if (r0 == 0) goto L41
            r2 = 127(0x7f, float:1.78E-43)
        L41:
            r0 = r5 & 4
            if (r0 != 0) goto L46
            r4 = 0
        L46:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = r3 << 16
            r1 = r1 | r0
            int r0 = r2 << 8
            r1 = r1 | r0
            r1 = r1 | r4
            r6[r5] = r1
            goto L23
        L52:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11L.A03():int[]");
    }

    public static int[] A04() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        int i = 0;
        do {
            if (i < 8) {
                iArr[i] = 1056964608 | (((i & 1) != 0 ? 255 : 0) << 16) | (((i & 2) != 0 ? 255 : 0) << 8) | ((i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = (-16777216) | ((((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0)) << 16) | ((((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0)) << 8) | (((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 != 8) {
                    if (i2 == 128) {
                        iArr[i] = (-16777216) | (((((i & 1) != 0 ? 43 : 0) + 127) + ((i & 16) != 0 ? 85 : 0)) << 16) | (((((i & 2) != 0 ? 43 : 0) + 127) + ((i & 32) != 0 ? 85 : 0)) << 8) | (((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                    } else if (i2 == 136) {
                        iArr[i] = (-16777216) | ((((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0)) << 16) | ((((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0)) << 8) | (((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                    }
                } else {
                    iArr[i] = 2130706432 | ((((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0)) << 16) | ((((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0)) << 8) | (((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                }
            }
            i++;
        } while (i < 256);
        return iArr;
    }
}
