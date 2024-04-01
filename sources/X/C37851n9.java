package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.1n9 */
/* loaded from: classes.dex */
public class C37851n9 {
    public final C04470Kh A00;
    public final C001200o A01;
    public final C0HA A02;
    public final C04490Kj A03;
    public final C04400Ka A04;
    public final InterfaceC04440Ke A05;
    public final AnonymousClass035 A06;
    public final C03510Fz A07;
    public final C004902f A08;
    public final InterfaceC002901k A09;

    public C37851n9(C001200o c001200o, C004902f c004902f, InterfaceC002901k interfaceC002901k, C03510Fz c03510Fz, C0HA c0ha, AnonymousClass035 anonymousClass035, C04470Kh c04470Kh, C04490Kj c04490Kj, C04400Ka c04400Ka, InterfaceC04440Ke interfaceC04440Ke) {
        this.A01 = c001200o;
        this.A08 = c004902f;
        this.A09 = interfaceC002901k;
        this.A07 = c03510Fz;
        this.A02 = c0ha;
        this.A06 = anonymousClass035;
        this.A00 = c04470Kh;
        this.A03 = c04490Kj;
        this.A04 = c04400Ka;
        this.A05 = interfaceC04440Ke;
    }

    public void A00(final C27851Pa c27851Pa, long j) {
        InterfaceC04440Ke interfaceC04440Ke = this.A05;
        if (interfaceC04440Ke != null) {
            ((AnonymousClass281) interfaceC04440Ke).A00(2);
        }
        if (c27851Pa.A01 == -1) {
            C03510Fz c03510Fz = this.A07;
            if (c03510Fz != null) {
                int i = c27851Pa.A02;
                if (i == 1) {
                    c03510Fz.A02.A01(c27851Pa.A03);
                } else if (i == 2) {
                    c03510Fz.A02.A01(c27851Pa.A03);
                }
                this.A00.A04(c27851Pa.A03);
                return;
            }
            throw null;
        }
        AbstractC005302j abstractC005302j = c27851Pa.A03;
        int i2 = c27851Pa.A02;
        String str = c27851Pa.A04;
        if (str != null) {
            final C04490Kj c04490Kj = this.A03;
            if (c04490Kj != null) {
                Locale locale = Locale.US;
                Integer valueOf = Integer.valueOf(i2);
                String format = String.format(locale, "%s.%d", abstractC005302j.getRawString(), valueOf);
                HashMap hashMap = c04490Kj.A09;
                synchronized (hashMap) {
                    C222711t c222711t = (C222711t) hashMap.get(format);
                    if (c222711t != null) {
                        if (c222711t.A04.A04.equals(str)) {
                            return;
                        }
                        c222711t.A04();
                        hashMap.remove(format);
                    }
                    String format2 = String.format(locale, "%s.%d", abstractC005302j.getRawString(), valueOf);
                    C222711t c222711t2 = new C222711t(j, format2, new C0CG() { // from class: X.1n3
                        @Override // X.C0CG
                        public final void A54(Object obj) {
                            HashMap hashMap2 = c04490Kj.A09;
                            synchronized (hashMap2) {
                                hashMap2.remove(obj);
                            }
                        }
                    }, c04490Kj.A04, c04490Kj.A01, c04490Kj.A00, c27851Pa, c04490Kj.A07, c04490Kj.A03, c04490Kj.A05, c04490Kj.A02, c04490Kj.A06);
                    hashMap.put(format2, c222711t2);
                    c04490Kj.A08.AS1(c222711t2);
                    return;
                }
            }
            throw null;
        } else if (c27851Pa.A05 != null) {
            C78973kr.A02(this.A01, this.A08, this.A09, this.A02, this.A06, this.A00, c27851Pa, 0, j);
        } else {
            C04470Kh c04470Kh = this.A00;
            c04470Kh.A00.A00.post(new C1NN(c04470Kh, c27851Pa));
            this.A02.A02(1, 1, Long.valueOf(SystemClock.elapsedRealtime() - j), null);
        }
    }
}
