package java.lang;

import X.C2IF;
import X.C2IH;
import com.whatsapp.storage.StorageUsageActivity;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class RunnableEBaseShape4S0200000_I0_4 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public RunnableEBaseShape4S0200000_I0_4(C2IF c2if, Object obj) {
        this.A02 = 43;
        this.A01 = c2if;
        this.A00 = new C2IH(obj);
    }

    public RunnableEBaseShape4S0200000_I0_4(StorageUsageActivity storageUsageActivity) {
        this.A02 = 35;
        this.A01 = storageUsageActivity;
        this.A00 = new AtomicBoolean(false);
    }

    public RunnableEBaseShape4S0200000_I0_4(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:1108:0x0986, code lost:
        if (r1.isChecked() != false) goto L560;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 3578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: java.lang.RunnableEBaseShape4S0200000_I0_4.run():void");
    }
}
