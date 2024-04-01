package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.1ud  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41861ud {
    public static final long A01 = TimeUnit.SECONDS.convert(1, TimeUnit.HOURS);
    public static volatile C41861ud A02;
    public final C003701t A00;

    public C41861ud(C003701t c003701t) {
        this.A00 = c003701t;
    }

    public static C41861ud A00() {
        if (A02 == null) {
            synchronized (C41861ud.class) {
                if (A02 == null) {
                    A02 = new C41861ud(C003701t.A00());
                }
            }
        }
        return A02;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
        if (r0 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        if (r0 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
        if (r0 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
        if (r0 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A01() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41861ud.A01():int");
    }

    public long A02() {
        long A03 = this.A00.A03(185);
        if (A03 < 1) {
            A03 = 1;
        } else if (A03 > 72) {
            A03 = 72;
        }
        return TimeUnit.MILLISECONDS.convert(A03, TimeUnit.HOURS);
    }

    public long A03() {
        long A03 = this.A00.A03(186);
        if (A03 < 1) {
            A03 = 1;
        }
        long j = A01;
        if (A03 > j) {
            A03 = j;
        }
        return TimeUnit.MILLISECONDS.convert(A03, TimeUnit.SECONDS);
    }
}
