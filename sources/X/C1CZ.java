package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1CZ */
/* loaded from: classes.dex */
public class C1CZ {
    public static final C10130fL A0M;
    public static final Pattern A0N;
    public static final Pattern A0O;
    public static final Pattern A0P;
    public static final Pattern A0Q;
    public static final Pattern A0R;
    public C10130fL A03;
    public C10130fL A04;
    public String A08;
    public String A07 = "";
    public StringBuilder A0C = new StringBuilder();
    public String A06 = "";
    public StringBuilder A0A = new StringBuilder();
    public StringBuilder A0B = new StringBuilder();
    public boolean A0G = true;
    public boolean A0H = false;
    public boolean A0I = false;
    public boolean A0J = false;
    public final C0DZ A0L = C0DZ.A00();
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public StringBuilder A0E = new StringBuilder();
    public boolean A0K = false;
    public String A09 = "";
    public StringBuilder A0D = new StringBuilder();
    public List A0F = new ArrayList();
    public C10060fE A05 = new C10060fE(64);

    static {
        C10130fL c10130fL = new C10130fL();
        c10130fL.hasInternationalPrefix = true;
        c10130fL.internationalPrefix_ = "NA";
        A0M = c10130fL;
        A0N = Pattern.compile("\\[([^\\[\\]])*\\]");
        A0R = Pattern.compile("\\d(?=[^,}][^,}])");
        A0P = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*)+");
        A0Q = Pattern.compile("[- ]");
        A0O = Pattern.compile("\u2008");
    }

    public C1CZ(String str) {
        this.A08 = str;
        C10130fL A00 = A00(str);
        this.A03 = A00;
        this.A04 = A00;
    }

    public final C10130fL A00(String str) {
        int i;
        C0DZ c0dz = this.A0L;
        if (str != null && c0dz.A08.contains(str)) {
            C10130fL A0E = c0dz.A0E(str);
            if (A0E != null) {
                i = A0E.countryCode_;
            } else {
                throw new IllegalArgumentException(C000200d.A0H("Invalid region code: ", str));
            }
        } else {
            Logger logger = C0DZ.A0G;
            Level level = Level.WARNING;
            StringBuilder A0P2 = C000200d.A0P("Invalid or missing region code (");
            if (str == null) {
                str = "null";
            }
            A0P2.append(str);
            A0P2.append(") provided.");
            logger.log(level, A0P2.toString());
            i = 0;
        }
        C10130fL A0E2 = c0dz.A0E(c0dz.A0G(i));
        return A0E2 != null ? A0E2 : A0M;
    }

    public final String A01() {
        C10130fL c10130fL;
        List<C10140fM> list;
        StringBuilder sb = this.A0D;
        if (sb.length() >= 3) {
            String substring = sb.substring(0, 3);
            if (this.A0I && this.A03.intlNumberFormat_.size() > 0) {
                c10130fL = this.A03;
                list = c10130fL.intlNumberFormat_;
            } else {
                c10130fL = this.A03;
                list = c10130fL.numberFormat_;
            }
            boolean z = c10130fL.hasNationalPrefix;
            for (C10140fM c10140fM : list) {
                if (z && !this.A0I && !c10140fM.nationalPrefixOptionalWhenFormatting_) {
                    if (C0DZ.A0K.matcher(c10140fM.nationalPrefixFormattingRule_).matches()) {
                    }
                }
                if (A0P.matcher(c10140fM.format_).matches()) {
                    this.A0F.add(c10140fM);
                }
            }
            A08(substring);
            return A0B() ? A02() : this.A0A.toString();
        }
        return A06(sb.toString());
    }

    public final String A02() {
        String A04;
        int length = this.A0D.length();
        if (length > 0) {
            int i = 0;
            do {
                A04 = A04(this.A0D.charAt(i));
                i++;
            } while (i < length);
            return this.A0G ? A06(A04) : this.A0A.toString();
        }
        return this.A0E.toString();
    }

    public final String A03() {
        int i = 1;
        if (this.A03.countryCode_ == 1 && this.A0D.charAt(0) == '1' && this.A0D.charAt(1) != '0' && this.A0D.charAt(1) != '1') {
            StringBuilder sb = this.A0E;
            sb.append('1');
            sb.append(' ');
            this.A0I = true;
        } else {
            C10130fL c10130fL = this.A03;
            if (c10130fL.hasNationalPrefixForParsing) {
                Matcher matcher = this.A05.A00(c10130fL.nationalPrefixForParsing_).matcher(this.A0D);
                if (matcher.lookingAt()) {
                    this.A0I = true;
                    i = matcher.end();
                    this.A0E.append(this.A0D.substring(0, i));
                }
            }
            i = 0;
        }
        String substring = this.A0D.substring(0, i);
        this.A0D.delete(0, i);
        return substring;
    }

    public final String A04(char c) {
        Matcher matcher = A0O.matcher(this.A0C);
        if (matcher.find(this.A00)) {
            String replaceFirst = matcher.replaceFirst(Character.toString(c));
            this.A0C.replace(0, replaceFirst.length(), replaceFirst);
            int start = matcher.start();
            this.A00 = start;
            return this.A0C.substring(0, start + 1);
        }
        if (this.A0F.size() == 1) {
            this.A0G = false;
        }
        this.A06 = "";
        return this.A0A.toString();
    }

    public final String A05(char c, boolean z) {
        StringBuilder sb;
        String str;
        StringBuilder sb2 = this.A0A;
        sb2.append(c);
        if (z) {
            this.A01 = sb2.length();
        }
        if (Character.isDigit(c) || (this.A0A.length() == 1 && C0DZ.A0N.matcher(Character.toString(c)).matches())) {
            if (c == '+') {
                sb = this.A0B;
                sb.append(c);
            } else {
                c = Character.forDigit(Character.digit(c, 10), 10);
                sb = this.A0B;
                sb.append(c);
                this.A0D.append(c);
            }
            if (z) {
                this.A02 = sb.length();
            }
        } else {
            this.A0G = false;
            this.A0H = true;
        }
        if (!this.A0G) {
            if (this.A0H) {
                return this.A0A.toString();
            }
            if (A0A()) {
                if (A09()) {
                    this.A0G = true;
                    this.A0J = false;
                    this.A0F.clear();
                    return A01();
                }
            } else {
                String str2 = this.A09;
                if (str2.length() > 0) {
                    this.A0D.insert(0, str2);
                    this.A0E.setLength(this.A0E.lastIndexOf(this.A09));
                }
                if (!this.A09.equals(A03())) {
                    this.A0E.append(' ');
                    this.A0G = true;
                    this.A0J = false;
                    this.A0F.clear();
                    return A01();
                }
            }
            return this.A0A.toString();
        }
        int length = this.A0B.length();
        if (length != 0 && length != 1 && length != 2) {
            if (length == 3) {
                if (A0A()) {
                    this.A0J = true;
                } else {
                    this.A09 = A03();
                    return A01();
                }
            }
            if (this.A0J) {
                if (A09()) {
                    this.A0J = false;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append((Object) this.A0E);
                sb3.append(this.A0D.toString());
                return sb3.toString();
            } else if (this.A0F.size() > 0) {
                String A04 = A04(c);
                Iterator it = this.A0F.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C10140fM c10140fM = (C10140fM) it.next();
                        Matcher matcher = this.A05.A00(c10140fM.pattern_).matcher(this.A0D);
                        if (matcher.matches()) {
                            this.A0K = A0Q.matcher(c10140fM.nationalPrefixFormattingRule_).find();
                            str = A06(matcher.replaceAll(c10140fM.format_));
                            break;
                        }
                    } else {
                        str = "";
                        break;
                    }
                }
                if (str.length() > 0) {
                    return str;
                }
                A08(this.A0D.toString());
                if (A0B()) {
                    return A02();
                }
                return this.A0G ? A06(A04) : this.A0A.toString();
            } else {
                return A01();
            }
        }
        return this.A0A.toString();
    }

    public final String A06(String str) {
        StringBuilder sb = this.A0E;
        int length = sb.length();
        if (this.A0K && length > 0 && sb.charAt(length - 1) != ' ') {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(new String(this.A0E));
            sb2.append(' ');
            sb2.append(str);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((Object) this.A0E);
        sb3.append(str);
        return sb3.toString();
    }

    public void A07() {
        this.A07 = "";
        this.A0A.setLength(0);
        this.A0B.setLength(0);
        this.A0C.setLength(0);
        this.A00 = 0;
        this.A06 = "";
        this.A0E.setLength(0);
        this.A09 = "";
        this.A0D.setLength(0);
        this.A0G = true;
        this.A0H = false;
        this.A02 = 0;
        this.A01 = 0;
        this.A0I = false;
        this.A0J = false;
        this.A0F.clear();
        this.A0K = false;
        if (this.A03.equals(this.A04)) {
            return;
        }
        this.A03 = A00(this.A08);
    }

    public final void A08(String str) {
        int length = str.length() - 3;
        Iterator it = this.A0F.iterator();
        while (it.hasNext()) {
            C10140fM c10140fM = (C10140fM) it.next();
            if (c10140fM.leadingDigitsPattern_.size() > length && !this.A05.A00((String) c10140fM.leadingDigitsPattern_.get(length)).matcher(str).lookingAt()) {
                it.remove();
            }
        }
    }

    public final boolean A09() {
        StringBuilder sb;
        C0DZ c0dz;
        int A07;
        StringBuilder sb2 = this.A0D;
        if (sb2.length() == 0 || (A07 = (c0dz = this.A0L).A07(sb2, (sb = new StringBuilder()))) == 0) {
            return false;
        }
        this.A0D.setLength(0);
        this.A0D.append((CharSequence) sb);
        String A0G = c0dz.A0G(A07);
        if ("001".equals(A0G)) {
            this.A03 = c0dz.A0C(A07);
        } else if (!A0G.equals(this.A08)) {
            this.A03 = A00(A0G);
        }
        String num = Integer.toString(A07);
        StringBuilder sb3 = this.A0E;
        sb3.append(num);
        sb3.append(' ');
        return true;
    }

    public final boolean A0A() {
        C10060fE c10060fE = this.A05;
        StringBuilder A0P2 = C000200d.A0P("\\+|");
        A0P2.append(this.A03.internationalPrefix_);
        Matcher matcher = c10060fE.A00(A0P2.toString()).matcher(this.A0B);
        if (matcher.lookingAt()) {
            this.A0I = true;
            int end = matcher.end();
            this.A0D.setLength(0);
            this.A0D.append(this.A0B.substring(end));
            this.A0E.setLength(0);
            this.A0E.append(this.A0B.substring(0, end));
            if (this.A0B.charAt(0) != '+') {
                this.A0E.append(' ');
            }
            return true;
        }
        return false;
    }

    public final boolean A0B() {
        Iterator it = this.A0F.iterator();
        while (it.hasNext()) {
            C10140fM c10140fM = (C10140fM) it.next();
            String str = c10140fM.pattern_;
            if (this.A06.equals(str)) {
                return false;
            }
            if (str.indexOf(124) == -1) {
                String replaceAll = A0R.matcher(A0N.matcher(str).replaceAll("\\\\d")).replaceAll("\\\\d");
                this.A0C.setLength(0);
                String str2 = c10140fM.format_;
                Matcher matcher = this.A05.A00(replaceAll).matcher("999999999999999");
                matcher.find();
                String group = matcher.group();
                String replaceAll2 = group.length() < this.A0D.length() ? "" : group.replaceAll(replaceAll, str2).replaceAll("9", "\u2008");
                if (replaceAll2.length() > 0) {
                    this.A0C.append(replaceAll2);
                    this.A06 = str;
                    this.A0K = A0Q.matcher(c10140fM.nationalPrefixFormattingRule_).find();
                    this.A00 = 0;
                    return true;
                }
            }
            it.remove();
        }
        this.A0G = false;
        return false;
    }
}
