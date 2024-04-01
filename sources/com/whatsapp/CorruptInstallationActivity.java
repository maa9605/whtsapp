package com.whatsapp;

import X.AbstractActivityC06470Tj;
import X.C002701i;
import X.C018808t;
import X.C09I;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CorruptInstallationActivity;
import com.whatsapp.util.Log;

/* loaded from: classes.dex */
public class CorruptInstallationActivity extends AbstractActivityC06470Tj {
    public C09I A00;
    public C018808t A01;

    public /* synthetic */ void lambda$onCreate$2809$CorruptInstallationActivity(View view) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.whatsapp")));
    }

    public /* synthetic */ void lambda$onCreate$2810$CorruptInstallationActivity(View view) {
        startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:com.whatsapp")));
    }

    @Override // X.AbstractActivityC06470Tj, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_corrupt_installation);
        TextView textView = (TextView) findViewById(R.id.corrupt_installation_contact_support_textview);
        Spanned fromHtml = Html.fromHtml(getString(R.string.corrupt_installation_contact_support_prompt));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if ("contact-support".equals(uRLSpan.getURL())) {
                    Log.i("contact-support link found");
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new ClickableSpan(C002701i.A09(this, this.A01, "corrupt-install", null, null, null, null, null)) { // from class: X.3ZI
                        public final Intent A00;

                        {
                            this.A00 = r1;
                        }

                        @Override // android.text.style.ClickableSpan
                        public void onClick(View view) {
                            StringBuilder A0P = C000200d.A0P("activity-intent-span/go intent=");
                            Intent intent = this.A00;
                            A0P.append(intent);
                            Log.i(A0P.toString());
                            view.getContext().startActivity(intent);
                        }
                    }, spanStart, spanEnd, spanFlags);
                }
            }
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        if (this.A00.A02()) {
            View findViewById = findViewById(R.id.btn_play_store);
            View findViewById2 = findViewById(R.id.btn_uninstall);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: X.1GN
                {
                    CorruptInstallationActivity.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CorruptInstallationActivity.this.lambda$onCreate$2809$CorruptInstallationActivity(view);
                }
            });
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: X.1GO
                {
                    CorruptInstallationActivity.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CorruptInstallationActivity.this.lambda$onCreate$2810$CorruptInstallationActivity(view);
                }
            });
            findViewById(R.id.website_div).setVisibility(8);
            return;
        }
        TextView textView2 = (TextView) findViewById(R.id.corrupt_installation_description_website_distribution_textview);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setText(Html.fromHtml(getString(R.string.corrupt_installation_description_website_distribution, "https://www.whatsapp.com/android/")));
        findViewById(R.id.play_store_div).setVisibility(8);
    }
}
