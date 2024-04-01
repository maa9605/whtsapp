package X;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Message;
import android.util.Pair;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.Conversation;
import com.whatsapp.SpamWarningActivity;
import com.whatsapp.service.GcmFGService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* renamed from: X.224 */
/* loaded from: classes2.dex */
public class AnonymousClass224 implements C0KL {
    public static volatile AnonymousClass224 A0z;
    public final C01L A00;
    public final AbstractC000600i A01;
    public final C018508q A02;
    public final C05330Og A03;
    public final C02L A04;
    public final C0E3 A05;
    public final C0E4 A06;
    public final C0E5 A07;
    public final C01B A08;
    public final C0EP A09;
    public final C0E6 A0A;
    public final C010005b A0B;
    public final C06K A0C;
    public final C450920j A0D;
    public final C41541u6 A0E;
    public final C05W A0F;
    public final AnonymousClass075 A0G;
    public final C462626b A0H;
    public final AnonymousClass012 A0I;
    public final C001200o A0J;
    public final C005102h A0K;
    public final C000500h A0L;
    public final C002301c A0M;
    public final C0CA A0N;
    public final C0C9 A0O;
    public final C22O A0P;
    public final C05E A0Q;
    public final C013306k A0R;
    public final C013606n A0S;
    public final C003701t A0T;
    public final AnonymousClass011 A0U;
    public final C26c A0V;
    public final C00S A0W;
    public final C41771uU A0X;
    public final C010605h A0Y;
    public final C009905a A0Z;
    public final C05Y A0a;
    public final C40291rx A0b;
    public final C2E4 A0c;
    public final C0EG A0d;
    public final C40301ry A0e;
    public final C0DV A0f;
    public final C464526w A0g;
    public final C47232Ak A0h;
    public final C26Y A0i;
    public final C22I A0j;
    public final C2AU A0k;
    public final C0KR A0l;
    public final C22P A0m;
    public final C05U A0n;
    public final C47872Cx A0o;
    public final C42151vF A0p;
    public final C2Aa A0q;
    public final C0IY A0r;
    public final C0ER A0s;
    public final C0EZ A0t;
    public final C03070Ea A0u;
    public final C03510Fz A0v;
    public final C0HC A0w = new C0HC(true);
    public final InterfaceC002901k A0x;
    public final C43361xH A0y;

    public AnonymousClass224(C001200o c001200o, AnonymousClass012 anonymousClass012, C003701t c003701t, C018508q c018508q, AbstractC000600i abstractC000600i, C02L c02l, C03070Ea c03070Ea, InterfaceC002901k interfaceC002901k, C47392Ba c47392Ba, AnonymousClass011 anonymousClass011, C0EG c0eg, C01B c01b, C41541u6 c41541u6, C43361xH c43361xH, C01L c01l, C42151vF c42151vF, C0EN c0en, C0E6 c0e6, C05300Od c05300Od, C05Y c05y, C0IY c0iy, C05W c05w, C40291rx c40291rx, C0E3 c0e3, C01R c01r, C0EP c0ep, C002301c c002301c, C05U c05u, C47872Cx c47872Cx, C26Y c26y, C22I c22i, C0DV c0dv, C03290Fc c03290Fc, C40261rr c40261rr, AnonymousClass008 anonymousClass008, C0C9 c0c9, C03510Fz c03510Fz, C0ER c0er, C009905a c009905a, C00A c00a, C0E4 c0e4, C010005b c010005b, C03940Hu c03940Hu, C04g c04g, C41601uD c41601uD, C47232Ak c47232Ak, C01J c01j, C462626b c462626b, C22P c22p, C03320Ff c03320Ff, C41321tj c41321tj, C26c c26c, AnonymousClass271 anonymousClass271, C41291tg c41291tg, C0EJ c0ej, C05330Og c05330Og, C40301ry c40301ry, C05E c05e, C0KR c0kr, C2AU c2au, C2Aa c2Aa, AnonymousClass075 anonymousClass075, C000500h c000500h, C0CA c0ca, C41401tr c41401tr, C0EZ c0ez, C41911ui c41911ui, C0E5 c0e5, C005102h c005102h, C06K c06k, C013606n c013606n, C464526w c464526w, C41501u1 c41501u1, C26S c26s, AbstractC465527h abstractC465527h, C22O c22o, C00S c00s, C013306k c013306k, C41771uU c41771uU, C06M c06m, C0DK c0dk, C010605h c010605h, C450920j c450920j, C2E3 c2e3) {
        this.A0J = c001200o;
        this.A0I = anonymousClass012;
        this.A0T = c003701t;
        this.A02 = c018508q;
        this.A01 = abstractC000600i;
        this.A04 = c02l;
        this.A0u = c03070Ea;
        this.A0x = interfaceC002901k;
        this.A0U = anonymousClass011;
        this.A0d = c0eg;
        this.A08 = c01b;
        this.A0E = c41541u6;
        this.A0y = c43361xH;
        this.A00 = c01l;
        this.A0p = c42151vF;
        this.A0A = c0e6;
        this.A0a = c05y;
        this.A0r = c0iy;
        this.A0F = c05w;
        this.A05 = c0e3;
        this.A0b = c40291rx;
        this.A09 = c0ep;
        this.A0M = c002301c;
        this.A0n = c05u;
        this.A0o = c47872Cx;
        this.A0i = c26y;
        this.A0f = c0dv;
        this.A0j = c22i;
        this.A0O = c0c9;
        this.A0v = c03510Fz;
        this.A0s = c0er;
        this.A0Z = c009905a;
        this.A06 = c0e4;
        this.A0B = c010005b;
        this.A0h = c47232Ak;
        this.A0H = c462626b;
        this.A0m = c22p;
        this.A0V = c26c;
        this.A03 = c05330Og;
        this.A0e = c40301ry;
        this.A0Q = c05e;
        this.A0l = c0kr;
        this.A0k = c2au;
        this.A0q = c2Aa;
        this.A0G = anonymousClass075;
        this.A0L = c000500h;
        this.A0N = c0ca;
        this.A0t = c0ez;
        this.A07 = c0e5;
        this.A0K = c005102h;
        this.A0C = c06k;
        this.A0S = c013606n;
        this.A0P = c22o;
        this.A0W = c00s;
        this.A0R = c013306k;
        this.A0X = c41771uU;
        this.A0Y = c010605h;
        this.A0D = c450920j;
        this.A0g = c464526w;
        this.A0c = new C2E4(c003701t, c001200o, c018508q, abstractC000600i, c02l, interfaceC002901k, c47392Ba, c0eg, c01b, c0en, c05300Od, c05w, c40291rx, c01r, c002301c, c05u, c0dv, c22i, c03290Fc, c0c9, c00a, c03940Hu, c04g, c41601uD, c01j, c03320Ff, c41321tj, anonymousClass271, c41291tg, c0ej, anonymousClass075, c41401tr, c0ez, c41911ui, c41501u1, c06k, c013606n, c26s, abstractC465527h, c06m, c0dk, c2e3);
    }

    public static AnonymousClass224 A00() {
        if (A0z == null) {
            synchronized (AnonymousClass224.class) {
                if (A0z == null) {
                    C001200o c001200o = C001200o.A01;
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C003701t A002 = C003701t.A00();
                    C018508q A003 = C018508q.A00();
                    AbstractC000600i A004 = AbstractC000600i.A00();
                    C02L A005 = C02L.A00();
                    C03070Ea A006 = C03070Ea.A00();
                    InterfaceC002901k A007 = C002801j.A00();
                    C47392Ba A01 = C47392Ba.A01();
                    AnonymousClass011 A008 = AnonymousClass011.A00();
                    C0EG A009 = C0EG.A00();
                    C01B A0010 = C01B.A00();
                    C41541u6 A0011 = C41541u6.A00();
                    C43361xH A0012 = C43361xH.A00();
                    C01L A0013 = C01L.A00();
                    C42151vF A0014 = C42151vF.A00();
                    C0EN A0015 = C0EN.A00();
                    C0E6 A0016 = C0E6.A00();
                    C05300Od A0017 = C05300Od.A00();
                    C05Y A012 = C05Y.A01();
                    C0IY A0018 = C0IY.A00();
                    C05W A0019 = C05W.A00();
                    C40291rx A0020 = C40291rx.A00();
                    C0E3 A06 = C0E3.A06();
                    C01R c01r = C01R.A02;
                    C0EP A0021 = C0EP.A00();
                    C002301c A0022 = C002301c.A00();
                    C05U A013 = C05U.A01();
                    C47872Cx c47872Cx = C47872Cx.A03;
                    C26Y c26y = C26Y.A01;
                    C22I A0023 = C22I.A00();
                    C0DV A0024 = C0DV.A00();
                    C03290Fc A0025 = C03290Fc.A00();
                    C40261rr A0026 = C40261rr.A00();
                    AnonymousClass008 anonymousClass008 = AnonymousClass008.A01;
                    C0C9 A0027 = C0C9.A00();
                    C03510Fz c03510Fz = C03510Fz.A03;
                    C0ER A0028 = C0ER.A00();
                    C009905a c009905a = C009905a.A02;
                    C00A c00a = C00A.A00;
                    C0E4 A0029 = C0E4.A00();
                    C010005b c010005b = C010005b.A07;
                    C03940Hu A0030 = C03940Hu.A00();
                    C04g A0031 = C04g.A00();
                    C41601uD A0032 = C41601uD.A00();
                    C47232Ak A0033 = C47232Ak.A00();
                    C01J A0034 = C01J.A00();
                    C462626b A0035 = C462626b.A00();
                    C22P A0036 = C22P.A00();
                    C03320Ff c03320Ff = C03320Ff.A00;
                    C41321tj A0037 = C41321tj.A00();
                    C26c A0038 = C26c.A00();
                    AnonymousClass271 A0039 = AnonymousClass271.A00();
                    C41291tg A0040 = C41291tg.A00();
                    C0EJ A0041 = C0EJ.A00();
                    C05330Og A0042 = C05330Og.A00();
                    C40301ry A0043 = C40301ry.A00();
                    C05E A0044 = C05E.A00();
                    C0KR A0045 = C0KR.A00();
                    C2AU A0046 = C2AU.A00();
                    C2Aa A0047 = C2Aa.A00();
                    AnonymousClass075 A0048 = AnonymousClass075.A00();
                    C000500h A0049 = C000500h.A00();
                    C0CA A0050 = C0CA.A00();
                    C41401tr A014 = C41401tr.A01();
                    C0EZ A0051 = C0EZ.A00();
                    C41911ui A0052 = C41911ui.A00();
                    C0E5 A0053 = C0E5.A00();
                    C005102h A0054 = C005102h.A00();
                    C06K A0055 = C06K.A00();
                    C013606n A03 = C013606n.A03();
                    C464526w A0056 = C464526w.A00();
                    C41501u1 A0057 = C41501u1.A00();
                    C26S A0058 = C26S.A00();
                    AbstractC465527h A0059 = AbstractC465527h.A00();
                    if (C22O.A03 == null) {
                        synchronized (C22O.class) {
                            if (C22O.A03 == null) {
                                C22O.A03 = new C22O(C05Q.A00(), C05F.A01, C05E.A00());
                            }
                        }
                    }
                    C22O c22o = C22O.A03;
                    C00S c00s = C00S.A00;
                    if (c00s != null) {
                        A0z = new AnonymousClass224(c001200o, A00, A002, A003, A004, A005, A006, A007, A01, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A012, A0018, A0019, A0020, A06, c01r, A0021, A0022, A013, c47872Cx, c26y, A0023, A0024, A0025, A0026, anonymousClass008, A0027, c03510Fz, A0028, c009905a, c00a, A0029, c010005b, A0030, A0031, A0032, A0033, A0034, A0035, A0036, c03320Ff, A0037, A0038, A0039, A0040, A0041, A0042, A0043, A0044, A0045, A0046, A0047, A0048, A0049, A0050, A014, A0051, A0052, A0053, A0054, A0055, A03, A0056, A0057, A0058, A0059, c22o, c00s, C013306k.A07(), C41771uU.A00(), C06M.A00, C0DK.A00(), C010605h.A03, C450920j.A00(), C2E3.A00());
                    } else {
                        throw null;
                    }
                }
            }
        }
        return A0z;
    }

    public final void A01() {
        C0B5 c0b5 = this.A02.A00;
        if (c0b5 == null || !AnonymousClass088.A24(c0b5, this.A0b, this.A0e)) {
            StringBuilder A0P = C000200d.A0P("message-handler-callback/handlerconnected/displaysoftwareexpired/notification ");
            A0P.append(new Date().toString());
            A0P.append(" ");
            A0P.append(System.currentTimeMillis());
            Log.w(A0P.toString());
            Application application = this.A0J.A00;
            C02180Ae.A0y(application, this.A0K, application.getString(R.string.expiry_notification_title, application.getString(R.string.localized_app_name)), application.getString(R.string.software_expired_get_from_play, application.getString(R.string.localized_app_name)), 2);
            this.A0e.A03 = true;
        }
    }

    public final void A02() {
        C010005b c010005b = this.A0B;
        if (c010005b.A02) {
            if (this.A02 != null) {
                C000500h c000500h = this.A0L;
                c000500h.A0i(false, 0L);
                C000200d.A0j(c000500h, "underage_account_banned", false);
                return;
            }
            throw null;
        } else if (c010005b.A03) {
            if (this.A02 != null) {
                SpamWarningActivity.A02.open();
                return;
            }
            throw null;
        } else if (this.A02 != null) {
            SpamWarningActivity.A02.close();
            SharedPreferences sharedPreferences = this.A0L.A00;
            if (!sharedPreferences.getBoolean("spam_banned", false)) {
                return;
            }
            Application application = this.A0J.A00;
            Intent intent = new Intent(null, null, application, SpamWarningActivity.class);
            intent.setFlags(268435456);
            long j = sharedPreferences.getLong("spam_banned_expiry_timestamp", -1L);
            if (j != -1) {
                j = (j - System.currentTimeMillis()) / 1000;
            }
            intent.putExtra("expiry_in_seconds", (int) (j > 0 ? j : -1L));
            application.startActivity(intent);
        } else {
            throw null;
        }
    }

    @Override // X.C0KL
    public void AM3(List list, int i) {
        StringBuilder sb = new StringBuilder("message-handler-callback/onMessageHandlerAckTimeout/keys:");
        sb.append(list);
        Log.i(sb.toString());
        this.A0x.AS1(new C3M2(this, list, i, this.A0I.A05()));
    }

    @Override // X.C0KL
    public void AM4() {
        Log.i("message-handler-callback/handlerconnected/handleclockwrong");
        C0ER c0er = this.A0s;
        C001200o c001200o = this.A0J;
        c0er.A02(c001200o.A00, GcmFGService.class);
        C0B5 c0b5 = this.A02.A00;
        if (c0b5 == null || !AnonymousClass088.A23(c0b5, this.A0b, this.A0e)) {
            StringBuilder A0P = C000200d.A0P("message-handler-callback/handlerconnected/displayclockwrong/notification ");
            A0P.append(new Date().toString());
            A0P.append(" ");
            A0P.append(System.currentTimeMillis());
            Log.w(A0P.toString());
            Application application = c001200o.A00;
            C02180Ae.A0y(application, this.A0K, application.getString(R.string.error_notification_title), application.getString(R.string.clock_wrong), 8);
            this.A0e.A03 = true;
        }
    }

    @Override // X.C0KL
    public void AM5(boolean z) {
        final int nextInt;
        AbstractC005302j abstractC005302j;
        boolean containsKey;
        C000700j.A01();
        this.A0w.A03();
        C010005b c010005b = this.A0B;
        c010005b.A03 = false;
        c010005b.A02 = true;
        c010005b.A05 = z;
        C000700j.A01();
        synchronized (c010005b) {
            for (C0QV c0qv : c010005b.A04) {
                c0qv.AKw();
            }
        }
        C05330Og c05330Og = this.A03;
        c05330Og.A00 = false;
        this.A0o.A02 = false;
        c05330Og.A01 = false;
        C009905a c009905a = this.A0Z;
        Map map = c009905a.A01;
        synchronized (map) {
            map.clear();
        }
        C0E5 c0e5 = this.A07;
        synchronized (c0e5) {
            c0e5.A06.clear();
        }
        C0E4 c0e4 = this.A06;
        synchronized (c0e4) {
            c0e4.A02 = false;
            c0e4.A00 = 0L;
            c0e4.A06(0L);
        }
        A02();
        C0IY c0iy = this.A0r;
        c0iy.A02 = true;
        c0iy.A07();
        InterfaceC002901k interfaceC002901k = this.A0x;
        interfaceC002901k.AS1(new RunnableEBaseShape4S0100000_I0_4(this, 22));
        interfaceC002901k.AS1(new RunnableEBaseShape4S0100000_I0_4(this, 18));
        interfaceC002901k.AS1(new RunnableEBaseShape4S0100000_I0_4(this, 24));
        C05E c05e = this.A0Q;
        if (c05e.A00) {
            final C41771uU c41771uU = this.A0X;
            final RunnableEBaseShape4S0100000_I0_4 runnableEBaseShape4S0100000_I0_4 = new RunnableEBaseShape4S0100000_I0_4(this, 21);
            C47892Cz c47892Cz = c41771uU.A0H;
            synchronized (c47892Cz) {
                c47892Cz.A03.clear();
            }
            final ArrayList arrayList = new ArrayList();
            synchronized (c41771uU.A0J) {
                for (Map.Entry entry : c41771uU.A0K.entrySet()) {
                    C455422m c455422m = c41771uU.A0F;
                    Object value = entry.getValue();
                    synchronized (c455422m) {
                        containsKey = c455422m.A01.containsKey(value);
                    }
                    if (containsKey) {
                        arrayList.addAll(Collections.unmodifiableList(((C04130Ir) entry.getKey()).A01));
                    }
                }
            }
            C2E5 c2e5 = new C2E5(c41771uU, arrayList);
            c41771uU.A0I.AS1(c2e5);
            ((C0CI) c2e5).A01.A03(new C0CG() { // from class: X.3FF
                @Override // X.C0CG
                public final void A54(Object obj) {
                    C41771uU c41771uU2 = c41771uU;
                    List<AnonymousClass097> list = arrayList;
                    Runnable runnable = runnableEBaseShape4S0100000_I0_4;
                    for (AnonymousClass097 anonymousClass097 : list) {
                        if (C48292Er.A00(anonymousClass097, true)) {
                            c41771uU2.A05.A05(anonymousClass097, -1);
                        }
                    }
                    runnable.run();
                }
            }, c41771uU.A0L);
        }
        C05Y c05y = this.A0a;
        C05Z c05z = c05y.A06;
        if (c05z != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = c05z.A00;
            synchronized (linkedHashMap2) {
                Iterator it = linkedHashMap2.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    if (((Integer) ((Pair) entry2.getValue()).second).intValue() < 3) {
                        linkedHashMap.put(entry2.getKey(), ((Pair) entry2.getValue()).first);
                    } else {
                        it.remove();
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unacked-messages/getUnackedMessages: ");
                sb.append(linkedHashMap.size());
                Log.i(sb.toString());
            }
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                c05y.A0A((Message) entry3.getValue(), (String) entry3.getKey(), true);
            }
            C22I c22i = this.A0j;
            if (c22i != null) {
                Set set = c22i.A05;
                HashSet hashSet = new HashSet(set);
                set.clear();
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    c22i.A07((AbstractC005302j) it2.next());
                }
                List<C0QW> list = c009905a.A00;
                synchronized (list) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("in-flight-messages/for-each/send-pending-requests: ");
                    sb2.append(list.size());
                    Log.i(sb2.toString());
                    for (C0QW c0qw : list) {
                        String str = c0qw.A01;
                        Message message = c0qw.A00;
                        if (c0qw.A02) {
                            c05y.A0A(message, str, true);
                        } else {
                            c05y.A0A(message, str, false);
                        }
                    }
                    list.clear();
                }
                C26Y c26y = this.A0i;
                if (!c26y.A01()) {
                    C0OU c0ou = (C0OU) Conversation.A58.get();
                    if (c0ou.A02 && (abstractC005302j = (AbstractC005302j) c0ou.A00().A2D.A03(AbstractC005302j.class)) != null) {
                        c22i.A07(abstractC005302j);
                    }
                }
                boolean z2 = c010005b.A01;
                boolean A01 = c26y.A01();
                if (z2 == A01) {
                    C2AU c2au = this.A0k;
                    if (!A01) {
                        c2au.A00 = true;
                        c2au.A01();
                    } else {
                        c2au.A00 = false;
                        c2au.A02();
                    }
                }
                C000500h c000500h = this.A0L;
                SharedPreferences sharedPreferences = c000500h.A00;
                if (sharedPreferences.getBoolean("future_proof_processing_needed", false)) {
                    c05e.A05();
                    if (c05e.A01) {
                        interfaceC002901k.AS3(new RunnableEBaseShape4S0100000_I0_4(this, 23), "MessageHandlerCallback/processFutureMessages");
                    }
                }
                if (sharedPreferences.getBoolean("client_version_upgraded", false)) {
                    c05e.A05();
                    if (c05e.A01) {
                        interfaceC002901k.AS1(new RunnableEBaseShape4S0100000_I0_4(this, 19));
                    }
                    interfaceC002901k.AS1(new RunnableEBaseShape4S0100000_I0_4(this, 20));
                    C41541u6 c41541u6 = this.A0E;
                    if (c41541u6.A0T.A02()) {
                        c41541u6.A0V.AS1(new RunnableEBaseShape1S0100000_I0_1(c41541u6.A0H, 32));
                    }
                    C000200d.A0f(c000500h, "client_version_upgraded");
                }
                C03070Ea c03070Ea = this.A0u;
                synchronized (c03070Ea) {
                    C000500h c000500h2 = c03070Ea.A02;
                    SharedPreferences sharedPreferences2 = c000500h2.A00;
                    int i = sharedPreferences2.getInt("tos_v2_current_stage_id", 0);
                    if (i != 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("tos_v2_stage_start_ack");
                        sb3.append(i);
                        if (!sharedPreferences2.getBoolean(sb3.toString(), false) && c03070Ea.A03.A0C(Message.obtain(null, 0, 99, i))) {
                            C000200d.A0q("tosupdate/send/stage ", i);
                        }
                    }
                    if (c000500h2.A09() != 0 && !sharedPreferences2.getBoolean("tos_v2_accepted_ack", false)) {
                        c03070Ea.A03();
                    }
                }
                this.A0Y.A02(true);
                final AnonymousClass011 anonymousClass011 = this.A0U;
                Runnable runnable = new Runnable() { // from class: X.1PG
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass011 anonymousClass0112 = anonymousClass011;
                        if (anonymousClass0112.A0H()) {
                            anonymousClass0112.A07.ASO(anonymousClass0112.A02, false);
                        }
                        if (anonymousClass0112.A0F()) {
                            anonymousClass0112.A07.ASO(anonymousClass0112.A00, false);
                        }
                    }
                };
                C005902q c005902q = anonymousClass011.A0F;
                c005902q.A01.execute(runnable);
                if (anonymousClass011.A0K) {
                    if (anonymousClass011.A0J > 0 && (nextInt = new Random().nextInt(anonymousClass011.A0J) + 5) > 0) {
                        c005902q.A02.A02(new Runnable() { // from class: X.1PB
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass011 anonymousClass0112 = anonymousClass011;
                                int i2 = nextInt;
                                if (anonymousClass0112.A0G()) {
                                    anonymousClass0112.A06.ASP(anonymousClass0112.A01, false, false, i2);
                                }
                            }
                        }, nextInt * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
                        return;
                    } else {
                        c005902q.A02.execute(new Runnable() { // from class: X.1PH
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass011 anonymousClass0112 = anonymousClass011;
                                if (anonymousClass0112.A0G()) {
                                    anonymousClass0112.A06.ASO(anonymousClass0112.A01, false);
                                }
                            }
                        });
                        return;
                    }
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.C0KL
    public void AM6() {
        C010005b c010005b = this.A0B;
        c010005b.A03 = true;
        c010005b.A00++;
        c010005b.A01 = false;
        C000700j.A01();
        synchronized (c010005b) {
            Iterator it = c010005b.A04.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a4, code lost:
        if (android.os.SystemClock.elapsedRealtime() >= r4) goto L28;
     */
    @Override // X.C0KL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AM7() {
        /*
            r8 = this;
            X.05b r3 = r8.A0B
            boolean r2 = r3.A02
            r6 = 0
            r3.A03 = r6
            r3.A02 = r6
            r3.A05 = r6
            X.C000700j.A01()
            monitor-enter(r3)
            java.util.List r0 = r3.A04     // Catch: java.lang.Throwable -> Lb0
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> Lb0
        L15:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Lb0
            if (r0 == 0) goto L25
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> Lb0
            X.0QV r0 = (X.C0QV) r0     // Catch: java.lang.Throwable -> Lb0
            r0.AKx()     // Catch: java.lang.Throwable -> Lb0
            goto L15
        L25:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb0
            X.2AU r7 = r8.A0k
            r7.A00 = r6
            X.2Cx r3 = r8.A0o
            r3.A01 = r6
            r0 = 0
            r3.A00 = r0
            r8.A02()
            X.0IY r1 = r8.A0r
            r1.A02 = r6
            java.lang.String r0 = "routeselector/cancelrouterequesttimer"
            com.whatsapp.util.Log.i(r0)
            android.os.Handler r0 = r1.A04
            r0.removeMessages(r6)
            X.26b r0 = r8.A0H
            r0.A01()
            X.22I r0 = r8.A0j
            r0.A05()
            if (r2 == 0) goto L60
            X.0Fz r1 = r8.A0v
            X.0G0 r0 = r1.A00
            r0.A00()
            X.0G0 r0 = r1.A01
            r0.A00()
            X.0G0 r0 = r1.A02
            r0.A00()
        L60:
            X.26Y r1 = r8.A0i
            boolean r0 = r1.A02()
            if (r0 == 0) goto L8b
            X.2Ak r2 = r8.A0h
            X.2Az r0 = r2.A05
            r0.A00()
            java.lang.String r1 = "presencestatemanager/setUnavailable previous-state: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            X.26Y r1 = r2.A06
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i(r0)
            r0 = 3
            r1.A00 = r0
        L85:
            X.05h r0 = r8.A0Y
            r0.A02(r6)
            return
        L8b:
            boolean r0 = r1.A00()
            if (r0 == 0) goto L85
            if (r2 == 0) goto L85
            X.1rx r0 = r8.A0b
            long r4 = r0.A03
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto La6
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto La7
        La6:
            r0 = 0
        La7:
            if (r0 != 0) goto L85
            r0 = 1
            r7.A00 = r0
            r7.A01()
            goto L85
        Lb0:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass224.AM7():void");
    }

    @Override // X.C0KL
    public void AM8(C47182Ac c47182Ac) {
        Application application = this.A0J.A00;
        C00R c00r = (C00R) this.A0W;
        if (c00r.A03.A01()) {
            c00r.A04.A01();
        }
        int i = c47182Ac.type;
        if (i == 0) {
            this.A0p.A02(true);
            this.A0q.A07();
            Log.i("MessageHandlerCallback/onMessageHandlerLoginFailed/exception-password");
        } else if (i == 5) {
            C000200d.A0j(this.A0L, "underage_account_banned", true);
            this.A0p.A02(true);
            Intent A02 = this.A0q.A02();
            A02.putExtra("com.whatsapp.registration.RegisterPhone.show_underage_account_ban_dialog", true);
            application.startActivity(A02);
        } else if (i == 7) {
            if (this.A08.A0E(C01C.A0R)) {
                C01L c01l = this.A00;
                synchronized (c01l) {
                    c01l.A06();
                    Log.i("clearing client static key pair");
                    boolean commit = c01l.A09.A01("keystore").edit().remove("client_static_keypair").remove("client_static_keypair_enc").remove("client_static_keypair_pwd_enc").commit();
                    AnonymousClass054 anonymousClass054 = c01l.A01;
                    if (anonymousClass054 != null) {
                        anonymousClass054.A03();
                    }
                    c01l.A06.A03();
                    c01l.A00 = null;
                    if (!commit) {
                        throw new RuntimeException("unable to clear client static keypair");
                    }
                }
                this.A0y.A01();
            }
            this.A0p.A02(true);
            this.A0q.A07();
            Log.i("MessageHandlerCallback/onMessageHandlerLoginFailed/perm-banned");
        } else if (i != 2) {
            if (i != 3) {
                StringBuilder A0P = C000200d.A0P("message-handler-callback/login-failed LoginFailureException type: ");
                A0P.append(i);
                Log.e(A0P.toString());
                return;
            }
            long j = c47182Ac.expiration_time;
            if (j <= 0) {
                j = this.A0I.A05();
            }
            this.A0L.A0D().putLong("software_forced_expiration", j).apply();
            A01();
        } else {
            Intent intent = new Intent(null, null, application, SpamWarningActivity.class);
            intent.setFlags(268435456);
            intent.putExtra("spam_warning_reason_key", c47182Ac.code);
            intent.putExtra("expiry_in_seconds", c47182Ac.expire_time_out);
            String str = c47182Ac.banMessage;
            if (str != null && !str.isEmpty()) {
                intent.putExtra("spam_warning_message_key", str);
            }
            String str2 = c47182Ac.faqUrl;
            if (str2 != null && !str2.isEmpty()) {
                intent.putExtra("faq_url_key", str2);
            }
            this.A0L.A0i(true, System.currentTimeMillis() + (c47182Ac.expire_time_out * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
            application.startActivity(intent);
        }
    }

    @Override // X.C0KL
    public void AM9() {
        Log.i("message-handler-callback/ready");
        if (this.A0L.A00.getBoolean("refresh_broadcast_lists", false)) {
            this.A0d.A04();
        }
    }

    @Override // X.C0KL
    public void AMA() {
        Log.i("message-handler-callback/handlerconnected/handlesoftwareexpired");
        this.A0s.A02(this.A0J.A00, GcmFGService.class);
        A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:540:0x031c, code lost:
        if (r3 != 2) goto L42;
     */
    @Override // X.C0KL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AMB(android.os.Message r41) {
        /*
            Method dump skipped, instructions count: 2874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass224.AMB(android.os.Message):void");
    }
}
