package X;

import android.text.TextUtils;

/* renamed from: X.2Lx */
/* loaded from: classes2.dex */
public class C49682Lx {
    public static volatile C49682Lx A05;
    public C3NT A00 = null;
    public final C001200o A01;
    public final C0EU A02;
    public final C0GR A03;
    public final C0DV A04;

    public C49682Lx(C001200o c001200o, C0DV c0dv, C0EU c0eu, C0GR c0gr) {
        this.A01 = c001200o;
        this.A04 = c0dv;
        this.A02 = c0eu;
        this.A03 = c0gr;
    }

    public static C49682Lx A00() {
        if (A05 == null) {
            synchronized (C49682Lx.class) {
                if (A05 == null) {
                    A05 = new C49682Lx(C001200o.A01, C0DV.A00(), C0EU.A00(), C0GR.A00());
                }
            }
        }
        return A05;
    }

    public final C3NT A01() {
        InterfaceC03590Gh interfaceC03590Gh;
        String str;
        C0DX ACJ;
        C0GR c0gr = this.A03;
        if (c0gr.A02() != null) {
            interfaceC03590Gh = this.A04.A02(c0gr.A02().A02);
        } else {
            interfaceC03590Gh = null;
        }
        InterfaceC013706o A01 = c0gr.A01();
        if (A01 != null) {
            str = A01.A9K();
        } else {
            str = null;
        }
        if (interfaceC03590Gh == null || (ACJ = interfaceC03590Gh.ACJ(str)) == null) {
            return null;
        }
        return ACJ.AC2(this.A01, this.A02);
    }

    public String A02() {
        C3NT c3nt = this.A00;
        if (c3nt == null) {
            c3nt = A01();
            this.A00 = c3nt;
        }
        String str = null;
        if (c3nt != null) {
            C90684Ca c90684Ca = (C90684Ca) c3nt;
            str = c90684Ca.A01.A04().getString("payments_device_id", null);
            if (!TextUtils.isEmpty(str)) {
                C014406v c014406v = c90684Ca.A02;
                StringBuilder sb = new StringBuilder("PaymentDeviceId: from cache: ");
                sb.append(str);
                c014406v.A03(sb.toString());
            } else {
                String A00 = c90684Ca.A00();
                C000200d.A0k(c90684Ca.A01, "payments_device_id", A00);
                C014406v c014406v2 = c90684Ca.A02;
                StringBuilder sb2 = new StringBuilder("PaymentDeviceId: generated: ");
                sb2.append(A00);
                c014406v2.A03(sb2.toString());
                return A00;
            }
        }
        return str;
    }
}
