package com.whatsapp.util.crash;

import X.C001200o;
import X.C01B;
import X.C01C;
import X.C40001rG;
import X.C40011rH;
import X.C40021rI;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class SigquitBasedANRDetector {
    public static volatile SigquitBasedANRDetector A0C;
    public HandlerThread A00;
    public String A01;
    public Pattern A02;
    public Pattern A03;
    public final C01B A04;
    public final C40001rG A05;
    public final C40011rH A06;
    public final Object A07;
    public final Object A08;
    public volatile Handler A09;
    public volatile boolean A0A;
    public volatile boolean A0B;

    public static native void init(SigquitBasedANRDetector sigquitBasedANRDetector, boolean z, int i);

    public static native boolean startDetector();

    public static native void stopDetector();

    public SigquitBasedANRDetector(C001200o c001200o, C40001rG c40001rG, C01B c01b, boolean z, int i) {
        C40011rH c40011rH = new C40011rH(c001200o.A00);
        this.A08 = new Object();
        this.A07 = new Object();
        this.A05 = c40001rG;
        this.A04 = c01b;
        this.A06 = c40011rH;
        init(this, z, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x002c, code lost:
        if (r1.startsWith("0.") != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.whatsapp.util.crash.SigquitBasedANRDetector A00() {
        /*
            com.whatsapp.util.crash.SigquitBasedANRDetector r0 = com.whatsapp.util.crash.SigquitBasedANRDetector.A0C
            if (r0 != 0) goto L3d
            java.lang.Class<com.whatsapp.util.crash.SigquitBasedANRDetector> r2 = com.whatsapp.util.crash.SigquitBasedANRDetector.class
            monitor-enter(r2)
            com.whatsapp.util.crash.SigquitBasedANRDetector r0 = com.whatsapp.util.crash.SigquitBasedANRDetector.A0C     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L38
            X.00o r4 = X.C001200o.A01     // Catch: java.lang.Throwable -> L3a
            X.1rG r5 = X.C40001rG.A00()     // Catch: java.lang.Throwable -> L3a
            X.01B r6 = X.C01B.A00()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L2e
            java.lang.String r0 = "1."
            boolean r0 = r1.startsWith(r0)     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L2e
            java.lang.String r0 = "0."
            boolean r0 = r1.startsWith(r0)     // Catch: java.lang.Throwable -> L3a
            r7 = 1
            if (r0 == 0) goto L2f
        L2e:
            r7 = 0
        L2f:
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L3a
            com.whatsapp.util.crash.SigquitBasedANRDetector r3 = new com.whatsapp.util.crash.SigquitBasedANRDetector     // Catch: java.lang.Throwable -> L3a
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3a
            com.whatsapp.util.crash.SigquitBasedANRDetector.A0C = r3     // Catch: java.lang.Throwable -> L3a
        L38:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3a
            goto L3d
        L3a:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3a
            throw r0
        L3d:
            com.whatsapp.util.crash.SigquitBasedANRDetector r0 = com.whatsapp.util.crash.SigquitBasedANRDetector.A0C
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.crash.SigquitBasedANRDetector.A00():com.whatsapp.util.crash.SigquitBasedANRDetector");
    }

    public final void A01(File file) {
        int i;
        synchronized (this.A08) {
            C40011rH c40011rH = this.A06;
            synchronized (c40011rH) {
                i = c40011rH.A00;
            }
            if (i != 0) {
                c40011rH.A00();
            }
            Log.i("SigquitBasedANRDetector/About to start process anr error monitor");
            c40011rH.A02(new C40021rI(this, file));
        }
    }

    public final void A02(String str, String str2) {
        File file;
        Log.i("SigquitBasedANRDetector/processing ANR start");
        Log.i("SigquitBasedANRDetector/persisting ANR report start");
        if (str2 != null) {
            StringBuilder sb = new StringBuilder("  | detected using Sigquit based detector\n");
            sb.append(str2);
            str = str.replace(str2, sb.toString());
        }
        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
        Exception exc = new Exception("ANR detected");
        exc.setStackTrace(stackTrace);
        Log.e("SigquitBasedANRDetector/Generating ANR Report", exc);
        try {
            file = this.A05.A02(str);
        } catch (IOException e) {
            Log.e("SigquitBasedANRDetector/Error saving ANR report", e);
            file = null;
        }
        if (this.A04.A0E(C01C.A0M)) {
            if (file != null) {
                A01(file);
            } else {
                Log.e("SigquitBasedANRDetector/couldn't write ANR to file, aborting");
                Log.i("SigquitBasedANRDetector/abortANR");
                this.A0A = false;
            }
        } else if (file != null) {
            this.A0A = false;
        }
        Log.i("SigquitBasedANRDetector/processing ANR finish");
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void anrDetected(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = android.os.Debug.isDebuggerConnected()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.String r4 = "SigquitBasedANRDetector"
            java.lang.String r0 = "On anrDetected call"
            android.util.Log.i(r4, r0)
            boolean r0 = r5.A0B
            if (r0 != 0) goto L13
            return
        L13:
            java.util.regex.Pattern r0 = r5.A02
            r3 = 8
            if (r0 != 0) goto L21
            java.lang.String r0 = "^$^\\s*(\"main\".*?$\\s*\\|\\s+group=\"main\"(?s).*?$^\\s*$)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r3)
            r5.A02 = r0
        L21:
            java.util.regex.Matcher r1 = r0.matcher(r6)
            boolean r0 = r1.find()
            r2 = 1
            if (r0 == 0) goto L55
            java.lang.String r1 = r1.group(r2)
            if (r1 == 0) goto L55
            java.lang.String r0 = "ANR detected. Main thread: "
            X.C000200d.A17(r0, r1, r4)
            java.util.regex.Pattern r0 = r5.A03
            if (r0 != 0) goto L43
            java.lang.String r0 = "^\\s*[ank#](?s).*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r3)
            r5.A03 = r0
        L43:
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r0 = r1.find()
            if (r0 == 0) goto L55
            java.lang.String r3 = r1.group()
        L51:
            java.lang.Object r1 = r5.A07
            monitor-enter(r1)
            goto L57
        L55:
            r3 = 0
            goto L51
        L57:
            boolean r0 = r5.A0A     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L6d
            if (r3 == 0) goto L6b
            java.lang.String r0 = r5.A01     // Catch: java.lang.Throwable -> L85
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L85
            if (r0 != 0) goto L6b
            java.lang.String r0 = "Detected a new ANR before the end of the previous one"
            android.util.Log.w(r4, r0)     // Catch: java.lang.Throwable -> L85
            goto L6f
        L6b:
            r2 = 0
            goto L6f
        L6d:
            r5.A0A = r2     // Catch: java.lang.Throwable -> L85
        L6f:
            r5.A01 = r3     // Catch: java.lang.Throwable -> L85
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto L84
            android.os.Handler r0 = r5.A09
            if (r0 == 0) goto L84
            android.os.Handler r2 = r5.A09
            r1 = 8
            java.lang.RunnableEBaseShape0S2100000_I0 r0 = new java.lang.RunnableEBaseShape0S2100000_I0
            r0.<init>(r5, r6, r3, r1)
            r2.post(r0)
        L84:
            return
        L85:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L85
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.crash.SigquitBasedANRDetector.anrDetected(java.lang.String):void");
    }
}
