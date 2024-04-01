package X;

import java.io.IOException;

/* renamed from: X.418  reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass418 extends C0AZ implements C0AY {
    public static final AnonymousClass418 A08;
    public static volatile C0RQ A09;
    public int A00;
    public boolean A07;
    public String A02 = "";
    public String A03 = "";
    public String A04 = "";
    public String A06 = "";
    public String A01 = "";
    public String A05 = "";

    static {
        AnonymousClass418 anonymousClass418 = new AnonymousClass418();
        A08 = anonymousClass418;
        anonymousClass418.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A08;
            case 1:
                C0RM c0rm = (C0RM) obj;
                AnonymousClass418 anonymousClass418 = (AnonymousClass418) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                String str = this.A02;
                int i2 = anonymousClass418.A00;
                this.A02 = c0rm.AWD(z, str, (i2 & 1) == 1, anonymousClass418.A02);
                this.A03 = c0rm.AWD((i & 2) == 2, this.A03, (i2 & 2) == 2, anonymousClass418.A03);
                this.A04 = c0rm.AWD((i & 4) == 4, this.A04, (i2 & 4) == 4, anonymousClass418.A04);
                this.A06 = c0rm.AWD((i & 8) == 8, this.A06, (i2 & 8) == 8, anonymousClass418.A06);
                this.A01 = c0rm.AWD((i & 16) == 16, this.A01, (i2 & 16) == 16, anonymousClass418.A01);
                this.A05 = c0rm.AWD((i & 32) == 32, this.A05, (i2 & 32) == 32, anonymousClass418.A05);
                this.A07 = c0rm.AW1((i & 64) == 64, this.A07, (i2 & 64) == 64, anonymousClass418.A07);
                if (c0rm == C0RN.A00) {
                    this.A00 = i | i2;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r8) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 10) {
                                String A0A = c0ro.A0A();
                                this.A00 |= 1;
                                this.A02 = A0A;
                            } else if (A03 == 18) {
                                String A0A2 = c0ro.A0A();
                                this.A00 |= 2;
                                this.A03 = A0A2;
                            } else if (A03 == 26) {
                                String A0A3 = c0ro.A0A();
                                this.A00 |= 4;
                                this.A04 = A0A3;
                            } else if (A03 == 34) {
                                String A0A4 = c0ro.A0A();
                                this.A00 |= 8;
                                this.A06 = A0A4;
                            } else if (A03 == 42) {
                                String A0A5 = c0ro.A0A();
                                this.A00 |= 16;
                                this.A01 = A0A5;
                            } else if (A03 == 50) {
                                String A0A6 = c0ro.A0A();
                                this.A00 |= 32;
                                this.A05 = A0A6;
                            } else if (A03 != 56) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                this.A00 |= 64;
                                this.A07 = c0ro.A0F();
                            }
                        }
                        r8 = true;
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
                return new AnonymousClass418();
            case 5:
                return new C0CT() { // from class: X.417
                    {
                        AnonymousClass418 anonymousClass4182 = AnonymousClass418.A08;
                    }
                };
            case 6:
                break;
            case 7:
                if (A09 == null) {
                    synchronized (AnonymousClass418.class) {
                        if (A09 == null) {
                            A09 = new C0RR(A08);
                        }
                    }
                }
                return A09;
            default:
                throw new UnsupportedOperationException();
        }
        return A08;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0B = (this.A00 & 1) == 1 ? 0 + C0RS.A0B(1, this.A02) : 0;
        if ((this.A00 & 2) == 2) {
            A0B += C0RS.A0B(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            A0B += C0RS.A0B(3, this.A04);
        }
        if ((this.A00 & 8) == 8) {
            A0B += C0RS.A0B(4, this.A06);
        }
        if ((this.A00 & 16) == 16) {
            A0B += C0RS.A0B(5, this.A01);
        }
        if ((this.A00 & 32) == 32) {
            A0B += C0RS.A0B(6, this.A05);
        }
        if ((this.A00 & 64) == 64) {
            A0B += C0RS.A00(7);
        }
        int A00 = this.unknownFields.A00() + A0B;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0P(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0P(3, this.A04);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0P(4, this.A06);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0P(5, this.A01);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0P(6, this.A05);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0Q(7, this.A07);
        }
        this.unknownFields.A02(c0rs);
    }
}
