package com.whatsapp.voipcalling;

import X.AbstractC000600i;
import X.AbstractC02800Cx;
import X.AbstractC08940cM;
import X.AbstractC14780nZ;
import X.ActivityC02330At;
import X.AnonymousClass088;
import X.C000200d;
import X.C002301c;
import X.C005102h;
import X.C018708s;
import X.C01B;
import X.C02160Ac;
import X.C02820Cz;
import X.C02E;
import X.C05W;
import X.C07O;
import X.C0AT;
import X.C0BA;
import X.C0EW;
import X.C0L5;
import X.C0MQ;
import X.C0Zn;
import X.C16140pu;
import X.C1V0;
import X.C28971Uq;
import X.C2AR;
import X.C2RY;
import X.C50262Ra;
import X.C84803uN;
import X.C84933ua;
import X.C84963ud;
import X.C86763yE;
import X.InterfaceC02730Cq;
import X.InterfaceC52362ab;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I0_6;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.Button;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetDragIndicator;

/* loaded from: classes2.dex */
public class VoipCallControlBottomSheet extends Hilt_VoipCallControlBottomSheet {
    public static final C84933ua A0g = new AbstractC14780nZ() { // from class: X.3ua
    };
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public View A08;
    public View A09;
    public View A0A;
    public FrameLayout A0B;
    public NestedScrollView A0C;
    public RecyclerView A0D;
    public BottomSheetBehavior A0E;
    public AbstractC000600i A0F;
    public C01B A0G;
    public Button A0H;
    public Button A0I;
    public C05W A0J;
    public C018708s A0K;
    public C0Zn A0L;
    public C0L5 A0M;
    public C02E A0N;
    public C005102h A0O;
    public C002301c A0P;
    public C2AR A0Q;
    public C84803uN A0R;
    public VoipCallControlBottomSheetDragIndicator A0S;
    public VoipCallFooter A0T;
    public C0EW A0U;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0V = true;
    public boolean A0b = false;
    public boolean A0c = false;
    public final C86763yE A0f = new C86763yE(this);
    public final GestureDetector A0d = new GestureDetector(new GestureDetector.SimpleOnGestureListener() { // from class: X.3db
        {
            VoipCallControlBottomSheet.this = this;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (motionEvent != null && motionEvent2 != null && motionEvent.getY() - motionEvent2.getY() > 100.0f && Math.abs(f2) > 100.0f) {
                Log.i("VoipCallControlBottomSheet/SwipeUpListener/onFling/show call control sheet");
                VoipCallControlBottomSheet voipCallControlBottomSheet = VoipCallControlBottomSheet.this;
                BottomSheetBehavior bottomSheetBehavior = voipCallControlBottomSheet.A0E;
                if (bottomSheetBehavior != null) {
                    int i = bottomSheetBehavior.A0B;
                    if (i == 5) {
                        voipCallControlBottomSheet.A1G();
                        voipCallControlBottomSheet.A1Q(true);
                        voipCallControlBottomSheet.A0E.A0O(4);
                    } else if (i == 4) {
                        bottomSheetBehavior.A0O(3);
                        return true;
                    }
                }
                return true;
            }
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }
    });
    public final InterfaceC52362ab A0e = new C84963ud();

    /* JADX WARN: Code restructure failed: missing block: B:22:0x000a, code lost:
        if (r3 == com.whatsapp.voipcalling.Voip.CallState.REJOINING) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int A00(com.whatsapp.voipcalling.CallInfo r4) {
        /*
            com.whatsapp.voipcalling.Voip$CallState r3 = r4.callState
            com.whatsapp.voipcalling.Voip$CallState r0 = com.whatsapp.voipcalling.Voip.CallState.RECEIVED_CALL
            r2 = 0
            if (r3 == r0) goto Lc
            com.whatsapp.voipcalling.Voip$CallState r0 = com.whatsapp.voipcalling.Voip.CallState.REJOINING
            r1 = 0
            if (r3 != r0) goto Ld
        Lc:
            r1 = 1
        Ld:
            boolean r0 = r4.isGroupCall
            if (r0 == 0) goto L17
            if (r1 == 0) goto L1a
            r0 = 2131559317(0x7f0d0395, float:1.8743975E38)
            return r0
        L17:
            if (r1 == 0) goto L1a
            return r2
        L1a:
            r0 = 2131559316(0x7f0d0394, float:1.8743973E38)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallControlBottomSheet.A00(com.whatsapp.voipcalling.CallInfo):int");
    }

    public static void A01(View view, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(C07O.A0L(0.0f, 0.0f, 0.6f, 1.0f));
        alphaAnimation.setDuration(750L);
        alphaAnimation.setRepeatCount(1);
        alphaAnimation.setRepeatMode(2);
        view.startAnimation(alphaAnimation);
    }

    public static void A02(VoipCallControlBottomSheet voipCallControlBottomSheet, int i) {
        if (voipCallControlBottomSheet.A0D == null || voipCallControlBottomSheet.A0C == null) {
            return;
        }
        C000200d.A0q("VoipCallControlBottomSheet scroll to position: ", i);
        voipCallControlBottomSheet.A0f.A0H(null);
        voipCallControlBottomSheet.A0D.post(new RunnableEBaseShape0S0101000_I0(voipCallControlBottomSheet, i, 13));
    }

    public static final boolean A03(CallInfo callInfo) {
        Voip.CallState callState = callInfo.callState;
        return callState == Voip.CallState.PRE_ACCEPT_RECEIVED || callState == Voip.CallState.CALLING || callState == Voip.CallState.RECEIVED_CALL || callState == Voip.CallState.REJOINING || callState == Voip.CallState.ACCEPT_SENT || callInfo.isInLonelyState();
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0e() {
        super.A0e();
        Log.i("VoipCallControlBottomSheet onDetach");
        this.A0a = false;
        RecyclerView recyclerView = this.A0D;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        this.A0E = null;
        this.A08 = null;
        this.A0R = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d3, code lost:
        if (r1 == false) goto L17;
     */
    @Override // X.C0BA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View A0p(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallControlBottomSheet.A0p(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // com.whatsapp.voipcalling.Hilt_VoipCallControlBottomSheet, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        try {
            this.A0R = ((C0MQ) context).A8h();
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement VoipCallControlBottomSheet$HostProvider");
            throw new ClassCastException(sb.toString());
        }
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        Bundle bundle2 = ((C0BA) this).A06;
        if (bundle2 != null) {
            boolean z = bundle2.getBoolean("is_video_call", false);
            int i = R.style.VoipCallControlVoiceBottomSheet;
            if (z) {
                i = R.style.VoipCallControlVideoBottomSheet;
            }
            A12(0, i);
            return;
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void A14(AbstractC02800Cx abstractC02800Cx, String str) {
        C84803uN c84803uN = this.A0R;
        if (c84803uN != null) {
            VoipActivityV2 voipActivityV2 = c84803uN.A00;
            if (voipActivityV2.A1g || voipActivityV2.A0v != null) {
                Log.i("VoipCallControlBottomSheet bottom sheet action is disabled");
                return;
            }
        }
        if (this.A0a) {
            Log.i("VoipCallControlBottomSheet show after attached");
            BottomSheetBehavior bottomSheetBehavior = this.A0E;
            if (bottomSheetBehavior == null || bottomSheetBehavior.A0B != 5) {
                return;
            }
            A1G();
            this.A0E.A0O(4);
            A1Q(true);
            A1E();
            A1F();
            return;
        }
        this.A0a = true;
        Log.i("VoipCallControlBottomSheet attaching bottom sheet");
        if (abstractC02800Cx != null) {
            C02820Cz c02820Cz = new C02820Cz(abstractC02800Cx);
            c02820Cz.A09(0, this, str, 1);
            c02820Cz.A08();
            return;
        }
        throw null;
    }

    public int A18() {
        BottomSheetBehavior bottomSheetBehavior = this.A0E;
        if (bottomSheetBehavior != null) {
            return bottomSheetBehavior.A0I();
        }
        return 0;
    }

    public final CallInfo A19() {
        C84803uN c84803uN = this.A0R;
        if (c84803uN != null) {
            return c84803uN.A00.A1V();
        }
        return null;
    }

    public void A1A() {
        BottomSheetBehavior bottomSheetBehavior = this.A0E;
        if (bottomSheetBehavior == null || !bottomSheetBehavior.A0J) {
            return;
        }
        A1D();
        this.A0E.A0O(5);
    }

    public void A1B() {
        CallInfo A19 = A19();
        if (A19 == null) {
            Log.w("voip/VoipCallControlBottomSheet/failed to get call info when update call state");
        } else if (A19.videoEnabled != A1S()) {
            Log.w("VoipCallControlBottomSheet updateUIState theme not match");
        } else {
            A1O(A19);
            boolean A02 = this.A0R.A02();
            FrameLayout frameLayout = this.A0B;
            if (frameLayout != null && ((Hilt_VoipCallControlBottomSheet) this).A00 != null) {
                int A00 = A00(A19);
                View childAt = frameLayout.getChildAt(0);
                if ((childAt == null || ((Number) childAt.getTag()).intValue() != A00) && A00 != 0) {
                    this.A0B.removeAllViews();
                    View inflate = A04().inflate(A00, (ViewGroup) this.A0B, false);
                    inflate.setTag(Integer.valueOf(A00));
                    this.A0B.addView(inflate, new FrameLayout.LayoutParams(-1, -1, 17));
                    if (A00 == R.layout.voip_call_control_lobby_btns) {
                        this.A0H = (Button) inflate.findViewById(R.id.negative_button);
                        this.A0I = (Button) inflate.findViewById(R.id.positive_button);
                        A1P(A19, A02);
                    } else if (A00 == R.layout.voip_call_control_in_call_btns) {
                        this.A0I = null;
                        this.A0H = null;
                        VoipCallFooter voipCallFooter = (VoipCallFooter) C0AT.A0D(inflate, R.id.footer);
                        this.A0T = voipCallFooter;
                        ActivityC02330At A09 = A09();
                        if (A09 != null && (A09 instanceof VoipActivityV2)) {
                            ((VoipActivityV2) A09).A2P(voipCallFooter, A19.peerJid);
                            boolean z = A19.videoEnabled;
                            VoipCallFooter voipCallFooter2 = this.A0T;
                            if (z) {
                                voipCallFooter2.A01();
                            } else {
                                voipCallFooter2.A00();
                            }
                            this.A0T.A02.setVisibility(0);
                            ((VoipActivityV2) A09()).A2A(A19);
                        } else {
                            Log.w("voip/VoipCallControlBottomSheet/failed to get voip activity");
                            A11();
                        }
                    } else {
                        Log.w("voip/VoipCallControlBottomSheet/invalid button layout");
                    }
                }
            }
            boolean A03 = A03(A19);
            if (A03 != this.A0Y) {
                this.A0Y = A03;
                A1N(A19);
            }
        }
    }

    public final void A1C() {
        View view = this.A08;
        if (view == null || view.getContext() == null) {
            return;
        }
        View view2 = this.A08;
        view2.setElevation(view2.getContext().getResources().getDimension(R.dimen.call_control_bottom_sheet_elevation));
        this.A08.setClipToOutline(true);
        this.A08.setOutlineProvider(new ViewOutlineProvider() { // from class: X.3dZ
            {
                VoipCallControlBottomSheet.this = this;
            }

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view3, Outline outline) {
                float dimension = VoipCallControlBottomSheet.this.A08.getContext().getResources().getDimension(R.dimen.call_control_bottom_sheet_rounded_corner_radius);
                outline.setRoundRect(0, 0, view3.getWidth(), view3.getHeight() + ((int) dimension), dimension);
            }
        });
    }

    public final void A1D() {
        Dialog dialog = ((DialogFragment) this).A03;
        if (dialog == null || dialog.getWindow() == null) {
            return;
        }
        View decorView = ((DialogFragment) this).A03.getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 256 | 4);
    }

    public final void A1E() {
        ActivityC02330At A09 = A09();
        if (A09 != null && this.A0E != null) {
            if (Build.VERSION.SDK_INT > 24 && A09.isInPictureInPictureMode()) {
                return;
            }
            Point point = new Point();
            Rect rect = new Rect();
            ActivityC02330At A092 = A09();
            if (A092 != null) {
                A092.getWindowManager().getDefaultDisplay().getSize(point);
                A09().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            }
            float f = point.y - rect.top;
            this.A02 = (int) (0.75f * f);
            int dimensionPixelSize = A01().getDimensionPixelSize(R.dimen.call_control_bottom_sheet_btn_stub_height);
            CallInfo A19 = A19();
            if (!this.A0Y || (A19 != null && !A19.isGroupCall)) {
                View view = this.A09;
                if (view != null && view.getVisibility() != 8) {
                    dimensionPixelSize += this.A09.getMeasuredHeight();
                }
                int A0I = this.A0E.A0I();
                if (dimensionPixelSize == A0I) {
                    return;
                }
                if (A0I > 0) {
                    C28971Uq c28971Uq = new C28971Uq();
                    c28971Uq.A01 = 500L;
                    c28971Uq.A07(new C1V0() { // from class: X.3yD
                        {
                            VoipCallControlBottomSheet.this = this;
                        }

                        @Override // X.InterfaceC16110pr
                        public void APu(AbstractC16120ps abstractC16120ps) {
                            VoipCallControlBottomSheet voipCallControlBottomSheet = VoipCallControlBottomSheet.this;
                            View view2 = voipCallControlBottomSheet.A08;
                            if (view2 != null) {
                                voipCallControlBottomSheet.A05 = view2.getTop();
                            }
                        }
                    });
                    C16140pu.A01((ViewGroup) this.A08, c28971Uq);
                }
                this.A0E.A0N(dimensionPixelSize);
                return;
            }
            int i = (int) (f * 0.6f);
            int dimensionPixelSize2 = A01().getDimensionPixelSize(R.dimen.contact_picker_row_height);
            this.A0E.A0N(((dimensionPixelSize2 >> 1) - (i % dimensionPixelSize2)) + i);
        }
    }

    public final void A1F() {
        View view = this.A08;
        if (view != null && this.A0E != null) {
            boolean z = false;
            view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (this.A08.getHeight() != this.A08.getMeasuredHeight() || this.A08.getMeasuredHeight() > this.A02) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A08.getLayoutParams();
                marginLayoutParams.height = Math.min(this.A08.getMeasuredHeight(), (int) this.A02);
                this.A08.setLayoutParams(marginLayoutParams);
            }
            if (!this.A0Y || this.A0E.A0I() < this.A08.getMeasuredHeight()) {
                View view2 = this.A09;
                this.A0V = (view2 == null || view2.getVisibility() != 0) ? true : true;
                return;
            }
            this.A0E.A0N(this.A08.getMeasuredHeight());
            this.A0V = false;
        }
    }

    public final void A1G() {
        Dialog dialog = ((DialogFragment) this).A03;
        if (dialog == null || dialog.getWindow() == null) {
            return;
        }
        View decorView = ((DialogFragment) this).A03.getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-5));
    }

    public final void A1H() {
        BottomSheetBehavior bottomSheetBehavior = this.A0E;
        if (bottomSheetBehavior != null) {
            int i = bottomSheetBehavior.A0B;
            if (i == 3) {
                A1Q(false);
                this.A0E.A0O(4);
            } else if (bottomSheetBehavior.A0J) {
                if (i == 5) {
                    A1G();
                    A1Q(true);
                    this.A0E.A0O(4);
                    return;
                }
                A1D();
                this.A0E.A0O(5);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0013, code lost:
        if (r5 <= 0.0f) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1I(float r5) {
        /*
            r4 = this;
            android.app.Dialog r0 = r4.A03
            if (r0 == 0) goto L37
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L37
            boolean r0 = r4.A0V
            r3 = 0
            if (r0 == 0) goto L15
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 1
            if (r0 > 0) goto L16
        L15:
            r1 = 0
        L16:
            android.app.Dialog r0 = r4.A03
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            if (r1 == 0) goto L34
            boolean r0 = r4.A0Y
            if (r0 == 0) goto L38
            float r1 = r4.A01
        L2c:
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            float r1 = r1 * r5
            int r3 = java.lang.Math.round(r1)
        L34:
            r2.setAlpha(r3)
        L37:
            return
        L38:
            float r1 = r4.A00
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallControlBottomSheet.A1I(float):void");
    }

    public final void A1J(int i) {
        C84803uN c84803uN;
        NetworkInfo networkInfo;
        CallInfo A19 = A19();
        if (A19 != null && (c84803uN = this.A0R) != null && ((Hilt_VoipCallControlBottomSheet) this).A00 != null) {
            boolean A02 = c84803uN.A02();
            Intent intent = null;
            if (i == 0) {
                ConnectivityManager A0B = this.A0N.A0B();
                if (A0B != null) {
                    networkInfo = A0B.getActiveNetworkInfo();
                } else {
                    networkInfo = null;
                }
                if (A19.getConnectedParticipantsCount() == 8) {
                    VoipErrorDialogFragment A01 = VoipErrorDialogFragment.A01(7, VoipErrorDialogFragment.A00());
                    ActivityC02330At A09 = A09();
                    if (A09 != null) {
                        A01.A14(A09.A0N(), null);
                    }
                } else {
                    if (networkInfo == null) {
                        VoipErrorDialogFragment A012 = VoipErrorDialogFragment.A01(3, VoipErrorDialogFragment.A00());
                        ActivityC02330At A092 = A09();
                        if (A092 != null) {
                            A012.A14(A092.A0N(), null);
                        }
                    } else {
                        intent = VoipActivityV2.A00(((Hilt_VoipCallControlBottomSheet) this).A00, A02 ? 10 : 3, A19.callId, true);
                    }
                }
            } else if (i == 1) {
                intent = new Intent(((Hilt_VoipCallControlBottomSheet) this).A00, VoipActivityV2.class);
                intent.setAction(VoipActivityV2.A1o);
                intent.putExtra("pendingCall", A02);
                intent.putExtra("call_id", A19.callId);
                intent.setFlags(268435456);
            }
            this.A0O.A04(A19.callId);
            ActivityC02330At A093 = A09();
            if (A093 == null || intent == null) {
                return;
            }
            A093.startActivity(intent);
            return;
        }
        Log.w("voip/VoipCallControlBottomSheet/failed to get call info when build call action intent");
    }

    public void A1K(int i, int i2, int i3, int i4, TimeInterpolator timeInterpolator) {
        BottomSheetBehavior bottomSheetBehavior;
        if (this.A08 == null || (bottomSheetBehavior = this.A0E) == null) {
            return;
        }
        if (bottomSheetBehavior.A0B != 4) {
            i = 0;
            i2 = 0;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(i3, i4);
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(i);
        ofFloat.setStartDelay(i2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3cf
            {
                VoipCallControlBottomSheet.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view = VoipCallControlBottomSheet.this.A08;
                if (view != null) {
                    view.setTranslationY(((Number) valueAnimator.getAnimatedValue()).floatValue());
                }
            }
        });
        ofFloat.start();
    }

    public void A1L(DialogInterface dialogInterface) {
        Dialog dialog = (Dialog) dialogInterface;
        View findViewById = dialog.findViewById(R.id.design_bottom_sheet);
        if (findViewById != null) {
            this.A08 = findViewById;
            BottomSheetBehavior A00 = BottomSheetBehavior.A00(findViewById);
            this.A0E = A00;
            A00.A0E = new AbstractC08940cM() { // from class: X.3uW
                {
                    VoipCallControlBottomSheet.this = this;
                }

                @Override // X.AbstractC08940cM
                public void A00(View view, float f) {
                    C84803uN c84803uN;
                    VoipCallControlBottomSheet voipCallControlBottomSheet = VoipCallControlBottomSheet.this;
                    if (voipCallControlBottomSheet.A0E == null) {
                        return;
                    }
                    voipCallControlBottomSheet.A1I(f);
                    VoipCallControlBottomSheetDragIndicator voipCallControlBottomSheetDragIndicator = voipCallControlBottomSheet.A0S;
                    if (voipCallControlBottomSheetDragIndicator != null) {
                        voipCallControlBottomSheetDragIndicator.setSlideOffset(f);
                    }
                    if (f > 0.0f || (c84803uN = voipCallControlBottomSheet.A0R) == null) {
                        return;
                    }
                    if (voipCallControlBottomSheet.A05 > 0) {
                        c84803uN.A00(view.getTop() - voipCallControlBottomSheet.A05, f);
                    } else {
                        c84803uN.A00((int) ((-voipCallControlBottomSheet.A0E.A0I()) * f), f);
                    }
                    voipCallControlBottomSheet.A05 = view.getTop();
                }

                /* JADX WARN: Code restructure failed: missing block: B:117:0x006a, code lost:
                    if (r13.A0E.A0B != 4) goto L33;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:98:0x001c, code lost:
                    if (r21 != 5) goto L81;
                 */
                @Override // X.AbstractC08940cM
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void A01(android.view.View r20, int r21) {
                    /*
                        Method dump skipped, instructions count: 309
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C84893uW.A01(android.view.View, int):void");
                }
            };
            View findViewById2 = dialog.findViewById(R.id.touch_outside);
            if (findViewById2 != null) {
                findViewById2.setOnTouchListener(new View.OnTouchListener() { // from class: X.3ci
                    {
                        VoipCallControlBottomSheet.this = this;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return VoipCallControlBottomSheet.this.A1T(motionEvent);
                    }
                });
                if (Build.VERSION.SDK_INT >= 21) {
                    A1C();
                }
                CallInfo A19 = A19();
                A1B();
                View view = this.A0A;
                if (view != null) {
                    view.setVisibility(0);
                    A1N(A19);
                    this.A0E.A0J = A1U(A19);
                    C84803uN c84803uN = this.A0R;
                    if (c84803uN != null) {
                        c84803uN.A01(true);
                        return;
                    }
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x0093, code lost:
        if (r18.isEitherSideRequestingUpgrade() != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0115, code lost:
        if (r3 == false) goto L176;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x031f  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1M(com.whatsapp.voipcalling.CallInfo r18) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallControlBottomSheet.A1M(com.whatsapp.voipcalling.CallInfo):void");
    }

    public final void A1N(CallInfo callInfo) {
        if (this.A0E != null && callInfo != null && this.A0R != null) {
            Dialog dialog = ((DialogFragment) this).A03;
            if (dialog != null && dialog.getWindow() != null) {
                ((DialogFragment) this).A03.getWindow().getDecorView().setBackgroundColor(this.A0Y ? this.A06 : this.A03);
                A1I(0.0f);
            }
            this.A0E.A0O(4);
            this.A0E.A0J = A1U(callInfo);
            A1M(callInfo);
            A1E();
            A1F();
            this.A0R.A01(this.A0E.A0B != 5);
            NestedScrollView nestedScrollView = this.A0C;
            if (nestedScrollView != null) {
                nestedScrollView.scrollTo(0, 0);
            }
            C84803uN c84803uN = this.A0R;
            boolean z = this.A0Y;
            if (c84803uN != null) {
                C000200d.A1C("voip/VoipActivityV2/onIsInLobbyChanged/isInLobby ", z);
                VoipActivityV2 voipActivityV2 = c84803uN.A00;
                CallInfo A1V = voipActivityV2.A1V();
                if (A1V == null || !A1V.videoEnabled || A1V.isSelfRequestingUpgrade() || z) {
                    voipActivityV2.A12.postDelayed(new RunnableEBaseShape7S0100000_I0_7(c84803uN, 44), 750L);
                    return;
                } else {
                    voipActivityV2.A0P.postDelayed(new RunnableEBaseShape7S0100000_I0_7(c84803uN, 45), 750L);
                    return;
                }
            }
            throw null;
        }
    }

    public final void A1O(CallInfo callInfo) {
        View view = this.A09;
        if (view == null || this.A0E == null || this.A0S == null) {
            return;
        }
        boolean isSelfRequestingUpgrade = callInfo.isSelfRequestingUpgrade();
        if (isSelfRequestingUpgrade != (view.getVisibility() == 0)) {
            this.A09.setVisibility(isSelfRequestingUpgrade ? 0 : 8);
            this.A0S.setVisibility(isSelfRequestingUpgrade ? 8 : 0);
            this.A0E.A0J = A1U(callInfo);
            A1E();
            if (AnonymousClass088.A1y(this.A0N.A0H()) && isSelfRequestingUpgrade) {
                this.A0E.A0O(4);
                this.A09.postDelayed(new RunnableEBaseShape7S0100000_I0_7(this, 47), 750L);
            }
            C84803uN c84803uN = this.A0R;
            if (c84803uN != null) {
                c84803uN.A01(true);
            }
        }
    }

    public final void A1P(CallInfo callInfo, boolean z) {
        Button button;
        if (this.A0I == null || (button = this.A0H) == null) {
            return;
        }
        button.setText(R.string.voip_joinable_ignore);
        this.A0H.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(this, 33));
        Button button2 = this.A0I;
        button2.setPadding(button2.getPaddingLeft(), 0, this.A0I.getPaddingRight(), 0);
        if (callInfo.getConnectedParticipantsCount() == 8) {
            this.A0I.setText(R.string.voip_joinable_call_full_button);
        } else if (z) {
            Button button3 = this.A0I;
            if (Build.VERSION.SDK_INT >= 27) {
                button3.setAutoSizeTextTypeUniformWithConfiguration(13, 16, 1, 2);
            } else if (button3 instanceof InterfaceC02730Cq) {
                button3.setAutoSizeTextTypeUniformWithConfiguration(13, 16, 1, 2);
            }
            this.A0I.setText(R.string.voip_joinable_group_call_waiting_end_and_join);
        } else {
            Button button4 = this.A0I;
            String A0F = A0F(R.string.voip_joinable_join);
            Dialog dialog = ((DialogFragment) this).A03;
            if (dialog != null && dialog.getContext() != null) {
                TypedValue typedValue = new TypedValue();
                dialog.getContext().getTheme().resolveAttribute(R.attr.voipLobbyPositiveButtonIcon, typedValue, true);
                int dimensionPixelOffset = A01().getDimensionPixelOffset(R.dimen.call_control_bottom_sheet_join_button_icon_size);
                TextPaint paint = button4.getPaint();
                Paint.FontMetricsInt A00 = C2RY.A00(paint);
                int i = dimensionPixelOffset - (A00.bottom - A00.top);
                button4.setPadding(button4.getPaddingLeft(), -i, button4.getPaddingRight(), i);
                Drawable A0I = C07O.A0I(C02160Ac.A03(dialog.getContext(), typedValue.resourceId));
                C07O.A0X(A0I, C02160Ac.A00(dialog.getContext(), R.color.white));
                StringBuilder sb = new StringBuilder("  ");
                sb.append((Object) A0F);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
                C50262Ra.A02(spannableStringBuilder, A0I, paint, dimensionPixelOffset, 0, 1);
                SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                if (this.A0P.A0N()) {
                    spannableStringBuilder2 = TextUtils.concat("\u200f", spannableStringBuilder, String.valueOf((char) 8207));
                }
                button4.setText(spannableStringBuilder2);
            }
        }
        this.A0I.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(this, 34));
    }

    public final void A1Q(boolean z) {
        BottomSheetBehavior bottomSheetBehavior;
        View view = this.A08;
        if (view == null || (bottomSheetBehavior = this.A0E) == null || this.A0Y) {
            return;
        }
        float A0I = bottomSheetBehavior.A0I() * 0.07f;
        if (z) {
            A0I = -A0I;
        }
        view.setTranslationY(A0I);
    }

    public boolean A1R() {
        BottomSheetBehavior bottomSheetBehavior;
        return this.A0a && (bottomSheetBehavior = this.A0E) != null && bottomSheetBehavior.A0B == 3;
    }

    public boolean A1S() {
        int i = ((DialogFragment) this).A02;
        if (i != 0) {
            return i == R.style.VoipCallControlVideoBottomSheet;
        }
        Bundle bundle = ((C0BA) this).A06;
        if (bundle != null) {
            return bundle.getBoolean("is_video_call", false);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x003c, code lost:
        if (r3.isInMultiWindowMode() != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1T(android.view.MotionEvent r10) {
        /*
            r9 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r9.A0E
            r2 = 1
            if (r1 == 0) goto Lb8
            android.view.View r0 = r9.A08
            if (r0 == 0) goto Lb8
            int r1 = r1.A0B
            r0 = 3
            r4 = 0
            if (r1 != r0) goto L10
            r4 = 1
        L10:
            X.3uN r0 = r9.A0R
            if (r0 == 0) goto L67
            com.whatsapp.voipcalling.VoipActivityV2 r1 = r0.A00
            boolean r0 = r1.A1g
            if (r0 != 0) goto L1e
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r1.A0v
            if (r0 == 0) goto L67
        L1e:
            r8 = 1
        L1f:
            float r5 = r10.getX()
            float r7 = r10.getY()
            X.0At r3 = r9.A09()
            if (r3 == 0) goto L64
            if (r4 != 0) goto L64
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L3e
            if (r3 == 0) goto L3e
            boolean r0 = r3.isInMultiWindowMode()
            r6 = 0
            if (r0 != 0) goto L58
        L3e:
            r6 = 25
            android.content.res.Resources r4 = r9.A01()
            java.lang.String r3 = "status_bar_height"
            java.lang.String r1 = "dimen"
            java.lang.String r0 = "android"
            int r1 = r4.getIdentifier(r3, r1, r0)
            if (r1 <= 0) goto L58
            android.content.res.Resources r0 = r9.A01()
            int r6 = r0.getDimensionPixelSize(r1)
        L58:
            float r0 = (float) r6
            float r0 = r0 + r7
            r10.setLocation(r5, r0)
            X.0At r0 = r9.A09()
            r0.dispatchTouchEvent(r10)
        L64:
            if (r8 == 0) goto L69
            return r2
        L67:
            r8 = 0
            goto L1f
        L69:
            android.view.GestureDetector r0 = r9.A0d
            boolean r0 = r0.onTouchEvent(r10)
            if (r0 == 0) goto L72
            return r2
        L72:
            int r0 = r10.getAction()
            if (r0 != r2) goto Lb8
            com.whatsapp.voipcalling.VoipCallControlBottomSheetDragIndicator r3 = r9.A0S
            if (r3 == 0) goto Lb5
            android.view.View r0 = r9.A08
            int r0 = r0.getTop()
            float r4 = (float) r0
            float r4 = r4 - r7
            int r0 = r3.A02
            if (r0 != 0) goto L95
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165354(0x7f0700aa, float:1.7944923E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.A02 = r0
        L95:
            int r0 = r3.getLeft()
            float r0 = (float) r0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto Lb5
            int r0 = r3.getRight()
            float r0 = (float) r0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto Lb5
            int r0 = r3.A02
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto Lb5
            boolean r0 = r3.performClick()
            if (r0 == 0) goto Lb5
            return r2
        Lb5:
            r9.A1H()
        Lb8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallControlBottomSheet.A1T(android.view.MotionEvent):boolean");
    }

    public final boolean A1U(CallInfo callInfo) {
        return (callInfo == null || this.A0Y || !callInfo.videoEnabled || callInfo.isSelfRequestingUpgrade() || AnonymousClass088.A1y(this.A0N.A0H())) ? false : true;
    }
}
