package X;

import android.os.Message;
import android.util.Pair;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.2AO  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2AO {
    public static volatile C2AO A03;
    public final C02L A00;
    public final C018608r A01;
    public final C41541u6 A02;

    public C2AO(C02L c02l, C41541u6 c41541u6, C018608r c018608r) {
        this.A00 = c02l;
        this.A02 = c41541u6;
        this.A01 = c018608r;
    }

    public static C2AO A00() {
        if (A03 == null) {
            synchronized (C2AO.class) {
                if (A03 == null) {
                    A03 = new C2AO(C02L.A00(), C41541u6.A00(), C018608r.A02());
                }
            }
        }
        return A03;
    }

    public void A01(String str, C04500Kk c04500Kk) {
        Set emptySet;
        if (c04500Kk == null) {
            C41541u6 c41541u6 = this.A02;
            C44321ys c44321ys = c41541u6.A0H;
            C44861zm c44861zm = (C44861zm) c44321ys.A02("setting_pushName");
            if (c44861zm == null) {
                emptySet = Collections.emptySet();
            } else if (c41541u6.A0W()) {
                emptySet = c44321ys.A04(Collections.singletonList(new C44891zp(null, str, c44861zm.A01.A05(), null)));
            } else {
                emptySet = Collections.emptySet();
            }
        } else {
            emptySet = Collections.emptySet();
        }
        this.A00.A07(str);
        this.A02.A0V(emptySet);
        C018608r c018608r = this.A01;
        if (c018608r.A09.A06) {
            c018608r.A0v.A09(Message.obtain(null, 0, 3, 0, Pair.create(str, c04500Kk)));
        }
    }
}
