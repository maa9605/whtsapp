package com.whatsapp.settings;

import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass008;
import X.AnonymousClass011;
import X.C002301c;
import X.C01B;
import X.C01C;
import X.C01o;
import X.C02160Ac;
import X.C02180Ae;
import X.C02L;
import X.C05X;
import X.C06860Vi;
import X.C06C;
import X.C0EG;
import X.C0GA;
import X.C0K1;
import X.C0L5;
import X.C0L7;
import X.C0U1;
import X.C0VJ;
import X.C0W5;
import X.C0Zn;
import X.C2HC;
import X.C2MG;
import X.C2P9;
import X.C35391j4;
import X.C37481mU;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I0_4;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.contact.picker.InviteNonWhatsAppContactPickerActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.qrcode.contactqr.ContactQrActivity;
import com.whatsapp.settings.Settings;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0_2;

/* loaded from: classes2.dex */
public class Settings extends C2P9 {
    public int A00;
    public ImageView A01;
    public C06860Vi A02;
    public C02L A03;
    public C05X A04;
    public C01B A05;
    public C0W5 A06;
    public TextEmojiLabel A07;
    public TextEmojiLabel A08;
    public C0L7 A09;
    public AnonymousClass008 A0A;
    public C0Zn A0B;
    public C0L5 A0C;
    public C06C A0D;
    public AnonymousClass011 A0E;
    public C0EG A0F;
    public C2MG A0G;
    public boolean A0H;
    public boolean A0I;
    public final C0GA A0J = new C0GA() { // from class: X.3od
        {
            Settings.this = this;
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            Settings settings = Settings.this;
            if (settings.A0D == null || abstractC005302j == null) {
                return;
            }
            C02L c02l = settings.A03;
            c02l.A05();
            if (abstractC005302j.equals(c02l.A03)) {
                C02L c02l2 = settings.A03;
                c02l2.A05();
                settings.A0D = c02l2.A01;
                settings.A1P();
            }
        }

        @Override // X.C0GA
        public void A04(UserJid userJid) {
            if (userJid != null) {
                Settings settings = Settings.this;
                C02L c02l = settings.A03;
                c02l.A05();
                if (userJid.equals(c02l.A03)) {
                    settings.A08.A03(settings.A04.A01());
                }
            }
        }
    };
    public final C01o A0K = new C01o() { // from class: X.3oN
        {
            Settings.this = this;
        }

        @Override // X.C01o
        public final void ALd() {
            Settings.this.A0I = true;
        }
    };

    public static void A00(Settings settings, Class cls) {
        if (settings != null) {
            settings.startActivity(new Intent(settings, cls));
            return;
        }
        throw null;
    }

    public static /* synthetic */ void A01(Settings settings, Integer num) {
        C37481mU c37481mU = new C37481mU();
        c37481mU.A00 = num;
        settings.A0E.A0B(c37481mU, null, false);
    }

    public final void A1P() {
        C06C c06c = this.A0D;
        if (c06c != null) {
            this.A0B.A02(c06c, this.A01);
            return;
        }
        C0L7 c0l7 = this.A09;
        int i = this.A00;
        if (c0l7 != null) {
            this.A01.setImageBitmap(C0L7.A01(this, R.drawable.avatar_contact, i, -1.0f));
            return;
        }
        throw null;
    }

    public void lambda$onCreate$2384$Settings(View view) {
        Intent intent = new Intent(this, ContactQrActivity.class);
        intent.putExtra("scan", false);
        startActivity(intent);
    }

    public /* synthetic */ void lambda$onCreate$2385$Settings(View view) {
        if (((ActivityC02290Ap) this).A0I.A0C(387)) {
            Intent intent = new Intent(this, InviteNonWhatsAppContactPickerActivity.class);
            intent.putExtra("invite_source", 11);
            startActivity(intent);
            return;
        }
        C37481mU c37481mU = new C37481mU();
        c37481mU.A00 = 7;
        this.A0E.A0B(c37481mU, null, false);
        this.A06.A01(this, 11);
    }

    public /* synthetic */ void lambda$onCreate$2387$Settings(View view) {
        startActivity(new Intent(this, SettingsAccount.class));
    }

    @Override // X.C2P9, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (C2HC.A00) {
            getWindow().requestFeature(12);
        }
        super.onCreate(bundle);
        setTitle(R.string.settings_general);
        setContentView(R.layout.preferences);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A08(R.string.settings_general);
            A0c.A0L(true);
        }
        C02L c02l = this.A03;
        c02l.A05();
        C0K1 c0k1 = c02l.A01;
        this.A0D = c0k1;
        if (c0k1 == null) {
            Log.i("settings/create/no-me");
            if (((ActivityC02290Ap) this).A0A != null) {
                startActivity(new Intent(this, Main.class));
                finish();
                return;
            }
            throw null;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.pref_profile_small_photo_size);
        this.A00 = dimensionPixelSize;
        this.A0B = this.A0C.A03(dimensionPixelSize, -1.0f);
        ImageView imageView = (ImageView) findViewById(R.id.profile_info_photo);
        this.A01 = imageView;
        imageView.setVisibility(0);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.profile_info_name);
        this.A07 = textEmojiLabel;
        textEmojiLabel.setVisibility(0);
        this.A07.A03(this.A03.A02());
        this.A08 = (TextEmojiLabel) findViewById(R.id.profile_info_status);
        findViewById(R.id.profile_info).setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 29));
        A1P();
        this.A0A.A01(this.A0J);
        ImageView imageView2 = (ImageView) findViewById(R.id.profile_info_qr_code);
        if (this.A05.A0E(C01C.A0K)) {
            imageView2.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 11));
            imageView2.setVisibility(0);
            imageView2.setContentDescription(getString(R.string.settings_qr));
            C02180Ae.A17(imageView2, C02160Ac.A00(this, R.color.settings_icon));
        } else if (this.A05 != null) {
            imageView2.setVisibility(8);
        } else {
            throw null;
        }
        SettingsRowIconText settingsRowIconText = (SettingsRowIconText) findViewById(R.id.settings_help);
        settingsRowIconText.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 30));
        settingsRowIconText.setIcon(new C35391j4(((ActivityC02310Ar) this).A01, C02160Ac.A03(this, R.drawable.ic_settings_help)));
        findViewById(R.id.setting_tell_a_friend).setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 10));
        View findViewById = findViewById(R.id.business_tools);
        View findViewById2 = findViewById(R.id.business_tools_divider);
        findViewById.setVisibility(8);
        findViewById2.setVisibility(8);
        SettingsRowIconText settingsRowIconText2 = (SettingsRowIconText) findViewById(R.id.settings_chat);
        settingsRowIconText2.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 31));
        settingsRowIconText2.setSubText(getString(R.string.chat_settings_description_with_theme));
        SettingsRowIconText settingsRowIconText3 = (SettingsRowIconText) C0VJ.A0A(this, R.id.settings_data_usage);
        settingsRowIconText3.setText(getString(R.string.settings_storage_and_data_usage_enhanced));
        settingsRowIconText3.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 32));
        findViewById(R.id.settings_notifications).setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 33));
        findViewById(R.id.settings_account_info).setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 9));
        this.A0I = false;
        C002301c c002301c = ((ActivityC02310Ar) this).A01;
        c002301c.A0A.add(this.A0K);
        this.A0H = true;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.A0H) {
            this.A0A.A00(this.A0J);
            this.A0B.A00();
            C002301c c002301c = ((ActivityC02310Ar) this).A01;
            c002301c.A0A.remove(this.A0K);
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        if (this.A0I) {
            this.A0I = false;
            finish();
            startActivity(getIntent());
        }
        super.onResume();
        C02L c02l = this.A03;
        c02l.A05();
        this.A0D = c02l.A01;
        this.A07.A03(this.A03.A02());
        this.A08.A03(this.A04.A01());
    }
}
