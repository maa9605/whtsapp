package X;

import java.io.IOException;

/* renamed from: X.2FS  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2FS extends C0AZ implements C0AY {
    public static final C2FS A04;
    public static volatile C0RQ A05;
    public int A00;
    public C40521sP A02;
    public String A03 = "";
    public C0CX A01 = C0RU.A01;

    static {
        C2FS c2fs = new C2FS();
        A04 = c2fs;
        c2fs.A0E();
    }

    public static void A09(C2FS c2fs, C40521sP c40521sP) {
        if (c40521sP != null) {
            c2fs.A02 = c40521sP;
            c2fs.A00 |= 2;
            return;
        }
        throw null;
    }

    public static void A0A(C2FS c2fs, C2FQ c2fq) {
        if (c2fq != null) {
            C0CX c0cx = c2fs.A01;
            if (!((C0CY) c0cx).A00) {
                c0cx = C0AZ.A05(c0cx);
                c2fs.A01 = c0cx;
            }
            c0cx.add(c2fq);
            return;
        }
        throw null;
    }

    public static void A0B(C2FS c2fs, String str) {
        if (str != null) {
            c2fs.A00 |= 1;
            c2fs.A03 = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87333zU c87333zU;
        switch (c0rl.ordinal()) {
            case 0:
                return A04;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C2FS c2fs = (C2FS) obj2;
                this.A03 = c0rm.AWD((this.A00 & 1) == 1, this.A03, (c2fs.A00 & 1) == 1, c2fs.A03);
                this.A01 = c0rm.AW7(this.A01, c2fs.A01);
                this.A02 = (C40521sP) c0rm.AW9(this.A02, c2fs.A02);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c2fs.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r3) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 10) {
                                String A0A = c0ro.A0A();
                                this.A00 |= 1;
                                this.A03 = A0A;
                            } else if (A03 == 18) {
                                C0CX c0cx = this.A01;
                                C0CX c0cx2 = c0cx;
                                if (!((C0CY) c0cx).A00) {
                                    c0cx2 = C0AZ.A05(c0cx);
                                    this.A01 = c0cx2;
                                }
                                c0cx2.add(c0ro.A09(C2FQ.A04.A0C(), c0rp));
                            } else if (A03 != 138) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                if ((this.A00 & 2) == 2) {
                                    c87333zU = (C87333zU) this.A02.AVX();
                                } else {
                                    c87333zU = null;
                                }
                                C40521sP c40521sP = (C40521sP) c0ro.A09(C40521sP.A0H.A0C(), c0rp);
                                this.A02 = c40521sP;
                                if (c87333zU != null) {
                                    c87333zU.A03(c40521sP);
                                    this.A02 = (C40521sP) c87333zU.A00();
                                }
                                this.A00 |= 2;
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
                ((C0CY) this.A01).A00 = false;
                return null;
            case 4:
                return new C2FS();
            case 5:
                return new C0CT() { // from class: X.2FR
                    {
                        C2FS c2fs2 = C2FS.A04;
                    }
                };
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C2FS.class) {
                        if (A05 == null) {
                            A05 = new C0RR(A04);
                        }
                    }
                }
                return A05;
            default:
                throw new UnsupportedOperationException();
        }
        return A04;
    }

    public C40521sP A0i() {
        C40521sP c40521sP = this.A02;
        return c40521sP == null ? C40521sP.A0H : c40521sP;
    }

    @Override // X.C0AX
    public int AD4() {
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A00 & 1) == 1) {
            i = C0RS.A0B(1, this.A03) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.A01.size(); i3++) {
            i += C0RS.A0A(2, (C0AX) this.A01.get(i3));
        }
        if ((this.A00 & 2) == 2) {
            i += C0RS.A0A(17, A0i());
        }
        int A00 = this.unknownFields.A00() + i;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A03);
        }
        for (int i = 0; i < this.A01.size(); i++) {
            c0rs.A0O(2, (C0AX) this.A01.get(i));
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0O(17, A0i());
        }
        this.unknownFields.A02(c0rs);
    }
}
