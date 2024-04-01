package X;

import android.app.Application;
import java.io.File;
import java.util.UUID;

/* renamed from: X.3Fo  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C67453Fo {
    public final /* synthetic */ C0KY A00;
    public final /* synthetic */ C22e A01;
    public final /* synthetic */ AnonymousClass236 A02;
    public final /* synthetic */ C455522n A03;
    public final /* synthetic */ AnonymousClass232 A04;
    public final /* synthetic */ C2EK A05;

    public /* synthetic */ C67453Fo(C455522n c455522n, AnonymousClass236 anonymousClass236, C22e c22e, C0KY c0ky, AnonymousClass232 anonymousClass232, C2EK c2ek) {
        this.A03 = c455522n;
        this.A02 = anonymousClass236;
        this.A01 = c22e;
        this.A00 = c0ky;
        this.A04 = anonymousClass232;
        this.A05 = c2ek;
    }

    public final void A00(File file, boolean z) {
        final C455522n c455522n = this.A03;
        final AnonymousClass236 anonymousClass236 = this.A02;
        final C22e c22e = this.A01;
        C0KY c0ky = this.A00;
        final AnonymousClass232 anonymousClass232 = this.A04;
        C2EK c2ek = this.A05;
        if (z && file != null) {
            anonymousClass236.A02.A04(new C2z6(file, file.getName(), file.length(), C02180Ae.A1b(file)));
        }
        AnonymousClass237 anonymousClass237 = new AnonymousClass237() { // from class: X.3Fq
            @Override // X.AnonymousClass237
            public final void AKW(AnonymousClass235 anonymousClass235) {
                C455522n c455522n2 = C455522n.this;
                C22e c22e2 = c22e;
                AnonymousClass232 anonymousClass2322 = anonymousClass232;
                AnonymousClass236 anonymousClass2362 = anonymousClass236;
                if (anonymousClass235.A02) {
                    C456222u c456222u = c455522n2.A02;
                    String str = anonymousClass2322.A08;
                    Application application = c455522n2.A00.A00;
                    if (str != null) {
                        C68643Kv c68643Kv = new C68643Kv(c456222u.A00, c456222u.A02, c22e2, str, application);
                        c456222u.A01(c68643Kv.ABB(), c68643Kv);
                    }
                }
                anonymousClass2362.A04.A04(anonymousClass235);
            }
        };
        AnonymousClass238 anonymousClass238 = anonymousClass236.A06;
        AnonymousClass239 anonymousClass239 = anonymousClass236.A05;
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID().toString());
        sb.append(".mp4");
        C23M c23m = new C23M(c22e, c0ky, anonymousClass237, anonymousClass238, anonymousClass239, c455522n.A00(file, sb.toString()), anonymousClass232.A02, anonymousClass232.A03, c2ek, file);
        c455522n.A04.A00(C0DC.A04).A01(((C23B) c23m).A02, c23m);
    }
}
