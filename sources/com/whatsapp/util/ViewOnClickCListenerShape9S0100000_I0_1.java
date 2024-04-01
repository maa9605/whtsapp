package com.whatsapp.util;

import X.AbstractC02800Cx;
import X.AbstractC08920cK;
import X.AbstractC14890nk;
import X.AbstractC15200oF;
import X.AbstractC48182Ef;
import X.AbstractC51592Xb;
import X.AbstractView$OnClickListenerC49532Ky;
import X.ActivityC02290Ap;
import X.ActivityC02320As;
import X.AnonymousClass011;
import X.AnonymousClass092;
import X.AnonymousClass097;
import X.AnonymousClass223;
import X.C000200d;
import X.C000400f;
import X.C000500h;
import X.C002701i;
import X.C003101m;
import X.C011005l;
import X.C018308n;
import X.C018608r;
import X.C01B;
import X.C01C;
import X.C02820Cz;
import X.C02E;
import X.C02L;
import X.C02O;
import X.C03900Hp;
import X.C04250Jl;
import X.C04570Ky;
import X.C05U;
import X.C05V;
import X.C05W;
import X.C06C;
import X.C07700Zi;
import X.C09H;
import X.C0AT;
import X.C0BA;
import X.C0CG;
import X.C0CH;
import X.C0D7;
import X.C0DB;
import X.C0EG;
import X.C0JP;
import X.C0LD;
import X.C0M1;
import X.C0M6;
import X.C0R7;
import X.C25d;
import X.C2EV;
import X.C2GV;
import X.C2IX;
import X.C2JE;
import X.C2K4;
import X.C2MB;
import X.C2MI;
import X.C2MQ;
import X.C2WZ;
import X.C2XI;
import X.C36931lb;
import X.C3AX;
import X.C3DW;
import X.C40841sx;
import X.C41471ty;
import X.C455822q;
import X.C461325b;
import X.C48342Ew;
import X.C48352Ex;
import X.C48362Ey;
import X.C49272Jj;
import X.C51422Wj;
import X.C51442Wl;
import X.C53702hN;
import X.C61752wf;
import X.C62122xN;
import X.C66493Bg;
import X.C66553Bm;
import X.C66713Cd;
import X.C68673Ky;
import X.C78833kb;
import X.DialogC48832Gy;
import X.InterfaceC002901k;
import X.InterfaceC04740Lq;
import X.InterfaceC48372Ez;
import X.InterfaceC60692ut;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.ShareInviteLinkActivity;
import com.whatsapp.WaEditText;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.gif_search.GifSearchContainer;
import com.whatsapp.group.EditGroupAdminsSelector;
import com.whatsapp.group.GroupAddPrivacyActivity;
import com.whatsapp.group.GroupAdminPickerActivity;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.group.GroupParticipantsSearchFragment;
import com.whatsapp.group.GroupSettingsActivity;
import com.whatsapp.invites.InviteGroupParticipantsActivity;
import com.whatsapp.invites.NobodyDeprecatedDialogFragment;
import com.whatsapp.invites.RevokeInviteDialogFragment;
import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.picker.search.GifSearchDialogFragment;
import com.whatsapp.picker.search.StickerSearchDialogFragment;
import com.whatsapp.settings.SettingsJidNotificationActivity;
import com.whatsapp.support.ReportSpamDialogFragment;
import com.whatsapp.util.ViewOnClickCListenerShape9S0100000_I0_1;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class ViewOnClickCListenerShape9S0100000_I0_1 extends AbstractView$OnClickListenerC49532Ky {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape9S0100000_I0_1(ActivityC02320As activityC02320As) {
        this.A01 = 47;
        this.A00 = activityC02320As;
    }

    public ViewOnClickCListenerShape9S0100000_I0_1(AnonymousClass223 anonymousClass223) {
        this.A01 = 13;
        this.A00 = anonymousClass223;
    }

    public ViewOnClickCListenerShape9S0100000_I0_1(C51422Wj c51422Wj) {
        this.A01 = 2;
        this.A00 = c51422Wj;
    }

    public ViewOnClickCListenerShape9S0100000_I0_1(C51442Wl c51442Wl) {
        this.A01 = 3;
        this.A00 = c51442Wl;
    }

    public ViewOnClickCListenerShape9S0100000_I0_1(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    @Override // X.AbstractView$OnClickListenerC49532Ky
    public void A00(View view) {
        Class AC6;
        C3AX c3ax;
        int i;
        String str;
        C78833kb c78833kb;
        C78833kb c78833kb2;
        List list;
        InterfaceC60692ut interfaceC60692ut;
        C3AX c3ax2;
        switch (this.A01) {
            case 0:
                C2WZ c2wz = (C2WZ) this.A00;
                for (AnonymousClass097 anonymousClass097 : c2wz.A07) {
                    C09H c09h = anonymousClass097.A02;
                    if (c09h != null) {
                        if (!c09h.A0P && !c09h.A0a && !C0DB.A0m(anonymousClass097)) {
                            ((AbstractC48182Ef) c2wz).A0J.A05(anonymousClass097, true, true);
                        }
                    } else {
                        throw null;
                    }
                }
                return;
            case 1:
                ArrayList arrayList = new ArrayList();
                C2WZ c2wz2 = (C2WZ) this.A00;
                for (AnonymousClass097 anonymousClass0972 : c2wz2.A07) {
                    if (C40841sx.A0h(anonymousClass0972)) {
                        C2K4 c2k4 = c2wz2.A03;
                        if (c2k4 == null) {
                            throw null;
                        }
                        c2k4.A00(anonymousClass0972);
                    } else {
                        C09H c09h2 = anonymousClass0972.A02;
                        if (c09h2 != null) {
                            if (!c09h2.A0P && !c09h2.A0a && anonymousClass0972.A09 != null && c09h2.A07 != 1) {
                                arrayList.add(anonymousClass0972);
                            }
                        } else {
                            throw null;
                        }
                    }
                }
                C018608r c018608r = ((AbstractC48182Ef) c2wz2).A0N;
                Activity A00 = C018308n.A00(c2wz2.getContext());
                if (c018608r != null) {
                    if (arrayList.size() != 0) {
                        C000400f c000400f = c018608r.A0H;
                        if (c000400f.A0A(new C2EV(c000400f, A00))) {
                            C68673Ky c68673Ky = new C68673Ky(c018608r.A04, c018608r.A0k, c018608r.A0F, c000400f, A00, c018608r.A05((AnonymousClass092) arrayList.get(0)));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                c018608r.A0r.A05((AnonymousClass097) it.next(), 0, c68673Ky);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw null;
            case 2:
                C51422Wj c51422Wj = (C51422Wj) this.A00;
                ((AbstractC48182Ef) c51422Wj).A0N.A0W(c51422Wj.getFMessage());
                return;
            case 3:
                C51442Wl c51442Wl = (C51442Wl) this.A00;
                ((AbstractC48182Ef) c51442Wl).A0N.A0W(c51442Wl.getFMessage());
                return;
            case 4:
                C2JE c2je = (C2JE) this.A00;
                AnonymousClass097 fMessage = c2je.getFMessage();
                if (C40841sx.A0h(fMessage)) {
                    C2K4 c2k42 = c2je.A06;
                    if (c2k42 == null) {
                        throw null;
                    }
                    c2k42.A00(fMessage);
                    return;
                }
                C09H c09h3 = fMessage.A02;
                if (c09h3 != null) {
                    if (c09h3.A07 == 1) {
                        if (fMessage.A0m == 2) {
                            ((AbstractC48182Ef) c2je).A0G.A05(R.string.gallery_unsafe_audio_removed, 1);
                            return;
                        } else {
                            ((AbstractC48182Ef) c2je).A0G.A05(R.string.gallery_unsafe_video_removed, 1);
                            return;
                        }
                    } else if (fMessage.A09 != null) {
                        ((AbstractC48182Ef) c2je).A0N.A0B((ActivityC02290Ap) C018308n.A01(c2je.getContext(), ActivityC02290Ap.class), fMessage, true);
                        return;
                    } else {
                        Log.e("cannot download media message with no media attached");
                        ((AbstractC48182Ef) c2je).A0G.A07(R.string.invalid_media_message_download, 0);
                        return;
                    }
                }
                throw null;
            case 5:
                C2JE c2je2 = (C2JE) this.A00;
                ((AbstractC48182Ef) c2je2).A0J.A05(c2je2.getFMessage(), true, true);
                return;
            case 6:
                C2JE c2je3 = (C2JE) this.A00;
                AnonymousClass097 fMessage2 = c2je3.getFMessage();
                if (C40841sx.A0h(fMessage2)) {
                    C2K4 c2k43 = c2je3.A06;
                    if (c2k43 != null) {
                        C0CH c0ch = (C0CH) c2k43.A07.get(fMessage2);
                        if (c0ch != null) {
                            c0ch.cancel();
                            return;
                        }
                        return;
                    }
                    throw null;
                } else if (!C0DB.A0m(c2je3.getFMessage())) {
                    c2je3.A04.A08(fMessage2, true);
                    return;
                } else {
                    c2je3.A05.A07(fMessage2, false, false);
                    return;
                }
            case 7:
                ((AbstractC48182Ef) this.A00).A0N();
                return;
            case 8:
                C2XI c2xi = (C2XI) this.A00;
                C0JP fMessage3 = c2xi.getFMessage();
                C09H c09h4 = ((AnonymousClass097) fMessage3).A02;
                if (c09h4 != null) {
                    if (c09h4.A07 == 1) {
                        ((AbstractC48182Ef) c2xi).A0G.A05(R.string.gallery_unsafe_video_removed, 1);
                        return;
                    }
                    ((C2JE) c2xi).A0A.A00(view);
                    if (((AnonymousClass097) fMessage3).A09 != null) {
                        if (c09h4.A0Z) {
                            c2xi.A0n();
                            return;
                        } else {
                            Log.e("streamdownload/unable to open playback");
                            return;
                        }
                    }
                    return;
                }
                throw null;
            case 9:
                ((AbstractC51592Xb) this.A00).A00.setVisibility(8);
                return;
            case 10:
                C0LD.A05(((C0BA) this.A00).A09(), "com.whatsapp");
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                C48362Ey c48362Ey = (C48362Ey) this.A00;
                InterfaceC60692ut interfaceC60692ut2 = c48362Ey.A09;
                if (interfaceC60692ut2 == null || interfaceC60692ut2.AFL()) {
                    c48362Ey.A07();
                    C2MI c2mi = c48362Ey.A0N;
                    if (!c2mi.A02 || (c3ax2 = c48362Ey.A0A) == null) {
                        return;
                    }
                    c3ax2.A00(c2mi);
                    return;
                }
                return;
            case 12:
                ((EmojiSearchContainer) this.A00).A04.setText("");
                return;
            case 13:
                ((AnonymousClass223) this.A00).A02();
                return;
            case 14:
                C48352Ex c48352Ex = (C48352Ex) this.A00;
                if (c48352Ex.A00 != 0 || (interfaceC60692ut = ((C48362Ey) c48352Ex).A09) == null || interfaceC60692ut.AFL()) {
                    c48352Ex.A07();
                    int i2 = c48352Ex.A00;
                    if (i2 == 0) {
                        C2MI c2mi2 = ((C48362Ey) c48352Ex).A0N;
                        if (!c2mi2.A02 || (c3ax = ((C48362Ey) c48352Ex).A0A) == null) {
                            return;
                        }
                        c3ax.A00(c2mi2);
                        return;
                    } else if (i2 != 1) {
                        if (i2 == 2 && ((C48362Ey) c48352Ex).A0N.A02 && c48352Ex.A0J != null) {
                            C461325b c461325b = c48352Ex.A0M;
                            if (c461325b != null && (c78833kb2 = c461325b.A0P) != null) {
                                C25d c25d = c461325b.A0A;
                                if (c25d != null) {
                                    list = c25d.A04;
                                } else {
                                    list = null;
                                }
                                C2IX c2ix = c461325b.A0B;
                                c78833kb2.AOR(c461325b.A0Z.A01(list, c2ix != null ? c2ix.A01 : null));
                            }
                            C78833kb c78833kb3 = c48352Ex.A0J;
                            InterfaceC04740Lq interfaceC04740Lq = c78833kb3.A02;
                            if (interfaceC04740Lq == null || c78833kb3.A00 == null) {
                                return;
                            }
                            c78833kb3.A06 = true;
                            interfaceC04740Lq.AUf(new StickerSearchDialogFragment());
                            c78833kb3.A00.dismiss();
                            return;
                        }
                        return;
                    } else if (c48352Ex.A0O.A0E(C01C.A0w) && (c78833kb = c48352Ex.A0J) != null) {
                        InterfaceC04740Lq interfaceC04740Lq2 = c78833kb.A02;
                        if (interfaceC04740Lq2 == null || c78833kb.A00 == null) {
                            return;
                        }
                        c78833kb.A06 = true;
                        interfaceC04740Lq2.AUf(new GifSearchDialogFragment());
                        c78833kb.A00.dismiss();
                        return;
                    } else {
                        final C66493Bg c66493Bg = c48352Ex.A0G;
                        if (c66493Bg != null) {
                            final C2MQ c2mq = c48352Ex.A0U;
                            C48352Ex c48352Ex2 = c66493Bg.A05;
                            c48352Ex2.A04(((C48362Ey) c48352Ex2).A0I);
                            final GifSearchContainer gifSearchContainer = c66493Bg.A08;
                            C48342Ew c48342Ew = c66493Bg.A06;
                            C455822q c455822q = c66493Bg.A07;
                            C2MB c2mb = c66493Bg.A0A;
                            AnonymousClass011 anonymousClass011 = c66493Bg.A04;
                            C01B c01b = c66493Bg.A01;
                            C02E c02e = c66493Bg.A02;
                            C000500h c000500h = c66493Bg.A03;
                            C02O c02o = c66493Bg.A09;
                            Activity activity = c66493Bg.A00;
                            InterfaceC48372Ez interfaceC48372Ez = new InterfaceC48372Ez() { // from class: X.3BY
                                @Override // X.InterfaceC48372Ez
                                public final void AKr(C49302Jn c49302Jn) {
                                    C66493Bg c66493Bg2 = c66493Bg;
                                    C455822q c455822q2 = c2mq.A06;
                                    AnonymousClass241 anonymousClass241 = c455822q2.A00;
                                    if (anonymousClass241 != null) {
                                        anonymousClass241.A00();
                                        c455822q2.A00 = null;
                                    }
                                    InterfaceC04790Lv interfaceC04790Lv = c66493Bg2.A06.A00;
                                    if (interfaceC04790Lv != null) {
                                        interfaceC04790Lv.AKr(c49302Jn);
                                    }
                                }
                            };
                            gifSearchContainer.A0B = c2mq;
                            gifSearchContainer.A09 = c455822q;
                            gifSearchContainer.A0E = c2mb;
                            gifSearchContainer.A08 = anonymousClass011;
                            gifSearchContainer.A04 = c01b;
                            gifSearchContainer.A06 = c02e;
                            gifSearchContainer.A07 = c000500h;
                            gifSearchContainer.A0D = c02o;
                            gifSearchContainer.A0C = interfaceC48372Ez;
                            if (!gifSearchContainer.A0G) {
                                gifSearchContainer.A0G = true;
                                activity.getLayoutInflater().inflate(R.layout.gif_search, (ViewGroup) gifSearchContainer, true);
                                gifSearchContainer.A01 = gifSearchContainer.findViewById(R.id.no_results);
                                gifSearchContainer.A02 = gifSearchContainer.findViewById(R.id.retry_panel);
                                gifSearchContainer.A03 = (RecyclerView) gifSearchContainer.findViewById(R.id.search_result);
                                final int dimensionPixelSize = gifSearchContainer.getResources().getDimensionPixelSize(R.dimen.selected_contacts_top_offset);
                                final GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
                                gridLayoutManager.A01 = new AbstractC14890nk() { // from class: X.3Bn
                                    @Override // X.AbstractC14890nk
                                    public int A00(int i3) {
                                        if (gifSearchContainer.A0A.A0I(i3)) {
                                            return gridLayoutManager.A00;
                                        }
                                        return 1;
                                    }
                                };
                                gifSearchContainer.A03.setLayoutManager(gridLayoutManager);
                                RecyclerView recyclerView = gifSearchContainer.A03;
                                recyclerView.A0i = true;
                                recyclerView.A0k(new AbstractC08920cK() { // from class: X.3Bo
                                    @Override // X.AbstractC08920cK
                                    public void A01(Rect rect, View view2, RecyclerView recyclerView2, C0Y0 c0y0) {
                                        int i3 = dimensionPixelSize;
                                        rect.set(0, i3, i3, 0);
                                    }
                                });
                                gifSearchContainer.findViewById(R.id.retry_button).setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1(gifSearchContainer, 14));
                                gifSearchContainer.A00 = gifSearchContainer.findViewById(R.id.progress_container);
                                WaEditText waEditText = (WaEditText) gifSearchContainer.findViewById(R.id.search_bar);
                                gifSearchContainer.A05 = waEditText;
                                Object[] objArr = new Object[1];
                                if (!(gifSearchContainer.A0B instanceof C53702hN)) {
                                    str = "Giphy";
                                } else {
                                    str = "Tenor";
                                }
                                objArr[0] = str;
                                waEditText.setHint(activity.getString(R.string.gif_search_hint, objArr));
                                gifSearchContainer.A03.A0m(new AbstractC15200oF() { // from class: X.3Bp
                                    @Override // X.AbstractC15200oF
                                    public void A01(RecyclerView recyclerView2, int i3, int i4) {
                                        if (i4 != 0) {
                                            gifSearchContainer.A05.A01();
                                        }
                                    }
                                });
                                View findViewById = gifSearchContainer.findViewById(R.id.clear_search_btn);
                                findViewById.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1(gifSearchContainer, 15));
                                gifSearchContainer.A05.addTextChangedListener(new C49272Jj(gifSearchContainer, findViewById));
                                gifSearchContainer.A05.setOnTouchListener(new View.OnTouchListener() { // from class: X.2vs
                                    @Override // android.view.View.OnTouchListener
                                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                                        gifSearchContainer.A03.A0S();
                                        return false;
                                    }
                                });
                                gifSearchContainer.findViewById(R.id.back).setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1(c48342Ew));
                            }
                            gifSearchContainer.setVisibility(0);
                            gifSearchContainer.A00.setVisibility(8);
                            gifSearchContainer.A01.setVisibility(8);
                            gifSearchContainer.A02.setVisibility(8);
                            gifSearchContainer.A00.setVisibility(0);
                            C66553Bm A01 = gifSearchContainer.A01();
                            gifSearchContainer.A0A = A01;
                            gifSearchContainer.A03.setAdapter(A01);
                            gifSearchContainer.A0A.A0H(gifSearchContainer.A0B.A00());
                            gifSearchContainer.A0F = "";
                            gifSearchContainer.A05.setText("");
                            gifSearchContainer.A05.requestFocus();
                            gifSearchContainer.A05.A02(false);
                            C2MQ c2mq2 = gifSearchContainer.A0B;
                            C36931lb c36931lb = new C36931lb();
                            if (!(c2mq2 instanceof C53702hN)) {
                                i = 0;
                            } else {
                                i = 1;
                            }
                            c36931lb.A00 = Integer.valueOf(i);
                            anonymousClass011.A0B(c36931lb, null, false);
                            C0M1 c0m1 = ((AnonymousClass223) c48342Ew).A01;
                            if (c0m1 != null) {
                                Conversation conversation = (Conversation) c0m1;
                                conversation.A0X.setTranscriptMode(2);
                                conversation.A4Q.sendEmptyMessageDelayed(0, 1000L);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case 15:
                ((C48352Ex) this.A00).A0C();
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                C48352Ex c48352Ex3 = (C48352Ex) this.A00;
                if (c48352Ex3.A00 != 0) {
                    c48352Ex3.A0F(0);
                    return;
                }
                return;
            case 17:
                C48352Ex c48352Ex4 = (C48352Ex) this.A00;
                if (c48352Ex4.A00 != 1) {
                    c48352Ex4.A0F(1);
                    c48352Ex4.A0C();
                    return;
                }
                return;
            case 18:
                C48352Ex c48352Ex5 = (C48352Ex) this.A00;
                if (c48352Ex5.A00 != 2) {
                    c48352Ex5.A0F(2);
                    c48352Ex5.A08();
                    if (c48352Ex5.A0A.getVisibility() == 0) {
                        C000200d.A0j(((C0R7) c48352Ex5).A06, "sticker_store_onboarding_badge_shown", true);
                        c48352Ex5.A0A.setVisibility(8);
                        Animation animation = c48352Ex5.A0A.getAnimation();
                        if (animation != null) {
                            animation.cancel();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 19:
                GroupAddPrivacyActivity.A00((GroupAddPrivacyActivity) this.A00, 1);
                return;
            case C0M6.A01 /* 20 */:
                GroupAddPrivacyActivity.A00((GroupAddPrivacyActivity) this.A00, 0);
                return;
            case 21:
                GroupAddPrivacyActivity.A00((GroupAddPrivacyActivity) this.A00, 2);
                return;
            case 22:
                GroupAddPrivacyActivity.A00((GroupAddPrivacyActivity) this.A00, 3);
                return;
            case 23:
                GroupAddPrivacyActivity groupAddPrivacyActivity = (GroupAddPrivacyActivity) this.A00;
                if (((ActivityC02290Ap) groupAddPrivacyActivity).A0B.A0E(C01C.A0y)) {
                    if (groupAddPrivacyActivity.A00 != 2 && groupAddPrivacyActivity.A06) {
                        groupAddPrivacyActivity.AUh(new NobodyDeprecatedDialogFragment());
                        return;
                    }
                } else if (groupAddPrivacyActivity == null) {
                    throw null;
                }
                Intent intent = new Intent();
                intent.putExtra("groupadd", groupAddPrivacyActivity.A00);
                groupAddPrivacyActivity.setResult(-1, intent);
                groupAddPrivacyActivity.finish();
                return;
            case 24:
                ((GroupAdminPickerActivity) this.A00).A1P();
                return;
            case 25:
                GroupChatInfo groupChatInfo = (GroupChatInfo) this.A00;
                C0AT.A0V(groupChatInfo.A0O, 4);
                AbstractC02800Cx A0N = groupChatInfo.A0N();
                if (A0N != null) {
                    C02820Cz c02820Cz = new C02820Cz(A0N);
                    GroupParticipantsSearchFragment groupParticipantsSearchFragment = new GroupParticipantsSearchFragment();
                    c02820Cz.A01(R.id.search_container, groupParticipantsSearchFragment, null);
                    groupParticipantsSearchFragment.A00 = groupChatInfo.A0O;
                    c02820Cz.A03(null);
                    c02820Cz.A04();
                    return;
                }
                throw null;
            case 26:
                GroupChatInfo groupChatInfo2 = (GroupChatInfo) this.A00;
                groupChatInfo2.startActivity(new Intent(groupChatInfo2, StarredMessagesActivity.class).putExtra("jid", C003101m.A07(groupChatInfo2.A0n.A02())));
                return;
            case 27:
                GroupChatInfo groupChatInfo3 = (GroupChatInfo) this.A00;
                if (!groupChatInfo3.A17.A02() || (AC6 = groupChatInfo3.A18.A03().AC6()) == null) {
                    return;
                }
                groupChatInfo3.startActivity(new Intent(groupChatInfo3, AC6).putExtra("extra_jid", C003101m.A07(groupChatInfo3.A0n.A02())));
                return;
            case 28:
                GroupChatInfo groupChatInfo4 = (GroupChatInfo) this.A00;
                if (groupChatInfo4.A0h.A05(groupChatInfo4.A13)) {
                    groupChatInfo4.A12(R.string.register_wait_message);
                    C011005l c011005l = groupChatInfo4.A13;
                    if (c011005l != null) {
                        groupChatInfo4.A1A.A06(c011005l);
                        groupChatInfo4.A0N.A02(groupChatInfo4.A13);
                        ((ChatInfoActivity) groupChatInfo4).A0J.ARy(new C66713Cd(groupChatInfo4, groupChatInfo4.A0m, groupChatInfo4.A13), new Object[0]);
                        return;
                    }
                    throw null;
                }
                groupChatInfo4.A1K.A06(groupChatInfo4).A01.A03(new C0CG() { // from class: X.3CE
                    {
                        ViewOnClickCListenerShape9S0100000_I0_1.this = this;
                    }

                    @Override // X.C0CG
                    public final void A54(Object obj) {
                        C002701i.A19((Activity) ViewOnClickCListenerShape9S0100000_I0_1.this.A00, 1);
                    }
                }, null);
                return;
            case 29:
                ((GroupChatInfo) this.A00).A0p.A02().A01.A03(new C0CG() { // from class: X.3CF
                    {
                        ViewOnClickCListenerShape9S0100000_I0_1.this = this;
                    }

                    @Override // X.C0CG
                    public final void A54(Object obj) {
                        Boolean bool = (Boolean) obj;
                        GroupChatInfo groupChatInfo5 = (GroupChatInfo) ViewOnClickCListenerShape9S0100000_I0_1.this.A00;
                        if (!groupChatInfo5.AFE()) {
                            Jid A03 = groupChatInfo5.A0n.A03(C011005l.class);
                            if (A03 != null) {
                                groupChatInfo5.AUh(ReportSpamDialogFragment.A00((AbstractC005302j) A03, "group_info", bool.booleanValue()));
                                return;
                            }
                            throw null;
                        }
                    }
                }, null);
                return;
            case 30:
                GroupChatInfo groupChatInfo5 = (GroupChatInfo) this.A00;
                groupChatInfo5.A15.A0A(groupChatInfo5, groupChatInfo5.A13, null);
                return;
            case 31:
                GroupChatInfo groupChatInfo6 = (GroupChatInfo) this.A00;
                groupChatInfo6.startActivity(new Intent(groupChatInfo6.getApplicationContext(), GroupSettingsActivity.class).putExtra("gid", groupChatInfo6.A13.getRawString()));
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                GroupChatInfo groupChatInfo7 = (GroupChatInfo) this.A00;
                groupChatInfo7.startActivityForResult(new Intent(groupChatInfo7.getApplicationContext(), SettingsJidNotificationActivity.class).putExtra("jid", groupChatInfo7.A13.getRawString()), 16);
                return;
            case 33:
                C61752wf c61752wf = ((GroupChatInfo) this.A00).A0y;
                if (c61752wf.A0A.A05(c61752wf.A0C)) {
                    C05W c05w = c61752wf.A05;
                    C011005l c011005l2 = c61752wf.A0C;
                    C06C A0A = c05w.A0A(c011005l2);
                    if (!c61752wf.A0A.A06(c011005l2) && A0A.A0Z) {
                        c61752wf.A02.AUj(R.string.failed_update_group_info_not_admin);
                        return;
                    } else {
                        C002701i.A19(c61752wf.A02, 4);
                        return;
                    }
                }
                c61752wf.A02.AUj(R.string.subject_change_not_authorized);
                return;
            case 34:
                ((GroupChatInfo) this.A00).A1f();
                return;
            case 35:
                GroupChatInfo groupChatInfo8 = (GroupChatInfo) this.A00;
                Intent intent2 = new Intent(groupChatInfo8, ShareInviteLinkActivity.class);
                intent2.putExtra("jid", groupChatInfo8.A13.getRawString());
                groupChatInfo8.startActivity(intent2);
                return;
            case 36:
                ((GroupParticipantsSearchFragment) this.A00).A0z();
                return;
            case 37:
                GroupSettingsActivity groupSettingsActivity = (GroupSettingsActivity) this.A00;
                if (groupSettingsActivity != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = groupSettingsActivity.A06.A01(groupSettingsActivity.A0C).A05().iterator();
                    while (true) {
                        C04250Jl c04250Jl = (C04250Jl) it2;
                        if (c04250Jl.hasNext()) {
                            C0D7 c0d7 = (C0D7) c04250Jl.next();
                            int i3 = c0d7.A01;
                            if (i3 != 0 && i3 != 2) {
                                C02L c02l = groupSettingsActivity.A01;
                                UserJid userJid = c0d7.A03;
                                if (!c02l.A0A(userJid)) {
                                    arrayList2.add(userJid);
                                }
                            }
                        } else {
                            Intent intent3 = new Intent(groupSettingsActivity, EditGroupAdminsSelector.class);
                            intent3.putExtra("gid", groupSettingsActivity.A0C.getRawString());
                            intent3.putExtra("selected", C003101m.A0E(arrayList2));
                            groupSettingsActivity.startActivityForResult(intent3, 17);
                            return;
                        }
                    }
                } else {
                    throw null;
                }
                break;
            case 38:
                ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) this.A00;
                activityC02290Ap.A0F.A0C("security_notifications_alert_timestamp");
                activityC02290Ap.A0A.A02.post(new RunnableEBaseShape8S0100000_I1_0(this, 37));
                return;
            case 39:
                InviteGroupParticipantsActivity inviteGroupParticipantsActivity = (InviteGroupParticipantsActivity) this.A00;
                C018608r c018608r2 = inviteGroupParticipantsActivity.A02;
                String A08 = inviteGroupParticipantsActivity.A04.A08(inviteGroupParticipantsActivity.A0C, false);
                List<C62122xN> list2 = inviteGroupParticipantsActivity.A0M;
                byte[] bArr = inviteGroupParticipantsActivity.A0N;
                String stringText = inviteGroupParticipantsActivity.A0I.getStringText();
                if (c018608r2 != null) {
                    for (C62122xN c62122xN : list2) {
                        C05U c05u = c018608r2.A12;
                        UserJid userJid2 = c62122xN.A02;
                        C011005l c011005l3 = c62122xN.A01;
                        C02L c02l2 = c018608r2.A06;
                        c02l2.A05();
                        UserJid userJid3 = c02l2.A03;
                        String str2 = c62122xN.A03;
                        long A05 = c018608r2.A0J.A05();
                        long j = c62122xN.A00;
                        C05V c05v = c05u.A07;
                        C04570Ky c04570Ky = new C04570Ky(C05V.A00(c05v.A01, c05v.A00, userJid2, true), A05);
                        ((AnonymousClass092) c04570Ky).A01 = 1;
                        c04570Ky.A01 = c011005l3;
                        c04570Ky.A02 = userJid3;
                        c04570Ky.A04 = A08;
                        c04570Ky.A05 = str2;
                        c04570Ky.A00 = j;
                        c04570Ky.A06 = false;
                        c04570Ky.A03 = stringText;
                        if (bArr != null) {
                            C03900Hp A0E = c04570Ky.A0E();
                            if (A0E == null) {
                                throw null;
                            }
                            A0E.A03(bArr);
                        }
                        c018608r2.A0R(c04570Ky);
                        c018608r2.A0U.A0Q(c04570Ky);
                    }
                    inviteGroupParticipantsActivity.setResult(-1);
                    ((ActivityC02290Ap) inviteGroupParticipantsActivity).A0A.A0E(inviteGroupParticipantsActivity.A0A.A0A(R.plurals.group_invites_sent, inviteGroupParticipantsActivity.A0M.size(), Integer.valueOf(inviteGroupParticipantsActivity.A0M.size())), 0);
                    inviteGroupParticipantsActivity.finish();
                    return;
                }
                throw null;
            case 40:
                ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) this.A00;
                if (viewGroupInviteActivity.A0S) {
                    UserJid userJid4 = viewGroupInviteActivity.A0L;
                    if (userJid4 != null) {
                        C04570Ky c04570Ky2 = viewGroupInviteActivity.A0P;
                        if (c04570Ky2 != null) {
                            RevokeInviteDialogFragment revokeInviteDialogFragment = new RevokeInviteDialogFragment();
                            Bundle bundle = new Bundle();
                            bundle.putString("jid", userJid4.getRawString());
                            bundle.putLong("invite_row_id", c04570Ky2.A0p);
                            revokeInviteDialogFragment.A0P(bundle);
                            viewGroupInviteActivity.AUh(revokeInviteDialogFragment);
                            return;
                        }
                        throw null;
                    }
                    throw null;
                }
                viewGroupInviteActivity.A06.setText(R.string.joining_group_via_invite);
                viewGroupInviteActivity.A03.setVisibility(0);
                viewGroupInviteActivity.A02.setVisibility(4);
                InterfaceC002901k interfaceC002901k = viewGroupInviteActivity.A0Q;
                C0EG c0eg = viewGroupInviteActivity.A0N;
                C07700Zi c07700Zi = viewGroupInviteActivity.A0O;
                if (c07700Zi != null) {
                    interfaceC002901k.ARy(new C3DW(c0eg, viewGroupInviteActivity, c07700Zi), new Void[0]);
                    return;
                }
                throw null;
            case 41:
                C2GV c2gv = (C2GV) this.A00;
                if (c2gv.A0r) {
                    return;
                }
                Activity activity2 = c2gv.A0E;
                activity2.startActivityForResult(new Intent(activity2, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_location).putExtra("permissions", C41471ty.A02).putExtra("perm_denial_message_id", R.string.permission_location_access_on_updating_location).putExtra("message_id", R.string.permission_location_access_on_updating_location_request), 35);
                return;
            case 42:
                C002701i.A19(((C2GV) this.A00).A0E, 2);
                return;
            case 43:
                C2GV c2gv2 = (C2GV) this.A00;
                if (c2gv2.A0g.getVisibility() == 0 && c2gv2.A0a.A0B == 5) {
                    BottomSheetBehavior bottomSheetBehavior = c2gv2.A0Z;
                    int i4 = bottomSheetBehavior.A0B;
                    if (i4 == 4) {
                        bottomSheetBehavior.A0O(3);
                        return;
                    } else if (i4 == 3) {
                        bottomSheetBehavior.A0O(4);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 44:
                ((C2GV) this.A00).A0H();
                return;
            case 45:
                C2GV c2gv3 = (C2GV) this.A00;
                c2gv3.A0B();
                c2gv3.A0u = false;
                c2gv3.A0s = false;
                c2gv3.A0U.setVisibility(8);
                c2gv3.A0F();
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                C002701i.A19((Activity) this.A00, 0);
                return;
            case 47:
                C0LD.A05((Activity) this.A00, "com.whatsapp");
                return;
            case 48:
                ((Dialog) this.A00).dismiss();
                return;
            case 49:
                DialogC48832Gy dialogC48832Gy = (DialogC48832Gy) this.A00;
                dialogC48832Gy.A08 = true;
                dialogC48832Gy.dismiss();
                return;
            default:
                super.A00(view);
                return;
        }
    }
}
