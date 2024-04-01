package X;

import android.os.Bundle;
import android.os.Message;

/* renamed from: X.2Ic  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C49032Ic {
    public final Bundle A00;
    public final Message A01;
    public final String A02;

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0006, code lost:
        if (r4 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C49032Ic(java.lang.String r2, android.os.Bundle r3, android.os.Message r4) {
        /*
            r1 = this;
            r1.<init>()
            if (r3 == 0) goto L8
            r0 = 0
            if (r4 != 0) goto L9
        L8:
            r0 = 1
        L9:
            X.C000700j.A06(r0)
            r1.A02 = r2
            r1.A00 = r3
            r1.A01 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49032Ic.<init>(java.lang.String, android.os.Bundle, android.os.Message):void");
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("action=");
        A0P.append(this.A02);
        A0P.append(", args=");
        A0P.append(this.A00);
        A0P.append(", message=");
        A0P.append(this.A01);
        return A0P.toString();
    }
}
