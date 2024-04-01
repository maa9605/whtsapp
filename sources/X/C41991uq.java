package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.TriggerEvent;
import android.hardware.TriggerEventListener;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import com.whatsapp.web.WebSessionVerificationReceiver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1uq */
/* loaded from: classes2.dex */
public class C41991uq {
    public static volatile C41991uq A0V;
    public Sensor A00;
    public SensorManager A01;
    public TriggerEventListener A02;
    public C2UJ A03;
    public HandlerC42981we A04;
    public Boolean A05;
    public Map A06;
    public boolean A07;
    public boolean A08;
    public final C03020Dv A0A;
    public final C0IK A0B;
    public final C01B A0C;
    public final C42961wc A0D;
    public final C02E A0E;
    public final AnonymousClass012 A0F;
    public final C001200o A0G;
    public final C000500h A0H;
    public final C002301c A0I;
    public final C0ER A0J;
    public final InterfaceC002901k A0K;
    public final C41981up A0L;
    public final C42951wb A0N;
    public final String A0O;
    public final AtomicInteger A0S;
    public volatile Map A0U;
    public final Handler A09 = new Handler(Looper.getMainLooper());
    public final SecureRandom A0P = new SecureRandom();
    public final AtomicReference A0T = new AtomicReference();
    public final HandlerC42971wd A0M = new HandlerC42971wd(this);
    public final List A0R = new CopyOnWriteArrayList();
    public final List A0Q = Collections.synchronizedList(new ArrayList());

    public C41991uq(C001200o c001200o, AnonymousClass012 anonymousClass012, InterfaceC002901k interfaceC002901k, C41981up c41981up, C01B c01b, C02E c02e, C002301c c002301c, C0ER c0er, C42951wb c42951wb, C000500h c000500h, C0IK c0ik, C42961wc c42961wc, C03020Dv c03020Dv) {
        this.A0G = c001200o;
        this.A0F = anonymousClass012;
        this.A0K = interfaceC002901k;
        this.A0L = c41981up;
        this.A0C = c01b;
        this.A0E = c02e;
        this.A0I = c002301c;
        this.A0J = c0er;
        this.A0N = c42951wb;
        this.A0H = c000500h;
        this.A0B = c0ik;
        this.A0D = c42961wc;
        this.A0A = c03020Dv;
        byte[] bArr = new byte[8];
        this.A0P.nextBytes(bArr);
        this.A0O = AnonymousClass024.A0M(bArr);
        this.A0S = new AtomicInteger(1);
    }

    public static C41991uq A00() {
        if (A0V == null) {
            synchronized (C41991uq.class) {
                if (A0V == null) {
                    C001200o c001200o = C001200o.A01;
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    InterfaceC002901k A002 = C002801j.A00();
                    C41981up A003 = C41981up.A00();
                    C01B A004 = C01B.A00();
                    C02E A005 = C02E.A00();
                    C002301c A006 = C002301c.A00();
                    C0ER A007 = C0ER.A00();
                    C42951wb A008 = C42951wb.A00();
                    C01J.A00();
                    A0V = new C41991uq(c001200o, A00, A002, A003, A004, A005, A006, A007, A008, C000500h.A00(), C0IK.A01(), C42961wc.A00(), C03020Dv.A00());
                }
            }
        }
        return A0V;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.1we] */
    public final synchronized HandlerC42981we A01() {
        HandlerC42981we handlerC42981we;
        HandlerC42981we handlerC42981we2 = this.A04;
        handlerC42981we = handlerC42981we2;
        if (handlerC42981we2 == null) {
            HandlerThread handlerThread = new HandlerThread("web-session-disk-cache-handler", 10);
            handlerThread.start();
            ?? r1 = new Handler(handlerThread.getLooper()) { // from class: X.1we
                {
                    C41991uq.this = this;
                }

                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    int i = message.what;
                    if (i != 1) {
                        if (i == 2) {
                            removeMessages(1);
                            removeMessages(2);
                            C41991uq c41991uq = C41991uq.this;
                            synchronized (c41991uq.A06(true)) {
                                new File(c41991uq.A0G.A00.getCacheDir(), "WebActionIdCache").delete();
                            }
                            c41991uq.A0L.A01().A00("epoch");
                            return;
                        }
                        return;
                    }
                    removeMessages(1);
                    if (hasMessages(2)) {
                        return;
                    }
                    try {
                        C41991uq c41991uq2 = C41991uq.this;
                        synchronized (c41991uq2.A06(true)) {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(c41991uq2.A0G.A00.getCacheDir(), "WebActionIdCache"));
                            try {
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                                objectOutputStream.writeObject(c41991uq2.A06(true));
                                objectOutputStream.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } finally {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                        C42851wQ A01 = c41991uq2.A0L.A01();
                        A01.A02("epoch", A01.A01);
                    } catch (Exception e) {
                        Log.e("qrsession/persistActionCache/fail", e);
                    }
                }
            };
            this.A04 = r1;
            handlerC42981we = r1;
        }
        return handlerC42981we;
    }

    public final C42881wU A02(C42881wU c42881wU) {
        if (c42881wU != null) {
            if (c42881wU.A0D) {
                long j = c42881wU.A03;
                if (j != 0 && j < System.currentTimeMillis()) {
                    StringBuilder A0P = C000200d.A0P("webSession/getUnexpiredSession browser timed out ");
                    String str = c42881wU.A0F;
                    C000200d.A1N(A0P, str);
                    A0H(false, str);
                    return null;
                }
            }
            return c42881wU;
        }
        return null;
    }

    public String A03() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A0O);
        sb.append(".--");
        sb.append(Integer.toHexString(this.A0S.getAndIncrement()));
        return sb.toString();
    }

    public List A04() {
        Iterator it = new ArrayList(A05().values()).iterator();
        while (it.hasNext()) {
            A02((C42881wU) it.next());
        }
        return new ArrayList(A05().values());
    }

    /* JADX WARN: Finally extract failed */
    public final Map A05() {
        if (this.A06 == null) {
            this.A06 = new LinkedHashMap();
            C42951wb c42951wb = this.A0N;
            if (c42951wb != null) {
                ArrayList arrayList = new ArrayList();
                C0CD c0cd = new C0CD(null, c42951wb.A02, false);
                try {
                    int i = 1;
                    int i2 = 2;
                    int i3 = 6;
                    Cursor A09 = c0cd.A02.A09("sessions", new String[]{"browser_id", "secret", "token", "os", "browser_type", "lat", "lon", "accuracy", "place_name", "last_active", "timeout", "expiration", "last_push_sent", "login_time", "syncd_release"}, null, null, null, "getSessions/QUERY_SESSIONS");
                    while (A09 != null && A09.moveToNext()) {
                        C01B c01b = c42951wb.A00;
                        String string = A09.getString(0);
                        String string2 = A09.getString(i);
                        String string3 = A09.getString(i2);
                        String string4 = A09.getString(3);
                        String string5 = A09.getString(4);
                        boolean z = false;
                        if (A09.getInt(10) > 0) {
                            z = true;
                        }
                        C42881wU c42881wU = new C42881wU(c01b, string, string2, string3, string4, string5, z);
                        c42881wU.A01 = A09.getDouble(5);
                        c42881wU.A02 = A09.getDouble(i3);
                        c42881wU.A00 = A09.getDouble(7);
                        c42881wU.A09 = A09.getString(8);
                        c42881wU.A04 = A09.getLong(9);
                        c42881wU.A03 = A09.getLong(11);
                        c42881wU.A05 = A09.getLong(12);
                        c42881wU.A06 = A09.getLong(13);
                        arrayList.add(c42881wU);
                        i3 = 6;
                        i = 1;
                        i2 = 2;
                    }
                    if (A09 != null) {
                        A09.close();
                    }
                    c0cd.close();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C42881wU c42881wU2 = (C42881wU) it.next();
                        this.A06.put(c42881wU2.A0F, c42881wU2);
                    }
                } finally {
                }
            } else {
                throw null;
            }
        }
        return this.A06;
    }

    public Map A06(boolean z) {
        if (this.A0U == null) {
            synchronized (this) {
                if (this.A0U == null) {
                    this.A0U = Collections.synchronizedMap(new LinkedHashMap<K, V>() { // from class: X.1wg
                        @Override // java.util.LinkedHashMap
                        public boolean removeEldestEntry(Map.Entry entry) {
                            return size() > 100;
                        }
                    });
                    if (z) {
                        try {
                            synchronized (this.A0U) {
                                FileInputStream fileInputStream = new FileInputStream(new File(this.A0G.A00.getCacheDir(), "WebActionIdCache"));
                                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream) { // from class: X.1wh
                                    @Override // java.io.ObjectInputStream
                                    public ObjectStreamClass readClassDescriptor() {
                                        ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
                                        return !readClassDescriptor.getName().startsWith("java.") ? ObjectStreamClass.lookup(C43001wg.class) : readClassDescriptor;
                                    }
                                };
                                for (Map.Entry entry : ((Map) objectInputStream.readObject()).entrySet()) {
                                    if (((Integer) entry.getValue()).intValue() > 0) {
                                        this.A0U.put(entry.getKey(), entry.getValue());
                                    }
                                }
                                objectInputStream.close();
                                fileInputStream.close();
                            }
                        } catch (Exception e) {
                            Log.e(e);
                        }
                    }
                }
            }
        }
        return this.A0U;
    }

    /* JADX WARN: Finally extract failed */
    public void A07() {
        Log.i("qrsession/deleteAllSessions");
        C42851wQ A01 = this.A0L.A01();
        A01.A08.edit().clear().apply();
        A01.A07 = null;
        A01.A05 = null;
        A01.A06 = null;
        A01.A02 = null;
        A01.A00 = null;
        A05().clear();
        C0CD c0cd = new C0CD(null, this.A0N.A02, true);
        try {
            c0cd.A02.A01("sessions", null, null);
            c0cd.close();
            A06(false).clear();
            A01().sendEmptyMessage(2);
            A0A();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    c0cd.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public void A08() {
        if (this.A0Q.size() > 0) {
            this.A0K.AS1(new RunnableEBaseShape7S0100000_I0_7(this, 49));
        }
    }

    public void A09() {
        if (this.A0L.A04()) {
            this.A08 = true;
            if (A0J()) {
                SensorManager sensorManager = this.A01;
                if (sensorManager == null) {
                    throw null;
                }
                sensorManager.requestTriggerSensor(this.A02, this.A00);
            }
        }
    }

    public final void A0A() {
        for (InterfaceC43021wi interfaceC43021wi : this.A0R) {
            interfaceC43021wi.AQV();
        }
    }

    public final void A0B() {
        if (Build.VERSION.SDK_INT >= 23) {
            HandlerC42971wd handlerC42971wd = this.A0M;
            if (handlerC42971wd.hasMessages(2) || handlerC42971wd.hasMessages(3)) {
                return;
            }
            long min = Math.min(handlerC42971wd.A00 + 30000, handlerC42971wd.A01.A0C.A07(C01C.A4B) * 1000);
            handlerC42971wd.A00 = min;
            boolean sendEmptyMessageDelayed = handlerC42971wd.sendEmptyMessageDelayed(3, min);
            StringBuilder A0P = C000200d.A0P("qrsession/fservice/delayed timeout=");
            A0P.append(handlerC42971wd.A00);
            A0P.append(" success:");
            A0P.append(sendEmptyMessageDelayed);
            A0P.append(" uptime:");
            A0P.append(SystemClock.uptimeMillis());
            Log.i(A0P.toString());
        }
    }

    /* JADX WARN: Finally extract failed */
    public void A0C(long j, String str) {
        C42881wU c42881wU;
        if (str == null || j <= 0 || (c42881wU = (C42881wU) A05().get(str)) == null) {
            return;
        }
        c42881wU.A04 = j;
        c42881wU.A05 = j;
        C42951wb c42951wb = this.A0N;
        if (c42951wb != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("last_active", Long.valueOf(j));
            C42991wf c42991wf = c42951wb.A02;
            C0CD c0cd = new C0CD(null, c42991wf, true);
            try {
                c0cd.A02.A00("sessions", contentValues, "browser_id = ?", new String[]{str});
                c0cd.close();
                long j2 = c42881wU.A05;
                if (c42951wb != null) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("last_push_sent", Long.valueOf(j2));
                    C0CD c0cd2 = new C0CD(null, c42991wf, true);
                    try {
                        c0cd2.A02.A00("sessions", contentValues2, "browser_id = ?", new String[]{str});
                        c0cd2.close();
                        A0A();
                        return;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            try {
                                c0cd2.close();
                            } catch (Throwable unused) {
                            }
                            throw th2;
                        }
                    }
                }
                throw null;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    try {
                        c0cd.close();
                    } catch (Throwable unused2) {
                    }
                    throw th4;
                }
            }
        }
        throw null;
    }

    public void A0D(Context context, long j) {
        AlarmManager A02 = this.A0E.A02();
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, WebSessionVerificationReceiver.class), 134217728);
        if (A02 != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                A02.setExact(0, j, broadcast);
                return;
            } else {
                A02.set(0, j, broadcast);
                return;
            }
        }
        Log.w("WebSession/scheduleWebSessionVerificationAlarm AlarmManager is null");
    }

    public void A0E(String str, int i) {
        A06(true).put(str, Integer.valueOf(i));
        A01().sendEmptyMessageDelayed(1, 2000L);
        this.A0L.A01();
    }

    public final void A0F(boolean z) {
        C41981up c41981up = this.A0L;
        c41981up.A01().A03 = null;
        c41981up.A01().A00("ref");
        if (z) {
            A0H(false, c41981up.A01().A00);
            C42851wQ A01 = c41981up.A01();
            A01.A07 = null;
            A01.A05 = null;
            A01.A06 = null;
            A01.A02 = null;
            A01.A00 = null;
            C42851wQ A012 = c41981up.A01();
            A012.A00("key");
            A012.A00("token");
            A012.A00("browser");
            A0A();
            this.A0M.sendEmptyMessage(2);
        } else {
            C42881wU c42881wU = (C42881wU) A05().get(c41981up.A01().A00);
            if (c42881wU != null && c42881wU.A0D) {
                c42881wU.A03 = System.currentTimeMillis() + 600000;
                C42951wb c42951wb = this.A0N;
                String str = c41981up.A01().A00;
                long j = c42881wU.A03;
                if (c42951wb != null) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("expiration", Long.valueOf(j));
                    C0CD c0cd = new C0CD(null, c42951wb.A02, true);
                    try {
                        c0cd.A02.A00("sessions", contentValues, "browser_id = ?", new String[]{str});
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } finally {
                            try {
                                c0cd.close();
                            } catch (Throwable unused) {
                            }
                        }
                    }
                } else {
                    throw null;
                }
            }
        }
        this.A0Q.clear();
        this.A08 = false;
        if (A0J()) {
            SensorManager sensorManager = this.A01;
            if (sensorManager == null) {
                throw null;
            }
            sensorManager.cancelTriggerSensor(this.A02, this.A00);
        }
    }

    public final void A0G(boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            HandlerC42971wd handlerC42971wd = this.A0M;
            handlerC42971wd.removeMessages(2);
            handlerC42971wd.removeMessages(3);
            Message.obtain(handlerC42971wd, 1, z ? 1 : 0, 0).sendToTarget();
        }
    }

    public void A0H(boolean z, String str) {
        C000200d.A14("qrsession/deleteSession bid=", str);
        C41981up c41981up = this.A0L;
        if (c41981up.A01().A01(str)) {
            A06(false).clear();
            A01().sendEmptyMessage(2);
            C42851wQ A01 = c41981up.A01();
            A01.A07 = null;
            A01.A05 = null;
            A01.A06 = null;
            A01.A02 = null;
            A01.A00 = null;
        }
        A05().remove(str);
        C0CD c0cd = new C0CD(null, this.A0N.A02, true);
        try {
            c0cd.A02.A01("sessions", "browser_id = ?", new String[]{str});
            if (z) {
                A0A();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    c0cd.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public boolean A0I() {
        return this.A0L.A04() && this.A07;
    }

    public final synchronized boolean A0J() {
        Boolean bool;
        boolean z;
        Sensor sensor;
        bool = this.A05;
        if (bool == null) {
            C02E c02e = this.A0E;
            boolean z2 = false;
            try {
                Class.forName("android.hardware.TriggerEventListener");
                z = true;
            } catch (Exception unused) {
                z = false;
            }
            if (Build.VERSION.SDK_INT >= 18 && z) {
                SensorManager A08 = c02e.A08();
                this.A01 = A08;
                if (A08 == null) {
                    sensor = null;
                } else {
                    sensor = A08.getDefaultSensor(17);
                }
                this.A00 = sensor;
                this.A02 = new TriggerEventListener() { // from class: X.1wj
                    {
                        C41991uq.this = this;
                    }

                    @Override // android.hardware.TriggerEventListener
                    public void onTrigger(TriggerEvent triggerEvent) {
                        C41991uq c41991uq = C41991uq.this;
                        if (c41991uq.A07) {
                            if (c41991uq.A0J()) {
                                SensorManager sensorManager = c41991uq.A01;
                                if (sensorManager != null) {
                                    sensorManager.requestTriggerSensor(c41991uq.A02, c41991uq.A00);
                                    return;
                                }
                                throw null;
                            }
                            return;
                        }
                        c41991uq.A08 = false;
                    }
                };
            }
            if (this.A01 != null && this.A00 != null) {
                z2 = true;
            }
            bool = Boolean.valueOf(z2);
            this.A05 = bool;
        }
        return bool.booleanValue();
    }

    public boolean A0K(AbstractC42841wP abstractC42841wP) {
        boolean z;
        if (abstractC42841wP instanceof C43041wk) {
            z = ((C43041wk) abstractC42841wP).A05;
        } else if (!(abstractC42841wP instanceof C42831wO)) {
            z = !(abstractC42841wP instanceof C43051wl) ? false : ((C43051wl) abstractC42841wP).A06;
        } else {
            z = ((C42831wO) abstractC42841wP).A02;
        }
        if (z) {
            return true;
        }
        String str = abstractC42841wP.A00;
        return str != null && str.equals(this.A0L.A01().A03);
    }

    public boolean A0L(String str) {
        return str != null && str.equals(this.A0L.A01().A00) && A0I();
    }
}
