package X;

import android.os.Message;

/* renamed from: X.1uV  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41781uV implements C0EK {
    public static volatile C41781uV A02;
    public C41641uH A00;
    public final C40291rx A01;

    public C41781uV(C40291rx c40291rx, C41641uH c41641uH) {
        this.A01 = c40291rx;
        this.A00 = c41641uH;
    }

    @Override // X.C0EK
    public int[] AAP() {
        return new int[]{150, 192, 193, 197};
    }

    @Override // X.C0EK
    public boolean AEN(int i, Message message) {
        if (i != 150 && i != 197) {
            if (i == 192) {
                if ("terminate".equals(((C04990Mu) message.obj).A01.tag)) {
                    this.A01.A04();
                }
                Message obtain = Message.obtain(message);
                C41641uH c41641uH = this.A00;
                c41641uH.A00.obtainMessage(1, new C49032Ic("receive_message", null, obtain)).sendToTarget();
                return true;
            } else if (i != 193) {
                return false;
            }
        }
        Message obtain2 = Message.obtain(message);
        C41641uH c41641uH2 = this.A00;
        c41641uH2.A00.obtainMessage(1, new C49032Ic("receive_message", null, obtain2)).sendToTarget();
        return true;
    }
}
