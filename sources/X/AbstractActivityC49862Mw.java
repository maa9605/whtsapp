package X;

import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.CatalogHeader;
import com.whatsapp.biz.catalog.ShareCatalogLinkActivity;
import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape8S0100000_I0_0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2Mw */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC49862Mw extends AbstractActivityC49872Mx {
    public C02L A00;
    public C06K A01;
    public C06M A02;
    public C49882My A03;
    public C2KK A04;
    public C68193Il A05;
    public C49462Ko A06;
    public C2MT A07;
    public C2N3 A08;
    public C2L3 A09;
    public C2MP A0A;
    public C464826z A0B;
    public AnonymousClass272 A0C;
    public C2S0 A0D;
    public C68243Is A0E;
    public AnonymousClass008 A0G;
    public C42371vd A0H;
    public AnonymousClass075 A0I;
    public C003701t A0J;
    public UserJid A0K;
    public InterfaceC002901k A0L;
    public Integer A0M;
    public String A0N;
    public boolean A0O;
    public boolean A0P;
    public final C56002mY A0R = new C33W(this);
    public final AbstractC50472Rx A0T = new C50492Rz(this);
    public final InterfaceC04750Lr A0S = new InterfaceC04750Lr() { // from class: X.33X
        {
            AbstractActivityC49862Mw.this = this;
        }

        @Override // X.InterfaceC04750Lr
        public void AKF(UserJid userJid, int i) {
            AbstractActivityC49862Mw abstractActivityC49862Mw = AbstractActivityC49862Mw.this;
            if (AnonymousClass024.A0l(userJid, abstractActivityC49862Mw.A0K)) {
                abstractActivityC49862Mw.A0M = Integer.valueOf(i);
                if (abstractActivityC49862Mw.A09.A00) {
                    return;
                }
                abstractActivityC49862Mw.A0D.A0J(i);
            }
        }

        @Override // X.InterfaceC04750Lr
        public void AKG(UserJid userJid) {
            AbstractActivityC49862Mw abstractActivityC49862Mw = AbstractActivityC49862Mw.this;
            if (AnonymousClass024.A0l(userJid, abstractActivityC49862Mw.A0K)) {
                abstractActivityC49862Mw.A0M = null;
                if (abstractActivityC49862Mw.A09.A00) {
                    return;
                }
                abstractActivityC49862Mw.A0O = true;
                abstractActivityC49862Mw.invalidateOptionsMenu();
                C2S0 c2s0 = abstractActivityC49862Mw.A0D;
                c2s0.A0K(userJid);
                c2s0.A0I();
                ((AbstractC04890Mh) c2s0).A01.A00();
            }
        }
    };
    public C0GA A0F = new C0GA() { // from class: X.33Y
        {
            AbstractActivityC49862Mw.this = this;
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            C2S0 c2s0;
            int A0G;
            AbstractActivityC49862Mw abstractActivityC49862Mw = AbstractActivityC49862Mw.this;
            if (abstractActivityC49862Mw.A0K.equals(abstractC005302j) && !abstractActivityC49862Mw.A00.A0A(abstractActivityC49862Mw.A0K) && (A0G = (c2s0 = abstractActivityC49862Mw.A0D).A0G()) != -1) {
                c2s0.A02(A0G);
            }
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            C2S0 c2s0;
            int A0G;
            AbstractActivityC49862Mw abstractActivityC49862Mw = AbstractActivityC49862Mw.this;
            if (abstractActivityC49862Mw.A0K.equals(userJid) && !abstractActivityC49862Mw.A00.A0A(abstractActivityC49862Mw.A0K) && (A0G = (c2s0 = abstractActivityC49862Mw.A0D).A0G()) != -1) {
                c2s0.A02(A0G);
            }
        }
    };
    public final AbstractC09240cu A0Q = new AbstractC09240cu() { // from class: X.33Z
        {
            AbstractActivityC49862Mw.this = this;
        }

        @Override // X.AbstractC09240cu
        public void A01(UserJid userJid) {
            C2S0 c2s0;
            int A0G;
            AbstractActivityC49862Mw abstractActivityC49862Mw = AbstractActivityC49862Mw.this;
            if (abstractActivityC49862Mw.A0K.equals(userJid) && !abstractActivityC49862Mw.A00.A0A(abstractActivityC49862Mw.A0K) && (A0G = (c2s0 = abstractActivityC49862Mw.A0D).A0G()) != -1) {
                c2s0.A02(A0G);
            }
        }
    };

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation != 2) {
            this.A0D.A0H();
            return;
        }
        C2S0 c2s0 = this.A0D;
        int A0G = c2s0.A0G();
        if (A0G != -1) {
            c2s0.A09.remove(A0G);
            c2s0.A04(A0G);
        }
    }

    @Override // X.AbstractActivityC49872Mx, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A03.A01(this.A0R);
        this.A08 = new C2N3(this.A07);
        setContentView(R.layout.business_product_catalog_list);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.business_catalog_list);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            A0c.A08(R.string.business_product_catalog_section_title);
        }
        UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("cache_jid"));
        if (nullable != null) {
            this.A0K = nullable;
            this.A0B.A01(this.A0T);
            this.A0A.A01(this.A0S);
            C641032b c641032b = new C641032b(this.A0L, getApplication(), this.A0I, this.A01, this.A02, this.A0K);
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
                C0CR c0cr = new C0CR(this.A0J, new C56262my(), this.A0K, getApplication(), this.A09, new C56202ms(this.A0K, this.A0L, this.A04), this.A0C) { // from class: X.33q
                    public final Application A00;
                    public final C2L3 A01;
                    public final AnonymousClass272 A02;
                    public final C56202ms A03;
                    public final C56262my A04;
                    public final C003701t A05;
                    public final UserJid A06;

                    {
                        this.A05 = r1;
                        this.A04 = r2;
                        this.A06 = r3;
                        this.A03 = r6;
                        this.A00 = r4;
                        this.A01 = r5;
                        this.A02 = r7;
                    }

                    @Override // X.C0CR
                    public C0MU A6e(Class cls) {
                        return new C68243Is(this.A05, this.A04, this.A06, this.A00, this.A01, this.A03, this.A02);
                    }
                };
                C0VW ADv2 = ADv();
                String canonicalName2 = C68243Is.class.getCanonicalName();
                if (canonicalName2 != null) {
                    String A0H2 = C000200d.A0H("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName2);
                    HashMap hashMap2 = ADv2.A00;
                    C0MU c0mu3 = (C0MU) hashMap2.get(A0H2);
                    if (!C68243Is.class.isInstance(c0mu3)) {
                        c0mu3 = c0cr.A6e(C68243Is.class);
                        C0MU c0mu4 = (C0MU) hashMap2.put(A0H2, c0mu3);
                        if (c0mu4 != null) {
                            c0mu4.A01();
                        }
                    }
                    C68243Is c68243Is = (C68243Is) c0mu3;
                    this.A0E = c68243Is;
                    c68243Is.A02.A03.A05(this, new InterfaceC05620Pl() { // from class: X.33U
                        {
                            AbstractActivityC49862Mw.this = this;
                        }

                        @Override // X.InterfaceC05620Pl
                        public final void AIK(Object obj) {
                            AbstractActivityC49862Mw abstractActivityC49862Mw = AbstractActivityC49862Mw.this;
                            AbstractC56272mz abstractC56272mz = (AbstractC56272mz) obj;
                            if (abstractC56272mz instanceof C645633v) {
                                if (AnonymousClass024.A0l(abstractC56272mz.A00, abstractActivityC49862Mw.A0K)) {
                                    abstractActivityC49862Mw.A0O = true;
                                    abstractActivityC49862Mw.invalidateOptionsMenu();
                                    C2S0 c2s0 = abstractActivityC49862Mw.A0D;
                                    c2s0.A0K(abstractActivityC49862Mw.A0K);
                                    c2s0.A0I();
                                    ((AbstractC04890Mh) c2s0).A01.A00();
                                }
                            } else if (!(abstractC56272mz instanceof C645533u) || !AnonymousClass024.A0l(abstractC56272mz.A00, abstractActivityC49862Mw.A0K)) {
                            } else {
                                Integer num = abstractActivityC49862Mw.A0M;
                                if (num != null) {
                                    abstractActivityC49862Mw.A0D.A0J(num.intValue());
                                    return;
                                }
                                C2S0 c2s02 = abstractActivityC49862Mw.A0D;
                                c2s02.A0K(abstractActivityC49862Mw.A0K);
                                c2s02.A0I();
                                ((AbstractC04890Mh) c2s02).A01.A00();
                            }
                        }
                    });
                    CatalogListActivity catalogListActivity = (CatalogListActivity) this;
                    ((AbstractActivityC49862Mw) catalogListActivity).A0D = new C2S0(((AbstractActivityC49862Mw) catalogListActivity).A0J, ((ActivityC02290Ap) catalogListActivity).A0A, ((AbstractActivityC49862Mw) catalogListActivity).A00, ((ActivityC02270An) catalogListActivity).A00, ((AbstractActivityC49862Mw) catalogListActivity).A09, catalogListActivity.A01, catalogListActivity.A02, ((ActivityC02310Ar) catalogListActivity).A01, catalogListActivity.A03, ((AbstractActivityC49862Mw) catalogListActivity).A0C, ((AbstractActivityC49862Mw) catalogListActivity).A0I, ((AbstractActivityC49862Mw) catalogListActivity).A06, ((AbstractActivityC49862Mw) catalogListActivity).A0K, ((AbstractActivityC49862Mw) catalogListActivity).A08, catalogListActivity) { // from class: X.3Ir
                        public final C018308n A00;
                        public final C018508q A01;
                        public final C49462Ko A02;
                        public final C05W A03;
                        public final AnonymousClass075 A04;
                        public final C018708s A05;
                        public final C002301c A06;

                        {
                            this.A01 = r13;
                            this.A00 = r15;
                            this.A03 = r17;
                            this.A05 = r18;
                            this.A06 = r19;
                            this.A04 = r22;
                            this.A02 = r23;
                            if (super.A05.getResources().getConfiguration().orientation == 1) {
                                A0H();
                            }
                            List list = this.A09;
                            list.add(new C644533k());
                            A03(list.size() - 1);
                            A0K(r24);
                        }

                        @Override // X.AbstractC04890Mh
                        public C0TS A0E(ViewGroup viewGroup, int i) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 5) {
                                        if (i == 7) {
                                            return new AbstractC68263Iu(this.A01, ((C2S0) this).A01, this.A00, this.A06, this.A03, super.A04, this.A08, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.product_catalog_list_collection_header, viewGroup, false), this) { // from class: X.3LG
                                            };
                                        }
                                        throw new IllegalStateException("catalog-adapter/onCreateViewHolder/unknown view type");
                                    }
                                    AbstractActivityC49862Mw abstractActivityC49862Mw = super.A05;
                                    C018508q c018508q = this.A01;
                                    C02L c02l = ((C2S0) this).A01;
                                    C018308n c018308n = this.A00;
                                    C05W c05w = this.A03;
                                    C002301c c002301c = this.A06;
                                    C2N3 c2n3 = super.A02;
                                    AnonymousClass272 anonymousClass272 = super.A04;
                                    C49462Ko c49462Ko = this.A02;
                                    View inflate = LayoutInflater.from(abstractActivityC49862Mw).inflate(R.layout.business_product_catalog_list_product, viewGroup, false);
                                    AnonymousClass088.A1U(inflate);
                                    return new C3LH(c018508q, c02l, c018308n, c05w, c002301c, anonymousClass272, c49462Ko, inflate, c2n3, this);
                                }
                                return C3LF.A00(viewGroup, this.A01, ((C2S0) this).A01, this.A00, this.A03, this.A05, super.A04, this.A04);
                            }
                            return new C68203In(((C2S0) this).A01, this.A00, this.A03, (CatalogHeader) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.business_product_catalog_list_header, viewGroup, false));
                        }
                    };
                    if (bundle != null) {
                        this.A0O = bundle.getBoolean("catalog_loaded", false);
                    } else {
                        C68243Is c68243Is2 = this.A0E;
                        UserJid userJid = this.A0K;
                        if (c68243Is2.A06.A0C(451)) {
                            C2L3 c2l3 = c68243Is2.A02;
                            int i = c68243Is2.A00;
                            int A00 = c2l3.A00(userJid);
                            AnonymousClass272 anonymousClass272 = c2l3.A0B;
                            if (anonymousClass272.A0A(userJid)) {
                                synchronized (anonymousClass272) {
                                    C29y c29y = (C29y) anonymousClass272.A00.get(userJid);
                                    if (c29y != null) {
                                        c29y.A00 = new C2A1(true, null);
                                        ArrayList arrayList = c29y.A02;
                                        int size = arrayList.size();
                                        if (size > A00) {
                                            for (int i2 = A00; i2 < size; i2++) {
                                                arrayList.remove(arrayList.size() - 1);
                                            }
                                        }
                                    }
                                }
                                c2l3.A03.A0A(new C645633v(userJid));
                                c2l3.A04(userJid, i, A00 << 1);
                            } else {
                                c2l3.A04(userJid, i, A00);
                            }
                        }
                        c68243Is2.A02.A03(userJid, c68243Is2.A00);
                        this.A0D.A0I();
                    }
                    recyclerView.setAdapter(this.A0D);
                    recyclerView.setLayoutManager(new LinearLayoutManager(1));
                    recyclerView.A0m(new AbstractC15200oF() { // from class: X.33b
                        {
                            AbstractActivityC49862Mw.this = this;
                        }

                        @Override // X.AbstractC15200oF
                        public void A01(RecyclerView recyclerView2, int i3, int i4) {
                            C2A1 A03;
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.A0S;
                            if (linearLayoutManager.A0B() - (linearLayoutManager.A1G() + linearLayoutManager.A0A()) <= 4) {
                                AbstractActivityC49862Mw abstractActivityC49862Mw = AbstractActivityC49862Mw.this;
                                C68243Is c68243Is3 = abstractActivityC49862Mw.A0E;
                                UserJid userJid2 = abstractActivityC49862Mw.A0K;
                                if (c68243Is3.A06.A0C(451) && ((A03 = c68243Is3.A03.A03(userJid2)) == null || A03.A01)) {
                                    C2L3 c2l32 = c68243Is3.A02;
                                    c2l32.A04(userJid2, c68243Is3.A00, c2l32.A00(userJid2));
                                } else {
                                    C2L3 c2l33 = c68243Is3.A02;
                                    c2l33.A05(userJid2, c68243Is3.A00, c2l33.A00(userJid2));
                                }
                                C2S0 c2s0 = (C2S0) recyclerView2.A0N;
                                if (c2s0 != null) {
                                    c2s0.A0I();
                                    return;
                                }
                                throw null;
                            }
                        }
                    });
                    this.A0G.A01(this.A0F);
                    this.A02.A01(this.A0Q);
                    Serializable serializableExtra = getIntent().getSerializableExtra("source");
                    if (((ActivityC02290Ap) this).A0B.A0E(C01C.A0m) && serializableExtra != null) {
                        this.A0L.AS1(new RunnableEBaseShape0S0100000_I0_0(this, 34));
                    }
                    this.A0E.A01.A05(this, new InterfaceC05620Pl() { // from class: X.33P
                        {
                            AbstractActivityC49862Mw.this = this;
                        }

                        @Override // X.InterfaceC05620Pl
                        public final void AIK(Object obj) {
                            AbstractActivityC49862Mw abstractActivityC49862Mw = AbstractActivityC49862Mw.this;
                            abstractActivityC49862Mw.A0N = abstractActivityC49862Mw.A05.A02((List) obj);
                            abstractActivityC49862Mw.invalidateOptionsMenu();
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

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        final MenuItem findItem = menu.findItem(R.id.menu_cart);
        findItem.setActionView(R.layout.menu_item_cart);
        findItem.getActionView().setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 7));
        TextView textView = (TextView) findItem.getActionView().findViewById(R.id.cart_total_quantity);
        String str = this.A0N;
        if (str != null) {
            textView.setText(str);
        }
        this.A05.A00.A05(this, new InterfaceC05620Pl() { // from class: X.33Q
            {
                AbstractActivityC49862Mw.this = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0010, code lost:
                if (r3.A0N == null) goto L11;
             */
            @Override // X.InterfaceC05620Pl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void AIK(java.lang.Object r15) {
                /*
                    r14 = this;
                    X.2Mw r3 = X.AbstractActivityC49862Mw.this
                    android.view.MenuItem r4 = r2
                    java.lang.Boolean r15 = (java.lang.Boolean) r15
                    boolean r0 = r15.booleanValue()
                    r2 = 1
                    if (r0 == 0) goto L12
                    java.lang.String r1 = r3.A0N
                    r0 = 1
                    if (r1 != 0) goto L13
                L12:
                    r0 = 0
                L13:
                    r4.setVisible(r0)
                    boolean r0 = r3.A0P
                    if (r0 != 0) goto L44
                    r3.A0P = r2
                    android.content.Intent r1 = r3.getIntent()
                    java.lang.String r0 = "source"
                    java.io.Serializable r12 = r1.getSerializableExtra(r0)
                    java.lang.Integer r12 = (java.lang.Integer) r12
                    X.2Ko r4 = r3.A06
                    r5 = 4
                    r0 = 23
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
                    com.whatsapp.jid.UserJid r8 = r3.A0K
                    X.3Il r0 = r3.A05
                    X.0HK r0 = r0.A00
                    java.lang.Object r13 = r0.A01()
                    java.lang.Boolean r13 = (java.lang.Boolean) r13
                    r7 = 0
                    r9 = r7
                    r10 = r7
                    r11 = r7
                    r4.A03(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                L44:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C33Q.AIK(java.lang.Object):void");
            }
        });
        this.A05.A03();
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        this.A03.A00(this.A0R);
        this.A0A.A00(this.A0S);
        this.A0B.A00(this.A0T);
        this.A0G.A00(this.A0F);
        this.A02.A00(this.A0Q);
        this.A08.A00();
        super.onDestroy();
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (16908332 == itemId) {
            onBackPressed();
            return true;
        } else if (R.id.menu_share == itemId) {
            UserJid userJid = this.A0K;
            Intent intent = new Intent(this, ShareCatalogLinkActivity.class);
            intent.setAction("android.intent.action.VIEW");
            intent.putExtra("jid", userJid.getRawString());
            startActivity(intent);
            return true;
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        this.A0D.A0I();
        this.A0E.A04.A00();
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("catalog_loaded", this.A0O);
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        super.onStop();
        this.A0P = false;
    }
}
