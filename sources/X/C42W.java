package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.42W  reason: invalid class name */
/* loaded from: classes3.dex */
public class C42W implements Callable {
    public final /* synthetic */ C44V A00;
    public final /* synthetic */ C887344g A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public C42W(C887344g c887344g, C44V c44v, boolean z, boolean z2) {
        this.A01 = c887344g;
        this.A00 = c44v;
        this.A02 = z;
        this.A03 = z2;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C887344g c887344g = this.A01;
        ((Number) c887344g.A06().A00(AbstractC886243v.A0X)).intValue();
        AnonymousClass446.A00();
        final int A00 = c887344g.A06.A00(c887344g.A0V);
        C885343m c885343m = c887344g.A0P;
        AnonymousClass455 A002 = c885343m.A00(c887344g.A06);
        ((AbstractC886543y) A002).A00.A01(AbstractC886243v.A0W, Integer.valueOf(A00));
        A002.A00();
        final Rect rect = (Rect) c885343m.A02(c887344g.A06).A00(AbstractC886243v.A0d);
        c887344g.A0R.A05(c887344g.A0Q.A03, new Runnable() { // from class: X.42U
            @Override // java.lang.Runnable
            public void run() {
                C44V c44v = C42W.this.A00;
                c44v.A00.A0J.A00(5, c44v.A01);
            }
        });
        c887344g.A0W.takePicture(this.A02 ? null : C887344g.A0d, null, null, new Camera.PictureCallback() { // from class: X.42V
            @Override // android.hardware.Camera.PictureCallback
            public void onPictureTaken(final byte[] bArr, Camera camera) {
                final Rect rect2 = null;
                if (bArr != null) {
                    int A003 = C44M.A00(bArr);
                    rect2 = C07K.A0S(bArr);
                    C07K.A15(A00, A003, rect2, rect);
                }
                C42W c42w = C42W.this;
                final C887344g c887344g2 = c42w.A01;
                final Rect rect3 = rect;
                final C44V c44v = c42w.A00;
                c887344g2.A0R.A05(c887344g2.A0Q.A03, new Runnable() { // from class: X.42Z
                    @Override // java.lang.Runnable
                    public void run() {
                        byte[] bArr2 = bArr;
                        if (bArr2 != null && bArr2.length != 0) {
                            C44A c44a = new C44A(rect2, rect3, C887344g.this.A06, null, null, null, null, null, null);
                            C44V c44v2 = c44v;
                            c44v2.A00.A0J.A00(6, new Object[]{c44v2.A01, bArr2, c44a});
                            AnonymousClass449 A004 = AnonymousClass449.A00();
                            A004.A02(0, A004.A02);
                            return;
                        }
                        c44v.A00(new RuntimeException("Photo taking returned no jpeg data!"));
                    }
                });
                c887344g2.A09();
                if (rect2 != null) {
                    rect2.width();
                    rect2.height();
                    AnonymousClass446.A00();
                }
            }
        });
        C882942o c882942o = c887344g.A0M.A02;
        ReentrantLock reentrantLock = c882942o.A01;
        reentrantLock.lock();
        try {
            c882942o.A00 = 0;
            reentrantLock.unlock();
            AtomicBoolean atomicBoolean = c887344g.A0U;
            synchronized (atomicBoolean) {
                if (C44J.A01()) {
                    throw new RuntimeException("Some how photo taking call is happening on the UI Thread!!");
                }
                while (!c887344g.A0a) {
                    try {
                        atomicBoolean.wait();
                    } catch (InterruptedException e) {
                        Log.e("Camera1Device", "Interrupted while waiting on Camera.takePicture", e);
                    }
                }
            }
            C887344g.A04(c887344g, this.A03);
            return null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
