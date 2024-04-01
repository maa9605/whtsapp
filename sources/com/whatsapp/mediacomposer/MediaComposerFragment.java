package com.whatsapp.mediacomposer;

import X.AbstractC02800Cx;
import X.ActivityC02330At;
import X.C000500h;
import X.C002301c;
import X.C003701t;
import X.C007203d;
import X.C018508q;
import X.C01C;
import X.C02E;
import X.C2AS;
import X.C2Bk;
import X.C2EN;
import X.C2HL;
import X.C2IP;
import X.C2K0;
import X.C2MB;
import X.C2OK;
import X.C30K;
import X.C3L0;
import X.C3L1;
import X.C3La;
import X.C40081rY;
import X.C41471ty;
import X.C43791xz;
import X.C43811y1;
import X.C48742Gm;
import X.C48752Gn;
import X.C48792Gs;
import X.C53292cG;
import X.InterfaceC002901k;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.search.verification.client.R;
import com.whatsapp.ClearableEditText;
import com.whatsapp.ephemeral.ViewOnceNUXDialog;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.doodle.ColorPickerView;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public abstract class MediaComposerFragment extends Hilt_MediaComposerFragment {
    public Uri A00;
    public C018508q A01;
    public C02E A02;
    public C000500h A03;
    public C002301c A04;
    public C40081rY A05;
    public C003701t A06;
    public C41471ty A07;
    public C48792Gs A08;
    public C43811y1 A09;
    public C48742Gm A0A;
    public C2K0 A0B;
    public C2OK A0C;
    public C53292cG A0D;
    public C43791xz A0E;
    public C2Bk A0F;
    public C2AS A0G;
    public C2MB A0H;
    public InterfaceC002901k A0I;
    public final int[] A0J = new int[2];

    @Override // com.whatsapp.base.WaFragment, X.C0BA
    public void A0V(boolean z) {
        try {
            super.A0V(z);
        } catch (NullPointerException e) {
            Log.w("mediacomposerfragment/setUserVisibleHint", e);
        }
    }

    @Override // X.C0BA
    public void A0d(Bundle bundle) {
        this.A0U = true;
        C48742Gm c48742Gm = this.A0A;
        DoodleView doodleView = c48742Gm.A0G;
        if (doodleView != null) {
            ColorPickerView colorPickerView = c48742Gm.A0C.A06;
            doodleView.A04(colorPickerView.A00, colorPickerView.A03);
        }
    }

    @Override // X.C0BA
    public void A0e() {
        this.A0A.A0C.A04(false);
        this.A0U = true;
    }

    @Override // X.C0BA
    public void A0h(int i, int i2, Intent intent) {
        Bundle extras;
        if (i == 2 && i2 == -1 && (extras = intent.getExtras()) != null) {
            String string = extras.getString("locations_string");
            if (TextUtils.isEmpty(string)) {
                string = A0F(R.string.attach_location);
            }
            double d = extras.getDouble("longitude");
            double d2 = extras.getDouble("latitude");
            C3La c3La = new C3La(A0a(), this.A04, false, string);
            c3La.A01 = d;
            c3La.A00 = d2;
            this.A0A.A08(c3La);
        }
    }

    @Override // X.C0BA
    public void A0r() {
        boolean z;
        C48752Gn ADW = ((C2EN) A09()).ADW();
        if (ADW.A02 == this.A08) {
            ADW.A02 = null;
        }
        C48742Gm c48742Gm = this.A0A;
        DoodleView doodleView = c48742Gm.A0G;
        C2HL c2hl = doodleView.A0F;
        Bitmap bitmap = c2hl.A09;
        if (bitmap != null) {
            bitmap.recycle();
            c2hl.A09 = null;
        }
        Bitmap bitmap2 = c2hl.A0A;
        if (bitmap2 != null) {
            bitmap2.recycle();
            c2hl.A0A = null;
        }
        Bitmap bitmap3 = c2hl.A07;
        if (bitmap3 != null) {
            bitmap3.recycle();
            c2hl.A07 = null;
        }
        Bitmap bitmap4 = c2hl.A08;
        if (bitmap4 != null) {
            bitmap4.recycle();
            c2hl.A08 = null;
        }
        ValueAnimator valueAnimator = c2hl.A06;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        doodleView.setEnabled(false);
        C007203d c007203d = c48742Gm.A0Q;
        synchronized (c007203d) {
            z = c007203d.A02 != null;
        }
        if (z) {
            C2IP c2ip = (C2IP) c007203d.get();
            c2ip.A05.quit();
            c2ip.A06.removeMessages(0);
            c2ip.A0l.clear();
            c2ip.A0c.A00 = null;
            if (c2ip.A0o) {
                c2ip.A0f.A00(c2ip.A0e);
            }
        }
        C48752Gn c48752Gn = c48742Gm.A0N;
        if (c48752Gn != null) {
            c48752Gn.A0B.setToolbarExtraVisibility(8);
        }
        this.A0U = true;
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        C48792Gs c3l1;
        this.A00 = (Uri) super.A06.getParcelable("uri");
        if (!(this instanceof VideoComposerFragment)) {
            if (!(this instanceof ImageComposerFragment)) {
                c3l1 = new C48792Gs(this);
            } else {
                c3l1 = new C3L0((ImageComposerFragment) this);
            }
        } else {
            c3l1 = new C3L1((VideoComposerFragment) this);
        }
        this.A08 = c3l1;
        C003701t c003701t = this.A06;
        C2MB c2mb = this.A0H;
        InterfaceC002901k interfaceC002901k = this.A0I;
        C40081rY c40081rY = this.A05;
        C43811y1 c43811y1 = this.A09;
        C2K0 c2k0 = this.A0B;
        C02E c02e = this.A02;
        C002301c c002301c = this.A04;
        C2Bk c2Bk = this.A0F;
        C2AS c2as = this.A0G;
        C53292cG c53292cG = this.A0D;
        C2OK c2ok = this.A0C;
        C43791xz c43791xz = this.A0E;
        ActivityC02330At A09 = A09();
        this.A0A = new C48742Gm(c003701t, c2mb, interfaceC002901k, c40081rY, c43811y1, c2k0, c02e, c002301c, c2Bk, c2as, c53292cG, c2ok, c43791xz, A09, view, c3l1, new C30K() { // from class: X.3GX
            {
                MediaComposerFragment.this = this;
            }

            @Override // X.C30K
            public final void AOc(C2HG c2hg) {
                Class cls;
                MediaComposerFragment mediaComposerFragment = MediaComposerFragment.this;
                if (mediaComposerFragment.A07.A07(mediaComposerFragment.A0a())) {
                    cls = LocationPicker2.class;
                } else {
                    cls = LocationPicker.class;
                }
                Intent intent = new Intent(mediaComposerFragment.A0a(), cls);
                intent.putExtra("sticker_mode", true);
                mediaComposerFragment.A0O(intent, 2, null);
            }
        }, this, ((C2EN) A09).ADW());
    }

    public C2EN A0y() {
        return (C2EN) A09();
    }

    public void A0z() {
        ActivityC02330At A09;
        if (this instanceof VideoComposerFragment) {
            VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this;
            View findViewById = videoComposerFragment.A05().findViewById(R.id.content);
            findViewById.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            findViewById.startAnimation(alphaAnimation);
            videoComposerFragment.A0T.A05().setAlpha(1.0f);
        } else if (!(this instanceof ImageComposerFragment)) {
            if (this instanceof GifComposerFragment) {
                GifComposerFragment gifComposerFragment = (GifComposerFragment) this;
                gifComposerFragment.A05.A05().setAlpha(1.0f);
                gifComposerFragment.A05.A05().setVisibility(0);
            }
        } else {
            ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this;
            imageComposerFragment.A07.setVisibility(0);
            if (imageComposerFragment.A01.A0E(C01C.A1R) && (A09 = imageComposerFragment.A09()) != null && A09.getIntent().getIntExtra("origin", 1) == 29) {
                C48742Gm c48742Gm = ((MediaComposerFragment) imageComposerFragment).A0A;
                if (c48742Gm.A0I.A02) {
                    return;
                }
                c48742Gm.A00();
            }
        }
    }

    public void A10() {
        ActivityC02330At A09;
        if (this instanceof ImageComposerFragment) {
            ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this;
            imageComposerFragment.A07.setVisibility(4);
            if (imageComposerFragment.A01.A0E(C01C.A1R) && (A09 = imageComposerFragment.A09()) != null && A09.getIntent().getIntExtra("origin", 1) == 29) {
                imageComposerFragment.A09.A06(true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0035, code lost:
        if (r4.A0V != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A11() {
        /*
            r5 = this;
            boolean r0 = r5 instanceof com.whatsapp.mediacomposer.VideoComposerFragment
            if (r0 != 0) goto L23
            boolean r0 = r5 instanceof com.whatsapp.mediacomposer.ImageComposerFragment
            if (r0 != 0) goto L22
            r1 = r5
            com.whatsapp.mediacomposer.GifComposerFragment r1 = (com.whatsapp.mediacomposer.GifComposerFragment) r1
            X.2Ge r0 = r1.A05
            r0.A08()
            X.2Gm r0 = r1.A0A
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r0.A0G
            r0.A02()
            X.2Ge r0 = r1.A05
            android.view.View r1 = r0.A05()
            r0 = 1
            r1.setKeepScreenOn(r0)
            return
        L22:
            return
        L23:
            r4 = r5
            com.whatsapp.mediacomposer.VideoComposerFragment r4 = (com.whatsapp.mediacomposer.VideoComposerFragment) r4
            X.0Eg r0 = r4.A0K
            r0.A05()
            X.2Ge r3 = r4.A0T
            boolean r0 = r4.A0X
            r2 = 1
            if (r0 != 0) goto L37
            boolean r1 = r4.A0V
            r0 = 0
            if (r1 == 0) goto L38
        L37:
            r0 = 1
        L38:
            r3.A0B(r0)
            X.2Ge r0 = r4.A0T
            r0.A08()
            X.2Gm r0 = r4.A0A
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r0.A0G
            r0.A02()
            X.2Ge r0 = r4.A0T
            android.view.View r0 = r0.A05()
            r0.setKeepScreenOn(r2)
            X.2Ge r0 = r4.A0T
            android.view.View r0 = r0.A05()
            java.lang.Runnable r3 = r4.A0a
            r0.removeCallbacks(r3)
            X.2Ge r0 = r4.A0T
            android.view.View r2 = r0.A05()
            r0 = 50
            r2.postDelayed(r3, r0)
            r3 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r0 = 200(0xc8, double:9.9E-322)
            android.view.animation.AlphaAnimation r1 = X.C000200d.A03(r3, r2, r0)
            android.view.View r0 = r4.A08
            r0.startAnimation(r1)
            android.view.View r1 = r4.A08
            r0 = 4
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerFragment.A11():void");
    }

    public void A12() {
        if (this instanceof VideoComposerFragment) {
            VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this;
            ImageView imageView = videoComposerFragment.A0C;
            boolean z = videoComposerFragment.A0X;
            int i = R.drawable.ic_gif_off;
            if (z) {
                i = R.drawable.ic_gif_on;
            }
            imageView.setImageResource(i);
            if (videoComposerFragment.A04 - videoComposerFragment.A03 <= 7000 && !videoComposerFragment.A0W) {
                if (videoComposerFragment.A0C.getVisibility() == 8) {
                    videoComposerFragment.A0C.measure(0, 0);
                    TranslateAnimation translateAnimation = new TranslateAnimation(videoComposerFragment.A0C.getMeasuredWidth(), 0.0f, 0.0f, 0.0f);
                    translateAnimation.setDuration(100L);
                    videoComposerFragment.A0C.startAnimation(translateAnimation);
                }
                videoComposerFragment.A0C.setOnClickListener(videoComposerFragment.A06);
                videoComposerFragment.A0C.setVisibility(0);
                return;
            }
            if (videoComposerFragment.A0C.getVisibility() == 0) {
                TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, videoComposerFragment.A0C.getMeasuredWidth(), 0.0f, 0.0f);
                translateAnimation2.setDuration(100L);
                videoComposerFragment.A0C.startAnimation(translateAnimation2);
            }
            videoComposerFragment.A0C.setOnClickListener(null);
            videoComposerFragment.A0C.setVisibility(8);
        }
    }

    public void A13(Rect rect) {
        View findViewById;
        View view = super.A0A;
        if (view == null || (findViewById = view.findViewById(R.id.doodle_decoration)) == null) {
            return;
        }
        findViewById.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void A14(boolean z) {
        int i;
        if (z && A0a() != null) {
            Context A00 = A00();
            C000500h c000500h = this.A03;
            AbstractC02800Cx A0B = A0B();
            if (!A0B.A0r() && (!c000500h.A00.getBoolean("view_once_nux", false)) && A0B.A0Q.A01("view_once_nux") == null) {
                new ViewOnceNUXDialog().A14(A0B, "view_once_nux");
                return;
            }
            C018508q c018508q = this.A01;
            if (this instanceof VideoComposerFragment) {
                i = R.string.view_once_video_sender_info;
            } else if (!(this instanceof ImageComposerFragment)) {
                i = 0;
            } else {
                i = R.string.view_once_photo_sender_info;
            }
            Toast A01 = c018508q.A01(A00.getString(i), 0);
            A01.setGravity(17, 0, 0);
            A01.show();
        }
    }

    public boolean A15() {
        C48742Gm c48742Gm = this.A0A;
        if (c48742Gm.A0A()) {
            C2IP c2ip = (C2IP) c48742Gm.A0Q.get();
            ClearableEditText clearableEditText = c2ip.A0R;
            if (clearableEditText.getVisibility() == 0 && c2ip.A0o) {
                clearableEditText.setText("");
                c2ip.A0B(true);
                c2ip.A0C(false, 200L);
                return true;
            }
            ValueAnimator valueAnimator = c2ip.A04;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                long currentPlayTime = c2ip.A04.getCurrentPlayTime();
                c2ip.A04.cancel();
                c2ip.A0B(true);
                c2ip.A0C(false, currentPlayTime);
                return true;
            }
            c48742Gm.A0N.A06(0);
            c48742Gm.A02();
            return true;
        }
        return false;
    }

    public boolean A16() {
        if (!(this instanceof VideoComposerFragment)) {
            if (this instanceof ImageComposerFragment) {
                return false;
            }
            GifComposerFragment gifComposerFragment = (GifComposerFragment) this;
            boolean A0C = gifComposerFragment.A05.A0C();
            gifComposerFragment.A05.A06();
            DoodleView doodleView = ((MediaComposerFragment) gifComposerFragment).A0A.A0G;
            doodleView.A0F.A0C = false;
            doodleView.invalidate();
            gifComposerFragment.A05.A05().setKeepScreenOn(false);
            return A0C;
        }
        VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this;
        boolean A0C2 = videoComposerFragment.A0T.A0C();
        videoComposerFragment.A0T.A06();
        videoComposerFragment.A02 = videoComposerFragment.A0T.A02();
        DoodleView doodleView2 = ((MediaComposerFragment) videoComposerFragment).A0A.A0G;
        doodleView2.A0F.A0C = false;
        doodleView2.invalidate();
        videoComposerFragment.A0T.A05().setKeepScreenOn(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(200L);
        videoComposerFragment.A08.startAnimation(alphaAnimation);
        videoComposerFragment.A08.setVisibility(0);
        return A0C2;
    }

    @Override // X.C0BA, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        boolean z = true;
        this.A0U = true;
        Context A0a = A0a();
        if (A0a != null) {
            int rotation = ((WindowManager) A0a.getSystemService("window")).getDefaultDisplay().getRotation();
            C48742Gm c48742Gm = this.A0A;
            z = (configuration.orientation != 2 || rotation == 0 || rotation == 180) ? false : false;
            if (c48742Gm.A05 != z) {
                c48742Gm.A05 = z;
                c48742Gm.A04();
            }
        }
    }
}
