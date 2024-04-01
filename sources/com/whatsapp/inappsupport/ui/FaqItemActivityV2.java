package com.whatsapp.inappsupport.ui;

import X.ActivityC02310Ar;
import X.C02180Ae;
import X.C0VJ;
import X.C0We;
import X.C2OB;
import X.C72153Yw;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.inappsupport.ui.FaqItemActivityV2;

/* loaded from: classes2.dex */
public class FaqItemActivityV2 extends C2OB {
    public C72153Yw A00;
    public String A01;

    public /* synthetic */ void lambda$onCreate$1834$FaqItemActivityV2(View view) {
        onBackPressed();
    }

    public /* synthetic */ void lambda$onCreate$1835$FaqItemActivityV2(View view) {
        setResult(-1);
        finish();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C72153Yw c72153Yw = this.A00;
        if (c72153Yw != null) {
            c72153Yw.A00();
        }
    }

    @Override // X.C2OB, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String string = getString(R.string.settings_help);
        setTitle(string);
        setContentView(R.layout.faq_item_v2);
        Toolbar toolbar = (Toolbar) C0VJ.A0A(this, R.id.toolbar);
        toolbar.setNavigationIcon(new C0We(((ActivityC02310Ar) this).A01, C02180Ae.A0Q(getResources().getDrawable(R.drawable.ic_back_teal), getResources().getColor(R.color.lightActionBarItemDrawableTint))));
        toolbar.setTitle(string);
        toolbar.setNavigationOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 21));
        A0k(toolbar);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.html_content");
        String stringExtra2 = intent.getStringExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.url");
        WebView webView = (WebView) findViewById(R.id.faq_item_web_view);
        webView.loadDataWithBaseURL(stringExtra2, stringExtra, "text/html", "UTF-8", null);
        final View findViewById = findViewById(R.id.not_helpful_button_container);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.2wv
            {
                FaqItemActivityV2.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                View view = findViewById;
                int height = view.getHeight();
                View findViewById2 = FaqItemActivityV2.this.findViewById(R.id.faq_screen_content);
                findViewById2.setPadding(findViewById2.getPaddingLeft(), findViewById2.getPaddingTop(), findViewById2.getPaddingRight(), findViewById2.getPaddingBottom() + height);
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            }
        });
        this.A00 = new C72153Yw(webView, findViewById, getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation));
        webView.setWebViewClient(new WebViewClient() { // from class: X.2ww
            {
                FaqItemActivityV2.this = this;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                FaqItemActivityV2.this.A00.A00();
            }
        });
        this.A00.A01.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 22));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!TextUtils.isEmpty(getIntent().getStringExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.url"))) {
            this.A01 = getIntent().getStringExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.url");
            menu.add(0, R.id.menuitem_open_in_browser, 0, getString(R.string.faq_open_in_browser)).setShowAsAction(0);
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId == R.id.menuitem_open_in_browser) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.A01)));
            return true;
        } else {
            return false;
        }
    }
}
