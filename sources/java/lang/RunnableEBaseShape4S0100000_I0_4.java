package java.lang;

import android.app.Activity;
import com.whatsapp.notification.PopupNotification;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class RunnableEBaseShape4S0100000_I0_4 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableEBaseShape4S0100000_I0_4(Activity activity) {
        this.A01 = 15;
        this.A00 = new WeakReference(activity);
    }

    public RunnableEBaseShape4S0100000_I0_4(PopupNotification popupNotification, int i) {
        this.A01 = i;
        if (37 - i != 0) {
            this.A00 = popupNotification;
        } else {
            this.A00 = popupNotification;
        }
    }

    public RunnableEBaseShape4S0100000_I0_4(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:663:0x01a0, code lost:
        if (r2.A07 != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:964:0x0876, code lost:
        if (r7.getInt("account_sync_blocklist_num_retries", 0) > 0) goto L496;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: java.lang.RunnableEBaseShape4S0100000_I0_4.run():void");
    }
}
