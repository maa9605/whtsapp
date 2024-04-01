package X;

import java.io.IOException;

/* renamed from: X.41p */
/* loaded from: classes2.dex */
public final class C880641p extends C0AZ implements C0AY {
    public static final C880641p A03;
    public static volatile C0RQ A04;
    public int A00;
    public C0CX A01 = C0RU.A01;
    public C2U4 A02;

    static {
        C880641p c880641p = new C880641p();
        A03 = c880641p;
        c880641p.A0E();
    }

    public static void A09(C880641p c880641p, C2U4 c2u4) {
        if (c2u4 != null) {
            c880641p.A02 = c2u4;
            c880641p.A00 |= 1;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C74953e7 c74953e7;
        boolean z = false;
        switch (c0rl.ordinal()) {
            case 0:
                return A03;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C880641p c880641p = (C880641p) obj2;
                this.A02 = (C2U4) c0rm.AW9(this.A02, c880641p.A02);
                this.A01 = c0rm.AW7(this.A01, c880641p.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c880641p.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!z) {
                    try {
                        try {
                            int A032 = c0ro.A03();
                            if (A032 != 0) {
                                if (A032 == 10) {
                                    if ((this.A00 & 1) == 1) {
                                        c74953e7 = (C74953e7) this.A02.AVX();
                                    } else {
                                        c74953e7 = null;
                                    }
                                    C2U4 c2u4 = (C2U4) c0ro.A09(C2U4.A0E.A0C(), c0rp);
                                    this.A02 = c2u4;
                                    if (c74953e7 != null) {
                                        c74953e7.A03(c2u4);
                                        this.A02 = (C2U4) c74953e7.A00();
                                    }
                                    this.A00 |= 1;
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
                                    c0cx2.add(c0ro.A09(C2U4.A0E.A0C(), c0rp));
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
                ((C0CY) this.A01).A00 = false;
                return null;
            case 4:
                return new C880641p();
            case 5:
                return new C880541o(null);
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C880641p.class) {
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

    public C2U4 A0i() {
        C2U4 c2u4 = this.A02;
        return c2u4 == null ? C2U4.A0E : c2u4;
    }

    @Override // X.C0AX
    public int AD4() {
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A00 & 1) == 1) {
            i = C0RS.A0A(1, A0i()) + 0;
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
            c0rs.A0O(1, A0i());
        }
        for (int i = 0; i < this.A01.size(); i++) {
            c0rs.A0O(2, (C0AX) this.A01.get(i));
        }
        this.unknownFields.A02(c0rs);
    }
}
