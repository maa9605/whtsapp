package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.emoji.EmojiDescriptor;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3yY */
/* loaded from: classes2.dex */
public abstract class AbstractC86853yY extends AbstractC86063wn {
    public C0FK A00;
    public TextEmojiLabel A01;
    public C54952jd A02;
    public C55082jq A03;
    public C55032jl A04;
    public CharSequence A05;
    public final int A06;
    public final int A07;
    public final C02L A08;
    public final C05W A09;
    public final C018708s A0A;
    public final C52682b9 A0B;
    public final C52782bL A0C;
    public final C02E A0D;
    public final AnonymousClass012 A0E;
    public final C002301c A0F;
    public final C40081rY A0G;
    public final C02O A0H;
    public final C2AR A0I;

    public abstract CharSequence A02(AnonymousClass092 anonymousClass092, C06C c06c);

    public AbstractC86853yY(Context context, AnonymousClass012 anonymousClass012, C02L c02l, C40081rY c40081rY, C52782bL c52782bL, C05W c05w, C02E c02e, C018708s c018708s, C002301c c002301c, C2AR c2ar, C52682b9 c52682b9, C02O c02o) {
        super(context);
        boolean z;
        this.A0E = anonymousClass012;
        this.A08 = c02l;
        this.A0G = c40081rY;
        this.A0C = c52782bL;
        this.A09 = c05w;
        this.A0D = c02e;
        this.A0A = c018708s;
        this.A0F = c002301c;
        this.A0I = c2ar;
        this.A0B = c52682b9;
        this.A0H = c02o;
        this.A06 = C02160Ac.A00(context, R.color.list_item_sub_title);
        this.A07 = C02160Ac.A00(context, R.color.list_item_title);
        if (this instanceof C61962x6) {
            z = true;
        } else {
            z = this instanceof C61992xA;
        }
        if (z) {
            return;
        }
        A01();
    }

    public CharSequence A03(AnonymousClass092 anonymousClass092, List list) {
        String str;
        if (!(this instanceof C3NY)) {
            if (!(this instanceof C41V)) {
                if (((C41Q) this) instanceof C61962x6) {
                    C0KD c0kd = (C0KD) anonymousClass092;
                    return (!(c0kd instanceof C0KC) || (str = ((C0KC) c0kd).A03) == null) ? "" : str;
                }
                return "";
            }
            C41V c41v = (C41V) this;
            AnonymousClass097 anonymousClass097 = (AnonymousClass097) anonymousClass092;
            String A0Q = C40731sm.A0Q(anonymousClass097);
            if (!TextUtils.isEmpty(A0Q) || ((A0Q = anonymousClass097.A1A()) != null && !C40731sm.A0n(anonymousClass097))) {
                return A0Q;
            }
            return c41v.getDefaultMessageText();
        }
        C0JJ c0jj = (C0JJ) anonymousClass092;
        if (!(((C3NY) this) instanceof C61952x4)) {
            if (c0jj.A0D().A00 == null) {
                return c0jj.A19() != null ? c0jj.A19() : "";
            }
            C05530Pc c05530Pc = c0jj.A0D().A00;
            String str2 = TextUtils.isEmpty(c05530Pc.A00) ? "" : c05530Pc.A00;
            if (!TextUtils.isEmpty(c0jj.A0G())) {
                StringBuilder A0P = C000200d.A0P("*");
                A0P.append(c0jj.A0G());
                A0P.append("*");
                A0P.append("\n");
                A0P.append("\n");
                A0P.append(str2);
                return A0P.toString();
            }
            return str2;
        }
        String A19 = c0jj.A19() == null ? "" : c0jj.A19();
        if (list == null || "".equals(A19)) {
            return A19;
        }
        String str3 = C3TK.A00(c0jj).A02;
        if (str3 == null) {
            str3 = "";
        }
        if (str3.isEmpty() || !A19.contains(str3)) {
            return A19;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (str3.contains((String) it.next())) {
                int indexOf = A19.indexOf(str3);
                if (indexOf == 0 || indexOf == A19.length() - str3.length()) {
                    String[] strArr = {c0jj.A04, c0jj.A02, C58952ry.A00(str3)};
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        String str4 = (String) it2.next();
                        int i = 0;
                        do {
                            String str5 = strArr[i];
                            if (str5 != null && str5.contains(str4)) {
                                return A19.replace(str3, "");
                            }
                            i++;
                        } while (i < 3);
                    }
                    return A19;
                }
                return A19;
            }
        }
        return A19;
    }

    public void A04(C06C c06c, C06C c06c2, AnonymousClass092 anonymousClass092, List list) {
        C0FK c0fk;
        this.A00 = new C0FK(Boolean.TRUE, c06c2);
        this.A02.A01(c06c, list, AbstractC54772jK.A02);
        this.A02.A01.A02(c06c);
        setTitleColorBasedOnQuery(list);
        if (!(this instanceof C41V)) {
            C002301c c002301c = this.A0F;
            AnonymousClass012 anonymousClass012 = this.A0E;
            c0fk = new C0FK(AnonymousClass029.A0n(c002301c, anonymousClass012.A06(anonymousClass092.A0E), false), AnonymousClass029.A0n(c002301c, anonymousClass012.A06(anonymousClass092.A0E), true));
        } else {
            c0fk = null;
        }
        if (c0fk != null) {
            C54952jd c54952jd = this.A02;
            c54952jd.A00.A01.setText((CharSequence) c0fk.A00);
            c54952jd.A00.A01.setContentDescription((CharSequence) c0fk.A01);
            this.A02.A00.A01.setVisibility(0);
        } else {
            this.A02.A00.A01.setVisibility(8);
        }
        A06(anonymousClass092, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x002e, code lost:
        if (r1 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(final X.AnonymousClass092 r7, final java.util.List r8) {
        /*
            r6 = this;
            X.2jl r0 = r6.A04
            if (r0 == 0) goto L9
            X.0HE r0 = r0.A00
            r0.A01()
        L9:
            X.2jq r0 = r6.A03
            if (r0 == 0) goto L12
            X.0HE r0 = r0.A00
            r0.A01()
        L12:
            r6.setTitleColorBasedOnQuery(r8)
            X.05W r4 = r6.A09
            X.094 r0 = r7.A0n
            X.02j r0 = r0.A00
            if (r0 == 0) goto L6c
            X.06C r3 = r4.A07(r0)
            r2 = 0
            if (r3 == 0) goto L30
            X.02j r0 = X.C23X.A07(r7, r3)
            if (r0 == 0) goto L60
            X.06C r1 = r4.A07(r0)
            if (r1 != 0) goto L61
        L30:
            X.2jd r0 = r6.A02
            r0.A00()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            X.0FK r0 = new X.0FK
            r0.<init>(r1, r2)
            r6.A00 = r0
            X.2jl r5 = new X.2jl
            r5.<init>(r4, r7)
            r6.A04 = r5
            X.2b9 r4 = r6.A0B
            X.3o6 r3 = new X.3o6
            r3.<init>()
            java.util.concurrent.Executor r2 = r4.A01
            r1 = 8
            java.lang.RunnableEBaseShape0S0300000_I0_0 r0 = new java.lang.RunnableEBaseShape0S0300000_I0_0
            r0.<init>(r4, r5, r3, r1)
            r2.execute(r0)
            java.lang.CharSequence r0 = r6.A03(r7, r8)
            r6.A07(r7, r8, r0)
            return
        L60:
            r1 = r2
        L61:
            java.lang.CharSequence r0 = r6.A03(r7, r8)
            r6.A04(r3, r1, r7, r8)
            r6.A07(r7, r8, r0)
            return
        L6c:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC86853yY.A05(X.092, java.util.List):void");
    }

    public final void A06(AnonymousClass092 anonymousClass092, List list) {
        C0FK c0fk = this.A00;
        if (c0fk != null && Boolean.TRUE.equals(c0fk.A00) && this.A05 != null) {
            CharSequence A0A = C23X.A0A(AbstractC54772jK.A01(getContext(), A02(anonymousClass092, (C06C) c0fk.A01), list, this.A0F), this.A05);
            this.A01.setPlaceholder(0);
            if (TextUtils.isEmpty(A0A)) {
                this.A01.setVisibility(8);
                return;
            }
            this.A01.setVisibility(0);
            this.A01.A03(A0A);
        }
    }

    public final void A07(final AnonymousClass092 anonymousClass092, final List list, CharSequence charSequence) {
        this.A03 = new C55082jq(getContext(), this.A01.getPaint(), ((View) this.A01.getParent()).getMeasuredWidth(), charSequence, list, this.A0G, this.A0D, this.A0F, this.A0H);
        InterfaceC55052jn interfaceC55052jn = new InterfaceC55052jn() { // from class: X.3o7
            {
                AbstractC86853yY.this = this;
            }

            @Override // X.InterfaceC55052jn
            public final void AIn(Object obj) {
                AbstractC86853yY abstractC86853yY = AbstractC86853yY.this;
                AnonymousClass092 anonymousClass0922 = anonymousClass092;
                List list2 = list;
                abstractC86853yY.A05 = (CharSequence) obj;
                abstractC86853yY.A06(anonymousClass0922, list2);
            }
        };
        if (charSequence.length() <= 768) {
            C43931yF c43931yF = new C43931yF(charSequence);
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                c43931yF.A00 = i;
                int descriptor = EmojiDescriptor.getDescriptor(c43931yF);
                int A02 = c43931yF.A02(i, descriptor);
                if (descriptor == -1) {
                    i += A02;
                }
            }
            C52682b9 c52682b9 = this.A0B;
            C55082jq c55082jq = this.A03;
            if (c52682b9 != null) {
                try {
                    interfaceC55052jn.AIn(c55082jq.call());
                    return;
                } catch (C0S2 unused) {
                    return;
                }
            }
            throw null;
        }
        this.A01.setPlaceholder(80);
        C52682b9 c52682b92 = this.A0B;
        c52682b92.A01.execute(new RunnableEBaseShape0S0300000_I0_0(c52682b92, this.A03, interfaceC55052jn, 8));
    }

    public Paint getMessageViewPaint() {
        return this.A01.getPaint();
    }

    private void setTitleColorBasedOnQuery(List list) {
        if (list != null && !list.isEmpty()) {
            C54952jd c54952jd = this.A02;
            c54952jd.A00.A00.setTextColor(this.A06);
            return;
        }
        C54952jd c54952jd2 = this.A02;
        c54952jd2.A00.A00.setTextColor(this.A07);
    }
}
