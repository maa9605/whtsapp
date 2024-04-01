package X;

import java.io.InputStream;

/* renamed from: X.231  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass231 implements InterfaceC43611xg {
    public final C0DC A00;

    public AnonymousClass231(C0DC c0dc) {
        this.A00 = c0dc;
    }

    @Override // X.InterfaceC43611xg
    public InterfaceC43551xa A9w(byte[] bArr) {
        return new InterfaceC43551xa() { // from class: X.39y
            @Override // X.InterfaceC43551xa
            public final InputStream A7a(InputStream inputStream) {
                return inputStream;
            }
        };
    }

    @Override // X.InterfaceC43611xg
    public InterfaceC59882tZ AAo() {
        return new InterfaceC59882tZ() { // from class: X.39x
            @Override // X.InterfaceC59882tZ
            public final C42621w3 A7A(byte[] bArr) {
                return C42041uv.A03(C002701i.A1Y(bArr, AnonymousClass231.this.A00.A03, 80));
            }
        };
    }
}
