package X;

import java.io.File;

/* renamed from: X.45S */
/* loaded from: classes3.dex */
public class C45S {
    public static volatile C45S A04;
    public AnonymousClass241 A00;
    public final C018508q A01;
    public final C001200o A02;
    public final C41451tw A03;

    public C45S(C001200o c001200o, C018508q c018508q, C41451tw c41451tw) {
        this.A02 = c001200o;
        this.A01 = c018508q;
        this.A03 = c41451tw;
    }

    public AnonymousClass241 A00() {
        AnonymousClass241 anonymousClass241 = this.A00;
        if (anonymousClass241 == null) {
            AnonymousClass242 anonymousClass242 = new AnonymousClass242(this.A01, this.A03, new File(this.A02.A00.getCacheDir(), "bloks_images"));
            anonymousClass242.A01 = Integer.MAX_VALUE;
            anonymousClass242.A05 = true;
            AnonymousClass241 A00 = anonymousClass242.A00();
            this.A00 = A00;
            return A00;
        }
        return anonymousClass241;
    }
}
