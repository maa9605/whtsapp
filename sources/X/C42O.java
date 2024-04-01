package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import java.util.concurrent.Callable;

/* renamed from: X.42O  reason: invalid class name */
/* loaded from: classes3.dex */
public class C42O implements Callable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ C887344g A01;

    public C42O(C887344g c887344g, Rect rect) {
        this.A01 = c887344g;
        this.A00 = rect;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        final Point point;
        C887344g c887344g = this.A01;
        if (c887344g.isConnected()) {
            c887344g.A0C();
            final C887444h c887444h = c887344g.A0L;
            Rect rect = this.A00;
            final AnonymousClass429 anonymousClass429 = new AnonymousClass429() { // from class: X.44d
                @Override // X.AnonymousClass429
                public void AKY(AnonymousClass428 anonymousClass428, Point point2) {
                    final C887344g c887344g2 = C42O.this.A01;
                    if (c887344g2.A0b) {
                        return;
                    }
                    synchronized (c887344g2) {
                        c887344g2.A0C();
                        c887344g2.A0Z = c887344g2.A0R.A00(new Callable() { // from class: X.42P
                            @Override // java.util.concurrent.Callable
                            public Object call() {
                                C887344g c887344g3 = C887344g.this;
                                if (c887344g3.isConnected() && !c887344g3.A0b) {
                                    C887444h c887444h2 = c887344g3.A0L;
                                    if (c887444h2.A00) {
                                        c887444h2.A05.A04("Focus reset must happen on the Optic thread.");
                                        if (c887444h2.A08) {
                                            c887444h2.A06 = false;
                                            c887444h2.A07 = false;
                                            c887444h2.A00(((C882242h) c887444h2).A01, AnonymousClass428.CANCELLED, null);
                                            ((C882242h) c887444h2).A00.cancelAutoFocus();
                                            AnonymousClass455 A00 = c887444h2.A04.A00(c887444h2.A03);
                                            ((AbstractC886543y) A00).A00.A01(AbstractC886243v.A0A, null);
                                            ((AbstractC886543y) A00).A00.A01(AbstractC886243v.A0V, null);
                                            A00.A01();
                                            A00.A00();
                                        }
                                    }
                                }
                                return null;
                            }
                        }, "reset_focus", 2000L);
                    }
                }
            };
            c887444h.A05.A04("Focus requests must be on the Optic thread. ");
            if (c887444h.A08 && c887444h.A08) {
                C885343m c885343m = c887444h.A04;
                AbstractC885543o A01 = c885343m.A01(c887444h.A03);
                C885443n c885443n = AbstractC885543o.A0E;
                if (((Boolean) A01.A00(c885443n)).booleanValue() || ((Boolean) A01.A00(AbstractC885543o.A02)).booleanValue()) {
                    if (c887444h.A07) {
                        ((C882242h) c887444h).A00.cancelAutoFocus();
                    }
                    c887444h.A06 = false;
                    c887444h.A07 = true;
                    c887444h.A01 = false;
                    if (rect == null) {
                        point = null;
                    } else {
                        AnonymousClass455 A00 = c885343m.A00(c887444h.A03);
                        if (!((Boolean) c885343m.A01(c887444h.A03).A00(c885443n)).booleanValue()) {
                            point = new Point(0, 0);
                        } else if (A00 != null) {
                            ((AbstractC886543y) A00).A00.A01(AbstractC886243v.A0A, C885943s.A04(rect));
                            point = new Point(rect.centerX(), rect.centerY());
                        } else {
                            throw null;
                        }
                        ((AbstractC886543y) A00).A00.A01(AbstractC886243v.A0B, 1);
                        A00.A00();
                    }
                    c887444h.A00(((C882242h) c887444h).A01, AnonymousClass428.FOCUSING, point);
                    ((C882242h) c887444h).A00.autoFocus(new Camera.AutoFocusCallback() { // from class: X.42g
                        @Override // android.hardware.Camera.AutoFocusCallback
                        public void onAutoFocus(boolean z, Camera camera) {
                            AnonymousClass428 anonymousClass428;
                            C887444h c887444h2 = C887444h.this;
                            c887444h2.A06 = z;
                            c887444h2.A07 = false;
                            if (c887444h2.A01) {
                                c887444h2.A00 = false;
                            }
                            if (z) {
                                anonymousClass428 = AnonymousClass428.SUCCESS;
                            } else {
                                anonymousClass428 = AnonymousClass428.FAILED;
                            }
                            Point point2 = point;
                            c887444h2.A00(((C882242h) c887444h2).A01, anonymousClass428, point2);
                            c887444h2.A00(anonymousClass429, anonymousClass428, point2);
                        }
                    });
                }
            }
        }
        return null;
    }
}
