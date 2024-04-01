package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1bI  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30861bI implements C14U {
    public Bundle A01;
    public final Context A05;
    public final Looper A06;
    public final InterfaceC30511ah A07;
    public final C30691b1 A08;
    public final C39591qN A09;
    public final C39591qN A0A;
    public final Map A0B;
    public final Lock A0D;
    public final Set A0C = Collections.newSetFromMap(new WeakHashMap());
    public C30451ab A02 = null;
    public C30451ab A03 = null;
    public boolean A04 = false;
    public int A00 = 0;

    public C30861bI(Context context, C30691b1 c30691b1, Lock lock, Looper looper, C06220Rz c06220Rz, Map map, Map map2, C230114w c230114w, AbstractC30501ag abstractC30501ag, InterfaceC30511ah interfaceC30511ah, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.A05 = context;
        this.A08 = c30691b1;
        this.A0D = lock;
        this.A06 = looper;
        this.A07 = interfaceC30511ah;
        this.A09 = new C39591qN(context, c30691b1, lock, looper, c06220Rz, map2, null, map4, null, arrayList2, new C14V() { // from class: X.1bJ
            @Override // X.C14V
            public final void AWS(int i, boolean z) {
                C30451ab c30451ab;
                C30861bI c30861bI = C30861bI.this;
                Lock lock2 = c30861bI.A0D;
                lock2.lock();
                try {
                    if (!c30861bI.A04 && (c30451ab = c30861bI.A03) != null && c30451ab.A02()) {
                        c30861bI.A04 = true;
                        c30861bI.A0A.AIw(i);
                        return;
                    }
                    c30861bI.A04 = false;
                    c30861bI.A08.AWS(i, z);
                    c30861bI.A03 = null;
                    c30861bI.A02 = null;
                } finally {
                    lock2.unlock();
                }
            }

            @Override // X.C14V
            public final void AWT(Bundle bundle) {
                C30861bI c30861bI = C30861bI.this;
                Lock lock2 = c30861bI.A0D;
                lock2.lock();
                try {
                    Bundle bundle2 = c30861bI.A01;
                    if (bundle2 == null) {
                        c30861bI.A01 = bundle;
                    } else if (bundle != null) {
                        bundle2.putAll(bundle);
                    }
                    c30861bI.A02 = C30451ab.A04;
                    C30861bI.A00(c30861bI);
                } finally {
                    lock2.unlock();
                }
            }

            @Override // X.C14V
            public final void AWV(C30451ab c30451ab) {
                C30861bI c30861bI = C30861bI.this;
                Lock lock2 = c30861bI.A0D;
                lock2.lock();
                try {
                    c30861bI.A02 = c30451ab;
                    C30861bI.A00(c30861bI);
                } finally {
                    lock2.unlock();
                }
            }
        });
        this.A0A = new C39591qN(context, this.A08, lock, looper, c06220Rz, map, c230114w, map3, abstractC30501ag, arrayList, new C14V() { // from class: X.1bK
            @Override // X.C14V
            public final void AWS(int i, boolean z) {
                C30861bI c30861bI = C30861bI.this;
                Lock lock2 = c30861bI.A0D;
                lock2.lock();
                try {
                    if (c30861bI.A04) {
                        c30861bI.A04 = false;
                        c30861bI.A08.AWS(i, z);
                        c30861bI.A03 = null;
                        c30861bI.A02 = null;
                        return;
                    }
                    c30861bI.A04 = true;
                    c30861bI.A09.AIw(i);
                } finally {
                    lock2.unlock();
                }
            }

            @Override // X.C14V
            public final void AWT(Bundle bundle) {
                C30861bI c30861bI = C30861bI.this;
                Lock lock2 = c30861bI.A0D;
                lock2.lock();
                try {
                    c30861bI.A03 = C30451ab.A04;
                    C30861bI.A00(c30861bI);
                } finally {
                    lock2.unlock();
                }
            }

            @Override // X.C14V
            public final void AWV(C30451ab c30451ab) {
                C30861bI c30861bI = C30861bI.this;
                Lock lock2 = c30861bI.A0D;
                lock2.lock();
                try {
                    c30861bI.A03 = c30451ab;
                    C30861bI.A00(c30861bI);
                } finally {
                    lock2.unlock();
                }
            }
        });
        C006702y c006702y = new C006702y();
        for (Object obj : map2.keySet()) {
            c006702y.put(obj, this.A09);
        }
        for (Object obj2 : map.keySet()) {
            c006702y.put(obj2, this.A0A);
        }
        this.A0B = Collections.unmodifiableMap(c006702y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r3.A02() == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(X.C30861bI r4) {
        /*
            X.1ab r3 = r4.A02
            if (r3 == 0) goto L4c
            boolean r0 = r3.A02()
            if (r0 == 0) goto L4c
            X.1ab r3 = r4.A03
            if (r3 == 0) goto L15
            boolean r1 = r3.A02()
            r0 = 1
            if (r1 != 0) goto L16
        L15:
            r0 = 0
        L16:
            r2 = 1
            if (r0 != 0) goto L20
            if (r3 == 0) goto L42
            int r1 = r3.A01
            r0 = 4
            if (r1 != r0) goto L42
        L20:
            int r1 = r4.A00
            if (r1 == r2) goto L3e
            r0 = 2
            if (r1 == r0) goto L37
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            java.lang.String r1 = "CompositeGAC"
            java.lang.String r0 = "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor"
            android.util.Log.wtf(r1, r0, r2)
        L33:
            r0 = 0
            r4.A00 = r0
        L36:
            return
        L37:
            X.1b1 r1 = r4.A08
            android.os.Bundle r0 = r4.A01
            r1.AWT(r0)
        L3e:
            r4.A01()
            goto L33
        L42:
            if (r3 == 0) goto L36
            int r0 = r4.A00
            if (r0 != r2) goto L74
            r4.A01()
            return
        L4c:
            if (r3 == 0) goto L36
            X.1ab r2 = r4.A03
            if (r2 == 0) goto L63
            boolean r0 = r2.A02()
            if (r0 == 0) goto L63
            X.1qN r0 = r4.A0A
            r0.A7H()
            X.1ab r0 = r4.A02
            r4.A02(r0)
            return
        L63:
            if (r2 == 0) goto L36
            X.1qN r0 = r4.A0A
            int r1 = r0.A00
            X.1qN r0 = r4.A09
            int r0 = r0.A00
            if (r1 >= r0) goto L70
            r3 = r2
        L70:
            r4.A02(r3)
            return
        L74:
            r4.A02(r3)
            X.1qN r0 = r4.A09
            r0.A7H()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30861bI.A00(X.1bI):void");
    }

    public final void A01() {
        Set<C14E> set = this.A0C;
        for (C14E c14e : set) {
            c14e.AIk();
        }
        set.clear();
    }

    public final void A02(C30451ab c30451ab) {
        int i = this.A00;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.A00 = 0;
            }
            this.A08.AWV(c30451ab);
        }
        A01();
        this.A00 = 0;
    }

    @Override // X.C14U
    public final C30451ab A5m() {
        throw new UnsupportedOperationException();
    }

    @Override // X.C14U
    public final void A7H() {
        this.A03 = null;
        this.A02 = null;
        this.A00 = 0;
        this.A09.A7H();
        this.A0A.A7H();
        A01();
    }

    @Override // X.C14U
    public final void A7W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.A0A.A7W(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.A09.A7W(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // X.C14U
    public final C0NH A7f(C0NH c0nh) {
        C227213r c227213r = c0nh.A00;
        Map map = this.A0B;
        C07K.A1b(map.containsKey(c227213r), "GoogleApiClient is not configured to use the API required for this call.");
        Object obj = map.get(c227213r);
        C39591qN c39591qN = this.A0A;
        if (obj.equals(c39591qN)) {
            C30451ab c30451ab = this.A03;
            if (c30451ab != null && c30451ab.A01 == 4) {
                InterfaceC30511ah interfaceC30511ah = this.A07;
                c0nh.A0D(new Status(1, 4, null, interfaceC30511ah == null ? null : PendingIntent.getActivity(this.A05, System.identityHashCode(this.A08), interfaceC30511ah.AD9(), 134217728)));
                return c0nh;
            }
            c39591qN.A7f(c0nh);
            return c0nh;
        }
        this.A09.A7f(c0nh);
        return c0nh;
    }

    @Override // X.C14U
    public final C0NH A7i(C0NH c0nh) {
        C227213r c227213r = c0nh.A00;
        Map map = this.A0B;
        C07K.A1b(map.containsKey(c227213r), "GoogleApiClient is not configured to use the API required for this call.");
        Object obj = map.get(c227213r);
        C39591qN c39591qN = this.A0A;
        if (obj.equals(c39591qN)) {
            C30451ab c30451ab = this.A03;
            if (c30451ab != null && c30451ab.A01 == 4) {
                InterfaceC30511ah interfaceC30511ah = this.A07;
                c0nh.A0D(new Status(1, 4, null, interfaceC30511ah == null ? null : PendingIntent.getActivity(this.A05, System.identityHashCode(this.A08), interfaceC30511ah.AD9(), 134217728)));
                return c0nh;
            }
            return c39591qN.A7i(c0nh);
        }
        return this.A09.A7i(c0nh);
    }

    @Override // X.C14U
    public final boolean AGQ(C14E c14e) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            lock.lock();
            boolean z = this.A00 == 2;
            lock.unlock();
            if (z || isConnected()) {
                C39591qN c39591qN = this.A0A;
                if (!(c39591qN.A0E instanceof C30591aq)) {
                    this.A0C.add(c14e);
                    if (this.A00 == 0) {
                        this.A00 = 1;
                    }
                    this.A03 = null;
                    c39591qN.A0E.connect();
                    return true;
                }
            }
            lock.unlock();
            return false;
        } finally {
            lock.unlock();
        }
    }

    @Override // X.C14U
    public final void AGR() {
        Lock lock = this.A0D;
        lock.lock();
        try {
            lock.lock();
            boolean z = this.A00 == 2;
            lock.unlock();
            this.A0A.A7H();
            this.A03 = new C30451ab(4);
            if (z) {
                new HandlerC234416q(this.A06).post(new Runnable() { // from class: X.14h
                    @Override // java.lang.Runnable
                    public final void run() {
                        C30861bI c30861bI = C30861bI.this;
                        Lock lock2 = c30861bI.A0D;
                        lock2.lock();
                        try {
                            C30861bI.A00(c30861bI);
                        } finally {
                            lock2.unlock();
                        }
                    }
                });
            } else {
                A01();
            }
        } finally {
            lock.unlock();
        }
    }

    @Override // X.C14U
    public final void connect() {
        this.A00 = 2;
        this.A04 = false;
        this.A03 = null;
        this.A02 = null;
        this.A09.A0E.connect();
        this.A0A.A0E.connect();
    }

    @Override // X.C14U
    public final boolean isConnected() {
        C30451ab c30451ab;
        Lock lock = this.A0D;
        lock.lock();
        try {
            boolean z = true;
            if (this.A09.A0E instanceof C30591aq) {
                if (!(this.A0A.A0E instanceof C30591aq) && ((c30451ab = this.A03) == null || c30451ab.A01 != 4)) {
                    if (this.A00 == 1) {
                    }
                }
                return z;
            }
            z = false;
            return z;
        } finally {
            lock.unlock();
        }
    }
}
