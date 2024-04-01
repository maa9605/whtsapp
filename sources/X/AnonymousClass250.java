package X;

import java.util.Set;

/* renamed from: X.250  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass250 {
    public final /* synthetic */ C461124z A00;

    public AnonymousClass250(C461124z c461124z) {
        this.A00 = c461124z;
    }

    public void A00(boolean z, Set set, String str) {
        C461124z c461124z = this.A00;
        C461024y c461024y = c461124z.A07;
        boolean z2 = c461024y.A04;
        c461124z.A00 = (z2 && set.contains(c461024y.A00)) || !(z2 || set.contains(c461024y.A00));
        c461124z.A03.A0G(new RunnableEBaseShape0S1210000_I0(c461124z, z, set, str, 0));
        C04500Kk c04500Kk = c461124z.A0C;
        if (c04500Kk != null) {
            c461124z.A0D.A0E(c04500Kk.A01, 200);
        }
    }
}
