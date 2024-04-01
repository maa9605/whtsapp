package com.whatsapp.payments.ui;

import X.C014406v;
import X.C0DW;
import X.C4LE;
import X.C90564Bm;
import android.content.DialogInterface;

/* loaded from: classes3.dex */
public class IndiaUpiPaymentLauncherActivity extends C4LE implements DialogInterface.OnDismissListener {
    public C90564Bm A00;
    public C0DW A01;
    public final C014406v A02 = C014406v.A00("IndiaUpiPaymentLauncherActivity", "payment-settings", "IN");

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0048, code lost:
        if (getIntent().getExtras().getBoolean("intent_source") == false) goto L20;
     */
    @Override // X.C4LE, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            X.0DW r0 = r7.A01
            boolean r0 = r0.A02()
            r6 = 0
            if (r0 != 0) goto L17
            X.06v r1 = r7.A02
            java.lang.String r0 = "payment feature is not enabled."
            r1.A08(r0, r6)
            r7.finish()
            return
        L17:
            android.content.Intent r0 = r7.getIntent()
            if (r0 == 0) goto L8d
            android.content.Intent r0 = r7.getIntent()
            android.net.Uri r0 = r0.getData()
            if (r0 == 0) goto L8d
            android.content.Intent r0 = r7.getIntent()
            android.net.Uri r4 = r0.getData()
            android.content.Intent r0 = r7.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L4a
            android.content.Intent r0 = r7.getIntent()
            android.os.Bundle r1 = r0.getExtras()
            java.lang.String r0 = "intent_source"
            boolean r0 = r1.getBoolean(r0)
            r3 = 1
            if (r0 != 0) goto L4b
        L4a:
            r3 = 0
        L4b:
            X.06v r2 = r7.A02
            java.lang.String r1 = "received payment intent: isFromQrCode "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.A07(r6, r0, r6)
            if (r3 == 0) goto L8a
            java.lang.String r5 = "QR_CODE"
        L62:
            java.lang.String r4 = r4.toString()
            com.whatsapp.payments.ui.PaymentBottomSheet r3 = new com.whatsapp.payments.ui.PaymentBottomSheet
            r3.<init>()
            r3.A00 = r7
            com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment r2 = new com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment
            r2.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "ARG_URL"
            r1.putString(r0, r4)
            java.lang.String r0 = "external_payment_source"
            r1.putString(r0, r5)
            r2.A0P(r1)
            r3.A01 = r2
            r7.AUg(r3, r6)
            return
        L8a:
            java.lang.String r5 = "PAY_INTENT"
            goto L62
        L8d:
            r7.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPaymentLauncherActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        finish();
    }
}
