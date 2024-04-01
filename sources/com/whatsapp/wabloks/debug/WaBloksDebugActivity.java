package com.whatsapp.wabloks.debug;

import X.AbstractC02800Cx;
import X.C000200d;
import X.C00J;
import X.C018508q;
import X.C02820Cz;
import X.C46O;
import X.C46P;
import X.C46R;
import X.C46S;
import X.C4KE;
import X.C74993eB;
import X.C90254Ah;
import X.C91704Fy;
import X.View$OnClickListenerC75003eC;
import X.View$OnClickListenerC75013eD;
import X.View$OnClickListenerC75023eE;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.debug.WaBloksDebugActivity;
import com.whatsapp.wabloks.ui.BkSampleFragment;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class WaBloksDebugActivity extends C4KE {
    public ViewGroup A00;
    public C00J A01;
    public C00J A02;

    public static /* synthetic */ void A01(C46O c46o) {
        Exception exc = c46o.A00;
        if (exc == null) {
            c46o.A01 = Integer.valueOf(((Number) c46o.A01).intValue() + 10);
            return;
        }
        throw exc;
    }

    public static /* synthetic */ void A03(C46O c46o) {
        Exception exc = c46o.A00;
        if (exc == null) {
            c46o.A01 = Integer.valueOf(((Number) c46o.A01).intValue() + 10);
            throw new Exception("Fail");
        }
        throw exc;
    }

    public static /* synthetic */ void A04(C46O c46o) {
        c46o.A01 = Integer.valueOf(((Number) c46o.A01).intValue() + 100);
        Exception exc = c46o.A00;
        if (exc != null) {
            exc.getMessage();
        }
    }

    public static /* synthetic */ void A05(CountDownLatch countDownLatch, C46O c46o) {
        c46o.A01 = Integer.valueOf(((Number) c46o.A01).intValue() + 100);
        countDownLatch.countDown();
    }

    public final void A1P(String str, String str2) {
        StringBuilder sb = new StringBuilder("BLOKS: ");
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        Log.e(sb.toString());
        ((C018508q) this.A02.get()).A0E(C000200d.A0J("FAIL: ", str, ": ", str2), 0);
    }

    public /* synthetic */ void lambda$testErrorToast$49$WaBloksDebugActivity(View view) {
        C74993eB c74993eB = new C74993eB("Error: Hello World");
        Log.e(c74993eB);
        c74993eB.getMessage();
    }

    public /* synthetic */ void lambda$testHttps$44$WaBloksDebugActivity(View view) {
        try {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            C90254Ah c90254Ah = new C90254Ah((C91704Fy) this.A01.get());
            c90254Ah.A03 = new C46S() { // from class: X.3um
                {
                    WaBloksDebugActivity.this = this;
                }

                @Override // X.C46S
                public final C46O ANA(C46O c46o) {
                    c46o.A01 = 1;
                    return c46o;
                }
            };
            c90254Ah.A01 = new C46P() { // from class: X.3uk
                {
                    WaBloksDebugActivity.this = this;
                }

                @Override // X.C46P
                public final void A7Q(C46O c46o) {
                    WaBloksDebugActivity.A01(c46o);
                }
            };
            c90254Ah.A02 = new C46R() { // from class: X.3uj
                {
                    WaBloksDebugActivity.this = this;
                }

                @Override // X.C46R
                public final void AKV(C46O c46o) {
                    WaBloksDebugActivity.A05(countDownLatch, c46o);
                }
            };
            c90254Ah.A00();
            countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            StringBuilder A0P = C000200d.A0P("");
            A0P.append(e.getMessage());
            A1P("testHttps", A0P.toString());
        }
    }

    public /* synthetic */ void lambda$testHttpsRetry$48$WaBloksDebugActivity(View view) {
        try {
            C90254Ah c90254Ah = new C90254Ah((C91704Fy) this.A01.get());
            c90254Ah.A00 = 1;
            c90254Ah.A03 = new C46S() { // from class: X.3ul
                {
                    WaBloksDebugActivity.this = this;
                }

                @Override // X.C46S
                public final C46O ANA(C46O c46o) {
                    c46o.A01 = 1;
                    return c46o;
                }
            };
            c90254Ah.A01 = new C46P() { // from class: X.3ui
                {
                    WaBloksDebugActivity.this = this;
                }

                @Override // X.C46P
                public final void A7Q(C46O c46o) {
                    WaBloksDebugActivity.A03(c46o);
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
            };
            c90254Ah.A02 = new C46R() { // from class: X.3un
                {
                    WaBloksDebugActivity.this = this;
                }

                @Override // X.C46R
                public final void AKV(C46O c46o) {
                    WaBloksDebugActivity.A04(c46o);
                }
            };
            c90254Ah.A00();
        } catch (Exception e) {
            StringBuilder A0P = C000200d.A0P("");
            A0P.append(e.getMessage());
            A1P("testHttpsRetry", A0P.toString());
        }
    }

    @Override // X.C4KE, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_blok_debug);
        this.A00 = (ViewGroup) findViewById(R.id.debug_container);
        TextView textView = (TextView) getLayoutInflater().inflate(R.layout.bk_debug_button, (ViewGroup) null, false);
        textView.setText("testHttps");
        textView.setOnClickListener(new View$OnClickListenerC75013eD(this));
        this.A00.addView(textView);
        TextView textView2 = (TextView) getLayoutInflater().inflate(R.layout.bk_debug_button, (ViewGroup) null, false);
        textView2.setText("testHttpsRetry");
        textView2.setOnClickListener(new View$OnClickListenerC75023eE(this));
        this.A00.addView(textView2);
        TextView textView3 = (TextView) getLayoutInflater().inflate(R.layout.bk_debug_button, (ViewGroup) null, false);
        textView3.setText("testErrorToast");
        textView3.setOnClickListener(new View$OnClickListenerC75003eC(this));
        this.A00.addView(textView3);
        AbstractC02800Cx A0N = A0N();
        BkSampleFragment bkSampleFragment = new BkSampleFragment();
        if (A0N != null) {
            C02820Cz c02820Cz = new C02820Cz(A0N);
            c02820Cz.A00(R.id.bloks_fragment_container, bkSampleFragment);
            c02820Cz.A05();
            return;
        }
        throw null;
    }
}
