package com.whatsapp.companiondevice;

import X.ActivityC02290Ap;
import X.C018508q;
import X.C0U1;
import X.C2J4;
import X.C2J5;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.companiondevice.LinkedDevicesLogoutOneDeviceConfirmationDialogFragment;
import com.whatsapp.companiondevice.PairedDevicesActivity;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.util.ViewOnClickCListenerShape8S0100000_I0_0;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class PairedDevicesActivity extends C2J4 {
    public View A00;
    public View A01;
    public C2J5 A02;
    public HashMap A03;
    public final Runnable A04 = new RunnableEBaseShape1S0100000_I0_1(this, 26);

    @Override // X.C2J4, X.C20R, X.C20S, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.whatsapp_web);
        this.A03 = new HashMap();
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            setContentView(R.layout.web_sessions);
            ListView listView = (ListView) findViewById(16908298);
            View inflate = getLayoutInflater().inflate(R.layout.web_sessions_header, (ViewGroup) null, false);
            this.A01 = inflate.findViewById(R.id.header);
            listView.addHeaderView(inflate, null, false);
            View inflate2 = getLayoutInflater().inflate(R.layout.web_sessions_footer, (ViewGroup) null, false);
            this.A00 = inflate2.findViewById(R.id.footer);
            inflate2.findViewById(R.id.logout_all).setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 25));
            ((TextView) inflate2.findViewById(R.id.hint)).setText(R.string.qr_code_hint_2);
            listView.addFooterView(inflate2, null, false);
            this.A02 = new C2J5(this);
            A1Q();
            listView.setVisibility(0);
            listView.setAdapter((ListAdapter) this.A02);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: X.2pM
                {
                    PairedDevicesActivity.this = this;
                }

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    PairedDevicesActivity pairedDevicesActivity = PairedDevicesActivity.this;
                    if (!pairedDevicesActivity.A1F(R.string.connectivity_check_connection)) {
                        Object item = pairedDevicesActivity.A02.getItem(i - 1);
                        if (item instanceof C42881wU) {
                            String str = ((C42881wU) item).A0F;
                            LinkedDevicesLogoutOneDeviceConfirmationDialogFragment linkedDevicesLogoutOneDeviceConfirmationDialogFragment = new LinkedDevicesLogoutOneDeviceConfirmationDialogFragment(((C20R) pairedDevicesActivity).A0B);
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("browserId", str);
                            linkedDevicesLogoutOneDeviceConfirmationDialogFragment.A0P(bundle2);
                            linkedDevicesLogoutOneDeviceConfirmationDialogFragment.A14(pairedDevicesActivity.A0N(), null);
                            return;
                        }
                        DeviceJid deviceJid = ((C0JV) item).A05;
                        LinkedDevicesLogoutOneDeviceConfirmationDialogFragment linkedDevicesLogoutOneDeviceConfirmationDialogFragment2 = new LinkedDevicesLogoutOneDeviceConfirmationDialogFragment(((C20R) pairedDevicesActivity).A0B);
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("deviceJid", deviceJid.getRawString());
                        linkedDevicesLogoutOneDeviceConfirmationDialogFragment2.A0P(bundle3);
                        linkedDevicesLogoutOneDeviceConfirmationDialogFragment2.A14(pairedDevicesActivity.A0N(), null);
                    }
                }
            });
            C018508q c018508q = ((ActivityC02290Ap) this).A0A;
            c018508q.A02.postDelayed(this.A04, 30000L);
            return;
        }
        throw null;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_scan_qr, 0, R.string.menuitem_scan_qr).setIcon(R.drawable.ic_action_add).setShowAsAction(2);
        return true;
    }

    @Override // X.C20R, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C018508q c018508q = ((ActivityC02290Ap) this).A0A;
        c018508q.A02.removeCallbacks(this.A04);
        for (CountDownTimer countDownTimer : this.A03.values()) {
            countDownTimer.cancel();
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_scan_qr) {
            if (!A1E()) {
                startActivity(new Intent(this, DevicePairQrScannerActivity.class));
            }
            return true;
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }
}
