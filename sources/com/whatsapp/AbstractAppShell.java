package com.whatsapp;

import X.AbstractC000600i;
import X.AbstractC003201n;
import X.AbstractC004101x;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass008;
import X.C000000a;
import X.C000200d;
import X.C000300e;
import X.C000400f;
import X.C000500h;
import X.C000700j;
import X.C001700t;
import X.C001800u;
import X.C002201b;
import X.C002301c;
import X.C002401d;
import X.C002701i;
import X.C002801j;
import X.C003101m;
import X.C003301p;
import X.C003401q;
import X.C003601s;
import X.C003701t;
import X.C003801u;
import X.C003901v;
import X.C00A;
import X.C00B;
import X.C00C;
import X.C00D;
import X.C00E;
import X.C00F;
import X.C00G;
import X.C00H;
import X.C00J;
import X.C00R;
import X.C00S;
import X.C00V;
import X.C00W;
import X.C00X;
import X.C00Y;
import X.C01e;
import X.C01o;
import android.app.Application;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.AbstractAppShell;
import com.whatsapp.util.Log;
import com.whatsapp.util.crash.SigquitBasedANRDetector;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class AbstractAppShell extends Application implements AnonymousClass004 {
    public static final String COMPRESSED_LIBS_ARCHIVE_NAME = "libs.spk.zst";
    public static final AnonymousClass006 appStartStat = AnonymousClass006.A03;
    public static boolean created;
    public C003701t abProps;
    public C003401q genderUtils;
    public C002201b waResourcesWrapper;
    public C002301c whatsAppLocale;

    public static void setStrictModePolicyForAppInit() {
    }

    public void configureProductDependencies() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:339:0x0102, code lost:
        if (r7 == 3) goto L264;
     */
    /* JADX WARN: Removed duplicated region for block: B:612:0x01dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r30) {
        /*
            Method dump skipped, instructions count: 1224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AbstractAppShell.attachBaseContext(android.content.Context):void");
    }

    private void configureProduct() {
        if (AnonymousClass007.A05 == null) {
            synchronized (AnonymousClass007.class) {
                if (AnonymousClass007.A05 == null) {
                    AnonymousClass008 anonymousClass008 = AnonymousClass008.A01;
                    C00A c00a = C00A.A00;
                    C00B A00 = C00B.A00();
                    C00C A002 = C00C.A00();
                    if (C00D.A04 == null) {
                        synchronized (C00D.class) {
                            if (C00D.A04 == null) {
                                C00E A003 = C00E.A00();
                                C00F A004 = C00F.A00();
                                C00G A005 = C00G.A00();
                                if (C00H.A02 == null) {
                                    synchronized (C00H.class) {
                                        if (C00H.A02 == null) {
                                            C00H.A02 = new C00H(new C00J() { // from class: X.00I
                                                @Override // X.C00J
                                                public final Object get() {
                                                    if (C03030Dw.A03 == null) {
                                                        synchronized (C03030Dw.class) {
                                                            if (C03030Dw.A03 == null) {
                                                                C03030Dw.A03 = new C03030Dw(C001200o.A01, C0ER.A00());
                                                            }
                                                        }
                                                    }
                                                    return C03030Dw.A03;
                                                }
                                            }, new C00J() { // from class: X.00K
                                                @Override // X.C00J
                                                public final Object get() {
                                                    if (C1PN.A06 == null) {
                                                        synchronized (C1PN.class) {
                                                            if (C1PN.A06 == null) {
                                                                C001200o c001200o = C001200o.A01;
                                                                C07000Wb A006 = C07000Wb.A00();
                                                                ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);
                                                                C00G A007 = C00G.A00();
                                                                if (C1PT.A01 == null) {
                                                                    synchronized (C1PT.class) {
                                                                        if (C1PT.A01 == null) {
                                                                            C00G.A00();
                                                                            C1PT.A01 = new C1PT(c001200o);
                                                                        }
                                                                    }
                                                                }
                                                                C1PT c1pt = C1PT.A01;
                                                                C00Y c00y = C00Y.A00;
                                                                if (c00y != null) {
                                                                    C1PN.A06 = new C1PN(c001200o, A006, newFixedThreadPool, A007, c1pt, c00y);
                                                                } else {
                                                                    throw null;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return C1PN.A06;
                                                }
                                            }, new C00J() { // from class: X.00L
                                                @Override // X.C00J
                                                public final Object get() {
                                                    if (C37741mu.A01 == null) {
                                                        synchronized (C37741mu.class) {
                                                            if (C37741mu.A01 == null) {
                                                                C37741mu.A01 = new C37741mu(C0F0.A00());
                                                            }
                                                        }
                                                    }
                                                    return C37741mu.A01;
                                                }
                                            }, new C00J() { // from class: X.00M
                                                @Override // X.C00J
                                                public final Object get() {
                                                    return C00G.A00();
                                                }
                                            }, new C00J() { // from class: X.00N
                                                @Override // X.C00J
                                                public final Object get() {
                                                    if (C37761mw.A01 == null) {
                                                        synchronized (C37761mw.class) {
                                                            if (C37761mw.A01 == null) {
                                                                C37761mw.A01 = new C37761mw(C02990Ds.A00());
                                                            }
                                                        }
                                                    }
                                                    return C37761mw.A01;
                                                }
                                            }, new C00J() { // from class: X.00O
                                                @Override // X.C00J
                                                public final Object get() {
                                                    if (C02970Dp.A0A == null) {
                                                        synchronized (C02970Dp.class) {
                                                            if (C02970Dp.A0A == null) {
                                                                C02970Dp.A0A = new C02970Dp(C001200o.A01, C02980Dr.A00(), C02L.A00(), C05W.A00(), C02E.A00(), C018708s.A00(), C0CB.A00(), C02O.A00(), C0C7.A00(), C02990Ds.A00());
                                                            }
                                                        }
                                                    }
                                                    return C02970Dp.A0A;
                                                }
                                            }, new C00J() { // from class: X.00P
                                                @Override // X.C00J
                                                public final Object get() {
                                                    if (C37751mv.A05 == null) {
                                                        synchronized (C37751mv.class) {
                                                            if (C37751mv.A05 == null) {
                                                                C37751mv.A05 = new C37751mv(C02L.A00(), C05W.A00(), C018708s.A00(), C0F0.A00(), C0C7.A00());
                                                            }
                                                        }
                                                    }
                                                    return C37751mv.A05;
                                                }
                                            }, new C00J() { // from class: X.00Q
                                                @Override // X.C00J
                                                public final Object get() {
                                                    if (C37731mt.A00 == null) {
                                                        synchronized (C37731mt.class) {
                                                            if (C37731mt.A00 == null) {
                                                                C37731mt.A00 = new C37731mt();
                                                            }
                                                        }
                                                    }
                                                    return C37731mt.A00;
                                                }
                                            });
                                        }
                                    }
                                }
                                C00D.A04 = new C00D(A003, A004, A005, C00H.A02);
                            }
                        }
                    }
                    AnonymousClass007.A05 = new AnonymousClass007(anonymousClass008, c00a, A00, A002, C00D.A04);
                }
            }
        }
        AnonymousClass007 anonymousClass007 = AnonymousClass007.A05;
        C00S.A00 = new C00R(anonymousClass007.A00, anonymousClass007.A01, anonymousClass007.A02, anonymousClass007.A03, anonymousClass007.A04);
        if (C00V.A04 == null) {
            synchronized (C00V.class) {
                if (C00V.A04 == null) {
                    C00E A006 = C00E.A00();
                    C00C A007 = C00C.A00();
                    C00S c00s = C00S.A00;
                    if (c00s != null) {
                        C00V.A04 = new C00V(A006, A007, c00s, C00W.A01);
                    } else {
                        throw null;
                    }
                }
            }
        }
        C00V c00v = C00V.A04;
        C00Y.A00 = new C00X(c00v.A03, c00v.A01, c00v.A00, c00v.A02);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (C000700j.A00.booleanValue()) {
            return super.getResources();
        }
        C002201b c002201b = this.waResourcesWrapper;
        if (c002201b == null) {
            Resources resources = super.getResources();
            C002301c A00 = C002301c.A00();
            if (resources != null && A00 != null) {
                if (resources instanceof C002201b) {
                    c002201b = (C002201b) resources;
                } else {
                    c002201b = new C002201b(resources, A00);
                }
                this.waResourcesWrapper = c002201b;
            } else {
                throw new NullPointerException("Resources and/or WhatsAppLocale can't be null");
            }
        }
        return c002201b;
    }

    @Override // X.AnonymousClass004
    public C01e getWorkManagerConfiguration() {
        Log.i("work-manager/configuration/created");
        C002401d c002401d = new C002401d();
        c002401d.A03 = SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
        c002401d.A01 = Integer.MAX_VALUE;
        c002401d.A00 = 2;
        return new C01e(c002401d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0042, code lost:
        if (r1.startsWith("0.") != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void lambda$attachBaseContext$0$AbstractAppShell() {
        /*
            r11 = this;
            java.lang.Class<com.whatsapp.breakpad.BreakpadManager> r4 = com.whatsapp.breakpad.BreakpadManager.class
            monitor-enter(r4)
            java.io.File r0 = com.whatsapp.breakpad.BreakpadManager.A00     // Catch: java.lang.Throwable -> L4f
            r1 = 0
            if (r0 != 0) goto L9
            r1 = 1
        L9:
            java.lang.String r0 = "breakpad/initialized more than once"
            X.C000700j.A08(r1, r0)     // Catch: java.lang.Throwable -> L4f
            java.io.File r3 = X.C002501g.A06(r11)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = r11.getPackageCodePath()     // Catch: java.lang.Throwable -> L4f
            java.io.File r2 = r11.getFilesDir()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = "decompressed/libs.spk.zst"
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L4f
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r7 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r8 = X.C002601h.A08     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L44
            java.lang.String r0 = "1."
            boolean r0 = r1.startsWith(r0)     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L44
            java.lang.String r0 = "0."
            boolean r0 = r1.startsWith(r0)     // Catch: java.lang.Throwable -> L4f
            r9 = 1
            if (r0 == 0) goto L45
        L44:
            r9 = 0
        L45:
            r10 = 1536000(0x177000, float:2.152394E-39)
            com.whatsapp.breakpad.BreakpadManager.setUpBreakpad(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L4f
            com.whatsapp.breakpad.BreakpadManager.A00 = r3     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r4)
            return
        L4f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AbstractAppShell.lambda$attachBaseContext$0$AbstractAppShell():void");
    }

    public static void lambda$attachBaseContext$2() {
        if (C000000a.A03 == null) {
            synchronized (C000000a.class) {
                if (C000000a.A03 == null) {
                    C000000a.A03 = new C000000a(new C00J() { // from class: X.00b
                        @Override // X.C00J
                        public final Object get() {
                            return SigquitBasedANRDetector.A00();
                        }
                    });
                }
            }
        }
        C000000a c000000a = C000000a.A03;
        synchronized (c000000a) {
            if (c000000a.A00 == null) {
                SigquitBasedANRDetector sigquitBasedANRDetector = (SigquitBasedANRDetector) c000000a.A01.get();
                c000000a.A00 = sigquitBasedANRDetector;
                synchronized (sigquitBasedANRDetector.A08) {
                    if (!sigquitBasedANRDetector.A0B) {
                        HandlerThread handlerThread = new HandlerThread("SigquitBasedANRDetectorThread");
                        sigquitBasedANRDetector.A00 = handlerThread;
                        handlerThread.start();
                        sigquitBasedANRDetector.A09 = new Handler(sigquitBasedANRDetector.A00.getLooper());
                        SigquitBasedANRDetector.startDetector();
                        sigquitBasedANRDetector.A0B = true;
                    }
                }
            }
        }
    }

    public /* synthetic */ void lambda$null$3$AbstractAppShell() {
        C002701i.A1A(this);
    }

    public boolean lambda$onCreate$4$AbstractAppShell() {
        Log.i("app-init main thread idle");
        C002801j.A00().AS1(new Runnable() { // from class: X.01l
            {
                AbstractAppShell.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C002701i.A1A(AbstractAppShell.this);
            }
        });
        return false;
    }

    private void logDebugInfo() {
        StringBuilder A0P = C000200d.A0P("appshell/debug_info: pkg=");
        A0P.append(getPackageName());
        A0P.append("; v=");
        A0P.append("2.21.9.15-play-release");
        A0P.append("; vc=");
        A0P.append(210915004);
        A0P.append("; p=");
        A0P.append("consumer");
        A0P.append("; e=");
        A0P.append(180L);
        A0P.append("; g=");
        A0P.append(C000300e.A00);
        A0P.append("; t=");
        A0P.append(1620966675000L);
        A0P.append("; d=");
        A0P.append(Build.MANUFACTURER);
        A0P.append(" ");
        A0P.append(Build.MODEL);
        A0P.append("; os=Android ");
        A0P.append(Build.VERSION.RELEASE);
        A0P.append("; abis=");
        C000200d.A1N(A0P, TextUtils.join(",", Build.VERSION.SDK_INT >= 21 ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2}));
    }

    private void maybeReportDecompressionFailure(Exception exc) {
        StringBuilder A0P = C000200d.A0P("appshell/decompression-failure: available internal storage: ");
        A0P.append(C000400f.A00().A03());
        Log.i(A0P.toString());
        Log.e("AbstractAppShell/maybeReportDecompressionFailure", exc);
        C000500h A00 = C000500h.A00();
        if (A00.A0p(86400000L, "decompression_failure_reported_timestamp")) {
            AbstractC000600i.A00().A09("AbstractAppShell/maybeReportDecompressionFailure", "superpack decompression failed", true);
            A00.A0C("decompression_failure_reported_timestamp");
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C002301c c002301c = this.whatsAppLocale;
        if (c002301c != null) {
            Locale A0H = C003101m.A0H(configuration);
            if (!c002301c.A05.equals(A0H)) {
                StringBuilder A0P = C000200d.A0P("whatsapplocale/savedefaultlanguage/phone language changed to: ");
                A0P.append(AbstractC003201n.A05(A0H));
                Log.i(A0P.toString());
                c002301c.A05 = A0H;
                if (!c002301c.A06) {
                    c002301c.A04 = A0H;
                    c002301c.A0K();
                    for (C01o c01o : c002301c.A0A) {
                        c01o.ALd();
                    }
                }
            }
            this.whatsAppLocale.A0J();
            C003301p.A04();
            C003401q c003401q = this.genderUtils;
            synchronized (c003401q) {
                c003401q.A00 = null;
            }
            return;
        }
        throw null;
    }

    @Override // android.app.Application
    public void onCreate() {
        Log.i("appshell/onCreate");
        super.onCreate();
        if (created) {
            Log.w("Application onCreate called after application already started");
            C000700j.A00 = Boolean.FALSE;
            return;
        }
        created = true;
        C001800u c001800u = C001700t.A00().A00;
        C003601s.A01("AppShell/onCreate");
        try {
            this.genderUtils = C003401q.A00();
            this.abProps = C003701t.A00();
            C002301c.A0D = true;
            C003801u.A06 = this.abProps.A0C(334);
            this.whatsAppLocale = C002301c.A00();
            C000500h A00 = C000500h.A00();
            C003901v.A00(this);
            C000700j.A00 = Boolean.FALSE;
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: X.01w
                {
                    AbstractAppShell.this = this;
                }

                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    return AbstractAppShell.this.lambda$onCreate$4$AbstractAppShell();
                }
            });
            C003601s.A00();
            AbstractC004101x.A00(A00.A07());
            c001800u.A03.AGI(c001800u.A01.A00, (short) 2);
            Log.i("appshell/onCreate done");
        } catch (Throwable th) {
            C003601s.A00();
            throw th;
        }
    }
}
