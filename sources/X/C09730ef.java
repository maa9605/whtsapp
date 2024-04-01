package X;

/* renamed from: X.0ef  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09730ef implements InterfaceC02360Aw {
    public C02520Bt A00 = null;

    @Override // X.InterfaceC02360Aw
    public AbstractC02530Bu AAs() {
        C02520Bt c02520Bt = this.A00;
        if (c02520Bt == null) {
            C02520Bt c02520Bt2 = new C02520Bt(this);
            this.A00 = c02520Bt2;
            return c02520Bt2;
        }
        return c02520Bt;
    }
}
