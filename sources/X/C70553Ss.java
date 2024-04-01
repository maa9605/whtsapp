package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3Ss  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C70553Ss {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public RecyclerView A05;
    public C2IK A06;
    public final GridLayoutManager A08;
    public final ViewTreeObserver.OnGlobalLayoutListener A07 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.3Sr
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            C70553Ss c70553Ss = C70553Ss.this;
            int height = c70553Ss.A05.getHeight();
            if (height != c70553Ss.A03) {
                c70553Ss.A03 = height;
                int i = c70553Ss.A01;
                int i2 = (i * 3) >> 2;
                int i3 = height % i;
                if (i3 >= (i >> 2) && i3 <= i2) {
                    i2 = i3;
                }
                int max = Math.max(0, height - i2);
                c70553Ss.A02 = (max % i) / ((max / i) + 1);
            }
            int width = c70553Ss.A05.getWidth();
            if (c70553Ss.A04 != width) {
                c70553Ss.A04 = width;
                int i4 = width / c70553Ss.A01;
                if (c70553Ss.A00 != i4) {
                    c70553Ss.A00 = i4;
                    c70553Ss.A08.A1q(i4);
                    C2IK c2ik = c70553Ss.A06;
                    if (c2ik != null) {
                        ((AbstractC04890Mh) c2ik).A01.A00();
                    }
                }
                C2IK c2ik2 = c70553Ss.A06;
                if (c2ik2 != null) {
                    ((AbstractC04890Mh) c2ik2).A01.A00();
                }
            }
        }
    };
    public final AbstractC08920cK A09 = new AbstractC08920cK() { // from class: X.3kf
        @Override // X.AbstractC08920cK
        public void A01(Rect rect, View view, RecyclerView recyclerView, C0Y0 c0y0) {
            C70553Ss c70553Ss = C70553Ss.this;
            if (c70553Ss.A00 == 0) {
                return;
            }
            int A00 = RecyclerView.A00(view);
            int i = c70553Ss.A00;
            int i2 = A00 % i;
            int i3 = (c70553Ss.A04 - (c70553Ss.A01 * i)) / (i + 1);
            rect.left = i3 - ((i2 * i3) / i);
            rect.right = ((i2 + 1) * i3) / i;
            if (A00 < i) {
                rect.top = c70553Ss.A02;
            }
            rect.bottom = c70553Ss.A02;
        }
    };

    public C70553Ss(Context context, ViewGroup viewGroup, RecyclerView recyclerView, C2IK c2ik) {
        int i;
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.sticker_picker_item);
        if (viewGroup != null) {
            i = viewGroup.getWidth();
            this.A04 = i;
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            C018308n.A00(context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            i = displayMetrics.widthPixels;
            this.A04 = i;
        }
        int i2 = i / this.A01;
        this.A00 = i2;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i2 <= 0 ? 1 : i2);
        this.A08 = gridLayoutManager;
        this.A05 = recyclerView;
        this.A06 = c2ik;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.A0k(this.A09);
        recyclerView.setItemAnimator(null);
    }
}
