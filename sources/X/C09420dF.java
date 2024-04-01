package X;

import com.whatsapp.CameraHomeFragment;
import com.whatsapp.ContentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment;
import com.whatsapp.Conversation;
import com.whatsapp.DisplayExceptionDialogFactory$ClockWrongDialogFragment;
import com.whatsapp.DisplayExceptionDialogFactory$ContactBlockedDialogFragment;
import com.whatsapp.DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment;
import com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment;
import com.whatsapp.DisplayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment;
import com.whatsapp.DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment;
import com.whatsapp.DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment;
import com.whatsapp.DocumentPickerActivity;
import com.whatsapp.Hilt_CameraHomeFragment;
import com.whatsapp.IntentChooserBottomSheetDialogFragment;
import com.whatsapp.MessageDialogFragment;
import com.whatsapp.MuteDialogFragment;
import com.whatsapp.PushnameEmojiBlacklistDialogFragment;
import com.whatsapp.RevokeLinkConfirmationDialogFragment;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.SimpleExternalStorageStateCallback$PermissionDeniedDialogFragment;
import com.whatsapp.SimpleExternalStorageStateCallback$SDCardUnavailableDialogFragment;
import com.whatsapp.SingleSelectionDialogFragment;
import com.whatsapp.SuspiciousLinkWarningDialogFragment;
import com.whatsapp.account.delete.DeleteAccountFeedback;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.authentication.SetupDeviceAuthDialog;
import com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment;
import com.whatsapp.backup.encryptedbackup.ChangePasswordDisableFragment;
import com.whatsapp.backup.encryptedbackup.ChangePasswordDoneFragment;
import com.whatsapp.backup.encryptedbackup.ConfirmChangePasswordFragment;
import com.whatsapp.backup.encryptedbackup.ConfirmEnableFragment;
import com.whatsapp.backup.encryptedbackup.ConfirmPasswordFragment;
import com.whatsapp.backup.encryptedbackup.CreatePasswordFragment;
import com.whatsapp.backup.encryptedbackup.EnableDoneFragment;
import com.whatsapp.backup.encryptedbackup.EnableInfoFragment;
import com.whatsapp.backup.encryptedbackup.RestorePasswordInputFragment;
import com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment;
import com.whatsapp.backup.google.PromptDialogFragment;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.backup.google.SingleChoiceListDialogFragment;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.base.WaFragment;
import com.whatsapp.base.WaListFragment;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.biz.cart.view.fragment.QuantityPickerDialogFragment;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.biz.catalog.CatalogReportDialogFragment;
import com.whatsapp.biz.catalog.CatalogReportReasonDialogFragment;
import com.whatsapp.biz.order.view.fragment.OrderDetailFragment;
import com.whatsapp.blocklist.BlockConfirmationDialogFragment;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.bloks.ui.BloksDialogFragment;
import com.whatsapp.camera.CameraMediaPickerFragment;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment;
import com.whatsapp.companiondevice.LinkedDevicesLogoutAllConfirmationDialogFragment;
import com.whatsapp.companiondevice.LinkedDevicesLogoutOneDeviceConfirmationDialogFragment;
import com.whatsapp.companiondevice.WifiSpeedBumpDialogFragment;
import com.whatsapp.companiondevice.optin.ui.FirstTimeExperienceDialogFragment;
import com.whatsapp.contact.picker.BaseSharedPreviewDialogFragment;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.contact.picker.InviteToGroupCallConfirmationFragment;
import com.whatsapp.contact.picker.SharedFilePreviewDialogFragment;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.conversation.CapturePictureOrVideoDialogFragment;
import com.whatsapp.conversation.ChangeNumberNotificationDialogFragment;
import com.whatsapp.conversation.ChatMediaEphemeralVisibilityDialog;
import com.whatsapp.conversation.ChatMediaVisibilityDialog;
import com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment;
import com.whatsapp.conversation.conversationrow.ConversationRow$ConversationRowDialogFragment;
import com.whatsapp.conversation.conversationrow.ConversationRowContact$MessageSharedContactDialogFragment;
import com.whatsapp.conversation.conversationrow.DeviceChangeDialogFragment;
import com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment;
import com.whatsapp.conversation.conversationrow.IdentityChangeDialogFragment;
import com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment;
import com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.conversation.selectlist.SelectListBottomSheet;
import com.whatsapp.conversationslist.ArchivedConversationsFragment;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.conversationslist.LeaveGroupsDialogFragment;
import com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment;
import com.whatsapp.dialogs.CreateOrAddToContactsDialog;
import com.whatsapp.dialogs.FAQLearnMoreDialogFragment;
import com.whatsapp.dialogs.HFMLearnMoreDialogFragment;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.dialogs.RoomsNUXBottomSheetDialogFragment;
import com.whatsapp.dialogs.RoomsRedirectDialogFragment;
import com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment;
import com.whatsapp.ephemeral.EphemeralNUXDialog;
import com.whatsapp.ephemeral.ViewOnceNUXDialog;
import com.whatsapp.gallery.DocumentsGalleryFragment;
import com.whatsapp.gallery.GalleryFragmentBase;
import com.whatsapp.gallery.LinksGalleryFragment;
import com.whatsapp.gallery.MediaGalleryFragment;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallery.ProductGalleryFragment;
import com.whatsapp.gallerypicker.GalleryPickerFragment;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.gif_search.RemoveDownloadableGifFromFavoritesDialogFragment;
import com.whatsapp.gif_search.RemoveGifFromFavoritesDialogFragment;
import com.whatsapp.gif_search.StarDownloadableGifDialogFragment;
import com.whatsapp.gif_search.StarOrRemoveFromRecentGifsDialogFragment;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.group.GroupParticipantsSearchFragment;
import com.whatsapp.group.GroupSettingsActivity;
import com.whatsapp.http.GoogleSearchDialogFragment;
import com.whatsapp.inappsupport.ui.SupportTopicsFragment;
import com.whatsapp.invites.NobodyDeprecatedDialogFragment;
import com.whatsapp.invites.PromptSendGroupInviteDialogFragment;
import com.whatsapp.invites.RevokeInviteDialogFragment;
import com.whatsapp.location.StopLiveLocationDialogFragment;
import com.whatsapp.mediacomposer.GifComposerFragment;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import com.whatsapp.mediaview.DeleteMessagesDialogFragment;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.RevokeNuxDialogFragment;
import com.whatsapp.notification.RequestPermissionsDialogFragment;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.AddPaymentMethodBottomSheet;
import com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.BrazilPaymentTypePickerFragment;
import com.whatsapp.payments.ui.BrazilReTosFragment;
import com.whatsapp.payments.ui.BrazilSmbMerchantNuxUpSellBottomSheet;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.ConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.IndiaUpiContactPicker;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaDialogFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentContactPickerFragment;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import com.whatsapp.payments.ui.PaymentRailPickerFragment;
import com.whatsapp.payments.ui.PaymentTypePickerFragment;
import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;
import com.whatsapp.payments.ui.ReTosFragment;
import com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment;
import com.whatsapp.payments.ui.invites.PaymentInviteFragment;
import com.whatsapp.payments.ui.widget.MandatePaymentBottomSheetFragment;
import com.whatsapp.phonematching.ConnectionProgressDialogFragment;
import com.whatsapp.phonematching.ConnectionUnavailableDialogFragment;
import com.whatsapp.phonematching.CountryAndPhoneNumberFragment;
import com.whatsapp.phonematching.MatchPhoneNumberFragment;
import com.whatsapp.picker.search.GifSearchDialogFragment;
import com.whatsapp.picker.search.StickerSearchDialogFragment;
import com.whatsapp.picker.search.StickerSearchTabFragment;
import com.whatsapp.profile.ResetGroupPhoto;
import com.whatsapp.profile.ResetProfilePhoto;
import com.whatsapp.qrcode.QrEducationDialogFragment;
import com.whatsapp.qrcode.contactqr.BaseQrActivity$RevokeCodeDialogFragment;
import com.whatsapp.qrcode.contactqr.BaseQrActivity$TryAgainDialogFragment;
import com.whatsapp.qrcode.contactqr.ContactQrMyCodeFragment;
import com.whatsapp.qrcode.contactqr.ErrorDialogFragment;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;
import com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment;
import com.whatsapp.qrcode.contactqr.WebCodeDialogFragment;
import com.whatsapp.registration.SelectPhoneNumberDialog;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.report.DeleteReportConfirmationDialogFragment;
import com.whatsapp.report.ShareReportConfirmationDialogFragment;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.settings.MultiSelectionDialogFragment;
import com.whatsapp.settings.SettingsChatHistoryFragment;
import com.whatsapp.settings.SettingsJidNotificationFragment;
import com.whatsapp.settings.SettingsNetworkUsage;
import com.whatsapp.settings.chat.wallpaper.WallpaperDownloadFailedDialogFragment;
import com.whatsapp.settings.chat.wallpaper.WallpaperSetConfirmationDialogFragment;
import com.whatsapp.status.FirstStatusConfirmationDialogFragment;
import com.whatsapp.status.StatusConfirmMuteDialogFragment;
import com.whatsapp.status.StatusConfirmUnmuteDialogFragment;
import com.whatsapp.status.StatusDeleteDialogFragment;
import com.whatsapp.status.StatusesFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;
import com.whatsapp.stickers.AddThirdPartyStickerPackActivity;
import com.whatsapp.stickers.ConfirmPackDeleteDialogFragment;
import com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment;
import com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment;
import com.whatsapp.stickers.StarStickerFromPickerDialogFragment;
import com.whatsapp.stickers.StickerInfoDialogFragment;
import com.whatsapp.stickers.StickerStoreFeaturedTabFragment;
import com.whatsapp.stickers.StickerStoreMyTabFragment;
import com.whatsapp.stickers.StickerStoreTabFragment;
import com.whatsapp.stickers.picker.pages.ThirdPartyPackPage$StickerBlockedDialogFragment;
import com.whatsapp.storage.StorageUsageDeleteCompleteDialogFragment;
import com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment;
import com.whatsapp.storage.StorageUsageGallerySortBottomSheet;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;
import com.whatsapp.support.ReportSpamDialogFragment;
import com.whatsapp.twofactor.DoneFragment;
import com.whatsapp.twofactor.SetCodeFragment;
import com.whatsapp.twofactor.SetEmailFragment;
import com.whatsapp.twofactor.SettingsTwoFactorAuthActivity;
import com.whatsapp.usernotice.UserNoticeBottomSheetDialogFragment;
import com.whatsapp.util.DocumentWarningDialogFragment;
import com.whatsapp.voipcalling.CallSpamActivity;
import com.whatsapp.voipcalling.CallsFragment;
import com.whatsapp.voipcalling.JoinableEducationDialogFragment;
import com.whatsapp.voipcalling.MaximizedParticipantVideoDialogFragment;
import com.whatsapp.voipcalling.PermissionDialogFragment;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;
import com.whatsapp.voipcalling.VoipContactPickerDialogFragment;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;
import com.whatsapp.wabloks.base.BkDialogFragment;
import com.whatsapp.wabloks.base.BkFragment;
import com.whatsapp.wabloks.base.BkFragment2;
import com.whatsapp.wabloks.base.BkScreenFragment;
import com.whatsapp.wabloks.ui.BkActionBottomSheet;
import com.whatsapp.wabloks.ui.PrivacyNotice.PrivacyNoticeDialogFragment;
import com.whatsapp.wabloks.ui.PrivacyNotice.PrivacyNoticeFragment;
import com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment;
import com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment;
import com.whatsapp.wabloks.ui.shops.ShopsProductPreviewFragment;

/* renamed from: X.0dF  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09420dF extends C0CS {
    public volatile InterfaceC007103c A00;
    public final /* synthetic */ C0VV A01;

    public C09420dF(C0VV c0vv) {
        this.A01 = c0vv;
    }

    public static C09360d8 A00() {
        if (C09360d8.A01 == null) {
            synchronized (C09360d8.class) {
                C09360d8.A01 = new C09360d8(AnonymousClass012.A00());
            }
        }
        C09360d8 c09360d8 = C09360d8.A01;
        C02180Ae.A1B(c09360d8);
        return c09360d8;
    }

    public static C2K0 A01() {
        C2K0 A00 = C2K0.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    public static C53292cG A02() {
        if (C53292cG.A00 == null) {
            synchronized (C53292cG.class) {
                if (C53292cG.A00 == null) {
                    if (C53302cH.A00 == null) {
                        synchronized (C53302cH.class) {
                            if (C53302cH.A00 == null) {
                                C53302cH.A00 = new C53302cH(AnonymousClass012.A00(), C002801j.A00(), AnonymousClass011.A00(), C002301c.A00(), C0E7.A00(), C2OK.A00(), C50202Qp.A00(), C2Qq.A00(), new C50212Qr(C02E.A00()));
                            }
                        }
                    }
                    C53292cG.A00 = new C53292cG(C53302cH.A00);
                }
            }
        }
        C53292cG c53292cG = C53292cG.A00;
        C02180Ae.A1B(c53292cG);
        return c53292cG;
    }

    public static C2AL A03() {
        C2AL A00 = C2AL.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    @Override // X.C0CS
    public C40511sO A04() {
        return this.A01.A0r();
    }

    @Override // X.C0CS
    public void A05(CameraHomeFragment cameraHomeFragment) {
        ((WaFragment) cameraHomeFragment).A00 = A00();
        C41131tQ.A03();
        ((Hilt_CameraHomeFragment) cameraHomeFragment).A02 = C41121tP.A00();
    }

    @Override // X.C0CS
    public void A06(ContentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment contentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) contentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment).A01 = A00;
        ((WaDialogFragment) contentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A07(Conversation.CallConfirmationFragment callConfirmationFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) callConfirmationFragment).A01 = A00;
        ((WaDialogFragment) callConfirmationFragment).A00 = A00();
        callConfirmationFragment.A00 = C41141tR.A00();
        callConfirmationFragment.A01 = C41131tQ.A02();
    }

    @Override // X.C0CS
    public void A08(DisplayExceptionDialogFactory$ClockWrongDialogFragment displayExceptionDialogFactory$ClockWrongDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) displayExceptionDialogFactory$ClockWrongDialogFragment).A01 = A00;
        ((WaDialogFragment) displayExceptionDialogFactory$ClockWrongDialogFragment).A00 = A00();
        C005002g A002 = C005002g.A00();
        C02180Ae.A1B(A002);
        displayExceptionDialogFactory$ClockWrongDialogFragment.A00 = A002;
        displayExceptionDialogFactory$ClockWrongDialogFragment.A01 = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A09(DisplayExceptionDialogFactory$ContactBlockedDialogFragment displayExceptionDialogFactory$ContactBlockedDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) displayExceptionDialogFactory$ContactBlockedDialogFragment).A01 = A00;
        ((WaDialogFragment) displayExceptionDialogFactory$ContactBlockedDialogFragment).A00 = A00();
        displayExceptionDialogFactory$ContactBlockedDialogFragment.A00 = C41171tU.A09();
    }

    @Override // X.C0CS
    public void A0A(DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment displayExceptionDialogFactory$DoNotShareCodeDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) displayExceptionDialogFactory$DoNotShareCodeDialogFragment).A01 = A00;
        ((WaDialogFragment) displayExceptionDialogFactory$DoNotShareCodeDialogFragment).A00 = A00();
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        displayExceptionDialogFactory$DoNotShareCodeDialogFragment.A00 = A02;
        displayExceptionDialogFactory$DoNotShareCodeDialogFragment.A01 = C42141vB.A07();
    }

    @Override // X.C0CS
    public void A0B(DisplayExceptionDialogFactory$LoginFailedDialogFragment displayExceptionDialogFactory$LoginFailedDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) displayExceptionDialogFactory$LoginFailedDialogFragment).A01 = A00;
        ((WaDialogFragment) displayExceptionDialogFactory$LoginFailedDialogFragment).A00 = A00();
        displayExceptionDialogFactory$LoginFailedDialogFragment.A00 = C41131tQ.A01();
        displayExceptionDialogFactory$LoginFailedDialogFragment.A01 = C41131tQ.A02();
        displayExceptionDialogFactory$LoginFailedDialogFragment.A02 = C41871ue.A08();
    }

    @Override // X.C0CS
    public void A0C(DisplayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment displayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) displayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment).A01 = A00;
        ((WaDialogFragment) displayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment).A00 = A00();
        C09I A002 = C09I.A00();
        C02180Ae.A1B(A002);
        displayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment.A02 = A002;
        C005002g A003 = C005002g.A00();
        C02180Ae.A1B(A003);
        displayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment.A00 = A003;
        C04950Mp A004 = C04950Mp.A00();
        C02180Ae.A1B(A004);
        displayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment.A01 = A004;
    }

    @Override // X.C0CS
    public void A0D(DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment displayExceptionDialogFactory$SoftwareExpiredDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) displayExceptionDialogFactory$SoftwareExpiredDialogFragment).A01 = A00;
        ((WaDialogFragment) displayExceptionDialogFactory$SoftwareExpiredDialogFragment).A00 = A00();
        C09I A002 = C09I.A00();
        C02180Ae.A1B(A002);
        displayExceptionDialogFactory$SoftwareExpiredDialogFragment.A02 = A002;
        C005002g A003 = C005002g.A00();
        C02180Ae.A1B(A003);
        displayExceptionDialogFactory$SoftwareExpiredDialogFragment.A01 = A003;
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        displayExceptionDialogFactory$SoftwareExpiredDialogFragment.A00 = A02;
        displayExceptionDialogFactory$SoftwareExpiredDialogFragment.A03 = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A0E(DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment displayExceptionDialogFactory$UnsupportedDeviceDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) displayExceptionDialogFactory$UnsupportedDeviceDialogFragment).A01 = A00;
        ((WaDialogFragment) displayExceptionDialogFactory$UnsupportedDeviceDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A0F(DocumentPickerActivity.SendDocumentsConfirmationDialogFragment sendDocumentsConfirmationDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) sendDocumentsConfirmationDialogFragment).A01 = A00;
        ((WaDialogFragment) sendDocumentsConfirmationDialogFragment).A00 = A00();
        sendDocumentsConfirmationDialogFragment.A03 = C2M8.A00();
        sendDocumentsConfirmationDialogFragment.A00 = C41141tR.A00();
        sendDocumentsConfirmationDialogFragment.A02 = C42041uv.A01();
        C018708s A002 = C018708s.A00();
        C02180Ae.A1B(A002);
        sendDocumentsConfirmationDialogFragment.A01 = A002;
    }

    @Override // X.C0CS
    public void A0G(IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((RoundedBottomSheetDialogFragment) intentChooserBottomSheetDialogFragment).A00 = A00;
        intentChooserBottomSheetDialogFragment.A02 = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A0H(MessageDialogFragment messageDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) messageDialogFragment).A01 = A00;
        ((WaDialogFragment) messageDialogFragment).A00 = A00();
        messageDialogFragment.A02 = C2M8.A00();
        messageDialogFragment.A01 = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A0I(MuteDialogFragment muteDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) muteDialogFragment).A01 = A00;
        ((WaDialogFragment) muteDialogFragment).A00 = A00();
        muteDialogFragment.A05 = C41131tQ.A01();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        muteDialogFragment.A00 = A002;
        muteDialogFragment.A0A = C41131tQ.A04();
        C018608r A02 = C018608r.A02();
        C02180Ae.A1B(A02);
        muteDialogFragment.A02 = A02;
        C01B A003 = C01B.A00();
        C02180Ae.A1B(A003);
        muteDialogFragment.A01 = A003;
        muteDialogFragment.A04 = C41141tR.A00();
        muteDialogFragment.A07 = C41131tQ.A03();
        C0CB A004 = C0CB.A00();
        C02180Ae.A1B(A004);
        muteDialogFragment.A09 = A004;
        C03320Ff c03320Ff = C03320Ff.A00;
        C02180Ae.A1B(c03320Ff);
        muteDialogFragment.A03 = c03320Ff;
        muteDialogFragment.A06 = C41131tQ.A02();
        C03340Fh c03340Fh = C03340Fh.A00;
        C02180Ae.A1B(c03340Fh);
        muteDialogFragment.A08 = c03340Fh;
    }

    @Override // X.C0CS
    public void A0J(PushnameEmojiBlacklistDialogFragment pushnameEmojiBlacklistDialogFragment) {
        pushnameEmojiBlacklistDialogFragment.A01 = C2M8.A00();
        pushnameEmojiBlacklistDialogFragment.A02 = C42141vB.A07();
        pushnameEmojiBlacklistDialogFragment.A00 = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A0K(RevokeLinkConfirmationDialogFragment revokeLinkConfirmationDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) revokeLinkConfirmationDialogFragment).A01 = A00;
        ((WaDialogFragment) revokeLinkConfirmationDialogFragment).A00 = A00();
        revokeLinkConfirmationDialogFragment.A00 = C41141tR.A00();
        C018708s A002 = C018708s.A00();
        C02180Ae.A1B(A002);
        revokeLinkConfirmationDialogFragment.A01 = A002;
    }

    @Override // X.C0CS
    public void A0L(SimpleExternalStorageStateCallback$PermissionDeniedDialogFragment simpleExternalStorageStateCallback$PermissionDeniedDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) simpleExternalStorageStateCallback$PermissionDeniedDialogFragment).A01 = A00;
        ((WaDialogFragment) simpleExternalStorageStateCallback$PermissionDeniedDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A0M(SimpleExternalStorageStateCallback$SDCardUnavailableDialogFragment simpleExternalStorageStateCallback$SDCardUnavailableDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) simpleExternalStorageStateCallback$SDCardUnavailableDialogFragment).A01 = A00;
        ((WaDialogFragment) simpleExternalStorageStateCallback$SDCardUnavailableDialogFragment).A00 = A00();
        C000400f A002 = C000400f.A00();
        C02180Ae.A1B(A002);
        simpleExternalStorageStateCallback$SDCardUnavailableDialogFragment.A00 = A002;
    }

    @Override // X.C0CS
    public void A0N(SingleSelectionDialogFragment singleSelectionDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) singleSelectionDialogFragment).A01 = A00;
        ((WaDialogFragment) singleSelectionDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A0O(SuspiciousLinkWarningDialogFragment suspiciousLinkWarningDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) suspiciousLinkWarningDialogFragment).A01 = A00;
        ((WaDialogFragment) suspiciousLinkWarningDialogFragment).A00 = A00();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        suspiciousLinkWarningDialogFragment.A00 = A002;
        suspiciousLinkWarningDialogFragment.A04 = C42141vB.A07();
        suspiciousLinkWarningDialogFragment.A02 = C42041uv.A01();
        suspiciousLinkWarningDialogFragment.A03 = C41131tQ.A03();
        C03230Ew A003 = C03230Ew.A00();
        C02180Ae.A1B(A003);
        suspiciousLinkWarningDialogFragment.A01 = A003;
    }

    @Override // X.C0CS
    public void A0P(DeleteAccountFeedback.ChangeNumberMessageDialogFragment changeNumberMessageDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) changeNumberMessageDialogFragment).A01 = A00;
        ((WaDialogFragment) changeNumberMessageDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A0Q(FingerprintBottomSheet fingerprintBottomSheet) {
        fingerprintBottomSheet.A06 = C41131tQ.A01();
        fingerprintBottomSheet.A07 = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A0R(SetupDeviceAuthDialog setupDeviceAuthDialog) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) setupDeviceAuthDialog).A01 = A00;
        ((WaDialogFragment) setupDeviceAuthDialog).A00 = A00();
        C03170Ep A002 = C03170Ep.A00();
        C02180Ae.A1B(A002);
        setupDeviceAuthDialog.A00 = A002;
    }

    @Override // X.C0CS
    public void A0S(VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) verifyTwoFactorAuthCodeDialogFragment).A01 = A00;
        ((WaDialogFragment) verifyTwoFactorAuthCodeDialogFragment).A00 = A00();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        verifyTwoFactorAuthCodeDialogFragment.A04 = A002;
        verifyTwoFactorAuthCodeDialogFragment.A05 = C42041uv.A01();
        C41131tQ.A03();
        verifyTwoFactorAuthCodeDialogFragment.A06 = C41311ti.A06();
    }

    @Override // X.C0CS
    public void A0T(ChangePasswordDisableFragment changePasswordDisableFragment) {
        ((WaFragment) changePasswordDisableFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A0U(ChangePasswordDoneFragment changePasswordDoneFragment) {
        ((WaFragment) changePasswordDoneFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A0V(ConfirmChangePasswordFragment confirmChangePasswordFragment) {
        ((WaFragment) confirmChangePasswordFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A0W(ConfirmEnableFragment confirmEnableFragment) {
        ((WaFragment) confirmEnableFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A0X(ConfirmPasswordFragment confirmPasswordFragment) {
        ((WaFragment) confirmPasswordFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A0Y(CreatePasswordFragment createPasswordFragment) {
        ((WaFragment) createPasswordFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A0Z(EnableDoneFragment enableDoneFragment) {
        ((WaFragment) enableDoneFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A0a(EnableInfoFragment enableInfoFragment) {
        ((WaFragment) enableInfoFragment).A00 = A00();
        enableInfoFragment.A00 = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A0b(RestorePasswordInputFragment restorePasswordInputFragment) {
        ((WaFragment) restorePasswordInputFragment).A00 = A00();
        C41131tQ.A00();
        C41371to.A08();
        restorePasswordInputFragment.A00 = C41871ue.A08();
    }

    @Override // X.C0CS
    public void A0c(VerifyPasswordFragment verifyPasswordFragment) {
        ((WaFragment) verifyPasswordFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A0d(PromptDialogFragment promptDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) promptDialogFragment).A01 = A00;
        ((WaDialogFragment) promptDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A0e(SettingsGoogleDrive.AuthRequestDialogFragment authRequestDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) authRequestDialogFragment).A01 = A00;
        ((WaDialogFragment) authRequestDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A0f(SingleChoiceListDialogFragment singleChoiceListDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) singleChoiceListDialogFragment).A01 = A00;
        ((WaDialogFragment) singleChoiceListDialogFragment).A00 = A00();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        singleChoiceListDialogFragment.A00 = A002;
    }

    @Override // X.C0CS
    public void A0g(WaDialogFragment waDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        waDialogFragment.A01 = A00;
        waDialogFragment.A00 = A00();
    }

    @Override // X.C0CS
    public void A0h(CartFragment cartFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((RoundedBottomSheetDialogFragment) cartFragment).A00 = A00;
        cartFragment.A0a = C41131tQ.A01();
        cartFragment.A0n = C2MA.A01();
        cartFragment.A0i = C42111v7.A03();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        cartFragment.A0B = A002;
        AbstractC000600i A003 = AbstractC000600i.A00();
        C02180Ae.A1B(A003);
        cartFragment.A09 = A003;
        cartFragment.A0p = C41131tQ.A04();
        C012005w A004 = C012005w.A00();
        C02180Ae.A1B(A004);
        cartFragment.A0A = A004;
        cartFragment.A0e = C2M8.A00();
        C018608r A02 = C018608r.A02();
        C02180Ae.A1B(A02);
        cartFragment.A0D = A02;
        cartFragment.A0d = C2M9.A00();
        cartFragment.A0g = C41871ue.A03();
        C0E6 A005 = C0E6.A00();
        C02180Ae.A1B(A005);
        cartFragment.A0F = A005;
        cartFragment.A0M = C41171tU.A02();
        cartFragment.A0L = C41171tU.A01();
        C05Y A01 = C05Y.A01();
        C02180Ae.A1B(A01);
        cartFragment.A0l = A01;
        cartFragment.A0o = C41371to.A0C();
        cartFragment.A0Z = C42041uv.A01();
        C018708s A006 = C018708s.A00();
        C02180Ae.A1B(A006);
        cartFragment.A0Y = A006;
        cartFragment.A0c = C41131tQ.A03();
        cartFragment.A0V = C41171tU.A09();
        AnonymousClass008 anonymousClass008 = AnonymousClass008.A01;
        C02180Ae.A1B(anonymousClass008);
        cartFragment.A0W = anonymousClass008;
        cartFragment.A0R = C41171tU.A04();
        cartFragment.A0T = C41171tU.A07();
        cartFragment.A0h = C42141vB.A03();
        AnonymousClass075 A007 = AnonymousClass075.A00();
        C02180Ae.A1B(A007);
        cartFragment.A0X = A007;
        cartFragment.A0b = C41131tQ.A02();
        C06K A008 = C06K.A00();
        C02180Ae.A1B(A008);
        cartFragment.A0K = A008;
        cartFragment.A0Q = C41171tU.A03();
        C02O A009 = C02O.A00();
        C02180Ae.A1B(A009);
        cartFragment.A0m = A009;
    }

    @Override // X.C0CS
    public void A0i(QuantityPickerDialogFragment quantityPickerDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) quantityPickerDialogFragment).A01 = A00;
        ((WaDialogFragment) quantityPickerDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A0j(CatalogMediaViewFragment catalogMediaViewFragment) {
        ((WaFragment) catalogMediaViewFragment).A00 = A00();
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        catalogMediaViewFragment.A01 = A02;
        catalogMediaViewFragment.A03 = C41171tU.A04();
        C02F A00 = C02F.A00();
        C02180Ae.A1B(A00);
        catalogMediaViewFragment.A05 = A00;
        catalogMediaViewFragment.A02 = C41171tU.A03();
    }

    @Override // X.C0CS
    public void A0k(CatalogReportDialogFragment catalogReportDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) catalogReportDialogFragment).A01 = A00;
        ((WaDialogFragment) catalogReportDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A0l(CatalogReportReasonDialogFragment catalogReportReasonDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) catalogReportReasonDialogFragment).A01 = A00;
        ((WaDialogFragment) catalogReportReasonDialogFragment).A00 = A00();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        catalogReportReasonDialogFragment.A01 = A002;
    }

    @Override // X.C0CS
    public void A0m(OrderDetailFragment orderDetailFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((RoundedBottomSheetDialogFragment) orderDetailFragment).A00 = A00;
        orderDetailFragment.A0E = C41131tQ.A01();
        orderDetailFragment.A06 = C41131tQ.A00();
        orderDetailFragment.A0I = C41131tQ.A04();
        if (C49442Kl.A01 == null) {
            synchronized (C49442Kl.class) {
                if (C49442Kl.A01 == null) {
                    C49442Kl.A01 = new C49442Kl();
                }
            }
        }
        C49442Kl c49442Kl = C49442Kl.A01;
        C02180Ae.A1B(c49442Kl);
        orderDetailFragment.A0A = c49442Kl;
        C05Y A01 = C05Y.A01();
        C02180Ae.A1B(A01);
        orderDetailFragment.A0H = A01;
        orderDetailFragment.A0F = C41131tQ.A03();
        orderDetailFragment.A08 = C41171tU.A04();
        if (C53312ca.A02 == null) {
            synchronized (C53312ca.class) {
                if (C53312ca.A02 == null) {
                    C53312ca.A02 = new C53312ca(C002801j.A00());
                }
            }
        }
        C53312ca c53312ca = C53312ca.A02;
        C02180Ae.A1B(c53312ca);
        orderDetailFragment.A0B = c53312ca;
        orderDetailFragment.A07 = C41171tU.A03();
    }

    @Override // X.C0CS
    public void A0n(BlockConfirmationDialogFragment blockConfirmationDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) blockConfirmationDialogFragment).A01 = A00;
        ((WaDialogFragment) blockConfirmationDialogFragment).A00 = A00();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        blockConfirmationDialogFragment.A00 = A002;
        blockConfirmationDialogFragment.A09 = C41131tQ.A04();
        blockConfirmationDialogFragment.A08 = C41121tP.A01();
        C01B A003 = C01B.A00();
        C02180Ae.A1B(A003);
        blockConfirmationDialogFragment.A01 = A003;
        C018608r A02 = C018608r.A02();
        C02180Ae.A1B(A02);
        blockConfirmationDialogFragment.A02 = A02;
        blockConfirmationDialogFragment.A05 = C41141tR.A00();
        C018708s A004 = C018708s.A00();
        C02180Ae.A1B(A004);
        blockConfirmationDialogFragment.A06 = A004;
        blockConfirmationDialogFragment.A04 = C41171tU.A09();
        blockConfirmationDialogFragment.A07 = C2MC.A00();
    }

    @Override // X.C0CS
    public void A0o(UnblockDialogFragment unblockDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) unblockDialogFragment).A01 = A00;
        ((WaDialogFragment) unblockDialogFragment).A00 = A00();
        C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A0p(BloksDialogFragment bloksDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) bloksDialogFragment).A01 = A00;
        ((WaDialogFragment) bloksDialogFragment).A00 = A00();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        bloksDialogFragment.A03 = A002;
        bloksDialogFragment.A05 = C2MA.A01();
        bloksDialogFragment.A04 = C91594Fn.A01();
    }

    @Override // X.C0CS
    public void A0q(CameraMediaPickerFragment cameraMediaPickerFragment) {
        ((WaFragment) cameraMediaPickerFragment).A00 = A00();
        C011605s A00 = C011605s.A00();
        C02180Ae.A1B(A00);
        ((MediaGalleryFragmentBase) cameraMediaPickerFragment).A09 = A00;
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        ((MediaGalleryFragmentBase) cameraMediaPickerFragment).A07 = A002;
        C001200o c001200o = C001200o.A01;
        C02180Ae.A1B(c001200o);
        ((MediaGalleryFragmentBase) cameraMediaPickerFragment).A0B = c001200o;
        ((MediaGalleryFragmentBase) cameraMediaPickerFragment).A0K = C41131tQ.A04();
        ((MediaGalleryFragmentBase) cameraMediaPickerFragment).A0A = C42041uv.A01();
        ((MediaGalleryFragmentBase) cameraMediaPickerFragment).A0D = C41131tQ.A03();
        C02F A003 = C02F.A00();
        C02180Ae.A1B(A003);
        ((MediaGalleryFragmentBase) cameraMediaPickerFragment).A0C = A003;
        C018508q A004 = C018508q.A00();
        C02180Ae.A1B(A004);
        cameraMediaPickerFragment.A05 = A004;
        AbstractC000600i A005 = AbstractC000600i.A00();
        C02180Ae.A1B(A005);
        cameraMediaPickerFragment.A04 = A005;
        C02180Ae.A1B(c001200o);
        cameraMediaPickerFragment.A07 = c001200o;
        C01B A006 = C01B.A00();
        C02180Ae.A1B(A006);
        cameraMediaPickerFragment.A06 = A006;
        cameraMediaPickerFragment.A09 = C41131tQ.A03();
        cameraMediaPickerFragment.A0A = C49732Md.A03();
        C02F A007 = C02F.A00();
        C02180Ae.A1B(A007);
        cameraMediaPickerFragment.A08 = A007;
        C02C A008 = C02C.A00();
        C02180Ae.A1B(A008);
        cameraMediaPickerFragment.A0B = A008;
    }

    @Override // X.C0CS
    public void A0r(ChatInfoActivity.EncryptionExplanationDialogFragment encryptionExplanationDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) encryptionExplanationDialogFragment).A01 = A00;
        ((WaDialogFragment) encryptionExplanationDialogFragment).A00 = A00();
        encryptionExplanationDialogFragment.A02 = C2M8.A00();
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        encryptionExplanationDialogFragment.A00 = A02;
        encryptionExplanationDialogFragment.A01 = C41141tR.A00();
        encryptionExplanationDialogFragment.A04 = C42141vB.A07();
        C41131tQ.A03();
        C018808t A002 = C018808t.A00();
        C02180Ae.A1B(A002);
        encryptionExplanationDialogFragment.A03 = A002;
    }

    @Override // X.C0CS
    public void A0s(LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) linkedDevicesDetailDialogFragment).A01 = A00;
        ((WaDialogFragment) linkedDevicesDetailDialogFragment).A00 = A00();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        linkedDevicesDetailDialogFragment.A02 = A002;
        linkedDevicesDetailDialogFragment.A08 = C41931uk.A06();
        linkedDevicesDetailDialogFragment.A03 = C41131tQ.A03();
        linkedDevicesDetailDialogFragment.A06 = C41371to.A03();
        linkedDevicesDetailDialogFragment.A05 = C42061uy.A01();
    }

    @Override // X.C0CS
    public void A0t(LinkedDevicesLogoutAllConfirmationDialogFragment linkedDevicesLogoutAllConfirmationDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) linkedDevicesLogoutAllConfirmationDialogFragment).A01 = A00;
        ((WaDialogFragment) linkedDevicesLogoutAllConfirmationDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A0u(LinkedDevicesLogoutOneDeviceConfirmationDialogFragment linkedDevicesLogoutOneDeviceConfirmationDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) linkedDevicesLogoutOneDeviceConfirmationDialogFragment).A01 = A00;
        ((WaDialogFragment) linkedDevicesLogoutOneDeviceConfirmationDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A0v(WifiSpeedBumpDialogFragment wifiSpeedBumpDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) wifiSpeedBumpDialogFragment).A01 = A00;
        ((WaDialogFragment) wifiSpeedBumpDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A0w(FirstTimeExperienceDialogFragment firstTimeExperienceDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) firstTimeExperienceDialogFragment).A01 = A00;
        ((WaDialogFragment) firstTimeExperienceDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A0x(BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) baseSharedPreviewDialogFragment).A01 = A00;
        ((WaDialogFragment) baseSharedPreviewDialogFragment).A00 = A00();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        baseSharedPreviewDialogFragment.A07 = A002;
        C012005w A003 = C012005w.A00();
        C02180Ae.A1B(A003);
        baseSharedPreviewDialogFragment.A06 = A003;
        baseSharedPreviewDialogFragment.A08 = C41141tR.A00();
        baseSharedPreviewDialogFragment.A0F = C41371to.A0C();
        baseSharedPreviewDialogFragment.A0C = C42041uv.A01();
        C018708s A004 = C018708s.A00();
        C02180Ae.A1B(A004);
        baseSharedPreviewDialogFragment.A09 = A004;
        baseSharedPreviewDialogFragment.A0D = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A0y(ContactPickerFragment contactPickerFragment) {
        ((WaFragment) contactPickerFragment).A00 = A00();
        contactPickerFragment.A0z = C41121tP.A00();
        contactPickerFragment.A1B = C41371to.A0B();
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        contactPickerFragment.A0F = A00;
        contactPickerFragment.A0G = C41131tQ.A00();
        C03010Du A002 = C03010Du.A00();
        C02180Ae.A1B(A002);
        contactPickerFragment.A0J = A002;
        contactPickerFragment.A1G = C41131tQ.A04();
        C05M A003 = C05M.A00();
        C02180Ae.A1B(A003);
        contactPickerFragment.A0q = A003;
        contactPickerFragment.A11 = C41121tP.A01();
        contactPickerFragment.A0y = C2M8.A00();
        contactPickerFragment.A0H = C41871ue.A00();
        C01B A004 = C01B.A00();
        C02180Ae.A1B(A004);
        contactPickerFragment.A0K = A004;
        C0EB A005 = C0EB.A00();
        C02180Ae.A1B(A005);
        contactPickerFragment.A0w = A005;
        contactPickerFragment.A0L = C2MF.A00();
        C018608r A02 = C018608r.A02();
        C02180Ae.A1B(A02);
        contactPickerFragment.A0N = A02;
        contactPickerFragment.A1H = C41931uk.A03();
        C006602x A006 = C006602x.A00();
        C02180Ae.A1B(A006);
        contactPickerFragment.A1D = A006;
        C0L5 A01 = C0L5.A01();
        C02180Ae.A1B(A01);
        contactPickerFragment.A0Z = A01;
        C05Y A012 = C05Y.A01();
        C02180Ae.A1B(A012);
        contactPickerFragment.A15 = A012;
        contactPickerFragment.A18 = C2MC.A03();
        C018308n A022 = C018308n.A02();
        C02180Ae.A1B(A022);
        contactPickerFragment.A0D = A022;
        contactPickerFragment.A0S = C41141tR.A00();
        contactPickerFragment.A1A = C42141vB.A07();
        contactPickerFragment.A1F = C41371to.A0C();
        contactPickerFragment.A0m = C42041uv.A01();
        C018708s A007 = C018708s.A00();
        C02180Ae.A1B(A007);
        contactPickerFragment.A0X = A007;
        contactPickerFragment.A0p = C41131tQ.A03();
        C0WZ A008 = C0WZ.A00();
        C02180Ae.A1B(A008);
        contactPickerFragment.A0v = A008;
        contactPickerFragment.A0P = C41171tU.A09();
        AnonymousClass008 anonymousClass008 = AnonymousClass008.A01;
        C02180Ae.A1B(anonymousClass008);
        contactPickerFragment.A0U = anonymousClass008;
        contactPickerFragment.A0g = C41211tY.A01();
        AnonymousClass031 A009 = AnonymousClass031.A00();
        C02180Ae.A1B(A009);
        contactPickerFragment.A0E = A009;
        contactPickerFragment.A19 = C2MC.A06();
        C0CB A0010 = C0CB.A00();
        C02180Ae.A1B(A0010);
        contactPickerFragment.A17 = A0010;
        C0HA A0011 = C0HA.A00();
        C02180Ae.A1B(A0011);
        contactPickerFragment.A10 = A0011;
        C0L8 A0012 = C0L8.A00();
        C02180Ae.A1B(A0012);
        contactPickerFragment.A0O = A0012;
        C03320Ff c03320Ff = C03320Ff.A00;
        C02180Ae.A1B(c03320Ff);
        contactPickerFragment.A0R = c03320Ff;
        contactPickerFragment.A0h = C41311ti.A00();
        C05E A0013 = C05E.A00();
        C02180Ae.A1B(A0013);
        contactPickerFragment.A0u = A0013;
        contactPickerFragment.A0l = C41341tl.A00();
        AnonymousClass075 A0014 = AnonymousClass075.A00();
        C02180Ae.A1B(A0014);
        contactPickerFragment.A0W = A0014;
        C02F A0015 = C02F.A00();
        C02180Ae.A1B(A0015);
        contactPickerFragment.A0n = A0015;
        contactPickerFragment.A0o = C41131tQ.A02();
        C012205z c012205z = C012205z.A00;
        C02180Ae.A1B(c012205z);
        contactPickerFragment.A0j = c012205z;
        C0CA A0016 = C0CA.A00();
        C02180Ae.A1B(A0016);
        contactPickerFragment.A0r = A0016;
        C03730Gv A0017 = C03730Gv.A00();
        C02180Ae.A1B(A0017);
        contactPickerFragment.A0s = A0017;
        C02C A0018 = C02C.A00();
        C02180Ae.A1B(A0018);
        contactPickerFragment.A1E = A0018;
        C0C8 A0019 = C0C8.A00();
        C02180Ae.A1B(A0019);
        contactPickerFragment.A0t = A0019;
        C02O A0020 = C02O.A00();
        C02180Ae.A1B(A0020);
        contactPickerFragment.A16 = A0020;
        contactPickerFragment.A0V = C41141tR.A01();
        contactPickerFragment.A0k = C41211tY.A02();
        C03360Fk c03360Fk = C03360Fk.A00;
        C02180Ae.A1B(c03360Fk);
        contactPickerFragment.A13 = c03360Fk;
    }

    @Override // X.C0CS
    public void A0z(InviteToGroupCallConfirmationFragment inviteToGroupCallConfirmationFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) inviteToGroupCallConfirmationFragment).A01 = A00;
        ((WaDialogFragment) inviteToGroupCallConfirmationFragment).A00 = A00();
        C01B A002 = C01B.A00();
        C02180Ae.A1B(A002);
        inviteToGroupCallConfirmationFragment.A00 = A002;
        inviteToGroupCallConfirmationFragment.A01 = C41141tR.A00();
        C018708s A003 = C018708s.A00();
        C02180Ae.A1B(A003);
        inviteToGroupCallConfirmationFragment.A02 = A003;
    }

    @Override // X.C0CS
    public void A10(SharedFilePreviewDialogFragment sharedFilePreviewDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) sharedFilePreviewDialogFragment).A01 = A00;
        ((WaDialogFragment) sharedFilePreviewDialogFragment).A00 = A00();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        ((BaseSharedPreviewDialogFragment) sharedFilePreviewDialogFragment).A07 = A002;
        C012005w A003 = C012005w.A00();
        C02180Ae.A1B(A003);
        ((BaseSharedPreviewDialogFragment) sharedFilePreviewDialogFragment).A06 = A003;
        ((BaseSharedPreviewDialogFragment) sharedFilePreviewDialogFragment).A08 = C41141tR.A00();
        ((BaseSharedPreviewDialogFragment) sharedFilePreviewDialogFragment).A0F = C41371to.A0C();
        ((BaseSharedPreviewDialogFragment) sharedFilePreviewDialogFragment).A0C = C42041uv.A01();
        C018708s A004 = C018708s.A00();
        C02180Ae.A1B(A004);
        ((BaseSharedPreviewDialogFragment) sharedFilePreviewDialogFragment).A09 = A004;
        ((BaseSharedPreviewDialogFragment) sharedFilePreviewDialogFragment).A0D = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A11(SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) sharedTextPreviewDialogFragment).A01 = A00;
        ((WaDialogFragment) sharedTextPreviewDialogFragment).A00 = A00();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A07 = A002;
        C012005w A003 = C012005w.A00();
        C02180Ae.A1B(A003);
        ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A06 = A003;
        ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A08 = C41141tR.A00();
        ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A0F = C41371to.A0C();
        ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A0C = C42041uv.A01();
        C018708s A004 = C018708s.A00();
        C02180Ae.A1B(A004);
        ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A09 = A004;
        ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A0D = C41131tQ.A03();
        sharedTextPreviewDialogFragment.A0D = C41121tP.A00();
        sharedTextPreviewDialogFragment.A0E = C42111v7.A03();
        sharedTextPreviewDialogFragment.A0H = C2MA.A01();
        AbstractC000600i A005 = AbstractC000600i.A00();
        C02180Ae.A1B(A005);
        sharedTextPreviewDialogFragment.A03 = A005;
        sharedTextPreviewDialogFragment.A0I = C41131tQ.A04();
        sharedTextPreviewDialogFragment.A09 = C2M8.A00();
        C01B A006 = C01B.A00();
        C02180Ae.A1B(A006);
        sharedTextPreviewDialogFragment.A04 = A006;
        sharedTextPreviewDialogFragment.A08 = C2M9.A00();
        sharedTextPreviewDialogFragment.A0B = C41871ue.A03();
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        sharedTextPreviewDialogFragment.A02 = A02;
        sharedTextPreviewDialogFragment.A0C = C42141vB.A03();
        sharedTextPreviewDialogFragment.A07 = C41131tQ.A02();
        C02O A007 = C02O.A00();
        C02180Ae.A1B(A007);
        sharedTextPreviewDialogFragment.A0G = A007;
    }

    @Override // X.C0CS
    public void A12(CapturePictureOrVideoDialogFragment capturePictureOrVideoDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) capturePictureOrVideoDialogFragment).A01 = A00;
        ((WaDialogFragment) capturePictureOrVideoDialogFragment).A00 = A00();
        capturePictureOrVideoDialogFragment.A01 = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A13(ChangeNumberNotificationDialogFragment changeNumberNotificationDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) changeNumberNotificationDialogFragment).A01 = A00;
        ((WaDialogFragment) changeNumberNotificationDialogFragment).A00 = A00();
        changeNumberNotificationDialogFragment.A00 = C41141tR.A00();
        changeNumberNotificationDialogFragment.A02 = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A14(ChatMediaEphemeralVisibilityDialog chatMediaEphemeralVisibilityDialog) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) chatMediaEphemeralVisibilityDialog).A01 = A00;
        ((WaDialogFragment) chatMediaEphemeralVisibilityDialog).A00 = A00();
    }

    @Override // X.C0CS
    public void A15(ChatMediaVisibilityDialog chatMediaVisibilityDialog) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) chatMediaVisibilityDialog).A01 = A00;
        ((WaDialogFragment) chatMediaVisibilityDialog).A00 = A00();
        C0CB A002 = C0CB.A00();
        C02180Ae.A1B(A002);
        chatMediaVisibilityDialog.A03 = A002;
    }

    @Override // X.C0CS
    public void A16(BusinessTransitionInfoDialogFragment businessTransitionInfoDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) businessTransitionInfoDialogFragment).A01 = A00;
        ((WaDialogFragment) businessTransitionInfoDialogFragment).A00 = A00();
        businessTransitionInfoDialogFragment.A02 = C41121tP.A01();
        businessTransitionInfoDialogFragment.A01 = C2M8.A00();
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        businessTransitionInfoDialogFragment.A00 = A02;
        businessTransitionInfoDialogFragment.A03 = C42141vB.A07();
        C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A17(ConversationRow$ConversationRowDialogFragment conversationRow$ConversationRowDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) conversationRow$ConversationRowDialogFragment).A01 = A00;
        ((WaDialogFragment) conversationRow$ConversationRowDialogFragment).A00 = A00();
        conversationRow$ConversationRowDialogFragment.A00 = C41141tR.A00();
        C018708s A002 = C018708s.A00();
        C02180Ae.A1B(A002);
        conversationRow$ConversationRowDialogFragment.A01 = A002;
        C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A18(ConversationRowContact$MessageSharedContactDialogFragment conversationRowContact$MessageSharedContactDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) conversationRowContact$MessageSharedContactDialogFragment).A01 = A00;
        ((WaDialogFragment) conversationRowContact$MessageSharedContactDialogFragment).A00 = A00();
        C41131tQ.A03();
        conversationRowContact$MessageSharedContactDialogFragment.A00 = C41871ue.A02();
    }

    @Override // X.C0CS
    public void A19(DeviceChangeDialogFragment deviceChangeDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) deviceChangeDialogFragment).A01 = A00;
        ((WaDialogFragment) deviceChangeDialogFragment).A00 = A00();
        ((SecurityNotificationDialogFragment) deviceChangeDialogFragment).A01 = C41131tQ.A00();
        ((SecurityNotificationDialogFragment) deviceChangeDialogFragment).A05 = C2M8.A00();
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        ((SecurityNotificationDialogFragment) deviceChangeDialogFragment).A00 = A02;
        ((SecurityNotificationDialogFragment) deviceChangeDialogFragment).A02 = C41141tR.A00();
        ((SecurityNotificationDialogFragment) deviceChangeDialogFragment).A06 = C42141vB.A07();
        C018708s A002 = C018708s.A00();
        C02180Ae.A1B(A002);
        ((SecurityNotificationDialogFragment) deviceChangeDialogFragment).A03 = A002;
        ((SecurityNotificationDialogFragment) deviceChangeDialogFragment).A04 = C41131tQ.A03();
        C41131tQ.A02();
        deviceChangeDialogFragment.A01 = C41131tQ.A04();
        C02180Ae.A1B(C0EG.A00());
        C43071wo A003 = C43071wo.A00();
        C02180Ae.A1B(A003);
        deviceChangeDialogFragment.A00 = A003;
    }

    @Override // X.C0CS
    public void A1A(EncryptionChangeDialogFragment encryptionChangeDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) encryptionChangeDialogFragment).A01 = A00;
        ((WaDialogFragment) encryptionChangeDialogFragment).A00 = A00();
        encryptionChangeDialogFragment.A06 = C2M8.A00();
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        encryptionChangeDialogFragment.A00 = A02;
        C01B A002 = C01B.A00();
        C02180Ae.A1B(A002);
        encryptionChangeDialogFragment.A01 = A002;
        encryptionChangeDialogFragment.A02 = C41141tR.A00();
        encryptionChangeDialogFragment.A08 = C42141vB.A07();
        C018708s A003 = C018708s.A00();
        C02180Ae.A1B(A003);
        encryptionChangeDialogFragment.A04 = A003;
        encryptionChangeDialogFragment.A05 = C41131tQ.A03();
        C018808t A004 = C018808t.A00();
        C02180Ae.A1B(A004);
        encryptionChangeDialogFragment.A07 = A004;
        AnonymousClass075 A005 = AnonymousClass075.A00();
        C02180Ae.A1B(A005);
        encryptionChangeDialogFragment.A03 = A005;
    }

    @Override // X.C0CS
    public void A1B(IdentityChangeDialogFragment identityChangeDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) identityChangeDialogFragment).A01 = A00;
        ((WaDialogFragment) identityChangeDialogFragment).A00 = A00();
        ((SecurityNotificationDialogFragment) identityChangeDialogFragment).A01 = C41131tQ.A00();
        ((SecurityNotificationDialogFragment) identityChangeDialogFragment).A05 = C2M8.A00();
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        ((SecurityNotificationDialogFragment) identityChangeDialogFragment).A00 = A02;
        ((SecurityNotificationDialogFragment) identityChangeDialogFragment).A02 = C41141tR.A00();
        ((SecurityNotificationDialogFragment) identityChangeDialogFragment).A06 = C42141vB.A07();
        C018708s A002 = C018708s.A00();
        C02180Ae.A1B(A002);
        ((SecurityNotificationDialogFragment) identityChangeDialogFragment).A03 = A002;
        ((SecurityNotificationDialogFragment) identityChangeDialogFragment).A04 = C41131tQ.A03();
        C41131tQ.A02();
        identityChangeDialogFragment.A02 = C41131tQ.A04();
        C0EE A003 = C0EE.A00();
        C02180Ae.A1B(A003);
        identityChangeDialogFragment.A01 = A003;
        C0EC A004 = C0EC.A00();
        C02180Ae.A1B(A004);
        identityChangeDialogFragment.A00 = A004;
    }

    @Override // X.C0CS
    public void A1C(VerifiedBusinessInfoDialogFragment verifiedBusinessInfoDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) verifiedBusinessInfoDialogFragment).A01 = A00;
        ((WaDialogFragment) verifiedBusinessInfoDialogFragment).A00 = A00();
        verifiedBusinessInfoDialogFragment.A02 = C41121tP.A01();
        verifiedBusinessInfoDialogFragment.A01 = C2M8.A00();
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        verifiedBusinessInfoDialogFragment.A00 = A02;
        verifiedBusinessInfoDialogFragment.A03 = C42141vB.A07();
        C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A1D(StarredMessagesActivity.UnstarAllDialogFragment unstarAllDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) unstarAllDialogFragment).A01 = A00;
        ((WaDialogFragment) unstarAllDialogFragment).A00 = A00();
        C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A1E(SelectListBottomSheet selectListBottomSheet) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((RoundedBottomSheetDialogFragment) selectListBottomSheet).A00 = A00;
    }

    @Override // X.C0CS
    public void A1F(ArchivedConversationsFragment archivedConversationsFragment) {
        ((WaListFragment) archivedConversationsFragment).A00 = A00();
        archivedConversationsFragment.A0v = C41131tQ.A01();
        archivedConversationsFragment.A1H = C41121tP.A00();
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        ((ConversationsFragment) archivedConversationsFragment).A0I = A00;
        archivedConversationsFragment.A1n = C2MA.A01();
        C02980Dr A002 = C02980Dr.A00();
        C02180Ae.A1B(A002);
        archivedConversationsFragment.A1Q = A002;
        ((ConversationsFragment) archivedConversationsFragment).A0J = C41131tQ.A00();
        C001200o c001200o = C001200o.A01;
        C02180Ae.A1B(c001200o);
        archivedConversationsFragment.A0w = c001200o;
        archivedConversationsFragment.A1o = C41131tQ.A04();
        C05M A003 = C05M.A00();
        C02180Ae.A1B(A003);
        archivedConversationsFragment.A11 = A003;
        archivedConversationsFragment.A1g = C2MC.A07();
        archivedConversationsFragment.A1K = C41121tP.A01();
        archivedConversationsFragment.A1p = C41931uk.A06();
        archivedConversationsFragment.A10 = C41171tU.A0A();
        archivedConversationsFragment.A1G = C2M8.A00();
        C01B A004 = C01B.A00();
        C02180Ae.A1B(A004);
        ((ConversationsFragment) archivedConversationsFragment).A0K = A004;
        ((ConversationsFragment) archivedConversationsFragment).A0X = C2MF.A01();
        ((ConversationsFragment) archivedConversationsFragment).A0M = C2MF.A00();
        C018608r A02 = C018608r.A02();
        C02180Ae.A1B(A02);
        ((ConversationsFragment) archivedConversationsFragment).A0N = A02;
        archivedConversationsFragment.A1d = C2MC.A04();
        C018308n A022 = C018308n.A02();
        C02180Ae.A1B(A022);
        ((ConversationsFragment) archivedConversationsFragment).A0E = A022;
        C0L5 A01 = C0L5.A01();
        C02180Ae.A1B(A01);
        ((ConversationsFragment) archivedConversationsFragment).A0e = A01;
        C0GU A005 = C0GU.A00();
        C02180Ae.A1B(A005);
        archivedConversationsFragment.A19 = A005;
        C05Y A012 = C05Y.A01();
        C02180Ae.A1B(A012);
        archivedConversationsFragment.A1R = A012;
        C03750Gx A023 = C03750Gx.A02();
        C02180Ae.A1B(A023);
        archivedConversationsFragment.A1Y = A023;
        archivedConversationsFragment.A1c = C2MC.A03();
        C0L7 A024 = C0L7.A02();
        C02180Ae.A1B(A024);
        ((ConversationsFragment) archivedConversationsFragment).A0Y = A024;
        ((ConversationsFragment) archivedConversationsFragment).A0Z = C41141tR.A00();
        ((ConversationsFragment) archivedConversationsFragment).A0F = C41211tY.A00();
        C0GK A006 = C0GK.A00();
        C02180Ae.A1B(A006);
        archivedConversationsFragment.A15 = A006;
        archivedConversationsFragment.A0t = C42041uv.A01();
        C018708s A007 = C018708s.A00();
        C02180Ae.A1B(A007);
        ((ConversationsFragment) archivedConversationsFragment).A0b = A007;
        archivedConversationsFragment.A1T = C41311ti.A03();
        archivedConversationsFragment.A0z = C41131tQ.A03();
        archivedConversationsFragment.A1Z = C40731sm.A0F();
        C0D5 A008 = C0D5.A00();
        C02180Ae.A1B(A008);
        archivedConversationsFragment.A16 = A008;
        C0H9 A009 = C0H9.A00();
        C02180Ae.A1B(A009);
        archivedConversationsFragment.A1l = A009;
        ((ConversationsFragment) archivedConversationsFragment).A0V = C41171tU.A09();
        C03300Fd A0010 = C03300Fd.A00();
        C02180Ae.A1B(A0010);
        archivedConversationsFragment.A1I = A0010;
        AnonymousClass008 anonymousClass008 = AnonymousClass008.A01;
        C02180Ae.A1B(anonymousClass008);
        ((ConversationsFragment) archivedConversationsFragment).A0a = anonymousClass008;
        C0ES A0011 = C0ES.A00();
        C02180Ae.A1B(A0011);
        archivedConversationsFragment.A1L = A0011;
        C03180Eq A0012 = C03180Eq.A00();
        C02180Ae.A1B(A0012);
        archivedConversationsFragment.A1B = A0012;
        archivedConversationsFragment.A1f = C2MC.A06();
        C0CB A0013 = C0CB.A00();
        C02180Ae.A1B(A0013);
        archivedConversationsFragment.A1b = A0013;
        C0HA A0014 = C0HA.A00();
        C02180Ae.A1B(A0014);
        archivedConversationsFragment.A1J = A0014;
        C0H4 A0015 = C0H4.A00();
        C02180Ae.A1B(A0015);
        archivedConversationsFragment.A1A = A0015;
        C0EE A0016 = C0EE.A00();
        C02180Ae.A1B(A0016);
        archivedConversationsFragment.A1S = A0016;
        C0DU A013 = C0DU.A01();
        C02180Ae.A1B(A013);
        archivedConversationsFragment.A1V = A013;
        archivedConversationsFragment.A0u = C42041uv.A02();
        archivedConversationsFragment.A1i = C41931uk.A02();
        C0L8 A0017 = C0L8.A00();
        C02180Ae.A1B(A0017);
        ((ConversationsFragment) archivedConversationsFragment).A0O = A0017;
        archivedConversationsFragment.A1k = C41171tU.A0B();
        C03320Ff c03320Ff = C03320Ff.A00;
        C02180Ae.A1B(c03320Ff);
        ((ConversationsFragment) archivedConversationsFragment).A0W = c03320Ff;
        C011505r A0018 = C011505r.A00();
        C02180Ae.A1B(A0018);
        ((ConversationsFragment) archivedConversationsFragment).A0c = A0018;
        ((ConversationsFragment) archivedConversationsFragment).A0h = C02950Dn.A00(this.A01.A01.A01);
        ((ConversationsFragment) archivedConversationsFragment).A0f = C41311ti.A00();
        C00B A0019 = C00B.A00();
        C02180Ae.A1B(A0019);
        archivedConversationsFragment.A1E = A0019;
        archivedConversationsFragment.A1U = C41371to.A09();
        C05E A0020 = C05E.A00();
        C02180Ae.A1B(A0020);
        archivedConversationsFragment.A1C = A0020;
        archivedConversationsFragment.A0s = C41341tl.A00();
        archivedConversationsFragment.A1D = C2MC.A01();
        C02F A0021 = C02F.A00();
        C02180Ae.A1B(A0021);
        archivedConversationsFragment.A0x = A0021;
        archivedConversationsFragment.A0y = C41131tQ.A02();
        C06L A0022 = C06L.A00();
        C02180Ae.A1B(A0022);
        ((ConversationsFragment) archivedConversationsFragment).A0U = A0022;
        C0CA A0023 = C0CA.A00();
        C02180Ae.A1B(A0023);
        archivedConversationsFragment.A14 = A0023;
        archivedConversationsFragment.A1e = C2MC.A05();
        C03340Fh c03340Fh = C03340Fh.A00;
        C02180Ae.A1B(c03340Fh);
        archivedConversationsFragment.A13 = c03340Fh;
        C44271yn A0024 = C44271yn.A00();
        C02180Ae.A1B(A0024);
        archivedConversationsFragment.A18 = A0024;
        C03740Gw A0025 = C03740Gw.A00();
        C02180Ae.A1B(A0025);
        archivedConversationsFragment.A1W = A0025;
        C0DW A0026 = C0DW.A00();
        C02180Ae.A1B(A0026);
        archivedConversationsFragment.A1X = A0026;
        C02180Ae.A1B(AnonymousClass057.A00);
        C06K A0027 = C06K.A00();
        C02180Ae.A1B(A0027);
        ((ConversationsFragment) archivedConversationsFragment).A0S = A0027;
        archivedConversationsFragment.A1F = C42061uy.A01();
        ((ConversationsFragment) archivedConversationsFragment).A0g = C41211tY.A03();
        archivedConversationsFragment.A1a = C41871ue.A06();
        archivedConversationsFragment.A1h = C41931uk.A00();
        C06M c06m = C06M.A00;
        C02180Ae.A1B(c06m);
        ((ConversationsFragment) archivedConversationsFragment).A0T = c06m;
        archivedConversationsFragment.A1m = C41211tY.A05();
        C0C8 A0028 = C0C8.A00();
        C02180Ae.A1B(A0028);
        archivedConversationsFragment.A17 = A0028;
        C0LM A0029 = C0LM.A00();
        C02180Ae.A1B(A0029);
        ((ConversationsFragment) archivedConversationsFragment).A0L = A0029;
        C0DK A0030 = C0DK.A00();
        C02180Ae.A1B(A0030);
        archivedConversationsFragment.A12 = A0030;
        C03360Fk c03360Fk = C03360Fk.A00;
        C02180Ae.A1B(c03360Fk);
        archivedConversationsFragment.A1M = c03360Fk;
        ((ConversationsFragment) archivedConversationsFragment).A0P = C42111v7.A00();
        ((ConversationsFragment) archivedConversationsFragment).A0R = C42111v7.A01();
        archivedConversationsFragment.A1N = C42111v7.A06();
        C01B A0031 = C01B.A00();
        C02180Ae.A1B(A0031);
        archivedConversationsFragment.A02 = A0031;
        C0CA A0032 = C0CA.A00();
        C02180Ae.A1B(A0032);
        archivedConversationsFragment.A03 = A0032;
    }

    @Override // X.C0CS
    public void A1G(ConversationsFragment.BulkDeleteConversationDialogFragment bulkDeleteConversationDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) bulkDeleteConversationDialogFragment).A01 = A00;
        ((WaDialogFragment) bulkDeleteConversationDialogFragment).A00 = A00();
        bulkDeleteConversationDialogFragment.A06 = C41131tQ.A04();
        C2M8.A00();
        C018608r A02 = C018608r.A02();
        C02180Ae.A1B(A02);
        bulkDeleteConversationDialogFragment.A00 = A02;
        bulkDeleteConversationDialogFragment.A01 = C41141tR.A00();
        bulkDeleteConversationDialogFragment.A03 = C41131tQ.A03();
        bulkDeleteConversationDialogFragment.A02 = C41131tQ.A02();
        C03340Fh c03340Fh = C03340Fh.A00;
        C02180Ae.A1B(c03340Fh);
        bulkDeleteConversationDialogFragment.A04 = c03340Fh;
        bulkDeleteConversationDialogFragment.A05 = C41211tY.A05();
    }

    @Override // X.C0CS
    public void A1H(ConversationsFragment.DeleteBroadcastListDialogFragment deleteBroadcastListDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) deleteBroadcastListDialogFragment).A01 = A00;
        ((WaDialogFragment) deleteBroadcastListDialogFragment).A00 = A00();
        deleteBroadcastListDialogFragment.A06 = C41131tQ.A04();
        C2M8.A00();
        C018608r A02 = C018608r.A02();
        C02180Ae.A1B(A02);
        deleteBroadcastListDialogFragment.A00 = A02;
        deleteBroadcastListDialogFragment.A01 = C41141tR.A00();
        C018708s A002 = C018708s.A00();
        C02180Ae.A1B(A002);
        deleteBroadcastListDialogFragment.A02 = A002;
        C41131tQ.A03();
        deleteBroadcastListDialogFragment.A03 = C41131tQ.A02();
        C03340Fh c03340Fh = C03340Fh.A00;
        C02180Ae.A1B(c03340Fh);
        deleteBroadcastListDialogFragment.A04 = c03340Fh;
        deleteBroadcastListDialogFragment.A05 = C41211tY.A05();
    }

    @Override // X.C0CS
    public void A1I(ConversationsFragment.DeleteContactDialogFragment deleteContactDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) deleteContactDialogFragment).A01 = A00;
        ((WaDialogFragment) deleteContactDialogFragment).A00 = A00();
        deleteContactDialogFragment.A07 = C41131tQ.A04();
        C2M8.A00();
        C018608r A02 = C018608r.A02();
        C02180Ae.A1B(A02);
        deleteContactDialogFragment.A00 = A02;
        deleteContactDialogFragment.A01 = C41141tR.A00();
        C018708s A002 = C018708s.A00();
        C02180Ae.A1B(A002);
        deleteContactDialogFragment.A02 = A002;
        deleteContactDialogFragment.A04 = C41131tQ.A03();
        deleteContactDialogFragment.A03 = C41131tQ.A02();
        C03340Fh c03340Fh = C03340Fh.A00;
        C02180Ae.A1B(c03340Fh);
        deleteContactDialogFragment.A05 = c03340Fh;
        deleteContactDialogFragment.A06 = C41211tY.A05();
    }

    @Override // X.C0CS
    public void A1J(ConversationsFragment.DeleteGroupDialogFragment deleteGroupDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) deleteGroupDialogFragment).A01 = A00;
        ((WaDialogFragment) deleteGroupDialogFragment).A00 = A00();
        deleteGroupDialogFragment.A07 = C41131tQ.A04();
        C2M8.A00();
        C018608r A02 = C018608r.A02();
        C02180Ae.A1B(A02);
        deleteGroupDialogFragment.A00 = A02;
        deleteGroupDialogFragment.A01 = C41141tR.A00();
        C018708s A002 = C018708s.A00();
        C02180Ae.A1B(A002);
        deleteGroupDialogFragment.A02 = A002;
        C41131tQ.A03();
        C03180Eq A003 = C03180Eq.A00();
        C02180Ae.A1B(A003);
        deleteGroupDialogFragment.A05 = A003;
        deleteGroupDialogFragment.A03 = C41131tQ.A02();
        C03340Fh c03340Fh = C03340Fh.A00;
        C02180Ae.A1B(c03340Fh);
        deleteGroupDialogFragment.A04 = c03340Fh;
        deleteGroupDialogFragment.A06 = C41211tY.A05();
    }

    @Override // X.C0CS
    public void A1K(ConversationsFragment conversationsFragment) {
        ((WaListFragment) conversationsFragment).A00 = A00();
        conversationsFragment.A0v = C41131tQ.A01();
        conversationsFragment.A1H = C41121tP.A00();
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        conversationsFragment.A0I = A00;
        conversationsFragment.A1n = C2MA.A01();
        C02980Dr A002 = C02980Dr.A00();
        C02180Ae.A1B(A002);
        conversationsFragment.A1Q = A002;
        conversationsFragment.A0J = C41131tQ.A00();
        C001200o c001200o = C001200o.A01;
        C02180Ae.A1B(c001200o);
        conversationsFragment.A0w = c001200o;
        conversationsFragment.A1o = C41131tQ.A04();
        C05M A003 = C05M.A00();
        C02180Ae.A1B(A003);
        conversationsFragment.A11 = A003;
        conversationsFragment.A1g = C2MC.A07();
        conversationsFragment.A1K = C41121tP.A01();
        conversationsFragment.A1p = C41931uk.A06();
        conversationsFragment.A10 = C41171tU.A0A();
        conversationsFragment.A1G = C2M8.A00();
        C01B A004 = C01B.A00();
        C02180Ae.A1B(A004);
        conversationsFragment.A0K = A004;
        conversationsFragment.A0X = C2MF.A01();
        conversationsFragment.A0M = C2MF.A00();
        C018608r A02 = C018608r.A02();
        C02180Ae.A1B(A02);
        conversationsFragment.A0N = A02;
        conversationsFragment.A1d = C2MC.A04();
        C018308n A022 = C018308n.A02();
        C02180Ae.A1B(A022);
        conversationsFragment.A0E = A022;
        C0L5 A01 = C0L5.A01();
        C02180Ae.A1B(A01);
        conversationsFragment.A0e = A01;
        C0GU A005 = C0GU.A00();
        C02180Ae.A1B(A005);
        conversationsFragment.A19 = A005;
        C05Y A012 = C05Y.A01();
        C02180Ae.A1B(A012);
        conversationsFragment.A1R = A012;
        C03750Gx A023 = C03750Gx.A02();
        C02180Ae.A1B(A023);
        conversationsFragment.A1Y = A023;
        conversationsFragment.A1c = C2MC.A03();
        C0L7 A024 = C0L7.A02();
        C02180Ae.A1B(A024);
        conversationsFragment.A0Y = A024;
        conversationsFragment.A0Z = C41141tR.A00();
        conversationsFragment.A0F = C41211tY.A00();
        C0GK A006 = C0GK.A00();
        C02180Ae.A1B(A006);
        conversationsFragment.A15 = A006;
        conversationsFragment.A0t = C42041uv.A01();
        C018708s A007 = C018708s.A00();
        C02180Ae.A1B(A007);
        conversationsFragment.A0b = A007;
        conversationsFragment.A1T = C41311ti.A03();
        conversationsFragment.A0z = C41131tQ.A03();
        conversationsFragment.A1Z = C40731sm.A0F();
        C0D5 A008 = C0D5.A00();
        C02180Ae.A1B(A008);
        conversationsFragment.A16 = A008;
        C0H9 A009 = C0H9.A00();
        C02180Ae.A1B(A009);
        conversationsFragment.A1l = A009;
        conversationsFragment.A0V = C41171tU.A09();
        C03300Fd A0010 = C03300Fd.A00();
        C02180Ae.A1B(A0010);
        conversationsFragment.A1I = A0010;
        AnonymousClass008 anonymousClass008 = AnonymousClass008.A01;
        C02180Ae.A1B(anonymousClass008);
        conversationsFragment.A0a = anonymousClass008;
        C0ES A0011 = C0ES.A00();
        C02180Ae.A1B(A0011);
        conversationsFragment.A1L = A0011;
        C03180Eq A0012 = C03180Eq.A00();
        C02180Ae.A1B(A0012);
        conversationsFragment.A1B = A0012;
        conversationsFragment.A1f = C2MC.A06();
        C0CB A0013 = C0CB.A00();
        C02180Ae.A1B(A0013);
        conversationsFragment.A1b = A0013;
        C0HA A0014 = C0HA.A00();
        C02180Ae.A1B(A0014);
        conversationsFragment.A1J = A0014;
        C0H4 A0015 = C0H4.A00();
        C02180Ae.A1B(A0015);
        conversationsFragment.A1A = A0015;
        C0EE A0016 = C0EE.A00();
        C02180Ae.A1B(A0016);
        conversationsFragment.A1S = A0016;
        C0DU A013 = C0DU.A01();
        C02180Ae.A1B(A013);
        conversationsFragment.A1V = A013;
        conversationsFragment.A0u = C42041uv.A02();
        conversationsFragment.A1i = C41931uk.A02();
        C0L8 A0017 = C0L8.A00();
        C02180Ae.A1B(A0017);
        conversationsFragment.A0O = A0017;
        conversationsFragment.A1k = C41171tU.A0B();
        C03320Ff c03320Ff = C03320Ff.A00;
        C02180Ae.A1B(c03320Ff);
        conversationsFragment.A0W = c03320Ff;
        C011505r A0018 = C011505r.A00();
        C02180Ae.A1B(A0018);
        conversationsFragment.A0c = A0018;
        conversationsFragment.A0h = C02950Dn.A00(this.A01.A01.A01);
        conversationsFragment.A0f = C41311ti.A00();
        C00B A0019 = C00B.A00();
        C02180Ae.A1B(A0019);
        conversationsFragment.A1E = A0019;
        conversationsFragment.A1U = C41371to.A09();
        C05E A0020 = C05E.A00();
        C02180Ae.A1B(A0020);
        conversationsFragment.A1C = A0020;
        conversationsFragment.A0s = C41341tl.A00();
        conversationsFragment.A1D = C2MC.A01();
        C02F A0021 = C02F.A00();
        C02180Ae.A1B(A0021);
        conversationsFragment.A0x = A0021;
        conversationsFragment.A0y = C41131tQ.A02();
        C06L A0022 = C06L.A00();
        C02180Ae.A1B(A0022);
        conversationsFragment.A0U = A0022;
        C0CA A0023 = C0CA.A00();
        C02180Ae.A1B(A0023);
        conversationsFragment.A14 = A0023;
        conversationsFragment.A1e = C2MC.A05();
        C03340Fh c03340Fh = C03340Fh.A00;
        C02180Ae.A1B(c03340Fh);
        conversationsFragment.A13 = c03340Fh;
        C44271yn A0024 = C44271yn.A00();
        C02180Ae.A1B(A0024);
        conversationsFragment.A18 = A0024;
        C03740Gw A0025 = C03740Gw.A00();
        C02180Ae.A1B(A0025);
        conversationsFragment.A1W = A0025;
        C0DW A0026 = C0DW.A00();
        C02180Ae.A1B(A0026);
        conversationsFragment.A1X = A0026;
        C02180Ae.A1B(AnonymousClass057.A00);
        C06K A0027 = C06K.A00();
        C02180Ae.A1B(A0027);
        conversationsFragment.A0S = A0027;
        conversationsFragment.A1F = C42061uy.A01();
        conversationsFragment.A0g = C41211tY.A03();
        conversationsFragment.A1a = C41871ue.A06();
        conversationsFragment.A1h = C41931uk.A00();
        C06M c06m = C06M.A00;
        C02180Ae.A1B(c06m);
        conversationsFragment.A0T = c06m;
        conversationsFragment.A1m = C41211tY.A05();
        C0C8 A0028 = C0C8.A00();
        C02180Ae.A1B(A0028);
        conversationsFragment.A17 = A0028;
        C0LM A0029 = C0LM.A00();
        C02180Ae.A1B(A0029);
        conversationsFragment.A0L = A0029;
        C0DK A0030 = C0DK.A00();
        C02180Ae.A1B(A0030);
        conversationsFragment.A12 = A0030;
        C03360Fk c03360Fk = C03360Fk.A00;
        C02180Ae.A1B(c03360Fk);
        conversationsFragment.A1M = c03360Fk;
        conversationsFragment.A0P = C42111v7.A00();
        conversationsFragment.A0R = C42111v7.A01();
        conversationsFragment.A1N = C42111v7.A06();
    }

    @Override // X.C0CS
    public void A1L(LeaveGroupsDialogFragment leaveGroupsDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) leaveGroupsDialogFragment).A01 = A00;
        ((WaDialogFragment) leaveGroupsDialogFragment).A00 = A00();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        leaveGroupsDialogFragment.A00 = A002;
        leaveGroupsDialogFragment.A0E = C41131tQ.A04();
        C05M A003 = C05M.A00();
        C02180Ae.A1B(A003);
        leaveGroupsDialogFragment.A08 = A003;
        leaveGroupsDialogFragment.A0F = C41931uk.A06();
        leaveGroupsDialogFragment.A07 = C41171tU.A0A();
        leaveGroupsDialogFragment.A0A = C2M8.A00();
        C01B A004 = C01B.A00();
        C02180Ae.A1B(A004);
        leaveGroupsDialogFragment.A01 = A004;
        C0EG A005 = C0EG.A00();
        C02180Ae.A1B(A005);
        leaveGroupsDialogFragment.A0C = A005;
        leaveGroupsDialogFragment.A02 = C41141tR.A00();
        C018708s A006 = C018708s.A00();
        C02180Ae.A1B(A006);
        leaveGroupsDialogFragment.A03 = A006;
        C0ES A007 = C0ES.A00();
        C02180Ae.A1B(A007);
        leaveGroupsDialogFragment.A0B = A007;
        C0CB A008 = C0CB.A00();
        C02180Ae.A1B(A008);
        leaveGroupsDialogFragment.A0D = A008;
        leaveGroupsDialogFragment.A04 = C2MC.A00();
        leaveGroupsDialogFragment.A05 = C41341tl.A00();
        leaveGroupsDialogFragment.A06 = C41131tQ.A02();
        C03340Fh c03340Fh = C03340Fh.A00;
        C02180Ae.A1B(c03340Fh);
        leaveGroupsDialogFragment.A09 = c03340Fh;
    }

    @Override // X.C0CS
    public void A1M(AudioVideoBottomSheetDialogFragment audioVideoBottomSheetDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((RoundedBottomSheetDialogFragment) audioVideoBottomSheetDialogFragment).A00 = A00;
    }

    @Override // X.C0CS
    public void A1N(CreateOrAddToContactsDialog createOrAddToContactsDialog) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) createOrAddToContactsDialog).A01 = A00;
        ((WaDialogFragment) createOrAddToContactsDialog).A00 = A00();
    }

    @Override // X.C0CS
    public void A1O(FAQLearnMoreDialogFragment fAQLearnMoreDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) fAQLearnMoreDialogFragment).A01 = A00;
        ((WaDialogFragment) fAQLearnMoreDialogFragment).A00 = A00();
        fAQLearnMoreDialogFragment.A02 = C2M8.A00();
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        fAQLearnMoreDialogFragment.A00 = A02;
        fAQLearnMoreDialogFragment.A03 = C42141vB.A07();
        fAQLearnMoreDialogFragment.A01 = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A1P(HFMLearnMoreDialogFragment hFMLearnMoreDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) hFMLearnMoreDialogFragment).A01 = A00;
        ((WaDialogFragment) hFMLearnMoreDialogFragment).A00 = A00();
        ((FAQLearnMoreDialogFragment) hFMLearnMoreDialogFragment).A02 = C2M8.A00();
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        ((FAQLearnMoreDialogFragment) hFMLearnMoreDialogFragment).A00 = A02;
        ((FAQLearnMoreDialogFragment) hFMLearnMoreDialogFragment).A03 = C42141vB.A07();
        ((FAQLearnMoreDialogFragment) hFMLearnMoreDialogFragment).A01 = C41131tQ.A03();
        C01B A002 = C01B.A00();
        C02180Ae.A1B(A002);
        hFMLearnMoreDialogFragment.A01 = A002;
    }

    @Override // X.C0CS
    public void A1Q(ProgressDialogFragment progressDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) progressDialogFragment).A01 = A00;
        ((WaDialogFragment) progressDialogFragment).A00 = A00();
        progressDialogFragment.A01 = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A1R(RoomsNUXBottomSheetDialogFragment roomsNUXBottomSheetDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((RoundedBottomSheetDialogFragment) roomsNUXBottomSheetDialogFragment).A00 = A00;
        C41121tP.A01();
        roomsNUXBottomSheetDialogFragment.A00 = C41871ue.A00();
        C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A1S(RoomsRedirectDialogFragment roomsRedirectDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) roomsRedirectDialogFragment).A01 = A00;
        ((WaDialogFragment) roomsRedirectDialogFragment).A00 = A00();
        roomsRedirectDialogFragment.A00 = C41871ue.A00();
    }

    @Override // X.C0CS
    public void A1T(EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment) {
        emojiEditTextBottomSheetDialogFragment.A0K = C42111v7.A03();
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        emojiEditTextBottomSheetDialogFragment.A08 = A00;
        emojiEditTextBottomSheetDialogFragment.A0M = C2MA.A01();
        AbstractC000600i A002 = AbstractC000600i.A00();
        C02180Ae.A1B(A002);
        emojiEditTextBottomSheetDialogFragment.A07 = A002;
        emojiEditTextBottomSheetDialogFragment.A0G = C2M8.A00();
        emojiEditTextBottomSheetDialogFragment.A0E = C2M9.A00();
        emojiEditTextBottomSheetDialogFragment.A0I = C41871ue.A03();
        emojiEditTextBottomSheetDialogFragment.A0B = C42041uv.A01();
        emojiEditTextBottomSheetDialogFragment.A0D = C41131tQ.A03();
        emojiEditTextBottomSheetDialogFragment.A0J = C42141vB.A03();
        emojiEditTextBottomSheetDialogFragment.A0C = C41131tQ.A02();
        C02O A003 = C02O.A00();
        C02180Ae.A1B(A003);
        emojiEditTextBottomSheetDialogFragment.A0L = A003;
    }

    @Override // X.C0CS
    public void A1U(EphemeralNUXDialog ephemeralNUXDialog) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) ephemeralNUXDialog).A01 = A00;
        ((WaDialogFragment) ephemeralNUXDialog).A00 = A00();
        ephemeralNUXDialog.A04 = C41121tP.A00();
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        ephemeralNUXDialog.A02 = A02;
        ephemeralNUXDialog.A05 = C42141vB.A07();
        ephemeralNUXDialog.A03 = C41131tQ.A02();
    }

    @Override // X.C0CS
    public void A1V(ViewOnceNUXDialog viewOnceNUXDialog) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) viewOnceNUXDialog).A01 = A00;
        ((WaDialogFragment) viewOnceNUXDialog).A00 = A00();
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        viewOnceNUXDialog.A02 = A02;
        viewOnceNUXDialog.A04 = C42141vB.A07();
        viewOnceNUXDialog.A03 = C41131tQ.A02();
    }

    @Override // X.C0CS
    public void A1W(DocumentsGalleryFragment documentsGalleryFragment) {
        ((WaFragment) documentsGalleryFragment).A00 = A00();
        ((GalleryFragmentBase) documentsGalleryFragment).A0D = C41131tQ.A04();
        ((GalleryFragmentBase) documentsGalleryFragment).A04 = C41131tQ.A03();
        C0C9 A00 = C0C9.A00();
        C02180Ae.A1B(A00);
        ((GalleryFragmentBase) documentsGalleryFragment).A05 = A00;
        C00A c00a = C00A.A00;
        C02180Ae.A1B(c00a);
        ((GalleryFragmentBase) documentsGalleryFragment).A07 = c00a;
        C05F c05f = C05F.A01;
        C02180Ae.A1B(c05f);
        ((GalleryFragmentBase) documentsGalleryFragment).A08 = c05f;
        C02F A002 = C02F.A00();
        C02180Ae.A1B(A002);
        ((GalleryFragmentBase) documentsGalleryFragment).A03 = A002;
        documentsGalleryFragment.A06 = C41371to.A0B();
        C018508q A003 = C018508q.A00();
        C02180Ae.A1B(A003);
        documentsGalleryFragment.A02 = A003;
        AbstractC000600i A004 = AbstractC000600i.A00();
        C02180Ae.A1B(A004);
        documentsGalleryFragment.A01 = A004;
        documentsGalleryFragment.A07 = C41131tQ.A04();
        C01B A005 = C01B.A00();
        C02180Ae.A1B(A005);
        documentsGalleryFragment.A03 = A005;
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        documentsGalleryFragment.A00 = A02;
        documentsGalleryFragment.A05 = C41411ts.A00();
        documentsGalleryFragment.A04 = C42141vB.A01();
    }

    @Override // X.C0CS
    public void A1X(GalleryFragmentBase galleryFragmentBase) {
        ((WaFragment) galleryFragmentBase).A00 = A00();
        galleryFragmentBase.A0D = C41131tQ.A04();
        galleryFragmentBase.A04 = C41131tQ.A03();
        C0C9 A00 = C0C9.A00();
        C02180Ae.A1B(A00);
        galleryFragmentBase.A05 = A00;
        C00A c00a = C00A.A00;
        C02180Ae.A1B(c00a);
        galleryFragmentBase.A07 = c00a;
        C05F c05f = C05F.A01;
        C02180Ae.A1B(c05f);
        galleryFragmentBase.A08 = c05f;
        C02F A002 = C02F.A00();
        C02180Ae.A1B(A002);
        galleryFragmentBase.A03 = A002;
    }

    @Override // X.C0CS
    public void A1Y(LinksGalleryFragment linksGalleryFragment) {
        ((WaFragment) linksGalleryFragment).A00 = A00();
        ((GalleryFragmentBase) linksGalleryFragment).A0D = C41131tQ.A04();
        ((GalleryFragmentBase) linksGalleryFragment).A04 = C41131tQ.A03();
        C0C9 A00 = C0C9.A00();
        C02180Ae.A1B(A00);
        ((GalleryFragmentBase) linksGalleryFragment).A05 = A00;
        C00A c00a = C00A.A00;
        C02180Ae.A1B(c00a);
        ((GalleryFragmentBase) linksGalleryFragment).A07 = c00a;
        C05F c05f = C05F.A01;
        C02180Ae.A1B(c05f);
        ((GalleryFragmentBase) linksGalleryFragment).A08 = c05f;
        C02F A002 = C02F.A00();
        C02180Ae.A1B(A002);
        ((GalleryFragmentBase) linksGalleryFragment).A03 = A002;
        linksGalleryFragment.A04 = C2M8.A00();
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        linksGalleryFragment.A00 = A02;
        C0WZ A003 = C0WZ.A00();
        C02180Ae.A1B(A003);
        linksGalleryFragment.A03 = A003;
        C03690Gr A004 = C03690Gr.A00();
        C02180Ae.A1B(A004);
        linksGalleryFragment.A02 = A004;
        linksGalleryFragment.A05 = C41371to.A0D();
    }

    @Override // X.C0CS
    public void A1Z(MediaGalleryFragment mediaGalleryFragment) {
        ((WaFragment) mediaGalleryFragment).A00 = A00();
        C011605s A00 = C011605s.A00();
        C02180Ae.A1B(A00);
        ((MediaGalleryFragmentBase) mediaGalleryFragment).A09 = A00;
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        ((MediaGalleryFragmentBase) mediaGalleryFragment).A07 = A002;
        C001200o c001200o = C001200o.A01;
        C02180Ae.A1B(c001200o);
        ((MediaGalleryFragmentBase) mediaGalleryFragment).A0B = c001200o;
        ((MediaGalleryFragmentBase) mediaGalleryFragment).A0K = C41131tQ.A04();
        ((MediaGalleryFragmentBase) mediaGalleryFragment).A0A = C42041uv.A01();
        ((MediaGalleryFragmentBase) mediaGalleryFragment).A0D = C41131tQ.A03();
        C02F A003 = C02F.A00();
        C02180Ae.A1B(A003);
        ((MediaGalleryFragmentBase) mediaGalleryFragment).A0C = A003;
        C0C9 A004 = C0C9.A00();
        C02180Ae.A1B(A004);
        mediaGalleryFragment.A00 = A004;
        mediaGalleryFragment.A01 = C41371to.A01();
        mediaGalleryFragment.A04 = C41371to.A0D();
        C00A c00a = C00A.A00;
        C02180Ae.A1B(c00a);
        mediaGalleryFragment.A02 = c00a;
    }

    @Override // X.C0CS
    public void A1a(MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        ((WaFragment) mediaGalleryFragmentBase).A00 = A00();
        C011605s A00 = C011605s.A00();
        C02180Ae.A1B(A00);
        mediaGalleryFragmentBase.A09 = A00;
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        mediaGalleryFragmentBase.A07 = A002;
        C001200o c001200o = C001200o.A01;
        C02180Ae.A1B(c001200o);
        mediaGalleryFragmentBase.A0B = c001200o;
        mediaGalleryFragmentBase.A0K = C41131tQ.A04();
        mediaGalleryFragmentBase.A0A = C42041uv.A01();
        mediaGalleryFragmentBase.A0D = C41131tQ.A03();
        C02F A003 = C02F.A00();
        C02180Ae.A1B(A003);
        mediaGalleryFragmentBase.A0C = A003;
    }

    @Override // X.C0CS
    public void A1b(ProductGalleryFragment productGalleryFragment) {
        ((WaFragment) productGalleryFragment).A00 = A00();
        ((GalleryFragmentBase) productGalleryFragment).A0D = C41131tQ.A04();
        ((GalleryFragmentBase) productGalleryFragment).A04 = C41131tQ.A03();
        C0C9 A00 = C0C9.A00();
        C02180Ae.A1B(A00);
        ((GalleryFragmentBase) productGalleryFragment).A05 = A00;
        C00A c00a = C00A.A00;
        C02180Ae.A1B(c00a);
        ((GalleryFragmentBase) productGalleryFragment).A07 = c00a;
        C05F c05f = C05F.A01;
        C02180Ae.A1B(c05f);
        ((GalleryFragmentBase) productGalleryFragment).A08 = c05f;
        C02F A002 = C02F.A00();
        C02180Ae.A1B(A002);
        ((GalleryFragmentBase) productGalleryFragment).A03 = A002;
        productGalleryFragment.A00 = C41131tQ.A00();
        productGalleryFragment.A02 = C41131tQ.A03();
        C0D5 A003 = C0D5.A00();
        C02180Ae.A1B(A003);
        productGalleryFragment.A04 = A003;
        C0C9 A004 = C0C9.A00();
        C02180Ae.A1B(A004);
        productGalleryFragment.A03 = A004;
        productGalleryFragment.A06 = C41371to.A0D();
        C012706e A005 = C012706e.A00();
        C02180Ae.A1B(A005);
        productGalleryFragment.A05 = A005;
        productGalleryFragment.A01 = C41171tU.A03();
    }

    @Override // X.C0CS
    public void A1c(GalleryPickerFragment galleryPickerFragment) {
        ((WaFragment) galleryPickerFragment).A00 = A00();
        C011605s A00 = C011605s.A00();
        C02180Ae.A1B(A00);
        galleryPickerFragment.A0B = A00;
        AbstractC000600i A002 = AbstractC000600i.A00();
        C02180Ae.A1B(A002);
        galleryPickerFragment.A09 = A002;
        C001200o c001200o = C001200o.A01;
        C02180Ae.A1B(c001200o);
        galleryPickerFragment.A0C = c001200o;
        galleryPickerFragment.A0K = C41131tQ.A04();
        C01B A003 = C01B.A00();
        C02180Ae.A1B(A003);
        galleryPickerFragment.A0A = A003;
        galleryPickerFragment.A0E = C41131tQ.A03();
        galleryPickerFragment.A0I = C49732Md.A03();
        C02F A004 = C02F.A00();
        C02180Ae.A1B(A004);
        galleryPickerFragment.A0D = A004;
        C02C A005 = C02C.A00();
        C02180Ae.A1B(A005);
        galleryPickerFragment.A0J = A005;
    }

    @Override // X.C0CS
    public void A1d(MediaPickerFragment mediaPickerFragment) {
        ((WaFragment) mediaPickerFragment).A00 = A00();
        C011605s A00 = C011605s.A00();
        C02180Ae.A1B(A00);
        ((MediaGalleryFragmentBase) mediaPickerFragment).A09 = A00;
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        ((MediaGalleryFragmentBase) mediaPickerFragment).A07 = A002;
        C001200o c001200o = C001200o.A01;
        C02180Ae.A1B(c001200o);
        ((MediaGalleryFragmentBase) mediaPickerFragment).A0B = c001200o;
        ((MediaGalleryFragmentBase) mediaPickerFragment).A0K = C41131tQ.A04();
        ((MediaGalleryFragmentBase) mediaPickerFragment).A0A = C42041uv.A01();
        ((MediaGalleryFragmentBase) mediaPickerFragment).A0D = C41131tQ.A03();
        C02F A003 = C02F.A00();
        C02180Ae.A1B(A003);
        ((MediaGalleryFragmentBase) mediaPickerFragment).A0C = A003;
        C011605s A004 = C011605s.A00();
        C02180Ae.A1B(A004);
        mediaPickerFragment.A08 = A004;
        C018508q A005 = C018508q.A00();
        C02180Ae.A1B(A005);
        mediaPickerFragment.A06 = A005;
        AbstractC000600i A006 = AbstractC000600i.A00();
        C02180Ae.A1B(A006);
        mediaPickerFragment.A05 = A006;
        C02180Ae.A1B(c001200o);
        mediaPickerFragment.A09 = c001200o;
        C01B A007 = C01B.A00();
        C02180Ae.A1B(A007);
        mediaPickerFragment.A07 = A007;
        mediaPickerFragment.A0B = C41131tQ.A03();
        mediaPickerFragment.A0D = C49732Md.A03();
        C02F A008 = C02F.A00();
        C02180Ae.A1B(A008);
        mediaPickerFragment.A0A = A008;
        C02C A009 = C02C.A00();
        C02180Ae.A1B(A009);
        mediaPickerFragment.A0F = A009;
        mediaPickerFragment.A0E = C41871ue.A06();
    }

    @Override // X.C0CS
    public void A1e(RemoveDownloadableGifFromFavoritesDialogFragment removeDownloadableGifFromFavoritesDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) removeDownloadableGifFromFavoritesDialogFragment).A01 = A00;
        ((WaDialogFragment) removeDownloadableGifFromFavoritesDialogFragment).A00 = A00();
        removeDownloadableGifFromFavoritesDialogFragment.A00 = C42141vB.A04();
    }

    @Override // X.C0CS
    public void A1f(RemoveGifFromFavoritesDialogFragment removeGifFromFavoritesDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) removeGifFromFavoritesDialogFragment).A01 = A00;
        ((WaDialogFragment) removeGifFromFavoritesDialogFragment).A00 = A00();
        removeGifFromFavoritesDialogFragment.A01 = C42111v7.A04();
    }

    @Override // X.C0CS
    public void A1g(StarDownloadableGifDialogFragment starDownloadableGifDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) starDownloadableGifDialogFragment).A01 = A00;
        ((WaDialogFragment) starDownloadableGifDialogFragment).A00 = A00();
        starDownloadableGifDialogFragment.A00 = C41131tQ.A01();
        starDownloadableGifDialogFragment.A01 = C42141vB.A04();
    }

    @Override // X.C0CS
    public void A1h(StarOrRemoveFromRecentGifsDialogFragment starOrRemoveFromRecentGifsDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) starOrRemoveFromRecentGifsDialogFragment).A01 = A00;
        ((WaDialogFragment) starOrRemoveFromRecentGifsDialogFragment).A00 = A00();
        starOrRemoveFromRecentGifsDialogFragment.A00 = C41131tQ.A01();
        starOrRemoveFromRecentGifsDialogFragment.A02 = C42111v7.A04();
    }

    @Override // X.C0CS
    public void A1i(GroupChatInfo.DescriptionConflictDialogFragment descriptionConflictDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) descriptionConflictDialogFragment).A01 = A00;
        ((WaDialogFragment) descriptionConflictDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A1j(GroupParticipantsSearchFragment groupParticipantsSearchFragment) {
        ((WaFragment) groupParticipantsSearchFragment).A00 = A00();
        groupParticipantsSearchFragment.A03 = C2MA.A01();
        groupParticipantsSearchFragment.A01 = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A1k(GroupSettingsActivity.EditGroupInfoDialogFragment editGroupInfoDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) editGroupInfoDialogFragment).A01 = A00;
        ((WaDialogFragment) editGroupInfoDialogFragment).A00 = A00();
        C41131tQ.A01();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        ((GroupSettingsActivity.AdminSettingsDialogFragment) editGroupInfoDialogFragment).A00 = A002;
        ((GroupSettingsActivity.AdminSettingsDialogFragment) editGroupInfoDialogFragment).A0A = C41931uk.A06();
        C0EG A003 = C0EG.A00();
        C02180Ae.A1B(A003);
        ((GroupSettingsActivity.AdminSettingsDialogFragment) editGroupInfoDialogFragment).A09 = A003;
        C01B A004 = C01B.A00();
        C02180Ae.A1B(A004);
        ((GroupSettingsActivity.AdminSettingsDialogFragment) editGroupInfoDialogFragment).A01 = A004;
        ((GroupSettingsActivity.AdminSettingsDialogFragment) editGroupInfoDialogFragment).A02 = C41141tR.A00();
        C41131tQ.A03();
        C02180Ae.A1B(C0C9.A00());
        C0ES A005 = C0ES.A00();
        C02180Ae.A1B(A005);
        ((GroupSettingsActivity.AdminSettingsDialogFragment) editGroupInfoDialogFragment).A07 = A005;
        ((GroupSettingsActivity.AdminSettingsDialogFragment) editGroupInfoDialogFragment).A03 = C41341tl.A00();
        C02180Ae.A1B(C07A.A01());
        C03340Fh c03340Fh = C03340Fh.A00;
        C02180Ae.A1B(c03340Fh);
        ((GroupSettingsActivity.AdminSettingsDialogFragment) editGroupInfoDialogFragment).A04 = c03340Fh;
        C0C8 A006 = C0C8.A00();
        C02180Ae.A1B(A006);
        ((GroupSettingsActivity.AdminSettingsDialogFragment) editGroupInfoDialogFragment).A05 = A006;
        editGroupInfoDialogFragment.A00 = C41121tP.A00();
    }

    @Override // X.C0CS
    public void A1l(GroupSettingsActivity.RestrictFrequentlyForwardedDialogFragment restrictFrequentlyForwardedDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) restrictFrequentlyForwardedDialogFragment).A01 = A00;
        ((WaDialogFragment) restrictFrequentlyForwardedDialogFragment).A00 = A00();
        C41131tQ.A01();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        ((GroupSettingsActivity.AdminSettingsDialogFragment) restrictFrequentlyForwardedDialogFragment).A00 = A002;
        ((GroupSettingsActivity.AdminSettingsDialogFragment) restrictFrequentlyForwardedDialogFragment).A0A = C41931uk.A06();
        C0EG A003 = C0EG.A00();
        C02180Ae.A1B(A003);
        ((GroupSettingsActivity.AdminSettingsDialogFragment) restrictFrequentlyForwardedDialogFragment).A09 = A003;
        C01B A004 = C01B.A00();
        C02180Ae.A1B(A004);
        ((GroupSettingsActivity.AdminSettingsDialogFragment) restrictFrequentlyForwardedDialogFragment).A01 = A004;
        ((GroupSettingsActivity.AdminSettingsDialogFragment) restrictFrequentlyForwardedDialogFragment).A02 = C41141tR.A00();
        C41131tQ.A03();
        C02180Ae.A1B(C0C9.A00());
        C0ES A005 = C0ES.A00();
        C02180Ae.A1B(A005);
        ((GroupSettingsActivity.AdminSettingsDialogFragment) restrictFrequentlyForwardedDialogFragment).A07 = A005;
        ((GroupSettingsActivity.AdminSettingsDialogFragment) restrictFrequentlyForwardedDialogFragment).A03 = C41341tl.A00();
        C02180Ae.A1B(C07A.A01());
        C03340Fh c03340Fh = C03340Fh.A00;
        C02180Ae.A1B(c03340Fh);
        ((GroupSettingsActivity.AdminSettingsDialogFragment) restrictFrequentlyForwardedDialogFragment).A04 = c03340Fh;
        C0C8 A006 = C0C8.A00();
        C02180Ae.A1B(A006);
        ((GroupSettingsActivity.AdminSettingsDialogFragment) restrictFrequentlyForwardedDialogFragment).A05 = A006;
    }

    @Override // X.C0CS
    public void A1m(GroupSettingsActivity.SendMessagesDialogFragment sendMessagesDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) sendMessagesDialogFragment).A01 = A00;
        ((WaDialogFragment) sendMessagesDialogFragment).A00 = A00();
        C41131tQ.A01();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        ((GroupSettingsActivity.AdminSettingsDialogFragment) sendMessagesDialogFragment).A00 = A002;
        ((GroupSettingsActivity.AdminSettingsDialogFragment) sendMessagesDialogFragment).A0A = C41931uk.A06();
        C0EG A003 = C0EG.A00();
        C02180Ae.A1B(A003);
        ((GroupSettingsActivity.AdminSettingsDialogFragment) sendMessagesDialogFragment).A09 = A003;
        C01B A004 = C01B.A00();
        C02180Ae.A1B(A004);
        ((GroupSettingsActivity.AdminSettingsDialogFragment) sendMessagesDialogFragment).A01 = A004;
        ((GroupSettingsActivity.AdminSettingsDialogFragment) sendMessagesDialogFragment).A02 = C41141tR.A00();
        C41131tQ.A03();
        C02180Ae.A1B(C0C9.A00());
        C0ES A005 = C0ES.A00();
        C02180Ae.A1B(A005);
        ((GroupSettingsActivity.AdminSettingsDialogFragment) sendMessagesDialogFragment).A07 = A005;
        ((GroupSettingsActivity.AdminSettingsDialogFragment) sendMessagesDialogFragment).A03 = C41341tl.A00();
        C02180Ae.A1B(C07A.A01());
        C03340Fh c03340Fh = C03340Fh.A00;
        C02180Ae.A1B(c03340Fh);
        ((GroupSettingsActivity.AdminSettingsDialogFragment) sendMessagesDialogFragment).A04 = c03340Fh;
        C0C8 A006 = C0C8.A00();
        C02180Ae.A1B(A006);
        ((GroupSettingsActivity.AdminSettingsDialogFragment) sendMessagesDialogFragment).A05 = A006;
    }

    @Override // X.C0CS
    public void A1n(GoogleSearchDialogFragment googleSearchDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) googleSearchDialogFragment).A01 = A00;
        ((WaDialogFragment) googleSearchDialogFragment).A00 = A00();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        googleSearchDialogFragment.A01 = A002;
        googleSearchDialogFragment.A04 = C41131tQ.A04();
        googleSearchDialogFragment.A03 = C41121tP.A01();
        C01B A003 = C01B.A00();
        C02180Ae.A1B(A003);
        googleSearchDialogFragment.A02 = A003;
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        googleSearchDialogFragment.A00 = A02;
    }

    @Override // X.C0CS
    public void A1o(SupportTopicsFragment supportTopicsFragment) {
        ((WaFragment) supportTopicsFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A1p(NobodyDeprecatedDialogFragment nobodyDeprecatedDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) nobodyDeprecatedDialogFragment).A01 = A00;
        ((WaDialogFragment) nobodyDeprecatedDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A1q(PromptSendGroupInviteDialogFragment promptSendGroupInviteDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) promptSendGroupInviteDialogFragment).A01 = A00;
        ((WaDialogFragment) promptSendGroupInviteDialogFragment).A00 = A00();
        C018708s A002 = C018708s.A00();
        C02180Ae.A1B(A002);
        promptSendGroupInviteDialogFragment.A00 = A002;
        promptSendGroupInviteDialogFragment.A01 = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A1r(RevokeInviteDialogFragment revokeInviteDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) revokeInviteDialogFragment).A01 = A00;
        ((WaDialogFragment) revokeInviteDialogFragment).A00 = A00();
        revokeInviteDialogFragment.A00 = C41141tR.A00();
        C018708s A002 = C018708s.A00();
        C02180Ae.A1B(A002);
        revokeInviteDialogFragment.A01 = A002;
    }

    @Override // X.C0CS
    public void A1s(StopLiveLocationDialogFragment stopLiveLocationDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) stopLiveLocationDialogFragment).A01 = A00;
        ((WaDialogFragment) stopLiveLocationDialogFragment).A00 = A00();
        C41131tQ.A03();
        stopLiveLocationDialogFragment.A00 = C41311ti.A01();
    }

    @Override // X.C0CS
    public void A1t(GifComposerFragment gifComposerFragment) {
        ((WaFragment) gifComposerFragment).A00 = A00();
        ((MediaComposerFragment) gifComposerFragment).A06 = C41121tP.A00();
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        ((MediaComposerFragment) gifComposerFragment).A01 = A00;
        ((MediaComposerFragment) gifComposerFragment).A0H = C2MA.A01();
        ((MediaComposerFragment) gifComposerFragment).A0I = C41131tQ.A04();
        ((MediaComposerFragment) gifComposerFragment).A05 = C2M8.A00();
        ((MediaComposerFragment) gifComposerFragment).A09 = C42141vB.A05();
        ((MediaComposerFragment) gifComposerFragment).A0B = A01();
        ((MediaComposerFragment) gifComposerFragment).A07 = C41371to.A04();
        ((MediaComposerFragment) gifComposerFragment).A02 = C42041uv.A01();
        ((MediaComposerFragment) gifComposerFragment).A04 = C41131tQ.A03();
        ((MediaComposerFragment) gifComposerFragment).A0F = C2MF.A05();
        ((MediaComposerFragment) gifComposerFragment).A0G = C2MF.A06();
        ((MediaComposerFragment) gifComposerFragment).A0D = A02();
        ((MediaComposerFragment) gifComposerFragment).A03 = C41131tQ.A02();
        ((MediaComposerFragment) gifComposerFragment).A0C = C41871ue.A05();
        ((MediaComposerFragment) gifComposerFragment).A0E = C2MF.A04();
        AbstractC000600i A002 = AbstractC000600i.A00();
        C02180Ae.A1B(A002);
        gifComposerFragment.A00 = A002;
        gifComposerFragment.A04 = C41131tQ.A04();
        C01B A003 = C01B.A00();
        C02180Ae.A1B(A003);
        gifComposerFragment.A01 = A003;
        gifComposerFragment.A02 = C42041uv.A01();
        gifComposerFragment.A03 = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A1u(ImageComposerFragment imageComposerFragment) {
        ((WaFragment) imageComposerFragment).A00 = A00();
        ((MediaComposerFragment) imageComposerFragment).A06 = C41121tP.A00();
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        ((MediaComposerFragment) imageComposerFragment).A01 = A00;
        ((MediaComposerFragment) imageComposerFragment).A0H = C2MA.A01();
        ((MediaComposerFragment) imageComposerFragment).A0I = C41131tQ.A04();
        ((MediaComposerFragment) imageComposerFragment).A05 = C2M8.A00();
        ((MediaComposerFragment) imageComposerFragment).A09 = C42141vB.A05();
        ((MediaComposerFragment) imageComposerFragment).A0B = A01();
        ((MediaComposerFragment) imageComposerFragment).A07 = C41371to.A04();
        ((MediaComposerFragment) imageComposerFragment).A02 = C42041uv.A01();
        ((MediaComposerFragment) imageComposerFragment).A04 = C41131tQ.A03();
        ((MediaComposerFragment) imageComposerFragment).A0F = C2MF.A05();
        ((MediaComposerFragment) imageComposerFragment).A0G = C2MF.A06();
        ((MediaComposerFragment) imageComposerFragment).A0D = A02();
        ((MediaComposerFragment) imageComposerFragment).A03 = C41131tQ.A02();
        ((MediaComposerFragment) imageComposerFragment).A0C = C41871ue.A05();
        ((MediaComposerFragment) imageComposerFragment).A0E = C2MF.A04();
        C011605s A002 = C011605s.A00();
        C02180Ae.A1B(A002);
        imageComposerFragment.A02 = A002;
        imageComposerFragment.A0B = C41131tQ.A04();
        C012005w A003 = C012005w.A00();
        C02180Ae.A1B(A003);
        imageComposerFragment.A00 = A003;
        C01B A004 = C01B.A00();
        C02180Ae.A1B(A004);
        imageComposerFragment.A01 = A004;
        imageComposerFragment.A06 = C2M9.A01();
        imageComposerFragment.A0A = C41371to.A0C();
        imageComposerFragment.A03 = C42041uv.A01();
        imageComposerFragment.A05 = C41131tQ.A03();
        imageComposerFragment.A04 = C41131tQ.A02();
    }

    @Override // X.C0CS
    public void A1v(MediaComposerFragment mediaComposerFragment) {
        ((WaFragment) mediaComposerFragment).A00 = A00();
        mediaComposerFragment.A06 = C41121tP.A00();
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        mediaComposerFragment.A01 = A00;
        mediaComposerFragment.A0H = C2MA.A01();
        mediaComposerFragment.A0I = C41131tQ.A04();
        mediaComposerFragment.A05 = C2M8.A00();
        mediaComposerFragment.A09 = C42141vB.A05();
        mediaComposerFragment.A0B = A01();
        mediaComposerFragment.A07 = C41371to.A04();
        mediaComposerFragment.A02 = C42041uv.A01();
        mediaComposerFragment.A04 = C41131tQ.A03();
        mediaComposerFragment.A0F = C2MF.A05();
        mediaComposerFragment.A0G = C2MF.A06();
        mediaComposerFragment.A0D = A02();
        mediaComposerFragment.A03 = C41131tQ.A02();
        mediaComposerFragment.A0C = C41871ue.A05();
        mediaComposerFragment.A0E = C2MF.A04();
    }

    @Override // X.C0CS
    public void A1w(VideoComposerFragment videoComposerFragment) {
        ((WaFragment) videoComposerFragment).A00 = A00();
        ((MediaComposerFragment) videoComposerFragment).A06 = C41121tP.A00();
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        ((MediaComposerFragment) videoComposerFragment).A01 = A00;
        ((MediaComposerFragment) videoComposerFragment).A0H = C2MA.A01();
        ((MediaComposerFragment) videoComposerFragment).A0I = C41131tQ.A04();
        ((MediaComposerFragment) videoComposerFragment).A05 = C2M8.A00();
        ((MediaComposerFragment) videoComposerFragment).A09 = C42141vB.A05();
        ((MediaComposerFragment) videoComposerFragment).A0B = A01();
        ((MediaComposerFragment) videoComposerFragment).A07 = C41371to.A04();
        ((MediaComposerFragment) videoComposerFragment).A02 = C42041uv.A01();
        ((MediaComposerFragment) videoComposerFragment).A04 = C41131tQ.A03();
        ((MediaComposerFragment) videoComposerFragment).A0F = C2MF.A05();
        ((MediaComposerFragment) videoComposerFragment).A0G = C2MF.A06();
        ((MediaComposerFragment) videoComposerFragment).A0D = A02();
        ((MediaComposerFragment) videoComposerFragment).A03 = C41131tQ.A02();
        ((MediaComposerFragment) videoComposerFragment).A0C = C41871ue.A05();
        ((MediaComposerFragment) videoComposerFragment).A0E = C2MF.A04();
        videoComposerFragment.A0N = C41121tP.A00();
        videoComposerFragment.A0Q = C41371to.A0B();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        videoComposerFragment.A0H = A002;
        videoComposerFragment.A0S = C41131tQ.A04();
        AbstractC000600i A003 = AbstractC000600i.A00();
        C02180Ae.A1B(A003);
        videoComposerFragment.A0G = A003;
        C01B A004 = C01B.A00();
        C02180Ae.A1B(A004);
        videoComposerFragment.A0I = A004;
        videoComposerFragment.A0L = C42041uv.A01();
        C43091wq A01 = C43091wq.A01();
        C02180Ae.A1B(A01);
        videoComposerFragment.A0O = A01;
        videoComposerFragment.A0M = C41131tQ.A03();
        C03120Eg A005 = C03120Eg.A00();
        C02180Ae.A1B(A005);
        videoComposerFragment.A0K = A005;
    }

    @Override // X.C0CS
    public void A1x(DeleteMessagesDialogFragment deleteMessagesDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) deleteMessagesDialogFragment).A01 = A00;
        ((WaDialogFragment) deleteMessagesDialogFragment).A00 = A00();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        deleteMessagesDialogFragment.A02 = A002;
        deleteMessagesDialogFragment.A06 = C41131tQ.A01();
        deleteMessagesDialogFragment.A0C = C41131tQ.A04();
        deleteMessagesDialogFragment.A0A = C2M8.A00();
        C018608r A02 = C018608r.A02();
        C02180Ae.A1B(A02);
        deleteMessagesDialogFragment.A03 = A02;
        deleteMessagesDialogFragment.A04 = C41141tR.A00();
        C018708s A003 = C018708s.A00();
        C02180Ae.A1B(A003);
        deleteMessagesDialogFragment.A05 = A003;
        deleteMessagesDialogFragment.A08 = C41131tQ.A03();
        C05Q A004 = C05Q.A00();
        C02180Ae.A1B(A004);
        deleteMessagesDialogFragment.A09 = A004;
        C018808t A005 = C018808t.A00();
        C02180Ae.A1B(A005);
        deleteMessagesDialogFragment.A0B = A005;
        deleteMessagesDialogFragment.A07 = C41131tQ.A02();
    }

    @Override // X.C0CS
    public void A1y(MediaViewFragment mediaViewFragment) {
        ((WaFragment) mediaViewFragment).A00 = A00();
        mediaViewFragment.A0U = C41131tQ.A01();
        C011605s A00 = C011605s.A00();
        C02180Ae.A1B(A00);
        mediaViewFragment.A0J = A00;
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        mediaViewFragment.A0E = A002;
        C02980Dr A003 = C02980Dr.A00();
        C02180Ae.A1B(A003);
        mediaViewFragment.A0s = A003;
        AbstractC000600i A004 = AbstractC000600i.A00();
        C02180Ae.A1B(A004);
        mediaViewFragment.A0D = A004;
        mediaViewFragment.A0F = C41131tQ.A00();
        C03010Du A005 = C03010Du.A00();
        C02180Ae.A1B(A005);
        mediaViewFragment.A0G = A005;
        C001200o c001200o = C001200o.A01;
        C02180Ae.A1B(c001200o);
        mediaViewFragment.A0V = c001200o;
        C018708s A006 = C018708s.A00();
        C02180Ae.A1B(A006);
        mediaViewFragment.A0N = A006;
        C000400f A007 = C000400f.A00();
        C02180Ae.A1B(A007);
        mediaViewFragment.A0R = A007;
        C0DK A008 = C0DK.A00();
        C02180Ae.A1B(A008);
        mediaViewFragment.A0Z = A008;
        mediaViewFragment.A15 = C41131tQ.A04();
        mediaViewFragment.A12 = C41171tU.A0C();
        mediaViewFragment.A0h = C41121tP.A01();
        C01B A009 = C01B.A00();
        C02180Ae.A1B(A009);
        mediaViewFragment.A0H = A009;
        mediaViewFragment.A0K = C2MF.A01();
        C018608r A02 = C018608r.A02();
        C02180Ae.A1B(A02);
        mediaViewFragment.A0I = A02;
        C018308n A022 = C018308n.A02();
        C02180Ae.A1B(A022);
        mediaViewFragment.A0C = A022;
        mediaViewFragment.A0k = C41371to.A04();
        mediaViewFragment.A0L = C41141tR.A00();
        C0ED A01 = C0ED.A01();
        C02180Ae.A1B(A01);
        mediaViewFragment.A0f = A01;
        mediaViewFragment.A10 = C42141vB.A07();
        mediaViewFragment.A13 = C41371to.A0C();
        mediaViewFragment.A0S = C42041uv.A01();
        mediaViewFragment.A0Y = C41131tQ.A03();
        AnonymousClass008 anonymousClass008 = AnonymousClass008.A01;
        C02180Ae.A1B(anonymousClass008);
        mediaViewFragment.A0M = anonymousClass008;
        C0C9 A0010 = C0C9.A00();
        C02180Ae.A1B(A0010);
        mediaViewFragment.A0a = A0010;
        C00A c00a = C00A.A00;
        C02180Ae.A1B(c00a);
        mediaViewFragment.A0c = c00a;
        mediaViewFragment.A0z = C41311ti.A04();
        C0HA A0011 = C0HA.A00();
        C02180Ae.A1B(A0011);
        mediaViewFragment.A0g = A0011;
        mediaViewFragment.A0b = C41371to.A01();
        mediaViewFragment.A14 = C41371to.A0D();
        mediaViewFragment.A0T = C42041uv.A02();
        C011505r A0012 = C011505r.A00();
        C02180Ae.A1B(A0012);
        mediaViewFragment.A0O = A0012;
        C43131wu A0013 = C43131wu.A00();
        C02180Ae.A1B(A0013);
        mediaViewFragment.A0m = A0013;
        mediaViewFragment.A0u = C49732Md.A04();
        mediaViewFragment.A0e = C41411ts.A00();
        mediaViewFragment.A0d = C2MC.A01();
        C02F A0014 = C02F.A00();
        C02180Ae.A1B(A0014);
        mediaViewFragment.A0W = A0014;
        mediaViewFragment.A0X = C41131tQ.A02();
        mediaViewFragment.A0o = C41371to.A07();
        C02180Ae.A1B(AnonymousClass057.A00);
        mediaViewFragment.A0l = C41871ue.A04();
        C02O A0015 = C02O.A00();
        C02180Ae.A1B(A0015);
        mediaViewFragment.A0t = A0015;
        C03120Eg A0016 = C03120Eg.A00();
        C02180Ae.A1B(A0016);
        mediaViewFragment.A0P = A0016;
        mediaViewFragment.A0n = C41371to.A06();
        C000800k c000800k = C000800k.A02;
        C02180Ae.A1B(c000800k);
        mediaViewFragment.A0Q = c000800k;
    }

    @Override // X.C0CS
    public void A1z(RevokeNuxDialogFragment revokeNuxDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) revokeNuxDialogFragment).A01 = A00;
        ((WaDialogFragment) revokeNuxDialogFragment).A00 = A00();
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        revokeNuxDialogFragment.A00 = A02;
        revokeNuxDialogFragment.A02 = C42141vB.A07();
        revokeNuxDialogFragment.A01 = C41131tQ.A02();
    }

    @Override // X.C0CS
    public void A20(RequestPermissionsDialogFragment requestPermissionsDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) requestPermissionsDialogFragment).A01 = A00;
        ((WaDialogFragment) requestPermissionsDialogFragment).A00 = A00();
        C41131tQ.A03();
        requestPermissionsDialogFragment.A01 = C41131tQ.A02();
        C03150Ej A002 = C03150Ej.A00();
        C02180Ae.A1B(A002);
        requestPermissionsDialogFragment.A00 = A002;
    }

    @Override // X.C0CS
    public void A21(PinBottomSheetDialogFragment pinBottomSheetDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((RoundedBottomSheetDialogFragment) pinBottomSheetDialogFragment).A00 = A00;
        pinBottomSheetDialogFragment.A07 = C41131tQ.A01();
        pinBottomSheetDialogFragment.A08 = C41131tQ.A03();
        pinBottomSheetDialogFragment.A09 = C46W.A03();
    }

    @Override // X.C0CS
    public void A22(AddPaymentMethodBottomSheet addPaymentMethodBottomSheet) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((RoundedBottomSheetDialogFragment) addPaymentMethodBottomSheet).A00 = A00;
        addPaymentMethodBottomSheet.A01 = C41121tP.A01();
        addPaymentMethodBottomSheet.A00 = C42041uv.A01();
        addPaymentMethodBottomSheet.A03 = C42001ur.A07();
        C0GR A002 = C0GR.A00();
        C02180Ae.A1B(A002);
        addPaymentMethodBottomSheet.A02 = A002;
    }

    @Override // X.C0CS
    public void A23(BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment) {
        ((WaFragment) brazilConfirmReceivePaymentFragment).A00 = A00();
        C0DV A00 = C0DV.A00();
        C02180Ae.A1B(A00);
        ((ConfirmReceivePaymentFragment) brazilConfirmReceivePaymentFragment).A04 = A00;
        ((ConfirmReceivePaymentFragment) brazilConfirmReceivePaymentFragment).A03 = C42001ur.A01();
        brazilConfirmReceivePaymentFragment.A03 = C41131tQ.A01();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        brazilConfirmReceivePaymentFragment.A00 = A002;
        brazilConfirmReceivePaymentFragment.A01 = C41131tQ.A00();
        brazilConfirmReceivePaymentFragment.A04 = C41131tQ.A03();
        brazilConfirmReceivePaymentFragment.A0H = C42001ur.A09();
        C0DV A003 = C0DV.A00();
        C02180Ae.A1B(A003);
        brazilConfirmReceivePaymentFragment.A0C = A003;
        brazilConfirmReceivePaymentFragment.A06 = C894346z.A00();
        brazilConfirmReceivePaymentFragment.A02 = C41341tl.A00();
        brazilConfirmReceivePaymentFragment.A0E = C894346z.A02();
        brazilConfirmReceivePaymentFragment.A0A = C49732Md.A02();
        C0DW A004 = C0DW.A00();
        C02180Ae.A1B(A004);
        brazilConfirmReceivePaymentFragment.A0B = A004;
        brazilConfirmReceivePaymentFragment.A0D = C46W.A02();
        C013606n A03 = C013606n.A03();
        C02180Ae.A1B(A03);
        brazilConfirmReceivePaymentFragment.A05 = A03;
        brazilConfirmReceivePaymentFragment.A08 = C894346z.A01();
        brazilConfirmReceivePaymentFragment.A09 = C42001ur.A05();
        brazilConfirmReceivePaymentFragment.A0F = C894346z.A03();
        brazilConfirmReceivePaymentFragment.A0G = C894346z.A03();
    }

    @Override // X.C0CS
    public void A24(BrazilPaymentTypePickerFragment brazilPaymentTypePickerFragment) {
        ((WaFragment) brazilPaymentTypePickerFragment).A00 = A00();
        ((PaymentTypePickerFragment) brazilPaymentTypePickerFragment).A00 = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A25(BrazilReTosFragment brazilReTosFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((RoundedBottomSheetDialogFragment) brazilReTosFragment).A00 = A00;
        ((ReTosFragment) brazilReTosFragment).A02 = C42041uv.A01();
        ((ReTosFragment) brazilReTosFragment).A03 = C41131tQ.A03();
        ((ReTosFragment) brazilReTosFragment).A04 = C49732Md.A02();
        brazilReTosFragment.A01 = C42111v7.A0A();
        brazilReTosFragment.A00 = C2MA.A00();
    }

    @Override // X.C0CS
    public void A26(BrazilSmbMerchantNuxUpSellBottomSheet brazilSmbMerchantNuxUpSellBottomSheet) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((RoundedBottomSheetDialogFragment) brazilSmbMerchantNuxUpSellBottomSheet).A00 = A00;
        brazilSmbMerchantNuxUpSellBottomSheet.A00 = C894346z.A03();
    }

    @Override // X.C0CS
    public void A27(ConfirmPaymentFragment confirmPaymentFragment) {
        ((WaFragment) confirmPaymentFragment).A00 = A00();
        C42041uv.A01();
        confirmPaymentFragment.A0D = C41131tQ.A03();
        C0DV A00 = C0DV.A00();
        C02180Ae.A1B(A00);
        confirmPaymentFragment.A0I = A00;
        C0DW A002 = C0DW.A00();
        C02180Ae.A1B(A002);
        confirmPaymentFragment.A0H = A002;
        C013606n A03 = C013606n.A03();
        C02180Ae.A1B(A03);
        confirmPaymentFragment.A0F = A03;
    }

    @Override // X.C0CS
    public void A28(IndiaUpiContactPicker.IndiaUpiContactPickerFragment indiaUpiContactPickerFragment) {
        ((WaFragment) indiaUpiContactPickerFragment).A00 = A00();
        indiaUpiContactPickerFragment.A0z = C41121tP.A00();
        indiaUpiContactPickerFragment.A1B = C41371to.A0B();
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        ((ContactPickerFragment) indiaUpiContactPickerFragment).A0F = A00;
        ((ContactPickerFragment) indiaUpiContactPickerFragment).A0G = C41131tQ.A00();
        C03010Du A002 = C03010Du.A00();
        C02180Ae.A1B(A002);
        ((ContactPickerFragment) indiaUpiContactPickerFragment).A0J = A002;
        indiaUpiContactPickerFragment.A1G = C41131tQ.A04();
        C05M A003 = C05M.A00();
        C02180Ae.A1B(A003);
        indiaUpiContactPickerFragment.A0q = A003;
        indiaUpiContactPickerFragment.A11 = C41121tP.A01();
        indiaUpiContactPickerFragment.A0y = C2M8.A00();
        ((ContactPickerFragment) indiaUpiContactPickerFragment).A0H = C41871ue.A00();
        C01B A004 = C01B.A00();
        C02180Ae.A1B(A004);
        ((ContactPickerFragment) indiaUpiContactPickerFragment).A0K = A004;
        C0EB A005 = C0EB.A00();
        C02180Ae.A1B(A005);
        indiaUpiContactPickerFragment.A0w = A005;
        ((ContactPickerFragment) indiaUpiContactPickerFragment).A0L = C2MF.A00();
        C018608r A02 = C018608r.A02();
        C02180Ae.A1B(A02);
        ((ContactPickerFragment) indiaUpiContactPickerFragment).A0N = A02;
        indiaUpiContactPickerFragment.A1H = C41931uk.A03();
        C006602x A006 = C006602x.A00();
        C02180Ae.A1B(A006);
        indiaUpiContactPickerFragment.A1D = A006;
        C0L5 A01 = C0L5.A01();
        C02180Ae.A1B(A01);
        ((ContactPickerFragment) indiaUpiContactPickerFragment).A0Z = A01;
        C05Y A012 = C05Y.A01();
        C02180Ae.A1B(A012);
        indiaUpiContactPickerFragment.A15 = A012;
        indiaUpiContactPickerFragment.A18 = C2MC.A03();
        C018308n A022 = C018308n.A02();
        C02180Ae.A1B(A022);
        ((ContactPickerFragment) indiaUpiContactPickerFragment).A0D = A022;
        ((ContactPickerFragment) indiaUpiContactPickerFragment).A0S = C41141tR.A00();
        indiaUpiContactPickerFragment.A1A = C42141vB.A07();
        indiaUpiContactPickerFragment.A1F = C41371to.A0C();
        indiaUpiContactPickerFragment.A0m = C42041uv.A01();
        C018708s A007 = C018708s.A00();
        C02180Ae.A1B(A007);
        ((ContactPickerFragment) indiaUpiContactPickerFragment).A0X = A007;
        indiaUpiContactPickerFragment.A0p = C41131tQ.A03();
        C0WZ A008 = C0WZ.A00();
        C02180Ae.A1B(A008);
        indiaUpiContactPickerFragment.A0v = A008;
        ((ContactPickerFragment) indiaUpiContactPickerFragment).A0P = C41171tU.A09();
        AnonymousClass008 anonymousClass008 = AnonymousClass008.A01;
        C02180Ae.A1B(anonymousClass008);
        ((ContactPickerFragment) indiaUpiContactPickerFragment).A0U = anonymousClass008;
        ((ContactPickerFragment) indiaUpiContactPickerFragment).A0g = C41211tY.A01();
        AnonymousClass031 A009 = AnonymousClass031.A00();
        C02180Ae.A1B(A009);
        ((ContactPickerFragment) indiaUpiContactPickerFragment).A0E = A009;
        indiaUpiContactPickerFragment.A19 = C2MC.A06();
        C0CB A0010 = C0CB.A00();
        C02180Ae.A1B(A0010);
        indiaUpiContactPickerFragment.A17 = A0010;
        C0HA A0011 = C0HA.A00();
        C02180Ae.A1B(A0011);
        indiaUpiContactPickerFragment.A10 = A0011;
        C0L8 A0012 = C0L8.A00();
        C02180Ae.A1B(A0012);
        ((ContactPickerFragment) indiaUpiContactPickerFragment).A0O = A0012;
        C03320Ff c03320Ff = C03320Ff.A00;
        C02180Ae.A1B(c03320Ff);
        ((ContactPickerFragment) indiaUpiContactPickerFragment).A0R = c03320Ff;
        ((ContactPickerFragment) indiaUpiContactPickerFragment).A0h = C41311ti.A00();
        C05E A0013 = C05E.A00();
        C02180Ae.A1B(A0013);
        indiaUpiContactPickerFragment.A0u = A0013;
        indiaUpiContactPickerFragment.A0l = C41341tl.A00();
        AnonymousClass075 A0014 = AnonymousClass075.A00();
        C02180Ae.A1B(A0014);
        ((ContactPickerFragment) indiaUpiContactPickerFragment).A0W = A0014;
        C02F A0015 = C02F.A00();
        C02180Ae.A1B(A0015);
        indiaUpiContactPickerFragment.A0n = A0015;
        indiaUpiContactPickerFragment.A0o = C41131tQ.A02();
        C012205z c012205z = C012205z.A00;
        C02180Ae.A1B(c012205z);
        ((ContactPickerFragment) indiaUpiContactPickerFragment).A0j = c012205z;
        C0CA A0016 = C0CA.A00();
        C02180Ae.A1B(A0016);
        indiaUpiContactPickerFragment.A0r = A0016;
        C03730Gv A0017 = C03730Gv.A00();
        C02180Ae.A1B(A0017);
        indiaUpiContactPickerFragment.A0s = A0017;
        C02C A0018 = C02C.A00();
        C02180Ae.A1B(A0018);
        indiaUpiContactPickerFragment.A1E = A0018;
        C0C8 A0019 = C0C8.A00();
        C02180Ae.A1B(A0019);
        indiaUpiContactPickerFragment.A0t = A0019;
        C02O A0020 = C02O.A00();
        C02180Ae.A1B(A0020);
        indiaUpiContactPickerFragment.A16 = A0020;
        ((ContactPickerFragment) indiaUpiContactPickerFragment).A0V = C41141tR.A01();
        indiaUpiContactPickerFragment.A0k = C41211tY.A02();
        C03360Fk c03360Fk = C03360Fk.A00;
        C02180Ae.A1B(c03360Fk);
        indiaUpiContactPickerFragment.A13 = c03360Fk;
        ((PaymentContactPickerFragment) indiaUpiContactPickerFragment).A00 = C41121tP.A00();
        C0DV A0021 = C0DV.A00();
        C02180Ae.A1B(A0021);
        ((PaymentContactPickerFragment) indiaUpiContactPickerFragment).A04 = A0021;
        C0GZ A0022 = C0GZ.A00();
        C02180Ae.A1B(A0022);
        ((PaymentContactPickerFragment) indiaUpiContactPickerFragment).A01 = A0022;
        C0DW A0023 = C0DW.A00();
        C02180Ae.A1B(A0023);
        ((PaymentContactPickerFragment) indiaUpiContactPickerFragment).A03 = A0023;
        ((PaymentContactPickerFragment) indiaUpiContactPickerFragment).A02 = C42001ur.A03();
        indiaUpiContactPickerFragment.A00 = C41131tQ.A00();
        C0DV A0024 = C0DV.A00();
        C02180Ae.A1B(A0024);
        indiaUpiContactPickerFragment.A07 = A0024;
        indiaUpiContactPickerFragment.A01 = C41341tl.A00();
        indiaUpiContactPickerFragment.A05 = C49732Md.A01();
        indiaUpiContactPickerFragment.A06 = C49732Md.A02();
        C013606n A03 = C013606n.A03();
        C02180Ae.A1B(A03);
        indiaUpiContactPickerFragment.A02 = A03;
        indiaUpiContactPickerFragment.A08 = C46X.A03();
        indiaUpiContactPickerFragment.A04 = C42001ur.A05();
        indiaUpiContactPickerFragment.A03 = C46X.A02();
    }

    @Override // X.C0CS
    public void A29(IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment) {
        ((WaFragment) indiaUpiQrCodeScannedDialogFragment).A00 = A00();
        C01B A00 = C01B.A00();
        C02180Ae.A1B(A00);
        indiaUpiQrCodeScannedDialogFragment.A0A = A00;
        indiaUpiQrCodeScannedDialogFragment.A0B = C41131tQ.A03();
        C0GZ A002 = C0GZ.A00();
        C02180Ae.A1B(A002);
        indiaUpiQrCodeScannedDialogFragment.A0D = A002;
        C0GR A003 = C0GR.A00();
        C02180Ae.A1B(A003);
        indiaUpiQrCodeScannedDialogFragment.A0E = A003;
        indiaUpiQrCodeScannedDialogFragment.A0C = C46X.A02();
    }

    @Override // X.C0CS
    public void A2A(IndiaUpiSendPaymentToVpaDialogFragment indiaUpiSendPaymentToVpaDialogFragment) {
        ((WaFragment) indiaUpiSendPaymentToVpaDialogFragment).A00 = A00();
        indiaUpiSendPaymentToVpaDialogFragment.A0H = C2MA.A01();
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        indiaUpiSendPaymentToVpaDialogFragment.A03 = A00;
        indiaUpiSendPaymentToVpaDialogFragment.A07 = C41131tQ.A03();
        indiaUpiSendPaymentToVpaDialogFragment.A0G = C42001ur.A09();
        indiaUpiSendPaymentToVpaDialogFragment.A06 = C41341tl.A00();
        indiaUpiSendPaymentToVpaDialogFragment.A0A = C46X.A01();
        indiaUpiSendPaymentToVpaDialogFragment.A0D = C49732Md.A02();
        C013606n A03 = C013606n.A03();
        C02180Ae.A1B(A03);
        indiaUpiSendPaymentToVpaDialogFragment.A08 = A03;
        indiaUpiSendPaymentToVpaDialogFragment.A09 = C46X.A00();
        indiaUpiSendPaymentToVpaDialogFragment.A0C = C42001ur.A05();
        indiaUpiSendPaymentToVpaDialogFragment.A0B = C46X.A02();
    }

    @Override // X.C0CS
    public void A2B(PaymentBottomSheet paymentBottomSheet) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) paymentBottomSheet).A01 = A00;
        ((WaDialogFragment) paymentBottomSheet).A00 = A00();
    }

    @Override // X.C0CS
    public void A2C(PaymentContactPickerFragment paymentContactPickerFragment) {
        ((WaFragment) paymentContactPickerFragment).A00 = A00();
        paymentContactPickerFragment.A0z = C41121tP.A00();
        paymentContactPickerFragment.A1B = C41371to.A0B();
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        ((ContactPickerFragment) paymentContactPickerFragment).A0F = A00;
        ((ContactPickerFragment) paymentContactPickerFragment).A0G = C41131tQ.A00();
        C03010Du A002 = C03010Du.A00();
        C02180Ae.A1B(A002);
        ((ContactPickerFragment) paymentContactPickerFragment).A0J = A002;
        paymentContactPickerFragment.A1G = C41131tQ.A04();
        C05M A003 = C05M.A00();
        C02180Ae.A1B(A003);
        paymentContactPickerFragment.A0q = A003;
        paymentContactPickerFragment.A11 = C41121tP.A01();
        paymentContactPickerFragment.A0y = C2M8.A00();
        ((ContactPickerFragment) paymentContactPickerFragment).A0H = C41871ue.A00();
        C01B A004 = C01B.A00();
        C02180Ae.A1B(A004);
        ((ContactPickerFragment) paymentContactPickerFragment).A0K = A004;
        C0EB A005 = C0EB.A00();
        C02180Ae.A1B(A005);
        paymentContactPickerFragment.A0w = A005;
        ((ContactPickerFragment) paymentContactPickerFragment).A0L = C2MF.A00();
        C018608r A02 = C018608r.A02();
        C02180Ae.A1B(A02);
        ((ContactPickerFragment) paymentContactPickerFragment).A0N = A02;
        paymentContactPickerFragment.A1H = C41931uk.A03();
        C006602x A006 = C006602x.A00();
        C02180Ae.A1B(A006);
        paymentContactPickerFragment.A1D = A006;
        C0L5 A01 = C0L5.A01();
        C02180Ae.A1B(A01);
        ((ContactPickerFragment) paymentContactPickerFragment).A0Z = A01;
        C05Y A012 = C05Y.A01();
        C02180Ae.A1B(A012);
        paymentContactPickerFragment.A15 = A012;
        paymentContactPickerFragment.A18 = C2MC.A03();
        C018308n A022 = C018308n.A02();
        C02180Ae.A1B(A022);
        ((ContactPickerFragment) paymentContactPickerFragment).A0D = A022;
        ((ContactPickerFragment) paymentContactPickerFragment).A0S = C41141tR.A00();
        paymentContactPickerFragment.A1A = C42141vB.A07();
        paymentContactPickerFragment.A1F = C41371to.A0C();
        paymentContactPickerFragment.A0m = C42041uv.A01();
        C018708s A007 = C018708s.A00();
        C02180Ae.A1B(A007);
        ((ContactPickerFragment) paymentContactPickerFragment).A0X = A007;
        paymentContactPickerFragment.A0p = C41131tQ.A03();
        C0WZ A008 = C0WZ.A00();
        C02180Ae.A1B(A008);
        paymentContactPickerFragment.A0v = A008;
        ((ContactPickerFragment) paymentContactPickerFragment).A0P = C41171tU.A09();
        AnonymousClass008 anonymousClass008 = AnonymousClass008.A01;
        C02180Ae.A1B(anonymousClass008);
        ((ContactPickerFragment) paymentContactPickerFragment).A0U = anonymousClass008;
        ((ContactPickerFragment) paymentContactPickerFragment).A0g = C41211tY.A01();
        AnonymousClass031 A009 = AnonymousClass031.A00();
        C02180Ae.A1B(A009);
        ((ContactPickerFragment) paymentContactPickerFragment).A0E = A009;
        paymentContactPickerFragment.A19 = C2MC.A06();
        C0CB A0010 = C0CB.A00();
        C02180Ae.A1B(A0010);
        paymentContactPickerFragment.A17 = A0010;
        C0HA A0011 = C0HA.A00();
        C02180Ae.A1B(A0011);
        paymentContactPickerFragment.A10 = A0011;
        C0L8 A0012 = C0L8.A00();
        C02180Ae.A1B(A0012);
        ((ContactPickerFragment) paymentContactPickerFragment).A0O = A0012;
        C03320Ff c03320Ff = C03320Ff.A00;
        C02180Ae.A1B(c03320Ff);
        ((ContactPickerFragment) paymentContactPickerFragment).A0R = c03320Ff;
        ((ContactPickerFragment) paymentContactPickerFragment).A0h = C41311ti.A00();
        C05E A0013 = C05E.A00();
        C02180Ae.A1B(A0013);
        paymentContactPickerFragment.A0u = A0013;
        paymentContactPickerFragment.A0l = C41341tl.A00();
        AnonymousClass075 A0014 = AnonymousClass075.A00();
        C02180Ae.A1B(A0014);
        ((ContactPickerFragment) paymentContactPickerFragment).A0W = A0014;
        C02F A0015 = C02F.A00();
        C02180Ae.A1B(A0015);
        paymentContactPickerFragment.A0n = A0015;
        paymentContactPickerFragment.A0o = C41131tQ.A02();
        C012205z c012205z = C012205z.A00;
        C02180Ae.A1B(c012205z);
        ((ContactPickerFragment) paymentContactPickerFragment).A0j = c012205z;
        C0CA A0016 = C0CA.A00();
        C02180Ae.A1B(A0016);
        paymentContactPickerFragment.A0r = A0016;
        C03730Gv A0017 = C03730Gv.A00();
        C02180Ae.A1B(A0017);
        paymentContactPickerFragment.A0s = A0017;
        C02C A0018 = C02C.A00();
        C02180Ae.A1B(A0018);
        paymentContactPickerFragment.A1E = A0018;
        C0C8 A0019 = C0C8.A00();
        C02180Ae.A1B(A0019);
        paymentContactPickerFragment.A0t = A0019;
        C02O A0020 = C02O.A00();
        C02180Ae.A1B(A0020);
        paymentContactPickerFragment.A16 = A0020;
        ((ContactPickerFragment) paymentContactPickerFragment).A0V = C41141tR.A01();
        paymentContactPickerFragment.A0k = C41211tY.A02();
        C03360Fk c03360Fk = C03360Fk.A00;
        C02180Ae.A1B(c03360Fk);
        paymentContactPickerFragment.A13 = c03360Fk;
        paymentContactPickerFragment.A00 = C41121tP.A00();
        C0DV A0021 = C0DV.A00();
        C02180Ae.A1B(A0021);
        paymentContactPickerFragment.A04 = A0021;
        C0GZ A0022 = C0GZ.A00();
        C02180Ae.A1B(A0022);
        paymentContactPickerFragment.A01 = A0022;
        C0DW A0023 = C0DW.A00();
        C02180Ae.A1B(A0023);
        paymentContactPickerFragment.A03 = A0023;
        paymentContactPickerFragment.A02 = C42001ur.A03();
    }

    @Override // X.C0CS
    public void A2D(PaymentMethodsListPickerFragment paymentMethodsListPickerFragment) {
        ((WaFragment) paymentMethodsListPickerFragment).A00 = A00();
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        paymentMethodsListPickerFragment.A00 = A00;
        paymentMethodsListPickerFragment.A01 = C41131tQ.A03();
        C0DV A002 = C0DV.A00();
        C02180Ae.A1B(A002);
        paymentMethodsListPickerFragment.A04 = A002;
        paymentMethodsListPickerFragment.A03 = C42001ur.A01();
        C02180Ae.A1B(C013606n.A03());
    }

    @Override // X.C0CS
    public void A2E(PaymentRailPickerFragment paymentRailPickerFragment) {
        ((WaFragment) paymentRailPickerFragment).A00 = A00();
        C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A2F(PaymentsUnavailableDialogFragment paymentsUnavailableDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) paymentsUnavailableDialogFragment).A01 = A00;
        ((WaDialogFragment) paymentsUnavailableDialogFragment).A00 = A00();
        C018808t A002 = C018808t.A00();
        C02180Ae.A1B(A002);
        paymentsUnavailableDialogFragment.A00 = A002;
    }

    @Override // X.C0CS
    public void A2G(IndiaUpiPaymentInviteFragment indiaUpiPaymentInviteFragment) {
        ((WaFragment) indiaUpiPaymentInviteFragment).A00 = A00();
        C0L5 A01 = C0L5.A01();
        C02180Ae.A1B(A01);
        ((PaymentInviteFragment) indiaUpiPaymentInviteFragment).A04 = A01;
        ((PaymentInviteFragment) indiaUpiPaymentInviteFragment).A02 = C41141tR.A00();
        C018708s A00 = C018708s.A00();
        C02180Ae.A1B(A00);
        ((PaymentInviteFragment) indiaUpiPaymentInviteFragment).A03 = A00;
        ((PaymentInviteFragment) indiaUpiPaymentInviteFragment).A05 = C42001ur.A04();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        indiaUpiPaymentInviteFragment.A00 = A002;
        indiaUpiPaymentInviteFragment.A01 = C41131tQ.A00();
        indiaUpiPaymentInviteFragment.A03 = C41131tQ.A03();
        C0DV A003 = C0DV.A00();
        C02180Ae.A1B(A003);
        indiaUpiPaymentInviteFragment.A08 = A003;
        indiaUpiPaymentInviteFragment.A02 = C41341tl.A00();
        indiaUpiPaymentInviteFragment.A07 = C49732Md.A02();
        C013606n A03 = C013606n.A03();
        C02180Ae.A1B(A03);
        indiaUpiPaymentInviteFragment.A04 = A03;
        indiaUpiPaymentInviteFragment.A09 = C46X.A03();
        indiaUpiPaymentInviteFragment.A06 = C42001ur.A05();
        indiaUpiPaymentInviteFragment.A05 = C46X.A02();
    }

    @Override // X.C0CS
    public void A2H(MandatePaymentBottomSheetFragment mandatePaymentBottomSheetFragment) {
        ((WaFragment) mandatePaymentBottomSheetFragment).A00 = A00();
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        mandatePaymentBottomSheetFragment.A0B = A00;
        mandatePaymentBottomSheetFragment.A0N = C41131tQ.A04();
        mandatePaymentBottomSheetFragment.A0D = C41131tQ.A03();
        mandatePaymentBottomSheetFragment.A0M = C42001ur.A09();
        C0DV A002 = C0DV.A00();
        C02180Ae.A1B(A002);
        mandatePaymentBottomSheetFragment.A0J = A002;
        C0VZ A003 = C0VZ.A00();
        C02180Ae.A1B(A003);
        mandatePaymentBottomSheetFragment.A0L = A003;
        mandatePaymentBottomSheetFragment.A0C = C41341tl.A00();
        mandatePaymentBottomSheetFragment.A0I = C49732Md.A02();
        mandatePaymentBottomSheetFragment.A0G = C42001ur.A05();
        C0EX c0ex = C0EX.A00;
        C02180Ae.A1B(c0ex);
        mandatePaymentBottomSheetFragment.A0H = c0ex;
    }

    @Override // X.C0CS
    public void A2I(ConnectionProgressDialogFragment connectionProgressDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) connectionProgressDialogFragment).A01 = A00;
        ((WaDialogFragment) connectionProgressDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A2J(ConnectionUnavailableDialogFragment connectionUnavailableDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) connectionUnavailableDialogFragment).A01 = A00;
        ((WaDialogFragment) connectionUnavailableDialogFragment).A00 = A00();
        connectionUnavailableDialogFragment.A05 = C41131tQ.A04();
        connectionUnavailableDialogFragment.A01 = C42041uv.A01();
        C018808t A002 = C018808t.A00();
        C02180Ae.A1B(A002);
        connectionUnavailableDialogFragment.A03 = A002;
        connectionUnavailableDialogFragment.A00 = C41341tl.A00();
        C02F A003 = C02F.A00();
        C02180Ae.A1B(A003);
        connectionUnavailableDialogFragment.A02 = A003;
        connectionUnavailableDialogFragment.A04 = C41871ue.A07();
    }

    @Override // X.C0CS
    public void A2K(MatchPhoneNumberFragment matchPhoneNumberFragment) {
        ((WaFragment) matchPhoneNumberFragment).A00 = A00();
        C006602x A00 = C006602x.A00();
        C02180Ae.A1B(A00);
        ((CountryAndPhoneNumberFragment) matchPhoneNumberFragment).A0C = A00;
        ((CountryAndPhoneNumberFragment) matchPhoneNumberFragment).A0A = C41131tQ.A03();
        AnonymousClass031 A002 = AnonymousClass031.A00();
        C02180Ae.A1B(A002);
        ((CountryAndPhoneNumberFragment) matchPhoneNumberFragment).A07 = A002;
        matchPhoneNumberFragment.A00 = C41131tQ.A00();
        C0EG A003 = C0EG.A00();
        C02180Ae.A1B(A003);
        matchPhoneNumberFragment.A02 = A003;
        matchPhoneNumberFragment.A04 = C41871ue.A08();
    }

    @Override // X.C0CS
    public void A2L(GifSearchDialogFragment gifSearchDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) gifSearchDialogFragment).A01 = A00;
        ((WaDialogFragment) gifSearchDialogFragment).A00 = A00();
        gifSearchDialogFragment.A08 = C42111v7.A03();
        gifSearchDialogFragment.A0C = C2MA.A01();
        gifSearchDialogFragment.A07 = C41121tP.A01();
        C01B A002 = C01B.A00();
        C02180Ae.A1B(A002);
        gifSearchDialogFragment.A04 = A002;
        gifSearchDialogFragment.A06 = C42041uv.A01();
        C02O A003 = C02O.A00();
        C02180Ae.A1B(A003);
        gifSearchDialogFragment.A0B = A003;
        gifSearchDialogFragment.A0A = C42111v7.A05();
    }

    @Override // X.C0CS
    public void A2M(StickerSearchDialogFragment stickerSearchDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) stickerSearchDialogFragment).A01 = A00;
        ((WaDialogFragment) stickerSearchDialogFragment).A00 = A00();
        stickerSearchDialogFragment.A07 = C41121tP.A00();
        stickerSearchDialogFragment.A08 = C41121tP.A01();
        stickerSearchDialogFragment.A0B = C41871ue.A0A();
        C41131tQ.A03();
        stickerSearchDialogFragment.A06 = C42141vB.A03();
    }

    @Override // X.C0CS
    public void A2N(StickerSearchTabFragment stickerSearchTabFragment) {
        ((WaFragment) stickerSearchTabFragment).A00 = A00();
        stickerSearchTabFragment.A02 = C41121tP.A00();
    }

    @Override // X.C0CS
    public void A2O(ResetGroupPhoto.ConfirmDialogFragment confirmDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) confirmDialogFragment).A01 = A00;
        ((WaDialogFragment) confirmDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A2P(ResetProfilePhoto.ConfirmDialogFragment confirmDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) confirmDialogFragment).A01 = A00;
        ((WaDialogFragment) confirmDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A2Q(QrEducationDialogFragment qrEducationDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) qrEducationDialogFragment).A01 = A00;
        ((WaDialogFragment) qrEducationDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A2R(BaseQrActivity$RevokeCodeDialogFragment baseQrActivity$RevokeCodeDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) baseQrActivity$RevokeCodeDialogFragment).A01 = A00;
        ((WaDialogFragment) baseQrActivity$RevokeCodeDialogFragment).A00 = A00();
        C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A2S(BaseQrActivity$TryAgainDialogFragment baseQrActivity$TryAgainDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) baseQrActivity$TryAgainDialogFragment).A01 = A00;
        ((WaDialogFragment) baseQrActivity$TryAgainDialogFragment).A00 = A00();
        C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A2T(ContactQrMyCodeFragment contactQrMyCodeFragment) {
        ((WaFragment) contactQrMyCodeFragment).A00 = A00();
        contactQrMyCodeFragment.A00 = C41131tQ.A00();
    }

    @Override // X.C0CS
    public void A2U(ErrorDialogFragment errorDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) errorDialogFragment).A01 = A00;
        ((WaDialogFragment) errorDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A2V(QrScanCodeFragment qrScanCodeFragment) {
        ((WaFragment) qrScanCodeFragment).A00 = A00();
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        qrScanCodeFragment.A02 = A00;
        C0L6 A002 = C0L6.A00();
        C02180Ae.A1B(A002);
        qrScanCodeFragment.A06 = A002;
        C41131tQ.A03();
        qrScanCodeFragment.A03 = C41131tQ.A02();
    }

    @Override // X.C0CS
    public void A2W(ScannedCodeDialogFragment scannedCodeDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((RoundedBottomSheetDialogFragment) scannedCodeDialogFragment).A00 = A00;
        C41131tQ.A01();
        scannedCodeDialogFragment.A05 = C41131tQ.A00();
        scannedCodeDialogFragment.A0Q = C41131tQ.A04();
        scannedCodeDialogFragment.A0K = C41121tP.A01();
        scannedCodeDialogFragment.A0J = C2M8.A00();
        C01B A002 = C01B.A00();
        C02180Ae.A1B(A002);
        scannedCodeDialogFragment.A06 = A002;
        scannedCodeDialogFragment.A04 = A00();
        C0L5 A01 = C0L5.A01();
        C02180Ae.A1B(A01);
        scannedCodeDialogFragment.A0D = A01;
        scannedCodeDialogFragment.A07 = C41141tR.A00();
        scannedCodeDialogFragment.A0F = C42041uv.A01();
        C018708s A003 = C018708s.A00();
        C02180Ae.A1B(A003);
        scannedCodeDialogFragment.A0B = A003;
        scannedCodeDialogFragment.A0H = C41131tQ.A03();
        AnonymousClass008 anonymousClass008 = AnonymousClass008.A01;
        C02180Ae.A1B(anonymousClass008);
        scannedCodeDialogFragment.A08 = anonymousClass008;
        scannedCodeDialogFragment.A0N = C2MC.A06();
        scannedCodeDialogFragment.A0P = C41171tU.A0B();
        scannedCodeDialogFragment.A0E = C41311ti.A00();
        AnonymousClass075 A004 = AnonymousClass075.A00();
        C02180Ae.A1B(A004);
        scannedCodeDialogFragment.A0A = A004;
        C02F A005 = C02F.A00();
        C02180Ae.A1B(A005);
        scannedCodeDialogFragment.A0G = A005;
        scannedCodeDialogFragment.A09 = C41141tR.A01();
    }

    @Override // X.C0CS
    public void A2X(WebCodeDialogFragment webCodeDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) webCodeDialogFragment).A01 = A00;
        ((WaDialogFragment) webCodeDialogFragment).A00 = A00();
        C01B A002 = C01B.A00();
        C02180Ae.A1B(A002);
        webCodeDialogFragment.A00 = A002;
        C0EE A003 = C0EE.A00();
        C02180Ae.A1B(A003);
        webCodeDialogFragment.A01 = A003;
    }

    @Override // X.C0CS
    public void A2Y(SelectPhoneNumberDialog selectPhoneNumberDialog) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) selectPhoneNumberDialog).A01 = A00;
        ((WaDialogFragment) selectPhoneNumberDialog).A00 = A00();
        selectPhoneNumberDialog.A01 = C41131tQ.A03();
        AnonymousClass031 A002 = AnonymousClass031.A00();
        C02180Ae.A1B(A002);
        selectPhoneNumberDialog.A00 = A002;
    }

    @Override // X.C0CS
    public void A2Z(VerifyTwoFactorAuth.ConfirmResetCode confirmResetCode) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) confirmResetCode).A01 = A00;
        ((WaDialogFragment) confirmResetCode).A00 = A00();
        confirmResetCode.A00 = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A2a(VerifyTwoFactorAuth.ConfirmWipe confirmWipe) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) confirmWipe).A01 = A00;
        ((WaDialogFragment) confirmWipe).A00 = A00();
    }

    @Override // X.C0CS
    public void A2b(DeleteReportConfirmationDialogFragment deleteReportConfirmationDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) deleteReportConfirmationDialogFragment).A01 = A00;
        ((WaDialogFragment) deleteReportConfirmationDialogFragment).A00 = A00();
        deleteReportConfirmationDialogFragment.A00 = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A2c(ShareReportConfirmationDialogFragment shareReportConfirmationDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) shareReportConfirmationDialogFragment).A01 = A00;
        ((WaDialogFragment) shareReportConfirmationDialogFragment).A00 = A00();
        C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A2d(SearchFragment searchFragment) {
        ((WaFragment) searchFragment).A00 = A00();
        searchFragment.A0X = C41131tQ.A01();
        searchFragment.A0q = C41121tP.A00();
        searchFragment.A1C = C41371to.A0B();
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        searchFragment.A09 = A00;
        C02980Dr A002 = C02980Dr.A00();
        C02180Ae.A1B(A002);
        searchFragment.A0y = A002;
        AbstractC000600i A003 = AbstractC000600i.A00();
        C02180Ae.A1B(A003);
        searchFragment.A08 = A003;
        searchFragment.A0A = C41131tQ.A00();
        C001200o c001200o = C001200o.A01;
        C02180Ae.A1B(c001200o);
        searchFragment.A0Y = c001200o;
        searchFragment.A1H = C41131tQ.A04();
        C05M A004 = C05M.A00();
        C02180Ae.A1B(A004);
        searchFragment.A0d = A004;
        searchFragment.A1B = C2MC.A07();
        searchFragment.A0s = C41121tP.A01();
        searchFragment.A0c = C41171tU.A0A();
        searchFragment.A0p = C2M8.A00();
        C003401q A005 = C003401q.A00();
        C02180Ae.A1B(A005);
        searchFragment.A1G = A005;
        C01B A006 = C01B.A00();
        C02180Ae.A1B(A006);
        searchFragment.A0B = A006;
        searchFragment.A0K = C2MF.A01();
        C018608r A02 = C018608r.A02();
        C02180Ae.A1B(A02);
        searchFragment.A0D = A02;
        searchFragment.A1J = C41931uk.A03();
        C018308n A022 = C018308n.A02();
        C02180Ae.A1B(A022);
        searchFragment.A05 = A022;
        C0L5 A01 = C0L5.A01();
        C02180Ae.A1B(A01);
        searchFragment.A0R = A01;
        searchFragment.A0x = C41371to.A04();
        C05Y A012 = C05Y.A01();
        C02180Ae.A1B(A012);
        searchFragment.A0z = A012;
        C03750Gx A023 = C03750Gx.A02();
        C02180Ae.A1B(A023);
        searchFragment.A12 = A023;
        C0L7 A024 = C0L7.A02();
        C02180Ae.A1B(A024);
        searchFragment.A0L = A024;
        searchFragment.A0M = C41141tR.A00();
        searchFragment.A07 = C41211tY.A00();
        C0GK A007 = C0GK.A00();
        C02180Ae.A1B(A007);
        searchFragment.A0g = A007;
        searchFragment.A0W = C42041uv.A01();
        C018708s A008 = C018708s.A00();
        C02180Ae.A1B(A008);
        searchFragment.A0O = A008;
        searchFragment.A10 = C41311ti.A03();
        searchFragment.A0b = C41131tQ.A03();
        C0WZ A009 = C0WZ.A00();
        C02180Ae.A1B(A009);
        searchFragment.A0l = A009;
        searchFragment.A0I = C41171tU.A09();
        C03300Fd A0010 = C03300Fd.A00();
        C02180Ae.A1B(A0010);
        searchFragment.A0r = A0010;
        C0ES A0011 = C0ES.A00();
        C02180Ae.A1B(A0011);
        searchFragment.A0t = A0011;
        C03180Eq A0012 = C03180Eq.A00();
        C02180Ae.A1B(A0012);
        searchFragment.A0k = A0012;
        searchFragment.A1A = C2MC.A06();
        C0CB A0013 = C0CB.A00();
        C02180Ae.A1B(A0013);
        searchFragment.A19 = A0013;
        C0L8 A0014 = C0L8.A00();
        C02180Ae.A1B(A0014);
        searchFragment.A0E = A0014;
        searchFragment.A1E = C41171tU.A0B();
        C03320Ff c03320Ff = C03320Ff.A00;
        C02180Ae.A1B(c03320Ff);
        searchFragment.A0J = c03320Ff;
        C011505r A0015 = C011505r.A00();
        C02180Ae.A1B(A0015);
        searchFragment.A0P = A0015;
        searchFragment.A0S = C41311ti.A00();
        C00B A0016 = C00B.A00();
        C02180Ae.A1B(A0016);
        searchFragment.A0n = A0016;
        searchFragment.A0o = C41411ts.A00();
        searchFragment.A0a = C41131tQ.A02();
        searchFragment.A11 = C41371to.A09();
        C06L A0017 = C06L.A00();
        C02180Ae.A1B(A0017);
        searchFragment.A0H = A0017;
        searchFragment.A0m = C2MC.A01();
        C06K A0018 = C06K.A00();
        C02180Ae.A1B(A0018);
        searchFragment.A0F = A0018;
        searchFragment.A0T = C41211tY.A03();
        C06M c06m = C06M.A00;
        C02180Ae.A1B(c06m);
        searchFragment.A0G = c06m;
        searchFragment.A1F = C41211tY.A05();
        C0C8 A0019 = C0C8.A00();
        C02180Ae.A1B(A0019);
        searchFragment.A0j = A0019;
        C02O A0020 = C02O.A00();
        C02180Ae.A1B(A0020);
        searchFragment.A13 = A0020;
        C03360Fk c03360Fk = C03360Fk.A00;
        C02180Ae.A1B(c03360Fk);
        searchFragment.A0u = c03360Fk;
        C02F A0021 = C02F.A00();
        C02180Ae.A1B(A0021);
        searchFragment.A0Z = A0021;
        searchFragment.A0w = C41311ti.A01();
        C0LM A0022 = C0LM.A00();
        C02180Ae.A1B(A0022);
        searchFragment.A0C = A0022;
        C0DK A0023 = C0DK.A00();
        C02180Ae.A1B(A0023);
        searchFragment.A0e = A0023;
        C0GV A0024 = C0GV.A00();
        C02180Ae.A1B(A0024);
        searchFragment.A0i = A0024;
        searchFragment.A0h = C42141vB.A02();
        C41371to.A00();
        C03120Eg A0025 = C03120Eg.A00();
        C02180Ae.A1B(A0025);
        searchFragment.A0U = A0025;
        AnonymousClass008 anonymousClass008 = AnonymousClass008.A01;
        C02180Ae.A1B(anonymousClass008);
        searchFragment.A0N = anonymousClass008;
        C03340Fh c03340Fh = C03340Fh.A00;
        C02180Ae.A1B(c03340Fh);
        searchFragment.A0f = c03340Fh;
    }

    @Override // X.C0CS
    public void A2e(MultiSelectionDialogFragment multiSelectionDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) multiSelectionDialogFragment).A01 = A00;
        ((WaDialogFragment) multiSelectionDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A2f(SettingsChatHistoryFragment settingsChatHistoryFragment) {
        settingsChatHistoryFragment.A09 = C41131tQ.A04();
        C2M8.A00();
        C01B A00 = C01B.A00();
        C02180Ae.A1B(A00);
        settingsChatHistoryFragment.A01 = A00;
        C018608r A02 = C018608r.A02();
        C02180Ae.A1B(A02);
        settingsChatHistoryFragment.A02 = A02;
        settingsChatHistoryFragment.A03 = C41141tR.A00();
        settingsChatHistoryFragment.A04 = C42141vB.A00();
        C000400f A002 = C000400f.A00();
        C02180Ae.A1B(A002);
        settingsChatHistoryFragment.A05 = A002;
        C41131tQ.A02();
        C0CA A003 = C0CA.A00();
        C02180Ae.A1B(A003);
        settingsChatHistoryFragment.A06 = A003;
        C018508q A004 = C018508q.A00();
        C02180Ae.A1B(A004);
        settingsChatHistoryFragment.A00 = A004;
        settingsChatHistoryFragment.A08 = C41211tY.A05();
    }

    @Override // X.C0CS
    public void A2g(SettingsJidNotificationFragment settingsJidNotificationFragment) {
        settingsJidNotificationFragment.A03 = C2M8.A00();
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        settingsJidNotificationFragment.A00 = A02;
        settingsJidNotificationFragment.A06 = C42141vB.A07();
        C0CB A00 = C0CB.A00();
        C02180Ae.A1B(A00);
        settingsJidNotificationFragment.A05 = A00;
        C0L8 A002 = C0L8.A00();
        C02180Ae.A1B(A002);
        settingsJidNotificationFragment.A01 = A002;
        settingsJidNotificationFragment.A02 = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A2h(SettingsNetworkUsage.ResetUsageConfirmationDialog resetUsageConfirmationDialog) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) resetUsageConfirmationDialog).A01 = A00;
        ((WaDialogFragment) resetUsageConfirmationDialog).A00 = A00();
    }

    @Override // X.C0CS
    public void A2i(WallpaperDownloadFailedDialogFragment wallpaperDownloadFailedDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) wallpaperDownloadFailedDialogFragment).A01 = A00;
        ((WaDialogFragment) wallpaperDownloadFailedDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A2j(WallpaperSetConfirmationDialogFragment wallpaperSetConfirmationDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) wallpaperSetConfirmationDialogFragment).A01 = A00;
        ((WaDialogFragment) wallpaperSetConfirmationDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A2k(FirstStatusConfirmationDialogFragment firstStatusConfirmationDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) firstStatusConfirmationDialogFragment).A01 = A00;
        ((WaDialogFragment) firstStatusConfirmationDialogFragment).A00 = A00();
        C0EB A002 = C0EB.A00();
        C02180Ae.A1B(A002);
        firstStatusConfirmationDialogFragment.A03 = A002;
        C0E6 A003 = C0E6.A00();
        C02180Ae.A1B(A003);
        firstStatusConfirmationDialogFragment.A01 = A003;
        firstStatusConfirmationDialogFragment.A02 = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A2l(StatusConfirmMuteDialogFragment statusConfirmMuteDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) statusConfirmMuteDialogFragment).A01 = A00;
        ((WaDialogFragment) statusConfirmMuteDialogFragment).A00 = A00();
        statusConfirmMuteDialogFragment.A03 = A03();
        statusConfirmMuteDialogFragment.A00 = C41141tR.A00();
        C018708s A002 = C018708s.A00();
        C02180Ae.A1B(A002);
        statusConfirmMuteDialogFragment.A01 = A002;
        C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A2m(StatusConfirmUnmuteDialogFragment statusConfirmUnmuteDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) statusConfirmUnmuteDialogFragment).A01 = A00;
        ((WaDialogFragment) statusConfirmUnmuteDialogFragment).A00 = A00();
        statusConfirmUnmuteDialogFragment.A03 = A03();
        statusConfirmUnmuteDialogFragment.A00 = C41141tR.A00();
        C018708s A002 = C018708s.A00();
        C02180Ae.A1B(A002);
        statusConfirmUnmuteDialogFragment.A01 = A002;
        C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A2n(StatusDeleteDialogFragment statusDeleteDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) statusDeleteDialogFragment).A01 = A00;
        ((WaDialogFragment) statusDeleteDialogFragment).A00 = A00();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        statusDeleteDialogFragment.A00 = A002;
        statusDeleteDialogFragment.A04 = C2M8.A00();
        C018608r A02 = C018608r.A02();
        C02180Ae.A1B(A02);
        statusDeleteDialogFragment.A01 = A02;
        statusDeleteDialogFragment.A02 = C41131tQ.A03();
        C0C9 A003 = C0C9.A00();
        C02180Ae.A1B(A003);
        statusDeleteDialogFragment.A03 = A003;
    }

    @Override // X.C0CS
    public void A2o(StatusesFragment statusesFragment) {
        C53092bs c53092bs;
        ((WaListFragment) statusesFragment).A00 = A00();
        statusesFragment.A0H = C41131tQ.A01();
        statusesFragment.A0Q = C41121tP.A00();
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        statusesFragment.A04 = A00;
        statusesFragment.A05 = C41131tQ.A00();
        C001200o c001200o = C001200o.A01;
        C02180Ae.A1B(c001200o);
        statusesFragment.A0I = c001200o;
        statusesFragment.A0k = C41131tQ.A04();
        statusesFragment.A0R = C41121tP.A01();
        statusesFragment.A0P = C2M8.A00();
        C01B A002 = C01B.A00();
        C02180Ae.A1B(A002);
        statusesFragment.A06 = A002;
        C0EB A003 = C0EB.A00();
        C02180Ae.A1B(A003);
        statusesFragment.A0O = A003;
        statusesFragment.A07 = C2MF.A00();
        C0L5 A01 = C0L5.A01();
        C02180Ae.A1B(A01);
        statusesFragment.A0E = A01;
        C0L7 A02 = C0L7.A02();
        C02180Ae.A1B(A02);
        statusesFragment.A09 = A02;
        statusesFragment.A0A = C41141tR.A00();
        statusesFragment.A0G = C42041uv.A01();
        C018708s A004 = C018708s.A00();
        C02180Ae.A1B(A004);
        statusesFragment.A0C = A004;
        statusesFragment.A0L = C41131tQ.A03();
        AnonymousClass008 anonymousClass008 = AnonymousClass008.A01;
        C02180Ae.A1B(anonymousClass008);
        statusesFragment.A0B = anonymousClass008;
        C00A c00a = C00A.A00;
        C02180Ae.A1B(c00a);
        statusesFragment.A0M = c00a;
        statusesFragment.A0V = C2MC.A06();
        C0CB A005 = C0CB.A00();
        C02180Ae.A1B(A005);
        statusesFragment.A0U = A005;
        C000400f A006 = C000400f.A00();
        C02180Ae.A1B(A006);
        statusesFragment.A0F = A006;
        statusesFragment.A0j = C41371to.A0D();
        C03320Ff c03320Ff = C03320Ff.A00;
        C02180Ae.A1B(c03320Ff);
        statusesFragment.A08 = c03320Ff;
        statusesFragment.A0N = C2MC.A02();
        C47252Am A007 = C47252Am.A00();
        C02180Ae.A1B(A007);
        statusesFragment.A0e = A007;
        C02F A008 = C02F.A00();
        C02180Ae.A1B(A008);
        statusesFragment.A0J = A008;
        statusesFragment.A0K = C41131tQ.A02();
        C03330Fg c03330Fg = C03330Fg.A00;
        C02180Ae.A1B(c03330Fg);
        statusesFragment.A0X = c03330Fg;
        C2DC A009 = C2DC.A00();
        C02180Ae.A1B(A009);
        statusesFragment.A0f = A009;
        statusesFragment.A0c = C2MF.A03();
        C53132bw A0010 = C53132bw.A00();
        C02180Ae.A1B(A0010);
        statusesFragment.A0g = A0010;
        C02O A0011 = C02O.A00();
        C02180Ae.A1B(A0011);
        statusesFragment.A0T = A0011;
        C0Oi A0012 = C0Oi.A00();
        C02180Ae.A1B(A0012);
        statusesFragment.A03 = A0012;
        C03360Fk c03360Fk = C03360Fk.A00;
        C02180Ae.A1B(c03360Fk);
        statusesFragment.A0S = c03360Fk;
        synchronized (C53092bs.class) {
            if (C53092bs.A03 == null && C53092bs.A03 == null) {
                C53092bs.A03 = new C53092bs(C003701t.A00(), C42451vl.A00(), C23L.A00());
            }
            c53092bs = C53092bs.A03;
        }
        C02180Ae.A1B(c53092bs);
        statusesFragment.A0h = c53092bs;
    }

    @Override // X.C0CS
    public void A2p(StatusPlaybackContactFragment statusPlaybackContactFragment) {
        ((WaFragment) statusPlaybackContactFragment).A00 = A00();
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        ((StatusPlaybackBaseFragment) statusPlaybackContactFragment).A00 = A00;
        ((StatusPlaybackBaseFragment) statusPlaybackContactFragment).A01 = C42041uv.A01();
        ((StatusPlaybackBaseFragment) statusPlaybackContactFragment).A02 = C41131tQ.A03();
        C2Q5 A002 = C2Q5.A00();
        C02180Ae.A1B(A002);
        ((StatusPlaybackBaseFragment) statusPlaybackContactFragment).A05 = A002;
        statusPlaybackContactFragment.A0D = C41131tQ.A01();
        C018508q A003 = C018508q.A00();
        C02180Ae.A1B(A003);
        statusPlaybackContactFragment.A02 = A003;
        statusPlaybackContactFragment.A03 = C41131tQ.A00();
        C03010Du A004 = C03010Du.A00();
        C02180Ae.A1B(A004);
        statusPlaybackContactFragment.A04 = A004;
        statusPlaybackContactFragment.A0R = C41131tQ.A04();
        C01B A005 = C01B.A00();
        C02180Ae.A1B(A005);
        statusPlaybackContactFragment.A05 = A005;
        C0EB A006 = C0EB.A00();
        C02180Ae.A1B(A006);
        statusPlaybackContactFragment.A0I = A006;
        C018608r A02 = C018608r.A02();
        C02180Ae.A1B(A02);
        statusPlaybackContactFragment.A06 = A02;
        C0L5 A01 = C0L5.A01();
        C02180Ae.A1B(A01);
        statusPlaybackContactFragment.A0C = A01;
        statusPlaybackContactFragment.A0O = A03();
        statusPlaybackContactFragment.A08 = C41141tR.A00();
        C018708s A007 = C018708s.A00();
        C02180Ae.A1B(A007);
        statusPlaybackContactFragment.A0A = A007;
        statusPlaybackContactFragment.A0E = C41131tQ.A03();
        AnonymousClass008 anonymousClass008 = AnonymousClass008.A01;
        C02180Ae.A1B(anonymousClass008);
        statusPlaybackContactFragment.A09 = anonymousClass008;
        C0C9 A008 = C0C9.A00();
        C02180Ae.A1B(A008);
        statusPlaybackContactFragment.A0F = A008;
        C00A c00a = C00A.A00;
        C02180Ae.A1B(c00a);
        statusPlaybackContactFragment.A0G = c00a;
        statusPlaybackContactFragment.A0N = C2MC.A06();
        C0CB A009 = C0CB.A00();
        C02180Ae.A1B(A009);
        statusPlaybackContactFragment.A0M = A009;
        C03320Ff c03320Ff = C03320Ff.A00;
        C02180Ae.A1B(c03320Ff);
        statusPlaybackContactFragment.A07 = c03320Ff;
        statusPlaybackContactFragment.A0H = C2MC.A02();
        if (C53352fk.A0S == null) {
            synchronized (C53352fk.class) {
                if (C53352fk.A0S == null) {
                    C53352fk.A0S = new C53352fk(AnonymousClass012.A00(), C003701t.A00(), C42461vm.A00(), C018508q.A00(), C03010Du.A00(), C002801j.A00(), C0EB.A00(), C018608r.A02(), C018308n.A02(), C0L5.A01(), C41471ty.A00(), C05W.A00(), C42761wH.A00(), C018708s.A00(), C002301c.A00(), C42441vk.A01, anonymousClass008, C0C9.A00(), c00a, C0CB.A00(), c03320Ff, C000500h.A00(), C2MV.A00(), C2EQ.A00(), C53132bw.A00(), C41771uU.A00(), C03360Fk.A00, C53362fl.A00());
                }
            }
        }
        C53352fk c53352fk = C53352fk.A0S;
        C02180Ae.A1B(c53352fk);
        statusPlaybackContactFragment.A0Q = c53352fk;
        C03360Fk c03360Fk = C03360Fk.A00;
        C02180Ae.A1B(c03360Fk);
        statusPlaybackContactFragment.A0J = c03360Fk;
    }

    @Override // X.C0CS
    public void A2q(StatusPlaybackFragment statusPlaybackFragment) {
        ((WaFragment) statusPlaybackFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A2r(AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) addStickerPackDialogFragment).A01 = A00;
        ((WaDialogFragment) addStickerPackDialogFragment).A00 = A00();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        addStickerPackDialogFragment.A00 = A002;
        addStickerPackDialogFragment.A01 = C41131tQ.A03();
        addStickerPackDialogFragment.A02 = C2MF.A05();
        addStickerPackDialogFragment.A03 = C2MF.A06();
    }

    @Override // X.C0CS
    public void A2s(ConfirmPackDeleteDialogFragment confirmPackDeleteDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) confirmPackDeleteDialogFragment).A01 = A00;
        ((WaDialogFragment) confirmPackDeleteDialogFragment).A00 = A00();
        confirmPackDeleteDialogFragment.A00 = C2MF.A06();
    }

    @Override // X.C0CS
    public void A2t(RemoveStickerFromFavoritesDialogFragment removeStickerFromFavoritesDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) removeStickerFromFavoritesDialogFragment).A01 = A00;
        ((WaDialogFragment) removeStickerFromFavoritesDialogFragment).A00 = A00();
        removeStickerFromFavoritesDialogFragment.A01 = C2MF.A06();
    }

    @Override // X.C0CS
    public void A2u(StarOrRemoveFromRecentsStickerDialogFragment starOrRemoveFromRecentsStickerDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) starOrRemoveFromRecentsStickerDialogFragment).A01 = A00;
        ((WaDialogFragment) starOrRemoveFromRecentsStickerDialogFragment).A00 = A00();
        starOrRemoveFromRecentsStickerDialogFragment.A00 = C41871ue.A0A();
        starOrRemoveFromRecentsStickerDialogFragment.A02 = C2MF.A06();
    }

    @Override // X.C0CS
    public void A2v(StarStickerFromPickerDialogFragment starStickerFromPickerDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) starStickerFromPickerDialogFragment).A01 = A00;
        ((WaDialogFragment) starStickerFromPickerDialogFragment).A00 = A00();
        starStickerFromPickerDialogFragment.A04 = C41131tQ.A04();
        starStickerFromPickerDialogFragment.A03 = C2MF.A06();
        C0F2 A002 = C0F2.A00();
        C02180Ae.A1B(A002);
        starStickerFromPickerDialogFragment.A00 = A002;
    }

    @Override // X.C0CS
    public void A2w(StickerInfoDialogFragment stickerInfoDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) stickerInfoDialogFragment).A01 = A00;
        ((WaDialogFragment) stickerInfoDialogFragment).A00 = A00();
        stickerInfoDialogFragment.A0G = C41131tQ.A04();
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        stickerInfoDialogFragment.A09 = A02;
        stickerInfoDialogFragment.A0D = C2MF.A06();
        C2ER c2er = C2ER.A00;
        C02180Ae.A1B(c2er);
        stickerInfoDialogFragment.A0F = c2er;
    }

    @Override // X.C0CS
    public void A2x(StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment) {
        ((WaFragment) stickerStoreFeaturedTabFragment).A00 = A00();
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        ((StickerStoreTabFragment) stickerStoreFeaturedTabFragment).A05 = A00;
        ((StickerStoreTabFragment) stickerStoreFeaturedTabFragment).A06 = C41131tQ.A03();
        ((StickerStoreTabFragment) stickerStoreFeaturedTabFragment).A08 = C2MF.A05();
        ((StickerStoreTabFragment) stickerStoreFeaturedTabFragment).A09 = C2MF.A06();
        ((StickerStoreTabFragment) stickerStoreFeaturedTabFragment).A07 = C2MF.A04();
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        stickerStoreFeaturedTabFragment.A01 = A02;
    }

    @Override // X.C0CS
    public void A2y(StickerStoreMyTabFragment stickerStoreMyTabFragment) {
        ((WaFragment) stickerStoreMyTabFragment).A00 = A00();
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        ((StickerStoreTabFragment) stickerStoreMyTabFragment).A05 = A00;
        ((StickerStoreTabFragment) stickerStoreMyTabFragment).A06 = C41131tQ.A03();
        ((StickerStoreTabFragment) stickerStoreMyTabFragment).A08 = C2MF.A05();
        ((StickerStoreTabFragment) stickerStoreMyTabFragment).A09 = C2MF.A06();
        ((StickerStoreTabFragment) stickerStoreMyTabFragment).A07 = C2MF.A04();
        stickerStoreMyTabFragment.A03 = C41131tQ.A04();
    }

    @Override // X.C0CS
    public void A2z(StickerStoreTabFragment stickerStoreTabFragment) {
        ((WaFragment) stickerStoreTabFragment).A00 = A00();
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        stickerStoreTabFragment.A05 = A00;
        stickerStoreTabFragment.A06 = C41131tQ.A03();
        stickerStoreTabFragment.A08 = C2MF.A05();
        stickerStoreTabFragment.A09 = C2MF.A06();
        stickerStoreTabFragment.A07 = C2MF.A04();
    }

    @Override // X.C0CS
    public void A30(ThirdPartyPackPage$StickerBlockedDialogFragment thirdPartyPackPage$StickerBlockedDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) thirdPartyPackPage$StickerBlockedDialogFragment).A01 = A00;
        ((WaDialogFragment) thirdPartyPackPage$StickerBlockedDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A31(StorageUsageDeleteCompleteDialogFragment storageUsageDeleteCompleteDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) storageUsageDeleteCompleteDialogFragment).A01 = A00;
        ((WaDialogFragment) storageUsageDeleteCompleteDialogFragment).A00 = A00();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        storageUsageDeleteCompleteDialogFragment.A00 = A002;
        storageUsageDeleteCompleteDialogFragment.A01 = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A32(StorageUsageDeleteMessagesDialogFragment storageUsageDeleteMessagesDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) storageUsageDeleteMessagesDialogFragment).A01 = A00;
        ((WaDialogFragment) storageUsageDeleteMessagesDialogFragment).A00 = A00();
        storageUsageDeleteMessagesDialogFragment.A03 = C41131tQ.A04();
        C018608r A02 = C018608r.A02();
        C02180Ae.A1B(A02);
        storageUsageDeleteMessagesDialogFragment.A00 = A02;
        storageUsageDeleteMessagesDialogFragment.A01 = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A33(StorageUsageGallerySortBottomSheet storageUsageGallerySortBottomSheet) {
        C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A34(StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment) {
        ((WaFragment) storageUsageMediaGalleryFragment).A00 = A00();
        C011605s A00 = C011605s.A00();
        C02180Ae.A1B(A00);
        ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A09 = A00;
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A07 = A002;
        C001200o c001200o = C001200o.A01;
        C02180Ae.A1B(c001200o);
        ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A0B = c001200o;
        ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A0K = C41131tQ.A04();
        ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A0A = C42041uv.A01();
        ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A0D = C41131tQ.A03();
        C02F A003 = C02F.A00();
        C02180Ae.A1B(A003);
        ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A0C = A003;
        storageUsageMediaGalleryFragment.A0A = C41371to.A0B();
        C018508q A004 = C018508q.A00();
        C02180Ae.A1B(A004);
        storageUsageMediaGalleryFragment.A03 = A004;
        AbstractC000600i A005 = AbstractC000600i.A00();
        C02180Ae.A1B(A005);
        storageUsageMediaGalleryFragment.A02 = A005;
        storageUsageMediaGalleryFragment.A0C = C41131tQ.A04();
        C01B A006 = C01B.A00();
        C02180Ae.A1B(A006);
        storageUsageMediaGalleryFragment.A04 = A006;
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        storageUsageMediaGalleryFragment.A01 = A02;
        C0C9 A007 = C0C9.A00();
        C02180Ae.A1B(A007);
        storageUsageMediaGalleryFragment.A05 = A007;
        storageUsageMediaGalleryFragment.A06 = C41371to.A01();
        storageUsageMediaGalleryFragment.A0B = C41371to.A0D();
        storageUsageMediaGalleryFragment.A08 = C41411ts.A00();
        C00A c00a = C00A.A00;
        C02180Ae.A1B(c00a);
        storageUsageMediaGalleryFragment.A07 = c00a;
    }

    @Override // X.C0CS
    public void A35(ReportSpamDialogFragment reportSpamDialogFragment) {
        C018508q A00 = C018508q.A00();
        C02180Ae.A1B(A00);
        reportSpamDialogFragment.A00 = A00;
        reportSpamDialogFragment.A05 = C41131tQ.A04();
        C01B A002 = C01B.A00();
        C02180Ae.A1B(A002);
        reportSpamDialogFragment.A01 = A002;
        reportSpamDialogFragment.A02 = C41141tR.A00();
        C018708s A003 = C018708s.A00();
        C02180Ae.A1B(A003);
        reportSpamDialogFragment.A03 = A003;
        reportSpamDialogFragment.A04 = C2MC.A00();
    }

    @Override // X.C0CS
    public void A36(DoneFragment doneFragment) {
        ((WaFragment) doneFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A37(SetCodeFragment setCodeFragment) {
        ((WaFragment) setCodeFragment).A00 = A00();
        setCodeFragment.A05 = C41311ti.A06();
    }

    @Override // X.C0CS
    public void A38(SetEmailFragment.ConfirmSkipEmailDialog confirmSkipEmailDialog) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) confirmSkipEmailDialog).A01 = A00;
        ((WaDialogFragment) confirmSkipEmailDialog).A00 = A00();
    }

    @Override // X.C0CS
    public void A39(SetEmailFragment setEmailFragment) {
        ((WaFragment) setEmailFragment).A00 = A00();
        setEmailFragment.A05 = C42041uv.A01();
    }

    @Override // X.C0CS
    public void A3A(SettingsTwoFactorAuthActivity.ConfirmDisableDialog confirmDisableDialog) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) confirmDisableDialog).A01 = A00;
        ((WaDialogFragment) confirmDisableDialog).A00 = A00();
        C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A3B(UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((RoundedBottomSheetDialogFragment) userNoticeBottomSheetDialogFragment).A00 = A00;
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        userNoticeBottomSheetDialogFragment.A09 = A002;
        userNoticeBottomSheetDialogFragment.A0A = C42041uv.A01();
        userNoticeBottomSheetDialogFragment.A0C = C41931uk.A01();
        userNoticeBottomSheetDialogFragment.A0D = C41931uk.A02();
        userNoticeBottomSheetDialogFragment.A0B = C41931uk.A00();
    }

    @Override // X.C0CS
    public void A3C(DocumentWarningDialogFragment documentWarningDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) documentWarningDialogFragment).A01 = A00;
        ((WaDialogFragment) documentWarningDialogFragment).A00 = A00();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        documentWarningDialogFragment.A02 = A002;
        AbstractC000600i A003 = AbstractC000600i.A00();
        C02180Ae.A1B(A003);
        documentWarningDialogFragment.A01 = A003;
        documentWarningDialogFragment.A06 = C41131tQ.A04();
        C01B A004 = C01B.A00();
        C02180Ae.A1B(A004);
        documentWarningDialogFragment.A03 = A004;
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        documentWarningDialogFragment.A00 = A02;
        C0C9 A005 = C0C9.A00();
        C02180Ae.A1B(A005);
        documentWarningDialogFragment.A04 = A005;
        documentWarningDialogFragment.A05 = C41411ts.A00();
    }

    @Override // X.C0CS
    public void A3D(CallSpamActivity.ReportSpamOrBlockDialogFragment reportSpamOrBlockDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) reportSpamOrBlockDialogFragment).A01 = A00;
        ((WaDialogFragment) reportSpamOrBlockDialogFragment).A00 = A00();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        reportSpamOrBlockDialogFragment.A02 = A002;
        reportSpamOrBlockDialogFragment.A0F = C41131tQ.A04();
        C018608r A02 = C018608r.A02();
        C02180Ae.A1B(A02);
        reportSpamOrBlockDialogFragment.A03 = A02;
        reportSpamOrBlockDialogFragment.A05 = C41141tR.A00();
        C018708s A003 = C018708s.A00();
        C02180Ae.A1B(A003);
        reportSpamOrBlockDialogFragment.A06 = A003;
        C41131tQ.A03();
        reportSpamOrBlockDialogFragment.A0D = C41311ti.A03();
        reportSpamOrBlockDialogFragment.A04 = C41171tU.A09();
        C0C9 A004 = C0C9.A00();
        C02180Ae.A1B(A004);
        reportSpamOrBlockDialogFragment.A09 = A004;
        reportSpamOrBlockDialogFragment.A0E = C41371to.A09();
        reportSpamOrBlockDialogFragment.A08 = C41341tl.A00();
        reportSpamOrBlockDialogFragment.A07 = C41211tY.A03();
    }

    @Override // X.C0CS
    public void A3E(CallsFragment.ClearCallLogDialogFragment clearCallLogDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) clearCallLogDialogFragment).A01 = A00;
        ((WaDialogFragment) clearCallLogDialogFragment).A00 = A00();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        clearCallLogDialogFragment.A00 = A002;
        clearCallLogDialogFragment.A03 = C41131tQ.A04();
        C41131tQ.A03();
        C0MC c0mc = C0MC.A00;
        C02180Ae.A1B(c0mc);
        clearCallLogDialogFragment.A04 = c0mc;
        C0HY A003 = C0HY.A00();
        C02180Ae.A1B(A003);
        clearCallLogDialogFragment.A01 = A003;
        C03080Ec A004 = C03080Ec.A00();
        C02180Ae.A1B(A004);
        clearCallLogDialogFragment.A02 = A004;
    }

    @Override // X.C0CS
    public void A3F(CallsFragment callsFragment) {
        ((WaListFragment) callsFragment).A00 = A00();
        callsFragment.A0K = C41121tP.A00();
        callsFragment.A04 = C41871ue.A00();
        C01B A00 = C01B.A00();
        C02180Ae.A1B(A00);
        callsFragment.A05 = A00;
        callsFragment.A0F = C41131tQ.A01();
        C018508q A002 = C018508q.A00();
        C02180Ae.A1B(A002);
        callsFragment.A03 = A002;
        callsFragment.A0N = C41131tQ.A04();
        callsFragment.A06 = C2MF.A00();
        callsFragment.A0S = C41171tU.A0D();
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        callsFragment.A02 = A02;
        C0L5 A01 = C0L5.A01();
        C02180Ae.A1B(A01);
        callsFragment.A0D = A01;
        C0L6 A003 = C0L6.A00();
        C02180Ae.A1B(A003);
        callsFragment.A0T = A003;
        callsFragment.A08 = C41141tR.A00();
        callsFragment.A0E = C42041uv.A01();
        C018708s A004 = C018708s.A00();
        C02180Ae.A1B(A004);
        callsFragment.A0A = A004;
        callsFragment.A0H = C41131tQ.A03();
        C0MC c0mc = C0MC.A00;
        C02180Ae.A1B(c0mc);
        callsFragment.A0O = c0mc;
        AnonymousClass008 anonymousClass008 = AnonymousClass008.A01;
        C02180Ae.A1B(anonymousClass008);
        callsFragment.A09 = anonymousClass008;
        callsFragment.A0M = C2MC.A06();
        C0HY A005 = C0HY.A00();
        C02180Ae.A1B(A005);
        callsFragment.A0I = A005;
        C02F A006 = C02F.A00();
        C02180Ae.A1B(A006);
        callsFragment.A0G = A006;
        C0C8 A007 = C0C8.A00();
        C02180Ae.A1B(A007);
        callsFragment.A0J = A007;
        C03360Fk c03360Fk = C03360Fk.A00;
        C02180Ae.A1B(c03360Fk);
        callsFragment.A0L = c03360Fk;
        C03320Ff c03320Ff = C03320Ff.A00;
        C02180Ae.A1B(c03320Ff);
        callsFragment.A07 = c03320Ff;
        C05480Ox c05480Ox = C05480Ox.A00;
        C02180Ae.A1B(c05480Ox);
        callsFragment.A0P = c05480Ox;
    }

    @Override // X.C0CS
    public void A3G(JoinableEducationDialogFragment joinableEducationDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) joinableEducationDialogFragment).A01 = A00;
        ((WaDialogFragment) joinableEducationDialogFragment).A00 = A00();
        C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A3H(MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) maximizedParticipantVideoDialogFragment).A01 = A00;
        ((WaDialogFragment) maximizedParticipantVideoDialogFragment).A00 = A00();
        maximizedParticipantVideoDialogFragment.A07 = C41141tR.A00();
        C018708s A002 = C018708s.A00();
        C02180Ae.A1B(A002);
        maximizedParticipantVideoDialogFragment.A08 = A002;
        C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A3I(PermissionDialogFragment permissionDialogFragment) {
        ((WaFragment) permissionDialogFragment).A00 = A00();
        permissionDialogFragment.A05 = C41141tR.A00();
        C018708s A00 = C018708s.A00();
        C02180Ae.A1B(A00);
        permissionDialogFragment.A06 = A00;
        C02F A002 = C02F.A00();
        C02180Ae.A1B(A002);
        permissionDialogFragment.A07 = A002;
        permissionDialogFragment.A08 = C41131tQ.A02();
        C03150Ej A003 = C03150Ej.A00();
        C02180Ae.A1B(A003);
        permissionDialogFragment.A04 = A003;
    }

    @Override // X.C0CS
    public void A3J(VoipActivityV2.E2EEInfoDialogFragment e2EEInfoDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) e2EEInfoDialogFragment).A01 = A00;
        ((WaDialogFragment) e2EEInfoDialogFragment).A00 = A00();
        C018308n A02 = C018308n.A02();
        C02180Ae.A1B(A02);
        e2EEInfoDialogFragment.A00 = A02;
        e2EEInfoDialogFragment.A01 = C42141vB.A07();
    }

    @Override // X.C0CS
    public void A3K(VoipActivityV2.EndCallConfirmationDialogFragment endCallConfirmationDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) endCallConfirmationDialogFragment).A01 = A00;
        ((WaDialogFragment) endCallConfirmationDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A3L(VoipActivityV2.MessageDialogFragment messageDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) messageDialogFragment).A01 = A00;
        ((WaDialogFragment) messageDialogFragment).A00 = A00();
        C0L6 A002 = C0L6.A00();
        C02180Ae.A1B(A002);
        messageDialogFragment.A00 = A002;
    }

    @Override // X.C0CS
    public void A3M(VoipActivityV2.NonActivityDismissDialogFragment nonActivityDismissDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) nonActivityDismissDialogFragment).A01 = A00;
        ((WaDialogFragment) nonActivityDismissDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A3N(VoipActivityV2.ReplyWithMessageDialogFragment replyWithMessageDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) replyWithMessageDialogFragment).A01 = A00;
        ((WaDialogFragment) replyWithMessageDialogFragment).A00 = A00();
        replyWithMessageDialogFragment.A00 = C41131tQ.A03();
    }

    @Override // X.C0CS
    public void A3O(VoipActivityV2.SwitchConfirmationFragment switchConfirmationFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) switchConfirmationFragment).A01 = A00;
        ((WaDialogFragment) switchConfirmationFragment).A00 = A00();
        switchConfirmationFragment.A00 = C41131tQ.A02();
    }

    @Override // X.C0CS
    public void A3P(VoipCallControlBottomSheet voipCallControlBottomSheet) {
        C02180Ae.A1B(C018508q.A00());
        AbstractC000600i A00 = AbstractC000600i.A00();
        C02180Ae.A1B(A00);
        voipCallControlBottomSheet.A0F = A00;
        C01B A002 = C01B.A00();
        C02180Ae.A1B(A002);
        voipCallControlBottomSheet.A0G = A002;
        C0L5 A01 = C0L5.A01();
        C02180Ae.A1B(A01);
        voipCallControlBottomSheet.A0M = A01;
        voipCallControlBottomSheet.A0J = C41141tR.A00();
        voipCallControlBottomSheet.A0N = C42041uv.A01();
        C018708s A003 = C018708s.A00();
        C02180Ae.A1B(A003);
        voipCallControlBottomSheet.A0K = A003;
        voipCallControlBottomSheet.A0P = C41131tQ.A03();
        voipCallControlBottomSheet.A0Q = C2MC.A06();
        C0EW A004 = C0EW.A00();
        C02180Ae.A1B(A004);
        voipCallControlBottomSheet.A0U = A004;
        C005102h A005 = C005102h.A00();
        C02180Ae.A1B(A005);
        voipCallControlBottomSheet.A0O = A005;
    }

    @Override // X.C0CS
    public void A3Q(VoipContactPickerDialogFragment voipContactPickerDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) voipContactPickerDialogFragment).A01 = A00;
        ((WaDialogFragment) voipContactPickerDialogFragment).A00 = A00();
    }

    @Override // X.C0CS
    public void A3R(VoipErrorDialogFragment voipErrorDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) voipErrorDialogFragment).A01 = A00;
        ((WaDialogFragment) voipErrorDialogFragment).A00 = A00();
        C01B A002 = C01B.A00();
        C02180Ae.A1B(A002);
        voipErrorDialogFragment.A02 = A002;
        voipErrorDialogFragment.A05 = C41131tQ.A03();
        voipErrorDialogFragment.A03 = C41141tR.A00();
        C018708s A003 = C018708s.A00();
        C02180Ae.A1B(A003);
        voipErrorDialogFragment.A04 = A003;
    }

    @Override // X.C0CS
    public void A3S(BkFragment2 bkFragment2) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) bkFragment2).A01 = A00;
        ((WaDialogFragment) bkFragment2).A00 = A00();
        C02950Dn c02950Dn = this.A01.A01.A01;
        bkFragment2.A0C = C41161tT.A00(C02950Dn.A0C(c02950Dn));
        bkFragment2.A0B = C41161tT.A00(c02950Dn.A2Y());
        bkFragment2.A09 = C41161tT.A00(C02950Dn.A0D(c02950Dn));
        bkFragment2.A0D = C41161tT.A00(c02950Dn.A2Z());
        bkFragment2.A04 = c02950Dn.A2I();
        bkFragment2.A05 = c02950Dn.A2J();
        bkFragment2.A06 = c02950Dn.A2K();
        C09O c09o = C09O.A00;
        C02180Ae.A1B(c09o);
        bkFragment2.A02 = c09o;
        bkFragment2.A07 = c02950Dn.A2L();
        bkFragment2.A0A = C41161tT.A00(C02950Dn.A0E(c02950Dn));
    }

    @Override // X.C0CS
    public void A3T(BkFragment bkFragment) {
        ((WaFragment) bkFragment).A00 = A00();
        C02950Dn c02950Dn = this.A01.A01.A01;
        bkFragment.A0C = C41161tT.A00(C02950Dn.A0C(c02950Dn));
        bkFragment.A0B = C41161tT.A00(c02950Dn.A2Y());
        bkFragment.A09 = C41161tT.A00(C02950Dn.A0D(c02950Dn));
        bkFragment.A0D = C41161tT.A00(c02950Dn.A2Z());
        bkFragment.A04 = c02950Dn.A2I();
        bkFragment.A05 = c02950Dn.A2J();
        bkFragment.A06 = c02950Dn.A2K();
        C09O c09o = C09O.A00;
        C02180Ae.A1B(c09o);
        bkFragment.A02 = c09o;
        bkFragment.A07 = c02950Dn.A2L();
        bkFragment.A0A = C41161tT.A00(C02950Dn.A0E(c02950Dn));
    }

    @Override // X.C0CS
    public void A3U(BkScreenFragment bkScreenFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) bkScreenFragment).A01 = A00;
        ((WaDialogFragment) bkScreenFragment).A00 = A00();
        bkScreenFragment.A06 = C2MA.A01();
        C02950Dn c02950Dn = this.A01.A01.A01;
        bkScreenFragment.A08 = C41161tT.A00(c02950Dn.A2Y());
        bkScreenFragment.A07 = C41161tT.A00(C02950Dn.A0D(c02950Dn));
        InterfaceC007103c interfaceC007103c = c02950Dn.A17;
        if (interfaceC007103c == null) {
            interfaceC007103c = new C03040Dx(c02950Dn, 27);
            c02950Dn.A17 = interfaceC007103c;
        }
        bkScreenFragment.A09 = C41161tT.A00(interfaceC007103c);
        bkScreenFragment.A05 = C41341tl.A00();
    }

    @Override // X.C0CS
    public void A3V(BkActionBottomSheet bkActionBottomSheet) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((RoundedBottomSheetDialogFragment) bkActionBottomSheet).A00 = A00;
        bkActionBottomSheet.A03 = C41161tT.A00(this.A01.A01.A01.A2X());
        bkActionBottomSheet.A02 = C2MF.A07();
        bkActionBottomSheet.A00 = C2MA.A01();
    }

    @Override // X.C0CS
    public void A3W(PrivacyNoticeDialogFragment privacyNoticeDialogFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) privacyNoticeDialogFragment).A01 = A00;
        ((WaDialogFragment) privacyNoticeDialogFragment).A00 = A00();
        C02950Dn c02950Dn = this.A01.A01.A01;
        ((BkDialogFragment) privacyNoticeDialogFragment).A01 = C41161tT.A00(c02950Dn.A2X());
        privacyNoticeDialogFragment.A01 = C41161tT.A00(c02950Dn.A2Z());
    }

    @Override // X.C0CS
    public void A3X(PrivacyNoticeFragment privacyNoticeFragment) {
        ((WaFragment) privacyNoticeFragment).A00 = A00();
        C02950Dn c02950Dn = this.A01.A01.A01;
        ((BkFragment) privacyNoticeFragment).A0C = C41161tT.A00(C02950Dn.A0C(c02950Dn));
        ((BkFragment) privacyNoticeFragment).A0B = C41161tT.A00(c02950Dn.A2Y());
        ((BkFragment) privacyNoticeFragment).A09 = C41161tT.A00(C02950Dn.A0D(c02950Dn));
        ((BkFragment) privacyNoticeFragment).A0D = C41161tT.A00(c02950Dn.A2Z());
        ((BkFragment) privacyNoticeFragment).A04 = c02950Dn.A2I();
        ((BkFragment) privacyNoticeFragment).A05 = c02950Dn.A2J();
        ((BkFragment) privacyNoticeFragment).A06 = c02950Dn.A2K();
        C09O c09o = C09O.A00;
        C02180Ae.A1B(c09o);
        ((BkFragment) privacyNoticeFragment).A02 = c09o;
        ((BkFragment) privacyNoticeFragment).A07 = c02950Dn.A2L();
        ((BkFragment) privacyNoticeFragment).A0A = C41161tT.A00(C02950Dn.A0E(c02950Dn));
        InterfaceC007103c interfaceC007103c = this.A00;
        if (interfaceC007103c == null) {
            interfaceC007103c = new InterfaceC007103c() { // from class: X.0e9
                @Override // X.InterfaceC007103c
                public Object get() {
                    C02950Dn c02950Dn2 = C09420dF.this.A01.A01.A01;
                    InterfaceC007103c interfaceC007103c2 = c02950Dn2.A0t;
                    if (interfaceC007103c2 == null) {
                        interfaceC007103c2 = new C03040Dx(c02950Dn2, 36);
                        c02950Dn2.A0t = interfaceC007103c2;
                    }
                    C00J A00 = C41161tT.A00(interfaceC007103c2);
                    InterfaceC007103c interfaceC007103c3 = c02950Dn2.A1A;
                    if (interfaceC007103c3 == null) {
                        interfaceC007103c3 = new C03040Dx(c02950Dn2, 10);
                        c02950Dn2.A1A = interfaceC007103c3;
                    }
                    return new C90264Ai(A00, C41161tT.A00(interfaceC007103c3));
                }
            };
            this.A00 = interfaceC007103c;
        }
        privacyNoticeFragment.A02 = C41161tT.A00(interfaceC007103c);
    }

    @Override // X.C0CS
    public void A3Y(BkBottomSheetContainerFragment bkBottomSheetContainerFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((RoundedBottomSheetDialogFragment) bkBottomSheetContainerFragment).A00 = A00;
        C02950Dn c02950Dn = this.A01.A01.A01;
        InterfaceC007103c interfaceC007103c = c02950Dn.A0U;
        if (interfaceC007103c == null) {
            interfaceC007103c = new C03040Dx(c02950Dn, 38);
            c02950Dn.A0U = interfaceC007103c;
        }
        bkBottomSheetContainerFragment.A04 = C41161tT.A00(interfaceC007103c);
    }

    @Override // X.C0CS
    public void A3Z(BkBottomSheetContentFragment bkBottomSheetContentFragment) {
        ((WaFragment) bkBottomSheetContentFragment).A00 = A00();
        C02950Dn c02950Dn = this.A01.A01.A01;
        ((BkFragment) bkBottomSheetContentFragment).A0C = C41161tT.A00(C02950Dn.A0C(c02950Dn));
        ((BkFragment) bkBottomSheetContentFragment).A0B = C41161tT.A00(c02950Dn.A2Y());
        ((BkFragment) bkBottomSheetContentFragment).A09 = C41161tT.A00(C02950Dn.A0D(c02950Dn));
        ((BkFragment) bkBottomSheetContentFragment).A0D = C41161tT.A00(c02950Dn.A2Z());
        ((BkFragment) bkBottomSheetContentFragment).A04 = c02950Dn.A2I();
        ((BkFragment) bkBottomSheetContentFragment).A05 = c02950Dn.A2J();
        ((BkFragment) bkBottomSheetContentFragment).A06 = c02950Dn.A2K();
        C09O c09o = C09O.A00;
        C02180Ae.A1B(c09o);
        ((BkFragment) bkBottomSheetContentFragment).A02 = c09o;
        ((BkFragment) bkBottomSheetContentFragment).A07 = c02950Dn.A2L();
        ((BkFragment) bkBottomSheetContentFragment).A0A = C41161tT.A00(C02950Dn.A0E(c02950Dn));
        bkBottomSheetContentFragment.A04 = C41161tT.A00(C02950Dn.A0C(c02950Dn));
        bkBottomSheetContentFragment.A03 = C41161tT.A00(c02950Dn.A2X());
    }

    @Override // X.C0CS
    public void A3a(ShopsProductPreviewFragment shopsProductPreviewFragment) {
        C002601h A00 = C002601h.A00();
        C02180Ae.A1B(A00);
        ((WaDialogFragment) shopsProductPreviewFragment).A01 = A00;
        ((WaDialogFragment) shopsProductPreviewFragment).A00 = A00();
        C02950Dn c02950Dn = this.A01.A01.A01;
        ((BkFragment2) shopsProductPreviewFragment).A0C = C41161tT.A00(C02950Dn.A0C(c02950Dn));
        ((BkFragment2) shopsProductPreviewFragment).A0B = C41161tT.A00(c02950Dn.A2Y());
        ((BkFragment2) shopsProductPreviewFragment).A09 = C41161tT.A00(C02950Dn.A0D(c02950Dn));
        ((BkFragment2) shopsProductPreviewFragment).A0D = C41161tT.A00(c02950Dn.A2Z());
        ((BkFragment2) shopsProductPreviewFragment).A04 = c02950Dn.A2I();
        ((BkFragment2) shopsProductPreviewFragment).A05 = c02950Dn.A2J();
        ((BkFragment2) shopsProductPreviewFragment).A06 = c02950Dn.A2K();
        C09O c09o = C09O.A00;
        C02180Ae.A1B(c09o);
        ((BkFragment2) shopsProductPreviewFragment).A02 = c09o;
        ((BkFragment2) shopsProductPreviewFragment).A07 = c02950Dn.A2L();
        ((BkFragment2) shopsProductPreviewFragment).A0A = C41161tT.A00(C02950Dn.A0E(c02950Dn));
        C03230Ew A002 = C03230Ew.A00();
        C02180Ae.A1B(A002);
        shopsProductPreviewFragment.A02 = A002;
    }
}
