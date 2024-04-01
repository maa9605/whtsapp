package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4GM  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4GM extends C28V {
    public final /* synthetic */ C4IC A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4GM(C4IC c4ic, Context context, C018508q c018508q, C0E7 c0e7, C28S c28s) {
        super(context, c018508q, c0e7, c28s);
        this.A00 = c4ic;
    }

    @Override // X.C28V
    public void A02(C28Q c28q) {
        StringBuilder sb = new StringBuilder("PAY: BrazilAddCardAction onRequestError: ");
        sb.append(c28q);
        Log.i(sb.toString());
        this.A00.A0C.A00(null, false, null, c28q);
    }

    @Override // X.C28V
    public void A03(C28Q c28q) {
        StringBuilder sb = new StringBuilder("PAY: BrazilAddCardAction onResponseError: ");
        sb.append(c28q);
        Log.i(sb.toString());
        this.A00.A0C.A00(null, false, null, c28q);
    }

    @Override // X.C28V
    public void A04(C02590Ca c02590Ca) {
        C02590Ca A0D;
        C02590Ca[] c02590CaArr;
        int length;
        C02590Ca A0D2 = c02590Ca.A0D("account");
        if (A0D2 != null && (A0D = A0D2.A0D("card")) != null) {
            C92224Ib c92224Ib = new C92224Ib();
            C4IC c4ic = this.A00;
            c92224Ib.A03(c4ic.A07, 0, A0D);
            final C0N7 c0n7 = (C0N7) c92224Ib.A05();
            c4ic.A0D.A01(c0n7, null);
            if (c92224Ib.A0X) {
                c4ic.A0A.A01().A02(c0n7, new C28N() { // from class: X.3hm
                    @Override // X.C28N
                    public final void AH2(List list) {
                        C4GM.this.A05(c0n7);
                    }
                });
                return;
            } else if (!c92224Ib.A07) {
                final ArrayList arrayList = new ArrayList();
                C02590Ca A0D3 = A0D2.A0D("verify-method-list");
                if (A0D3 != null && (c02590CaArr = A0D3.A03) != null && (length = c02590CaArr.length) > 0) {
                    for (int i = 0; i < length; i++) {
                        arrayList.add(new C898048m(A0D3.A0C(i)));
                    }
                }
                c4ic.A0A.A01().A02(c0n7, new C28N() { // from class: X.3ho
                    @Override // X.C28N
                    public final void AH2(List list) {
                        C4GM.this.A07(c0n7, arrayList);
                    }
                });
                return;
            } else {
                c4ic.A0A.A01().A02(c0n7, new C28N() { // from class: X.3hn
                    @Override // X.C28N
                    public final void AH2(List list) {
                        C4GM.this.A06(c0n7);
                    }
                });
                return;
            }
        }
        this.A00.A0C.A00(null, false, null, new C28Q());
    }

    public /* synthetic */ void A05(C0N7 c0n7) {
        this.A00.A0C.A00(c0n7, true, null, null);
    }

    public /* synthetic */ void A06(C0N7 c0n7) {
        this.A00.A0C.A00(c0n7, false, null, null);
    }

    public /* synthetic */ void A07(C0N7 c0n7, ArrayList arrayList) {
        this.A00.A0C.A00(c0n7, false, arrayList, null);
    }
}
