package X;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.search.verification.client.R;
import java.util.HashSet;

/* renamed from: X.25c */
/* loaded from: classes2.dex */
public abstract class AbstractC461425c {
    public int A00;
    public LayoutInflater A01;
    public AbstractC15200oF A02;
    public C85693w4 A03;
    public InterfaceC70493Sm A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final AbstractC15200oF A08 = new AbstractC15200oF() { // from class: X.3kO
        {
            AbstractC461425c.this = this;
        }

        @Override // X.AbstractC15200oF
        public void A00(RecyclerView recyclerView, int i) {
            A02(recyclerView);
        }

        @Override // X.AbstractC15200oF
        public void A01(RecyclerView recyclerView, int i, int i2) {
            A02(recyclerView);
        }

        public final void A02(RecyclerView recyclerView) {
            if (Build.VERSION.SDK_INT >= 21) {
                AbstractC461425c abstractC461425c = AbstractC461425c.this;
                if (abstractC461425c.A04 != null) {
                    float f = (recyclerView.getContext().getResources().getDisplayMetrics().density * 0.8f) + 0.5f;
                    float min = Math.min(recyclerView.computeVerticalScrollOffset() / (recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.emoji_picker_item) / 3.0f), 1.0f);
                    if (min >= 0.0f && min <= 1.0f) {
                        f *= min;
                    }
                    abstractC461425c.A04.ADr().setBackgroundColor(C09990f7.A02(C09990f7.A03(abstractC461425c.A06, (int) (min * 13.0f)), abstractC461425c.A05));
                    C0AT.A0P(abstractC461425c.A04.ADr(), f);
                }
            }
        }
    };
    public final AbstractC15200oF A09 = new AbstractC15200oF() { // from class: X.3kP
        {
            AbstractC461425c.this = this;
        }

        @Override // X.AbstractC15200oF
        public void A00(RecyclerView recyclerView, int i) {
            AbstractC15200oF abstractC15200oF = AbstractC461425c.this.A02;
            if (abstractC15200oF != null) {
                abstractC15200oF.A00(recyclerView, i);
            }
        }

        @Override // X.AbstractC15200oF
        public void A01(RecyclerView recyclerView, int i, int i2) {
            AbstractC15200oF abstractC15200oF = AbstractC461425c.this.A02;
            if (abstractC15200oF != null) {
                abstractC15200oF.A01(recyclerView, i, i2);
            }
        }
    };
    public final ViewPager A0A;
    public final C002301c A0B;

    public AbstractC461425c(Context context, final C002301c c002301c, ViewGroup viewGroup, int i, AbstractC15200oF abstractC15200oF) {
        this.A07 = context;
        this.A0B = c002301c;
        this.A01 = LayoutInflater.from(context);
        this.A0A = (ViewPager) viewGroup.findViewById(i);
        this.A02 = abstractC15200oF;
        this.A05 = C02160Ac.A00(context, R.color.emoji_popup_body);
        this.A06 = C02160Ac.A00(context, R.color.paletteElevationOverlay);
        this.A0A.A0F(new C0Z8() { // from class: X.3kQ
            @Override // X.C0Z8
            public void AMg(int i2) {
            }

            @Override // X.C0Z8
            public void AMh(int i2, float f, int i3) {
            }

            {
                AbstractC461425c.this = this;
            }

            @Override // X.C0Z8
            public void AMi(int i2) {
                AbstractC461425c abstractC461425c = AbstractC461425c.this;
                abstractC461425c.A00 = i2;
                if (!c002301c.A0M()) {
                    i2 = (abstractC461425c.A03.A01.length - i2) - 1;
                }
                abstractC461425c.A01(i2);
                InterfaceC70493Sm interfaceC70493Sm = abstractC461425c.A04;
                if (interfaceC70493Sm != null) {
                    interfaceC70493Sm.AMi(i2);
                }
            }
        });
    }

    public int A00() {
        if (this.A0B.A0M()) {
            return this.A0A.getCurrentItem();
        }
        return (this.A03.A01.length - 1) - this.A0A.getCurrentItem();
    }

    public void A01(int i) {
        C2IX c2ix;
        C25d c25d;
        if (this instanceof C461325b) {
            C461325b c461325b = (C461325b) this;
            AbstractC461525e abstractC461525e = (AbstractC461525e) c461325b.A0G.get(i);
            abstractC461525e.A04(true);
            AbstractC461525e abstractC461525e2 = c461325b.A0C;
            if (abstractC461525e2 != null && abstractC461525e2 != abstractC461525e) {
                abstractC461525e2.A04(false);
            }
            c461325b.A0C = abstractC461525e;
            if (abstractC461525e instanceof C2CF) {
                C42531vt c42531vt = ((C2CF) abstractC461525e).A04;
                c42531vt.A07 = false;
                C2AS c2as = c461325b.A0U;
                c2as.A0S.AS1(new RunnableEBaseShape4S0200000_I0_4(c2as, c42531vt, 25));
            }
            if (!abstractC461525e.getId().equals("recents") && (c25d = c461325b.A0A) != null && ((AbstractC461525e) c25d).A04 != null) {
                c25d.A01();
            }
            if (abstractC461525e.getId().equals("starred") || (c2ix = c461325b.A0B) == null || ((AbstractC461525e) c2ix).A04 == null) {
                return;
            }
            c2ix.A01();
        }
    }

    public void A02(int i, boolean z) {
        int length = this.A0B.A0M() ? i : (this.A03.A01.length - 1) - i;
        C85693w4 c85693w4 = this.A03;
        if (c85693w4 == null || i < 0 || i >= c85693w4.A01.length || this.A00 == length) {
            return;
        }
        this.A0A.A0B(length, z);
    }

    public void A03(C85693w4 c85693w4) {
        this.A03 = c85693w4;
        AbstractC15200oF abstractC15200oF = this.A08;
        HashSet hashSet = c85693w4.A05;
        if (!hashSet.contains(abstractC15200oF)) {
            hashSet.add(abstractC15200oF);
        }
        C85693w4 c85693w42 = this.A03;
        AbstractC15200oF abstractC15200oF2 = this.A09;
        if (!c85693w42.A05.contains(abstractC15200oF2)) {
            c85693w42.A05.add(abstractC15200oF2);
        }
        this.A0A.setAdapter(this.A03);
    }
}
