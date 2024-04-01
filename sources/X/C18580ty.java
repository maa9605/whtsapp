package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.0ty  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C18580ty {
    public int A00;
    public int A01;
    public int A02;
    public C18760uH A06 = null;
    public C18760uH A05 = null;
    public C18760uH[] A07 = new C18760uH[4];
    public Paint A04 = new Paint(3);
    public int A03 = 0;
    public final Rect A08 = new Rect();
    public final RectF A09 = new RectF();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r16 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
        r22.A04.setAlpha(255);
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
        if (r22.A07 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
        r3 = 0;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
        r5 = r22.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
        if (r5[r3] == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
        if (r5[r3].A04 != (r22.A02 + 1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
        if (r5[r3].A02() == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
        if (r3 >= 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
        if (r4 == 255) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
        r0 = r22.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
        r5 = r0.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
        if (r12 == 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
        if (r5 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0075, code lost:
        if (r5 == r11) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0077, code lost:
        r3 = r22.A02;
        r1 = r22.A05;
        r3 = r3 - r1.A04;
        r2 = r1.A00 >> r3;
        r13 = (1 << r3) - 1;
        r1 = (r22.A00 & r13) * r2;
        r13 = (r13 & r22.A01) * r2;
        r3 = r22.A08;
        r3.set(r1, r13, r1 + r2, r2 + r13);
        r2 = r22.A09;
        r13 = r22.A05;
        r2.set(r24, r25, r13.A01 + r24, r13.A00 + r25);
        r23.drawBitmap(r5, r3, r2, r22.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00aa, code lost:
        if (r12 <= 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ac, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ad, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
        r0 = r22.A07[(r12 << 1) + r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
        if (r0 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
        if (r0.A04 != (r22.A02 + r14)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00be, code lost:
        r13 = r0.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c2, code lost:
        if (r13 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c4, code lost:
        if (r13 == r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c6, code lost:
        r1 = r0.A00;
        r15 = r1 >> 1;
        r14 = (r15 * r12) + r24;
        r3 = (r15 * r5) + r25;
        r2 = r22.A08;
        r2.set(0, 0, r0.A01, r1);
        r1 = r22.A09;
        r15 = r15;
        r1.set(r14, r3, r14 + r15, r15 + r3);
        r23.drawBitmap(r13, r2, r1, r22.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f4, code lost:
        r5 = r5 + 1;
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f8, code lost:
        if (r5 < 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fa, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fc, code lost:
        if (r12 >= 2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ff, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0102, code lost:
        if (r16 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0104, code lost:
        r22.A04.setAlpha(r4);
        r23.drawBitmap(r6, r24, r25, r22.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010e, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A00(android.graphics.Canvas r23, float r24, float r25) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18580ty.A00(android.graphics.Canvas, float, float):void");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{tile=");
        C18760uH c18760uH = this.A06;
        if (c18760uH == null) {
            c18760uH = "{x}";
        }
        sb.append(c18760uH);
        sb.append(", mParentTile=");
        C18760uH c18760uH2 = this.A05;
        sb.append(c18760uH2 != null ? c18760uH2 : "{x}");
        sb.append(", status=");
        return C000200d.A0K(sb, this.A03, "}");
    }
}
