package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1wo  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43071wo {
    public static volatile C43071wo A03;
    public final C01J A00;
    public final C0EC A01;
    public final C0EG A02;

    public C43071wo(C0EG c0eg, C01J c01j, C0EC c0ec) {
        this.A02 = c0eg;
        this.A00 = c01j;
        this.A01 = c0ec;
    }

    public static C43071wo A00() {
        if (A03 == null) {
            synchronized (C43071wo.class) {
                if (A03 == null) {
                    A03 = new C43071wo(C0EG.A00(), C01J.A00(), C0EC.A00());
                }
            }
        }
        return A03;
    }

    public Map A01(Iterable iterable) {
        HashMap hashMap = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            C0IP A0A = this.A00.A0A(C002701i.A0T(deviceJid));
            if (A0A != null) {
                hashMap.put(deviceJid, A0A);
            }
        }
        return hashMap;
    }

    public void A02(UserJid userJid) {
        Set A07 = this.A01.A07(userJid);
        Map A01 = A01(A07);
        ArrayList arrayList = new ArrayList(A07);
        arrayList.removeAll(((AbstractMap) A01).keySet());
        if (arrayList.isEmpty()) {
            return;
        }
        this.A02.A0R(arrayList);
    }
}
