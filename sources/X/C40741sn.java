package X;

import java.io.IOException;

/* renamed from: X.1sn */
/* loaded from: classes2.dex */
public final class C40741sn extends C0AZ implements C0AY {
    public static final C40741sn A02;
    public static volatile C0RQ A03;
    public int A00;
    public C40531sQ A01;

    static {
        C40741sn c40741sn = new C40741sn();
        A02 = c40741sn;
        c40741sn.A0E();
    }

    public static void A09(C40741sn c40741sn, C40531sQ c40531sQ) {
        if (c40531sQ != null) {
            c40741sn.A01 = c40531sQ;
            c40741sn.A00 |= 1;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C40541sR c40541sR;
        switch (c0rl.ordinal()) {
            case 0:
                return A02;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C40741sn c40741sn = (C40741sn) obj2;
                this.A01 = (C40531sQ) c0rm.AW9(this.A01, c40741sn.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c40741sn.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int A032 = c0ro.A03();
                        if (A032 != 0) {
                            if (A032 != 10) {
                                if (!A0I(A032, c0ro)) {
                                }
                            } else {
                                if ((this.A00 & 1) == 1) {
                                    c40541sR = (C40541sR) this.A01.AVX();
                                } else {
                                    c40541sR = null;
                                }
                                C40531sQ c40531sQ = (C40531sQ) c0ro.A09(C40531sQ.A0c.A0C(), c0rp);
                                this.A01 = c40531sQ;
                                if (c40541sR != null) {
                                    c40541sR.A03(c40531sQ);
                                    this.A01 = (C40531sQ) c40541sR.A00();
                                }
                                this.A00 |= 1;
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
                return new C40741sn();
            case 5:
                return new C40751so();
            case 6:
                break;
            case 7:
                if (A03 == null) {
                    synchronized (C40741sn.class) {
                        if (A03 == null) {
                            A03 = new C0RR(A02);
                        }
                    }
                }
                return A03;
            default:
                throw new UnsupportedOperationException();
        }
        return A02;
    }

    public C40531sQ A0i() {
        C40531sQ c40531sQ = this.A01;
        return c40531sQ == null ? C40531sQ.A0c : c40531sQ;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A00 = this.unknownFields.A00() + ((this.A00 & 1) == 1 ? 0 + C0RS.A0A(1, A0i()) : 0);
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0O(1, A0i());
        }
        this.unknownFields.A02(c0rs);
    }
}
