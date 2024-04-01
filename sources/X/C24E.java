package X;

import java.io.IOException;

/* renamed from: X.24E  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C24E extends C0AZ implements C0AY {
    public static final C24E A04;
    public static volatile C0RQ A05;
    public byte A00 = -1;
    public int A01;
    public long A02;
    public C452821e A03;

    static {
        C24E c24e = new C24E();
        A04 = c24e;
        c24e.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C0KA c0ka;
        boolean z = false;
        switch (c0rl.ordinal()) {
            case 0:
                byte b = this.A00;
                if (b == 1) {
                    return A04;
                }
                if (b == 0) {
                    return null;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if ((this.A01 & 1) == 1) {
                    C452821e c452821e = this.A03;
                    if (c452821e == null) {
                        c452821e = C452821e.A0V;
                    }
                    if (!c452821e.A0H()) {
                        if (booleanValue) {
                            this.A00 = (byte) 0;
                        }
                        return null;
                    }
                }
                if (booleanValue) {
                    this.A00 = (byte) 1;
                }
                return A04;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C24E c24e = (C24E) obj2;
                this.A03 = (C452821e) c0rm.AW9(this.A03, c24e.A03);
                int i = this.A01;
                boolean z2 = (i & 2) == 2;
                long j = this.A02;
                int i2 = c24e.A01;
                this.A02 = c0rm.AW8(z2, j, (i2 & 2) == 2, c24e.A02);
                if (c0rm == C0RN.A00) {
                    this.A01 = i | i2;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!z) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 10) {
                                if ((this.A01 & 1) == 1) {
                                    c0ka = (C0KA) this.A03.AVX();
                                } else {
                                    c0ka = null;
                                }
                                C452821e c452821e2 = (C452821e) c0ro.A09(C452821e.A0V.A0C(), c0rp);
                                this.A03 = c452821e2;
                                if (c0ka != null) {
                                    c0ka.A03(c452821e2);
                                    this.A03 = (C452821e) c0ka.A00();
                                }
                                this.A01 |= 1;
                            } else if (A03 != 16) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                this.A01 |= 2;
                                this.A02 = c0ro.A06();
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
                return new C24E();
            case 5:
                return new C0CT() { // from class: X.40W
                    {
                        C24E c24e2 = C24E.A04;
                    }
                };
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C24E.class) {
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
        int i2 = 0;
        if ((this.A01 & 1) == 1) {
            C452821e c452821e = this.A03;
            if (c452821e == null) {
                c452821e = C452821e.A0V;
            }
            i2 = 0 + C0RS.A0A(1, c452821e);
        }
        if ((this.A01 & 2) == 2) {
            i2 += C0RS.A08(2, this.A02);
        }
        int A00 = this.unknownFields.A00() + i2;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A01 & 1) == 1) {
            C452821e c452821e = this.A03;
            if (c452821e == null) {
                c452821e = C452821e.A0V;
            }
            c0rs.A0O(1, c452821e);
        }
        if ((this.A01 & 2) == 2) {
            c0rs.A0M(2, this.A02);
        }
        this.unknownFields.A02(c0rs);
    }
}
