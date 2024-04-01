package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;

/* renamed from: X.2WA */
/* loaded from: classes2.dex */
public class C2WA extends C2WB {
    public C0LM A00;
    public C05W A01;
    public C05M A02;
    public C0C8 A03;
    public C018808t A04;
    public C03740Gw A05;
    public final View.OnClickListener A06;
    public final TextView A07;

    public C2WA(Context context, C04300Jq c04300Jq) {
        super(context, c04300Jq);
        this.A06 = new ViewOnClickEBaseShape1S0100000_I0_1(this, 14);
        setClickable(false);
        this.A07 = (TextView) findViewById(R.id.info);
        A0k();
    }

    public static boolean A00(C04300Jq c04300Jq) {
        return C0DB.A0T(c04300Jq) && (c04300Jq instanceof C04380Jy) && ((C04380Jy) c04300Jq).A00 != 0;
    }

    public static boolean A01(C04300Jq c04300Jq) {
        return C0DB.A0X(c04300Jq) || (C0DB.A0T(c04300Jq) && (c04300Jq instanceof C04380Jy) && ((C04380Jy) c04300Jq).A00 == 0) || C0DB.A0V(c04300Jq) || c04300Jq.A00 == 62;
    }

    @Override // X.AbstractC48182Ef
    public void A0I() {
        A0k();
        A0e(false);
    }

    @Override // X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
        boolean z2 = anonymousClass092 != super.getFMessage();
        super.A0X(anonymousClass092, z);
        if (z || z2) {
            A0k();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x00ea, code lost:
        if (((X.AbstractC48182Ef) r11).A0T.A0F(r11.A01.A09(r7)) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0239, code lost:
        if (r7.equals(com.whatsapp.jid.UserJid.WHATSAPP_SURVEY) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0389, code lost:
        if (r7.equals(com.whatsapp.jid.UserJid.WHATSAPP_SURVEY) == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x03be, code lost:
        if (r7.equals(com.whatsapp.jid.UserJid.WHATSAPP_SURVEY) == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x03f1, code lost:
        if (r7.equals(com.whatsapp.jid.UserJid.WHATSAPP_SURVEY) == false) goto L172;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0j() {
        /*
            Method dump skipped, instructions count: 1380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2WA.A0j():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x0122, code lost:
        if (r1 != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0145, code lost:
        if (r2.A06(r0) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x014e, code lost:
        if (r10 == 59) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0k() {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2WA.A0k():void");
    }

    public int getBackgroundResource() {
        C04300Jq c04300Jq = (C04300Jq) super.getFMessage();
        if (this.A04.A02(c04300Jq.A0n.A00)) {
            return R.drawable.business_balloon;
        }
        if (A01(c04300Jq)) {
            return R.drawable.security_balloon;
        }
        if (!C0DB.A0e(c04300Jq) && !C0DB.A0S(c04300Jq)) {
            int i = c04300Jq.A00;
            if (!C002701i.A1O(i) && !A00(c04300Jq) && i != 63) {
                return R.drawable.date_balloon;
            }
            return R.drawable.business_balloon;
        }
        return R.drawable.business_balloon;
    }

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_divider;
    }

    @Override // X.AbstractC48202Eh
    public /* bridge */ /* synthetic */ AnonymousClass092 getFMessage() {
        return super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public C04300Jq getFMessage() {
        return (C04300Jq) super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_divider;
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_divider;
    }

    public int getTextColor() {
        C04300Jq c04300Jq = (C04300Jq) super.getFMessage();
        if (this.A04.A02(c04300Jq.A0n.A00)) {
            return R.color.bubbleBusinessText;
        }
        if (A01(c04300Jq)) {
            return R.color.bubbleSecurityText;
        }
        if (!C0DB.A0e(c04300Jq) && !C002701i.A1O(c04300Jq.A00) && !C0DB.A0S(c04300Jq) && !A00(c04300Jq)) {
            return R.color.conversation_divider_text;
        }
        return R.color.bubbleBusinessText;
    }

    @Override // X.AbstractC48202Eh
    public void setFMessage(AnonymousClass092 anonymousClass092) {
        C000700j.A07(anonymousClass092 instanceof C04300Jq);
        super.setFMessage(anonymousClass092);
    }
}
