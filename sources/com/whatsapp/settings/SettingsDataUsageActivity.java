package com.whatsapp.settings;

import X.AnonymousClass011;
import X.AnonymousClass012;
import X.C000200d;
import X.C000500h;
import X.C002701i;
import X.C019208x;
import X.C02F;
import X.C02L;
import X.C0EL;
import X.C0HS;
import X.C0U1;
import X.C25N;
import X.C2PF;
import X.C2PG;
import X.C40731sm;
import X.C41601uD;
import X.C44301yq;
import X.C81343ok;
import X.InterfaceC002901k;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.facebook.redex.ViewOnClickEBaseShape0S1100000_I0;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I0_4;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.settings.SettingsDataUsageActivity;
import com.whatsapp.storage.StorageUsageActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public class SettingsDataUsageActivity extends C2PF implements C2PG {
    public int A00;
    public int A01;
    public int A02;
    public Handler A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public SwitchCompat A0G;
    public C02L A0H;
    public C0EL A0I;
    public AnonymousClass012 A0J;
    public C02F A0K;
    public C000500h A0L;
    public AnonymousClass011 A0M;
    public C41601uD A0N;
    public C81343ok A0O;
    public C25N A0P;
    public C0HS A0Q;
    public InterfaceC002901k A0R;
    public C44301yq A0S;
    public TimerTask A0U;
    public String[] A0V;
    public String[] A0W;
    public Timer A0T = new Timer("refresh-network-usage");
    public long A03 = -1;

    public static int A00(CharSequence[] charSequenceArr) {
        int i = 0;
        for (CharSequence charSequence : charSequenceArr) {
            i |= 1 << Integer.parseInt(charSequence.toString());
        }
        return i;
    }

    public final String A1R(int i) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (i != 0) {
            if ((i & 1) != 0) {
                arrayList.add(Integer.toString(i3));
            }
            i >>= 1;
            i3++;
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        int length = charSequenceArr.length;
        String[] strArr = this.A0W;
        if (length == strArr.length) {
            return getString(R.string.settings_autodownload_all);
        }
        if (length == 0) {
            return getString(R.string.settings_autodownload_none);
        }
        CharSequence charSequence = charSequenceArr[0];
        while (true) {
            if (i2 >= strArr.length) {
                str = "";
                break;
            }
            String charSequence2 = charSequence.toString();
            strArr = this.A0W;
            if (charSequence2.equals(strArr[i2])) {
                str = this.A0V[i2];
                break;
            }
            i2++;
        }
        StringBuilder sb = new StringBuilder(str);
        for (int i4 = 1; i4 < length; i4++) {
            StringBuilder A0P = C000200d.A0P(", ");
            CharSequence charSequence3 = charSequenceArr[i4];
            int i5 = 0;
            while (true) {
                if (i5 >= this.A0W.length) {
                    str2 = "";
                    break;
                } else if (charSequence3.toString().equals(this.A0W[i5])) {
                    str2 = this.A0V[i5];
                    break;
                } else {
                    i5++;
                }
            }
            A0P.append(str2);
            sb.append(A0P.toString());
        }
        return sb.toString();
    }

    public final void A1S() {
        this.A0F.setVisibility(0);
        Log.i("settings-data-usage-activity/loadStorageData");
        C0HS c0hs = new C0HS() { // from class: X.3oj
            {
                SettingsDataUsageActivity.this = this;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                Log.i("settings-data-usage-activity/load storage data/load cache in background");
                return SettingsDataUsageActivity.this.A0P.A00().A04;
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                Number number = (Number) obj;
                if (number != null) {
                    SettingsDataUsageActivity settingsDataUsageActivity = SettingsDataUsageActivity.this;
                    if (settingsDataUsageActivity.A03 == -1) {
                        Log.i("settings-data-usage-activity/load storage data/cache data fetched");
                        long longValue = number.longValue();
                        settingsDataUsageActivity.A03 = longValue;
                        settingsDataUsageActivity.A0F.setText(C02180Ae.A0l(((ActivityC02310Ar) settingsDataUsageActivity).A01, longValue));
                    }
                }
            }
        };
        this.A0Q = c0hs;
        this.A0R.ARy(c0hs, new Void[0]);
        C81343ok c81343ok = new C81343ok(this);
        this.A0O = c81343ok;
        this.A0R.ARy(c81343ok, new Void[0]);
    }

    public final void A1T(String str) {
        int i;
        int i2;
        boolean[] zArr;
        if (str.equals("autodownload_cellular_mask")) {
            i = 2;
            i2 = R.string.settings_autodownload_cellular;
            int i3 = this.A00;
            zArr = new boolean[this.A0W.length];
            int i4 = 0;
            while (i3 != 0) {
                boolean z = false;
                if ((i3 & 1) != 0) {
                    z = true;
                }
                zArr[i4] = z;
                i3 >>= 1;
                i4++;
            }
        } else if (str.equals("autodownload_wifi_mask")) {
            i = 3;
            i2 = R.string.settings_autodownload_wifi;
            int i5 = this.A02;
            zArr = new boolean[this.A0W.length];
            int i6 = 0;
            while (i5 != 0) {
                boolean z2 = false;
                if ((i5 & 1) != 0) {
                    z2 = true;
                }
                zArr[i6] = z2;
                i5 >>= 1;
                i6++;
            }
        } else if (str.equals("autodownload_roaming_mask")) {
            i = 4;
            i2 = R.string.settings_autodownload_roaming;
            int i7 = this.A01;
            zArr = new boolean[this.A0W.length];
            int i8 = 0;
            while (i7 != 0) {
                boolean z3 = false;
                if ((i7 & 1) != 0) {
                    z3 = true;
                }
                zArr[i8] = z3;
                i7 >>= 1;
                i8++;
            }
        } else {
            throw new IllegalArgumentException("Invalid preference key passed in for auto download settings dialog");
        }
        MultiSelectionDialogFragment multiSelectionDialogFragment = new MultiSelectionDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("dialogId", i);
        bundle.putInt("dialogTitleResId", i2);
        bundle.putInt("itemsResId", R.array.autodownload);
        bundle.putBooleanArray("selectedItems", zArr);
        multiSelectionDialogFragment.A0P(bundle);
        AUh(multiSelectionDialogFragment);
    }

    public /* synthetic */ void A1U(String str) {
        if (!this.A0K.A06()) {
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_need_write_access_on_storage_usage_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_need_write_access_on_storage_usage;
            }
            RequestPermissionActivity.A05(this, R.string.permission_storage_need_write_access_on_storage_usage_request, i2);
            return;
        }
        startActivityForResult(StorageUsageActivity.A00(this, str, 1), 1);
    }

    @Override // X.C2PG
    public void AMH(int i, boolean[] zArr) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < zArr.length; i2++) {
            if (zArr[i2]) {
                arrayList.add(this.A0W[i2]);
            }
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        if (i == 2) {
            int A00 = A00(charSequenceArr);
            this.A00 = A00;
            C000200d.A0g(this.A0L, "autodownload_cellular_mask", A00);
            this.A0C.setText(A1R(this.A00));
            this.A0N.A01();
        } else if (i == 3) {
            int A002 = A00(charSequenceArr);
            this.A02 = A002;
            C000200d.A0g(this.A0L, "autodownload_wifi_mask", A002);
            this.A0E.setText(A1R(this.A02));
            this.A0N.A01();
        } else if (i == 4) {
            int A003 = A00(charSequenceArr);
            this.A01 = A003;
            C000200d.A0g(this.A0L, "autodownload_roaming_mask", A003);
            this.A0D.setText(A1R(this.A01));
            this.A0N.A01();
            if ((this.A01 & 4) != 0) {
                C002701i.A19(this, 1);
            }
        }
    }

    public /* synthetic */ void lambda$onCreate$2321$SettingsDataUsageActivity(View view) {
        startActivity(new Intent(this, SettingsNetworkUsage.class));
    }

    public /* synthetic */ void lambda$onCreate$2323$SettingsDataUsageActivity(View view) {
        A1T("autodownload_cellular_mask");
    }

    public /* synthetic */ void lambda$onCreate$2324$SettingsDataUsageActivity(View view) {
        A1T("autodownload_wifi_mask");
    }

    public /* synthetic */ void lambda$onCreate$2325$SettingsDataUsageActivity(View view) {
        A1T("autodownload_roaming_mask");
    }

    public void lambda$onCreate$2326$SettingsDataUsageActivity(View view) {
        this.A0G.toggle();
        C000200d.A0j(this.A0L, "voip_low_data_usage", this.A0G.isChecked());
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 151) {
            if (i2 == -1) {
                A1S();
                startActivity(new Intent(this, StorageUsageActivity.class));
                return;
            }
        } else if (i == 1) {
            A1S();
            return;
        }
        Log.i("settings-data-usage-activity/onActivityResult/storage_permission denied/cant open StorageUsageActivity");
    }

    @Override // X.C2PF, X.C26F, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0P = new C25N(this.A0J, this.A0S);
        C02L c02l = this.A0H;
        c02l.A05();
        if (c02l.A00 == null) {
            startActivity(new Intent(this, Main.class));
            finish();
            return;
        }
        setTitle(R.string.settings_storage_and_data_usage_enhanced);
        setContentView(R.layout.preferences_data_usage);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            this.A04 = new Handler(Looper.myLooper());
            this.A0V = getResources().getStringArray(R.array.autodownload);
            this.A0W = getResources().getStringArray(R.array.autodownload_values);
            this.A00 = this.A0L.A00.getInt("autodownload_cellular_mask", 1);
            this.A02 = this.A0L.A00.getInt("autodownload_wifi_mask", 15);
            this.A01 = this.A0L.A00.getInt("autodownload_roaming_mask", 0);
            this.A09 = findViewById(R.id.setting_network_usage);
            this.A0B = (TextView) findViewById(R.id.setting_network_usage_details);
            this.A0A = findViewById(R.id.setting_storage_usage);
            this.A0F = (TextView) findViewById(R.id.setting_storage_usage_details);
            this.A05 = findViewById(R.id.setting_autodownload_cellular);
            this.A0C = (TextView) findViewById(R.id.setting_selected_autodownload_cellular);
            this.A07 = findViewById(R.id.setting_autodownload_wifi);
            this.A0E = (TextView) findViewById(R.id.setting_selected_autodownload_wifi);
            this.A06 = findViewById(R.id.setting_autodownload_roaming);
            this.A0D = (TextView) findViewById(R.id.setting_selected_autodownload_roaming);
            this.A08 = findViewById(R.id.settings_calls_low_data);
            this.A0G = (SwitchCompat) findViewById(R.id.low_data_calls_switch);
            this.A09.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 29));
            this.A0A.setOnClickListener(new ViewOnClickEBaseShape0S1100000_I0(this, C40731sm.A0N(1, this.A0M), 4));
            this.A0C.setText(A1R(this.A00));
            this.A05.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 28));
            this.A0E.setText(A1R(this.A02));
            this.A07.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 31));
            this.A0D.setText(A1R(this.A01));
            this.A06.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 30));
            this.A0G.setChecked(this.A0L.A00.getBoolean("voip_low_data_usage", false));
            this.A08.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 32));
            if (this.A0K.A06()) {
                A1S();
                return;
            } else {
                this.A0F.setVisibility(8);
                return;
            }
        }
        throw null;
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i != 1) {
            return super.onCreateDialog(i);
        }
        C019208x c019208x = new C019208x(this);
        c019208x.A02(R.string.settings_autodownload_roaming_warning);
        c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3W9
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
            }
        });
        return c019208x.A00();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A0T.cancel();
        C0HS c0hs = this.A0Q;
        if (c0hs != null) {
            c0hs.A05(true);
        }
        C81343ok c81343ok = this.A0O;
        if (c81343ok != null) {
            c81343ok.A00.set(true);
            c81343ok.A05(true);
        }
        this.A03 = -1L;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        this.A0U.cancel();
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        TimerTask timerTask = new TimerTask() { // from class: X.3WG
            {
                SettingsDataUsageActivity.this = this;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                SettingsDataUsageActivity settingsDataUsageActivity = SettingsDataUsageActivity.this;
                settingsDataUsageActivity.A04.post(new RunnableEBaseShape9S0100000_I1_1(settingsDataUsageActivity, 15));
            }
        };
        this.A0U = timerTask;
        this.A0T.scheduleAtFixedRate(timerTask, 0L, 1000L);
    }
}
