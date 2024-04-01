package X;

/* renamed from: X.355  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass355 implements InterfaceC57222ot {
    public final C57212os A00 = new C57212os();
    public final /* synthetic */ SurfaceHolder$CallbackC49122Io A01;

    public AnonymousClass355(SurfaceHolder$CallbackC49122Io surfaceHolder$CallbackC49122Io) {
        this.A01 = surfaceHolder$CallbackC49122Io;
    }

    @Override // X.InterfaceC57222ot
    public synchronized C57212os A8D() {
        C57212os c57212os;
        c57212os = this.A00;
        byte[] bArr = c57212os.A02;
        if (bArr != null) {
            SurfaceHolder$CallbackC49122Io surfaceHolder$CallbackC49122Io = this.A01;
            if (surfaceHolder$CallbackC49122Io.A07 != null && !surfaceHolder$CallbackC49122Io.A0T && bArr == surfaceHolder$CallbackC49122Io.A0Y) {
                surfaceHolder$CallbackC49122Io.A07.addCallbackBuffer(bArr);
            }
            c57212os.A02 = null;
        }
        while (c57212os.A02 == null) {
            wait();
        }
        return c57212os;
    }
}
