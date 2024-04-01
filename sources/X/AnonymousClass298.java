package X;

import java.io.IOException;

/* renamed from: X.298  reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass298 extends C0AZ implements C0AY {
    public static final AnonymousClass298 A04;
    public static volatile C0RQ A05;
    public int A00;
    public int A01;
    public int A02;
    public long A03;

    static {
        AnonymousClass298 anonymousClass298 = new AnonymousClass298();
        A04 = anonymousClass298;
        anonymousClass298.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A04;
            case 1:
                C0RM c0rm = (C0RM) obj;
                AnonymousClass298 anonymousClass298 = (AnonymousClass298) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                int i2 = this.A02;
                int i3 = anonymousClass298.A00;
                this.A02 = c0rm.AW5(z, i2, (i3 & 1) == 1, anonymousClass298.A02);
                this.A03 = c0rm.AW8((i & 2) == 2, this.A03, (i3 & 2) == 2, anonymousClass298.A03);
                this.A01 = c0rm.AW5((i & 4) == 4, this.A01, (i3 & 4) == 4, anonymousClass298.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 = i | i3;
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
                                this.A03 = c0ro.A06();
                            } else if (A03 != 24) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                this.A00 |= 4;
                                this.A01 = c0ro.A02();
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
                return null;
            case 4:
                return new AnonymousClass298();
            case 5:
                return new C0CT() { // from class: X.3yw
                    {
                        AnonymousClass298 anonymousClass2982 = AnonymousClass298.A04;
                    }
                };
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (AnonymousClass298.class) {
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
        int i2 = this.A00;
        int A06 = (i2 & 1) == 1 ? 0 + C0RS.A06(1, this.A02) : 0;
        if ((i2 & 2) == 2) {
            A06 += C0RS.A08(2, this.A03);
        }
        if ((i2 & 4) == 4) {
            A06 += C0RS.A06(3, this.A01);
        }
        int A00 = this.unknownFields.A00() + A06;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0K(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0M(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0K(3, this.A01);
        }
        this.unknownFields.A02(c0rs);
    }
}
