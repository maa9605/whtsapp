package X;

import android.content.Context;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0T4 */
/* loaded from: classes.dex */
public final class C0T4 implements C0T5, C0T6, C0T7 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public InterfaceC18270tS A07;
    public InterfaceC18280tT A08;
    public InterfaceC18290tU A09;
    public InterfaceC18300tV A0A;
    public InterfaceC18310tW A0B;
    public InterfaceC18340ta A0C;
    public C0SK A0D;
    public C06390Sx A0E;
    public C29421Ws A0F;
    public C1X3 A0G;
    public C1X4 A0H;
    public C18670u7 A0I;
    public C18670u7 A0J;
    public C18670u7 A0K;
    public C18670u7 A0L;
    public boolean A0N;
    public final int A0O;
    public final Context A0P;
    public final C18450tl A0R;
    public final C18460tm A0S;
    public final C1D0 A0T;
    public final C1X6 A0U;
    public final float[] A0X = new float[2];
    public final Matrix A0Q = new Matrix();
    public boolean A0M = false;
    public final ArrayList A0V = new ArrayList();
    public final List A0W = new ArrayList();

    @Override // X.C0T5
    public boolean AEE(C0SJ c0sj) {
        return false;
    }

    @Override // X.C0T6
    public void AHB(C18670u7 c18670u7) {
    }

    @Override // X.C0T6
    public void AHD(C18670u7 c18670u7) {
    }

    public C0T4(C06390Sx c06390Sx, C18350tb c18350tb) {
        this.A00 = 19.0f;
        this.A01 = 2.0f;
        this.A0E = c06390Sx;
        Context applicationContext = c06390Sx.getContext().getApplicationContext();
        this.A0P = applicationContext;
        this.A0R = new C18450tl(this);
        this.A0S = new C18460tm(this);
        C07K.A16(applicationContext);
        int i = this.A0P.getResources().getDisplayMetrics().densityDpi >= 320 ? 512 : 256;
        this.A0O = i;
        C1D0 c1d0 = new C1D0(this, new C24821Cz(this.A0P, i, i));
        A09(c1d0);
        this.A0T = c1d0;
        C1X6 c1x6 = new C1X6(this.A0E.getContext());
        this.A0U = c1x6;
        C29351Wl c29351Wl = new C29351Wl(this);
        c1x6.A01 = c29351Wl;
        if (c1x6.A00 != null && c1x6.A03) {
            c29351Wl.A00.A0E.invalidate();
        }
        if (c18350tb != null) {
            this.A0S.A01(c18350tb.A04);
            C18460tm c18460tm = this.A0S;
            c18460tm.A02 = c18350tb.A05;
            c18460tm.A03 = c18350tb.A06;
            c18460tm.A04 = c18350tb.A08;
            this.A00 = Math.min(Math.max(19.0f, 2.0f), 19.0f);
            this.A01 = Math.min(Math.max(2.0f, 2.0f), 19.0f);
            C1D0 c1d02 = this.A0T;
            int i2 = c18350tb.A02;
            if (i2 != c1d02.A00) {
                c1d02.A00 = i2;
                if (i2 == 0) {
                    ((C0SK) c1d02).A04 = false;
                    c1d02.A01();
                    c1d02.A0G();
                    C29451Wv c29451Wv = c1d02.A02;
                    ((C0SK) c29451Wv).A04 = false;
                    c29451Wv.A01();
                    return;
                }
                if (!((C0SK) c1d02).A04) {
                    ((C0SK) c1d02).A04 = true;
                    c1d02.A01();
                    c1d02.A0G();
                    C29451Wv c29451Wv2 = c1d02.A02;
                    ((C0SK) c29451Wv2).A04 = c1d02.A01;
                    c29451Wv2.A01();
                }
                C24821Cz c24821Cz = c1d02.A03;
                if (i2 == 5) {
                    c24821Cz.A00 = "live_maps";
                } else if (i2 == 6) {
                    c24821Cz.A00 = "crowdsourcing_osm";
                } else if (i2 != 7) {
                    c24821Cz.A00 = null;
                } else {
                    c24821Cz.A00 = "indoor_osm";
                }
                C0T4 c0t4 = ((C0SK) c1d02).A0A;
                c0t4.A03();
                c0t4.A0E.invalidate();
            }
        }
    }

    public final float A00() {
        return (((this.A0E.A0F - 0) - this.A05) / 2.0f) + 0;
    }

    public final float A01() {
        int i = this.A06;
        return (((this.A0E.A0D - i) - this.A04) / 2.0f) + i;
    }

    public final C015907l A02() {
        float[] fArr = this.A0X;
        C06390Sx c06390Sx = this.A0E;
        fArr[0] = c06390Sx.A04 - A00();
        fArr[1] = c06390Sx.A05 - A01();
        c06390Sx.A0l.mapVectors(fArr);
        C06390Sx c06390Sx2 = this.A0E;
        double d = c06390Sx2.A02;
        float f = fArr[0];
        float f2 = (float) c06390Sx2.A0J;
        return new C015907l(new C016007m(C18450tl.A00(c06390Sx2.A03 - (fArr[1] / f2)), ((d - (f / f2)) * 360.0d) - 180.0d), c06390Sx2.getZoom(), 0.0f, c06390Sx2.A0B);
    }

    public void A03() {
        List list = this.A0W;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C0SK c0sk = (C0SK) list.get(i);
            if (c0sk instanceof AbstractC29401Wq) {
                ((AbstractC29401Wq) c0sk).A0E();
            }
        }
    }

    public void A04() {
        if (this.A09 == null && this.A0V.isEmpty()) {
            return;
        }
        C015907l A02 = A02();
        InterfaceC18290tU interfaceC18290tU = this.A09;
        if (interfaceC18290tU != null) {
            interfaceC18290tU.AI8(A02);
        }
        ArrayList arrayList = this.A0V;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC18290tU) it.next()).AI8(A02);
        }
    }

    public final void A05() {
        Iterator it = this.A0W.iterator();
        while (it.hasNext()) {
            int i = ((C0SK) it.next()).A03;
            if (i == 1 || i == 2 || i == 4) {
                it.remove();
            }
        }
        this.A0E.invalidate();
    }

    public final void A06() {
        C18670u7 c18670u7 = this.A0J;
        if (c18670u7 != null) {
            c18670u7.A01();
        }
        C18670u7 c18670u72 = this.A0K;
        if (c18670u72 != null) {
            c18670u72.A01();
        }
        C18670u7 c18670u73 = this.A0L;
        if (c18670u73 != null) {
            c18670u73.A01();
        }
        C18670u7 c18670u74 = this.A0I;
        if (c18670u74 != null) {
            c18670u74.A01();
        }
    }

    public final void A07(int i, int i2, int i3) {
        C06390Sx c06390Sx = this.A0E;
        double d = c06390Sx.A02;
        long j = c06390Sx.A0J << 1;
        c06390Sx.A09(d + (((0 - this.A05) - (0 - i2)) / j), c06390Sx.A03 + (((this.A06 - this.A04) - (i - i3)) / j));
        this.A06 = i;
        this.A05 = i2;
        this.A04 = i3;
        c06390Sx.requestLayout();
        this.A0E.invalidate();
    }

    public final void A08(C015807k c015807k, int i, InterfaceC18270tS interfaceC18270tS) {
        if (this.A0E.A0e) {
            return;
        }
        if (i != 0) {
            this.A0T.A0I(true);
        }
        A06();
        this.A0M = true;
        float A00 = A00();
        float A01 = A01();
        C06390Sx c06390Sx = this.A0E;
        float zoom = c06390Sx.getZoom();
        this.A02 = A00;
        this.A03 = A01;
        float f = c015807k.A03;
        if (f != -2.14748365E9f) {
            zoom = f;
        } else {
            float f2 = c015807k.A04;
            if (f2 != -2.14748365E9f) {
                zoom += f2;
                float f3 = c015807k.A05;
                if (f3 != -2.14748365E9f || c015807k.A06 != -2.14748365E9f) {
                    this.A02 = f3;
                    this.A03 = c015807k.A06;
                }
            } else {
                C18740uF c18740uF = c015807k.A09;
                if (c18740uF != null) {
                    int i2 = (c06390Sx.A0F - 0) - this.A05;
                    int i3 = (c06390Sx.A0D - this.A06) - this.A04;
                    if (i2 == 0 && i3 == 0) {
                        throw new IllegalStateException("Error using newLatLngBounds(LatLngBounds, int): Map size can't be 0. Most likely, layout has not yet occured for the map view.  Either wait until layout has occurred or use newLatLngBounds(LatLngBounds, int, int, int) which allows you to specify the map's dimensions.");
                    }
                    int i4 = c015807k.A07 << 1;
                    if (i2 + i4 > i2) {
                        i2 -= i4;
                    }
                    if (i3 + i4 > i3) {
                        i3 -= i4;
                    }
                    int max = Math.max(0, i2);
                    int max2 = Math.max(0, i3);
                    C016007m c016007m = c18740uF.A00;
                    float A02 = C18450tl.A02(c016007m.A01);
                    C016007m c016007m2 = c18740uF.A01;
                    float abs = Math.abs(A02 - C18450tl.A02(c016007m2.A01));
                    float abs2 = Math.abs(C18450tl.A01(c016007m2.A00) - C18450tl.A01(c016007m.A00));
                    float f4 = this.A0O;
                    double log = Math.log((max / abs) / f4);
                    double d = C06390Sx.A0q;
                    zoom = Math.min((float) (log / d), (float) (Math.log((max2 / abs2) / f4) / d));
                }
            }
        }
        float max3 = Math.max(this.A01, Math.min(this.A00, zoom));
        double d2 = c06390Sx.A02;
        double d3 = c06390Sx.A03;
        C016007m c016007m3 = c015807k.A08;
        if (c016007m3 != null || c015807k.A09 != null) {
            if (c016007m3 == null) {
                c016007m3 = c015807k.A09.A01();
            }
            d2 = C18450tl.A02(c016007m3.A01);
            d3 = C18450tl.A01(c016007m3.A00);
            float[] fArr = this.A0X;
            fArr[0] = c06390Sx.A04 - A00;
            float f5 = c06390Sx.A05 - A01;
            fArr[1] = f5;
            if (fArr[0] != 0.0f || f5 != 0.0f) {
                int i5 = (1 << ((int) max3)) * this.A0O;
                float f6 = (max3 % 1.0f) + 1.0f;
                Matrix matrix = this.A0Q;
                matrix.setScale(f6, f6);
                matrix.postRotate(this.A0E.A0B);
                matrix.invert(matrix);
                matrix.mapVectors(fArr);
                float f7 = i5;
                d2 += fArr[0] / f7;
                d3 += fArr[1] / f7;
            }
        }
        C06390Sx c06390Sx2 = this.A0E;
        float f8 = c06390Sx2.A0B;
        float f9 = c015807k.A00;
        if (f9 != -2.14748365E9f) {
            float f10 = f9 % 360.0f;
            if (f8 - f10 > 180.0f) {
                f8 = f10 + 360.0f;
            } else {
                f8 = f10 - f8 > 180.0f ? f10 - 360.0f : f10;
            }
        }
        double A002 = C06390Sx.A00(d2);
        double A012 = c06390Sx2.A01(d3, (1 << ((int) max3)) * this.A0O);
        if (i <= 0) {
            if (max3 != c06390Sx2.getZoom()) {
                c06390Sx2.A0J(max3, this.A02, this.A03);
            }
            C06390Sx c06390Sx3 = this.A0E;
            if (A002 != c06390Sx3.A02 || A012 != c06390Sx3.A03) {
                c06390Sx3.A09(A002, A012);
            }
            if (f8 != c06390Sx3.A0B) {
                c06390Sx3.A0B(f8, A00, A01);
            }
            this.A0E.invalidate();
            A04();
        } else {
            this.A07 = interfaceC18270tS;
            float zoom2 = c06390Sx2.getZoom();
            if (max3 != zoom2) {
                C18670u7 A003 = C18670u7.A00(zoom2, max3);
                this.A0L = A003;
                A003.A06(this);
                A003.A07(this);
                A003.A05(i);
            }
            double d4 = this.A0E.A02;
            if (A002 != d4) {
                double d5 = A002 - d4;
                if (d5 > 0.5d) {
                    A002 -= 1.0d;
                } else if (d5 < -0.5d) {
                    A002 += 1.0d;
                }
                C18670u7 A004 = C18670u7.A00((float) d4, (float) A002);
                this.A0J = A004;
                A004.A06(this);
                A004.A07(this);
                A004.A05(i);
            }
            double d6 = this.A0E.A03;
            if (A012 != d6) {
                C18670u7 A005 = C18670u7.A00((float) d6, (float) A012);
                this.A0K = A005;
                A005.A06(this);
                A005.A07(this);
                A005.A05(i);
            }
            float f11 = this.A0E.A0B;
            if (f8 != f11) {
                C18670u7 A006 = C18670u7.A00(f11, f8);
                this.A0I = A006;
                A006.A06(this);
                A006.A07(this);
                A006.A05(i);
            }
            C18670u7 c18670u7 = this.A0J;
            if (c18670u7 != null) {
                c18670u7.A03();
            }
            C18670u7 c18670u72 = this.A0K;
            if (c18670u72 != null) {
                c18670u72.A03();
            }
            C18670u7 c18670u73 = this.A0L;
            if (c18670u73 != null) {
                c18670u73.A03();
            }
            C18670u7 c18670u74 = this.A0I;
            if (c18670u74 != null) {
                c18670u74.A03();
            }
        }
        if (this.A0J == null && this.A0K == null && this.A0L == null && this.A0I == null && interfaceC18270tS != null) {
            this.A07 = null;
            interfaceC18270tS.AKU();
        }
    }

    public final void A09(C0SK c0sk) {
        List list = this.A0W;
        int binarySearch = Collections.binarySearch(list, c0sk, C0SK.A0F);
        if (binarySearch <= 0) {
            list.add((-1) - binarySearch, c0sk);
            c0sk.A0A();
            this.A0E.invalidate();
        }
    }

    public final void A0A(C0SK c0sk) {
        this.A0W.remove(c0sk);
        this.A0E.invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0011, code lost:
        if (X.C02160Ac.A01(r1, "android.permission.ACCESS_FINE_LOCATION") == 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0B(boolean r3) {
        /*
            r2 = this;
            android.content.Context r1 = r2.A0P
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = X.C02160Ac.A01(r1, r0)
            if (r0 == 0) goto L13
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r1 = X.C02160Ac.A01(r1, r0)
            r0 = 0
            if (r1 != 0) goto L14
        L13:
            r0 = 1
        L14:
            r2.A0N = r0
            r3 = r3 & r0
            X.1X6 r0 = r2.A0U
            r0.A01(r3)
            if (r3 == 0) goto L3d
            X.1X4 r0 = r2.A0H
            if (r0 != 0) goto L37
            X.1X4 r0 = new X.1X4
            r0.<init>(r2)
            r2.A0H = r0
            r2.A09(r0)
            X.1X4 r0 = r2.A0H
            X.0u7 r1 = r0.A0E
            boolean r0 = r1.A0I
            if (r0 != 0) goto L37
            r1.A03()
        L37:
            X.0tm r0 = r2.A0S
            r0.A00()
            return
        L3d:
            X.1X4 r1 = r2.A0H
            if (r1 == 0) goto L37
            X.0u7 r0 = r1.A0E
            r0.A01()
            r1.A01()
            X.1X4 r0 = r2.A0H
            r2.A0A(r0)
            r0 = 0
            r2.A0H = r0
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0T4.A0B(boolean):void");
    }

    @Override // X.C0T5
    public boolean AEC(C0SJ c0sj) {
        InterfaceC18300tV interfaceC18300tV = this.A0A;
        if (interfaceC18300tV != null) {
            interfaceC18300tV.AL3(c0sj);
            return true;
        }
        return false;
    }

    @Override // X.C0T5
    public boolean AED(C0SJ c0sj) {
        InterfaceC18340ta interfaceC18340ta = this.A0C;
        return interfaceC18340ta != null && interfaceC18340ta.ALl(c0sj);
    }

    @Override // X.C0T5
    public void AEF(C0SJ c0sj) {
        A0A(c0sj);
        A09(c0sj);
    }

    @Override // X.C0T6
    public void AH7(C18670u7 c18670u7) {
        if (c18670u7 == this.A0J) {
            this.A0J = null;
        } else if (c18670u7 == this.A0K) {
            this.A0K = null;
        } else if (c18670u7 == this.A0L) {
            this.A0L = null;
        } else if (c18670u7 == this.A0I) {
            this.A0I = null;
        }
        c18670u7.A02();
        if (this.A0J == null && this.A0K == null && this.A0L == null && this.A0I == null) {
            this.A0M = false;
            InterfaceC18270tS interfaceC18270tS = this.A07;
            if (interfaceC18270tS != null) {
                this.A07 = null;
                interfaceC18270tS.AID();
            }
            A04();
        }
    }

    @Override // X.C0T6
    public void AH9(C18670u7 c18670u7) {
        if (c18670u7 == this.A0J) {
            this.A0J = null;
        } else if (c18670u7 == this.A0K) {
            this.A0K = null;
        } else if (c18670u7 == this.A0L) {
            this.A0L = null;
        } else if (c18670u7 == this.A0I) {
            this.A0I = null;
        }
        c18670u7.A02();
        if (this.A0M && this.A0J == null && this.A0K == null && this.A0L == null && this.A0I == null) {
            this.A0M = false;
            InterfaceC18270tS interfaceC18270tS = this.A07;
            if (interfaceC18270tS != null) {
                this.A07 = null;
                interfaceC18270tS.AKU();
            }
            A04();
        }
    }

    @Override // X.C0T7
    public void AHF(C18670u7 c18670u7) {
        C18670u7 c18670u72 = this.A0J;
        if (c18670u7 == c18670u72) {
            C06390Sx c06390Sx = this.A0E;
            c06390Sx.A09(c18670u72.A00, c06390Sx.A03);
            c06390Sx.invalidate();
            return;
        }
        C18670u7 c18670u73 = this.A0K;
        if (c18670u7 == c18670u73) {
            C06390Sx c06390Sx2 = this.A0E;
            c06390Sx2.A09(c06390Sx2.A02, c18670u73.A00);
            c06390Sx2.invalidate();
        } else if (c18670u7 == this.A0L) {
            this.A0E.A0I(c18670u7.A00, this.A02, this.A03);
            this.A0E.invalidate();
        } else if (c18670u7 != this.A0I) {
        } else {
            this.A0E.A0B(c18670u7.A00, A00(), A01());
            this.A0E.invalidate();
        }
    }
}
