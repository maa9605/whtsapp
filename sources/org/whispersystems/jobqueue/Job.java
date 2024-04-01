package org.whispersystems.jobqueue;

import android.os.PowerManager;
import java.io.Serializable;
import org.whispersystems.jobqueue.requirements.Requirement;

/* loaded from: classes.dex */
public abstract class Job implements Serializable {
    public transient int A00;
    public transient long A01;
    public transient PowerManager.WakeLock A02;
    public final JobParameters parameters;

    public abstract void A02();

    public abstract void A03();

    public abstract void A04();

    public abstract boolean A06(Exception exc);

    public Job(JobParameters jobParameters) {
        this.parameters = jobParameters;
    }

    public void A00(long j) {
        this.A01 = j;
    }

    public boolean A05() {
        for (Requirement requirement : this.parameters.requirements) {
            if (!requirement.AFd()) {
                return false;
            }
        }
        return true;
    }
}
