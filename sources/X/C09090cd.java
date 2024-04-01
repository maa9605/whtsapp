package X;

/* renamed from: X.0cd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09090cd implements InterfaceC05620Pl {
    public int A00 = -1;
    public final C0HL A01;
    public final InterfaceC05620Pl A02;

    public C09090cd(C0HL c0hl, InterfaceC05620Pl interfaceC05620Pl) {
        this.A01 = c0hl;
        this.A02 = interfaceC05620Pl;
    }

    @Override // X.InterfaceC05620Pl
    public void AIK(Object obj) {
        int i = this.A00;
        int i2 = this.A01.A01;
        if (i != i2) {
            this.A00 = i2;
            this.A02.AIK(obj);
        }
    }
}
