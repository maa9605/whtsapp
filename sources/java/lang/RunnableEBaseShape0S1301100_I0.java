package java.lang;

import X.AbstractC43891yA;
import X.AnonymousClass092;
import X.C0J5;
import X.C2AK;
import X.C44001yM;
import X.EnumC03920Hs;
import com.whatsapp.jid.Jid;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S1301100_I0 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06;

    public RunnableEBaseShape0S1301100_I0(Object obj, Object obj2, int i, String str, long j, Object obj3, int i2) {
        this.A06 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A00 = i;
        this.A05 = str;
        this.A01 = j;
        this.A04 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A06) {
            case 0:
                ((AbstractC43891yA) this.A02).A0A((C44001yM) this.A03, this.A00, this.A05, this.A01, (C0J5) this.A04);
                return;
            case 1:
                C2AK c2ak = (C2AK) this.A02;
                String str = this.A05;
                c2ak.A0z.A0F(str, 501);
                c2ak.A0s.A08(str, this.A01, (Jid) this.A04);
                return;
            case 2:
                C2AK c2ak2 = (C2AK) this.A02;
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) this.A03;
                int i = this.A00;
                Jid jid = (Jid) this.A04;
                String str2 = this.A05;
                long j = this.A01;
                if (anonymousClass092 != null) {
                    if (i == 9) {
                        anonymousClass092.A0J = EnumC03920Hs.RELAY;
                        c2ak2.A0a.A05(anonymousClass092, 25);
                    } else {
                        c2ak2.A0a.A05(anonymousClass092, 26);
                    }
                }
                c2ak2.A05(jid, str2, j);
                return;
            default:
                return;
        }
    }
}
