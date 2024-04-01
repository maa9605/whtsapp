package com.whatsapp.mediacomposer;

import X.AbstractC000600i;
import X.AbstractC005302j;
import X.AbstractC04890Mh;
import X.AbstractC08940cM;
import X.AbstractC48762Go;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.AnonymousClass011;
import X.AnonymousClass012;
import X.AnonymousClass014;
import X.AnonymousClass029;
import X.AnonymousClass075;
import X.AnonymousClass092;
import X.C000200d;
import X.C000500h;
import X.C001200o;
import X.C002301c;
import X.C003101m;
import X.C011005l;
import X.C011605s;
import X.C012005w;
import X.C018508q;
import X.C018608r;
import X.C018708s;
import X.C01B;
import X.C02980Dr;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C02O;
import X.C03010Du;
import X.C04480Ki;
import X.C04580Kz;
import X.C05U;
import X.C05W;
import X.C05Y;
import X.C06F;
import X.C08930cL;
import X.C0BA;
import X.C0C9;
import X.C0CA;
import X.C0DV;
import X.C0DW;
import X.C0EB;
import X.C0HL;
import X.C0JH;
import X.C0L5;
import X.C22e;
import X.C22v;
import X.C2EK;
import X.C2EM;
import X.C2EN;
import X.C2EO;
import X.C2EP;
import X.C2Gx;
import X.C2HC;
import X.C2HF;
import X.C2HT;
import X.C2L9;
import X.C2MB;
import X.C2MI;
import X.C2OK;
import X.C37231m5;
import X.C3L3;
import X.C3LX;
import X.C40081rY;
import X.C41491u0;
import X.C41681uL;
import X.C41961un;
import X.C42371vd;
import X.C42611w2;
import X.C43791xz;
import X.C43811y1;
import X.C43871y8;
import X.C44011yN;
import X.C44551zG;
import X.C454622d;
import X.C455322l;
import X.C455522n;
import X.C455822q;
import X.C462626b;
import X.C47682Ce;
import X.C48702Gi;
import X.C48732Gl;
import X.C48742Gm;
import X.C48752Gn;
import X.C48822Gw;
import X.C50692Su;
import X.C52132a7;
import X.C63332zc;
import X.C63512zu;
import X.C67673Gk;
import X.C67723Gp;
import X.C67753Gs;
import X.C67763Gt;
import X.C72653aN;
import X.C79443lf;
import X.DialogC48832Gy;
import X.InterfaceC002901k;
import X.InterfaceC70823Tt;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.ContactPicker;
import com.whatsapp.WaImageView;
import com.whatsapp.gallerypicker.PhotoViewPager;
import com.whatsapp.jid.Jid;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.bottombar.BottomBarView;
import com.whatsapp.mediacomposer.doodle.ColorPickerComponent;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.status.FirstStatusConfirmationDialogFragment;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class MediaComposerActivity extends C2EM implements C2EN, C2EO, C2EP {
    public Bitmap A01;
    public View A02;
    public C0HL A03;
    public AbstractC000600i A04;
    public C04480Ki A05;
    public C012005w A06;
    public C018508q A07;
    public C02L A08;
    public C03010Du A09;
    public C01B A0A;
    public C018608r A0B;
    public C011605s A0C;
    public C05W A0D;
    public C42371vd A0E;
    public AnonymousClass075 A0F;
    public C018708s A0G;
    public C0L5 A0H;
    public C2L9 A0I;
    public C02E A0J;
    public C462626b A0K;
    public AnonymousClass012 A0L;
    public C001200o A0M;
    public C02F A0N;
    public C002301c A0O;
    public C0CA A0P;
    public C0C9 A0Q;
    public C0EB A0R;
    public C44011yN A0S;
    public C40081rY A0T;
    public C47682Ce A0U;
    public C2MI A0V;
    public AnonymousClass011 A0W;
    public C52132a7 A0X;
    public PhotoViewPager A0Y;
    public C455822q A0Z;
    public C41491u0 A0a;
    public C44551zG A0b;
    public C455322l A0c;
    public C48822Gw A0d;
    public C2HT A0e;
    public C3LX A0f;
    public C67723Gp A0g;
    public C43811y1 A0h;
    public C2OK A0i;
    public C48752Gn A0j;
    public C02980Dr A0k;
    public C05Y A0l;
    public C41681uL A0m;
    public C0DW A0n;
    public C0DV A0o;
    public C02O A0p;
    public C79443lf A0q;
    public C50692Su A0r;
    public C43791xz A0s;
    public C41961un A0t;
    public InterfaceC002901k A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public int A00 = 0;
    public final Runnable A19 = new RunnableEBaseShape3S0100000_I0_3(this, 49);
    public final InterfaceC70823Tt A18 = new InterfaceC70823Tt() { // from class: X.3GZ
        {
            MediaComposerActivity.this = this;
        }

        @Override // X.InterfaceC70823Tt
        public final void AOB(String str, int i) {
            C50692Su c50692Su;
            MediaComposerActivity mediaComposerActivity = MediaComposerActivity.this;
            if (!mediaComposerActivity.AFE() && i == 2 && (c50692Su = mediaComposerActivity.A0r) != null) {
                c50692Su.A02(str, false, 3);
            }
        }
    };
    public final C2Gx A17 = new C2Gx();
    public final HashMap A1B = new HashMap();
    public final HashSet A1C = new HashSet();
    public final Map A1D = new HashMap();
    public final Collection A1A = new ArrayList();
    public final Handler A15 = new Handler(Looper.getMainLooper());
    public final Rect A14 = new Rect();
    public final PointF A13 = new PointF();
    public final C06F A16 = new C06F((int) ((Runtime.getRuntime().maxMemory() / 1024) / 6)) { // from class: X.3Gh
        @Override // X.C06F
        public int A02(Object obj, Object obj2) {
            return ((Bitmap) obj2).getByteCount() >> 10;
        }
    };

    public static final long A00(C42611w2 c42611w2) {
        C72653aN c72653aN;
        if (c42611w2.A06() != null && c42611w2.A06().byteValue() == 3) {
            Point A02 = c42611w2.A02();
            if (A02 != null) {
                return A02.y - A02.x;
            }
            synchronized (c42611w2) {
                c72653aN = c42611w2.A04;
            }
            if (c72653aN != null) {
                return c72653aN.A04;
            }
            return -1L;
        }
        return -1L;
    }

    public static Intent A01(C63332zc c63332zc) {
        Intent intent = new Intent(c63332zc.A0C, MediaComposerActivity.class);
        intent.putExtra("android.intent.extra.STREAM", c63332zc.A08);
        intent.putExtra("android.intent.extra.TEXT", (String) null);
        intent.putExtra("jid", c63332zc.A06);
        intent.putExtra("jids", (Serializable) null);
        intent.putExtra("max_items", c63332zc.A00);
        intent.putExtra("origin", c63332zc.A01);
        long j = c63332zc.A02;
        if (j <= 0) {
            j = SystemClock.elapsedRealtime();
        }
        intent.putExtra("picker_open_time", j);
        intent.putExtra("send", c63332zc.A0B);
        intent.putExtra("quoted_message_row_id", c63332zc.A03);
        intent.putExtra("quoted_group_jid", c63332zc.A07);
        intent.putExtra("number_from_url", c63332zc.A09);
        intent.putExtra("media_preview_params", c63332zc.A05);
        intent.putExtra("smb_quick_reply", false);
        intent.putExtra("start_home", false);
        intent.putExtra("animate_uri", c63332zc.A04);
        intent.putExtra("preselected_image_uri", (Parcelable) null);
        intent.putExtra("scan_for_qr", c63332zc.A0A);
        return intent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x003e, code lost:
        if (r6 != 43) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C37231m5 A02(byte r6, boolean r7, int r8, int r9, long r10) {
        /*
            X.1m5 r3 = new X.1m5
            r3.<init>()
            r4 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r3.A08 = r0
            r3.A09 = r0
            r3.A05 = r0
            r3.A03 = r0
            r3.A04 = r0
            r3.A06 = r0
            r3.A0A = r0
            r3.A0C = r0
            r3.A07 = r0
            if (r7 == 0) goto L72
            r0 = 1
        L21:
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r3.A0D = r2
            long r0 = (long) r8
            java.lang.Long r0 = X.C000200d.A05(r2, r0)
            r3.A02 = r0
            r0 = 1
            if (r6 == r0) goto L6a
            r1 = 3
            if (r6 == r1) goto L63
            r0 = 13
            if (r6 == r0) goto L5a
            r0 = 42
            if (r6 == r0) goto L6a
            r0 = 43
            if (r6 == r0) goto L63
        L40:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r3.A00 = r0
            long r1 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 <= 0) goto L59
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L59
            long r1 = r1 - r10
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r3.A0B = r0
        L59:
            return r3
        L5a:
            r0 = 11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A01 = r0
            goto L40
        L63:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A01 = r0
            goto L40
        L6a:
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A01 = r0
            goto L40
        L72:
            r0 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerActivity.A02(byte, boolean, int, int, long):X.1m5");
    }

    public static void A03(C41961un c41961un, Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            C42611w2 c42611w2 = (C42611w2) it.next();
            if (collection.contains(c42611w2.A05())) {
                c41961un.A0g(c42611w2.A05());
                c41961un.A0g(c42611w2.A03());
            }
        }
    }

    public final C37231m5 A1P(byte b) {
        return A02(b, AAl().contains(C04580Kz.A00), AAl().size(), getIntent().getIntExtra("origin", 1), getIntent().getLongExtra("picker_open_time", 0L));
    }

    public final MediaComposerFragment A1Q() {
        Uri A03 = this.A0d.A03();
        if (A03 != null) {
            for (C0BA c0ba : A0t()) {
                if (c0ba instanceof MediaComposerFragment) {
                    MediaComposerFragment mediaComposerFragment = (MediaComposerFragment) c0ba;
                    if (A03.equals(mediaComposerFragment.A00)) {
                        return mediaComposerFragment;
                    }
                }
            }
        }
        return null;
    }

    public final void A1R() {
        Map map = this.A1D;
        for (C22e c22e : map.values()) {
            C44551zG c44551zG = this.A0b;
            if (c44551zG != null) {
                C454622d c454622d = (C454622d) c22e;
                if (c454622d.A0S == null) {
                    c454622d.A02 = true;
                    C22v A01 = c454622d.A01();
                    synchronized (A01) {
                        if (!A01.A0A) {
                            A01.A06 = 0;
                        } else {
                            A01.A06 = 1;
                        }
                    }
                    C455522n c455522n = c44551zG.A0B;
                    c455522n.A04.A00(c454622d.A03().A05).A06(c454622d);
                    c455522n.A02.A06(c454622d);
                    c455522n.A03.A06(c454622d);
                    c44551zG.A0E.A06(c454622d);
                    c44551zG.A0H.AS1(new RunnableEBaseShape2S0200000_I0_2(c44551zG, c454622d, 43));
                } else {
                    StringBuilder sb = new StringBuilder("app/mediajobmanager/attempting to cancel non-optimistic job, skipped, job=");
                    sb.append(c22e);
                    Log.w(sb.toString());
                }
            } else {
                throw null;
            }
        }
        map.clear();
    }

    public final void A1S() {
        String str;
        for (C0BA c0ba : A0t()) {
            if (c0ba instanceof MediaComposerFragment) {
                MediaComposerFragment mediaComposerFragment = (MediaComposerFragment) c0ba;
                Uri uri = mediaComposerFragment.A00;
                C2Gx c2Gx = this.A17;
                C42611w2 A01 = c2Gx.A01(uri);
                String str2 = null;
                if (!mediaComposerFragment.A0A.A0M.A04.isEmpty()) {
                    C48742Gm c48742Gm = mediaComposerFragment.A0A;
                    C63512zu c63512zu = c48742Gm.A0H;
                    str = new C2EK(c63512zu.A06, c63512zu.A07, c63512zu.A02, c48742Gm.A0M.A05).A04();
                } else {
                    str = null;
                }
                synchronized (A01) {
                    A01.A09 = str;
                }
                C42611w2 A012 = c2Gx.A01(uri);
                if (!mediaComposerFragment.A0A.A0M.A04.isEmpty()) {
                    C2HF c2hf = mediaComposerFragment.A0A.A0M;
                    if (c2hf != null) {
                        try {
                            str2 = c2hf.A03.A01(c2hf.A04);
                        } catch (JSONException e) {
                            Log.e("ShapeRepository/saveEditState", e);
                        }
                    } else {
                        throw null;
                    }
                }
                synchronized (A012) {
                    A012.A0A = str2;
                }
            }
        }
    }

    public final void A1T() {
        for (C0BA c0ba : A0t()) {
            if (c0ba instanceof ImageComposerFragment) {
                ImageComposerFragment imageComposerFragment = (ImageComposerFragment) c0ba;
                C42611w2 A01 = this.A17.A01(((MediaComposerFragment) imageComposerFragment).A00);
                int i = imageComposerFragment.A09.A02;
                synchronized (A01) {
                    A01.A00 = i;
                }
            }
        }
    }

    public final void A1U() {
        int intExtra;
        boolean z;
        MediaComposerFragment A1Q;
        if (this.A12) {
            return;
        }
        MediaComposerFragment A1Q2 = A1Q();
        if (A1Q2 != null && A1Q2.A15()) {
            return;
        }
        A1S();
        HashMap hashMap = new HashMap();
        Iterator it = this.A0d.A04().iterator();
        while (true) {
            boolean z2 = false;
            if (it.hasNext()) {
                C42611w2 A01 = this.A17.A01((Uri) it.next());
                byte A0Y = this.A0t.A0Y(A01);
                A01.A0A(Byte.valueOf(A0Y));
                byte b = A01.A0D() ? (byte) 13 : A0Y;
                Byte valueOf = Byte.valueOf(b);
                C37231m5 c37231m5 = (C37231m5) hashMap.get(valueOf);
                if (c37231m5 == null) {
                    c37231m5 = A1P(b);
                    hashMap.put(valueOf, c37231m5);
                }
                c37231m5.A05 = C000200d.A04(c37231m5.A05);
                if (A01.A03() != null) {
                    c37231m5.A04 = C000200d.A04(c37231m5.A04);
                    z = true;
                } else {
                    z = false;
                }
                if (A01.A01() != 0) {
                    z = true;
                }
                String A08 = A01.A08();
                if (!TextUtils.isEmpty(A08) && (A1Q = A1Q()) != null) {
                    if (A08 != null) {
                        C2EK A03 = C2EK.A03(A08, this, this.A0T, this.A0O, A1Q.A0E);
                        if (A03 != null) {
                            if (A03.A0D(new String[]{"pen"})) {
                                c37231m5.A06 = C000200d.A04(c37231m5.A06);
                                z2 = true;
                            }
                            if (A03.A0A()) {
                                c37231m5.A0A = C000200d.A04(c37231m5.A0A);
                                z2 = true;
                            }
                            if (A03.A0D(new String[]{"text"})) {
                                c37231m5.A0C = C000200d.A04(c37231m5.A0C);
                                z2 = true;
                            }
                        }
                    } else {
                        throw null;
                    }
                }
                if (z | z2) {
                    c37231m5.A03 = C000200d.A04(c37231m5.A03);
                }
            } else {
                HashSet hashSet = this.A1C;
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    C42611w2 c42611w2 = (C42611w2) it2.next();
                    byte A0Y2 = this.A0t.A0Y(c42611w2);
                    c42611w2.A0A(Byte.valueOf(A0Y2));
                    if (c42611w2.A0D()) {
                        A0Y2 = 13;
                    }
                    Byte valueOf2 = Byte.valueOf(A0Y2);
                    C37231m5 c37231m52 = (C37231m5) hashMap.get(valueOf2);
                    if (c37231m52 == null) {
                        c37231m52 = A1P(A0Y2);
                        hashMap.put(valueOf2, c37231m52);
                    }
                    c37231m52.A05 = C000200d.A04(c37231m52.A05);
                }
                for (AnonymousClass014 anonymousClass014 : hashMap.values()) {
                    this.A0W.A06(anonymousClass014);
                }
                C41961un c41961un = this.A0t;
                Collection collection = this.A1A;
                A03(c41961un, collection, new ArrayList(this.A17.A00.values()));
                A03(this.A0t, collection, hashSet);
                C0JH A032 = this.A0C.A03();
                for (Uri uri : this.A0d.A04()) {
                    A1b(A032, uri);
                }
                if (this.A0d.A04().size() == 1 && ((intExtra = getIntent().getIntExtra("origin", 1)) == 2 || intExtra == 7 || intExtra == 12 || intExtra == 15 || intExtra == 18)) {
                    finish();
                    overridePendingTransition(17432576, 17432577);
                    return;
                } else if (getIntent().getIntExtra("origin", 1) == 29) {
                    finish();
                    overridePendingTransition(0, 17432577);
                    return;
                } else if (this.A01 != null && A1Q2 != null) {
                    this.A02.setVisibility(0);
                    if (A1Q2 instanceof VideoComposerFragment) {
                        VideoComposerFragment videoComposerFragment = (VideoComposerFragment) A1Q2;
                        videoComposerFragment.A0T.A09();
                        videoComposerFragment.A0T.A05().setAlpha(0.0f);
                        videoComposerFragment.A05().findViewById(R.id.content).setVisibility(4);
                    } else if (!(A1Q2 instanceof ImageComposerFragment)) {
                        if (A1Q2 instanceof GifComposerFragment) {
                            GifComposerFragment gifComposerFragment = (GifComposerFragment) A1Q2;
                            gifComposerFragment.A05.A09();
                            gifComposerFragment.A05.A05().setVisibility(4);
                        }
                    } else {
                        ((ImageComposerFragment) A1Q2).A07.setVisibility(4);
                    }
                    A0Q();
                    return;
                } else {
                    finish();
                    return;
                }
            }
        }
    }

    public final void A1V() {
        Jid jid;
        long j;
        this.A0z = false;
        StringBuilder A0P = C000200d.A0P("MediaComposerActivity/sendmedia uris size = ");
        A0P.append(this.A0d.A04().size());
        Log.i(A0P.toString());
        if (getIntent().getBooleanExtra("send", true) && AAl().isEmpty()) {
            Intent intent = new Intent(this, ContactPicker.class);
            intent.putExtra("send", true);
            intent.putExtra("skip_preview", true);
            HashSet hashSet = new HashSet();
            if (((Number) this.A0d.A04.A01()).intValue() == 3) {
                j = A00(this.A17.A01((Uri) this.A0d.A04().get(0)));
                hashSet.add(Integer.valueOf(this.A0d.A00() == 3 ? 43 : 42));
            } else {
                Iterator it = new ArrayList(this.A17.A00.values()).iterator();
                j = -1;
                while (it.hasNext()) {
                    C42611w2 c42611w2 = (C42611w2) it.next();
                    if (c42611w2.A06() != null) {
                        hashSet.add(Integer.valueOf(c42611w2.A06().byteValue()));
                        j = Math.max(j, A00(c42611w2));
                    }
                }
            }
            if (j != -1) {
                intent.putExtra("send_max_video_duration", j);
            }
            intent.putIntegerArrayListExtra("message_types", new ArrayList<>(hashSet));
            startActivityForResult(intent, 1);
            return;
        }
        AnonymousClass092 anonymousClass092 = null;
        if (AAl().size() == 1) {
            jid = (Jid) AAl().get(0);
        } else {
            jid = null;
        }
        if (C003101m.A0Z(jid) && !this.A0R.A0H()) {
            AUh(new FirstStatusConfirmationDialogFragment());
            return;
        }
        this.A0g.A0D.A07.setEnabled(false);
        A1S();
        A1T();
        if (this.A0d != null) {
            long longExtra = getIntent().getLongExtra("quoted_message_row_id", 0L);
            C011005l A04 = C011005l.A04(getIntent().getStringExtra("quoted_group_jid"));
            if (longExtra > 0) {
                anonymousClass092 = this.A0Q.A0C(longExtra);
            } else if (A04 != null) {
                anonymousClass092 = C05U.A00(A04, this.A0L.A05());
            }
            long longExtra2 = getIntent().getLongExtra("picker_open_time", 0L);
            boolean booleanExtra = getIntent().getBooleanExtra("number_from_url", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("send", true);
            int intExtra = getIntent().getIntExtra("origin", 1);
            this.A12 = true;
            this.A07.A02.postDelayed(this.A19, 300L);
            this.A0u.ARy(new C67673Gk(this.A0M, this.A07, this.A04, this.A09, this.A06, this.A0W, this.A0T, this.A0B, this.A0c, this.A0a, this.A0S, this.A0t, this.A0O, this.A0s, this, AAl(), this.A0d.A04(), new HashSet(this.A1A), this.A17, anonymousClass092, longExtra2, booleanExtra, intExtra, booleanExtra2, new HashMap(this.A1D), this.A1C, ((Number) this.A0d.A04.A01()).intValue() == 3), new Void[0]);
            return;
        }
        throw null;
    }

    public final void A1W() {
        AbstractC005302j abstractC005302j;
        C455822q c455822q = this.A0Z;
        C2MB c2mb = ((ActivityC02270An) this).A0F;
        AbstractC000600i abstractC000600i = this.A04;
        C40081rY c40081rY = this.A0T;
        C43871y8 c43871y8 = ((ActivityC02290Ap) this).A0G;
        C47682Ce c47682Ce = this.A0U;
        C02E c02e = this.A0J;
        C002301c c002301c = this.A0O;
        C2MI c2mi = this.A0V;
        C000500h c000500h = ((ActivityC02290Ap) this).A0F;
        C48822Gw c48822Gw = this.A0d;
        C02O c02o = this.A0p;
        if (!AAl().isEmpty() && AAl().size() == 1) {
            abstractC005302j = (AbstractC005302j) AAl().get(0);
        } else {
            abstractC005302j = null;
        }
        final DialogC48832Gy dialogC48832Gy = new DialogC48832Gy(this, c455822q, c2mb, abstractC000600i, c40081rY, c43871y8, c47682Ce, c02e, c002301c, c2mi, c000500h, c48822Gw, c02o, abstractC005302j, this.A0g.A0D.A0A.getText(), this.A0y);
        dialogC48832Gy.setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.2zb
            {
                MediaComposerActivity.this = this;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                MediaComposerActivity mediaComposerActivity = MediaComposerActivity.this;
                if (mediaComposerActivity.A0y) {
                    mediaComposerActivity.A0g.A02();
                } else {
                    BottomBarView bottomBarView = mediaComposerActivity.A0g.A0D;
                    bottomBarView.A09.setVisibility(8);
                    bottomBarView.A07.setVisibility(8);
                    bottomBarView.getCaptionAndPrivacyLayout().setVisibility(8);
                    bottomBarView.A06.setVisibility(8);
                    bottomBarView.A0B.setVisibility(8);
                }
                TextView textView = mediaComposerActivity.A0g.A0D.A08;
                textView.clearAnimation();
                textView.setVisibility(8);
            }
        });
        dialogC48832Gy.show();
        dialogC48832Gy.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.2zZ
            {
                MediaComposerActivity.this = this;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                MediaComposerActivity mediaComposerActivity = MediaComposerActivity.this;
                DialogC48832Gy dialogC48832Gy2 = dialogC48832Gy;
                if (mediaComposerActivity.A0y) {
                    mediaComposerActivity.A0g.A00();
                } else {
                    mediaComposerActivity.A0g.A06();
                }
                mediaComposerActivity.A0g.A04();
                mediaComposerActivity.A0g.A07(dialogC48832Gy2.A04, false);
                Uri A03 = mediaComposerActivity.A0d.A03();
                if (A03 != null) {
                    C42611w2 A01 = mediaComposerActivity.A17.A01(A03);
                    A01.A0B(dialogC48832Gy2.A06);
                    A01.A0C(AnonymousClass029.A0v(dialogC48832Gy2.A07));
                } else {
                    Log.e("MediaComposerActivity/captionentry/dismiss/current uri is null");
                }
                if (dialogC48832Gy2.A08) {
                    mediaComposerActivity.A1V();
                }
            }
        });
    }

    public final void A1X() {
        byte b;
        C67723Gp c67723Gp = this.A0g;
        int intValue = ((Number) c67723Gp.A0B.A04.A01()).intValue();
        if (intValue == 0) {
            BottomBarView bottomBarView = c67723Gp.A0D;
            bottomBarView.A0C.setEnabled(true);
            bottomBarView.A0D.setVisibility(8);
            if (c67723Gp.A0E) {
                bottomBarView.getViewOnceButtonSpacer().setVisibility(0);
            }
        } else if (intValue == 1) {
            BottomBarView bottomBarView2 = c67723Gp.A0D;
            bottomBarView2.A0C.setEnabled(true);
            WaImageView waImageView = bottomBarView2.A0D;
            waImageView.setVisibility(0);
            waImageView.setActivated(false);
            waImageView.setEnabled(false);
            if (c67723Gp.A0E) {
                bottomBarView2.getViewOnceButtonSpacer().setVisibility(8);
            }
        } else if (intValue == 2) {
            BottomBarView bottomBarView3 = c67723Gp.A0D;
            bottomBarView3.A0C.setEnabled(true);
            WaImageView waImageView2 = bottomBarView3.A0D;
            waImageView2.setVisibility(0);
            waImageView2.setActivated(false);
            waImageView2.setEnabled(true);
            if (c67723Gp.A0E) {
                bottomBarView3.getViewOnceButtonSpacer().setVisibility(8);
            }
        } else if (intValue == 3) {
            BottomBarView bottomBarView4 = c67723Gp.A0D;
            bottomBarView4.A0C.setEnabled(false);
            WaImageView waImageView3 = bottomBarView4.A0D;
            waImageView3.setVisibility(0);
            waImageView3.setActivated(true);
            waImageView3.setEnabled(true);
            if (c67723Gp.A0E) {
                bottomBarView4.getViewOnceButtonSpacer().setVisibility(8);
            }
        }
        MediaComposerFragment A1Q = A1Q();
        if (A1Q() != null) {
            C48822Gw c48822Gw = this.A0d;
            Uri A03 = c48822Gw.A03();
            if (A03 != null) {
                b = c48822Gw.A06.A0Y(c48822Gw.A05.A01(A03));
            } else {
                b = 0;
            }
            byte byteValue = Byte.valueOf(b).byteValue();
            if (byteValue == 13 || byteValue == 29) {
                return;
            }
            A1Q.A14(((Number) this.A0d.A04.A01()).intValue() == 3);
            A1Q.A12();
        }
    }

    public final void A1Y(int i) {
        if (i >= 0 && i < this.A0d.A04().size()) {
            this.A0d.A06(i);
            ((AbstractC04890Mh) this.A0g.A03).A01.A00();
            this.A0g.A0D.A09.A0Z(this.A0d.A01());
            MediaComposerFragment A1Q = A1Q();
            for (C0BA c0ba : A0t()) {
                if ((c0ba instanceof MediaComposerFragment) && c0ba != A1Q) {
                    MediaComposerFragment mediaComposerFragment = (MediaComposerFragment) c0ba;
                    if (mediaComposerFragment instanceof VideoComposerFragment) {
                        mediaComposerFragment.A16();
                    } else if (!(mediaComposerFragment instanceof ImageComposerFragment)) {
                        if (mediaComposerFragment instanceof GifComposerFragment) {
                            mediaComposerFragment.A16();
                        }
                    } else {
                        C48702Gi c48702Gi = ((ImageComposerFragment) mediaComposerFragment).A09;
                        c48702Gi.A0M.removeCallbacks(c48702Gi.A0W);
                        c48702Gi.A03 = null;
                        c48702Gi.A0C = false;
                        c48702Gi.A03();
                    }
                }
            }
            if (A1Q != null && !getIntent().getBooleanExtra("smb_send_product", false)) {
                C48742Gm c48742Gm = A1Q.A0A;
                c48742Gm.A05 = A1Q.A01().getConfiguration().orientation == 2;
                C48752Gn c48752Gn = c48742Gm.A0N;
                c48752Gn.A07(0);
                ColorPickerComponent colorPickerComponent = c48742Gm.A0C;
                c48752Gn.A01 = colorPickerComponent.A06.A03;
                c48742Gm.A0I.A02 = false;
                colorPickerComponent.A04(false);
                c48752Gn.A02 = c48742Gm.A02;
                c48752Gn.A03 = c48742Gm;
                c48752Gn.A0B.setUndoButtonVisibility(c48742Gm.A0M.A03.A00.isEmpty() ^ true ? 0 : 8);
                c48742Gm.A0G.setDoodleViewListener(new C3L3(c48742Gm, new RunnableEBaseShape4S0100000_I0_4(c48742Gm, 2)));
                c48742Gm.A04();
                c48742Gm.A05();
                if (A1Q instanceof ImageComposerFragment) {
                    C48752Gn c48752Gn2 = this.A0j;
                    if (!c48752Gn2.A0B.A05.isSelected()) {
                        AbstractC48762Go abstractC48762Go = c48752Gn2.A0B;
                        if (!abstractC48762Go.A06.isSelected() && !abstractC48762Go.A07.isSelected()) {
                            final C48702Gi c48702Gi2 = ((ImageComposerFragment) A1Q).A09;
                            View view = c48702Gi2.A0N;
                            if (view != null && c48702Gi2.A09 == null) {
                                c48702Gi2.A09 = new BottomSheetBehavior() { // from class: com.whatsapp.mediacomposer.filter.FilterSelectorController$3
                                    public boolean A00;

                                    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC08910cJ
                                    public boolean A08(CoordinatorLayout coordinatorLayout, View view2, int i2) {
                                        this.A00 = true;
                                        super.A08(coordinatorLayout, view2, i2);
                                        return true;
                                    }

                                    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC08910cJ
                                    public boolean A0B(CoordinatorLayout coordinatorLayout, View view2, MotionEvent motionEvent) {
                                        boolean z;
                                        if (this.A00 || !view2.isShown()) {
                                            boolean A0B = super.A0B(coordinatorLayout, view2, motionEvent);
                                            C48702Gi c48702Gi3 = c48702Gi2;
                                            if (c48702Gi3.A01 == 3) {
                                                return A0B;
                                            }
                                            MediaComposerFragment mediaComposerFragment2 = c48702Gi3.A0U.A00;
                                            mediaComposerFragment2.A0A.A0C(motionEvent);
                                            if (motionEvent.getPointerCount() < 2 && !mediaComposerFragment2.A0A.A0C(motionEvent)) {
                                                z = false;
                                                BottomSheetBehavior bottomSheetBehavior = c48702Gi3.A09;
                                                if (bottomSheetBehavior.A0B != 4) {
                                                    bottomSheetBehavior.A0O(4);
                                                }
                                            } else {
                                                z = true;
                                            }
                                            return A0B && !z;
                                        }
                                        return false;
                                    }

                                    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC08910cJ
                                    public boolean A0C(CoordinatorLayout coordinatorLayout, View view2, MotionEvent motionEvent) {
                                        c48702Gi2.A0U.A00.A0A.A0C(motionEvent);
                                        return this.A00 && super.A0C(coordinatorLayout, view2, motionEvent);
                                    }
                                };
                                BottomSheetBehavior bottomSheetBehavior = c48702Gi2.A09;
                                ((C08930cL) view.getLayoutParams()).A00(bottomSheetBehavior);
                                AbstractC08940cM abstractC08940cM = new AbstractC08940cM() { // from class: X.3Ht
                                    @Override // X.AbstractC08940cM
                                    public void A00(View view2, float f) {
                                        View findViewById;
                                        C48702Gi c48702Gi3 = c48702Gi2;
                                        if (c48702Gi3.A07() && c48702Gi3.A0G) {
                                            A01(view2, 1);
                                            c48702Gi3.A0G = false;
                                        } else if (c48702Gi3.A08() && c48702Gi3.A0H) {
                                            A01(view2, 1);
                                            c48702Gi3.A0H = false;
                                        }
                                        C2EN A0y = c48702Gi3.A0U.A00.A0y();
                                        if (A0y != null) {
                                            A0y.AKR(f);
                                        }
                                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c48702Gi3.A0Q.A0S;
                                        if (linearLayoutManager != null) {
                                            float f2 = (0.35f * f) + 0.65f;
                                            float f3 = (0.45f * f) + 0.55f;
                                            int A1I = linearLayoutManager.A1I();
                                            for (int A1G = linearLayoutManager.A1G(); A1G <= A1I; A1G++) {
                                                View A0G = linearLayoutManager.A0G(A1G);
                                                if (A0G != null) {
                                                    A0G.setScaleX(f2);
                                                    A0G.setScaleY(f2);
                                                    if (A1G == c48702Gi3.A02 && (findViewById = A0G.findViewById(R.id.selection_check)) != null) {
                                                        findViewById.setScaleX(f3);
                                                        findViewById.setScaleY(f3);
                                                    }
                                                }
                                            }
                                        }
                                        float f4 = 1.0f - (f * c48702Gi3.A00);
                                        c48702Gi3.A07.setScaleX(f4);
                                        c48702Gi3.A07.setScaleY(f4);
                                        C48742Gm c48742Gm2 = c48702Gi3.A0A;
                                        c48742Gm2.A0G.setScaleX(f4);
                                        c48742Gm2.A0G.setScaleY(f4);
                                    }

                                    /* JADX WARN: Code restructure failed: missing block: B:63:0x0037, code lost:
                                        if (r2.A08() != false) goto L22;
                                     */
                                    @Override // X.AbstractC08940cM
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                                    */
                                    public void A01(android.view.View r8, int r9) {
                                        /*
                                            r7 = this;
                                            r5 = 4
                                            r6 = 1
                                            r4 = 0
                                            if (r9 != r5) goto L52
                                            X.2Gi r2 = r1
                                            r2.A01 = r9
                                            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A09
                                            int r0 = r0.A0I()
                                            int r1 = r8.getTop()
                                            int r1 = r1 + r0
                                            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.A0P
                                            int r0 = r0.getHeight()
                                            if (r1 != r0) goto L2a
                                            X.2Gj r0 = r2.A0U
                                            r0.A00()
                                            androidx.recyclerview.widget.RecyclerView r0 = r2.A0Q
                                            r0.setVisibility(r5)
                                            r2.A0G = r6
                                            r2.A0I = r4
                                        L2a:
                                            X.2Gi r2 = r1
                                            boolean r0 = r2.A07()
                                            if (r0 != 0) goto L39
                                            boolean r1 = r2.A08()
                                            r0 = 0
                                            if (r1 == 0) goto L3a
                                        L39:
                                            r0 = 1
                                        L3a:
                                            if (r0 == 0) goto L45
                                            boolean r0 = r2.A0F
                                            if (r0 == 0) goto L46
                                            r2.A01()
                                            r2.A0F = r4
                                        L45:
                                            return
                                        L46:
                                            boolean r0 = r2.A0D
                                            if (r0 == 0) goto L45
                                            boolean r0 = r2.A0E
                                            r2.A06(r0)
                                            r2.A0D = r4
                                            return
                                        L52:
                                            r0 = 3
                                            if (r9 != r0) goto L9e
                                            X.2Gi r5 = r1
                                            r5.A01 = r9
                                            X.2Gl r0 = r5.A0B
                                            if (r0 == 0) goto L60
                                            r0.A0G(r6)
                                        L60:
                                            int r1 = r8.getTop()
                                            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r5.A0P
                                            int r0 = r0.getTop()
                                            if (r1 != r0) goto L9b
                                            X.2Gj r0 = r5.A0U
                                            r0.A01()
                                            X.00h r3 = r5.A0S
                                            android.content.SharedPreferences r0 = r3.A00
                                            java.lang.String r2 = "filter_dismissal_amount"
                                            int r1 = r0.getInt(r2, r4)
                                            r0 = 5
                                            if (r1 > r0) goto L82
                                            int r1 = r1 + r6
                                            X.C000200d.A0g(r3, r2, r1)
                                        L82:
                                            r5.A0H = r4
                                        L84:
                                            androidx.recyclerview.widget.RecyclerView r0 = r5.A0Q
                                            r0.setVisibility(r4)
                                            X.0SV r1 = r0.A0S
                                            if (r1 == 0) goto L2a
                                            int r0 = r5.A02
                                            android.view.View r1 = r1.A0G(r0)
                                            if (r1 == 0) goto L2a
                                            r0 = 8
                                            r1.sendAccessibilityEvent(r0)
                                            goto L2a
                                        L9b:
                                            r5.A0H = r6
                                            goto L84
                                        L9e:
                                            if (r9 != r6) goto L2a
                                            X.2Gi r3 = r1
                                            androidx.recyclerview.widget.RecyclerView r2 = r3.A0Q
                                            int r0 = r2.getVisibility()
                                            if (r0 != r5) goto Lcc
                                            X.2Gj r0 = r3.A0U
                                            com.whatsapp.mediacomposer.MediaComposerFragment r0 = r0.A00
                                            X.2EN r0 = r0.A0y()
                                            if (r0 == 0) goto Lb7
                                            r0.AKS()
                                        Lb7:
                                            r3.A0I = r4
                                            X.2Gl r0 = r3.A0B
                                            if (r0 != 0) goto Lc7
                                            android.os.Handler r1 = r3.A0M
                                            java.lang.Runnable r0 = r3.A0W
                                            r1.removeCallbacks(r0)
                                            r0.run()
                                        Lc7:
                                            r2.setVisibility(r4)
                                            goto L2a
                                        Lcc:
                                            X.2Gj r0 = r3.A0U
                                            com.whatsapp.mediacomposer.MediaComposerFragment r0 = r0.A00
                                            X.2EN r0 = r0.A0y()
                                            if (r0 == 0) goto Lb7
                                            r0.AKT()
                                            goto Lb7
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: X.C68023Ht.A01(android.view.View, int):void");
                                    }
                                };
                                c48702Gi2.A08 = abstractC08940cM;
                                bottomSheetBehavior.A0E = abstractC08940cM;
                                if (bottomSheetBehavior.A0B == 3) {
                                    abstractC08940cM.A01(c48702Gi2.A0N, 3);
                                }
                                c48702Gi2.A0P.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.30p
                                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                    public void onGlobalLayout() {
                                        C48702Gi c48702Gi3 = c48702Gi2;
                                        c48702Gi3.A0P.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                                        C48702Gi.A00(c48702Gi3);
                                    }
                                });
                            }
                            C67723Gp c67723Gp = this.A0g;
                            if (c67723Gp.A0B.A09()) {
                                TextView textView = c67723Gp.A0D.A08;
                                if (textView.getVisibility() != 0) {
                                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
                                    translateAnimation.setDuration(1L);
                                    AnimationSet animationSet = new AnimationSet(false);
                                    animationSet.addAnimation(C000200d.A03(0.0f, 1.0f, 300L));
                                    animationSet.addAnimation(translateAnimation);
                                    textView.startAnimation(animationSet);
                                }
                                c67723Gp.A04();
                            }
                        }
                    }
                    this.A0j.A0B.setCropToolVisibility(0);
                } else if (A1Q instanceof GifComposerFragment) {
                    this.A0j.A0B.setCropToolVisibility(8);
                    TextView textView2 = this.A0g.A0D.A08;
                    textView2.clearAnimation();
                    textView2.setVisibility(8);
                } else if (A1Q instanceof VideoComposerFragment) {
                    A1Q.A12();
                    this.A0j.A0B.setCropToolVisibility(8);
                    TextView textView3 = this.A0g.A0D.A08;
                    textView3.clearAnimation();
                    textView3.setVisibility(8);
                } else {
                    StringBuilder A0P = C000200d.A0P("Unhandled fragment instance type ");
                    A0P.append(A1Q.getClass().getSimpleName());
                    Log.w(A0P.toString());
                }
                if (A1Q instanceof VideoComposerFragment) {
                    VideoComposerFragment videoComposerFragment = (VideoComposerFragment) A1Q;
                    if (videoComposerFragment.A0X) {
                        videoComposerFragment.A11();
                    }
                } else if (!(A1Q instanceof ImageComposerFragment)) {
                    if (A1Q instanceof GifComposerFragment) {
                        A1Q.A11();
                    }
                } else {
                    C48702Gi c48702Gi3 = ((ImageComposerFragment) A1Q).A09;
                    if (!c48702Gi3.A0C) {
                        c48702Gi3.A04();
                    }
                    C48732Gl c48732Gl = c48702Gi3.A0B;
                    if (c48732Gl == null) {
                        c48702Gi3.A0M.postDelayed(c48702Gi3.A0W, 500L);
                    } else {
                        ((AbstractC04890Mh) c48732Gl).A01.A00();
                    }
                }
            }
            Uri A03 = this.A0d.A03();
            C2Gx c2Gx = this.A17;
            if (A03 != null) {
                C42611w2 A01 = c2Gx.A01(A03);
                SpannableStringBuilder spannableStringBuilder = null;
                if (A01.A07() != null) {
                    spannableStringBuilder = new SpannableStringBuilder(A01.A07());
                    this.A0k.A03(this, spannableStringBuilder, AnonymousClass029.A0y(A01.A09()), true);
                }
                this.A0g.A07(spannableStringBuilder, true);
                return;
            }
            throw null;
        }
    }

    public final void A1Z(long j) {
        if (this.A0z && !this.A10 && this.A0v) {
            this.A10 = true;
            C018508q c018508q = this.A07;
            c018508q.A02.postDelayed(new RunnableEBaseShape4S0100000_I0_4(this, 0), j);
        }
    }

    public final void A1a(Uri uri) {
        C48822Gw c48822Gw = this.A0d;
        c48822Gw.A08.remove(uri);
        c48822Gw.A05();
        Object remove = this.A17.A00.remove(uri);
        if (remove != null) {
            this.A1C.add(remove);
        }
        this.A0f.A04();
        ((AbstractC04890Mh) this.A0g.A03).A01.A00();
        if (this.A0d.A04().isEmpty()) {
            finish();
            return;
        }
        if (this.A0d.A01() >= 0) {
            AJW();
            AKR(0.0f);
            this.A0Y.setCurrentItem(this.A0d.A01());
            A1Y(this.A0d.A01());
        }
        this.A0g.A06();
    }

    public final void A1b(C0JH c0jh, Uri uri) {
        if (uri != null) {
            c0jh.A04(uri.toString());
            StringBuilder sb = new StringBuilder();
            sb.append(uri.toString());
            sb.append("-thumb");
            c0jh.A04(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(uri.toString());
            sb2.append("-filter");
            c0jh.A04(sb2.toString());
            C06F c06f = this.A16;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(uri.toString());
            sb3.append("-thumb");
            c06f.A05(sb3.toString());
        }
    }

    @Override // X.C2EN
    public boolean A5v(Uri uri) {
        boolean z;
        C42611w2 A01 = this.A17.A01(uri);
        synchronized (A01) {
            z = A01.A0C;
        }
        return z;
    }

    @Override // X.C2EN
    public Uri A8M() {
        if (C2HC.A00) {
            return (Uri) getIntent().getParcelableExtra("animate_uri");
        }
        return null;
    }

    @Override // X.C2EN
    public File A9H(Uri uri) {
        return this.A17.A01(uri).A03();
    }

    @Override // X.C2EN
    public Rect A9I(Uri uri) {
        Rect rect;
        C42611w2 A01 = this.A17.A01(uri);
        synchronized (A01) {
            rect = A01.A03;
        }
        return rect;
    }

    @Override // X.C2EN
    public String A9p(Uri uri) {
        return this.A17.A01(uri).A08();
    }

    @Override // X.C2EN
    public String A9s(Uri uri) {
        String str;
        C42611w2 A01 = this.A17.A01(uri);
        synchronized (A01) {
            str = A01.A0A;
        }
        return str;
    }

    @Override // X.C2EN
    public File AAB(Uri uri) {
        return this.A17.A01(uri).A05();
    }

    @Override // X.C2EN
    public int AAE(Uri uri) {
        return this.A17.A01(uri).A00();
    }

    @Override // X.C2EN
    public List AAl() {
        return (List) this.A0d.A00.A01();
    }

    @Override // X.C2EN
    public C52132a7 ABC() {
        return this.A0X;
    }

    @Override // X.C2EN
    public int ACv(Uri uri) {
        return this.A17.A01(uri).A01();
    }

    @Override // X.C2EN
    public boolean AD2(Uri uri) {
        return this.A17.A01(uri).A0D();
    }

    @Override // X.C2EN
    public C48752Gn ADW() {
        return this.A0j;
    }

    @Override // X.C2EN
    public Point ADc(Uri uri) {
        return this.A17.A01(uri).A02();
    }

    @Override // X.C2EN
    public C72653aN ADp(Uri uri) {
        C72653aN c72653aN;
        C42611w2 A01 = this.A17.A01(uri);
        synchronized (A01) {
            c72653aN = A01.A04;
        }
        return c72653aN;
    }

    @Override // X.C2EN
    public void AJV() {
        this.A0g.A02();
        this.A0g.A03();
    }

    @Override // X.C2EN
    public void AJW() {
        A1b(this.A0C.A03(), this.A0d.A03());
        A1S();
        ((AbstractC04890Mh) this.A0g.A03).A01.A00();
        this.A0g.A00();
        if (((Number) this.A0d.A03.A01()).intValue() != 1) {
            this.A0g.A01();
        }
    }

    @Override // X.C2EN
    public void AKP() {
        AKR(0.0f);
        this.A0g.A08(true);
        if (!this.A0x) {
            this.A0g.A06();
        } else {
            this.A0x = false;
        }
    }

    @Override // X.C2EN
    public void AKQ() {
        AKR(1.0f);
        this.A0g.A08(false);
        this.A0g.A05();
    }

    @Override // X.C2EN
    public void AKR(float f) {
        float f2 = 1.0f - f;
        C67723Gp c67723Gp = this.A0g;
        c67723Gp.A0D.A09.setAlpha(f2);
        BottomBarView bottomBarView = c67723Gp.A0D;
        bottomBarView.A07.setAlpha(f2);
        bottomBarView.getCaptionAndPrivacyLayout().setAlpha(f2);
        bottomBarView.A06.setAlpha(f2);
        bottomBarView.A0B.setAlpha(f2);
        if (c67723Gp.A0B.A09()) {
            bottomBarView.A08.setAlpha(f2);
        }
    }

    @Override // X.C2EN
    public void AKS() {
        this.A0g.A08(false);
        this.A0g.A06();
    }

    @Override // X.C2EN
    public void AKT() {
        this.A0g.A08(false);
        this.A0g.A06();
    }

    @Override // X.C2EO
    public void AP2() {
        A1V();
    }

    @Override // X.C2EN
    public void APg(boolean z) {
        this.A0x = z;
    }

    @Override // X.C2EN
    public void ASv(Uri uri, File file, Rect rect, int i) {
        C42611w2 A01 = this.A17.A01(uri);
        synchronized (A01) {
            A01.A03 = rect;
        }
        synchronized (A01) {
            A01.A01 = i;
        }
        synchronized (A01) {
            A01.A05 = file;
        }
        A1b(this.A0C.A03(), uri);
        ((AbstractC04890Mh) this.A0g.A03).A01.A00();
    }

    @Override // X.C2EN
    public void AT2(Uri uri, int i) {
        C42611w2 A01 = this.A17.A01(uri);
        synchronized (A01) {
            A01.A00 = i;
        }
    }

    @Override // X.C2EN
    public void ATO(Uri uri, boolean z) {
        C42611w2 A01 = this.A17.A01(uri);
        synchronized (A01) {
            A01.A0D = z;
        }
    }

    @Override // X.C2EN
    public void ATs(Uri uri, boolean z) {
        C48822Gw c48822Gw = this.A0d;
        Uri A03 = c48822Gw.A03();
        if (A03 != null) {
            C42611w2 A01 = c48822Gw.A05.A01(A03);
            synchronized (A01) {
                A01.A0E = z;
            }
            c48822Gw.A08(c48822Gw.A02());
        }
    }

    @Override // X.C2EN
    public void AU5(Uri uri, long j, long j2) {
        C42611w2 A01 = this.A17.A01(uri);
        Point point = new Point((int) j, (int) j2);
        synchronized (A01) {
            A01.A02 = point;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b4, code lost:
        if (r8 != 100) goto L28;
     */
    @Override // X.ActivityC02290Ap, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerActivity.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            C48822Gw c48822Gw = this.A0d;
            List A0F = C003101m.A0F(AbstractC005302j.class, intent.getStringArrayListExtra("jids"));
            List list = c48822Gw.A07;
            list.clear();
            list.addAll(A0F);
            c48822Gw.A00.A0B(Collections.unmodifiableList(list));
            A1V();
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        A1U();
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0195, code lost:
        if (getIntent().getBooleanExtra("smb_send_product", false) != false) goto L120;
     */
    @Override // X.C2EM, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r37) {
        /*
            Method dump skipped, instructions count: 1396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        int intExtra;
        if (this.A0Y != null) {
            for (int i = 0; i < this.A0Y.getChildCount(); i++) {
                View childAt = this.A0Y.getChildAt(i);
                if (childAt instanceof FrameLayout) {
                    int i2 = 0;
                    while (true) {
                        ViewGroup viewGroup = (ViewGroup) childAt;
                        if (i2 < viewGroup.getChildCount()) {
                            View childAt2 = viewGroup.getChildAt(i2);
                            if (childAt2 instanceof PhotoView) {
                                ((PhotoView) childAt2).A01();
                            }
                            i2++;
                        }
                    }
                }
            }
        }
        if (this.A00 == -1 || (intExtra = getIntent().getIntExtra("origin", 1)) == 5 || intExtra == 8 || intExtra == 9 || intExtra == 23 || intExtra == 22 || intExtra == 24 || intExtra == 25 || intExtra == 29) {
            this.A0C.A03().A00.A07(-1);
        }
        this.A0u.AS1(new RunnableEBaseShape3S0100000_I0_3(this.A0K, 47));
        super.onDestroy();
        C79443lf c79443lf = this.A0q;
        if (c79443lf != null) {
            c79443lf.A05(true);
            this.A0q = null;
        }
        C67723Gp c67723Gp = this.A0g;
        if (c67723Gp != null) {
            C67753Gs c67753Gs = c67723Gp.A03;
            for (C67763Gt c67763Gt : c67753Gs.A0D) {
                c67753Gs.A06.A01(c67763Gt);
                c67763Gt.A09.set(true);
            }
            c67753Gs.A0D.clear();
            c67723Gp.A03 = null;
            this.A0g = null;
        }
        C52132a7 c52132a7 = this.A0X;
        if (c52132a7 != null) {
            c52132a7.A00();
            this.A0X = null;
        }
        C2OK c2ok = this.A0i;
        synchronized (c2ok) {
            c2ok.A05.clear();
        }
        this.A07.A02.removeCallbacks(this.A19);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A1U();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("uris", new ArrayList<>(this.A0d.A04()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.A0d.A04()) {
            arrayList.add(this.A1B.get(obj));
        }
        bundle.putSerializable("ids", arrayList);
        bundle.putInt("position", this.A0d.A01());
        C2Gx c2Gx = this.A17;
        if (c2Gx != null) {
            Bundle bundle2 = new Bundle();
            c2Gx.A03(bundle2);
            bundle.putBundle("media_preview_params", bundle2);
            bundle.putBoolean("optimistic_started", this.A10);
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        this.A0v = true;
        A1Y(this.A0d.A01());
        if (this.A03.A01() != null || this.A12 || this.A0f == null || !this.A0N.A06()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Uri uri : this.A0d.A04()) {
            File A04 = this.A17.A01(uri).A04();
            if (A04 == null || !A04.exists()) {
                arrayList.add(uri);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        this.A07.A0E(this.A0O.A0A(R.plurals.file_was_removed, size, Integer.valueOf(size)), 1);
        if (size == this.A0d.A04().size()) {
            finish();
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A1a((Uri) it.next());
        }
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        super.onStop();
        this.A0v = false;
        if (this.A12) {
            return;
        }
        A1R();
    }
}
