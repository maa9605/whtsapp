package X;

import java.io.IOException;

/* renamed from: X.2FM */
/* loaded from: classes2.dex */
public final class C2FM extends C0AZ implements C0AY {
    public static final C2FM A02;
    public static volatile C0RQ A03;
    public int A00;
    public C452421a A01;

    static {
        C2FM c2fm = new C2FM();
        A02 = c2fm;
        c2fm.A0E();
    }

    public static void A09(C2FM c2fm, C452521b c452521b) {
        if (c2fm != null) {
            c2fm.A01 = (C452421a) c452521b.A01();
            c2fm.A00 |= 1;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C452521b c452521b;
        switch (c0rl.ordinal()) {
            case 0:
                return A02;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C2FM c2fm = (C2FM) obj2;
                this.A01 = (C452421a) c0rm.AW9(this.A01, c2fm.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c2fm.A00;
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
                                    c452521b = (C452521b) this.A01.AVX();
                                } else {
                                    c452521b = null;
                                }
                                C452421a c452421a = (C452421a) c0ro.A09(C452421a.A05.A0C(), c0rp);
                                this.A01 = c452421a;
                                if (c452521b != null) {
                                    c452521b.A03(c452421a);
                                    this.A01 = (C452421a) c452521b.A00();
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
                return new C2FM();
            case 5:
                return new C0CT() { // from class: X.2FL
                    {
                        C2FM c2fm2 = C2FM.A02;
                    }
                };
            case 6:
                break;
            case 7:
                if (A03 == null) {
                    synchronized (C2FM.class) {
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

    public C452421a A0i() {
        C452421a c452421a = this.A01;
        return c452421a == null ? C452421a.A05 : c452421a;
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
