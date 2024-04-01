package X;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.voipcalling.PeerAvatarLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3u6  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C84653u6 extends AbstractC04890Mh {
    public final List A00 = new ArrayList();
    public final /* synthetic */ PeerAvatarLayout A01;

    public C84653u6(PeerAvatarLayout peerAvatarLayout) {
        this.A01 = peerAvatarLayout;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A00.size();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        return new C84643u5(new C2Zf(this.A01.getContext()));
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        int max;
        C2Zf c2Zf = ((C84643u5) c0ts).A00;
        c2Zf.clearAnimation();
        int A00 = c2Zf.A00(A0C());
        ViewGroup.LayoutParams layoutParams = c2Zf.A03.getLayoutParams();
        layoutParams.height = A00;
        layoutParams.width = A00;
        c2Zf.A03.setLayoutParams(layoutParams);
        c2Zf.A03.A02 = (A00 + 1) >> 1;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        PeerAvatarLayout peerAvatarLayout = this.A01;
        View view = (View) peerAvatarLayout.getParent();
        if (i != 0) {
            int A0C = A0C();
            int width = view.getWidth();
            if (A0C <= 1) {
                max = 0;
            } else {
                int A002 = (c2Zf.A00 << 1) + c2Zf.A00(A0C);
                max = Math.max(A002 - ((width - A002) / (A0C - 1)), (int) (A002 * 0.4d));
            }
            int i2 = -max;
            if (peerAvatarLayout.A04.A0N()) {
                layoutParams2.rightMargin = i2;
            } else {
                layoutParams2.leftMargin = i2;
            }
        }
        c2Zf.setLayoutParams(layoutParams2);
        if (Build.VERSION.SDK_INT >= 21) {
            c2Zf.setElevation(peerAvatarLayout.A00 - (peerAvatarLayout.A01 * i));
            c2Zf.setElevation(peerAvatarLayout.A00 - (peerAvatarLayout.A01 * i));
        }
        peerAvatarLayout.A02.A04((C06C) this.A00.get(i), c2Zf.A03, true, peerAvatarLayout.A06);
    }
}
