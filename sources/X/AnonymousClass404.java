package X;

import java.io.IOException;

/* renamed from: X.404  reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass404 extends C0AZ implements C0AY {
    public static final AnonymousClass404 A02;
    public static volatile C0RQ A03;
    public int A00;
    public String A01 = "";

    static {
        AnonymousClass404 anonymousClass404 = new AnonymousClass404();
        A02 = anonymousClass404;
        anonymousClass404.A0E();
    }

    public static void A09(AnonymousClass404 anonymousClass404, String str) {
        if (str != null) {
            anonymousClass404.A00 |= 1;
            anonymousClass404.A01 = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A02;
            case 1:
                C0RM c0rm = (C0RM) obj;
                AnonymousClass404 anonymousClass404 = (AnonymousClass404) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                String str = this.A01;
                int i2 = anonymousClass404.A00;
                this.A01 = c0rm.AWD(z, str, (i2 & 1) == 1, anonymousClass404.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 = i | i2;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r5) {
                    try {
                        int A032 = c0ro.A03();
                        if (A032 != 0) {
                            if (A032 != 10) {
                                if (!A0I(A032, c0ro)) {
                                }
                            } else {
                                String A0A = c0ro.A0A();
                                this.A00 |= 1;
                                this.A01 = A0A;
                            }
                        }
                        r5 = true;
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
                return new AnonymousClass404();
            case 5:
                return new C0CT() { // from class: X.403
                    {
                        AnonymousClass404 anonymousClass4042 = AnonymousClass404.A02;
                    }
                };
            case 6:
                break;
            case 7:
                if (A03 == null) {
                    synchronized (AnonymousClass404.class) {
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
        int A00 = this.unknownFields.A00() + ((this.A00 & 1) == 1 ? 0 + C0RS.A0B(1, this.A01) : 0);
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A01);
        }
        this.unknownFields.A02(c0rs);
    }
}
