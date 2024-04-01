package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.20m */
/* loaded from: classes2.dex */
public class C451220m {
    public static volatile C451220m A04;
    public final AbstractC000600i A00;
    public final C44501zB A01 = new C450620g(this);
    public final C41711uO A02;
    public final C41421tt A03;

    public C451220m(AbstractC000600i abstractC000600i, C41421tt c41421tt, C41711uO c41711uO) {
        this.A00 = abstractC000600i;
        this.A03 = c41421tt;
        this.A02 = c41711uO;
    }

    public static C451220m A00() {
        if (A04 == null) {
            synchronized (C451220m.class) {
                if (A04 == null) {
                    A04 = new C451220m(AbstractC000600i.A00(), C41421tt.A00(), C41711uO.A00());
                }
            }
        }
        return A04;
    }

    /* JADX WARN: Finally extract failed */
    public void A01() {
        AbstractCollection abstractCollection = (AbstractCollection) this.A02.A04();
        HashSet hashSet = new HashSet(abstractCollection.size());
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            hashSet.add(((C0JV) it.next()).A05);
        }
        C41421tt c41421tt = this.A03;
        if (c41421tt != null) {
            C000700j.A00();
            HashSet hashSet2 = new HashSet();
            C0CD A01 = c41421tt.A00.A01();
            try {
                Cursor A07 = A01.A02.A07("SELECT DISTINCT device_id FROM peer_messages", null);
                while (A07.moveToNext()) {
                    DeviceJid nullable = DeviceJid.getNullable(A07.getString(A07.getColumnIndex("device_id")));
                    if (nullable != null) {
                        hashSet2.add(nullable);
                    }
                }
                A07.close();
                A01.close();
                hashSet2.removeAll(hashSet);
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    c41421tt.A06((DeviceJid) it2.next());
                }
                if (hashSet2.isEmpty()) {
                    return;
                }
                this.A00.A09("orphan-peer-messages", String.valueOf(hashSet2.size()), false);
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        A01.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
        }
        throw null;
    }
}
