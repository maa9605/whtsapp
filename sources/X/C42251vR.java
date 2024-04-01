package X;

import android.content.Context;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1vR */
/* loaded from: classes2.dex */
public class C42251vR {
    public C76163g9 A00;
    public final Context A01;
    public final AbstractC000600i A02;
    public final ReentrantReadWriteLock A03 = new ReentrantReadWriteLock();
    public final InterfaceC007103c A04;

    public C42251vR(Context context, AbstractC000600i abstractC000600i, InterfaceC007103c interfaceC007103c) {
        this.A01 = context;
        this.A02 = abstractC000600i;
        this.A04 = interfaceC007103c;
    }

    public C0CD A00() {
        C76163g9 c76163g9;
        ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
        synchronized (this) {
            c76163g9 = this.A00;
            if (c76163g9 == null) {
                c76163g9 = (C76163g9) this.A04.get();
                this.A00 = c76163g9;
            }
        }
        return new C0CD(readLock, c76163g9, false);
    }

    public C0CD A01() {
        C76163g9 c76163g9;
        ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
        synchronized (this) {
            c76163g9 = this.A00;
            if (c76163g9 == null) {
                c76163g9 = (C76163g9) this.A04.get();
                this.A00 = c76163g9;
            }
        }
        return new C0CD(readLock, c76163g9, true);
    }
}
