package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.2Lc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C49562Lc {
    public static volatile C49562Lc A0A;
    public final C0HK A00 = new C0HK(0);
    public final AbstractC000600i A01;
    public final C05A A02;
    public final C05M A03;
    public final C05B A04;
    public final C05E A05;
    public final C28K A06;
    public final C28L A07;
    public final C41511u2 A08;
    public final InterfaceC002901k A09;

    public C49562Lc(C05B c05b, C05A c05a, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C05M c05m, C28L c28l, C41511u2 c41511u2, C05E c05e, C28K c28k) {
        this.A04 = c05b;
        this.A02 = c05a;
        this.A01 = abstractC000600i;
        this.A09 = interfaceC002901k;
        this.A03 = c05m;
        this.A07 = c28l;
        this.A08 = c41511u2;
        this.A05 = c05e;
        this.A06 = c28k;
    }

    public static C49562Lc A00() {
        if (A0A == null) {
            synchronized (C49562Lc.class) {
                if (A0A == null) {
                    C05B A00 = C05B.A00();
                    C05A A002 = C05A.A00();
                    AbstractC000600i A003 = AbstractC000600i.A00();
                    InterfaceC002901k A004 = C002801j.A00();
                    C05M A005 = C05M.A00();
                    C28L A006 = C28L.A00();
                    C41511u2 A007 = C41511u2.A00();
                    C05E A008 = C05E.A00();
                    C000500h.A00();
                    A0A = new C49562Lc(A00, A002, A003, A004, A005, A006, A007, A008, C28K.A00());
                }
            }
        }
        return A0A;
    }

    public synchronized int A01() {
        return ((Integer) this.A00.A01()).intValue();
    }

    public void A02(InterfaceC02360Aw interfaceC02360Aw, InterfaceC05620Pl interfaceC05620Pl) {
        this.A00.A05(interfaceC02360Aw, interfaceC05620Pl);
    }

    public final void A03(Set set, boolean z) {
        C05E c05e = this.A05;
        c05e.A05();
        ReentrantReadWriteLock.WriteLock writeLock = c05e.A08;
        writeLock.lock();
        this.A03.A0C();
        StringBuilder sb = new StringBuilder("ForcedDBMigration/running forced migrations. blocking = ");
        sb.append(z);
        Log.i(sb.toString());
        try {
            this.A06.A07(7, new C47982Di(new InterfaceC47992Dj[0]), set, z ? 3 : 2);
        } finally {
            if (A04(set, z) || !z) {
                c05e.A05();
                writeLock.unlock();
                this.A08.A05(true);
            }
        }
    }

    public boolean A04(Set set, boolean z) {
        boolean z2;
        if (!this.A04.A0C()) {
            Log.e("ForcedDBMigration/failed to migrate jidStore");
            z2 = false;
        } else {
            z2 = true;
        }
        if (!this.A02.A0G()) {
            Log.e("ForcedDBMigration/failed to migrate chatStore");
            z2 = false;
        }
        Iterator it = set.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC05100Nh A03 = this.A07.A03(str);
            if (A03 != null && !A03.A0b()) {
                C000200d.A13("ForcedDBMigration/failed to migrate ", str);
                if (z3 || A03.A0M()) {
                    z2 = false;
                } else {
                    z2 = false;
                    z3 = true;
                }
            }
        }
        if (z2) {
            Log.i("ForcedDBMigration/successfully migrated all forced migration");
            this.A00.A0A(5);
            return z2;
        }
        C000200d.A1C("ForcedDBMigration/failed to migrate all forced migration. blocking = ", z);
        this.A01.A09("ForcedDatabaseMigrationManager/failedToMigrate", "failedToMigrate", true);
        C0HK c0hk = this.A00;
        if (!z) {
            c0hk.A0A(2);
            return z2;
        }
        c0hk.A0A(Integer.valueOf(z3 ? 3 : 4));
        return z2;
    }

    public final synchronized boolean A05(boolean z) {
        C05E c05e = this.A05;
        c05e.A05();
        if (c05e.A01) {
            HashSet hashSet = new HashSet();
            C28L c28l = this.A07;
            Iterator it = ((ArrayList) c28l.A02().A03()).iterator();
            while (it.hasNext()) {
                AbstractC05100Nh abstractC05100Nh = (AbstractC05100Nh) it.next();
                if (abstractC05100Nh.A0H() && abstractC05100Nh.A02() == 3 && !abstractC05100Nh.A0b()) {
                    hashSet.add(abstractC05100Nh.A0B);
                }
            }
            boolean z2 = !hashSet.isEmpty();
            if (!z2) {
                Iterator it2 = ((ArrayList) c28l.A02().A03()).iterator();
                while (it2.hasNext()) {
                    AbstractC05100Nh abstractC05100Nh2 = (AbstractC05100Nh) it2.next();
                    if (abstractC05100Nh2.A0G() && abstractC05100Nh2.A02() == 3 && !abstractC05100Nh2.A0b()) {
                        hashSet.add(abstractC05100Nh2.A0B);
                    }
                }
            }
            if (hashSet.isEmpty()) {
                return false;
            }
            if (this.A06.A0D.get()) {
                return false;
            }
            C0HK c0hk = this.A00;
            if (((Integer) c0hk.A01()).intValue() != 0) {
                return true;
            }
            c0hk.A0A(1);
            this.A08.A05(false);
            if (z) {
                A03(hashSet, z2);
            } else {
                this.A09.AS5(new RunnableEBaseShape0S0210000_I0(this, hashSet, z2, 7));
            }
            return true;
        }
        return false;
    }
}
