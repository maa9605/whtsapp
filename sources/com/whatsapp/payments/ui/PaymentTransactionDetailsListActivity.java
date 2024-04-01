package com.whatsapp.payments.ui;

import X.AbstractActivityC92434Kj;
import X.AbstractC005302j;
import X.AbstractC04890Mh;
import X.AbstractC91264Eg;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass092;
import X.AnonymousClass093;
import X.AnonymousClass094;
import X.C000700j;
import X.C002301c;
import X.C003101m;
import X.C013406l;
import X.C014406v;
import X.C018308n;
import X.C018508q;
import X.C018808t;
import X.C02980Dr;
import X.C06C;
import X.C0DB;
import X.C0DV;
import X.C0DW;
import X.C0EX;
import X.C0GR;
import X.C0L5;
import X.C0L7;
import X.C0LD;
import X.C0N0;
import X.C0N2;
import X.C0TS;
import X.C0U1;
import X.C2MY;
import X.C2OT;
import X.C2OU;
import X.C4E4;
import X.C4FI;
import X.C4HR;
import X.C4HS;
import X.C4HW;
import X.C4HX;
import X.C4HY;
import X.C4HZ;
import X.C4KM;
import X.C77393i8;
import X.C901649x;
import X.C901749y;
import X.C901849z;
import X.C91974Ha;
import X.C91984Hb;
import X.InterfaceC002901k;
import X.InterfaceC28001Pq;
import X.InterfaceC40271rs;
import X.InterfaceC55152jx;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.WaInAppBrowsingActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class PaymentTransactionDetailsListActivity extends AbstractActivityC92434Kj {
    public C018508q A00;
    public C0L7 A01;
    public C0L5 A02;
    public C013406l A03;
    public C018808t A04;
    public C02980Dr A05;
    public C2MY A06;
    public C2OU A07;
    public C2OT A08;
    public C0GR A09;
    public C0DW A0A;
    public C0DV A0B;
    public C4FI A0C;
    public C901749y A0D;
    public InterfaceC002901k A0E;
    public final C014406v A0F = C014406v.A00("PaymentTransactionDetailsListActivity", "payment-settings", "COMMON");

    @Override // X.C4KM
    public C0TS A1P(ViewGroup viewGroup, int i) {
        switch (i) {
            case 200:
                return new C4HS(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_details_amount_view, viewGroup, false));
            case 201:
                return new C4HW(this.A07, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_details_action_button_view, viewGroup, false));
            case 202:
                return new C91974Ha(((ActivityC02290Ap) this).A0E, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_details_status_view, viewGroup, false));
            case 203:
                return new C4HY(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_details_payee_payer_detail_view, viewGroup, false), this.A02, this.A01);
            case 204:
                return new C4HX(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_details_help_view, viewGroup, false));
            case 205:
                return new C4HR(this.A00, this.A05, ((ActivityC02270An) this).A01, ((ActivityC02290Ap) this).A0E, ((ActivityC02290Ap) this).A0F, this.A0B, this.A0A, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_details_note_row, viewGroup, false));
            case 206:
                return new C91984Hb(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_details_row, viewGroup, false));
            case 207:
                return new AbstractC91264Eg(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_detail_item_row_divider, viewGroup, false)) { // from class: X.4HM
                };
            case 208:
                return new C4HZ(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_send_again_view, viewGroup, false));
            default:
                return super.A1P(viewGroup, i);
        }
    }

    public void A1Q(final C901649x c901649x) {
        switch (c901649x.A00) {
            case 0:
                int i = c901649x.A01.getInt("action_bar_title_res_id");
                C0U1 A0c = A0c();
                if (A0c == null) {
                    return;
                }
                A0c.A0L(true);
                A0c.A08(i);
                return;
            case 1:
                if (c901649x.A0D) {
                    A12(R.string.payments_loading);
                    return;
                } else {
                    ARS();
                    return;
                }
            case 2:
                finish();
                return;
            case 3:
                invalidateOptionsMenu();
                return;
            case 4:
                C06C c06c = c901649x.A02;
                if (c06c != null) {
                    ContactInfoActivity.A03(c06c, this, null);
                    return;
                }
                throw null;
            case 5:
                Intent intent = new Intent(this, this.A0B.A03().ACE());
                intent.putExtra("extra_payment_handle", c901649x.A0A);
                intent.putExtra("extra_payment_handle_id", c901649x.A09);
                intent.putExtra("extra_payee_name", c901649x.A08);
                A14(intent);
                return;
            case 6:
                AUl(0, R.string.payment_id_cannot_verify_error_text_default, getString(this.A0B.A03().AC8()));
                return;
            case 7:
                Intent intent2 = new Intent(this, c901649x.A06);
                C0N2 c0n2 = c901649x.A03;
                if (c0n2 != null) {
                    intent2.putExtra("extra_bank_account", c0n2);
                    intent2.putExtra("extra_set_pin_education_type", 2);
                    startActivity(intent2);
                    return;
                }
                throw null;
            case 8:
                A1D(c901649x.A0B, c901649x.A07);
                return;
            case 9:
                Intent intent3 = new Intent(this, this.A0B.A03().A8G());
                C0N2 c0n22 = c901649x.A03;
                if (c0n22 != null) {
                    intent3.putExtra("extra_bank_account", c0n22);
                    startActivity(intent3);
                    return;
                }
                throw null;
            case 10:
                AnonymousClass093 anonymousClass093 = c901649x.A04;
                if (anonymousClass093 != null) {
                    C0N2 c0n23 = c901649x.A03;
                    String str = anonymousClass093.A0O() ? "payments:request" : "payments:transaction";
                    try {
                        JSONObject put = new JSONObject().put("lg", ((ActivityC02310Ar) this).A01.A04()).put("lc", ((ActivityC02310Ar) this).A01.A03()).put("platform", "android").put("context", str).put("type", "p2p");
                        String str2 = anonymousClass093.A0H;
                        if (str2 != null) {
                            put.put("error_code", str2);
                        }
                        if (c0n23 != null && !TextUtils.isEmpty(c0n23.A08)) {
                            put.put("bank_name", c0n23.A08);
                        }
                        new JSONObject().put("debug_info", put).toString();
                    } catch (Exception e) {
                        this.A0F.A08("debugInfoData fields", e);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("com.whatsapp.support.DescribeProblemActivity.paymentFBTxnId", anonymousClass093.A0I);
                    String str3 = anonymousClass093.A0D;
                    if (str3 != null) {
                        bundle.putString("com.whatsapp.support.DescribeProblemActivity.paymentBankTxnId", str3);
                    }
                    if (c0n23 != null) {
                        bundle.putParcelable("com.whatsapp.support.DescribeProblemActivity.paymentMethod", c0n23);
                        C0N0 c0n0 = c0n23.A06;
                        if (c0n0 != null) {
                            bundle.putString("com.whatsapp.support.DescribeProblemActivity.paymentBankPhone", c0n0.A07());
                        } else {
                            this.A0F.A04("payment method missing country fields");
                        }
                    }
                    String str4 = anonymousClass093.A0H;
                    if (str4 != null) {
                        bundle.putString("com.whatsapp.support.DescribeProblemActivity.paymentErrorCode", str4);
                    }
                    if (anonymousClass093.A01 == 409) {
                        bundle.putInt("com.whatsapp.support.DescribeProblemActivity.type", 2);
                        bundle.putString("com.whatsapp.support.DescribeProblemActivity.paymentStatus", "RF");
                    }
                    InterfaceC55152jx AC5 = this.A0B.A03().AC5();
                    if (AC5 != null && AC5.AEY()) {
                        bundle.putString("com.whatsapp.support.DescribeProblemActivity.uri", A0s().toString());
                    }
                    bundle.putString("com.whatsapp.support.DescribeProblemActivity.from", str);
                    this.A0E.ARy(new C77393i8(this, ((ActivityC02290Ap) this).A0B, ((ActivityC02310Ar) this).A01, this.A04, this.A0J, this.A09, str, c0n23, anonymousClass093, bundle), new Void[0]);
                    return;
                }
                throw null;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                Intent intent4 = new Intent(getApplicationContext(), WaInAppBrowsingActivity.class);
                String str5 = c901649x.A0C;
                if (str5 != null) {
                    intent4.putExtra("webview_url", str5);
                    intent4.putExtra("webview_javascript_enabled", true);
                    startActivity(intent4);
                    return;
                }
                throw null;
            case 12:
                C901849z c901849z = this.A0C.A03;
                AnonymousClass092 anonymousClass092 = c901849z != null ? c901849z.A02 : null;
                Intent A01 = this.A06.A01(this, true, false);
                A01.putExtra("extra_payment_preset_amount", this.A09.A01().A7z(((ActivityC02310Ar) this).A01, anonymousClass092.A0F.A07));
                AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
                if (abstractC005302j instanceof GroupJid) {
                    A01.putExtra("extra_jid", abstractC005302j.getRawString());
                    A01.putExtra("extra_receiver_jid", C003101m.A07(anonymousClass092.A0F.A0B));
                } else {
                    A01.putExtra("extra_jid", C003101m.A07(anonymousClass092.A0F.A0B));
                }
                A01.putExtra("extra_payment_note", anonymousClass092.A0G());
                A01.putExtra("extra_conversation_message_type", 1);
                if (anonymousClass092.A12()) {
                    List list = anonymousClass092.A0c;
                    if (list != null) {
                        A01.putStringArrayListExtra("extra_mentioned_jids", new ArrayList<>(C003101m.A0E(list)));
                    } else {
                        throw null;
                    }
                }
                startActivity(A01);
                finish();
                return;
            case 13:
                this.A08.A01(this, c901649x.A05, c901649x.A0A, false, false, new InterfaceC40271rs() { // from class: X.3jc
                    {
                        PaymentTransactionDetailsListActivity.this = this;
                    }

                    @Override // X.InterfaceC40271rs
                    public final void AOE(boolean z) {
                        PaymentTransactionDetailsListActivity.this.A1R(c901649x, z);
                    }
                });
                return;
            default:
                return;
        }
    }

    public void A1R(C901649x c901649x, boolean z) {
        C4FI c4fi = this.A0C;
        String str = c901649x.A0A;
        if (c4fi != null) {
            C901649x c901649x2 = new C901649x(8);
            C002301c c002301c = c4fi.A0I;
            int i = R.string.unblock_payment_id_error_default;
            if (z) {
                i = R.string.unblock_confirmation;
            }
            c901649x2.A07 = c002301c.A0D(i, str);
            c4fi.A05.A0B(c901649x2);
            return;
        }
        throw null;
    }

    public void A1S(List list) {
        C4E4 c4e4 = ((C4KM) this).A03;
        c4e4.A00 = list;
        ((AbstractC04890Mh) c4e4).A01.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0031, code lost:
        if (getIntent().getExtras() != null) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [X.4FI] */
    /* JADX WARN: Type inference failed for: r0v46, types: [X.4FI] */
    @Override // X.AbstractActivityC92434Kj, X.C4KM, X.C4K6, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(final android.os.Bundle r5) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        C901849z c901849z = this.A0C.A03;
        if (c901849z != null && c901849z.A02 != null) {
            menu.add(0, R.id.menuitem_view_in_chat, 0, R.string.payment_view_in_chat);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        C0EX c0ex;
        InterfaceC28001Pq interfaceC28001Pq;
        super.onDestroy();
        C4FI c4fi = this.A0C;
        if (c4fi == null || (c0ex = c4fi.A0O) == null || (interfaceC28001Pq = c4fi.A01) == null) {
            return;
        }
        c0ex.A00(interfaceC28001Pq);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C901849z c901849z = this.A0C.A03;
        AnonymousClass092 anonymousClass092 = c901849z != null ? c901849z.A02 : null;
        if (menuItem.getItemId() == 16908332) {
            finish();
            if (isTaskRoot()) {
                Intent intent = new Intent(this, PaymentTransactionHistoryActivity.class);
                intent.putExtra("extra_show_requests", this.A0C.A06);
                if (Build.VERSION.SDK_INT >= 21) {
                    finishAndRemoveTask();
                    startActivity(intent);
                } else {
                    startActivity(intent);
                    return true;
                }
            }
            return true;
        }
        if (anonymousClass092 != null) {
            if (menuItem.getItemId() == R.id.menuitem_view_in_chat) {
                long A02 = C0DB.A02(anonymousClass092);
                C018308n c018308n = ((ActivityC02270An) this).A00;
                AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                c018308n.A07(this, C0LD.A00(Conversation.A02(this, anonymousClass094.A00).putExtra("row_id", A02), anonymousClass094));
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_debug) {
                C000700j.A07(this.A0A.A02());
                Intent intent2 = new Intent();
                String AC1 = this.A0B.A03().AC1();
                if (TextUtils.isEmpty(AC1)) {
                    return false;
                }
                intent2.setClassName(this, AC1);
                intent2.putExtra("extra_transaction_id", anonymousClass092.A0b);
                AnonymousClass094 anonymousClass0942 = anonymousClass092.A0n;
                if (anonymousClass0942 != null) {
                    C0LD.A00(intent2, anonymousClass0942);
                }
                startActivity(intent2);
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
