package X;

import java.util.Set;

/* renamed from: X.1sX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40601sX {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final Set A09;
    public final Set A0A;
    public final Set A0B;
    public final boolean A0C;

    public C40601sX(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Set set, Set set2, Set set3, String str9, boolean z) {
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A00 = str5;
        this.A01 = str6;
        this.A02 = str7;
        this.A03 = str8;
        this.A0B = set;
        this.A09 = set2;
        this.A0A = set3;
        this.A08 = "fallback".equals(str9) ? "fallback" : "primary";
        this.A0C = z;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("RouteHost{hostname='");
        C000200d.A1P(A0P, this.A04, '\'', ", upload=");
        Set set = this.A0B;
        if (set == null) {
            set = "all";
        }
        A0P.append(set);
        A0P.append(", download=");
        Set set2 = this.A09;
        A0P.append(set2 != null ? set2 : "all");
        A0P.append(", downloadBuckets=");
        Object obj = this.A0A;
        if (obj == null) {
            obj = "null";
        }
        A0P.append(obj);
        A0P.append(", type=");
        A0P.append(this.A08);
        A0P.append(", forceIp=");
        A0P.append(this.A0C);
        A0P.append('}');
        return A0P.toString();
    }
}
