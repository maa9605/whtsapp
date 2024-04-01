package com.whatsapp.voipcalling;

import X.AbstractC005302j;
import X.AbstractC02800Cx;
import X.AbstractC53222c9;
import X.ActivityC02320As;
import X.ActivityC02330At;
import X.AnonymousClass008;
import X.AnonymousClass012;
import X.AnonymousClass029;
import X.AnonymousClass088;
import X.AnonymousClass261;
import X.C000700j;
import X.C002301c;
import X.C003101m;
import X.C003701t;
import X.C018308n;
import X.C018508q;
import X.C018708s;
import X.C019208x;
import X.C01B;
import X.C02160Ac;
import X.C02180Ae;
import X.C02620Cd;
import X.C02E;
import X.C02F;
import X.C03080Ec;
import X.C03320Ff;
import X.C03360Fk;
import X.C05480Ox;
import X.C05490Oy;
import X.C05W;
import X.C06950Vu;
import X.C06C;
import X.C07610Yz;
import X.C07950aM;
import X.C0AT;
import X.C0C8;
import X.C0D3;
import X.C0D4;
import X.C0GA;
import X.C0GC;
import X.C0GE;
import X.C0HS;
import X.C0HY;
import X.C0L5;
import X.C0L6;
import X.C0MC;
import X.C0MJ;
import X.C0MK;
import X.C0O8;
import X.C0U0;
import X.C0W5;
import X.C0Zn;
import X.C2AR;
import X.C2IY;
import X.C2c5;
import X.C2c6;
import X.C50262Ra;
import X.C53202c3;
import X.C53242cB;
import X.C53252cC;
import X.C53262cD;
import X.C53272cE;
import X.InterfaceC002901k;
import X.InterfaceC04900Mj;
import X.InterfaceC09350d7;
import X.InterfaceC53232cA;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.ListFragment;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I0_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.ContactPicker;
import com.whatsapp.Conversation;
import com.whatsapp.EmptyTellAFriendView;
import com.whatsapp.HomeActivity;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.base.WaListFragment;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I0_3;
import com.whatsapp.voipcalling.CallsFragment;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class CallsFragment extends Hilt_CallsFragment implements C0MJ, C0MK, InterfaceC04900Mj {
    public MenuItem A00;
    public C0U0 A01;
    public C018308n A02;
    public C018508q A03;
    public C06950Vu A04;
    public C01B A05;
    public C0W5 A06;
    public C03320Ff A07;
    public C05W A08;
    public AnonymousClass008 A09;
    public C018708s A0A;
    public C0Zn A0B;
    public C0Zn A0C;
    public C0L5 A0D;
    public C02E A0E;
    public AnonymousClass012 A0F;
    public C02F A0G;
    public C002301c A0H;
    public C0HY A0I;
    public C0C8 A0J;
    public C003701t A0K;
    public C03360Fk A0L;
    public C2AR A0M;
    public InterfaceC002901k A0N;
    public C0MC A0O;
    public C05480Ox A0P;
    public AnonymousClass261 A0Q;
    public C53262cD A0R;
    public C2IY A0S;
    public C0L6 A0T;
    public CharSequence A0U;
    public ArrayList A0V;
    public boolean A0Z;
    public LinkedHashMap A0X = new LinkedHashMap();
    public ArrayList A0W = new ArrayList();
    public boolean A0Y = true;
    public final C0GA A0c = new C0GA() { // from class: X.2bx
        {
            CallsFragment.this = this;
        }

        @Override // X.C0GA
        public void A00() {
            CallsFragment callsFragment = CallsFragment.this;
            C53282cF.A00((C53282cF) callsFragment.A0Q.getFilter());
            callsFragment.A0Q.getFilter().filter(callsFragment.A0U);
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            CallsFragment.this.A0Q.notifyDataSetChanged();
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            CallsFragment.this.A0Q.notifyDataSetChanged();
        }
    };
    public final C0GC A0b = new C0GC() { // from class: X.2by
        {
            CallsFragment.this = this;
        }

        @Override // X.C0GC
        public void A00(AbstractC005302j abstractC005302j) {
            CallsFragment callsFragment = CallsFragment.this;
            C53282cF.A00((C53282cF) callsFragment.A0Q.getFilter());
            callsFragment.A0Q.getFilter().filter(callsFragment.A0U);
        }
    };
    public final C0GE A0d = new C0GE() { // from class: X.2bz
        {
            CallsFragment.this = this;
        }

        @Override // X.C0GE
        public void A00(Set set) {
            CallsFragment callsFragment = CallsFragment.this;
            C53282cF.A00((C53282cF) callsFragment.A0Q.getFilter());
            callsFragment.A0Q.getFilter().filter(callsFragment.A0U);
        }
    };
    public final InterfaceC09350d7 A0e = new InterfaceC09350d7() { // from class: X.2c0
        {
            CallsFragment.this = this;
        }

        @Override // X.InterfaceC09350d7
        public void AI5() {
            Log.i("voip/CallsFragment/onCallLogDeleted");
            CallsFragment.this.A12();
        }

        @Override // X.InterfaceC09350d7
        public void AI6(C0D3 c0d3) {
            Log.i("CallsFragment/onCallLogUpdated");
            CallsFragment.this.A12();
        }
    };
    public final C05490Oy A0f = new C05490Oy() { // from class: X.2c1
        {
            CallsFragment.this = this;
        }

        @Override // X.C05490Oy
        public void A03(C0D3 c0d3) {
            Log.i("voip/CallsFragment/onCallEnded");
            if (c0d3.A0F()) {
                return;
            }
            CallsFragment.this.A12();
        }

        @Override // X.C05490Oy
        public void A05(C0D3 c0d3, boolean z) {
            Log.i("voip/CallsFragment/onCallMissed");
            CallsFragment.this.A12();
        }
    };
    public final Runnable A0g = new RunnableEBaseShape7S0100000_I0_7(this, 36);
    public final HashSet A0h = new HashSet();
    public final Set A0i = new HashSet();
    public final C0O8 A0a = new C0O8() { // from class: X.2c2
        {
            CallsFragment.this = this;
        }

        @Override // X.C0O8
        public boolean AGv(C0U0 c0u0, MenuItem menuItem) {
            C53202c3 c53202c3;
            if (menuItem.getItemId() == R.id.menuitem_calls_delete) {
                ArrayList arrayList = new ArrayList();
                CallsFragment callsFragment = CallsFragment.this;
                Iterator it = callsFragment.A0h.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!TextUtils.isEmpty(str)) {
                        LinkedHashMap linkedHashMap = callsFragment.A0X;
                        if (!linkedHashMap.isEmpty() && linkedHashMap.containsKey(str) && (c53202c3 = (C53202c3) callsFragment.A0X.get(str)) != null) {
                            arrayList.addAll(c53202c3.A03);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    callsFragment.A0I.A0A(arrayList);
                }
                callsFragment.A11();
                C0U0 c0u02 = callsFragment.A01;
                if (c0u02 != null) {
                    c0u02.A05();
                    return true;
                }
                return true;
            }
            return false;
        }

        @Override // X.C0O8
        public boolean AJ5(C0U0 c0u0, Menu menu) {
            menu.add(0, R.id.menuitem_calls_delete, 0, R.string.clear_single_log).setIcon(R.drawable.ic_action_delete).setShowAsAction(2);
            return true;
        }

        @Override // X.C0O8
        public void AJK(C0U0 c0u0) {
            CallsFragment callsFragment = CallsFragment.this;
            callsFragment.A11();
            callsFragment.A01 = null;
        }

        @Override // X.C0O8
        public boolean ANE(C0U0 c0u0, Menu menu) {
            CallsFragment callsFragment = CallsFragment.this;
            if (!callsFragment.A0W()) {
                Log.i("calls/actionmode/fragment is not attached to activity.");
                return false;
            }
            HashSet hashSet = callsFragment.A0h;
            if (hashSet.isEmpty()) {
                c0u0.A05();
                return true;
            }
            c0u0.A0B(String.format(callsFragment.A0H.A0I(), "%d", Integer.valueOf(hashSet.size())));
            C018308n.A04(callsFragment.A09().findViewById(R.id.action_mode_bar), callsFragment.A09().getWindowManager());
            return true;
        }
    };

    @Override // X.C0MK
    public void ASF(C06C c06c) {
    }

    @Override // X.C0MK
    public void ATp(boolean z) {
    }

    @Override // X.C0MK
    public void ATq(boolean z) {
    }

    @Override // X.C0MK
    public boolean AVJ() {
        return true;
    }

    public static String A00(Context context, List list, GroupJid groupJid, C05W c05w, C018708s c018708s, C0C8 c0c8) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3 && i < list.size(); i++) {
            arrayList.add(c018708s.A04(c05w.A0A((AbstractC005302j) list.get(i))));
        }
        String A0q = AnonymousClass029.A0q(groupJid, list, c05w, c0c8, c018708s);
        if (A0q != null) {
            return A0q;
        }
        if (list.size() > 3) {
            return context.getResources().getQuantityString(R.plurals.group_voip_call_participants_label, list.size() - 1, arrayList.get(0), Integer.valueOf(list.size() - 1));
        }
        if (arrayList.size() == 2) {
            return context.getString(R.string.voip_call_log_two_participants, arrayList.get(0), arrayList.get(1));
        }
        if (arrayList.size() == 3) {
            return context.getString(R.string.voip_call_log_three_participants, arrayList.get(0), arrayList.get(1), arrayList.get(2));
        }
        C000700j.A08(false, "Insufficient number of names for group call log");
        return null;
    }

    public static List A01(C53202c3 c53202c3, C05W c05w, C018708s c018708s, ArrayList arrayList, C01B c01b) {
        AbstractList abstractList;
        C0D3 c0d3 = (C0D3) c53202c3.A03.get(0);
        List A04 = c0d3.A04();
        C07950aM c07950aM = c0d3.A09;
        UserJid userJid = c07950aM.A01;
        int i = 0;
        while (true) {
            abstractList = (AbstractList) A04;
            if (i >= abstractList.size() || ((C0D4) abstractList.get(i)).A02.equals(userJid)) {
                break;
            }
            i++;
        }
        if (i != 0 && i < abstractList.size()) {
            Object obj = abstractList.get(i);
            abstractList.remove(i);
            abstractList.add(0, obj);
        }
        int i2 = !c07950aM.A03 ? 1 : 0;
        if (abstractList.size() > 0) {
            Collections.sort(abstractList.subList(i2, abstractList.size()), new C2c5(c01b, c05w, c018708s, arrayList) { // from class: X.2c4
                public final C018708s A00;
                public final ArrayList A01;

                {
                    this.A00 = c018708s;
                    this.A01 = arrayList;
                }

                @Override // X.C2c5
                public int A00(C0D4 c0d4, C0D4 c0d42) {
                    C05W c05w2 = super.A01;
                    C06C A0A = c05w2.A0A(c0d4.A02);
                    C06C A0A2 = c05w2.A0A(c0d42.A02);
                    C018708s c018708s2 = this.A00;
                    ArrayList arrayList2 = this.A01;
                    boolean A0G = c018708s2.A0G(A0A, arrayList2, true);
                    if (A0G != c018708s2.A0G(A0A2, arrayList2, true)) {
                        return A0G ? -1 : 1;
                    }
                    return super.compare(c0d4, c0d42);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < abstractList.size(); i3++) {
            arrayList2.add(((C0D4) abstractList.get(i3)).A02);
        }
        return arrayList2;
    }

    @Override // X.C0BA
    public void A0f() {
        Log.i("voip/CallsFragment/onPause");
        super.A0U = true;
    }

    @Override // X.C0BA
    public void A0g() {
        super.A0U = true;
        A15();
    }

    @Override // X.C0BA
    public void A0h(int i, int i2, Intent intent) {
        if (i != 10) {
            if (i == 150 && i2 == -1) {
                this.A0Z = true;
                A14();
            }
        } else if (i2 != -1) {
        } else {
            UserJid nullable = UserJid.getNullable(intent.getStringExtra("contact"));
            if (nullable != null) {
                int intExtra = intent.getIntExtra("call_type", 1);
                if (intExtra != 1 && intExtra != 2) {
                    return;
                }
                this.A0S.A00(this.A08.A0A(nullable), A0A(), 3, false, intExtra == 2);
                return;
            }
            throw null;
        }
    }

    @Override // X.C0BA
    public void A0j(Bundle bundle) {
        HashSet hashSet;
        Log.i("voip/CallsFragment/onActivityCreated");
        super.A0U = true;
        A0J();
        A0x();
        ListView listView = ((ListFragment) this).A04;
        listView.setFastScrollEnabled(false);
        listView.setScrollbarFadingEnabled(true);
        listView.setOnItemClickListener(new C2c6(this));
        A0x();
        ((ListFragment) this).A04.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: X.3bs
            {
                CallsFragment.this = this;
            }

            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
                CallsFragment callsFragment = CallsFragment.this;
                if (view.getTag() instanceof AbstractC53222c9) {
                    AbstractC53222c9 abstractC53222c9 = (AbstractC53222c9) view.getTag();
                    if (abstractC53222c9 != null) {
                        InterfaceC53232cA interfaceC53232cA = abstractC53222c9.A00;
                        if (interfaceC53232cA.AAh() == 2 && callsFragment.A0Y) {
                            if (TextUtils.isEmpty(((C53252cC) interfaceC53232cA).A00.A03())) {
                                C000200d.A0q("calls/longclick/empty callgroup id/pos ", i);
                                return false;
                            }
                            callsFragment.A16(((C53252cC) abstractC53222c9.A00).A00, (C53242cB) abstractC53222c9);
                            return true;
                        }
                    }
                    StringBuilder A0Q = C000200d.A0Q("calls/longclick position = ", i, " holder == null ? ");
                    A0Q.append(abstractC53222c9 == null);
                    A0Q.append(" searching = ");
                    C000200d.A1V(A0Q, !callsFragment.A0V.isEmpty());
                    return false;
                }
                return false;
            }
        });
        if (bundle != null && (hashSet = (HashSet) bundle.getSerializable("SelectedCallGroupIds")) != null) {
            HashSet hashSet2 = this.A0h;
            hashSet2.clear();
            hashSet2.addAll(hashSet);
            if (!hashSet2.isEmpty()) {
                this.A01 = ((ActivityC02320As) A09()).A0e(this.A0a);
            }
        }
        A05().findViewById(R.id.init_calls_progress).setVisibility(0);
        AnonymousClass261 anonymousClass261 = new AnonymousClass261(this);
        this.A0Q = anonymousClass261;
        A0y(anonymousClass261);
        this.A09.A01(this.A0c);
        this.A0O.A01(this.A0e);
        this.A07.A01(this.A0b);
        this.A0L.A01(this.A0d);
        this.A0P.A01(this.A0f);
        A12();
    }

    @Override // X.C0BA
    public void A0k(Bundle bundle) {
        bundle.putSerializable("SelectedCallGroupIds", this.A0h);
        bundle.putBoolean("request_sync", this.A0Z);
    }

    @Override // X.C0BA
    public void A0l(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.menuitem_clear_call_log);
        this.A00 = findItem;
        if (findItem != null) {
            findItem.setVisible(!this.A0X.isEmpty());
        }
    }

    @Override // X.C0BA
    public void A0m(Menu menu, MenuInflater menuInflater) {
        menu.add(3, R.id.menuitem_clear_call_log, 0, R.string.clear_call_log);
    }

    @Override // X.C0BA
    public boolean A0o(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_new_call) {
            ALg();
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_clear_call_log) {
            if (A0Y()) {
                new ClearCallLogDialogFragment().A14(super.A0H, null);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.calls, viewGroup, false);
        HomeActivity.A03(inflate, this, A01().getDimensionPixelSize(R.dimen.conversations_row_height));
        return inflate;
    }

    @Override // X.C0BA
    public void A0q() {
        Log.i("voip/CallsFragment/onDestroy");
        super.A0U = true;
        this.A09.A00(this.A0c);
        this.A0O.A00(this.A0e);
        this.A07.A00(this.A0b);
        this.A0L.A00(this.A0d);
        this.A0P.A00(this.A0f);
        this.A0C.A00();
        this.A0B.A00();
        C018508q c018508q = this.A03;
        c018508q.A02.removeCallbacks(this.A0g);
    }

    @Override // X.C0BA
    public void A0s() {
        Log.i("voip/CallsFragment/onResume");
        super.A0U = true;
        if (this.A0X.isEmpty()) {
            A13();
        }
    }

    @Override // X.C0BA
    public void A0v(Bundle bundle) {
        Log.i("voip/CallsFragment/onCreate");
        this.A0C = this.A0D.A04(((Hilt_CallsFragment) this).A00);
        this.A0B = this.A0D.A03(A01().getDimensionPixelSize(R.dimen.small_avatar_size), 0.0f);
        this.A0Z = bundle != null ? bundle.getBoolean("request_sync", false) : false;
        super.A0v(bundle);
    }

    public final void A11() {
        AbstractC53222c9 abstractC53222c9;
        HashSet hashSet = this.A0h;
        if (hashSet.isEmpty()) {
            return;
        }
        this.A0i.clear();
        int i = 0;
        while (true) {
            A0x();
            if (i < ((ListFragment) this).A04.getChildCount()) {
                A0x();
                View childAt = ((ListFragment) this).A04.getChildAt(i);
                if (childAt != null && (abstractC53222c9 = (AbstractC53222c9) childAt.getTag()) != null && abstractC53222c9.A00.AAh() == 2) {
                    C53242cB c53242cB = (C53242cB) abstractC53222c9;
                    if (hashSet.contains(((C53252cC) ((AbstractC53222c9) c53242cB).A00).A00.A03())) {
                        c53242cB.A01.setBackgroundResource(0);
                        c53242cB.A0B.A03(false, true);
                    }
                }
                i++;
            } else {
                hashSet.clear();
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.2cD, X.0HS] */
    public final void A12() {
        C53262cD c53262cD = this.A0R;
        if (c53262cD != null) {
            c53262cD.A05(true);
        }
        C0U0 c0u0 = this.A01;
        if (c0u0 != null) {
            c0u0.A06();
        }
        ?? r2 = new C0HS() { // from class: X.2cD
            {
                CallsFragment.this = this;
            }

            @Override // X.C0HS
            public void A03(Object[] objArr) {
                LinkedHashMap linkedHashMap = ((LinkedHashMap[]) objArr)[0];
                if (linkedHashMap != null) {
                    CallsFragment callsFragment = CallsFragment.this;
                    callsFragment.A0X = linkedHashMap;
                    callsFragment.A0Q.getFilter().filter(callsFragment.A0U);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:65:0x0053  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x0084  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x00d2  */
            @Override // X.C0HS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object A07(java.lang.Object[] r15) {
                /*
                    r14 = this;
                    X.2jW r4 = new X.2jW
                    r4.<init>()
                    com.whatsapp.voipcalling.CallsFragment r7 = com.whatsapp.voipcalling.CallsFragment.this
                    X.0HY r0 = r7.A0I
                    r8 = 0
                    r3 = 100
                    java.util.ArrayList r13 = r0.A05(r8, r3, r4)
                    boolean r0 = r14.A04()
                    r12 = 0
                    if (r0 != 0) goto Lda
                    java.lang.String r0 = "calls/RefreshCallsTask/doInBackground"
                    com.whatsapp.util.Log.i(r0)
                    java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
                    r6.<init>()
                    X.012 r2 = r7.A0F
                    X.05W r1 = r7.A08
                    X.08s r0 = r7.A0A
                    X.2c3 r5 = new X.2c3
                    r5.<init>(r2, r1, r0)
                    com.whatsapp.voipcalling.CallInfo r10 = com.whatsapp.voipcalling.Voip.getCallInfo()     // Catch: java.lang.UnsatisfiedLinkError -> L44
                    if (r10 == 0) goto L48
                    com.whatsapp.jid.UserJid r9 = r10.peerJid     // Catch: java.lang.UnsatisfiedLinkError -> L44
                    boolean r2 = r10.isCaller     // Catch: java.lang.UnsatisfiedLinkError -> L44
                    java.lang.String r0 = r10.callId     // Catch: java.lang.UnsatisfiedLinkError -> L44
                    java.lang.String r1 = X.AnonymousClass029.A0t(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L44
                    int r0 = r10.initialGroupTransactionId     // Catch: java.lang.UnsatisfiedLinkError -> L44
                    X.0aM r10 = new X.0aM     // Catch: java.lang.UnsatisfiedLinkError -> L44
                    r10.<init>(r9, r2, r1, r0)     // Catch: java.lang.UnsatisfiedLinkError -> L44
                    goto L49
                L44:
                    r0 = move-exception
                    com.whatsapp.util.Log.e(r0)
                L48:
                    r10 = r12
                L49:
                    java.util.Iterator r11 = r13.iterator()
                L4d:
                    boolean r0 = r11.hasNext()
                    if (r0 == 0) goto L7e
                    java.lang.Object r9 = r11.next()
                    X.0D3 r9 = (X.C0D3) r9
                    X.0aM r0 = r9.A09
                    boolean r0 = r0.equals(r10)
                    if (r0 == 0) goto L65
                    boolean r0 = r9.A0D
                    if (r0 == 0) goto L4d
                L65:
                    boolean r0 = r5.A06(r9)
                    if (r0 != 0) goto L4d
                    java.lang.String r0 = r5.A03()
                    r6.put(r0, r5)
                    X.012 r2 = r7.A0F
                    X.05W r1 = r7.A08
                    X.08s r0 = r7.A0A
                    X.2c3 r5 = new X.2c3
                    r5.<init>(r2, r1, r0, r9)
                    goto L4d
                L7e:
                    int r0 = r13.size()
                    if (r0 < r3) goto Lca
                    r0 = 1
                    java.util.LinkedHashMap[] r1 = new java.util.LinkedHashMap[r0]
                    java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                    r0.<init>(r6)
                    r1[r8] = r0
                    X.2C1 r0 = r14.A02
                    r0.A00(r1)
                    X.0HY r1 = r7.A0I
                    r0 = 1000(0x3e8, float:1.401E-42)
                    java.util.ArrayList r1 = r1.A05(r3, r0, r4)
                    boolean r0 = r14.A04()
                    if (r0 != 0) goto Lda
                    java.util.Iterator r4 = r1.iterator()
                La5:
                    boolean r0 = r4.hasNext()
                    if (r0 == 0) goto Lca
                    java.lang.Object r3 = r4.next()
                    X.0D3 r3 = (X.C0D3) r3
                    boolean r0 = r5.A06(r3)
                    if (r0 != 0) goto La5
                    java.lang.String r0 = r5.A03()
                    r6.put(r0, r5)
                    X.012 r2 = r7.A0F
                    X.05W r1 = r7.A08
                    X.08s r0 = r7.A0A
                    X.2c3 r5 = new X.2c3
                    r5.<init>(r2, r1, r0, r3)
                    goto La5
                Lca:
                    java.util.ArrayList r0 = r5.A03
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto Ld9
                    java.lang.String r0 = r5.A03()
                    r6.put(r0, r5)
                Ld9:
                    return r6
                Lda:
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C53262cD.A07(java.lang.Object[]):java.lang.Object");
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                CallsFragment callsFragment = CallsFragment.this;
                callsFragment.A0R = null;
                if (linkedHashMap != null) {
                    callsFragment.A0X = linkedHashMap;
                    callsFragment.A0Q.getFilter().filter(callsFragment.A0U);
                }
                MenuItem menuItem = callsFragment.A00;
                if (menuItem != null) {
                    menuItem.setVisible(!callsFragment.A0X.isEmpty());
                }
                callsFragment.A13();
                callsFragment.A15();
            }
        };
        this.A0R = r2;
        this.A0N.ARy(r2, new Void[0]);
    }

    public final void A13() {
        View view = super.A0A;
        if (view != null) {
            if (this.A0X.isEmpty()) {
                if (this.A0R != null) {
                    view.findViewById(R.id.init_calls_progress).setVisibility(0);
                    view.findViewById(R.id.search_no_matches).setVisibility(8);
                    view.findViewById(R.id.welcome_calls_message).setVisibility(8);
                    view.findViewById(R.id.calls_empty_no_contacts).setVisibility(8);
                    view.findViewById(R.id.contacts_empty_permission_denied).setVisibility(8);
                } else if (this.A08.A03() > 0) {
                    view.findViewById(R.id.init_calls_progress).setVisibility(8);
                    view.findViewById(R.id.search_no_matches).setVisibility(8);
                    view.findViewById(R.id.welcome_calls_message).setVisibility(0);
                    view.findViewById(R.id.calls_empty_no_contacts).setVisibility(8);
                    view.findViewById(R.id.contacts_empty_permission_denied).setVisibility(8);
                    TextView textView = (TextView) view.findViewById(R.id.welcome_calls_message);
                    textView.setContentDescription(A09().getString(R.string.accessible_welcome_calls_message));
                    textView.setText(C50262Ra.A00(A09().getString(R.string.welcome_calls_message), C02180Ae.A0O(A00(), R.drawable.ic_new_call_tip, R.color.primary_text), textView.getPaint()));
                } else {
                    if (this.A0G.A03()) {
                        ViewGroup viewGroup = (ViewGroup) C0AT.A0D(view, R.id.calls_empty_no_contacts);
                        if (viewGroup.getChildCount() == 0) {
                            EmptyTellAFriendView emptyTellAFriendView = new EmptyTellAFriendView(((Hilt_CallsFragment) this).A00);
                            viewGroup.addView(emptyTellAFriendView);
                            emptyTellAFriendView.setInviteButtonClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(this, 13));
                        }
                        viewGroup.setVisibility(0);
                        view.findViewById(R.id.contacts_empty_permission_denied).setVisibility(8);
                    } else {
                        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.contacts_empty_permission_denied);
                        if (viewGroup2.getChildCount() == 0) {
                            A09().getLayoutInflater().inflate(R.layout.empty_contacts_permissions_needed, viewGroup2, true);
                            viewGroup2.findViewById(R.id.button_open_permission_settings).setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_3(this, 13));
                        }
                        viewGroup2.setVisibility(0);
                        view.findViewById(R.id.calls_empty_no_contacts).setVisibility(8);
                    }
                    view.findViewById(R.id.init_calls_progress).setVisibility(8);
                    view.findViewById(R.id.search_no_matches).setVisibility(8);
                    view.findViewById(R.id.welcome_calls_message).setVisibility(8);
                }
            } else if (TextUtils.isEmpty(this.A0U)) {
            } else {
                view.findViewById(R.id.init_calls_progress).setVisibility(8);
                view.findViewById(R.id.search_no_matches).setVisibility(0);
                ((TextView) view.findViewById(R.id.search_no_matches)).setText(A09().getString(R.string.search_no_results, this.A0U));
                view.findViewById(R.id.welcome_calls_message).setVisibility(8);
                view.findViewById(R.id.calls_empty_no_contacts).setVisibility(8);
                view.findViewById(R.id.contacts_empty_permission_denied).setVisibility(8);
            }
        }
    }

    public final void A14() {
        Intent intent = new Intent(A09(), ContactPicker.class);
        intent.putExtra("call_picker", true);
        intent.putExtra("request_sync", this.A0Z);
        A0O(intent, 10, null);
        this.A0Z = false;
    }

    public final void A15() {
        C018508q c018508q = this.A03;
        Runnable runnable = this.A0g;
        c018508q.A02.removeCallbacks(runnable);
        LinkedHashMap linkedHashMap = this.A0X;
        if (linkedHashMap.isEmpty() || A09() == null) {
            return;
        }
        Object next = linkedHashMap.keySet().iterator().next();
        this.A03.A02.postDelayed(runnable, (C02620Cd.A01(((C53202c3) this.A0X.get(next)).A01()) - System.currentTimeMillis()) + 1000);
    }

    public void A16(C53202c3 c53202c3, C53242cB c53242cB) {
        String A03 = c53202c3.A03();
        HashSet hashSet = this.A0h;
        if (hashSet.contains(A03)) {
            hashSet.remove(A03);
            if (hashSet.isEmpty() && this.A01 != null) {
                A11();
                C0U0 c0u0 = this.A01;
                if (c0u0 != null) {
                    c0u0.A05();
                }
            }
            c53242cB.A01.setBackgroundResource(0);
            SelectionCheckView selectionCheckView = c53242cB.A0B;
            selectionCheckView.setVisibility(8);
            selectionCheckView.A03(false, true);
        } else {
            hashSet.add(A03);
            if (this.A01 == null) {
                ActivityC02330At A09 = A09();
                if (A09 instanceof ActivityC02320As) {
                    this.A01 = ((ActivityC02320As) A09).A0e(this.A0a);
                }
            }
            c53242cB.A01.setBackgroundResource(R.color.home_row_selection);
            SelectionCheckView selectionCheckView2 = c53242cB.A0B;
            selectionCheckView2.setVisibility(0);
            selectionCheckView2.A03(true, true);
        }
        C0U0 c0u02 = this.A01;
        if (c0u02 != null) {
            c0u02.A06();
        }
        if (hashSet.isEmpty()) {
            return;
        }
        AnonymousClass088.A1C(A09(), this.A0E, this.A0H.A0A(R.plurals.n_items_selected, hashSet.size(), Integer.valueOf(hashSet.size())));
    }

    public void A17(InterfaceC53232cA interfaceC53232cA, AbstractC53222c9 abstractC53222c9) {
        int AAh = interfaceC53232cA.AAh();
        if (AAh == 2) {
            C53202c3 c53202c3 = ((C53252cC) interfaceC53232cA).A00;
            if (c53202c3.A03.isEmpty()) {
                C000700j.A08(false, "voip/CallsFragment/onListItemClicked empty call group");
                return;
            }
            C53242cB c53242cB = (C53242cB) abstractC53222c9;
            if (this.A01 != null) {
                A16(c53202c3, c53242cB);
            } else if (!c53202c3.A04()) {
                ArrayList arrayList = new ArrayList();
                Iterator it = c53202c3.A03.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C0D3) it.next()).A03());
                }
                Intent intent = new Intent(((Hilt_CallsFragment) this).A00, CallLogActivity.class);
                if (c53202c3.A02() != null) {
                    intent.putExtra("jid", C003101m.A07(c53202c3.A02().A02()));
                }
                intent.putExtra("calls", arrayList);
                A0i(intent);
            } else {
                Context A00 = A00();
                Parcelable A03 = ((C0D3) c53202c3.A03.get(0)).A03();
                Intent intent2 = new Intent(A00, GroupCallLogActivity.class);
                intent2.putExtra("call_log_key", A03);
                A00.startActivity(intent2);
            }
        } else if (AAh == 1) {
            ((WaListFragment) this).A00.A01(this, Conversation.A02(((Hilt_CallsFragment) this).A00, ((C53272cE) interfaceC53232cA).A00));
        }
    }

    @Override // X.C0MK
    public void A5V(C07610Yz c07610Yz) {
        this.A0U = c07610Yz.A01;
        this.A0Q.getFilter().filter(this.A0U);
    }

    @Override // X.InterfaceC04900Mj
    public void A7E() {
        this.A0Y = false;
    }

    @Override // X.InterfaceC04900Mj
    public void A7Z() {
        this.A0Y = true;
    }

    @Override // X.C0MJ
    public String A8Q() {
        return A09().getString(R.string.room_create);
    }

    @Override // X.C0MJ
    public Drawable A8R() {
        if (this.A04.A05()) {
            return C02180Ae.A0O(A00(), R.drawable.ic_room, R.color.fabSecondaryContent);
        }
        return null;
    }

    @Override // X.C0MJ
    public String AB1() {
        return A09().getString(R.string.menuitem_new_call);
    }

    @Override // X.C0MJ
    public Drawable AB2() {
        return C02160Ac.A03(A00(), R.drawable.ic_action_new_call);
    }

    @Override // X.C0MJ
    public void AHf() {
        C06950Vu c06950Vu = this.A04;
        AbstractC02800Cx abstractC02800Cx = super.A0H;
        DialogFragment A03 = c06950Vu.A03(null, 2);
        if (A03 != null) {
            AnonymousClass029.A1C(abstractC02800Cx, A03);
        } else {
            c06950Vu.A04(null, 2);
        }
    }

    @Override // X.C0MJ
    public void ALg() {
        if (C0L6.A01()) {
            Log.w("voip/CallsFragment try to start outgoing call from active voip call");
            this.A03.A07(R.string.error_call_disabled_during_call, 0);
        } else if (this.A0G.A03()) {
            A14();
        } else {
            RequestPermissionActivity.A0F(this, R.string.permission_contacts_access_on_new_call_request, R.string.permission_contacts_access_on_new_call);
        }
    }

    @Override // X.C0BA, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.A0U = true;
        C0U0 c0u0 = this.A01;
        if (c0u0 != null) {
            c0u0.A06();
        }
    }

    /* loaded from: classes2.dex */
    public class ClearCallLogDialogFragment extends Hilt_CallsFragment_ClearCallLogDialogFragment {
        public C018508q A00;
        public C0HY A01;
        public C03080Ec A02;
        public InterfaceC002901k A03;
        public C0MC A04;

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.3br
                {
                    CallsFragment.ClearCallLogDialogFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    CallsFragment.ClearCallLogDialogFragment clearCallLogDialogFragment = CallsFragment.ClearCallLogDialogFragment.this;
                    ProgressDialogFragment A00 = ProgressDialogFragment.A00(R.string.processing, R.string.register_wait_message);
                    A00.A14(clearCallLogDialogFragment.A0H, null);
                    clearCallLogDialogFragment.A03.AS1(new RunnableEBaseShape4S0200000_I0_4(clearCallLogDialogFragment, A00, 46));
                }
            };
            C019208x c019208x = new C019208x(A09());
            c019208x.A02(R.string.clear_call_log_ask);
            c019208x.A06(R.string.ok, onClickListener);
            c019208x.A04(R.string.cancel, null);
            return c019208x.A00();
        }
    }
}
