package X;

import com.whatsapp.util.Log;
import java.util.AbstractCollection;

/* renamed from: X.20l */
/* loaded from: classes2.dex */
public class C451120l {
    public static volatile C451120l A05;
    public final C41541u6 A00;
    public final C000500h A01;
    public final C41711uO A02;
    public final C41521u3 A03;
    public final C41991uq A04;

    public C451120l(C41991uq c41991uq, C41541u6 c41541u6, C41521u3 c41521u3, C000500h c000500h, C41711uO c41711uO) {
        this.A04 = c41991uq;
        this.A00 = c41541u6;
        this.A03 = c41521u3;
        this.A01 = c000500h;
        this.A02 = c41711uO;
    }

    public static C451120l A00() {
        if (A05 == null) {
            synchronized (C451120l.class) {
                if (A05 == null) {
                    A05 = new C451120l(C41991uq.A00(), C41541u6.A00(), C41521u3.A00(), C000500h.A00(), C41711uO.A00());
                }
            }
        }
        return A05;
    }

    public void A01() {
        C000500h c000500h = this.A01;
        if (c000500h.A0k()) {
            return;
        }
        C41991uq c41991uq = this.A04;
        if (!((AbstractCollection) c41991uq.A04()).isEmpty()) {
            try {
                this.A03.A0J(true);
                c41991uq.A07();
            } catch (Exception e) {
                Log.w("MDOptInManager/Logging_Out_Legacy_Devices/Failed", e);
            }
        }
        this.A00.A0P();
        C000200d.A0j(c000500h, "companion_reg_opt_in_enabled", true);
    }

    public void A02(InterfaceC04240Jk interfaceC04240Jk) {
        C000500h c000500h = this.A01;
        if (c000500h.A0k()) {
            C41711uO c41711uO = this.A02;
            if (!((AbstractCollection) c41711uO.A05()).isEmpty()) {
                c41711uO.A00(new C450720h(this, interfaceC04240Jk));
                c41711uO.A0D(false);
                return;
            }
            this.A00.A0P();
            C000200d.A0j(c000500h, "companion_reg_opt_in_enabled", false);
        }
    }
}
