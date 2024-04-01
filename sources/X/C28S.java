package X;

/* renamed from: X.28S  reason: invalid class name */
/* loaded from: classes2.dex */
public class C28S {
    public static volatile C28S A01;
    public C47302Ar A00;

    public static C28S A00() {
        if (A01 == null) {
            synchronized (C28S.class) {
                if (A01 == null) {
                    A01 = new C28S();
                }
            }
        }
        return A01;
    }
}
