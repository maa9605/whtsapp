package X;

import java.io.IOException;

/* renamed from: X.414  reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass414 extends C0AZ implements C0AY {
    public static final AnonymousClass414 A06;
    public static volatile C0RQ A07;
    public int A00;
    public int A01;
    public boolean A05;
    public String A04 = "";
    public String A03 = "";
    public C0CX A02 = C0RU.A01;

    static {
        AnonymousClass414 anonymousClass414 = new AnonymousClass414();
        A06 = anonymousClass414;
        anonymousClass414.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A06;
            case 1:
                C0RM c0rm = (C0RM) obj;
                AnonymousClass414 anonymousClass414 = (AnonymousClass414) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                String str = this.A04;
                int i2 = anonymousClass414.A00;
                this.A04 = c0rm.AWD(z, str, (i2 & 1) == 1, anonymousClass414.A04);
                this.A03 = c0rm.AWD((i & 2) == 2, this.A03, (i2 & 2) == 2, anonymousClass414.A03);
                this.A02 = c0rm.AW7(this.A02, anonymousClass414.A02);
                int i3 = this.A00;
                boolean z2 = (i3 & 4) == 4;
                int i4 = this.A01;
                int i5 = anonymousClass414.A00;
                this.A01 = c0rm.AW5(z2, i4, (i5 & 4) == 4, anonymousClass414.A01);
                this.A05 = c0rm.AW1((i3 & 8) == 8, this.A05, (i5 & 8) == 8, anonymousClass414.A05);
                if (c0rm == C0RN.A00) {
                    this.A00 = i3 | i5;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r5) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            if (A03 != 0) {
                                if (A03 == 10) {
                                    String A0A = c0ro.A0A();
                                    this.A00 |= 1;
                                    this.A04 = A0A;
                                } else if (A03 == 18) {
                                    String A0A2 = c0ro.A0A();
                                    this.A00 |= 2;
                                    this.A03 = A0A2;
                                } else if (A03 == 26) {
                                    String A0A3 = c0ro.A0A();
                                    C0CX c0cx = this.A02;
                                    if (!((C0CY) c0cx).A00) {
                                        c0cx = C0AZ.A05(c0cx);
                                        this.A02 = c0cx;
                                    }
                                    c0cx.add(A0A3);
                                } else if (A03 == 32) {
                                    this.A00 |= 4;
                                    this.A01 = c0ro.A02();
                                } else if (A03 != 40) {
                                    if (!A0I(A03, c0ro)) {
                                    }
                                } else {
                                    this.A00 |= 8;
                                    this.A05 = c0ro.A0F();
                                }
                            }
                            r5 = true;
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
                ((C0CY) this.A02).A00 = false;
                return null;
            case 4:
                return new AnonymousClass414();
            case 5:
                return new C0CT() { // from class: X.413
                    {
                        AnonymousClass414 anonymousClass4142 = AnonymousClass414.A06;
                    }
                };
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (AnonymousClass414.class) {
                        if (A07 == null) {
                            A07 = new C0RR(A06);
                        }
                    }
                }
                return A07;
            default:
                throw new UnsupportedOperationException();
        }
        return A06;
    }

    @Override // X.C0AX
    public int AD4() {
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A00 & 1) == 1) {
            i = C0RS.A0B(1, this.A04) + 0;
        } else {
            i = 0;
        }
        if ((this.A00 & 2) == 2) {
            i += C0RS.A0B(2, this.A03);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.A02.size(); i4++) {
            i3 += C0RS.A0D((String) this.A02.get(i4));
        }
        int size = this.A02.size() + i + i3;
        int i5 = this.A00;
        if ((i5 & 4) == 4) {
            size += C0RS.A05(4, this.A01);
        }
        if ((i5 & 8) == 8) {
            size += C0RS.A00(5);
        }
        int A00 = this.unknownFields.A00() + size;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A04);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0P(2, this.A03);
        }
        for (int i = 0; i < this.A02.size(); i++) {
            c0rs.A0P(3, (String) this.A02.get(i));
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0I(4, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0Q(5, this.A05);
        }
        this.unknownFields.A02(c0rs);
    }
}
