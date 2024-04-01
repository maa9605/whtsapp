package com.facebook.soloader;

import X.AbstractC008203o;
import X.AbstractC008503r;
import X.C009103x;
import X.C00z;
import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class SoLoader {
    public static int A00;
    public static C009103x A01;
    public static C00z A02;
    public static boolean A03;
    public static AbstractC008203o[] A04;
    public static AbstractC008503r[] A05;
    public static final boolean A0A;
    public static volatile int A0B;
    public static final ReentrantReadWriteLock A09 = new ReentrantReadWriteLock();
    public static final HashSet A06 = new HashSet();
    public static final Map A07 = new HashMap();
    public static final Set A08 = Collections.newSetFromMap(new ConcurrentHashMap());

    /* loaded from: classes.dex */
    public class Api14Utils {
    }

    static {
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                z = true;
            }
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        A0A = z;
    }

    public static int A00() {
        ReentrantReadWriteLock reentrantReadWriteLock = A09;
        reentrantReadWriteLock.writeLock().lock();
        try {
            return (A00 & 2) != 0 ? 1 : 0;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public static void A01() {
        ReentrantReadWriteLock reentrantReadWriteLock = A09;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (A04 != null) {
                return;
            }
            throw new RuntimeException("SoLoader.init() not yet called");
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0015, code lost:
        if ((r20.getApplicationInfo().flags & 129) == 0) goto L3;
     */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.03t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(android.content.Context r20, int r21, X.C00z r22) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.A02(android.content.Context, int, X.00z):void");
    }

    public static boolean A03(String str) {
        boolean contains;
        ReentrantReadWriteLock reentrantReadWriteLock = A09;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (A04 == null) {
                if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    A01();
                } else {
                    synchronized (SoLoader.class) {
                        contains = true ^ A06.contains(str);
                        if (contains) {
                            System.loadLibrary(str);
                        }
                    }
                    return contains;
                }
            }
            reentrantReadWriteLock.readLock().unlock();
            return A04(System.mapLibraryName(str), str, 2, null);
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:299:0x01cd A[Catch: all -> 0x01f8, TRY_ENTER, TryCatch #8 {, blocks: (B:199:0x003d, B:203:0x0045, B:205:0x0047, B:208:0x006a, B:212:0x0078, B:213:0x007e, B:215:0x0082, B:282:0x018c, B:284:0x0191, B:298:0x01cc, B:303:0x01e9, B:305:0x01ef, B:306:0x01f6, B:288:0x0199, B:289:0x01bb, B:292:0x01bf, B:294:0x01c4, B:311:0x01fb, B:313:0x0207, B:314:0x020b, B:315:0x023e, B:319:0x0270, B:320:0x0277, B:322:0x0279, B:324:0x027f, B:326:0x0287, B:327:0x0294, B:328:0x0295, B:330:0x0297, B:331:0x029c, B:299:0x01cd, B:300:0x01e4, B:301:0x01e5, B:200:0x003e), top: B:349:0x003d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A04(java.lang.String r22, java.lang.String r23, int r24, android.os.StrictMode.ThreadPolicy r25) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.A04(java.lang.String, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }

    public static void init(Context context, int i) {
        A02(context, i, null);
    }
}
