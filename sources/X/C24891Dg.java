package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Dg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C24891Dg {
    public boolean A00;
    public final C1DF A01;
    public final List A02 = new ArrayList();
    public final int[] A03 = new int[5];

    public C24891Dg(C1DF c1df) {
        this.A01 = c1df;
    }

    public static boolean A00(int[] iArr) {
        int i = 0;
        int i2 = 0;
        do {
            int i3 = iArr[i];
            if (i3 == 0) {
                return false;
            }
            i2 += i3;
            i++;
        } while (i < 5);
        if (i2 < 7) {
            return false;
        }
        float f = i2 / 7.0f;
        float f2 = f / 2.0f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    public final boolean A01() {
        List<C33291ff> list = this.A02;
        int size = list.size();
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        for (C33291ff c33291ff : list) {
            if (c33291ff.A01 >= 2) {
                i++;
                f2 += c33291ff.A00;
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / size;
        for (C33291ff c33291ff2 : list) {
            f += Math.abs(c33291ff2.A00 - f3);
        }
        return f <= f2 * 0.05f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x01d6, code lost:
        if (r12 >= r13) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01d9, code lost:
        if (r11 < r13) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01db, code lost:
        if (r12 < r13) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01e5, code lost:
        if (r10.A03(r12 - r13, r11 - r13) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01e7, code lost:
        r0 = r6[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01e9, code lost:
        if (r0 > r7) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01eb, code lost:
        r6[1] = r0 + 1;
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01f2, code lost:
        if (r11 < r13) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01f4, code lost:
        if (r12 < r13) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01f8, code lost:
        if (r6[1] <= r7) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01fa, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01fb, code lost:
        if (r11 < r13) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01fd, code lost:
        if (r12 < r13) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0207, code lost:
        if (r10.A03(r12 - r13, r11 - r13) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0209, code lost:
        r0 = r6[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x020b, code lost:
        if (r0 > r7) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x020d, code lost:
        r6[0] = r0 + 1;
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0216, code lost:
        if (r6[0] > r7) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0218, code lost:
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0219, code lost:
        r2 = r11 + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x021b, code lost:
        if (r2 >= r9) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x021d, code lost:
        r0 = r12 + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x021f, code lost:
        if (r0 >= r4) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0225, code lost:
        if (r10.A03(r0, r2) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0227, code lost:
        r6[2] = r6[2] + 1;
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0230, code lost:
        if (r2 >= r9) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0234, code lost:
        if ((r12 + r14) < r4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0236, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0237, code lost:
        r13 = r11 + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0239, code lost:
        if (r13 >= r9) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x023b, code lost:
        r0 = r12 + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x023d, code lost:
        if (r0 >= r4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0243, code lost:
        if (r10.A03(r0, r13) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0245, code lost:
        r0 = r6[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0248, code lost:
        if (r0 >= r7) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x024a, code lost:
        r6[3] = r0 + 1;
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0251, code lost:
        if (r13 >= r9) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0255, code lost:
        if ((r12 + r14) >= r4) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
        r8 = Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x025a, code lost:
        if (r6[3] < r7) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x025c, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x025d, code lost:
        r2 = r11 + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x025f, code lost:
        if (r2 >= r9) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0261, code lost:
        r0 = r12 + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0263, code lost:
        if (r0 >= r4) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0269, code lost:
        if (r10.A03(r0, r2) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x026b, code lost:
        r0 = r6[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x026d, code lost:
        if (r0 >= r7) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x026f, code lost:
        r6[4] = r0 + 1;
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0276, code lost:
        r4 = r6[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0278, code lost:
        if (r4 >= r7) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x028e, code lost:
        if (java.lang.Math.abs(((((r6[0] + r6[1]) + r6[2]) + r6[3]) + r4) - r5) >= (r5 << 1)) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0294, code lost:
        if (A00(r6) == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0121, code lost:
        r1 = Float.NaN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A02(int[] r21, int r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 767
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24891Dg.A02(int[], int, int, boolean):boolean");
    }
}
