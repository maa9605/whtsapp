package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;

/* renamed from: X.12y  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C225712y extends Surface {
    public static int A02;
    public static boolean A03;
    public boolean A00;
    public final HandlerThreadC225612x A01;

    public C225712y(HandlerThreadC225612x handlerThreadC225612x, SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
        this.A01 = handlerThreadC225612x;
    }

    public static int A00(Context context) {
        String eglQueryString;
        int i = C08M.A00;
        if (i >= 26 || !("samsung".equals(C08M.A03) || "XT1650".equals(C08M.A04))) {
            if ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                return eglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
            }
            return 0;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (A02(r6) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C225712y A01(android.content.Context r6, boolean r7) {
        /*
            int r1 = X.C08M.A00
            r0 = 17
            if (r1 < r0) goto L70
            r5 = 0
            r4 = 1
            if (r7 == 0) goto L11
            boolean r1 = A02(r6)
            r0 = 0
            if (r1 == 0) goto L12
        L11:
            r0 = 1
        L12:
            X.C002701i.A1K(r0)
            X.12x r3 = new X.12x
            r3.<init>()
            if (r7 == 0) goto L35
            int r2 = X.C225712y.A02
        L1e:
            r3.start()
            android.os.Looper r0 = r3.getLooper()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0, r3)
            r3.A00 = r1
            X.12W r0 = new X.12W
            r0.<init>(r1)
            r3.A01 = r0
            monitor-enter(r3)
            goto L37
        L35:
            r2 = 0
            goto L1e
        L37:
            android.os.Handler r0 = r3.A00     // Catch: java.lang.Throwable -> L6d
            android.os.Message r0 = r0.obtainMessage(r4, r2, r5)     // Catch: java.lang.Throwable -> L6d
            r0.sendToTarget()     // Catch: java.lang.Throwable -> L6d
        L40:
            X.12y r0 = r3.A02     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L52
            java.lang.RuntimeException r0 = r3.A04     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L52
            java.lang.Error r0 = r3.A03     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L52
            r3.wait()     // Catch: java.lang.InterruptedException -> L50 java.lang.Throwable -> L6d
            goto L40
        L50:
            r5 = 1
            goto L40
        L52:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6d
            if (r5 == 0) goto L5c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L5c:
            java.lang.RuntimeException r0 = r3.A04
            if (r0 != 0) goto L6c
            java.lang.Error r0 = r3.A03
            if (r0 != 0) goto L6b
            X.12y r0 = r3.A02
            if (r0 == 0) goto L69
            return r0
        L69:
            r0 = 0
            throw r0
        L6b:
            throw r0
        L6c:
            throw r0
        L6d:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6d
            throw r0
        L70:
            java.lang.String r1 = "Unsupported prior to API level 17"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C225712y.A01(android.content.Context, boolean):X.12y");
    }

    public static synchronized boolean A02(Context context) {
        boolean z;
        synchronized (C225712y.class) {
            if (!A03) {
                A02 = C08M.A00 < 24 ? 0 : A00(context);
                A03 = true;
            }
            z = A02 != 0;
        }
        return z;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        HandlerThreadC225612x handlerThreadC225612x = this.A01;
        synchronized (handlerThreadC225612x) {
            if (!this.A00) {
                Handler handler = handlerThreadC225612x.A00;
                if (handler != null) {
                    handler.sendEmptyMessage(2);
                    this.A00 = true;
                } else {
                    throw null;
                }
            }
        }
    }
}
