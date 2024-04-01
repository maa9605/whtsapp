package X;

import java.util.logging.Level;
import java.util.regex.Matcher;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.0Da  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class EnumC02830Da {
    public static final /* synthetic */ EnumC02830Da[] A00;
    public static final EnumC02830Da A01;
    public static final EnumC02830Da A02;
    public static final EnumC02830Da A03;
    public static final EnumC02830Da A04;
    public static final EnumC02830Da A05;

    public abstract boolean A00(C10090fH c10090fH, String str, C0DZ c0dz);

    static {
        EnumC02830Da enumC02830Da = new EnumC02830Da() { // from class: X.1f8
            @Override // X.EnumC02830Da
            public boolean A00(C10090fH c10090fH, String str, C0DZ c0dz) {
                EnumC24631Cg enumC24631Cg;
                EnumC24631Cg enumC24631Cg2 = EnumC24631Cg.IS_POSSIBLE;
                String A012 = C0DZ.A01(c10090fH);
                int i = c10090fH.countryCode_;
                if (!c0dz.A03.containsKey(Integer.valueOf(i))) {
                    enumC24631Cg = EnumC24631Cg.INVALID_COUNTRY_CODE;
                } else {
                    C10130fL A0D = c0dz.A0D(i, c0dz.A0G(i));
                    if (A0D != null) {
                        C10150fN c10150fN = A0D.generalDesc_;
                        if (!c10150fN.hasNationalNumberPattern) {
                            C0DZ.A0G.log(Level.FINER, "Checking if number is possible with incomplete metadata.");
                            int length = A012.length();
                            if (length < 2) {
                                enumC24631Cg = EnumC24631Cg.TOO_SHORT;
                            } else {
                                enumC24631Cg = length > 16 ? EnumC24631Cg.TOO_LONG : enumC24631Cg2;
                            }
                        } else {
                            Matcher matcher = c0dz.A00.A00(c10150fN.possibleNumberPattern_).matcher(A012);
                            if (matcher.matches()) {
                                enumC24631Cg = enumC24631Cg2;
                            } else if (matcher.lookingAt()) {
                                enumC24631Cg = EnumC24631Cg.TOO_LONG;
                            } else {
                                enumC24631Cg = EnumC24631Cg.TOO_SHORT;
                            }
                        }
                    } else {
                        throw null;
                    }
                }
                return enumC24631Cg == enumC24631Cg2;
            }
        };
        A02 = enumC02830Da;
        EnumC02830Da enumC02830Da2 = new EnumC02830Da() { // from class: X.1f9
            @Override // X.EnumC02830Da
            public boolean A00(C10090fH c10090fH, String str, C0DZ c0dz) {
                if (c0dz.A0L(c10090fH) && C02840Db.A04(c10090fH, str, c0dz)) {
                    return C02840Db.A03(c10090fH, c0dz);
                }
                return false;
            }
        };
        A04 = enumC02830Da2;
        EnumC02830Da enumC02830Da3 = new EnumC02830Da() { // from class: X.1fA
            @Override // X.EnumC02830Da
            public boolean A00(C10090fH c10090fH, String str, C0DZ c0dz) {
                EnumC02830Da enumC02830Da4 = EnumC02830Da.A04;
                if (enumC02830Da4.A00(c10090fH, str, c0dz)) {
                    return true;
                }
                if (c10090fH.hasNationalNumber) {
                    String valueOf = String.valueOf(c10090fH.nationalNumber_);
                    if (valueOf.startsWith("8") && c10090fH.hasCountryCode && c10090fH.countryCode_ == 7 && c10090fH.hasCountryCodeSource && c10090fH.countryCodeSource_ == EnumC10100fI.FROM_DEFAULT_COUNTRY) {
                        long parseLong = Long.parseLong(valueOf.substring(1));
                        c10090fH.hasNationalNumber = true;
                        c10090fH.nationalNumber_ = parseLong;
                        EnumC10100fI enumC10100fI = EnumC10100fI.FROM_NUMBER_WITHOUT_PLUS_SIGN;
                        c10090fH.hasCountryCodeSource = true;
                        c10090fH.countryCodeSource_ = enumC10100fI;
                        return enumC02830Da4.A00(c10090fH, str, c0dz);
                    }
                }
                if (c10090fH.hasItalianLeadingZero && c10090fH.italianLeadingZero_) {
                    c10090fH.hasItalianLeadingZero = false;
                    c10090fH.italianLeadingZero_ = false;
                    return enumC02830Da4.A00(c10090fH, str, c0dz);
                }
                return false;
            }
        };
        A05 = enumC02830Da3;
        EnumC02830Da enumC02830Da4 = new EnumC02830Da() { // from class: X.1fC
            @Override // X.EnumC02830Da
            public boolean A00(C10090fH c10090fH, String str, C0DZ c0dz) {
                if (c0dz.A0L(c10090fH) && C02840Db.A04(c10090fH, str, c0dz)) {
                    int indexOf = str.indexOf(47);
                    if ((indexOf > 0 && str.substring(indexOf + 1).contains("/")) || !C02840Db.A03(c10090fH, c0dz)) {
                        return false;
                    }
                    return C02840Db.A05(c10090fH, str, c0dz, new InterfaceC24591Cc() { // from class: X.1fB
                        @Override // X.InterfaceC24591Cc
                        public boolean A63(C0DZ c0dz2, C10090fH c10090fH2, StringBuilder sb, String[] strArr) {
                            int i = 0;
                            for (int i2 = 0; i2 < strArr.length; i2++) {
                                int indexOf2 = sb.indexOf(strArr[i2], i);
                                if (indexOf2 < 0) {
                                    return false;
                                }
                                i = indexOf2 + strArr[i2].length();
                                if (i2 == 0 && i < sb.length() && Character.isDigit(sb.charAt(i))) {
                                    return sb.substring(i - strArr[i2].length()).startsWith(C0DZ.A01(c10090fH2));
                                }
                            }
                            return sb.substring(i).contains(c10090fH2.extension_);
                        }
                    });
                }
                return false;
            }
        };
        A03 = enumC02830Da4;
        EnumC02830Da enumC02830Da5 = new EnumC02830Da() { // from class: X.1fE
            @Override // X.EnumC02830Da
            public boolean A00(C10090fH c10090fH, String str, C0DZ c0dz) {
                if (c0dz.A0L(c10090fH) && C02840Db.A04(c10090fH, str, c0dz)) {
                    int indexOf = str.indexOf(47);
                    if ((indexOf > 0 && str.substring(indexOf + 1).contains("/")) || !C02840Db.A03(c10090fH, c0dz)) {
                        return false;
                    }
                    return C02840Db.A05(c10090fH, str, c0dz, new InterfaceC24591Cc() { // from class: X.1fD
                        @Override // X.InterfaceC24591Cc
                        public boolean A63(C0DZ c0dz2, C10090fH c10090fH2, StringBuilder sb, String[] strArr) {
                            int length;
                            int i;
                            String[] split = C0DZ.A0M.split(sb.toString());
                            if (c10090fH2.hasExtension) {
                                length = split.length;
                                i = length - 2;
                            } else {
                                length = split.length;
                                i = length - 1;
                            }
                            if (length == 1 || split[i].contains(C0DZ.A01(c10090fH2))) {
                                return true;
                            }
                            int length2 = strArr.length - 1;
                            while (length2 > 0) {
                                if (i < 0 || !split[i].equals(strArr[length2])) {
                                    return false;
                                }
                                length2--;
                                i--;
                            }
                            return i >= 0 && split[i].endsWith(strArr[0]);
                        }
                    });
                }
                return false;
            }
        };
        A01 = enumC02830Da5;
        A00 = new EnumC02830Da[]{enumC02830Da, enumC02830Da2, enumC02830Da3, enumC02830Da4, enumC02830Da5};
    }

    public EnumC02830Da(String str, int i) {
    }

    public static EnumC02830Da valueOf(String str) {
        return (EnumC02830Da) Enum.valueOf(EnumC02830Da.class, str);
    }

    public static EnumC02830Da[] values() {
        return (EnumC02830Da[]) A00.clone();
    }
}
