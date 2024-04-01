package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1np */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC38261np extends C1Rx implements C0VC, PopupWindow.OnDismissListener, View.OnKeyListener {
    public int A01;
    public int A03;
    public int A04;
    public View A05;
    public View A06;
    public ViewTreeObserver A07;
    public PopupWindow.OnDismissListener A08;
    public C0VF A09;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final Context A0I;
    public final Handler A0J;
    public final boolean A0P;
    public final List A0N = new ArrayList();
    public final List A0O = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener A0L = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0gd
        {
            View$OnKeyListenerC38261np.this = this;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View$OnKeyListenerC38261np view$OnKeyListenerC38261np = View$OnKeyListenerC38261np.this;
            if (view$OnKeyListenerC38261np.AFo()) {
                List<C10810gg> list = view$OnKeyListenerC38261np.A0O;
                if (list.size() <= 0 || ((C10810gg) list.get(0)).A02.A0G) {
                    return;
                }
                View view = view$OnKeyListenerC38261np.A06;
                if (view != null && view.isShown()) {
                    for (C10810gg c10810gg : list) {
                        c10810gg.A02.AUa();
                    }
                    return;
                }
                view$OnKeyListenerC38261np.dismiss();
            }
        }
    };
    public final View.OnAttachStateChangeListener A0K = new View.OnAttachStateChangeListener() { // from class: X.0ge
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        {
            View$OnKeyListenerC38261np.this = this;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            View$OnKeyListenerC38261np view$OnKeyListenerC38261np = View$OnKeyListenerC38261np.this;
            ViewTreeObserver viewTreeObserver = view$OnKeyListenerC38261np.A07;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    view$OnKeyListenerC38261np.A07 = view.getViewTreeObserver();
                }
                view$OnKeyListenerC38261np.A07.removeGlobalOnLayoutListener(view$OnKeyListenerC38261np.A0L);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    public final InterfaceC11260hS A0M = new C28391Rp(this);
    public int A02 = 0;
    public int A00 = 0;
    public boolean A0A = false;

    @Override // X.C1Rx
    public boolean A09() {
        return false;
    }

    @Override // X.C0VC
    public boolean A7r() {
        return false;
    }

    public View$OnKeyListenerC38261np(Context context, View view, int i, int i2, boolean z) {
        this.A0I = context;
        this.A05 = view;
        this.A0G = i;
        this.A0H = i2;
        this.A0P = z;
        this.A01 = C0AT.A05(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.A0F = Math.max(resources.getDisplayMetrics().widthPixels >> 1, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.A0J = new Handler();
    }

    @Override // X.C1Rx
    public void A01(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            this.A00 = C07O.A01(i, C0AT.A05(this.A05));
        }
    }

    @Override // X.C1Rx
    public void A02(int i) {
        this.A0B = true;
        this.A03 = i;
    }

    @Override // X.C1Rx
    public void A03(int i) {
        this.A0C = true;
        this.A04 = i;
    }

    @Override // X.C1Rx
    public void A04(View view) {
        if (this.A05 != view) {
            this.A05 = view;
            this.A00 = C07O.A01(this.A02, C0AT.A05(view));
        }
    }

    @Override // X.C1Rx
    public void A05(PopupWindow.OnDismissListener onDismissListener) {
        this.A08 = onDismissListener;
    }

    @Override // X.C1Rx
    public void A06(C06650Uk c06650Uk) {
        c06650Uk.A0C(this, this.A0I);
        if (AFo()) {
            A0A(c06650Uk);
        } else {
            this.A0N.add(c06650Uk);
        }
    }

    @Override // X.C1Rx
    public void A07(boolean z) {
        this.A0A = z;
    }

    @Override // X.C1Rx
    public void A08(boolean z) {
        this.A0E = z;
    }

    public final void A0A(C06650Uk c06650Uk) {
        C10810gg c10810gg;
        C10820gh c10820gh;
        int i;
        int firstVisiblePosition;
        View childAt;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        Context context = this.A0I;
        LayoutInflater from = LayoutInflater.from(context);
        C10820gh c10820gh2 = new C10820gh(c06650Uk, from, this.A0P, R.layout.abc_cascading_menu_item_layout);
        if (!AFo() && this.A0A) {
            c10820gh2.A02 = true;
        } else if (AFo()) {
            int size = c06650Uk.size();
            boolean z2 = false;
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    break;
                }
                MenuItem item = c06650Uk.getItem(i6);
                if (item.isVisible() && item.getIcon() != null) {
                    z2 = true;
                    break;
                }
                i6++;
            }
            c10820gh2.A02 = z2;
        }
        int A00 = C1Rx.A00(c10820gh2, context, this.A0F);
        C38331nx c38331nx = new C38331nx(context, this.A0G, this.A0H);
        c38331nx.A00 = this.A0M;
        c38331nx.A0B = this;
        c38331nx.A0D.setOnDismissListener(this);
        c38331nx.A0A = this.A05;
        ((C1SJ) c38331nx).A00 = this.A00;
        c38331nx.A0G = true;
        c38331nx.A0D.setFocusable(true);
        c38331nx.A0D.setInputMethodMode(2);
        c38331nx.ASg(c10820gh2);
        c38331nx.A01(A00);
        ((C1SJ) c38331nx).A00 = this.A00;
        List list = this.A0O;
        if (list.size() > 0) {
            c10810gg = (C10810gg) list.get(list.size() - 1);
            C06650Uk c06650Uk2 = c10810gg.A01;
            int size2 = c06650Uk2.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size2) {
                    break;
                }
                MenuItem item2 = c06650Uk2.getItem(i7);
                if (item2.hasSubMenu() && c06650Uk == item2.getSubMenu()) {
                    C11150hH c11150hH = c10810gg.A02.A0E;
                    ListAdapter adapter = c11150hH.getAdapter();
                    if (adapter instanceof HeaderViewListAdapter) {
                        HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                        i = headerViewListAdapter.getHeadersCount();
                        c10820gh = (C10820gh) headerViewListAdapter.getWrappedAdapter();
                    } else {
                        c10820gh = (C10820gh) adapter;
                        i = 0;
                    }
                    int count = c10820gh.getCount();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= count) {
                            break;
                        } else if (item2 == c10820gh.getItem(i8)) {
                            if (i8 != -1 && (firstVisiblePosition = (i8 + i) - c11150hH.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c11150hH.getChildCount() && (childAt = c11150hH.getChildAt(firstVisiblePosition)) != null) {
                                if (Build.VERSION.SDK_INT <= 28) {
                                    Method method = C38331nx.A01;
                                    if (method != null) {
                                        try {
                                            method.invoke(c38331nx.A0D, Boolean.FALSE);
                                        } catch (Exception unused) {
                                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                                        }
                                    }
                                } else {
                                    c38331nx.A0D.setTouchModal(false);
                                }
                                if (Build.VERSION.SDK_INT >= 23) {
                                    c38331nx.A0D.setEnterTransition(null);
                                }
                                C11150hH c11150hH2 = ((C10810gg) list.get(list.size() - 1)).A02.A0E;
                                int[] iArr = new int[2];
                                c11150hH2.getLocationOnScreen(iArr);
                                Rect rect = new Rect();
                                this.A06.getWindowVisibleDisplayFrame(rect);
                                if (this.A01 != 1 ? iArr[0] - A00 >= 0 : c11150hH2.getWidth() + iArr[0] + A00 > rect.right) {
                                    i2 = 0;
                                    z = false;
                                } else {
                                    i2 = 1;
                                    z = true;
                                }
                                this.A01 = i2;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    c38331nx.A0A = childAt;
                                    i4 = 0;
                                    i3 = 0;
                                } else {
                                    int[] iArr2 = new int[2];
                                    this.A05.getLocationOnScreen(iArr2);
                                    int[] iArr3 = new int[2];
                                    childAt.getLocationOnScreen(iArr3);
                                    if ((this.A00 & 7) == 5) {
                                        iArr2[0] = this.A05.getWidth() + iArr2[0];
                                        iArr3[0] = childAt.getWidth() + iArr3[0];
                                    }
                                    i3 = iArr3[0] - iArr2[0];
                                    i4 = iArr3[1] - iArr2[1];
                                }
                                if ((this.A00 & 5) == 5) {
                                    if (!z) {
                                        A00 = childAt.getWidth();
                                        i5 = i3 - A00;
                                    }
                                    i5 = i3 + A00;
                                } else {
                                    if (z) {
                                        A00 = childAt.getWidth();
                                        i5 = i3 + A00;
                                    }
                                    i5 = i3 - A00;
                                }
                                c38331nx.A02 = i5;
                                c38331nx.A0I = true;
                                c38331nx.A0H = true;
                                c38331nx.AU6(i4);
                            }
                        } else {
                            i8++;
                        }
                    }
                } else {
                    i7++;
                }
            }
        } else {
            c10810gg = null;
        }
        if (this.A0B) {
            c38331nx.A02 = this.A03;
        }
        if (this.A0C) {
            c38331nx.AU6(this.A04);
        }
        Rect rect2 = super.A00;
        c38331nx.A09 = rect2 != null ? new Rect(rect2) : null;
        list.add(new C10810gg(c38331nx, c06650Uk, this.A01));
        c38331nx.AUa();
        C11150hH c11150hH3 = c38331nx.A0E;
        c11150hH3.setOnKeyListener(this);
        if (c10810gg == null && this.A0E && c06650Uk.A05 != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c11150hH3, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(c06650Uk.A05);
            c11150hH3.addHeaderView(frameLayout, null, false);
            c38331nx.AUa();
        }
    }

    @Override // X.InterfaceC10880gn
    public ListView AAw() {
        List list = this.A0O;
        if (list.isEmpty()) {
            return null;
        }
        return ((C10810gg) list.get(list.size() - 1)).A02.A0E;
    }

    @Override // X.InterfaceC10880gn
    public boolean AFo() {
        List list = this.A0O;
        return list.size() > 0 && ((C10810gg) list.get(0)).A02.AFo();
    }

    @Override // X.C0VC
    public void AIe(C06650Uk c06650Uk, boolean z) {
        List list = this.A0O;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (c06650Uk == ((C10810gg) list.get(i)).A01) {
                if (i >= 0) {
                    int i2 = i + 1;
                    if (i2 < list.size()) {
                        ((C10810gg) list.get(i2)).A01.A0F(false);
                    }
                    C10810gg c10810gg = (C10810gg) list.remove(i);
                    c10810gg.A01.A0B(this);
                    if (this.A0D) {
                        C38331nx c38331nx = c10810gg.A02;
                        if (c38331nx != null) {
                            if (Build.VERSION.SDK_INT >= 23) {
                                c38331nx.A0D.setExitTransition(null);
                            }
                            c38331nx.A0D.setAnimationStyle(0);
                        } else {
                            throw null;
                        }
                    }
                    c10810gg.A02.dismiss();
                    int size2 = list.size();
                    if (size2 > 0) {
                        this.A01 = ((C10810gg) list.get(size2 - 1)).A00;
                    } else {
                        this.A01 = C0AT.A05(this.A05) == 1 ? 0 : 1;
                        if (size2 == 0) {
                            dismiss();
                            C0VF c0vf = this.A09;
                            if (c0vf != null) {
                                c0vf.AIe(c06650Uk, true);
                            }
                            ViewTreeObserver viewTreeObserver = this.A07;
                            if (viewTreeObserver != null) {
                                if (viewTreeObserver.isAlive()) {
                                    this.A07.removeGlobalOnLayoutListener(this.A0L);
                                }
                                this.A07 = null;
                            }
                            this.A06.removeOnAttachStateChangeListener(this.A0K);
                            this.A08.onDismiss();
                            return;
                        }
                    }
                    if (z) {
                        ((C10810gg) list.get(0)).A01.A0F(false);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // X.C0VC
    public boolean APD(SubMenuC38291ns subMenuC38291ns) {
        for (C10810gg c10810gg : this.A0O) {
            if (subMenuC38291ns == c10810gg.A01) {
                c10810gg.A02.A0E.requestFocus();
                return true;
            }
        }
        if (subMenuC38291ns.hasVisibleItems()) {
            subMenuC38291ns.A0C(this, this.A0I);
            if (AFo()) {
                A0A(subMenuC38291ns);
            } else {
                this.A0N.add(subMenuC38291ns);
            }
            C0VF c0vf = this.A09;
            if (c0vf != null) {
                c0vf.AMY(subMenuC38291ns);
            }
            return true;
        }
        return false;
    }

    @Override // X.C0VC
    public void ASo(C0VF c0vf) {
        this.A09 = c0vf;
    }

    @Override // X.InterfaceC10880gn
    public void AUa() {
        if (AFo()) {
            return;
        }
        List<C06650Uk> list = this.A0N;
        for (C06650Uk c06650Uk : list) {
            A0A(c06650Uk);
        }
        list.clear();
        View view = this.A05;
        this.A06 = view;
        if (view != null) {
            boolean z = this.A07 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.A07 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.A0L);
            }
            this.A06.addOnAttachStateChangeListener(this.A0K);
        }
    }

    @Override // X.C0VC
    public void AVo(boolean z) {
        for (C10810gg c10810gg : this.A0O) {
            ListAdapter adapter = c10810gg.A02.A0E.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C10820gh) adapter).notifyDataSetChanged();
        }
    }

    @Override // X.InterfaceC10880gn
    public void dismiss() {
        List list = this.A0O;
        int size = list.size();
        if (size > 0) {
            C10810gg[] c10810ggArr = (C10810gg[]) list.toArray(new C10810gg[size]);
            for (int i = size - 1; i >= 0; i--) {
                C10810gg c10810gg = c10810ggArr[i];
                if (c10810gg.A02.AFo()) {
                    c10810gg.A02.dismiss();
                }
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        List list = this.A0O;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C10810gg c10810gg = (C10810gg) list.get(i);
            if (!c10810gg.A02.AFo()) {
                c10810gg.A01.A0F(false);
                return;
            }
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }
}
