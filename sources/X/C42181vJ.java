package X;

import java.util.Random;

/* renamed from: X.1vJ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42181vJ {
    public static volatile C42181vJ A04;
    public final AnonymousClass011 A00;
    public final C0MF A01;
    public final C42161vG A02;
    public final Random A03 = new Random();

    public C42181vJ(AnonymousClass011 anonymousClass011, C000500h c000500h, C42161vG c42161vG) {
        this.A00 = anonymousClass011;
        this.A02 = c42161vG;
        C0MF c0mf = new C0MF();
        this.A01 = c0mf;
        c0mf.A04 = 0;
        c0mf.A07 = 0;
        c0mf.A08 = 0;
        c0mf.A06 = 0;
        c0mf.A05 = 3;
        String string = c000500h.A00.getString("direct_migration_session_id", null);
        if (string == null) {
            string = Long.toHexString(this.A03.nextLong());
            C000200d.A0i(c000500h, "direct_migration_session_id", string);
        }
        this.A01.A0A = string;
    }

    public static C42181vJ A00() {
        if (A04 == null) {
            synchronized (C42181vJ.class) {
                if (A04 == null) {
                    A04 = new C42181vJ(AnonymousClass011.A00(), C000500h.A00(), C42161vG.A00());
                }
            }
        }
        return A04;
    }

    public void A01(int i) {
        this.A01.A05 = Integer.valueOf(i);
    }
}
