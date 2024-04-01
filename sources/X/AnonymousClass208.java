package X;

import java.io.IOException;

/* renamed from: X.208 */
/* loaded from: classes2.dex */
public final class AnonymousClass208 extends C0AZ implements C0AY {
    public static final AnonymousClass208 A04;
    public static volatile C0RQ A05;
    public int A00;
    public long A01;
    public long A02;
    public C0CX A03 = C0RU.A01;

    static {
        AnonymousClass208 anonymousClass208 = new AnonymousClass208();
        A04 = anonymousClass208;
        anonymousClass208.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        boolean z = false;
        switch (c0rl.ordinal()) {
            case 0:
                return A04;
            case 1:
                C0RM c0rm = (C0RM) obj;
                AnonymousClass208 anonymousClass208 = (AnonymousClass208) obj2;
                int i = this.A00;
                boolean z2 = (i & 1) == 1;
                long j = this.A01;
                int i2 = anonymousClass208.A00;
                this.A01 = c0rm.AW8(z2, j, (i2 & 1) == 1, anonymousClass208.A01);
                this.A02 = c0rm.AW8((i & 2) == 2, this.A02, (i2 & 2) == 2, anonymousClass208.A02);
                this.A03 = c0rm.AW7(this.A03, anonymousClass208.A03);
                if (c0rm == C0RN.A00) {
                    this.A00 |= anonymousClass208.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!z) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            if (A03 != 0) {
                                if (A03 == 8) {
                                    this.A00 |= 1;
                                    this.A01 = c0ro.A06();
                                } else if (A03 == 16) {
                                    this.A00 |= 2;
                                    this.A02 = c0ro.A06();
                                } else if (A03 != 26) {
                                    if (!A0I(A03, c0ro)) {
                                    }
                                } else {
                                    C0CX c0cx = this.A03;
                                    if (!((C0CY) c0cx).A00) {
                                        c0cx = C0AZ.A05(c0cx);
                                        this.A03 = c0cx;
                                    }
                                    c0cx.add(c0ro.A09(C41F.A03.A0C(), c0rp));
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
                ((C0CY) this.A03).A00 = false;
                return null;
            case 4:
                return new AnonymousClass208();
            case 5:
                return new C0CT() { // from class: X.41G
                    {
                        AnonymousClass208 anonymousClass2082 = AnonymousClass208.A04;
                    }
                };
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (AnonymousClass208.class) {
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
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.A00;
        if ((i3 & 1) == 1) {
            i = C0RS.A07(1, this.A01) + 0;
        } else {
            i = 0;
        }
        if ((i3 & 2) == 2) {
            i += C0RS.A07(2, this.A02);
        }
        for (int i4 = 0; i4 < this.A03.size(); i4++) {
            i += C0RS.A0A(3, (C0AX) this.A03.get(i4));
        }
        int A00 = this.unknownFields.A00() + i;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0M(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0M(2, this.A02);
        }
        for (int i = 0; i < this.A03.size(); i++) {
            c0rs.A0O(3, (C0AX) this.A03.get(i));
        }
        this.unknownFields.A02(c0rs);
    }
}
