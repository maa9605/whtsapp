package com.whatsapp;

import X.AbstractC04890Mh;
import X.AbstractC08260b4;
import X.AbstractC14890nk;
import X.AbstractC15100o5;
import X.C002301c;
import X.C0TS;
import X.C13090ka;
import X.C1LE;
import X.C35301iv;
import X.C35591jO;
import X.C49582Lf;
import X.InterfaceC15190oE;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.StickyHeadersRecyclerView;

/* loaded from: classes.dex */
public class StickyHeadersRecyclerView extends AbstractC08260b4 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public C13090ka A07;
    public C0TS A08;
    public C002301c A09;
    public final Rect A0A;

    public static boolean A09(long j) {
        return (j & 4294967295L) == 4294967295L;
    }

    public StickyHeadersRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = -1;
        this.A00 = -1;
        this.A0A = new Rect();
        int i = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C49582Lf.A1y);
            this.A03 = obtainStyledAttributes.getDimensionPixelSize(0, this.A03);
            i = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
        }
        if (this.A03 > 0) {
            A0k(new C35301iv(this.A09, i));
        }
        this.A0i = true;
        this.A07 = new C13090ka(context, new GestureDetector.SimpleOnGestureListener() { // from class: X.1LD
            {
                StickyHeadersRecyclerView.this = this;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                StickyHeadersRecyclerView stickyHeadersRecyclerView = StickyHeadersRecyclerView.this;
                return ((C1LE) StickyHeadersRecyclerView.getStickyHeadersAdapter(stickyHeadersRecyclerView).A00).AP9(stickyHeadersRecyclerView.A08, stickyHeadersRecyclerView.A02, motionEvent);
            }
        });
        this.A15.add(new InterfaceC15190oE() { // from class: X.1jK
            @Override // X.InterfaceC15190oE
            public void ANv(boolean z) {
            }

            {
                StickyHeadersRecyclerView.this = this;
            }

            @Override // X.InterfaceC15190oE
            public boolean AL6(RecyclerView recyclerView, MotionEvent motionEvent) {
                StickyHeadersRecyclerView stickyHeadersRecyclerView = StickyHeadersRecyclerView.this;
                C0TS c0ts = stickyHeadersRecyclerView.A08;
                if (c0ts == null || c0ts.A0H == null) {
                    return false;
                }
                float y = motionEvent.getY();
                int height = stickyHeadersRecyclerView.A08.A0H.getHeight();
                int i2 = stickyHeadersRecyclerView.A04;
                if (i2 >= 0) {
                    i2 = 0;
                }
                if (y <= height + i2) {
                    stickyHeadersRecyclerView.A07.A00.APj(motionEvent);
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC15190oE
            public void APi(RecyclerView recyclerView, MotionEvent motionEvent) {
                StickyHeadersRecyclerView.this.A07.A00.APj(motionEvent);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A0S;
        C35591jO stickyHeadersAdapter = getStickyHeadersAdapter(this);
        int A1G = linearLayoutManager.A1G();
        if (A1G != -1) {
            if (A1G != this.A00) {
                this.A00 = A1G;
                long A0G = stickyHeadersAdapter.A0G(A1G);
                this.A05 = A0G;
                int i = (int) (A0G >> 32);
                if (this.A02 != i) {
                    this.A02 = i;
                    ((C1LE) stickyHeadersAdapter.A00).AHy(this.A08, i);
                    View view = this.A08.A0H;
                    view.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
            }
            this.A04 = 0;
            if (!A09(this.A05)) {
                int A1F = linearLayoutManager.A1F();
                if (this.A01 != A1F) {
                    this.A01 = A1F;
                    this.A06 = stickyHeadersAdapter.A0G(A1F);
                }
                if (A09(this.A06)) {
                    View A0G2 = linearLayoutManager.A0G(A1F);
                    this.A04 = A0G2.getTop() - this.A08.A0H.getMeasuredHeight();
                    Rect rect = this.A0A;
                    linearLayoutManager.A0O(A0G2, rect);
                    int i2 = this.A04 - rect.top;
                    this.A04 = i2;
                    if (i2 > 0) {
                        this.A04 = 0;
                    }
                }
            }
            canvas.save();
            canvas.clipRect(0, this.A04, this.A08.A0H.getMeasuredWidth(), this.A08.A0H.getMeasuredHeight() + this.A04);
            canvas.translate(0.0f, this.A04);
            this.A08.A0H.draw(canvas);
            canvas.restore();
        }
    }

    public static C35591jO getStickyHeadersAdapter(StickyHeadersRecyclerView stickyHeadersRecyclerView) {
        return (C35591jO) stickyHeadersRecyclerView.A0N;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        View view;
        super.onMeasure(i, i2);
        if (this.A03 > 0) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.A03;
            ((GridLayoutManager) this.A0S).A1q(Math.max(1, ((i3 >> 1) + measuredWidth) / i3));
        }
        C0TS c0ts = this.A08;
        if (c0ts == null || (view = c0ts.A0H) == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(AbstractC04890Mh abstractC04890Mh) {
        super.setAdapter(new C35591jO(abstractC04890Mh));
        AbstractC04890Mh abstractC04890Mh2 = this.A0N;
        abstractC04890Mh2.A01.registerObserver(new AbstractC15100o5() { // from class: X.1jL
            {
                StickyHeadersRecyclerView.this = this;
            }

            @Override // X.AbstractC15100o5
            public void A00() {
                StickyHeadersRecyclerView stickyHeadersRecyclerView = StickyHeadersRecyclerView.this;
                stickyHeadersRecyclerView.A02 = -1;
                stickyHeadersRecyclerView.A00 = -1;
            }
        });
        if (this.A03 > 0) {
            int measuredWidth = getMeasuredWidth();
            int i = this.A03;
            int max = Math.max(1, ((i >> 1) + measuredWidth) / i);
            getContext();
            final GridLayoutManager gridLayoutManager = new GridLayoutManager(max);
            gridLayoutManager.A01 = new AbstractC14890nk() { // from class: X.1jM
                {
                    StickyHeadersRecyclerView.this = this;
                }

                @Override // X.AbstractC14890nk
                public int A00(int i2) {
                    if ((StickyHeadersRecyclerView.getStickyHeadersAdapter(StickyHeadersRecyclerView.this).A0G(i2) & 4294967295L) == 4294967295L) {
                        return gridLayoutManager.A00;
                    }
                    return 1;
                }
            };
            setLayoutManager(gridLayoutManager);
        } else {
            getContext();
            setLayoutManager(new LinearLayoutManager(1));
        }
        this.A08 = getStickyHeadersAdapter(this).A0E(this, -1000);
    }
}
