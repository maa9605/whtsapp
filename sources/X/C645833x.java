package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.33x  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C645833x implements InterfaceC010405f {
    public final C33A A00;
    public final C56292n2 A01;
    public final C56312n4 A02;
    public final C0E7 A03;
    public final C05Y A04;

    public C645833x(C05Y c05y, C56312n4 c56312n4, C0E7 c0e7, C56292n2 c56292n2, C33A c33a) {
        this.A00 = c33a;
        this.A01 = c56292n2;
        this.A04 = c05y;
        this.A02 = c56312n4;
        this.A03 = c0e7;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        Log.e("sendGetCollectionsRequest/delivery-error");
        this.A00.A00(-1);
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        Log.e("sendGetCollectionsRequest/response-error");
        this.A00.A00(C40731sm.A01(c02590Ca));
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        C56312n4 c56312n4 = this.A02;
        C56282n0 c56282n0 = null;
        if (c56312n4 != null) {
            C02590Ca A0D = c02590Ca.A0D("collections");
            if (A0D != null) {
                List<C02590Ca> A0H = A0D.A0H("collection");
                ArrayList arrayList = new ArrayList();
                for (C02590Ca c02590Ca2 : A0H) {
                    if (c56312n4.A00(c02590Ca2) != null) {
                        arrayList.add(c56312n4.A00(c02590Ca2));
                    }
                }
                c56282n0 = new C56282n0(arrayList, C2U0.A00(A0D.A0D("paging")));
            }
            if (c56282n0 != null) {
                C56292n2 c56292n2 = this.A01;
                AnonymousClass339 anonymousClass339 = this.A00.A00;
                C2L3 c2l3 = anonymousClass339.A00;
                c2l3.A00 = false;
                String str2 = c56292n2.A06;
                if (str2 == null || str2.equals(anonymousClass339.A02)) {
                    boolean z = str2 != null;
                    AnonymousClass272 anonymousClass272 = c2l3.A0B;
                    UserJid userJid = anonymousClass339.A01;
                    synchronized (anonymousClass272) {
                        C29y A01 = anonymousClass272.A01(userJid);
                        if (!z) {
                            A01.A02.clear();
                        }
                        for (C29z c29z : c56282n0.A01) {
                            C2A0 c2a0 = new C2A0(c29z);
                            for (C468628o c468628o : c29z.A04) {
                                Map map = anonymousClass272.A01;
                                String str3 = c468628o.A09;
                                map.put(str3, c468628o);
                                anonymousClass272.A02.put(str3, userJid);
                            }
                            A01.A02.add(c2a0);
                        }
                        A01.A00 = c56282n0.A00;
                    }
                    c2l3.A03.A0A(new C645633v(userJid));
                    return;
                }
                return;
            }
            this.A00.A00(0);
            return;
        }
        throw null;
    }
}
