package X;

/* renamed from: X.3K3  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3K3 extends AbstractC83883sq {
    public final C001200o A00;
    public final C66223Af A01;
    public final C454622d A02;

    public C3K3(C001200o c001200o, C41771uU c41771uU, C09B c09b) {
        this.A00 = c001200o;
        this.A02 = c41771uU.A02(c41771uU.A01(c09b));
        this.A01 = null;
    }

    public C3K3(C001200o c001200o, C41771uU c41771uU, C09B c09b, C66223Af c66223Af) {
        this.A00 = c001200o;
        this.A02 = c41771uU.A02(c41771uU.A01(c09b));
        this.A01 = c66223Af;
    }

    @Override // X.AnonymousClass124
    public InterfaceC06380Sv A6k() {
        C454622d c454622d = this.A02;
        if (c454622d != null) {
            return new C3K4(this.A00.A00, c454622d, this.A01);
        }
        return new C39381q2(this.A00.A00);
    }
}
