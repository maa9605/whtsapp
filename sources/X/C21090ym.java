package X;

import android.util.Pair;

/* renamed from: X.0ym  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21090ym {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C21070yk A04;
    public C21070yk A05;
    public C21070yk A06;
    public Object A08;
    public boolean A09;
    public final C21210yy A0A = new C21210yy();
    public final C21220yz A0B = new C21220yz();
    public AbstractC21230z0 A07 = AbstractC21230z0.A00;

    public C21070yk A00() {
        C21070yk c21070yk = this.A05;
        if (c21070yk != null) {
            if (c21070yk == this.A06) {
                this.A06 = c21070yk.A01;
            }
            c21070yk.A02();
            int i = this.A00 - 1;
            this.A00 = i;
            if (i == 0) {
                this.A04 = null;
                C21070yk c21070yk2 = this.A05;
                this.A08 = c21070yk2.A0B;
                this.A03 = c21070yk2.A02.A03.A03;
            }
            C21070yk c21070yk3 = this.A05.A01;
            this.A05 = c21070yk3;
            return c21070yk3;
        }
        C21070yk c21070yk4 = this.A04;
        this.A05 = c21070yk4;
        this.A06 = c21070yk4;
        return c21070yk4;
    }

    public final C21080yl A01(C21070yk c21070yk, long j) {
        C21080yl c21080yl = c21070yk.A02;
        long j2 = (c21070yk.A00 + c21080yl.A01) - j;
        long j3 = 0;
        if (c21080yl.A05) {
            int A04 = this.A07.A04(c21080yl.A03.A04);
            AbstractC21230z0 abstractC21230z0 = this.A07;
            C21210yy c21210yy = this.A0A;
            C21220yz c21220yz = this.A0B;
            int A03 = abstractC21230z0.A03(A04, c21210yy, c21220yz, this.A01, this.A09);
            if (A03 == -1) {
                return null;
            }
            int i = this.A07.A08(A03, c21210yy, true).A00;
            Object obj = c21210yy.A04;
            long j4 = c21080yl.A03.A03;
            if (this.A07.A0A(i, c21220yz).A00 == A03) {
                Pair A07 = this.A07.A07(c21220yz, c21210yy, i, -9223372036854775807L, Math.max(0L, j2));
                if (A07 == null) {
                    return null;
                }
                obj = A07.first;
                j3 = ((Number) A07.second).longValue();
                C21070yk c21070yk2 = c21070yk.A01;
                if (c21070yk2 != null && c21070yk2.A0B.equals(obj)) {
                    j4 = c21070yk.A01.A02.A03.A03;
                } else {
                    j4 = this.A02;
                    this.A02 = 1 + j4;
                }
            }
            C219010g A05 = A05(obj, j3, j4);
            AbstractC21230z0 abstractC21230z02 = this.A07;
            Object obj2 = A05.A04;
            abstractC21230z02.A09(obj2, c21210yy);
            if (A05.A00()) {
                return null;
            }
            return A03(obj2, j3, A05.A03);
        }
        C219010g c219010g = c21080yl.A03;
        AbstractC21230z0 abstractC21230z03 = this.A07;
        Object obj3 = c219010g.A04;
        C21210yy c21210yy2 = this.A0A;
        abstractC21230z03.A09(obj3, c21210yy2);
        if (c219010g.A00()) {
            return null;
        }
        long j5 = c21080yl.A03.A02;
        if (j5 != Long.MIN_VALUE) {
            long[] jArr = c21210yy2.A03.A02;
            int length = jArr.length - 1;
            while (true) {
                if (length >= 0) {
                    long j6 = jArr[length];
                    if (j6 != Long.MIN_VALUE && j5 >= j6) {
                        break;
                    }
                    length--;
                } else {
                    length = -1;
                    break;
                }
            }
            if (length == -1) {
                return A03(c219010g.A04, j5, c219010g.A03);
            }
            return null;
        }
        AnonymousClass111 anonymousClass111 = c21210yy2.A03;
        int i2 = anonymousClass111.A00;
        if (i2 == 0) {
            return null;
        }
        return anonymousClass111.A02[i2 - 1] == Long.MIN_VALUE ? null : null;
    }

    public C21080yl A02(C21080yl c21080yl) {
        long j;
        C219010g c219010g = c21080yl.A03;
        boolean A09 = A09(c219010g);
        boolean A0A = A0A(c219010g, A09);
        AbstractC21230z0 abstractC21230z0 = this.A07;
        Object obj = c219010g.A04;
        C21210yy c21210yy = this.A0A;
        abstractC21230z0.A09(obj, c21210yy);
        if (c219010g.A00()) {
            j = -9223372036854775807L;
        } else {
            j = c219010g.A02;
            if (j == Long.MIN_VALUE) {
                j = c21210yy.A01;
            }
        }
        return new C21080yl(c219010g, c21080yl.A02, c21080yl.A00, j, A09, A0A);
    }

    public final C21080yl A03(Object obj, long j, long j2) {
        C21210yy c21210yy = this.A0A;
        int A00 = c21210yy.A00(j);
        long j3 = A00 == -1 ? Long.MIN_VALUE : c21210yy.A03.A02[A00];
        C219010g c219010g = new C219010g(obj, j2, j3);
        this.A07.A09(c219010g.A04, c21210yy);
        boolean A09 = A09(c219010g);
        boolean A0A = A0A(c219010g, A09);
        if (j3 == Long.MIN_VALUE) {
            j3 = c21210yy.A01;
        }
        return new C21080yl(c219010g, j, -9223372036854775807L, j3, A09, A0A);
    }

    public C219010g A04(Object obj, long j) {
        long j2;
        int A04;
        AbstractC21230z0 abstractC21230z0 = this.A07;
        C21210yy c21210yy = this.A0A;
        int i = abstractC21230z0.A09(obj, c21210yy).A00;
        Object obj2 = this.A08;
        if (obj2 != null && (A04 = this.A07.A04(obj2)) != -1 && this.A07.A08(A04, c21210yy, false).A00 == i) {
            j2 = this.A03;
        } else {
            C21070yk c21070yk = this.A05;
            if (c21070yk == null) {
                c21070yk = this.A04;
            }
            while (true) {
                if (c21070yk != null) {
                    if (c21070yk.A0B.equals(obj)) {
                        j2 = c21070yk.A02.A03.A03;
                        break;
                    }
                    c21070yk = c21070yk.A01;
                } else {
                    C21070yk c21070yk2 = this.A05;
                    if (c21070yk2 == null) {
                        c21070yk2 = this.A04;
                    }
                    while (true) {
                        if (c21070yk2 != null) {
                            int A042 = this.A07.A04(c21070yk2.A0B);
                            if (A042 != -1 && this.A07.A08(A042, c21210yy, false).A00 == i) {
                                j2 = c21070yk2.A02.A03.A03;
                                break;
                            }
                            c21070yk2 = c21070yk2.A01;
                        } else {
                            j2 = this.A02;
                            this.A02 = 1 + j2;
                            break;
                        }
                    }
                }
            }
        }
        return A05(obj, j, j2);
    }

    public final C219010g A05(Object obj, long j, long j2) {
        AbstractC21230z0 abstractC21230z0 = this.A07;
        C21210yy c21210yy = this.A0A;
        abstractC21230z0.A09(obj, c21210yy);
        AnonymousClass111 anonymousClass111 = c21210yy.A03;
        long[] jArr = anonymousClass111.A02;
        int length = jArr.length - 1;
        while (true) {
            if (length >= 0) {
                long j3 = jArr[length];
                if (j3 != Long.MIN_VALUE && j >= j3) {
                    break;
                }
                length--;
            } else {
                length = -1;
                break;
            }
        }
        if (length == -1) {
            int A00 = c21210yy.A00(j);
            return new C219010g(obj, j2, A00 == -1 ? Long.MIN_VALUE : jArr[A00]);
        }
        AnonymousClass110 anonymousClass110 = anonymousClass111.A03[length];
        int i = 0;
        while (true) {
            int[] iArr = anonymousClass110.A01;
            if (i >= iArr.length || iArr[i] == 0 || iArr[i] == 1) {
                break;
            }
            i++;
        }
        return new C219010g(obj, length, i, j2);
    }

    public void A06(boolean z) {
        Object obj;
        C21070yk c21070yk = this.A05;
        if (c21070yk == null) {
            c21070yk = this.A04;
        }
        if (c21070yk != null) {
            if (z) {
                obj = c21070yk.A0B;
            } else {
                obj = null;
            }
            this.A08 = obj;
            this.A03 = c21070yk.A02.A03.A03;
            c21070yk.A02();
            A08(c21070yk);
        } else if (!z) {
            this.A08 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A07() {
        C21070yk c21070yk;
        C21070yk c21070yk2 = this.A05;
        if (c21070yk2 == null) {
            c21070yk2 = this.A04;
        }
        if (c21070yk2 == null) {
            return true;
        }
        int A04 = this.A07.A04(c21070yk2.A0B);
        while (true) {
            A04 = this.A07.A03(A04, this.A0A, this.A0B, this.A01, this.A09);
            while (true) {
                c21070yk = c21070yk2.A01;
                if (c21070yk == null || c21070yk2.A02.A05) {
                    break;
                }
                c21070yk2 = c21070yk;
            }
            if (A04 == -1 || c21070yk == null || this.A07.A04(c21070yk.A0B) != A04) {
                break;
            }
            c21070yk2 = c21070yk2.A01;
        }
        boolean A08 = A08(c21070yk2);
        c21070yk2.A02 = A02(c21070yk2.A02);
        if (!A08 || this.A05 == null) {
            return true;
        }
        return false;
    }

    public boolean A08(C21070yk c21070yk) {
        boolean z = false;
        C002701i.A1K(c21070yk != null);
        this.A04 = c21070yk;
        while (true) {
            c21070yk = c21070yk.A01;
            if (c21070yk != null) {
                if (c21070yk == this.A06) {
                    this.A06 = this.A05;
                    z = true;
                }
                c21070yk.A02();
                this.A00--;
            } else {
                this.A04.A01 = null;
                return z;
            }
        }
    }

    public final boolean A09(C219010g c219010g) {
        AbstractC21230z0 abstractC21230z0 = this.A07;
        Object obj = c219010g.A04;
        C21210yy c21210yy = this.A0A;
        int i = abstractC21230z0.A09(obj, c21210yy).A03.A00;
        if (i == 0) {
            return true;
        }
        return (c21210yy.A03.A02[i - 1] == Long.MIN_VALUE || c219010g.A00() || c219010g.A02 != Long.MIN_VALUE) ? false : true;
    }

    public final boolean A0A(C219010g c219010g, boolean z) {
        int A04 = this.A07.A04(c219010g.A04);
        AbstractC21230z0 abstractC21230z0 = this.A07;
        C21210yy c21210yy = this.A0A;
        int i = abstractC21230z0.A08(A04, c21210yy, false).A00;
        AbstractC21230z0 abstractC21230z02 = this.A07;
        C21220yz c21220yz = this.A0B;
        abstractC21230z02.A0A(i, c21220yz);
        return this.A07.A03(A04, c21210yy, c21220yz, this.A01, this.A09) == -1 && z;
    }
}
