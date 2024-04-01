package X;

import android.app.Application;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.05N  reason: invalid class name */
/* loaded from: classes.dex */
public class C05N {
    public static volatile C05N A02;
    public final C001200o A00;
    public final C05E A01;

    public C05N(C001200o c001200o, C05E c05e) {
        this.A00 = c001200o;
        this.A01 = c05e;
    }

    public static C05N A00() {
        if (A02 == null) {
            synchronized (C05N.class) {
                if (A02 == null) {
                    A02 = new C05N(C001200o.A01, C05E.A00());
                }
            }
        }
        return A02;
    }

    public void A01() {
        StringBuilder A0P = C000200d.A0P("msgstore-manager/finish/db-is-ready ");
        C05E c05e = this.A01;
        c05e.A05();
        C000200d.A1V(A0P, c05e.A01);
        synchronized (this) {
            c05e.A05();
            if (!c05e.A01) {
                Log.w("msgstore-manager/finish/db is not ready yet", new Throwable());
            } else {
                c05e.A00 = true;
            }
        }
    }

    public void A02() {
        C05E c05e = this.A01;
        c05e.A05();
        c05e.A06();
    }

    public void A03() {
        C05E c05e = this.A01;
        c05e.A05();
        c05e.A06.A03 = true;
        A02();
        try {
            Application application = this.A00.A00;
            Intent intent = new Intent(application, Class.forName("com.whatsapp.Main"));
            intent.setFlags(268468224);
            application.startActivity(intent);
            System.exit(0);
        } catch (ClassNotFoundException e) {
            Log.e(e);
        }
    }
}
