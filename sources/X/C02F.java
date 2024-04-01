package X;

import android.os.Build;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.02F */
/* loaded from: classes.dex */
public class C02F {
    public static volatile C02F A02;
    public final C001200o A00;
    public final C000500h A01;

    public C02F(C001200o c001200o, C000500h c000500h) {
        this.A00 = c001200o;
        this.A01 = c000500h;
    }

    public static C02F A00() {
        if (A02 == null) {
            synchronized (C02F.class) {
                if (A02 == null) {
                    A02 = new C02F(C001200o.A01, C000500h.A00());
                }
            }
        }
        return A02;
    }

    public static List A01() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.READ_PHONE_STATE");
        if (Build.VERSION.SDK_INT >= 30) {
            arrayList.add("android.permission.READ_PHONE_NUMBERS");
        }
        return arrayList;
    }

    public int A02(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return 0;
        }
        int A01 = C02160Ac.A01(this.A00.A00, str);
        if (A01 == 0) {
            C000200d.A0f(this.A01, str);
        }
        return A01;
    }

    public boolean A03() {
        return A02("android.permission.READ_CONTACTS") == 0 && A02("android.permission.WRITE_CONTACTS") == 0;
    }

    public boolean A04() {
        return A02("android.permission.ACCESS_COARSE_LOCATION") == 0 || A02("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public boolean A05() {
        return Build.VERSION.SDK_INT >= 28 ? A02("android.permission.ANSWER_PHONE_CALLS") == 0 && A02("android.permission.READ_CALL_LOG") == 0 && A08() : A02("android.permission.CALL_PHONE") == 0 && A08();
    }

    public boolean A06() {
        return A02("android.permission.WRITE_EXTERNAL_STORAGE") == 0 && A02("android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    public boolean A07() {
        return this.A00.A00.checkCallingOrSelfPermission("android.permission.CAMERA") == 0;
    }

    public boolean A08() {
        Iterator it = ((AbstractCollection) A01()).iterator();
        boolean z = true;
        while (it.hasNext()) {
            boolean z2 = false;
            if (A02((String) it.next()) == 0) {
                z2 = true;
            }
            z &= z2;
        }
        return z;
    }

    public boolean A09() {
        return this.A00.A00.checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") == 0;
    }

    public boolean A0A(String str) {
        return "mounted".equals(str) && A02("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public boolean A0B(boolean z) {
        return (((Build.VERSION.SDK_INT < 23 && !A09()) || (Build.VERSION.SDK_INT >= 23 && A02("android.permission.RECORD_AUDIO") != 0)) || (z && ((Build.VERSION.SDK_INT < 23 && !A07()) || (Build.VERSION.SDK_INT >= 23 && A02("android.permission.CAMERA") != 0)))) ? false : true;
    }
}
