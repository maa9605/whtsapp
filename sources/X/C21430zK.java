package X;

import android.os.Handler;

/* renamed from: X.0zK  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21430zK {
    public final Handler A00;
    public final InterfaceC21440zL A01;

    public C21430zK(Handler handler, InterfaceC21440zL interfaceC21440zL) {
        if (interfaceC21440zL == null) {
            handler = null;
        } else if (handler == null) {
            throw null;
        }
        this.A00 = handler;
        this.A01 = interfaceC21440zL;
    }

    public void A00(final C21630ze c21630ze) {
        if (this.A01 != null) {
            this.A00.post(new Runnable() { // from class: X.0z9
                @Override // java.lang.Runnable
                public final void run() {
                    C21430zK c21430zK = C21430zK.this;
                    C21630ze c21630ze2 = c21630ze;
                    synchronized (c21630ze2) {
                    }
                    c21430zK.A01.AHR(c21630ze2);
                }
            });
        }
    }
}
