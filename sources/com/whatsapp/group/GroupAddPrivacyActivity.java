package com.whatsapp.group;

import X.ActivityC02290Ap;
import X.C000500h;
import X.C01C;
import X.C0U1;
import X.C2O0;
import X.C2O2;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape9S0100000_I0_1;

/* loaded from: classes2.dex */
public class GroupAddPrivacyActivity extends C2O2 implements C2O0 {
    public int A00;
    public RadioButton A01;
    public RadioButton A02;
    public RadioButton A03;
    public RadioButton A04;
    public C000500h A05;
    public boolean A06 = false;

    public static void A00(GroupAddPrivacyActivity groupAddPrivacyActivity, int i) {
        if (groupAddPrivacyActivity == null) {
            throw null;
        }
        if (i == 3) {
            Intent intent = new Intent(groupAddPrivacyActivity, GroupAddBlacklistPickerActivity.class);
            intent.putExtra("was_nobody", groupAddPrivacyActivity.A06);
            groupAddPrivacyActivity.startActivityForResult(intent, 1);
            return;
        }
        groupAddPrivacyActivity.A00 = i;
    }

    public final void A1P() {
        this.A02.setChecked(this.A00 == 1);
        this.A01.setChecked(this.A00 == 0);
        this.A04.setChecked(this.A00 == 2);
        this.A03.setChecked(this.A00 == 3);
    }

    @Override // X.C2O0
    public void A6W() {
        Intent intent = new Intent();
        intent.putExtra("groupadd", this.A00);
        setResult(-1, intent);
        finish();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == -1) {
                this.A00 = 3;
                Intent intent2 = new Intent();
                intent2.putExtra("groupadd", this.A00);
                setResult(-1, intent2);
                finish();
            }
            A1P();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.C2O2, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.group_add_privacy);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            A0c.A08(R.string.settings_privacy_group_add_permissions);
            this.A02 = (RadioButton) findViewById(R.id.my_contacts_btn);
            this.A01 = (RadioButton) findViewById(R.id.everyone_btn);
            this.A04 = (RadioButton) findViewById(R.id.nobody_btn);
            this.A03 = (RadioButton) findViewById(R.id.my_contacts_except_btn);
            this.A02.setText(R.string.privacy_contacts);
            this.A01.setText(R.string.privacy_everyone);
            this.A04.setText(R.string.privacy_nobody);
            this.A03.setText(R.string.group_add_permission_blacklist);
            this.A02.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 19));
            this.A01.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 20));
            this.A04.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 21));
            this.A03.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 22));
            this.A00 = this.A05.A00.getInt("privacy_groupadd", 0);
            if (((ActivityC02290Ap) this).A0B.A0E(C01C.A0y)) {
                this.A06 = this.A00 == 2;
                this.A04.setEnabled(false);
                if (this.A06) {
                    this.A04.setVisibility(0);
                } else {
                    this.A04.setVisibility(8);
                }
                this.A03.setVisibility(0);
            }
            A1P();
            findViewById(R.id.confirm_change_btn).setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 23));
            return;
        }
        throw null;
    }
}
