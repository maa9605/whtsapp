package X;

import java.io.FileInputStream;

/* renamed from: X.1Yw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29881Yw extends AbstractC20770yA {
    public final C29891Yx[] A00;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00be, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("illegal line in exopackage metadata: [");
        r1.append(r2);
        r1.append("]");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d9, code lost:
        throw new java.lang.RuntimeException(r1.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C29881Yw(X.C008603s r18) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29881Yw.<init>(X.03s):void");
    }

    @Override // X.AbstractC20770yA
    public C20740y7 A00() {
        return new C20740y7(this.A00);
    }

    @Override // X.AbstractC20770yA
    public AbstractC20760y9 A01() {
        return new AbstractC20760y9() { // from class: X.1Yv
            public int A00;

            @Override // X.AbstractC20760y9
            public C20750y8 A00() {
                C29891Yx[] c29891YxArr = C29881Yw.this.A00;
                int i = this.A00;
                this.A00 = i + 1;
                C29891Yx c29891Yx = c29891YxArr[i];
                FileInputStream fileInputStream = new FileInputStream(c29891Yx.A00);
                try {
                    return new C20750y8(c29891Yx, fileInputStream);
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }

            @Override // X.AbstractC20760y9
            public boolean A01() {
                return this.A00 < C29881Yw.this.A00.length;
            }
        };
    }
}
