package com.whatsapp.settings;

import X.ActivityC02310Ar;
import X.AnonymousClass029;
import X.C000200d;
import X.C000500h;
import X.C002701i;
import X.C019208x;
import X.C03370Fl;
import X.C03480Fw;
import X.C0CB;
import X.C0DU;
import X.C0U1;
import X.C2PO;
import X.InterfaceC002901k;
import X.InterfaceC04910Mk;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I0_4;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.dialogs.FAQLearnMoreDialogFragment;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.settings.SettingsNotifications;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class SettingsNotifications extends C2PO implements InterfaceC04910Mk {
    public static final int[] A0l = {R.string.color_none, R.string.color_white, R.string.color_red, R.string.color_yellow, R.string.color_green, R.string.color_cyan, R.string.color_blue, R.string.color_purple};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public View A0I;
    public View A0J;
    public TextView A0K;
    public TextView A0L;
    public TextView A0M;
    public TextView A0N;
    public TextView A0O;
    public TextView A0P;
    public TextView A0Q;
    public TextView A0R;
    public TextView A0S;
    public TextView A0T;
    public TextView A0U;
    public SwitchCompat A0V;
    public SwitchCompat A0W;
    public SwitchCompat A0X;
    public C000500h A0Y;
    public C0CB A0Z;
    public InterfaceC002901k A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public boolean A0e;
    public boolean A0f;
    public String[] A0g;
    public String[] A0h;
    public String[] A0i;
    public String[] A0j;
    public String[] A0k;

    public static int A00(String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static final boolean A01(String str) {
        String str2 = Build.MODEL;
        return (str2.contains("Desire") || str2.contains("Wildfire")) && !str.equals("00FF00");
    }

    public final void A1R() {
        C03370Fl A04 = this.A0Z.A04();
        C03370Fl A03 = this.A0Z.A03();
        this.A0d = A04.A07();
        this.A06 = A00(A04.A08(), this.A0k);
        this.A05 = A00(A04.A06(), this.A0i);
        this.A04 = A00(A04.A05(), this.A0g);
        this.A0f = A04.A0B();
        this.A0c = A03.A07();
        this.A03 = A00(A03.A08(), this.A0k);
        this.A02 = A00(A03.A06(), this.A0i);
        this.A01 = A00(A03.A05(), this.A0g);
        this.A0e = A03.A0B();
        this.A0b = A04.A03();
        this.A00 = A00(A04.A04(), this.A0k);
        this.A09.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 38));
        this.A0V.setChecked(this.A0Y.A00.getBoolean("conversation_sound", true));
        this.A0S.setText(C0DU.A07(this, this.A0d));
        this.A0H.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 42));
        int i = this.A06;
        if (i != -1) {
            this.A0U.setText(this.A0j[i]);
        }
        this.A0J.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 0));
        if (Build.VERSION.SDK_INT >= 29) {
            int A032 = AnonymousClass029.A03(this, R.attr.settingsTextDisabled, R.color.settings_disabled_text);
            this.A0K.setTextColor(A032);
            this.A0T.setTextColor(A032);
            this.A0T.setText(R.string.popup_notification_not_available);
            this.A0I.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 44));
        } else {
            int i2 = this.A05;
            if (i2 != -1) {
                this.A0T.setText(this.A0h[i2]);
            }
            this.A0I.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 41));
        }
        int i3 = this.A04;
        if (i3 != -1) {
            this.A0R.setText(A0l[i3]);
        }
        this.A0G.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 47));
        if (Build.VERSION.SDK_INT >= 21) {
            this.A0F.setVisibility(0);
            this.A0X.setChecked(Boolean.FALSE.equals(Boolean.valueOf(this.A0f)));
            this.A0F.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 46));
        } else {
            this.A0F.setVisibility(8);
        }
        this.A0O.setText(C0DU.A07(this, this.A0c));
        this.A0C.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 45));
        int i4 = this.A03;
        if (i4 != -1) {
            this.A0Q.setText(this.A0j[i4]);
        }
        this.A0E.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 1));
        if (Build.VERSION.SDK_INT >= 29) {
            this.A0D.setVisibility(8);
        } else {
            int i5 = this.A02;
            if (i5 != -1) {
                this.A0P.setText(this.A0h[i5]);
            }
            this.A0D.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 49));
        }
        int i6 = this.A01;
        if (i6 != -1) {
            this.A0N.setText(A0l[i6]);
        }
        this.A0B.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 40));
        if (Build.VERSION.SDK_INT >= 21) {
            this.A0A.setVisibility(0);
            this.A0W.setChecked(Boolean.FALSE.equals(Boolean.valueOf(this.A0e)));
            this.A0A.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 39));
        } else {
            this.A0A.setVisibility(8);
        }
        this.A0L.setText(C0DU.A07(this, this.A0b));
        this.A07.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 43));
        int i7 = this.A00;
        if (i7 != -1) {
            this.A0M.setText(this.A0j[i7]);
        }
        this.A08.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 48));
    }

    public final void A1S(int i, String str, String str2, int i2) {
        Uri parse;
        Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
        intent.putExtra("android.intent.extra.ringtone.TITLE", str);
        intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
        intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
        intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", Settings.System.DEFAULT_NOTIFICATION_URI);
        if (str2 != null && !str2.equals("Silent") && (parse = Uri.parse(str2)) != null) {
            intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parse);
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            intent.putExtra("android.intent.extra.ringtone.TYPE", 2);
        } else {
            intent.putExtra("android.intent.extra.ringtone.TYPE", i2);
        }
        startActivityForResult(Intent.createChooser(intent, null), i);
    }

    @Override // X.InterfaceC04910Mk
    public void AOi(int i, int i2) {
        switch (i) {
            case 9:
                this.A06 = i2;
                this.A0Z.A0N("individual_chat_defaults", String.valueOf(this.A0k[i2]));
                this.A0U.setText(this.A0j[i2]);
                return;
            case 10:
                this.A05 = i2;
                this.A0Z.A0L("individual_chat_defaults", String.valueOf(this.A0i[i2]));
                this.A0T.setText(this.A0h[i2]);
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                if (A01(this.A0g[i2])) {
                    C002701i.A19(this, 7);
                    return;
                }
                this.A04 = i2;
                this.A0Z.A0K("individual_chat_defaults", String.valueOf(this.A0g[i2]));
                this.A0R.setText(A0l[i2]);
                return;
            case 12:
                this.A03 = i2;
                this.A0Z.A0N("group_chat_defaults", String.valueOf(this.A0k[i2]));
                this.A0Q.setText(this.A0j[i2]);
                return;
            case 13:
                this.A02 = i2;
                this.A0Z.A0L("group_chat_defaults", String.valueOf(this.A0i[i2]));
                this.A0P.setText(this.A0h[i2]);
                return;
            case 14:
                if (A01(this.A0g[i2])) {
                    C002701i.A19(this, 7);
                    return;
                }
                this.A01 = i2;
                this.A0Z.A0K("group_chat_defaults", String.valueOf(this.A0g[i2]));
                this.A0N.setText(A0l[i2]);
                return;
            case 15:
                this.A00 = i2;
                C0CB c0cb = this.A0Z;
                String valueOf = String.valueOf(this.A0k[i2]);
                C03370Fl A08 = c0cb.A08("individual_chat_defaults");
                if (!TextUtils.equals(valueOf, A08.A07)) {
                    A08.A07 = valueOf;
                    c0cb.A0J(A08);
                }
                this.A0M.setText(this.A0j[i2]);
                return;
            default:
                return;
        }
    }

    public void lambda$initScreen$2346$SettingsNotifications(View view) {
        this.A0V.toggle();
        C000200d.A0j(this.A0Y, "conversation_sound", this.A0V.isChecked());
    }

    public /* synthetic */ void lambda$initScreen$2347$SettingsNotifications(View view) {
        A1S(1, getString(R.string.settings_notification_sound), this.A0d, 7);
    }

    public /* synthetic */ void lambda$initScreen$2348$SettingsNotifications(View view) {
        A1P(9, R.string.settings_notification_vibrate, this.A06, R.array.vibrate_lengths);
    }

    public /* synthetic */ void lambda$initScreen$2349$SettingsNotifications(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("message_string_res_id", R.string.popup_notification_disabled_message);
        bundle.putString("faq_id", "26000003");
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("faq_section_name", null);
        }
        FAQLearnMoreDialogFragment fAQLearnMoreDialogFragment = new FAQLearnMoreDialogFragment();
        fAQLearnMoreDialogFragment.A0P(bundle);
        AUh(fAQLearnMoreDialogFragment);
    }

    public /* synthetic */ void lambda$initScreen$2350$SettingsNotifications(View view) {
        A1P(10, R.string.settings_notification_popup, this.A05, R.array.popup_mode);
    }

    public /* synthetic */ void lambda$initScreen$2351$SettingsNotifications(View view) {
        A1Q(11, R.string.settings_notification_light, this.A04, ((ActivityC02310Ar) this).A01.A0O(A0l));
    }

    public /* synthetic */ void lambda$initScreen$2352$SettingsNotifications(View view) {
        this.A0X.toggle();
        boolean equals = Boolean.FALSE.equals(Boolean.valueOf(this.A0X.isChecked()));
        this.A0f = equals;
        C0CB c0cb = this.A0Z;
        C03370Fl A08 = c0cb.A08("individual_chat_defaults");
        if (equals != A08.A0D) {
            A08.A0D = equals;
            c0cb.A0J(A08);
        }
    }

    public /* synthetic */ void lambda$initScreen$2353$SettingsNotifications(View view) {
        A1S(2, getString(R.string.settings_notification_sound), this.A0c, 7);
    }

    public /* synthetic */ void lambda$initScreen$2354$SettingsNotifications(View view) {
        A1P(12, R.string.settings_notification_vibrate, this.A03, R.array.vibrate_lengths);
    }

    public /* synthetic */ void lambda$initScreen$2355$SettingsNotifications(View view) {
        A1P(13, R.string.settings_notification_popup, this.A02, R.array.popup_mode);
    }

    public /* synthetic */ void lambda$initScreen$2356$SettingsNotifications(View view) {
        A1Q(14, R.string.settings_notification_light, this.A01, ((ActivityC02310Ar) this).A01.A0O(A0l));
    }

    public /* synthetic */ void lambda$initScreen$2357$SettingsNotifications(View view) {
        this.A0W.toggle();
        boolean equals = Boolean.FALSE.equals(Boolean.valueOf(this.A0W.isChecked()));
        this.A0e = equals;
        C0CB c0cb = this.A0Z;
        C03370Fl A08 = c0cb.A08("group_chat_defaults");
        if (equals != A08.A0D) {
            A08.A0D = equals;
            c0cb.A0J(A08);
        }
    }

    public /* synthetic */ void lambda$initScreen$2358$SettingsNotifications(View view) {
        A1S(3, getString(R.string.settings_calls_ringtone), this.A0b, 1);
    }

    public /* synthetic */ void lambda$initScreen$2359$SettingsNotifications(View view) {
        A1P(15, R.string.settings_notification_vibrate, this.A00, R.array.vibrate_lengths);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String A07;
        String str;
        super.onActivityResult(i, i2, intent);
        if ((i == 1 || i == 2 || i == 3) && i2 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null) {
                A07 = RingtoneManager.getRingtone(this, uri).getTitle(this);
                str = uri.toString();
            } else {
                A07 = C0DU.A07(this, null);
                str = "Silent";
            }
            if (i == 1) {
                this.A0d = str;
                this.A0Z.A0M("individual_chat_defaults", str);
                this.A0S.setText(A07);
            } else if (i == 2) {
                this.A0c = str;
                this.A0Z.A0M("group_chat_defaults", str);
                this.A0O.setText(A07);
            } else if (i == 3) {
                this.A0b = str;
                C0CB c0cb = this.A0Z;
                C03370Fl A08 = c0cb.A08("individual_chat_defaults");
                if (!TextUtils.equals(str, A08.A06)) {
                    A08.A06 = str;
                    c0cb.A0J(A08);
                }
                this.A0L.setText(A07);
            }
        }
    }

    @Override // X.C2PO, X.C26F, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.settings_notifications);
        setContentView(R.layout.preferences_notifications);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            this.A09 = findViewById(R.id.conversation_sound_setting);
            this.A0V = (SwitchCompat) findViewById(R.id.conversation_sound_switch);
            this.A0H = findViewById(R.id.notification_tone_setting);
            this.A0S = (TextView) findViewById(R.id.selected_notification_tone);
            this.A0J = findViewById(R.id.vibrate_setting);
            this.A0U = (TextView) findViewById(R.id.selected_vibrate_setting);
            this.A0I = findViewById(R.id.popup_notification_setting);
            this.A0K = (TextView) findViewById(R.id.popup_notification_setting_title);
            this.A0T = (TextView) findViewById(R.id.selected_popup_notification_setting);
            this.A0G = findViewById(R.id.notification_light_setting);
            this.A0R = (TextView) findViewById(R.id.selected_notification_light_setting);
            this.A0F = findViewById(R.id.high_priority_notifications_setting);
            this.A0X = (SwitchCompat) findViewById(R.id.high_priority_notifications_switch);
            this.A0C = findViewById(R.id.group_notification_tone_setting);
            this.A0O = (TextView) findViewById(R.id.selected_group_notification_tone);
            this.A0E = findViewById(R.id.group_vibrate_setting);
            this.A0Q = (TextView) findViewById(R.id.selected_group_vibrate_setting);
            this.A0D = findViewById(R.id.group_popup_notification_setting);
            this.A0P = (TextView) findViewById(R.id.selected_group_popup_notification_setting);
            this.A0B = findViewById(R.id.group_notification_light_setting);
            this.A0N = (TextView) findViewById(R.id.selected_group_notification_light_setting);
            this.A0A = findViewById(R.id.group_high_priority_notifications_setting);
            this.A0W = (SwitchCompat) findViewById(R.id.group_high_priority_notifications_switch);
            this.A07 = findViewById(R.id.call_tone_setting);
            this.A0L = (TextView) findViewById(R.id.selected_call_tone);
            this.A08 = findViewById(R.id.call_vibrate_setting);
            this.A0M = (TextView) findViewById(R.id.selected_call_vibrate_setting);
            Resources resources = getResources();
            this.A0j = resources.getStringArray(R.array.vibrate_lengths);
            this.A0k = resources.getStringArray(R.array.vibrate_values);
            this.A0h = resources.getStringArray(R.array.popup_mode);
            this.A0i = resources.getStringArray(R.array.popup_mode_values);
            this.A0g = resources.getStringArray(R.array.led_color_values);
            A1R();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i == 7) {
            C019208x c019208x = new C019208x(this);
            c019208x.A02(R.string.led_support_green_only);
            c019208x.A06(R.string.ok, null);
            return c019208x.A00();
        } else if (i != 8) {
            return super.onCreateDialog(i);
        } else {
            C019208x c019208x2 = new C019208x(this);
            c019208x2.A02(R.string.settings_notification_reset_warning);
            c019208x2.A06(R.string.reset_notifications, new DialogInterface.OnClickListener() { // from class: X.3WD
                {
                    SettingsNotifications.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    final SettingsNotifications settingsNotifications = SettingsNotifications.this;
                    settingsNotifications.A0a.ARy(new C0HS() { // from class: X.3ol
                        /* JADX WARN: Finally extract failed */
                        @Override // X.C0HS
                        public Object A07(Object[] objArr) {
                            C0CB c0cb = settingsNotifications.A0Z;
                            if (c0cb != null) {
                                ContentValues contentValues = new ContentValues(8);
                                Boolean bool = Boolean.FALSE;
                                contentValues.put("use_custom_notifications", bool);
                                contentValues.put("message_tone", (String) null);
                                contentValues.put("message_vibrate", (String) null);
                                contentValues.put("message_popup", (String) null);
                                contentValues.put("message_light", (String) null);
                                contentValues.put("call_tone", (String) null);
                                contentValues.put("call_vibrate", (String) null);
                                contentValues.put("low_pri_notifications", bool);
                                C0CD A02 = c0cb.A09().A02();
                                try {
                                    C03790Hb A00 = A02.A00();
                                    C0CE c0ce = A02.A02;
                                    c0ce.A00("settings", contentValues, null, null);
                                    int A01 = c0ce.A01("settings", "(mute_end < ? or mute_end is NULL) and (status_muted is NULL or status_muted = 0) and (media_visibility = 0)", new String[]{Long.toString(c0cb.A0E.A01())});
                                    A00.A00();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("chat-settings-store/deleted-count");
                                    sb.append(A01);
                                    Log.i(sb.toString());
                                    A00.close();
                                    A02.close();
                                    C0CD A012 = c0cb.A09().A01();
                                    try {
                                        c0cb.A0W.clear();
                                        if (C03480Fw.A00) {
                                            C03390Fn.A03(c0cb.A0F.A00);
                                            C03390Fn c03390Fn = c0cb.A01;
                                            synchronized (c03390Fn) {
                                                c03390Fn.A0D(A012.A02.A00);
                                            }
                                        }
                                        A012.close();
                                        return null;
                                    } finally {
                                    }
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        try {
                                            A02.close();
                                        } catch (Throwable unused) {
                                        }
                                        throw th2;
                                    }
                                }
                            } else {
                                throw null;
                            }
                        }

                        @Override // X.C0HS
                        public void A09(Object obj) {
                            settingsNotifications.A1R();
                        }
                    }, new Void[0]);
                }
            });
            c019208x2.A04(R.string.cancel, null);
            return c019208x2.A00();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_reset_notification_settings, 0, R.string.settings_notification_reset).setShowAsAction(0);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_reset_notification_settings) {
            C002701i.A19(this, 8);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        C0CB c0cb = this.A0Z;
        if (c0cb != null) {
            if (C03480Fw.A00) {
                boolean A0T = c0cb.A0T("individual_chat_defaults");
                boolean A0T2 = c0cb.A0T("group_chat_defaults");
                if (A0T || A0T2) {
                    Log.i("settings-jid-notifications/onStart settings-store updated, refreshing ui");
                    A1R();
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }
}
