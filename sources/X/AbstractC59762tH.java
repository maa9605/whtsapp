package X;

import android.graphics.Paint;
import java.util.Locale;

/* renamed from: X.2tH */
/* loaded from: classes2.dex */
public abstract class AbstractC59762tH {
    public static final AbstractC59762tH A04 = new AbstractC59762tH() { // from class: X.39t
    };
    public static final AbstractC59762tH A05 = new AbstractC59762tH() { // from class: X.39u
    };
    public static final AbstractC59762tH A03 = new AbstractC59762tH() { // from class: X.39v
    };
    public final Object A02 = new Object();
    public final C006802z A01 = new C006802z();
    public Paint A00 = new Paint();

    public static boolean A00(Locale locale) {
        return A04.A01(AbstractC003201n.A01(locale));
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0030, code lost:
        if (X.C0XJ.A00(r8.A00, r0.toString()) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A01(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.Object r3 = r8.A02
            monitor-enter(r3)
            X.02z r5 = r8.A01     // Catch: java.lang.Throwable -> L7d
            r0 = 0
            java.lang.Object r0 = r5.getOrDefault(r9, r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L14
            boolean r0 = r0.booleanValue()
            return r0
        L14:
            boolean r0 = r8 instanceof X.C661239v
            if (r0 != 0) goto L3c
            boolean r0 = r8 instanceof X.C661139u
            if (r0 != 0) goto L35
            X.02z r1 = X.C2Qt.A03
            r0 = 0
            java.lang.Object r0 = r1.getOrDefault(r9, r0)
            if (r0 == 0) goto L32
            java.lang.String r1 = r0.toString()
            android.graphics.Paint r0 = r8.A00
            boolean r0 = X.C0XJ.A00(r0, r1)
            r7 = 0
            if (r0 == 0) goto L33
        L32:
            r7 = 1
        L33:
            monitor-enter(r3)
            goto L71
        L35:
            android.graphics.Paint r0 = r8.A00
            boolean r7 = X.C0XJ.A00(r0, r9)
            goto L33
        L3c:
            r7 = 0
            r4 = 0
        L3e:
            int r0 = r9.length()
            if (r4 >= r0) goto L6f
            int r2 = r9.codePointAt(r4)
            r0 = 255(0xff, float:3.57E-43)
            if (r2 <= r0) goto L69
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r2 > r0) goto L5f
            char r0 = (char) r2
            java.lang.String r1 = java.lang.Character.toString(r0)
        L56:
            android.graphics.Paint r0 = r8.A00
            boolean r0 = X.C0XJ.A00(r0, r1)
            if (r0 != 0) goto L69
            goto L33
        L5f:
            char[] r0 = java.lang.Character.toChars(r2)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            goto L56
        L69:
            int r0 = java.lang.Character.charCount(r2)
            int r4 = r4 + r0
            goto L3e
        L6f:
            r7 = 1
            goto L33
        L71:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L7a
            r5.put(r9, r0)     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7a
            return r7
        L7a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7a
            throw r0
        L7d:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC59762tH.A01(java.lang.String):boolean");
    }
}
