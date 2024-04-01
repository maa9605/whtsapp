package X;

import android.app.Application;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.service.WebClientService;
import com.whatsapp.util.Log;

/* renamed from: X.1wd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class HandlerC42971wd extends Handler {
    public long A00;
    public final /* synthetic */ C41991uq A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC42971wd(C41991uq c41991uq) {
        super(Looper.getMainLooper());
        this.A01 = c41991uq;
        this.A00 = 60000L;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        C41991uq c41991uq = this.A01;
        Application application = c41991uq.A0G.A00;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    StringBuilder A0P = C000200d.A0P("qrsession/fservice unknown message: ");
                    A0P.append(i);
                    A0P.append(" uptime:");
                    A0P.append(SystemClock.uptimeMillis());
                    Log.e(A0P.toString());
                    return;
                }
                Log.i("qrsession/fservice/delayed exec");
            }
            StringBuilder A0P2 = C000200d.A0P("qrsession/fservice/kill kill:");
            A0P2.append(hasMessages(2));
            A0P2.append(" delayed:");
            A0P2.append(hasMessages(3));
            A0P2.append(" uptime:");
            A0P2.append(SystemClock.uptimeMillis());
            Log.i(A0P2.toString());
            removeMessages(2);
            removeMessages(3);
            this.A00 = 60000L;
            c41991uq.A0J.A02(application, WebClientService.class);
            return;
        }
        StringBuilder A0P3 = C000200d.A0P("qrsession/fservice/start kill:");
        A0P3.append(hasMessages(2));
        A0P3.append(" delayed:");
        A0P3.append(hasMessages(3));
        A0P3.append(" uptime:");
        A0P3.append(SystemClock.uptimeMillis());
        Log.i(A0P3.toString());
        removeMessages(1);
        Intent intent = new Intent();
        intent.putExtra("isPortal", message.arg1 == 1);
        c41991uq.A0J.A03(application, WebClientService.class, intent);
    }
}
