package com.whatsapp.tos;

import X.AbstractActivityC49572Le;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.C000200d;
import X.C000500h;
import X.C002501g;
import X.C003301p;
import X.C01C;
import X.C02160Ac;
import X.C02770Cu;
import X.C02780Cv;
import X.C03070Ea;
import X.C06870Vj;
import X.C0EG;
import X.C0We;
import X.C3ZN;
import X.C50502Sa;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.tos.TosUpdateActivity;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I0_3;
import java.util.Date;

/* loaded from: classes2.dex */
public class TosUpdateActivity extends AbstractActivityC49572Le {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public CheckBox A05;
    public ImageView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextEmojiLabel A0A;
    public C06870Vj A0B;
    public C0EG A0C;
    public boolean A0D;

    public final void A1P() {
        if (this.A00 == 0) {
            if (this.A03.getVisibility() != 0) {
                TranslateAnimation translateAnimation = new TranslateAnimation(1, ((ActivityC02310Ar) this).A01.A0M() ? -1.0f : 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
                translateAnimation.setDuration(200L);
                translateAnimation.setInterpolator(new DecelerateInterpolator());
                this.A03.startAnimation(translateAnimation);
                TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, ((ActivityC02310Ar) this).A01.A0M() ? 1.0f : -1.0f, 1, 0.0f, 1, 0.0f);
                translateAnimation2.setDuration(200L);
                translateAnimation2.setInterpolator(new DecelerateInterpolator());
                this.A04.startAnimation(translateAnimation2);
            }
            this.A03.setVisibility(0);
            this.A04.setVisibility(8);
            this.A09.setText("");
            this.A07.setText(R.string.tos_next);
            this.A07.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_3(this, 2));
            if (this.A01.getVisibility() != 8) {
                TranslateAnimation translateAnimation3 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
                translateAnimation3.setDuration(200L);
                translateAnimation3.setInterpolator(new DecelerateInterpolator());
                this.A01.startAnimation(translateAnimation3);
            }
            this.A01.setVisibility(8);
            this.A06.setImageDrawable(new C50502Sa(C02160Ac.A00(this, R.color.tos_indicator_light)));
            this.A02.setVisibility(8);
            return;
        }
        if (this.A04.getVisibility() != 0) {
            TranslateAnimation translateAnimation4 = new TranslateAnimation(1, 0.0f, 1, ((ActivityC02310Ar) this).A01.A0M() ? -1.0f : 1.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation4.setDuration(200L);
            translateAnimation4.setInterpolator(new DecelerateInterpolator());
            this.A03.startAnimation(translateAnimation4);
            TranslateAnimation translateAnimation5 = new TranslateAnimation(1, ((ActivityC02310Ar) this).A01.A0M() ? 1.0f : -1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation5.setDuration(200L);
            translateAnimation5.setInterpolator(new DecelerateInterpolator());
            this.A04.startAnimation(translateAnimation5);
        }
        this.A03.setVisibility(8);
        this.A04.setVisibility(0);
        this.A09.setText(R.string.tos_title_screen_2);
        this.A07.setText(R.string.tos_agree_now);
        this.A07.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_3(this, 3));
        if (this.A01.getVisibility() != 0) {
            TranslateAnimation translateAnimation6 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            translateAnimation6.setDuration(200L);
            translateAnimation6.setInterpolator(new DecelerateInterpolator());
            this.A01.startAnimation(translateAnimation6);
        }
        this.A01.setVisibility(0);
        this.A06.setImageDrawable(new C50502Sa(C02160Ac.A00(this, R.color.tos_indicator_dark)));
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.A0D) {
            super.finish();
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (this.A00 != 1) {
            super.onBackPressed();
            return;
        }
        this.A00 = 0;
        A1P();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View findViewById = findViewById(R.id.main_layout);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C3ZN(this, findViewById));
    }

    @Override // X.AbstractActivityC49572Le, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        ((ActivityC02270An) this).A0I = false;
        ((ActivityC02270An) this).A0H = false;
        super.onCreate(bundle);
        setContentView(R.layout.tos_update);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.text_1);
        this.A0A = textEmojiLabel;
        C000200d.A0b(textEmojiLabel);
        TextEmojiLabel textEmojiLabel2 = this.A0A;
        textEmojiLabel2.setAccessibilityHelper(new C02780Cv(((ActivityC02290Ap) this).A0E, textEmojiLabel2));
        TextEmojiLabel textEmojiLabel3 = (TextEmojiLabel) findViewById(R.id.text_2);
        textEmojiLabel3.A07 = new C02770Cu();
        textEmojiLabel3.setAccessibilityHelper(new C02780Cv(((ActivityC02290Ap) this).A0E, textEmojiLabel3));
        textEmojiLabel3.setText(this.A0B.A01(this, getString(R.string.tos_text_screen_2)));
        TextView textView = (TextView) findViewById(R.id.not_now);
        this.A08 = textView;
        C003301p.A06(textView);
        this.A08.setBackground(new C50502Sa(C02160Ac.A02(this, R.color.selector_gray_button)));
        if (((ActivityC02310Ar) this).A01.A0M()) {
            this.A08.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_close, 0, 0, 0);
        } else {
            this.A08.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_close, 0);
        }
        TextView textView2 = (TextView) findViewById(R.id.action);
        this.A07 = textView2;
        C003301p.A06(textView2);
        this.A07.setBackground(new C50502Sa(C02160Ac.A02(this, R.color.selector_green_button)));
        TextView textView3 = (TextView) findViewById(R.id.title);
        this.A09 = textView3;
        C003301p.A06(textView3);
        this.A06 = (ImageView) findViewById(R.id.indicator_1);
        ((ImageView) findViewById(R.id.indicator_2)).setImageDrawable(new C50502Sa(C02160Ac.A00(this, R.color.tos_indicator_light)));
        this.A03 = findViewById(R.id.screen_1);
        this.A04 = findViewById(R.id.screen_2);
        this.A01 = findViewById(R.id.age_consent_container);
        this.A05 = (CheckBox) findViewById(R.id.age_consent);
        View findViewById = findViewById(R.id.age_tip);
        this.A02 = findViewById;
        findViewById.setBackground(new C0We(((ActivityC02310Ar) this).A01, getResources().getDrawable(R.drawable.ic_tooltip_red)));
        this.A05.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: X.3ZM
            {
                TosUpdateActivity.this = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                TosUpdateActivity tosUpdateActivity = TosUpdateActivity.this;
                if (tosUpdateActivity.A02.getVisibility() != 8) {
                    tosUpdateActivity.A02.startAnimation(C000200d.A03(1.0f, 0.0f, 200L));
                    tosUpdateActivity.A02.setVisibility(8);
                }
            }
        });
        this.A04.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: X.3ZL
            {
                TosUpdateActivity.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                TosUpdateActivity tosUpdateActivity = TosUpdateActivity.this;
                if (tosUpdateActivity.A02.getVisibility() != 8) {
                    tosUpdateActivity.A02.startAnimation(C000200d.A03(1.0f, 0.0f, 200L));
                    tosUpdateActivity.A02.setVisibility(8);
                }
            }
        });
        View findViewById2 = findViewById(R.id.main_layout);
        findViewById2.getViewTreeObserver().addOnGlobalLayoutListener(new C3ZN(this, findViewById2));
        A1P();
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        long j;
        String A0C;
        super.onResume();
        int A02 = ((ActivityC02270An) this).A0E.A02();
        if (A02 == 0) {
            this.A0D = true;
            finish();
        } else if (A02 == 1) {
            this.A08.setVisibility(0);
            this.A08.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_3(this, 4));
            C03070Ea c03070Ea = ((ActivityC02270An) this).A0E;
            synchronized (c03070Ea) {
                C000500h c000500h = c03070Ea.A02;
                j = 0;
                if (c000500h.A09() == 0 && C01C.A05()) {
                    SharedPreferences sharedPreferences = c000500h.A00;
                    StringBuilder sb = new StringBuilder("tos_v2_stage_start_time");
                    sb.append(1);
                    j = c03070Ea.A00.A08(1) + sharedPreferences.getLong(sb.toString(), 0L);
                }
            }
            if ("sl".equals(((ActivityC02310Ar) this).A01.A04())) {
                A0C = C002501g.A0I(((ActivityC02310Ar) this).A01, 1).format(new Date(j));
            } else {
                A0C = C002501g.A0C(((ActivityC02310Ar) this).A01, j);
            }
            this.A0A.setText(this.A0B.A01(this, getString(R.string.tos_text_screen_1, ((ActivityC02310Ar) this).A01.A0E(A0C))));
        } else {
            this.A08.setVisibility(4);
            View findViewById = findViewById(R.id.screen_2_frame);
            findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop() / 3, findViewById.getPaddingRight(), findViewById.getPaddingBottom());
            this.A0A.setText(this.A0B.A01(this, getString(R.string.tos_text_screen_1_expired)));
        }
    }
}
