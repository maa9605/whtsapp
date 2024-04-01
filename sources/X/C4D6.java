package X;

import android.view.View;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.4D6 */
/* loaded from: classes3.dex */
public class C4D6 implements C49D {
    public final /* synthetic */ C014006r A00;
    public final /* synthetic */ C0N2 A01;
    public final /* synthetic */ PinBottomSheetDialogFragment A02;
    public final /* synthetic */ BrazilPaymentActivity A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public C4D6(BrazilPaymentActivity brazilPaymentActivity, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C014006r c014006r, C0N2 c0n2, boolean z, String str) {
        this.A03 = brazilPaymentActivity;
        this.A02 = pinBottomSheetDialogFragment;
        this.A00 = c014006r;
        this.A01 = c0n2;
        this.A05 = z;
        this.A04 = str;
    }

    @Override // X.C49D
    public void AIo(final String str) {
        this.A02.A1D();
        BrazilPaymentActivity brazilPaymentActivity = this.A03;
        int intValue = this.A00.A00.scaleByPowerOfTen(3).intValue();
        InterfaceC013706o interfaceC013706o = C013806p.A04;
        if (brazilPaymentActivity != null) {
            C466327p c466327p = new C466327p(intValue, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, interfaceC013706o);
            AnonymousClass012 anonymousClass012 = ((C4KG) brazilPaymentActivity).A05;
            C018508q c018508q = ((ActivityC02290Ap) brazilPaymentActivity).A0A;
            C02L c02l = ((C4KG) brazilPaymentActivity).A02;
            InterfaceC002901k interfaceC002901k = ((C4KG) brazilPaymentActivity).A0K;
            C895947p c895947p = ((C4KG) brazilPaymentActivity).A0G;
            C0DV c0dv = ((C4KG) brazilPaymentActivity).A0F;
            C49682Lx c49682Lx = brazilPaymentActivity.A0R;
            C0E7 c0e7 = ((ActivityC02290Ap) brazilPaymentActivity).A0D;
            AnonymousClass499 anonymousClass499 = brazilPaymentActivity.A0L;
            C463026g c463026g = ((C4KG) brazilPaymentActivity).A0C;
            C28S c28s = brazilPaymentActivity.A0E;
            AnonymousClass493 anonymousClass493 = brazilPaymentActivity.A0K;
            C899048w c899048w = brazilPaymentActivity.A0I;
            C0N2 c0n2 = this.A01;
            String str2 = c0n2.A07;
            UserJid userJid = ((C4KG) brazilPaymentActivity).A0A;
            if (userJid != null) {
                boolean z = this.A05;
                final C90634Bu c90634Bu = new C90634Bu(anonymousClass012, brazilPaymentActivity, c018508q, c02l, interfaceC002901k, c895947p, c0dv, c49682Lx, c0e7, anonymousClass499, c463026g, c28s, anonymousClass493, c899048w, str2, userJid, c466327p, c466327p, z ? "p2m" : "p2p", BrazilPaymentActivity.A00(z, c0n2));
                final C4D5 c4d5 = new C4D5(this);
                c90634Bu.A0K.AS1(new RunnableC69153Ni(c90634Bu));
                C899048w c899048w2 = c90634Bu.A0E;
                String str3 = c90634Bu.A0O;
                C77343i3 A02 = c899048w2.A02(str3, "PIN", true);
                if (A02 == null) {
                    c90634Bu.A0D.A00(str3, new C48Q() { // from class: X.4CJ
                        @Override // X.C48Q
                        public void AJs(C28Q c28q) {
                            c4d5.AJs(c28q);
                        }

                        @Override // X.C48Q
                        public void AO6(C77343i3 c77343i3) {
                            C48P c48p = c90634Bu;
                            C49A c49a = new C49A(c77343i3);
                            c48p.A0C.A01(c49a, str, new C4CK(c48p, c49a, c4d5));
                        }
                    });
                    return;
                }
                C49A c49a = new C49A(A02);
                c90634Bu.A0C.A01(c49a, str, new C4CK(c90634Bu, c49a, c4d5));
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.C49D
    public void AKa(View view) {
        BrazilPaymentActivity brazilPaymentActivity = this.A03;
        if (brazilPaymentActivity.A09 != null) {
            ((C4KG) brazilPaymentActivity).A0K.ARy(new C4BY(((C4KG) brazilPaymentActivity).A0F, new C76943hP(brazilPaymentActivity)), new Void[0]);
            return;
        }
        throw null;
    }
}
