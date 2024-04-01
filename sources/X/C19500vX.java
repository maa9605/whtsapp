package X;

import android.app.ActivityManager;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0vX */
/* loaded from: classes.dex */
public class C19500vX {
    public final int A00;
    public final C18860uS A01;
    public final InterfaceC18950ub A02;
    public final InterfaceC18980ue A03;
    public final C29651Xs A04;
    public final InterfaceC19480vV A05;
    public final C19520vZ A06;
    public final C19570ve A07;
    public final C19760vx A08;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0vZ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1Xs] */
    public C19500vX(C19490vW c19490vW) {
        C1XN c1xn;
        C0w3.A00();
        this.A06 = new Object() { // from class: X.0vZ
        };
        Context context = c19490vW.A05;
        this.A02 = new InterfaceC18950ub((ActivityManager) context.getSystemService("activity")) { // from class: X.1Xw
            public static final long A01 = TimeUnit.MINUTES.toMillis(5);
            public final ActivityManager A00;

            {
                this.A00 = r1;
            }

            @Override // X.InterfaceC18950ub
            public Object get() {
                int min = Math.min(this.A00.getMemoryClass() * 1048576, Integer.MAX_VALUE);
                int i = 4194304;
                if (min >= 33554432) {
                    i = 6291456;
                    if (min >= 67108864) {
                        i = min >> 2;
                    }
                }
                return new C19420vP(i, A01);
            }
        };
        this.A04 = new Object() { // from class: X.1Xs
        };
        synchronized (C19410vO.class) {
            if (C19410vO.A00 == null) {
                C19410vO.A00 = new C19410vO();
            }
        }
        C07K.A1N(context);
        synchronized (C19430vQ.class) {
            if (C19430vQ.A00 == null) {
                C19430vQ.A00 = new C19430vQ();
            }
        }
        try {
            C0w3.A00();
            C18860uS c18860uS = new C18860uS(new C18850uR(context));
            C0w3.A00();
            this.A01 = c18860uS;
            synchronized (C1XN.class) {
                c1xn = C1XN.A00;
                if (c1xn == null) {
                    c1xn = new C1XN();
                    C1XN.A00 = c1xn;
                }
            }
            this.A03 = c1xn;
            this.A00 = 30000;
            C0w3.A00();
            Executors.newFixedThreadPool(3);
            C0w3.A00();
            new Object() { // from class: X.0vv
            };
            C19760vx c19760vx = new C19760vx(new C19750vw());
            this.A08 = c19760vx;
            this.A05 = new InterfaceC19480vV(c19760vx.A08.A03.A00) { // from class: X.1Xz
                public final Executor A00;
                public final Executor A01;

                {
                    Executors.newFixedThreadPool(2, new ThreadFactoryC19560vd("FrescoIoBoundExecutor"));
                    this.A00 = Executors.newFixedThreadPool(r4, new ThreadFactoryC19560vd("FrescoDecodeExecutor"));
                    Executors.newFixedThreadPool(r4, new ThreadFactoryC19560vd("FrescoBackgroundExecutor"));
                    this.A01 = Executors.newFixedThreadPool(1, new ThreadFactoryC19560vd("FrescoLightWeightBackgroundExecutor"));
                }

                @Override // X.InterfaceC19480vV
                public Executor A7w() {
                    return this.A00;
                }

                @Override // X.InterfaceC19480vV
                public Executor A7x() {
                    return this.A01;
                }
            };
            this.A07 = c19490vW.A01;
        } finally {
            C0w3.A00();
        }
    }
}
