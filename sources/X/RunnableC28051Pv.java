package X;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.Logger;
import com.whatsapp.perf.ProfiloUploadService;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.1Pv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC28051Pv implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C01V A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ RunnableC28051Pv(C01V c01v, String str, int i, Runnable runnable) {
        this.A01 = c01v;
        this.A03 = str;
        this.A00 = i;
        this.A02 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C20120wq c20120wq;
        C20120wq c20120wq2;
        final C01V c01v = this.A01;
        String str2 = this.A03;
        int i = this.A00;
        Runnable runnable = this.A02;
        if (c01v.A00 != -1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AnonymousClass006 anonymousClass006 = c01v.A0J;
            long j = elapsedRealtime - anonymousClass006.A00;
            long uptimeMillis = SystemClock.uptimeMillis() - anonymousClass006.A01;
            if (c01v.A07) {
                if (c01v.A04 != null) {
                    HashMap hashMap = new HashMap(4);
                    hashMap.put("from", c01v.A05);
                    hashMap.put("to", str2);
                    AnonymousClass055 anonymousClass055 = c01v.A0M;
                    Long l = c01v.A04;
                    int i2 = c01v.A00;
                    if (anonymousClass055 != null) {
                        if (C28061Pw.A00 == 2 && (c20120wq2 = C20120wq.A07) != null && c20120wq2.A03.get() != 0) {
                            long longValue = Long.valueOf(l.longValue() | 2).longValue();
                            if (hashMap != null && !hashMap.isEmpty()) {
                                int i3 = 0;
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getKey() != null && !((String) entry.getKey()).isEmpty() && entry.getValue() != null && !((String) entry.getValue()).isEmpty()) {
                                        i3 += ((String) entry.getKey()).length() + ((String) entry.getKey()).length();
                                        if (i3 <= 2048) {
                                            int i4 = C37831n7.A00;
                                            if ((TraceEvents.sProviders & i4) != 0) {
                                                String str3 = (String) entry.getKey();
                                                int writeStandardEntry = Logger.writeStandardEntry(i4, 7, 59, 0L, 0, i2, 0, longValue);
                                                if (str3 != null) {
                                                    writeStandardEntry = Logger.writeBytesEntry(i4, 1, 56, writeStandardEntry, str3);
                                                }
                                                Logger.writeBytesEntry(i4, 1, 57, writeStandardEntry, (String) entry.getValue());
                                            }
                                        } else {
                                            throw new IllegalArgumentException(String.format(Locale.US, "Maximum Length(%d) of Profilo annotations exceeded %d", 2048L, Integer.valueOf(i3)));
                                        }
                                    }
                                }
                            }
                            Logger.writeStandardEntry(0, 7, 47, 0L, 0, i2, 0, longValue);
                            anonymousClass055.A01();
                        }
                    } else {
                        throw null;
                    }
                }
                int i5 = c01v.A00;
                if (C28061Pw.A00 == 2 && (c20120wq = C20120wq.A07) != null) {
                    c20120wq.A03(C37841n8.A00, 1, i5, 0);
                }
                Application application = c01v.A0H.A00;
                AbstractServiceC05030Na.A00(application, ProfiloUploadService.class, 8, new Intent(application, ProfiloUploadService.class));
            }
            C10240fW c10240fW = new C10240fW();
            c10240fW.A01 = Integer.valueOf(c01v.A01);
            c10240fW.A03 = Long.valueOf(j);
            c10240fW.A02 = Long.valueOf(uptimeMillis);
            c10240fW.A00 = Integer.valueOf(i);
            c01v.A0I.A0B(c10240fW, c01v.A02, false);
            c01v.A0V.AS1(new Runnable() { // from class: X.1Pu
                @Override // java.lang.Runnable
                public final void run() {
                    String str4;
                    C01V c01v2 = C01V.this;
                    AnonymousClass056 anonymousClass056 = c01v2.A0L;
                    int i6 = c01v2.A01;
                    synchronized (anonymousClass056) {
                        SharedPreferences.Editor edit = anonymousClass056.A02().edit();
                        edit.putInt(AnonymousClass056.A01(i6), anonymousClass056.A02().getInt(AnonymousClass056.A01(i6), 0) + 1);
                        if (i6 == 1) {
                            str4 = "last_cold_start_time_min";
                        } else if (i6 == 2) {
                            str4 = "last_warm_start_time_min";
                        } else if (i6 != 3) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unknown wam launch type enum value: ");
                            sb.append(i6);
                            throw new IllegalArgumentException(sb.toString());
                        } else {
                            str4 = "last_lukewarm_start_time_min";
                        }
                        edit.putInt(str4, (int) ((anonymousClass056.A01.A05() / 1000) / 60));
                        edit.apply();
                    }
                }
            });
            C001800u c001800u = c01v.A03;
            if (c001800u != null) {
                if (2 == i) {
                    str = "chat";
                } else {
                    str = 1 == i ? "chat_list" : "";
                }
                c001800u.A03.AGG(c001800u.A01.A00, "destination", str);
                C001800u c001800u2 = c01v.A03;
                c001800u2.A03.AGI(c001800u2.A01.A00, (short) 2);
            }
            c01v.A00 = -1;
            c01v.A05 = null;
            c01v.A07 = false;
            c01v.A04 = null;
        }
        if (runnable != null) {
            runnable.run();
        }
    }
}
