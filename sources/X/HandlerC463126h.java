package X;

import android.app.Application;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.26h  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerC463126h extends Handler implements InterfaceC463226i {
    public final /* synthetic */ C40291rx A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC463126h(C40291rx c40291rx, Looper looper) {
        super(looper);
        this.A00 = c40291rx;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        C0Ml c0Ml;
        switch (message.what) {
            case 0:
                final C40291rx c40291rx = this.A00;
                C0KS c0ks = (C0KS) message.obj;
                if (!c40291rx.A1b) {
                    Log.i("xmpp/handleSendingChannelReady/not started");
                    return;
                }
                c40291rx.A0A = c0ks;
                C05Y c05y = c40291rx.A0y;
                C0OX c0ox = new C0OX() { // from class: X.3fs
                    @Override // X.C0OX
                    public final void ARB() {
                        C40291rx c40291rx2 = C40291rx.this;
                        c40291rx2.A04();
                        c40291rx2.A1T.A02();
                        c40291rx2.A0C(true, false, false);
                    }
                };
                c05y.A01 = c0ks;
                c05y.A00 = c0ox;
                Log.i("xmpp/connectionready");
                C22M c22m = c40291rx.A11;
                c40291rx.A01 = c22m.A9T();
                c40291rx.A0a.A00.registerReceiver(c40291rx.A0H, new IntentFilter("com.whatsapp.MessageHandler.CONNECTIVITY_RETRY_ACTION"));
                HandlerThread handlerThread = new HandlerThread("MessageHandler Connectivity Handler");
                c40291rx.A04 = handlerThread;
                handlerThread.start();
                c22m.AV1(new Handler(c40291rx.A04.getLooper()));
                c40291rx.A0C(true, false, false);
                c40291rx.A0U.A06 = true;
                C0KL c0kl = c40291rx.A09;
                if (c0kl != null) {
                    c0kl.AM9();
                }
                c40291rx.A0j.A05(c40291rx.A0W.A04());
                return;
            case 1:
                this.A00.A09.AM6();
                return;
            case 2:
                C40291rx c40291rx2 = this.A00;
                c40291rx2.A0C.set(false);
                C47182Ac c47182Ac = (C47182Ac) message.obj;
                synchronized (c40291rx2.A1X) {
                    int i = c47182Ac.type;
                    if (i != 4 && i != 6 && i != 8) {
                        c40291rx2.A09.AM8(c47182Ac);
                        c40291rx2.A0u.A00(true);
                        c40291rx2.A0x.A01(c47182Ac);
                        C010205d c010205d = c40291rx2.A15;
                        C0KS c0ks2 = c40291rx2.A0A;
                        if (c0ks2 != null && c0ks2.AEU()) {
                            r8 = true;
                        }
                        c010205d.A05(r8);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("MessageHandler/login failed with reason: ");
                    sb.append(i);
                    Log.w(sb.toString());
                    c40291rx2.A0G = true;
                    c40291rx2.A0A(c47182Ac.type == 6);
                    return;
                }
            case 3:
                C40291rx c40291rx3 = this.A00;
                c40291rx3.A0C.set(false);
                int i2 = message.arg1;
                boolean z = message.arg2 == 1;
                Application application = c40291rx3.A0a.A00;
                synchronized (c40291rx3.A1X) {
                    c40291rx3.A0u.A00(false);
                    if (!c40291rx3.A0E && Build.VERSION.SDK_INT < 29) {
                        c40291rx3.A0E = c40291rx3.A11.isConnected();
                        Log.i("xmpp/handler/handleConnected setting isNetworkUp to true");
                    }
                    c40291rx3.A00 = i2;
                    c40291rx3.A09.AM5(z);
                    MessageService.A00(application);
                    if (c40291rx3.A0G()) {
                        c40291rx3.A07();
                    }
                    c40291rx3.A1T.A02();
                    c40291rx3.A06();
                    C22J c22j = c40291rx3.A0s;
                    C0KS c0ks3 = c40291rx3.A0A;
                    c22j.A04 = c40291rx3.A0G();
                    c22j.A08.post(new RunnableEBaseShape3S0200000_I0_3(c22j, c0ks3, 12));
                    c40291rx3.A0b.A05(null, 10);
                }
                return;
            case 4:
                C40291rx.A02(this.A00, message.arg1 == 1);
                return;
            case 5:
                this.A00.A09.AMB(message);
                return;
            case 6:
                C40291rx c40291rx4 = this.A00;
                c40291rx4.A0C.set(false);
                c40291rx4.A09.AM4();
                return;
            case 7:
                C40291rx c40291rx5 = this.A00;
                c40291rx5.A0C.set(false);
                c40291rx5.A09.AMA();
                return;
            case 8:
                C010105c c010105c = this.A00.A0x;
                Object obj = message.obj;
                Map map = c010105c.A03;
                synchronized (map) {
                    c0Ml = (C0Ml) map.remove(obj);
                }
                if (c0Ml == null) {
                    return;
                }
                c0Ml.A01(null);
                return;
            case 9:
                C22J c22j2 = this.A00.A0s;
                c22j2.A08.post(new RunnableEBaseShape4S0100000_I0_4(c22j2, 31));
                return;
            default:
                return;
        }
    }
}
