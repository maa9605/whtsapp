package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* renamed from: X.37n  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C655237n extends C0HS {
    public Handler A00;
    public Runnable A01;
    public final long A02 = SystemClock.uptimeMillis();
    public final C018708s A03;
    public final AbstractC011205o A04;
    public final WeakReference A05;
    public final boolean A06;

    public C655237n(C018708s c018708s, C58462rB c58462rB, AbstractC011205o abstractC011205o, boolean z) {
        this.A03 = c018708s;
        this.A05 = new WeakReference(c58462rB);
        this.A04 = abstractC011205o;
        this.A06 = z;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        return this.A03.A0A(this.A04);
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.A00 = handler;
        RunnableEBaseShape1S1100000_I1 runnableEBaseShape1S1100000_I1 = new RunnableEBaseShape1S1100000_I1(this, (String) obj, 2);
        this.A01 = runnableEBaseShape1S1100000_I1;
        if (this.A06) {
            handler.postAtTime(runnableEBaseShape1S1100000_I1, this.A02 + 3000);
        } else {
            runnableEBaseShape1S1100000_I1.run();
        }
    }

    public void A0A() {
        A05(false);
        Handler handler = this.A00;
        if (handler != null) {
            handler.removeCallbacks(this.A01);
        }
        this.A00 = null;
        this.A01 = null;
    }
}
