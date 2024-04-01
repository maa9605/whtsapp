package X;

import java.io.IOException;

/* renamed from: X.24e  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C459024e extends C0AZ implements C0AY {
    public static final C459024e A05;
    public static volatile C0RQ A06;
    public int A00;
    public int A01;
    public C0AN A02;
    public C0AN A03;
    public AnonymousClass204 A04;

    static {
        C459024e c459024e = new C459024e();
        A05 = c459024e;
        c459024e.A0E();
    }

    public C459024e() {
        C0AN c0an = C0AN.A01;
        this.A02 = c0an;
        this.A03 = c0an;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C877940o c877940o;
        switch (c0rl.ordinal()) {
            case 0:
                return A05;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C459024e c459024e = (C459024e) obj2;
                this.A02 = c0rm.AW2((this.A00 & 1) == 1, this.A02, (c459024e.A00 & 1) == 1, c459024e.A02);
                this.A04 = (AnonymousClass204) c0rm.AW9(this.A04, c459024e.A04);
                this.A03 = c0rm.AW2((this.A00 & 4) == 4, this.A03, (c459024e.A00 & 4) == 4, c459024e.A03);
                int i = this.A00;
                boolean z = (i & 8) == 8;
                int i2 = this.A01;
                int i3 = c459024e.A00;
                this.A01 = c0rm.AW5(z, i2, (i3 & 8) == 8, c459024e.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 = i | i3;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r5) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 10) {
                                this.A00 |= 1;
                                this.A02 = c0ro.A08();
                            } else if (A03 == 18) {
                                if ((this.A00 & 2) == 2) {
                                    c877940o = (C877940o) this.A04.AVX();
                                } else {
                                    c877940o = null;
                                }
                                AnonymousClass204 anonymousClass204 = (AnonymousClass204) c0ro.A09(AnonymousClass204.A0L.A0C(), c0rp);
                                this.A04 = anonymousClass204;
                                if (c877940o != null) {
                                    c877940o.A03(anonymousClass204);
                                    this.A04 = (AnonymousClass204) c877940o.A00();
                                }
                                this.A00 |= 2;
                            } else if (A03 == 26) {
                                this.A00 |= 4;
                                this.A03 = c0ro.A08();
                            } else if (A03 != 32) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                this.A00 |= 8;
                                this.A01 = c0ro.A02();
                            }
                        }
                        r5 = true;
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
                return new C459024e();
            case 5:
                return new C0CT() { // from class: X.40m
                    {
                        C459024e c459024e2 = C459024e.A05;
                    }
                };
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C459024e.class) {
                        if (A06 == null) {
                            A06 = new C0RR(A05);
                        }
                    }
                }
                return A06;
            default:
                throw new UnsupportedOperationException();
        }
        return A05;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = this.A00;
        int A09 = (i2 & 1) == 1 ? 0 + C0RS.A09(1, this.A02) : 0;
        if ((i2 & 2) == 2) {
            AnonymousClass204 anonymousClass204 = this.A04;
            if (anonymousClass204 == null) {
                anonymousClass204 = AnonymousClass204.A0L;
            }
            A09 += C0RS.A0A(2, anonymousClass204);
        }
        int i3 = this.A00;
        if ((i3 & 4) == 4) {
            A09 += C0RS.A09(3, this.A03);
        }
        if ((i3 & 8) == 8) {
            A09 += C0RS.A05(4, this.A01);
        }
        int A00 = this.unknownFields.A00() + A09;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0N(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            AnonymousClass204 anonymousClass204 = this.A04;
            if (anonymousClass204 == null) {
                anonymousClass204 = AnonymousClass204.A0L;
            }
            c0rs.A0O(2, anonymousClass204);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0N(3, this.A03);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0I(4, this.A01);
        }
        this.unknownFields.A02(c0rs);
    }
}
