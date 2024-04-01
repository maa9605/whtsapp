package com.whatsapp.settings;

import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.AnonymousClass029;
import X.C018308n;
import X.C018508q;
import X.C01C;
import X.C02E;
import X.C06870Vj;
import X.C0AT;
import X.C0EE;
import X.C0U1;
import X.C2PQ;
import X.C40071rX;
import X.C72613aJ;
import android.net.Uri;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.settings.SettingsSecurity;

/* loaded from: classes2.dex */
public class SettingsSecurity extends C2PQ {
    public C06870Vj A00;
    public C0EE A01;
    public C40071rX A02;

    @Override // X.C2PQ, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        Uri A02;
        super.onCreate(bundle);
        setTitle(R.string.settings_security);
        setContentView(R.layout.settings_security);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            CompoundButton compoundButton = (CompoundButton) findViewById(R.id.security_notifications);
            compoundButton.setChecked(((ActivityC02290Ap) this).A0F.A00.getBoolean("security_notifications", false));
            compoundButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: X.3WF
                {
                    SettingsSecurity.this = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton2, boolean z) {
                    C000200d.A0j(((ActivityC02290Ap) SettingsSecurity.this).A0F, "security_notifications", z);
                }
            });
            C018508q c018508q = ((ActivityC02290Ap) this).A0A;
            C018308n c018308n = ((ActivityC02270An) this).A00;
            C02E c02e = ((ActivityC02290Ap) this).A0E;
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.settings_security_toggle_info);
            if (this.A01.A02()) {
                i = R.string.settings_security_notifications_toggle_info_md;
            } else {
                boolean A0E = ((ActivityC02290Ap) this).A0B.A0E(C01C.A0X);
                i = R.string.settings_security_notifications_toggle_info;
                if (A0E) {
                    i = R.string.settings_security_notifications_toggle_info_v2;
                }
            }
            String string = getString(i, "learn-more");
            if (this.A01.A02()) {
                A02 = this.A02.A03("general", "md-placeholder", null);
            } else {
                A02 = this.A02.A02("security-and-privacy", "security-code-change-notification");
            }
            AnonymousClass029.A16(this, c018508q, c018308n, c02e, textEmojiLabel, string, new C72613aJ(A02));
            C018508q c018508q2 = ((ActivityC02290Ap) this).A0A;
            C018308n c018308n2 = ((ActivityC02270An) this).A00;
            C02E c02e2 = ((ActivityC02290Ap) this).A0E;
            TextEmojiLabel textEmojiLabel2 = (TextEmojiLabel) C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.settings_security_info_text);
            boolean A0E2 = ((ActivityC02290Ap) this).A0B.A0E(C01C.A0X);
            int i2 = R.string.settings_security_info_with_link;
            if (A0E2) {
                i2 = R.string.settings_security_info_with_link_v2;
            }
            AnonymousClass029.A16(this, c018508q2, c018308n2, c02e2, textEmojiLabel2, getString(i2, "learn-more"), new C72613aJ(this.A00.A00("https://www.whatsapp.com/security")));
            TextView textView = (TextView) C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.settings_security_toggle_title);
            boolean A022 = this.A01.A02();
            int i3 = R.string.settings_security_notifications_toggle_title;
            if (A022) {
                i3 = R.string.settings_security_notifications_toggle_title_md;
            }
            textView.setText(i3);
            findViewById(R.id.security_notifications_group).setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(compoundButton, 11));
            return;
        }
        throw null;
    }
}
