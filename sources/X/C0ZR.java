package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CameraHomeFragment;
import com.whatsapp.HomeActivity;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.status.StatusesFragment;
import com.whatsapp.voipcalling.CallsFragment;

/* renamed from: X.0ZR  reason: invalid class name */
/* loaded from: classes.dex */
public class C0ZR extends C0ZS implements C0ZU {
    public final int A00;
    public final C0ZV[] A01;
    public final /* synthetic */ HomeActivity A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZR(HomeActivity homeActivity, AbstractC02800Cx abstractC02800Cx) {
        super(abstractC02800Cx);
        this.A02 = homeActivity;
        int size = HomeActivity.A1w.size();
        this.A00 = size;
        this.A01 = new C0ZV[size];
    }

    @Override // X.C0ZT
    public CharSequence A03(int i) {
        HomeActivity homeActivity = this.A02;
        int A1Q = homeActivity.A1Q(i);
        if (A1Q != 100) {
            if (A1Q != 200) {
                if (A1Q != 300) {
                    if (A1Q != 400) {
                        if (A1Q != 500) {
                            StringBuilder A0P = C000200d.A0P("The item position should be less or equal to:");
                            A0P.append(this.A00);
                            throw new IllegalArgumentException(A0P.toString());
                        }
                        return "";
                    }
                    return ((ActivityC02310Ar) homeActivity).A01.A06(R.string.calls);
                }
                return ((ActivityC02310Ar) homeActivity).A01.A06(R.string.statuses);
            }
            return ((ActivityC02310Ar) homeActivity).A01.A06(R.string.chats);
        }
        return "";
    }

    @Override // X.C0ZT
    public int A0B() {
        return this.A00;
    }

    @Override // X.C0ZS, X.C0ZT
    public Object A0C(ViewGroup viewGroup, int i) {
        C0BA c0ba = (C0BA) super.A0C(viewGroup, i);
        HomeActivity homeActivity = this.A02;
        if (homeActivity.A1Q(i) == 100) {
            homeActivity.A0K = (CameraHomeFragment) c0ba;
        }
        return c0ba;
    }

    @Override // X.C0ZS
    public long A0F(int i) {
        return this.A02.A1Q(i);
    }

    @Override // X.C0ZS
    public C0BA A0G(int i) {
        int A1Q = this.A02.A1Q(i);
        if (A1Q != 100) {
            if (A1Q != 200) {
                if (A1Q != 300) {
                    if (A1Q != 400) {
                        if (A1Q == 500) {
                            throw new IllegalStateException("Invalid tab id: 500");
                        }
                        StringBuilder A0P = C000200d.A0P("The item position should be less or equal to:");
                        A0P.append(this.A00);
                        throw new IllegalArgumentException(A0P.toString());
                    }
                    return new CallsFragment();
                }
                return new StatusesFragment();
            }
            return new ConversationsFragment();
        }
        return new CameraHomeFragment();
    }

    public final C0ZV A0H(int i) {
        C0ZV[] c0zvArr = this.A01;
        if (c0zvArr[i] == null) {
            C0ZV c0zv = new C0ZV();
            HomeActivity homeActivity = this.A02;
            View inflate = homeActivity.getLayoutInflater().inflate(R.layout.home_tab, (ViewGroup) null, false);
            c0zv.A01 = inflate;
            TextView textView = (TextView) inflate.findViewById(R.id.tab);
            c0zv.A04 = textView;
            textView.setText(A03(i));
            c0zv.A03 = (TextView) c0zv.A01.findViewById(R.id.badge);
            ImageView imageView = (ImageView) c0zv.A01.findViewById(R.id.icon);
            c0zv.A02 = imageView;
            C07O.A0h(imageView, C02160Ac.A02(homeActivity, R.color.selector_home_tab_color));
            if (i == HomeActivity.A00(((ActivityC02310Ar) homeActivity).A01, 100)) {
                c0zv.A02.setVisibility(0);
                c0zv.A02.setImageDrawable(C02160Ac.A03(homeActivity, R.drawable.ic_home_camera).mutate());
                c0zv.A02.setContentDescription(((ActivityC02310Ar) homeActivity).A01.A06(R.string.camera_button_description));
            } else if (i == HomeActivity.A00(((ActivityC02310Ar) homeActivity).A01, 300)) {
                c0zv.A02.setImageDrawable(C02160Ac.A03(homeActivity, R.drawable.new_status_indicator).mutate());
                C0LX.A06(((ActivityC02310Ar) homeActivity).A01, c0zv.A02, homeActivity.getResources().getDimensionPixelSize(R.dimen.tab_statuses_icon_padding), 0);
            }
            c0zvArr[i] = c0zv;
        }
        return c0zvArr[i];
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r2.A1Q(r5) == 500) goto L8;
     */
    @Override // X.C0ZU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View ABr(int r5) {
        /*
            r4 = this;
            com.whatsapp.HomeActivity r2 = r4.A02
            com.whatsapp.PagerSlidingTabStrip r3 = r2.A0R
            int r1 = r2.A1Q(r5)
            r0 = 100
            if (r1 == r0) goto L15
            int r2 = r2.A1Q(r5)
            r1 = 500(0x1f4, float:7.0E-43)
            r0 = 1
            if (r2 != r1) goto L16
        L15:
            r0 = 0
        L16:
            r3.setShouldExpand(r0)
            X.0ZV r0 = r4.A0H(r5)
            android.view.View r0 = r0.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZR.ABr(int):android.view.View");
    }
}
