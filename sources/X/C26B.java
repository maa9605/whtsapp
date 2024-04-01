package X;

import com.whatsapp.util.Log;

/* renamed from: X.26B  reason: invalid class name */
/* loaded from: classes2.dex */
public class C26B {
    public static volatile C26B A03;
    public final C001200o A00;
    public final C41451tw A01;
    public final AnonymousClass035 A02;

    public C26B(C001200o c001200o, AnonymousClass035 anonymousClass035, C41451tw c41451tw) {
        this.A00 = c001200o;
        this.A02 = anonymousClass035;
        this.A01 = c41451tw;
    }

    public final InterfaceC02170Ad A00(C0JK c0jk, String str) {
        InterfaceC02170Ad A01 = c0jk.A01(str, this.A02, null);
        C0JL c0jl = (C0JL) A01;
        if (c0jl.A6H() >= 400) {
            StringBuilder A0P = C000200d.A0P("WallpaperDownloader/download/Error, code=");
            A0P.append(c0jl.A6H());
            Log.e(A0P.toString());
            return null;
        }
        c0jl.A6H();
        return A01;
    }
}
