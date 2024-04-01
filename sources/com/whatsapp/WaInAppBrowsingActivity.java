package com.whatsapp;

import X.ActivityC02310Ar;
import X.C019208x;
import X.C019308y;
import X.C02160Ac;
import X.C02180Ae;
import X.C0U1;
import X.C0WF;
import X.C0We;
import X.DialogInterfaceC019408z;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.webkit.CookieManager;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaInAppBrowsingActivity;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;

/* loaded from: classes.dex */
public class WaInAppBrowsingActivity extends C0WF {
    public WebView A00;
    public ProgressBar A01;
    public DialogInterfaceC019408z A02;
    public String A03;

    public static void A00(WaInAppBrowsingActivity waInAppBrowsingActivity, String str) {
        if (waInAppBrowsingActivity.A0c() != null && str != null && !"about:blank".equals(str) && !waInAppBrowsingActivity.getIntent().getBooleanExtra("webview_hide_url", false)) {
            TextView textView = (TextView) waInAppBrowsingActivity.findViewById(R.id.website_url);
            textView.setText(str);
            TextView textView2 = (TextView) waInAppBrowsingActivity.findViewById(R.id.website_title);
            if (TextUtils.isEmpty(str)) {
                textView2.setTextColor(C02160Ac.A00(waInAppBrowsingActivity, R.color.secondary_text));
                textView2.setTypeface(null, 0);
                textView.setVisibility(8);
                return;
            }
            textView2.setTextColor(C02160Ac.A00(waInAppBrowsingActivity, R.color.primary_text));
            textView2.setTypeface(null, 1);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            textView.setVisibility(0);
            alphaAnimation.setDuration(300L);
            textView.startAnimation(alphaAnimation);
        }
    }

    public final void A1P(String str) {
        if (A0c() != null) {
            String stringExtra = getIntent().getStringExtra("webview_title");
            TextView textView = (TextView) findViewById(R.id.website_title);
            if (!TextUtils.isEmpty(stringExtra)) {
                textView.setText(stringExtra);
            } else if (TextUtils.isEmpty(str)) {
            } else {
                textView.setText(str);
            }
        }
    }

    public void A1Q(String str, final boolean z) {
        if (this.A02 == null) {
            C019208x c019208x = new C019208x(this);
            C019308y c019308y = c019208x.A01;
            c019308y.A0E = str;
            c019308y.A0J = false;
            c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.1Jg
                {
                    WaInAppBrowsingActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    WaInAppBrowsingActivity waInAppBrowsingActivity = WaInAppBrowsingActivity.this;
                    boolean z2 = z;
                    dialogInterface.dismiss();
                    if (z2) {
                        waInAppBrowsingActivity.setResult(0, waInAppBrowsingActivity.getIntent());
                        waInAppBrowsingActivity.finish();
                    }
                }
            });
            this.A02 = c019208x.A01();
        }
    }

    public boolean A1R(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.A03) || !str.contains(this.A03)) {
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("webview_callback", str);
        setResult(-1, intent);
        finish();
        return true;
    }

    public /* synthetic */ void lambda$onCreate$962$WaInAppBrowsingActivity(View view) {
        onBackPressed();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        setResult(0, getIntent());
        super.onBackPressed();
    }

    @Override // X.C0WF, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.inapp_browsing);
        this.A03 = getIntent().getStringExtra("webview_callback");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        A0k(toolbar);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            C0We c0We = new C0We(((ActivityC02310Ar) this).A01, C02160Ac.A03(this, R.drawable.ic_back));
            c0We.setColorFilter(getResources().getColor(R.color.dark_gray), PorterDuff.Mode.SRC_ATOP);
            toolbar.setNavigationIcon(c0We);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: X.1Jf
                {
                    WaInAppBrowsingActivity.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WaInAppBrowsingActivity.this.onBackPressed();
                }
            });
            ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar_page_progress);
            this.A01 = progressBar;
            C02180Ae.A18(progressBar, R.color.webview_progress_foreground);
        }
        WebView webView = (WebView) findViewById(R.id.web_view);
        this.A00 = webView;
        webView.getSettings().setAllowContentAccess(false);
        this.A00.getSettings().setAllowFileAccess(false);
        this.A00.getSettings().setJavaScriptEnabled(getIntent().getBooleanExtra("webview_javascript_enabled", false));
        this.A00.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        this.A00.getSettings().setGeolocationEnabled(false);
        this.A00.clearCache(true);
        this.A00.getSettings().setSaveFormData(false);
        this.A00.getSettings().setSupportMultipleWindows(false);
        CookieManager.getInstance().setAcceptCookie(false);
        if (Build.VERSION.SDK_INT < 18) {
            this.A00.getSettings().setPluginState(WebSettings.PluginState.OFF);
            this.A00.getSettings().setSavePassword(false);
        }
        this.A00.getSettings().setAllowFileAccessFromFileURLs(false);
        this.A00.getSettings().setAllowUniversalAccessFromFileURLs(false);
        this.A00.setWebViewClient(new WebViewClient() { // from class: X.1La
            {
                WaInAppBrowsingActivity.this = this;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                super.onPageFinished(webView2, str);
                if (webView2 != null) {
                    WaInAppBrowsingActivity waInAppBrowsingActivity = WaInAppBrowsingActivity.this;
                    WaInAppBrowsingActivity.A00(waInAppBrowsingActivity, webView2.getUrl());
                    if ("about:blank".equals(webView2.getTitle())) {
                        return;
                    }
                    waInAppBrowsingActivity.A1P(webView2.getTitle());
                }
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView2, int i, String str, String str2) {
                StringBuilder sb = new StringBuilder("WaInappBrowsingActivity/onReceivedError: Error loading the page ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str);
                Log.e(sb.toString());
                WaInAppBrowsingActivity waInAppBrowsingActivity = WaInAppBrowsingActivity.this;
                waInAppBrowsingActivity.A00.loadUrl("about:blank");
                waInAppBrowsingActivity.A1Q(waInAppBrowsingActivity.getString(R.string.webview_error_not_available), true);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                onReceivedError(webView2, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedSslError(WebView webView2, SslErrorHandler sslErrorHandler, SslError sslError) {
                StringBuilder A0P = C000200d.A0P("WaInappBrowsingActivity/onReceivedSslError: SSL Error while loading the page: ");
                A0P.append(sslError.getUrl());
                A0P.append(": Code ");
                A0P.append(sslError.getPrimaryError());
                Log.e(A0P.toString());
                sslErrorHandler.cancel();
                webView2.stopLoading();
                WaInAppBrowsingActivity waInAppBrowsingActivity = WaInAppBrowsingActivity.this;
                waInAppBrowsingActivity.A1Q(waInAppBrowsingActivity.getString(R.string.webview_error_not_trusted), true);
            }

            @Override // android.webkit.WebViewClient
            public void onSafeBrowsingHit(WebView webView2, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
                super.onSafeBrowsingHit(webView2, webResourceRequest, i, safeBrowsingResponse);
                StringBuilder A0P = C000200d.A0P("WaInappBrowsingActivity/onSafeBrowsingHit: Unsafe page hit: ");
                A0P.append(webView2.getUrl());
                Log.e(A0P.toString());
                WaInAppBrowsingActivity waInAppBrowsingActivity = WaInAppBrowsingActivity.this;
                waInAppBrowsingActivity.setResult(0, waInAppBrowsingActivity.getIntent());
                waInAppBrowsingActivity.finish();
            }

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView2, WebResourceRequest webResourceRequest) {
                return shouldInterceptRequest(webView2, webResourceRequest.getUrl().toString());
            }

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView2, String str) {
                if (URLUtil.isHttpsUrl(str)) {
                    return super.shouldInterceptRequest(webView2, str);
                }
                StringBuilder sb = new StringBuilder("WaInappBrowsingActivity/shouldInterceptRequest: Cannot open resource trough a not encrypted channel: ");
                sb.append(str);
                Log.e(sb.toString());
                return new WebResourceResponse("application/octet-stream", "utf-8", new ByteArrayInputStream("".getBytes()));
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
                return shouldOverrideUrlLoading(webView2, webResourceRequest.getUrl().toString());
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                WaInAppBrowsingActivity waInAppBrowsingActivity = WaInAppBrowsingActivity.this;
                if (waInAppBrowsingActivity.A1R(str)) {
                    return true;
                }
                try {
                    if (URLUtil.isHttpsUrl(str)) {
                        Uri parse = Uri.parse(waInAppBrowsingActivity.A00.getUrl());
                        Uri parse2 = Uri.parse(str);
                        boolean booleanExtra = waInAppBrowsingActivity.getIntent().getBooleanExtra("webview_avoid_external", false);
                        if (parse != null && booleanExtra) {
                            StringBuilder sb = new StringBuilder("WaInappBrowsingActivity/checkUrl: Tried to open external link when blocked: ");
                            sb.append(str);
                            Log.e(sb.toString());
                            C000700j.A0A(parse.getHost().equals(parse2.getHost()), waInAppBrowsingActivity.getString(R.string.webview_error_external_browsing_blocked));
                        }
                        waInAppBrowsingActivity.A1P(waInAppBrowsingActivity.getString(R.string.webview_loading));
                        WaInAppBrowsingActivity.A00(waInAppBrowsingActivity, "");
                        return false;
                    }
                    StringBuilder sb2 = new StringBuilder("WaInappBrowsingActivity/checkUrl: Tried to open non-HTTPS content on ");
                    sb2.append(str);
                    Log.e(sb2.toString());
                    throw new IllegalArgumentException(waInAppBrowsingActivity.getString(R.string.webview_error_not_https));
                } catch (IllegalArgumentException | IllegalStateException e) {
                    waInAppBrowsingActivity.A1Q(e.getMessage(), false);
                    return true;
                }
            }
        });
        this.A00.setWebChromeClient(new WebChromeClient() { // from class: X.1LZ
            {
                WaInAppBrowsingActivity.this = this;
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView2, int i) {
                WaInAppBrowsingActivity waInAppBrowsingActivity = WaInAppBrowsingActivity.this;
                waInAppBrowsingActivity.A01.setVisibility(i == 100 ? 8 : 0);
                waInAppBrowsingActivity.A01.setProgress(i);
            }
        });
        getWindow().setFlags(8192, 8192);
        if (Build.VERSION.SDK_INT >= 27) {
            WebView.startSafeBrowsing(this, new ValueCallback() { // from class: X.1Jh
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    Log.e("WaInappBrowsingActivity/onCreate: Safe browsing not allowed");
                }
            });
        }
        A1P(getString(R.string.webview_loading));
        String stringExtra = getIntent().getStringExtra("webview_url");
        if (!A1R(stringExtra)) {
            if (!getIntent().getBooleanExtra("webview_post_on_initial_request", false)) {
                this.A00.loadUrl(stringExtra);
                return;
            }
            String stringExtra2 = getIntent().getStringExtra("webview_initial_body_params");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.A00.postUrl(stringExtra, stringExtra2.getBytes());
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.A00;
        if (webView != null) {
            webView.onPause();
            this.A00.loadUrl("about:blank");
            this.A00.clearHistory();
            this.A00.clearCache(true);
            this.A00.removeAllViews();
            this.A00.destroyDrawingCache();
            this.A00 = null;
        }
    }
}
