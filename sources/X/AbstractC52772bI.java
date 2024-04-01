package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaTextView;
import com.whatsapp.conversationslist.ViewHolder;

/* renamed from: X.2bI */
/* loaded from: classes2.dex */
public abstract class AbstractC52772bI {
    public boolean A00 = false;
    public final Activity A01;
    public final Context A02;
    public final C02L A03;
    public final C01B A04;
    public final C0LM A05;
    public final C06K A06;
    public final C40261rr A07;
    public final C05W A08;
    public final C018708s A09;
    public final C29a A0A;
    public final C52782bL A0B;
    public final ViewHolder A0C;
    public final AnonymousClass012 A0D;
    public final C001200o A0E;
    public final C002301c A0F;
    public final C0GK A0G;
    public final C02980Dr A0H;
    public final C03750Gx A0I;
    public final AbstractC54772jK A0J;

    public AbstractC52772bI(ViewHolder viewHolder, Context context, Activity activity, C52782bL c52782bL, AnonymousClass012 anonymousClass012, C02980Dr c02980Dr, C02L c02l, C001200o c001200o, C01B c01b, C03750Gx c03750Gx, C05W c05w, C0GK c0gk, C018708s c018708s, C002301c c002301c, AbstractC54772jK abstractC54772jK, C40261rr c40261rr, C06K c06k, C0LM c0lm, C29a c29a) {
        this.A0C = viewHolder;
        this.A02 = context;
        this.A01 = activity;
        this.A0B = c52782bL;
        this.A0D = anonymousClass012;
        this.A0H = c02980Dr;
        this.A03 = c02l;
        this.A0E = c001200o;
        this.A04 = c01b;
        this.A0I = c03750Gx;
        this.A08 = c05w;
        this.A0G = c0gk;
        this.A09 = c018708s;
        this.A0F = c002301c;
        this.A0J = abstractC54772jK;
        this.A07 = c40261rr;
        this.A06 = c06k;
        this.A05 = c0lm;
        this.A0A = c29a;
    }

    public static String A00(C52782bL c52782bL, C09C c09c) {
        int ADw = c09c.ADw();
        if (ADw == 0) {
            return c09c instanceof C09D ? c52782bL.A07 : c52782bL.A0C;
        } else if (ADw != 1) {
            if (ADw == 2) {
                return c52782bL.A0D;
            }
            throw new IllegalStateException("unhandled view once state");
        } else {
            return c52782bL.A0E;
        }
    }

    public static void A01(Context context, ImageView imageView, C09C c09c) {
        if (c09c.ADw() == 1) {
            imageView.setImageDrawable(C02180Ae.A0O(context, R.drawable.msg_status_ephemeral_ring, R.color.msgStatusTint));
        } else {
            imageView.setImageDrawable(C02180Ae.A0O(context, R.drawable.msg_status_viewonce_one, R.color.msgStatusTint));
            imageView.setBackground(C02180Ae.A0O(context, R.drawable.msg_status_ephemeral_ring, R.color.msgStatusTint));
        }
        imageView.setVisibility(0);
    }

    public void A02() {
        if (this instanceof C54992jh) {
            C54992jh c54992jh = (C54992jh) this;
            ((AbstractC52772bI) c54992jh).A00 = true;
            C55032jl c55032jl = c54992jh.A00;
            if (c55032jl != null) {
                ((AbstractCallableC55022jk) c55032jl).A00.A01();
            }
        } else if (!(this instanceof C54972jf)) {
            this.A00 = true;
        } else {
            C54972jf c54972jf = (C54972jf) this;
            ((AbstractC52772bI) c54972jf).A00 = true;
            C55012jj c55012jj = c54972jf.A00;
            if (c55012jj != null) {
                ((AbstractCallableC55022jk) c55012jj).A00.A01();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x019a, code lost:
        if (r5 != null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(X.InterfaceC52462al r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC52772bI.A03(X.2al, boolean):void");
    }

    public final void A04(AnonymousClass092 anonymousClass092) {
        Context context;
        AnonymousClass093 anonymousClass093 = anonymousClass092.A0F;
        if (anonymousClass093 != null && (context = this.A02) != null) {
            CharSequence A03 = C03750Gx.A03(context, anonymousClass093);
            if (TextUtils.isEmpty(A03)) {
                return;
            }
            int color = context.getResources().getColor(C03750Gx.A00(anonymousClass092.A0F));
            WaTextView waTextView = this.A0C.A0N;
            waTextView.setVisibility(0);
            waTextView.setTextColor(color);
            waTextView.setText(A03);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:320:0x00be, code lost:
        if (r22.A08 == 6) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:349:0x01a4  */
    /* JADX WARN: Type inference failed for: r0v191, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v192 */
    /* JADX WARN: Type inference failed for: r0v197, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r0v198 */
    /* JADX WARN: Type inference failed for: r0v199 */
    /* JADX WARN: Type inference failed for: r0v200 */
    /* JADX WARN: Type inference failed for: r0v201 */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.0Dr] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(X.AnonymousClass092 r22, X.C06C r23, X.C06C r24) {
        /*
            Method dump skipped, instructions count: 1860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC52772bI.A05(X.092, X.06C, X.06C):void");
    }
}
