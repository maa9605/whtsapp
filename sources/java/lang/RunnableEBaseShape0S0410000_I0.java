package java.lang;

import X.AnonymousClass092;
import X.AnonymousClass097;
import X.C002701i;
import X.C04420Kc;
import X.C09H;
import X.C0ES;
import X.C0QS;
import X.C2AV;
import X.C42441vk;
import X.C42451vl;
import X.C43211x2;
import android.os.ConditionVariable;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S0410000_I0 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05;

    public RunnableEBaseShape0S0410000_I0(Object obj, Object obj2, Object obj3, boolean z, Object obj4, int i) {
        this.A05 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A04 = z;
        this.A03 = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A05) {
            case 0:
                C0ES c0es = (C0ES) this.A00;
                boolean z = this.A04;
                C04420Kc c04420Kc = (C04420Kc) this.A03;
                c0es.A0F.A0Q(new C0QS(((Jid) this.A01).getRawString(), C002701i.A0T((DeviceJid) this.A02)));
                if (z) {
                    c0es.A0c.A0L(c04420Kc);
                    return;
                }
                return;
            case 1:
                C42451vl c42451vl = (C42451vl) this.A00;
                C43211x2 c43211x2 = (C43211x2) this.A01;
                AnonymousClass097 anonymousClass097 = (AnonymousClass097) this.A02;
                boolean z2 = this.A04;
                C42451vl.A01(false, c43211x2, anonymousClass097);
                C42441vk c42441vk = c42451vl.A0R;
                C09H c09h = anonymousClass097.A02;
                HashMap hashMap = c42441vk.A00;
                synchronized (hashMap) {
                    hashMap.remove(c09h);
                }
                if (c43211x2.A01() != null) {
                    c42451vl.A09(z2, anonymousClass097, c43211x2.A01().A01);
                    return;
                }
                throw null;
            case 2:
                C2AV c2av = (C2AV) this.A00;
                AbstractMap abstractMap = (AbstractMap) this.A01;
                boolean z3 = this.A04;
                ConditionVariable conditionVariable = (ConditionVariable) this.A02;
                ConditionVariable conditionVariable2 = (ConditionVariable) this.A03;
                ArrayList arrayList = new ArrayList();
                try {
                    for (AnonymousClass092 anonymousClass092 : abstractMap.values()) {
                        if (anonymousClass092 != null) {
                            arrayList.add(anonymousClass092);
                        }
                    }
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("app/xmpp/send/qr_send_conv preempt:");
                    sb.append(z3);
                    sb.append(" recents error ");
                    sb.append(e.toString());
                    Log.e(sb.toString());
                }
                c2av.A01(0, arrayList, true, z3, conditionVariable, conditionVariable2, null);
                return;
            default:
                return;
        }
    }
}
