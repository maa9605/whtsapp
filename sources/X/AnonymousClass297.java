package X;

import java.io.IOException;

/* renamed from: X.297  reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass297 extends C0AZ implements C0AY {
    public static final AnonymousClass297 A03;
    public static volatile C0RQ A04;
    public int A00;
    public C0AN A01;
    public C0AN A02;

    static {
        AnonymousClass297 anonymousClass297 = new AnonymousClass297();
        A03 = anonymousClass297;
        anonymousClass297.A0E();
    }

    public AnonymousClass297() {
        C0AN c0an = C0AN.A01;
        this.A02 = c0an;
        this.A01 = c0an;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A03;
            case 1:
                C0RM c0rm = (C0RM) obj;
                AnonymousClass297 anonymousClass297 = (AnonymousClass297) obj2;
                this.A02 = c0rm.AW2((this.A00 & 1) == 1, this.A02, (anonymousClass297.A00 & 1) == 1, anonymousClass297.A02);
                this.A01 = c0rm.AW2((this.A00 & 2) == 2, this.A01, (anonymousClass297.A00 & 2) == 2, anonymousClass297.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 |= anonymousClass297.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r4) {
                    try {
                        try {
                            int A032 = c0ro.A03();
                            if (A032 != 0) {
                                if (A032 == 10) {
                                    this.A00 |= 1;
                                    this.A02 = c0ro.A08();
                                } else if (A032 != 18) {
                                    if (!A0I(A032, c0ro)) {
                                    }
                                } else {
                                    this.A00 |= 2;
                                    this.A01 = c0ro.A08();
                                }
                            }
                            r4 = true;
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
                return new AnonymousClass297();
            case 5:
                return new C0CT() { // from class: X.3z1
                    {
                        AnonymousClass297 anonymousClass2972 = AnonymousClass297.A03;
                    }
                };
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (AnonymousClass297.class) {
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
        int A09 = (i2 & 1) == 1 ? 0 + C0RS.A09(1, this.A02) : 0;
        if ((i2 & 2) == 2) {
            A09 += C0RS.A09(2, this.A01);
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
            c0rs.A0N(2, this.A01);
        }
        this.unknownFields.A02(c0rs);
    }
}
