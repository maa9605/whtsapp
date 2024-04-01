package X;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.22d */
/* loaded from: classes2.dex */
public class C454622d implements C22e {
    public int A00;
    public AnonymousClass234 A01;
    public boolean A02;
    public byte[] A03;
    public final C0CK A04;
    public final C0CK A05;
    public final C0CK A0A;
    public final C0CK A0B;
    public final C0CK A0D;
    public final C0CK A0E;
    public final C0CK A0F;
    public final C0CK A0G;
    public final InterfaceC43611xg A0H;
    public final C04140Is A0I;
    public final C22v A0J;
    public final C454422b A0K;
    public final C0CG A0L;
    public final C0CG A0M;
    public final C0CG A0N;
    public final C0CG A0O;
    public volatile String A0S;
    public final Object A0P = new Object();
    public final AtomicBoolean A0Q = new AtomicBoolean();
    public final AtomicBoolean A0R = new AtomicBoolean();
    public final C0CK A08 = new C0CK();
    public final C0CK A06 = new C0CK();
    public final C0CK A07 = new C0CK();
    public final C0CK A09 = new C0CK();
    public final C0CK A0C = new C0CK();

    public C454622d(C04140Is c04140Is, C454422b c454422b, C22v c22v, InterfaceC43611xg interfaceC43611xg) {
        C0CK c0ck = new C0CK();
        this.A0B = c0ck;
        C0CK c0ck2 = new C0CK();
        this.A0A = c0ck2;
        C0CK c0ck3 = new C0CK();
        this.A0E = c0ck3;
        C0CK c0ck4 = new C0CK();
        this.A0F = c0ck4;
        this.A0G = new C0CK();
        this.A0D = new C0CK();
        this.A04 = new C0CK();
        this.A05 = new C0CK();
        this.A0L = c0ck2;
        this.A0M = c0ck;
        this.A0N = c0ck3;
        this.A0O = c0ck4;
        this.A0K = c454422b;
        this.A0I = c04140Is;
        this.A0J = c22v;
        AnonymousClass232 anonymousClass232 = c454422b.A01;
        byte b = anonymousClass232.A05.A00;
        int i = anonymousClass232.A01;
        synchronized (c22v) {
            c22v.A05 = Integer.valueOf(C002701i.A00(b, i, false));
        }
        C22v c22v2 = this.A0J;
        boolean z = c454422b.A00.A0B;
        synchronized (c22v2) {
            c22v2.A08 = z;
        }
        File file = anonymousClass232.A07;
        if (file != null) {
            this.A07.A04(new C0KW(file, true));
        }
        this.A0H = interfaceC43611xg;
    }

    public C04140Is A00() {
        C04140Is c04140Is = this.A0I;
        if (c04140Is != null) {
            return c04140Is;
        }
        throw null;
    }

    public C22v A01() {
        C22v c22v = this.A0J;
        if (c22v != null) {
            return c22v;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C43591xe A02() {
        /*
            r25 = this;
            r1 = r25
            X.22b r0 = r1.A0K
            X.1xe r8 = r0.A00
            java.lang.String r0 = r1.A0S
            if (r0 == 0) goto L8a
            java.lang.String r6 = r1.A0S
        Lc:
            X.0CK r0 = r1.A07
            java.lang.Object r7 = r0.A00()
            X.0KW r7 = (X.C0KW) r7
            X.0CK r0 = r1.A0C
            java.lang.Object r4 = r0.A00()
            X.235 r4 = (X.AnonymousClass235) r4
            java.io.File r1 = r8.A06
            java.lang.String r14 = r8.A08
            java.lang.String r15 = r8.A07
            long r11 = r8.A02
            int[] r5 = r8.A0E
            java.lang.String r2 = r8.A09
            int r3 = r8.A00
            r24 = 0
            if (r7 == 0) goto L87
            java.io.File r10 = r7.A01
            boolean r0 = r10.equals(r1)
            if (r0 != 0) goto L87
            long r11 = r7.A00
            r14 = r24
            r15 = r14
            r7 = 1
        L3c:
            boolean r0 = r4 instanceof X.C3G2
            if (r0 == 0) goto L4d
            r0 = r4
            X.3G2 r0 = (X.C3G2) r0
            int[] r1 = r0.A05
            boolean r0 = java.util.Arrays.equals(r1, r5)
            if (r0 != 0) goto L4d
            r5 = r1
            r7 = 1
        L4d:
            boolean r0 = r4 instanceof X.C3G3
            if (r0 == 0) goto L85
            X.3G3 r4 = (X.C3G3) r4
            int r4 = r4.A02
            if (r4 == r3) goto L85
            r7 = 1
        L58:
            boolean r0 = r6.equals(r2)
            if (r0 == 0) goto L61
            r6 = r2
            if (r7 == 0) goto L84
        L61:
            X.0DC r9 = r8.A05
            X.1xh r13 = r8.A03
            int r7 = r8.A01
            boolean r3 = r8.A0C
            boolean r2 = r8.A0A
            boolean r1 = r8.A0D
            boolean r0 = r8.A0B
            r18 = r6
            r19 = r2
            r20 = r1
            r21 = r5
            r22 = r4
            r23 = r0
            r16 = r7
            r17 = r3
            X.1xe r8 = new X.1xe
            r8.<init>(r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L84:
            return r8
        L85:
            r4 = r3
            goto L58
        L87:
            r7 = 0
            r10 = r1
            goto L3c
        L8a:
            java.lang.String r6 = "optimistic"
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C454622d.A02():X.1xe");
    }

    public AnonymousClass232 A03() {
        AnonymousClass232 anonymousClass232 = this.A0K.A01;
        C0KW c0kw = (C0KW) this.A07.A00();
        if (anonymousClass232 != null) {
            return c0kw != null ? new AnonymousClass232(anonymousClass232.A08, c0kw.A01, anonymousClass232.A0B, anonymousClass232.A09, anonymousClass232.A0A, anonymousClass232.A05, anonymousClass232.A00, anonymousClass232.A01, anonymousClass232.A02, anonymousClass232.A03, anonymousClass232.A0D, anonymousClass232.A0G, anonymousClass232.A0C, anonymousClass232.A06, anonymousClass232.A04, false, anonymousClass232.A0F) : anonymousClass232;
        }
        throw null;
    }

    public void A04() {
        this.A08.A01();
        this.A07.A01();
        this.A06.A01();
        this.A09.A01();
        this.A0B.A01();
        this.A0A.A01();
        this.A0C.A01();
        this.A0E.A01();
        this.A0F.A01();
        this.A0G.A01();
        this.A0D.A01();
    }

    public void A05(int i) {
        this.A09.A04(Integer.valueOf(i));
    }
}
