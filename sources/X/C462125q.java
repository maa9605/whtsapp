package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.25q */
/* loaded from: classes2.dex */
public class C462125q {
    public final C34571hj A00;
    public final Map A02;
    public final C462225r A05;
    public final Set A03 = new HashSet();
    public final LinkedList A01 = new LinkedList();
    public final SynchronousQueue A04 = new SynchronousQueue();

    public C462125q(C34571hj c34571hj) {
        C462225r c462225r = new C462225r(this);
        this.A05 = c462225r;
        this.A02 = new HashMap();
        this.A00 = c34571hj;
        c462225r.start();
    }

    public synchronized int A00(String str) {
        if (str != null) {
            Integer num = (Integer) this.A02.get(str);
            if (num != null) {
                return num.intValue();
            }
        }
        return 0;
    }

    public synchronized void A01(String str) {
        this.A03.remove(str);
        this.A05.A00.open();
    }

    public final void A02(Job job) {
        String str = job.parameters.groupId;
        if (str != null) {
            this.A02.put(str, Integer.valueOf(A00(str) + 1));
        }
    }

    public synchronized void A03(Job job) {
        this.A01.addFirst(job);
        A02(job);
        this.A05.A00.open();
    }
}
