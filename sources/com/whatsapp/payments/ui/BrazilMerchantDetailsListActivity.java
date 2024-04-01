package com.whatsapp.payments.ui;

import X.AbstractActivityC92464Ky;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.C000200d;
import X.C018808t;
import X.C0DW;
import X.C0GR;
import X.C0TS;
import X.C4HF;
import X.C77393i8;
import X.C900549m;
import X.C900649n;
import X.C901349u;
import X.C90454Bb;
import X.C92044Hh;
import X.InterfaceC002901k;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

/* loaded from: classes3.dex */
public class BrazilMerchantDetailsListActivity extends AbstractActivityC92464Ky {
    public C018808t A00;
    public C90454Bb A01 = null;
    public C0GR A02;
    public C0DW A03;
    public C77393i8 A04;
    public C92044Hh A05;
    public C900649n A06;
    public InterfaceC002901k A07;

    @Override // X.ActivityC02290Ap
    public void A10(int i) {
        if (i == R.string.seller_account_is_removed) {
            finish();
        } else {
            super.A10(i);
        }
    }

    @Override // X.C4Kt, X.C4KM
    public C0TS A1P(ViewGroup viewGroup, int i) {
        if (i != 302) {
            return super.A1P(viewGroup, i);
        }
        return new C4HF(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.merchant_payout_detail_row_item_view, viewGroup, false));
    }

    public final void A1T(C900549m c900549m) {
        switch (c900549m.A01) {
            case 0:
                startActivity(new Intent(getApplicationContext(), MerchantPayoutTransactionHistoryActivity.class));
                return;
            case 1:
                InterfaceC002901k interfaceC002901k = this.A07;
                C77393i8 c77393i8 = this.A04;
                if (c77393i8 != null && c77393i8.A00() == AsyncTask.Status.RUNNING) {
                    this.A04.A05(false);
                }
                C77393i8 c77393i82 = new C77393i8(this, ((ActivityC02290Ap) this).A0B, ((ActivityC02310Ar) this).A01, this.A00, this.A0J, this.A02, "payments:settings", null, null, C000200d.A02("com.whatsapp.support.DescribeProblemActivity.from", "payments:settings"));
                this.A04 = c77393i82;
                interfaceC002901k.ARy(c77393i82, new Void[0]);
                return;
            case 2:
                Uri uri = c900549m.A03;
                if (uri != null) {
                    Intent intent = new Intent("android.intent.action.VIEW", uri);
                    if (intent.resolveActivity(getPackageManager()) == null) {
                        return;
                    }
                    startActivity(intent);
                    return;
                }
                throw null;
            case 3:
                Intent intent2 = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", c900549m.A05, null));
                if (intent2.resolveActivity(getPackageManager()) == null) {
                    return;
                }
                startActivity(intent2);
                return;
            case 4:
                ARS();
                Intent intent3 = new Intent(this, BrazilPayBloksActivity.class);
                intent3.putExtra("screen_params", c900549m.A07);
                intent3.putExtra("screen_name", c900549m.A06);
                A15(intent3, 1);
                return;
            case 5:
                if (c900549m.A08) {
                    A1C(getString(c900549m.A02));
                    return;
                } else {
                    ARS();
                    return;
                }
            case 6:
                AUj(c900549m.A00);
                return;
            case 7:
                C90454Bb c90454Bb = this.A01;
                if (c90454Bb == null) {
                    c90454Bb = new C90454Bb(((ActivityC02310Ar) this).A01, this.A03);
                    this.A01 = c90454Bb;
                }
                c90454Bb.A01(this, c900549m.A04.A00, R.string.payments_generic_error).show();
                return;
            default:
                return;
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.A05.A04(new C901349u(3));
        }
    }
}
