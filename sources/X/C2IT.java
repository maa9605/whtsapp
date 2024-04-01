package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0_0;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2IT  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2IT extends AbstractC04890Mh {
    public List A02;
    public final C650835v A05;
    public final C002301c A06;
    public final C41711uO A07;
    public final C0EE A08;
    public final C41991uq A09;
    public List A00 = new ArrayList();
    public List A03 = new ArrayList();
    public List A01 = new ArrayList();
    public boolean A04 = false;

    public C2IT(C650835v c650835v, C41991uq c41991uq, C002301c c002301c, C0EE c0ee, C41711uO c41711uO) {
        this.A05 = c650835v;
        this.A09 = c41991uq;
        this.A06 = c002301c;
        this.A08 = c0ee;
        this.A07 = c41711uO;
        A0G();
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A02.size();
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        return ((C57462pQ) this.A02.get(i)).A00;
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C650435r(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.linked_devices_header_layout, viewGroup, false), this.A05);
        } else if (i == 2) {
            final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.device_section_layout, viewGroup, false);
            return new C0TS(inflate) { // from class: X.35q
            };
        } else if (i == 3) {
            return new C650535s(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.linked_device_list_item_layout, viewGroup, false), this.A06, this.A05);
        } else if (i == 4) {
            return new C3J3(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.linked_device_list_item_layout, viewGroup, false), this.A09, this.A06, this.A05);
        } else if (i == 5) {
            final C002301c c002301c = this.A06;
            final C650835v c650835v = this.A05;
            final View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.linked_device_list_item_layout, viewGroup, false);
            return new C650535s(inflate2, c002301c, c650835v) { // from class: X.3J2
            };
        } else {
            throw new UnsupportedOperationException(C000200d.A0D("Invalid viewType: ", i));
        }
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        if (c0ts instanceof C3J3) {
            C3J3 c3j3 = (C3J3) c0ts;
            C42881wU c42881wU = (C42881wU) ((C57462pQ) this.A02.get(i)).A01;
            ((C650535s) c3j3).A00.setImageResource(C46W.A01(c42881wU));
            ((C650535s) c3j3).A03.setText(AnonymousClass029.A0V(((C650535s) c3j3).A05, c42881wU.A04, c3j3.A00.A0L(c42881wU.A0F)));
            TextView textView = ((C650535s) c3j3).A02;
            textView.setText(C46W.A05(c42881wU, textView.getContext()));
            c3j3.A0H.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0_0(c3j3, c42881wU, 4));
        } else if (c0ts instanceof C3J2) {
            C650535s c650535s = (C650535s) c0ts;
            C1PP c1pp = (C1PP) ((C57462pQ) this.A02.get(i)).A01;
            c650535s.A00.setImageResource(c1pp.A00);
            c650535s.A03.setText(AnonymousClass029.A0S(c650535s.A05, c1pp.A02));
            TextView textView2 = c650535s.A02;
            View view = c650535s.A0H;
            textView2.setText(view.getContext().getText(c1pp.A01));
            view.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0_0(c650535s, c1pp, 2));
        } else {
            if (c0ts instanceof C650535s) {
                C650135o c650135o = (C650135o) ((C57462pQ) this.A02.get(i)).A01;
                final C650535s c650535s2 = (C650535s) c0ts;
                boolean contains = this.A07.A0L.contains(c650135o.A05);
                ImageView imageView = c650535s2.A00;
                imageView.setImageResource(C46W.A00(c650135o));
                TextView textView3 = c650535s2.A02;
                textView3.setText(C46W.A04(c650135o, textView3.getContext()));
                if (c650135o.A00()) {
                    TextView textView4 = c650535s2.A03;
                    textView4.setText(R.string.linked_device_logged_out);
                    int color = c650535s2.A0H.getResources().getColor(R.color.disabled_text);
                    textView3.setTextColor(color);
                    textView4.setTextColor(color);
                    C46W.A06(imageView, false);
                } else {
                    TextView textView5 = c650535s2.A03;
                    textView5.setText(AnonymousClass029.A0V(c650535s2.A05, ((C0JV) c650135o).A00, contains));
                    textView3.setTextColor(textView3.getResources().getColor(R.color.list_item_title_v2));
                    textView5.setTextColor(textView3.getResources().getColor(R.color.list_item_sub_title_v2));
                    C46W.A06(imageView, true);
                }
                if (c650135o.A00) {
                    ImageView imageView2 = c650535s2.A01;
                    if (imageView2.getVisibility() == 8) {
                        imageView2.clearAnimation();
                        imageView2.setAlpha(0.0f);
                        imageView2.setVisibility(0);
                        imageView2.animate().alpha(1.0f).setDuration(500L).start();
                    }
                } else {
                    ImageView imageView3 = c650535s2.A01;
                    if (imageView3.getVisibility() == 0) {
                        imageView3.clearAnimation();
                        imageView3.animate().alpha(0.0f).setDuration(500L).setListener(new AnimatorListenerAdapter() { // from class: X.2pP
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                ImageView imageView4 = C650535s.this.A01;
                                imageView4.setVisibility(8);
                                imageView4.animate().setListener(null);
                            }
                        }).start();
                    }
                }
                c650535s2.A0H.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0_0(c650535s2, c650135o, 3));
            } else if (c0ts instanceof C650435r) {
                C650435r c650435r = (C650435r) c0ts;
                C0EE c0ee = this.A08;
                boolean A03 = c0ee.A03();
                boolean A02 = c0ee.A02();
                c650435r.A02.setVisibility(A03 ? 0 : 8);
                c650435r.A00.setVisibility(A03 ? 0 : 8);
                TextView textView6 = c650435r.A01;
                int i2 = R.string.md_opt_in_card_subtitle_opted_out;
                if (A02) {
                    i2 = R.string.md_opt_in_card_subtitle_opted_in;
                }
                textView6.setText(i2);
                if (!A03) {
                    return;
                }
                for (int i3 : c650435r.A02.getReferencedIds()) {
                    C0AT.A0D(c650435r.A0H, i3).setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(c650435r, 38));
                }
            }
        }
    }

    public final void A0G() {
        ArrayList arrayList = new ArrayList();
        this.A02 = arrayList;
        arrayList.add(new C57462pQ(new Object(), 1));
        if (!this.A00.isEmpty() || !this.A03.isEmpty()) {
            this.A02.add(new C57462pQ(null, 2));
        }
        this.A04 = false;
        for (C0JV c0jv : this.A00) {
            this.A02.add(new C57462pQ(c0jv, 3));
            String str = c0jv.A07;
            if (str != null && str.equals("Portal")) {
                this.A04 = true;
            }
        }
        for (C42881wU c42881wU : this.A03) {
            this.A02.add(new C57462pQ(c42881wU, 4));
            if (c42881wU.A0C) {
                this.A04 = true;
            }
        }
        for (Object obj : this.A01) {
            this.A02.add(new C57462pQ(obj, 5));
        }
    }
}
