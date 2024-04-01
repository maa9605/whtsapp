package X;

import android.app.ActivityManager;
import android.os.DeadObjectException;
import android.os.Process;
import com.whatsapp.util.Log;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.1rJ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40031rJ extends Thread {
    public boolean A00;
    public boolean A01;
    public final long A02;
    public final ActivityManager A03;
    public final Object A04;
    public volatile C40021rI A05;
    public final /* synthetic */ C40011rH A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40031rJ(C40011rH c40011rH, ActivityManager activityManager, C40021rI c40021rI, long j) {
        super("ProcessAnrErrorMonitorThread");
        this.A06 = c40011rH;
        this.A04 = new Object();
        this.A03 = activityManager;
        this.A05 = c40021rI;
        this.A02 = j;
        this.A00 = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        C40011rH c40011rH;
        boolean z;
        int i = 0;
        do {
            try {
                List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = this.A03.getProcessesInErrorState();
                LinkedList linkedList = new LinkedList();
                int myUid = Process.myUid();
                int myPid = Process.myPid();
                if (processesInErrorState != null) {
                    for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                        if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == myUid) {
                            C72743aW c72743aW = new C72743aW();
                            c72743aW.A01 = processErrorStateInfo.shortMsg;
                            c72743aW.A02 = processErrorStateInfo.tag;
                            int i2 = processErrorStateInfo.pid;
                            c72743aW.A00 = i2;
                            if (i2 == myPid) {
                                linkedList.addFirst(c72743aW);
                            } else {
                                linkedList.addLast(c72743aW);
                            }
                        }
                    }
                }
                if (this.A00) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ProcessANRErrorMonitor/Starting process monitor checks for process ");
                    sb.append(Process.myPid());
                    Log.w(sb.toString());
                    this.A00 = false;
                    this.A06.A01(0, this.A05, null, null);
                }
                if (!linkedList.isEmpty()) {
                    C72743aW c72743aW2 = (C72743aW) linkedList.getFirst();
                    if (c72743aW2.A00 == Process.myPid()) {
                        StringBuilder A0P = C000200d.A0P("ProcessANRErrorMonitor/ANR detected Short msg: ");
                        A0P.append(c72743aW2.A01);
                        A0P.append(" Tag: ");
                        C000200d.A1O(A0P, c72743aW2.A02);
                        this.A06.A01(1, this.A05, c72743aW2.A01, c72743aW2.A02);
                        return;
                    }
                }
                i++;
                c40011rH = this.A06;
                if (i >= 120) {
                    c40011rH.A01(2, this.A05, null, null);
                    Log.w("ProcessANRErrorMonitor/Stopping checks because of MAX_NUMBER_BEFORE_ERROR");
                    return;
                }
                Object obj = this.A04;
                synchronized (obj) {
                    z = this.A01;
                    if (!z) {
                        try {
                            obj.wait(500);
                        } catch (InterruptedException unused) {
                        }
                        z = this.A01;
                    }
                }
            } catch (RuntimeException e) {
                e.printStackTrace();
                if (e.getCause() instanceof DeadObjectException) {
                    this.A06.A01(4, this.A05, null, null);
                    return;
                }
                throw e;
            }
        } while (!z);
        c40011rH.A01(3, this.A05, null, null);
    }
}
