package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.2E5  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2E5 extends C0CH {
    public final Collection A00;
    public final /* synthetic */ C41771uU A01;

    public C2E5(C41771uU c41771uU, Collection collection) {
        this.A01 = c41771uU;
        this.A00 = collection;
    }

    @Override // X.C0CH
    public Object A04() {
        C454622d A02;
        int i;
        for (AnonymousClass097 anonymousClass097 : this.A00) {
            C41771uU c41771uU = this.A01;
            if (c41771uU != null) {
                if (((AnonymousClass092) anonymousClass097).A08 != 1) {
                    StringBuilder A0P = C000200d.A0P("mediajobmanager/trycancelmessageandmediajob ");
                    A0P.append(anonymousClass097.A0n);
                    A0P.append(" status:");
                    C000200d.A1F(A0P, ((AnonymousClass092) anonymousClass097).A08);
                } else {
                    C04130Ir A01 = c41771uU.A01(anonymousClass097);
                    if (A01 != null && (A02 = c41771uU.A02(A01)) != null) {
                        synchronized (A02.A0P) {
                            A01.A03(anonymousClass097.A0n);
                            if (A01.A01.size() == 0) {
                                c41771uU.A05(A01, null);
                            }
                        }
                        synchronized (c41771uU.A0J) {
                            i = 0;
                            for (Map.Entry entry : c41771uU.A0K.entrySet()) {
                                C000700j.A07(((C04130Ir) entry.getKey()).A05() ? false : true);
                                if (entry.getValue() == A02) {
                                    i += ((C04130Ir) entry.getKey()).A01.size();
                                }
                            }
                        }
                        if (i == 0) {
                            c41771uU.A09.A07(A02);
                        }
                    }
                }
            } else {
                throw null;
            }
        }
        return Boolean.TRUE;
    }
}
