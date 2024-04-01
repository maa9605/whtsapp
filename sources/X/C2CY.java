package X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.2CY  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2CY extends C0PJ {
    public HashMap dataUsageMapTx = new HashMap();
    public HashMap dataUsageMapRx = new HashMap();

    @Override // X.C0PJ
    public C0PJ A00(C0PJ c0pj) {
        C2CY c2cy = (C2CY) c0pj;
        this.dataUsageMapTx = c2cy.dataUsageMapTx;
        this.dataUsageMapRx = c2cy.dataUsageMapRx;
        return this;
    }

    @Override // X.C0PJ
    public C0PJ A01(C0PJ c0pj, C0PJ c0pj2) {
        C2CY c2cy = (C2CY) c0pj;
        C2CY c2cy2 = (C2CY) c0pj2;
        if (c2cy2 == null) {
            c2cy2 = new C2CY();
        }
        if (c2cy == null) {
            c2cy2.dataUsageMapTx = this.dataUsageMapTx;
            c2cy2.dataUsageMapRx = this.dataUsageMapRx;
        } else {
            HashMap hashMap = c2cy.dataUsageMapTx;
            Iterator it = hashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Number) it.next()).intValue();
                HashMap hashMap2 = this.dataUsageMapTx;
                Integer valueOf = Integer.valueOf(intValue);
                if (hashMap2.containsKey(valueOf)) {
                    long longValue = ((Number) this.dataUsageMapTx.get(valueOf)).longValue() - ((Number) hashMap.get(valueOf)).longValue();
                    c2cy2.dataUsageMapTx.put(valueOf, Long.valueOf(longValue > 0 ? longValue : 0L));
                } else {
                    C000200d.A0p("NetworkDataUsageMetrics/ old tx usage value missing for data type:", intValue);
                    c2cy2.dataUsageMapTx.put(valueOf, 0L);
                }
            }
            HashMap hashMap3 = c2cy.dataUsageMapRx;
            for (Number number : hashMap3.keySet()) {
                int intValue2 = number.intValue();
                HashMap hashMap4 = this.dataUsageMapRx;
                Integer valueOf2 = Integer.valueOf(intValue2);
                if (hashMap4.containsKey(valueOf2)) {
                    long longValue2 = ((Number) this.dataUsageMapRx.get(valueOf2)).longValue() - ((Number) hashMap3.get(valueOf2)).longValue();
                    HashMap hashMap5 = c2cy2.dataUsageMapRx;
                    if (longValue2 <= 0) {
                        longValue2 = 0;
                    }
                    hashMap5.put(valueOf2, Long.valueOf(longValue2));
                } else {
                    C000200d.A0p("NetworkDataUsageMetrics/ old rx usage value missing for data type:", intValue2);
                    c2cy2.dataUsageMapRx.put(valueOf2, 0L);
                }
            }
        }
        return c2cy2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2CY) {
            C2CY c2cy = (C2CY) obj;
            return this.dataUsageMapTx.equals(c2cy.dataUsageMapTx) && this.dataUsageMapRx.equals(c2cy.dataUsageMapRx);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.dataUsageMapTx.hashCode()), Integer.valueOf(this.dataUsageMapRx.hashCode())});
    }
}
