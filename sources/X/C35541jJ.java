package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.LruCache;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1jJ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C35541jJ extends AbstractC08920cK {
    public int A00;
    public View A03;
    public boolean A04;
    public final C0Mi A05;
    public LruCache A02 = new LruCache(50);
    public Rect A01 = new Rect();

    public C35541jJ(RecyclerView recyclerView, final C0Mi c0Mi) {
        this.A05 = c0Mi;
        recyclerView.A15.add(new InterfaceC15190oE() { // from class: X.1jH
            @Override // X.InterfaceC15190oE
            public void ANv(boolean z) {
            }

            @Override // X.InterfaceC15190oE
            public void APi(RecyclerView recyclerView2, MotionEvent motionEvent) {
            }

            @Override // X.InterfaceC15190oE
            public boolean AL6(RecyclerView recyclerView2, MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                C35541jJ c35541jJ = C35541jJ.this;
                return (c35541jJ.A04 || !((C461925o) c0Mi).A0H() || actionMasked == 2 || actionMasked == 8 || actionMasked == 1 || motionEvent.getY() > ((float) c35541jJ.A00)) ? false : true;
            }
        });
        ((AbstractC04890Mh) c0Mi).A01.registerObserver(new AbstractC15100o5() { // from class: X.1jI
            @Override // X.AbstractC15100o5
            public void A01(int i, int i2) {
                C35541jJ.A00(C35541jJ.this, i, i2);
            }

            @Override // X.AbstractC15100o5
            public void A02(int i, int i2) {
                C35541jJ.A00(C35541jJ.this, i, i2);
            }

            @Override // X.AbstractC15100o5
            public void A03(int i, int i2) {
                C35541jJ.A00(C35541jJ.this, i, i2);
            }

            @Override // X.AbstractC15100o5
            public void A04(int i, int i2, int i3) {
                C35541jJ c35541jJ = C35541jJ.this;
                C35541jJ.A00(c35541jJ, i, i3);
                C35541jJ.A00(c35541jJ, i2, i3);
            }
        });
    }

    public static void A00(C35541jJ c35541jJ, int i, int i2) {
        if (c35541jJ.A02.size() != 0) {
            for (int i3 = i; i3 <= i + i2; i3++) {
                c35541jJ.A02.remove(Integer.valueOf(i3));
            }
        }
    }

    @Override // X.AbstractC08920cK
    public void A02(Canvas canvas, RecyclerView recyclerView, C0Y0 c0y0) {
        C0SV c0sv;
        C461925o c461925o = (C461925o) this.A05;
        if (c461925o.A0H() && (c0sv = recyclerView.A0S) != null) {
            View A0H = c0sv.A0H(0);
            if (A0H == null) {
                return;
            }
            int A00 = RecyclerView.A00(A0H);
            if (A00 == -1) {
                View view = this.A03;
                canvas.save();
                canvas.translate(this.A01.left, 0.0f);
                view.draw(canvas);
                canvas.restore();
            } else if (c461925o != null) {
                for (int i = A00; i >= 0; i--) {
                    if (c461925o.A0J(i)) {
                        this.A04 = false;
                        if (A00 == i) {
                            c0sv.A0O(A0H, this.A01);
                        }
                        LruCache lruCache = this.A02;
                        Integer valueOf = Integer.valueOf(i);
                        View view2 = (View) lruCache.get(valueOf);
                        if (view2 == null) {
                            C0TS A0E = c461925o.A0E(recyclerView, c461925o.A0e.A00(i));
                            c461925o.A0F(A0E, i);
                            view2 = A0E.A0H;
                            this.A02.put(valueOf, view2);
                        }
                        Rect rect = this.A01;
                        view2.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), recyclerView.getPaddingRight() + recyclerView.getPaddingLeft(), view2.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0), recyclerView.getPaddingBottom() + recyclerView.getPaddingTop(), view2.getLayoutParams().height));
                        this.A00 = view2.getMeasuredHeight() + rect.bottom + rect.top;
                        view2.layout(0, 0, view2.getMeasuredWidth() + rect.left + rect.right, this.A00);
                        this.A03 = view2;
                        int bottom = view2.getBottom() - this.A01.top;
                        for (int i2 = 0; i2 < recyclerView.getChildCount(); i2++) {
                            View childAt = recyclerView.getChildAt(i2);
                            Rect rect2 = new Rect();
                            RecyclerView.A03(childAt, rect2);
                            if (rect2.bottom > bottom && rect2.top <= bottom) {
                                if (childAt != null) {
                                    int A002 = RecyclerView.A00(childAt);
                                    if (A002 != -1 && c461925o.A0J(A002)) {
                                        canvas.save();
                                        canvas.translate(this.A01.left, childAt.getTop() - view2.getHeight());
                                        view2.draw(canvas);
                                        canvas.restore();
                                        return;
                                    }
                                    canvas.save();
                                    canvas.translate(this.A01.left, 0.0f);
                                    view2.draw(canvas);
                                    canvas.restore();
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                }
                this.A04 = true;
            } else {
                throw null;
            }
        }
    }
}
