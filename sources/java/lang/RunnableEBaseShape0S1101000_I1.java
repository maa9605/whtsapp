package java.lang;

import X.AbstractActivityC49982Om;
import X.ActivityC02290Ap;
import X.C000200d;
import X.C019208x;
import X.C79553lq;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.qrcode.contactqr.BaseQrActivity$TryAgainDialogFragment;
import com.whatsapp.qrcode.contactqr.ContactQrContactCardView;
import com.whatsapp.qrcode.contactqr.ContactQrMyCodeFragment;
import com.whatsapp.qrcode.contactqr.Hilt_BaseQrActivity_TryAgainDialogFragment;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S1101000_I1 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public Object A01;
    public String A02;
    public final int A03;

    public RunnableEBaseShape0S1101000_I1(Object obj, String str, int i, int i2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A02 = str;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A03) {
            case 0:
                AbstractActivityC49982Om abstractActivityC49982Om = (AbstractActivityC49982Om) this.A01;
                String str = this.A02;
                int i = this.A00;
                abstractActivityC49982Om.A0V = false;
                abstractActivityC49982Om.ARS();
                if (str == null) {
                    if (i == 0) {
                        if (abstractActivityC49982Om.A0R == null) {
                            ((ActivityC02290Ap) abstractActivityC49982Om).A0A.A07(R.string.no_internet_message, 1);
                            return;
                        }
                        return;
                    } else if (abstractActivityC49982Om.A0W) {
                        abstractActivityC49982Om.AUj(R.string.contact_qr_revoke_failure);
                        return;
                    } else {
                        abstractActivityC49982Om.AUh(new Hilt_BaseQrActivity_TryAgainDialogFragment() { // from class: com.whatsapp.qrcode.contactqr.BaseQrActivity$TryAgainDialogFragment
                            @Override // androidx.fragment.app.DialogFragment
                            public Dialog A0z(Bundle bundle) {
                                C019208x c019208x = new C019208x(A09());
                                c019208x.A02(R.string.contact_qr_failed_title);
                                c019208x.A06(R.string.contact_qr_try_again, new DialogInterface.OnClickListener() { // from class: X.3U4
                                    {
                                        BaseQrActivity$TryAgainDialogFragment.this = this;
                                    }

                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i2) {
                                        AbstractActivityC49982Om abstractActivityC49982Om2 = (AbstractActivityC49982Om) A09();
                                        if (abstractActivityC49982Om2 != null) {
                                            abstractActivityC49982Om2.A1T(false);
                                        }
                                    }
                                });
                                c019208x.A04(R.string.contact_qr_failed_go_back, new DialogInterface.OnClickListener() { // from class: X.3U3
                                    {
                                        BaseQrActivity$TryAgainDialogFragment.this = this;
                                    }

                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i2) {
                                        ActivityC02330At A09 = A09();
                                        if (A09 != null) {
                                            A09.finish();
                                        }
                                    }
                                });
                                return c019208x.A00();
                            }
                        });
                        return;
                    }
                }
                abstractActivityC49982Om.A0R = str;
                ContactQrMyCodeFragment contactQrMyCodeFragment = abstractActivityC49982Om.A0N;
                if (contactQrMyCodeFragment != null) {
                    contactQrMyCodeFragment.A02 = str;
                    ContactQrContactCardView contactQrContactCardView = contactQrMyCodeFragment.A01;
                    if (contactQrContactCardView != null) {
                        contactQrContactCardView.setQrCode(C000200d.A0H("https://wa.me/qr/", str));
                    }
                }
                if (abstractActivityC49982Om.A0W) {
                    abstractActivityC49982Om.AUj(R.string.contact_qr_revoke_success);
                    return;
                }
                return;
            case 1:
                String str2 = this.A02;
                int i2 = this.A00;
                AbstractActivityC49982Om abstractActivityC49982Om2 = (AbstractActivityC49982Om) ((C79553lq) this.A01).A02.A00.get();
                if (abstractActivityC49982Om2 != null) {
                    if (str2 != null || i2 != 0) {
                        C000200d.A0i(((ActivityC02290Ap) abstractActivityC49982Om2).A0F, "contact_qr_code", str2);
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime() - abstractActivityC49982Om2.A00;
                    ((ActivityC02290Ap) abstractActivityC49982Om2).A0A.A02.postDelayed(new RunnableEBaseShape0S1101000_I1(abstractActivityC49982Om2, str2, i2, 0), elapsedRealtime < 500 ? 500 - elapsedRealtime : 0L);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
