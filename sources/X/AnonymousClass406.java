package X;

import java.io.IOException;

/* renamed from: X.406  reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass406 extends C0AZ implements C0AY {
    public static final AnonymousClass406 A03;
    public static volatile C0RQ A04;
    public int A00;
    public String A02 = "";
    public C0AN A01 = C0AN.A01;

    static {
        AnonymousClass406 anonymousClass406 = new AnonymousClass406();
        A03 = anonymousClass406;
        anonymousClass406.A0E();
    }

    public static void A09(AnonymousClass406 anonymousClass406, C0AN c0an) {
        anonymousClass406.A00 |= 2;
        anonymousClass406.A01 = c0an;
    }

    public static void A0A(AnonymousClass406 anonymousClass406, String str) {
        if (str != null) {
            anonymousClass406.A00 |= 1;
            anonymousClass406.A02 = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A03;
            case 1:
                C0RM c0rm = (C0RM) obj;
                AnonymousClass406 anonymousClass406 = (AnonymousClass406) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                String str = this.A02;
                int i2 = anonymousClass406.A00;
                this.A02 = c0rm.AWD(z, str, (i2 & 1) == 1, anonymousClass406.A02);
                this.A01 = c0rm.AW2((i & 2) == 2, this.A01, (i2 & 2) == 2, anonymousClass406.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 |= anonymousClass406.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r6) {
                    try {
                        int A032 = c0ro.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                String A0A = c0ro.A0A();
                                this.A00 |= 1;
                                this.A02 = A0A;
                            } else if (A032 != 18) {
                                if (!A0I(A032, c0ro)) {
                                }
                            } else {
                                this.A00 |= 2;
                                this.A01 = c0ro.A08();
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
                return new AnonymousClass406();
            case 5:
                return new C0CT() { // from class: X.405
                    {
                        AnonymousClass406 anonymousClass4062 = AnonymousClass406.A03;
                    }
                };
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (AnonymousClass406.class) {
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
        int A0B = (this.A00 & 1) == 1 ? 0 + C0RS.A0B(1, this.A02) : 0;
        if ((this.A00 & 2) == 2) {
            A0B += C0RS.A09(2, this.A01);
        }
        int A00 = this.unknownFields.A00() + A0B;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0N(2, this.A01);
        }
        this.unknownFields.A02(c0rs);
    }
}
