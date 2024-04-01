package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.3kE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C78613kE {
    public final /* synthetic */ InterfaceC70393Sc A00;

    public final void A00() {
        InterfaceC70393Sc interfaceC70393Sc = this.A00;
        Handler handler = new Handler(Looper.getMainLooper());
        Message obtain = Message.obtain(handler, new RunnableEBaseShape4S0100000_I0_4(interfaceC70393Sc, 47));
        obtain.setAsynchronous(true);
        handler.sendMessageAtFrontOfQueue(obtain);
    }
}
