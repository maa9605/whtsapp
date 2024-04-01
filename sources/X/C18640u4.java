package X;

import android.graphics.Bitmap;
import java.util.Vector;

/* renamed from: X.0u4  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C18640u4 {
    public static final Vector A02 = new Vector();
    public int A00;
    public final Object[] A01;

    public C18640u4(int i) {
        this.A01 = new Object[i];
        A02.add(this);
    }

    public synchronized Object A00() {
        int i = this.A00;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.A01;
            Object obj = objArr[i2];
            objArr[i2] = null;
            this.A00 = i2;
            return obj;
        }
        return null;
    }

    public synchronized void A01() {
        Object[] objArr = this.A01;
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj != null && (obj instanceof Bitmap)) {
                ((Bitmap) obj).recycle();
            }
            objArr[i] = null;
        }
        this.A00 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r3 >= r1.length) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
        r1[r3] = r5;
        r4.A00 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
        r1 = r4.A01;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void A02(java.lang.Object r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r1 = 0
        L2:
            int r3 = r4.A00     // Catch: java.lang.Throwable -> L1e
            r2 = 1
            if (r1 >= r3) goto L10
            java.lang.Object[] r0 = r4.A01     // Catch: java.lang.Throwable -> L1e
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L1e
            if (r0 == r5) goto L1c
            int r1 = r1 + 1
            goto L2
        L10:
            java.lang.Object[] r1 = r4.A01     // Catch: java.lang.Throwable -> L1e
            int r0 = r1.length     // Catch: java.lang.Throwable -> L1e
            if (r3 >= r0) goto L1c
            r1[r3] = r5     // Catch: java.lang.Throwable -> L1e
            int r3 = r3 + r2
            r4.A00 = r3     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r4)
            return
        L1c:
            monitor-exit(r4)
            return
        L1e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18640u4.A02(java.lang.Object):void");
    }
}
