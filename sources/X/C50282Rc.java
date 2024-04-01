package X;

/* renamed from: X.2Rc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C50282Rc extends C50292Rd {
    public final int responseCode;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0026, code lost:
        if (r3 >= 500) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
        if (r4.contains("URL signature expired") != false) goto L22;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C50282Rc(int r3, java.lang.String r4) {
        /*
            r2 = this;
            r0 = 400(0x190, float:5.6E-43)
            if (r3 == r0) goto L28
            r0 = 401(0x191, float:5.62E-43)
            if (r3 == r0) goto L3d
            r0 = 403(0x193, float:5.65E-43)
            if (r3 == r0) goto L31
            r0 = 404(0x194, float:5.66E-43)
            if (r3 == r0) goto L3b
            r0 = 408(0x198, float:5.72E-43)
            if (r3 == r0) goto L28
            r0 = 410(0x19a, float:5.75E-43)
            if (r3 == r0) goto L3b
            r0 = 416(0x1a0, float:5.83E-43)
            r1 = 6
            if (r3 == r0) goto L2a
            r0 = 507(0x1fb, float:7.1E-43)
            r1 = 12
            if (r3 == r0) goto L2a
            r0 = 500(0x1f4, float:7.0E-43)
            r1 = -1
            if (r3 < r0) goto L2a
        L28:
            r1 = 16
        L2a:
            r0 = 0
            r2.<init>(r0, r0, r1)
            r2.responseCode = r3
            return
        L31:
            if (r4 == 0) goto L3d
            java.lang.String r0 = "URL signature expired"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L3d
        L3b:
            r1 = 5
            goto L2a
        L3d:
            r1 = 8
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50282Rc.<init>(int, java.lang.String):void");
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder A0P = C000200d.A0P("failed to download; code=");
        A0P.append(this.responseCode);
        A0P.append("; status=");
        A0P.append(C04020Ic.A00(this.downloadStatus));
        return A0P.toString();
    }
}
