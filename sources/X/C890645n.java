package X;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.TypedValue;
import android.view.View;
import com.whatsapp.TextEmojiLabel;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.45n  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C890645n {
    public static final Pattern A00 = Pattern.compile("\\[(\\d+)]");

    public static Spannable A00(final C016807u c016807u, final AnonymousClass087 anonymousClass087) {
        Object[] objArr;
        final int i;
        Object A002 = c016807u.A00.A00(AnonymousClass469.A01);
        Integer num = null;
        int i2 = 0;
        if (A002 != null) {
            objArr = ((List) A002).toArray(new String[0]);
        } else {
            objArr = null;
        }
        String str = (String) c016807u.A00.A00(AnonymousClass469.A04);
        if (objArr != null) {
            str = MessageFormat.format(str, objArr);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        AnonymousClass081 anonymousClass081 = (AnonymousClass081) c016807u.A00.A00(AnonymousClass469.A08);
        String str2 = (String) c016807u.A00.A00(AnonymousClass469.A05);
        if (anonymousClass081 != null) {
            num = Integer.valueOf(AnonymousClass088.A06(anonymousClass081, anonymousClass087));
        } else if (str2 != null) {
            try {
                num = Integer.valueOf(C08i.A04(str2));
            } catch (C018208m e) {
                AnonymousClass088.A1j("WaRcRichTextComponentBinderUtils", String.format("Failed to parse text color %s", str2), e);
            }
        }
        if (num != null) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, str.length(), 0);
        }
        String str3 = (String) c016807u.A00.A00(AnonymousClass469.A06);
        if (str3 != null) {
            try {
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(Math.round(C08i.A01(str3))), 0, str.length(), 0);
            } catch (C018208m e2) {
                AnonymousClass088.A1j("WaRcRichTextComponentBinderUtils", String.format("Failed to parse text color %s", str2), e2);
            }
        }
        String str4 = (String) c016807u.A00.A00(AnonymousClass469.A07);
        if (str4 != null) {
            try {
                spannableStringBuilder.setSpan(new StyleSpan(C08i.A07(str4)), 0, str.length(), 0);
            } catch (C018208m e3) {
                AnonymousClass088.A1j("WaRcRichTextComponentBinderUtils", String.format("Failed to textStyle  %s", str3), e3);
            }
        }
        Matcher matcher = A00.matcher(str);
        int i3 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            int A01 = AnonymousClass024.A01(group.replaceAll("[\\[\\]]", ""), -1);
            if (A01 >= 0 && A01 < c016807u.A05().size()) {
                AnonymousClass081 anonymousClass0812 = (AnonymousClass081) c016807u.A05().get(A01);
                String ADJ = anonymousClass0812.ADJ(C09N.A03);
                if (objArr != null) {
                    ADJ = MessageFormat.format(ADJ, objArr);
                }
                int start = matcher.start() + i3;
                int length = ADJ.length();
                int length2 = group.length();
                int i4 = (length - length2) + i3;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ADJ);
                String ADJ2 = anonymousClass0812.ADJ(C09N.A04);
                if (ADJ2 != null) {
                    try {
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(C08i.A04(ADJ2)), i2, length, i2);
                    } catch (C018208m unused) {
                        AnonymousClass088.A1i("WaRcRichTextComponentBinderUtils", "Error parsing TextSpan color");
                    }
                }
                AnonymousClass081 anonymousClass0813 = (AnonymousClass081) anonymousClass0812.ABT(C09N.A08);
                if (anonymousClass0813 != null) {
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(AnonymousClass088.A06(anonymousClass0813, anonymousClass087)), i2, length, i2);
                }
                String ADJ3 = anonymousClass0812.ADJ(C09N.A06);
                if (ADJ3 != null) {
                    try {
                        spannableStringBuilder2.setSpan(new AbsoluteSizeSpan(Math.round(TypedValue.applyDimension(2, C08i.A02(ADJ3), anonymousClass087.A00.getResources().getDisplayMetrics()))), 0, length, 0);
                    } catch (C018208m unused2) {
                        AnonymousClass088.A1i("WaRcRichTextComponentBinderUtils", "Error parsing TextSpan size");
                    }
                }
                String ADJ4 = anonymousClass0812.ADJ(C09N.A07);
                if (ADJ4 != null) {
                    try {
                        spannableStringBuilder2.setSpan(new StyleSpan(C08i.A07(ADJ4)), 0, length, 0);
                    } catch (C018208m unused3) {
                        AnonymousClass088.A1i("WaRcRichTextComponentBinderUtils", "Error parsing TextSpan textStyle");
                    }
                }
                final C09P AA3 = anonymousClass0812.AA3(C09N.A01);
                if (AA3 != null) {
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    if (anonymousClass0813 != null) {
                        i = AnonymousClass088.A06(anonymousClass0813, anonymousClass087);
                    }
                    spannableStringBuilder2.setSpan(new AbstractC02750Cs(AA3, c016807u, anonymousClass087, i) { // from class: X.477
                        public final AnonymousClass087 A00;
                        public final C016807u A01;
                        public final C09P A02;

                        {
                            super(i, -65536, 1711315404);
                            this.A02 = AA3;
                            this.A01 = c016807u;
                            this.A00 = anonymousClass087;
                        }

                        @Override // X.InterfaceC02760Ct
                        public void onClick(View view) {
                            C016807u c016807u2 = this.A01;
                            int i5 = ((AbstractC016907v) c016807u2).A00;
                            C09P c09p = this.A02;
                            ArrayList arrayList = new ArrayList();
                            InterfaceC020509l A0f = AnonymousClass088.A0f(c016807u2);
                            if (arrayList.size() == 0) {
                                arrayList.add(A0f);
                                C25031Du.A00(i5, c09p, new C021109r(arrayList), this.A00);
                                return;
                            }
                            throw new IllegalArgumentException("arguments have to be continuous");
                        }
                    }, 0, length, 0);
                }
                spannableStringBuilder.replace(start, length2 + start, (CharSequence) spannableStringBuilder2);
                i3 = i4;
            }
            i2 = 0;
        }
        return spannableStringBuilder;
    }

    public static void A01(TextEmojiLabel textEmojiLabel, C016807u c016807u, Spannable spannable) {
        textEmojiLabel.A07 = new C02770Cu();
        textEmojiLabel.setText(spannable);
        String str = (String) c016807u.A00.A00(AnonymousClass469.A03);
        if (str != null) {
            try {
                textEmojiLabel.setGravity(C08i.A05(str));
            } catch (C018208m e) {
                AnonymousClass088.A1j("WaRcRichTextComponentBinderUtils", String.format("Failed to parse text align %s", str), e);
            }
        }
        String str2 = (String) c016807u.A00.A00(AnonymousClass469.A02);
        if (str2 != null) {
            try {
                textEmojiLabel.setLineHeight((int) C08i.A01(str2));
            } catch (C018208m e2) {
                AnonymousClass088.A1j("WaRcRichTextComponentBinderUtils", String.format("Failed to parse line height pixel  %s", str2), e2);
            }
        }
    }
}
