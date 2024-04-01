package X;

import android.os.ConditionVariable;
import java.util.LinkedList;
import java.util.ListIterator;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.25r  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C462225r extends Thread {
    public final ConditionVariable A00;
    public final /* synthetic */ C462125q A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C462225r(C462125q c462125q) {
        super("ReadyJobsProducer");
        this.A01 = c462125q;
        this.A00 = new ConditionVariable(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Job job;
        boolean z;
        while (true) {
            ConditionVariable conditionVariable = this.A00;
            conditionVariable.block();
            conditionVariable.close();
            C462125q c462125q = this.A01;
            synchronized (c462125q) {
                LinkedList linkedList = c462125q.A01;
                job = null;
                z = false;
                if (!linkedList.isEmpty()) {
                    ListIterator listIterator = linkedList.listIterator();
                    while (true) {
                        if (!listIterator.hasNext()) {
                            break;
                        }
                        Job job2 = (Job) listIterator.next();
                        String str = job2.parameters.groupId;
                        if (str == null || !c462125q.A03.contains(str)) {
                            if (job2.A05()) {
                                listIterator.remove();
                                String str2 = job2.parameters.groupId;
                                if (str2 != null) {
                                    c462125q.A03.add(str2);
                                    int A00 = c462125q.A00(str2);
                                    if (A00 != 0) {
                                        if (A00 == 1) {
                                            c462125q.A02.remove(str2);
                                        } else {
                                            c462125q.A02.put(str2, Integer.valueOf(A00 - 1));
                                        }
                                    }
                                }
                                if (!c462125q.A04.offer(job2)) {
                                    z = listIterator.hasNext();
                                    job = job2;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
            if (job != null) {
                if (z) {
                    conditionVariable.open();
                }
                try {
                    c462125q.A04.put(job);
                } catch (InterruptedException unused) {
                }
            }
        }
    }
}
