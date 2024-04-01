package X;

/* renamed from: X.1o6 */
/* loaded from: classes.dex */
public class C38411o6 extends C28591Sr {
    public int A00 = 0;
    public boolean A02 = true;
    public int A01 = 0;

    @Override // X.C0YF
    public boolean A0G() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0070, code lost:
        if (r14.A0X.A04() != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0082, code lost:
        if (r14.A0S.A04() != false) goto L89;
     */
    @Override // X.C0YF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0B(X.C0YG r15) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38411o6.A0B(X.0YG):void");
    }

    @Override // X.C0YF
    public String toString() {
        String A0L = C000200d.A0L(C000200d.A0P("[Barrier] "), this.A0f, " {");
        for (int i = 0; i < ((C28591Sr) this).A00; i++) {
            C0YF c0yf = ((C28591Sr) this).A01[i];
            if (i > 0) {
                A0L = C000200d.A0H(A0L, ", ");
            }
            StringBuilder A0P = C000200d.A0P(A0L);
            A0P.append(c0yf.A0f);
            A0L = A0P.toString();
        }
        return C000200d.A0H(A0L, "}");
    }
}
