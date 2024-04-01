package com.whatsapp;

import X.C000200d;
import X.C018308n;
import X.C0QU;
import X.C40071rX;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.HomeActivity;
import com.whatsapp.SpamWarningActivity;

/* loaded from: classes.dex */
public class SpamWarningActivity extends C0QU {
    public static ConditionVariable A02 = new ConditionVariable(false);
    public int A00;
    public C40071rX A01;

    public /* synthetic */ void A1P(String str) {
        if (str == null || str.isEmpty()) {
            startActivity(new Intent("android.intent.action.VIEW", this.A01.A01(null)));
        } else {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        C018308n.A03(this);
    }

    @Override // X.C0QU, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(R.layout.activity_spam_warning);
        setTitle(R.string.spam_title);
        int intExtra = getIntent().getIntExtra("spam_warning_reason_key", 100);
        this.A00 = getIntent().getIntExtra("expiry_in_seconds", -1);
        String stringExtra = getIntent().getStringExtra("spam_warning_message_key");
        final String stringExtra2 = getIntent().getStringExtra("faq_url_key");
        C000200d.A1F(C000200d.A0Q("SpamWarningActivity started with code ", intExtra, " and expiry (in seconds) "), this.A00);
        switch (intExtra) {
            case 101:
                i = R.string.spam_too_many_messages;
                break;
            case 102:
                i = R.string.spam_too_many_blocks;
                break;
            case 103:
                i = R.string.spam_too_many_groups;
                break;
            case 104:
                i = R.string.spam_too_many_people;
                break;
            case 105:
            default:
                int i2 = this.A00;
                i = R.string.spam_generic;
                if (i2 == -1) {
                    i = R.string.spam_generic_unknown_time_left;
                    break;
                }
                break;
            case 106:
                i = R.string.spam_too_many_messages_broadcasted;
                break;
        }
        findViewById(R.id.btn_spam_warning_learn_more).setOnClickListener(new View.OnClickListener() { // from class: X.1Ie
            {
                SpamWarningActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpamWarningActivity.this.A1P(stringExtra2);
            }
        });
        TextView textView = (TextView) findViewById(R.id.spam_warning_info_textview);
        if (stringExtra != null && !stringExtra.isEmpty()) {
            textView.setText(stringExtra);
        } else {
            textView.setText(i);
        }
        if (this.A00 == -1) {
            findViewById(R.id.progress_bar).setVisibility(8);
            new Thread() { // from class: X.1LC
                {
                    SpamWarningActivity.this = this;
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    SpamWarningActivity.A02.block();
                    SpamWarningActivity spamWarningActivity = SpamWarningActivity.this;
                    spamWarningActivity.startActivity(new Intent(null, null, spamWarningActivity, HomeActivity.class));
                    spamWarningActivity.finish();
                }
            }.start();
            return;
        }
        findViewById(R.id.spam_warning_generic_data_connection_missing_textview).setVisibility(8);
        final CircularProgressBar circularProgressBar = (CircularProgressBar) findViewById(R.id.progress_bar);
        circularProgressBar.setVisibility(0);
        circularProgressBar.A0G = true;
        circularProgressBar.setMax(this.A00 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        new CountDownTimer(this.A00 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS) { // from class: X.1LB
            {
                SpamWarningActivity.this = this;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                SpamWarningActivity.this.finish();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                int i3 = (int) j;
                int i4 = i3 / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
                SpamWarningActivity spamWarningActivity = SpamWarningActivity.this;
                CircularProgressBar circularProgressBar2 = circularProgressBar;
                circularProgressBar2.setCenterText(AnonymousClass029.A0g(((ActivityC02310Ar) spamWarningActivity).A01, i4));
                circularProgressBar2.setProgress(i3);
            }
        }.start();
    }
}
