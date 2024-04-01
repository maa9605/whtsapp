package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.biz.catalog.view.activity.ProductListActivity;
import com.whatsapp.conversation.conversationrow.ProductHeaderLayout;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Wt */
/* loaded from: classes2.dex */
public class C51522Wt extends C2Wu {
    public C41611uE A00;
    public C001200o A01;
    public C0C9 A02;
    public final FrameLayout A03;
    public final TextEmojiLabel A04;
    public final TextEmojiLabel A05;
    public final TextEmojiLabel A06;
    public final TextEmojiLabel A07;
    public final ProductHeaderLayout A08;

    public C51522Wt(Context context, C0LU c0lu) {
        super(context, c0lu);
        this.A07 = (TextEmojiLabel) C0AT.A0D(this, R.id.title);
        this.A05 = (TextEmojiLabel) C0AT.A0D(this, R.id.description);
        this.A06 = (TextEmojiLabel) C0AT.A0D(this, R.id.bottom_message);
        ProductHeaderLayout productHeaderLayout = (ProductHeaderLayout) C0AT.A0D(this, R.id.conversation_row_header);
        this.A08 = productHeaderLayout;
        productHeaderLayout.setOnLongClickListener(this.A19);
        this.A03 = (FrameLayout) C0AT.A0D(this, R.id.button);
        C000200d.A0b(this.A05);
        this.A05.setAutoLinkMask(0);
        this.A05.setLinksClickable(false);
        this.A05.setFocusable(false);
        this.A05.setClickable(false);
        this.A05.setLongClickable(false);
        C000200d.A0b(this.A06);
        this.A08.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 17));
        this.A04 = (TextEmojiLabel) findViewById(R.id.button_content);
        findViewById(R.id.button).setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 16));
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

    public final void A0j() {
        TextEmojiLabel textEmojiLabel;
        C0LU c0lu = (C0LU) getFMessage();
        setButtonContent(c0lu);
        boolean z = true;
        A0a(c0lu.A18(), this.A05, c0lu, true);
        if (!TextUtils.isEmpty(c0lu.A19())) {
            TextEmojiLabel textEmojiLabel2 = this.A06;
            textEmojiLabel2.setVisibility(0);
            A0a(c0lu.A19(), textEmojiLabel2, c0lu, true);
        } else {
            this.A06.setVisibility(8);
        }
        C0XT c0xt = c0lu.A00;
        if (c0xt != null && c0xt.A00 == 2) {
            String string = getContext().getString(R.string.product_list_bubble_cta);
            textEmojiLabel = this.A04;
            A0a(string, textEmojiLabel, c0lu, true);
            ProductHeaderLayout productHeaderLayout = this.A08;
            C002301c c002301c = ((AbstractC48202Eh) this).A0J;
            C42471vn c42471vn = this.A11;
            if (productHeaderLayout != null) {
                if (!TextUtils.isEmpty(c0lu.A1A())) {
                    TextEmojiLabel textEmojiLabel3 = productHeaderLayout.A01;
                    textEmojiLabel3.setVisibility(0);
                    textEmojiLabel3.setText(c0lu.A1A());
                } else {
                    productHeaderLayout.A01.setVisibility(8);
                }
                C0XT c0xt2 = c0lu.A00;
                if (c0xt2 != null && c0xt2.A01 != null) {
                    TextEmojiLabel textEmojiLabel4 = productHeaderLayout.A00;
                    textEmojiLabel4.setVisibility(0);
                    long A00 = c0xt2.A01.A00();
                    textEmojiLabel4.setText(c002301c.A0A(R.plurals.products_total_quantity, A00, Long.valueOf(A00)));
                } else {
                    productHeaderLayout.A00.setVisibility(8);
                }
                C03900Hp A0E = c0lu.A0E();
                if (A0E != null && A0E.A06() && c0xt2 != null && c0xt2.A01 != null) {
                    WaImageView waImageView = productHeaderLayout.A02;
                    c42471vn.A0C(c0lu, waImageView, productHeaderLayout.A03, false);
                    if (!c0xt2.A01.A01.A00) {
                        waImageView.setVisibility(0);
                    } else {
                        waImageView.setVisibility(8);
                    }
                } else {
                    productHeaderLayout.A02.setVisibility(8);
                }
                productHeaderLayout.setVisibility(0);
                this.A07.setVisibility(8);
            } else {
                throw null;
            }
        } else {
            this.A08.setVisibility(8);
            if (!TextUtils.isEmpty(c0lu.A1A())) {
                String A1A = c0lu.A1A();
                TextEmojiLabel textEmojiLabel5 = this.A07;
                A0a(A1A, textEmojiLabel5, c0lu, true);
                textEmojiLabel5.setVisibility(0);
            } else {
                this.A07.setVisibility(8);
            }
            C0XT c0xt3 = c0lu.A00;
            String str = c0xt3 != null ? c0xt3.A02 : null;
            textEmojiLabel = this.A04;
            A0a(str, textEmojiLabel, c0lu, true);
        }
        FrameLayout frameLayout = this.A03;
        frameLayout.setContentDescription(getContext().getString(R.string.accessibility_button, textEmojiLabel.getText()));
        frameLayout.setLongClickable(true);
        C0AT.A0c(frameLayout, new C0AS() { // from class: X.38b
            {
                C51522Wt.this = this;
            }

            @Override // X.C0AS
            public void A04(View view, C08420bS c08420bS) {
                this.A01.onInitializeAccessibilityNodeInfo(view, c08420bS.A02);
                c08420bS.A06(new C08440bU(16, C51522Wt.this.getContext().getString(R.string.accessibility_action_click_product_list_button)));
            }
        });
        if (!TextUtils.isEmpty(c0lu.A1A())) {
            z = C0LX.A0D(c0lu.A1A());
        } else if (!TextUtils.isEmpty(c0lu.A18())) {
            z = C0LX.A0D(c0lu.A18());
        } else if (!TextUtils.isEmpty(c0lu.A19())) {
            z = C0LX.A0D(c0lu.A19());
        }
        ViewGroup viewGroup = this.A1C;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewGroup.getLayoutParams();
        layoutParams.gravity = (z ? 5 : 3) | 80;
        viewGroup.setLayoutParams(layoutParams);
    }

    public final boolean A0k() {
        C0LU c0lu = (C0LU) getFMessage();
        C0XT c0xt = c0lu.A00;
        if (c0xt == null || c0xt.A01 == null || c0xt.A00 != 2) {
            return false;
        }
        ((AbstractC48182Ef) this).A0O.A01(10);
        Context context = getContext();
        String A1A = c0lu.A1A();
        C50332Rh c50332Rh = c0xt.A01;
        Intent intent = new Intent(context, ProductListActivity.class);
        intent.putExtra("message_content", c50332Rh);
        intent.putExtra("message_title", A1A);
        context.startActivity(intent);
        C50332Rh c50332Rh2 = c0xt.A01;
        UserJid userJid = c50332Rh2.A00;
        String str = c50332Rh2.A01.A01;
        final C41611uE c41611uE = this.A00;
        C001200o c001200o = this.A01;
        final C656738c c656738c = new C656738c(this, c0xt, c0lu);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        String valueOf = String.valueOf((int) c001200o.A00.getResources().getDimension(R.dimen.medium_thumbnail_size));
        final C50952Tz c50952Tz = new C50952Tz(userJid, arrayList, valueOf, valueOf);
        final C0HK c0hk = new C0HK();
        c0hk.A08(new InterfaceC05620Pl() { // from class: X.33M
            @Override // X.InterfaceC05620Pl
            public void AIK(Object obj) {
                C2U2 c2u2 = (C2U2) obj;
                int i = c2u2.A00;
                if (i != 0) {
                    if (i == 1) {
                        List list = c2u2.A01;
                        if (list != null && list.size() != 0) {
                            C656738c c656738c2 = c656738c;
                            C50332Rh c50332Rh3 = c656738c2.A01.A01;
                            if (c50332Rh3 != null) {
                                C50362Rk c50362Rk = c50332Rh3.A01;
                                if (c50362Rk.A00) {
                                    c50362Rk.A00 = false;
                                    c656738c2.A00.A02.A0W(c656738c2.A02, -1);
                                }
                            }
                        } else {
                            C656738c c656738c3 = c656738c;
                            C50332Rh c50332Rh4 = c656738c3.A01.A01;
                            if (c50332Rh4 != null) {
                                C50362Rk c50362Rk2 = c50332Rh4.A01;
                                if (!c50362Rk2.A00) {
                                    c50362Rk2.A00 = true;
                                    c656738c3.A00.A02.A0W(c656738c3.A02, -1);
                                }
                            }
                        }
                    } else if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                return;
                            }
                        } else if (c656738c != null) {
                            C000200d.A13("ProductHeaderIntegrityChecker/AsyncCallback/Failed to get product status, reason - ", "Failed to deliver");
                        } else {
                            throw null;
                        }
                    } else if (c656738c != null) {
                        C000200d.A13("ProductHeaderIntegrityChecker/AsyncCallback/Failed to get product status, reason - ", "Unknown");
                    } else {
                        throw null;
                    }
                    c0hk.A09(this);
                    C41611uE c41611uE2 = c41611uE;
                    c41611uE2.A07.remove(c50952Tz);
                }
            }
        });
        c41611uE.A07.remove(c50952Tz);
        c41611uE.A02(c50952Tz, c0hk);
        c41611uE.A01(c50952Tz);
        return true;
    }

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_multi_element_left;
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_multi_element_left;
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_multi_element_right;
    }

    private void setButtonContent(C0LU c0lu) {
        C0XT c0xt = c0lu.A00;
        if (c0xt != null && c0xt.A00 == 2) {
            this.A04.setCompoundDrawables(null, null, null, null);
            return;
        }
        C0We c0We = new C0We(((AbstractC48202Eh) this).A0J, C02160Ac.A03(getContext(), R.drawable.ic_format_list_bulleted));
        TextEmojiLabel textEmojiLabel = this.A04;
        if (textEmojiLabel.A09.A0N()) {
            textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, c0We, (Drawable) null);
        } else {
            textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds(c0We, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        textEmojiLabel.setCompoundDrawablePadding(textEmojiLabel.getResources().getDimensionPixelSize(R.dimen.button_inset_vertical));
    }

    @Override // X.AbstractC48202Eh
    public void setFMessage(AnonymousClass092 anonymousClass092) {
        C000700j.A07(anonymousClass092 instanceof C0LU);
        super.setFMessage(anonymousClass092);
    }
}
