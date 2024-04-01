package com.whatsapp.mediaview;

import X.AbstractC000600i;
import X.AbstractC005302j;
import X.AbstractC40441sG;
import X.AbstractC48662Ge;
import X.AbstractC73093b5;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02330At;
import X.AnonymousClass008;
import X.AnonymousClass011;
import X.AnonymousClass012;
import X.AnonymousClass029;
import X.AnonymousClass088;
import X.AnonymousClass092;
import X.AnonymousClass094;
import X.AnonymousClass095;
import X.AnonymousClass097;
import X.C000200d;
import X.C000400f;
import X.C000500h;
import X.C000800k;
import X.C001200o;
import X.C002301c;
import X.C003101m;
import X.C003301p;
import X.C00A;
import X.C00T;
import X.C011505r;
import X.C011605s;
import X.C018308n;
import X.C018508q;
import X.C018608r;
import X.C018708s;
import X.C019208x;
import X.C01B;
import X.C01C;
import X.C02160Ac;
import X.C02180Ae;
import X.C02820Cz;
import X.C02980Dr;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C02O;
import X.C03010Du;
import X.C03120Eg;
import X.C03410Fp;
import X.C05W;
import X.C06260Si;
import X.C07O;
import X.C09D;
import X.C09H;
import X.C09L;
import X.C0C9;
import X.C0CG;
import X.C0DB;
import X.C0DD;
import X.C0DK;
import X.C0E3;
import X.C0ED;
import X.C0GA;
import X.C0HA;
import X.C0HE;
import X.C0HS;
import X.C0HV;
import X.C0K1;
import X.C0LD;
import X.C0MV;
import X.C0S6;
import X.C0We;
import X.C2HD;
import X.C37501mW;
import X.C37621mi;
import X.C3A9;
import X.C40071rX;
import X.C40411sD;
import X.C40421sE;
import X.C41471ty;
import X.C41541u6;
import X.C41771uU;
import X.C41961un;
import X.C42391vf;
import X.C42441vk;
import X.C42451vl;
import X.C42471vn;
import X.C43081wp;
import X.C43131wu;
import X.C456723a;
import X.C462626b;
import X.C48652Gd;
import X.C63532zw;
import X.C67393Fi;
import X.C68763Lu;
import X.C84103tC;
import X.InterfaceC002901k;
import X.InterfaceC018908u;
import X.InterfaceC48642Gc;
import X.InterfaceC48692Gh;
import X.InterfaceC59982tj;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0_0;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.ContactPicker;
import com.whatsapp.Conversation;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.base.WaFragment;
import com.whatsapp.contentprovider.MediaProvider;
import com.whatsapp.crop.CropImage;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview;
import com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.ExoPlaybackControlView;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class MediaViewFragment extends Hilt_MediaViewFragment implements InterfaceC018908u, C0S6 {
    public static final boolean A1O = AbstractC48662Ge.A01();
    public static final boolean A1P;
    public int A00;
    public int A02;
    public int A04;
    public long A05;
    public Handler A06;
    public View A07;
    public ImageButton A08;
    public TextView A09;
    public DialogFragment A0A;
    public DialogFragment A0B;
    public C018308n A0C;
    public AbstractC000600i A0D;
    public C018508q A0E;
    public C02L A0F;
    public C03010Du A0G;
    public C01B A0H;
    public C018608r A0I;
    public C011605s A0J;
    public C41541u6 A0K;
    public C05W A0L;
    public AnonymousClass008 A0M;
    public C018708s A0N;
    public C011505r A0O;
    public C03120Eg A0P;
    public C000800k A0Q;
    public C000400f A0R;
    public C02E A0S;
    public C462626b A0T;
    public AnonymousClass012 A0U;
    public C001200o A0V;
    public C02F A0W;
    public C000500h A0X;
    public C002301c A0Y;
    public C0DK A0Z;
    public C0C9 A0a;
    public C40411sD A0b;
    public C00A A0c;
    public C43081wp A0d;
    public C40421sE A0e;
    public C0ED A0f;
    public C0HA A0g;
    public AnonymousClass011 A0h;
    public AbstractC005302j A0i;
    public GroupJid A0j;
    public C41471ty A0k;
    public C41771uU A0l;
    public C43131wu A0m;
    public C42441vk A0n;
    public C42451vl A0o;
    public C63532zw A0p;
    public InterfaceC48692Gh A0q;
    public C0MV A0r;
    public C02980Dr A0s;
    public C02O A0t;
    public C456723a A0u;
    public AnonymousClass094 A0v;
    public AnonymousClass097 A0w;
    public AnonymousClass097 A0x;
    public AnonymousClass097 A0y;
    public AbstractC40441sG A0z;
    public C40071rX A10;
    public C0HV A11;
    public C42391vf A12;
    public C41961un A13;
    public C42471vn A14;
    public InterfaceC002901k A15;
    public VoiceNoteSeekBar A17;
    public RunnableEBaseShape0S0310000_I0 A18;
    public boolean A19;
    public boolean A1A;
    public boolean A1B;
    public boolean A1E;
    public boolean A1F;
    public boolean A1G;
    public boolean A1H;
    public int A03 = 0;
    public int A01 = 0;
    public final Map A1N = new HashMap();
    public final HashMap A1L = new HashMap();
    public C48652Gd A16 = null;
    public boolean A1D = true;
    public boolean A1C = true;
    public final Map A1M = new HashMap();
    public final C0GA A1I = new C0GA() { // from class: X.3II
        {
            MediaViewFragment.this = this;
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            DialogFragment dialogFragment;
            MediaViewFragment mediaViewFragment = MediaViewFragment.this;
            GroupJid groupJid = mediaViewFragment.A0j;
            if (groupJid != null && groupJid.equals(abstractC005302j)) {
                DialogFragment dialogFragment2 = mediaViewFragment.A0A;
                if (dialogFragment2 != null) {
                    dialogFragment2.A10();
                    mediaViewFragment.A0A = null;
                    return;
                }
                return;
            }
            C02L c02l = mediaViewFragment.A0F;
            c02l.A05();
            C0K1 c0k1 = c02l.A01;
            if (c0k1 == null || !abstractC005302j.equals(c0k1.A09) || (dialogFragment = mediaViewFragment.A0B) == null) {
                return;
            }
            dialogFragment.A10();
            mediaViewFragment.A0B = null;
        }
    };
    public final C00T A1J = new C2HD(this);
    public final Runnable A1K = new RunnableEBaseShape4S0100000_I0_4(this, 9);

    static {
        A1P = Build.VERSION.SDK_INT > 23;
    }

    public static int A00(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 9) {
                        if (i != 13) {
                            if (i != 42) {
                                if (i != 43) {
                                    return R.string.gallery_notready_warning;
                                }
                                return R.string.gallery_video_notready_warning;
                            }
                            return R.string.gallery_image_notready_warning;
                        }
                        return R.string.gallery_gif_notready_warning;
                    }
                    return R.string.gallery_document_notready_warning;
                }
                return R.string.gallery_video_notready_warning;
            }
            return R.string.gallery_audio_notready_warning;
        }
        return R.string.gallery_image_notready_warning;
    }

    public static MediaViewFragment A01(AnonymousClass094 anonymousClass094, AbstractC005302j abstractC005302j, boolean z, boolean z2, int i, long j, Bundle bundle, int i2, boolean z3, int i3) {
        MediaViewFragment mediaViewFragment = new MediaViewFragment();
        Bundle bundle2 = new Bundle();
        C0LD.A07(bundle2, anonymousClass094, "");
        if (abstractC005302j != null) {
            bundle2.putString("jid", abstractC005302j.getRawString());
        }
        bundle2.putBoolean("gallery", z);
        bundle2.putBoolean("nogallery", z2);
        bundle2.putInt("video_play_origin", i);
        bundle2.putLong("start_t", j);
        bundle2.putBundle("animation_bundle", bundle);
        bundle2.putInt("navigator_type", i3);
        bundle2.putInt("menu_style", i2);
        bundle2.putBoolean("menu_set_wallpaper", z3);
        mediaViewFragment.A0P(bundle2);
        return mediaViewFragment;
    }

    public static final void A02(Menu menu, int i, boolean z) {
        MenuItem findItem = menu.findItem(i);
        if (findItem != null) {
            findItem.setVisible(z);
        }
    }

    public static void A03(MediaViewFragment mediaViewFragment) {
        if (mediaViewFragment.A1G && mediaViewFragment.A1A) {
            if (mediaViewFragment.A0x != null && mediaViewFragment.A0W.A06()) {
                final AnonymousClass097 anonymousClass097 = mediaViewFragment.A0x;
                mediaViewFragment.A0x = null;
                InterfaceC48642Gc interfaceC48642Gc = new InterfaceC48642Gc() { // from class: X.3I6
                    {
                        MediaViewFragment.this = mediaViewFragment;
                    }

                    @Override // X.InterfaceC48642Gc
                    public final void APt(boolean z) {
                        MediaViewFragment mediaViewFragment2 = MediaViewFragment.this;
                        AnonymousClass097 anonymousClass0972 = anonymousClass097;
                        C018508q c018508q = mediaViewFragment2.A0E;
                        c018508q.A02.post(new RunnableEBaseShape0S0210000_I0(mediaViewFragment2, anonymousClass0972, z, 10));
                    }
                };
                if (!((MediaViewBaseFragment) mediaViewFragment).A0E) {
                    interfaceC48642Gc.APt(true);
                } else {
                    ((MediaViewBaseFragment) mediaViewFragment).A0A = interfaceC48642Gc;
                }
            }
            if (mediaViewFragment.A1B()) {
                mediaViewFragment.A0A().A0T();
            } else {
                mediaViewFragment.A0K();
            }
        }
    }

    public static void A04(MediaViewFragment mediaViewFragment, InteractiveAnnotation interactiveAnnotation, PhotoView photoView) {
        if (mediaViewFragment != null) {
            C63532zw c63532zw = new C63532zw(photoView.getContext(), mediaViewFragment.A0k, (ViewGroup) photoView.getRootView());
            mediaViewFragment.A0p = c63532zw;
            c63532zw.A00(photoView, interactiveAnnotation, null);
            return;
        }
        throw null;
    }

    @Override // X.C0BA
    public void A0f() {
        InterfaceC48692Gh interfaceC48692Gh;
        super.A0U = true;
        if (!A1P && this.A16 != null) {
            this.A0E.A02.removeCallbacks(this.A1K);
            this.A16.A09();
            AbstractC73093b5 abstractC73093b5 = this.A16.A0D;
            if (abstractC73093b5 != null) {
                abstractC73093b5.A01();
            }
        }
        if (A0A().isFinishing() && (interfaceC48692Gh = this.A0q) != null) {
            interfaceC48692Gh.AVA();
        }
        C63532zw c63532zw = this.A0p;
        if (c63532zw != null) {
            c63532zw.A02.dismiss();
        }
    }

    @Override // X.C0BA
    public void A0g() {
        C48652Gd c48652Gd;
        super.A0U = true;
        if (A1P && (c48652Gd = this.A16) != null) {
            c48652Gd.A0H();
            AbstractC73093b5 abstractC73093b5 = this.A16.A0D;
            if (abstractC73093b5 != null && !(abstractC73093b5 instanceof C84103tC)) {
                C67393Fi c67393Fi = (C67393Fi) abstractC73093b5;
                if (!c67393Fi.A06) {
                    c67393Fi.A0B.A02();
                }
            }
        }
        ((MediaViewBaseFragment) this).A06.setAlpha(1.0f);
    }

    @Override // X.C0BA
    public void A0h(int i, int i2, Intent intent) {
        switch (i) {
            case 0:
                if (i2 != -1 || intent == null || intent.getData() == null) {
                    return;
                }
                Uri data = intent.getData();
                AnonymousClass097 A1D = A1D(this.A03);
                AbstractC005302j abstractC005302j = A1D != null ? A1D.A0n.A00 : null;
                Context A00 = A00();
                this.A0z.A05(abstractC005302j, A00, data, true, 0, 0);
                C0DD.A0N(A00, data);
                return;
            case 1:
                if (i2 != -1) {
                    if (i2 != 0 || intent == null) {
                        return;
                    }
                    CropImage.A00(this.A0u.A02, intent, (ActivityC02290Ap) A0A());
                    return;
                }
                C456723a c456723a = this.A0u;
                C02L c02l = this.A0F;
                c02l.A05();
                C0K1 c0k1 = c02l.A01;
                if (c0k1 != null) {
                    if (!c456723a.A09(c0k1)) {
                        return;
                    }
                    ProgressDialogFragment A002 = ProgressDialogFragment.A00(0, R.string.updating_profile_photo_dialog_title);
                    this.A0B = A002;
                    C02820Cz c02820Cz = new C02820Cz(A0B());
                    c02820Cz.A09(0, A002, "photo_progress_fragment", 1);
                    c02820Cz.A05();
                    return;
                }
                throw null;
            case 2:
                if (i2 != -1 || intent == null) {
                    return;
                }
                this.A0j = GroupJid.getNullable(intent.getStringExtra("contact"));
                AnonymousClass097 anonymousClass097 = (AnonymousClass097) this.A0a.A0C(intent.getLongExtra("message_row_id", -1L));
                Intent intent2 = new Intent();
                if (anonymousClass097 != null) {
                    C09H c09h = anonymousClass097.A02;
                    if (c09h != null) {
                        intent2.setData(Uri.fromFile(c09h.A0F));
                        C456723a c456723a2 = this.A0u;
                        if (c456723a2 != null) {
                            if (((Hilt_MediaViewFragment) this).A00 == null) {
                                return;
                            }
                            c456723a2.A05((ActivityC02290Ap) A0A(), intent2, 3, this);
                            return;
                        }
                        throw null;
                    }
                    throw null;
                }
                Log.e("mediaview/no-message-for-group-icon");
                this.A0E.A07(R.string.failed_update_photo, 0);
                return;
            case 3:
                if (i2 != -1) {
                    if (i2 != 0 || intent == null) {
                        return;
                    }
                    CropImage.A00(this.A0u.A02, intent, (ActivityC02290Ap) A0A());
                    return;
                }
                GroupJid groupJid = this.A0j;
                if (groupJid == null || !this.A0u.A09(this.A0L.A0A(groupJid))) {
                    return;
                }
                ProgressDialogFragment A003 = ProgressDialogFragment.A00(0, R.string.updating_group_icon_dialog_title);
                this.A0A = A003;
                C02820Cz c02820Cz2 = new C02820Cz(A0B());
                c02820Cz2.A09(0, A003, "group_progress_fragment", 1);
                c02820Cz2.A05();
                return;
            case 4:
                if (i2 != -1 || intent == null) {
                    return;
                }
                AnonymousClass094 A02 = C0LD.A02(intent);
                AnonymousClass092 A1D2 = A1D(this.A03);
                if ((A1D2 == null || A1D2.A0n != A02) && (A1D2 = this.A0a.A0F(A02)) == null) {
                    Log.w("mediaview/forward/failed");
                    this.A0E.A07(R.string.message_forward_failed, 0);
                    return;
                }
                List A0F = C003101m.A0F(AbstractC005302j.class, intent.getStringArrayListExtra("jids"));
                this.A0I.A0E(this.A0G, A1D2, A0F);
                A1N(A0F);
                return;
            case 5:
                if (i2 != -1 || intent == null) {
                    return;
                }
                A1N(C003101m.A0F(AbstractC005302j.class, intent.getStringArrayListExtra("jids")));
                return;
            case 6:
                if (i2 != -1 || intent == null || intent.getData() == null) {
                    return;
                }
                Uri data2 = intent.getData();
                AbstractC005302j A05 = C03410Fp.A05(intent);
                Context A004 = A00();
                this.A0z.A05(A05, A004, data2, true, 0, 0);
                C0DD.A0N(A004, data2);
                A13();
                return;
            default:
                return;
        }
    }

    @Override // X.C0BA
    public void A0i(Intent intent) {
        InterfaceC48692Gh interfaceC48692Gh = this.A0q;
        if (interfaceC48692Gh != null) {
            interfaceC48692Gh.AMI();
        }
        super.A0i(intent);
    }

    @Override // X.C0BA
    public void A0k(Bundle bundle) {
        GroupJid groupJid = this.A0j;
        if (groupJid != null) {
            bundle.putString("gid", groupJid.getRawString());
        }
        bundle.putBoolean("is_different_video", this.A1C);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0062, code lost:
        if (r12 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x007b, code lost:
        if (r3 != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0085 A[ADDED_TO_REGION] */
    @Override // X.C0BA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0l(android.view.Menu r15) {
        /*
            r14 = this;
            int r0 = r15.size()
            if (r0 != 0) goto L7
            return
        L7:
            X.3Lu r1 = r14.A09
            r5 = 1
            if (r1 == 0) goto La0
            X.02j r0 = r14.A0i
            if (r0 == 0) goto L9c
            boolean r6 = r14.A1F
            r6 = r6 ^ r5
            r4 = 1
        L14:
            int r0 = r1.getCurrentItem()
            X.097 r2 = r14.A1D(r0)
            if (r2 == 0) goto L94
            byte r13 = r2.A0m
            r10 = 0
            if (r13 != r5) goto L24
            r10 = 1
        L24:
            boolean r3 = r2.A0j
            X.01B r0 = r14.A0H
            boolean r12 = X.C0DB.A0K(r0, r2)
            X.01B r0 = r14.A0H
            boolean r9 = X.C0DB.A0L(r0, r2)
            boolean r11 = X.C0DB.A0Z(r2)
            boolean r8 = r2 instanceof X.C09C
            r4 = r8 ^ 1
            r7 = r4
            X.09H r1 = r2.A02
            boolean r0 = X.C0DB.A0D(r13)
            if (r0 == 0) goto L92
            X.094 r0 = r2.A0n
            boolean r0 = r0.A02
            if (r0 != 0) goto L92
            if (r1 == 0) goto L92
            boolean r0 = r1.A0P
            if (r0 != 0) goto L92
            r1 = 1
            r2 = 1
        L51:
            r15.setGroupVisible(r5, r10)
            r0 = 6
            A02(r15, r0, r1)
            r0 = 8
            A02(r15, r0, r9)
            r1 = 9
            if (r2 != 0) goto L64
            r0 = 1
            if (r12 != 0) goto L65
        L64:
            r0 = 0
        L65:
            A02(r15, r1, r0)
            r0 = 14
            A02(r15, r0, r8)
            r0 = 12
            A02(r15, r0, r7)
            r0 = 7
            A02(r15, r0, r6)
            r1 = 10
            if (r11 == 0) goto L7d
            r0 = 1
            if (r3 == 0) goto L7e
        L7d:
            r0 = 0
        L7e:
            A02(r15, r1, r0)
            r0 = 11
            if (r11 == 0) goto L90
            if (r3 == 0) goto L90
        L87:
            A02(r15, r0, r5)
            r0 = 13
            A02(r15, r0, r4)
            return
        L90:
            r5 = 0
            goto L87
        L92:
            r1 = 1
            goto Laa
        L94:
            r1 = 1
            r10 = 0
            r3 = 0
            r12 = 0
            r9 = 0
            r11 = 0
            r8 = 0
            goto La9
        L9c:
            r6 = 0
            r4 = 0
            goto L14
        La0:
            r1 = 0
            r6 = 0
            r10 = 0
            r3 = 0
            r12 = 0
            r9 = 0
            r11 = 0
            r8 = 0
            r4 = 0
        La9:
            r7 = 0
        Laa:
            r2 = 0
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.MediaViewFragment.A0l(android.view.Menu):void");
    }

    @Override // X.C0BA
    public void A0m(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        if (this.A02 == 3) {
            menu.add(0, 14, 1, R.string.info).setIcon(C02180Ae.A0O(A00(), R.drawable.ic_viewonce, R.color.white)).setShowAsAction(2);
            menu.add(0, 6, 0, R.string.delete);
            return;
        }
        menu.add(0, 10, 0, R.string.add_star).setIcon(R.drawable.ic_media_unstarred).setShowAsAction(2);
        menu.add(0, 11, 0, R.string.remove_star).setIcon(R.drawable.ic_media_starred).setShowAsAction(2);
        if (this.A02 == 2) {
            menu.add(0, 6, 0, R.string.delete).setIcon(R.drawable.ic_action_delete).setShowAsAction(2);
        } else {
            menu.add(0, 9, 0, R.string.conversation_menu_forward).setIcon(R.drawable.ic_media_forward).setShowAsAction(2);
        }
        if (this.A0H.A0E(C01C.A1R)) {
            Drawable A0I = C07O.A0I(C09L.A01(A00(), R.drawable.ic_text_status_compose));
            C07O.A0X(A0I, -1);
            menu.add(0, 13, 0, R.string.edit).setIcon(A0I).setShowAsAction(1);
        }
        menu.add(0, 7, 0, R.string.all_media).setIcon(R.drawable.ic_action_all_media).setShowAsAction(0);
        menu.add(0, 12, 0, R.string.view_in_chat).setShowAsAction(0);
        menu.add(0, 8, 0, R.string.share).setIcon(R.drawable.ic_action_share);
        SubMenu addSubMenu = menu.addSubMenu(1, 0, 0, R.string.set_as);
        addSubMenu.clearHeader();
        addSubMenu.add(1, 4, 0, R.string.set_as_profile_photo_wa_gallery);
        addSubMenu.add(1, 5, 0, R.string.set_as_group_icon_wa_gallery);
        if (this.A1E) {
            addSubMenu.add(1, 1, 0, R.string.use_as_wallpaper);
        }
        menu.add(1, 2, 0, R.string.view_in_gallery);
        menu.add(1, 3, 0, R.string.rotate);
        if (this.A02 == 2) {
            return;
        }
        menu.add(0, 6, 0, R.string.delete);
    }

    @Override // X.C0BA
    public boolean A0o(MenuItem menuItem) {
        int width;
        int height;
        long j;
        final AnonymousClass097 A1D = A1D(this.A03);
        switch (menuItem.getItemId()) {
            case 1:
                if (A1D != null) {
                    if (A01().getConfiguration().orientation == 1) {
                        width = (A0A().getWindow().getDecorView().getHeight() - ((int) A01().getDimension(R.dimen.header_height))) - C003301p.A02(A00());
                        height = A0A().getWindow().getDecorView().getWidth();
                    } else {
                        width = (A0A().getWindow().getDecorView().getWidth() - ((int) A01().getDimension(R.dimen.header_height))) - C003301p.A02(A00());
                        height = A0A().getWindow().getDecorView().getHeight();
                    }
                    C09H c09h = A1D.A02;
                    if (c09h != null) {
                        Uri fromFile = Uri.fromFile(c09h.A0F);
                        if (C03410Fp.A08(this.A0H)) {
                            AbstractC005302j abstractC005302j = A1D.A0n.A00;
                            ActivityC02330At A0A = A0A();
                            Uri A03 = this.A0z.A03();
                            Intent intent = new Intent(A0A, GalleryWallpaperPreview.class);
                            intent.setData(fromFile);
                            intent.putExtra("output", A03);
                            intent.putExtra("chat_jid", abstractC005302j);
                            intent.putExtra("is_using_global_wallpaper", true);
                            A0O(intent, 6, null);
                            return true;
                        }
                        StringBuilder sb = new StringBuilder("mediaview/wallpaper/crop/height:");
                        sb.append(width);
                        Log.i(sb.toString());
                        Intent intent2 = new Intent(A00(), CropImage.class);
                        intent2.putExtra("outputX", height);
                        intent2.putExtra("outputY", width);
                        intent2.putExtra("scale", 1);
                        intent2.putExtra("scaleUpIfNeeded", true);
                        intent2.putExtra("cropByOutputSize", true);
                        intent2.setData(fromFile);
                        intent2.putExtra("output", this.A0z.A03());
                        intent2.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
                        A0O(intent2, 0, null);
                        return true;
                    }
                    throw null;
                }
                Log.e("mediaview/no-message-to-set-as-wallpaper");
                return true;
            case 2:
                if (A1D != null) {
                    this.A0E.A06(0, R.string.loading_spinner);
                    MediaProvider.A05(this.A0E, this.A0D, this.A15, this.A0e, A1D, new C0CG() { // from class: X.3I1
                        {
                            MediaViewFragment.this = this;
                        }

                        @Override // X.C0CG
                        public final void A54(Object obj) {
                            MediaViewFragment mediaViewFragment = MediaViewFragment.this;
                            AnonymousClass097 anonymousClass097 = A1D;
                            Uri uri = (Uri) obj;
                            mediaViewFragment.A0E.A03();
                            Intent intent3 = new Intent("android.intent.action.VIEW");
                            byte b = anonymousClass097.A0m;
                            if (b == 1) {
                                intent3.setDataAndType(uri, "image/*");
                            } else if (b == 3 || b == 13) {
                                intent3.setDataAndType(uri, "video/*");
                            } else if (b != 42 && b != 43) {
                                intent3.setData(uri);
                            } else {
                                return;
                            }
                            intent3.setFlags(1);
                            Context A00 = mediaViewFragment.A00();
                            InterfaceC48692Gh interfaceC48692Gh = mediaViewFragment.A0q;
                            if (interfaceC48692Gh != null) {
                                interfaceC48692Gh.AMI();
                            }
                            mediaViewFragment.A0C.A06(A00, intent3);
                        }
                    });
                    return true;
                }
                Log.e("mediaview/no-message-to-view-in-gallery");
                return true;
            case 3:
                if (A1D(this.A03) instanceof AnonymousClass095) {
                    AnonymousClass095 anonymousClass095 = (AnonymousClass095) A1D(this.A03);
                    if (anonymousClass095 != null) {
                        this.A15.ARy(new C0HS(this.A13, this.A0b, this.A14, this, anonymousClass095) { // from class: X.3IQ
                            public final C40411sD A00;
                            public final AnonymousClass095 A01;
                            public final C41961un A02;
                            public final C42471vn A03;
                            public final WeakReference A04;

                            {
                                this.A02 = r2;
                                this.A00 = r3;
                                this.A03 = r4;
                                this.A04 = new WeakReference(this);
                                this.A01 = anonymousClass095;
                            }

                            /* JADX WARN: Can't wrap try/catch for region: R(12:5|(1:7)(1:86)|8|(2:9|10)|(9:(15:80|81|13|(1:79)(1:(1:(1:(1:19))(1:77))(1:78))|20|22|23|24|25|26|27|(2:29|(2:31|32)(1:62))(1:63)|(3:34|(1:38)|39)(7:43|44|45|(1:47)|48|49|50)|40|41)|24|25|26|27|(0)(0)|(0)(0)|40|41)|12|13|(0)|79|20|22|23) */
                            /* JADX WARN: Code restructure failed: missing block: B:137:0x00ae, code lost:
                                r1 = move-exception;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:140:0x00b1, code lost:
                                com.whatsapp.util.Log.e("mediaview/rotate/recreatethumb", r1);
                                r1 = null;
                             */
                            /* JADX WARN: Finally extract failed */
                            /* JADX WARN: Removed duplicated region for block: B:145:0x00c2 A[Catch: all -> 0x013b, TryCatch #11 {IOException -> 0x0142, blocks: (B:104:0x0000, B:157:0x010a, B:165:0x012d, B:164:0x0129, B:105:0x0014, B:107:0x0018, B:109:0x0026, B:110:0x0041, B:112:0x004a, B:114:0x005a, B:126:0x0078, B:127:0x0082, B:129:0x00a1, B:145:0x00c2, B:147:0x00cf, B:152:0x00e8, B:154:0x00ec, B:156:0x00f2, B:158:0x010f, B:163:0x0126, B:171:0x0138, B:148:0x00e2, B:134:0x00ab, B:140:0x00b1, B:142:0x00b9, B:111:0x0047, B:173:0x013a), top: B:200:0x0000 }] */
                            /* JADX WARN: Removed duplicated region for block: B:149:0x00e3  */
                            /* JADX WARN: Removed duplicated region for block: B:152:0x00e8 A[Catch: all -> 0x013b, TryCatch #11 {IOException -> 0x0142, blocks: (B:104:0x0000, B:157:0x010a, B:165:0x012d, B:164:0x0129, B:105:0x0014, B:107:0x0018, B:109:0x0026, B:110:0x0041, B:112:0x004a, B:114:0x005a, B:126:0x0078, B:127:0x0082, B:129:0x00a1, B:145:0x00c2, B:147:0x00cf, B:152:0x00e8, B:154:0x00ec, B:156:0x00f2, B:158:0x010f, B:163:0x0126, B:171:0x0138, B:148:0x00e2, B:134:0x00ab, B:140:0x00b1, B:142:0x00b9, B:111:0x0047, B:173:0x013a), top: B:200:0x0000 }] */
                            /* JADX WARN: Removed duplicated region for block: B:158:0x010f A[Catch: all -> 0x013b, TRY_ENTER, TRY_LEAVE, TryCatch #11 {IOException -> 0x0142, blocks: (B:104:0x0000, B:157:0x010a, B:165:0x012d, B:164:0x0129, B:105:0x0014, B:107:0x0018, B:109:0x0026, B:110:0x0041, B:112:0x004a, B:114:0x005a, B:126:0x0078, B:127:0x0082, B:129:0x00a1, B:145:0x00c2, B:147:0x00cf, B:152:0x00e8, B:154:0x00ec, B:156:0x00f2, B:158:0x010f, B:163:0x0126, B:171:0x0138, B:148:0x00e2, B:134:0x00ab, B:140:0x00b1, B:142:0x00b9, B:111:0x0047, B:173:0x013a), top: B:200:0x0000 }] */
                            @Override // X.C0HS
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public java.lang.Object A07(java.lang.Object[] r20) {
                                /*
                                    Method dump skipped, instructions count: 331
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C3IQ.A07(java.lang.Object[]):java.lang.Object");
                            }

                            @Override // X.C0HS
                            public void A09(Object obj) {
                                RunnableEBaseShape0S0310000_I0 runnableEBaseShape0S0310000_I0;
                                Boolean bool = (Boolean) obj;
                                MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A04.get();
                                if (mediaViewFragment == null || ((ActivityC02290Ap) mediaViewFragment.A0A()).AFE()) {
                                    return;
                                }
                                AnonymousClass095 anonymousClass0952 = this.A01;
                                mediaViewFragment.A14.A08(anonymousClass0952);
                                PhotoView A0y = mediaViewFragment.A0y(anonymousClass0952.A0n);
                                if (A0y != null && (runnableEBaseShape0S0310000_I0 = mediaViewFragment.A18) != null) {
                                    runnableEBaseShape0S0310000_I0.A00(anonymousClass0952, A0y);
                                }
                                if (bool.booleanValue()) {
                                    mediaViewFragment.A0c.A05(anonymousClass0952, 9);
                                }
                            }
                        }, new Void[0]);
                        return true;
                    }
                    throw null;
                }
                break;
            case 4:
                if (A1D != null) {
                    Intent intent3 = new Intent();
                    C09H c09h2 = A1D.A02;
                    if (c09h2 != null) {
                        intent3.setData(Uri.fromFile(c09h2.A0F));
                        C456723a c456723a = this.A0u;
                        if (c456723a != null) {
                            if (((Hilt_MediaViewFragment) this).A00 != null) {
                                c456723a.A05((ActivityC02290Ap) A0A(), intent3, 1, this);
                                return true;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    Log.e("mediaview/no-message-to-set-as-profile-photo");
                    return true;
                }
                break;
            case 5:
                Intent intent4 = new Intent(A00(), ContactPicker.class);
                intent4.putExtra("set_group_icon", true);
                intent4.putExtra("message_row_id", A1D(this.A03).A0p);
                A0O(intent4, 2, null);
                return true;
            case 6:
                AnonymousClass097 A1D2 = A1D(this.A03);
                if (A1D2 != null) {
                    final List<AnonymousClass092> singletonList = Collections.singletonList(A1D2);
                    if (this.A02 == 2) {
                        this.A15.ARy(new C3A9(this.A0b, singletonList, new C0HE(), new InterfaceC59982tj() { // from class: X.3I4
                            {
                                MediaViewFragment.this = this;
                            }

                            @Override // X.InterfaceC59982tj
                            public final void AJe(Collection collection) {
                                MediaViewFragment mediaViewFragment = MediaViewFragment.this;
                                List list = singletonList;
                                StorageUsageDeleteMessagesDialogFragment storageUsageDeleteMessagesDialogFragment = new StorageUsageDeleteMessagesDialogFragment();
                                storageUsageDeleteMessagesDialogFragment.A05 = list;
                                storageUsageDeleteMessagesDialogFragment.A04 = collection;
                                storageUsageDeleteMessagesDialogFragment.A02 = null;
                                storageUsageDeleteMessagesDialogFragment.A14(mediaViewFragment.A0B(), null);
                            }
                        }), new Void[0]);
                        return true;
                    }
                    AbstractC005302j abstractC005302j2 = this.A0i;
                    DeleteMessagesDialogFragment deleteMessagesDialogFragment = new DeleteMessagesDialogFragment();
                    Bundle bundle = new Bundle();
                    ArrayList arrayList = new ArrayList();
                    for (AnonymousClass092 anonymousClass092 : singletonList) {
                        arrayList.add(anonymousClass092.A0n);
                    }
                    C0LD.A08(bundle, arrayList);
                    if (abstractC005302j2 != null) {
                        bundle.putString("jid", abstractC005302j2.getRawString());
                    }
                    bundle.putBoolean("is_revokable", true);
                    deleteMessagesDialogFragment.A0P(bundle);
                    deleteMessagesDialogFragment.A14(A0B(), null);
                    return true;
                }
                break;
            case 7:
                A16();
                return true;
            case 8:
                this.A0I.A09(A0A(), this.A0C, A1D(this.A03));
                return true;
            case 9:
                if (A1D != null) {
                    Intent intent5 = new Intent(A00(), ContactPicker.class);
                    intent5.putExtra("forward", true);
                    AbstractC005302j abstractC005302j3 = this.A0i;
                    if (abstractC005302j3 != null) {
                        intent5.putExtra("forward_jid", abstractC005302j3.getRawString());
                    }
                    byte b = A1D.A0m;
                    intent5.putIntegerArrayListExtra("message_types", new ArrayList<>(Collections.singleton(Integer.valueOf(Byte.valueOf(b).intValue()))));
                    if (b == 3) {
                        j = A1D.A00 * 1000;
                    } else {
                        j = 0;
                    }
                    intent5.putExtra("forward_video_duration", j);
                    C0LD.A00(intent5, A1D.A0n);
                    A0O(intent5, 4, null);
                    return true;
                }
                Log.e("mediaview/no-message-for-forward");
                return true;
            case 10:
                if (A1D != null) {
                    C37501mW c37501mW = new C37501mW();
                    c37501mW.A00 = Integer.valueOf(C0E3.A04(A1D, this.A0f));
                    c37501mW.A01 = 1;
                    this.A0h.A0B(c37501mW, null, false);
                    this.A15.AS1(new RunnableEBaseShape3S0200000_I0_3(this, A1D, 11));
                    return true;
                }
                Log.e("mediaview/no-message-for-star");
                return true;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                if (A1D != null) {
                    this.A15.AS1(new RunnableEBaseShape3S0200000_I0_3(this, A1D, 10));
                    return true;
                }
                Log.e("mediaview/no-message-for-unstar");
                return true;
            case 12:
                if (A1D != null) {
                    long A02 = C0DB.A02(A1D);
                    Context A00 = A00();
                    AnonymousClass094 anonymousClass094 = A1D.A0n;
                    Intent A022 = Conversation.A02(A00, anonymousClass094.A00);
                    A022.putExtra("row_id", A02);
                    C0LD.A00(A022, anonymousClass094);
                    ((WaFragment) this).A00.A01(this, A022);
                    return true;
                }
                Log.e("mediaview/no-message-to-view-in-chat");
                return true;
            case 13:
                if (A1D != null) {
                    ((MediaViewBaseFragment) this).A06.animate().alpha(0.0f).setDuration(100L).setListener(new AnimatorListenerAdapter() { // from class: X.312
                        {
                            MediaViewFragment.this = this;
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            Bitmap photo;
                            MediaViewFragment mediaViewFragment = MediaViewFragment.this;
                            AnonymousClass097 anonymousClass097 = A1D;
                            if (mediaViewFragment != null) {
                                C09H c09h3 = anonymousClass097.A02;
                                if (c09h3 != null) {
                                    Uri fromFile2 = Uri.fromFile(c09h3.A0F);
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(fromFile2);
                                    C63332zc c63332zc = new C63332zc(mediaViewFragment.A00());
                                    c63332zc.A08 = arrayList2;
                                    c63332zc.A06 = C003101m.A07(mediaViewFragment.A0i);
                                    c63332zc.A01 = 29;
                                    c63332zc.A0B = true;
                                    byte b2 = anonymousClass097.A0m;
                                    if ((b2 == 1 || b2 == 42) && C2HC.A00) {
                                        PhotoView A0y = mediaViewFragment.A0y(anonymousClass097.A0n);
                                        if (A0y != null && (photo = A0y.getPhoto()) != null) {
                                            C0JH A032 = mediaViewFragment.A0J.A03();
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(fromFile2);
                                            sb2.append("-media_view");
                                            A032.A05(sb2.toString(), photo);
                                            c63332zc.A04 = fromFile2;
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        arrayList3.add(new C0FK(mediaViewFragment.A05().findViewById(R.id.pager_container), fromFile2.toString()));
                                        View findViewById = mediaViewFragment.A05().findViewById(R.id.media_preview_header);
                                        arrayList3.add(new C0FK(findViewById, C0AT.A0G(findViewById)));
                                        View findViewById2 = mediaViewFragment.A05().findViewById(R.id.media_preview_footer);
                                        arrayList3.add(new C0FK(findViewById2, C0AT.A0G(findViewById2)));
                                        View findViewById3 = mediaViewFragment.A05().findViewById(R.id.media_preview_send);
                                        arrayList3.add(new C0FK(findViewById3, C0AT.A0G(findViewById3)));
                                        mediaViewFragment.A0O(MediaComposerActivity.A01(c63332zc), 5, C08950cN.A00(mediaViewFragment.A0A(), (C0FK[]) arrayList3.toArray(new C0FK[0])).A01());
                                        return;
                                    }
                                    mediaViewFragment.A0O(MediaComposerActivity.A01(c63332zc), 5, null);
                                    mediaViewFragment.A0A().overridePendingTransition(17432576, 0);
                                    return;
                                }
                                throw null;
                            }
                            throw null;
                        }
                    });
                    return true;
                }
                Log.e("mediaview/no-message-for-edit");
                return true;
            case 14:
                C019208x c019208x = new C019208x(A00());
                boolean z = A1D instanceof C09D;
                int i = R.string.view_once_video_receiver_info;
                if (z) {
                    i = R.string.view_once_photo_receiver_info;
                }
                c019208x.A02(i);
                c019208x.A06(R.string.ok, null);
                c019208x.A05(R.string.learn_more, new DialogInterface.OnClickListener() { // from class: X.30v
                    {
                        MediaViewFragment.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        MediaViewFragment mediaViewFragment = MediaViewFragment.this;
                        Intent intent6 = new Intent("android.intent.action.VIEW", mediaViewFragment.A10.A03("android", "about-view-once", null));
                        intent6.addFlags(268435456);
                        mediaViewFragment.A0C.A06(mediaViewFragment.A00(), intent6);
                    }
                });
                c019208x.A01.A0J = true;
                c019208x.A00().show();
                return true;
        }
        return true;
    }

    @Override // com.whatsapp.mediaview.MediaViewBaseFragment, X.C0BA
    public void A0q() {
        A1H();
        RunnableEBaseShape0S0310000_I0 runnableEBaseShape0S0310000_I0 = this.A18;
        if (runnableEBaseShape0S0310000_I0 != null) {
            runnableEBaseShape0S0310000_I0.A03 = true;
            ((Thread) runnableEBaseShape0S0310000_I0.A02).interrupt();
            this.A18 = null;
        }
        C48652Gd c48652Gd = this.A16;
        if (c48652Gd != null) {
            c48652Gd.A07();
            this.A16 = null;
            AnonymousClass097 anonymousClass097 = this.A0y;
            if (anonymousClass097 != null) {
                this.A0o.A07(anonymousClass097, false, false);
            }
        }
        this.A0y = null;
        this.A0M.A00(this.A1I);
        this.A0c.A00(this.A1J);
        InterfaceC48692Gh interfaceC48692Gh = this.A0q;
        if (interfaceC48692Gh != null) {
            interfaceC48692Gh.close();
        }
        this.A15.AS1(new RunnableEBaseShape4S0100000_I0_4(this.A0T, 6));
        C63532zw c63532zw = this.A0p;
        if (c63532zw != null) {
            c63532zw.A02.dismiss();
        }
        super.A0q();
    }

    @Override // com.whatsapp.mediaview.MediaViewBaseFragment, X.C0BA
    public void A0s() {
        super.A0U = true;
        A17();
        A1A(true, true);
        C48652Gd c48652Gd = this.A16;
        if (c48652Gd != null) {
            c48652Gd.A0H();
            AbstractC73093b5 abstractC73093b5 = this.A16.A0D;
            if (abstractC73093b5 != null && !(abstractC73093b5 instanceof C84103tC)) {
                C67393Fi c67393Fi = (C67393Fi) abstractC73093b5;
                if (!c67393Fi.A06) {
                    c67393Fi.A0B.A02();
                }
            }
        }
    }

    @Override // com.whatsapp.mediaview.MediaViewBaseFragment, X.C0BA
    public void A0v(Bundle bundle) {
        this.A15.AS1(new RunnableEBaseShape4S0100000_I0_4(this.A0T, 6));
        super.A0v(bundle);
        RunnableEBaseShape0S0310000_I0 runnableEBaseShape0S0310000_I0 = new RunnableEBaseShape0S0310000_I0(this);
        this.A18 = runnableEBaseShape0S0310000_I0;
        ((Thread) runnableEBaseShape0S0310000_I0.A02).start();
        this.A19 = bundle != null;
        A0J();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00b7, code lost:
        if (r5 == 4) goto L77;
     */
    @Override // com.whatsapp.mediaview.MediaViewBaseFragment, X.C0BA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0w(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.MediaViewFragment.A0w(android.view.View, android.os.Bundle):void");
    }

    @Override // com.whatsapp.mediaview.MediaViewBaseFragment
    public void A12() {
        View findViewWithTag;
        AnonymousClass097 A1D = A1D(this.A03);
        if (A1D != null && (findViewWithTag = ((MediaViewBaseFragment) this).A09.findViewWithTag(A1D.A0n)) != null) {
            View findViewById = findViewWithTag.findViewById(R.id.thumbnail);
            if (findViewById != null) {
                findViewById.setVisibility(0);
                findViewById.setAlpha(1.0f);
            }
            View findViewById2 = findViewWithTag.findViewById(R.id.video_view);
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
        }
        super.A12();
    }

    @Override // com.whatsapp.mediaview.MediaViewBaseFragment
    public void A13() {
        super.A13();
        Map map = this.A1M;
        for (AbstractC48662Ge abstractC48662Ge : map.values()) {
            abstractC48662Ge.A09();
        }
        map.clear();
    }

    @Override // com.whatsapp.mediaview.MediaViewBaseFragment
    public void A16() {
        if (this.A0i == null || (this.A1B && this.A0w != null)) {
            A15();
            return;
        }
        this.A0w = null;
        Intent intent = new Intent(A00(), MediaGalleryActivity.class);
        intent.putExtra("jid", this.A0i.getRawString());
        InterfaceC48692Gh interfaceC48692Gh = this.A0q;
        if (interfaceC48692Gh != null) {
            interfaceC48692Gh.AMI();
        }
        super.A0i(intent);
        A13();
    }

    public final AnonymousClass097 A1D(int i) {
        InterfaceC48692Gh interfaceC48692Gh = this.A0q;
        if (interfaceC48692Gh == null) {
            return null;
        }
        return interfaceC48692Gh.ABE(i);
    }

    public final void A1E() {
        C0HV c0hv = this.A11;
        if (c0hv == null || this.A01 == 2) {
            return;
        }
        c0hv.A03();
        A1G();
        this.A01 = 2;
    }

    public final void A1F() {
        ImageButton imageButton = this.A08;
        if (imageButton != null) {
            imageButton.setImageDrawable(new C0We(this.A0Y, C02160Ac.A03(A00(), R.drawable.mviewer_pause)));
            this.A08.setContentDescription(A0F(R.string.pause));
        }
        View view = this.A07;
        if (view != null) {
            AnonymousClass088.A1V(view, R.string.pause);
        }
    }

    public final void A1G() {
        ImageButton imageButton = this.A08;
        if (imageButton != null) {
            imageButton.setImageDrawable(new C0We(this.A0Y, C02160Ac.A03(A00(), R.drawable.mviewer_play)));
            this.A08.setContentDescription(A0F(R.string.play));
        }
        View view = this.A07;
        if (view != null) {
            AnonymousClass088.A1V(view, R.string.play);
        }
    }

    public final void A1H() {
        C0HV c0hv = this.A11;
        if (c0hv != null) {
            c0hv.A05();
            this.A11 = null;
            this.A01 = 0;
        }
        VoiceNoteSeekBar voiceNoteSeekBar = this.A17;
        if (voiceNoteSeekBar != null) {
            voiceNoteSeekBar.setProgress(0);
        }
        A1G();
        TextView textView = this.A09;
        if (textView != null) {
            textView.setText(AnonymousClass029.A0g(this.A0Y, 0L));
        }
    }

    public void A1I(int i) {
        this.A0q.getCount();
        this.A03 = i;
        A14();
        C68763Lu c68763Lu = ((MediaViewBaseFragment) this).A09;
        c68763Lu.A0j = false;
        c68763Lu.A0D(i, false, false, 0);
        A0A().invalidateOptionsMenu();
        ((MediaViewBaseFragment) this).A02.setVisibility(8);
    }

    public final void A1J(int i) {
        AnonymousClass097 ABE;
        String A0F;
        InterfaceC48692Gh interfaceC48692Gh = this.A0q;
        if (interfaceC48692Gh != null && (ABE = interfaceC48692Gh.ABE(i)) != null) {
            InterfaceC48692Gh interfaceC48692Gh2 = this.A0q;
            if (interfaceC48692Gh2 != null) {
                interfaceC48692Gh2.AVn(i);
            }
            if (ABE.A0n.A02) {
                A0F = A0F(R.string.you);
            } else {
                UserJid A0B = ABE.A0B();
                if (A0B != null) {
                    A0F = this.A0N.A08(this.A0L.A0A(A0B), false);
                } else {
                    AbstractC005302j abstractC005302j = this.A0i;
                    if (abstractC005302j != null) {
                        A0F = this.A0N.A08(this.A0L.A0A(abstractC005302j), false);
                    } else {
                        Log.e("mediaview/no sender and no jid");
                        this.A0D.A09("MediaViewFragment/setSenderAndDateTime", "null_jid_no_sender", true);
                        A0F = A0F(R.string.unknown);
                    }
                }
            }
            ((MediaViewBaseFragment) this).A07.setText(A0F);
            ((MediaViewBaseFragment) this).A05.setText(AnonymousClass029.A0U(this.A0Y, this.A0U.A06(ABE.A0E)));
            A0A().invalidateOptionsMenu();
        }
    }

    public final void A1K(AnonymousClass097 anonymousClass097) {
        View findViewWithTag;
        C09H c09h;
        StringBuilder A0P = C000200d.A0P("mediaview/prepareaudioplayback/");
        AnonymousClass094 anonymousClass094 = anonymousClass097.A0n;
        C000200d.A1N(A0P, anonymousClass094.A01);
        if (this.A0W.A06() && (findViewWithTag = ((MediaViewBaseFragment) this).A09.findViewWithTag(anonymousClass094)) != null) {
            this.A09 = (TextView) findViewWithTag.findViewById(R.id.progress_tv);
            VoiceNoteSeekBar voiceNoteSeekBar = (VoiceNoteSeekBar) findViewWithTag.findViewById(R.id.audio_seekbar);
            this.A17 = voiceNoteSeekBar;
            voiceNoteSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: X.313
                {
                    MediaViewFragment.this = this;
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    if (seekBar == null) {
                        return;
                    }
                    MediaViewFragment mediaViewFragment = MediaViewFragment.this;
                    mediaViewFragment.A17.setContentDescription(mediaViewFragment.A0G(R.string.voice_message_time_elapsed, AnonymousClass029.A0i(mediaViewFragment.A0Y, seekBar.getProgress())));
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar) {
                    MediaViewFragment mediaViewFragment = MediaViewFragment.this;
                    C0HV c0hv = mediaViewFragment.A11;
                    if (c0hv != null && c0hv.A0B()) {
                        mediaViewFragment.A11.A03();
                    }
                    mediaViewFragment.A06.removeMessages(0);
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar) {
                    MediaViewFragment mediaViewFragment = MediaViewFragment.this;
                    C0HV c0hv = mediaViewFragment.A11;
                    if (c0hv != null) {
                        if (mediaViewFragment.A01 == 1) {
                            try {
                                c0hv.A09((int) ((mediaViewFragment.A17.getProgress() / mediaViewFragment.A17.getMax()) * c0hv.A02()));
                                mediaViewFragment.A11.A07();
                                mediaViewFragment.A06.sendEmptyMessage(0);
                                mediaViewFragment.A1F();
                                return;
                            } catch (IOException e) {
                                Log.e("mediaview/fail onStopTracking", e);
                                ((ActivityC02290Ap) mediaViewFragment.A0A()).AUj(R.string.gallery_audio_cannot_load);
                                return;
                            }
                        }
                        int progress = (int) ((mediaViewFragment.A17.getProgress() / mediaViewFragment.A17.getMax()) * c0hv.A02());
                        AnonymousClass097 A1D = mediaViewFragment.A1D(mediaViewFragment.A03);
                        if (A1D != null) {
                            mediaViewFragment.A1L(A1D, progress, false);
                            return;
                        }
                        return;
                    }
                    mediaViewFragment.A17.setProgress(0);
                }
            });
            ImageButton imageButton = (ImageButton) findViewWithTag.findViewById(R.id.audio_control_btn);
            this.A08 = imageButton;
            ViewOnClickEBaseShape0S0200000_I0_0 viewOnClickEBaseShape0S0200000_I0_0 = new ViewOnClickEBaseShape0S0200000_I0_0(this.A17, this, 31);
            imageButton.setOnClickListener(viewOnClickEBaseShape0S0200000_I0_0);
            View findViewById = findViewWithTag.findViewById(R.id.audio_icon);
            this.A07 = findViewById;
            if (((MediaViewBaseFragment) this).A0G) {
                findViewById.setOnClickListener(viewOnClickEBaseShape0S0200000_I0_0);
            } else {
                findViewById.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0_0(this, viewOnClickEBaseShape0S0200000_I0_0, 30));
            }
            C0HV c0hv = this.A11;
            if (c0hv != null) {
                c0hv.A05();
                this.A11 = null;
            }
            try {
                c09h = anonymousClass097.A02;
            } catch (IOException e) {
                Log.e("mediaview/prepare fail", e);
                C0HV c0hv2 = this.A11;
                if (c0hv2 != null) {
                    c0hv2.A05();
                    this.A11 = null;
                }
                ((ActivityC02290Ap) A0A()).AUj(R.string.gallery_audio_cannot_load);
            }
            if (c09h != null) {
                File file = c09h.A0F;
                if (file != null) {
                    C0HV A00 = C0HV.A00(file, 3, null);
                    this.A11 = A00;
                    A00.A0A(new MediaPlayer.OnErrorListener() { // from class: X.30x
                        @Override // android.media.MediaPlayer.OnErrorListener
                        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                            StringBuilder sb = new StringBuilder("mediaview/error: what:");
                            sb.append(i);
                            sb.append("  extra:");
                            sb.append(i2);
                            Log.e(sb.toString());
                            return false;
                        }
                    });
                    this.A11.A04();
                    StringBuilder sb = new StringBuilder();
                    sb.append("mediaview/audio duration:");
                    sb.append(this.A11.A02());
                    Log.i(sb.toString());
                    this.A01 = 2;
                    this.A09.setText(AnonymousClass029.A0g(this.A0Y, this.A11.A02() / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
                    this.A17.setMax(this.A11.A02());
                } else {
                    Log.e("mediaview/ audio file is null");
                    ((ActivityC02290Ap) A0A()).AUj(R.string.gallery_audio_cannot_load);
                }
                this.A17.setProgress(0);
                A1G();
                return;
            }
            throw null;
        }
    }

    public final void A1L(final AnonymousClass097 anonymousClass097, int i, boolean z) {
        C48652Gd c48652Gd;
        this.A0P.A03();
        boolean z2 = A1O;
        if (!z2 && C0DB.A0D(anonymousClass097.A0m)) {
            this.A0E.A06(0, R.string.loading_spinner);
            MediaProvider.A05(this.A0E, this.A0D, this.A15, this.A0e, anonymousClass097, new C0CG() { // from class: X.3I5
                {
                    MediaViewFragment.this = this;
                }

                @Override // X.C0CG
                public final void A54(Object obj) {
                    List<ResolveInfo> queryIntentActivities;
                    MediaViewFragment mediaViewFragment = MediaViewFragment.this;
                    mediaViewFragment.A0E.A03();
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType((Uri) obj, "video/*");
                    intent.setFlags(1);
                    if (Build.MANUFACTURER.startsWith("Sony") && (queryIntentActivities = mediaViewFragment.A0A().getPackageManager().queryIntentActivities(intent, 0)) != null) {
                        for (ResolveInfo resolveInfo : queryIntentActivities) {
                            StringBuilder A0P = C000200d.A0P("mediaview/share");
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            A0P.append(activityInfo.packageName);
                            A0P.append(" | ");
                            C000200d.A1N(A0P, activityInfo.name);
                            if (resolveInfo.activityInfo.name.equals("com.sonyericsson.gallery.MovieView")) {
                                intent.setClassName("com.sonyericsson.gallery", "com.sonyericsson.gallery.MovieView");
                            }
                        }
                    }
                    Context A00 = mediaViewFragment.A00();
                    InterfaceC48692Gh interfaceC48692Gh = mediaViewFragment.A0q;
                    if (interfaceC48692Gh != null) {
                        interfaceC48692Gh.AMI();
                    }
                    mediaViewFragment.A0C.A06(A00, intent);
                }
            });
            C09H c09h = anonymousClass097.A02;
            if (c09h != null) {
                if (this.A1C) {
                    C0HA c0ha = this.A0g;
                    int i2 = anonymousClass097.A0n.A02 ? 3 : 1;
                    int i3 = z ? this.A04 : 4;
                    long j = anonymousClass097.A00;
                    File file = c09h.A0F;
                    if (c0ha == null) {
                        throw null;
                    }
                    if (file != null) {
                        C37621mi c37621mi = new C37621mi();
                        c37621mi.A05 = Long.valueOf(j);
                        c37621mi.A04 = Long.valueOf((System.currentTimeMillis() - file.lastModified()) / 1000);
                        c37621mi.A03 = Integer.valueOf(i2);
                        c37621mi.A02 = 1;
                        c37621mi.A01 = Integer.valueOf(i3);
                        c37621mi.A00 = Double.valueOf(file.length());
                        c0ha.A0B.A0B(c37621mi, null, false);
                    }
                }
                this.A1C = false;
                return;
            }
            throw null;
        }
        byte b = anonymousClass097.A0m;
        if (z2) {
            if ((C0DB.A0D(b) || C0DB.A0B(b)) && z && (c48652Gd = this.A16) != null) {
                c48652Gd.A04 = this.A04;
                c48652Gd.A09();
                C48652Gd c48652Gd2 = this.A16;
                C06260Si c06260Si = c48652Gd2.A08;
                if (c06260Si != null) {
                    c06260Si.ASJ(i);
                } else {
                    c48652Gd2.A03 = i;
                }
                this.A16.A08();
                A0A().invalidateOptionsMenu();
                return;
            }
        } else if (C0DB.A0B(b)) {
            AbstractC48662Ge abstractC48662Ge = (AbstractC48662Ge) this.A1M.get(anonymousClass097.A0n);
            if (abstractC48662Ge == null) {
                return;
            }
            abstractC48662Ge.A08();
            return;
        }
        if (b == 2) {
            A1K(anonymousClass097);
            if (this.A11 == null) {
                return;
            }
            this.A12.A01();
            try {
                this.A11.A07();
                if (i > 0) {
                    this.A11.A09(i);
                    this.A17.setProgress(this.A11.A01());
                }
                this.A01 = 1;
                this.A06.sendEmptyMessage(0);
                A1F();
            } catch (IOException e) {
                Log.e("mediaview/playMedia failed to start", e);
                ((ActivityC02290Ap) A0A()).AUj(R.string.gallery_audio_cannot_load);
            }
        } else if (b != 9) {
        } else {
            Log.i("mediaview/playMedia trying to open document");
            this.A0E.A06(0, R.string.loading_spinner);
            MediaProvider.A05(this.A0E, this.A0D, this.A15, this.A0e, anonymousClass097, new C0CG() { // from class: X.3I7
                {
                    MediaViewFragment.this = this;
                }

                @Override // X.C0CG
                public final void A54(Object obj) {
                    MediaViewFragment mediaViewFragment = MediaViewFragment.this;
                    AnonymousClass097 anonymousClass0972 = anonymousClass097;
                    mediaViewFragment.A0E.A03();
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType((Uri) obj, anonymousClass0972.A07);
                    intent.setFlags(1);
                    Context A00 = mediaViewFragment.A00();
                    InterfaceC48692Gh interfaceC48692Gh = mediaViewFragment.A0q;
                    if (interfaceC48692Gh != null) {
                        interfaceC48692Gh.AMI();
                    }
                    mediaViewFragment.A0C.A06(A00, intent);
                }
            });
        }
    }

    public void A1M(C48652Gd c48652Gd, ExoPlaybackControlView exoPlaybackControlView, int i) {
        ExoPlaybackControlView exoPlaybackControlView2;
        ExoPlaybackControlView exoPlaybackControlView3;
        if (c48652Gd.A0G) {
            if ((i & 4) == 0) {
                A1A(true, false);
                for (C48652Gd c48652Gd2 : this.A1N.values()) {
                    if (c48652Gd2 != c48652Gd && (exoPlaybackControlView3 = c48652Gd2.A0C) != null) {
                        exoPlaybackControlView3.A0B.setVisibility(0);
                        if (exoPlaybackControlView3.A07) {
                            exoPlaybackControlView3.A0A.setVisibility(0);
                        }
                        exoPlaybackControlView3.A04();
                        exoPlaybackControlView3.A03();
                        exoPlaybackControlView3.A05();
                    }
                }
                if (Build.VERSION.SDK_INT < 19 && exoPlaybackControlView.getVisibility() != 0) {
                    exoPlaybackControlView.A01();
                    exoPlaybackControlView.A06(3000);
                    return;
                }
                return;
            }
            A1A(false, false);
            for (C48652Gd c48652Gd3 : this.A1N.values()) {
                if (c48652Gd3 != c48652Gd && (exoPlaybackControlView2 = c48652Gd3.A0C) != null) {
                    exoPlaybackControlView2.A02();
                }
            }
        }
    }

    public final void A1N(List list) {
        if (list.size() == 1 && !C003101m.A0Z((Jid) list.get(0))) {
            ((WaFragment) this).A00.A01(this, Conversation.A00(A00(), this.A0L.A0A((AbstractC005302j) list.get(0))));
        } else {
            ((ActivityC02270An) A0A()).A1L(list);
        }
    }

    @Override // X.InterfaceC018908u
    public void AJH() {
        A1H();
        C48652Gd c48652Gd = this.A16;
        if (c48652Gd != null && this.A0y != null) {
            c48652Gd.A09();
            this.A16.A07();
            this.A1N.remove(this.A0y.A0n);
            this.A1L.remove(this.A0y.A0n);
            this.A16 = null;
        }
        InterfaceC48692Gh interfaceC48692Gh = this.A0q;
        if (interfaceC48692Gh == null || interfaceC48692Gh.getCount() == 1) {
            A13();
        }
    }

    @Override // X.C0S6
    public boolean APf(int i) {
        if (i == 101) {
            A13();
            return true;
        }
        return false;
    }

    @Override // com.whatsapp.mediaview.MediaViewBaseFragment, X.C0BA, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C63532zw c63532zw = this.A0p;
        if (c63532zw != null) {
            c63532zw.A02.dismiss();
        }
    }
}
