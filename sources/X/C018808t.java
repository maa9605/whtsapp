package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.08t */
/* loaded from: classes.dex */
public class C018808t {
    public static volatile C018808t A04;
    public Set A00;
    public final C05W A01;
    public final C002301c A02;
    public final C003701t A03;

    public C018808t(C003701t c003701t, C002301c c002301c, C05W c05w) {
        this.A03 = c003701t;
        this.A02 = c002301c;
        this.A01 = c05w;
    }

    public static C018808t A00() {
        if (A04 == null) {
            synchronized (C018808t.class) {
                if (A04 == null) {
                    A04 = new C018808t(C003701t.A00(), C002301c.A00(), C05W.A00());
                }
            }
        }
        return A04;
    }

    public boolean A01() {
        C003701t c003701t = this.A03;
        if (c003701t.A0C(233)) {
            String A05 = c003701t.A05(379);
            if (TextUtils.isEmpty(A05)) {
                return true;
            }
            String A042 = this.A02.A04();
            String[] split = A05.split(",");
            for (String str : split) {
                if (str.equals(A042)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public synchronized boolean A02(Jid jid) {
        if (jid instanceof AbstractC005302j) {
            AbstractC005302j abstractC005302j = (AbstractC005302j) jid;
            if (C003101m.A0U(abstractC005302j)) {
                return this.A01.A0A(abstractC005302j).A0S;
            } else if (C003101m.A0b(abstractC005302j)) {
                UserJid userJid = (UserJid) abstractC005302j;
                if (this.A00 == null) {
                    this.A00 = new HashSet();
                    String A05 = this.A03.A05(390);
                    if (!TextUtils.isEmpty(A05)) {
                        this.A00.addAll(Arrays.asList(A05.split(",")));
                    }
                }
                return this.A00.contains(userJid.user);
            } else {
                return false;
            }
        }
        return false;
    }
}
