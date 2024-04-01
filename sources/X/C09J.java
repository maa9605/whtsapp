package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: X.09J  reason: invalid class name */
/* loaded from: classes.dex */
public final class C09J extends C09K {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C018308n A01;
    public final /* synthetic */ C005002g A02;
    public final /* synthetic */ C09I A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09J(Activity activity, C002301c c002301c, Activity activity2, C005002g c005002g, C018308n c018308n, C09I c09i) {
        super(activity, c002301c, R.layout.software_too_old, true);
        this.A00 = activity2;
        this.A02 = c005002g;
        this.A01 = c018308n;
        this.A03 = c09i;
    }

    @Override // X.C09K, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DateFormat dateInstance = DateFormat.getDateInstance(2, super.A02.A0I());
        final Activity activity = this.A00;
        ((TextView) findViewById(R.id.software_too_old)).setText(Html.fromHtml(activity.getString(R.string.software_expired_get_from_play_with_date, activity.getString(R.string.localized_app_name), dateInstance.format(this.A02.A02()))));
        SpannableString spannableString = new SpannableString(Html.fromHtml(activity.getString(R.string.software_expired_current_date, dateInstance.format(new Date()), activity.getString(R.string.localized_app_name))));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if ("date-settings".equals(uRLSpan.getURL())) {
                    int spanStart = spannableString.getSpanStart(uRLSpan);
                    int spanEnd = spannableString.getSpanEnd(uRLSpan);
                    int spanFlags = spannableString.getSpanFlags(uRLSpan);
                    spannableString.removeSpan(uRLSpan);
                    spannableString.setSpan(new ClickableSpan() { // from class: X.1Kk
                        @Override // android.text.style.ClickableSpan
                        public void onClick(View view) {
                            Intent intent = new Intent("android.settings.DATE_SETTINGS");
                            C09J c09j = C09J.this;
                            c09j.A01.A06(c09j.A00, intent);
                        }
                    }, spanStart, spanEnd, spanFlags);
                }
            }
        }
        TextView textView = (TextView) findViewById(R.id.current_date);
        textView.setText(spannableString);
        textView.setMovementMethod(new LinkMovementMethod());
        final C09I c09i = this.A03;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.1H3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C09I c09i2 = C09I.this;
                Activity activity2 = activity;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(c09i2.A01());
                activity2.startActivity(intent);
                activity2.finish();
            }
        };
        findViewById(R.id.download).setOnClickListener(onClickListener);
        findViewById(R.id.update_whatsapp).setOnClickListener(onClickListener);
    }
}
