package X;

/* renamed from: X.0w3  reason: invalid class name */
/* loaded from: classes.dex */
public class C0w3 {
    public static volatile C1YC A00;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1YC] */
    public static void A00() {
        if (A00 == null) {
            synchronized (C0w3.class) {
                if (A00 == null) {
                    A00 = new Object() { // from class: X.1YC
                    };
                }
            }
        }
        if (A00 == null) {
            throw null;
        }
    }
}
