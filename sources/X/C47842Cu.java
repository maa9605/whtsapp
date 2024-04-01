package X;

import java.util.Locale;

/* renamed from: X.2Cu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47842Cu {
    public final String A00;
    public final Locale A01;

    public C47842Cu(Locale locale, String str) {
        this.A01 = new Locale(locale.getLanguage(), locale.getCountry());
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C47842Cu.class != obj.getClass()) {
            return false;
        }
        C47842Cu c47842Cu = (C47842Cu) obj;
        Locale locale = this.A01;
        if (locale != null) {
            if (!locale.equals(c47842Cu.A01)) {
                return false;
            }
        } else if (c47842Cu.A01 != null) {
            return false;
        }
        String str = this.A00;
        String str2 = c47842Cu.A00;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        Locale locale = this.A01;
        int hashCode = (locale != null ? locale.hashCode() : 0) * 31;
        String str = this.A00;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
