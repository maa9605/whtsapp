package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.util.List;
import java.util.Locale;

/* renamed from: X.2x7 */
/* loaded from: classes2.dex */
public class C61972x7 extends AbstractC69103Nd {
    public C69123Nf A00;
    public final C018308n A01;
    public final AbstractC000600i A02;
    public final C018508q A03;
    public final C01B A04;
    public final C02F A05;
    public final C40421sE A06;
    public final C42461vm A07;
    public final InterfaceC002901k A08;

    public C61972x7(Context context, AnonymousClass012 anonymousClass012, C42461vm c42461vm, C018508q c018508q, AbstractC000600i abstractC000600i, C02L c02l, InterfaceC002901k interfaceC002901k, C40081rY c40081rY, C01B c01b, C52782bL c52782bL, C018308n c018308n, C05W c05w, C02E c02e, C018708s c018708s, C002301c c002301c, C2AR c2ar, C40421sE c40421sE, C02F c02f, C52682b9 c52682b9, C02O c02o) {
        super(context, anonymousClass012, c02l, c40081rY, c52782bL, c05w, c02e, c018708s, c002301c, c2ar, c52682b9, c02o);
        this.A07 = c42461vm;
        this.A03 = c018508q;
        this.A02 = abstractC000600i;
        this.A08 = interfaceC002901k;
        this.A04 = c01b;
        this.A01 = c018308n;
        this.A06 = c40421sE;
        this.A05 = c02f;
    }

    @Override // X.AbstractC86853yY
    /* renamed from: A08 */
    public void A05(C09E c09e, List list) {
        String string;
        super.A05(c09e, list);
        C69123Nf c69123Nf = this.A00;
        if (c69123Nf != null) {
            if (!TextUtils.isEmpty(c09e.A1B())) {
                string = c09e.A1B();
            } else {
                string = c69123Nf.getContext().getString(R.string.untitled_document);
            }
            C002301c c002301c = c69123Nf.A02;
            String A0k = C02180Ae.A0k(c002301c, ((AnonymousClass097) c09e).A01);
            String upperCase = C41961un.A0T(((AnonymousClass097) c09e).A07).toUpperCase(Locale.US);
            if (TextUtils.isEmpty(upperCase) && !TextUtils.isEmpty(c09e.A1B())) {
                upperCase = AnonymousClass024.A0G(c09e.A1B()).toUpperCase(Locale.US);
            }
            c69123Nf.A01.setTitleAndDescription(string, null, list);
            if (c002301c.A0M()) {
                c69123Nf.A01.setSubText(c69123Nf.getContext().getString(R.string.file_attachment_size_and_ext, A0k, upperCase), null);
            } else {
                c69123Nf.A01.setSubText(c69123Nf.getContext().getString(R.string.file_attachment_size_and_ext, upperCase, A0k), null);
            }
            c69123Nf.A00.setImageDrawable(C460324r.A03(c69123Nf.getContext(), c09e));
            this.A00.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, c09e, 14));
            return;
        }
        throw null;
    }

    public Drawable getMessageIcon() {
        return C02180Ae.A0O(getContext(), R.drawable.msg_status_doc, R.color.msgStatusTint);
    }

    public CharSequence getRawMessageText() {
        return this.A0C.A02;
    }
}
