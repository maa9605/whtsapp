package com.whatsapp.util;

import X.AbstractC005302j;
import X.AbstractC71693Xc;
import X.AbstractView$OnClickListenerC49532Ky;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.AnonymousClass092;
import X.AnonymousClass094;
import X.AnonymousClass337;
import X.AnonymousClass346;
import X.C018308n;
import X.C06C;
import X.C09E;
import X.C0AT;
import X.C0DB;
import X.C0FK;
import X.C0KD;
import X.C0LD;
import X.C0M6;
import X.C0TS;
import X.C23X;
import X.C28241Qv;
import X.C2AS;
import X.C2BR;
import X.C2N4;
import X.C2PR;
import X.C32D;
import X.C32L;
import X.C34A;
import X.C34Z;
import X.C3B6;
import X.C3Ji;
import X.C3LP;
import X.C3TK;
import X.C41471ty;
import X.C42531vt;
import X.C49302Jn;
import X.C49382Kc;
import X.C49492Kt;
import X.C49502Ku;
import X.C51682Xk;
import X.C56322n5;
import X.C56362nA;
import X.C58932rw;
import X.C61422w7;
import X.C61972x7;
import X.C63532zw;
import X.C646534e;
import X.C81613pB;
import X.C81633pD;
import X.C84543tv;
import X.C84803uN;
import X.C86083wp;
import X.C86443xW;
import X.C86453xX;
import X.C86763yE;
import X.C86873yf;
import X.InterfaceC48372Ez;
import X.InterfaceC52102a4;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.QuickContactActivity;
import com.whatsapp.SerializableLocation;
import com.whatsapp.biz.BusinessProfileExtraFieldsActivity;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;
import com.whatsapp.biz.order.view.fragment.OrderDetailFragment;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;
import com.whatsapp.stickers.ConfirmPackDeleteDialogFragment;
import com.whatsapp.stickers.StickerStoreFeaturedTabFragment;
import com.whatsapp.stickers.StickerStoreMyTabFragment;
import com.whatsapp.stickers.StickerStoreTabFragment;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.GroupCallLogActivity;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public class ViewOnClickCListenerShape4S0200000_I1 extends AbstractView$OnClickListenerC49532Ky {
    public Object A00;
    public Object A01;
    public final int A02;

    public ViewOnClickCListenerShape4S0200000_I1(C3B6 c3b6, C51682Xk c51682Xk) {
        this.A02 = 10;
        this.A00 = c3b6;
        this.A01 = c51682Xk;
    }

    public ViewOnClickCListenerShape4S0200000_I1(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    @Override // X.AbstractView$OnClickListenerC49532Ky
    public void A00(View view) {
        switch (this.A02) {
            case 0:
                C32D c32d = (C32D) this.A00;
                ContactInfoActivity contactInfoActivity = c32d.A0L;
                Intent intent = new Intent(contactInfoActivity, BusinessProfileExtraFieldsActivity.class);
                Jid A02 = ((C06C) this.A01).A02();
                if (A02 != null) {
                    intent.putExtra("jid", A02.getRawString());
                    contactInfoActivity.startActivity(intent);
                    c32d.A0K.A00(8, null);
                    return;
                }
                throw null;
            case 1:
                C32D c32d2 = (C32D) this.A00;
                ContactInfoActivity contactInfoActivity2 = c32d2.A0L;
                c32d2.A0D.A08(contactInfoActivity2, new Intent(contactInfoActivity2, Conversation.class).putExtra("jid", ((Jid) this.A01).getRawString()).addFlags(335544320), "ContactInfoActivity");
                return;
            case 2:
                C32D c32d3 = (C32D) this.A00;
                CatalogListActivity.A00(c32d3.A0D, (UserJid) this.A01, c32d3.A0L);
                return;
            case 3:
                CartFragment cartFragment = ((C32L) this.A00).A03;
                String str = ((C49382Kc) this.A01).A01.A09;
                C49492Kt c49492Kt = cartFragment.A0P;
                C49502Ku c49502Ku = c49492Kt.A0F;
                UserJid userJid = c49492Kt.A0L;
                if (c49502Ku != null) {
                    cartFragment.A16(false, false);
                    Context A00 = cartFragment.A00();
                    C2N4.A00(userJid, str, false, null, null, A00, new Intent(A00, ProductDetailActivity.class), 1);
                    return;
                }
                throw null;
            case 4:
                ((AnonymousClass337) this.A00).A00.A08(view.getContext(), Conversation.A00(view.getContext(), (C06C) this.A01), "CatalogListAdapterFooterViewHolder");
                return;
            case 5:
                Context context = view.getContext();
                ((AnonymousClass337) this.A00).A00.A06(context, ContactInfoActivity.A00((UserJid) this.A01, context));
                return;
            case 6:
                OrderDetailFragment orderDetailFragment = ((AnonymousClass346) this.A00).A01;
                String str2 = ((C56322n5) this.A01).A04;
                orderDetailFragment.A07.A03(39, 46, str2, orderDetailFragment.A0G, null, orderDetailFragment.A0J, null, null, null);
                C34A c34a = orderDetailFragment.A0C;
                Context A002 = orderDetailFragment.A00();
                C56362nA c56362nA = c34a.A05;
                UserJid userJid2 = c34a.A08;
                if (c56362nA == null) {
                    throw null;
                }
                C2N4.A00(userJid2, str2, false, null, null, A002, new Intent(A002, ProductDetailActivity.class), 1);
                return;
            case 7:
                C646534e c646534e = (C646534e) this.A00;
                QuickContactActivity.A00(C018308n.A00(c646534e.A00), view, (AbstractC005302j) ((C06C) this.A01).A03(UserJid.class), C0AT.A0G(c646534e.A01));
                return;
            case 8:
                C58932rw c58932rw = (C58932rw) this.A00;
                c58932rw.A07.AS7(c58932rw.A00, Uri.parse(((C3TK) this.A01).A02));
                return;
            case 9:
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) this.A01;
                long A022 = C0DB.A02(anonymousClass092);
                StarredMessagesActivity starredMessagesActivity = ((C3Ji) this.A00).A00;
                AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                Intent A023 = Conversation.A02(starredMessagesActivity, anonymousClass094.A00);
                A023.putExtra("row_id", A022);
                C0LD.A00(A023, anonymousClass094);
                C018308n c018308n = ((ActivityC02270An) starredMessagesActivity).A00;
                if (c018308n == null) {
                    throw null;
                }
                c018308n.A08(starredMessagesActivity, A023, starredMessagesActivity.getClass().getSimpleName());
                return;
            case 10:
                C51682Xk c51682Xk = (C51682Xk) this.A01;
                InterfaceC52102a4 interfaceC52102a4 = c51682Xk.A04;
                if (interfaceC52102a4 != null) {
                    ((C3B6) this.A00).A01.A14(interfaceC52102a4, c51682Xk);
                    return;
                }
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                C2BR c2br = ((C3LP) this.A00).A03;
                String str3 = c2br.A04;
                String str4 = c2br.A03;
                int i = c2br.A02;
                int i2 = c2br.A01;
                ((InterfaceC48372Ez) this.A01).AKr(new C49302Jn(str3, new C61422w7(str4, i, i2), new C61422w7(str4, i, i2), new C61422w7(str4, i, i2), c2br.A00, true));
                return;
            case 12:
                C63532zw c63532zw = (C63532zw) this.A00;
                C41471ty c41471ty = c63532zw.A03;
                Context context2 = c63532zw.A00;
                SerializableLocation serializableLocation = ((InteractiveAnnotation) this.A01).serializableLocation;
                c41471ty.A09(context2, serializableLocation.latitude, serializableLocation.longitude, serializableLocation.name);
                c63532zw.A02.dismiss();
                return;
            case 13:
                C86083wp c86083wp = (C86083wp) this.A00;
                C41471ty c41471ty2 = c86083wp.A09;
                Context context3 = c86083wp.getContext();
                C0KD c0kd = (C0KD) this.A01;
                c41471ty2.A09(context3, c0kd.A00, c0kd.A01, null);
                return;
            case 14:
                C61972x7 c61972x7 = (C61972x7) this.A00;
                Activity A003 = C018308n.A00(c61972x7.getContext());
                if (A003 instanceof ActivityC02290Ap) {
                    C23X.A03((C09E) this.A01, c61972x7.A07, c61972x7.A03, c61972x7.A02, c61972x7.A08, c61972x7.A04, c61972x7.A01, c61972x7.A06, (ActivityC02290Ap) A003, c61972x7.A05);
                    return;
                }
                return;
            case 15:
                int A004 = ((C0TS) this.A01).A00();
                C81613pB c81613pB = (C81613pB) this.A00;
                if (c81613pB.A0D(A004) == 1) {
                    A004--;
                }
                C81633pD c81633pD = c81613pB.A02;
                if (c81633pD != null) {
                    ArrayList arrayList = new ArrayList();
                    DownloadableWallpaperPickerActivity downloadableWallpaperPickerActivity = c81633pD.A00;
                    List<File> list = downloadableWallpaperPickerActivity.A09;
                    if (list != null) {
                        for (File file : list) {
                            arrayList.add(Uri.fromFile(file));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        C0FK c0fk = downloadableWallpaperPickerActivity.A03;
                        if (c0fk != null) {
                            Object obj = c0fk.A00;
                            if (obj != null) {
                                arrayList2.addAll((Collection) obj);
                                Object obj2 = downloadableWallpaperPickerActivity.A03.A01;
                                if (obj2 != null) {
                                    arrayList3.addAll((Collection) obj2);
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        }
                        AbstractC005302j abstractC005302j = ((C2PR) downloadableWallpaperPickerActivity).A00;
                        boolean z = ((C2PR) downloadableWallpaperPickerActivity).A01;
                        Intent intent2 = new Intent(downloadableWallpaperPickerActivity, DownloadableWallpaperPreviewActivity.class);
                        intent2.putExtra("STARTING_POSITION_KEY", A004);
                        intent2.putExtra("THUMBNAIL_URIS_KEY", arrayList);
                        intent2.putExtra("WHATSAPP_THUMBNAIL_RES_KEY", arrayList2);
                        intent2.putExtra("WHATSAPP_FULL_RES_KEY", arrayList3);
                        intent2.putExtra("chat_jid", abstractC005302j);
                        intent2.putExtra("is_using_global_wallpaper", z);
                        downloadableWallpaperPickerActivity.startActivityForResult(intent2, 111);
                        return;
                    }
                    throw null;
                }
                throw null;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                AbstractC71693Xc abstractC71693Xc = (AbstractC71693Xc) this.A01;
                abstractC71693Xc.A06.setVisibility(0);
                abstractC71693Xc.A06.setAlpha(1.0f);
                ((C86873yf) this.A00).A0R();
                return;
            case 17:
                C42531vt c42531vt = (C42531vt) this.A01;
                if (c42531vt.A05) {
                    return;
                }
                StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = ((C86443xW) this.A00).A01;
                C2AS c2as = ((StickerStoreTabFragment) stickerStoreFeaturedTabFragment).A09;
                c2as.A0S.AS1(new RunnableEBaseShape4S0200000_I0_4(c2as, c42531vt, 24));
                ((StickerStoreTabFragment) stickerStoreFeaturedTabFragment).A09.A0I(c42531vt, null);
                return;
            case 18:
                StickerStoreMyTabFragment stickerStoreMyTabFragment = ((C86453xX) this.A00).A00;
                if (stickerStoreMyTabFragment.A0H != null) {
                    C42531vt c42531vt2 = (C42531vt) this.A01;
                    ConfirmPackDeleteDialogFragment confirmPackDeleteDialogFragment = new ConfirmPackDeleteDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("pack_id", c42531vt2.A0D);
                    bundle.putString("pack_name", c42531vt2.A0F);
                    confirmPackDeleteDialogFragment.A0P(bundle);
                    confirmPackDeleteDialogFragment.A14(stickerStoreMyTabFragment.A0H, "confirm_delete");
                    return;
                }
                return;
            case 19:
                GroupCallLogActivity groupCallLogActivity = ((C84543tv) this.A00).A02;
                if (groupCallLogActivity.A0B.A06((C06C) this.A01, groupCallLogActivity, 20, false)) {
                    groupCallLogActivity.finish();
                    return;
                }
                return;
            case C0M6.A01 /* 20 */:
                GroupCallLogActivity groupCallLogActivity2 = ((C84543tv) this.A00).A02;
                if (groupCallLogActivity2.A0B.A00((C06C) this.A01, groupCallLogActivity2, 20, false, true) == 0) {
                    groupCallLogActivity2.finish();
                    return;
                }
                return;
            case 21:
                C84803uN c84803uN = ((C86763yE) this.A00).A02.A0R;
                UserJid userJid3 = ((C28241Qv) this.A01).A06;
                CallInfo A1V = c84803uN.A00.A1V();
                if (A1V != null) {
                    VoipActivityV2 voipActivityV2 = c84803uN.A00;
                    if (voipActivityV2.A0n.A0H(userJid3)) {
                        UnblockDialogFragment.A00(voipActivityV2.getString(R.string.voip_joinable_unblock_before_ring, voipActivityV2.A0r.A08(voipActivityV2.A0o.A0A(userJid3), false)), R.string.blocked_title, false, new C34Z(voipActivityV2.A0n, voipActivityV2, userJid3)).A14(voipActivityV2.A0N(), null);
                        return;
                    } else if (8 == A1V.getConnectedParticipantsCount()) {
                        VoipErrorDialogFragment.A01(6, VoipErrorDialogFragment.A00()).A14(voipActivityV2.A0N(), null);
                        return;
                    } else {
                        VoipActivityV2.A03(voipActivityV2, userJid3);
                        return;
                    }
                }
                return;
            default:
                super.A00(view);
                return;
        }
    }

    @Override // X.AbstractView$OnClickListenerC49532Ky, android.view.View.OnClickListener
    public void onClick(View view) {
        C51682Xk c51682Xk;
        InterfaceC52102a4 interfaceC52102a4;
        if (10 - this.A02 != 0) {
            super.onClick(view);
            return;
        }
        MediaGalleryFragmentBase mediaGalleryFragmentBase = ((C3B6) this.A00).A01;
        if (mediaGalleryFragmentBase.A17() && (interfaceC52102a4 = (c51682Xk = (C51682Xk) this.A01).A04) != null) {
            mediaGalleryFragmentBase.A14(interfaceC52102a4, c51682Xk);
        } else {
            super.onClick(view);
        }
    }
}
