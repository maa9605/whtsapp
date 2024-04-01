package X;

/* renamed from: X.1DU  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DU {
    public final C1DN A00 = new C1DN(C1DL.A09);

    /* JADX WARN: Removed duplicated region for block: B:11:0x0014 A[Catch: 1fP -> 0x007a, 1fP | 1fQ -> 0x007c, TryCatch #3 {1fP | 1fQ -> 0x007c, blocks: (B:9:0x0010, B:11:0x0014, B:15:0x001b, B:19:0x0029, B:21:0x002f, B:22:0x0032, B:23:0x0035, B:24:0x0038, B:25:0x003d, B:26:0x003e, B:27:0x004c, B:29:0x0052, B:30:0x0055, B:32:0x0059, B:34:0x0063, B:35:0x0069, B:37:0x006e), top: B:49:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052 A[Catch: 1fP -> 0x007a, 1fP | 1fQ -> 0x007c, TryCatch #3 {1fP | 1fQ -> 0x007c, blocks: (B:9:0x0010, B:11:0x0014, B:15:0x001b, B:19:0x0029, B:21:0x002f, B:22:0x0032, B:23:0x0035, B:24:0x0038, B:25:0x003d, B:26:0x003e, B:27:0x004c, B:29:0x0052, B:30:0x0055, B:32:0x0059, B:34:0x0063, B:35:0x0069, B:37:0x006e), top: B:49:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C1DI A00(X.C1DF r11, java.util.Map r12) {
        /*
            r10 = this;
            X.1DQ r6 = new X.1DQ
            r6.<init>(r11)
            r9 = 0
            X.1DI r0 = r10.A01(r6, r12)     // Catch: X.C33131fP -> Lb X.C33141fQ -> Le
            return r0
        Lb:
            r8 = move-exception
            r7 = r9
            goto L10
        Le:
            r7 = move-exception
            r8 = r9
        L10:
            X.1DW r0 = r6.A00     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            if (r0 == 0) goto L3e
            byte r1 = r0.A00     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            if (r1 < 0) goto L38
            r0 = 7
            if (r1 > r0) goto L38
            X.1DS[] r0 = X.C1DS.A00     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            r5 = r0[r1]     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            X.1DF r4 = r6.A03     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            int r3 = r4.A00     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            r2 = 0
        L24:
            if (r2 >= r3) goto L3e
            r1 = 0
        L27:
            if (r1 >= r3) goto L35
            boolean r0 = r5.A00(r2, r1)     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            if (r0 == 0) goto L32
            r4.A00(r1, r2)     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
        L32:
            int r1 = r1 + 1
            goto L27
        L35:
            int r2 = r2 + 1
            goto L24
        L38:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            r0.<init>()     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            throw r0     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
        L3e:
            r6.A01 = r9     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            r6.A00 = r9     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            r0 = 1
            r6.A02 = r0     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            r6.A02()     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            r6.A01()     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            r5 = 0
        L4c:
            X.1DF r4 = r6.A03     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            int r0 = r4.A02     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            if (r5 >= r0) goto L6e
            int r3 = r5 + 1
            r2 = r3
        L55:
            int r0 = r4.A00     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            if (r2 >= r0) goto L6c
            boolean r1 = r4.A03(r5, r2)     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            boolean r0 = r4.A03(r2, r5)     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            if (r1 == r0) goto L69
            r4.A00(r2, r5)     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            r4.A00(r5, r2)     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
        L69:
            int r2 = r2 + 1
            goto L55
        L6c:
            r5 = r3
            goto L4c
        L6e:
            X.1DI r1 = r10.A01(r6, r12)     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            X.1DY r0 = new X.1DY     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            r0.<init>()     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            r1.A00 = r0     // Catch: X.C33131fP -> L7a X.C33141fQ -> L7c
            return r1
        L7a:
            r0 = move-exception
            goto L7d
        L7c:
            r0 = move-exception
        L7d:
            if (r7 != 0) goto L83
            if (r8 == 0) goto L82
            throw r8
        L82:
            throw r0
        L83:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DU.A00(X.1DF, java.util.Map):X.1DI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:323:0x05ef, code lost:
        if (r9[2] != (-65)) goto L556;
     */
    /* JADX WARN: Type inference failed for: r13v2, types: [X.1DG] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C1DI A01(X.C1DQ r42, java.util.Map r43) {
        /*
            Method dump skipped, instructions count: 1964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DU.A01(X.1DQ, java.util.Map):X.1DI");
    }
}
