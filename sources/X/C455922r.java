package X;

import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.22r */
/* loaded from: classes2.dex */
public class C455922r {
    public static volatile C455922r A04;
    public AnonymousClass233 A00;
    public AnonymousClass233 A01;
    public final AnonymousClass244 A02;
    public final C456022s A03;

    public C455922r(InterfaceC002901k interfaceC002901k, C456022s c456022s) {
        this.A03 = c456022s;
        final AnonymousClass244 anonymousClass244 = new AnonymousClass244(interfaceC002901k);
        this.A02 = anonymousClass244;
        this.A00 = new AnonymousClass233(c456022s, C007203d.A00(new InterfaceC007103c() { // from class: X.245
            @Override // X.InterfaceC007103c
            public final Object get() {
                return anonymousClass244.A00.A6y("ProcessImageQueue", 4, 4, 0L, 1, new LinkedBlockingQueue());
            }
        }));
        C456022s c456022s2 = this.A03;
        final AnonymousClass244 anonymousClass2442 = this.A02;
        this.A01 = new AnonymousClass233(c456022s2, C007203d.A00(new InterfaceC007103c() { // from class: X.246
            @Override // X.InterfaceC007103c
            public final Object get() {
                return anonymousClass2442.A00.A6y("TranscodeQueue", 1, 1, 0L, 1, new LinkedBlockingQueue());
            }
        }));
    }

    public final AnonymousClass233 A00(C0DC c0dc) {
        if (c0dc != C0DC.A0A && c0dc != C0DC.A0P && c0dc != C0DC.A0C && c0dc != C0DC.A0H && c0dc != C0DC.A06) {
            return this.A01;
        }
        return this.A00;
    }
}
