package X;

import java.io.IOException;

/* renamed from: X.2kB */
/* loaded from: classes2.dex */
public final class C55292kB extends C0AZ implements C0AY {
    public static final C55292kB A03;
    public static volatile C0RQ A04;
    public int A00;
    public long A01;
    public C0CX A02 = C0RU.A01;

    static {
        C55292kB c55292kB = new C55292kB();
        A03 = c55292kB;
        c55292kB.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        boolean z = false;
        switch (c0rl.ordinal()) {
            case 0:
                return A03;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C55292kB c55292kB = (C55292kB) obj2;
                this.A02 = c0rm.AW7(this.A02, c55292kB.A02);
                int i = this.A00;
                boolean z2 = (i & 1) == 1;
                long j = this.A01;
                int i2 = c55292kB.A00;
                this.A01 = c0rm.AW8(z2, j, (i2 & 1) == 1, c55292kB.A01);
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
                            if (A032 == 10) {
                                String A0A = c0ro.A0A();
                                C0CX c0cx = this.A02;
                                if (!((C0CY) c0cx).A00) {
                                    c0cx = C0AZ.A05(c0cx);
                                    this.A02 = c0cx;
                                }
                                c0cx.add(A0A);
                            } else if (A032 != 16) {
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
                ((C0CY) this.A02).A00 = false;
                return null;
            case 4:
                return new C55292kB();
            case 5:
                return new C0CT() { // from class: X.3zc
                    {
                        C55292kB c55292kB2 = C55292kB.A03;
                    }
                };
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C55292kB.class) {
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
        int i2 = 0;
        for (int i3 = 0; i3 < this.A02.size(); i3++) {
            i2 += C0RS.A0D((String) this.A02.get(i3));
        }
        int size = this.A02.size() + 0 + i2;
        if ((this.A00 & 1) == 1) {
            size += C0RS.A07(2, this.A01);
        }
        int A00 = this.unknownFields.A00() + size;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        for (int i = 0; i < this.A02.size(); i++) {
            c0rs.A0P(1, (String) this.A02.get(i));
        }
        if ((this.A00 & 1) == 1) {
            c0rs.A0M(2, this.A01);
        }
        this.unknownFields.A02(c0rs);
    }
}
