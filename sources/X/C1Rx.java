package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: X.1Rx  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1Rx implements C0VC, InterfaceC10880gn, AdapterView.OnItemClickListener {
    public Rect A00;

    public abstract void A01(int i);

    public abstract void A02(int i);

    public abstract void A03(int i);

    public abstract void A04(View view);

    public abstract void A05(PopupWindow.OnDismissListener onDismissListener);

    public abstract void A06(C06650Uk c06650Uk);

    public abstract void A07(boolean z);

    public abstract void A08(boolean z);

    public boolean A09() {
        return true;
    }

    @Override // X.C0VC
    public boolean A6J(C06650Uk c06650Uk, C28421Rt c28421Rt) {
        return false;
    }

    @Override // X.C0VC
    public boolean A7j(C06650Uk c06650Uk, C28421Rt c28421Rt) {
        return false;
    }

    @Override // X.C0VC
    public void AEt(Context context, C06650Uk c06650Uk) {
    }

    public static int A00(ListAdapter listAdapter, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C10820gh c10820gh;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            c10820gh = (C10820gh) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            c10820gh = (C10820gh) listAdapter;
        }
        c10820gh.A01.A0J((MenuItem) listAdapter.getItem(i), this, A09() ? 0 : 4);
    }
}
