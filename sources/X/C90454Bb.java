package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaInAppBrowsingActivity;

/* renamed from: X.4Bb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C90454Bb implements InterfaceC06790Va {
    public final C002301c A00;
    public final C895547l A01;
    public final C0DW A02;

    @Override // X.InterfaceC06790Va
    public String A9F(int i) {
        return null;
    }

    @Override // X.InterfaceC06790Va
    public int A9z(int i, C3NV c3nv) {
        return 0;
    }

    @Override // X.InterfaceC06790Va
    public int AA0(int i) {
        return 0;
    }

    @Override // X.InterfaceC06790Va
    public void AEH(String str) {
    }

    @Override // X.InterfaceC06790Va
    public boolean AFB(int i) {
        return false;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFM(int i) {
        return i == 2001;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFN(int i) {
        return false;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFO(int i) {
        return false;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFP(int i) {
        return i == 10244;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFQ(int i) {
        return i == 10242;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFR(int i) {
        return i == 10241;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFS(int i) {
        return false;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFT(int i) {
        return i == 10240;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFW(int i) {
        return false;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFe(int i) {
        return i == 2826013;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFu(int i) {
        return false;
    }

    @Override // X.InterfaceC06790Va
    public int AGN() {
        return 0;
    }

    @Override // X.InterfaceC06790Va
    public int AGO() {
        return 0;
    }

    public C90454Bb(C002301c c002301c, C0DW c0dw) {
        this.A00 = c002301c;
        this.A02 = c0dw;
        this.A01 = new C895547l(c002301c);
    }

    public DialogInterfaceC019408z A00(final Context context) {
        C019208x c019208x = new C019208x(context);
        c019208x.A02(R.string.brazil_p2p_disabled_upsell_merchant_error);
        c019208x.A06(R.string.ok, null);
        c019208x.A04(R.string.learn_more, new DialogInterface.OnClickListener() { // from class: X.3NO
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C90454Bb.this.A03(context);
            }
        });
        return c019208x.A00();
    }

    public DialogInterfaceC019408z A01(Context context, int i, int i2) {
        String A06;
        DialogInterfaceC019408z A02 = this.A01.A02(context, i, null, null);
        if (A02 == null) {
            if (i == -233) {
                A06 = this.A00.A06(R.string.payment_card_cannot_verified_error);
            } else if (i == 477) {
                A06 = context.getString(R.string.dyi_request_report_incomplete_setup_failure_dialog_message);
            } else if (i == 10229) {
                A06 = this.A00.A06(R.string.brazil_card_token_expired_error);
            } else if (i == 10234) {
                A06 = this.A00.A06(R.string.payment_verify_card_error);
            } else if (i != 2896002) {
                A06 = this.A00.A06(i2);
            } else {
                return A00(context);
            }
            return C895547l.A00(context, A06, new DialogInterface.OnDismissListener() { // from class: X.3NN
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    dialogInterface.dismiss();
                }
            });
        }
        return A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
        if (r6 != 2826008) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.DialogInterfaceC019408z A02(android.content.Context r5, int r6, java.lang.String r7, android.content.DialogInterface.OnDismissListener r8, android.content.DialogInterface.OnDismissListener r9, android.content.DialogInterface.OnDismissListener r10) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90454Bb.A02(android.content.Context, int, java.lang.String, android.content.DialogInterface$OnDismissListener, android.content.DialogInterface$OnDismissListener, android.content.DialogInterface$OnDismissListener):X.08z");
    }

    public void A03(Context context) {
        Intent intent = new Intent(context, WaInAppBrowsingActivity.class);
        this.A02.A01();
        intent.putExtra("webview_url", "https://faq.whatsapp.com/payments/26000351");
        intent.putExtra("webview_javascript_enabled", true);
        context.startActivity(intent);
    }
}
