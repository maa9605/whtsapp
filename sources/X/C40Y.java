package X;

import java.io.IOException;

/* renamed from: X.40Y */
/* loaded from: classes2.dex */
public final class C40Y extends C0AZ implements C0AY {
    public static final C40Y A03;
    public static volatile C0RQ A04;
    public int A00;
    public long A01;
    public String A02 = "";

    static {
        C40Y c40y = new C40Y();
        A03 = c40y;
        c40y.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A03;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C40Y c40y = (C40Y) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                long j = this.A01;
                int i2 = c40y.A00;
                this.A01 = c0rm.AW8(z, j, (i2 & 1) == 1, c40y.A01);
                this.A02 = c0rm.AWD((i & 2) == 2, this.A02, (i2 & 2) == 2, c40y.A02);
                if (c0rm == C0RN.A00) {
                    this.A00 = i | i2;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r5) {
                    try {
                        try {
                            int A032 = c0ro.A03();
                            if (A032 != 0) {
                                if (A032 == 8) {
                                    this.A00 |= 1;
                                    this.A01 = c0ro.A06();
                                } else if (A032 != 18) {
                                    if (!A0I(A032, c0ro)) {
                                    }
                                } else {
                                    String A0A = c0ro.A0A();
                                    this.A00 |= 2;
                                    this.A02 = A0A;
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
                return new C40Y();
            case 5:
                return new C0CT() { // from class: X.40X
                    {
                        C40Y c40y2 = C40Y.A03;
                    }
                };
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C40Y.class) {
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
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = this.A00;
        int A08 = (i2 & 1) == 1 ? 0 + C0RS.A08(1, this.A01) : 0;
        if ((i2 & 2) == 2) {
            A08 += C0RS.A0B(2, this.A02);
        }
        int A00 = this.unknownFields.A00() + A08;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0M(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0P(2, this.A02);
        }
        this.unknownFields.A02(c0rs);
    }
}
