package X;

import android.graphics.Color;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.0mN */
/* loaded from: classes.dex */
public final class C14080mN {
    public static final Comparator A05 = new Comparator() { // from class: X.0mL
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            C14070mM c14070mM = (C14070mM) obj;
            C14070mM c14070mM2 = (C14070mM) obj2;
            int i = (c14070mM2.A03 - c14070mM2.A06) + 1;
            int i2 = (c14070mM2.A01 - c14070mM2.A04) + 1;
            int i3 = (c14070mM.A03 - c14070mM.A06) + 1;
            return (i2 * (((c14070mM2.A02 - c14070mM2.A05) + 1) * i)) - (((c14070mM.A01 - c14070mM.A04) + 1) * (((c14070mM.A02 - c14070mM.A05) + 1) * i3));
        }
    };
    public final List A00;
    public final float[] A01 = new float[3];
    public final int[] A02;
    public final int[] A03;
    public final InterfaceC14110mQ[] A04;

    /* JADX WARN: Code restructure failed: missing block: B:157:0x014a, code lost:
        if (r2 < r1) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C14080mN(int[] r14, X.InterfaceC14110mQ[] r15) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14080mN.<init>(int[], X.0mQ[]):void");
    }

    public static int A00(int i, int i2, int i3) {
        int i4 = (1 << 8) - 1;
        return Color.rgb((i << 3) & i4, (i2 << 3) & i4, (i3 << 3) & i4);
    }

    public static void A01(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
        } else if (i != -1) {
        } else {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
                i2++;
            }
        }
    }
}
