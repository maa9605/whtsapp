package X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.11Q  reason: invalid class name */
/* loaded from: classes.dex */
public final class C11Q {
    public List A00;
    public final long A01;
    public final long A02;
    public final C11S A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final HashMap A08;
    public final HashMap A09;
    public final boolean A0A;
    public final String[] A0B;

    public C11Q(String str, String str2, long j, long j2, C11S c11s, String[] strArr, String str3, String str4) {
        this.A06 = str;
        this.A07 = str2;
        this.A04 = str4;
        this.A03 = c11s;
        this.A0B = strArr;
        this.A0A = str2 != null;
        this.A02 = j;
        this.A01 = j2;
        if (str3 != null) {
            this.A05 = str3;
            this.A09 = new HashMap();
            this.A08 = new HashMap();
            return;
        }
        throw null;
    }

    public static SpannableStringBuilder A00(String str, Map map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return (SpannableStringBuilder) map.get(str);
    }

    public final void A01(long j, String str, List list) {
        String str2;
        String str3 = this.A05;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (A05(j) && "div".equals(this.A06) && (str2 = this.A04) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        int i = 0;
        while (true) {
            List list2 = this.A00;
            if (i < (list2 == null ? 0 : list2.size())) {
                List list3 = this.A00;
                if (list3 != null) {
                    ((C11Q) list3.get(i)).A01(j, str, list);
                    i++;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                return;
            }
        }
    }

    public final void A02(long j, Map map, Map map2) {
        int i;
        if (!A05(j)) {
            return;
        }
        Iterator it = this.A08.entrySet().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            HashMap hashMap = this.A09;
            int intValue = hashMap.containsKey(key) ? ((Number) hashMap.get(key)).intValue() : 0;
            int intValue2 = ((Number) entry.getValue()).intValue();
            if (intValue != intValue2) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) map2.get(key);
                C11S c11s = this.A03;
                String[] strArr = this.A0B;
                if (c11s == null) {
                    if (strArr != null) {
                        int length = strArr.length;
                        if (length == 1) {
                            c11s = (C11S) map.get(strArr[0]);
                            if (c11s != null) {
                            }
                        } else if (length > 1) {
                            c11s = new C11S();
                            while (i < length) {
                                c11s.A00((C11S) map.get(strArr[i]));
                                i++;
                            }
                        }
                    }
                } else if (strArr != null) {
                    int length2 = strArr.length;
                    if (length2 == 1) {
                        c11s.A00((C11S) map.get(strArr[0]));
                    } else if (length2 > 1) {
                        while (i < length2) {
                            c11s.A00((C11S) map.get(strArr[i]));
                            i++;
                        }
                    }
                }
                int i2 = c11s.A02;
                int i3 = -1;
                if (i2 != -1 || c11s.A05 != -1) {
                    i3 = (i2 == 1 ? 1 : 0) | (c11s.A05 == 1 ? 2 : 0);
                }
                if (i3 != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(i3), intValue, intValue2, 33);
                }
                if (c11s.A06 == 1) {
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                }
                if (c11s.A07 == 1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                }
                if (c11s.A0C) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(c11s.A03), intValue, intValue2, 33);
                }
                if (c11s.A0B) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(c11s.A01), intValue, intValue2, 33);
                }
                String str = c11s.A09;
                if (str != null) {
                    spannableStringBuilder.setSpan(new TypefaceSpan(str), intValue, intValue2, 33);
                }
                Layout.Alignment alignment = c11s.A08;
                if (alignment != null) {
                    spannableStringBuilder.setSpan(new AlignmentSpan.Standard(alignment), intValue, intValue2, 33);
                }
                int i4 = c11s.A04;
                if (i4 == 1) {
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) c11s.A00, true), intValue, intValue2, 33);
                } else if (i4 == 2) {
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(c11s.A00), intValue, intValue2, 33);
                } else if (i4 == 3) {
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(c11s.A00 / 100.0f), intValue, intValue2, 33);
                }
            }
        }
        while (true) {
            List list = this.A00;
            if (i < (list == null ? 0 : list.size())) {
                List list2 = this.A00;
                if (list2 != null) {
                    ((C11Q) list2.get(i)).A02(j, map, map2);
                    i++;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                return;
            }
        }
    }

    public final void A03(long j, boolean z, String str, Map map) {
        boolean z2;
        String str2 = str;
        HashMap hashMap = this.A09;
        hashMap.clear();
        HashMap hashMap2 = this.A08;
        hashMap2.clear();
        String str3 = this.A06;
        if ("metadata".equals(str3)) {
            return;
        }
        String str4 = this.A05;
        if (!"".equals(str4)) {
            str2 = str4;
        }
        if (this.A0A && z) {
            A00(str2, map).append((CharSequence) this.A07);
        } else if ("br".equals(str3) && z) {
            A00(str2, map).append('\n');
        } else if (A05(j)) {
            for (Map.Entry entry : map.entrySet()) {
                hashMap.put(entry.getKey(), Integer.valueOf(((SpannableStringBuilder) entry.getValue()).length()));
            }
            boolean equals = "p".equals(str3);
            int i = 0;
            while (true) {
                List list = this.A00;
                if (i < (list == null ? 0 : list.size())) {
                    List list2 = this.A00;
                    if (list2 != null) {
                        C11Q c11q = (C11Q) list2.get(i);
                        if (!z) {
                            z2 = false;
                            if (!equals) {
                                c11q.A03(j, z2, str2, map);
                                i++;
                            }
                        }
                        z2 = true;
                        c11q.A03(j, z2, str2, map);
                        i++;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                } else {
                    if (equals) {
                        SpannableStringBuilder A00 = A00(str2, map);
                        int length = A00.length();
                        while (true) {
                            length--;
                            if (length < 0) {
                                break;
                            } else if (A00.charAt(length) != ' ') {
                                if (A00.charAt(length) != '\n') {
                                    A00.append('\n');
                                }
                            }
                        }
                    }
                    for (Map.Entry entry2 : map.entrySet()) {
                        hashMap2.put(entry2.getKey(), Integer.valueOf(((SpannableStringBuilder) entry2.getValue()).length()));
                    }
                    return;
                }
            }
        }
    }

    public final void A04(TreeSet treeSet, boolean z) {
        boolean z2;
        String str = this.A06;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.A04 != null)) {
            long j = this.A02;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.A01;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.A00 == null) {
            return;
        }
        for (int i = 0; i < this.A00.size(); i++) {
            C11Q c11q = (C11Q) this.A00.get(i);
            if (!z) {
                z2 = false;
                if (!equals) {
                    c11q.A04(treeSet, z2);
                }
            }
            z2 = true;
            c11q.A04(treeSet, z2);
        }
    }

    public boolean A05(long j) {
        long j2 = this.A02;
        if (j2 == -9223372036854775807L && this.A01 == -9223372036854775807L) {
            return true;
        }
        if (j2 > j || this.A01 != -9223372036854775807L) {
            if (j2 != -9223372036854775807L || j >= this.A01) {
                return j2 <= j && j < this.A01;
            }
            return true;
        }
        return true;
    }
}
