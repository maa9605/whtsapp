package X;

import android.os.SystemClock;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: X.1nJ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C37951nJ implements InterfaceC010405f {
    public final long A00 = SystemClock.elapsedRealtime();
    public final AbstractC000600i A01;
    public final C003701t A02;
    public final C05Y A03;
    public final C37851n9 A04;
    public final String A05;
    public final String A06;

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
    }

    public C37951nJ(C003701t c003701t, AbstractC000600i abstractC000600i, C05Y c05y, String str, String str2, C37851n9 c37851n9) {
        this.A02 = c003701t;
        this.A01 = abstractC000600i;
        this.A03 = c05y;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = c37851n9;
    }

    public final boolean A00() {
        String str = this.A06;
        if (str == "preview" && this.A02.A0C(101)) {
            return true;
        }
        return str == "image" && this.A02.A0C(102);
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        int A01 = C40731sm.A01(c02590Ca);
        AbstractC005302j abstractC005302j = (AbstractC005302j) c02590Ca.A08(AbstractC005302j.class, "from", this.A01);
        if (A01 == 404) {
            this.A04.A00(new C27851Pa(abstractC005302j, null, null, null, -1, "preview".equals(this.A06) ? 2 : 1), this.A00);
            return;
        }
        C37851n9 c37851n9 = this.A04;
        String str2 = this.A06;
        long j = this.A00;
        C03510Fz c03510Fz = c37851n9.A07;
        c03510Fz.A01.A01(abstractC005302j);
        c03510Fz.A02.A01(abstractC005302j);
        c37851n9.A04.A01(abstractC005302j, A01);
        c37851n9.A02.A02(6, "preview".equals(str2) ? 1 : 2, Long.valueOf(System.currentTimeMillis() - j), null);
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        URL url;
        String str2;
        int parseInt;
        String str3;
        C04P A0A;
        AbstractC005302j abstractC005302j = (AbstractC005302j) c02590Ca.A08(AbstractC005302j.class, "from", this.A01);
        C02590Ca A0D = c02590Ca.A0D("picture");
        String str4 = this.A05;
        byte[] bArr = null;
        if (A0D != null) {
            byte[] bArr2 = A0D.A01;
            if (A00() && (A0A = A0D.A0A("direct_path")) != null) {
                str2 = A0A.A03;
            } else {
                str2 = null;
            }
            C04P A0A2 = A0D.A0A("url");
            if (A0A2 != null && (str3 = A0A2.A03) != null) {
                try {
                    url = new URL(str3);
                } catch (MalformedURLException unused) {
                    throw new C0L4("Malformed picture url");
                }
            } else {
                url = null;
            }
            C04P A0A3 = A0D.A0A("id");
            str4 = A0A3 != null ? A0A3.A03 : null;
            bArr = bArr2;
        } else {
            url = null;
            str2 = null;
        }
        if (abstractC005302j != null) {
            if (str4 == null) {
                parseInt = -1;
            } else {
                try {
                    parseInt = Integer.parseInt(str4);
                } catch (NumberFormatException unused2) {
                    throw new C0L4(C000200d.A0H("Malformed photo id=", str4));
                }
            }
            this.A04.A00(new C27851Pa(abstractC005302j, bArr, url, str2, parseInt, "preview".equals(this.A06) ? 2 : 1), this.A00);
        }
    }
}
