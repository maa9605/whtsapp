package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.0Cr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C02740Cr extends AbstractC02750Cs {
    public InterfaceC26801Ks A00;
    public Runnable A01;
    public boolean A02;
    public final C08o A03;
    public final C018508q A04;
    public final C02E A05;
    public final String A06;

    public C02740Cr(Context context, C018508q c018508q, C02E c02e, C08o c08o, String str) {
        super(context, R.color.link_color);
        this.A04 = c018508q;
        this.A05 = c02e;
        this.A03 = c08o;
        this.A06 = str;
    }

    @Override // X.AbstractC02750Cs, X.InterfaceC02760Ct
    public void APh(final View view, MotionEvent motionEvent) {
        super.APh(view, motionEvent);
        if (super.A04) {
            final Uri parse = Uri.parse(this.A06);
            final String scheme = parse.getScheme();
            if ("http".equals(scheme) || "https".equals(scheme) || "rtsp".equals(scheme) || "ftp".equals(scheme) || "tel".equals(scheme) || "wapay".equals(scheme)) {
                Runnable runnable = this.A01;
                if (runnable == null) {
                    runnable = new Runnable() { // from class: X.1HX
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str;
                            int i;
                            C02740Cr c02740Cr = C02740Cr.this;
                            String str2 = scheme;
                            Uri uri = parse;
                            View view2 = view;
                            ClipboardManager A06 = c02740Cr.A05.A06();
                            if (A06 != null) {
                                try {
                                    if ("wapay".equals(str2)) {
                                        str = uri.getLastPathSegment();
                                        i = R.string.payment_id_copied;
                                    } else if ("tel".equals(str2)) {
                                        str = uri.getSchemeSpecificPart();
                                        i = R.string.phone_copied;
                                    } else {
                                        str = c02740Cr.A06;
                                        i = R.string.link_copied;
                                    }
                                    A06.setPrimaryClip(ClipData.newPlainText(str, str));
                                    ((AbstractC02750Cs) c02740Cr).A04 = false;
                                    view2.invalidate();
                                    c02740Cr.A04.A07(i, 0);
                                } catch (NullPointerException e) {
                                    Log.e("linktouchablespan/copy/npe", e);
                                }
                            }
                        }
                    };
                    this.A01 = runnable;
                }
                C018508q c018508q = this.A04;
                c018508q.A02.postDelayed(runnable, ViewConfiguration.getLongPressTimeout());
                return;
            }
            return;
        }
        Runnable runnable2 = this.A01;
        if (runnable2 == null) {
            return;
        }
        this.A04.A02.removeCallbacks(runnable2);
    }

    @Override // X.InterfaceC02760Ct
    public void onClick(View view) {
        this.A03.AS7(view.getContext(), Uri.parse(this.A06));
        InterfaceC26801Ks interfaceC26801Ks = this.A00;
        if (interfaceC26801Ks != null) {
            interfaceC26801Ks.A6E();
        }
    }

    @Override // X.AbstractC02750Cs, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.A02);
    }
}
