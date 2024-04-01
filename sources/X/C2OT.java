package X;

import android.app.Activity;
import com.google.android.search.verification.client.R;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2OT */
/* loaded from: classes2.dex */
public class C2OT {
    public static volatile C2OT A05;
    public final C40261rr A00;
    public final C05W A01;
    public final C018708s A02;
    public final C463026g A03;
    public final C0DV A04;

    public C2OT(C05W c05w, C018708s c018708s, C0DV c0dv, C40261rr c40261rr, C463026g c463026g) {
        this.A01 = c05w;
        this.A02 = c018708s;
        this.A04 = c0dv;
        this.A00 = c40261rr;
        this.A03 = c463026g;
    }

    public static C2OT A00() {
        if (A05 == null) {
            synchronized (C2OT.class) {
                if (A05 == null) {
                    A05 = new C2OT(C05W.A00(), C018708s.A00(), C0DV.A00(), C40261rr.A00(), C463026g.A00());
                }
            }
        }
        return A05;
    }

    public void A01(final Activity activity, final UserJid userJid, final String str, boolean z, boolean z2, final InterfaceC40271rs interfaceC40271rs) {
        String str2;
        boolean z3 = userJid != null;
        int i = R.string.payment_unblock_ask;
        if (z2) {
            i = R.string.payment_unblock_reject_ask;
        }
        Object[] objArr = new Object[1];
        if (z3) {
            str2 = this.A02.A08(this.A01.A0A(userJid), false);
        } else {
            str2 = str;
        }
        objArr[0] = str2;
        String string = activity.getString(i, objArr);
        C2nQ c2nQ = null;
        if (z3) {
            c2nQ = new C2nQ() { // from class: X.3hX
                {
                    C2OT.this = this;
                }

                @Override // X.C2nQ
                public final void AVi() {
                    C2OT c2ot = C2OT.this;
                    Activity activity2 = activity;
                    InterfaceC40271rs interfaceC40271rs2 = interfaceC40271rs;
                    UserJid userJid2 = userJid;
                    C40261rr c40261rr = c2ot.A00;
                    UserJid of = UserJid.of(userJid2);
                    if (of != null) {
                        c40261rr.A07(activity2, interfaceC40271rs2, of);
                        return;
                    }
                    throw null;
                }
            };
        } else if (this.A04.A03().A9C() != null) {
            c2nQ = new C2nQ() { // from class: X.3hW
                {
                    C2OT.this = this;
                }

                @Override // X.C2nQ
                public final void AVi() {
                    C2OT c2ot = C2OT.this;
                    Activity activity2 = activity;
                    String str3 = str;
                    final InterfaceC40271rs interfaceC40271rs2 = interfaceC40271rs;
                    ((C45A) c2ot.A04.A03().A9C()).A03(activity2, c2ot.A03, str3, false, new C3NR() { // from class: X.3hV
                        @Override // X.C3NR
                        public final void AO5(C28Q c28q) {
                            InterfaceC40271rs interfaceC40271rs3 = interfaceC40271rs2;
                            if (interfaceC40271rs3 != null) {
                                interfaceC40271rs3.AOE(c28q == null);
                            }
                        }
                    });
                }
            };
        }
        ((C0B5) activity).AUh(UnblockDialogFragment.A00(string, 0, z, c2nQ));
    }
}
