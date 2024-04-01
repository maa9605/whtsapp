package X;

import android.database.Cursor;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.28K */
/* loaded from: classes2.dex */
public class C28K {
    public static volatile C28K A0E;
    public final AbstractC000600i A00;
    public final C02L A01;
    public final C01B A02;
    public final C470029d A03;
    public final C0G2 A04;
    public final C000400f A05;
    public final AnonymousClass012 A06;
    public final C000500h A07;
    public final C05B A08;
    public final C42431vj A09;
    public final C05E A0A;
    public final C28L A0B;
    public final AnonymousClass011 A0C;
    public final AtomicBoolean A0D = new AtomicBoolean(false);

    public C28K(AnonymousClass012 anonymousClass012, C05B c05b, AbstractC000600i abstractC000600i, C02L c02l, AnonymousClass011 anonymousClass011, C01B c01b, C470029d c470029d, C000400f c000400f, C28L c28l, C000500h c000500h, C05E c05e, C0G2 c0g2, C42431vj c42431vj) {
        this.A06 = anonymousClass012;
        this.A08 = c05b;
        this.A00 = abstractC000600i;
        this.A01 = c02l;
        this.A0C = anonymousClass011;
        this.A02 = c01b;
        this.A03 = c470029d;
        this.A05 = c000400f;
        this.A0B = c28l;
        this.A07 = c000500h;
        this.A0A = c05e;
        this.A04 = c0g2;
        this.A09 = c42431vj;
    }

    public static C28K A00() {
        if (A0E == null) {
            synchronized (C28K.class) {
                if (A0E == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C05B A002 = C05B.A00();
                    AbstractC000600i A003 = AbstractC000600i.A00();
                    C02L A004 = C02L.A00();
                    AnonymousClass011 A005 = AnonymousClass011.A00();
                    C01B A006 = C01B.A00();
                    C470029d A007 = C470029d.A00();
                    C000400f A008 = C000400f.A00();
                    C28L A009 = C28L.A00();
                    C000500h A0010 = C000500h.A00();
                    C05E A0011 = C05E.A00();
                    C0G2 A0012 = C0G2.A00();
                    C47962Dg.A00();
                    A0E = new C28K(A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, C42431vj.A00());
                }
            }
        }
        return A0E;
    }

    public static boolean A01(AbstractC05100Nh abstractC05100Nh) {
        if ((abstractC05100Nh.A0F() || abstractC05100Nh.A0b()) && abstractC05100Nh.A02() == 1) {
            return true;
        }
        return abstractC05100Nh.A0I();
    }

    public int A02(AbstractC05100Nh abstractC05100Nh, C47972Dh c47972Dh) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = ((ArrayList) this.A0B.A02().A03()).iterator();
            while (it.hasNext()) {
                AbstractC05100Nh abstractC05100Nh2 = (AbstractC05100Nh) it.next();
                if (abstractC05100Nh2.A0X().contains(abstractC05100Nh.A0B)) {
                    arrayList.add(abstractC05100Nh2);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC05100Nh abstractC05100Nh3 = (AbstractC05100Nh) it2.next();
            int A02 = A02(abstractC05100Nh3, c47972Dh);
            if (A02 != 3) {
                StringBuilder A0P = C000200d.A0P("DatabaseMigrationManager/processMigrations; name=");
                A0P.append(abstractC05100Nh.A0B);
                A0P.append("; cannot rollback, because reverse dependency ");
                A0P.append(abstractC05100Nh3.A0B);
                A0P.append(" cannot be rolled (");
                A0P.append(A02);
                A0P.append(")");
                Log.i(A0P.toString());
                c47972Dh.A01++;
                return A02;
            }
        }
        if (!abstractC05100Nh.A0b() && !abstractC05100Nh.A0F() && !abstractC05100Nh.A0I()) {
            C000200d.A1Q(C000200d.A0P("DatabaseMigrationManager/processMigrations; name="), abstractC05100Nh.A0B, "; rollback not needed, already in original state");
            return 3;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("DatabaseMigrationManager/processMigrations; name=");
            sb.append(abstractC05100Nh.A0B);
            sb.append("; trying to rollback migration.");
            Log.i(sb.toString());
            abstractC05100Nh.A0C();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DatabaseMigrationManager/processMigrations; name=");
            sb2.append(abstractC05100Nh.A0B);
            sb2.append("; migration was rolled back.");
            Log.i(sb2.toString());
            if (!abstractC05100Nh.A0b() && !abstractC05100Nh.A0F()) {
                c47972Dh.A02++;
                return 3;
            }
            this.A00.A09("db-rollback-had-no-effect", abstractC05100Nh.A0B, false);
            c47972Dh.A01++;
            return 3;
        } catch (Exception e) {
            AbstractC000600i abstractC000600i = this.A00;
            StringBuilder A0P2 = C000200d.A0P("name=");
            A0P2.append(abstractC05100Nh.A0B);
            A0P2.append(", ");
            A0P2.append(e.toString());
            abstractC000600i.A09("db-rollback-failed", A0P2.toString(), false);
            StringBuilder sb3 = new StringBuilder("DatabaseMigrationManager/processMigrations/error; name=");
            sb3.append(abstractC05100Nh.A0B);
            sb3.append("; failed to rollback migration.");
            Log.e(sb3.toString());
            c47972Dh.A00++;
            return 4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C47972Dh A03(X.C47982Di r14, java.util.List r15) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28K.A03(X.2Di, java.util.List):X.2Dh");
    }

    public final Integer A04(String str) {
        AbstractC05100Nh abstractC05100Nh = (AbstractC05100Nh) this.A0B.A02().A00.get(str);
        if (abstractC05100Nh != null) {
            return Integer.valueOf(abstractC05100Nh.A04());
        }
        return null;
    }

    public void A05() {
        AbstractC05100Nh abstractC05100Nh;
        C01B c01b = this.A02;
        boolean A0E2 = c01b.A0E(C01C.A0O);
        C05E c05e = this.A0A;
        c05e.A05();
        if (c05e.A01) {
            C28L c28l = this.A0B;
            AbstractC05100Nh abstractC05100Nh2 = (AbstractC05100Nh) c28l.A02().A00.get("call_log");
            if (abstractC05100Nh2 != null && !abstractC05100Nh2.A0b()) {
                HashSet hashSet = new HashSet();
                hashSet.add("call_log");
                A07(7, new C47982Di(new InterfaceC47992Dj[0]), hashSet, 1);
            }
            if (A0E2) {
                C02L c02l = this.A01;
                c02l.A05();
                if (c02l.A03 != null) {
                    HashSet hashSet2 = new HashSet();
                    AbstractC05100Nh abstractC05100Nh3 = (AbstractC05100Nh) c28l.A02().A00.get("migration_jid_store");
                    if (abstractC05100Nh3 != null && !abstractC05100Nh3.A0b()) {
                        this.A00.A09("jid-store-migration-pending", String.valueOf(abstractC05100Nh3.A04()), false);
                        hashSet2.add("migration_jid_store");
                    }
                    AbstractC05100Nh abstractC05100Nh4 = (AbstractC05100Nh) c28l.A02().A00.get("migration_chat_store");
                    if (abstractC05100Nh4 != null && !abstractC05100Nh4.A0b()) {
                        this.A00.A09("chat-store-migration-pending", String.valueOf(abstractC05100Nh4.A04()), false);
                        hashSet2.add("migration_chat_store");
                    }
                    AbstractC05100Nh abstractC05100Nh5 = (AbstractC05100Nh) c28l.A02().A00.get("blank_me_jid");
                    if (abstractC05100Nh5 != null && !abstractC05100Nh5.A0b()) {
                        this.A00.A09("md-blank-me-jid-migration-pending", String.valueOf(abstractC05100Nh5.A04()), false);
                        hashSet2.add("blank_me_jid");
                    }
                    AbstractC05100Nh abstractC05100Nh6 = (AbstractC05100Nh) c28l.A02().A00.get("participant_user");
                    if (abstractC05100Nh6 != null && !abstractC05100Nh6.A0b()) {
                        this.A00.A09("md-participant-user-migration-pending", String.valueOf(abstractC05100Nh6.A04()), false);
                        hashSet2.add("participant_user");
                    }
                    A07(7, new C47982Di(new InterfaceC47992Dj[0]), hashSet2, 1);
                }
            }
            if (c01b.A0E(C01C.A0N) && (abstractC05100Nh = (AbstractC05100Nh) c28l.A02().A00.get("message_fts")) != null && abstractC05100Nh.A0F()) {
                HashSet hashSet3 = new HashSet();
                hashSet3.add("message_fts");
                A07(7, new C47982Di(new C48002Dk(this.A04, this.A06)), hashSet3, 1);
            }
        }
    }

    public void A06(int i) {
        Log.i("DatabaseMigrationManager/processAllConsistencyChecks");
        A07(8, new C47982Di(new InterfaceC47992Dj[0]), this.A0B.A02().A02().A02(), i);
    }

    /* JADX WARN: Finally extract failed */
    public void A07(int i, C47982Di c47982Di, Set set, int i2) {
        Long A01;
        C47972Dh c47972Dh;
        C47972Dh c47972Dh2;
        C47972Dh c47972Dh3;
        C47972Dh c47972Dh4;
        Long A012;
        if (set.isEmpty()) {
            Log.i("DatabaseMigrationManager/processMigrations/no migrations requested, skipping.");
            return;
        }
        AtomicBoolean atomicBoolean = this.A0D;
        if (atomicBoolean.getAndSet(true)) {
            Log.w("DatabaseMigrationManager/processMigrations/migrations already in progress");
            return;
        }
        C05640Pn c05640Pn = new C05640Pn();
        c05640Pn.A04 = Integer.valueOf(i2);
        c05640Pn.A00 = Boolean.FALSE;
        c05640Pn.A05 = 0L;
        c05640Pn.A03 = Double.valueOf(this.A05.A03());
        C42431vj c42431vj = this.A09;
        c05640Pn.A02 = c42431vj.A01() == null ? null : Double.valueOf(A01.longValue());
        c05640Pn.A06 = Long.valueOf(set.size());
        C0HC c0hc = new C0HC("DatabaseMigrationManager/processMigrations");
        C470029d c470029d = this.A03;
        c470029d.A01(5, true);
        try {
            try {
                C05B c05b = this.A08;
                C0HC c0hc2 = new C0HC();
                c0hc2.A03();
                C0CD A03 = c05b.A01.A03();
                try {
                    Cursor A07 = A03.A02.A07("SELECT _id, user, server, agent, device, type, raw_string FROM jid", null);
                    int columnIndexOrThrow = A07.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = A07.getColumnIndexOrThrow("user");
                    int columnIndexOrThrow3 = A07.getColumnIndexOrThrow("server");
                    int columnIndexOrThrow4 = A07.getColumnIndexOrThrow("agent");
                    int columnIndexOrThrow5 = A07.getColumnIndexOrThrow("device");
                    int columnIndexOrThrow6 = A07.getColumnIndexOrThrow("type");
                    int columnIndexOrThrow7 = A07.getColumnIndexOrThrow("raw_string");
                    while (A07.moveToNext()) {
                        long j = A07.getLong(columnIndexOrThrow);
                        Jid A06 = c05b.A06(A07, columnIndexOrThrow2, columnIndexOrThrow3, columnIndexOrThrow4, columnIndexOrThrow5, columnIndexOrThrow6, columnIndexOrThrow7);
                        if (A06 != null) {
                            c05b.A0A(j, A06);
                        }
                    }
                    A07.close();
                    A03.close();
                    c05b.A05.size();
                    c0hc2.A01();
                    C07E A02 = this.A0B.A02();
                    HashSet hashSet = new HashSet();
                    LinkedList linkedList = new LinkedList(set);
                    while (true) {
                        Object poll = linkedList.poll();
                        if (poll == null) {
                            break;
                        } else if (!hashSet.contains(poll)) {
                            hashSet.add(poll);
                            AbstractC05100Nh abstractC05100Nh = (AbstractC05100Nh) A02.A00.get(poll);
                            if (abstractC05100Nh != null) {
                                linkedList.addAll(abstractC05100Nh.A0X());
                            }
                        }
                    }
                    HashSet hashSet2 = new HashSet();
                    HashMap hashMap = new HashMap();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object obj = A02.A00.get(next);
                        if (obj != null) {
                            hashMap.put(next, obj);
                        } else {
                            hashSet2.add(next);
                        }
                    }
                    if (!hashSet2.isEmpty()) {
                        this.A00.A09("db-missing-migration-name", hashSet2.toString(), false);
                    }
                    final HashMap hashMap2 = new HashMap();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        Object key = entry.getKey();
                        if (entry.getValue() == null) {
                            throw null;
                        }
                        hashMap2.put(key, 1L);
                    }
                    ArrayDeque arrayDeque = new ArrayDeque();
                    Iterator it2 = new HashSet(hashMap2.keySet()).iterator();
                    while (it2.hasNext()) {
                        arrayDeque.add(it2.next());
                        while (!arrayDeque.isEmpty()) {
                            String str = (String) arrayDeque.poll();
                            AbstractC05100Nh abstractC05100Nh2 = (AbstractC05100Nh) hashMap.get(str);
                            if (abstractC05100Nh2 == null) {
                                StringBuilder sb = new StringBuilder("DatabaseMigrationManager/sortedMigrations; can't get migration with name ");
                                sb.append(str);
                                sb.append("from a map of migrations");
                                Log.e(sb.toString());
                                AbstractC000600i abstractC000600i = this.A00;
                                StringBuilder sb2 = new StringBuilder("DatabaseMigrationManager/sortedMigrations/missing dependent migration; name=");
                                sb2.append(str);
                                abstractC000600i.A09(sb2.toString(), null, false);
                            } else {
                                Set A0X = abstractC05100Nh2.A0X();
                                if (A0X == null) {
                                    throw null;
                                }
                                for (Object obj2 : A0X) {
                                    Long l = (Long) hashMap2.get(obj2);
                                    if (l == null) {
                                        l = 1L;
                                        hashMap2.put(obj2, l);
                                    }
                                    Long l2 = (Long) hashMap2.get(str);
                                    if (l2 == null) {
                                        l2 = 1L;
                                        hashMap2.put(str, l2);
                                    }
                                    long longValue = l.longValue();
                                    long longValue2 = l2.longValue();
                                    if (longValue <= longValue2) {
                                        hashMap2.put(obj2, Long.valueOf(longValue2 + 1));
                                        arrayDeque.add(obj2);
                                    }
                                }
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList(hashMap.values());
                    Collections.sort(arrayList, new Comparator() { // from class: X.2u0
                        @Override // java.util.Comparator
                        public final int compare(Object obj3, Object obj4) {
                            Map map = hashMap2;
                            AbstractC05100Nh abstractC05100Nh3 = (AbstractC05100Nh) obj3;
                            AbstractC05100Nh abstractC05100Nh4 = (AbstractC05100Nh) obj4;
                            if (abstractC05100Nh3 == abstractC05100Nh4) {
                                return 0;
                            }
                            return -(((Number) map.get(abstractC05100Nh3.A0B)).longValue() > ((Number) map.get(abstractC05100Nh4.A0B)).longValue() ? 1 : (((Number) map.get(abstractC05100Nh3.A0B)).longValue() == ((Number) map.get(abstractC05100Nh4.A0B)).longValue() ? 0 : -1));
                        }
                    });
                    ArrayList<AbstractC05100Nh> arrayList2 = new ArrayList(arrayList);
                    ArrayList<AbstractC05100Nh> arrayList3 = new ArrayList(arrayList);
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        AbstractC05100Nh abstractC05100Nh3 = (AbstractC05100Nh) it3.next();
                        if (abstractC05100Nh3 instanceof AbstractC05650Po) {
                            arrayList5.add((AbstractC05650Po) abstractC05100Nh3);
                        } else {
                            arrayList4.add(abstractC05100Nh3);
                        }
                    }
                    if ((i & 1) != 0) {
                        c47972Dh = new C47972Dh();
                        for (AbstractC05100Nh abstractC05100Nh4 : arrayList2) {
                            if (A01(abstractC05100Nh4) && A02(abstractC05100Nh4, c47972Dh) != 3) {
                                this.A00.A09("db-rollback-not-completed", abstractC05100Nh4.A0B, false);
                            }
                        }
                    } else {
                        c47972Dh = new C47972Dh();
                    }
                    if ((i & 2) != 0) {
                        c47972Dh2 = A03(c47982Di, arrayList4);
                    } else {
                        c47972Dh2 = new C47972Dh();
                    }
                    if ((i & 4) != 0) {
                        c47972Dh3 = A03(c47982Di, arrayList5);
                    } else {
                        c47972Dh3 = new C47972Dh();
                    }
                    if ((i & 8) != 0) {
                        Log.i("DatabaseMigrationManager/handleConsistencyPhase");
                        c47972Dh4 = new C47972Dh();
                        for (AbstractC05100Nh abstractC05100Nh5 : arrayList3) {
                            if (abstractC05100Nh5 != null) {
                                boolean z = abstractC05100Nh5 instanceof C0Pq;
                                if (z) {
                                    if (z) {
                                        try {
                                            StringBuilder A0P = C000200d.A0P("DatabaseMigration/checkConsistency; name=");
                                            String str2 = abstractC05100Nh5.A0B;
                                            C000200d.A1N(A0P, str2);
                                            C0Pq c0Pq = (C0Pq) abstractC05100Nh5;
                                            C0CD A04 = abstractC05100Nh5.A05.A04();
                                            try {
                                                C03790Hb A00 = A04.A00();
                                                C48012Dl A0c = c0Pq.A0c();
                                                if (!A0c.A01) {
                                                    AbstractC000600i abstractC000600i2 = abstractC05100Nh5.A01;
                                                    StringBuilder sb3 = new StringBuilder();
                                                    sb3.append(str2);
                                                    sb3.append(": ");
                                                    sb3.append(A0c.A00);
                                                    abstractC000600i2.A09("db-inconsistent-state", sb3.toString(), false);
                                                    c0Pq.A0C();
                                                }
                                                A00.A00();
                                                A00.close();
                                                A04.close();
                                            } catch (Throwable th) {
                                                try {
                                                    throw th;
                                                    break;
                                                } catch (Throwable th2) {
                                                    try {
                                                        A04.close();
                                                    } catch (Throwable unused) {
                                                    }
                                                    throw th2;
                                                    break;
                                                }
                                            }
                                        } catch (Exception e) {
                                            StringBuilder A0P2 = C000200d.A0P("DatabaseMigrationManager/handleConsistencyPhase; checkConsistency failed for ");
                                            String str3 = abstractC05100Nh5.A0B;
                                            A0P2.append(str3);
                                            Log.e(A0P2.toString(), e);
                                            AbstractC000600i abstractC000600i3 = this.A00;
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append(str3);
                                            sb4.append(": ");
                                            sb4.append(e);
                                            abstractC000600i3.A09("db-consistency-check-failure", sb4.toString(), false);
                                            c47972Dh4.A00++;
                                        }
                                    }
                                    c47972Dh4.A02++;
                                }
                            } else {
                                throw null;
                            }
                        }
                    } else {
                        c47972Dh4 = new C47972Dh();
                    }
                    c05640Pn.A0G = Long.valueOf(c47972Dh.A02);
                    c05640Pn.A0F = Long.valueOf(c47972Dh.A01);
                    c05640Pn.A0E = Long.valueOf(c47972Dh.A00);
                    c05640Pn.A0D = Long.valueOf(c47972Dh2.A02);
                    c05640Pn.A0C = Long.valueOf(c47972Dh2.A01);
                    c05640Pn.A0B = Long.valueOf(c47972Dh2.A00);
                    c05640Pn.A0J = Long.valueOf(c47972Dh3.A02);
                    c05640Pn.A0I = Long.valueOf(c47972Dh3.A01);
                    c05640Pn.A0H = Long.valueOf(c47972Dh3.A00);
                    c05640Pn.A0A = Long.valueOf(c47972Dh4.A02);
                    c05640Pn.A09 = Long.valueOf(c47972Dh4.A01);
                    c05640Pn.A08 = Long.valueOf(c47972Dh4.A00);
                    c05640Pn.A07 = Long.valueOf(c0hc.A01());
                    c05640Pn.A01 = c42431vj.A01() == null ? null : Double.valueOf(A012.longValue());
                    c05640Pn.A05 = Long.valueOf(c47972Dh2.A02);
                    c05640Pn.A00 = Boolean.valueOf(c47972Dh2.A00 == 0);
                    c470029d.A01(5, false);
                    if (c05640Pn.A00.booleanValue()) {
                        this.A0C.A0B(c05640Pn, null, false);
                    } else {
                        this.A0C.A09(c05640Pn, 1);
                        AnonymousClass011.A01(c05640Pn, "");
                    }
                    atomicBoolean.set(false);
                } finally {
                }
            } catch (Exception e2) {
                Log.e("DatabaseMigrationManager/processMigrations/error while processing scheduled migrations.", e2);
                this.A00.A09("db-process-migration-failure", e2.toString(), false);
                c470029d.A01(5, false);
                if (c05640Pn.A00.booleanValue()) {
                    this.A0C.A0B(c05640Pn, null, false);
                } else {
                    this.A0C.A09(c05640Pn, 1);
                    AnonymousClass011.A01(c05640Pn, "");
                }
                atomicBoolean.set(false);
            }
        } catch (Throwable th3) {
            c470029d.A01(5, false);
            if (c05640Pn.A00.booleanValue()) {
                this.A0C.A0B(c05640Pn, null, false);
            } else {
                this.A0C.A09(c05640Pn, 1);
                AnonymousClass011.A01(c05640Pn, "");
            }
            atomicBoolean.set(false);
            throw th3;
        }
    }

    public void A08(AbstractC05100Nh abstractC05100Nh, int i) {
        C0O5 c0o5 = new C0O5();
        Double valueOf = Double.valueOf(this.A0A.A02());
        c0o5.A01 = valueOf;
        c0o5.A00 = valueOf;
        c0o5.A09 = abstractC05100Nh.A0B;
        c0o5.A02 = Double.valueOf(this.A05.A03());
        c0o5.A05 = 0L;
        c0o5.A07 = 0L;
        c0o5.A08 = 0L;
        c0o5.A06 = Long.valueOf(abstractC05100Nh.A07());
        c0o5.A04 = 1;
        c0o5.A03 = Integer.valueOf(i);
        this.A0C.A0B(c0o5, null, false);
    }
}
