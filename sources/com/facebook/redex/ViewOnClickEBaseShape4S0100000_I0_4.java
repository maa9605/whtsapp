package com.facebook.redex;

import X.C0M6;
import android.view.View;
import com.whatsapp.components.WaSwitchView;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.registration.directmigration.RestoreFromConsumerDatabaseActivity;
import com.whatsapp.report.ReportActivity;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.search.views.TokenizedSearchInput;
import com.whatsapp.settings.Settings;
import com.whatsapp.settings.SettingsAccount;
import com.whatsapp.settings.SettingsChat;
import com.whatsapp.settings.SettingsDataUsageActivity;
import com.whatsapp.settings.SettingsHelp;
import com.whatsapp.settings.SettingsNetworkUsage;
import com.whatsapp.settings.SettingsNotifications;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;

/* loaded from: classes2.dex */
public class ViewOnClickEBaseShape4S0100000_I0_4 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickEBaseShape4S0100000_I0_4(TokenizedSearchInput tokenizedSearchInput, int i) {
        this.A01 = i;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
                this.A00 = tokenizedSearchInput;
                return;
            default:
                this.A00 = tokenizedSearchInput;
                return;
        }
    }

    public ViewOnClickEBaseShape4S0100000_I0_4(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.A01) {
            case 0:
                ((RestoreFromConsumerDatabaseActivity) this.A00).lambda$null$2199$RestoreFromConsumerDatabaseActivity(view);
                return;
            case 1:
                ((ReportActivity) this.A00).lambda$initGdprViews$2237$ReportActivity(view);
                return;
            case 2:
                ((ReportActivity) this.A00).lambda$p2bReportNoneState$2238$ReportActivity(view);
                return;
            case 3:
                ((SearchFragment) this.A00).A16.A0K(true);
                return;
            case 4:
                TokenizedSearchInput.setFocus((TokenizedSearchInput) this.A00, 0);
                return;
            case 5:
                TokenizedSearchInput.setFocus((TokenizedSearchInput) this.A00, 1);
                return;
            case 6:
                SearchViewModel searchViewModel = ((TokenizedSearchInput) this.A00).A0C;
                if (searchViewModel != null) {
                    searchViewModel.A0d.A02("user_grid_view_choice", Boolean.valueOf(!searchViewModel.A0N()));
                    return;
                }
                return;
            case 7:
                TokenizedSearchInput.setFocus((TokenizedSearchInput) this.A00, 2);
                return;
            case 8:
                SearchViewModel searchViewModel2 = ((TokenizedSearchInput) this.A00).A0C;
                searchViewModel2.A0A();
                searchViewModel2.A0L(true);
                return;
            case 9:
                ((Settings) this.A00).lambda$onCreate$2387$Settings(view);
                return;
            case 10:
                ((Settings) this.A00).lambda$onCreate$2385$Settings(view);
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                ((Settings) this.A00).lambda$onCreate$2384$Settings(view);
                return;
            case 12:
                ((SettingsAccount) this.A00).lambda$onCreate$2307$SettingsAccount(view);
                return;
            case 13:
                ((SettingsAccount) this.A00).lambda$onCreate$2308$SettingsAccount(view);
                return;
            case 14:
                ((SettingsAccount) this.A00).lambda$onCreate$2306$SettingsAccount(view);
                return;
            case 15:
                ((SettingsAccount) this.A00).lambda$onCreate$2310$SettingsAccount(view);
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                ((SettingsAccount) this.A00).lambda$onCreate$2309$SettingsAccount(view);
                return;
            case 17:
                ((SettingsAccount) this.A00).lambda$onCreate$2305$SettingsAccount(view);
                return;
            case 18:
                ((SettingsChat) this.A00).lambda$onCreate$2388$SettingsChat(view);
                return;
            case 19:
                ((SettingsChat) this.A00).lambda$onCreate$2389$SettingsChat(view);
                return;
            case C0M6.A01 /* 20 */:
                ((SettingsChat) this.A00).lambda$onCreate$2393$SettingsChat(view);
                return;
            case 21:
                ((SettingsChat) this.A00).lambda$loadLanguagePicker$2397$SettingsChat(view);
                return;
            case 22:
                ((SettingsChat) this.A00).lambda$onCreate$2395$SettingsChat(view);
                return;
            case 23:
                ((SettingsChat) this.A00).lambda$onCreate$2391$SettingsChat(view);
                return;
            case 24:
                ((SettingsChat) this.A00).lambda$onCreate$2390$SettingsChat(view);
                return;
            case 25:
                ((WaSwitchView) this.A00).A00.toggle();
                return;
            case 26:
                ((SettingsChat) this.A00).lambda$onCreate$2394$SettingsChat(view);
                return;
            case 27:
                ((SettingsChat) this.A00).lambda$onCreate$2392$SettingsChat(view);
                return;
            case 28:
                ((SettingsDataUsageActivity) this.A00).lambda$onCreate$2323$SettingsDataUsageActivity(view);
                return;
            case 29:
                ((SettingsDataUsageActivity) this.A00).lambda$onCreate$2321$SettingsDataUsageActivity(view);
                return;
            case 30:
                ((SettingsDataUsageActivity) this.A00).lambda$onCreate$2325$SettingsDataUsageActivity(view);
                return;
            case 31:
                ((SettingsDataUsageActivity) this.A00).lambda$onCreate$2324$SettingsDataUsageActivity(view);
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                ((SettingsDataUsageActivity) this.A00).lambda$onCreate$2326$SettingsDataUsageActivity(view);
                return;
            case 33:
                ((SettingsHelp) this.A00).lambda$onCreate$2330$SettingsHelp(view);
                return;
            case 34:
                ((SettingsHelp) this.A00).lambda$onCreate$2331$SettingsHelp(view);
                return;
            case 35:
                ((SettingsHelp) this.A00).lambda$onCreate$2329$SettingsHelp(view);
                return;
            case 36:
                ((SettingsHelp) this.A00).lambda$onCreate$2332$SettingsHelp(view);
                return;
            case 37:
                ((SettingsNetworkUsage) this.A00).lambda$onCreate$2343$SettingsNetworkUsage(view);
                return;
            case 38:
                ((SettingsNotifications) this.A00).lambda$initScreen$2346$SettingsNotifications(view);
                return;
            case 39:
                ((SettingsNotifications) this.A00).lambda$initScreen$2357$SettingsNotifications(view);
                return;
            case 40:
                ((SettingsNotifications) this.A00).lambda$initScreen$2356$SettingsNotifications(view);
                return;
            case 41:
                ((SettingsNotifications) this.A00).lambda$initScreen$2350$SettingsNotifications(view);
                return;
            case 42:
                ((SettingsNotifications) this.A00).lambda$initScreen$2347$SettingsNotifications(view);
                return;
            case 43:
                ((SettingsNotifications) this.A00).lambda$initScreen$2358$SettingsNotifications(view);
                return;
            case 44:
                ((SettingsNotifications) this.A00).lambda$initScreen$2349$SettingsNotifications(view);
                return;
            case 45:
                ((SettingsNotifications) this.A00).lambda$initScreen$2353$SettingsNotifications(view);
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                ((SettingsNotifications) this.A00).lambda$initScreen$2352$SettingsNotifications(view);
                return;
            case 47:
                ((SettingsNotifications) this.A00).lambda$initScreen$2351$SettingsNotifications(view);
                return;
            case 48:
                ((SettingsNotifications) this.A00).lambda$initScreen$2359$SettingsNotifications(view);
                return;
            case 49:
                ((SettingsNotifications) this.A00).lambda$initScreen$2355$SettingsNotifications(view);
                return;
            default:
                return;
        }
    }
}
