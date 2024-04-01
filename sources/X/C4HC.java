package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity;

/* renamed from: X.4HC  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4HC extends C28661Tc {
    public final /* synthetic */ IndiaUpiQrCodeUrlValidationActivity A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C4HC(IndiaUpiQrCodeUrlValidationActivity indiaUpiQrCodeUrlValidationActivity, String str, String str2) {
        this.A00 = indiaUpiQrCodeUrlValidationActivity;
        this.A02 = str;
        this.A01 = str2;
    }

    public /* synthetic */ void A00(C4AZ c4az) {
        DialogInterfaceC019408z A02;
        final IndiaUpiQrCodeUrlValidationActivity indiaUpiQrCodeUrlValidationActivity = this.A00;
        if (indiaUpiQrCodeUrlValidationActivity != null) {
            switch (c4az.A00) {
                case 0:
                    indiaUpiQrCodeUrlValidationActivity.finish();
                    return;
                case 1:
                    C28Q c28q = c4az.A01;
                    if (c28q != null && (A02 = new C895547l(indiaUpiQrCodeUrlValidationActivity.A01).A02(indiaUpiQrCodeUrlValidationActivity, c28q.A00, new DialogInterface.OnDismissListener() { // from class: X.3QD
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            IndiaUpiQrCodeUrlValidationActivity.this.finish();
                        }
                    }, new DialogInterface.OnDismissListener() { // from class: X.3Q5
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            IndiaUpiQrCodeUrlValidationActivity.this.finish();
                        }
                    })) != null) {
                        A02.show();
                        return;
                    } else {
                        C002701i.A19(indiaUpiQrCodeUrlValidationActivity, 21);
                        return;
                    }
                case 2:
                    C002701i.A19(indiaUpiQrCodeUrlValidationActivity, 22);
                    return;
                case 3:
                    C002701i.A19(indiaUpiQrCodeUrlValidationActivity, 25);
                    return;
                case 4:
                    C002701i.A19(indiaUpiQrCodeUrlValidationActivity, 24);
                    return;
                case 5:
                    Intent intent = new Intent(indiaUpiQrCodeUrlValidationActivity, IndiaUpiPaymentActivity.class);
                    C40841sx.A0W(intent, indiaUpiQrCodeUrlValidationActivity.A04.A02());
                    intent.putExtra("extra_is_pay_money_only", c4az.A03);
                    intent.putExtra("return-after-pay", c4az.A04);
                    indiaUpiQrCodeUrlValidationActivity.startActivity(intent);
                    indiaUpiQrCodeUrlValidationActivity.finish();
                    return;
                case 6:
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(indiaUpiQrCodeUrlValidationActivity.A04.A02().A07));
                    if (intent2.resolveActivity(indiaUpiQrCodeUrlValidationActivity.getPackageManager()) != null) {
                        indiaUpiQrCodeUrlValidationActivity.startActivityForResult(intent2, 100);
                        return;
                    } else {
                        ((ActivityC02290Ap) indiaUpiQrCodeUrlValidationActivity).A0A.A07(R.string.activity_not_found, 0);
                        return;
                    }
                case 7:
                    indiaUpiQrCodeUrlValidationActivity.A06 = c4az.A02;
                    C002701i.A19(indiaUpiQrCodeUrlValidationActivity, 26);
                    return;
                default:
                    return;
            }
        }
        throw null;
    }

    public /* synthetic */ void A01(Boolean bool) {
        if (bool.booleanValue()) {
            this.A00.A12(R.string.payment_vpa_verify_in_progress);
        } else {
            this.A00.ARS();
        }
    }

    @Override // X.C28661Tc, X.C0CR
    public C0MU A6e(Class cls) {
        String str;
        C49E A00;
        if (cls.isAssignableFrom(C91534Fh.class)) {
            final IndiaUpiQrCodeUrlValidationActivity indiaUpiQrCodeUrlValidationActivity = this.A00;
            C91534Fh c91534Fh = new C91534Fh(indiaUpiQrCodeUrlValidationActivity.A00, indiaUpiQrCodeUrlValidationActivity.A03, indiaUpiQrCodeUrlValidationActivity.A01, indiaUpiQrCodeUrlValidationActivity.A02);
            c91534Fh.A02.A05(indiaUpiQrCodeUrlValidationActivity, new InterfaceC05620Pl() { // from class: X.3jI
                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    C4HC.this.A00((C4AZ) obj);
                }
            });
            c91534Fh.A01.A05(indiaUpiQrCodeUrlValidationActivity, new InterfaceC05620Pl() { // from class: X.3jJ
                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    C4HC.this.A01((Boolean) obj);
                }
            });
            String str2 = this.A02;
            String str3 = this.A01;
            if (TextUtils.isEmpty(str2)) {
                c91534Fh.A02.A0B(new C4AZ(0));
                return c91534Fh;
            }
            c91534Fh.A03 = str3;
            C0HK c0hk = c91534Fh.A00;
            boolean equals = str3.equals("QR_CODE");
            C49E c49e = null;
            if (str2 != null && (A00 = C49E.A00(Uri.parse(str2), equals)) != null) {
                A00.A02 = str2;
                c49e = A00;
            }
            c0hk.A0B(c49e);
            c91534Fh.A01.A0B(Boolean.TRUE);
            final C4AU c4au = c91534Fh.A08;
            final String str4 = c91534Fh.A02().A0B;
            if (c91534Fh.A05.A0E(C01C.A1z)) {
                str = c91534Fh.A02().A07;
            } else {
                str = null;
            }
            final C91524Fg c91524Fg = new C91524Fg(c91534Fh);
            AnonymousClass483 anonymousClass483 = c4au.A01;
            new C4C8(anonymousClass483.A02.A00, anonymousClass483.A00, anonymousClass483.A08, anonymousClass483.A01, anonymousClass483.A05, anonymousClass483.A07, anonymousClass483.A03, anonymousClass483.A04, anonymousClass483.A06).A00(str4, str, new InterfaceC53332eX() { // from class: X.3k5
                @Override // X.InterfaceC53332eX
                public final void AOF(boolean z, boolean z2, String str5, String str6, UserJid userJid, boolean z3, C28Q c28q) {
                    C4AU.this.A02(c91524Fg, indiaUpiQrCodeUrlValidationActivity, str4, z, z2, str5, str6, userJid, z3, c28q);
                }
            });
            return c91534Fh;
        }
        throw new IllegalArgumentException("Invalid viewModel");
    }
}
