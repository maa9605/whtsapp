package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.LinkedList;

/* renamed from: X.2SA */
/* loaded from: classes2.dex */
public final class C2SA extends HandlerThread {
    public C40581sV A00;
    public boolean A01;
    public final AbstractC000600i A02;
    public final C0EL A03;
    public final C41651uI A04;
    public final C0EF A05;
    public final C2SC A06;
    public final C07420Yd A07;
    public final LinkedList A08;

    public C2SA(C2SC c2sc, AbstractC000600i abstractC000600i, C0EL c0el, C0EF c0ef, C41651uI c41651uI) {
        super("WriterThread", 1);
        this.A08 = new LinkedList();
        this.A07 = new C07420Yd(this);
        this.A01 = true;
        this.A06 = c2sc;
        this.A02 = abstractC000600i;
        this.A03 = c0el;
        this.A05 = c0ef;
        this.A04 = c41651uI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:473:0x0034, code lost:
        if (r1 != false) goto L455;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A00(android.os.Message r44) {
        /*
            Method dump skipped, instructions count: 3994
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2SA.A00(android.os.Message):void");
    }

    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        ((Handler) this.A06).obtainMessage(0, new C2SJ(this)).sendToTarget();
    }
}
