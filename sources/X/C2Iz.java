package X;

import android.content.DialogInterface;
import android.os.Vibrator;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;

/* renamed from: X.2Iz */
/* loaded from: classes2.dex */
public class C2Iz {
    public final /* synthetic */ DevicePairQrScannerActivity A00;

    public C2Iz(DevicePairQrScannerActivity devicePairQrScannerActivity) {
        this.A00 = devicePairQrScannerActivity;
    }

    public void A00() {
        DevicePairQrScannerActivity devicePairQrScannerActivity = this.A00;
        if (devicePairQrScannerActivity.A0C.A0H.A02()) {
            devicePairQrScannerActivity.A12(R.string.logging_in_device);
        } else {
            devicePairQrScannerActivity.A0m(true);
        }
        Runnable runnable = devicePairQrScannerActivity.A0K;
        if (runnable != null) {
            ((ActivityC02290Ap) devicePairQrScannerActivity).A04.removeCallbacks(runnable);
        }
        View view = ((ActivityC02290Ap) devicePairQrScannerActivity).A04;
        Runnable runnable2 = devicePairQrScannerActivity.A0K;
        if (runnable2 == null) {
            runnable2 = new RunnableEBaseShape5S0100000_I0_5(devicePairQrScannerActivity, 17);
            devicePairQrScannerActivity.A0K = runnable2;
        }
        view.postDelayed(runnable2, 32000L);
    }

    public void A01() {
        DevicePairQrScannerActivity devicePairQrScannerActivity = this.A00;
        if (!devicePairQrScannerActivity.A0C.A0H.A02() && !C46W.A07(((ActivityC02290Ap) devicePairQrScannerActivity).A0B)) {
            devicePairQrScannerActivity.A01.A0E(devicePairQrScannerActivity.getString(R.string.invalid_qr_code, "web.whatsapp.com"), 0);
            ((C20X) devicePairQrScannerActivity).A03.postDelayed(new RunnableEBaseShape5S0100000_I0_5(devicePairQrScannerActivity, 18), 3000L);
            return;
        }
        C019208x c019208x = new C019208x(devicePairQrScannerActivity);
        c019208x.A03(R.string.invalid_qr_code_title);
        c019208x.A06(R.string.ok, null);
        c019208x.A01.A07 = new DialogInterface.OnDismissListener() { // from class: X.3To
            {
                C2Iz.this = this;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ((C20X) C2Iz.this.A00).A03.A01.ARd();
            }
        };
        c019208x.A02(R.string.invalid_qr_code_description);
        c019208x.A01();
    }

    public void A02() {
        DevicePairQrScannerActivity devicePairQrScannerActivity = this.A00;
        if (devicePairQrScannerActivity.A0G.A00().A9m() == null) {
            devicePairQrScannerActivity.A1S();
            ((Vibrator) devicePairQrScannerActivity.getSystemService("vibrator")).vibrate(75L);
            devicePairQrScannerActivity.finish();
        }
    }

    public final void A03() {
        DevicePairQrScannerActivity devicePairQrScannerActivity = this.A00;
        if (!devicePairQrScannerActivity.A0C.A0H.A02() && !C46W.A07(((ActivityC02290Ap) devicePairQrScannerActivity).A0B)) {
            devicePairQrScannerActivity.A01.A0E(devicePairQrScannerActivity.getString(R.string.invalid_qr_code, "web.whatsapp.com"), 1);
            devicePairQrScannerActivity.finish();
            return;
        }
        C019208x c019208x = new C019208x(devicePairQrScannerActivity);
        c019208x.A03(R.string.device_linking_failed_title);
        c019208x.A06(R.string.ok, null);
        c019208x.A01.A07 = new DialogInterface.OnDismissListener() { // from class: X.3Tn
            {
                C2Iz.this = this;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C2Iz.this.A00.finish();
            }
        };
        c019208x.A02(R.string.device_linking_failed_message);
        c019208x.A01();
    }

    public void A04(int i) {
        DevicePairQrScannerActivity devicePairQrScannerActivity = this.A00;
        if (devicePairQrScannerActivity.A01 != null) {
            devicePairQrScannerActivity.A04.AG5(2, i);
            devicePairQrScannerActivity.A1S();
            if (i != 403) {
                if (i == 419) {
                    devicePairQrScannerActivity.A01.A07(R.string.error_message_max_device_paired, 1);
                    devicePairQrScannerActivity.finish();
                    return;
                } else if (i != 450) {
                    A03();
                    return;
                }
            }
            ((C20X) devicePairQrScannerActivity).A03.A01.ARd();
            C018508q c018508q = devicePairQrScannerActivity.A01;
            c018508q.A02.postDelayed(devicePairQrScannerActivity.A0N, DevicePairQrScannerActivity.A0O);
            return;
        }
        throw null;
    }
}
