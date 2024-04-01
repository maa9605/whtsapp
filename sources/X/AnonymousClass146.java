package X;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.146 */
/* loaded from: classes.dex */
public class AnonymousClass146 implements Handler.Callback {
    public static AnonymousClass146 A0D;
    public static final Status A0E = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status A0F = new Status(4, "The user must be signed in to make this API call.");
    public static final Object A0G = new Object();
    public final Context A04;
    public final Handler A05;
    public final C06210Ry A06;
    public final AnonymousClass154 A07;
    public long A00 = 5000;
    public long A01 = 120000;
    public long A02 = 10000;
    public final AtomicInteger A0B = new AtomicInteger(1);
    public final AtomicInteger A0C = new AtomicInteger(0);
    public final Map A08 = new ConcurrentHashMap(5, 0.75f, 1);
    public C39581qM A03 = null;
    public final Set A09 = new AnonymousClass036(0);
    public final Set A0A = new AnonymousClass036(0);

    public static AnonymousClass146 A00(Context context) {
        AnonymousClass146 anonymousClass146;
        synchronized (A0G) {
            anonymousClass146 = A0D;
            if (anonymousClass146 == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                anonymousClass146 = new AnonymousClass146(context.getApplicationContext(), handlerThread.getLooper(), C06210Ry.A00);
                A0D = anonymousClass146;
            }
        }
        return anonymousClass146;
    }

    public AnonymousClass146(Context context, Looper looper, C06210Ry c06210Ry) {
        this.A04 = context;
        this.A05 = new HandlerC234416q(looper, this);
        this.A06 = c06210Ry;
        this.A07 = new AnonymousClass154(c06210Ry);
        Handler handler = this.A05;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public final void A01(C0ND c0nd) {
        C228114c c228114c = c0nd.A07;
        Map map = this.A08;
        C39561qK c39561qK = (C39561qK) map.get(c228114c);
        if (c39561qK == null) {
            c39561qK = new C39561qK(this, c0nd);
            map.put(c228114c, c39561qK);
        }
        if (c39561qK.A04.ARg()) {
            this.A0A.add(c228114c);
        }
        c39561qK.A00();
    }

    public final void A02(C39581qM c39581qM) {
        synchronized (A0G) {
            if (this.A03 != c39581qM) {
                this.A03 = c39581qM;
                this.A09.clear();
            }
            this.A09.addAll(c39581qM.A01);
        }
    }

    public final boolean A03(C30451ab c30451ab, int i) {
        PendingIntent activity;
        C06210Ry c06210Ry = this.A06;
        Context context = this.A04;
        if (c06210Ry != null) {
            if (c30451ab.A01()) {
                activity = c30451ab.A02;
            } else {
                Intent A01 = c06210Ry.A01(context, c30451ab.A01, null);
                if (A01 == null) {
                    return false;
                }
                activity = PendingIntent.getActivity(context, 0, A01, 134217728);
            }
            if (activity != null) {
                int i2 = c30451ab.A01;
                Intent intent = new Intent(context, GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                c06210Ry.A07(context, i2, PendingIntent.getActivity(context, 0, intent, 134217728));
                return true;
            }
            return false;
        }
        throw null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        C30461ac[] A06;
        Status status;
        int i = message.what;
        int i2 = 0;
        switch (i) {
            case 1:
                this.A02 = ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                Handler handler = this.A05;
                handler.removeMessages(12);
                for (Object obj : this.A08.keySet()) {
                    handler.sendMessageDelayed(handler.obtainMessage(12, obj), this.A02);
                }
                break;
            case 2:
                C228214d c228214d = (C228214d) message.obj;
                Iterator it = ((C06410Ta) c228214d.A02.keySet()).iterator();
                while (true) {
                    C06440Td c06440Td = (C06440Td) it;
                    if (!c06440Td.hasNext()) {
                        break;
                    } else {
                        C228114c c228114c = (C228114c) c06440Td.next();
                        C39561qK c39561qK = (C39561qK) this.A08.get(c228114c);
                        if (c39561qK == null) {
                            c228214d.A00(c228114c, new C30451ab(13), null);
                            break;
                        } else if (c39561qK.A04.isConnected()) {
                            c228214d.A00(c228114c, C30451ab.A04, c39561qK.A04.A9x());
                        } else {
                            C07K.A1F(c39561qK.A0C.A05);
                            if (c39561qK.A00 != null) {
                                C07K.A1F(c39561qK.A0C.A05);
                                c228214d.A00(c228114c, c39561qK.A00, null);
                            } else {
                                C07K.A1F(c39561qK.A0C.A05);
                                c39561qK.A0B.add(c228214d);
                                c39561qK.A00();
                            }
                        }
                    }
                }
            case 3:
                for (C39561qK c39561qK2 : this.A08.values()) {
                    C07K.A1F(c39561qK2.A0C.A05);
                    c39561qK2.A00 = null;
                    c39561qK2.A00();
                }
                break;
            case 4:
            case 8:
            case 13:
                C14W c14w = (C14W) message.obj;
                Map map = this.A08;
                C39561qK c39561qK3 = (C39561qK) map.get(c14w.A01.A07);
                if (c39561qK3 == null) {
                    C0ND c0nd = c14w.A01;
                    A01(c0nd);
                    c39561qK3 = (C39561qK) map.get(c0nd.A07);
                }
                if (c39561qK3.A04.ARg() && this.A0C.get() != c14w.A00) {
                    c14w.A02.A01(A0E);
                    c39561qK3.A04();
                    return true;
                }
                c39561qK3.A08(c14w.A02);
                return true;
            case 5:
                int i3 = message.arg1;
                C30451ab c30451ab = (C30451ab) message.obj;
                for (C39561qK c39561qK4 : this.A08.values()) {
                    if (c39561qK4.A02 == i3) {
                        C06210Ry c06210Ry = this.A06;
                        int i4 = c30451ab.A01;
                        if (c06210Ry != null) {
                            String A00 = C30451ab.A00(i4);
                            String str = c30451ab.A03;
                            c39561qK4.A07(new Status(17, C000200d.A08(C000200d.A00(str, C000200d.A00(A00, 69)), "Error resolution was canceled by the user, original error message: ", A00, ": ", str)));
                            return true;
                        }
                        throw null;
                    }
                }
                StringBuilder sb = new StringBuilder(76);
                sb.append("Could not find API instance ");
                sb.append(i3);
                sb.append(" while trying to fail enqueued calls.");
                Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                return true;
            case 6:
                Context context = this.A04;
                if (context.getApplicationContext() instanceof Application) {
                    C08Z.A00((Application) context.getApplicationContext());
                    C08Z c08z = C08Z.A04;
                    C08Y c08y = new C08Y() { // from class: X.1b9
                        {
                            AnonymousClass146.this = this;
                        }

                        @Override // X.C08Y
                        public final void AHi(boolean z) {
                            Handler handler2 = AnonymousClass146.this.A05;
                            handler2.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z)));
                        }
                    };
                    synchronized (c08z) {
                        c08z.A01.add(c08y);
                    }
                    AtomicBoolean atomicBoolean = c08z.A03;
                    if (!atomicBoolean.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            c08z.A02.set(true);
                        }
                    }
                    if (!c08z.A02.get()) {
                        this.A02 = 300000L;
                        return true;
                    }
                }
                break;
            case 7:
                A01((C0ND) message.obj);
                return true;
            case 9:
                Map map2 = this.A08;
                if (map2.containsKey(message.obj)) {
                    C39561qK c39561qK5 = (C39561qK) map2.get(message.obj);
                    C07K.A1F(c39561qK5.A0C.A05);
                    if (c39561qK5.A01) {
                        c39561qK5.A00();
                        return true;
                    }
                }
                break;
            case 10:
                Set<Object> set = this.A0A;
                for (Object obj2 : set) {
                    ((C39561qK) this.A08.remove(obj2)).A04();
                }
                set.clear();
                return true;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                Map map3 = this.A08;
                if (map3.containsKey(message.obj)) {
                    C39561qK c39561qK6 = (C39561qK) map3.get(message.obj);
                    AnonymousClass146 anonymousClass146 = c39561qK6.A0C;
                    Handler handler2 = anonymousClass146.A05;
                    C07K.A1F(handler2);
                    boolean z = c39561qK6.A01;
                    if (z) {
                        if (z) {
                            C228114c c228114c2 = c39561qK6.A07;
                            handler2.removeMessages(11, c228114c2);
                            handler2.removeMessages(9, c228114c2);
                            c39561qK6.A01 = false;
                        }
                        if (anonymousClass146.A06.A00(anonymousClass146.A04) == 18) {
                            status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                        }
                        c39561qK6.A07(status);
                        c39561qK6.A04.A7H();
                        return true;
                    }
                }
                break;
            case 12:
                Map map4 = this.A08;
                if (map4.containsKey(message.obj)) {
                    C39561qK c39561qK7 = (C39561qK) map4.get(message.obj);
                    C07K.A1F(c39561qK7.A0C.A05);
                    InterfaceC30511ah interfaceC30511ah = c39561qK7.A04;
                    if (interfaceC30511ah.isConnected() && c39561qK7.A09.size() == 0) {
                        C14G c14g = c39561qK7.A05;
                        if (c14g.A00.isEmpty() && c14g.A01.isEmpty()) {
                            interfaceC30511ah.A7H();
                            return true;
                        }
                        c39561qK7.A05();
                        return true;
                    }
                }
                break;
            case 14:
                throw null;
            case 15:
                AnonymousClass145 anonymousClass145 = (AnonymousClass145) message.obj;
                Map map5 = this.A08;
                if (map5.containsKey(anonymousClass145.A01)) {
                    C39561qK c39561qK8 = (C39561qK) map5.get(anonymousClass145.A01);
                    if (c39561qK8.A08.contains(anonymousClass145) && !c39561qK8.A01) {
                        if (!c39561qK8.A04.isConnected()) {
                            c39561qK8.A00();
                            return true;
                        }
                        c39561qK8.A03();
                        return true;
                    }
                }
                break;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                AnonymousClass145 anonymousClass1452 = (AnonymousClass145) message.obj;
                Map map6 = this.A08;
                if (map6.containsKey(anonymousClass1452.A01)) {
                    C39561qK c39561qK9 = (C39561qK) map6.get(anonymousClass1452.A01);
                    if (c39561qK9.A08.remove(anonymousClass1452)) {
                        Handler handler3 = c39561qK9.A0C.A05;
                        handler3.removeMessages(15, anonymousClass1452);
                        handler3.removeMessages(16, anonymousClass1452);
                        C30461ac c30461ac = anonymousClass1452.A00;
                        Queue<C14J> queue = c39561qK9.A0A;
                        ArrayList arrayList = new ArrayList(queue.size());
                        for (C14J c14j : queue) {
                            if ((c14j instanceof AbstractC30791bB) && (A06 = ((AbstractC30791bB) c14j).A06(c39561qK9)) != null) {
                                int length = A06.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= length) {
                                        break;
                                    } else if (!C07K.A1k(A06[i5], c30461ac)) {
                                        i5++;
                                    } else if (i5 >= 0) {
                                        arrayList.add(c14j);
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj3 = arrayList.get(i2);
                            i2++;
                            C14J c14j2 = (C14J) obj3;
                            queue.remove(c14j2);
                            c14j2.A04(new AnonymousClass142(c30461ac));
                        }
                        break;
                    }
                }
                break;
            default:
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Unknown message id: ");
                sb2.append(i);
                Log.w("GoogleApiManager", sb2.toString());
                return false;
        }
        return true;
    }
}
