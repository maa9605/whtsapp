package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.util.ViewOnClickCListenerShape3S0200000_I0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2IK */
/* loaded from: classes2.dex */
public class C2IK extends AbstractC04890Mh {
    public C3Y4 A02;
    public List A03;
    public final LayoutInflater A05;
    public final C43791xz A06;
    public final InterfaceC53342en A07;
    public final Integer A08;
    public final HashMap A09 = new HashMap();
    public long A01 = 0;
    public boolean A04 = false;
    public int A00 = 0;

    public C2IK(List list, Context context, C43791xz c43791xz, InterfaceC53342en interfaceC53342en, Integer num) {
        this.A05 = LayoutInflater.from(context);
        this.A06 = c43791xz;
        this.A07 = interfaceC53342en;
        this.A08 = num;
        A0G(list);
        A0B(true);
    }

    @Override // X.AbstractC04890Mh
    public long A00(int i) {
        List list;
        Number number;
        if (!super.A00 || (list = this.A03) == null || (number = (Number) this.A09.get(((C0JM) list.get(i)).A0B)) == null) {
            return -1L;
        }
        return number.longValue();
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        List list = this.A03;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        return new C82843rA(this.A06, this.A05, viewGroup, this.A07, this.A08);
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        C0JM c0jm;
        final C82843rA c82843rA = (C82843rA) c0ts;
        List list = this.A03;
        if (list != null) {
            final C0JM c0jm2 = (C0JM) list.get(i);
            boolean z = this.A04;
            if (z != c82843rA.A03) {
                c82843rA.A03 = z;
                if (!z) {
                    StickerView stickerView = c82843rA.A07;
                    stickerView.A03 = false;
                    stickerView.A01();
                } else if (c82843rA.A02) {
                    StickerView stickerView2 = c82843rA.A07;
                    stickerView2.A03 = true;
                    stickerView2.A00();
                }
            }
            int i2 = this.A00;
            if (c0jm2 == null || (c0jm = c82843rA.A01) == null || !c0jm2.A0B.equals(c0jm.A0B)) {
                c82843rA.A01 = c0jm2;
                View view = c82843rA.A0H;
                if (c0jm2 == null) {
                    view.setOnClickListener(null);
                    c82843rA.A07.setImageResource(0);
                    view.setBackgroundResource(0);
                    view.setClickable(false);
                } else {
                    view.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(c0jm2, c82843rA, 16));
                    view.setOnLongClickListener(c82843rA.A04);
                    view.setBackgroundResource(R.drawable.selector_orange_gradient);
                    StickerView stickerView3 = c82843rA.A07;
                    view.setContentDescription(stickerView3.getContext().getString(R.string.sticker_message_content_description));
                    int dimensionPixelSize = stickerView3.getContext().getResources().getDimensionPixelSize(R.dimen.sticker_picker_item);
                    c82843rA.A05.A06(c0jm2, i2, stickerView3, dimensionPixelSize, dimensionPixelSize, true, true, new InterfaceC44171yd() { // from class: X.3qd
                        @Override // X.InterfaceC44171yd
                        public final void AP5(boolean z2) {
                            C82843rA c82843rA2 = c82843rA;
                            if (c82843rA2.A03 && c82843rA2.A02) {
                                StickerView stickerView4 = c82843rA2.A07;
                                stickerView4.A03 = true;
                                stickerView4.A00();
                            }
                        }
                    });
                }
            }
            c82843rA.A00 = new View.OnLongClickListener() { // from class: X.3Xo
                {
                    C2IK.this = this;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    C2IK c2ik = C2IK.this;
                    C0JM c0jm3 = c0jm2;
                    C3Y4 c3y4 = c2ik.A02;
                    if (c3y4 != null) {
                        c3y4.AP6(c0jm3);
                        return true;
                    }
                    return false;
                }
            };
        }
    }

    public void A0G(List list) {
        this.A03 = list;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0JM c0jm = (C0JM) it.next();
            HashMap hashMap = this.A09;
            if (hashMap.get(c0jm.A0B) == null) {
                long j = this.A01;
                this.A01 = 1 + j;
                hashMap.put(c0jm.A0B, Long.valueOf(j));
            }
        }
    }
}
