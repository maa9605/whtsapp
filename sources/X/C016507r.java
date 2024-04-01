package X;

/* renamed from: X.07r  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C016507r implements InterfaceC016607s {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AbstractC016307p A04;
    public final Object A05;

    @Override // X.InterfaceC016607s
    public final int A8v() {
        return 0;
    }

    @Override // X.InterfaceC016607s
    public int ABn() {
        return 0;
    }

    @Override // X.InterfaceC016607s
    public int ABo() {
        return 0;
    }

    @Override // X.InterfaceC016607s
    public int ABp() {
        return 0;
    }

    @Override // X.InterfaceC016607s
    public int ABq() {
        return 0;
    }

    public C016507r(AbstractC016307p abstractC016307p, int i, int i2, int i3, int i4) {
        this(abstractC016307p, i, i2, i3, i4, null);
    }

    public C016507r(AbstractC016307p abstractC016307p, int i, int i2, int i3, int i4, Object obj) {
        this.A04 = abstractC016307p;
        this.A02 = i3;
        this.A01 = i4;
        this.A03 = i;
        this.A00 = i2;
        this.A05 = obj;
    }

    @Override // X.InterfaceC016607s
    public final InterfaceC016607s A8q(int i) {
        throw new IllegalArgumentException("A MeasureResult has no children");
    }

    @Override // X.InterfaceC016607s
    public int AAT() {
        return this.A00;
    }

    @Override // X.InterfaceC016607s
    public final Object AAq() {
        return this.A05;
    }

    @Override // X.InterfaceC016607s
    public final AbstractC016307p ACm() {
        return this.A04;
    }

    @Override // X.InterfaceC016607s
    public int AE3() {
        return this.A03;
    }

    @Override // X.InterfaceC016607s
    public final int AE7(int i) {
        throw new IllegalArgumentException("A MeasureResult has no children");
    }

    @Override // X.InterfaceC016607s
    public final int AE8(int i) {
        throw new IllegalArgumentException("A MeasureResult has no children");
    }

    @Override // X.InterfaceC016607s
    public final int getHeight() {
        return this.A01;
    }

    @Override // X.InterfaceC016607s
    public final int getWidth() {
        return this.A02;
    }
}
