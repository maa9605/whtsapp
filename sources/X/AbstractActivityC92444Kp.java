package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiBankAccountLinkingRetryActivity;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import com.whatsapp.payments.ui.IndiaUpiBankPickerActivity;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentBankSetupActivity;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Kp */
/* loaded from: classes3.dex */
public abstract class AbstractActivityC92444Kp extends AbstractActivityC92384Kc {
    public int A00;
    public int A02;
    public C0N6 A03;
    public AnonymousClass011 A04;
    public C2MB A05;
    public InterfaceC002901k A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public final C014406v A0H = C014406v.A00("IndiaUpiBasePaymentsActivity", "payment", "IN");
    public int A01 = 0;

    @Override // X.ActivityC02290Ap
    public void A10(int i) {
        A1W();
        finish();
    }

    public String A1U(String str) {
        C02L c02l = ((C4KG) this).A02;
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid != null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                long A05 = ((C4KG) this).A05.A05();
                byte[] bArr = new byte[8];
                for (int i = 7; i >= 0; i--) {
                    bArr[i] = (byte) A05;
                    A05 >>= 8;
                }
                messageDigest.update(bArr);
                messageDigest.update(userJid.getRawString().getBytes());
                byte[] bArr2 = new byte[16];
                new SecureRandom().nextBytes(bArr2);
                messageDigest.update(bArr2);
                byte[] bArr3 = new byte[15];
                System.arraycopy(messageDigest.digest(), 0, bArr3, 0, 15);
                return A1V(str, C02A.A03(bArr3));
            } catch (NoSuchAlgorithmException e) {
                this.A0H.A06("payment", "generateUuid unable to hash due to missing sha256 algorithm", e);
                return null;
            }
        }
        throw null;
    }

    public String A1V(String str, String str2) {
        int length = str.length();
        if (length <= 8) {
            String A0H = C000200d.A0H(str, str2);
            return A0H.length() > 35 ? A0H.substring(0, 35) : A0H;
        }
        C014406v c014406v = this.A0H;
        StringBuilder A0P = C000200d.A0P("prefixAndTruncate called with too long a prefix: ");
        A0P.append(length);
        throw new IllegalArgumentException(c014406v.A02(c014406v.A02, A0P.toString()).toString());
    }

    public void A1W() {
        if (this instanceof AbstractActivityC92484Li) {
            AbstractActivityC92484Li abstractActivityC92484Li = (AbstractActivityC92484Li) this;
            abstractActivityC92484Li.A04.A04.A01();
            C014406v c014406v = abstractActivityC92484Li.A0N;
            StringBuilder A0P = C000200d.A0P("clearStates: ");
            A0P.append(abstractActivityC92484Li.A04.A04);
            c014406v.A07(null, A0P.toString(), null);
            abstractActivityC92484Li.A04.A08();
        } else if (this instanceof IndiaUpiPaymentBankSetupActivity) {
            IndiaUpiPaymentBankSetupActivity indiaUpiPaymentBankSetupActivity = (IndiaUpiPaymentBankSetupActivity) this;
            indiaUpiPaymentBankSetupActivity.A05.A01();
            C014406v c014406v2 = indiaUpiPaymentBankSetupActivity.A09;
            StringBuilder A0P2 = C000200d.A0P("clearStates: ");
            A0P2.append(indiaUpiPaymentBankSetupActivity.A05);
            c014406v2.A07(null, A0P2.toString(), null);
            indiaUpiPaymentBankSetupActivity.A01.A08();
        } else if (this instanceof IndiaUpiDeviceBindActivity) {
            IndiaUpiDeviceBindActivity indiaUpiDeviceBindActivity = (IndiaUpiDeviceBindActivity) this;
            C3NV c3nv = indiaUpiDeviceBindActivity.A0K;
            if (c3nv != null) {
                c3nv.A01();
                C014406v c014406v3 = indiaUpiDeviceBindActivity.A0c;
                StringBuilder A0P3 = C000200d.A0P("clearStates: ");
                A0P3.append(indiaUpiDeviceBindActivity.A0K);
                c014406v3.A07(null, A0P3.toString(), null);
            }
            indiaUpiDeviceBindActivity.A0G.A08();
        } else if (this instanceof IndiaUpiBankPickerActivity) {
            IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = (IndiaUpiBankPickerActivity) this;
            C3NV c3nv2 = indiaUpiBankPickerActivity.A04;
            if (c3nv2 != null) {
                c3nv2.A01();
                C014406v c014406v4 = indiaUpiBankPickerActivity.A0H;
                StringBuilder A0P4 = C000200d.A0P("clearStates: ");
                A0P4.append(indiaUpiBankPickerActivity.A04.toString());
                c014406v4.A07(null, A0P4.toString(), null);
            }
            indiaUpiBankPickerActivity.A03.A08();
        } else if (!(this instanceof IndiaUpiBankAccountPickerActivity)) {
            if (this instanceof IndiaUpiBankAccountLinkingRetryActivity) {
                ((IndiaUpiBankAccountLinkingRetryActivity) this).A00.A08();
            }
        } else {
            IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = (IndiaUpiBankAccountPickerActivity) this;
            indiaUpiBankAccountPickerActivity.A0A.A01();
            C014406v c014406v5 = indiaUpiBankAccountPickerActivity.A0O;
            StringBuilder A0P5 = C000200d.A0P("clearStates: ");
            A0P5.append(indiaUpiBankAccountPickerActivity.A0A.toString());
            c014406v5.A07(null, A0P5.toString(), null);
            indiaUpiBankAccountPickerActivity.A06.A08();
        }
    }

    public void A1X() {
        if (!(this instanceof IndiaUpiBankAccountPickerActivity)) {
            View findViewById = findViewById(R.id.progress);
            if (findViewById != null) {
                findViewById.setVisibility(8);
                return;
            }
            return;
        }
        View view = ((IndiaUpiBankAccountPickerActivity) this).A00;
        if (view != null) {
            view.findViewById(R.id.progress).setVisibility(8);
        }
    }

    public void A1Y() {
        if (!(this instanceof IndiaUpiBankAccountPickerActivity)) {
            View findViewById = findViewById(R.id.progress);
            if (findViewById != null) {
                findViewById.setVisibility(0);
                return;
            }
            return;
        }
        View view = ((IndiaUpiBankAccountPickerActivity) this).A00;
        if (view != null) {
            view.findViewById(R.id.progress).setVisibility(0);
        }
    }

    public void A1Z(Intent intent) {
        intent.putExtra("extra_conversation_message_type", ((C4KG) this).A00);
        intent.putExtra("extra_jid", C003101m.A07(((C4KG) this).A08));
        intent.putExtra("extra_receiver_jid", C003101m.A07(((C4KG) this).A0A));
        intent.putExtra("extra_quoted_msg_row_id", ((C4KG) this).A01);
        intent.putExtra("extra_payment_preset_amount", ((C4KG) this).A0M);
        intent.putExtra("extra_transaction_id", this.A0P);
        intent.putExtra("extra_payment_preset_min_amount", ((C4KG) this).A0N);
        intent.putExtra("extra_request_message_key", ((C4KG) this).A0O);
        intent.putExtra("extra_is_pay_money_only", this.A0R);
        intent.putExtra("extra_payment_note", ((C4KG) this).A0L);
        List list = this.A0Q;
        if (list != null) {
            intent.putStringArrayListExtra("extra_mentioned_jids", new ArrayList<>(C003101m.A0E(list)));
        }
        intent.putExtra("extra_inviter_jid", C003101m.A07(((C4KG) this).A09));
        intent.putExtra("extra_in_setup", this.A0G);
        intent.putExtra("extra_setup_mode", this.A02);
        intent.putExtra("extra_bank_account_link_completed_send_payment_default_action", this.A00);
        intent.putExtra("extra_payment_handle", this.A0E);
        intent.putExtra("extra_payment_handle_id", this.A0F);
        intent.putExtra("extra_merchant_code", this.A09);
        intent.putExtra("extra_transaction_ref", this.A0D);
        intent.putExtra("extra_payee_name", this.A0A);
        intent.putExtra("extra_transaction_ref_url", this.A0C);
        intent.putExtra("extra_purpose_code", this.A0B);
        intent.putExtra("extra_initiation_mode", this.A08);
        intent.putExtra("extra_incoming_pay_request_id", this.A07);
        intent.putExtra("extra_payment_bank_account_added_in_onboarding", this.A03);
        intent.putExtra("extra_onboarding_type", this.A01);
    }

    @Override // X.C4KG, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1000) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        A1W();
        finish();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        C014406v c014406v = this.A0H;
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" onBackPressed");
        c014406v.A07(null, sb.toString(), null);
        A1W();
        finish();
        super.onBackPressed();
    }

    @Override // X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C014406v c014406v = this.A0H;
        StringBuilder sb = new StringBuilder("onCreate");
        sb.append(this);
        c014406v.A07(null, sb.toString(), null);
        if (getIntent() != null) {
            this.A0G = getIntent().getBooleanExtra("extra_in_setup", false);
            this.A02 = getIntent().getIntExtra("extra_setup_mode", 1);
            this.A00 = getIntent().getIntExtra("extra_bank_account_link_completed_send_payment_default_action", 2);
            this.A0E = getIntent().getStringExtra("extra_payment_handle");
            this.A0F = getIntent().getStringExtra("extra_payment_handle_id");
            this.A09 = getIntent().getStringExtra("extra_merchant_code");
            this.A0D = getIntent().getStringExtra("extra_transaction_ref");
            this.A0A = getIntent().getStringExtra("extra_payee_name");
            this.A0C = getIntent().getStringExtra("extra_transaction_ref_url");
            this.A0B = getIntent().getStringExtra("extra_purpose_code");
            this.A08 = getIntent().getStringExtra("extra_initiation_mode");
            this.A07 = getIntent().getStringExtra("extra_incoming_pay_request_id");
            this.A03 = (C0N6) getIntent().getParcelableExtra("extra_payment_bank_account_added_in_onboarding");
            this.A01 = getIntent().getIntExtra("extra_onboarding_type", 0);
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        C014406v c014406v = this.A0H;
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" action bar home");
        c014406v.A07(null, sb.toString(), null);
        A1W();
        finish();
        return true;
    }
}
