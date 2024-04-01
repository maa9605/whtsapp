package X;

import java.io.IOException;

/* renamed from: X.40E  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C40E extends C0AZ implements C0AY {
    public static final C40E A03;
    public static volatile C0RQ A04;
    public int A00;
    public String A02 = "";
    public C0CX A01 = C0RU.A01;

    static {
        C40E c40e = new C40E();
        A03 = c40e;
        c40e.A0E();
    }

    public static void A09(C40E c40e, C40C c40c) {
        if (c40c != null) {
            C0CX c0cx = c40e.A01;
            if (!((C0CY) c0cx).A00) {
                c0cx = C0AZ.A05(c0cx);
                c40e.A01 = c0cx;
            }
            c0cx.add(c40c);
            return;
        }
        throw null;
    }

    public static void A0A(C40E c40e, String str) {
        if (str != null) {
            c40e.A00 |= 1;
            c40e.A02 = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A03;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C40E c40e = (C40E) obj2;
                this.A02 = c0rm.AWD((this.A00 & 1) == 1, this.A02, (c40e.A00 & 1) == 1, c40e.A02);
                this.A01 = c0rm.AW7(this.A01, c40e.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c40e.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r3) {
                    try {
                        int A032 = c0ro.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                String A0A = c0ro.A0A();
                                this.A00 |= 1;
                                this.A02 = A0A;
                            } else if (A032 != 18) {
                                if (!A0I(A032, c0ro)) {
                                }
                            } else {
                                C0CX c0cx = this.A01;
                                C0CX c0cx2 = c0cx;
                                if (!((C0CY) c0cx).A00) {
                                    c0cx2 = C0AZ.A05(c0cx);
                                    this.A01 = c0cx2;
                                }
                                c0cx2.add(c0ro.A09(C40C.A04.A0C(), c0rp));
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
                return new C40E();
            case 5:
                return new C0CT() { // from class: X.40D
                    {
                        C40E c40e2 = C40E.A03;
                    }
                };
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C40E.class) {
                        if (A04 == null) {
                            A04 = new C0RR(A03);
                        }
                    }
                }
                return A04;
            default:
                throw new UnsupportedOperationException();
        }
        return A03;
    }

    @Override // X.C0AX
    public int AD4() {
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A00 & 1) == 1) {
            i = C0RS.A0B(1, this.A02) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.A01.size(); i3++) {
            i += C0RS.A0A(2, (C0AX) this.A01.get(i3));
        }
        int A00 = this.unknownFields.A00() + i;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A02);
        }
        for (int i = 0; i < this.A01.size(); i++) {
            c0rs.A0O(2, (C0AX) this.A01.get(i));
        }
        this.unknownFields.A02(c0rs);
    }
}
