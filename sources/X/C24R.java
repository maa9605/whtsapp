package X;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.24R  reason: invalid class name */
/* loaded from: classes2.dex */
public class C24R {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public C24R(boolean z, String str, List list) {
        this.A02 = z;
        this.A00 = str;
        this.A01 = list;
        Collections.sort(list, new Comparator() { // from class: X.2pS
            /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
            @Override // java.util.Comparator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final int compare(java.lang.Object r8, java.lang.Object r9) {
                /*
                    r7 = this;
                    X.24L r8 = (X.C24L) r8
                    X.24L r9 = (X.C24L) r9
                    int r1 = r8.A00
                    r6 = 1
                    r1 = r1 & r6
                    r0 = 0
                    if (r1 != r6) goto Lc
                    r0 = 1
                Lc:
                    r2 = 0
                    if (r0 == 0) goto L32
                    X.24S r1 = r8.A08
                    if (r1 != 0) goto L16
                    X.24S r1 = X.C24S.A02
                L16:
                    int r0 = r1.A00
                    r0 = r0 & r6
                    if (r0 != r6) goto L32
                    long r4 = r1.A01
                L1d:
                    int r0 = r9.A00
                    r0 = r0 & r6
                    if (r0 != r6) goto L2f
                    X.24S r1 = r9.A08
                    if (r1 != 0) goto L28
                    X.24S r1 = X.C24S.A02
                L28:
                    int r0 = r1.A00
                    r0 = r0 & r6
                    if (r0 != r6) goto L2f
                    long r2 = r1.A01
                L2f:
                    int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                    return r0
                L32:
                    r4 = 0
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C57482pS.compare(java.lang.Object, java.lang.Object):int");
            }
        });
    }
}
