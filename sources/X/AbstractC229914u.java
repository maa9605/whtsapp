package X;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.IGmsCallbacks;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.14u */
/* loaded from: classes.dex */
public abstract class AbstractC229914u {
    public static final C30461ac[] A0P = new C30461ac[0];
    public int A00;
    public int A01;
    public long A03;
    public long A04;
    public long A05;
    public IInterface A06;
    public InterfaceC229514q A08;
    public ServiceConnectionC229814t A09;
    public IGmsServiceBroker A0A;
    public C230515a A0B;
    public final int A0E;
    public final Context A0F;
    public final Handler A0G;
    public final InterfaceC229314o A0H;
    public final InterfaceC229414p A0I;
    public final AnonymousClass152 A0J;
    public final String A0M;
    public final Object A0K = new Object();
    public final Object A0L = new Object();
    public final ArrayList A0N = new ArrayList();
    public int A02 = 1;
    public C30451ab A07 = null;
    public boolean A0D = false;
    public volatile C31151bn A0O = null;
    public AtomicInteger A0C = new AtomicInteger(0);

    public abstract IInterface A03(IBinder iBinder);

    public String A04() {
        return "com.google.android.gms";
    }

    public abstract String A05();

    public abstract String A06();

    public Bundle A91() {
        return null;
    }

    public boolean AQw() {
        return false;
    }

    public boolean ARf() {
        return true;
    }

    public boolean ARg() {
        return false;
    }

    public AbstractC229914u(Context context, Looper looper, AnonymousClass152 anonymousClass152, C06220Rz c06220Rz, int i, InterfaceC229314o interfaceC229314o, InterfaceC229414p interfaceC229414p, String str) {
        C07K.A1Q(context, "Context must not be null");
        this.A0F = context;
        C07K.A1Q(looper, "Looper must not be null");
        C07K.A1Q(anonymousClass152, "Supervisor must not be null");
        this.A0J = anonymousClass152;
        C07K.A1Q(c06220Rz, "API availability must not be null");
        this.A0G = new HandlerC234616t(looper) { // from class: X.1bW
            {
                AbstractC229914u.this = this;
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object obj;
                AbstractC229914u abstractC229914u = AbstractC229914u.this;
                if (abstractC229914u.A0C.get() != message.arg1) {
                    int i2 = message.what;
                    if (i2 == 2 || i2 == 1 || i2 == 7) {
                        AbstractC229714s abstractC229714s = (AbstractC229714s) message.obj;
                        if (abstractC229714s != null) {
                            abstractC229714s.A00();
                            return;
                        }
                        throw null;
                    }
                    return;
                }
                int i3 = message.what;
                if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !abstractC229914u.AF9()) {
                    AbstractC229714s abstractC229714s2 = (AbstractC229714s) message.obj;
                    if (abstractC229714s2 != null) {
                        abstractC229714s2.A00();
                        return;
                    }
                    throw null;
                }
                int i4 = message.what;
                if (i4 == 4) {
                    abstractC229914u.A07 = new C30451ab(message.arg2);
                    if (!abstractC229914u.A0D) {
                        String A05 = abstractC229914u.A05();
                        if (!TextUtils.isEmpty(A05) && !TextUtils.isEmpty(null)) {
                            try {
                                Class.forName(A05);
                                if (!abstractC229914u.A0D) {
                                    abstractC229914u.A08(3, null);
                                    return;
                                }
                            } catch (ClassNotFoundException unused) {
                            }
                        }
                    }
                    C30451ab c30451ab = abstractC229914u.A07;
                    if (c30451ab == null) {
                        c30451ab = new C30451ab(8);
                    }
                    abstractC229914u.A08.ANu(c30451ab);
                    abstractC229914u.A09(c30451ab);
                } else if (i4 == 5) {
                    C30451ab c30451ab2 = abstractC229914u.A07;
                    if (c30451ab2 == null) {
                        c30451ab2 = new C30451ab(8);
                    }
                    abstractC229914u.A08.ANu(c30451ab2);
                    abstractC229914u.A09(c30451ab2);
                } else if (i4 == 3) {
                    Object obj2 = message.obj;
                    C30451ab c30451ab3 = new C30451ab(message.arg2, obj2 instanceof PendingIntent ? (PendingIntent) obj2 : null);
                    abstractC229914u.A08.ANu(c30451ab3);
                    abstractC229914u.A09(c30451ab3);
                } else if (i4 == 6) {
                    abstractC229914u.A08(5, null);
                    InterfaceC229314o interfaceC229314o2 = abstractC229914u.A0H;
                    if (interfaceC229314o2 != null) {
                        ((C31121bk) interfaceC229314o2).A00.AIw(message.arg2);
                    }
                    abstractC229914u.A00 = message.arg2;
                    abstractC229914u.A03 = System.currentTimeMillis();
                    AbstractC229914u.A00(abstractC229914u, 5, 1, null);
                } else if (i4 == 2 && !abstractC229914u.isConnected()) {
                    AbstractC229714s abstractC229714s3 = (AbstractC229714s) message.obj;
                    if (abstractC229714s3 == null) {
                        throw null;
                    }
                    abstractC229714s3.A00();
                } else {
                    int i5 = message.what;
                    if (i5 != 2 && i5 != 1 && i5 != 7) {
                        Log.wtf("GmsClient", C000200d.A07(45, "Don't know how to handle message: ", i5), new Exception());
                        return;
                    }
                    AbstractC229714s abstractC229714s4 = (AbstractC229714s) message.obj;
                    synchronized (abstractC229714s4) {
                        obj = abstractC229714s4.A00;
                        if (abstractC229714s4.A01) {
                            String valueOf = String.valueOf(abstractC229714s4);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                            sb.append("Callback proxy ");
                            sb.append(valueOf);
                            sb.append(" being reused. This is not safe.");
                            Log.w("GmsClient", sb.toString());
                        }
                    }
                    if (obj != null) {
                        try {
                            abstractC229714s4.A01(obj);
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    }
                    synchronized (abstractC229714s4) {
                        abstractC229714s4.A01 = true;
                    }
                    abstractC229714s4.A00();
                }
            }
        };
        this.A0E = i;
        this.A0H = interfaceC229314o;
        this.A0I = interfaceC229414p;
        this.A0M = str;
    }

    public static boolean A00(AbstractC229914u abstractC229914u, int i, int i2, IInterface iInterface) {
        synchronized (abstractC229914u.A0K) {
            if (abstractC229914u.A02 != i) {
                return false;
            }
            abstractC229914u.A08(i2, iInterface);
            return true;
        }
    }

    public Bundle A01() {
        return new Bundle();
    }

    public final IInterface A02() {
        IInterface iInterface;
        synchronized (this.A0K) {
            if (this.A02 != 5) {
                if (isConnected()) {
                    C07K.A1c(this.A06 != null, "Client is connected but service is null");
                    iInterface = this.A06;
                } else {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
            } else {
                throw new DeadObjectException();
            }
        }
        return iInterface;
    }

    public void A07(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.A0G;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new AbstractC30971bV(i, iBinder, bundle) { // from class: X.1qS
            public final IBinder A00;

            {
                AbstractC229914u.this = this;
                this.A00 = iBinder;
            }

            @Override // X.AbstractC30971bV
            public final void A02(C30451ab c30451ab) {
                AbstractC229914u abstractC229914u = AbstractC229914u.this;
                InterfaceC229414p interfaceC229414p = abstractC229914u.A0I;
                if (interfaceC229414p != null) {
                    ((C31131bl) interfaceC229414p).A00.AIv(c30451ab);
                }
                abstractC229914u.A09(c30451ab);
            }

            @Override // X.AbstractC30971bV
            public final boolean A03() {
                try {
                    IBinder iBinder2 = this.A00;
                    String interfaceDescriptor = iBinder2.getInterfaceDescriptor();
                    AbstractC229914u abstractC229914u = AbstractC229914u.this;
                    String A05 = abstractC229914u.A05();
                    if (!A05.equals(interfaceDescriptor)) {
                        Log.e("GmsClient", C000200d.A08(C000200d.A00(interfaceDescriptor, C000200d.A00(A05, 34)), "service descriptor mismatch: ", A05, " vs. ", interfaceDescriptor));
                        return false;
                    }
                    IInterface A03 = abstractC229914u.A03(iBinder2);
                    if (A03 == null || !(AbstractC229914u.A00(abstractC229914u, 2, 4, A03) || AbstractC229914u.A00(abstractC229914u, 3, 4, A03))) {
                        return false;
                    }
                    abstractC229914u.A07 = null;
                    InterfaceC229314o interfaceC229314o = abstractC229914u.A0H;
                    if (interfaceC229314o != null) {
                        ((C31121bk) interfaceC229314o).A00.AIu(null);
                        return true;
                    }
                    return true;
                } catch (RemoteException unused) {
                    Log.w("GmsClient", "service probably died");
                    return false;
                }
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.14t] */
    public final void A08(int i, IInterface iInterface) {
        C230515a c230515a;
        C07K.A1Y((i == 4) == (iInterface != null));
        synchronized (this.A0K) {
            this.A02 = i;
            this.A06 = iInterface;
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (this.A09 != null && (c230515a = this.A0B) != null) {
                        String str = c230515a.A02;
                        String str2 = c230515a.A01;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 70 + String.valueOf(str2).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str);
                        sb.append(" on ");
                        sb.append(str2);
                        Log.e("GmsClient", sb.toString());
                        AnonymousClass152 anonymousClass152 = this.A0J;
                        C230515a c230515a2 = this.A0B;
                        String str3 = c230515a2.A02;
                        String str4 = c230515a2.A01;
                        ServiceConnectionC229814t serviceConnectionC229814t = this.A09;
                        String str5 = this.A0M;
                        if (str5 == null) {
                            str5 = this.A0F.getClass().getName();
                        }
                        if (anonymousClass152 == null) {
                            throw null;
                        }
                        anonymousClass152.A01(new AnonymousClass151(str3, str4), serviceConnectionC229814t, str5);
                        this.A0C.incrementAndGet();
                    }
                    this.A09 = new ServiceConnection(this.A0C.get()) { // from class: X.14t
                        public final int A00;

                        {
                            AbstractC229914u.this = this;
                            this.A00 = r2;
                        }

                        @Override // android.content.ServiceConnection
                        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                            boolean z;
                            if (iBinder == null) {
                                AbstractC229914u abstractC229914u = AbstractC229914u.this;
                                synchronized (abstractC229914u.A0K) {
                                    z = abstractC229914u.A02 == 3;
                                }
                                int i2 = 4;
                                if (z) {
                                    i2 = 5;
                                    abstractC229914u.A0D = true;
                                }
                                Handler handler = abstractC229914u.A0G;
                                handler.sendMessage(handler.obtainMessage(i2, abstractC229914u.A0C.get(), 16));
                                return;
                            }
                            AbstractC229914u abstractC229914u2 = AbstractC229914u.this;
                            synchronized (abstractC229914u2.A0L) {
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                                abstractC229914u2.A0A = (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) ? new IGmsServiceBroker(iBinder) { // from class: X.1ba
                                    public final IBinder A00;

                                    {
                                        this.A00 = iBinder;
                                    }

                                    @Override // com.google.android.gms.common.internal.IGmsServiceBroker
                                    public final void AD5(IGmsCallbacks iGmsCallbacks, C31001bY c31001bY) {
                                        Parcel obtain = Parcel.obtain();
                                        Parcel obtain2 = Parcel.obtain();
                                        try {
                                            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                                            obtain.writeStrongBinder(iGmsCallbacks.asBinder());
                                            obtain.writeInt(1);
                                            c31001bY.writeToParcel(obtain, 0);
                                            this.A00.transact(46, obtain, obtain2, 0);
                                            obtain2.readException();
                                        } finally {
                                            obtain2.recycle();
                                            obtain.recycle();
                                        }
                                    }

                                    @Override // android.os.IInterface
                                    public final IBinder asBinder() {
                                        return this.A00;
                                    }
                                } : (IGmsServiceBroker) queryLocalInterface;
                            }
                            int i3 = this.A00;
                            Handler handler2 = abstractC229914u2.A0G;
                            handler2.sendMessage(handler2.obtainMessage(7, i3, -1, new C39651qT(abstractC229914u2, 0)));
                        }

                        @Override // android.content.ServiceConnection
                        public final void onServiceDisconnected(ComponentName componentName) {
                            AbstractC229914u abstractC229914u = AbstractC229914u.this;
                            synchronized (abstractC229914u.A0L) {
                                abstractC229914u.A0A = null;
                            }
                            Handler handler = abstractC229914u.A0G;
                            handler.sendMessage(handler.obtainMessage(6, this.A00, 1));
                        }
                    };
                    C230515a c230515a3 = new C230515a(A04(), A06());
                    this.A0B = c230515a3;
                    AnonymousClass152 anonymousClass1522 = this.A0J;
                    String str6 = c230515a3.A02;
                    String str7 = c230515a3.A01;
                    ServiceConnectionC229814t serviceConnectionC229814t2 = this.A09;
                    String str8 = this.A0M;
                    if (str8 == null) {
                        str8 = this.A0F.getClass().getName();
                    }
                    if (!anonymousClass1522.A02(new AnonymousClass151(str6, str7), serviceConnectionC229814t2, str8)) {
                        C230515a c230515a4 = this.A0B;
                        String str9 = c230515a4.A02;
                        String str10 = c230515a4.A01;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str9).length() + 34 + String.valueOf(str10).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str9);
                        sb2.append(" on ");
                        sb2.append(str10);
                        Log.e("GmsClient", sb2.toString());
                        int i2 = this.A0C.get();
                        Handler handler = this.A0G;
                        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C39651qT(this, 16)));
                    }
                } else if (i == 4) {
                    this.A04 = System.currentTimeMillis();
                }
            } else if (this.A09 != null) {
                AnonymousClass152 anonymousClass1523 = this.A0J;
                String A06 = A06();
                String A04 = A04();
                ServiceConnectionC229814t serviceConnectionC229814t3 = this.A09;
                String str11 = this.A0M;
                if (str11 == null) {
                    str11 = this.A0F.getClass().getName();
                }
                if (anonymousClass1523 != null) {
                    anonymousClass1523.A01(new AnonymousClass151(A06, A04), serviceConnectionC229814t3, str11);
                    this.A09 = null;
                } else {
                    throw null;
                }
            }
        }
    }

    public void A09(C30451ab c30451ab) {
        this.A01 = c30451ab.A01;
        this.A05 = System.currentTimeMillis();
    }

    public void A6Q(InterfaceC229514q interfaceC229514q) {
        C07K.A1Q(interfaceC229514q, "Connection progress callbacks cannot be null.");
        this.A08 = interfaceC229514q;
        A08(2, null);
    }

    public void A7H() {
        this.A0C.incrementAndGet();
        ArrayList arrayList = this.A0N;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AbstractC229714s abstractC229714s = (AbstractC229714s) arrayList.get(i);
                synchronized (abstractC229714s) {
                    abstractC229714s.A00 = null;
                }
            }
            arrayList.clear();
        }
        synchronized (this.A0L) {
            this.A0A = null;
        }
        A08(1, null);
    }

    public void A7W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.A0K) {
            i = this.A02;
            iInterface = this.A06;
        }
        synchronized (this.A0L) {
            iGmsServiceBroker = this.A0A;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) A05()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.A04 > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.A04;
            String format = simpleDateFormat.format(new Date(j));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.A03 > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.A00;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 != 2) {
                printWriter.append((CharSequence) String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_NETWORK_LOST");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.A03;
            String format2 = simpleDateFormat.format(new Date(j2));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.A05 > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) C07K.A0t(this.A01));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.A05;
            String format3 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public final C30461ac[] A8S() {
        C31151bn c31151bn = this.A0O;
        if (c31151bn == null) {
            return null;
        }
        return c31151bn.A01;
    }

    public String A9x() {
        C230515a c230515a;
        if (isConnected() && (c230515a = this.A0B) != null) {
            return c230515a.A01;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public void ACl(IAccountAccessor iAccountAccessor, Set set) {
        Bundle A01 = A01();
        C31001bY c31001bY = new C31001bY(this.A0E);
        c31001bY.A04 = this.A0F.getPackageName();
        c31001bY.A02 = A01;
        if (set != null) {
            c31001bY.A08 = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (ARg()) {
            c31001bY.A01 = new Account("<<default account>>", "com.google");
            if (iAccountAccessor != null) {
                c31001bY.A03 = iAccountAccessor.asBinder();
            }
        }
        C30461ac[] c30461acArr = A0P;
        c31001bY.A06 = c30461acArr;
        c31001bY.A07 = c30461acArr;
        try {
            synchronized (this.A0L) {
                IGmsServiceBroker iGmsServiceBroker = this.A0A;
                if (iGmsServiceBroker != null) {
                    iGmsServiceBroker.AD5(new BinderC39631qR(this, this.A0C.get()), c31001bY);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            Handler handler = this.A0G;
            handler.sendMessage(handler.obtainMessage(6, this.A0C.get(), 1));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            A07(8, null, null, this.A0C.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            A07(8, null, null, this.A0C.get());
        }
    }

    public Intent AD9() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x000a, code lost:
        if (r2 == 3) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AF9() {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A0K
            monitor-enter(r3)
            int r2 = r4.A02     // Catch: java.lang.Throwable -> Lf
            r0 = 2
            if (r2 == r0) goto Lc
            r1 = 3
            r0 = 0
            if (r2 != r1) goto Ld
        Lc:
            r0 = 1
        Ld:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lf
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lf
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC229914u.AF9():boolean");
    }

    public void AQF(InterfaceC229614r interfaceC229614r) {
        final C30781bA c30781bA = (C30781bA) interfaceC229614r;
        c30781bA.A00.A0C.A05.post(new Runnable() { // from class: X.14Q
            @Override // java.lang.Runnable
            public final void run() {
                c30781bA.A00.A04.A7H();
            }
        });
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.A0K) {
            z = this.A02 == 4;
        }
        return z;
    }
}
