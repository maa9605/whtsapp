package X;

/* renamed from: X.2BO  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2BO {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public C2BO(int i, int i2, int i3, int i4, int i5) {
        this.A01 = i;
        this.A04 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A02 = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r11 == 4) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C2BO A00(java.lang.String r12) {
        /*
            java.lang.String r0 = "\\."
            java.lang.String[] r6 = r12.split(r0)     // Catch: java.lang.Exception -> L3a
            int r11 = r6.length     // Catch: java.lang.Exception -> L3a
            r5 = 4
            r4 = 1
            r3 = 3
            r2 = 0
            if (r11 == r3) goto L10
            r1 = 0
            if (r11 != r5) goto L11
        L10:
            r1 = 1
        L11:
            java.lang.String r0 = "Version name must have 3 or 4 parts"
            X.C000700j.A09(r1, r0)     // Catch: java.lang.Exception -> L3a
            r0 = r6[r2]     // Catch: java.lang.Exception -> L3a
            int r7 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L3a
            r0 = r6[r4]     // Catch: java.lang.Exception -> L3a
            int r8 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L3a
            r0 = 2
            r0 = r6[r0]     // Catch: java.lang.Exception -> L3a
            int r9 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L3a
            if (r11 != r5) goto L37
            r0 = r6[r3]     // Catch: java.lang.Exception -> L3a
            int r10 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L3a
        L31:
            X.2BO r6 = new X.2BO     // Catch: java.lang.Exception -> L3a
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L3a
            goto L39
        L37:
            r10 = 0
            goto L31
        L39:
            return r6
        L3a:
            r2 = move-exception
            java.lang.String r0 = "version/parse ["
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r12)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2BO.A00(java.lang.String):X.2BO");
    }

    public int A01(C2BO c2bo) {
        int i = this.A01;
        int i2 = c2bo.A01;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = this.A04;
        int i4 = c2bo.A04;
        if (i3 < i4) {
            return -1;
        }
        if (i3 > i4) {
            return 1;
        }
        int i5 = this.A03;
        int i6 = c2bo.A03;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = this.A00;
        int i8 = c2bo.A00;
        if (i7 < i8) {
            return -1;
        }
        return i7 > i8 ? 1 : 0;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append(".");
        sb.append(this.A04);
        sb.append(".");
        sb.append(this.A03);
        if (this.A02 == 4) {
            StringBuilder A0P = C000200d.A0P(".");
            A0P.append(this.A00);
            str = A0P.toString();
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
