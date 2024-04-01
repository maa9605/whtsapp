package androidx.work.impl.background.systemjob;

import X.AbstractC16430qO;
import X.C0OP;
import X.InterfaceC16530qZ;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC16530qZ {
    public static final String A02 = AbstractC16430qO.A01("SystemJobService");
    public C0OP A00;
    public final Map A01 = new HashMap();

    @Override // X.InterfaceC16530qZ
    public void AK7(String workSpecId, boolean needsReschedule) {
        JobParameters jobParameters;
        AbstractC16430qO.A00().A02(A02, String.format("%s executed on JobScheduler", workSpecId), new Throwable[0]);
        Map map = this.A01;
        synchronized (map) {
            jobParameters = (JobParameters) map.remove(workSpecId);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, needsReschedule);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            C0OP A00 = C0OP.A00(getApplicationContext());
            this.A00 = A00;
            A00.A03.A02(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                AbstractC16430qO.A00().A05(A02, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C0OP c0op = this.A00;
        if (c0op != null) {
            c0op.A03.A03(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x003f  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            X.0OP r0 = r8.A00
            r4 = 1
            r7 = 0
            if (r0 != 0) goto L17
            X.0qO r3 = X.AbstractC16430qO.A00()
            java.lang.String r2 = androidx.work.impl.background.systemjob.SystemJobService.A02
            java.lang.String r1 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r0 = new java.lang.Throwable[r7]
            r3.A02(r2, r1, r0)
            r8.jobFinished(r9, r4)
            return r7
        L17:
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r1 = r9.getExtras()     // Catch: java.lang.NullPointerException -> L2a
            if (r1 == 0) goto L2a
            boolean r0 = r1.containsKey(r2)     // Catch: java.lang.NullPointerException -> L2a
            if (r0 == 0) goto L2a
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.NullPointerException -> L2a
            goto L2b
        L2a:
            r5 = 0
        L2b:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L3f
            X.0qO r3 = X.AbstractC16430qO.A00()
            java.lang.String r2 = androidx.work.impl.background.systemjob.SystemJobService.A02
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r0 = new java.lang.Throwable[r7]
            r3.A03(r2, r1, r0)
            return r7
        L3f:
            java.util.Map r6 = r8.A01
            monitor-enter(r6)
            boolean r0 = r6.containsKey(r5)     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto L5f
            X.0qO r3 = X.AbstractC16430qO.A00()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r2 = androidx.work.impl.background.systemjob.SystemJobService.A02     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r1 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lb9
            r0[r7] = r5     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r1 = java.lang.String.format(r1, r0)     // Catch: java.lang.Throwable -> Lb9
            java.lang.Throwable[] r0 = new java.lang.Throwable[r7]     // Catch: java.lang.Throwable -> Lb9
            r3.A02(r2, r1, r0)     // Catch: java.lang.Throwable -> Lb9
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb9
            return r7
        L5f:
            X.0qO r3 = X.AbstractC16430qO.A00()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r2 = androidx.work.impl.background.systemjob.SystemJobService.A02     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r1 = "onStartJob for %s"
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lb9
            r0[r7] = r5     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r1 = java.lang.String.format(r1, r0)     // Catch: java.lang.Throwable -> Lb9
            java.lang.Throwable[] r0 = new java.lang.Throwable[r7]     // Catch: java.lang.Throwable -> Lb9
            r3.A02(r2, r1, r0)     // Catch: java.lang.Throwable -> Lb9
            r6.put(r5, r9)     // Catch: java.lang.Throwable -> Lb9
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb9
            r3 = 0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto La8
            X.0qW r3 = new X.0qW
            r3.<init>()
            android.net.Uri[] r0 = r9.getTriggeredContentUris()
            if (r0 == 0) goto L91
            android.net.Uri[] r0 = r9.getTriggeredContentUris()
            java.util.Arrays.asList(r0)
        L91:
            java.lang.String[] r0 = r9.getTriggeredContentAuthorities()
            if (r0 == 0) goto L9e
            java.lang.String[] r0 = r9.getTriggeredContentAuthorities()
            java.util.Arrays.asList(r0)
        L9e:
            r0 = 28
            if (r1 < r0) goto La8
            android.net.Network r0 = r9.getNetwork()
            r3.A00 = r0
        La8:
            X.0OP r2 = r8.A00
            X.0rs r0 = r2.A06
            X.0rb r1 = new X.0rb
            r1.<init>(r2, r5, r3)
            X.1WH r0 = (X.C1WH) r0
            X.0ra r0 = r0.A01
            r0.execute(r1)
            return r4
        Lb9:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x003c  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onStopJob(android.app.job.JobParameters r8) {
        /*
            r7 = this;
            X.0OP r0 = r7.A00
            r4 = 1
            r6 = 0
            if (r0 != 0) goto L14
            X.0qO r3 = X.AbstractC16430qO.A00()
            java.lang.String r2 = androidx.work.impl.background.systemjob.SystemJobService.A02
            java.lang.String r1 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r0 = new java.lang.Throwable[r6]
            r3.A02(r2, r1, r0)
            return r4
        L14:
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r1 = r8.getExtras()     // Catch: java.lang.NullPointerException -> L27
            if (r1 == 0) goto L27
            boolean r0 = r1.containsKey(r2)     // Catch: java.lang.NullPointerException -> L27
            if (r0 == 0) goto L27
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.NullPointerException -> L27
            goto L28
        L27:
            r5 = 0
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L3c
            X.0qO r3 = X.AbstractC16430qO.A00()
            java.lang.String r2 = androidx.work.impl.background.systemjob.SystemJobService.A02
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r0 = new java.lang.Throwable[r6]
            r3.A03(r2, r1, r0)
            return r6
        L3c:
            X.0qO r3 = X.AbstractC16430qO.A00()
            java.lang.String r2 = androidx.work.impl.background.systemjob.SystemJobService.A02
            java.lang.String r1 = "onStopJob for %s"
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r6] = r5
            java.lang.String r1 = java.lang.String.format(r1, r0)
            java.lang.Throwable[] r0 = new java.lang.Throwable[r6]
            r3.A02(r2, r1, r0)
            java.util.Map r1 = r7.A01
            monitor-enter(r1)
            r1.remove(r5)     // Catch: java.lang.Throwable -> L70
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L70
            X.0OP r0 = r7.A00
            r0.A05(r5)
            X.0OP r0 = r7.A00
            X.1VP r0 = r0.A03
            java.lang.Object r1 = r0.A08
            monitor-enter(r1)
            java.util.Set r0 = r0.A07     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r0.contains(r5)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6d
            r0 = r0 ^ r4
            return r0
        L6d:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6d
            throw r0
        L70:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L70
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStopJob(android.app.job.JobParameters):boolean");
    }
}
