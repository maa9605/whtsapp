package X;

import java.util.Arrays;
import java.util.HashSet;

/* renamed from: X.3vs  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C85593vs extends C75973fq {
    public String A00;
    public static final HashSet A02 = new HashSet(Arrays.asList("BEGIN", "LOGO", "PHOTO", "LABEL", "FN", "TITLE", "SOUND", "VERSION", "TEL", "EMAIL", "TZ", "GEO", "NOTE", "URL", "BDAY", "ROLE", "REV", "UID", "KEY", "MAILER", "NAME", "PROFILE", "SOURCE", "NICKNAME", "CLASS", "SORT-STRING", "CATEGORIES", "PRODID"));
    public static final HashSet A01 = new HashSet(Arrays.asList("7BIT", "8BIT", "BASE64", "B"));
    public static final HashSet A03 = new HashSet();

    @Override // X.C75973fq
    public void A04(String str) {
        try {
            super.A04(str);
        } catch (C43301xB unused) {
            String[] split = str.split("=", 2);
            if (split.length == 2) {
                String str2 = split[0];
                String str3 = split[1];
                C43271x8 c43271x8 = this.A0G;
                if (c43271x8 != null) {
                    c43271x8.A01 = str2;
                    c43271x8.A00(str3);
                    return;
                }
                return;
            }
            throw new C43301xB(C000200d.A0H("Unknown params value: ", str));
        }
    }
}
