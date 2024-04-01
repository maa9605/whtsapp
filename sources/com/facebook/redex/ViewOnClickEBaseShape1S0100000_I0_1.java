package com.facebook.redex;

import X.AbstractActivityC40691si;
import X.AbstractC005302j;
import X.AbstractC48182Ef;
import X.ActivityC02330At;
import X.AnonymousClass029;
import X.AnonymousClass094;
import X.AnonymousClass223;
import X.AnonymousClass382;
import X.C000200d;
import X.C002701i;
import X.C003101m;
import X.C015207d;
import X.C02180Ae;
import X.C03120Eg;
import X.C06950Vu;
import X.C09560eJ;
import X.C09G;
import X.C0B5;
import X.C0BA;
import X.C0HV;
import X.C0LU;
import X.C0M6;
import X.C0OW;
import X.C0XT;
import X.C2JG;
import X.C2JH;
import X.C2W4;
import X.C2WA;
import X.C2WL;
import X.C2X3;
import X.C2XQ;
import X.C2XW;
import X.C2j3;
import X.C39V;
import X.C40731sm;
import X.C41521u3;
import X.C41981up;
import X.C43981yK;
import X.C451820s;
import X.C48362Ey;
import X.C49042Ie;
import X.C51522Wt;
import X.C54452il;
import X.C54462im;
import X.C54472io;
import X.C54492iq;
import X.C54562ix;
import X.C54572iy;
import X.DialogC54592j1;
import X.InterfaceC04690Ll;
import X.InterfaceC54612j4;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.components.WaSwitchView;
import com.whatsapp.contact.picker.BaseSharedPreviewDialogFragment;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import com.whatsapp.contact.picker.SharedFilePreviewDialogFragment;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.conversation.ConversationAttachmentContentView;
import com.whatsapp.conversation.conversationrow.WebPagePreviewView;
import com.whatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView;
import com.whatsapp.conversation.selectlist.SelectListBottomSheet;
import com.whatsapp.conversationslist.ArchivedConversationsActivity;
import com.whatsapp.conversationslist.ArchivedConversationsFragment;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.crop.CropImage;
import com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment;
import com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment;
import com.whatsapp.ephemeral.ChangeEphemeralSettingActivity;
import com.whatsapp.ephemeral.EphemeralNUXDialog;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendWebForwardJob;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.qrcode.contactqr.ContactQrActivity;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;

/* loaded from: classes2.dex */
public class ViewOnClickEBaseShape1S0100000_I0_1 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickEBaseShape1S0100000_I0_1(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int i2;
        C09560eJ c09560eJ;
        C0HV c0hv;
        C0HV c0hv2;
        C0HV c0hv3;
        switch (this.A01) {
            case 0:
                C0BA c0ba = (C0BA) this.A00;
                Intent intent = new Intent(c0ba.A0a(), ContactQrActivity.class);
                intent.putExtra("scan", true);
                c0ba.A0i(intent);
                return;
            case 1:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                Intent intent2 = new Intent("android.intent.action.INSERT");
                intent2.setType("vnd.android.cursor.dir/contact");
                try {
                    contactPickerFragment.A0O(intent2, 3, null);
                    contactPickerFragment.A1C.A02(true, 4);
                    return;
                } catch (ActivityNotFoundException unused) {
                    contactPickerFragment.A0F.A07(R.string.unimplemented, 0);
                    return;
                }
            case 2:
                ((AbstractActivityC40691si) this.A00).A1a();
                return;
            case 3:
                ((AbstractActivityC40691si) this.A00).lambda$onCreate$1439$MultipleContactPicker(view);
                return;
            case 4:
                ((AbstractActivityC40691si) this.A00).A1Z();
                return;
            case 5:
                ((PhoneContactsSelector) this.A00).lambda$onCreate$93$PhoneContactsSelector(view);
                return;
            case 6:
                SharedFilePreviewDialogFragment sharedFilePreviewDialogFragment = (SharedFilePreviewDialogFragment) this.A00;
                ((BaseSharedPreviewDialogFragment) sharedFilePreviewDialogFragment).A0A.ASV(sharedFilePreviewDialogFragment.A00, ((BaseSharedPreviewDialogFragment) sharedFilePreviewDialogFragment).A0G, sharedFilePreviewDialogFragment.A01);
                sharedFilePreviewDialogFragment.A10();
                return;
            case 7:
                SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = (SharedTextPreviewDialogFragment) this.A00;
                String trim = C002701i.A0t(sharedTextPreviewDialogFragment.A0F.getText().toString()).trim();
                boolean z = false;
                if (trim.length() <= 0) {
                    ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A07.A07(R.string.no_empty_message, 0);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("has_text_from_url", sharedTextPreviewDialogFragment.A0N);
                WebPagePreviewView webPagePreviewView = ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A0B;
                if (webPagePreviewView != null && webPagePreviewView.getVisibility() == 0) {
                    z = true;
                }
                bundle.putBoolean("load_preview", z);
                ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A0A.ASa(trim, ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A0G, bundle);
                sharedTextPreviewDialogFragment.A10();
                return;
            case 8:
                C54452il c54452il = (C54452il) this.A00;
                c54452il.A02(true);
                C451820s c451820s = c54452il.A07;
                Jid A03 = c54452il.A01.A03(UserJid.class);
                if (A03 != null) {
                    c451820s.A02((UserJid) A03);
                    C41521u3 c41521u3 = c54452il.A09;
                    UserJid userJid = (UserJid) c54452il.A01.A03(UserJid.class);
                    C41981up c41981up = c41521u3.A0F;
                    if (!c41981up.A04() || userJid == null) {
                        return;
                    }
                    String A032 = c41521u3.A0G.A03();
                    c41521u3.A04.A00.A01(new SendWebForwardJob(A032, c41981up.A01().A03, Message.obtain(null, 0, 174, 0, new C0OW(A032, userJid, null, null))));
                    return;
                }
                throw null;
            case 9:
                C54562ix c54562ix = ((ConversationAttachmentContentView) this.A00).A0C;
                C49042Ie c49042Ie = c54562ix.A01;
                if (c49042Ie != null) {
                    c49042Ie.dismiss();
                    C06950Vu c06950Vu = c54562ix.A07;
                    C0B5 c0b5 = c54562ix.A03;
                    AbstractC005302j abstractC005302j = c54562ix.A0O;
                    DialogFragment A033 = c06950Vu.A03(abstractC005302j, 0);
                    if (A033 != null) {
                        c0b5.AUh(A033);
                        return;
                    } else {
                        c06950Vu.A04(abstractC005302j, 0);
                        return;
                    }
                }
                throw null;
            case 10:
                ((Activity) this.A00).onBackPressed();
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                ((AbstractC48182Ef) this.A00).A0K();
                return;
            case 12:
                ((AbstractC48182Ef) this.A00).A0L();
                return;
            case 13:
                ((AbstractC48182Ef) this.A00).A0N();
                return;
            case 14:
                ((C2WA) this.A00).A0j();
                return;
            case 15:
                ((C2WL) this.A00).A0j();
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                C51522Wt c51522Wt = (C51522Wt) this.A00;
                if (c51522Wt.A0k()) {
                    return;
                }
                C0XT c0xt = ((C0LU) c51522Wt.getFMessage()).A00;
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("arg_select_list_content", c0xt);
                SelectListBottomSheet selectListBottomSheet = new SelectListBottomSheet();
                selectListBottomSheet.A0P(bundle2);
                selectListBottomSheet.A00 = new AnonymousClass382(c51522Wt);
                Activity A0F = C02180Ae.A0F(c51522Wt.getContext());
                if (A0F instanceof Conversation) {
                    AnonymousClass029.A1C(((ActivityC02330At) A0F).A0N(), selectListBottomSheet);
                    return;
                }
                return;
            case 17:
                ((C51522Wt) this.A00).A0k();
                return;
            case 18:
                ((C2X3) this.A00).A0n();
                return;
            case 19:
                C54462im c54462im = (C54462im) this.A00;
                InterfaceC04690Ll rowsContainer = c54462im.A09.getRowsContainer();
                if (rowsContainer == null || !rowsContainer.AEZ()) {
                    return;
                }
                c54462im.A01.setSelected(rowsContainer.AVe(c54462im.A03));
                return;
            case C0M6.A01 /* 20 */:
                C2JG c2jg = (C2JG) this.A00;
                ViewOnceDownloadProgressView viewOnceDownloadProgressView = ((C2JH) c2jg).A03;
                Runnable runnable = c2jg.A03;
                viewOnceDownloadProgressView.removeCallbacks(runnable);
                viewOnceDownloadProgressView.postDelayed(runnable, 500L);
                int i3 = c2jg.A00 + 1;
                c2jg.A00 = i3;
                if (i3 == 5) {
                    InterfaceC04690Ll rowsContainer2 = c2jg.getRowsContainer();
                    Drawable popupDrawable = c2jg.getPopupDrawable();
                    if (rowsContainer2 == null || popupDrawable == null) {
                        return;
                    }
                    if (c2jg.A01 == null) {
                        c2jg.A01 = new ImageView(c2jg.getContext());
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 17;
                        c2jg.A01.setLayoutParams(layoutParams);
                        c2jg.A01.setVisibility(4);
                        c2jg.A01.setImageDrawable(popupDrawable);
                        viewOnceDownloadProgressView.addView(c2jg.A01);
                    }
                    rowsContainer2.A5Q(c2jg.A01, popupDrawable);
                    return;
                }
                return;
            case 21:
                C2XQ c2xq = (C2XQ) this.A00;
                C09G fMessage = c2xq.getFMessage();
                C03120Eg c03120Eg = ((C2W4) c2xq).A04.A05;
                if (c03120Eg.A09(fMessage)) {
                    c09560eJ = c03120Eg.A01();
                } else {
                    c09560eJ = null;
                }
                if (c09560eJ != null) {
                    c09560eJ.A06++;
                }
                AnonymousClass094 anonymousClass094 = fMessage.A0n;
                boolean z2 = anonymousClass094.A02;
                boolean A0U = C003101m.A0U(anonymousClass094.A00);
                int i4 = C09560eJ.A0p;
                if (i4 != 0) {
                    if (i4 == 1) {
                        if (c09560eJ == null || (c0hv2 = c09560eJ.A0K) == null || !c0hv2.A0B() || c09560eJ.A0L(2)) {
                            c2xq.A08.A02(3, false, z2, A0U);
                            C09560eJ.A0p = 2;
                            C000200d.A0g(c2xq.A0Y, "ptt_fast_playback_player_state", 2);
                            return;
                        }
                        return;
                    } else if (i4 == 2) {
                        if (c09560eJ == null || (c0hv3 = c09560eJ.A0K) == null || !c0hv3.A0B() || c09560eJ.A0L(0)) {
                            c2xq.A08.A02(1, false, z2, A0U);
                            C09560eJ.A0p = 0;
                            C000200d.A0g(c2xq.A0Y, "ptt_fast_playback_player_state", 0);
                            return;
                        }
                        return;
                    } else {
                        throw new IllegalStateException(C000200d.A0D("fastPlaybackOnClick: Did not handle fastPlaybackPlayerState: ", i4));
                    }
                } else if (c09560eJ == null || (c0hv = c09560eJ.A0K) == null || !c0hv.A0B() || c09560eJ.A0L(1)) {
                    c2xq.A08.A02(2, false, z2, A0U);
                    C09560eJ.A0p = 1;
                    C000200d.A0g(c2xq.A0Y, "ptt_fast_playback_player_state", 1);
                    return;
                } else {
                    return;
                }
            case 22:
                C2XW c2xw = (C2XW) this.A00;
                c2xw.A00.A06(c2xw.getContext(), new Intent(c2xw.getContext(), ArchivedConversationsActivity.class));
                return;
            case 23:
                ((C54572iy) this.A00).A03();
                return;
            case 24:
                ((C54572iy) this.A00).A01();
                return;
            case 25:
                ((C54572iy) this.A00).A02();
                return;
            case 26:
                ((C54572iy) this.A00).A04();
                return;
            case 27:
                ((Runnable) this.A00).run();
                return;
            case 28:
                ((DialogFragment) this.A00).A16(false, false);
                return;
            case 29:
                C54472io c54472io = (C54472io) this.A00;
                C54492iq c54492iq = c54472io.A03;
                c54492iq.A02(c54492iq.A00);
                c54492iq.A00 = c54472io.A00();
                c54472io.A00.setChecked(true);
                C39V c39v = c54492iq.A01;
                if (c39v != null) {
                    c54472io.A00();
                    View view2 = c39v.A00;
                    view2.findViewById(R.id.select_list_button).setVisibility(0);
                    view2.findViewById(R.id.tab_to_select).setVisibility(8);
                    return;
                }
                return;
            case 30:
                ((WaSwitchView) this.A00).A00.toggle();
                return;
            case 31:
                ((WaSwitchView) this.A00).A00.toggle();
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                ArchivedConversationsFragment archivedConversationsFragment = (ArchivedConversationsFragment) this.A00;
                C000200d.A0g(archivedConversationsFragment.A0y, "new_archive_nux_shown_count", 3);
                AnimatorSet animatorSet = archivedConversationsFragment.A00;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                final View view3 = archivedConversationsFragment.A01;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, View.ALPHA, view3.getAlpha(), 0.0f);
                ValueAnimator A06 = C40731sm.A06(view3, 0, null);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.setInterpolator(new C015207d());
                animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: X.2j9
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        view3.setVisibility(8);
                    }
                });
                animatorSet2.playTogether(ofFloat, A06);
                animatorSet2.setDuration(300L);
                archivedConversationsFragment.A00 = animatorSet2;
                animatorSet2.start();
                return;
            case 33:
                C0BA c0ba2 = (C0BA) this.A00;
                c0ba2.A0i(new Intent(c0ba2.A09(), SettingsGoogleDrive.class));
                return;
            case 34:
                C0BA c0ba3 = (C0BA) this.A00;
                c0ba3.A0i(new Intent(c0ba3.A09(), ArchivedConversationsActivity.class));
                return;
            case 35:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
                conversationsFragment.A0M.A01(conversationsFragment.A09(), 8);
                return;
            case 36:
                ((CropImage) this.A00).lambda$onCreate$1705$CropImage(view);
                return;
            case 37:
                ((CropImage) this.A00).lambda$onCreate$1703$CropImage(view);
                return;
            case 38:
                ((CropImage) this.A00).lambda$onCreate$1704$CropImage(view);
                return;
            case 39:
                AudioVideoBottomSheetDialogFragment audioVideoBottomSheetDialogFragment = (AudioVideoBottomSheetDialogFragment) this.A00;
                audioVideoBottomSheetDialogFragment.A00.AQH();
                audioVideoBottomSheetDialogFragment.A10();
                return;
            case 40:
                AudioVideoBottomSheetDialogFragment audioVideoBottomSheetDialogFragment2 = (AudioVideoBottomSheetDialogFragment) this.A00;
                audioVideoBottomSheetDialogFragment2.A00.AHP();
                audioVideoBottomSheetDialogFragment2.A10();
                return;
            case 41:
                EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment = (EmojiEditTextBottomSheetDialogFragment) this.A00;
                String A0t = C002701i.A0t(emojiEditTextBottomSheetDialogFragment.A0A.getText().toString());
                String[] strArr = emojiEditTextBottomSheetDialogFragment.A0R;
                if (strArr != null && C43981yK.A0H(A0t, strArr)) {
                    emojiEditTextBottomSheetDialogFragment.A0F.AI0(A0t);
                    return;
                }
                String trim2 = A0t.trim();
                if (trim2.length() <= 0 && (i2 = emojiEditTextBottomSheetDialogFragment.A01) != 0) {
                    emojiEditTextBottomSheetDialogFragment.A08.A07(i2, 0);
                    return;
                }
                emojiEditTextBottomSheetDialogFragment.A0F.AJh(emojiEditTextBottomSheetDialogFragment.A00, trim2);
                emojiEditTextBottomSheetDialogFragment.A10();
                return;
            case 42:
                ((DialogFragment) this.A00).A10();
                return;
            case 43:
                DialogC54592j1 dialogC54592j1 = (DialogC54592j1) this.A00;
                C002701i.A18(dialogC54592j1.A0D, dialogC54592j1.A07);
                return;
            case 44:
                DialogC54592j1 dialogC54592j12 = (DialogC54592j1) this.A00;
                String trim3 = C002701i.A0t(dialogC54592j12.A01.getText().toString()).trim();
                if (trim3.length() <= 0 && (i = dialogC54592j12.A08) != 0) {
                    dialogC54592j12.A0G.A07(i, 0);
                } else {
                    dialogC54592j12.A0K.AR9(trim3);
                    dialogC54592j12.dismiss();
                }
                C002701i.A18(dialogC54592j12.A0D, dialogC54592j12.A07);
                return;
            case 45:
                C48362Ey c48362Ey = (C48362Ey) this.A00;
                if (c48362Ey.isShowing()) {
                    c48362Ey.A04(c48362Ey.A0I);
                    return;
                }
                AnonymousClass223 anonymousClass223 = c48362Ey.A0B;
                if (anonymousClass223 != null && anonymousClass223.A01()) {
                    c48362Ey.A0B.A02();
                    return;
                }
                Runnable runnable2 = c48362Ey.A0C;
                if (runnable2 != null) {
                    runnable2.run();
                }
                c48362Ey.A09();
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                C2j3 c2j3 = (C2j3) this.A00;
                int[] iArr = c2j3.A03[((Number) view.getTag()).intValue()];
                InterfaceC54612j4 interfaceC54612j4 = c2j3.A01;
                if (interfaceC54612j4 != null) {
                    interfaceC54612j4.AOk(iArr);
                }
                c2j3.dismiss();
                return;
            case 47:
                ((ChangeEphemeralSettingActivity) this.A00).onBackPressed();
                return;
            case 48:
                EphemeralNUXDialog ephemeralNUXDialog = (EphemeralNUXDialog) this.A00;
                ephemeralNUXDialog.A03.A0D().putBoolean("ephemeral_nux", true).apply();
                ephemeralNUXDialog.A11();
                return;
            case 49:
                EphemeralNUXDialog ephemeralNUXDialog2 = (EphemeralNUXDialog) this.A00;
                Intent intent3 = new Intent("android.intent.action.VIEW", ephemeralNUXDialog2.A05.A02("chats", "about-disappearing-messages"));
                intent3.addFlags(268435456);
                ephemeralNUXDialog2.A02.A06(view.getContext(), intent3);
                ephemeralNUXDialog2.A03.A0D().putBoolean("ephemeral_nux", true).apply();
                ephemeralNUXDialog2.A11();
                return;
            default:
                return;
        }
    }
}
