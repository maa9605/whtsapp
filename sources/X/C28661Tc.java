package X;

/* renamed from: X.1Tc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28661Tc implements C0CR {
    public static C28661Tc A00;

    @Override // X.C0CR
    public C0MU A6e(Class cls) {
        try {
            return (C0MU) cls.newInstance();
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create an instance of ");
            sb.append(cls);
            throw new RuntimeException(sb.toString(), e);
        } catch (InstantiationException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot create an instance of ");
            sb2.append(cls);
            throw new RuntimeException(sb2.toString(), e2);
        }
    }
}
