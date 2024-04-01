package X;

import android.os.Parcel;
import org.json.JSONObject;

/* renamed from: X.06n */
/* loaded from: classes.dex */
public class C013606n {
    public static InterfaceC013706o[] A01 = {C013806p.A06, C013806p.A05, C013806p.A04};
    public static volatile C013606n A02;
    public final C014306u A00;

    public C013606n(C014306u c014306u) {
        this.A00 = c014306u;
    }

    public static InterfaceC013706o A00(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt != 0) {
            if (readInt != 1) {
                return C013806p.A06;
            }
            return new C1NK(parcel);
        }
        return new C013806p(parcel);
    }

    public static InterfaceC013706o A01(String str) {
        InterfaceC013706o[] interfaceC013706oArr;
        if (str != null) {
            for (InterfaceC013706o interfaceC013706o : A01) {
                if (str.equals(interfaceC013706o.A9K())) {
                    return interfaceC013706o;
                }
            }
        }
        return C013806p.A06;
    }

    public static InterfaceC013706o A02(JSONObject jSONObject, int i) {
        if (jSONObject != null) {
            if (i != 1) {
                return new C013806p(jSONObject);
            }
            return new C1NK(jSONObject);
        }
        return C013806p.A06;
    }

    public static C013606n A03() {
        if (A02 == null) {
            synchronized (C013606n.class) {
                if (A02 == null) {
                    if (C014306u.A01 == null) {
                        synchronized (C014306u.class) {
                            if (C014306u.A01 == null) {
                                C014306u.A01 = new C014306u(C001200o.A01);
                            }
                        }
                    }
                    A02 = new C013606n(C014306u.A01);
                }
            }
        }
        return A02;
    }
}
