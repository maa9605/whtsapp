package X;

import android.widget.BaseAdapter;

/* renamed from: X.2iv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC54542iv extends BaseAdapter {
    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i * 1024;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return getItem(i) instanceof AnonymousClass372 ? 1 : 0;
    }
}
