package X;

import java.io.IOException;

/* renamed from: X.20H */
/* loaded from: classes2.dex */
public final class C20H extends C0AZ implements C0AY {
    public static final C20H A03;
    public static volatile C0RQ A04;
    public int A00;
    public AnonymousClass208 A01;
    public boolean A02;

    static {
        C20H c20h = new C20H();
        A03 = c20h;
        c20h.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C41G c41g;
        switch (c0rl.ordinal()) {
            case 0:
                return A03;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C20H c20h = (C20H) obj2;
                this.A02 = c0rm.AW1((this.A00 & 1) == 1, this.A02, (c20h.A00 & 1) == 1, c20h.A02);
                this.A01 = (AnonymousClass208) c0rm.AW9(this.A01, c20h.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c20h.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r3) {
                    try {
                        int A032 = c0ro.A03();
                        if (A032 != 0) {
                            if (A032 == 8) {
                                this.A00 |= 1;
                                this.A02 = c0ro.A0F();
                            } else if (A032 != 18) {
                                if (!A0I(A032, c0ro)) {
                                }
                            } else {
                                if ((this.A00 & 2) == 2) {
                                    c41g = (C41G) this.A01.AVX();
                                } else {
                                    c41g = null;
                                }
                                AnonymousClass208 anonymousClass208 = (AnonymousClass208) c0ro.A09(AnonymousClass208.A04.A0C(), c0rp);
                                this.A01 = anonymousClass208;
                                if (c41g != null) {
                                    c41g.A03(anonymousClass208);
                                    this.A01 = (AnonymousClass208) c41g.A00();
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
                return null;
            case 4:
                return new C20H();
            case 5:
                return new C0CT() { // from class: X.40n
                    {
                        C20H c20h2 = C20H.A03;
                    }
                };
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C20H.class) {
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
            AnonymousClass208 anonymousClass208 = this.A01;
            if (anonymousClass208 == null) {
                anonymousClass208 = AnonymousClass208.A04;
            }
            A00 += C0RS.A0A(2, anonymousClass208);
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
            AnonymousClass208 anonymousClass208 = this.A01;
            if (anonymousClass208 == null) {
                anonymousClass208 = AnonymousClass208.A04;
            }
            c0rs.A0O(2, anonymousClass208);
        }
        this.unknownFields.A02(c0rs);
    }
}
