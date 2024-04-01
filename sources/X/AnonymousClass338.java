package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.338  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass338 {
    public final /* synthetic */ C2L3 A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ String A02;

    public AnonymousClass338(C2L3 c2l3, String str, UserJid userJid) {
        this.A00 = c2l3;
        this.A02 = str;
        this.A01 = userJid;
    }

    public void A00(int i) {
        C2L3 c2l3 = this.A00;
        c2l3.A01 = false;
        if (i == 406 || i == 404) {
            AnonymousClass272 anonymousClass272 = c2l3.A0B;
            UserJid userJid = this.A01;
            synchronized (anonymousClass272) {
                Map map = anonymousClass272.A00;
                C29y c29y = (C29y) map.get(userJid);
                if (c29y != null) {
                    Iterator it = c29y.A03.iterator();
                    while (it.hasNext()) {
                        Map map2 = anonymousClass272.A02;
                        String str = ((C468628o) it.next()).A09;
                        map2.remove(str);
                        anonymousClass272.A01.remove(str);
                    }
                    Iterator it2 = c29y.A02.iterator();
                    while (it2.hasNext()) {
                        for (C468628o c468628o : ((C2A0) it2.next()).A00.A04) {
                            Map map3 = anonymousClass272.A02;
                            String str2 = c468628o.A09;
                            map3.remove(str2);
                            anonymousClass272.A01.remove(str2);
                        }
                    }
                }
                map.remove(userJid);
            }
        }
        C2MP c2mp = c2l3.A0A;
        UserJid userJid2 = this.A01;
        if (c2mp != null) {
            C000700j.A01();
            Iterator it3 = c2mp.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it3;
                if (!c0g5.hasNext()) {
                    return;
                }
                ((InterfaceC04750Lr) c0g5.next()).AKF(userJid2, i);
            }
        } else {
            throw null;
        }
    }
}
