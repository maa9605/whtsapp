package X;

import java.util.HashMap;

/* renamed from: X.0Kj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04490Kj {
    public static volatile C04490Kj A0A;
    public final C01B A00;
    public final C0EL A01;
    public final C04470Kh A02;
    public final C000400f A03;
    public final C001200o A04;
    public final C0HA A05;
    public final C04000Ia A06;
    public final C0IY A07;
    public final InterfaceC002901k A08;
    public final HashMap A09 = new HashMap();

    public C04490Kj(C001200o c001200o, InterfaceC002901k interfaceC002901k, C0EL c0el, C01B c01b, C0IY c0iy, C0HA c0ha, C000400f c000400f, C04470Kh c04470Kh, C04000Ia c04000Ia) {
        this.A04 = c001200o;
        this.A08 = interfaceC002901k;
        this.A01 = c0el;
        this.A00 = c01b;
        this.A07 = c0iy;
        this.A05 = c0ha;
        this.A03 = c000400f;
        this.A02 = c04470Kh;
        this.A06 = c04000Ia;
    }

    public static C04490Kj A00() {
        if (A0A == null) {
            synchronized (C04490Kj.class) {
                if (A0A == null) {
                    A0A = new C04490Kj(C001200o.A01, C002801j.A00(), C0EL.A00(), C01B.A00(), C0IY.A00(), C0HA.A00(), C000400f.A00(), C04470Kh.A00(), C04000Ia.A00());
                }
            }
        }
        return A0A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
        if (r4 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File A01(android.content.Context r2, java.net.URL r3, java.lang.String r4) {
        /*
            if (r3 != 0) goto L5
            r0 = 0
            if (r4 == 0) goto L6
        L5:
            r0 = 1
        L6:
            X.C000700j.A07(r0)
            if (r3 == 0) goto L28
            java.lang.String r1 = r3.toString()
        Lf:
            r0 = 0
            java.lang.String r3 = android.webkit.URLUtil.guessFileName(r1, r0, r0)
            java.io.File r2 = r2.getCacheDir()
            java.lang.String r0 = "ProfilePictureTemp"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            r1.mkdirs()
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r3)
            return r0
        L28:
            java.lang.String r0 = "https://pps.whatsapp.net"
            java.lang.String r1 = X.C000200d.A0H(r0, r4)
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04490Kj.A01(android.content.Context, java.net.URL, java.lang.String):java.io.File");
    }
}
