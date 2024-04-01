package X;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.1RO */
/* loaded from: classes.dex */
public class C1RO {
    public LinkedList A00 = new LinkedList();

    public C1RO() {
    }

    public C1RO(byte[] bArr) {
        for (C12560jg c12560jg : ((C13260kr) C0AZ.A03(C13260kr.A01, bArr)).A00) {
            this.A00.add(new C1RP(c12560jg));
        }
    }

    public void A00(int i, byte[] bArr, C02670Ci c02670Ci) {
        LinkedList linkedList = this.A00;
        linkedList.clear();
        linkedList.add(new C1RP(i, 0, bArr, c02670Ci.A00, AbstractC75873fg.A00(c02670Ci.A01)));
    }

    public byte[] A01() {
        C0CT AVX = C13260kr.A01.AVX();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C12560jg c12560jg = ((C1RP) it.next()).A00;
            AVX.A02();
            C13260kr c13260kr = (C13260kr) AVX.A00;
            if (c12560jg != null) {
                C0CX c0cx = c13260kr.A00;
                if (!((C0CY) c0cx).A00) {
                    c0cx = C0AZ.A05(c0cx);
                    c13260kr.A00 = c0cx;
                }
                c0cx.add(c12560jg);
            } else {
                throw null;
            }
        }
        return AVX.A01().A0B();
    }
}
