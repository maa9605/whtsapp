package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.2rC  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C58472rC {
    public static final long A04;
    public static final long A05;
    public static final long A06;
    public boolean A00;
    public final AnonymousClass012 A01;
    public final C000500h A02;
    public final C0EE A03;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        A05 = timeUnit.toMillis(1L);
        A04 = timeUnit.toMillis(8L);
        A06 = timeUnit.toMillis(24L);
    }

    public C58472rC(AnonymousClass012 anonymousClass012, C0EE c0ee, C000500h c000500h) {
        this.A01 = anonymousClass012;
        this.A03 = c0ee;
        this.A02 = c000500h;
    }
}
