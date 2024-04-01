package X;

import android.content.Context;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1Cz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C24821Cz extends C1XD {
    public static Thread A04;
    public static final BlockingQueue A05 = new ArrayBlockingQueue(10);
    public static final AtomicBoolean A06 = new AtomicBoolean();
    public static volatile C18570tx A07;
    public String A00;
    public final int A01;
    public final AtomicLong A02;
    public final AtomicLong A03;

    public C24821Cz(final Context context, int i, int i2) {
        super(i, i2);
        this.A02 = new AtomicLong(0L);
        this.A03 = new AtomicLong(0L);
        if (A06.compareAndSet(false, true)) {
            C18620u2.A01(new AbstractRunnableC18610u1() { // from class: X.1Wr
                /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
                    if (r1.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) goto L133;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
                    if (android.os.Environment.isExternalStorageRemovable() == false) goto L134;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:91:0x01bf, code lost:
                    throw new java.io.IOException(X.C000200d.A0H("unexpected journal line: ", r9));
                 */
                /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
                @Override // X.AbstractRunnableC18610u1, java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 691
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C29411Wr.run():void");
                }
            });
        }
        int i3 = context.getResources().getDisplayMetrics().densityDpi;
        if (i3 > 320) {
            this.A01 = 320;
        } else if (i3 > 250) {
            this.A01 = 250;
        } else {
            this.A01 = 72;
        }
    }
}
