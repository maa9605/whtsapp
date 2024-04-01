package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1tk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41331tk {
    public static volatile C41331tk A04;
    public final AnonymousClass012 A00;
    public final Map A01 = new HashMap();
    public final Set A03 = new HashSet();
    public final Set A02 = new HashSet();

    public C41331tk(AnonymousClass012 anonymousClass012) {
        this.A00 = anonymousClass012;
    }

    public static C41331tk A00() {
        if (A04 == null) {
            synchronized (C41331tk.class) {
                if (A04 == null) {
                    A04 = new C41331tk(AnonymousClass012.A00());
                }
            }
        }
        return A04;
    }

    public void A01(String[] strArr) {
        Set set = this.A03;
        synchronized (set) {
            set.removeAll(C003101m.A0G(strArr));
        }
    }
}
