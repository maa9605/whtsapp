package com.whatsapp;

import X.AbstractC000600i;
import X.AbstractC011205o;
import X.AbstractC41801uX;
import X.AbstractServiceC07170Xd;
import X.AnonymousClass012;
import X.AnonymousClass075;
import X.C000200d;
import X.C000400f;
import X.C000500h;
import X.C001200o;
import X.C002701i;
import X.C003701t;
import X.C00J;
import X.C012005w;
import X.C01B;
import X.C01C;
import X.C01H;
import X.C01J;
import X.C01R;
import X.C02180Ae;
import X.C02620Cd;
import X.C02E;
import X.C02L;
import X.C03020Dv;
import X.C03720Gu;
import X.C03730Gv;
import X.C03790Hb;
import X.C03J;
import X.C04490Kj;
import X.C04580Kz;
import X.C04q;
import X.C05020My;
import X.C05E;
import X.C05G;
import X.C05W;
import X.C05Y;
import X.C07j;
import X.C0C8;
import X.C0C9;
import X.C0CB;
import X.C0CD;
import X.C0CE;
import X.C0DV;
import X.C0DW;
import X.C0E6;
import X.C0EB;
import X.C0EW;
import X.C0EY;
import X.C0G2;
import X.C0IO;
import X.C0KQ;
import X.C0L8;
import X.C0OD;
import X.C0OG;
import X.C0OH;
import X.C0XW;
import X.C1VL;
import X.C1VM;
import X.C22X;
import X.C25M;
import X.C26711Ki;
import X.C28K;
import X.C2A9;
import X.C2D9;
import X.C2EQ;
import X.C2Ly;
import X.C2MV;
import X.C2QS;
import X.C40291rx;
import X.C40421sE;
import X.C41291tg;
import X.C41361tn;
import X.C41541u6;
import X.C41661uJ;
import X.C41991uq;
import X.C42011us;
import X.C42101v5;
import X.C42171vH;
import X.C42371vd;
import X.C42711wC;
import X.C42961wc;
import X.C43121wt;
import X.C43131wu;
import X.C44311yr;
import X.C44331yt;
import X.C44341yu;
import X.C451220m;
import X.C470029d;
import X.C47402Bb;
import X.C47762Cm;
import X.C60002tl;
import X.C63002yu;
import X.C71933Ya;
import X.EnumC16390qK;
import X.InterfaceC002901k;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.AlarmService;
import com.whatsapp.cron.HourlyCronWorker;
import com.whatsapp.jobqueue.job.RotateSignedPreKeyJob;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;
import com.whatsapp.workers.ntp.NtpSyncWorker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class AlarmService extends AbstractServiceC07170Xd {
    public static volatile long A1G;
    public C03020Dv A00;
    public AbstractC000600i A01;
    public C26711Ki A02;
    public C012005w A03;
    public C02L A04;
    public C01B A05;
    public C0E6 A06;
    public C0L8 A07;
    public C470029d A08;
    public C0G2 A09;
    public C41291tg A0A;
    public C44341yu A0B;
    public C41541u6 A0C;
    public C44331yt A0D;
    public C42961wc A0E;
    public C44311yr A0F;
    public C05W A0G;
    public C42371vd A0H;
    public AnonymousClass075 A0I;
    public C0KQ A0J;
    public C47402Bb A0K;
    public C000400f A0L;
    public C02E A0M;
    public AnonymousClass012 A0N;
    public C001200o A0O;
    public C000500h A0P;
    public C41361tn A0Q;
    public C01J A0R;
    public C01R A0S;
    public C2D9 A0T;
    public C0C9 A0U;
    public C42711wC A0V;
    public C03730Gv A0W;
    public C0C8 A0X;
    public C42171vH A0Y;
    public C05E A0Z;
    public C60002tl A0a;
    public C41661uJ A0b;
    public C03720Gu A0c;
    public C22X A0d;
    public C0EB A0e;
    public C40421sE A0f;
    public C28K A0g;
    public C451220m A0h;
    public C01H A0i;
    public C003701t A0j;
    public C43131wu A0k;
    public C43121wt A0l;
    public C04490Kj A0m;
    public C63002yu A0n;
    public C05Y A0o;
    public C40291rx A0p;
    public C0DW A0q;
    public C0DV A0r;
    public C2Ly A0s;
    public C42101v5 A0t;
    public C05G A0u;
    public C0CB A0v;
    public AbstractC41801uX A0w;
    public C2EQ A0x;
    public C71933Ya A0y;
    public C25M A0z;
    public C47762Cm A10;
    public C0EY A11;
    public InterfaceC002901k A12;
    public WhatsAppLibLoader A13;
    public C2MV A14;
    public C0EW A15;
    public C2QS A16;
    public C03J A17;
    public C41991uq A18;
    public C42011us A19;
    public C00J A1A;
    public C00J A1B;
    public C00J A1C;
    public C00J A1D;
    public final Random A1E = new Random();
    public volatile String A1F;

    public static void A01(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
        } else if (i2 >= 19) {
            alarmManager.setExact(i, j, pendingIntent);
        } else {
            alarmManager.set(i, j, pendingIntent);
        }
    }

    @Override // X.AbstractServiceC05030Na
    public boolean A04() {
        return !"com.whatsapp.action.BACKUP_MESSAGES".equals(this.A1F);
    }

    @Override // X.AbstractServiceC05030Na
    public void A05(Intent intent) {
        PowerManager.WakeLock A0R;
        String action = intent.getAction();
        if (action == null) {
            Log.w("AlarmService received null action in intent");
        } else if (!this.A13.A04()) {
            Log.e("AlarmService skip, native libraries missing");
        } else {
            try {
                this.A1F = action;
                if (TextUtils.equals(action, "com.whatsapp.action.BACKUP_MESSAGES")) {
                    A0G(intent);
                } else if (!TextUtils.equals(action, "com.whatsapp.action.DAILY_CRON") && !TextUtils.equals(action, "com.whatsapp.action.DAILY_CATCHUP_CRON")) {
                    if (TextUtils.equals(action, "com.whatsapp.action.HOURLY_CRON")) {
                        A0I(intent);
                    } else if (TextUtils.equals(action, "com.whatsapp.action.SETUP")) {
                        A0K(intent);
                    } else if (TextUtils.equals(action, "com.whatsapp.action.UPDATE_NTP")) {
                        A0L(intent);
                    } else if (TextUtils.equals(action, "com.whatsapp.action.ROTATE_SIGNED_PREKEY")) {
                        A0J(intent);
                    } else if (TextUtils.equals(action, "com.whatsapp.action.HEARTBEAT_WAKEUP")) {
                        A0H(intent);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("AlarmService received unrecognized intent; intent=");
                        sb.append(intent);
                        Log.w(sb.toString());
                    }
                } else {
                    this.A08.A01(0, true);
                    StringBuilder sb2 = new StringBuilder("AlarmService/dailyCron intent=");
                    sb2.append(intent);
                    Log.i(sb2.toString());
                    PowerManager A0D = this.A0M.A0D();
                    if (A0D == null) {
                        Log.w("AlarmService/dailyCron pm=null");
                        A0R = null;
                    } else {
                        A0R = C02180Ae.A0R(A0D, 1, "AlarmService#dailyCron");
                        A0R.setReferenceCounted(false);
                        A0R.acquire(600000L);
                    }
                    A0D();
                    if (A0M()) {
                        Log.i("AlarmService/dailyCron; too frequent, skipping...");
                    } else {
                        A09();
                        C000500h c000500h = this.A0P;
                        c000500h.A0D().putLong("last_daily_cron", System.currentTimeMillis()).apply();
                    }
                    A0C();
                    if (A0R != null) {
                        A0R.release();
                    }
                    this.A08.A01(0, false);
                }
            } finally {
                this.A1F = null;
            }
        }
    }

    public void A06() {
        long A05 = this.A0N.A05();
        long j = this.A0P.A00.getLong("dithered_last_signed_prekey_rotation", Long.MIN_VALUE);
        if (j >= 0 && j <= A05) {
            long j2 = j + 2592000000L;
            if (j2 >= A05) {
                StringBuilder A0P = C000200d.A0P("AlarmService/rotateSignedPrekeyAndSenderKeys/rotate keys alarm fired before ready to rotate signed prekey; rotation skipped until ");
                A0P.append(C02620Cd.A02(j2));
                Log.e(A0P.toString());
                return;
            }
        }
        StringBuilder A0P2 = C000200d.A0P("AlarmService/rotateSignedPrekeyAndSenderKeys/rotating signed prekey now; now=");
        A0P2.append(C02620Cd.A02(A05));
        A0P2.append("; lastSignedPrekeyRotation=");
        A0P2.append(C02620Cd.A02(j));
        Log.i(A0P2.toString());
        C05020My A0G = this.A0R.A0G();
        this.A06.A00.A01(new RotateSignedPreKeyJob(A0G.A01, A0G.A00, A0G.A02));
        C000200d.A0h(this.A0P, "dithered_last_signed_prekey_rotation", A05);
        C02L c02l = this.A04;
        c02l.A05();
        if (c02l.A03 == null) {
            return;
        }
        long j3 = A05 - 2592000000L;
        ArrayList arrayList = new ArrayList();
        this.A0G.A05.A0V(arrayList, 1, false, false);
        long j4 = ((long) arrayList.size()) > 4000 ? A05 - 7776000000L : j3;
        C01J c01j = this.A0R;
        C02L c02l2 = this.A04;
        c02l2.A05();
        C0IO A0T = C002701i.A0T(c02l2.A02);
        c01j.A0H.A00();
        ArrayList<AbstractC011205o> arrayList2 = new ArrayList();
        C04q c04q = c01j.A0B;
        StringBuilder sb = new StringBuilder("SenderKeyStore deleting keys older than:");
        sb.append(j3);
        sb.append(" for sender:");
        sb.append(A0T);
        sb.append(" statusKeyExpirationTimeMs:");
        sb.append(j4);
        Log.i(sb.toString());
        long j5 = j3 / 1000;
        long j6 = j4 / 1000;
        ArrayList arrayList3 = new ArrayList();
        C0CD A02 = c04q.A00.A02();
        try {
            C03790Hb A00 = A02.A00();
            try {
                C0CE c0ce = A02.A02;
                String[] strArr = {"group_id"};
                StringBuilder sb2 = new StringBuilder();
                sb2.append("sender_id = ? AND device_id = ? AND group_id != '");
                C04580Kz c04580Kz = C04580Kz.A00;
                try {
                    sb2.append(c04580Kz.getRawString());
                    sb2.append("' AND ");
                    sb2.append("timestamp");
                    sb2.append(" < ?");
                    String obj = sb2.toString();
                    String str = A0T.A01;
                    String valueOf = String.valueOf(A0T.A00);
                    String valueOf2 = String.valueOf(j5);
                    Cursor A09 = c0ce.A09("sender_keys", strArr, obj, new String[]{str, valueOf, valueOf2}, null, "SignalSenderKeyStore/removeOldSenderKeys");
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("sender_id = ? AND device_id = ? AND group_id = '");
                    sb3.append(c04580Kz.getRawString());
                    sb3.append("' AND ");
                    sb3.append("timestamp");
                    sb3.append(" < ?");
                    String obj2 = sb3.toString();
                    String valueOf3 = String.valueOf(j6);
                    Cursor A092 = c0ce.A09("sender_keys", new String[]{"group_id"}, obj2, new String[]{str, valueOf, valueOf3}, null, "SignalSenderKeyStore/removeOldSenderKeys1");
                    if (A09 != null) {
                        while (A09.moveToNext()) {
                            arrayList3.add(A09.getString(0));
                        }
                        if (!arrayList3.isEmpty()) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("sender_id = ? AND device_id = ? AND group_id != '");
                            sb4.append(c04580Kz.getRawString());
                            sb4.append("' AND ");
                            sb4.append("timestamp");
                            sb4.append(" < ?");
                            c0ce.A01("sender_keys", sb4.toString(), new String[]{str, valueOf, valueOf2});
                        }
                    }
                    if (A092 != null) {
                        while (A092.moveToNext()) {
                            arrayList3.add(A092.getString(0));
                        }
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("sender_id = ? AND device_id = ? AND group_id = '");
                        sb5.append(c04580Kz.getRawString());
                        sb5.append("' AND ");
                        sb5.append("timestamp");
                        sb5.append(" < ?");
                        c0ce.A01("sender_keys", sb5.toString(), new String[]{str, valueOf, valueOf3});
                        A092.close();
                    }
                    if (A09 != null) {
                        A09.close();
                    }
                    A00.A00();
                    A00.close();
                    A02.close();
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        AbstractC011205o A052 = AbstractC011205o.A05((String) it.next());
                        if (A052 != null) {
                            arrayList2.add(A052);
                        }
                    }
                    for (AbstractC011205o abstractC011205o : arrayList2) {
                        C0C8 c0c8 = this.A0X;
                        c0c8.A04(c0c8.A01(abstractC011205o));
                    }
                } catch (Throwable th) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    A02.close();
                } catch (Throwable unused) {
                }
                throw th4;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x010e, code lost:
        throw null;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A07() {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AlarmService.A07():void");
    }

    public void A08() {
        C0XW A0D = this.A0R.A0D();
        byte[] bArr = new byte[32];
        System.arraycopy(A0D.A00().A01.A00(), 1, bArr, 0, 32);
        if (Arrays.equals(bArr, A0D.A00().A00.A01)) {
            Log.w("AlarmService/bad signed pre key found");
            C05020My A0G = this.A0R.A0G();
            C0E6 c0e6 = this.A06;
            c0e6.A00.A01(new RotateSignedPreKeyJob(A0G.A01, A0G.A00, A0G.A02));
            C000200d.A0j(this.A0P, "bad_signed_pre_key_check_done", true);
            return;
        }
        C000200d.A0j(this.A0P, "bad_signed_pre_key_check_done", true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x006f, code lost:
        if (java.lang.System.currentTimeMillis() < r2.A00.getLong("phoneid_last_sync_timestamp", -1)) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A09() {
        /*
            Method dump skipped, instructions count: 879
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AlarmService.A09():void");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:1044:0x0cc1  */
    /* JADX WARN: Removed duplicated region for block: B:1222:0x0c02 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0A() {
        /*
            Method dump skipped, instructions count: 3325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AlarmService.A0A():void");
    }

    public final void A0B() {
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(11) >= 2) {
            calendar.add(5, 1);
        }
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(11, 2);
        long timeInMillis = calendar.getTimeInMillis();
        C01B c01b = this.A05;
        Random random = this.A1E;
        int A07 = c01b.A07(C01C.A3d);
        long nextInt = (A07 <= 0 ? 0L : random.nextInt(A07 << 1) * 1000) + timeInMillis;
        StringBuilder A0P = C000200d.A0P("AlarmService/setupBackupMessagesAlarm; alarmTimeMillis=");
        A0P.append(new Date(nextInt));
        Log.i(A0P.toString());
        Intent intent = new Intent("com.whatsapp.action.BACKUP_MESSAGES", null, this, AlarmBroadcastReceiver.class);
        AlarmManager A02 = this.A0M.A02();
        if (A02 != null) {
            A01(A02, 0, nextInt, PendingIntent.getBroadcast(this, 0, intent, 134217728));
        } else {
            Log.w("AlarmService/setupBackupMessagesAlarm AlarmManager is null");
        }
    }

    public final void A0C() {
        AlarmManager A02 = this.A0M.A02();
        if (A02 == null) {
            Log.w("AlarmService/dailyCatchupCron; AlarmManager is null");
            return;
        }
        Intent intent = new Intent("com.whatsapp.action.DAILY_CATCHUP_CRON", null, this, AlarmBroadcastReceiver.class);
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, intent, 536870912);
        if (A0M()) {
            if (broadcast != null) {
                A02.cancel(broadcast);
                broadcast.cancel();
                return;
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.A0P.A00.getLong("next_daily_cron_catchup", 0L);
        long j2 = j - currentTimeMillis;
        if (broadcast != null && j2 > 0 && j2 < 900000) {
            C02620Cd.A02(j);
            return;
        }
        long j3 = currentTimeMillis + 900000;
        A01(A02, 1, j3, PendingIntent.getBroadcast(this, 0, intent, 0));
        C000200d.A0h(this.A0P, "next_daily_cron_catchup", j3);
        C02620Cd.A02(j3);
        C02620Cd.A02(this.A0P.A00.getLong("last_daily_cron", 0L));
    }

    public final void A0D() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, 1);
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(11, 0);
        long timeInMillis = calendar.getTimeInMillis();
        C01B c01b = this.A05;
        Random random = this.A1E;
        int A07 = c01b.A07(C01C.A3d);
        long nextInt = (A07 <= 0 ? 0L : random.nextInt(A07 << 1) * 1000) + timeInMillis;
        StringBuilder A0P = C000200d.A0P("AlarmService/setupDailyCronAlarm; alarmTimeMillis=");
        A0P.append(new Date(nextInt));
        Log.i(A0P.toString());
        Intent intent = new Intent("com.whatsapp.action.DAILY_CRON", null, this, AlarmBroadcastReceiver.class);
        AlarmManager A02 = this.A0M.A02();
        if (A02 != null) {
            A01(A02, 0, nextInt, PendingIntent.getBroadcast(this, 0, intent, 134217728));
        } else {
            Log.w("AlarmService/setupDailyCronAlarm AlarmManager is null");
        }
    }

    public final void A0E() {
        long A05 = this.A0N.A05();
        int A07 = this.A05.A07(C01C.A36);
        if (!this.A0P.A00.contains("last_heartbeat_login")) {
            long nextInt = A05 - (this.A1E.nextInt(A07) * 1000);
            this.A0P.A0D().putLong("last_heartbeat_login", nextInt).apply();
            StringBuilder sb = new StringBuilder("no last heartbeat known; setting to ");
            sb.append(C02620Cd.A02(nextInt));
            Log.i(sb.toString());
        }
        long j = this.A0P.A00.getLong("last_heartbeat_login", 0L);
        if (j <= A05 && (A07 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS) + j >= A05) {
            long elapsedRealtime = SystemClock.elapsedRealtime() + (((A07 * 1000) + j) - A05);
            StringBuilder A0P = C000200d.A0P("AlarmService/setupHeartbeatAlarm; elapsedRealTimeHeartbeatLogin=");
            A0P.append(C02620Cd.A02(elapsedRealtime));
            Log.i(A0P.toString());
            Intent intent = new Intent("com.whatsapp.action.HEARTBEAT_WAKEUP", null, this, AlarmBroadcastReceiver.class);
            AlarmManager A02 = this.A0M.A02();
            if (A02 != null) {
                A01(A02, 2, elapsedRealtime, PendingIntent.getBroadcast(this, 0, intent, 134217728));
                return;
            } else {
                Log.w("AlarmService/setupHeartbeatAlarm AlarmManager is null");
                return;
            }
        }
        StringBuilder A0S = C000200d.A0S("AlarmService/setupHeartbeatAlarm/last heart beat login=", j, " server time=");
        A0S.append(A05);
        A0S.append(" client time=");
        A0S.append(System.currentTimeMillis());
        A0S.append(" interval=");
        A0S.append(A07);
        Log.i(A0S.toString());
        A0H(null);
    }

    public final void A0F() {
        long A05 = this.A0N.A05();
        if (!this.A0P.A00.contains("dithered_last_signed_prekey_rotation")) {
            long nextInt = A05 - (this.A1E.nextInt(2592000) * 1000);
            StringBuilder A0P = C000200d.A0P("no signed prekey rotation schedule established; setting last rotation time to ");
            A0P.append(C02620Cd.A02(nextInt));
            Log.i(A0P.toString());
            C000200d.A0h(this.A0P, "dithered_last_signed_prekey_rotation", nextInt);
        }
        long j = this.A0P.A00.getLong("dithered_last_signed_prekey_rotation", Long.MIN_VALUE);
        if (j >= 0 && j <= A05) {
            long j2 = 2592000000L + j;
            if (j2 >= A05) {
                if (!this.A0P.A00.getBoolean("bad_signed_pre_key_check_done", false)) {
                    Log.i("AlarmService/checking bad signed pre key");
                    C01R c01r = this.A0S;
                    c01r.A00.submit(new Runnable() { // from class: X.1FU
                        {
                            AlarmService.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AlarmService.this.A08();
                        }
                    });
                }
                long j3 = j2 - A05;
                StringBuilder A0P2 = C000200d.A0P("scheduling alarm to trigger signed prekey rotation; now=");
                A0P2.append(C02620Cd.A02(A05));
                A0P2.append("; lastSignedPrekeyRotation=");
                A0P2.append(C02620Cd.A02(j));
                A0P2.append("; deltaToAlarm=");
                A0P2.append(j3);
                Log.i(A0P2.toString());
                long elapsedRealtime = SystemClock.elapsedRealtime() + j3;
                PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent("com.whatsapp.action.ROTATE_SIGNED_PREKEY", null, this, AlarmBroadcastReceiver.class), 134217728);
                AlarmManager A02 = this.A0M.A02();
                if (A02 != null) {
                    A01(A02, 2, elapsedRealtime, broadcast);
                    return;
                } else {
                    Log.w("AlarmService/setupRotateKeysAlarm AlarmManager is null");
                    return;
                }
            }
        }
        StringBuilder A0P3 = C000200d.A0P("scheduling immediate signed prekey rotation; now=");
        A0P3.append(C02620Cd.A02(A05));
        A0P3.append("; lastSignedPrekeyRotation=");
        A0P3.append(C02620Cd.A02(j));
        Log.i(A0P3.toString());
        this.A12.AS1(new Runnable() { // from class: X.1FT
            {
                AlarmService.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AlarmService.this.A0J(null);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00da A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0G(android.content.Intent r16) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AlarmService.A0G(android.content.Intent):void");
    }

    public final void A0H(Intent intent) {
        StringBuilder sb = new StringBuilder("AlarmService/heartbeatWakeup; intent=");
        sb.append(intent);
        Log.i(sb.toString());
        long A05 = this.A0N.A05();
        this.A0p.A0D(false, true, true, true, 0);
        C000200d.A0u("AlarmService/heartbeatWakeup/setting last heart beat login time: ", A05);
        this.A0P.A0D().putLong("last_heartbeat_login", A05).apply();
        A0E();
    }

    public final void A0I(Intent intent) {
        if (SystemClock.elapsedRealtime() - A1G < 1800000) {
            Log.i("AlarmService/hourlyCron too soon skip");
            return;
        }
        StringBuilder sb = new StringBuilder("AlarmService/hourlyCron; intent=");
        sb.append(intent);
        Log.i(sb.toString());
        HourlyCronWorker.A00(this.A0Q, (Set) this.A1C.get());
        A1G = SystemClock.elapsedRealtime();
    }

    public final void A0J(Intent intent) {
        PowerManager.WakeLock A0R;
        StringBuilder sb = new StringBuilder("AlarmService/rotateSignedPrekeyAndSenderKeys; intent=");
        sb.append(intent);
        Log.i(sb.toString());
        PowerManager A0D = this.A0M.A0D();
        if (A0D == null) {
            Log.w("AlarmService/rotateSignedPrekeyAndSenderKeys pm=null");
            A0R = null;
        } else {
            A0R = C02180Ae.A0R(A0D, 1, "AlarmService#rotateSignedPrekeyAndSenderKeys");
            A0R.setReferenceCounted(false);
            A0R.acquire(300000L);
        }
        try {
            try {
                C01R c01r = this.A0S;
                c01r.A00.submit(new Runnable() { // from class: X.1FX
                    {
                        AlarmService.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AlarmService.this.A06();
                    }
                }).get();
                A0F();
            } catch (InterruptedException e) {
                AssertionError assertionError = new AssertionError("interrupted during rotate keys alarm");
                assertionError.initCause(e);
                throw assertionError;
            } catch (ExecutionException e2) {
                AssertionError assertionError2 = new AssertionError("exception during rotate keys alarm");
                assertionError2.initCause(e2);
                throw assertionError2;
            }
        } finally {
            if (A0R != null) {
                A0R.release();
            }
        }
    }

    public final void A0K(Intent intent) {
        Class<AlarmBroadcastReceiver> cls;
        long j;
        EnumC16390qK enumC16390qK = EnumC16390qK.KEEP;
        StringBuilder sb = new StringBuilder("AlarmService/setup; intent=");
        sb.append(intent);
        Log.i(sb.toString());
        A0B();
        A0D();
        A0C();
        if (this.A0j.A0C(161)) {
            Log.i("AlarmService/hourly-cron; cancelling alarms.");
            cls = AlarmBroadcastReceiver.class;
            PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent("com.whatsapp.action.HOURLY_CRON", null, this, cls), 536870912);
            if (broadcast != null) {
                AlarmManager A02 = this.A0M.A02();
                if (A02 != null) {
                    A02.cancel(broadcast);
                }
                broadcast.cancel();
            }
            Log.i("AlarmService/hourly-cron; setting hourly cron using work manager.");
            C41361tn c41361tn = this.A0Q;
            if (c41361tn != null) {
                C1VL c1vl = new C1VL(HourlyCronWorker.class, TimeUnit.MILLISECONDS);
                c1vl.A01.add("tag.whatsapp.cron.hourly");
                ((C0OD) c41361tn.A03.get()).A03("name.whatsapp.cron.hourly", enumC16390qK, (C1VM) c1vl.A00());
            } else {
                throw null;
            }
        } else {
            Log.i("AlarmService/hourly-cron; cancelling work manager jobs.");
            C41361tn c41361tn2 = this.A0Q;
            ((C0OD) c41361tn2.A03.get()).A02("name.whatsapp.cron.hourly");
            ((C0OD) c41361tn2.A03.get()).A01("tag.whatsapp.cron.hourly");
            Log.i("AlarmService/hourly-cron; setting hourly cron using alarms");
            cls = AlarmBroadcastReceiver.class;
            Intent intent2 = new Intent("com.whatsapp.action.HOURLY_CRON", null, this, cls);
            if (PendingIntent.getBroadcast(this, 0, intent2, 536870912) == null) {
                AlarmManager A022 = this.A0M.A02();
                if (A022 != null) {
                    A022.setInexactRepeating(3, SystemClock.elapsedRealtime() + 3600000, 3600000L, PendingIntent.getBroadcast(this, 0, intent2, 0));
                } else {
                    Log.w("AlarmService/hourly-cron; setup skipped, AlarmManager is null");
                }
            }
        }
        if (this.A0j.A0C(170)) {
            Log.i("AlarmService/ntp-sync; cancelling ntp sync using alarm manager.");
            PendingIntent broadcast2 = PendingIntent.getBroadcast(this, 0, new Intent("com.whatsapp.action.UPDATE_NTP", null, this, cls), 536870912);
            if (broadcast2 != null) {
                AlarmManager A023 = this.A0M.A02();
                if (A023 != null) {
                    A023.cancel(broadcast2);
                }
                broadcast2.cancel();
            }
            Log.i("AlarmService/ntp-sync; setting ntp sync using work manager.");
            C42011us c42011us = this.A19;
            if (c42011us != null) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                C1VL c1vl2 = new C1VL(NtpSyncWorker.class, 43200000L, timeUnit, 21600000L, timeUnit);
                c1vl2.A01.add("tag.whatsapp.time.ntp");
                C0OG c0og = new C0OG();
                c0og.A03 = C07j.CONNECTED;
                c1vl2.A00.A09 = new C0OH(c0og);
                C2A9 c2a9 = c42011us.A02;
                ((C0OD) c2a9.get()).A03("name.whatsapp.time.ntp", enumC16390qK, (C1VM) c1vl2.A00());
                SharedPreferences.Editor edit = c42011us.A00().edit();
                synchronized (c2a9) {
                    j = c2a9.A00;
                }
                edit.putLong("/ntp/work_manager_init", j).apply();
            } else {
                throw null;
            }
        } else {
            Log.i("AlarmService/ntp-sync; cancelling ntp sync using work manager.");
            C42011us c42011us2 = this.A19;
            ((C0OD) c42011us2.A02.get()).A02("name.whatsapp.time.ntp");
            ((C0OD) c42011us2.A02.get()).A01("tag.whatsapp.time.ntp");
            Log.i("AlarmService/ntp-sync; setting up ntp sync using alarm manager.");
            PendingIntent broadcast3 = PendingIntent.getBroadcast(this, 0, new Intent("com.whatsapp.action.UPDATE_NTP", null, this, cls), 134217728);
            AlarmManager A024 = this.A0M.A02();
            if (A024 != null) {
                A024.setInexactRepeating(3, SystemClock.elapsedRealtime() + 43200000, 43200000L, broadcast3);
            } else {
                Log.w("AlarmService/setupUpdateNtpAlarm AlarmManager is null");
            }
        }
        A0F();
        A0E();
        C000500h c000500h = this.A0P;
        String string = c000500h.A00.getString("web_session_verification_browser_ids", null);
        if (string != null && Arrays.asList(string.split(",")) != null && c000500h.A00.getLong("web_session_verification_when_millis", -1L) != -1) {
            this.A18.A0D(getApplicationContext(), this.A0P.A00.getLong("web_session_verification_when_millis", -1L));
        }
        A0L(null);
    }

    public final void A0L(Intent intent) {
        PowerManager.WakeLock A0R;
        StringBuilder sb = new StringBuilder("AlarmService#updateNtp; intent=");
        sb.append(intent);
        Log.i(sb.toString());
        PowerManager A0D = this.A0M.A0D();
        if (A0D == null) {
            Log.w("AlarmService/updateNtp pm=null");
            A0R = null;
        } else {
            A0R = C02180Ae.A0R(A0D, 1, "AlarmService#updateNtp");
            A0R.setReferenceCounted(false);
            A0R.acquire(300000L);
        }
        try {
            NtpSyncWorker.A00(this.A19, this.A0O.A00, this.A0i, this.A0N);
        } finally {
            if (A0R != null) {
                A0R.release();
            }
        }
    }

    public final boolean A0M() {
        long j = this.A0P.A00.getLong("last_daily_cron", 0L);
        Calendar calendar = Calendar.getInstance();
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(11, 0);
        long timeInMillis = calendar.getTimeInMillis();
        long j2 = 86400000 + timeInMillis;
        if (j < timeInMillis || j >= j2) {
            long currentTimeMillis = System.currentTimeMillis() - j;
            return currentTimeMillis > 0 && currentTimeMillis < 21600000;
        }
        return true;
    }
}
