package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.47m  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C895647m {
    public final InterfaceC895847o A00;
    public final AtomicBoolean A01 = new AtomicBoolean(false);
    public final AtomicInteger A02;
    public final String[] A03;

    public C895647m(int i, InterfaceC895847o interfaceC895847o) {
        this.A02 = new AtomicInteger(i);
        this.A03 = new String[i];
        this.A00 = interfaceC895847o;
    }

    public void A00(int i, String str) {
        String[] strArr = this.A03;
        strArr[i] = str;
        if (this.A02.decrementAndGet() == 0 && this.A01.compareAndSet(false, true)) {
            this.A00.APL(strArr);
        }
    }
}
