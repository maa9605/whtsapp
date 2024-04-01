package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* renamed from: X.28f  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerC467828f extends Handler implements InterfaceC467728e {
    public boolean A00;
    public final /* synthetic */ C27F A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC467828f(C27F c27f) {
        super(c27f.getLooper());
        this.A01 = c27f;
    }

    public void A00(Message message) {
        message.what = 0;
        sendMessage(message);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            C27F c27f = this.A01;
            if (c27f != null) {
                int i2 = message.arg1;
                if (i2 != 4) {
                    if (i2 == 87) {
                        c27f.A03.removeMessages(2);
                    } else if (i2 == 205) {
                        C2S9 c2s9 = c27f.A04;
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("stanzaKey", (C04420Kc) message.obj);
                        c2s9.ASc(Message.obtain(null, 0, 76, 0, bundle));
                        return;
                    }
                    C010205d c010205d = c27f.A0i;
                    int i3 = c010205d.A01.get(i2, -1);
                    if (i3 >= 0 && i3 < c010205d.A09.size()) {
                        Message obtain = Message.obtain(message);
                        if (c010205d != null) {
                            obtain.what = 1;
                            obtain.arg1 = i2;
                            c010205d.A06.sendMessage(obtain);
                            return;
                        }
                        throw null;
                    }
                    InterfaceC463226i interfaceC463226i = c27f.A0Y;
                    Message obtain2 = Message.obtain(message);
                    Handler handler = (Handler) interfaceC463226i;
                    if (handler != null) {
                        obtain2.what = 5;
                        handler.sendMessage(obtain2);
                        return;
                    }
                    throw null;
                }
                c27f.A0I.A08(message.getData().getLong("timestamp") * 1000, System.currentTimeMillis());
                c27f.A04.ASc(Message.obtain(null, 0, 0, 0));
                return;
            }
            throw null;
        } else if (i == 1) {
            if (this.A00) {
                return;
            }
            C27F c27f2 = this.A01;
            C27F.A01(c27f2.A01);
            c27f2.A04(false);
        } else if (i == 2) {
            if (this.A00) {
                return;
            }
            C27F c27f3 = this.A01;
            boolean hasMessages = c27f3.A03.hasMessages(0);
            C2S7 c2s7 = c27f3.A01;
            if (hasMessages) {
                C27F.A01(c2s7);
                c27f3.A04(false);
                return;
            }
            C27F.A01(c2s7);
            c27f3.A04(true);
        } else if (i == 3) {
            message.getData().getLong("timestamp");
            ((Handler) this.A01.A0Y).obtainMessage(9).sendToTarget();
        } else if (i != 4) {
            if (i == 5) {
                C010205d c010205d2 = this.A01.A0i;
                c010205d2.A06.obtainMessage(6, message.obj).sendToTarget();
            }
        } else {
            C27F c27f4 = this.A01;
            if (c27f4 != null) {
                String string = message.getData().getString("iqId");
                C010205d c010205d3 = c27f4.A0i;
                Object obj = message.obj;
                synchronized (c010205d3.A08) {
                    if (c010205d3.A0A.containsKey(string)) {
                        Message obtainMessage = c010205d3.A06.obtainMessage(2, obj);
                        obtainMessage.getData().putString("iqId", string);
                        obtainMessage.sendToTarget();
                        return;
                    }
                    ((Handler) c27f4.A0Y).obtainMessage(8, string).sendToTarget();
                    return;
                }
            }
            throw null;
        }
    }
}
