package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.lang.reflect.Method;

/* renamed from: X.1SJ */
/* loaded from: classes.dex */
public class C1SJ implements InterfaceC10880gn {
    public static Method A0P;
    public static Method A0Q;
    public static Method A0R;
    public int A02;
    public int A03;
    public Context A07;
    public DataSetObserver A08;
    public Rect A09;
    public View A0A;
    public AdapterView.OnItemClickListener A0B;
    public ListAdapter A0C;
    public PopupWindow A0D;
    public C11150hH A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final Handler A0K;
    public int A01 = -2;
    public int A04 = -2;
    public int A05 = 1002;
    public int A00 = 0;
    public int A06 = Integer.MAX_VALUE;
    public final RunnableC11250hR A0O = new RunnableC11250hR(this);
    public final View$OnTouchListenerC11240hQ A0N = new View.OnTouchListener() { // from class: X.0hQ
        {
            C1SJ.this = this;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0) {
                C1SJ c1sj = C1SJ.this;
                PopupWindow popupWindow = c1sj.A0D;
                if (popupWindow != null && popupWindow.isShowing() && x >= 0 && x < c1sj.A0D.getWidth() && y >= 0 && y < c1sj.A0D.getHeight()) {
                    c1sj.A0K.postDelayed(c1sj.A0O, 250L);
                    return false;
                }
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C1SJ c1sj2 = C1SJ.this;
                c1sj2.A0K.removeCallbacks(c1sj2.A0O);
                return false;
            }
        }
    };
    public final C11230hP A0M = new AbsListView.OnScrollListener() { // from class: X.0hP
        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        {
            C1SJ.this = this;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1) {
                C1SJ c1sj = C1SJ.this;
                if (c1sj.A0D.getInputMethodMode() == 2 || c1sj.A0D.getContentView() == null) {
                    return;
                }
                Handler handler = c1sj.A0K;
                RunnableC11250hR runnableC11250hR = c1sj.A0O;
                handler.removeCallbacks(runnableC11250hR);
                runnableC11250hR.run();
            }
        }
    };
    public final RunnableC11210hN A0L = new Runnable() { // from class: X.0hN
        {
            C1SJ.this = this;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11150hH c11150hH = C1SJ.this.A0E;
            if (c11150hH != null) {
                c11150hH.A0B = true;
                c11150hH.requestLayout();
            }
        }
    };
    public final Rect A0J = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                A0Q = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                A0R = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                A0P = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0hQ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0hP] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0hN] */
    public C1SJ(Context context, AttributeSet attributeSet, int i, int i2) {
        this.A07 = context;
        this.A0K = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0UY.A0P, i, i2);
        this.A02 = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.A03 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.A0F = true;
        }
        obtainStyledAttributes.recycle();
        PopupWindow popupWindow = new PopupWindow(context, attributeSet, i, i2) { // from class: X.0h2
            public static final boolean A01;
            public boolean A00;

            static {
                A01 = Build.VERSION.SDK_INT < 21;
            }

            {
                super(context, attributeSet, i, i2);
                Drawable drawable;
                int resourceId;
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0UY.A0T, i, i2);
                if (obtainStyledAttributes2.hasValue(2)) {
                    boolean z = obtainStyledAttributes2.getBoolean(2, false);
                    if (A01) {
                        this.A00 = z;
                    } else {
                        C07O.A0k(this, z);
                    }
                }
                if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
                    drawable = C09L.A01(context, resourceId);
                } else {
                    drawable = obtainStyledAttributes2.getDrawable(0);
                }
                setBackgroundDrawable(drawable);
                obtainStyledAttributes2.recycle();
            }

            @Override // android.widget.PopupWindow
            public void showAsDropDown(View view, int i3, int i4) {
                if (A01 && this.A00) {
                    i4 -= view.getHeight();
                }
                super.showAsDropDown(view, i3, i4);
            }

            @Override // android.widget.PopupWindow
            public void showAsDropDown(View view, int i3, int i4, int i5) {
                if (A01 && this.A00) {
                    i4 -= view.getHeight();
                }
                super.showAsDropDown(view, i3, i4, i5);
            }

            @Override // android.widget.PopupWindow
            public void update(View view, int i3, int i4, int i5, int i6) {
                if (A01 && this.A00) {
                    i4 -= view.getHeight();
                }
                super.update(view, i3, i4, i5, i6);
            }
        };
        this.A0D = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    public C11150hH A00(Context context, boolean z) {
        return new C11150hH(context, z);
    }

    public void A01(int i) {
        Drawable background = this.A0D.getBackground();
        if (background != null) {
            Rect rect = this.A0J;
            background.getPadding(rect);
            this.A04 = rect.left + rect.right + i;
            return;
        }
        this.A04 = i;
    }

    public Drawable A8T() {
        return this.A0D.getBackground();
    }

    public int AAW() {
        return this.A02;
    }

    @Override // X.InterfaceC10880gn
    public ListView AAw() {
        return this.A0E;
    }

    public int ADo() {
        if (this.A0F) {
            return this.A03;
        }
        return 0;
    }

    @Override // X.InterfaceC10880gn
    public boolean AFo() {
        return this.A0D.isShowing();
    }

    public void ASg(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.A08;
        if (dataSetObserver == null) {
            this.A08 = new DataSetObserver() { // from class: X.0hO
                {
                    C1SJ.this = this;
                }

                @Override // android.database.DataSetObserver
                public void onChanged() {
                    C1SJ c1sj = C1SJ.this;
                    if (c1sj.AFo()) {
                        c1sj.AUa();
                    }
                }

                @Override // android.database.DataSetObserver
                public void onInvalidated() {
                    C1SJ.this.dismiss();
                }
            };
        } else {
            ListAdapter listAdapter2 = this.A0C;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.A0C = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.A08);
        }
        C11150hH c11150hH = this.A0E;
        if (c11150hH != null) {
            c11150hH.setAdapter(this.A0C);
        }
    }

    public void ASk(Drawable drawable) {
        this.A0D.setBackgroundDrawable(drawable);
    }

    public void AT5(int i) {
        this.A02 = i;
    }

    public void AU6(int i) {
        this.A03 = i;
        this.A0F = true;
    }

    @Override // X.InterfaceC10880gn
    public void AUa() {
        Rect rect;
        int i;
        int maxAvailableHeight;
        int makeMeasureSpec;
        int i2;
        C11150hH c11150hH;
        if (this.A0E == null) {
            C11150hH A00 = A00(this.A07, !this.A0G);
            this.A0E = A00;
            A00.setAdapter(this.A0C);
            this.A0E.setOnItemClickListener(this.A0B);
            this.A0E.setFocusable(true);
            this.A0E.setFocusableInTouchMode(true);
            this.A0E.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: X.0hM
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView adapterView) {
                }

                {
                    C1SJ.this = this;
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView adapterView, View view, int i3, long j) {
                    C11150hH c11150hH2;
                    if (i3 != -1 && (c11150hH2 = C1SJ.this.A0E) != null) {
                        c11150hH2.A0B = false;
                    }
                }
            });
            this.A0E.setOnScrollListener(this.A0M);
            this.A0D.setContentView(this.A0E);
        } else {
            this.A0D.getContentView();
        }
        Drawable background = this.A0D.getBackground();
        if (background != null) {
            Rect rect2 = this.A0J;
            rect = rect2;
            background.getPadding(rect2);
            int i3 = rect2.top;
            i = rect2.bottom + i3;
            if (!this.A0F) {
                this.A03 = -i3;
            }
        } else {
            rect = this.A0J;
            rect.setEmpty();
            i = 0;
        }
        boolean z = this.A0D.getInputMethodMode() == 2;
        View view = this.A0A;
        int i4 = this.A03;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = A0P;
            if (method != null) {
                try {
                    maxAvailableHeight = ((Integer) method.invoke(this.A0D, view, Integer.valueOf(i4), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            maxAvailableHeight = this.A0D.getMaxAvailableHeight(view, i4);
        } else {
            maxAvailableHeight = this.A0D.getMaxAvailableHeight(view, i4, z);
        }
        int i5 = this.A04;
        if (i5 == -2) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.A07.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        } else if (i5 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.A07.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
        }
        int A002 = this.A0E.A00(makeMeasureSpec, maxAvailableHeight - 0);
        if (A002 > 0) {
            i2 = this.A0E.getPaddingBottom() + this.A0E.getPaddingTop() + i + 0;
        } else {
            i2 = 0;
        }
        int i6 = A002 + i2;
        this.A0D.getInputMethodMode();
        C07O.A0j(this.A0D, 1002);
        if (this.A0D.isShowing()) {
            if (C0AT.A0g(this.A0A)) {
                int i7 = this.A04;
                if (i7 == -1) {
                    i7 = -1;
                } else if (i7 == -2) {
                    i7 = this.A0A.getWidth();
                }
                this.A0D.setOutsideTouchable(true);
                PopupWindow popupWindow = this.A0D;
                View view2 = this.A0A;
                int i8 = this.A02;
                int i9 = this.A03;
                if (i7 < 0) {
                    i7 = -1;
                }
                if (i6 < 0) {
                    i6 = -1;
                }
                popupWindow.update(view2, i8, i9, i7, i6);
                return;
            }
            return;
        }
        int i10 = this.A04;
        if (i10 == -1) {
            i10 = -1;
        } else if (i10 == -2) {
            i10 = this.A0A.getWidth();
        }
        this.A0D.setWidth(i10);
        this.A0D.setHeight(i6);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = A0Q;
            if (method2 != null) {
                try {
                    method2.invoke(this.A0D, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.A0D.setIsClippedToScreen(true);
        }
        this.A0D.setOutsideTouchable(true);
        this.A0D.setTouchInterceptor(this.A0N);
        if (this.A0I) {
            C07O.A0k(this.A0D, this.A0H);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = A0R;
            if (method3 != null) {
                try {
                    method3.invoke(this.A0D, this.A09);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            this.A0D.setEpicenterBounds(this.A09);
        }
        PopupWindow popupWindow2 = this.A0D;
        View view3 = this.A0A;
        int i11 = this.A02;
        int i12 = this.A03;
        int i13 = this.A00;
        if (Build.VERSION.SDK_INT >= 19) {
            popupWindow2.showAsDropDown(view3, i11, i12, i13);
        } else {
            if ((C07O.A01(i13, C0AT.A05(view3)) & 7) == 5) {
                i11 -= popupWindow2.getWidth() - view3.getWidth();
            }
            popupWindow2.showAsDropDown(view3, i11, i12);
        }
        this.A0E.setSelection(-1);
        if ((!this.A0G || this.A0E.isInTouchMode()) && (c11150hH = this.A0E) != null) {
            c11150hH.A0B = true;
            c11150hH.requestLayout();
        }
        if (!this.A0G) {
            this.A0K.post(this.A0L);
        }
    }

    @Override // X.InterfaceC10880gn
    public void dismiss() {
        this.A0D.dismiss();
        this.A0D.setContentView(null);
        this.A0E = null;
        this.A0K.removeCallbacks(this.A0O);
    }
}
