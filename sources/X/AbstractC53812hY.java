package X;

import X.AbstractC53812hY;
import X.C0AT;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.widget.StatusPlaybackProgressView;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.ui.media.MediaCaptionTextView;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.2hY */
/* loaded from: classes2.dex */
public abstract class AbstractC53812hY extends AbstractC53822hZ {
    public BottomSheetBehavior A00;
    public AbstractC71693Xc A01;
    public StatusPlaybackProgressView A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C018508q A09;
    public final C03010Du A0A;
    public final C0C9 A0B;
    public final C42761wH A0C;
    public final C0EB A0D;
    public final C42441vk A0E;
    public final C2EQ A0F;
    public final AbstractC53832ha A0G;
    public final C42461vm A0I;
    public final InterfaceC002901k A0M;
    public final C2MV A0N;
    public boolean A07 = true;
    public final C0HC A0L = new C0HC(true);
    public final C0HC A0J = new C0HC(true);
    public final C0HC A0K = new C0HC(true);
    public final Handler A08 = new Handler(Looper.getMainLooper());
    public final Runnable A0O = new RunnableEBaseShape6S0100000_I0_6(this, 38);
    public final InterfaceC71733Xg A0H = new InterfaceC71733Xg() { // from class: X.3qD
        {
            AbstractC53812hY.this = this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:123:0x00b3, code lost:
            if (r5.A09() >= (r5.A0B.A07(X.C01C.A3w) * 1000)) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:138:0x010b, code lost:
            if (r0 < 100.0f) goto L21;
         */
        @Override // X.InterfaceC71733Xg
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final float ACb() {
            /*
                Method dump skipped, instructions count: 382
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C82253qD.ACb():float");
        }
    };

    public abstract void A0J();

    public AbstractC53812hY(C42461vm c42461vm, C018508q c018508q, C03010Du c03010Du, InterfaceC002901k interfaceC002901k, C0EB c0eb, C42761wH c42761wH, C42441vk c42441vk, C0C9 c0c9, C2MV c2mv, C2EQ c2eq, AbstractC53832ha abstractC53832ha) {
        this.A0I = c42461vm;
        this.A09 = c018508q;
        this.A0A = c03010Du;
        this.A0M = interfaceC002901k;
        this.A0D = c0eb;
        this.A0C = c42761wH;
        this.A0E = c42441vk;
        this.A0B = c0c9;
        this.A0N = c2mv;
        this.A0F = c2eq;
        this.A0G = abstractC53832ha;
    }

    @Override // X.AbstractC53822hZ
    public View A00(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.A02 = (StatusPlaybackProgressView) this.A0G.A00.A05().findViewById(R.id.playback_progress);
        View inflate = layoutInflater.inflate(R.layout.status_playback_page, (ViewGroup) null, false);
        AbstractC71693Xc A0C = A0C();
        A0C.A03 = inflate.findViewById(R.id.content_sheet);
        A0C.A09 = (ViewGroup) inflate.findViewById(R.id.content);
        A0C.A07 = inflate.findViewById(R.id.click_handler);
        A0C.A0B = (TextView) inflate.findViewById(R.id.control_btn);
        A0C.A04 = inflate.findViewById(R.id.control_frame);
        A0C.A0F = (MediaCaptionTextView) inflate.findViewById(R.id.caption);
        A0C.A01 = inflate.findViewById(R.id.caption_container);
        A0C.A02 = inflate.findViewById(R.id.caption_padding);
        A0C.A08 = (ViewGroup) inflate.findViewById(R.id.bottom_sheet);
        A0C.A06 = inflate.findViewById(R.id.status_details_background);
        A0C.A00 = inflate.findViewById(R.id.cancel_btn);
        A0C.A0E = (CircularProgressBar) inflate.findViewById(R.id.progress_bar);
        A0C.A0C = (TextView) inflate.findViewById(R.id.error);
        A0C.A0A = (ViewGroup) inflate.findViewById(R.id.info);
        A0C.A0D = (TextView) inflate.findViewById(R.id.info_btn);
        A0C.A05 = inflate.findViewById(R.id.extra_padding);
        return inflate;
    }

    @Override // X.AbstractC53822hZ
    public void A01() {
        C63532zw c63532zw;
        super.A01();
        C3XV A0B = A0B();
        if (!(A0B instanceof C82153q3)) {
            if ((A0B instanceof C82083pw) && (c63532zw = ((C82083pw) A0B).A00) != null) {
                c63532zw.A02.dismiss();
                return;
            }
            return;
        }
        C63532zw c63532zw2 = ((C82153q3) A0B).A01;
        if (c63532zw2 == null) {
            return;
        }
        c63532zw2.A02.dismiss();
    }

    @Override // X.AbstractC53822hZ
    public void A02() {
        C63532zw c63532zw;
        super.A02();
        StatusPlaybackProgressView statusPlaybackProgressView = this.A02;
        if (statusPlaybackProgressView != null) {
            if (statusPlaybackProgressView.A03 == this.A0H) {
                statusPlaybackProgressView.A03 = null;
            }
            statusPlaybackProgressView.invalidate();
        }
        C3XV A0B = A0B();
        if (!(A0B instanceof C82153q3)) {
            if (!(A0B instanceof C82123q0) && !(A0B instanceof C82113pz) && (c63532zw = ((C82083pw) A0B).A00) != null) {
                c63532zw.A02.dismiss();
                return;
            }
            return;
        }
        C82153q3 c82153q3 = (C82153q3) A0B;
        c82153q3.A0E();
        c82153q3.A0A();
        C63532zw c63532zw2 = c82153q3.A01;
        if (c63532zw2 == null) {
            return;
        }
        c63532zw2.A02.dismiss();
    }

    @Override // X.AbstractC53822hZ
    public void A03() {
        super.A03();
        A0F();
        if (super.A04) {
            this.A0L.A01();
            this.A0K.A01();
        }
    }

    @Override // X.AbstractC53822hZ
    public void A04() {
        super.A04();
        A0G();
        if (super.A04) {
            this.A0L.A03();
        }
    }

    @Override // X.AbstractC53822hZ
    public void A05() {
        super.A05();
        AbstractC86423xS abstractC86423xS = (AbstractC86423xS) this;
        this.A06 = abstractC86423xS.A0D.A0K(abstractC86423xS.A04);
        C0HC c0hc = this.A0J;
        c0hc.A01 = 0L;
        c0hc.A00 = 0L;
        if (A0P(true)) {
            c0hc.A03();
        }
        A0J();
        A0H();
    }

    @Override // X.AbstractC53822hZ
    public void A06() {
        super.A06();
        this.A0L.A01();
        this.A0J.A01();
        StringBuilder sb = new StringBuilder("playbackPage/stopPlayback page=");
        sb.append(this);
        sb.append("; host=");
        sb.append(this.A0G.A00);
        Log.i(sb.toString());
        this.A05 = false;
        this.A04 = false;
        StatusPlaybackProgressView statusPlaybackProgressView = this.A02;
        if (statusPlaybackProgressView.A03 == this.A0H) {
            statusPlaybackProgressView.A03 = null;
        }
        statusPlaybackProgressView.invalidate();
        A0B().A05();
        A0I();
        A0I();
    }

    @Override // X.AbstractC53822hZ
    public void A08(Rect rect) {
        super.A06.set(rect);
        AbstractC71693Xc A0C = A0C();
        A0C.A01.setPadding(rect.left, 0, rect.right, rect.bottom);
        A0C.A05.setPadding(rect.left, 0, rect.right, rect.bottom);
        this.A00.A0N(A0A().getResources().getDimensionPixelSize(R.dimen.status_footer_peek_height) + rect.bottom);
        ViewGroup viewGroup = A0C.A08;
        viewGroup.setPadding(rect.left, viewGroup.getPaddingTop(), rect.right, A0C.A08.getPaddingBottom());
        C3XV A0B = A0B();
        if (A0B instanceof C82113pz) {
            C82113pz c82113pz = (C82113pz) A0B;
            int dimensionPixelSize = c82113pz.A01().getResources().getDimensionPixelSize(R.dimen.status_text_h_padding);
            int dimensionPixelSize2 = c82113pz.A01().getResources().getDimensionPixelSize(R.dimen.status_text_v_padding);
            c82113pz.A02.setPadding(rect.left + dimensionPixelSize, rect.top + dimensionPixelSize2, rect.right + dimensionPixelSize, rect.bottom + dimensionPixelSize2);
            View view = c82113pz.A00;
            if (view != null) {
                view.setPadding(rect.left + dimensionPixelSize, rect.top + dimensionPixelSize2, dimensionPixelSize + rect.right, dimensionPixelSize2 + rect.bottom);
            }
        }
    }

    @Override // X.AbstractC53822hZ
    public void A09(View view) {
        super.A09(view);
        final AbstractC71693Xc abstractC71693Xc = this.A01;
        if (abstractC71693Xc != null) {
            String str = null;
            abstractC71693Xc.A0F.setOnClickListener(null);
            abstractC71693Xc.A0F.setClickable(false);
            ((ReadMoreTextView) abstractC71693Xc.A0F).A03 = new C3ZD() { // from class: X.3qE
                {
                    AbstractC53812hY.this = this;
                }

                @Override // X.C3ZD
                public final boolean AIV() {
                    AbstractC53812hY abstractC53812hY = AbstractC53812hY.this;
                    abstractC71693Xc.A0F.setExpanded(true);
                    abstractC53812hY.A0F();
                    abstractC53812hY.A0I();
                    return true;
                }
            };
            this.A00 = new BottomSheetBehavior() { // from class: com.whatsapp.status.playback.page.StatusPlaybackPageItem$1
                public float A00;
                public boolean A01;

                {
                    AbstractC53812hY.this = this;
                }

                @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC08910cJ
                public boolean A08(CoordinatorLayout coordinatorLayout, View view2, int i) {
                    this.A01 = true;
                    super.A08(coordinatorLayout, view2, i);
                    return true;
                }

                @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC08910cJ
                public boolean A0B(CoordinatorLayout coordinatorLayout, View view2, MotionEvent motionEvent) {
                    if ((this.A01 || !view2.isShown()) && motionEvent.getPointerCount() < 2) {
                        boolean A0B = super.A0B(coordinatorLayout, view2, motionEvent);
                        int actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 0) {
                            this.A00 = motionEvent.getY();
                        } else if (actionMasked == 2 && this.A00 < motionEvent.getY() && this.A0B == 4) {
                            return false;
                        }
                        return A0B;
                    }
                    return false;
                }
            };
            BottomSheetBehavior bottomSheetBehavior = this.A00;
            ((C08930cL) abstractC71693Xc.A08.getLayoutParams()).A00(bottomSheetBehavior);
            bottomSheetBehavior.A0E = new AbstractC08940cM() { // from class: X.3qK
                {
                    AbstractC53812hY.this = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:28:0x0035, code lost:
                    if (android.text.TextUtils.isEmpty(r2.A0D()) == false) goto L19;
                 */
                @Override // X.AbstractC08940cM
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void A00(android.view.View r8, float r9) {
                    /*
                        r7 = this;
                        X.2hY r2 = X.AbstractC53812hY.this
                        X.3Xc r1 = r2.A0C()
                        android.view.View r0 = r1.A06
                        r5 = 0
                        r0.setVisibility(r5)
                        android.view.View r0 = r1.A06
                        r0.setAlpha(r9)
                        android.view.ViewGroup r6 = r1.A0A
                        double r3 = (double) r9
                        r0 = 4616189618054758400(0x4010000000000000, double:4.0)
                        double r3 = java.lang.Math.pow(r3, r0)
                        float r1 = (float) r3
                        r0 = 1065353216(0x3f800000, float:1.0)
                        float r0 = r0 - r1
                        r6.setAlpha(r0)
                        X.3XV r0 = r2.A0B()
                        boolean r0 = r0 instanceof X.C82113pz
                        if (r0 != 0) goto L57
                        r0 = 1
                    L2a:
                        if (r0 == 0) goto L37
                        java.lang.String r0 = r2.A0D()
                        boolean r1 = android.text.TextUtils.isEmpty(r0)
                        r0 = 1
                        if (r1 != 0) goto L38
                    L37:
                        r0 = 0
                    L38:
                        if (r0 == 0) goto L48
                        r0 = 0
                        int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                        if (r0 == 0) goto L4c
                        boolean r0 = r2.A07
                        if (r0 == 0) goto L48
                        r2.A07 = r5
                        r2.A0N(r5)
                    L48:
                        r2.A0I()
                        return
                    L4c:
                        boolean r0 = r2.A07
                        if (r0 != 0) goto L48
                        r0 = 1
                        r2.A07 = r0
                        r2.A0N(r0)
                        goto L48
                    L57:
                        r0 = 0
                        goto L2a
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C82323qK.A00(android.view.View, float):void");
                }

                @Override // X.AbstractC08940cM
                public void A01(View view2, int i) {
                    AbstractC53812hY.this.A0K(i);
                }
            };
            BottomSheetBehavior bottomSheetBehavior2 = new BottomSheetBehavior() { // from class: com.whatsapp.status.playback.page.StatusPlaybackPageItem$3
                {
                    AbstractC53812hY.this = this;
                }

                @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC08910cJ
                public boolean A08(CoordinatorLayout coordinatorLayout, View view2, int i) {
                    super.A08(coordinatorLayout, view2, i);
                    C0AT.A0T(view2, -view2.getTop());
                    return true;
                }

                @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC08910cJ
                public boolean A0B(CoordinatorLayout coordinatorLayout, View view2, MotionEvent motionEvent) {
                    return AbstractC53812hY.this.A00.A0B != 3 && motionEvent.getPointerCount() < 2 && super.A0B(coordinatorLayout, view2, motionEvent);
                }

                @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC08910cJ
                public boolean A0C(CoordinatorLayout coordinatorLayout, View view2, MotionEvent motionEvent) {
                    boolean z = false;
                    if (AbstractC53812hY.this.A00.A0B == 3) {
                        return false;
                    }
                    try {
                        z = super.A0C(coordinatorLayout, view2, motionEvent);
                        return z;
                    } catch (IllegalArgumentException unused) {
                        return z;
                    }
                }
            };
            ((C08930cL) abstractC71693Xc.A03.getLayoutParams()).A00(bottomSheetBehavior2);
            bottomSheetBehavior2.A0E = new AbstractC08940cM() { // from class: X.3qL
                public boolean A00;

                {
                    AbstractC53812hY.this = this;
                }

                @Override // X.AbstractC08940cM
                public void A00(View view2, float f) {
                    AbstractC53812hY abstractC53812hY;
                    if (f > 0.95f) {
                        abstractC53812hY = AbstractC53812hY.this;
                        abstractC53812hY.A0I();
                    } else {
                        abstractC53812hY = AbstractC53812hY.this;
                        abstractC53812hY.A0O(false, false);
                    }
                    abstractC71693Xc.A03.setAlpha(f < 0.5f ? 2.0f * f : 1.0f);
                    C2Q3 c2q3 = (C2Q3) abstractC53812hY.A0G.A00.A09();
                    if (c2q3 != null) {
                        c2q3.AOm(f);
                    }
                    if (this.A00) {
                        return;
                    }
                    abstractC53812hY.A0B().A06(true);
                    this.A00 = true;
                }

                @Override // X.AbstractC08940cM
                public void A01(View view2, int i) {
                    if (i == 4) {
                        AbstractC53832ha abstractC53832ha = AbstractC53812hY.this.A0G;
                        if (abstractC53832ha != null) {
                            StringBuilder A0P = C000200d.A0P("playbackFragment/onPlaybackExit ");
                            StatusPlaybackBaseFragment statusPlaybackBaseFragment = abstractC53832ha.A00;
                            A0P.append(statusPlaybackBaseFragment);
                            Log.i(A0P.toString());
                            C2Q3 c2q3 = (C2Q3) statusPlaybackBaseFragment.A09();
                            if (c2q3 != null) {
                                c2q3.AK9(1);
                                return;
                            }
                            return;
                        }
                        throw null;
                    } else if (i != 3) {
                    } else {
                        AbstractC53812hY abstractC53812hY = AbstractC53812hY.this;
                        if (abstractC53812hY.A00.A0B == 3) {
                            return;
                        }
                        abstractC53812hY.A0B().A06(false);
                        this.A00 = false;
                        abstractC53812hY.A0G();
                    }
                }
            };
            abstractC71693Xc.A0E.setMax(100);
            abstractC71693Xc.A09.addView(A0B().A02());
            if (!(A0B() instanceof C82113pz)) {
                String A0D = A0D();
                if (A0D == null) {
                    AnonymousClass092 anonymousClass092 = ((AbstractC86423xS) this).A04;
                    if (anonymousClass092 instanceof C0JJ) {
                        A0D = ((C0JJ) anonymousClass092).A04;
                    }
                }
                str = A0D;
            }
            abstractC71693Xc.A0F.setCaptionText(AnonymousClass024.A0L(str, 1024));
            abstractC71693Xc.A02.setVisibility(abstractC71693Xc.A0F.getVisibility());
            final PointF pointF = new PointF();
            final AtomicLong atomicLong = new AtomicLong();
            abstractC71693Xc.A07.setOnTouchListener(new View.OnTouchListener() { // from class: X.3XZ
                {
                    AbstractC53812hY.this = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    AbstractC53812hY abstractC53812hY = AbstractC53812hY.this;
                    PointF pointF2 = pointF;
                    AtomicLong atomicLong2 = atomicLong;
                    if (abstractC53812hY.A00.A0B != 4 || abstractC53812hY.A0B().A08()) {
                        return false;
                    }
                    if (motionEvent.getPointerCount() == 1) {
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            pointF2.set(motionEvent.getX(), motionEvent.getY());
                            atomicLong2.set(SystemClock.elapsedRealtime());
                            abstractC53812hY.A0F();
                            Handler handler = abstractC53812hY.A08;
                            Runnable runnable = abstractC53812hY.A0O;
                            handler.removeCallbacks(runnable);
                            handler.postDelayed(runnable, 500L);
                        } else if (action == 1) {
                            pointF2.set(motionEvent.getX(), motionEvent.getY());
                            abstractC53812hY.A0G();
                            view2.performClick();
                        }
                    }
                    if (motionEvent.getAction() == 3) {
                        abstractC53812hY.A0G();
                        abstractC53812hY.A0I();
                        return false;
                    }
                    return false;
                }
            });
            A0B().A02().setOnClickListener(new C3XY(this, atomicLong, abstractC71693Xc, pointF));
            return;
        }
        throw null;
    }

    public Context A0A() {
        View view = super.A00;
        if (view != null) {
            return view.getContext();
        }
        throw null;
    }

    public C3XV A0B() {
        AbstractC86423xS abstractC86423xS = (AbstractC86423xS) this;
        C3XV c3xv = abstractC86423xS.A00;
        if (c3xv == null) {
            C53362fl c53362fl = abstractC86423xS.A06;
            AnonymousClass092 anonymousClass092 = abstractC86423xS.A04;
            AbstractC53802hX abstractC53802hX = new AbstractC53802hX(abstractC86423xS) { // from class: X.3xR
            };
            if (c53362fl != null) {
                byte b = anonymousClass092.A0m;
                if (b != 0) {
                    if (b != 1) {
                        if (b != 3) {
                            if (b != 13) {
                                if (b != 25) {
                                    switch (b) {
                                        case 27:
                                            break;
                                        case 28:
                                            break;
                                        case 29:
                                            break;
                                        default:
                                            c3xv = new C82123q0(c53362fl.A0A, c53362fl.A05, c53362fl.A02, c53362fl.A03, c53362fl.A06, c53362fl.A07, c53362fl.A0C, abstractC53802hX, anonymousClass092);
                                            break;
                                    }
                                    abstractC86423xS.A00 = c3xv;
                                }
                            }
                            c3xv = new C86403xO(c53362fl.A0A, c53362fl.A02, c53362fl.A0H, c53362fl.A01, c53362fl.A09, c53362fl.A04, c53362fl.A00, c53362fl.A0B, c53362fl.A06, c53362fl.A07, c53362fl.A0C, c53362fl.A0G, c53362fl.A0I, c53362fl.A0F, c53362fl.A0E, abstractC53802hX, anonymousClass092);
                            abstractC86423xS.A00 = c3xv;
                        }
                        c3xv = new C82153q3(c53362fl.A0A, c53362fl.A02, c53362fl.A0H, c53362fl.A01, c53362fl.A09, c53362fl.A04, c53362fl.A00, c53362fl.A0B, c53362fl.A06, c53362fl.A07, c53362fl.A0C, c53362fl.A0G, c53362fl.A0I, c53362fl.A0F, c53362fl.A0E, abstractC53802hX, anonymousClass092);
                        abstractC86423xS.A00 = c3xv;
                    }
                    c3xv = new C82083pw(c53362fl.A0A, c53362fl.A02, c53362fl.A00, c53362fl.A0B, c53362fl.A06, c53362fl.A07, c53362fl.A0C, c53362fl.A0G, abstractC53802hX, anonymousClass092);
                    abstractC86423xS.A00 = c3xv;
                }
                c3xv = new C82113pz(c53362fl.A0A, c53362fl.A02, c53362fl.A03, c53362fl.A06, c53362fl.A07, c53362fl.A0C, c53362fl.A08, abstractC53802hX, anonymousClass092);
                abstractC86423xS.A00 = c3xv;
            } else {
                throw null;
            }
        }
        return c3xv;
    }

    public AbstractC71693Xc A0C() {
        if (!(this instanceof C86883yg)) {
            AbstractC71693Xc abstractC71693Xc = this.A01;
            if (abstractC71693Xc == null) {
                C82353qN c82353qN = new C82353qN();
                this.A01 = c82353qN;
                return c82353qN;
            }
            return abstractC71693Xc;
        }
        return ((C86883yg) this).A0R();
    }

    public String A0D() {
        AnonymousClass092 anonymousClass092 = ((AbstractC86423xS) this).A04;
        if ((anonymousClass092 instanceof InterfaceC03910Hq) || !(anonymousClass092 instanceof AnonymousClass097)) {
            return null;
        }
        return ((AnonymousClass097) anonymousClass092).A1A();
    }

    public void A0E() {
        this.A03 = true;
        C53842hb c53842hb = (C53842hb) this.A0G;
        StatusPlaybackContactFragment statusPlaybackContactFragment = c53842hb.A01;
        C2AL c2al = statusPlaybackContactFragment.A0O;
        c2al.A01.A01(new RunnableEBaseShape0S0310000_I0(c2al, true, statusPlaybackContactFragment.A0S, c53842hb.A00, 4), 51);
    }

    public void A0F() {
        if (!this.A05 || this.A04) {
            return;
        }
        StringBuilder sb = new StringBuilder("playbackPage/pausePlayback page=");
        sb.append(this);
        sb.append("; host=");
        sb.append(this.A0G.A00);
        Log.i(sb.toString());
        this.A04 = true;
        C3XV A0B = A0B();
        if (A0B instanceof C82153q3) {
            C82153q3 c82153q3 = (C82153q3) A0B;
            c82153q3.A0D();
            if (c82153q3.A02 != null) {
                c82153q3.A0D();
                c82153q3.A02.A06();
            }
            DoodleView doodleView = c82153q3.A0E;
            if (doodleView != null) {
                doodleView.A0F.A0C = false;
                doodleView.invalidate();
            }
            c82153q3.A0A();
            C63532zw c63532zw = c82153q3.A01;
            if (c63532zw != null) {
                c63532zw.A02.dismiss();
            }
        } else if (A0B instanceof C82123q0) {
            ((C82123q0) A0B).A05.A02();
        } else if (!(A0B instanceof C82113pz)) {
            C82083pw c82083pw = (C82083pw) A0B;
            c82083pw.A07.A02();
            c82083pw.A02 = false;
        } else {
            ((C82113pz) A0B).A06.A02();
        }
        this.A0K.A03();
    }

    public void A0G() {
        if (!super.A04 || !this.A05 || super.A02 || this.A00.A0B != 4 || ((ReadMoreTextView) this.A01.A0F).A06 || A0B().A08()) {
            return;
        }
        StringBuilder sb = new StringBuilder("playbackPage/resumePlayback page=");
        sb.append(this);
        sb.append("; host=");
        sb.append(this.A0G.A00);
        Log.i(sb.toString());
        this.A04 = false;
        A0B().A03();
        this.A0K.A01();
        A0I();
    }

    public void A0H() {
        if (super.A04 && !this.A05 && A0B().A07()) {
            StringBuilder sb = new StringBuilder("playbackPage/startPlayback page=");
            sb.append(this);
            sb.append("; host=");
            sb.append(this.A0G.A00);
            Log.i(sb.toString());
            this.A05 = true;
            this.A04 = false;
            A0B().A04();
            this.A02.setProgressProvider(this.A0H);
            A0I();
            this.A0J.A01();
            this.A0L.A03();
            if (super.A02 || !super.A03 || this.A00.A0B != 4 || ((ReadMoreTextView) this.A01.A0F).A06 || A0B().A08()) {
                A0F();
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("playbackPage/startPlayback not possible page=");
        sb2.append(this);
        sb2.append("; host=");
        sb2.append(this.A0G.A00);
        Log.w(sb2.toString());
    }

    public final void A0I() {
        if (super.A00 != null) {
            this.A08.removeCallbacks(this.A0O);
            if (this.A01.A08.getVisibility() == 0) {
                return;
            }
            AlphaAnimation A03 = C000200d.A03(0.0f, 1.0f, 300L);
            if (this.A01.A01.getVisibility() != 0) {
                this.A01.A01.startAnimation(A03);
                this.A01.A01.setVisibility(0);
            }
            if (this.A01.A0F.getVisibility() == 0 && this.A01.A02.getVisibility() != 0) {
                this.A01.A02.startAnimation(A03);
                this.A01.A02.setVisibility(0);
            }
            if (this.A01.A08.getVisibility() == 4) {
                this.A01.A08.startAnimation(A03);
                this.A01.A08.setVisibility(0);
            }
            C53962ho A14 = this.A0G.A00.A14();
            if (A14 != null) {
                if (A14.A05.getVisibility() != 0) {
                    AlphaAnimation A032 = C000200d.A03(0.0f, 1.0f, 300L);
                    A14.A05.startAnimation(A032);
                    A14.A0C.startAnimation(A032);
                    A14.A05.setVisibility(0);
                    A14.A0C.setVisibility(0);
                }
                super.A00.setSystemUiVisibility(1792);
                return;
            }
            throw null;
        }
        throw null;
    }

    public void A0K(int i) {
        AbstractC71693Xc A0C = A0C();
        if (i == 4) {
            A0C.A06.setVisibility(8);
            A0C.A0A.setAlpha(1.0f);
            A0G();
        } else if (i == 3) {
        } else {
            A0F();
        }
    }

    public void A0L(int i) {
        String str;
        StringBuilder A0P = C000200d.A0P("playbackPage/reportStatusExitStats exit-method=");
        switch (i) {
            case 1:
                str = "SWIPE_DOWN";
                break;
            case 2:
                str = "BACK_ARROW_TAP";
                break;
            case 3:
                str = "BACK_BUTTON_TAP";
                break;
            case 4:
                str = "STATUS_TIMEOUT";
                break;
            case 5:
                str = "STATUS_DISMISSED";
                break;
            case 6:
                str = "BACKWARD_SWIPE";
                break;
            case 7:
                str = "FORWARD_SWIPE";
                break;
            case 8:
                str = "BACKWARD_TAP";
                break;
            case 9:
                str = "FORWARD_TAP";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        A0P.append(str);
        A0P.append("; page=");
        A0P.append(this);
        A0P.append("; host=");
        A0P.append(this.A0G.A00);
        Log.i(A0P.toString());
    }

    public void A0M(int i, boolean z) {
        String str;
        StringBuilder A0P = C000200d.A0P("playbackPage/reportStatusEnterStats entry-method=");
        switch (i) {
            case 1:
                str = "DIRECT_TAP";
                break;
            case 2:
                str = "BACKWARD_SWIPE";
                break;
            case 3:
                str = "FORWARD_SWIPE";
                break;
            case 4:
                str = "BACKWARD_TAP";
                break;
            case 5:
                str = "FORWARD_TAP";
                break;
            case 6:
                str = "PREVIOUS_STATUS_TIMEOUT";
                break;
            case 7:
                str = "PREVIOUS_STATUS_DISMISSED";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        A0P.append(str);
        A0P.append("; page=");
        A0P.append(this);
        A0P.append("; host=");
        A0P.append(this.A0G.A00);
        Log.i(A0P.toString());
    }

    public final void A0N(boolean z) {
        Drawable drawable;
        ViewGroup viewGroup = A0C().A0A;
        if (z) {
            drawable = C02160Ac.A03(A0A(), R.drawable.ic_center_shadow);
        } else {
            drawable = null;
        }
        viewGroup.setBackground(drawable);
    }

    public final void A0O(boolean z, boolean z2) {
        AbstractC71693Xc A0C = A0C();
        if (super.A00 != null) {
            if (A0C.A08.getVisibility() == 4 && A0C.A01.getVisibility() == 4) {
                return;
            }
            AlphaAnimation A03 = C000200d.A03(1.0f, 0.0f, 300L);
            if (z) {
                A0C.A01.startAnimation(A03);
                A0C.A01.setVisibility(4);
            }
            if (z2) {
                super.A00.setSystemUiVisibility(1798);
                if (A0C.A02.getVisibility() == 0) {
                    A0C.A02.startAnimation(A03);
                    A0C.A02.setVisibility(4);
                }
            }
            if (A0C.A08.getVisibility() == 0) {
                A0C.A08.startAnimation(A03);
                A0C.A08.setVisibility(4);
            }
            C53962ho A14 = this.A0G.A00.A14();
            if (A14 != null) {
                if (A14.A05.getVisibility() != 4) {
                    AlphaAnimation A032 = C000200d.A03(1.0f, 0.0f, 300L);
                    A14.A05.startAnimation(A032);
                    A14.A0C.startAnimation(A032);
                    A14.A05.setVisibility(4);
                    A14.A0C.setVisibility(4);
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    public boolean A0P(boolean z) {
        AbstractC86423xS abstractC86423xS = (AbstractC86423xS) this;
        C53132bw c53132bw = abstractC86423xS.A05;
        AnonymousClass092 anonymousClass092 = abstractC86423xS.A04;
        if (c53132bw != null) {
            if (anonymousClass092 instanceof AnonymousClass097) {
                AnonymousClass097 anonymousClass097 = (AnonymousClass097) anonymousClass092;
                if (!anonymousClass092.A0n.A02 || ((anonymousClass097 instanceof C0JP) && C0DB.A0q((C09B) anonymousClass097))) {
                    C09H c09h = anonymousClass097.A02;
                    if (c09h != null) {
                        if (!c09h.A0P && c09h.A07 != 1 && anonymousClass097.A09 != null) {
                            StringBuilder sb = new StringBuilder("statusdownload/downloadifneeded ");
                            sb.append(z);
                            sb.append(" ");
                            AnonymousClass094 anonymousClass094 = anonymousClass097.A0n;
                            sb.append(anonymousClass094.A01);
                            sb.append(" ");
                            sb.append(anonymousClass097.A0G);
                            Log.i(sb.toString());
                            if (z) {
                                C42451vl c42451vl = c53132bw.A02;
                                Iterator it = ((AbstractCollection) c42451vl.A04()).iterator();
                                while (it.hasNext()) {
                                    AnonymousClass097 anonymousClass0972 = (AnonymousClass097) it.next();
                                    AnonymousClass094 anonymousClass0942 = anonymousClass0972.A0n;
                                    if (C003101m.A0Z(anonymousClass0942.A00) && !anonymousClass0942.equals(anonymousClass094)) {
                                        c42451vl.A07(anonymousClass0972, false, false);
                                        c53132bw.A03.add(anonymousClass0972);
                                        StringBuilder sb2 = new StringBuilder("statusdownload/cancel ");
                                        sb2.append(anonymousClass0942.A01);
                                        sb2.append(" ");
                                        sb2.append(anonymousClass0972.A0G);
                                        Log.i(sb2.toString());
                                    } else if (anonymousClass0942.equals(anonymousClass094)) {
                                        StringBuilder A0P = C000200d.A0P("statusdownload/is-current ");
                                        A0P.append(anonymousClass0942.A01);
                                        A0P.append(" ");
                                        A0P.append(anonymousClass0972.A0G);
                                        Log.i(A0P.toString());
                                    }
                                }
                                c53132bw.A01(anonymousClass097, 0);
                                return true;
                            } else if (c53132bw.A00 == null) {
                                c53132bw.A01(anonymousClass097, C0DB.A0b(anonymousClass097) ? 3 : 0);
                                return true;
                            } else {
                                c53132bw.A03.add(anonymousClass097);
                                return true;
                            }
                        }
                    } else {
                        throw null;
                    }
                }
            }
            return false;
        }
        throw null;
    }
}
