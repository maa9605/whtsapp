package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.2xA */
/* loaded from: classes2.dex */
public class C61992xA extends AbstractC69113Ne {
    public C3VW A00;
    public final C018508q A01;
    public final C0L7 A02;
    public final C0Zn A03;
    public final C23K A04;

    public C61992xA(Context context, AnonymousClass012 anonymousClass012, C018508q c018508q, C02L c02l, C40081rY c40081rY, C52782bL c52782bL, C0L7 c0l7, C05W c05w, C02E c02e, C018708s c018708s, C002301c c002301c, C2AR c2ar, C23K c23k, C0Zn c0Zn, C52682b9 c52682b9, C02O c02o) {
        super(context, anonymousClass012, c02l, c40081rY, c52782bL, c05w, c02e, c018708s, c002301c, c2ar, c52682b9, c02o);
        this.A01 = c018508q;
        this.A02 = c0l7;
        this.A03 = c0Zn;
        this.A04 = c23k;
        A01();
    }

    public void A08(C0D8 c0d8, List list) {
        super.A05(c0d8, list);
        C3VW c3vw = this.A00;
        C002301c c002301c = c3vw.A0D;
        FrameLayout frameLayout = c3vw.A04;
        int i = c3vw.A01;
        C0LX.A07(c002301c, frameLayout, i, i, i, i);
        c3vw.A0B.A05(c3vw.A06, R.drawable.avatar_contact);
        c3vw.A05.setVisibility(8);
        String A0i = C02180Ae.A0i(c3vw.getContext(), c0d8);
        if (A0i == null) {
            A0i = "";
        }
        c3vw.A07.setTitleAndDescription(AnonymousClass024.A0K(A0i, 128), null, list);
        c3vw.A03(c0d8, list);
    }

    public void A09(C0DA c0da, List list) {
        super.A05(c0da, list);
        C3VW c3vw = this.A00;
        int i = c3vw.A01;
        int i2 = ((i << 1) - c3vw.A03) >> 1;
        C0LX.A07(c3vw.A0D, c3vw.A04, i2, i, i2, i);
        C0L7 c0l7 = c3vw.A0B;
        c0l7.A05(c3vw.A06, R.drawable.avatar_contact);
        c0l7.A05(c3vw.A05, R.drawable.avatar_contact);
        c3vw.A05.setVisibility(0);
        c3vw.A06.setVisibility(0);
        c3vw.A03(c0da, list);
    }
}
