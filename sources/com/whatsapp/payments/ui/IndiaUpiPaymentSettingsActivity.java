package com.whatsapp.payments.ui;

import X.AbstractActivityC92404Ke;
import X.AbstractC899949g;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass029;
import X.AnonymousClass490;
import X.AnonymousClass493;
import X.AnonymousClass499;
import X.C000200d;
import X.C000500h;
import X.C013606n;
import X.C019208x;
import X.C01B;
import X.C01C;
import X.C02160Ac;
import X.C02180Ae;
import X.C02L;
import X.C0AT;
import X.C0GZ;
import X.C0N2;
import X.C28S;
import X.C2Ly;
import X.C2MY;
import X.C2OT;
import X.C2OV;
import X.C3SP;
import X.C42031uu;
import X.C49S;
import X.C4AS;
import X.C4KQ;
import X.C72613aJ;
import X.C895947p;
import X.C899048w;
import X.C90564Bm;
import X.C92184Hw;
import X.InterfaceC40271rs;
import X.InterfaceC899849f;
import X.View$OnClickListenerC69733Po;
import X.View$OnClickListenerC69743Pp;
import X.View$OnClickListenerC69753Pq;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;
import com.whatsapp.payments.ui.widget.TransactionsExpandableView;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes3.dex */
public final class IndiaUpiPaymentSettingsActivity extends AbstractActivityC92404Ke implements C49S, InterfaceC899849f, C2OV {
    public View A00 = null;
    public C02L A01;
    public C01B A02;
    public C000500h A03;
    public C013606n A04;
    public C90564Bm A05;
    public C0GZ A06;
    public C42031uu A07;
    public C2MY A08;
    public C28S A09;
    public C2OT A0A;
    public C895947p A0B;
    public C899048w A0C;
    public C2Ly A0D;
    public AnonymousClass490 A0E;
    public AnonymousClass493 A0F;
    public AnonymousClass499 A0G;
    public PaymentBottomSheet A0H;
    public AbstractC899949g A0I;
    public boolean A0J;

    @Override // X.C4EB
    public String ABJ(C0N2 c0n2) {
        return null;
    }

    @Override // X.C49V
    public String ABM(C0N2 c0n2) {
        return null;
    }

    public final void A1V() {
        if (this.A02.A0E(C01C.A1u) && ((C4KQ) this).A0K.A04().getBoolean("payment_has_received_upi_mandate_request", false) && !this.A0J) {
            this.A0J = true;
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.recurring_payment_container);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(this).inflate(R.layout.india_upi_payment_setting_mandate_entry, viewGroup, true);
            C02180Ae.A17((ImageView) inflate.findViewById(R.id.mandate_icon), C02160Ac.A00(this, R.color.settings_icon));
            inflate.setOnClickListener(new View$OnClickListenerC69743Pp(this));
            viewGroup.setVisibility(0);
        }
    }

    public /* synthetic */ void A1W() {
        this.A0T.A00(true);
    }

    public void A1X(String str, boolean z) {
        if (z) {
            Bundle A02 = C000200d.A02("extra_payment_handle", str);
            IndiaUpiSendPaymentToVpaDialogFragment indiaUpiSendPaymentToVpaDialogFragment = new IndiaUpiSendPaymentToVpaDialogFragment();
            indiaUpiSendPaymentToVpaDialogFragment.A0P(A02);
            indiaUpiSendPaymentToVpaDialogFragment.A0F = this;
            PaymentBottomSheet paymentBottomSheet = this.A0H;
            paymentBottomSheet.A01 = indiaUpiSendPaymentToVpaDialogFragment;
            AUh(paymentBottomSheet);
            return;
        }
        AUl(0, R.string.unblock_payment_id_error_default, getString(R.string.india_upi_payment_id_name));
    }

    @Override // X.InterfaceC899549c
    public void AGy(boolean z) {
        if (z) {
            Intent intent = new Intent(this, IndiaUpiPaymentsAccountSetupActivity.class);
            intent.putExtra("extra_setup_mode", 2);
            intent.putExtra("extra_bank_account_link_completed_send_payment_default_action", 0);
            startActivity(intent);
            return;
        }
        startActivityForResult(new Intent(this, IndiaUpiPaymentBankSetupActivity.class), 1008);
    }

    @Override // X.C49S
    public void AIE() {
        PaymentBottomSheet paymentBottomSheet = this.A0H;
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A18();
        }
    }

    @Override // X.C2OV
    public void AJB(String str) {
        TransactionsExpandableView transactionsExpandableView = this.A0W;
        transactionsExpandableView.post(new C3SP(transactionsExpandableView));
        TransactionsExpandableView transactionsExpandableView2 = this.A0V;
        transactionsExpandableView2.post(new C3SP(transactionsExpandableView2));
    }

    @Override // X.InterfaceC899549c
    public void AMp(C0N2 c0n2) {
        Intent intent = new Intent(this, IndiaUpiBankAccountDetailsActivity.class);
        intent.putExtra("extra_bank_account", c0n2);
        startActivityForResult(intent, 1009);
    }

    @Override // X.C49S
    public void AQR(UserJid userJid, final String str) {
        PaymentBottomSheet paymentBottomSheet = this.A0H;
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A18();
        }
        this.A0A.A01(this, userJid, str, false, false, new InterfaceC40271rs() { // from class: X.3j6
            {
                IndiaUpiPaymentSettingsActivity.this = this;
            }

            @Override // X.InterfaceC40271rs
            public final void AOE(boolean z) {
                IndiaUpiPaymentSettingsActivity.this.A1X(str, z);
            }
        });
    }

    @Override // X.C49S
    public void AQS(String str, String str2, String str3) {
        PaymentBottomSheet paymentBottomSheet = this.A0H;
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A18();
        }
        Intent A01 = this.A08.A01(this, false, true);
        A01.putExtra("extra_payment_handle", str);
        A01.putExtra("extra_payment_handle_id", str2);
        A01.putExtra("extra_payee_name", str3);
        startActivity(A01);
    }

    @Override // X.InterfaceC899849f
    public void ASf(boolean z) {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.action_required_container);
        if (this.A00 == null) {
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(this).inflate(R.layout.india_upi_payment_settings_action_required_row, viewGroup, true);
            this.A00 = inflate;
            inflate.setOnClickListener(new View$OnClickListenerC69753Pq(this));
        }
        viewGroup.setVisibility(z ? 0 : 8);
    }

    @Override // X.C4KQ, X.InterfaceC899649d
    public void AVp(List list) {
        super.AVp(list);
        if (!this.A06.A09()) {
            ((C4KQ) this).A08.removeAllViews();
            ((C4KQ) this).A08.setVisibility(8);
            ((C4KQ) this).A05.setVisibility(8);
        } else if (((C4KQ) this).A08.getChildCount() == 0) {
            String A1P = A1P();
            final String A05 = this.A05.A05();
            if (TextUtils.isEmpty(A1P)) {
                A1P = this.A03.A00.getString("push_name", "");
                ((C4KQ) this).A0M.A05(1, null);
            }
            C92184Hw c92184Hw = new C92184Hw(this);
            c92184Hw.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            c92184Hw.setIconTint(C02160Ac.A00(this, R.color.settings_icon));
            C02L c02l = this.A01;
            c02l.A05();
            c92184Hw.A03.A02(c02l.A01, c92184Hw.A00);
            c92184Hw.A02.setText(A1P);
            c92184Hw.A01.setText(A05);
            c92184Hw.setBackgroundColor(getResources().getColor(R.color.primary_surface));
            c92184Hw.setOnClickListener(new View$OnClickListenerC69733Po(this));
            c92184Hw.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.3Pm
                {
                    IndiaUpiPaymentSettingsActivity.this = this;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    IndiaUpiPaymentSettingsActivity indiaUpiPaymentSettingsActivity = IndiaUpiPaymentSettingsActivity.this;
                    String str = A05;
                    ClipboardManager A06 = ((ActivityC02290Ap) indiaUpiPaymentSettingsActivity).A0E.A06();
                    if (A06 != null) {
                        A06.setPrimaryClip(ClipData.newPlainText(str, str));
                        ((ActivityC02290Ap) indiaUpiPaymentSettingsActivity).A0A.A0E(indiaUpiPaymentSettingsActivity.getString(R.string.vpa_copied_to_clipboard), 1);
                    }
                    return true;
                }
            });
            ((C4KQ) this).A08.addView(c92184Hw);
            ((C4KQ) this).A08.setVisibility(0);
            ((C4KQ) this).A05.setVisibility(0);
        }
        A1S();
    }

    @Override // X.C4KQ, X.InterfaceC900049h
    public void AVs(List list) {
        this.A0D.A06(list);
        super.AVs(list);
        A1S();
    }

    @Override // X.C4KQ, X.InterfaceC900049h
    public void AVu(List list) {
        A1V();
        this.A0I.A04("UPI");
        this.A0D.A06(list);
        super.AVu(list);
        A1S();
    }

    public /* synthetic */ void lambda$maybeAddMandateSection$170$IndiaUpiPaymentSettingsActivity(View view) {
        startActivity(new Intent(this, IndiaUpiMandateHistoryActivity.class));
    }

    public /* synthetic */ void lambda$setActionRequiredRowVisibility$173$IndiaUpiPaymentSettingsActivity(View view) {
        this.A0I.A02();
    }

    public void lambda$updateProfileHeader$171$IndiaUpiPaymentSettingsActivity(View view) {
        Intent intent = new Intent(this, IndiaUpiSecureQrCodeDisplayActivity.class);
        String A1P = A1P();
        if (!TextUtils.isEmpty(A1P)) {
            intent.putExtra("extra_account_holder_name", A1P);
        }
        startActivity(intent);
    }

    @Override // X.C4KQ, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1008) {
            this.A0T.A00(false);
        } else if (i != 1009) {
            if (i == 1014 && i2 == -1) {
                this.A0I.A01();
            }
        } else if (i2 == -1 && intent != null && intent.getIntExtra("extra_remove_payment_account", 0) >= 1) {
            if (intent.getIntExtra("extra_remove_payment_account", 0) != 2) {
                finish();
                return;
            }
            Intent intent2 = new Intent(this, IndiaUpiPaymentsAccountSetupActivity.class);
            intent2.putExtra("extra_setup_mode", 2);
            startActivity(intent2);
        } else {
            this.A0T.A00(false);
        }
    }

    @Override // X.AbstractActivityC92404Ke, X.C4KQ, X.C4KA, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new C4AS(this.A06).A00(this);
        if (getIntent() != null && getIntent().getExtras() != null && getIntent().getExtras().getBoolean("extra_send_to_upi_id", false)) {
            this.A0H = new PaymentBottomSheet();
            IndiaUpiSendPaymentToVpaDialogFragment indiaUpiSendPaymentToVpaDialogFragment = new IndiaUpiSendPaymentToVpaDialogFragment();
            indiaUpiSendPaymentToVpaDialogFragment.A0F = this;
            PaymentBottomSheet paymentBottomSheet = this.A0H;
            paymentBottomSheet.A01 = indiaUpiSendPaymentToVpaDialogFragment;
            AUh(paymentBottomSheet);
        }
        A1V();
        if (this.A02.A0E(C01C.A1x)) {
            C02180Ae.A17((ImageView) findViewById(R.id.privacy_banner_avatar), C02160Ac.A00(this, R.color.payment_privacy_avatar_tint));
            AnonymousClass029.A16(this, ((ActivityC02290Ap) this).A0A, ((ActivityC02270An) this).A00, ((ActivityC02290Ap) this).A0E, (TextEmojiLabel) C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.payment_privacy_banner_text), getString(R.string.upi_payments_privacy_banner_text, "learn-more"), new C72613aJ(Uri.parse("https://faq.whatsapp.com/general/payments/about-payments-data")));
            findViewById(R.id.payment_privacy_banner).setVisibility(0);
        }
        AbstractC899949g abstractC899949g = new AbstractC899949g(((ActivityC02270An) this).A08, ((ActivityC02290Ap) this).A0A, this.A01, this.A0B, ((ActivityC02310Ar) this).A01, ((C4KQ) this).A0K, ((ActivityC02290Ap) this).A0D, this.A0G, ((C4KQ) this).A0M, this.A09, this.A0F, this.A0C, this.A07, this) { // from class: X.4Ds
        };
        this.A0I = abstractC899949g;
        abstractC899949g.A05(getIntent().getStringExtra("notification-type"), "UPI", 1014);
        Resources resources = getResources();
        WaImageView waImageView = new WaImageView(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 16, resources.getDisplayMetrics()));
        layoutParams.gravity = 17;
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        layoutParams.topMargin = applyDimension;
        layoutParams.bottomMargin = applyDimension;
        waImageView.setLayoutParams(layoutParams);
        waImageView.setImageDrawable(resources.getDrawable(R.drawable.bhim_upi_logo));
        FrameLayout frameLayout = ((C4KQ) this).A07;
        if (frameLayout == null) {
            frameLayout = (FrameLayout) findViewById(R.id.custom_footer_container);
            ((C4KQ) this).A07 = frameLayout;
        }
        if (frameLayout.getChildCount() > 0) {
            ((C4KQ) this).A07.removeAllViews();
        }
        ((C4KQ) this).A07.addView(waImageView);
        ((C4KQ) this).A07.setVisibility(0);
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i == 100) {
            C019208x c019208x = new C019208x(this);
            c019208x.A02(R.string.payments_request_status_requested_expired);
            c019208x.A01.A0J = false;
            c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3Pn
                {
                    IndiaUpiPaymentSettingsActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    IndiaUpiPaymentSettingsActivity.this.A1W();
                }
            });
            c019208x.A03(R.string.payments_request_status_request_expired);
            return c019208x.A00();
        }
        return super.onCreateDialog(i);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A05.A05() != null) {
            menu.add(0, R.id.menuitem_scan_qr, 0, getString(R.string.menuitem_scan_qr));
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.C4KQ, X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_scan_qr) {
            startActivity(new Intent(this, IndiaUpiQrCodeScanActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // X.C4KQ, X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        this.A0I.A04("UPI");
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        C2Ly c2Ly = this.A0D;
        c2Ly.A00.clear();
        c2Ly.A02.add(new WeakReference(this));
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        super.onStop();
        this.A0D.A04(this);
    }
}
