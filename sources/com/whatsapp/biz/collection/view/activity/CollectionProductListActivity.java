package com.whatsapp.biz.collection.view.activity;

import X.AbstractC15200oF;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass075;
import X.AnonymousClass272;
import X.AnonymousClass342;
import X.C000200d;
import X.C018708s;
import X.C02L;
import X.C05W;
import X.C06K;
import X.C06M;
import X.C0CR;
import X.C0HK;
import X.C0MU;
import X.C0U1;
import X.C0VW;
import X.C29y;
import X.C29z;
import X.C2A0;
import X.C2A1;
import X.C2KK;
import X.C2L3;
import X.C2N2;
import X.C2N3;
import X.C49462Ko;
import X.C49882My;
import X.C56002mY;
import X.C56202ms;
import X.C56262my;
import X.C641032b;
import X.C643933e;
import X.C645433t;
import X.C68193Il;
import X.C68273Iv;
import X.InterfaceC002901k;
import X.InterfaceC05620Pl;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.collection.view.activity.CollectionProductListActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape8S0100000_I0_0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class CollectionProductListActivity extends C2N2 {
    public C02L A00;
    public C06K A01;
    public C06M A02;
    public C49882My A03;
    public C2KK A04;
    public C68193Il A05;
    public C49462Ko A06;
    public C2N3 A07;
    public C2L3 A08;
    public AnonymousClass272 A09;
    public C643933e A0A;
    public C68273Iv A0B;
    public C05W A0C;
    public AnonymousClass075 A0D;
    public C018708s A0E;
    public UserJid A0F;
    public InterfaceC002901k A0G;
    public String A0H;
    public final C56002mY A0I = new AnonymousClass342(this);

    public final void A1P(String str, int i) {
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            if (str != null) {
                A0c.A0H(str);
            }
            A0c.A0G(((ActivityC02310Ar) this).A01.A0A(R.plurals.total_items, i, Integer.valueOf(i)));
        }
    }

    @Override // X.C2N2, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.collection_product_list);
        Intent intent = getIntent();
        A1P(intent.getStringExtra("collection_name"), intent.getIntExtra("collection_item_count", 0));
        UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("cache_jid"));
        if (nullable != null) {
            this.A0F = nullable;
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.product_list);
            C643933e c643933e = new C643933e(this.A0F, ((ActivityC02290Ap) this).A0A, this.A00, ((ActivityC02270An) this).A00, this.A0C, this.A0E, ((ActivityC02310Ar) this).A01, this.A09, this.A0D, this.A06, this.A07);
            this.A0A = c643933e;
            recyclerView.setAdapter(c643933e);
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            C641032b c641032b = new C641032b(this.A0G, getApplication(), this.A0D, this.A01, this.A02, this.A0F);
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
                this.A05 = (C68193Il) c0mu;
                C0CR c0cr = new C0CR(new C56262my(), this.A0F, getApplication(), this.A08, new C56202ms(this.A0F, this.A0G, this.A04)) { // from class: X.344
                    public final Application A00;
                    public final C2L3 A01;
                    public final C56202ms A02;
                    public final C56262my A03;
                    public final UserJid A04;

                    {
                        this.A03 = r1;
                        this.A04 = r2;
                        this.A02 = r5;
                        this.A00 = r3;
                        this.A01 = r4;
                    }

                    @Override // X.C0CR
                    public C0MU A6e(Class cls) {
                        return new C68273Iv(this.A03, this.A04, this.A00, this.A01, this.A02);
                    }
                };
                C0VW ADv2 = ADv();
                String canonicalName2 = C68273Iv.class.getCanonicalName();
                if (canonicalName2 != null) {
                    String A0H2 = C000200d.A0H("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName2);
                    HashMap hashMap2 = ADv2.A00;
                    C0MU c0mu3 = (C0MU) hashMap2.get(A0H2);
                    if (!C68273Iv.class.isInstance(c0mu3)) {
                        c0mu3 = c0cr.A6e(C68273Iv.class);
                        C0MU c0mu4 = (C0MU) hashMap2.put(A0H2, c0mu3);
                        if (c0mu4 != null) {
                            c0mu4.A01();
                        }
                    }
                    this.A0B = (C68273Iv) c0mu3;
                    this.A03.A01(this.A0I);
                    this.A0B.A01.A05(this, new InterfaceC05620Pl() { // from class: X.340
                        {
                            CollectionProductListActivity.this = this;
                        }

                        @Override // X.InterfaceC05620Pl
                        public final void AIK(Object obj) {
                            CollectionProductListActivity collectionProductListActivity = CollectionProductListActivity.this;
                            collectionProductListActivity.A0H = collectionProductListActivity.A05.A02((List) obj);
                            collectionProductListActivity.invalidateOptionsMenu();
                        }
                    });
                    this.A0B.A02.A02.A05(this, new InterfaceC05620Pl() { // from class: X.341
                        {
                            CollectionProductListActivity.this = this;
                        }

                        @Override // X.InterfaceC05620Pl
                        public final void AIK(Object obj) {
                            int size;
                            CollectionProductListActivity collectionProductListActivity = CollectionProductListActivity.this;
                            AbstractC56272mz abstractC56272mz = (AbstractC56272mz) obj;
                            if (abstractC56272mz instanceof C645433t) {
                                UserJid userJid = abstractC56272mz.A00;
                                String str = ((C645433t) abstractC56272mz).A00;
                                C29z A02 = collectionProductListActivity.A09.A02(userJid, str);
                                if (A02 != null) {
                                    collectionProductListActivity.A1P(A02.A02, A02.A00);
                                }
                                C643933e c643933e2 = collectionProductListActivity.A0A;
                                c643933e2.A0B.clear();
                                C29z A022 = c643933e2.A05.A02(userJid, str);
                                if (A022 != null) {
                                    for (C468628o c468628o : A022.A04) {
                                        if (c468628o.A00()) {
                                            c643933e2.A0B.add(new C644733m(c468628o));
                                        }
                                    }
                                }
                                C644533k c644533k = new C644533k();
                                c644533k.A00 = 5;
                                List list = c643933e2.A0B;
                                list.add(c644533k);
                                c643933e2.A03(list.size() - 1);
                                ((AbstractC04890Mh) c643933e2).A01.A00();
                            } else if (abstractC56272mz instanceof C645333s) {
                                C643933e c643933e3 = collectionProductListActivity.A0A;
                                int i = ((C645333s) abstractC56272mz).A00;
                                List list2 = c643933e3.A0B;
                                if (list2.size() > 0 && (list2.get(list2.size() - 1) instanceof C644533k) && list2.size() - 1 != -1) {
                                    C644533k c644533k2 = (C644533k) c643933e3.A0B.get(size);
                                    if (i == -1) {
                                        c644533k2.A00 = 4;
                                    } else {
                                        C000200d.A0r("biz-collection-product-list-adapter/error: ", i);
                                        c644533k2.A00 = 2;
                                    }
                                    c643933e3.A02(size);
                                }
                            }
                        }
                    });
                    C0HK c0hk = this.A0B.A02.A04;
                    final C643933e c643933e2 = this.A0A;
                    c0hk.A05(this, new InterfaceC05620Pl() { // from class: X.33y
                        @Override // X.InterfaceC05620Pl
                        public final void AIK(Object obj) {
                            int size;
                            Boolean bool = (Boolean) obj;
                            List list = c643933e2.A0B;
                            if (list.size() > 0 && (list.get(list.size() - 1) instanceof C644533k) && list.size() - 1 != -1) {
                                C644533k c644533k = (C644533k) list.get(size);
                                if (bool != null && bool.booleanValue()) {
                                    c644533k.A00 = 0;
                                } else {
                                    c644533k.A00 = 5;
                                }
                            }
                        }
                    });
                    final String stringExtra = intent.getStringExtra("collection_id");
                    if (stringExtra != null) {
                        C68273Iv c68273Iv = this.A0B;
                        UserJid userJid = this.A0F;
                        if (c68273Iv != null) {
                            if (stringExtra.equals("catalog_products_all_items_collection_id")) {
                                c68273Iv.A02.A03(userJid, c68273Iv.A00);
                            } else {
                                C2L3 c2l3 = c68273Iv.A02;
                                int i = c68273Iv.A00;
                                int i2 = (c2l3.A07.A0A(userJid) ? 4 : 1) * 9;
                                AnonymousClass272 anonymousClass272 = c2l3.A0B;
                                C29z A02 = anonymousClass272.A02(userJid, stringExtra);
                                if (A02 != null) {
                                    synchronized (anonymousClass272) {
                                        C29y c29y = (C29y) anonymousClass272.A00.get(userJid);
                                        if (c29y != null) {
                                            Iterator it = c29y.A02.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                C2A0 c2a0 = (C2A0) it.next();
                                                C29z c29z = c2a0.A00;
                                                if (stringExtra.equals(c29z.A03)) {
                                                    c2a0.A01 = new C2A1(true, null);
                                                    List list = c29z.A04;
                                                    int size = list.size();
                                                    if (size > i2) {
                                                        for (int i3 = i2; i3 < size; i3++) {
                                                            list.remove(list.size() - 1);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    c2l3.A02.A0A(new C645433t(userJid, A02.A03));
                                    c2l3.A06(userJid, stringExtra, i, i2 << 1);
                                } else {
                                    c2l3.A06(userJid, stringExtra, i, i2);
                                }
                            }
                            recyclerView.A0m(new AbstractC15200oF() { // from class: X.343
                                {
                                    CollectionProductListActivity.this = this;
                                }

                                @Override // X.AbstractC15200oF
                                public void A01(RecyclerView recyclerView2, int i4, int i5) {
                                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.A0S;
                                    if (linearLayoutManager == null) {
                                        return;
                                    }
                                    if (linearLayoutManager.A0B() - (linearLayoutManager.A1G() + linearLayoutManager.A0A()) <= 4) {
                                        CollectionProductListActivity collectionProductListActivity = CollectionProductListActivity.this;
                                        C68273Iv c68273Iv2 = collectionProductListActivity.A0B;
                                        UserJid userJid2 = collectionProductListActivity.A0F;
                                        String str = stringExtra;
                                        if (c68273Iv2 != null) {
                                            if (str.equals("catalog_products_all_items_collection_id")) {
                                                C2L3 c2l32 = c68273Iv2.A02;
                                                c2l32.A05(userJid2, c68273Iv2.A00, c2l32.A00(userJid2));
                                                return;
                                            }
                                            C2L3 c2l33 = c68273Iv2.A02;
                                            c2l33.A06(userJid2, str, c68273Iv2.A00, (c2l33.A07.A0A(userJid2) ? 4 : 1) * 9);
                                            return;
                                        }
                                        throw null;
                                    }
                                }
                            });
                            return;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        throw null;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.collection_product_list_menu, menu);
        final MenuItem findItem = menu.findItem(R.id.menu_cart);
        findItem.setActionView(R.layout.menu_item_cart);
        findItem.getActionView().setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 9));
        TextView textView = (TextView) findItem.getActionView().findViewById(R.id.cart_total_quantity);
        String str = this.A0H;
        if (str != null) {
            textView.setText(str);
        }
        this.A05.A00.A05(this, new InterfaceC05620Pl() { // from class: X.33z
            {
                CollectionProductListActivity.this = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x000f, code lost:
                if (r1.A0H == null) goto L8;
             */
            @Override // X.InterfaceC05620Pl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void AIK(java.lang.Object r4) {
                /*
                    r3 = this;
                    com.whatsapp.biz.collection.view.activity.CollectionProductListActivity r1 = com.whatsapp.biz.collection.view.activity.CollectionProductListActivity.this
                    android.view.MenuItem r2 = r2
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r0 = r4.booleanValue()
                    if (r0 == 0) goto L11
                    java.lang.String r1 = r1.A0H
                    r0 = 1
                    if (r1 != 0) goto L12
                L11:
                    r0 = 0
                L12:
                    r2.setVisible(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C646033z.AIK(java.lang.Object):void");
            }
        });
        this.A05.A03();
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        this.A03.A00(this.A0I);
        this.A07.A00();
        super.onDestroy();
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        this.A0B.A03.A00();
        super.onResume();
    }
}
