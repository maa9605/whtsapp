package X;

import android.app.ActivityManager;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.Conversation;
import com.whatsapp.jobqueue.job.SendPlayedReceiptJob;
import com.whatsapp.jobqueue.job.SendWebForwardJob;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Og */
/* loaded from: classes.dex */
public final class C05330Og extends C00T {
    public static volatile C05330Og A0j;
    public boolean A00;
    public boolean A01;
    public final C04480Ki A02;
    public final C02L A03;
    public final C0F2 A04;
    public final C03320Ff A05;
    public final C05W A06;
    public final C47782Co A07;
    public final C462626b A08;
    public final C001200o A09;
    public final C000500h A0A;
    public final C06T A0B;
    public final C0DK A0C;
    public final C0C9 A0D;
    public final C0ET A0E;
    public final C0EV A0F;
    public final AnonymousClass074 A0G;
    public final C03880Hm A0H;
    public final C0ED A0I;
    public final C0HA A0J;
    public final C41461tx A0K;
    public final C43131wu A0L;
    public final C41601uD A0M;
    public final C42451vl A0N;
    public final C41701uN A0O;
    public final C47882Cy A0P;
    public final C47892Cz A0Q;
    public final C40291rx A0R;
    public final C0EN A0S;
    public final C41511u2 A0T;
    public final C0EG A0U;
    public final C41681uL A0V;
    public final C25w A0W;
    public final C2AV A0X;
    public final C41521u3 A0Y;
    public final C40301ry A0Z;
    public final C464626x A0a;
    public final C22I A0b;
    public final C05U A0c;
    public final C47872Cx A0d;
    public final C2AM A0e;
    public final C0H9 A0f;
    public final C41961un A0g;
    public final InterfaceC002901k A0h;
    public final C41981up A0i;

    public C05330Og(C001200o c001200o, C02L c02l, InterfaceC002901k interfaceC002901k, C41981up c41981up, C0EG c0eg, C0EN c0en, C05W c05w, C0ED c0ed, C41961un c41961un, C40291rx c40291rx, C2AM c2am, C41521u3 c41521u3, C04480Ki c04480Ki, C05U c05u, C47872Cx c47872Cx, C22I c22i, C03880Hm c03880Hm, C0H9 c0h9, C0C9 c0c9, C0HA c0ha, C41601uD c41601uD, C462626b c462626b, C06T c06t, C03320Ff c03320Ff, C0ET c0et, C0EV c0ev, C41511u2 c41511u2, C43131wu c43131wu, C40301ry c40301ry, C000500h c000500h, C42451vl c42451vl, C47882Cy c47882Cy, C47892Cz c47892Cz, C41701uN c41701uN, C41681uL c41681uL, C2AV c2av, C41461tx c41461tx, AnonymousClass074 anonymousClass074, C0DK c0dk, C0F2 c0f2, C25w c25w, C464626x c464626x, C47782Co c47782Co) {
        this.A09 = c001200o;
        this.A03 = c02l;
        this.A0h = interfaceC002901k;
        this.A0i = c41981up;
        this.A0U = c0eg;
        this.A0S = c0en;
        this.A06 = c05w;
        this.A0I = c0ed;
        this.A0g = c41961un;
        this.A0R = c40291rx;
        this.A0e = c2am;
        this.A0Y = c41521u3;
        this.A02 = c04480Ki;
        this.A0c = c05u;
        this.A0d = c47872Cx;
        this.A0b = c22i;
        this.A0H = c03880Hm;
        this.A0f = c0h9;
        this.A0D = c0c9;
        this.A0J = c0ha;
        this.A0M = c41601uD;
        this.A08 = c462626b;
        this.A0B = c06t;
        this.A05 = c03320Ff;
        this.A0E = c0et;
        this.A0F = c0ev;
        this.A0T = c41511u2;
        this.A0L = c43131wu;
        this.A0Z = c40301ry;
        this.A0A = c000500h;
        this.A0N = c42451vl;
        this.A0P = c47882Cy;
        this.A0Q = c47892Cz;
        this.A0O = c41701uN;
        this.A0V = c41681uL;
        this.A0X = c2av;
        this.A0K = c41461tx;
        this.A0G = anonymousClass074;
        this.A0C = c0dk;
        this.A04 = c0f2;
        this.A0W = c25w;
        this.A0a = c464626x;
        this.A07 = c47782Co;
    }

    public static C05330Og A00() {
        if (A0j == null) {
            synchronized (C05330Og.class) {
                if (A0j == null) {
                    A0j = new C05330Og(C001200o.A01, C02L.A00(), C002801j.A00(), C41981up.A00(), C0EG.A00(), C0EN.A00(), C05W.A00(), C0ED.A01(), C41961un.A0S(), C40291rx.A00(), C2AM.A00(), C41521u3.A00(), C04480Ki.A01, C05U.A01(), C47872Cx.A03, C22I.A00(), C03880Hm.A00(), C0H9.A00(), C0C9.A00(), C0HA.A00(), C41601uD.A00(), C462626b.A00(), C06T.A02, C03320Ff.A00, C0ET.A00(), C0EV.A00(), C41511u2.A00(), C43131wu.A00(), C40301ry.A00(), C000500h.A00(), C42451vl.A00(), C47882Cy.A00(), C47892Cz.A00(), C41701uN.A00(), C41681uL.A00(), C2AV.A00(), C41461tx.A00(), AnonymousClass074.A00(), C0DK.A00(), C0F2.A00(), C25w.A00(), C464626x.A00(), C47782Co.A00());
                }
            }
        }
        return A0j;
    }

    @Override // X.C00T
    public void A04() {
        if (this.A0F.A02()) {
            this.A0U.A07.A09(Message.obtain(null, 0, 22, 0, new Runnable() { // from class: X.1Hh
                {
                    C05330Og.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C05330Og.this.A0F.A01();
                }
            }));
        }
    }

    @Override // X.C00T
    public void A05(AbstractC005302j abstractC005302j) {
        this.A07.A00.remove(abstractC005302j);
    }

    @Override // X.C00T
    public void A06(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 != null) {
            StringBuilder A0P = C000200d.A0P("app/message/received/duplicate ");
            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
            String str = anonymousClass094.A01;
            A0P.append(str);
            A0P.append(" ");
            C02L c02l = this.A03;
            c02l.A05();
            A0P.append(c02l.A03);
            A0P.append(" ");
            AbstractC005302j abstractC005302j = anonymousClass094.A00;
            A0P.append(abstractC005302j);
            A0P.append(" ");
            A0P.append(anonymousClass092.A0A());
            Log.i(A0P.toString());
            if (!anonymousClass094.A02) {
                this.A0S.A02(anonymousClass092);
            } else if (anonymousClass092 instanceof C04360Jw) {
                C04360Jw c04360Jw = (C04360Jw) anonymousClass092;
                C04420Kc c04420Kc = c04360Jw.A04;
                if (c04420Kc != null) {
                    this.A0U.A0L(c04420Kc);
                } else if (((C04300Jq) c04360Jw).A00 != 6) {
                } else {
                    this.A0S.A09(str, anonymousClass092.A0s, abstractC005302j, null, "picture");
                }
            } else {
                EnumC03920Hs enumC03920Hs = anonymousClass092.A0J;
                if (enumC03920Hs != EnumC03920Hs.RELAY && enumC03920Hs != EnumC03920Hs.RETRY) {
                    return;
                }
                this.A0Y.A0F(str, 200);
                C0EN c0en = this.A0S;
                long j = anonymousClass092.A0s;
                c02l.A05();
                C0K1 c0k1 = c02l.A01;
                if (c0k1 != null) {
                    c0en.A09(str, j, c0k1.A09, null, "web");
                    return;
                }
                throw null;
            }
        }
    }

    @Override // X.C00T
    public void A07(AnonymousClass092 anonymousClass092, int i) {
        byte b;
        if (anonymousClass092.A0P != null && !this.A01 && (b = anonymousClass092.A0m) != 8 && b != 10 && System.currentTimeMillis() - anonymousClass092.A0E > 900000) {
            this.A01 = true;
            C40291rx c40291rx = this.A0R;
            if (c40291rx.A0G()) {
                C000500h c000500h = this.A0A;
                SharedPreferences sharedPreferences = c000500h.A00;
                C000200d.A0g(c000500h, "logins_with_messages", sharedPreferences.getInt("logins_with_messages", 0) + 1);
                sharedPreferences.getInt("logins_with_messages", 0);
                if (!c40291rx.A0G()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("long_connect", true);
                    c40291rx.A10.sendMessage(Message.obtain(null, 0, 3, 0, bundle));
                    c40291rx.A0D(true, false, false, false, 0);
                }
            }
        }
    }

    @Override // X.C00T
    public void A08(final AnonymousClass092 anonymousClass092, int i) {
        int i2;
        AnonymousClass097 anonymousClass097;
        C09H c09h;
        int i3;
        boolean z = false;
        switch (i) {
            case -1:
            case 24:
                AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                if (anonymousClass094.A02 && (i2 = anonymousClass092.A08) == 0) {
                    EnumC03920Hs enumC03920Hs = anonymousClass092.A0J;
                    if (enumC03920Hs == EnumC03920Hs.RETRY) {
                        anonymousClass092.A0J = EnumC03920Hs.NONE;
                        this.A0Y.A0F(anonymousClass094.A01, 408);
                        return;
                    } else if (enumC03920Hs == EnumC03920Hs.RELAY) {
                        return;
                    } else {
                        this.A0Y.A0B(anonymousClass094, i2);
                        return;
                    }
                } else if (anonymousClass092.A08 != 5 || !anonymousClass092.A14(4096)) {
                    return;
                } else {
                    this.A0h.AS1(new Runnable() { // from class: X.1Hk
                        {
                            C05330Og.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C05330Og.this.A0G(anonymousClass092);
                        }
                    });
                    return;
                }
            case 0:
            case 2:
            case 7:
            case 17:
            case C0M6.A01 /* 20 */:
            case 22:
            default:
                C000200d.A0r("app/messagechanged unknown type ", i);
                return;
            case 1:
            case 4:
                byte b = anonymousClass092.A0m;
                if (!C0DB.A0C(b) && !C0DB.A0E(b)) {
                    this.A0T.A01(anonymousClass092);
                    this.A0h.AS1(new Runnable() { // from class: X.1Hd
                        {
                            C05330Og.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C05330Og.this.A0F(anonymousClass092);
                        }
                    });
                    return;
                }
                C47892Cz c47892Cz = this.A0Q;
                if (c47892Cz != null) {
                    AnonymousClass094 anonymousClass0942 = anonymousClass092.A0n;
                    AbstractC005302j abstractC005302j = anonymousClass0942.A00;
                    if (abstractC005302j != null) {
                        C2D0 A01 = c47892Cz.A01(abstractC005302j);
                        synchronized (A01) {
                            if (!A01.A01.containsKey(anonymousClass0942)) {
                                A01.toString();
                                C47892Cz c47892Cz2 = A01.A02;
                                c47892Cz2.A00.A01(anonymousClass092);
                                c47892Cz2.A02.AS1(new RunnableEBaseShape3S0200000_I0_3(A01, anonymousClass092, 15));
                            } else {
                                A01.toString();
                                A01.A00.add(anonymousClass0942);
                                A01.A00();
                            }
                        }
                        return;
                    }
                    throw null;
                }
                throw null;
            case 3:
                if (!(anonymousClass092 instanceof AnonymousClass097) || (c09h = (anonymousClass097 = (AnonymousClass097) anonymousClass092).A02) == null || !c09h.A0P) {
                    return;
                }
                AbstractC005302j abstractC005302j2 = anonymousClass097.A0n.A00;
                if (C003101m.A0Z(abstractC005302j2)) {
                    return;
                }
                File file = c09h.A0F;
                if (file != null) {
                    C41961un c41961un = this.A0g;
                    if (c41961un != null) {
                        try {
                            if (c41961un.A01.A0T(file)) {
                                C0DD.A0N(c41961un.A06.A00, Uri.fromFile(file));
                            }
                        } catch (IOException e) {
                            C000200d.A12("mediafileurils/broadcastscanmediaintent/unable to scan file ", file, e);
                        }
                    } else {
                        throw null;
                    }
                }
                if (((C0OU) Conversation.A58.get()).A01(abstractC005302j2)) {
                    return;
                }
                if (anonymousClass097.A0m == 2 && ((AnonymousClass092) anonymousClass097).A04 == 1) {
                    C40301ry c40301ry = this.A0Z;
                    if (anonymousClass097.A0P != null && this.A00) {
                        z = true;
                    }
                    c40301ry.A09(anonymousClass097, z, true);
                    if (anonymousClass097.A0P == null) {
                        return;
                    }
                    this.A00 = true;
                    return;
                }
                this.A0Z.A0B(null, true, true, false, true, true);
                return;
            case 5:
                C40301ry c40301ry2 = this.A0Z;
                c40301ry2.A02().post(new RunnableEBaseShape3S0200000_I0_3(c40301ry2, anonymousClass092, 26));
                c40301ry2.A09(anonymousClass092, false, true);
                if (anonymousClass092 instanceof C0KC) {
                    C0KC c0kc = (C0KC) anonymousClass092;
                    this.A0K.A0a(c0kc, anonymousClass092.A0E + (c0kc.A00 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
                }
                if (anonymousClass092.A0C() instanceof C04040Ie) {
                    A0K(anonymousClass092);
                }
                if (!(anonymousClass092 instanceof C0KU)) {
                    return;
                }
                C03320Ff c03320Ff = this.A05;
                AbstractC005302j abstractC005302j3 = anonymousClass092.A0n.A00;
                if (abstractC005302j3 != null) {
                    c03320Ff.A02(abstractC005302j3);
                    return;
                }
                throw null;
            case 6:
            case 8:
            case 9:
            case 10:
            case GoogleMigrateImporterActivity.A0E /* 11 */:
            case 12:
            case 13:
            case 14:
            case 15:
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                C41521u3 c41521u3 = this.A0Y;
                C41981up c41981up = c41521u3.A0F;
                if (!c41981up.A04()) {
                    return;
                }
                String A03 = c41521u3.A0G.A03();
                c41521u3.A04.A00.A01(new SendWebForwardJob(A03, c41981up.A01().A03, Message.obtain(null, 0, 187, 0, new C0PU(anonymousClass092))));
                return;
            case 18:
            case 19:
                if (C002701i.A1R(anonymousClass092)) {
                    this.A0W.A02(anonymousClass092);
                }
                this.A0B.A01(new Runnable() { // from class: X.1Hm
                    {
                        C05330Og.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C05330Og.this.A0H(anonymousClass092);
                    }
                }, 8);
                return;
            case 21:
                if (C002701i.A1R(anonymousClass092)) {
                    this.A0W.A02(anonymousClass092);
                }
                this.A0B.A01(new Runnable() { // from class: X.1Hf
                    {
                        C05330Og.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C05330Og.this.A0I(anonymousClass092);
                    }
                }, 9);
                return;
            case 23:
                AnonymousClass094 anonymousClass0943 = anonymousClass092.A0n;
                if (!anonymousClass0943.A02 || (i3 = anonymousClass092.A08) != 7) {
                    return;
                }
                this.A0Y.A0B(anonymousClass0943, i3);
                return;
            case 25:
                final boolean A032 = C0G1.A03(anonymousClass092);
                this.A0E.A03(anonymousClass092.A0n, 9, new InterfaceC44251yl() { // from class: X.1hT
                    {
                        C05330Og.this = this;
                    }

                    @Override // X.InterfaceC44251yl
                    public final void AS0(Object obj) {
                        C05330Og c05330Og = C05330Og.this;
                        boolean z2 = A032;
                        AnonymousClass092 anonymousClass0922 = anonymousClass092;
                        AnonymousClass092 anonymousClass0923 = (AnonymousClass092) obj;
                        if (z2) {
                            C0EG c0eg = c05330Og.A0U;
                            boolean z3 = anonymousClass0922.A0J == EnumC03920Hs.RELAY;
                            if (c0eg != null) {
                                if (c0eg.A08.A00.A0C(361)) {
                                    c0eg.A0S(Collections.singleton(anonymousClass0923), z3);
                                    return;
                                } else {
                                    c0eg.A01.A01(new SendPlayedReceiptJob(anonymousClass0923));
                                    return;
                                }
                            }
                            throw null;
                        }
                    }
                });
                return;
            case 26:
                this.A0E.A03(anonymousClass092.A0n, 13, null);
                return;
        }
    }

    @Override // X.C00T
    public void A09(final AnonymousClass092 anonymousClass092, AnonymousClass092 anonymousClass0922) {
        if (anonymousClass092 != null && anonymousClass0922.A0m == 11) {
            C25w c25w = this.A0W;
            if (c25w != null) {
                if (C002701i.A1R(anonymousClass092)) {
                    if (c25w.A03.A04() && c25w.A04()) {
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add(anonymousClass092);
                        c25w.A03(null, arrayList, 4, false, false, null, null, 4, null, null);
                    }
                    this.A0B.A01(new Runnable() { // from class: X.1Hg
                        {
                            C05330Og.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C05330Og.this.A0J(anonymousClass092);
                        }
                    }, 11);
                } else {
                    throw new IllegalArgumentException("message thumb not loaded");
                }
            } else {
                throw null;
            }
        }
        this.A0J.A07(anonymousClass0922, 3);
    }

    @Override // X.C00T
    public void A0A(Collection collection, AbstractC005302j abstractC005302j, final Map map, final boolean z) {
        if (map != null) {
            final HashMap hashMap = new HashMap();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
                AbstractC005302j abstractC005302j2 = anonymousClass092.A0n.A00;
                Collection collection2 = (Collection) hashMap.get(abstractC005302j2);
                if (collection2 == null) {
                    collection2 = new ArrayList();
                    hashMap.put(abstractC005302j2, collection2);
                }
                collection2.add(anonymousClass092);
            }
            this.A0h.AS1(new Runnable() { // from class: X.1Hj
                {
                    C05330Og.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C05330Og.this.A0P(hashMap, map, z);
                }
            });
        }
    }

    @Override // X.C00T
    public void A0B(Collection collection, Map map, Map map2) {
        if (map != null) {
            if (map2 != null) {
                HashSet hashSet = new HashSet();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    hashSet.add(((AnonymousClass092) it.next()).A0n.A00);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    AbstractC005302j abstractC005302j = (AbstractC005302j) it2.next();
                    Object obj = map.get(abstractC005302j);
                    if (obj != null) {
                        int intValue = ((Number) obj).intValue();
                        Object obj2 = map2.get(abstractC005302j);
                        if (obj2 != null) {
                            arrayList.add(new C03950Hv(abstractC005302j, intValue, ((Number) obj2).longValue() + 1000) { // from class: X.2D1
                                {
                                    this.A00 = intValue;
                                    this.A05 = r4;
                                }
                            });
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                }
                this.A0Y.A0I(arrayList, null);
            } else {
                HashMap hashMap = new HashMap();
                Iterator it3 = collection.iterator();
                while (it3.hasNext()) {
                    AnonymousClass092 anonymousClass092 = (AnonymousClass092) it3.next();
                    AbstractC005302j abstractC005302j2 = anonymousClass092.A0n.A00;
                    Collection collection2 = (Collection) hashMap.get(abstractC005302j2);
                    if (collection2 == null) {
                        collection2 = new ArrayList();
                        hashMap.put(abstractC005302j2, collection2);
                    }
                    collection2.add(anonymousClass092);
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    Object obj3 = map.get(entry.getKey());
                    if (obj3 != null) {
                        this.A0Y.A06((AbstractC005302j) entry.getKey(), (Collection) entry.getValue(), ((Number) obj3).intValue());
                    } else {
                        throw null;
                    }
                }
            }
        }
        Iterator it4 = collection.iterator();
        while (it4.hasNext()) {
            C47782Co c47782Co = this.A07;
            AbstractC005302j abstractC005302j3 = ((AnonymousClass092) it4.next()).A0n.A00;
            if (abstractC005302j3 != null) {
                c47782Co.A00.remove(abstractC005302j3);
            } else {
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:339:0x0179, code lost:
        if (r20.A00 == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x01fe, code lost:
        if (r20.A00 == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x037f, code lost:
        if (r9.A01 != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0399, code lost:
        if (((X.C04300Jq) r21).A00 == 42) goto L187;
     */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0385  */
    @Override // X.C00T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0C(final X.AnonymousClass092 r21, int r22) {
        /*
            Method dump skipped, instructions count: 1137
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05330Og.A0C(X.092, int):void");
    }

    public final void A0D(long j) {
        C47872Cx c47872Cx = this.A0d;
        if (!c47872Cx.A02 && j > 900000 && this.A0R.A0G()) {
            RegistrationIntentService.A01(this.A09.A00);
            C462626b c462626b = this.A08;
            if (c462626b != null) {
                try {
                    ActivityManager A01 = c462626b.A00.A01();
                    if (A01 == null) {
                        Log.i("app/logprocess am=null");
                    } else {
                        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = A01.getRunningAppProcesses();
                        if (runningAppProcesses != null) {
                            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                                if (TextUtils.equals(runningAppProcessInfo.processName, "com.google.process.gapps")) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("app/logprocess/procinfo ");
                                    sb.append(runningAppProcessInfo.processName);
                                    sb.append(' ');
                                    sb.append(runningAppProcessInfo.pid);
                                    Log.i(sb.toString());
                                    break;
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    Log.w("app/logprocess/error", e);
                }
                c47872Cx.A02 = true;
                return;
            }
            throw null;
        }
    }

    public /* synthetic */ void A0E(C06C c06c) {
        this.A06.A0I(c06c);
        this.A0V.A03(c06c);
    }

    public void A0F(AnonymousClass092 anonymousClass092) {
        C2AV c2av = this.A0X;
        c2av.A0G.A01(anonymousClass092);
        c2av.A0C.A02(anonymousClass092);
    }

    public void A0G(AnonymousClass092 anonymousClass092) {
        this.A0G.A03(anonymousClass092);
        C2AV c2av = this.A0X;
        c2av.A0G.A01(anonymousClass092);
        c2av.A0C.A02(anonymousClass092);
    }

    public void A0H(AnonymousClass092 anonymousClass092) {
        C03880Hm c03880Hm = this.A0H;
        AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
        if (abstractC005302j != null) {
            int A01 = c03880Hm.A01(abstractC005302j);
            if (A01 != -1) {
                this.A0Y.A01(10, abstractC005302j, 0L, A01);
                return;
            }
            return;
        }
        throw null;
    }

    public void A0I(AnonymousClass092 anonymousClass092) {
        C03880Hm c03880Hm = this.A0H;
        AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
        if (abstractC005302j != null) {
            int A01 = c03880Hm.A01(abstractC005302j);
            if (A01 != -1) {
                this.A0Y.A01(10, abstractC005302j, 0L, A01);
                return;
            }
            return;
        }
        throw null;
    }

    public void A0J(AnonymousClass092 anonymousClass092) {
        C03880Hm c03880Hm = this.A0H;
        AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
        if (abstractC005302j != null) {
            int A01 = c03880Hm.A01(abstractC005302j);
            if (A01 != -1) {
                this.A0Y.A01(10, abstractC005302j, 0L, A01);
                return;
            }
            return;
        }
        throw null;
    }

    public final void A0K(final AnonymousClass092 anonymousClass092) {
        C04040Ie c04040Ie = (C04040Ie) anonymousClass092.A0C();
        if (c04040Ie != null) {
            AnonymousClass092 A0F = this.A0D.A0F(c04040Ie.A0n);
            if (A0F == null) {
                this.A0M.A03(c04040Ie, 1, new InterfaceC04070Ih() { // from class: X.0Pg
                    @Override // X.InterfaceC04070Ih
                    public void AJX(boolean z) {
                    }

                    {
                        C05330Og.this = this;
                    }

                    @Override // X.InterfaceC04070Ih
                    public void AJY(C04020Ic c04020Ic, C43211x2 c43211x2) {
                        if (c04020Ic.A02()) {
                            C05330Og.this.A0D.A0U(anonymousClass092);
                        }
                    }
                }, false);
            } else if (A0F instanceof AnonymousClass097) {
                C43221x3 A02 = this.A0N.A02((AnonymousClass097) A0F);
                if (A02 != null) {
                    A02.A59(new C05580Ph(this, c04040Ie, anonymousClass092));
                } else {
                    Log.e("MainMessageObserver/downloadQuotedMessageForSticker original downloader is null");
                }
            } else {
                StringBuilder A0P = C000200d.A0P("MainMessageObserver/downloadQuotedMessageForSticker originalMessage not mediaMessage: ");
                A0P.append(A0F.getClass().getName());
                Log.e(A0P.toString());
            }
        }
    }

    public /* synthetic */ void A0L(AnonymousClass092 anonymousClass092) {
        this.A0X.A03(anonymousClass092);
    }

    public /* synthetic */ void A0M(AnonymousClass092 anonymousClass092) {
        this.A0X.A03(anonymousClass092);
    }

    public /* synthetic */ void A0N(AnonymousClass092 anonymousClass092) {
        this.A0X.A03(anonymousClass092);
    }

    public /* synthetic */ void A0O(AnonymousClass097 anonymousClass097) {
        this.A0L.A04(C0E3.A04(anonymousClass097, this.A0I), C0E3.A02(anonymousClass097));
        this.A0O.A01(anonymousClass097);
        this.A0M.A02(anonymousClass097);
    }

    public /* synthetic */ void A0P(HashMap hashMap, Map map, boolean z) {
        for (Map.Entry entry : hashMap.entrySet()) {
            Number number = (Number) map.get(entry.getKey());
            this.A0X.A02((AbstractC005302j) entry.getKey(), z, (Collection) entry.getValue(), number == null ? 0 : number.intValue());
        }
    }
}
