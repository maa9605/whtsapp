package com.whatsapp.conversation.conversationrow;

import X.AbstractC48182Ef;
import X.AbstractC48202Eh;
import X.C003301p;
import X.C018308n;
import X.C02160Ac;
import X.C02180Ae;
import X.C02770Cu;
import X.C0PY;
import X.C0PZ;
import X.C2OW;
import X.C2XT;
import X.C50262Ra;
import X.C656237x;
import X.InterfaceC03910Hq;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0300000_I0;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class TemplateRowContentLayout extends C2XT {
    public View A00;
    public C018308n A01;
    public TextEmojiLabel A02;
    public TextEmojiLabel A03;
    public C2OW A04;
    public final List A05;

    public TemplateRowContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A05 = new ArrayList();
        setOrientation(1);
        LinearLayout.inflate(context, R.layout.template_message_content, this);
        this.A03 = (TextEmojiLabel) findViewById(R.id.top_message);
        this.A02 = (TextEmojiLabel) findViewById(R.id.bottom_message);
        this.A00 = findViewById(R.id.button_divider);
        this.A05.add(findViewById(R.id.action_btn_1));
        this.A05.add(findViewById(R.id.action_btn_2));
        this.A05.add(findViewById(R.id.action_btn_3));
        for (TextView textView : this.A05) {
            C003301p.A06(textView);
        }
    }

    public void A00(AbstractC48182Ef abstractC48182Ef) {
        int i;
        InterfaceC03910Hq interfaceC03910Hq = (InterfaceC03910Hq) abstractC48182Ef.getFMessage();
        C0PY ADS = interfaceC03910Hq.ADS();
        String str = ADS.A01;
        String str2 = ADS.A00;
        if (!TextUtils.isEmpty(str)) {
            abstractC48182Ef.A0a(str2, this.A03, abstractC48182Ef.getFMessage(), true);
            setupContentView(this.A03);
            this.A02.A07 = null;
            this.A03.setVisibility(0);
            abstractC48182Ef.A0a(str, this.A02, abstractC48182Ef.getFMessage(), false);
            this.A02.setTextSize(AbstractC48182Ef.A05(abstractC48182Ef.getResources(), ((AbstractC48202Eh) abstractC48182Ef).A0J, -1));
            this.A02.setTextColor(C02160Ac.A00(abstractC48182Ef.getContext(), R.color.conversation_row_date));
        } else {
            abstractC48182Ef.A0a(str2, this.A02, abstractC48182Ef.getFMessage(), true);
            setupContentView(this.A02);
            this.A03.setVisibility(8);
            this.A02.setTextSize(abstractC48182Ef.getTextFontSize());
            this.A02.setTextColor(C02160Ac.A00(abstractC48182Ef.getContext(), R.color.conversation_template_top_message_text_color));
        }
        List list = interfaceC03910Hq.ADS().A02;
        boolean z = false;
        int i2 = 0;
        for (TextView textView : this.A05) {
            if (list != null && i2 < list.size() && list.get(i2) != null && ((C0PZ) list.get(i2)).A03 != 1) {
                C0PZ c0pz = (C0PZ) list.get(i2);
                C656237x c656237x = abstractC48182Ef.A1H;
                Context context = getContext();
                int i3 = c0pz.A03;
                int i4 = R.drawable.ic_link_action;
                if (i3 == 3) {
                    i4 = R.drawable.ic_action_call;
                }
                Drawable A0Q = C02180Ae.A0Q(C02160Ac.A03(context, i4), textView.getCurrentTextColor());
                A0Q.setAlpha(204);
                textView.setText(C50262Ra.A01(c0pz.A04, A0Q, textView.getPaint()));
                textView.setOnClickListener(new ViewOnClickEBaseShape0S0300000_I0(this, c0pz, c656237x, 5));
                z = true;
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            i2++;
        }
        this.A00.setVisibility(z ? 0 : 8);
    }

    public TextEmojiLabel getContentTextView() {
        return this.A03.getVisibility() == 0 ? this.A03 : this.A02;
    }

    public TextEmojiLabel getFooterTextView() {
        return this.A02;
    }

    public static void setupContentView(TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.A07 = new C02770Cu();
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setFocusable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
    }
}
