package X;

import java.util.List;

/* renamed from: X.2TY  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2TY {
    public final int A00;
    public final C22H A01;
    public final List A02;
    public final boolean A03;

    public C2TY(C22H c22h, List list, boolean z, int i) {
        this.A01 = c22h;
        this.A02 = list;
        this.A03 = z;
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r3 == X.C22H.A01) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C2TY A00(X.C22H r3, java.lang.String r4, com.whatsapp.jid.UserJid r5, int r6) {
        /*
            X.22H r0 = X.C22H.A08
            r2 = 1
            if (r3 == r0) goto La
            X.22H r1 = X.C22H.A01
            r0 = 0
            if (r3 != r1) goto Lb
        La:
            r0 = 1
        Lb:
            X.C000700j.A07(r0)
            X.29M r0 = new X.29M
            r0.<init>(r5, r4)
            r0.A07 = r2
            r0.A0E = r2
            r0.A0C = r2
            r0.A06 = r2
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.2TY r0 = new X.2TY
            r0.<init>(r3, r1, r2, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2TY.A00(X.22H, java.lang.String, com.whatsapp.jid.UserJid, int):X.2TY");
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("[mode=");
        C22H c22h = this.A01;
        A0P.append(c22h.mode.modeString);
        StringBuilder sb = new StringBuilder(A0P.toString());
        sb.append(" context=");
        sb.append(c22h.context.contextString);
        sb.append(" requests=");
        sb.append(this.A02.size());
        sb.append("]");
        return sb.toString();
    }
}
