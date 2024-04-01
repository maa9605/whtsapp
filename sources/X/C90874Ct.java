package X;

import android.widget.ImageView;
import com.whatsapp.util.Log;

/* renamed from: X.4Ct  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C90874Ct {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C0N2 A01;
    public final /* synthetic */ C92224Ib A02;
    public final /* synthetic */ C49G A03;

    public C90874Ct(C49G c49g, C0N2 c0n2, C92224Ib c92224Ib, ImageView imageView) {
        this.A03 = c49g;
        this.A01 = c0n2;
        this.A02 = c92224Ib;
        this.A00 = imageView;
    }

    public static void A00(String str, C28Q c28q) {
        StringBuilder sb = new StringBuilder("PAY: fetchCardArtImageContentDetails Couldn't get card art for: ");
        sb.append(str);
        sb.append(" with error: ");
        sb.append(c28q);
        Log.w(sb.toString());
    }
}
