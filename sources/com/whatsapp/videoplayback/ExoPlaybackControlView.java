package com.whatsapp.videoplayback;

import X.AbstractC21230z0;
import X.AbstractC51952Za;
import X.C002301c;
import X.C02180Ae;
import X.C0DJ;
import X.C21220yz;
import X.InterfaceC06290Sl;
import X.InterfaceC72923ao;
import X.InterfaceC72933ap;
import X.InterfaceC72943aq;
import X.View$OnClickListenerC83923su;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.videoplayback.ExoPlaybackControlView;
import java.util.Formatter;
import java.util.Locale;

/* loaded from: classes2.dex */
public class ExoPlaybackControlView extends AbstractC51952Za {
    public AlphaAnimation A00;
    public InterfaceC06290Sl A01;
    public C002301c A02;
    public InterfaceC72923ao A03;
    public InterfaceC72933ap A04;
    public InterfaceC72943aq A05;
    public Long A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final FrameLayout A0A;
    public final FrameLayout A0B;
    public final ImageButton A0C;
    public final ImageView A0D;
    public final LinearLayout A0E;
    public final SeekBar A0F;
    public final TextView A0G;
    public final TextView A0H;
    public final C21220yz A0I;
    public final View$OnClickListenerC83923su A0J;
    public final Runnable A0K;
    public final Runnable A0L;
    public final StringBuilder A0M;
    public final Formatter A0N;

    public ExoPlaybackControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A09 = true;
        this.A07 = true;
        this.A0L = new RunnableEBaseShape7S0100000_I0_7(this, 35);
        this.A0K = new RunnableEBaseShape7S0100000_I0_7(this, 33);
        this.A0I = new C21220yz();
        StringBuilder sb = new StringBuilder();
        this.A0M = sb;
        this.A0N = new Formatter(sb, Locale.getDefault());
        this.A0J = new View$OnClickListenerC83923su(this);
        LayoutInflater.from(context).inflate(R.layout.wa_exoplayer_playback_control_view, this);
        this.A0B = (FrameLayout) findViewById(R.id.main_controls);
        this.A0G = (TextView) findViewById(R.id.time);
        this.A0H = (TextView) findViewById(R.id.time_current);
        this.A0F = (SeekBar) findViewById(R.id.mediacontroller_progress);
        this.A0D = (ImageView) findViewById(R.id.back);
        this.A0E = (LinearLayout) findViewById(R.id.footerView);
        this.A0F.setOnSeekBarChangeListener(this.A0J);
        this.A0F.setMax(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        this.A0A = (FrameLayout) findViewById(R.id.control_frame);
        this.A0C = (ImageButton) findViewById(R.id.play);
        this.A0A.setOnClickListener(this.A0J);
        A04();
        A03();
        A05();
        if (this.A02.A0N()) {
            if (!isInEditMode()) {
                this.A0D.setRotationY(180.0f);
            }
            if (Build.VERSION.SDK_INT < 17) {
                this.A0F.setRotationY(180.0f);
            }
        }
        onConfigurationChanged(getResources().getConfiguration());
    }

    public void A00() {
        InterfaceC06290Sl interfaceC06290Sl;
        if (this.A00 != null) {
            return;
        }
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(1.5f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(getAlpha(), 0.0f);
        this.A00 = alphaAnimation;
        alphaAnimation.setDuration(250L);
        this.A00.setInterpolator(accelerateInterpolator);
        this.A00.setAnimationListener(new C0DJ() { // from class: X.3st
            {
                ExoPlaybackControlView.this = this;
            }

            @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                ExoPlaybackControlView exoPlaybackControlView = ExoPlaybackControlView.this;
                exoPlaybackControlView.setAlpha(1.0f);
                exoPlaybackControlView.removeCallbacks(exoPlaybackControlView.A0L);
                exoPlaybackControlView.removeCallbacks(exoPlaybackControlView.A0K);
                exoPlaybackControlView.A00 = null;
            }
        });
        if (A07()) {
            FrameLayout frameLayout = this.A0B;
            frameLayout.setVisibility(4);
            InterfaceC72943aq interfaceC72943aq = this.A05;
            if (interfaceC72943aq != null) {
                interfaceC72943aq.AQP(frameLayout.getVisibility());
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.exo_player_controls_down);
            loadAnimation.setDuration(250L);
            loadAnimation.setInterpolator(accelerateInterpolator);
            Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.exo_player_back_button_up);
            loadAnimation2.setDuration(250L);
            loadAnimation2.setInterpolator(accelerateInterpolator);
            this.A0D.startAnimation(loadAnimation2);
            frameLayout.startAnimation(this.A00);
            this.A0E.startAnimation(loadAnimation);
        }
        if (this.A07) {
            FrameLayout frameLayout2 = this.A0A;
            if (frameLayout2.getVisibility() == 0 && (interfaceC06290Sl = this.A01) != null && interfaceC06290Sl.ACR()) {
                if (this.A01.ACT() == 3 || this.A01.ACT() == 2) {
                    frameLayout2.setVisibility(4);
                    frameLayout2.startAnimation(this.A00);
                }
            }
        }
    }

    public void A01() {
        FrameLayout frameLayout = this.A0B;
        frameLayout.setVisibility(0);
        InterfaceC72943aq interfaceC72943aq = this.A05;
        if (interfaceC72943aq != null) {
            interfaceC72943aq.AQP(frameLayout.getVisibility());
        }
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(1.5f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, getAlpha());
        alphaAnimation.setDuration(250L);
        alphaAnimation.setInterpolator(decelerateInterpolator);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.exo_player_controls_up);
        loadAnimation.setDuration(250L);
        loadAnimation.setInterpolator(decelerateInterpolator);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.exo_player_back_button_down);
        loadAnimation2.setDuration(250L);
        loadAnimation2.setInterpolator(decelerateInterpolator);
        FrameLayout frameLayout2 = this.A0A;
        if (frameLayout2.getVisibility() == 4 && this.A07) {
            frameLayout2.setVisibility(0);
            frameLayout2.startAnimation(alphaAnimation);
            this.A0C.sendAccessibilityEvent(8);
        }
        frameLayout.startAnimation(alphaAnimation);
        this.A0E.startAnimation(loadAnimation);
        this.A0D.startAnimation(loadAnimation2);
        A04();
        A03();
        A05();
    }

    public void A02() {
        if (this.A07) {
            this.A0A.setVisibility(0);
        }
        this.A0B.setVisibility(4);
        A04();
        A03();
        A05();
    }

    public final void A03() {
        if (A07()) {
            if (this.A06 == null) {
                InterfaceC06290Sl interfaceC06290Sl = this.A01;
                AbstractC21230z0 A9X = interfaceC06290Sl != null ? interfaceC06290Sl.A9X() : null;
                boolean z = false;
                if (A9X != null && !A9X.A0D()) {
                    int A9Y = this.A01.A9Y();
                    C21220yz c21220yz = this.A0I;
                    A9X.A0A(A9Y, c21220yz);
                    z = c21220yz.A03;
                }
                this.A0F.setEnabled(z);
                return;
            }
            this.A0F.setEnabled(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0013, code lost:
        if (r0.ACR() == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A04() {
        /*
            r4 = this;
            android.widget.FrameLayout r0 = r4.A0A
            int r1 = r0.getVisibility()
            r0 = 4
            if (r1 != r0) goto La
            return
        La:
            X.0Sl r0 = r4.A01
            if (r0 == 0) goto L15
            boolean r0 = r0.ACR()
            r3 = 1
            if (r0 != 0) goto L16
        L15:
            r3 = 0
        L16:
            android.widget.ImageButton r2 = r4.A0C
            r0 = 2131231753(0x7f080409, float:1.8079596E38)
            if (r3 == 0) goto L20
            r0 = 2131231751(0x7f080407, float:1.8079592E38)
        L20:
            r2.setImageResource(r0)
            X.01c r1 = r4.A02
            r0 = 2131887389(0x7f12051d, float:1.9409384E38)
            if (r3 == 0) goto L2d
            r0 = 2131887388(0x7f12051c, float:1.9409382E38)
        L2d:
            java.lang.String r0 = r1.A07(r0)
            r2.setContentDescription(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.videoplayback.ExoPlaybackControlView.A04():void");
    }

    public final void A05() {
        SeekBar seekBar;
        int ACT;
        int i;
        int i2;
        if (A07()) {
            if (this.A06 == null) {
                InterfaceC06290Sl interfaceC06290Sl = this.A01;
                String A0n = C02180Ae.A0n(this.A0M, this.A0N, interfaceC06290Sl == null ? 0L : interfaceC06290Sl.A9q());
                TextView textView = this.A0G;
                if (textView.getText() == null || !A0n.equals(textView.getText().toString())) {
                    textView.setText(A0n);
                }
            }
            if (this.A09) {
                InterfaceC06290Sl interfaceC06290Sl2 = this.A01;
                long A8b = interfaceC06290Sl2 == null ? 0L : interfaceC06290Sl2.A8b();
                seekBar = this.A0F;
                long duration = getDuration();
                if (duration != -9223372036854775807L && duration != 0) {
                    i2 = (int) ((A8b * 1000) / duration);
                } else {
                    i2 = 0;
                }
                seekBar.setSecondaryProgress(i2);
            } else {
                seekBar = this.A0F;
                seekBar.setSecondaryProgress(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
            }
            InterfaceC06290Sl interfaceC06290Sl3 = this.A01;
            long A9U = interfaceC06290Sl3 != null ? interfaceC06290Sl3.A9U() : 0L;
            if (!this.A08) {
                String A0n2 = C02180Ae.A0n(this.A0M, this.A0N, A9U);
                TextView textView2 = this.A0H;
                if (textView2.getText() == null || !A0n2.equals(textView2.getText().toString())) {
                    textView2.setText(A0n2);
                }
            }
            if (!this.A08) {
                long duration2 = getDuration();
                if (duration2 != -9223372036854775807L && duration2 != 0) {
                    i = (int) ((A9U * 1000) / duration2);
                } else {
                    i = 0;
                }
                seekBar.setProgress(i);
            }
            Runnable runnable = this.A0L;
            removeCallbacks(runnable);
            InterfaceC06290Sl interfaceC06290Sl4 = this.A01;
            if (interfaceC06290Sl4 == null || (ACT = interfaceC06290Sl4.ACT()) == 1 || ACT == 4) {
                return;
            }
            long j = 1000;
            if (this.A01.ACR() && ACT == 3) {
                long j2 = 1000 - (A9U % 1000);
                j = j2 < 200 ? 1000 + j2 : j2;
            }
            postDelayed(runnable, j);
        }
    }

    public void A06(int i) {
        Runnable runnable = this.A0K;
        removeCallbacks(runnable);
        InterfaceC06290Sl interfaceC06290Sl = this.A01;
        if (interfaceC06290Sl != null && interfaceC06290Sl.ACR()) {
            postDelayed(runnable, i);
        }
        if (this.A00 != null) {
            clearAnimation();
            this.A00 = null;
        }
    }

    public boolean A07() {
        return this.A0B.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.A01 != null && keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 85) {
                        InterfaceC06290Sl interfaceC06290Sl = this.A01;
                        interfaceC06290Sl.ATc(!interfaceC06290Sl.ACR());
                    } else if (keyCode == 126) {
                        this.A01.ATc(true);
                    } else if (keyCode == 127) {
                        this.A01.ATc(false);
                    } else {
                        switch (keyCode) {
                            case 87:
                                InterfaceC06290Sl interfaceC06290Sl2 = this.A01;
                                if (interfaceC06290Sl2 == null) {
                                    throw null;
                                }
                                AbstractC21230z0 A9X = interfaceC06290Sl2.A9X();
                                if (A9X != null) {
                                    int A9Y = this.A01.A9Y();
                                    if (A9Y < A9X.A01() - 1) {
                                        this.A01.ASK(A9Y + 1);
                                        break;
                                    } else {
                                        A9X.A0B(A9Y, this.A0I, false, 0L);
                                        break;
                                    }
                                }
                                break;
                            case 88:
                                InterfaceC06290Sl interfaceC06290Sl3 = this.A01;
                                if (interfaceC06290Sl3 == null) {
                                    throw null;
                                }
                                AbstractC21230z0 A9X2 = interfaceC06290Sl3.A9X();
                                if (A9X2 != null) {
                                    int A9Y2 = this.A01.A9Y();
                                    A9X2.A0A(A9Y2, this.A0I);
                                    if (A9Y2 > 0 && this.A01.A9U() <= 3000) {
                                        this.A01.ASK(A9Y2 - 1);
                                        break;
                                    } else {
                                        this.A01.ASJ(0L);
                                        break;
                                    }
                                }
                                break;
                            case 89:
                                break;
                            case 90:
                                break;
                            default:
                                return false;
                        }
                    }
                    A01();
                    return true;
                }
                InterfaceC06290Sl interfaceC06290Sl4 = this.A01;
                if (interfaceC06290Sl4 != null) {
                    interfaceC06290Sl4.ASJ(Math.min(interfaceC06290Sl4.A9U() + 15000, this.A01.A9q()));
                    A01();
                    return true;
                }
                throw null;
            }
            InterfaceC06290Sl interfaceC06290Sl5 = this.A01;
            if (interfaceC06290Sl5 != null) {
                interfaceC06290Sl5.ASJ(Math.max(interfaceC06290Sl5.A9U() - 5000, 0L));
                A01();
                return true;
            }
            throw null;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public long getDuration() {
        Long l = this.A06;
        if (l != null) {
            return l.longValue();
        }
        InterfaceC06290Sl interfaceC06290Sl = this.A01;
        if (interfaceC06290Sl == null) {
            return -9223372036854775807L;
        }
        return interfaceC06290Sl.A9q();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        float A00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            A00 = C02180Ae.A00(getContext(), 20.0f);
        } else {
            A00 = C02180Ae.A00(getContext(), 30.0f);
        }
        int i = (int) A00;
        TextView textView = this.A0H;
        textView.setPadding(textView.getPaddingLeft(), i, textView.getPaddingRight(), i);
        SeekBar seekBar = this.A0F;
        seekBar.setPadding(seekBar.getPaddingLeft(), i, seekBar.getPaddingRight(), i);
        TextView textView2 = this.A0G;
        textView2.setPadding(textView2.getPaddingLeft(), i, textView2.getPaddingRight(), i);
    }

    public void setDuration(long j) {
        Long valueOf = Long.valueOf(j);
        this.A06 = valueOf;
        this.A0G.setText(C02180Ae.A0n(this.A0M, this.A0N, valueOf.longValue()));
        A05();
        A03();
    }

    public void setPlayButtonClickListener(InterfaceC72923ao interfaceC72923ao) {
        this.A03 = interfaceC72923ao;
    }

    public void setPlayControlVisibility(int i) {
        this.A07 = i == 0;
        this.A0A.setVisibility(i);
    }

    public void setPlayer(InterfaceC06290Sl interfaceC06290Sl) {
        InterfaceC06290Sl interfaceC06290Sl2 = this.A01;
        if (interfaceC06290Sl2 != null) {
            interfaceC06290Sl2.ARO(this.A0J);
        }
        this.A01 = interfaceC06290Sl;
        if (interfaceC06290Sl != null) {
            interfaceC06290Sl.A5D(this.A0J);
        }
        A04();
        A03();
        A05();
    }

    public void setSeekbarStartTrackingTouchListener(InterfaceC72933ap interfaceC72933ap) {
        this.A04 = interfaceC72933ap;
    }

    public void setStreaming(boolean z) {
        this.A09 = z;
    }

    public void setVisibilityListener(InterfaceC72943aq interfaceC72943aq) {
        this.A05 = interfaceC72943aq;
    }
}
