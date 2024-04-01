package X;

/* renamed from: X.0QS  reason: invalid class name */
/* loaded from: classes.dex */
public class C0QS {
    public final C0IO A00;
    public final String A01;

    public C0QS(String str, C0IO c0io) {
        this.A01 = str;
        this.A00 = c0io;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0QS)) {
            C0QS c0qs = (C0QS) obj;
            return this.A01.equals(c0qs.A01) && this.A00.equals(c0qs.A00);
        }
        return false;
    }

    public int hashCode() {
        return this.A01.hashCode() ^ this.A00.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
        if (r1 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r7 = this;
            java.lang.String r4 = r7.A01
            java.lang.String r5 = "@"
            boolean r0 = r4.contains(r5)
            r3 = 4
            if (r0 == 0) goto L3c
            int r1 = r4.indexOf(r5)
            r0 = 0
            java.lang.String r6 = r4.substring(r0, r1)
            int r0 = r1 + 1
            java.lang.String r2 = r4.substring(r0)
            java.lang.String r0 = "g.us"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 15
            java.lang.String r0 = X.AnonymousClass024.A0J(r6, r0)
            r1.append(r0)
            r1.append(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L3a:
            if (r1 != 0) goto L40
        L3c:
            java.lang.String r1 = X.AnonymousClass024.A0J(r4, r3)
        L40:
            java.lang.String r0 = "::"
            java.lang.StringBuilder r1 = X.C000200d.A0V(r1, r0)
            X.0IO r0 = r7.A00
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L50:
            java.lang.String r0 = "broadcast"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L3c
            X.0Kz r0 = X.C04580Kz.A00
            java.lang.String r0 = r0.getRawString()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L66
            r1 = r4
            goto L40
        L66:
            X.0Zq r0 = X.C0Zq.A00
            java.lang.String r0 = r0.getRawString()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L74
            r1 = r4
            goto L40
        L74:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = X.AnonymousClass024.A0J(r6, r3)
            r1.append(r0)
            r1.append(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QS.toString():java.lang.String");
    }
}
