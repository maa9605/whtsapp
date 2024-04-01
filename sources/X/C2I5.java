package X;

import android.content.Context;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.requirements.Requirement;

/* renamed from: X.2I5  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2I5 {
    public void A00(Context context, Job job) {
        if (job instanceof C0I7) {
            ((C0I7) job).ASu(context);
        }
        for (Requirement requirement : job.parameters.requirements) {
            if (requirement instanceof C0I7) {
                ((C0I7) requirement).ASu(context);
            }
        }
    }
}
