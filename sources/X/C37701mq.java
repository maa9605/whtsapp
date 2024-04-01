package X;

import android.os.Handler;

/* renamed from: X.1mq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C37701mq extends C07G {
    public final Handler A00;
    public final C001200o A01;

    public C37701mq(C001200o c001200o, Handler handler) {
        this.A01 = c001200o;
        this.A00 = handler;
    }

    @Override // X.C07G
    public void A02() {
        Handler handler = this.A00;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new Runnable() { // from class: X.1PO
            @Override // java.lang.Runnable
            public final void run() {
                C37701mq.this.A01.A00.getContentResolver().notifyChange(C1PQ.A00, null);
            }
        }, 2000L);
    }
}
