package com.whatsapp.registration;

import X.AbstractActivityC50022Ox;
import X.C0DV;
import X.C0DW;
import X.C0U1;
import X.C3VA;
import X.InterfaceC002901k;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I0_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.registration.ChangeNumberOverview;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class ChangeNumberOverview extends AbstractActivityC50022Ox {
    public int A00;
    public View A01;
    public ScrollView A02;
    public C0DW A03;
    public C0DV A04;
    public InterfaceC002901k A05;

    public final void A1P() {
        if (this.A02.canScrollVertically(1)) {
            this.A01.setElevation(this.A00);
        } else {
            this.A01.setElevation(0.0f);
        }
    }

    public /* synthetic */ void lambda$onCreate$2151$ChangeNumberOverview(View view) {
        Log.i("changenumberoverview/next");
        startActivity(new Intent(this, ChangeNumber.class));
        finish();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A02.getViewTreeObserver().addOnPreDrawListener(new C3VA(this));
        }
    }

    @Override // X.AbstractActivityC50022Ox, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.change_number_title);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            A0c.A0M(true);
            setContentView(R.layout.change_number_overview);
            this.A02 = (ScrollView) findViewById(R.id.scroll_view);
            this.A01 = findViewById(R.id.bottom_button_container);
            if (this.A03.A04()) {
                this.A05.AS1(new RunnableEBaseShape5S0100000_I0_5(this, 26));
            } else {
                ((TextView) findViewById(R.id.change_number_overview_body_one)).setText(R.string.change_number_overview_one);
                ((TextView) findViewById(R.id.change_number_overview_body_two)).setText(R.string.change_number_overview_two);
                ((TextView) findViewById(R.id.change_number_overview_body_three)).setText(R.string.change_number_overview_three);
            }
            findViewById(R.id.next_btn).setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 38));
            if (Build.VERSION.SDK_INT >= 21) {
                this.A00 = getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation);
                this.A02.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: X.3U9
                    {
                        ChangeNumberOverview.this = this;
                    }

                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        ChangeNumberOverview.this.A1P();
                    }
                });
                this.A02.getViewTreeObserver().addOnPreDrawListener(new C3VA(this));
                return;
            }
            return;
        }
        throw null;
    }
}
