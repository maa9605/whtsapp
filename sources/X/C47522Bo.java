package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2Bo  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47522Bo {
    public static volatile C47522Bo A02;
    public final Map A01 = new HashMap();
    public final Map A00 = new HashMap();

    public static C47522Bo A00() {
        if (A02 == null) {
            synchronized (C47522Bo.class) {
                if (A02 == null) {
                    A02 = new C47522Bo();
                }
            }
        }
        return A02;
    }
}
