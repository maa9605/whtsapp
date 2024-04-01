package X;

import X.C019208x;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.Hilt_SimpleExternalStorageStateCallback_PermissionDeniedDialogFragment;
import com.whatsapp.SimpleExternalStorageStateCallback$SDCardUnavailableDialogFragment;

/* renamed from: X.1jG  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C35511jG implements InterfaceC05880Qp {
    public final ActivityC02330At A00;

    public C35511jG(ActivityC02330At activityC02330At) {
        this.A00 = activityC02330At;
    }

    public static void A00(ActivityC02330At activityC02330At) {
        AbstractC02800Cx A0N = activityC02330At.A0N();
        if (A0N != null) {
            C02820Cz c02820Cz = new C02820Cz(A0N);
            c02820Cz.A09(0, new Hilt_SimpleExternalStorageStateCallback_PermissionDeniedDialogFragment() { // from class: com.whatsapp.SimpleExternalStorageStateCallback$PermissionDeniedDialogFragment
                @Override // androidx.fragment.app.DialogFragment
                public Dialog A0z(Bundle bundle) {
                    C019208x c019208x = new C019208x(A09());
                    c019208x.A03(R.string.alert);
                    c019208x.A02(R.string.permission_storage_need_access);
                    c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.1IY
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    return c019208x.A00();
                }
            }, null, 1);
            c02820Cz.A05();
            return;
        }
        throw null;
    }

    public static void A01(ActivityC02330At activityC02330At) {
        AbstractC02800Cx A0N = activityC02330At.A0N();
        if (A0N != null) {
            C02820Cz c02820Cz = new C02820Cz(A0N);
            c02820Cz.A09(0, new SimpleExternalStorageStateCallback$SDCardUnavailableDialogFragment(), null, 1);
            c02820Cz.A05();
            return;
        }
        throw null;
    }

    @Override // X.InterfaceC05880Qp
    public void ANZ(String str) {
        A01(this.A00);
    }

    @Override // X.InterfaceC05880Qp
    public void ANa() {
        A00(this.A00);
    }

    @Override // X.InterfaceC05880Qp
    public void AQ0(String str) {
        A01(this.A00);
    }

    @Override // X.InterfaceC05880Qp
    public void AQ1() {
        A00(this.A00);
    }
}
