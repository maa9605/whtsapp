package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.0MH  reason: invalid class name */
/* loaded from: classes.dex */
public class C0MH {
    public final long A00;
    public final List A01;
    public final Map A02;
    public final CountDownLatch A03 = new CountDownLatch(1);
    public volatile boolean A04 = false;

    public C0MH(long j, List list, Map map) {
        this.A00 = j;
        this.A01 = list;
        this.A02 = map;
    }
}
