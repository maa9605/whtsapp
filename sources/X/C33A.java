package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.33A  reason: invalid class name */
/* loaded from: classes2.dex */
public class C33A {
    public final /* synthetic */ AnonymousClass339 A00;

    public C33A(AnonymousClass339 anonymousClass339) {
        this.A00 = anonymousClass339;
    }

    public void A00(int i) {
        AnonymousClass339 anonymousClass339 = this.A00;
        C2L3 c2l3 = anonymousClass339.A00;
        c2l3.A00 = false;
        if (i == 406 || i == 404) {
            AnonymousClass272 anonymousClass272 = c2l3.A0B;
            UserJid userJid = anonymousClass339.A01;
            synchronized (anonymousClass272) {
                C29y c29y = (C29y) anonymousClass272.A00.get(userJid);
                if (c29y != null) {
                    c29y.A02.clear();
                }
            }
        }
        AnonymousClass272 anonymousClass2722 = c2l3.A0B;
        final UserJid userJid2 = anonymousClass339.A01;
        ArrayList arrayList = new ArrayList();
        C2A1 c2a1 = new C2A1(false, null);
        synchronized (anonymousClass2722) {
            C29y A01 = anonymousClass2722.A01(userJid2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C29z c29z = (C29z) it.next();
                C2A0 c2a0 = new C2A0(c29z);
                for (C468628o c468628o : c29z.A04) {
                    Map map = anonymousClass2722.A01;
                    String str = c468628o.A09;
                    map.put(str, c468628o);
                    anonymousClass2722.A02.put(str, userJid2);
                }
                A01.A02.add(c2a0);
            }
            A01.A00 = c2a1;
        }
        c2l3.A03.A0A(new AbstractC56272mz(userJid2) { // from class: X.33u
        });
    }
}
