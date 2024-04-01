package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.44g */
/* loaded from: classes3.dex */
public class C887344g implements AnonymousClass423 {
    public static final Camera.ShutterCallback A0d = new Camera.ShutterCallback() { // from class: X.42Q
        @Override // android.hardware.Camera.ShutterCallback
        public void onShutter() {
        }
    };
    public static volatile C887344g A0e;
    public int A00;
    public int A01;
    public Matrix A02;
    public AnonymousClass420 A03;
    public C886744a A04;
    public C881842d A05;
    public C44B A06;
    public C44N A07;
    public C44O A08;
    public UUID A09;
    public boolean A0A;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;
    public final C881742c A0K;
    public final C887444h A0L;
    public final C883242r A0O;
    public final C44E A0Q;
    public final C44I A0R;
    public volatile int A0V;
    public volatile Camera A0W;
    public volatile C44Y A0X;
    public volatile AnonymousClass443 A0Y;
    public volatile FutureTask A0Z;
    public volatile boolean A0a;
    public volatile boolean A0b;
    public volatile boolean A0c;
    public final AnonymousClass427 A0G = new AnonymousClass427();
    public final AtomicBoolean A0S = new AtomicBoolean(false);
    public final AtomicBoolean A0T = new AtomicBoolean(false);
    public final AtomicBoolean A0U = new AtomicBoolean(false);
    public boolean A0B = true;
    public final AnonymousClass427 A0H = new AnonymousClass427();
    public final Camera.ErrorCallback A0F = new Camera.ErrorCallback() { // from class: X.42L
        {
            C887344g.this = this;
        }

        @Override // android.hardware.Camera.ErrorCallback
        public void onError(final int i, Camera camera) {
            final String str;
            final boolean z;
            if (i != 1) {
                if (i == 2) {
                    str = "Camera evicted. Camera service was likely given to another customer. Camera resources will be released.";
                } else if (i != 100) {
                    str = C000200d.A0D("Unknown error code: ", i);
                } else {
                    str = "Camera server died. Camera resources will be released.";
                }
                z = true;
                final C887344g c887344g = C887344g.this;
                final List list = c887344g.A0G.A00;
                final UUID uuid = c887344g.A0Q.A03;
                Log.e("Camera1Device", str);
                c887344g.A0R.A05(uuid, new Runnable() { // from class: X.42G
                    @Override // java.lang.Runnable
                    public void run() {
                        List list2 = list;
                        if (0 < list2.size()) {
                            list2.get(0);
                            throw null;
                        } else if (z) {
                            C887344g c887344g2 = c887344g;
                            c887344g2.A0Q.A02(uuid);
                            c887344g2.A7I(null);
                        }
                    }
                });
            }
            str = "Unknown error";
            z = false;
            final C887344g c887344g2 = C887344g.this;
            final List list2 = c887344g2.A0G.A00;
            final UUID uuid2 = c887344g2.A0Q.A03;
            Log.e("Camera1Device", str);
            c887344g2.A0R.A05(uuid2, new Runnable() { // from class: X.42G
                @Override // java.lang.Runnable
                public void run() {
                    List list22 = list2;
                    if (0 < list22.size()) {
                        list22.get(0);
                        throw null;
                    } else if (z) {
                        C887344g c887344g22 = c887344g2;
                        c887344g22.A0Q.A02(uuid2);
                        c887344g22.A7I(null);
                    }
                }
            });
        }
    };
    public final C42A A0I = new C42A() { // from class: X.44e
        {
            C887344g.this = this;
        }

        @Override // X.C42A
        public void ANJ(AnonymousClass442 anonymousClass442) {
            C887344g c887344g = C887344g.this;
            c887344g.ARP(c887344g.A0I);
            C882642l c882642l = c887344g.A0M;
            C882942o c882942o = c882642l.A02;
            ReentrantLock reentrantLock = c882942o.A01;
            reentrantLock.lock();
            try {
                reentrantLock.lock();
                boolean z = (c882942o.A00 & 1) == 1;
                reentrantLock.unlock();
                reentrantLock.lock();
                if (!c882942o.A01()) {
                    c882942o.A00 = (c882942o.A00 | 2) & (-2);
                }
                reentrantLock.unlock();
                if (z) {
                    AnonymousClass446.A00();
                    AnonymousClass427 anonymousClass427 = c882642l.A00;
                    if (anonymousClass427.A00.isEmpty()) {
                        return;
                    }
                    final List list = anonymousClass427.A00;
                    C44J.A00(new Runnable() { // from class: X.42i
                        @Override // java.lang.Runnable
                        public void run() {
                            List list2 = list;
                            int size = list2.size();
                            for (int i = 0; i < size; i++) {
                                ((C44T) list2.get(i)).A00();
                            }
                        }
                    });
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    };
    public final C42B A0J = new C42B() { // from class: X.44f
        @Override // X.C42B
        public void AOt(MediaRecorder mediaRecorder) {
        }

        {
            C887344g.this = this;
        }

        @Override // X.C42B
        public void AOb(MediaRecorder mediaRecorder) {
            C887344g c887344g = C887344g.this;
            c887344g.A0W.unlock();
            mediaRecorder.setCamera(c887344g.A0W);
            mediaRecorder.setVideoSource(1);
        }
    };
    public final C885343m A0P = new C885343m();
    public final C882642l A0M = new C882642l();
    public final C887544i A0N = new C887544i();

    public static int A00(int i) {
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 0 : 270;
            }
            return 180;
        }
        return 90;
    }

    public C887344g(C44I c44i, C44E c44e, Context context) {
        this.A0R = c44i;
        this.A0Q = c44e;
        this.A0K = new C881742c(c44i);
        this.A0O = new C883242r(this.A0P, this.A0R);
        this.A0L = new C887444h(this.A0R, this.A0P);
        this.A0E = Math.round(TypedValue.applyDimension(1, 30.0f, context.getResources().getDisplayMetrics()));
    }

    public static C885643p A01(C887344g c887344g, C886744a c886744a, AnonymousClass420 anonymousClass420, C44Y c44y, int i) {
        C42D A01;
        if (!C44J.A01()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (c887344g.A0W != null) {
                AtomicBoolean atomicBoolean = c887344g.A0S;
                if (!atomicBoolean.get() || !anonymousClass420.equals(c887344g.A03) || c887344g.A0X != c44y || c887344g.A00 != i) {
                    c887344g.A04 = c886744a;
                    c887344g.A03 = anonymousClass420;
                    c887344g.A0X = c44y;
                    c887344g.A0M.A00(c887344g.A0W, false);
                    C886744a c886744a2 = c887344g.A04;
                    EnumC881942e enumC881942e = c886744a2.A02;
                    EnumC881942e enumC881942e2 = c886744a2.A03;
                    int i2 = anonymousClass420.A01;
                    int i3 = anonymousClass420.A00;
                    C44Q c44q = c886744a2.A00;
                    c887344g.A00 = i;
                    int A05 = c887344g.A05(i);
                    EnumC881942e enumC881942e3 = EnumC881942e.DEACTIVATED;
                    C885343m c885343m = c887344g.A0P;
                    AbstractC885543o A012 = c885343m.A01(c887344g.A06);
                    boolean equals = enumC881942e2.equals(enumC881942e3);
                    if (!equals && !enumC881942e.equals(enumC881942e3)) {
                        A01 = c44q.A01((List) A012.A00(AbstractC885543o.A0Z), (List) A012.A00(AbstractC885543o.A0f), (List) A012.A00(AbstractC885543o.A0d), i2, i3);
                    } else if (equals) {
                        if (!enumC881942e.equals(enumC881942e3)) {
                            A01 = c44q.A01((List) A012.A00(AbstractC885543o.A0Z), null, (List) A012.A00(AbstractC885543o.A0d), i2, i3);
                        }
                        A01 = c44q.A01(null, null, (List) A012.A00(AbstractC885543o.A0d), i2, i3);
                    } else {
                        if (enumC881942e.equals(enumC881942e3)) {
                            A01 = c44q.A01(null, (List) A012.A00(AbstractC885543o.A0f), (List) A012.A00(AbstractC885543o.A0d), i2, i3);
                        }
                        A01 = c44q.A01(null, null, (List) A012.A00(AbstractC885543o.A0d), i2, i3);
                    }
                    AnonymousClass455 A00 = c885343m.A00(c887344g.A06);
                    C42C c42c = A01.A00;
                    if (c42c == null && A01.A01 == null) {
                        throw new RuntimeException("SizeSetter returned null sizes!");
                    }
                    if (c42c != null) {
                        ((AbstractC886543y) A00).A00.A01(AbstractC886243v.A0Z, c42c);
                    }
                    C42C c42c2 = A01.A01;
                    if (c42c2 != null) {
                        ((AbstractC886543y) A00).A00.A01(AbstractC886243v.A0e, c42c2);
                    }
                    C42C c42c3 = A01.A02;
                    if (c42c3 != null) {
                        ((AbstractC886543y) A00).A00.A01(AbstractC886243v.A0i, c42c3);
                    }
                    A00.A01();
                    ((AbstractC886543y) A00).A00.A01(AbstractC886243v.A00, 3);
                    ((AbstractC886543y) A00).A00.A01(AbstractC886243v.A0j, 1);
                    ((AbstractC886543y) A00).A00.A01(AbstractC886243v.A0b, C44Z.A00((List) A00.A00.A00(AbstractC885543o.A0b)));
                    ((AbstractC886543y) A00).A00.A01(AbstractC886243v.A0g, 0);
                    C44B c44b = c887344g.A06;
                    AbstractC885543o A013 = c885343m.A01(c44b);
                    if (((Boolean) A013.A00(AbstractC885543o.A0I)).booleanValue() && c887344g.A04 == null) {
                        throw null;
                    }
                    C886143u c886143u = AbstractC886243v.A0f;
                    if (c887344g.A04 != null) {
                        ((AbstractC886543y) A00).A00.A01(c886143u, Boolean.FALSE);
                        if (c887344g.A04 != null) {
                            A00.A00();
                            C887544i c887544i = c887344g.A0N;
                            c887544i.A01(c887344g.A0W);
                            SparseArray sparseArray = c885343m.A01;
                            c44b.A01();
                            AbstractC886243v abstractC886243v = (AbstractC886243v) sparseArray.get(c44b.mCameraId);
                            C886143u c886143u2 = AbstractC886243v.A0e;
                            C42C c42c4 = (C42C) abstractC886243v.A00(c886143u2);
                            int i4 = c42c4.A01;
                            int i5 = c42c4.A00;
                            C886143u c886143u3 = AbstractC886243v.A0a;
                            ((Number) abstractC886243v.A00(c886143u3)).intValue();
                            c44b.A01();
                            SurfaceTexture A002 = c44y.A00(i4, i5, c887344g.A0V, A00(c887344g.A00));
                            if (A002 != null) {
                                c887344g.A0W.setPreviewTexture(A002);
                            } else {
                                c887344g.A0W.setPreviewDisplay(null);
                            }
                            if (C44Y.A0E) {
                                c887344g.A0W.setDisplayOrientation(c887344g.A05(0));
                            } else {
                                c887344g.A0W.setDisplayOrientation(A05);
                            }
                            c887344g.A0C = ((Boolean) A013.A00(AbstractC885543o.A0H)).booleanValue();
                            atomicBoolean.set(true);
                            c887344g.A0T.set(false);
                            c887344g.A0c = ((Boolean) A013.A00(AbstractC885543o.A0J)).booleanValue();
                            C883242r c883242r = c887344g.A0O;
                            Camera camera = c887344g.A0W;
                            C44B c44b2 = c887344g.A06;
                            c883242r.A02 = camera;
                            c883242r.A03 = c44b2;
                            C885343m c885343m2 = c883242r.A06;
                            SparseArray sparseArray2 = c885343m2.A00;
                            c44b2.A01();
                            AbstractC885543o abstractC885543o = (AbstractC885543o) sparseArray2.get(c44b2.mCameraId);
                            c883242r.A0A = (List) abstractC885543o.A00(AbstractC885543o.A0h);
                            c883242r.A0D = ((Boolean) abstractC885543o.A00(AbstractC885543o.A0D)).booleanValue();
                            SparseArray sparseArray3 = c885343m2.A01;
                            c44b2.A01();
                            c883242r.A09 = ((Number) ((AbstractC886243v) sparseArray3.get(c44b2.mCameraId)).A00(AbstractC886243v.A0k)).intValue();
                            c44b2.A01();
                            c883242r.A00 = ((Number) ((AbstractC885543o) sparseArray2.get(c44b2.mCameraId)).A00(AbstractC885543o.A0N)).intValue();
                            c883242r.A02.setZoomChangeListener(c883242r);
                            c883242r.A0B = true;
                            C887444h c887444h = c887344g.A0L;
                            Camera camera2 = c887344g.A0W;
                            C44B c44b3 = c887344g.A06;
                            c887444h.A05.A04("The FocusController must be prepared on the Optic thread.");
                            ((C882242h) c887444h).A00 = camera2;
                            c887444h.A03 = c44b3;
                            c887444h.A08 = true;
                            c887444h.A07 = false;
                            c887444h.A06 = false;
                            c887444h.A00 = true;
                            c887444h.A01 = false;
                            c887344g.A0D(i4, i5);
                            c887544i.A02(c887344g.A0W, (C42C) abstractC886243v.A00(c886143u2), ((Number) abstractC886243v.A00(c886143u3)).intValue());
                            c887344g.A0A();
                            AnonymousClass449.A00().A01 = 0L;
                            StringBuilder A0P = C000200d.A0P("time to setPreviewSurfaceTexture:");
                            A0P.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                            A0P.append("ms");
                            Log.d("Camera1Device", A0P.toString());
                            return new C885643p(c44b, A013, abstractC886243v);
                        }
                        throw null;
                    }
                    throw null;
                }
                if (c887344g.A0M.A02.A01()) {
                    c887344g.A0A();
                }
                return new C885643p(c887344g.A06, c887344g.A8m(), c887344g.A06());
            }
            throw new RuntimeException("Can't connect to the camera service.");
        }
        throw new RuntimeException("initialiseCamera should not run on the UI thread");
    }

    public static void A02(C887344g c887344g) {
        C44Y c44y;
        if (c887344g != null) {
            try {
                try {
                    if (c887344g.A0b) {
                        c887344g.A0B();
                    }
                    if (c887344g.A0W != null) {
                        c887344g.A08();
                        c887344g.A0N.A00();
                    }
                } catch (RuntimeException e) {
                    Log.e("Camera1Device", "Stop video recording failed, likely due to nothing being captured", e);
                    if (c887344g.A0W != null) {
                        c887344g.A08();
                        c887344g.A0N.A00();
                    }
                    if (c887344g.A0X != null) {
                        c44y = c887344g.A0X;
                        if (c887344g.A0X == null) {
                            throw null;
                        }
                    }
                }
                if (c887344g.A0X != null) {
                    c44y = c887344g.A0X;
                    if (c887344g.A0X == null) {
                        throw null;
                    }
                    c44y.A01();
                }
                c887344g.A0X = null;
                return;
            } catch (Throwable th) {
                if (c887344g.A0W != null) {
                    c887344g.A08();
                    c887344g.A0N.A00();
                }
                if (c887344g.A0X != null) {
                    C44Y c44y2 = c887344g.A0X;
                    if (c887344g.A0X != null) {
                        c44y2.A01();
                    } else {
                        throw null;
                    }
                }
                c887344g.A0X = null;
                throw th;
            }
        }
        throw null;
    }

    public static void A03(C887344g c887344g, C44B c44b, AnonymousClass420 anonymousClass420) {
        if (!C44J.A01()) {
            if (c887344g.A0W == null || c887344g.A06 != c44b) {
                c887344g.A08();
                AnonymousClass449 A00 = AnonymousClass449.A00();
                if (A00 != null) {
                    A00.A00 = SystemClock.elapsedRealtime();
                    c44b.A01();
                    final int i = c44b.mCameraId;
                    c887344g.A0W = (Camera) c887344g.A0R.A02(new Callable() { // from class: X.42I
                        {
                            C887344g.this = c887344g;
                        }

                        @Override // java.util.concurrent.Callable
                        public Object call() {
                            return Camera.open(i);
                        }
                    }, "open_camera_on_camera_handler_thread");
                    if (c887344g.A0W != null) {
                        c887344g.A06 = c44b;
                        c887344g.A0W.setErrorCallback(c887344g.A0F);
                        c887344g.A03 = anonymousClass420;
                        C885343m c885343m = c887344g.A0P;
                        Camera camera = c887344g.A0W;
                        if (c885343m == null) {
                            throw null;
                        }
                        if (camera != null) {
                            c44b.A01();
                            int i2 = c44b.mCameraId;
                            Camera.Parameters parameters = camera.getParameters();
                            AnonymousClass458 anonymousClass458 = new AnonymousClass458(parameters);
                            c885343m.A00.put(i2, anonymousClass458);
                            AnonymousClass459 anonymousClass459 = new AnonymousClass459(parameters, anonymousClass458);
                            c885343m.A01.put(i2, anonymousClass459);
                            c885343m.A02.put(i2, new AnonymousClass455(camera, parameters, anonymousClass458, anonymousClass459));
                            return;
                        }
                        throw new NullPointerException("camera is null!");
                    }
                    throw new IllegalArgumentException("Camera is null.");
                }
                throw null;
            }
            return;
        }
        throw new RuntimeException("Should not check for open camera on the UI thread.");
    }

    public static void A04(C887344g c887344g, boolean z) {
        if (c887344g != null) {
            if (!C44J.A01()) {
                if (c887344g.isConnected()) {
                    if (z) {
                        c887344g.A0A();
                    }
                    c887344g.A0U.set(false);
                    return;
                }
                return;
            }
            throw new RuntimeException("Performing post photo capture on UI thread");
        }
        throw null;
    }

    public final int A05(int i) {
        C44B c44b = this.A06;
        if (c44b != null) {
            c44b.A01();
            Camera.CameraInfo cameraInfo = c44b.mCameraInfo;
            if (cameraInfo == null) {
                cameraInfo = C44B.A00;
            }
            int A00 = A00(i);
            int i2 = cameraInfo.facing;
            int i3 = cameraInfo.orientation;
            if (i2 == 1) {
                return (360 - ((i3 + A00) % 360)) % 360;
            }
            return ((i3 - A00) + 360) % 360;
        }
        throw new AnonymousClass425("No current camera to get orientation for");
    }

    public AbstractC886243v A06() {
        if (isConnected()) {
            return this.A0P.A02(this.A06);
        }
        throw new AnonymousClass425("Cannot get camera settings");
    }

    public final void A07() {
        C882642l c882642l = this.A0M;
        c882642l.A00.A00();
        c882642l.A01.A00();
        ((C882242h) this.A0L).A01 = null;
        this.A0O.A05.A00();
        this.A0H.A00();
    }

    public final void A08() {
        if (this.A0W != null) {
            A0C();
            this.A0S.set(false);
            this.A0T.set(false);
            final Camera camera = this.A0W;
            this.A0W = null;
            C883242r c883242r = this.A0O;
            if (c883242r.A0B) {
                Handler handler = c883242r.A04;
                handler.removeMessages(1);
                handler.removeMessages(2);
                c883242r.A0A = null;
                c883242r.A02.setZoomChangeListener(null);
                c883242r.A02 = null;
                c883242r.A0B = false;
            }
            C887444h c887444h = this.A0L;
            c887444h.A05.A04("The FocusController must be released on the Optic thread.");
            c887444h.A08 = false;
            ((C882242h) c887444h).A00 = null;
            c887444h.A03 = null;
            c887444h.A07 = false;
            c887444h.A06 = false;
            this.A0c = false;
            C885343m c885343m = this.A0P;
            C44B c44b = this.A06;
            if (c885343m != null) {
                c44b.A01();
                c885343m.A02.remove(c44b.mCameraId);
                this.A0R.A02(new Callable() { // from class: X.42J
                    {
                        C887344g.this = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public Object call() {
                        C887344g c887344g = C887344g.this;
                        C882642l c882642l = c887344g.A0M;
                        Camera camera2 = camera;
                        c882642l.A00(camera2, true);
                        try {
                            camera2.setPreviewTexture(null);
                        } catch (IOException e) {
                            Log.e("Camera1Device", "Unable to remove the current SurfaceTexture", e);
                        }
                        c887344g.A0N.A01(camera2);
                        camera2.release();
                        return null;
                    }
                }, "close_camera_on_camera_handler_thread");
                return;
            }
            throw null;
        }
    }

    public final void A09() {
        AtomicBoolean atomicBoolean = this.A0U;
        synchronized (atomicBoolean) {
            this.A0a = true;
            atomicBoolean.notify();
        }
    }

    public final void A0A() {
        if (isConnected()) {
            A5G(this.A0I);
            C882642l c882642l = this.A0M;
            Camera camera = this.A0W;
            C882942o c882942o = c882642l.A02;
            ReentrantLock reentrantLock = c882942o.A01;
            reentrantLock.lock();
            if (camera != null) {
                try {
                    if (!c882942o.A00()) {
                        reentrantLock.lock();
                        boolean z = (c882942o.A00 & 1) == 1;
                        reentrantLock.unlock();
                        if (!z) {
                            reentrantLock.lock();
                            if (c882942o.A01()) {
                                c882942o.A00 = 1;
                                reentrantLock.unlock();
                                camera.startPreview();
                            } else {
                                throw new IllegalStateException("Cannot progress to STARTING, not in STOPPED state");
                            }
                        }
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
    }

    public final void A0B() {
        try {
            C44O c44o = this.A08;
            if (c44o != null) {
                c44o.AVE();
                this.A08 = null;
            }
        } finally {
            if (this.A0W != null) {
                this.A0W.lock();
                AnonymousClass455 A00 = this.A0P.A00(this.A06);
                ((AbstractC886543y) A00).A00.A01(AbstractC886243v.A09, Integer.valueOf(this.A01));
                ((AbstractC886543y) A00).A00.A01(AbstractC886243v.A0P, Boolean.valueOf(this.A0A));
                A00.A01();
                A00.A00();
            }
            this.A0b = false;
        }
    }

    public final synchronized void A0C() {
        FutureTask futureTask = this.A0Z;
        if (futureTask != null) {
            this.A0R.A07(futureTask);
            this.A0Z = null;
        }
    }

    public final void A0D(int i, int i2) {
        Matrix matrix = new Matrix();
        this.A02 = matrix;
        matrix.setScale(this.A06.equals(C44B.FRONT) ? -1.0f : 1.0f, 1.0f);
        int A05 = A05(this.A00);
        this.A02.postRotate(A05);
        if (A05 != 90 && A05 != 270) {
            float f = i;
            float f2 = i2;
            this.A02.postScale(f / 2000.0f, f2 / 2000.0f);
            this.A02.postTranslate(f / 2.0f, f2 / 2.0f);
            return;
        }
        float f3 = i2;
        float f4 = i;
        this.A02.postScale(f3 / 2000.0f, f4 / 2000.0f);
        this.A02.postTranslate(f3 / 2.0f, f4 / 2.0f);
    }

    @Override // X.AnonymousClass423
    public void A5G(C42A c42a) {
        if (c42a != null) {
            C887544i c887544i = this.A0N;
            synchronized (c887544i) {
                c887544i.A05.A01(c42a);
            }
            C44I c44i = this.A0R;
            if (c44i.A08()) {
                if (isConnected()) {
                    Camera camera = this.A0W;
                    C885343m c885343m = this.A0P;
                    c887544i.A02(camera, (C42C) c885343m.A02(this.A06).A00(AbstractC886243v.A0e), ((Number) c885343m.A02(this.A06).A00(AbstractC886243v.A0a)).intValue());
                    return;
                }
                return;
            } else if (!isConnected()) {
                return;
            } else {
                c44i.A06(new Callable() { // from class: X.42K
                    {
                        C887344g.this = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public Object call() {
                        C887344g c887344g = C887344g.this;
                        if (c887344g.isConnected()) {
                            C887544i c887544i2 = c887344g.A0N;
                            Camera camera2 = c887344g.A0W;
                            C885343m c885343m2 = c887344g.A0P;
                            c887544i2.A02(camera2, (C42C) c885343m2.A02(c887344g.A06).A00(AbstractC886243v.A0e), ((Number) c885343m2.A02(c887344g.A06).A00(AbstractC886243v.A0a)).intValue());
                            return null;
                        }
                        return null;
                    }
                }, "enable_preview_frame_listeners");
                return;
            }
        }
        throw new IllegalArgumentException("listener is required");
    }

    @Override // X.AnonymousClass423
    public void A5H(final C44T c44t) {
        C882642l c882642l = this.A0M;
        if (c882642l.A02.A00()) {
            if (0 != 0) {
                C44J.A00(new Runnable() { // from class: X.42k
                    @Override // java.lang.Runnable
                    public void run() {
                        c44t.A00();
                    }
                });
            } else {
                c44t.A00();
            }
        }
        c882642l.A00.A01(c44t);
    }

    @Override // X.AnonymousClass423
    public void A6R(String str, final C44B c44b, final C886744a c886744a, final AnonymousClass420 anonymousClass420, final C44Y c44y, final int i, AnonymousClass444 anonymousClass444, C44K c44k, AbstractC886844b abstractC886844b) {
        AnonymousClass446.A00 = C07K.A0O(null);
        AnonymousClass446.A00();
        if (this.A0D) {
            this.A09 = this.A0Q.A00(str, this.A0R.A00);
        }
        this.A0R.A01(new Callable() { // from class: X.42E
            {
                C887344g.this = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                try {
                    AnonymousClass446.A00();
                    C887344g c887344g = C887344g.this;
                    if (c887344g.A0X != null && c887344g.A0X != c44y) {
                        C44Y c44y2 = c887344g.A0X;
                        if (c887344g.A0X != null) {
                            c44y2.A01();
                            c887344g.A0X = null;
                        } else {
                            throw null;
                        }
                    }
                    C881742c c881742c = c887344g.A0K;
                    C44B c44b2 = c44b;
                    if (c881742c.A00.A08()) {
                        c44b2.A01();
                        if (!C881742c.A00(c44b2.mCameraId)) {
                            int i2 = C881742c.A01;
                            if (i2 == -1) {
                                AnonymousClass446.A01("Camera count was not initialised");
                                i2 = Camera.getNumberOfCameras();
                                C881742c.A01 = i2;
                            }
                            if (i2 != 0) {
                                C44B c44b3 = C44B.BACK;
                                if (c44b2.equals(c44b3) && C881742c.A00(1)) {
                                    AnonymousClass446.A02("CameraInventory", "Requested back camera doesn't exist, using front instead");
                                    c44b2 = C44B.FRONT;
                                } else if (c44b2.equals(C44B.FRONT) && C881742c.A00(0)) {
                                    AnonymousClass446.A02("CameraInventory", "Requested front camera doesn't exist, using back instead");
                                    c44b2 = c44b3;
                                } else {
                                    StringBuilder A0P = C000200d.A0P("found ");
                                    A0P.append(C881742c.A01);
                                    A0P.append(" cameras with bad facing constants");
                                    AnonymousClass446.A01(A0P.toString());
                                }
                                if (c44b2 != null) {
                                }
                            }
                            throw new AnonymousClass425("No cameras found on device");
                        }
                        AnonymousClass420 anonymousClass4202 = anonymousClass420;
                        C886744a c886744a2 = c886744a;
                        C887344g.A03(c887344g, c44b2, anonymousClass4202);
                        C885643p A01 = C887344g.A01(c887344g, c886744a2, anonymousClass4202, c44y, i);
                        AnonymousClass446.A00();
                        return A01;
                    }
                    throw new RuntimeException("Cannot resolve camera facing, not on the Optic thread");
                } catch (Exception e) {
                    C887344g c887344g2 = C887344g.this;
                    c887344g2.A09();
                    c887344g2.A0U.set(false);
                    c887344g2.A07();
                    C887344g.A02(c887344g2);
                    throw e;
                }
            }
        }, "connect", abstractC886844b);
    }

    @Override // X.AnonymousClass423
    public void A7I(AbstractC886844b abstractC886844b) {
        A09();
        this.A0U.set(false);
        A07();
        if (this.A0D) {
            this.A0Q.A02(this.A09);
            this.A09 = null;
        }
        this.A0R.A01(new Callable() { // from class: X.42F
            {
                C887344g.this = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                C887344g.A02(C887344g.this);
                return null;
            }
        }, "disconnect", abstractC886844b);
    }

    @Override // X.AnonymousClass423
    public void A7t(int i, int i2) {
        Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0E;
        rect.inset(i3, i3);
        this.A0R.A01(new C42O(this, rect), "focus", new C45J(this));
    }

    @Override // X.AnonymousClass423
    public C44B A8j() {
        return this.A06;
    }

    @Override // X.AnonymousClass423
    public AbstractC885543o A8m() {
        if (isConnected()) {
            return this.A0P.A01(this.A06);
        }
        throw new AnonymousClass425("Cannot get camera capabilities");
    }

    @Override // X.AnonymousClass423
    public int AE9() {
        C883242r c883242r = this.A0O;
        if (c883242r.A0B) {
            return c883242r.A09;
        }
        return 0;
    }

    @Override // X.AnonymousClass423
    public boolean AEO(C44B c44b) {
        try {
            c44b.A01();
            return c44b.mIsPresent;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    @Override // X.AnonymousClass423
    public void AEx(int i, int i2, C44B c44b, Matrix matrix) {
        C881842d c881842d = new C881842d(c44b, A05(this.A00), i, i2, matrix);
        this.A05 = c881842d;
        this.A0L.A02 = c881842d;
    }

    @Override // X.AnonymousClass423
    public boolean AFh() {
        return this.A0b;
    }

    @Override // X.AnonymousClass423
    public boolean AFp() {
        return AEO(C44B.BACK) && AEO(C44B.FRONT);
    }

    @Override // X.AnonymousClass423
    public boolean AGD(float[] fArr) {
        Matrix matrix;
        C881842d c881842d = this.A05;
        if (c881842d == null || (matrix = c881842d.A00) == null) {
            return false;
        }
        matrix.mapPoints(fArr);
        return true;
    }

    @Override // X.AnonymousClass423
    public void AGW(final C886443x c886443x, AbstractC886844b abstractC886844b) {
        this.A0R.A01(new Callable() { // from class: X.42H
            {
                C887344g.this = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                C887344g c887344g = C887344g.this;
                if (c887344g.isConnected()) {
                    C885343m c885343m = c887344g.A0P;
                    C886443x c886443x2 = c886443x;
                    C44B c44b = c887344g.A06;
                    SparseArray sparseArray = c885343m.A02;
                    c44b.A01();
                    ((AnonymousClass455) sparseArray.get(c44b.mCameraId)).A02(c886443x2);
                    return c885343m.A02(c887344g.A06);
                }
                throw new AnonymousClass425("Cannot modify settings");
            }
        }, "modify_settings", abstractC886844b);
    }

    @Override // X.AnonymousClass423
    public void AMa(int i) {
        this.A0V = i;
        C44Y c44y = this.A0X;
        if (c44y != null) {
            c44y.A00 = this.A0V;
        }
    }

    @Override // X.AnonymousClass423
    public void ARP(C42A c42a) {
        if (c42a != null) {
            C887544i c887544i = this.A0N;
            synchronized (c887544i) {
                c887544i.A07.remove(c42a);
                c887544i.A05.A02(c42a);
            }
            if (this.A0Q.A04) {
                this.A0R.A06(new Callable() { // from class: X.42M
                    {
                        C887344g.this = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public Object call() {
                        boolean z;
                        C887344g c887344g = C887344g.this;
                        if (c887344g.isConnected()) {
                            C887544i c887544i2 = c887344g.A0N;
                            synchronized (c887544i2) {
                                z = !c887544i2.A05.A00.isEmpty();
                            }
                            if (!z) {
                                c887544i2.A01(c887344g.A0W);
                                synchronized (c887544i2) {
                                    c887544i2.A06.clear();
                                }
                                return null;
                            }
                            return null;
                        }
                        return null;
                    }
                }, "disable_preview_frame_listeners");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("listener is required");
    }

    @Override // X.AnonymousClass423
    public void ARQ(C44T c44t) {
        this.A0M.A00.A02(c44t);
    }

    @Override // X.AnonymousClass423
    public void AT3(AnonymousClass429 anonymousClass429) {
        ((C882242h) this.A0L).A01 = anonymousClass429;
    }

    @Override // X.AnonymousClass423
    public void ATV(C44S c44s) {
        C44E c44e = this.A0Q;
        synchronized (c44e.A02) {
            c44e.A00 = c44s;
        }
    }

    @Override // X.AnonymousClass423
    public void ATh(final int i, AbstractC886844b abstractC886844b) {
        this.A0R.A01(new Callable() { // from class: X.42S
            {
                C887344g.this = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                C887344g c887344g = C887344g.this;
                if (c887344g.isConnected()) {
                    c887344g.A00 = i;
                    if (c887344g.A0X == null) {
                        c887344g.A0W.setDisplayOrientation(c887344g.A05(c887344g.A00));
                    } else if (c887344g.A0X != null) {
                        if (C44Y.A0E) {
                            c887344g.A0W.setDisplayOrientation(c887344g.A05(0));
                        } else {
                            c887344g.A0W.setDisplayOrientation(c887344g.A05(c887344g.A00));
                        }
                        c887344g.A0X.A02(C887344g.A00(c887344g.A00));
                    } else {
                        throw null;
                    }
                    AbstractC886243v A06 = c887344g.A06();
                    C42C c42c = (C42C) A06.A00(AbstractC886243v.A0e);
                    c887344g.A0D(c42c.A01, c42c.A00);
                    return new C885643p(c887344g.A06, c887344g.A8m(), A06);
                }
                throw new AnonymousClass425("Can not update preview display rotation");
            }
        }, "set_rotation", abstractC886844b);
    }

    @Override // X.AnonymousClass423
    public void AUH(final int i, AbstractC886844b abstractC886844b) {
        this.A0R.A01(new Callable() { // from class: X.42R
            {
                C887344g.this = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                C887344g c887344g = C887344g.this;
                if (c887344g.isConnected() && c887344g.A0c) {
                    C883242r c883242r = c887344g.A0O;
                    int i2 = i;
                    c883242r.A00(i2);
                    return Integer.valueOf(i2);
                }
                return 0;
            }
        }, "set_zoom_level", null);
    }

    @Override // X.AnonymousClass423
    public boolean AUK(int i, int i2, int i3, int i4, Matrix matrix, boolean z) {
        matrix.reset();
        float f = i;
        float f2 = i2;
        float f3 = f / f2;
        int A05 = A05(this.A00);
        if (A05 == 90 || A05 == 270) {
            i4 = i3;
            i3 = i4;
        }
        float f4 = i3;
        float f5 = i4;
        float f6 = f4 / f5;
        float f7 = (!z ? f6 > f3 : f6 <= f3) ? f2 / f5 : f / f4;
        matrix.setScale((f4 / f) * f7, (f5 / f2) * f7, i >> 1, i2 >> 1);
        return true;
    }

    @Override // X.AnonymousClass423
    public void AUw(int i, int i2, AbstractC886844b abstractC886844b) {
        final Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0E;
        rect.inset(i3, i3);
        this.A0R.A01(new Callable() { // from class: X.42N
            {
                C887344g.this = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                C887344g c887344g = C887344g.this;
                if (c887344g.isConnected() && ((Boolean) c887344g.A8m().A00(AbstractC885543o.A0F)).booleanValue()) {
                    AnonymousClass455 A00 = c887344g.A0P.A00(c887344g.A06);
                    Rect rect2 = rect;
                    if (A00 != null) {
                        ((AbstractC886543y) A00).A00.A01(AbstractC886243v.A0V, C885943s.A04(rect2));
                        A00.A00();
                    } else {
                        throw null;
                    }
                }
                return null;
            }
        }, "spot_meter", abstractC886844b);
    }

    @Override // X.AnonymousClass423
    public void AV7(File file, AbstractC886844b abstractC886844b) {
        final String absolutePath = file.getAbsolutePath();
        if (absolutePath != null) {
            if (!isConnected()) {
                abstractC886844b.A00(new RuntimeException("Can't record video before it's initialised."));
                return;
            }
            final long A0O = C07K.A0O(null);
            this.A0b = true;
            this.A0R.A01(new Callable() { // from class: X.42a
                {
                    C887344g.this = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:99:0x0118, code lost:
                    if (r1.contains(6) != false) goto L58;
                 */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object call() {
                    /*
                        Method dump skipped, instructions count: 365
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.CallableC881542a.call():java.lang.Object");
                }
            }, "start_video", new C45L(this, abstractC886844b));
            return;
        }
        throw new RuntimeException("Both videoPath and videoFileDescriptor cannot be null, one must contain a valid value");
    }

    @Override // X.AnonymousClass423
    public void AVF(final boolean z, AbstractC886844b abstractC886844b) {
        if (!this.A0b) {
            abstractC886844b.A00(new RuntimeException("Not recording video"));
            return;
        }
        final long A0O = C07K.A0O(null);
        this.A0R.A01(new Callable() { // from class: X.42b
            {
                C887344g.this = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                C887344g c887344g = C887344g.this;
                boolean z2 = z;
                long j = A0O;
                if (c887344g.A0b) {
                    c887344g.A0B();
                    if (z2) {
                        c887344g.A0A();
                    }
                    C44N c44n = c887344g.A07;
                    long j2 = c44n.A02;
                    if (j2 != -1) {
                        j = j2;
                    }
                    c44n.A02 = j;
                    return c44n;
                }
                throw new IllegalStateException("Not recording video.");
            }
        }, "stop_video_recording", abstractC886844b);
    }

    @Override // X.AnonymousClass423
    public void AVL(AbstractC886844b abstractC886844b) {
        if (this.A0U.get()) {
            return;
        }
        AnonymousClass446.A00 = C07K.A0O(null);
        AnonymousClass446.A00();
        this.A0R.A01(new Callable() { // from class: X.42T
            {
                C887344g.this = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                C887344g c887344g = C887344g.this;
                AnonymousClass446.A00();
                if (c887344g.isConnected()) {
                    C44B c44b = c887344g.A06;
                    C44B c44b2 = C44B.BACK;
                    if (c44b.equals(c44b2)) {
                        c44b2 = C44B.FRONT;
                    }
                    c44b2.A01();
                    if (C881742c.A00(c44b2.mCameraId)) {
                        C887344g.A03(c887344g, c44b2, c887344g.A03);
                        C885643p A01 = C887344g.A01(c887344g, c887344g.A04, c887344g.A03, c887344g.A0X, c887344g.A00);
                        AnonymousClass446.A00();
                        return A01;
                    }
                    StringBuilder A0P = C000200d.A0P("Cannot switch to ");
                    A0P.append(c44b2.name());
                    A0P.append(", camera is not present");
                    throw new AnonymousClass421(A0P.toString());
                }
                throw new AnonymousClass425("Cannot switch cameras.");
            }
        }, "switch_camera", abstractC886844b);
    }

    @Override // X.AnonymousClass423
    public void AVN(boolean z, boolean z2, C44V c44v) {
        if (!isConnected()) {
            c44v.A00(new AnonymousClass425("Cannot take a photo"));
            return;
        }
        AtomicBoolean atomicBoolean = this.A0U;
        if (atomicBoolean.get()) {
            c44v.A00(new Exception("Busy taking photo") { // from class: X.424
            });
        } else if (this.A0b && !this.A0C) {
            c44v.A00(new Exception("Cannot take a photo while recording video") { // from class: X.424
            });
        } else {
            AnonymousClass449 A00 = AnonymousClass449.A00();
            if (A00 != null) {
                A00.A02 = SystemClock.elapsedRealtime();
                ((Number) A06().A00(AbstractC886243v.A0X)).intValue();
                AnonymousClass446.A00 = C07K.A0O(null);
                AnonymousClass446.A00();
                atomicBoolean.set(true);
                this.A0a = false;
                this.A0R.A01(new C42W(this, c44v, z, z2), "take_photo", new C45K(this, c44v, z2));
                return;
            }
            throw null;
        }
    }

    @Override // X.AnonymousClass423
    public boolean isConnected() {
        if (this.A0W != null) {
            return this.A0S.get() || this.A0T.get();
        }
        return false;
    }
}
