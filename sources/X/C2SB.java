package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.2SB  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2SB extends Handler implements C2SC {
    public final /* synthetic */ C27F A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2SB(C27F c27f) {
        super(c27f.getLooper());
        this.A00 = c27f;
    }

    public void A00(String str) {
        C010205d c010205d = this.A00.A0i;
        if (c010205d == null) {
            throw null;
        }
        if (str != null) {
            synchronized (c010205d.A08) {
                c010205d.A06.obtainMessage(5, str).sendToTarget();
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            Log.i("xmpp/connection/recv/sending_channel_ready");
            C27F c27f = this.A00;
            c27f.A04 = (C2S9) message.obj;
            ((Handler) c27f.A0Y).obtainMessage(0, new C2SF(c27f)).sendToTarget();
        } else if (i == 1) {
            C27F c27f2 = this.A00;
            if (message.obj != c27f2.A06) {
                return;
            }
            c27f2.A03(true);
        } else if (i == 2) {
            C27F c27f3 = this.A00;
            Object obj = message.obj;
            if (c27f3 != null) {
                C2S8 c2s8 = c27f3.A03;
                if (c2s8 != null) {
                    c2s8.sendMessageDelayed(c2s8.obtainMessage(1, obj), 45000L);
                    return;
                }
                throw null;
            }
            throw null;
        }
    }
}
