package X;

import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2ye  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C62842ye {
    public final C0HA A01;
    public final C41451tw A02;
    public final ArrayList A04 = new ArrayList();
    public final String A03 = UUID.randomUUID().toString();
    public final AtomicInteger A05 = new AtomicInteger();
    public int A00 = 0;

    public C62842ye(C0HA c0ha, C41451tw c41451tw) {
        this.A01 = c0ha;
        this.A02 = c41451tw;
    }

    public final void A00(C2H3 c2h3) {
        C0HA c0ha = this.A01;
        int i = 2;
        int i2 = c2h3.A0E != 3 ? 4 : 2;
        int i3 = this.A00;
        if (i3 == 0) {
            this.A00 = 3;
        } else if (i3 != 3) {
            i = 4;
        }
        int intValue = c2h3.A02.intValue();
        String str = c2h3.A06;
        int i4 = c2h3.A00;
        boolean z = c2h3.A0A;
        String str2 = c2h3.A0F;
        int size = c2h3.A08.size();
        long j = c2h3.A01;
        if (c0ha != null) {
            C37331mF c37331mF = new C37331mF();
            c37331mF.A03 = Integer.valueOf(i2);
            c37331mF.A04 = Integer.valueOf(i);
            c37331mF.A02 = Integer.valueOf(intValue);
            c37331mF.A07 = str;
            c37331mF.A05 = Long.valueOf(i4);
            c37331mF.A00 = Boolean.valueOf(z);
            c37331mF.A08 = str2;
            c37331mF.A01 = Double.valueOf(size);
            c37331mF.A06 = Long.valueOf(j);
            c0ha.A0B.A09(c37331mF, 1);
            AnonymousClass011.A01(c37331mF, "");
            return;
        }
        throw null;
    }
}
