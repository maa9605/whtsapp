package X;

/* renamed from: X.49i  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C900149i {
    public static volatile C900149i A04;
    public final C02L A00;
    public final C002301c A01;
    public final C0DV A02;
    public final C03750Gx A03;

    public C900149i(C02L c02l, C03750Gx c03750Gx, C002301c c002301c, C0DV c0dv) {
        this.A00 = c02l;
        this.A03 = c03750Gx;
        this.A01 = c002301c;
        this.A02 = c0dv;
    }

    public static C900149i A00() {
        if (A04 == null) {
            synchronized (C900149i.class) {
                if (A04 == null) {
                    C02L A00 = C02L.A00();
                    C03750Gx A02 = C03750Gx.A02();
                    C002301c A002 = C002301c.A00();
                    C0DV A003 = C0DV.A00();
                    C013606n.A03();
                    A04 = new C900149i(A00, A02, A002, A003);
                }
            }
        }
        return A04;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0309, code lost:
        if (r1 == 200) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0143, code lost:
        if (r0 == 200) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A01(X.AnonymousClass093 r19, X.InterfaceC06790Va r20) {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C900149i.A01(X.093, X.0Va):java.lang.String");
    }
}
