package X;

import android.view.Menu;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.4G6  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4G6 extends C06020Rf implements InterfaceC06230Sb {
    public MenuItem A00;
    public MenuItem A01;
    public WaBloksActivity A02;
    public C90314An A03;
    public final C2MB A04;

    @Override // X.InterfaceC06230Sb
    public boolean ANF(Menu menu) {
        return false;
    }

    public C4G6(WaBloksActivity waBloksActivity, C2MB c2mb) {
        this.A02 = waBloksActivity;
        this.A04 = c2mb;
    }

    public final void A00() {
        MenuItem menuItem;
        MenuItem menuItem2;
        C90314An c90314An = this.A03;
        if (c90314An == null) {
            return;
        }
        if (c90314An.A00.A8Z(C891645y.A02, false) && (menuItem2 = this.A00) != null) {
            menuItem2.setVisible(true);
        }
        if (!this.A03.A00.A8Z(C891645y.A04, false) || (menuItem = this.A01) == null) {
            return;
        }
        menuItem.setVisible(true);
    }

    @Override // X.InterfaceC06230Sb
    public void AJ9(Menu menu) {
        MenuItem add = menu.add(0, 55, 0, "cart");
        this.A00 = add;
        add.setShowAsAction(1);
        this.A00.setIcon(R.drawable.ic_action_view_shop);
        this.A00.setVisible(false);
        MenuItem add2 = menu.add(0, 56, 0, "more");
        this.A01 = add2;
        add2.setShowAsAction(1);
        this.A01.setIcon(R.drawable.ic_more_vertical);
        this.A01.setVisible(false);
        A00();
    }

    @Override // X.InterfaceC06230Sb
    public boolean AMZ(MenuItem menuItem) {
        if (menuItem.getItemId() == 56) {
            AnonymousClass144 anonymousClass144 = this.A03.A00;
            C09P AA3 = ((AnonymousClass081) anonymousClass144.A01.A00(C891645y.A01)).AA3(C1EY.A00);
            C021109r c021109r = C021109r.A01;
            WaBloksActivity waBloksActivity = this.A02;
            C45Q.A0O(new C892046c(waBloksActivity.A0N(), waBloksActivity, this.A04), AA3, c021109r);
            return false;
        }
        return false;
    }
}
