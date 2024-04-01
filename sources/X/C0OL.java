package X;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: X.0OL */
/* loaded from: classes.dex */
public final class C0OL {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public EnumC015507g A08;
    public C0OH A09;
    public C0OF A0A;
    public C0OF A0B;
    public C07M A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public static final String A0I = AbstractC16430qO.A01("WorkSpec");
    public static final InterfaceC04240Jk A0H = new InterfaceC04240Jk() { // from class: X.1W0
        @Override // X.InterfaceC04240Jk
        public Object A5S(Object input) {
            C0OF c0of;
            List<C17000rN> list = (List) input;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (C17000rN c17000rN : list) {
                List list2 = c17000rN.A04;
                if (list2 != null && !list2.isEmpty()) {
                    c0of = (C0OF) c17000rN.A04.get(0);
                } else {
                    c0of = C0OF.A01;
                }
                arrayList.add(new C16480qT(UUID.fromString(c17000rN.A03), c17000rN.A02, c17000rN.A01, c17000rN.A05, c0of, c17000rN.A00));
            }
            return arrayList;
        }
    };

    public C0OL(C0OL other) {
        this.A0C = C07M.ENQUEUED;
        C0OF c0of = C0OF.A01;
        this.A0A = c0of;
        this.A0B = c0of;
        this.A09 = C0OH.A08;
        this.A08 = EnumC015507g.EXPONENTIAL;
        this.A01 = 30000L;
        this.A07 = -1L;
        this.A0D = other.A0D;
        this.A0F = other.A0F;
        this.A0C = other.A0C;
        this.A0E = other.A0E;
        this.A0A = new C0OF(other.A0A);
        this.A0B = new C0OF(other.A0B);
        this.A03 = other.A03;
        this.A04 = other.A04;
        this.A02 = other.A02;
        this.A09 = new C0OH(other.A09);
        this.A00 = other.A00;
        this.A08 = other.A08;
        this.A01 = other.A01;
        this.A06 = other.A06;
        this.A05 = other.A05;
        this.A07 = other.A07;
        this.A0G = other.A0G;
    }

    public C0OL(String id, String workerClassName) {
        this.A0C = C07M.ENQUEUED;
        C0OF c0of = C0OF.A01;
        this.A0A = c0of;
        this.A0B = c0of;
        this.A09 = C0OH.A08;
        this.A08 = EnumC015507g.EXPONENTIAL;
        this.A01 = 30000L;
        this.A07 = -1L;
        this.A0D = id;
        this.A0F = workerClassName;
    }

    public long A00() {
        long j;
        long j2;
        int i;
        long scalb;
        if (this.A0C == C07M.ENQUEUED && (i = this.A00) > 0) {
            if (this.A08 == EnumC015507g.LINEAR) {
                scalb = this.A01 * i;
            } else {
                scalb = Math.scalb((float) this.A01, i - 1);
            }
            j2 = this.A06;
            j = Math.min(18000000L, scalb);
        } else {
            if (this.A04 != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = this.A06;
                if (j3 == 0) {
                    j3 = this.A03 + currentTimeMillis;
                }
                long j4 = this.A02;
                long j5 = this.A04;
                int i2 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                if (j4 != j5) {
                    return j3 + j5 + (i2 == 0 ? j4 * (-1) : 0L);
                }
                return j3 + (i2 != 0 ? j5 : 0L);
            }
            j = this.A06;
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            j2 = this.A03;
        }
        return j + j2;
    }

    public void A01(long intervalDuration, long flexDuration) {
        if (intervalDuration < 900000) {
            AbstractC16430qO.A00().A05(A0I, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            intervalDuration = 900000;
        }
        if (flexDuration < 300000) {
            AbstractC16430qO.A00().A05(A0I, String.format("Flex duration lesser than minimum allowed value; Changed to %s", 300000L), new Throwable[0]);
            flexDuration = 300000;
        }
        if (flexDuration > intervalDuration) {
            AbstractC16430qO.A00().A05(A0I, String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(intervalDuration)), new Throwable[0]);
            flexDuration = intervalDuration;
        }
        this.A04 = intervalDuration;
        this.A02 = flexDuration;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof C0OL) {
            C0OL c0ol = (C0OL) o;
            if (this.A03 == c0ol.A03 && this.A04 == c0ol.A04 && this.A02 == c0ol.A02 && this.A00 == c0ol.A00 && this.A01 == c0ol.A01 && this.A06 == c0ol.A06 && this.A05 == c0ol.A05 && this.A07 == c0ol.A07 && this.A0G == c0ol.A0G && this.A0D.equals(c0ol.A0D) && this.A0C == c0ol.A0C && this.A0F.equals(c0ol.A0F)) {
                String str = this.A0E;
                if (str != null) {
                    if (!str.equals(c0ol.A0E)) {
                        return false;
                    }
                } else if (c0ol.A0E != null) {
                    return false;
                }
                return this.A0A.equals(c0ol.A0A) && this.A0B.equals(c0ol.A0B) && this.A09.equals(c0ol.A09) && this.A08 == c0ol.A08;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.A0F.hashCode() + ((this.A0C.hashCode() + (this.A0D.hashCode() * 31)) * 31)) * 31;
        String str = this.A0E;
        int hashCode2 = (this.A0A.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        long j = this.A03;
        long j2 = this.A04;
        long j3 = this.A02;
        int hashCode3 = this.A09.hashCode();
        int hashCode4 = this.A08.hashCode();
        long j4 = this.A01;
        long j5 = this.A06;
        long j6 = this.A05;
        long j7 = this.A07;
        return ((((((((((hashCode4 + ((((hashCode3 + ((((((((this.A0B.hashCode() + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.A00) * 31)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.A0G ? 1 : 0);
    }

    public String toString() {
        return C000200d.A0L(C000200d.A0P("{WorkSpec: "), this.A0D, "}");
    }
}
