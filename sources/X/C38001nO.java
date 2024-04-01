package X;

import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* renamed from: X.1nO  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38001nO implements C1QK {
    public int A00 = 0;
    public C40601sX A01;
    public C05080Nf A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final C010005b A07;
    public final C04000Ia A08;
    public final C40601sX A09;
    public final C40601sX A0A;
    public final C0IY A0B;
    public final C0G8 A0C;
    public final C03R A0D;
    public final String A0E;
    public final String A0F;

    public C38001nO(C03R c03r, C0IY c0iy, C010005b c010005b, C04000Ia c04000Ia, C40601sX c40601sX, C40601sX c40601sX2, String str, long j, String str2, int i, int i2, long j2, boolean z) {
        C0G8 c0g8;
        this.A0B = c0iy;
        this.A0A = c40601sX;
        this.A09 = c40601sX2;
        this.A0E = str;
        this.A05 = j;
        this.A0F = str2;
        this.A0D = c03r;
        this.A07 = c010005b;
        this.A08 = c04000Ia;
        this.A04 = i;
        this.A03 = i2;
        this.A06 = j2;
        if (i2 > 0 && z) {
            c0g8 = new C0G8(new Random(), i2, 3000L);
        } else {
            c0g8 = null;
        }
        this.A0C = c0g8;
        A03(false);
    }

    public static C40601sX A00(Collection collection, String str, String str2, String str3, boolean z) {
        Set set;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C40601sX c40601sX = (C40601sX) it.next();
            if (c40601sX.A04.endsWith(".whatsapp.net") && (str == null || str.equals(c40601sX.A08))) {
                if (z) {
                    Set set2 = c40601sX.A0B;
                    if (set2 != null && !set2.contains(str2)) {
                    }
                    if (str3 != null || ((set = c40601sX.A0A) != null && set.contains(str3))) {
                        return c40601sX;
                    }
                } else {
                    Set set3 = c40601sX.A09;
                    if (set3 != null && !set3.contains(str2)) {
                    }
                    if (str3 != null) {
                    }
                    return c40601sX;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C3VY A01(X.AnonymousClass012 r17, X.AbstractC000600i r18, X.C01B r19, X.C02600Cb r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38001nO.A01(X.012, X.00i, X.01B, X.0Cb, java.lang.String, java.lang.String, java.lang.String, boolean):X.3VY");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C38001nO A02(X.AnonymousClass012 r21, X.C003701t r22, X.C03R r23, X.AbstractC000600i r24, X.C01B r25, X.C0IY r26, X.C010005b r27, X.C04000Ia r28, X.C02600Cb r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, int r33, long r34, int r36) {
        /*
            r0 = 256(0x100, float:3.59E-43)
            r2 = r22
            boolean r0 = r2.A0C(r0)
            r5 = r33
            if (r0 == 0) goto L37
            if (r33 != 0) goto L37
            r0 = 258(0x102, float:3.62E-43)
            int r18 = r2.A03(r0)
        L14:
            r1 = 257(0x101, float:3.6E-43)
            r8 = r26
            r7 = r23
            r9 = r27
            r10 = r28
            r19 = r34
            r6 = r29
            if (r29 != 0) goto L3a
            r11 = 0
            r14 = 0
            int r17 = 4 - r36
            boolean r21 = r2.A0C(r1)
            r12 = r11
            r13 = r11
            r16 = r11
            X.1nO r6 = new X.1nO
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r21)
            return r6
        L37:
            r18 = 0
            goto L14
        L3a:
            long r14 = r6.A04
            java.lang.String r13 = r6.A08
            int r3 = 4 - r36
            r4 = 1
            if (r4 != r5) goto L70
            int r3 = r6.A00
        L45:
            int r3 = r3 + r4
        L46:
            r28 = 0
            if (r33 != 0) goto L4c
            r28 = 1
        L4c:
            r23 = r25
            r22 = r24
            r27 = r32
            r26 = r31
            r25 = r30
            r24 = r6
            X.3VY r0 = A01(r21, r22, r23, r24, r25, r26, r27, r28)
            X.1sX r11 = r0.A01
            X.1sX r12 = r0.A00
            java.lang.String r0 = r0.A02
            boolean r21 = r2.A0C(r1)
            r17 = r3
            r16 = r0
            X.1nO r6 = new X.1nO
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r21)
            return r6
        L70:
            if (r33 == 0) goto L7b
            r0 = 2
            if (r0 == r5) goto L7b
            java.lang.String r0 = "Mms4RouteSupplier/invalid mode = "
            X.C000200d.A0p(r0, r5)
            goto L46
        L7b:
            int r3 = r6.A01
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38001nO.A02(X.012, X.01t, X.03R, X.00i, X.01B, X.0IY, X.05b, X.0Ia, X.0Cb, java.lang.String, java.lang.String, java.lang.String, int, long, int):X.1nO");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r17.A07.A05 == false) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A03(boolean r18) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38001nO.A03(boolean):void");
    }

    @Override // X.C1QK
    public long A8V() {
        C0G8 c0g8 = this.A0C;
        if (c0g8 != null && this.A00 >= this.A04) {
            Long A01 = c0g8.A01();
            if (A01 != null) {
                return A01.longValue();
            }
            Log.e("Mms4RouteSupplier/getBackoffTime unexpected exponential backoff of null");
        }
        return this.A06;
    }

    @Override // X.C1QK
    public C05080Nf A9V() {
        return this.A02;
    }

    @Override // X.C1QK
    public void AK0(boolean z, int i) {
        if (i != -1) {
            this.A0B.A08(i);
        }
        this.A00++;
        A03(z);
    }
}
