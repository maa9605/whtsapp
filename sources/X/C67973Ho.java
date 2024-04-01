package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Ho  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C67973Ho extends AbstractC04890Mh {
    public int A00 = -1;
    public List A01 = new ArrayList();
    public final /* synthetic */ AbstractC636430h A02;

    public C67973Ho(AbstractC636430h abstractC636430h) {
        this.A02 = abstractC636430h;
    }

    @Override // X.AbstractC04890Mh
    public long A00(int i) {
        if (super.A00) {
            AbstractC636430h abstractC636430h = this.A02;
            if (!(abstractC636430h instanceof C67993Hq)) {
                throw new UnsupportedOperationException("You must override getStableId");
            }
            C67993Hq c67993Hq = (C67993Hq) abstractC636430h;
            boolean z = c67993Hq.A01;
            if (z && i == 0) {
                return -1L;
            }
            List list = c67993Hq.A03;
            if (z) {
                i--;
            }
            String str = ((C42531vt) list.get(i)).A0D;
            Map map = c67993Hq.A04;
            Number number = (Number) map.get(str);
            if (number == null) {
                long j = c67993Hq.A00;
                c67993Hq.A00 = 1 + j;
                number = Long.valueOf(j);
                map.put(str, number);
            }
            return number.longValue();
        }
        return -1L;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A01.size();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        AbstractC636430h abstractC636430h = this.A02;
        C67983Hp c67983Hp = new C67983Hp(LayoutInflater.from(abstractC636430h.A06.getContext()).inflate(R.layout.shape_picker_subcategory_item, viewGroup, false));
        abstractC636430h.A01(c67983Hp, abstractC636430h.A00);
        c67983Hp.A0H.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1(this, c67983Hp, 10));
        return c67983Hp;
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        C67983Hp c67983Hp = (C67983Hp) c0ts;
        boolean z = this.A00 == i;
        AbstractC636430h abstractC636430h = this.A02;
        if (!(abstractC636430h instanceof C67993Hq)) {
            ImageView imageView = c67983Hp.A01;
            imageView.setImageResource(C67953Hm.A01[i]);
            imageView.setAlpha(z ? 1.0f : 0.55f);
            View view = c67983Hp.A0H;
            view.setContentDescription(view.getContext().getString(C67953Hm.A02[i]));
        } else {
            C67993Hq c67993Hq = (C67993Hq) abstractC636430h;
            boolean z2 = c67993Hq.A01;
            if (z2 && i == 0) {
                ImageView imageView2 = c67983Hp.A01;
                imageView2.setTag(null);
                imageView2.setImageResource(R.drawable.ic_stickers_recents);
                View view2 = c67983Hp.A0H;
                view2.setContentDescription(view2.getContext().getString(R.string.shape_picker_recents_subcategory_content_description));
            } else {
                List list = c67993Hq.A03;
                if (z2) {
                    i--;
                }
                C42531vt c42531vt = (C42531vt) list.get(i);
                String str = c42531vt.A0D;
                ImageView imageView3 = c67983Hp.A01;
                if (!str.equals(imageView3.getTag())) {
                    c67993Hq.A02.A0J(c42531vt, new C82823r8(imageView3, str));
                    View view3 = c67983Hp.A0H;
                    view3.setContentDescription(view3.getContext().getString(R.string.shape_picker_sticker_pack_subcategory_content_description, c42531vt.A0F));
                }
            }
        }
        c67983Hp.A00.setVisibility(z ? 0 : 8);
    }

    public final void A0G() {
        ShapePickerRecyclerView shapePickerRecyclerView = this.A02.A08;
        GridLayoutManager gridLayoutManager = shapePickerRecyclerView.A06;
        if (gridLayoutManager != null) {
            int A1F = gridLayoutManager.A1F();
            GridLayoutManager gridLayoutManager2 = shapePickerRecyclerView.A06;
            if (gridLayoutManager2 != null) {
                int A1H = gridLayoutManager2.A1H();
                int i = 0;
                if (A1F != 0) {
                    int adapterItemCount = shapePickerRecyclerView.getAdapterItemCount();
                    int i2 = -1;
                    if (A1H == adapterItemCount - 1) {
                        i = this.A01.size() - 1;
                    } else {
                        int i3 = Integer.MAX_VALUE;
                        while (i < this.A01.size()) {
                            int abs = Math.abs(((Number) this.A01.get(i)).intValue() - A1F);
                            if (abs < i3) {
                                i2 = i;
                                i3 = abs;
                            }
                            i++;
                        }
                        i = i2;
                    }
                }
                A0H(i);
                return;
            }
            throw new IllegalStateException("Must set adapter first");
        }
        throw new IllegalStateException("Must set adapter first");
    }

    public final void A0H(int i) {
        int i2 = this.A00;
        AbstractC636430h abstractC636430h = this.A02;
        LinearLayoutManager linearLayoutManager = abstractC636430h.A03;
        int A1G = linearLayoutManager.A1G();
        int A1I = linearLayoutManager.A1I();
        this.A00 = i;
        A02(i2);
        A02(this.A00);
        int max = Math.max(this.A00 - ((A1I - A1G) >> 1), 0);
        AbstractC15270oM abstractC15270oM = abstractC636430h.A05;
        if (max != abstractC15270oM.A00) {
            abstractC15270oM.A00 = max;
            linearLayoutManager.A0W(abstractC15270oM);
        }
    }
}
