package X;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.06F  reason: invalid class name */
/* loaded from: classes.dex */
public class C06F {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final LinkedHashMap A06;

    public int A02(Object obj, Object obj2) {
        return 1;
    }

    public void A09(boolean z, Object obj, Object obj2, Object obj3) {
    }

    public C06F(int i) {
        if (i > 0) {
            this.A02 = i;
            this.A06 = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final synchronized int A00() {
        return this.A02;
    }

    public final synchronized int A01() {
        return this.A05;
    }

    public final int A03(Object obj, Object obj2) {
        int A02 = A02(obj, obj2);
        if (A02 >= 0) {
            return A02;
        }
        StringBuilder sb = new StringBuilder("Negative size: ");
        sb.append(obj);
        sb.append("=");
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    public final Object A04(Object obj) {
        if (obj != null) {
            synchronized (this) {
                Object obj2 = this.A06.get(obj);
                if (obj2 != null) {
                    this.A01++;
                    return obj2;
                }
                this.A03++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final Object A05(Object obj) {
        Object remove;
        if (obj != null) {
            synchronized (this) {
                remove = this.A06.remove(obj);
                if (remove != null) {
                    this.A05 -= A03(obj, remove);
                }
            }
            if (remove != null) {
                A09(false, obj, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized Map A06() {
        return new LinkedHashMap(this.A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(getClass().getName());
        r1.append(".sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
        throw new java.lang.IllegalStateException(r1.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A07(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r2 = r4.A05     // Catch: java.lang.Throwable -> L66
            if (r2 < 0) goto L47
            java.util.LinkedHashMap r1 = r4.A06     // Catch: java.lang.Throwable -> L66
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto Lf
            if (r2 != 0) goto L47
        Lf:
            if (r2 <= r5) goto L45
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L66
            if (r0 != 0) goto L45
            java.util.Set r0 = r1.entrySet()     // Catch: java.lang.Throwable -> L66
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L66
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L66
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L66
            java.lang.Object r3 = r0.getKey()     // Catch: java.lang.Throwable -> L66
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Throwable -> L66
            r1.remove(r3)     // Catch: java.lang.Throwable -> L66
            int r1 = r4.A05     // Catch: java.lang.Throwable -> L66
            int r0 = r4.A03(r3, r2)     // Catch: java.lang.Throwable -> L66
            int r1 = r1 - r0
            r4.A05 = r1     // Catch: java.lang.Throwable -> L66
            int r0 = r4.A00     // Catch: java.lang.Throwable -> L66
            r1 = 1
            int r0 = r0 + r1
            r4.A00 = r0     // Catch: java.lang.Throwable -> L66
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L66
            r0 = 0
            r4.A09(r1, r3, r2, r0)
            goto L0
        L45:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L66
            return
        L47:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            r1.<init>()     // Catch: java.lang.Throwable -> L66
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L66
            r1.append(r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r1.append(r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L66
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L66
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L66
            throw r0     // Catch: java.lang.Throwable -> L66
        L66:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L66
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06F.A07(int):void");
    }

    public final void A08(Object obj, Object obj2) {
        Object put;
        if (obj != null && obj2 != null) {
            synchronized (this) {
                this.A04++;
                this.A05 += A03(obj, obj2);
                put = this.A06.put(obj, obj2);
                if (put != null) {
                    this.A05 -= A03(obj, put);
                }
            }
            if (put != null) {
                A09(false, obj, put, obj2);
            }
            A07(this.A02);
            return;
        }
        throw new NullPointerException("key == null || value == null");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        int i3;
        i = this.A01;
        i2 = this.A03;
        i3 = i + i2;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.A02), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3 != 0 ? (i * 100) / i3 : 0));
    }
}
