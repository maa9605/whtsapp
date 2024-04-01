package X;

/* renamed from: X.2Bl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47492Bl {
    public static volatile C47492Bl A01;
    public final C40431sF A00;

    public C47492Bl(C40431sF c40431sF) {
        this.A00 = c40431sF;
    }

    public static C47492Bl A00() {
        if (A01 == null) {
            synchronized (C47492Bl.class) {
                if (A01 == null) {
                    A01 = new C47492Bl(C40431sF.A00());
                }
            }
        }
        return A01;
    }
}
