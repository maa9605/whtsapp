package java.lang;

import X.C52132a7;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;

/* loaded from: classes2.dex */
public class RunnableEBaseShape2S0100000_I0_2 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableEBaseShape2S0100000_I0_2(C52132a7 c52132a7) {
        this.A01 = 48;
        this.A00 = c52132a7;
    }

    public RunnableEBaseShape2S0100000_I0_2(MessageDetailsActivity messageDetailsActivity, int i) {
        this.A01 = i;
        switch (i) {
            case 4:
            case 5:
                this.A00 = messageDetailsActivity;
                return;
            default:
                this.A00 = messageDetailsActivity;
                return;
        }
    }

    public RunnableEBaseShape2S0100000_I0_2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:449:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:759:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: java.lang.RunnableEBaseShape2S0100000_I0_2.run():void");
    }
}
