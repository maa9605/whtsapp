package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0GV  reason: invalid class name */
/* loaded from: classes.dex */
public class C0GV {
    public static volatile C0GV A04;
    public final AnonymousClass012 A01;
    public final C03180Eq A02;
    public final Map A03 = new HashMap();
    public long A00 = -1;

    public C0GV(AnonymousClass012 anonymousClass012, C03180Eq c03180Eq) {
        this.A01 = anonymousClass012;
        this.A02 = c03180Eq;
    }

    public static C0GV A00() {
        if (A04 == null) {
            synchronized (C0GV.class) {
                if (A04 == null) {
                    A04 = new C0GV(AnonymousClass012.A00(), C03180Eq.A00());
                }
            }
        }
        return A04;
    }
}
