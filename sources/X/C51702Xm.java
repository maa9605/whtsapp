package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.search.verification.client.R;

/* renamed from: X.2Xm  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C51702Xm extends AbstractC51712Xn {
    public Drawable A00;

    public C51702Xm(Context context) {
        super(context);
    }

    @Override // X.C51682Xk
    public void setMediaItem(InterfaceC52102a4 interfaceC52102a4) {
        super.setMediaItem(interfaceC52102a4);
        if (interfaceC52102a4 != null) {
            int type = interfaceC52102a4.getType();
            if (type == 1) {
                this.A00 = C02160Ac.A03(getContext(), R.drawable.mark_video);
                return;
            } else if (type != 2) {
                this.A00 = null;
                return;
            } else {
                this.A00 = C02160Ac.A03(getContext(), R.drawable.mark_gif);
                return;
            }
        }
        this.A00 = null;
    }
}
