package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.ResultReceiver;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.EmojiPopupFooter;
import com.whatsapp.util.ViewOnClickCListenerShape9S0100000_I0_1;
import java.lang.ref.SoftReference;

/* renamed from: X.2Ey */
/* loaded from: classes2.dex */
public class C48362Ey extends C0R7 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ViewGroup A05;
    public InterfaceC09180cm A06;
    public C26701Kg A07;
    public EmojiPopupFooter A08;
    public InterfaceC60692ut A09;
    public C3AX A0A;
    public AnonymousClass223 A0B;
    public Runnable A0C;
    public final View.OnClickListener A0D;
    public final View A0E;
    public final AbsListView.OnScrollListener A0F;
    public final ImageButton A0G;
    public final InterfaceC09180cm A0H;
    public final WaEditText A0I;
    public final C002301c A0J;
    public final C43871y8 A0K;
    public final C40081rY A0L;
    public final C47682Ce A0M;
    public final C2MI A0N;
    public final C455822q A0O;
    public final C02O A0P;

    public C48362Ey(Activity activity, C455822q c455822q, C2MB c2mb, AbstractC000600i abstractC000600i, C40081rY c40081rY, C43871y8 c43871y8, C47682Ce c47682Ce, C02E c02e, C002301c c002301c, C2MI c2mi, C000500h c000500h, C02O c02o, InterfaceC08240b0 interfaceC08240b0, ImageButton imageButton, WaEditText waEditText) {
        super(activity, c2mb, abstractC000600i, c02e, c000500h, interfaceC08240b0);
        this.A00 = R.drawable.ib_emoji;
        this.A03 = R.drawable.ib_keyboard;
        this.A0H = new InterfaceC09180cm() { // from class: X.3AR
            {
                C48362Ey.this = this;
            }

            @Override // X.InterfaceC09180cm
            public void AHj() {
                C48362Ey c48362Ey = C48362Ey.this;
                c48362Ey.A07();
                InterfaceC09180cm interfaceC09180cm = c48362Ey.A06;
                if (interfaceC09180cm != null) {
                    InterfaceC60692ut interfaceC60692ut = c48362Ey.A09;
                    if (interfaceC60692ut == null || interfaceC60692ut.AFL()) {
                        interfaceC09180cm.AHj();
                    }
                }
            }

            @Override // X.InterfaceC09180cm
            public void AJi(int[] iArr) {
                C48362Ey c48362Ey = C48362Ey.this;
                c48362Ey.A07();
                InterfaceC09180cm interfaceC09180cm = c48362Ey.A06;
                if (interfaceC09180cm != null) {
                    InterfaceC60692ut interfaceC60692ut = c48362Ey.A09;
                    if (interfaceC60692ut == null || interfaceC60692ut.AFL()) {
                        interfaceC09180cm.AJi(iArr);
                    }
                }
            }
        };
        this.A0F = new AbsListView.OnScrollListener() { // from class: X.2ur
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
            }

            {
                C48362Ey.this = this;
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                C48362Ey c48362Ey = C48362Ey.this;
                int height = c48362Ey.A08.getHeight();
                int i4 = c48362Ey.A02;
                if (i4 >= i) {
                    height = -1;
                    if (i4 > i) {
                        height = 0;
                    }
                }
                c48362Ey.A02 = i;
                if (height >= 0) {
                    EmojiPopupFooter emojiPopupFooter = c48362Ey.A08;
                    if (height != emojiPopupFooter.A00) {
                        Animation animation = emojiPopupFooter.getAnimation();
                        if ((animation instanceof C60682us) && ((C60682us) animation).A00 == height) {
                            return;
                        }
                        if (animation != null) {
                            animation.cancel();
                        }
                        c48362Ey.A08.startAnimation(new C60682us(c48362Ey, height));
                    }
                }
            }
        };
        this.A0D = new ViewOnClickEBaseShape1S0100000_I0_1(this, 45);
        View view = (View) interfaceC08240b0;
        this.A0E = view;
        this.A0O = c455822q;
        this.A0L = c40081rY;
        this.A0K = c43871y8;
        this.A0M = c47682Ce;
        this.A0J = c002301c;
        this.A0N = c2mi;
        this.A0P = c02o;
        this.A0G = imageButton;
        this.A0I = waEditText;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2up
            {
                C48362Ey.this = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v6, types: [int] */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r0v8 */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C48362Ey c48362Ey = C48362Ey.this;
                ((C0R7) c48362Ey).A00 = ((C0R7) c48362Ey).A02.getResources().getConfiguration().keyboard != 1 ? 0 : C2MB.A00(c48362Ey.A0E);
            }
        });
        imageButton.setImageDrawable(C02180Ae.A0O(activity, R.drawable.ib_emoji, R.color.ibEmojiIconTint));
        imageButton.setOnClickListener(this.A0D);
    }

    @Override // X.C0R7
    public int A01(int i) {
        int i2;
        Point point = new Point();
        Activity activity = super.A02;
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        int i3 = point.y;
        if (super.A00 == 1 && i > 0 && !A05()) {
            int min = Math.min(i3 / 2, i);
            int i4 = activity.getResources().getConfiguration().orientation;
            if (i4 != 1) {
                if (i4 == 2) {
                    C000200d.A0g(super.A06, "keyboard_height_landscape", min);
                }
                return min;
            }
            C000200d.A0g(super.A06, "keyboard_height_portrait", min);
            return min;
        }
        int i5 = activity.getResources().getConfiguration().orientation;
        if (i5 == 1) {
            i2 = super.A06.A00.getInt("keyboard_height_portrait", 0);
        } else {
            if (i5 == 2) {
                i2 = super.A06.A00.getInt("keyboard_height_landscape", 0);
            }
            return (i3 * 3) >> 3;
        }
        if (i2 > 0) {
            return Math.min(i3 / 2, i2);
        }
        return (i3 * 3) >> 3;
    }

    @Override // X.C0R7
    public void A02() {
        ImageButton imageButton;
        super.A01 = A01(-1);
        this.A0N.A00 = null;
        if (!(this instanceof C48352Ex)) {
            if (this.A01 != 0 && (imageButton = this.A0G) != null) {
                Activity activity = super.A02;
                imageButton.setImageDrawable(C02180Ae.A0O(activity, this.A00, R.color.ibEmojiIconTint));
                imageButton.setContentDescription(activity.getString(R.string.emoji_button_description));
                imageButton.setOnClickListener(this.A0D);
                this.A01 = 0;
            }
        } else {
            C48352Ex c48352Ex = (C48352Ex) this;
            c48352Ex.A0G(c48352Ex.A0J() ? 2 : 0);
        }
        C26701Kg c26701Kg = this.A07;
        if (c26701Kg != null) {
            c26701Kg.A06.setVisibility(8);
            c26701Kg.A0A.getViewTreeObserver().removeGlobalOnLayoutListener(c26701Kg.A0I);
        }
    }

    public void A06() {
        Activity activity = super.A02;
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        activity.getLayoutInflater().inflate(R.layout.emoji_picker_horizontal, (ViewGroup) relativeLayout, true);
        ViewGroup viewGroup = (ViewGroup) relativeLayout.findViewById(R.id.emoji_view);
        this.A05 = viewGroup;
        viewGroup.getLayoutParams().height = -1;
        this.A05.setVisibility(0);
        setContentView(relativeLayout);
        if (C0LX.A01) {
            relativeLayout.setLayoutDirection(3);
        }
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new BitmapDrawable());
        setTouchable(true);
        setFocusable(true);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        setAnimationStyle(0);
        View findViewById = this.A05.findViewById(R.id.fallback_divider);
        if (Build.VERSION.SDK_INT < 21) {
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
        C26701Kg c26701Kg = new C26701Kg(activity, this.A0L, this.A0K, this.A0M, this.A0J, super.A06, this.A0P, this.A05, this.A0F);
        this.A07 = c26701Kg;
        c26701Kg.A0B = this.A0H;
        c26701Kg.A07 = this.A0E;
        EmojiPopupFooter emojiPopupFooter = (EmojiPopupFooter) this.A05.findViewById(R.id.footer_toolbar);
        this.A08 = emojiPopupFooter;
        emojiPopupFooter.setClickable(true);
        ImageView imageView = this.A07.A09;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        View findViewById2 = this.A05.findViewById(R.id.gif_tab);
        View findViewById3 = this.A05.findViewById(R.id.emoji_tab);
        final View findViewById4 = this.A05.findViewById(R.id.search_button);
        findViewById2.setVisibility(8);
        findViewById3.setVisibility(8);
        if (!(this instanceof C48352Ex)) {
            this.A0N.A00 = new InterfaceC61502wG() { // from class: X.3AM
                @Override // X.InterfaceC61502wG
                public final void AOQ(boolean z) {
                    View view = findViewById4;
                    view.post(new RunnableEBaseShape0S0110000_I0(view, z, 8));
                }
            };
        } else {
            final C48352Ex c48352Ex = (C48352Ex) this;
            ((C48362Ey) c48352Ex).A0N.A00 = new InterfaceC61502wG() { // from class: X.3BX
                @Override // X.InterfaceC61502wG
                public final void AOQ(boolean z) {
                    C48352Ex c48352Ex2 = c48352Ex;
                    View view = findViewById4;
                    view.post(new RunnableEBaseShape2S0200000_I0_2(c48352Ex2, view, 9));
                }
            };
        }
        C2MI c2mi = this.A0N;
        findViewById4.setVisibility(c2mi.A02 ? 0 : 8);
        c2mi.A01();
        findViewById4.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 11));
        this.A05.findViewById(R.id.delete_symbol_tb).setVisibility(0);
        ImageView imageView2 = this.A07.A09;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        setTouchInterceptor(new View.OnTouchListener() { // from class: X.2uq
            {
                C48362Ey.this = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i;
                C48362Ey c48362Ey = C48362Ey.this;
                if (motionEvent.getActionMasked() != 2 && motionEvent.getActionMasked() != 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    Point point = new Point(((int) x) + iArr[0], ((int) y) + iArr[1]);
                    WaEditText waEditText = c48362Ey.A0I;
                    if (C0R7.A00(point, waEditText) && waEditText.A03(point)) {
                        c48362Ey.A04(waEditText);
                        return true;
                    } else if (motionEvent.getY() < 0.0f) {
                        return true;
                    }
                }
                C26701Kg c26701Kg2 = c48362Ey.A07;
                C2j3 c2j3 = c26701Kg2.A0C;
                if (c2j3 != null && c2j3.isShowing()) {
                    C2j3 c2j32 = c26701Kg2.A0C;
                    if (c2j32 != null) {
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        ViewGroup viewGroup2 = (ViewGroup) c2j32.getContentView();
                        view.getLocationOnScreen(c2j32.A02);
                        int[] iArr2 = c2j32.A02;
                        int i2 = x2 + iArr2[0];
                        int i3 = y2 + iArr2[1];
                        int childCount = viewGroup2.getChildCount();
                        View view2 = c2j32.A00;
                        c2j32.A00 = null;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= childCount) {
                                i4 = 0;
                                break;
                            }
                            View childAt = viewGroup2.getChildAt(i4);
                            childAt.getLocationOnScreen(c2j32.A02);
                            int i5 = c2j32.A02[0];
                            if (i2 > i5 && i2 < childAt.getWidth() + i5 && i3 > (i = c2j32.A02[1]) && i3 < childAt.getHeight() + i) {
                                childAt.setPressed(true);
                                c2j32.A00 = childAt;
                                break;
                            }
                            i4++;
                        }
                        if (view2 != null && view2 != c2j32.A00) {
                            view2.setPressed(false);
                        }
                        if (motionEvent.getAction() == 1 && c2j32.A00 != null) {
                            int[] iArr3 = c2j32.A03[i4];
                            InterfaceC54612j4 interfaceC54612j4 = c2j32.A01;
                            if (interfaceC54612j4 != null) {
                                interfaceC54612j4.AOk(iArr3);
                            }
                            c2j32.dismiss();
                            return false;
                        }
                        return false;
                    }
                    throw null;
                }
                return false;
            }
        });
        setFocusable(false);
    }

    public void A07() {
        if (this.A08.getVisibility() != 0) {
            this.A08.setVisibility(0);
        }
        Animation animation = this.A08.getAnimation();
        if (animation instanceof C60682us) {
            animation.cancel();
        }
        this.A08.setTopOffset(0);
    }

    public void A08() {
        ImageButton imageButton;
        if (this.A01 == 1 || (imageButton = this.A0G) == null) {
            return;
        }
        Activity activity = super.A02;
        imageButton.setImageDrawable(C02180Ae.A0O(activity, this.A03, R.color.ibEmojiIconTint));
        imageButton.setContentDescription(activity.getString(R.string.keyboard_button_description));
        imageButton.setOnClickListener(this.A0D);
        this.A01 = 1;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.1Kd] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.1Kc] */
    public void A09() {
        InterfaceC08240b0 interfaceC08240b0 = super.A04;
        View view = (View) interfaceC08240b0;
        view.getHandler().removeCallbacks(super.A08);
        interfaceC08240b0.lock();
        interfaceC08240b0.setKeyboardPopup(this);
        if (this.A07 == null) {
            A06();
        }
        C26701Kg c26701Kg = this.A07;
        if (c26701Kg != null) {
            if (C26701Kg.A0S == null) {
                HandlerThread handlerThread = new HandlerThread("Emoji Thread");
                C26701Kg.A0S = handlerThread;
                handlerThread.start();
                Context applicationContext = c26701Kg.A0G.getApplicationContext();
                C26701Kg.A0U = new Handler(applicationContext, c26701Kg.A0N, C26701Kg.A0S.getLooper()) { // from class: X.1Kd
                    public final Context A00;
                    public final C40081rY A01;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(r4);
                        if (r4 != null) {
                            this.A00 = applicationContext.getApplicationContext();
                            this.A01 = r3;
                            return;
                        }
                        throw null;
                    }

                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
                        C1X5 c1x5;
                        C26681Ke c26681Ke = (C26681Ke) message.obj;
                        AbstractC43921yD abstractC43921yD = null;
                        if (c26681Ke != null) {
                            c1x5 = c26681Ke.A00;
                            abstractC43921yD = c26681Ke.A01;
                        } else {
                            c1x5 = null;
                        }
                        int i = message.arg1;
                        C40081rY c40081rY = this.A01;
                        Context context = this.A00;
                        if (abstractC43921yD != null) {
                            Drawable A02 = c40081rY.A02(context, i, abstractC43921yD, 0.6f);
                            if (c1x5 != null) {
                                c1x5.setTag(A02);
                                Message.obtain(C26701Kg.A0T, 0, i, 0, c1x5).sendToTarget();
                                return;
                            }
                            Message.obtain(C26701Kg.A0T, 1, i, 0, A02).sendToTarget();
                            return;
                        }
                        throw null;
                    }
                };
                C26701Kg.A0T = new Handler(applicationContext.getMainLooper()) { // from class: X.1Kc
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(r2);
                        if (r2 != null) {
                            return;
                        }
                        throw null;
                    }

                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
                        Object obj = message.obj;
                        if (obj != null) {
                            int i = message.arg1;
                            if (obj instanceof Drawable) {
                                C26701Kg.A0X.put(i, new SoftReference(obj));
                                return;
                            }
                            C1X5 c1x5 = (C1X5) obj;
                            Drawable drawable = (Drawable) c1x5.getTag();
                            C26701Kg.A0X.put(i, new SoftReference(drawable));
                            if (c1x5.A00 != i) {
                                return;
                            }
                            c1x5.A03 = drawable;
                            c1x5.invalidate();
                        }
                    }
                };
                c26701Kg.A0M.A0L(1);
            } else {
                c26701Kg.A0M.A0L(0);
            }
            c26701Kg.A0A.getViewTreeObserver().addOnGlobalLayoutListener(c26701Kg.A0I);
            A08();
            int A01 = A01(-1);
            super.A01 = A01;
            setHeight(A01);
            setWidth(-1);
            showAtLocation(view, 48, 0, 1000000);
            A07();
            final WaEditText waEditText = this.A0I;
            A03(new InterfaceC26781Kq() { // from class: X.1hS
                @Override // X.InterfaceC26781Kq
                public final boolean A5r(InputMethodManager inputMethodManager, ResultReceiver resultReceiver) {
                    return inputMethodManager.hideSoftInputFromWindow(waEditText.getWindowToken(), 0, resultReceiver);
                }
            }, new Runnable() { // from class: X.1H6
                @Override // java.lang.Runnable
                public final void run() {
                    C0R7 c0r7 = this;
                    InterfaceC08240b0 interfaceC08240b02 = c0r7.A04;
                    interfaceC08240b02.unlock();
                    Activity activity = c0r7.A02;
                    if (activity.getResources().getConfiguration().orientation != 1 || c0r7.A05() || activity.getResources().getConfiguration().keyboard != 1) {
                        ((View) interfaceC08240b02).requestLayout();
                    }
                }
            }, waEditText);
            return;
        }
        throw null;
    }

    public void A0A(InterfaceC09180cm interfaceC09180cm) {
        this.A06 = interfaceC09180cm;
        C26701Kg c26701Kg = this.A07;
        if (c26701Kg != null) {
            c26701Kg.A0B = this.A0H;
        }
    }
}
