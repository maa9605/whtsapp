package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* renamed from: X.1SN  reason: invalid class name */
/* loaded from: classes.dex */
public class C1SN implements C0VC {
    public C06650Uk A00;
    public C28421Rt A01;
    public final /* synthetic */ Toolbar A02;

    @Override // X.C0VC
    public boolean A7r() {
        return false;
    }

    @Override // X.C0VC
    public void AIe(C06650Uk c06650Uk, boolean z) {
    }

    @Override // X.C0VC
    public boolean APD(SubMenuC38291ns subMenuC38291ns) {
        return false;
    }

    @Override // X.C0VC
    public void ASo(C0VF c0vf) {
    }

    public C1SN(Toolbar toolbar) {
        this.A02 = toolbar;
    }

    @Override // X.C0VC
    public boolean A6J(C06650Uk c06650Uk, C28421Rt c28421Rt) {
        Toolbar toolbar = this.A02;
        View view = toolbar.A0G;
        if (view instanceof InterfaceC07620Za) {
            ((InterfaceC07620Za) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.A0G);
        toolbar.removeView(toolbar.A0H);
        toolbar.A0G = null;
        ArrayList arrayList = toolbar.A0b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar.addView((View) arrayList.get(size));
            } else {
                arrayList.clear();
                this.A01 = null;
                toolbar.requestLayout();
                c28421Rt.A0N = false;
                c28421Rt.A0E.A0E(false);
                return true;
            }
        }
    }

    @Override // X.C0VC
    public boolean A7j(C06650Uk c06650Uk, C28421Rt c28421Rt) {
        Toolbar toolbar = this.A02;
        toolbar.A07();
        ViewParent parent = toolbar.A0H.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.A0H);
            }
            toolbar.addView(toolbar.A0H);
        }
        View actionView = c28421Rt.getActionView();
        toolbar.A0G = actionView;
        this.A01 = c28421Rt;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.A0G);
            }
            C08860cC c08860cC = new C08860cC();
            ((C0U2) c08860cC).A00 = 8388611 | (toolbar.A00 & 112);
            c08860cC.A00 = 2;
            toolbar.A0G.setLayoutParams(c08860cC);
            toolbar.addView(toolbar.A0G);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (((C08860cC) childAt.getLayoutParams()).A00 != 2 && childAt != toolbar.A0O) {
                toolbar.removeViewAt(childCount);
                toolbar.A0b.add(childAt);
            }
        }
        toolbar.requestLayout();
        c28421Rt.A0N = true;
        c28421Rt.A0E.A0E(false);
        View view = toolbar.A0G;
        if (view instanceof InterfaceC07620Za) {
            ((InterfaceC07620Za) view).onActionViewExpanded();
        }
        return true;
    }

    @Override // X.C0VC
    public void AEt(Context context, C06650Uk c06650Uk) {
        C28421Rt c28421Rt;
        C06650Uk c06650Uk2 = this.A00;
        if (c06650Uk2 != null && (c28421Rt = this.A01) != null) {
            c06650Uk2.A0L(c28421Rt);
        }
        this.A00 = c06650Uk;
    }

    @Override // X.C0VC
    public void AVo(boolean z) {
        C28421Rt c28421Rt = this.A01;
        if (c28421Rt != null) {
            C06650Uk c06650Uk = this.A00;
            if (c06650Uk != null) {
                int size = c06650Uk.size();
                for (int i = 0; i < size; i++) {
                    if (c06650Uk.getItem(i) == c28421Rt) {
                        return;
                    }
                }
            }
            A6J(c06650Uk, c28421Rt);
        }
    }
}
