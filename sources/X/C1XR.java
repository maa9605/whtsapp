package X;

/* renamed from: X.1XR  reason: invalid class name */
/* loaded from: classes.dex */
public class C1XR extends AbstractC19030uj {
    public C1XR(C19070un c19070un, InterfaceC19020ui interfaceC19020ui, Throwable th) {
        super(c19070un, interfaceC19020ui, th);
    }

    public C1XR(Object obj, InterfaceC19050ul interfaceC19050ul, InterfaceC19020ui interfaceC19020ui, Throwable th) {
        super(obj, interfaceC19050ul, interfaceC19020ui, th);
    }

    @Override // X.AbstractC19030uj
    public AbstractC19030uj A03() {
        C07K.A1Z(A05());
        return new C1XR(this.A02, this.A01, this.A03);
    }

    @Override // X.AbstractC19030uj
    public void finalize() {
        boolean z;
        try {
            synchronized (this) {
                z = this.A00;
            }
            if (z) {
                return;
            }
            C19070un c19070un = this.A02;
            C18960uc.A00.A00(5, "DefaultCloseableReference", String.format(null, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(c19070un)), c19070un.A00().getClass().getName()));
            this.A01.ARa(c19070un, this.A03);
            close();
        } finally {
            super.finalize();
        }
    }
}
