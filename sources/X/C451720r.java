package X;

import android.os.Message;
import com.whatsapp.jobqueue.job.SendWebForwardJob;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.20r */
/* loaded from: classes2.dex */
public class C451720r {
    public static volatile C451720r A03;
    public final C0E6 A00;
    public final C41981up A01;
    public final C41991uq A02;

    public C451720r(C41981up c41981up, C41991uq c41991uq, C0E6 c0e6) {
        this.A01 = c41981up;
        this.A02 = c41991uq;
        this.A00 = c0e6;
    }

    public static C451720r A00() {
        if (A03 == null) {
            synchronized (C451720r.class) {
                if (A03 == null) {
                    A03 = new C451720r(C41981up.A00(), C41991uq.A00(), C0E6.A00());
                }
            }
        }
        return A03;
    }

    public void A01(String str, C20v c20v, int i) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c20v);
        A02(str, arrayList, i);
    }

    public void A02(String str, List list, int i) {
        A03(str, list, i, false, null);
    }

    public void A03(String str, List list, int i, boolean z, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("web", str2);
        A04(str, list, i, z, hashMap, null);
    }

    public void A04(String str, List list, int i, boolean z, Map map, Map map2) {
        String str2 = str;
        C41981up c41981up = this.A01;
        if (c41981up.A04() || z) {
            C43041wk c43041wk = new C43041wk(this, str2, list, i, z, (String) map.get("web"));
            ((AbstractC42841wP) c43041wk).A00 = c41981up.A01().A03;
            C41991uq c41991uq = this.A02;
            C0I2 c0i2 = new C0I2(c41991uq, c43041wk);
            if (str == null) {
                str2 = c41991uq.A03();
            }
            String str3 = (7 == i || 8 == i) ? "preempt-" : "";
            this.A00.A00.A01(new SendWebForwardJob(C000200d.A0H(str3, str2), c41981up.A01().A03, Message.obtain(null, 0, 45, 0, new C0KB(str2, list, i, map, c0i2, map2))));
        }
    }
}
