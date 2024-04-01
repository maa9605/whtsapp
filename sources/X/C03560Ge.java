package X;

import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: X.0Ge */
/* loaded from: classes.dex */
public class C03560Ge {
    public final C013306k A00;
    public final C013406l A01;
    public final InterfaceC03570Gf A02;
    public final InterfaceC002901k A03;

    public C03560Ge(InterfaceC002901k interfaceC002901k, C013406l c013406l, InterfaceC03570Gf interfaceC03570Gf, C013306k c013306k) {
        this.A03 = interfaceC002901k;
        this.A01 = c013406l;
        this.A02 = interfaceC03570Gf;
        this.A00 = c013306k;
    }

    public C0CI A00() {
        C0CI c0ci = new C0CI();
        this.A03.AS1(new RunnableEBaseShape1S0200000_I0_1(this, c0ci, 45));
        return c0ci;
    }

    public void A01() {
        this.A03.ARy(new C3AA() { // from class: X.3Ju
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(null);
                C03560Ge.this = this;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                C013406l c013406l = C03560Ge.this.A01;
                boolean A0G = c013406l.A0G();
                if (c013406l != null) {
                    boolean z = A0G & true;
                    C0CD A03 = c013406l.A01.A03();
                    try {
                        int A01 = A03.A02.A01("contacts", null, null);
                        if (A01 >= 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("PAY: PaymentStore removeAllContacts deleted num rows: ");
                            sb.append(A01);
                            Log.i(sb.toString());
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("PAY: PaymentStore removeAllContacts could not delete all rows: ");
                            sb2.append(A01);
                            Log.w(sb2.toString());
                        }
                        boolean z2 = A01 >= 0;
                        A03.close();
                        boolean z3 = z & z2;
                        A03 = c013406l.A01.A03();
                        try {
                            int A012 = A03.A02.A01("tmp_transactions", null, null);
                            if (A012 < 0) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("PAY: PaymentStore removeAllPaymentTransactionTmpInfo could not delete all rows: ");
                                sb3.append(A012);
                                Log.w(sb3.toString());
                            }
                            boolean z4 = A012 >= 0;
                            A03.close();
                            return Boolean.valueOf(z3 & z4);
                        } finally {
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    throw null;
                }
            }
        }, new Void[0]);
    }

    public void A02(C0N2 c0n2, C28N c28n) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c0n2);
        InterfaceC002901k interfaceC002901k = this.A03;
        interfaceC002901k.ARy(new C28b(interfaceC002901k, this.A01, this.A02, arrayList, c28n) { // from class: X.3Jv
            public final C013406l A00;
            public final Set A01;

            {
                this.A00 = r4;
                TreeSet treeSet = new TreeSet(new Comparator() { // from class: X.2te
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ((C0N2) obj).A07.compareTo(((C0N2) obj2).A07);
                    }
                });
                this.A01 = treeSet;
                treeSet.addAll(arrayList);
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                List A0A = this.A00.A0A();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = ((AbstractCollection) A0A).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!this.A01.contains(next)) {
                        arrayList2.add(next);
                    }
                }
                Set set = this.A01;
                arrayList2.addAll(set);
                C60012tm A0A2 = A0A(arrayList2);
                ArrayList arrayList3 = new ArrayList(set.size());
                for (Object obj : A0A2.A00) {
                    if (set.contains(obj)) {
                        arrayList3.add(obj);
                    }
                }
                return new C60012tm(A0A2.A01, arrayList3);
            }
        }, new Void[0]);
    }

    public void A03(List list, C28N c28n) {
        InterfaceC002901k interfaceC002901k = this.A03;
        interfaceC002901k.ARy(new C28b(interfaceC002901k, this.A01, this.A02, list, c28n) { // from class: X.3Jw
            public final List A00;

            {
                this.A00 = list;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                return A0A(this.A00);
            }
        }, new Void[0]);
    }
}
