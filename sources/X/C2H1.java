package X;

import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2H1  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2H1 {
    public final int A00;
    public final int A01;
    public final C0K0 A02;
    public final String A03;
    public final List A04;

    public C2H1(C0K0 c0k0, int i) {
        this.A04 = Collections.singletonList(c0k0);
        this.A02 = c0k0;
        this.A01 = 2;
        this.A00 = i;
        this.A03 = c0k0.A06.getRawString();
    }

    public C2H1(List list, int i, C41471ty c41471ty) {
        this.A04 = new ArrayList(list);
        C0K0 c0k0 = (C0K0) list.get(0);
        this.A02 = c0k0;
        this.A01 = c41471ty.A03.A05() - c0k0.A05 >= 600000 ? 1 : 0;
        this.A00 = i;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0K0) it.next()).A06.getRawString());
        }
        this.A03 = TextUtils.join("|", arrayList);
    }

    public LatLng A00() {
        List<C0K0> list = this.A04;
        double d = 0.0d;
        double d2 = 0.0d;
        for (C0K0 c0k0 : list) {
            d += c0k0.A00;
            d2 += c0k0.A01;
        }
        return new LatLng(d / list.size(), d2 / list.size());
    }
}
