package com.whatsapp.settings;

import X.AbstractC005302j;
import X.ActivityC06980Vx;
import X.AnonymousClass029;
import X.C002301c;
import X.C002701i;
import X.C003101m;
import X.C018308n;
import X.C03370Fl;
import X.C0CB;
import X.C0DU;
import X.C0L8;
import X.C0PA;
import X.C1U3;
import X.C40071rX;
import X.C40081rY;
import X.InterfaceC14270mg;
import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.TwoStatePreference;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaPreferenceFragment;
import com.whatsapp.dialogs.FAQLearnMoreDialogFragment;
import com.whatsapp.preference.WaRingtonePreference;
import com.whatsapp.settings.SettingsJidNotificationFragment;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class SettingsJidNotificationFragment extends Hilt_SettingsJidNotificationFragment {
    public C018308n A00;
    public C0L8 A01;
    public C002301c A02;
    public C40081rY A03;
    public AbstractC005302j A04;
    public C0CB A05;
    public C40071rX A06;

    @Override // androidx.preference.PreferenceFragmentCompat, X.C0BA
    public void A0g() {
        this.A0U = true;
        C0PA c0pa = ((PreferenceFragmentCompat) this).A02;
        c0pa.A06 = this;
        c0pa.A04 = this;
        C0CB c0cb = this.A05;
        AbstractC005302j abstractC005302j = this.A04;
        if (c0cb != null) {
            if (c0cb.A0T(abstractC005302j.getRawString())) {
                Log.i("settings-jid-notifications/onStart settings-store updated, refreshing ui");
                ((PreferenceFragmentCompat) this).A02.A07.A0U();
                A13();
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.C0BA
    public void A0h(int i, int i2, Intent intent) {
        if (i == 1) {
            if (intent != null) {
                Object parcelableExtra = intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
                Preference A7p = A7p("jid_message_tone");
                A7p.A0A.ANB(A7p, parcelableExtra != null ? parcelableExtra : "");
            }
        } else if (i != 2 || intent == null) {
        } else {
            Object parcelableExtra2 = intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            Preference A7p2 = A7p("jid_call_ringtone");
            A7p2.A0A.ANB(A7p2, parcelableExtra2 != null ? parcelableExtra2 : "");
        }
    }

    @Override // X.C0BA
    public void A0m(Menu menu, MenuInflater menuInflater) {
        menu.add(0, R.id.menuitem_reset_notification_settings, 0, R.string.settings_notification_reset).setShowAsAction(0);
    }

    @Override // X.C0BA
    public boolean A0o(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_reset_notification_settings) {
            C0CB c0cb = this.A05;
            C03370Fl A07 = c0cb.A07(this.A04);
            C03370Fl A02 = A07.A02();
            A07.A0A = A02.A07();
            A07.A0B = A02.A08();
            A07.A09 = A02.A06();
            A07.A08 = A02.A05();
            A07.A06 = A02.A03();
            A07.A07 = A02.A04();
            A07.A0H = false;
            A07.A0D = false;
            c0cb.A0J(A07);
            ((PreferenceFragmentCompat) this).A02.A07.A0U();
            A13();
            return true;
        }
        return false;
    }

    @Override // androidx.preference.PreferenceFragmentCompat, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        A0J();
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public void A0y(Bundle bundle, String str) {
        AbstractC005302j A02 = AbstractC005302j.A02(A09().getIntent().getStringExtra("jid"));
        if (A02 != null) {
            this.A04 = A02;
            String string = A0A().getString(R.string.settings_notifications);
            ActivityC06980Vx activityC06980Vx = ((WaPreferenceFragment) this).A00;
            if (activityC06980Vx != null) {
                activityC06980Vx.setTitle(string);
            }
            A13();
            return;
        }
        throw null;
    }

    @Override // com.whatsapp.WaPreferenceFragment
    public Dialog A10(int i) {
        if (i == 0) {
            return FAQLearnMoreDialogFragment.A00(((WaPreferenceFragment) this).A00, this.A03, this.A00, this.A06, "26000003", A0F(R.string.popup_notification_disabled_message), null, null);
        }
        return null;
    }

    public final void A13() {
        C03370Fl A07 = this.A05.A07(this.A04);
        A12(R.xml.preferences_jid_notifications);
        final WaRingtonePreference waRingtonePreference = (WaRingtonePreference) A7p("jid_message_tone");
        String A072 = A07.A07();
        waRingtonePreference.A00 = 7;
        waRingtonePreference.A02 = true;
        waRingtonePreference.A03 = true;
        waRingtonePreference.A01 = A072;
        waRingtonePreference.A0I(C0DU.A07(((WaPreferenceFragment) this).A00, A072));
        waRingtonePreference.A0A = new InterfaceC14270mg() { // from class: X.3oY
            {
                SettingsJidNotificationFragment.this = this;
            }

            @Override // X.InterfaceC14270mg
            public final boolean ANB(Preference preference, Object obj) {
                SettingsJidNotificationFragment settingsJidNotificationFragment = SettingsJidNotificationFragment.this;
                WaRingtonePreference waRingtonePreference2 = waRingtonePreference;
                String obj2 = obj.toString();
                waRingtonePreference2.A01 = obj2;
                waRingtonePreference2.A0I(C0DU.A07(preference.A05, obj2));
                settingsJidNotificationFragment.A05.A0M(settingsJidNotificationFragment.A04.getRawString(), obj2);
                return true;
            }
        };
        ListPreference listPreference = (ListPreference) A7p("jid_message_vibrate");
        listPreference.A0V(A07.A08());
        listPreference.A0I(listPreference.A0U());
        listPreference.A0A = new InterfaceC14270mg() { // from class: X.3oZ
            {
                SettingsJidNotificationFragment.this = this;
            }

            @Override // X.InterfaceC14270mg
            public final boolean ANB(Preference preference, Object obj) {
                SettingsJidNotificationFragment settingsJidNotificationFragment = SettingsJidNotificationFragment.this;
                ListPreference listPreference2 = (ListPreference) preference;
                preference.A0I(listPreference2.A03[listPreference2.A0T((String) obj)].toString());
                C0CB c0cb = settingsJidNotificationFragment.A05;
                AbstractC005302j abstractC005302j = settingsJidNotificationFragment.A04;
                c0cb.A0N(abstractC005302j.getRawString(), obj.toString());
                return true;
            }
        };
        ListPreference listPreference2 = (ListPreference) A7p("jid_message_popup");
        if (Build.VERSION.SDK_INT >= 29) {
            final int A03 = AnonymousClass029.A03(((WaPreferenceFragment) this).A00, R.attr.settingsTextDisabled, R.color.settings_disabled_text);
            PreferenceGroup preferenceGroup = (PreferenceGroup) A7p("notification");
            preferenceGroup.A0W(listPreference2);
            preferenceGroup.A06();
            ListPreference listPreference3 = new ListPreference(((WaPreferenceFragment) this).A00) { // from class: com.whatsapp.settings.SettingsJidNotificationFragment.1
                {
                    SettingsJidNotificationFragment.this = this;
                }

                @Override // androidx.preference.DialogPreference, androidx.preference.Preference
                public void A08() {
                    C002701i.A19(((WaPreferenceFragment) SettingsJidNotificationFragment.this).A00, 0);
                }

                @Override // androidx.preference.Preference
                public void A0S(C1U3 c1u3) {
                    super.A0S(c1u3);
                    View view = c1u3.A0H;
                    int i = A03;
                    ((TextView) view.findViewById(16908310)).setTextColor(i);
                    ((TextView) view.findViewById(16908304)).setTextColor(i);
                    c1u3.A00 = true;
                    c1u3.A01 = true;
                }
            };
            String str = listPreference2.A0L;
            listPreference3.A0L = str;
            if (listPreference3.A0Y && !(!TextUtils.isEmpty(str))) {
                if (!TextUtils.isEmpty(listPreference3.A0L)) {
                    listPreference3.A0Y = true;
                } else {
                    throw new IllegalStateException("Preference does not have a key assigned.");
                }
            }
            listPreference3.A0X = listPreference2.A0X;
            listPreference3.A0I = listPreference2.A01;
            listPreference3.A03 = listPreference2.A03;
            listPreference3.A04 = listPreference2.A04;
            listPreference3.A0I(listPreference2.A02());
            listPreference3.A0J(listPreference2.A0H);
            int i = ((Preference) listPreference2).A02;
            if (i != ((Preference) listPreference3).A02) {
                ((Preference) listPreference3).A02 = i;
                listPreference3.A06();
            }
            boolean z = listPreference2.A0V;
            if (listPreference3.A0V != z) {
                listPreference3.A0V = z;
                listPreference3.A05();
            }
            preferenceGroup.A0V(listPreference3);
            listPreference3.A0V(listPreference2.A01);
            listPreference3.A0I(((Preference) listPreference3).A05.getString(R.string.popup_notification_not_available));
        } else {
            listPreference2.A0V(A07.A06());
            listPreference2.A0I(listPreference2.A0U());
            listPreference2.A0A = new InterfaceC14270mg() { // from class: X.3oa
                {
                    SettingsJidNotificationFragment.this = this;
                }

                @Override // X.InterfaceC14270mg
                public final boolean ANB(Preference preference, Object obj) {
                    SettingsJidNotificationFragment settingsJidNotificationFragment = SettingsJidNotificationFragment.this;
                    ListPreference listPreference4 = (ListPreference) preference;
                    preference.A0I(listPreference4.A03[listPreference4.A0T((String) obj)].toString());
                    C0CB c0cb = settingsJidNotificationFragment.A05;
                    AbstractC005302j abstractC005302j = settingsJidNotificationFragment.A04;
                    c0cb.A0L(abstractC005302j.getRawString(), obj.toString());
                    return true;
                }
            };
        }
        ListPreference listPreference4 = (ListPreference) A7p("jid_message_light");
        listPreference4.A0W(this.A02.A0O(SettingsNotifications.A0l));
        listPreference4.A0V(A07.A05());
        listPreference4.A0I(listPreference4.A0U());
        listPreference4.A0A = new InterfaceC14270mg() { // from class: X.3ob
            {
                SettingsJidNotificationFragment.this = this;
            }

            @Override // X.InterfaceC14270mg
            public final boolean ANB(Preference preference, Object obj) {
                ActivityC06980Vx activityC06980Vx;
                SettingsJidNotificationFragment settingsJidNotificationFragment = SettingsJidNotificationFragment.this;
                String str2 = Build.MODEL;
                if ((str2.contains("Desire") || str2.contains("Wildfire")) && !obj.toString().equals("00FF00") && (activityC06980Vx = ((WaPreferenceFragment) settingsJidNotificationFragment).A00) != null) {
                    activityC06980Vx.A00 = R.string.led_support_green_only;
                    C002701i.A19(activityC06980Vx, 500);
                }
                ListPreference listPreference5 = (ListPreference) preference;
                preference.A0I(listPreference5.A03[listPreference5.A0T((String) obj)].toString());
                settingsJidNotificationFragment.A05.A0K(settingsJidNotificationFragment.A04.getRawString(), obj.toString());
                return true;
            }
        };
        TwoStatePreference twoStatePreference = (TwoStatePreference) A7p("jid_use_high_priority_notifications");
        if (Build.VERSION.SDK_INT < 21) {
            PreferenceGroup preferenceGroup2 = (PreferenceGroup) A7p("notification");
            preferenceGroup2.A0W(twoStatePreference);
            preferenceGroup2.A06();
        } else {
            twoStatePreference.A0U(!A07.A0B());
            twoStatePreference.A0A = new InterfaceC14270mg() { // from class: X.3oW
                {
                    SettingsJidNotificationFragment.this = this;
                }

                @Override // X.InterfaceC14270mg
                public final boolean ANB(Preference preference, Object obj) {
                    SettingsJidNotificationFragment settingsJidNotificationFragment = SettingsJidNotificationFragment.this;
                    C0CB c0cb = settingsJidNotificationFragment.A05;
                    AbstractC005302j abstractC005302j = settingsJidNotificationFragment.A04;
                    boolean equals = Boolean.FALSE.equals(obj);
                    C03370Fl A08 = c0cb.A08(abstractC005302j.getRawString());
                    if (equals != A08.A0D) {
                        A08.A0D = equals;
                        c0cb.A0J(A08);
                        return true;
                    }
                    return true;
                }
            };
        }
        if (C003101m.A0U(this.A04)) {
            Preference A7p = A7p("jid_call");
            if (A7p != null) {
                PreferenceScreen preferenceScreen = ((PreferenceFragmentCompat) this).A02.A07;
                preferenceScreen.A0W(A7p);
                preferenceScreen.A06();
            }
        } else {
            final WaRingtonePreference waRingtonePreference2 = (WaRingtonePreference) A7p("jid_call_ringtone");
            String A032 = A07.A03();
            waRingtonePreference2.A00 = 1;
            waRingtonePreference2.A02 = true;
            waRingtonePreference2.A03 = true;
            waRingtonePreference2.A01 = A032;
            waRingtonePreference2.A0I(C0DU.A07(((WaPreferenceFragment) this).A00, A032));
            waRingtonePreference2.A0A = new InterfaceC14270mg() { // from class: X.3oU
                {
                    SettingsJidNotificationFragment.this = this;
                }

                @Override // X.InterfaceC14270mg
                public final boolean ANB(Preference preference, Object obj) {
                    SettingsJidNotificationFragment settingsJidNotificationFragment = SettingsJidNotificationFragment.this;
                    WaRingtonePreference waRingtonePreference3 = waRingtonePreference2;
                    String obj2 = obj.toString();
                    waRingtonePreference3.A01 = obj2;
                    waRingtonePreference3.A0I(C0DU.A07(preference.A05, obj2));
                    C0CB c0cb = settingsJidNotificationFragment.A05;
                    C03370Fl A08 = c0cb.A08(settingsJidNotificationFragment.A04.getRawString());
                    if (!TextUtils.equals(obj2, A08.A06)) {
                        A08.A06 = obj2;
                        c0cb.A0J(A08);
                        return true;
                    }
                    return true;
                }
            };
            ListPreference listPreference5 = (ListPreference) A7p("jid_call_vibrate");
            listPreference5.A0V(A07.A04());
            listPreference5.A0I(listPreference5.A0U());
            listPreference5.A0A = new InterfaceC14270mg() { // from class: X.3oV
                {
                    SettingsJidNotificationFragment.this = this;
                }

                @Override // X.InterfaceC14270mg
                public final boolean ANB(Preference preference, Object obj) {
                    SettingsJidNotificationFragment settingsJidNotificationFragment = SettingsJidNotificationFragment.this;
                    ListPreference listPreference6 = (ListPreference) preference;
                    preference.A0I(listPreference6.A03[listPreference6.A0T((String) obj)].toString());
                    C0CB c0cb = settingsJidNotificationFragment.A05;
                    AbstractC005302j abstractC005302j = settingsJidNotificationFragment.A04;
                    String obj2 = obj.toString();
                    C03370Fl A08 = c0cb.A08(abstractC005302j.getRawString());
                    if (!TextUtils.equals(obj2, A08.A07)) {
                        A08.A07 = obj2;
                        c0cb.A0J(A08);
                        return true;
                    }
                    return true;
                }
            };
        }
        TwoStatePreference twoStatePreference2 = (TwoStatePreference) A7p("jid_use_custom");
        twoStatePreference2.A0U(A07.A0H);
        twoStatePreference2.A0A = new InterfaceC14270mg() { // from class: X.3oX
            {
                SettingsJidNotificationFragment.this = this;
            }

            @Override // X.InterfaceC14270mg
            public final boolean ANB(Preference preference, Object obj) {
                SettingsJidNotificationFragment settingsJidNotificationFragment = SettingsJidNotificationFragment.this;
                C0CB c0cb = settingsJidNotificationFragment.A05;
                AbstractC005302j abstractC005302j = settingsJidNotificationFragment.A04;
                boolean equals = Boolean.TRUE.equals(obj);
                C0L8 c0l8 = settingsJidNotificationFragment.A01;
                C03370Fl A073 = c0cb.A07(abstractC005302j);
                if (equals != A073.A0H) {
                    if (equals) {
                        A073.A0D = A073.A0B();
                    }
                    if (equals) {
                        C06C A09 = c0cb.A08.A09(abstractC005302j);
                        if (A09 != null) {
                            c0l8.A05(c0cb.A0F.A00, A09);
                        }
                    } else {
                        c0l8.A07(abstractC005302j);
                    }
                    A073.A0H = equals;
                    c0cb.A0J(A073);
                }
                settingsJidNotificationFragment.A14();
                return true;
            }
        };
        A14();
    }

    public final void A14() {
        boolean z = this.A05.A07(this.A04).A0H;
        A7p("jid_message_tone").A0N(z);
        A7p("jid_message_vibrate").A0N(z);
        A7p("jid_message_popup").A0N(z);
        A7p("jid_message_light").A0N(z);
        if (Build.VERSION.SDK_INT >= 21) {
            A7p("jid_use_high_priority_notifications").A0N(z);
        }
        if (C003101m.A0U(this.A04)) {
            return;
        }
        A7p("jid_call_ringtone").A0N(z);
        A7p("jid_call_vibrate").A0N(z);
    }

    @Override // androidx.preference.PreferenceFragmentCompat, X.InterfaceC09440e6
    public boolean AND(Preference preference) {
        String str = preference.A0L;
        if (str.equals("jid_message_tone")) {
            A0O(((WaRingtonePreference) preference).A0T(), 1, null);
            return true;
        } else if (str.equals("jid_call_ringtone")) {
            A0O(((WaRingtonePreference) preference).A0T(), 2, null);
            return true;
        } else {
            return super.AND(preference);
        }
    }
}
