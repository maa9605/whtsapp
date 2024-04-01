package X;

import android.text.TextUtils;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.0f2  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09940f2 {
    public static final Pattern A02 = Pattern.compile("[\\p{ASCII}&&[^\\p{Alnum}]]");
    public static final ThreadLocal A01 = new ThreadLocal() { // from class: X.3aL
        @Override // java.lang.ThreadLocal
        public Object initialValue() {
            return Locale.US;
        }
    };
    public static final ThreadLocal A00 = new ThreadLocal() { // from class: X.3aM
        @Override // java.lang.ThreadLocal
        public Object initialValue() {
            return BreakIterator.getWordInstance((Locale) C09940f2.A01.get());
        }
    };

    public static C0FK A00(String str, boolean z, C002301c c002301c) {
        String A0F;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return new C0FK(arrayList2, arrayList);
        }
        String replaceAll = A02.matcher(str).replaceAll(" ");
        BreakIterator A022 = A02(c002301c);
        A022.setText(replaceAll);
        int first = A022.first();
        int next = A022.next();
        while (true) {
            int i = first;
            first = next;
            if (next != -1) {
                String substring = replaceAll.substring(i, next);
                if (z) {
                    A0F = AnonymousClass024.A0E(substring);
                } else {
                    A0F = AnonymousClass024.A0F(substring);
                }
                if (!TextUtils.isEmpty(A0F) && !Character.isSpaceChar(A0F.codePointAt(0))) {
                    arrayList2.add(Integer.valueOf(i));
                    arrayList2.add(Integer.valueOf(next));
                    arrayList.add(A0F);
                }
                next = A022.next();
            } else {
                return new C0FK(arrayList2, arrayList);
            }
        }
    }

    public static String A01(long j, String str, C002301c c002301c) {
        boolean z = false;
        if (j != 5) {
            if (j == 1) {
                if (str.isEmpty()) {
                    return str;
                }
                StringBuilder sb = new StringBuilder(str.length());
                BreakIterator A022 = A02(c002301c);
                A022.setText(str);
                int first = A022.first();
                int next = A022.next();
                while (true) {
                    int i = first;
                    first = next;
                    if (next == -1) {
                        break;
                    }
                    if (next - i != 1 || str.charAt(i) != ' ') {
                        sb.append((CharSequence) AnonymousClass024.A0E(str.subSequence(i, next)));
                        sb.append(' ');
                    }
                    next = A022.next();
                }
                if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                return sb.toString();
            }
            C000700j.A08(false, "Cannot tokenize for unknown tokenization version");
            return "";
        } else if (str.isEmpty()) {
            return str;
        } else {
            if (!C28171Qm.A00.matcher(str).find()) {
                z = true;
                str = AnonymousClass024.A0F(str);
            }
            StringBuilder sb2 = new StringBuilder(str.length());
            BreakIterator A023 = A02(c002301c);
            A023.setText(str);
            int first2 = A023.first();
            int next2 = A023.next();
            while (true) {
                int i2 = first2;
                first2 = next2;
                if (next2 == -1) {
                    break;
                }
                if (next2 - i2 != 1 || str.codePointAt(i2) != 32) {
                    CharSequence subSequence = str.subSequence(i2, next2);
                    if (!z) {
                        subSequence = AnonymousClass024.A0F(subSequence);
                    }
                    sb2.append(subSequence);
                    sb2.append(' ');
                }
                next2 = A023.next();
            }
            if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            return sb2.toString();
        }
    }

    public static BreakIterator A02(C002301c c002301c) {
        Locale A0I = c002301c.A0I();
        ThreadLocal threadLocal = A01;
        if (A0I.equals(threadLocal.get())) {
            return (BreakIterator) A00.get();
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(A0I);
        threadLocal.set(A0I);
        A00.set(wordInstance);
        return wordInstance;
    }

    public static ArrayList A03(String str, C002301c c002301c) {
        Object obj = A00(str, true, c002301c).A01;
        if (obj != null) {
            return (ArrayList) obj;
        }
        throw null;
    }

    public static boolean A04(String str, List list, C002301c c002301c) {
        return A05(str, list, c002301c, true);
    }

    public static boolean A05(String str, List list, C002301c c002301c, boolean z) {
        if (str == null) {
            return false;
        }
        String replaceAll = A02.matcher(str).replaceAll(" ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            BreakIterator A022 = A02(c002301c);
            A022.setText(replaceAll);
            int first = A022.first();
            int next = A022.next();
            while (true) {
                int i = first;
                first = next;
                if (next == -1) {
                    return false;
                }
                String A0E = AnonymousClass024.A0E(replaceAll.substring(i, next));
                if (z) {
                    if (A0E.startsWith(str2)) {
                        break;
                    }
                    next = A022.next();
                } else if (A0E.equals(str2)) {
                    break;
                } else {
                    next = A022.next();
                }
            }
        }
        return true;
    }
}
