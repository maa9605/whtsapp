package java.lang;

import X.C0I8;
import android.os.Bundle;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;

/* loaded from: classes2.dex */
public class RunnableEBaseShape5S0200000_I0_5 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public RunnableEBaseShape5S0200000_I0_5(C0I8 c0i8) {
        this.A02 = 7;
        this.A01 = c0i8;
    }

    public RunnableEBaseShape5S0200000_I0_5(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(Bundle bundle, String str, Jid jid, DeviceJid deviceJid, String str2, long j) {
        bundle.putString("id", str);
        bundle.putParcelable("jid", jid);
        bundle.putParcelable("callCreatorJid", deviceJid);
        bundle.putString("callId", str2);
        bundle.putLong("loggableStanzaId", j);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:808:0x062c, code lost:
        if (r2.A0G() == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x06c9, code lost:
        if (r9.A0B != false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:893:0x08af, code lost:
        if (r0 == 16) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:902:0x08e4, code lost:
        if (r5.participants.length <= 0) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:926:0x096c, code lost:
        if (android.text.TextUtils.isEmpty(r0.A01) != false) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:936:0x09a0, code lost:
        if (r4.equals(r5) == false) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:941:0x09ac, code lost:
        if (r4.equals(r5) != false) goto L345;
     */
    /* JADX WARN: Removed duplicated region for block: B:642:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:864:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:866:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:871:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:879:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:901:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:913:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:952:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:993:0x0abd  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 3564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: java.lang.RunnableEBaseShape5S0200000_I0_5.run():void");
    }
}
