package X;

import java.util.List;

/* renamed from: X.446  reason: invalid class name */
/* loaded from: classes3.dex */
public class AnonymousClass446 {
    public static long A00;
    public static final AnonymousClass427 A01 = new AnonymousClass427();

    public static void A00() {
        C07K.A0O(null);
        List list = A01.A00;
        if (list.size() > 0) {
            list.get(0);
            throw null;
        }
    }

    public static void A01(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("CameraInventory");
        sb.append(": ");
        sb.append(str);
        sb.toString();
        A00();
    }

    public static void A02(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        sb.toString();
        A00();
    }
}
