package X;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.PowerManager;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: X.0Mo */
/* loaded from: classes.dex */
public class C04940Mo {
    public static C04940Mo A01 = new C04940Mo();
    public InterfaceC05040Nb A00;

    public File A00(File file, boolean z) {
        ArrayList<File> arrayList;
        AnonymousClass289 anonymousClass289 = (AnonymousClass289) this.A00;
        if (anonymousClass289 != null) {
            if (z) {
                arrayList = Log.getLatestLogs(3);
            } else {
                arrayList = new ArrayList();
            }
            if (file != null) {
                arrayList.add(file);
            }
            File[] A012 = C40001rG.A01(anonymousClass289.A0F);
            if (A012.length > 0) {
                Collections.addAll(arrayList, A012);
            } else {
                Log.w("debug-builder/upload-zipped-log-files no ANR traces to send");
            }
            if (arrayList.size() != 0) {
                File A06 = anonymousClass289.A0B.A06("logs.zip");
                try {
                    ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(A06)));
                    byte[] bArr = new byte[16384];
                    for (File file2 : arrayList) {
                        try {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2), 16384);
                            try {
                                zipOutputStream.putNextEntry(new ZipEntry(file2.getName()));
                                while (true) {
                                    int read = bufferedInputStream.read(bArr, 0, 16384);
                                    if (read == -1) {
                                        break;
                                    }
                                    zipOutputStream.write(bArr, 0, read);
                                }
                                bufferedInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                    break;
                                } catch (Throwable th2) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (Throwable unused) {
                                    }
                                    throw th2;
                                    break;
                                }
                            }
                        } catch (IOException e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("debug-builder/cant zip file ");
                            sb.append(file2.getName());
                            Log.e(sb.toString(), e);
                        }
                    }
                    zipOutputStream.close();
                    return A06;
                } catch (IOException e2) {
                    Log.e("debug-builder/zip ", e2);
                }
            }
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:442:0x018b, code lost:
        if ((r1 instanceof com.whatsapp.support.DescribeProblemActivity) == false) goto L321;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A01(android.content.Context r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, boolean r43, long r44, long r46, java.lang.String r48, boolean r49, java.util.List r50) {
        /*
            Method dump skipped, instructions count: 1850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04940Mo.A01(android.content.Context, java.lang.String, java.lang.String, java.lang.String, boolean, long, long, java.lang.String, boolean, java.util.List):java.lang.String");
    }

    public String A02(String str) {
        File file;
        C05070Ne A012;
        List list;
        AnonymousClass289 anonymousClass289 = (AnonymousClass289) this.A00;
        if (anonymousClass289 != null) {
            ArrayList latestLogs = Log.getLatestLogs(1);
            if (latestLogs.size() < 1) {
                Log.e("debug-builder/upload-logs no logs found to be uploaded.");
            } else {
                if (!(anonymousClass289.A0H.A00.getLong("in_log_del_on_upgrade_new", -1L) == 2)) {
                    C02L c02l = anonymousClass289.A04;
                    c02l.A05();
                    if (c02l.A00 == null || anonymousClass289.A0T.A06()) {
                        Log.e("debug-builder/upload-logs can not upload logs");
                        return null;
                    }
                }
                File file2 = (File) latestLogs.get(0);
                if (file2.length() > 8388608) {
                    file = AnonymousClass024.A06(anonymousClass289.A0C, file2, 8388608, 41943040);
                    if (file == null) {
                        return null;
                    }
                } else {
                    file = file2;
                }
                final StringBuffer stringBuffer = new StringBuffer();
                final ConditionVariable conditionVariable = new ConditionVariable();
                InterfaceC05060Nd interfaceC05060Nd = new InterfaceC05060Nd() { // from class: X.28J
                    @Override // X.InterfaceC05060Nd
                    public void AJD(long j) {
                    }

                    @Override // X.InterfaceC05060Nd
                    public void AJz(Map map, String str2) {
                        C000200d.A13("Error received: ", str2);
                    }

                    @Override // X.InterfaceC05060Nd
                    public void AO0(Map map, String str2) {
                        Iterator it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                        List list2 = (List) map.get("X-Uploaded-File-Id");
                        if (list2 != null && !list2.isEmpty()) {
                            stringBuffer.append((String) list2.get(0));
                        }
                        conditionVariable.open();
                    }
                };
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        A012 = anonymousClass289.A0M.A01("https://crashlogs.whatsapp.net/wa_clb_data", interfaceC05060Nd);
                        list = A012.A0D;
                        list.add(Pair.create("access_token", "1063127757113399|745146ffa34413f9dbb5469f5370b7af"));
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        A012.A05(fileInputStream, "file", file.getName(), 0L, file.length());
                        list.add(Pair.create("type", "support"));
                        AbstractC000600i abstractC000600i = anonymousClass289.A03;
                        list.add(Pair.create("from", abstractC000600i.A05()));
                        list.add(Pair.create("forced", "true"));
                        list.add(Pair.create("android_hprof_extras", abstractC000600i.A06(null)));
                        if (str != null) {
                            list.add(Pair.create("ticket_id", str));
                        }
                        A012.A01(null);
                        fileInputStream.close();
                        conditionVariable.block(100000L);
                        if (stringBuffer.length() != 0) {
                            if (!file.getAbsolutePath().equals(file2.getAbsolutePath())) {
                                file.delete();
                            }
                            return stringBuffer.toString();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Exception e) {
                    Log.e(e);
                    return null;
                }
            }
            return null;
        }
        throw null;
    }

    public void A03() {
        boolean booleanValue;
        NotificationManager notificationManager;
        PowerManager A0D;
        C05090Ng A02;
        AnonymousClass289 anonymousClass289 = (AnonymousClass289) this.A00;
        if (anonymousClass289.A05.A0E(C01C.A2R)) {
            AnonymousClass024.A0O();
        }
        StringBuilder A0V = C000200d.A0V("app-state", "/settings/notifications-enabled: ");
        C001200o c001200o = anonymousClass289.A0F;
        A0V.append(new C005202i(c001200o.A00).A03());
        Log.i(A0V.toString());
        if (Build.VERSION.SDK_INT >= 23) {
            StringBuilder A0V2 = C000200d.A0V("app-state", "/auth-keystore-result:");
            C01L c01l = anonymousClass289.A00;
            synchronized (c01l) {
                A02 = c01l.A02();
            }
            C000200d.A1F(A0V2, A02.A00);
        }
        if (Build.VERSION.SDK_INT >= 21 && (A0D = anonymousClass289.A0E.A0D()) != null) {
            StringBuilder A0V3 = C000200d.A0V("app-state", "/power-save-mode:");
            A0V3.append(A0D.isPowerSaveMode());
            Log.i(A0V3.toString());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            StringBuilder A0V4 = C000200d.A0V("app-state", "/bg-data-restricted:");
            A0V4.append(anonymousClass289.A0D.A06());
            Log.i(A0V4.toString());
        }
        if (Build.VERSION.SDK_INT >= 28 && (notificationManager = (NotificationManager) c001200o.A00.getSystemService("notification")) != null) {
            int currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
            boolean z = true;
            C000200d.A1V(C000200d.A0V("app-state", "/do-not-disturb:"), (currentInterruptionFilter == 1 || currentInterruptionFilter == 0) ? false : false);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            C02E c02e = anonymousClass289.A0E;
            ActivityManager A012 = c02e.A01();
            if (A012 != null) {
                StringBuilder A0V5 = C000200d.A0V("app-state", "/background-restricted:");
                A0V5.append(A012.isBackgroundRestricted());
                Log.i(A0V5.toString());
            }
            UsageStatsManager A05 = c02e.A05();
            if (A05 != null) {
                long currentTimeMillis = System.currentTimeMillis();
                UsageEvents queryEventsForSelf = A05.queryEventsForSelf(currentTimeMillis - TimeUnit.HOURS.toMillis(12L), currentTimeMillis);
                UsageEvents.Event event = new UsageEvents.Event();
                while (queryEventsForSelf.getNextEvent(event)) {
                    if (event.getEventType() == 11) {
                        StringBuilder A0V6 = C000200d.A0V("app-state", "/app-standby bucket:");
                        A0V6.append(event.getAppStandbyBucket());
                        A0V6.append(" time:");
                        A0V6.append(event.getTimeStamp());
                        Log.i(A0V6.toString());
                    }
                }
                StringBuilder A0V7 = C000200d.A0V("app-state", "/current app-standby bucket:");
                A0V7.append(A05.getAppStandbyBucket());
                Log.i(A0V7.toString());
            } else {
                Log.i("app-state/usage-stats-manager null");
            }
            C28K c28k = anonymousClass289.A0J;
            C05E c05e = c28k.A0A;
            c05e.A05();
            if (c05e.A01) {
                Iterator it = ((AbstractCollection) c28k.A0B.A02().A03()).iterator();
                while (it.hasNext()) {
                    AbstractC05100Nh abstractC05100Nh = (AbstractC05100Nh) it.next();
                    StringBuilder A0V8 = C000200d.A0V("app-state", "/db-migration-status/");
                    A0V8.append(abstractC05100Nh.A0B);
                    A0V8.append(":");
                    A0V8.append(abstractC05100Nh.A04());
                    Log.i(A0V8.toString());
                }
                StringBuilder A0V9 = C000200d.A0V("app-state", "/db-migration-status-overall:");
                c05e.A05();
                C05J c05j = c05e.A06;
                synchronized (c05j) {
                    booleanValue = c05j.A0I(c05j.A00).booleanValue();
                }
                A0V9.append(booleanValue);
                Log.i(A0V9.toString());
                c05e.A05();
                if (c05j.A00 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("app-state");
                    sb.append("/");
                    sb.append("message_view");
                    sb.append(":");
                    sb.append(c05j.A0J("message_view"));
                    Log.i(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("app-state");
                    sb2.append("/");
                    sb2.append("available_message_view");
                    sb2.append(":");
                    sb2.append(c05j.A0J("available_message_view"));
                    Log.i(sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    C000200d.A1U(sb3, "app-state", "/", "legacy_available_messages_view", ":");
                    sb3.append(c05j.A0J("legacy_available_messages_view"));
                    Log.i(sb3.toString());
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("app-state");
                    sb4.append("/");
                    sb4.append("deleted_messages_view");
                    sb4.append(":");
                    sb4.append(c05j.A0J("deleted_messages_view"));
                    Log.i(sb4.toString());
                    StringBuilder sb5 = new StringBuilder();
                    C000200d.A1U(sb5, "app-state", "/", "deleted_messages_ids_view", ":");
                    sb5.append(c05j.A0J("deleted_messages_ids_view"));
                    Log.i(sb5.toString());
                    return;
                }
                return;
            }
            Log.i("app-state/db-migration-status-not-ready");
        }
    }
}
