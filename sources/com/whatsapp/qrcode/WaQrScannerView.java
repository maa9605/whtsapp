package com.whatsapp.qrcode;

import X.C003701t;
import X.C2YM;
import X.C2YO;
import X.C85943wX;
import X.InterfaceC70853Tw;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.Map;

/* loaded from: classes2.dex */
public class WaQrScannerView extends C2YO implements C2YM {
    public C003701t A00;
    public C2YM A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.whatsapp.qrcode.QrScannerViewV2] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.whatsapp.qrcode.WaQrScannerView, android.view.View, android.view.ViewGroup] */
    public WaQrScannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C85943wX c85943wX;
        boolean A0C = this.A00.A0C(349);
        Context context2 = getContext();
        if (A0C) {
            c85943wX = new QrScannerViewV2(context2);
        } else {
            c85943wX = new C85943wX(context2);
        }
        addView(c85943wX);
        this.A01 = c85943wX;
    }

    @Override // X.C2YM
    public boolean AFr() {
        return this.A01.AFr();
    }

    @Override // X.C2YM
    public void ARd() {
        this.A01.ARd();
    }

    @Override // X.C2YM
    public void ARp() {
        this.A01.ARp();
    }

    @Override // X.C2YM
    public boolean AVK() {
        return this.A01.AVK();
    }

    @Override // X.C2YM
    public void AVf() {
        this.A01.AVf();
    }

    @Override // X.C2YM
    public void setQrDecodeHints(Map map) {
        this.A01.setQrDecodeHints(map);
    }

    @Override // X.C2YM
    public void setQrScannerCallback(InterfaceC70853Tw interfaceC70853Tw) {
        this.A01.setQrScannerCallback(interfaceC70853Tw);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ((View) this.A01).setVisibility(i);
    }
}
