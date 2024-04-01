package X;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2MR */
/* loaded from: classes2.dex */
public class C2MR {
    public static volatile C2MR A09;
    public final C018508q A00;
    public final C018608r A01;
    public final C40261rr A02;
    public final C05W A03;
    public final C0E7 A04;
    public final C03340Fh A05;
    public final C0ES A06;
    public final C0EG A07;
    public final C41991uq A08;

    public C2MR(C018508q c018508q, C41991uq c41991uq, C0EG c0eg, C018608r c018608r, C05W c05w, C40261rr c40261rr, C0ES c0es, C0E7 c0e7, C03340Fh c03340Fh) {
        this.A00 = c018508q;
        this.A08 = c41991uq;
        this.A07 = c0eg;
        this.A01 = c018608r;
        this.A03 = c05w;
        this.A02 = c40261rr;
        this.A06 = c0es;
        this.A04 = c0e7;
        this.A05 = c03340Fh;
    }

    public void A00(Activity activity, final C655537q c655537q, final C06C c06c, String str, String str2) {
        Boolean bool;
        InterfaceC53372gA interfaceC53372gA;
        if (!c06c.A0C()) {
            Jid A03 = c06c.A03(UserJid.class);
            if (A03 != null) {
                UserJid userJid = (UserJid) A03;
                C40261rr c40261rr = this.A02;
                if (str != null) {
                    bool = c40261rr.A01(userJid);
                } else {
                    bool = null;
                }
                c40261rr.A08(activity, null, null, false, new C461024y(true, userJid, str, bool, str2));
                this.A01.A0N(userJid, true, true);
                if (c655537q == null || (interfaceC53372gA = c655537q.A00) == null) {
                    return;
                }
                interfaceC53372gA.AQE(c655537q.A01);
                return;
            }
            throw null;
        }
        C0EG c0eg = this.A07;
        C41991uq c41991uq = this.A08;
        C0ES c0es = this.A06;
        C03340Fh c03340Fh = this.A05;
        Jid A032 = c06c.A03(C011005l.class);
        if (A032 != null) {
            c0eg.A08(new C0TD(c41991uq, c0es, c03340Fh, (C011005l) A032) { // from class: X.3JP
                {
                    C2MR.this = this;
                }

                @Override // X.C0TD
                public void A01() {
                    InterfaceC53372gA interfaceC53372gA2;
                    C018608r c018608r = C2MR.this.A01;
                    Jid A033 = c06c.A03(AbstractC005302j.class);
                    if (A033 != null) {
                        c018608r.A0N((AbstractC005302j) A033, true, true);
                        C655537q c655537q2 = c655537q;
                        if (c655537q2 == null || (interfaceC53372gA2 = c655537q2.A00) == null) {
                            return;
                        }
                        interfaceC53372gA2.AKv(c655537q2.A01);
                        return;
                    }
                    throw null;
                }
            });
            return;
        }
        throw null;
    }

    public void A01(C06C c06c, String str) {
        C018608r c018608r = this.A01;
        Jid A03 = c06c.A03(AbstractC005302j.class);
        if (A03 != null) {
            c018608r.A0L((AbstractC005302j) A03, str, null, !c06c.A0C());
            c06c.A0U = true;
            C05W c05w = this.A03;
            if (c05w != null) {
                c06c.A0U = true;
                AnonymousClass060 anonymousClass060 = c05w.A05;
                if (anonymousClass060 != null) {
                    C0HC A06 = AnonymousClass061.A06();
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("is_spam_reported", Boolean.valueOf(c06c.A0U));
                    anonymousClass060.A0I(contentValues, c06c.A02());
                    StringBuilder sb = new StringBuilder("updated is reported spam for jid=");
                    sb.append(c06c.A02());
                    sb.append(' ');
                    sb.append(contentValues);
                    sb.append(" | time: ");
                    sb.append(A06.A00());
                    Log.i(sb.toString());
                    c05w.A03.A00(c06c);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public boolean A02(Context context) {
        if (this.A04.A05()) {
            return true;
        }
        Log.w("spamreportmanager/spam/report/no-network-cannot-block-report");
        boolean A02 = C0E7.A02(context);
        int i = R.string.no_network_cannot_block;
        if (A02) {
            i = R.string.no_network_cannot_block_airplane;
        }
        this.A00.A07(i, 0);
        return false;
    }
}
