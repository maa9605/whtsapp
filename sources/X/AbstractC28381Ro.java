package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

/* renamed from: X.1Ro  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC28381Ro implements C0VC {
    public Context A02;
    public Context A03;
    public LayoutInflater A04;
    public C06650Uk A05;
    public C0VF A06;
    public InterfaceC06630Ui A07;
    public int A01 = R.layout.abc_action_menu_layout;
    public int A00 = R.layout.abc_action_menu_item_layout;

    @Override // X.C0VC
    public boolean A6J(C06650Uk c06650Uk, C28421Rt c28421Rt) {
        return false;
    }

    @Override // X.C0VC
    public boolean A7j(C06650Uk c06650Uk, C28421Rt c28421Rt) {
        return false;
    }

    public AbstractC28381Ro(Context context) {
        this.A03 = context;
        this.A04 = LayoutInflater.from(context);
    }

    public View A00(C28421Rt c28421Rt, View view, ViewGroup viewGroup) {
        InterfaceC10870gm interfaceC10870gm;
        if (view instanceof InterfaceC10870gm) {
            interfaceC10870gm = (InterfaceC10870gm) view;
        } else {
            interfaceC10870gm = (InterfaceC10870gm) this.A04.inflate(this.A00, viewGroup, false);
        }
        C38311nu c38311nu = (C38311nu) this;
        interfaceC10870gm.AEz(c28421Rt, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC10870gm;
        actionMenuItemView.A05 = (ActionMenuView) ((AbstractC28381Ro) c38311nu).A07;
        C1S1 c1s1 = c38311nu.A07;
        if (c1s1 == null) {
            c1s1 = new C1S1(c38311nu);
            c38311nu.A07 = c1s1;
        }
        actionMenuItemView.A04 = c1s1;
        return (View) interfaceC10870gm;
    }

    @Override // X.C0VC
    public boolean APD(SubMenuC38291ns subMenuC38291ns) {
        C0VF c0vf = this.A06;
        if (c0vf != null) {
            return c0vf.AMY(subMenuC38291ns);
        }
        return false;
    }

    @Override // X.C0VC
    public void ASo(C0VF c0vf) {
        this.A06 = c0vf;
    }

    @Override // X.C0VC
    public void AVo(boolean z) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.A07;
        if (viewGroup == null) {
            return;
        }
        C06650Uk c06650Uk = this.A05;
        if (c06650Uk != null) {
            c06650Uk.A05();
            ArrayList A04 = this.A05.A04();
            int size = A04.size();
            i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                C28421Rt c28421Rt = (C28421Rt) A04.get(i2);
                if ((c28421Rt.A02 & 32) == 32) {
                    View childAt = viewGroup.getChildAt(i);
                    C28421Rt itemData = childAt instanceof InterfaceC10870gm ? ((InterfaceC10870gm) childAt).getItemData() : null;
                    View A00 = A00(c28421Rt, childAt, viewGroup);
                    if (c28421Rt != itemData) {
                        A00.setPressed(false);
                        A00.jumpDrawablesToCurrentState();
                    }
                    if (A00 != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) A00.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(A00);
                        }
                        ((ViewGroup) this.A07).addView(A00, i);
                    }
                    i++;
                }
            }
        } else {
            i = 0;
        }
        while (i < viewGroup.getChildCount()) {
            if (viewGroup.getChildAt(i) == ((C38311nu) this).A09) {
                i++;
            } else {
                viewGroup.removeViewAt(i);
            }
        }
    }
}
