package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaButton;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Iu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC68263Iu extends AnonymousClass337 {
    public final View A00;
    public final WaButton A01;
    public final WaTextView A02;
    public final WaTextView A03;
    public final C2S0 A04;
    public final C002301c A05;

    public AbstractC68263Iu(C018508q c018508q, C02L c02l, C018308n c018308n, C002301c c002301c, C05W c05w, AnonymousClass272 anonymousClass272, UserJid userJid, View view, C2S0 c2s0) {
        super(c02l, c018308n, c05w, view);
        this.A05 = c002301c;
        this.A04 = c2s0;
        this.A00 = C0AT.A0D(view, R.id.collection_divider);
        this.A01 = (WaButton) C0AT.A0D(view, R.id.button_collection_see_all);
        this.A03 = (WaTextView) C0AT.A0D(view, R.id.textview_collection_title);
        this.A02 = (WaTextView) C0AT.A0D(view, R.id.textview_collection_subtitle);
        this.A01.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1(this, userJid, 1));
    }
}
