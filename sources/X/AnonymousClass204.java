package X;

import java.io.IOException;

/* renamed from: X.204 */
/* loaded from: classes2.dex */
public final class AnonymousClass204 extends C0AZ implements C0AY {
    public static final AnonymousClass204 A0L;
    public static volatile C0RQ A0M;
    public int A00;
    public long A01;
    public C20H A02;
    public C20I A03;
    public C20L A04;
    public AnonymousClass207 A05;
    public AnonymousClass209 A06;
    public C20A A07;
    public C878640v A08;
    public C878840x A09;
    public C20J A0A;
    public C20C A0B;
    public C20F A0C;
    public C20G A0D;
    public C20D A0E;
    public AnonymousClass414 A0F;
    public AnonymousClass416 A0G;
    public AnonymousClass418 A0H;
    public C41A A0I;
    public C41C A0J;
    public C20E A0K;

    static {
        AnonymousClass204 anonymousClass204 = new AnonymousClass204();
        A0L = anonymousClass204;
        anonymousClass204.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C878240r c878240r;
        C878040p c878040p;
        C879040z c879040z;
        C878440t c878440t;
        C878340s c878340s;
        C877840n c877840n;
        C878940y c878940y;
        C878540u c878540u;
        C878740w c878740w;
        AnonymousClass415 anonymousClass415;
        AnonymousClass417 anonymousClass417;
        AnonymousClass419 anonymousClass419;
        AnonymousClass413 anonymousClass413;
        AnonymousClass412 anonymousClass412;
        C41B c41b;
        AnonymousClass411 anonymousClass411;
        AnonymousClass410 anonymousClass410;
        C878140q c878140q;
        C41D c41d;
        boolean z = false;
        switch (c0rl.ordinal()) {
            case 0:
                return A0L;
            case 1:
                C0RM c0rm = (C0RM) obj;
                AnonymousClass204 anonymousClass204 = (AnonymousClass204) obj2;
                this.A01 = c0rm.AW8((this.A00 & 1) == 1, this.A01, (anonymousClass204.A00 & 1) == 1, anonymousClass204.A01);
                this.A0K = (C20E) c0rm.AW9(this.A0K, anonymousClass204.A0K);
                this.A04 = (C20L) c0rm.AW9(this.A04, anonymousClass204.A04);
                this.A0C = (C20F) c0rm.AW9(this.A0C, anonymousClass204.A0C);
                this.A0D = (C20G) c0rm.AW9(this.A0D, anonymousClass204.A0D);
                this.A0J = (C41C) c0rm.AW9(this.A0J, anonymousClass204.A0J);
                this.A0E = (C20D) c0rm.AW9(this.A0E, anonymousClass204.A0E);
                this.A0F = (AnonymousClass414) c0rm.AW9(this.A0F, anonymousClass204.A0F);
                this.A0I = (C41A) c0rm.AW9(this.A0I, anonymousClass204.A0I);
                this.A0H = (AnonymousClass418) c0rm.AW9(this.A0H, anonymousClass204.A0H);
                this.A0G = (AnonymousClass416) c0rm.AW9(this.A0G, anonymousClass204.A0G);
                this.A09 = (C878840x) c0rm.AW9(this.A09, anonymousClass204.A09);
                this.A08 = (C878640v) c0rm.AW9(this.A08, anonymousClass204.A08);
                this.A0A = (C20J) c0rm.AW9(this.A0A, anonymousClass204.A0A);
                this.A02 = (C20H) c0rm.AW9(this.A02, anonymousClass204.A02);
                this.A06 = (AnonymousClass209) c0rm.AW9(this.A06, anonymousClass204.A06);
                this.A07 = (C20A) c0rm.AW9(this.A07, anonymousClass204.A07);
                this.A0B = (C20C) c0rm.AW9(this.A0B, anonymousClass204.A0B);
                this.A03 = (C20I) c0rm.AW9(this.A03, anonymousClass204.A03);
                this.A05 = (AnonymousClass207) c0rm.AW9(this.A05, anonymousClass204.A05);
                if (c0rm == C0RN.A00) {
                    this.A00 |= anonymousClass204.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!z) {
                    try {
                        int A03 = c0ro.A03();
                        switch (A03) {
                            case 0:
                                break;
                            case 8:
                                this.A00 |= 1;
                                this.A01 = c0ro.A06();
                                continue;
                            case 18:
                                if ((this.A00 & 2) == 2) {
                                    c41d = (C41D) this.A0K.AVX();
                                } else {
                                    c41d = null;
                                }
                                C20E c20e = (C20E) c0ro.A09(C20E.A02.A0C(), c0rp);
                                this.A0K = c20e;
                                if (c41d != null) {
                                    c41d.A03(c20e);
                                    this.A0K = (C20E) c41d.A00();
                                }
                                this.A00 |= 2;
                                continue;
                            case 26:
                                if ((this.A00 & 4) == 4) {
                                    c878140q = (C878140q) this.A04.AVX();
                                } else {
                                    c878140q = null;
                                }
                                C20L c20l = (C20L) c0ro.A09(C20L.A03.A0C(), c0rp);
                                this.A04 = c20l;
                                if (c878140q != null) {
                                    c878140q.A03(c20l);
                                    this.A04 = (C20L) c878140q.A00();
                                }
                                this.A00 |= 4;
                                continue;
                            case 34:
                                if ((this.A00 & 8) == 8) {
                                    anonymousClass410 = (AnonymousClass410) this.A0C.AVX();
                                } else {
                                    anonymousClass410 = null;
                                }
                                C20F c20f = (C20F) c0ro.A09(C20F.A03.A0C(), c0rp);
                                this.A0C = c20f;
                                if (anonymousClass410 != null) {
                                    anonymousClass410.A03(c20f);
                                    this.A0C = (C20F) anonymousClass410.A00();
                                }
                                this.A00 |= 8;
                                continue;
                            case 42:
                                if ((this.A00 & 16) == 16) {
                                    anonymousClass411 = (AnonymousClass411) this.A0D.AVX();
                                } else {
                                    anonymousClass411 = null;
                                }
                                C20G c20g = (C20G) c0ro.A09(C20G.A02.A0C(), c0rp);
                                this.A0D = c20g;
                                if (anonymousClass411 != null) {
                                    anonymousClass411.A03(c20g);
                                    this.A0D = (C20G) anonymousClass411.A00();
                                }
                                this.A00 |= 16;
                                continue;
                            case 50:
                                if ((this.A00 & 32) == 32) {
                                    c41b = (C41B) this.A0J.AVX();
                                } else {
                                    c41b = null;
                                }
                                C41C c41c = (C41C) c0ro.A09(C41C.A02.A0C(), c0rp);
                                this.A0J = c41c;
                                if (c41b != null) {
                                    c41b.A03(c41c);
                                    this.A0J = (C41C) c41b.A00();
                                }
                                this.A00 |= 32;
                                continue;
                            case 58:
                                if ((this.A00 & 64) == 64) {
                                    anonymousClass412 = (AnonymousClass412) this.A0E.AVX();
                                } else {
                                    anonymousClass412 = null;
                                }
                                C20D c20d = (C20D) c0ro.A09(C20D.A02.A0C(), c0rp);
                                this.A0E = c20d;
                                if (anonymousClass412 != null) {
                                    anonymousClass412.A03(c20d);
                                    this.A0E = (C20D) anonymousClass412.A00();
                                }
                                this.A00 |= 64;
                                continue;
                            case 66:
                                if ((this.A00 & 128) == 128) {
                                    anonymousClass413 = (AnonymousClass413) this.A0F.AVX();
                                } else {
                                    anonymousClass413 = null;
                                }
                                AnonymousClass414 anonymousClass414 = (AnonymousClass414) c0ro.A09(AnonymousClass414.A06.A0C(), c0rp);
                                this.A0F = anonymousClass414;
                                if (anonymousClass413 != null) {
                                    anonymousClass413.A03(anonymousClass414);
                                    this.A0F = (AnonymousClass414) anonymousClass413.A00();
                                }
                                this.A00 |= 128;
                                continue;
                            case 74:
                                if ((this.A00 & 256) == 256) {
                                    anonymousClass419 = (AnonymousClass419) this.A0I.AVX();
                                } else {
                                    anonymousClass419 = null;
                                }
                                C41A c41a = (C41A) c0ro.A09(C41A.A01.A0C(), c0rp);
                                this.A0I = c41a;
                                if (anonymousClass419 != null) {
                                    anonymousClass419.A03(c41a);
                                    this.A0I = (C41A) anonymousClass419.A00();
                                }
                                this.A00 |= 256;
                                continue;
                            case 82:
                                if ((this.A00 & 512) == 512) {
                                    anonymousClass417 = (AnonymousClass417) this.A0H.AVX();
                                } else {
                                    anonymousClass417 = null;
                                }
                                AnonymousClass418 anonymousClass418 = (AnonymousClass418) c0ro.A09(AnonymousClass418.A08.A0C(), c0rp);
                                this.A0H = anonymousClass418;
                                if (anonymousClass417 != null) {
                                    anonymousClass417.A03(anonymousClass418);
                                    this.A0H = (AnonymousClass418) anonymousClass417.A00();
                                }
                                this.A00 |= 512;
                                continue;
                            case 90:
                                if ((this.A00 & 1024) == 1024) {
                                    anonymousClass415 = (AnonymousClass415) this.A0G.AVX();
                                } else {
                                    anonymousClass415 = null;
                                }
                                AnonymousClass416 anonymousClass416 = (AnonymousClass416) c0ro.A09(AnonymousClass416.A01.A0C(), c0rp);
                                this.A0G = anonymousClass416;
                                if (anonymousClass415 != null) {
                                    anonymousClass415.A03(anonymousClass416);
                                    this.A0G = (AnonymousClass416) anonymousClass415.A00();
                                }
                                this.A00 |= 1024;
                                continue;
                            case 114:
                                if ((this.A00 & 2048) == 2048) {
                                    c878740w = (C878740w) this.A09.AVX();
                                } else {
                                    c878740w = null;
                                }
                                C878840x c878840x = (C878840x) c0ro.A09(C878840x.A05.A0C(), c0rp);
                                this.A09 = c878840x;
                                if (c878740w != null) {
                                    c878740w.A03(c878840x);
                                    this.A09 = (C878840x) c878740w.A00();
                                }
                                this.A00 |= 2048;
                                continue;
                            case 122:
                                if ((this.A00 & 4096) == 4096) {
                                    c878540u = (C878540u) this.A08.AVX();
                                } else {
                                    c878540u = null;
                                }
                                C878640v c878640v = (C878640v) c0ro.A09(C878640v.A02.A0C(), c0rp);
                                this.A08 = c878640v;
                                if (c878540u != null) {
                                    c878540u.A03(c878640v);
                                    this.A08 = (C878640v) c878540u.A00();
                                }
                                this.A00 |= 4096;
                                continue;
                            case 130:
                                if ((this.A00 & 8192) == 8192) {
                                    c878940y = (C878940y) this.A0A.AVX();
                                } else {
                                    c878940y = null;
                                }
                                C20J c20j = (C20J) c0ro.A09(C20J.A02.A0C(), c0rp);
                                this.A0A = c20j;
                                if (c878940y != null) {
                                    c878940y.A03(c20j);
                                    this.A0A = (C20J) c878940y.A00();
                                }
                                this.A00 |= 8192;
                                continue;
                            case 138:
                                if ((this.A00 & 16384) == 16384) {
                                    c877840n = (C877840n) this.A02.AVX();
                                } else {
                                    c877840n = null;
                                }
                                C20H c20h = (C20H) c0ro.A09(C20H.A03.A0C(), c0rp);
                                this.A02 = c20h;
                                if (c877840n != null) {
                                    c877840n.A03(c20h);
                                    this.A02 = (C20H) c877840n.A00();
                                }
                                this.A00 |= 16384;
                                continue;
                            case 146:
                                if ((this.A00 & 32768) == 32768) {
                                    c878340s = (C878340s) this.A06.AVX();
                                } else {
                                    c878340s = null;
                                }
                                AnonymousClass209 anonymousClass209 = (AnonymousClass209) c0ro.A09(AnonymousClass209.A03.A0C(), c0rp);
                                this.A06 = anonymousClass209;
                                if (c878340s != null) {
                                    c878340s.A03(anonymousClass209);
                                    this.A06 = (AnonymousClass209) c878340s.A00();
                                }
                                this.A00 |= 32768;
                                continue;
                            case 154:
                                if ((this.A00 & 65536) == 65536) {
                                    c878440t = (C878440t) this.A07.AVX();
                                } else {
                                    c878440t = null;
                                }
                                C20A c20a = (C20A) c0ro.A09(C20A.A02.A0C(), c0rp);
                                this.A07 = c20a;
                                if (c878440t != null) {
                                    c878440t.A03(c20a);
                                    this.A07 = (C20A) c878440t.A00();
                                }
                                this.A00 |= 65536;
                                continue;
                            case 162:
                                if ((this.A00 & C42271vT.A09) == 131072) {
                                    c879040z = (C879040z) this.A0B.AVX();
                                } else {
                                    c879040z = null;
                                }
                                C20C c20c = (C20C) c0ro.A09(C20C.A03.A0C(), c0rp);
                                this.A0B = c20c;
                                if (c879040z != null) {
                                    c879040z.A03(c20c);
                                    this.A0B = (C20C) c879040z.A00();
                                }
                                this.A00 |= C42271vT.A09;
                                continue;
                            case 170:
                                if ((this.A00 & 262144) == 262144) {
                                    c878040p = (C878040p) this.A03.AVX();
                                } else {
                                    c878040p = null;
                                }
                                C20I c20i = (C20I) c0ro.A09(C20I.A02.A0C(), c0rp);
                                this.A03 = c20i;
                                if (c878040p != null) {
                                    c878040p.A03(c20i);
                                    this.A03 = (C20I) c878040p.A00();
                                }
                                this.A00 |= 262144;
                                continue;
                            case 178:
                                if ((this.A00 & 524288) == 524288) {
                                    c878240r = (C878240r) this.A05.AVX();
                                } else {
                                    c878240r = null;
                                }
                                AnonymousClass207 anonymousClass207 = (AnonymousClass207) c0ro.A09(AnonymousClass207.A02.A0C(), c0rp);
                                this.A05 = anonymousClass207;
                                if (c878240r != null) {
                                    c878240r.A03(anonymousClass207);
                                    this.A05 = (AnonymousClass207) c878240r.A00();
                                }
                                this.A00 |= 524288;
                                continue;
                            default:
                                if (!A0I(A03, c0ro)) {
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        z = true;
                    } catch (C0JX e) {
                        e.unfinishedMessage = this;
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        C0JX c0jx = new C0JX(e2.getMessage());
                        c0jx.unfinishedMessage = this;
                        throw new RuntimeException(c0jx);
                    }
                }
                break;
            case 3:
                return null;
            case 4:
                return new AnonymousClass204();
            case 5:
                return new C0CT() { // from class: X.40o
                    {
                        AnonymousClass204 anonymousClass2042 = AnonymousClass204.A0L;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0M == null) {
                    synchronized (AnonymousClass204.class) {
                        if (A0M == null) {
                            A0M = new C0RR(A0L);
                        }
                    }
                }
                return A0M;
            default:
                throw new UnsupportedOperationException();
        }
        return A0L;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = this.A00;
        int A07 = (i2 & 1) == 1 ? 0 + C0RS.A07(1, this.A01) : 0;
        if ((i2 & 2) == 2) {
            C20E c20e = this.A0K;
            if (c20e == null) {
                c20e = C20E.A02;
            }
            A07 += C0RS.A0A(2, c20e);
        }
        if ((this.A00 & 4) == 4) {
            C20L c20l = this.A04;
            if (c20l == null) {
                c20l = C20L.A03;
            }
            A07 += C0RS.A0A(3, c20l);
        }
        if ((this.A00 & 8) == 8) {
            C20F c20f = this.A0C;
            if (c20f == null) {
                c20f = C20F.A03;
            }
            A07 += C0RS.A0A(4, c20f);
        }
        if ((this.A00 & 16) == 16) {
            C20G c20g = this.A0D;
            if (c20g == null) {
                c20g = C20G.A02;
            }
            A07 += C0RS.A0A(5, c20g);
        }
        if ((this.A00 & 32) == 32) {
            C41C c41c = this.A0J;
            if (c41c == null) {
                c41c = C41C.A02;
            }
            A07 += C0RS.A0A(6, c41c);
        }
        if ((this.A00 & 64) == 64) {
            C20D c20d = this.A0E;
            if (c20d == null) {
                c20d = C20D.A02;
            }
            A07 += C0RS.A0A(7, c20d);
        }
        if ((this.A00 & 128) == 128) {
            AnonymousClass414 anonymousClass414 = this.A0F;
            if (anonymousClass414 == null) {
                anonymousClass414 = AnonymousClass414.A06;
            }
            A07 += C0RS.A0A(8, anonymousClass414);
        }
        if ((this.A00 & 256) == 256) {
            C41A c41a = this.A0I;
            if (c41a == null) {
                c41a = C41A.A01;
            }
            A07 += C0RS.A0A(9, c41a);
        }
        if ((this.A00 & 512) == 512) {
            AnonymousClass418 anonymousClass418 = this.A0H;
            if (anonymousClass418 == null) {
                anonymousClass418 = AnonymousClass418.A08;
            }
            A07 += C0RS.A0A(10, anonymousClass418);
        }
        if ((this.A00 & 1024) == 1024) {
            AnonymousClass416 anonymousClass416 = this.A0G;
            if (anonymousClass416 == null) {
                anonymousClass416 = AnonymousClass416.A01;
            }
            A07 += C0RS.A0A(11, anonymousClass416);
        }
        if ((this.A00 & 2048) == 2048) {
            C878840x c878840x = this.A09;
            if (c878840x == null) {
                c878840x = C878840x.A05;
            }
            A07 += C0RS.A0A(14, c878840x);
        }
        if ((this.A00 & 4096) == 4096) {
            C878640v c878640v = this.A08;
            if (c878640v == null) {
                c878640v = C878640v.A02;
            }
            A07 += C0RS.A0A(15, c878640v);
        }
        if ((this.A00 & 8192) == 8192) {
            C20J c20j = this.A0A;
            if (c20j == null) {
                c20j = C20J.A02;
            }
            A07 += C0RS.A0A(16, c20j);
        }
        if ((this.A00 & 16384) == 16384) {
            C20H c20h = this.A02;
            if (c20h == null) {
                c20h = C20H.A03;
            }
            A07 += C0RS.A0A(17, c20h);
        }
        if ((this.A00 & 32768) == 32768) {
            AnonymousClass209 anonymousClass209 = this.A06;
            if (anonymousClass209 == null) {
                anonymousClass209 = AnonymousClass209.A03;
            }
            A07 += C0RS.A0A(18, anonymousClass209);
        }
        if ((this.A00 & 65536) == 65536) {
            C20A c20a = this.A07;
            if (c20a == null) {
                c20a = C20A.A02;
            }
            A07 += C0RS.A0A(19, c20a);
        }
        if ((this.A00 & C42271vT.A09) == 131072) {
            C20C c20c = this.A0B;
            if (c20c == null) {
                c20c = C20C.A03;
            }
            A07 += C0RS.A0A(20, c20c);
        }
        if ((this.A00 & 262144) == 262144) {
            C20I c20i = this.A03;
            if (c20i == null) {
                c20i = C20I.A02;
            }
            A07 += C0RS.A0A(21, c20i);
        }
        if ((this.A00 & 524288) == 524288) {
            AnonymousClass207 anonymousClass207 = this.A05;
            if (anonymousClass207 == null) {
                anonymousClass207 = AnonymousClass207.A02;
            }
            A07 += C0RS.A0A(22, anonymousClass207);
        }
        int A00 = this.unknownFields.A00() + A07;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0M(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            C20E c20e = this.A0K;
            if (c20e == null) {
                c20e = C20E.A02;
            }
            c0rs.A0O(2, c20e);
        }
        if ((this.A00 & 4) == 4) {
            C20L c20l = this.A04;
            if (c20l == null) {
                c20l = C20L.A03;
            }
            c0rs.A0O(3, c20l);
        }
        if ((this.A00 & 8) == 8) {
            C20F c20f = this.A0C;
            if (c20f == null) {
                c20f = C20F.A03;
            }
            c0rs.A0O(4, c20f);
        }
        if ((this.A00 & 16) == 16) {
            C20G c20g = this.A0D;
            if (c20g == null) {
                c20g = C20G.A02;
            }
            c0rs.A0O(5, c20g);
        }
        if ((this.A00 & 32) == 32) {
            C41C c41c = this.A0J;
            if (c41c == null) {
                c41c = C41C.A02;
            }
            c0rs.A0O(6, c41c);
        }
        if ((this.A00 & 64) == 64) {
            C20D c20d = this.A0E;
            if (c20d == null) {
                c20d = C20D.A02;
            }
            c0rs.A0O(7, c20d);
        }
        if ((this.A00 & 128) == 128) {
            AnonymousClass414 anonymousClass414 = this.A0F;
            if (anonymousClass414 == null) {
                anonymousClass414 = AnonymousClass414.A06;
            }
            c0rs.A0O(8, anonymousClass414);
        }
        if ((this.A00 & 256) == 256) {
            C41A c41a = this.A0I;
            if (c41a == null) {
                c41a = C41A.A01;
            }
            c0rs.A0O(9, c41a);
        }
        if ((this.A00 & 512) == 512) {
            AnonymousClass418 anonymousClass418 = this.A0H;
            if (anonymousClass418 == null) {
                anonymousClass418 = AnonymousClass418.A08;
            }
            c0rs.A0O(10, anonymousClass418);
        }
        if ((this.A00 & 1024) == 1024) {
            AnonymousClass416 anonymousClass416 = this.A0G;
            if (anonymousClass416 == null) {
                anonymousClass416 = AnonymousClass416.A01;
            }
            c0rs.A0O(11, anonymousClass416);
        }
        if ((this.A00 & 2048) == 2048) {
            C878840x c878840x = this.A09;
            if (c878840x == null) {
                c878840x = C878840x.A05;
            }
            c0rs.A0O(14, c878840x);
        }
        if ((this.A00 & 4096) == 4096) {
            C878640v c878640v = this.A08;
            if (c878640v == null) {
                c878640v = C878640v.A02;
            }
            c0rs.A0O(15, c878640v);
        }
        if ((this.A00 & 8192) == 8192) {
            C20J c20j = this.A0A;
            if (c20j == null) {
                c20j = C20J.A02;
            }
            c0rs.A0O(16, c20j);
        }
        if ((this.A00 & 16384) == 16384) {
            C20H c20h = this.A02;
            if (c20h == null) {
                c20h = C20H.A03;
            }
            c0rs.A0O(17, c20h);
        }
        if ((this.A00 & 32768) == 32768) {
            AnonymousClass209 anonymousClass209 = this.A06;
            if (anonymousClass209 == null) {
                anonymousClass209 = AnonymousClass209.A03;
            }
            c0rs.A0O(18, anonymousClass209);
        }
        if ((this.A00 & 65536) == 65536) {
            C20A c20a = this.A07;
            if (c20a == null) {
                c20a = C20A.A02;
            }
            c0rs.A0O(19, c20a);
        }
        if ((this.A00 & C42271vT.A09) == 131072) {
            C20C c20c = this.A0B;
            if (c20c == null) {
                c20c = C20C.A03;
            }
            c0rs.A0O(20, c20c);
        }
        if ((this.A00 & 262144) == 262144) {
            C20I c20i = this.A03;
            if (c20i == null) {
                c20i = C20I.A02;
            }
            c0rs.A0O(21, c20i);
        }
        if ((this.A00 & 524288) == 524288) {
            AnonymousClass207 anonymousClass207 = this.A05;
            if (anonymousClass207 == null) {
                anonymousClass207 = AnonymousClass207.A02;
            }
            c0rs.A0O(22, anonymousClass207);
        }
        this.unknownFields.A02(c0rs);
    }
}
