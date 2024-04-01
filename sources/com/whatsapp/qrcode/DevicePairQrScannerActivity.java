package com.whatsapp.qrcode;

import X.AbstractC000600i;
import X.ActivityC02290Ap;
import X.AnonymousClass012;
import X.AnonymousClass363;
import X.C000500h;
import X.C001200o;
import X.C018508q;
import X.C01J;
import X.C01R;
import X.C05Y;
import X.C20N;
import X.C20W;
import X.C20X;
import X.C2AV;
import X.C2Iz;
import X.C2J2;
import X.C41521u3;
import X.C41711uO;
import X.C41981up;
import X.C41991uq;
import X.C44331yt;
import X.C44441z5;
import X.C44471z8;
import X.C44501zB;
import X.C49972Oj;
import X.C70833Tu;
import X.C85353vG;
import X.InterfaceC002901k;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class DevicePairQrScannerActivity extends C20W {
    public static final long A0O = TimeUnit.SECONDS.toMillis(2);
    public AbstractC000600i A00;
    public C018508q A01;
    public C44441z5 A02;
    public C44471z8 A03;
    public C2J2 A04;
    public C49972Oj A05;
    public C44331yt A06;
    public AnonymousClass012 A07;
    public C001200o A08;
    public C000500h A09;
    public C01J A0A;
    public C01R A0B;
    public C41711uO A0C;
    public C05Y A0D;
    public C2AV A0E;
    public C41521u3 A0F;
    public C70833Tu A0G;
    public InterfaceC002901k A0H;
    public C41981up A0I;
    public C41991uq A0J;
    public Runnable A0K;
    public final Runnable A0N = new RunnableEBaseShape5S0100000_I0_5(this, 19);
    public final C2Iz A0M = new C2Iz(this);
    public final C44501zB A0L = new C20N(this);

    @Override // X.ActivityC02290Ap
    public void A10(int i) {
        if (i == R.string.network_required_airplane_on || i == R.string.network_required || i == R.string.error_log_in_device) {
            ((C20X) this).A03.A01.ARd();
        }
    }

    public final void A1S() {
        Runnable runnable = this.A0K;
        if (runnable != null) {
            ((ActivityC02290Ap) this).A04.removeCallbacks(runnable);
        }
        if (this.A0C.A0H.A02()) {
            ARS();
        } else {
            A0m(false);
        }
    }

    @Override // X.C20W, X.C20X, X.C20Y, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        C2J2 c2j2;
        super.onCreate(bundle);
        C49972Oj c49972Oj = this.A05;
        if (c49972Oj.A02.A0H.A02()) {
            c2j2 = new AnonymousClass363(c49972Oj.A01, c49972Oj.A04, c49972Oj.A03, c49972Oj.A00);
        } else {
            c2j2 = new C2J2() { // from class: X.364
                @Override // X.C2J2
                public void AG4(int i) {
                }

                @Override // X.C2J2
                public void AG5(int i, long j) {
                }

                @Override // X.C2J2
                public void AG7() {
                }

                @Override // X.C2J2
                public void ANk(String str) {
                }
            };
        }
        this.A04 = c2j2;
        this.A0G = new C70833Tu(this.A08, this.A07, this.A01, this.A00, this.A0H, this.A0I, this.A0J, this.A0D, this.A0B, this.A0F, this.A06, this.A0A, this.A09, this.A0E, this.A0C, this.A02, this.A03, this.A0M);
        TextView textView = (TextView) findViewById(R.id.hint);
        textView.setVisibility(0);
        textView.setText(Html.fromHtml(getString(R.string.qr_code_hint, "web.whatsapp.com")));
        this.A0C.A00(this.A0L);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        this.A0C.A01(this.A0L);
        C85353vG c85353vG = this.A0G.A01;
        if (c85353vG != null) {
            C41991uq c41991uq = c85353vG.A08;
            c41991uq.A0R.remove(c85353vG.A07);
        }
        super.onDestroy();
    }
}
