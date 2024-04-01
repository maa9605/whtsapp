package X;

import java.util.Locale;

/* renamed from: X.2E6  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2E6 {
    public final String A00;
    public final Locale[] A01;

    public C2E6(Locale locale, String str) {
        this.A01 = new Locale[]{locale};
        this.A00 = str;
    }

    public C2E6(Locale[] localeArr, String str) {
        this.A01 = localeArr;
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("HsmMessagePackEvent{locales=");
        A0P.append(AbstractC003201n.A08(this.A01));
        A0P.append(", namespace='");
        A0P.append(this.A00);
        A0P.append('\'');
        A0P.append('}');
        return A0P.toString();
    }
}
