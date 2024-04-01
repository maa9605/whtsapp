package X;

import java.util.HashMap;

/* renamed from: X.28x  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C469528x {
    public final AnonymousClass012 A00;
    public final AnonymousClass011 A01;
    public final HashMap A02 = new HashMap();

    public C469528x(AnonymousClass012 anonymousClass012, AnonymousClass011 anonymousClass011) {
        this.A01 = anonymousClass011;
        this.A00 = anonymousClass012;
    }

    public static void A00(C05270Nz c05270Nz, C29T c29t) {
        C29L c29l = c29t.A00;
        C29N c29n = c29l.A01;
        int i = 1;
        int i2 = 0;
        if (c29n != null) {
            if (!c29n.A03) {
                i2 = 1;
            }
        } else {
            i = 0;
        }
        C29N c29n2 = c29l.A05;
        if (c29n2 != null) {
            i |= 2;
            if (!c29n2.A03) {
                i2 |= 2;
            }
        }
        C29N c29n3 = c29l.A06;
        if (c29n3 != null) {
            i |= 4;
            if (!c29n3.A03) {
                i2 |= 4;
            }
        }
        C29N c29n4 = c29l.A04;
        if (c29n4 != null) {
            i |= 8;
            if (!c29n4.A03) {
                i2 |= 8;
            }
        }
        C29N c29n5 = c29l.A00;
        if (c29n5 != null) {
            i |= 16;
            if (!c29n5.A03) {
                i2 |= 16;
            }
        }
        C29N c29n6 = c29l.A02;
        if (c29n6 != null) {
            i |= 32;
            if (!c29n6.A03) {
                i2 |= 32;
            }
        }
        C29N c29n7 = c29l.A03;
        if (c29n7 != null) {
            i |= 64;
            if (!c29n7.A03) {
                i2 |= 64;
            }
        }
        c05270Nz.A0C = Long.valueOf(i);
        c05270Nz.A09 = Long.valueOf(i2);
        c05270Nz.A0F = Long.valueOf(c29t.A01.length);
    }

    public void A01(C05270Nz c05270Nz) {
        Boolean bool = Boolean.TRUE;
        c05270Nz.A04 = bool;
        c05270Nz.A00 = bool;
        A02(c05270Nz);
        AnonymousClass011 anonymousClass011 = this.A01;
        int i = c05270Nz.samplingRate.A02 * 10;
        anonymousClass011.A0B(c05270Nz, new AnonymousClass015(1, i, i, true), false);
    }

    public final void A02(C05270Nz c05270Nz) {
        HashMap hashMap = this.A02;
        if (hashMap.containsKey(c05270Nz)) {
            c05270Nz.A0A = C000200d.A05((Long) hashMap.get(c05270Nz), this.A00.A05());
            hashMap.remove(c05270Nz);
            return;
        }
        c05270Nz.A0A = -1L;
    }
}
