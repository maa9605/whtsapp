package X;

import java.util.HashMap;

/* renamed from: X.2Co  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47782Co {
    public static volatile C47782Co A01;
    public final HashMap A00 = new HashMap();

    public static C47782Co A00() {
        if (A01 == null) {
            synchronized (C47782Co.class) {
                if (A01 == null) {
                    A01 = new C47782Co();
                }
            }
        }
        return A01;
    }
}
