package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.28b  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C28b extends C0HS {
    public final C28N A00;
    public final C013406l A01;
    public final InterfaceC03570Gf A02;
    public final InterfaceC002901k A03;

    public C28b(InterfaceC002901k interfaceC002901k, C013406l c013406l, InterfaceC03570Gf interfaceC03570Gf, C28N c28n) {
        this.A03 = interfaceC002901k;
        this.A01 = c013406l;
        this.A02 = interfaceC03570Gf;
        this.A00 = c28n;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C60012tm c60012tm = (C60012tm) obj;
        C28N c28n = this.A00;
        if (c28n == null || !c60012tm.A01) {
            return;
        }
        c28n.AH2(c60012tm.A00);
    }

    public C60012tm A0A(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0N2 c0n2 = (C0N2) it.next();
            C2GP c2gp = null;
            C0DX serviceBy = this.A02.getServiceBy(c0n2.A05.A02, (String) null);
            if (serviceBy != null && (c2gp = serviceBy.A9E()) != null) {
                c2gp.A5e(c0n2);
            }
            arrayList.add(c0n2);
            if (c2gp != null && !hashMap.containsKey(c0n2.A05.A02)) {
                hashMap.put(c0n2.A05.A02, c2gp);
            }
        }
        C013406l c013406l = this.A01;
        boolean A0J = c013406l.A0J(arrayList);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (A0J && arrayList.size() > 0) {
            for (C2GP c2gp2 : hashMap.values()) {
                c2gp2.A5L(arrayList);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0N2 c0n22 = (C0N2) it2.next();
                C0N2 A08 = c013406l.A08(c0n22.A07);
                if (A08 != null) {
                    arrayList2.add(A08);
                    byte[] bArr = A08.A0B;
                    if (bArr == null || bArr.length <= 0) {
                        this.A03.AS1(new RunnableEBaseShape0S0400000_I0(this, hashMap, c0n22, A08, 4));
                    }
                } else {
                    throw null;
                }
            }
        }
        return new C60012tm(A0J, arrayList2);
    }
}
