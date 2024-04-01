package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob;
import com.whatsapp.jobqueue.job.SyncDevicesJob;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

/* renamed from: X.1uB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41581uB {
    public static volatile C41581uB A05;
    public final C0E6 A00;
    public final C05W A01;
    public final C41331tk A02;
    public final C0CA A03;
    public final C0EE A04;

    public C41581uB(C0E6 c0e6, C05W c05w, C0EE c0ee, C0CA c0ca, C41331tk c41331tk) {
        this.A00 = c0e6;
        this.A01 = c05w;
        this.A04 = c0ee;
        this.A03 = c0ca;
        this.A02 = c41331tk;
    }

    public static C41581uB A00() {
        if (A05 == null) {
            synchronized (C41581uB.class) {
                if (A05 == null) {
                    A05 = new C41581uB(C0E6.A00(), C05W.A00(), C0EE.A00(), C0CA.A00(), C41331tk.A00());
                }
            }
        }
        return A05;
    }

    public void A01(AnonymousClass094 anonymousClass094, UserJid[] userJidArr, long j) {
        boolean add;
        if (userJidArr.length == 0) {
            C000200d.A10("SyncDeviceAndResendMessageJob/empty recipients for ", anonymousClass094);
            return;
        }
        Set set = this.A02.A02;
        synchronized (set) {
            add = set.add(anonymousClass094);
        }
        if (!add) {
            return;
        }
        C0E6 c0e6 = this.A00;
        c0e6.A00.A01(new SyncDeviceAndResendMessageJob(anonymousClass094, userJidArr, j));
    }

    public void A02(UserJid[] userJidArr, int i) {
        String[] A0d = C003101m.A0d(Arrays.asList(userJidArr));
        if (A0d != null && A0d.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (UserJid userJid : userJidArr) {
                C41331tk c41331tk = this.A02;
                Set set = c41331tk.A03;
                synchronized (set) {
                    if (!set.contains(userJid)) {
                        c41331tk.A01.put(userJid, Long.valueOf(c41331tk.A00.A05()));
                        set.add(userJid);
                        arrayList.add(userJid);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.A00.A00.A01(new SyncDevicesJob((UserJid[]) arrayList.toArray(new UserJid[0]), i));
            return;
        }
        throw new IllegalArgumentException("invalid jid list");
    }
}
