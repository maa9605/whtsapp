package X;

/* renamed from: X.1Td  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28671Td implements InterfaceC05620Pl {
    public boolean A00 = false;
    public final C0HQ A01;
    public final C13930m5 A02;

    public C28671Td(C13930m5 c13930m5, C0HQ c0hq) {
        this.A02 = c13930m5;
        this.A01 = c0hq;
    }

    @Override // X.InterfaceC05620Pl
    public void AIK(Object obj) {
        this.A01.ALT(this.A02, obj);
        this.A00 = true;
    }

    public String toString() {
        return this.A01.toString();
    }
}
