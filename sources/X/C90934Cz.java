package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.4Cz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C90934Cz implements InterfaceC896347v {
    public final /* synthetic */ C45T A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;
    public final /* synthetic */ String A02;

    public C90934Cz(BrazilPayBloksActivity brazilPayBloksActivity, C45T c45t, String str) {
        this.A01 = brazilPayBloksActivity;
        this.A00 = c45t;
        this.A02 = str;
    }

    public /* synthetic */ void A00(C45T c45t, List list) {
        if (list.size() > 0) {
            c45t.A03("on_success", this.A01.A0I.A03((C0N7) list.get(0), null));
        }
    }

    @Override // X.InterfaceC896347v
    public void AIH(C0N7 c0n7) {
        Log.i("PAY: BrazilPayBloksActivity BrazilGetVerificationMethods - onCardVerified");
        C03560Ge A01 = ((C4Ku) this.A01).A0I.A01();
        final C45T c45t = this.A00;
        A01.A02(c0n7, new C28N() { // from class: X.3iW
            @Override // X.C28N
            public final void AH2(List list) {
                C90934Cz.this.A00(c45t, list);
            }
        });
    }

    @Override // X.InterfaceC896347v
    public void AOD(ArrayList arrayList, C28Q c28q) {
        if (c28q != null) {
            C4Ku.A01(null, c28q.A00, this.A00);
        } else if (arrayList != null && !arrayList.isEmpty()) {
            if (C47W.A02(arrayList)) {
                C4Ku.A01(null, -233, this.A00);
                return;
            }
            BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
            JSONArray A03 = brazilPayBloksActivity.A08.A03(arrayList);
            C0N7 c0n7 = (C0N7) brazilPayBloksActivity.A07.A08(this.A02);
            if (A03 != null) {
                this.A00.A03("on_success", brazilPayBloksActivity.A0I.A03(c0n7, A03.toString()));
            }
        }
    }
}
