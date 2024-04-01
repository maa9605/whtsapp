package com.whatsapp.storage;

import X.AbstractC005302j;
import X.AbstractC04890Mh;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass011;
import X.AnonymousClass012;
import X.C000400f;
import X.C012005w;
import X.C018508q;
import X.C018708s;
import X.C01B;
import X.C01C;
import X.C05E;
import X.C05W;
import X.C06J;
import X.C07630Zb;
import X.C0C9;
import X.C0L5;
import X.C0TQ;
import X.C0TR;
import X.C0U1;
import X.C0Y0;
import X.C0Zn;
import X.C15230oI;
import X.C25N;
import X.C25O;
import X.C25Q;
import X.C27791Ou;
import X.C2AR;
import X.C2QD;
import X.C3SV;
import X.C40411sD;
import X.C42471vn;
import X.C44301yq;
import X.C461825l;
import X.C53982hr;
import X.C54022hv;
import X.InterfaceC002901k;
import X.InterfaceC05620Pl;
import X.InterfaceC07650Zd;
import X.InterfaceC53992hs;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.storage.StorageUsageActivity;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class StorageUsageActivity extends C2QD {
    public static final long A0Y = TimeUnit.MINUTES.toMillis(1);
    public int A00;
    public int A01;
    public RecyclerView A02;
    public C012005w A03;
    public C018508q A04;
    public C07630Zb A05;
    public C01B A06;
    public C05W A07;
    public C018708s A08;
    public C0Zn A09;
    public C0L5 A0A;
    public C000400f A0B;
    public AnonymousClass012 A0C;
    public C0C9 A0D;
    public C06J A0E;
    public C40411sD A0F;
    public C05E A0G;
    public C25Q A0I;
    public AnonymousClass011 A0J;
    public C2AR A0K;
    public C54022hv A0L;
    public C25N A0M;
    public C25O A0N;
    public C42471vn A0O;
    public InterfaceC002901k A0P;
    public C44301yq A0Q;
    public RunnableEBaseShape4S0200000_I0_4 A0R;
    public String A0S;
    public String A0T;
    public List A0V;
    public final C461825l A0W = new C461825l();
    public final Set A0X = new HashSet();
    public ArrayList A0U = new ArrayList();
    public InterfaceC53992hs A0H = new C53982hr(this);

    public static Intent A00(Context context, String str, int i) {
        Intent intent = new Intent(context, StorageUsageActivity.class);
        intent.putExtra("session_id", str);
        intent.putExtra("entry_point", i);
        return intent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0053, code lost:
        if (r9 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0050, code lost:
        if (r10 != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(com.whatsapp.storage.StorageUsageActivity r7, java.util.List r8, java.util.List r9, boolean r10) {
        /*
            monitor-enter(r7)
            java.lang.String r0 = r7.A0S     // Catch: java.lang.Throwable -> Lbb
            r3 = 2
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L4f
            if (r8 == 0) goto L4f
            boolean r0 = r8.isEmpty()     // Catch: java.lang.Throwable -> Lbb
            if (r0 != 0) goto L4f
            if (r9 == 0) goto L4f
            boolean r0 = r9.isEmpty()     // Catch: java.lang.Throwable -> Lbb
            if (r0 != 0) goto L4f
            java.util.Iterator r4 = r9.iterator()     // Catch: java.lang.Throwable -> Lbb
        L1c:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> Lbb
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> Lbb
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r0 = r8.get(r0)     // Catch: java.lang.Throwable -> Lbb
            X.1Ou r0 = (X.C27791Ou) r0     // Catch: java.lang.Throwable -> Lbb
            X.02j r1 = r0.A01()     // Catch: java.lang.Throwable -> Lbb
            X.05W r0 = r7.A07     // Catch: java.lang.Throwable -> Lbb
            if (r1 == 0) goto L4b
            X.06C r2 = r0.A09(r1)     // Catch: java.lang.Throwable -> Lbb
            if (r2 == 0) goto L1c
            X.08s r1 = r7.A08     // Catch: java.lang.Throwable -> Lbb
            java.util.List r0 = r7.A0V     // Catch: java.lang.Throwable -> Lbb
            boolean r0 = r1.A0G(r2, r0, r5)     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto L1c
            goto L52
        L4b:
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> Lbb
        L4d:
            r4 = 1
            goto L58
        L4f:
            r4 = 0
            if (r10 == 0) goto L53
        L52:
            r4 = 2
        L53:
            if (r9 != 0) goto L58
        L55:
            if (r8 != 0) goto L6b
            goto L65
        L58:
            X.0Zb r0 = r7.A05     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto La9
            boolean r0 = r0.A05()     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto La9
            if (r4 != r3) goto La9
            goto L55
        L65:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbb
            r8.<init>()     // Catch: java.lang.Throwable -> Lbb
            goto La9
        L6b:
            java.lang.String r0 = r7.A0S     // Catch: java.lang.Throwable -> Lbb
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lbb
            if (r0 != 0) goto La9
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbb
            r3.<init>()     // Catch: java.lang.Throwable -> Lbb
        L78:
            int r0 = r8.size()     // Catch: java.lang.Throwable -> Lbb
            if (r6 >= r0) goto La8
            java.lang.Object r0 = r8.get(r6)     // Catch: java.lang.Throwable -> Lbb
            X.1Ou r0 = (X.C27791Ou) r0     // Catch: java.lang.Throwable -> Lbb
            X.02j r1 = r0.A01()     // Catch: java.lang.Throwable -> Lbb
            X.05W r0 = r7.A07     // Catch: java.lang.Throwable -> Lbb
            if (r1 == 0) goto La6
            X.06C r2 = r0.A09(r1)     // Catch: java.lang.Throwable -> Lbb
            if (r2 == 0) goto La3
            X.08s r1 = r7.A08     // Catch: java.lang.Throwable -> Lbb
            java.util.List r0 = r7.A0V     // Catch: java.lang.Throwable -> Lbb
            boolean r0 = r1.A0G(r2, r0, r5)     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto La3
            java.lang.Object r0 = r8.get(r6)     // Catch: java.lang.Throwable -> Lbb
            r3.add(r0)     // Catch: java.lang.Throwable -> Lbb
        La3:
            int r6 = r6 + 1
            goto L78
        La6:
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> Lbb
        La8:
            r8 = r3
        La9:
            if (r4 == r5) goto Lb9
            X.08q r2 = r7.A04     // Catch: java.lang.Throwable -> Lbb
            r0 = 48
            java.lang.RunnableEBaseShape0S0300000_I0_0 r1 = new java.lang.RunnableEBaseShape0S0300000_I0_0     // Catch: java.lang.Throwable -> Lbb
            r1.<init>(r7, r8, r9, r0)     // Catch: java.lang.Throwable -> Lbb
            android.os.Handler r0 = r2.A02     // Catch: java.lang.Throwable -> Lbb
            r0.post(r1)     // Catch: java.lang.Throwable -> Lbb
        Lb9:
            monitor-exit(r7)
            return
        Lbb:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.storage.StorageUsageActivity.A01(com.whatsapp.storage.StorageUsageActivity, java.util.List, java.util.List, boolean):void");
    }

    public final void A1P() {
        RunnableEBaseShape4S0200000_I0_4 runnableEBaseShape4S0200000_I0_4 = new RunnableEBaseShape4S0200000_I0_4(this);
        this.A0R = runnableEBaseShape4S0200000_I0_4;
        this.A0P.AS1(runnableEBaseShape4S0200000_I0_4);
        A1Q(3);
    }

    public final void A1Q(int i) {
        this.A0X.add(Integer.valueOf(i));
        this.A0L.A0N(true);
    }

    public final void A1R(int i) {
        Set set = this.A0X;
        set.remove(Integer.valueOf(i));
        this.A0L.A0N(set.size() != 0);
    }

    public /* synthetic */ void lambda$onCreate$2547$StorageUsageActivity(View view) {
        onSearchRequested();
    }

    public /* synthetic */ void lambda$onSearchRequested$2549$StorageUsageActivity(View view) {
        onBackPressed();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == 1) {
            AbstractC005302j A02 = AbstractC005302j.A02(intent.getStringExtra("jid"));
            int intExtra = intent.getIntExtra("gallery_type", -1);
            long longExtra = intent.getLongExtra("memory_size", -1L);
            long longExtra2 = intent.getLongExtra("deleted_size", -1L);
            if (longExtra >= 0) {
                if (longExtra2 > 0) {
                    this.A0P.AS1(new RunnableEBaseShape7S0100000_I0_7(this, 3));
                    this.A0P.AS1(new RunnableEBaseShape7S0100000_I0_7(this, 12));
                    this.A0P.AS1(new RunnableEBaseShape7S0100000_I0_7(this, 11));
                }
                if (intExtra != 0 || A02 == null) {
                    return;
                }
                C54022hv c54022hv = this.A0L;
                for (C27791Ou c27791Ou : c54022hv.A05) {
                    if (c27791Ou.A01().equals(A02)) {
                        c27791Ou.A00.A0G = longExtra;
                        Collections.sort(c54022hv.A05);
                        ((AbstractC04890Mh) c54022hv).A01.A00();
                        return;
                    }
                }
            }
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        C07630Zb c07630Zb = this.A05;
        if (c07630Zb != null && c07630Zb.A05()) {
            this.A0S = null;
            this.A0V = null;
            this.A05.A04(true);
            this.A0L.A0M(false);
            this.A02.A0Y(0);
            return;
        }
        super.onBackPressed();
    }

    @Override // X.C2QD, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i("storage-usage-activity/create");
        this.A0M = new C25N(this.A0C, this.A0Q);
        setTitle(R.string.manage_storage);
        setContentView(R.layout.activity_storage_usage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        A0k(toolbar);
        List<Number> list = null;
        this.A0S = null;
        this.A0V = null;
        if (this.A06.A0E(C01C.A2D)) {
            this.A05 = new C07630Zb(this, ((ActivityC02310Ar) this).A01, findViewById(R.id.search_holder), toolbar, new InterfaceC07650Zd() { // from class: X.3ri
                {
                    StorageUsageActivity.this = this;
                }

                @Override // X.InterfaceC07650Zd
                public boolean ANX(String str) {
                    StorageUsageActivity storageUsageActivity = StorageUsageActivity.this;
                    storageUsageActivity.A0S = str;
                    storageUsageActivity.A0V = C09940f2.A03(str, ((ActivityC02310Ar) storageUsageActivity).A01);
                    StorageUsageActivity.A01(storageUsageActivity, storageUsageActivity.A0U, null, false);
                    return false;
                }

                @Override // X.InterfaceC07650Zd
                public boolean ANY(String str) {
                    StorageUsageActivity storageUsageActivity = StorageUsageActivity.this;
                    storageUsageActivity.A0S = str;
                    storageUsageActivity.A0V = C09940f2.A03(str, ((ActivityC02310Ar) storageUsageActivity).A01);
                    StorageUsageActivity.A01(storageUsageActivity, storageUsageActivity.A0U, null, false);
                    return false;
                }
            });
        }
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            C461825l c461825l = this.A0W;
            c461825l.A05(this, new InterfaceC05620Pl() { // from class: X.3rX
                {
                    StorageUsageActivity.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    StorageUsageActivity storageUsageActivity = StorageUsageActivity.this;
                    Intent intent = (Intent) obj;
                    if (StorageUsageGalleryActivity.class.getName().equals(intent.getComponent() != null ? intent.getComponent().getClassName() : null)) {
                        storageUsageActivity.startActivityForResult(intent, 0);
                    }
                }
            });
            this.A09 = this.A0A.A04(this);
            this.A0T = getIntent().getStringExtra("session_id");
            this.A00 = getIntent().getIntExtra("entry_point", -1);
            this.A02 = (RecyclerView) findViewById(R.id.conversation_list);
            WrappedLinearLayoutManager wrappedLinearLayoutManager = new WrappedLinearLayoutManager();
            this.A0L = new C54022hv(this.A04, ((ActivityC02290Ap) this).A08, this.A0P, this.A0J, this.A06, this.A07, this.A08, ((ActivityC02310Ar) this).A01, this.A0K, this.A0B, wrappedLinearLayoutManager, this.A09, this.A00, this.A0T, c461825l, new ViewOnClickEBaseShape5S0100000_I0_5(this, 32));
            this.A02.setLayoutManager(wrappedLinearLayoutManager);
            RecyclerView recyclerView = this.A02;
            C0TR c0tr = recyclerView.A0R;
            if (c0tr instanceof C0TQ) {
                ((C0TQ) c0tr).A00 = false;
            }
            recyclerView.setAdapter(this.A0L);
            int max = Math.max(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.storage_preview_item_thumb_size);
            this.A01 = Math.max(1, ((dimensionPixelSize >> 1) + max) / dimensionPixelSize);
            this.A0N = new C25O(this.A0D, this.A0F, this.A0O, this.A0G, this.A0E, this.A0M);
            this.A0P.AS1(new RunnableEBaseShape7S0100000_I0_7(this, 4));
            A1Q(0);
            A1Q(2);
            A1Q(1);
            if (bundle != null && bundle.getParcelableArrayList("LIST_OF_CONTACTS") != null) {
                if (System.currentTimeMillis() - bundle.getLong("SAVED_AT_TIMESTAMP") < A0Y) {
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("LIST_OF_CONTACTS");
                    this.A0U = parcelableArrayList;
                    C54022hv c54022hv = this.A0L;
                    String str = this.A0S;
                    List list2 = this.A0V;
                    c54022hv.A05 = parcelableArrayList;
                    c54022hv.A04 = str;
                    c54022hv.A06 = list2;
                    c54022hv.A07 = true;
                    if (0 != 0) {
                        for (Number number : list) {
                            c54022hv.A03(c54022hv.A0G() + number.intValue());
                        }
                    } else {
                        ((AbstractC04890Mh) c54022hv).A01.A00();
                    }
                    if (bundle.getBoolean("LIST_IS_NOT_FULL", false)) {
                        A1P();
                    }
                } else {
                    A1P();
                }
            } else {
                A1P();
            }
            C25Q c25q = this.A0I;
            c25q.A07.add(this.A0H);
            String str2 = this.A0T;
            int i = this.A00;
            AnonymousClass012 anonymousClass012 = this.A0C;
            this.A0P.AS1(new C3SV(str2, i, this.A03, anonymousClass012, this.A0Q, this.A0J));
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A02 = null;
        this.A09.A00();
        C25Q c25q = this.A0I;
        c25q.A07.remove(this.A0H);
        this.A0X.clear();
        RunnableEBaseShape4S0200000_I0_4 runnableEBaseShape4S0200000_I0_4 = this.A0R;
        if (runnableEBaseShape4S0200000_I0_4 != null) {
            ((AtomicBoolean) runnableEBaseShape4S0200000_I0_4.A00).set(true);
        }
        this.A0L.A0N(false);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ArrayList arrayList = this.A0U;
        if (arrayList != null && !arrayList.isEmpty()) {
            bundle.putLong("SAVED_AT_TIMESTAMP", System.currentTimeMillis());
            ArrayList<? extends Parcelable> arrayList2 = this.A0U;
            if (arrayList2.size() <= 200) {
                bundle.putParcelableArrayList("LIST_OF_CONTACTS", arrayList2);
                return;
            }
            bundle.putParcelableArrayList("LIST_OF_CONTACTS", new ArrayList<>(arrayList2.subList(0, 200)));
            bundle.putBoolean("LIST_IS_NOT_FULL", true);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        C07630Zb c07630Zb;
        if (!this.A06.A0E(C01C.A2D) || (c07630Zb = this.A05) == null) {
            return false;
        }
        c07630Zb.A01();
        this.A0L.A0M(true);
        this.A05.A03.findViewById(R.id.search_back).setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 31));
        return false;
    }

    /* loaded from: classes2.dex */
    public class WrappedLinearLayoutManager extends LinearLayoutManager {
        public WrappedLinearLayoutManager() {
            super(1);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0SV
        public void A0z(C15230oI c15230oI, C0Y0 c0y0) {
            try {
                super.A0z(c15230oI, c0y0);
            } catch (IndexOutOfBoundsException e) {
                Log.e("WrappedLinearLayoutManager", e);
            }
        }
    }
}
