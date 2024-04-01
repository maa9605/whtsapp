package X;

import android.os.Build;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2Rp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C50412Rp {
    public static volatile C50412Rp A0B;
    public final AbstractC000600i A00;
    public final AnonymousClass011 A01;
    public final C41861ud A02;
    public final C80143mn A03;
    public final C80153mo A04;
    public final C80163mp A05;
    public final C80173mq A06;
    public final C80183mr A07;
    public final C80193ms A08;
    public final C41881uf A09;
    public final Map A0A;

    public C50412Rp(AbstractC000600i abstractC000600i, AnonymousClass011 anonymousClass011, C41861ud c41861ud, C41881uf c41881uf, C71153Va c71153Va, C71173Vc c71173Vc, C41891ug c41891ug) {
        this.A00 = abstractC000600i;
        this.A01 = anonymousClass011;
        this.A02 = c41861ud;
        this.A09 = c41881uf;
        C80153mo c80153mo = new C80153mo(c71153Va);
        this.A04 = c80153mo;
        this.A03 = new C80143mn(c71153Va);
        this.A07 = new C80183mr(c71173Vc);
        this.A06 = new C80173mq(c71173Vc);
        this.A05 = new C80163mp(c71173Vc);
        this.A08 = new C80193ms(c41891ug);
        HashMap hashMap = new HashMap();
        hashMap.put(2, c80153mo);
        hashMap.put(3, this.A03);
        hashMap.put(4, this.A07);
        hashMap.put(5, this.A06);
        hashMap.put(6, this.A05);
        hashMap.put(7, this.A08);
        this.A0A = Collections.unmodifiableMap(hashMap);
    }

    public static C50412Rp A00() {
        if (A0B == null) {
            synchronized (C50412Rp.class) {
                if (A0B == null) {
                    A0B = new C50412Rp(AbstractC000600i.A00(), AnonymousClass011.A00(), C41861ud.A00(), C41881uf.A00(), C71153Va.A00(), C71173Vc.A00(), C41891ug.A00());
                }
            }
        }
        return A0B;
    }

    public final void A01() {
        int A01 = this.A02.A01();
        for (Map.Entry entry : this.A0A.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            C3VZ c3vz = (C3VZ) entry.getValue();
            if (Build.VERSION.SDK_INT >= c3vz.ABO()) {
                if (intValue == A01) {
                    if (c3vz.AFj()) {
                        c3vz.A6S();
                    } else {
                        c3vz.ASC();
                    }
                } else if (c3vz.AFj()) {
                    c3vz.cancel();
                }
            }
        }
    }
}
