package X;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.1RS  reason: invalid class name */
/* loaded from: classes.dex */
public class C1RS {
    public LinkedList A00 = new LinkedList();
    public C1RT A01;

    public C1RS(byte[] bArr) {
        this.A01 = new C1RT();
        C880641p c880641p = (C880641p) C0AZ.A03(C880641p.A03, bArr);
        this.A01 = new C1RT(c880641p.A0i());
        for (C2U4 c2u4 : c880641p.A01) {
            this.A00.add(new C1RT(c2u4));
        }
    }

    public void A00(C1RT c1rt) {
        this.A00.addFirst(this.A01);
        this.A01 = c1rt;
        LinkedList linkedList = this.A00;
        if (linkedList.size() > 40) {
            linkedList.removeLast();
        }
    }

    public byte[] A01() {
        LinkedList linkedList = new LinkedList();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            linkedList.add(((C1RT) it.next()).A00);
        }
        C880541o c880541o = (C880541o) C880641p.A03.AVX();
        C2U4 c2u4 = this.A01.A00;
        c880541o.A02();
        C880641p.A09((C880641p) c880541o.A00, c2u4);
        c880541o.A04(linkedList);
        return c880541o.A01().A0B();
    }
}
