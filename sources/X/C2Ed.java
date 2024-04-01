package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.order.view.fragment.OrderDetailFragment;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape3S0200000_I0;
import java.math.BigDecimal;

/* renamed from: X.2Ed  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2Ed extends AbstractC48172Ee {
    public RunnableEBaseShape1S0200000_I0_1 A00;
    public final TextEmojiLabel A01;
    public final TextEmojiLabel A02;
    public final WaTextView A03;
    public final WaTextView A04;
    public final ThumbnailButton A05;

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return 0;
    }

    public C2Ed(Context context, C0LN c0ln) {
        super(context, c0ln);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.message_text);
        this.A01 = textEmojiLabel;
        C000200d.A0b(textEmojiLabel);
        this.A01.setAutoLinkMask(0);
        this.A01.setLinksClickable(false);
        this.A01.setFocusable(false);
        this.A01.setClickable(false);
        this.A01.setLongClickable(false);
        this.A05 = (ThumbnailButton) findViewById(R.id.thumb);
        this.A02 = (TextEmojiLabel) findViewById(R.id.order_message_btn);
        this.A04 = (WaTextView) findViewById(R.id.order_title);
        this.A03 = (WaTextView) findViewById(R.id.order_subtitle);
        Activity A0F = C02180Ae.A0F(context);
        if (A0F instanceof InterfaceC02360Aw) {
            RunnableEBaseShape1S0200000_I0_1 runnableEBaseShape1S0200000_I0_1 = new RunnableEBaseShape1S0200000_I0_1();
            this.A00 = runnableEBaseShape1S0200000_I0_1;
            ((C0HL) runnableEBaseShape1S0200000_I0_1.A00).A05((InterfaceC02360Aw) A0F, new InterfaceC05620Pl() { // from class: X.388
                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    C2Ed c2Ed = C2Ed.this;
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap != null) {
                        ThumbnailButton thumbnailButton = c2Ed.A05;
                        thumbnailButton.setImageBitmap(bitmap);
                        thumbnailButton.setVisibility(0);
                        return;
                    }
                    ThumbnailButton thumbnailButton2 = c2Ed.A05;
                    thumbnailButton2.setImageDrawable(null);
                    thumbnailButton2.setVisibility(8);
                }
            });
        }
        ViewOnClickCListenerShape3S0200000_I0 viewOnClickCListenerShape3S0200000_I0 = new ViewOnClickCListenerShape3S0200000_I0(context, this, 8);
        this.A02.setOnClickListener(viewOnClickCListenerShape3S0200000_I0);
        findViewById(R.id.order_message_preview).setOnClickListener(viewOnClickCListenerShape3S0200000_I0);
        A0j();
    }

    public static String A00(Context context, C0LN c0ln, C002301c c002301c) {
        BigDecimal bigDecimal;
        String str = c0ln.A04;
        if (str == null || (bigDecimal = c0ln.A09) == null) {
            return null;
        }
        return context.getString(R.string.cart_estimated_total, new C09R(str).A03(c002301c, bigDecimal, true));
    }

    public static String A01(C0LN c0ln, C002301c c002301c) {
        int i = c0ln.A00;
        return c002301c.A0A(R.plurals.total_items, i, Integer.valueOf(i));
    }

    public static void A02(C2Ed c2Ed, Context context) {
        if (c2Ed != null) {
            ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) C02180Ae.A0G(context, ActivityC02290Ap.class);
            C0LN c0ln = (C0LN) super.getFMessage();
            if (activityC02290Ap == null || c0ln.A03 == null || c0ln.A06 == null || c0ln.A08 == null) {
                return;
            }
            ((AbstractC48182Ef) c2Ed).A0O.A01(8);
            ((AbstractC48182Ef) c2Ed).A0O.A03(38, 44, null, c0ln.A03, null, c0ln.A06, null, null, null);
            UserJid userJid = c0ln.A03;
            String str = c0ln.A06;
            String str2 = c0ln.A08;
            OrderDetailFragment orderDetailFragment = new OrderDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_key_seller_jid", userJid);
            bundle.putString("extra_key_order_id", str);
            bundle.putString("extra_key_token", str2);
            orderDetailFragment.A0P(bundle);
            activityC02290Ap.AUh(orderDetailFragment);
            return;
        }
        throw null;
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
        if (z || z2) {
            A0j();
        }
    }

    public final void A0j() {
        String string;
        C0LN c0ln = (C0LN) super.getFMessage();
        setThumbnail(c0ln);
        this.A04.setText(A01(c0ln, ((AbstractC48202Eh) this).A0J), TextView.BufferType.SPANNABLE);
        String A00 = A00(getContext(), c0ln, ((AbstractC48202Eh) this).A0J);
        if (TextUtils.isEmpty(A00)) {
            this.A03.setVisibility(8);
        } else {
            WaTextView waTextView = this.A03;
            waTextView.setText(A00);
            waTextView.setVisibility(0);
        }
        TextEmojiLabel textEmojiLabel = this.A02;
        if (c0ln.A0n.A02) {
            string = getContext().getString(R.string.message_order_cta_consumer);
        } else {
            string = getContext().getString(R.string.message_order_cta_business);
        }
        textEmojiLabel.setText(string);
        String str = c0ln.A05;
        if (str != null) {
            A0a(str, this.A01, c0ln, true);
        }
    }

    @Override // X.AbstractC48202Eh
    public /* bridge */ /* synthetic */ AnonymousClass092 getFMessage() {
        return super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public C0LN getFMessage() {
        return (C0LN) super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_order_left;
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_order_right;
    }

    @Override // X.AbstractC48202Eh
    public void setFMessage(AnonymousClass092 anonymousClass092) {
        C000700j.A07(anonymousClass092 instanceof C0LN);
        super.setFMessage(anonymousClass092);
    }

    private void setThumbnail(C0LN c0ln) {
        RunnableEBaseShape1S0200000_I0_1 runnableEBaseShape1S0200000_I0_1;
        C03900Hp A0E = c0ln.A0E();
        if (A0E == null || !A0E.A05() || (runnableEBaseShape1S0200000_I0_1 = this.A00) == null) {
            return;
        }
        synchronized (runnableEBaseShape1S0200000_I0_1) {
            runnableEBaseShape1S0200000_I0_1.A01 = c0ln;
        }
        this.A12.AS1(this.A00);
    }
}
