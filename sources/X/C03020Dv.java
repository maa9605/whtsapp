package X;

/* renamed from: X.0Dv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03020Dv extends AnonymousClass009 {
    public static volatile C03020Dv A01;
    public volatile boolean A00;

    public static C03020Dv A00() {
        if (A01 == null) {
            synchronized (C03020Dv.class) {
                if (A01 == null) {
                    A01 = new C03020Dv();
                }
            }
        }
        return A01;
    }
}
