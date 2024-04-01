package java.lang;

import X.C07E;
import X.C0CD;
import X.C0F4;
import X.C0F8;
import X.C0JV;
import X.C2BR;
import X.C2L8;
import X.C41711uO;
import X.C47212Ai;
import X.C49172Iw;
import android.content.ContentValues;
import com.whatsapp.jid.DeviceJid;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S0200100_I0 extends RunnableEmptyBase implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public RunnableEBaseShape0S0200100_I0(Object obj, Object obj2, long j, int i) {
        this.A03 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = j;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        C0JV c0jv;
        switch (this.A03) {
            case 0:
                ((C49172Iw) this.A01).A00.A00((C2L8) this.A02, this.A00, true);
                return;
            case 1:
                C41711uO c41711uO = (C41711uO) this.A01;
                long j = this.A00;
                C0JV A03 = c41711uO.A03((DeviceJid) this.A02);
                if (A03 != null) {
                    A03.A00 = j;
                    C0F4 c0f4 = c41711uO.A0F;
                    DeviceJid deviceJid = A03.A05;
                    C0F8 c0f8 = c0f4.A04;
                    if (c0f8 != null) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("last_active", Long.valueOf(j));
                        C0CD A00 = c0f8.A02.A00();
                        try {
                            A00.A02.A00("devices", contentValues, "device_id = ?", new String[]{deviceJid.getRawString()});
                            synchronized (c0f8) {
                                C07E c07e = c0f8.A00;
                                if (c07e != null && (c0jv = (C0JV) c07e.A00.get(deviceJid)) != null) {
                                    c0jv.A00 = j;
                                }
                            }
                            A00.close();
                            c41711uO.A0A(A03);
                            return;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                try {
                                    A00.close();
                                } catch (Throwable unused) {
                                }
                                throw th2;
                            }
                        }
                    }
                    throw null;
                }
                return;
            case 2:
                C47212Ai c47212Ai = (C47212Ai) this.A01;
                C2BR c2br = (C2BR) this.A02;
                long j2 = this.A00;
                if (c47212Ai.A03(c2br)) {
                    c47212Ai.A09.A01(c2br, j2);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
