package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.inappsupport.ui.SupportTopicsActivity;
import com.whatsapp.support.faq.FaqItemActivity;
import com.whatsapp.support.faq.SearchFAQ;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.3i8  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C77393i8 extends C0HS {
    public ProgressDialog A00;
    public final Bundle A01;
    public final C01B A02;
    public final C002301c A03;
    public final C0N2 A04;
    public final AnonymousClass093 A05;
    public final C41451tw A06;
    public final C018808t A07;
    public final C0GR A08;
    public final C014406v A09 = C014406v.A00("PaymentSupportTask", "payment-settings", "COMMON");
    public final String A0A;
    public final WeakReference A0B;

    public C77393i8(ActivityC02290Ap activityC02290Ap, C01B c01b, C002301c c002301c, C018808t c018808t, C41451tw c41451tw, C0GR c0gr, String str, C0N2 c0n2, AnonymousClass093 anonymousClass093, Bundle bundle) {
        this.A0B = new WeakReference(activityC02290Ap);
        this.A02 = c01b;
        this.A03 = c002301c;
        this.A07 = c018808t;
        this.A06 = c41451tw;
        this.A08 = c0gr;
        this.A0A = str;
        this.A04 = c0n2;
        this.A05 = anonymousClass093;
        this.A01 = bundle;
    }

    @Override // X.C0HS
    public void A06() {
        Context context = (Context) this.A0B.get();
        if (context == null) {
            return;
        }
        if (this.A00 == null) {
            ProgressDialog progressDialog = new ProgressDialog(context);
            this.A00 = progressDialog;
            progressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: X.3Nm
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    C77393i8.this.A05(true);
                }
            });
            this.A00.setCanceledOnTouchOutside(false);
        }
        if (this.A00.isShowing()) {
            return;
        }
        this.A00.setMessage(context.getString(R.string.help_loading_progress_label));
        this.A00.setIndeterminate(true);
        this.A00.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0193, code lost:
        if (r4 == 421) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ab A[Catch: IOException -> 0x0310, IOException | JSONException -> 0x0312, TryCatch #8 {IOException | JSONException -> 0x0312, blocks: (B:4:0x000a, B:6:0x0021, B:7:0x0027, B:9:0x002d, B:10:0x0032, B:12:0x0054, B:14:0x005c, B:15:0x0063, B:148:0x01a5, B:150:0x01ab, B:151:0x01b0, B:153:0x01b4, B:155:0x01bc, B:156:0x01c3, B:157:0x01c8, B:190:0x02f6, B:201:0x030f), top: B:216:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b4 A[Catch: IOException -> 0x0310, IOException | JSONException -> 0x0312, TryCatch #8 {IOException | JSONException -> 0x0312, blocks: (B:4:0x000a, B:6:0x0021, B:7:0x0027, B:9:0x002d, B:10:0x0032, B:12:0x0054, B:14:0x005c, B:15:0x0063, B:148:0x01a5, B:150:0x01ab, B:151:0x01b0, B:153:0x01b4, B:155:0x01bc, B:156:0x01c3, B:157:0x01c8, B:190:0x02f6, B:201:0x030f), top: B:216:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02b0 A[Catch: all -> 0x02fe, TryCatch #3 {all -> 0x0305, blocks: (B:159:0x01fe, B:189:0x02f3, B:160:0x020e, B:163:0x021d, B:164:0x0225, B:166:0x0242, B:168:0x024f, B:169:0x0253, B:171:0x0263, B:173:0x026d, B:176:0x0276, B:178:0x027c, B:180:0x02a8, B:182:0x02b0, B:183:0x02b8, B:185:0x02c0, B:186:0x02ea), top: B:210:0x01fe }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02c0 A[Catch: all -> 0x02fe, TryCatch #3 {all -> 0x0305, blocks: (B:159:0x01fe, B:189:0x02f3, B:160:0x020e, B:163:0x021d, B:164:0x0225, B:166:0x0242, B:168:0x024f, B:169:0x0253, B:171:0x0263, B:173:0x026d, B:176:0x0276, B:178:0x027c, B:180:0x02a8, B:182:0x02b0, B:183:0x02b8, B:185:0x02c0, B:186:0x02ea), top: B:210:0x01fe }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02f0  */
    /* JADX WARN: Type inference failed for: r0v34, types: [X.3Nq] */
    @Override // X.C0HS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A07(java.lang.Object[] r27) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77393i8.A07(java.lang.Object[]):java.lang.Object");
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C69233Nq c69233Nq = (C69233Nq) obj;
        ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) this.A0B.get();
        if (activityC02290Ap != null) {
            if (c69233Nq != null) {
                C69223Np c69223Np = c69233Nq.A00;
                if (c69223Np != null) {
                    Intent intent = new Intent(activityC02290Ap, FaqItemActivity.class);
                    intent.putExtra("title", c69223Np.A02);
                    intent.putExtra("content", c69223Np.A00);
                    intent.putExtra("url", c69223Np.A03);
                    intent.putExtra("article_id", c69223Np.A01);
                    boolean z = c69223Np.A04;
                    intent.putExtra("show_contact_support_button", z);
                    intent.putExtra("contact_us_context", this.A0A);
                    if (z) {
                        intent.putParcelableArrayListExtra("payments_support_topics", c69233Nq.A02);
                    }
                    Bundle bundle = this.A01;
                    bundle.putInt("com.whatsapp.support.DescribeProblemActivity.type", 3);
                    intent.putExtra("describe_problem_fields", bundle);
                    activityC02290Ap.A15(intent, 48);
                    activityC02290Ap.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                } else {
                    ArrayList arrayList = c69233Nq.A01;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        String str = this.A0A;
                        Bundle bundle2 = this.A01;
                        Serializable serializable = c69233Nq.A02;
                        Intent intent2 = new Intent(activityC02290Ap, SearchFAQ.class);
                        intent2.putExtra("com.whatsapp.support.faq.SearchFAQ.from", str);
                        intent2.putExtra("com.whatsapp.support.faq.SearchFAQ.count", arrayList.size());
                        intent2.putExtra("describe_problem_bundle", bundle2);
                        intent2.putExtra("payments_support_faqs", arrayList);
                        intent2.putExtra("payments_support_topics", serializable);
                        intent2.putExtra("com.whatsapp.support.faq.SearchFAQ.usePaymentsFlow", true);
                        activityC02290Ap.A15(intent2, 48);
                    } else {
                        ArrayList arrayList2 = c69233Nq.A02;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            activityC02290Ap.A15(SupportTopicsActivity.A00(activityC02290Ap, arrayList2, this.A01), 48);
                        } else {
                            A0B(activityC02290Ap);
                        }
                    }
                }
            } else {
                A0B(activityC02290Ap);
            }
            ProgressDialog progressDialog = this.A00;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.A00.cancel();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r5.getBoolean("children_skippable") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
        if (r16 == 2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList A0A(org.json.JSONArray r15, int r16) {
        /*
            r14 = this;
            int r0 = r15.length()
            r12 = 0
            if (r0 != 0) goto L8
            return r12
        L8:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3 = 0
        Le:
            int r0 = r15.length()
            if (r3 >= r0) goto La8
            org.json.JSONObject r5 = r15.getJSONObject(r3)
            java.lang.String r0 = "id"
            java.lang.String r7 = r5.getString(r0)
            java.lang.String r0 = "title"
            java.lang.String r8 = r5.getString(r0)
            java.lang.String r1 = "children"
            boolean r0 = r5.has(r1)
            r6 = r16
            if (r0 == 0) goto La6
            org.json.JSONArray r0 = r5.getJSONArray(r1)
            java.util.ArrayList r9 = r14.A0A(r0, r6)
        L36:
            java.lang.String r1 = "children_skippable"
            boolean r0 = r5.has(r1)
            if (r0 == 0) goto L45
            boolean r0 = r5.getBoolean(r1)
            r10 = 1
            if (r0 != 0) goto L46
        L45:
            r10 = 0
        L46:
            r2 = 2
            if (r6 != r2) goto L8f
            java.lang.String r1 = "description"
            boolean r0 = r5.has(r1)
            if (r0 == 0) goto L8f
            java.lang.String r11 = r5.getString(r1)
        L55:
            java.lang.String r1 = "chat_support"
            boolean r0 = r5.has(r1)
            if (r0 == 0) goto L93
            org.json.JSONObject r6 = r5.getJSONObject(r1)
            java.lang.String r0 = "auth_required"
            boolean r5 = r6.getBoolean(r0)
            java.lang.String r1 = "required_data"
            boolean r0 = r6.has(r1)
            if (r0 == 0) goto L95
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            org.json.JSONArray r6 = r6.getJSONArray(r1)
            r1 = 0
        L79:
            int r0 = r6.length()
            if (r1 >= r0) goto L89
            java.lang.String r0 = r6.getString(r1)
            r2.add(r0)
            int r1 = r1 + 1
            goto L79
        L89:
            X.2wp r13 = new X.2wp
            r13.<init>(r5, r2)
            goto L9a
        L8f:
            r11 = r12
            if (r6 != r2) goto L93
            goto L55
        L93:
            r13 = r12
            goto L9a
        L95:
            X.2wp r13 = new X.2wp
            r13.<init>(r5, r12)
        L9a:
            X.2wr r6 = new X.2wr
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r4.add(r6)
            int r3 = r3 + 1
            goto Le
        La6:
            r9 = r12
            goto L36
        La8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77393i8.A0A(org.json.JSONArray, int):java.util.ArrayList");
    }

    public final void A0B(ActivityC02290Ap activityC02290Ap) {
        if (this.A02.A0E(C01C.A1o)) {
            activityC02290Ap.AUj(R.string.payments_cs_email_disabled);
            return;
        }
        C018808t c018808t = this.A07;
        String str = this.A0A;
        Bundle bundle = this.A01;
        Intent A09 = C002701i.A09(activityC02290Ap, c018808t, str, null, 3, null, null, bundle);
        A09.putExtras(bundle);
        activityC02290Ap.A15(A09, 48);
    }
}
