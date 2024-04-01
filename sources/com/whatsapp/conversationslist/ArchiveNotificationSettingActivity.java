package com.whatsapp.conversationslist;

import X.AbstractActivityC49892Ne;
import X.C000500h;
import X.C0U1;
import X.C0VJ;
import X.C41521u3;
import X.InterfaceC002901k;
import android.os.Bundle;
import android.widget.CompoundButton;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.WaSwitchView;
import com.whatsapp.conversationslist.ArchiveNotificationSettingActivity;

/* loaded from: classes2.dex */
public class ArchiveNotificationSettingActivity extends AbstractActivityC49892Ne {
    public C000500h A00;
    public C41521u3 A01;
    public InterfaceC002901k A02;

    @Override // X.AbstractActivityC49892Ne, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
        }
        setContentView(R.layout.archive_notification_activity);
        setTitle(R.string.archive_settings);
        WaSwitchView waSwitchView = (WaSwitchView) C0VJ.A0A(this, R.id.notify_new_message_switch_view);
        waSwitchView.setChecked(true ^ this.A00.A0l());
        waSwitchView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: X.2so
            {
                ArchiveNotificationSettingActivity.this = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ArchiveNotificationSettingActivity archiveNotificationSettingActivity = ArchiveNotificationSettingActivity.this;
                InterfaceC002901k interfaceC002901k = archiveNotificationSettingActivity.A02;
                C41521u3 c41521u3 = archiveNotificationSettingActivity.A01;
                C000500h c000500h = archiveNotificationSettingActivity.A00;
                boolean z2 = !z;
                interfaceC002901k.AS1(new RunnableEBaseShape0S0110000_I0(c41521u3, z2, 4));
                c000500h.A0D().putBoolean("notify_new_message_for_archived_chats", z2).apply();
            }
        });
        waSwitchView.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(waSwitchView, 30));
        WaSwitchView waSwitchView2 = (WaSwitchView) C0VJ.A0A(this, R.id.auto_hide_switch_view);
        waSwitchView2.setChecked(this.A00.A00.getBoolean("auto_archive_inactive_chats", false));
        waSwitchView2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: X.2sn
            {
                ArchiveNotificationSettingActivity.this = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C000200d.A0j(ArchiveNotificationSettingActivity.this.A00, "auto_archive_inactive_chats", z);
            }
        });
        waSwitchView2.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(waSwitchView2, 31));
        waSwitchView2.setVisibility(8);
    }
}
