package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: X.17a  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C235117a {
    public static final Method A00;
    public static final Method A01;
    public static volatile InterfaceC235217b A02;

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = "JobSchedulerCompat"
            r5 = 6
            r2 = 0
            r6 = 24
            if (r0 < r6) goto L33
            java.lang.Class<android.app.job.JobScheduler> r8 = android.app.job.JobScheduler.class
            java.lang.String r7 = "scheduleAsPackage"
            r0 = 4
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L28
            r1 = 0
            java.lang.Class<android.app.job.JobInfo> r0 = android.app.job.JobInfo.class
            r4[r1] = r0     // Catch: java.lang.NoSuchMethodException -> L28
            r0 = 1
            r4[r0] = r9     // Catch: java.lang.NoSuchMethodException -> L28
            r1 = 2
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L28
            r4[r1] = r0     // Catch: java.lang.NoSuchMethodException -> L28
            r0 = 3
            r4[r0] = r9     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.reflect.Method r0 = r8.getDeclaredMethod(r7, r4)     // Catch: java.lang.NoSuchMethodException -> L28
            goto L34
        L28:
            boolean r0 = android.util.Log.isLoggable(r3, r5)
            if (r0 == 0) goto L33
            java.lang.String r0 = "No scheduleAsPackage method available, falling back to schedule"
            android.util.Log.e(r3, r0)
        L33:
            r0 = r2
        L34:
            X.C235117a.A00 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r6) goto L4e
            java.lang.Class<android.os.UserHandle> r1 = android.os.UserHandle.class
            java.lang.String r0 = "myUserId"
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r0, r2)     // Catch: java.lang.NoSuchMethodException -> L43
            goto L4e
        L43:
            boolean r0 = android.util.Log.isLoggable(r3, r5)
            if (r0 == 0) goto L4e
            java.lang.String r0 = "No myUserId method available"
            android.util.Log.e(r3, r0)
        L4e:
            X.C235117a.A01 = r2
            X.17b r0 = X.C31591cW.A00
            X.C235117a.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C235117a.<clinit>():void");
    }

    public static void A00(Context context, JobInfo jobInfo) {
        ((JobScheduler) context.getSystemService("jobscheduler")).schedule(jobInfo);
    }
}
