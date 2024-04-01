package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass029;
import X.AnonymousClass088;
import X.C000500h;
import X.C018508q;
import X.C0L6;
import X.InterfaceC70853Tw;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I0_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.qrcode.QrEducationDialogFragment;
import com.whatsapp.qrcode.QrScannerOverlay;
import com.whatsapp.qrcode.WaQrScannerView;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;

/* loaded from: classes2.dex */
public class QrScanCodeFragment extends Hilt_QrScanCodeFragment {
    public View A00;
    public ImageView A01;
    public C018508q A02;
    public C000500h A03;
    public QrScannerOverlay A04;
    public WaQrScannerView A05;
    public C0L6 A06;
    public String A07;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A08 = false;
    public final Runnable A0C = new RunnableEBaseShape5S0100000_I0_5(this, 22);
    public final Runnable A0D = new RunnableEBaseShape5S0100000_I0_5(this, 21);

    @Override // X.C0BA
    public void A0f() {
        this.A0U = true;
        C018508q c018508q = this.A02;
        c018508q.A02.removeCallbacks(this.A0C);
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.contact_qr_scan_code, viewGroup, false);
        this.A05 = (WaQrScannerView) inflate.findViewById(R.id.qr_scanner_view);
        this.A04 = (QrScannerOverlay) inflate.findViewById(R.id.overlay);
        this.A00 = inflate.findViewById(R.id.qr_scan_from_gallery);
        this.A01 = (ImageView) inflate.findViewById(R.id.qr_scan_flash);
        this.A09 = this.A03.A00.getBoolean("contact_qr_education", true);
        this.A01.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 31));
        this.A00.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 29));
        WaQrScannerView waQrScannerView = this.A05;
        waQrScannerView.setQrScannerCallback(new InterfaceC70853Tw() { // from class: X.3lr
            {
                QrScanCodeFragment.this = this;
            }

            @Override // X.InterfaceC70853Tw
            public void AI9(int i) {
                QrScanCodeFragment qrScanCodeFragment = QrScanCodeFragment.this;
                if (qrScanCodeFragment.A06.A04()) {
                    qrScanCodeFragment.A02.A07(R.string.error_camera_disabled_during_video_call, 1);
                }
                ActivityC02330At A09 = qrScanCodeFragment.A09();
                if (A09 instanceof AbstractActivityC49982Om) {
                    AbstractActivityC49982Om abstractActivityC49982Om = (AbstractActivityC49982Om) A09;
                    ViewPager viewPager = abstractActivityC49982Om.A03;
                    boolean A0M = abstractActivityC49982Om.A0D.A0M();
                    int i2 = A0M;
                    if (0 == 0) {
                        i2 = !A0M;
                    } else if (0 != 1) {
                        i2 = -1;
                    }
                    viewPager.A0B(i2, true);
                }
            }

            @Override // X.InterfaceC70853Tw
            public void ANK() {
                QrScanCodeFragment.this.A0z();
            }

            @Override // X.InterfaceC70853Tw
            public void ANU(C1D9 c1d9) {
                QrScanCodeFragment qrScanCodeFragment = QrScanCodeFragment.this;
                if (!qrScanCodeFragment.A08) {
                    String str = c1d9.A01;
                    if (str != null && !str.equals(qrScanCodeFragment.A07)) {
                        qrScanCodeFragment.A07 = str;
                        if (((AbstractActivityC49982Om) qrScanCodeFragment.A0A()).A1U(str, true, 2)) {
                            qrScanCodeFragment.A0A = true;
                            C018508q c018508q = qrScanCodeFragment.A02;
                            c018508q.A02.removeCallbacks(qrScanCodeFragment.A0C);
                            return;
                        }
                        qrScanCodeFragment.A02.A07(R.string.contact_qr_scan_toast_no_valid_code, 1);
                        qrScanCodeFragment.A05.A01.ARd();
                        return;
                    }
                    qrScanCodeFragment.A05.A01.ARd();
                }
            }
        });
        waQrScannerView.setContentDescription(A0F(R.string.contact_qr_scan_a_qr_code));
        AnonymousClass088.A1V(this.A05, R.string.accessibility_action_camera_focus);
        this.A05.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 30));
        A10();
        return inflate;
    }

    @Override // X.C0BA
    public void A0q() {
        C018508q c018508q = this.A02;
        c018508q.A02.removeCallbacks(this.A0C);
        this.A0U = true;
    }

    @Override // X.C0BA
    public void A0s() {
        this.A0U = true;
        if (!this.A0B || this.A0A || this.A09) {
            return;
        }
        C018508q c018508q = this.A02;
        c018508q.A02.postDelayed(this.A0C, 15000L);
    }

    public void A0y() {
        C018508q c018508q = this.A02;
        c018508q.A02.removeCallbacks(this.A0D);
        this.A0B = true;
        A10();
        C018508q c018508q2 = this.A02;
        Runnable runnable = this.A0C;
        c018508q2.A02.removeCallbacks(runnable);
        if (this.A09) {
            if (A0Z()) {
                AnonymousClass029.A1C(A0B(), new QrEducationDialogFragment());
                this.A08 = true;
            }
        } else if (this.A0A) {
        } else {
            this.A02.A02.postDelayed(runnable, 15000L);
        }
    }

    public final void A0z() {
        if (!this.A05.AVK()) {
            this.A01.setVisibility(8);
            return;
        }
        this.A01.setVisibility(0);
        boolean AFr = this.A05.A01.AFr();
        ImageView imageView = this.A01;
        int i = R.drawable.flash_off;
        if (AFr) {
            i = R.drawable.flash_on;
        }
        imageView.setImageResource(i);
        ImageView imageView2 = this.A01;
        int i2 = R.string.flash_off_action;
        if (!AFr) {
            i2 = R.string.flash_on_action;
        }
        imageView2.setContentDescription(A0F(i2));
    }

    public final void A10() {
        WaQrScannerView waQrScannerView = this.A05;
        if (waQrScannerView != null) {
            waQrScannerView.setVisibility(this.A0B ? 0 : 8);
            this.A04.setVisibility(this.A0B ? 0 : 8);
        }
    }
}
