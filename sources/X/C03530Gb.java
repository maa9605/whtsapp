package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.0Gb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03530Gb {
    public static volatile C03530Gb A04;
    public InterfaceC03570Gf A00;
    public Map A01;
    public final C013406l A02;
    public final C0DW A03;

    public C03530Gb(C013406l c013406l, C0DW c0dw) {
        this.A02 = c013406l;
        this.A03 = c0dw;
    }

    public C27801Ov A00(UserJid userJid) {
        C0DX paymentService = this.A00.getPaymentService(C002701i.A0s(C04630Le.A02(userJid)), null);
        if (paymentService != null) {
            Map map = this.A01;
            return paymentService.ADl(userJid, map != null ? (C0TN) map.get(userJid) : null);
        }
        return null;
    }
}
