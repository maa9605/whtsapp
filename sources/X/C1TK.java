package X;

/* renamed from: X.1TK  reason: invalid class name */
/* loaded from: classes.dex */
public class C1TK extends C13040kV {
    public final Object A00;

    public C1TK(int i) {
        super(i);
        this.A00 = new Object();
    }

    @Override // X.C13040kV
    public Object A00() {
        Object A00;
        synchronized (this.A00) {
            A00 = super.A00();
        }
        return A00;
    }

    @Override // X.C13040kV
    public boolean A01(Object obj) {
        boolean A01;
        synchronized (this.A00) {
            A01 = super.A01(obj);
        }
        return A01;
    }
}
