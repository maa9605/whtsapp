package X;

import java.io.Serializable;
import java.text.DateFormat;

/* renamed from: X.3eW  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C75203eW implements Comparable, Serializable {
    public static final long serialVersionUID = 8139806907588338737L;
    public final long ntpTime;
    public DateFormat simpleFormatter;
    public DateFormat utcFormatter;

    public C75203eW(long j) {
        this.ntpTime = j;
    }

    public static long A00(long j) {
        long j2 = (j >>> 32) & 4294967295L;
        return (j2 * 1000) + ((2147483648L & j2) == 0 ? 2085978496000L : -2208988800000L) + Math.round(((j & 4294967295L) * 1000.0d) / 4.294967296E9d);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        long j = this.ntpTime;
        long j2 = ((C75203eW) obj).ntpTime;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C75203eW) && this.ntpTime == ((C75203eW) obj).ntpTime;
    }

    public int hashCode() {
        long j = this.ntpTime;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        long j = this.ntpTime;
        StringBuilder sb = new StringBuilder();
        String hexString = Long.toHexString((j >>> 32) & 4294967295L);
        for (int length = hexString.length(); length < 8; length++) {
            sb.append('0');
        }
        sb.append(hexString);
        sb.append('.');
        String hexString2 = Long.toHexString(j & 4294967295L);
        for (int length2 = hexString2.length(); length2 < 8; length2++) {
            sb.append('0');
        }
        sb.append(hexString2);
        return sb.toString();
    }
}
