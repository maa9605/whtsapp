package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.ConversationListRowHeaderView;

/* renamed from: X.3wn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC86063wn extends AbstractC81003oC {
    public ViewGroup A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public ViewGroup A03;

    public AbstractC86063wn(Context context) {
        super(context);
        setOrientation(0);
        LinearLayout.inflate(getContext(), R.layout.search_message_container, this);
        this.A02 = (ViewGroup) findViewById(R.id.search_message_container_header);
        this.A01 = (ViewGroup) findViewById(R.id.search_message_container_content);
        this.A00 = (ViewGroup) findViewById(R.id.search_message_container_attachment);
        this.A03 = (ViewGroup) findViewById(R.id.search_message_container_media);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16843534, typedValue, true);
        setBackgroundResource(typedValue.resourceId);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.search_item_horizontal_margin);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.search_item_message_vertical_margin);
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.search_message_min_height));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A01() {
        C2YV c2yv;
        AbstractC51892Ys abstractC51892Ys;
        AbstractC86853yY abstractC86853yY = (AbstractC86853yY) this;
        ConversationListRowHeaderView conversationListRowHeaderView = new ConversationListRowHeaderView(abstractC86853yY.getContext());
        conversationListRowHeaderView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        conversationListRowHeaderView.A00.setIncludeFontPadding(false);
        conversationListRowHeaderView.A01.setIncludeFontPadding(false);
        C54952jd c54952jd = new C54952jd(abstractC86853yY.getContext(), conversationListRowHeaderView, abstractC86853yY.A0A, abstractC86853yY.A0I);
        abstractC86853yY.A02 = c54952jd;
        C003301p.A06(c54952jd.A01.A01);
        C54952jd c54952jd2 = abstractC86853yY.A02;
        int i = abstractC86853yY.A06;
        c54952jd2.A00.A01.setTextColor(i);
        this.A02.addView(conversationListRowHeaderView);
        abstractC86853yY.A01 = new TextEmojiLabel(abstractC86853yY.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        abstractC86853yY.A01.setLayoutParams(layoutParams);
        abstractC86853yY.A01.setMaxLines(3);
        abstractC86853yY.A01.setEllipsize(TextUtils.TruncateAt.END);
        abstractC86853yY.A01.setTextColor(i);
        abstractC86853yY.A01.setLineHeight(abstractC86853yY.getResources().getDimensionPixelSize(R.dimen.search_message_line_height));
        abstractC86853yY.A01.setTypeface(null, 0);
        abstractC86853yY.A01.setText("");
        abstractC86853yY.A01.setPlaceholder(80);
        abstractC86853yY.A01.setLineSpacing(abstractC86853yY.getResources().getDimensionPixelSize(R.dimen.search_message_line_spacing), 1.0f);
        abstractC86853yY.A01.setId(R.id.search_message_text_content);
        TextEmojiLabel textEmojiLabel = abstractC86853yY.A01;
        if (textEmojiLabel != null) {
            this.A01.addView(textEmojiLabel);
        }
        if (this instanceof C61952x4) {
            C61952x4 c61952x4 = (C61952x4) this;
            C2YV c2yv2 = new C2YV(c61952x4.getContext());
            c61952x4.A00 = c2yv2;
            c2yv = c2yv2;
        } else if (this instanceof C3MG) {
            C3MG c3mg = (C3MG) this;
            C51802Yb c51802Yb = new C51802Yb(c3mg.getContext());
            c3mg.A00 = c51802Yb;
            c2yv = c51802Yb;
        } else if (this instanceof C61962x6) {
            C61962x6 c61962x6 = (C61962x6) this;
            C3TZ c3tz = new C3TZ(c61962x6.getContext(), c61962x6.A0E, c61962x6.A08, c61962x6.A05, c61962x6.A01, c61962x6.A0F, c61962x6.A02, c61962x6.A04, c61962x6.A03);
            c61962x6.A00 = c3tz;
            c2yv = c3tz;
        } else if (this instanceof C61972x7) {
            C61972x7 c61972x7 = (C61972x7) this;
            C69123Nf c69123Nf = new C69123Nf(c61972x7.getContext(), c61972x7.A0F);
            c61972x7.A00 = c69123Nf;
            c2yv = c69123Nf;
        } else if (this instanceof C61992xA) {
            C61992xA c61992xA = (C61992xA) this;
            C3VW c3vw = new C3VW(c61992xA.getContext(), c61992xA.A01, c61992xA.A02, c61992xA.A0F, c61992xA.A04, c61992xA.A03);
            c61992xA.A00 = c3vw;
            c2yv = c3vw;
        } else if (this instanceof C69083Nb) {
            C69083Nb c69083Nb = (C69083Nb) this;
            C2YR c2yr = new C2YR(c69083Nb.getContext());
            c69083Nb.A00 = c2yr;
            c2yv = c2yr;
        } else {
            c2yv = null;
        }
        if (c2yv != null) {
            this.A00.addView(c2yv);
            this.A00.setVisibility(0);
        }
        if (this instanceof C3MH) {
            C41V c41v = (C41V) this;
            C51912Yu c51912Yu = new C51912Yu(c41v.getContext());
            c41v.A00 = c51912Yu;
            c41v.setUpThumbView(c51912Yu);
            abstractC51892Ys = c41v.A00;
        } else if (this instanceof C3NZ) {
            C41V c41v2 = (C41V) this;
            C41W c41w = new C41W(c41v2.getContext());
            c41v2.A00 = c41w;
            c41v2.setUpThumbView(c41w);
            abstractC51892Ys = c41v2.A00;
        } else if (this instanceof C69073Na) {
            C41V c41v3 = (C41V) this;
            C51902Yt c51902Yt = new C51902Yt(c41v3.getContext());
            c41v3.A00 = c51902Yt;
            c41v3.setUpThumbView(c51902Yt);
            abstractC51892Ys = c41v3.A00;
        } else {
            abstractC51892Ys = null;
        }
        if (abstractC51892Ys != null) {
            this.A03.addView(abstractC51892Ys);
        }
    }
}
