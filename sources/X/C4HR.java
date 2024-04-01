package X;

import android.content.Context;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.text.ReadMoreTextView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4HR  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4HR extends AbstractC91274Eh {
    public ReadMoreTextView A00;
    public final C018508q A01;
    public final C03230Ew A02;
    public final C58712ra A03;
    public final C02E A04;
    public final C000500h A05;
    public final C02980Dr A06;

    public C4HR(C018508q c018508q, C02980Dr c02980Dr, C03230Ew c03230Ew, C02E c02e, C000500h c000500h, C0DV c0dv, C0DW c0dw, View view) {
        super(view);
        this.A01 = c018508q;
        this.A06 = c02980Dr;
        this.A02 = c03230Ew;
        this.A04 = c02e;
        this.A05 = c000500h;
        this.A00 = (ReadMoreTextView) C0AT.A0D(view, R.id.payment_note_text);
        this.A03 = new C58712ra(this.A01, this.A05, c0dv, c0dw);
    }

    public /* synthetic */ void A0C(Spannable spannable) {
        A0D(spannable, this.A00, false);
    }

    public final void A0D(Spannable spannable, TextEmojiLabel textEmojiLabel, boolean z) {
        int i;
        Context context = textEmojiLabel.getContext();
        ArrayList A0x = AnonymousClass029.A0x(spannable);
        if (A0x == null || A0x.isEmpty()) {
            i = 0;
        } else {
            Iterator it = A0x.iterator();
            i = 0;
            while (it.hasNext()) {
                URLSpan uRLSpan = (URLSpan) it.next();
                spannable.setSpan(new C02740Cr(context, this.A01, this.A04, this.A02, uRLSpan.getURL()), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), spannable.getSpanFlags(uRLSpan));
                i++;
            }
            Iterator it2 = A0x.iterator();
            while (it2.hasNext()) {
                spannable.removeSpan(it2.next());
            }
        }
        AbstractC02790Cw abstractC02790Cw = textEmojiLabel.A06;
        if (i > 0) {
            if (abstractC02790Cw == null) {
                textEmojiLabel.setAccessibilityHelper(new C02780Cv(this.A04, textEmojiLabel));
            }
        } else {
            if (abstractC02790Cw != null) {
                textEmojiLabel.setFocusable(false);
                C0AT.A0V(textEmojiLabel, 0);
            }
            textEmojiLabel.setAccessibilityHelper(null);
            if (!z) {
                return;
            }
        }
        textEmojiLabel.A06(spannable, null, false, 0);
    }
}
