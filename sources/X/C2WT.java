package X;

import android.content.Context;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2WT  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2WT extends AbstractC48182Ef {
    public boolean A00;
    public final TextEmojiLabel A01;
    public final String A02;

    @Override // X.AbstractC48182Ef
    public int A0C(int i) {
        return 0;
    }

    @Override // X.AbstractC48182Ef
    public int A0D(int i) {
        return 0;
    }

    @Override // X.AbstractC48202Eh
    public int getBubbleAlpha() {
        return 191;
    }

    public C2WT(Context context, C10020fA c10020fA) {
        super(context, c10020fA);
        A01();
        this.A01 = (TextEmojiLabel) findViewById(R.id.message_text);
        StringBuilder sb = new StringBuilder();
        String str = C02M.A01;
        sb.append(str);
        sb.append(context.getString(R.string.rejected_hsm_message));
        sb.append(str);
        this.A02 = sb.toString();
        A0j();
    }

    @Override // X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
        boolean z2 = anonymousClass092 != getFMessage();
        super.A0X(anonymousClass092, z);
        if (z || z2) {
            A0j();
        }
    }

    public void A0j() {
        TextEmojiLabel textEmojiLabel = this.A01;
        textEmojiLabel.setText(this.A02);
        textEmojiLabel.setTextColor(C02160Ac.A00(getContext(), R.color.tombstone_text_color));
        textEmojiLabel.setTypeface(textEmojiLabel.getTypeface(), 2);
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setFocusable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
    }

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return getIncomingLayoutId();
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_text_left;
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_text_right;
    }
}
