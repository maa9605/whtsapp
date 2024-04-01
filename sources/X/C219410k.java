package X;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.10k  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C219410k {
    public final int A00;
    public final C219010g A01;
    public final CopyOnWriteArrayList A02;

    public C219410k() {
        this.A02 = new CopyOnWriteArrayList();
        this.A00 = 0;
        this.A01 = null;
    }

    public C219410k(CopyOnWriteArrayList copyOnWriteArrayList, int i, C219010g c219010g) {
        this.A02 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = c219010g;
    }

    public static final void A00(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public final long A01(long j) {
        long A01 = C20910yU.A01(j);
        if (A01 != -9223372036854775807L) {
            return 0 + A01;
        }
        return -9223372036854775807L;
    }

    public void A02() {
        final C219010g c219010g = this.A01;
        if (c219010g != null) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                C219310j c219310j = (C219310j) it.next();
                final InterfaceC219710n interfaceC219710n = c219310j.A01;
                A00(c219310j.A00, new Runnable() { // from class: X.10W
                    @Override // java.lang.Runnable
                    public final void run() {
                        C219410k c219410k = C219410k.this;
                        interfaceC219710n.ALo(c219410k.A00, c219010g);
                    }
                });
            }
            return;
        }
        throw null;
    }

    public void A03() {
        final C219010g c219010g = this.A01;
        if (c219010g != null) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                C219310j c219310j = (C219310j) it.next();
                final InterfaceC219710n interfaceC219710n = c219310j.A01;
                A00(c219310j.A00, new Runnable() { // from class: X.10Z
                    @Override // java.lang.Runnable
                    public final void run() {
                        C219410k c219410k = C219410k.this;
                        interfaceC219710n.ALp(c219410k.A00, c219010g);
                    }
                });
            }
            return;
        }
        throw null;
    }

    public void A04() {
        final C219010g c219010g = this.A01;
        if (c219010g != null) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                C219310j c219310j = (C219310j) it.next();
                final InterfaceC219710n interfaceC219710n = c219310j.A01;
                A00(c219310j.A00, new Runnable() { // from class: X.10X
                    @Override // java.lang.Runnable
                    public final void run() {
                        C219410k c219410k = C219410k.this;
                        interfaceC219710n.ANb(c219410k.A00, c219010g);
                    }
                });
            }
            return;
        }
        throw null;
    }

    public void A05(final C219510l c219510l, final C219610m c219610m) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C219310j c219310j = (C219310j) it.next();
            final InterfaceC219710n interfaceC219710n = c219310j.A01;
            A00(c219310j.A00, new Runnable() { // from class: X.10T
                @Override // java.lang.Runnable
                public final void run() {
                    C219410k c219410k = C219410k.this;
                    interfaceC219710n.ALL(c219410k.A00, c219410k.A01, c219510l, c219610m);
                }
            });
        }
    }

    public void A06(final C219510l c219510l, final C219610m c219610m) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C219310j c219310j = (C219310j) it.next();
            final InterfaceC219710n interfaceC219710n = c219310j.A01;
            A00(c219310j.A00, new Runnable() { // from class: X.10V
                @Override // java.lang.Runnable
                public final void run() {
                    C219410k c219410k = C219410k.this;
                    interfaceC219710n.ALM(c219410k.A00, c219410k.A01, c219510l, c219610m);
                }
            });
        }
    }

    public void A07(final C219510l c219510l, final C219610m c219610m) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C219310j c219310j = (C219310j) it.next();
            final InterfaceC219710n interfaceC219710n = c219310j.A01;
            A00(c219310j.A00, new Runnable() { // from class: X.10Y
                @Override // java.lang.Runnable
                public final void run() {
                    C219410k c219410k = C219410k.this;
                    interfaceC219710n.ALV(c219410k.A00, c219410k.A01, c219510l, c219610m);
                }
            });
        }
    }

    public void A08(final C219510l c219510l, final C219610m c219610m, final IOException iOException, final boolean z) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C219310j c219310j = (C219310j) it.next();
            final InterfaceC219710n interfaceC219710n = c219310j.A01;
            A00(c219310j.A00, new Runnable() { // from class: X.10S
                @Override // java.lang.Runnable
                public final void run() {
                    C219410k c219410k = C219410k.this;
                    interfaceC219710n.ALP(c219410k.A00, c219410k.A01, c219510l, c219610m, iOException, z);
                }
            });
        }
    }

    public void A09(final C219610m c219610m) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C219310j c219310j = (C219310j) it.next();
            final InterfaceC219710n interfaceC219710n = c219310j.A01;
            A00(c219310j.A00, new Runnable() { // from class: X.10U
                @Override // java.lang.Runnable
                public final void run() {
                    C219410k c219410k = C219410k.this;
                    interfaceC219710n.AJb(c219410k.A00, c219410k.A01, c219610m);
                }
            });
        }
    }
}
