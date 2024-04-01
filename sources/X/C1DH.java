package X;

import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1DH  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DH {
    public static final Map A00;
    public static final Map A01;
    public static final /* synthetic */ C1DH[] A02;
    public static final C1DH A03;
    public static final C1DH A04;
    public static final C1DH A0A;
    public static final C1DH A0B;
    public final String[] otherEncodingNames;
    public final int[] values;
    public static final C1DH A09 = new C1DH("Cp437", 0, new int[]{0, 2}, new String[0]);
    public static final C1DH A0C = new C1DH("ISO8859_1", 1, new int[]{1, 3}, "ISO-8859-1");
    public static final C1DH A0J = new C1DH("ISO8859_2", 2, 4, "ISO-8859-2");
    public static final C1DH A0K = new C1DH("ISO8859_3", 3, 5, "ISO-8859-3");
    public static final C1DH A0L = new C1DH("ISO8859_4", 4, 6, "ISO-8859-4");
    public static final C1DH A0M = new C1DH("ISO8859_5", 5, 7, "ISO-8859-5");
    public static final C1DH A0N = new C1DH("ISO8859_6", 6, 8, "ISO-8859-6");
    public static final C1DH A0O = new C1DH("ISO8859_7", 7, 9, "ISO-8859-7");
    public static final C1DH A0P = new C1DH("ISO8859_8", 8, 10, "ISO-8859-8");
    public static final C1DH A0Q = new C1DH("ISO8859_9", 9, 11, "ISO-8859-9");
    public static final C1DH A0D = new C1DH("ISO8859_10", 10, 12, "ISO-8859-10");
    public static final C1DH A0E = new C1DH("ISO8859_11", 11, 13, "ISO-8859-11");
    public static final C1DH A0F = new C1DH("ISO8859_13", 12, 15, "ISO-8859-13");
    public static final C1DH A0G = new C1DH("ISO8859_14", 13, 16, "ISO-8859-14");
    public static final C1DH A0H = new C1DH("ISO8859_15", 14, 17, "ISO-8859-15");
    public static final C1DH A0I = new C1DH("ISO8859_16", 15, 18, "ISO-8859-16");
    public static final C1DH A0R = new C1DH("SJIS", 16, 20, "Shift_JIS");
    public static final C1DH A05 = new C1DH("Cp1250", 17, 21, "windows-1250");
    public static final C1DH A06 = new C1DH("Cp1251", 18, 22, "windows-1251");
    public static final C1DH A07 = new C1DH("Cp1252", 19, 23, "windows-1252");
    public static final C1DH A08 = new C1DH("Cp1256", 20, 24, "windows-1256");
    public static final C1DH A0T = new C1DH("UnicodeBigUnmarked", 21, 25, "UTF-16BE", "UnicodeBig");
    public static final C1DH A0S = new C1DH("UTF8", 22, 26, "UTF-8");

    static {
        C1DH[] values;
        C1DH c1dh = new C1DH("ASCII", 23, new int[]{27, 170}, "US-ASCII");
        A03 = c1dh;
        C1DH c1dh2 = new C1DH();
        A04 = c1dh2;
        C1DH c1dh3 = new C1DH("GB18030", 25, 29, "GB2312", "EUC_CN", "GBK");
        A0B = c1dh3;
        C1DH c1dh4 = new C1DH("EUC_KR", 26, 30, "EUC-KR");
        A0A = c1dh4;
        A02 = new C1DH[]{A09, A0C, A0J, A0K, A0L, A0M, A0N, A0O, A0P, A0Q, A0D, A0E, A0F, A0G, A0H, A0I, A0R, A05, A06, A07, A08, A0T, A0S, c1dh, c1dh2, c1dh3, c1dh4};
        A01 = new HashMap();
        A00 = new HashMap();
        for (C1DH c1dh5 : values()) {
            for (int i : c1dh5.values) {
                A01.put(Integer.valueOf(i), c1dh5);
            }
            A00.put(c1dh5.name(), c1dh5);
            for (String str : c1dh5.otherEncodingNames) {
                A00.put(str, c1dh5);
            }
        }
    }

    public C1DH() {
        this.values = new int[]{28};
        this.otherEncodingNames = new String[0];
    }

    public C1DH(String str, int i, int i2, String... strArr) {
        this.values = new int[]{i2};
        this.otherEncodingNames = strArr;
    }

    public C1DH(String str, int i, int[] iArr, String... strArr) {
        this.values = iArr;
        this.otherEncodingNames = strArr;
    }

    public static C1DH valueOf(String str) {
        return (C1DH) Enum.valueOf(C1DH.class, str);
    }

    public static C1DH[] values() {
        return (C1DH[]) A02.clone();
    }
}
