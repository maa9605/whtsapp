package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.transition.Slide;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaButton;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.catalog.CatalogCarouselDetailImageView;
import com.whatsapp.biz.catalog.CatalogMediaCard;
import com.whatsapp.biz.catalog.EllipsizedTextEmojiLabel;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.report.ReportActivity;
import com.whatsapp.util.ViewOnClickCListenerShape3S0200000_I0;
import com.whatsapp.util.ViewOnClickCListenerShape8S0100000_I0_0;
import java.io.File;
import java.util.AbstractList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2N4 */
/* loaded from: classes2.dex */
public abstract class C2N4 extends C2N5 implements C2N6 {
    public int A01;
    public View A02;
    public View A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextEmojiLabel A08;
    public C018608r A09;
    public WaButton A0A;
    public WaButton A0B;
    public WaTextView A0C;
    public WaTextView A0D;
    public C06K A0E;
    public C06M A0F;
    public C49882My A0G;
    public C2KK A0H;
    public C68193Il A0I;
    public C49462Ko A0J;
    public CatalogCarouselDetailImageView A0K;
    public C2MT A0L;
    public C2N3 A0M;
    public C2L3 A0N;
    public CatalogMediaCard A0O;
    public C06960Vv A0P;
    public EllipsizedTextEmojiLabel A0Q;
    public C464826z A0R;
    public AnonymousClass272 A0S;
    public C34S A0T;
    public C05W A0U;
    public C42371vd A0V;
    public AnonymousClass075 A0W;
    public C0E7 A0X;
    public C468628o A0Y;
    public UserJid A0Z;
    public InterfaceC002901k A0a;
    public String A0b;
    public String A0c;
    public boolean A0d;
    public boolean A0e;
    public int A00 = 0;
    public final C56002mY A0f = new C34N(this);

    public static void A00(UserJid userJid, String str, boolean z, Integer num, Integer num2, Context context, Intent intent, int i) {
        Activity A0G = C02180Ae.A0G(context, ActivityC02320As.class);
        if (A0G != null) {
            intent.putExtra("product", str);
            intent.putExtra("disable_report", z);
            intent.putExtra("jid", userJid.getRawString());
            if (num2 != null) {
                intent.putExtra("thumb_height", num2);
            }
            if (num != null) {
                intent.putExtra("thumb_width", num);
            }
            intent.putExtra("view_product_origin", i);
            A0G.startActivityForResult(intent, 0, !C56122mk.A00 ? null : C08950cN.A00(A0G, new C0FK[0]).A01());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x00d5, code lost:
        if (r8.A01() != false) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.0Mh, X.32w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1P() {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2N4.A1P():void");
    }

    public final void A1Q() {
        if (this.A0d) {
            return;
        }
        this.A0J.A03(12, 31, this.A0c, this.A0Z, null, null, null, null, (Boolean) this.A0I.A00.A01());
        this.A0d = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x003d, code lost:
        if (r9 == 404) goto L62;
     */
    @Override // X.C2N6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AKH(java.lang.String r8, int r9) {
        /*
            r7 = this;
            r7.A1Q()
            r0 = 3
            r7.A00 = r0
            X.26z r0 = r7.A0R
            if (r0 == 0) goto Lc6
            X.C000700j.A01()
            X.023 r0 = r0.A00
            java.util.Iterator r6 = r0.iterator()
        L13:
            r1 = r6
            X.0G5 r1 = (X.C0G5) r1
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lc5
            java.lang.Object r1 = r1.next()
            X.2Rx r1 = (X.AbstractC50472Rx) r1
            boolean r0 = r1 instanceof X.C50482Ry
            if (r0 == 0) goto L13
            X.2Ry r1 = (X.C50482Ry) r1
            com.whatsapp.biz.product.view.activity.ProductDetailActivity r4 = r1.A00
            X.28o r0 = r4.A0Y
            if (r0 == 0) goto L36
            java.lang.String r0 = r0.A09
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L13
        L36:
            r0 = 406(0x196, float:5.69E-43)
            if (r9 == r0) goto L3f
            r1 = 404(0x194, float:5.66E-43)
            r0 = 3
            if (r9 != r1) goto L40
        L3f:
            r0 = 2
        L40:
            r4.A00 = r0
            X.272 r3 = r4.A0S
            monitor-enter(r3)
            java.util.Map r2 = r3.A02     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r1 = r2.get(r8)     // Catch: java.lang.Throwable -> Lc2
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch: java.lang.Throwable -> Lc2
            java.util.Map r0 = r3.A01     // Catch: java.lang.Throwable -> Lc2
            r0.remove(r8)     // Catch: java.lang.Throwable -> Lc2
            r2.remove(r8)     // Catch: java.lang.Throwable -> Lc2
            if (r1 != 0) goto L59
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc2
            goto Lbd
        L59:
            java.util.Map r0 = r3.A00     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r5 = r0.get(r1)     // Catch: java.lang.Throwable -> Lc2
            X.29y r5 = (X.C29y) r5     // Catch: java.lang.Throwable -> Lc2
            if (r5 != 0) goto L65
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc2
            goto Lbd
        L65:
            r2 = 0
        L66:
            java.util.ArrayList r1 = r5.A03     // Catch: java.lang.Throwable -> Lc2
            int r0 = r1.size()     // Catch: java.lang.Throwable -> Lc2
            if (r2 >= r0) goto L7f
            java.lang.Object r0 = r1.get(r2)     // Catch: java.lang.Throwable -> Lc2
            X.28o r0 = (X.C468628o) r0     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = r0.A09     // Catch: java.lang.Throwable -> Lc2
            boolean r0 = r8.equals(r0)     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto Lb9
            r1.remove(r2)     // Catch: java.lang.Throwable -> Lc2
        L7f:
            java.util.ArrayList r0 = r5.A02     // Catch: java.lang.Throwable -> Lc2
            java.util.Iterator r5 = r0.iterator()     // Catch: java.lang.Throwable -> Lc2
        L85:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto Lbc
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> Lc2
            X.2A0 r2 = (X.C2A0) r2     // Catch: java.lang.Throwable -> Lc2
            r1 = 0
        L92:
            X.29z r0 = r2.A00     // Catch: java.lang.Throwable -> Lc2
            java.util.List r0 = r0.A04     // Catch: java.lang.Throwable -> Lc2
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lc2
            if (r1 >= r0) goto L85
            X.29z r0 = r2.A00     // Catch: java.lang.Throwable -> Lc2
            java.util.List r0 = r0.A04     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lc2
            X.28o r0 = (X.C468628o) r0     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = r0.A09     // Catch: java.lang.Throwable -> Lc2
            boolean r0 = r8.equals(r0)     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto Lb6
            X.29z r0 = r2.A00     // Catch: java.lang.Throwable -> Lc2
            java.util.List r0 = r0.A04     // Catch: java.lang.Throwable -> Lc2
            r0.remove(r1)     // Catch: java.lang.Throwable -> Lc2
            goto L85
        Lb6:
            int r1 = r1 + 1
            goto L92
        Lb9:
            int r2 = r2 + 1
            goto L66
        Lbc:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc2
        Lbd:
            r4.A1P()
            goto L13
        Lc2:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc2
            throw r0
        Lc5:
            return
        Lc6:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2N4.AKH(java.lang.String, int):void");
    }

    @Override // X.C2N6
    public void AKI(C60052tq c60052tq, String str) {
        this.A00 = 0;
        C464826z c464826z = this.A0R;
        if (c464826z != null) {
            C000700j.A01();
            Iterator it = c464826z.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    AbstractC50472Rx abstractC50472Rx = (AbstractC50472Rx) c0g5.next();
                    if (!(abstractC50472Rx instanceof C50482Ry)) {
                        if (abstractC50472Rx instanceof C50492Rz) {
                            ((C50492Rz) abstractC50472Rx).A00.A0D.A0L(str);
                        }
                    } else {
                        ProductDetailActivity productDetailActivity = ((C50482Ry) abstractC50472Rx).A00;
                        C468628o A06 = productDetailActivity.A0S.A06(str);
                        C468628o c468628o = productDetailActivity.A0Y;
                        if (c468628o == null || (c468628o.A09.equals(str) && !c468628o.equals(A06))) {
                            ((C2N4) productDetailActivity).A00 = 0;
                            productDetailActivity.A0Y = productDetailActivity.A0S.A06(str);
                            productDetailActivity.A1P();
                        }
                    }
                } else {
                    return;
                }
            }
        } else {
            throw null;
        }
    }

    public /* synthetic */ void lambda$onCreate$1198$ProductBaseActivity(View view) {
        startActivity(new Intent(this, ReportActivity.class));
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        C468628o c468628o;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 || (c468628o = this.A0Y) == null) {
            return;
        }
        if (i != 3) {
            if (i == 66) {
                this.A0P.A04(this, this.A0M, this.A0Z, 3, Collections.singletonList(c468628o), null, 0L, 0);
                return;
            }
            return;
        }
        List A0F = C003101m.A0F(AbstractC005302j.class, intent.getStringArrayListExtra("jids"));
        this.A09.A0F(this.A0Y, A0F, this.A0Z, Uri.fromFile(new File(intent.getStringExtra("file_path"))), null);
        AbstractList abstractList = (AbstractList) A0F;
        if (abstractList.size() == 1) {
            ((ActivityC02270An) this).A00.A07(this, Conversation.A00(this, this.A0U.A0A((AbstractC005302j) abstractList.get(0))));
        } else {
            A1L(A0F);
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [X.2nB] */
    @Override // X.C2N5, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (C56122mk.A00) {
            Window window = getWindow();
            window.requestFeature(13);
            Slide slide = new Slide(5);
            slide.excludeTarget(16908335, true);
            slide.excludeTarget(16908336, true);
            slide.setInterpolator(new DecelerateInterpolator());
            window.setEnterTransition(slide);
            window.setReturnTransition(slide);
        }
        super.onCreate(bundle);
        this.A01 = getIntent().getIntExtra("view_product_origin", 0);
        this.A0G.A01(this.A0f);
        UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("jid"));
        if (nullable != null) {
            this.A0Z = nullable;
            String stringExtra = getIntent().getStringExtra("product");
            if (stringExtra != null) {
                this.A0c = stringExtra;
                this.A0e = getIntent().getBooleanExtra("disable_report", false);
                setContentView(R.layout.business_product_catalog_detail);
                this.A0K = (CatalogCarouselDetailImageView) findViewById(R.id.catalog_carousel_detail_image_view);
                this.A08 = (TextEmojiLabel) findViewById(R.id.catalog_detail_title);
                this.A06 = (TextView) findViewById(R.id.catalog_detail_price);
                this.A0Q = (EllipsizedTextEmojiLabel) findViewById(R.id.catalog_detail_description);
                this.A05 = (TextView) findViewById(R.id.catalog_detail_link);
                this.A07 = (TextView) findViewById(R.id.catalog_detail_sku);
                this.A0D = (WaTextView) findViewById(R.id.loading_product_text);
                this.A0O = (CatalogMediaCard) findViewById(R.id.product_message_catalog_media_card);
                this.A04 = (TextView) findViewById(R.id.product_availability_label);
                this.A0C = (WaTextView) findViewById(R.id.cart_btn_text);
                if (((ActivityC02310Ar) this).A01.A0N()) {
                    this.A0C.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.cart_add_more_items, 0);
                } else {
                    this.A0C.setCompoundDrawablesWithIntrinsicBounds(R.drawable.cart_add_more_items, 0, 0, 0);
                }
                View findViewById = findViewById(R.id.cart_btn_container);
                this.A02 = findViewById;
                findViewById.setVisibility(8);
                WaButton waButton = (WaButton) findViewById(R.id.cart_btn);
                this.A0A = waButton;
                waButton.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 10));
                View findViewById2 = findViewById(R.id.request_report_btn_container);
                this.A03 = findViewById2;
                findViewById2.setVisibility(8);
                findViewById(R.id.report_btn).setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 22));
                ViewOnClickCListenerShape3S0200000_I0 viewOnClickCListenerShape3S0200000_I0 = new ViewOnClickCListenerShape3S0200000_I0(this, this, 1);
                WaButton waButton2 = (WaButton) findViewById(R.id.message_business_btn);
                this.A0B = waButton2;
                waButton2.setVisibility(8);
                this.A0B.setOnClickListener(viewOnClickCListenerShape3S0200000_I0);
                View findViewById3 = findViewById(R.id.product_detail_image_toolbar);
                if (findViewById3 != null) {
                    Toolbar toolbar = (Toolbar) findViewById3;
                    toolbar.setTitle("");
                    toolbar.A09();
                    A0k(toolbar);
                    C0U1 A0c = A0c();
                    if (A0c != null) {
                        A0c.A0L(true);
                    }
                    toolbar.setNavigationIcon(new C0We(((ActivityC02310Ar) this).A01, C02160Ac.A03(this, R.drawable.ic_back_shadow)));
                    this.A0Y = this.A0S.A06(this.A0c);
                    C2N3 c2n3 = this.A0M;
                    if (c2n3 != null) {
                        c2n3.A00();
                    }
                    this.A0M = new C2N3(this.A0L);
                    this.A0N.A0E.add(this);
                    if (((ActivityC02290Ap) this).A0B.A0E(C01C.A0m) && this.A01 == 6) {
                        this.A0a.AS1(new RunnableEBaseShape0S0100000_I0_0(this, 38));
                    }
                    C641032b c641032b = new C641032b(this.A0a, getApplication(), this.A0W, this.A0E, this.A0F, this.A0Z);
                    C0VW ADv = ADv();
                    String canonicalName = C68193Il.class.getCanonicalName();
                    if (canonicalName != null) {
                        String A0H = C000200d.A0H("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                        HashMap hashMap = ADv.A00;
                        C0MU c0mu = (C0MU) hashMap.get(A0H);
                        if (!C68193Il.class.isInstance(c0mu)) {
                            c0mu = c641032b.A6e(C68193Il.class);
                            C0MU c0mu2 = (C0MU) hashMap.put(A0H, c0mu);
                            if (c0mu2 != null) {
                                c0mu2.A01();
                            }
                        }
                        this.A0I = (C68193Il) c0mu;
                        C05220Nu A01 = this.A0E.A01(this.A0Z, null);
                        UserJid userJid = this.A0Z;
                        C0CR c0cr = new C0CR(new Object() { // from class: X.2nB
                        }, userJid, ((ActivityC02290Ap) this).A0B, new C49452Kn(userJid, this.A0a, this.A0H, this.A0E, this.A0J, A01), this.A01) { // from class: X.34T
                            public final int A00;
                            public final C01B A01;
                            public final C49452Kn A02;
                            public final C56372nB A03;
                            public final UserJid A04;

                            {
                                this.A03 = r1;
                                this.A04 = userJid;
                                this.A01 = r3;
                                this.A02 = r4;
                                this.A00 = r5;
                            }

                            @Override // X.C0CR
                            public C0MU A6e(Class cls) {
                                return new C34S(this.A03, this.A04, this.A02, this.A00);
                            }
                        };
                        C0VW ADv2 = ADv();
                        String canonicalName2 = C34S.class.getCanonicalName();
                        if (canonicalName2 != null) {
                            String A0H2 = C000200d.A0H("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName2);
                            HashMap hashMap2 = ADv2.A00;
                            C0MU c0mu3 = (C0MU) hashMap2.get(A0H2);
                            if (!C34S.class.isInstance(c0mu3)) {
                                c0mu3 = c0cr.A6e(C34S.class);
                                C0MU c0mu4 = (C0MU) hashMap2.put(A0H2, c0mu3);
                                if (c0mu4 != null) {
                                    c0mu4.A01();
                                }
                            }
                            C34S c34s = (C34S) c0mu3;
                            this.A0T = c34s;
                            c34s.A08.A05(this, new InterfaceC05620Pl() { // from class: X.34M
                                {
                                    C2N4.this = this;
                                }

                                @Override // X.InterfaceC05620Pl
                                public final void AIK(Object obj) {
                                    View view;
                                    C2N4 c2n4 = C2N4.this;
                                    if (((Boolean) obj).booleanValue() && (view = ((ActivityC02290Ap) c2n4).A04) != null) {
                                        C09250cv A00 = C09250cv.A00(view, c2n4.getResources().getString(R.string.item_added_to_cart), 0);
                                        A00.A06(A00.A02.getText(R.string.view_cart), new ViewOnClickCListenerShape8S0100000_I0_0(c2n4, 13));
                                        A00.A04();
                                        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c2n4.findViewById(R.id.menu_cart), PropertyValuesHolder.ofFloat("scaleX", 1.5f), PropertyValuesHolder.ofFloat("scaleY", 1.5f));
                                        ofPropertyValuesHolder.setDuration(180L);
                                        ofPropertyValuesHolder.setRepeatMode(2);
                                        ofPropertyValuesHolder.setRepeatCount(1);
                                        ofPropertyValuesHolder.start();
                                        c2n4.A0A.setEnabled(true);
                                        C49882My c49882My = c2n4.A0G;
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
                                    }
                                }
                            });
                            this.A0T.A06.A05(this, new InterfaceC05620Pl() { // from class: X.34H
                                {
                                    C2N4.this = this;
                                }

                                @Override // X.InterfaceC05620Pl
                                public final void AIK(Object obj) {
                                    View view;
                                    C2N4 c2n4 = C2N4.this;
                                    if (((Boolean) obj).booleanValue() && (view = ((ActivityC02290Ap) c2n4).A04) != null) {
                                        C09250cv.A00(view, c2n4.getResources().getString(R.string.catalog_something_went_wrong_error), 0).A04();
                                        c2n4.A0A.setEnabled(true);
                                    }
                                }
                            });
                            this.A0T.A07.A05(this, new InterfaceC05620Pl() { // from class: X.34F
                                {
                                    C2N4.this = this;
                                }

                                @Override // X.InterfaceC05620Pl
                                public final void AIK(Object obj) {
                                    View view;
                                    C2N4 c2n4 = C2N4.this;
                                    if (((Boolean) obj).booleanValue() && (view = ((ActivityC02290Ap) c2n4).A04) != null) {
                                        C09250cv A00 = C09250cv.A00(view, c2n4.getResources().getString(R.string.cant_add_more_items), -2);
                                        A00.A06(A00.A02.getText(R.string.ok), new ViewOnClickCListenerShape8S0100000_I0_0(A00));
                                        A00.A04();
                                        c2n4.A0A.setEnabled(true);
                                    }
                                }
                            });
                            this.A0T.A04.A05(this, new InterfaceC05620Pl() { // from class: X.34G
                                {
                                    C2N4.this = this;
                                }

                                @Override // X.InterfaceC05620Pl
                                public final void AIK(Object obj) {
                                    C2N4 c2n4 = C2N4.this;
                                    c2n4.A0b = c2n4.A0I.A02((List) obj);
                                    TextView textView = (TextView) c2n4.findViewById(R.id.cart_total_quantity);
                                    if (textView != null) {
                                        textView.setText(c2n4.A0b);
                                    }
                                }
                            });
                            return;
                        }
                        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                    }
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        boolean A00 = C34S.A00(this.A00, this.A0Y);
        final MenuItem findItem = menu.findItem(R.id.menu_cart);
        final MenuItem findItem2 = menu.findItem(R.id.menu_share);
        final MenuItem findItem3 = menu.findItem(R.id.menu_forward);
        findItem3.setVisible(A00);
        findItem2.setVisible(A00);
        findItem.setActionView(R.layout.menu_item_cart);
        findItem.getActionView().setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 12));
        TextView textView = (TextView) findItem.getActionView().findViewById(R.id.cart_total_quantity);
        String str = this.A0b;
        if (str != null) {
            textView.setText(str);
        }
        this.A0I.A00.A05(this, new InterfaceC05620Pl() { // from class: X.34I
            {
                C2N4.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                boolean z;
                C2N4 c2n4 = C2N4.this;
                MenuItem menuItem = findItem3;
                MenuItem menuItem2 = findItem2;
                MenuItem menuItem3 = findItem;
                if (((Boolean) obj).booleanValue() && c2n4.A0b != null) {
                    z = true;
                    menuItem.setShowAsAction(0);
                    menuItem2.setShowAsAction(0);
                } else {
                    z = false;
                    menuItem.setShowAsAction(1);
                    menuItem2.setShowAsAction(1);
                }
                menuItem3.setVisible(z);
                c2n4.A1Q();
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        this.A0G.A00(this.A0f);
        CatalogMediaCard catalogMediaCard = this.A0O;
        if (catalogMediaCard != null) {
            catalogMediaCard.A07.A00();
            catalogMediaCard.A09.A00(catalogMediaCard.A0J);
        }
        this.A0N.A0E.remove(this);
        C2N3 c2n3 = this.A0M;
        if (c2n3 != null) {
            c2n3.A00();
        }
        super.onDestroy();
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (16908332 == menuItem.getItemId()) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        A1P();
        C49452Kn c49452Kn = this.A0T.A09;
        c49452Kn.A0A.AS1(new RunnableEBaseShape0S0100000_I0_0(c49452Kn, 37));
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        this.A0N.A07(new C60052tq(this.A0Z, this.A0c, Integer.valueOf(getIntent().getIntExtra("thumb_width", (int) getResources().getDimension(R.dimen.medium_thumbnail_size))), Integer.valueOf(getIntent().getIntExtra("thumb_height", (int) getResources().getDimension(R.dimen.medium_thumbnail_size))), this.A0J.A00));
        if (this.A0Y == null) {
            this.A00 = 1;
        }
    }

    public void updateButton(View view) {
        if (C34S.A00(this.A00, this.A0Y)) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }
}
