package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.emoji.EmojiContainerView;

/* renamed from: X.3AZ  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3AZ extends AbstractC04890Mh implements C2IR {
    public C61512wH A00;
    public final int A01;
    public final LayoutInflater A02;
    public final C002301c A03;
    public final C40081rY A04;
    public final InterfaceC54632j6 A05;
    public final C02O A06;

    public C3AZ(Activity activity, C40081rY c40081rY, C002301c c002301c, InterfaceC54632j6 interfaceC54632j6, C02O c02o, int i) {
        this.A02 = activity.getLayoutInflater();
        this.A04 = c40081rY;
        this.A03 = c002301c;
        this.A06 = c02o;
        this.A05 = interfaceC54632j6;
        this.A01 = i;
    }

    @Override // X.AbstractC04890Mh
    public void A05(C0TS c0ts) {
        final C54622j5 c54622j5 = (C54622j5) c0ts;
        if (c54622j5.A01 == null) {
            c54622j5.A03.setOnClickListener(null);
            return;
        }
        View view = c54622j5.A0H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = layoutParams.height;
        view.setLayoutParams(layoutParams);
        EmojiContainerView emojiContainerView = c54622j5.A03;
        emojiContainerView.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1(c54622j5, 4));
        int[] iArr = c54622j5.A01.A00;
        boolean A03 = C60712uv.A03(iArr);
        emojiContainerView.A02 = A03;
        if (A03) {
            c54622j5.A01 = new C2CI(C26701Kg.A02(c54622j5.A06, (int[]) iArr.clone()));
            emojiContainerView.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.2ux
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    final C54622j5 c54622j52 = C54622j5.this;
                    C40081rY c40081rY = c54622j52.A04;
                    ImageView imageView = c54622j52.A02;
                    C2j3 c2j3 = new C2j3(c40081rY, imageView, c54622j52.A01.A00);
                    c2j3.A01 = new InterfaceC54612j4() { // from class: X.3AU
                        @Override // X.InterfaceC54612j4
                        public final void AOk(int[] iArr2) {
                            C54622j5 c54622j53 = C54622j5.this;
                            C2CI c2ci = new C2CI(iArr2);
                            c54622j53.A05.AJk(c2ci, c54622j53.A00);
                            int i = c54622j53.A00;
                            c54622j53.A01 = c2ci;
                            c54622j53.A00 = i;
                            C26701Kg.A01(c54622j53.A06, iArr2);
                            c54622j53.A0C();
                        }
                    };
                    int[] iArr2 = new int[2];
                    imageView.getLocationOnScreen(iArr2);
                    View rootView = c54622j52.A03.getRootView();
                    int[] iArr3 = new int[2];
                    rootView.getRootView().getLocationOnScreen(iArr3);
                    c2j3.showAtLocation(rootView, 51, ((imageView.getMeasuredWidth() / 2) + (iArr2[0] - Math.max(0, iArr3[0]))) - (c2j3.getContentView().getMeasuredWidth() / 2), ((iArr2[1] - Math.max(0, iArr3[1])) - c2j3.getContentView().getMeasuredHeight()) - imageView.getContext().getResources().getDimensionPixelSize(R.dimen.skin_emoji_popup_offset));
                    return true;
                }
            });
        } else {
            emojiContainerView.setOnLongClickListener(null);
        }
        c54622j5.A02.setContentDescription(c54622j5.A01.toString());
        c54622j5.A0C();
    }

    @Override // X.AbstractC04890Mh
    public synchronized int A0C() {
        C61512wH c61512wH = this.A00;
        if (c61512wH == null) {
            return 0;
        }
        return c61512wH.A01.size();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        return new C54622j5(this.A04, this.A06, viewGroup, this.A02, this.A05, this.A01);
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        C2CI c2ci;
        C54622j5 c54622j5 = (C54622j5) c0ts;
        synchronized (this) {
            if (i < this.A00.A01.size()) {
                c2ci = (C2CI) this.A00.A01.get(i);
            } else {
                c2ci = null;
            }
            c54622j5.A01 = c2ci;
            c54622j5.A00 = i;
        }
    }
}
