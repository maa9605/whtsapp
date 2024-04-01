package X;

/* renamed from: X.0iq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12090iq {
    public C28551Sn A00;
    public C38381o3 A01 = new C38381o3();
    public Object A02;
    public boolean A03;

    public void A00(Object obj) {
        this.A03 = true;
        C28551Sn c28551Sn = this.A00;
        if (c28551Sn == null || !c28551Sn.A00.A07(obj)) {
            return;
        }
        this.A02 = null;
        this.A00 = null;
        this.A01 = null;
    }

    public void finalize() {
        C38381o3 c38381o3;
        C28551Sn c28551Sn = this.A00;
        if (c28551Sn != null && !c28551Sn.isDone()) {
            StringBuilder A0P = C000200d.A0P("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
            A0P.append(this.A02);
            final String obj = A0P.toString();
            c28551Sn.A00.A06(new Throwable(obj) { // from class: X.0ir
                @Override // java.lang.Throwable
                public synchronized Throwable fillInStackTrace() {
                    return this;
                }
            });
        }
        if (this.A03 || (c38381o3 = this.A01) == null) {
            return;
        }
        c38381o3.A07(null);
    }
}
