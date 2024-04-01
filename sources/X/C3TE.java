package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Comparator;

/* renamed from: X.3TE  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3TE implements Comparator {
    public final /* synthetic */ C40581sV A00;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C02590Ca c02590Ca = (C02590Ca) obj;
        C02590Ca c02590Ca2 = (C02590Ca) obj2;
        try {
            AbstractC000600i abstractC000600i = this.A00.A04;
            boolean isPrimary = ((DeviceJid) c02590Ca.A09(DeviceJid.class, "jid", abstractC000600i)).isPrimary();
            if (isPrimary != ((DeviceJid) c02590Ca2.A09(DeviceJid.class, "jid", abstractC000600i)).isPrimary()) {
                return isPrimary ? -1 : 1;
            }
            return 0;
        } catch (C0L4 unused) {
            return 0;
        }
    }
}
