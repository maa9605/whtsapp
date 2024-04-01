package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.MandatePaymentBottomSheetFragment;

/* renamed from: X.4CZ */
/* loaded from: classes3.dex */
public class C4CZ extends AbstractC27991Pp {
    public final C018508q A00;
    public final C01B A01;
    public final C0E7 A02;
    public final C0GZ A03;
    public final C28S A04;
    public final C2OU A05;
    public final C0EX A06;
    public final C463026g A07;
    public final C0DV A08;
    public final C0VZ A09;
    public final C49682Lx A0A;

    public C4CZ(C018508q c018508q, C01B c01b, C03750Gx c03750Gx, C49682Lx c49682Lx, C0DV c0dv, C0VZ c0vz, C0E7 c0e7, C0GZ c0gz, C463026g c463026g, C28S c28s, C2OU c2ou, C0EX c0ex) {
        super(c03750Gx);
        this.A00 = c018508q;
        this.A01 = c01b;
        this.A0A = c49682Lx;
        this.A08 = c0dv;
        this.A09 = c0vz;
        this.A02 = c0e7;
        this.A03 = c0gz;
        this.A07 = c463026g;
        this.A04 = c28s;
        this.A05 = c2ou;
        this.A06 = c0ex;
    }

    public static /* synthetic */ void A00(Context context, AnonymousClass093 anonymousClass093) {
        String str = anonymousClass093.A0I;
        Intent intent = new Intent(context, IndiaUpiMandatePaymentActivity.class);
        intent.putExtra("payment_transaction_info_id", str);
        intent.putExtra("payment_method", (Parcelable) null);
        intent.putExtra("is_accept_mandate", false);
        context.startActivity(intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x002b, code lost:
        if (r5 != 418) goto L55;
     */
    @Override // X.AbstractC27991Pp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A01(X.AnonymousClass093 r17) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4CZ.A01(X.093):java.lang.String");
    }

    public void A02(final Context context, final AnonymousClass093 anonymousClass093, final C2OS c2os) {
        C019208x c019208x = new C019208x(context);
        c019208x.A02(R.string.upi_mandate_decline_confirm_message);
        c019208x.A01.A0J = true;
        c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3Nu
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        c019208x.A06(R.string.payments_decline_request, new DialogInterface.OnClickListener() { // from class: X.3Nr
            {
                C4CZ.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C4CZ.this.A04(context, anonymousClass093, c2os, true);
            }
        });
        c019208x.A00().show();
    }

    public /* synthetic */ void A03(Context context, AnonymousClass093 anonymousClass093, C2OS c2os) {
        if (!this.A03.A08()) {
            Intent intent = new Intent(context, IndiaUpiPaymentsAccountSetupActivity.class);
            intent.putExtra("extra_setup_mode", 1);
            intent.putExtra("extra_bank_account_link_completed_send_payment_default_action", 1);
            context.startActivity(intent);
            return;
        }
        A04(context, anonymousClass093, c2os, false);
    }

    public final void A04(final Context context, final AnonymousClass093 anonymousClass093, final C2OS c2os, final boolean z) {
        this.A05.A02(context, anonymousClass093, z, new C3NX() { // from class: X.4CY
            {
                C4CZ.this = this;
            }

            @Override // X.C3NX
            public void AKC() {
                C4CZ.this.A05.A01(context, anonymousClass093);
            }

            @Override // X.C3NX
            public void APE() {
                if (z) {
                    final C4CZ c4cz = C4CZ.this;
                    Context context2 = context;
                    final C2OS c2os2 = c2os;
                    final AnonymousClass093 anonymousClass0932 = anonymousClass093;
                    C018508q c018508q = c4cz.A00;
                    c018508q.A06(0, R.string.register_wait_message);
                    new C4C5(context2, c018508q, new C3NV(), c4cz.A0A, c4cz.A02, c4cz.A07, c4cz.A04).A01(anonymousClass0932, null, new C3NS() { // from class: X.3i9
                        @Override // X.C3NS
                        public final void ANl(C28Q c28q) {
                            c4cz.A05(anonymousClass0932, c2os2, c28q);
                        }
                    });
                    return;
                }
                ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) C02180Ae.A0G(context, ActivityC02290Ap.class);
                if (activityC02290Ap == null) {
                    return;
                }
                PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
                AnonymousClass093 anonymousClass0933 = anonymousClass093;
                MandatePaymentBottomSheetFragment mandatePaymentBottomSheetFragment = new MandatePaymentBottomSheetFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("transaction", anonymousClass0933);
                mandatePaymentBottomSheetFragment.A0P(bundle);
                paymentBottomSheet.A01 = mandatePaymentBottomSheetFragment;
                activityC02290Ap.AUg(paymentBottomSheet, "MandatePaymentBottomSheetFragment");
            }
        });
    }

    public void A05(AnonymousClass093 anonymousClass093, C2OS c2os, C28Q c28q) {
        if (c28q == null) {
            C0DV c0dv = this.A08;
            c0dv.A04();
            c0dv.A07.A0f(anonymousClass093.A0I, 20, anonymousClass093.A04, anonymousClass093.A05, 15);
            c2os.AMs();
            this.A06.A02(anonymousClass093);
        } else {
            int i = c28q.A00 == 443 ? R.string.payments_upgrade_error : 0;
            C018508q c018508q = this.A00;
            if (i == 0) {
                i = R.string.request_cannot_be_rejected;
            }
            c018508q.A07(i, 0);
        }
        this.A00.A03();
    }
}
