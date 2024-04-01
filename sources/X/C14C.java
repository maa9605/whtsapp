package X;

import android.os.Looper;
import android.os.Message;

/* renamed from: X.14C  reason: invalid class name */
/* loaded from: classes.dex */
public final class C14C {
    public final C14A A00;
    public final HandlerC30551am A01;
    public volatile Object A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1am] */
    public C14C(final Looper looper, Object obj) {
        this.A01 = new HandlerC234416q(looper) { // from class: X.1am
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C07K.A1Y(message.what == 1);
                C14C c14c = C14C.this;
                C14B c14b = (C14B) message.obj;
                Object obj2 = c14c.A02;
                if (obj2 != null) {
                    try {
                        c14b.AGp(obj2);
                    } catch (RuntimeException e) {
                        throw e;
                    }
                }
            }
        };
        C07K.A1Q(obj, "Listener must not be null");
        this.A02 = obj;
        C07K.A1T("LocationListener");
        this.A00 = new C14A(obj);
    }
}
