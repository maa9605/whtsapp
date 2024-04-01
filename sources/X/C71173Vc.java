package X;

import android.app.Application;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build;
import com.whatsapp.schedulers.job.SchedulerExperimentJobService;
import java.util.Locale;

/* renamed from: X.3Vc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C71173Vc {
    public static volatile C71173Vc A02;
    public final C001200o A00;
    public final C41861ud A01;

    public C71173Vc(C001200o c001200o, C41861ud c41861ud) {
        this.A00 = c001200o;
        this.A01 = c41861ud;
    }

    public static C71173Vc A00() {
        if (A02 == null) {
            synchronized (C71173Vc.class) {
                if (A02 == null) {
                    A02 = new C71173Vc(C001200o.A01, C41861ud.A00());
                }
            }
        }
        return A02;
    }

    public final JobInfo A01(int i) {
        JobScheduler jobScheduler;
        if (Build.VERSION.SDK_INT >= 21 && (jobScheduler = (JobScheduler) this.A00.A00.getSystemService("jobscheduler")) != null) {
            try {
                for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                    if (jobInfo.getId() == i) {
                        return jobInfo;
                    }
                }
            } catch (Exception unused) {
            }
            return null;
        }
        return null;
    }

    public void A02() {
        C41861ud c41861ud = this.A01;
        if (c41861ud.A01() == 6 && Build.VERSION.SDK_INT >= 21) {
            Application application = this.A00.A00;
            JobScheduler jobScheduler = (JobScheduler) application.getSystemService("jobscheduler");
            if (jobScheduler == null) {
                return;
            }
            long A022 = c41861ud.A02();
            jobScheduler.schedule(new JobInfo.Builder(14, new ComponentName(application, SchedulerExperimentJobService.class)).setMinimumLatency(A022).setOverrideDeadline(A022).build());
        }
    }

    public void A03() {
        C41861ud c41861ud = this.A01;
        if (c41861ud.A01() == 5 && Build.VERSION.SDK_INT >= 21) {
            Application application = this.A00.A00;
            JobScheduler jobScheduler = (JobScheduler) application.getSystemService("jobscheduler");
            if (jobScheduler == null) {
                return;
            }
            boolean z = A01(12) != null;
            boolean z2 = A01(13) != null;
            if (z && z2) {
                return;
            }
            long A022 = c41861ud.A02();
            int i = z ? 13 : 12;
            if (jobScheduler.schedule(new JobInfo.Builder(i, new ComponentName(application, SchedulerExperimentJobService.class)).setMinimumLatency(A022).setOverrideDeadline(A022).build()) == 1) {
                String.format(Locale.US, "job_id=%d, period=%d minutes", Integer.valueOf(i), Long.valueOf((A022 / 1000) / 60));
            }
        }
    }

    public void A04() {
        C41861ud c41861ud = this.A01;
        if (c41861ud.A01() == 4 && Build.VERSION.SDK_INT >= 21) {
            Application application = this.A00.A00;
            JobScheduler jobScheduler = (JobScheduler) application.getSystemService("jobscheduler");
            if (jobScheduler == null) {
                return;
            }
            jobScheduler.schedule(new JobInfo.Builder(11, new ComponentName(application, SchedulerExperimentJobService.class)).setPeriodic(c41861ud.A02()).build());
        }
    }

    public final void A05(int i) {
        JobScheduler jobScheduler;
        if (Build.VERSION.SDK_INT >= 21 && (jobScheduler = (JobScheduler) this.A00.A00.getSystemService("jobscheduler")) != null) {
            jobScheduler.cancel(i);
        }
    }
}
