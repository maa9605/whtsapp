package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.EmojiPopupFooter;
import com.whatsapp.util.ViewOnClickCListenerShape9S0100000_I0_1;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2Ex */
/* loaded from: classes2.dex */
public final class C48352Ex extends C48362Ey implements InterfaceC48372Ez {
    public int A00;
    public ObjectAnimator A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public ImageView A0C;
    public ImageView A0D;
    public ImageView A0E;
    public RecyclerView A0F;
    public C66493Bg A0G;
    public C2JN A0H;
    public C66553Bm A0I;
    public C78833kb A0J;
    public InterfaceC53342en A0K;
    public InterfaceC53342en A0L;
    public C461325b A0M;
    public final AbstractC15200oF A0N;
    public final C01B A0O;
    public final C02E A0P;
    public final C003701t A0Q;
    public final AnonymousClass011 A0R;
    public final C47212Ai A0S;
    public final AnonymousClass228 A0T;
    public final C2MQ A0U;
    public final C2BP A0V;
    public final AnonymousClass227 A0W;
    public final C2AM A0X;
    public final C43791xz A0Y;
    public final C2Bk A0Z;
    public final C2AS A0a;
    public final C49712Mb A0b;
    public final C82883rE A0c;
    public final C461225a A0d;
    public final InterfaceC002901k A0e;

    public C48352Ex(C003701t c003701t, Activity activity, C455822q c455822q, C2MB c2mb, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C47212Ai c47212Ai, C2BP c2bp, AnonymousClass011 anonymousClass011, C40081rY c40081rY, C01B c01b, AnonymousClass227 anonymousClass227, C43871y8 c43871y8, AnonymousClass228 anonymousClass228, C47682Ce c47682Ce, C2AM c2am, C02E c02e, C002301c c002301c, C2MQ c2mq, C2MI c2mi, C000500h c000500h, C02O c02o, KeyboardPopupLayout keyboardPopupLayout, ImageButton imageButton, WaEditText waEditText, C2Bk c2Bk, C2AS c2as, C43791xz c43791xz, C461225a c461225a, C82883rE c82883rE, C49712Mb c49712Mb) {
        super(activity, c455822q, c2mb, abstractC000600i, c40081rY, c43871y8, c47682Ce, c02e, c002301c, c2mi, c000500h, c02o, keyboardPopupLayout, imageButton, waEditText);
        this.A0K = new InterfaceC53342en() { // from class: X.3Bb
            {
                C48352Ex.this = this;
            }

            @Override // X.InterfaceC53342en
            public void AP7(C0JM c0jm, Integer num) {
                InterfaceC53342en interfaceC53342en = C48352Ex.this.A0L;
                if (interfaceC53342en != null) {
                    interfaceC53342en.AP7(c0jm, num);
                }
            }
        };
        this.A0N = new AbstractC15200oF() { // from class: X.3Bc
            {
                C48352Ex.this = this;
            }

            @Override // X.AbstractC15200oF
            public void A00(RecyclerView recyclerView, int i) {
                int i2 = 0;
                if (i == 0) {
                    C48352Ex c48352Ex = C48352Ex.this;
                    int height = ((C48362Ey) c48352Ex).A08.getHeight();
                    if (((C48362Ey) c48352Ex).A04 > 0 && ((C48362Ey) c48352Ex).A08.A00 > (height >> 1)) {
                        i2 = height;
                    }
                    EmojiPopupFooter emojiPopupFooter = ((C48362Ey) c48352Ex).A08;
                    if (i2 != emojiPopupFooter.A00) {
                        emojiPopupFooter.startAnimation(new C60682us(c48352Ex, i2));
                    }
                } else if (i != 1 || recyclerView.computeVerticalScrollRange() > recyclerView.getHeight()) {
                } else {
                    C48352Ex c48352Ex2 = C48352Ex.this;
                    EmojiPopupFooter emojiPopupFooter2 = ((C48362Ey) c48352Ex2).A08;
                    if (emojiPopupFooter2.A00 == 0) {
                        return;
                    }
                    emojiPopupFooter2.startAnimation(new C60682us(c48352Ex2, 0));
                }
            }

            @Override // X.AbstractC15200oF
            public void A01(RecyclerView recyclerView, int i, int i2) {
                C48352Ex c48352Ex = C48352Ex.this;
                if (i2 == 0) {
                    EmojiPopupFooter emojiPopupFooter = ((C48362Ey) c48352Ex).A08;
                    if (emojiPopupFooter.A00 != 0) {
                        emojiPopupFooter.startAnimation(new C60682us(c48352Ex, 0));
                        ((C48362Ey) c48352Ex).A04 = i2;
                        return;
                    }
                    return;
                }
                Animation animation = ((C48362Ey) c48352Ex).A08.getAnimation();
                if (animation != null) {
                    animation.cancel();
                }
                EmojiPopupFooter emojiPopupFooter2 = ((C48362Ey) c48352Ex).A08;
                emojiPopupFooter2.setTopOffset(emojiPopupFooter2.A00 + i2);
                ((C48362Ey) c48352Ex).A04 = i2;
            }
        };
        this.A0Q = c003701t;
        this.A0e = interfaceC002901k;
        this.A0S = c47212Ai;
        this.A0V = c2bp;
        this.A0R = anonymousClass011;
        this.A0O = c01b;
        this.A0W = anonymousClass227;
        this.A0T = anonymousClass228;
        this.A0X = c2am;
        this.A0P = c02e;
        this.A0Z = c2Bk;
        this.A0U = c2mq;
        this.A0a = c2as;
        this.A0Y = c43791xz;
        this.A0d = c461225a;
        this.A0c = c82883rE;
        this.A0b = c49712Mb;
        RunnableEBaseShape6S0100000_I0_6 runnableEBaseShape6S0100000_I0_6 = new RunnableEBaseShape6S0100000_I0_6(c2am, 49);
        if (((C2AN) c2am).A03 != null) {
            ((C2AN) runnableEBaseShape6S0100000_I0_6.A00).A07();
        } else {
            c2am.A09.execute(runnableEBaseShape6S0100000_I0_6);
        }
        if (c49712Mb == null || !c49712Mb.A00 || c82883rE == null) {
            return;
        }
        c82883rE.A02.A05((InterfaceC02360Aw) activity, new InterfaceC05620Pl() { // from class: X.3BW
            {
                C48352Ex.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                int i;
                C48352Ex c48352Ex = C48352Ex.this;
                if (((List) obj).size() > 0) {
                    i = 2;
                } else {
                    i = 0;
                    if (c48352Ex.isShowing()) {
                        i = 1;
                    }
                }
                c48352Ex.A0G(i);
            }
        });
    }

    @Override // X.C48362Ey
    public void A06() {
        AbstractC15200oF abstractC15200oF;
        Activity activity;
        C43791xz c43791xz;
        C2Bk c2Bk;
        super.A06();
        C01B c01b = this.A0O;
        if (!c01b.A0E(C01C.A2I)) {
            this.A06 = ((C48362Ey) this).A05.findViewById(R.id.gif_trending);
            this.A04 = ((C48362Ey) this).A05.findViewById(R.id.gif_trending_additions);
            RecyclerView recyclerView = (RecyclerView) ((C48362Ey) this).A05.findViewById(R.id.gif_trending_grid);
            this.A0F = recyclerView;
            abstractC15200oF = this.A0N;
            recyclerView.A0m(abstractC15200oF);
            activity = ((C0R7) this).A02;
            final int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.selected_contacts_top_offset);
            this.A0F.A0k(new AbstractC08920cK() { // from class: X.3Bd
                @Override // X.AbstractC08920cK
                public void A01(Rect rect, View view, RecyclerView recyclerView2, C0Y0 c0y0) {
                    int i = dimensionPixelSize;
                    rect.set(0, i, i, 0);
                }
            });
            this.A05 = ((C48362Ey) this).A05.findViewById(R.id.progress_container);
            this.A07 = ((C48362Ey) this).A05.findViewById(R.id.no_results);
            this.A08 = ((C48362Ey) this).A05.findViewById(R.id.retry_panel);
            ((C48362Ey) this).A05.findViewById(R.id.retry_button).setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 15));
            C3KS c3ks = new C3KS(this);
            this.A0I = c3ks;
            this.A0F.setAdapter(c3ks);
            this.A0F.A0i = true;
            final GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
            gridLayoutManager.A01 = new AbstractC14890nk() { // from class: X.3Be
                {
                    C48352Ex.this = this;
                }

                @Override // X.AbstractC14890nk
                public int A00(int i) {
                    if (C48352Ex.this.A0I.A0I(i)) {
                        return gridLayoutManager.A00;
                    }
                    return 1;
                }
            };
            this.A0F.setLayoutManager(gridLayoutManager);
        } else {
            activity = ((C0R7) this).A02;
            C455822q c455822q = super.A0O;
            InterfaceC002901k interfaceC002901k = this.A0e;
            C47212Ai c47212Ai = this.A0S;
            C2BP c2bp = this.A0V;
            AnonymousClass011 anonymousClass011 = this.A0R;
            AnonymousClass227 anonymousClass227 = this.A0W;
            AnonymousClass228 anonymousClass228 = this.A0T;
            C02E c02e = this.A0P;
            C002301c c002301c = super.A0J;
            C2MQ c2mq = this.A0U;
            C02O c02o = super.A0P;
            ViewGroup viewGroup = ((C48362Ey) this).A05;
            abstractC15200oF = this.A0N;
            this.A0H = new C2JN(activity, c455822q, interfaceC002901k, c47212Ai, c2bp, anonymousClass011, c01b, anonymousClass227, anonymousClass228, c02e, c002301c, c2mq, c02o, viewGroup, abstractC15200oF, this);
        }
        this.A09 = ((C48362Ey) this).A05.findViewById(R.id.search_button);
        this.A0D = (ImageView) ((C48362Ey) this).A05.findViewById(R.id.gif_tab);
        this.A0C = (ImageView) ((C48362Ey) this).A05.findViewById(R.id.emoji_tab);
        this.A0B = ((C48362Ey) this).A05.findViewById(R.id.sticker_tab);
        this.A0E = (ImageView) ((C48362Ey) this).A05.findViewById(R.id.sticker_tab_icon);
        this.A0A = ((C48362Ey) this).A05.findViewById(R.id.sticker_onboarding_badge);
        this.A02 = ((C48362Ey) this).A05.findViewById(R.id.emoji_group_layout);
        this.A03 = ((C48362Ey) this).A05.findViewById(R.id.pager);
        this.A0D.setVisibility(0);
        this.A0C.setVisibility(0);
        C2AS c2as = this.A0a;
        if (c2as != null && (c43791xz = this.A0Y) != null && (c2Bk = this.A0Z) != null && this.A0L != null) {
            C003701t c003701t = this.A0Q;
            InterfaceC002901k interfaceC002901k2 = this.A0e;
            AnonymousClass011 anonymousClass0112 = this.A0R;
            C2AM c2am = this.A0X;
            C002301c c002301c2 = super.A0J;
            C000500h c000500h = ((C0R7) this).A06;
            C461325b c461325b = new C461325b(c003701t, activity, interfaceC002901k2, anonymousClass0112, c2am, c002301c2, c2Bk, c2as, c000500h, ((C48362Ey) this).A05, this.A0J, c43791xz, abstractC15200oF, this.A0d, this.A0c, this.A0b);
            this.A0M = c461325b;
            c461325b.A04 = this.A0K;
            if (!c000500h.A00.getBoolean("sticker_picker_initial_download", false)) {
                c2as.A0S.ARy(new C0HS(c2as, new C66483Bf(this)) { // from class: X.3qr
                    public final C3Y6 A00;
                    public final C2AS A01;

                    {
                        this.A01 = c2as;
                        this.A00 = r2;
                    }

                    @Override // X.C0HS
                    public void A03(Object[] objArr) {
                        if (this.A00 == null) {
                            throw null;
                        }
                    }

                    @Override // X.C0HS
                    public Object A07(Object[] objArr) {
                        C2AS c2as2 = this.A01;
                        List A0C = c2as2.A0C();
                        List A0B = c2as2.A0B();
                        C47592Bv c47592Bv = new C47592Bv(false);
                        ArrayList arrayList = new ArrayList(((AbstractCollection) A0B).size() + A0C.size());
                        arrayList.addAll(A0C);
                        arrayList.addAll(A0B);
                        Collections.sort(arrayList, c47592Bv);
                        this.A02.A00(arrayList);
                        List A0F = c2as2.A0F(null);
                        ArrayList arrayList2 = new ArrayList(A0C);
                        arrayList2.addAll(A0F);
                        Collections.sort(arrayList2, c47592Bv);
                        return arrayList2;
                    }

                    @Override // X.C0HS
                    public void A09(Object obj) {
                        List list = (List) obj;
                        if (list != null) {
                            this.A00.A00(list);
                            return;
                        }
                        throw null;
                    }
                }, new Object[0]);
            } else {
                A0E();
            }
        }
        this.A09.setVisibility(super.A0N.A02 ? 0 : 8);
        this.A0C.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 16));
        this.A0D.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 17));
        this.A0E.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 18));
        this.A09.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 14));
        if (A0J()) {
            A0F(2);
        } else {
            A0F(((C0R7) this).A06.A00.getInt("emoji_popup_window_tab_state", 0));
        }
    }

    @Override // X.C48362Ey
    public void A09() {
        C461325b c461325b;
        C2C0 c2c0;
        super.A09();
        A0C();
        C461325b c461325b2 = this.A0M;
        if (c461325b2 != null) {
            ((AbstractC461425c) c461325b2).A0A.getViewTreeObserver().addOnGlobalLayoutListener(c461325b2.A0L);
            C461225a c461225a = c461325b2.A0Z;
            c461225a.A03 = c461325b2;
            if (c461225a.A04 == null && ((c2c0 = c461225a.A02) == null || c2c0.A04())) {
                c461225a.A03();
            } else {
                List list = c461225a.A04;
                if (list != null) {
                    c461225a.A04(list, null);
                }
            }
            c461325b2.A0O.A0B(new AnonymousClass014() { // from class: X.1mZ
                {
                    AnonymousClass015 anonymousClass015 = AnonymousClass014.DEFAULT_SAMPLING_RATE;
                }
            }, null, false);
            c461325b2.A0H = true;
        }
        if (!A0J() || (c461325b = this.A0M) == null) {
            return;
        }
        if (this.A00 == 2) {
            AbstractC461525e abstractC461525e = c461325b.A0C;
            if ("contextual_suggestion".equals(abstractC461525e != null ? abstractC461525e.getId() : null)) {
                return;
            }
        }
        A0I("contextual_suggestion");
    }

    public void A0B() {
        if (isShowing()) {
            dismiss();
        }
        C461325b c461325b = this.A0M;
        if (c461325b != null) {
            C461225a c461225a = c461325b.A0Z;
            c461225a.A03 = null;
            c461225a.A00 = null;
        }
        C2JN c2jn = this.A0H;
        if (c2jn != null) {
            c2jn.A06.A00(c2jn.A05);
        }
        ObjectAnimator objectAnimator = this.A01;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.A01 = null;
        }
    }

    public final void A0C() {
        View view = this.A06;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        this.A08.setVisibility(8);
        this.A05.setVisibility(0);
        this.A0I.A0H(null);
        C3KS c3ks = new C3KS(this);
        this.A0I = c3ks;
        this.A0F.setAdapter(c3ks);
        this.A0I.A0H(this.A0U.A00());
    }

    public final void A0D() {
        ImageButton imageButton = super.A0G;
        if (imageButton != null) {
            Activity activity = ((C0R7) this).A02;
            imageButton.setImageDrawable(C02180Ae.A0O(activity, ((C48362Ey) this).A00, R.color.ibEmojiIconTint));
            imageButton.setContentDescription(activity.getString(R.string.emoji_button_description));
            imageButton.setOnClickListener(super.A0D);
        }
    }

    public final void A0E() {
        this.A0B.setVisibility(0);
        if (((C0R7) this).A06.A00.getBoolean("sticker_store_onboarding_badge_shown", false)) {
            this.A0A.setVisibility(8);
            return;
        }
        this.A0A.setVisibility(0);
        ObjectAnimator objectAnimator = this.A01;
        if (objectAnimator == null) {
            objectAnimator = ObjectAnimator.ofPropertyValuesHolder(this.A0A, PropertyValuesHolder.ofFloat("scaleX", 1.4f), PropertyValuesHolder.ofFloat("scaleY", 1.4f), PropertyValuesHolder.ofFloat("alpha", 0.4f, 0.0f));
            this.A01 = objectAnimator;
        }
        objectAnimator.setDuration(1500L);
        this.A01.setRepeatCount(-1);
        this.A01.setRepeatMode(1);
        this.A01.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0010, code lost:
        if (r8 != 2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0014, code lost:
        if (r8 == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0016, code lost:
        r1 = r7.A0C;
        r0 = com.google.android.search.verification.client.R.drawable.ic_emoticon_normal;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x001b, code lost:
        if (r8 != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x001d, code lost:
        r0 = com.google.android.search.verification.client.R.drawable.ic_emoticon_selected;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0020, code lost:
        r1.setImageResource(r0);
        r1 = r7.A0D;
        r0 = com.google.android.search.verification.client.R.drawable.ic_gif_normal;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0028, code lost:
        if (r8 != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x002a, code lost:
        r0 = com.google.android.search.verification.client.R.drawable.ic_gif_selected;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x002d, code lost:
        r1.setImageResource(r0);
        r1 = r7.A0E;
        r0 = com.google.android.search.verification.client.R.drawable.ic_sticker_normal;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0035, code lost:
        if (r8 != 2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0037, code lost:
        r0 = com.google.android.search.verification.client.R.drawable.ic_sticker_selected;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x003a, code lost:
        r1.setImageResource(r0);
        A0H(r7.A09, r8);
        ((X.C48362Ey) r7).A05.findViewById(com.google.android.search.verification.client.R.id.delete_symbol_tb).setVisibility(r3);
        ((X.C48362Ey) r7).A05.findViewById(com.google.android.search.verification.client.R.id.sticker_store_button).setVisibility(r5);
        r0 = r7.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x005c, code lost:
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x005e, code lost:
        if (r8 != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0060, code lost:
        r0.requestFocus();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0063, code lost:
        r7.A03.setVisibility(r3);
        r1 = r7.A0M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x006a, code lost:
        if (r1 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x006c, code lost:
        ((X.AbstractC461425c) r1).A0A.setVisibility(r5);
        r2 = r1.A0Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0073, code lost:
        if (r2 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0075, code lost:
        r2.A08.setVisibility(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x007a, code lost:
        if (r5 != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x007c, code lost:
        r1 = r2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x007e, code lost:
        if (r1 < 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0080, code lost:
        r2.A09.A0u(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0085, code lost:
        r1 = r7.A0H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0087, code lost:
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0089, code lost:
        ((X.AbstractC461425c) r1).A0A.setVisibility(r4);
        r0 = r1.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0090, code lost:
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0092, code lost:
        r0.A06.setVisibility(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0097, code lost:
        r0 = r7.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0099, code lost:
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x009b, code lost:
        r0.setVisibility(r4);
        r7.A04.setVisibility(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00a3, code lost:
        r7.A02.setVisibility(r3);
        r7.A00 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00aa, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00ab, code lost:
        r0.clearFocus();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00af, code lost:
        r3 = 8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0F(int r8) {
        /*
            r7 = this;
            r6 = 2
            r2 = 1
            r3 = 0
            if (r8 == 0) goto Ld
            if (r8 == r2) goto Lb6
            if (r8 != r6) goto Lb3
            X.25b r0 = r7.A0M
            if (r0 == 0) goto Lb3
        Ld:
            r4 = 8
            r5 = 0
            if (r8 == r6) goto Laf
        L12:
            r5 = 8
            if (r8 != 0) goto Laf
        L16:
            android.widget.ImageView r1 = r7.A0C
            r0 = 2131231493(0x7f080305, float:1.8079069E38)
            if (r8 != 0) goto L20
            r0 = 2131231494(0x7f080306, float:1.807907E38)
        L20:
            r1.setImageResource(r0)
            android.widget.ImageView r1 = r7.A0D
            r0 = 2131231522(0x7f080322, float:1.8079127E38)
            if (r8 != r2) goto L2d
            r0 = 2131231526(0x7f080326, float:1.8079136E38)
        L2d:
            r1.setImageResource(r0)
            android.widget.ImageView r1 = r7.A0E
            r0 = 2131231722(0x7f0803ea, float:1.8079533E38)
            if (r8 != r6) goto L3a
            r0 = 2131231723(0x7f0803eb, float:1.8079535E38)
        L3a:
            r1.setImageResource(r0)
            android.view.View r0 = r7.A09
            r7.A0H(r0, r8)
            android.view.ViewGroup r1 = r7.A05
            r0 = 2131362672(0x7f0a0370, float:1.8345131E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setVisibility(r3)
            android.view.ViewGroup r1 = r7.A05
            r0 = 2131364731(0x7f0a0b7b, float:1.8349307E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setVisibility(r5)
            com.whatsapp.WaEditText r0 = r7.A0I
            if (r0 == 0) goto L63
            if (r8 != 0) goto Lab
            r0.requestFocus()
        L63:
            android.view.View r0 = r7.A03
            r0.setVisibility(r3)
            X.25b r1 = r7.A0M
            if (r1 == 0) goto L85
            androidx.viewpager.widget.ViewPager r0 = r1.A0A
            r0.setVisibility(r5)
            X.3rM r2 = r1.A0Y
            if (r2 == 0) goto L85
            android.view.View r0 = r2.A08
            r0.setVisibility(r5)
            if (r5 != 0) goto L85
            int r1 = r2.A01
            if (r1 < 0) goto L85
            androidx.recyclerview.widget.LinearLayoutManager r0 = r2.A09
            r0.A0u(r1)
        L85:
            X.2JN r1 = r7.A0H
            if (r1 == 0) goto L97
            androidx.viewpager.widget.ViewPager r0 = r1.A0A
            r0.setVisibility(r4)
            X.3Bl r0 = r1.A07
            if (r0 == 0) goto L97
            android.view.ViewGroup r0 = r0.A06
            r0.setVisibility(r4)
        L97:
            android.view.View r0 = r7.A06
            if (r0 == 0) goto La3
            r0.setVisibility(r4)
            android.view.View r0 = r7.A04
            r0.setVisibility(r4)
        La3:
            android.view.View r0 = r7.A02
            r0.setVisibility(r3)
            r7.A00 = r8
            return
        Lab:
            r0.clearFocus()
            goto L63
        Laf:
            r3 = 8
            goto L16
        Lb3:
            r8 = 0
            goto Ld
        Lb6:
            r4 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48352Ex.A0F(int):void");
    }

    public final void A0G(int i) {
        ImageButton imageButton = super.A0G;
        if (imageButton == null) {
            return;
        }
        if (i == 0) {
            int i2 = ((C48362Ey) this).A01;
            if (i2 == 0) {
                return;
            }
            if (i2 == 2) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.7f);
                alphaAnimation.setFillAfter(false);
                alphaAnimation.setDuration(75L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: X.2w1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    {
                        C48352Ex.this = this;
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        C48352Ex.this.A0D();
                    }
                });
                imageButton.startAnimation(alphaAnimation);
            } else {
                A0D();
            }
            ((C48362Ey) this).A01 = 0;
        } else if (i != 1) {
            if (i != 2 || ((C48362Ey) this).A01 == 2) {
                return;
            }
            Activity activity = ((C0R7) this).A02;
            imageButton.setImageDrawable(C02180Ae.A0O(activity, R.drawable.sticker_rec, R.color.stickerSuggestionIconTint));
            imageButton.setContentDescription(activity.getString(R.string.sticker_contexual_suggestion_content_description));
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.7f, 1.0f);
            alphaAnimation2.setFillAfter(false);
            alphaAnimation2.setDuration(100L);
            imageButton.startAnimation(alphaAnimation2);
            imageButton.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 5));
            ((C48362Ey) this).A01 = 2;
        } else if (((C48362Ey) this).A01 == 1) {
        } else {
            A08();
        }
    }

    public final void A0H(View view, int i) {
        if (i != 0) {
            if (i == 1) {
                view.setVisibility(0);
                return;
            } else if (i != 2) {
                return;
            }
        }
        view.setVisibility(super.A0N.A02 ? 0 : 8);
    }

    public void A0I(String str) {
        if (this.A0M == null || !isShowing()) {
            A09();
        }
        A0F(2);
        C461325b c461325b = this.A0M;
        c461325b.A0D = str;
        AbstractC461525e A00 = C461325b.A00(c461325b.A0G, str);
        if (A00 != null) {
            c461325b.A02(c461325b.A0G.indexOf(A00), true);
            c461325b.A0D = null;
        }
    }

    public final boolean A0J() {
        C82883rE c82883rE;
        C49712Mb c49712Mb = this.A0b;
        if (c49712Mb != null && c49712Mb.A00 && (c82883rE = this.A0c) != null) {
            C0HK c0hk = c82883rE.A02;
            if (c0hk.A01() != null && !((List) c0hk.A01()).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC48372Ez
    public void AKr(C49302Jn c49302Jn) {
        InterfaceC04790Lv interfaceC04790Lv;
        A07();
        C66493Bg c66493Bg = this.A0G;
        if (c66493Bg == null || (interfaceC04790Lv = c66493Bg.A06.A00) == null) {
            return;
        }
        interfaceC04790Lv.AKr(c49302Jn);
    }

    @Override // X.C0R7, android.widget.PopupWindow
    public void dismiss() {
        C2MQ c2mq = this.A0U;
        if (c2mq != null) {
            this.A0e.AS1(new RunnableEBaseShape3S0100000_I0_3(c2mq, 3));
        }
        C461325b c461325b = this.A0M;
        if (c461325b != null) {
            ((AbstractC461425c) c461325b).A0A.getViewTreeObserver().removeGlobalOnLayoutListener(c461325b.A0L);
            c461325b.A0H = false;
        }
        C000200d.A0g(((C0R7) this).A06, "emoji_popup_window_tab_state", this.A00);
        super.dismiss();
    }
}
