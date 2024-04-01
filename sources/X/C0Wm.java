package X;

import android.os.Build;
import android.os.LocaleList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: X.0Wm  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Wm {
    public static final C0Wm A01 = A01(new Locale[0]);
    public InterfaceC07060Wn A00;

    public C0Wm(InterfaceC07060Wn interfaceC07060Wn) {
        this.A00 = interfaceC07060Wn;
    }

    public static C0Wm A00(String str) {
        Locale A02;
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i = 0; i < length; i++) {
                if (Build.VERSION.SDK_INT >= 21) {
                    A02 = Locale.forLanguageTag(split[i]);
                } else {
                    A02 = A02(split[i]);
                }
                localeArr[i] = A02;
            }
            return A01(localeArr);
        }
        return A01;
    }

    public static C0Wm A01(final Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            final LocaleList localeList = new LocaleList(localeArr);
            return new C0Wm(new InterfaceC07060Wn(localeList) { // from class: X.0Wu
                public final LocaleList A00;

                {
                    this.A00 = localeList;
                }

                @Override // X.InterfaceC07060Wn
                public Locale A8E(int i) {
                    return this.A00.get(i);
                }

                @Override // X.InterfaceC07060Wn
                public Object AAy() {
                    return this.A00;
                }

                @Override // X.InterfaceC07060Wn
                public String AVZ() {
                    return this.A00.toLanguageTags();
                }

                public boolean equals(Object obj) {
                    return this.A00.equals(((InterfaceC07060Wn) obj).AAy());
                }

                public int hashCode() {
                    return this.A00.hashCode();
                }

                public String toString() {
                    return this.A00.toString();
                }
            });
        }
        return new C0Wm(new InterfaceC07060Wn(localeArr) { // from class: X.0Wt
            public static final Locale A02;
            public static final Locale[] A03 = new Locale[0];
            public final String A00;
            public final Locale[] A01;

            @Override // X.InterfaceC07060Wn
            public Object AAy() {
                return null;
            }

            static {
                new Locale("en", "XA");
                new Locale("ar", "XB");
                A02 = C0Wm.A02("en-Latn");
            }

            {
                int length = localeArr.length;
                if (length == 0) {
                    this.A01 = A03;
                    this.A00 = "";
                    return;
                }
                Locale[] localeArr2 = new Locale[length];
                HashSet hashSet = new HashSet();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < length; i++) {
                    Locale locale = localeArr[i];
                    if (locale != null) {
                        if (!hashSet.contains(locale)) {
                            Locale locale2 = (Locale) locale.clone();
                            localeArr2[i] = locale2;
                            sb.append(locale2.getLanguage());
                            String country = locale2.getCountry();
                            if (country != null && !country.isEmpty()) {
                                sb.append('-');
                                sb.append(locale2.getCountry());
                            }
                            if (i < length - 1) {
                                sb.append(',');
                            }
                            hashSet.add(locale2);
                        } else {
                            throw new IllegalArgumentException(C000200d.A0E("list[", i, "] is a repetition"));
                        }
                    } else {
                        throw new NullPointerException(C000200d.A0E("list[", i, "] is null"));
                    }
                }
                this.A01 = localeArr2;
                this.A00 = sb.toString();
            }

            @Override // X.InterfaceC07060Wn
            public Locale A8E(int i) {
                if (i >= 0) {
                    Locale[] localeArr2 = this.A01;
                    if (i < localeArr2.length) {
                        return localeArr2[i];
                    }
                    return null;
                }
                return null;
            }

            @Override // X.InterfaceC07060Wn
            public String AVZ() {
                return this.A00;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof C07100Wt) {
                    Locale[] localeArr2 = ((C07100Wt) obj).A01;
                    Locale[] localeArr3 = this.A01;
                    int length = localeArr3.length;
                    if (length != localeArr2.length) {
                        return false;
                    }
                    for (int i = 0; i < length; i++) {
                        if (!localeArr3[i].equals(localeArr2[i])) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }

            public int hashCode() {
                int i = 1;
                int i2 = 0;
                while (true) {
                    Locale[] localeArr2 = this.A01;
                    if (i2 >= localeArr2.length) {
                        return i;
                    }
                    i = (i * 31) + localeArr2[i2].hashCode();
                    i2++;
                }
            }

            public String toString() {
                StringBuilder A0P = C000200d.A0P("[");
                int i = 0;
                while (true) {
                    Locale[] localeArr2 = this.A01;
                    int length = localeArr2.length;
                    if (i < length) {
                        A0P.append(localeArr2[i]);
                        if (i < length - 1) {
                            A0P.append(',');
                        }
                        i++;
                    } else {
                        A0P.append("]");
                        return A0P.toString();
                    }
                }
            }
        });
    }

    public static Locale A02(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            int length = split.length;
            if (length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (length == 1) {
                return new Locale(split[0]);
            }
        } else if (str.contains("_")) {
            String[] split2 = str.split("_", -1);
            int length2 = split2.length;
            if (length2 > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (length2 > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (length2 == 1) {
                return new Locale(split2[0]);
            }
        } else {
            return new Locale(str);
        }
        throw new IllegalArgumentException(C000200d.A0I("Can not parse language tag: [", str, "]"));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0Wm) && this.A00.equals(((C0Wm) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00.toString();
    }
}
