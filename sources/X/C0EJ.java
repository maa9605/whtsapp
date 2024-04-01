package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0EJ */
/* loaded from: classes.dex */
public class C0EJ {
    public static volatile C0EJ A07;
    public final AnonymousClass012 A00;
    public final C003701t A01;
    public final int[] A06 = {0, 1, 2, 3};
    public final Map A03 = new HashMap();
    public final Map A05 = new HashMap();
    public final Map A04 = new HashMap();
    public final Map A02 = new HashMap();

    public C0EJ(AnonymousClass012 anonymousClass012, C003701t c003701t) {
        this.A00 = anonymousClass012;
        this.A01 = c003701t;
    }

    public static C0EJ A00() {
        if (A07 == null) {
            synchronized (C0EJ.class) {
                if (A07 == null) {
                    A07 = new C0EJ(AnonymousClass012.A00(), C003701t.A00());
                }
            }
        }
        return A07;
    }

    public final synchronized AbstractC05150Nn A01(int i, long j) {
        return (AbstractC05150Nn) A05(i).get(Long.valueOf(j));
    }

    public AbstractC05150Nn A02(long j) {
        for (int i : this.A06) {
            AbstractC05150Nn A01 = A01(i, j);
            if (A01 != null) {
                return A01;
            }
        }
        return null;
    }

    public C07860aD A03(C05190Nr c05190Nr) {
        return (C07860aD) A01(0, c05190Nr.A04);
    }

    public C05140Nm A04(long j) {
        return (C05140Nm) A01(2, j);
    }

    public Map A05(int i) {
        if (i == 0) {
            return this.A03;
        }
        if (i == 1) {
            return this.A05;
        }
        if (i == 2) {
            return this.A04;
        }
        if (i == 3) {
            return this.A02;
        }
        throw new RuntimeException("LoggableStanzaCache/getStanzaMap not expected stanza type");
    }

    public synchronized void A06(long j, AbstractC05150Nn abstractC05150Nn) {
        if (this.A01.A0C(296)) {
            Map A05 = A05(abstractC05150Nn.A02);
            if (A05 == null) {
                Log.w("LoggableStanzaCache/unexpected loggable stanza type");
                return;
            }
            Long valueOf = Long.valueOf(j);
            if (A05.containsKey(valueOf)) {
                StringBuilder sb = new StringBuilder();
                sb.append("LoggableStanzaCache/skipped caching loggable stanza:");
                sb.append(abstractC05150Nn);
                Log.w(sb.toString());
                return;
            }
            A05.put(valueOf, abstractC05150Nn);
        }
    }
}
