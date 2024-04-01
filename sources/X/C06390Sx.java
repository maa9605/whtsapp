package X;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Sx */
/* loaded from: classes.dex */
public class C06390Sx extends FrameLayout implements InterfaceC06400Sy, C0Sz, C0T0, C0T1 {
    public static final double A0q = Math.log(2.0d);
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public Context A0L;
    public C0T4 A0M;
    public C18350tb A0N;
    public C0SK A0O;
    public InterfaceC18420ti A0P;
    public InterfaceC18430tj A0Q;
    public C18460tm A0R;
    public RunnableC18470tn A0S;
    public C18590tz A0T;
    public C0u9 A0U;
    public EnumSet A0V;
    public Queue A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public final BroadcastReceiver A0i;
    public final ComponentCallbacks A0j;
    public final Matrix A0k;
    public final Matrix A0l;
    public final RectF A0m;
    public final C18260tR A0n;
    public final float[] A0o;
    public final float[] A0p;

    public C06390Sx(Context context, C18350tb c18350tb) {
        super(context);
        this.A0c = false;
        this.A0n = new C18260tR(this);
        new Paint(2);
        this.A0m = new RectF();
        this.A0k = new Matrix();
        this.A0l = new Matrix();
        this.A0o = new float[2];
        this.A0p = new float[4];
        this.A02 = 0.5d;
        this.A03 = 0.5d;
        this.A0I = SystemClock.uptimeMillis();
        this.A0U = C0u9.A00;
        this.A0j = new ComponentCallbacks() { // from class: X.0te
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration) {
            }

            {
                C06390Sx.this = this;
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
                C06390Sx.this.A04();
            }
        };
        this.A0i = new BroadcastReceiver() { // from class: X.0tf
            {
                C06390Sx.this = this;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent == null || !intent.getBooleanExtra("noConnectivity", false)) {
                    C06390Sx.this.invalidate();
                }
            }
        };
        this.A0H = System.nanoTime();
        setWillNotDraw(false);
        this.A0L = context;
        this.A0N = c18350tb;
        C18590tz c18590tz = new C18590tz(context, this);
        this.A0T = c18590tz;
        c18590tz.A0L = this.A0l;
        c18590tz.A0A = 0.87f;
        c18590tz.A07 = 0.85f;
        this.A0a = this.A0L.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
        this.A0h = true;
        RunnableC18470tn runnableC18470tn = new RunnableC18470tn(this, this);
        this.A0S = runnableC18470tn;
        runnableC18470tn.A06 = this.A0l;
        C0K2.A0A.add(new WeakReference(this));
        C0K2.A00();
    }

    public static double A00(double d) {
        int i;
        if (d < 0.0d) {
            i = 1;
        } else {
            i = 0;
            if (d > 1.0d) {
                i = -1;
            }
        }
        return d + i;
    }

    public double A01(double d, long j) {
        double d2 = this.A01 * (this.A0J / j);
        double d3 = 1.0d - d2;
        return d < d2 ? d2 : d > d3 ? d3 : d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0009, code lost:
        if (r2.A0H == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02() {
        /*
            r5 = this;
            X.0T4 r2 = r5.A0M
            boolean r0 = r2.A0N
            if (r0 == 0) goto Lb
            X.1X4 r1 = r2.A0H
            r0 = 1
            if (r1 != 0) goto Lc
        Lb:
            r0 = 0
        Lc:
            r4 = 1
            if (r0 == 0) goto L18
            X.1X6 r1 = r2.A0U
            boolean r0 = r1.A03
            if (r0 != 0) goto L18
            r1.A01(r4)
        L18:
            boolean r0 = r5.A0Y
            if (r0 != 0) goto L33
            android.content.Context r1 = r5.A0L
            android.content.ComponentCallbacks r0 = r5.A0j
            r1.registerComponentCallbacks(r0)
            android.content.Context r3 = r5.A0L
            android.content.BroadcastReceiver r2 = r5.A0i
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            r3.registerReceiver(r2, r0)
            r5.A0Y = r4
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06390Sx.A02():void");
    }

    public final void A03() {
        C1X6 c1x6 = this.A0M.A0U;
        if (c1x6.A03) {
            c1x6.A01(false);
        }
        if (this.A0Y) {
            this.A0L.unregisterComponentCallbacks(this.A0j);
            this.A0L.unregisterReceiver(this.A0i);
            this.A0Y = false;
        }
        this.A0M.A06();
        for (C18680u8 c18680u8 : C18680u8.A0W) {
            c18680u8.A02();
        }
    }

    public final void A04() {
        int size = this.A0M.A0W.size();
        for (int i = 0; i < size; i++) {
            C0SK c0sk = (C0SK) this.A0M.A0W.get(i);
            if (c0sk instanceof AbstractC29401Wq) {
                ((AbstractC29401Wq) c0sk).A0F();
            }
        }
        C18620u2.A01(new C1X7());
    }

    public final void A05() {
        this.A0e = false;
        C18800uL A06 = this.A0M.A0R.A06();
        final C18260tR c18260tR = this.A0n;
        C016007m c016007m = A06.A02;
        double d = c016007m.A00;
        double d2 = c016007m.A01;
        C016007m c016007m2 = A06.A01;
        double d3 = c016007m2.A00;
        double d4 = c016007m2.A01;
        String str = C0K2.A0C.A02;
        int i = this.A0G;
        c18260tR.A02 = d;
        c18260tR.A03 = d2;
        c18260tR.A00 = d3;
        c18260tR.A01 = d4;
        c18260tR.A07 = str;
        c18260tR.A04 = i;
        if (!c18260tR.A08) {
            c18260tR.A08 = true;
            long nanoTime = System.nanoTime() - c18260tR.A05;
            long j = c18260tR.A09;
            if (nanoTime < j) {
                c18260tR.A0A.postDelayed(new Runnable() { // from class: X.0tQ
                    @Override // java.lang.Runnable
                    public void run() {
                        c18260tR.A00();
                    }
                }, TimeUnit.NANOSECONDS.toMillis(j - nanoTime));
            } else {
                c18260tR.A00();
            }
        }
    }

    public final void A06() {
        this.A0M.A0T.A0I(true);
        this.A0e = true;
        this.A0M.A06();
        RunnableC18470tn runnableC18470tn = this.A0S;
        runnableC18470tn.A0E.removeCallbacks(runnableC18470tn);
        runnableC18470tn.A0C = false;
        runnableC18470tn.A07 = false;
        runnableC18470tn.A08 = true;
        runnableC18470tn.A0F.forceFinished(true);
        runnableC18470tn.A01 = 0.0f;
        runnableC18470tn.A00 = 0.0f;
    }

    public final void A07() {
        this.A0M.A0T.A0I(true);
        RunnableC18470tn runnableC18470tn = this.A0S;
        runnableC18470tn.A0E.removeCallbacks(runnableC18470tn);
        runnableC18470tn.A08 = false;
        runnableC18470tn.A07 = true;
        runnableC18470tn.A0E.postOnAnimation(runnableC18470tn);
    }

    public final void A08() {
        RectF rectF = this.A0m;
        rectF.left = 0.0f;
        rectF.right = this.A0F;
        rectF.top = 0.0f;
        rectF.bottom = this.A0D;
        Matrix matrix = this.A0l;
        matrix.mapRect(rectF);
        float[] fArr = this.A0p;
        float f = this.A04;
        fArr[0] = -f;
        float f2 = -this.A05;
        fArr[1] = f2;
        fArr[2] = f;
        fArr[3] = f2;
        matrix.mapVectors(fArr);
        float max = Math.max(Math.abs(fArr[0]), Math.abs(fArr[2]));
        float max2 = Math.max(Math.abs(fArr[1]), Math.abs(fArr[3]));
        float f3 = (float) this.A0J;
        this.A00 = max / f3;
        this.A01 = max2 / f3;
    }

    public void A09(double d, double d2) {
        this.A02 = A00(d);
        this.A03 = A01(d2, this.A0J);
    }

    public void A0A(float f, float f2) {
        double d = this.A02;
        long j = this.A0J;
        float f3 = (float) j;
        this.A02 = A00(d - (f / f3));
        this.A03 = A01(this.A03 - (f2 / f3), j);
    }

    public void A0B(float f, float f2, float f3) {
        if (this.A0a) {
            C18450tl c18450tl = this.A0M.A0R;
            float[] fArr = this.A0o;
            c18450tl.A09(f2, f3, fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            Matrix matrix = this.A0k;
            matrix.postRotate(f - this.A0B, f2, f3);
            matrix.invert(this.A0l);
            this.A0B = f % 360.0f;
            A08();
            A0C(f2, f3, f4, f5);
        }
    }

    public final void A0C(float f, float f2, float f3, float f4) {
        float[] fArr = this.A0o;
        fArr[0] = this.A04 - f;
        fArr[1] = this.A05 - f2;
        this.A0l.mapVectors(fArr);
        float f5 = fArr[0];
        long j = this.A0J;
        float f6 = (float) j;
        this.A02 = A00((f5 / f6) + f3);
        this.A03 = A01((fArr[1] / f6) + f4, j);
    }

    public final void A0D(int i, float f) {
        this.A0G = i;
        this.A0C = f;
        int i2 = 1 << i;
        this.A0E = i2;
        this.A0J = i2 * this.A0M.A0O;
    }

    public final void A0E(Bundle bundle) {
        C0T4 c0t4 = new C0T4(this, this.A0N);
        this.A0M = c0t4;
        C015907l c015907l = this.A0N.A03;
        if (c015907l == null) {
            float f = c0t4.A01;
            A0D((int) f, (f % 1.0f) + 1.0f);
        } else {
            float f2 = c015907l.A02;
            A0D((int) f2, (f2 % 1.0f) + 1.0f);
            C016007m c016007m = c015907l.A03;
            if (c016007m != null) {
                this.A02 = C18450tl.A02(c016007m.A01);
                this.A03 = C18450tl.A01(c016007m.A00);
            }
            this.A0B = c015907l.A00;
        }
        this.A0R = c0t4.A0S;
        Matrix matrix = this.A0k;
        float f3 = this.A0C;
        matrix.setScale(f3, f3);
        matrix.postRotate(this.A0B);
        matrix.invert(this.A0l);
        A0F(bundle);
    }

    public final void A0F(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("zoom")) {
            return;
        }
        A0D(bundle.getInt("zoom"), bundle.getFloat("scale"));
        this.A02 = bundle.getDouble("xVisibleCenter") - ((0 - this.A0M.A05) / (this.A0J << 1));
        double d = bundle.getDouble("yVisibleCenter");
        C0T4 c0t4 = this.A0M;
        this.A03 = d - ((c0t4.A06 - c0t4.A04) / (this.A0J << 1));
        this.A0B = bundle.getFloat("rotation");
        Matrix matrix = this.A0k;
        float f = this.A0C;
        matrix.setScale(f, f);
        matrix.postRotate(this.A0B);
        matrix.invert(this.A0l);
        this.A0g = false;
    }

    public final void A0G(Bundle bundle) {
        if (this.A0g) {
            return;
        }
        bundle.putDouble("xVisibleCenter", this.A02 + ((0 - this.A0M.A05) / (this.A0J << 1)));
        double d = this.A03;
        C0T4 c0t4 = this.A0M;
        bundle.putDouble("yVisibleCenter", d + ((c0t4.A06 - c0t4.A04) / (this.A0J << 1)));
        bundle.putInt("zoom", this.A0G);
        bundle.putFloat("scale", this.A0C);
        bundle.putFloat("rotation", this.A0B);
        this.A0g = true;
    }

    public void A0H(InterfaceC18440tk interfaceC18440tk) {
        Queue queue;
        if (this.A0b && ((queue = this.A0W) == null || queue.isEmpty())) {
            interfaceC18440tk.ALj(this.A0M);
            return;
        }
        Queue queue2 = this.A0W;
        if (queue2 == null) {
            queue2 = new LinkedList();
            this.A0W = queue2;
        }
        queue2.add(interfaceC18440tk);
    }

    public boolean A0I(float f, float f2, float f3) {
        if (A0J(f, f2, f3)) {
            this.A0M.A04();
        }
        return this.A06 != 1.0f;
    }

    public boolean A0J(float f, float f2, float f3) {
        C18450tl c18450tl = this.A0M.A0R;
        float[] fArr = this.A0o;
        c18450tl.A09(f2, f3, fArr);
        float f4 = fArr[0];
        float f5 = fArr[1];
        C0T4 c0t4 = this.A0M;
        float min = Math.min(Math.max(f, c0t4.A01), c0t4.A00);
        int i = (int) min;
        float f6 = (min % 1.0f) + 1.0f;
        int i2 = this.A0G;
        float f7 = f6 / this.A0C;
        this.A06 = f7;
        A0D(i, f6);
        Matrix matrix = this.A0k;
        matrix.postScale(f7, f7, f2, f3);
        matrix.invert(this.A0l);
        A08();
        A0C(f2, f3, f4, f5);
        return this.A0G != i2;
    }

    public final boolean A0K(float f, float f2, float f3) {
        float f4 = this.A0C * f;
        int i = this.A0G;
        while (f4 > 2.0f) {
            f4 /= 2.0f;
            i++;
        }
        while (f4 < 1.0f) {
            f4 *= 2.0f;
            i--;
        }
        return A0I((i + f4) - 1.0f, f2, f3);
    }

    @Override // X.C0Sz
    public void AIs() {
        invalidate();
    }

    public EnumSet getCurrentAttribution() {
        return this.A0V;
    }

    public final C0T4 getMap() {
        return this.A0M;
    }

    public InterfaceC18420ti getOnAttributionChangeListener() {
        return this.A0P;
    }

    public float getZoom() {
        return (this.A0G + this.A0C) - 1.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A0M != null) {
            A02();
            this.A0K = System.nanoTime();
            if (this.A0d) {
                return;
            }
            C24821Cz c24821Cz = this.A0M.A0T.A03;
            ((C1XD) c24821Cz).A02.set(0L);
            c24821Cz.A02.set(0L);
            c24821Cz.A03.set(0L);
            this.A0d = true;
            return;
        }
        throw new RuntimeException("MapView.onCreate() must be called!");
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0M.A03();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0T4 c0t4 = this.A0M;
        C1X4 c1x4 = c0t4.A0H;
        if (c1x4 != null) {
            c1x4.A0E.A01();
            c1x4.A01();
        }
        c0t4.A03();
        C18620u2.A01(new C1X7());
        A03();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        long nanoTime = System.nanoTime();
        super.onDraw(canvas);
        canvas.drawColor(-987675);
        this.A0X = true;
        int size = this.A0M.A0W.size();
        for (int i = 0; i < size; i++) {
            C0SK c0sk = (C0SK) this.A0M.A0W.get(i);
            if (c0sk.A04) {
                c0sk.A0B(canvas);
                if (c0sk instanceof C39041pT) {
                    this.A0X = (((AbstractC29401Wq) c0sk).A08 == 0) & this.A0X;
                }
            }
        }
        if (this.A0X) {
            C0T4 c0t4 = this.A0M;
            if (this.A0d) {
                C1D0 c1d0 = c0t4.A0T;
                if (this.A0N != null) {
                    if (c1d0.A03 != null) {
                        this.A0d = false;
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
        }
        long nanoTime2 = System.nanoTime();
        if (this.A0N != null) {
            C18680u8.A0D.A03(nanoTime2 - nanoTime);
            if (this.A0H > 0) {
                new HashMap<String, Object>(nanoTime2) { // from class: X.0tg
                    public final /* synthetic */ long val$currentTime;
                    public final /* synthetic */ String val$surface = null;

                    {
                        C06390Sx.this = this;
                        this.val$currentTime = nanoTime2;
                        put("duration", Long.valueOf(nanoTime2 - this.A0H));
                        put("surface", "unknown");
                    }
                };
                this.A0H = 0L;
            }
            if (this.A0K > 0) {
                new HashMap<String, Object>(nanoTime2) { // from class: X.0th
                    public final /* synthetic */ long val$currentTime;
                    public final /* synthetic */ String val$surface = null;

                    {
                        C06390Sx.this = this;
                        this.val$currentTime = nanoTime2;
                        put("duration", Long.valueOf(nanoTime2 - this.A0K));
                        put("surface", "unknown");
                    }
                };
                this.A0K = 0L;
                return;
            }
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
        if (r1 != false) goto L7;
     */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06390Sx.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.containsKey("zoom")) {
                if (bundle.containsKey("parentBundle")) {
                    super.onRestoreInstanceState(bundle.getParcelable("parentBundle"));
                }
                A0F(bundle);
                return;
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        if (this.A0g) {
            return super.onSaveInstanceState();
        }
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        A0G(bundle);
        bundle.putParcelable("parentBundle", onSaveInstanceState);
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:271:0x0044, code lost:
        if (java.lang.Math.abs(r8 - r5.A0C) <= r13) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x007f, code lost:
        if (java.lang.Math.abs(r8 - r5.A01) <= r1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0320, code lost:
        if (java.lang.Math.abs(r5.A0E - r5.A0C) <= r2) goto L123;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0356 A[Catch: all -> 0x04ce, TryCatch #0 {all -> 0x04ce, blocks: (B:264:0x0004, B:268:0x002b, B:270:0x003a, B:394:0x02ab, B:395:0x02b8, B:397:0x02bf, B:398:0x02d4, B:400:0x02dd, B:401:0x02eb, B:403:0x02ef, B:504:0x049d, B:505:0x04b4, B:507:0x04b8, B:508:0x04bb, B:406:0x02f9, B:408:0x0305, B:410:0x0315, B:421:0x0335, B:423:0x0345, B:442:0x0398, B:444:0x039c, B:445:0x039f, B:451:0x03a9, B:453:0x03b0, B:455:0x03b5, B:457:0x03cc, B:459:0x03d0, B:461:0x03dd, B:463:0x03e1, B:464:0x03ea, B:503:0x049c, B:465:0x03ed, B:467:0x03f6, B:469:0x040f, B:470:0x0411, B:472:0x041d, B:476:0x0426, B:480:0x0434, B:482:0x0445, B:484:0x0449, B:486:0x044d, B:488:0x045e, B:489:0x0464, B:497:0x0487, B:499:0x0496, B:501:0x049a, B:490:0x0467, B:491:0x0469, B:493:0x0474, B:475:0x0425, B:494:0x0476, B:496:0x0484, B:426:0x034c, B:428:0x0352, B:430:0x0356, B:432:0x0368, B:441:0x0395, B:434:0x0370, B:436:0x037a, B:438:0x0382, B:440:0x0390, B:448:0x03a5, B:413:0x0324, B:415:0x0328, B:272:0x0046, B:275:0x0051, B:277:0x005b, B:279:0x0066, B:281:0x0075, B:284:0x008a, B:286:0x00a2, B:287:0x00a8, B:290:0x00cc, B:292:0x00d6, B:297:0x00e1, B:299:0x00e5, B:301:0x00e9, B:288:0x00c6, B:283:0x0081, B:304:0x00f1, B:306:0x0102, B:308:0x010f, B:310:0x0113, B:371:0x0277, B:311:0x011f, B:313:0x0133, B:315:0x0139, B:316:0x013e, B:318:0x0142, B:319:0x0147, B:321:0x014d, B:323:0x0158, B:325:0x0166, B:327:0x0171, B:329:0x0185, B:332:0x018c, B:334:0x0190, B:336:0x0197, B:373:0x0279, B:337:0x01ab, B:339:0x01af, B:341:0x01b3, B:342:0x01c4, B:344:0x01d0, B:346:0x01d4, B:348:0x01de, B:350:0x01e2, B:352:0x01e6, B:377:0x027d, B:353:0x01f0, B:355:0x01f4, B:357:0x01fe, B:359:0x0202, B:375:0x027b, B:360:0x020c, B:362:0x0210, B:364:0x023a, B:366:0x0248, B:369:0x0275, B:380:0x0281, B:384:0x028a, B:386:0x0290, B:389:0x0299, B:391:0x029f), top: B:514:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x039c A[Catch: all -> 0x04ce, TryCatch #0 {all -> 0x04ce, blocks: (B:264:0x0004, B:268:0x002b, B:270:0x003a, B:394:0x02ab, B:395:0x02b8, B:397:0x02bf, B:398:0x02d4, B:400:0x02dd, B:401:0x02eb, B:403:0x02ef, B:504:0x049d, B:505:0x04b4, B:507:0x04b8, B:508:0x04bb, B:406:0x02f9, B:408:0x0305, B:410:0x0315, B:421:0x0335, B:423:0x0345, B:442:0x0398, B:444:0x039c, B:445:0x039f, B:451:0x03a9, B:453:0x03b0, B:455:0x03b5, B:457:0x03cc, B:459:0x03d0, B:461:0x03dd, B:463:0x03e1, B:464:0x03ea, B:503:0x049c, B:465:0x03ed, B:467:0x03f6, B:469:0x040f, B:470:0x0411, B:472:0x041d, B:476:0x0426, B:480:0x0434, B:482:0x0445, B:484:0x0449, B:486:0x044d, B:488:0x045e, B:489:0x0464, B:497:0x0487, B:499:0x0496, B:501:0x049a, B:490:0x0467, B:491:0x0469, B:493:0x0474, B:475:0x0425, B:494:0x0476, B:496:0x0484, B:426:0x034c, B:428:0x0352, B:430:0x0356, B:432:0x0368, B:441:0x0395, B:434:0x0370, B:436:0x037a, B:438:0x0382, B:440:0x0390, B:448:0x03a5, B:413:0x0324, B:415:0x0328, B:272:0x0046, B:275:0x0051, B:277:0x005b, B:279:0x0066, B:281:0x0075, B:284:0x008a, B:286:0x00a2, B:287:0x00a8, B:290:0x00cc, B:292:0x00d6, B:297:0x00e1, B:299:0x00e5, B:301:0x00e9, B:288:0x00c6, B:283:0x0081, B:304:0x00f1, B:306:0x0102, B:308:0x010f, B:310:0x0113, B:371:0x0277, B:311:0x011f, B:313:0x0133, B:315:0x0139, B:316:0x013e, B:318:0x0142, B:319:0x0147, B:321:0x014d, B:323:0x0158, B:325:0x0166, B:327:0x0171, B:329:0x0185, B:332:0x018c, B:334:0x0190, B:336:0x0197, B:373:0x0279, B:337:0x01ab, B:339:0x01af, B:341:0x01b3, B:342:0x01c4, B:344:0x01d0, B:346:0x01d4, B:348:0x01de, B:350:0x01e2, B:352:0x01e6, B:377:0x027d, B:353:0x01f0, B:355:0x01f4, B:357:0x01fe, B:359:0x0202, B:375:0x027b, B:360:0x020c, B:362:0x0210, B:364:0x023a, B:366:0x0248, B:369:0x0275, B:380:0x0281, B:384:0x028a, B:386:0x0290, B:389:0x0299, B:391:0x029f), top: B:514:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x03a9 A[Catch: all -> 0x04ce, TryCatch #0 {all -> 0x04ce, blocks: (B:264:0x0004, B:268:0x002b, B:270:0x003a, B:394:0x02ab, B:395:0x02b8, B:397:0x02bf, B:398:0x02d4, B:400:0x02dd, B:401:0x02eb, B:403:0x02ef, B:504:0x049d, B:505:0x04b4, B:507:0x04b8, B:508:0x04bb, B:406:0x02f9, B:408:0x0305, B:410:0x0315, B:421:0x0335, B:423:0x0345, B:442:0x0398, B:444:0x039c, B:445:0x039f, B:451:0x03a9, B:453:0x03b0, B:455:0x03b5, B:457:0x03cc, B:459:0x03d0, B:461:0x03dd, B:463:0x03e1, B:464:0x03ea, B:503:0x049c, B:465:0x03ed, B:467:0x03f6, B:469:0x040f, B:470:0x0411, B:472:0x041d, B:476:0x0426, B:480:0x0434, B:482:0x0445, B:484:0x0449, B:486:0x044d, B:488:0x045e, B:489:0x0464, B:497:0x0487, B:499:0x0496, B:501:0x049a, B:490:0x0467, B:491:0x0469, B:493:0x0474, B:475:0x0425, B:494:0x0476, B:496:0x0484, B:426:0x034c, B:428:0x0352, B:430:0x0356, B:432:0x0368, B:441:0x0395, B:434:0x0370, B:436:0x037a, B:438:0x0382, B:440:0x0390, B:448:0x03a5, B:413:0x0324, B:415:0x0328, B:272:0x0046, B:275:0x0051, B:277:0x005b, B:279:0x0066, B:281:0x0075, B:284:0x008a, B:286:0x00a2, B:287:0x00a8, B:290:0x00cc, B:292:0x00d6, B:297:0x00e1, B:299:0x00e5, B:301:0x00e9, B:288:0x00c6, B:283:0x0081, B:304:0x00f1, B:306:0x0102, B:308:0x010f, B:310:0x0113, B:371:0x0277, B:311:0x011f, B:313:0x0133, B:315:0x0139, B:316:0x013e, B:318:0x0142, B:319:0x0147, B:321:0x014d, B:323:0x0158, B:325:0x0166, B:327:0x0171, B:329:0x0185, B:332:0x018c, B:334:0x0190, B:336:0x0197, B:373:0x0279, B:337:0x01ab, B:339:0x01af, B:341:0x01b3, B:342:0x01c4, B:344:0x01d0, B:346:0x01d4, B:348:0x01de, B:350:0x01e2, B:352:0x01e6, B:377:0x027d, B:353:0x01f0, B:355:0x01f4, B:357:0x01fe, B:359:0x0202, B:375:0x027b, B:360:0x020c, B:362:0x0210, B:364:0x023a, B:366:0x0248, B:369:0x0275, B:380:0x0281, B:384:0x028a, B:386:0x0290, B:389:0x0299, B:391:0x029f), top: B:514:0x0004 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r28) {
        /*
            Method dump skipped, instructions count: 1243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06390Sx.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            A02();
        } else {
            A03();
        }
    }

    @Override // X.InterfaceC06400Sy
    public void setCurrentAttribution(EnumSet enumSet) {
        if (enumSet.equals(this.A0V)) {
            return;
        }
        this.A0V = enumSet;
        InterfaceC18420ti interfaceC18420ti = this.A0P;
        if (interfaceC18420ti != null) {
            ((C1D0) interfaceC18420ti).A02.A07 = enumSet;
        }
    }

    public final void setMapEventHandler(C0u9 c0u9) {
        if (c0u9 == null) {
            c0u9 = C0u9.A00;
        }
        this.A0U = c0u9;
    }

    public void setOnAttributionChangeListener(InterfaceC18420ti interfaceC18420ti) {
        this.A0P = interfaceC18420ti;
    }

    public void setOnFirstTileLoadedCallback(InterfaceC18430tj interfaceC18430tj) {
        this.A0Q = interfaceC18430tj;
    }
}
