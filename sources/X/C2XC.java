package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.preference.WaFontListPreference;

/* renamed from: X.2XC */
/* loaded from: classes2.dex */
public class C2XC extends C2XD {
    public View A00;
    public C03230Ew A01;
    public C58932rw A02;
    public C0WZ A03;
    public C0ED A04;
    public C42471vn A05;
    public boolean A06;
    public final TextEmojiLabel A07;

    public C2XC(Context context, C0JJ c0jj) {
        super(context, c0jj);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.message_text);
        this.A07 = textEmojiLabel;
        if (textEmojiLabel != null) {
            C000200d.A0b(textEmojiLabel);
            this.A07.setAutoLinkMask(0);
            this.A07.setLinksClickable(false);
            this.A07.setFocusable(false);
            this.A07.setClickable(false);
            this.A07.setLongClickable(false);
            A0j();
            return;
        }
        StringBuilder A0P = C000200d.A0P("messageTextView for conversationRow is null, rightLayout=");
        A0P.append(c0jj.A0n.A02);
        throw new RuntimeException(A0P.toString());
    }

    @Override // X.AbstractC48202Eh
    public boolean A06() {
        return (!(((AbstractC48202Eh) this).A0X instanceof C68313Ja)) && C003101m.A0Y(super.getFMessage().A0n.A00);
    }

    @Override // X.AbstractC48202Eh
    public boolean A08() {
        return C0DB.A0g(super.getFMessage());
    }

    @Override // X.AbstractC48202Eh
    public boolean A09() {
        return ((AbstractC48182Ef) this).A0K.A0E(C01C.A26) && super.getFMessage().A03 >= 127 && A0g();
    }

    @Override // X.AbstractC48182Ef
    public void A0I() {
        A0j();
        A0e(false);
    }

    @Override // X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
        boolean z2 = anonymousClass092 != super.getFMessage();
        super.A0X(anonymousClass092, z);
        if (!z && !z2) {
            if (this.A07.getAnimation() == null) {
                String A0G = super.getFMessage().A0G();
                if (A0G != null) {
                    int length = A0G.length();
                    if ((length == 1 && (A0G.charAt(0) == 57378 || A0G.charAt(0) == 10084)) || (length == 2 && A0G.charAt(0) == 10084 && A0G.charAt(1) == 65039)) {
                        A0k();
                        return;
                    }
                    return;
                }
                throw null;
            }
            return;
        }
        A0j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x006e, code lost:
        if (android.text.TextUtils.isEmpty(com.whatsapp.AcceptInviteLinkActivity.A00(android.net.Uri.parse(r9))) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0090, code lost:
        if (13 != r0) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0j() {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2XC.A0j():void");
    }

    public final void A0k() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.85f, 0.8f, 0.85f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new DecelerateInterpolator());
        scaleAnimation.setDuration(500L);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setFillBefore(true);
        scaleAnimation.setFillAfter(true);
        this.A07.startAnimation(scaleAnimation);
    }

    public final boolean A0l() {
        AnonymousClass092 fMessage = super.getFMessage();
        C02L c02l = ((AbstractC48182Ef) this).A0I;
        C0EA c0ea = this.A0h;
        return (!TextUtils.isEmpty(C3TK.A00(fMessage).A02) && C23X.A0Q(fMessage, ((AbstractC48182Ef) this).A0R, this.A0Z, this.A0p, c02l, c0ea)) || super.getFMessage().A0H != null;
    }

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_text_center;
    }

    @Override // X.AbstractC48202Eh
    public /* bridge */ /* synthetic */ AnonymousClass092 getFMessage() {
        return super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public C0JJ getFMessage() {
        return (C0JJ) super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_text_left;
    }

    @Override // X.AbstractC48202Eh
    public int getMainChildMaxWidth() {
        if (this.A06) {
            return (C2JE.A01(getContext()) * 72) / 100;
        }
        return super.getMainChildMaxWidth();
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_text_right;
    }

    @Override // X.AbstractC48182Ef
    public float getTextFontSize() {
        String A0G = super.getFMessage().A0G();
        if (A0G != null) {
            int A05 = C002701i.A05(A0G);
            if (A05 > 0 && A05 <= 3) {
                float A052 = AbstractC48182Ef.A05(getResources(), ((AbstractC48202Eh) this).A0J, WaFontListPreference.A00);
                return (((Math.max(A052, Math.min(A052, (getResources().getDisplayMetrics().density * A052) / getResources().getDisplayMetrics().scaledDensity) * 1.5f) - A052) * (4 - A05)) / 3.0f) + A052;
            }
            return super.getTextFontSize();
        }
        throw null;
    }

    @Override // X.AbstractC48202Eh
    public void setFMessage(AnonymousClass092 anonymousClass092) {
        C000700j.A07(anonymousClass092 instanceof C0JJ);
        super.setFMessage(anonymousClass092);
    }
}
