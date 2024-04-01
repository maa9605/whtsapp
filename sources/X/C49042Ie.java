package X;

import android.animation.Animator;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.search.verification.client.R;
import com.whatsapp.BoundedLinearLayout;
import com.whatsapp.components.CircularRevealView;
import com.whatsapp.conversation.ConversationAttachmentContentView;
import java.lang.ref.WeakReference;

/* renamed from: X.2Ie */
/* loaded from: classes2.dex */
public class C49042Ie extends PopupWindow {
    public int A00;
    public int A01;
    public ViewTreeObserver.OnGlobalLayoutListener A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final View A07;
    public final FrameLayout.LayoutParams A08;
    public final FrameLayout A09;
    public final BoundedLinearLayout A0A;
    public final C018508q A0B;
    public final CircularRevealView A0C;
    public final ConversationAttachmentContentView A0D;
    public final C2MB A0E;
    public final WeakReference A0F;

    public C49042Ie(final Activity activity, C018508q c018508q, C2MB c2mb, View view, AbstractC005302j abstractC005302j, boolean z, C54562ix c54562ix) {
        super(activity);
        this.A02 = new C2Ib(this);
        this.A0B = c018508q;
        this.A0E = c2mb;
        this.A07 = view;
        this.A0F = new WeakReference(activity);
        FrameLayout frameLayout = new FrameLayout(activity) { // from class: X.2qt
            public int A00 = -1;

            {
                C49042Ie.this = this;
            }

            @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
            public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
                int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
                int i5 = this.A00;
                if (i5 != -1 && i5 != rotation) {
                    C49042Ie c49042Ie = C49042Ie.this;
                    if (c49042Ie.A03 && !c49042Ie.A04) {
                        c49042Ie.A04 = true;
                        c49042Ie.A09.getViewTreeObserver().addOnGlobalLayoutListener(c49042Ie.A02);
                    } else {
                        C49042Ie.A01(c49042Ie);
                    }
                }
                this.A00 = rotation;
                super.onLayout(z2, i, i2, i3, i4);
            }
        };
        this.A09 = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        activity.getLayoutInflater().inflate(R.layout.attachment_picker, (ViewGroup) this.A09, true);
        this.A0C = (CircularRevealView) C0AT.A0D(this.A09, R.id.paper_clip_layout);
        this.A0A = (BoundedLinearLayout) C0AT.A0D(this.A09, R.id.content);
        this.A08 = (FrameLayout.LayoutParams) this.A0C.getLayoutParams();
        this.A06 = this.A0C.getResources().getDimensionPixelSize(R.dimen.attach_popup_bottom_padding_old);
        this.A0C.setVisibility(0);
        setContentView(this.A09);
        setBackgroundDrawable(new BitmapDrawable());
        setWidth(-1);
        setHeight(-2);
        setAnimationStyle(0);
        setTouchable(true);
        setFocusable(true);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        setTouchInterceptor(new View.OnTouchListener() { // from class: X.2qd
            {
                C49042Ie.this = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                C49042Ie c49042Ie = C49042Ie.this;
                if (motionEvent.getAction() != 4) {
                    if (motionEvent.getAction() == 0) {
                        float y = motionEvent.getY();
                        FrameLayout frameLayout2 = c49042Ie.A09;
                        if (y >= frameLayout2.getTop() && motionEvent.getY() <= frameLayout2.getBottom()) {
                            float x = motionEvent.getX();
                            CircularRevealView circularRevealView = c49042Ie.A0C;
                            if (x >= circularRevealView.getLeft() && motionEvent.getX() <= circularRevealView.getRight()) {
                                return false;
                            }
                        }
                    } else {
                        return false;
                    }
                }
                c49042Ie.dismiss();
                return true;
            }
        });
        ConversationAttachmentContentView conversationAttachmentContentView = (ConversationAttachmentContentView) C0AT.A0D(this.A0C, R.id.conversation_content_view);
        this.A0D = conversationAttachmentContentView;
        conversationAttachmentContentView.A0F = abstractC005302j;
        conversationAttachmentContentView.A0L = z;
        conversationAttachmentContentView.A0C = c54562ix;
        conversationAttachmentContentView.A06();
    }

    public static final AnimationSet A00(int i, boolean z, boolean z2) {
        float f = 1.0f;
        float f2 = 0.0f;
        if (z2) {
            f = 0.0f;
            f2 = 1.0f;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 0, i, 1, z ? 1.0f : 0.0f);
        float f3 = z2 ? 0.0f : 1.0f;
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, 1.0f - f3);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(300L);
        return animationSet;
    }

    public static void A01(C49042Ie c49042Ie) {
        c49042Ie.A0C.A01(false);
        super.dismiss();
    }

    public final int A02(Activity activity) {
        int measuredHeight;
        int measuredHeight2;
        FrameLayout frameLayout = this.A09;
        frameLayout.measure(0, 0);
        View view = this.A07;
        view.measure(0, 0);
        if (!C2MB.A00(view) || (Build.VERSION.SDK_INT >= 24 && activity.isInMultiWindowMode())) {
            ConversationAttachmentContentView conversationAttachmentContentView = this.A0D;
            if (conversationAttachmentContentView.A0M) {
                measuredHeight = view.getMeasuredHeight();
                measuredHeight2 = conversationAttachmentContentView.A01(view);
            } else {
                measuredHeight = view.getMeasuredHeight();
                measuredHeight2 = frameLayout.getMeasuredHeight();
            }
            return -(measuredHeight2 + measuredHeight);
        }
        return 0;
    }

    public void A03() {
        A04();
        this.A0C.A01(false);
        super.dismiss();
    }

    public final void A04() {
        if (this.A04) {
            this.A04 = false;
            this.A09.getViewTreeObserver().removeOnGlobalLayoutListener(this.A02);
        }
    }

    public final void A05() {
        int[] iArr = new int[2];
        this.A07.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        CircularRevealView circularRevealView = this.A0C;
        circularRevealView.getLocationOnScreen(iArr2);
        int i = (iArr[0] + this.A00) - iArr2[0];
        if (this.A03) {
            int measuredHeight = this.A09.getMeasuredHeight();
            circularRevealView.A01 = i;
            circularRevealView.A02 = measuredHeight;
        } else {
            circularRevealView.A01 = i;
            circularRevealView.A02 = 0;
        }
        if (this.A05) {
            FrameLayout frameLayout = this.A09;
            circularRevealView.A01 = frameLayout.getMeasuredWidth() / 2;
            circularRevealView.A02 = frameLayout.getMeasuredHeight() / 2;
        }
    }

    public /* synthetic */ void A06() {
        super.dismiss();
    }

    public final void A07(Activity activity, final boolean z, final int i, int i2) {
        int i3;
        BoundedLinearLayout boundedLinearLayout;
        ConversationAttachmentContentView conversationAttachmentContentView;
        CircularRevealView circularRevealView;
        FrameLayout.LayoutParams layoutParams;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        this.A03 = z;
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.A05 = false;
        int[] iArr = new int[2];
        View view = this.A07;
        view.getLocationOnScreen(iArr);
        int height = view.getHeight() + iArr[1];
        this.A01 = iArr[0];
        if (Build.VERSION.SDK_INT >= 28 && (rootWindowInsets = view.getRootWindowInsets()) != null && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
            i3 = displayCutout.getSafeInsetTop();
        } else {
            i3 = 0;
        }
        if (!z) {
            boundedLinearLayout = this.A0A;
            boundedLinearLayout.A00 = Integer.MAX_VALUE;
            boundedLinearLayout.A01 = Integer.MAX_VALUE;
            circularRevealView = this.A0C;
            circularRevealView.setPadding(circularRevealView.getPaddingLeft(), circularRevealView.getPaddingTop(), circularRevealView.getPaddingRight(), 0);
            conversationAttachmentContentView = this.A0D;
            if (conversationAttachmentContentView.A0M) {
                conversationAttachmentContentView.A06 = 0;
                layoutParams = this.A08;
                layoutParams.height = -1;
                int i4 = height + i2;
                boundedLinearLayout.getLayoutParams().height = (point.y + i3) - i4;
                showAtLocation(view, 8388661, 0, i4);
            } else if (defaultDisplay.getRotation() != 0 && defaultDisplay.getRotation() != 2) {
                FrameLayout frameLayout = this.A09;
                frameLayout.measure(0, 0);
                boundedLinearLayout.getLayoutParams().height = -2;
                layoutParams = this.A08;
                layoutParams.height = -2;
                showAtLocation(view, 8388661, 0, (point.y / 2) - (frameLayout.getMeasuredHeight() / 2));
                this.A05 = true;
            } else {
                layoutParams = this.A08;
                layoutParams.height = -1;
                int i5 = height + i2;
                boundedLinearLayout.getLayoutParams().height = (point.y + i3) - i5;
                showAtLocation(view, 8388661, 0, i5);
            }
        } else {
            boundedLinearLayout = this.A0A;
            conversationAttachmentContentView = this.A0D;
            boundedLinearLayout.A00 = conversationAttachmentContentView.A01(view);
            boundedLinearLayout.A01 = conversationAttachmentContentView.A00(view);
            circularRevealView = this.A0C;
            circularRevealView.setPadding(circularRevealView.getPaddingLeft(), circularRevealView.getPaddingTop(), circularRevealView.getPaddingRight(), this.A06);
            boundedLinearLayout.getLayoutParams().height = -2;
            layoutParams = this.A08;
            layoutParams.height = -2;
            if (conversationAttachmentContentView.A0M) {
                conversationAttachmentContentView.A06 = conversationAttachmentContentView.getResources().getDimensionPixelOffset(R.dimen.attach_popup_corner_radius);
            }
            if (Build.VERSION.SDK_INT >= 19) {
                showAsDropDown(view, 0, i2, 8388661);
            } else {
                showAsDropDown(view, 0, i2);
            }
        }
        circularRevealView.forceLayout();
        circularRevealView.A04 = i;
        if (z || (this.A05 && !conversationAttachmentContentView.A0M)) {
            boundedLinearLayout.measure(0, 0);
            int measuredWidth = boundedLinearLayout.getMeasuredWidth();
            int i6 = point.x;
            int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.input_layout_buttons_margin);
            int dimension = (int) (i6 - ((activity.getResources().getDimension(R.dimen.input_layout_buttons_density) + (activity.getResources().getDimensionPixelSize(R.dimen.input_layout_buttons_positioning_margin) + (activity.getResources().getDimensionPixelSize(R.dimen.input_layout_buttons_size) + dimensionPixelSize))) * 2.0f));
            if ((defaultDisplay.getRotation() == 1 || defaultDisplay.getRotation() == 3) && dimension > measuredWidth) {
                layoutParams.width = dimension;
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            } else {
                layoutParams.width = -1;
                int dimensionPixelSize2 = activity.getResources().getDimensionPixelSize(R.dimen.attach_popup_horizontal_margin);
                layoutParams.rightMargin = dimensionPixelSize2;
                layoutParams.leftMargin = dimensionPixelSize2;
            }
            boundedLinearLayout.setBackground(C02160Ac.A03(activity, R.drawable.ib_attach_panel));
        } else {
            layoutParams.width = -1;
            if (!conversationAttachmentContentView.A0M) {
                circularRevealView.setBackgroundColor(C02160Ac.A00(activity, R.color.primary_surface));
            } else {
                circularRevealView.setBackgroundColor(C02160Ac.A00(activity, R.color.attachmentPickerBackgroundColor));
            }
            circularRevealView.A03 = C02160Ac.A00(activity, R.color.attach_popup_background);
        }
        circularRevealView.setVisibility(0);
        circularRevealView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2qu
            {
                C49042Ie.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                boolean z2;
                C49042Ie c49042Ie = C49042Ie.this;
                CircularRevealView circularRevealView2 = c49042Ie.A0C;
                circularRevealView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                c49042Ie.A05();
                int i7 = Build.VERSION.SDK_INT;
                if (i7 < 18 && ((z2 = z) || c49042Ie.A05)) {
                    int[] iArr2 = new int[2];
                    c49042Ie.A07.getLocationOnScreen(iArr2);
                    AnimationSet A00 = C49042Ie.A00(c49042Ie.A00 + iArr2[0], z2, true);
                    A00.setDuration(i);
                    circularRevealView2.A00();
                    circularRevealView2.setBackgroundColor(0);
                    A00.setDuration(circularRevealView2.A04);
                    A00.setAnimationListener(circularRevealView2.A09);
                    circularRevealView2.startAnimation(A00);
                } else if (i7 < 21) {
                    circularRevealView2.A00();
                    circularRevealView2.setWillNotDraw(false);
                    circularRevealView2.setBackgroundColor(0);
                    C57592pg c57592pg = new C57592pg(circularRevealView2, false);
                    circularRevealView2.A0A = c57592pg;
                    c57592pg.setDuration(circularRevealView2.A04);
                    circularRevealView2.A0A.setAnimationListener(circularRevealView2.A09);
                    circularRevealView2.startAnimation(circularRevealView2.A0A);
                } else {
                    circularRevealView2.setVisibility(0);
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(circularRevealView2, circularRevealView2.A01, circularRevealView2.A02, 0.0f, Math.max(circularRevealView2.getWidth(), circularRevealView2.getHeight()));
                    createCircularReveal.setDuration(circularRevealView2.A04);
                    createCircularReveal.addListener(circularRevealView2.A05);
                    createCircularReveal.start();
                }
            }
        });
        if (i > 0) {
            conversationAttachmentContentView.A07(i, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        if (isShowing()) {
            A05();
            int[] iArr = new int[2];
            this.A07.getLocationOnScreen(iArr);
            AnimationSet A00 = A00(this.A00 + iArr[0], this.A03, false);
            CircularRevealView circularRevealView = this.A0C;
            circularRevealView.A04 = 300;
            circularRevealView.A0C = false;
            int i = Build.VERSION.SDK_INT;
            if (i < 18 && (this.A03 || this.A05)) {
                if (!circularRevealView.A0B) {
                    circularRevealView.A00();
                    circularRevealView.setBackgroundColor(0);
                    A00.setDuration(circularRevealView.A04);
                    A00.setAnimationListener(circularRevealView.A09);
                    circularRevealView.startAnimation(A00);
                }
            } else {
                if (!circularRevealView.A0B) {
                    circularRevealView.A01(true);
                }
                if (i < 21 && !this.A03 && !this.A05) {
                    this.A0A.startAnimation(A00);
                }
            }
        }
        A04();
        C018508q c018508q = this.A0B;
        c018508q.A02.postDelayed(new RunnableEBaseShape1S0100000_I0_1(this, 46), 300L);
    }
}
