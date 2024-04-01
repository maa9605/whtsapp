package com.whatsapp.qrcode.contactqr;

import X.AbstractActivityC49992Or;
import X.AbstractC50702Sv;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.AnonymousClass011;
import X.AnonymousClass012;
import X.AnonymousClass075;
import X.C018508q;
import X.C01B;
import X.C01C;
import X.C02L;
import X.C04480Ki;
import X.C05W;
import X.C05Y;
import X.C0CA;
import X.C0DV;
import X.C0DW;
import X.C0E7;
import X.C2L9;
import X.C41681uL;
import X.C42371vd;
import X.C50692Su;
import X.InterfaceC002901k;
import X.InterfaceC05810Qi;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class QrSheetDeepLinkActivity extends AbstractActivityC49992Or implements InterfaceC05810Qi {
    public C04480Ki A00;
    public C02L A01;
    public C05W A02;
    public C42371vd A03;
    public AnonymousClass075 A04;
    public C2L9 A05;
    public C0E7 A06;
    public C0CA A07;
    public AnonymousClass011 A08;
    public C05Y A09;
    public C41681uL A0A;
    public C0DW A0B;
    public C0DV A0C;
    public C50692Su A0D;
    public InterfaceC002901k A0E;
    public String A0F;

    @Override // X.InterfaceC05810Qi
    public void ANV() {
        finish();
    }

    @Override // X.AbstractActivityC49992Or, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass012 anonymousClass012 = ((ActivityC02270An) this).A08;
        C018508q c018508q = ((ActivityC02290Ap) this).A0A;
        C02L c02l = this.A01;
        InterfaceC002901k interfaceC002901k = this.A0E;
        AnonymousClass011 anonymousClass011 = this.A08;
        C01B c01b = ((ActivityC02290Ap) this).A0B;
        C50692Su c50692Su = new C50692Su(anonymousClass012, c018508q, c02l, interfaceC002901k, anonymousClass011, c01b, ((ActivityC02270An) this).A01, this.A09, this.A02, ((ActivityC02290Ap) this).A0E, this.A00, this.A0C, this.A05, this.A06, this.A04, this.A07, this.A0B, this.A0A, this.A03, this, c01b.A0E(C01C.A0K), ((ActivityC02290Ap) this).A0B.A0E(C01C.A1T), false, false, null);
        this.A0D = c50692Su;
        c50692Su.A00 = true;
        String stringExtra = getIntent().getStringExtra("qrcode");
        this.A0F = stringExtra;
        if (stringExtra == null || ((AbstractC50702Sv) this.A0D).A0D) {
            return;
        }
        this.A0F = stringExtra;
        this.A0D.A02(stringExtra, false, 5);
    }
}
