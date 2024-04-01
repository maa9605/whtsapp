package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.google.android.search.verification.client.R;

/* renamed from: X.0VB */
/* loaded from: classes.dex */
public class C0VB implements C0VC, AdapterView.OnItemClickListener {
    public int A00 = R.layout.abc_list_menu_item_layout;
    public Context A01;
    public LayoutInflater A02;
    public ExpandedMenuView A03;
    public C0VD A04;
    public C06650Uk A05;
    public C0VF A06;

    @Override // X.C0VC
    public boolean A6J(C06650Uk c06650Uk, C28421Rt c28421Rt) {
        return false;
    }

    @Override // X.C0VC
    public boolean A7j(C06650Uk c06650Uk, C28421Rt c28421Rt) {
        return false;
    }

    @Override // X.C0VC
    public boolean A7r() {
        return false;
    }

    public C0VB(Context context) {
        this.A01 = context;
        this.A02 = LayoutInflater.from(context);
    }

    @Override // X.C0VC
    public void AEt(Context context, C06650Uk c06650Uk) {
        if (this.A01 != null) {
            this.A01 = context;
            if (this.A02 == null) {
                this.A02 = LayoutInflater.from(context);
            }
        }
        this.A05 = c06650Uk;
        C0VD c0vd = this.A04;
        if (c0vd != null) {
            c0vd.notifyDataSetChanged();
        }
    }

    @Override // X.C0VC
    public void AIe(C06650Uk c06650Uk, boolean z) {
        C0VF c0vf = this.A06;
        if (c0vf != null) {
            c0vf.AIe(c06650Uk, z);
        }
    }

    @Override // X.C0VC
    public boolean APD(SubMenuC38291ns subMenuC38291ns) {
        if (subMenuC38291ns.hasVisibleItems()) {
            DialogInterface$OnDismissListenerC28401Rr dialogInterface$OnDismissListenerC28401Rr = new DialogInterface$OnDismissListenerC28401Rr(subMenuC38291ns);
            C06650Uk c06650Uk = dialogInterface$OnDismissListenerC28401Rr.A02;
            C019208x c019208x = new C019208x(c06650Uk.A0M);
            C019308y c019308y = c019208x.A01;
            C0VB c0vb = new C0VB(c019308y.A0O);
            dialogInterface$OnDismissListenerC28401Rr.A01 = c0vb;
            c0vb.A06 = dialogInterface$OnDismissListenerC28401Rr;
            C06650Uk c06650Uk2 = dialogInterface$OnDismissListenerC28401Rr.A02;
            c06650Uk2.A0C(c0vb, c06650Uk2.A0M);
            C0VB c0vb2 = dialogInterface$OnDismissListenerC28401Rr.A01;
            C0VD c0vd = c0vb2.A04;
            if (c0vd == null) {
                c0vd = new C0VD(c0vb2);
                c0vb2.A04 = c0vd;
            }
            c019308y.A0D = c0vd;
            c019308y.A05 = dialogInterface$OnDismissListenerC28401Rr;
            View view = c06650Uk.A02;
            if (view != null) {
                c019308y.A0B = view;
            } else {
                c019308y.A0A = c06650Uk.A01;
                c019308y.A0I = c06650Uk.A05;
            }
            c019308y.A08 = dialogInterface$OnDismissListenerC28401Rr;
            DialogInterfaceC019408z A00 = c019208x.A00();
            dialogInterface$OnDismissListenerC28401Rr.A00 = A00;
            A00.setOnDismissListener(dialogInterface$OnDismissListenerC28401Rr);
            WindowManager.LayoutParams attributes = dialogInterface$OnDismissListenerC28401Rr.A00.getWindow().getAttributes();
            attributes.type = 1003;
            attributes.flags |= C42271vT.A09;
            dialogInterface$OnDismissListenerC28401Rr.A00.show();
            C0VF c0vf = this.A06;
            if (c0vf != null) {
                c0vf.AMY(subMenuC38291ns);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // X.C0VC
    public void ASo(C0VF c0vf) {
        this.A06 = c0vf;
    }

    @Override // X.C0VC
    public void AVo(boolean z) {
        C0VD c0vd = this.A04;
        if (c0vd != null) {
            c0vd.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.A05.A0J(this.A04.getItem(i), this, 0);
    }
}
