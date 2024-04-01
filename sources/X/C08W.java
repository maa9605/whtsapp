package X;

import java.util.Arrays;

/* renamed from: X.08W  reason: invalid class name */
/* loaded from: classes.dex */
public final class C08W {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r3.trim().isEmpty() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C08W(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L10
            java.lang.String r0 = r3.trim()
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L11
        L10:
            r0 = 1
        L11:
            r1 = r0 ^ 1
            java.lang.String r0 = "ApplicationId must be set."
            X.C07K.A1c(r1, r0)
            r2.A01 = r3
            r2.A00 = r4
            r2.A02 = r5
            r2.A03 = r6
            r2.A04 = r7
            r2.A06 = r8
            r2.A05 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08W.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public boolean equals(Object obj) {
        if (obj instanceof C08W) {
            C08W c08w = (C08W) obj;
            return C07K.A1k(this.A01, c08w.A01) && C07K.A1k(this.A00, c08w.A00) && C07K.A1k(this.A02, c08w.A02) && C07K.A1k(this.A03, c08w.A03) && C07K.A1k(this.A04, c08w.A04) && C07K.A1k(this.A06, c08w.A06) && C07K.A1k(this.A05, c08w.A05);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00, this.A02, this.A03, this.A04, this.A06, this.A05});
    }

    public String toString() {
        C08L A0q = C07K.A0q(this);
        A0q.A00("applicationId", this.A01);
        A0q.A00("apiKey", this.A00);
        A0q.A00("databaseUrl", this.A02);
        A0q.A00("gcmSenderId", this.A04);
        A0q.A00("storageBucket", this.A06);
        A0q.A00("projectId", this.A05);
        return A0q.toString();
    }
}
