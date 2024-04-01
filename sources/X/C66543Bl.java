package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape1S0101000_I1;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1;
import com.google.android.search.verification.client.R;

/* renamed from: X.3Bl */
/* loaded from: classes2.dex */
public class C66543Bl implements InterfaceC70493Sm {
    public int A00;
    public LayoutInflater A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ViewGroup A06;
    public LinearLayoutManager A07;
    public RecyclerView A08;
    public C66523Bj A09;
    public AbstractC461425c A0A;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.3Bj, X.0Mh] */
    public C66543Bl(LayoutInflater layoutInflater, View view, C2JP[] c2jpArr) {
        this.A01 = layoutInflater;
        this.A08 = (RecyclerView) view.findViewById(R.id.gif_category_recycler);
        this.A06 = (ViewGroup) view.findViewById(R.id.gif_picker_header);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        this.A07 = linearLayoutManager;
        linearLayoutManager.A1Y(0);
        this.A08.setLayoutManager(this.A07);
        ?? r1 = new AbstractC04890Mh(c2jpArr) { // from class: X.3Bj
            public C2JP[] A00;

            @Override // X.AbstractC04890Mh
            public long A00(int i) {
                return i;
            }

            {
                C66543Bl.this = this;
                this.A00 = c2jpArr;
                A0B(true);
            }

            @Override // X.AbstractC04890Mh
            public int A0C() {
                return this.A00.length - 2;
            }

            @Override // X.AbstractC04890Mh
            public C0TS A0E(ViewGroup viewGroup, int i) {
                return new C66533Bk(C66543Bl.this, viewGroup);
            }

            @Override // X.AbstractC04890Mh
            public void A0F(C0TS c0ts, int i) {
                String string;
                C66533Bk c66533Bk = (C66533Bk) c0ts;
                int i2 = i + 2;
                c66533Bk.A0H.setOnClickListener(new ViewOnClickEBaseShape1S0101000_I1(c66533Bk, i2, 0));
                boolean z = i2 == C66543Bl.this.A00;
                c66533Bk.A01.setSelected(z);
                C66543Bl.A00(z, c66533Bk.A00);
                C2JP c2jp = this.A00[i2];
                if (c2jp instanceof C85713w6) {
                    string = ((C85713w6) c2jp).A00.getString(R.string.gif_favorites_title);
                } else if (c2jp instanceof C86833yQ) {
                    string = ((C86833yQ) c2jp).A01;
                } else if (!(c2jp instanceof C86823yP)) {
                    string = ((C2JO) c2jp).A00.getString(R.string.gif_recents_title);
                } else {
                    string = c2jp.A00.getString(R.string.gif_trending_title);
                }
                c66533Bk.A01.setText(string);
            }
        };
        this.A09 = r1;
        this.A08.setAdapter(r1);
        this.A02 = this.A06.findViewById(R.id.gif_recents_icon);
        this.A03 = this.A06.findViewById(R.id.gif_recent_marker);
        this.A02.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1(this, 6));
        this.A04 = this.A06.findViewById(R.id.gif_favorites_icon);
        this.A05 = this.A06.findViewById(R.id.gif_favorites_marker);
        this.A04.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1(this, 5));
    }

    public static final void A00(boolean z, View view) {
        int i;
        if (z) {
            i = C02160Ac.A00(view.getContext(), R.color.picker_underline_color);
        } else {
            i = 0;
        }
        view.setBackgroundColor(i);
    }

    @Override // X.InterfaceC70493Sm
    public View ADr() {
        return this.A06;
    }

    @Override // X.InterfaceC70493Sm
    public void AMi(int i) {
        this.A00 = i;
        this.A07.A0u(i);
        boolean z = false;
        boolean z2 = true;
        if (i != 0) {
            z2 = false;
            if (i == 1) {
                z = true;
            }
        }
        this.A02.setSelected(z2);
        A00(z2, this.A03);
        this.A04.setSelected(z);
        A00(z, this.A05);
        C66523Bj c66523Bj = this.A09;
        if (c66523Bj != null) {
            ((AbstractC04890Mh) c66523Bj).A01.A00();
        }
    }

    @Override // X.InterfaceC70493Sm
    public void ASt(AbstractC461425c abstractC461425c) {
        this.A0A = abstractC461425c;
        AMi(abstractC461425c.A00());
    }
}
