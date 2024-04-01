package com.whatsapp.phonematching;

import X.ActivityC02270An;
import X.C000700j;
import X.C018308n;
import X.C02L;
import X.C0EG;
import X.C2Aa;
import X.HandlerC70483Sl;
import X.InterfaceC49772Mh;
import X.InterfaceC51192Ux;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.phonematching.ConnectionUnavailableDialogFragment;
import com.whatsapp.phonematching.MatchPhoneNumberFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class MatchPhoneNumberFragment extends Hilt_MatchPhoneNumberFragment {
    public C02L A00;
    public ActivityC02270An A01;
    public C0EG A02;
    public HandlerC70483Sl A03;
    public C2Aa A04;
    public final InterfaceC51192Ux A05 = new InterfaceC51192Ux() { // from class: X.3kL
        @Override // X.InterfaceC51192Ux
        public void AMU(int i) {
            sendEmptyMessage(3);
        }

        @Override // X.InterfaceC51192Ux
        public void AMV(String str) {
            MatchPhoneNumberFragment matchPhoneNumberFragment = MatchPhoneNumberFragment.this;
            C02L c02l = matchPhoneNumberFragment.A00;
            c02l.A05();
            UserJid userJid = c02l.A03;
            if (userJid != null) {
                String str2 = userJid.user;
                if (str2 != null) {
                    matchPhoneNumberFragment.A03.sendEmptyMessage(str2.equals(str) ? 1 : 2);
                    return;
                }
                throw null;
            }
            throw null;
        }
    };

    public static void A00(ActivityC02270An activityC02270An) {
        DialogFragment dialogFragment = (DialogFragment) activityC02270An.A0N().A0Q.A01("PROGRESS");
        if (dialogFragment != null) {
            dialogFragment.A11();
        }
    }

    @Override // X.C0BA
    public void A0q() {
        C2Aa c2Aa = this.A04;
        c2Aa.A0l.remove(this.A05);
        removeMessages(4);
        ((CountryAndPhoneNumberFragment) this).A0B = null;
        this.A0U = true;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.3Sl] */
    @Override // com.whatsapp.phonematching.Hilt_MatchPhoneNumberFragment, com.whatsapp.phonematching.CountryAndPhoneNumberFragment, com.whatsapp.phonematching.Hilt_CountryAndPhoneNumberFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        ActivityC02270An activityC02270An = (ActivityC02270An) C018308n.A01(context, ActivityC02270An.class);
        this.A01 = activityC02270An;
        C000700j.A08(activityC02270An instanceof InterfaceC49772Mh, "activity needs to implement PhoneNumberMatchingCallback");
        final ActivityC02270An activityC02270An2 = this.A01;
        final InterfaceC49772Mh interfaceC49772Mh = (InterfaceC49772Mh) activityC02270An2;
        if (this.A03 == null) {
            this.A03 = new Handler(activityC02270An2, interfaceC49772Mh) { // from class: X.3Sl
                public final InterfaceC49772Mh A00;
                public final WeakReference A01;

                {
                    super(Looper.getMainLooper());
                    this.A01 = new WeakReference(activityC02270An2);
                    this.A00 = interfaceC49772Mh;
                }

                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    ActivityC02270An activityC02270An3 = (ActivityC02270An) this.A01.get();
                    if (activityC02270An3 == null) {
                        StringBuilder sb = new StringBuilder("MatchPhoneNumberFragment was garbage collected with active messages still enqueued: ");
                        sb.append(message);
                        Log.w(sb.toString());
                    }
                    int i = message.what;
                    if (i == 1) {
                        Log.i("MatchPhoneNumberFragment/check-number/match");
                        removeMessages(4);
                        if (activityC02270An3 == null) {
                            return;
                        }
                        MatchPhoneNumberFragment.A00(activityC02270An3);
                        this.A00.ALn();
                    } else if (i == 2) {
                        Log.w("MatchPhoneNumberFragment/check-number/mismatch");
                        removeMessages(4);
                        if (activityC02270An3 == null) {
                            return;
                        }
                        MatchPhoneNumberFragment.A00(activityC02270An3);
                        this.A00.AMF();
                    } else if (i == 3) {
                        Log.e("MatchPhoneNumberFragment/error");
                        if (activityC02270An3 == null) {
                            return;
                        }
                        MatchPhoneNumberFragment.A00(activityC02270An3);
                        Bundle bundle = new Bundle();
                        ConnectionUnavailableDialogFragment connectionUnavailableDialogFragment = new ConnectionUnavailableDialogFragment();
                        connectionUnavailableDialogFragment.A0P(bundle);
                        connectionUnavailableDialogFragment.A14(activityC02270An3.A0N(), "CONNECTION ERROR");
                    } else if (i == 4) {
                        Log.w("MatchPhoneNumberFragment/timeout");
                        removeMessages(4);
                        if (activityC02270An3 != null) {
                            MatchPhoneNumberFragment.A00(activityC02270An3);
                            Bundle bundle2 = new Bundle();
                            ConnectionUnavailableDialogFragment connectionUnavailableDialogFragment2 = new ConnectionUnavailableDialogFragment();
                            connectionUnavailableDialogFragment2.A0P(bundle2);
                            connectionUnavailableDialogFragment2.A14(activityC02270An3.A0N(), "CONNECTION ERROR");
                        }
                    }
                }
            };
        }
    }

    @Override // X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        C2Aa c2Aa = this.A04;
        c2Aa.A0l.add(this.A05);
        ((CountryAndPhoneNumberFragment) this).A0B = this;
    }
}
