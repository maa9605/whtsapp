package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.22I  reason: invalid class name */
/* loaded from: classes2.dex */
public class C22I {
    public static volatile C22I A06;
    public final C03320Ff A01;
    public final C0EG A02;
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final HashMap A03 = new HashMap();
    public final HashMap A04 = new HashMap();
    public final Set A05 = new HashSet();

    public C22I(C0EG c0eg, C03320Ff c03320Ff) {
        this.A02 = c0eg;
        this.A01 = c03320Ff;
    }

    public static C22I A00() {
        if (A06 == null) {
            synchronized (C22I.class) {
                if (A06 == null) {
                    A06 = new C22I(C0EG.A00(), C03320Ff.A00);
                }
            }
        }
        return A06;
    }

    public static boolean A01(long j) {
        return j != 0 && j + 25000 > SystemClock.elapsedRealtime();
    }

    public int A02(AbstractC005302j abstractC005302j, UserJid userJid) {
        AnonymousClass285 anonymousClass285;
        AnonymousClass284 anonymousClass284 = (AnonymousClass284) this.A04.get(abstractC005302j);
        if (anonymousClass284 == null) {
            return -1;
        }
        if (userJid != null && C003101m.A0U(abstractC005302j)) {
            HashMap hashMap = anonymousClass284.A03;
            if (hashMap == null || (anonymousClass285 = (AnonymousClass285) hashMap.get(userJid)) == null || !A01(anonymousClass285.A01)) {
                return -1;
            }
            return anonymousClass285.A00;
        } else if (A01(anonymousClass284.A01)) {
            return anonymousClass284.A00;
        } else {
            return -1;
        }
    }

    public long A03(AbstractC005302j abstractC005302j) {
        AnonymousClass284 anonymousClass284 = (AnonymousClass284) this.A04.get(abstractC005302j);
        if (anonymousClass284 == null) {
            return 0L;
        }
        return anonymousClass284.A02;
    }

    public GroupJid A04(AbstractC005302j abstractC005302j, long j) {
        HashMap hashMap;
        AnonymousClass285 anonymousClass285;
        HashMap hashMap2 = this.A04;
        AnonymousClass284 anonymousClass284 = (AnonymousClass284) hashMap2.get(abstractC005302j);
        if (anonymousClass284 == null) {
            anonymousClass284 = new AnonymousClass284();
            hashMap2.put(abstractC005302j, anonymousClass284);
        }
        if (j == 0) {
            anonymousClass284.A02 = 0L;
        } else {
            anonymousClass284.A02 = j;
        }
        anonymousClass284.A01 = 0L;
        for (Map.Entry entry : hashMap2.entrySet()) {
            if (C003101m.A0U((Jid) entry.getKey()) && (hashMap = ((AnonymousClass284) entry.getValue()).A03) != null && (anonymousClass285 = (AnonymousClass285) hashMap.get(abstractC005302j)) != null) {
                anonymousClass285.A01 = 0L;
                return GroupJid.of((Jid) entry.getKey());
            }
        }
        return null;
    }

    public void A05() {
        HashMap hashMap = this.A04;
        HashSet hashSet = new HashSet(hashMap.keySet());
        hashMap.clear();
        HashMap hashMap2 = this.A03;
        for (RunnableEBaseShape0S0300000_I0_0 runnableEBaseShape0S0300000_I0_0 : hashMap2.values()) {
            this.A00.removeCallbacks(runnableEBaseShape0S0300000_I0_0);
        }
        hashMap2.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.A01.A02((AbstractC005302j) it.next());
        }
    }

    public void A06(AbstractC005302j abstractC005302j) {
        AnonymousClass284 anonymousClass284;
        HashMap hashMap;
        if (!C003101m.A0U(abstractC005302j) || (anonymousClass284 = (AnonymousClass284) this.A04.get(abstractC005302j)) == null || (hashMap = anonymousClass284.A03) == null) {
            return;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ((AnonymousClass285) entry.getValue()).A01 = 0L;
            StringBuilder sb = new StringBuilder();
            sb.append(abstractC005302j.getRawString());
            sb.append(((Jid) entry.getKey()).getRawString());
            RunnableEBaseShape0S0300000_I0_0 runnableEBaseShape0S0300000_I0_0 = (RunnableEBaseShape0S0300000_I0_0) this.A03.get(sb.toString());
            if (runnableEBaseShape0S0300000_I0_0 != null) {
                this.A00.removeCallbacks(runnableEBaseShape0S0300000_I0_0);
            }
        }
        anonymousClass284.A01 = 0L;
    }

    public void A07(AbstractC005302j abstractC005302j) {
        if (!C003101m.A0P(abstractC005302j) && !C003101m.A0X(abstractC005302j) && !C003101m.A0a(abstractC005302j)) {
            AnonymousClass284 anonymousClass284 = (AnonymousClass284) this.A04.get(abstractC005302j);
            if (anonymousClass284 != null && anonymousClass284.A04) {
                return;
            }
            C0EG c0eg = this.A02;
            C010005b c010005b = c0eg.A02;
            if (c010005b.A06 && c010005b.A02) {
                C000200d.A0v("app/send-presence-subscription jid=", abstractC005302j);
                c0eg.A07.A09(Message.obtain(null, 0, 12, 0, abstractC005302j));
                A09(abstractC005302j, true);
                this.A05.remove(abstractC005302j);
                return;
            }
            this.A05.add(abstractC005302j);
        }
    }

    public void A08(AbstractC005302j abstractC005302j, UserJid userJid) {
        String obj;
        HashMap hashMap = this.A04;
        AnonymousClass284 anonymousClass284 = (AnonymousClass284) hashMap.get(abstractC005302j);
        if (anonymousClass284 == null) {
            anonymousClass284 = new AnonymousClass284();
            hashMap.put(abstractC005302j, anonymousClass284);
        }
        if (userJid != null && C003101m.A0U(abstractC005302j)) {
            HashMap hashMap2 = anonymousClass284.A03;
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                anonymousClass284.A03 = hashMap2;
            }
            AnonymousClass285 anonymousClass285 = (AnonymousClass285) hashMap2.get(userJid);
            if (anonymousClass285 == null) {
                anonymousClass285 = new AnonymousClass285();
                anonymousClass284.A03.put(userJid, anonymousClass285);
            }
            anonymousClass285.A01 = 0L;
        }
        anonymousClass284.A01 = 0L;
        if (userJid == null) {
            obj = abstractC005302j.getRawString();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(abstractC005302j.getRawString());
            sb.append(userJid.getRawString());
            obj = sb.toString();
        }
        RunnableEBaseShape0S0300000_I0_0 runnableEBaseShape0S0300000_I0_0 = (RunnableEBaseShape0S0300000_I0_0) this.A03.get(obj);
        if (runnableEBaseShape0S0300000_I0_0 != null) {
            this.A00.removeCallbacks(runnableEBaseShape0S0300000_I0_0);
        }
    }

    public void A09(AbstractC005302j abstractC005302j, boolean z) {
        HashMap hashMap = this.A04;
        AnonymousClass284 anonymousClass284 = (AnonymousClass284) hashMap.get(abstractC005302j);
        if (anonymousClass284 == null) {
            anonymousClass284 = new AnonymousClass284();
            hashMap.put(abstractC005302j, anonymousClass284);
        }
        anonymousClass284.A04 = z;
        if (z) {
            return;
        }
        anonymousClass284.A02 = 0L;
    }

    public boolean A0A(AbstractC005302j abstractC005302j) {
        if (C003101m.A0U(abstractC005302j)) {
            return true;
        }
        AnonymousClass284 anonymousClass284 = (AnonymousClass284) this.A04.get(abstractC005302j);
        return anonymousClass284 != null && anonymousClass284.A02 == 1;
    }
}
