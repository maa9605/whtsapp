package X;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: X.0rA  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC16870rA implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Notification A02;
    public final /* synthetic */ SystemForegroundService A03;

    public RunnableC16870rA(final SystemForegroundService this$0, final int val$notificationId, final Notification val$notification, final int val$notificationType) {
        this.A03 = this$0;
        this.A00 = val$notificationId;
        this.A02 = val$notification;
        this.A01 = val$notificationType;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.A03.startForeground(this.A00, this.A02, this.A01);
        } else {
            this.A03.startForeground(this.A00, this.A02);
        }
    }
}
