package X;

import java.io.IOException;

/* renamed from: X.40C  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C40C extends C0AZ implements C0AY {
    public static final C40C A04;
    public static volatile C0RQ A05;
    public int A00;
    public String A03 = "";
    public String A01 = "";
    public String A02 = "";

    static {
        C40C c40c = new C40C();
        A04 = c40c;
        c40c.A0E();
    }

    public static void A09(C40C c40c, String str) {
        if (str != null) {
            c40c.A00 |= 1;
            c40c.A03 = str;
            return;
        }
        throw null;
    }

    public static void A0A(C40C c40c, String str) {
        if (str != null) {
            c40c.A00 |= 2;
            c40c.A01 = str;
            return;
        }
        throw null;
    }

    public static void A0B(C40C c40c, String str) {
        if (str != null) {
            c40c.A00 |= 4;
            c40c.A02 = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A04;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C40C c40c = (C40C) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                String str = this.A03;
                int i2 = c40c.A00;
                this.A03 = c0rm.AWD(z, str, (i2 & 1) == 1, c40c.A03);
                this.A01 = c0rm.AWD((i & 2) == 2, this.A01, (i2 & 2) == 2, c40c.A01);
                this.A02 = c0rm.AWD((i & 4) == 4, this.A02, (i2 & 4) == 4, c40c.A02);
                if (c0rm == C0RN.A00) {
                    this.A00 = i | i2;
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
                                } else if (A03 == 18) {
                                    String A0A2 = c0ro.A0A();
                                    this.A00 |= 2;
                                    this.A01 = A0A2;
                                } else if (A03 != 26) {
                                    if (!A0I(A03, c0ro)) {
                                    }
                                } else {
                                    String A0A3 = c0ro.A0A();
                                    this.A00 |= 4;
                                    this.A02 = A0A3;
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
                return new C40C();
            case 5:
                return new C0CT() { // from class: X.40B
                    {
                        C40C c40c2 = C40C.A04;
                    }
                };
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C40C.class) {
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

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0B = (this.A00 & 1) == 1 ? 0 + C0RS.A0B(1, this.A03) : 0;
        if ((this.A00 & 2) == 2) {
            A0B += C0RS.A0B(2, this.A01);
        }
        if ((this.A00 & 4) == 4) {
            A0B += C0RS.A0B(3, this.A02);
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
            c0rs.A0P(2, this.A01);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0P(3, this.A02);
        }
        this.unknownFields.A02(c0rs);
    }
}
