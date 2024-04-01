package X;

import android.text.Spannable;
import android.text.style.URLSpan;
import android.widget.TextView;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: X.2ra */
/* loaded from: classes2.dex */
public class C58712ra {
    public C58692rY A00;
    public final C018508q A02;
    public final C000500h A04;
    public final C0DW A05;
    public final C0DV A06;
    public final C58682rX A03 = new C58682rX();
    public final C06F A01 = new C06F(32);

    public C58712ra(C018508q c018508q, C000500h c000500h, C0DV c0dv, C0DW c0dw) {
        this.A02 = c018508q;
        this.A04 = c000500h;
        this.A06 = c0dv;
        this.A05 = c0dw;
    }

    public void A00(CharSequence charSequence, TextView textView, Object obj, InterfaceC58672rW interfaceC58672rW) {
        textView.setTag(obj);
        Spannable spannable = (Spannable) this.A01.A04(charSequence.toString());
        if (spannable != null) {
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
            Spannable spannable2 = (Spannable) charSequence;
            if (uRLSpanArr != null) {
                for (URLSpan uRLSpan : uRLSpanArr) {
                    spannable2.setSpan(new URLSpan(uRLSpan.getURL()), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), spannable.getSpanFlags(uRLSpan));
                }
            }
            interfaceC58672rW.ARW(spannable2);
            return;
        }
        C58682rX c58682rX = this.A03;
        LinkedBlockingDeque linkedBlockingDeque = c58682rX.A00;
        Iterator it = linkedBlockingDeque.iterator();
        while (it.hasNext()) {
            C58702rZ c58702rZ = (C58702rZ) it.next();
            if (c58702rZ.A00 == textView) {
                linkedBlockingDeque.remove(c58702rZ);
            }
        }
        linkedBlockingDeque.add(new C58702rZ(charSequence, textView, obj, interfaceC58672rW));
        if (this.A00 == null) {
            C58692rY c58692rY = new C58692rY(this, c58682rX, this.A04.A0H(), this.A06, this.A05);
            this.A00 = c58692rY;
            c58692rY.start();
        }
    }
}
