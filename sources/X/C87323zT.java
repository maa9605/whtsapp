package X;

import java.io.IOException;

/* renamed from: X.3zT  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87323zT extends C0AZ implements C0AY {
    public static final C87323zT A05;
    public static volatile C0RQ A06;
    public int A00;
    public int A01;
    public String A03 = "";
    public C0AN A02 = C0AN.A01;
    public String A04 = "";

    static {
        C87323zT c87323zT = new C87323zT();
        A05 = c87323zT;
        c87323zT.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        EnumC79143lA enumC79143lA;
        switch (c0rl.ordinal()) {
            case 0:
                return A05;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C87323zT c87323zT = (C87323zT) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                String str = this.A03;
                int i2 = c87323zT.A00;
                this.A03 = c0rm.AWD(z, str, (i2 & 1) == 1, c87323zT.A03);
                this.A01 = c0rm.AW5((i & 2) == 2, this.A01, (i2 & 2) == 2, c87323zT.A01);
                this.A02 = c0rm.AW2((i & 4) == 4, this.A02, (i2 & 4) == 4, c87323zT.A02);
                int i3 = this.A00;
                boolean z2 = (i3 & 8) == 8;
                String str2 = this.A04;
                int i4 = c87323zT.A00;
                this.A04 = c0rm.AWD(z2, str2, (i4 & 8) == 8, c87323zT.A04);
                if (c0rm == C0RN.A00) {
                    this.A00 = i3 | i4;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r5) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            if (A03 != 0) {
                                if (A03 == 10) {
                                    String A0A = c0ro.A0A();
                                    this.A00 |= 1;
                                    this.A03 = A0A;
                                } else if (A03 == 16) {
                                    int A02 = c0ro.A02();
                                    if (A02 == 0) {
                                        enumC79143lA = EnumC79143lA.NONE;
                                    } else if (A02 != 1) {
                                        enumC79143lA = A02 != 2 ? null : EnumC79143lA.VIDEO;
                                    } else {
                                        enumC79143lA = EnumC79143lA.IMAGE;
                                    }
                                    if (enumC79143lA == null) {
                                        super.A0F(2, A02);
                                    } else {
                                        this.A00 |= 2;
                                        this.A01 = A02;
                                    }
                                } else if (A03 == 130) {
                                    this.A00 |= 4;
                                    this.A02 = c0ro.A08();
                                } else if (A03 != 138) {
                                    if (!A0I(A03, c0ro)) {
                                    }
                                } else {
                                    String A0A2 = c0ro.A0A();
                                    this.A00 |= 8;
                                    this.A04 = A0A2;
                                }
                            }
                            r5 = true;
                        } catch (IOException e) {
                            C0JX c0jx = new C0JX(e.getMessage());
                            c0jx.unfinishedMessage = this;
                            throw new RuntimeException(c0jx);
                        }
                    } catch (C0JX e2) {
                        e2.unfinishedMessage = this;
                        throw new RuntimeException(e2);
                    }
                }
                break;
            case 3:
                return null;
            case 4:
                return new C87323zT();
            case 5:
                return new C0CT() { // from class: X.3zS
                    {
                        C87323zT c87323zT2 = C87323zT.A05;
                    }
                };
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C87323zT.class) {
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
        int A0B = (this.A00 & 1) == 1 ? 0 + C0RS.A0B(1, this.A03) : 0;
        int i2 = this.A00;
        if ((i2 & 2) == 2) {
            A0B += C0RS.A04(2, this.A01);
        }
        if ((i2 & 4) == 4) {
            A0B += C0RS.A09(16, this.A02);
        }
        if ((i2 & 8) == 8) {
            A0B += C0RS.A0B(17, this.A04);
        }
        int A00 = this.unknownFields.A00() + A0B;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A03);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0I(2, this.A01);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0N(16, this.A02);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0P(17, this.A04);
        }
        this.unknownFields.A02(c0rs);
    }
}
