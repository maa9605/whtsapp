package com.whatsapp.biz.cart.view.fragment;

import X.AbstractC000600i;
import X.ActivityC02330At;
import X.AnonymousClass008;
import X.AnonymousClass012;
import X.AnonymousClass029;
import X.AnonymousClass075;
import X.AnonymousClass088;
import X.AnonymousClass223;
import X.AnonymousClass272;
import X.C000200d;
import X.C000500h;
import X.C000700j;
import X.C002301c;
import X.C002701i;
import X.C012005w;
import X.C018108l;
import X.C018508q;
import X.C018608r;
import X.C018708s;
import X.C02160Ac;
import X.C02E;
import X.C02O;
import X.C05Y;
import X.C06C;
import X.C06K;
import X.C0AT;
import X.C0CR;
import X.C0E6;
import X.C0G5;
import X.C0GA;
import X.C0MU;
import X.C0VW;
import X.C0We;
import X.C1N6;
import X.C2A2;
import X.C2KK;
import X.C2KZ;
import X.C2Kf;
import X.C2L0;
import X.C2MB;
import X.C2MI;
import X.C2MT;
import X.C2N3;
import X.C2U0;
import X.C2n7;
import X.C32L;
import X.C34C;
import X.C40081rY;
import X.C40261rr;
import X.C41961un;
import X.C43871y8;
import X.C455822q;
import X.C468628o;
import X.C47682Ce;
import X.C48362Ey;
import X.C49382Kc;
import X.C49402Ke;
import X.C49412Kg;
import X.C49462Ko;
import X.C49472Kp;
import X.C49492Kt;
import X.C49882My;
import X.C56002mY;
import X.C56012mZ;
import X.C56022ma;
import X.C56322n5;
import X.C68283Iw;
import X.InterfaceC002901k;
import X.InterfaceC04830Lz;
import X.InterfaceC05620Pl;
import X.InterfaceC09180cm;
import android.app.Dialog;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaButton;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GetVNameCertificateJob;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.util.ViewOnClickCListenerShape8S0100000_I0_0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class CartFragment extends Hilt_CartFragment {
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public ImageButton A08;
    public AbstractC000600i A09;
    public C012005w A0A;
    public C018508q A0B;
    public KeyboardPopupLayout A0C;
    public C018608r A0D;
    public WaButton A0E;
    public C0E6 A0F;
    public WaTextView A0G;
    public WaTextView A0H;
    public WaTextView A0I;
    public WaTextView A0J;
    public C06K A0K;
    public C49882My A0L;
    public C2KK A0M;
    public C56012mZ A0N;
    public C32L A0O;
    public C49492Kt A0P;
    public C49462Ko A0Q;
    public C2MT A0R;
    public C2N3 A0S;
    public AnonymousClass272 A0T;
    public C68283Iw A0U;
    public C40261rr A0V;
    public AnonymousClass008 A0W;
    public AnonymousClass075 A0X;
    public C018708s A0Y;
    public C02E A0Z;
    public AnonymousClass012 A0a;
    public C000500h A0b;
    public C002301c A0c;
    public C43871y8 A0d;
    public C40081rY A0e;
    public C48362Ey A0f;
    public C47682Ce A0g;
    public C2MI A0h;
    public C455822q A0i;
    public UserJid A0j;
    public MentionableEntry A0k;
    public C05Y A0l;
    public C02O A0m;
    public C2MB A0n;
    public C41961un A0o;
    public InterfaceC002901k A0p;
    public static final HashMap A0u = new HashMap();
    public static final HashMap A0t = new HashMap();
    public final C0GA A0s = new C0GA() { // from class: X.32Y
        {
            CartFragment.this = this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x002a, code lost:
            if (r11.equals(r4.A0L) == false) goto L21;
         */
        @Override // X.C0GA
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void A03(com.whatsapp.jid.UserJid r11) {
            /*
                r10 = this;
                com.whatsapp.biz.cart.view.fragment.CartFragment r1 = com.whatsapp.biz.cart.view.fragment.CartFragment.this
                r1.A1D()
                boolean r0 = r1.A0q
                if (r0 == 0) goto L42
                com.whatsapp.mentions.MentionableEntry r0 = r1.A0k
                java.lang.String r0 = r0.getStringText()
                java.lang.String r5 = r0.trim()
                X.2Kt r4 = r1.A0P
                X.32L r7 = r1.A0O
                X.0At r8 = r1.A0A()
                X.0As r8 = (X.ActivityC02320As) r8
                X.2N3 r9 = r1.A0S
                if (r4 == 0) goto L50
                if (r11 == 0) goto L2c
                com.whatsapp.jid.UserJid r0 = r4.A0L
                boolean r1 = r11.equals(r0)
                r0 = 1
                if (r1 != 0) goto L2d
            L2c:
                r0 = 0
            L2d:
                if (r7 == 0) goto L42
                if (r9 == 0) goto L42
                if (r0 == 0) goto L42
                X.075 r0 = r4.A0I
                com.whatsapp.jid.UserJid r3 = r4.A0L
                X.08l r0 = r0.A00(r3)
                if (r0 == 0) goto L43
                java.lang.String r6 = r0.A08
            L3f:
                r4.A02(r5, r6, r7, r8, r9)
            L42:
                return
            L43:
                X.08s r2 = r4.A0J
                X.06C r1 = new X.06C
                r1.<init>(r3)
                r0 = 0
                java.lang.String r6 = r2.A08(r1, r0)
                goto L3f
            L50:
                r0 = 0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C32Y.A03(com.whatsapp.jid.UserJid):void");
        }
    };
    public boolean A0q = false;
    public final InterfaceC09180cm A0r = new InterfaceC09180cm() { // from class: X.32Z
        {
            CartFragment.this = this;
        }

        @Override // X.InterfaceC09180cm
        public void AHj() {
            CartFragment.this.A0k.dispatchKeyEvent(new KeyEvent(0, 67));
        }

        @Override // X.InterfaceC09180cm
        public void AJi(int[] iArr) {
            C002701i.A1H(CartFragment.this.A0k, iArr, 65536);
        }
    };

    @Override // X.C0BA
    public void A0f() {
        MentionableEntry mentionableEntry;
        super.A0U = true;
        UserJid userJid = this.A0j;
        if (userJid == null || (mentionableEntry = this.A0k) == null) {
            return;
        }
        A0u.put(userJid, C002701i.A0t(mentionableEntry.getStringText()));
        A0t.put(this.A0j, AnonymousClass029.A0v(this.A0k.getMentions()));
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0k(Bundle bundle) {
        int i;
        super.A0k(bundle);
        if (this.A0f.isShowing()) {
            i = 1;
            this.A00 = 1;
        } else if (C2MB.A00(this.A0C)) {
            i = 0;
            this.A00 = 0;
        } else {
            i = 2;
            this.A00 = 2;
        }
        bundle.putInt("extra_input_method", i);
        bundle.putBoolean("extra_is_sending_order", this.A0q);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [X.2Ku] */
    /* JADX WARN: Type inference failed for: r1v44, types: [X.2mZ] */
    /* JADX WARN: Type inference failed for: r2v25, types: [X.2mr] */
    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Parcelable parcelable = A02().getParcelable("extra_business_id");
        if (parcelable != null) {
            this.A0j = (UserJid) parcelable;
            View inflate = layoutInflater.inflate(R.layout.fragment_cart, viewGroup, false);
            this.A06 = inflate;
            this.A0C = (KeyboardPopupLayout) C0AT.A0D(inflate, R.id.cart);
            this.A0k = (MentionableEntry) C0AT.A0D(this.A06, R.id.entry);
            this.A08 = (ImageButton) C0AT.A0D(this.A06, R.id.emoji_picker_btn);
            this.A05 = C0AT.A0D(this.A06, R.id.footer);
            this.A0J = (WaTextView) C0AT.A0D(this.A06, R.id.cart_total_quantity);
            this.A04 = C0AT.A0D(this.A06, R.id.cart_empty_container);
            this.A0I = (WaTextView) C0AT.A0D(this.A06, R.id.cart_estimated_value);
            this.A03 = C0AT.A0D(this.A06, R.id.cart_items_container);
            this.A0H = (WaTextView) C0AT.A0D(this.A06, R.id.empty_cart_title);
            this.A0G = (WaTextView) C0AT.A0D(this.A06, R.id.empty_cart_description);
            this.A07 = C0AT.A0D(this.A06, R.id.cart_empty_view_catalog_btn);
            this.A0E = (WaButton) C0AT.A0D(this.A06, R.id.add_more_btn);
            View A0D = C0AT.A0D(this.A06, R.id.send);
            View A0D2 = C0AT.A0D(this.A06, R.id.cart_close_btn);
            RecyclerView recyclerView = (RecyclerView) C0AT.A0D(this.A06, R.id.cart_items_recycler_view);
            this.A06.setMinimumHeight(A19());
            View A0D3 = C0AT.A0D(this.A06, R.id.text_entry_layout);
            int max = Math.max(A0D3.getPaddingLeft(), A0D3.getPaddingRight());
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) A0D3.getLayoutParams();
            if (this.A0c.A0M()) {
                layoutParams.rightMargin = max;
            } else {
                layoutParams.leftMargin = max;
            }
            A0D3.setLayoutParams(layoutParams);
            this.A0N = new Object() { // from class: X.2mZ
            };
            this.A02 = A01().getDimensionPixelSize(R.dimen.order_message_thumbnail_width);
            this.A01 = A01().getDimensionPixelSize(R.dimen.order_message_thumbnail_height);
            C018508q c018508q = this.A0B;
            C05Y c05y = this.A0l;
            C2KZ c2kz = new C2KZ(this.A0j, this.A0p, this.A0M, this.A0T, new C49402Ke(c018508q, c05y, new C2Kf(new C49412Kg())), new C2L0(c018508q, c05y, new C56022ma(new C49412Kg(), new C2U0(), new Object() { // from class: X.2mr
            })), this.A0K, this.A0Q);
            Dialog dialog = ((DialogFragment) this).A03;
            if (dialog != null && dialog.getWindow() != null) {
                ((DialogFragment) this).A03.getWindow().setSoftInputMode(16);
            }
            this.A0k.setHint(A00().getString(R.string.type_a_message));
            this.A0O = new C32L(c2kz, this.A0c, this.A0S, this);
            A0D.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 1));
            this.A0E.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 2));
            A0D2.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 3));
            this.A07.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 4));
            recyclerView.A0i = true;
            C0AT.A0f(recyclerView, false);
            recyclerView.setAdapter(this.A0O);
            C34C c34c = new C34C(A0A().getApplication(), this.A0c);
            C0VW ADv = ADv();
            String canonicalName = C68283Iw.class.getCanonicalName();
            if (canonicalName != null) {
                String A0H = C000200d.A0H("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                HashMap hashMap = ADv.A00;
                Object obj = (C0MU) hashMap.get(A0H);
                if (!C68283Iw.class.isInstance(obj)) {
                    obj = new C68283Iw(c34c.A00, c34c.A01);
                    C0MU c0mu = (C0MU) hashMap.put(A0H, obj);
                    if (c0mu != null) {
                        c0mu.A01();
                    }
                }
                this.A0U = (C68283Iw) obj;
                C0CR c0cr = new C0CR(this.A0a, new Object() { // from class: X.2Ku
                }, this.A0j, this.A0D, this.A0F, c2kz, this.A0Y, new C49472Kp(this.A0p, this.A0A, this.A0o), this.A0X, this.A0Q) { // from class: X.32c
                    public final C018608r A00;
                    public final C0E6 A01;
                    public final C2KZ A02;
                    public final C49502Ku A03;
                    public final C49462Ko A04;
                    public final C49472Kp A05;
                    public final AnonymousClass075 A06;
                    public final C018708s A07;
                    public final AnonymousClass012 A08;
                    public final UserJid A09;

                    {
                        this.A08 = r1;
                        this.A03 = r2;
                        this.A09 = r3;
                        this.A00 = r4;
                        this.A01 = r5;
                        this.A02 = c2kz;
                        this.A07 = r7;
                        this.A05 = r8;
                        this.A06 = r9;
                        this.A04 = r10;
                    }

                    @Override // X.C0CR
                    public C0MU A6e(Class cls) {
                        return new C49492Kt(this.A08, this.A03, this.A09, this.A00, this.A02, this.A01, this.A05, this.A07, this.A06, this.A04);
                    }
                };
                C0VW ADv2 = ADv();
                String canonicalName2 = C49492Kt.class.getCanonicalName();
                if (canonicalName2 != null) {
                    String A0H2 = C000200d.A0H("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName2);
                    HashMap hashMap2 = ADv2.A00;
                    C0MU c0mu2 = (C0MU) hashMap2.get(A0H2);
                    if (!C49492Kt.class.isInstance(c0mu2)) {
                        c0mu2 = c0cr.A6e(C49492Kt.class);
                        C0MU c0mu3 = (C0MU) hashMap2.put(A0H2, c0mu2);
                        if (c0mu3 != null) {
                            c0mu3.A01();
                        }
                    }
                    C49492Kt c49492Kt = (C49492Kt) c0mu2;
                    this.A0P = c49492Kt;
                    c49492Kt.A07.A05(A0D(), new InterfaceC05620Pl() { // from class: X.32O
                        {
                            CartFragment.this = this;
                        }

                        @Override // X.InterfaceC05620Pl
                        public final void AIK(Object obj2) {
                            CartFragment cartFragment = CartFragment.this;
                            if (((Boolean) obj2).booleanValue()) {
                                ((ActivityC02290Ap) cartFragment.A0A()).ARS();
                                C09250cv.A00(cartFragment.A05(), cartFragment.A00().getString(R.string.catalog_something_went_wrong_error), 0).A04();
                            }
                        }
                    });
                    this.A0P.A0A.A05(A0D(), new InterfaceC05620Pl() { // from class: X.32X
                        {
                            CartFragment.this = this;
                        }

                        @Override // X.InterfaceC05620Pl
                        public final void AIK(Object obj2) {
                            String str;
                            CartFragment cartFragment = CartFragment.this;
                            String trim = cartFragment.A0k.getStringText().trim();
                            cartFragment.A0k.setText("");
                            C49492Kt c49492Kt2 = cartFragment.A0P;
                            ActivityC02320As activityC02320As = (ActivityC02320As) cartFragment.A0A();
                            C32L c32l = cartFragment.A0O;
                            C2N3 c2n3 = cartFragment.A0S;
                            AnonymousClass075 anonymousClass075 = c49492Kt2.A0I;
                            UserJid userJid = c49492Kt2.A0L;
                            C018108l A00 = anonymousClass075.A00(userJid);
                            if (A00 != null && (str = A00.A08) != null) {
                                c49492Kt2.A02(trim, str, c32l, activityC02320As, c2n3);
                                return;
                            }
                            c49492Kt2.A0D.A00.A01(new GetVNameCertificateJob(userJid));
                        }
                    });
                    this.A0P.A02.A05(A0D(), new InterfaceC05620Pl() { // from class: X.32N
                        {
                            CartFragment.this = this;
                        }

                        @Override // X.InterfaceC05620Pl
                        public final void AIK(Object obj2) {
                            CartFragment cartFragment = CartFragment.this;
                            List<C49382Kc> list = (List) obj2;
                            ((ActivityC02290Ap) cartFragment.A0A()).ARS();
                            C32L c32l = cartFragment.A0O;
                            synchronized (c32l) {
                                ArrayList arrayList = new ArrayList();
                                for (C49382Kc c49382Kc : list) {
                                    if (c49382Kc.A01.A02 == 0) {
                                        arrayList.add(c49382Kc);
                                    }
                                }
                                c32l.A01 = arrayList;
                                c32l.A00 = new Date();
                                ((AbstractC04890Mh) c32l).A01.A00();
                            }
                            cartFragment.A1B();
                            C49492Kt c49492Kt2 = cartFragment.A0P;
                            int i = cartFragment.A02;
                            int i2 = cartFragment.A01;
                            List<C49382Kc> list2 = cartFragment.A0O.A01;
                            if (!c49492Kt2.A00 && !list2.isEmpty()) {
                                c49492Kt2.A00 = true;
                                ArrayList arrayList2 = new ArrayList(list2.size());
                                for (C49382Kc c49382Kc2 : list2) {
                                    arrayList2.add(c49382Kc2.A01.A09);
                                }
                                C2KZ c2kz2 = c49492Kt2.A0E;
                                UserJid userJid = c49492Kt2.A0L;
                                C2L0 c2l0 = c2kz2.A0C;
                                c2l0.A00 = c2kz2.A0I;
                                C05Y c05y2 = c2l0.A03;
                                String A02 = c05y2.A02();
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(new C02590Ca("width", (C04P[]) null, Integer.toString(i)));
                                arrayList3.add(new C02590Ca("height", (C04P[]) null, Integer.toString(i2)));
                                C02590Ca c02590Ca = new C02590Ca("image_dimensions", null, (C02590Ca[]) arrayList3.toArray(new C02590Ca[0]), null);
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(c02590Ca);
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.add(new C02590Ca("id", (C04P[]) null, (String) it.next()));
                                    arrayList4.add(new C02590Ca("product", null, (C02590Ca[]) arrayList5.toArray(new C02590Ca[0]), null));
                                }
                                c05y2.A06(253, A02, new C02590Ca("iq", new C04P[]{new C04P("smax_id", "11", null, (byte) 0), new C04P("id", A02, null, (byte) 0), new C04P("xmlns", "fb:thrift_iq", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("to", C04260Jm.A00)}, new C02590Ca("cart", new C04P[]{new C04P("op", "refresh", null, (byte) 0), new C04P("biz_jid", userJid.getRawString(), null, (byte) 0)}, (C02590Ca[]) arrayList4.toArray(new C02590Ca[0]), null)), c2l0, 32000L);
                                C000200d.A0x("RefreshCart/sendRefreshCartRequest biz_jid=", userJid);
                            }
                        }
                    });
                    this.A0P.A09.A05(A0D(), new InterfaceC05620Pl() { // from class: X.32W
                        {
                            CartFragment.this = this;
                        }

                        @Override // X.InterfaceC05620Pl
                        public final void AIK(Object obj2) {
                            CartFragment cartFragment = CartFragment.this;
                            if (((Boolean) obj2).booleanValue()) {
                                cartFragment.A0q = false;
                                ((ActivityC02290Ap) cartFragment.A0A()).ARS();
                                C09250cv.A00(cartFragment.A05(), cartFragment.A00().getString(R.string.catalog_something_went_wrong_error), 0).A04();
                            }
                        }
                    });
                    this.A0P.A06.A05(A0D(), new InterfaceC05620Pl() { // from class: X.32U
                        {
                            CartFragment.this = this;
                        }

                        @Override // X.InterfaceC05620Pl
                        public final void AIK(Object obj2) {
                            CartFragment cartFragment = CartFragment.this;
                            boolean booleanValue = ((Boolean) obj2).booleanValue();
                            cartFragment.A07.setVisibility(booleanValue ? 0 : 8);
                            cartFragment.A0E.setVisibility(booleanValue ? 0 : 8);
                        }
                    });
                    this.A0P.A05.A05(A0D(), new InterfaceC05620Pl() { // from class: X.32T
                        {
                            CartFragment.this = this;
                        }

                        @Override // X.InterfaceC05620Pl
                        public final void AIK(Object obj2) {
                            CartFragment cartFragment = CartFragment.this;
                            if (((Boolean) obj2).booleanValue()) {
                                C49492Kt c49492Kt2 = cartFragment.A0P;
                                c49492Kt2.A00 = false;
                                c49492Kt2.A01 = false;
                                C2KZ c2kz2 = c49492Kt2.A0E;
                                c2kz2.A0J.AS1(new RunnableEBaseShape0S0100000_I0_0(c2kz2, 29));
                            }
                        }
                    });
                    this.A0P.A08.A05(A0D(), new InterfaceC05620Pl() { // from class: X.32S
                        {
                            CartFragment.this = this;
                        }

                        @Override // X.InterfaceC05620Pl
                        public final void AIK(Object obj2) {
                            CartFragment cartFragment = CartFragment.this;
                            if (((Boolean) obj2).booleanValue()) {
                                C49492Kt c49492Kt2 = cartFragment.A0P;
                                if (!c49492Kt2.A01) {
                                    c49492Kt2.A07.A0A(Boolean.TRUE);
                                }
                            }
                        }
                    });
                    this.A0P.A04.A05(A0D(), new InterfaceC05620Pl() { // from class: X.32Q
                        {
                            CartFragment.this = this;
                        }

                        @Override // X.InterfaceC05620Pl
                        public final void AIK(Object obj2) {
                            CartFragment cartFragment = CartFragment.this;
                            String str = (String) obj2;
                            C32L c32l = cartFragment.A0O;
                            int i = 0;
                            while (true) {
                                if (i >= c32l.A01.size()) {
                                    break;
                                } else if (str.equals(((C49382Kc) c32l.A01.get(i)).A01.A09)) {
                                    c32l.A01.remove(i);
                                    c32l.A04(i);
                                    break;
                                } else {
                                    i++;
                                }
                            }
                            cartFragment.A1B();
                        }
                    });
                    this.A0P.A0B.A05(A0D(), new InterfaceC05620Pl() { // from class: X.32P
                        {
                            CartFragment.this = this;
                        }

                        @Override // X.InterfaceC05620Pl
                        public final void AIK(Object obj2) {
                            CartFragment cartFragment = CartFragment.this;
                            Pair pair = (Pair) obj2;
                            C32L c32l = cartFragment.A0O;
                            if (c32l != null) {
                                String str = (String) pair.first;
                                Number number = (Number) pair.second;
                                if (str != null && number != null) {
                                    int i = 0;
                                    while (true) {
                                        if (i >= c32l.A01.size()) {
                                            break;
                                        } else if (str.equals(((C49382Kc) c32l.A01.get(i)).A01.A09)) {
                                            ((C49382Kc) c32l.A01.get(i)).A00 = number.intValue();
                                            c32l.A02(i);
                                            break;
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                                cartFragment.A1B();
                                return;
                            }
                            throw null;
                        }
                    });
                    this.A0P.A03.A05(A0D(), new InterfaceC05620Pl() { // from class: X.32V
                        {
                            CartFragment.this = this;
                        }

                        @Override // X.InterfaceC05620Pl
                        public final void AIK(Object obj2) {
                            CartFragment cartFragment = CartFragment.this;
                            int intValue = ((Number) obj2).intValue();
                            C019208x c019208x = new C019208x(cartFragment.A00());
                            C019308y c019308y = c019208x.A01;
                            c019308y.A0J = false;
                            c019308y.A0E = c019308y.A0O.getText(intValue);
                            c019208x.A06(R.string.ok, null);
                            c019208x.A00().show();
                        }
                    });
                    C49492Kt c49492Kt2 = this.A0P;
                    c49492Kt2.A00 = false;
                    c49492Kt2.A01 = true;
                    C2KZ c2kz2 = c49492Kt2.A0E;
                    c2kz2.A0J.AS1(new RunnableEBaseShape0S0100000_I0_0(c2kz2, 29));
                    final C2KZ c2kz3 = this.A0P.A0E;
                    c2kz3.A0A.A04(c2kz3.A0G, new C1N6() { // from class: X.32J
                        @Override // X.C1N6
                        public final void AI2(C05210Nt c05210Nt) {
                            c2kz3.A04.A0A(Boolean.valueOf(c05210Nt.A09));
                        }
                    });
                    A1D();
                    this.A0f = new C48362Ey(A0A(), this.A0i, this.A0n, this.A09, this.A0e, this.A0d, this.A0g, this.A0Z, this.A0c, this.A0h, this.A0b, this.A0m, this.A0C, this.A08, this.A0k);
                    new AnonymousClass223((EmojiSearchContainer) this.A0C.findViewById(R.id.emoji_search_container), this.A0f, A0A(), this.A0e, this.A0g, this.A0c, this.A0m).A00 = new InterfaceC04830Lz() { // from class: X.32R
                        {
                            CartFragment.this = this;
                        }

                        @Override // X.InterfaceC04830Lz
                        public final void AJj(C2CI c2ci) {
                            CartFragment.this.A0r.AJi(c2ci.A00);
                        }
                    };
                    C48362Ey c48362Ey = this.A0f;
                    c48362Ey.A0A(this.A0r);
                    c48362Ey.A0C = new RunnableEBaseShape0S0100000_I0_0(this, 30);
                    String str = (String) A0u.get(this.A0j);
                    if (!TextUtils.isEmpty(str)) {
                        this.A0k.setMentionableText(str, AnonymousClass029.A0y((String) A0t.get(this.A0j)));
                    }
                    this.A0Q.A02(37, 52, null, this.A0j);
                    A1C();
                    return this.A06;
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        throw null;
    }

    @Override // X.C0BA
    public void A0q() {
        super.A0U = true;
        this.A0S.A00();
        this.A0W.A00(this.A0s);
    }

    @Override // X.C0BA
    public void A0s() {
        super.A0U = true;
        ActivityC02330At A0A = A0A();
        int i = this.A00;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
            } else if (!this.A0f.isShowing()) {
                this.A0C.post(new RunnableEBaseShape0S0100000_I0_0(this, 31));
            }
            A0A.getWindow().setSoftInputMode(2);
            return;
        }
        A0A.getWindow().setSoftInputMode(4);
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        this.A0W.A01(this.A0s);
        this.A0S = new C2N3(this.A0R);
        if (bundle == null) {
            this.A00 = 2;
            return;
        }
        this.A00 = bundle.getInt("extra_input_method");
        this.A0q = bundle.getBoolean("extra_is_sending_order");
    }

    @Override // com.whatsapp.RoundedBottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public int A0x() {
        return R.style.CartFragmentTheme;
    }

    @Override // com.whatsapp.RoundedBottomSheetDialogFragment
    public void A1A(View view) {
        super.A1A(view);
        BottomSheetBehavior.A00(view).A0J = false;
    }

    public final void A1B() {
        C2n7 c2n7;
        int A0G = this.A0O.A0G();
        this.A0J.setText(this.A0c.A0A(R.plurals.products_total_quantity, A0G, Integer.valueOf(A0G)));
        C56012mZ c56012mZ = this.A0N;
        C32L c32l = this.A0O;
        List<C49382Kc> list = c32l.A01;
        Date date = c32l.A00;
        if (c56012mZ != null) {
            ArrayList arrayList = new ArrayList();
            for (C49382Kc c49382Kc : list) {
                C468628o c468628o = c49382Kc.A01;
                List list2 = c468628o.A0D;
                if (!list2.isEmpty()) {
                    c2n7 = new C2n7(((C2A2) list2.get(0)).A02, ((C2A2) list2.get(0)).A03);
                } else {
                    c2n7 = null;
                }
                arrayList.add(new C56322n5(c468628o.A09, c468628o.A0B, AnonymousClass088.A12(c468628o.A0C, c468628o.A05, date), c468628o.A03, c2n7, (int) c49382Kc.A00));
            }
            this.A0I.setText(this.A0U.A02(arrayList));
            if (this.A0O.A0G() == 0) {
                this.A0Q.A02(31, 55, null, this.A0j);
                this.A04.setVisibility(0);
                this.A03.setVisibility(8);
                this.A05.setVisibility(8);
            } else {
                this.A03.setVisibility(0);
                this.A05.setVisibility(0);
                this.A04.setVisibility(8);
            }
            C49882My c49882My = this.A0L;
            C000700j.A01();
            Iterator it = c49882My.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((C56002mY) c0g5.next()).A00();
                } else {
                    return;
                }
            }
        } else {
            throw null;
        }
    }

    public final void A1C() {
        int dimensionPixelSize = A01().getDimensionPixelSize(R.dimen.horizontal_padding);
        int i = dimensionPixelSize << 1;
        if (A01().getConfiguration().orientation != 1) {
            dimensionPixelSize >>= 1;
            i = dimensionPixelSize;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A0H.getLayoutParams();
        layoutParams.topMargin = i;
        this.A0H.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.A0G.getLayoutParams();
        layoutParams2.topMargin = dimensionPixelSize;
        this.A0G.setLayoutParams(layoutParams2);
    }

    public final void A1D() {
        String A08;
        C49492Kt c49492Kt = this.A0P;
        AnonymousClass075 anonymousClass075 = c49492Kt.A0I;
        UserJid userJid = c49492Kt.A0L;
        C018108l A00 = anonymousClass075.A00(userJid);
        if (A00 != null) {
            A08 = A00.A08;
        } else {
            A08 = c49492Kt.A0J.A08(new C06C(userJid), false);
        }
        if (TextUtils.isEmpty(A08)) {
            return;
        }
        View A0D = C0AT.A0D(this.A06, R.id.recipient_name_layout);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C0AT.A0D(this.A06, R.id.recipient_name_text);
        Typeface createFromAsset = Typeface.createFromAsset(A00().getAssets(), "fonts/Roboto-Medium.ttf");
        A0D.setVisibility(0);
        ((ImageView) C0AT.A0D(this.A06, R.id.recipient_name_prompt_icon)).setImageDrawable(new C0We(this.A0c, C02160Ac.A03(A00(), R.drawable.chevron)));
        textEmojiLabel.A03(A08);
        if (createFromAsset != null) {
            textEmojiLabel.setTypeface(createFromAsset);
        }
    }

    @Override // X.C0BA, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.A0U = true;
        A1C();
    }
}
