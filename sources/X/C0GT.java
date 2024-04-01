package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.util.Log;

/* renamed from: X.0GT  reason: invalid class name */
/* loaded from: classes.dex */
public class C0GT {
    public static volatile C0GT A02;
    public final Handler A00;
    public final C06I A01;

    public C0GT(C06I c06i) {
        HandlerThread handlerThread = new HandlerThread("MessageThumbnailAsyncLoader thread");
        handlerThread.start();
        this.A00 = new Handler(handlerThread.getLooper());
        this.A01 = c06i;
    }

    public static C0GT A00() {
        if (A02 == null) {
            synchronized (C0GT.class) {
                if (A02 == null) {
                    A02 = new C0GT(C06I.A00());
                }
            }
        }
        return A02;
    }

    public void A01(AnonymousClass092 anonymousClass092) {
        C03900Hp A0E;
        if (AnonymousClass024.A0c()) {
            Log.w("thumbs are loaded on ui thread", new Throwable());
        }
        if (anonymousClass092.A0E() != null) {
            A02(anonymousClass092.A0E());
        }
        AnonymousClass092 A0C = anonymousClass092.A0C();
        if (A0C != null && (A0E = A0C.A0E()) != null && !A0E.A06()) {
            A0E.A02(A0E.A07());
        }
    }

    public void A02(C03900Hp c03900Hp) {
        if (c03900Hp.A06()) {
            return;
        }
        byte[] A07 = c03900Hp.A07();
        if (A07 == null) {
            A07 = this.A01.A0D(c03900Hp.A04);
        }
        c03900Hp.A02(A07);
    }

    public void A03(final C03900Hp c03900Hp, final Runnable runnable) {
        if (c03900Hp.A06()) {
            runnable.run();
        } else {
            this.A00.post(new Runnable() { // from class: X.1Q3
                @Override // java.lang.Runnable
                public final void run() {
                    C0GT c0gt = C0GT.this;
                    C03900Hp c03900Hp2 = c03900Hp;
                    Runnable runnable2 = runnable;
                    c0gt.A02(c03900Hp2);
                    runnable2.run();
                }
            });
        }
    }

    public boolean A04(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 != null) {
            return !(anonymousClass092.A0E() == null || anonymousClass092.A0E().A06()) || A04(anonymousClass092.A0C());
        }
        return false;
    }
}
