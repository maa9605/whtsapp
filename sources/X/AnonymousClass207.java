package X;

import java.io.IOException;

/* renamed from: X.207  reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass207 extends C0AZ implements C0AY {
    public static final AnonymousClass207 A02;
    public static volatile C0RQ A03;
    public int A00;
    public AnonymousClass208 A01;

    static {
        AnonymousClass207 anonymousClass207 = new AnonymousClass207();
        A02 = anonymousClass207;
        anonymousClass207.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C41G c41g;
        switch (c0rl.ordinal()) {
            case 0:
                return A02;
            case 1:
                C0RM c0rm = (C0RM) obj;
                AnonymousClass207 anonymousClass207 = (AnonymousClass207) obj2;
                this.A01 = (AnonymousClass208) c0rm.AW9(this.A01, anonymousClass207.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 |= anonymousClass207.A00;
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
                return new AnonymousClass207();
            case 5:
                return new C0CT() { // from class: X.40r
                    {
                        AnonymousClass207 anonymousClass2072 = AnonymousClass207.A02;
                    }
                };
            case 6:
                break;
            case 7:
                if (A03 == null) {
                    synchronized (AnonymousClass207.class) {
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

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.A00 & 1) == 1) {
            AnonymousClass208 anonymousClass208 = this.A01;
            if (anonymousClass208 == null) {
                anonymousClass208 = AnonymousClass208.A04;
            }
            i2 = 0 + C0RS.A0A(1, anonymousClass208);
        }
        int A00 = this.unknownFields.A00() + i2;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            AnonymousClass208 anonymousClass208 = this.A01;
            if (anonymousClass208 == null) {
                anonymousClass208 = AnonymousClass208.A04;
            }
            c0rs.A0O(1, anonymousClass208);
        }
        this.unknownFields.A02(c0rs);
    }
}
