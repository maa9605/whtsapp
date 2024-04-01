package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2Dg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47962Dg {
    public static volatile C47962Dg A02;
    public final C48072Dr A00;
    public final Set A01 = new HashSet();

    public C47962Dg(C48072Dr c48072Dr) {
        this.A00 = c48072Dr;
    }

    public static C47962Dg A00() {
        if (A02 == null) {
            synchronized (C47962Dg.class) {
                if (A02 == null) {
                    C48072Dr A00 = C48072Dr.A00();
                    C02O.A00();
                    A02 = new C47962Dg(A00);
                }
            }
        }
        return A02;
    }
}
