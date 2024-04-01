package com.whatsapp.status.playback.fragment;

import X.AbstractC005302j;
import X.AbstractC53812hY;
import X.AbstractC53822hZ;
import X.ActivityC02270An;
import X.AnonymousClass008;
import X.AnonymousClass012;
import X.AnonymousClass029;
import X.AnonymousClass092;
import X.AnonymousClass094;
import X.AnonymousClass097;
import X.C002301c;
import X.C003101m;
import X.C00A;
import X.C00T;
import X.C011405q;
import X.C018508q;
import X.C018608r;
import X.C018708s;
import X.C01B;
import X.C02L;
import X.C03010Du;
import X.C03320Ff;
import X.C03360Fk;
import X.C05W;
import X.C06C;
import X.C06F;
import X.C09B;
import X.C09H;
import X.C0BA;
import X.C0C9;
import X.C0CB;
import X.C0D6;
import X.C0DB;
import X.C0EB;
import X.C0GA;
import X.C0GC;
import X.C0GE;
import X.C0HS;
import X.C0JP;
import X.C0L5;
import X.C0LD;
import X.C0Zn;
import X.C22X;
import X.C25I;
import X.C25J;
import X.C25K;
import X.C2AL;
import X.C2AR;
import X.C2Q3;
import X.C53352fk;
import X.C53842hb;
import X.C53962ho;
import X.C71703Xd;
import X.C82113pz;
import X.C82233qB;
import X.C82243qC;
import X.C86873yf;
import X.C86883yg;
import X.InterfaceC002901k;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.base.WaFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class StatusPlaybackContactFragment extends Hilt_StatusPlaybackContactFragment implements C25J, C25I, C25K {
    public int A01;
    public C018508q A02;
    public C02L A03;
    public C03010Du A04;
    public C01B A05;
    public C018608r A06;
    public C03320Ff A07;
    public C05W A08;
    public AnonymousClass008 A09;
    public C018708s A0A;
    public C0Zn A0B;
    public C0L5 A0C;
    public AnonymousClass012 A0D;
    public C002301c A0E;
    public C0C9 A0F;
    public C00A A0G;
    public C22X A0H;
    public C0EB A0I;
    public C03360Fk A0J;
    public UserJid A0K;
    public AnonymousClass092 A0L;
    public C0CB A0M;
    public C2AR A0N;
    public C2AL A0O;
    public C82243qC A0P;
    public C53352fk A0Q;
    public InterfaceC002901k A0R;
    public List A0S;
    public boolean A0T;
    public boolean A0U;
    public final C71703Xd A0a = new C71703Xd();
    public int A00 = 0;
    public final C06F A0V = new C06F() { // from class: X.3q7
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(3);
            StatusPlaybackContactFragment.this = this;
        }

        @Override // X.C06F
        public void A09(boolean z, Object obj, Object obj2, Object obj3) {
            int i;
            AbstractC53822hZ abstractC53822hZ = (AbstractC53822hZ) obj2;
            StatusPlaybackContactFragment statusPlaybackContactFragment = StatusPlaybackContactFragment.this;
            C2Q3 c2q3 = (C2Q3) statusPlaybackContactFragment.A09();
            if (c2q3 != null) {
                i = c2q3.AAp();
            } else {
                i = 0;
            }
            C71703Xd.A00(abstractC53822hZ, i);
            if (abstractC53822hZ != null && abstractC53822hZ.A04) {
                abstractC53822hZ.A06();
            }
            if (statusPlaybackContactFragment.A0a != null) {
                if (abstractC53822hZ == null || !abstractC53822hZ.A01) {
                    return;
                }
                if (abstractC53822hZ.A03) {
                    abstractC53822hZ.A03();
                }
                abstractC53822hZ.A02();
                return;
            }
            throw null;
        }
    };
    public final C0GA A0X = new C0GA() { // from class: X.3q8
        {
            StatusPlaybackContactFragment.this = this;
        }

        @Override // X.C0GA
        public void A00() {
            StatusPlaybackContactFragment.this.A19();
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            if (abstractC005302j != null) {
                StatusPlaybackContactFragment statusPlaybackContactFragment = StatusPlaybackContactFragment.this;
                if (abstractC005302j.equals(statusPlaybackContactFragment.A0K)) {
                    statusPlaybackContactFragment.A19();
                }
            }
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            if (userJid != null) {
                StatusPlaybackContactFragment statusPlaybackContactFragment = StatusPlaybackContactFragment.this;
                if (userJid.equals(statusPlaybackContactFragment.A0K)) {
                    statusPlaybackContactFragment.A19();
                }
            }
        }
    };
    public final C0GC A0W = new C0GC() { // from class: X.3q9
        {
            StatusPlaybackContactFragment.this = this;
        }

        @Override // X.C0GC
        public void A00(AbstractC005302j abstractC005302j) {
            StatusPlaybackContactFragment.this.A19();
        }
    };
    public final C0GE A0Z = new C0GE() { // from class: X.3qA
        {
            StatusPlaybackContactFragment.this = this;
        }

        @Override // X.C0GE
        public void A00(Set set) {
            StatusPlaybackContactFragment.this.A19();
        }
    };
    public final C00T A0Y = new C82233qB(this);

    public static boolean A00(StatusPlaybackContactFragment statusPlaybackContactFragment, int i, int i2) {
        List list = statusPlaybackContactFragment.A0S;
        if (list != null) {
            if (statusPlaybackContactFragment.A00 < list.size() - 1) {
                statusPlaybackContactFragment.A1B(statusPlaybackContactFragment.A00 + 1);
                statusPlaybackContactFragment.A1D(statusPlaybackContactFragment.A17(), i, i2);
                return true;
            }
            C2Q3 c2q3 = (C2Q3) statusPlaybackContactFragment.A09();
            if (c2q3 != null) {
                return c2q3.AL9(statusPlaybackContactFragment.A0y(), true, i, i2);
            }
            return false;
        }
        return false;
    }

    @Override // com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment, com.whatsapp.status.playback.fragment.StatusPlaybackFragment, X.C0BA
    public void A0f() {
        super.A0f();
        for (AbstractC53822hZ abstractC53822hZ : ((AbstractMap) this.A0V.A06()).values()) {
            if (this.A0a != null) {
                if (abstractC53822hZ != null && abstractC53822hZ.A03) {
                    abstractC53822hZ.A03();
                }
            } else {
                throw null;
            }
        }
    }

    @Override // X.C0BA
    public void A0h(int i, int i2, Intent intent) {
        if (i == 2 && i2 == -1 && intent != null) {
            List A0F = C003101m.A0F(AbstractC005302j.class, intent.getStringArrayListExtra("jids"));
            this.A06.A0E(this.A04, this.A0L, A0F);
            AbstractList abstractList = (AbstractList) A0F;
            if (abstractList.size() != 1 || C003101m.A0Z((Jid) abstractList.get(0))) {
                ((ActivityC02270An) A09()).A1L(A0F);
            } else {
                ((WaFragment) this).A00.A01(this, Conversation.A02(((Hilt_StatusPlaybackContactFragment) this).A00, (AbstractC005302j) abstractList.get(0)));
            }
        }
    }

    @Override // com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment, X.C0BA
    public void A0j(Bundle bundle) {
        super.A0j(bundle);
        this.A09.A01(this.A0X);
        this.A0G.A01(this.A0Y);
        this.A07.A01(this.A0W);
        this.A0J.A01(this.A0Z);
        this.A0R.ARy(this.A0P, new Void[0]);
        UserJid userJid = this.A0K;
        if (C011405q.A03(userJid)) {
            return;
        }
        C06C A0A = this.A08.A0A(userJid);
        if (A0A.A0a) {
            A0A.A0a = false;
            this.A0R.AS1(new RunnableEBaseShape4S0200000_I0_4(this, A0A, 16));
        }
    }

    @Override // X.C0BA
    public void A0k(Bundle bundle) {
        AnonymousClass092 anonymousClass092 = this.A0L;
        if (anonymousClass092 != null) {
            C0LD.A07(bundle, anonymousClass092.A0n, "");
        }
    }

    @Override // com.whatsapp.status.playback.fragment.StatusPlaybackFragment, X.C0BA
    public void A0q() {
        super.A0q();
        this.A09.A00(this.A0X);
        this.A0G.A00(this.A0Y);
        this.A07.A00(this.A0W);
        this.A0J.A00(this.A0Z);
        C82243qC c82243qC = this.A0P;
        if (c82243qC != null) {
            c82243qC.A05(true);
        }
        C0Zn c0Zn = this.A0B;
        if (c0Zn != null) {
            c0Zn.A00();
        }
    }

    @Override // X.C0BA
    public void A0r() {
        super.A0U = true;
        this.A0V.A07(-1);
    }

    @Override // com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment, com.whatsapp.status.playback.fragment.StatusPlaybackFragment, X.C0BA
    public void A0s() {
        super.A0s();
        for (AbstractC53822hZ abstractC53822hZ : ((AbstractMap) this.A0V.A06()).values()) {
            if (this.A0a != null) {
                if (abstractC53822hZ != null && !abstractC53822hZ.A03) {
                    abstractC53822hZ.A04();
                }
            } else {
                throw null;
            }
        }
    }

    @Override // X.C0BA
    public void A0v(Bundle bundle) {
        AnonymousClass094 A03;
        super.A0v(bundle);
        this.A0K = C003101m.A06(A02().getString("jid"));
        this.A0U = ((C0BA) this).A06.getBoolean("unseen_only");
        if (bundle == null || (A03 = C0LD.A03(bundle, "")) == null) {
            return;
        }
        this.A0L = this.A0F.A0H.A05(A03);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.3qC] */
    @Override // com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment, X.C0BA
    public void A0w(View view, Bundle bundle) {
        super.A0w(view, bundle);
        C53962ho A14 = A14();
        UserJid userJid = this.A0K;
        if (!C011405q.A03(userJid) && !C003101m.A0Y(userJid)) {
            A14.A02.setVisibility(0);
        } else {
            A14.A02.setVisibility(8);
        }
        this.A0B = this.A0C.A04(A00());
        A19();
        this.A0P = new C0HS(this.A0I, this.A0F, this.A0H, this, C0LD.A03(A02(), ""), this.A0U, this.A0K) { // from class: X.3qC
            public int A00;
            public final C0C9 A01;
            public final C22X A02;
            public final C0EB A03;
            public final UserJid A04;
            public final AnonymousClass094 A05;
            public final WeakReference A06;
            public final boolean A07;

            {
                this.A03 = r2;
                this.A01 = r3;
                this.A02 = r4;
                this.A06 = new WeakReference(this);
                this.A05 = r6;
                this.A07 = r7;
                this.A04 = r8;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                boolean z;
                AnonymousClass094 anonymousClass094 = this.A05;
                if (anonymousClass094 == null) {
                    C0EB c0eb = this.A03;
                    UserJid userJid2 = this.A04;
                    C0Hr A07 = c0eb.A07(userJid2);
                    if (A07 != null) {
                        List A02 = this.A02.A02(userJid2);
                        if (this.A07) {
                            Iterator it = ((AbstractCollection) A02).iterator();
                            while (it.hasNext()) {
                                AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
                                synchronized (A07) {
                                    z = anonymousClass092.A0p > A07.A04;
                                }
                                if (!z) {
                                    this.A00++;
                                }
                            }
                            return A02;
                        }
                        return A02;
                    }
                    return Collections.emptyList();
                }
                AnonymousClass092 A0F = this.A01.A0F(anonymousClass094);
                if (A0F != null) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(A0F);
                    return arrayList;
                }
                return Collections.emptyList();
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                List list = (List) obj;
                StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this.A06.get();
                if (statusPlaybackContactFragment != null) {
                    int i = this.A00;
                    StringBuilder A0P = C000200d.A0P("playbackFragment/onMessagesLoaded ");
                    A0P.append(list.size());
                    A0P.append(" messages; ");
                    A0P.append(statusPlaybackContactFragment);
                    Log.i(A0P.toString());
                    C53962ho A142 = statusPlaybackContactFragment.A14();
                    statusPlaybackContactFragment.A0S = list;
                    statusPlaybackContactFragment.A1A();
                    if (!list.isEmpty()) {
                        if (i < list.size()) {
                            statusPlaybackContactFragment.A00 = i;
                        }
                        AbstractC53822hZ A18 = statusPlaybackContactFragment.A18((AnonymousClass092) list.get(statusPlaybackContactFragment.A00));
                        A142.A06.removeAllViews();
                        A142.A06.addView(A18.A00);
                        A142.A01.setVisibility(8);
                        if (((StatusPlaybackFragment) statusPlaybackContactFragment).A00) {
                            if (statusPlaybackContactFragment.A0S != null) {
                                int i2 = statusPlaybackContactFragment.A00;
                                statusPlaybackContactFragment.A00 = -1;
                                if (i2 == -1) {
                                    i2 = 0;
                                }
                                statusPlaybackContactFragment.A1B(i2);
                            }
                            statusPlaybackContactFragment.A1D(statusPlaybackContactFragment.A17(), 0, statusPlaybackContactFragment.A01);
                            return;
                        }
                        return;
                    }
                    C2Q3 c2q3 = (C2Q3) statusPlaybackContactFragment.A09();
                    if (c2q3 == null) {
                        return;
                    }
                    c2q3.ALC(statusPlaybackContactFragment.A0K.getRawString());
                }
            }
        };
    }

    @Override // com.whatsapp.status.playback.fragment.StatusPlaybackFragment
    public void A10() {
        super.A10();
        if (this.A0S != null) {
            int i = this.A00;
            this.A00 = -1;
            if (i == -1) {
                i = 0;
            }
            A1B(i);
        }
    }

    @Override // com.whatsapp.status.playback.fragment.StatusPlaybackFragment
    public void A11() {
        super.A11();
        AbstractC53822hZ A17 = A17();
        if (A17 != null && A17.A04) {
            A17.A06();
        }
    }

    @Override // com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment
    public void A16(boolean z) {
        super.A16(z);
        AbstractC53822hZ A17 = A17();
        if (A17 != null) {
            ((AbstractC53812hY) A17).A0B().A06(z);
        }
    }

    public final AbstractC53822hZ A17() {
        List list;
        int i = this.A00;
        if (i < 0 || (list = this.A0S) == null || i >= list.size()) {
            return null;
        }
        return (AbstractC53822hZ) this.A0V.A04(((AnonymousClass092) this.A0S.get(this.A00)).A0n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.3yg] */
    public final AbstractC53822hZ A18(AnonymousClass092 anonymousClass092) {
        C86873yf c86873yf;
        C53962ho A14 = A14();
        C06F c06f = this.A0V;
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        AbstractC53822hZ abstractC53822hZ = (AbstractC53822hZ) c06f.A04(anonymousClass094);
        C86873yf c86873yf2 = abstractC53822hZ;
        if (abstractC53822hZ == null) {
            C53352fk c53352fk = this.A0Q;
            C53842hb c53842hb = new C53842hb(this, anonymousClass092);
            if (c53352fk != null) {
                if (anonymousClass094.A02) {
                    c86873yf = new C86883yg(c53352fk.A09, c53352fk.A0G, c53352fk.A0P, c53352fk.A01, c53352fk.A02, c53352fk.A0Q, c53352fk.A0F, c53352fk.A03, c53352fk.A00, c53352fk.A08, c53352fk.A0I, c53352fk.A05, c53352fk.A0E, c53352fk.A07, c53352fk.A0B, c53352fk.A0K, c53352fk.A06, c53352fk.A0C, c53352fk.A0D, c53352fk.A0L, c53352fk.A04, c53352fk.A0A, c53352fk.A0R, c53352fk.A0M, c53352fk.A0N, c53352fk.A0J, c53352fk.A0H, c53352fk.A0O, anonymousClass092, c53842hb);
                } else {
                    c86873yf = new C86873yf(c53352fk.A0G, c53352fk.A0P, c53352fk.A01, c53352fk.A02, c53352fk.A0Q, c53352fk.A0F, c53352fk.A03, c53352fk.A00, c53352fk.A0I, c53352fk.A0E, c53352fk.A0B, c53352fk.A0K, c53352fk.A0C, c53352fk.A0D, c53352fk.A0L, c53352fk.A0R, c53352fk.A0M, c53352fk.A0N, c53352fk.A0J, c53352fk.A0O, anonymousClass092, c53842hb);
                }
                C71703Xd c71703Xd = this.A0a;
                ViewGroup viewGroup = A14.A06;
                boolean A0Y = A0Y();
                Rect rect = ((StatusPlaybackFragment) this).A01;
                if (c71703Xd != null) {
                    if (!((AbstractC53822hZ) c86873yf).A01) {
                        ((AbstractC53822hZ) c86873yf).A01 = true;
                        StringBuilder sb = new StringBuilder("playbackPage/onCreate page=");
                        sb.append(c86873yf);
                        sb.append("; host=");
                        sb.append(c86873yf.A0G.A00);
                        Log.i(sb.toString());
                        View A00 = c86873yf.A00(LayoutInflater.from(viewGroup.getContext()), viewGroup);
                        if (A00 != null) {
                            ((AbstractC53822hZ) c86873yf).A00 = A00;
                            c86873yf.A09(A00);
                            c86873yf.A07();
                            c86873yf.A08(rect);
                            if (A0Y && !((AbstractC53822hZ) c86873yf).A03) {
                                c86873yf.A04();
                            }
                        } else {
                            throw new IllegalStateException("onCreateView must return a view");
                        }
                    }
                    c06f.A08(anonymousClass094, c86873yf);
                    c86873yf2 = c86873yf;
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        return c86873yf2;
    }

    public final void A19() {
        C53962ho A14 = A14();
        C05W c05w = this.A08;
        UserJid userJid = this.A0K;
        if (C011405q.A03(userJid)) {
            C02L c02l = this.A03;
            c02l.A05();
            userJid = c02l.A03;
            if (userJid == null) {
                throw null;
            }
        }
        C06C A0A = c05w.A0A(userJid);
        C0Zn c0Zn = this.A0B;
        if (c0Zn != null) {
            c0Zn.A02(A0A, A14.A09);
        }
        FrameLayout frameLayout = A14.A07;
        Context context = frameLayout.getContext();
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) frameLayout.findViewById(R.id.name);
        if (C011405q.A03(this.A0K)) {
            textEmojiLabel.setText(context.getString(R.string.my_status));
            textEmojiLabel.setCompoundDrawables(null, null, null, null);
            return;
        }
        textEmojiLabel.A06(this.A0A.A05(A0A), null, false, 0);
        boolean A0Y = C003101m.A0Y(this.A0K);
        if (!A0Y) {
            textEmojiLabel.setCompoundDrawables(null, null, null, null);
        } else if (A0Y) {
            textEmojiLabel.A02(R.drawable.ic_verified);
        } else if (!A0Y) {
        } else {
            textEmojiLabel.A02(R.drawable.ic_verified_large);
        }
    }

    public final void A1A() {
        C09H c09h;
        C53962ho A14 = A14();
        A14.A0C.setCount(this.A0S.size());
        A14.A0C.A06.clear();
        if (C011405q.A03(this.A0K)) {
            int i = 0;
            for (AnonymousClass092 anonymousClass092 : this.A0S) {
                if ((anonymousClass092 instanceof AnonymousClass097) && (c09h = ((AnonymousClass097) anonymousClass092).A02) != null && !c09h.A0P && !c09h.A0a && (!(anonymousClass092 instanceof C0JP) || !C0DB.A0q((C09B) anonymousClass092))) {
                    A14.A0C.A06.add(Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    public final void A1B(int i) {
        List list;
        if (this.A00 == i || (list = this.A0S) == null) {
            return;
        }
        if (list.isEmpty()) {
            StringBuilder sb = new StringBuilder("playbackFragment/setPageActive no-messages ");
            sb.append(this);
            Log.w(sb.toString());
            return;
        }
        this.A00 = i;
        C53962ho A14 = A14();
        A14.A0C.setPosition(i);
        A14.A0C.setProgressProvider(null);
        AnonymousClass092 anonymousClass092 = (AnonymousClass092) this.A0S.get(i);
        AbstractC53822hZ A18 = A18(anonymousClass092);
        A14.A04.setVisibility(!(((AbstractC53812hY) A18).A0B() instanceof C82113pz) ? 0 : 4);
        View view = A18.A00;
        if (A14.A06.getChildCount() == 0 || A14.A06.getChildAt(0) != view) {
            A14.A06.removeAllViews();
            A14.A06.addView(view);
        }
        for (AbstractC53822hZ abstractC53822hZ : ((AbstractMap) this.A0V.A06()).values()) {
            if (abstractC53822hZ != A18 && abstractC53822hZ != null && abstractC53822hZ.A04) {
                abstractC53822hZ.A06();
            }
        }
        A1C(anonymousClass092);
        if (this.A0a != null) {
            if (!A18.A04) {
                A18.A05();
            }
            if (i < this.A0S.size() - 1) {
                A18((AnonymousClass092) this.A0S.get(i + 1));
            }
            if (i > 0) {
                A18((AnonymousClass092) this.A0S.get(i - 1));
                return;
            }
            return;
        }
        throw null;
    }

    public final void A1C(AnonymousClass092 anonymousClass092) {
        C09H c09h;
        C53962ho A14 = A14();
        if (!C003101m.A0Y(this.A0K)) {
            A14.A0A.setVisibility(0);
            if (anonymousClass092.A0n.A02) {
                if (C0D6.A00(anonymousClass092.A08, 4) >= 0) {
                    long j = anonymousClass092.A0D;
                    if (j <= 0) {
                        j = anonymousClass092.A0E;
                    }
                    A14.A0A.setText(AnonymousClass029.A0U(this.A0E, this.A0D.A06(j)));
                    return;
                } else if ((anonymousClass092 instanceof AnonymousClass097) && (c09h = ((AnonymousClass097) anonymousClass092).A02) != null && !c09h.A0P && !c09h.A0a) {
                    A14.A0A.setText(R.string.sending_status_failed);
                    return;
                } else {
                    A14.A0A.setText(R.string.sending_status_progress);
                    return;
                }
            }
            A14.A0A.setText(AnonymousClass029.A0U(this.A0E, this.A0D.A06(anonymousClass092.A0E)));
            return;
        }
        A14.A0A.setVisibility(8);
    }

    public final void A1D(AbstractC53822hZ abstractC53822hZ, int i, int i2) {
        for (AbstractC53822hZ abstractC53822hZ2 : ((AbstractMap) this.A0V.A06()).values()) {
            if (abstractC53822hZ2 != abstractC53822hZ) {
                C71703Xd.A00(abstractC53822hZ2, i);
            }
        }
        if (this.A0a != null) {
            if (abstractC53822hZ == null || abstractC53822hZ.A05) {
                return;
            }
            AbstractC53812hY abstractC53812hY = (AbstractC53812hY) abstractC53822hZ;
            ((AbstractC53822hZ) abstractC53812hY).A05 = true;
            abstractC53812hY.A0M(i2, abstractC53812hY.A06);
            return;
        }
        throw null;
    }

    @Override // X.C25J
    public void AJM(DialogFragment dialogFragment, boolean z) {
        this.A0T = z;
        A0z();
    }

    @Override // com.whatsapp.status.playback.fragment.StatusPlaybackFragment, X.C0BA, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AbstractC53822hZ A17 = A17();
        if (A17 != null) {
            A17.A01();
        }
    }

    @Override // X.C0BA
    public String toString() {
        UserJid userJid = this.A0K;
        if (userJid != null) {
            return userJid.getObfuscatedString();
        }
        String string = A02().getString("jid");
        if (string != null) {
            return string;
        }
        throw null;
    }
}
