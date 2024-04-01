package X;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.0Bw */
/* loaded from: classes.dex */
public class C02550Bw implements Iterable {
    public C0UC A01;
    public C0UC A02;
    public WeakHashMap A03 = new WeakHashMap();
    public int A00 = 0;

    public C0UC A00(Object obj) {
        C0UC c0uc = this.A02;
        while (c0uc != null && !c0uc.A02.equals(obj)) {
            c0uc = c0uc.A00;
        }
        return c0uc;
    }

    public Object A01(Object obj) {
        C0UC A00 = A00(obj);
        if (A00 == null) {
            return null;
        }
        this.A00--;
        if (!this.A03.isEmpty()) {
            for (C0YY c0yy : this.A03.keySet()) {
                c0yy.AVI(A00);
            }
        }
        C0UC c0uc = A00.A01;
        if (c0uc != null) {
            c0uc.A00 = A00.A00;
        } else {
            this.A02 = A00.A00;
        }
        C0UC c0uc2 = A00.A00;
        if (c0uc2 != null) {
            c0uc2.A01 = c0uc;
        } else {
            this.A01 = c0uc;
        }
        A00.A00 = null;
        A00.A01 = null;
        return A00.A03;
    }

    public Object A02(Object obj, Object obj2) {
        C0UC A00 = A00(obj);
        if (A00 != null) {
            return A00.A03;
        }
        C0UC c0uc = new C0UC(obj, obj2);
        this.A00++;
        C0UC c0uc2 = this.A01;
        if (c0uc2 == null) {
            this.A02 = c0uc;
            this.A01 = c0uc;
            return null;
        }
        c0uc2.A00 = c0uc;
        c0uc.A01 = c0uc2;
        this.A01 = c0uc;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0043, code lost:
        if (r1 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x004b, code lost:
        if (((X.AbstractC09960f4) r4).hasNext() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x004d, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x004e, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r7 = 1
            if (r9 != r8) goto L4
            return r7
        L4:
            boolean r0 = r9 instanceof X.C02550Bw
            r6 = 0
            if (r0 != 0) goto La
            return r6
        La:
            X.0Bw r9 = (X.C02550Bw) r9
            int r1 = r8.A00
            int r0 = r9.A00
            if (r1 == r0) goto L13
            return r6
        L13:
            java.util.Iterator r5 = r8.iterator()
            java.util.Iterator r4 = r9.iterator()
        L1b:
            r3 = r5
            X.0f4 r3 = (X.AbstractC09960f4) r3
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L43
            r2 = r4
            X.0f4 r2 = (X.AbstractC09960f4) r2
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r2.next()
            if (r1 != 0) goto L3c
            if (r0 != 0) goto L42
            goto L1b
        L3c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1b
        L42:
            return r6
        L43:
            if (r1 != 0) goto L4e
            X.0f4 r4 = (X.AbstractC09960f4) r4
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L4e
            return r7
        L4e:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02550Bw.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            AbstractC09960f4 abstractC09960f4 = (AbstractC09960f4) it;
            if (!abstractC09960f4.hasNext()) {
                return i;
            }
            i += ((Map.Entry) abstractC09960f4.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        AbstractC09960f4 abstractC09960f4 = new AbstractC09960f4(this.A02, this.A01) { // from class: X.0f3
            @Override // X.AbstractC09960f4
            public C0UC A00(C0UC c0uc) {
                return c0uc.A01;
            }

            @Override // X.AbstractC09960f4
            public C0UC A01(C0UC c0uc) {
                return c0uc.A00;
            }
        };
        this.A03.put(abstractC09960f4, Boolean.FALSE);
        return abstractC09960f4;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("[");
        Iterator it = iterator();
        while (true) {
            AbstractC09960f4 abstractC09960f4 = (AbstractC09960f4) it;
            if (abstractC09960f4.hasNext()) {
                A0P.append(abstractC09960f4.next().toString());
                if (abstractC09960f4.hasNext()) {
                    A0P.append(", ");
                }
            } else {
                A0P.append("]");
                return A0P.toString();
            }
        }
    }
}
