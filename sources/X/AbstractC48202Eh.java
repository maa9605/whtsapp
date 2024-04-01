package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.util.Log;

/* renamed from: X.2Eh */
/* loaded from: classes2.dex */
public abstract class AbstractC48202Eh extends AbstractC48212Ei {
    public static Drawable A0Z;
    public static Drawable A0a;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public Paint A07;
    public Rect A08;
    public Drawable A09;
    public Drawable A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public ImageView A0E;
    public ImageView A0F;
    public ImageView A0G;
    public C2MK A0H;
    public C02E A0I;
    public C002301c A0J;
    public C41471ty A0K;
    public AnonymousClass092 A0L;
    public C42461vm A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public final int A0R;
    public final Drawable A0S;
    public final Drawable A0T;
    public final Drawable A0U;
    public final Drawable A0V;
    public final Drawable A0W;
    public final C658038p A0X;
    public static final Rect A0d = new Rect();
    public static final Rect A0c = new Rect();
    public static final Rect A0b = new Rect();
    public static Rect A0Y = new Rect();

    public boolean A09() {
        return false;
    }

    public int getBubbleAlpha() {
        return 255;
    }

    public abstract int getCenteredLayoutId();

    public abstract int getIncomingLayoutId();

    public int getMainChildMaxWidth() {
        return 0;
    }

    public abstract int getOutgoingLayoutId();

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public AbstractC48202Eh(Context context, AnonymousClass092 anonymousClass092) {
        super(context);
        this.A08 = new Rect();
        this.A01 = -1;
        this.A0O = true;
        this.A0L = anonymousClass092;
        InterfaceC04690Ll rowsContainer = getRowsContainer();
        if (rowsContainer != null) {
            this.A0X = rowsContainer.A99();
        } else {
            C2MK c2mk = this.A0H;
            if (c2mk != null) {
                this.A0X = c2mk.A01;
            } else {
                this.A0X = null;
            }
        }
        Drawable A03 = C02160Ac.A03(context, R.drawable.balloon_outgoing_normal);
        if (A03 != null) {
            this.A0W = A03;
            Drawable A032 = C02160Ac.A03(context, R.drawable.balloon_outgoing_normal_ext);
            if (A032 != null) {
                this.A0V = A032;
                Drawable A033 = C02160Ac.A03(context, R.drawable.balloon_incoming_normal);
                if (A033 != null) {
                    this.A0U = A033;
                    Drawable A034 = C02160Ac.A03(context, R.drawable.balloon_incoming_normal_ext);
                    if (A034 != null) {
                        this.A0T = A034;
                        Drawable A035 = C02160Ac.A03(context, R.drawable.balloon_centered_normal);
                        if (A035 != null) {
                            this.A0S = A035;
                            this.A0W.getPadding(A0d);
                            this.A0U.getPadding(A0c);
                            this.A0U.getPadding(A0b);
                            boolean z = anonymousClass092.A0n.A02;
                            if (LayoutInflater.from(getContext()).inflate(A06() ? getCenteredLayoutId() : z ? getOutgoingLayoutId() : getIncomingLayoutId(), (ViewGroup) this, true) != null) {
                                this.A0C = getChildAt(0);
                                this.A0R = (int) (ViewConfiguration.get(context).getScaledTouchSlop() * 1.8d);
                                if (A0Z == null) {
                                    A0Z = C02160Ac.A03(getContext(), R.drawable.ic_action_reply).mutate();
                                }
                                if (A0a == null) {
                                    A0a = C02160Ac.A03(getContext(), R.drawable.forward_background).mutate();
                                    return;
                                }
                                return;
                            }
                            StringBuilder A0P = C000200d.A0P("rootview for conversationRow is null, rightLayout=");
                            A0P.append(z);
                            throw new RuntimeException(A0P.toString());
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public int A02() {
        return this.A0C.getBottom();
    }

    public int A03() {
        return this.A0C.getTop();
    }

    public void A04() {
        if (A05() && this.A05 == 0) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A0C, "translationX", getWidth() / 6);
            ofFloat.setDuration(600L).setInterpolator(new C015307e());
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: X.2rc
                {
                    AbstractC48202Eh.this = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    AbstractC48202Eh abstractC48202Eh = AbstractC48202Eh.this;
                    if (abstractC48202Eh.A05 == 2) {
                        abstractC48202Eh.A05 = 0;
                    }
                }
            });
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.A0C, "translationX", 0.0f);
            ofFloat2.setDuration(200L).setInterpolator(new DecelerateInterpolator());
            ofFloat2.addListener(new AnimatorListenerAdapter() { // from class: X.2rd
                {
                    AbstractC48202Eh.this = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    AbstractC48202Eh abstractC48202Eh = AbstractC48202Eh.this;
                    if (abstractC48202Eh.A05 == 2) {
                        abstractC48202Eh.A05 = 0;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    AbstractC48202Eh abstractC48202Eh = AbstractC48202Eh.this;
                    if (abstractC48202Eh.A05 == 2) {
                        abstractC48202Eh.A05 = 0;
                    }
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat);
            animatorSet.play(ofFloat2).after(900L);
            animatorSet.start();
            this.A05 = 2;
            invalidate();
        }
    }

    public boolean A05() {
        AbstractC48182Ef abstractC48182Ef = (AbstractC48182Ef) this;
        Conversation A0E = abstractC48182Ef.A0E();
        return A0E != null && !A0E.A2S() && abstractC48182Ef.A0f() && abstractC48182Ef.getMessageCount() == 1 && C0DB.A0M(abstractC48182Ef.A0R, abstractC48182Ef.A0c, abstractC48182Ef.getFMessage()) && ((AbstractC48202Eh) abstractC48182Ef).A0C != null;
    }

    public boolean A06() {
        return (this instanceof C2YC) || (this instanceof C2YA) || (this instanceof C51572Wz) || (this instanceof C51552Wx) || (this instanceof C2WL);
    }

    public boolean A07() {
        if (this instanceof C2XC) {
            return ((C2XC) this).A0l();
        }
        if ((this instanceof C2W8) || (this instanceof C2W6)) {
            return true;
        }
        if (this instanceof C2X7) {
            return C0DB.A0o(((C2JE) this).getFMessage());
        }
        if (!(this instanceof C2X3)) {
            if (this instanceof C51382Wf) {
                return C0DB.A0o(((C2JE) this).getFMessage());
            }
            return false;
        }
        return C0DB.A0o(((C2JE) this).getFMessage());
    }

    public boolean A08() {
        if (this instanceof C2XG) {
            return C0DB.A0g(getFMessage());
        }
        if (this instanceof C2WT) {
            return C0DB.A0g(getFMessage());
        }
        if (this instanceof C2W8) {
            return C0DB.A0g(getFMessage());
        }
        if (!(this instanceof C2W6)) {
            if (this instanceof C2W2) {
                return C0DB.A0g(getFMessage());
            }
            return false;
        }
        return C0DB.A0g(getFMessage());
    }

    public final boolean A0A(MotionEvent motionEvent) {
        this.A06 = (int) motionEvent.getX();
        boolean z = false;
        this.A0Q = false;
        if (this.A05 == 2) {
            this.A05 = 1;
            post(new RunnableEBaseShape2S0100000_I0_2(this, 3));
            invalidate();
            z = true;
        }
        this.A04 = (int) this.A0C.getTranslationX();
        this.A0C.animate().cancel();
        return z;
    }

    public final boolean A0B(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        if (this.A05 != 1 && Math.abs(x - this.A06) > this.A0R) {
            this.A05 = 1;
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            cancelLongPress();
            setPressed(false);
        }
        if (this.A05 == 1) {
            int max = Math.max(0, ((this.A04 + x) - this.A06) - this.A0R);
            float max2 = Math.max(0, max - (getWidth() / 6));
            int min = Math.min(max, getWidth() / 6);
            double d = max2;
            int width = min + ((int) (d / (((0.75d * d) / (getWidth() / 6)) + 1.0d)));
            this.A0C.setTranslationX(width);
            if (width > getWidth() / 6 && !this.A0Q) {
                try {
                    if (Settings.System.getInt(getContext().getContentResolver(), "haptic_feedback_enabled") != 0) {
                        AnonymousClass088.A1g(this.A0I);
                    }
                } catch (Settings.SettingNotFoundException e) {
                    Log.e("swipetoreply/vibrate", e);
                }
                this.A0Q = true;
            }
            invalidate();
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public int getBubbleMarginStart() {
        return C003301p.A00(getContext());
    }

    private int getBubbleSwipeOffset() {
        View view = this.A0C;
        if (view != null) {
            return (int) view.getTranslationX();
        }
        return 0;
    }

    private float getBubbleWidth() {
        int i;
        int i2;
        int i3;
        if (A06()) {
            i3 = 0;
        } else {
            if (this.A0L.A0n.A02) {
                Rect rect = A0d;
                i = rect.left;
                i2 = rect.right;
            } else {
                Rect rect2 = A0c;
                i = rect2.left;
                i2 = rect2.right;
            }
            i3 = i2 + i;
        }
        return getContentWidth() + i3;
    }

    public int getContentWidth() {
        return this.A0C.getMeasuredWidth();
    }

    public AnonymousClass092 getFMessage() {
        return this.A0L;
    }

    public ImageView getQuickActionButton() {
        if (A08()) {
            return this.A0F;
        }
        if (A09()) {
            return this.A0G;
        }
        if (A07()) {
            return this.A0E;
        }
        return null;
    }

    public InterfaceC04690Ll getRowsContainer() {
        Activity A0F = C02180Ae.A0F(getContext());
        if (A0F instanceof InterfaceC04690Ll) {
            return (InterfaceC04690Ll) A0F;
        }
        return null;
    }

    private int getSwipeReplyActivationThreshold() {
        return getWidth() / 6;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        boolean z;
        byte b;
        int i;
        Drawable drawable;
        boolean A0N;
        int i2;
        Drawable drawable2;
        Drawable drawable3;
        boolean A0M;
        View view;
        int i3;
        if (this.A0P) {
            if (this.A0A == null) {
                this.A0A = getResources().getDrawable(R.drawable.album_card_top);
            }
            if (this.A09 == null) {
                this.A09 = getResources().getDrawable(R.drawable.album_card_bottom);
            }
            this.A0A.setBounds(0, getPaddingTop() - this.A0A.getIntrinsicHeight(), getWidth(), getPaddingTop());
            this.A0A.draw(canvas);
            this.A09.setBounds(0, getHeight() - getPaddingBottom(), getWidth(), this.A09.getIntrinsicHeight() + (getHeight() - getPaddingBottom()));
            this.A09.draw(canvas);
            super.onDraw(canvas);
            return;
        }
        float f = this.A00;
        if (f > 0.0f) {
            int i4 = (((int) ((i3 >> 24) * f)) << 24) | (this.A0X.A00 & 16777215);
            Paint paint = this.A07;
            if (paint == null) {
                paint = new Paint(1);
                this.A07 = paint;
            }
            paint.setColor(i4);
            int i5 = this.A03;
            Rect rect = A0d;
            canvas.drawRect(0.0f, (i5 - rect.top) - getResources().getDimensionPixelSize(R.dimen.selection_padding_top), getWidth(), Math.max(1, (int) (getContext().getResources().getDisplayMetrics().density / 2.0f)) + this.A02 + rect.bottom, this.A07);
        }
        if (isSelected() || (((view = this.A0D) == null || view.getVisibility() != 0) && (isPressed() || isFocused() || this.A0N))) {
            z = true;
            C658038p c658038p = this.A0X;
            if (c658038p instanceof C68313Ja) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), c658038p.A01);
                z = false;
            }
        } else {
            z = false;
        }
        AnonymousClass092 anonymousClass092 = this.A0L;
        int i6 = anonymousClass092.A08;
        if (i6 != -1 && ((i6 != 6 || anonymousClass092.A0m == 8) && (b = anonymousClass092.A0m) != 21 && b != 22 && b != 36)) {
            int bubbleWidth = (int) getBubbleWidth();
            if (A06()) {
                int width = (getWidth() - bubbleWidth) / 2;
                Rect rect2 = this.A08;
                Rect rect3 = A0b;
                rect2.set(width - rect3.left, this.A03 - rect3.top, width + bubbleWidth, this.A02 + rect3.bottom);
                if (z) {
                    drawable3 = C02160Ac.A03(getContext(), R.drawable.balloon_centered_pressed);
                    if (drawable3 == null) {
                        throw null;
                    }
                } else {
                    drawable3 = this.A0S;
                }
                this.A08.offset(getBubbleMarginStart(), 0);
                if (drawable3 != null && this.A0O) {
                    drawable3.setDither(true);
                    drawable3.setBounds(this.A08);
                    C658038p c658038p2 = this.A0X;
                    if (!(c658038p2 instanceof C68313Ja)) {
                        A0M = c658038p2.A03.A0N();
                    } else {
                        A0M = c658038p2.A03.A0M();
                    }
                    if (A0M) {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, this.A08.exactCenterX(), 0.0f);
                        drawable3.draw(canvas);
                        canvas.restore();
                    } else {
                        drawable3.draw(canvas);
                    }
                }
            } else if (this.A0L.A0n.A02) {
                C658038p c658038p3 = this.A0X;
                if (!(c658038p3 instanceof C68313Ja)) {
                    A0N = c658038p3.A03.A0M();
                } else {
                    A0N = c658038p3.A03.A0N();
                }
                Rect rect4 = this.A08;
                if (A0N) {
                    i2 = getWidth() - bubbleWidth;
                } else {
                    i2 = 0;
                }
                int i7 = this.A03;
                Rect rect5 = A0d;
                int i8 = i7 - rect5.top;
                if (A0N) {
                    bubbleWidth = getWidth();
                }
                rect4.set(i2, i8, bubbleWidth, this.A02 + rect5.bottom);
                int i9 = this.A01;
                if (i9 == 2 || i9 == 3) {
                    if (z) {
                        drawable2 = C02160Ac.A03(getContext(), R.drawable.balloon_outgoing_pressed_ext);
                        if (drawable2 == null) {
                            throw null;
                        }
                    } else {
                        drawable2 = this.A0V;
                    }
                } else if (z) {
                    drawable2 = C02160Ac.A03(getContext(), R.drawable.balloon_outgoing_pressed);
                    if (drawable2 == null) {
                        throw null;
                    }
                } else {
                    drawable2 = this.A0W;
                }
                Rect rect6 = this.A08;
                int bubbleMarginStart = getBubbleMarginStart();
                if (A0N) {
                    bubbleMarginStart = -bubbleMarginStart;
                }
                rect6.offset(bubbleMarginStart + getBubbleSwipeOffset(), 0);
                if (drawable2 != null) {
                    drawable2.setAlpha(getBubbleAlpha());
                    drawable2.setDither(true);
                    drawable2.setBounds(this.A08);
                    if (!A0N) {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, this.A08.exactCenterX(), 0.0f);
                        drawable2.draw(canvas);
                        canvas.restore();
                    } else {
                        drawable2.draw(canvas);
                    }
                }
            } else {
                boolean z2 = !this.A0J.A0M();
                Rect rect7 = this.A08;
                if (z2) {
                    i = getWidth() - bubbleWidth;
                } else {
                    i = 0;
                }
                int i10 = this.A03;
                Rect rect8 = A0c;
                int i11 = i10 - rect8.top;
                if (z2) {
                    bubbleWidth = getWidth();
                }
                rect7.set(i, i11, bubbleWidth, this.A02 + rect8.bottom);
                int i12 = this.A01;
                if (i12 == 2 || i12 == 3) {
                    if (z) {
                        drawable = C02160Ac.A03(getContext(), R.drawable.balloon_incoming_pressed_ext);
                        if (drawable == null) {
                            throw null;
                        }
                    } else {
                        drawable = this.A0T;
                    }
                } else if (z) {
                    drawable = C02160Ac.A03(getContext(), R.drawable.balloon_incoming_pressed);
                    if (drawable == null) {
                        throw null;
                    }
                } else {
                    drawable = this.A0U;
                }
                Rect rect9 = this.A08;
                int bubbleMarginStart2 = getBubbleMarginStart();
                if (z2) {
                    bubbleMarginStart2 = -bubbleMarginStart2;
                }
                rect9.offset(bubbleMarginStart2 + getBubbleSwipeOffset(), 0);
                if (drawable != null) {
                    drawable.setAlpha(getBubbleAlpha());
                    drawable.setBounds(this.A08);
                    drawable.setDither(true);
                    if (!z2) {
                        drawable.draw(canvas);
                    } else {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, this.A08.exactCenterX(), 0.0f);
                        drawable.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (this.A05 > 0) {
                float bubbleSwipeOffset = getBubbleSwipeOffset() / (getWidth() / 6);
                int min = Math.min(getBubbleSwipeOffset(), getWidth() / 6);
                int top = this.A0C.getTop();
                int bottom = this.A0C.getBottom();
                int dimension = (int) getResources().getDimension(R.dimen.forward_button_padding);
                A0a.getPadding(A0Y);
                int i13 = (top + bottom) / 2;
                A0a.setBounds(((min - A0Z.getIntrinsicWidth()) - dimension) - A0Y.right, (i13 - (A0Z.getIntrinsicHeight() / 2)) - dimension, (min + dimension) - A0Y.right, (A0Z.getIntrinsicHeight() / 2) + i13 + dimension);
                Drawable drawable4 = A0Z;
                drawable4.setBounds((min - drawable4.getIntrinsicWidth()) - A0Y.right, i13 - (A0Z.getIntrinsicHeight() / 2), min - A0Y.right, (A0Z.getIntrinsicHeight() / 2) + i13);
                Drawable drawable5 = A0a;
                int min2 = (int) (Math.min(1.0f, 2.0f * bubbleSwipeOffset) * 255.0f);
                drawable5.setAlpha(min2);
                A0Z.setAlpha(min2);
                A0a.draw(canvas);
                A0Z.draw(canvas);
                ImageView quickActionButton = getQuickActionButton();
                if (quickActionButton != null) {
                    quickActionButton.setTranslationX(this.A0C.getTranslationX());
                    quickActionButton.setAlpha(Math.max(0.0f, 1.0f - (bubbleSwipeOffset * 4.0f)));
                }
                if (this.A05 == 2) {
                    invalidate();
                }
            }
        } else {
            Rect rect10 = this.A08;
            int i14 = this.A03;
            Rect rect11 = A0d;
            rect10.set(0, i14 - rect11.top, getWidth(), this.A02 + rect11.bottom);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (A05()) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 2 && A0B(motionEvent)) {
                    return true;
                }
            } else if (A0A(motionEvent)) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int measuredWidth;
        int measuredWidth2;
        int i6;
        int paddingTop = getPaddingTop();
        View view = this.A0B;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0B.getLayoutParams();
            int i7 = paddingTop + marginLayoutParams.topMargin;
            int measuredWidth3 = this.A0B.getMeasuredWidth();
            int measuredHeight = this.A0B.getMeasuredHeight();
            int measuredWidth4 = (getMeasuredWidth() - measuredWidth3) >> 1;
            this.A0B.layout(measuredWidth4, i7, measuredWidth3 + measuredWidth4, i7 + measuredHeight);
            paddingTop = i7 + measuredHeight + marginLayoutParams.bottomMargin;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A0C.getLayoutParams();
        int i8 = paddingTop + marginLayoutParams2.topMargin;
        AnonymousClass092 anonymousClass092 = this.A0L;
        if (anonymousClass092.A08 == 6 && anonymousClass092.A0m != 8) {
            i6 = (getMeasuredWidth() - this.A0C.getMeasuredWidth()) >> 1;
        } else if (A06()) {
            i6 = (getMeasuredWidth() - this.A0C.getMeasuredWidth()) >> 1;
        } else {
            if (!(!(this.A0X instanceof C68313Ja)) && this.A0L.A0n.A02) {
                if (this.A0J.A0M()) {
                    paddingLeft = getPaddingLeft();
                    i5 = marginLayoutParams2.rightMargin;
                    i6 = i5 + paddingLeft;
                } else {
                    measuredWidth = (getMeasuredWidth() - getPaddingRight()) - marginLayoutParams2.leftMargin;
                    measuredWidth2 = this.A0C.getMeasuredWidth();
                    i6 = measuredWidth - measuredWidth2;
                }
            } else if (this.A0L.A0n.A02 == this.A0J.A0M()) {
                measuredWidth = (getMeasuredWidth() - getPaddingRight()) - marginLayoutParams2.rightMargin;
                measuredWidth2 = this.A0C.getMeasuredWidth();
                i6 = measuredWidth - measuredWidth2;
            } else {
                paddingLeft = getPaddingLeft();
                i5 = marginLayoutParams2.leftMargin;
                i6 = i5 + paddingLeft;
            }
        }
        View view2 = this.A0C;
        view2.layout(i6, i8, view2.getMeasuredWidth() + i6, this.A0C.getMeasuredHeight() + i8);
        this.A03 = A03();
        this.A02 = A02();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mainChildMaxWidth;
        int i3 = i;
        int i4 = i2;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        View view = this.A0B;
        int i5 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0B.getLayoutParams();
            int i6 = marginLayoutParams.height;
            if (i6 < 0) {
                i6 = i4;
                if (mode2 != 0) {
                    i6 = View.MeasureSpec.makeMeasureSpec(size2 - paddingBottom, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                }
            }
            int i7 = marginLayoutParams.width;
            if (i7 < 0) {
                if (mode != 0) {
                    int i8 = paddingRight;
                    if (!(!(this.A0X instanceof C68313Ja))) {
                        i8 = 0;
                    }
                    int i9 = ((size - i8) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
                    int i10 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    if (i7 == -1) {
                        i10 = 1073741824;
                    }
                    i7 = View.MeasureSpec.makeMeasureSpec(i9, i10);
                } else {
                    i7 = i3;
                }
            }
            this.A0B.measure(i7, i6);
            paddingBottom = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + this.A0B.getMeasuredHeight() + paddingBottom;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A0C.getLayoutParams();
        int i11 = marginLayoutParams2.height;
        if (i11 >= 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        } else if (mode2 != 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(size2 - paddingBottom, mode2);
        }
        if (mode != 0) {
            int i12 = ((size - paddingRight) - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin;
            int i13 = marginLayoutParams2.width;
            if (i13 >= 0 && i13 < i12) {
                i12 = i13;
            }
            if (!this.A0P && (mainChildMaxWidth = getMainChildMaxWidth()) != 0 && i12 > mainChildMaxWidth) {
                i12 = mainChildMaxWidth;
            }
            if (marginLayoutParams2.width >= 0) {
                i5 = 1073741824;
            }
            i3 = View.MeasureSpec.makeMeasureSpec(i12, i5);
        } else {
            int i14 = marginLayoutParams2.width;
            if (i14 >= 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
            }
        }
        this.A0C.measure(i3, i4);
        setMeasuredDimension(size, this.A0C.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin + paddingBottom);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0013, code lost:
        if (r1 != 3) goto L28;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.A05()
            if (r0 == 0) goto L15
            int r1 = r5.getActionMasked()
            r3 = 1
            if (r1 == 0) goto L75
            if (r1 == r3) goto L21
            r0 = 2
            if (r1 == r0) goto L1a
            r0 = 3
            if (r1 == r0) goto L21
        L15:
            boolean r0 = super.onTouchEvent(r5)
            return r0
        L1a:
            boolean r0 = r4.A0B(r5)
            if (r0 == 0) goto L15
            return r3
        L21:
            int r0 = r4.A05
            if (r0 != r3) goto L15
            r0 = 2
            r4.A05 = r0
            int r1 = r4.getBubbleSwipeOffset()
            int r0 = r4.getWidth()
            int r0 = r0 / 6
            if (r1 <= r0) goto L4f
            android.content.Context r1 = r4.getContext()
            java.lang.Class<com.whatsapp.Conversation> r0 = com.whatsapp.Conversation.class
            android.app.Activity r1 = X.C02180Ae.A0G(r1, r0)
            com.whatsapp.Conversation r1 = (com.whatsapp.Conversation) r1
            if (r1 == 0) goto L4f
            X.092 r0 = r4.getFMessage()
            if (r0 == 0) goto L4f
            X.092 r0 = r4.getFMessage()
            r1.A2O(r0, r3)
        L4f:
            android.view.View r0 = r4.A0C
            android.view.ViewPropertyAnimator r2 = r0.animate()
            r0 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
            r0 = 0
            android.view.ViewPropertyAnimator r1 = r1.translationX(r0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r0)
            X.2rb r0 = new X.2rb
            r0.<init>()
            r1.setListener(r0)
            r4.invalidate()
            return r3
        L75:
            boolean r0 = r4.A0A(r5)
            if (r0 == 0) goto L15
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC48202Eh.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChildPressed(boolean z) {
        if (this.A0N != z) {
            this.A0N = z;
            invalidate();
        }
    }

    public void setDrawCenteredBubble(boolean z) {
        this.A0O = z;
    }

    public void setFMessage(AnonymousClass092 anonymousClass092) {
        this.A0L = anonymousClass092;
    }
}
