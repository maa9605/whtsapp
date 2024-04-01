package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.22u */
/* loaded from: classes2.dex */
public class C456222u extends AbstractC455722p {
    public static volatile C456222u A04;
    public final C012005w A00;
    public final C002301c A01;
    public final C40081rY A02;
    public final C43791xz A03;

    public C456222u(InterfaceC002901k interfaceC002901k, C012005w c012005w, C40081rY c40081rY, C002301c c002301c, C43791xz c43791xz) {
        super(new C458323x(interfaceC002901k, "ProcessDoodleQueue"));
        this.A00 = c012005w;
        this.A02 = c40081rY;
        this.A01 = c002301c;
        this.A03 = c43791xz;
    }

    public void A07(C22e c22e, String str, Context context, C23C c23c) {
        if (str == null) {
            c23c.ALS(null);
            return;
        }
        C3FQ c3fq = new C3FQ(this.A00, this.A02, c22e, this.A01, this.A03, str, context, c23c) { // from class: X.3Kw
            public final C002301c A00;
            public final C23C A01;
            public final C43791xz A02;

            {
                this.A00 = r10;
                this.A01 = c23c;
                this.A02 = r11;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2EK c2ek;
                File A0F = C0DD.A0F(super.A01, this.A04);
                if (A0F.exists()) {
                    c2ek = C2EK.A02(A0F, super.A00, super.A02, this.A00, this.A02);
                } else {
                    c2ek = null;
                }
                this.A01.ALS(c2ek);
            }
        };
        A01(c3fq.ABB(), c3fq);
    }
}
