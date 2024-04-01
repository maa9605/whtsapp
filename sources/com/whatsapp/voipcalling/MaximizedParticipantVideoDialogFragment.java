package com.whatsapp.voipcalling;

import X.AbstractC02800Cx;
import X.AbstractC74483dL;
import X.C000700j;
import X.C018708s;
import X.C02160Ac;
import X.C02820Cz;
import X.C05W;
import X.C06C;
import X.C0AT;
import X.C28241Qv;
import X.C84663u7;
import X.InterfaceC52052Zt;
import android.animation.Animator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I0_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.MaximizedParticipantVideoDialogFragment;
import com.whatsapp.voipcalling.VideoCallParticipantView;

/* loaded from: classes2.dex */
public class MaximizedParticipantVideoDialogFragment extends Hilt_MaximizedParticipantVideoDialogFragment implements InterfaceC52052Zt {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public View A04;
    public WaTextView A05;
    public WaTextView A06;
    public C05W A07;
    public C018708s A08;
    public C84663u7 A09;
    public VideoCallParticipantView A0A;
    public AbstractC74483dL A0B;
    public boolean A0C = false;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final DialogInterface.OnDismissListener A0H;
    public final Drawable A0I;
    public final View.OnClickListener A0J;
    public final Runnable A0K;

    @Override // X.InterfaceC52052Zt
    public void AVv(VideoCallParticipantView videoCallParticipantView, Point point) {
    }

    public MaximizedParticipantVideoDialogFragment(int i, int i2, int i3, int i4, Drawable drawable, DialogInterface.OnDismissListener onDismissListener, View.OnClickListener onClickListener, Runnable runnable) {
        this.A0H = onDismissListener;
        this.A0J = onClickListener;
        this.A0F = i;
        this.A0G = i2;
        this.A0E = i3;
        this.A0D = i4;
        this.A0I = drawable;
        this.A0K = runnable;
    }

    @Override // com.whatsapp.base.WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0g() {
        super.A0g();
        Dialog A0y = A0y();
        if (A0y.getWindow() != null) {
            A0y.getWindow().setLayout(-1, -1);
            A0y.getWindow().setFlags(1024, 1024);
            A0y.getWindow().clearFlags(2);
            A0y.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        View view;
        Dialog dialog = new Dialog(A09(), R.style.MaximizedVideoCallDialog);
        dialog.setCancelable(true);
        if (dialog.getWindow() != null) {
            dialog.getWindow().requestFeature(1);
        }
        dialog.setContentView(R.layout.group_call_video_maximize_dialog);
        dialog.setOnDismissListener(this.A0H);
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.3bz
            {
                MaximizedParticipantVideoDialogFragment.this = this;
            }

            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = MaximizedParticipantVideoDialogFragment.this;
                if (i == 4 && keyEvent.getAction() == 1) {
                    maximizedParticipantVideoDialogFragment.A19(true);
                    return true;
                }
                return false;
            }
        });
        if (dialog.getWindow() != null) {
            view = dialog.getWindow().getDecorView();
        } else {
            view = null;
        }
        if (view != null && this.A0B != null) {
            this.A0A = (VideoCallParticipantView) C0AT.A0D(view, R.id.video_view);
            this.A06 = (WaTextView) C0AT.A0D(view, R.id.name);
            this.A05 = (WaTextView) C0AT.A0D(view, R.id.name_byline);
            this.A04 = C0AT.A0D(view, R.id.background_overlay);
            View A0D = C0AT.A0D(view, R.id.container);
            VideoCallParticipantView videoCallParticipantView = this.A0A;
            videoCallParticipantView.setLayoutMode(7);
            videoCallParticipantView.A02();
            this.A0A.A0M.setOnClickListener(this.A0J);
            VideoCallParticipantView videoCallParticipantView2 = this.A0A;
            videoCallParticipantView2.A00 = 1.5f;
            videoCallParticipantView2.A03(A01().getDimensionPixelSize(R.dimen.maximized_video_call_rounded_corner));
            this.A0A.setBackgroundColor(-16777216);
            this.A0B.A07(this.A0A);
            CallInfo callInfo = Voip.getCallInfo();
            if (callInfo == null) {
                Log.w("MaximizedParticipantVideoDialogFragment can not get callInfo");
            } else {
                A18((C28241Qv) callInfo.participants.get(this.A0B.A03), callInfo);
                if (callInfo.self.A06.equals(this.A0B.A03)) {
                    this.A06.setText(R.string.you);
                } else {
                    C06C A0A = this.A07.A0A(this.A0B.A03);
                    this.A06.setText(this.A08.A08(A0A, false));
                    if (TextUtils.isEmpty(A0A.A0F)) {
                        this.A05.setText(this.A08.A07(A0A));
                        this.A05.setVisibility(0);
                    }
                }
            }
            A0D.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(this, 16));
            this.A0A.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.3d7
                {
                    MaximizedParticipantVideoDialogFragment.this = this;
                }

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    float f;
                    float f2;
                    MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = MaximizedParticipantVideoDialogFragment.this;
                    maximizedParticipantVideoDialogFragment.A0A.getViewTreeObserver().removeOnPreDrawListener(this);
                    int[] iArr = new int[2];
                    maximizedParticipantVideoDialogFragment.A0A.getLocationOnScreen(iArr);
                    maximizedParticipantVideoDialogFragment.A02 = maximizedParticipantVideoDialogFragment.A0F - iArr[0];
                    maximizedParticipantVideoDialogFragment.A03 = maximizedParticipantVideoDialogFragment.A0G - iArr[1];
                    if (maximizedParticipantVideoDialogFragment.A0A.getWidth() != 0) {
                        f = maximizedParticipantVideoDialogFragment.A0E / maximizedParticipantVideoDialogFragment.A0A.getWidth();
                    } else {
                        f = 1.0f;
                    }
                    maximizedParticipantVideoDialogFragment.A01 = f;
                    if (maximizedParticipantVideoDialogFragment.A0A.getHeight() != 0) {
                        f2 = maximizedParticipantVideoDialogFragment.A0D / maximizedParticipantVideoDialogFragment.A0A.getHeight();
                    } else {
                        f2 = 1.0f;
                    }
                    maximizedParticipantVideoDialogFragment.A00 = f2;
                    VideoCallParticipantView videoCallParticipantView3 = maximizedParticipantVideoDialogFragment.A0A;
                    if (videoCallParticipantView3 != null) {
                        if (maximizedParticipantVideoDialogFragment.A06 != null) {
                            if (maximizedParticipantVideoDialogFragment.A05 != null) {
                                videoCallParticipantView3.setPivotX(0.0f);
                                maximizedParticipantVideoDialogFragment.A0A.setPivotY(0.0f);
                                maximizedParticipantVideoDialogFragment.A0A.setScaleX(maximizedParticipantVideoDialogFragment.A01);
                                maximizedParticipantVideoDialogFragment.A0A.setScaleY(maximizedParticipantVideoDialogFragment.A00);
                                maximizedParticipantVideoDialogFragment.A0A.setTranslationX(maximizedParticipantVideoDialogFragment.A02);
                                maximizedParticipantVideoDialogFragment.A0A.setTranslationY(maximizedParticipantVideoDialogFragment.A03);
                                maximizedParticipantVideoDialogFragment.A0A.animate().setDuration(250L).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setInterpolator(new DecelerateInterpolator(1.5f));
                                AlphaAnimation A03 = C000200d.A03(0.0f, 1.0f, 250L);
                                maximizedParticipantVideoDialogFragment.A06.startAnimation(A03);
                                if (maximizedParticipantVideoDialogFragment.A05.getVisibility() == 0) {
                                    maximizedParticipantVideoDialogFragment.A05.startAnimation(A03);
                                }
                                maximizedParticipantVideoDialogFragment.A1A(true);
                                return true;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
            });
            A0D.setBackground(this.A0I);
        } else {
            C000700j.A08(false, "failed to initialize MaximizedParticipantVideoDialogFragment");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            dialog.getWindow().setNavigationBarColor(C02160Ac.A00(dialog.getContext(), R.color.paletteSurface_1dp));
        }
        return dialog;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void A14(AbstractC02800Cx abstractC02800Cx, String str) {
        if (this.A0C) {
            Log.w("MaximizedParticipantVideoDialogFragment already attached");
            return;
        }
        this.A0C = true;
        if (abstractC02800Cx != null) {
            C02820Cz c02820Cz = new C02820Cz(abstractC02800Cx);
            c02820Cz.A09(0, this, str, 1);
            c02820Cz.A05();
            this.A0K.run();
            return;
        }
        throw null;
    }

    public void A18(C28241Qv c28241Qv, CallInfo callInfo) {
        AbstractC74483dL abstractC74483dL;
        if (A0W() && c28241Qv != null && (abstractC74483dL = this.A0B) != null && this.A0A != null && c28241Qv.A06.equals(abstractC74483dL.A03)) {
            if (!callInfo.callId.equals(Voip.getCurrentCallId())) {
                if (this.A0B.A03.equals(callInfo.self.A06)) {
                    this.A0B.A02();
                }
                A19(false);
            } else if (callInfo.participants.size() <= 2) {
                A19(false);
            } else {
                this.A0B.A06(c28241Qv, callInfo);
            }
        }
    }

    public void A19(boolean z) {
        if (A0W()) {
            Log.i("voip/MaximizedParticipantVideoDialogFragment/dismissDialog");
            C84663u7 c84663u7 = this.A09;
            if (c84663u7 != null) {
                c84663u7.release();
            }
            AbstractC74483dL abstractC74483dL = this.A0B;
            if (abstractC74483dL != null) {
                abstractC74483dL.A03();
            }
            this.A0H.onDismiss(((DialogFragment) this).A03);
            final RunnableEBaseShape7S0100000_I0_7 runnableEBaseShape7S0100000_I0_7 = new RunnableEBaseShape7S0100000_I0_7(this, 38);
            if (this.A0A != null) {
                if (this.A06 != null) {
                    if (this.A05 != null) {
                        this.A0A.animate().setDuration(250L).scaleX(z ? this.A01 : 0.0f).scaleY(z ? this.A00 : 0.0f).translationX(this.A02).translationY(this.A03).setInterpolator(new DecelerateInterpolator(1.5f)).setListener(new Animator.AnimatorListener() { // from class: X.3d8
                            @Override // android.animation.Animator.AnimatorListener
                            public void onAnimationRepeat(Animator animator) {
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public void onAnimationStart(Animator animator) {
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public void onAnimationCancel(Animator animator) {
                                runnableEBaseShape7S0100000_I0_7.run();
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                runnableEBaseShape7S0100000_I0_7.run();
                            }
                        }).start();
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimation.setDuration(250L);
                        this.A06.startAnimation(alphaAnimation);
                        if (this.A05.getVisibility() == 0) {
                            this.A05.startAnimation(alphaAnimation);
                        }
                        A1A(false);
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }

    public final void A1A(boolean z) {
        View view = this.A04;
        if (view != null) {
            view.setAlpha(z ? 0.0f : 0.4f);
            this.A04.animate().setDuration(250L).alpha(z ? 0.4f : 0.0f);
            return;
        }
        throw null;
    }

    @Override // X.InterfaceC52052Zt
    public VideoPort ADq(VideoCallParticipantView videoCallParticipantView) {
        C84663u7 c84663u7 = this.A09;
        if (c84663u7 == null) {
            C84663u7 c84663u72 = new C84663u7(videoCallParticipantView.A0C);
            this.A09 = c84663u72;
            return c84663u72;
        }
        return c84663u7;
    }
}
