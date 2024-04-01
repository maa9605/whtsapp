package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.ListView;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

/* renamed from: X.2sh */
/* loaded from: classes2.dex */
public final class C59402sh {
    public View A00;
    public View A01;
    public C68383Jl A02;
    public InterfaceC51582Xa A03;
    public C51622Xe A04;
    public C51642Xg A05;
    public ArrayList A06;
    public boolean A07;
    public boolean A08;
    public final ViewGroup A09;
    public final ViewGroup A0A;
    public final ListView A0B;
    public final ActivityC02320As A0C;
    public final C0OA A0D;
    public final C0B5 A0E;
    public final C02L A0F;
    public final C01B A0G;
    public final C40261rr A0H;
    public final C05W A0I;
    public final C54572iy A0J;
    public final C05M A0K;
    public final C0EA A0L;
    public final C06S A0M;
    public final C003701t A0N;
    public final C0ES A0O;
    public final C018808t A0P;
    public final AbstractC005302j A0Q;
    public final C72763aY A0R;

    public C59402sh(C003701t c003701t, ActivityC02320As activityC02320As, C02L c02l, C05M c05m, C01B c01b, C0EA c0ea, C05W c05w, C40261rr c40261rr, C0ES c0es, C06S c06s, C018808t c018808t, C05Q c05q, C54572iy c54572iy, C0B5 c0b5, C0OA c0oa, AbstractC005302j abstractC005302j, ListView listView, ViewGroup viewGroup) {
        this.A0N = c003701t;
        this.A0C = activityC02320As;
        this.A0F = c02l;
        this.A0K = c05m;
        this.A0G = c01b;
        this.A0L = c0ea;
        this.A0I = c05w;
        this.A0H = c40261rr;
        this.A0O = c0es;
        this.A0M = c06s;
        this.A0P = c018808t;
        this.A0J = c54572iy;
        this.A0E = c0b5;
        this.A0D = c0oa;
        this.A0Q = abstractC005302j;
        this.A0B = listView;
        this.A0A = viewGroup;
        this.A0R = new C72763aY(c02l, c05w, c06s, c05q);
        ViewGroup viewGroup2 = (ViewGroup) activityC02320As.getLayoutInflater().inflate(R.layout.conversation_header, (ViewGroup) listView, false);
        this.A09 = viewGroup2;
        this.A00 = viewGroup2.findViewById(R.id.progress);
        listView.addHeaderView(this.A09);
    }

    public final void A00() {
        InterfaceC51582Xa interfaceC51582Xa = this.A03;
        if (interfaceC51582Xa != null) {
            interfaceC51582Xa.AEf();
            View view = this.A01;
            if (view == null || !(this.A03 instanceof C51602Xc)) {
                return;
            }
            view.setVisibility(8);
            this.A0B.removeFooterView(this.A01);
        }
    }

    public final void A01(C06C c06c, boolean z) {
        InterfaceC51582Xa c2xy;
        C54572iy c54572iy = this.A0J;
        c54572iy.A00 = c06c;
        c54572iy.A01 = z;
        if (this.A03 == null) {
            boolean A0C = this.A0N.A0C(412);
            ActivityC02320As activityC02320As = this.A0C;
            if (A0C) {
                c2xy = new C51602Xc(activityC02320As);
            } else {
                c2xy = new C2XY(activityC02320As);
            }
            this.A03 = c2xy;
            c2xy.setup(c54572iy);
            InterfaceC51582Xa interfaceC51582Xa = this.A03;
            if (interfaceC51582Xa instanceof C2XY) {
                this.A0B.addFooterView((View) interfaceC51582Xa);
            } else if (!(interfaceC51582Xa instanceof C51602Xc)) {
            } else {
                final View view = (View) interfaceC51582Xa;
                ViewGroup viewGroup = this.A0A;
                viewGroup.setVisibility(0);
                viewGroup.addView(view);
                view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2sg
                    {
                        C59402sh.this = this;
                    }

                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        View view2 = view;
                        view2.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        int measuredHeight = view2.getMeasuredHeight();
                        C59402sh c59402sh = C59402sh.this;
                        View view3 = new View(c59402sh.A0C);
                        c59402sh.A01 = view3;
                        view3.setLayoutParams(new AbsListView.LayoutParams(-1, measuredHeight));
                        c59402sh.A0B.addFooterView(c59402sh.A01);
                    }
                });
            }
        }
    }
}
