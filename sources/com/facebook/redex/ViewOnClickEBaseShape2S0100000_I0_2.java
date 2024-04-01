package com.facebook.redex;

import X.AbstractC04890Mh;
import X.ActivityC02290Ap;
import X.AnonymousClass088;
import X.AnonymousClass092;
import X.C09E;
import X.C0LD;
import X.C0M6;
import X.C2H2;
import X.C2HM;
import X.C2IP;
import X.C460324r;
import X.C48352Ex;
import X.C48362Ey;
import X.C48742Gm;
import X.C48822Gw;
import X.C49262Ji;
import X.C54502ir;
import X.C54522it;
import X.DialogC48832Gy;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.SuspiciousLinkWarningDialogFragment;
import com.whatsapp.base.WaFragment;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.ephemeral.ViewOnceNUXDialog;
import com.whatsapp.gallery.DocumentsGalleryFragment;
import com.whatsapp.gallery.GalleryFragmentBase;
import com.whatsapp.gallery.Hilt_LinksGalleryFragment;
import com.whatsapp.gallery.LinksGalleryFragment;
import com.whatsapp.greenalert.GreenAlertActivity;
import com.whatsapp.group.GroupAdminPickerActivity;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.group.GroupSettingsActivity;
import com.whatsapp.group.NewGroup;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.inappsupport.ui.ContactUsActivity;
import com.whatsapp.inappsupport.ui.FaqItemActivityV2;
import com.whatsapp.inappsupport.ui.SupportTopicsActivity;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import com.whatsapp.mediacomposer.bottombar.BottomBarView;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.Set;

/* loaded from: classes2.dex */
public class ViewOnClickEBaseShape2S0100000_I0_2 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickEBaseShape2S0100000_I0_2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.A01) {
            case 0:
                ViewOnceNUXDialog viewOnceNUXDialog = (ViewOnceNUXDialog) this.A00;
                viewOnceNUXDialog.A03.A0D().putBoolean("view_once_nux", true).apply();
                viewOnceNUXDialog.A11();
                return;
            case 1:
                ViewOnceNUXDialog viewOnceNUXDialog2 = (ViewOnceNUXDialog) this.A00;
                Intent intent = new Intent("android.intent.action.VIEW", viewOnceNUXDialog2.A04.A02("chats", "about-view-once"));
                intent.addFlags(268435456);
                viewOnceNUXDialog2.A02.A06(view.getContext(), intent);
                viewOnceNUXDialog2.A03.A0D().putBoolean("view_once_nux", true).apply();
                viewOnceNUXDialog2.A11();
                return;
            case 2:
                C54502ir c54502ir = (C54502ir) this.A00;
                C09E c09e = c54502ir.A00;
                if (c09e != null) {
                    DocumentsGalleryFragment documentsGalleryFragment = c54502ir.A0A;
                    if (documentsGalleryFragment.A0z().AEZ()) {
                        documentsGalleryFragment.A0z().AVe(c09e);
                        ((GalleryFragmentBase) documentsGalleryFragment).A09.A01();
                        return;
                    }
                    C460324r.A0A(documentsGalleryFragment.A06, documentsGalleryFragment.A02, documentsGalleryFragment.A01, documentsGalleryFragment.A07, documentsGalleryFragment.A05, (ActivityC02290Ap) documentsGalleryFragment.A09(), c09e, documentsGalleryFragment.A00);
                    return;
                }
                return;
            case 3:
                C54522it c54522it = (C54522it) this.A00;
                AnonymousClass092 anonymousClass092 = c54522it.A01;
                if (anonymousClass092 != null) {
                    LinksGalleryFragment linksGalleryFragment = c54522it.A0B;
                    if (linksGalleryFragment.A0z().AEZ()) {
                        linksGalleryFragment.A0z().AVe(anonymousClass092);
                        ((GalleryFragmentBase) linksGalleryFragment).A09.A01();
                        return;
                    } else if (TextUtils.isEmpty(c54522it.A02)) {
                        return;
                    } else {
                        Set set = c54522it.A03;
                        if (set != null) {
                            ((ActivityC02290Ap) linksGalleryFragment.A09()).AUh(SuspiciousLinkWarningDialogFragment.A00(c54522it.A02, set));
                            return;
                        }
                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(c54522it.A02));
                        intent2.putExtra("com.android.browser.application_id", ((Hilt_LinksGalleryFragment) linksGalleryFragment).A00.getPackageName());
                        intent2.putExtra("create_new_tab", true);
                        linksGalleryFragment.A00.A06(((Hilt_LinksGalleryFragment) linksGalleryFragment).A00, intent2);
                        return;
                    }
                }
                return;
            case 4:
                C54522it c54522it2 = (C54522it) this.A00;
                AnonymousClass092 anonymousClass0922 = c54522it2.A01;
                if (anonymousClass0922 != null) {
                    LinksGalleryFragment linksGalleryFragment2 = c54522it2.A0B;
                    if (linksGalleryFragment2.A0z().AEZ()) {
                        linksGalleryFragment2.A0z().AVe(anonymousClass0922);
                        ((GalleryFragmentBase) linksGalleryFragment2).A09.A01();
                        return;
                    }
                    Intent A02 = Conversation.A02(((Hilt_LinksGalleryFragment) linksGalleryFragment2).A00, anonymousClass0922.A0n.A00);
                    A02.putExtra("row_id", c54522it2.A01.A0p);
                    C0LD.A00(A02, c54522it2.A01.A0n);
                    ((WaFragment) linksGalleryFragment2).A00.A01(linksGalleryFragment2, A02);
                    return;
                }
                return;
            case 5:
                C48352Ex c48352Ex = (C48352Ex) this.A00;
                if (c48352Ex.isShowing() && c48352Ex.A00 == 0 && c48352Ex.A0J()) {
                    c48352Ex.A08();
                    c48352Ex.A0I("contextual_suggestion");
                    return;
                }
                ((C48362Ey) c48352Ex).A0D.onClick(view);
                return;
            case 6:
                ((GreenAlertActivity) this.A00).lambda$onCreate$2616$GreenAlertActivity(view);
                return;
            case 7:
                ((GreenAlertActivity) this.A00).A1P();
                return;
            case 8:
                ((GroupAdminPickerActivity) this.A00).A1Q();
                return;
            case 9:
                ((GroupAdminPickerActivity) this.A00).lambda$new$1774$GroupAdminPickerActivity(view);
                return;
            case 10:
                ((ChatInfoActivity) this.A00).A1T();
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                ((GroupChatInfo) this.A00).lambda$onCreate$1791$GroupChatInfo(view);
                return;
            case 12:
                ((GroupChatInfo) this.A00).lambda$updateEphemeralMessagesSetting$1799$GroupChatInfo(view);
                return;
            case 13:
                ((GroupSettingsActivity.AdminSettingsDialogFragment) this.A00).A0B[0] = true;
                return;
            case 14:
                ((GroupSettingsActivity.AdminSettingsDialogFragment) this.A00).A0B[0] = false;
                return;
            case 15:
                ((NewGroup) this.A00).lambda$onCreate$1810$NewGroup(view);
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                ((IdentityVerificationActivity) this.A00).A1R();
                return;
            case 17:
                ((IdentityVerificationActivity) this.A00).lambda$onCreate$1821$IdentityVerificationActivity(view);
                return;
            case 18:
                ((ContactUsActivity) this.A00).A1Q(1);
                return;
            case 19:
                ((ContactUsActivity) this.A00).onBackPressed();
                return;
            case C0M6.A01 /* 20 */:
                ((ContactUsActivity) this.A00).lambda$onCreate$1841$ContactUsActivity(view);
                return;
            case 21:
                ((ActivityC02290Ap) this.A00).onBackPressed();
                return;
            case 22:
                ((FaqItemActivityV2) this.A00).lambda$onCreate$1835$FaqItemActivityV2(view);
                return;
            case 23:
                ((SupportTopicsActivity) this.A00).A1P(null);
                return;
            case 24:
                ((SupportTopicsActivity) this.A00).onBackPressed();
                return;
            case 25:
                C49262Ji c49262Ji = (C49262Ji) this.A00;
                c49262Ji.A02 = true;
                ((AbstractC04890Mh) c49262Ji).A01.A00();
                return;
            case 26:
                ((Activity) this.A00).finish();
                return;
            case 27:
                ((Activity) this.A00).finish();
                return;
            case 28:
                ((Activity) this.A00).finish();
                return;
            case 29:
                ((Activity) this.A00).finish();
                return;
            case 30:
                ((GroupChatLiveLocationsActivity) this.A00).lambda$onCreate$1925$GroupChatLiveLocationsActivity(view);
                return;
            case 31:
                ((GroupChatLiveLocationsActivity2) this.A00).lambda$onCreate$1932$GroupChatLiveLocationsActivity2(view);
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                ((LocationPicker) this.A00).lambda$onCreate$1900$LocationPicker(view);
                return;
            case 33:
                ((LocationPicker) this.A00).lambda$onCreate$1899$LocationPicker(view);
                return;
            case 34:
                ((LocationPicker2) this.A00).lambda$onCreate$1908$LocationPicker2(view);
                return;
            case 35:
                ((LocationPicker2) this.A00).lambda$onCreate$1907$LocationPicker2(view);
                return;
            case 36:
                C2H2 c2h2 = (C2H2) this.A00;
                c2h2.A0N(c2h2.A1J);
                return;
            case 37:
                ((C2H2) this.A00).A0A();
                return;
            case 38:
                ((C2H2) this.A00).A0R(true);
                return;
            case 39:
                C2H2 c2h22 = (C2H2) this.A00;
                View findViewById = c2h22.A0T.findViewById(R.id.location_description);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                boolean z = !c2h22.A0n;
                c2h22.A0n = z;
                c2h22.A0T(true, Float.valueOf(z ? 0.5f : -0.5f));
                return;
            case 40:
                ((ImageComposerFragment) this.A00).A09.A09();
                return;
            case 41:
                C48822Gw c48822Gw = ((DialogC48832Gy) this.A00).A0L;
                int intValue = ((Number) c48822Gw.A04.A01()).intValue();
                if (intValue == 2) {
                    c48822Gw.A08(3);
                    return;
                } else if (intValue == 3) {
                    c48822Gw.A08(2);
                    return;
                } else {
                    return;
                }
            case 42:
                VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this.A00;
                C48742Gm c48742Gm = ((MediaComposerFragment) videoComposerFragment).A0A;
                if (c48742Gm.A0I.A02) {
                    c48742Gm.A01();
                }
                videoComposerFragment.A18();
                return;
            case 43:
                VideoComposerFragment videoComposerFragment2 = (VideoComposerFragment) this.A00;
                boolean z2 = !videoComposerFragment2.A0X;
                videoComposerFragment2.A0X = z2;
                videoComposerFragment2.A0y().ATs(((MediaComposerFragment) videoComposerFragment2).A00, z2);
                if (videoComposerFragment2.A0X) {
                    videoComposerFragment2.A0C.setImageResource(R.drawable.ic_gif_on);
                    videoComposerFragment2.A0J.A0E = 7000L;
                    if (videoComposerFragment2.A0T.A0C()) {
                        videoComposerFragment2.A16();
                    }
                    videoComposerFragment2.A0T.A0A((int) videoComposerFragment2.A03);
                    videoComposerFragment2.A11();
                    AnonymousClass088.A1C(videoComposerFragment2.A0A(), videoComposerFragment2.A0L, videoComposerFragment2.A0F(R.string.gif_selected));
                } else {
                    videoComposerFragment2.A0C.setImageResource(R.drawable.ic_gif_off);
                    videoComposerFragment2.A0J.A0E = videoComposerFragment2.A01;
                    if (videoComposerFragment2.A0T.A0C()) {
                        videoComposerFragment2.A16();
                    }
                    videoComposerFragment2.A0T.A0A((int) videoComposerFragment2.A03);
                    AnonymousClass088.A1C(videoComposerFragment2.A0A(), videoComposerFragment2.A0L, videoComposerFragment2.A0F(R.string.video_selected));
                }
                videoComposerFragment2.A19();
                videoComposerFragment2.A17();
                return;
            case 44:
                ((VideoComposerFragment) this.A00).A18();
                return;
            case 45:
                VideoComposerFragment videoComposerFragment3 = (VideoComposerFragment) this.A00;
                if (videoComposerFragment3.A0X) {
                    return;
                }
                boolean z3 = !videoComposerFragment3.A0V;
                videoComposerFragment3.A0V = z3;
                videoComposerFragment3.A0y().ATO(((MediaComposerFragment) videoComposerFragment3).A00, z3);
                videoComposerFragment3.A19();
                videoComposerFragment3.A0T.A0B(videoComposerFragment3.A0V);
                videoComposerFragment3.A17();
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                C48822Gw c48822Gw2 = ((BottomBarView) this.A00).A00.A0B;
                int intValue2 = ((Number) c48822Gw2.A04.A01()).intValue();
                if (intValue2 == 2) {
                    c48822Gw2.A08(3);
                    return;
                } else if (intValue2 == 3) {
                    c48822Gw2.A08(2);
                    return;
                } else {
                    return;
                }
            case 47:
                C2HM c2hm = (C2HM) this.A00;
                int i = (c2hm.A02 + 1) % 4;
                c2hm.A02 = i;
                c2hm.A08.setFontStyle(i);
                c2hm.A08.setTextColor(c2hm.A01);
                c2hm.A06.setTypeface(c2hm.A08.getTypeface());
                return;
            case 48:
                C2HM c2hm2 = (C2HM) this.A00;
                c2hm2.A0A = c2hm2.A08.getText().toString();
                c2hm2.dismiss();
                return;
            case 49:
                int id = view.getId();
                C2IP c2ip = (C2IP) this.A00;
                c2ip.A04(id == c2ip.A0Q.getId() ? 0 : 1);
                return;
            default:
                return;
        }
    }
}
