package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* renamed from: X.1SK  reason: invalid class name */
/* loaded from: classes.dex */
public class C1SK extends C11150hH {
    public MenuItem A00;
    public InterfaceC11260hS A01;
    public final int A02;
    public final int A03;

    public C1SK(Context context, boolean z) {
        super(context, z);
        Configuration configuration = context.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT >= 17 && 1 == configuration.getLayoutDirection()) {
            this.A02 = 21;
            this.A03 = 22;
            return;
        }
        this.A02 = 22;
        this.A03 = 21;
    }

    @Override // X.C11150hH, android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i;
        C10820gh c10820gh;
        int pointToPosition;
        int i2;
        if (this.A01 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c10820gh = (C10820gh) headerViewListAdapter.getWrappedAdapter();
            } else {
                i = 0;
                c10820gh = (C10820gh) adapter;
            }
            C28421Rt c28421Rt = null;
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < c10820gh.getCount()) {
                c28421Rt = c10820gh.getItem(i2);
            }
            MenuItem menuItem = this.A00;
            if (menuItem != c28421Rt) {
                C06650Uk c06650Uk = c10820gh.A01;
                if (menuItem != null) {
                    this.A01.ALB(c06650Uk, menuItem);
                }
                this.A00 = c28421Rt;
                if (c28421Rt != null) {
                    this.A01.ALA(c06650Uk, c28421Rt);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null) {
            if (i == this.A02) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (i == this.A03) {
                setSelection(-1);
                ((C10820gh) getAdapter()).A01.A0F(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setHoverListener(InterfaceC11260hS interfaceC11260hS) {
        this.A01 = interfaceC11260hS;
    }
}
