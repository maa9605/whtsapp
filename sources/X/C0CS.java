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
import com.whatsapp.IntentChooserBottomSheetDialogFragment;
import com.whatsapp.MessageDialogFragment;
import com.whatsapp.MuteDialogFragment;
import com.whatsapp.PushnameEmojiBlacklistDialogFragment;
import com.whatsapp.RevokeLinkConfirmationDialogFragment;
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
import com.whatsapp.payments.ui.IndiaUpiContactPicker;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaDialogFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentContactPickerFragment;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import com.whatsapp.payments.ui.PaymentRailPickerFragment;
import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;
import com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment;
import com.whatsapp.payments.ui.widget.MandatePaymentBottomSheetFragment;
import com.whatsapp.phonematching.ConnectionProgressDialogFragment;
import com.whatsapp.phonematching.ConnectionUnavailableDialogFragment;
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
import com.whatsapp.wabloks.base.BkFragment;
import com.whatsapp.wabloks.base.BkFragment2;
import com.whatsapp.wabloks.base.BkScreenFragment;
import com.whatsapp.wabloks.ui.BkActionBottomSheet;
import com.whatsapp.wabloks.ui.PrivacyNotice.PrivacyNoticeDialogFragment;
import com.whatsapp.wabloks.ui.PrivacyNotice.PrivacyNoticeFragment;
import com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment;
import com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment;
import com.whatsapp.wabloks.ui.shops.ShopsProductPreviewFragment;

/* renamed from: X.0CS */
/* loaded from: classes.dex */
public abstract class C0CS implements C0C6 {
    public abstract C40511sO A04();

    public abstract void A05(CameraHomeFragment cameraHomeFragment);

    public abstract void A06(ContentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment contentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment);

    public abstract void A07(Conversation.CallConfirmationFragment callConfirmationFragment);

    public abstract void A08(DisplayExceptionDialogFactory$ClockWrongDialogFragment displayExceptionDialogFactory$ClockWrongDialogFragment);

    public abstract void A09(DisplayExceptionDialogFactory$ContactBlockedDialogFragment displayExceptionDialogFactory$ContactBlockedDialogFragment);

    public abstract void A0A(DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment displayExceptionDialogFactory$DoNotShareCodeDialogFragment);

    public abstract void A0B(DisplayExceptionDialogFactory$LoginFailedDialogFragment displayExceptionDialogFactory$LoginFailedDialogFragment);

    public abstract void A0C(DisplayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment displayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment);

    public abstract void A0D(DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment displayExceptionDialogFactory$SoftwareExpiredDialogFragment);

    public abstract void A0E(DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment displayExceptionDialogFactory$UnsupportedDeviceDialogFragment);

    public abstract void A0F(DocumentPickerActivity.SendDocumentsConfirmationDialogFragment sendDocumentsConfirmationDialogFragment);

    public abstract void A0G(IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment);

    public abstract void A0H(MessageDialogFragment messageDialogFragment);

    public abstract void A0I(MuteDialogFragment muteDialogFragment);

    public abstract void A0J(PushnameEmojiBlacklistDialogFragment pushnameEmojiBlacklistDialogFragment);

    public abstract void A0K(RevokeLinkConfirmationDialogFragment revokeLinkConfirmationDialogFragment);

    public abstract void A0L(SimpleExternalStorageStateCallback$PermissionDeniedDialogFragment simpleExternalStorageStateCallback$PermissionDeniedDialogFragment);

    public abstract void A0M(SimpleExternalStorageStateCallback$SDCardUnavailableDialogFragment simpleExternalStorageStateCallback$SDCardUnavailableDialogFragment);

    public abstract void A0N(SingleSelectionDialogFragment singleSelectionDialogFragment);

    public abstract void A0O(SuspiciousLinkWarningDialogFragment suspiciousLinkWarningDialogFragment);

    public abstract void A0P(DeleteAccountFeedback.ChangeNumberMessageDialogFragment changeNumberMessageDialogFragment);

    public abstract void A0Q(FingerprintBottomSheet fingerprintBottomSheet);

    public abstract void A0R(SetupDeviceAuthDialog setupDeviceAuthDialog);

    public abstract void A0S(VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment);

    public abstract void A0T(ChangePasswordDisableFragment changePasswordDisableFragment);

    public abstract void A0U(ChangePasswordDoneFragment changePasswordDoneFragment);

    public abstract void A0V(ConfirmChangePasswordFragment confirmChangePasswordFragment);

    public abstract void A0W(ConfirmEnableFragment confirmEnableFragment);

    public abstract void A0X(ConfirmPasswordFragment confirmPasswordFragment);

    public abstract void A0Y(CreatePasswordFragment createPasswordFragment);

    public abstract void A0Z(EnableDoneFragment enableDoneFragment);

    public abstract void A0a(EnableInfoFragment enableInfoFragment);

    public abstract void A0b(RestorePasswordInputFragment restorePasswordInputFragment);

    public abstract void A0c(VerifyPasswordFragment verifyPasswordFragment);

    public abstract void A0d(PromptDialogFragment promptDialogFragment);

    public abstract void A0e(SettingsGoogleDrive.AuthRequestDialogFragment authRequestDialogFragment);

    public abstract void A0f(SingleChoiceListDialogFragment singleChoiceListDialogFragment);

    public abstract void A0g(WaDialogFragment waDialogFragment);

    public abstract void A0h(CartFragment cartFragment);

    public abstract void A0i(QuantityPickerDialogFragment quantityPickerDialogFragment);

    public abstract void A0j(CatalogMediaViewFragment catalogMediaViewFragment);

    public abstract void A0k(CatalogReportDialogFragment catalogReportDialogFragment);

    public abstract void A0l(CatalogReportReasonDialogFragment catalogReportReasonDialogFragment);

    public abstract void A0m(OrderDetailFragment orderDetailFragment);

    public abstract void A0n(BlockConfirmationDialogFragment blockConfirmationDialogFragment);

    public abstract void A0o(UnblockDialogFragment unblockDialogFragment);

    public abstract void A0p(BloksDialogFragment bloksDialogFragment);

    public abstract void A0q(CameraMediaPickerFragment cameraMediaPickerFragment);

    public abstract void A0r(ChatInfoActivity.EncryptionExplanationDialogFragment encryptionExplanationDialogFragment);

    public abstract void A0s(LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment);

    public abstract void A0t(LinkedDevicesLogoutAllConfirmationDialogFragment linkedDevicesLogoutAllConfirmationDialogFragment);

    public abstract void A0u(LinkedDevicesLogoutOneDeviceConfirmationDialogFragment linkedDevicesLogoutOneDeviceConfirmationDialogFragment);

    public abstract void A0v(WifiSpeedBumpDialogFragment wifiSpeedBumpDialogFragment);

    public abstract void A0w(FirstTimeExperienceDialogFragment firstTimeExperienceDialogFragment);

    public abstract void A0x(BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment);

    public abstract void A0y(ContactPickerFragment contactPickerFragment);

    public abstract void A0z(InviteToGroupCallConfirmationFragment inviteToGroupCallConfirmationFragment);

    public abstract void A10(SharedFilePreviewDialogFragment sharedFilePreviewDialogFragment);

    public abstract void A11(SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment);

    public abstract void A12(CapturePictureOrVideoDialogFragment capturePictureOrVideoDialogFragment);

    public abstract void A13(ChangeNumberNotificationDialogFragment changeNumberNotificationDialogFragment);

    public abstract void A14(ChatMediaEphemeralVisibilityDialog chatMediaEphemeralVisibilityDialog);

    public abstract void A15(ChatMediaVisibilityDialog chatMediaVisibilityDialog);

    public abstract void A16(BusinessTransitionInfoDialogFragment businessTransitionInfoDialogFragment);

    public abstract void A17(ConversationRow$ConversationRowDialogFragment conversationRow$ConversationRowDialogFragment);

    public abstract void A18(ConversationRowContact$MessageSharedContactDialogFragment conversationRowContact$MessageSharedContactDialogFragment);

    public abstract void A19(DeviceChangeDialogFragment deviceChangeDialogFragment);

    public abstract void A1A(EncryptionChangeDialogFragment encryptionChangeDialogFragment);

    public abstract void A1B(IdentityChangeDialogFragment identityChangeDialogFragment);

    public abstract void A1C(VerifiedBusinessInfoDialogFragment verifiedBusinessInfoDialogFragment);

    public abstract void A1D(StarredMessagesActivity.UnstarAllDialogFragment unstarAllDialogFragment);

    public abstract void A1E(SelectListBottomSheet selectListBottomSheet);

    public abstract void A1F(ArchivedConversationsFragment archivedConversationsFragment);

    public abstract void A1G(ConversationsFragment.BulkDeleteConversationDialogFragment bulkDeleteConversationDialogFragment);

    public abstract void A1H(ConversationsFragment.DeleteBroadcastListDialogFragment deleteBroadcastListDialogFragment);

    public abstract void A1I(ConversationsFragment.DeleteContactDialogFragment deleteContactDialogFragment);

    public abstract void A1J(ConversationsFragment.DeleteGroupDialogFragment deleteGroupDialogFragment);

    public abstract void A1K(ConversationsFragment conversationsFragment);

    public abstract void A1L(LeaveGroupsDialogFragment leaveGroupsDialogFragment);

    public abstract void A1M(AudioVideoBottomSheetDialogFragment audioVideoBottomSheetDialogFragment);

    public abstract void A1N(CreateOrAddToContactsDialog createOrAddToContactsDialog);

    public abstract void A1O(FAQLearnMoreDialogFragment fAQLearnMoreDialogFragment);

    public abstract void A1P(HFMLearnMoreDialogFragment hFMLearnMoreDialogFragment);

    public abstract void A1Q(ProgressDialogFragment progressDialogFragment);

    public abstract void A1R(RoomsNUXBottomSheetDialogFragment roomsNUXBottomSheetDialogFragment);

    public abstract void A1S(RoomsRedirectDialogFragment roomsRedirectDialogFragment);

    public abstract void A1T(EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment);

    public abstract void A1U(EphemeralNUXDialog ephemeralNUXDialog);

    public abstract void A1V(ViewOnceNUXDialog viewOnceNUXDialog);

    public abstract void A1W(DocumentsGalleryFragment documentsGalleryFragment);

    public abstract void A1X(GalleryFragmentBase galleryFragmentBase);

    public abstract void A1Y(LinksGalleryFragment linksGalleryFragment);

    public abstract void A1Z(MediaGalleryFragment mediaGalleryFragment);

    public abstract void A1a(MediaGalleryFragmentBase mediaGalleryFragmentBase);

    public abstract void A1b(ProductGalleryFragment productGalleryFragment);

    public abstract void A1c(GalleryPickerFragment galleryPickerFragment);

    public abstract void A1d(MediaPickerFragment mediaPickerFragment);

    public abstract void A1e(RemoveDownloadableGifFromFavoritesDialogFragment removeDownloadableGifFromFavoritesDialogFragment);

    public abstract void A1f(RemoveGifFromFavoritesDialogFragment removeGifFromFavoritesDialogFragment);

    public abstract void A1g(StarDownloadableGifDialogFragment starDownloadableGifDialogFragment);

    public abstract void A1h(StarOrRemoveFromRecentGifsDialogFragment starOrRemoveFromRecentGifsDialogFragment);

    public abstract void A1i(GroupChatInfo.DescriptionConflictDialogFragment descriptionConflictDialogFragment);

    public abstract void A1j(GroupParticipantsSearchFragment groupParticipantsSearchFragment);

    public abstract void A1k(GroupSettingsActivity.EditGroupInfoDialogFragment editGroupInfoDialogFragment);

    public abstract void A1l(GroupSettingsActivity.RestrictFrequentlyForwardedDialogFragment restrictFrequentlyForwardedDialogFragment);

    public abstract void A1m(GroupSettingsActivity.SendMessagesDialogFragment sendMessagesDialogFragment);

    public abstract void A1n(GoogleSearchDialogFragment googleSearchDialogFragment);

    public abstract void A1o(SupportTopicsFragment supportTopicsFragment);

    public abstract void A1p(NobodyDeprecatedDialogFragment nobodyDeprecatedDialogFragment);

    public abstract void A1q(PromptSendGroupInviteDialogFragment promptSendGroupInviteDialogFragment);

    public abstract void A1r(RevokeInviteDialogFragment revokeInviteDialogFragment);

    public abstract void A1s(StopLiveLocationDialogFragment stopLiveLocationDialogFragment);

    public abstract void A1t(GifComposerFragment gifComposerFragment);

    public abstract void A1u(ImageComposerFragment imageComposerFragment);

    public abstract void A1v(MediaComposerFragment mediaComposerFragment);

    public abstract void A1w(VideoComposerFragment videoComposerFragment);

    public abstract void A1x(DeleteMessagesDialogFragment deleteMessagesDialogFragment);

    public abstract void A1y(MediaViewFragment mediaViewFragment);

    public abstract void A1z(RevokeNuxDialogFragment revokeNuxDialogFragment);

    public abstract void A20(RequestPermissionsDialogFragment requestPermissionsDialogFragment);

    public abstract void A21(PinBottomSheetDialogFragment pinBottomSheetDialogFragment);

    public abstract void A22(AddPaymentMethodBottomSheet addPaymentMethodBottomSheet);

    public abstract void A23(BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment);

    public abstract void A24(BrazilPaymentTypePickerFragment brazilPaymentTypePickerFragment);

    public abstract void A25(BrazilReTosFragment brazilReTosFragment);

    public abstract void A26(BrazilSmbMerchantNuxUpSellBottomSheet brazilSmbMerchantNuxUpSellBottomSheet);

    public abstract void A27(ConfirmPaymentFragment confirmPaymentFragment);

    public abstract void A28(IndiaUpiContactPicker.IndiaUpiContactPickerFragment indiaUpiContactPickerFragment);

    public abstract void A29(IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment);

    public abstract void A2A(IndiaUpiSendPaymentToVpaDialogFragment indiaUpiSendPaymentToVpaDialogFragment);

    public abstract void A2B(PaymentBottomSheet paymentBottomSheet);

    public abstract void A2C(PaymentContactPickerFragment paymentContactPickerFragment);

    public abstract void A2D(PaymentMethodsListPickerFragment paymentMethodsListPickerFragment);

    public abstract void A2E(PaymentRailPickerFragment paymentRailPickerFragment);

    public abstract void A2F(PaymentsUnavailableDialogFragment paymentsUnavailableDialogFragment);

    public abstract void A2G(IndiaUpiPaymentInviteFragment indiaUpiPaymentInviteFragment);

    public abstract void A2H(MandatePaymentBottomSheetFragment mandatePaymentBottomSheetFragment);

    public abstract void A2I(ConnectionProgressDialogFragment connectionProgressDialogFragment);

    public abstract void A2J(ConnectionUnavailableDialogFragment connectionUnavailableDialogFragment);

    public abstract void A2K(MatchPhoneNumberFragment matchPhoneNumberFragment);

    public abstract void A2L(GifSearchDialogFragment gifSearchDialogFragment);

    public abstract void A2M(StickerSearchDialogFragment stickerSearchDialogFragment);

    public abstract void A2N(StickerSearchTabFragment stickerSearchTabFragment);

    public abstract void A2O(ResetGroupPhoto.ConfirmDialogFragment confirmDialogFragment);

    public abstract void A2P(ResetProfilePhoto.ConfirmDialogFragment confirmDialogFragment);

    public abstract void A2Q(QrEducationDialogFragment qrEducationDialogFragment);

    public abstract void A2R(BaseQrActivity$RevokeCodeDialogFragment baseQrActivity$RevokeCodeDialogFragment);

    public abstract void A2S(BaseQrActivity$TryAgainDialogFragment baseQrActivity$TryAgainDialogFragment);

    public abstract void A2T(ContactQrMyCodeFragment contactQrMyCodeFragment);

    public abstract void A2U(ErrorDialogFragment errorDialogFragment);

    public abstract void A2V(QrScanCodeFragment qrScanCodeFragment);

    public abstract void A2W(ScannedCodeDialogFragment scannedCodeDialogFragment);

    public abstract void A2X(WebCodeDialogFragment webCodeDialogFragment);

    public abstract void A2Y(SelectPhoneNumberDialog selectPhoneNumberDialog);

    public abstract void A2Z(VerifyTwoFactorAuth.ConfirmResetCode confirmResetCode);

    public abstract void A2a(VerifyTwoFactorAuth.ConfirmWipe confirmWipe);

    public abstract void A2b(DeleteReportConfirmationDialogFragment deleteReportConfirmationDialogFragment);

    public abstract void A2c(ShareReportConfirmationDialogFragment shareReportConfirmationDialogFragment);

    public abstract void A2d(SearchFragment searchFragment);

    public abstract void A2e(MultiSelectionDialogFragment multiSelectionDialogFragment);

    public abstract void A2f(SettingsChatHistoryFragment settingsChatHistoryFragment);

    public abstract void A2g(SettingsJidNotificationFragment settingsJidNotificationFragment);

    public abstract void A2h(SettingsNetworkUsage.ResetUsageConfirmationDialog resetUsageConfirmationDialog);

    public abstract void A2i(WallpaperDownloadFailedDialogFragment wallpaperDownloadFailedDialogFragment);

    public abstract void A2j(WallpaperSetConfirmationDialogFragment wallpaperSetConfirmationDialogFragment);

    public abstract void A2k(FirstStatusConfirmationDialogFragment firstStatusConfirmationDialogFragment);

    public abstract void A2l(StatusConfirmMuteDialogFragment statusConfirmMuteDialogFragment);

    public abstract void A2m(StatusConfirmUnmuteDialogFragment statusConfirmUnmuteDialogFragment);

    public abstract void A2n(StatusDeleteDialogFragment statusDeleteDialogFragment);

    public abstract void A2o(StatusesFragment statusesFragment);

    public abstract void A2p(StatusPlaybackContactFragment statusPlaybackContactFragment);

    public abstract void A2q(StatusPlaybackFragment statusPlaybackFragment);

    public abstract void A2r(AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment);

    public abstract void A2s(ConfirmPackDeleteDialogFragment confirmPackDeleteDialogFragment);

    public abstract void A2t(RemoveStickerFromFavoritesDialogFragment removeStickerFromFavoritesDialogFragment);

    public abstract void A2u(StarOrRemoveFromRecentsStickerDialogFragment starOrRemoveFromRecentsStickerDialogFragment);

    public abstract void A2v(StarStickerFromPickerDialogFragment starStickerFromPickerDialogFragment);

    public abstract void A2w(StickerInfoDialogFragment stickerInfoDialogFragment);

    public abstract void A2x(StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment);

    public abstract void A2y(StickerStoreMyTabFragment stickerStoreMyTabFragment);

    public abstract void A2z(StickerStoreTabFragment stickerStoreTabFragment);

    public abstract void A30(ThirdPartyPackPage$StickerBlockedDialogFragment thirdPartyPackPage$StickerBlockedDialogFragment);

    public abstract void A31(StorageUsageDeleteCompleteDialogFragment storageUsageDeleteCompleteDialogFragment);

    public abstract void A32(StorageUsageDeleteMessagesDialogFragment storageUsageDeleteMessagesDialogFragment);

    public abstract void A33(StorageUsageGallerySortBottomSheet storageUsageGallerySortBottomSheet);

    public abstract void A34(StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment);

    public abstract void A35(ReportSpamDialogFragment reportSpamDialogFragment);

    public abstract void A36(DoneFragment doneFragment);

    public abstract void A37(SetCodeFragment setCodeFragment);

    public abstract void A38(SetEmailFragment.ConfirmSkipEmailDialog confirmSkipEmailDialog);

    public abstract void A39(SetEmailFragment setEmailFragment);

    public abstract void A3A(SettingsTwoFactorAuthActivity.ConfirmDisableDialog confirmDisableDialog);

    public abstract void A3B(UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment);

    public abstract void A3C(DocumentWarningDialogFragment documentWarningDialogFragment);

    public abstract void A3D(CallSpamActivity.ReportSpamOrBlockDialogFragment reportSpamOrBlockDialogFragment);

    public abstract void A3E(CallsFragment.ClearCallLogDialogFragment clearCallLogDialogFragment);

    public abstract void A3F(CallsFragment callsFragment);

    public abstract void A3G(JoinableEducationDialogFragment joinableEducationDialogFragment);

    public abstract void A3H(MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment);

    public abstract void A3I(PermissionDialogFragment permissionDialogFragment);

    public abstract void A3J(VoipActivityV2.E2EEInfoDialogFragment e2EEInfoDialogFragment);

    public abstract void A3K(VoipActivityV2.EndCallConfirmationDialogFragment endCallConfirmationDialogFragment);

    public abstract void A3L(VoipActivityV2.MessageDialogFragment messageDialogFragment);

    public abstract void A3M(VoipActivityV2.NonActivityDismissDialogFragment nonActivityDismissDialogFragment);

    public abstract void A3N(VoipActivityV2.ReplyWithMessageDialogFragment replyWithMessageDialogFragment);

    public abstract void A3O(VoipActivityV2.SwitchConfirmationFragment switchConfirmationFragment);

    public abstract void A3P(VoipCallControlBottomSheet voipCallControlBottomSheet);

    public abstract void A3Q(VoipContactPickerDialogFragment voipContactPickerDialogFragment);

    public abstract void A3R(VoipErrorDialogFragment voipErrorDialogFragment);

    public abstract void A3S(BkFragment2 bkFragment2);

    public abstract void A3T(BkFragment bkFragment);

    public abstract void A3U(BkScreenFragment bkScreenFragment);

    public abstract void A3V(BkActionBottomSheet bkActionBottomSheet);

    public abstract void A3W(PrivacyNoticeDialogFragment privacyNoticeDialogFragment);

    public abstract void A3X(PrivacyNoticeFragment privacyNoticeFragment);

    public abstract void A3Y(BkBottomSheetContainerFragment bkBottomSheetContainerFragment);

    public abstract void A3Z(BkBottomSheetContentFragment bkBottomSheetContentFragment);

    public abstract void A3a(ShopsProductPreviewFragment shopsProductPreviewFragment);
}
