package X;

import android.content.Context;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import com.google.android.search.verification.client.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2jK */
/* loaded from: classes2.dex */
public abstract class AbstractC54772jK {
    public static final AbstractC54772jK A04 = new AbstractC54772jK() { // from class: X.2k3
    };
    public static final AbstractC54772jK A01 = new AbstractC54772jK() { // from class: X.2k4
    };
    public static final AbstractC54772jK A02 = new AbstractC54772jK() { // from class: X.2k5
    };
    public static final AbstractC54772jK A03 = new AbstractC54772jK() { // from class: X.2k6
    };
    public static Map A00 = new ConcurrentHashMap();

    /* JADX WARN: Code restructure failed: missing block: B:121:0x00f2, code lost:
        if (r5 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00f4, code lost:
        if (r0 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00f8, code lost:
        if ((r14 instanceof android.text.Spannable) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00fa, code lost:
        r0 = (android.text.Spannable) r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00fd, code lost:
        r28.A04(r25, r0, r18, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0122, code lost:
        r0 = new android.text.SpannableStringBuilder(r14);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C0FK A00(android.content.Context r25, java.lang.CharSequence r26, java.util.List r27, X.AbstractC54772jK r28, boolean r29, X.C002301c r30) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC54772jK.A00(android.content.Context, java.lang.CharSequence, java.util.List, X.2jK, boolean, X.01c):X.0FK");
    }

    public static CharSequence A01(Context context, CharSequence charSequence, List list, C002301c c002301c) {
        Object obj = A00(context, charSequence, list, A02, true, c002301c).A00;
        if (obj != null) {
            return (CharSequence) obj;
        }
        throw null;
    }

    public static CharSequence A02(Context context, CharSequence charSequence, List list, C002301c c002301c) {
        return A03(context, charSequence, list, A04, c002301c);
    }

    public static CharSequence A03(Context context, CharSequence charSequence, List list, AbstractC54772jK abstractC54772jK, C002301c c002301c) {
        return (CharSequence) A00(context, charSequence, list, abstractC54772jK, false, c002301c).A00;
    }

    public void A04(Context context, Spannable spannable, int i, int i2) {
        if (this instanceof C55242k6) {
            return;
        }
        if (this instanceof C55232k5) {
            spannable.setSpan(new C10200fS(context), i, i2, 33);
            spannable.setSpan(new ForegroundColorSpan(C02160Ac.A00(context, R.color.fts_search_highlight_text)), i, i2, 33);
        } else if (!(this instanceof C55222k4)) {
            spannable.setSpan(new ForegroundColorSpan(C02160Ac.A00(context, R.color.search_text_highlight)), i, i2, 33);
        } else {
            spannable.setSpan(new BackgroundColorSpan(C02160Ac.A00(context, R.color.conversation_search_highlight)), i, i2, 33);
            spannable.setSpan(new ForegroundColorSpan(C02160Ac.A00(context, R.color.conversation_search_highlight_text)), i, i2, 33);
        }
    }
}
