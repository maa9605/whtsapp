package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.ViewOnClickCListenerShape9S0100000_I0_1;

/* renamed from: X.2JE */
/* loaded from: classes2.dex */
public abstract class C2JE extends C2JF {
    public C03230Ew A00;
    public C58932rw A01;
    public C02F A02;
    public C0WZ A03;
    public C41771uU A04;
    public C42451vl A05;
    public C2K4 A06;
    public C42471vn A07;
    public boolean A08;
    public final AbstractView$OnClickListenerC49532Ky A09;
    public final AbstractView$OnClickListenerC49532Ky A0A;
    public final AbstractView$OnClickListenerC49532Ky A0B;
    public final AbstractView$OnClickListenerC49532Ky A0C;

    public ViewGroup getExternalAdContentHolder() {
        return null;
    }

    public C2JE(Context context, AnonymousClass097 anonymousClass097) {
        super(context, anonymousClass097);
        this.A0A = new ViewOnClickCListenerShape9S0100000_I0_1(this, 4);
        this.A0B = new ViewOnClickCListenerShape9S0100000_I0_1(this, 5);
        this.A09 = new ViewOnClickCListenerShape9S0100000_I0_1(this, 6);
        this.A0C = new ViewOnClickCListenerShape9S0100000_I0_1(this, 7);
    }

    public static int A01(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static String A02(AnonymousClass092 anonymousClass092) {
        StringBuilder A0P = C000200d.A0P("date-transition-");
        A0P.append(anonymousClass092.A0n);
        return A0P.toString();
    }

    public static String A07(AnonymousClass092 anonymousClass092) {
        StringBuilder A0P = C000200d.A0P("status-transition-");
        A0P.append(anonymousClass092.A0n);
        return A0P.toString();
    }

    public static String A08(AnonymousClass092 anonymousClass092) {
        return C000200d.A0H("thumb-transition-", anonymousClass092.A0n.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0110, code lost:
        if (r22 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A09(boolean r21, boolean r22, boolean r23, android.view.View r24, android.view.View r25, android.widget.ImageView r26, android.view.View r27) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2JE.A09(boolean, boolean, boolean, android.view.View, android.view.View, android.widget.ImageView, android.view.View):void");
    }

    public int A0j(ProgressBar progressBar, AnonymousClass097 anonymousClass097) {
        C41771uU c41771uU = this.A04;
        if (c41771uU != null) {
            return C23X.A02(c41771uU, progressBar, anonymousClass097);
        }
        throw null;
    }

    public void A0k(View view, TextEmojiLabel textEmojiLabel) {
        if (textEmojiLabel == null) {
            return;
        }
        AnonymousClass097 fMessage = getFMessage();
        Resources resources = getResources();
        if (!TextUtils.isEmpty(fMessage.A1A())) {
            textEmojiLabel.setVisibility(0);
            A0a(fMessage.A1A(), textEmojiLabel, fMessage, true);
            this.A1E.setTextColor(C02160Ac.A00(getContext(), R.color.conversation_row_date));
            this.A1C.setPadding(resources.getDimensionPixelSize(R.dimen.conversation_image_date_padding_right), 0, resources.getDimensionPixelSize(R.dimen.conversation_image_date_padding_right), resources.getDimensionPixelSize(R.dimen.conversation_image_date_padding_bottom));
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = 0;
            return;
        }
        textEmojiLabel.setVisibility(8);
        this.A1E.setTextColor(C02160Ac.A00(getContext(), R.color.conversation_row_image_text));
        ViewGroup viewGroup = this.A1C;
        viewGroup.setPadding(resources.getDimensionPixelSize(R.dimen.conversation_image_date_padding_right_on_media), 0, resources.getDimensionPixelSize(R.dimen.conversation_image_date_padding_right_on_media), 0);
        viewGroup.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = (-viewGroup.getMeasuredHeight()) - getResources().getDimensionPixelSize(R.dimen.conversation_image_date_padding_bottom_on_media);
    }

    public void A0l(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092.A0H != null) {
            ViewGroup externalAdContentHolder = getExternalAdContentHolder();
            if (externalAdContentHolder != null) {
                C3TK A00 = C3TK.A00(anonymousClass092);
                externalAdContentHolder.setVisibility(0);
                if (this.A01 == null) {
                    C58932rw c58932rw = new C58932rw(getContext(), this.A00, this.A03, this.A07, A0F());
                    this.A01 = c58932rw;
                    externalAdContentHolder.addView(c58932rw.A0A, -1, -2);
                    this.A01.A0A.setOnLongClickListener(this.A19);
                }
                boolean A0i = A0i(A00.A03);
                this.A08 = A0i;
                this.A01.A01(anonymousClass092, A0i, this, A00);
                return;
            }
            return;
        }
        ViewGroup externalAdContentHolder2 = getExternalAdContentHolder();
        if (externalAdContentHolder2 == null) {
            return;
        }
        C58932rw c58932rw2 = this.A01;
        if (c58932rw2 != null) {
            externalAdContentHolder2.removeView(c58932rw2.A0A);
            this.A01 = null;
        }
        externalAdContentHolder2.setVisibility(8);
    }

    public boolean A0m() {
        C09H c09h;
        AnonymousClass097 fMessage = getFMessage();
        C42471vn c42471vn = this.A07;
        if (!fMessage.A0n.A02 && (c09h = fMessage.A02) != null) {
            c09h.A0X = true;
            c42471vn.A08(fMessage);
            A0I();
            return true;
        }
        return false;
    }

    @Override // X.AbstractC48202Eh
    public AnonymousClass097 getFMessage() {
        return (AnonymousClass097) super.getFMessage();
    }

    public int getVideoOriginForFieldstats() {
        InterfaceC04690Ll rowsContainer = getRowsContainer();
        if (rowsContainer == null) {
            return 5;
        }
        int A95 = rowsContainer.A95();
        if (A95 != 0) {
            if (A95 != 1) {
                return A95 != 2 ? 5 : 1;
            }
            return 3;
        }
        return 1;
    }

    @Override // X.AbstractC48202Eh
    public void setFMessage(AnonymousClass092 anonymousClass092) {
        C000700j.A07(anonymousClass092 instanceof AnonymousClass097);
        super.setFMessage(anonymousClass092);
    }
}
