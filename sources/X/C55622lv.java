package X;

import com.whatsapp.util.Log;
import java.util.TimerTask;

/* renamed from: X.2lv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C55622lv extends TimerTask {
    public final /* synthetic */ C638731e A00;

    public C55622lv(C638731e c638731e) {
        this.A00 = c638731e;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        StringBuilder A0P = C000200d.A0P("gdrive-activity/one-time-setup/not-finished-in-");
        C638731e c638731e = this.A00;
        A0P.append(c638731e.A07.A00() / 1000);
        A0P.append("-seconds");
        Log.i(A0P.toString());
        C018508q c018508q = c638731e.A00;
        c018508q.A02.post(new RunnableEBaseShape8S0100000_I1_0(this, 0));
    }
}
