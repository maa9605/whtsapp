package com.whatsapp.conversationslist;

import X.AbstractC09080cc;
import X.AbstractC52772bI;
import X.AbstractC54772jK;
import X.AnonymousClass012;
import X.AnonymousClass024;
import X.C000500h;
import X.C001200o;
import X.C002301c;
import X.C003301p;
import X.C003701t;
import X.C018708s;
import X.C01B;
import X.C02160Ac;
import X.C02180Ae;
import X.C02980Dr;
import X.C02L;
import X.C03180Eq;
import X.C03750Gx;
import X.C05M;
import X.C05W;
import X.C06040Rh;
import X.C06K;
import X.C0AT;
import X.C0C1;
import X.C0CB;
import X.C0GK;
import X.C0L7;
import X.C0LM;
import X.C0LX;
import X.C0MW;
import X.C0Zn;
import X.C29a;
import X.C2AR;
import X.C40261rr;
import X.C52572ax;
import X.C52582ay;
import X.C52612b1;
import X.C52682b9;
import X.C52782bL;
import X.C54952jd;
import X.C54972jf;
import X.C54982jg;
import X.C54992jh;
import X.InterfaceC52462al;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.ConversationListRowHeaderView;
import com.whatsapp.components.SelectionCheckView;

/* loaded from: classes.dex */
public class ViewHolder extends AbstractC09080cc implements C0MW {
    public C54952jd A00;
    public AbstractC52772bI A01;
    public InterfaceC52462al A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final ImageView A08;
    public final ImageView A09;
    public final ImageView A0A;
    public final ImageView A0B;
    public final ImageView A0C;
    public final ImageView A0D;
    public final ImageView A0E;
    public final TextView A0F;
    public final C06040Rh A0G;
    public final C02L A0H;
    public final C01B A0I;
    public final C0LM A0J;
    public final TextEmojiLabel A0K;
    public final TextEmojiLabel A0L;
    public final WaImageView A0M;
    public final WaTextView A0N;
    public final C06K A0O;
    public final C40261rr A0P;
    public final ConversationListRowHeaderView A0Q;
    public final SelectionCheckView A0R;
    public final C0L7 A0S;
    public final C05W A0T;
    public final C018708s A0U;
    public final C0Zn A0V;
    public final C52682b9 A0W;
    public final C29a A0X;
    public final AnonymousClass012 A0Y;
    public final C001200o A0Z;
    public final C000500h A0a;
    public final C002301c A0b;
    public final C05M A0c;
    public final C0GK A0d;
    public final C03180Eq A0e;
    public final C003701t A0f;
    public final C02980Dr A0g;
    public final C03750Gx A0h;
    public final C0CB A0i;
    public final AbstractC54772jK A0j;
    public final boolean A0k;

    public ViewHolder(Context context, C001200o c001200o, AnonymousClass012 anonymousClass012, C003701t c003701t, C02980Dr c02980Dr, C02L c02l, C05M c05m, C01B c01b, C03750Gx c03750Gx, C0L7 c0l7, C05W c05w, C06040Rh c06040Rh, C0GK c0gk, C018708s c018708s, C002301c c002301c, C40261rr c40261rr, C03180Eq c03180Eq, C2AR c2ar, C0CB c0cb, C000500h c000500h, C06K c06k, C0LM c0lm, View view, AbstractC54772jK abstractC54772jK, C0Zn c0Zn, C52682b9 c52682b9, C29a c29a) {
        super(view);
        this.A0Y = anonymousClass012;
        this.A0f = c003701t;
        this.A0g = c02980Dr;
        this.A0H = c02l;
        this.A0Z = c001200o;
        this.A0c = c05m;
        this.A0I = c01b;
        this.A0h = c03750Gx;
        this.A0S = c0l7;
        this.A0T = c05w;
        this.A0G = c06040Rh;
        this.A0d = c0gk;
        this.A0U = c018708s;
        this.A0b = c002301c;
        this.A0j = abstractC54772jK;
        this.A0P = c40261rr;
        this.A0e = c03180Eq;
        this.A0i = c0cb;
        this.A0V = c0Zn;
        this.A0a = c000500h;
        this.A0W = c52682b9;
        this.A0O = c06k;
        this.A0J = c0lm;
        this.A0X = c29a;
        ConversationListRowHeaderView conversationListRowHeaderView = (ConversationListRowHeaderView) C0AT.A0D(view, R.id.conversations_row_header);
        this.A0Q = conversationListRowHeaderView;
        this.A00 = new C54952jd(c001200o.A00, conversationListRowHeaderView, c018708s, c2ar);
        this.A05 = C0AT.A0D(view, R.id.contact_row_container);
        C003301p.A06(this.A00.A01.A01);
        this.A07 = C0AT.A0D(view, R.id.progressbar_small);
        this.A08 = (ImageView) C0AT.A0D(view, R.id.contact_photo);
        this.A04 = C0AT.A0D(view, R.id.contact_selector);
        this.A06 = C0AT.A0D(view, R.id.conversations_row_content);
        this.A0K = (TextEmojiLabel) C0AT.A0D(view, R.id.single_msg_tv);
        this.A0L = (TextEmojiLabel) C0AT.A0D(view, R.id.msg_from_tv);
        this.A0M = (WaImageView) C0AT.A0D(view, R.id.conversations_row_unseen_important_message_indicator);
        this.A0F = (TextView) C0AT.A0D(view, R.id.conversations_row_message_count);
        this.A0E = (ImageView) C0AT.A0D(view, R.id.status_indicator);
        this.A0B = (ImageView) C0AT.A0D(view, R.id.media_indicator);
        this.A0N = (WaTextView) C0AT.A0D(view, R.id.payments_indicator);
        this.A0C = (ImageView) C0AT.A0D(view, R.id.mute_indicator);
        this.A0D = (ImageView) C0AT.A0D(view, R.id.pin_indicator);
        this.A0k = c003701t.A0C(462);
        if (c003701t.A0C(363)) {
            C0LX.A05(c002301c, this.A0C, ((ViewGroup.MarginLayoutParams) this.A0C.getLayoutParams()).leftMargin, context.getResources().getDimensionPixelSize(R.dimen.conversation_mute_icon_margin_right));
            C0LX.A05(c002301c, this.A0D, ((ViewGroup.MarginLayoutParams) this.A0D.getLayoutParams()).leftMargin, context.getResources().getDimensionPixelSize(R.dimen.conversation_pin_icon_margin_right));
            this.A0F.getLayoutParams();
            C0LX.A05(c002301c, this.A0F, context.getResources().getDimensionPixelSize(R.dimen.conversation_row_unread_indicator_margin_left), context.getResources().getDimensionPixelSize(R.dimen.conversation_row_unread_indicator_margin_right_new));
        }
        if (!c003701t.A0C(363) && !this.A0k) {
            C02180Ae.A17(this.A0D, C02160Ac.A00(context, R.color.conversationBadgeTint));
        } else {
            this.A0D.setImageDrawable(C02160Ac.A03(context, R.drawable.ic_inline_pin_new));
            C02180Ae.A17(this.A0D, C02160Ac.A00(context, R.color.msgStatusTint));
        }
        this.A0A = (ImageView) C0AT.A0D(view, R.id.live_location_indicator);
        this.A03 = C0AT.A0D(view, R.id.archived_indicator);
        this.A0R = (SelectionCheckView) C0AT.A0D(view, R.id.selection_check);
        this.A09 = (ImageView) C0AT.A0D(view, R.id.conversations_row_ephemeral_status);
        if (this.A0k) {
            Resources resources = super.A0H.getContext().getResources();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.A05.getLayoutParams());
            layoutParams.height = resources.getDimensionPixelSize(R.dimen.list_ui_refresh_conversation_container_height);
            this.A05.setLayoutParams(layoutParams);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.list_ui_refresh_conversation_container_vertical_padding);
            this.A05.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
            C0LX.A08(this.A0b, this.A04, resources.getDimensionPixelSize(R.dimen.list_ui_refresh_conversation_contact_selector_padding_left), 0, resources.getDimensionPixelSize(R.dimen.list_ui_refresh_conversation_contact_selector_padding_right), 0);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.A04.getLayoutParams());
            layoutParams2.height = resources.getDimensionPixelSize(R.dimen.list_ui_refresh_conversation_container_height);
            layoutParams2.width = resources.getDimensionPixelSize(R.dimen.list_ui_refresh_conversation_contact_selector_width);
            this.A04.setLayoutParams(layoutParams2);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.contact_photo_ui_refresh_size);
            this.A08.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2, 17));
            C0LX.A08(this.A0b, this.A06, 0, 0, resources.getDimensionPixelSize(R.dimen.list_ui_refresh_conversation_content_padding_right), 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0Q.getLayoutParams();
            C0LX.A07(this.A0b, this.A0Q, marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, resources.getDimensionPixelSize(R.dimen.list_ui_refresh_conversation_header_bottom_margin));
            A0I(this.A0R);
            A0I(this.A09);
        }
    }

    public final void A0I(View view) {
        C0LX.A07(this.A0b, view, view.getResources().getDimensionPixelSize(R.dimen.list_ui_refresh_conversation_ephemeral_selection_left_margin), view.getResources().getDimensionPixelSize(R.dimen.list_ui_refresh_conversation_ephemeral_selection_top_margin), 0, 0);
    }

    public void A0J(InterfaceC52462al interfaceC52462al, boolean z, Context context, Activity activity, C52782bL c52782bL, int i) {
        if (!AnonymousClass024.A0l(this.A02, interfaceC52462al)) {
            AbstractC52772bI abstractC52772bI = this.A01;
            if (abstractC52772bI != null) {
                abstractC52772bI.A02();
            }
            this.A02 = interfaceC52462al;
        }
        this.A08.setTag(null);
        if (interfaceC52462al instanceof C52572ax) {
            this.A01 = new C54972jf(i, this, context, activity, c52782bL, this.A0Y, this.A0f, this.A0g, this.A0H, this.A0Z, this.A0c, this.A0I, this.A0h, this.A0S, this.A0T, this.A0G, this.A0d, this.A0U, this.A0b, this.A0j, this.A0P, this.A0e, this.A0i, this.A0V, this.A0a, this.A0W, this.A0O, this.A0J, this.A0X);
        } else if (interfaceC52462al instanceof C52582ay) {
            this.A01 = new C54982jg(this.A0Z, context, this.A0Y, this.A0g, this.A0H, this.A0I, this.A0h, this.A0T, this.A0d, this.A0U, this.A0b, this.A0P, this.A0i, this.A0O, this.A0J, this, activity, c52782bL, this.A0j, this.A0V, this.A0X);
        } else if (interfaceC52462al instanceof C52612b1) {
            this.A01 = new C54992jh(this.A0Z, context, this.A0Y, this.A0g, this.A0H, this.A0I, this.A0h, this.A0T, this.A0d, this.A0U, this.A0b, this.A0P, this.A0O, this.A0J, this, activity, c52782bL, this.A0j, this.A0W, this.A0X);
        }
        this.A01.A03(this.A02, z);
    }

    @OnLifecycleEvent(C0C1.ON_DESTROY)
    public void onDestroy() {
        AbstractC52772bI abstractC52772bI = this.A01;
        if (abstractC52772bI != null) {
            abstractC52772bI.A02();
        }
    }
}
