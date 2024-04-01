package X;

import X.C019208x;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.ContentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment;
import com.whatsapp.Hilt_ContentDistributionRecipientsPickerActivity_DiscardChangesConfirmationDialogFragment;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0Vs */
/* loaded from: classes.dex */
public abstract class AbstractActivityC06930Vs extends AbstractActivityC06940Vt {
    public MenuItem A00;
    public MenuItem A01;
    public C1K3 A02;
    public C34771i4 A03;
    public C34791i6 A04;
    public C07630Zb A05;
    public C40261rr A06;
    public C03320Ff A07;
    public C05W A08;
    public AnonymousClass008 A09;
    public C018708s A0A;
    public C0Zn A0B;
    public C0L5 A0C;
    public C02F A0D;
    public C03360Fk A0E;
    public C2AR A0F;
    public C2MG A0G;
    public InterfaceC002901k A0H;
    public String A0I;
    public ArrayList A0J;
    public final Handler A0N;
    public final C0GC A0O;
    public final C0GA A0P;
    public final C0GE A0Q;
    public final Runnable A0R;
    public final Set A0T;
    public List A0K = new ArrayList();
    public Set A0L = new HashSet();
    public final Set A0S = new HashSet();
    public final Set A0U = new HashSet();
    public boolean A0M = true;

    public abstract int A1R();

    public abstract int A1S();

    public abstract int A1T();

    public abstract List A1U();

    public abstract List A1V();

    public abstract void A1b();

    public abstract void A1e(Collection collection);

    public boolean A1f() {
        return true;
    }

    public AbstractActivityC06930Vs() {
        final HashSet hashSet = new HashSet();
        this.A0T = hashSet;
        this.A0R = new Runnable() { // from class: X.1Jo
            @Override // java.lang.Runnable
            public final void run() {
                hashSet.clear();
            }
        };
        this.A0N = new Handler(Looper.getMainLooper());
        this.A0P = new C0GA() { // from class: X.1hz
            {
                AbstractActivityC06930Vs.this = this;
            }

            @Override // X.C0GA
            public void A00() {
                AbstractActivityC06930Vs.this.A1Y();
            }

            @Override // X.C0GA
            public void A01(AbstractC005302j abstractC005302j) {
                AbstractActivityC06930Vs abstractActivityC06930Vs = AbstractActivityC06930Vs.this;
                if (C06C.A00(abstractActivityC06930Vs.A0K, new C3AD(abstractActivityC06930Vs.A08.A0A(abstractC005302j)))) {
                    abstractActivityC06930Vs.A02.notifyDataSetChanged();
                }
            }

            @Override // X.C0GA
            public void A03(UserJid userJid) {
                AbstractActivityC06930Vs abstractActivityC06930Vs = AbstractActivityC06930Vs.this;
                if (C06C.A00(abstractActivityC06930Vs.A0K, new C3AC(abstractActivityC06930Vs.A08.A0A(userJid)))) {
                    abstractActivityC06930Vs.A02.notifyDataSetChanged();
                }
            }

            @Override // X.C0GA
            public void A04(UserJid userJid) {
                AbstractActivityC06930Vs abstractActivityC06930Vs = AbstractActivityC06930Vs.this;
                if (C06C.A00(abstractActivityC06930Vs.A0K, new C3AE(abstractActivityC06930Vs.A08.A0A(userJid)))) {
                    abstractActivityC06930Vs.A02.notifyDataSetChanged();
                }
            }

            @Override // X.C0GA
            public void A05(Collection collection) {
                AbstractActivityC06930Vs.this.A02.notifyDataSetChanged();
            }
        };
        this.A0O = new C0GC() { // from class: X.1i0
            {
                AbstractActivityC06930Vs.this = this;
            }

            @Override // X.C0GC
            public void A00(AbstractC005302j abstractC005302j) {
                AbstractActivityC06930Vs.this.A1Y();
            }
        };
        this.A0Q = new C0GE() { // from class: X.1i1
            {
                AbstractActivityC06930Vs.this = this;
            }

            @Override // X.C0GE
            public void A00(Set set) {
                AbstractActivityC06930Vs.this.A1Y();
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0HS, X.1i4] */
    public static void A00(AbstractActivityC06930Vs abstractActivityC06930Vs) {
        C34771i4 c34771i4 = abstractActivityC06930Vs.A03;
        if (c34771i4 != null) {
            c34771i4.A05(true);
            abstractActivityC06930Vs.A03 = null;
        }
        ?? r2 = new C0HS(abstractActivityC06930Vs.A0J, abstractActivityC06930Vs.A0K) { // from class: X.1i4
            public final ArrayList A00;
            public final List A01;

            {
                ArrayList arrayList;
                AbstractActivityC06930Vs.this = abstractActivityC06930Vs;
                if (r3 != null) {
                    arrayList = new ArrayList(r3);
                } else {
                    arrayList = null;
                }
                this.A00 = arrayList;
                this.A01 = r4;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                ArrayList arrayList = new ArrayList();
                for (C06C c06c : this.A01) {
                    if (AbstractActivityC06930Vs.this.A0A.A0G(c06c, this.A00, true)) {
                        arrayList.add(c06c);
                    }
                }
                return arrayList;
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                String string;
                AbstractActivityC06930Vs abstractActivityC06930Vs2 = AbstractActivityC06930Vs.this;
                abstractActivityC06930Vs2.A03 = null;
                C1K3 c1k3 = abstractActivityC06930Vs2.A02;
                c1k3.A00 = (ArrayList) obj;
                c1k3.notifyDataSetChanged();
                View findViewById = abstractActivityC06930Vs2.findViewById(16908292);
                if (abstractActivityC06930Vs2.A02.isEmpty()) {
                    findViewById.setVisibility(0);
                    if (TextUtils.isEmpty(abstractActivityC06930Vs2.A0I)) {
                        string = abstractActivityC06930Vs2.getString(R.string.contact_picker_no_wa_contacts);
                    } else {
                        string = abstractActivityC06930Vs2.getString(R.string.search_no_results, abstractActivityC06930Vs2.A0I);
                    }
                    TextView textView = (TextView) abstractActivityC06930Vs2.findViewById(R.id.search_no_matches);
                    textView.setText(string);
                    textView.setVisibility(0);
                    abstractActivityC06930Vs2.findViewById(R.id.init_contacts_progress).setVisibility(8);
                    return;
                }
                findViewById.setVisibility(8);
            }
        };
        abstractActivityC06930Vs.A03 = r2;
        abstractActivityC06930Vs.A0H.ARy(r2, new Void[0]);
    }

    public void A1W() {
        A1X();
    }

    public void A1X() {
        A1Y();
        ListView listView = (ListView) findViewById(16908298);
        View view = new View(this);
        view.setLayoutParams(new AbsListView.LayoutParams(1, getResources().getDimensionPixelSize(R.dimen.actionbar_height)));
        listView.addFooterView(view, null, false);
        this.A02 = new C1K3(this);
        invalidateOptionsMenu();
        listView.setAdapter((ListAdapter) this.A02);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: X.1Fn
            {
                AbstractActivityC06930Vs.this = this;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                AbstractActivityC06930Vs abstractActivityC06930Vs = AbstractActivityC06930Vs.this;
                if (view2.getTag() instanceof C1K5) {
                    abstractActivityC06930Vs.A1d(((C1K5) view2.getTag()).A03);
                }
            }
        });
        A1a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1i6, X.0HS] */
    public final void A1Y() {
        C34791i6 c34791i6 = this.A04;
        if (c34791i6 != null) {
            c34791i6.A05(true);
        }
        C34771i4 c34771i4 = this.A03;
        if (c34771i4 != null) {
            c34771i4.A05(true);
            this.A03 = null;
        }
        ?? r2 = new C0HS(this.A0U) { // from class: X.1i6
            public final Set A00;

            {
                AbstractActivityC06930Vs.this = this;
                HashSet hashSet = new HashSet();
                this.A00 = hashSet;
                hashSet.addAll(r3);
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                final C1K4 c1k4 = new C1K4();
                ArrayList arrayList = new ArrayList();
                c1k4.A00 = arrayList;
                AbstractActivityC06930Vs abstractActivityC06930Vs = AbstractActivityC06930Vs.this;
                abstractActivityC06930Vs.A08.A05.A0V(arrayList, 1, false, false);
                c1k4.A01 = new HashSet(c1k4.A00.size(), 1.0f);
                Iterator it = c1k4.A00.iterator();
                while (it.hasNext()) {
                    c1k4.A01.add(((C06C) it.next()).A03(UserJid.class));
                }
                List<AbstractC005302j> A1U = abstractActivityC06930Vs.A0M ? abstractActivityC06930Vs.A1U() : abstractActivityC06930Vs.A1V();
                c1k4.A02 = new HashSet(A1U.size());
                for (AbstractC005302j abstractC005302j : A1U) {
                    if (abstractActivityC06930Vs.A1f()) {
                        if (c1k4.A01.contains(abstractC005302j)) {
                            c1k4.A02.add(abstractC005302j);
                        }
                    } else {
                        if (!c1k4.A01.contains(abstractC005302j)) {
                            c1k4.A01.add(abstractC005302j);
                            c1k4.A00.add(abstractActivityC06930Vs.A08.A0A(abstractC005302j));
                        }
                        c1k4.A02.add(abstractC005302j);
                    }
                }
                Collections.sort(c1k4.A00, new C57722pt(abstractActivityC06930Vs.A0A, ((ActivityC02310Ar) abstractActivityC06930Vs).A01) { // from class: X.1i5
                    @Override // X.C57722pt
                    public int A00(C06C c06c, C06C c06c2) {
                        C1K4 c1k42 = c1k4;
                        boolean contains = c1k42.A02.contains(c06c.A03(UserJid.class));
                        if (contains == c1k42.A02.contains(c06c2.A03(UserJid.class))) {
                            return super.compare(c06c, c06c2);
                        }
                        return contains ? -1 : 1;
                    }
                });
                if (A1U.size() != c1k4.A02.size()) {
                    StringBuilder A0P = C000200d.A0P("statusrecipients/update old:");
                    A0P.append(A1U.size());
                    A0P.append(" new:");
                    A0P.append(c1k4.A02.size());
                    Log.i(A0P.toString());
                    abstractActivityC06930Vs.A1e(c1k4.A02);
                }
                return c1k4;
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                C1K4 c1k4 = (C1K4) obj;
                AbstractActivityC06930Vs abstractActivityC06930Vs = AbstractActivityC06930Vs.this;
                abstractActivityC06930Vs.A04 = null;
                Set set = abstractActivityC06930Vs.A0U;
                set.clear();
                set.addAll(c1k4.A02);
                Set set2 = abstractActivityC06930Vs.A0S;
                set2.clear();
                set2.addAll(set);
                Set set3 = this.A00;
                if (!set3.isEmpty()) {
                    for (Object obj2 : set3) {
                        if (!abstractActivityC06930Vs.A1f() || c1k4.A01.contains(obj2)) {
                            set.add(obj2);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    for (Object obj3 : c1k4.A02) {
                        if (!set3.contains(obj3)) {
                            hashSet.add(obj3);
                        }
                    }
                    set.removeAll(hashSet);
                }
                abstractActivityC06930Vs.A1a();
                ArrayList arrayList = c1k4.A00;
                abstractActivityC06930Vs.A0K = arrayList;
                abstractActivityC06930Vs.A0L = c1k4.A01;
                MenuItem menuItem = abstractActivityC06930Vs.A00;
                if (menuItem != null) {
                    menuItem.setVisible(!arrayList.isEmpty());
                }
                AbstractActivityC06930Vs.A00(abstractActivityC06930Vs);
            }
        };
        this.A04 = r2;
        this.A0H.ARy(r2, new Void[0]);
    }

    public final void A1Z() {
        Set set = this.A0S;
        Set set2 = this.A0U;
        if (set.containsAll(set2) && set2.containsAll(set)) {
            finish();
        } else {
            AUh(new Hilt_ContentDistributionRecipientsPickerActivity_DiscardChangesConfirmationDialogFragment() { // from class: com.whatsapp.ContentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment
                @Override // androidx.fragment.app.DialogFragment
                public Dialog A0z(Bundle bundle) {
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.1Fo
                        {
                            ContentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment.this = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            ActivityC02330At A09 = A09();
                            if (A09 != null) {
                                A09.finish();
                            }
                        }
                    };
                    C019208x c019208x = new C019208x(A09());
                    c019208x.A02(R.string.discard_changes);
                    c019208x.A06(R.string.discard_status_privacy_changes, onClickListener);
                    c019208x.A04(R.string.cancel_discarding_status_privacy_changes, null);
                    return c019208x.A00();
                }
            });
        }
    }

    public final void A1a() {
        Set set;
        String A0A;
        if (this.A0M) {
            Set set2 = this.A0U;
            set = set2;
            if (set2.isEmpty()) {
                A0A = getString(R.string.no_contacts_excluded);
            } else {
                A0A = ((ActivityC02310Ar) this).A01.A0A(R.plurals.status_contacts_excluded, set2.size(), Integer.valueOf(set2.size()));
            }
        } else {
            set = this.A0U;
            if (set.isEmpty()) {
                A0A = getString(R.string.no_contacts_selected);
            } else {
                A0A = ((ActivityC02310Ar) this).A01.A0A(R.plurals.status_contacts_selected, set.size(), Integer.valueOf(set.size()));
            }
        }
        MenuItem menuItem = this.A01;
        if (menuItem != null) {
            int size = set.size();
            int size2 = this.A0L.size();
            int i = R.string.select_all;
            if (size == size2) {
                i = R.string.unselect_all;
            }
            menuItem.setTitle(i);
        }
        C0U1 A0c = A0c();
        if (A0c == null) {
            throw null;
        }
        A0c.A0G(A0A);
    }

    public void A1c(C06C c06c) {
        C40261rr c40261rr = this.A06;
        Jid A03 = c06c.A03(UserJid.class);
        if (A03 != null) {
            c40261rr.A07(this, null, (UserJid) A03);
            return;
        }
        throw null;
    }

    public final void A1d(UserJid userJid) {
        SearchView searchView;
        if (this.A06.A0H(userJid)) {
            int A1S = A1S();
            if (A1S != 0) {
                final C06C A0A = this.A08.A0A(userJid);
                UnblockDialogFragment.A00(getString(A1S, this.A0A.A08(A0A, false)), R.string.blocked_title, false, new C2nQ() { // from class: X.1h5
                    {
                        AbstractActivityC06930Vs.this = this;
                    }

                    @Override // X.C2nQ
                    public final void AVi() {
                        AbstractActivityC06930Vs.this.A1c(A0A);
                    }
                }).A14(A0N(), null);
                return;
            }
            return;
        }
        Set set = this.A0U;
        if (set.contains(userJid)) {
            set.remove(userJid);
        } else {
            set.add(userJid);
        }
        if (!TextUtils.isEmpty(this.A0I) && set.contains(userJid) && (searchView = this.A05.A01) != null) {
            EditText editText = (EditText) searchView.findViewById(R.id.search_src_text);
            editText.setSelection(0, editText.length());
        }
        this.A0T.add(userJid);
        Handler handler = this.A0N;
        Runnable runnable = this.A0R;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 200L);
        A1a();
        this.A02.notifyDataSetChanged();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 150) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            Log.i("statusrecipients/permissions denied");
            finish();
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (this.A05.A05()) {
            this.A05.A04(true);
        } else {
            A1Z();
        }
    }

    @Override // X.AbstractActivityC06940Vt, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        super.onCreate(bundle);
        setContentView(R.layout.status_contact_picker);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        A0k(toolbar);
        this.A0B = this.A0C.A04(this);
        this.A05 = new C07630Zb(this, ((ActivityC02310Ar) this).A01, findViewById(R.id.search_holder), toolbar, new InterfaceC07650Zd() { // from class: X.1i2
            @Override // X.InterfaceC07650Zd
            public boolean ANY(String str) {
                return false;
            }

            {
                AbstractActivityC06930Vs.this = this;
            }

            @Override // X.InterfaceC07650Zd
            public boolean ANX(String str) {
                AbstractActivityC06930Vs abstractActivityC06930Vs = AbstractActivityC06930Vs.this;
                abstractActivityC06930Vs.A0I = str;
                ArrayList A03 = C09940f2.A03(str, ((ActivityC02310Ar) abstractActivityC06930Vs).A01);
                abstractActivityC06930Vs.A0J = A03;
                if (A03.isEmpty()) {
                    abstractActivityC06930Vs.A0J = null;
                }
                AbstractActivityC06930Vs.A00(abstractActivityC06930Vs);
                return false;
            }
        });
        this.A0M = getIntent().getBooleanExtra("is_black_list", true);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            A0c.A08(this.A0M ? A1R() : A1T());
            if (bundle == null) {
                if (!this.A0D.A03()) {
                    RequestPermissionActivity.A04(this, R.string.permission_contacts_access_on_new_broadcast_request, R.string.permission_contacts_access_on_new_broadcast);
                }
            } else {
                List A0F = C003101m.A0F(UserJid.class, bundle.getStringArrayList("selected_jids"));
                if (!((AbstractCollection) A0F).isEmpty()) {
                    this.A0U.addAll(A0F);
                }
            }
            findViewById(R.id.done).setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.1i3
                {
                    AbstractActivityC06930Vs.this = this;
                }

                @Override // X.AbstractView$OnClickListenerC49532Ky
                public void A00(View view) {
                    AbstractActivityC06930Vs.this.A1b();
                }
            });
            A1W();
            findViewById(16908292).setVisibility(0);
            findViewById(R.id.init_contacts_progress).setVisibility(0);
            this.A09.A01(this.A0P);
            this.A07.A01(this.A0O);
            this.A0E.A01(this.A0Q);
            return;
        }
        throw null;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem icon = menu.add(0, R.id.menuitem_search, 0, R.string.search).setIcon(R.drawable.ic_action_search);
        this.A00 = icon;
        icon.setShowAsAction(10);
        this.A00.setOnActionExpandListener(new MenuItem.OnActionExpandListener() { // from class: X.1K1
            @Override // android.view.MenuItem.OnActionExpandListener
            public boolean onMenuItemActionExpand(MenuItem menuItem) {
                return true;
            }

            {
                AbstractActivityC06930Vs.this = this;
            }

            @Override // android.view.MenuItem.OnActionExpandListener
            public boolean onMenuItemActionCollapse(MenuItem menuItem) {
                AbstractActivityC06930Vs abstractActivityC06930Vs = AbstractActivityC06930Vs.this;
                abstractActivityC06930Vs.A0J = null;
                AbstractActivityC06930Vs.A00(abstractActivityC06930Vs);
                return true;
            }
        });
        this.A00.setVisible(!this.A0K.isEmpty());
        if (this.A02 != null) {
            MenuItem icon2 = menu.add(0, R.id.menuitem_select_all, 0, R.string.select_all).setIcon(R.drawable.ic_action_select_all);
            this.A01 = icon2;
            icon2.setShowAsAction(2);
            MenuItem menuItem = this.A01;
            int size = this.A0U.size();
            int size2 = this.A0L.size();
            int i = R.string.select_all;
            if (size == size2) {
                i = R.string.unselect_all;
            }
            menuItem.setTitle(i);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02250Al, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A09.A00(this.A0P);
        this.A07.A00(this.A0O);
        this.A0E.A00(this.A0Q);
        this.A0B.A00();
        C34791i6 c34791i6 = this.A04;
        if (c34791i6 != null) {
            c34791i6.A05(true);
            this.A04 = null;
        }
        C34771i4 c34771i4 = this.A03;
        if (c34771i4 != null) {
            c34771i4.A05(true);
            this.A03 = null;
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId == R.id.menuitem_select_all) {
            Set set = this.A0U;
            if (set.size() == this.A0L.size()) {
                set.clear();
            } else {
                for (int i = 0; i < this.A02.getCount(); i++) {
                    set.add(((C06C) this.A02.A00.get(i)).A03(UserJid.class));
                }
            }
            this.A02.notifyDataSetChanged();
            A1a();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            A1Z();
            return true;
        }
    }

    @Override // X.ActivityC02250Al, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A05.A02(bundle);
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Set set = this.A0U;
        if (!set.isEmpty()) {
            bundle.putStringArrayList("selected_jids", C003101m.A0E(set));
        }
        this.A05.A03(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        this.A05.A01();
        return false;
    }
}
