package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.mediacomposer.doodle.ColorPickerComponent;
import com.whatsapp.mediacomposer.doodle.DoodleEditText;

/* renamed from: X.2HM  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2HM extends Dialog {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public View A04;
    public WaImageView A05;
    public WaTextView A06;
    public ColorPickerComponent A07;
    public DoodleEditText A08;
    public AnonymousClass302 A09;
    public String A0A;
    public boolean A0B;
    public int[] A0C;
    public final ValueAnimator A0D;
    public final C02E A0E;
    public final C40081rY A0F;
    public final C003701t A0G;
    public final boolean A0H;

    public C2HM(C003701t c003701t, C40081rY c40081rY, C02E c02e, Activity activity, String str, int i, float f, int i2, boolean z, int[] iArr) {
        super(activity, R.style.DoodleTextDialog);
        this.A0D = ValueAnimator.ofFloat(0.8f, 1.0f);
        this.A0G = c003701t;
        this.A0F = c40081rY;
        this.A0E = c02e;
        this.A0A = str;
        this.A01 = i;
        this.A0C = iArr;
        this.A00 = f;
        this.A02 = i2;
        this.A0H = z;
    }

    public final void A00(CharSequence charSequence) {
        int width = this.A08.getWidth();
        int i = 25;
        int i2 = 50;
        while (true) {
            int i3 = i2 - i;
            if (i3 > 1) {
                float f = (i3 >> 1) + i;
                this.A00 = f;
                this.A08.setTextSize(f);
                if (Layout.getDesiredWidth(charSequence, this.A08.getPaint()) >= width) {
                    i2 = (int) this.A00;
                } else {
                    i = (int) this.A00;
                }
            } else {
                this.A08.setTextSize(this.A00 - 1.0f);
                return;
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.A0B) {
            this.A07.A04(true);
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        ColorPickerComponent colorPickerComponent;
        View view;
        super.onCreate(bundle);
        setContentView(R.layout.doodle_text_entry);
        getWindow().setLayout(-1, -1);
        getWindow().setFlags(1024, 1024);
        getWindow().clearFlags(256);
        C0K7.A00(this.A0E, getWindow(), findViewById(R.id.main));
        this.A09 = new AnonymousClass302(getContext(), this.A0G, 0);
        this.A06 = (WaTextView) findViewById(R.id.font_picker_preview);
        this.A07 = (ColorPickerComponent) findViewById(R.id.color_picker_component);
        View findViewById = findViewById(R.id.picker_button_container);
        this.A04 = findViewById;
        int[] iArr = this.A0C;
        findViewById.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
        int i = this.A03;
        if (i > 0) {
            this.A07.setMaxHeight(i);
        }
        if (this.A0B) {
            this.A07.A00();
        }
        this.A07.setColorAndInvalidate(this.A01);
        boolean z = this.A0H;
        if (!z && (view = (colorPickerComponent = this.A07).A04) != null) {
            view.setVisibility(8);
            View view2 = colorPickerComponent.A03;
            view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), (int) colorPickerComponent.getResources().getDimension(R.dimen.color_picker_text_entry_bottom_padding));
        }
        if (z) {
            ValueAnimator valueAnimator = this.A0D;
            valueAnimator.setInterpolator(C07O.A0L(0.5f, 1.35f, 0.4f, 1.0f));
            valueAnimator.setDuration(400L);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.2zl
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    C2HM c2hm = C2HM.this;
                    AnonymousClass302 anonymousClass302 = c2hm.A09;
                    int i2 = c2hm.A01;
                    float floatValue = ((Number) valueAnimator2.getAnimatedValue()).floatValue();
                    anonymousClass302.A03 = i2;
                    anonymousClass302.A01 = floatValue;
                    anonymousClass302.invalidateSelf();
                }
            });
            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: X.301
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ValueAnimator valueAnimator2 = C2HM.this.A0D;
                    valueAnimator2.removeAllListeners();
                    valueAnimator2.removeAllUpdateListeners();
                }
            });
            valueAnimator.start();
        } else {
            AnonymousClass302 anonymousClass302 = this.A09;
            anonymousClass302.A03 = this.A01;
            anonymousClass302.A01 = 1.0f;
            anonymousClass302.invalidateSelf();
        }
        DoodleEditText doodleEditText = (DoodleEditText) findViewById(R.id.text);
        this.A08 = doodleEditText;
        doodleEditText.setTextColor(this.A01);
        this.A08.setText(this.A0A);
        this.A08.setFontStyle(this.A02);
        DoodleEditText doodleEditText2 = this.A08;
        int length = this.A0A.length();
        doodleEditText2.setSelection(length, length);
        this.A08.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.2zk
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                C2HM c2hm = C2HM.this;
                if (i2 == 6) {
                    c2hm.A0A = textView.getText().toString();
                    c2hm.dismiss();
                    return true;
                }
                return false;
            }
        });
        DoodleEditText doodleEditText3 = this.A08;
        doodleEditText3.A01 = new InterfaceC63472zq() { // from class: X.3Gy
            @Override // X.InterfaceC63472zq
            public final boolean ALE(int i2, KeyEvent keyEvent) {
                C2HM c2hm = C2HM.this;
                if (i2 == 4 && keyEvent.getAction() == 1) {
                    c2hm.A0A = c2hm.A08.getText().toString();
                    c2hm.dismiss();
                    return false;
                }
                return false;
            }
        };
        doodleEditText3.addTextChangedListener(new C2JT() { // from class: X.3H6
            @Override // X.C2JT, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                C2HM c2hm = C2HM.this;
                C002701i.A1D(editable, c2hm.getContext(), c2hm.A08.getPaint(), 1.3f, c2hm.A0F);
                c2hm.A00(editable);
            }
        });
        WaImageView waImageView = (WaImageView) findViewById(R.id.font_picker_btn);
        this.A05 = waImageView;
        waImageView.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 47));
        this.A05.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.2zj
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view3) {
                C2HM c2hm = C2HM.this;
                int i2 = (c2hm.A02 - 1) % 4;
                c2hm.A02 = i2;
                c2hm.A08.setFontStyle(i2);
                c2hm.A08.setTextColor(c2hm.A01);
                c2hm.A06.setTypeface(c2hm.A08.getTypeface());
                return true;
            }
        });
        this.A07.A03(null, null, new InterfaceC63432zm() { // from class: X.3H7
            @Override // X.InterfaceC63432zm
            public void AQ6() {
            }

            @Override // X.InterfaceC63432zm
            public void AIi(float f, int i2) {
                C2HM c2hm = C2HM.this;
                c2hm.A01 = i2;
                c2hm.A08.setTextColor(i2);
                AnonymousClass302 anonymousClass3022 = c2hm.A09;
                anonymousClass3022.A03 = i2;
                anonymousClass3022.A01 = 1.0f;
                anonymousClass3022.invalidateSelf();
                c2hm.A08.setFontStyle(c2hm.A02);
            }
        });
        this.A05.setImageDrawable(this.A09);
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: X.300
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view3, MotionEvent motionEvent) {
                motionEvent.getX();
                motionEvent.getY();
                return false;
            }
        };
        findViewById(R.id.main).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 48));
        findViewById(R.id.main).setOnTouchListener(onTouchListener);
        getWindow().setSoftInputMode(5);
        this.A08.post(new RunnableEBaseShape4S0100000_I0_4(this, 3));
        this.A08.A02(false);
    }
}
