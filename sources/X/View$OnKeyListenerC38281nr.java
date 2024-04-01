package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.1nr */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC38281nr extends C1Rx implements C0VC, PopupWindow.OnDismissListener, View.OnKeyListener, AdapterView.OnItemClickListener {
    public int A00;
    public View A02;
    public View A03;
    public ViewTreeObserver A04;
    public PopupWindow.OnDismissListener A05;
    public C0VF A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final Context A0D;
    public final C10820gh A0G;
    public final C06650Uk A0H;
    public final C38331nx A0I;
    public final boolean A0J;
    public final ViewTreeObserver.OnGlobalLayoutListener A0F = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0go
        {
            View$OnKeyListenerC38281nr.this = this;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View$OnKeyListenerC38281nr view$OnKeyListenerC38281nr = View$OnKeyListenerC38281nr.this;
            if (view$OnKeyListenerC38281nr.AFo()) {
                C38331nx c38331nx = view$OnKeyListenerC38281nr.A0I;
                if (!c38331nx.A0G) {
                    View view = view$OnKeyListenerC38281nr.A03;
                    if (view == null || !view.isShown()) {
                        view$OnKeyListenerC38281nr.dismiss();
                    } else {
                        c38331nx.AUa();
                    }
                }
            }
        }
    };
    public final View.OnAttachStateChangeListener A0E = new View.OnAttachStateChangeListener() { // from class: X.0gp
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        {
            View$OnKeyListenerC38281nr.this = this;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            View$OnKeyListenerC38281nr view$OnKeyListenerC38281nr = View$OnKeyListenerC38281nr.this;
            ViewTreeObserver viewTreeObserver = view$OnKeyListenerC38281nr.A04;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    view$OnKeyListenerC38281nr.A04 = view.getViewTreeObserver();
                }
                view$OnKeyListenerC38281nr.A04.removeGlobalOnLayoutListener(view$OnKeyListenerC38281nr.A0F);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    public int A01 = 0;

    @Override // X.C1Rx
    public void A06(C06650Uk c06650Uk) {
    }

    @Override // X.C0VC
    public boolean A7r() {
        return false;
    }

    public View$OnKeyListenerC38281nr(Context context, C06650Uk c06650Uk, View view, int i, int i2, boolean z) {
        this.A0D = context;
        this.A0H = c06650Uk;
        this.A0J = z;
        this.A0G = new C10820gh(c06650Uk, LayoutInflater.from(context), this.A0J, R.layout.abc_popup_menu_item_layout);
        this.A0B = i;
        this.A0C = i2;
        Resources resources = context.getResources();
        this.A0A = Math.max(resources.getDisplayMetrics().widthPixels >> 1, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.A02 = view;
        this.A0I = new C38331nx(this.A0D, this.A0B, this.A0C);
        c06650Uk.A0C(this, context);
    }

    @Override // X.C1Rx
    public void A01(int i) {
        this.A01 = i;
    }

    @Override // X.C1Rx
    public void A02(int i) {
        this.A0I.A02 = i;
    }

    @Override // X.C1Rx
    public void A03(int i) {
        C38331nx c38331nx = this.A0I;
        c38331nx.A03 = i;
        c38331nx.A0F = true;
    }

    @Override // X.C1Rx
    public void A04(View view) {
        this.A02 = view;
    }

    @Override // X.C1Rx
    public void A05(PopupWindow.OnDismissListener onDismissListener) {
        this.A05 = onDismissListener;
    }

    @Override // X.C1Rx
    public void A07(boolean z) {
        this.A0G.A02 = z;
    }

    @Override // X.C1Rx
    public void A08(boolean z) {
        this.A08 = z;
    }

    @Override // X.InterfaceC10880gn
    public ListView AAw() {
        return this.A0I.A0E;
    }

    @Override // X.InterfaceC10880gn
    public boolean AFo() {
        return !this.A09 && this.A0I.AFo();
    }

    @Override // X.C0VC
    public void AIe(C06650Uk c06650Uk, boolean z) {
        if (c06650Uk != this.A0H) {
            return;
        }
        dismiss();
        C0VF c0vf = this.A06;
        if (c0vf != null) {
            c0vf.AIe(c06650Uk, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x007a, code lost:
        if (r1 == false) goto L37;
     */
    @Override // X.C0VC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean APD(X.SubMenuC38291ns r14) {
        /*
            r13 = this;
            r8 = r14
            boolean r0 = r14.hasVisibleItems()
            r2 = 0
            if (r0 == 0) goto L95
            android.content.Context r7 = r13.A0D
            android.view.View r9 = r13.A03
            boolean r10 = r13.A0J
            int r11 = r13.A0B
            int r12 = r13.A0C
            X.0gl r6 = new X.0gl
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.0VF r1 = r13.A06
            r6.A04 = r1
            X.1Rx r0 = r6.A03
            if (r0 == 0) goto L22
            r0.ASo(r1)
        L22:
            int r5 = r14.size()
            r4 = 0
            r3 = 0
        L28:
            if (r3 >= r5) goto L3b
            android.view.MenuItem r1 = r14.getItem(r3)
            boolean r0 = r1.isVisible()
            if (r0 == 0) goto L92
            android.graphics.drawable.Drawable r0 = r1.getIcon()
            if (r0 == 0) goto L92
            r4 = 1
        L3b:
            r6.A05 = r4
            X.1Rx r0 = r6.A03
            if (r0 == 0) goto L44
            r0.A07(r4)
        L44:
            android.widget.PopupWindow$OnDismissListener r0 = r13.A05
            r6.A02 = r0
            r0 = 0
            r13.A05 = r0
            X.0Uk r0 = r13.A0H
            r0.A0F(r2)
            X.1nx r1 = r13.A0I
            int r4 = r1.A02
            boolean r0 = r1.A0F
            if (r0 != 0) goto L8f
            r3 = 0
        L59:
            int r1 = r13.A01
            android.view.View r0 = r13.A02
            int r0 = X.C0AT.A05(r0)
            int r0 = android.view.Gravity.getAbsoluteGravity(r1, r0)
            r1 = r0 & 7
            r0 = 5
            if (r1 != r0) goto L71
            android.view.View r0 = r13.A02
            int r0 = r0.getWidth()
            int r4 = r4 + r0
        L71:
            X.1Rx r0 = r6.A03
            if (r0 == 0) goto L7c
            boolean r1 = r0.AFo()
            r0 = 1
            if (r1 != 0) goto L7d
        L7c:
            r0 = 0
        L7d:
            r1 = 1
            if (r0 != 0) goto L87
            android.view.View r0 = r6.A01
            if (r0 == 0) goto L95
            r6.A03(r4, r3, r1, r1)
        L87:
            X.0VF r0 = r13.A06
            if (r0 == 0) goto L8e
            r0.AMY(r14)
        L8e:
            return r1
        L8f:
            int r3 = r1.A03
            goto L59
        L92:
            int r3 = r3 + 1
            goto L28
        L95:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.View$OnKeyListenerC38281nr.APD(X.1ns):boolean");
    }

    @Override // X.C0VC
    public void ASo(C0VF c0vf) {
        this.A06 = c0vf;
    }

    @Override // X.InterfaceC10880gn
    public void AUa() {
        View view;
        Rect rect;
        if (!AFo()) {
            if (!this.A09 && (view = this.A02) != null) {
                this.A03 = view;
                C38331nx c38331nx = this.A0I;
                c38331nx.A0D.setOnDismissListener(this);
                c38331nx.A0B = this;
                c38331nx.A0G = true;
                c38331nx.A0D.setFocusable(true);
                View view2 = this.A03;
                boolean z = this.A04 == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.A04 = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.A0F);
                }
                view2.addOnAttachStateChangeListener(this.A0E);
                c38331nx.A0A = view2;
                ((C1SJ) c38331nx).A00 = this.A01;
                if (!this.A07) {
                    this.A00 = C1Rx.A00(this.A0G, this.A0D, this.A0A);
                    this.A07 = true;
                }
                c38331nx.A01(this.A00);
                c38331nx.A0D.setInputMethodMode(2);
                Rect rect2 = super.A00;
                if (rect2 != null) {
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                c38331nx.A09 = rect;
                c38331nx.AUa();
                C11150hH c11150hH = c38331nx.A0E;
                c11150hH.setOnKeyListener(this);
                if (this.A08) {
                    C06650Uk c06650Uk = this.A0H;
                    if (c06650Uk.A05 != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.A0D).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c11150hH, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(c06650Uk.A05);
                        }
                        frameLayout.setEnabled(false);
                        c11150hH.addHeaderView(frameLayout, null, false);
                    }
                }
                c38331nx.ASg(this.A0G);
                c38331nx.AUa();
                return;
            }
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // X.C0VC
    public void AVo(boolean z) {
        this.A07 = false;
        C10820gh c10820gh = this.A0G;
        if (c10820gh != null) {
            c10820gh.notifyDataSetChanged();
        }
    }

    @Override // X.InterfaceC10880gn
    public void dismiss() {
        if (AFo()) {
            this.A0I.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.A09 = true;
        this.A0H.A0F(true);
        ViewTreeObserver viewTreeObserver = this.A04;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.A04 = this.A03.getViewTreeObserver();
            }
            this.A04.removeGlobalOnLayoutListener(this.A0F);
            this.A04 = null;
        }
        this.A03.removeOnAttachStateChangeListener(this.A0E);
        PopupWindow.OnDismissListener onDismissListener = this.A05;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
