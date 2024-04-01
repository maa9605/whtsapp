package X;

import android.hardware.Camera;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.42l  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C882642l {
    public volatile AnonymousClass443 A03;
    public final C882942o A02 = new C882942o();
    public final AnonymousClass427 A00 = new AnonymousClass427();
    public final AnonymousClass427 A01 = new AnonymousClass427();

    public void A00(Camera camera, boolean z) {
        C882942o c882942o = this.A02;
        ReentrantLock reentrantLock = c882942o.A01;
        reentrantLock.lock();
        if (camera != null) {
            try {
                if (!c882942o.A01()) {
                    camera.stopPreview();
                    reentrantLock.lock();
                    c882942o.A00 = 0;
                    reentrantLock.unlock();
                    if (z) {
                        AnonymousClass427 anonymousClass427 = this.A01;
                        if (!anonymousClass427.A00.isEmpty()) {
                            final List list = anonymousClass427.A00;
                            C44J.A00(new Runnable() { // from class: X.42j
                                @Override // java.lang.Runnable
                                public void run() {
                                    List list2 = list;
                                    if (0 < list2.size()) {
                                        list2.get(0);
                                        throw null;
                                    }
                                }
                            });
                        }
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
