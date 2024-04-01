package X;

import android.widget.ImageView;
import java.io.File;

/* renamed from: X.4Aq */
/* loaded from: classes3.dex */
public class C90344Aq {
    public AnonymousClass241 A00;
    public final C00J A01;
    public final C00J A02;
    public final C00J A03;

    public C90344Aq(C00J c00j, C00J c00j2, C00J c00j3) {
        this.A02 = c00j;
        this.A01 = c00j2;
        this.A03 = c00j3;
    }

    public void A00(String str, String str2, ImageView imageView) {
        AnonymousClass241 anonymousClass241 = this.A00;
        if (anonymousClass241 == null) {
            AnonymousClass242 anonymousClass242 = new AnonymousClass242((C018508q) this.A01.get(), (C41451tw) this.A03.get(), new File(((C001200o) this.A02.get()).A00.getCacheDir(), "wabloks_images"));
            anonymousClass242.A05 = true;
            anonymousClass242.A02 = 16777216L;
            anonymousClass242.A01 = Integer.MAX_VALUE;
            anonymousClass241 = anonymousClass242.A00();
            this.A00 = anonymousClass241;
        }
        int i = anonymousClass241.A00;
        anonymousClass241.A01.A00(new C83473sB(str, str2, imageView, null, null, i, i, null), anonymousClass241.A02);
    }
}
