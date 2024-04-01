package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2Cz */
/* loaded from: classes2.dex */
public class C47892Cz {
    public static volatile C47892Cz A04;
    public final C41511u2 A00;
    public final C2AV A01;
    public final InterfaceC002901k A02;
    public final Map A03 = new HashMap();

    public C47892Cz(InterfaceC002901k interfaceC002901k, C41511u2 c41511u2, C2AV c2av) {
        this.A02 = interfaceC002901k;
        this.A00 = c41511u2;
        this.A01 = c2av;
    }

    public static C47892Cz A00() {
        if (A04 == null) {
            synchronized (C47892Cz.class) {
                if (A04 == null) {
                    A04 = new C47892Cz(C002801j.A00(), C41511u2.A00(), C2AV.A00());
                }
            }
        }
        return A04;
    }

    public final synchronized C2D0 A01(AbstractC005302j abstractC005302j) {
        C2D0 c2d0;
        Map map = this.A03;
        c2d0 = (C2D0) map.get(abstractC005302j.getRawString());
        if (c2d0 == null) {
            c2d0 = new C2D0(this);
            map.put(abstractC005302j.getRawString(), c2d0);
        }
        return c2d0;
    }

    public void A02(AnonymousClass092 anonymousClass092) {
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (abstractC005302j != null) {
            C2D0 A01 = A01(abstractC005302j);
            synchronized (A01) {
                boolean z = A01.A01.remove(anonymousClass094) != null;
                A01.A00.remove(anonymousClass094);
                A01.toString();
                if (z) {
                    A01.A00();
                }
            }
            return;
        }
        throw null;
    }
}
