package com.whatsapp.settings;

import X.ActivityC02310Ar;
import X.AnonymousClass029;
import X.C000200d;
import X.C000500h;
import X.C002701i;
import X.C018308n;
import X.C018808t;
import X.C019208x;
import X.C02160Ac;
import X.C02180Ae;
import X.C02E;
import X.C02F;
import X.C06870Vj;
import X.C0E7;
import X.C0U1;
import X.C0We;
import X.C2DT;
import X.C2MG;
import X.C2PI;
import X.C34701hx;
import X.C35391j4;
import X.C40071rX;
import X.InterfaceC002901k;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I0_4;
import com.google.android.search.verification.client.R;
import com.whatsapp.settings.SettingsHelp;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class SettingsHelp extends C2PI {
    public C018308n A00;
    public C06870Vj A01;
    public C0E7 A02;
    public C02E A03;
    public C02F A04;
    public C000500h A05;
    public C018808t A06;
    public C2DT A07;
    public C2MG A08;
    public C40071rX A09;
    public InterfaceC002901k A0A;

    public /* synthetic */ void lambda$onCreate$2329$SettingsHelp(View view) {
        this.A00.A06(this, new Intent("android.intent.action.VIEW", this.A09.A03("android", null, null)));
    }

    public /* synthetic */ void lambda$onCreate$2330$SettingsHelp(View view) {
        if (!this.A02.A05()) {
            Log.i("about/no-connectivity");
            C002701i.A19(this, 102);
            return;
        }
        String string = this.A05.A00.getString("change_number_new_number_banned", null);
        this.A0A.ARy(new C34701hx(this, this.A03, this.A06, this.A02, this.A04, this.A07, false, true, false, string == null ? "settings/about" : C000200d.A0H("settings/about/chnum ", string), null), new String[0]);
    }

    public /* synthetic */ void lambda$onCreate$2331$SettingsHelp(View view) {
        this.A00.A06(this, new Intent("android.intent.action.VIEW", this.A01.A00("https://www.whatsapp.com/legal/")));
    }

    public /* synthetic */ void lambda$onCreate$2332$SettingsHelp(View view) {
        startActivity(new Intent(this, About.class));
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.A06.A01() && i == 17 && i2 == -1 && intent != null && intent.getIntExtra("com.whatsapp.inappsupport.ui.ContactUsActvity.support_type", -1) == 1) {
            new AlertDialog.Builder(this).setMessage(getString(R.string.chat_support_dialog_message)).setCancelable(true).setPositiveButton(getString(R.string.ok), new DialogInterface.OnClickListener() { // from class: X.0jm
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    dialogInterface.dismiss();
                }
            }).create().show();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.C2PI, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.settings_help);
        setContentView(R.layout.preferences_help);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            View findViewById = findViewById(R.id.faq_preference);
            View findViewById2 = findViewById(R.id.contact_us_preference);
            View findViewById3 = findViewById(R.id.terms_and_privacy_preference);
            View findViewById4 = findViewById(R.id.about_preference);
            int A03 = AnonymousClass029.A03(this, R.attr.settingsIconColor, R.color.settings_icon);
            ImageView imageView = (ImageView) findViewById.findViewById(R.id.settings_row_icon);
            imageView.setImageDrawable(new C35391j4(((ActivityC02310Ar) this).A01, C02160Ac.A03(this, R.drawable.ic_settings_help)));
            C02180Ae.A17(imageView, A03);
            C02180Ae.A17((ImageView) findViewById2.findViewById(R.id.settings_row_icon), A03);
            ImageView imageView2 = (ImageView) findViewById3.findViewById(R.id.settings_row_icon);
            imageView2.setImageDrawable(new C0We(((ActivityC02310Ar) this).A01, C02160Ac.A03(this, R.drawable.ic_settings_terms_policy)));
            C02180Ae.A17(imageView2, A03);
            C02180Ae.A17((ImageView) findViewById4.findViewById(R.id.settings_row_icon), A03);
            findViewById.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 35));
            findViewById2.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 33));
            ((TextView) findViewById3.findViewById(R.id.settings_row_text)).setText(R.string.settings_terms_and_privacy_policy);
            findViewById3.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 34));
            findViewById4.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 36));
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i == 102) {
            C019208x c019208x = new C019208x(this);
            c019208x.A03(R.string.no_internet_title);
            c019208x.A01.A0E = getString(R.string.register_no_internet_connectivity, getString(R.string.connectivity_self_help_instructions));
            c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3WA
                {
                    SettingsHelp.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C002701i.A18(SettingsHelp.this, 102);
                }
            });
            return c019208x.A00();
        } else if (i == 122) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage(getString(R.string.register_connecting));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            return progressDialog;
        } else if (i != 123) {
            return super.onCreateDialog(i);
        } else {
            C019208x c019208x2 = new C019208x(this);
            c019208x2.A02(R.string.settings_network_service_unavailable);
            c019208x2.A06(R.string.ok_short, new DialogInterface.OnClickListener() { // from class: X.3WB
                {
                    SettingsHelp.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C002701i.A18(SettingsHelp.this, 123);
                }
            });
            return c019208x2.A00();
        }
    }
}
