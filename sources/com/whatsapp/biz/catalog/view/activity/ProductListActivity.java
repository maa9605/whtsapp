package com.whatsapp.biz.catalog.view.activity;

import X.AbstractC08920cK;
import X.AbstractC09260cw;
import X.AbstractC15200oF;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass075;
import X.AnonymousClass272;
import X.C000200d;
import X.C018308n;
import X.C018508q;
import X.C018708s;
import X.C019208x;
import X.C02L;
import X.C05W;
import X.C06K;
import X.C06M;
import X.C09250cv;
import X.C09270cx;
import X.C0CR;
import X.C0MU;
import X.C0U1;
import X.C0VW;
import X.C2KK;
import X.C2MT;
import X.C2N0;
import X.C2N3;
import X.C41611uE;
import X.C49462Ko;
import X.C49882My;
import X.C50332Rh;
import X.C56002mY;
import X.C56202ms;
import X.C56262my;
import X.C641032b;
import X.C643733c;
import X.C644233h;
import X.C68193Il;
import X.C68253It;
import X.DialogInterfaceC019408z;
import X.InterfaceC002901k;
import X.InterfaceC05620Pl;
import android.app.Application;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.view.activity.ProductListActivity;
import com.whatsapp.components.Button;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape0S0000000_I0;
import com.whatsapp.util.ViewOnClickCListenerShape8S0100000_I0_0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class ProductListActivity extends C2N0 {
    public View A00;
    public DialogInterfaceC019408z A01;
    public DialogInterfaceC019408z A02;
    public RecyclerView A03;
    public C09250cv A04;
    public C018308n A05;
    public C018508q A06;
    public C02L A07;
    public C06K A08;
    public C06M A09;
    public C49882My A0A;
    public C2KK A0B;
    public C68193Il A0C;
    public C49462Ko A0D;
    public C2MT A0E;
    public AnonymousClass272 A0F;
    public C41611uE A0G;
    public C68253It A0H;
    public Button A0I;
    public C05W A0J;
    public AnonymousClass075 A0K;
    public C018708s A0L;
    public UserJid A0M;
    public InterfaceC002901k A0N;
    public String A0O;
    public boolean A0P = true;
    public final C56002mY A0Q = new C643733c(this);

    public final void A1P() {
        if (this.A0P) {
            findViewById(R.id.shadow_bottom).setVisibility(8);
        } else if (this.A03.canScrollVertically(1)) {
            findViewById(R.id.shadow_bottom).setVisibility(0);
        } else {
            findViewById(R.id.shadow_bottom).setVisibility(4);
        }
    }

    public /* synthetic */ void lambda$onCreate$1147$ProductListActivity(View view) {
        C68253It c68253It = this.A0H;
        c68253It.A03.A01(c68253It.A04);
    }

    public void lambda$onCreate$1148$ProductListActivity(View view) {
        this.A0D.A02(40, null, null, this.A0M);
        C56262my.A00(this.A0H.A07, this);
    }

    @Override // X.C2N0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_product_list);
        String stringExtra = getIntent().getStringExtra("message_title");
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            A0c.A0H(stringExtra);
        }
        C019208x c019208x = new C019208x(this);
        c019208x.A01.A0J = false;
        c019208x.A02(R.string.something_went_wrong);
        c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.2mw
            {
                ProductListActivity.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ProductListActivity.this.finish();
            }
        });
        this.A01 = c019208x.A00();
        C019208x c019208x2 = new C019208x(this);
        c019208x2.A01.A0J = false;
        c019208x2.A02(R.string.items_no_longer_available);
        c019208x2.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.2mv
            {
                ProductListActivity.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ProductListActivity.this.finish();
            }
        });
        this.A02 = c019208x2.A00();
        this.A0A.A01(this.A0Q);
        C50332Rh c50332Rh = (C50332Rh) getIntent().getParcelableExtra("message_content");
        this.A0M = c50332Rh.A00;
        Application application = getApplication();
        UserJid userJid = this.A0M;
        C0CR c0cr = new C0CR(application, userJid, new C56262my(), c50332Rh, this.A0G, new C56202ms(userJid, this.A0N, this.A0B)) { // from class: X.33r
            public final Application A00;
            public final C41611uE A01;
            public final C56202ms A02;
            public final C56262my A03;
            public final UserJid A04;
            public final C50332Rh A05;

            {
                this.A00 = application;
                this.A04 = userJid;
                this.A03 = r3;
                this.A05 = c50332Rh;
                this.A01 = r5;
                this.A02 = r6;
            }

            @Override // X.C0CR
            public C0MU A6e(Class cls) {
                return new C68253It(this.A00, this.A04, this.A03, this.A05, this.A01, this.A02);
            }
        };
        C0VW ADv = ADv();
        String canonicalName = C68253It.class.getCanonicalName();
        if (canonicalName != null) {
            String A0H = C000200d.A0H("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            HashMap hashMap = ADv.A00;
            C0MU c0mu = (C0MU) hashMap.get(A0H);
            if (!C68253It.class.isInstance(c0mu)) {
                c0mu = c0cr.A6e(C68253It.class);
                C0MU c0mu2 = (C0MU) hashMap.put(A0H, c0mu);
                if (c0mu2 != null) {
                    c0mu2.A01();
                }
            }
            C68253It c68253It = (C68253It) c0mu;
            this.A0H = c68253It;
            c68253It.A02.A05(this, new InterfaceC05620Pl() { // from class: X.33R
                {
                    ProductListActivity.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    ProductListActivity productListActivity = ProductListActivity.this;
                    List list = (List) obj;
                    productListActivity.A0O = productListActivity.A0C.A02(list);
                    productListActivity.invalidateOptionsMenu();
                    productListActivity.A0P = list.size() == 0;
                    productListActivity.A0I.setText(productListActivity.getString(R.string.product_list_view_cart, productListActivity.A0O));
                    if (productListActivity.A0P) {
                        productListActivity.A0I.setVisibility(8);
                    } else {
                        productListActivity.A0I.setVisibility(0);
                    }
                    productListActivity.A1P();
                }
            });
            C641032b c641032b = new C641032b(this.A0N, getApplication(), this.A0K, this.A08, this.A09, this.A0M);
            C0VW ADv2 = ADv();
            String canonicalName2 = C68193Il.class.getCanonicalName();
            if (canonicalName2 != null) {
                String A0H2 = C000200d.A0H("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName2);
                HashMap hashMap2 = ADv2.A00;
                C0MU c0mu3 = (C0MU) hashMap2.get(A0H2);
                if (!C68193Il.class.isInstance(c0mu3)) {
                    c0mu3 = c641032b.A6e(C68193Il.class);
                    C0MU c0mu4 = (C0MU) hashMap2.put(A0H2, c0mu3);
                    if (c0mu4 != null) {
                        c0mu4.A01();
                    }
                }
                this.A0C = (C68193Il) c0mu3;
                C09250cv A00 = C09250cv.A00(((ActivityC02290Ap) this).A04, getResources().getString(R.string.no_internet_connection_snackbar), 4000);
                A00.A06(A00.A02.getText(R.string.retry), new ViewOnClickCListenerShape0S0000000_I0());
                C09270cx c09270cx = new C09270cx() { // from class: X.3Iq
                    {
                        ProductListActivity.this = this;
                    }

                    @Override // X.AbstractC09280cy
                    public void A00(Object obj, int i) {
                        if (i == 1) {
                            C68253It c68253It2 = ProductListActivity.this.A0H;
                            c68253It2.A03.A01(c68253It2.A04);
                        }
                    }
                };
                List list = ((AbstractC09260cw) A00).A01;
                if (list == null) {
                    list = new ArrayList();
                    ((AbstractC09260cw) A00).A01 = list;
                }
                list.add(c09270cx);
                this.A04 = A00;
                this.A00 = findViewById(R.id.no_internet_container);
                findViewById(R.id.no_internet_retry_button).setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 19));
                Button button = (Button) findViewById(R.id.view_cart);
                this.A0I = button;
                button.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 20));
                RecyclerView recyclerView = (RecyclerView) findViewById(R.id.product_list);
                this.A03 = recyclerView;
                recyclerView.A0k(new AbstractC08920cK() { // from class: X.33i
                    @Override // X.AbstractC08920cK
                    public void A01(Rect rect, View view, RecyclerView recyclerView2, C0Y0 c0y0) {
                        view.getLayoutParams();
                        rect.set(0, 0, 0, 0);
                        int A002 = RecyclerView.A00(view);
                        if (recyclerView2.A0N != null && A002 == 0) {
                            int A07 = C0AT.A07(view);
                            int dimension = (int) view.getResources().getDimension(R.dimen.product_list_section_top_padding);
                            int A06 = C0AT.A06(view);
                            int paddingBottom = view.getPaddingBottom();
                            if (Build.VERSION.SDK_INT >= 17) {
                                view.setPaddingRelative(A07, dimension, A06, paddingBottom);
                            } else {
                                view.setPadding(A07, dimension, A06, paddingBottom);
                            }
                        }
                    }
                });
                final C644233h c644233h = new C644233h(this.A06, this.A0M, this.A07, this.A05, this.A0J, this.A0L, ((ActivityC02310Ar) this).A01, new C2N3(this.A0E), this.A0F, this.A0K, this.A0D);
                this.A03.setAdapter(c644233h);
                this.A0H.A01.A05(this, new InterfaceC05620Pl() { // from class: X.33V
                    @Override // X.InterfaceC05620Pl
                    public final void AIK(Object obj) {
                        C644233h c644233h2 = c644233h;
                        List list2 = (List) obj;
                        List list3 = c644233h2.A0D;
                        C14770nY A002 = C14820nd.A00(new AbstractC14760nX(list3, list2) { // from class: X.33f
                            public final List A00;
                            public final List A01;

                            {
                                this.A01 = list3;
                                this.A00 = list2;
                            }

                            @Override // X.AbstractC14760nX
                            public int A00() {
                                return this.A00.size();
                            }

                            @Override // X.AbstractC14760nX
                            public int A01() {
                                return this.A01.size();
                            }

                            @Override // X.AbstractC14760nX
                            public boolean A03(int i, int i2) {
                                InterfaceC56182mq interfaceC56182mq = (InterfaceC56182mq) this.A01.get(i);
                                InterfaceC56182mq interfaceC56182mq2 = (InterfaceC56182mq) this.A00.get(i2);
                                int type = interfaceC56182mq.getType();
                                if (type == interfaceC56182mq2.getType()) {
                                    if (type == 0) {
                                        return ((C33O) interfaceC56182mq).A00.equals(((C33O) interfaceC56182mq2).A00);
                                    }
                                    return ((C33N) interfaceC56182mq).A00.equals(((C33N) interfaceC56182mq2).A00);
                                }
                                return false;
                            }

                            @Override // X.AbstractC14760nX
                            public boolean A04(int i, int i2) {
                                InterfaceC56182mq interfaceC56182mq = (InterfaceC56182mq) this.A01.get(i);
                                InterfaceC56182mq interfaceC56182mq2 = (InterfaceC56182mq) this.A00.get(i2);
                                int type = interfaceC56182mq.getType();
                                if (type == interfaceC56182mq2.getType()) {
                                    if (type == 0) {
                                        return ((C33O) interfaceC56182mq).A00.A09.equals(((C33O) interfaceC56182mq2).A00.A09);
                                    }
                                    return ((C33N) interfaceC56182mq).A00.equals(((C33N) interfaceC56182mq2).A00);
                                }
                                return false;
                            }
                        });
                        list3.clear();
                        list3.addAll(list2);
                        A002.A02(c644233h2.A01);
                    }
                });
                this.A0H.A00.A05(this, new InterfaceC05620Pl() { // from class: X.33T
                    {
                        ProductListActivity.this = this;
                    }

                    @Override // X.InterfaceC05620Pl
                    public final void AIK(Object obj) {
                        boolean A05;
                        ProductListActivity productListActivity = ProductListActivity.this;
                        C644233h c644233h2 = c644233h;
                        int intValue = ((Number) obj).intValue();
                        if (intValue != 0) {
                            if (intValue == 1) {
                                c644233h2.A00 = 0;
                                c644233h2.A02(c644233h2.A0C() - 1);
                                productListActivity.A00.setVisibility(8);
                                productListActivity.A04.A02(3);
                                productListActivity.A01.hide();
                                productListActivity.A02.hide();
                                return;
                            } else if (intValue != 2) {
                                if (intValue == 3) {
                                    c644233h2.A00 = 5;
                                    c644233h2.A02(c644233h2.A0C() - 1);
                                    productListActivity.A00.setVisibility(8);
                                    productListActivity.A04.A02(3);
                                    productListActivity.A01.hide();
                                    if (productListActivity.A02.isShowing()) {
                                        return;
                                    }
                                    productListActivity.A02.show();
                                    return;
                                } else if (intValue == 4) {
                                    productListActivity.A02.hide();
                                    c644233h2.A00 = 5;
                                    c644233h2.A02(c644233h2.A0C() - 1);
                                    productListActivity.A00.setVisibility(8);
                                    productListActivity.A04.A02(3);
                                    if (c644233h2.A0D.size() > 0) {
                                        productListActivity.A01.hide();
                                        return;
                                    } else if (productListActivity.A01.isShowing()) {
                                        return;
                                    } else {
                                        productListActivity.A01.show();
                                        return;
                                    }
                                } else if (intValue == 5) {
                                    c644233h2.A00 = 5;
                                    c644233h2.A02(c644233h2.A0C() - 1);
                                    if (c644233h2.A0D.size() == 0) {
                                        productListActivity.A00.setVisibility(0);
                                        return;
                                    }
                                    C09250cv c09250cv = productListActivity.A04;
                                    if (c09250cv != null) {
                                        C1BJ A002 = C1BJ.A00();
                                        C1BH c1bh = c09250cv.A07;
                                        synchronized (A002.A03) {
                                            A05 = A002.A05(c1bh);
                                        }
                                        if (A05) {
                                            return;
                                        }
                                        productListActivity.A00.setVisibility(8);
                                        productListActivity.A04.A04();
                                        return;
                                    }
                                    throw null;
                                } else {
                                    return;
                                }
                            }
                        }
                        c644233h2.A00 = 5;
                        c644233h2.A02(c644233h2.A0C() - 1);
                        productListActivity.A00.setVisibility(8);
                        productListActivity.A04.A02(3);
                        productListActivity.A01.hide();
                        productListActivity.A02.hide();
                    }
                });
                this.A03.A0m(new AbstractC15200oF() { // from class: X.33d
                    {
                        ProductListActivity.this = this;
                    }

                    @Override // X.AbstractC15200oF
                    public void A01(RecyclerView recyclerView2, int i, int i2) {
                        ProductListActivity productListActivity = ProductListActivity.this;
                        productListActivity.A1P();
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.A0S;
                        if (linearLayoutManager == null) {
                            return;
                        }
                        if (linearLayoutManager.A0B() - (linearLayoutManager.A1G() + linearLayoutManager.A0A()) <= 4) {
                            C68253It c68253It2 = productListActivity.A0H;
                            c68253It2.A03.A01(c68253It2.A04);
                        }
                    }
                });
                return;
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.catalog, menu);
        MenuItem findItem = menu.findItem(R.id.menu_edit);
        menu.findItem(R.id.menu_share).setVisible(false);
        findItem.setVisible(false);
        final MenuItem findItem2 = menu.findItem(R.id.menu_cart);
        findItem2.setActionView(R.layout.menu_item_cart);
        findItem2.getActionView().setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 8));
        TextView textView = (TextView) findItem2.getActionView().findViewById(R.id.cart_total_quantity);
        String str = this.A0O;
        if (str != null) {
            textView.setText(str);
        }
        this.A0C.A00.A05(this, new InterfaceC05620Pl() { // from class: X.33S
            {
                ProductListActivity.this = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x000f, code lost:
                if (r1.A0O == null) goto L8;
             */
            @Override // X.InterfaceC05620Pl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void AIK(java.lang.Object r4) {
                /*
                    r3 = this;
                    com.whatsapp.biz.catalog.view.activity.ProductListActivity r1 = com.whatsapp.biz.catalog.view.activity.ProductListActivity.this
                    android.view.MenuItem r2 = r2
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r0 = r4.booleanValue()
                    if (r0 == 0) goto L11
                    java.lang.String r1 = r1.A0O
                    r0 = 1
                    if (r1 != 0) goto L12
                L11:
                    r0 = 0
                L12:
                    r2.setVisible(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C33S.AIK(java.lang.Object):void");
            }
        });
        this.A0C.A03();
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A0A.A00(this.A0Q);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        C68253It c68253It = this.A0H;
        c68253It.A03.A01(c68253It.A04);
        this.A0H.A05.A00();
        super.onResume();
    }
}
