package X;

/* renamed from: X.0BT  reason: invalid class name */
/* loaded from: classes.dex */
public class C0BT implements C0BJ {
    public static final Object A02 = new Object();
    public volatile C0BJ A00;
    public volatile Object A01 = A02;

    public C0BT(C0BJ c0bj) {
        this.A00 = c0bj;
    }

    @Override // X.C0BJ
    public Object get() {
        Object obj;
        Object obj2 = this.A01;
        Object obj3 = A02;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.A01;
                if (obj == obj3) {
                    obj = this.A00.get();
                    this.A01 = obj;
                    this.A00 = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
