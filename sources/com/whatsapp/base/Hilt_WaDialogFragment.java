package com.whatsapp.base;

import X.AnonymousClass005;
import X.AnonymousClass029;
import X.C0CR;
import X.C0CS;
import X.C52902bX;
import X.C52912bY;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.backup.google.Hilt_PromptDialogFragment;
import com.whatsapp.backup.google.Hilt_SettingsGoogleDrive_AuthRequestDialogFragment;
import com.whatsapp.backup.google.Hilt_SingleChoiceListDialogFragment;
import com.whatsapp.backup.google.PromptDialogFragment;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.backup.google.SingleChoiceListDialogFragment;
import com.whatsapp.biz.cart.view.fragment.Hilt_QuantityPickerDialogFragment;
import com.whatsapp.biz.cart.view.fragment.QuantityPickerDialogFragment;
import com.whatsapp.biz.catalog.CatalogReportDialogFragment;
import com.whatsapp.biz.catalog.CatalogReportReasonDialogFragment;
import com.whatsapp.biz.catalog.Hilt_CatalogReportDialogFragment;
import com.whatsapp.biz.catalog.Hilt_CatalogReportReasonDialogFragment;
import com.whatsapp.blocklist.BlockConfirmationDialogFragment;
import com.whatsapp.blocklist.Hilt_BlockConfirmationDialogFragment;
import com.whatsapp.blocklist.Hilt_UnblockDialogFragment;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.chatinfo.Hilt_ChatInfoActivity_EncryptionExplanationDialogFragment;
import com.whatsapp.companiondevice.Hilt_LinkedDevicesDetailDialogFragment;
import com.whatsapp.companiondevice.Hilt_LinkedDevicesLogoutAllConfirmationDialogFragment;
import com.whatsapp.companiondevice.Hilt_LinkedDevicesLogoutOneDeviceConfirmationDialogFragment;
import com.whatsapp.companiondevice.Hilt_WifiSpeedBumpDialogFragment;
import com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment;
import com.whatsapp.companiondevice.LinkedDevicesLogoutAllConfirmationDialogFragment;
import com.whatsapp.companiondevice.LinkedDevicesLogoutOneDeviceConfirmationDialogFragment;
import com.whatsapp.companiondevice.WifiSpeedBumpDialogFragment;
import com.whatsapp.companiondevice.optin.ui.FirstTimeExperienceDialogFragment;
import com.whatsapp.companiondevice.optin.ui.Hilt_FirstTimeExperienceDialogFragment;
import com.whatsapp.contact.picker.BaseSharedPreviewDialogFragment;
import com.whatsapp.contact.picker.Hilt_BaseSharedPreviewDialogFragment;
import com.whatsapp.contact.picker.Hilt_InviteToGroupCallConfirmationFragment;
import com.whatsapp.contact.picker.Hilt_SharedFilePreviewDialogFragment;
import com.whatsapp.contact.picker.Hilt_SharedTextPreviewDialogFragment;
import com.whatsapp.contact.picker.InviteToGroupCallConfirmationFragment;
import com.whatsapp.contact.picker.SharedFilePreviewDialogFragment;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.conversation.CapturePictureOrVideoDialogFragment;
import com.whatsapp.conversation.ChangeNumberNotificationDialogFragment;
import com.whatsapp.conversation.ChatMediaEphemeralVisibilityDialog;
import com.whatsapp.conversation.ChatMediaVisibilityDialog;
import com.whatsapp.conversation.Hilt_CapturePictureOrVideoDialogFragment;
import com.whatsapp.conversation.Hilt_ChangeNumberNotificationDialogFragment;
import com.whatsapp.conversation.Hilt_ChatMediaEphemeralVisibilityDialog;
import com.whatsapp.conversation.Hilt_ChatMediaVisibilityDialog;
import com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment;
import com.whatsapp.conversation.conversationrow.ConversationRow$ConversationRowDialogFragment;
import com.whatsapp.conversation.conversationrow.ConversationRowContact$MessageSharedContactDialogFragment;
import com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment;
import com.whatsapp.conversation.conversationrow.Hilt_BusinessTransitionInfoDialogFragment;
import com.whatsapp.conversation.conversationrow.Hilt_ConversationRowContact_MessageSharedContactDialogFragment;
import com.whatsapp.conversation.conversationrow.Hilt_ConversationRow_ConversationRowDialogFragment;
import com.whatsapp.conversation.conversationrow.Hilt_EncryptionChangeDialogFragment;
import com.whatsapp.conversation.conversationrow.Hilt_VerifiedBusinessInfoDialogFragment;
import com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment;
import com.whatsapp.conversation.conversationrow.message.Hilt_StarredMessagesActivity_UnstarAllDialogFragment;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.conversationslist.Hilt_ConversationsFragment_BulkDeleteConversationDialogFragment;
import com.whatsapp.conversationslist.Hilt_ConversationsFragment_DeleteBroadcastListDialogFragment;
import com.whatsapp.conversationslist.Hilt_ConversationsFragment_DeleteContactDialogFragment;
import com.whatsapp.conversationslist.Hilt_ConversationsFragment_DeleteGroupDialogFragment;
import com.whatsapp.conversationslist.Hilt_LeaveGroupsDialogFragment;
import com.whatsapp.conversationslist.LeaveGroupsDialogFragment;
import com.whatsapp.dialogs.CreateOrAddToContactsDialog;
import com.whatsapp.dialogs.FAQLearnMoreDialogFragment;
import com.whatsapp.dialogs.HFMLearnMoreDialogFragment;
import com.whatsapp.dialogs.Hilt_CreateOrAddToContactsDialog;
import com.whatsapp.dialogs.Hilt_FAQLearnMoreDialogFragment;
import com.whatsapp.dialogs.Hilt_ProgressDialogFragment;
import com.whatsapp.dialogs.Hilt_RoomsRedirectDialogFragment;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.dialogs.RoomsRedirectDialogFragment;
import com.whatsapp.ephemeral.EphemeralNUXDialog;
import com.whatsapp.ephemeral.Hilt_EphemeralNUXDialog;
import com.whatsapp.ephemeral.Hilt_ViewOnceNUXDialog;
import com.whatsapp.ephemeral.ViewOnceNUXDialog;
import com.whatsapp.gif_search.Hilt_RemoveDownloadableGifFromFavoritesDialogFragment;
import com.whatsapp.gif_search.Hilt_RemoveGifFromFavoritesDialogFragment;
import com.whatsapp.gif_search.Hilt_StarDownloadableGifDialogFragment;
import com.whatsapp.gif_search.Hilt_StarOrRemoveFromRecentGifsDialogFragment;
import com.whatsapp.gif_search.RemoveDownloadableGifFromFavoritesDialogFragment;
import com.whatsapp.gif_search.RemoveGifFromFavoritesDialogFragment;
import com.whatsapp.gif_search.StarDownloadableGifDialogFragment;
import com.whatsapp.gif_search.StarOrRemoveFromRecentGifsDialogFragment;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.group.Hilt_GroupChatInfo_DescriptionConflictDialogFragment;
import com.whatsapp.http.GoogleSearchDialogFragment;
import com.whatsapp.http.Hilt_GoogleSearchDialogFragment;
import com.whatsapp.invites.Hilt_NobodyDeprecatedDialogFragment;
import com.whatsapp.invites.Hilt_PromptSendGroupInviteDialogFragment;
import com.whatsapp.invites.Hilt_RevokeInviteDialogFragment;
import com.whatsapp.invites.NobodyDeprecatedDialogFragment;
import com.whatsapp.invites.PromptSendGroupInviteDialogFragment;
import com.whatsapp.invites.RevokeInviteDialogFragment;
import com.whatsapp.location.Hilt_StopLiveLocationDialogFragment;
import com.whatsapp.location.StopLiveLocationDialogFragment;
import com.whatsapp.mediaview.DeleteMessagesDialogFragment;
import com.whatsapp.mediaview.Hilt_DeleteMessagesDialogFragment;
import com.whatsapp.mediaview.Hilt_RevokeNuxDialogFragment;
import com.whatsapp.mediaview.RevokeNuxDialogFragment;
import com.whatsapp.notification.Hilt_RequestPermissionsDialogFragment;
import com.whatsapp.notification.RequestPermissionsDialogFragment;
import com.whatsapp.payments.ui.Hilt_PaymentsUnavailableDialogFragment;
import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;
import com.whatsapp.phonematching.ConnectionProgressDialogFragment;
import com.whatsapp.phonematching.ConnectionUnavailableDialogFragment;
import com.whatsapp.phonematching.Hilt_ConnectionUnavailableDialogFragment;
import com.whatsapp.profile.Hilt_ResetGroupPhoto_ConfirmDialogFragment;
import com.whatsapp.profile.Hilt_ResetProfilePhoto_ConfirmDialogFragment;
import com.whatsapp.profile.ResetGroupPhoto;
import com.whatsapp.profile.ResetProfilePhoto;
import com.whatsapp.qrcode.Hilt_QrEducationDialogFragment;
import com.whatsapp.qrcode.QrEducationDialogFragment;
import com.whatsapp.qrcode.contactqr.BaseQrActivity$RevokeCodeDialogFragment;
import com.whatsapp.qrcode.contactqr.BaseQrActivity$TryAgainDialogFragment;
import com.whatsapp.qrcode.contactqr.ErrorDialogFragment;
import com.whatsapp.qrcode.contactqr.Hilt_BaseQrActivity_RevokeCodeDialogFragment;
import com.whatsapp.qrcode.contactqr.Hilt_BaseQrActivity_TryAgainDialogFragment;
import com.whatsapp.qrcode.contactqr.Hilt_ErrorDialogFragment;
import com.whatsapp.qrcode.contactqr.Hilt_WebCodeDialogFragment;
import com.whatsapp.qrcode.contactqr.WebCodeDialogFragment;
import com.whatsapp.registration.Hilt_SelectPhoneNumberDialog;
import com.whatsapp.registration.Hilt_VerifyTwoFactorAuth_ConfirmResetCode;
import com.whatsapp.registration.Hilt_VerifyTwoFactorAuth_ConfirmWipe;
import com.whatsapp.registration.SelectPhoneNumberDialog;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.report.DeleteReportConfirmationDialogFragment;
import com.whatsapp.report.Hilt_DeleteReportConfirmationDialogFragment;
import com.whatsapp.report.Hilt_ShareReportConfirmationDialogFragment;
import com.whatsapp.report.ShareReportConfirmationDialogFragment;
import com.whatsapp.settings.Hilt_MultiSelectionDialogFragment;
import com.whatsapp.settings.Hilt_SettingsNetworkUsage_ResetUsageConfirmationDialog;
import com.whatsapp.settings.MultiSelectionDialogFragment;
import com.whatsapp.settings.SettingsNetworkUsage;
import com.whatsapp.settings.chat.wallpaper.Hilt_WallpaperDownloadFailedDialogFragment;
import com.whatsapp.settings.chat.wallpaper.WallpaperDownloadFailedDialogFragment;
import com.whatsapp.status.FirstStatusConfirmationDialogFragment;
import com.whatsapp.status.Hilt_FirstStatusConfirmationDialogFragment;
import com.whatsapp.status.Hilt_StatusConfirmMuteDialogFragment;
import com.whatsapp.status.Hilt_StatusConfirmUnmuteDialogFragment;
import com.whatsapp.status.Hilt_StatusDeleteDialogFragment;
import com.whatsapp.status.StatusConfirmMuteDialogFragment;
import com.whatsapp.status.StatusConfirmUnmuteDialogFragment;
import com.whatsapp.status.StatusDeleteDialogFragment;
import com.whatsapp.stickers.AddThirdPartyStickerPackActivity;
import com.whatsapp.stickers.ConfirmPackDeleteDialogFragment;
import com.whatsapp.stickers.Hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment;
import com.whatsapp.stickers.Hilt_ConfirmPackDeleteDialogFragment;
import com.whatsapp.stickers.Hilt_RemoveStickerFromFavoritesDialogFragment;
import com.whatsapp.stickers.Hilt_StarOrRemoveFromRecentsStickerDialogFragment;
import com.whatsapp.stickers.Hilt_StarStickerFromPickerDialogFragment;
import com.whatsapp.stickers.Hilt_StickerInfoDialogFragment;
import com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment;
import com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment;
import com.whatsapp.stickers.StarStickerFromPickerDialogFragment;
import com.whatsapp.stickers.StickerInfoDialogFragment;
import com.whatsapp.stickers.picker.pages.Hilt_ThirdPartyPackPage_StickerBlockedDialogFragment;
import com.whatsapp.stickers.picker.pages.ThirdPartyPackPage$StickerBlockedDialogFragment;
import com.whatsapp.storage.Hilt_StorageUsageDeleteCompleteDialogFragment;
import com.whatsapp.storage.Hilt_StorageUsageDeleteMessagesDialogFragment;
import com.whatsapp.storage.StorageUsageDeleteCompleteDialogFragment;
import com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment;
import com.whatsapp.twofactor.Hilt_SetEmailFragment_ConfirmSkipEmailDialog;
import com.whatsapp.twofactor.Hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog;
import com.whatsapp.twofactor.SetEmailFragment;
import com.whatsapp.twofactor.SettingsTwoFactorAuthActivity;
import com.whatsapp.util.DocumentWarningDialogFragment;
import com.whatsapp.util.Hilt_DocumentWarningDialogFragment;
import com.whatsapp.voipcalling.CallSpamActivity;
import com.whatsapp.voipcalling.CallsFragment;
import com.whatsapp.voipcalling.Hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment;
import com.whatsapp.voipcalling.Hilt_CallsFragment_ClearCallLogDialogFragment;
import com.whatsapp.voipcalling.Hilt_JoinableEducationDialogFragment;
import com.whatsapp.voipcalling.Hilt_MaximizedParticipantVideoDialogFragment;
import com.whatsapp.voipcalling.Hilt_VoipActivityV2_E2EEInfoDialogFragment;
import com.whatsapp.voipcalling.Hilt_VoipActivityV2_EndCallConfirmationDialogFragment;
import com.whatsapp.voipcalling.Hilt_VoipActivityV2_MessageDialogFragment;
import com.whatsapp.voipcalling.Hilt_VoipActivityV2_NonActivityDismissDialogFragment;
import com.whatsapp.voipcalling.Hilt_VoipActivityV2_ReplyWithMessageDialogFragment;
import com.whatsapp.voipcalling.Hilt_VoipActivityV2_SwitchConfirmationFragment;
import com.whatsapp.voipcalling.Hilt_VoipContactPickerDialogFragment;
import com.whatsapp.voipcalling.Hilt_VoipErrorDialogFragment;
import com.whatsapp.voipcalling.JoinableEducationDialogFragment;
import com.whatsapp.voipcalling.MaximizedParticipantVideoDialogFragment;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipContactPickerDialogFragment;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;

/* loaded from: classes2.dex */
public abstract class Hilt_WaDialogFragment extends DialogFragment implements AnonymousClass005 {
    public ContextWrapper A00;
    public volatile C52912bY A03;
    public final Object A02 = new Object();
    public boolean A01 = false;

    @Override // X.C0BA
    public Context A0a() {
        return this.A00;
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public LayoutInflater A0b(Bundle bundle) {
        return LayoutInflater.from(new C52902bX(super.A0b(bundle), this));
    }

    @Override // X.C0BA
    public void A0c(Activity activity) {
        boolean z = true;
        this.A0U = true;
        ContextWrapper contextWrapper = this.A00;
        if (contextWrapper != null && C52912bY.A00(contextWrapper) != activity) {
            z = false;
        }
        AnonymousClass029.A1J(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        if (this.A00 == null) {
            this.A00 = new C52902bX(super.A0a(), this);
            A17();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        if (this.A00 == null) {
            this.A00 = new C52902bX(super.A0a(), this);
            A17();
        }
    }

    public void A17() {
        if (this instanceof Hilt_VoipErrorDialogFragment) {
            Hilt_VoipErrorDialogFragment hilt_VoipErrorDialogFragment = (Hilt_VoipErrorDialogFragment) this;
            if (hilt_VoipErrorDialogFragment.A01) {
                return;
            }
            hilt_VoipErrorDialogFragment.A01 = true;
            ((C0CS) hilt_VoipErrorDialogFragment.generatedComponent()).A3R((VoipErrorDialogFragment) hilt_VoipErrorDialogFragment);
        } else if (this instanceof Hilt_VoipContactPickerDialogFragment) {
            Hilt_VoipContactPickerDialogFragment hilt_VoipContactPickerDialogFragment = (Hilt_VoipContactPickerDialogFragment) this;
            if (hilt_VoipContactPickerDialogFragment.A01) {
                return;
            }
            hilt_VoipContactPickerDialogFragment.A01 = true;
            ((C0CS) hilt_VoipContactPickerDialogFragment.generatedComponent()).A3Q((VoipContactPickerDialogFragment) hilt_VoipContactPickerDialogFragment);
        } else if (this instanceof Hilt_VoipActivityV2_SwitchConfirmationFragment) {
            Hilt_VoipActivityV2_SwitchConfirmationFragment hilt_VoipActivityV2_SwitchConfirmationFragment = (Hilt_VoipActivityV2_SwitchConfirmationFragment) this;
            if (hilt_VoipActivityV2_SwitchConfirmationFragment.A01) {
                return;
            }
            hilt_VoipActivityV2_SwitchConfirmationFragment.A01 = true;
            ((C0CS) hilt_VoipActivityV2_SwitchConfirmationFragment.generatedComponent()).A3O((VoipActivityV2.SwitchConfirmationFragment) hilt_VoipActivityV2_SwitchConfirmationFragment);
        } else if (this instanceof Hilt_VoipActivityV2_ReplyWithMessageDialogFragment) {
            Hilt_VoipActivityV2_ReplyWithMessageDialogFragment hilt_VoipActivityV2_ReplyWithMessageDialogFragment = (Hilt_VoipActivityV2_ReplyWithMessageDialogFragment) this;
            if (hilt_VoipActivityV2_ReplyWithMessageDialogFragment.A01) {
                return;
            }
            hilt_VoipActivityV2_ReplyWithMessageDialogFragment.A01 = true;
            ((C0CS) hilt_VoipActivityV2_ReplyWithMessageDialogFragment.generatedComponent()).A3N((VoipActivityV2.ReplyWithMessageDialogFragment) hilt_VoipActivityV2_ReplyWithMessageDialogFragment);
        } else if (this instanceof Hilt_VoipActivityV2_NonActivityDismissDialogFragment) {
            Hilt_VoipActivityV2_NonActivityDismissDialogFragment hilt_VoipActivityV2_NonActivityDismissDialogFragment = (Hilt_VoipActivityV2_NonActivityDismissDialogFragment) this;
            if (hilt_VoipActivityV2_NonActivityDismissDialogFragment.A01) {
                return;
            }
            hilt_VoipActivityV2_NonActivityDismissDialogFragment.A01 = true;
            ((C0CS) hilt_VoipActivityV2_NonActivityDismissDialogFragment.generatedComponent()).A3M((VoipActivityV2.NonActivityDismissDialogFragment) hilt_VoipActivityV2_NonActivityDismissDialogFragment);
        } else if (this instanceof Hilt_VoipActivityV2_MessageDialogFragment) {
            Hilt_VoipActivityV2_MessageDialogFragment hilt_VoipActivityV2_MessageDialogFragment = (Hilt_VoipActivityV2_MessageDialogFragment) this;
            if (hilt_VoipActivityV2_MessageDialogFragment.A01) {
                return;
            }
            hilt_VoipActivityV2_MessageDialogFragment.A01 = true;
            ((C0CS) hilt_VoipActivityV2_MessageDialogFragment.generatedComponent()).A3L((VoipActivityV2.MessageDialogFragment) hilt_VoipActivityV2_MessageDialogFragment);
        } else if (this instanceof Hilt_VoipActivityV2_EndCallConfirmationDialogFragment) {
            Hilt_VoipActivityV2_EndCallConfirmationDialogFragment hilt_VoipActivityV2_EndCallConfirmationDialogFragment = (Hilt_VoipActivityV2_EndCallConfirmationDialogFragment) this;
            if (hilt_VoipActivityV2_EndCallConfirmationDialogFragment.A01) {
                return;
            }
            hilt_VoipActivityV2_EndCallConfirmationDialogFragment.A01 = true;
            ((C0CS) hilt_VoipActivityV2_EndCallConfirmationDialogFragment.generatedComponent()).A3K((VoipActivityV2.EndCallConfirmationDialogFragment) hilt_VoipActivityV2_EndCallConfirmationDialogFragment);
        } else if (this instanceof Hilt_VoipActivityV2_E2EEInfoDialogFragment) {
            Hilt_VoipActivityV2_E2EEInfoDialogFragment hilt_VoipActivityV2_E2EEInfoDialogFragment = (Hilt_VoipActivityV2_E2EEInfoDialogFragment) this;
            if (hilt_VoipActivityV2_E2EEInfoDialogFragment.A01) {
                return;
            }
            hilt_VoipActivityV2_E2EEInfoDialogFragment.A01 = true;
            ((C0CS) hilt_VoipActivityV2_E2EEInfoDialogFragment.generatedComponent()).A3J((VoipActivityV2.E2EEInfoDialogFragment) hilt_VoipActivityV2_E2EEInfoDialogFragment);
        } else if (this instanceof Hilt_MaximizedParticipantVideoDialogFragment) {
            Hilt_MaximizedParticipantVideoDialogFragment hilt_MaximizedParticipantVideoDialogFragment = (Hilt_MaximizedParticipantVideoDialogFragment) this;
            if (hilt_MaximizedParticipantVideoDialogFragment.A01) {
                return;
            }
            hilt_MaximizedParticipantVideoDialogFragment.A01 = true;
            ((C0CS) hilt_MaximizedParticipantVideoDialogFragment.generatedComponent()).A3H((MaximizedParticipantVideoDialogFragment) hilt_MaximizedParticipantVideoDialogFragment);
        } else if (this instanceof Hilt_JoinableEducationDialogFragment) {
            Hilt_JoinableEducationDialogFragment hilt_JoinableEducationDialogFragment = (Hilt_JoinableEducationDialogFragment) this;
            if (hilt_JoinableEducationDialogFragment.A01) {
                return;
            }
            hilt_JoinableEducationDialogFragment.A01 = true;
            ((C0CS) hilt_JoinableEducationDialogFragment.generatedComponent()).A3G((JoinableEducationDialogFragment) hilt_JoinableEducationDialogFragment);
        } else if (this instanceof Hilt_CallsFragment_ClearCallLogDialogFragment) {
            Hilt_CallsFragment_ClearCallLogDialogFragment hilt_CallsFragment_ClearCallLogDialogFragment = (Hilt_CallsFragment_ClearCallLogDialogFragment) this;
            if (hilt_CallsFragment_ClearCallLogDialogFragment.A01) {
                return;
            }
            hilt_CallsFragment_ClearCallLogDialogFragment.A01 = true;
            ((C0CS) hilt_CallsFragment_ClearCallLogDialogFragment.generatedComponent()).A3E((CallsFragment.ClearCallLogDialogFragment) hilt_CallsFragment_ClearCallLogDialogFragment);
        } else if (this instanceof Hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment) {
            Hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment = (Hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment) this;
            if (hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment.A01) {
                return;
            }
            hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment.A01 = true;
            ((C0CS) hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment.generatedComponent()).A3D((CallSpamActivity.ReportSpamOrBlockDialogFragment) hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment);
        } else if (this instanceof Hilt_DocumentWarningDialogFragment) {
            Hilt_DocumentWarningDialogFragment hilt_DocumentWarningDialogFragment = (Hilt_DocumentWarningDialogFragment) this;
            if (hilt_DocumentWarningDialogFragment.A01) {
                return;
            }
            hilt_DocumentWarningDialogFragment.A01 = true;
            ((C0CS) hilt_DocumentWarningDialogFragment.generatedComponent()).A3C((DocumentWarningDialogFragment) hilt_DocumentWarningDialogFragment);
        } else if (this instanceof Hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog) {
            Hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog = (Hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog) this;
            if (hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog.A01) {
                return;
            }
            hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog.A01 = true;
            ((C0CS) hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog.generatedComponent()).A3A((SettingsTwoFactorAuthActivity.ConfirmDisableDialog) hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog);
        } else if (this instanceof Hilt_SetEmailFragment_ConfirmSkipEmailDialog) {
            Hilt_SetEmailFragment_ConfirmSkipEmailDialog hilt_SetEmailFragment_ConfirmSkipEmailDialog = (Hilt_SetEmailFragment_ConfirmSkipEmailDialog) this;
            if (hilt_SetEmailFragment_ConfirmSkipEmailDialog.A01) {
                return;
            }
            hilt_SetEmailFragment_ConfirmSkipEmailDialog.A01 = true;
            ((C0CS) hilt_SetEmailFragment_ConfirmSkipEmailDialog.generatedComponent()).A38((SetEmailFragment.ConfirmSkipEmailDialog) hilt_SetEmailFragment_ConfirmSkipEmailDialog);
        } else if (this instanceof Hilt_StorageUsageDeleteMessagesDialogFragment) {
            Hilt_StorageUsageDeleteMessagesDialogFragment hilt_StorageUsageDeleteMessagesDialogFragment = (Hilt_StorageUsageDeleteMessagesDialogFragment) this;
            if (hilt_StorageUsageDeleteMessagesDialogFragment.A01) {
                return;
            }
            hilt_StorageUsageDeleteMessagesDialogFragment.A01 = true;
            ((C0CS) hilt_StorageUsageDeleteMessagesDialogFragment.generatedComponent()).A32((StorageUsageDeleteMessagesDialogFragment) hilt_StorageUsageDeleteMessagesDialogFragment);
        } else if (this instanceof Hilt_StorageUsageDeleteCompleteDialogFragment) {
            Hilt_StorageUsageDeleteCompleteDialogFragment hilt_StorageUsageDeleteCompleteDialogFragment = (Hilt_StorageUsageDeleteCompleteDialogFragment) this;
            if (hilt_StorageUsageDeleteCompleteDialogFragment.A01) {
                return;
            }
            hilt_StorageUsageDeleteCompleteDialogFragment.A01 = true;
            ((C0CS) hilt_StorageUsageDeleteCompleteDialogFragment.generatedComponent()).A31((StorageUsageDeleteCompleteDialogFragment) hilt_StorageUsageDeleteCompleteDialogFragment);
        } else if (this instanceof Hilt_ThirdPartyPackPage_StickerBlockedDialogFragment) {
            Hilt_ThirdPartyPackPage_StickerBlockedDialogFragment hilt_ThirdPartyPackPage_StickerBlockedDialogFragment = (Hilt_ThirdPartyPackPage_StickerBlockedDialogFragment) this;
            if (hilt_ThirdPartyPackPage_StickerBlockedDialogFragment.A01) {
                return;
            }
            hilt_ThirdPartyPackPage_StickerBlockedDialogFragment.A01 = true;
            ((C0CS) hilt_ThirdPartyPackPage_StickerBlockedDialogFragment.generatedComponent()).A30((ThirdPartyPackPage$StickerBlockedDialogFragment) hilt_ThirdPartyPackPage_StickerBlockedDialogFragment);
        } else if (this instanceof Hilt_StickerInfoDialogFragment) {
            Hilt_StickerInfoDialogFragment hilt_StickerInfoDialogFragment = (Hilt_StickerInfoDialogFragment) this;
            if (hilt_StickerInfoDialogFragment.A01) {
                return;
            }
            hilt_StickerInfoDialogFragment.A01 = true;
            ((C0CS) hilt_StickerInfoDialogFragment.generatedComponent()).A2w((StickerInfoDialogFragment) hilt_StickerInfoDialogFragment);
        } else if (this instanceof Hilt_StarStickerFromPickerDialogFragment) {
            Hilt_StarStickerFromPickerDialogFragment hilt_StarStickerFromPickerDialogFragment = (Hilt_StarStickerFromPickerDialogFragment) this;
            if (hilt_StarStickerFromPickerDialogFragment.A01) {
                return;
            }
            hilt_StarStickerFromPickerDialogFragment.A01 = true;
            ((C0CS) hilt_StarStickerFromPickerDialogFragment.generatedComponent()).A2v((StarStickerFromPickerDialogFragment) hilt_StarStickerFromPickerDialogFragment);
        } else if (this instanceof Hilt_StarOrRemoveFromRecentsStickerDialogFragment) {
            Hilt_StarOrRemoveFromRecentsStickerDialogFragment hilt_StarOrRemoveFromRecentsStickerDialogFragment = (Hilt_StarOrRemoveFromRecentsStickerDialogFragment) this;
            if (hilt_StarOrRemoveFromRecentsStickerDialogFragment.A01) {
                return;
            }
            hilt_StarOrRemoveFromRecentsStickerDialogFragment.A01 = true;
            ((C0CS) hilt_StarOrRemoveFromRecentsStickerDialogFragment.generatedComponent()).A2u((StarOrRemoveFromRecentsStickerDialogFragment) hilt_StarOrRemoveFromRecentsStickerDialogFragment);
        } else if (this instanceof Hilt_RemoveStickerFromFavoritesDialogFragment) {
            Hilt_RemoveStickerFromFavoritesDialogFragment hilt_RemoveStickerFromFavoritesDialogFragment = (Hilt_RemoveStickerFromFavoritesDialogFragment) this;
            if (hilt_RemoveStickerFromFavoritesDialogFragment.A01) {
                return;
            }
            hilt_RemoveStickerFromFavoritesDialogFragment.A01 = true;
            ((C0CS) hilt_RemoveStickerFromFavoritesDialogFragment.generatedComponent()).A2t((RemoveStickerFromFavoritesDialogFragment) hilt_RemoveStickerFromFavoritesDialogFragment);
        } else if (this instanceof Hilt_ConfirmPackDeleteDialogFragment) {
            Hilt_ConfirmPackDeleteDialogFragment hilt_ConfirmPackDeleteDialogFragment = (Hilt_ConfirmPackDeleteDialogFragment) this;
            if (hilt_ConfirmPackDeleteDialogFragment.A01) {
                return;
            }
            hilt_ConfirmPackDeleteDialogFragment.A01 = true;
            ((C0CS) hilt_ConfirmPackDeleteDialogFragment.generatedComponent()).A2s((ConfirmPackDeleteDialogFragment) hilt_ConfirmPackDeleteDialogFragment);
        } else if (this instanceof Hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment) {
            Hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment = (Hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment) this;
            if (hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment.A01) {
                return;
            }
            hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment.A01 = true;
            ((C0CS) hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment.generatedComponent()).A2r((AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment) hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment);
        } else if (this instanceof Hilt_StatusDeleteDialogFragment) {
            Hilt_StatusDeleteDialogFragment hilt_StatusDeleteDialogFragment = (Hilt_StatusDeleteDialogFragment) this;
            if (hilt_StatusDeleteDialogFragment.A01) {
                return;
            }
            hilt_StatusDeleteDialogFragment.A01 = true;
            ((C0CS) hilt_StatusDeleteDialogFragment.generatedComponent()).A2n((StatusDeleteDialogFragment) hilt_StatusDeleteDialogFragment);
        } else if (this instanceof Hilt_StatusConfirmUnmuteDialogFragment) {
            Hilt_StatusConfirmUnmuteDialogFragment hilt_StatusConfirmUnmuteDialogFragment = (Hilt_StatusConfirmUnmuteDialogFragment) this;
            if (hilt_StatusConfirmUnmuteDialogFragment.A01) {
                return;
            }
            hilt_StatusConfirmUnmuteDialogFragment.A01 = true;
            ((C0CS) hilt_StatusConfirmUnmuteDialogFragment.generatedComponent()).A2m((StatusConfirmUnmuteDialogFragment) hilt_StatusConfirmUnmuteDialogFragment);
        } else if (this instanceof Hilt_StatusConfirmMuteDialogFragment) {
            Hilt_StatusConfirmMuteDialogFragment hilt_StatusConfirmMuteDialogFragment = (Hilt_StatusConfirmMuteDialogFragment) this;
            if (hilt_StatusConfirmMuteDialogFragment.A01) {
                return;
            }
            hilt_StatusConfirmMuteDialogFragment.A01 = true;
            ((C0CS) hilt_StatusConfirmMuteDialogFragment.generatedComponent()).A2l((StatusConfirmMuteDialogFragment) hilt_StatusConfirmMuteDialogFragment);
        } else if (this instanceof Hilt_FirstStatusConfirmationDialogFragment) {
            Hilt_FirstStatusConfirmationDialogFragment hilt_FirstStatusConfirmationDialogFragment = (Hilt_FirstStatusConfirmationDialogFragment) this;
            if (hilt_FirstStatusConfirmationDialogFragment.A01) {
                return;
            }
            hilt_FirstStatusConfirmationDialogFragment.A01 = true;
            ((C0CS) hilt_FirstStatusConfirmationDialogFragment.generatedComponent()).A2k((FirstStatusConfirmationDialogFragment) hilt_FirstStatusConfirmationDialogFragment);
        } else if (this instanceof Hilt_WallpaperDownloadFailedDialogFragment) {
            Hilt_WallpaperDownloadFailedDialogFragment hilt_WallpaperDownloadFailedDialogFragment = (Hilt_WallpaperDownloadFailedDialogFragment) this;
            if (hilt_WallpaperDownloadFailedDialogFragment.A01) {
                return;
            }
            hilt_WallpaperDownloadFailedDialogFragment.A01 = true;
            ((C0CS) hilt_WallpaperDownloadFailedDialogFragment.generatedComponent()).A2i((WallpaperDownloadFailedDialogFragment) hilt_WallpaperDownloadFailedDialogFragment);
        } else if (this instanceof Hilt_SettingsNetworkUsage_ResetUsageConfirmationDialog) {
            Hilt_SettingsNetworkUsage_ResetUsageConfirmationDialog hilt_SettingsNetworkUsage_ResetUsageConfirmationDialog = (Hilt_SettingsNetworkUsage_ResetUsageConfirmationDialog) this;
            if (hilt_SettingsNetworkUsage_ResetUsageConfirmationDialog.A01) {
                return;
            }
            hilt_SettingsNetworkUsage_ResetUsageConfirmationDialog.A01 = true;
            ((C0CS) hilt_SettingsNetworkUsage_ResetUsageConfirmationDialog.generatedComponent()).A2h((SettingsNetworkUsage.ResetUsageConfirmationDialog) hilt_SettingsNetworkUsage_ResetUsageConfirmationDialog);
        } else if (this instanceof Hilt_MultiSelectionDialogFragment) {
            Hilt_MultiSelectionDialogFragment hilt_MultiSelectionDialogFragment = (Hilt_MultiSelectionDialogFragment) this;
            if (hilt_MultiSelectionDialogFragment.A01) {
                return;
            }
            hilt_MultiSelectionDialogFragment.A01 = true;
            ((C0CS) hilt_MultiSelectionDialogFragment.generatedComponent()).A2e((MultiSelectionDialogFragment) hilt_MultiSelectionDialogFragment);
        } else if (this instanceof Hilt_ShareReportConfirmationDialogFragment) {
            Hilt_ShareReportConfirmationDialogFragment hilt_ShareReportConfirmationDialogFragment = (Hilt_ShareReportConfirmationDialogFragment) this;
            if (hilt_ShareReportConfirmationDialogFragment.A01) {
                return;
            }
            hilt_ShareReportConfirmationDialogFragment.A01 = true;
            ((C0CS) hilt_ShareReportConfirmationDialogFragment.generatedComponent()).A2c((ShareReportConfirmationDialogFragment) hilt_ShareReportConfirmationDialogFragment);
        } else if (this instanceof Hilt_DeleteReportConfirmationDialogFragment) {
            Hilt_DeleteReportConfirmationDialogFragment hilt_DeleteReportConfirmationDialogFragment = (Hilt_DeleteReportConfirmationDialogFragment) this;
            if (hilt_DeleteReportConfirmationDialogFragment.A01) {
                return;
            }
            hilt_DeleteReportConfirmationDialogFragment.A01 = true;
            ((C0CS) hilt_DeleteReportConfirmationDialogFragment.generatedComponent()).A2b((DeleteReportConfirmationDialogFragment) hilt_DeleteReportConfirmationDialogFragment);
        } else if (this instanceof Hilt_VerifyTwoFactorAuth_ConfirmWipe) {
            Hilt_VerifyTwoFactorAuth_ConfirmWipe hilt_VerifyTwoFactorAuth_ConfirmWipe = (Hilt_VerifyTwoFactorAuth_ConfirmWipe) this;
            if (hilt_VerifyTwoFactorAuth_ConfirmWipe.A01) {
                return;
            }
            hilt_VerifyTwoFactorAuth_ConfirmWipe.A01 = true;
            ((C0CS) hilt_VerifyTwoFactorAuth_ConfirmWipe.generatedComponent()).A2a((VerifyTwoFactorAuth.ConfirmWipe) hilt_VerifyTwoFactorAuth_ConfirmWipe);
        } else if (this instanceof Hilt_VerifyTwoFactorAuth_ConfirmResetCode) {
            Hilt_VerifyTwoFactorAuth_ConfirmResetCode hilt_VerifyTwoFactorAuth_ConfirmResetCode = (Hilt_VerifyTwoFactorAuth_ConfirmResetCode) this;
            if (hilt_VerifyTwoFactorAuth_ConfirmResetCode.A01) {
                return;
            }
            hilt_VerifyTwoFactorAuth_ConfirmResetCode.A01 = true;
            ((C0CS) hilt_VerifyTwoFactorAuth_ConfirmResetCode.generatedComponent()).A2Z((VerifyTwoFactorAuth.ConfirmResetCode) hilt_VerifyTwoFactorAuth_ConfirmResetCode);
        } else if (this instanceof Hilt_SelectPhoneNumberDialog) {
            Hilt_SelectPhoneNumberDialog hilt_SelectPhoneNumberDialog = (Hilt_SelectPhoneNumberDialog) this;
            if (hilt_SelectPhoneNumberDialog.A01) {
                return;
            }
            hilt_SelectPhoneNumberDialog.A01 = true;
            ((C0CS) hilt_SelectPhoneNumberDialog.generatedComponent()).A2Y((SelectPhoneNumberDialog) hilt_SelectPhoneNumberDialog);
        } else if (this instanceof Hilt_WebCodeDialogFragment) {
            Hilt_WebCodeDialogFragment hilt_WebCodeDialogFragment = (Hilt_WebCodeDialogFragment) this;
            if (hilt_WebCodeDialogFragment.A01) {
                return;
            }
            hilt_WebCodeDialogFragment.A01 = true;
            ((C0CS) hilt_WebCodeDialogFragment.generatedComponent()).A2X((WebCodeDialogFragment) hilt_WebCodeDialogFragment);
        } else if (this instanceof Hilt_ErrorDialogFragment) {
            Hilt_ErrorDialogFragment hilt_ErrorDialogFragment = (Hilt_ErrorDialogFragment) this;
            if (hilt_ErrorDialogFragment.A01) {
                return;
            }
            hilt_ErrorDialogFragment.A01 = true;
            ((C0CS) hilt_ErrorDialogFragment.generatedComponent()).A2U((ErrorDialogFragment) hilt_ErrorDialogFragment);
        } else if (this instanceof Hilt_BaseQrActivity_TryAgainDialogFragment) {
            Hilt_BaseQrActivity_TryAgainDialogFragment hilt_BaseQrActivity_TryAgainDialogFragment = (Hilt_BaseQrActivity_TryAgainDialogFragment) this;
            if (hilt_BaseQrActivity_TryAgainDialogFragment.A01) {
                return;
            }
            hilt_BaseQrActivity_TryAgainDialogFragment.A01 = true;
            ((C0CS) hilt_BaseQrActivity_TryAgainDialogFragment.generatedComponent()).A2S((BaseQrActivity$TryAgainDialogFragment) hilt_BaseQrActivity_TryAgainDialogFragment);
        } else if (this instanceof Hilt_BaseQrActivity_RevokeCodeDialogFragment) {
            Hilt_BaseQrActivity_RevokeCodeDialogFragment hilt_BaseQrActivity_RevokeCodeDialogFragment = (Hilt_BaseQrActivity_RevokeCodeDialogFragment) this;
            if (hilt_BaseQrActivity_RevokeCodeDialogFragment.A01) {
                return;
            }
            hilt_BaseQrActivity_RevokeCodeDialogFragment.A01 = true;
            ((C0CS) hilt_BaseQrActivity_RevokeCodeDialogFragment.generatedComponent()).A2R((BaseQrActivity$RevokeCodeDialogFragment) hilt_BaseQrActivity_RevokeCodeDialogFragment);
        } else if (this instanceof Hilt_QrEducationDialogFragment) {
            Hilt_QrEducationDialogFragment hilt_QrEducationDialogFragment = (Hilt_QrEducationDialogFragment) this;
            if (hilt_QrEducationDialogFragment.A01) {
                return;
            }
            hilt_QrEducationDialogFragment.A01 = true;
            ((C0CS) hilt_QrEducationDialogFragment.generatedComponent()).A2Q((QrEducationDialogFragment) hilt_QrEducationDialogFragment);
        } else if (this instanceof Hilt_ResetProfilePhoto_ConfirmDialogFragment) {
            Hilt_ResetProfilePhoto_ConfirmDialogFragment hilt_ResetProfilePhoto_ConfirmDialogFragment = (Hilt_ResetProfilePhoto_ConfirmDialogFragment) this;
            if (hilt_ResetProfilePhoto_ConfirmDialogFragment.A01) {
                return;
            }
            hilt_ResetProfilePhoto_ConfirmDialogFragment.A01 = true;
            ((C0CS) hilt_ResetProfilePhoto_ConfirmDialogFragment.generatedComponent()).A2P((ResetProfilePhoto.ConfirmDialogFragment) hilt_ResetProfilePhoto_ConfirmDialogFragment);
        } else if (this instanceof Hilt_ResetGroupPhoto_ConfirmDialogFragment) {
            Hilt_ResetGroupPhoto_ConfirmDialogFragment hilt_ResetGroupPhoto_ConfirmDialogFragment = (Hilt_ResetGroupPhoto_ConfirmDialogFragment) this;
            if (hilt_ResetGroupPhoto_ConfirmDialogFragment.A01) {
                return;
            }
            hilt_ResetGroupPhoto_ConfirmDialogFragment.A01 = true;
            ((C0CS) hilt_ResetGroupPhoto_ConfirmDialogFragment.generatedComponent()).A2O((ResetGroupPhoto.ConfirmDialogFragment) hilt_ResetGroupPhoto_ConfirmDialogFragment);
        } else if (this instanceof Hilt_ConnectionUnavailableDialogFragment) {
            Hilt_ConnectionUnavailableDialogFragment hilt_ConnectionUnavailableDialogFragment = (Hilt_ConnectionUnavailableDialogFragment) this;
            if (hilt_ConnectionUnavailableDialogFragment.A01) {
                return;
            }
            hilt_ConnectionUnavailableDialogFragment.A01 = true;
            ((C0CS) hilt_ConnectionUnavailableDialogFragment.generatedComponent()).A2J((ConnectionUnavailableDialogFragment) hilt_ConnectionUnavailableDialogFragment);
        } else if (this instanceof ConnectionProgressDialogFragment) {
            ConnectionProgressDialogFragment connectionProgressDialogFragment = (ConnectionProgressDialogFragment) this;
            if (connectionProgressDialogFragment.A01) {
                return;
            }
            connectionProgressDialogFragment.A01 = true;
            ((C0CS) connectionProgressDialogFragment.generatedComponent()).A2I(connectionProgressDialogFragment);
        } else if (this instanceof Hilt_PaymentsUnavailableDialogFragment) {
            Hilt_PaymentsUnavailableDialogFragment hilt_PaymentsUnavailableDialogFragment = (Hilt_PaymentsUnavailableDialogFragment) this;
            if (hilt_PaymentsUnavailableDialogFragment.A01) {
                return;
            }
            hilt_PaymentsUnavailableDialogFragment.A01 = true;
            ((C0CS) hilt_PaymentsUnavailableDialogFragment.generatedComponent()).A2F((PaymentsUnavailableDialogFragment) hilt_PaymentsUnavailableDialogFragment);
        } else if (this instanceof Hilt_RequestPermissionsDialogFragment) {
            Hilt_RequestPermissionsDialogFragment hilt_RequestPermissionsDialogFragment = (Hilt_RequestPermissionsDialogFragment) this;
            if (hilt_RequestPermissionsDialogFragment.A01) {
                return;
            }
            hilt_RequestPermissionsDialogFragment.A01 = true;
            ((C0CS) hilt_RequestPermissionsDialogFragment.generatedComponent()).A20((RequestPermissionsDialogFragment) hilt_RequestPermissionsDialogFragment);
        } else if (this instanceof Hilt_RevokeNuxDialogFragment) {
            Hilt_RevokeNuxDialogFragment hilt_RevokeNuxDialogFragment = (Hilt_RevokeNuxDialogFragment) this;
            if (hilt_RevokeNuxDialogFragment.A01) {
                return;
            }
            hilt_RevokeNuxDialogFragment.A01 = true;
            ((C0CS) hilt_RevokeNuxDialogFragment.generatedComponent()).A1z((RevokeNuxDialogFragment) hilt_RevokeNuxDialogFragment);
        } else if (this instanceof Hilt_DeleteMessagesDialogFragment) {
            Hilt_DeleteMessagesDialogFragment hilt_DeleteMessagesDialogFragment = (Hilt_DeleteMessagesDialogFragment) this;
            if (hilt_DeleteMessagesDialogFragment.A01) {
                return;
            }
            hilt_DeleteMessagesDialogFragment.A01 = true;
            ((C0CS) hilt_DeleteMessagesDialogFragment.generatedComponent()).A1x((DeleteMessagesDialogFragment) hilt_DeleteMessagesDialogFragment);
        } else if (this instanceof Hilt_StopLiveLocationDialogFragment) {
            Hilt_StopLiveLocationDialogFragment hilt_StopLiveLocationDialogFragment = (Hilt_StopLiveLocationDialogFragment) this;
            if (hilt_StopLiveLocationDialogFragment.A01) {
                return;
            }
            hilt_StopLiveLocationDialogFragment.A01 = true;
            ((C0CS) hilt_StopLiveLocationDialogFragment.generatedComponent()).A1s((StopLiveLocationDialogFragment) hilt_StopLiveLocationDialogFragment);
        } else if (this instanceof Hilt_RevokeInviteDialogFragment) {
            Hilt_RevokeInviteDialogFragment hilt_RevokeInviteDialogFragment = (Hilt_RevokeInviteDialogFragment) this;
            if (hilt_RevokeInviteDialogFragment.A01) {
                return;
            }
            hilt_RevokeInviteDialogFragment.A01 = true;
            ((C0CS) hilt_RevokeInviteDialogFragment.generatedComponent()).A1r((RevokeInviteDialogFragment) hilt_RevokeInviteDialogFragment);
        } else if (this instanceof Hilt_PromptSendGroupInviteDialogFragment) {
            Hilt_PromptSendGroupInviteDialogFragment hilt_PromptSendGroupInviteDialogFragment = (Hilt_PromptSendGroupInviteDialogFragment) this;
            if (hilt_PromptSendGroupInviteDialogFragment.A01) {
                return;
            }
            hilt_PromptSendGroupInviteDialogFragment.A01 = true;
            ((C0CS) hilt_PromptSendGroupInviteDialogFragment.generatedComponent()).A1q((PromptSendGroupInviteDialogFragment) hilt_PromptSendGroupInviteDialogFragment);
        } else if (this instanceof Hilt_NobodyDeprecatedDialogFragment) {
            Hilt_NobodyDeprecatedDialogFragment hilt_NobodyDeprecatedDialogFragment = (Hilt_NobodyDeprecatedDialogFragment) this;
            if (hilt_NobodyDeprecatedDialogFragment.A01) {
                return;
            }
            hilt_NobodyDeprecatedDialogFragment.A01 = true;
            ((C0CS) hilt_NobodyDeprecatedDialogFragment.generatedComponent()).A1p((NobodyDeprecatedDialogFragment) hilt_NobodyDeprecatedDialogFragment);
        } else if (this instanceof Hilt_GoogleSearchDialogFragment) {
            Hilt_GoogleSearchDialogFragment hilt_GoogleSearchDialogFragment = (Hilt_GoogleSearchDialogFragment) this;
            if (hilt_GoogleSearchDialogFragment.A01) {
                return;
            }
            hilt_GoogleSearchDialogFragment.A01 = true;
            ((C0CS) hilt_GoogleSearchDialogFragment.generatedComponent()).A1n((GoogleSearchDialogFragment) hilt_GoogleSearchDialogFragment);
        } else if (this instanceof Hilt_GroupChatInfo_DescriptionConflictDialogFragment) {
            Hilt_GroupChatInfo_DescriptionConflictDialogFragment hilt_GroupChatInfo_DescriptionConflictDialogFragment = (Hilt_GroupChatInfo_DescriptionConflictDialogFragment) this;
            if (hilt_GroupChatInfo_DescriptionConflictDialogFragment.A01) {
                return;
            }
            hilt_GroupChatInfo_DescriptionConflictDialogFragment.A01 = true;
            ((C0CS) hilt_GroupChatInfo_DescriptionConflictDialogFragment.generatedComponent()).A1i((GroupChatInfo.DescriptionConflictDialogFragment) hilt_GroupChatInfo_DescriptionConflictDialogFragment);
        } else if (this instanceof Hilt_StarOrRemoveFromRecentGifsDialogFragment) {
            Hilt_StarOrRemoveFromRecentGifsDialogFragment hilt_StarOrRemoveFromRecentGifsDialogFragment = (Hilt_StarOrRemoveFromRecentGifsDialogFragment) this;
            if (hilt_StarOrRemoveFromRecentGifsDialogFragment.A01) {
                return;
            }
            hilt_StarOrRemoveFromRecentGifsDialogFragment.A01 = true;
            ((C0CS) hilt_StarOrRemoveFromRecentGifsDialogFragment.generatedComponent()).A1h((StarOrRemoveFromRecentGifsDialogFragment) hilt_StarOrRemoveFromRecentGifsDialogFragment);
        } else if (this instanceof Hilt_StarDownloadableGifDialogFragment) {
            Hilt_StarDownloadableGifDialogFragment hilt_StarDownloadableGifDialogFragment = (Hilt_StarDownloadableGifDialogFragment) this;
            if (hilt_StarDownloadableGifDialogFragment.A01) {
                return;
            }
            hilt_StarDownloadableGifDialogFragment.A01 = true;
            ((C0CS) hilt_StarDownloadableGifDialogFragment.generatedComponent()).A1g((StarDownloadableGifDialogFragment) hilt_StarDownloadableGifDialogFragment);
        } else if (this instanceof Hilt_RemoveGifFromFavoritesDialogFragment) {
            Hilt_RemoveGifFromFavoritesDialogFragment hilt_RemoveGifFromFavoritesDialogFragment = (Hilt_RemoveGifFromFavoritesDialogFragment) this;
            if (hilt_RemoveGifFromFavoritesDialogFragment.A01) {
                return;
            }
            hilt_RemoveGifFromFavoritesDialogFragment.A01 = true;
            ((C0CS) hilt_RemoveGifFromFavoritesDialogFragment.generatedComponent()).A1f((RemoveGifFromFavoritesDialogFragment) hilt_RemoveGifFromFavoritesDialogFragment);
        } else if (this instanceof Hilt_RemoveDownloadableGifFromFavoritesDialogFragment) {
            Hilt_RemoveDownloadableGifFromFavoritesDialogFragment hilt_RemoveDownloadableGifFromFavoritesDialogFragment = (Hilt_RemoveDownloadableGifFromFavoritesDialogFragment) this;
            if (hilt_RemoveDownloadableGifFromFavoritesDialogFragment.A01) {
                return;
            }
            hilt_RemoveDownloadableGifFromFavoritesDialogFragment.A01 = true;
            ((C0CS) hilt_RemoveDownloadableGifFromFavoritesDialogFragment.generatedComponent()).A1e((RemoveDownloadableGifFromFavoritesDialogFragment) hilt_RemoveDownloadableGifFromFavoritesDialogFragment);
        } else if (this instanceof Hilt_ViewOnceNUXDialog) {
            Hilt_ViewOnceNUXDialog hilt_ViewOnceNUXDialog = (Hilt_ViewOnceNUXDialog) this;
            if (hilt_ViewOnceNUXDialog.A01) {
                return;
            }
            hilt_ViewOnceNUXDialog.A01 = true;
            ((C0CS) hilt_ViewOnceNUXDialog.generatedComponent()).A1V((ViewOnceNUXDialog) hilt_ViewOnceNUXDialog);
        } else if (this instanceof Hilt_EphemeralNUXDialog) {
            Hilt_EphemeralNUXDialog hilt_EphemeralNUXDialog = (Hilt_EphemeralNUXDialog) this;
            if (hilt_EphemeralNUXDialog.A01) {
                return;
            }
            hilt_EphemeralNUXDialog.A01 = true;
            ((C0CS) hilt_EphemeralNUXDialog.generatedComponent()).A1U((EphemeralNUXDialog) hilt_EphemeralNUXDialog);
        } else if (this instanceof Hilt_RoomsRedirectDialogFragment) {
            Hilt_RoomsRedirectDialogFragment hilt_RoomsRedirectDialogFragment = (Hilt_RoomsRedirectDialogFragment) this;
            if (hilt_RoomsRedirectDialogFragment.A01) {
                return;
            }
            hilt_RoomsRedirectDialogFragment.A01 = true;
            ((C0CS) hilt_RoomsRedirectDialogFragment.generatedComponent()).A1S((RoomsRedirectDialogFragment) hilt_RoomsRedirectDialogFragment);
        } else if (this instanceof Hilt_ProgressDialogFragment) {
            Hilt_ProgressDialogFragment hilt_ProgressDialogFragment = (Hilt_ProgressDialogFragment) this;
            if (hilt_ProgressDialogFragment.A01) {
                return;
            }
            hilt_ProgressDialogFragment.A01 = true;
            ((C0CS) hilt_ProgressDialogFragment.generatedComponent()).A1Q((ProgressDialogFragment) hilt_ProgressDialogFragment);
        } else if (this instanceof Hilt_CreateOrAddToContactsDialog) {
            Hilt_CreateOrAddToContactsDialog hilt_CreateOrAddToContactsDialog = (Hilt_CreateOrAddToContactsDialog) this;
            if (hilt_CreateOrAddToContactsDialog.A01) {
                return;
            }
            hilt_CreateOrAddToContactsDialog.A01 = true;
            ((C0CS) hilt_CreateOrAddToContactsDialog.generatedComponent()).A1N((CreateOrAddToContactsDialog) hilt_CreateOrAddToContactsDialog);
        } else if (this instanceof Hilt_FAQLearnMoreDialogFragment) {
            Hilt_FAQLearnMoreDialogFragment hilt_FAQLearnMoreDialogFragment = (Hilt_FAQLearnMoreDialogFragment) this;
            if (!(hilt_FAQLearnMoreDialogFragment instanceof HFMLearnMoreDialogFragment)) {
                if (hilt_FAQLearnMoreDialogFragment.A01) {
                    return;
                }
                hilt_FAQLearnMoreDialogFragment.A01 = true;
                ((C0CS) hilt_FAQLearnMoreDialogFragment.generatedComponent()).A1O((FAQLearnMoreDialogFragment) hilt_FAQLearnMoreDialogFragment);
                return;
            }
            HFMLearnMoreDialogFragment hFMLearnMoreDialogFragment = (HFMLearnMoreDialogFragment) hilt_FAQLearnMoreDialogFragment;
            if (hFMLearnMoreDialogFragment.A02) {
                return;
            }
            hFMLearnMoreDialogFragment.A02 = true;
            ((C0CS) hFMLearnMoreDialogFragment.generatedComponent()).A1P(hFMLearnMoreDialogFragment);
        } else if (this instanceof Hilt_LeaveGroupsDialogFragment) {
            Hilt_LeaveGroupsDialogFragment hilt_LeaveGroupsDialogFragment = (Hilt_LeaveGroupsDialogFragment) this;
            if (hilt_LeaveGroupsDialogFragment.A01) {
                return;
            }
            hilt_LeaveGroupsDialogFragment.A01 = true;
            ((C0CS) hilt_LeaveGroupsDialogFragment.generatedComponent()).A1L((LeaveGroupsDialogFragment) hilt_LeaveGroupsDialogFragment);
        } else if (this instanceof Hilt_ConversationsFragment_DeleteGroupDialogFragment) {
            Hilt_ConversationsFragment_DeleteGroupDialogFragment hilt_ConversationsFragment_DeleteGroupDialogFragment = (Hilt_ConversationsFragment_DeleteGroupDialogFragment) this;
            if (hilt_ConversationsFragment_DeleteGroupDialogFragment.A01) {
                return;
            }
            hilt_ConversationsFragment_DeleteGroupDialogFragment.A01 = true;
            ((C0CS) hilt_ConversationsFragment_DeleteGroupDialogFragment.generatedComponent()).A1J((ConversationsFragment.DeleteGroupDialogFragment) hilt_ConversationsFragment_DeleteGroupDialogFragment);
        } else if (this instanceof Hilt_ConversationsFragment_DeleteContactDialogFragment) {
            Hilt_ConversationsFragment_DeleteContactDialogFragment hilt_ConversationsFragment_DeleteContactDialogFragment = (Hilt_ConversationsFragment_DeleteContactDialogFragment) this;
            if (hilt_ConversationsFragment_DeleteContactDialogFragment.A01) {
                return;
            }
            hilt_ConversationsFragment_DeleteContactDialogFragment.A01 = true;
            ((C0CS) hilt_ConversationsFragment_DeleteContactDialogFragment.generatedComponent()).A1I((ConversationsFragment.DeleteContactDialogFragment) hilt_ConversationsFragment_DeleteContactDialogFragment);
        } else if (this instanceof Hilt_ConversationsFragment_DeleteBroadcastListDialogFragment) {
            Hilt_ConversationsFragment_DeleteBroadcastListDialogFragment hilt_ConversationsFragment_DeleteBroadcastListDialogFragment = (Hilt_ConversationsFragment_DeleteBroadcastListDialogFragment) this;
            if (hilt_ConversationsFragment_DeleteBroadcastListDialogFragment.A01) {
                return;
            }
            hilt_ConversationsFragment_DeleteBroadcastListDialogFragment.A01 = true;
            ((C0CS) hilt_ConversationsFragment_DeleteBroadcastListDialogFragment.generatedComponent()).A1H((ConversationsFragment.DeleteBroadcastListDialogFragment) hilt_ConversationsFragment_DeleteBroadcastListDialogFragment);
        } else if (this instanceof Hilt_ConversationsFragment_BulkDeleteConversationDialogFragment) {
            Hilt_ConversationsFragment_BulkDeleteConversationDialogFragment hilt_ConversationsFragment_BulkDeleteConversationDialogFragment = (Hilt_ConversationsFragment_BulkDeleteConversationDialogFragment) this;
            if (hilt_ConversationsFragment_BulkDeleteConversationDialogFragment.A01) {
                return;
            }
            hilt_ConversationsFragment_BulkDeleteConversationDialogFragment.A01 = true;
            ((C0CS) hilt_ConversationsFragment_BulkDeleteConversationDialogFragment.generatedComponent()).A1G((ConversationsFragment.BulkDeleteConversationDialogFragment) hilt_ConversationsFragment_BulkDeleteConversationDialogFragment);
        } else if (this instanceof Hilt_StarredMessagesActivity_UnstarAllDialogFragment) {
            Hilt_StarredMessagesActivity_UnstarAllDialogFragment hilt_StarredMessagesActivity_UnstarAllDialogFragment = (Hilt_StarredMessagesActivity_UnstarAllDialogFragment) this;
            if (hilt_StarredMessagesActivity_UnstarAllDialogFragment.A01) {
                return;
            }
            hilt_StarredMessagesActivity_UnstarAllDialogFragment.A01 = true;
            ((C0CS) hilt_StarredMessagesActivity_UnstarAllDialogFragment.generatedComponent()).A1D((StarredMessagesActivity.UnstarAllDialogFragment) hilt_StarredMessagesActivity_UnstarAllDialogFragment);
        } else if (this instanceof Hilt_VerifiedBusinessInfoDialogFragment) {
            Hilt_VerifiedBusinessInfoDialogFragment hilt_VerifiedBusinessInfoDialogFragment = (Hilt_VerifiedBusinessInfoDialogFragment) this;
            if (hilt_VerifiedBusinessInfoDialogFragment.A01) {
                return;
            }
            hilt_VerifiedBusinessInfoDialogFragment.A01 = true;
            ((C0CS) hilt_VerifiedBusinessInfoDialogFragment.generatedComponent()).A1C((VerifiedBusinessInfoDialogFragment) hilt_VerifiedBusinessInfoDialogFragment);
        } else if (this instanceof Hilt_EncryptionChangeDialogFragment) {
            Hilt_EncryptionChangeDialogFragment hilt_EncryptionChangeDialogFragment = (Hilt_EncryptionChangeDialogFragment) this;
            if (hilt_EncryptionChangeDialogFragment.A01) {
                return;
            }
            hilt_EncryptionChangeDialogFragment.A01 = true;
            ((C0CS) hilt_EncryptionChangeDialogFragment.generatedComponent()).A1A((EncryptionChangeDialogFragment) hilt_EncryptionChangeDialogFragment);
        } else if (this instanceof Hilt_ConversationRow_ConversationRowDialogFragment) {
            Hilt_ConversationRow_ConversationRowDialogFragment hilt_ConversationRow_ConversationRowDialogFragment = (Hilt_ConversationRow_ConversationRowDialogFragment) this;
            if (hilt_ConversationRow_ConversationRowDialogFragment.A01) {
                return;
            }
            hilt_ConversationRow_ConversationRowDialogFragment.A01 = true;
            ((C0CS) hilt_ConversationRow_ConversationRowDialogFragment.generatedComponent()).A17((ConversationRow$ConversationRowDialogFragment) hilt_ConversationRow_ConversationRowDialogFragment);
        } else if (this instanceof Hilt_ConversationRowContact_MessageSharedContactDialogFragment) {
            Hilt_ConversationRowContact_MessageSharedContactDialogFragment hilt_ConversationRowContact_MessageSharedContactDialogFragment = (Hilt_ConversationRowContact_MessageSharedContactDialogFragment) this;
            if (hilt_ConversationRowContact_MessageSharedContactDialogFragment.A01) {
                return;
            }
            hilt_ConversationRowContact_MessageSharedContactDialogFragment.A01 = true;
            ((C0CS) hilt_ConversationRowContact_MessageSharedContactDialogFragment.generatedComponent()).A18((ConversationRowContact$MessageSharedContactDialogFragment) hilt_ConversationRowContact_MessageSharedContactDialogFragment);
        } else if (this instanceof Hilt_BusinessTransitionInfoDialogFragment) {
            Hilt_BusinessTransitionInfoDialogFragment hilt_BusinessTransitionInfoDialogFragment = (Hilt_BusinessTransitionInfoDialogFragment) this;
            if (hilt_BusinessTransitionInfoDialogFragment.A01) {
                return;
            }
            hilt_BusinessTransitionInfoDialogFragment.A01 = true;
            ((C0CS) hilt_BusinessTransitionInfoDialogFragment.generatedComponent()).A16((BusinessTransitionInfoDialogFragment) hilt_BusinessTransitionInfoDialogFragment);
        } else if (this instanceof Hilt_ChatMediaVisibilityDialog) {
            Hilt_ChatMediaVisibilityDialog hilt_ChatMediaVisibilityDialog = (Hilt_ChatMediaVisibilityDialog) this;
            if (hilt_ChatMediaVisibilityDialog.A01) {
                return;
            }
            hilt_ChatMediaVisibilityDialog.A01 = true;
            ((C0CS) hilt_ChatMediaVisibilityDialog.generatedComponent()).A15((ChatMediaVisibilityDialog) hilt_ChatMediaVisibilityDialog);
        } else if (this instanceof Hilt_ChatMediaEphemeralVisibilityDialog) {
            Hilt_ChatMediaEphemeralVisibilityDialog hilt_ChatMediaEphemeralVisibilityDialog = (Hilt_ChatMediaEphemeralVisibilityDialog) this;
            if (hilt_ChatMediaEphemeralVisibilityDialog.A01) {
                return;
            }
            hilt_ChatMediaEphemeralVisibilityDialog.A01 = true;
            ((C0CS) hilt_ChatMediaEphemeralVisibilityDialog.generatedComponent()).A14((ChatMediaEphemeralVisibilityDialog) hilt_ChatMediaEphemeralVisibilityDialog);
        } else if (this instanceof Hilt_ChangeNumberNotificationDialogFragment) {
            Hilt_ChangeNumberNotificationDialogFragment hilt_ChangeNumberNotificationDialogFragment = (Hilt_ChangeNumberNotificationDialogFragment) this;
            if (hilt_ChangeNumberNotificationDialogFragment.A01) {
                return;
            }
            hilt_ChangeNumberNotificationDialogFragment.A01 = true;
            ((C0CS) hilt_ChangeNumberNotificationDialogFragment.generatedComponent()).A13((ChangeNumberNotificationDialogFragment) hilt_ChangeNumberNotificationDialogFragment);
        } else if (this instanceof Hilt_CapturePictureOrVideoDialogFragment) {
            Hilt_CapturePictureOrVideoDialogFragment hilt_CapturePictureOrVideoDialogFragment = (Hilt_CapturePictureOrVideoDialogFragment) this;
            if (hilt_CapturePictureOrVideoDialogFragment.A01) {
                return;
            }
            hilt_CapturePictureOrVideoDialogFragment.A01 = true;
            ((C0CS) hilt_CapturePictureOrVideoDialogFragment.generatedComponent()).A12((CapturePictureOrVideoDialogFragment) hilt_CapturePictureOrVideoDialogFragment);
        } else if (this instanceof Hilt_InviteToGroupCallConfirmationFragment) {
            Hilt_InviteToGroupCallConfirmationFragment hilt_InviteToGroupCallConfirmationFragment = (Hilt_InviteToGroupCallConfirmationFragment) this;
            if (hilt_InviteToGroupCallConfirmationFragment.A01) {
                return;
            }
            hilt_InviteToGroupCallConfirmationFragment.A01 = true;
            ((C0CS) hilt_InviteToGroupCallConfirmationFragment.generatedComponent()).A0z((InviteToGroupCallConfirmationFragment) hilt_InviteToGroupCallConfirmationFragment);
        } else if (this instanceof Hilt_BaseSharedPreviewDialogFragment) {
            Hilt_BaseSharedPreviewDialogFragment hilt_BaseSharedPreviewDialogFragment = (Hilt_BaseSharedPreviewDialogFragment) this;
            if (hilt_BaseSharedPreviewDialogFragment instanceof Hilt_SharedTextPreviewDialogFragment) {
                Hilt_SharedTextPreviewDialogFragment hilt_SharedTextPreviewDialogFragment = (Hilt_SharedTextPreviewDialogFragment) hilt_BaseSharedPreviewDialogFragment;
                if (hilt_SharedTextPreviewDialogFragment.A01) {
                    return;
                }
                hilt_SharedTextPreviewDialogFragment.A01 = true;
                ((C0CS) hilt_SharedTextPreviewDialogFragment.generatedComponent()).A11((SharedTextPreviewDialogFragment) hilt_SharedTextPreviewDialogFragment);
            } else if (!(hilt_BaseSharedPreviewDialogFragment instanceof Hilt_SharedFilePreviewDialogFragment)) {
                if (hilt_BaseSharedPreviewDialogFragment.A01) {
                    return;
                }
                hilt_BaseSharedPreviewDialogFragment.A01 = true;
                ((C0CS) hilt_BaseSharedPreviewDialogFragment.generatedComponent()).A0x((BaseSharedPreviewDialogFragment) hilt_BaseSharedPreviewDialogFragment);
            } else {
                Hilt_SharedFilePreviewDialogFragment hilt_SharedFilePreviewDialogFragment = (Hilt_SharedFilePreviewDialogFragment) hilt_BaseSharedPreviewDialogFragment;
                if (hilt_SharedFilePreviewDialogFragment.A01) {
                    return;
                }
                hilt_SharedFilePreviewDialogFragment.A01 = true;
                ((C0CS) hilt_SharedFilePreviewDialogFragment.generatedComponent()).A10((SharedFilePreviewDialogFragment) hilt_SharedFilePreviewDialogFragment);
            }
        } else if (this instanceof Hilt_FirstTimeExperienceDialogFragment) {
            Hilt_FirstTimeExperienceDialogFragment hilt_FirstTimeExperienceDialogFragment = (Hilt_FirstTimeExperienceDialogFragment) this;
            if (hilt_FirstTimeExperienceDialogFragment.A01) {
                return;
            }
            hilt_FirstTimeExperienceDialogFragment.A01 = true;
            ((C0CS) hilt_FirstTimeExperienceDialogFragment.generatedComponent()).A0w((FirstTimeExperienceDialogFragment) hilt_FirstTimeExperienceDialogFragment);
        } else if (this instanceof Hilt_WifiSpeedBumpDialogFragment) {
            Hilt_WifiSpeedBumpDialogFragment hilt_WifiSpeedBumpDialogFragment = (Hilt_WifiSpeedBumpDialogFragment) this;
            if (hilt_WifiSpeedBumpDialogFragment.A01) {
                return;
            }
            hilt_WifiSpeedBumpDialogFragment.A01 = true;
            ((C0CS) hilt_WifiSpeedBumpDialogFragment.generatedComponent()).A0v((WifiSpeedBumpDialogFragment) hilt_WifiSpeedBumpDialogFragment);
        } else if (this instanceof Hilt_LinkedDevicesLogoutOneDeviceConfirmationDialogFragment) {
            Hilt_LinkedDevicesLogoutOneDeviceConfirmationDialogFragment hilt_LinkedDevicesLogoutOneDeviceConfirmationDialogFragment = (Hilt_LinkedDevicesLogoutOneDeviceConfirmationDialogFragment) this;
            if (hilt_LinkedDevicesLogoutOneDeviceConfirmationDialogFragment.A01) {
                return;
            }
            hilt_LinkedDevicesLogoutOneDeviceConfirmationDialogFragment.A01 = true;
            ((C0CS) hilt_LinkedDevicesLogoutOneDeviceConfirmationDialogFragment.generatedComponent()).A0u((LinkedDevicesLogoutOneDeviceConfirmationDialogFragment) hilt_LinkedDevicesLogoutOneDeviceConfirmationDialogFragment);
        } else if (this instanceof Hilt_LinkedDevicesLogoutAllConfirmationDialogFragment) {
            Hilt_LinkedDevicesLogoutAllConfirmationDialogFragment hilt_LinkedDevicesLogoutAllConfirmationDialogFragment = (Hilt_LinkedDevicesLogoutAllConfirmationDialogFragment) this;
            if (hilt_LinkedDevicesLogoutAllConfirmationDialogFragment.A01) {
                return;
            }
            hilt_LinkedDevicesLogoutAllConfirmationDialogFragment.A01 = true;
            ((C0CS) hilt_LinkedDevicesLogoutAllConfirmationDialogFragment.generatedComponent()).A0t((LinkedDevicesLogoutAllConfirmationDialogFragment) hilt_LinkedDevicesLogoutAllConfirmationDialogFragment);
        } else if (this instanceof Hilt_LinkedDevicesDetailDialogFragment) {
            Hilt_LinkedDevicesDetailDialogFragment hilt_LinkedDevicesDetailDialogFragment = (Hilt_LinkedDevicesDetailDialogFragment) this;
            if (hilt_LinkedDevicesDetailDialogFragment.A01) {
                return;
            }
            hilt_LinkedDevicesDetailDialogFragment.A01 = true;
            ((C0CS) hilt_LinkedDevicesDetailDialogFragment.generatedComponent()).A0s((LinkedDevicesDetailDialogFragment) hilt_LinkedDevicesDetailDialogFragment);
        } else if (this instanceof Hilt_ChatInfoActivity_EncryptionExplanationDialogFragment) {
            Hilt_ChatInfoActivity_EncryptionExplanationDialogFragment hilt_ChatInfoActivity_EncryptionExplanationDialogFragment = (Hilt_ChatInfoActivity_EncryptionExplanationDialogFragment) this;
            if (hilt_ChatInfoActivity_EncryptionExplanationDialogFragment.A01) {
                return;
            }
            hilt_ChatInfoActivity_EncryptionExplanationDialogFragment.A01 = true;
            ((C0CS) hilt_ChatInfoActivity_EncryptionExplanationDialogFragment.generatedComponent()).A0r((ChatInfoActivity.EncryptionExplanationDialogFragment) hilt_ChatInfoActivity_EncryptionExplanationDialogFragment);
        } else if (this instanceof Hilt_UnblockDialogFragment) {
            Hilt_UnblockDialogFragment hilt_UnblockDialogFragment = (Hilt_UnblockDialogFragment) this;
            if (hilt_UnblockDialogFragment.A01) {
                return;
            }
            hilt_UnblockDialogFragment.A01 = true;
            ((C0CS) hilt_UnblockDialogFragment.generatedComponent()).A0o((UnblockDialogFragment) hilt_UnblockDialogFragment);
        } else if (this instanceof Hilt_BlockConfirmationDialogFragment) {
            Hilt_BlockConfirmationDialogFragment hilt_BlockConfirmationDialogFragment = (Hilt_BlockConfirmationDialogFragment) this;
            if (hilt_BlockConfirmationDialogFragment.A01) {
                return;
            }
            hilt_BlockConfirmationDialogFragment.A01 = true;
            ((C0CS) hilt_BlockConfirmationDialogFragment.generatedComponent()).A0n((BlockConfirmationDialogFragment) hilt_BlockConfirmationDialogFragment);
        } else if (this instanceof Hilt_CatalogReportReasonDialogFragment) {
            Hilt_CatalogReportReasonDialogFragment hilt_CatalogReportReasonDialogFragment = (Hilt_CatalogReportReasonDialogFragment) this;
            if (hilt_CatalogReportReasonDialogFragment.A01) {
                return;
            }
            hilt_CatalogReportReasonDialogFragment.A01 = true;
            ((C0CS) hilt_CatalogReportReasonDialogFragment.generatedComponent()).A0l((CatalogReportReasonDialogFragment) hilt_CatalogReportReasonDialogFragment);
        } else if (this instanceof Hilt_CatalogReportDialogFragment) {
            Hilt_CatalogReportDialogFragment hilt_CatalogReportDialogFragment = (Hilt_CatalogReportDialogFragment) this;
            if (hilt_CatalogReportDialogFragment.A01) {
                return;
            }
            hilt_CatalogReportDialogFragment.A01 = true;
            ((C0CS) hilt_CatalogReportDialogFragment.generatedComponent()).A0k((CatalogReportDialogFragment) hilt_CatalogReportDialogFragment);
        } else if (this instanceof Hilt_QuantityPickerDialogFragment) {
            Hilt_QuantityPickerDialogFragment hilt_QuantityPickerDialogFragment = (Hilt_QuantityPickerDialogFragment) this;
            if (hilt_QuantityPickerDialogFragment.A01) {
                return;
            }
            hilt_QuantityPickerDialogFragment.A01 = true;
            ((C0CS) hilt_QuantityPickerDialogFragment.generatedComponent()).A0i((QuantityPickerDialogFragment) hilt_QuantityPickerDialogFragment);
        } else if (this instanceof Hilt_SingleChoiceListDialogFragment) {
            Hilt_SingleChoiceListDialogFragment hilt_SingleChoiceListDialogFragment = (Hilt_SingleChoiceListDialogFragment) this;
            if (hilt_SingleChoiceListDialogFragment.A01) {
                return;
            }
            hilt_SingleChoiceListDialogFragment.A01 = true;
            ((C0CS) hilt_SingleChoiceListDialogFragment.generatedComponent()).A0f((SingleChoiceListDialogFragment) hilt_SingleChoiceListDialogFragment);
        } else if (this instanceof Hilt_SettingsGoogleDrive_AuthRequestDialogFragment) {
            Hilt_SettingsGoogleDrive_AuthRequestDialogFragment hilt_SettingsGoogleDrive_AuthRequestDialogFragment = (Hilt_SettingsGoogleDrive_AuthRequestDialogFragment) this;
            if (hilt_SettingsGoogleDrive_AuthRequestDialogFragment.A01) {
                return;
            }
            hilt_SettingsGoogleDrive_AuthRequestDialogFragment.A01 = true;
            ((C0CS) hilt_SettingsGoogleDrive_AuthRequestDialogFragment.generatedComponent()).A0e((SettingsGoogleDrive.AuthRequestDialogFragment) hilt_SettingsGoogleDrive_AuthRequestDialogFragment);
        } else if (!(this instanceof Hilt_PromptDialogFragment)) {
            if (this.A01) {
                return;
            }
            this.A01 = true;
            ((C0CS) generatedComponent()).A0g((WaDialogFragment) this);
        } else {
            Hilt_PromptDialogFragment hilt_PromptDialogFragment = (Hilt_PromptDialogFragment) this;
            if (hilt_PromptDialogFragment.A01) {
                return;
            }
            hilt_PromptDialogFragment.A01 = true;
            ((C0CS) hilt_PromptDialogFragment.generatedComponent()).A0d((PromptDialogFragment) hilt_PromptDialogFragment);
        }
    }

    @Override // X.C0BA, X.C0B1
    public C0CR A9l() {
        return AnonymousClass029.A0F(this);
    }

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    this.A03 = new C52912bY(this);
                }
            }
        }
        return this.A03.generatedComponent();
    }
}
