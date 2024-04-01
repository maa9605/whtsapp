package X;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.0aJ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07920aJ {
    public boolean A00;
    public final C07930aK A01;
    public final LinkedList A02;

    public C07920aJ() {
        this.A02 = new LinkedList();
        this.A00 = false;
        this.A00 = true;
        this.A01 = new C07930aK();
    }

    public C07920aJ(byte[] bArr) {
        this.A02 = new LinkedList();
        this.A00 = false;
        C880641p c880641p = (C880641p) C0AZ.A03(C880641p.A03, bArr);
        this.A01 = new C07930aK(c880641p.A0i());
        this.A00 = false;
        for (C2U4 c2u4 : c880641p.A01) {
            this.A02.add(new C07930aK(c2u4));
        }
    }

    public byte[] A00() {
        LinkedList linkedList = new LinkedList();
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            linkedList.add(((C07930aK) it.next()).A00);
        }
        C880541o c880541o = (C880541o) C880641p.A03.AVX();
        C2U4 c2u4 = this.A01.A00;
        c880541o.A02();
        C880641p.A09((C880641p) c880541o.A00, c2u4);
        c880541o.A04(linkedList);
        return c880541o.A01().A0B();
    }
}
