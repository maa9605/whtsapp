package X;

import android.os.HandlerThread;
import android.os.StrictMode;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.profilo.logger.Logger;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.0wq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20120wq {
    public static final ThreadLocal A06 = new ThreadLocal() { // from class: X.0wp
        @Override // java.lang.ThreadLocal
        public Object initialValue() {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                try {
                    FileInputStream fileInputStream = new FileInputStream("/dev/urandom");
                    try {
                        ByteBuffer allocate = ByteBuffer.allocate(8);
                        fileInputStream.read(allocate.array());
                        return new Random(allocate.getLong());
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } finally {
                            try {
                                fileInputStream.close();
                            } catch (Throwable unused) {
                            }
                        }
                    }
                } catch (IOException e) {
                    throw new RuntimeException("Cannot read from /dev/urandom", e);
                }
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
    };
    public static volatile C20120wq A07;
    public HandlerC20130wr A00;
    public final SparseArray A01;
    public final C1YO A02;
    public final AtomicReference A04;
    public final AtomicReferenceArray A05 = new AtomicReferenceArray(2);
    public final AtomicInteger A03 = new AtomicInteger(0);

    public C20120wq(SparseArray sparseArray, C1YM c1ym, C1YO c1yo) {
        this.A01 = sparseArray;
        this.A04 = new AtomicReference(c1ym);
        this.A02 = c1yo;
    }

    public final C20180wy A00(int i, long j) {
        if (this.A03.get() == 0) {
            return null;
        }
        int i2 = 0;
        do {
            C20180wy c20180wy = (C20180wy) this.A05.get(i2);
            if (c20180wy != null && (c20180wy.A01 & i) != 0) {
                long j2 = c20180wy.A04;
                if (c20180wy.A08 == null && j2 == j) {
                    return c20180wy;
                }
            }
            i2++;
        } while (i2 < 2);
        return null;
    }

    public final C20180wy A01(long j) {
        if (this.A03.get() == 0) {
            return null;
        }
        int i = 0;
        do {
            C20180wy c20180wy = (C20180wy) this.A05.get(i);
            if (c20180wy != null && c20180wy.A05 == j) {
                return c20180wy;
            }
            i++;
        } while (i < 2);
        return null;
    }

    public final void A02() {
        C20140ws c20140ws;
        HandlerThread handlerThread;
        if (this.A00 == null) {
            C1YO c1yo = this.A02;
            synchronized (C20140ws.class) {
                c20140ws = C20140ws.A01;
                if (c20140ws == null) {
                    c20140ws = new C20140ws();
                    C20140ws.A01 = c20140ws;
                }
            }
            synchronized (c20140ws) {
                if (c20140ws.A00 == null) {
                    HandlerThread handlerThread2 = new HandlerThread("Prflo:TraceCtl");
                    c20140ws.A00 = handlerThread2;
                    handlerThread2.start();
                }
                handlerThread = c20140ws.A00;
            }
            this.A00 = new HandlerC20130wr(c1yo, handlerThread.getLooper());
        }
    }

    public final void A03(int i, int i2, long j, int i3) {
        C20180wy A00 = A00(i, j);
        if (A00 == null) {
            return;
        }
        A05(A00);
        StringBuilder sb = new StringBuilder("STOP PROFILO_TRACEID: ");
        sb.append(C19170uy.A00(A00.A05));
        Log.w("Profilo/TraceControl", sb.toString());
        synchronized (this) {
            A02();
            if (i2 == 0) {
                Logger.postFinishTrace(38, A00.A05);
                this.A00.A00(new C20180wy(A00, i3));
            } else if (i2 == 1) {
                Logger.postFinishTrace(61, A00.A05);
                this.A00.A01(A00);
            }
        }
    }

    public void A04(long j, int i) {
        C20180wy A01 = A01(j);
        if (A01 == null || A01.A05 != j) {
            return;
        }
        A05(A01);
        synchronized (this) {
            A02();
            this.A00.A00(new C20180wy(A01, i));
        }
    }

    public final void A05(C20180wy c20180wy) {
        AtomicInteger atomicInteger;
        int i;
        for (int i2 = 0; i2 < 2; i2++) {
            if (this.A05.compareAndSet(i2, c20180wy, null)) {
                do {
                    atomicInteger = this.A03;
                    i = atomicInteger.get();
                } while (!atomicInteger.compareAndSet(i, (1 << i2) ^ i));
                return;
            }
        }
        Log.w("Profilo/TraceControl", "Could not reset Trace Context to null");
    }
}
