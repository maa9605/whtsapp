package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.doodle.ColorPickerComponent;
import com.whatsapp.mediacomposer.doodle.ColorPickerView;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.util.Log;
import org.json.JSONException;

/* renamed from: X.2Gm */
/* loaded from: classes2.dex */
public class C48742Gm {
    public Activity A00;
    public View A01;
    public C48792Gs A02;
    public MediaComposerFragment A03;
    public C3H0 A04;
    public boolean A05;
    public boolean A06;
    public final C02E A08;
    public final C002301c A09;
    public final C40081rY A0A;
    public final C003701t A0B;
    public final ColorPickerComponent A0C;
    public final C43811y1 A0D;
    public final C2HL A0F;
    public final DoodleView A0G;
    public final C63512zu A0H;
    public final C63542zx A0I;
    public final C63562zz A0J;
    public final C3H8 A0K;
    public final AnonymousClass306 A0L;
    public final C2HF A0M;
    public final C48752Gn A0N;
    public final C2MB A0O;
    public final InterfaceC002901k A0P;
    public final C007203d A0Q;
    public final Handler A07 = new Handler(Looper.getMainLooper());
    public final C3H2 A0E = new C3H2(this);

    public C48742Gm(C003701t c003701t, final C2MB c2mb, final InterfaceC002901k interfaceC002901k, final C40081rY c40081rY, final C43811y1 c43811y1, final C2K0 c2k0, C02E c02e, final C002301c c002301c, final C2Bk c2Bk, final C2AS c2as, final C53292cG c53292cG, final C2OK c2ok, final C43791xz c43791xz, final Activity activity, View view, C48792Gs c48792Gs, final C30K c30k, MediaComposerFragment mediaComposerFragment, final C48752Gn c48752Gn) {
        this.A0B = c003701t;
        this.A00 = activity;
        this.A0O = c2mb;
        this.A0P = interfaceC002901k;
        this.A0A = c40081rY;
        this.A0D = c43811y1;
        this.A08 = c02e;
        this.A09 = c002301c;
        this.A01 = view;
        this.A02 = c48792Gs;
        this.A03 = mediaComposerFragment;
        this.A0N = c48752Gn;
        view.findViewById(R.id.doodle_decoration).setVisibility(0);
        Resources resources = activity.getResources();
        C2HG.A04 = resources.getDimension(R.dimen.doodle_min_shape_size);
        C2HG.A06 = resources.getDimension(R.dimen.doodle_min_text_size);
        C2HG.A09 = resources.getDimension(R.dimen.doodle_max_text_size);
        C2HG.A05 = resources.getDimension(R.dimen.doodle_min_stroke);
        C2HG.A08 = resources.getDimension(R.dimen.doodle_max_stroke);
        C2HG.A07 = resources.getDimension(R.dimen.doodle_hit_test_distance);
        DoodleView doodleView = (DoodleView) this.A01.findViewById(R.id.doodle_view);
        this.A0G = doodleView;
        this.A0H = doodleView.A0G;
        C2HF c2hf = doodleView.A0I;
        this.A0M = c2hf;
        C2HL c2hl = doodleView.A0F;
        this.A0F = c2hl;
        this.A0I = new C63542zx(c2hf, c2hl, doodleView.A0H, doodleView.getResources().getDisplayMetrics().density);
        C63562zz c63562zz = new C63562zz(this.A0H, new C637130o(c002301c, this.A01.findViewById(R.id.trash), new C637030n(), this.A07), new AnonymousClass309((ViewGroup) this.A01.findViewById(R.id.media_guidelines), this.A07), new C67793Gw(this));
        this.A0J = c63562zz;
        AnonymousClass306 anonymousClass306 = new AnonymousClass306();
        this.A0L = anonymousClass306;
        C3H8 c3h8 = new C3H8(this.A0G, this.A0M, c63562zz, anonymousClass306);
        this.A0K = c3h8;
        DoodleView doodleView2 = this.A0G;
        C63542zx c63542zx = this.A0I;
        C63562zz c63562zz2 = this.A0J;
        doodleView2.A0A = c3h8;
        doodleView2.A08 = c63542zx;
        doodleView2.A09 = c63562zz2;
        ColorPickerComponent colorPickerComponent = (ColorPickerComponent) this.A01.findViewById(R.id.color_picker_component);
        this.A0C = colorPickerComponent;
        colorPickerComponent.A03(this.A0G, c48792Gs, new InterfaceC63432zm() { // from class: X.3H3
            {
                C48742Gm.this = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x000d, code lost:
                if (r0.A0D() == false) goto L8;
             */
            @Override // X.InterfaceC63432zm
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void AIi(float r6, int r7) {
                /*
                    r5 = this;
                    X.2Gm r1 = X.C48742Gm.this
                    X.2HF r0 = r1.A0M
                    X.2HG r0 = r0.A01
                    if (r0 == 0) goto Lf
                    boolean r0 = r0.A0D()
                    r4 = 1
                    if (r0 != 0) goto L10
                Lf:
                    r4 = 0
                L10:
                    X.2Gn r3 = r2
                    com.whatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r1.A0C
                    com.whatsapp.mediacomposer.doodle.ColorPickerView r0 = r0.A06
                    float r2 = r0.A00
                    int r1 = r0.A03
                    boolean r0 = r0.A0C
                    r3.A05(r2, r1, r0, r4)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C3H3.AIi(float, int):void");
            }

            @Override // X.InterfaceC63432zm
            public void AQ6() {
                C48742Gm c48742Gm = C48742Gm.this;
                c48742Gm.A05();
                C48752Gn c48752Gn2 = c48752Gn;
                ColorPickerView colorPickerView = c48742Gm.A0C.A06;
                c48752Gn2.A05(colorPickerView.A00, colorPickerView.A03, colorPickerView.A0C, false);
            }
        });
        this.A0Q = C007203d.A00(new InterfaceC007103c() { // from class: X.3Gv
            {
                C48742Gm.this = this;
            }

            @Override // X.InterfaceC007103c
            public final Object get() {
                final C48742Gm c48742Gm = C48742Gm.this;
                Activity activity2 = activity;
                C2MB c2mb2 = c2mb;
                InterfaceC002901k interfaceC002901k2 = interfaceC002901k;
                C40081rY c40081rY2 = c40081rY;
                C43811y1 c43811y12 = c43811y1;
                C2K0 c2k02 = c2k0;
                C002301c c002301c2 = c002301c;
                C2Bk c2Bk2 = c2Bk;
                C2AS c2as2 = c2as;
                C53292cG c53292cG2 = c53292cG;
                C2OK c2ok2 = c2ok;
                C43791xz c43791xz2 = c43791xz;
                final C30K c30k2 = c30k;
                return new C2IP(activity2, c2mb2, interfaceC002901k2, c40081rY2, c43811y12, c2k02, c002301c2, c2Bk2, c2as2, c53292cG2, c2ok2, c43791xz2, c48742Gm.A01.findViewById(R.id.shape_picker), new C30K() { // from class: X.3Gx
                    @Override // X.C30K
                    public final void AOc(C2HG c2hg) {
                        C48742Gm c48742Gm2 = c48742Gm;
                        C30K c30k3 = c30k2;
                        if (c2hg instanceof C3La) {
                            c30k3.AOc(c2hg);
                        } else {
                            c48742Gm2.A08(c2hg);
                        }
                    }
                });
            }
        });
        this.A05 = false;
    }

    public void A00() {
        if (this.A0G.A06()) {
            this.A02.A03();
            A02();
            this.A0I.A02 = true;
            this.A0M.A01 = null;
            ColorPickerComponent colorPickerComponent = this.A0C;
            colorPickerComponent.setColorPaletteAndInvalidate(1);
            colorPickerComponent.A00();
            A05();
        }
    }

    public void A01() {
        if (this.A0G.A06()) {
            this.A02.A03();
            A02();
            this.A0I.A02 = false;
            ColorPickerComponent colorPickerComponent = this.A0C;
            colorPickerComponent.A04(true);
            colorPickerComponent.setColorPaletteAndInvalidate(1);
            this.A0M.A01 = null;
        }
    }

    public final void A02() {
        if (A0A()) {
            C3H0 c3h0 = this.A04;
            if (c3h0 != null) {
                c3h0.A05(true);
            }
            C2IP c2ip = (C2IP) this.A0Q.get();
            ViewGroup viewGroup = c2ip.A0N;
            viewGroup.setVisibility(8);
            c2ip.A0g.A01(viewGroup);
            AbstractC48762Go abstractC48762Go = this.A0N.A0B;
            abstractC48762Go.setToolbarExtraVisibility(8);
            abstractC48762Go.setUndoButtonVisibility(this.A0M.A03.A00.isEmpty() ^ true ? 0 : 8);
            this.A02.A02();
            A05();
            if (this.A0D.A01) {
                C2HL c2hl = this.A0F;
                ValueAnimator valueAnimator = c2hl.A06;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                Bitmap bitmap = c2hl.A08;
                if (bitmap != null) {
                    bitmap.recycle();
                    c2hl.A08 = null;
                    c2hl.A0H.A00.invalidate();
                }
                A03();
                if (this.A06) {
                    this.A03.A11();
                }
            }
        }
    }

    public final void A03() {
        if (this.A0F.A08 == null && !this.A0I.A02) {
            C2HF c2hf = this.A0M;
            if (!(!c2hf.A04.isEmpty()) && !(!c2hf.A03.A00.isEmpty())) {
                DoodleView doodleView = this.A0G;
                if (doodleView.getVisibility() != 4) {
                    doodleView.setVisibility(4);
                    return;
                }
                return;
            }
        }
        DoodleView doodleView2 = this.A0G;
        if (doodleView2.getVisibility() == 0) {
            return;
        }
        doodleView2.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x008a, code lost:
        if (r7.A0E != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A04() {
        /*
            r10 = this;
            X.2Gn r0 = r10.A0N
            X.2Go r0 = r0.A0B
            android.widget.RelativeLayout r2 = r0.A08
            boolean r0 = r10.A0A()
            if (r0 == 0) goto L81
            X.03d r0 = r10.A0Q
            java.lang.Object r7 = r0.get()
            X.2IP r7 = (X.C2IP) r7
            boolean r6 = r10.A05
            boolean r0 = r7.A0o
            if (r0 == 0) goto L81
            X.3Hq r0 = r7.A0A
            if (r0 == 0) goto L21
            r0.A02(r6)
        L21:
            X.3Hm r0 = r7.A08
            if (r0 == 0) goto L28
            r0.A02(r6)
        L28:
            com.whatsapp.ClearableEditText r5 = r7.A0R
            boolean r9 = r5.hasFocus()
            r4 = 1
            r3 = 0
            r0 = 2131364579(0x7f0a0ae3, float:1.8349E38)
            android.view.View r0 = r2.findViewById(r0)
            if (r6 == 0) goto L8d
            if (r0 == 0) goto L84
            android.view.View r1 = r7.A0I
            if (r0 == r1) goto L84
            r2.removeView(r0)
        L42:
            android.view.ViewGroup r0 = r7.A0N
            r0.removeView(r1)
            r2.addView(r1)
            X.30G r0 = new X.30G
            r0.<init>()
            r1.addOnLayoutChangeListener(r0)
            android.view.View r3 = r7.A0L
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            X.01c r0 = r7.A0S
            boolean r1 = r0.A0N()
            r0 = 5
            if (r1 == 0) goto L64
            r0 = 3
        L64:
            r2.gravity = r0
            r3.setLayoutParams(r2)
            r7.A0E = r4
        L6b:
            com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView r1 = r7.A0b
            X.30h r0 = r7.A09
            if (r0 == 0) goto L82
            androidx.recyclerview.widget.RecyclerView r0 = r0.A06
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L82
        L79:
            r1.A13(r6, r4)
            if (r9 == 0) goto L81
            r5.requestFocus()
        L81:
            return
        L82:
            r4 = 0
            goto L79
        L84:
            android.view.View r1 = r7.A0I
            if (r0 != r1) goto L42
            boolean r0 = r7.A0E
            if (r0 == 0) goto L42
            goto L6b
        L8d:
            r2.removeView(r0)
            boolean r0 = r7.A0E
            if (r0 == 0) goto L6b
            android.view.View r8 = r7.A0I
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0 = 2131166144(0x7f0703c0, float:1.7946525E38)
            int r1 = r7.A03(r0)
            r0 = 2131166145(0x7f0703c1, float:1.7946527E38)
            int r0 = r7.A03(r0)
            r2.setMargins(r1, r0, r1, r3)
            r0 = -1
            r2.width = r0
            r8.setLayoutParams(r2)
            android.view.ViewGroup r0 = r7.A0N
            r0.addView(r8)
            android.view.View r2 = r7.A0L
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r0 = 49
            r1.gravity = r0
            r2.setLayoutParams(r1)
            r7.A0E = r3
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48742Gm.A04():void");
    }

    public final void A05() {
        C48752Gn c48752Gn;
        if (this.A0I.A02) {
            this.A0C.A00();
        } else if (this.A0N.A00() == 2) {
            C2HG c2hg = this.A0M.A01;
            if (c2hg != null && (c2hg.A0D() || c2hg.A0C())) {
                this.A0C.A00();
            } else {
                this.A0C.A04(true);
            }
        }
        if (A0A()) {
            c48752Gn = this.A0N;
            AbstractC48762Go abstractC48762Go = c48752Gn.A0B;
            abstractC48762Go.A01();
            abstractC48762Go.A01.setVisibility(8);
            ColorPickerComponent colorPickerComponent = this.A0C;
            colorPickerComponent.A06.clearAnimation();
            colorPickerComponent.A04(false);
        } else {
            c48752Gn = this.A0N;
            AbstractC48762Go abstractC48762Go2 = c48752Gn.A0B;
            abstractC48762Go2.A02();
            abstractC48762Go2.setUndoButtonVisibility(this.A0M.A03.A00.isEmpty() ^ true ? 0 : 8);
        }
        c48752Gn.A09(this.A0D.A01, this.A09.A0N());
        A03();
    }

    public void A06(RectF rectF) {
        C63512zu c63512zu = this.A0H;
        c63512zu.A07 = rectF;
        if (rectF != null) {
            C40841sx.A07(c63512zu.A02, rectF, c63512zu.A09);
        }
        DoodleView doodleView = this.A0G;
        c63512zu.A08 = doodleView.getResources().getDisplayMetrics();
        C2HL c2hl = this.A0F;
        c2hl.A01();
        doodleView.requestLayout();
        c2hl.A0D = false;
        doodleView.invalidate();
    }

    public void A07(C2EK c2ek, String str) {
        this.A0G.setDoodle(c2ek);
        C2HF c2hf = this.A0M;
        if (c2hf != null) {
            if (str != null) {
                try {
                    c2hf.A03.A02(str, c2hf.A04);
                } catch (JSONException e) {
                    Log.e("ShapeRepository/loadUndoState", e);
                }
            }
            A03();
            return;
        }
        throw null;
    }

    public void A08(C2HG c2hg) {
        C48752Gn c48752Gn;
        this.A0G.A05(c2hg);
        if (c2hg.A0C()) {
            c48752Gn = this.A0N;
            c48752Gn.A07(2);
        } else {
            c48752Gn = this.A0N;
            c48752Gn.A07(0);
        }
        c48752Gn.A01 = this.A0C.A06.A03;
        A02();
    }

    public final void A09(final C67883Hf c67883Hf) {
        int color;
        float textSize;
        A02();
        this.A02.A03();
        int i = 0;
        this.A0I.A02 = false;
        C48752Gn c48752Gn = this.A0N;
        AbstractC48762Go abstractC48762Go = c48752Gn.A0B;
        AnonymousClass302 anonymousClass302 = abstractC48762Go.A0C;
        anonymousClass302.A03 = 0;
        anonymousClass302.A01 = 1.0f;
        anonymousClass302.invalidateSelf();
        AnonymousClass302 anonymousClass3022 = abstractC48762Go.A0B;
        anonymousClass3022.A03 = 0;
        anonymousClass3022.A01 = 1.0f;
        anonymousClass3022.invalidateSelf();
        ColorPickerComponent colorPickerComponent = this.A0C;
        colorPickerComponent.A04(false);
        this.A02.A00();
        C2MB c2mb = this.A0O;
        DoodleView doodleView = this.A0G;
        c2mb.A02(doodleView);
        int[] iArr = {abstractC48762Go.getPaddingLeft(), abstractC48762Go.getPaddingTop(), abstractC48762Go.getPaddingRight(), abstractC48762Go.getPaddingBottom()};
        C003701t c003701t = this.A0B;
        C40081rY c40081rY = this.A0A;
        C02E c02e = this.A08;
        Activity activity = this.A00;
        String str = c67883Hf == null ? "" : c67883Hf.A06;
        if (c67883Hf == null) {
            color = colorPickerComponent.A06.A03;
        } else {
            color = ((C2HG) c67883Hf).A02.getColor();
        }
        if (c67883Hf == null) {
            textSize = 0.0f;
        } else {
            textSize = c67883Hf.A09.getTextSize();
            i = c67883Hf.A04;
        }
        final C2HM c2hm = new C2HM(c003701t, c40081rY, c02e, activity, str, color, textSize, i, c48752Gn.A0C, iArr);
        ColorPickerView colorPickerView = colorPickerComponent.A06;
        c2hm.A03 = colorPickerView.getHeight();
        c2hm.A0B = !(colorPickerView.getVisibility() == 0);
        if (c67883Hf != null) {
            this.A0M.A03(c67883Hf);
            doodleView.invalidate();
        }
        c2hm.show();
        c2hm.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.2zh
            {
                C48742Gm.this = this;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C48742Gm c48742Gm = C48742Gm.this;
                C67883Hf c67883Hf2 = c67883Hf;
                C2HM c2hm2 = c2hm;
                if (c67883Hf2 == null) {
                    if (!TextUtils.isEmpty(c2hm2.A0A)) {
                        DoodleView doodleView2 = c48742Gm.A0G;
                        String str2 = c2hm2.A0A;
                        int i2 = c2hm2.A01;
                        int i3 = c2hm2.A02;
                        C67883Hf c67883Hf3 = new C67883Hf(doodleView2.getContext(), doodleView2.A05, doodleView2.A04);
                        c67883Hf3.A0J(str2, i3);
                        ((C2HG) c67883Hf3).A02.setColor(i2);
                        doodleView2.A05(c67883Hf3);
                    }
                } else if (TextUtils.isEmpty(c2hm2.A0A)) {
                    c48742Gm.A0F.A0D = false;
                } else {
                    C2HF c2hf = c48742Gm.A0M;
                    c2hf.A03.A00(c2hf.A04);
                    DoodleView doodleView3 = c48742Gm.A0G;
                    String str3 = c2hm2.A0A;
                    int i4 = c2hm2.A01;
                    int i5 = c2hm2.A02;
                    if (doodleView3 != null) {
                        if (!str3.equals(c67883Hf2.A06) || ((C2HG) c67883Hf2).A02.getColor() != i4 || i5 != c67883Hf2.A04) {
                            C2HF c2hf2 = doodleView3.A0I;
                            c2hf2.A03.A00.add(new C67933Hk(c67883Hf2, c67883Hf2.A01()));
                            c67883Hf2.A0I(i5);
                            c67883Hf2.A0J(str3, i5);
                            ((C2HG) c67883Hf2).A02.setColor(i4);
                            doodleView3.invalidate();
                            if (c67883Hf2 != c2hf2.A01) {
                                doodleView3.A0F.A0D = false;
                            }
                        }
                    } else {
                        throw null;
                    }
                }
                c48742Gm.A0C.setColorAndInvalidate(c2hm2.A01);
                DoodleView doodleView4 = c48742Gm.A0G;
                doodleView4.A03 = c2hm2.A01;
                doodleView4.invalidate();
                C48752Gn c48752Gn2 = c48742Gm.A0N;
                c48752Gn2.A07(0);
                c48752Gn2.A01 = c2hm2.A01;
                c48742Gm.A02.A02();
                c48742Gm.A05();
            }
        });
    }

    public final boolean A0A() {
        boolean z;
        C007203d c007203d = this.A0Q;
        synchronized (c007203d) {
            z = c007203d.A02 != null;
        }
        return z && ((C2IP) c007203d.get()).A0N.getVisibility() == 0;
    }

    public boolean A0B(float f, float f2) {
        if (!A0A()) {
            DoodleView doodleView = this.A0G;
            if (doodleView.A0G.A07 == null) {
                return false;
            }
            if (!doodleView.A08.A02) {
                C2HF c2hf = doodleView.A0I;
                if (c2hf.A02 == null && c2hf.A00(doodleView.A0H.A00(f, f2)) == null) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0016, code lost:
        if (r5.A0G.A00(r6) != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0026, code lost:
        if (r5.A0G.A01(r6) != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0C(android.view.MotionEvent r6) {
        /*
            r5 = this;
            X.2zx r0 = r5.A0I
            boolean r4 = r0.A02
            X.2zz r0 = r5.A0J
            X.2HG r1 = r0.A01
            r0 = 0
            if (r1 == 0) goto Lc
            r0 = 1
        Lc:
            r3 = 0
            if (r0 != 0) goto L18
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r5.A0G
            X.2HG r0 = r0.A00(r6)
            r2 = 0
            if (r0 == 0) goto L19
        L18:
            r2 = 1
        L19:
            X.306 r0 = r5.A0L
            X.2HG r0 = r0.A00
            if (r0 != 0) goto L28
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r5.A0G
            X.2HG r0 = r0.A01(r6)
            r1 = 0
            if (r0 == 0) goto L29
        L28:
            r1 = 1
        L29:
            if (r4 != 0) goto L2f
            if (r2 != 0) goto L2f
            if (r1 == 0) goto L30
        L2f:
            r3 = 1
        L30:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48742Gm.A0C(android.view.MotionEvent):boolean");
    }
}
