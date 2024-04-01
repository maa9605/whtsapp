package X;

import java.util.Arrays;

/* renamed from: X.0KN  reason: invalid class name */
/* loaded from: classes.dex */
public class C0KN {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C05200Ns A04;
    public final C05200Ns A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public C0KN(int i, int i2, String str, String str2, C05200Ns c05200Ns, C05200Ns c05200Ns2, boolean z, int i3, int i4) {
        this.A03 = i;
        this.A01 = i2;
        this.A07 = str;
        this.A06 = str2;
        this.A05 = c05200Ns;
        this.A04 = c05200Ns2;
        this.A08 = z;
        this.A02 = i3;
        this.A00 = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0KN.class != obj.getClass()) {
            return false;
        }
        C0KN c0kn = (C0KN) obj;
        return this.A03 == c0kn.A03 && this.A01 == c0kn.A01 && this.A08 == c0kn.A08 && this.A02 == c0kn.A02 && this.A00 == c0kn.A00 && AnonymousClass024.A0l(this.A07, c0kn.A07) && AnonymousClass024.A0l(this.A06, c0kn.A06) && AnonymousClass024.A0l(this.A05, c0kn.A05) && AnonymousClass024.A0l(this.A04, c0kn.A04);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A03), Integer.valueOf(this.A01), this.A07, this.A06, this.A05, this.A04, Boolean.valueOf(this.A08), Integer.valueOf(this.A02), Integer.valueOf(this.A00)});
    }
}
