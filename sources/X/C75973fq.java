package X;

import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.3fq */
/* loaded from: classes2.dex */
public class C75973fq {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public String A0D;
    public String A0E;
    public InterfaceC75953fo A0H;
    public static final HashSet A0L = new HashSet(Arrays.asList("DOM", "INTL", "POSTAL", "PARCEL", "HOME", "WORK", "PREF", "VOICE", "FAX", "MSG", "CELL", "PAGER", "BBS", "MODEM", "CAR", "ISDN", "VIDEO", "AOL", "APPLELINK", "ATTMAIL", "CIS", "EWORLD", "INTERNET", "IBMMAIL", "MCIMAIL", "POWERSHARE", "PRODIGY", "TLX", "X400", "GIF", "CGM", "WMF", "BMP", "MET", "PMB", "DIB", "PICT", "TIFF", "PDF", "PS", "JPEG", "QTIME", "MPEG", "MPEG2", "AVI", "WAVE", "AIFF", "PCM", "X509", "PGP"));
    public static final HashSet A0M = new HashSet(Arrays.asList("INLINE", "URL", "CONTENT-ID", "CID"));
    public static final HashSet A0K = new HashSet(Arrays.asList("BEGIN", "LOGO", "PHOTO", "LABEL", "FN", "TITLE", "SOUND", "VERSION", "TEL", "EMAIL", "TZ", "GEO", "NOTE", "URL", "BDAY", "ROLE", "REV", "UID", "KEY", "MAILER"));
    public static final HashSet A0J = new HashSet(Arrays.asList("7BIT", "8BIT", "QUOTED-PRINTABLE", "BASE64", "B"));
    public static final Pattern A0N = Pattern.compile("type=(.*?)[:;]");
    public static final Pattern A0O = Pattern.compile("waid=(.*?)[:;]");
    public C43271x8 A0G = null;
    public String A0C = null;
    public HashSet A0F = new HashSet();
    public boolean A0I = false;

    public String A00() {
        if (!(this instanceof C85593vs)) {
            return this.A0H.readLine();
        }
        C85593vs c85593vs = (C85593vs) this;
        String str = c85593vs.A00;
        if (str != null) {
            c85593vs.A00 = null;
            return str;
        }
        return c85593vs.A0H.readLine();
    }

    public String A01() {
        if (!(this instanceof C85593vs)) {
            if (this.A0I) {
                this.A0I = false;
                return this.A0D;
            }
            String A00 = A00();
            if (A00 != null) {
                return (A00.length() >= 16384 || A00.trim().length() <= 0) ? A01() : A00;
            }
            throw new C43301xB("Reached end of buffer.");
        }
        C85593vs c85593vs = (C85593vs) this;
        if (c85593vs.A0I) {
            c85593vs.A0I = false;
            return c85593vs.A0D;
        }
        while (true) {
            StringBuilder sb = null;
            while (true) {
                String readLine = c85593vs.A0H.readLine();
                if (readLine == null) {
                    if (sb != null) {
                        return sb.toString();
                    }
                    String str = c85593vs.A00;
                    if (str != null) {
                        c85593vs.A00 = null;
                        return str;
                    }
                    throw new C43301xB("Reached end of buffer.");
                }
                int length = readLine.length();
                if (length != 0 && length <= 16384) {
                    if (readLine.charAt(0) != ' ' && readLine.charAt(0) != '\t') {
                        String str2 = c85593vs.A00;
                        c85593vs.A00 = readLine;
                        if (str2 != null) {
                            return str2;
                        }
                        if (sb != null) {
                            return sb.toString();
                        }
                    } else if (sb != null) {
                        sb.append(readLine.substring(1));
                        if (sb.length() > 16384) {
                            break;
                        }
                    } else {
                        String str3 = c85593vs.A00;
                        if (str3 != null) {
                            sb = new StringBuilder();
                            sb.append(str3);
                            c85593vs.A00 = null;
                            sb.append(readLine.substring(1));
                            if (sb.length() > 16384) {
                                break;
                            }
                        } else {
                            throw new C43301xB("Space exists at the beginning of the line");
                        }
                    }
                } else if (sb != null) {
                    return sb.toString();
                } else {
                    String str4 = c85593vs.A00;
                    if (str4 != null) {
                        c85593vs.A00 = null;
                        return str4;
                    }
                }
            }
        }
    }

    public String A02(String str) {
        if (!str.trim().endsWith("=")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, (str.length() - 1) + 1));
        sb.append("\r\n");
        while (true) {
            String A00 = A00();
            if (A00 != null) {
                if (A00.trim().endsWith("=")) {
                    sb.append(A00.substring(0, (A00.length() - 1) + 1));
                    sb.append("\r\n");
                } else {
                    sb.append(A00);
                    return sb.toString();
                }
            } else {
                throw new C43301xB("File ended during parsing quoted-printable String");
            }
        }
    }

    public final String A03(String str, String str2) {
        String A01;
        int indexOf = str.indexOf(".") + 1;
        if (indexOf <= 0) {
            return null;
        }
        if (this.A0I) {
            A01 = this.A0D;
        } else {
            A01 = A01();
            this.A0D = A01;
            if (A01 != null && A01.trim().length() > 0) {
                this.A0I = true;
            }
            return null;
        }
        if (A01 == null || A01.length() <= indexOf || !str.substring(0, indexOf).equals(A01.substring(0, indexOf))) {
            return null;
        }
        if (str2 != null) {
            C000700j.A07(A01.charAt(indexOf + (-1)) == '.');
            int lastIndexOf = A01.lastIndexOf(":");
            if (lastIndexOf < indexOf || !str2.equals(A01.substring(indexOf, lastIndexOf))) {
                return null;
            }
        }
        this.A0I = false;
        return A01;
    }

    public void A04(String str) {
        boolean contains;
        String[] split = str.split("=", 2);
        if (split.length == 2) {
            String trim = split[0].trim();
            String trim2 = split[1].trim();
            if (trim.equalsIgnoreCase("TYPE")) {
                A05(trim2);
                return;
            } else if (trim.equals("VALUE")) {
                if (!A0M.contains(trim2.toUpperCase(Locale.US)) && !trim2.startsWith("X-")) {
                    throw new C43301xB(C000200d.A0I("Unknown value \"", trim2, "\""));
                }
                C43271x8 c43271x8 = this.A0G;
                if (c43271x8 == null) {
                    return;
                }
                c43271x8.A01 = "VALUE";
                c43271x8.A00(trim2);
                return;
            } else if (trim.equals("ENCODING")) {
                if (!(this instanceof C85593vs)) {
                    contains = A0J.contains(trim2.toUpperCase(Locale.US));
                } else {
                    contains = C85593vs.A01.contains(trim2.toUpperCase(Locale.US));
                }
                if (!contains && !trim2.startsWith("X-")) {
                    throw new C43301xB(C000200d.A0I("Unknown encoding \"", trim2, "\""));
                }
                C43271x8 c43271x82 = this.A0G;
                if (c43271x82 != null) {
                    c43271x82.A01 = "ENCODING";
                    c43271x82.A00(trim2);
                }
                this.A0C = trim2;
                return;
            } else if (trim.equals("CHARSET")) {
                C43271x8 c43271x83 = this.A0G;
                if (c43271x83 == null) {
                    return;
                }
                c43271x83.A01 = "CHARSET";
                c43271x83.A00(trim2);
                return;
            } else if (trim.equals("LANGUAGE")) {
                String[] split2 = trim2.split("-");
                if (split2.length <= 2) {
                    String str2 = split2[0];
                    int length = str2.length();
                    for (int i = 0; i < length; i++) {
                        char charAt = str2.charAt(i);
                        if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
                            throw new C43301xB(C000200d.A0I("Invalid Language: \"", trim2, "\""));
                        }
                    }
                    if (split2.length > 1) {
                        String str3 = split2[1];
                        int length2 = str3.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            char charAt2 = str3.charAt(i2);
                            if ((charAt2 < 'a' || charAt2 > 'z') && (charAt2 < 'A' || charAt2 > 'Z')) {
                                throw new C43301xB(C000200d.A0I("Invalid Language: \"", trim2, "\""));
                            }
                        }
                    }
                    C43271x8 c43271x84 = this.A0G;
                    if (c43271x84 == null) {
                        return;
                    }
                    c43271x84.A01 = "LANGUAGE";
                    c43271x84.A00(trim2);
                    return;
                }
                throw new C43301xB(C000200d.A0I("Invalid Language: \"", trim2, "\""));
            } else if (trim.startsWith("X-")) {
                if (!(this instanceof C85593vs)) {
                    C43271x8 c43271x85 = this.A0G;
                    if (c43271x85 == null) {
                        return;
                    }
                    c43271x85.A01 = trim;
                    c43271x85.A00(trim2);
                    return;
                }
                C43271x8 c43271x86 = this.A0G;
                if (c43271x86 == null) {
                    return;
                }
                c43271x86.A01 = trim;
                c43271x86.A00(trim2);
                return;
            } else if (trim.equalsIgnoreCase("WAID")) {
                C43271x8 c43271x87 = this.A0G;
                if (c43271x87 == null) {
                    return;
                }
                c43271x87.A01 = "waId";
                c43271x87.A00(trim2);
                return;
            } else {
                throw new C43301xB(C000200d.A0I("Unknown type \"", trim, "\""));
            }
        }
        A05(split[0]);
    }

    public void A05(String str) {
        if (!(this instanceof C85593vs)) {
            if (!A0L.contains(str) && !str.startsWith("X-") && !this.A0F.contains(str)) {
                this.A0F.add(str);
                StringBuilder sb = new StringBuilder("Type unsupported by vCard 2.1: ");
                sb.append(str);
                Log.w(sb.toString());
            }
            C43271x8 c43271x8 = this.A0G;
            if (c43271x8 != null) {
                c43271x8.A01 = "TYPE";
                c43271x8.A00(str);
                return;
            }
            return;
        }
        String[] split = str.split(",");
        this.A0G.A01 = "TYPE";
        for (String str2 : split) {
            if (str2.length() >= 2 && str2.startsWith("\"") && str2.endsWith("\"")) {
                this.A0G.A00(str2.substring(1, str2.length() - 1));
            } else {
                this.A0G.A00(str2.replaceAll("[_$!<|>!$_]", ""));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:555:0x0459, code lost:
        r2 = r2.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A06() {
        /*
            Method dump skipped, instructions count: 1375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75973fq.A06():boolean");
    }
}
