package X;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: X.0Qs  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC05910Qs {
    public static Timer A03 = new Timer();
    public boolean A00 = false;
    public boolean A01;
    public final C1L4 A02;

    public abstract void A00();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.TimerTask, X.1L4] */
    public AbstractC05910Qs() {
        ?? r1 = new TimerTask(this) { // from class: X.1L4
            public AbstractC05910Qs A00;

            {
                this.A00 = this;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                AbstractC05910Qs abstractC05910Qs = this.A00;
                if (abstractC05910Qs.A00) {
                    return;
                }
                abstractC05910Qs.A00();
            }
        };
        this.A02 = r1;
        A03.schedule((TimerTask) r1, 20000L);
    }
}
