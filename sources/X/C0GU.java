package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.0GU  reason: invalid class name */
/* loaded from: classes.dex */
public class C0GU {
    public static volatile C0GU A07;
    public final C0GK A00;
    public final C05B A01;
    public final C05N A02;
    public final C05E A03;
    public final C05C A04;
    public final C05L A05;
    public final Map A06 = Collections.synchronizedMap(new C04W(200));

    public C0GU(C05B c05b, C0GK c0gk, C05C c05c, C05L c05l, C05E c05e, C05N c05n) {
        this.A01 = c05b;
        this.A00 = c0gk;
        this.A04 = c05c;
        this.A05 = c05l;
        this.A03 = c05e;
        this.A02 = c05n;
    }

    public static C0GU A00() {
        if (A07 == null) {
            synchronized (C0GU.class) {
                if (A07 == null) {
                    C05B A00 = C05B.A00();
                    C0GK A002 = C0GK.A00();
                    C05C A003 = C05C.A00();
                    C05L A004 = C05L.A00();
                    C05E A005 = C05E.A00();
                    C05P.A00();
                    A07 = new C0GU(A00, A002, A003, A004, A005, C05N.A00());
                }
            }
        }
        return A07;
    }
}
