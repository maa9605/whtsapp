package com.whatsapp.status;

import X.AbstractActivityC50102Pu;
import X.C0E6;
import X.C0EB;
import X.C0U1;
import X.C3X2;
import X.InterfaceC002901k;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RadioButton;
import android.widget.ScrollView;
import com.google.android.search.verification.client.R;
import com.whatsapp.status.StatusPrivacyActivity;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0_2;

/* loaded from: classes2.dex */
public class StatusPrivacyActivity extends AbstractActivityC50102Pu {
    public int A00;
    public View A01;
    public RadioButton A02;
    public RadioButton A03;
    public RadioButton A04;
    public ScrollView A05;
    public C0E6 A06;
    public C0EB A07;
    public InterfaceC002901k A08;

    public final void A1P() {
        if (this.A05.canScrollVertically(1)) {
            this.A01.setElevation(this.A00);
        } else {
            this.A01.setElevation(0.0f);
        }
    }

    public final void A1Q() {
        int A04 = this.A07.A04();
        if (A04 == 0) {
            this.A03.setChecked(true);
        } else if (A04 == 1) {
            this.A04.setChecked(true);
        } else if (A04 == 2) {
            this.A02.setChecked(true);
        } else {
            throw new IllegalStateException("unknown status distribution mode");
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0) {
            A1Q();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A05.getViewTreeObserver().addOnPreDrawListener(new C3X2(this));
        }
    }

    @Override // X.AbstractActivityC50102Pu, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.status_privacy);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            A0c.A08(R.string.status_privacy);
            this.A05 = (ScrollView) findViewById(R.id.scroll_view);
            this.A03 = (RadioButton) findViewById(R.id.my_contacts_btn);
            this.A02 = (RadioButton) findViewById(R.id.black_list_btn);
            this.A04 = (RadioButton) findViewById(R.id.white_list_btn);
            this.A01 = findViewById(R.id.bottom_button_container);
            A1Q();
            this.A03.setText(R.string.select_status_recipients_my_contacts);
            this.A02.setText(R.string.select_status_recipients_black_list);
            this.A04.setText(R.string.select_status_recipients_white_list);
            this.A03.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 36));
            this.A02.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 37));
            this.A04.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 38));
            findViewById(R.id.confirm_change_btn).setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 39));
            if (!this.A07.A0H()) {
                this.A08.AS1(new RunnableEBaseShape6S0100000_I0_6(this, 27));
            }
            if (Build.VERSION.SDK_INT >= 21) {
                this.A00 = getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation);
                this.A05.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: X.3Wp
                    {
                        StatusPrivacyActivity.this = this;
                    }

                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        StatusPrivacyActivity.this.A1P();
                    }
                });
                this.A05.getViewTreeObserver().addOnPreDrawListener(new C3X2(this));
                return;
            }
            return;
        }
        throw null;
    }
}
