package com.google.firebase.iid;

import X.AnonymousClass088;
import X.AnonymousClass191;
import X.C02400Ba;
import X.C02420Bg;
import X.C02430Bh;
import X.C02460Bl;
import X.C08U;
import X.C0AC;
import X.C0AD;
import X.C0BF;
import X.C0BK;
import X.C0BY;
import X.C0BZ;
import X.C0Bc;
import X.C0Bm;
import X.C1CC;
import X.C32041dM;
import X.C32941f5;
import X.ThreadFactoryC232715y;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FirebaseInstanceId {
    public static C02400Ba A08;
    public static ScheduledThreadPoolExecutor A09;
    public static final long A0A = TimeUnit.HOURS.toSeconds(8);
    public C0Bc A00;
    public boolean A01;
    public final C08U A02;
    public final C02430Bh A03;
    public final C0BY A04;
    public final C02460Bl A05;
    public final C02420Bg A06;
    public final Executor A07;

    public FirebaseInstanceId(C08U c08u, C0BK c0bk, C0BF c0bf) {
        c08u.A03();
        Context context = c08u.A00;
        C0BY c0by = new C0BY(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = C0BZ.A00;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, threadFactory);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 30L, timeUnit, new LinkedBlockingQueue(), threadFactory);
        this.A01 = false;
        if (C0BY.A00(c08u) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (A08 == null) {
                c08u.A03();
                A08 = new C02400Ba(context);
            }
        }
        this.A02 = c08u;
        this.A04 = c0by;
        C0Bc c0Bc = this.A00;
        if (c0Bc == null) {
            c08u.A03();
            c0Bc = (C0Bc) c08u.A03.A02(C0Bc.class);
            if (c0Bc == null || c0Bc.A01.A01() == 0) {
                c0Bc = new C0Bc(c08u, c0by, threadPoolExecutor, c0bf);
                this.A00 = c0Bc;
            } else {
                this.A00 = c0Bc;
            }
        }
        this.A00 = c0Bc;
        this.A07 = threadPoolExecutor2;
        this.A06 = new C02420Bg(A08);
        C02430Bh c02430Bh = new C02430Bh(this, c0bk);
        this.A03 = c02430Bh;
        this.A05 = new C02460Bl(threadPoolExecutor);
        if (c02430Bh.A00()) {
            A06();
        }
    }

    public static C0Bm A00(String str, String str2) {
        C0Bm c0Bm;
        C02400Ba c02400Ba = A08;
        synchronized (c02400Ba) {
            c0Bm = null;
            String string = c02400Ba.A01.getString(C02400Ba.A01(str, str2), null);
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith("{")) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        c0Bm = new C0Bm(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                    } catch (JSONException e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                        sb.append("Failed to parse token: ");
                        sb.append(valueOf);
                        Log.w("FirebaseInstanceId", sb.toString());
                    }
                } else {
                    c0Bm = new C0Bm(string, null, 0L);
                }
            }
        }
        return c0Bm;
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x009d A[Catch: 1CS -> 0x00a2, all -> 0x00f2, TRY_LEAVE, TryCatch #2 {1CS -> 0x00a2, blocks: (B:67:0x0011, B:95:0x009d, B:92:0x0099, B:78:0x0050), top: B:111:0x0011, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A01() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.A01():java.lang.String");
    }

    public static void A02(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = A09;
            if (scheduledThreadPoolExecutor == null) {
                scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC232715y("FirebaseInstanceId"));
                A09 = scheduledThreadPoolExecutor;
            }
            scheduledThreadPoolExecutor.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public static boolean A03() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
    }

    public final Object A04(C0AC c0ac) {
        try {
            return AnonymousClass088.A0n(c0ac, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    A08();
                }
                throw cause;
            } else if (cause instanceof RuntimeException) {
                throw cause;
            } else {
                throw new IOException(e);
            }
        }
    }

    public String A05(String str, String str2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            str2 = (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase("gcm")) ? "*" : "*";
            C0AD c0ad = new C0AD();
            c0ad.A09(null);
            Executor executor = this.A07;
            AnonymousClass191 anonymousClass191 = new AnonymousClass191(this, str, str2) { // from class: X.1f2
                public final FirebaseInstanceId A00;
                public final String A01;
                public final String A02;

                {
                    this.A00 = this;
                    this.A01 = str;
                    this.A02 = str2;
                }

                @Override // X.AnonymousClass191
                public final Object AVU(C0AC c0ac) {
                    FirebaseInstanceId firebaseInstanceId = this.A00;
                    String str3 = this.A01;
                    String str4 = this.A02;
                    String A01 = FirebaseInstanceId.A01();
                    C0Bm A00 = FirebaseInstanceId.A00(str3, str4);
                    if (!firebaseInstanceId.A0B(A00)) {
                        C32941f5 c32941f5 = new C32941f5(A00.A01);
                        C0AD c0ad2 = new C0AD();
                        c0ad2.A09(c32941f5);
                        return c0ad2;
                    }
                    C02460Bl c02460Bl = firebaseInstanceId.A05;
                    synchronized (c02460Bl) {
                        Pair pair = new Pair(str3, str4);
                        Map map = c02460Bl.A00;
                        C0AC c0ac2 = (C0AC) map.get(pair);
                        if (c0ac2 != null) {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                String valueOf = String.valueOf(pair);
                                StringBuilder sb = new StringBuilder(valueOf.length() + 29);
                                sb.append("Joining ongoing request for: ");
                                sb.append(valueOf);
                                Log.d("FirebaseInstanceId", sb.toString());
                            }
                            return c0ac2;
                        }
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            String valueOf2 = String.valueOf(pair);
                            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 24);
                            sb2.append("Making new request for: ");
                            sb2.append(valueOf2);
                            Log.d("FirebaseInstanceId", sb2.toString());
                        }
                        C0Bc c0Bc = firebaseInstanceId.A00;
                        C0AC A012 = c0Bc.A01(c0Bc.A02(A01, str3, str4, new Bundle()));
                        Executor executor2 = firebaseInstanceId.A07;
                        C1CP c1cp = new C1CP(firebaseInstanceId, str3, str4, A01);
                        C0AD c0ad3 = (C0AD) A012;
                        if (c0ad3 != null) {
                            C0AD c0ad4 = new C0AD();
                            c0ad3.A03.A01(new C32091dR(executor2, c1cp, c0ad4));
                            c0ad3.A07();
                            Executor executor3 = c02460Bl.A01;
                            AnonymousClass191 anonymousClass1912 = new AnonymousClass191(c02460Bl, pair) { // from class: X.1f1
                                public final Pair A00;
                                public final C02460Bl A01;

                                {
                                    this.A01 = c02460Bl;
                                    this.A00 = pair;
                                }

                                @Override // X.AnonymousClass191
                                public final Object AVU(C0AC c0ac3) {
                                    C02460Bl c02460Bl2 = this.A01;
                                    Pair pair2 = this.A00;
                                    synchronized (c02460Bl2) {
                                        c02460Bl2.A00.remove(pair2);
                                    }
                                    return c0ac3;
                                }
                            };
                            C0AD c0ad5 = new C0AD();
                            c0ad4.A03.A01(new C32041dM(executor3, anonymousClass1912, c0ad5));
                            c0ad4.A07();
                            map.put(pair, c0ad5);
                            return c0ad5;
                        }
                        throw null;
                    }
                }
            };
            C0AD c0ad2 = new C0AD();
            c0ad.A03.A01(new C32041dM(executor, anonymousClass191, c0ad2));
            c0ad.A07();
            return ((C32941f5) A04(c0ad2)).A00;
        }
        throw new IOException("MAIN_THREAD");
    }

    public final void A06() {
        boolean z;
        if (!A0B(A00(C0BY.A00(this.A02), "*"))) {
            C02420Bg c02420Bg = this.A06;
            synchronized (c02420Bg) {
                z = c02420Bg.A00() != null;
            }
            if (!z) {
                return;
            }
        }
        A07();
    }

    public final synchronized void A07() {
        if (!this.A01) {
            A09(0L);
        }
    }

    public final synchronized void A08() {
        A08.A02();
        if (this.A03.A00()) {
            A07();
        }
    }

    public final synchronized void A09(long j) {
        A02(new C1CC(this, this.A06, Math.min(Math.max(30L, j << 1), A0A)), j);
        this.A01 = true;
    }

    public final synchronized void A0A(boolean z) {
        this.A01 = z;
    }

    public final boolean A0B(C0Bm c0Bm) {
        if (c0Bm != null) {
            String A04 = this.A04.A04();
            if (System.currentTimeMillis() <= c0Bm.A00 + C0Bm.A03 && A04.equals(c0Bm.A02)) {
                return false;
            }
        }
        return true;
    }

    public static FirebaseInstanceId getInstance(C08U c08u) {
        c08u.A03();
        return (FirebaseInstanceId) c08u.A03.A02(FirebaseInstanceId.class);
    }
}
