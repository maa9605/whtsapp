package X;

import java.util.List;

/* renamed from: X.4B3 */
/* loaded from: classes3.dex */
public class C4B3 {
    public static List A01;
    public String A00 = "";

    public C4B3(String str) {
        try {
            new C4B2(str);
            A01 = C4B2.A02;
        } catch (C4B4 e) {
            throw e;
        } catch (Exception unused) {
            throw new C4B4(C4B5.UNKNOWN_ERROR);
        }
    }

    public static String A00(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        StringBuilder sb = new StringBuilder(100);
        if (str2 != null && !str2.isEmpty()) {
            sb.append(str2);
            sb.append("|");
        }
        if (str != null && !str.isEmpty()) {
            sb.append(str);
            sb.append("|");
        }
        if (str6 != null && !str6.isEmpty()) {
            sb.append(str6);
            sb.append("|");
        }
        if (str7 != null && !str7.isEmpty()) {
            sb.append(str7);
            sb.append("|");
        }
        if (str3 != null && !str3.isEmpty()) {
            sb.append(str3);
            sb.append("|");
        }
        if (str5 != null && !str5.isEmpty()) {
            sb.append(str5);
            sb.append("|");
        }
        if (str4 != null && !str4.isEmpty()) {
            sb.append(str4);
        }
        int lastIndexOf = sb.lastIndexOf("|");
        if (lastIndexOf != -1 && lastIndexOf == sb.length() - 1) {
            sb.deleteCharAt(lastIndexOf);
        }
        return sb.toString();
    }
}
