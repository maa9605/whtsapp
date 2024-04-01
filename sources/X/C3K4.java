package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.3K4  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3K4 extends C66233Ag implements C0CG {
    public final C66223Af A00;
    public final C454622d A01;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3K4(android.content.Context r2, X.C454622d r3, X.C66223Af r4) {
        /*
            r1 = this;
            X.0CK r0 = r3.A07
            java.lang.Object r0 = r0.A00()
            X.0KW r0 = (X.C0KW) r0
            if (r0 == 0) goto L18
            java.io.File r0 = r0.A01
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
        L10:
            r1.<init>(r2, r0)
            r1.A01 = r3
            r1.A00 = r4
            return
        L18:
            r0 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3K4.<init>(android.content.Context, X.22d, X.3Af):void");
    }

    @Override // X.C0CG
    public void A54(Object obj) {
        File file = ((C0KW) obj).A01;
        Uri fromFile = Uri.fromFile(file);
        synchronized (this.A04) {
            if (!fromFile.equals(super.A01)) {
                super.A01 = fromFile;
                this.A02 = true;
            }
        }
        C66223Af c66223Af = this.A00;
        if (c66223Af != null) {
            if (c66223Af.A01 != null && c66223Af.A00 != file.length()) {
                C018508q c018508q = c66223Af.A02;
                c018508q.A02.post(new RunnableEBaseShape8S0100000_I1_0(c66223Af, 24));
            }
            c66223Af.A00 = file.length();
        }
    }

    @Override // X.C66233Ag, X.InterfaceC06380Sv
    public long AQX(AnonymousClass126 anonymousClass126) {
        this.A01.A07.A03(this, null);
        return super.AQX(anonymousClass126);
    }

    @Override // X.C66233Ag, X.InterfaceC06380Sv
    public void close() {
        this.A01.A07.A02(this);
        super.close();
    }
}
