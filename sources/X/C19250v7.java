package X;

/* renamed from: X.0v7  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19250v7 {
    public long A00 = -1;
    public final InterfaceC19190v0 A01;

    public C19250v7(InterfaceC19190v0 interfaceC19190v0) {
        this.A01 = interfaceC19190v0;
    }

    public long A00() {
        InterfaceC19190v0 interfaceC19190v0;
        long j = this.A00;
        if (j != -1) {
            return j;
        }
        this.A00 = 0L;
        int frameCount = this.A01.getFrameCount();
        for (int i = 0; i < frameCount; i++) {
            this.A00 += interfaceC19190v0.AAI(i);
        }
        return this.A00;
    }
}
