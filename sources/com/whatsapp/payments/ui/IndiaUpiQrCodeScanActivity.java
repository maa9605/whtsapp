package com.whatsapp.payments.ui;

import X.AbstractActivityC92414Kf;
import X.C014406v;
import X.C0L6;
import X.C0U1;
import X.C20X;
import X.InterfaceC70853Tw;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScanActivity;
import com.whatsapp.qrcode.WaQrScannerView;

/* loaded from: classes3.dex */
public final class IndiaUpiQrCodeScanActivity extends AbstractActivityC92414Kf {
    public C0L6 A00;
    public final C014406v A01 = C014406v.A00("IndiaUpiQrCodeScanActivity", "payment", "IN");

    @Override // X.C20X
    public void A1Q() {
        Vibrator vibrator = (Vibrator) getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(75L);
        }
        Intent intent = new Intent(this, IndiaUpiPaymentLauncherActivity.class);
        intent.putExtra("intent_source", true);
        intent.setData(Uri.parse(((C20X) this).A05));
        startActivity(intent);
        finish();
    }

    @Override // X.AbstractActivityC92414Kf, X.C20X, X.C20Y, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0h(5);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(getLayoutInflater().inflate(R.layout.india_upi_qr_code_scanner, (ViewGroup) null, false));
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A08(R.string.menuitem_scan_qr);
            A0c.A0L(true);
        }
        C0U1 A0c2 = A0c();
        if (A0c2 != null) {
            A0c2.A0L(true);
            A0m(false);
            WaQrScannerView waQrScannerView = (WaQrScannerView) findViewById(R.id.qr_scanner_view);
            ((C20X) this).A03 = waQrScannerView;
            waQrScannerView.setQrScannerCallback(new InterfaceC70853Tw() { // from class: X.4Dn
                {
                    IndiaUpiQrCodeScanActivity.this = this;
                }

                @Override // X.InterfaceC70853Tw
                public void AI9(int i) {
                    IndiaUpiQrCodeScanActivity indiaUpiQrCodeScanActivity = IndiaUpiQrCodeScanActivity.this;
                    if (indiaUpiQrCodeScanActivity.A00.A04()) {
                        ((ActivityC02290Ap) indiaUpiQrCodeScanActivity).A0A.A07(R.string.error_camera_disabled_during_video_call, 1);
                    } else if (i != 2) {
                        ((ActivityC02290Ap) indiaUpiQrCodeScanActivity).A0A.A07(R.string.cannot_start_camera, 1);
                    }
                    indiaUpiQrCodeScanActivity.finish();
                }

                @Override // X.InterfaceC70853Tw
                public void ANK() {
                    IndiaUpiQrCodeScanActivity indiaUpiQrCodeScanActivity = IndiaUpiQrCodeScanActivity.this;
                    indiaUpiQrCodeScanActivity.A01.A07(null, "indiaupiqractivity/previewready", null);
                    ((C20X) indiaUpiQrCodeScanActivity).A07 = true;
                }

                @Override // X.InterfaceC70853Tw
                public void ANU(C1D9 c1d9) {
                    IndiaUpiQrCodeScanActivity.this.A1R(c1d9);
                }
            });
            findViewById(R.id.overlay).setVisibility(0);
            A1P();
            return;
        }
        throw null;
    }
}
