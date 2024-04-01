package X;

import com.whatsapp.util.Log;

/* renamed from: X.1yP  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44031yP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AbstractC43891yA A02;

    public C44031yP(AbstractC43891yA abstractC43891yA, int i, int i2) {
        this.A02 = abstractC43891yA;
        this.A00 = i;
        this.A01 = i2;
    }

    public void A00() {
        AbstractC43891yA abstractC43891yA = this.A02;
        int i = this.A00;
        C000700j.A07(abstractC43891yA.A00(i) == 1);
        abstractC43891yA.A05(i);
        Log.e("CategoryManager/onManifestError/manifest was errory");
        abstractC43891yA.A08(2, i);
        abstractC43891yA.A0C(null);
    }

    public void A01(C44001yM c44001yM) {
        long longValue;
        AbstractC43891yA abstractC43891yA = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        C000700j.A07(abstractC43891yA.A00(i) == 1);
        abstractC43891yA.A05(i);
        String A03 = abstractC43891yA.A03();
        if (c44001yM == null) {
            StringBuilder sb = new StringBuilder("CategoryManager/onManifestReady/No info in manifest for category ");
            sb.append(A03);
            Log.e(sb.toString());
            abstractC43891yA.A08(2, i);
            abstractC43891yA.A0C(null);
            return;
        }
        C000700j.A07(A03.equals(c44001yM.A01));
        C44001yM A01 = abstractC43891yA.A01();
        if (A01 != null) {
            if (A01.A01(i).equals(c44001yM.A01(i))) {
                if (abstractC43891yA.A0E(i)) {
                    abstractC43891yA.A08(5, i);
                    abstractC43891yA.A0C(A01.A01(i));
                    abstractC43891yA.A06(i);
                    return;
                }
                abstractC43891yA.A0D(null, null, i);
            } else if (!abstractC43891yA.A0E(i)) {
                abstractC43891yA.A0D(null, null, i);
            }
        }
        if (i2 == 0) {
            synchronized (abstractC43891yA) {
                Long l = (Long) abstractC43891yA.A03.get(i);
                if (l != null) {
                    longValue = l.longValue();
                } else {
                    longValue = 0;
                }
            }
            if (longValue + 3600000 > abstractC43891yA.A08.A05()) {
                abstractC43891yA.A08(4, i);
                abstractC43891yA.A0C(null);
                return;
            }
        }
        abstractC43891yA.A08(3, i);
        abstractC43891yA.A0E.AS1(new RunnableEBaseShape0S1201000_I0(abstractC43891yA, c44001yM, null, i, 2));
    }
}
