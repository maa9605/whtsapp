package X;

import android.app.Activity;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.regex.Pattern;

/* renamed from: X.4AU  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4AU {
    public static volatile C4AU A04;
    public final C2OT A00;
    public final AnonymousClass483 A01;
    public static final Pattern A03 = Pattern.compile("[a-zA-Z\\d.-]+@[a-zA-Z\\d.-]+");
    public static final Pattern A02 = Pattern.compile("(?:\\b|$|^|_)(?:(?:[a-zA-Z\\d.-]+)@(?i:icici|hdfcbank|sbi|axisbank|axis|okhdfcbank|okicici|okaxis|oksbi|wasbi|waicici|apl|abfspay|fbl|axisb|indusind|yesbank|hdfcbankjd|kmbl|myicici|ikwik|ybl|ibl|rmhdfcbank|pingpay|barodapay|idfcbank|waaxis|wahdfcbank|airtel|airtelpaymentsbank|apb|allbank|albk|allahabadbank|andb|axisgo|lime|barodampay|boi|mahb|cnrb|csbpay|csbcash|centralbank|cbin|cboi|cub|dbs|dcb|dcbbank|denabank|purz|federal|finobank|payzapp|rajgovhdfcbank|hsbc|imobile|pockets|ezeepay|eazypay|idbi|idbibank|idfc|idfcnetc|cmsidfc|indianbank|indbank|indianbk|iob|indus|jkb|jsbp|jio|kbl|karb|kbl052|kvb|karurvysyabank|kvbank|kotak|kaypay|kmb|obc|paytm|psb|pnb|sib|srcb|sc|scmobile|scb|scbl|syndicate|syndbank|synd|lvb|lvbank|rbl|tjsb|uco|unionbankofindia|unionbank|uboi|ubi|united|upi|utbi|vjb|vijb|vijayabank|yesbankltd|bandhan|dlb|aubank|corp|dnsbank))(?![.])(?:\\b|$|^|_)");

    public C4AU(C2OT c2ot, AnonymousClass483 anonymousClass483) {
        this.A00 = c2ot;
        this.A01 = anonymousClass483;
    }

    public static void A00(C91524Fg c91524Fg, boolean z, boolean z2) {
        C91534Fh c91534Fh = c91524Fg.A00;
        if (z2) {
            C49E A022 = c91534Fh.A02();
            A022.A0C = z;
            c91534Fh.A00.A0B(A022);
            C91534Fh.A00(c91534Fh);
            return;
        }
        c91534Fh.A01.A0B(Boolean.FALSE);
        c91534Fh.A02.A0B(new C4AZ(2));
    }

    public static boolean A01(String str) {
        return !TextUtils.isEmpty(str) && str.length() <= 255 && !str.equalsIgnoreCase("facebook2@icici") && A03.matcher(str).matches();
    }

    public /* synthetic */ void A02(final C91524Fg c91524Fg, Activity activity, String str, boolean z, final boolean z2, final String str2, final String str3, UserJid userJid, boolean z3, C28Q c28q) {
        if (z && c28q == null) {
            if (z3) {
                this.A00.A01(activity, userJid, str, true, false, new InterfaceC40271rs() { // from class: X.3k6
                    @Override // X.InterfaceC40271rs
                    public final void AOE(boolean z4) {
                        C4AU.A00(C91524Fg.this, z2, z4);
                    }
                });
                return;
            }
            C91534Fh c91534Fh = c91524Fg.A00;
            C49E A022 = c91534Fh.A02();
            A022.A0C = z2;
            A022.A03 = str2;
            if ("PAY_INTENT".equals(c91534Fh.A03) && !TextUtils.isEmpty(A022.A04)) {
                C014006r A00 = C014006r.A00(A022.A04, C013806p.A05.A9i());
                BigDecimal bigDecimal = new BigDecimal(c91534Fh.A05.A07(C01C.A3k));
                if (!z2 && A00.A00.compareTo(bigDecimal) > 0) {
                    C4AZ c4az = new C4AZ(7);
                    c4az.A02 = C013806p.A05.A83(c91534Fh.A06, bigDecimal);
                    c91534Fh.A02.A0B(c4az);
                    return;
                }
            }
            c91534Fh.A00.A0B(A022);
            C91534Fh.A00(c91534Fh);
            return;
        }
        C91534Fh c91534Fh2 = c91524Fg.A00;
        c91534Fh2.A01.A0B(Boolean.FALSE);
        C4AZ c4az2 = new C4AZ(1);
        c4az2.A01 = c28q;
        c91534Fh2.A02.A0B(c4az2);
    }
}
