package X;

/* renamed from: X.0CT */
/* loaded from: classes.dex */
public abstract class C0CT extends C0CU {
    public C0AZ A00;
    public boolean A01 = false;
    public final C0AZ A02;

    public C0CT(C0AZ c0az) {
        this.A02 = c0az;
        this.A00 = (C0AZ) c0az.A0h(C0RL.NEW_MUTABLE_INSTANCE, null, null);
    }

    public C0AZ A00() {
        if (this.A01) {
            return this.A00;
        }
        this.A00.A0E();
        this.A01 = true;
        return this.A00;
    }

    public final C0AZ A01() {
        C0AZ A00 = A00();
        if (A00.A0H()) {
            return A00;
        }
        throw new C24801Cx();
    }

    public void A02() {
        if (this.A01) {
            C0AZ c0az = (C0AZ) this.A00.A0h(C0RL.NEW_MUTABLE_INSTANCE, null, null);
            c0az.A0G(C0RN.A00, this.A00);
            this.A00 = c0az;
            this.A01 = false;
        }
    }

    public void A03(C0AZ c0az) {
        A02();
        this.A00.A0G(C0RN.A00, c0az);
    }

    @Override // X.C0AY
    public C0AX A9k() {
        return this.A02;
    }

    public Object clone() {
        C0CT c0ct = (C0CT) this.A02.A0h(C0RL.NEW_BUILDER, null, null);
        c0ct.A03(A00());
        return c0ct;
    }
}
