package X;

import android.content.Context;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2MH */
/* loaded from: classes2.dex */
public class C2MH {
    public static volatile C2MH A06;
    public final C018508q A00;
    public final C03230Ew A01;
    public final C02E A02;
    public final C000500h A03;
    public final C0DW A04;
    public final C0DV A05;

    public C2MH(C018508q c018508q, C03230Ew c03230Ew, C02E c02e, C000500h c000500h, C0DV c0dv, C0DW c0dw) {
        this.A00 = c018508q;
        this.A01 = c03230Ew;
        this.A02 = c02e;
        this.A03 = c000500h;
        this.A05 = c0dv;
        this.A04 = c0dw;
    }

    public SpannableString A00(Context context, String str, String[] strArr, String[] strArr2, final Runnable[] runnableArr) {
        SpannableString spannableString = new SpannableString(Html.fromHtml(str));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            final int i = 0;
            for (URLSpan uRLSpan : uRLSpanArr) {
                if (strArr[i].equals(uRLSpan.getURL())) {
                    int spanStart = spannableString.getSpanStart(uRLSpan);
                    int spanEnd = spannableString.getSpanEnd(uRLSpan);
                    int spanFlags = spannableString.getSpanFlags(uRLSpan);
                    spannableString.removeSpan(uRLSpan);
                    C02740Cr c02740Cr = new C02740Cr(context, this.A00, this.A02, this.A01, strArr2[i]);
                    c02740Cr.A00 = new InterfaceC26801Ks() { // from class: X.3sP
                        @Override // X.InterfaceC26801Ks
                        public final void A6E() {
                            runnableArr[i].run();
                        }
                    };
                    spannableString.setSpan(c02740Cr, spanStart, spanEnd, spanFlags);
                }
                i++;
            }
        }
        return spannableString;
    }

    public void A01(Context context, Spannable spannable) {
        try {
            Linkify.addLinks(spannable, 10);
            C04310Jr.A06(spannable);
            C02180Ae.A10(spannable, this.A03.A0H());
            C02180Ae.A0z(spannable, this.A05, this.A04);
        } catch (Exception unused) {
        }
        ArrayList A0x = AnonymousClass029.A0x(spannable);
        if (A0x == null || A0x.isEmpty()) {
            return;
        }
        Iterator it = A0x.iterator();
        while (it.hasNext()) {
            URLSpan uRLSpan = (URLSpan) it.next();
            spannable.setSpan(new C02740Cr(context, this.A00, this.A02, this.A01, uRLSpan.getURL()), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), spannable.getSpanFlags(uRLSpan));
        }
        Iterator it2 = A0x.iterator();
        while (it2.hasNext()) {
            spannable.removeSpan(it2.next());
        }
    }
}
