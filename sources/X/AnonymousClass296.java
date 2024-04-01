package X;

import java.io.IOException;

/* renamed from: X.296  reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass296 extends C0AZ implements C0AY {
    public static final AnonymousClass296 A06;
    public static volatile C0RQ A07;
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public int A03 = -1;
    public C0O0 A05 = C09550eI.A02;

    static {
        AnonymousClass296 anonymousClass296 = new AnonymousClass296();
        A06 = anonymousClass296;
        anonymousClass296.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A06;
            case 1:
                C0RM c0rm = (C0RM) obj;
                AnonymousClass296 anonymousClass296 = (AnonymousClass296) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                int i2 = this.A02;
                int i3 = anonymousClass296.A00;
                this.A02 = c0rm.AW5(z, i2, (i3 & 1) == 1, anonymousClass296.A02);
                this.A04 = c0rm.AW8((i & 2) == 2, this.A04, (i3 & 2) == 2, anonymousClass296.A04);
                this.A01 = c0rm.AW5((i & 4) == 4, this.A01, (i3 & 4) == 4, anonymousClass296.A01);
                this.A05 = c0rm.AW6(this.A05, anonymousClass296.A05);
                if (c0rm == C0RN.A00) {
                    this.A00 |= anonymousClass296.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r6) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 8) {
                                this.A00 |= 1;
                                this.A02 = c0ro.A02();
                            } else if (A03 == 16) {
                                this.A00 |= 2;
                                this.A04 = c0ro.A06();
                            } else if (A03 == 24) {
                                this.A00 |= 4;
                                this.A01 = c0ro.A02();
                            } else if (A03 == 32) {
                                C0O0 c0o0 = this.A05;
                                C0O0 c0o02 = c0o0;
                                if (!((C0CY) c0o0).A00) {
                                    c0o02 = C0AZ.A04(c0o0);
                                    this.A05 = c0o02;
                                }
                                C09550eI c09550eI = (C09550eI) c0o02;
                                c09550eI.A03(c09550eI.A00, c0ro.A02());
                            } else if (A03 != 34) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                int A04 = c0ro.A04(c0ro.A02());
                                C0O0 c0o03 = this.A05;
                                if (!((C0CY) c0o03).A00 && c0ro.A00() > 0) {
                                    this.A05 = C0AZ.A04(c0o03);
                                }
                                while (c0ro.A00() > 0) {
                                    C09550eI c09550eI2 = (C09550eI) this.A05;
                                    c09550eI2.A03(c09550eI2.A00, c0ro.A02());
                                }
                                c0ro.A03 = A04;
                                c0ro.A0B();
                            }
                        }
                        r6 = true;
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
                ((C0CY) this.A05).A00 = false;
                return null;
            case 4:
                return new AnonymousClass296();
            case 5:
                return new C0CT() { // from class: X.3yx
                    {
                        AnonymousClass296 anonymousClass2962 = AnonymousClass296.A06;
                    }
                };
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (AnonymousClass296.class) {
                        if (A07 == null) {
                            A07 = new C0RR(A06);
                        }
                    }
                }
                return A07;
            default:
                throw new UnsupportedOperationException();
        }
        return A06;
    }

    @Override // X.C0AX
    public int AD4() {
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.A00;
        if ((i3 & 1) == 1) {
            i = C0RS.A06(1, this.A02) + 0;
        } else {
            i = 0;
        }
        if ((i3 & 2) == 2) {
            i += C0RS.A08(2, this.A04);
        }
        if ((i3 & 4) == 4) {
            i += C0RS.A06(3, this.A01);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.A05.size(); i5++) {
            C09550eI c09550eI = (C09550eI) this.A05;
            c09550eI.A02(i5);
            i4 += C0RS.A03(c09550eI.A01[i5]);
        }
        int i6 = i + i4;
        if (!this.A05.isEmpty()) {
            i6 = i6 + 1 + C0RS.A02(i4);
        }
        this.A03 = i4;
        int A00 = this.unknownFields.A00() + i6;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        AD4();
        if ((this.A00 & 1) == 1) {
            c0rs.A0K(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0M(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0K(3, this.A01);
        }
        if (this.A05.size() > 0) {
            c0rs.A0F(34);
            c0rs.A0F(this.A03);
        }
        for (int i = 0; i < this.A05.size(); i++) {
            C09550eI c09550eI = (C09550eI) this.A05;
            c09550eI.A02(i);
            c0rs.A0F(c09550eI.A01[i]);
        }
        this.unknownFields.A02(c0rs);
    }
}
