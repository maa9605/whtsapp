package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.3b1 */
/* loaded from: classes2.dex */
public class C73053b1 {
    public int A03;
    public int A04;
    public int A05;
    public Bitmap A06;
    public FrameLayout A07;
    public C657838n A08;
    public AnonymousClass094 A09;
    public C2Zb A0A;
    public AbstractC48662Ge A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public final double A0F;
    public final Context A0G;
    public final AccessibilityManager A0I;
    public final C34281hG A0J;
    public final C018308n A0K;
    public final AbstractC000600i A0L;
    public final C018508q A0M;
    public final Mp4Ops A0N;
    public final C01B A0O;
    public final C02E A0P;
    public final C001200o A0Q;
    public final C002301c A0R;
    public final C003701t A0S;
    public final InterfaceC002901k A0T;
    public final ScaleGestureDetector$OnScaleGestureListenerC54382ie A0U;
    public final C72983au A0V;
    public final boolean A0W;
    public int A01 = 2;
    public final Rect A0H = new Rect();
    public int A00 = 0;
    public int A02 = 0;

    public C73053b1(C001200o c001200o, Context context, Mp4Ops mp4Ops, C003701t c003701t, C018508q c018508q, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, AnonymousClass011 anonymousClass011, C01B c01b, C018308n c018308n, C02E c02e, C002301c c002301c, ScaleGestureDetector$OnScaleGestureListenerC54382ie scaleGestureDetector$OnScaleGestureListenerC54382ie, C34281hG c34281hG, AccessibilityManager accessibilityManager) {
        int height;
        this.A0Q = c001200o;
        this.A0G = context;
        this.A0N = mp4Ops;
        this.A0S = c003701t;
        this.A0M = c018508q;
        this.A0L = abstractC000600i;
        this.A0T = interfaceC002901k;
        this.A0O = c01b;
        this.A0K = c018308n;
        this.A0P = c02e;
        this.A0R = c002301c;
        this.A0U = scaleGestureDetector$OnScaleGestureListenerC54382ie;
        this.A0V = new C72983au(anonymousClass011);
        this.A0W = c003701t.A0C(474);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.inline_video_player_padding);
        if (context.getResources().getConfiguration().orientation == 1) {
            height = scaleGestureDetector$OnScaleGestureListenerC54382ie.getWidth();
        } else {
            height = scaleGestureDetector$OnScaleGestureListenerC54382ie.getHeight();
        }
        int i = height - (dimensionPixelSize << 1);
        this.A0F = ((i * i) * 9) >> 4;
        this.A0J = c34281hG;
        ScaleGestureDetector$OnScaleGestureListenerC54382ie scaleGestureDetector$OnScaleGestureListenerC54382ie2 = this.A0U;
        int[] viewIdsToIgnoreScaling = C2Zb.getViewIdsToIgnoreScaling();
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.inline_controls_padding);
        scaleGestureDetector$OnScaleGestureListenerC54382ie2.A0N = viewIdsToIgnoreScaling;
        scaleGestureDetector$OnScaleGestureListenerC54382ie2.A06 = dimensionPixelSize2;
        this.A0I = accessibilityManager;
    }

    public void A00() {
        long j;
        AnonymousClass094 anonymousClass094;
        Integer num;
        if (this.A0D) {
            Log.i("InlineVideoPlaybackHandler/closeInlineFrame");
            C72983au c72983au = this.A0V;
            int i = this.A04;
            AbstractC48662Ge abstractC48662Ge = this.A0B;
            if (abstractC48662Ge != null) {
                j = abstractC48662Ge.A03();
            } else {
                j = 0;
            }
            C3ST c3st = c72983au.A06;
            if (c3st.A02) {
                c3st.A00();
            }
            C3ST c3st2 = c72983au.A04;
            c3st2.A00();
            C37101ls c37101ls = new C37101ls();
            if (!c72983au.A00) {
                boolean z = c72983au.A01;
                c37101ls.A02 = Long.valueOf(z ? 0L : c3st2.A00);
                c37101ls.A03 = Long.valueOf(Math.round(j / 10000.0d) * 10000);
                c37101ls.A04 = Long.valueOf(z ? c72983au.A05.A00 : 0L);
                c37101ls.A00 = Boolean.valueOf(z);
                c37101ls.A05 = Long.valueOf(c72983au.A03.A00);
                c37101ls.A06 = Long.valueOf(Math.round(c3st.A00 / 10000.0d) * 10000);
                switch (i) {
                    case 1:
                        num = 5;
                        break;
                    case 2:
                        num = 1;
                        break;
                    case 3:
                        num = 3;
                        break;
                    case 4:
                        num = 4;
                        break;
                    case 5:
                        num = 2;
                        break;
                    case 6:
                        num = 7;
                        break;
                    case 7:
                        num = 6;
                        break;
                    case 8:
                        num = 8;
                        break;
                    default:
                        num = null;
                        break;
                }
                c37101ls.A01 = num;
                c72983au.A02.A0B(c37101ls, null, false);
            }
            c72983au.A00 = false;
            c72983au.A01 = false;
            c72983au.A05.A01();
            c3st2.A01();
            c3st.A01();
            c72983au.A03.A01();
            this.A01 = 2;
            C657838n c657838n = this.A08;
            if (c657838n != null && (anonymousClass094 = this.A09) != null) {
                c657838n.A01(anonymousClass094, 2);
                this.A08 = null;
            }
            C2Zb c2Zb = this.A0A;
            if (c2Zb != null) {
                c2Zb.A05();
            }
            AbstractC48662Ge abstractC48662Ge2 = this.A0B;
            if (abstractC48662Ge2 != null) {
                abstractC48662Ge2.A09();
                this.A0B = null;
            }
            ScaleGestureDetector$OnScaleGestureListenerC54382ie scaleGestureDetector$OnScaleGestureListenerC54382ie = this.A0U;
            scaleGestureDetector$OnScaleGestureListenerC54382ie.setSystemUiVisibility(0);
            scaleGestureDetector$OnScaleGestureListenerC54382ie.A0M = false;
            scaleGestureDetector$OnScaleGestureListenerC54382ie.A0K = false;
            scaleGestureDetector$OnScaleGestureListenerC54382ie.A0I = true;
            scaleGestureDetector$OnScaleGestureListenerC54382ie.A09 = 0;
            scaleGestureDetector$OnScaleGestureListenerC54382ie.A0A = 0;
            scaleGestureDetector$OnScaleGestureListenerC54382ie.removeAllViews();
            this.A0D = false;
            this.A0E = false;
            this.A09 = null;
            this.A0C = null;
        }
    }

    public void A01() {
        FrameLayout frameLayout = this.A07;
        Context context = this.A0G;
        frameLayout.setContentDescription(context.getString(R.string.inline_video_fullscreen));
        ScaleGestureDetector$OnScaleGestureListenerC54382ie scaleGestureDetector$OnScaleGestureListenerC54382ie = this.A0U;
        scaleGestureDetector$OnScaleGestureListenerC54382ie.A0I = false;
        scaleGestureDetector$OnScaleGestureListenerC54382ie.A0M = false;
        scaleGestureDetector$OnScaleGestureListenerC54382ie.A0K = true;
        scaleGestureDetector$OnScaleGestureListenerC54382ie.A0J = false;
        scaleGestureDetector$OnScaleGestureListenerC54382ie.A0A(1.0f);
        FrameLayout frameLayout2 = this.A07;
        if (frameLayout2.getX() != 0.0f && frameLayout2.getY() != 0.0f) {
            scaleGestureDetector$OnScaleGestureListenerC54382ie.A09 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A02(scaleGestureDetector$OnScaleGestureListenerC54382ie.A03);
            scaleGestureDetector$OnScaleGestureListenerC54382ie.A0A = scaleGestureDetector$OnScaleGestureListenerC54382ie.A03(scaleGestureDetector$OnScaleGestureListenerC54382ie.A02);
        }
        C0AT.A0L(C018308n.A00(context).getWindow().getDecorView());
        this.A07.setScaleX(1.0f);
        this.A07.setScaleY(1.0f);
        this.A0J.A00.A1g();
        FrameLayout frameLayout3 = this.A07;
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Point point = new Point();
        Point point2 = new Point();
        frameLayout3.getGlobalVisibleRect(rect, point2);
        scaleGestureDetector$OnScaleGestureListenerC54382ie.getGlobalVisibleRect(rect2, point);
        rect.offset(point2.x - rect.left, point2.y - rect.top);
        rect2.offset(-point.x, -point.y);
        this.A0H.set(rect);
        frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        A06(frameLayout3, rect, rect2);
        this.A0E = true;
        C2Zb c2Zb = this.A0A;
        if (c2Zb.A05 != null) {
            c2Zb.A0H.setVisibility(0);
        }
        c2Zb.A0Q.setVisibility(8);
        c2Zb.A09 = true;
        c2Zb.A06();
        scaleGestureDetector$OnScaleGestureListenerC54382ie.requestLayout();
        FrameLayout frameLayout4 = this.A07;
        if (frameLayout4 instanceof C86623xw) {
            ((C86623xw) frameLayout4).setIsFullscreen(this.A0E);
        }
    }

    public void A02() {
        if (this.A0A.A0G.getVisibility() != 0) {
            this.A0A.A04();
            return;
        }
        C2Zb c2Zb = this.A0A;
        if (!c2Zb.A08 && c2Zb.A0G.getVisibility() != 4 && c2Zb.A05 != null) {
            c2Zb.A08 = true;
            c2Zb.A0G.startAnimation(c2Zb.A0I);
            c2Zb.A0H.startAnimation(c2Zb.A0K);
            if (c2Zb.A09) {
                c2Zb.setSystemUiVisibility(Build.VERSION.SDK_INT >= 19 ? 4358 : 262);
            }
        }
    }

    public void A03() {
        AbstractC48662Ge abstractC48662Ge = this.A0B;
        if (abstractC48662Ge == null || !abstractC48662Ge.A0C()) {
            return;
        }
        this.A0A.A02();
    }

    public final void A04() {
        String str = this.A0C;
        if (str != null) {
            this.A0K.AS7(this.A0G, Uri.parse(str));
        }
        this.A0V.A00 = true;
        A00();
    }

    public final void A05() {
        if (this.A0E) {
            A0A(false);
        } else {
            A01();
        }
    }

    public final void A06(View view, Rect rect, Rect rect2) {
        float width;
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        if (!this.A0E) {
            if (rect2.width() / rect2.height() > rect.width() / rect.height()) {
                width = rect.height() / rect2.height();
                float width2 = ((rect2.width() * width) - rect.width()) / 2.0f;
                rect.left = (int) (rect.left - width2);
                rect.right = (int) (rect.right + width2);
            } else {
                width = rect.width() / rect2.width();
                float height = ((rect2.height() * width) - rect.height()) / 2.0f;
                rect.top = (int) (rect.top - height);
                rect.bottom = (int) (rect.bottom + height);
            }
        } else if (rect2.width() / rect2.height() < rect.width() / rect.height()) {
            width = rect.height() / rect2.height();
            float width3 = ((rect2.width() * width) - rect.width()) / 2.0f;
            rect.left = (int) (rect.left - width3);
            rect.right = (int) (rect.right + width3);
        } else {
            width = rect.width() / rect2.width();
            float height2 = ((rect2.height() * width) - rect.height()) / 2.0f;
            rect.top = (int) (rect.top - height2);
            rect.bottom = (int) (rect.bottom + height2);
        }
        float f = 1.0f;
        if (this.A0E) {
            f = this.A0U.A00;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(view, View.X, rect.left, rect2.left)).with(ObjectAnimator.ofFloat(view, View.Y, rect.top, rect2.top)).with(ObjectAnimator.ofFloat(view, View.SCALE_X, width, f)).with(ObjectAnimator.ofFloat(view, View.SCALE_Y, width, f));
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
    }

    public final void A07(C72973at c72973at, AnonymousClass094 anonymousClass094, int i, Bitmap[] bitmapArr) {
        double d;
        Context context;
        FrameLayout c86623xw;
        FrameLayout frameLayout;
        AbstractC48662Ge c48652Gd;
        Bitmap bitmap;
        int i2;
        if (this.A0B == null && anonymousClass094 == this.A09) {
            if (c72973at == null) {
                Log.i("InlineVideoPlaybackHandler/startInlinePlayback - loadPage returned null.  Opening video externally");
                String str = this.A0C;
                if (str != null) {
                    C1Lh.A00.remove(str);
                }
                A04();
                return;
            }
            C72983au c72983au = this.A0V;
            c72983au.A04.A02();
            c72983au.A05.A02();
            C657838n c657838n = this.A08;
            if (c657838n != null) {
                c657838n.A01(anonymousClass094, 1);
                this.A01 = 1;
            }
            this.A04 = i;
            this.A06 = bitmapArr[0];
            int i3 = c72973at.A00;
            if (i3 != -1 && (i2 = c72973at.A01) != -1) {
                d = i2 / i3;
            } else {
                d = 1.7777777777777777d;
            }
            int sqrt = (int) Math.sqrt(this.A0F / d);
            this.A03 = sqrt;
            this.A05 = (int) (sqrt * d);
            if (Build.VERSION.SDK_INT < 21) {
                context = this.A0G;
                c86623xw = new FrameLayout(context);
            } else {
                context = this.A0G;
                c86623xw = new C86623xw(context);
            }
            this.A07 = c86623xw;
            if (c86623xw instanceof C86623xw) {
                ((C86623xw) c86623xw).setIsFullscreen(this.A0E);
            }
            c86623xw.setContentDescription(context.getString(R.string.inline_video_pip));
            this.A07.setFocusable(true);
            this.A07.setImportantForAccessibility(1);
            this.A07.setFocusableInTouchMode(true);
            ScaleGestureDetector$OnScaleGestureListenerC54382ie scaleGestureDetector$OnScaleGestureListenerC54382ie = this.A0U;
            scaleGestureDetector$OnScaleGestureListenerC54382ie.A0F = new InterfaceC72913an() { // from class: X.3sl
                {
                    C73053b1.this = this;
                }

                @Override // X.InterfaceC72913an
                public final void AJU(boolean z) {
                    C73053b1.this.A0B(z);
                }
            };
            this.A0D = true;
            C0AT.A0P(this.A07, 6.0f);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.A07.addView(frameLayout2);
            boolean z = this.A0W;
            C2Zb c2Zb = new C2Zb(context, c72983au, z);
            this.A0A = c2Zb;
            if (bitmapArr[0] != null) {
                ((ImageView) c2Zb.findViewById(R.id.background)).setImageBitmap(bitmapArr[0]);
            }
            this.A0A.setCloseBtnListener(new InterfaceC73013ax() { // from class: X.3so
                {
                    C73053b1.this = this;
                }

                @Override // X.InterfaceC73013ax
                public final void AIT() {
                    C73053b1.this.A00();
                }
            });
            C2Zb c2Zb2 = this.A0A;
            InterfaceC73013ax interfaceC73013ax = new InterfaceC73013ax() { // from class: X.3sn
                {
                    C73053b1.this = this;
                }

                @Override // X.InterfaceC73013ax
                public final void AIT() {
                    C73053b1.this.A04();
                }
            };
            ImageButton imageButton = c2Zb2.A0O;
            if (imageButton != null) {
                c2Zb2.A02 = interfaceC73013ax;
                if (i != 1 && i != 7) {
                    imageButton.setImageResource(C72973at.A00(i));
                    ImageButton imageButton2 = c2Zb2.A0O;
                    imageButton2.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1(c2Zb2, 21));
                    imageButton2.setVisibility(0);
                } else {
                    imageButton.setVisibility(8);
                }
            }
            this.A0A.setFullscreenButtonClickListener(new InterfaceC73013ax() { // from class: X.3sp
                {
                    C73053b1.this = this;
                }

                @Override // X.InterfaceC73013ax
                public final void AIT() {
                    C73053b1.this.A05();
                }
            });
            frameLayout2.addView(this.A0A);
            this.A07.setOnHoverListener(new View.OnHoverListener() { // from class: X.3ac
                {
                    C73053b1.this = this;
                }

                @Override // android.view.View.OnHoverListener
                public final boolean onHover(View view, MotionEvent motionEvent) {
                    return C73053b1.this.A0C(motionEvent);
                }
            });
            this.A07.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1(this, 22));
            FrameLayout frameLayout3 = this.A07;
            C657838n c657838n2 = this.A08;
            if (anonymousClass094.equals(c657838n2.A01.A0n)) {
                frameLayout = c657838n2.A00.A03;
            } else {
                frameLayout = null;
            }
            int i4 = this.A05;
            int i5 = this.A03;
            if (scaleGestureDetector$OnScaleGestureListenerC54382ie.A0L) {
                scaleGestureDetector$OnScaleGestureListenerC54382ie.A04 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A07;
                scaleGestureDetector$OnScaleGestureListenerC54382ie.A05 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A08;
                scaleGestureDetector$OnScaleGestureListenerC54382ie.A0L = false;
            }
            scaleGestureDetector$OnScaleGestureListenerC54382ie.A00 = 1.0f;
            scaleGestureDetector$OnScaleGestureListenerC54382ie.A03 = i4;
            scaleGestureDetector$OnScaleGestureListenerC54382ie.A02 = i5;
            scaleGestureDetector$OnScaleGestureListenerC54382ie.A04 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A02(i4);
            scaleGestureDetector$OnScaleGestureListenerC54382ie.A05 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A03(i5);
            if (frameLayout == null) {
                frameLayout3.setScaleX(0.0f);
                frameLayout3.setScaleY(0.0f);
                frameLayout3.setAlpha(0.0f);
            } else {
                int[] iArr = new int[2];
                frameLayout.getLocationInWindow(iArr);
                frameLayout3.setTranslationX(iArr[0] - scaleGestureDetector$OnScaleGestureListenerC54382ie.A04);
                frameLayout3.setTranslationY(iArr[1] - scaleGestureDetector$OnScaleGestureListenerC54382ie.A05);
                frameLayout3.setPivotY(0.0f);
                frameLayout3.setPivotX(0.0f);
                frameLayout3.setScaleX(frameLayout.getWidth() / i4);
                frameLayout3.setScaleY(frameLayout.getHeight() / i5);
            }
            scaleGestureDetector$OnScaleGestureListenerC54382ie.A0H = true;
            scaleGestureDetector$OnScaleGestureListenerC54382ie.addView(frameLayout3, i4, i5);
            if (i == 4) {
                Bitmap bitmap2 = this.A06;
                if (bitmap2 != null) {
                    bitmap = Bitmap.createScaledBitmap(bitmap2, this.A05, this.A03, false);
                } else {
                    bitmap = null;
                }
                c48652Gd = new C84053t7(context, this.A0M, c72973at.A02, z, this.A0A, bitmap);
                this.A0B = c48652Gd;
            } else {
                c48652Gd = new C48652Gd(this.A0M, this.A0T, this.A0P, this.A0R, C018308n.A00(context), Uri.parse(c72973at.A02), new AbstractC83883sq(this.A0Q, this.A0N, this.A0L, C08M.A05(context, context.getString(R.string.app_name))) { // from class: X.3xy
                    public final AbstractC000600i A00;
                    public final Mp4Ops A01;
                    public final C001200o A02;
                    public final String A03;

                    {
                        this.A02 = r1;
                        this.A01 = r2;
                        this.A00 = r3;
                        this.A03 = r4;
                    }

                    @Override // X.AnonymousClass124
                    public InterfaceC06380Sv A6k() {
                        return new InterfaceC06380Sv(this.A02, this.A01, this.A00, this.A03) { // from class: X.3tA
                            public long A00 = 0;
                            public C72013Yi A01;
                            public FileInputStream A02;
                            public boolean A03;
                            public final InterfaceC30281aD A04;
                            public final AbstractC000600i A05;
                            public final Mp4Ops A06;
                            public final C001200o A07;
                            public final File A08;

                            @Override // X.InterfaceC06380Sv
                            public void A5K(C12L c12l) {
                            }

                            {
                                this.A07 = r4;
                                this.A06 = r5;
                                this.A05 = r6;
                                this.A04 = new C39411q5(r7).A6k();
                                this.A08 = new File(r4.A00.getExternalCacheDir(), UUID.randomUUID().toString());
                            }

                            @Override // X.InterfaceC06380Sv
                            public /* synthetic */ Map ACr() {
                                return Collections.emptyMap();
                            }

                            @Override // X.InterfaceC06380Sv
                            public Uri ADi() {
                                return this.A04.ADi();
                            }

                            @Override // X.InterfaceC06380Sv
                            public long AQX(AnonymousClass126 anonymousClass126) {
                                long j;
                                long AQX;
                                AnonymousClass126 anonymousClass1262 = anonymousClass126;
                                long j2 = anonymousClass1262.A04;
                                this.A00 = j2;
                                if (this.A03) {
                                    File file = this.A08;
                                    long length = file.length();
                                    if (this.A00 < length) {
                                        FileInputStream fileInputStream = new FileInputStream(file);
                                        this.A02 = fileInputStream;
                                        fileInputStream.skip(this.A00);
                                        j = (length - this.A00) + 0;
                                        anonymousClass1262 = new AnonymousClass126(anonymousClass1262.A05, anonymousClass1262.A08, length, length, -1L, anonymousClass1262.A06, anonymousClass1262.A00);
                                        AQX = ((C39401q4) this.A04).AQX(anonymousClass1262) + j;
                                        if (AQX >= 0 && !this.A03) {
                                            this.A01 = new C72013Yi(this.A07, this.A06, this.A05, this.A08, AQX);
                                        }
                                        return AQX;
                                    }
                                } else if (j2 != 0) {
                                    anonymousClass1262 = new AnonymousClass126(anonymousClass1262.A05, anonymousClass1262.A08, 0L, 0L, -1L, anonymousClass1262.A06, anonymousClass1262.A00);
                                }
                                j = 0;
                                AQX = ((C39401q4) this.A04).AQX(anonymousClass1262) + j;
                                if (AQX >= 0) {
                                    this.A01 = new C72013Yi(this.A07, this.A06, this.A05, this.A08, AQX);
                                }
                                return AQX;
                            }

                            @Override // X.InterfaceC06380Sv
                            public void close() {
                                ((C39401q4) this.A04).close();
                                FileInputStream fileInputStream = this.A02;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                    this.A02 = null;
                                }
                                this.A00 = 0L;
                            }

                            @Override // X.InterfaceC06380Sv
                            public int read(byte[] bArr, int i6, int i7) {
                                FileInputStream fileInputStream;
                                if (this.A01 != null) {
                                    if (!this.A03) {
                                        byte[] bArr2 = new byte[256];
                                        File file = this.A08;
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        while (this.A01.A00 == 0) {
                                            try {
                                                fileOutputStream.write(bArr2, 0, ((C39401q4) this.A04).read(bArr2, 0, 256));
                                                fileOutputStream.flush();
                                                if (!this.A01.A02(file.length())) {
                                                    this.A03 = this.A01.A00 == 1;
                                                }
                                            } finally {
                                            }
                                        }
                                        if (!this.A03) {
                                            throw new IOException("Mp4StreamCheckedDataSource/Mp4StreamCheck not successful");
                                        }
                                        fileOutputStream.close();
                                    }
                                    File file2 = this.A08;
                                    long length = file2.length();
                                    if (length > 0) {
                                        if (this.A00 < length) {
                                            FileInputStream fileInputStream2 = this.A02;
                                            if (fileInputStream2 == null) {
                                                fileInputStream2 = new FileInputStream(file2);
                                                this.A02 = fileInputStream2;
                                            }
                                            int read = fileInputStream2.read(bArr, i6, i7);
                                            long j = this.A00 + read;
                                            this.A00 = j;
                                            if (j >= length && (fileInputStream = this.A02) != null) {
                                                fileInputStream.close();
                                                this.A02 = null;
                                            }
                                            return read;
                                        }
                                        int read2 = ((C39401q4) this.A04).read(bArr, i6, i7);
                                        this.A00 += read2;
                                        return read2;
                                    }
                                    throw new IOException("Mp4StreamCheckedDataSource/videoHeadForStreamCheck is empty");
                                }
                                throw new IOException("Mp4StreamCheckedDataSource/Mp4StreamCheck not initialized");
                            }
                        };
                    }
                }, (AbstractC73093b5) null);
                this.A0B = c48652Gd;
            }
            frameLayout2.addView(c48652Gd.A05(), 0);
            this.A0B.A05().setBackgroundColor(context.getResources().getColor(R.color.black));
            AbstractC48662Ge abstractC48662Ge = this.A0B;
            abstractC48662Ge.A02 = new InterfaceC73123b8() { // from class: X.3sc
                {
                    C73053b1.this = this;
                }

                @Override // X.InterfaceC73123b8
                public final void AJy(String str2, boolean z2) {
                    C73053b1.this.A09(str2, z2);
                }
            };
            abstractC48662Ge.A03 = new InterfaceC73133b9(anonymousClass094) { // from class: X.3xv
                public final AnonymousClass094 A00;

                {
                    C73053b1.this = this;
                    this.A00 = anonymousClass094;
                }

                @Override // X.InterfaceC73133b9
                public void AOs(AbstractC48662Ge abstractC48662Ge2) {
                    AnonymousClass094 anonymousClass0942 = this.A00;
                    C73053b1 c73053b1 = C73053b1.this;
                    if (anonymousClass0942 != c73053b1.A09 || c73053b1.A0B == null) {
                        return;
                    }
                    C2Zb c2Zb3 = c73053b1.A0A;
                    AbstractC48662Ge abstractC48662Ge3 = c2Zb3.A05;
                    if (abstractC48662Ge3 != null) {
                        c2Zb3.A0T.setText(C02180Ae.A0n(c2Zb3.A0W, c2Zb3.A0X, abstractC48662Ge3.A03()));
                    }
                    C2Zb c2Zb4 = c73053b1.A0A;
                    c2Zb4.A0D.setVisibility(8);
                    c2Zb4.A0E.setVisibility(8);
                    c73053b1.A0A.A04();
                    c73053b1.A0A.A0P.setVisibility(0);
                    c73053b1.A07.requestFocus();
                    C72983au c72983au2 = c73053b1.A0V;
                    c72983au2.A01 = true;
                    c72983au2.A05.A00();
                    c72983au2.A04.A01();
                    c72983au2.A06.A02();
                }
            };
            this.A0A.setPlayer(abstractC48662Ge);
            this.A0A.A0P.setVisibility(4);
            scaleGestureDetector$OnScaleGestureListenerC54382ie.setControlView(this.A0A);
            this.A0B.A08();
        }
    }

    public void A08(String str, String str2, AnonymousClass094 anonymousClass094, C657838n c657838n, int i, Bitmap[] bitmapArr) {
        if (this.A09 == anonymousClass094) {
            return;
        }
        Log.i(String.format("InlineVideoPlaybackHandler/fetchPageInfo rowKey=%s fullUrl=%s canonicalUrl=%s", anonymousClass094, str, str2));
        A00();
        this.A09 = anonymousClass094;
        this.A0C = str2;
        this.A08 = c657838n;
        if (i == 4) {
            A07(new C72973at(str2, -1, -1), anonymousClass094, i, bitmapArr);
            return;
        }
        if (i == 3) {
            str2 = str;
        }
        String obj = Uri.parse(str2).buildUpon().appendQueryParameter("wa_logging_event", "video_play_open").build().toString();
        C05920Qu A00 = C1Lh.A00(obj);
        if (A00 != null) {
            A07(A00.A08, anonymousClass094, i, bitmapArr);
            return;
        }
        this.A08.A01(anonymousClass094, 0);
        this.A01 = 0;
        try {
            C1Lh.A01(this.A0M, this.A0T, this.A0O, this.A0R, obj, new InterfaceC26921Lg(anonymousClass094, i, bitmapArr) { // from class: X.3xu
                public final AnonymousClass094 A00;
                public final /* synthetic */ int A01;
                public final /* synthetic */ Bitmap[] A03;

                {
                    C73053b1.this = this;
                    this.A01 = i;
                    this.A03 = bitmapArr;
                    this.A00 = anonymousClass094;
                }

                @Override // X.InterfaceC26921Lg
                public void AMf(C05920Qu c05920Qu, boolean z) {
                    AnonymousClass094 anonymousClass0942 = this.A00;
                    C73053b1 c73053b1 = C73053b1.this;
                    if (anonymousClass0942 == c73053b1.A09) {
                        c73053b1.A07(c05920Qu.A08, anonymousClass0942, this.A01, this.A03);
                    }
                }
            });
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder("InlineVideoPlaybackHandler/onPlaybackError=");
            sb.append("InlineVideoPlaybackHandler/fetchPageInfo - loadPage failed");
            sb.append(" isTransient=");
            sb.append(true);
            Log.e(sb.toString());
            A04();
        }
    }

    public final void A09(String str, boolean z) {
        StringBuilder sb = new StringBuilder("InlineVideoPlaybackHandler/onPlaybackError=");
        sb.append(str);
        sb.append(" isTransient=");
        sb.append(z);
        Log.e(sb.toString());
        A04();
    }

    public void A0A(boolean z) {
        FrameLayout frameLayout = this.A07;
        Context context = this.A0G;
        frameLayout.setContentDescription(context.getString(R.string.inline_video_pip));
        ScaleGestureDetector$OnScaleGestureListenerC54382ie scaleGestureDetector$OnScaleGestureListenerC54382ie = this.A0U;
        scaleGestureDetector$OnScaleGestureListenerC54382ie.A0I = true;
        scaleGestureDetector$OnScaleGestureListenerC54382ie.A0M = false;
        scaleGestureDetector$OnScaleGestureListenerC54382ie.A0A(scaleGestureDetector$OnScaleGestureListenerC54382ie.A00);
        if (!z && this.A02 == this.A00) {
            FrameLayout frameLayout2 = this.A07;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Point point = new Point();
            scaleGestureDetector$OnScaleGestureListenerC54382ie.getGlobalVisibleRect(rect, point);
            rect.offset(-point.x, -point.y);
            rect2.set(this.A0H);
            frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(this.A05, this.A03));
            A06(frameLayout2, rect, rect2);
        } else {
            this.A07.setLayoutParams(new FrameLayout.LayoutParams(this.A05, this.A03));
        }
        this.A0E = false;
        C2Zb c2Zb = this.A0A;
        c2Zb.A0H.setVisibility(8);
        c2Zb.A0Q.setVisibility(0);
        c2Zb.A09 = false;
        c2Zb.A06();
        this.A0A.setSystemUiVisibility(0);
        scaleGestureDetector$OnScaleGestureListenerC54382ie.A0J = true;
        scaleGestureDetector$OnScaleGestureListenerC54382ie.A0B(this.A02 == this.A00);
        scaleGestureDetector$OnScaleGestureListenerC54382ie.A0K = false;
        C0AT.A0L(C018308n.A00(context).getWindow().getDecorView());
        this.A02 = this.A00;
        FrameLayout frameLayout3 = this.A07;
        if (frameLayout3 instanceof C86623xw) {
            ((C86623xw) frameLayout3).setIsFullscreen(this.A0E);
        }
    }

    public /* synthetic */ void A0B(boolean z) {
        if (z) {
            A0A(true);
        } else {
            A00();
        }
    }

    public /* synthetic */ boolean A0C(MotionEvent motionEvent) {
        if (AnonymousClass088.A1y(this.A0I) && motionEvent.getActionMasked() == 10) {
            this.A07.requestFocus();
            this.A07.performClick();
            return true;
        }
        return false;
    }
}
