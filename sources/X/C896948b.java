package X;

import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.48b */
/* loaded from: classes3.dex */
public class C896948b {
    public static volatile C896948b A05;
    public final C02L A00;
    public final AnonymousClass012 A01;
    public final C48Y A02;
    public final C49682Lx A03;
    public final JniBridge A04;

    public C896948b(AnonymousClass012 anonymousClass012, C02L c02l, JniBridge jniBridge, C48Y c48y, C49682Lx c49682Lx) {
        this.A01 = anonymousClass012;
        this.A00 = c02l;
        this.A04 = jniBridge;
        this.A02 = c48y;
        this.A03 = c49682Lx;
    }

    public static C896948b A00() {
        if (A05 == null) {
            synchronized (C896948b.class) {
                if (A05 == null) {
                    A05 = new C896948b(AnonymousClass012.A00(), C02L.A00(), JniBridge.getInstance(), new C48Y(), C49682Lx.A00());
                }
            }
        }
        return A05;
    }
}
