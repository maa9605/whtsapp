package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.2Ds  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48082Ds {
    public static long A03;
    public static long A04;
    public static volatile C48082Ds A05;
    public final AnonymousClass012 A00;
    public final C003701t A01;
    public final C0EG A02;

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        A04 = timeUnit.convert(15L, TimeUnit.MINUTES);
        A03 = timeUnit.convert(10L, TimeUnit.SECONDS);
    }

    public C48082Ds(AnonymousClass012 anonymousClass012, C003701t c003701t, C0EG c0eg) {
        this.A00 = anonymousClass012;
        this.A01 = c003701t;
        this.A02 = c0eg;
    }

    public boolean A00() {
        C003701t c003701t = this.A01;
        return Math.abs(this.A00.A05() - c003701t.A04()) < Math.max(TimeUnit.MILLISECONDS.convert((long) c003701t.A03(200), TimeUnit.MINUTES), A04);
    }
}
