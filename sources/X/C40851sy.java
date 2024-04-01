package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.SparseArray;
import com.facebook.animated.gif.GifImage;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1sy */
/* loaded from: classes2.dex */
public class C40851sy extends AbstractC40861sz {
    public static final C19450vS A04;
    public static final C19450vS A05;
    public static final ExecutorService A06;
    public static final AtomicBoolean A07;
    public final ParcelFileDescriptor A00;
    public final GifImage A01;
    public final C19350vI A02;
    public final C1Y0 A03;

    static {
        C19460vT c19460vT = new C19460vT();
        c19460vT.A00 = 4096;
        c19460vT.A03 = true;
        A05 = new C19450vS(c19460vT);
        C19460vT c19460vT2 = new C19460vT();
        c19460vT2.A00 = 4096;
        A04 = new C19450vS(c19460vT2);
        A06 = Executors.newSingleThreadExecutor();
        A07 = new AtomicBoolean(false);
    }

    public C40851sy(ParcelFileDescriptor parcelFileDescriptor, C1Y0 c1y0, GifImage gifImage) {
        this.A00 = parcelFileDescriptor;
        this.A03 = c1y0;
        this.A01 = gifImage;
        this.A02 = new C19350vI(new C29571Xk(new C19360vJ(), new C19310vD(gifImage), new Rect(0, 0, gifImage.getWidth(), this.A01.getHeight()), false), new C0vG() { // from class: X.3Fj
            @Override // X.C0vG
            public AbstractC19030uj A8f(int i) {
                return null;
            }

            {
                C40851sy.this = this;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C40851sy A00(android.os.ParcelFileDescriptor r5, boolean r6) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r3 = X.C40851sy.A07
            boolean r0 = r3.get()
            if (r0 != 0) goto L33
            java.util.concurrent.ExecutorService r2 = X.C40851sy.A06
            boolean r0 = r2.isShutdown()
            if (r0 != 0) goto L33
            X.2yp r0 = new java.util.concurrent.Callable() { // from class: X.2yp
                static {
                    /*
                        X.2yp r0 = new X.2yp
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:X.2yp) X.2yp.A00 X.2yp
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.CallableC62952yp.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.CallableC62952yp.<init>():void");
                }

                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    /*
                        r1 = this;
                        java.lang.String r0 = "c++_shared"
                        X.C008303p.A00(r0)
                        java.lang.String r0 = "gifimage"
                        X.C008303p.A00(r0)
                        java.lang.Boolean r0 = java.lang.Boolean.TRUE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.CallableC62952yp.call():java.lang.Object");
                }
            }     // Catch: java.lang.InterruptedException -> L28 java.util.concurrent.ExecutionException -> L2a java.util.concurrent.RejectedExecutionException -> L33
            java.util.concurrent.Future r0 = r2.submit(r0)     // Catch: java.lang.InterruptedException -> L28 java.util.concurrent.ExecutionException -> L2a java.util.concurrent.RejectedExecutionException -> L33
            r1 = 0
            java.lang.Object r0 = r0.get()     // Catch: java.lang.InterruptedException -> L28 java.util.concurrent.ExecutionException -> L2a java.util.concurrent.RejectedExecutionException -> L33
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.InterruptedException -> L28 java.util.concurrent.ExecutionException -> L2a java.util.concurrent.RejectedExecutionException -> L33
            boolean r0 = r0.booleanValue()     // Catch: java.lang.InterruptedException -> L28 java.util.concurrent.ExecutionException -> L2a java.util.concurrent.RejectedExecutionException -> L33
            r3.compareAndSet(r1, r0)     // Catch: java.lang.InterruptedException -> L28 java.util.concurrent.ExecutionException -> L2a java.util.concurrent.RejectedExecutionException -> L33
            r2.shutdown()     // Catch: java.lang.InterruptedException -> L28 java.util.concurrent.ExecutionException -> L2a java.util.concurrent.RejectedExecutionException -> L33
            goto L33
        L28:
            r2 = move-exception
            goto L2b
        L2a:
            r2 = move-exception
        L2b:
            java.lang.String r1 = "Failed to initialize Fresco"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1, r2)
            throw r0
        L33:
            boolean r0 = r3.get()
            if (r0 == 0) goto L9b
            r4 = 0
            int r3 = r5.getFd()     // Catch: java.lang.IllegalArgumentException -> L7d java.lang.IllegalStateException -> L7f
            if (r6 == 0) goto L46
            X.0vS r2 = X.C40851sy.A05     // Catch: java.lang.IllegalArgumentException -> L7d java.lang.IllegalStateException -> L7f
        L42:
            java.lang.Class<com.facebook.animated.gif.GifImage> r1 = com.facebook.animated.gif.GifImage.class
            monitor-enter(r1)     // Catch: java.lang.IllegalArgumentException -> L7d java.lang.IllegalStateException -> L7f
            goto L49
        L46:
            X.0vS r2 = X.C40851sy.A04     // Catch: java.lang.IllegalArgumentException -> L7d java.lang.IllegalStateException -> L7f
            goto L42
        L49:
            boolean r0 = com.facebook.animated.gif.GifImage.sInitialized     // Catch: java.lang.Throwable -> L7a
            if (r0 != 0) goto L5a
            r0 = 1
            com.facebook.animated.gif.GifImage.sInitialized = r0     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = "c++_shared"
            X.C008303p.A00(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = "gifimage"
            X.C008303p.A00(r0)     // Catch: java.lang.Throwable -> L7a
        L5a:
            monitor-exit(r1)     // Catch: java.lang.IllegalArgumentException -> L7d java.lang.IllegalStateException -> L7f
            int r1 = r2.A00     // Catch: java.lang.IllegalArgumentException -> L7d java.lang.IllegalStateException -> L7f
            boolean r0 = r2.A03     // Catch: java.lang.IllegalArgumentException -> L7d java.lang.IllegalStateException -> L7f
            com.facebook.animated.gif.GifImage r3 = com.facebook.animated.gif.GifImage.nativeCreateFromFileDescriptor(r3, r1, r0)     // Catch: java.lang.IllegalArgumentException -> L7d java.lang.IllegalStateException -> L7f
            X.0vD r0 = new X.0vD     // Catch: java.lang.IllegalArgumentException -> L75 java.lang.IllegalStateException -> L77
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L75 java.lang.IllegalStateException -> L77
            X.1Y0 r2 = new X.1Y0     // Catch: java.lang.IllegalArgumentException -> L75 java.lang.IllegalStateException -> L77
            r2.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L75 java.lang.IllegalStateException -> L77
            X.1sy r0 = new X.1sy     // Catch: java.lang.IllegalArgumentException -> L73 java.lang.IllegalStateException -> L82
            r0.<init>(r5, r2, r3)     // Catch: java.lang.IllegalArgumentException -> L73 java.lang.IllegalStateException -> L82
            return r0
        L73:
            r1 = move-exception
            goto L83
        L75:
            r1 = move-exception
            goto L78
        L77:
            r1 = move-exception
        L78:
            r2 = r4
            goto L83
        L7a:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.IllegalArgumentException -> L7d java.lang.IllegalStateException -> L7f
            throw r0     // Catch: java.lang.IllegalArgumentException -> L7d java.lang.IllegalStateException -> L7f
        L7d:
            r1 = move-exception
            goto L80
        L7f:
            r1 = move-exception
        L80:
            r2 = r4
            goto L88
        L82:
            r1 = move-exception
        L83:
            if (r3 == 0) goto L88
            r3.dispose()
        L88:
            X.AnonymousClass024.A0R(r2)
            if (r5 == 0) goto L95
            r5.close()     // Catch: java.lang.Throwable -> L91
            goto L95
        L91:
            r0 = move-exception
            com.whatsapp.util.Log.e(r0)
        L95:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L9b:
            java.lang.String r1 = "Fresco failed to initialize"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40851sy.A00(android.os.ParcelFileDescriptor, boolean):X.1sy");
    }

    public static C40851sy A01(File file, boolean z) {
        return A00(ParcelFileDescriptor.open(file, 268435456), z);
    }

    public static C42661w7 A02(ParcelFileDescriptor parcelFileDescriptor) {
        C40851sy A00 = A00(parcelFileDescriptor, true);
        try {
            GifImage gifImage = A00.A01;
            return new C42661w7(gifImage.getWidth(), gifImage.getHeight(), gifImage.isAnimated());
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A00.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static C42661w7 A03(File file) {
        ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
        try {
            C42661w7 A02 = A02(open);
            if (open != null) {
                open.close();
            }
            return A02;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (open != null) {
                    try {
                        open.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }

    public C19230v5 A0A(Context context) {
        boolean z;
        C29561Xj c29561Xj;
        C19310vD c19310vD;
        C0v1 c0v1;
        C29501Xa c29501Xa;
        AbstractC19380vL abstractC19380vL;
        C1YB c1yb;
        synchronized (C19530va.class) {
            z = C19530va.A06 != null;
        }
        C29511Xb c29511Xb = null;
        if (!z) {
            C19490vW c19490vW = new C19490vW(context.getApplicationContext());
            c19490vW.A02 = 1;
            C19500vX c19500vX = new C19500vX(c19490vW);
            synchronized (C19530va.class) {
                if (C19530va.A06 != null) {
                    C18960uc.A00.A00(5, C19530va.class.getSimpleName(), "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
                }
                C19530va.A06 = new C19530va(c19500vX);
            }
            C19540vb.A00 = false;
        }
        C19530va c19530va = C19530va.A06;
        if (c19530va != null) {
            if (c19530va.A00 == null) {
                if (c19530va.A01 == null) {
                    C19760vx c19760vx = c19530va.A05.A08;
                    if (c19530va.A03 == null) {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 26) {
                            int i2 = c19760vx.A08.A03.A00;
                            c1yb = new C1YB(c19760vx.A00(), i2, new C1TK(i2)) { // from class: X.1pY
                                @Override // X.C1YB
                                public int A00(int i3, int i4, BitmapFactory.Options options) {
                                    ColorSpace colorSpace = options.outColorSpace;
                                    if (colorSpace == null || !colorSpace.isWideGamut() || options.inPreferredConfig == Bitmap.Config.RGBA_F16) {
                                        return C0w6.A00(options.inPreferredConfig) * i3 * i4;
                                    }
                                    return (i3 * i4) << 3;
                                }
                            };
                        } else if (i < 21 && C19540vb.A00) {
                            try {
                                Constructor<?> constructor = Class.forName("com.facebook.imagepipeline.platform.KitKatPurgeableDecoder").getConstructor(C19690vq.class);
                                Object[] objArr = new Object[1];
                                C19690vq c19690vq = c19760vx.A02;
                                if (c19690vq == null) {
                                    C19750vw c19750vw = c19760vx.A08;
                                    c19690vq = new C19690vq(c19750vw.A01, c19750vw.A03);
                                    c19760vx.A02 = c19690vq;
                                }
                                objArr[0] = c19690vq;
                                c1yb = (C1YB) constructor.newInstance(objArr);
                            } catch (ClassNotFoundException e) {
                                throw new RuntimeException("Wrong Native code setup, reflection failed.", e);
                            } catch (IllegalAccessException e2) {
                                throw new RuntimeException("Wrong Native code setup, reflection failed.", e2);
                            } catch (InstantiationException e3) {
                                throw new RuntimeException("Wrong Native code setup, reflection failed.", e3);
                            } catch (NoSuchMethodException e4) {
                                throw new RuntimeException("Wrong Native code setup, reflection failed.", e4);
                            } catch (InvocationTargetException e5) {
                                throw new RuntimeException("Wrong Native code setup, reflection failed.", e5);
                            }
                        } else {
                            int i3 = c19760vx.A08.A03.A00;
                            c1yb = new C1YB(c19760vx.A00(), i3, new C1TK(i3)) { // from class: X.1pX
                                @Override // X.C1YB
                                public int A00(int i4, int i5, BitmapFactory.Options options) {
                                    return C0w6.A00(options.inPreferredConfig) * i4 * i5;
                                }
                            };
                        }
                        c19530va.A03 = c1yb;
                    }
                    C1YB c1yb2 = c19530va.A03;
                    C19470vU c19470vU = c19530va.A04;
                    if (Build.VERSION.SDK_INT >= 21) {
                        abstractC19380vL = new AbstractC19380vL(c19760vx.A00(), c19470vU) { // from class: X.1Xn
                            public final C19470vU A00;
                            public final InterfaceC39071pW A01;

                            {
                                this.A01 = r1;
                                this.A00 = c19470vU;
                            }

                            @Override // X.AbstractC19380vL
                            public AbstractC19030uj A00(int i4, int i5, Bitmap.Config config) {
                                int i6 = i4 * i5;
                                InterfaceC39071pW interfaceC39071pW = this.A01;
                                Bitmap bitmap = (Bitmap) interfaceC39071pW.get(C0w6.A00(config) * i6);
                                C07K.A1X(bitmap.getAllocationByteCount() >= C0w6.A00(config) * i6);
                                bitmap.reconfigure(i4, i5, config);
                                return AbstractC19030uj.A01(bitmap, interfaceC39071pW, this.A00.A00);
                            }
                        };
                    } else {
                        abstractC19380vL = new AbstractC19380vL(new C19370vK(c19760vx.A02()), c1yb2, c19470vU) { // from class: X.1Xp
                            public boolean A00;
                            public final C19370vK A01;
                            public final C19470vU A02;
                            public final C1YB A03;

                            {
                                this.A01 = r1;
                                this.A03 = c1yb2;
                                this.A02 = c19470vU;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:116:0x0107, code lost:
                                if (0 == 0) goto L49;
                             */
                            @Override // X.AbstractC19380vL
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public X.AbstractC19030uj A00(int r9, int r10, android.graphics.Bitmap.Config r11) {
                                /*
                                    Method dump skipped, instructions count: 269
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C29621Xp.A00(int, int, android.graphics.Bitmap$Config):X.0uj");
                            }
                        };
                    }
                    c19530va.A01 = abstractC19380vL;
                }
                AbstractC19380vL abstractC19380vL2 = c19530va.A01;
                C19500vX c19500vX2 = c19530va.A05;
                InterfaceC19480vV interfaceC19480vV = c19500vX2.A05;
                C29661Xv c29661Xv = c19530va.A02;
                if (c29661Xv == null) {
                    c29661Xv = new C29661Xv(new InterfaceC19440vR() { // from class: X.1Xr
                        @Override // X.InterfaceC19440vR
                        public int ADB(Object obj) {
                            return ((AbstractC19590vg) obj).A00();
                        }
                    }, c19500vX2.A02);
                    c19530va.A02 = c29661Xv;
                }
                if (!C19320vE.A01) {
                    try {
                        C19320vE.A00 = (AnimatedFactoryV2Impl) Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl").getConstructor(AbstractC19380vL.class, InterfaceC19480vV.class, C29661Xv.class, Boolean.TYPE).newInstance(abstractC19380vL2, interfaceC19480vV, c29661Xv, false);
                    } catch (Throwable unused) {
                    }
                    if (C19320vE.A00 != null) {
                        C19320vE.A01 = true;
                    }
                }
                c19530va.A00 = C19320vE.A00;
            }
            AnimatedFactoryV2Impl animatedFactoryV2Impl = c19530va.A00;
            if (animatedFactoryV2Impl == null) {
                c29561Xj = null;
            } else {
                c29561Xj = animatedFactoryV2Impl.A01;
                if (c29561Xj == null) {
                    InterfaceC18950ub interfaceC18950ub = new InterfaceC18950ub() { // from class: X.1Xf
                        @Override // X.InterfaceC18950ub
                        public Object get() {
                            return 2;
                        }
                    };
                    C18890uV c18890uV = new C18890uV(animatedFactoryV2Impl.A05.A7w()) { // from class: X.1XJ
                        {
                            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
                        }

                        @Override // X.C18890uV, java.util.concurrent.Executor
                        public synchronized void execute(Runnable runnable) {
                            super.execute(runnable);
                        }
                    };
                    InterfaceC18950ub interfaceC18950ub2 = new InterfaceC18950ub() { // from class: X.1Xg
                        @Override // X.InterfaceC18950ub
                        public Object get() {
                            return 3;
                        }
                    };
                    C29551Xh c29551Xh = animatedFactoryV2Impl.A00;
                    if (c29551Xh == null) {
                        c29551Xh = new C29551Xh(animatedFactoryV2Impl);
                        animatedFactoryV2Impl.A00 = c29551Xh;
                    }
                    C1XK c1xk = C1XK.A00;
                    if (c1xk == null) {
                        c1xk = new C1XK();
                        C1XK.A00 = c1xk;
                    }
                    c29561Xj = new C29561Xj(c29551Xh, c1xk, c18890uV, RealtimeSinceBootClock.A00, animatedFactoryV2Impl.A03, animatedFactoryV2Impl.A04, interfaceC18950ub, interfaceC18950ub2);
                    animatedFactoryV2Impl.A01 = c29561Xj;
                }
            }
            if (c29561Xj != null) {
                C1Y0 c1y0 = this.A03;
                synchronized (c1y0) {
                    c19310vD = c1y0.A00;
                }
                C0JC c0jc = c19310vD.A00;
                Rect rect = new Rect(0, 0, c0jc.getWidth(), c0jc.getHeight());
                AnimatedFactoryV2Impl animatedFactoryV2Impl2 = c29561Xj.A03.A00;
                C19360vJ c19360vJ = animatedFactoryV2Impl2.A02;
                if (c19360vJ == null) {
                    c19360vJ = new C19360vJ();
                    animatedFactoryV2Impl2.A02 = c19360vJ;
                }
                C29571Xk c29571Xk = new C29571Xk(c19360vJ, c19310vD, rect, animatedFactoryV2Impl2.A06);
                int intValue = ((Number) c29561Xj.A00.get()).intValue();
                if (intValue == 1) {
                    c19310vD.hashCode();
                    c0v1 = new C0v1(new C19330vF(new InterfaceC18820uO() { // from class: X.1XW
                    }, c29561Xj.A05), true) { // from class: X.1XX
                        public AbstractC19030uj A00;
                        public final SparseArray A01 = new SparseArray();
                        public final C19330vF A02;
                        public final boolean A03;

                        {
                            this.A02 = r2;
                            this.A03 = r3;
                        }

                        public static AbstractC19030uj A00(AbstractC19030uj abstractC19030uj) {
                            C1Y1 c1y1;
                            AbstractC19030uj A00;
                            try {
                                if (AbstractC19030uj.A02(abstractC19030uj) && (abstractC19030uj.A04() instanceof C1Y1) && (c1y1 = (C1Y1) abstractC19030uj.A04()) != null) {
                                    synchronized (c1y1) {
                                        A00 = AbstractC19030uj.A00(c1y1.A00);
                                    }
                                    abstractC19030uj.close();
                                    return A00;
                                }
                                return null;
                            } finally {
                                if (abstractC19030uj != null) {
                                    abstractC19030uj.close();
                                }
                            }
                        }

                        @Override // X.C0v1
                        public synchronized boolean A6T(int i4) {
                            boolean containsKey;
                            C19330vF c19330vF = this.A02;
                            C29661Xv c29661Xv2 = c19330vF.A02;
                            C29591Xm c29591Xm = new C29591Xm(c19330vF.A00, i4);
                            synchronized (c29661Xv2) {
                                C19390vM c19390vM = c29661Xv2.A03;
                                synchronized (c19390vM) {
                                    containsKey = c19390vM.A02.containsKey(c29591Xm);
                                }
                            }
                            return containsKey;
                        }

                        @Override // X.C0v1
                        public synchronized AbstractC19030uj A8W(int i4, int i5, int i6) {
                            AbstractC19030uj abstractC19030uj;
                            InterfaceC18820uO interfaceC18820uO;
                            C19400vN c19400vN;
                            boolean z2;
                            if (this.A03) {
                                C19330vF c19330vF = this.A02;
                                do {
                                    synchronized (c19330vF) {
                                        Iterator it = c19330vF.A03.iterator();
                                        abstractC19030uj = null;
                                        if (it.hasNext()) {
                                            interfaceC18820uO = (InterfaceC18820uO) it.next();
                                            it.remove();
                                        } else {
                                            interfaceC18820uO = null;
                                        }
                                    }
                                    if (interfaceC18820uO == null) {
                                        break;
                                    }
                                    C29661Xv c29661Xv2 = c19330vF.A02;
                                    synchronized (c29661Xv2) {
                                        c19400vN = (C19400vN) c29661Xv2.A04.A02(interfaceC18820uO);
                                        if (c19400vN != null) {
                                            C19400vN c19400vN2 = (C19400vN) c29661Xv2.A03.A02(interfaceC18820uO);
                                            C07K.A1N(c19400vN2);
                                            C07K.A1Z(c19400vN2.A00 == 0);
                                            abstractC19030uj = c19400vN2.A02;
                                            z2 = true;
                                        }
                                    }
                                    if (z2) {
                                        C29661Xv.A00(c19400vN);
                                        continue;
                                    }
                                } while (abstractC19030uj == null);
                                return A00(abstractC19030uj);
                            }
                            return null;
                        }

                        @Override // X.C0v1
                        public synchronized AbstractC19030uj A8g(int i4) {
                            C19400vN c19400vN;
                            Object obj;
                            AbstractC19030uj A01;
                            C19330vF c19330vF = this.A02;
                            C29661Xv c29661Xv2 = c19330vF.A02;
                            C29591Xm c29591Xm = new C29591Xm(c19330vF.A00, i4);
                            synchronized (c29661Xv2) {
                                c19400vN = (C19400vN) c29661Xv2.A04.A02(c29591Xm);
                                C19390vM c19390vM = c29661Xv2.A03;
                                synchronized (c19390vM) {
                                    obj = c19390vM.A02.get(c29591Xm);
                                }
                                C19400vN c19400vN2 = (C19400vN) obj;
                                A01 = c19400vN2 != null ? c29661Xv2.A01(c19400vN2) : null;
                            }
                            C29661Xv.A00(c19400vN);
                            c29661Xv2.A04();
                            c29661Xv2.A03();
                            return A00(A01);
                        }

                        @Override // X.C0v1
                        public synchronized AbstractC19030uj AA6(int i4) {
                            return A00(AbstractC19030uj.A00(this.A00));
                        }

                        @Override // X.C0v1
                        public synchronized void AKe(int i4, AbstractC19030uj abstractC19030uj, int i5) {
                            AbstractC19030uj A01 = AbstractC19030uj.A01(new C1Y1(abstractC19030uj), AbstractC19030uj.A05, AbstractC19030uj.A04);
                            if (A01 == null) {
                                return;
                            }
                            AbstractC19030uj A00 = this.A02.A00(i4, A01);
                            if (AbstractC19030uj.A02(A00)) {
                                SparseArray sparseArray = this.A01;
                                AbstractC19030uj abstractC19030uj2 = (AbstractC19030uj) sparseArray.get(i4);
                                if (abstractC19030uj2 != null) {
                                    abstractC19030uj2.close();
                                }
                                sparseArray.put(i4, A00);
                            }
                            A01.close();
                        }

                        @Override // X.C0v1
                        public synchronized void AKf(int i4, AbstractC19030uj abstractC19030uj, int i5) {
                            if (abstractC19030uj != null) {
                                SparseArray sparseArray = this.A01;
                                AbstractC19030uj abstractC19030uj2 = (AbstractC19030uj) sparseArray.get(i4);
                                if (abstractC19030uj2 != null) {
                                    sparseArray.delete(i4);
                                    if (abstractC19030uj2 != null) {
                                        abstractC19030uj2.close();
                                    }
                                }
                                AbstractC19030uj A01 = AbstractC19030uj.A01(new C1Y1(abstractC19030uj), AbstractC19030uj.A05, AbstractC19030uj.A04);
                                if (A01 != null) {
                                    AbstractC19030uj abstractC19030uj3 = this.A00;
                                    if (abstractC19030uj3 != null) {
                                        abstractC19030uj3.close();
                                    }
                                    this.A00 = this.A02.A00(i4, A01);
                                    A01.close();
                                }
                            } else {
                                throw null;
                            }
                        }

                        @Override // X.C0v1
                        public synchronized void clear() {
                            AbstractC19030uj abstractC19030uj = this.A00;
                            if (abstractC19030uj != null) {
                                abstractC19030uj.close();
                            }
                            this.A00 = null;
                            int i4 = 0;
                            while (true) {
                                SparseArray sparseArray = this.A01;
                                if (i4 < sparseArray.size()) {
                                    AbstractC19030uj abstractC19030uj2 = (AbstractC19030uj) sparseArray.valueAt(i4);
                                    if (abstractC19030uj2 != null) {
                                        abstractC19030uj2.close();
                                    }
                                    i4++;
                                } else {
                                    sparseArray.clear();
                                }
                            }
                        }
                    };
                } else if (intValue == 2) {
                    c19310vD.hashCode();
                    c0v1 = new C0v1(new C19330vF(new InterfaceC18820uO() { // from class: X.1XW
                    }, c29561Xj.A05), false) { // from class: X.1XX
                        public AbstractC19030uj A00;
                        public final SparseArray A01 = new SparseArray();
                        public final C19330vF A02;
                        public final boolean A03;

                        {
                            this.A02 = r2;
                            this.A03 = r3;
                        }

                        public static AbstractC19030uj A00(AbstractC19030uj abstractC19030uj) {
                            C1Y1 c1y1;
                            AbstractC19030uj A00;
                            try {
                                if (AbstractC19030uj.A02(abstractC19030uj) && (abstractC19030uj.A04() instanceof C1Y1) && (c1y1 = (C1Y1) abstractC19030uj.A04()) != null) {
                                    synchronized (c1y1) {
                                        A00 = AbstractC19030uj.A00(c1y1.A00);
                                    }
                                    abstractC19030uj.close();
                                    return A00;
                                }
                                return null;
                            } finally {
                                if (abstractC19030uj != null) {
                                    abstractC19030uj.close();
                                }
                            }
                        }

                        @Override // X.C0v1
                        public synchronized boolean A6T(int i4) {
                            boolean containsKey;
                            C19330vF c19330vF = this.A02;
                            C29661Xv c29661Xv2 = c19330vF.A02;
                            C29591Xm c29591Xm = new C29591Xm(c19330vF.A00, i4);
                            synchronized (c29661Xv2) {
                                C19390vM c19390vM = c29661Xv2.A03;
                                synchronized (c19390vM) {
                                    containsKey = c19390vM.A02.containsKey(c29591Xm);
                                }
                            }
                            return containsKey;
                        }

                        @Override // X.C0v1
                        public synchronized AbstractC19030uj A8W(int i4, int i5, int i6) {
                            AbstractC19030uj abstractC19030uj;
                            InterfaceC18820uO interfaceC18820uO;
                            C19400vN c19400vN;
                            boolean z2;
                            if (this.A03) {
                                C19330vF c19330vF = this.A02;
                                do {
                                    synchronized (c19330vF) {
                                        Iterator it = c19330vF.A03.iterator();
                                        abstractC19030uj = null;
                                        if (it.hasNext()) {
                                            interfaceC18820uO = (InterfaceC18820uO) it.next();
                                            it.remove();
                                        } else {
                                            interfaceC18820uO = null;
                                        }
                                    }
                                    if (interfaceC18820uO == null) {
                                        break;
                                    }
                                    C29661Xv c29661Xv2 = c19330vF.A02;
                                    synchronized (c29661Xv2) {
                                        c19400vN = (C19400vN) c29661Xv2.A04.A02(interfaceC18820uO);
                                        if (c19400vN != null) {
                                            C19400vN c19400vN2 = (C19400vN) c29661Xv2.A03.A02(interfaceC18820uO);
                                            C07K.A1N(c19400vN2);
                                            C07K.A1Z(c19400vN2.A00 == 0);
                                            abstractC19030uj = c19400vN2.A02;
                                            z2 = true;
                                        }
                                    }
                                    if (z2) {
                                        C29661Xv.A00(c19400vN);
                                        continue;
                                    }
                                } while (abstractC19030uj == null);
                                return A00(abstractC19030uj);
                            }
                            return null;
                        }

                        @Override // X.C0v1
                        public synchronized AbstractC19030uj A8g(int i4) {
                            C19400vN c19400vN;
                            Object obj;
                            AbstractC19030uj A01;
                            C19330vF c19330vF = this.A02;
                            C29661Xv c29661Xv2 = c19330vF.A02;
                            C29591Xm c29591Xm = new C29591Xm(c19330vF.A00, i4);
                            synchronized (c29661Xv2) {
                                c19400vN = (C19400vN) c29661Xv2.A04.A02(c29591Xm);
                                C19390vM c19390vM = c29661Xv2.A03;
                                synchronized (c19390vM) {
                                    obj = c19390vM.A02.get(c29591Xm);
                                }
                                C19400vN c19400vN2 = (C19400vN) obj;
                                A01 = c19400vN2 != null ? c29661Xv2.A01(c19400vN2) : null;
                            }
                            C29661Xv.A00(c19400vN);
                            c29661Xv2.A04();
                            c29661Xv2.A03();
                            return A00(A01);
                        }

                        @Override // X.C0v1
                        public synchronized AbstractC19030uj AA6(int i4) {
                            return A00(AbstractC19030uj.A00(this.A00));
                        }

                        @Override // X.C0v1
                        public synchronized void AKe(int i4, AbstractC19030uj abstractC19030uj, int i5) {
                            AbstractC19030uj A01 = AbstractC19030uj.A01(new C1Y1(abstractC19030uj), AbstractC19030uj.A05, AbstractC19030uj.A04);
                            if (A01 == null) {
                                return;
                            }
                            AbstractC19030uj A00 = this.A02.A00(i4, A01);
                            if (AbstractC19030uj.A02(A00)) {
                                SparseArray sparseArray = this.A01;
                                AbstractC19030uj abstractC19030uj2 = (AbstractC19030uj) sparseArray.get(i4);
                                if (abstractC19030uj2 != null) {
                                    abstractC19030uj2.close();
                                }
                                sparseArray.put(i4, A00);
                            }
                            A01.close();
                        }

                        @Override // X.C0v1
                        public synchronized void AKf(int i4, AbstractC19030uj abstractC19030uj, int i5) {
                            if (abstractC19030uj != null) {
                                SparseArray sparseArray = this.A01;
                                AbstractC19030uj abstractC19030uj2 = (AbstractC19030uj) sparseArray.get(i4);
                                if (abstractC19030uj2 != null) {
                                    sparseArray.delete(i4);
                                    if (abstractC19030uj2 != null) {
                                        abstractC19030uj2.close();
                                    }
                                }
                                AbstractC19030uj A01 = AbstractC19030uj.A01(new C1Y1(abstractC19030uj), AbstractC19030uj.A05, AbstractC19030uj.A04);
                                if (A01 != null) {
                                    AbstractC19030uj abstractC19030uj3 = this.A00;
                                    if (abstractC19030uj3 != null) {
                                        abstractC19030uj3.close();
                                    }
                                    this.A00 = this.A02.A00(i4, A01);
                                    A01.close();
                                }
                            } else {
                                throw null;
                            }
                        }

                        @Override // X.C0v1
                        public synchronized void clear() {
                            AbstractC19030uj abstractC19030uj = this.A00;
                            if (abstractC19030uj != null) {
                                abstractC19030uj.close();
                            }
                            this.A00 = null;
                            int i4 = 0;
                            while (true) {
                                SparseArray sparseArray = this.A01;
                                if (i4 < sparseArray.size()) {
                                    AbstractC19030uj abstractC19030uj2 = (AbstractC19030uj) sparseArray.valueAt(i4);
                                    if (abstractC19030uj2 != null) {
                                        abstractC19030uj2.close();
                                    }
                                    i4++;
                                } else {
                                    sparseArray.clear();
                                }
                            }
                        }
                    };
                } else if (intValue != 3) {
                    c0v1 = new C0v1() { // from class: X.1XZ
                        @Override // X.C0v1
                        public boolean A6T(int i4) {
                            return false;
                        }

                        @Override // X.C0v1
                        public AbstractC19030uj A8W(int i4, int i5, int i6) {
                            return null;
                        }

                        @Override // X.C0v1
                        public AbstractC19030uj A8g(int i4) {
                            return null;
                        }

                        @Override // X.C0v1
                        public AbstractC19030uj AA6(int i4) {
                            return null;
                        }

                        @Override // X.C0v1
                        public void AKe(int i4, AbstractC19030uj abstractC19030uj, int i5) {
                        }

                        @Override // X.C0v1
                        public void AKf(int i4, AbstractC19030uj abstractC19030uj, int i5) {
                        }

                        @Override // X.C0v1
                        public void clear() {
                        }
                    };
                } else {
                    c0v1 = new C0v1() { // from class: X.1XY
                        public int A00 = -1;
                        public AbstractC19030uj A01;

                        @Override // X.C0v1
                        public void AKe(int i4, AbstractC19030uj abstractC19030uj, int i5) {
                        }

                        public final synchronized void A00() {
                            AbstractC19030uj abstractC19030uj = this.A01;
                            if (abstractC19030uj != null) {
                                abstractC19030uj.close();
                            }
                            this.A01 = null;
                            this.A00 = -1;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:21:0x000c, code lost:
                            if (X.AbstractC19030uj.A02(r2.A01) == false) goto L11;
                         */
                        @Override // X.C0v1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public synchronized boolean A6T(int r3) {
                            /*
                                r2 = this;
                                monitor-enter(r2)
                                int r0 = r2.A00     // Catch: java.lang.Throwable -> L11
                                if (r3 != r0) goto Le
                                X.0uj r0 = r2.A01     // Catch: java.lang.Throwable -> L11
                                boolean r1 = X.AbstractC19030uj.A02(r0)     // Catch: java.lang.Throwable -> L11
                                r0 = 1
                                if (r1 != 0) goto Lf
                            Le:
                                r0 = 0
                            Lf:
                                monitor-exit(r2)
                                return r0
                            L11:
                                r0 = move-exception
                                monitor-exit(r2)
                                throw r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1XY.A6T(int):boolean");
                        }

                        @Override // X.C0v1
                        public synchronized AbstractC19030uj A8W(int i4, int i5, int i6) {
                            AbstractC19030uj A00;
                            A00 = AbstractC19030uj.A00(this.A01);
                            A00();
                            return A00;
                        }

                        @Override // X.C0v1
                        public synchronized AbstractC19030uj A8g(int i4) {
                            if (this.A00 == i4) {
                                return AbstractC19030uj.A00(this.A01);
                            }
                            return null;
                        }

                        @Override // X.C0v1
                        public synchronized AbstractC19030uj AA6(int i4) {
                            return AbstractC19030uj.A00(this.A01);
                        }

                        @Override // X.C0v1
                        public synchronized void AKf(int i4, AbstractC19030uj abstractC19030uj, int i5) {
                            if (abstractC19030uj != null) {
                                if (this.A01 != null && ((Bitmap) abstractC19030uj.A04()).equals(this.A01.A04())) {
                                    return;
                                }
                            }
                            AbstractC19030uj abstractC19030uj2 = this.A01;
                            if (abstractC19030uj2 != null) {
                                abstractC19030uj2.close();
                            }
                            this.A01 = AbstractC19030uj.A00(abstractC19030uj);
                            this.A00 = i4;
                        }

                        @Override // X.C0v1
                        public synchronized void clear() {
                            A00();
                        }
                    };
                }
                C1Xe c1Xe = new C1Xe(c0v1, c29571Xk);
                int intValue2 = ((Number) c29561Xj.A01.get()).intValue();
                if (intValue2 > 0) {
                    c29511Xb = new C29511Xb(intValue2);
                    c29501Xa = new C29501Xa(c29561Xj.A04, c1Xe, Bitmap.Config.ARGB_8888, c29561Xj.A06);
                } else {
                    c29501Xa = null;
                }
                C39051pU c39051pU = new C39051pU(c29561Xj.A04, c0v1, new InterfaceC19190v0(c29571Xk) { // from class: X.1Xc
                    public final C29571Xk A00;

                    {
                        this.A00 = c29571Xk;
                    }

                    @Override // X.InterfaceC19190v0
                    public int AAI(int i4) {
                        return this.A00.A08[i4];
                    }

                    @Override // X.InterfaceC19190v0
                    public int getFrameCount() {
                        return this.A00.A04.getFrameCount();
                    }

                    @Override // X.InterfaceC19190v0
                    public int getLoopCount() {
                        return this.A00.A04.getLoopCount();
                    }
                }, c1Xe, c29511Xb, c29501Xa);
                return new C19230v5(new C24791Cw(c39051pU, c39051pU, c29561Xj.A02, c29561Xj.A07));
            }
            throw new IOException("Failed to create gif drawable, no drawable factory");
        }
        throw new NullPointerException("ImagePipelineFactory was not initialized!");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A01.dispose();
        AnonymousClass024.A0R(this.A03);
        ParcelFileDescriptor parcelFileDescriptor = this.A00;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (Throwable th) {
                Log.e(th);
            }
        }
    }
}
