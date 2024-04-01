package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.20u */
/* loaded from: classes2.dex */
public class C451920u extends C20v {
    public C451920u(AbstractC000600i abstractC000600i, C01B c01b) {
        super(abstractC000600i, c01b, null, false);
    }

    public C451920u(AbstractC000600i abstractC000600i, C01B c01b, boolean z) {
        super(abstractC000600i, c01b, null, z);
    }

    public static Jid A01(Class cls, Jid jid, String str, AbstractC000600i abstractC000600i) {
        if (jid == null || cls.isInstance(jid)) {
            return jid;
        }
        StringBuilder A0P = C000200d.A0P("web-query/failed to cast ");
        A0P.append(jid.getClass().getName());
        A0P.append(" to ");
        A0P.append(cls.getName());
        A0P.append("(");
        A0P.append(jid);
        A0P.append(")@");
        A0P.append(str);
        String obj = A0P.toString();
        Log.e(obj);
        StringBuilder sb = new StringBuilder("web-query/downcast-failure/");
        sb.append(str);
        abstractC000600i.A09(sb.toString(), obj, false);
        return null;
    }

    public static void A02(C0KA c0ka, C452521b c452521b, AbstractC011105n abstractC011105n, UserJid userJid, List list) {
        if (abstractC011105n != null) {
            c452521b.A06(abstractC011105n.getRawString());
        } else {
            c452521b.A02();
            C452421a c452421a = (C452421a) c452521b.A00;
            c452421a.A00 &= -2;
            c452421a.A03 = C452421a.A05.A03;
        }
        if (userJid != null) {
            String rawString = userJid.getRawString();
            c0ka.A02();
            C452821e c452821e = (C452821e) c0ka.A00;
            if (rawString != null) {
                c452821e.A01 |= 16;
                c452821e.A0J = rawString;
            } else {
                throw null;
            }
        } else {
            c0ka.A02();
            C452821e c452821e2 = (C452821e) c0ka.A00;
            c452821e2.A01 &= -17;
            c452821e2.A0J = C452821e.A0V.A0J;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str != null) {
                    c0ka.A02();
                    C452821e.A0D((C452821e) c0ka.A00, str);
                }
            }
        }
    }
}
