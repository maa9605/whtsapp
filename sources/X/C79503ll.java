package X;

import com.whatsapp.qrcode.QrScannerViewV2;

/* renamed from: X.3ll  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C79503ll implements InterfaceC49112In {
    public final /* synthetic */ QrScannerViewV2 A00;

    @Override // X.InterfaceC49112In
    public void AHd(float f, float f2) {
    }

    @Override // X.InterfaceC49112In
    public void AHe(boolean z) {
    }

    @Override // X.InterfaceC49112In
    public void AQI() {
    }

    public C79503ll(QrScannerViewV2 qrScannerViewV2) {
        this.A00 = qrScannerViewV2;
    }

    @Override // X.InterfaceC49112In
    public void AI9(int i) {
        QrScannerViewV2 qrScannerViewV2 = this.A00;
        if (qrScannerViewV2.A05 != null) {
            qrScannerViewV2.A06.post(new RunnableEBaseShape1S0101000_I1(this, i, 8));
        }
    }

    @Override // X.InterfaceC49112In
    public void ANK() {
        QrScannerViewV2 qrScannerViewV2 = this.A00;
        if (qrScannerViewV2.A05 != null) {
            qrScannerViewV2.A06.post(new RunnableEBaseShape9S0100000_I1_1(this, 10));
        }
    }

    @Override // X.InterfaceC49112In
    public void ANU(C1D9 c1d9) {
        QrScannerViewV2 qrScannerViewV2 = this.A00;
        if (qrScannerViewV2.A05 != null) {
            qrScannerViewV2.A06.post(new RunnableEBaseShape6S0200000_I1(this, c1d9, 12));
        }
    }
}
