package X;

import android.os.Build;

/* renamed from: X.0JO  reason: invalid class name */
/* loaded from: classes.dex */
public class C0JO {
    public static int A00 = -1;
    public static Boolean A01;
    public static final String[] A02 = {"GT-N7100", "GT-I9305"};

    public static boolean A00() {
        Boolean bool = A01;
        if (bool == null) {
            for (String str : A02) {
                if (Build.MODEL.equals(str)) {
                    A01 = Boolean.TRUE;
                    return true;
                }
            }
            int i = A00;
            if (i < 0) {
                return false;
            }
            bool = Boolean.valueOf(i <= 48);
            A01 = bool;
        }
        return bool.booleanValue();
    }
}
