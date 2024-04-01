package X;

import android.content.Context;
import android.text.Html;
import android.text.Spannable;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2WN  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2WN extends C2WO {
    public C09I A00;

    @Override // X.AbstractC48202Eh
    public int getBubbleAlpha() {
        return 191;
    }

    public C2WN(Context context, AnonymousClass092 anonymousClass092) {
        super(context, anonymousClass092);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.message_text);
        textEmojiLabel.A07 = new C02770Cu();
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setFocusable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(Html.fromHtml(getContext().getString(anonymousClass092.A0n.A02 ? R.string.futureproof_message_text_sent : R.string.futureproof_message_text, this.A00.A01().toString())));
        A0R(newSpannable);
        textEmojiLabel.setAccessibilityHelper(new C02780Cv(((AbstractC48182Ef) this).A0W, textEmojiLabel));
        textEmojiLabel.setText(newSpannable);
    }

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_unsupported_left;
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_unsupported_left;
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_unsupported_right;
    }
}
