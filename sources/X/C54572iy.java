package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.View;
import com.whatsapp.conversationslist.LeaveGroupsDialogFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.settings.SettingsPrivacy;
import com.whatsapp.support.ReportSpamDialogFragment;

/* renamed from: X.2iy */
/* loaded from: classes2.dex */
public class C54572iy {
    public C06C A00;
    public boolean A01;
    public final int A02 = 21;
    public final ActivityC02320As A03;
    public final C0B5 A04;
    public final C01B A05;
    public final C40261rr A06;
    public final AnonymousClass075 A07;
    public final C000500h A08;
    public final C05M A09;
    public final C0C8 A0A;
    public final C0EA A0B;
    public final C41711uO A0C;
    public final C41521u3 A0D;
    public final Runnable A0E;
    public final Runnable A0F;

    public C54572iy(C05M c05m, C01B c01b, C0EA c0ea, ActivityC02320As activityC02320As, C41521u3 c41521u3, C40261rr c40261rr, AnonymousClass075 anonymousClass075, C000500h c000500h, C41711uO c41711uO, C0C8 c0c8, C0B5 c0b5, Runnable runnable, Runnable runnable2) {
        this.A03 = activityC02320As;
        this.A09 = c05m;
        this.A05 = c01b;
        this.A0B = c0ea;
        this.A0D = c41521u3;
        this.A06 = c40261rr;
        this.A07 = anonymousClass075;
        this.A08 = c000500h;
        this.A0C = c41711uO;
        this.A0A = c0c8;
        this.A04 = c0b5;
        this.A0E = runnable;
        this.A0F = runnable2;
    }

    public SpannableStringBuilder A00(String str) {
        Spanned fromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if ("group-privacy-settings".equals(uRLSpan.getURL())) {
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new AbstractC02750Cs(this.A03) { // from class: X.3Jk
                        {
                            C54572iy.this = this;
                        }

                        @Override // X.InterfaceC02760Ct
                        public void onClick(View view) {
                            ActivityC02320As activityC02320As = C54572iy.this.A03;
                            Intent intent = new Intent(activityC02320As.getApplicationContext(), SettingsPrivacy.class);
                            intent.putExtra("target_setting", "privacy_groupadd");
                            activityC02320As.startActivity(intent);
                        }
                    }, spanStart, spanEnd, spanFlags);
                }
            }
        }
        return spannableStringBuilder;
    }

    public void A01() {
        Jid A03 = this.A00.A03(AbstractC005302j.class);
        if (A03 != null) {
            this.A0B.A04((AbstractC005302j) A03, this.A01, 5);
            this.A0E.run();
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x003a, code lost:
        if (r10.A00.A0B() == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02() {
        /*
            r10 = this;
            X.06C r1 = r10.A00
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r9 = r1.A03(r0)
            if (r9 == 0) goto L7e
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            X.01B r1 = r10.A05
            X.03B r0 = X.C01C.A0k
            boolean r3 = r1.A0E(r0)
            X.1rr r2 = r10.A06
            boolean r0 = r2.A0H(r9)
            r6 = 1
            if (r0 != 0) goto L75
            X.0EA r2 = r10.A0B
            boolean r1 = r10.A01
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A04(r9, r1, r0)
            boolean r0 = r10.A01
            if (r0 == 0) goto L72
            java.lang.String r8 = "triggered_block"
        L2f:
            r7 = r3 ^ 1
            if (r3 == 0) goto L3c
            X.06C r0 = r10.A00
            boolean r0 = r0.A0B()
            r5 = 1
            if (r0 != 0) goto L3d
        L3c:
            r5 = 0
        L3d:
            X.0B5 r4 = r10.A04
            com.whatsapp.blocklist.BlockConfirmationDialogFragment r3 = new com.whatsapp.blocklist.BlockConfirmationDialogFragment
            r3.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r1 = r9.getRawString()
            java.lang.String r0 = "jid"
            r2.putString(r0, r1)
            java.lang.String r0 = "entryPoint"
            r2.putString(r0, r8)
            java.lang.String r0 = "fromSpamPanel"
            r2.putBoolean(r0, r6)
            java.lang.String r0 = "showBlockReasons"
            r2.putBoolean(r0, r5)
            java.lang.String r0 = "showSuccessToast"
            r2.putBoolean(r0, r7)
            java.lang.String r0 = "showReportAndBlock"
            r2.putBoolean(r0, r6)
            r3.A0P(r2)
            r4.AUh(r3)
            return
        L72:
            java.lang.String r8 = "chat"
            goto L2f
        L75:
            X.0As r1 = r10.A03
            X.06C r0 = r10.A00
            r3 = r3 ^ r6
            r2.A09(r1, r0, r3)
            return
        L7e:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54572iy.A02():void");
    }

    public void A03() {
        Jid A03 = this.A00.A03(AbstractC005302j.class);
        if (A03 != null) {
            AbstractC005302j abstractC005302j = (AbstractC005302j) A03;
            C0EA c0ea = this.A0B;
            c0ea.A04(abstractC005302j, this.A01, 4);
            c0ea.A05.A00(abstractC005302j, 1);
            if (this.A09.A07(abstractC005302j) != null) {
                this.A0D.A01(9, abstractC005302j, 0L, 0);
            }
            this.A0F.run();
            return;
        }
        throw null;
    }

    public void A04() {
        Jid A03 = this.A00.A03(AbstractC005302j.class);
        if (A03 != null) {
            final AbstractC005302j abstractC005302j = (AbstractC005302j) A03;
            C0EA c0ea = this.A0B;
            c0ea.A04(abstractC005302j, this.A01, 2);
            c0ea.A05.A00(abstractC005302j, -2);
            C0CI A02 = this.A0C.A02();
            A02.A01.A03(new C0CG() { // from class: X.39T
                {
                    C54572iy.this = this;
                }

                @Override // X.C0CG
                public final void A54(Object obj) {
                    C54572iy c54572iy = C54572iy.this;
                    AbstractC005302j abstractC005302j2 = abstractC005302j;
                    Boolean bool = (Boolean) obj;
                    C0B5 c0b5 = c54572iy.A04;
                    if (!c0b5.AFE()) {
                        c0b5.AUh(ReportSpamDialogFragment.A00(abstractC005302j2, c54572iy.A01 ? "triggered_block" : "chat", bool.booleanValue()));
                    }
                }
            }, null);
            return;
        }
        throw null;
    }

    public void A05(int i) {
        if (i == 1) {
            Jid A03 = this.A00.A03(AbstractC005302j.class);
            if (A03 != null) {
                C011005l A032 = C011005l.A03(A03);
                if (A032 != null) {
                    String str = this.A01 ? "triggered_block" : "chat";
                    LeaveGroupsDialogFragment leaveGroupsDialogFragment = new LeaveGroupsDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("jid", A032.getRawString());
                    bundle.putInt("unsent_count", 0);
                    bundle.putBoolean("report_upsell", true);
                    bundle.putString("block_spam_flow", str);
                    bundle.putInt("leave_group_action", 2);
                    bundle.putBoolean("show_neutral_button", false);
                    leaveGroupsDialogFragment.A0P(bundle);
                    this.A04.AUh(leaveGroupsDialogFragment);
                    return;
                }
                throw null;
            }
            throw null;
        }
        C002701i.A19(this.A03, this.A02);
    }
}
