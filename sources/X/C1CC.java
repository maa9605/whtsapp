package X;

import android.content.Context;
import android.os.PowerManager;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.1CC */
/* loaded from: classes.dex */
public final class C1CC implements Runnable {
    public final long A00;
    public final PowerManager.WakeLock A01;
    public final FirebaseInstanceId A02;
    public final C02420Bg A03;

    public C1CC(FirebaseInstanceId firebaseInstanceId, C02420Bg c02420Bg, long j) {
        this.A02 = firebaseInstanceId;
        this.A03 = c02420Bg;
        this.A00 = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) A00().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.A01 = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final Context A00() {
        C08U c08u = this.A02.A02;
        c08u.A03();
        return c08u.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:230:0x0093, code lost:
        if (r1 == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:353:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:389:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 855
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1CC.run():void");
    }
}
