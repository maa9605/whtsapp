package com.whatsapp.companiondevice;

import X.AbstractC04890Mh;
import X.AbstractC15100o5;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.C000800k;
import X.C018508q;
import X.C01B;
import X.C01C;
import X.C05050Nc;
import X.C0CG;
import X.C0E7;
import X.C0EE;
import X.C0U1;
import X.C20R;
import X.C2IM;
import X.C2IT;
import X.C41541u6;
import X.C41741uR;
import X.C44331yt;
import X.C44441z5;
import X.C46W;
import X.C650835v;
import X.InterfaceC001000m;
import X.InterfaceC55912mO;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.biometric.BiometricAuthPlugin;
import com.whatsapp.companiondevice.LinkedDevicesActivity;
import com.whatsapp.companiondevice.optin.ui.FirstTimeExperienceDialogFragment;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class LinkedDevicesActivity extends C2IM implements DialogInterface.OnDismissListener {
    public RecyclerView A00;
    public C018508q A01;
    public C01B A02;
    public BiometricAuthPlugin A03;
    public C2IT A04;
    public LinkedDevicesDetailDialogFragment A05;
    public C44441z5 A06;
    public C41541u6 A07;
    public C44331yt A08;
    public C000800k A09;
    public C0E7 A0A;
    public C41741uR A0B;
    public C05050Nc A0C;
    public C0EE A0D;
    public Runnable A0E;
    public List A0F = new ArrayList();
    public final InterfaceC001000m A0H = new InterfaceC001000m() { // from class: X.35k
        {
            LinkedDevicesActivity.this = this;
        }

        @Override // X.InterfaceC001000m
        public final void AIx(C05050Nc c05050Nc) {
            DialogFragment dialogFragment;
            Dialog dialog;
            LinkedDevicesActivity linkedDevicesActivity = LinkedDevicesActivity.this;
            C0BA A01 = linkedDevicesActivity.A0N().A0Q.A01("wifi_speed_bump_dialog");
            if (A01 instanceof DialogFragment) {
                dialogFragment = (DialogFragment) A01;
            } else {
                dialogFragment = null;
            }
            C05050Nc c05050Nc2 = linkedDevicesActivity.A0C;
            if ((c05050Nc2 == null || c05050Nc2.A00 != c05050Nc.A00) && c05050Nc.A00 == 1 && dialogFragment != null && (dialog = dialogFragment.A03) != null && dialog.isShowing()) {
                dialogFragment.A10();
                linkedDevicesActivity.A1U();
            }
            linkedDevicesActivity.A0C = c05050Nc;
        }
    };
    public final C0CG A0I = new C0CG() { // from class: X.35t
        {
            LinkedDevicesActivity.this = this;
        }

        @Override // X.C0CG
        public void A54(Object obj) {
            Map map = (Map) obj;
            C2IT c2it = LinkedDevicesActivity.this.A04;
            for (C650135o c650135o : c2it.A00) {
                if (!c650135o.A00()) {
                    Boolean bool = (Boolean) map.get(c650135o.A05);
                    c650135o.A00 = bool == null ? false : bool.booleanValue();
                }
            }
            ((AbstractC04890Mh) c2it).A01.A00();
        }
    };
    public final AbstractC15100o5 A0G = new AbstractC15100o5() { // from class: X.35u
        {
            LinkedDevicesActivity.this = this;
        }

        @Override // X.AbstractC15100o5
        public void A00() {
            LinkedDevicesActivity linkedDevicesActivity = LinkedDevicesActivity.this;
            C018508q c018508q = linkedDevicesActivity.A01;
            c018508q.A02.post(new RunnableEBaseShape1S0100000_I0_1(linkedDevicesActivity, 19));
        }
    };
    public final Comparator A0J = new Comparator() { // from class: X.2pJ
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return (((C42881wU) obj2).A04 > ((C42881wU) obj).A04 ? 1 : (((C42881wU) obj2).A04 == ((C42881wU) obj).A04 ? 0 : -1));
        }
    };

    public final void A1U() {
        if (A1E()) {
            return;
        }
        if (this.A02.A0E(C01C.A1F) && this.A03.A01()) {
            this.A03.A00();
        } else {
            startActivity(new Intent(this, DevicePairQrScannerActivity.class));
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            A1Q();
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C018508q c018508q = this.A01;
        c018508q.A02.post(new RunnableEBaseShape1S0100000_I0_1(this, 19));
    }

    @Override // X.C2IM, X.C20R, X.C20S, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C46W.A07(this.A02)) {
            setTitle(R.string.linked_devices_screen_title);
        } else {
            setTitle(R.string.whatsapp_web);
        }
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            setContentView(R.layout.linked_devices_activity);
            this.A03 = new BiometricAuthPlugin(((ActivityC02290Ap) this).A0I, this.A01, ((ActivityC02290Ap) this).A08, this, new InterfaceC55912mO() { // from class: X.35m
                {
                    LinkedDevicesActivity.this = this;
                }

                @Override // X.InterfaceC55912mO
                public final void AHY(int i) {
                    LinkedDevicesActivity linkedDevicesActivity = LinkedDevicesActivity.this;
                    if (i != 1) {
                        linkedDevicesActivity.startActivity(new Intent(linkedDevicesActivity, DevicePairQrScannerActivity.class));
                    }
                }
            });
            C41741uR c41741uR = this.A0B;
            c41741uR.A02.execute(new RunnableEBaseShape0S0300000_I0_0(c41741uR, this.A0I, this.A01.A06, 20));
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.linked_device_recycler_view);
            this.A00 = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            C2IT c2it = new C2IT(new C650835v(this), ((C20R) this).A09, ((ActivityC02310Ar) this).A01, this.A0D, ((C20R) this).A03);
            this.A04 = c2it;
            this.A00.setAdapter(c2it);
            C2IT c2it2 = this.A04;
            ((AbstractC04890Mh) c2it2).A01.registerObserver(this.A0G);
            A1Q();
            this.A09.A01(this.A0H);
            this.A0C = this.A09.A02();
            C0EE c0ee = this.A0D;
            if (!c0ee.A03() || c0ee.A03.A00.getBoolean("md_opt_in_first_time_experience_shown", false)) {
                return;
            }
            ((ActivityC02290Ap) this).A0F.A0D().putBoolean("md_opt_in_first_time_experience_shown", true).apply();
            new FirstTimeExperienceDialogFragment().A14(A0N(), null);
            return;
        }
        throw null;
    }

    @Override // X.C20R, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        C41741uR c41741uR = this.A0B;
        c41741uR.A00.A02(this.A0I);
        this.A09.A00(this.A0H);
        C2IT c2it = this.A04;
        ((AbstractC04890Mh) c2it).A01.unregisterObserver(this.A0G);
        super.onDestroy();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.A05 = null;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        ((C20R) this).A07.AS1(new RunnableEBaseShape1S0100000_I0_1(this, 18));
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        super.onStop();
        Runnable runnable = this.A0E;
        if (runnable != null) {
            ((C20R) this).A07.ART(runnable);
        }
    }
}
