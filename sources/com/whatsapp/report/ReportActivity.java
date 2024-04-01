package com.whatsapp.report;

import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.AnonymousClass012;
import X.C000200d;
import X.C002301c;
import X.C002501g;
import X.C003701t;
import X.C005102h;
import X.C00A;
import X.C00T;
import X.C02590Ca;
import X.C02740Cr;
import X.C02770Cu;
import X.C02780Cv;
import X.C02E;
import X.C04260Jm;
import X.C04P;
import X.C05Y;
import X.C0EG;
import X.C2EE;
import X.C2EF;
import X.C3VV;
import X.C40071rX;
import X.C47392Ba;
import X.C53772hU;
import X.C53882hf;
import X.C53892hg;
import X.C53922hj;
import X.C80073mg;
import X.InterfaceC002901k;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.report.ReportActivity;
import java.util.Date;

/* loaded from: classes2.dex */
public class ReportActivity extends C2EE implements C2EF {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ImageView A06;
    public ImageView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public TextEmojiLabel A0E;
    public TextEmojiLabel A0F;
    public C02E A0G;
    public AnonymousClass012 A0H;
    public C005102h A0I;
    public C002301c A0J;
    public C00A A0K;
    public C003701t A0L;
    public C0EG A0M;
    public BusinessActivityReportViewModel A0N;
    public C47392Ba A0O;
    public C53882hf A0P;
    public C80073mg A0Q;
    public C53892hg A0R;
    public C40071rX A0S;
    public InterfaceC002901k A0T;
    public final C00T A0U = new C53772hU(this);

    public final String A1P() {
        long j;
        C47392Ba c47392Ba = this.A0O;
        synchronized (c47392Ba) {
            j = c47392Ba.A0D.A00.getLong("gdpr_report_expiration_timestamp", 0L);
        }
        if ("sl".equals(this.A0J.A04())) {
            return C002501g.A0I(this.A0J, 1).format(new Date(j));
        }
        return C002501g.A0C(this.A0J, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1Q() {
        /*
            Method dump skipped, instructions count: 800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.report.ReportActivity.A1Q():void");
    }

    public final void A1R(TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.A07 = new C02770Cu();
        textEmojiLabel.setAccessibilityHelper(new C02780Cv(this.A0G, textEmojiLabel));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(getString(R.string.gdpr_report_header, this.A0S.A03("general", "26000110", null).toString())));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                spannableStringBuilder.setSpan(new C02740Cr(this, ((ActivityC02290Ap) this).A0A, this.A0G, ((ActivityC02270An) this).A01, uRLSpan.getURL()), spanStart, spanEnd, spanFlags);
                spannableStringBuilder.setSpan(new TextAppearanceSpan(this, R.style.SettingsInlineLink), spanStart, spanEnd, spanFlags);
            }
            for (URLSpan uRLSpan2 : uRLSpanArr) {
                spannableStringBuilder.removeSpan(uRLSpan2);
            }
        }
        textEmojiLabel.setText(spannableStringBuilder);
    }

    public void lambda$initGdprViews$2237$ReportActivity(View view) {
        if (((ActivityC02290Ap) this).A0A.A0J()) {
            DeleteReportConfirmationDialogFragment deleteReportConfirmationDialogFragment = new DeleteReportConfirmationDialogFragment();
            deleteReportConfirmationDialogFragment.A01 = new C3VV() { // from class: X.3mW
                {
                    ReportActivity.this = this;
                }

                @Override // X.C3VV
                public final void A76() {
                    ReportActivity reportActivity = ReportActivity.this;
                    if (((ActivityC02290Ap) reportActivity).A0A.A0J()) {
                        if (reportActivity.A0P != null) {
                            reportActivity.A0P = null;
                        }
                        C53882hf c53882hf = new C53882hf(reportActivity, ((ActivityC02290Ap) reportActivity).A0A, reportActivity);
                        reportActivity.A0P = c53882hf;
                        reportActivity.A0T.ARy(c53882hf, new Void[0]);
                    }
                }
            };
            AUg(deleteReportConfirmationDialogFragment, null);
        }
    }

    public void lambda$p2bReportNoneState$2238$ReportActivity(View view) {
        BusinessActivityReportViewModel businessActivityReportViewModel = this.A0N;
        if (businessActivityReportViewModel.A03.A0J()) {
            boolean z = true;
            businessActivityReportViewModel.A01.A0B(1);
            C53922hj c53922hj = businessActivityReportViewModel.A0D;
            if (c53922hj.A03.A05()) {
                C05Y c05y = c53922hj.A04;
                String A02 = c05y.A02();
                c05y.A07(267, A02, new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("xmlns", "urn:xmpp:whatsapp:account", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("id", A02, null, (byte) 0)}, new C02590Ca("p2b", new C04P[]{new C04P("action", "request", null, (byte) 0)}, null, null)), c53922hj, 32000L);
            } else {
                z = false;
            }
            C000200d.A1C("app/sendRequestReport success:", z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0321, code lost:
        com.whatsapp.util.Log.e("BusinessActivityReportManager/validate-state/report-message-missing");
        r10.A07.A0O();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e9 A[Catch: all -> 0x0348, TryCatch #0 {, blocks: (B:138:0x02ab, B:142:0x02b6, B:144:0x02c2, B:151:0x02db, B:153:0x02e9, B:155:0x02f3, B:157:0x02fb, B:149:0x02d5, B:160:0x0321, B:158:0x031b, B:163:0x032d), top: B:185:0x02ab }] */
    /* JADX WARN: Type inference failed for: r2v10, types: [X.0HS, X.3mg] */
    @Override // X.C2EE, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 991
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.report.ReportActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C80073mg c80073mg = this.A0Q;
        if (c80073mg != null) {
            c80073mg.A05(true);
        }
        C53892hg c53892hg = this.A0R;
        if (c53892hg != null) {
            c53892hg.A05(true);
        }
        C53882hf c53882hf = this.A0P;
        if (c53882hf != null) {
            c53882hf.A05(true);
        }
        this.A0K.A00(this.A0U);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        this.A0I.A05(null, 16);
        this.A0I.A05(null, 32);
    }
}
