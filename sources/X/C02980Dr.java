package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0Dr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C02980Dr {
    public static volatile C02980Dr A06;
    public final C02L A00;
    public final C05W A01;
    public final C018708s A02;
    public static final boolean A04 = Character.isDefined((char) 8296);
    public static final boolean A05 = Character.isDefined((char) 8297);
    public static final Pattern A03 = Pattern.compile("(@\\d+)");

    public C02980Dr(C05W c05w, C018708s c018708s, C02L c02l) {
        this.A01 = c05w;
        this.A02 = c018708s;
        this.A00 = c02l;
    }

    public static C02980Dr A00() {
        if (A06 == null) {
            synchronized (C02980Dr.class) {
                if (A06 == null) {
                    A06 = new C02980Dr(C05W.A00(), C018708s.A00(), C02L.A00());
                }
            }
        }
        return A06;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r3 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.CharSequence A01(android.content.Context r2, java.lang.CharSequence r3, java.util.List r4) {
        /*
            r1 = this;
            if (r4 == 0) goto L12
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L12
            boolean r0 = r3 instanceof android.text.SpannableStringBuilder
            if (r0 == 0) goto L13
            android.text.SpannableStringBuilder r3 = (android.text.SpannableStringBuilder) r3
        Le:
            r0 = 0
            r1.A03(r2, r3, r4, r0)
        L12:
            return r3
        L13:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r3)
            r3 = r0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02980Dr.A01(android.content.Context, java.lang.CharSequence, java.util.List):java.lang.CharSequence");
    }

    public String A02(C06C c06c) {
        String A00;
        StringBuilder sb = new StringBuilder();
        sb.append(A04 ? "\u2068" : "");
        if (c06c.A0E()) {
            A00 = C018708s.A02(c06c, false);
        } else if (!TextUtils.isEmpty(c06c.A0F)) {
            A00 = c06c.A0F;
        } else if (!TextUtils.isEmpty(c06c.A0O)) {
            A00 = c06c.A0O;
        } else {
            A00 = C04630Le.A00(c06c);
        }
        sb.append(A00);
        sb.append(A05 ? "\u2069" : "");
        return sb.toString();
    }

    public void A03(Context context, SpannableStringBuilder spannableStringBuilder, List list, boolean z) {
        C37801n4 c37801n4;
        if (z) {
            c37801n4 = new C37801n4(this, context, R.color.link_color, false);
        } else {
            c37801n4 = null;
        }
        A04(spannableStringBuilder, list, c37801n4);
    }

    public void A04(SpannableStringBuilder spannableStringBuilder, List list, InterfaceC10010f9 interfaceC10010f9) {
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(spannableStringBuilder)) {
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UserJid userJid = (UserJid) it.next();
                if (userJid != null) {
                    C06C A0A = this.A01.A0A(userJid);
                    StringBuilder A0P = C000200d.A0P("@");
                    A0P.append(A02(A0A));
                    hashMap.put(AnonymousClass029.A0r(userJid), new C0FK(A0P.toString(), A0A));
                }
            }
            Matcher matcher = A03.matcher(spannableStringBuilder);
            int i = 0;
            while (matcher.find()) {
                String group = matcher.group();
                if (hashMap.keySet().contains(group)) {
                    int start = matcher.start() + i;
                    Object obj = hashMap.get(group);
                    if (obj != null) {
                        C0FK c0fk = (C0FK) obj;
                        String str = (String) c0fk.A00;
                        int length = group.length();
                        spannableStringBuilder.replace(start, length + start, (CharSequence) str);
                        int length2 = str.length();
                        i += length2 - length;
                        if (interfaceC10010f9 != null) {
                            interfaceC10010f9.ANr(spannableStringBuilder, start, length2 + start, (C06C) c0fk.A01);
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
    }
}
