package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.33w  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C645733w implements InterfaceC010405f {
    public final C33C A00;
    public final C56302n3 A01;
    public final C56312n4 A02;
    public final C0E7 A03;
    public final C05Y A04;

    public C645733w(C05Y c05y, C0E7 c0e7, C56312n4 c56312n4, C56302n3 c56302n3, C33C c33c) {
        this.A02 = c56312n4;
        this.A04 = c05y;
        this.A01 = c56302n3;
        this.A03 = c0e7;
        this.A00 = c33c;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        Log.e("GetCollectionProductListProtocol/sendGetCollectionProductLis/delivery-error");
        this.A00.A00(-1);
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        Log.e("GetCollectionProductListProtocol/sendGetCollectionProductList/response-error");
        this.A00.A00(C40731sm.A01(c02590Ca));
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        C29z c29z;
        C2A0 c2a0;
        C29z A00;
        C56312n4 c56312n4 = this.A02;
        C2n1 c2n1 = null;
        if (c56312n4 != null) {
            C02590Ca A0D = c02590Ca.A0D("collection");
            if (A0D != null && (A00 = c56312n4.A00(A0D)) != null) {
                c2n1 = new C2n1(A00, C2U0.A00(A0D.A0D("paging")));
            }
            if (c2n1 != null) {
                StringBuilder A0P = C000200d.A0P("GetCollectionProductListProtocol/sendGetCollectionProductList/onSuccess jid=");
                C56302n3 c56302n3 = this.A01;
                C000200d.A1J(A0P, c56302n3.A03);
                C33B c33b = this.A00.A00;
                C2L3 c2l3 = c33b.A00;
                c2l3.A04.A0A(Boolean.FALSE);
                String str2 = c56302n3.A04;
                if (str2 != null && !str2.equals(c33b.A03)) {
                    return;
                }
                boolean z = str2 != null;
                AnonymousClass272 anonymousClass272 = c2l3.A0B;
                UserJid userJid = c33b.A01;
                synchronized (anonymousClass272) {
                    c29z = c2n1.A00;
                    List<C468628o> list = c29z.A04;
                    for (C468628o c468628o : list) {
                        Map map = anonymousClass272.A01;
                        String str3 = c468628o.A09;
                        map.put(str3, c468628o);
                        anonymousClass272.A02.put(str3, userJid);
                    }
                    Iterator it = anonymousClass272.A01(userJid).A02.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            c2a0 = (C2A0) it.next();
                            String str4 = c29z.A03;
                            C29z c29z2 = c2a0.A00;
                            if (str4.equals(c29z2.A03)) {
                                if (!z) {
                                    c29z2.A04.clear();
                                }
                                C29z c29z3 = c2a0.A00;
                                c29z3.A02 = c29z.A02;
                                c29z3.A00 = c29z.A00;
                                c29z3.A01 = c29z.A01;
                                c29z3.A04.addAll(list);
                            }
                        } else {
                            C29y A01 = anonymousClass272.A01(userJid);
                            c2a0 = new C2A0(c29z);
                            A01.A02.add(0, c2a0);
                            break;
                        }
                    }
                    c2a0.A01 = c2n1.A01;
                }
                c2l3.A02.A0A(new C645433t(userJid, c29z.A03));
                return;
            }
            StringBuilder A0P2 = C000200d.A0P("GetCollectionProductListProtocol/sendGetCollectionProductList/onSuccess/emptyPage jid=");
            A0P2.append(this.A01.A03);
            Log.e(A0P2.toString());
            this.A00.A00(0);
            return;
        }
        throw null;
    }
}
