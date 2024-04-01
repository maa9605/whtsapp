package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Bu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C90634Bu extends C48P {
    public final C0DV A00;

    public C90634Bu(AnonymousClass012 anonymousClass012, Context context, C018508q c018508q, C02L c02l, InterfaceC002901k interfaceC002901k, C895947p c895947p, C0DV c0dv, C49682Lx c49682Lx, C0E7 c0e7, AnonymousClass499 anonymousClass499, C463026g c463026g, C28S c28s, AnonymousClass493 anonymousClass493, C899048w c899048w, String str, UserJid userJid, C466327p c466327p, C466327p c466327p2, String str2, String str3) {
        super(anonymousClass012, context, c018508q, c02l, interfaceC002901k, c895947p, c49682Lx, c0dv, c0e7, anonymousClass499, c463026g, c28s, anonymousClass493, c899048w, str, userJid, c466327p, c466327p2, str2, str3);
        this.A00 = c0dv;
    }

    public void A03(final C0N2 c0n2) {
        final C92224Ib c92224Ib = (C92224Ib) c0n2.A06;
        if (c92224Ib != null && "VISA".equals(c92224Ib.A03) && TextUtils.isEmpty(c92224Ib.A06)) {
            new C48L(super.A00, this.A01, this.A03, this.A0A, this.A09, new C48K() { // from class: X.3hv
                @Override // X.C48K
                public final void AOC(String str, C28Q c28q) {
                    C90634Bu.this.A04(c92224Ib, c0n2, str);
                }
            }).A00(this.A0L);
        }
    }

    public void A04(C92224Ib c92224Ib, C0N2 c0n2, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c92224Ib.A06 = str;
        this.A00.A01().A02(c0n2, null);
    }
}
