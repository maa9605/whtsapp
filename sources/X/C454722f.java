package X;

import java.io.IOException;

/* renamed from: X.22f  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C454722f extends C0AZ implements C0AY {
    public static final C454722f A08;
    public static volatile C0RQ A09;
    public byte A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C0CX A05;
    public C0CX A06;
    public C0CX A07;

    static {
        C454722f c454722f = new C454722f();
        A08 = c454722f;
        c454722f.A0E();
    }

    public C454722f() {
        C0RU c0ru = C0RU.A01;
        this.A05 = c0ru;
        this.A07 = c0ru;
        this.A06 = c0ru;
    }

    public static void A09(C454722f c454722f, C455222k c455222k) {
        if (c455222k != null) {
            C0CX c0cx = c454722f.A05;
            if (!((C0CY) c0cx).A00) {
                c0cx = C0AZ.A05(c0cx);
                c454722f.A05 = c0cx;
            }
            c0cx.add(c455222k);
            return;
        }
        throw null;
    }

    public static void A0A(C454722f c454722f, C22Y c22y) {
        if (c22y != null) {
            c454722f.A01 |= 1;
            c454722f.A04 = c22y.value;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C22Y c22y;
        switch (c0rl.ordinal()) {
            case 0:
                byte b = this.A00;
                if (b == 1) {
                    return A08;
                }
                if (b == 0) {
                    return null;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (!((this.A01 & 1) == 1)) {
                    if (booleanValue) {
                        this.A00 = (byte) 0;
                    }
                    return null;
                }
                for (int i = 0; i < this.A05.size(); i++) {
                    if (!((C0AZ) this.A05.get(i)).A0H()) {
                        if (booleanValue) {
                            this.A00 = (byte) 0;
                        }
                        return null;
                    }
                }
                for (int i2 = 0; i2 < this.A07.size(); i2++) {
                    if (!((C0AZ) this.A07.get(i2)).A0H()) {
                        if (booleanValue) {
                            this.A00 = (byte) 0;
                        }
                        return null;
                    }
                }
                if (booleanValue) {
                    this.A00 = (byte) 1;
                }
                return A08;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C454722f c454722f = (C454722f) obj2;
                this.A04 = c0rm.AW5((this.A01 & 1) == 1, this.A04, (c454722f.A01 & 1) == 1, c454722f.A04);
                this.A05 = c0rm.AW7(this.A05, c454722f.A05);
                this.A07 = c0rm.AW7(this.A07, c454722f.A07);
                int i3 = this.A01;
                boolean z = (i3 & 2) == 2;
                int i4 = this.A02;
                int i5 = c454722f.A01;
                this.A02 = c0rm.AW5(z, i4, (i5 & 2) == 2, c454722f.A02);
                this.A03 = c0rm.AW5((i3 & 4) == 4, this.A03, (i5 & 4) == 4, c454722f.A03);
                this.A06 = c0rm.AW7(this.A06, c454722f.A06);
                if (c0rm == C0RN.A00) {
                    this.A01 |= c454722f.A01;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r3) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 8) {
                                int A02 = c0ro.A02();
                                if (A02 == 0) {
                                    c22y = C22Y.INITIAL_BOOTSTRAP;
                                } else if (A02 == 1) {
                                    c22y = C22Y.INITIAL_STATUS_V3;
                                } else if (A02 == 2) {
                                    c22y = C22Y.FULL;
                                } else if (A02 != 3) {
                                    c22y = A02 != 4 ? null : C22Y.PUSH_NAME;
                                } else {
                                    c22y = C22Y.RECENT;
                                }
                                if (c22y == null) {
                                    super.A0F(1, A02);
                                } else {
                                    this.A01 |= 1;
                                    this.A04 = A02;
                                }
                            } else if (A03 == 18) {
                                C0CX c0cx = this.A05;
                                if (!((C0CY) c0cx).A00) {
                                    c0cx = C0AZ.A05(c0cx);
                                    this.A05 = c0cx;
                                }
                                c0cx.add(c0ro.A09(C455222k.A0H.A0C(), c0rp));
                            } else if (A03 == 26) {
                                C0CX c0cx2 = this.A07;
                                if (!((C0CY) c0cx2).A00) {
                                    c0cx2 = C0AZ.A05(c0cx2);
                                    this.A07 = c0cx2;
                                }
                                c0cx2.add(c0ro.A09(C452821e.A0V.A0C(), c0rp));
                            } else if (A03 == 40) {
                                this.A01 |= 2;
                                this.A02 = c0ro.A02();
                            } else if (A03 == 48) {
                                this.A01 |= 4;
                                this.A03 = c0ro.A02();
                            } else if (A03 != 58) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                C0CX c0cx3 = this.A06;
                                C0CX c0cx4 = c0cx3;
                                if (!((C0CY) c0cx3).A00) {
                                    c0cx4 = C0AZ.A05(c0cx3);
                                    this.A06 = c0cx4;
                                }
                                c0cx4.add(c0ro.A09(C454822g.A03.A0C(), c0rp));
                            }
                        }
                        r3 = true;
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
                ((C0CY) this.A07).A00 = false;
                ((C0CY) this.A06).A00 = false;
                return null;
            case 4:
                return new C454722f();
            case 5:
                return new C0CT() { // from class: X.22Z
                    {
                        C454722f c454722f2 = C454722f.A08;
                    }
                };
            case 6:
                break;
            case 7:
                if (A09 == null) {
                    synchronized (C454722f.class) {
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
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A01 & 1) == 1) {
            i = C0RS.A04(1, this.A04) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.A05.size(); i3++) {
            i += C0RS.A0A(2, (C0AX) this.A05.get(i3));
        }
        for (int i4 = 0; i4 < this.A07.size(); i4++) {
            i += C0RS.A0A(3, (C0AX) this.A07.get(i4));
        }
        int i5 = this.A01;
        if ((i5 & 2) == 2) {
            i += C0RS.A06(5, this.A02);
        }
        if ((i5 & 4) == 4) {
            i += C0RS.A06(6, this.A03);
        }
        for (int i6 = 0; i6 < this.A06.size(); i6++) {
            i += C0RS.A0A(7, (C0AX) this.A06.get(i6));
        }
        int A00 = this.unknownFields.A00() + i;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A01 & 1) == 1) {
            c0rs.A0I(1, this.A04);
        }
        for (int i = 0; i < this.A05.size(); i++) {
            c0rs.A0O(2, (C0AX) this.A05.get(i));
        }
        for (int i2 = 0; i2 < this.A07.size(); i2++) {
            c0rs.A0O(3, (C0AX) this.A07.get(i2));
        }
        if ((this.A01 & 2) == 2) {
            c0rs.A0K(5, this.A02);
        }
        if ((this.A01 & 4) == 4) {
            c0rs.A0K(6, this.A03);
        }
        for (int i3 = 0; i3 < this.A06.size(); i3++) {
            c0rs.A0O(7, (C0AX) this.A06.get(i3));
        }
        this.unknownFields.A02(c0rs);
    }
}
