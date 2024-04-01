package X;

import java.util.Set;

/* renamed from: X.17G  reason: invalid class name */
/* loaded from: classes.dex */
public final class C17G {
    public String A00;
    public Set A01;
    public final AnonymousClass176 A02;
    public volatile Boolean A03;

    public C17G(AnonymousClass176 anonymousClass176) {
        C07K.A1P(anonymousClass176);
        this.A02 = anonymousClass176;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r0.equals(r5) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Set A00() {
        /*
            r6 = this;
            X.17M r0 = X.C17L.A00
            java.lang.Object r5 = r0.A00
            java.lang.String r5 = (java.lang.String) r5
            java.util.Set r4 = r6.A01
            if (r4 == 0) goto L14
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto L14
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L37
        L14:
            java.lang.String r0 = ","
            java.lang.String[] r3 = android.text.TextUtils.split(r5, r0)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            int r2 = r3.length
            r1 = 0
        L21:
            if (r1 >= r2) goto L33
            r0 = r3[r1]
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L30
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L30
            r4.add(r0)     // Catch: java.lang.NumberFormatException -> L30
        L30:
            int r1 = r1 + 1
            goto L21
        L33:
            r6.A00 = r5
            r6.A01 = r4
        L37:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17G.A00():java.util.Set");
    }
}
