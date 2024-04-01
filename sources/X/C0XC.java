package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.0XC  reason: invalid class name */
/* loaded from: classes.dex */
public class C0XC {
    public Handler A02;
    public HandlerThread A03;
    public final Object A06 = new Object();
    public Handler.Callback A01 = new Handler.Callback() { // from class: X.0kP
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C0XC c0xc = C0XC.this;
                synchronized (c0xc.A06) {
                    if (c0xc.A02.hasMessages(1)) {
                        return true;
                    }
                    c0xc.A03.quit();
                    c0xc.A03 = null;
                    c0xc.A02 = null;
                    return true;
                }
            } else if (i != 1) {
                return true;
            } else {
                C0XC c0xc2 = C0XC.this;
                Runnable runnable = (Runnable) message.obj;
                if (c0xc2 != null) {
                    runnable.run();
                    synchronized (c0xc2.A06) {
                        c0xc2.A02.removeMessages(0);
                        Handler handler = c0xc2.A02;
                        handler.sendMessageDelayed(handler.obtainMessage(0), c0xc2.A04);
                    }
                    return true;
                }
                throw null;
            }
        }
    };
    public final String A07 = "fonts";
    public final int A05 = 10;
    public final int A04 = SearchActionVerificationClientService.NOTIFICATION_ID;
    public int A00 = 0;

    public final void A00(Runnable runnable) {
        synchronized (this.A06) {
            if (this.A03 == null) {
                HandlerThread handlerThread = new HandlerThread("fonts", 10);
                this.A03 = handlerThread;
                handlerThread.start();
                this.A02 = new Handler(this.A03.getLooper(), this.A01);
                this.A00++;
            }
            this.A02.removeMessages(0);
            Handler handler = this.A02;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }
}
