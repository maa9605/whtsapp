package X;

import com.whatsapp.util.Log;

/* renamed from: X.0Mq */
/* loaded from: classes.dex */
public class C04960Mq {
    public static volatile C04960Mq A04;
    public final C018508q A00;
    public final C000500h A01;
    public final C05Y A02;
    public final C22I A03;

    public C04960Mq(C018508q c018508q, C05Y c05y, C22I c22i, C000500h c000500h) {
        this.A00 = c018508q;
        this.A02 = c05y;
        this.A03 = c22i;
        this.A01 = c000500h;
    }

    public static C04960Mq A00() {
        if (A04 == null) {
            synchronized (C04960Mq.class) {
                if (A04 == null) {
                    A04 = new C04960Mq(C018508q.A00(), C05Y.A01(), C22I.A00(), C000500h.A00());
                }
            }
        }
        return A04;
    }

    public void A01(InterfaceC04440Ke interfaceC04440Ke) {
        AnonymousClass283 anonymousClass283 = new AnonymousClass283(this.A02, new C0NB(this, interfaceC04440Ke));
        Log.i("PrivacySettingsProtocolHelper/sendGetPrivacySettingsRequest");
        C05Y c05y = anonymousClass283.A01;
        String A02 = c05y.A02();
        c05y.A0B(70, A02, new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("id", A02, null, (byte) 0), new C04P("xmlns", "privacy", null, (byte) 0), new C04P("type", "get", null, (byte) 0)}, new C02590Ca("privacy", null, null, null)), anonymousClass283, 0L);
    }

    public void A02(String str, String str2) {
        AnonymousClass283 anonymousClass283 = new AnonymousClass283(this.A02, new C0NB(this, null));
        Log.i("PrivacySettingsProtocolHelper/sendSetPrivacySettingsRequest");
        C05Y c05y = anonymousClass283.A01;
        String A02 = c05y.A02();
        c05y.A0B(69, A02, new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("type", "set", null, (byte) 0), new C04P("id", A02, null, (byte) 0), new C04P("xmlns", "privacy", null, (byte) 0)}, new C02590Ca("privacy", null, new C02590Ca[]{new C02590Ca("category", new C04P[]{new C04P("name", str, null, (byte) 0), new C04P("value", str2, null, (byte) 0)}, null, null)}, null)), anonymousClass283, 0L);
    }
}
