package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.3MG */
/* loaded from: classes2.dex */
public class C3MG extends C41Q {
    public C51802Yb A00;
    public boolean A01;

    public C3MG(Context context, AnonymousClass012 anonymousClass012, C02L c02l, C40081rY c40081rY, C52782bL c52782bL, C05W c05w, C02E c02e, C018708s c018708s, C002301c c002301c, C2AR c2ar, C52682b9 c52682b9, C02O c02o) {
        super(context, anonymousClass012, c02l, c40081rY, c52782bL, c05w, c02e, c018708s, c002301c, c2ar, c52682b9, c02o);
        A00();
    }

    @Override // X.AbstractC86853yY
    public void A04(C06C c06c, C06C c06c2, AnonymousClass092 anonymousClass092, List list) {
        C09G c09g = (C09G) anonymousClass092;
        super.A04(c06c, c06c2, c09g, list);
        setContentDescription(C23X.A0C(getContext(), c09g, this.A0E, this.A09, this.A0A, this.A0F));
    }

    @Override // X.AbstractC86853yY
    public void A05(AnonymousClass092 anonymousClass092, List list) {
        C09G c09g = (C09G) anonymousClass092;
        super.A05(c09g, list);
        this.A00.setAudioMessage(c09g);
    }

    public void A08(C09G c09g, List list) {
        super.A05(c09g, list);
        this.A00.setAudioMessage(c09g);
    }
}
