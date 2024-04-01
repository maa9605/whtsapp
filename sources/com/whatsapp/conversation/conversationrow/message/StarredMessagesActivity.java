package com.whatsapp.conversation.conversationrow.message;

import X.AbstractActivityC04650Lh;
import X.AbstractC005302j;
import X.AbstractC28721Ti;
import X.ActivityC02250Al;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass008;
import X.AnonymousClass011;
import X.AnonymousClass092;
import X.C003101m;
import X.C00A;
import X.C00T;
import X.C018608r;
import X.C018708s;
import X.C019208x;
import X.C01B;
import X.C02980Dr;
import X.C02E;
import X.C02L;
import X.C02O;
import X.C03010Du;
import X.C03120Eg;
import X.C03320Ff;
import X.C03360Fk;
import X.C05E;
import X.C05G;
import X.C0C8;
import X.C0C9;
import X.C0CA;
import X.C0D5;
import X.C0ED;
import X.C0ES;
import X.C0GA;
import X.C0GC;
import X.C0GE;
import X.C0GV;
import X.C0HQ;
import X.C0L5;
import X.C0U1;
import X.C0Zn;
import X.C0m3;
import X.C13930m5;
import X.C2AT;
import X.C2M4;
import X.C2MG;
import X.C2MN;
import X.C2Nc;
import X.C37641mk;
import X.C3Ji;
import X.C41521u3;
import X.C41541u6;
import X.C42451vl;
import X.C42711wC;
import X.C43081wp;
import X.C658038p;
import X.C68353Jh;
import X.InterfaceC002901k;
import X.InterfaceC04690Ll;
import X.InterfaceC07650Zd;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.Main;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class StarredMessagesActivity extends C2Nc implements InterfaceC04690Ll, C0HQ {
    public MenuItem A00;
    public MenuItem A01;
    public C02L A02;
    public C03010Du A03;
    public C01B A04;
    public C018608r A05;
    public C03320Ff A06;
    public C41541u6 A07;
    public AnonymousClass008 A08;
    public C018708s A09;
    public C0Zn A0A;
    public C0L5 A0B;
    public C03120Eg A0C;
    public C3Ji A0D;
    public C02E A0E;
    public C0C9 A0F;
    public C42711wC A0G;
    public C0GV A0H;
    public C0D5 A0I;
    public C0C8 A0J;
    public C00A A0K;
    public C05E A0L;
    public C43081wp A0M;
    public C0ED A0N;
    public AnonymousClass011 A0O;
    public C0ES A0P;
    public C03360Fk A0Q;
    public AbstractC005302j A0R;
    public C42451vl A0S;
    public C02980Dr A0T;
    public C41521u3 A0U;
    public C02O A0V;
    public C05G A0W;
    public C2MN A0X;
    public C2M4 A0Y;
    public C2AT A0Z;
    public C2MG A0a;
    public InterfaceC002901k A0b;
    public String A0c;
    public ArrayList A0d;
    public final C00T A0h = new C00T() { // from class: X.39H
        {
            StarredMessagesActivity.this = this;
        }

        @Override // X.C00T
        public void A08(AnonymousClass092 anonymousClass092, int i) {
            if (anonymousClass092 != null && anonymousClass092.A0j) {
                StarredMessagesActivity starredMessagesActivity = StarredMessagesActivity.this;
                starredMessagesActivity.A1P().post(new RunnableEBaseShape1S0200000_I0_1(starredMessagesActivity, anonymousClass092, 17));
            }
        }

        @Override // X.C00T
        public void A0A(Collection collection, AbstractC005302j abstractC005302j, Map map, boolean z) {
            if (collection != null) {
                if (collection.isEmpty()) {
                    return;
                }
            } else if (map != null) {
                return;
            }
            StarredMessagesActivity.A00(StarredMessagesActivity.this);
        }

        @Override // X.C00T
        public void A0B(Collection collection, Map map, Map map2) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (((AnonymousClass092) it.next()).A0j) {
                    StarredMessagesActivity.A00(StarredMessagesActivity.this);
                    return;
                }
            }
        }
    };
    public final C0GA A0g = new C0GA() { // from class: X.39I
        {
            StarredMessagesActivity.this = this;
        }

        @Override // X.C0GA
        public void A00() {
            StarredMessagesActivity.this.A0D.notifyDataSetChanged();
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            StarredMessagesActivity.this.A0D.notifyDataSetChanged();
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            StarredMessagesActivity.this.A0D.notifyDataSetChanged();
        }
    };
    public final C0GC A0f = new C0GC() { // from class: X.39J
        {
            StarredMessagesActivity.this = this;
        }

        @Override // X.C0GC
        public void A00(AbstractC005302j abstractC005302j) {
            StarredMessagesActivity.this.A0D.notifyDataSetChanged();
        }
    };
    public final C0GE A0i = new C0GE() { // from class: X.39K
        {
            StarredMessagesActivity.this = this;
        }

        @Override // X.C0GE
        public void A00(Set set) {
            StarredMessagesActivity.this.A0D.notifyDataSetChanged();
        }
    };
    public final AbsListView.OnScrollListener A0e = new AbsListView.OnScrollListener() { // from class: X.2sR
        public int A00;
        public int A01;

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }

        {
            StarredMessagesActivity.this = this;
        }

        public final void A00(int i, int i2) {
            AnonymousClass092 item;
            StarredMessagesActivity starredMessagesActivity = StarredMessagesActivity.this;
            int count = starredMessagesActivity.A0D.getCount();
            while (i <= i2) {
                int headerViewsCount = i - starredMessagesActivity.A1P().getHeaderViewsCount();
                if (headerViewsCount >= 0 && headerViewsCount <= count - 1 && (item = starredMessagesActivity.A0D.getItem(headerViewsCount)) != null && item.A0m == 13) {
                    starredMessagesActivity.A7F(item.A0n);
                }
                i++;
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            int i4;
            if (i2 != 0 && (i4 = this.A01) != 0) {
                int i5 = i + i2;
                int i6 = this.A00;
                int i7 = i4 + i6;
                if (i6 < i) {
                    A00(i6, i - 1);
                } else if (i5 < i7) {
                    A00(i5 + 1, i7);
                }
            }
            this.A00 = i;
            this.A01 = i2;
        }
    };

    @Override // X.InterfaceC04690Ll
    public int A95() {
        return 1;
    }

    @Override // X.InterfaceC04690Ll
    public boolean AFv(AnonymousClass092 anonymousClass092) {
        return false;
    }

    public static void A00(StarredMessagesActivity starredMessagesActivity) {
        Bundle bundle;
        if (!TextUtils.isEmpty(starredMessagesActivity.A0c)) {
            bundle = new Bundle();
            bundle.putString("query", starredMessagesActivity.A0c);
        } else {
            bundle = null;
        }
        C0m3.A00(starredMessagesActivity).A02(0, bundle, starredMessagesActivity);
    }

    @Override // X.AbstractActivityC04650Lh
    public boolean A1X() {
        if (((AbstractActivityC04650Lh) this).A00 != null) {
            return false;
        }
        Log.i("starred/selectionrequested");
        this.A0D.notifyDataSetChanged();
        ((AbstractActivityC04650Lh) this).A00 = A0e(new C68353Jh(this, this, ((ActivityC02290Ap) this).A0A, this.A0T, this.A0Y, this.A02, this.A0b, this.A0a, this.A0O, this.A04, this.A07, this.A05, this.A0X, ((ActivityC02270An) this).A00, ((AbstractActivityC04650Lh) this).A06, this.A0N, this.A0E, this.A09, ((ActivityC02310Ar) this).A01, this.A0P, super.A0Z, this.A0Z, this.A0M, this.A0S, super.A0U, this.A0J, this.A0V));
        return true;
    }

    public final void A1Y() {
        if (this.A0D.A02 == null) {
            findViewById(R.id.empty_view).setVisibility(8);
            findViewById(R.id.search_no_matches).setVisibility(8);
            findViewById(R.id.progress).setVisibility(0);
            return;
        }
        ArrayList arrayList = this.A0d;
        if (arrayList != null && !arrayList.isEmpty()) {
            findViewById(R.id.empty_view).setVisibility(8);
            TextView textView = (TextView) findViewById(R.id.search_no_matches);
            textView.setVisibility(0);
            textView.setText(getString(R.string.search_no_results, this.A0c));
            findViewById(R.id.progress).setVisibility(8);
            return;
        }
        findViewById(R.id.empty_view).setVisibility(0);
        findViewById(R.id.search_no_matches).setVisibility(8);
        findViewById(R.id.progress).setVisibility(8);
    }

    @Override // X.AbstractActivityC04650Lh, X.InterfaceC04690Ll
    public C658038p A99() {
        return ((AbstractActivityC04650Lh) this).A0C.A00;
    }

    @Override // X.InterfaceC04690Ll
    public ArrayList ACy() {
        return this.A0d;
    }

    @Override // X.C0HQ
    public C13930m5 AJ7(int i, Bundle bundle) {
        return new AbstractC28721Ti(this, this.A0M, bundle == null ? null : bundle.getString("query"), this.A0R) { // from class: X.3Jj
            public Cursor A00;
            public C0HE A01;
            public final C43081wp A02;
            public final AbstractC005302j A03;
            public final String A04;

            {
                this.A04 = r3;
                this.A02 = r2;
                this.A03 = r4;
            }

            @Override // X.C13930m5
            public void A01() {
                A06();
                Cursor cursor = this.A00;
                if (cursor != null && !cursor.isClosed()) {
                    this.A00.close();
                }
                this.A00 = null;
            }

            @Override // X.C13930m5
            public void A02() {
                Cursor cursor = this.A00;
                if (cursor != null) {
                    A04(cursor);
                }
                boolean z = ((C13930m5) this).A03;
                ((C13930m5) this).A03 = false;
                super.A04 |= z;
                if (z || this.A00 == null) {
                    A00();
                }
            }

            @Override // X.C13930m5
            public void A03() {
                A06();
            }

            @Override // X.AbstractC28721Ti
            public Object A07() {
                C0HE c0he;
                Cursor A03;
                synchronized (this) {
                    if (!(((AbstractC28721Ti) this).A02 != null)) {
                        c0he = new C0HE();
                        this.A01 = c0he;
                    } else {
                        throw new C0S2();
                    }
                }
                try {
                    AbstractC005302j abstractC005302j = this.A03;
                    if (abstractC005302j != null) {
                        A03 = this.A02.A02(abstractC005302j, this.A04, c0he);
                    } else {
                        A03 = this.A02.A03(this.A04, c0he);
                    }
                    try {
                        A03.getCount();
                        synchronized (this) {
                            this.A01 = null;
                        }
                        return A03;
                    } catch (RuntimeException e) {
                        A03.close();
                        throw e;
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        this.A01 = null;
                        throw th;
                    }
                }
            }

            @Override // X.AbstractC28721Ti
            public void A08() {
                synchronized (this) {
                    C0HE c0he = this.A01;
                    if (c0he != null) {
                        c0he.A01();
                    }
                }
            }

            @Override // X.AbstractC28721Ti
            public void A0B(Object obj) {
                Cursor cursor = (Cursor) obj;
                if (cursor == null || cursor.isClosed()) {
                    return;
                }
                cursor.close();
            }

            @Override // X.C13930m5
            /* renamed from: A0C */
            public void A04(Cursor cursor) {
                if (this.A05) {
                    if (cursor != null) {
                        cursor.close();
                        return;
                    }
                    return;
                }
                Cursor cursor2 = this.A00;
                this.A00 = cursor;
                if (this.A06) {
                    super.A04(cursor);
                }
                if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
                    return;
                }
                cursor2.close();
            }
        };
    }

    @Override // X.C0HQ
    public /* bridge */ /* synthetic */ void ALT(C13930m5 c13930m5, Object obj) {
        this.A0D.A00((Cursor) obj);
        A1Y();
        if (TextUtils.isEmpty(this.A0c)) {
            if (this.A0D.isEmpty()) {
                MenuItem menuItem = this.A00;
                if (menuItem != null) {
                    if (menuItem.isActionViewExpanded()) {
                        this.A00.collapseActionView();
                    }
                    this.A00.setVisible(false);
                }
                MenuItem menuItem2 = this.A01;
                if (menuItem2 != null) {
                    menuItem2.setVisible(false);
                    return;
                }
                return;
            }
            MenuItem menuItem3 = this.A00;
            if (menuItem3 != null) {
                menuItem3.setVisible(true);
            }
            MenuItem menuItem4 = this.A01;
            if (menuItem4 == null) {
                return;
            }
            menuItem4.setVisible(true);
        }
    }

    @Override // X.C0HQ
    public void ALZ(C13930m5 c13930m5) {
        this.A0D.A00(null);
    }

    @Override // X.AbstractActivityC04650Lh, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
        } else {
            Collection A1U = A1U();
            if (!((AbstractCollection) A1U).isEmpty()) {
                List A0F = C003101m.A0F(AbstractC005302j.class, intent.getStringArrayListExtra("jids"));
                Iterator it = C0CA.A01(A1U).iterator();
                while (it.hasNext()) {
                    this.A05.A0E(this.A03, (AnonymousClass092) it.next(), A0F);
                }
                AbstractList abstractList = (AbstractList) A0F;
                if (abstractList.size() == 1 && !C003101m.A0Z((Jid) abstractList.get(0))) {
                    ((ActivityC02270An) this).A00.A07(this, Conversation.A00(this, ((AbstractActivityC04650Lh) this).A06.A0A((AbstractC005302j) abstractList.get(0))));
                } else {
                    A1L(A0F);
                }
            } else {
                Log.w("starred/forward/failed");
                ((ActivityC02290Ap) this).A0A.A07(R.string.message_forward_failed, 0);
            }
            A1V();
        }
    }

    @Override // X.C2Nc, X.AbstractActivityC04650Lh, X.AbstractActivityC04660Li, X.AbstractActivityC04670Lj, X.AbstractActivityC04680Lk, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.starred_messages);
        A0z();
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            this.A08.A01(this.A0g);
            this.A0K.A01(this.A0h);
            this.A06.A01(this.A0f);
            this.A0Q.A01(this.A0i);
            this.A0A = this.A0B.A04(this);
            C02L c02l = this.A02;
            c02l.A05();
            if (c02l.A00 != null) {
                C05E c05e = this.A0L;
                c05e.A05();
                if (c05e.A01 && this.A0W.A02()) {
                    this.A0R = AbstractC005302j.A02(getIntent().getStringExtra("jid"));
                    C0GV c0gv = this.A0H;
                    if (bundle != null) {
                        c0gv.A00 = bundle.getLong("ephemeral_session_start", -1L);
                    }
                    this.A0G.A03(this.A0R, StarredMessagesActivity.class.getName());
                    C37641mk c37641mk = new C37641mk();
                    if (this.A0R == null) {
                        c37641mk.A00 = 1;
                    } else {
                        c37641mk.A00 = 0;
                    }
                    this.A0O.A0B(c37641mk, null, false);
                    setContentView(R.layout.starred_messages);
                    this.A0D = new C3Ji(this);
                    ListView A1P = A1P();
                    A1P.setFastScrollEnabled(false);
                    A1P.setScrollbarFadingEnabled(true);
                    A1P.setOnScrollListener(this.A0e);
                    A1Q(this.A0D);
                    C0m3.A00(this).A01(0, null, this);
                    A1Y();
                    return;
                }
            }
            Log.i("starred/create/no-me-or-msgstore-db");
            if (((ActivityC02290Ap) this).A0A != null) {
                startActivity(new Intent(this, Main.class));
                finish();
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem add = menu.add(0, R.id.menuitem_unstar_all, 0, R.string.unstar_all);
        this.A01 = add;
        add.setShowAsAction(0);
        this.A01.setVisible(!((ActivityC02250Al) this).A00.isEmpty());
        if (this.A0I.A0O()) {
            C0U1 A0c = A0c();
            if (A0c != null) {
                SearchView searchView = new SearchView(A0c.A02());
                ((TextView) searchView.findViewById(R.id.search_src_text)).setTextColor(getResources().getColor(R.color.search_text_color_dark));
                searchView.setQueryHint(getString(R.string.search_hint));
                searchView.A0B = new InterfaceC07650Zd() { // from class: X.39L
                    @Override // X.InterfaceC07650Zd
                    public boolean ANY(String str) {
                        return false;
                    }

                    {
                        StarredMessagesActivity.this = this;
                    }

                    @Override // X.InterfaceC07650Zd
                    public boolean ANX(String str) {
                        StarredMessagesActivity starredMessagesActivity = StarredMessagesActivity.this;
                        starredMessagesActivity.A0c = str;
                        starredMessagesActivity.A0d = C09940f2.A03(str, ((ActivityC02310Ar) starredMessagesActivity).A01);
                        C0m3.A00(starredMessagesActivity).A02(0, C000200d.A02("query", str), starredMessagesActivity);
                        return false;
                    }
                };
                MenuItem icon = menu.add(0, R.id.menuitem_search, 0, R.string.search).setIcon(R.drawable.ic_action_search);
                this.A00 = icon;
                icon.setVisible(!((ActivityC02250Al) this).A00.isEmpty());
                this.A00.setActionView(searchView);
                this.A00.setShowAsAction(10);
                this.A00.setOnActionExpandListener(new MenuItem.OnActionExpandListener() { // from class: X.2sS
                    @Override // android.view.MenuItem.OnActionExpandListener
                    public boolean onMenuItemActionExpand(MenuItem menuItem) {
                        return true;
                    }

                    {
                        StarredMessagesActivity.this = this;
                    }

                    @Override // android.view.MenuItem.OnActionExpandListener
                    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
                        StarredMessagesActivity.this.A0d = null;
                        return true;
                    }
                });
            } else {
                throw null;
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.AbstractActivityC04650Lh, X.ActivityC02250Al, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A0A.A00();
        this.A08.A00(this.A0g);
        this.A0K.A00(this.A0h);
        this.A06.A00(this.A0f);
        this.A0Q.A00(this.A0i);
        this.A0C.A05();
        if (isFinishing()) {
            this.A0G.A04(this.A0R, StarredMessagesActivity.class.getName());
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_unstar_all) {
            new UnstarAllDialogFragment().A14(A0N(), "UnstarAllDialogFragment");
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // X.AbstractActivityC04650Lh, X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.A0C.A08()) {
            this.A0C.A02();
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.A0C.A08()) {
            this.A0C.A04();
        }
        this.A0D.notifyDataSetChanged();
    }

    @Override // X.AbstractActivityC04650Lh, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putLong("ephemeral_session_start", this.A0H.A00);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        MenuItem menuItem = this.A00;
        if (menuItem != null) {
            menuItem.expandActionView();
            return false;
        }
        return false;
    }

    /* loaded from: classes2.dex */
    public class UnstarAllDialogFragment extends Hilt_StarredMessagesActivity_UnstarAllDialogFragment {
        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            C019208x c019208x = new C019208x(A09());
            c019208x.A02(R.string.unstar_all_confirmation);
            c019208x.A06(R.string.remove_star, new DialogInterface.OnClickListener() { // from class: X.2s4
                {
                    StarredMessagesActivity.UnstarAllDialogFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ActivityC02330At A09 = StarredMessagesActivity.UnstarAllDialogFragment.this.A09();
                    if (A09 instanceof StarredMessagesActivity) {
                        StarredMessagesActivity starredMessagesActivity = (StarredMessagesActivity) A09;
                        starredMessagesActivity.A12(R.string.register_wait_message);
                        starredMessagesActivity.A0b.ARy(new C0HS(starredMessagesActivity.A07, starredMessagesActivity.A0U, starredMessagesActivity.A0M, starredMessagesActivity, starredMessagesActivity.A0R) { // from class: X.39M
                            public final long A00 = SystemClock.elapsedRealtime();
                            public final C41541u6 A01;
                            public final C43081wp A02;
                            public final AbstractC005302j A03;
                            public final C41521u3 A04;
                            public final WeakReference A05;

                            {
                                this.A01 = r3;
                                this.A04 = r4;
                                this.A02 = r5;
                                this.A05 = new WeakReference(starredMessagesActivity);
                                this.A03 = r7;
                            }

                            @Override // X.C0HS
                            public Object A07(Object[] objArr) {
                                List A08;
                                Set A04;
                                C41541u6 c41541u6 = this.A01;
                                AbstractC005302j abstractC005302j = this.A03;
                                C44321ys c44321ys = c41541u6.A0H;
                                C44761zb c44761zb = (C44761zb) c44321ys.A02("star");
                                if (c44761zb == null) {
                                    A04 = Collections.emptySet();
                                } else {
                                    C02L c02l = c41541u6.A03;
                                    c02l.A05();
                                    if (c02l.A03 == null) {
                                        A04 = Collections.emptySet();
                                    } else if (!c41541u6.A0W()) {
                                        A04 = Collections.emptySet();
                                    } else {
                                        C0CD A03 = c44761zb.A05.A03();
                                        try {
                                            if (abstractC005302j != null) {
                                                Cursor A02 = c44761zb.A06.A02(abstractC005302j, null, null);
                                                A08 = c44761zb.A08(A02, A03, false);
                                                ((CursorWrapper) A02).close();
                                            } else {
                                                Cursor A032 = c44761zb.A06.A03(null, null);
                                                A08 = c44761zb.A08(A032, A03, false);
                                                ((CursorWrapper) A032).close();
                                            }
                                            A03.close();
                                            A04 = c44321ys.A04(A08);
                                        } finally {
                                        }
                                    }
                                }
                                boolean A05 = this.A02.A05(abstractC005302j);
                                if (A05) {
                                    c41541u6.A0V(A04);
                                    this.A04.A01(8, abstractC005302j, 0L, 0);
                                } else {
                                    c41541u6.A0U(A04);
                                }
                                ActivityC02290Ap.A06(this.A00, 300L);
                                return Boolean.valueOf(A05);
                            }

                            @Override // X.C0HS
                            public void A09(Object obj) {
                                Boolean bool = (Boolean) obj;
                                StarredMessagesActivity starredMessagesActivity2 = (StarredMessagesActivity) this.A05.get();
                                if (starredMessagesActivity2 != null && !starredMessagesActivity2.AFE()) {
                                    starredMessagesActivity2.ARS();
                                    if (bool.booleanValue()) {
                                        C0m3.A00(starredMessagesActivity2).A02(0, null, starredMessagesActivity2);
                                        starredMessagesActivity2.A1Y();
                                        return;
                                    }
                                    ((ActivityC02290Ap) starredMessagesActivity2).A0A.A0E(((ActivityC02310Ar) starredMessagesActivity2).A01.A08(R.plurals.unstar_while_clearing_error, 2L), 0);
                                }
                            }
                        }, new Void[0]);
                    }
                }
            });
            c019208x.A04(R.string.cancel, null);
            return c019208x.A00();
        }
    }
}
