package com.facebook.profilo.provider.stacktrace;

import com.facebook.soloader.SoLoader;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class ArtCompatibility {
    public static final AtomicReference sIsCompatible;

    public static native boolean nativeCheck(int i);

    static {
        SoLoader.A03("profilo_stacktrace");
        sIsCompatible = new AtomicReference(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
        if (r1.equals("5.0.2") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
        if (r1.equals("5.1.1") != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c0, code lost:
        if (r1.equals("6.0.1") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cf, code lost:
        if (r1.equals("7.0.0") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00de, code lost:
        if (r1.equals("7.1.0") != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isCompatible(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.ArtCompatibility.isCompatible(android.content.Context):boolean");
    }
}
