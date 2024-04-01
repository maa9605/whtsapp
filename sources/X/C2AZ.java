package X;

import android.app.Application;
import android.os.Message;
import com.whatsapp.Me;
import com.whatsapp.util.Log;

/* renamed from: X.2AZ  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2AZ implements C0EK {
    public static volatile C2AZ A01;
    public final C2Aa A00;

    public C2AZ(C2Aa c2Aa) {
        this.A00 = c2Aa;
    }

    @Override // X.C0EK
    public int[] AAP() {
        return new int[]{198, 199, 200, 201};
    }

    @Override // X.C0EK
    public boolean AEN(int i, Message message) {
        switch (i) {
            case 198:
                C2Aa c2Aa = this.A00;
                String str = (String) message.obj;
                for (InterfaceC51192Ux interfaceC51192Ux : c2Aa.A0l) {
                    interfaceC51192Ux.AMV(str);
                }
                return true;
            case 199:
                C2Aa c2Aa2 = this.A00;
                int i2 = message.arg2;
                for (InterfaceC51192Ux interfaceC51192Ux2 : c2Aa2.A0l) {
                    interfaceC51192Ux2.AMU(i2);
                }
                return true;
            case 200:
                this.A00.A06();
                return true;
            case 201:
                C2Aa c2Aa3 = this.A00;
                int i3 = message.arg2;
                C02L c02l = c2Aa3.A05;
                Me A012 = c02l.A01();
                Application application = c2Aa3.A0I.A00;
                if (A012 == null) {
                    Log.w("registrationmanager/response/error but already changed");
                    return true;
                } else if (i3 == 400) {
                    Log.w("registrationmanager/check-number/match");
                    c2Aa3.A01.post(new RunnableEBaseShape4S0200000_I0_4(c2Aa3, application, 6));
                    c02l.A04();
                    c2Aa3.A03.A02();
                    return true;
                } else if (i3 == 401) {
                    c2Aa3.A01.post(new RunnableEBaseShape4S0200000_I0_4(c2Aa3, application, 3));
                    c2Aa3.A0K.A0e(true);
                    c2Aa3.A06.A03();
                    c02l.A04();
                    c2Aa3.A03.A02();
                    return true;
                } else if (i3 == 405) {
                    c2Aa3.A06();
                    return true;
                } else {
                    if (i3 != 409 && i3 < 500) {
                        c2Aa3.A0K.A0e(true);
                        c2Aa3.A06.A03();
                        c02l.A04();
                        c2Aa3.A03.A02();
                    }
                    return true;
                }
            default:
                return false;
        }
    }
}
