package X;

import java.util.Arrays;

/* renamed from: X.0Dc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C02850Dc {
    public final int A00;
    public final C10090fH A01;
    public final String A02;

    public C02850Dc(int i, String str, C10090fH c10090fH) {
        if (i < 0) {
            throw new IllegalArgumentException("Start index must be >= 0.");
        }
        if (str != null) {
            this.A00 = i;
            this.A02 = str;
            this.A01 = c10090fH;
            return;
        }
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C02850Dc) {
            C02850Dc c02850Dc = (C02850Dc) obj;
            return this.A02.equals(c02850Dc.A02) && this.A00 == c02850Dc.A00 && this.A01.equals(c02850Dc.A01);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A02, this.A01});
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("PhoneNumberMatch [");
        int i = this.A00;
        A0P.append(i);
        A0P.append(",");
        String str = this.A02;
        A0P.append(str.length() + i);
        A0P.append(") ");
        A0P.append(str);
        return A0P.toString();
    }
}
