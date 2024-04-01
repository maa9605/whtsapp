package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.150  reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass150 implements Handler.Callback {
    public final Handler A01;
    public final InterfaceC230414z A02;
    public final ArrayList A04 = new ArrayList();
    public final ArrayList A05 = new ArrayList();
    public final ArrayList A06 = new ArrayList();
    public volatile boolean A08 = false;
    public final AtomicInteger A07 = new AtomicInteger(0);
    public boolean A00 = false;
    public final Object A03 = new Object();

    public AnonymousClass150(Looper looper, InterfaceC230414z interfaceC230414z) {
        this.A02 = interfaceC230414z;
        this.A01 = new HandlerC234416q(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            InterfaceC227813z interfaceC227813z = (InterfaceC227813z) message.obj;
            synchronized (this.A03) {
                if (this.A08) {
                    InterfaceC230414z interfaceC230414z = this.A02;
                    if (interfaceC230414z.isConnected() && this.A04.contains(interfaceC227813z)) {
                        interfaceC227813z.AIu(interfaceC230414z.A91());
                    }
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", C000200d.A07(45, "Don't know how to handle message: ", i), new Exception());
        return false;
    }
}
