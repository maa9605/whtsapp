package X;

/* renamed from: X.2va  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C61092va {
    public int A00 = -1;
    public long A01;
    public InterfaceC52102a4 A02;
    public final int A03;
    public final InterfaceC52142a8 A04;

    public C61092va(InterfaceC52142a8 interfaceC52142a8, int i) {
        this.A04 = interfaceC52142a8;
        this.A03 = i;
    }

    public boolean A00() {
        int i = this.A00;
        InterfaceC52142a8 interfaceC52142a8 = this.A04;
        if (i >= interfaceC52142a8.getCount() - 1) {
            return false;
        }
        int i2 = this.A00 + 1;
        this.A00 = i2;
        InterfaceC52102a4 AB8 = interfaceC52142a8.AB8(i2);
        this.A02 = AB8;
        this.A01 = AB8.A9h();
        return true;
    }
}
