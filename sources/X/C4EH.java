package X;

import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4EH  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4EH extends C0HS {
    public C78323jj A00;
    public final C900249j A01;
    public final ArrayList A02;
    public final /* synthetic */ PaymentTransactionHistoryActivity A03;

    public C4EH(PaymentTransactionHistoryActivity paymentTransactionHistoryActivity, ArrayList arrayList, C78323jj c78323jj, C900249j c900249j) {
        ArrayList arrayList2;
        this.A03 = paymentTransactionHistoryActivity;
        if (arrayList != null) {
            arrayList2 = new ArrayList(arrayList);
        } else {
            arrayList2 = null;
        }
        this.A02 = arrayList2;
        this.A00 = c78323jj;
        this.A01 = c900249j;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        List A0Z;
        String str;
        PaymentTransactionHistoryActivity paymentTransactionHistoryActivity = this.A03;
        if (paymentTransactionHistoryActivity.A06 == null) {
            if (!paymentTransactionHistoryActivity.A0N && ((ActivityC02290Ap) paymentTransactionHistoryActivity).A0B.A0E(C01C.A20)) {
                C28021Ps c28021Ps = paymentTransactionHistoryActivity.A0R;
                if (c28021Ps.A02 || c28021Ps.A01 || c28021Ps.A05 || c28021Ps.A06 || c28021Ps.A00 != null) {
                    c28021Ps.A04 = false;
                    c28021Ps.A03 = true;
                    C0DV c0dv = paymentTransactionHistoryActivity.A0A;
                    c0dv.A04();
                    A0Z = c0dv.A07.A0a(c28021Ps);
                }
            }
            boolean z = paymentTransactionHistoryActivity.A0N;
            C0DV c0dv2 = paymentTransactionHistoryActivity.A0A;
            if (z) {
                c0dv2.A04();
                A0Z = c0dv2.A07.A0U(-1);
            } else {
                c0dv2.A04();
                A0Z = c0dv2.A07.A0Z(null);
            }
        } else {
            C0DV c0dv3 = paymentTransactionHistoryActivity.A0A;
            c0dv3.A04();
            A0Z = c0dv3.A07.A0Z(paymentTransactionHistoryActivity.A06);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.A02;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it = A0Z.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass093 anonymousClass093 = (AnonymousClass093) it.next();
                AnonymousClass092 A0E = paymentTransactionHistoryActivity.A04.A0E(anonymousClass093);
                if (A0E != null) {
                    str = A0E.A0G();
                } else {
                    str = null;
                }
                if (C09940f2.A04(str, arrayList2, paymentTransactionHistoryActivity.A03)) {
                    arrayList.add(anonymousClass093);
                } else if (C09940f2.A04(paymentTransactionHistoryActivity.A0H.A0G(anonymousClass093), arrayList2, paymentTransactionHistoryActivity.A03)) {
                    arrayList.add(anonymousClass093);
                } else if (C09940f2.A04(paymentTransactionHistoryActivity.A0H.A0C(anonymousClass093), arrayList2, paymentTransactionHistoryActivity.A03)) {
                    arrayList.add(anonymousClass093);
                }
                if (A04()) {
                    arrayList.clear();
                    arrayList.addAll(A0Z);
                    break;
                }
            }
        } else {
            arrayList.addAll(A0Z);
            if (!paymentTransactionHistoryActivity.A0O && !paymentTransactionHistoryActivity.A0M) {
                paymentTransactionHistoryActivity.A0I.AS1(new RunnableC70053Qu(this, A0Z));
            }
        }
        return new C0FK(arrayList, this.A01.A03(arrayList));
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C0FK c0fk = (C0FK) obj;
        C78323jj c78323jj = this.A00;
        PaymentTransactionHistoryActivity paymentTransactionHistoryActivity = this.A03;
        String str = paymentTransactionHistoryActivity.A0J;
        if (str == null) {
            str = "";
        }
        C28021Ps c28021Ps = paymentTransactionHistoryActivity.A0R;
        Object obj2 = c0fk.A00;
        if (obj2 != null) {
            List list = (List) obj2;
            Object obj3 = c0fk.A01;
            if (obj3 != null) {
                c78323jj.A00.A1U(str, c28021Ps, list, (List) obj3);
                return;
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r4 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void A0A(java.util.List r8) {
        /*
            r7 = this;
            r6 = 0
            r1 = 0
            r5 = 0
            r4 = 0
            r3 = 0
            r2 = 0
        L6:
            int r0 = r8.size()
            if (r1 >= r0) goto L2c
            java.lang.Object r0 = r8.get(r1)
            X.093 r0 = (X.AnonymousClass093) r0
            boolean r0 = r0.A0O
            if (r0 == 0) goto L43
            r5 = 1
        L17:
            java.lang.Object r0 = r8.get(r1)
            X.093 r0 = (X.AnonymousClass093) r0
            boolean r0 = X.C03750Gx.A04(r0)
            if (r0 == 0) goto L41
            r3 = 1
        L24:
            if (r5 == 0) goto L3e
            if (r4 == 0) goto L3e
            if (r3 == 0) goto L3e
            if (r2 == 0) goto L3e
        L2c:
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r1 = r7.A03
            if (r5 == 0) goto L33
            r0 = 1
            if (r4 != 0) goto L34
        L33:
            r0 = 0
        L34:
            r1.A0O = r0
            if (r3 == 0) goto L3b
            if (r2 == 0) goto L3b
            r6 = 1
        L3b:
            r1.A0M = r6
            return
        L3e:
            int r1 = r1 + 1
            goto L6
        L41:
            r2 = 1
            goto L24
        L43:
            r4 = 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4EH.A0A(java.util.List):void");
    }
}
