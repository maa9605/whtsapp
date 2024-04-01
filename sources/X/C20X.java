package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.qrcode.WaQrScannerView;
import com.whatsapp.util.Log;

/* renamed from: X.20X */
/* loaded from: classes2.dex */
public abstract class C20X extends C20Y {
    public View A00;
    public View A01;
    public C02F A02;
    public WaQrScannerView A03;
    public C0L6 A04;
    public String A05;
    public boolean A06 = true;
    public boolean A07;

    public void A1P() {
        if (this.A02.A02("android.permission.CAMERA") != 0) {
            this.A03.setVisibility(8);
            this.A00.setVisibility(8);
            this.A01.setVisibility(0);
            startActivityForResult(new Intent(this, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_cam).putExtra("message_id", R.string.permission_cam_access_on_wa_web_connect_request).putExtra("message_params_id", new int[]{R.string.localized_app_name}).putExtra("perm_denial_message_id", R.string.permission_cam_access_on_wa_web_connect).putExtra("perm_denial_message_params_id", new int[]{R.string.localized_app_name}).putExtra("permissions", new String[]{"android.permission.CAMERA"}).putExtra("force_ui", true), 1);
            return;
        }
        this.A03.setVisibility(0);
        this.A00.setVisibility(0);
        this.A01.setVisibility(8);
    }

    public void A1Q() {
        DevicePairQrScannerActivity devicePairQrScannerActivity = (DevicePairQrScannerActivity) this;
        C018508q c018508q = devicePairQrScannerActivity.A01;
        c018508q.A02.removeCallbacks(devicePairQrScannerActivity.A0N);
        devicePairQrScannerActivity.A01.A0G(new RunnableEBaseShape5S0100000_I0_5(devicePairQrScannerActivity, 15));
    }

    public void A1R(C1D9 c1d9) {
        String str = c1d9.A01;
        Log.i("QrScannerActivity/result");
        if (str != null && !str.equals(this.A05)) {
            this.A05 = str;
            A1Q();
            return;
        }
        this.A03.A01.ARd();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == 0) {
            finish();
        } else {
            this.A03.setVisibility(0);
            this.A00.setVisibility(0);
            this.A01.setVisibility(8);
        }
    }

    @Override // X.C20Y, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0h(5);
        super.onCreate(bundle);
        setTitle(R.string.scan_qr_code);
        getWindow().addFlags(128);
        setContentView(getLayoutInflater().inflate(R.layout.qr_code_scanner, (ViewGroup) null, false));
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            A0m(false);
            this.A06 = ((ActivityC02290Ap) this).A0F.A00.getBoolean("qr_education", true);
            this.A00 = findViewById(R.id.overlay);
            this.A03 = (WaQrScannerView) findViewById(R.id.qr_scanner_view);
            this.A01 = findViewById(R.id.shade);
            this.A03.setQrScannerCallback(new InterfaceC70853Tw() { // from class: X.3lk
                {
                    C20X.this = this;
                }

                @Override // X.InterfaceC70853Tw
                public void AI9(int i) {
                    C20X c20x = C20X.this;
                    if (c20x.A04.A04()) {
                        ((ActivityC02290Ap) c20x).A0A.A07(R.string.error_camera_disabled_during_video_call, 1);
                    } else if (i != 2) {
                        ((ActivityC02290Ap) c20x).A0A.A07(R.string.cannot_start_camera, 1);
                    }
                    c20x.finish();
                }

                @Override // X.InterfaceC70853Tw
                public void ANK() {
                    Log.i("qractivity/previewready");
                    C20X.this.A07 = true;
                }

                @Override // X.InterfaceC70853Tw
                public void ANU(C1D9 c1d9) {
                    C20X c20x = C20X.this;
                    if (c20x.A06) {
                        return;
                    }
                    c20x.A1R(c1d9);
                }
            });
            View findViewById = findViewById(R.id.ok);
            View findViewById2 = findViewById(R.id.education);
            findViewById.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0_0(this, findViewById2, 32));
            if (this.A06) {
                findViewById2.setVisibility(0);
                this.A03.setVisibility(8);
                this.A00.setVisibility(8);
                this.A01.setVisibility(0);
                return;
            }
            findViewById2.setVisibility(8);
            A1P();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.A03.getVisibility() == 0) {
            this.A03.setVisibility(4);
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.A03.getVisibility() == 4) {
            this.A03.setVisibility(0);
        }
    }
}
