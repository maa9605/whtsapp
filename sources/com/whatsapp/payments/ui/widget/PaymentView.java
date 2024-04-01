package com.whatsapp.payments.ui.widget;

import X.AbstractC000600i;
import X.AbstractC005302j;
import X.AbstractC92344In;
import X.ActivityC02320As;
import X.AnonymousClass088;
import X.AnonymousClass093;
import X.AnonymousClass223;
import X.C000500h;
import X.C002301c;
import X.C003101m;
import X.C011005l;
import X.C013306k;
import X.C014006r;
import X.C018308n;
import X.C018508q;
import X.C02160Ac;
import X.C02180Ae;
import X.C02E;
import X.C02O;
import X.C07O;
import X.C0AT;
import X.C0C1;
import X.C0L5;
import X.C0L7;
import X.C0R7;
import X.C0U1;
import X.C0U2;
import X.C0Zn;
import X.C1BQ;
import X.C26701Kg;
import X.C2MB;
import X.C2MI;
import X.C3NG;
import X.C3SG;
import X.C3SH;
import X.C3SJ;
import X.C3SQ;
import X.C40081rY;
import X.C43871y8;
import X.C455822q;
import X.C47682Ce;
import X.C48362Ey;
import X.C4A5;
import X.C4AA;
import X.C4AG;
import X.C4AH;
import X.C4AI;
import X.C4AJ;
import X.C4AK;
import X.C4AM;
import X.C4AO;
import X.C4AP;
import X.C4AQ;
import X.C76933hO;
import X.C91474Fb;
import X.C91504Fe;
import X.InterfaceC013706o;
import X.InterfaceC04830Lz;
import X.InterfaceC08320bF;
import X.InterfaceC09180cm;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import com.whatsapp.payments.ui.widget.PaymentView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class PaymentView extends AbstractC92344In implements View.OnClickListener, InterfaceC08320bF {
    public int A00;
    public AutoTransition A01;
    public View A02;
    public ImageView A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public LinearLayout A06;
    public LinearLayout A07;
    public TextSwitcher A08;
    public TextSwitcher A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public TextView A0E;
    public TabLayout A0F;
    public AbstractC000600i A0G;
    public C018508q A0H;
    public KeyboardPopupLayout A0I;
    public ThumbnailButton A0J;
    public ThumbnailButton A0K;
    public C0L7 A0L;
    public C0Zn A0M;
    public C0L5 A0N;
    public C02E A0O;
    public C000500h A0P;
    public C002301c A0Q;
    public C013306k A0R;
    public InterfaceC013706o A0S;
    public C43871y8 A0T;
    public C40081rY A0U;
    public C47682Ce A0V;
    public C2MI A0W;
    public C455822q A0X;
    public AbstractC005302j A0Y;
    public C4A5 A0Z;
    public PaymentAmountInputField A0a;
    public C91474Fb A0b;
    public C4AG A0c;
    public C4AH A0d;
    public C4AP A0e;
    public C4AQ A0f;
    public C02O A0g;
    public C2MB A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public List A0o;
    public boolean A0p;

    public PaymentView(Context context, AttributeSet attributeSet) {
        new KeyboardPopupLayout(context, attributeSet) { // from class: X.4In
            public boolean A00;

            {
                A00();
            }

            @Override // X.AbstractC08230az
            public void A00() {
                if (this.A00) {
                    return;
                }
                this.A00 = true;
                ((AbstractC07960aN) generatedComponent()).A2E((PaymentView) this);
            }
        };
        LayoutInflater from = LayoutInflater.from(getContext());
        View inflate = from.inflate(R.layout.payment_view, (ViewGroup) this, true);
        TextView textView = (TextView) from.inflate(R.layout.payment_currency_symbol, (ViewGroup) null);
        this.A0C = textView;
        textView.setTag("payment_currency_symbol_prefix");
        TextView textView2 = (TextView) from.inflate(R.layout.payment_currency_symbol, (ViewGroup) null);
        this.A0D = textView2;
        textView2.setTag("payment_currency_symbol_suffix");
        this.A09 = (TextSwitcher) C0AT.A0D(inflate, R.id.contact_name);
        this.A0A = (TextView) C0AT.A0D(inflate, R.id.contact_aux_info);
        this.A0K = (ThumbnailButton) C0AT.A0D(inflate, R.id.contact_photo);
        this.A0J = (ThumbnailButton) C0AT.A0D(inflate, R.id.bank_logo);
        ImageView imageView = (ImageView) C0AT.A0D(inflate, R.id.expand_details_button);
        this.A03 = imageView;
        imageView.setColorFilter(getResources().getColor(R.color.black_alpha_40));
        this.A08 = (TextSwitcher) C0AT.A0D(inflate, R.id.payment_contact_label);
        this.A05 = (LinearLayout) C0AT.A0D(inflate, R.id.payment_method_container);
        this.A0a = (PaymentAmountInputField) C0AT.A0D(inflate, R.id.send_payment_amount);
        this.A0E = (TextView) C0AT.A0D(inflate, R.id.bank_account_name);
        this.A0B = (TextView) C0AT.A0D(inflate, R.id.payments_send_payment_error_text);
        this.A0I = (KeyboardPopupLayout) C0AT.A0D(inflate, R.id.send_payment_keyboard_popup_layout);
        LinearLayout linearLayout = (LinearLayout) C0AT.A0D(inflate, R.id.send_payment_amount_error_text_container);
        this.A07 = linearLayout;
        linearLayout.setOnClickListener(this);
        this.A06 = (LinearLayout) C0AT.A0D(inflate, R.id.send_payment_amount_container);
        this.A04 = (LinearLayout) C0AT.A0D(inflate, R.id.payment_contact_container);
        this.A0F = (TabLayout) C0AT.A0D(inflate, R.id.payment_tabs);
        C02180Ae.A17(this.A03, C02160Ac.A00(getContext(), R.color.settings_icon));
        this.A0M = this.A0N.A04(getContext());
        this.A0I.setKeyboardPopupBackgroundColor(C02160Ac.A00(getContext(), R.color.emoji_popup_body));
        if (Build.VERSION.SDK_INT >= 19) {
            AutoTransition autoTransition = new AutoTransition();
            this.A01 = autoTransition;
            autoTransition.setDuration(100L);
        }
    }

    public final SpannableStringBuilder A01(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String string = this.A0d.A8I().getString(i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format("%s %s", string, str));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.A0d.A8I().getResources().getColor(R.color.list_item_sub_title_v2));
        int length = string.length();
        int i2 = length + 1;
        spannableStringBuilder.setSpan(foregroundColorSpan, 0, i2, 0);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.A0d.A8I().getResources().getColor(R.color.list_item_title_v2)), i2, str.length() + length + 1, 0);
        return spannableStringBuilder;
    }

    public void A02() {
        if (this.A00 == 1) {
            this.A08.setVisibility(0);
            this.A08.setText(this.A0d.A8I().getString(R.string.payments_request_payment_from));
            if (this.A0p) {
                this.A09.setText(this.A0i);
                this.A05.setVisibility(8);
            }
            if (this.A0d.AFm()) {
                this.A0A.setText(this.A0d.AC7());
                this.A0A.setVisibility(0);
                A05();
            } else {
                A04();
            }
            C91474Fb c91474Fb = this.A0b;
            if (c91474Fb != null) {
                c91474Fb.A05.A01(2);
            }
            this.A0a.A03 = 1;
        } else {
            if (this.A0p) {
                this.A08.setVisibility(8);
                this.A09.setText(A01(R.string.payments_send_payment_to, this.A0i));
                A04();
                this.A0A.setVisibility(8);
                this.A05.setVisibility(0);
            } else {
                this.A08.setVisibility(0);
                this.A08.setText(this.A0d.A8I().getString(R.string.payments_send_payment_to));
                this.A0A.setVisibility(8);
                A03();
            }
            C91474Fb c91474Fb2 = this.A0b;
            if (c91474Fb2 != null) {
                c91474Fb2.A05.A01(1);
            }
            this.A0a.A03 = 0;
        }
        if (this.A0b != null) {
            if (this.A0d.AFm()) {
                this.A0b.A01.setVisibility(8);
                return;
            }
            this.A0b.A01.setVisibility(0);
            C4AQ c4aq = this.A0f;
            C91474Fb c91474Fb3 = this.A0b;
            final MentionableEntry mentionableEntry = c91474Fb3.A04;
            ImageButton imageButton = c91474Fb3.A02;
            final EmojiSearchContainer emojiSearchContainer = c91474Fb3.A03;
            if (c4aq != null) {
                C48362Ey c48362Ey = new C48362Ey(c4aq.A00, c4aq.A0A, c4aq.A0C, c4aq.A01, c4aq.A07, c4aq.A06, c4aq.A08, c4aq.A03, c4aq.A05, c4aq.A09, c4aq.A04, c4aq.A0B, c4aq.A02, imageButton, mentionableEntry) { // from class: X.4I4
                    @Override // X.C0R7, android.widget.PopupWindow
                    public void dismiss() {
                        super.dismiss();
                        EmojiSearchContainer emojiSearchContainer2 = emojiSearchContainer;
                        if (emojiSearchContainer2.getVisibility() == 0) {
                            emojiSearchContainer2.A01(false);
                        }
                    }
                };
                final InterfaceC09180cm interfaceC09180cm = new InterfaceC09180cm() { // from class: X.4Fd
                    @Override // X.InterfaceC09180cm
                    public void AHj() {
                        WaEditText waEditText = mentionableEntry;
                        if (waEditText != null) {
                            waEditText.dispatchKeyEvent(new KeyEvent(0, 67));
                            return;
                        }
                        throw null;
                    }

                    @Override // X.InterfaceC09180cm
                    public void AJi(int[] iArr) {
                        C002701i.A1H(mentionableEntry, iArr, 0);
                    }
                };
                AnonymousClass223 anonymousClass223 = new AnonymousClass223(emojiSearchContainer, c48362Ey, c4aq.A00, c4aq.A07, c4aq.A08, c4aq.A05, c4aq.A0B);
                anonymousClass223.A00 = new InterfaceC04830Lz() { // from class: X.3k4
                    @Override // X.InterfaceC04830Lz
                    public final void AJj(C2CI c2ci) {
                        interfaceC09180cm.AJi(c2ci.A00);
                    }
                };
                c48362Ey.A06 = interfaceC09180cm;
                C26701Kg c26701Kg = c48362Ey.A07;
                if (c26701Kg != null) {
                    c26701Kg.A0B = c48362Ey.A0H;
                }
                c48362Ey.A0C = new C3SQ(c4aq, anonymousClass223);
                c4aq.A0D.put(0, c48362Ey);
                return;
            }
            throw null;
        }
    }

    public void A03() {
        if (this.A0p) {
            this.A09.setText(A01(R.string.payments_send_payment_to, this.A0i));
            this.A05.setVisibility(0);
            this.A08.setVisibility(8);
            return;
        }
        this.A08.setVisibility(0);
        this.A05.setVisibility(8);
        if (this.A0d.AFm()) {
            this.A0A.setVisibility(0);
            A05();
            return;
        }
        A04();
    }

    public final void A04() {
        this.A09.setPadding(0, getResources().getDimensionPixelSize(R.dimen.payment_detail_text_extra_padding_top_without_payment_id), 0, 0);
    }

    public final void A05() {
        this.A09.setPadding(getResources().getDimensionPixelSize(R.dimen.payment_collapsed_detail_text_extra_padding_left), getResources().getDimensionPixelSize(R.dimen.payment_detail_text_extra_padding_top_with_payment_id), 0, 0);
        this.A0A.setPadding(getResources().getDimensionPixelSize(R.dimen.payment_collapsed_detail_text_extra_padding_left), getResources().getDimensionPixelSize(R.dimen.payment_detail_text_extra_padding_top_with_payment_id), 0, 0);
    }

    public /* synthetic */ void A06() {
        this.A0f.A01();
    }

    public /* synthetic */ void A07() {
        C4AO c4ao;
        String str;
        String obj = this.A0a.getText().toString();
        int i = this.A00 != 1 ? 0 : 1;
        AnonymousClass093 A0P = this.A0R.A0P(this.A0l, this.A0n);
        if (A0P != null && A0P.A01 == 18) {
            this.A0c.AOW();
            return;
        }
        BigDecimal A87 = this.A0S.A87(this.A0Q, obj);
        C91504Fe c91504Fe = (C91504Fe) this.A0e;
        if (A87 != null && c91504Fe.A04.A00.compareTo(A87) <= 0) {
            c4ao = new C4AO(0, "");
        } else {
            C002301c c002301c = c91504Fe.A00;
            c4ao = new C4AO(2, c002301c.A0D(R.string.payments_send_payment_min_amount, c91504Fe.A01.A81(c002301c, c91504Fe.A04)));
        }
        if (c4ao.A00 == 0) {
            c4ao = c91504Fe.A00(i, A87, "", false);
        }
        int i2 = c4ao.A00;
        if ((i2 == 2 || i2 == 3) && (str = c4ao.A01) != null) {
            this.A0B.setText(str);
            this.A0B.setVisibility(0);
            this.A0f.A01();
            return;
        }
        this.A0j = obj;
        C91474Fb c91474Fb = this.A0b;
        if (c91474Fb != null) {
            this.A0k = c91474Fb.A04.getStringText();
            this.A0o = this.A0b.A04.getMentions();
        }
        C4AG c4ag = this.A0c;
        int A9i = this.A0S.A9i();
        if (i != 0) {
            c4ag.ANx(obj, new C014006r(A87, A9i));
        } else {
            c4ag.AOV(obj, new C014006r(A87, A9i));
        }
    }

    public final void A08(C0C1 c0c1) {
        C91474Fb c91474Fb;
        int ordinal = c0c1.ordinal();
        if (ordinal != 0) {
            if (ordinal == 5) {
                C4AQ c4aq = this.A0f;
                Iterator it = c4aq.A0D.entrySet().iterator();
                while (it.hasNext()) {
                    PopupWindow popupWindow = (PopupWindow) c4aq.A0D.get(((Map.Entry) it.next()).getKey());
                    if (popupWindow != null && popupWindow.isShowing()) {
                        popupWindow.dismiss();
                    }
                    it.remove();
                }
                return;
            } else if (ordinal != 2) {
                if (ordinal == 3 && (c91474Fb = this.A0b) != null && c91474Fb.A04.hasFocus()) {
                    this.A0f.A00();
                    return;
                }
                return;
            } else {
                C4AQ c4aq2 = this.A0f;
                C3NG A00 = NumberEntryKeyboard.A00(this.A0Q);
                HashMap hashMap = c4aq2.A0D;
                if (hashMap.containsKey(1)) {
                    C0R7 c0r7 = (C0R7) hashMap.get(1);
                    if (c0r7 instanceof C76933hO) {
                        ((C76933hO) c0r7).A01.setCustomKey(A00);
                    }
                }
                if (this.A0a == null || this.A0Q.A0I().equals(this.A0a.A0E.A0I())) {
                    return;
                }
                PaymentAmountInputField paymentAmountInputField = this.A0a;
                paymentAmountInputField.A0E = this.A0Q;
                paymentAmountInputField.setText((CharSequence) null);
                return;
            }
        }
        C4A5 c4a5 = this.A0Z;
        if (c4a5 == null) {
            return;
        }
        C4AM c4am = (C4AM) c4a5.AQu();
        C4AH c4ah = c4am.A03;
        this.A0d = c4ah;
        final C4AG c4ag = c4am.A02;
        this.A0c = c4ag;
        this.A0Y = c4am.A00;
        C4AI c4ai = c4am.A04;
        C4AJ c4aj = c4ai.A03;
        this.A0S = c4aj.A00;
        C4AK c4ak = c4am.A05;
        this.A0o = c4ak.A01;
        this.A0k = c4am.A07;
        this.A0l = c4ai.A07;
        this.A0n = c4am.A08;
        this.A0p = c4am.A09;
        this.A0b = c4am.A01;
        C4AP c4ap = c4ai.A04;
        this.A0e = c4ap;
        c4ah.A8I().setRequestedOrientation(1);
        this.A04.setOnClickListener(this);
        this.A0f = new C4AQ(this.A0X, this.A0h, this.A0G, this.A0U, this.A0T, this.A0V, this.A0O, this.A0Q, this.A0W, this.A0P, this.A0g, this.A0d.A8I(), this.A0I);
        if (this.A0p) {
            this.A03.setOnClickListener(this);
            this.A05.setOnClickListener(this);
            this.A05.setVisibility(0);
        } else {
            this.A05.setVisibility(8);
        }
        C91474Fb c91474Fb2 = this.A0b;
        if (c91474Fb2 != null) {
            ViewStub viewStub = (ViewStub) findViewById(R.id.payment_note_entry_stub);
            if (viewStub != null) {
                c91474Fb2.AEh(viewStub);
            } else {
                c91474Fb2.AQO(findViewById(R.id.payment_note_entry_inflated));
            }
            final MentionableEntry mentionableEntry = c91474Fb2.A04;
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.mention_attach);
            AbstractC005302j abstractC005302j = this.A0Y;
            if (C003101m.A0U(abstractC005302j)) {
                mentionableEntry.A0C(viewGroup, C011005l.A03(abstractC005302j), false, true, true);
            }
            String str = this.A0k;
            if (str != null) {
                mentionableEntry.setMentionableText(str, this.A0o);
            }
            c91474Fb2.A00 = new View.OnFocusChangeListener() { // from class: X.3SI
                {
                    PaymentView.this = this;
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    PaymentView paymentView = PaymentView.this;
                    MentionableEntry mentionableEntry2 = mentionableEntry;
                    if (z) {
                        mentionableEntry2.setHint("");
                    } else {
                        mentionableEntry2.setHint(paymentView.getContext().getString(R.string.send_payment_note));
                    }
                }
            };
            c91474Fb2.A05.A00 = new C3SH(this);
        }
        Context context = getContext();
        TabLayout tabLayout = this.A0F;
        int i = c4am.A06.A00;
        if (i != 0) {
            tabLayout.A06();
            C1BQ A03 = tabLayout.A03();
            A03.A01(R.string.payments_send_money_tab);
            ArrayList arrayList = tabLayout.A0d;
            tabLayout.A0E(A03, arrayList.isEmpty());
            C1BQ A032 = tabLayout.A03();
            A032.A01(R.string.payments_request_money_tab);
            tabLayout.A0E(A032, arrayList.isEmpty());
            ArrayList arrayList2 = tabLayout.A0c;
            if (!arrayList2.contains(this)) {
                arrayList2.add(this);
            }
            C0U1 A0c = ((ActivityC02320As) C018308n.A00(context)).A0c();
            if (i == 1) {
                this.A0I.removeView(tabLayout);
                if (Build.VERSION.SDK_INT >= 21) {
                    tabLayout.setElevation(0.0f);
                }
                if (A0c != null) {
                    A0c.A0O(false);
                    A0c.A0M(true);
                    A0c.A0L(true);
                    A0c.A0E(tabLayout, new C0U2(-1, -1));
                }
            } else if (A0c != null) {
                A0c.A06(0.0f);
            }
            tabLayout.setVisibility(0);
            C1BQ A04 = tabLayout.A04(this.A00);
            if (A04 == null) {
                throw null;
            }
            A04.A00();
        }
        if (this.A0d.AFc()) {
            ArrayList arrayList3 = new ArrayList();
            C91474Fb c91474Fb3 = this.A0b;
            if (c91474Fb3 != null) {
                arrayList3.add(c91474Fb3.A04);
            }
            C4AQ c4aq3 = this.A0f;
            C3NG c3ng = c4ak.A00;
            PaymentAmountInputField paymentAmountInputField2 = this.A0a;
            if (c4aq3 != null) {
                c4aq3.A0D.put(1, new C76933hO(c4aq3.A00, c4aq3.A0C, c4aq3.A01, c4aq3.A03, c4aq3.A04, c4aq3.A02, paymentAmountInputField2, arrayList3, c3ng));
            } else {
                throw null;
            }
        } else {
            this.A0f.A00();
            this.A0a.setFocusable(false);
        }
        PaymentAmountInputField paymentAmountInputField3 = this.A0a;
        paymentAmountInputField3.setSelection(0);
        paymentAmountInputField3.setLongClickable(false);
        paymentAmountInputField3.setErrorTextView((TextView) findViewById(R.id.payments_send_payment_error_text));
        C07O.A0o(paymentAmountInputField3, c4ai.A00);
        paymentAmountInputField3.A0G = new C4AA() { // from class: X.3k3
            @Override // X.C4AA
            public final void AH5(String str2) {
                c4ag.AH5(str2);
            }
        };
        paymentAmountInputField3.setAutoScaleTextSize(c4ai.A09);
        boolean z = c4ai.A0B;
        paymentAmountInputField3.A0M = z;
        paymentAmountInputField3.setAllowDecimal(c4ai.A08);
        paymentAmountInputField3.A0H = c4ap;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(AnonymousClass088.A02(getContext(), 4.0f), 0, 0, 0);
        C07O.A0o(this.A0D, c4ai.A01);
        C07O.A0o(this.A0C, c4ai.A02);
        View findViewById = this.A06.findViewById(R.id.payment_currency_symbol);
        if (findViewById != null) {
            this.A06.removeView(findViewById);
        }
        this.A06.addView(this.A0C, 0, layoutParams);
        LinearLayout linearLayout = this.A06;
        linearLayout.addView(this.A0D, linearLayout.getChildCount(), layoutParams2);
        paymentAmountInputField3.A08 = this.A06;
        setAmountInputData(c4aj);
        if (TextUtils.isEmpty(this.A0j)) {
            if (!TextUtils.isEmpty(this.A0m)) {
                this.A0j = this.A0m;
            } else {
                String str2 = c4ai.A05;
                if (!TextUtils.isEmpty(str2)) {
                    this.A0j = str2;
                } else {
                    String str3 = c4ai.A06;
                    if (!TextUtils.isEmpty(str3)) {
                        this.A0j = str3;
                    } else {
                        this.A0j = "0";
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(this.A0j)) {
            String str4 = this.A0j;
            if (!"0".equals(str4)) {
                if (c4ai.A0A) {
                    if (z) {
                        str4 = str4.replaceAll(PaymentAmountInputField.A00(this.A0Q), "");
                    }
                    C014006r A002 = C014006r.A00(str4, this.A0S.A9i());
                    if (A002 != null) {
                        this.A0j = this.A0S.A7z(this.A0Q, A002);
                    }
                }
                String obj = paymentAmountInputField3.getText().toString();
                String str5 = this.A0j;
                if (!obj.equals(str5)) {
                    paymentAmountInputField3.setText(str5);
                }
                if (!this.A0d.AFc()) {
                    this.A0f.A00();
                    paymentAmountInputField3.setOnClickListener(new C3SJ(this, c4ai));
                }
            }
        }
        paymentAmountInputField3.setHint(this.A0j);
        if (c4ai.A06 == null && c4ai.A05 != null && this.A0d.AFm()) {
            this.A0d.A8I().getWindow().setSoftInputMode(3);
        } else {
            View view = this.A02;
            if (view != null && view.getId() != -1 && findViewById(this.A02.getId()) != null) {
                this.A0f.A00();
                findViewById(this.A02.getId()).requestFocus();
                View view2 = this.A02;
                if (view2 instanceof WaEditText) {
                    ((WaEditText) view2).A02(true);
                } else if (view2.onCheckIsTextEditor()) {
                    InputMethodManager A0I = this.A0O.A0I();
                    if (A0I != null) {
                        A0I.showSoftInput(this.A02, 0);
                    } else {
                        throw null;
                    }
                }
            } else {
                this.A0a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.4AF
                    {
                        PaymentView.this = this;
                    }

                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        PaymentView paymentView = PaymentView.this;
                        paymentView.A0a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        paymentView.A0f.A01();
                    }
                });
            }
        }
        if (!this.A0a.hasOnClickListeners()) {
            this.A0a.setOnClickListener(new C3SG(this));
        }
        A02();
    }

    public /* synthetic */ void A09(C4AI c4ai) {
        C018508q c018508q = this.A0H;
        boolean isEmpty = TextUtils.isEmpty(c4ai.A07);
        int i = R.string.payments_amount_cannot_edit_request;
        if (isEmpty) {
            i = R.string.payments_amount_cannot_edit;
        }
        c018508q.A04(i);
    }

    public boolean A0A() {
        C4AQ c4aq = this.A0f;
        for (Map.Entry entry : c4aq.A0D.entrySet()) {
            PopupWindow popupWindow = (PopupWindow) c4aq.A0D.get(entry.getKey());
            if (popupWindow.isShowing()) {
                popupWindow.dismiss();
                int intValue = ((Number) entry.getKey()).intValue();
                if (intValue != 0) {
                    return intValue == 1;
                }
                this.A0f.A01();
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC08320bF
    public void APY(C1BQ c1bq) {
        if (Build.VERSION.SDK_INT >= 19) {
            TransitionManager.beginDelayedTransition((ViewGroup) findViewById(R.id.send_payment_details), this.A01);
        }
        this.A00 = c1bq.A00;
        A02();
    }

    public List getMentionedJids() {
        C91474Fb c91474Fb = this.A0b;
        return c91474Fb != null ? c91474Fb.A04.getMentions() : new ArrayList();
    }

    public C014006r getPaymentAmount() {
        BigDecimal A87;
        String paymentAmountString = getPaymentAmountString();
        if (TextUtils.isEmpty(paymentAmountString) || (A87 = this.A0S.A87(this.A0Q, paymentAmountString)) == null) {
            return null;
        }
        return new C014006r(A87, this.A0S.A9i());
    }

    public String getPaymentAmountString() {
        Editable text = this.A0a.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public String getPaymentNote() {
        C91474Fb c91474Fb = this.A0b;
        return c91474Fb != null ? c91474Fb.A04.getStringText() : "";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.expand_details_button && view.getId() != R.id.payment_method_container) {
            if (view.getId() == R.id.payment_contact_container) {
                if (this.A00 != 1 && this.A05.getVisibility() != 0 && this.A0p) {
                    if (Build.VERSION.SDK_INT >= 19) {
                        TransitionManager.beginDelayedTransition((ViewGroup) findViewById(R.id.send_payment_details), this.A01);
                    }
                    A03();
                    return;
                }
                this.A0c.AMm();
                return;
            } else if (view.getId() != R.id.send_payment_amount && view.getId() != R.id.send_payment_note) {
                if (view.getId() != R.id.send_payment_amount_error_text_container) {
                    return;
                }
                this.A0a.callOnClick();
                return;
            } else {
                this.A0f.A00();
                return;
            }
        }
        this.A0c.AMn();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0M.A00();
    }

    public void setAmountInputData(C4AJ c4aj) {
        InterfaceC013706o interfaceC013706o = c4aj.A00;
        this.A0S = interfaceC013706o;
        this.A0a.A0F = interfaceC013706o;
        if (interfaceC013706o.A9Q() == 0) {
            if (interfaceC013706o.ADP(this.A0Q) == 2) {
                this.A0C.setText("");
                this.A0D.setText(this.A0S.A9P(this.A0Q));
                return;
            }
            this.A0C.setText(this.A0S.A9P(this.A0Q));
            this.A0D.setText("");
            return;
        }
        this.A0C.setText("");
        this.A0D.setText(this.A0S.A9P(this.A0Q));
    }

    public void setBankLogo(Bitmap bitmap) {
        if (bitmap != null) {
            this.A0J.setImageBitmap(bitmap);
        } else {
            this.A0J.setImageResource(R.drawable.bank_logo_placeholder);
        }
    }

    public void setPaymentAmount(String str) {
        this.A0j = str;
    }

    public void setPaymentContactContainerVisibility(int i) {
        this.A04.setVisibility(i);
    }

    public void setPaymentMethodText(String str) {
        this.A0E.setText(A01(R.string.payments_send_payment_using, str));
    }
}
