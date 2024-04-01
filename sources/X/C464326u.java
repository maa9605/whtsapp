package X;

import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.26u  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C464326u implements C0EK {
    public static volatile C464326u A02;
    public final C44341yu A00;
    public final C0EJ A01;

    @Override // X.C0EK
    public int[] AAP() {
        return new int[]{212};
    }

    public C464326u(C44341yu c44341yu, C0EJ c0ej) {
        this.A00 = c44341yu;
        this.A01 = c0ej;
    }

    @Override // X.C0EK
    public boolean AEN(int i, Message message) {
        if (i != 212) {
            return false;
        }
        C04420Kc c04420Kc = (C04420Kc) message.obj;
        if (c04420Kc != null) {
            AbstractC05150Nn A01 = this.A01.A01(1, c04420Kc.A00);
            if (A01 != null) {
                A01.A00(3);
            }
            C44341yu c44341yu = this.A00;
            if (c44341yu != null) {
                DeviceJid of = DeviceJid.of(c04420Kc.A01);
                String str = c04420Kc.A07;
                if (of != null && !TextUtils.isEmpty(str)) {
                    c44341yu.A0G.AS1(new RunnableEBaseShape0S1300000_I0(c44341yu, of, str, c04420Kc, 2));
                }
                return true;
            }
            throw null;
        }
        throw null;
    }
}
