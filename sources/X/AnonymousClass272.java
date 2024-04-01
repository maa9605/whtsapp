package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.272 */
/* loaded from: classes2.dex */
public class AnonymousClass272 {
    public static volatile AnonymousClass272 A03;
    public final Map A00 = new C04W(5);
    public final Map A01 = new C04W(100);
    public final Map A02 = new HashMap();

    public static AnonymousClass272 A00() {
        if (A03 == null) {
            synchronized (AnonymousClass272.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass272();
                }
            }
        }
        return A03;
    }

    public final C29y A01(UserJid userJid) {
        Map map = this.A00;
        C29y c29y = (C29y) map.get(userJid);
        if (c29y == null) {
            C29y c29y2 = new C29y();
            map.put(userJid, c29y2);
            return c29y2;
        }
        return c29y;
    }

    public C29z A02(UserJid userJid, String str) {
        synchronized (this) {
            C29y c29y = (C29y) this.A00.get(userJid);
            if (c29y == null) {
                return null;
            }
            Iterator it = c29y.A02.iterator();
            while (it.hasNext()) {
                C29z c29z = ((C2A0) it.next()).A00;
                if (str.equals(c29z.A03)) {
                    return c29z;
                }
            }
            return null;
        }
    }

    public C2A1 A03(UserJid userJid) {
        synchronized (this) {
            C29y c29y = (C29y) this.A00.get(userJid);
            if (c29y != null) {
                return c29y.A00;
            }
            return null;
        }
    }

    public C2A1 A04(UserJid userJid) {
        synchronized (this) {
            C29y c29y = (C29y) this.A00.get(userJid);
            if (c29y != null) {
                return c29y.A01;
            }
            return null;
        }
    }

    public C2A1 A05(UserJid userJid, String str) {
        synchronized (this) {
            C29y c29y = (C29y) this.A00.get(userJid);
            if (c29y == null) {
                return null;
            }
            Iterator it = c29y.A02.iterator();
            while (it.hasNext()) {
                C2A0 c2a0 = (C2A0) it.next();
                if (str.equals(c2a0.A00.A03)) {
                    return c2a0.A01;
                }
            }
            return null;
        }
    }

    public C468628o A06(String str) {
        synchronized (this) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Map map = this.A01;
            C468628o c468628o = (C468628o) map.get(str);
            if (c468628o != null) {
                return c468628o;
            }
            UserJid userJid = (UserJid) this.A02.get(str);
            if (userJid == null) {
                return null;
            }
            C29y c29y = (C29y) this.A00.get(userJid);
            if (c29y == null) {
                return null;
            }
            Iterator it = c29y.A03.iterator();
            while (it.hasNext()) {
                C468628o c468628o2 = (C468628o) it.next();
                if (c468628o2.A09.equals(str)) {
                    map.put(str, c468628o2);
                    return c468628o2;
                }
            }
            Iterator it2 = c29y.A02.iterator();
            while (it2.hasNext()) {
                for (C468628o c468628o3 : ((C2A0) it2.next()).A00.A04) {
                    if (c468628o3.A09.equals(str)) {
                        map.put(str, c468628o3);
                        return c468628o3;
                    }
                }
            }
            return null;
        }
    }

    public C2A2 A07(UserJid userJid) {
        synchronized (this) {
            List<C468628o> A08 = A08(userJid);
            if (A08 == null) {
                return null;
            }
            for (C468628o c468628o : A08) {
                C468728p c468728p = c468628o.A04;
                if (c468728p != null && c468728p.A00 == 0 && !c468628o.A01) {
                    List list = c468628o.A0D;
                    if (!list.isEmpty()) {
                        return (C2A2) list.get(0);
                    }
                }
            }
            return null;
        }
    }

    public List A08(UserJid userJid) {
        synchronized (this) {
            C29y c29y = (C29y) this.A00.get(userJid);
            if (c29y == null) {
                return null;
            }
            return Collections.unmodifiableList(c29y.A03);
        }
    }

    public void A09(C468628o c468628o, UserJid userJid) {
        synchronized (this) {
            Map map = this.A01;
            String str = c468628o.A09;
            map.put(str, c468628o);
            if (userJid != null || (userJid = (UserJid) this.A02.get(str)) != null) {
                C29y A01 = A01(userJid);
                Iterator it = A01.A02.iterator();
                while (true) {
                    int i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    List list = ((C2A0) it.next()).A00.A04;
                    while (true) {
                        if (i >= list.size()) {
                            break;
                        } else if (str.equals(((C468628o) list.get(i)).A09)) {
                            list.set(i, c468628o);
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = A01.A03;
                    if (i2 < arrayList.size()) {
                        if (str.equals(((C468628o) arrayList.get(i2)).A09)) {
                            arrayList.set(i2, c468628o);
                            break;
                        }
                        i2++;
                    } else {
                        arrayList.add(0, c468628o);
                        this.A02.put(str, userJid);
                        break;
                    }
                }
            }
        }
    }

    public boolean A0A(UserJid userJid) {
        synchronized (this) {
            C29y c29y = (C29y) this.A00.get(userJid);
            if (c29y == null) {
                return false;
            }
            return c29y.A02.isEmpty() ? false : true;
        }
    }

    public boolean A0B(UserJid userJid) {
        synchronized (this) {
            C29y c29y = (C29y) this.A00.get(userJid);
            if (c29y == null) {
                return false;
            }
            return c29y.A03.isEmpty() ? false : true;
        }
    }
}
