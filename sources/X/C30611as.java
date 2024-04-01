package X;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1as */
/* loaded from: classes.dex */
public final class C30611as implements C14K {
    public int A00;
    public int A02;
    public C30451ab A03;
    public IAccountAccessor A04;
    public InterfaceC33101fM A05;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Context A0C;
    public final C06220Rz A0E;
    public final AbstractC30501ag A0F;
    public final C39591qN A0G;
    public final C230114w A0H;
    public final Map A0I;
    public final Lock A0K;
    public int A01 = 0;
    public final Bundle A0D = new Bundle();
    public final Set A0J = new HashSet();
    public ArrayList A06 = new ArrayList();

    public C30611as(C39591qN c39591qN, C230114w c230114w, Map map, C06220Rz c06220Rz, AbstractC30501ag abstractC30501ag, Lock lock, Context context) {
        this.A0G = c39591qN;
        this.A0H = c230114w;
        this.A0I = map;
        this.A0E = c06220Rz;
        this.A0F = abstractC30501ag;
        this.A0K = lock;
        this.A0C = context;
    }

    @Override // X.C14K
    public final void connect() {
    }

    public final void A00() {
        if (this.A02 != 0) {
            return;
        }
        if (!this.A08 || this.A09) {
            ArrayList arrayList = new ArrayList();
            this.A01 = 1;
            C39591qN c39591qN = this.A0G;
            Map map = c39591qN.A0A;
            this.A02 = map.size();
            for (Object obj : map.keySet()) {
                if (c39591qN.A0B.containsKey(obj)) {
                    if (A06()) {
                        A01();
                    }
                } else {
                    arrayList.add(map.get(obj));
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.A06.add(C14M.A00.submit(new C14I(arrayList) { // from class: X.1ax
                public final ArrayList A00;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(this);
                    C30611as.this = this;
                    this.A00 = arrayList;
                }

                @Override // X.C14I
                public final void A00() {
                    Set hashSet;
                    C30611as c30611as = C30611as.this;
                    C39591qN c39591qN2 = c30611as.A0G;
                    C30691b1 c30691b1 = c39591qN2.A05;
                    C230114w c230114w = c30611as.A0H;
                    if (c230114w == null) {
                        hashSet = Collections.emptySet();
                    } else {
                        hashSet = new HashSet(c230114w.A05);
                        Map map2 = c230114w.A04;
                        for (C227413u c227413u : map2.keySet()) {
                            if (!c39591qN2.A0B.containsKey(c227413u.A00())) {
                                map2.get(c227413u);
                                throw null;
                            }
                        }
                    }
                    c30691b1.A05 = hashSet;
                    ArrayList arrayList2 = this.A00;
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList2.get(i);
                        i++;
                        ((InterfaceC30511ah) obj2).ACl(c30611as.A04, c30691b1.A05);
                    }
                }
            }));
        }
    }

    public final void A01() {
        C39591qN c39591qN = this.A0G;
        Lock lock = c39591qN.A0D;
        lock.lock();
        try {
            c39591qN.A05.A0F();
            c39591qN.A0E = new C30591aq(c39591qN);
            c39591qN.A0E.A5f();
            c39591qN.A0C.signalAll();
            lock.unlock();
            C14M.A00.execute(new Runnable() { // from class: X.14H
                {
                    C30611as.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C30611as c30611as = C30611as.this;
                    C06220Rz c06220Rz = c30611as.A0E;
                    Context context = c30611as.A0C;
                    if (c06220Rz != null) {
                        if (C0CL.A02.getAndSet(true)) {
                            return;
                        }
                        try {
                            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                            if (notificationManager != null) {
                                notificationManager.cancel(10436);
                                return;
                            }
                            return;
                        } catch (SecurityException unused) {
                            return;
                        }
                    }
                    throw null;
                }
            });
            InterfaceC33101fM interfaceC33101fM = this.A05;
            if (interfaceC33101fM != null) {
                if (this.A0A) {
                    interfaceC33101fM.AWN(this.A04, this.A0B);
                }
                A05(false);
            }
            for (Object obj : c39591qN.A0B.keySet()) {
                ((InterfaceC30511ah) c39591qN.A0A.get(obj)).A7H();
            }
            Bundle bundle = this.A0D;
            if (bundle.isEmpty()) {
                bundle = null;
            }
            c39591qN.A07.AWT(bundle);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public final void A02() {
        this.A08 = false;
        C39591qN c39591qN = this.A0G;
        c39591qN.A05.A05 = Collections.emptySet();
        for (Object obj : this.A0J) {
            Map map = c39591qN.A0B;
            if (!map.containsKey(obj)) {
                map.put(obj, new C30451ab(17, null));
            }
        }
    }

    public final void A03(C30451ab c30451ab) {
        ArrayList arrayList = this.A06;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Future) obj).cancel(true);
        }
        this.A06.clear();
        A05(!c30451ab.A01());
        C39591qN c39591qN = this.A0G;
        c39591qN.A00(c30451ab);
        c39591qN.A07.AWV(c30451ab);
    }

    public final void A04(C30451ab c30451ab, C227413u c227413u, boolean z) {
        if (c227413u.A00 != null) {
            if ((!z || c30451ab.A01() || this.A0E.A01(null, c30451ab.A01, null) != null) && (this.A03 == null || Integer.MAX_VALUE < this.A00)) {
                this.A03 = c30451ab;
                this.A00 = Integer.MAX_VALUE;
            }
            this.A0G.A0B.put(c227413u.A00(), c30451ab);
            return;
        }
        throw null;
    }

    public final void A05(boolean z) {
        InterfaceC33101fM interfaceC33101fM = this.A05;
        if (interfaceC33101fM != null) {
            if (interfaceC33101fM.isConnected() && z) {
                this.A05.AWX();
            }
            this.A05.A7H();
            this.A04 = null;
        }
    }

    public final boolean A06() {
        int i = this.A02 - 1;
        this.A02 = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            C30691b1 c30691b1 = this.A0G.A05;
            if (c30691b1 != null) {
                StringWriter stringWriter = new StringWriter();
                c30691b1.A0E(new PrintWriter(stringWriter));
                Log.w("GoogleApiClientConnecting", stringWriter.toString());
                Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
                A03(new C30451ab(8, null));
                return false;
            }
            throw null;
        }
        C30451ab c30451ab = this.A03;
        if (c30451ab != null) {
            this.A0G.A00 = this.A00;
            A03(c30451ab);
            return false;
        }
        return true;
    }

    public final boolean A07(int i) {
        String str;
        if (this.A01 != i) {
            C30691b1 c30691b1 = this.A0G.A05;
            if (c30691b1 != null) {
                StringWriter stringWriter = new StringWriter();
                c30691b1.A0E(new PrintWriter(stringWriter));
                Log.w("GoogleApiClientConnecting", stringWriter.toString());
                String valueOf = String.valueOf(this);
                StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                sb.append("Unexpected callback in ");
                sb.append(valueOf);
                Log.w("GoogleApiClientConnecting", sb.toString());
                int i2 = this.A02;
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("mRemainingConnections=");
                sb2.append(i2);
                Log.w("GoogleApiClientConnecting", sb2.toString());
                int i3 = this.A01;
                String str2 = "UNKNOWN";
                if (i3 != 0) {
                    str = "STEP_GETTING_REMOTE_SERVICE";
                    if (i3 != 1) {
                        str = "UNKNOWN";
                    }
                } else {
                    str = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
                }
                if (i == 0) {
                    str2 = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
                } else if (i == 1) {
                    str2 = "STEP_GETTING_REMOTE_SERVICE";
                }
                Log.wtf("GoogleApiClientConnecting", C000200d.A08(str2.length() + str.length() + 70, "GoogleApiClient connecting is in step ", str, " but received callback for step ", str2), new Exception());
                A03(new C30451ab(8, null));
                return false;
            }
            throw null;
        }
        return true;
    }

    @Override // X.C14K
    public final void A5f() {
        C39591qN c39591qN = this.A0G;
        c39591qN.A0B.clear();
        this.A08 = false;
        this.A03 = null;
        this.A01 = 0;
        this.A07 = true;
        this.A09 = false;
        this.A0A = false;
        HashMap hashMap = new HashMap();
        Map map = this.A0I;
        for (C227413u c227413u : map.keySet()) {
            InterfaceC30511ah interfaceC30511ah = (InterfaceC30511ah) c39591qN.A0A.get(c227413u.A00());
            if (c227413u.A00 != null) {
                boolean booleanValue = ((Boolean) map.get(c227413u)).booleanValue();
                if (interfaceC30511ah.ARg()) {
                    this.A08 = true;
                    if (booleanValue) {
                        this.A0J.add(c227413u.A00());
                    } else {
                        this.A07 = false;
                    }
                }
                hashMap.put(interfaceC30511ah, new C30621at(this, c227413u, booleanValue));
            } else {
                throw null;
            }
        }
        if (this.A08) {
            C230114w c230114w = this.A0H;
            C30691b1 c30691b1 = c39591qN.A05;
            c230114w.A00 = Integer.valueOf(System.identityHashCode(c30691b1));
            C30681az c30681az = new C30681az(this);
            this.A05 = (InterfaceC33101fM) this.A0F.A01(this.A0C, c30691b1.A08, c230114w, c230114w.A01, c30681az, c30681az);
        }
        this.A02 = c39591qN.A0A.size();
        this.A06.add(C14M.A00.submit(new C30631au(this, hashMap)));
    }

    @Override // X.C14K
    public final boolean A7J() {
        ArrayList arrayList = this.A06;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Future) obj).cancel(true);
        }
        this.A06.clear();
        A05(true);
        this.A0G.A00(null);
        return true;
    }

    @Override // X.C14K
    public final C0NH A7f(C0NH c0nh) {
        this.A0G.A05.A0K.add(c0nh);
        return c0nh;
    }

    @Override // X.C14K
    public final C0NH A7i(C0NH c0nh) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // X.C14K
    public final void AIu(Bundle bundle) {
        if (A07(1)) {
            if (bundle != null) {
                this.A0D.putAll(bundle);
            }
            if (A06()) {
                A01();
            }
        }
    }

    @Override // X.C14K
    public final void AIw(int i) {
        A03(new C30451ab(8, null));
    }

    @Override // X.C14K
    public final void AWL(C30451ab c30451ab, C227413u c227413u, boolean z) {
        if (A07(1)) {
            A04(c30451ab, c227413u, z);
            if (A06()) {
                A01();
            }
        }
    }
}
