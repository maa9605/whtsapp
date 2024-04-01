package X;

/* renamed from: X.1tT  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C41161tT implements C00J, InterfaceC007103c {
    public static final Object A02 = new Object();
    public volatile Object A00 = A02;
    public volatile InterfaceC007103c A01;

    public C41161tT(InterfaceC007103c interfaceC007103c) {
        this.A01 = interfaceC007103c;
    }

    public static C00J A00(InterfaceC007103c interfaceC007103c) {
        if (interfaceC007103c instanceof C00J) {
            return (C00J) interfaceC007103c;
        }
        if (interfaceC007103c != null) {
            return new C41161tT(interfaceC007103c);
        }
        throw null;
    }

    public static void A01(Object obj, Object obj2) {
        if (obj == A02 || (obj instanceof C41111tO) || obj == obj2) {
            return;
        }
        StringBuilder sb = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
        sb.append(obj);
        sb.append(" & ");
        sb.append(obj2);
        sb.append(". This is likely due to a circular dependency.");
        throw new IllegalStateException(sb.toString());
    }

    @Override // X.C00J
    public Object get() {
        Object obj;
        Object obj2 = this.A00;
        Object obj3 = A02;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.A00;
                if (obj == obj3) {
                    obj = this.A01.get();
                    A01(this.A00, obj);
                    this.A00 = obj;
                    this.A01 = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
