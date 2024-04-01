package X;

import X.C29X;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.camera.CameraActivity;
import com.whatsapp.camera.CameraBottomSheetBehavior;
import com.whatsapp.camera.CameraMediaPickerFragment;
import com.whatsapp.camera.DragBottomSheetIndicator;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape8S0100000_I0_0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.29X */
/* loaded from: classes2.dex */
public abstract class C29X {
    public int A00;
    public long A01;
    public long A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public ImageView A0D;
    public ImageView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public RecyclerView A0I;
    public BottomSheetBehavior A0J;
    public CircularProgressBar A0K;
    public ActivityC02290Ap A0L;
    public C52242aI A0M;
    public InterfaceC471629w A0N;
    public CameraMediaPickerFragment A0O;
    public C52112a5 A0P;
    public C52152a9 A0Q;
    public C49072Ii A0R;
    public C2VU A0S;
    public C52132a7 A0U;
    public AbstractC005302j A0V;
    public C011005l A0W;
    public C50692Su A0X;
    public C0HS A0Y;
    public File A0Z;
    public File A0a;
    public String A0b;
    public List A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0i;
    public boolean A0j;
    public boolean A0l;
    public final AbstractC000600i A0p;
    public final C04480Ki A0q;
    public final C012005w A0r;
    public final C018508q A0s;
    public final C03230Ew A0t;
    public final C02L A0u;
    public final C01B A0v;
    public final C011605s A0w;
    public final C2Lp A0x;
    public final C05W A0y;
    public final C42371vd A0z;
    public final AnonymousClass075 A10;
    public final C2L9 A11;
    public final C0E7 A12;
    public final C02E A13;
    public final AnonymousClass012 A14;
    public final C001200o A15;
    public final C02F A16;
    public final C000500h A17;
    public final C002301c A18;
    public final C0CA A19;
    public final C003701t A1A;
    public final AnonymousClass011 A1B;
    public final C05Y A1C;
    public final C41681uL A1D;
    public final C0DW A1E;
    public final C0DV A1F;
    public final C2AQ A1G;
    public final C02O A1H;
    public final C02C A1I;
    public final InterfaceC002901k A1J;
    public final C05480Ox A1L;
    public final C0L6 A1M;
    public boolean A0m = true;
    public boolean A0k = true;
    public final Set A1P = new LinkedHashSet();
    public C2Gx A0T = new C2Gx();
    public final List A1O = new ArrayList();
    public boolean A0h = true;
    public final Handler A0n = new Handler(Looper.getMainLooper()) { // from class: X.2a1
        {
            C29X.this = this;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C29X c29x = C29X.this;
            if (c29x.A0N.AFg()) {
                long currentTimeMillis = System.currentTimeMillis() - c29x.A02;
                c29x.A0G.setText(AnonymousClass029.A0g(c29x.A18, (int) (currentTimeMillis / 1000)));
                c29x.A0n.sendEmptyMessageDelayed(0, 50L);
                File file = c29x.A0a;
                if (file != null) {
                    long length = file.length();
                    boolean A0Z = C003101m.A0Z(c29x.A0V);
                    C01B c01b = c29x.A0v;
                    long A07 = c01b.A07(C01C.A3w) * 1000;
                    AnonymousClass039 anonymousClass039 = C01C.A3Y;
                    if (length > c01b.A07(anonymousClass039) * 1048576 || (A0Z && currentTimeMillis >= A07)) {
                        c29x.A0Q(true);
                    } else {
                        int A072 = (int) ((length * 100) / (c01b.A07(anonymousClass039) * 1048576));
                        if (A0Z) {
                            A072 = Math.max(A072, (int) ((currentTimeMillis * 100) / A07));
                        }
                        c29x.A0K.setProgress(A072);
                    }
                }
                c29x.A0A.setVisibility(0);
                return;
            }
            c29x.A0A.setVisibility(8);
        }
    };
    public final Handler A0o = new Handler(Looper.getMainLooper()) { // from class: X.2a2
        {
            C29X.this = this;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C29X c29x = C29X.this;
            if (!c29x.A0N.AFK() || c29x.A0N.AFg() || c29x.A0L.AFE()) {
                return;
            }
            c29x.A0A();
        }
    };
    public final C05490Oy A1K = new C05490Oy() { // from class: X.2a3
        {
            C29X.this = this;
        }

        @Override // X.C05490Oy
        public void A00() {
            Log.i("CameraUi/onShowingIncomingCallUI");
            C29X c29x = C29X.this;
            if (c29x.A0T()) {
                c29x.A0j = false;
                c29x.A0Q(System.currentTimeMillis() - c29x.A02 > 1000);
            }
        }
    };
    public final Runnable A1N = new RunnableEBaseShape1S0100000_I0_1(this, 8);

    public C29X(C001200o c001200o, AnonymousClass012 anonymousClass012, C011605s c011605s, C003701t c003701t, C018508q c018508q, AbstractC000600i abstractC000600i, C02L c02l, InterfaceC002901k interfaceC002901k, C012005w c012005w, AnonymousClass011 anonymousClass011, C01B c01b, C03230Ew c03230Ew, C05480Ox c05480Ox, C05Y c05y, C0L6 c0l6, C05W c05w, C02E c02e, C002301c c002301c, C04480Ki c04480Ki, C0DV c0dv, C2L9 c2l9, C2AQ c2aq, C0E7 c0e7, AnonymousClass075 anonymousClass075, C02F c02f, C000500h c000500h, C0CA c0ca, C02C c02c, C0DW c0dw, C41681uL c41681uL, C2Lp c2Lp, C02O c02o, C42371vd c42371vd) {
        this.A15 = c001200o;
        this.A14 = anonymousClass012;
        this.A0w = c011605s;
        this.A1A = c003701t;
        this.A0s = c018508q;
        this.A0p = abstractC000600i;
        this.A0u = c02l;
        this.A1J = interfaceC002901k;
        this.A0r = c012005w;
        this.A1B = anonymousClass011;
        this.A0v = c01b;
        this.A0t = c03230Ew;
        this.A1L = c05480Ox;
        this.A1C = c05y;
        this.A1M = c0l6;
        this.A0y = c05w;
        this.A13 = c02e;
        this.A18 = c002301c;
        this.A0q = c04480Ki;
        this.A1F = c0dv;
        this.A11 = c2l9;
        this.A1G = c2aq;
        this.A12 = c0e7;
        this.A10 = anonymousClass075;
        this.A16 = c02f;
        this.A17 = c000500h;
        this.A19 = c0ca;
        this.A1I = c02c;
        this.A1E = c0dw;
        this.A1D = c41681uL;
        this.A0x = c2Lp;
        this.A1H = c02o;
        this.A0z = c42371vd;
    }

    public static void A00(C29X c29x, InterfaceC52102a4 interfaceC52102a4) {
        if (interfaceC52102a4 != null) {
            Uri A88 = interfaceC52102a4.A88();
            Set set = c29x.A1P;
            if (set.contains(A88)) {
                set.remove(A88);
                c29x.A0T.A00.remove(A88);
            } else if (set.size() < 30) {
                set.add(A88);
                c29x.A0T.A04(new C42611w2(A88));
            } else {
                c29x.A0s.A0E(C42041uv.A04(c29x.A0L, 30), 0);
            }
            if (!set.isEmpty()) {
                c29x.A09();
            }
            c29x.A0O(!set.isEmpty());
            ((AbstractC04890Mh) c29x.A0P).A01.A00();
        }
    }

    public int A01() {
        return ((C52122a6) this).A00.getIntent().getIntExtra("origin", 1);
    }

    public void A02() {
        ((C52122a6) this).A00.finish();
    }

    public void A03() {
        if (A0S()) {
            C0HS c0hs = this.A0Y;
            if (c0hs != null) {
                c0hs.A05(true);
                this.A0Y = null;
            }
            C52132a7 c52132a7 = this.A0U;
            if (c52132a7 != null) {
                c52132a7.A00();
                this.A0U = null;
            }
            this.A0n.removeMessages(0);
            this.A0o.removeMessages(0);
            this.A1L.A00(this.A1K);
            C52112a5 c52112a5 = this.A0P;
            InterfaceC52142a8 interfaceC52142a8 = c52112a5.A00;
            if (interfaceC52142a8 != null) {
                interfaceC52142a8.close();
                c52112a5.A00 = null;
            }
        }
    }

    public void A04() {
        if (A0S()) {
            if (this.A0N.AFg()) {
                A0Q(System.currentTimeMillis() - this.A02 > 1000);
            }
            if (this.A07.getVisibility() == 0) {
                this.A07.setVisibility(8);
                this.A0E.setEnabled(false);
            }
            this.A0N.pause();
            C52152a9 c52152a9 = this.A0Q;
            if (c52152a9 != null) {
                c52152a9.disable();
            }
        }
    }

    public void A05() {
        if (A0S() && this.A0e) {
            this.A0N.ARs();
            if (this.A07.getVisibility() == 8) {
                this.A07.setVisibility(0);
            }
            C52152a9 c52152a9 = this.A0Q;
            if (c52152a9 != null) {
                c52152a9.enable();
            }
        }
    }

    public void A06() {
        CameraActivity cameraActivity = ((C52122a6) this).A00;
        cameraActivity.setResult(-1);
        cameraActivity.finish();
    }

    public void A07() {
        C0HS c0hs = this.A0Y;
        if (c0hs != null) {
            c0hs.A05(true);
        }
        C0HS c0hs2 = new C0HS(this.A15, this, this.A0p, this.A0v, this.A1G, this.A16, this.A1I) { // from class: X.2aA
            public final AbstractC000600i A00;
            public final C01B A01;
            public final C001200o A02;
            public final C02F A03;
            public final C2AQ A04;
            public final C02C A05;
            public final WeakReference A06;

            {
                this.A02 = r2;
                this.A06 = new WeakReference(this);
                this.A00 = r4;
                this.A01 = r5;
                this.A04 = r6;
                this.A03 = r7;
                this.A05 = r8;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                C61112vc c61112vc = new C61112vc();
                c61112vc.A01 = 2;
                c61112vc.A00 = 7;
                c61112vc.A02 = 2;
                c61112vc.A03 = null;
                InterfaceC52142a8 A00 = C61122vd.A00(this.A02, this.A00, this.A01, this.A04, this.A03, this.A05, c61112vc);
                if (A04()) {
                    A00.close();
                    return null;
                }
                return A00;
            }

            /* JADX WARN: Code restructure failed: missing block: B:46:0x0047, code lost:
                if (X.C61122vd.A01(r0) == false) goto L23;
             */
            @Override // X.C0HS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A09(java.lang.Object r6) {
                /*
                    r5 = this;
                    X.2a8 r6 = (X.InterfaceC52142a8) r6
                    java.lang.ref.WeakReference r0 = r5.A06
                    java.lang.Object r4 = r0.get()
                    X.29X r4 = (X.C29X) r4
                    if (r4 == 0) goto L4d
                    boolean r0 = r4.A0e
                    if (r0 == 0) goto L4d
                    r3 = 0
                    if (r6 == 0) goto L34
                    X.2a5 r1 = r4.A0P
                    X.2a8 r0 = r1.A00
                    if (r0 == 0) goto L1f
                    r0.close()
                    r0 = 0
                    r1.A00 = r0
                L1f:
                    r1.A00 = r6
                    X.0S7 r0 = r1.A01
                    r0.A00()
                    android.view.View r2 = r4.A08
                    boolean r1 = r4.A0W()
                    r0 = 8
                    if (r1 == 0) goto L31
                    r0 = 0
                L31:
                    r2.setVisibility(r0)
                L34:
                    com.whatsapp.camera.CameraMediaPickerFragment r2 = r4.A0O
                    X.0At r0 = r2.A09()
                    if (r0 == 0) goto L49
                    android.content.ContentResolver r0 = r0.getContentResolver()
                    if (r0 == 0) goto L49
                    boolean r0 = X.C61122vd.A01(r0)
                    r1 = 1
                    if (r0 != 0) goto L4a
                L49:
                    r1 = 0
                L4a:
                    r2.A16(r3, r1)
                L4d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C52162aA.A09(java.lang.Object):void");
            }
        };
        this.A0Y = c0hs2;
        this.A1J.ARy(c0hs2, new Void[0]);
    }

    public void A08() {
        if (A0S()) {
            if (Build.MANUFACTURER.equals("OnePlus")) {
                String str = Build.MODEL;
                if ((str.equals("ONEPLUS A3000") || str.equals("ONEPLUS A3003") || str.equals("ONEPLUS A3010")) && this.A1M.A04()) {
                    this.A0s.A07(R.string.error_camera_disabled_during_video_call, 1);
                    A02();
                    return;
                }
            }
            this.A0e = true;
            C2Lp c2Lp = this.A0x;
            if (c2Lp != null) {
                c2Lp.A02 = SystemClock.elapsedRealtime();
                this.A0N.ARs();
                this.A07.removeCallbacks(this.A1N);
                this.A05.setVisibility(0);
                if (this.A07.getVisibility() == 0) {
                    this.A06.setVisibility(8);
                } else {
                    this.A07.setVisibility(0);
                }
                A0P(true);
                return;
            }
            throw null;
        }
        throw new IllegalStateException("need to call onCreate first");
    }

    public final void A09() {
        ActivityC02290Ap activityC02290Ap = this.A0L;
        if (activityC02290Ap != null) {
            C02E c02e = this.A13;
            C002301c c002301c = this.A18;
            Set set = this.A1P;
            AnonymousClass088.A1C(activityC02290Ap, c02e, c002301c.A0A(R.plurals.n_items_selected, set.size(), Integer.valueOf(set.size())));
        }
    }

    public final void A0A() {
        int i;
        int i2;
        Log.i("cameraui/startvideocapture");
        if (this.A1P.size() >= 30) {
            this.A0s.A0E(C42041uv.A04(this.A0L, 30), 0);
        } else if (!this.A1M.A04()) {
            this.A0a = C02180Ae.A0d(this.A0L, this.A0r, this.A1H, C0DC.A0N, ".mp4", this.A1A.A0C(401) ? 4 : 1);
            int rotation = this.A0L.getWindowManager().getDefaultDisplay().getRotation();
            int i3 = this.A0L.getResources().getConfiguration().orientation;
            if (i3 != 1) {
                if (i3 == 2) {
                    if (rotation != 0 && rotation != 1) {
                        this.A0L.setRequestedOrientation(8);
                    } else {
                        this.A0L.setRequestedOrientation(0);
                    }
                }
            } else if (rotation != 0 && rotation != 1) {
                this.A0L.setRequestedOrientation(9);
            } else {
                this.A0L.setRequestedOrientation(1);
            }
            if (this.A0Q != null && Settings.System.getInt(this.A0L.getContentResolver(), "accelerometer_rotation", 0) == 0 && (i2 = this.A0Q.A00) != -1) {
                i = ((i2 - ((4 - rotation) % 4)) * 90) % 360;
                if (i < 0) {
                    i += 360;
                }
            } else {
                i = 0;
            }
            if (this.A0N.AGa()) {
                A0D(-855638017);
            }
            this.A07.setKeepScreenOn(true);
            C2Lp c2Lp = this.A0x;
            if (c2Lp != null) {
                c2Lp.A05 = SystemClock.elapsedRealtime();
                InterfaceC471629w interfaceC471629w = this.A0N;
                File file = this.A0a;
                if (interfaceC471629w.AFI()) {
                    i = 360 - i;
                }
                interfaceC471629w.AV4(file, i);
                this.A0n.sendEmptyMessage(0);
                this.A0K.setProgress(0);
                this.A0A.setVisibility(0);
                this.A0F.setVisibility(8);
                this.A0m = false;
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(200L);
                this.A0C.startAnimation(scaleAnimation);
                this.A0C.setVisibility(8);
                ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation2.setDuration(200L);
                this.A0D.startAnimation(scaleAnimation2);
                this.A0D.setVisibility(8);
                A0P(false);
                this.A02 = System.currentTimeMillis();
                return;
            }
            throw null;
        } else {
            this.A0s.A07(R.string.error_camera_disabled_during_video_call, 1);
            A02();
        }
    }

    public final void A0B() {
        Log.i("cameraui/takepicture");
        Set set = this.A1P;
        if (set.size() >= 30) {
            this.A0s.A0E(C42041uv.A04(this.A0L, 30), 0);
            return;
        }
        C2Lp c2Lp = this.A0x;
        if (c2Lp != null) {
            c2Lp.A00 = SystemClock.elapsedRealtime();
            this.A0E.setEnabled(false);
            this.A0C.setEnabled(false);
            this.A0D.setEnabled(false);
            if (set.isEmpty()) {
                if (this.A03.getVisibility() == 0) {
                    this.A03.startAnimation(C000200d.A03(1.0f, 0.0f, 150L));
                    this.A03.setVisibility(8);
                }
                this.A0k = false;
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(150L);
                this.A0C.startAnimation(scaleAnimation);
                this.A0C.setVisibility(8);
                ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation2.setDuration(150L);
                this.A0D.startAnimation(scaleAnimation2);
                this.A0D.setVisibility(8);
            }
            if (this.A0N.AGa()) {
                A0D(-3886);
                this.A07.postDelayed(new RunnableEBaseShape1S0100000_I0_1(this, 4), 300L);
                return;
            }
            this.A0N.AVO(new C471729x(this), set.size() > 0);
            return;
        }
        throw null;
    }

    public final void A0C() {
        if (this.A0N.getFlashModes().size() <= 1) {
            this.A0D.setVisibility(8);
            return;
        }
        this.A0D.setVisibility(0);
        A0J(this.A0N.getFlashMode());
    }

    public final void A0D(int i) {
        View findViewById = this.A0L.findViewById(R.id.fake_flash);
        if ((findViewById.getVisibility() == 0) == (i != 0)) {
            return;
        }
        WindowManager.LayoutParams attributes = this.A0L.getWindow().getAttributes();
        if (i != 0) {
            findViewById.setVisibility(0);
            findViewById.setBackgroundColor(i);
            attributes.screenBrightness = 1.0f;
        } else {
            findViewById.setVisibility(4);
            attributes.screenBrightness = -1.0f;
        }
        this.A0L.getWindow().setAttributes(attributes);
    }

    public void A0E(long j) {
        if (A0S()) {
            C50692Su c50692Su = this.A0X;
            AbstractC52172aB abstractC52172aB = ((AbstractC50702Sv) c50692Su).A00;
            if (abstractC52172aB != null) {
                abstractC52172aB.A00();
                ((AbstractC50702Sv) c50692Su).A00 = null;
            }
            this.A0N.A6C();
            boolean z = false;
            this.A0e = false;
            this.A0J.A0O(4);
            View view = this.A07;
            Runnable runnable = this.A1N;
            view.removeCallbacks(runnable);
            if (this.A07.getVisibility() != 4) {
                if (j == 0) {
                    this.A07.setVisibility(4);
                } else {
                    this.A07.postDelayed(runnable, j);
                }
            }
            this.A06.setVisibility(0);
            this.A0N.pause();
            Set set = this.A1P;
            z = (set.isEmpty() && this.A1O.isEmpty()) ? true : true;
            this.A0T = new C2Gx();
            set.clear();
            List<InterfaceC52182aC> list = this.A1O;
            if (!list.isEmpty()) {
                for (InterfaceC52182aC interfaceC52182aC : list) {
                    File AAA = interfaceC52182aC.AAA();
                    if (!AAA.delete()) {
                        StringBuilder sb = new StringBuilder("cameraui/cannot-delete-file ");
                        sb.append(AAA);
                        Log.w(sb.toString());
                    }
                }
                list.clear();
            }
            if (z) {
                ((AbstractC04890Mh) this.A0P).A01.A00();
            }
        }
    }

    public void A0F(Bundle bundle) {
        InterfaceC52102a4 c52212aF;
        Set set = this.A1P;
        set.clear();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("multi_selected");
        if (parcelableArrayList != null) {
            set.addAll(parcelableArrayList);
        }
        this.A0T.A02(bundle);
        List list = this.A1O;
        list.clear();
        ArrayList<C52192aD> parcelableArrayList2 = bundle.getParcelableArrayList("captured_media");
        if (parcelableArrayList2 != null && !parcelableArrayList2.isEmpty()) {
            ContentResolver contentResolver = this.A15.A00.getContentResolver();
            ArrayList arrayList = new ArrayList(parcelableArrayList2.size());
            for (C52192aD c52192aD : parcelableArrayList2) {
                byte b = c52192aD.A00;
                if (b == 1) {
                    c52212aF = new C52202aE(contentResolver, c52192aD.A02, c52192aD.A03, c52192aD.A01);
                } else if (b == 3) {
                    c52212aF = new C52212aF(c52192aD.A02);
                } else {
                    StringBuilder A0P = C000200d.A0P("Unsupported media type: ");
                    A0P.append((int) b);
                    throw new AssertionError(A0P.toString());
                }
                arrayList.add(c52212aF);
            }
            list.addAll(arrayList);
        }
        this.A0f = !list.isEmpty();
        C52112a5 c52112a5 = this.A0P;
        if (c52112a5 != null) {
            ((AbstractC04890Mh) c52112a5).A01.A00();
        }
        if (this.A0B != null) {
            A0O(!set.isEmpty());
        }
        BottomSheetBehavior bottomSheetBehavior = this.A0J;
        if (bottomSheetBehavior != null) {
            if (bottomSheetBehavior.A0B == 3) {
                this.A08.setVisibility(4);
                this.A0I.setVisibility(4);
                this.A04.setVisibility(4);
                this.A09.setVisibility(0);
                this.A09.setAlpha(1.0f);
                return;
            }
            this.A08.setVisibility(A0W() ? 0 : 8);
            this.A0I.setVisibility(0);
            this.A04.setVisibility(0);
            this.A09.setVisibility(4);
            this.A09.setAlpha(0.0f);
        }
    }

    public void A0G(Bundle bundle) {
        bundle.putParcelableArrayList("multi_selected", new ArrayList<>(this.A1P));
        C2Gx c2Gx = this.A0T;
        if (c2Gx != null) {
            Bundle bundle2 = new Bundle();
            c2Gx.A03(bundle2);
            bundle.putBundle("media_preview_params", bundle2);
            List<InterfaceC52182aC> list = this.A1O;
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
            for (InterfaceC52182aC interfaceC52182aC : list) {
                arrayList.add(new C52192aD(interfaceC52182aC));
            }
            bundle.putParcelableArrayList("captured_media", arrayList);
            return;
        }
        throw null;
    }

    public void A0H(ActivityC02290Ap activityC02290Ap, AbstractC005302j abstractC005302j, long j, C011005l c011005l, boolean z, String str, List list, ArrayList arrayList, C2Gx c2Gx, boolean z2, boolean z3) {
        InterfaceC471629w interfaceC471629w;
        C2Lp c2Lp = this.A0x;
        if (c2Lp != null) {
            c2Lp.A01 = SystemClock.elapsedRealtime();
            this.A0L = activityC02290Ap;
            this.A0V = abstractC005302j;
            this.A01 = j;
            this.A0W = c011005l;
            this.A0g = z;
            this.A0b = str;
            this.A0c = list;
            AnonymousClass012 anonymousClass012 = this.A14;
            C018508q c018508q = this.A0s;
            C02L c02l = this.A0u;
            InterfaceC002901k interfaceC002901k = this.A1J;
            AnonymousClass011 anonymousClass011 = this.A1B;
            C01B c01b = this.A0v;
            C03230Ew c03230Ew = this.A0t;
            C05Y c05y = this.A1C;
            C05W c05w = this.A0y;
            C02E c02e = this.A13;
            this.A0X = new C50692Su(anonymousClass012, c018508q, c02l, interfaceC002901k, anonymousClass011, c01b, c03230Ew, c05y, c05w, c02e, this.A0q, this.A1F, this.A11, this.A12, this.A10, this.A19, this.A1E, this.A1D, this.A0z, activityC02290Ap, c01b.A0E(C01C.A0K), c01b.A0E(C01C.A1T), c01b.A0E(C01C.A25), c01b.A0E(C01C.A1s), null);
            this.A05 = this.A0L.findViewById(R.id.camera_layout);
            if (this.A1A.A0C(125)) {
                interfaceC471629w = C52222aG.A00(activityC02290Ap, AnonymousClass029.A07(this.A1H, c02e));
                if (interfaceC471629w != null) {
                    Log.i("camera/CameraInterface/LiteCameraView/");
                }
            } else {
                interfaceC471629w = null;
            }
            if (interfaceC471629w == null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (C2L5.A0n == null) {
                        Boolean valueOf = Boolean.valueOf(C2L5.A0H(activityC02290Ap));
                        C2L5.A0n = valueOf;
                        StringBuilder A0P = C000200d.A0P("cameraview/camera2-supported ");
                        A0P.append(valueOf);
                        Log.i(A0P.toString());
                    }
                    if (C2L5.A0n.booleanValue()) {
                        Log.i("camera/CameraInterface/CameraView2");
                        interfaceC471629w = new C2L5(activityC02290Ap);
                    }
                }
                Log.i("camera/CameraInterface/CameraView");
                interfaceC471629w = new SurfaceHolder$CallbackC49122Io(activityC02290Ap);
            }
            this.A0N = interfaceC471629w;
            interfaceC471629w.setQrScanningEnabled(z2);
            View view = (View) this.A0N;
            this.A07 = view;
            view.setVisibility(8);
            ((ViewGroup) this.A0L.findViewById(R.id.camera_view_holder)).addView(this.A07, new FrameLayout.LayoutParams(-2, -2, 17));
            final C2L4 c2l4 = new C2L4(activityC02290Ap, new C52232aH(this));
            this.A07.setOnTouchListener(new View.OnTouchListener() { // from class: X.2oH
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    C2L4 c2l42 = c2l4;
                    c2l42.A02.A00.APj(motionEvent);
                    c2l42.A01.onTouchEvent(motionEvent);
                    return true;
                }
            });
            this.A0N.setCameraCallback(new C2Il(this, c2l4));
            this.A07.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2oF
                {
                    C29X.this = this;
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    C29X c29x = C29X.this;
                    if ((c29x.A07.getWidth() > c29x.A07.getHeight() || !c29x.A0k) && c29x.A0J.A0B == 4) {
                        if (c29x.A03.getVisibility() != 8) {
                            c29x.A03.setVisibility(8);
                        }
                    } else if (c29x.A03.getVisibility() != 0) {
                        c29x.A03.setVisibility(0);
                    }
                    if (c29x.A07.getWidth() <= c29x.A07.getHeight() && !c29x.A0N.AFg() && c29x.A0m) {
                        c29x.A0F.setVisibility(0);
                    } else {
                        c29x.A0F.setVisibility(8);
                    }
                }
            });
            this.A06 = this.A0L.findViewById(R.id.camera_protection);
            final ViewGroup viewGroup = (ViewGroup) this.A0L.findViewById(R.id.camera_overlays);
            C52242aI c52242aI = new C52242aI(this.A0L);
            this.A0M = c52242aI;
            c52242aI.setVisibility(8);
            viewGroup.addView(this.A0M, -1, -1);
            C2VU c2vu = new C2VU(this.A0L);
            this.A0S = c2vu;
            c2vu.setVisibility(8);
            viewGroup.addView(this.A0S, -1, -1);
            C49072Ii c49072Ii = new C49072Ii(this.A0L);
            this.A0R = c49072Ii;
            viewGroup.addView(c49072Ii, -1, -1);
            this.A0G = (TextView) this.A0L.findViewById(R.id.recording_time);
            CircularProgressBar circularProgressBar = (CircularProgressBar) this.A0L.findViewById(R.id.recording_progress);
            this.A0K = circularProgressBar;
            circularProgressBar.setMax(100);
            this.A0A = this.A0L.findViewById(R.id.recording_info);
            View findViewById = this.A0L.findViewById(R.id.switch_camera_btn);
            this.A0C = findViewById;
            findViewById.setVisibility(this.A0N.getNumberOfCameras() <= 1 ? 8 : 0);
            A0R(this.A0N.AFI());
            this.A0C.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 26));
            ImageView imageView = (ImageView) this.A0L.findViewById(R.id.flash_btn);
            this.A0D = imageView;
            imageView.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 25));
            this.A0D.setVisibility(this.A0N.getStoredFlashModeCount() > 1 ? 0 : 8);
            C52152a9 c52152a9 = new C52152a9(this.A0L);
            this.A0Q = c52152a9;
            if (c52152a9.canDetectOrientation()) {
                this.A0Q.enable();
            } else {
                this.A0Q = null;
            }
            ImageView imageView2 = (ImageView) this.A0L.findViewById(R.id.shutter);
            this.A0E = imageView2;
            imageView2.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 16));
            this.A0E.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.2oG
                {
                    C29X.this = this;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    C29X c29x = C29X.this;
                    if (!c29x.A0N.AFg() && !c29x.A0o.hasMessages(0)) {
                        if (!c29x.A0l && c29x.A16.A02("android.permission.RECORD_AUDIO") != 0) {
                            c29x.A0l = true;
                            c29x.A0E.setImageResource(R.drawable.btn_shutter);
                            c29x.A0E.clearAnimation();
                            ActivityC02290Ap activityC02290Ap2 = c29x.A0L;
                            activityC02290Ap2.startActivity(new Intent(activityC02290Ap2, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_mic).putExtra("message_id", R.string.permission_mic_access_on_video_recording_request).putExtra("perm_denial_message_id", R.string.permission_mic_access_on_video_recording).putExtra("permissions", new String[]{"android.permission.RECORD_AUDIO"}));
                        } else {
                            c29x.A0A();
                            return true;
                        }
                    }
                    return true;
                }
            });
            this.A0E.setOnTouchListener(new View.OnTouchListener() { // from class: X.2oI
                {
                    C29X.this = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:66:0x00ca, code lost:
                    if (r5 != 3) goto L6;
                 */
                @Override // android.view.View.OnTouchListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final boolean onTouch(android.view.View r15, android.view.MotionEvent r16) {
                    /*
                        r14 = this;
                        X.29X r4 = X.C29X.this
                        r6 = r16
                        int r5 = r6.getActionMasked()
                        X.29w r0 = r4.A0N
                        boolean r2 = r0.AFg()
                        r0 = 220(0xdc, double:1.087E-321)
                        r3 = 0
                        r10 = 1
                        if (r2 == 0) goto L98
                        if (r5 != r10) goto L4b
                        android.view.View r5 = r4.A07
                        java.lang.RunnableEBaseShape1S0100000_I0_1 r2 = new java.lang.RunnableEBaseShape1S0100000_I0_1
                        r2.<init>(r4, r10)
                        r5.postDelayed(r2, r0)
                    L20:
                        android.widget.ImageView r5 = r4.A0E
                        r2 = 2131231064(0x7f080158, float:1.8078198E38)
                        r5.setImageResource(r2)
                        r6 = 1069547520(0x3fc00000, float:1.5)
                        r7 = 1065353216(0x3f800000, float:1.0)
                        r11 = 1056964608(0x3f000000, float:0.5)
                        r8 = r6
                        r9 = r7
                        r12 = r10
                        r13 = r11
                        android.view.animation.ScaleAnimation r5 = new android.view.animation.ScaleAnimation
                        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
                        r5.setDuration(r0)
                        android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
                        r0.<init>()
                        r5.setInterpolator(r0)
                        r5.setFillAfter(r10)
                        android.widget.ImageView r0 = r4.A0E
                        r0.startAnimation(r5)
                    L4a:
                        return r3
                    L4b:
                        r7 = 2
                        if (r5 != r7) goto L88
                        int r2 = r6.getPointerCount()
                        if (r2 != r10) goto L88
                        r4.A0j = r3
                        float r1 = r6.getY()
                        r0 = 0
                        int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                        if (r0 >= 0) goto L4a
                        X.29w r0 = r4.A0N
                        int r5 = r0.getMaxZoom()
                        if (r5 <= 0) goto L4a
                        android.view.View r0 = r4.A07
                        int r0 = r0.getHeight()
                        int r0 = r0 / r7
                        float r2 = (float) r0
                        float r0 = r6.getY()
                        float r0 = -r0
                        float r1 = java.lang.Math.min(r2, r0)
                        float r1 = r1 / r2
                        float r0 = (float) r5
                        float r0 = r0 * r1
                        int r1 = (int) r0
                        r0 = 0
                        if (r1 <= 0) goto L80
                        r0 = 1
                    L80:
                        r4.A0j = r0
                        X.29w r0 = r4.A0N
                        r0.AUG(r1)
                        return r3
                    L88:
                        int r2 = r6.getPointerCount()
                        if (r2 <= r10) goto L9a
                        boolean r2 = r4.A0j
                        if (r2 != 0) goto L9a
                        android.view.View r2 = r4.A07
                        r2.onTouchEvent(r6)
                        goto L9a
                    L98:
                        r4.A0j = r3
                    L9a:
                        if (r5 != 0) goto Lc7
                        android.widget.ImageView r5 = r4.A0E
                        r2 = 2131231709(0x7f0803dd, float:1.8079507E38)
                        r5.setImageResource(r2)
                        r6 = 1065353216(0x3f800000, float:1.0)
                        r7 = 1069547520(0x3fc00000, float:1.5)
                        r11 = 1056964608(0x3f000000, float:0.5)
                        r8 = r6
                        r9 = r7
                        r12 = r10
                        r13 = r11
                        android.view.animation.ScaleAnimation r5 = new android.view.animation.ScaleAnimation
                        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
                        r5.setDuration(r0)
                        android.view.animation.OvershootInterpolator r0 = new android.view.animation.OvershootInterpolator
                        r0.<init>()
                        r5.setInterpolator(r0)
                        r5.setFillAfter(r10)
                        android.widget.ImageView r0 = r4.A0E
                        r0.startAnimation(r5)
                        return r3
                    Lc7:
                        if (r5 == r10) goto L20
                        r2 = 3
                        if (r5 != r2) goto L4a
                        goto L20
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.View$OnTouchListenerC56892oI.onTouch(android.view.View, android.view.MotionEvent):boolean");
                }
            });
            this.A0F = (TextView) this.A0L.findViewById(R.id.recording_hint);
            this.A0E.setEnabled(false);
            this.A0C.setEnabled(false);
            this.A0D.setEnabled(false);
            A0J(this.A0N.getFlashMode());
            this.A0U = new C52132a7(this.A0w, this.A0L.getContentResolver(), new Handler(Looper.getMainLooper()));
            this.A0I = (RecyclerView) this.A0L.findViewById(R.id.recent_media);
            C52112a5 c52112a5 = new C52112a5(this);
            this.A0P = c52112a5;
            this.A0I.setAdapter(c52112a5);
            this.A0I.A0i = true;
            final int dimensionPixelSize = this.A0L.getResources().getDimensionPixelSize(R.dimen.camera_thumb_spacing);
            this.A0I.A0k(new AbstractC08920cK() { // from class: X.2aK
                {
                    C29X.this = this;
                }

                @Override // X.AbstractC08920cK
                public void A01(Rect rect, View view2, RecyclerView recyclerView, C0Y0 c0y0) {
                    if (C29X.this.A18.A0M()) {
                        rect.set(0, 0, dimensionPixelSize, 0);
                    } else {
                        rect.set(dimensionPixelSize, 0, 0, 0);
                    }
                }
            });
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            linearLayoutManager.A1Y(0);
            this.A0I.setLayoutManager(linearLayoutManager);
            View findViewById2 = this.A0L.findViewById(R.id.select_multiple);
            this.A0B = findViewById2;
            findViewById2.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 17));
            this.A0H = (TextView) this.A0L.findViewById(R.id.selected_count);
            ((ViewGroup) this.A0L.findViewById(R.id.camera_coordinator)).addView(new View(this.A0L) { // from class: X.2aL
                public final int[] A00 = new int[2];
                public final int[] A01 = new int[2];

                {
                    C29X.this = this;
                }

                @Override // android.view.View
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    C29X c29x = C29X.this;
                    View view2 = c29x.A07;
                    if (view2 == null) {
                        return super.onTouchEvent(motionEvent);
                    }
                    int[] iArr = this.A00;
                    view2.getLocationOnScreen(iArr);
                    int[] iArr2 = this.A01;
                    getLocationOnScreen(iArr2);
                    motionEvent.offsetLocation(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
                    return c29x.A07.dispatchTouchEvent(motionEvent);
                }
            }, 0);
            this.A04 = this.A0L.findViewById(R.id.camera_controls);
            View findViewById3 = this.A0L.findViewById(R.id.gallery_container);
            this.A09 = findViewById3;
            findViewById3.setVisibility(8);
            this.A09.setAlpha(0.0f);
            final View findViewById4 = this.A0L.findViewById(R.id.swipe_up_hint);
            findViewById4.setVisibility(this.A17.A00.getBoolean("show_camera_gallery_tip", true) ? 0 : 8);
            View findViewById5 = this.A0L.findViewById(R.id.drag_indicator_layout);
            this.A08 = findViewById5;
            findViewById5.measure(0, 0);
            View view2 = this.A08;
            view2.setTranslationY(-view2.getMeasuredHeight());
            this.A08.setVisibility(8);
            final DragBottomSheetIndicator dragBottomSheetIndicator = (DragBottomSheetIndicator) this.A0L.findViewById(R.id.drag_indicator);
            this.A03 = this.A0L.findViewById(R.id.bottom_sheet);
            CameraBottomSheetBehavior cameraBottomSheetBehavior = new CameraBottomSheetBehavior() { // from class: com.whatsapp.camera.CameraUi$10
                public boolean A00;

                {
                    C29X.this = this;
                }

                @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC08910cJ
                public boolean A08(CoordinatorLayout coordinatorLayout, View view3, int i) {
                    this.A00 = true;
                    super.A08(coordinatorLayout, view3, i);
                    return true;
                }

                @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC08910cJ
                public boolean A0B(CoordinatorLayout coordinatorLayout, View view3, MotionEvent motionEvent) {
                    if (this.A00 && super.A0B(coordinatorLayout, view3, motionEvent)) {
                        return motionEvent.getPointerCount() < 2 || motionEvent.getY() > ((float) C29X.this.A03.getTop());
                    }
                    return false;
                }

                @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC08910cJ
                public boolean A0C(CoordinatorLayout coordinatorLayout, View view3, MotionEvent motionEvent) {
                    return this.A00 && super.A0C(coordinatorLayout, view3, motionEvent);
                }
            };
            this.A0J = cameraBottomSheetBehavior;
            cameraBottomSheetBehavior.A0N(this.A0L.getResources().getDimensionPixelSize(R.dimen.camera_gallery_peek_height));
            BottomSheetBehavior bottomSheetBehavior = this.A0J;
            ((C08930cL) this.A03.getLayoutParams()).A00(bottomSheetBehavior);
            bottomSheetBehavior.A0E = new AbstractC08940cM() { // from class: X.2aQ
                public boolean A00 = false;

                {
                    C29X.this = this;
                }

                @Override // X.AbstractC08940cM
                public void A00(View view3, float f) {
                    C29X c29x = C29X.this;
                    c29x.A09.setAlpha(f);
                    float f2 = 1.0f - f;
                    c29x.A0I.setAlpha(f2);
                    c29x.A04.setAlpha(f2);
                    viewGroup.setBackgroundColor(((int) (255.0f * f)) << 24);
                    dragBottomSheetIndicator.setOffset(f);
                }

                /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:83:0x0084  */
                @Override // X.AbstractC08940cM
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void A01(android.view.View r12, int r13) {
                    /*
                        Method dump skipped, instructions count: 309
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C52292aQ.A01(android.view.View, int):void");
                }
            };
            AbstractC02800Cx A0N = activityC02290Ap.A0N();
            CameraMediaPickerFragment cameraMediaPickerFragment = (CameraMediaPickerFragment) A0N.A0Q.A01("cameraMediaPickerFragment");
            this.A0O = cameraMediaPickerFragment;
            if (cameraMediaPickerFragment == null) {
                this.A0O = new CameraMediaPickerFragment();
                C02820Cz c02820Cz = new C02820Cz(A0N);
                c02820Cz.A09(R.id.gallery_container, this.A0O, "cameraMediaPickerFragment", 1);
                c02820Cz.A05();
            }
            A07();
            if (arrayList != null && arrayList.size() > 0 && c2Gx != null && z3) {
                C2Gx c2Gx2 = this.A0T;
                c2Gx2.A00.clear();
                c2Gx2.A00.putAll(c2Gx.A00);
                A0K(arrayList);
            }
            this.A1L.A01(this.A1K);
            return;
        }
        throw null;
    }

    public final void A0I(InterfaceC52102a4 interfaceC52102a4, C51682Xk c51682Xk, boolean z) {
        if (interfaceC52102a4 == null) {
            Log.i("cameraui/showpreview/media-is-null");
            return;
        }
        Uri A88 = interfaceC52102a4.A88();
        StringBuilder sb = new StringBuilder("cameraui/showpreview ");
        sb.append(A88);
        Log.i(sb.toString());
        if (this.A0L.AFE()) {
            return;
        }
        if (z) {
            this.A1O.add(0, interfaceC52102a4);
        }
        this.A0T.A04(new C42611w2(A88));
        Set set = this.A1P;
        if (set.size() > 0) {
            this.A0f = true;
            set.add(A88);
            ((AbstractC04890Mh) this.A0P).A01.A00();
            A0O(true);
            A09();
            this.A0N.ARq();
            A0P(true);
            return;
        }
        A0L(Collections.singletonList(A88), c51682Xk);
    }

    public final void A0J(String str) {
        int i;
        int i2;
        int i3;
        if ("off".equals(str)) {
            i = R.drawable.flash_off;
            i2 = R.string.flash_off;
        } else if ("on".equals(str)) {
            i = R.drawable.flash_on;
            i2 = R.string.flash_on;
        } else {
            boolean equals = "auto".equals(str);
            i = R.drawable.flash_off;
            i2 = R.string.flash_off;
            if (equals) {
                i = R.drawable.flash_auto;
                i2 = R.string.flash_auto;
            }
        }
        List flashModes = this.A0N.getFlashModes();
        Object obj = flashModes.isEmpty() ? null : flashModes.get((flashModes.indexOf(str) + 1) % flashModes.size());
        if ("off".equals(obj)) {
            i3 = R.string.flash_off_action;
        } else if ("on".equals(obj)) {
            i3 = R.string.flash_on_action;
        } else {
            boolean equals2 = "auto".equals(obj);
            i3 = R.string.flash_off_action;
            if (equals2) {
                i3 = R.string.flash_auto_action;
            }
        }
        AnonymousClass088.A1V(this.A0D, i3);
        this.A0D.setContentDescription(this.A0L.getString(i2));
        int i4 = this.A00;
        if (i4 != i && i4 != 0) {
            C52302aV c52302aV = new C52302aV(C02160Ac.A03(this.A0L, i4), C02160Ac.A03(this.A0L, i));
            int intrinsicHeight = c52302aV.getIntrinsicHeight();
            c52302aV.A00 = 120;
            c52302aV.A01 = this.A0D.getPaddingTop() + intrinsicHeight;
            c52302aV.A02 = 0;
            c52302aV.invalidateSelf();
            this.A0D.setImageDrawable(c52302aV);
        } else {
            this.A0D.setImageResource(i);
        }
        this.A00 = i;
    }

    public final void A0K(ArrayList arrayList) {
        Set set = this.A1P;
        set.clear();
        if (arrayList != null) {
            set.addAll(arrayList);
        }
        this.A0d = true;
        A0O(!set.isEmpty());
        this.A0f = true;
        ((AbstractC04890Mh) this.A0P).A01.A00();
        A0N(true);
    }

    public final void A0L(Collection collection, C51682Xk c51682Xk) {
        Bitmap bitmap;
        InterfaceC52102a4 interfaceC52102a4;
        ArrayList arrayList = null;
        if (C2HC.A00 && c51682Xk != null) {
            arrayList = new ArrayList();
            arrayList.add(new C0FK(c51682Xk, C0AT.A0G(c51682Xk)));
            View findViewById = this.A0L.findViewById(R.id.header_transition);
            arrayList.add(new C0FK(findViewById, C0AT.A0G(findViewById)));
            View findViewById2 = this.A0L.findViewById(R.id.footer_transition);
            arrayList.add(new C0FK(findViewById2, C0AT.A0G(findViewById2)));
            View findViewById3 = this.A0L.findViewById(R.id.filter_swipe_transition);
            arrayList.add(new C0FK(findViewById3, C0AT.A0G(findViewById3)));
            View findViewById4 = this.A0L.findViewById(R.id.send_button_transition);
            arrayList.add(new C0FK(findViewById4, C0AT.A0G(findViewById4)));
            bitmap = c51682Xk.A00;
            interfaceC52102a4 = c51682Xk.A04;
        } else {
            bitmap = null;
            interfaceC52102a4 = null;
        }
        A0M(collection, arrayList, bitmap, interfaceC52102a4, this.A0O);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x007b, code lost:
        if (A01() == 5) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0M(java.util.Collection r23, java.util.List r24, android.graphics.Bitmap r25, X.InterfaceC52102a4 r26, X.C0BA r27) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29X.A0M(java.util.Collection, java.util.List, android.graphics.Bitmap, X.2a4, X.0BA):void");
    }

    public void A0N(boolean z) {
        Log.i("cameraui/restoreui");
        A0P(true);
        this.A0E.setVisibility(0);
        this.A0E.setImageResource(R.drawable.btn_shutter);
        this.A0F.setVisibility(0);
        this.A0m = true;
        if (z && this.A07.getVisibility() != 0) {
            this.A07.setVisibility(0);
        }
        boolean AFK = this.A0N.AFK();
        this.A0E.setEnabled(AFK);
        this.A0C.setEnabled(AFK);
        this.A0D.setEnabled(AFK);
        if (z && !AFK) {
            this.A07.requestLayout();
            this.A07.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2aW
                {
                    C29X.this = this;
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    C29X c29x = C29X.this;
                    c29x.A07.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    c29x.A0N.ARq();
                }
            });
        }
        this.A0A.setVisibility(8);
        boolean z2 = this.A0C.getVisibility() == 0;
        this.A0C.setVisibility(this.A0N.getNumberOfCameras() > 1 ? 0 : 8);
        if (!z2 && this.A0C.getVisibility() == 0) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(200L);
            this.A0C.startAnimation(scaleAnimation);
        }
        boolean z3 = this.A0D.getVisibility() == 0;
        A0C();
        if (z3 || this.A0D.getVisibility() != 0) {
            return;
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(200L);
        this.A0D.startAnimation(scaleAnimation2);
    }

    public final void A0O(boolean z) {
        if (z) {
            if (this.A0B.getVisibility() != 0) {
                this.A0B.setVisibility(0);
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(120L);
                this.A0B.startAnimation(scaleAnimation);
            }
            TextView textView = this.A0H;
            Set set = this.A1P;
            textView.setText(String.valueOf(set.size()));
            this.A0H.setContentDescription(this.A18.A0A(R.plurals.n_items_selected, set.size(), Integer.valueOf(set.size())));
        } else if (this.A0B.getVisibility() == 8) {
        } else {
            this.A0B.setVisibility(8);
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation2.setDuration(120L);
            this.A0B.startAnimation(scaleAnimation2);
        }
    }

    public final void A0P(boolean z) {
        this.A0k = z;
        if (z) {
            if (this.A03.getVisibility() != 0) {
                this.A03.setVisibility(0);
            }
            A0O(!this.A1P.isEmpty());
            return;
        }
        if (this.A03.getVisibility() != 8) {
            this.A03.setVisibility(8);
            AnimationSet animationSet = new AnimationSet(true);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            animationSet.addAnimation(translateAnimation);
            animationSet.setDuration(300L);
            this.A03.startAnimation(animationSet);
        }
        A0O(false);
    }

    public final void A0Q(boolean z) {
        File file;
        Vibrator vibrator;
        this.A0E.setImageResource(R.drawable.btn_shutter);
        this.A0E.clearAnimation();
        StringBuilder sb = new StringBuilder("cameraui/stopvideocapture ");
        sb.append(z);
        Log.i(sb.toString());
        C2Lp c2Lp = this.A0x;
        if (c2Lp != null) {
            c2Lp.A06 = SystemClock.elapsedRealtime();
            this.A0N.AVD();
            InterfaceC471629w interfaceC471629w = this.A0N;
            Integer valueOf = Integer.valueOf(interfaceC471629w.getCameraApi());
            int cameraType = interfaceC471629w.getCameraType();
            int i = !interfaceC471629w.AFI();
            String l = Long.toString(interfaceC471629w.getVideoResolution());
            if (c2Lp != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - c2Lp.A06;
                long j = c2Lp.A04;
                C08960cO c08960cO = new C08960cO();
                c08960cO.A02 = Integer.valueOf(cameraType);
                c08960cO.A00 = valueOf;
                c08960cO.A01 = Integer.valueOf(i);
                c08960cO.A05 = l;
                c08960cO.A03 = Long.valueOf(j);
                c08960cO.A04 = Long.valueOf(elapsedRealtime);
                c2Lp.A00(c08960cO);
                A0D(0);
                this.A0L.setRequestedOrientation(-1);
                try {
                    if (Settings.System.getInt(this.A0L.getContentResolver(), "haptic_feedback_enabled") != 0 && (vibrator = (Vibrator) this.A0L.getSystemService("vibrator")) != null) {
                        vibrator.vibrate(75L);
                    }
                } catch (Settings.SettingNotFoundException e) {
                    Log.e("cameraui/stopvideocapture", e);
                }
                if (z && (file = this.A0a) != null) {
                    A0I(new C52212aF(file), null, true);
                    return;
                }
                File file2 = this.A0a;
                if (file2 != null && file2.exists()) {
                    if (!this.A0a.delete()) {
                        C000200d.A0o(this.A0a, C000200d.A0P("cameraui/failed to delete video "));
                    }
                } else {
                    StringBuilder A0P = C000200d.A0P("cameraui/video file doesn't exist: ");
                    A0P.append(this.A0a);
                    Log.e(A0P.toString());
                }
                this.A0a = null;
                A0N(true);
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void A0R(boolean z) {
        if (z) {
            this.A0C.setContentDescription(this.A15.A00.getResources().getString(R.string.switch_to_back_camera));
        } else {
            this.A0C.setContentDescription(this.A15.A00.getResources().getString(R.string.switch_to_front_camera));
        }
    }

    public boolean A0S() {
        return this.A0L != null;
    }

    public boolean A0T() {
        InterfaceC471629w interfaceC471629w = this.A0N;
        return interfaceC471629w != null && interfaceC471629w.AFg();
    }

    public boolean A0U() {
        BottomSheetBehavior bottomSheetBehavior = this.A0J;
        return bottomSheetBehavior == null || bottomSheetBehavior.A0B != 3;
    }

    public boolean A0V() {
        if (A0S()) {
            if (this.A0J.A0B == 3) {
                C0BA A06 = this.A0L.A0N().A06(R.id.gallery_container);
                if (A06 instanceof CameraMediaPickerFragment) {
                    CameraMediaPickerFragment cameraMediaPickerFragment = (CameraMediaPickerFragment) A06;
                    if (cameraMediaPickerFragment.A17()) {
                        cameraMediaPickerFragment.A1A();
                        return true;
                    }
                }
                this.A0J.A0O(4);
                return true;
            }
            Set set = this.A1P;
            if (!set.isEmpty()) {
                this.A0T = new C2Gx();
                set.clear();
                ((AbstractC04890Mh) this.A0P).A01.A00();
                A0O(false);
                return true;
            }
        }
        List<InterfaceC52182aC> list = this.A1O;
        if (!list.isEmpty()) {
            for (InterfaceC52182aC interfaceC52182aC : list) {
                File AAA = interfaceC52182aC.AAA();
                if (!AAA.delete()) {
                    StringBuilder sb = new StringBuilder("cameraui/cannot-delete-file ");
                    sb.append(AAA);
                    Log.w(sb.toString());
                }
            }
            list.clear();
            ((AbstractC04890Mh) this.A0P).A01.A00();
        }
        return false;
    }

    public final boolean A0W() {
        return this.A0I != null && this.A0P.A0C() >= 12;
    }

    public boolean A0X(int i) {
        if (A0S()) {
            if ((i == 25 || i == 24) && this.A0N.AFK()) {
                if (!this.A0N.AFg()) {
                    Handler handler = this.A0o;
                    if (!handler.hasMessages(0)) {
                        Log.i("cameraui/volume-key-down");
                        this.A0E.setPressed(true);
                        handler.sendMessageDelayed(handler.obtainMessage(0), 500L);
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean A0Y(int i) {
        if (A0S()) {
            if (i == 25 || i == 24) {
                this.A0o.removeMessages(0);
                if (this.A0N.AFg()) {
                    Log.i("cameraui/volume-key-up/stop-video-capture");
                    A0Q(System.currentTimeMillis() - this.A02 > 1000);
                } else {
                    Log.i("cameraui/volume-key-up/take-picture");
                    A0B();
                }
                this.A0E.setPressed(false);
                return true;
            }
            return false;
        }
        return false;
    }
}
