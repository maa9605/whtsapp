package com.whatsapp.deeplink;

import X.AnonymousClass011;
import X.AnonymousClass075;
import X.AnonymousClass272;
import X.C003701t;
import X.C018308n;
import X.C018508q;
import X.C01B;
import X.C02L;
import X.C05G;
import X.C05W;
import X.C05Y;
import X.C09I;
import X.C0CG;
import X.C0CI;
import X.C0DV;
import X.C0ED;
import X.C0WZ;
import X.C2L3;
import X.C2L9;
import X.C2MP;
import X.C2Nm;
import X.C49462Ko;
import X.InterfaceC002901k;
import X.InterfaceC49902Nn;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.google.android.search.verification.client.R;
import com.whatsapp.deeplink.DeepLinkActivity;

/* loaded from: classes2.dex */
public class DeepLinkActivity extends C2Nm implements InterfaceC49902Nn {
    public Handler A00;
    public C018308n A01;
    public C018508q A02;
    public C02L A03;
    public C01B A04;
    public C09I A05;
    public C49462Ko A06;
    public C2L3 A07;
    public C2MP A08;
    public AnonymousClass272 A09;
    public C05W A0A;
    public AnonymousClass075 A0B;
    public C2L9 A0C;
    public C0WZ A0D;
    public C0ED A0E;
    public C003701t A0F;
    public AnonymousClass011 A0G;
    public C05Y A0H;
    public C0DV A0I;
    public C05G A0J;
    public InterfaceC002901k A0K;

    @Override // X.ActivityC02290Ap
    public void A10(int i) {
        super.A10(i);
        finish();
        overridePendingTransition(0, 0);
    }

    public void A1P(int i, final int i2, C0CI c0ci) {
        Message obtain = Message.obtain(this.A00, 1);
        obtain.arg1 = i;
        this.A00.sendMessageDelayed(obtain, 500L);
        c0ci.A01.A03(new C0CG() { // from class: X.3AG
            {
                DeepLinkActivity.this = this;
            }

            @Override // X.C0CG
            public final void A54(Object obj) {
                DeepLinkActivity deepLinkActivity = DeepLinkActivity.this;
                int i3 = i2;
                deepLinkActivity.A00.removeMessages(1);
                deepLinkActivity.ARS();
                if (((Boolean) obj).booleanValue()) {
                    deepLinkActivity.finish();
                } else {
                    deepLinkActivity.AUj(i3);
                }
            }
        }, null);
    }

    @Override // X.InterfaceC49902Nn
    public void AJp(int i) {
        ARS();
        AUj(R.string.invalid_deep_link);
        this.A00.removeMessages(1);
    }

    @Override // X.InterfaceC49902Nn
    public void APG(Uri uri) {
        this.A00.removeMessages(1);
        ARS();
        if (uri == null) {
            new AlertDialog.Builder(this).setMessage(R.string.futureproof_deep_link).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.2uV
                {
                    DeepLinkActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    DeepLinkActivity deepLinkActivity = DeepLinkActivity.this;
                    deepLinkActivity.finish();
                    deepLinkActivity.overridePendingTransition(0, 0);
                }
            }).setPositiveButton(R.string.update_whatsapp, new DialogInterface.OnClickListener() { // from class: X.2uW
                {
                    DeepLinkActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    DeepLinkActivity deepLinkActivity = DeepLinkActivity.this;
                    deepLinkActivity.A01.A06(deepLinkActivity, new Intent("android.intent.action.VIEW", deepLinkActivity.A05.A01()));
                    deepLinkActivity.finish();
                    deepLinkActivity.overridePendingTransition(0, 0);
                }
            }).create().show();
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.putExtra("com.android.browser.application_id", getPackageName());
        intent.putExtra("create_new_tab", true);
        this.A01.A06(this, intent);
        finish();
        overridePendingTransition(0, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(9:45|(3:47|(1:49)|50)|(6:71|72|53|54|55|(1:68)(4:59|(2:61|(1:63)(1:66))(1:67)|64|65))|52|53|54|55|(1:57)|68) */
    @Override // X.C2Nm, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 1612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.deeplink.DeepLinkActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A00.removeMessages(1);
    }
}
