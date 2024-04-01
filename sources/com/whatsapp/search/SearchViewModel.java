package com.whatsapp.search;

import X.AbstractC005302j;
import X.AnonymousClass024;
import X.AnonymousClass097;
import X.C002301c;
import X.C00A;
import X.C00T;
import X.C018508q;
import X.C018708s;
import X.C04880Mg;
import X.C05W;
import X.C07750Zs;
import X.C0C1;
import X.C0CA;
import X.C0D5;
import X.C0DK;
import X.C0GU;
import X.C0H4;
import X.C0HA;
import X.C0HK;
import X.C0HL;
import X.C0MU;
import X.C0MV;
import X.C0MW;
import X.C0Zn;
import X.C26G;
import X.C2AR;
import X.C2M6;
import X.C2T2;
import X.C2T3;
import X.C461725k;
import X.C461825l;
import X.C461925o;
import X.C52382ad;
import X.C52402af;
import X.C52412ag;
import X.C52422ah;
import X.InterfaceC002901k;
import X.InterfaceC05620Pl;
import X.InterfaceC48692Gh;
import X.InterfaceC52462al;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import androidx.lifecycle.OnLifecycleEvent;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.search.SearchViewModel;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class SearchViewModel extends C0MU implements C0MV, C0MW {
    public C0HL A03;
    public C0HL A04;
    public C0HL A05;
    public C0HL A06;
    public UserJid A0I;
    public Integer A0U;
    public Runnable A0V;
    public Runnable A0W;
    public String A0X;
    public final C07750Zs A0d;
    public final C018508q A0e;
    public final C0Zn A0f;
    public final C002301c A0g;
    public final C0GU A0h;
    public final C0H4 A0i;
    public final C00A A0j;
    public final C0HA A0k;
    public final C52412ag A0l;
    public final C52422ah A0m;
    public final C26G A0n;
    public final C2AR A0o;
    public final InterfaceC002901k A0p;
    public C461825l A0T = new C461825l();
    public C461825l A0R = new C461825l();
    public C461825l A0M = new C461825l();
    public C461825l A0O = new C461825l();
    public C461825l A0N = new C461825l();
    public C461825l A0Q = new C461825l();
    public C461825l A0P = new C461825l();
    public C461825l A0S = new C461825l();
    public C0HK A0G = new C0HK();
    public C04880Mg A07 = new C04880Mg();
    public C04880Mg A0A = new C04880Mg();
    public C04880Mg A0C = new C04880Mg();
    public C0HK A0E = new C0HK();
    public C0HK A0F = new C0HK();
    public AtomicBoolean A0b = new AtomicBoolean();
    public final AtomicBoolean A0q = new AtomicBoolean();
    public C04880Mg A08 = new C04880Mg();
    public C04880Mg A09 = new C04880Mg();
    public List A0Y = new ArrayList();
    public List A0a = new ArrayList();
    public List A0Z = new ArrayList();
    public SparseIntArray A02 = new SparseIntArray();
    public C52382ad A0J = C52382ad.A00();
    public C2T2 A0L = new C2T2();
    public long A00 = 0;
    public boolean A0c = true;
    public C04880Mg A0D = new C04880Mg();
    public C04880Mg A0B = new C04880Mg();
    public Handler A01 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.3Vd
        {
            SearchViewModel.this = this;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            SearchViewModel searchViewModel = SearchViewModel.this;
            if (message.what == 0) {
                searchViewModel.A0J = C52382ad.A00().A01();
                Runnable runnable = searchViewModel.A0W;
                if (runnable != null) {
                    runnable.run();
                }
                searchViewModel.A01.removeMessages(0);
                searchViewModel.A0C();
                return true;
            }
            return false;
        }
    });
    public C00T A0H = new C00T() { // from class: X.2ae
        {
            SearchViewModel.this = this;
        }

        @Override // X.C00T
        public void A03(Collection collection, int i) {
            for (Object obj : collection) {
                if (obj instanceof C09G) {
                    SearchViewModel.this.A07.A0B(obj);
                }
            }
        }

        @Override // X.C00T
        public void A08(AnonymousClass092 anonymousClass092, int i) {
            if (anonymousClass092 instanceof C09G) {
                SearchViewModel.this.A07.A0B(anonymousClass092);
            }
        }

        @Override // X.C00T
        public void A0A(Collection collection, AbstractC005302j abstractC005302j, Map map, boolean z) {
            SearchViewModel.this.A0A.A0B(collection);
        }
    };
    public C52402af A0K = new C52402af(this);

    public SearchViewModel(C018508q c018508q, InterfaceC002901k interfaceC002901k, C0GU c0gu, C05W c05w, C2M6 c2m6, C018708s c018708s, C002301c c002301c, C0D5 c0d5, C00A c00a, final C07750Zs c07750Zs, C2AR c2ar, C0HA c0ha, C0H4 c0h4, C0Zn c0Zn, C0CA c0ca, C0DK c0dk) {
        this.A0e = c018508q;
        this.A0p = interfaceC002901k;
        this.A0h = c0gu;
        this.A0g = c002301c;
        this.A0j = c00a;
        this.A0d = c07750Zs;
        this.A0o = c2ar;
        this.A0k = c0ha;
        this.A0i = c0h4;
        this.A0f = c0Zn;
        this.A03 = c07750Zs.A01("current_screen", false, null);
        this.A0C.A0C(c07750Zs.A01("query_text", false, null), new InterfaceC05620Pl() { // from class: X.3nC
            {
                SearchViewModel.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchViewModel.this.A0C.A0B(obj);
            }
        });
        this.A05 = c07750Zs.A01("search_type", false, null);
        this.A04 = c07750Zs.A01("search_jid", false, null);
        this.A06 = c07750Zs.A01("user_grid_view_choice", false, null);
        this.A0l = new C52412ag(c2m6, c018708s, c002301c, c0ca, c0dk, this.A0C, this.A05, this.A04);
        this.A0m = new C52422ah(c2m6, c018708s, c002301c, c0ca, c0dk, this.A0C, this.A05, this.A04);
        C26G c26g = new C26G(c2m6, c05w, c018708s, c002301c, c0d5, this.A0C, this.A05, this.A04);
        this.A0n = c26g;
        this.A0j.A01(c26g.A00);
        this.A0j.A01(this.A0H);
        this.A0D.A0C(this.A0l.A01, new InterfaceC05620Pl() { // from class: X.3nN
            {
                SearchViewModel.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchViewModel searchViewModel = SearchViewModel.this;
                ArrayList arrayList = new ArrayList();
                Iterator it = new ArrayList((Collection) obj).iterator();
                while (it.hasNext()) {
                    C06C c06c = (C06C) it.next();
                    if (c06c != null) {
                        Jid A03 = c06c.A03(AbstractC005302j.class);
                        if (A03 != null) {
                            arrayList.add(new C52572ax((AbstractC005302j) A03));
                        } else {
                            throw null;
                        }
                    }
                }
                searchViewModel.A0Y = arrayList;
                searchViewModel.A0C();
            }
        });
        this.A0D.A0C(this.A0m.A01, new InterfaceC05620Pl() { // from class: X.3nF
            {
                SearchViewModel.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchViewModel searchViewModel = SearchViewModel.this;
                ArrayList arrayList = new ArrayList();
                Iterator it = new ArrayList((Collection) obj).iterator();
                while (it.hasNext()) {
                    C06C c06c = (C06C) it.next();
                    if (c06c != null) {
                        arrayList.add(new C52582ay(c06c));
                    }
                }
                searchViewModel.A0a = arrayList;
                searchViewModel.A0C();
            }
        });
        this.A0D.A0C(this.A0n.A05, new InterfaceC05620Pl() { // from class: X.2ai
            {
                SearchViewModel.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchViewModel searchViewModel = SearchViewModel.this;
                searchViewModel.A0J = ((C52382ad) obj).A01();
                Runnable runnable = searchViewModel.A0W;
                if (runnable != null) {
                    runnable.run();
                }
                searchViewModel.A01.removeMessages(0);
                searchViewModel.A0C();
            }
        });
        this.A0D.A0C(this.A0n.A02, new InterfaceC05620Pl() { // from class: X.3nD
            {
                SearchViewModel.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchViewModel searchViewModel = SearchViewModel.this;
                searchViewModel.A0Z = (List) obj;
                searchViewModel.A0C();
            }
        });
        this.A0D.A0C(this.A0n.A03, new InterfaceC05620Pl() { // from class: X.3nO
            {
                SearchViewModel.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchViewModel searchViewModel = SearchViewModel.this;
                SparseIntArray sparseIntArray = (SparseIntArray) obj;
                if (sparseIntArray == null) {
                    sparseIntArray = new SparseIntArray();
                    sparseIntArray.put(105, 1);
                }
                synchronized (searchViewModel) {
                    searchViewModel.A02 = sparseIntArray;
                }
                searchViewModel.A0C();
            }
        });
        this.A0D.A0C(this.A06, new InterfaceC05620Pl() { // from class: X.3nG
            {
                SearchViewModel.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchViewModel.this.A0C();
            }
        });
        this.A0B.A0C(this.A0n.A08, new InterfaceC05620Pl() { // from class: X.2aj
            {
                SearchViewModel.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchViewModel.this.A0E();
            }
        });
        this.A0B.A0C(this.A0n.A0A, new InterfaceC05620Pl() { // from class: X.2aj
            {
                SearchViewModel.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchViewModel.this.A0E();
            }
        });
        this.A0B.A0C(this.A0n.A0B, new InterfaceC05620Pl() { // from class: X.2aj
            {
                SearchViewModel.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchViewModel.this.A0E();
            }
        });
        this.A0B.A0C(this.A0l.A03, new InterfaceC05620Pl() { // from class: X.2aj
            {
                SearchViewModel.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchViewModel.this.A0E();
            }
        });
        this.A0B.A0C(this.A0m.A03, new InterfaceC05620Pl() { // from class: X.2aj
            {
                SearchViewModel.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchViewModel.this.A0E();
            }
        });
        this.A0B.A0C(this.A0F, new InterfaceC05620Pl() { // from class: X.3nL
            {
                SearchViewModel.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchViewModel.this.A0E();
            }
        });
        this.A0B.A0C(this.A0D, new InterfaceC05620Pl() { // from class: X.3nI
            {
                SearchViewModel.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchViewModel.this.A0E();
            }
        });
        this.A0C.A0C(this.A0n.A0C, new InterfaceC05620Pl() { // from class: X.3nJ
            {
                SearchViewModel.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchViewModel searchViewModel = SearchViewModel.this;
                C07750Zs c07750Zs2 = c07750Zs;
                String str = (String) obj;
                if (str == null) {
                    str = "";
                }
                if (!AnonymousClass024.A0l(str, searchViewModel.A09())) {
                    searchViewModel.A0L.A00(new C2T3(3, Integer.valueOf(searchViewModel.A03()), searchViewModel.A06(), str));
                    c07750Zs2.A02("query_text", str);
                }
            }
        });
        this.A0D.A0B(A07());
    }

    @Override // X.C0MU
    public void A01() {
        this.A0f.A00();
        C00A c00a = this.A0j;
        c00a.A00(this.A0n.A00);
        c00a.A00(this.A0H);
    }

    public int A02() {
        Number number = (Number) this.A0d.A02.get("last_nav_type");
        if (number == null) {
            return 0;
        }
        return number.intValue();
    }

    public int A03() {
        Number number = (Number) this.A0d.A01("search_type", true, 0).A01();
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public int A04(AbstractC005302j abstractC005302j) {
        C461725k A08 = A08();
        int i = -2;
        for (int i2 = 0; i2 < A08.size(); i2++) {
            if ((A08.get(i2).A00 == 3 || A08.get(i2).A00 == 2) && AnonymousClass024.A0l(((InterfaceC52462al) A08.get(i2)).AAj(), abstractC005302j)) {
                i = i2;
            }
        }
        return i;
    }

    public int A05(AnonymousClass097 anonymousClass097) {
        int i = -2;
        if (this.A0J.A00.contains(anonymousClass097)) {
            C461725k A08 = A08();
            for (int i2 = 0; i2 < A08.size(); i2++) {
                int A00 = A08.A00(i2);
                if ((C461925o.A00(A00) || A00 == 17 || A00 == 18 || A00 == 16 || A00 == 14) && AnonymousClass024.A0l(A08.A01(i2), anonymousClass097)) {
                    i = i2;
                }
            }
            return i;
        }
        return -2;
    }

    public UserJid A06() {
        return (UserJid) this.A0d.A01("search_jid", true, null).A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x015e, code lost:
        if (A0M() == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x01a1, code lost:
        if (r9.A02.size() <= 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x01bb, code lost:
        if (A0P() != false) goto L135;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C461725k A07() {
        /*
            Method dump skipped, instructions count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.SearchViewModel.A07():X.25k");
    }

    public final C461725k A08() {
        if (this.A0D.A01() == null) {
            return A07();
        }
        return (C461725k) this.A0D.A01();
    }

    public String A09() {
        String str = (String) this.A0d.A01("query_text", true, "").A01();
        return str != null ? str : "";
    }

    public void A0A() {
        A0H(0);
        A0I(null);
        A0L(false);
        A0J("");
        this.A0d.A02("user_grid_view_choice", null);
        this.A0P.A0B(null);
        this.A0n.A00(true);
        this.A0m.A01.A0B(new ArrayList());
        this.A0l.A01.A0B(new ArrayList());
        this.A0a = new ArrayList();
        this.A0Y = new ArrayList();
        this.A0Z = new ArrayList();
        this.A0J = C52382ad.A00();
        Runnable runnable = this.A0W;
        if (runnable != null) {
            runnable.run();
        }
        this.A0L = new C2T2();
        A0C();
    }

    public final void A0B() {
        this.A0b.set(true);
        if (TextUtils.isEmpty(A09()) && A03() == 0 && A06() == null) {
            this.A0q.set(true);
            this.A0c = true;
        } else if (!this.A0c) {
        } else {
            this.A00 = SystemClock.uptimeMillis();
            this.A0c = false;
        }
    }

    public final void A0C() {
        InterfaceC002901k interfaceC002901k = this.A0p;
        RunnableEBaseShape6S0100000_I0_6 runnableEBaseShape6S0100000_I0_6 = new RunnableEBaseShape6S0100000_I0_6(this, 10);
        this.A0V = runnableEBaseShape6S0100000_I0_6;
        interfaceC002901k.AS1(runnableEBaseShape6S0100000_I0_6);
    }

    public final void A0D() {
        if (A08().size() - (this.A0F.A01() == null ? 0 : ((Number) this.A0F.A01()).intValue()) < 300) {
            C26G c26g = this.A0n;
            if (c26g.A01.get()) {
                return;
            }
            C04880Mg c04880Mg = c26g.A06;
            if (c04880Mg.A01() != null) {
                Object obj = ((Pair) c04880Mg.A01()).first;
                Number number = (Number) ((Pair) c04880Mg.A01()).second;
                if (number != null) {
                    C0HK c0hk = c26g.A09;
                    if (c0hk.A01() != null && ((Number) c0hk.A01()).intValue() != -1) {
                        c04880Mg.A0B(new Pair(obj, Integer.valueOf(number.intValue() + 1)));
                    } else if (Boolean.TRUE.equals(obj)) {
                        c04880Mg.A0B(new Pair(Boolean.FALSE, 0));
                    }
                }
            }
        }
    }

    public final void A0E() {
        AbstractCollection abstractCollection = (AbstractCollection) this.A0D.A01();
        boolean z = false;
        int size = abstractCollection == null ? 0 : abstractCollection.size();
        int intValue = this.A0F.A01() == null ? 0 : ((Number) this.A0F.A01()).intValue();
        if (A0O() && intValue > size - 3) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (AnonymousClass024.A0l(valueOf, this.A0B.A01())) {
            return;
        }
        this.A0B.A0B(valueOf);
    }

    public void A0F(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C07750Zs c07750Zs = this.A0d;
        c07750Zs.A02("last_nav_time", Long.valueOf(elapsedRealtime));
        c07750Zs.A02("last_nav_type", Integer.valueOf(i));
    }

    public void A0G(int i) {
        Integer valueOf = Integer.valueOf(i);
        if (AnonymousClass024.A0l(valueOf, this.A03.A01())) {
            return;
        }
        this.A0d.A02("current_screen", valueOf);
    }

    public void A0H(int i) {
        if (i != A03()) {
            C2T2 c2t2 = this.A0L;
            Integer valueOf = Integer.valueOf(i);
            c2t2.A00(new C2T3(2, valueOf, A06(), A09()));
            this.A0d.A02("search_type", valueOf);
        }
    }

    public void A0I(UserJid userJid) {
        if (AnonymousClass024.A0l(userJid, A06())) {
            return;
        }
        this.A0L.A00(new C2T3(3, Integer.valueOf(A03()), userJid, A09()));
        this.A0d.A02("search_jid", userJid);
    }

    public void A0J(String str) {
        if (AnonymousClass024.A0l(str, A09())) {
            return;
        }
        this.A0L.A00(new C2T3(1, Integer.valueOf(A03()), A06(), str));
        this.A0d.A02("query_text", str);
    }

    public void A0K(boolean z) {
        A0A();
        A0G(1);
        A0F(4);
        this.A0P.A0A(Boolean.valueOf(z));
    }

    public void A0L(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        if (!valueOf.equals(this.A0G.A01())) {
            this.A0G.A0B(valueOf);
        }
    }

    public boolean A0M() {
        return A03() == 103 || A03() == 105 || A03() == 118;
    }

    public final boolean A0N() {
        if (this.A0J.A01.size() == 0) {
            return false;
        }
        Boolean bool = (Boolean) this.A0d.A02.get("user_grid_view_choice");
        if (bool != null) {
            return bool.booleanValue();
        }
        return A0M() && A09().isEmpty();
    }

    public final boolean A0O() {
        Boolean bool = Boolean.TRUE;
        if (!bool.equals(this.A0l.A03.A01()) && !bool.equals(this.A0m.A03.A01())) {
            C26G c26g = this.A0n;
            if (!bool.equals(c26g.A08.A01()) && !bool.equals(c26g.A0B.A01()) && !bool.equals(c26g.A0A.A01())) {
                return false;
            }
        }
        return true;
    }

    public final boolean A0P() {
        return (!Boolean.TRUE.equals(this.A0n.A0B.A01()) || this.A0J.A01.size() > 0) && this.A02.size() > 0;
    }

    public final boolean A0Q(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Number number = (Number) this.A0d.A02.get("last_nav_time");
        return elapsedRealtime - (number == null ? 0L : number.longValue()) > j;
    }

    @Override // X.C0MV
    public InterfaceC48692Gh A6t(MediaViewFragment mediaViewFragment, AnonymousClass097 anonymousClass097) {
        return new InterfaceC48692Gh() { // from class: X.2an
            @Override // X.InterfaceC48692Gh
            public void AV0() {
            }

            @Override // X.InterfaceC48692Gh
            public void AVA() {
            }

            @Override // X.InterfaceC48692Gh
            public void close() {
            }

            {
                SearchViewModel.this = this;
            }

            @Override // X.InterfaceC48692Gh
            public AnonymousClass097 ABE(int i) {
                if (i != -2) {
                    SearchViewModel searchViewModel = SearchViewModel.this;
                    if (i < searchViewModel.A0J.A00.size()) {
                        return (AnonymousClass097) searchViewModel.A0J.A00.get(i);
                    }
                    return null;
                }
                return null;
            }

            @Override // X.InterfaceC48692Gh
            public int ACW(AnonymousClass094 anonymousClass094) {
                int i = 0;
                while (true) {
                    SearchViewModel searchViewModel = SearchViewModel.this;
                    if (i >= searchViewModel.A0J.A00.size()) {
                        return -2;
                    }
                    if (AnonymousClass024.A0l(anonymousClass094, ((AnonymousClass092) searchViewModel.A0J.A00.get(i)).A0n)) {
                        return i;
                    }
                    i++;
                }
            }

            @Override // X.InterfaceC48692Gh
            public void AMI() {
                SearchViewModel.this.A0F(2);
            }

            @Override // X.InterfaceC48692Gh
            public void ASy(Runnable runnable) {
                SearchViewModel.this.A0W = runnable;
            }

            @Override // X.InterfaceC48692Gh
            public void AVn(int i) {
                SearchViewModel searchViewModel = SearchViewModel.this;
                int A05 = searchViewModel.A05((AnonymousClass097) searchViewModel.A0J.A00.get(i));
                if (A05 < 0 || A05 > searchViewModel.A08().size()) {
                    return;
                }
                searchViewModel.A0Q.A0A(Integer.valueOf(A05));
            }

            @Override // X.InterfaceC48692Gh
            public int getCount() {
                return SearchViewModel.this.A0J.A00.size();
            }
        };
    }

    @OnLifecycleEvent(C0C1.ON_PAUSE)
    public void onPause() {
        A02();
        if (A02() == 2 || A02() == 1 || A02() == 4) {
            return;
        }
        if (A02() != 0 || A0Q(500L)) {
            A0F(3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x001a, code lost:
        if (r0 != false) goto L15;
     */
    @androidx.lifecycle.OnLifecycleEvent(X.C0C1.ON_RESUME)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            r5 = this;
            r5.A02()
            int r1 = r5.A02()
            r0 = 1
            r4 = 0
            if (r1 == 0) goto L31
            if (r1 == r0) goto L1c
            r0 = 2
            r2 = 300000(0x493e0, double:1.482197E-318)
            if (r1 == r0) goto L23
            r0 = 3
            if (r1 != r0) goto L31
            boolean r0 = r5.A0Q(r2)
        L1a:
            if (r0 == 0) goto L31
        L1c:
            r5.A02()
            r5.A0K(r4)
            return
        L23:
            r0 = 500(0x1f4, double:2.47E-321)
            boolean r0 = r5.A0Q(r0)
            if (r0 != 0) goto L2c
            return
        L2c:
            boolean r0 = r5.A0Q(r2)
            goto L1a
        L31:
            r5.A0F(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.SearchViewModel.onResume():void");
    }
}
