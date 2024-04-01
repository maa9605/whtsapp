package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.05M */
/* loaded from: classes.dex */
public class C05M {
    public static volatile C05M A04;
    public boolean A00;
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();
    public volatile C0JT A02;
    public volatile boolean A03;

    public static C05M A00() {
        if (A04 == null) {
            synchronized (C05A.class) {
                if (A04 == null) {
                    A04 = new C05M();
                }
            }
        }
        return A04;
    }

    public int A01(AbstractC005302j abstractC005302j) {
        C0IT c0it = (C0IT) A0C().get(abstractC005302j);
        if (c0it == null) {
            return 0;
        }
        return c0it.A04;
    }

    public int A02(AbstractC005302j abstractC005302j) {
        C0IT c0it = (C0IT) A0C().get(abstractC005302j);
        if (c0it == null) {
            return 0;
        }
        return c0it.A08;
    }

    public int A03(UserJid userJid) {
        C0IT c0it = (C0IT) A0C().get(userJid);
        if (c0it == null) {
            return 0;
        }
        return c0it.A0N.expiration;
    }

    public long A04(AbstractC005302j abstractC005302j) {
        C0IT c0it = (C0IT) A0C().get(abstractC005302j);
        if (c0it == null) {
            return 1L;
        }
        return c0it.A0H;
    }

    public long A05(AbstractC005302j abstractC005302j) {
        C0IT c0it = (C0IT) A0C().get(abstractC005302j);
        if (c0it == null) {
            return 0L;
        }
        return c0it.A0L;
    }

    public long A06(AbstractC005302j abstractC005302j) {
        C0IT c0it = (C0IT) A0C().get(abstractC005302j);
        if (c0it == null) {
            return 0L;
        }
        return c0it.A0M;
    }

    public synchronized C0IT A07(AbstractC005302j abstractC005302j) {
        if (abstractC005302j == null) {
            return null;
        }
        return (C0IT) A0C().get(abstractC005302j);
    }

    public C0R3 A08(AbstractC005302j abstractC005302j) {
        C0R3 c0r3;
        C0IT c0it = (C0IT) A0C().get(abstractC005302j);
        if (c0it == null) {
            return new C0R3(0, 0, 0);
        }
        synchronized (c0it) {
            c0r3 = new C0R3(c0it.A04, c0it.A05, c0it.A06);
        }
        return c0r3;
    }

    public C0CM A09(UserJid userJid) {
        C0IT c0it = (C0IT) A0C().get(userJid);
        if (c0it == null) {
            return null;
        }
        return c0it.A0N;
    }

    public String A0A(AbstractC005302j abstractC005302j) {
        C0IT c0it = (C0IT) A0C().get(abstractC005302j);
        if (c0it == null) {
            return null;
        }
        return c0it.A0R;
    }

    public synchronized Set A0B() {
        return A0C().keySet();
    }

    public final ConcurrentHashMap A0C() {
        if (this.A02 == null && !this.A03) {
            return this.A01;
        }
        synchronized (this) {
            if (this.A02 != null) {
                C0JT c0jt = this.A02;
                this.A03 = true;
                this.A02 = null;
                try {
                    for (Map.Entry entry : ((HashMap) c0jt.A00()).entrySet()) {
                        this.A01.put(entry.getKey(), entry.getValue());
                    }
                    c0jt.A01(new ArrayList(this.A01.keySet()));
                    this.A00 = true;
                } catch (C06000Rd unused) {
                } catch (Throwable th) {
                    this.A03 = false;
                    throw th;
                }
                this.A03 = false;
            }
        }
        return this.A01;
    }

    public synchronized void A0D(AbstractC005302j abstractC005302j, C0IT c0it) {
        if (abstractC005302j != null) {
            A0C().put(abstractC005302j, c0it);
        }
    }

    public boolean A0E(AbstractC005302j abstractC005302j) {
        return A0C().containsKey(abstractC005302j) && !A0G(abstractC005302j);
    }

    public boolean A0F(AbstractC005302j abstractC005302j) {
        C0IT c0it = (C0IT) A0C().get(abstractC005302j);
        return c0it != null && c0it.A0S;
    }

    public boolean A0G(AbstractC005302j abstractC005302j) {
        C0IT c0it = (C0IT) A0C().get(abstractC005302j);
        if (c0it != null) {
            long j = c0it.A0G;
            if (j == 0 && c0it.A0C == 0) {
                return false;
            }
            long j2 = c0it.A0C;
            return j2 == c0it.A0D && j2 >= j;
        }
        return true;
    }
}
