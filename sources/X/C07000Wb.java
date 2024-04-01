package X;

/* renamed from: X.0Wb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07000Wb {
    public static volatile C07000Wb A01;
    public final C00E A00;

    public C07000Wb(C00E c00e) {
        this.A00 = c00e;
    }

    public static C07000Wb A00() {
        if (A01 == null) {
            synchronized (C07000Wb.class) {
                if (A01 == null) {
                    A01 = new C07000Wb(C00E.A00());
                }
            }
        }
        return A01;
    }

    public synchronized boolean A01(String str, String str2) {
        String A03 = this.A00.A03(str);
        if (A03 == null) {
            return false;
        }
        return A03.equals(str2);
    }

    public synchronized boolean A02(String str, String str2) {
        if (str2 == null) {
            return false;
        }
        C00E c00e = this.A00;
        String string = c00e.A02().getString(C00E.A01(str, "request/token"), null);
        if (string == null) {
            return false;
        }
        return str2.equals(string);
    }
}
