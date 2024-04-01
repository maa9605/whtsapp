package X;

import android.os.Build;
import java.security.InvalidParameterException;

/* renamed from: X.43g  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C884743g {
    public static C884743g A04;
    public static C884743g A05;
    public static C884743g A06;
    public static C884743g A07;
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;

    static {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        int i = Build.VERSION.SDK_INT;
        A04 = new C884743g(null, str, str2, i);
        A05 = new C884743g(null, str, str2, -1);
        String str3 = Build.PRODUCT;
        A06 = new C884743g(str3, null, null, i);
        A07 = new C884743g(str3, null, null, -1);
    }

    public C884743g(String str, String str2) {
        this("", str, str2, -1);
    }

    public C884743g(String str, String str2, String str3, int i) {
        str = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        str3 = str3 == null ? "" : str3;
        if (str2.isEmpty() == str3.isEmpty()) {
            this.A03 = str;
            this.A01 = str2;
            this.A02 = str3;
            this.A00 = i;
            return;
        }
        throw new InvalidParameterException("Must specify manufacturer and model");
    }

    public String A00() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append(':');
        sb.append(this.A02);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r5.A02.isEmpty() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r4.A02.isEmpty() != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.C884743g
            r3 = 0
            if (r0 != 0) goto L6
            return r3
        L6:
            X.43g r5 = (X.C884743g) r5
            java.lang.String r0 = r4.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L19
            java.lang.String r0 = r4.A02
            boolean r0 = r0.isEmpty()
            r2 = 1
            if (r0 == 0) goto L1a
        L19:
            r2 = 0
        L1a:
            java.lang.String r0 = r5.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2b
            java.lang.String r0 = r5.A02
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 == 0) goto L2c
        L2b:
            r0 = 0
        L2c:
            if (r2 == 0) goto L4b
            if (r0 == 0) goto L4b
            java.lang.String r1 = r4.A00()
            java.lang.String r0 = r5.A00()
            boolean r0 = r1.equals(r0)
        L3c:
            if (r0 == 0) goto L4a
            int r2 = r4.A00
            r1 = -1
            if (r2 == r1) goto L49
            int r0 = r5.A00
            if (r0 == r1) goto L49
            if (r2 != r0) goto L4a
        L49:
            r3 = 1
        L4a:
            return r3
        L4b:
            java.lang.String r2 = r4.A03
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L4a
            java.lang.String r1 = r5.A03
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L4a
            boolean r0 = r2.equals(r1)
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C884743g.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r2.A02.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int hashCode() {
        /*
            r2 = this;
            java.lang.String r0 = r2.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L11
            java.lang.String r0 = r2.A02
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 == 0) goto L12
        L11:
            r0 = 0
        L12:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r0 == 0) goto L33
            java.lang.String r0 = r2.A00()
        L1d:
            r1.append(r0)
            java.lang.String r0 = ":"
            r1.append(r0)
            int r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            int r0 = r0.hashCode()
            return r0
        L33:
            java.lang.String r0 = r2.A03
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C884743g.hashCode():int");
    }
}
