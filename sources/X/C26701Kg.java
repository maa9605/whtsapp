package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.search.verification.client.R;
import com.whatsapp.emoji.EmojiDescriptor;

/* renamed from: X.1Kg */
/* loaded from: classes.dex */
public class C26701Kg {
    public static HandlerThread A0S;
    public static HandlerC26661Kc A0T;
    public static HandlerC26671Kd A0U;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public LayoutInflater A04;
    public View.OnClickListener A05;
    public View A06;
    public View A07;
    public ViewGroup A08;
    public ImageView A09;
    public ViewPager A0A;
    public InterfaceC09180cm A0B;
    public C2j3 A0C;
    public C26651Kb[] A0D;
    public final int A0E;
    public final int A0F;
    public final Context A0G;
    public final AbsListView.OnScrollListener A0J;
    public final C000500h A0L;
    public final C43871y8 A0M;
    public final C40081rY A0N;
    public final C47682Ce A0O;
    public final C02O A0P;
    public final boolean A0Q;
    public final C26691Kf[] A0R;
    public static final SparseArray A0X = new SparseArray();
    public static final int A0W = ViewConfiguration.getKeyRepeatTimeout();
    public static final int A0V = ViewConfiguration.getKeyRepeatDelay();
    public final AbsListView.OnScrollListener A0K = new AbsListView.OnScrollListener() { // from class: X.1KW
        {
            C26701Kg.this = this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x004e, code lost:
            if (r3 <= 1.0f) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void A00(android.widget.AbsListView r9) {
            /*
                r8 = this;
                int r1 = android.os.Build.VERSION.SDK_INT
                r0 = 21
                if (r1 < r0) goto L6b
                X.1Kg r5 = X.C26701Kg.this
                android.view.ViewGroup r0 = r5.A08
                if (r0 == 0) goto L6b
                r1 = 1061997773(0x3f4ccccd, float:0.8)
                android.content.Context r0 = r9.getContext()
                android.content.res.Resources r0 = r0.getResources()
                android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
                float r4 = r0.density
                float r4 = r4 * r1
                r0 = 1056964608(0x3f000000, float:0.5)
                float r4 = r4 + r0
                int r1 = r9.getFirstVisiblePosition()
                r0 = 0
                android.view.View r0 = r9.getChildAt(r0)
                r7 = 0
                if (r0 != 0) goto L6f
                r0 = 0
            L2e:
                r6 = 1065353216(0x3f800000, float:1.0)
                if (r1 != 0) goto L6c
                float r2 = -r0
                android.content.Context r0 = r9.getContext()
                android.content.res.Resources r1 = r0.getResources()
                r0 = 2131165622(0x7f0701b6, float:1.7945466E38)
                int r0 = r1.getDimensionPixelSize(r0)
                float r0 = (float) r0
                float r2 = r2 / r0
                float r3 = java.lang.Math.min(r2, r6)
                int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r0 < 0) goto L51
                int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r0 > 0) goto L51
            L50:
                float r4 = r4 * r3
            L51:
                android.view.ViewGroup r2 = r5.A08
                int r1 = r5.A0F
                r0 = 1095761920(0x41500000, float:13.0)
                float r3 = r3 * r0
                int r0 = (int) r3
                int r1 = X.C09990f7.A03(r1, r0)
                int r0 = r5.A0E
                int r0 = X.C09990f7.A02(r1, r0)
                r2.setBackgroundColor(r0)
                android.view.ViewGroup r0 = r5.A08
                X.C0AT.A0P(r0, r4)
            L6b:
                return
            L6c:
                r3 = 1065353216(0x3f800000, float:1.0)
                goto L50
            L6f:
                int r0 = r0.getTop()
                float r0 = (float) r0
                goto L2e
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1KW.A00(android.widget.AbsListView):void");
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            A00(absListView);
            AbsListView.OnScrollListener onScrollListener = C26701Kg.this.A0J;
            if (onScrollListener != null) {
                onScrollListener.onScroll(absListView, i, i2, i3);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            A00(absListView);
            AbsListView.OnScrollListener onScrollListener = C26701Kg.this.A0J;
            if (onScrollListener != null) {
                onScrollListener.onScrollStateChanged(absListView, i);
            }
        }
    };
    public final ViewTreeObserver.OnGlobalLayoutListener A0I = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.1KZ
        {
            C26701Kg.this = this;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            C26651Kb[] c26651KbArr;
            C26701Kg c26701Kg = C26701Kg.this;
            int width = c26701Kg.A0A.getWidth() / c26701Kg.A0A.getContext().getResources().getDimensionPixelSize(R.dimen.emoji_picker_item);
            if (c26701Kg.A03 != width) {
                c26701Kg.A03 = width;
                for (C26651Kb c26651Kb : c26701Kg.A0D) {
                    if (c26651Kb != null) {
                        c26651Kb.notifyDataSetChanged();
                    }
                }
            }
        }
    };
    public final Paint A0H = new Paint();

    public C26701Kg(Context context, C40081rY c40081rY, C43871y8 c43871y8, C47682Ce c47682Ce, final C002301c c002301c, final C000500h c000500h, final C02O c02o, ViewGroup viewGroup, AbsListView.OnScrollListener onScrollListener) {
        int length;
        C26691Kf[] c26691KfArr;
        this.A0J = onScrollListener;
        this.A0Q = onScrollListener != null;
        this.A0G = context;
        this.A0N = c40081rY;
        this.A0M = c43871y8;
        this.A0O = c47682Ce;
        this.A0L = c000500h;
        this.A0P = c02o;
        this.A0E = C02160Ac.A00(context, R.color.emoji_popup_body);
        this.A0F = C02160Ac.A00(context, R.color.paletteElevationOverlay);
        this.A08 = (ViewGroup) viewGroup.findViewById(R.id.emoji_group_layout);
        C26691Kf[] c26691KfArr2 = new C26691Kf[EnumC47722Ci.values().length + 1];
        this.A0R = c26691KfArr2;
        c26691KfArr2[0] = new C26691Kf(c47682Ce) { // from class: X.1io
            public final C47682Ce A00;

            {
                this.A00 = c47682Ce;
            }

            @Override // X.C26691Kf
            public int A00(Context context2) {
                return this.A00.A00();
            }

            @Override // X.C26691Kf
            public int[] A01(C02O c02o2, int i) {
                return (int[]) this.A00.A01(i);
            }
        };
        int i = 1;
        while (true) {
            C26691Kf[] c26691KfArr3 = this.A0R;
            length = c26691KfArr3.length;
            if (i >= length) {
                break;
            }
            c26691KfArr3[i] = new C26691Kf(i, EnumC47722Ci.values()[i - 1]);
            i++;
        }
        C26651Kb[] c26651KbArr = new C26651Kb[length];
        this.A0D = c26651KbArr;
        c26651KbArr[0] = new C26651Kb(this, context, c002301c, 0);
        this.A00 = c47682Ce.A00() > 0 ? 0 : 1;
        ViewPager viewPager = (ViewPager) viewGroup.findViewById(R.id.pager);
        this.A0A = viewPager;
        viewPager.setAdapter(new AbstractC35271is(c002301c) { // from class: X.1Wk
            public final C002301c A00;

            {
                C26701Kg.this = this;
                this.A00 = c002301c;
            }

            @Override // X.C0ZT
            public int A0B() {
                return C26701Kg.this.A0D.length;
            }

            @Override // X.AbstractC35271is
            public Object A0G(ViewGroup viewGroup2, int i2) {
                C26701Kg c26701Kg = C26701Kg.this;
                View inflate = c26701Kg.A04.inflate(R.layout.emoji_list, (ViewGroup) null);
                AbsListView absListView = (AbsListView) inflate.findViewById(16908298);
                C002301c c002301c2 = this.A00;
                if (!c002301c2.A0M()) {
                    i2 = (c26701Kg.A0D.length - 1) - i2;
                }
                C26651Kb[] c26651KbArr2 = c26701Kg.A0D;
                if (c26651KbArr2[i2] == null) {
                    c26651KbArr2[i2] = new C26651Kb(c26701Kg, c26701Kg.A0G, c002301c2, i2);
                }
                absListView.setAdapter((ListAdapter) c26701Kg.A0D[i2]);
                absListView.setEmptyView(inflate.findViewById(16908292));
                absListView.setTag(Integer.valueOf(i2));
                if (i2 == c26701Kg.A00) {
                    absListView.setOnScrollListener(c26701Kg.A0K);
                }
                viewGroup2.addView(inflate, 0);
                return inflate;
            }

            @Override // X.AbstractC35271is
            public void A0I(ViewGroup viewGroup2, int i2, Object obj) {
                View view = (View) obj;
                viewGroup2.removeView(view);
                ((AbsListView) view.findViewById(16908298)).setOnScrollListener(null);
            }

            @Override // X.AbstractC35271is
            public boolean A0J(View view, Object obj) {
                return view == obj;
            }
        });
        this.A0A.A0F(new C35221in(this, c002301c, context, c02o));
        this.A04 = (LayoutInflater) context.getSystemService("layout_inflater");
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.emoji_picker_item);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.emoji_picker_icon);
        for (final C26691Kf c26691Kf : this.A0R) {
            View findViewById = this.A08.findViewById(c26691Kf.A00);
            findViewById.setContentDescription(context.getString(c26691Kf.A03));
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: X.1Gn
                {
                    C26701Kg.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int length2;
                    C26701Kg c26701Kg = C26701Kg.this;
                    C002301c c002301c2 = c002301c;
                    C26691Kf c26691Kf2 = c26691Kf;
                    if (c002301c2.A0M()) {
                        length2 = c26691Kf2.A02;
                    } else {
                        length2 = (c26701Kg.A0D.length - 1) - c26691Kf2.A02;
                    }
                    c26701Kg.A0A.A0B(length2, true);
                }
            });
        }
        this.A0A.A0B(c002301c.A0M() ? this.A00 : (this.A0D.length - 1) - this.A00, false);
        A03(this.A00);
        this.A05 = new View.OnClickListener() { // from class: X.1Gt
            {
                C26701Kg.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C26701Kg.this.A06(c000500h, c02o, view);
            }
        };
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.delete_symbol_tb);
        this.A09 = imageView;
        if (imageView != null) {
            final Handler handler = new Handler(Looper.getMainLooper()) { // from class: X.1KY
                {
                    C26701Kg.this = this;
                }

                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    InterfaceC09180cm interfaceC09180cm = C26701Kg.this.A0B;
                    if (interfaceC09180cm != null) {
                        interfaceC09180cm.AHj();
                        sendEmptyMessageDelayed(0, C26701Kg.A0V);
                    }
                }
            };
            this.A09.setClickable(true);
            this.A09.setLongClickable(true);
            this.A09.setOnTouchListener(new View.OnTouchListener() { // from class: X.1Gu
                {
                    C26701Kg.this = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    C26701Kg c26701Kg = C26701Kg.this;
                    Handler handler2 = handler;
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        InterfaceC09180cm interfaceC09180cm = c26701Kg.A0B;
                        if (interfaceC09180cm != null) {
                            interfaceC09180cm.AHj();
                            handler2.sendEmptyMessageDelayed(0, C26701Kg.A0W);
                            return true;
                        }
                        return true;
                    } else if (action == 1) {
                        handler2.removeMessages(0);
                        return true;
                    } else if (action != 3) {
                        return false;
                    } else {
                        handler2.removeMessages(0);
                        return true;
                    }
                }
            });
            this.A09.setOnClickListener(new View.OnClickListener() { // from class: X.1Gr
                {
                    C26701Kg.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterfaceC09180cm interfaceC09180cm = C26701Kg.this.A0B;
                    if (interfaceC09180cm != null) {
                        interfaceC09180cm.AHj();
                    }
                }
            });
            this.A09.setImageDrawable(new C0We(c002301c, C02160Ac.A03(this.A0G, R.drawable.emoji_x)));
            this.A09.setContentDescription(context.getString(R.string.backspace));
        }
        View findViewById2 = viewGroup.findViewById(R.id.emoji_tip);
        this.A06 = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
            this.A06.findViewById(R.id.ok).setOnClickListener(new View.OnClickListener() { // from class: X.1Go
                {
                    C26701Kg.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C26701Kg.this.A06.setVisibility(8);
                }
            });
            this.A06.setOnClickListener(new View.OnClickListener() { // from class: X.1Gs
                {
                    C26701Kg.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C26701Kg.this.A06.setVisibility(8);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0025, code lost:
        if (X.C60712uv.A00(r3) == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A00(int[] r5) {
        /*
            boolean r1 = X.C60712uv.A03(r5)
            java.lang.String r0 = "must be skin tone"
            X.C000700j.A08(r1, r0)
            int[] r3 = X.C60712uv.A04(r5)
            int r2 = r3.length
            r0 = 3
            r4 = 0
            if (r2 == r0) goto L15
            r0 = 4
            if (r2 != r0) goto L27
        L15:
            int r0 = r2 + (-2)
            r1 = r3[r0]
            r0 = 8205(0x200d, float:1.1498E-41)
            if (r1 != r0) goto L27
            int r0 = r2 + (-1)
            r3 = r3[r0]
            boolean r0 = X.C60712uv.A00(r3)
            if (r0 != 0) goto L28
        L27:
            r3 = 0
        L28:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r0 = r5[r4]
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r2.append(r0)
            if (r3 != 0) goto L42
            java.lang.String r0 = ""
        L3a:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L42:
            java.lang.String r0 = "_"
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            java.lang.String r0 = java.lang.Integer.toString(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26701Kg.A00(int[]):java.lang.String");
    }

    public static void A01(C02O c02o, int[] iArr) {
        int i;
        String A00 = A00(iArr);
        if (C60712uv.A02(iArr)) {
            i = iArr[1];
        } else {
            i = 0;
        }
        c02o.A01("emoji_modifiers").edit().putInt(A00, i).apply();
    }

    public static int[] A02(C02O c02o, int[] iArr) {
        int i = c02o.A01("emoji_modifiers").getInt(A00(iArr), 0);
        if (C60712uv.A01(i)) {
            if (C60712uv.A02(iArr)) {
                int length = iArr.length;
                int[] iArr2 = new int[length];
                iArr2[0] = iArr[0];
                iArr2[1] = i;
                System.arraycopy(iArr, 2, iArr2, 2, length - 2);
                return iArr2;
            }
            return C60712uv.A05(iArr, i);
        } else if (C60712uv.A02(iArr)) {
            int length2 = iArr.length;
            int[] iArr3 = new int[length2 - 1];
            iArr3[0] = iArr[0];
            System.arraycopy(iArr, 2, iArr3, 1, length2 - 2);
            return iArr3;
        } else {
            return (int[]) iArr.clone();
        }
    }

    public final void A03(int i) {
        C26691Kf[] c26691KfArr;
        for (C26691Kf c26691Kf : this.A0R) {
            View findViewById = this.A08.findViewById(c26691Kf.A01);
            View findViewById2 = this.A08.findViewById(c26691Kf.A00);
            if (findViewById2 != null) {
                if (c26691Kf.A02 == i) {
                    findViewById2.setSelected(true);
                    findViewById.setBackgroundColor(C02160Ac.A00(findViewById.getContext(), R.color.picker_underline_color));
                } else {
                    findViewById2.setSelected(false);
                    findViewById.setBackgroundColor(0);
                }
            }
        }
    }

    public final void A04(final C1X5 c1x5) {
        C2j3 c2j3 = new C2j3(this.A0N, c1x5, c1x5.A05);
        this.A0C = c2j3;
        c2j3.A01 = new InterfaceC54612j4() { // from class: X.1hM
            {
                C26701Kg.this = this;
            }

            @Override // X.InterfaceC54612j4
            public final void AOk(int[] iArr) {
                C26701Kg c26701Kg = C26701Kg.this;
                C1X5 c1x52 = c1x5;
                c26701Kg.A07(iArr);
                c1x52.setEmoji(iArr);
                C26701Kg.A01(c26701Kg.A0P, iArr);
                c1x52.invalidate();
            }
        };
        int[] iArr = new int[2];
        c1x5.getLocationOnScreen(iArr);
        View view = this.A07;
        if (view == null) {
            view = C018308n.A00(c1x5.getContext()).getWindow().getDecorView();
        }
        int[] iArr2 = new int[2];
        view.getRootView().getLocationOnScreen(iArr2);
        c2j3.showAtLocation(view, 51, ((c1x5.getMeasuredWidth() / 2) + (iArr[0] - Math.max(0, iArr2[0]))) - (c2j3.getContentView().getMeasuredWidth() / 2), ((iArr[1] - Math.max(0, iArr2[1])) - c2j3.getContentView().getMeasuredHeight()) - c1x5.getContext().getResources().getDimensionPixelSize(R.dimen.skin_emoji_popup_offset));
    }

    public final void A05(final C1X5 c1x5) {
        int[][] A06;
        int[] iArr = c1x5.A05;
        ViewGroup viewGroup = (ViewGroup) this.A06.findViewById(R.id.all_samples);
        viewGroup.removeAllViews();
        Context context = this.A0G;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.emoji_picker_item);
        int dimensionPixelSize2 = (dimensionPixelSize - context.getResources().getDimensionPixelSize(R.dimen.emoji_picker_icon)) >> 1;
        for (final int[] iArr2 : C60712uv.A06(iArr)) {
            ImageView imageView = new ImageView(this.A06.getContext());
            imageView.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
            imageView.setImageDrawable(this.A0N.A02(context, -1, new C43941yG(iArr2), 0.75f));
            imageView.setOnClickListener(new View.OnClickListener() { // from class: X.1Gq
                {
                    C26701Kg.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C26701Kg.this.A08(iArr2, c1x5);
                }
            });
            viewGroup.addView(imageView);
        }
        ImageView imageView2 = (ImageView) this.A06.findViewById(R.id.sample_current);
        imageView2.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageDrawable(this.A0N.A02(context, -1, new C43941yG(iArr), 0.75f));
        this.A06.setVisibility(0);
    }

    public void A06(C000500h c000500h, C02O c02o, View view) {
        C1X5 c1x5;
        int[] iArr;
        C2j3 c2j3 = this.A0C;
        if ((c2j3 == null || !c2j3.isShowing()) && (iArr = (c1x5 = (C1X5) view).A05) != null) {
            if (C60712uv.A03(iArr)) {
                int i = c000500h.A00.getInt("skin_emoji_tip", 0);
                if (i < 1) {
                    C000200d.A0g(c000500h, "skin_emoji_tip", i + 1);
                    A05(c1x5);
                    return;
                } else if (c02o.A01("emoji_modifiers").getInt(A00(iArr), -1) < 0) {
                    A04(c1x5);
                    return;
                }
            }
            A07(iArr);
        }
    }

    public final void A07(int[] iArr) {
        this.A0O.A0A(iArr);
        if (this.A00 != 0) {
            this.A0D[0].notifyDataSetChanged();
        }
        InterfaceC09180cm interfaceC09180cm = this.A0B;
        if (interfaceC09180cm != null) {
            interfaceC09180cm.AJi(iArr);
        }
    }

    public /* synthetic */ void A08(int[] iArr, C1X5 c1x5) {
        A07(iArr);
        A01(this.A0P, iArr);
        c1x5.setEmoji(iArr);
        int A01 = EmojiDescriptor.A01(iArr);
        Drawable A02 = this.A0N.A02(this.A0G, A01, new C43941yG(iArr), 0.75f);
        if (c1x5.A00 == A01) {
            c1x5.A03 = A02;
            c1x5.invalidate();
        }
        this.A06.setVisibility(8);
    }
}
