package X;

import android.app.Application;
import com.google.android.search.verification.client.R;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Iw */
/* loaded from: classes2.dex */
public class C68283Iw extends C0QY {
    public final C002301c A00;

    public C68283Iw(Application application, C002301c c002301c) {
        super(application);
        this.A00 = c002301c;
    }

    public String A02(List list) {
        BigDecimal bigDecimal = new BigDecimal(0);
        Iterator it = list.iterator();
        C09R c09r = null;
        while (it.hasNext()) {
            C56322n5 c56322n5 = (C56322n5) it.next();
            BigDecimal bigDecimal2 = c56322n5.A05;
            if (bigDecimal2 != null && (c09r = c56322n5.A02) != null) {
                bigDecimal = bigDecimal.add(bigDecimal2.multiply(new BigDecimal(c56322n5.A00)));
            } else {
                return ((C0QY) this).A00.getString(R.string.ask_for_total);
            }
        }
        return c09r == null ? "" : ((C0QY) this).A00.getString(R.string.estimated, c09r.A03(this.A00, bigDecimal, true));
    }
}
