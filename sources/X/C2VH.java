package X;

import java.io.IOException;

/* renamed from: X.2VH  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2VH extends C0AZ implements C0AY {
    public static final C2VH A05;
    public static volatile C0RQ A06;
    public int A00;
    public int A01;
    public C2VL A02;
    public String A03 = "";
    public String A04 = "";

    static {
        C2VH c2vh = new C2VH();
        A05 = c2vh;
        c2vh.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        EnumC79323lT enumC79323lT;
        C2VM c2vm;
        switch (c0rl.ordinal()) {
            case 0:
                return A05;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C2VH c2vh = (C2VH) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                String str = this.A03;
                int i2 = c2vh.A00;
                this.A03 = c0rm.AWD(z, str, (i2 & 1) == 1, c2vh.A03);
                this.A04 = c0rm.AWD((i & 2) == 2, this.A04, (i2 & 2) == 2, c2vh.A04);
                this.A02 = (C2VL) c0rm.AW9(this.A02, c2vh.A02);
                int i3 = this.A00;
                boolean z2 = (i3 & 8) == 8;
                int i4 = this.A01;
                int i5 = c2vh.A00;
                this.A01 = c0rm.AW5(z2, i4, (i5 & 8) == 8, c2vh.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 = i3 | i5;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r5) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            if (A03 != 0) {
                                if (A03 == 10) {
                                    String A0A = c0ro.A0A();
                                    this.A00 |= 1;
                                    this.A03 = A0A;
                                } else if (A03 == 18) {
                                    String A0A2 = c0ro.A0A();
                                    this.A00 |= 2;
                                    this.A04 = A0A2;
                                } else if (A03 == 26) {
                                    if ((this.A00 & 4) == 4) {
                                        c2vm = (C2VM) this.A02.AVX();
                                    } else {
                                        c2vm = null;
                                    }
                                    C2VL c2vl = (C2VL) c0ro.A09(C2VL.A0C.A0C(), c0rp);
                                    this.A02 = c2vl;
                                    if (c2vm != null) {
                                        c2vm.A03(c2vl);
                                        this.A02 = (C2VL) c2vm.A00();
                                    }
                                    this.A00 |= 4;
                                } else if (A03 != 32) {
                                    if (!A0I(A03, c0ro)) {
                                    }
                                } else {
                                    int A02 = c0ro.A02();
                                    if (A02 == 0) {
                                        enumC79323lT = EnumC79323lT.WEB_BROWSER;
                                    } else if (A02 == 1) {
                                        enumC79323lT = EnumC79323lT.APP_STORE;
                                    } else if (A02 == 2) {
                                        enumC79323lT = EnumC79323lT.WIN_STORE;
                                    } else if (A02 != 3) {
                                        enumC79323lT = A02 != 4 ? null : EnumC79323lT.WIN32;
                                    } else {
                                        enumC79323lT = EnumC79323lT.DARWIN;
                                    }
                                    if (enumC79323lT == null) {
                                        super.A0F(4, A02);
                                    } else {
                                        this.A00 |= 8;
                                        this.A01 = A02;
                                    }
                                }
                            }
                            r5 = true;
                        } catch (C0JX e) {
                            e.unfinishedMessage = this;
                            throw new RuntimeException(e);
                        }
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
                return new C2VH();
            case 5:
                return new C0CT() { // from class: X.2VI
                    {
                        C2VH c2vh2 = C2VH.A05;
                    }
                };
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C2VH.class) {
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
        if ((this.A00 & 2) == 2) {
            A0B += C0RS.A0B(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            C2VL c2vl = this.A02;
            if (c2vl == null) {
                c2vl = C2VL.A0C;
            }
            A0B += C0RS.A0A(3, c2vl);
        }
        if ((this.A00 & 8) == 8) {
            A0B += C0RS.A04(4, this.A01);
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
            c0rs.A0P(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            C2VL c2vl = this.A02;
            if (c2vl == null) {
                c2vl = C2VL.A0C;
            }
            c0rs.A0O(3, c2vl);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0I(4, this.A01);
        }
        this.unknownFields.A02(c0rs);
    }
}
