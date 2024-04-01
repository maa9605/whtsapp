package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape1S1100000_I1;
import java.util.List;
import java.util.Set;

/* renamed from: X.2x4 */
/* loaded from: classes2.dex */
public class C61952x4 extends AbstractC62002xB {
    public C2YV A00;
    public final C0WZ A01;

    public C61952x4(Context context, AnonymousClass012 anonymousClass012, C02L c02l, C40081rY c40081rY, C52782bL c52782bL, C05W c05w, C02E c02e, C018708s c018708s, C002301c c002301c, C0WZ c0wz, C2AR c2ar, C52682b9 c52682b9, C02O c02o) {
        super(context, anonymousClass012, c02l, c40081rY, c52782bL, c05w, c02e, c018708s, c002301c, c2ar, c52682b9, c02o);
        this.A01 = c0wz;
    }

    @Override // X.AbstractC86853yY
    /* renamed from: A08 */
    public void A05(C0JJ c0jj, List list) {
        boolean z;
        Bitmap decodeByteArray;
        super.A05(c0jj, list);
        if (C55102js.A00(getContext(), c0jj, 0, this.A01).A00.A01 != null) {
            this.A00.setVisibility(0);
            C2YV c2yv = this.A00;
            C55102js A00 = C55102js.A00(c2yv.getContext(), c0jj, 0, c2yv.A04);
            C60892vG c60892vG = A00.A00;
            String str = c60892vG.A01;
            String str2 = A00.A03;
            if (str2 == null) {
                str2 = "";
            }
            Set set = c60892vG.A02;
            if (set != null) {
                c2yv.setOnClickListener(new View$OnClickListenerC71253Vk(c2yv, str, set));
                z = true;
            } else {
                c2yv.setOnClickListener(new ViewOnClickCListenerShape1S1100000_I1(c2yv, str, 0));
                z = false;
            }
            byte[] A1D = c0jj.A1D();
            if (A1D != null && (decodeByteArray = BitmapFactory.decodeByteArray(A1D, 0, A1D.length)) != null && !z) {
                c2yv.A02.setImageBitmap(decodeByteArray);
                c2yv.A02.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                c2yv.A02.setImageDrawable(C02180Ae.A0O(c2yv.getContext(), R.drawable.ic_group_invite_link, R.color.search_link_icon));
                c2yv.A02.setScaleType(ImageView.ScaleType.CENTER);
                c2yv.A02.setScaleX(1.5f);
                c2yv.A02.setScaleY(1.5f);
                c2yv.A02.setBackgroundColor(C02160Ac.A00(c2yv.getContext(), R.color.black_alpha_05));
            }
            c2yv.A05.setTitleAndDescription(str2, set == null ? A00.A02 : null, list);
            c2yv.A05.setSubText(c60892vG.A00, list);
            c2yv.A00.setVisibility(set == null ? 8 : 0);
            return;
        }
        this.A00.setVisibility(8);
    }
}
