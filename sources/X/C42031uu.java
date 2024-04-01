package X;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import com.google.android.search.verification.client.R;

/* renamed from: X.1uu */
/* loaded from: classes2.dex */
public class C42031uu {
    public static volatile C42031uu A07;
    public final C001200o A00;
    public final C005102h A01;
    public final C0EU A02;
    public final C0DW A03;
    public final C0DV A04;
    public final C0CB A05;
    public final InterfaceC002901k A06;

    public C42031uu(C001200o c001200o, InterfaceC002901k interfaceC002901k, C0DV c0dv, C0CB c0cb, C0EU c0eu, C0DW c0dw, C005102h c005102h) {
        this.A00 = c001200o;
        this.A06 = interfaceC002901k;
        this.A04 = c0dv;
        this.A05 = c0cb;
        this.A02 = c0eu;
        this.A03 = c0dw;
        this.A01 = c005102h;
    }

    public static C42031uu A00() {
        if (A07 == null) {
            synchronized (C42031uu.class) {
                if (A07 == null) {
                    A07 = new C42031uu(C001200o.A01, C002801j.A00(), C0DV.A00(), C0CB.A00(), C0EU.A00(), C0DW.A00(), C005102h.A00());
                }
            }
        }
        return A07;
    }

    public void A01() {
        this.A06.AS1(new RunnableEBaseShape4S0100000_I0_4(this, 44));
    }

    public void A02() {
        this.A06.AS1(new RunnableEBaseShape4S0100000_I0_4(this, 42));
    }

    public final void A03(String str, String str2, String str3) {
        C0KJ A05;
        Class ACK;
        C001200o c001200o = this.A00;
        C005402l A00 = C0DU.A00(c001200o.A00);
        A00.A0I = "status";
        A00.A03 = 1;
        A00.A05(16, true);
        A00.A03(4);
        A00.A06 = 0;
        A00.A07.icon = R.drawable.notifybar;
        A00.A0A(str);
        A00.A09(str2);
        C05170Np c05170Np = new C05170Np();
        c05170Np.A07(str2);
        A00.A08(c05170Np);
        if (Build.VERSION.SDK_INT >= 26) {
            A00.A0J = ((C03400Fo) this.A05.A04()).A0C();
        }
        if (str3.equals("KYC")) {
            Intent intent = new Intent(c001200o.A00, this.A04.A03().ACK());
            intent.addFlags(335544320);
            A00.A09 = PendingIntent.getActivity(c001200o.A00, 0, intent, 0);
            this.A01.A03(null, 26, A00.A01());
        } else if (!str3.equals("STEP_UP") || (A05 = this.A02.A05()) == null) {
        } else {
            String str4 = A05.A01;
            if (str4.equals("FBPAY")) {
                Class AC4 = this.A04.A03().AC4();
                if (AC4 == null) {
                    return;
                }
                Intent intent2 = new Intent(c001200o.A00, AC4);
                intent2.addFlags(335544320);
                intent2.putExtra("notification-type", "STEP_UP");
                A00.A09 = PendingIntent.getActivity(c001200o.A00, 0, intent2, 134217728);
                this.A01.A03(null, 28, A00.A01());
            } else if (!str4.equals("UPI") || (ACK = this.A04.A03().ACK()) == null) {
            } else {
                Intent intent3 = new Intent(c001200o.A00, ACK);
                intent3.addFlags(335544320);
                intent3.putExtra("notification-type", "STEP_UP");
                A00.A09 = PendingIntent.getActivity(c001200o.A00, 0, intent3, 134217728);
                this.A01.A03(null, 28, A00.A01());
            }
        }
    }
}
