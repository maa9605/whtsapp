package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2jq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C55082jq extends AbstractCallableC55022jk {
    public final int A00;
    public final int A01 = 3;
    public final Context A02;
    public final Paint A03;
    public final C02E A04;
    public final C002301c A05;
    public final C40081rY A06;
    public final C02O A07;
    public final CharSequence A08;
    public final List A09;

    public C55082jq(Context context, Paint paint, int i, CharSequence charSequence, List list, C40081rY c40081rY, C02E c02e, C002301c c002301c, C02O c02o) {
        this.A02 = context;
        this.A03 = paint;
        this.A00 = i;
        this.A08 = charSequence;
        this.A09 = list;
        this.A06 = c40081rY;
        this.A04 = c02e;
        this.A05 = c002301c;
        this.A07 = c02o;
    }

    public static List A00(List list, int i, BreakIterator breakIterator, int i2) {
        if (list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int min = Math.min(list.size(), 5);
        for (int i3 = 0; i3 < min; i3++) {
            C0FK c0fk = (C0FK) list.get(i3);
            Object obj = c0fk.A00;
            if (obj != null) {
                Object obj2 = c0fk.A01;
                if (obj2 != null) {
                    int max = Math.max(0, breakIterator.preceding(Math.max(0, ((Number) obj).intValue() - i)));
                    int following = breakIterator.following(Math.min(i2, ((Number) obj2).intValue() + i)) - 1;
                    if (following < 0) {
                        following = i2;
                    }
                    C0FK c0fk2 = new C0FK(Integer.valueOf(max), Integer.valueOf(following));
                    if (arrayList.size() == 0) {
                        arrayList.add(c0fk2);
                    } else {
                        int size = arrayList.size() - 1;
                        C0FK c0fk3 = (C0FK) arrayList.get(size);
                        Object obj3 = c0fk2.A00;
                        if (obj3 != null) {
                            int intValue = ((Number) obj3).intValue();
                            Object obj4 = c0fk2.A01;
                            if (obj4 != null) {
                                int intValue2 = ((Number) obj4).intValue();
                                Object obj5 = c0fk3.A00;
                                if (obj5 != null) {
                                    int intValue3 = ((Number) obj5).intValue();
                                    Object obj6 = c0fk3.A01;
                                    if (obj6 == null) {
                                        throw null;
                                    }
                                    int intValue4 = ((Number) obj6).intValue();
                                    if ((intValue <= intValue3 && intValue3 <= intValue2) || (intValue3 <= intValue && intValue <= intValue4)) {
                                        int min2 = Math.min(intValue, intValue3);
                                        int max2 = Math.max(intValue2, intValue4);
                                        arrayList.remove(size);
                                        arrayList.add(new C0FK(Integer.valueOf(min2), Integer.valueOf(max2)));
                                    } else {
                                        arrayList.add(c0fk2);
                                    }
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        return arrayList;
    }

    public final void A01(CharSequence charSequence, List list, SpannableStringBuilder spannableStringBuilder) {
        long length = charSequence.length() - 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0FK c0fk = (C0FK) it.next();
            super.A00.A02();
            Object obj = c0fk.A00;
            if (obj != null && ((Number) obj).intValue() != 0) {
                if (spannableStringBuilder.length() == 0) {
                    spannableStringBuilder.append(" ");
                    spannableStringBuilder.append("…");
                } else if (!"…".equals(String.valueOf(spannableStringBuilder.charAt(spannableStringBuilder.length() - 1)))) {
                    if (!Character.isWhitespace(spannableStringBuilder.charAt(spannableStringBuilder.length() - 1))) {
                        spannableStringBuilder.append(" ");
                    }
                    spannableStringBuilder.append("…");
                    spannableStringBuilder.append(" ");
                }
            }
            if (obj != null) {
                int intValue = ((Number) obj).intValue();
                Object obj2 = c0fk.A01;
                if (obj2 != null) {
                    int intValue2 = ((Number) obj2).intValue();
                    spannableStringBuilder.append(charSequence.subSequence(intValue, intValue2));
                    if (intValue2 < length) {
                        spannableStringBuilder.append(" ");
                        spannableStringBuilder.append("…");
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }
}
