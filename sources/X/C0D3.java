package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0D3 */
/* loaded from: classes.dex */
public class C0D3 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public DeviceJid A04;
    public GroupJid A05;
    public AbstractC04290Jp A06;
    public String A07;
    public final long A08;
    public final C07950aM A09;
    public final Map A0A = new LinkedHashMap();
    public final boolean A0B;
    public final boolean A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;
    public transient boolean A0F;

    public C0D3(C07950aM c07950aM, AbstractC04290Jp abstractC04290Jp, long j, long j2, boolean z, int i, int i2, long j3, boolean z2, boolean z3, GroupJid groupJid, boolean z4, Collection collection, DeviceJid deviceJid, String str) {
        this.A09 = c07950aM;
        this.A06 = abstractC04290Jp;
        this.A03 = j;
        this.A08 = j2;
        this.A0E = z;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = j3;
        this.A0C = z2;
        this.A0B = z3;
        this.A05 = groupJid;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C0D4 c0d4 = (C0D4) it.next();
            this.A0A.put(c0d4.A02, c0d4);
        }
        this.A0D = z4;
        this.A04 = deviceJid;
        this.A07 = str;
    }

    public static C0D3 A00(AbstractC04290Jp abstractC04290Jp, long j, int i, long j2, boolean z, int i2, int i3, long j3, boolean z2, GroupJid groupJid, boolean z3, List list) {
        AnonymousClass094 anonymousClass094 = abstractC04290Jp.A0n;
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        UserJid of = UserJid.of(abstractC005302j);
        if (C003101m.A0b(of)) {
            return new C0D3(new C07950aM(of, anonymousClass094.A02, anonymousClass094.A01, i), abstractC04290Jp, j, j2, z, i2, i3, j3, false, z2, groupJid, z3, list, null, null);
        }
        StringBuilder A0P = C000200d.A0P("CallLog/fromFMessage V1 bad UserJid: ");
        A0P.append(abstractC005302j);
        Log.e(A0P.toString());
        return null;
    }

    public static C0D3 A01(AbstractC04290Jp abstractC04290Jp, boolean z, int i, int i2, long j, boolean z2) {
        AnonymousClass094 anonymousClass094 = abstractC04290Jp.A0n;
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        UserJid of = UserJid.of(abstractC005302j);
        if (C003101m.A0b(of)) {
            return new C0D3(new C07950aM(of, anonymousClass094.A02, anonymousClass094.A01, -1), abstractC04290Jp, -1L, abstractC04290Jp.A0E, z, i, i2, j, true, z2, null, false, Collections.emptyList(), null, null);
        }
        StringBuilder A0P = C000200d.A0P("CallLog/fromFMessage Legacy bad UserJid: ");
        A0P.append(abstractC005302j);
        Log.e(A0P.toString());
        return null;
    }

    public synchronized long A02() {
        return this.A03;
    }

    public C07950aM A03() {
        C07950aM c07950aM = this.A09;
        return new C07950aM(c07950aM.A01, c07950aM.A03, c07950aM.A02, c07950aM.A00);
    }

    public List A04() {
        return new ArrayList(this.A0A.values());
    }

    public synchronized void A05() {
        this.A0F = false;
    }

    public synchronized void A06(int i) {
        if (this.A00 != i) {
            this.A0F = true;
        }
        this.A00 = i;
    }

    public synchronized void A07(int i) {
        if (this.A01 != i) {
            this.A0F = true;
        }
        this.A01 = i;
    }

    public synchronized void A08(long j) {
        if (this.A02 != j) {
            this.A0F = true;
        }
        this.A02 = j;
    }

    public synchronized void A09(long j) {
        this.A03 = j;
    }

    public synchronized void A0A(DeviceJid deviceJid) {
        if (this.A04 != deviceJid) {
            this.A0F = true;
        }
        this.A04 = deviceJid;
    }

    public synchronized void A0B(GroupJid groupJid) {
        if (this.A05 != groupJid) {
            this.A0F = true;
        }
        this.A05 = groupJid;
    }

    public synchronized void A0C(UserJid userJid, int i) {
        Map map = this.A0A;
        C0D4 c0d4 = (C0D4) map.get(userJid);
        if (c0d4 != null) {
            synchronized (c0d4) {
                c0d4.A00 = i;
                c0d4.A03 = true;
            }
        } else {
            C0D4 c0d42 = new C0D4(-1L, userJid, i);
            map.put(c0d42.A02, c0d42);
            this.A0F = true;
        }
    }

    public synchronized void A0D(boolean z) {
        if (this.A0E != z) {
            this.A0F = true;
        }
        this.A0E = z;
    }

    public boolean A0E() {
        return this.A0A.size() >= 2;
    }

    public boolean A0F() {
        return !this.A09.A03 && this.A00 == 2;
    }

    public synchronized boolean A0G() {
        if (this.A0F || this.A03 == -1) {
            return true;
        }
        for (C0D4 c0d4 : this.A0A.values()) {
            if (c0d4.A01()) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0D3.class == obj.getClass()) {
            C0D3 c0d3 = (C0D3) obj;
            return this.A03 == c0d3.A03 && this.A09.equals(c0d3.A09) && this.A08 == c0d3.A08 && this.A0E == c0d3.A0E && this.A01 == c0d3.A01 && this.A02 == c0d3.A02 && this.A00 == c0d3.A00 && this.A0C == c0d3.A0C && this.A0B == c0d3.A0B && AnonymousClass024.A0l(this.A05, c0d3.A05) && this.A0D == c0d3.A0D && this.A0A.equals(c0d3.A0A) && AnonymousClass024.A0l(this.A04, c0d3.A04) && AnonymousClass024.A0l(this.A07, c0d3.A07);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A03), this.A09, Long.valueOf(this.A08), Boolean.valueOf(this.A0E), Integer.valueOf(this.A01), Long.valueOf(this.A02), Integer.valueOf(this.A00), Boolean.valueOf(this.A0C), Boolean.valueOf(this.A0B), this.A0A, this.A05, Boolean.valueOf(this.A0D), this.A04, this.A07});
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("CallLog[rowId=");
        A0P.append(this.A03);
        A0P.append(", key=");
        A0P.append(this.A09);
        A0P.append(", timestamp=");
        A0P.append(this.A08);
        A0P.append(", videoCall=");
        A0P.append(this.A0E);
        A0P.append(", duration=");
        A0P.append(this.A01);
        A0P.append(", bytesTransferred=");
        A0P.append(this.A02);
        A0P.append(", callResult=");
        A0P.append(this.A00);
        A0P.append(", isLegacy=");
        A0P.append(this.A0C);
        A0P.append(", fromMissedCall=");
        A0P.append(this.A0B);
        A0P.append(", groupJid=");
        A0P.append(this.A05);
        A0P.append(", isJoinableGroupCall=");
        A0P.append(this.A0D);
        A0P.append(", participants.size=");
        A0P.append(this.A0A.size());
        A0P.append(", callCreatorDeviceJid=");
        A0P.append(this.A04);
        A0P.append(", callRandomId=");
        return C000200d.A0L(A0P, this.A07, "]");
    }
}
