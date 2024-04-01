package X;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity;

/* renamed from: X.4HB  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4HB extends C28661Tc {
    public final /* synthetic */ IndiaUpiQrCodeScannedDialogFragment A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C4HB(IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment, String str, String str2) {
        this.A00 = indiaUpiQrCodeScannedDialogFragment;
        this.A02 = str;
        this.A01 = str2;
    }

    public /* synthetic */ void A00(C4AY c4ay) {
        IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment = this.A00;
        if (indiaUpiQrCodeScannedDialogFragment != null) {
            int i = c4ay.A00;
            if (i == 0) {
                Intent intent = new Intent(indiaUpiQrCodeScannedDialogFragment.A09(), IndiaUpiPaymentsAccountSetupActivity.class);
                intent.putExtra("extra_setup_mode", 1);
                Object A01 = indiaUpiQrCodeScannedDialogFragment.A0F.A06.A01();
                if (A01 != null) {
                    C40841sx.A0W(intent, (C49E) A01);
                    indiaUpiQrCodeScannedDialogFragment.A0i(intent);
                    C0BA c0ba = ((C0BA) indiaUpiQrCodeScannedDialogFragment).A0D;
                    if (!(c0ba instanceof DialogFragment)) {
                        return;
                    }
                    ((DialogFragment) c0ba).A10();
                    return;
                }
                throw null;
            } else if (i != 1) {
                if (i == 10) {
                    indiaUpiQrCodeScannedDialogFragment.A02.setVisibility(8);
                    indiaUpiQrCodeScannedDialogFragment.A09.setVisibility(0);
                    return;
                }
                return;
            } else {
                Intent intent2 = new Intent(indiaUpiQrCodeScannedDialogFragment.A09(), IndiaUpiQrCodeUrlValidationActivity.class);
                intent2.putExtra("ARG_URL", c4ay.A01);
                intent2.putExtra("external_payment_source", c4ay.A02);
                indiaUpiQrCodeScannedDialogFragment.A0i(intent2);
                C0BA c0ba2 = ((C0BA) indiaUpiQrCodeScannedDialogFragment).A0D;
                if (!(c0ba2 instanceof DialogFragment)) {
                    return;
                }
                ((DialogFragment) c0ba2).A10();
                return;
            }
        }
        throw null;
    }

    public /* synthetic */ void A01(C90214Ac c90214Ac) {
        IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment = this.A00;
        indiaUpiQrCodeScannedDialogFragment.A04.setVisibility(c90214Ac.A00);
        if (c90214Ac.A00 == 0) {
            ((TextView) indiaUpiQrCodeScannedDialogFragment.A01.findViewById(R.id.payment_amount_field)).setText(c90214Ac.A01);
        }
    }

    public /* synthetic */ void A02(Boolean bool) {
        this.A00.A05.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public /* synthetic */ void A03(Boolean bool) {
        this.A00.A00.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public void A04(Integer num) {
        IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment = this.A00;
        int intValue = num.intValue();
        indiaUpiQrCodeScannedDialogFragment.A06.setVisibility(intValue == 0 ? 0 : 8);
        indiaUpiQrCodeScannedDialogFragment.A03.setVisibility(intValue == 1 ? 0 : 8);
        indiaUpiQrCodeScannedDialogFragment.A09.setVisibility(intValue != 3 ? 8 : 0);
    }

    public /* synthetic */ void A05(Integer num) {
        this.A00.A02.setText(num.intValue());
    }

    public /* synthetic */ void A06(String str) {
        this.A00.A09.setText(str);
    }

    public /* synthetic */ void A07(String str) {
        this.A00.A08.setText(str);
    }

    public /* synthetic */ void A08(String str) {
        this.A00.A07.setText(str);
    }

    public /* synthetic */ void A09(String str) {
        this.A00.A09.setText(str);
    }

    @Override // X.C28661Tc, X.C0CR
    public C0MU A6e(Class cls) {
        String A0D;
        String obj;
        int i;
        C49E A00;
        if (cls.isAssignableFrom(C91514Ff.class)) {
            IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment = this.A00;
            C91514Ff c91514Ff = new C91514Ff(indiaUpiQrCodeScannedDialogFragment.A0A, indiaUpiQrCodeScannedDialogFragment.A0B, indiaUpiQrCodeScannedDialogFragment.A0D, indiaUpiQrCodeScannedDialogFragment.A0E, indiaUpiQrCodeScannedDialogFragment.A0C);
            InterfaceC05620Pl interfaceC05620Pl = new InterfaceC05620Pl() { // from class: X.3jB
                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj2) {
                    C4HB.this.A04((Integer) obj2);
                }
            };
            InterfaceC05620Pl interfaceC05620Pl2 = new InterfaceC05620Pl() { // from class: X.3j9
                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj2) {
                    C4HB.this.A06((String) obj2);
                }
            };
            InterfaceC05620Pl interfaceC05620Pl3 = new InterfaceC05620Pl() { // from class: X.3jA
                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj2) {
                    C4HB.this.A02((Boolean) obj2);
                }
            };
            InterfaceC05620Pl interfaceC05620Pl4 = new InterfaceC05620Pl() { // from class: X.3j8
                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj2) {
                    C4HB.this.A03((Boolean) obj2);
                }
            };
            InterfaceC05620Pl interfaceC05620Pl5 = new InterfaceC05620Pl() { // from class: X.3jE
                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj2) {
                    C4HB.this.A07((String) obj2);
                }
            };
            InterfaceC05620Pl interfaceC05620Pl6 = new InterfaceC05620Pl() { // from class: X.3jG
                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj2) {
                    C4HB.this.A08((String) obj2);
                }
            };
            InterfaceC05620Pl interfaceC05620Pl7 = new InterfaceC05620Pl() { // from class: X.3jC
                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj2) {
                    C4HB.this.A05((Integer) obj2);
                }
            };
            InterfaceC05620Pl interfaceC05620Pl8 = new InterfaceC05620Pl() { // from class: X.3jD
                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj2) {
                    C4HB.this.A01((C90214Ac) obj2);
                }
            };
            InterfaceC05620Pl interfaceC05620Pl9 = new InterfaceC05620Pl() { // from class: X.3jF
                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj2) {
                    C4HB.this.A09((String) obj2);
                }
            };
            c91514Ff.A02.A05(indiaUpiQrCodeScannedDialogFragment, interfaceC05620Pl);
            c91514Ff.A05.A05(indiaUpiQrCodeScannedDialogFragment, interfaceC05620Pl2);
            c91514Ff.A09.A05(indiaUpiQrCodeScannedDialogFragment, interfaceC05620Pl3);
            c91514Ff.A08.A05(indiaUpiQrCodeScannedDialogFragment, interfaceC05620Pl4);
            c91514Ff.A01.A05(indiaUpiQrCodeScannedDialogFragment, interfaceC05620Pl5);
            c91514Ff.A00.A05(indiaUpiQrCodeScannedDialogFragment, interfaceC05620Pl6);
            c91514Ff.A03.A05(indiaUpiQrCodeScannedDialogFragment, interfaceC05620Pl7);
            c91514Ff.A07.A05(indiaUpiQrCodeScannedDialogFragment, interfaceC05620Pl8);
            c91514Ff.A04.A05(indiaUpiQrCodeScannedDialogFragment, interfaceC05620Pl9);
            c91514Ff.A0A.A05(indiaUpiQrCodeScannedDialogFragment, new InterfaceC05620Pl() { // from class: X.3jH
                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj2) {
                    C4HB.this.A00((C4AY) obj2);
                }
            });
            String str = this.A02;
            String str2 = this.A01;
            boolean equals = str2.equals("QR_CODE");
            C49E c49e = null;
            if (str != null && (A00 = C49E.A00(Uri.parse(str), equals)) != null) {
                A00.A02 = str;
                c49e = A00;
            }
            String A05 = c91514Ff.A0E.A05();
            if (c49e != null && !TextUtils.isEmpty(str) && !C40841sx.A0j(c49e.A0B, A05, c49e.A03, c49e.A05, c49e.A04, c49e.A06, c49e.A00, str2)) {
                c91514Ff.A0B = str2;
                c91514Ff.A06.A0B(c49e);
                InterfaceC013706o A01 = c91514Ff.A0G.A01();
                C002301c c002301c = c91514Ff.A0D;
                if (TextUtils.isEmpty(c49e.A04)) {
                    obj = null;
                } else {
                    StringBuilder sb = new StringBuilder();
                    if (!TextUtils.isEmpty(c49e.A05)) {
                        String str3 = c49e.A04;
                        String str4 = c49e.A05;
                        if (!str3.equals(str4)) {
                            sb.append(A01.A81(c002301c, C014006r.A00(str4, A01.A9i())));
                            sb.append(" - ");
                        }
                    }
                    sb.append(A01.A81(c002301c, C014006r.A00(c49e.A04, A01.A9i())));
                    obj = sb.toString();
                }
                c91514Ff.A01.A0B(c49e.A03);
                c91514Ff.A00.A0B(c49e.A0B);
                C0HK c0hk = c91514Ff.A03;
                if (c91514Ff.A0F.A08()) {
                    boolean isEmpty = TextUtils.isEmpty(obj);
                    i = R.string.payment_qr_send_payment_cta;
                    if (isEmpty) {
                        i = R.string.payment_qr_new_payment_cta;
                    }
                } else {
                    i = R.string.payment_qr_new_payment_cta_for_onboarding;
                }
                c0hk.A0B(Integer.valueOf(i));
                if (!TextUtils.isEmpty(obj)) {
                    c91514Ff.A07.A0B(new C90214Ac(obj));
                }
                c91514Ff.A02.A0B(1);
                if (c91514Ff.A0C.A0E(C01C.A1w) && TextUtils.isEmpty(c49e.A08)) {
                    c91514Ff.A09.A0B(Boolean.TRUE);
                    c91514Ff.A08.A0B(Boolean.valueOf(TextUtils.isEmpty(c49e.A04)));
                }
                return c91514Ff;
            }
            c91514Ff.A0A.A0B(new C4AY(10));
            C0HK c0hk2 = c91514Ff.A04;
            if (c49e != null && !TextUtils.isEmpty(c49e.A0B) && c49e.A0B.equals(A05)) {
                A0D = c91514Ff.A0D.A06(R.string.payments_deeplink_cannot_send_self);
            } else {
                C002301c c002301c2 = c91514Ff.A0D;
                A0D = c002301c2.A0D(R.string.payments_deeplink_invalid_param, c002301c2.A06(R.string.india_upi_payment_id_name));
            }
            c0hk2.A0B(A0D);
            c91514Ff.A02.A0B(3);
            return c91514Ff;
        }
        throw new IllegalArgumentException("Invalid viewModel");
    }
}
