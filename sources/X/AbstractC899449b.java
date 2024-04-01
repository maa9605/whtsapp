package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.search.verification.client.R;

/* renamed from: X.49b */
/* loaded from: classes3.dex */
public abstract class AbstractC899449b {
    public C018508q A00;
    public C0E7 A01;
    public C0C9 A02;
    public C28S A03;
    public C0EU A04;
    public C463026g A05;
    public C47302Ar A06;
    public C0DV A07;
    public C49682Lx A08;
    public InterfaceC002901k A09;

    public AbstractC899449b(C018508q c018508q, InterfaceC002901k interfaceC002901k, C49682Lx c49682Lx, C0DV c0dv, C0C9 c0c9, C0EU c0eu, C0E7 c0e7, C463026g c463026g, C47302Ar c47302Ar, C28S c28s) {
        this.A00 = c018508q;
        this.A09 = interfaceC002901k;
        this.A08 = c49682Lx;
        this.A07 = c0dv;
        this.A02 = c0c9;
        this.A04 = c0eu;
        this.A01 = c0e7;
        this.A05 = c463026g;
        this.A06 = c47302Ar;
        this.A03 = c28s;
    }

    public final AlertDialog A00(final ActivityC02270An activityC02270An, int i, final int i2) {
        Context applicationContext = activityC02270An.getApplicationContext();
        return new AlertDialog.Builder(activityC02270An).setMessage(applicationContext.getString(i)).setCancelable(true).setNegativeButton(applicationContext.getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: X.3RJ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                C002701i.A18(activityC02270An, i2);
            }
        }).setPositiveButton(applicationContext.getString(R.string.close_payment_account_dialog_confirm_label), new DialogInterface.OnClickListener() { // from class: X.3RI
            {
                AbstractC899449b.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                AbstractC899449b.this.A02(activityC02270An, i2);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: X.3RH
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C002701i.A18(activityC02270An, i2);
            }
        }).create();
    }

    public Dialog A01(final ActivityC02270An activityC02270An, int i) {
        Context applicationContext = activityC02270An.getApplicationContext();
        switch (i) {
            case C42311vX.A0A /* 100 */:
                return new AlertDialog.Builder(activityC02270An).setMessage(applicationContext.getString(R.string.payment_account_is_removed)).setPositiveButton(applicationContext.getString(R.string.ok), new DialogInterface.OnClickListener() { // from class: X.3RG
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        activityC02270An.finish();
                    }
                }).create();
            case 101:
                return A00(activityC02270An, R.string.delete_payment_accounts_dialog_title, i);
            case 102:
                return A00(activityC02270An, R.string.reset_pin_delete_payment_accounts_dialog_title, i);
            default:
                return null;
        }
    }

    public /* synthetic */ void A02(final ActivityC02270An activityC02270An, int i) {
        C002701i.A18(activityC02270An, i);
        final C4EU c4eu = (C4EU) this;
        activityC02270An.A12(R.string.register_wait_message);
        new C48I(activityC02270An, ((AbstractC899449b) c4eu).A00, c4eu.A09, c4eu.A08, c4eu.A07, c4eu.A02, c4eu.A04, ((AbstractC899449b) c4eu).A01, c4eu.A05, c4eu.A06, c4eu.A03) { // from class: X.4Bv
        }.A00(new InterfaceC03640Gm() { // from class: X.4ET
            @Override // X.InterfaceC03640Gm
            public void ANw(C28Q c28q) {
                C4EU c4eu2 = c4eu;
                C014406v c014406v = c4eu2.A01;
                StringBuilder sb = new StringBuilder("onClosePaymentAccountConfirmed/onRequestError. paymentNetworkError: ");
                sb.append(c28q);
                c014406v.A03(sb.toString());
                c4eu2.A00.A01(activityC02270An, c28q.A00, R.string.payment_account_cannot_be_removed).show();
            }

            @Override // X.InterfaceC03640Gm
            public void AO1(C28Q c28q) {
                C4EU c4eu2 = c4eu;
                C014406v c014406v = c4eu2.A01;
                StringBuilder sb = new StringBuilder("onClosePaymentAccountConfirmed/onResponseError. paymentNetworkError: ");
                sb.append(c28q);
                c014406v.A07(null, sb.toString(), null);
                ActivityC02270An activityC02270An2 = activityC02270An;
                activityC02270An2.ARS();
                c4eu2.A00.A01(activityC02270An2, c28q.A00, R.string.payment_account_cannot_be_removed).show();
            }

            @Override // X.InterfaceC03640Gm
            public void AO2(C468228k c468228k) {
                C4EU c4eu2 = c4eu;
                c4eu2.A01.A07(null, "onClosePaymentAccountConfirmed/onResponseSuccess", null);
                ActivityC02270An activityC02270An2 = activityC02270An;
                activityC02270An2.ARS();
                C000200d.A0l(c4eu2.A04, "payment_brazil_nux_dismissed", true);
                C002701i.A19(activityC02270An2, 100);
            }
        });
    }
}
