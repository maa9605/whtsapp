package com.whatsapp.status.playback;

import X.AbstractC005302j;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.AnonymousClass011;
import X.AnonymousClass012;
import X.AnonymousClass092;
import X.AnonymousClass094;
import X.C000200d;
import X.C000400f;
import X.C000500h;
import X.C002301c;
import X.C003101m;
import X.C00A;
import X.C00T;
import X.C018508q;
import X.C018608r;
import X.C018708s;
import X.C01B;
import X.C01C;
import X.C02160Ac;
import X.C02620Cd;
import X.C02980Dr;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C02O;
import X.C03010Du;
import X.C04580Kz;
import X.C05W;
import X.C0C8;
import X.C0C9;
import X.C0CA;
import X.C0EB;
import X.C0ED;
import X.C0ES;
import X.C0HS;
import X.C0LD;
import X.C0O8;
import X.C0U0;
import X.C0U1;
import X.C0We;
import X.C11300hW;
import X.C22X;
import X.C2AR;
import X.C2AT;
import X.C2DC;
import X.C2DD;
import X.C2EQ;
import X.C2M4;
import X.C2MG;
import X.C2MN;
import X.C2Q0;
import X.C40731sm;
import X.C41541u6;
import X.C41771uU;
import X.C42451vl;
import X.C42471vn;
import X.C42761wH;
import X.C43081wp;
import X.C47252Am;
import X.C48242Em;
import X.C50262Ra;
import X.C53052bo;
import X.C53952hn;
import X.C54782jL;
import X.C81983pm;
import X.C86393xN;
import X.InterfaceC002901k;
import X.InterfaceC05620Pl;
import X.InterfaceC05880Qp;
import X.InterfaceC53402gr;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.camera.CameraActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.status.StatusExpirationLifecycleOwner;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0_2;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class MyStatusesActivity extends C2Q0 {
    public C0O8 A00;
    public C0U0 A01;
    public C11300hW A02;
    public C02L A03;
    public C03010Du A04;
    public C01B A05;
    public C018608r A06;
    public C41541u6 A07;
    public C05W A08;
    public C018708s A09;
    public C000400f A0A;
    public C02E A0B;
    public AnonymousClass012 A0C;
    public C02F A0D;
    public C002301c A0E;
    public C0C9 A0F;
    public C0C8 A0G;
    public C00A A0H;
    public C42761wH A0I;
    public C43081wp A0J;
    public C22X A0K;
    public C0EB A0L;
    public C0ED A0M;
    public AnonymousClass011 A0N;
    public C0ES A0O;
    public C41771uU A0P;
    public C42451vl A0Q;
    public C02980Dr A0R;
    public C02O A0S;
    public AnonymousClass092 A0T;
    public C2MN A0U;
    public C2AR A0V;
    public C2M4 A0W;
    public C2AT A0X;
    public C2MG A0Y;
    public StatusExpirationLifecycleOwner A0Z;
    public C2EQ A0a;
    public C2DD A0b;
    public C47252Am A0c;
    public C2DC A0d;
    public C81983pm A0e;
    public C53952hn A0f;
    public C53052bo A0g;
    public C42471vn A0h;
    public InterfaceC002901k A0i;
    public List A0j;
    public boolean A0k;
    public final Handler A0l;
    public final View.OnClickListener A0m;
    public final View.OnClickListener A0n;
    public final InterfaceC05880Qp A0o;
    public final C00T A0p;
    public final Runnable A0q;
    public final Runnable A0r;
    public final HashMap A0s;
    public final HashMap A0t;
    public final Map A0u = new LinkedHashMap();
    public final Set A0v;

    public MyStatusesActivity() {
        HashSet hashSet = new HashSet();
        this.A0v = hashSet;
        this.A0q = new RunnableEBaseShape6S0100000_I0_6(hashSet, 33);
        this.A0l = new Handler(Looper.getMainLooper());
        this.A0s = new HashMap();
        this.A0t = new HashMap();
        this.A0p = new C00T() { // from class: X.3pk
            {
                MyStatusesActivity.this = this;
            }

            @Override // X.C00T
            public void A01(AnonymousClass092 anonymousClass092) {
                if (anonymousClass092 != null) {
                    AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                    if (C003101m.A0Z(anonymousClass094.A00) && anonymousClass094.A02) {
                        MyStatusesActivity.A00(MyStatusesActivity.this, anonymousClass092, true);
                    }
                }
            }

            @Override // X.C00T
            public void A08(AnonymousClass092 anonymousClass092, int i) {
                if (anonymousClass092 != null) {
                    AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                    if (C003101m.A0Z(anonymousClass094.A00) && anonymousClass094.A02) {
                        if (C0D6.A00(anonymousClass092.A08, 4) > 0) {
                            MyStatusesActivity.A00(MyStatusesActivity.this, anonymousClass092, true);
                        } else {
                            MyStatusesActivity.this.A0f.notifyDataSetChanged();
                        }
                    }
                }
            }

            @Override // X.C00T
            public void A0B(Collection collection, Map map, Map map2) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    AnonymousClass094 anonymousClass094 = ((AnonymousClass092) it.next()).A0n;
                    if (C003101m.A0Z(anonymousClass094.A00) && anonymousClass094.A02) {
                        MyStatusesActivity myStatusesActivity = MyStatusesActivity.this;
                        C81983pm c81983pm = myStatusesActivity.A0e;
                        if (c81983pm != null) {
                            c81983pm.A05(true);
                        }
                        C81983pm c81983pm2 = new C81983pm(myStatusesActivity);
                        myStatusesActivity.A0e = c81983pm2;
                        myStatusesActivity.A0i.ARy(c81983pm2, new Void[0]);
                        return;
                    }
                }
            }

            @Override // X.C00T
            public void A0C(AnonymousClass092 anonymousClass092, int i) {
                AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                if (C003101m.A0Z(anonymousClass094.A00) && anonymousClass094.A02) {
                    MyStatusesActivity myStatusesActivity = MyStatusesActivity.this;
                    C81983pm c81983pm = myStatusesActivity.A0e;
                    if (c81983pm != null) {
                        c81983pm.A05(true);
                    }
                    C81983pm c81983pm2 = new C81983pm(myStatusesActivity);
                    myStatusesActivity.A0e = c81983pm2;
                    myStatusesActivity.A0i.ARy(c81983pm2, new Void[0]);
                }
            }
        };
        this.A0r = new RunnableEBaseShape6S0100000_I0_6(this, 32);
        this.A0j = new ArrayList();
        this.A0o = new InterfaceC05880Qp() { // from class: X.3pl
            {
                MyStatusesActivity.this = this;
            }

            @Override // X.InterfaceC05880Qp
            public void ANZ(String str) {
                MyStatusesActivity myStatusesActivity = MyStatusesActivity.this;
                boolean A01 = C000400f.A01();
                int i = R.string.record_need_sd_card_title_shared_storage;
                if (A01) {
                    i = R.string.record_need_sd_card_title;
                }
                boolean A012 = C000400f.A01();
                int i2 = R.string.record_need_sd_card_message_shared_storage;
                if (A012) {
                    i2 = R.string.record_need_sd_card_message;
                }
                myStatusesActivity.AUl(i, i2, new Object[0]);
            }

            @Override // X.InterfaceC05880Qp
            public void ANa() {
                MyStatusesActivity.this.AUl(R.string.alert, R.string.permission_storage_need_access, new Object[0]);
            }

            @Override // X.InterfaceC05880Qp
            public void AQ0(String str) {
                MyStatusesActivity myStatusesActivity = MyStatusesActivity.this;
                boolean A01 = C000400f.A01();
                int i = R.string.record_need_sd_card_title_shared_storage;
                if (A01) {
                    i = R.string.record_need_sd_card_title;
                }
                boolean A012 = C000400f.A01();
                int i2 = R.string.record_need_sd_card_message_shared_storage;
                if (A012) {
                    i2 = R.string.record_need_sd_card_message;
                }
                myStatusesActivity.AUl(i, i2, new Object[0]);
            }

            @Override // X.InterfaceC05880Qp
            public void AQ1() {
                MyStatusesActivity.this.AUl(R.string.alert, R.string.permission_storage_need_access, new Object[0]);
            }
        };
        this.A0n = new ViewOnClickCListenerShape10S0100000_I0_2(this, 45);
        this.A0m = new ViewOnClickCListenerShape10S0100000_I0_2(this, 46);
    }

    public static void A00(MyStatusesActivity myStatusesActivity, AnonymousClass092 anonymousClass092, boolean z) {
        HashMap hashMap = myStatusesActivity.A0t;
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        C0HS c0hs = (C0HS) hashMap.remove(anonymousClass094);
        if (c0hs != null) {
            if (!z) {
                return;
            }
            c0hs.A05(true);
        }
        C0HS c0hs2 = new C0HS(anonymousClass092) { // from class: X.3pn
            public final AnonymousClass092 A00;

            {
                MyStatusesActivity.this = myStatusesActivity;
                this.A00 = anonymousClass092;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                Iterator it = MyStatusesActivity.this.A0I.A02(this.A00).A00.values().iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (((C42811wM) it.next()).A01(13) > 0) {
                        i++;
                    }
                }
                return Integer.valueOf(i);
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                MyStatusesActivity myStatusesActivity2 = MyStatusesActivity.this;
                HashMap hashMap2 = myStatusesActivity2.A0s;
                AnonymousClass094 anonymousClass0942 = this.A00.A0n;
                hashMap2.put(anonymousClass0942, obj);
                myStatusesActivity2.A0t.remove(anonymousClass0942);
                myStatusesActivity2.A0f.notifyDataSetChanged();
            }
        };
        hashMap.put(anonymousClass094, c0hs2);
        myStatusesActivity.A0i.ARy(c0hs2, new Void[0]);
    }

    public final void A1R() {
        for (Uri uri : this.A0j) {
            revokeUriPermission(uri, 1);
        }
        this.A0j.clear();
    }

    public final void A1S() {
        if (RequestPermissionActivity.A0N(this, this.A0D, 33) && this.A0A.A0A(this.A0o)) {
            if (this.A0A.A02() < ((this.A05.A07(C01C.A3Y) << 10) << 10)) {
                C40731sm.A0c(this.A0N, this, this, 5);
                return;
            }
            Intent intent = new Intent(this, CameraActivity.class);
            intent.putExtra("jid", C04580Kz.A00.getRawString());
            intent.putExtra("origin", 4);
            startActivity(intent);
        }
    }

    public final void A1T() {
        C018508q c018508q = ((ActivityC02290Ap) this).A0A;
        Runnable runnable = this.A0r;
        c018508q.A02.removeCallbacks(runnable);
        if (this.A0f.isEmpty()) {
            return;
        }
        C53952hn c53952hn = this.A0f;
        ((ActivityC02290Ap) this).A0A.A02.postDelayed(runnable, (C02620Cd.A01(c53952hn.A00.isEmpty() ? 0L : ((AnonymousClass092) c53952hn.A00.get(0)).A0E) - System.currentTimeMillis()) + 1000);
    }

    public void A1U(AnonymousClass092 anonymousClass092, View view) {
        Map map = this.A0u;
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        if (map.containsKey(anonymousClass094)) {
            map.remove(anonymousClass094);
            view.setBackgroundResource(0);
        } else {
            map.put(anonymousClass094, anonymousClass092);
            view.setBackgroundResource(R.color.home_row_selection);
        }
        if (map.isEmpty()) {
            C0U0 c0u0 = this.A01;
            if (c0u0 != null) {
                c0u0.A05();
            }
        } else {
            C0U0 c0u02 = this.A01;
            if (c0u02 == null) {
                c0u02 = A0e(this.A00);
                this.A01 = c0u02;
            }
            c0u02.A0B(this.A0E.A0G().format(map.size()));
            this.A01.A06();
        }
        this.A0v.add(anonymousClass094);
        Handler handler = this.A0l;
        Runnable runnable = this.A0q;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 200L);
        this.A0f.notifyDataSetChanged();
    }

    public final void A1V(List list, boolean z) {
        boolean A02;
        C48242Em c48242Em;
        this.A0k = z;
        if (z) {
            C2DC c2dc = this.A0d;
            A02 = c2dc.A02(list, this, null, c2dc.A02);
        } else {
            C2DC c2dc2 = this.A0d;
            A02 = c2dc2.A02(list, this, null, c2dc2.A03);
        }
        if (!A02 && !this.A0d.A00.A06() && (c48242Em = this.A0a.A00) != null) {
            c48242Em.A01 = 4;
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.AnonymousClass091
    public void APM(C0U0 c0u0) {
        super.APM(c0u0);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C02160Ac.A00(this, R.color.primary_dark));
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.AnonymousClass091
    public void APN(C0U0 c0u0) {
        super.APN(c0u0);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C02160Ac.A00(this, R.color.action_mode_dark));
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        C0U0 c0u0;
        C48242Em c48242Em;
        super.onActivityResult(i, i2, intent);
        if (i == 2) {
            if (i2 != -1) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Map map = this.A0u;
            if (!map.isEmpty()) {
                arrayList.addAll(map.values());
            } else {
                AnonymousClass092 anonymousClass092 = this.A0T;
                if (anonymousClass092 != null) {
                    arrayList.add(anonymousClass092);
                }
            }
            if (!arrayList.isEmpty()) {
                List A0F = C003101m.A0F(AbstractC005302j.class, intent.getStringArrayListExtra("jids"));
                Iterator it = C0CA.A01(arrayList).iterator();
                while (it.hasNext()) {
                    this.A06.A0E(this.A04, (AnonymousClass092) it.next(), A0F);
                }
                AbstractList abstractList = (AbstractList) A0F;
                if (abstractList.size() == 1 && !C003101m.A0Z((Jid) abstractList.get(0))) {
                    ((ActivityC02270An) this).A00.A07(this, Conversation.A00(this, this.A08.A0A((AbstractC005302j) abstractList.get(0))));
                } else {
                    A1L(A0F);
                }
            } else {
                Log.w("mystatuses/forward/failed");
                ((ActivityC02290Ap) this).A0A.A07(R.string.message_forward_failed, 0);
            }
            C0U0 c0u02 = this.A01;
            if (c0u02 == null) {
                return;
            }
            c0u02.A05();
        } else if (i == 33) {
            if (i2 != -1) {
                return;
            }
            A1S();
        } else if (i != 35) {
            if (i == 151) {
                if (i2 == -1) {
                    Map map2 = this.A0u;
                    if (!map2.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(map2.values());
                        map2.clear();
                        A1V(arrayList2, this.A0k);
                    }
                } else if (i2 != 0 || (c48242Em = this.A0a.A00) == null) {
                } else {
                    c48242Em.A01 = 4;
                }
            }
        } else {
            if (i2 == -1 && (c0u0 = this.A01) != null) {
                c0u0.A05();
            }
            if (!this.A0k) {
                return;
            }
            C2DC c2dc = this.A0d;
            if (intent == null) {
                return;
            }
            C000500h c000500h = c2dc.A01;
            boolean z = c000500h.A00.getBoolean("is_status_sharing_with_fb_disabled", false);
            boolean booleanExtra = intent.getBooleanExtra("feature_disabled", z);
            if (booleanExtra == z) {
                return;
            }
            C000200d.A0j(c000500h, "is_status_sharing_with_fb_disabled", booleanExtra);
        }
    }

    @Override // X.C2Q0, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        Log.i("myStatusesActivity/onCreate");
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        super.onCreate(bundle);
        setTitle(R.string.my_status);
        A0z();
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            setContentView(R.layout.my_statuses);
            findViewById(R.id.root_view).setSystemUiVisibility(1280);
            ((ActivityC02290Ap) this).A06.setFitsSystemWindows(true);
            this.A0Z = new StatusExpirationLifecycleOwner(this, ((ActivityC02290Ap) this).A0A, this.A0i, this.A0L, this.A0K);
            this.A0b = new C2DD(this.A0c, this.A0a, 1, false);
            this.A00 = new C86393xN(this, this, ((ActivityC02290Ap) this).A0A, this.A0R, this.A0W, this.A03, this.A0i, this.A0Y, this.A0N, this.A05, this.A07, this.A06, this.A0U, ((ActivityC02270An) this).A00, this.A08, this.A0M, this.A0B, this.A09, this.A0E, this.A0O, this.A0V, this.A0X, this.A0J, this.A0Q, this.A0P, this.A0G, this.A0S);
            this.A0g = new C53052bo(this);
            this.A0f = new C53952hn(this);
            ListView A1P = A1P();
            A1P.setDivider(new C0We(this.A0E, C02160Ac.A03(this, R.drawable.conversations_list_divider)));
            A1P.setFastScrollEnabled(false);
            View inflate = getLayoutInflater().inflate(R.layout.conversations_tip_row, (ViewGroup) A1P, false);
            inflate.setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.conversations_row_height));
            A1P.addFooterView(inflate, null, false);
            ((TextView) inflate.findViewById(R.id.conversations_row_tip_tv)).setText(getString(R.string.status_expire_explanation_with_placeholder, 24));
            A1P.setAdapter((ListAdapter) this.A0f);
            A1P.setOnItemClickListener(new C54782jL(this));
            A1P.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: X.3XG
                {
                    MyStatusesActivity.this = this;
                }

                @Override // android.widget.AdapterView.OnItemLongClickListener
                public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
                    MyStatusesActivity myStatusesActivity = MyStatusesActivity.this;
                    if (i < myStatusesActivity.A0f.getCount()) {
                        myStatusesActivity.A1U((AnonymousClass092) myStatusesActivity.A0f.A00.get(i), view);
                        return true;
                    }
                    return false;
                }
            });
            TextView textView = (TextView) findViewById(16908292);
            textView.setText(C50262Ra.A00(getString(R.string.welcome_statuses_message), C02160Ac.A03(this, R.drawable.ic_new_status_tip), textView.getPaint()));
            findViewById(R.id.fab).setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 43));
            findViewById(R.id.fab_aux).setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 44));
            View findViewById = findViewById(R.id.progress);
            if (findViewById != null) {
                findViewById.setVisibility(0);
                C81983pm c81983pm = this.A0e;
                if (c81983pm != null) {
                    c81983pm.A05(true);
                }
                C81983pm c81983pm2 = new C81983pm(this);
                this.A0e = c81983pm2;
                this.A0i.ARy(c81983pm2, new Void[0]);
                this.A0H.A01(this.A0p);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i != 13) {
            return super.onCreateDialog(i);
        }
        Map map = this.A0u;
        if (map.isEmpty()) {
            Log.e("mediagallery/dialog/delete no messages");
            return super.onCreateDialog(i);
        }
        StringBuilder A0P = C000200d.A0P("mediagallery/dialog/delete/");
        A0P.append(map.size());
        Log.i(A0P.toString());
        return C40731sm.A07(this, ((ActivityC02290Ap) this).A0A, ((ActivityC02290Ap) this).A0H, this.A06, this.A0E, new HashSet(map.values()), new InterfaceC53402gr() { // from class: X.3pb
            {
                MyStatusesActivity.this = this;
            }

            @Override // X.InterfaceC53402gr
            public final void AJE() {
                MyStatusesActivity myStatusesActivity = MyStatusesActivity.this;
                myStatusesActivity.A0u.clear();
                C0U0 c0u0 = myStatusesActivity.A01;
                if (c0u0 != null) {
                    c0u0.A05();
                }
            }
        });
    }

    @Override // X.ActivityC02250Al, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        Log.i("myStatusesActivity/onDestroy");
        super.onDestroy();
        this.A0H.A00(this.A0p);
        C81983pm c81983pm = this.A0e;
        if (c81983pm != null) {
            c81983pm.A05(true);
        }
        HashMap hashMap = this.A0t;
        for (C0HS c0hs : hashMap.values()) {
            c0hs.A05(true);
        }
        A1R();
        hashMap.clear();
        C018508q c018508q = ((ActivityC02290Ap) this).A0A;
        c018508q.A02.removeCallbacks(this.A0r);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        Log.i("myStatusesActivity/onPause");
        this.A0d.A04.A04(this);
        super.onPause();
    }

    @Override // X.ActivityC02250Al, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            List<AnonymousClass094> A04 = C0LD.A04(bundle);
            if (A04 != null) {
                Map map = this.A0u;
                map.clear();
                for (AnonymousClass094 anonymousClass094 : A04) {
                    map.put(anonymousClass094, this.A0F.A0F(anonymousClass094));
                }
                C0U0 c0u0 = this.A01;
                if (c0u0 == null) {
                    c0u0 = A0e(this.A00);
                    this.A01 = c0u0;
                }
                c0u0.A0B(this.A0E.A0G().format(map.size()));
                this.A01.A06();
                this.A0f.notifyDataSetChanged();
            }
            AnonymousClass094 A03 = C0LD.A03(bundle, "");
            if (A03 != null) {
                this.A0T = this.A0F.A0H.A05(A03);
            }
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        Log.i("myStatusesActivity/onResume");
        super.onResume();
        this.A0d.A04.A05(this, new InterfaceC05620Pl() { // from class: X.3pS
            {
                MyStatusesActivity.this = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:44:0x0032, code lost:
                if (r2 != 2) goto L26;
             */
            /* JADX WARN: Removed duplicated region for block: B:51:0x003f  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0043  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0057  */
            @Override // X.InterfaceC05620Pl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void AIK(java.lang.Object r7) {
                /*
                    r6 = this;
                    com.whatsapp.status.playback.MyStatusesActivity r5 = com.whatsapp.status.playback.MyStatusesActivity.this
                    X.2DM r7 = (X.C2DM) r7
                    java.lang.String r0 = "myStatuessActivity/onStatusSharingInfoChanged"
                    com.whatsapp.util.Log.i(r0)
                    r3 = 1
                    r4 = 2
                    if (r7 == 0) goto L37
                    android.content.Intent r0 = r7.A01
                    if (r0 == 0) goto L2d
                    r5.A1R()
                    java.util.List r1 = r5.A0j
                    java.util.List r0 = r7.A02
                    r1.addAll(r0)
                    boolean r0 = r5.A0k
                    if (r0 != 0) goto L20
                    r3 = 2
                L20:
                    X.2DD r0 = r5.A0b
                    r0.A01(r3)
                    android.content.Intent r1 = r7.A01
                    r0 = 35
                    r5.startActivityForResult(r1, r0)
                    return
                L2d:
                    int r2 = r7.A00
                    if (r2 == r3) goto L35
                    r1 = 2
                    if (r2 == r4) goto L39
                    goto L38
                L35:
                    r1 = 3
                    goto L39
                L37:
                    r2 = 0
                L38:
                    r1 = 5
                L39:
                    X.2EQ r0 = r5.A0a
                    X.2Em r0 = r0.A00
                    if (r0 == 0) goto L41
                    r0.A01 = r1
                L41:
                    if (r2 == r3) goto L57
                    if (r2 == r4) goto L4e
                    X.08q r1 = r5.A0A
                    r0 = 2131889837(0x7f120ead, float:1.9414349E38)
                    r1.A07(r0, r3)
                    return
                L4e:
                    X.08q r1 = r5.A0A
                    r0 = 2131889839(0x7f120eaf, float:1.9414353E38)
                    r1.A05(r0, r3)
                    return
                L57:
                    X.08q r1 = r5.A0A
                    r0 = 2131889838(0x7f120eae, float:1.941435E38)
                    r1.A05(r0, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C81783pS.AIK(java.lang.Object):void");
            }
        });
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Map map = this.A0u;
        if (!map.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (AnonymousClass092 anonymousClass092 : map.values()) {
                arrayList.add(anonymousClass092.A0n);
            }
            C0LD.A08(bundle, arrayList);
        }
        AnonymousClass092 anonymousClass0922 = this.A0T;
        if (anonymousClass0922 != null) {
            C0LD.A07(bundle, anonymousClass0922.A0n, "");
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        Log.i("myStatusesActivity/onStart");
        super.onStart();
        A1T();
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        Log.i("myStatusesActivity/onStop");
        super.onStop();
    }
}
