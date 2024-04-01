package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.4Bz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C90674Bz extends AnonymousClass481 {
    public final Context A00;
    public final C0E7 A01;
    public final C013606n A02;
    public final C47Y A03;
    public final C77673ia A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C90674Bz(Context context, C018508q c018508q, C013406l c013406l, C0DV c0dv, C0E7 c0e7, C463026g c463026g, C013606n c013606n, C47Y c47y, C28S c28s, C899048w c899048w, String str, String str2, String str3, C77673ia c77673ia) {
        super(context, c018508q, c013406l, c0dv, c0e7, c463026g, c28s, c899048w);
        this.A00 = context;
        this.A01 = c0e7;
        this.A02 = c013606n;
        this.A03 = c47y;
        this.A05 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A04 = c77673ia;
    }

    public final void A02(String str) {
        ArrayList A0Y = C000200d.A0Y("PAY: BrazilVerifyCardSendAuthCodeAction sendAuthCode");
        A0Y.add(new C04P("action", "br-verify-send-auth-code", null, (byte) 0));
        A0Y.add(new C04P("credential-id", this.A06, null, (byte) 0));
        A0Y.add(new C04P("nonce", this.A07, null, (byte) 0));
        A0Y.add(new C04P("auth-code", str, null, (byte) 0));
        super.A05.A0F("set", new C02590Ca("account", (C04P[]) A0Y.toArray(new C04P[0]), null, null), new C91744Gc(this, this.A00, super.A01, this.A01, super.A04), 0L);
    }
}
