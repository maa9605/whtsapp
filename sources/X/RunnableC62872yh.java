package X;

/* renamed from: X.2yh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC62872yh extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C04130Ir A00;
    public final /* synthetic */ C41771uU A01;
    public final /* synthetic */ C454622d A02;
    public final /* synthetic */ C22a A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ byte[] A06;

    public /* synthetic */ RunnableC62872yh(C41771uU c41771uU, C454622d c454622d, C04130Ir c04130Ir, C22a c22a, boolean z, boolean z2, byte[] bArr) {
        this.A01 = c41771uU;
        this.A02 = c454622d;
        this.A00 = c04130Ir;
        this.A03 = c22a;
        this.A04 = z;
        this.A05 = z2;
        this.A06 = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass235 anonymousClass235;
        C0KY c0ky;
        C41771uU c41771uU = this.A01;
        C454622d c454622d = this.A02;
        C04130Ir c04130Ir = this.A00;
        C22a c22a = this.A03;
        boolean z = this.A04;
        boolean z2 = this.A05;
        byte[] bArr = this.A06;
        if (c454622d != null) {
            Number number = (Number) c454622d.A09.A00();
            if (!c454622d.A02 && (number == null || number.intValue() == 0)) {
                if (c454622d.A0S == null) {
                    c41771uU.A07(c454622d, c04130Ir);
                    C22v A01 = c454622d.A01();
                    synchronized (A01) {
                        if (!A01.A0A) {
                            A01.A06 = 0;
                        } else if (!A01.A09) {
                            A01.A06 = 3;
                        } else {
                            A01.A06 = 2;
                        }
                    }
                    c454622d.A01().A02();
                    c41771uU.A09.A08(c454622d);
                    return;
                }
                c41771uU.A07(c454622d, c04130Ir);
                return;
            }
        }
        C454422b A00 = C454422b.A00(c41771uU.A0D, c22a, c04130Ir, c41771uU.A01, c41771uU.A0E, z);
        C44551zG c44551zG = c41771uU.A09;
        C454622d A06 = c44551zG.A06(A00, z2);
        c41771uU.A07(A06, c04130Ir);
        if (c454622d != null && (anonymousClass235 = (AnonymousClass235) c454622d.A0C.A00()) != null && anonymousClass235.A02) {
            Object A002 = c454622d.A07.A00();
            if (A002 != null) {
                A06.A07.A04(A002);
            }
            A06.A0C.A04(anonymousClass235);
            C22v A012 = c454622d.A01();
            synchronized (A012) {
                c0ky = A012.A03;
            }
            if (c0ky != null) {
                C22v A013 = A06.A01();
                synchronized (A013) {
                    A013.A03 = c0ky;
                }
            }
        }
        if (c44551zG.A0F(A06.A03().A05, A06.A0K.A02.A00, A06.A02().A0E)) {
            A06.A03 = bArr;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c04130Ir.A02());
        sb.append("; action_params: ");
        sb.append(c22a);
        c44551zG.A0D(A06, sb.toString());
    }
}
