package com.facebook.redex;

import X.ActivityC02330At;
import X.C000200d;
import X.C002301c;
import X.C0BA;
import X.C0M6;
import X.C25d;
import X.C2AS;
import X.C2PT;
import X.C3ZZ;
import X.C53872he;
import X.C54042hx;
import X.C54802jN;
import X.InterfaceC72193Za;
import X.RunnableC71873Xu;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.settings.SettingsNotifications;
import com.whatsapp.settings.SettingsPrivacy;
import com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.WallpaperPreview;
import com.whatsapp.status.Hilt_StatusesFragment;
import com.whatsapp.status.SetStatus;
import com.whatsapp.status.StatusPrivacyActivity;
import com.whatsapp.status.StatusesFragment;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.stickers.AddThirdPartyStickerPackActivity;
import com.whatsapp.stickers.StickerStoreActivity;
import com.whatsapp.stickers.StickerStoreFeaturedTabFragment;
import com.whatsapp.storage.StorageUsageActivity;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.twofactor.SettingsTwoFactorAuthActivity;
import com.whatsapp.ui.media.MediaCard;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;

/* loaded from: classes2.dex */
public class ViewOnClickEBaseShape5S0100000_I0_5 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickEBaseShape5S0100000_I0_5(AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment, int i) {
        this.A01 = i;
        if (25 - i != 0) {
            this.A00 = addStickerPackDialogFragment;
        } else {
            this.A00 = addStickerPackDialogFragment;
        }
    }

    public ViewOnClickEBaseShape5S0100000_I0_5(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int indexOf;
        switch (this.A01) {
            case 0:
                ((SettingsNotifications) this.A00).lambda$initScreen$2348$SettingsNotifications(view);
                return;
            case 1:
                ((SettingsNotifications) this.A00).lambda$initScreen$2354$SettingsNotifications(view);
                return;
            case 2:
                ((SettingsPrivacy) this.A00).lambda$updateAppSecurityPreference$2414$SettingsPrivacy(view);
                return;
            case 3:
                ((SettingsPrivacy) this.A00).lambda$onCreate$2408$SettingsPrivacy(view);
                return;
            case 4:
                ((SettingsPrivacy) this.A00).lambda$onCreate$2405$SettingsPrivacy(view);
                return;
            case 5:
                ((SettingsPrivacy) this.A00).lambda$onCreate$2411$SettingsPrivacy(view);
                return;
            case 6:
                ((SettingsPrivacy) this.A00).lambda$onCreate$2406$SettingsPrivacy(view);
                return;
            case 7:
                ((SettingsPrivacy) this.A00).lambda$onCreate$2407$SettingsPrivacy(view);
                return;
            case 8:
                ((SettingsPrivacy) this.A00).lambda$onCreate$2413$SettingsPrivacy(view);
                return;
            case 9:
                ((SettingsPrivacy) this.A00).lambda$onCreate$2410$SettingsPrivacy(view);
                return;
            case 10:
                ((SettingsPrivacy) this.A00).lambda$onCreate$2409$SettingsPrivacy(view);
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                CompoundButton compoundButton = (CompoundButton) this.A00;
                compoundButton.setChecked(!compoundButton.isChecked());
                return;
            case 12:
                ((C2PT) this.A00).lambda$onCreate$2364$AbstractWallpaperPreview(view);
                return;
            case 13:
                ((GalleryWallpaperPreview) this.A00).lambda$onCreate$2379$GalleryWallpaperPreview(view);
                return;
            case 14:
                ((SolidColorWallpaperPreview) this.A00).lambda$onCreate$2381$SolidColorWallpaperPreview(view);
                return;
            case 15:
                ((WallpaperPreview) this.A00).lambda$onCreate$2373$WallpaperPreview(view);
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                ((SetStatus) this.A00).A1P();
                return;
            case 17:
                Hilt_StatusesFragment hilt_StatusesFragment = (Hilt_StatusesFragment) this.A00;
                hilt_StatusesFragment.A0i(new Intent(hilt_StatusesFragment.A00, StatusPrivacyActivity.class));
                return;
            case 18:
                ((C54042hx) this.A00).A02.A19(true);
                return;
            case 19:
                ((C54042hx) this.A00).A02.A19(false);
                return;
            case C0M6.A01 /* 20 */:
                StatusesFragment statusesFragment = ((C54802jN) this.A00).A0A;
                statusesFragment.A0i(new Intent(((Hilt_StatusesFragment) statusesFragment).A00, MyStatusesActivity.class));
                return;
            case 21:
                StatusesFragment statusesFragment2 = (StatusesFragment) this.A00;
                C000200d.A0j(statusesFragment2.A0K, "show_statuses_education", false);
                statusesFragment2.A02.setVisibility(8);
                return;
            case 22:
                StatusesFragment statusesFragment3 = (StatusesFragment) this.A00;
                statusesFragment3.A07.A01(statusesFragment3.A09(), 12);
                return;
            case 23:
                ((MessageReplyActivity) this.A00).A1T(false);
                return;
            case 24:
                ((MessageReplyActivity) this.A00).lambda$onCreate$2439$MessageReplyActivity(view);
                return;
            case 25:
                ((DialogFragment) this.A00).A11();
                return;
            case 26:
                ((Activity) this.A00).finish();
                return;
            case 27:
                ActivityC02330At A09 = ((C0BA) this.A00).A09();
                if (A09 instanceof StickerStoreActivity) {
                    StickerStoreActivity stickerStoreActivity = (StickerStoreActivity) A09;
                    StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = stickerStoreActivity.A06;
                    C53872he c53872he = stickerStoreActivity.A05;
                    if (c53872he == null || (indexOf = c53872he.A00.indexOf(stickerStoreFeaturedTabFragment)) == -1) {
                        return;
                    }
                    stickerStoreActivity.A01.A0B(indexOf, true);
                    return;
                }
                return;
            case 28:
                ((Activity) this.A00).finish();
                return;
            case 29:
                AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment = (AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment) this.A00;
                C002301c c002301c = addStickerPackDialogFragment.A01;
                addStickerPackDialogFragment.A18(c002301c.A0D(R.string.sticker_third_party_pack_add_progress_message_with_app, addStickerPackDialogFragment.A06, c002301c.A06(R.string.localized_app_name)), 0, 8, 8);
                C2AS c2as = addStickerPackDialogFragment.A03;
                c2as.A0S.AS1(new RunnableC71873Xu(c2as, addStickerPackDialogFragment.A04, addStickerPackDialogFragment.A05));
                return;
            case 30:
                ((C25d) this.A00).A09.A04();
                return;
            case 31:
                ((StorageUsageActivity) this.A00).onBackPressed();
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                ((StorageUsageActivity) this.A00).onSearchRequested();
                return;
            case 33:
                ((StorageUsageGalleryActivity) this.A00).onBackPressed();
                return;
            case 34:
                View view2 = (View) this.A00;
                if (view2.isSelected()) {
                    view2.setSelected(false);
                }
                view2.setSelected(true);
                return;
            case 35:
                ((StorageUsageGalleryActivity) this.A00).lambda$initToolbar$2570$StorageUsageGalleryActivity(view);
                return;
            case 36:
                ((Runnable) this.A00).run();
                return;
            case 37:
                ((Runnable) this.A00).run();
                return;
            case 38:
                ((C0BA) this.A00).A09().finish();
                return;
            case 39:
                ((SettingsTwoFactorAuthActivity) this.A00).lambda$onCreate$2598$SettingsTwoFactorAuthActivity(view);
                return;
            case 40:
                ((SettingsTwoFactorAuthActivity) this.A00).lambda$onCreate$2595$SettingsTwoFactorAuthActivity(view);
                return;
            case 41:
                ((SettingsTwoFactorAuthActivity) this.A00).lambda$onCreate$2596$SettingsTwoFactorAuthActivity(view);
                return;
            case 42:
                ((SettingsTwoFactorAuthActivity) this.A00).lambda$onCreate$2597$SettingsTwoFactorAuthActivity(view);
                return;
            case 43:
                ReadMoreTextView readMoreTextView = (ReadMoreTextView) this.A00;
                readMoreTextView.setExpanded(!readMoreTextView.A06);
                return;
            case 44:
                ((InterfaceC72193Za) this.A00).AIa();
                return;
            case 45:
                ((MediaCard) this.A00).A0C.AIa();
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                ((InterfaceC72193Za) this.A00).AIa();
                return;
            case 47:
                ((InterfaceC72193Za) this.A00).AIa();
                return;
            case 48:
                ((InterfaceC72193Za) this.A00).AIa();
                return;
            case 49:
                C3ZZ c3zz = (C3ZZ) this.A00;
                c3zz.A01.AIb(c3zz, view);
                return;
            default:
                return;
        }
    }
}
