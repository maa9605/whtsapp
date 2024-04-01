package X;

/* renamed from: X.0KU  reason: invalid class name */
/* loaded from: classes.dex */
public class C0KU extends AnonymousClass092 implements AnonymousClass099 {
    public int A00;

    @Override // X.AnonymousClass092
    public void A0V(int i) {
    }

    @Override // X.AnonymousClass092
    public boolean A0x() {
        return false;
    }

    @Override // X.AnonymousClass092
    public boolean A0y() {
        return false;
    }

    @Override // X.AnonymousClass092
    public String A16() {
        return null;
    }

    @Override // X.AnonymousClass092
    public void A17(String str) {
    }

    public C0KU(AnonymousClass094 anonymousClass094, int i, long j) {
        super(anonymousClass094, j, (byte) 36);
        this.A00 = i;
    }

    public C0KU(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 36);
    }

    @Override // X.AnonymousClass092
    public void A0U(int i) {
        if (i != 512) {
            this.A05 = i | this.A05;
        }
    }

    @Override // X.AnonymousClass092
    public void A0j(Long l) {
        C000700j.A08(false, "For FMessageEphemeralSettingChange the setting timestamp is the timestamp");
        this.A0Q = l;
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C40541sR c40541sR = c40551sS.A01;
        C48502Fm c48502Fm = (C48502Fm) c40541sR.A07().AVX();
        C452521b c452521b = (C452521b) ((C48512Fn) c48502Fm.A00).A0o().AVX();
        AnonymousClass094 anonymousClass094 = this.A0n;
        c452521b.A06(C003101m.A07(anonymousClass094.A00));
        c452521b.A07(anonymousClass094.A02);
        c48502Fm.A02();
        C48512Fn.A0C((C48512Fn) c48502Fm.A00, c452521b);
        int i = this.A00;
        c48502Fm.A02();
        C48512Fn c48512Fn = (C48512Fn) c48502Fm.A00;
        c48512Fn.A00 |= 4;
        c48512Fn.A01 = i;
        EnumC55282kA enumC55282kA = EnumC55282kA.EPHEMERAL_SETTING;
        c48502Fm.A02();
        C48512Fn.A0B((C48512Fn) c48502Fm.A00, enumC55282kA);
        c40541sR.A02();
        C40531sQ.A0X((C40531sQ) c40541sR.A00, c48502Fm);
    }
}
