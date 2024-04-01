package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.LinkedList;

/* renamed from: X.2SJ  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2SJ extends Handler implements C2S9 {
    public final /* synthetic */ C2SA A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2SJ(C2SA c2sa) {
        super(c2sa.getLooper());
        this.A00 = c2sa;
    }

    @Override // X.C2S9
    public boolean AEU() {
        return hasMessages(2) || !this.A00.A08.isEmpty();
    }

    @Override // X.C2S9
    public void ASS(C40581sV c40581sV) {
        obtainMessage(0, c40581sV).sendToTarget();
    }

    @Override // X.C2S9
    public void ASU() {
        sendEmptyMessage(1);
    }

    @Override // X.C2S9
    public void ASc(Message message) {
        message.what = 2;
        sendMessage(message);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                this.A00.A01 = true;
                return;
            } else if (i == 2) {
                this.A00.A00(message);
                return;
            } else {
                return;
            }
        }
        Log.i("xmpp/writer/recv/connected");
        C2SA c2sa = this.A00;
        c2sa.A00 = (C40581sV) message.obj;
        c2sa.A01 = false;
        while (!c2sa.A01) {
            LinkedList linkedList = c2sa.A08;
            if (linkedList.isEmpty()) {
                return;
            }
            c2sa.A00((Message) linkedList.remove());
        }
    }
}
