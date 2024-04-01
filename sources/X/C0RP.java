package X;

/* renamed from: X.0RP  reason: invalid class name */
/* loaded from: classes.dex */
public class C0RP {
    public static final C0RP A00;

    static {
        try {
            Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        A00 = new C0RP(true);
    }

    public C0RP() {
    }

    public C0RP(boolean z) {
    }

    public static C0RP A00() {
        Class cls = C10230fV.A00;
        if (cls != null) {
            try {
                return (C0RP) cls.getMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return A00;
    }
}
