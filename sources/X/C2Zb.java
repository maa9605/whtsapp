package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0_0;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I0_6;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Formatter;
import java.util.Locale;

/* renamed from: X.2Zb */
/* loaded from: classes2.dex */
public class C2Zb extends AbstractC51962Zc {
    public InterfaceC73013ax A00;
    public InterfaceC73013ax A01;
    public InterfaceC73013ax A02;
    public C73023ay A03;
    public InterfaceC73033az A04;
    public AbstractC48662Ge A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C;
    public final View A0D;
    public final View A0E;
    public final View A0F;
    public final ViewGroup A0G;
    public final ViewGroup A0H;
    public final AlphaAnimation A0I;
    public final AlphaAnimation A0J;
    public final Animation A0K;
    public final Animation A0L;
    public final ImageButton A0M;
    public final ImageButton A0N;
    public final ImageButton A0O;
    public final ImageButton A0P;
    public final ProgressBar A0Q;
    public final SeekBar A0R;
    public final TextView A0S;
    public final TextView A0T;
    public final C72983au A0U;
    public final Runnable A0V;
    public final StringBuilder A0W;
    public final Formatter A0X;
    public final boolean A0Y;

    public C2Zb(Context context, C72983au c72983au, boolean z) {
        super(context);
        this.A0B = false;
        this.A09 = false;
        this.A0A = false;
        this.A07 = false;
        this.A06 = false;
        this.A08 = false;
        this.A0V = new RunnableEBaseShape7S0100000_I0_7(this, 34);
        this.A0C = new Handler(Looper.myLooper(), new Handler.Callback() { // from class: X.3av
            {
                C2Zb.this = this;
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                AbstractC48662Ge abstractC48662Ge;
                C2Zb c2Zb = C2Zb.this;
                if (c2Zb.A0A && !c2Zb.A07 && (abstractC48662Ge = c2Zb.A05) != null && abstractC48662Ge.A0C() && c2Zb.A05.A03() != 0) {
                    long A02 = (c2Zb.A05.A02() * 1000) / c2Zb.A05.A03();
                    ProgressBar progressBar = c2Zb.A0Q;
                    if (progressBar != null) {
                        progressBar.setProgress((int) A02);
                    }
                    SeekBar seekBar = c2Zb.A0R;
                    if (seekBar != null && !c2Zb.A0B) {
                        seekBar.setProgress((int) A02);
                        c2Zb.A0S.setText(C02180Ae.A0n(c2Zb.A0W, c2Zb.A0X, c2Zb.A05.A02()));
                    }
                }
                c2Zb.A0C.sendEmptyMessageDelayed(0, 50L);
                return true;
            }
        });
        LayoutInflater.from(context).inflate(R.layout.inline_window_control_view, this);
        StringBuilder sb = new StringBuilder();
        this.A0W = sb;
        this.A0X = new Formatter(sb, Locale.getDefault());
        this.A0G = (ViewGroup) findViewById(R.id.controls);
        this.A0M = (ImageButton) findViewById(R.id.close);
        this.A0N = (ImageButton) findViewById(R.id.fullscreen);
        this.A0P = (ImageButton) findViewById(R.id.play_pause);
        this.A0Q = (ProgressBar) findViewById(R.id.minimized_progress_bar);
        View findViewById = findViewById(R.id.footer_view);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(R.id.fullscreen_controls);
        this.A0H = viewGroup;
        this.A0R = (SeekBar) viewGroup.findViewById(R.id.mediacontroller_progress);
        this.A0T = (TextView) this.A0H.findViewById(R.id.time);
        this.A0S = (TextView) this.A0H.findViewById(R.id.time_current);
        this.A0O = z ? null : (ImageButton) findViewById(R.id.logo_button);
        this.A0E = findViewById(R.id.loading);
        this.A0D = findViewById(R.id.background);
        View findViewById2 = findViewById(R.id.header);
        this.A0F = findViewById2;
        findViewById2.setBackground(C02160Ac.A03(getContext(), R.drawable.media_view_header_gradient));
        findViewById.setBackground(C02160Ac.A03(getContext(), R.drawable.media_view_footer_gradient));
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, getAlpha());
        this.A0J = alphaAnimation;
        alphaAnimation.setDuration(250L);
        this.A0J.setInterpolator(new DecelerateInterpolator(1.5f));
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.exo_player_controls_up);
        this.A0L = loadAnimation;
        loadAnimation.setDuration(250L);
        this.A0L.setInterpolator(new DecelerateInterpolator());
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.exo_player_controls_down);
        this.A0K = loadAnimation2;
        loadAnimation2.setDuration(250L);
        this.A0K.setInterpolator(new AccelerateInterpolator());
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(getAlpha(), 0.0f);
        this.A0I = alphaAnimation2;
        alphaAnimation2.setDuration(250L);
        this.A0I.setInterpolator(new AccelerateInterpolator(1.5f));
        this.A0I.setAnimationListener(new C0DJ() { // from class: X.3t6
            {
                C2Zb.this = this;
            }

            @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                C2Zb c2Zb = C2Zb.this;
                c2Zb.removeCallbacks(c2Zb.A0V);
                c2Zb.A08 = false;
                c2Zb.A0G.setVisibility(4);
            }
        });
        this.A0U = c72983au;
        this.A0Y = z;
        onConfigurationChanged(getResources().getConfiguration());
    }

    public void A00() {
        if (this.A08) {
            return;
        }
        ViewGroup viewGroup = this.A0G;
        if (viewGroup.getVisibility() == 4 || this.A05 == null) {
            return;
        }
        this.A08 = true;
        viewGroup.startAnimation(this.A0I);
        this.A0H.startAnimation(this.A0K);
        if (this.A09) {
            setSystemUiVisibility(Build.VERSION.SDK_INT >= 19 ? 4358 : 262);
        }
    }

    public void A01() {
        Runnable runnable = this.A0V;
        removeCallbacks(runnable);
        AbstractC48662Ge abstractC48662Ge = this.A05;
        if (abstractC48662Ge == null || !abstractC48662Ge.A0C()) {
            return;
        }
        postDelayed(runnable, 3000L);
    }

    public void A02() {
        AbstractC48662Ge abstractC48662Ge = this.A05;
        if (abstractC48662Ge == null) {
            return;
        }
        if (abstractC48662Ge.A0C()) {
            C72983au c72983au = this.A0U;
            if (c72983au != null) {
                C3ST c3st = c72983au.A06;
                if (c3st.A02) {
                    c3st.A00();
                }
            }
            this.A05.A06();
        }
        if (this.A0G.getVisibility() != 0) {
            A04();
        }
        removeCallbacks(this.A0V);
        A07();
        A0B(500);
    }

    public void A03() {
        AbstractC48662Ge abstractC48662Ge = this.A05;
        if (abstractC48662Ge == null) {
            return;
        }
        if (!abstractC48662Ge.A0C()) {
            this.A05.A08();
            C72983au c72983au = this.A0U;
            if (c72983au != null) {
                c72983au.A06.A02();
            }
        }
        A01();
        A07();
        A0B(100);
    }

    public void A04() {
        ViewGroup viewGroup = this.A0G;
        viewGroup.setVisibility(0);
        A07();
        viewGroup.startAnimation(this.A0J);
        this.A0H.startAnimation(this.A0L);
        setSystemUiVisibility(0);
        A01();
    }

    public void A05() {
        C73023ay c73023ay = this.A03;
        if (c73023ay != null) {
            c73023ay.A00 = true;
            this.A03 = null;
        }
        this.A0A = false;
        this.A0C.removeCallbacksAndMessages(0);
    }

    public final void A06() {
        if (this.A09) {
            ImageButton imageButton = this.A0N;
            imageButton.setContentDescription(getContext().getString(R.string.exit_fullscreen));
            imageButton.setImageResource(R.drawable.ic_pip_collapse);
            View view = this.A0F;
            view.setPadding(view.getPaddingLeft(), getResources().getDimensionPixelSize(R.dimen.inline_controls_header_padding), view.getPaddingRight(), view.getPaddingBottom());
        } else {
            ImageButton imageButton2 = this.A0N;
            imageButton2.setContentDescription(getContext().getString(R.string.enter_fullscreen));
            imageButton2.setImageResource(R.drawable.ic_pip_expand);
            View view2 = this.A0F;
            view2.setPadding(view2.getPaddingLeft(), 0, view2.getPaddingRight(), view2.getPaddingBottom());
        }
        A01();
    }

    public final void A07() {
        Context context;
        int i;
        AbstractC48662Ge abstractC48662Ge = this.A05;
        if (abstractC48662Ge == null) {
            return;
        }
        boolean A0C = abstractC48662Ge.A0C();
        ImageButton imageButton = this.A0P;
        int i2 = R.drawable.ic_video_play_conv;
        if (A0C) {
            i2 = R.drawable.ic_video_pause_conv;
        }
        imageButton.setImageResource(i2);
        if (A0C) {
            context = getContext();
            i = R.string.pause;
        } else {
            context = getContext();
            i = R.string.play;
        }
        imageButton.setContentDescription(context.getString(i));
    }

    public /* synthetic */ void A08() {
        InterfaceC73013ax interfaceC73013ax = this.A00;
        if (interfaceC73013ax != null) {
            interfaceC73013ax.AIT();
        }
    }

    public /* synthetic */ void A09() {
        InterfaceC73013ax interfaceC73013ax = this.A01;
        if (interfaceC73013ax != null) {
            interfaceC73013ax.AIT();
        }
    }

    public /* synthetic */ void A0A() {
        InterfaceC73013ax interfaceC73013ax = this.A02;
        if (interfaceC73013ax != null) {
            interfaceC73013ax.AIT();
        }
    }

    public void A0B(int i) {
        A05();
        C73023ay c73023ay = new C73023ay(this);
        this.A03 = c73023ay;
        postDelayed(new RunnableEBaseShape7S0100000_I0_7(c73023ay, 32), i);
    }

    public void A0C(int i, int i2) {
        AbstractC48662Ge abstractC48662Ge = this.A05;
        if (abstractC48662Ge == null || abstractC48662Ge.A05() == null) {
            return;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        ofObject.setDuration(150L);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3ab
            {
                C2Zb.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C2Zb.this.A0D(valueAnimator);
            }
        });
        ofObject.start();
    }

    public /* synthetic */ void A0D(ValueAnimator valueAnimator) {
        this.A05.A05().setBackgroundColor(((Number) valueAnimator.getAnimatedValue()).intValue());
    }

    public /* synthetic */ void A0E(AbstractC48662Ge abstractC48662Ge) {
        abstractC48662Ge.A0C();
        if (this.A06) {
            return;
        }
        if (abstractC48662Ge.A0C()) {
            A02();
        } else {
            A03();
        }
    }

    public /* synthetic */ void A0F(AbstractC48662Ge abstractC48662Ge) {
        A05();
        if (this.A0Y && (abstractC48662Ge instanceof C84053t7)) {
            this.A0P.setVisibility(8);
            this.A0Q.setVisibility(8);
            this.A0R.setVisibility(8);
            ViewGroup viewGroup = this.A0G;
            viewGroup.setVisibility(0);
            viewGroup.startAnimation(this.A0J);
        } else {
            abstractC48662Ge.A06();
            abstractC48662Ge.A0A(0);
            A07();
            this.A0Q.setProgress(0);
            this.A0R.setProgress(0);
            this.A0S.setText(C02180Ae.A0n(this.A0W, this.A0X, 0L));
            A0B(500);
            if (this.A0G.getVisibility() != 0) {
                A04();
            }
        }
        C72983au c72983au = this.A0U;
        if (c72983au != null) {
            C3ST c3st = c72983au.A06;
            if (c3st.A02) {
                c3st.A00();
            }
        }
    }

    public void A0G(AbstractC48662Ge abstractC48662Ge, boolean z) {
        this.A07 = z;
        if (abstractC48662Ge instanceof C48652Gd) {
            this.A0E.setVisibility(z ? 0 : 8);
        }
        C72983au c72983au = this.A0U;
        if (c72983au != null) {
            C3ST c3st = c72983au.A03;
            if (z) {
                c3st.A02();
            } else {
                c3st.A00();
            }
        }
    }

    public /* synthetic */ void A0H(AbstractC48662Ge abstractC48662Ge, boolean z) {
        if (abstractC48662Ge.A0C() && z) {
            setKeepScreenOn(true);
        } else {
            setKeepScreenOn(false);
        }
    }

    public AbstractC48662Ge getPlayer() {
        return this.A05;
    }

    public static int[] getViewIdsToIgnoreScaling() {
        return new int[]{R.id.fullscreen, R.id.close, R.id.logo_button, R.id.play_frame, R.id.loading};
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
        TextView textView = this.A0S;
        textView.setPadding(textView.getPaddingLeft(), 0, textView.getPaddingRight(), i);
        SeekBar seekBar = this.A0R;
        seekBar.setPadding(seekBar.getPaddingLeft(), 0, seekBar.getPaddingRight(), i);
        TextView textView2 = this.A0T;
        textView2.setPadding(textView2.getPaddingLeft(), 0, textView2.getPaddingRight(), i);
    }

    public void setBlockPlayButtonInput(boolean z) {
        this.A06 = z;
    }

    public void setCloseBtnListener(InterfaceC73013ax interfaceC73013ax) {
        this.A00 = interfaceC73013ax;
        this.A0M.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(this, 9));
    }

    public void setFullscreenButtonClickListener(InterfaceC73013ax interfaceC73013ax) {
        this.A01 = interfaceC73013ax;
        this.A0N.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(this, 8));
    }

    public void setPlayPauseListener(InterfaceC73033az interfaceC73033az) {
        this.A04 = interfaceC73033az;
    }

    public void setPlayer(final AbstractC48662Ge abstractC48662Ge) {
        this.A05 = abstractC48662Ge;
        ViewGroup viewGroup = this.A0H;
        viewGroup.setBackground(C02160Ac.A03(getContext(), R.drawable.media_view_footer_gradient));
        ImageButton imageButton = this.A0P;
        imageButton.setContentDescription(getContext().getString(R.string.pause));
        imageButton.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0_0(this, abstractC48662Ge, 49));
        this.A0Q.setMax(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        SeekBar seekBar = this.A0R;
        seekBar.setMax(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: X.3aw
            {
                C2Zb.this = this;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar2, int i, boolean z) {
                int i2;
                if (!z || abstractC48662Ge.A03() == -9223372036854775807L) {
                    return;
                }
                C2Zb c2Zb = C2Zb.this;
                TextView textView = c2Zb.A0S;
                StringBuilder sb = c2Zb.A0W;
                Formatter formatter = c2Zb.A0X;
                int progress = seekBar2.getProgress();
                AbstractC48662Ge abstractC48662Ge2 = c2Zb.A05;
                if (abstractC48662Ge2 != null) {
                    i2 = (int) ((abstractC48662Ge2.A03() * progress) / 1000);
                } else {
                    i2 = 0;
                }
                textView.setText(C02180Ae.A0n(sb, formatter, i2));
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar2) {
                C2Zb c2Zb = C2Zb.this;
                c2Zb.A0B = true;
                c2Zb.A05();
                c2Zb.removeCallbacks(c2Zb.A0V);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar2) {
                AbstractC48662Ge abstractC48662Ge2;
                int i;
                C2Zb c2Zb = C2Zb.this;
                c2Zb.A0B = false;
                c2Zb.A0Q.setProgress(seekBar2.getProgress());
                int progress = seekBar2.getProgress();
                if (c2Zb.A05 != null) {
                    i = (int) ((abstractC48662Ge2.A03() * progress) / 1000);
                } else {
                    i = 0;
                }
                AbstractC48662Ge abstractC48662Ge3 = abstractC48662Ge;
                if (i >= abstractC48662Ge3.A03()) {
                    i -= 600;
                }
                abstractC48662Ge3.A0A(i);
                c2Zb.A0B(800);
                c2Zb.A01();
            }
        });
        abstractC48662Ge.A04 = new InterfaceC73143bA() { // from class: X.3sj
            {
                C2Zb.this = this;
            }

            @Override // X.InterfaceC73143bA
            public final void AN3(boolean z, int i) {
                C2Zb.this.A0H(abstractC48662Ge, z);
            }
        };
        abstractC48662Ge.A01 = new InterfaceC73113b7() { // from class: X.3sk
            {
                C2Zb.this = this;
            }

            @Override // X.InterfaceC73113b7
            public final void AIq(AbstractC48662Ge abstractC48662Ge2) {
                C2Zb.this.A0F(abstractC48662Ge2);
            }
        };
        abstractC48662Ge.A00 = new InterfaceC73103b6() { // from class: X.3si
            {
                C2Zb.this = this;
            }

            @Override // X.InterfaceC73103b6
            public final void AI1(AbstractC48662Ge abstractC48662Ge2, boolean z) {
                C2Zb.this.A0G(abstractC48662Ge, z);
            }
        };
        this.A0A = true;
        this.A0C.sendEmptyMessage(0);
        imageButton.setClickable(true);
        imageButton.setVisibility(0);
        this.A0N.setClickable(true);
        A07();
        A06();
        viewGroup.setVisibility(this.A09 ? 0 : 8);
    }

    public void setPlayerElevation(int i) {
        View A05;
        AbstractC48662Ge abstractC48662Ge = this.A05;
        if (abstractC48662Ge == null || (A05 = abstractC48662Ge.A05()) == null || A05.getParent() == null) {
            return;
        }
        C0AT.A0P((View) this.A05.A05().getParent().getParent(), i);
    }
}
