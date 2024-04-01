package com.whatsapp.util;

import X.AbstractC53812hY;
import X.AbstractC53832ha;
import X.AbstractC86423xS;
import X.AbstractView$OnClickListenerC49532Ky;
import X.ActivityC02290Ap;
import X.AnonymousClass092;
import X.AnonymousClass094;
import X.AnonymousClass097;
import X.AnonymousClass223;
import X.C000200d;
import X.C000500h;
import X.C002701i;
import X.C003101m;
import X.C018308n;
import X.C02F;
import X.C04040Ie;
import X.C09360d8;
import X.C09H;
import X.C0DB;
import X.C0HS;
import X.C0JM;
import X.C0LD;
import X.C0M6;
import X.C2HG;
import X.C2IP;
import X.C2IQ;
import X.C2J9;
import X.C30K;
import X.C32D;
import X.C33G;
import X.C36921la;
import X.C37661mm;
import X.C3HO;
import X.C3JL;
import X.C3JO;
import X.C3LQ;
import X.C48342Ew;
import X.C53842hb;
import X.C58472rC;
import X.C58892rs;
import X.C68613Ks;
import X.C68693Lb;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.BusinessProfileEducation;
import com.whatsapp.ContactPicker;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.gif_search.GifSearchContainer;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.status.StatusDeleteDialogFragment;
import com.whatsapp.status.playback.fragment.Hilt_StatusPlaybackContactFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.stickers.StickerInfoDialogFragment;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public class ViewOnClickCListenerShape12S0100000_I1 extends AbstractView$OnClickListenerC49532Ky {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape12S0100000_I1(C48342Ew c48342Ew) {
        this.A01 = 16;
        this.A00 = c48342Ew;
    }

    public ViewOnClickCListenerShape12S0100000_I1(C3HO c3ho) {
        this.A01 = 19;
        this.A00 = c3ho;
    }

    public ViewOnClickCListenerShape12S0100000_I1(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    @Override // X.AbstractView$OnClickListenerC49532Ky
    public void A00(View view) {
        long j;
        int i;
        int i2;
        C2IQ c2iq;
        C2IP c2ip;
        C30K c30k;
        switch (this.A01) {
            case 0:
                C32D c32d = (C32D) this.A00;
                c32d.A0U.A00(c32d.A0B, c32d.A0L, 6, true, false);
                return;
            case 1:
                C32D c32d2 = (C32D) this.A00;
                c32d2.A0E.AS7(c32d2.A0L, Uri.parse(c32d2.A0A.A05));
                return;
            case 2:
                ((C32D) this.A00).A0L.A1f();
                return;
            case 3:
                C32D c32d3 = (C32D) this.A00;
                c32d3.A0E.AS7(c32d3.A0L, Uri.parse(c32d3.A0A.A05));
                if (c32d3.A0W.AFs()) {
                    C37661mm c37661mm = new C37661mm();
                    UserJid userJid = c32d3.A0A.A0A;
                    if (userJid != null) {
                        c37661mm.A02 = userJid.user;
                        c37661mm.A00 = 1;
                        c37661mm.A01 = 1;
                        c32d3.A0R.A0B(c37661mm, null, false);
                        return;
                    }
                    throw null;
                }
                return;
            case 4:
                ContactInfoActivity contactInfoActivity = ((C32D) this.A00).A0L;
                contactInfoActivity.startActivity(new Intent(contactInfoActivity, BusinessProfileEducation.class));
                return;
            case 5:
                CatalogMediaViewFragment catalogMediaViewFragment = ((C33G) this.A00).A00;
                catalogMediaViewFragment.A1A(!((MediaViewBaseFragment) catalogMediaViewFragment).A0G, true);
                return;
            case 6:
                ((C2J9) this.A00).A02(true);
                return;
            case 7:
                C3JL c3jl = (C3JL) this.A00;
                GroupChatInfo.A00(c3jl.A00, ((C2J9) c3jl).A01);
                return;
            case 8:
                C3JO c3jo = (C3JO) this.A00;
                c3jo.A02(true);
                C58472rC c58472rC = c3jo.A03;
                C000500h c000500h = c58472rC.A02;
                long j2 = c000500h.A00.getLong("md_banner_show_backoff_time", 0L);
                long A05 = c58472rC.A01.A05();
                int i3 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                long j3 = C58472rC.A05;
                if (i3 != 0) {
                    if (j2 == j3) {
                        j3 = C58472rC.A04;
                    } else {
                        j3 = C58472rC.A06;
                    }
                }
                C000200d.A0h(c000500h, "md_last_banner_show_time", A05);
                C000200d.A0h(c000500h, "md_banner_show_backoff_time", j3);
                return;
            case 9:
                Intent intent = new Intent("android.intent.action.VIEW");
                C3JO c3jo2 = (C3JO) this.A00;
                intent.setData(c3jo2.A02.A01());
                ((C2J9) c3jo2).A01.startActivity(intent);
                return;
            case 10:
                C58892rs c58892rs = (C58892rs) this.A00;
                AnonymousClass097 anonymousClass097 = c58892rs.A03;
                C09H c09h = anonymousClass097.A02;
                if (c09h != null) {
                    if (c09h.A0a) {
                        if (anonymousClass097.A0n.A02) {
                            c58892rs.A0J.A08(anonymousClass097, false);
                        }
                        c58892rs.A0K.A07(c58892rs.A03, false, false);
                        return;
                    }
                    return;
                }
                throw null;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                C58892rs c58892rs2 = (C58892rs) this.A00;
                AnonymousClass097 anonymousClass0972 = c58892rs2.A03;
                C09H c09h2 = anonymousClass0972.A02;
                if (c09h2 != null) {
                    if ((c09h2.A0P && !c09h2.A0X) || c09h2.A0a || anonymousClass0972.A09 == null || c09h2.A07 == 1) {
                        return;
                    }
                    c58892rs2.A08 = true;
                    c58892rs2.A0F.A0B((ActivityC02290Ap) C018308n.A00(c58892rs2.A02.getContext()), c58892rs2.A03, true);
                    return;
                }
                throw null;
            case 12:
                C58892rs c58892rs3 = (C58892rs) this.A00;
                C02F c02f = c58892rs3.A0H;
                if (c02f == null || RequestPermissionActivity.A0Q(view.getContext(), c02f)) {
                    AnonymousClass097 anonymousClass0973 = c58892rs3.A03;
                    C09H c09h3 = anonymousClass0973.A02;
                    if (c09h3 != null) {
                        if (c09h3.A0P || c09h3.A0a) {
                            return;
                        }
                        c58892rs3.A0D.A05(anonymousClass0973, true, true);
                        return;
                    }
                    throw null;
                }
                return;
            case 13:
                C58892rs c58892rs4 = (C58892rs) this.A00;
                C0JM A1H = ((C04040Ie) c58892rs4.A03).A1H();
                StickerView stickerView = c58892rs4.A0M;
                if (!stickerView.A02) {
                    stickerView.A01();
                }
                StickerInfoDialogFragment stickerInfoDialogFragment = new StickerInfoDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("sticker", A1H);
                stickerInfoDialogFragment.A0P(bundle);
                ((ActivityC02290Ap) C018308n.A01(c58892rs4.A02.getContext(), ActivityC02290Ap.class)).AUh(stickerInfoDialogFragment);
                return;
            case 14:
                GifSearchContainer gifSearchContainer = (GifSearchContainer) this.A00;
                GifSearchContainer.A00(gifSearchContainer, gifSearchContainer.A0F);
                return;
            case 15:
                ((GifSearchContainer) this.A00).A05.setText("");
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                ((AnonymousClass223) this.A00).A02();
                return;
            case 17:
                C36921la c36921la = new C36921la();
                C3LQ c3lq = (C3LQ) this.A00;
                int i4 = c3lq.A01.A00;
                if (i4 == 1) {
                    i2 = 0;
                } else if (i4 != 2) {
                    throw new IllegalArgumentException(C000200d.A0D("Unexpected provider type ", i4));
                } else {
                    i2 = 1;
                }
                c36921la.A00 = Integer.valueOf(i2);
                c3lq.A08.A0B(c36921la, null, false);
                c3lq.A0A.AKr(c3lq.A01);
                return;
            case 18:
                C002701i.A19(((C68613Ks) this.A00).A06.A0E, 0);
                return;
            case 19:
                C3HO c3ho = (C3HO) this.A00;
                if (c3ho.A00 == null || (c30k = (c2ip = (c2iq = c3ho.A02).A07).A0Y) == null) {
                    return;
                }
                c2ip.A0h.ARy(new C0HS(c2ip.A0V, c2iq) { // from class: X.3HH
                    public final C2K0 A00;
                    public final C2IQ A01;

                    {
                        this.A00 = r1;
                        this.A01 = c2iq;
                    }

                    @Override // X.C0HS
                    public Object A07(Object[] objArr) {
                        C2K1[] c2k1Arr = (C2K1[]) objArr;
                        if (c2k1Arr != null) {
                            for (C2K1 c2k1 : c2k1Arr) {
                                this.A00.A0B(c2k1);
                            }
                            return null;
                        }
                        throw null;
                    }

                    @Override // X.C0HS
                    public void A09(Object obj) {
                        this.A01.A0I();
                    }
                }, c3ho.A00);
                C2HG A6w = c3ho.A00.A6w(view.getContext(), c2ip.A0S, false);
                if (A6w.A0C()) {
                    if ((!(A6w instanceof C68693Lb) ? 1 : ((C68693Lb) A6w).A01) == 1) {
                        A6w.A08(c2ip.A02);
                    }
                }
                A6w.A06(c2ip.A00);
                c30k.AOc(A6w);
                return;
            case C0M6.A01 /* 20 */:
                AbstractC86423xS abstractC86423xS = (AbstractC86423xS) this.A00;
                AnonymousClass097 anonymousClass0974 = (AnonymousClass097) abstractC86423xS.A04;
                if (anonymousClass0974.A0r) {
                    return;
                }
                C09H c09h4 = anonymousClass0974.A02;
                if (c09h4 != null) {
                    if (c09h4.A07 == 1) {
                        if (anonymousClass0974.A0m == 2) {
                            ((AbstractC53812hY) abstractC86423xS).A09.A05(R.string.gallery_unsafe_audio_removed, 1);
                            return;
                        } else {
                            ((AbstractC53812hY) abstractC86423xS).A09.A05(R.string.gallery_unsafe_video_removed, 1);
                            return;
                        }
                    } else if (anonymousClass0974.A09 != null) {
                        abstractC86423xS.A01.A0B((ActivityC02290Ap) C018308n.A00(abstractC86423xS.A0A()), anonymousClass0974, true);
                        return;
                    } else {
                        Log.e("cannot download media message with no media attached");
                        ((AbstractC53812hY) abstractC86423xS).A09.A07(R.string.invalid_media_message_download, 0);
                        return;
                    }
                }
                throw null;
            case 21:
                AbstractC86423xS abstractC86423xS2 = (AbstractC86423xS) this.A00;
                abstractC86423xS2.A0A.A05((AnonymousClass097) abstractC86423xS2.A04, true, true);
                return;
            case 22:
                AbstractC86423xS abstractC86423xS3 = (AbstractC86423xS) this.A00;
                abstractC86423xS3.A03.A08(abstractC86423xS3.A04, true);
                return;
            case 23:
                BottomSheetBehavior bottomSheetBehavior = ((AbstractC53812hY) this.A00).A00;
                if (bottomSheetBehavior.A0B != 3) {
                    bottomSheetBehavior.A0O(3);
                    return;
                } else {
                    bottomSheetBehavior.A0O(4);
                    return;
                }
            case 24:
                AbstractC86423xS abstractC86423xS4 = (AbstractC86423xS) this.A00;
                AbstractC53832ha abstractC53832ha = abstractC86423xS4.A0G;
                AnonymousClass092 anonymousClass092 = abstractC86423xS4.A04;
                StatusPlaybackContactFragment statusPlaybackContactFragment = ((C53842hb) abstractC53832ha).A01;
                AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                StatusDeleteDialogFragment statusDeleteDialogFragment = new StatusDeleteDialogFragment();
                Bundle bundle2 = new Bundle();
                C0LD.A07(bundle2, anonymousClass094, "");
                statusDeleteDialogFragment.A0P(bundle2);
                C09360d8.A00(statusPlaybackContactFragment, statusDeleteDialogFragment);
                return;
            case 25:
                AbstractC86423xS abstractC86423xS5 = (AbstractC86423xS) this.A00;
                AbstractC53832ha abstractC53832ha2 = abstractC86423xS5.A0G;
                AnonymousClass092 anonymousClass0922 = abstractC86423xS5.A04;
                StatusPlaybackContactFragment statusPlaybackContactFragment2 = ((C53842hb) abstractC53832ha2).A01;
                if (C0DB.A0K(statusPlaybackContactFragment2.A05, anonymousClass0922)) {
                    statusPlaybackContactFragment2.A0L = anonymousClass0922;
                    Intent intent2 = new Intent(((Hilt_StatusPlaybackContactFragment) statusPlaybackContactFragment2).A00, ContactPicker.class);
                    intent2.putExtra("forward", true);
                    intent2.putExtra("forward_jid", C003101m.A07(anonymousClass0922.A0n.A00));
                    byte b = anonymousClass0922.A0m;
                    intent2.putIntegerArrayListExtra("message_types", new ArrayList<>(Collections.singleton(Integer.valueOf(Byte.valueOf(b).intValue()))));
                    if (b == 3) {
                        j = ((AnonymousClass097) anonymousClass0922).A00 * 1000;
                    } else {
                        j = 0;
                    }
                    intent2.putExtra("forward_video_duration", j);
                    if (b == 0) {
                        String A0G = anonymousClass0922.A0G();
                        if (A0G == null) {
                            throw null;
                        }
                        i = A0G.length();
                    } else {
                        i = 0;
                    }
                    intent2.putExtra("forward_text_length", i);
                    statusPlaybackContactFragment2.A0O(intent2, 2, null);
                    return;
                }
                statusPlaybackContactFragment2.A02.A05(R.string.message_forward_media_missing, 1);
                return;
            default:
                super.A00(view);
                return;
        }
    }
}
