package com.whatsapp.search.views;

import X.AnonymousClass088;
import X.C002301c;
import X.C018708s;
import X.C02160Ac;
import X.C02E;
import X.C05W;
import X.C09990f7;
import X.C0AS;
import X.C0AT;
import X.C25h;
import X.C40731sm;
import X.C53422gt;
import X.C80793nr;
import X.InterfaceC02360Aw;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I0_4;
import com.google.android.material.chip.Chip;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.search.views.TokenizedSearchInput;
import com.whatsapp.text.FinalBackspaceAwareEntry;

/* loaded from: classes2.dex */
public class TokenizedSearchInput extends C25h {
    public int A00;
    public int A01;
    public View.OnClickListener A02;
    public View.OnKeyListener A03;
    public TextView.OnEditorActionListener A04;
    public C0AS A05;
    public InterfaceC02360Aw A06;
    public C05W A07;
    public C018708s A08;
    public C02E A09;
    public C002301c A0A;
    public UserJid A0B;
    public SearchViewModel A0C;
    public C80793nr A0D;
    public Integer A0E;
    public Runnable A0F;
    public Runnable A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public final View.OnFocusChangeListener A0K;
    public final View A0L;
    public final Chip A0M;
    public final Chip A0N;
    public final WaImageButton A0O;
    public final WaImageView A0P;
    public final FinalBackspaceAwareEntry A0Q;

    public TokenizedSearchInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A0J = false;
        this.A0H = "";
        this.A0E = 0;
        this.A00 = 0;
        this.A01 = 0;
        this.A0D = new C80793nr(this);
        this.A04 = new TextView.OnEditorActionListener() { // from class: X.3Vi
            {
                TokenizedSearchInput.this = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                SearchViewModel searchViewModel = TokenizedSearchInput.this.A0C;
                if (searchViewModel == null || i != 3) {
                    return false;
                }
                searchViewModel.A0L(false);
                return true;
            }
        };
        this.A03 = new View.OnKeyListener() { // from class: X.3Vg
            {
                TokenizedSearchInput.this = this;
            }

            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                TokenizedSearchInput tokenizedSearchInput = TokenizedSearchInput.this;
                if (tokenizedSearchInput.A0C != null && keyEvent != null) {
                    if ((keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) && keyEvent.getAction() == 1) {
                        tokenizedSearchInput.A0C.A0L(false);
                        return true;
                    }
                    return false;
                }
                return false;
            }
        };
        this.A02 = new ViewOnClickEBaseShape4S0100000_I0_4(this, 8);
        this.A05 = new C0AS() { // from class: X.3ns
            {
                TokenizedSearchInput.this = this;
            }

            @Override // X.C0AS
            public void A02(View view, AccessibilityEvent accessibilityEvent) {
                this.A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
                TokenizedSearchInput tokenizedSearchInput = TokenizedSearchInput.this;
                if (AnonymousClass088.A1y(tokenizedSearchInput.A09.A0H()) && accessibilityEvent.getEventType() == 1) {
                    TokenizedSearchInput.A00(tokenizedSearchInput, view);
                }
            }

            @Override // X.C0AS
            public void A04(View view, C08420bS c08420bS) {
                View.AccessibilityDelegate accessibilityDelegate = this.A01;
                AccessibilityNodeInfo accessibilityNodeInfo = c08420bS.A02;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                TokenizedSearchInput tokenizedSearchInput = TokenizedSearchInput.this;
                if (AnonymousClass088.A1y(tokenizedSearchInput.A09.A0H())) {
                    if (Build.VERSION.SDK_INT < 23) {
                        c08420bS.A08(tokenizedSearchInput.getContext().getString(R.string.accessibility_role_button));
                    }
                    accessibilityNodeInfo.setClassName(Button.class.getName());
                    accessibilityNodeInfo.setCheckable(false);
                    accessibilityNodeInfo.setClickable(true);
                    c08420bS.A06(new C08440bU(16, tokenizedSearchInput.getContext().getString(R.string.accessibility_action_click_remove)));
                }
            }
        };
        this.A0K = new View.OnFocusChangeListener() { // from class: X.3Vj
            {
                TokenizedSearchInput.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                TokenizedSearchInput.this.A0C.A0L(z);
            }
        };
        LayoutInflater from = LayoutInflater.from(context);
        setOrientation(0);
        setGravity(16);
        from.inflate(R.layout.search_input, (ViewGroup) this, true);
        this.A0N = (Chip) C0AT.A0D(this, R.id.type_token);
        this.A0M = (Chip) C0AT.A0D(this, R.id.chat_token);
        this.A0Q = (FinalBackspaceAwareEntry) C0AT.A0D(this, R.id.search_input);
        this.A0P = (WaImageView) C0AT.A0D(this, R.id.search_clear_btn);
        this.A0L = C0AT.A0D(this, R.id.focus_dummy);
        this.A0O = (WaImageButton) C0AT.A0D(this, R.id.grid_list_toggle);
    }

    public static void A00(TokenizedSearchInput tokenizedSearchInput, View view) {
        SearchViewModel searchViewModel = tokenizedSearchInput.A0C;
        if (searchViewModel != null) {
            if (view == tokenizedSearchInput.A0N) {
                searchViewModel.A0H(0);
            } else if (view == tokenizedSearchInput.A0M) {
                searchViewModel.A0I(null);
            }
        }
        tokenizedSearchInput.postDelayed(new RunnableEBaseShape6S0100000_I0_6(tokenizedSearchInput, 11), 100L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0015, code lost:
        if (r8.A0E.intValue() != 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0062, code lost:
        if (r4 == 8) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0064, code lost:
        r7.setVisibility(4);
        A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0079, code lost:
        if (r4 == 8) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A01() {
        /*
            r8 = this;
            com.whatsapp.WaImageView r2 = r8.A0P
            com.whatsapp.jid.UserJid r0 = r8.A0B
            if (r0 != 0) goto L17
            java.lang.String r0 = r8.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L17
            java.lang.Integer r0 = r8.A0E
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == 0) goto L18
        L17:
            r0 = 0
        L18:
            r1 = 1
            r0 = r0 ^ r1
            r2.setEnabled(r0)
            com.whatsapp.WaImageButton r7 = r8.A0O
            boolean r0 = r8.A0I
            r7.setEnabled(r0)
            boolean r0 = r8.A0J
            r2 = 50
            if (r0 == 0) goto Laa
            com.whatsapp.search.SearchViewModel r0 = r8.A0C
            if (r0 == 0) goto L76
            int r0 = r8.A01
            if (r0 == 0) goto L88
            if (r0 != r1) goto La4
            r0 = 2131231730(0x7f0803f2, float:1.807955E38)
            r7.setImageResource(r0)
            android.content.Context r1 = r8.getContext()
            r0 = 2131890061(0x7f120f8d, float:1.9414803E38)
            java.lang.String r0 = r1.getString(r0)
            r7.setContentDescription(r0)
        L48:
            int r6 = r7.getVisibility()
            boolean r0 = r8.A0I
            r5 = 8
            r1 = 4
            if (r0 == 0) goto L7c
            r4 = 0
        L54:
            boolean r0 = r8.A0J
            if (r0 == 0) goto L5e
            r7.setVisibility(r4)
            r8.A02()
        L5e:
            if (r6 != r5) goto L77
            if (r4 == r5) goto L9d
            if (r4 != r5) goto L6a
        L64:
            r7.setVisibility(r1)
            r8.A02()
        L6a:
            r1 = 10
            java.lang.RunnableEBaseShape0S0101000_I0 r0 = new java.lang.RunnableEBaseShape0S0101000_I0
            r0.<init>(r8, r4, r1)
            r8.A0F = r0
            r8.postDelayed(r0, r2)
        L76:
            return
        L77:
            if (r6 == r5) goto L9d
            if (r4 != r5) goto L9d
            goto L64
        L7c:
            com.whatsapp.search.SearchViewModel r0 = r8.A0C
            boolean r0 = r0.A0M()
            r4 = 8
            if (r0 == 0) goto L54
            r4 = 4
            goto L54
        L88:
            r0 = 2131231729(0x7f0803f1, float:1.8079547E38)
            r7.setImageResource(r0)
            android.content.Context r1 = r8.getContext()
            r0 = 2131890060(0x7f120f8c, float:1.9414801E38)
            java.lang.String r0 = r1.getString(r0)
            r7.setContentDescription(r0)
            goto L48
        L9d:
            r7.setVisibility(r4)
            r8.A02()
            return
        La4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        Laa:
            java.lang.Runnable r0 = r8.A0G
            if (r0 == 0) goto Lb1
            r8.removeCallbacks(r0)
        Lb1:
            java.lang.Runnable r0 = r8.A0F
            if (r0 == 0) goto Lb8
            r8.removeCallbacks(r0)
        Lb8:
            r1 = 12
            java.lang.RunnableEBaseShape6S0100000_I0_6 r0 = new java.lang.RunnableEBaseShape6S0100000_I0_6
            r0.<init>(r8, r1)
            r8.A0G = r0
            r8.postDelayed(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.TokenizedSearchInput.A01():void");
    }

    public final void A02() {
        if (this.A0B == null && TextUtils.isEmpty(this.A0H) && this.A0E.intValue() == 0) {
            this.A0P.setVisibility(4);
        } else {
            this.A0P.setVisibility(0);
        }
    }

    public final void A03() {
        if (this.A0B == null || this.A0E.intValue() == 0) {
            this.A0Q.setHint(getContext().getString(R.string.search_hint));
        } else {
            this.A0Q.setHint("");
        }
    }

    public final void A04() {
        if (this.A0B == null) {
            this.A0M.setVisibility(8);
            return;
        }
        Chip chip = this.A0M;
        if (chip.getVisibility() == 8) {
            A06(chip);
            return;
        }
        boolean z = this.A00 == 2;
        int A00 = C02160Ac.A00(getContext(), R.color.search_input_token_selected);
        int A002 = C02160Ac.A00(getContext(), R.color.search_input_token);
        if (!z) {
            A00 = A002;
        }
        chip.setChipBackgroundColor(ColorStateList.valueOf(A00));
        A07(chip, this.A00 == 2);
    }

    public final void A05() {
        C53422gt c53422gt = (C53422gt) C40731sm.A0A().get(this.A0E.intValue());
        if (c53422gt == null) {
            this.A0N.setVisibility(8);
            return;
        }
        Chip chip = this.A0N;
        chip.setText(c53422gt.A05);
        C40731sm.A0a(getContext(), chip, this.A0E.intValue(), R.color.white);
        boolean z = this.A00 == 1;
        int A00 = C02160Ac.A00(getContext(), R.color.search_input_token_selected);
        int A002 = C02160Ac.A00(getContext(), R.color.search_input_token);
        if (!z) {
            A00 = A002;
        }
        chip.setChipBackgroundColor(ColorStateList.valueOf(A00));
        A07(chip, this.A00 == 1);
        if (chip.getVisibility() == 8) {
            A06(chip);
        }
    }

    public final void A06(final Chip chip) {
        int color = getResources().getColor(R.color.black_alpha_20);
        int color2 = getResources().getColor(R.color.search_input_token);
        int A02 = C09990f7.A02(color, color2);
        if (this.A0J) {
            chip.setScaleX(1.0f);
            chip.setScaleY(1.0f);
            chip.setAlpha(1.0f);
            chip.setVisibility(0);
            chip.setChipBackgroundColor(ColorStateList.valueOf(color2));
            return;
        }
        ColorStateList valueOf = ColorStateList.valueOf(A02);
        chip.setScaleX(0.92f);
        chip.setScaleY(0.92f);
        chip.setAlpha(0.0f);
        chip.setChipBackgroundColor(valueOf);
        chip.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(chip, "scaleX", 0.92f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(chip, "scaleY", 0.92f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(chip, "alpha", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
        animatorSet.setDuration(100L);
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(A02), Integer.valueOf(color2));
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3Vh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                chip.setChipBackgroundColor(ColorStateList.valueOf(((Number) valueAnimator.getAnimatedValue()).intValue()));
            }
        });
        ofObject.setDuration(100L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ofObject).after(animatorSet);
        animatorSet2.start();
    }

    public void A07(Chip chip, boolean z) {
        if (z) {
            chip.setChipStrokeColor(ColorStateList.valueOf(C02160Ac.A00(getContext(), R.color.search_input_token_selected_stroke)));
            chip.setChipStrokeWidth(AnonymousClass088.A02(getContext(), 1.0f));
            return;
        }
        chip.setChipStrokeColor(null);
        chip.setChipStrokeWidth(AnonymousClass088.A02(getContext(), 0.0f));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int max = Math.max(getResources().getDimensionPixelSize(R.dimen.search_token_min_max), (int) Math.floor(getWidth() * 0.3d));
        this.A0N.setMaxWidth(max);
        this.A0M.setMaxWidth(max);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x001d, code lost:
        if (r4 != 3) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void setFocus(com.whatsapp.search.views.TokenizedSearchInput r3, int r4) {
        /*
            com.whatsapp.search.SearchViewModel r0 = r3.A0C
            if (r0 == 0) goto L2c
            int r0 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = X.AnonymousClass024.A0l(r1, r0)
            if (r0 != 0) goto L2c
            r2 = 1
            if (r4 == 0) goto L37
            if (r4 == r2) goto L2d
            r0 = 2
            if (r4 == r0) goto L2d
        L1c:
            r0 = 3
            if (r4 == r0) goto L24
        L1f:
            com.whatsapp.search.SearchViewModel r0 = r3.A0C
            r0.A0L(r2)
        L24:
            r3.A00 = r4
            r3.A05()
            r3.A04()
        L2c:
            return
        L2d:
            com.whatsapp.text.FinalBackspaceAwareEntry r1 = r3.A0Q
            r0 = 0
            r1.setSelection(r0)
            r1.setCursorVisible(r0)
            goto L1c
        L37:
            com.whatsapp.text.FinalBackspaceAwareEntry r0 = r3.A0Q
            r0.setCursorVisible(r2)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.TokenizedSearchInput.setFocus(com.whatsapp.search.views.TokenizedSearchInput, int):void");
    }

    public void setNoAnimateForTestsOnly(boolean z) {
        this.A0J = z;
    }
}
