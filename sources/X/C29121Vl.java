package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1Vl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29121Vl implements InterfaceC16550qb {
    public static final String A04 = AbstractC16430qO.A01("SystemJobScheduler");
    public final JobScheduler A00;
    public final Context A01;
    public final C0OP A02;
    public final C16730qv A03;

    @Override // X.InterfaceC16550qb
    public boolean AET() {
        return true;
    }

    public C29121Vl(Context context, C0OP workManager) {
        C16730qv c16730qv = new C16730qv(context);
        this.A01 = context;
        this.A02 = workManager;
        this.A00 = (JobScheduler) context.getSystemService("jobscheduler");
        this.A03 = c16730qv;
    }

    public static List A00(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            AbstractC16430qO.A00().A03(A04, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List A01(android.content.Context r4, android.app.job.JobScheduler r5, java.lang.String r6) {
        /*
            java.util.List r1 = A00(r4, r5)
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r4 = r1.iterator()
        L12:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r3 = r4.next()
            android.app.job.JobInfo r3 = (android.app.job.JobInfo) r3
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r1 = r3.getExtras()
            if (r1 == 0) goto L31
            boolean r0 = r1.containsKey(r2)     // Catch: java.lang.NullPointerException -> L31
            if (r0 == 0) goto L31
            java.lang.String r0 = r1.getString(r2)     // Catch: java.lang.NullPointerException -> L31
            goto L32
        L31:
            r0 = 0
        L32:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L12
            int r0 = r3.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            goto L12
        L44:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29121Vl.A01(android.content.Context, android.app.job.JobScheduler, java.lang.String):java.util.List");
    }

    public static void A02(JobScheduler jobScheduler, int id) {
        try {
            jobScheduler.cancel(id);
        } catch (Throwable th) {
            AbstractC16430qO.A00().A03(A04, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(id)), th);
        }
    }

    public static void A03(Context context) {
        List<JobInfo> A00;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (A00 = A00(context, jobScheduler)) == null || A00.isEmpty()) {
            return;
        }
        for (JobInfo jobInfo : A00) {
            A02(jobScheduler, jobInfo.getId());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0081 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A04(android.content.Context r9, X.C0OP r10) {
        /*
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r8 = r9.getSystemService(r0)
            android.app.job.JobScheduler r8 = (android.app.job.JobScheduler) r8
            java.util.List r3 = A00(r9, r8)
            androidx.work.impl.WorkDatabase r0 = r10.A04
            X.0rI r1 = r0.A08()
            X.1Vv r1 = (X.C29201Vv) r1
            r0 = 0
            if (r1 == 0) goto Le8
            java.lang.String r0 = "SELECT DISTINCT work_spec_id FROM SystemIdInfo"
            r7 = 0
            X.1Uj r2 = X.C28911Uj.A00(r0, r7)
            X.0ov r0 = r1.A01
            r0.A02()
            android.database.Cursor r1 = X.C15600p1.A00(r0, r2, r7)
            int r0 = r1.getCount()     // Catch: java.lang.Throwable -> Le0
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le0
            r4.<init>(r0)     // Catch: java.lang.Throwable -> Le0
        L30:
            boolean r0 = r1.moveToNext()     // Catch: java.lang.Throwable -> Le0
            if (r0 == 0) goto L3e
            java.lang.String r0 = r1.getString(r7)     // Catch: java.lang.Throwable -> Le0
            r4.add(r0)     // Catch: java.lang.Throwable -> Le0
            goto L30
        L3e:
            r1.close()
            r2.A01()
            if (r3 == 0) goto L8d
            int r0 = r3.size()
        L4a:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r0)
            if (r3 == 0) goto L8f
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L8f
            java.util.Iterator r6 = r3.iterator()
        L5b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r3 = r6.next()
            android.app.job.JobInfo r3 = (android.app.job.JobInfo) r3
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r1 = r3.getExtras()
            if (r1 == 0) goto L7a
            boolean r0 = r1.containsKey(r2)     // Catch: java.lang.NullPointerException -> L7a
            if (r0 == 0) goto L7a
            java.lang.String r1 = r1.getString(r2)     // Catch: java.lang.NullPointerException -> L7a
            goto L7b
        L7a:
            r1 = 0
        L7b:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L85
            r5.add(r1)
            goto L5b
        L85:
            int r0 = r3.getId()
            A02(r8, r0)
            goto L5b
        L8d:
            r0 = 0
            goto L4a
        L8f:
            java.util.Iterator r1 = r4.iterator()
        L93:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Ldf
            java.lang.Object r0 = r1.next()
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L93
            X.0qO r3 = X.AbstractC16430qO.A00()
            java.lang.String r2 = X.C29121Vl.A04
            java.lang.Throwable[] r1 = new java.lang.Throwable[r7]
            java.lang.String r0 = "Reconciling jobs"
            r3.A02(r2, r0, r1)
            r7 = 1
            androidx.work.impl.WorkDatabase r6 = r10.A04
            r6.A03()
            X.0rO r5 = r6.A0B()     // Catch: java.lang.Throwable -> Ld7
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Ld7
        Lbe:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto Ld3
            java.lang.Object r3 = r4.next()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Ld7
            r1 = -1
            r0 = r5
            X.1W8 r0 = (X.C1W8) r0
            r0.A0B(r3, r1)     // Catch: java.lang.Throwable -> Ld7
            goto Lbe
        Ld3:
            r6.A05()     // Catch: java.lang.Throwable -> Ld7
            goto Ldc
        Ld7:
            r0 = move-exception
            r6.A04()
            throw r0
        Ldc:
            r6.A04()
        Ldf:
            return r7
        Le0:
            r0 = move-exception
            r1.close()
            r2.A01()
            throw r0
        Le8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29121Vl.A04(android.content.Context, X.0OP):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(X.C0OL r15, int r16) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29121Vl.A05(X.0OL, int):void");
    }

    @Override // X.InterfaceC16550qb
    public void A5z(String workSpecId) {
        Context context = this.A01;
        JobScheduler jobScheduler = this.A00;
        List<Number> A01 = A01(context, jobScheduler, workSpecId);
        if (A01 == null || A01.isEmpty()) {
            return;
        }
        for (Number number : A01) {
            A02(jobScheduler, number.intValue());
        }
        ((C29201Vv) this.A02.A04.A08()).A02(workSpecId);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.0rV] */
    @Override // X.InterfaceC16550qb
    public void ASD(C0OL... workSpecs) {
        int A00;
        List A01;
        int A002;
        C0OP c0op = this.A02;
        WorkDatabase workDatabase = c0op.A04;
        ?? r6 = new Object(workDatabase) { // from class: X.0rV
            public final WorkDatabase A00;

            {
                this.A00 = workDatabase;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
                if (r4 == Integer.MAX_VALUE) goto L11;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public int A00(int r9, int r10) {
                /*
                    r8 = this;
                    java.lang.Class<X.0rV> r7 = X.C17070rV.class
                    monitor-enter(r7)
                    java.lang.String r5 = "next_job_scheduler_id"
                    androidx.work.impl.WorkDatabase r6 = r8.A00     // Catch: java.lang.Throwable -> L58
                    r6.A03()     // Catch: java.lang.Throwable -> L58
                    X.0rG r0 = r6.A07()     // Catch: java.lang.Throwable -> L53
                    X.1Vt r0 = (X.C29181Vt) r0     // Catch: java.lang.Throwable -> L58
                    java.lang.Long r0 = r0.A00(r5)     // Catch: java.lang.Throwable -> L53
                    r1 = 0
                    if (r0 == 0) goto L33
                    int r4 = r0.intValue()     // Catch: java.lang.Throwable -> L53
                    r0 = 2147483647(0x7fffffff, float:NaN)
                    if (r4 != r0) goto L34
                L20:
                    X.0rG r3 = r6.A07()     // Catch: java.lang.Throwable -> L53
                    long r1 = (long) r1     // Catch: java.lang.Throwable -> L53
                    X.0rF r0 = new X.0rF     // Catch: java.lang.Throwable -> L53
                    r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L53
                    X.1Vt r3 = (X.C29181Vt) r3     // Catch: java.lang.Throwable -> L53
                    r3.A01(r0)     // Catch: java.lang.Throwable -> L53
                    r6.A05()     // Catch: java.lang.Throwable -> L53
                    goto L37
                L33:
                    r4 = 0
                L34:
                    int r1 = r4 + 1
                    goto L20
                L37:
                    r6.A04()     // Catch: java.lang.Throwable -> L58
                    if (r4 < r9) goto L40
                    if (r4 > r10) goto L40
                    r9 = r4
                    goto L51
                L40:
                    int r0 = r9 + 1
                    X.0rG r3 = r6.A07()     // Catch: java.lang.Throwable -> L58
                    long r1 = (long) r0     // Catch: java.lang.Throwable -> L58
                    X.0rF r0 = new X.0rF     // Catch: java.lang.Throwable -> L58
                    r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L58
                    X.1Vt r3 = (X.C29181Vt) r3     // Catch: java.lang.Throwable -> L58
                    r3.A01(r0)     // Catch: java.lang.Throwable -> L58
                L51:
                    monitor-exit(r7)     // Catch: java.lang.Throwable -> L58
                    return r9
                L53:
                    r0 = move-exception
                    r6.A04()     // Catch: java.lang.Throwable -> L58
                    throw r0     // Catch: java.lang.Throwable -> L58
                L58:
                    r0 = move-exception
                    monitor-exit(r7)     // Catch: java.lang.Throwable -> L58
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C17070rV.A00(int, int):int");
            }
        };
        for (C0OL c0ol : workSpecs) {
            workDatabase.A03();
            try {
                C0OL A02 = ((C1W8) workDatabase.A0B()).A02(c0ol.A0D);
                if (A02 == null) {
                    AbstractC16430qO A003 = AbstractC16430qO.A00();
                    String str = A04;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Skipping scheduling ");
                    sb.append(c0ol.A0D);
                    sb.append(" because it's no longer in the DB");
                    A003.A05(str, sb.toString(), new Throwable[0]);
                    workDatabase.A05();
                } else if (A02.A0C != C07M.ENQUEUED) {
                    AbstractC16430qO A004 = AbstractC16430qO.A00();
                    String str2 = A04;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Skipping scheduling ");
                    sb2.append(c0ol.A0D);
                    sb2.append(" because it is no longer enqueued");
                    A004.A05(str2, sb2.toString(), new Throwable[0]);
                    workDatabase.A05();
                } else {
                    C16940rH A005 = ((C29201Vv) workDatabase.A08()).A00(c0ol.A0D);
                    if (A005 != null) {
                        A00 = A005.A00;
                    } else {
                        C01e c01e = c0op.A02;
                        A00 = r6.A00(c01e.A03, c01e.A01);
                        ((C29201Vv) c0op.A04.A08()).A01(new C16940rH(c0ol.A0D, A00));
                    }
                    A05(c0ol, A00);
                    if (Build.VERSION.SDK_INT == 23 && (A01 = A01(this.A01, this.A00, c0ol.A0D)) != null) {
                        int indexOf = A01.indexOf(Integer.valueOf(A00));
                        if (indexOf >= 0) {
                            A01.remove(indexOf);
                        }
                        if (!A01.isEmpty()) {
                            A002 = ((Integer) A01.get(0)).intValue();
                        } else {
                            C01e c01e2 = c0op.A02;
                            A002 = r6.A00(c01e2.A03, c01e2.A01);
                        }
                        A05(c0ol, A002);
                    }
                    workDatabase.A05();
                }
                workDatabase.A04();
            } catch (Throwable th) {
                workDatabase.A04();
                throw th;
            }
        }
    }
}
