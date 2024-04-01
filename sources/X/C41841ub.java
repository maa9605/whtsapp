package X;

import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1ub */
/* loaded from: classes2.dex */
public class C41841ub implements C0EK {
    public static volatile C41841ub A0A;
    public final AbstractC000600i A00;
    public final C02L A01;
    public final C05W A02;
    public final C41581uB A03;
    public final C000500h A04;
    public final C41401tr A05;
    public final C0EC A06;
    public final C0EG A07;
    public final C0EJ A08;
    public final ExecutorC004702d A09;

    @Override // X.C0EK
    public int[] AAP() {
        return new int[]{204};
    }

    public C41841ub(AbstractC000600i abstractC000600i, C02L c02l, InterfaceC002901k interfaceC002901k, C0EG c0eg, C05W c05w, C41581uB c41581uB, C0EC c0ec, C0EJ c0ej, C000500h c000500h, C41401tr c41401tr) {
        this.A00 = abstractC000600i;
        this.A01 = c02l;
        this.A07 = c0eg;
        this.A02 = c05w;
        this.A03 = c41581uB;
        this.A06 = c0ec;
        this.A08 = c0ej;
        this.A04 = c000500h;
        this.A05 = c41401tr;
        this.A09 = new ExecutorC004702d(interfaceC002901k, false);
    }

    public static C41841ub A00() {
        if (A0A == null) {
            synchronized (C41841ub.class) {
                if (A0A == null) {
                    A0A = new C41841ub(AbstractC000600i.A00(), C02L.A00(), C002801j.A00(), C0EG.A00(), C05W.A00(), C41581uB.A00(), C0EC.A00(), C0EJ.A00(), C000500h.A00(), C41401tr.A01());
                }
            }
        }
        return A0A;
    }

    @Override // X.C0EK
    public boolean AEN(int i, Message message) {
        String A0G;
        C02590Ca A0D;
        C2AH c2ah;
        long A06;
        if (i != 204) {
            return false;
        }
        C04420Kc c04420Kc = (C04420Kc) message.getData().getParcelable("stanzaKey");
        C000700j.A04(c04420Kc, "stanzaKey is null");
        C05140Nm A04 = this.A08.A04(c04420Kc.A00);
        if (A04 != null) {
            A04.A00(3);
        }
        C0EC c0ec = this.A06;
        if (!c0ec.A05.A04()) {
            this.A07.A0L(c04420Kc);
            return true;
        }
        C02590Ca c02590Ca = (C02590Ca) message.obj;
        C02590Ca A0C = c02590Ca.A0C(0);
        if (A04 != null && A0C != null) {
            A04.A00 = A0C.A00;
        }
        if (c02590Ca.A0D("update") != null) {
            c2ah = new C2AH(c02590Ca.A0E("update").A0G("hash"), c04420Kc);
            C04P A0A2 = c02590Ca.A0A("offline");
            if (A0A2 != null && A0A2.A03 != null) {
                String str = c2ah.A06;
                synchronized (this) {
                    if (!TextUtils.isEmpty(str)) {
                        C000500h c000500h = this.A04;
                        Set<String> stringSet = c000500h.A00.getStringSet("pending_side_list_hash", new HashSet());
                        if (stringSet != null) {
                            if (stringSet.add(str)) {
                                c000500h.A0D().putStringSet("pending_side_list_hash", stringSet).apply();
                            }
                        } else {
                            throw null;
                        }
                    }
                }
                this.A07.A0L(c04420Kc);
                return true;
            }
        } else {
            byte[] bArr = null;
            C02590Ca A0D2 = c02590Ca.A0D("add");
            C02590Ca A0D3 = c02590Ca.A0D("remove");
            if (A0D2 != null) {
                A0G = A0D2.A0G("device_hash");
                A0D = A0D2.A0D("key-index-list");
            } else if (A0D3 != null) {
                A0G = A0D3.A0G("device_hash");
                A0D = A0D3.A0D("key-index-list");
            } else {
                Log.e("DeviceUpdateNotificationHandler/handleXmppMessage/unknown type of device notification.");
                throw new C0L4("unknown device notification not found");
            }
            AbstractC000600i abstractC000600i = this.A00;
            UserJid userJid = (UserJid) c02590Ca.A09(UserJid.class, "from", abstractC000600i);
            C07E A0D4 = C40731sm.A0D(abstractC000600i, A0D2);
            C07E A0D5 = C40731sm.A0D(abstractC000600i, A0D3);
            if (A0D == null) {
                A06 = 0;
            } else {
                bArr = A0D.A01;
                A06 = A0D.A06("ts");
            }
            c2ah = new C2AH(userJid, A0G, c04420Kc, A0D4, A0D5, bArr, A06);
        }
        this.A09.execute(new C2AI(this.A00, this.A01, this.A07, this.A02, this.A03, c0ec, this.A05, Collections.singletonList(c2ah)));
        return true;
    }
}
