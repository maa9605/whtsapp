package X;

import java.io.IOException;

/* renamed from: X.20F  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C20F extends C0AZ implements C0AY {
    public static final C20F A03;
    public static volatile C0RQ A04;
    public int A00;
    public long A01;
    public boolean A02;

    static {
        C20F c20f = new C20F();
        A03 = c20f;
        c20f.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        boolean z = false;
        switch (c0rl.ordinal()) {
            case 0:
                return A03;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C20F c20f = (C20F) obj2;
                int i = this.A00;
                boolean z2 = (i & 1) == 1;
                boolean z3 = this.A02;
                int i2 = c20f.A00;
                this.A02 = c0rm.AW1(z2, z3, (i2 & 1) == 1, c20f.A02);
                this.A01 = c0rm.AW8((i & 2) == 2, this.A01, (i2 & 2) == 2, c20f.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 = i | i2;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!z) {
                    try {
                        try {
                            int A032 = c0ro.A03();
                            if (A032 != 0) {
                                if (A032 == 8) {
                                    this.A00 |= 1;
                                    this.A02 = c0ro.A0F();
                                } else if (A032 != 16) {
                                    if (!A0I(A032, c0ro)) {
                                    }
                                } else {
                                    this.A00 |= 2;
                                    this.A01 = c0ro.A06();
                                }
                            }
                            z = true;
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
                return new C20F();
            case 5:
                return new C0CT() { // from class: X.410
                    {
                        C20F c20f2 = C20F.A03;
                    }
                };
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C20F.class) {
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
        int A00 = (i2 & 1) == 1 ? 0 + C0RS.A00(1) : 0;
        if ((i2 & 2) == 2) {
            A00 += C0RS.A07(2, this.A01);
        }
        int A002 = this.unknownFields.A00() + A00;
        ((C0AZ) this).A00 = A002;
        return A002;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0Q(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0M(2, this.A01);
        }
        this.unknownFields.A02(c0rs);
    }
}
