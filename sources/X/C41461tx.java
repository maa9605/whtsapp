package X;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.location.Location;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendDisableLiveLocationJob;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob;
import com.whatsapp.jobqueue.job.SendLiveLocationKeyJob;
import com.whatsapp.location.FinalLiveLocationBroadcastReceiver;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.util.Log;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: X.1tx */
/* loaded from: classes2.dex */
public class C41461tx {
    public static volatile C41461tx A0e;
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public C0K0 A05;
    public Long A06;
    public Map A07;
    public Map A08;
    public final Handler A09;
    public final C02L A0A;
    public final C0E6 A0B;
    public final C010005b A0C;
    public final C04h A0D;
    public final C05W A0E;
    public final C02E A0F;
    public final AnonymousClass012 A0G;
    public final C001200o A0H;
    public final C000500h A0I;
    public final C01J A0J;
    public final C01R A0K;
    public final C03340Fh A0L;
    public final C0C9 A0M;
    public final C41481tz A0N;
    public final C452921f A0O;
    public final C05Y A0P;
    public final C41521u3 A0Q;
    public final Object A0R;
    public final Object A0S;
    public final Object A0T;
    public final Runnable A0U;
    public final Runnable A0V;
    public final HashSet A0W;
    public final List A0X;
    public final List A0Y;
    public final Map A0Z;
    public final Map A0a;
    public final Map A0b;
    public final Map A0c;
    public final Map A0d;

    public static boolean A02(long j, long j2) {
        return j == 0 || j > j2;
    }

    public C41461tx(C001200o c001200o, AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, C02L c02l, C04Z c04z, C0E6 c0e6, C05Y c05y, C05W c05w, C01R c01r, C02E c02e, C41521u3 c41521u3, AnonymousClass008 anonymousClass008, final C0C9 c0c9, C00A c00a, C010005b c010005b, C41481tz c41481tz, C01J c01j, C04h c04h, C000500h c000500h, C03340Fh c03340Fh) {
        C452921f c452921f = new C452921f(c001200o, abstractC000600i, c04z);
        this.A0d = new HashMap();
        this.A0S = new Object();
        this.A09 = new Handler();
        this.A06 = null;
        this.A03 = 0L;
        this.A0T = new Object();
        this.A0Z = new HashMap();
        this.A0a = new HashMap();
        this.A0c = new HashMap();
        this.A0b = new HashMap();
        this.A0W = new HashSet();
        this.A0Y = new ArrayList();
        this.A0X = new ArrayList();
        this.A00 = 0;
        this.A0R = new Object();
        this.A0V = new RunnableEBaseShape3S0100000_I0_3(this, 36);
        this.A0U = new RunnableEBaseShape3S0100000_I0_3(this, 33);
        this.A0H = c001200o;
        this.A0G = anonymousClass012;
        this.A0A = c02l;
        this.A0B = c0e6;
        this.A0P = c05y;
        this.A0E = c05w;
        this.A0K = c01r;
        this.A0F = c02e;
        this.A0Q = c41521u3;
        this.A0M = c0c9;
        this.A0C = c010005b;
        this.A0N = c41481tz;
        this.A0J = c01j;
        this.A0D = c04h;
        this.A0I = c000500h;
        this.A0O = c452921f;
        this.A0L = c03340Fh;
        anonymousClass008.A01(new C0GA() { // from class: X.21g
            {
                C41461tx.this = this;
            }

            @Override // X.C0GA
            public void A05(Collection collection) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
                    if (abstractC005302j == null) {
                        Log.e("LocationSharingManager/ContactObserver/found jid == null");
                    } else {
                        C41461tx c41461tx = C41461tx.this;
                        c41461tx.A0R(abstractC005302j);
                        c41461tx.A0S(abstractC005302j, null);
                    }
                }
            }
        });
        c00a.A01(new C00T() { // from class: X.21h
            {
                C41461tx.this = this;
            }

            @Override // X.C00T
            public void A05(AbstractC005302j abstractC005302j) {
                C41461tx c41461tx = C41461tx.this;
                synchronized (c41461tx.A0T) {
                    C453221i c453221i = (C453221i) c41461tx.A0D().get(abstractC005302j);
                    if (c453221i != null && c0c9.A0i(c453221i.A02)) {
                        c41461tx.A0R(abstractC005302j);
                    }
                }
                synchronized (c41461tx.A0S) {
                    Map A0C = c41461tx.A0C();
                    if (A0C.containsKey(abstractC005302j)) {
                        Object obj = A0C.get(abstractC005302j);
                        if (obj != null) {
                            Iterator it = new ArrayList(((Map) obj).values()).iterator();
                            while (it.hasNext()) {
                                C21O c21o = (C21O) it.next();
                                if (c0c9.A0i(c21o.A02)) {
                                    c41461tx.A0S(abstractC005302j, c21o.A01);
                                }
                            }
                        } else {
                            throw null;
                        }
                    }
                }
            }

            @Override // X.C00T
            public void A0B(Collection collection, Map map, Map map2) {
                UserJid of;
                C453221i c453221i;
                C41461tx c41461tx = C41461tx.this;
                synchronized (c41461tx.A0T) {
                    Map A0D = c41461tx.A0D();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
                        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                        AbstractC005302j abstractC005302j = anonymousClass094.A00;
                        if (abstractC005302j != null && anonymousClass094.A02 && (anonymousClass092 instanceof C0KC) && (c453221i = (C453221i) A0D.get(abstractC005302j)) != null && c453221i.A02.equals(anonymousClass094)) {
                            c41461tx.A0R(abstractC005302j);
                        }
                    }
                }
                synchronized (c41461tx.A0S) {
                    Map A0C = c41461tx.A0C();
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass092 anonymousClass0922 = (AnonymousClass092) it2.next();
                        AnonymousClass094 anonymousClass0942 = anonymousClass0922.A0n;
                        AbstractC005302j abstractC005302j2 = anonymousClass0942.A00;
                        if (abstractC005302j2 == null || anonymousClass0942.A02 || !(anonymousClass0922 instanceof C0KC)) {
                            return;
                        }
                        Map map3 = (Map) A0C.get(abstractC005302j2);
                        if (map3 == null) {
                            return;
                        }
                        AbstractC005302j A0A = anonymousClass0922.A0A();
                        if (A0A == null) {
                            of = UserJid.of(abstractC005302j2);
                        } else {
                            of = UserJid.of(A0A);
                        }
                        C21O c21o = (C21O) map3.get(of);
                        if (c21o != null && c21o.A02.equals(anonymousClass0942)) {
                            c41461tx.A0S(abstractC005302j2, of);
                        }
                    }
                }
            }
        });
        SharedPreferences sharedPreferences = c000500h.A00;
        this.A04 = sharedPreferences.getLong("live_location_sharing_session_total_time", 0L);
        this.A02 = sharedPreferences.getLong("live_location_sharing_session_start_time", 0L);
        this.A01 = sharedPreferences.getLong("live_location_sharing_session_end_time", 0L);
    }

    public static C41461tx A00() {
        if (A0e == null) {
            synchronized (C41461tx.class) {
                if (A0e == null) {
                    A0e = new C41461tx(C001200o.A01, AnonymousClass012.A00(), AbstractC000600i.A00(), C02L.A00(), C04Z.A00(), C0E6.A00(), C05Y.A01(), C05W.A00(), C01R.A02, C02E.A00(), C41521u3.A00(), AnonymousClass008.A01, C0C9.A00(), C00A.A00, C010005b.A07, C41481tz.A01(), C01J.A00(), C04h.A00(), C000500h.A00(), C03340Fh.A00);
                }
            }
        }
        return A0e;
    }

    public static final C0K0 A01(UserJid userJid, C40531sQ c40531sQ, C0KC c0kc) {
        C21Y A10 = c40531sQ.A10();
        C0K0 c0k0 = new C0K0(userJid);
        c0k0.A00 = A10.A00;
        c0k0.A01 = A10.A01;
        c0k0.A03 = A10.A03;
        int i = A10.A04;
        if ((i & 8) == 8) {
            float f = A10.A02;
            if (!Float.isNaN(f)) {
                c0k0.A02 = f;
            }
        }
        c0k0.A04 = A10.A05;
        if ((i & 128) == 128 && c0kc != null) {
            c0k0.A05 = (A10.A06 * 1000) + c0kc.A0E;
        }
        return c0k0;
    }

    public final int A03(int i) {
        int i2;
        synchronized (this.A0R) {
            i2 = (i ^ (-1)) & this.A00;
            this.A00 = i2;
        }
        return i2;
    }

    public final long A04() {
        long j;
        synchronized (this.A0T) {
            C000500h c000500h = this.A0I;
            long j2 = c000500h.A00.getLong("live_location_sequence_number", -1L);
            long A02 = this.A0G.A02() * 1000;
            if (A02 > j2) {
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingManager/getNextSequenceNumber; got a new sequence number; currentSequenceNumber=");
                sb.append(A02);
                Log.i(sb.toString());
                j2 = A02;
            }
            j = j2 + 1;
            c000500h.A0D().putLong("live_location_sequence_number", j).apply();
        }
        return j;
    }

    public long A05(AbstractC005302j abstractC005302j) {
        synchronized (this.A0T) {
            C453221i c453221i = (C453221i) A0D().get(abstractC005302j);
            if (c453221i != null) {
                return c453221i.A01;
            }
            return -1L;
        }
    }

    public long A06(C0KC c0kc) {
        C21O c21o;
        synchronized (this.A0S) {
            Map A0C = A0C();
            AnonymousClass094 anonymousClass094 = c0kc.A0n;
            Map map = (Map) A0C.get(anonymousClass094.A00);
            if (map == null || (c21o = (C21O) map.get(c0kc.A0B())) == null || !anonymousClass094.equals(c21o.A02)) {
                return -1L;
            }
            return c21o.A00;
        }
    }

    public long A07(C0KC c0kc) {
        AnonymousClass094 anonymousClass094 = c0kc.A0n;
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (abstractC005302j != null) {
            synchronized (this.A0T) {
                C453221i c453221i = (C453221i) A0D().get(abstractC005302j);
                if (c453221i == null || !c453221i.A02.equals(anonymousClass094)) {
                    return -1L;
                }
                return c453221i.A01;
            }
        }
        throw null;
    }

    public final C0KC A08(AnonymousClass094 anonymousClass094) {
        AnonymousClass092 A05 = this.A0M.A0H.A05(anonymousClass094);
        if (!(A05 instanceof C0KC) || A05.A0r) {
            return null;
        }
        return (C0KC) A05;
    }

    public ArrayList A09(AbstractC005302j abstractC005302j) {
        ArrayList arrayList;
        C0K0 c0k0;
        synchronized (this.A0S) {
            Map map = (Map) A0C().get(abstractC005302j);
            long A05 = this.A0G.A05();
            arrayList = new ArrayList();
            if (map != null) {
                for (C21O c21o : map.values()) {
                    if (A02(c21o.A00, A05) && (c0k0 = (C0K0) this.A0d.get(c21o.A01)) != null) {
                        arrayList.add(c0k0);
                    }
                }
            }
        }
        return arrayList;
    }

    public List A0A() {
        ArrayList arrayList;
        synchronized (this.A0T) {
            A0D();
            Set A0E = A0E();
            ((AbstractSet) A0E).removeAll(this.A0W);
            StringBuilder sb = new StringBuilder();
            sb.append("LocationSharingManager/getJidsNeedingSenderKey; jids.size=");
            sb.append(((HashSet) A0E).size());
            Log.i(sb.toString());
            arrayList = new ArrayList(A0E);
        }
        return arrayList;
    }

    public List A0B(AbstractC005302j abstractC005302j) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.A0S) {
            Map map = (Map) A0C().get(abstractC005302j);
            long A05 = this.A0G.A05();
            if (map != null) {
                for (C21O c21o : map.values()) {
                    if (A02(c21o.A00, A05)) {
                        arrayList.add(c21o.A01);
                    }
                }
            }
        }
        return arrayList;
    }

    public final Map A0C() {
        Map map;
        C453421k c453421k;
        synchronized (this.A0S) {
            if (this.A07 == null) {
                Map map2 = this.A0d;
                C452921f c452921f = this.A0O;
                long currentTimeMillis = System.currentTimeMillis();
                HashMap hashMap = new HashMap();
                try {
                    C453321j A00 = c452921f.A00();
                    AbstractC000600i abstractC000600i = A00.A03;
                    C0CD c0cd = new C0CD(null, A00, false);
                    try {
                        Cursor A09 = c0cd.A02.A09("location_cache", C453421k.A01, null, null, null, "getAllUserLocations/QUERY_LOCATION_CACHE");
                        if (A09 == null) {
                            Log.e("LocationSharingStore/getAllUserLocations/unable to get user location cache");
                            c0cd.close();
                        } else {
                            while (A09.moveToNext()) {
                                UserJid nullable = UserJid.getNullable(A09.getString(0));
                                if (nullable != null) {
                                    c453421k = new C453421k(A09, nullable);
                                } else {
                                    c453421k = null;
                                }
                                if (c453421k != null) {
                                    C0K0 c0k0 = c453421k.A00;
                                    hashMap.put(c0k0.A06, c0k0);
                                }
                            }
                            A09.close();
                            c0cd.close();
                            StringBuilder A0P = C000200d.A0P("LocationSharingStore/getAllUserLocations/returned ");
                            A0P.append(hashMap.size());
                            A0P.append(" user locations sharer | time: ");
                            A0P.append(System.currentTimeMillis() - currentTimeMillis);
                            Log.i(A0P.toString());
                        }
                        map2.putAll(hashMap);
                        HashSet hashSet = new HashSet(this.A0d.keySet());
                        this.A07 = new HashMap();
                        this.A0O.A07(false, this.A0G.A05());
                        List A01 = this.A0O.A01(false, 0L);
                        HashMap hashMap2 = new HashMap();
                        Iterator it = ((ArrayList) A01).iterator();
                        while (it.hasNext()) {
                            C453521l c453521l = (C453521l) it.next();
                            AbstractC005302j abstractC005302j = c453521l.A01;
                            if (!hashMap2.containsKey(abstractC005302j)) {
                                hashMap2.put(abstractC005302j, new HashMap());
                            }
                            UserJid userJid = c453521l.A02;
                            ((Map) hashMap2.get(abstractC005302j)).put(userJid, new C21O(userJid, c453521l.A00, c453521l.A03));
                        }
                        HashSet hashSet2 = new HashSet();
                        HashMap hashMap3 = hashMap2;
                        for (AbstractC005302j abstractC005302j2 : hashMap3.keySet()) {
                            if (this.A0E.A08(abstractC005302j2) != null) {
                                if (!this.A07.containsKey(abstractC005302j2)) {
                                    this.A07.put(abstractC005302j2, new HashMap());
                                }
                                Object obj = hashMap3.get(abstractC005302j2);
                                if (obj != null) {
                                    Map map3 = (Map) obj;
                                    Object obj2 = this.A07.get(abstractC005302j2);
                                    if (obj2 != null) {
                                        Map map4 = (Map) obj2;
                                        for (UserJid userJid2 : map3.keySet()) {
                                            map4.put(userJid2, map3.get(userJid2));
                                            hashSet.remove(userJid2);
                                        }
                                    } else {
                                        throw null;
                                    }
                                } else {
                                    throw null;
                                }
                            } else {
                                hashSet2.add(abstractC005302j2);
                            }
                        }
                        if (!hashSet2.isEmpty()) {
                            this.A0O.A09(false, hashSet2);
                        }
                        if (!hashSet.isEmpty()) {
                            this.A0O.A03(hashSet);
                        }
                        A0N();
                    } finally {
                    }
                } catch (Exception e) {
                    Log.e("LocationSharingStore/getAllUserLocations/error getting user locations", e);
                    throw new RuntimeException(e);
                }
            }
            map = this.A07;
        }
        return map;
    }

    public final Map A0D() {
        Map map;
        synchronized (this.A0T) {
            if (this.A08 == null) {
                this.A08 = new HashMap();
                this.A0O.A07(true, this.A0G.A05() - 604800000);
                ArrayList arrayList = (ArrayList) this.A0O.A01(true, this.A0G.A05());
                HashMap hashMap = new HashMap(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C453521l c453521l = (C453521l) it.next();
                    AbstractC005302j abstractC005302j = c453521l.A01;
                    if (!hashMap.containsKey(abstractC005302j)) {
                        hashMap.put(abstractC005302j, new C453221i(c453521l.A00, null, c453521l.A03));
                    }
                    Object obj = hashMap.get(abstractC005302j);
                    if (obj != null) {
                        if (c453521l.A03.equals(((C453221i) obj).A02)) {
                            ((C453221i) hashMap.get(abstractC005302j)).A03.add(c453521l.A02);
                        }
                    } else {
                        throw null;
                    }
                }
                HashSet hashSet = new HashSet();
                HashMap hashMap2 = hashMap;
                for (AbstractC005302j abstractC005302j2 : hashMap2.keySet()) {
                    if (this.A0E.A08(abstractC005302j2) != null) {
                        this.A08.put(abstractC005302j2, hashMap2.get(abstractC005302j2));
                    } else {
                        hashSet.add(abstractC005302j2);
                    }
                }
                if (!hashSet.isEmpty()) {
                    this.A0O.A09(true, hashSet);
                }
                HashSet hashSet2 = this.A0W;
                C452921f c452921f = this.A0O;
                long currentTimeMillis = System.currentTimeMillis();
                HashSet hashSet3 = new HashSet();
                try {
                    C453321j A00 = c452921f.A00();
                    AbstractC000600i abstractC000600i = A00.A03;
                    C0CD c0cd = new C0CD(null, A00, false);
                    try {
                        Cursor A09 = c0cd.A02.A09("location_key_distribution", new String[]{"jid"}, "sent_to_server = ?", new String[]{"1"}, null, "getAllLocationReceiverHasKey/QUERY_LOCATION_KEY_DISTRIBUTION");
                        if (A09 == null) {
                            Log.e("LocationSharingStore/getAllLocationSharers/unable to read location key distribution table");
                            c0cd.close();
                        } else {
                            while (A09.moveToNext()) {
                                UserJid nullable = UserJid.getNullable(A09.getString(0));
                                if (nullable != null) {
                                    hashSet3.add(nullable);
                                }
                            }
                            A09.close();
                            c0cd.close();
                            StringBuilder A0P = C000200d.A0P("LocationSharingStore/getAllLocationReceiverHasKey/returned ");
                            A0P.append(hashSet3.size());
                            A0P.append(" location receivers has key | time: ");
                            A0P.append(System.currentTimeMillis() - currentTimeMillis);
                            Log.i(A0P.toString());
                        }
                        hashSet2.addAll(hashSet3);
                        HashSet hashSet4 = new HashSet(this.A0W);
                        hashSet4.removeAll(A0E());
                        if (!hashSet4.isEmpty()) {
                            A0J();
                        }
                        A0O();
                    } finally {
                    }
                } catch (Exception e) {
                    Log.e("LocationSharingStore/getAllLocationReceiverHasKey/error reading database", e);
                    throw new RuntimeException(e);
                }
            }
            map = this.A08;
        }
        return map;
    }

    public final Set A0E() {
        Map A0D = A0D();
        HashSet hashSet = new HashSet();
        long A05 = this.A0G.A05();
        for (C453221i c453221i : A0D.values()) {
            if (A02(c453221i.A01, A05)) {
                hashSet.addAll(c453221i.A03);
            }
        }
        return hashSet;
    }

    public void A0F() {
        Log.i("LocationSharingManager/cancelShareLocation");
        synchronized (this.A0T) {
            Iterator it = new ArrayList(A0D().keySet()).iterator();
            while (it.hasNext()) {
                A0R((AbstractC005302j) it.next());
            }
        }
    }

    public void A0G() {
        boolean z;
        if (A0e()) {
            Object obj = this.A0R;
            synchronized (obj) {
                z = (this.A00 & 1) == 1;
            }
            if (z) {
                return;
            }
            Application application = this.A0H.A00;
            C02160Ac.A06(application, new Intent(application, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.START_LOCATION_REPORTING").putExtra("duration", 40000L));
            synchronized (obj) {
                this.A00 |= 1;
            }
        }
    }

    public void A0H() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.A0T) {
            Map A0D = A0D();
            A0D.size();
            long A05 = this.A0G.A05();
            for (Map.Entry entry : A0D.entrySet()) {
                long j = ((C453221i) entry.getValue()).A01;
                if (j != 0 && j <= A05) {
                    arrayList.add(entry.getKey());
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0R((AbstractC005302j) it.next());
        }
        A0O();
    }

    public void A0I() {
        A0H();
        ArrayList arrayList = new ArrayList();
        synchronized (this.A0S) {
            Map A0C = A0C();
            A0C.size();
            long A05 = this.A0G.A05();
            for (Map.Entry entry : A0C.entrySet()) {
                for (C21O c21o : ((Map) entry.getValue()).values()) {
                    long j = c21o.A00;
                    if (j != 0 && j <= A05) {
                        arrayList.add(Pair.create(entry.getKey(), c21o.A01));
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            A0S((AbstractC005302j) pair.first, (UserJid) pair.second);
        }
        A0N();
    }

    public void A0J() {
        Log.i("LocationSharingManager/removeMyLocationSenderKey");
        C02L c02l = this.A0A;
        c02l.A05();
        DeviceJid deviceJid = c02l.A02;
        if (deviceJid != null) {
            C0IO A0T = C002701i.A0T(deviceJid);
            synchronized (this.A0T) {
                C01R c01r = this.A0K;
                c01r.A00.execute(new RunnableEBaseShape2S0200000_I0_2(this, A0T, 42));
                this.A0W.clear();
                this.A0c.clear();
                try {
                    try {
                        int A01 = this.A0O.A00().A00().A02.A01("location_key_distribution", null, null);
                        StringBuilder sb = new StringBuilder("LocationSharingStore/deleteAllLocationReceiverHasKey/deleted ");
                        sb.append(A01);
                        sb.append(" rows");
                        Log.i(sb.toString());
                    } finally {
                    }
                } catch (Exception e) {
                    Log.e("LocationSharingStore/deleteAllLocationReceiverHasKey/delete failed", e);
                    throw new RuntimeException(e);
                }
            }
            C04h c04h = this.A0D;
            c04h.A00.A01(new C0KE());
            return;
        }
        throw null;
    }

    public void A0K() {
        C0K0 c0k0;
        C0K0 c0k02;
        synchronized (this) {
            c0k0 = this.A05;
        }
        if (c0k0 != null) {
            if (A0e()) {
                synchronized (this.A0T) {
                    boolean z = false;
                    for (C453221i c453221i : A0D().values()) {
                        long j = c453221i.A01;
                        AnonymousClass094 anonymousClass094 = c453221i.A02;
                        C0KC A08 = A08(anonymousClass094);
                        if (A08 != null && j != 0) {
                            C0K0 c0k03 = c453221i.A00;
                            C0K0 c0k04 = c0k03;
                            if (c0k03 == null && (c0k02 = A08.A02) != null) {
                                c453221i.A00 = c0k02;
                                c0k03 = c0k02;
                                c0k04 = c0k02;
                                z = true;
                            } else if (c0k03 == null) {
                                long j2 = c0k0.A05;
                                if (j >= j2 && j <= j2 + 240000) {
                                    c0k04 = new C0K0(c0k0.A06);
                                    c453221i.A00 = c0k04;
                                    c0k04.A00(c0k0);
                                    this.A0B.A00.A01(new SendFinalLiveLocationNotificationJob(anonymousClass094, c0k0, (int) ((c0k0.A05 - A08.A0E) / 1000)));
                                    z = true;
                                }
                            }
                            if (c0k03.A05 + 30000 < j) {
                                long j3 = c0k0.A05;
                                if (j >= j3 && j <= j3 + 30000) {
                                    c0k04.A00(c0k0);
                                    this.A0B.A00.A01(new SendFinalLiveLocationNotificationJob(anonymousClass094, c0k0, (int) ((c0k0.A05 - A08.A0E) / 1000)));
                                    z = true;
                                }
                            }
                        }
                    }
                    if (z) {
                        A0O();
                    }
                }
                if (!A0e() && A03(1) == 0) {
                    LocationSharingService.A00(this.A0H.A00);
                }
            }
            final C40531sQ A05 = this.A0N.A05(c0k0, null);
            long max = Math.max(0L, (this.A0G.A05() - c0k0.A05) / 1000);
            try {
                Object obj = this.A0K.A00.submit(new Callable() { // from class: X.2y4
                    {
                        C41461tx.this = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C41461tx c41461tx = C41461tx.this;
                        C40531sQ c40531sQ = A05;
                        C02L c02l = c41461tx.A0A;
                        c02l.A05();
                        DeviceJid deviceJid = c02l.A02;
                        if (deviceJid != null) {
                            return new C010805j(2, 3, c41461tx.A0J.A08(new C0QS(C0Zq.A00.getRawString(), C002701i.A0T(deviceJid)), c40531sQ.A0B()).A02);
                        }
                        throw null;
                    }
                }).get();
                if (this.A0C.A06) {
                    C000200d.A0u("sendmethods/sendLocation elapsed=", max);
                    this.A0P.A09(Message.obtain(null, 0, 84, 0, Pair.create(Long.valueOf(max), obj)));
                    return;
                }
                return;
            } catch (InterruptedException | ExecutionException e) {
                Log.e("LocationSharingManager/encryptAndSendLocation error", e);
                return;
            }
        }
        Log.w("LocationSharingManager/sendLatestLocation/try to send location, but no location available");
    }

    public final void A0L() {
        Application application = this.A0H.A00;
        PendingIntent broadcast = PendingIntent.getBroadcast(application, 0, new Intent(application, FinalLiveLocationBroadcastReceiver.class), 536870912);
        if (broadcast != null) {
            AlarmManager A02 = this.A0F.A02();
            if (A02 != null) {
                A02.cancel(broadcast);
            } else {
                Log.w("LocationSharingManager/cancelFinalLiveLocationUpdateAlarm/AlarmManager is null");
            }
            broadcast.cancel();
        }
    }

    public final void A0M() {
        synchronized (this.A0T) {
            Set A0E = A0E();
            HashSet hashSet = new HashSet(this.A0W);
            hashSet.removeAll(A0E);
            if (!hashSet.isEmpty()) {
                A0J();
            }
        }
    }

    public final void A0N() {
        Long l;
        Handler handler = this.A09;
        Runnable runnable = this.A0U;
        handler.removeCallbacks(runnable);
        synchronized (this.A0S) {
            l = null;
            for (Map map : A0C().values()) {
                for (C21O c21o : map.values()) {
                    if (l == null || c21o.A00 < l.longValue()) {
                        l = Long.valueOf(c21o.A00);
                    }
                }
            }
        }
        if (l != null) {
            long A05 = this.A0G.A05();
            long longValue = l.longValue();
            if (longValue > A05) {
                handler.postDelayed(runnable, longValue - A05);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x003c, code lost:
        if (r0 < r20.longValue()) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00bc A[Catch: all -> 0x017d, TRY_ENTER, TryCatch #1 {, blocks: (B:105:0x0012, B:106:0x0026, B:108:0x002c, B:110:0x0034, B:114:0x0046, B:119:0x0056, B:121:0x005a, B:127:0x0068, B:129:0x0071, B:116:0x004e, B:112:0x003e, B:133:0x007b, B:135:0x0083, B:137:0x008b, B:138:0x008d, B:140:0x00a7, B:169:0x014c, B:170:0x016d, B:139:0x0090, B:152:0x00ec, B:153:0x00f7, B:155:0x0105, B:158:0x010d, B:159:0x0111, B:161:0x011e, B:163:0x0137, B:166:0x013f, B:167:0x0143, B:168:0x0147, B:147:0x00bc, B:150:0x00ce, B:151:0x00d8), top: B:181:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0105 A[Catch: all -> 0x017d, TryCatch #1 {, blocks: (B:105:0x0012, B:106:0x0026, B:108:0x002c, B:110:0x0034, B:114:0x0046, B:119:0x0056, B:121:0x005a, B:127:0x0068, B:129:0x0071, B:116:0x004e, B:112:0x003e, B:133:0x007b, B:135:0x0083, B:137:0x008b, B:138:0x008d, B:140:0x00a7, B:169:0x014c, B:170:0x016d, B:139:0x0090, B:152:0x00ec, B:153:0x00f7, B:155:0x0105, B:158:0x010d, B:159:0x0111, B:161:0x011e, B:163:0x0137, B:166:0x013f, B:167:0x0143, B:168:0x0147, B:147:0x00bc, B:150:0x00ce, B:151:0x00d8), top: B:181:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0O() {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41461tx.A0O():void");
    }

    public synchronized void A0P() {
        synchronized (this.A0S) {
            Map map = this.A07;
            if (map != null) {
                map.clear();
            }
            this.A0d.clear();
            this.A0b.clear();
        }
        synchronized (this.A0T) {
            Map map2 = this.A08;
            if (map2 != null) {
                map2.clear();
            }
            this.A0a.clear();
            this.A0c.clear();
        }
        Map map3 = this.A0Z;
        synchronized (map3) {
            map3.clear();
        }
        this.A0O.A00().A01();
    }

    public void A0Q(Location location) {
        C0K0 A06 = this.A0N.A06(location);
        synchronized (this) {
            C0K0 c0k0 = this.A05;
            if (c0k0 == null || A06.A05 > c0k0.A05) {
                this.A05 = A06;
            }
        }
    }

    public void A0R(AbstractC005302j abstractC005302j) {
        C000200d.A0v("LocationSharingManager/cancelShareLocation; jid=", abstractC005302j);
        synchronized (this.A0T) {
            C453221i c453221i = (C453221i) A0D().remove(abstractC005302j);
            if (c453221i == null) {
                return;
            }
            C0KC A08 = A08(c453221i.A02);
            if (A08 != null) {
                A0Z(A08);
            }
            this.A0O.A04(Collections.singletonList(c453221i), this.A0G.A05());
            Set A0E = A0E();
            Iterator it = c453221i.A03.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((HashSet) A0E).contains((UserJid) it.next())) {
                        A0J();
                        break;
                    }
                } else {
                    break;
                }
            }
            long A04 = A04();
            for (InterfaceC453821q interfaceC453821q : this.A0X) {
                interfaceC453821q.APC(abstractC005302j);
            }
            A0O();
            this.A09.post(new RunnableEBaseShape2S0200000_I0_2(this, abstractC005302j, 36));
            if (!A0f()) {
                Log.i("LocationSharingManager/onStopLocationReporting");
                A03(2);
                LocationSharingService.A00(this.A0H.A00);
            }
            C0E6 c0e6 = this.A0B;
            c0e6.A00.A01(new SendDisableLiveLocationJob(abstractC005302j, A04));
        }
    }

    public final void A0S(AbstractC005302j abstractC005302j, UserJid userJid) {
        StringBuilder sb = new StringBuilder("LocationSharingManager/onReceiveStopSharing; jid=");
        sb.append(abstractC005302j);
        sb.append("; participant=");
        sb.append(userJid);
        Log.i(sb.toString());
        synchronized (this.A0S) {
            Map A0C = A0C();
            Map map = (Map) A0C.get(abstractC005302j);
            if (map != null) {
                UserJid userJid2 = userJid;
                if (userJid == null) {
                    userJid2 = abstractC005302j;
                }
                A0W((C21O) map.remove(userJid2));
                C452921f c452921f = this.A0O;
                if (abstractC005302j == null) {
                    throw null;
                }
                if (c452921f == null) {
                    throw null;
                }
                if (userJid == null) {
                    c452921f.A09(false, Collections.singletonList(abstractC005302j));
                } else {
                    c452921f.A08(false, abstractC005302j, Collections.singletonList(userJid));
                }
                if (map.isEmpty()) {
                    A0C.remove(abstractC005302j);
                }
            }
            A0d(A0C);
        }
        for (InterfaceC453921s interfaceC453921s : this.A0Y) {
            interfaceC453921s.ANg(abstractC005302j, userJid);
        }
        A0N();
        this.A09.post(new RunnableEBaseShape2S0200000_I0_2(this, abstractC005302j, 39));
    }

    public void A0T(AbstractC005302j abstractC005302j, List list) {
        boolean z;
        StringBuilder A0T = C000200d.A0T("LocationSharingManager/onParticipantsLeftGroup; gjid=", abstractC005302j, "; participants.size=");
        A0T.append(list.size());
        Log.i(A0T.toString());
        synchronized (this.A0T) {
            Map A0D = A0D();
            C453221i c453221i = (C453221i) A0D.get(abstractC005302j);
            z = false;
            if (c453221i != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    UserJid userJid = (UserJid) it.next();
                    List list2 = c453221i.A03;
                    if (list2.contains(userJid)) {
                        list2.remove(userJid);
                        z = true;
                    }
                }
                if (c453221i.A03.isEmpty()) {
                    Object remove = A0D.remove(abstractC005302j);
                    if (remove != null) {
                        C0KC A08 = A08(((C453221i) remove).A02);
                        if (A08 != null) {
                            A0Z(A08);
                        }
                    } else {
                        throw null;
                    }
                }
                this.A0O.A08(true, abstractC005302j, list);
                A0M();
            }
        }
        if (z) {
            A0O();
            this.A09.post(new RunnableEBaseShape2S0200000_I0_2(this, abstractC005302j, 40));
        }
        synchronized (this.A0S) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                A0S(abstractC005302j, (UserJid) it2.next());
            }
        }
    }

    public void A0U(C011005l c011005l) {
        Map map;
        StringBuilder sb = new StringBuilder("LocationSharingManager/onMeLeftGroup; gjid=");
        sb.append(c011005l);
        Log.i(sb.toString());
        A0R(c011005l);
        synchronized (this.A0S) {
            map = (Map) A0C().remove(c011005l);
        }
        if (map != null) {
            for (C21O c21o : map.values()) {
                A0S(c011005l, c21o.A01);
            }
        }
    }

    public void A0V(UserJid userJid, byte[] bArr, int i) {
        if (i > 4) {
            StringBuilder sb = new StringBuilder("LocationSharingManager/sendLocationKeyRetryRequest/reached max retry; remote_resource=");
            sb.append(userJid);
            sb.append("; retryCount=");
            sb.append(i);
            Log.w(sb.toString());
            return;
        }
        synchronized (this.A0S) {
            boolean z = false;
            for (Map.Entry entry : A0C().entrySet()) {
                Iterator it = ((Map) entry.getValue()).keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (userJid.equals((UserJid) it.next())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!z) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("LocationSharingManager/sendLocationKeyRetryRequest/should not receive location updates from this user; jid=");
                sb2.append(userJid);
                Log.i(sb2.toString());
                return;
            }
            Map map = this.A0Z;
            synchronized (map) {
                long A05 = this.A0G.A05();
                Pair pair = (Pair) map.get(userJid);
                if (pair != null) {
                    long longValue = A05 - ((Long) pair.first).longValue();
                    if (longValue < 60000 && ((Integer) pair.second).intValue() >= i) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("LocationSharingManager/sendLocationKeyRetryRequest/retry too soon; remote_resource=");
                        sb3.append(userJid);
                        sb3.append("; timeElapsed=");
                        sb3.append(longValue);
                        Log.i(sb3.toString());
                        return;
                    }
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("LocationSharingManager/sendLocationKeyRetryRequest/send; remote_resource=");
                sb4.append(userJid);
                sb4.append("; retryCount=");
                sb4.append(i);
                Log.i(sb4.toString());
                map.put(userJid, Pair.create(Long.valueOf(A05), Integer.valueOf(i)));
                C05Y c05y = this.A0P;
                Message obtain = Message.obtain(null, 0, 125, 0);
                obtain.getData().putParcelable("jid", userJid);
                obtain.getData().putByteArray("registrationId", bArr);
                obtain.getData().putInt("retryCount", i);
                c05y.A0C(obtain);
            }
        }
    }

    public final void A0W(C21O c21o) {
        C0KC A08;
        if (c21o == null || (A08 = A08(c21o.A02)) == null) {
            return;
        }
        A0Z(A08);
    }

    public void A0X(InterfaceC453821q interfaceC453821q) {
        List list = this.A0X;
        if (list.contains(interfaceC453821q)) {
            return;
        }
        list.add(interfaceC453821q);
    }

    public void A0Y(InterfaceC453921s interfaceC453921s) {
        List list = this.A0Y;
        if (list.contains(interfaceC453921s)) {
            return;
        }
        list.add(interfaceC453921s);
    }

    public final void A0Z(C0KC c0kc) {
        int A05 = (int) ((this.A0G.A05() - c0kc.A0E) / 1000);
        if (A05 < c0kc.A00) {
            c0kc.A00 = A05;
            if (((C0KD) c0kc).A02 == 1) {
                ((C0KD) c0kc).A02 = 0;
            }
            this.A0M.A0W(c0kc, 19);
        }
    }

    public void A0a(C0KC c0kc, long j) {
        UserJid of;
        StringBuilder A0P = C000200d.A0P("LocationSharingManager/onReceiveSharing; message.key.remote_jid=");
        AnonymousClass094 anonymousClass094 = c0kc.A0n;
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        A0P.append(abstractC005302j);
        A0P.append("; message.remote_resource=");
        A0P.append(c0kc.A0G);
        A0P.append("; expiration=");
        A0P.append(j);
        A0P.append("; message.sequenceNumber=");
        C000200d.A1I(A0P, c0kc.A01);
        AbstractC005302j abstractC005302j2 = c0kc.A0G;
        if (abstractC005302j2 == null) {
            of = UserJid.of(abstractC005302j);
        } else {
            of = UserJid.of(abstractC005302j2);
        }
        synchronized (this.A0S) {
            Map A0C = A0C();
            Pair create = Pair.create(abstractC005302j, of);
            Map map = this.A0b;
            Long l = (Long) map.get(create);
            if (l != null && l.longValue() >= c0kc.A01) {
                Log.i("LocationSharingManager/onReceiveSharing; received message with old sequence number; not set receiving");
                return;
            }
            map.remove(create);
            if (!A0C.containsKey(abstractC005302j)) {
                A0C.put(abstractC005302j, new HashMap());
            }
            Object obj = A0C.get(abstractC005302j);
            if (obj != null) {
                Map map2 = (Map) obj;
                A0W((C21O) map2.get(of));
                if (of != null) {
                    map2.put(of, new C21O(of, j, anonymousClass094));
                    Map map3 = this.A0d;
                    if (!map3.containsKey(of)) {
                        map3.put(of, new C0K0(of));
                    }
                    Object obj2 = map3.get(of);
                    if (obj2 != null) {
                        C0K0 c0k0 = (C0K0) obj2;
                        long j2 = c0k0.A05;
                        long j3 = c0kc.A0E;
                        if (j2 <= j3) {
                            c0k0.A00 = ((C0KD) c0kc).A00;
                            c0k0.A01 = ((C0KD) c0kc).A01;
                            c0k0.A05 = j3;
                            this.A0O.A02(c0k0);
                        }
                        C452921f c452921f = this.A0O;
                        if (abstractC005302j != null) {
                            String str = anonymousClass094.A01;
                            if (c452921f != null) {
                                c452921f.A05(Collections.singletonList(new C453521l(abstractC005302j, of, j, new AnonymousClass094(abstractC005302j, false, str))));
                                A0b(c0kc, c0k0);
                                for (InterfaceC453921s interfaceC453921s : this.A0Y) {
                                    interfaceC453921s.ANf(abstractC005302j, of);
                                }
                                A0N();
                                this.A09.post(new RunnableEBaseShape2S0200000_I0_2(this, abstractC005302j, 35));
                                return;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }

    public void A0b(C0KC c0kc, C0K0 c0k0) {
        UserJid of;
        AnonymousClass094 anonymousClass094 = c0kc.A0n;
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        boolean z = anonymousClass094.A02;
        if (z) {
            of = null;
        } else if (C003101m.A0U(abstractC005302j)) {
            of = UserJid.of(c0kc.A0G);
        } else {
            of = UserJid.of(abstractC005302j);
        }
        String str = anonymousClass094.A01;
        StringBuilder sb = new StringBuilder("LocationSharingManager/storeFinalLiveLocation/jid=");
        sb.append(abstractC005302j);
        sb.append("; fromMe=");
        sb.append(z);
        sb.append("; msgId=");
        sb.append(str);
        sb.append("; participant=");
        sb.append(of);
        sb.append("; location.time=");
        C000200d.A1I(sb, c0k0.A05);
        c0kc.A02 = c0k0;
        this.A0M.A0W(c0kc, 18);
    }

    public void A0c(String str, AbstractC005302j abstractC005302j) {
        StringBuilder sb = new StringBuilder("LocationSharingManager/cancelShareLocation; msgId=");
        sb.append(str);
        sb.append("; jid=");
        sb.append(abstractC005302j);
        Log.i(sb.toString());
        synchronized (this.A0T) {
            if (((C453221i) A0D().get(abstractC005302j)) == null) {
                C0KC A08 = A08(new AnonymousClass094(abstractC005302j, true, str));
                if (A08 != null) {
                    A0Z(A08);
                }
                return;
            }
            A0R(abstractC005302j);
        }
    }

    public final void A0d(Map map) {
        HashSet hashSet = new HashSet(this.A0d.keySet());
        for (Map map2 : map.values()) {
            for (C21O c21o : map2.values()) {
                hashSet.remove(c21o.A01);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        this.A0O.A03(hashSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x001a, code lost:
        if (r3 <= r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0024, code lost:
        if (r6 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0e() {
        /*
            r9 = this;
            X.012 r0 = r9.A0G
            long r7 = r0.A05()
            java.lang.Object r5 = r9.A0T
            monitor-enter(r5)
            java.lang.Long r6 = r9.A06     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3d
            if (r6 == 0) goto L1c
            long r3 = r6.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L26
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 > 0) goto L26
        L1c:
            java.lang.String r0 = "LocationSharingManager/hasExpiringLocationReceivers/triggered clearing"
            com.whatsapp.util.Log.i(r0)
            r9.A0H()
            if (r6 == 0) goto L3b
        L26:
            long r1 = r6.longValue()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L3b
            monitor-enter(r5)
            long r2 = r9.A03     // Catch: java.lang.Throwable -> L33
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L33
            goto L36
        L33:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L33
            throw r0
        L36:
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L3c
        L3b:
            r0 = 0
        L3c:
            return r0
        L3d:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41461tx.A0e():boolean");
    }

    public boolean A0f() {
        synchronized (this.A0T) {
            Map A0D = A0D();
            long A05 = this.A0G.A05();
            for (C453221i c453221i : A0D.values()) {
                if (A02(c453221i.A01, A05)) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean A0g() {
        synchronized (this.A0T) {
            List A0A = A0A();
            ArrayList arrayList = (ArrayList) A0A;
            arrayList.removeAll(this.A0c.keySet());
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.A0c.put((UserJid) it.next(), 0);
            }
            C0E6 c0e6 = this.A0B;
            c0e6.A00.A01(new SendLiveLocationKeyJob(A0A));
            return true;
        }
    }

    public boolean A0h(AbstractC005302j abstractC005302j) {
        synchronized (this.A0T) {
            C453221i c453221i = (C453221i) A0D().get(abstractC005302j);
            if (c453221i != null) {
                if (A02(c453221i.A01, this.A0G.A05())) {
                    return true;
                }
                A0R(abstractC005302j);
            }
            return false;
        }
    }

    public boolean A0i(UserJid userJid) {
        boolean contains;
        synchronized (this.A0T) {
            contains = ((HashSet) A0E()).contains(userJid);
        }
        return contains;
    }

    public boolean A0j(UserJid userJid, int i) {
        if (i > 4) {
            StringBuilder sb = new StringBuilder("LocationSharingManager/shouldUserGetLocationKeyRetry/reached max retry; remote_resource=");
            sb.append(userJid);
            sb.append("; retryCount=");
            sb.append(i);
            Log.w(sb.toString());
            return false;
        }
        synchronized (this.A0T) {
            if (A0i(userJid)) {
                long A05 = this.A0G.A05();
                Pair pair = (Pair) this.A0a.get(userJid);
                if (pair != null) {
                    long longValue = A05 - ((Long) pair.first).longValue();
                    if (longValue < 60000 && ((Integer) pair.second).intValue() >= i) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("LocationSharingManager/shouldUserGetLocationKeyRetry/retry too soon; remote_resource=");
                        sb2.append(userJid);
                        sb2.append("; timeElapsed=");
                        sb2.append(longValue);
                        Log.i(sb2.toString());
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
    }

    public boolean A0k(C0K0 c0k0) {
        C0KC A08;
        synchronized (this.A0S) {
            Map map = this.A0d;
            UserJid userJid = c0k0.A06;
            C0K0 c0k02 = (C0K0) map.get(userJid);
            boolean z = false;
            if (c0k02 == null || c0k02.A05 <= c0k0.A05) {
                for (Map map2 : A0C().values()) {
                    C21O c21o = (C21O) map2.get(userJid);
                    if (c21o != null && c0k0.A05 <= c21o.A00 && (A08 = A08(c21o.A02)) != null) {
                        A0b(A08, c0k0);
                        z = true;
                    }
                }
                if (z) {
                    if (c0k02 == null) {
                        map.put(userJid, c0k0);
                    } else {
                        c0k02.A00(c0k0);
                    }
                    this.A0O.A02(c0k0);
                }
                return z;
            }
            return false;
        }
    }
}
