package X;

import java.io.IOException;

/* renamed from: X.41F */
/* loaded from: classes2.dex */
public final class C41F extends C0AZ implements C0AY {
    public static final C41F A03;
    public static volatile C0RQ A04;
    public int A00;
    public long A01;
    public C452421a A02;

    static {
        C41F c41f = new C41F();
        A03 = c41f;
        c41f.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C452521b c452521b;
        boolean z = false;
        switch (c0rl.ordinal()) {
            case 0:
                return A03;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C41F c41f = (C41F) obj2;
                this.A02 = (C452421a) c0rm.AW9(this.A02, c41f.A02);
                int i = this.A00;
                boolean z2 = (i & 2) == 2;
                long j = this.A01;
                int i2 = c41f.A00;
                this.A01 = c0rm.AW8(z2, j, (i2 & 2) == 2, c41f.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 = i | i2;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!z) {
                    try {
                        int A032 = c0ro.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                if ((this.A00 & 1) == 1) {
                                    c452521b = (C452521b) this.A02.AVX();
                                } else {
                                    c452521b = null;
                                }
                                C452421a c452421a = (C452421a) c0ro.A09(C452421a.A05.A0C(), c0rp);
                                this.A02 = c452421a;
                                if (c452521b != null) {
                                    c452521b.A03(c452421a);
                                    this.A02 = (C452421a) c452521b.A00();
                                }
                                this.A00 |= 1;
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
                return new C41F();
            case 5:
                return new C0CT() { // from class: X.41E
                    {
                        C41F c41f2 = C41F.A03;
                    }
                };
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C41F.class) {
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
        int i2 = 0;
        if ((this.A00 & 1) == 1) {
            C452421a c452421a = this.A02;
            if (c452421a == null) {
                c452421a = C452421a.A05;
            }
            i2 = 0 + C0RS.A0A(1, c452421a);
        }
        if ((this.A00 & 2) == 2) {
            i2 += C0RS.A07(2, this.A01);
        }
        int A00 = this.unknownFields.A00() + i2;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            C452421a c452421a = this.A02;
            if (c452421a == null) {
                c452421a = C452421a.A05;
            }
            c0rs.A0O(1, c452421a);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0M(2, this.A01);
        }
        this.unknownFields.A02(c0rs);
    }
}
