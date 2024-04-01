package com.whatsapp.support.faq;

import X.C01B;
import X.C01C;
import X.C02180Ae;
import X.C2QJ;
import X.C49622Lq;
import X.C72153Yw;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.support.faq.FaqItemActivity;

/* loaded from: classes2.dex */
public class FaqItemActivity extends C2QJ {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public C01B A04;
    public C49622Lq A05;
    public C72153Yw A06;

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        long currentTimeMillis = System.currentTimeMillis();
        this.A01 = currentTimeMillis;
        this.A03 = (currentTimeMillis - this.A02) + this.A03;
        this.A02 = System.currentTimeMillis();
        setResult(-1, new Intent().putExtra("article_id", this.A00).putExtra("total_time_spent", this.A03));
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C72153Yw c72153Yw = this.A06;
        if (c72153Yw != null) {
            c72153Yw.A00();
        }
    }

    @Override // X.C2QJ, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.search_help_center);
        A0c().A0L(true);
        setContentView(R.layout.faq_item);
        A0c().A0H(getIntent().getStringExtra("title"));
        String stringExtra = getIntent().getStringExtra("content");
        String stringExtra2 = getIntent().getStringExtra("url");
        WebView webView = (WebView) findViewById(R.id.web_view);
        webView.loadDataWithBaseURL(stringExtra2, stringExtra, "text/html", "UTF-8", null);
        this.A00 = getIntent().getLongExtra("article_id", -1L);
        this.A03 = 0L;
        String stringExtra3 = getIntent().getStringExtra("contact_us_context");
        if (getIntent().getBooleanExtra("show_contact_support_button", false)) {
            if (C02180Ae.A1Y(stringExtra3) && this.A04.A0E(C01C.A1o)) {
                return;
            }
            String stringExtra4 = getIntent().getStringExtra("contact_us_context");
            View findViewById = findViewById(R.id.bottom_button_container);
            final RunnableEBaseShape0S1100000_I0 runnableEBaseShape0S1100000_I0 = new RunnableEBaseShape0S1100000_I0(this, stringExtra4, 24);
            C72153Yw c72153Yw = new C72153Yw(webView, findViewById, getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation));
            this.A06 = c72153Yw;
            c72153Yw.A02(this, (TextView) findViewById(R.id.does_not_match_button), getString(R.string.does_not_match_button), new ClickableSpan() { // from class: X.3Yx
                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    runnableEBaseShape0S1100000_I0.run();
                }
            }, R.style.FaqInlineLink);
            this.A06.A01.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(runnableEBaseShape0S1100000_I0, 36));
            webView.setWebViewClient(new WebViewClient() { // from class: X.3Yy
                {
                    FaqItemActivity.this = this;
                }

                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView2, String str) {
                    FaqItemActivity.this.A06.A00();
                }
            });
            findViewById.setVisibility(0);
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        long currentTimeMillis = System.currentTimeMillis();
        this.A01 = currentTimeMillis;
        this.A03 = (currentTimeMillis - this.A02) + this.A03;
        this.A02 = System.currentTimeMillis();
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        this.A02 = System.currentTimeMillis();
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        super.onStop();
        long currentTimeMillis = System.currentTimeMillis();
        this.A01 = currentTimeMillis;
        this.A03 = (currentTimeMillis - this.A02) + this.A03;
        this.A02 = System.currentTimeMillis();
        setResult(-1, new Intent().putExtra("article_id", this.A00).putExtra("total_time_spent", this.A03));
    }
}
