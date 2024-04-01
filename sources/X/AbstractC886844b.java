package X;

import android.os.SystemClock;
import java.util.concurrent.Callable;

/* renamed from: X.44b */
/* loaded from: classes3.dex */
public abstract class AbstractC886844b {
    public void A00(final Exception exc) {
        if (this instanceof C45P) {
            final C45P c45p = (C45P) this;
            c45p.A01.A00(exc);
            c45p.A02.A09.A01(new Callable() { // from class: X.43Y
                @Override // java.util.concurrent.Callable
                public Object call() {
                    C45P c45p2 = c45p;
                    C884143a c884143a = c45p2.A02;
                    c884143a.A00();
                    C43C c43c = c884143a.A02;
                    if (c43c != null) {
                        c43c.A02(c45p2.A00, c45p2.A03);
                    }
                    C43T c43t = c884143a.A03;
                    if (c43t != null) {
                        c43t.A08(c45p2.A04, true);
                        return null;
                    }
                    return null;
                }
            }, "restart_preview_video_recording_failed", null);
        } else if (this instanceof C45L) {
            C45L c45l = (C45L) this;
            c45l.A01.A0b = false;
            AbstractC886844b abstractC886844b = c45l.A00;
            if (abstractC886844b != null) {
                abstractC886844b.A00(exc);
            }
        } else if (this instanceof C45K) {
            final C45K c45k = (C45K) this;
            C887344g c887344g = c45k.A01;
            C44I c44i = c887344g.A0R;
            c44i.A05(c887344g.A0Q.A03, new Runnable() { // from class: X.42X
                @Override // java.lang.Runnable
                public void run() {
                    c45k.A00.A00(exc);
                }
            });
            c44i.A06(new Callable() { // from class: X.42Y
                @Override // java.util.concurrent.Callable
                public Object call() {
                    C45K c45k2 = c45k;
                    C887344g.A04(c45k2.A01, c45k2.A02);
                    return null;
                }
            }, "take_photo_exception_restart_preview");
        } else if (this instanceof C45J) {
            C887444h c887444h = ((C45J) this).A00.A0L;
            c887444h.A00(((C882242h) c887444h).A01, AnonymousClass428.EXCEPTION, null);
        } else if (this instanceof C45I) {
        } else {
            if (this instanceof C45G) {
                C44W c44w = ((C45G) this).A00;
                synchronized (c44w.A0S) {
                    if (c44w.A0V) {
                        c44w.A0V = false;
                        AnonymousClass474 anonymousClass474 = c44w.A0U;
                        c44w.A0U = null;
                        if (anonymousClass474 != null) {
                            c44w.A0J.A00(10, new Object[]{anonymousClass474, exc});
                        }
                    }
                }
            } else if (this instanceof C45F) {
                C44W c44w2 = ((C45F) this).A00;
                if (!c44w2.A0C) {
                    c44w2.A0J.A00(3, new Object[]{c44w2.A0N.A00, exc});
                }
            } else if (this instanceof C45E) {
                C44W c44w3 = ((C45E) this).A00;
                if (!c44w3.A0C) {
                    c44w3.A0J.A00(3, new Object[]{c44w3.A0N.A00, exc});
                }
            } else if (!(this instanceof C45D)) {
                if (this instanceof C45C) {
                    return;
                }
                ((C45B) this).A00.A06 = null;
            } else {
                C45D c45d = (C45D) this;
                C44W c44w4 = c45d.A00;
                synchronized (c44w4.A0S) {
                    if (c44w4.A0V) {
                        c44w4.A0V = false;
                        AnonymousClass474 anonymousClass4742 = c44w4.A0U;
                        c44w4.A0U = null;
                        if (anonymousClass4742 != null) {
                            c44w4.A0J.A00(10, new Object[]{anonymousClass4742, exc});
                        }
                        if (c45d.A02) {
                            c45d.A01.countDown();
                        }
                    }
                }
            }
        }
    }

    public void A01(Object obj) {
        AnonymousClass423 anonymousClass423;
        if (this instanceof C45P) {
            C45P c45p = (C45P) this;
            c45p.A02.A00 = SystemClock.elapsedRealtime();
            c45p.A01.A01(obj);
        } else if (this instanceof C45L) {
            AbstractC886844b abstractC886844b = ((C45L) this).A00;
            if (abstractC886844b != null) {
                abstractC886844b.A01(obj);
            }
        } else if ((this instanceof C45K) || (this instanceof C45J) || (this instanceof C45I)) {
        } else {
            if (this instanceof C45G) {
                C44W c44w = ((C45G) this).A00;
                synchronized (c44w.A0S) {
                    if (c44w.A0V) {
                        AnonymousClass474 anonymousClass474 = c44w.A0U;
                        if (anonymousClass474 != null) {
                            c44w.A0J.A00(8, new Object[]{anonymousClass474, obj});
                        }
                    }
                }
            } else if (this instanceof C45F) {
                C885643p c885643p = (C885643p) obj;
                C44W c44w2 = ((C45F) this).A00;
                c44w2.A06 = c885643p;
                if (!c44w2.A0C && (anonymousClass423 = c44w2.A0M) != null && anonymousClass423.isConnected()) {
                    try {
                        C44B A8j = anonymousClass423.A8j();
                        if (A8j != null) {
                            c44w2.A00 = C07K.A0F(A8j);
                            c44w2.A03(c885643p);
                            c44w2.A0J.A00(2, c44w2.A0N.A00);
                        }
                    } catch (AnonymousClass425 unused) {
                    }
                }
            } else if (this instanceof C45E) {
                C885643p c885643p2 = (C885643p) obj;
                C44W c44w3 = ((C45E) this).A00;
                c44w3.A06 = c885643p2;
                if (!c44w3.A0C) {
                    c44w3.A03(c885643p2);
                    AnonymousClass423 anonymousClass4232 = c44w3.A0M;
                    anonymousClass4232.ATV(c44w3.A0H);
                    if (c44w3.A07 != null) {
                        anonymousClass4232.A5G(c44w3.A0P);
                    }
                    c44w3.A0J.A00(1, c44w3.A0N.A00);
                }
            } else if (!(this instanceof C45D)) {
                if (!(this instanceof C45C)) {
                    ((C45B) this).A00.A06 = null;
                    return;
                }
                C44W c44w4 = ((C45C) this).A00;
                c44w4.A0J.A00(15, new Object[]{c44w4, c44w4.A06, Integer.valueOf(c44w4.A04), Integer.valueOf(c44w4.A03)});
            } else {
                C45D c45d = (C45D) this;
                C44W c44w5 = c45d.A00;
                synchronized (c44w5.A0S) {
                    if (c44w5.A0V) {
                        c44w5.A0V = false;
                        AnonymousClass474 anonymousClass4742 = c44w5.A0U;
                        c44w5.A0U = null;
                        if (anonymousClass4742 != null) {
                            c44w5.A0J.A00(9, new Object[]{anonymousClass4742, obj});
                        }
                        if (c45d.A02) {
                            c45d.A01.countDown();
                        }
                    }
                }
            }
        }
    }
}
