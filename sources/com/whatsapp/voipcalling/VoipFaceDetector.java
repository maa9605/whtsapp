package com.whatsapp.voipcalling;

import X.AbstractC237617z;
import X.C000700j;
import X.C19H;
import X.C32101dS;
import X.C32141dW;
import android.content.Context;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public final class VoipFaceDetector {
    public static final String TAG = "voip/video/VoipFaceDetector/";
    public final boolean detectBounds;
    public final C19H detector;
    public final int maxDetections;
    public volatile int nextFrameId;
    public volatile boolean released;

    public VoipFaceDetector(C19H c19h, int i, boolean z) {
        this.detector = c19h;
        this.maxDetections = i;
        this.detectBounds = z;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1dV] */
    public static VoipFaceDetector create(Context context, int i, boolean z) {
        C000700j.A06(i > 0);
        final Context applicationContext = context.getApplicationContext();
        final C32141dW c32141dW = new C32141dW();
        c32141dW.A01 = 0;
        c32141dW.A02 = 0;
        c32141dW.A03 = 0;
        c32141dW.A04 = true;
        c32141dW.A05 = true;
        c32141dW.A00 = -1.0f;
        return new VoipFaceDetector(new C32101dS(new AbstractC237617z(applicationContext, c32141dW) { // from class: X.1dV
            public final C32141dW A00;

            {
                this.A00 = c32141dW;
                A00();
            }

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
                if (r2 == null) goto L15;
             */
            @Override // X.AbstractC237617z
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object A01(X.C16F r6, android.content.Context r7) {
                /*
                    r5 = this;
                    java.lang.String r4 = "com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"
                    r3 = 0
                    if (r6 == 0) goto L54
                    android.content.Context r0 = r6.A00     // Catch: java.lang.IllegalAccessException -> L37 java.lang.ClassNotFoundException -> L39 java.lang.InstantiationException -> L3b
                    java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.IllegalAccessException -> L37 java.lang.ClassNotFoundException -> L39 java.lang.InstantiationException -> L3b
                    java.lang.Class r0 = r0.loadClass(r4)     // Catch: java.lang.IllegalAccessException -> L37 java.lang.ClassNotFoundException -> L39 java.lang.InstantiationException -> L3b
                    java.lang.Object r1 = r0.newInstance()     // Catch: java.lang.IllegalAccessException -> L37 java.lang.ClassNotFoundException -> L39 java.lang.InstantiationException -> L3b
                    android.os.IBinder r1 = (android.os.IBinder) r1     // Catch: java.lang.IllegalAccessException -> L37 java.lang.ClassNotFoundException -> L39 java.lang.InstantiationException -> L3b
                    if (r1 == 0) goto L25
                    java.lang.String r0 = "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator"
                    android.os.IInterface r2 = r1.queryLocalInterface(r0)
                    boolean r0 = r2 instanceof X.C19P
                    if (r0 == 0) goto L26
                    X.19P r2 = (X.C19P) r2
                    if (r2 != 0) goto L2b
                L25:
                    return r3
                L26:
                    X.1dY r2 = new X.1dY
                    r2.<init>(r1)
                L2b:
                    X.0Rw r1 = new X.0Rw
                    r1.<init>(r7)
                    X.1dW r0 = r5.A00
                    X.19O r0 = r2.AWl(r1, r0)
                    return r0
                L37:
                    r3 = move-exception
                    goto L3c
                L39:
                    r3 = move-exception
                    goto L3c
                L3b:
                    r3 = move-exception
                L3c:
                    java.lang.String r2 = "Failed to instantiate module class: "
                    int r0 = r4.length()
                    if (r0 == 0) goto L4e
                    java.lang.String r1 = r2.concat(r4)
                L48:
                    X.16A r0 = new X.16A
                    r0.<init>(r1, r3)
                    throw r0
                L4e:
                    java.lang.String r1 = new java.lang.String
                    r1.<init>(r2)
                    goto L48
                L54:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C32131dV.A01(X.16F, android.content.Context):java.lang.Object");
            }
        }), i, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r16 <= 0) goto L79;
     */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.3dj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized X.C74723dj detect(java.nio.ByteBuffer r14, int r15, int r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipFaceDetector.detect(java.nio.ByteBuffer, int, int, int, int):X.3dj");
    }

    public synchronized boolean isOperational() {
        boolean z;
        z = false;
        if (!this.released) {
            if (((C32101dS) this.detector).A01.A00() != null) {
                z = true;
            }
        }
        return z;
    }

    public synchronized void release() {
        if (!this.released) {
            Log.i("voip/video/VoipFaceDetector/Releasing face detector");
            this.released = true;
            this.detector.A01();
        }
    }
}
