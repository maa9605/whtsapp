package com.whatsapp.backup.google;

import X.AbstractC000600i;
import X.AbstractC012105x;
import X.AbstractC40111rb;
import X.AbstractC40441sG;
import X.AbstractIntentServiceC471329t;
import X.AnonymousClass011;
import X.AnonymousClass034;
import X.AnonymousClass038;
import X.BinderC52972bg;
import X.C000200d;
import X.C000500h;
import X.C000700j;
import X.C000800k;
import X.C001200o;
import X.C004902f;
import X.C010005b;
import X.C012005w;
import X.C018508q;
import X.C01B;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C03310Fe;
import X.C05E;
import X.C05N;
import X.C05Y;
import X.C0CC;
import X.C0EL;
import X.C0G5;
import X.C0QV;
import X.C0S0;
import X.C37461mS;
import X.C40061rW;
import X.C40101ra;
import X.C40161rg;
import X.C42151vF;
import X.C42701wB;
import X.C469829b;
import X.C470029d;
import X.C470129e;
import X.C47652Cb;
import X.C47662Cc;
import X.C47672Cd;
import X.C49792Mk;
import X.C638931g;
import X.InterfaceC002901k;
import X.InterfaceC470229f;
import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Environment;
import android.os.IBinder;
import android.text.TextUtils;
import com.whatsapp.Me;
import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class GoogleBackupService extends AbstractIntentServiceC471329t {
    public int A00;
    public WifiManager.WifiLock A01;
    public Bundle A02;
    public AbstractC000600i A03;
    public C012005w A04;
    public C018508q A05;
    public C02L A06;
    public C01B A07;
    public C0EL A08;
    public C010005b A09;
    public C03310Fe A0A;
    public C469829b A0B;
    public C470129e A0C;
    public C49792Mk A0D;
    public C40101ra A0E;
    public C470029d A0F;
    public C000800k A0G;
    public AnonymousClass034 A0H;
    public C02E A0I;
    public C001200o A0J;
    public C02F A0K;
    public C000500h A0L;
    public C0CC A0M;
    public C05N A0N;
    public C05E A0O;
    public AnonymousClass011 A0P;
    public C0S0 A0Q;
    public C37461mS A0R;
    public C05Y A0S;
    public C42151vF A0T;
    public C42701wB A0U;
    public AbstractC40441sG A0V;
    public C004902f A0W;
    public InterfaceC002901k A0X;
    public String A0Y;
    public Map A0Z;
    public final ConditionVariable A0a;
    public final C0QV A0b;
    public final C638931g A0c;
    public final BinderC52972bg A0d;
    public final AbstractC40111rb A0e;
    public final AbstractC40111rb A0f;
    public final AbstractC40111rb A0g;
    public final Object A0h;
    public final ArrayList A0i;
    public final AtomicBoolean A0j;
    public final AtomicLong A0k;
    public final AtomicLong A0l;
    public final AtomicLong A0m;
    public final AtomicLong A0n;
    public final AtomicLong A0o;

    public GoogleBackupService() {
        super(GoogleBackupService.class.getCanonicalName());
        this.A0d = new BinderC52972bg(this);
        this.A0j = new AtomicBoolean(false);
        this.A0m = new AtomicLong(0L);
        this.A0l = new AtomicLong(0L);
        this.A0k = new AtomicLong(0L);
        this.A0n = new AtomicLong(0L);
        this.A0o = new AtomicLong(0L);
        this.A0c = new C638931g();
        this.A0h = new Object();
        this.A0e = new C47672Cd(this);
        this.A0f = new C47662Cc(this);
        this.A0g = new C47652Cb(this);
        this.A0a = new ConditionVariable(false);
        this.A0b = new C0QV() { // from class: X.31f
            {
                GoogleBackupService.this = this;
            }

            @Override // X.C0QV
            public void AKw() {
                C000700j.A01();
                StringBuilder sb = new StringBuilder("gdrive/onHandlerConnected ");
                sb.append(Thread.currentThread());
                Log.i(sb.toString());
                GoogleBackupService.this.A0a.open();
            }

            @Override // X.C0QV
            public void AKx() {
                C000700j.A01();
                StringBuilder sb = new StringBuilder("gdrive/onHandlerDisconnected ");
                sb.append(Thread.currentThread());
                Log.i(sb.toString());
                GoogleBackupService.this.A0a.close();
            }
        };
        this.A0i = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x0015, code lost:
        if (r1.A0Y.get() == false) goto L147;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(com.whatsapp.backup.google.GoogleBackupService r15) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.GoogleBackupService.A00(com.whatsapp.backup.google.GoogleBackupService):boolean");
    }

    public final String A03() {
        C02L c02l = this.A06;
        c02l.A05();
        Me me = c02l.A00;
        if (me == null) {
            Log.i("gdrive-service/my-jid/me is null, can't proceed");
            return null;
        }
        String str = me.jabber_id;
        if (str == null) {
            Log.e("gdrive-service/my-jid/jidUser is null, fatal error.");
            return null;
        }
        return str;
    }

    public void A04() {
        Log.i("gdrive-service/cancel-pending-backup-and-restore-if-any");
        if (!C40061rW.A0H(this.A0L) && !this.A0B.A0Y.get()) {
            if (C40061rW.A0I(this.A0L)) {
                this.A0B.A0Z.getAndSet(false);
                this.A0B.A0J.open();
                if (this.A0E != null) {
                    Log.i("gdrive-service/cancel-media-restore/interrupt-drive-api");
                    A09(false);
                    this.A0B.A0I.open();
                    this.A0B.A0F.open();
                    this.A0c.A03();
                    this.A0L.A0T(0);
                } else {
                    Log.i("gdrive-service/drive-api/null");
                    this.A0B.A0I.open();
                    this.A0B.A0F.open();
                    this.A0X.AS1(new RunnableEBaseShape0S0100000_I0_0(this, 4));
                }
            } else if (this.A0L.A06() == 3) {
                this.A0B.A0a.getAndSet(false);
                this.A0B.A0J.open();
                if (this.A0E != null) {
                    A09(false);
                }
                this.A0B.A0H.open();
                this.A0B.A0E.open();
                this.A0C.A02();
                this.A0L.A0T(0);
            } else {
                Log.i("gdrive-service/cancel/nothing-to-cancel");
            }
        } else {
            this.A0B.A0Y.getAndSet(false);
            C40161rg.A02();
            this.A0B.A0J.open();
            if (this.A0E != null) {
                Log.i("gdrive-service/cancel-backup/interrupt-drive-api");
                A09(false);
                this.A0B.A0G.open();
                this.A0B.A0D.open();
            } else {
                Log.i("gdrive-service/drive-api/null");
                this.A0B.A0G.open();
                this.A0B.A0D.open();
                this.A0X.AS1(new RunnableEBaseShape0S0100000_I0_0(this, 3));
            }
            this.A0C.A02();
            this.A0B.A03 = false;
            this.A0L.A0T(0);
        }
        A06(10);
        if (this.A0L.A00.getBoolean("gdrive_user_initiated_backup", false)) {
            C000200d.A0j(this.A0L, "gdrive_user_initiated_backup", false);
        }
    }

    public final void A05() {
        WifiManager.WifiLock wifiLock = this.A01;
        if (wifiLock == null || !wifiLock.isHeld()) {
            return;
        }
        this.A01.release();
    }

    public void A06(int i) {
        String A04 = C40061rW.A04(i);
        if (i != 10) {
            TextUtils.join("\n", Thread.currentThread().getStackTrace());
            StringBuilder sb = new StringBuilder("gdrive-service/set-error/");
            sb.append(A04);
            Log.e(sb.toString());
        }
        C000200d.A0g(this.A0L, "gdrive_error_code", i);
        if (!C40061rW.A0I(this.A0L) && !"action_restore_media".equals(this.A0Y)) {
            if (this.A0L.A06() != 3 && !"action_restore".equals(this.A0Y)) {
                if (!C40061rW.A0H(this.A0L) && !"action_backup".equals(this.A0Y)) {
                    if (this.A0Y != null) {
                        if (i != 10) {
                            C000200d.A1M(C000200d.A0P("gdrive-service/set-error/unexpected-service-start-action/"), this.A0Y);
                            return;
                        }
                        return;
                    } else if (i != 10) {
                        Log.e("gdrive-service/set-error/unexpected-service-start-action/null", new Throwable());
                        return;
                    } else {
                        Log.i("gdrive-service/set-error/action-is-null and nothing is pending (probably backup attempt failed)");
                        Bundle bundle = new Bundle();
                        this.A02 = bundle;
                        bundle.putLong("total_bytes_to_be_uploaded", this.A0n.get());
                        this.A0c.A06(i, this.A02);
                        return;
                    }
                }
                C0S0 c0s0 = this.A0Q;
                if (c0s0 != null) {
                    c0s0.A09 = Integer.valueOf(C40061rW.A00(i));
                }
                Bundle bundle2 = new Bundle();
                this.A02 = bundle2;
                bundle2.putLong("total_bytes_to_be_uploaded", this.A0n.get());
                this.A0c.A06(i, this.A02);
                return;
            }
            Bundle bundle3 = new Bundle();
            this.A02 = bundle3;
            C638931g c638931g = this.A0c;
            synchronized (((AnonymousClass038) c638931g).A00) {
                Iterator it = ((AnonymousClass038) c638931g).A00.iterator();
                while (true) {
                    C0G5 c0g5 = (C0G5) it;
                    if (c0g5.hasNext()) {
                        ((InterfaceC470229f) c0g5.next()).AK3(i, bundle3);
                    }
                }
            }
            return;
        }
        Bundle bundle4 = new Bundle();
        this.A02 = bundle4;
        bundle4.putLong("total_bytes_to_be_downloaded", this.A0m.get());
        this.A02.putLong("total_bytes_downloaded", this.A0l.get());
        this.A0c.A07(i, this.A02);
        C37461mS c37461mS = this.A0R;
        if (c37461mS == null) {
            return;
        }
        c37461mS.A09 = Integer.valueOf(C40061rW.A00(i));
    }

    public void A07(InterfaceC470229f interfaceC470229f) {
        C638931g c638931g = this.A0c;
        c638931g.A00(interfaceC470229f);
        if (!C40061rW.A0H(this.A0L) && !this.A0B.A0Y.get()) {
            if (!this.A0B.A0Z.get() && !C40061rW.A0I(this.A0L)) {
                if (this.A0L.A06() == 3) {
                    StringBuilder A0P = C000200d.A0P("gdrive-service/observer/registered/error/");
                    A0P.append(C40061rW.A04(this.A0L.A05()));
                    Log.i(A0P.toString());
                    return;
                }
                c638931g.A06(this.A0L.A05(), this.A02);
                return;
            }
            C469829b c469829b = this.A0B;
            if (!c469829b.A0B) {
                if (c469829b.A02 == 0) {
                    interfaceC470229f.ALw(this.A0l.get(), this.A0m.get());
                } else {
                    interfaceC470229f.ALs(this.A0l.get(), this.A0m.get());
                }
            } else if (!c469829b.A06) {
                interfaceC470229f.ALt(this.A0l.get(), this.A0m.get());
            } else if (!c469829b.A0C) {
                if ("unmounted".equals(Environment.getExternalStorageState())) {
                    interfaceC470229f.ALv(this.A0l.get(), this.A0m.get());
                } else {
                    interfaceC470229f.ALu(this.A0l.get(), this.A0m.get());
                }
            } else {
                AtomicLong atomicLong = this.A0m;
                if (atomicLong.get() > 0) {
                    interfaceC470229f.ALz(this.A0l.get(), this.A0k.get(), atomicLong.get());
                } else {
                    interfaceC470229f.ALy();
                }
            }
            c638931g.A07(this.A0L.A05(), this.A02);
            return;
        }
        C469829b c469829b2 = this.A0B;
        if (!c469829b2.A09) {
            if (c469829b2.A01 == 0) {
                interfaceC470229f.AHq(this.A0o.get(), this.A0n.get());
            } else {
                interfaceC470229f.AHm(this.A0o.get(), this.A0n.get());
            }
        } else if (!c469829b2.A04) {
            interfaceC470229f.AHn(this.A0o.get(), this.A0n.get());
        } else if (!c469829b2.A0C) {
            if ("unmounted".equals(Environment.getExternalStorageState())) {
                interfaceC470229f.AHp(this.A0o.get(), this.A0n.get());
            } else {
                interfaceC470229f.AHo(this.A0o.get(), this.A0n.get());
            }
        } else {
            AtomicLong atomicLong2 = this.A0n;
            if (atomicLong2.get() > 0) {
                interfaceC470229f.AHt(this.A0o.get(), atomicLong2.get());
            } else if (C40061rW.A0H(this.A0L)) {
                interfaceC470229f.AHs();
            } else {
                interfaceC470229f.AOM();
            }
        }
        c638931g.A06(this.A0L.A05(), this.A02);
    }

    public void A08(InterfaceC470229f interfaceC470229f) {
        this.A0c.A01(interfaceC470229f);
    }

    public final void A09(boolean z) {
        C40101ra c40101ra = this.A0E;
        if (c40101ra != null) {
            synchronized (c40101ra) {
                if (c40101ra.A01 != z) {
                    Log.i(z ? "gdrive-api-v2/enabled" : "gdrive-api-v2/disabled");
                    c40101ra.A01 = z;
                }
            }
        }
        this.A0F.A01(2, z);
    }

    @Override // android.app.IntentService, android.app.Service
    public IBinder onBind(Intent intent) {
        return this.A0d;
    }

    @Override // X.AbstractIntentServiceC471329t, X.C0O9, android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        ArrayList arrayList = this.A0i;
        C012005w c012005w = this.A04;
        if (c012005w != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(c012005w.A04().A01);
            arrayList2.add(c012005w.A04().A00);
            arrayList2.add(c012005w.A04().A0N);
            arrayList2.add(c012005w.A04().A05);
            arrayList2.add(c012005w.A04().A0O);
            File file = c012005w.A04().A0P;
            AbstractC012105x.A03(file, false);
            arrayList2.add(file);
            File file2 = c012005w.A04().A02;
            AbstractC012105x.A03(file2, false);
            arrayList2.add(file2);
            File file3 = c012005w.A04().A0M;
            AbstractC012105x.A03(file3, false);
            arrayList2.add(file3);
            File file4 = c012005w.A04().A04;
            AbstractC012105x.A03(file4, false);
            arrayList2.add(file4);
            arrayList.addAll(arrayList2);
            C470129e c470129e = this.A0C;
            if (c470129e != null) {
                Log.i("gdrive-notification-manager/register");
                c470129e.A0K.set(10);
                c470129e.A0B = false;
                c470129e.A0A = false;
                c470129e.A09 = false;
                c470129e.A00 = 0;
                c470129e.A01 = 0;
                c470129e.A02 = 0L;
                c470129e.A03 = 0L;
                c470129e.A08 = null;
                C000700j.A07(c470129e.A0L == null);
                c470129e.A0D.A01(c470129e);
                A07(c470129e);
                C010005b c010005b = this.A09;
                C0QV c0qv = this.A0b;
                synchronized (c010005b) {
                    if (c0qv == null) {
                        return;
                    }
                    if (!c010005b.A03) {
                        if (c010005b.A02) {
                            c0qv.AKw();
                        } else {
                            c0qv.AKx();
                        }
                    }
                    c010005b.A04.add(c0qv);
                    return;
                }
            }
            throw null;
        }
        throw null;
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        int intValue;
        super.onDestroy();
        C010005b c010005b = this.A09;
        C0QV c0qv = this.A0b;
        synchronized (c010005b) {
            if (c0qv != null) {
                c010005b.A04.remove(c0qv);
            }
        }
        C470129e c470129e = this.A0C;
        if (c470129e != null) {
            Log.i("gdrive-notification-manager/unregister");
            BroadcastReceiver broadcastReceiver = c470129e.A04;
            if (broadcastReceiver != null) {
                try {
                    c470129e.A0F.A00.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
            }
            BroadcastReceiver broadcastReceiver2 = c470129e.A06;
            if (broadcastReceiver2 != null) {
                try {
                    c470129e.A0F.A00.unregisterReceiver(broadcastReceiver2);
                } catch (IllegalArgumentException unused2) {
                }
            }
            BroadcastReceiver broadcastReceiver3 = c470129e.A05;
            if (broadcastReceiver3 != null) {
                try {
                    c470129e.A0F.A00.unregisterReceiver(broadcastReceiver3);
                } catch (IllegalArgumentException unused3) {
                }
            }
            BroadcastReceiver broadcastReceiver4 = c470129e.A07;
            if (broadcastReceiver4 != null) {
                try {
                    c470129e.A0F.A00.unregisterReceiver(broadcastReceiver4);
                } catch (IllegalArgumentException unused4) {
                }
            }
            c470129e.A0D.A00(c470129e);
            A08(c470129e);
            AtomicReference atomicReference = c470129e.A0K;
            Notification notification = c470129e.A0L;
            if (c470129e.A0B && notification != null && ((intValue = ((Number) atomicReference.get()).intValue()) == 15 || intValue == 27)) {
                Log.i("gdrive-notification-manager/destroy re-posting error notification for foreground service");
                c470129e.A0G.A03(null, 5, notification);
            }
            c470129e.A0L = null;
            A09(false);
            A05();
            this.A0B.A0b.set(false);
            C40161rg.A02();
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1109:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:1110:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:1230:0x09b3 A[Catch: 31p -> 0x0d0f, 31w -> 0x0d11, 2GT -> 0x0d13, 31t -> 0x0d15, 31v -> 0x0d17, 31q -> 0x0d19, 31m -> 0x0d1b, 31n -> 0x0d90, all -> 0x1115, TryCatch #17 {31q -> 0x0d19, blocks: (B:1170:0x0878, B:1172:0x088d, B:1173:0x0895, B:1175:0x089d, B:1177:0x08a3, B:1179:0x08ab, B:1180:0x08af, B:1181:0x08c6, B:1182:0x08c7, B:1184:0x08cf, B:1186:0x08d9, B:1187:0x08df, B:1189:0x08e8, B:1190:0x08f0, B:1193:0x08fd, B:1195:0x090a, B:1198:0x091c, B:1200:0x0928, B:1202:0x0936, B:1206:0x0952, B:1353:0x0ce6, B:1354:0x0ced, B:1203:0x0949, B:1208:0x0958, B:1210:0x0971, B:1212:0x0979, B:1218:0x0990, B:1220:0x0996, B:1213:0x097d, B:1215:0x0985, B:1217:0x098b, B:1227:0x09ab, B:1230:0x09b3, B:1232:0x09b9, B:1237:0x09ca, B:1233:0x09be, B:1235:0x09c4, B:1240:0x09d3, B:1242:0x09db, B:1248:0x09f1, B:1250:0x09f7, B:1243:0x09df, B:1245:0x09ea, B:1251:0x09fc, B:1258:0x0a13, B:1259:0x0a21, B:1261:0x0a27, B:1263:0x0a31, B:1265:0x0a37, B:1272:0x0a4e, B:1274:0x0a57, B:1275:0x0a70, B:1277:0x0a79, B:1278:0x0a92, B:1280:0x0a9b, B:1281:0x0ab5, B:1282:0x0ab6, B:1283:0x0ab7, B:1290:0x0acf, B:1292:0x0ae2, B:1293:0x0aea, B:1295:0x0af0, B:1297:0x0b02, B:1299:0x0b10, B:1300:0x0b19, B:1301:0x0b25, B:1303:0x0b2b, B:1305:0x0b37, B:1306:0x0b40, B:1308:0x0b4a, B:1309:0x0b50, B:1311:0x0b62, B:1314:0x0b9d, B:1315:0x0ba3, B:1317:0x0bab, B:1319:0x0bb2, B:1321:0x0bbc, B:1322:0x0bc4, B:1324:0x0bca, B:1326:0x0bd8, B:1328:0x0be0, B:1329:0x0bfe, B:1330:0x0bff, B:1332:0x0c25, B:1333:0x0c57, B:1334:0x0c58, B:1335:0x0c59, B:1336:0x0c5a, B:1338:0x0c6a, B:1339:0x0c75, B:1341:0x0c80, B:1343:0x0c8a, B:1345:0x0c9e, B:1346:0x0cb6, B:1347:0x0cbe, B:1349:0x0cd1, B:1351:0x0cd7, B:1289:0x0aca, B:1288:0x0ac7, B:1252:0x0a01, B:1254:0x0a07, B:1256:0x0a0d, B:1285:0x0abc, B:1286:0x0ac0, B:1221:0x099b, B:1223:0x09a1, B:1355:0x0cee, B:1183:0x08cc), top: B:1559:0x0878 }] */
    /* JADX WARN: Removed duplicated region for block: B:1240:0x09d3 A[Catch: 31p -> 0x0d0f, 31w -> 0x0d11, 2GT -> 0x0d13, 31t -> 0x0d15, 31v -> 0x0d17, 31q -> 0x0d19, 31m -> 0x0d1b, 31n -> 0x0d90, all -> 0x1115, TryCatch #17 {31q -> 0x0d19, blocks: (B:1170:0x0878, B:1172:0x088d, B:1173:0x0895, B:1175:0x089d, B:1177:0x08a3, B:1179:0x08ab, B:1180:0x08af, B:1181:0x08c6, B:1182:0x08c7, B:1184:0x08cf, B:1186:0x08d9, B:1187:0x08df, B:1189:0x08e8, B:1190:0x08f0, B:1193:0x08fd, B:1195:0x090a, B:1198:0x091c, B:1200:0x0928, B:1202:0x0936, B:1206:0x0952, B:1353:0x0ce6, B:1354:0x0ced, B:1203:0x0949, B:1208:0x0958, B:1210:0x0971, B:1212:0x0979, B:1218:0x0990, B:1220:0x0996, B:1213:0x097d, B:1215:0x0985, B:1217:0x098b, B:1227:0x09ab, B:1230:0x09b3, B:1232:0x09b9, B:1237:0x09ca, B:1233:0x09be, B:1235:0x09c4, B:1240:0x09d3, B:1242:0x09db, B:1248:0x09f1, B:1250:0x09f7, B:1243:0x09df, B:1245:0x09ea, B:1251:0x09fc, B:1258:0x0a13, B:1259:0x0a21, B:1261:0x0a27, B:1263:0x0a31, B:1265:0x0a37, B:1272:0x0a4e, B:1274:0x0a57, B:1275:0x0a70, B:1277:0x0a79, B:1278:0x0a92, B:1280:0x0a9b, B:1281:0x0ab5, B:1282:0x0ab6, B:1283:0x0ab7, B:1290:0x0acf, B:1292:0x0ae2, B:1293:0x0aea, B:1295:0x0af0, B:1297:0x0b02, B:1299:0x0b10, B:1300:0x0b19, B:1301:0x0b25, B:1303:0x0b2b, B:1305:0x0b37, B:1306:0x0b40, B:1308:0x0b4a, B:1309:0x0b50, B:1311:0x0b62, B:1314:0x0b9d, B:1315:0x0ba3, B:1317:0x0bab, B:1319:0x0bb2, B:1321:0x0bbc, B:1322:0x0bc4, B:1324:0x0bca, B:1326:0x0bd8, B:1328:0x0be0, B:1329:0x0bfe, B:1330:0x0bff, B:1332:0x0c25, B:1333:0x0c57, B:1334:0x0c58, B:1335:0x0c59, B:1336:0x0c5a, B:1338:0x0c6a, B:1339:0x0c75, B:1341:0x0c80, B:1343:0x0c8a, B:1345:0x0c9e, B:1346:0x0cb6, B:1347:0x0cbe, B:1349:0x0cd1, B:1351:0x0cd7, B:1289:0x0aca, B:1288:0x0ac7, B:1252:0x0a01, B:1254:0x0a07, B:1256:0x0a0d, B:1285:0x0abc, B:1286:0x0ac0, B:1221:0x099b, B:1223:0x09a1, B:1355:0x0cee, B:1183:0x08cc), top: B:1559:0x0878 }] */
    /* JADX WARN: Removed duplicated region for block: B:1292:0x0ae2 A[Catch: 31p -> 0x0d0f, 31w -> 0x0d11, 2GT -> 0x0d13, 31t -> 0x0d15, 31v -> 0x0d17, 31q -> 0x0d19, 31m -> 0x0d1b, 31n -> 0x0d90, all -> 0x1115, TryCatch #17 {31q -> 0x0d19, blocks: (B:1170:0x0878, B:1172:0x088d, B:1173:0x0895, B:1175:0x089d, B:1177:0x08a3, B:1179:0x08ab, B:1180:0x08af, B:1181:0x08c6, B:1182:0x08c7, B:1184:0x08cf, B:1186:0x08d9, B:1187:0x08df, B:1189:0x08e8, B:1190:0x08f0, B:1193:0x08fd, B:1195:0x090a, B:1198:0x091c, B:1200:0x0928, B:1202:0x0936, B:1206:0x0952, B:1353:0x0ce6, B:1354:0x0ced, B:1203:0x0949, B:1208:0x0958, B:1210:0x0971, B:1212:0x0979, B:1218:0x0990, B:1220:0x0996, B:1213:0x097d, B:1215:0x0985, B:1217:0x098b, B:1227:0x09ab, B:1230:0x09b3, B:1232:0x09b9, B:1237:0x09ca, B:1233:0x09be, B:1235:0x09c4, B:1240:0x09d3, B:1242:0x09db, B:1248:0x09f1, B:1250:0x09f7, B:1243:0x09df, B:1245:0x09ea, B:1251:0x09fc, B:1258:0x0a13, B:1259:0x0a21, B:1261:0x0a27, B:1263:0x0a31, B:1265:0x0a37, B:1272:0x0a4e, B:1274:0x0a57, B:1275:0x0a70, B:1277:0x0a79, B:1278:0x0a92, B:1280:0x0a9b, B:1281:0x0ab5, B:1282:0x0ab6, B:1283:0x0ab7, B:1290:0x0acf, B:1292:0x0ae2, B:1293:0x0aea, B:1295:0x0af0, B:1297:0x0b02, B:1299:0x0b10, B:1300:0x0b19, B:1301:0x0b25, B:1303:0x0b2b, B:1305:0x0b37, B:1306:0x0b40, B:1308:0x0b4a, B:1309:0x0b50, B:1311:0x0b62, B:1314:0x0b9d, B:1315:0x0ba3, B:1317:0x0bab, B:1319:0x0bb2, B:1321:0x0bbc, B:1322:0x0bc4, B:1324:0x0bca, B:1326:0x0bd8, B:1328:0x0be0, B:1329:0x0bfe, B:1330:0x0bff, B:1332:0x0c25, B:1333:0x0c57, B:1334:0x0c58, B:1335:0x0c59, B:1336:0x0c5a, B:1338:0x0c6a, B:1339:0x0c75, B:1341:0x0c80, B:1343:0x0c8a, B:1345:0x0c9e, B:1346:0x0cb6, B:1347:0x0cbe, B:1349:0x0cd1, B:1351:0x0cd7, B:1289:0x0aca, B:1288:0x0ac7, B:1252:0x0a01, B:1254:0x0a07, B:1256:0x0a0d, B:1285:0x0abc, B:1286:0x0ac0, B:1221:0x099b, B:1223:0x09a1, B:1355:0x0cee, B:1183:0x08cc), top: B:1559:0x0878 }] */
    /* JADX WARN: Removed duplicated region for block: B:1303:0x0b2b A[Catch: 31p -> 0x0d0f, 31w -> 0x0d11, 2GT -> 0x0d13, 31t -> 0x0d15, 31v -> 0x0d17, 31q -> 0x0d19, 31m -> 0x0d1b, 31n -> 0x0d90, all -> 0x1115, TryCatch #17 {31q -> 0x0d19, blocks: (B:1170:0x0878, B:1172:0x088d, B:1173:0x0895, B:1175:0x089d, B:1177:0x08a3, B:1179:0x08ab, B:1180:0x08af, B:1181:0x08c6, B:1182:0x08c7, B:1184:0x08cf, B:1186:0x08d9, B:1187:0x08df, B:1189:0x08e8, B:1190:0x08f0, B:1193:0x08fd, B:1195:0x090a, B:1198:0x091c, B:1200:0x0928, B:1202:0x0936, B:1206:0x0952, B:1353:0x0ce6, B:1354:0x0ced, B:1203:0x0949, B:1208:0x0958, B:1210:0x0971, B:1212:0x0979, B:1218:0x0990, B:1220:0x0996, B:1213:0x097d, B:1215:0x0985, B:1217:0x098b, B:1227:0x09ab, B:1230:0x09b3, B:1232:0x09b9, B:1237:0x09ca, B:1233:0x09be, B:1235:0x09c4, B:1240:0x09d3, B:1242:0x09db, B:1248:0x09f1, B:1250:0x09f7, B:1243:0x09df, B:1245:0x09ea, B:1251:0x09fc, B:1258:0x0a13, B:1259:0x0a21, B:1261:0x0a27, B:1263:0x0a31, B:1265:0x0a37, B:1272:0x0a4e, B:1274:0x0a57, B:1275:0x0a70, B:1277:0x0a79, B:1278:0x0a92, B:1280:0x0a9b, B:1281:0x0ab5, B:1282:0x0ab6, B:1283:0x0ab7, B:1290:0x0acf, B:1292:0x0ae2, B:1293:0x0aea, B:1295:0x0af0, B:1297:0x0b02, B:1299:0x0b10, B:1300:0x0b19, B:1301:0x0b25, B:1303:0x0b2b, B:1305:0x0b37, B:1306:0x0b40, B:1308:0x0b4a, B:1309:0x0b50, B:1311:0x0b62, B:1314:0x0b9d, B:1315:0x0ba3, B:1317:0x0bab, B:1319:0x0bb2, B:1321:0x0bbc, B:1322:0x0bc4, B:1324:0x0bca, B:1326:0x0bd8, B:1328:0x0be0, B:1329:0x0bfe, B:1330:0x0bff, B:1332:0x0c25, B:1333:0x0c57, B:1334:0x0c58, B:1335:0x0c59, B:1336:0x0c5a, B:1338:0x0c6a, B:1339:0x0c75, B:1341:0x0c80, B:1343:0x0c8a, B:1345:0x0c9e, B:1346:0x0cb6, B:1347:0x0cbe, B:1349:0x0cd1, B:1351:0x0cd7, B:1289:0x0aca, B:1288:0x0ac7, B:1252:0x0a01, B:1254:0x0a07, B:1256:0x0a0d, B:1285:0x0abc, B:1286:0x0ac0, B:1221:0x099b, B:1223:0x09a1, B:1355:0x0cee, B:1183:0x08cc), top: B:1559:0x0878 }] */
    /* JADX WARN: Removed duplicated region for block: B:1317:0x0bab A[Catch: 31p -> 0x0d0f, 31w -> 0x0d11, 2GT -> 0x0d13, 31t -> 0x0d15, 31v -> 0x0d17, 31q -> 0x0d19, 31m -> 0x0d1b, 31n -> 0x0d90, all -> 0x1115, TryCatch #17 {31q -> 0x0d19, blocks: (B:1170:0x0878, B:1172:0x088d, B:1173:0x0895, B:1175:0x089d, B:1177:0x08a3, B:1179:0x08ab, B:1180:0x08af, B:1181:0x08c6, B:1182:0x08c7, B:1184:0x08cf, B:1186:0x08d9, B:1187:0x08df, B:1189:0x08e8, B:1190:0x08f0, B:1193:0x08fd, B:1195:0x090a, B:1198:0x091c, B:1200:0x0928, B:1202:0x0936, B:1206:0x0952, B:1353:0x0ce6, B:1354:0x0ced, B:1203:0x0949, B:1208:0x0958, B:1210:0x0971, B:1212:0x0979, B:1218:0x0990, B:1220:0x0996, B:1213:0x097d, B:1215:0x0985, B:1217:0x098b, B:1227:0x09ab, B:1230:0x09b3, B:1232:0x09b9, B:1237:0x09ca, B:1233:0x09be, B:1235:0x09c4, B:1240:0x09d3, B:1242:0x09db, B:1248:0x09f1, B:1250:0x09f7, B:1243:0x09df, B:1245:0x09ea, B:1251:0x09fc, B:1258:0x0a13, B:1259:0x0a21, B:1261:0x0a27, B:1263:0x0a31, B:1265:0x0a37, B:1272:0x0a4e, B:1274:0x0a57, B:1275:0x0a70, B:1277:0x0a79, B:1278:0x0a92, B:1280:0x0a9b, B:1281:0x0ab5, B:1282:0x0ab6, B:1283:0x0ab7, B:1290:0x0acf, B:1292:0x0ae2, B:1293:0x0aea, B:1295:0x0af0, B:1297:0x0b02, B:1299:0x0b10, B:1300:0x0b19, B:1301:0x0b25, B:1303:0x0b2b, B:1305:0x0b37, B:1306:0x0b40, B:1308:0x0b4a, B:1309:0x0b50, B:1311:0x0b62, B:1314:0x0b9d, B:1315:0x0ba3, B:1317:0x0bab, B:1319:0x0bb2, B:1321:0x0bbc, B:1322:0x0bc4, B:1324:0x0bca, B:1326:0x0bd8, B:1328:0x0be0, B:1329:0x0bfe, B:1330:0x0bff, B:1332:0x0c25, B:1333:0x0c57, B:1334:0x0c58, B:1335:0x0c59, B:1336:0x0c5a, B:1338:0x0c6a, B:1339:0x0c75, B:1341:0x0c80, B:1343:0x0c8a, B:1345:0x0c9e, B:1346:0x0cb6, B:1347:0x0cbe, B:1349:0x0cd1, B:1351:0x0cd7, B:1289:0x0aca, B:1288:0x0ac7, B:1252:0x0a01, B:1254:0x0a07, B:1256:0x0a0d, B:1285:0x0abc, B:1286:0x0ac0, B:1221:0x099b, B:1223:0x09a1, B:1355:0x0cee, B:1183:0x08cc), top: B:1559:0x0878 }] */
    /* JADX WARN: Removed duplicated region for block: B:1319:0x0bb2 A[Catch: 31p -> 0x0d0f, 31w -> 0x0d11, 2GT -> 0x0d13, 31t -> 0x0d15, 31v -> 0x0d17, 31q -> 0x0d19, 31m -> 0x0d1b, 31n -> 0x0d90, all -> 0x1115, TryCatch #17 {31q -> 0x0d19, blocks: (B:1170:0x0878, B:1172:0x088d, B:1173:0x0895, B:1175:0x089d, B:1177:0x08a3, B:1179:0x08ab, B:1180:0x08af, B:1181:0x08c6, B:1182:0x08c7, B:1184:0x08cf, B:1186:0x08d9, B:1187:0x08df, B:1189:0x08e8, B:1190:0x08f0, B:1193:0x08fd, B:1195:0x090a, B:1198:0x091c, B:1200:0x0928, B:1202:0x0936, B:1206:0x0952, B:1353:0x0ce6, B:1354:0x0ced, B:1203:0x0949, B:1208:0x0958, B:1210:0x0971, B:1212:0x0979, B:1218:0x0990, B:1220:0x0996, B:1213:0x097d, B:1215:0x0985, B:1217:0x098b, B:1227:0x09ab, B:1230:0x09b3, B:1232:0x09b9, B:1237:0x09ca, B:1233:0x09be, B:1235:0x09c4, B:1240:0x09d3, B:1242:0x09db, B:1248:0x09f1, B:1250:0x09f7, B:1243:0x09df, B:1245:0x09ea, B:1251:0x09fc, B:1258:0x0a13, B:1259:0x0a21, B:1261:0x0a27, B:1263:0x0a31, B:1265:0x0a37, B:1272:0x0a4e, B:1274:0x0a57, B:1275:0x0a70, B:1277:0x0a79, B:1278:0x0a92, B:1280:0x0a9b, B:1281:0x0ab5, B:1282:0x0ab6, B:1283:0x0ab7, B:1290:0x0acf, B:1292:0x0ae2, B:1293:0x0aea, B:1295:0x0af0, B:1297:0x0b02, B:1299:0x0b10, B:1300:0x0b19, B:1301:0x0b25, B:1303:0x0b2b, B:1305:0x0b37, B:1306:0x0b40, B:1308:0x0b4a, B:1309:0x0b50, B:1311:0x0b62, B:1314:0x0b9d, B:1315:0x0ba3, B:1317:0x0bab, B:1319:0x0bb2, B:1321:0x0bbc, B:1322:0x0bc4, B:1324:0x0bca, B:1326:0x0bd8, B:1328:0x0be0, B:1329:0x0bfe, B:1330:0x0bff, B:1332:0x0c25, B:1333:0x0c57, B:1334:0x0c58, B:1335:0x0c59, B:1336:0x0c5a, B:1338:0x0c6a, B:1339:0x0c75, B:1341:0x0c80, B:1343:0x0c8a, B:1345:0x0c9e, B:1346:0x0cb6, B:1347:0x0cbe, B:1349:0x0cd1, B:1351:0x0cd7, B:1289:0x0aca, B:1288:0x0ac7, B:1252:0x0a01, B:1254:0x0a07, B:1256:0x0a0d, B:1285:0x0abc, B:1286:0x0ac0, B:1221:0x099b, B:1223:0x09a1, B:1355:0x0cee, B:1183:0x08cc), top: B:1559:0x0878 }] */
    /* JADX WARN: Removed duplicated region for block: B:1336:0x0c5a A[Catch: 31p -> 0x0d0f, 31w -> 0x0d11, 2GT -> 0x0d13, 31t -> 0x0d15, 31v -> 0x0d17, 31q -> 0x0d19, 31m -> 0x0d1b, 31n -> 0x0d90, all -> 0x1115, TryCatch #17 {31q -> 0x0d19, blocks: (B:1170:0x0878, B:1172:0x088d, B:1173:0x0895, B:1175:0x089d, B:1177:0x08a3, B:1179:0x08ab, B:1180:0x08af, B:1181:0x08c6, B:1182:0x08c7, B:1184:0x08cf, B:1186:0x08d9, B:1187:0x08df, B:1189:0x08e8, B:1190:0x08f0, B:1193:0x08fd, B:1195:0x090a, B:1198:0x091c, B:1200:0x0928, B:1202:0x0936, B:1206:0x0952, B:1353:0x0ce6, B:1354:0x0ced, B:1203:0x0949, B:1208:0x0958, B:1210:0x0971, B:1212:0x0979, B:1218:0x0990, B:1220:0x0996, B:1213:0x097d, B:1215:0x0985, B:1217:0x098b, B:1227:0x09ab, B:1230:0x09b3, B:1232:0x09b9, B:1237:0x09ca, B:1233:0x09be, B:1235:0x09c4, B:1240:0x09d3, B:1242:0x09db, B:1248:0x09f1, B:1250:0x09f7, B:1243:0x09df, B:1245:0x09ea, B:1251:0x09fc, B:1258:0x0a13, B:1259:0x0a21, B:1261:0x0a27, B:1263:0x0a31, B:1265:0x0a37, B:1272:0x0a4e, B:1274:0x0a57, B:1275:0x0a70, B:1277:0x0a79, B:1278:0x0a92, B:1280:0x0a9b, B:1281:0x0ab5, B:1282:0x0ab6, B:1283:0x0ab7, B:1290:0x0acf, B:1292:0x0ae2, B:1293:0x0aea, B:1295:0x0af0, B:1297:0x0b02, B:1299:0x0b10, B:1300:0x0b19, B:1301:0x0b25, B:1303:0x0b2b, B:1305:0x0b37, B:1306:0x0b40, B:1308:0x0b4a, B:1309:0x0b50, B:1311:0x0b62, B:1314:0x0b9d, B:1315:0x0ba3, B:1317:0x0bab, B:1319:0x0bb2, B:1321:0x0bbc, B:1322:0x0bc4, B:1324:0x0bca, B:1326:0x0bd8, B:1328:0x0be0, B:1329:0x0bfe, B:1330:0x0bff, B:1332:0x0c25, B:1333:0x0c57, B:1334:0x0c58, B:1335:0x0c59, B:1336:0x0c5a, B:1338:0x0c6a, B:1339:0x0c75, B:1341:0x0c80, B:1343:0x0c8a, B:1345:0x0c9e, B:1346:0x0cb6, B:1347:0x0cbe, B:1349:0x0cd1, B:1351:0x0cd7, B:1289:0x0aca, B:1288:0x0ac7, B:1252:0x0a01, B:1254:0x0a07, B:1256:0x0a0d, B:1285:0x0abc, B:1286:0x0ac0, B:1221:0x099b, B:1223:0x09a1, B:1355:0x0cee, B:1183:0x08cc), top: B:1559:0x0878 }] */
    /* JADX WARN: Removed duplicated region for block: B:1419:0x0d9d A[Catch: all -> 0x111a, TryCatch #95 {all -> 0x111a, blocks: (B:1417:0x0d92, B:1419:0x0d9d, B:1420:0x0da8, B:1422:0x0dac, B:1423:0x0db4, B:1352:0x0cdd, B:1391:0x0d21, B:1395:0x0d32, B:1399:0x0d43, B:1403:0x0d53, B:1407:0x0d63, B:1411:0x0d73, B:1427:0x0dbd, B:1357:0x0cf4), top: B:1594:0x084d }] */
    /* JADX WARN: Removed duplicated region for block: B:1420:0x0da8 A[Catch: all -> 0x111a, TryCatch #95 {all -> 0x111a, blocks: (B:1417:0x0d92, B:1419:0x0d9d, B:1420:0x0da8, B:1422:0x0dac, B:1423:0x0db4, B:1352:0x0cdd, B:1391:0x0d21, B:1395:0x0d32, B:1399:0x0d43, B:1403:0x0d53, B:1407:0x0d63, B:1411:0x0d73, B:1427:0x0dbd, B:1357:0x0cf4), top: B:1594:0x084d }] */
    /* JADX WARN: Removed duplicated region for block: B:1584:0x10e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:954:0x02fa  */
    /* JADX WARN: Type inference failed for: r0v159, types: [com.whatsapp.backup.google.GoogleBackupService] */
    /* JADX WARN: Type inference failed for: r0v162, types: [com.whatsapp.backup.google.GoogleBackupService] */
    /* JADX WARN: Type inference failed for: r0v496, types: [X.31g] */
    /* JADX WARN: Type inference failed for: r0v505, types: [X.31g] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.StringBuilder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v118 */
    /* JADX WARN: Type inference failed for: r3v119 */
    /* JADX WARN: Type inference failed for: r3v120 */
    /* JADX WARN: Type inference failed for: r3v121 */
    /* JADX WARN: Type inference failed for: r3v122 */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r3v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r3v93 */
    /* JADX WARN: Type inference failed for: r3v94, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v99 */
    /* JADX WARN: Type inference failed for: r42v0, types: [android.content.Context, com.whatsapp.backup.google.GoogleBackupService, android.app.Service] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v45, types: [double] */
    /* JADX WARN: Type inference failed for: r4v47, types: [int] */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23, types: [X.31g] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5, types: [X.038, X.31g] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [X.31g] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v69 */
    /* JADX WARN: Type inference failed for: r8v7, types: [long] */
    /* JADX WARN: Type inference failed for: r8v70, types: [int] */
    /* JADX WARN: Type inference failed for: r8v71, types: [X.1ra] */
    /* JADX WARN: Type inference failed for: r8v72 */
    /* JADX WARN: Type inference failed for: r8v73 */
    /* JADX WARN: Type inference failed for: r8v74 */
    /* JADX WARN: Type inference failed for: r8v75 */
    /* JADX WARN: Type inference failed for: r8v76 */
    /* JADX WARN: Type inference failed for: r8v77 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v80 */
    /* JADX WARN: Type inference failed for: r8v81 */
    /* JADX WARN: Type inference failed for: r8v82 */
    /* JADX WARN: Type inference failed for: r8v83 */
    /* JADX WARN: Type inference failed for: r8v84 */
    /* JADX WARN: Type inference failed for: r8v85 */
    /* JADX WARN: Type inference failed for: r8v86 */
    /* JADX WARN: Type inference failed for: r8v87 */
    /* JADX WARN: Type inference failed for: r8v88 */
    /* JADX WARN: Type inference failed for: r8v89 */
    /* JADX WARN: Type inference failed for: r8v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v90 */
    /* JADX WARN: Type inference failed for: r8v91 */
    /* JADX WARN: Type inference failed for: r8v92 */
    /* JADX WARN: Type inference failed for: r8v93 */
    /* JADX WARN: Type inference failed for: r8v94 */
    /* JADX WARN: Type inference failed for: r8v95 */
    /* JADX WARN: Type inference failed for: r8v96 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:1370:0x0d09 -> B:1417:0x0d92). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:1391:0x0d21 -> B:1596:0x0dc9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:1395:0x0d32 -> B:1596:0x0dc9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:1399:0x0d43 -> B:1596:0x0dc9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:1403:0x0d53 -> B:1596:0x0dc9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:1407:0x0d63 -> B:1596:0x0dc9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:1411:0x0d73 -> B:1596:0x0dc9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:1427:0x0dbd -> B:1596:0x0dc9). Please submit an issue!!! */
    @Override // android.app.IntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onHandleIntent(android.content.Intent r43) {
        /*
            Method dump skipped, instructions count: 4478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.GoogleBackupService.onHandleIntent(android.content.Intent):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0026, code lost:
        if (r1 != false) goto L33;
     */
    @Override // android.app.IntentService, android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int onStartCommand(android.content.Intent r10, int r11, int r12) {
        /*
            r9 = this;
            int r8 = super.onStartCommand(r10, r11, r12)
            if (r10 == 0) goto L89
            java.lang.Object r2 = r9.A0h
            monitor-enter(r2)
            X.29e r0 = r9.A0C     // Catch: java.lang.Throwable -> L86
            java.lang.String r7 = r10.getAction()     // Catch: java.lang.Throwable -> L86
            X.02l r4 = r0.A01()     // Catch: java.lang.Throwable -> L86
            X.01c r5 = r0.A0I     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "action_restore"
            boolean r6 = r0.equals(r7)     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = "action_restore_media"
            if (r6 != 0) goto L28
            boolean r1 = r3.equals(r7)     // Catch: java.lang.Throwable -> L86
            r0 = 2131887593(0x7f1205e9, float:1.9409797E38)
            if (r1 == 0) goto L2b
        L28:
            r0 = 2131887624(0x7f120608, float:1.940986E38)
        L2b:
            java.lang.String r0 = r5.A06(r0)     // Catch: java.lang.Throwable -> L86
            r4.A0A(r0)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "action_backup"
            boolean r0 = r0.equals(r7)     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L3e
            r1 = 2131887583(0x7f1205df, float:1.9409777E38)
            goto L64
        L3e:
            if (r6 != 0) goto L61
            boolean r0 = r3.equals(r7)     // Catch: java.lang.Throwable -> L86
            if (r0 != 0) goto L61
            java.lang.String r0 = "action_change_number"
            boolean r0 = r0.equals(r7)     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L52
            r1 = 2131887583(0x7f1205df, float:1.9409777E38)
            goto L64
        L52:
            java.lang.String r0 = "action_delete"
            boolean r0 = r0.equals(r7)     // Catch: java.lang.Throwable -> L86
            r1 = 2131887583(0x7f1205df, float:1.9409777E38)
            if (r0 == 0) goto L64
            r1 = 2131887034(0x7f1203ba, float:1.9408664E38)
            goto L64
        L61:
            r1 = 2131887618(0x7f120602, float:1.9409848E38)
        L64:
            java.lang.String r0 = r5.A06(r1)     // Catch: java.lang.Throwable -> L86
            r4.A09(r0)     // Catch: java.lang.Throwable -> L86
            android.app.Notification r1 = r4.A01()     // Catch: java.lang.Throwable -> L86
            int r0 = r9.A00     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L7a
            X.29e r0 = r9.A0C     // Catch: java.lang.Throwable -> L86
            android.app.Notification r0 = r0.A0L     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L7a
            r1 = r0
        L7a:
            r0 = 5
            r9.startForeground(r0, r1)     // Catch: java.lang.Throwable -> L86
            int r0 = r9.A00     // Catch: java.lang.Throwable -> L86
            int r0 = r0 + 1
            r9.A00 = r0     // Catch: java.lang.Throwable -> L86
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L86
            return r8
        L86:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L86
            throw r0
        L89:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.GoogleBackupService.onStartCommand(android.content.Intent, int, int):int");
    }
}
