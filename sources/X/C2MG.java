package X;

/* renamed from: X.2MG  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2MG {
    public static C2MG A00() {
        if (C2TW.A00 == null) {
            synchronized (C2TW.class) {
                if (C2TW.A00 == null) {
                    C2TW.A00 = new C2TW();
                }
            }
        }
        return C2TW.A00;
    }
}
