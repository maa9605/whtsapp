package X;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.42r  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C883242r implements Camera.OnZoomChangeListener {
    public int A00;
    public int A01;
    public Camera A02;
    public C44B A03;
    public final C885343m A06;
    public final C44I A07;
    public volatile int A09;
    public volatile List A0A;
    public volatile boolean A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;
    public final AnonymousClass427 A05 = new AnonymousClass427();
    public final Handler A04 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.42p
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                C883242r c883242r = C883242r.this;
                if (c883242r.A0B) {
                    List list = c883242r.A0A;
                    int i = message.arg1;
                    if (list != null && i < list.size()) {
                        list.get(i);
                        list.get(list.size() - 1);
                        List list2 = c883242r.A05.A00;
                        if (0 < list2.size()) {
                            list2.get(0);
                            throw null;
                        }
                    }
                    return true;
                }
            }
            if (message.what == 2) {
                List list3 = C883242r.this.A05.A00;
                if (0 < list3.size()) {
                    list3.get(0);
                    throw null;
                }
                return true;
            }
            return false;
        }
    });
    public final Callable A08 = new Callable() { // from class: X.42q
        @Override // java.util.concurrent.Callable
        public Object call() {
            C883242r c883242r = C883242r.this;
            c883242r.A00(c883242r.A01);
            return null;
        }
    };

    public C883242r(C885343m c885343m, C44I c44i) {
        this.A06 = c885343m;
        this.A07 = c44i;
    }

    public void A00(int i) {
        if (!this.A0B || i == this.A09 || i > this.A00 || i < 0) {
            return;
        }
        if (!C44J.A01()) {
            if (this.A0D) {
                synchronized (this) {
                    this.A01 = i;
                    if (this.A0E) {
                        if (!this.A0C) {
                            this.A0C = true;
                            this.A02.stopSmoothZoom();
                        }
                    } else {
                        this.A0E = true;
                        this.A02.startSmoothZoom(i);
                    }
                }
                return;
            }
            try {
                AnonymousClass455 A00 = this.A06.A00(this.A03);
                ((AbstractC886543y) A00).A00.A01(AbstractC886243v.A0k, Integer.valueOf(i));
                A00.A00();
                onZoomChange(i, true, this.A02);
                return;
            } catch (Exception e) {
                RuntimeException runtimeException = new RuntimeException(C000200d.A0D("Failed to set zoom level to: ", i), e);
                synchronized (this) {
                    Handler handler = this.A04;
                    handler.sendMessage(handler.obtainMessage(2, runtimeException));
                    return;
                }
            }
        }
        throw new RuntimeException("Attempting to zoom on the UI thread!");
    }

    @Override // android.hardware.Camera.OnZoomChangeListener
    public synchronized void onZoomChange(int i, boolean z, Camera camera) {
        this.A09 = i;
        if (this.A0D) {
            this.A0E = z ? false : true;
            if (z) {
                this.A0C = false;
                if (this.A0B && this.A01 != i) {
                    this.A07.A06(this.A08, "update_zoom_level");
                }
            }
        }
        Handler handler = this.A04;
        handler.sendMessage(handler.obtainMessage(1, i, z ? 1 : 0));
    }
}
