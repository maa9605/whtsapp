package com.whatsapp.settings;

import X.AbstractC005302j;
import X.ActivityC02270An;
import X.ActivityC02310Ar;
import X.AnonymousClass008;
import X.C000200d;
import X.C000500h;
import X.C018508q;
import X.C01B;
import X.C01C;
import X.C03170Ep;
import X.C04960Mq;
import X.C05W;
import X.C0DV;
import X.C0DW;
import X.C0E7;
import X.C0EB;
import X.C0EG;
import X.C0EN;
import X.C0FP;
import X.C0G1;
import X.C0GA;
import X.C0GZ;
import X.C0U1;
import X.C22I;
import X.C2AG;
import X.C3WE;
import X.C3WI;
import X.C40261rr;
import X.C41391tq;
import X.C41461tx;
import X.C453221i;
import X.C45A;
import X.C49672Lv;
import X.C81263oc;
import X.InterfaceC002901k;
import X.InterfaceC03670Gp;
import X.InterfaceC04910Mk;
import X.InterfaceC453821q;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.authentication.AppAuthSettingsActivity;
import com.whatsapp.blocklist.BlockList;
import com.whatsapp.group.GroupAddPrivacyActivity;
import com.whatsapp.location.LiveLocationPrivacyActivity;
import com.whatsapp.settings.SettingsPrivacy;
import com.whatsapp.status.StatusPrivacyActivity;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class SettingsPrivacy extends C2AG implements InterfaceC04910Mk {
    public static SettingsPrivacy A0i;
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public ProgressBar A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public SwitchCompat A0I;
    public C018508q A0J;
    public C04960Mq A0K;
    public C01B A0L;
    public C03170Ep A0M;
    public C40261rr A0N;
    public AnonymousClass008 A0O;
    public C0E7 A0P;
    public C000500h A0Q;
    public C41391tq A0R;
    public C0EB A0S;
    public C0FP A0T;
    public C49672Lv A0U;
    public C41461tx A0V;
    public C0G1 A0W;
    public C0EN A0X;
    public C0EG A0Y;
    public C0GZ A0Z;
    public C0DW A0a;
    public C0DV A0b;
    public InterfaceC002901k A0d;
    public static final int[] A0k = {R.string.privacy_everyone, R.string.privacy_contacts, R.string.privacy_nobody};
    public static HashMap A0j = new HashMap();
    public final C0GA A0f = new C0GA() { // from class: X.3om
        {
            SettingsPrivacy.this = this;
        }

        @Override // X.C0GA
        public void A05(Collection collection) {
            SettingsPrivacy.this.A1S();
        }
    };
    public final Handler A0e = new Handler(Looper.getMainLooper());
    public final Runnable A0h = new RunnableEBaseShape6S0100000_I0_6(this, 21);
    public final InterfaceC453821q A0g = new InterfaceC453821q() { // from class: X.3on
        {
            SettingsPrivacy.this = this;
        }

        @Override // X.InterfaceC453821q
        public void AOv(AbstractC005302j abstractC005302j) {
            SettingsPrivacy.this.A1U();
        }

        @Override // X.InterfaceC453821q
        public void APC(AbstractC005302j abstractC005302j) {
            SettingsPrivacy.this.A1U();
        }
    };
    public C81263oc A0c = new C81263oc(this);

    public static String A01(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "all" : "contact_blacklist" : "none" : "contacts";
    }

    public static int A00(String str) {
        if ("all".equals(str)) {
            return 0;
        }
        if ("contacts".equals(str)) {
            return 1;
        }
        if ("none".equals(str)) {
            return 2;
        }
        return "contact_blacklist".equals(str) ? 3 : -1;
    }

    public static String A02(String str) {
        if ("privacy_last_seen".equals(str)) {
            return "last";
        }
        if ("privacy_profile_photo".equals(str)) {
            return "profile";
        }
        if ("privacy_status".equals(str)) {
            return "status";
        }
        if ("read_receipts_enabled".equals(str)) {
            return "readreceipts";
        }
        if ("privacy_groupadd".equals(str)) {
            return "groupadd";
        }
        throw new IllegalArgumentException(C000200d.A0H("Unrecognized preference: ", str));
    }

    public static void A03(C018508q c018508q, C22I c22i, C000500h c000500h, C04960Mq c04960Mq, Map map) {
        boolean z = false;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder("settingsprivacy/received ");
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            Log.i(sb.toString());
            int A00 = A00(str2);
            if (A00 < 0 || (A00 == 3 && !"groupadd".equals(str))) {
                z = true;
            } else {
                C3WI c3wi = (C3WI) A0j.get(str);
                if (c3wi == null || c3wi.A00.equals(str2)) {
                    A0j.remove(str);
                    if ("last".equals(str)) {
                        int i = c000500h.A00.getInt("privacy_last_seen", 0);
                        C000200d.A0g(c000500h, "privacy_last_seen", A00);
                        if (i != A00) {
                            c018508q.A02.post(new RunnableEBaseShape6S0100000_I0_6(c22i, 19));
                        }
                    } else if ("profile".equals(str)) {
                        C000200d.A0g(c000500h, "privacy_profile_photo", A00);
                    } else if ("status".equals(str)) {
                        C000200d.A0g(c000500h, "privacy_status", A00);
                    } else if ("readreceipts".equals(str)) {
                        boolean z2 = c3wi != null;
                        boolean A0m = c000500h.A0m();
                        boolean contentEquals = "all".contentEquals(str2);
                        if (!z2 && !A0m && contentEquals) {
                            c04960Mq.A02(str, "none");
                            contentEquals = false;
                        }
                        C000200d.A0j(c000500h, "read_receipts_enabled", contentEquals);
                    } else if ("groupadd".equals(str)) {
                        C000200d.A0g(c000500h, "privacy_groupadd", A00);
                    }
                }
            }
        }
        if (z) {
            c018508q.A02.post(new RunnableEBaseShape6S0100000_I0_6(c018508q, 22));
        }
        if (A0i != null) {
            c018508q.A02.post(C3WE.A00);
        }
    }

    public final int A1R(String str, int i) {
        boolean z;
        int i2;
        C3WI c3wi = (C3WI) A0j.get(A02(str));
        boolean z2 = true;
        if (c3wi == null) {
            z = true;
            z2 = false;
        } else {
            z = false;
            i = A00(c3wi.A00);
        }
        int max = Math.max(0, i);
        if (z2) {
            i2 = R.string.privacy_settings_loading;
        } else {
            i2 = A0k[max];
        }
        String string = getString(i2);
        if (str.equals("privacy_last_seen")) {
            this.A03.setEnabled(z);
            this.A0E.setText(string);
        } else if (str.equals("privacy_profile_photo")) {
            this.A05.setEnabled(z);
            this.A0G.setText(string);
            return max;
        } else if (str.equals("privacy_status")) {
            this.A08.setEnabled(z);
            this.A0A.setText(string);
            return max;
        } else if (str.equals("privacy_groupadd")) {
            this.A02.setEnabled(z);
            this.A0D.setText(string);
            return max;
        }
        return max;
    }

    public final void A1S() {
        String string;
        boolean z;
        int size;
        InterfaceC03670Gp A9C;
        int size2;
        if (this.A0N.A0G()) {
            C40261rr c40261rr = this.A0N;
            synchronized (c40261rr) {
                z = c40261rr.A01;
            }
            if (z) {
                C40261rr c40261rr2 = this.A0N;
                synchronized (c40261rr2) {
                    size = c40261rr2.A0O.size();
                }
                if (this.A0a.A04() && this.A0Z.A09() && (A9C = this.A0b.A03().A9C()) != null) {
                    C45A c45a = (C45A) A9C;
                    if (c45a.A06()) {
                        synchronized (c45a) {
                            size2 = c45a.A0B.size();
                        }
                        size += size2;
                    }
                }
                if (size > 0) {
                    string = String.valueOf(size);
                } else {
                    string = getString(R.string.none);
                }
                this.A0C.setText(string);
            }
        }
        string = getString(R.string.block_list_header);
        this.A0C.setText(string);
    }

    public final void A1T() {
        String string;
        int i = this.A0Q.A00.getInt("privacy_groupadd", 0);
        C3WI c3wi = (C3WI) A0j.get("privacy_groupadd");
        boolean z = true;
        boolean z2 = false;
        if (c3wi != null) {
            z = false;
            z2 = true;
            i = A00(c3wi.A00);
        }
        int max = Math.max(0, i);
        if (z2) {
            string = getString(R.string.privacy_settings_loading);
        } else if (max == 3) {
            int size = ((AbstractCollection) this.A0U.A02()).size();
            if (size == 0) {
                string = getString(R.string.privacy_contacts);
            } else {
                string = ((ActivityC02310Ar) this).A01.A0A(R.plurals.group_add_blacklist_contacts_excluded, size, Integer.valueOf(size));
            }
        } else {
            string = getString(A0k[max]);
        }
        this.A02.setEnabled(z);
        this.A0D.setText(string);
    }

    public final void A1U() {
        ArrayList arrayList;
        String string;
        C41461tx c41461tx = this.A0V;
        synchronized (c41461tx.A0T) {
            Map A0D = c41461tx.A0D();
            arrayList = new ArrayList(A0D.size());
            long A05 = c41461tx.A0G.A05();
            for (C453221i c453221i : A0D.values()) {
                if (C41461tx.A02(c453221i.A01, A05)) {
                    C05W c05w = c41461tx.A0E;
                    AbstractC005302j abstractC005302j = c453221i.A02.A00;
                    if (abstractC005302j != null) {
                        arrayList.add(c05w.A09(abstractC005302j));
                    } else {
                        throw null;
                    }
                }
            }
        }
        if (arrayList.size() > 0) {
            string = ((ActivityC02310Ar) this).A01.A0A(R.plurals.live_location_currently_sharing, arrayList.size(), Integer.valueOf(arrayList.size()));
        } else {
            string = getString(R.string.none);
        }
        TextView textView = this.A0F;
        if (textView != null) {
            textView.setText(string);
        }
    }

    public final void A1V() {
        A1W();
        A1R("privacy_last_seen", this.A0Q.A00.getInt("privacy_last_seen", 0));
        A1R("privacy_profile_photo", this.A0Q.A00.getInt("privacy_profile_photo", 0));
        A1R("privacy_status", this.A0Q.A00.getInt("privacy_status", 0));
        A1T();
        A1Z(this.A0Q.A0m());
    }

    public final void A1W() {
        String string;
        int A04 = this.A0S.A04();
        if (A04 == 0) {
            string = getString(R.string.privacy_contacts);
        } else if (A04 == 1) {
            int size = ((AbstractCollection) this.A0S.A0A()).size();
            if (size == 0) {
                string = getString(R.string.no_contacts_selected);
            } else {
                string = ((ActivityC02310Ar) this).A01.A0A(R.plurals.status_contacts_selected, size, Integer.valueOf(size));
            }
        } else if (A04 == 2) {
            int size2 = ((AbstractCollection) this.A0S.A09()).size();
            if (size2 == 0) {
                string = getString(R.string.privacy_contacts);
            } else {
                string = ((ActivityC02310Ar) this).A01.A0A(R.plurals.status_contacts_excluded, size2, Integer.valueOf(size2));
            }
        } else {
            throw new IllegalStateException("unknown status distribution mode");
        }
        this.A0H.setText(string);
    }

    public final void A1X(String str) {
        int i;
        int i2;
        int i3;
        if (str.equals("privacy_last_seen")) {
            i = 1;
            i2 = R.string.settings_privacy_last_seen;
            i3 = this.A0Q.A00.getInt("privacy_last_seen", 0);
        } else if (str.equals("privacy_profile_photo")) {
            i = 2;
            i2 = R.string.settings_privacy_profile_photo;
            i3 = this.A0Q.A00.getInt("privacy_profile_photo", 0);
        } else if (str.equals("privacy_status")) {
            i = 3;
            i2 = R.string.settings_privacy_info;
            i3 = this.A0Q.A00.getInt("privacy_status", 0);
        } else {
            throw new IllegalArgumentException("Invalid pref key for privacy picker dialog");
        }
        A1Q(i, i2, i3, ((ActivityC02310Ar) this).A01.A0O(A0k));
    }

    public final void A1Y(String str, String str2) {
        A0j.put(str, new C3WI(str2));
        ((ActivityC02270An) this).A0B.A02(true);
        this.A0K.A02(str, str2);
        Handler handler = this.A0e;
        Runnable runnable = this.A0h;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 20000L);
    }

    public final void A1Z(boolean z) {
        Object obj = A0j.get(A02("read_receipts_enabled"));
        this.A06.setEnabled(obj == null);
        this.A09.setVisibility(obj != null ? 0 : 8);
        this.A0I.setVisibility(obj != null ? 8 : 0);
        this.A0I.setChecked(z);
        C000200d.A0j(this.A0Q, "read_receipts_enabled", z);
    }

    @Override // X.InterfaceC04910Mk
    public void AOi(int i, int i2) {
        if (i == 1) {
            this.A0c.A00("privacy_last_seen", i2);
        } else if (i == 2) {
            this.A0c.A00("privacy_profile_photo", i2);
        } else if (i == 3) {
            this.A0c.A00("privacy_status", i2);
        }
    }

    public /* synthetic */ void lambda$onCreate$2405$SettingsPrivacy(View view) {
        A1X("privacy_last_seen");
    }

    public /* synthetic */ void lambda$onCreate$2406$SettingsPrivacy(View view) {
        A1X("privacy_profile_photo");
    }

    public /* synthetic */ void lambda$onCreate$2407$SettingsPrivacy(View view) {
        A1X("privacy_status");
    }

    public /* synthetic */ void lambda$onCreate$2408$SettingsPrivacy(View view) {
        startActivityForResult(new Intent(this, StatusPrivacyActivity.class), 0);
    }

    public /* synthetic */ void lambda$onCreate$2409$SettingsPrivacy(View view) {
        startActivity(new Intent(this, LiveLocationPrivacyActivity.class));
    }

    public /* synthetic */ void lambda$onCreate$2410$SettingsPrivacy(View view) {
        startActivityForResult(new Intent(this, GroupAddPrivacyActivity.class), 1);
    }

    public /* synthetic */ void lambda$onCreate$2411$SettingsPrivacy(View view) {
        startActivity(new Intent(this, BlockList.class));
    }

    public void lambda$onCreate$2413$SettingsPrivacy(View view) {
        if (!this.A0P.A05()) {
            this.A0J.A07(R.string.coldsync_no_network, 0);
            return;
        }
        boolean z = !this.A0I.isChecked();
        A1Y(A02("read_receipts_enabled"), z ? "all" : "none");
        A1Z(z);
        if (Boolean.TRUE.equals(Boolean.valueOf(z))) {
            this.A0d.AS1(new RunnableEBaseShape6S0100000_I0_6(this, 20));
        }
    }

    public /* synthetic */ void lambda$updateAppSecurityPreference$2414$SettingsPrivacy(View view) {
        startActivity(new Intent(this, AppAuthSettingsActivity.class));
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            A1W();
            return;
        }
        if (i != 1) {
            if (i == 2) {
                finish();
            } else {
                return;
            }
        }
        if (i2 == -1) {
            int intExtra = intent.getIntExtra("groupadd", 0);
            if (intExtra == 3) {
                A1T();
            } else {
                this.A0c.A00("privacy_groupadd", intExtra);
            }
        }
    }

    @Override // X.C2AG, X.C26F, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.settings_privacy);
        setContentView(R.layout.preferences_privacy);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            A0i = this;
            this.A03 = findViewById(R.id.last_seen_privacy_preference);
            this.A0E = (TextView) findViewById(R.id.selected_last_seen_privacy_preference);
            this.A05 = findViewById(R.id.profile_photo_privacy_preference);
            this.A0G = (TextView) findViewById(R.id.selected_profile_photo_privacy_preference);
            this.A00 = findViewById(R.id.about_privacy_preference);
            this.A0A = (TextView) findViewById(R.id.selected_about_privacy_preference);
            this.A08 = findViewById(R.id.status_privacy_preference);
            this.A0H = (TextView) findViewById(R.id.selected_status_privacy_preference);
            this.A04 = findViewById(R.id.live_location_privacy_preference);
            this.A0F = (TextView) findViewById(R.id.selected_live_location_privacy_preference);
            this.A02 = findViewById(R.id.group_add_permission_privacy_preference);
            this.A0D = (TextView) findViewById(R.id.selected_group_add_permission_privacy_preference);
            this.A01 = findViewById(R.id.block_list_privacy_preference);
            this.A0C = (TextView) findViewById(R.id.selected_block_list_privacy_preference);
            this.A06 = findViewById(R.id.read_receipts_privacy_preference);
            this.A0I = (SwitchCompat) findViewById(R.id.read_receipts_privacy_switch);
            this.A09 = (ProgressBar) findViewById(R.id.read_receipts_progress_bar);
            this.A07 = findViewById(R.id.security_privacy_preference);
            TextView textView = (TextView) findViewById(R.id.security_privacy_preference_title);
            boolean A07 = this.A0M.A07();
            int i = R.string.settings_privacy_security_section_title;
            if (A07) {
                i = R.string.settings_privacy_security_section_biometric_title;
            }
            textView.setText(i);
            this.A0B = (TextView) findViewById(R.id.security_privacy_preference_subtitle);
            A1V();
            this.A03.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 4));
            this.A05.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 6));
            this.A00.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 7));
            this.A08.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 3));
            this.A04.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 10));
            if (this.A0L.A0E(C01C.A13)) {
                this.A02.setVisibility(0);
                this.A02.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 9));
            } else {
                this.A02.setVisibility(8);
            }
            this.A01.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 5));
            this.A06.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 8));
            this.A0K.A01(null);
            this.A0O.A01(this.A0f);
            this.A0V.A0X(this.A0g);
            String stringExtra = getIntent().getStringExtra("target_setting");
            if (stringExtra != null && stringExtra.hashCode() == 1626211481 && stringExtra.equals("privacy_groupadd")) {
                startActivityForResult(new Intent(this, GroupAddPrivacyActivity.class), 2);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C41461tx c41461tx = this.A0V;
        c41461tx.A0X.remove(this.A0g);
        this.A0O.A00(this.A0f);
        A0i = null;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        String string;
        super.onResume();
        A1S();
        A1U();
        if (Build.VERSION.SDK_INT >= 23 && this.A0M.A06()) {
            this.A07.setVisibility(0);
            if (this.A0Q.A00.getBoolean("privacy_fingerprint_enabled", false)) {
                long j = this.A0Q.A00.getLong("privacy_fingerprint_timeout", 60000L);
                if (j == 0) {
                    string = getString(R.string.app_auth_enabled_immediately);
                } else if (j == 60000) {
                    string = ((ActivityC02310Ar) this).A01.A0A(R.plurals.app_auth_enabled_values, 1L, 1);
                } else if (j == 1800000) {
                    string = ((ActivityC02310Ar) this).A01.A0A(R.plurals.app_auth_enabled_values, 30L, 30);
                } else {
                    string = getString(R.string.app_auth_enabled_immediately);
                }
            } else {
                string = getString(R.string.app_auth_disabled);
            }
            this.A0B.setText(string);
            this.A07.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 2));
            return;
        }
        this.A07.setVisibility(8);
    }
}
