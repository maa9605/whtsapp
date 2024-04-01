package X;

import android.content.Context;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.3Na */
/* loaded from: classes2.dex */
public class C69073Na extends C41V {
    public boolean A00;

    public C69073Na(Context context, AnonymousClass012 anonymousClass012, C02L c02l, C40081rY c40081rY, C52782bL c52782bL, C05W c05w, C02E c02e, C018708s c018708s, C002301c c002301c, C2AR c2ar, C52682b9 c52682b9, C02O c02o) {
        super(context, anonymousClass012, c02l, c40081rY, c52782bL, c05w, c02e, c018708s, c002301c, c2ar, c52682b9, c02o);
        A00();
        setId(R.id.gif_row);
    }

    @Override // X.AbstractC86853yY
    public void A05(AnonymousClass092 anonymousClass092, List list) {
        AnonymousClass097 anonymousClass097 = (AnonymousClass097) anonymousClass092;
        super.A05(anonymousClass097, list);
        ((C41V) this).A00.setMessage(anonymousClass097);
    }

    @Override // X.C41V
    public String getDefaultMessageText() {
        return this.A0C.A03;
    }

    @Override // X.C41V
    public int getDrawableRes() {
        return R.drawable.msg_status_gif;
    }

    @Override // X.C41V
    public int getIconSizeIncrease() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.search_gif_icon_label_size_increase);
    }
}
