package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.HandlerThread;
import android.view.OrientationEventListener;
import android.view.TextureView;
import android.view.WindowManager;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.44W */
/* loaded from: classes3.dex */
public class C44W implements TextureView.SurfaceTextureListener {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C44Q A05;
    public C885643p A06;
    public AnonymousClass359 A07;
    public AnonymousClass473 A08;
    public AnonymousClass475 A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Context A0D;
    public final HandlerThread A0E;
    public final OrientationEventListener A0F;
    public final TextureView A0G;
    public final C44S A0H;
    public final C44T A0I;
    public final C41y A0J;
    public final C44Y A0K;
    public final AnonymousClass422 A0L;
    public final AnonymousClass423 A0M;
    public final AnonymousClass427 A0N;
    public final AnonymousClass429 A0O;
    public final C42A A0P;
    public final AbstractC886844b A0Q;
    public final AbstractC886844b A0R;
    public final Object A0S;
    public final String A0T;
    public volatile AnonymousClass474 A0U;
    public volatile boolean A0V;

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C44W(Context context, C44Y c44y, boolean z) {
        C888244p c888244p;
        AnonymousClass422 anonymousClass422 = AnonymousClass422.CAMERA2;
        AnonymousClass422 anonymousClass4222 = AnonymousClass422.CAMERA1;
        this.A0N = new AnonymousClass427();
        this.A0S = new Object();
        this.A02 = -1;
        this.A01 = -1;
        this.A0A = true;
        this.A0Q = new C45E(this);
        this.A0R = new C45F(this);
        this.A0O = new AnonymousClass429() { // from class: X.44R
            {
                C44W.this = this;
            }

            @Override // X.AnonymousClass429
            public void AKY(AnonymousClass428 anonymousClass428, Point point) {
                C44W c44w = C44W.this;
                AnonymousClass475 anonymousClass475 = c44w.A09;
                if (anonymousClass475 == null) {
                    return;
                }
                int ordinal = anonymousClass428.ordinal();
                if (ordinal == 0) {
                    if (point == null) {
                        return;
                    }
                    c44w.A0J.A00(11, new Object[]{anonymousClass475, point});
                } else if (ordinal == 1) {
                    c44w.A0J.A00(14, anonymousClass475);
                } else if (ordinal == 3) {
                    if (point == null) {
                        return;
                    }
                    c44w.A0J.A00(12, new Object[]{anonymousClass475, point});
                } else if (ordinal != 4 && ordinal != 5) {
                } else {
                    c44w.A0J.A00(13, anonymousClass475);
                }
            }
        };
        this.A0H = new C44S(this);
        this.A0I = new C44T(this);
        this.A0P = new C42A() { // from class: X.44U
            {
                C44W.this = this;
            }

            @Override // X.C42A
            public void ANJ(AnonymousClass442 anonymousClass442) {
                C44B c44b;
                C44W c44w = C44W.this;
                AnonymousClass359 anonymousClass359 = c44w.A07;
                AnonymousClass423 anonymousClass423 = c44w.A0M;
                C44X[] c44xArr = null;
                if (anonymousClass423 != null && anonymousClass423.isConnected()) {
                    try {
                        c44b = anonymousClass423.A8j();
                    } catch (AnonymousClass425 unused) {
                    }
                    if (anonymousClass359 == null && c44b != null) {
                        c44b.A01();
                        int i = c44w.A02;
                        if (anonymousClass442 != null) {
                            AnonymousClass441[] anonymousClass441Arr = anonymousClass442.A0B;
                            if (anonymousClass441Arr != null) {
                                int length = anonymousClass441Arr.length;
                                c44xArr = new C44X[length];
                                for (int i2 = 0; i2 < length; i2++) {
                                    AnonymousClass441 anonymousClass441 = anonymousClass441Arr[i2];
                                    if (anonymousClass441 != null) {
                                        c44xArr[i2] = new C44X(anonymousClass441.A02, anonymousClass441.A01);
                                    }
                                }
                            }
                            C881241v c881241v = new C881241v(anonymousClass442.A09, c44xArr, anonymousClass442.A02, anonymousClass442.A00);
                            C46V c46v = anonymousClass359.A00;
                            if (c46v.A08) {
                                Object obj = c46v.A06;
                                synchronized (obj) {
                                    if (c46v.A07) {
                                        C46U c46u = c46v.A02;
                                        byte[] bArr = c881241v.A02;
                                        InterfaceC881141u[] interfaceC881141uArr = c881241v.A03;
                                        int i3 = c881241v.A01;
                                        int i4 = c881241v.A00;
                                        c46u.A02 = bArr;
                                        c46u.A03 = interfaceC881141uArr;
                                        c46u.A01 = i3;
                                        c46u.A00 = i4;
                                        c46v.A09 = true;
                                        obj.notify();
                                        while (c46v.A07 && c46v.A08) {
                                            try {
                                                obj.wait();
                                            } catch (InterruptedException unused2) {
                                            }
                                        }
                                        c46v.A09 = false;
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
                c44b = null;
                if (anonymousClass359 == null) {
                }
            }
        };
        this.A0D = context.getApplicationContext();
        this.A0T = "WhatsAppCamera";
        this.A0L = z ? anonymousClass422 : anonymousClass4222;
        this.A0K = c44y;
        this.A0J = new C41y();
        HandlerThread handlerThread = new HandlerThread("Simple-Lite-Camera-Callback-Thread");
        this.A0E = handlerThread;
        handlerThread.start();
        AnonymousClass426 A00 = AnonymousClass426.A00();
        Context context2 = this.A0D;
        AnonymousClass422 anonymousClass4223 = this.A0L;
        if (A00 != null) {
            if (anonymousClass4223 == anonymousClass4222) {
                C44I c44i = A00.A01;
                C44E c44e = A00.A00;
                if (C887344g.A0e == null) {
                    synchronized (C887344g.class) {
                        if (C887344g.A0e == null) {
                            C887344g.A0e = new C887344g(c44i, c44e, context2);
                        }
                    }
                } else if (C887344g.A0e.A0R == c44i) {
                    if (C887344g.A0e.A0Q != c44e) {
                        throw new RuntimeException("SessionManager instance has changed!");
                    }
                } else {
                    throw new RuntimeException("ThreadManager instance has changed!");
                }
                C887344g c887344g = C887344g.A0e;
                c887344g.A0D = true;
                c888244p = c887344g;
            } else if (anonymousClass4223 != anonymousClass422) {
                StringBuilder sb = new StringBuilder("Invalid Camera API: ");
                sb.append(anonymousClass4223);
                throw new RuntimeException(sb.toString());
            } else if (context2 != null) {
                C44I c44i2 = A00.A01;
                C44E c44e2 = A00.A00;
                if (C888244p.A0o == null) {
                    synchronized (C888244p.class) {
                        if (C888244p.A0o == null) {
                            C888244p.A0o = new C888244p(c44i2, c44e2, context2);
                        }
                    }
                } else if (C888244p.A0o.A0b == c44i2) {
                    if (C888244p.A0o.A0a != c44e2) {
                        throw new RuntimeException("SessionManager instance has changed!");
                    }
                } else {
                    throw new RuntimeException("ThreadManager instance has changed!");
                }
                C888244p c888244p2 = C888244p.A0o;
                c888244p2.A0J = true;
                c888244p = c888244p2;
            } else {
                throw new NullPointerException("Context must be provided for Camera2.");
            }
            this.A0M = c888244p;
            this.A00 = !c888244p.AEO(C07K.A0m(0)) ? 1 : 0;
            this.A0C = true;
            TextureView textureView = new TextureView(this.A0D);
            this.A0G = textureView;
            textureView.setSurfaceTextureListener(this);
            this.A0F = new OrientationEventListener(this.A0D) { // from class: X.41x
                {
                    C44W.this = this;
                }

                @Override // android.view.OrientationEventListener
                public void onOrientationChanged(int i) {
                    int i2 = ((((i + 45) + 360) / 90) % 4) * 90;
                    C44W c44w = C44W.this;
                    int A002 = c44w.A00();
                    if (c44w.A01 == i2 && c44w.A02 == A002) {
                        return;
                    }
                    c44w.A01 = i2;
                    c44w.A0M.AMa(i2);
                    c44w.A03(c44w.A06);
                }
            };
            return;
        }
        throw null;
    }

    public final int A00() {
        WindowManager windowManager = (WindowManager) this.A0D.getSystemService("window");
        if (windowManager != null) {
            return windowManager.getDefaultDisplay().getRotation();
        }
        return 0;
    }

    public final AbstractC885543o A01() {
        AnonymousClass423 anonymousClass423 = this.A0M;
        if (anonymousClass423 == null || !anonymousClass423.isConnected()) {
            return null;
        }
        try {
            return anonymousClass423.A8m();
        } catch (AnonymousClass425 unused) {
            return null;
        }
    }

    public void A02(int i) {
        if (this.A00 != 1) {
            C886343w c886343w = new C886343w();
            c886343w.A01(AbstractC886243v.A09, Integer.valueOf(C07K.A05(i)));
            this.A0M.AGW(c886343w.A00(), new C45I());
        }
    }

    public final void A03(C885643p c885643p) {
        AnonymousClass423 anonymousClass423 = this.A0M;
        if (!anonymousClass423.isConnected() || c885643p == null) {
            return;
        }
        int A00 = A00();
        if (this.A02 == A00) {
            this.A0J.A00(15, new Object[]{this, this.A06, Integer.valueOf(this.A04), Integer.valueOf(this.A03)});
            return;
        }
        this.A02 = A00;
        anonymousClass423.ATh(A00, new C45C(this));
    }

    public void A04(AnonymousClass359 anonymousClass359) {
        if (!this.A0C) {
            AnonymousClass423 anonymousClass423 = this.A0M;
            if (anonymousClass423.isConnected()) {
                if (anonymousClass359 != null) {
                    anonymousClass423.A5G(this.A0P);
                } else if (this.A07 != null) {
                    anonymousClass423.ARP(this.A0P);
                }
            }
        }
        this.A07 = anonymousClass359;
    }

    public final boolean A05() {
        AbstractC885543o A01 = A01();
        return A01 != null && ((Boolean) A01.A00(AbstractC885543o.A0J)).booleanValue();
    }

    public boolean A06(int i) {
        List list;
        AbstractC885543o A01 = A01();
        if (A01 == null || (list = (List) A01.A00(AbstractC885543o.A0V)) == null) {
            return false;
        }
        return list.contains(Integer.valueOf(C07K.A05(i)));
    }

    public void finalize() {
        if (Build.VERSION.SDK_INT >= 18) {
            this.A0E.quitSafely();
        } else {
            this.A0E.quit();
        }
        super.finalize();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C44Y c44y = this.A0K;
        c44y.A05 = i;
        c44y.A03 = i2;
        synchronized (c44y.A0A) {
            c44y.A0C = surfaceTexture;
            c44y.A09.countDown();
        }
        onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C41z c41z;
        C44Y c44y = this.A0K;
        synchronized (c44y.A0A) {
            if (c44y.A0C != null) {
                c44y.A0B = null;
                c44y.A0C = null;
                c44y.A09 = new CountDownLatch(1);
            }
            if (C44Y.A0E && (c41z = c44y.A0D) != null) {
                c41z.A03(null, 0);
            }
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C44Y c44y = this.A0K;
        c44y.A05 = i;
        c44y.A03 = i2;
        this.A04 = i;
        this.A03 = i2;
        A03(this.A06);
    }
}
