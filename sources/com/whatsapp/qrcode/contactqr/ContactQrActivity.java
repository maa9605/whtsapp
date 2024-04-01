package com.whatsapp.qrcode.contactqr;

import X.ActivityC02290Ap;
import X.C002301c;
import X.C012005w;
import X.C018508q;
import X.C019208x;
import X.C02180Ae;
import X.C02L;
import X.C2Op;
import X.InterfaceC05810Qi;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.qrcode.contactqr.BaseQrActivity$RevokeCodeDialogFragment;

/* loaded from: classes2.dex */
public class ContactQrActivity extends C2Op implements InterfaceC05810Qi {
    public C012005w A00;
    public C018508q A01;
    public C02L A02;
    public C002301c A03;

    @Override // X.C2Op, X.AbstractActivityC49982Om, X.C2On, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0R = ((ActivityC02290Ap) this).A0F.A00.getString("contact_qr_code", null);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_contactqr_share, 0, R.string.contact_qr_share).setIcon(C02180Ae.A0O(this, R.drawable.ic_share, R.color.shareIconTint)).setShowAsAction(2);
        menu.add(0, R.id.menuitem_contactqr_revoke, 0, R.string.contact_qr_revoke);
        return true;
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_contactqr_share) {
            A1Q();
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_contactqr_revoke) {
            AUh(new Hilt_BaseQrActivity_RevokeCodeDialogFragment() { // from class: com.whatsapp.qrcode.contactqr.BaseQrActivity$RevokeCodeDialogFragment
                @Override // androidx.fragment.app.DialogFragment
                public Dialog A0z(Bundle bundle) {
                    C019208x c019208x = new C019208x(A09());
                    c019208x.A03(R.string.contact_qr_revoke_title);
                    c019208x.A02(R.string.contact_qr_revoke_subtitle);
                    c019208x.A06(R.string.contact_qr_revoke_ok_button, new DialogInterface.OnClickListener() { // from class: X.3U2
                        {
                            BaseQrActivity$RevokeCodeDialogFragment.this = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            AbstractActivityC49982Om abstractActivityC49982Om = (AbstractActivityC49982Om) A09();
                            if (abstractActivityC49982Om != null) {
                                abstractActivityC49982Om.A1T(true);
                            }
                        }
                    });
                    c019208x.A04(R.string.contact_qr_revoke_cancel_button, null);
                    return c019208x.A00();
                }
            });
            return true;
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }
}
