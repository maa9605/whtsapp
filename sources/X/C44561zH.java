package X;

import java.util.Collections;

/* renamed from: X.1zH  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44561zH extends AbstractC44571zI {
    public final C44581zJ A00;
    public final C0FO A01;
    public final AnonymousClass012 A02;
    public final C05A A03;
    public final C05M A04;
    public final C0CA A05;
    public final C0CB A06;

    public C44561zH(AnonymousClass012 anonymousClass012, C05A c05a, C05M c05m, C0FO c0fo, C44581zJ c44581zJ, C0CB c0cb, C44351yv c44351yv, C0CA c0ca) {
        super(c44351yv);
        this.A02 = anonymousClass012;
        this.A03 = c05a;
        this.A04 = c05m;
        this.A01 = c0fo;
        this.A00 = c44581zJ;
        this.A06 = c0cb;
        this.A05 = c0ca;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r1.A04 >= r11.A04) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        A05(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
        if (r1.A04 >= r11.A04) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A08(X.C44601zL r11) {
        /*
            r10 = this;
            boolean r5 = r11.A02
            r7 = 0
            r6 = 1
            if (r5 == 0) goto L60
            X.02j r2 = r11.A01
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r0 = "pin"
            r1[r7] = r0
            java.lang.String r0 = r2.getRawString()
            r1[r6] = r0
            java.lang.String r9 = X.AbstractC44611zM.A00(r1)
            X.1yv r8 = r10.A00
            X.1zM r1 = r8.A08(r9)
            if (r1 == 0) goto L3d
            X.204 r0 = r1.A02()
            if (r0 == 0) goto L5c
            X.20G r0 = r0.A0D
            if (r0 != 0) goto L2d
            X.20G r0 = X.C20G.A02
        L2d:
            boolean r0 = r0.A01
            if (r0 == 0) goto L3d
            long r2 = r1.A04
            long r0 = r11.A04
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 < 0) goto L3d
        L39:
            r10.A05(r11)
            return
        L3d:
            X.1zM r1 = r8.A07(r9)
            if (r1 == 0) goto L60
            X.204 r0 = r1.A02()
            if (r0 == 0) goto L5e
            X.20G r0 = r0.A0D
            if (r0 != 0) goto L4f
            X.20G r0 = X.C20G.A02
        L4f:
            boolean r0 = r0.A01
            if (r0 == 0) goto L60
            long r3 = r1.A04
            long r1 = r11.A04
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L60
            goto L39
        L5c:
            r0 = 0
            throw r0
        L5e:
            r0 = 0
            throw r0
        L60:
            X.02j r1 = r11.A01
            X.05M r0 = r10.A04
            X.0IT r2 = r0.A07(r1)
            if (r2 != 0) goto L6e
            r10.A06(r11)
            return
        L6e:
            X.1zJ r0 = r10.A00
            X.1zK r1 = r0.A02(r1, r7)
            X.1zK r0 = r11.A00
            int r1 = X.C44591zK.A00(r1, r0)
            if (r1 == 0) goto La4
            if (r1 == r6) goto L9d
            r0 = 2
            if (r1 == r0) goto L90
            r0 = 3
            if (r1 == r0) goto La4
            java.lang.String r0 = "archive-chat-handler/applyMutation RangeEnclosedState is not recognized or not used = "
            java.lang.String r1 = X.C000200d.A0D(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L90:
            r10.A09(r11, r2)
            if (r5 == 0) goto L99
            r10.A06(r11)
            return
        L99:
            r10.A05(r11)
            return
        L9d:
            r10.A09(r11, r2)
            r10.A06(r11)
            return
        La4:
            r10.A05(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44561zH.A08(X.1zL):void");
    }

    public final void A09(C44601zL c44601zL, C0IT c0it) {
        boolean z = c0it.A0S;
        boolean z2 = c44601zL.A02;
        if (z != z2) {
            c0it.A0S = z2;
            this.A03.A0C(c0it);
            this.A01.A01();
            if (z2) {
                C0CB c0cb = this.A06;
                AbstractC005302j abstractC005302j = c44601zL.A01;
                if (c0cb.A07(abstractC005302j).A0E) {
                    c0cb.A0B(abstractC005302j, false, 0L);
                    super.A00.A0G(Collections.singleton(new C44671zS(null, abstractC005302j, false, c44601zL.A04, null, false)));
                }
            }
        }
    }
}
