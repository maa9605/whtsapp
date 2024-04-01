package com.whatsapp.conversation.conversationrow;

import X.AbstractC48182Ef;
import X.AbstractC48202Eh;
import X.AbstractC658638v;
import X.AnonymousClass092;
import X.C02160Ac;
import X.C02770Cu;
import X.C05530Pc;
import X.C40731sm;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* loaded from: classes2.dex */
public class DynamicButtonsRowContentLayout extends AbstractC658638v {
    public final TextEmojiLabel A00;
    public final TextEmojiLabel A01;

    public DynamicButtonsRowContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        LinearLayout.inflate(context, R.layout.dynamic_reply_message_content, this);
        this.A01 = (TextEmojiLabel) findViewById(R.id.top_message);
        this.A00 = (TextEmojiLabel) findViewById(R.id.bottom_message);
        setupContentView(this.A01);
        setupContentView(this.A00);
    }

    public void A00(AbstractC48182Ef abstractC48182Ef) {
        int i;
        AnonymousClass092 fMessage = abstractC48182Ef.getFMessage();
        C05530Pc c05530Pc = fMessage.A0D().A00;
        if (c05530Pc == null) {
            return;
        }
        String str = c05530Pc.A00;
        String str2 = c05530Pc.A01;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Context context = getContext();
        Object[] objArr = new Object[1];
        Context context2 = getContext();
        byte b = fMessage.A0m;
        if (b == 0) {
            i = R.string.accessibility_message_with_buttons_text;
        } else if (b == 1) {
            i = R.string.accessibility_message_with_buttons_image;
        } else if (b == 3) {
            i = R.string.accessibility_message_with_buttons_video;
        } else if (b != 5) {
            i = R.string.accessibility_message_with_buttons_document;
            if (b != 9) {
                i = 0;
            }
        } else {
            i = R.string.accessibility_message_with_buttons_location;
        }
        objArr[0] = context2.getString(i);
        StringBuilder sb = new StringBuilder(context.getString(R.string.accessibility_message_with_buttons_focus_format, objArr));
        String A0G = fMessage.A0G();
        if (!TextUtils.isEmpty(A0G) && b == 0) {
            sb.append(A0G);
        }
        sb.append(C40731sm.A0P(fMessage));
        abstractC48182Ef.setContentDescription(sb.toString());
        if (!TextUtils.isEmpty(str2)) {
            TextEmojiLabel textEmojiLabel = this.A01;
            abstractC48182Ef.A0a(str, textEmojiLabel, fMessage, true);
            textEmojiLabel.setVisibility(0);
            TextEmojiLabel textEmojiLabel2 = this.A00;
            abstractC48182Ef.A0b(str2, textEmojiLabel2, fMessage, true, false);
            textEmojiLabel2.setTextSize(AbstractC48182Ef.A05(abstractC48182Ef.getResources(), ((AbstractC48202Eh) abstractC48182Ef).A0J, -1));
            textEmojiLabel2.setTextColor(C02160Ac.A00(abstractC48182Ef.getContext(), R.color.conversation_row_date));
            return;
        }
        TextEmojiLabel textEmojiLabel3 = this.A00;
        abstractC48182Ef.A0a(str, textEmojiLabel3, fMessage, true);
        this.A01.setVisibility(8);
        textEmojiLabel3.setTextColor(C02160Ac.A00(abstractC48182Ef.getContext(), R.color.conversation_template_top_message_text_color));
    }

    private void setupContentView(TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.A07 = new C02770Cu();
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
    }
}
