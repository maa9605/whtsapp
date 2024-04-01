package com.whatsapp.settings;

import X.AbstractC40441sG;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass011;
import X.AnonymousClass014;
import X.AnonymousClass024;
import X.AnonymousClass029;
import X.C000200d;
import X.C000400f;
import X.C002301c;
import X.C003701t;
import X.C012005w;
import X.C018508q;
import X.C018708s;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C03370Fl;
import X.C03410Fp;
import X.C0AT;
import X.C0CB;
import X.C0CC;
import X.C0EG;
import X.C0KP;
import X.C0U1;
import X.C0VJ;
import X.C1NS;
import X.C23X;
import X.C26811Kv;
import X.C26D;
import X.C37111lt;
import X.C41521u3;
import X.C42171vH;
import X.C469829b;
import X.C59452sm;
import X.C659739g;
import X.C81293of;
import X.C81513p1;
import X.InterfaceC002901k;
import X.InterfaceC04910Mk;
import X.InterfaceC05880Qp;
import X.InterfaceC09820eo;
import X.ProgressDialogC06500To;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I0_4;
import com.google.android.search.verification.client.R;
import com.whatsapp.Me;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.SingleSelectionDialogFragment;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.components.WaSwitchView;
import com.whatsapp.settings.SettingsChat;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public class SettingsChat extends C26D implements InterfaceC04910Mk {
    public static ProgressDialogC06500To A0W;
    public int A00;
    public TextView A01;
    public SwitchCompat A02;
    public SwitchCompat A03;
    public C012005w A04;
    public C02L A05;
    public C26811Kv A06;
    public C469829b A07;
    public C018708s A08;
    public C000400f A09;
    public C02E A0A;
    public C02F A0B;
    public C42171vH A0C;
    public C0CC A0D;
    public C003701t A0E;
    public AnonymousClass011 A0F;
    public C0EG A0G;
    public C41521u3 A0H;
    public SettingsRowIconText A0I;
    public SettingsRowIconText A0J;
    public SettingsRowIconText A0K;
    public C0CB A0L;
    public AbstractC40441sG A0M;
    public InterfaceC002901k A0N;
    public boolean A0O;
    public String[] A0P;
    public String[] A0Q;
    public String[] A0R;
    public String[] A0S;
    public final C0KP A0U = new C0KP() { // from class: X.3oM
        {
            SettingsChat.this = this;
        }

        @Override // X.C0KP
        public final void AOz() {
            SettingsChat.this.A1S();
        }
    };
    public final Set A0V = new HashSet();
    public final InterfaceC05880Qp A0T = new InterfaceC05880Qp() { // from class: X.3oe
        {
            SettingsChat.this = this;
        }

        @Override // X.InterfaceC05880Qp
        public void ANZ(String str) {
            Log.i("settings-chat/readonly-external-storage-readonly");
            SettingsChat settingsChat = SettingsChat.this;
            boolean A01 = C000400f.A01();
            int i = R.string.read_only_media_message_shared_storage;
            if (A01) {
                i = R.string.read_only_media_message;
            }
            settingsChat.AUl(R.string.msg_store_backup_skipped, i, new Object[0]);
        }

        @Override // X.InterfaceC05880Qp
        public void ANa() {
            Log.i("settings-chat/readonly-external-storage-readonly-permission");
            SettingsChat settingsChat = SettingsChat.this;
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_need_write_access_on_backup_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_need_write_access_on_backup;
            }
            RequestPermissionActivity.A05(settingsChat, R.string.permission_storage_need_write_access_on_backup_request, i2);
        }

        @Override // X.InterfaceC05880Qp
        public void AQ0(String str) {
            Log.i("settings-chat/external-storage-unavailable");
            C002701i.A19(SettingsChat.this, 602);
        }

        @Override // X.InterfaceC05880Qp
        public void AQ1() {
            Log.i("settings-chat/external-storage-unavailable-permission");
            SettingsChat settingsChat = SettingsChat.this;
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_need_write_access_on_backup_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_need_write_access_on_backup;
            }
            RequestPermissionActivity.A05(settingsChat, R.string.permission_storage_need_write_access_on_backup_request, i2);
        }
    };

    public static Dialog A00(Context context) {
        ProgressDialogC06500To progressDialogC06500To = new ProgressDialogC06500To(context);
        A0W = progressDialogC06500To;
        progressDialogC06500To.setTitle(R.string.msg_store_backup_db_title);
        A0W.setMessage(context.getString(R.string.settings_backup_db_now_message));
        A0W.setIndeterminate(true);
        A0W.setCancelable(false);
        return A0W;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.app.Dialog A01(final android.content.Context r5) {
        /*
            boolean r0 = X.C000400f.A01()
            r4 = 0
            if (r0 == 0) goto L42
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            java.lang.String r0 = "unmounted"
            boolean r1 = r0.equals(r1)
            r3 = 2131888321(0x7f1208c1, float:1.9411274E38)
            r0 = 2131888320(0x7f1208c0, float:1.9411272E38)
            if (r1 == 0) goto L48
            r3 = 2131888323(0x7f1208c3, float:1.9411278E38)
            r0 = 2131888322(0x7f1208c2, float:1.9411276E38)
            X.3W7 r2 = new X.3W7
            r2.<init>()
        L24:
            X.08x r1 = new X.08x
            r1.<init>(r5)
            r1.A03(r3)
            r1.A02(r0)
            r0 = 2131888523(0x7f12098b, float:1.9411684E38)
            r1.A06(r0, r4)
            if (r2 == 0) goto L3d
            r0 = 2131886450(0x7f120172, float:1.940748E38)
            r1.A06(r0, r2)
        L3d:
            X.08z r0 = r1.A00()
            return r0
        L42:
            r3 = 2131888319(0x7f1208bf, float:1.941127E38)
            r0 = 2131888425(0x7f120929, float:1.9411485E38)
        L48:
            r2 = r4
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsChat.A01(android.content.Context):android.app.Dialog");
    }

    public static String A02(Activity activity, C002301c c002301c, C0CC c0cc) {
        long A08 = c0cc.A08();
        if (A08 == 0) {
            return activity.getString(R.string.never);
        }
        if (A08 == -1) {
            return activity.getString(R.string.unknown);
        }
        return AnonymousClass029.A0f(c002301c, A08);
    }

    @Override // X.ActivityC02290Ap
    public void A17(Configuration configuration) {
        if (this.A0O) {
            return;
        }
        super.A17(configuration);
    }

    public final int A1R(String[] strArr) {
        int A01 = AnonymousClass024.A01(((ActivityC02290Ap) this).A0F.A00.getString("interface_font_size", "0"), 0);
        for (int i = 0; i < strArr.length; i++) {
            if (A01 == Integer.valueOf(strArr[i]).intValue()) {
                return i;
            }
        }
        return -1;
    }

    public final void A1S() {
        String A02 = A02(this, ((ActivityC02310Ar) this).A01, this.A0D);
        if (this.A0I == null) {
            return;
        }
        if (this.A07.A07()) {
            this.A0I.setSubText(null);
        } else if (this.A0B.A06()) {
            this.A0I.setSubText(getString(R.string.settings_msg_store_last_backup, A02));
        } else {
            this.A0I.setSubText(getString(R.string.settings_msg_store_cannot_backup));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0059, code lost:
        if (r9 != 1) goto L17;
     */
    @Override // X.InterfaceC04910Mk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AOi(int r8, int r9) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsChat.AOi(int, int):void");
    }

    public void lambda$loadLanguagePicker$2397$SettingsChat(View view) {
        this.A0F.A0B(new AnonymousClass014() { // from class: X.1lu
            {
                AnonymousClass015 anonymousClass015 = AnonymousClass014.DEFAULT_SAMPLING_RATE;
            }
        }, null, false);
        A1Q(2, R.string.settings_language, this.A00, this.A0R);
    }

    public void lambda$onCreate$2388$SettingsChat(View view) {
        C26811Kv c26811Kv = this.A06;
        int A00 = c26811Kv.A00();
        String[] A0O = c26811Kv.A02.A0O(C26811Kv.A03);
        SingleSelectionDialogFragment singleSelectionDialogFragment = new SingleSelectionDialogFragment();
        Bundle A002 = SingleSelectionDialogFragment.A00(3, A00, R.string.settings_theme_dialog_title, A0O);
        A002.putBoolean("showConfirmation", true);
        singleSelectionDialogFragment.A0P(A002);
        AUh(singleSelectionDialogFragment);
    }

    public void lambda$onCreate$2389$SettingsChat(View view) {
        this.A02.toggle();
        C000200d.A0j(((ActivityC02290Ap) this).A0F, "input_enter_send", this.A02.isChecked());
    }

    public /* synthetic */ void lambda$onCreate$2390$SettingsChat(View view) {
        A1P(1, R.string.settings_font_size, A1R(this.A0Q), R.array.font_size);
    }

    public void lambda$onCreate$2391$SettingsChat(View view) {
        this.A03.toggle();
        boolean isChecked = this.A03.isChecked();
        C0CB c0cb = this.A0L;
        int i = isChecked ? 2 : 1;
        C03370Fl A08 = c0cb.A08("individual_chat_defaults");
        if (i != A08.A00) {
            A08.A00 = i;
            c0cb.A0J(A08);
        }
        if (isChecked) {
            this.A0N.AS1(new RunnableEBaseShape6S0100000_I0_6(this.A04, 17));
        }
    }

    public /* synthetic */ void lambda$onCreate$2392$SettingsChat(View view) {
        C03410Fp.A07(((ActivityC02290Ap) this).A0B, this, null, this, 17);
    }

    public /* synthetic */ void lambda$onCreate$2393$SettingsChat(View view) {
        if (this.A09.A0A(this.A0T)) {
            C42171vH c42171vH = this.A0C;
            C0EG c0eg = this.A0G;
            c42171vH.A01(3000L, new C81293of(this, ((ActivityC02310Ar) this).A01, c42171vH, c0eg, this, new RunnableEBaseShape6S0100000_I0_6(this, 23), this.A09, this.A0B));
        }
    }

    public /* synthetic */ void lambda$onCreate$2394$SettingsChat(View view) {
        startActivity(new Intent(this, SettingsGoogleDrive.class));
    }

    public /* synthetic */ void lambda$onCreate$2395$SettingsChat(View view) {
        startActivity(new Intent(this, SettingsChatHistory.class));
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == 0 && intent != null) {
            if (intent.getBooleanExtra("oom", false)) {
                Log.e("conversation/activityres/oom-error");
                ((ActivityC02290Ap) this).A0A.A0C(this, R.string.error_out_of_memory);
            }
            if (intent.getBooleanExtra("no-space", false)) {
                Log.e("conversation/activityres/no-space");
                ((ActivityC02290Ap) this).A0A.A0C(this, R.string.error_no_disc_space);
            }
            if (intent.getBooleanExtra("io-error", false)) {
                Log.e("conversation/activityres/fail/load-image");
                ((ActivityC02290Ap) this).A0A.A0C(this, R.string.error_load_image);
            }
        }
        super.onActivityResult(i, i2, intent);
        Iterator it = this.A0V.iterator();
        while (it.hasNext() && !((InterfaceC09820eo) it.next()).onActivityResult(i, i2, intent)) {
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (this.A0O) {
            return;
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // X.C26D, X.C26F, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.settings_chat);
        setContentView(R.layout.preferences_chat);
        this.A06 = new C26811Kv(this, ((ActivityC02310Ar) this).A01, ((ActivityC02290Ap) this).A0F);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            this.A02 = (SwitchCompat) C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.enter_key_preference_switch);
            this.A03 = (SwitchCompat) C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.media_visibility_preference_switch);
            this.A01 = (TextView) C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.font_size_preference_subtitle);
            this.A0K = (SettingsRowIconText) C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.settings_theme);
            View A0D = C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.wallpaper_preference);
            View A0D2 = C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.enter_key_preference);
            View A0D3 = C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.font_size_preference);
            View A0D4 = C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.media_visibility_preference);
            this.A0I = (SettingsRowIconText) C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.chat_backup_preference);
            this.A0J = (SettingsRowIconText) C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.language_preference);
            View A0D5 = C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.chat_history_preference);
            this.A0K.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 18));
            SettingsRowIconText settingsRowIconText = this.A0K;
            C26811Kv c26811Kv = this.A06;
            settingsRowIconText.setSubText(c26811Kv.A00.getString(C26811Kv.A03[c26811Kv.A00()]));
            A0D2.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 19));
            this.A02.setChecked(((ActivityC02290Ap) this).A0F.A00.getBoolean("input_enter_send", true));
            this.A0P = getResources().getStringArray(R.array.font_size);
            String[] stringArray = getResources().getStringArray(R.array.font_size_values);
            this.A0Q = stringArray;
            int A1R = A1R(stringArray);
            if (A1R >= 0) {
                this.A01.setText(this.A0P[A1R]);
            }
            A0D3.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 24));
            WaSwitchView waSwitchView = (WaSwitchView) C0VJ.A0A(this, R.id.chat_settings_notify_new_message_switch_view);
            View A0A = C0VJ.A0A(this, R.id.read_later_setting_divider);
            View A0A2 = C0VJ.A0A(this, R.id.archived_chats_main_setting_title);
            if (C23X.A0L(((ActivityC02290Ap) this).A0B, ((ActivityC02290Ap) this).A0F)) {
                waSwitchView.setVisibility(0);
                waSwitchView.setChecked(true ^ ((ActivityC02290Ap) this).A0F.A0l());
                waSwitchView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: X.3W6
                    {
                        SettingsChat.this = this;
                    }

                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        SettingsChat settingsChat = SettingsChat.this;
                        InterfaceC002901k interfaceC002901k = settingsChat.A0N;
                        C41521u3 c41521u3 = settingsChat.A0H;
                        C000500h c000500h = ((ActivityC02290Ap) settingsChat).A0F;
                        boolean z2 = !z;
                        interfaceC002901k.AS1(new RunnableEBaseShape0S0110000_I0(c41521u3, z2, 4));
                        c000500h.A0D().putBoolean("notify_new_message_for_archived_chats", z2).apply();
                    }
                });
                waSwitchView.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(waSwitchView, 25));
                A0A.setVisibility(0);
                A0A2.setVisibility(0);
            } else {
                waSwitchView.setVisibility(8);
                A0A.setVisibility(8);
                A0A2.setVisibility(8);
            }
            A0D4.setVisibility(0);
            this.A03.setChecked(this.A0L.A0O());
            A0D4.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 23));
            A0D.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 27));
            if (!this.A07.A07()) {
                this.A0I.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 20));
            } else {
                this.A0I.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 26));
            }
            A0D5.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 22));
            C018508q c018508q = ((ActivityC02290Ap) this).A0A;
            this.A0V.add(new C659739g(this, c018508q, ((ActivityC02290Ap) this).A0B, this.A0A, this.A0M, this, new C81513p1(c018508q), new C59452sm()));
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i != 600) {
            if (i != 602) {
                return super.onCreateDialog(i);
            }
            return A01(this);
        }
        return A00(this);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        C000400f c000400f = this.A09;
        C0KP c0kp = this.A0U;
        if (c000400f != null) {
            if (c0kp != null) {
                c000400f.A07.remove(c0kp);
            }
            super.onPause();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        C000400f c000400f = this.A09;
        C0KP c0kp = this.A0U;
        if (c000400f != null) {
            if (c0kp != null) {
                c000400f.A07.add(c0kp);
            }
            String A02 = A02(this, ((ActivityC02310Ar) this).A01, this.A0D);
            if (this.A0I != null) {
                if (this.A07.A07()) {
                    this.A0I.setSubText(null);
                } else if (this.A0B.A06()) {
                    this.A0I.setSubText(getString(R.string.settings_msg_store_last_backup, A02));
                } else {
                    this.A0I.setSubText(getString(R.string.settings_msg_store_cannot_backup));
                }
            }
            C02L c02l = this.A05;
            c02l.A05();
            Me me = c02l.A00;
            if (me == null) {
                this.A0J.setVisibility(8);
                return;
            }
            C002301c c002301c = ((ActivityC02310Ar) this).A01;
            C1NS c1ns = new C1NS(me.cc, me.number, c002301c.A05, c002301c.A04);
            if (c1ns.A01 == 0) {
                this.A0J.setVisibility(8);
                return;
            } else if (!c1ns.A03.equals("US") || this.A0E.A0C(292)) {
                this.A0J.setVisibility(0);
                String[] strArr = c1ns.A04;
                strArr[0] = getString(R.string.device_default_language_with_placeholder, strArr[0]);
                String[] strArr2 = c1ns.A04;
                this.A0R = strArr2;
                this.A0S = c1ns.A05;
                int i = c1ns.A00;
                this.A00 = i;
                this.A0J.setSubText(strArr2[i]);
                this.A0J.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 21));
                String str = c1ns.A02;
                if (str.isEmpty()) {
                    return;
                }
                C37111lt c37111lt = new C37111lt();
                c37111lt.A00 = str;
                this.A0F.A0B(c37111lt, null, false);
                return;
            } else {
                return;
            }
        }
        throw null;
    }
}
