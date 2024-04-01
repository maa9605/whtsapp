package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1qN */
/* loaded from: classes.dex */
public final class C39591qN implements C14U, InterfaceC30851bH {
    public int A00;
    public final Context A02;
    public final C06220Rz A03;
    public final AbstractC30501ag A04;
    public final C30691b1 A05;
    public final HandlerC30761b8 A06;
    public final C14V A07;
    public final C230114w A08;
    public final Map A09;
    public final Map A0A;
    public final Condition A0C;
    public final Lock A0D;
    public volatile C14K A0E;
    public final Map A0B = new HashMap();
    public C30451ab A01 = null;

    @Override // X.C14U
    public final boolean AGQ(C14E c14e) {
        return false;
    }

    @Override // X.C14U
    public final void AGR() {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1b8] */
    public C39591qN(Context context, C30691b1 c30691b1, Lock lock, Looper looper, C06220Rz c06220Rz, Map map, C230114w c230114w, Map map2, AbstractC30501ag abstractC30501ag, ArrayList arrayList, C14V c14v) {
        this.A02 = context;
        this.A0D = lock;
        this.A03 = c06220Rz;
        this.A0A = map;
        this.A08 = c230114w;
        this.A09 = map2;
        this.A04 = abstractC30501ag;
        this.A05 = c30691b1;
        this.A07 = c14v;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C30841bG) obj).A00 = this;
        }
        this.A06 = new HandlerC234416q(looper) { // from class: X.1b8
            {
                C39591qN.this = this;
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 != 2) {
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("Unknown message id: ");
                        sb.append(i2);
                        Log.w("GACStateManager", sb.toString());
                        return;
                    }
                    throw ((Throwable) message.obj);
                }
                C14L c14l = (C14L) message.obj;
                C39591qN c39591qN = C39591qN.this;
                if (c14l != null) {
                    Lock lock2 = c39591qN.A0D;
                    lock2.lock();
                    try {
                        if (c39591qN.A0E != c14l.A00) {
                            return;
                        }
                        c14l.A00();
                        return;
                    } finally {
                        lock2.unlock();
                    }
                }
                throw null;
            }
        };
        this.A0C = lock.newCondition();
        this.A0E = new C1b0(this);
    }

    public final void A00(C30451ab c30451ab) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A01 = c30451ab;
            this.A0E = new C1b0(this);
            this.A0E.A5f();
            this.A0C.signalAll();
        } finally {
            lock.unlock();
        }
    }

    @Override // X.C14U
    public final C30451ab A5m() {
        this.A0E.connect();
        while (this.A0E instanceof C30611as) {
            try {
                this.A0C.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new C30451ab(15, null);
            }
        }
        if (this.A0E instanceof C30591aq) {
            return C30451ab.A04;
        }
        C30451ab c30451ab = this.A01;
        return c30451ab != null ? c30451ab : new C30451ab(13, null);
    }

    @Override // X.C14U
    public final void A7H() {
        if (this.A0E.A7J()) {
            this.A0B.clear();
        }
    }

    @Override // X.C14U
    public final void A7W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.A0E);
        for (C227413u c227413u : this.A09.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) c227413u.A02).println(":");
            ((InterfaceC30511ah) this.A0A.get(c227413u.A00())).A7W(concat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // X.C14U
    public final C0NH A7f(C0NH c0nh) {
        c0nh.A06();
        this.A0E.A7f(c0nh);
        return c0nh;
    }

    @Override // X.C14U
    public final C0NH A7i(C0NH c0nh) {
        c0nh.A06();
        return this.A0E.A7i(c0nh);
    }

    @Override // X.InterfaceC227813z
    public final void AIu(Bundle bundle) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.AIu(bundle);
        } finally {
            lock.unlock();
        }
    }

    @Override // X.InterfaceC227813z
    public final void AIw(int i) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.AIw(i);
        } finally {
            lock.unlock();
        }
    }

    @Override // X.InterfaceC30851bH
    public final void AWL(C30451ab c30451ab, C227413u c227413u, boolean z) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.AWL(c30451ab, c227413u, z);
        } finally {
            lock.unlock();
        }
    }

    @Override // X.C14U
    public final void connect() {
        this.A0E.connect();
    }

    @Override // X.C14U
    public final boolean isConnected() {
        return this.A0E instanceof C30591aq;
    }
}
