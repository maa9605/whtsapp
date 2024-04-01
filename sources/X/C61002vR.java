package X;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;
import android.util.Log;
import java.io.FileDescriptor;
import java.util.WeakHashMap;

/* renamed from: X.2vR  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C61002vR {
    public static C61002vR A01;
    public final WeakHashMap A00 = new WeakHashMap();

    public static synchronized C61002vR A00() {
        C61002vR c61002vR;
        synchronized (C61002vR.class) {
            c61002vR = A01;
            if (c61002vR == null) {
                c61002vR = new C61002vR();
                A01 = c61002vR;
            }
        }
        return c61002vR;
    }

    public Bitmap A01(ContentResolver contentResolver, long j, int i, BitmapFactory.Options options) {
        Thread currentThread = Thread.currentThread();
        C60992vQ A03 = A03(currentThread);
        if (!A04(currentThread)) {
            StringBuilder sb = new StringBuilder("Thread ");
            sb.append(currentThread);
            sb.append(" is not allowed to decode.");
            Log.d("BitmapManager", sb.toString());
            return null;
        }
        try {
            synchronized (A03) {
                A03.A02 = true;
            }
            Bitmap thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, j, currentThread.getId(), i, options);
            synchronized (A03) {
                A03.A02 = false;
                A03.notifyAll();
            }
            return thumbnail;
        } catch (Throwable th) {
            synchronized (A03) {
                A03.A02 = false;
                A03.notifyAll();
                throw th;
            }
        }
    }

    public Bitmap A02(FileDescriptor fileDescriptor, BitmapFactory.Options options) {
        if (options.mCancel) {
            return null;
        }
        Thread currentThread = Thread.currentThread();
        if (!A04(currentThread)) {
            StringBuilder sb = new StringBuilder("Thread ");
            sb.append(currentThread);
            sb.append(" is not allowed to decode.");
            Log.d("BitmapManager", sb.toString());
            return null;
        }
        synchronized (this) {
            A03(currentThread).A01 = options;
        }
        Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        synchronized (this) {
            ((C60992vQ) this.A00.get(currentThread)).A01 = null;
        }
        return decodeFileDescriptor;
    }

    public final synchronized C60992vQ A03(Thread thread) {
        C60992vQ c60992vQ;
        WeakHashMap weakHashMap = this.A00;
        c60992vQ = (C60992vQ) weakHashMap.get(thread);
        if (c60992vQ == null) {
            c60992vQ = new C60992vQ(null);
            weakHashMap.put(thread, c60992vQ);
        }
        return c60992vQ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r1 != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean A04(java.lang.Thread r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.WeakHashMap r0 = r2.A00     // Catch: java.lang.Throwable -> L13
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L13
            X.2vQ r0 = (X.C60992vQ) r0     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L10
            int r1 = r0.A00     // Catch: java.lang.Throwable -> L13
            r0 = 0
            if (r1 == 0) goto L11
        L10:
            r0 = 1
        L11:
            monitor-exit(r2)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61002vR.A04(java.lang.Thread):boolean");
    }
}
