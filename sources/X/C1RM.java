package X;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.1RM */
/* loaded from: classes.dex */
public class C1RM {
    public LinkedList A00 = new LinkedList();

    public C1RM() {
    }

    public C1RM(byte[] bArr) {
        for (C13510lN c13510lN : ((C13520lO) C0AZ.A03(C13520lO.A01, bArr)).A00) {
            this.A00.add(new C1RN(c13510lN));
        }
    }

    public C1RN A00() {
        if (!this.A00.isEmpty()) {
            return (C1RN) this.A00.get(0);
        }
        throw new C1RA("No key state in record!");
    }

    public void A01(int i, byte[][] bArr, C02670Ci c02670Ci) {
        LinkedList linkedList = this.A00;
        linkedList.clear();
        linkedList.add(new C1RN(i, 0, bArr, c02670Ci.A00, AbstractC75873fg.A00(c02670Ci.A01)));
    }

    public byte[] A02() {
        C0CT AVX = C13520lO.A01.AVX();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C13510lN c13510lN = ((C1RN) it.next()).A00;
            AVX.A02();
            C13520lO c13520lO = (C13520lO) AVX.A00;
            if (c13510lN != null) {
                C0CX c0cx = c13520lO.A00;
                if (!((C0CY) c0cx).A00) {
                    c0cx = C0AZ.A05(c0cx);
                    c13520lO.A00 = c0cx;
                }
                c0cx.add(c13510lN);
            } else {
                throw null;
            }
        }
        return AVX.A01().A0B();
    }
}
