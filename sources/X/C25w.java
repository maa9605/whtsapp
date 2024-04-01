package X;

import android.os.ConditionVariable;
import android.os.Message;
import com.whatsapp.jobqueue.job.SendWebForwardJob;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.25w */
/* loaded from: classes2.dex */
public class C25w {
    public static volatile C25w A09;
    public final C0E6 A00;
    public final C451520p A01;
    public final InterfaceC002901k A02;
    public final C41981up A03;
    public final C41991uq A04;
    public final AtomicInteger A05 = new AtomicInteger();
    public final AtomicInteger A06 = new AtomicInteger();
    public final Condition A07;
    public final ReentrantLock A08;

    public C25w(InterfaceC002901k interfaceC002901k, C41981up c41981up, C41991uq c41991uq, C0E6 c0e6, C451520p c451520p) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.A08 = reentrantLock;
        this.A07 = reentrantLock.newCondition();
        this.A02 = interfaceC002901k;
        this.A03 = c41981up;
        this.A04 = c41991uq;
        this.A00 = c0e6;
        this.A01 = c451520p;
    }

    public static C25w A00() {
        if (A09 == null) {
            synchronized (C25w.class) {
                if (A09 == null) {
                    A09 = new C25w(C002801j.A00(), C41981up.A00(), C41991uq.A00(), C0E6.A00(), C451520p.A00());
                }
            }
        }
        return A09;
    }

    public void A01(AbstractC005302j abstractC005302j, boolean z, Collection collection, int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C41981up c41981up = this.A03;
        if (!c41981up.A04() || abstractC005302j == null || collection == null || collection.size() == 0) {
            return;
        }
        C25u c25u = new C25u(this, abstractC005302j, z, collection, i);
        ((AbstractC42841wP) c25u).A00 = c41981up.A01().A03;
        C41991uq c41991uq = this.A04;
        C0I2 c0i2 = new C0I2(c41991uq, c25u);
        int size = collection.size();
        if (z) {
            ArrayList arrayList3 = new ArrayList(size);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C20v A02 = this.A01.A02((AnonymousClass092) it.next(), null, false, false);
                if (A02 != null) {
                    arrayList3.add(A02);
                }
            }
            arrayList2 = null;
            arrayList = arrayList3;
        } else {
            ArrayList arrayList4 = new ArrayList(size);
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((AnonymousClass092) it2.next()).A0n);
            }
            arrayList = null;
            arrayList2 = arrayList4;
        }
        String A03 = c41991uq.A03();
        C0E6 c0e6 = this.A00;
        String str = c41981up.A01().A03;
        C03950Hv c03950Hv = new C03950Hv(abstractC005302j, z ? 7 : 8);
        c03950Hv.A00 = i;
        c0e6.A00.A01(new SendWebForwardJob(A03, str, Message.obtain(null, 0, 55, 0, new C05600Pj(A03, abstractC005302j, c0i2, arrayList2, arrayList, c03950Hv))));
    }

    public void A02(AnonymousClass092 anonymousClass092) {
        if (!C002701i.A1R(anonymousClass092)) {
            throw new IllegalArgumentException("message thumb not loaded");
        }
        if (this.A03.A04() && A04()) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(anonymousClass092);
            A03(null, arrayList, 4, false, false, null, null, 4, null, null);
        }
    }

    public final void A03(String str, List list, int i, boolean z, boolean z2, ConditionVariable conditionVariable, ConditionVariable conditionVariable2, int i2, AnonymousClass094 anonymousClass094, Map map) {
        int i3;
        if (3 == i) {
            i3 = this.A05.getAndIncrement();
        } else {
            i3 = -1;
        }
        C2DA c2da = new C2DA(this, conditionVariable, conditionVariable2, i, i3);
        if ((str == null && (list == null || (list.size() == 0 && i != 0))) || (!this.A03.A04() && !z2)) {
            c2da.A00();
            return;
        }
        C3M9 c3m9 = new C3M9(this, list, anonymousClass094, str, i, c2da, z2, i2, map);
        if (z) {
            c3m9.run();
            return;
        }
        try {
            this.A02.AS1(c3m9);
        } catch (Exception e) {
            Log.e("app/xmpp/send/qr_msgs dispatch error ", e);
            c2da.A00();
        }
    }

    public final boolean A04() {
        C41991uq c41991uq = this.A04;
        String str = this.A03.A01().A00;
        if (c41991uq != null) {
            C42881wU c42881wU = str != null ? (C42881wU) c41991uq.A05().get(str) : null;
            return (c42881wU != null && c42881wU.A0E.A0E(C01C.A21) && c42881wU.A0C) ? false : true;
        }
        throw null;
    }
}
