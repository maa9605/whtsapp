package X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.31x  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C640631x {
    public final /* synthetic */ AnonymousClass322 A00;

    public final void A00(long j) {
        C55862mJ c55862mJ = this.A00.A01;
        AtomicLong atomicLong = c55862mJ.A0Y;
        atomicLong.addAndGet(j);
        if (j >= 10240) {
            c55862mJ.A0C.A0B(atomicLong.get(), c55862mJ.A0W.get());
        }
    }
}
