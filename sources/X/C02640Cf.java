package X;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: X.0Cf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C02640Cf implements Comparable {
    public final byte[] A00;

    public C02640Cf(byte[] bArr) {
        this.A00 = bArr;
    }

    public byte[] A00() {
        return C75823fb.A00(new byte[]{5}, this.A00);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return new BigInteger(this.A00).compareTo(new BigInteger(((C02640Cf) obj).A00));
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C02640Cf)) {
            return Arrays.equals(this.A00, ((C02640Cf) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }
}
