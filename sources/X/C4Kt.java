package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.BrazilMerchantDetailsListActivity;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.4Kt */
/* loaded from: classes3.dex */
public abstract class C4Kt extends AbstractActivityC92424Kg {
    public C0DV A00;
    public C4FC A01;

    @Override // X.C4KM
    public C0TS A1P(ViewGroup viewGroup, int i) {
        if (i != 300) {
            if (i != 301) {
                if (i != 303) {
                    if (i != 305) {
                        return super.A1P(viewGroup, i);
                    }
                    return new C4HQ(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.merchant_warning_info_view, viewGroup, false));
                }
                return new C4HE(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_expandable_listview, viewGroup, false)) { // from class: X.4Il
                };
            }
            return new C4HO(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.merchant_detail_card_payout_method_view, viewGroup, false));
        }
        return new C4HN(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.merchant_detail_payout_bank_view, viewGroup, false));
    }

    public final DialogInterfaceC019408z A1Q(CharSequence charSequence, String str, final boolean z) {
        final int i = z ? 201 : 200;
        C019208x c019208x = new C019208x(this);
        C019308y c019308y = c019208x.A01;
        c019308y.A0E = charSequence;
        c019308y.A0J = true;
        c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3QR
            {
                C4Kt.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C002701i.A18(C4Kt.this, i);
            }
        });
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.3QQ
            {
                C4Kt.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C4Kt.this.A1R(i, z);
            }
        };
        c019308y.A0H = str;
        c019308y.A06 = onClickListener;
        c019308y.A02 = new DialogInterface.OnCancelListener() { // from class: X.3QP
            {
                C4Kt.this = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C002701i.A18(C4Kt.this, i);
            }
        };
        return c019208x.A00();
    }

    public /* synthetic */ void A1R(int i, boolean z) {
        C002701i.A18(this, i);
        C901349u c901349u = new C901349u(2);
        c901349u.A01 = z;
        this.A01.A04(c901349u);
    }

    public final void A1S(C901449v c901449v) {
        int i = c901449v.A00;
        if (i == 0) {
            C002701i.A19(this, 201);
        } else if (i == 1) {
            C002701i.A19(this, 200);
        }
    }

    @Override // X.AbstractActivityC92424Kg, X.C4KM, X.C4K6, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final BrazilMerchantDetailsListActivity brazilMerchantDetailsListActivity = (BrazilMerchantDetailsListActivity) this;
        final C900649n c900649n = brazilMerchantDetailsListActivity.A06;
        if (c900649n != null) {
            C92044Hh c92044Hh = (C92044Hh) C002701i.A0J(brazilMerchantDetailsListActivity, new C28661Tc() { // from class: X.4Hi
                @Override // X.C28661Tc, X.C0CR
                public C0MU A6e(Class cls) {
                    if (cls.isAssignableFrom(C92044Hh.class)) {
                        BrazilMerchantDetailsListActivity brazilMerchantDetailsListActivity2 = brazilMerchantDetailsListActivity;
                        C900649n c900649n2 = c900649n;
                        return new C92044Hh(brazilMerchantDetailsListActivity2, c900649n2.A06, c900649n2.A00, c900649n2.A01, c900649n2.A07, c900649n2.A0S, c900649n2.A0C, c900649n2.A0Q, c900649n2.A0N, c900649n2.A09, c900649n2.A0D, c900649n2.A0I, c900649n2.A04, c900649n2.A0K, c900649n2.A0B, c900649n2.A0A, c900649n2.A0M, c900649n2.A0G, c900649n2.A0H);
                    }
                    throw new IllegalArgumentException("Invalid viewModel");
                }
            }).A00(C92044Hh.class);
            brazilMerchantDetailsListActivity.A05 = c92044Hh;
            c92044Hh.A00.A05(((C4FC) c92044Hh).A06, new InterfaceC05620Pl() { // from class: X.3jl
                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    brazilMerchantDetailsListActivity.A1T((C900549m) obj);
                }
            });
            C92044Hh c92044Hh2 = brazilMerchantDetailsListActivity.A05;
            this.A01 = c92044Hh2;
            ((C4FC) c92044Hh2).A00.A05(((C4FC) c92044Hh2).A06, new InterfaceC05620Pl() { // from class: X.3iO
                {
                    C4Kt.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    C4E4 c4e4 = ((C4KM) C4Kt.this).A03;
                    c4e4.A00 = (List) obj;
                    ((AbstractC04890Mh) c4e4).A01.A00();
                }
            });
            C4FC c4fc = this.A01;
            c4fc.A03.A05(c4fc.A06, new InterfaceC05620Pl() { // from class: X.3jg
                {
                    C4Kt.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    C4Kt.this.A1S((C901449v) obj);
                }
            });
            this.A01.A04(new C901349u(0));
            ((C4KM) this).A01.setLockIconVisibility(false);
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        String string;
        if (i != 200) {
            if (i != 201) {
                return super.onCreateDialog(i);
            }
            C0DV c0dv = this.A00;
            c0dv.A04();
            if (((AbstractCollection) c0dv.A07.A0V(1)).size() > 0) {
                string = getString(R.string.delete_seller_account_dialog_title_with_warning);
            } else {
                string = getString(R.string.delete_seller_account_dialog_title);
            }
            return A1Q(C002701i.A0g(string, this, ((ActivityC02290Ap) this).A0H), getString(R.string.remove), true);
        }
        return A1Q(getString(R.string.delete_seller_account_dialog_title), getString(R.string.remove), false);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_remove_payment_method, 0, getString(R.string.remove_account));
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_remove_payment_method) {
            this.A01.A04(new C901349u(1));
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
