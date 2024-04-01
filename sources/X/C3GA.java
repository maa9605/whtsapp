package X;

import com.whatsapp.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.3GA  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3GA implements Callable, InterfaceC63142zC, C0SC {
    public final C01B A00;
    public final C0EL A01;
    public final C04000Ia A02;
    public final C63132zB A03;
    public final C63162zF A04;
    public final C0L2 A05;
    public final C0IY A06;
    public final FutureTask A07 = new FutureTask(this);

    public C3GA(C0EL c0el, C01B c01b, C0IY c0iy, C04000Ia c04000Ia, C63162zF c63162zF, C0L2 c0l2, C63132zB c63132zB) {
        this.A01 = c0el;
        this.A00 = c01b;
        this.A06 = c0iy;
        this.A02 = c04000Ia;
        this.A04 = c63162zF;
        this.A05 = c0l2;
        this.A03 = c63132zB;
    }

    public final void A00() {
        if (this.A07.isCancelled()) {
            throw new CancellationException("plaindownload/cancelled");
        }
    }

    @Override // X.InterfaceC63142zC
    public C24V A7S() {
        try {
            FutureTask futureTask = this.A07;
            futureTask.run();
            return (C24V) futureTask.get();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            Log.e("plaindownload/exception ", e);
            return new C24V(new C04020Ic(13));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x01ed A[Catch: all -> 0x028a, TRY_ENTER, TryCatch #12 {all -> 0x028a, blocks: (B:7:0x0035, B:19:0x00a6, B:35:0x00d5, B:64:0x012a, B:93:0x0167, B:96:0x016b, B:97:0x0174, B:112:0x019e, B:130:0x01ed, B:131:0x020a, B:147:0x0231, B:148:0x0246), top: B:189:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0217  */
    @Override // X.C0SC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C1PV ARu(X.C05080Nf r19) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3GA.ARu(X.0Nf):X.1PV");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3GA.call():java.lang.Object");
    }

    @Override // X.InterfaceC63142zC
    public void cancel() {
        this.A07.cancel(true);
    }
}
