package X;

/* renamed from: X.0rF  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16920rF {
    public Long A00;
    public String A01;

    public C16920rF() {
        this.A01 = "reschedule_needed";
        this.A00 = 0L;
    }

    public C16920rF(String key, long value) {
        this.A01 = key;
        this.A00 = Long.valueOf(value);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof C16920rF) {
            C16920rF c16920rF = (C16920rF) o;
            if (this.A01.equals(c16920rF.A01)) {
                Long l = this.A00;
                Long l2 = c16920rF.A00;
                return l != null ? l.equals(l2) : l2 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        Long l = this.A00;
        return hashCode + (l != null ? l.hashCode() : 0);
    }
}
