package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1b1 */
/* loaded from: classes.dex */
public final class C30691b1 extends C0NE implements C14V {
    public C14S A02;
    public final int A06;
    public final Context A07;
    public final Looper A08;
    public final C06210Ry A09;
    public final AbstractC30501ag A0A;
    public final HandlerC30741b6 A0C;
    public final C227914a A0D;
    public final C230114w A0E;
    public final InterfaceC230414z A0F;
    public final AnonymousClass150 A0G;
    public final ArrayList A0H;
    public final Map A0I;
    public final Map A0J;
    public final Lock A0L;
    public volatile boolean A0M;
    public C14U A03 = null;
    public final Queue A0K = new LinkedList();
    public long A00 = 120000;
    public long A01 = 5000;
    public Set A05 = new HashSet();
    public final C14D A0B = new C14D();
    public Integer A04 = null;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.1b6] */
    public C30691b1(Context context, Lock lock, Looper looper, C230114w c230114w, C06210Ry c06210Ry, AbstractC30501ag abstractC30501ag, Map map, List list, List list2, Map map2, ArrayList arrayList) {
        InterfaceC230414z interfaceC230414z = new InterfaceC230414z() { // from class: X.1b2
            {
                C30691b1.this = this;
            }

            @Override // X.InterfaceC230414z
            public final Bundle A91() {
                return null;
            }

            @Override // X.InterfaceC230414z
            public final boolean isConnected() {
                return C30691b1.this.A0B();
            }
        };
        this.A0F = interfaceC230414z;
        this.A07 = context;
        this.A0L = lock;
        this.A0G = new AnonymousClass150(looper, interfaceC230414z);
        this.A08 = looper;
        this.A0C = new HandlerC234416q(looper) { // from class: X.1b6
            {
                C30691b1.this = this;
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("Unknown message id: ");
                        sb.append(i);
                        Log.w("GoogleApiClientImpl", sb.toString());
                        return;
                    }
                    C30691b1.A01(C30691b1.this);
                    return;
                }
                C30691b1 c30691b1 = C30691b1.this;
                Lock lock2 = c30691b1.A0L;
                lock2.lock();
                try {
                    if (c30691b1.A0F()) {
                        c30691b1.A0G.A08 = true;
                        c30691b1.A03.connect();
                    }
                } finally {
                    lock2.unlock();
                }
            }
        };
        this.A09 = c06210Ry;
        this.A06 = -1;
        this.A0I = map;
        this.A0J = map2;
        this.A0H = arrayList;
        this.A0D = new C227914a(map2);
        for (Object obj : list) {
            AnonymousClass150 anonymousClass150 = this.A0G;
            C07K.A1P(obj);
            synchronized (anonymousClass150.A03) {
                ArrayList arrayList2 = anonymousClass150.A04;
                if (arrayList2.contains(obj)) {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 62);
                    sb.append("registerConnectionCallbacks(): listener ");
                    sb.append(valueOf);
                    sb.append(" is already registered");
                    Log.w("GmsClientEvents", sb.toString());
                } else {
                    arrayList2.add(obj);
                }
            }
            if (anonymousClass150.A02.isConnected()) {
                Handler handler = anonymousClass150.A01;
                handler.sendMessage(handler.obtainMessage(1, obj));
            }
        }
        for (Object obj2 : list2) {
            AnonymousClass150 anonymousClass1502 = this.A0G;
            C07K.A1P(obj2);
            synchronized (anonymousClass1502.A03) {
                ArrayList arrayList3 = anonymousClass1502.A06;
                if (arrayList3.contains(obj2)) {
                    String valueOf2 = String.valueOf(obj2);
                    StringBuilder sb2 = new StringBuilder(valueOf2.length() + 67);
                    sb2.append("registerConnectionFailedListener(): listener ");
                    sb2.append(valueOf2);
                    sb2.append(" is already registered");
                    Log.w("GmsClientEvents", sb2.toString());
                } else {
                    arrayList3.add(obj2);
                }
            }
        }
        this.A0E = c230114w;
        this.A0A = abstractC30501ag;
    }

    public static int A00(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            InterfaceC30511ah interfaceC30511ah = (InterfaceC30511ah) it.next();
            if (interfaceC30511ah.ARg()) {
                z2 = true;
            }
            if (interfaceC30511ah.AQw()) {
                z3 = true;
            }
        }
        if (z2) {
            return (z3 && z) ? 2 : 1;
        }
        return 3;
    }

    public static void A01(C30691b1 c30691b1) {
        Lock lock = c30691b1.A0L;
        lock.lock();
        try {
            if (c30691b1.A0M) {
                c30691b1.A0G.A08 = true;
                c30691b1.A03.connect();
            }
        } finally {
            lock.unlock();
        }
    }

    @Override // X.C0NE
    public final Looper A02() {
        return this.A08;
    }

    @Override // X.C0NE
    public final C30451ab A03() {
        C07K.A1c(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        Lock lock = this.A0L;
        lock.lock();
        try {
            if (this.A06 >= 0) {
                C07K.A1c(this.A04 != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.A04;
                if (num == null) {
                    this.A04 = Integer.valueOf(A00(this.A0J.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            A0D(this.A04.intValue());
            this.A0G.A08 = true;
            return this.A03.A5m();
        } finally {
            lock.unlock();
        }
    }

    @Override // X.C0NE
    public final InterfaceC30511ah A04(C227213r c227213r) {
        InterfaceC30511ah interfaceC30511ah = (InterfaceC30511ah) this.A0J.get(c227213r);
        C07K.A1Q(interfaceC30511ah, "Appropriate Api was not requested.");
        return interfaceC30511ah;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.1qL, X.0NJ] */
    @Override // X.C0NE
    public final C0NJ A05() {
        C07K.A1c(A0B(), "GoogleApiClient is not connected yet.");
        C07K.A1c(this.A04.intValue() != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        final ?? r6 = new BasePendingResult(this) { // from class: X.1qL
            @Override // com.google.android.gms.common.api.internal.BasePendingResult
            public /* synthetic */ C08H A04(Status status) {
                return status;
            }
        };
        if (this.A0J.containsKey(C15P.A01)) {
            A07(new C18320tX(this)).A02(new C30731b5(this, r6, false, this));
            return r6;
        }
        final AtomicReference atomicReference = new AtomicReference();
        InterfaceC227813z interfaceC227813z = new InterfaceC227813z() { // from class: X.1b3
            {
                C30691b1.this = this;
            }

            @Override // X.InterfaceC227813z
            public final void AIw(int i) {
            }

            @Override // X.InterfaceC227813z
            public final void AIu(Bundle bundle) {
                C30691b1 c30691b1 = C30691b1.this;
                C0NE c0ne = (C0NE) atomicReference.get();
                c0ne.A07(new C18320tX(c0ne)).A02(new C30731b5(c30691b1, r6, true, c0ne));
            }
        };
        AnonymousClass140 anonymousClass140 = new AnonymousClass140() { // from class: X.1b4
            @Override // X.AnonymousClass140
            public final void AIv(C30451ab c30451ab) {
                A07(new Status(1, 8, null, null));
            }
        };
        C227713y c227713y = new C227713y(this.A07);
        c227713y.A01(C15P.A02);
        C07K.A1Q(interfaceC227813z, "Listener must not be null");
        c227713y.A07.add(interfaceC227813z);
        C07K.A1Q(anonymousClass140, "Listener must not be null");
        c227713y.A08.add(anonymousClass140);
        HandlerC30741b6 handlerC30741b6 = this.A0C;
        C07K.A1Q(handlerC30741b6, "Handler must not be null");
        c227713y.A01 = handlerC30741b6.getLooper();
        C0NE A00 = c227713y.A00();
        atomicReference.set(A00);
        A00.A09();
        return r6;
    }

    @Override // X.C0NE
    public final C0NH A06(C0NH c0nh) {
        String str;
        C227213r c227213r = c0nh.A00;
        C07K.A1b(c227213r != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.A0J.containsKey(c227213r);
        C227413u c227413u = c0nh.A01;
        if (c227413u != null) {
            str = c227413u.A02;
        } else {
            str = "the API";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        C07K.A1b(containsKey, sb.toString());
        Lock lock = this.A0L;
        lock.lock();
        try {
            C14U c14u = this.A03;
            if (c14u == null) {
                this.A0K.add(c0nh);
                return c0nh;
            }
            c14u.A7f(c0nh);
            return c0nh;
        } finally {
            lock.unlock();
        }
    }

    @Override // X.C0NE
    public final C0NH A07(C0NH c0nh) {
        String str;
        C227213r c227213r = c0nh.A00;
        C07K.A1b(c227213r != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.A0J.containsKey(c227213r);
        C227413u c227413u = c0nh.A01;
        if (c227413u != null) {
            str = c227413u.A02;
        } else {
            str = "the API";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        C07K.A1b(containsKey, sb.toString());
        Lock lock = this.A0L;
        lock.lock();
        try {
            if (this.A03 != null) {
                if (this.A0M) {
                    Queue queue = this.A0K;
                    queue.add(c0nh);
                    while (!queue.isEmpty()) {
                        C0NH c0nh2 = (C0NH) queue.remove();
                        C227914a c227914a = this.A0D;
                        c227914a.A02.add(c0nh2);
                        c0nh2.A0B.set(c227914a.A00);
                        c0nh2.A0D(Status.A05);
                    }
                    return c0nh;
                }
                return this.A03.A7i(c0nh);
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } finally {
            lock.unlock();
        }
    }

    @Override // X.C0NE
    public final void A08() {
        C14U c14u = this.A03;
        if (c14u != null) {
            c14u.AGR();
        }
    }

    @Override // X.C0NE
    public final void A09() {
        Lock lock = this.A0L;
        lock.lock();
        try {
            if (this.A06 < 0) {
                Integer num = this.A04;
                if (num == null) {
                    this.A04 = Integer.valueOf(A00(this.A0J.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            } else {
                C07K.A1c(this.A04 != null, "Sign-in mode should have been set explicitly by auto-manage.");
            }
            int intValue = this.A04.intValue();
            lock.lock();
            boolean z = true;
            if (intValue != 3 && intValue != 1 && intValue != 2) {
                z = false;
            }
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(intValue);
            C07K.A1b(z, sb.toString());
            A0D(intValue);
            this.A0G.A08 = true;
            this.A03.connect();
            lock.unlock();
        } finally {
            lock.unlock();
        }
    }

    @Override // X.C0NE
    public final void A0A() {
        BasePendingResult[] basePendingResultArr;
        boolean z;
        Lock lock = this.A0L;
        lock.lock();
        try {
            Set set = this.A0D.A02;
            for (BasePendingResult basePendingResult : (BasePendingResult[]) set.toArray(C227914a.A04)) {
                basePendingResult.A0B.set(null);
                synchronized (basePendingResult.A07) {
                    if (((C0NE) basePendingResult.A08.get()) == null || !basePendingResult.A05) {
                        basePendingResult.A05();
                    }
                    z = basePendingResult.A03;
                }
                if (z) {
                    set.remove(basePendingResult);
                }
            }
            C14U c14u = this.A03;
            if (c14u != null) {
                c14u.A7H();
            }
            Set<C14C> set2 = this.A0B.A00;
            for (C14C c14c : set2) {
                c14c.A02 = null;
            }
            set2.clear();
            Queue<C0NH> queue = this.A0K;
            for (C0NH c0nh : queue) {
                c0nh.A0B.set(null);
                c0nh.A05();
            }
            queue.clear();
            if (this.A03 == null) {
                return;
            }
            A0F();
            AnonymousClass150 anonymousClass150 = this.A0G;
            anonymousClass150.A08 = false;
            anonymousClass150.A07.incrementAndGet();
        } finally {
            lock.unlock();
        }
    }

    @Override // X.C0NE
    public final boolean A0B() {
        C14U c14u = this.A03;
        return c14u != null && c14u.isConnected();
    }

    @Override // X.C0NE
    public final boolean A0C(C14E c14e) {
        C14U c14u = this.A03;
        return c14u != null && c14u.AGQ(c14e);
    }

    public final void A0D(int i) {
        Integer num = this.A04;
        if (num == null) {
            this.A04 = Integer.valueOf(i);
        } else {
            int intValue = num.intValue();
            if (intValue != i) {
                String str = i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
                String str2 = intValue != 1 ? intValue != 2 ? intValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
                throw new IllegalStateException(C000200d.A08(str2.length() + str.length() + 51, "Cannot use sign-in mode: ", str, ". Mode was already set to ", str2));
            }
        }
        if (this.A03 != null) {
            return;
        }
        Map map = this.A0J;
        boolean z = false;
        boolean z2 = false;
        for (InterfaceC30511ah interfaceC30511ah : map.values()) {
            if (interfaceC30511ah.ARg()) {
                z = true;
            }
            if (interfaceC30511ah.AQw()) {
                z2 = true;
            }
        }
        int intValue2 = this.A04.intValue();
        if (intValue2 != 1) {
            if (intValue2 == 2 && z) {
                Context context = this.A07;
                Lock lock = this.A0L;
                Looper looper = this.A08;
                C06210Ry c06210Ry = this.A09;
                C230114w c230114w = this.A0E;
                Map map2 = this.A0I;
                AbstractC30501ag abstractC30501ag = this.A0A;
                ArrayList arrayList = this.A0H;
                C006702y c006702y = new C006702y();
                C006702y c006702y2 = new C006702y();
                InterfaceC30511ah interfaceC30511ah2 = null;
                for (Map.Entry entry : map.entrySet()) {
                    InterfaceC30511ah interfaceC30511ah3 = (InterfaceC30511ah) entry.getValue();
                    if (interfaceC30511ah3.AQw()) {
                        interfaceC30511ah2 = interfaceC30511ah3;
                    }
                    boolean ARg = interfaceC30511ah3.ARg();
                    Object key = entry.getKey();
                    if (ARg) {
                        c006702y.put(key, interfaceC30511ah3);
                    } else {
                        c006702y2.put(key, interfaceC30511ah3);
                    }
                }
                C07K.A1c(!c006702y.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
                C006702y c006702y3 = new C006702y();
                C006702y c006702y4 = new C006702y();
                for (C227413u c227413u : map2.keySet()) {
                    C227213r A00 = c227413u.A00();
                    if (c006702y.containsKey(A00)) {
                        c006702y3.put(c227413u, map2.get(c227413u));
                    } else if (c006702y2.containsKey(A00)) {
                        c006702y4.put(c227413u, map2.get(c227413u));
                    } else {
                        throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    C30841bG c30841bG = (C30841bG) obj;
                    if (c006702y3.containsKey(c30841bG.A01)) {
                        arrayList2.add(c30841bG);
                    } else if (c006702y4.containsKey(c30841bG.A01)) {
                        arrayList3.add(c30841bG);
                    } else {
                        throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                    }
                }
                this.A03 = new C30861bI(context, this, lock, looper, c06210Ry, c006702y, c006702y2, c230114w, abstractC30501ag, interfaceC30511ah2, arrayList2, arrayList3, c006702y3, c006702y4);
                return;
            }
        } else if (!z) {
            throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
        } else {
            if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        }
        this.A03 = new C39591qN(this.A07, this, this.A0L, this.A08, this.A09, map, this.A0E, this.A0I, this.A0A, this.A0H, this);
    }

    public final void A0E(PrintWriter printWriter) {
        printWriter.append("").append("mContext=").println(this.A07);
        printWriter.append("").append("mResuming=").print(this.A0M);
        printWriter.append(" mWorkQueue.size()=").print(this.A0K.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.A0D.A02.size());
        C14U c14u = this.A03;
        if (c14u != null) {
            c14u.A7W("", null, printWriter, null);
        }
    }

    public final boolean A0F() {
        if (this.A0M) {
            this.A0M = false;
            HandlerC30741b6 handlerC30741b6 = this.A0C;
            handlerC30741b6.removeMessages(2);
            handlerC30741b6.removeMessages(1);
            C14S c14s = this.A02;
            if (c14s != null) {
                c14s.A00();
                this.A02 = null;
            }
            return true;
        }
        return false;
    }

    @Override // X.C14V
    public final void AWS(int i, boolean z) {
        AtomicInteger atomicInteger;
        if (i == 1 && !z && !this.A0M) {
            this.A0M = true;
            if (this.A02 == null) {
                this.A02 = C06210Ry.A01(this.A07.getApplicationContext(), new C14T(this) { // from class: X.1b7
                    public WeakReference A00;

                    {
                        this.A00 = new WeakReference(this);
                    }

                    @Override // X.C14T
                    public final void A00() {
                        C30691b1 c30691b1 = (C30691b1) this.A00.get();
                        if (c30691b1 == null) {
                            return;
                        }
                        C30691b1.A01(c30691b1);
                    }
                });
            }
            HandlerC30741b6 handlerC30741b6 = this.A0C;
            handlerC30741b6.sendMessageDelayed(handlerC30741b6.obtainMessage(1), 120000L);
            handlerC30741b6.sendMessageDelayed(handlerC30741b6.obtainMessage(2), 5000L);
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.A0D.A02.toArray(C227914a.A04)) {
            basePendingResult.A09(C227914a.A03);
        }
        AnonymousClass150 anonymousClass150 = this.A0G;
        if (anonymousClass150 != null) {
            Looper myLooper = Looper.myLooper();
            Handler handler = anonymousClass150.A01;
            C07K.A1c(myLooper == handler.getLooper(), "onUnintentionalDisconnection must only be called on the Handler thread");
            handler.removeMessages(1);
            synchronized (anonymousClass150.A03) {
                anonymousClass150.A00 = true;
                ArrayList arrayList = anonymousClass150.A04;
                ArrayList arrayList2 = new ArrayList(arrayList);
                atomicInteger = anonymousClass150.A07;
                int i2 = atomicInteger.get();
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    InterfaceC227813z interfaceC227813z = (InterfaceC227813z) obj;
                    if (!anonymousClass150.A08 || atomicInteger.get() != i2) {
                        break;
                    } else if (arrayList.contains(interfaceC227813z)) {
                        interfaceC227813z.AIw(i);
                    }
                }
                anonymousClass150.A05.clear();
                anonymousClass150.A00 = false;
            }
            anonymousClass150.A08 = false;
            atomicInteger.incrementAndGet();
            if (i == 2) {
                anonymousClass150.A08 = true;
                this.A03.connect();
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.C14V
    public final void AWT(Bundle bundle) {
        while (true) {
            Queue queue = this.A0K;
            if (queue.isEmpty()) {
                break;
            }
            A07((C0NH) queue.remove());
        }
        AnonymousClass150 anonymousClass150 = this.A0G;
        if (anonymousClass150 != null) {
            Looper myLooper = Looper.myLooper();
            Handler handler = anonymousClass150.A01;
            C07K.A1c(myLooper == handler.getLooper(), "onConnectionSuccess must only be called on the Handler thread");
            synchronized (anonymousClass150.A03) {
                C07K.A1a(anonymousClass150.A00 ? false : true);
                handler.removeMessages(1);
                anonymousClass150.A00 = true;
                ArrayList arrayList = anonymousClass150.A05;
                C07K.A1a(arrayList.size() == 0);
                ArrayList arrayList2 = new ArrayList(anonymousClass150.A04);
                AtomicInteger atomicInteger = anonymousClass150.A07;
                int i = atomicInteger.get();
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    InterfaceC227813z interfaceC227813z = (InterfaceC227813z) obj;
                    if (!anonymousClass150.A08 || !anonymousClass150.A02.isConnected() || atomicInteger.get() != i) {
                        break;
                    } else if (!arrayList.contains(interfaceC227813z)) {
                        interfaceC227813z.AIu(bundle);
                    }
                }
                arrayList.clear();
                anonymousClass150.A00 = false;
            }
            return;
        }
        throw null;
    }

    @Override // X.C14V
    public final void AWV(C30451ab c30451ab) {
        AtomicInteger atomicInteger;
        C06210Ry c06210Ry = this.A09;
        Context context = this.A07;
        int i = c30451ab.A01;
        if (c06210Ry != null) {
            if (!C0CL.A04(context, i)) {
                A0F();
            }
            if (!this.A0M) {
                AnonymousClass150 anonymousClass150 = this.A0G;
                if (anonymousClass150 != null) {
                    Looper myLooper = Looper.myLooper();
                    Handler handler = anonymousClass150.A01;
                    int i2 = 0;
                    C07K.A1c(myLooper == handler.getLooper(), "onConnectionFailure must only be called on the Handler thread");
                    handler.removeMessages(1);
                    synchronized (anonymousClass150.A03) {
                        ArrayList arrayList = anonymousClass150.A06;
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        atomicInteger = anonymousClass150.A07;
                        int i3 = atomicInteger.get();
                        int size = arrayList2.size();
                        while (i2 < size) {
                            Object obj = arrayList2.get(i2);
                            i2++;
                            AnonymousClass140 anonymousClass140 = (AnonymousClass140) obj;
                            if (!anonymousClass150.A08 || atomicInteger.get() != i3) {
                                break;
                            } else if (arrayList.contains(anonymousClass140)) {
                                anonymousClass140.AIv(c30451ab);
                            }
                        }
                    }
                    anonymousClass150.A08 = false;
                    atomicInteger.incrementAndGet();
                    return;
                }
                throw null;
            }
            return;
        }
        throw null;
    }
}
