package com.facebook.redex;

import X.AbstractC005302j;
import X.AbstractC48182Ef;
import X.AbstractC48202Eh;
import X.AbstractC48662Ge;
import X.AbstractC52772bI;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.ActivityC02330At;
import X.AnonymousClass029;
import X.AnonymousClass092;
import X.AnonymousClass093;
import X.AnonymousClass097;
import X.AnonymousClass382;
import X.C000200d;
import X.C000400f;
import X.C000500h;
import X.C000700j;
import X.C002301c;
import X.C003101m;
import X.C006602x;
import X.C018808t;
import X.C02160Ac;
import X.C02180Ae;
import X.C04280Jo;
import X.C04940Mo;
import X.C05160No;
import X.C05W;
import X.C06C;
import X.C0B5;
import X.C0D3;
import X.C0JV;
import X.C0M6;
import X.C0XV;
import X.C1M7;
import X.C1PP;
import X.C20R;
import X.C20X;
import X.C29a;
import X.C2D3;
import X.C2IY;
import X.C2JA;
import X.C2JC;
import X.C2JE;
import X.C2XY;
import X.C2Zb;
import X.C2nQ;
import X.C3X4;
import X.C40071rX;
import X.C40261rr;
import X.C42881wU;
import X.C471029p;
import X.C471529v;
import X.C48652Gd;
import X.C49512Kv;
import X.C51522Wt;
import X.C51532Wv;
import X.C51552Wx;
import X.C51572Wz;
import X.C54492iq;
import X.C54532iu;
import X.C54572iy;
import X.C54822jP;
import X.C54972jf;
import X.C54982jg;
import X.C54992jh;
import X.C55142jw;
import X.C59432sk;
import X.C650535s;
import X.C86143wv;
import X.C86153ww;
import X.C86163wx;
import X.C86173wy;
import X.C86183wz;
import X.C86193x0;
import X.C86203x1;
import X.C86213x2;
import X.C86223x3;
import X.InterfaceC002901k;
import X.InterfaceC04690Ll;
import X.InterfaceC48692Gh;
import X.InterfaceC55152jx;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.AsyncTask;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.ListFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.companiondevice.LinkedDevicesActivity;
import com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment;
import com.whatsapp.conversation.selectlist.SelectListBottomSheet;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.conversationslist.ViewHolder;
import com.whatsapp.group.GroupAdminPickerActivity;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity;
import com.whatsapp.status.StatusesFragment;
import com.whatsapp.support.DescribeProblemActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class ViewOnClickEBaseShape0S0200000_I0_0 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public ViewOnClickEBaseShape0S0200000_I0_0(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List list;
        int i;
        C59432sk c59432sk;
        C0XV c0xv;
        C48652Gd c48652Gd;
        AnonymousClass097 ABE;
        switch (this.A02) {
            case 0:
                ((ContactInfoActivity) this.A00).A1n((C1M7) this.A01);
                return;
            case 1:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                C49512Kv c49512Kv = (C49512Kv) this.A01;
                C06C c06c = c49512Kv.A00;
                if (c06c != null) {
                    contactInfoActivity.A1G.A06(c06c, contactInfoActivity, 6, true);
                    return;
                }
                StringBuilder A0P = C000200d.A0P("tel:");
                A0P.append(c49512Kv.A02);
                try {
                    contactInfoActivity.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(A0P.toString())));
                    return;
                } catch (ActivityNotFoundException e) {
                    Log.w("contact_info/dial dialer app not found", e);
                    contactInfoActivity.A0C.A07(R.string.view_contact_unsupport, 0);
                    return;
                }
            case 2:
                LinkedDevicesActivity linkedDevicesActivity = ((C650535s) this.A00).A04.A00;
                LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment = new LinkedDevicesDetailDialogFragment((C1PP) this.A01, ((C20R) linkedDevicesActivity).A0B);
                linkedDevicesActivity.A05 = linkedDevicesDetailDialogFragment;
                linkedDevicesDetailDialogFragment.A00 = linkedDevicesActivity;
                linkedDevicesDetailDialogFragment.A14(linkedDevicesActivity.A0N(), null);
                return;
            case 3:
                LinkedDevicesActivity linkedDevicesActivity2 = ((C650535s) this.A00).A04.A00;
                LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment2 = new LinkedDevicesDetailDialogFragment((C0JV) this.A01, ((C20R) linkedDevicesActivity2).A0B);
                linkedDevicesActivity2.A05 = linkedDevicesDetailDialogFragment2;
                linkedDevicesDetailDialogFragment2.A00 = linkedDevicesActivity2;
                linkedDevicesDetailDialogFragment2.A14(linkedDevicesActivity2.A0N(), null);
                return;
            case 4:
                LinkedDevicesActivity linkedDevicesActivity3 = ((C650535s) this.A00).A04.A00;
                LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment3 = new LinkedDevicesDetailDialogFragment((C42881wU) this.A01, ((C20R) linkedDevicesActivity3).A0B);
                linkedDevicesActivity3.A05 = linkedDevicesDetailDialogFragment3;
                linkedDevicesDetailDialogFragment3.A00 = linkedDevicesActivity3;
                linkedDevicesDetailDialogFragment3.A14(linkedDevicesActivity3.A0N(), null);
                return;
            case 5:
                Intent intent = new Intent();
                intent.putExtra("call_type", 2);
                ((C54532iu) this.A00).A03.A1c((C06C) this.A01, intent);
                return;
            case 6:
                Intent intent2 = new Intent();
                intent2.putExtra("call_type", 1);
                ((C54532iu) this.A00).A03.A1c((C06C) this.A01, intent2);
                return;
            case 7:
                ((C54532iu) this.A00).A03.A1L((C06C) this.A01);
                return;
            case 8:
                C471529v c471529v = (C471529v) this.A00;
                C06C c06c2 = (C06C) this.A01;
                if (c06c2.A0V) {
                    c471529v.A00.A1k(c06c2);
                    return;
                }
                return;
            case 9:
                ((C2JA) this.A00).AMZ((MenuItem) this.A01);
                return;
            case 10:
                C2JC c2jc = (C2JC) this.A00;
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) this.A01;
                if (((C2JE) c2jc).A02 == null || RequestPermissionActivity.A0Q(c2jc.getContext(), ((C2JE) c2jc).A02)) {
                    InterfaceC04690Ll rowsContainer = c2jc.getRowsContainer();
                    if (rowsContainer == null || ((c48652Gd = c2jc.A05) != null && c48652Gd.A0C())) {
                        ((C2JE) c2jc).A0C.onClick(view);
                        return;
                    }
                    rowsContainer.A5M(anonymousClass092.A0n);
                    c2jc.A0p();
                    return;
                }
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                AbstractC48182Ef abstractC48182Ef = (AbstractC48182Ef) this.A00;
                C04280Jo c04280Jo = (C04280Jo) this.A01;
                List A19 = c04280Jo.A19();
                if (A19.isEmpty()) {
                    StringBuilder A0P2 = C000200d.A0P("call logs are empty, message.key=");
                    A0P2.append(c04280Jo.A0n);
                    Log.e(A0P2.toString());
                    return;
                }
                Object obj = A19.get(0);
                C000700j.A04(obj, "null call log");
                C0D3 c0d3 = (C0D3) obj;
                Activity A0F = C02180Ae.A0F(abstractC48182Ef.getContext());
                if ((A0F instanceof ActivityC02330At) && c0d3.A0E()) {
                    AnonymousClass029.A1H(c0d3, abstractC48182Ef.A0R, (ActivityC02330At) A0F, 8);
                    return;
                }
                C2IY c2iy = abstractC48182Ef.A13;
                C05W c05w = abstractC48182Ef.A0R;
                AbstractC005302j abstractC005302j = c04280Jo.A0n.A00;
                if (abstractC005302j != null) {
                    c2iy.A00(c05w.A0A(abstractC005302j), A0F, 8, false, c04280Jo.A1C());
                    return;
                }
                throw null;
            case 12:
                AbstractC48182Ef abstractC48182Ef2 = (AbstractC48182Ef) this.A00;
                AnonymousClass092 A0E = abstractC48182Ef2.A0a.A0E((AnonymousClass093) this.A01);
                Conversation conversation = (Conversation) C02180Ae.A0G(abstractC48182Ef2.getContext(), Conversation.class);
                if (A0E == null || conversation == null) {
                    return;
                }
                conversation.A2M(A0E, conversation.getResources().getDimensionPixelSize(R.dimen.conversation_row_min_height));
                return;
            case 13:
                final C51532Wv c51532Wv = (C51532Wv) this.A00;
                final AnonymousClass092 anonymousClass0922 = (AnonymousClass092) this.A01;
                C40261rr c40261rr = c51532Wv.A01;
                AnonymousClass093 anonymousClass093 = anonymousClass0922.A0F;
                if (anonymousClass093 != null) {
                    if (c40261rr.A0H(UserJid.of(anonymousClass093.A0B))) {
                        ((C0B5) c51532Wv.getContext()).AUh(UnblockDialogFragment.A00(c51532Wv.getContext().getString(R.string.payment_unblock_ask, ((AbstractC48182Ef) c51532Wv).A0T.A08(((AbstractC48182Ef) c51532Wv).A0R.A0A(anonymousClass0922.A0F.A0B), false)), 0, false, new C2nQ() { // from class: X.383
                            @Override // X.C2nQ
                            public final void AVi() {
                                C51532Wv c51532Wv2 = c51532Wv;
                                AnonymousClass092 anonymousClass0923 = anonymousClass0922;
                                C40261rr c40261rr2 = c51532Wv2.A01;
                                Activity A00 = C018308n.A00(c51532Wv2.getContext());
                                UserJid userJid = anonymousClass0923.A0F.A0B;
                                if (userJid != null) {
                                    c40261rr2.A07(A00, null, UserJid.of(userJid));
                                    return;
                                }
                                throw null;
                            }
                        }));
                        return;
                    }
                    Intent A01 = c51532Wv.A03.A01(c51532Wv.getContext(), true, false);
                    A01.putExtra("extra_payment_preset_amount", c51532Wv.A05.A01().A7z(((AbstractC48202Eh) c51532Wv).A0J, anonymousClass0922.A0F.A07));
                    AbstractC005302j abstractC005302j2 = anonymousClass0922.A0n.A00;
                    if (abstractC005302j2 instanceof GroupJid) {
                        A01.putExtra("extra_jid", abstractC005302j2.getRawString());
                        A01.putExtra("extra_receiver_jid", C003101m.A07(anonymousClass0922.A0F.A0B));
                    } else {
                        A01.putExtra("extra_jid", C003101m.A07(anonymousClass0922.A0F.A0B));
                    }
                    A01.putExtra("extra_payment_note", anonymousClass0922.A0G());
                    A01.putExtra("extra_conversation_message_type", 1);
                    if (anonymousClass0922.A12()) {
                        List list2 = anonymousClass0922.A0c;
                        if (list2 != null) {
                            A01.putStringArrayListExtra("extra_mentioned_jids", new ArrayList<>(C003101m.A0E(list2)));
                        } else {
                            throw null;
                        }
                    }
                    c51532Wv.getContext().startActivity(A01);
                    return;
                }
                throw null;
            case 14:
                C51552Wx c51552Wx = (C51552Wx) this.A00;
                Intent intent3 = new Intent(c51552Wx.getContext(), c51552Wx.A03.A03().A8H());
                intent3.putExtra("extra_setup_mode", 2);
                intent3.putExtra("extra_jid", C003101m.A07(((AnonymousClass092) this.A01).A0A()));
                c51552Wx.getContext().startActivity(intent3);
                return;
            case 15:
                C51552Wx c51552Wx2 = (C51552Wx) this.A00;
                Intent intent4 = new Intent(c51552Wx2.getContext(), c51552Wx2.A03.A03().A8H());
                intent4.putExtra("extra_setup_mode", 1);
                intent4.putExtra("extra_jid", C003101m.A07(((AnonymousClass092) this.A01).A0A()));
                c51552Wx2.getContext().startActivity(intent4);
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                C51552Wx c51552Wx3 = (C51552Wx) this.A00;
                Intent intent5 = new Intent(c51552Wx3.getContext(), c51552Wx3.A03.A03().AD3());
                intent5.putExtra("extra_jid", C003101m.A07(((AnonymousClass092) this.A01).A0A()));
                c51552Wx3.getContext().startActivity(intent5);
                return;
            case 17:
                C51572Wz c51572Wz = (C51572Wz) this.A00;
                AnonymousClass093 anonymousClass0932 = (AnonymousClass093) this.A01;
                Intent intent6 = new Intent(c51572Wz.getContext(), c51572Wz.A01.A03().ACL());
                AbstractC005302j abstractC005302j3 = anonymousClass0932.A0A;
                boolean z = anonymousClass0932.A0O;
                String str = anonymousClass0932.A0J;
                if (!intent6.hasExtra("fMessageKeyJid") && !intent6.hasExtra("fMessageKeyFromMe") && !intent6.hasExtra("fMessageKeyId")) {
                    intent6.putExtra("fMessageKeyId", str).putExtra("fMessageKeyFromMe", z).putExtra("fMessageKeyJid", C003101m.A07(abstractC005302j3));
                    c51572Wz.getContext().startActivity(intent6);
                    return;
                }
                throw new IllegalArgumentException("Intent already contains key.");
            case 18:
                ((AbstractC48182Ef) this.A00).A1F.A00((C2D3) this.A01);
                return;
            case 19:
                ((C54572iy) this.A01).A05(((C2XY) this.A00).getType());
                return;
            case C0M6.A01 /* 20 */:
                SelectListBottomSheet selectListBottomSheet = (SelectListBottomSheet) this.A00;
                C54492iq c54492iq = (C54492iq) this.A01;
                if (selectListBottomSheet.A00 != null && (i = c54492iq.A00) != -1) {
                    List list3 = c54492iq.A02;
                    if (i <= list3.size() && list3.get(c54492iq.A00) != null) {
                        AnonymousClass382 anonymousClass382 = selectListBottomSheet.A00;
                        int i2 = c54492iq.A00;
                        if (i2 != -1) {
                            List list4 = c54492iq.A02;
                            if (i2 <= list4.size()) {
                                c59432sk = (C59432sk) list4.get(c54492iq.A00);
                                c0xv = c59432sk.A00;
                                C51522Wt c51522Wt = anonymousClass382.A00;
                                Activity A0G = C02180Ae.A0G(c51522Wt.getContext(), Conversation.class);
                                if (c0xv == null && A0G != null) {
                                    ((AbstractC48182Ef) c51522Wt).A0G.A02.postDelayed(new RunnableEBaseShape0S0300000_I0_0(c51522Wt, A0G, c0xv, 6), 400L);
                                } else {
                                    Log.e("ConversationRow/onQuickReplyButtonClicked/error: not click in Conversation");
                                }
                            }
                        }
                        c59432sk = null;
                        c0xv = c59432sk.A00;
                        C51522Wt c51522Wt2 = anonymousClass382.A00;
                        Activity A0G2 = C02180Ae.A0G(c51522Wt2.getContext(), Conversation.class);
                        if (c0xv == null) {
                        }
                        Log.e("ConversationRow/onQuickReplyButtonClicked/error: not click in Conversation");
                    }
                }
                selectListBottomSheet.A10();
                return;
            case 21:
                C54982jg c54982jg = (C54982jg) this.A00;
                c54982jg.A03.AIW((AbstractC005302j) this.A01, c54982jg.A0C);
                return;
            case 22:
                ((C54982jg) this.A00).A03.AIZ((C05160No) this.A01);
                return;
            case 23:
                ((C54972jf) this.A00).A07.AIZ((C05160No) this.A01);
                return;
            case 24:
                C54972jf c54972jf = (C54972jf) this.A00;
                c54972jf.A07.AIW((AbstractC005302j) this.A01, ((AbstractC52772bI) c54972jf).A0C);
                return;
            case 25:
                C54972jf c54972jf2 = (C54972jf) this.A00;
                C29a c29a = c54972jf2.A07;
                ViewHolder viewHolder = ((AbstractC52772bI) c54972jf2).A0C;
                c29a.AIX((AbstractC005302j) this.A01, viewHolder.A05, viewHolder.A0R);
                return;
            case 26:
                C471029p c471029p = (C471029p) this.A00;
                Iterator it = ((AbstractCollection) this.A01).iterator();
                while (it.hasNext()) {
                    AbstractC005302j abstractC005302j4 = (AbstractC005302j) it.next();
                    if (!C003101m.A0a(abstractC005302j4)) {
                        ConversationsFragment conversationsFragment = c471029p.A0F;
                        conversationsFragment.A10.A05(abstractC005302j4, true);
                        conversationsFragment.A1T.A01(3, abstractC005302j4, 0L, 0);
                    }
                }
                return;
            case 27:
                C54992jh c54992jh = (C54992jh) this.A00;
                c54992jh.A04.AIY((AnonymousClass092) this.A01, c54992jh.A0C);
                return;
            case 28:
                GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A00;
                PointF pointF = (PointF) this.A01;
                if (groupAdminPickerActivity.A03.getVisibility() == 0 || pointF.y >= groupAdminPickerActivity.A02.getY() + groupAdminPickerActivity.A02.getPaddingTop()) {
                    return;
                }
                groupAdminPickerActivity.A06.A0O(4);
                return;
            case 29:
                ((GroupChatInfo) this.A00).A1s((C1M7) this.A01);
                return;
            case 30:
                MediaViewBaseFragment mediaViewBaseFragment = (MediaViewBaseFragment) this.A00;
                view.setOnClickListener((ViewOnClickEBaseShape0S0200000_I0_0) this.A01);
                mediaViewBaseFragment.A1A(!mediaViewBaseFragment.A0G, true);
                return;
            case 31:
                StringBuilder A0P3 = C000200d.A0P("mediaview/audioclick ");
                ProgressBar progressBar = (ProgressBar) this.A00;
                A0P3.append(progressBar.getProgress());
                A0P3.append(" | ");
                A0P3.append(progressBar.getMax());
                A0P3.append(" - ");
                MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A01;
                C000200d.A1F(A0P3, mediaViewFragment.A01);
                if (mediaViewFragment.A11 != null) {
                    if (mediaViewFragment.A01 == 2 && progressBar.getProgress() > 0 && progressBar.getProgress() < progressBar.getMax()) {
                        mediaViewFragment.A12.A01();
                        mediaViewFragment.A0P.A03();
                        try {
                            mediaViewFragment.A11.A07();
                            mediaViewFragment.A06.sendEmptyMessage(0);
                            mediaViewFragment.A1F();
                            mediaViewFragment.A01 = 1;
                            return;
                        } catch (IOException e2) {
                            Log.e("mediaview/failed to start from mid pause", e2);
                            ((ActivityC02290Ap) mediaViewFragment.A0A()).AUj(R.string.gallery_audio_cannot_load);
                            return;
                        }
                    }
                    int i3 = mediaViewFragment.A01;
                    if (i3 == 2) {
                        if (mediaViewFragment.A11.A01() >= mediaViewFragment.A11.A02() && progressBar.getProgress() == progressBar.getMax()) {
                            progressBar.setProgress(0);
                            try {
                                mediaViewFragment.A11.A09(0);
                            } catch (IOException | IllegalStateException e3) {
                                Log.e("mediaview/failed to start from beginning reset pause", e3);
                                ((ActivityC02290Ap) mediaViewFragment.A0A()).AUj(R.string.gallery_audio_cannot_load);
                                return;
                            }
                        }
                        mediaViewFragment.A12.A01();
                        mediaViewFragment.A0P.A03();
                        try {
                            mediaViewFragment.A11.A07();
                            mediaViewFragment.A06.removeMessages(0);
                            mediaViewFragment.A06.sendEmptyMessage(0);
                            mediaViewFragment.A1F();
                            mediaViewFragment.A01 = 1;
                            return;
                        } catch (IOException e4) {
                            Log.e("mediaview/failed to start from beginning no reset pause", e4);
                            ((ActivityC02290Ap) mediaViewFragment.A0A()).AUj(R.string.gallery_audio_cannot_load);
                            return;
                        }
                    } else if (i3 == 1) {
                        mediaViewFragment.A1E();
                        return;
                    } else {
                        int i4 = mediaViewFragment.A03;
                        InterfaceC48692Gh interfaceC48692Gh = mediaViewFragment.A0q;
                        if (interfaceC48692Gh != null && (ABE = interfaceC48692Gh.ABE(i4)) != null) {
                            mediaViewFragment.A1K(ABE);
                            if (mediaViewFragment.A11 != null) {
                                mediaViewFragment.A12.A01();
                                mediaViewFragment.A0P.A03();
                                try {
                                    mediaViewFragment.A11.A07();
                                    mediaViewFragment.A1F();
                                    mediaViewFragment.A06.sendEmptyMessage(0);
                                    mediaViewFragment.A01 = 1;
                                    return;
                                } catch (IOException e5) {
                                    Log.e("mediaview/failed to start from unknown", e5);
                                    ((ActivityC02290Ap) mediaViewFragment.A0A()).AUj(R.string.gallery_audio_cannot_load);
                                    return;
                                }
                            }
                            return;
                        }
                        throw null;
                    }
                }
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                C20X c20x = (C20X) this.A00;
                ((View) this.A01).setVisibility(8);
                c20x.A06 = false;
                if (c20x.A07) {
                    c20x.A03.A01.ARd();
                }
                c20x.A03.post(new RunnableEBaseShape5S0100000_I0_5(c20x, 14));
                return;
            case 33:
                ((ActivityC02290Ap) this.A00).AUg((DialogFragment) this.A01, null);
                return;
            case 34:
                ((SearchViewModel) this.A00).A0I((UserJid) ((C06C) this.A01).A03(UserJid.class));
                return;
            case 35:
                Object obj2 = this.A01;
                SearchViewModel searchViewModel = ((C86143wv) this.A00).A00;
                searchViewModel.A0L(false);
                searchViewModel.A0F(2);
                searchViewModel.A0T.A0B(obj2);
                return;
            case 36:
                Object obj3 = this.A01;
                SearchViewModel searchViewModel2 = ((C86143wv) this.A00).A00;
                searchViewModel2.A0L(false);
                searchViewModel2.A0F(2);
                searchViewModel2.A0T.A0B(obj3);
                return;
            case 37:
                Object obj4 = this.A01;
                SearchViewModel searchViewModel3 = ((C86153ww) this.A00).A00;
                searchViewModel3.A0L(false);
                searchViewModel3.A0F(2);
                searchViewModel3.A0T.A0B(obj4);
                return;
            case 38:
                Object obj5 = this.A01;
                SearchViewModel searchViewModel4 = ((C86163wx) this.A00).A00;
                searchViewModel4.A0L(false);
                searchViewModel4.A0F(2);
                searchViewModel4.A0T.A0B(obj5);
                return;
            case 39:
                Object obj6 = this.A01;
                SearchViewModel searchViewModel5 = ((C86173wy) this.A00).A00;
                searchViewModel5.A0L(false);
                searchViewModel5.A0R.A0B(obj6);
                return;
            case 40:
                Object obj7 = this.A01;
                SearchViewModel searchViewModel6 = ((C86183wz) this.A00).A00;
                searchViewModel6.A0L(false);
                searchViewModel6.A0F(2);
                searchViewModel6.A0T.A0B(obj7);
                return;
            case 41:
                Object obj8 = this.A01;
                SearchViewModel searchViewModel7 = ((C86193x0) this.A00).A00;
                searchViewModel7.A0L(false);
                searchViewModel7.A0F(2);
                searchViewModel7.A0T.A0B(obj8);
                return;
            case 42:
                Object obj9 = this.A01;
                SearchViewModel searchViewModel8 = ((C86203x1) this.A00).A00;
                searchViewModel8.A0L(false);
                searchViewModel8.A0R.A0B(obj9);
                return;
            case 43:
                Object obj10 = this.A01;
                SearchViewModel searchViewModel9 = ((C86203x1) this.A00).A00;
                searchViewModel9.A0L(false);
                searchViewModel9.A0F(2);
                searchViewModel9.A0T.A0B(obj10);
                return;
            case 44:
                Object obj11 = this.A01;
                SearchViewModel searchViewModel10 = ((C86213x2) this.A00).A00;
                searchViewModel10.A0L(false);
                searchViewModel10.A0F(2);
                searchViewModel10.A0T.A0B(obj11);
                return;
            case 45:
                Object obj12 = this.A01;
                SearchViewModel searchViewModel11 = ((C86223x3) this.A00).A00;
                searchViewModel11.A0L(false);
                searchViewModel11.A0F(2);
                searchViewModel11.A0T.A0B(obj12);
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                ((View) this.A01).setEnabled(false);
                ((DownloadableWallpaperPickerActivity) this.A00).A06.A02();
                return;
            case 47:
                ImageView imageView = (ImageView) this.A01;
                final StatusesFragment statusesFragment = ((C54822jP) this.A00).A01;
                if (statusesFragment.A00 == null) {
                    statusesFragment.A0s = !statusesFragment.A0s;
                    statusesFragment.A17(imageView);
                    if (statusesFragment.A0s) {
                        statusesFragment.A1A(false, new AnimatorListenerAdapter() { // from class: X.3X5
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationCancel(Animator animator) {
                                animator.removeListener(this);
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                StatusesFragment statusesFragment2 = statusesFragment;
                                statusesFragment2.A0n.removeAll(statusesFragment2.A0o);
                                statusesFragment2.A0b.notifyDataSetChanged();
                                statusesFragment2.A00 = null;
                            }
                        });
                        return;
                    }
                    statusesFragment.A0n.addAll(statusesFragment.A0o);
                    statusesFragment.A0b.notifyDataSetChanged();
                    statusesFragment.A0x();
                    ((ListFragment) statusesFragment).A04.getViewTreeObserver().addOnPreDrawListener(new C3X4(statusesFragment));
                    return;
                }
                return;
            case 48:
                DescribeProblemActivity describeProblemActivity = (DescribeProblemActivity) this.A00;
                TextView textView = (TextView) this.A01;
                int length = describeProblemActivity.A1P().getBytes().length;
                if (!describeProblemActivity.A0J && length < 10) {
                    describeProblemActivity.A02.setBackground(C02160Ac.A03(describeProblemActivity, R.drawable.describe_problem_edittext_bg_error));
                    if (length == 0) {
                        textView.setText(R.string.describe_problem_description);
                    } else {
                        textView.setText(R.string.describe_problem_description_further);
                    }
                    textView.setVisibility(0);
                    return;
                }
                describeProblemActivity.A02.setBackground(C02160Ac.A03(describeProblemActivity, R.drawable.describe_problem_edittext_state_list));
                textView.setVisibility(8);
                int i5 = describeProblemActivity.A00;
                if (i5 != 2 && i5 != 3 && !"voip-dev@whatsapp.com".equals(describeProblemActivity.A0G) && !C02180Ae.A1Y(describeProblemActivity.A0H)) {
                    InterfaceC002901k interfaceC002901k = describeProblemActivity.A0F;
                    C55142jw c55142jw = describeProblemActivity.A07;
                    if (c55142jw != null && c55142jw.A00() == AsyncTask.Status.RUNNING) {
                        describeProblemActivity.A07.A05(false);
                    }
                    C006602x c006602x = describeProblemActivity.A0D;
                    C40071rX c40071rX = describeProblemActivity.A0C;
                    C002301c c002301c = ((ActivityC02310Ar) describeProblemActivity).A01;
                    C04940Mo c04940Mo = describeProblemActivity.A03;
                    C000400f c000400f = describeProblemActivity.A04;
                    C018808t c018808t = describeProblemActivity.A06;
                    C000500h c000500h = ((ActivityC02290Ap) describeProblemActivity).A0F;
                    String str2 = describeProblemActivity.A0H;
                    String str3 = describeProblemActivity.A0I;
                    InterfaceC55152jx interfaceC55152jx = describeProblemActivity.A08;
                    if (interfaceC55152jx != null) {
                        list = interfaceC55152jx.ABy();
                    } else {
                        list = null;
                    }
                    C55142jw c55142jw2 = new C55142jw(describeProblemActivity, c006602x, c40071rX, c002301c, c04940Mo, c000400f, c018808t, c000500h, describeProblemActivity, str2, str3, list, describeProblemActivity.A1P(), describeProblemActivity.A0K);
                    describeProblemActivity.A07 = c55142jw2;
                    interfaceC002901k.ARy(c55142jw2, new Void[0]);
                    return;
                }
                describeProblemActivity.A1Q();
                return;
            case 49:
                ((C2Zb) this.A00).A0E((AbstractC48662Ge) this.A01);
                return;
            default:
                return;
        }
    }
}
