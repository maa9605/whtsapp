package X;

import java.io.IOException;

/* renamed from: X.3zw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87613zw extends C0AZ implements C0AY {
    public static final C87613zw A02;
    public static volatile C0RQ A03;
    public int A00;
    public long A01;

    static {
        C87613zw c87613zw = new C87613zw();
        A02 = c87613zw;
        c87613zw.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        boolean z = false;
        switch (c0rl.ordinal()) {
            case 0:
                return A02;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C87613zw c87613zw = (C87613zw) obj2;
                int i = this.A00;
                boolean z2 = (i & 1) == 1;
                long j = this.A01;
                int i2 = c87613zw.A00;
                this.A01 = c0rm.AW8(z2, j, (i2 & 1) == 1, c87613zw.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 = i | i2;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!z) {
                    try {
                        int A032 = c0ro.A03();
                        if (A032 != 0) {
                            if (A032 != 8) {
                                if (!A0I(A032, c0ro)) {
                                }
                            } else {
                                this.A00 |= 1;
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
                return new C87613zw();
            case 5:
                return new C0CT() { // from class: X.3zv
                    {
                        C87613zw c87613zw2 = C87613zw.A02;
                    }
                };
            case 6:
                break;
            case 7:
                if (A03 == null) {
                    synchronized (C87613zw.class) {
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
        int A00 = this.unknownFields.A00() + ((this.A00 & 1) == 1 ? 0 + C0RS.A07(1, this.A01) : 0);
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0M(1, this.A01);
        }
        this.unknownFields.A02(c0rs);
    }
}