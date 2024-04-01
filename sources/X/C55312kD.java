package X;

import java.io.IOException;

/* renamed from: X.2kD */
/* loaded from: classes2.dex */
public final class C55312kD extends C0AZ implements C0AY {
    public static final C55312kD A01;
    public static volatile C0RQ A02;
    public C0CX A00 = C0RU.A01;

    static {
        C55312kD c55312kD = new C55312kD();
        A01 = c55312kD;
        c55312kD.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        boolean z = false;
        switch (c0rl.ordinal()) {
            case 0:
                return A01;
            case 1:
                this.A00 = ((C0RM) obj).AW7(this.A00, ((C55312kD) obj2).A00);
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!z) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            if (A03 != 0) {
                                if (A03 != 10) {
                                    if (!A0I(A03, c0ro)) {
                                    }
                                } else {
                                    C0CX c0cx = this.A00;
                                    C0CX c0cx2 = c0cx;
                                    if (!((C0CY) c0cx).A00) {
                                        c0cx2 = C0AZ.A05(c0cx);
                                        this.A00 = c0cx2;
                                    }
                                    c0cx2.add(c0ro.A09(C87483zj.A02.A0C(), c0rp));
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
                ((C0CY) this.A00).A00 = false;
                return null;
            case 4:
                return new C55312kD();
            case 5:
                return new C0CT() { // from class: X.3zk
                    {
                        C55312kD c55312kD = C55312kD.A01;
                    }
                };
            case 6:
                break;
            case 7:
                if (A02 == null) {
                    synchronized (C55312kD.class) {
                        if (A02 == null) {
                            A02 = new C0RR(A01);
                        }
                    }
                }
                return A02;
            default:
                throw new UnsupportedOperationException();
        }
        return A01;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.A00.size(); i3++) {
            i2 += C0RS.A0A(1, (C0AX) this.A00.get(i3));
        }
        int A00 = this.unknownFields.A00() + i2;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        for (int i = 0; i < this.A00.size(); i++) {
            c0rs.A0O(1, (C0AX) this.A00.get(i));
        }
        this.unknownFields.A02(c0rs);
    }
}
