package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.Toolbar;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: X.0CN */
/* loaded from: classes.dex */
public class C0CN extends AbstractC004101x implements C0CO, LayoutInflater.Factory2 {
    public static boolean A0n;
    public static final Map A0o = new C006702y();
    public static final boolean A0p;
    public static final boolean A0q;
    public static final int[] A0r;
    public int A00;
    public int A01;
    public int A02;
    public Rect A03;
    public Rect A04;
    public MenuInflater A05;
    public View A06;
    public ViewGroup A07;
    public Window A08;
    public PopupWindow A09;
    public TextView A0A;
    public C0U1 A0B;
    public C0VH A0C;
    public C06700Uq A0D;
    public AbstractC06690Up A0E;
    public AbstractC06690Up A0F;
    public C0V0 A0G;
    public C0VE A0H;
    public AppCompatViewInflater A0I;
    public C0U0 A0J;
    public ActionBarContextView A0K;
    public InterfaceC06760Uw A0L;
    public CharSequence A0N;
    public Runnable A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public C0V0[] A0i;
    public final Context A0j;
    public final AnonymousClass091 A0k;
    public final Object A0l;
    public C0TT A0M = null;
    public boolean A0X = true;
    public final Runnable A0m = new Runnable() { // from class: X.0UU
        {
            C0CN.this = this;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0CN c0cn = C0CN.this;
            if ((c0cn.A00 & 1) != 0) {
                c0cn.A0Z(0);
            }
            if ((c0cn.A00 & 4096) != 0) {
                c0cn.A0Z(C0M6.A03);
            }
            c0cn.A0Z = false;
            c0cn.A00 = 0;
        }
    };

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        boolean z2 = i < 21;
        A0p = z2;
        A0r = new int[]{16842836};
        if (i >= 21 && i <= 25) {
            z = true;
        }
        A0q = z;
        if (z2) {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: X.0UT
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    String message;
                    if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null || (!message.contains("drawable") && !message.contains("Drawable"))) {
                        defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(th.getMessage());
                    sb.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException(sb.toString());
                    notFoundException.initCause(th.getCause());
                    notFoundException.setStackTrace(th.getStackTrace());
                    defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                }
            });
            A0n = true;
        }
    }

    public C0CN(Context context, Window window, AnonymousClass091 anonymousClass091, Object obj) {
        this.A01 = -100;
        this.A0j = context;
        this.A0k = anonymousClass091;
        this.A0l = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof ActivityC02320As) {
                        ActivityC02320As activityC02320As = (ActivityC02320As) context;
                        if (activityC02320As != null) {
                            activityC02320As.A0d();
                        }
                    } else if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    break;
                }
            }
        }
        C006802z c006802z = (C006802z) A0o;
        Number number = (Number) c006802z.get(this.A0l.getClass());
        if (number != null) {
            this.A01 = number.intValue();
            c006802z.remove(this.A0l.getClass());
        }
        if (window != null) {
            A0a(window);
        }
        C0UV.A02();
    }

    @Override // X.AbstractC004101x
    public MenuInflater A02() {
        Context context;
        MenuInflater menuInflater = this.A05;
        if (menuInflater == null) {
            A0X();
            C0U1 c0u1 = this.A0B;
            if (c0u1 != null) {
                context = c0u1.A02();
            } else {
                context = this.A0j;
            }
            C0UW c0uw = new C0UW(context);
            this.A05 = c0uw;
            return c0uw;
        }
        return menuInflater;
    }

    @Override // X.AbstractC004101x
    public View A03(int i) {
        A0V();
        return this.A08.findViewById(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0070, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L19;
     */
    @Override // X.AbstractC004101x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View A04(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r11 = this;
            androidx.appcompat.app.AppCompatViewInflater r0 = r11.A0I
            r7 = 0
            if (r0 != 0) goto L5e
            android.content.Context r1 = r11.A0j
            int[] r0 = X.C0UY.A0E
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r0)
            r0 = 114(0x72, float:1.6E-43)
            java.lang.String r3 = r1.getString(r0)
            if (r3 == 0) goto L36
            java.lang.Class<androidx.appcompat.app.AppCompatViewInflater> r0 = androidx.appcompat.app.AppCompatViewInflater.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L36
            java.lang.Class r1 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.Class[] r0 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L3e
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L3e
            androidx.appcompat.app.AppCompatViewInflater r0 = (androidx.appcompat.app.AppCompatViewInflater) r0     // Catch: java.lang.Throwable -> L3e
            r11.A0I = r0     // Catch: java.lang.Throwable -> L3e
            goto L5e
        L36:
            androidx.appcompat.app.AppCompatViewInflater r0 = new androidx.appcompat.app.AppCompatViewInflater
            r0.<init>()
            r11.A0I = r0
            goto L5e
        L3e:
            r2 = move-exception
            java.lang.String r0 = "Failed to instantiate custom view inflater "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = ". Falling back to default."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "AppCompatDelegate"
            android.util.Log.i(r0, r1, r2)
            androidx.appcompat.app.AppCompatViewInflater r0 = new androidx.appcompat.app.AppCompatViewInflater
            r0.<init>()
            r11.A0I = r0
        L5e:
            boolean r8 = X.C0CN.A0p
            r3 = r12
            r6 = r15
            if (r8 == 0) goto L73
            boolean r0 = r15 instanceof org.xmlpull.v1.XmlPullParser
            r1 = 1
            if (r0 == 0) goto L7e
            r0 = r6
            org.xmlpull.v1.XmlPullParser r0 = (org.xmlpull.v1.XmlPullParser) r0
            int r0 = r0.getDepth()
            if (r0 <= r1) goto L73
        L72:
            r7 = 1
        L73:
            androidx.appcompat.app.AppCompatViewInflater r2 = r11.A0I
            r9 = 1
            r10 = 0
            r4 = r13
            r5 = r14
            android.view.View r0 = r2.createView(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L7e:
            r2 = r3
            android.view.ViewParent r2 = (android.view.ViewParent) r2
            if (r2 == 0) goto L73
            android.view.Window r0 = r11.A08
            android.view.View r1 = r0.getDecorView()
        L89:
            if (r2 == 0) goto L72
            if (r2 == r1) goto L73
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L73
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            boolean r0 = X.C0AT.A0g(r0)
            if (r0 != 0) goto L73
            android.view.ViewParent r2 = r2.getParent()
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CN.A04(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // X.AbstractC004101x
    public C0U1 A05() {
        A0X();
        return this.A0B;
    }

    @Override // X.AbstractC004101x
    public final InterfaceC06600Ua A06() {
        return new InterfaceC06600Ua() { // from class: X.0UZ
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0112, code lost:
        if (r1 == false) goto L78;
     */
    @Override // X.AbstractC004101x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C0U0 A07(X.C0O8 r11) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CN.A07(X.0O8):X.0U0");
    }

    @Override // X.AbstractC004101x
    public void A08() {
        LayoutInflater from = LayoutInflater.from(this.A0j);
        if (from.getFactory() == null) {
            C002701i.A1F(from, this);
        } else if (from.getFactory2() instanceof C0CN) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // X.AbstractC004101x
    public void A09() {
        A0X();
        C0U1 c0u1 = this.A0B;
        if (c0u1 == null || !c0u1.A0R()) {
            this.A00 = (1 << 0) | this.A00;
            if (!this.A0Z) {
                this.A08.getDecorView().postOnAnimation(this.A0m);
                this.A0Z = true;
            }
        }
    }

    @Override // X.AbstractC004101x
    public void A0A() {
        synchronized (AbstractC004101x.A02) {
            AbstractC004101x.A01(this);
        }
        if (this.A0Z) {
            this.A08.getDecorView().removeCallbacks(this.A0m);
        }
        this.A0f = false;
        this.A0a = true;
        C0U1 c0u1 = this.A0B;
        if (c0u1 != null) {
            c0u1.A04();
        }
        AbstractC06690Up abstractC06690Up = this.A0F;
        if (abstractC06690Up != null) {
            abstractC06690Up.A02();
        }
        AbstractC06690Up abstractC06690Up2 = this.A0E;
        if (abstractC06690Up2 != null) {
            abstractC06690Up2.A02();
        }
    }

    @Override // X.AbstractC004101x
    public void A0B() {
        A0X();
        C0U1 c0u1 = this.A0B;
        if (c0u1 != null) {
            c0u1.A0K(true);
        }
    }

    @Override // X.AbstractC004101x
    public void A0C() {
        this.A0f = true;
        A0Q();
        synchronized (AbstractC004101x.A02) {
            AbstractC004101x.A01(this);
            AbstractC004101x.A01.add(new WeakReference(this));
        }
    }

    @Override // X.AbstractC004101x
    public void A0D() {
        this.A0f = false;
        synchronized (AbstractC004101x.A02) {
            AbstractC004101x.A01(this);
        }
        A0X();
        C0U1 c0u1 = this.A0B;
        if (c0u1 != null) {
            c0u1.A0K(false);
        }
        if (this.A0l instanceof Dialog) {
            AbstractC06690Up abstractC06690Up = this.A0F;
            if (abstractC06690Up != null) {
                abstractC06690Up.A02();
            }
            AbstractC06690Up abstractC06690Up2 = this.A0E;
            if (abstractC06690Up2 != null) {
                abstractC06690Up2.A02();
            }
        }
    }

    @Override // X.AbstractC004101x
    public void A0E(int i) {
        this.A02 = i;
    }

    @Override // X.AbstractC004101x
    public void A0F(int i) {
        A0V();
        ViewGroup viewGroup = (ViewGroup) this.A07.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.A0j).inflate(i, viewGroup);
        ((Window$CallbackC06710Ur) this.A0D).A00.onContentChanged();
    }

    @Override // X.AbstractC004101x
    public void A0G(Context context) {
        A0g(false);
        this.A0R = true;
    }

    @Override // X.AbstractC004101x
    public void A0H(Configuration configuration) {
        if (this.A0Y && this.A0g) {
            A0X();
            C0U1 c0u1 = this.A0B;
            if (c0u1 != null) {
                c0u1.A09(configuration);
            }
        }
        C0UV A01 = C0UV.A01();
        Context context = this.A0j;
        synchronized (A01) {
            C06720Us c06720Us = A01.A00;
            synchronized (c06720Us) {
                C05I c05i = (C05I) c06720Us.A06.get(context);
                if (c05i != null) {
                    c05i.A05();
                }
            }
        }
        A0g(false);
    }

    @Override // X.AbstractC004101x
    public void A0I(Bundle bundle) {
        this.A0R = true;
        A0g(false);
        A0W();
        Object obj = this.A0l;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    str = C002701i.A0h(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                C0U1 c0u1 = this.A0B;
                if (c0u1 == null) {
                    this.A0U = true;
                } else {
                    c0u1.A0J(true);
                }
            }
        }
        this.A0T = true;
    }

    @Override // X.AbstractC004101x
    public void A0J(Bundle bundle) {
        A0V();
    }

    @Override // X.AbstractC004101x
    public void A0K(Bundle bundle) {
        int i = this.A01;
        if (i != -100) {
            ((C006802z) A0o).put(this.A0l.getClass(), Integer.valueOf(i));
        }
    }

    @Override // X.AbstractC004101x
    public void A0L(View view) {
        A0V();
        ViewGroup viewGroup = (ViewGroup) this.A07.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        ((Window$CallbackC06710Ur) this.A0D).A00.onContentChanged();
    }

    @Override // X.AbstractC004101x
    public void A0M(View view, ViewGroup.LayoutParams layoutParams) {
        A0V();
        ((ViewGroup) this.A07.findViewById(16908290)).addView(view, layoutParams);
        ((Window$CallbackC06710Ur) this.A0D).A00.onContentChanged();
    }

    @Override // X.AbstractC004101x
    public void A0N(View view, ViewGroup.LayoutParams layoutParams) {
        A0V();
        ViewGroup viewGroup = (ViewGroup) this.A07.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        ((Window$CallbackC06710Ur) this.A0D).A00.onContentChanged();
    }

    @Override // X.AbstractC004101x
    public void A0O(Toolbar toolbar) {
        CharSequence charSequence;
        Object obj = this.A0l;
        boolean z = obj instanceof Activity;
        if (z) {
            A0X();
            C0U1 c0u1 = this.A0B;
            if (!(c0u1 instanceof C06730Ut)) {
                this.A05 = null;
                if (c0u1 != null) {
                    c0u1.A04();
                }
                if (toolbar != null) {
                    if (z) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.A0N;
                    }
                    C06750Uv c06750Uv = new C06750Uv(toolbar, charSequence, this.A0D);
                    this.A0B = c06750Uv;
                    this.A08.setCallback(c06750Uv.A00);
                } else {
                    this.A0B = null;
                    this.A08.setCallback(this.A0D);
                }
                A09();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    @Override // X.AbstractC004101x
    public final void A0P(CharSequence charSequence) {
        this.A0N = charSequence;
        InterfaceC06760Uw interfaceC06760Uw = this.A0L;
        if (interfaceC06760Uw != null) {
            interfaceC06760Uw.setWindowTitle(charSequence);
            return;
        }
        C0U1 c0u1 = this.A0B;
        if (c0u1 != null) {
            c0u1.A0F(charSequence);
            return;
        }
        TextView textView = this.A0A;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    @Override // X.AbstractC004101x
    public boolean A0Q() {
        return A0g(true);
    }

    @Override // X.AbstractC004101x
    public boolean A0R(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = C0M6.A03;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.A0h && i == 108) {
            return false;
        }
        if (this.A0Y && i == 1) {
            this.A0Y = false;
        } else if (i != 1) {
            if (i == 2) {
                A0Y();
                this.A0W = true;
                return true;
            } else if (i == 5) {
                A0Y();
                this.A0V = true;
                return true;
            } else if (i == 10) {
                A0Y();
                this.A0e = true;
                return true;
            } else if (i == 108) {
                A0Y();
                this.A0Y = true;
                return true;
            } else if (i != 109) {
                return this.A08.requestFeature(i);
            } else {
                A0Y();
                this.A0d = true;
                return true;
            }
        }
        A0Y();
        this.A0h = true;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x007d, code lost:
        if (r1 != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A0S(int r8) {
        /*
            r7 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r7.A0K
            r4 = 0
            if (r0 == 0) goto Lac
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lac
            androidx.appcompat.widget.ActionBarContextView r0 = r7.A0K
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            androidx.appcompat.widget.ActionBarContextView r0 = r7.A0K
            boolean r0 = r0.isShown()
            r6 = 1
            if (r0 == 0) goto La2
            android.graphics.Rect r0 = r7.A03
            if (r0 != 0) goto L30
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.A03 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.A04 = r0
        L30:
            android.graphics.Rect r2 = r7.A03
            android.graphics.Rect r1 = r7.A04
            r2.set(r4, r8, r4, r4)
            android.view.ViewGroup r0 = r7.A07
            X.C0Ux.A00(r0, r2, r1)
            int r0 = r1.top
            r1 = 0
            if (r0 != 0) goto L42
            r1 = r8
        L42:
            int r0 = r5.topMargin
            if (r0 == r1) goto La0
            r5.topMargin = r8
            android.view.View r0 = r7.A06
            if (r0 != 0) goto L90
            android.content.Context r0 = r7.A0j
            android.view.View r2 = new android.view.View
            r2.<init>(r0)
            r7.A06 = r2
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131099655(0x7f060007, float:1.781167E38)
            int r0 = r1.getColor(r0)
            r2.setBackgroundColor(r0)
            android.view.ViewGroup r3 = r7.A07
            android.view.View r2 = r7.A06
            r1 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r8)
            r3.addView(r2, r1, r0)
        L70:
            r1 = 1
        L71:
            android.view.View r0 = r7.A06
            if (r0 != 0) goto L76
            r6 = 0
        L76:
            boolean r0 = r7.A0e
            if (r0 != 0) goto L7d
            if (r6 == 0) goto L7d
            r8 = 0
        L7d:
            if (r1 == 0) goto L84
        L7f:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.A0K
            r0.setLayoutParams(r5)
        L84:
            android.view.View r0 = r7.A06
            if (r0 == 0) goto L8f
            if (r6 != 0) goto L8c
            r4 = 8
        L8c:
            r0.setVisibility(r4)
        L8f:
            return r8
        L90:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r0 = r1.height
            if (r0 == r8) goto L70
            r1.height = r8
            android.view.View r0 = r7.A06
            r0.setLayoutParams(r1)
            goto L70
        La0:
            r1 = 0
            goto L71
        La2:
            int r0 = r5.topMargin
            if (r0 == 0) goto Laa
            r5.topMargin = r4
            r6 = 0
            goto L7f
        Laa:
            r6 = 0
            goto L84
        Lac:
            r6 = 0
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CN.A0S(int):int");
    }

    public final AbstractC06690Up A0T() {
        AbstractC06690Up abstractC06690Up = this.A0F;
        if (abstractC06690Up == null) {
            Context context = this.A0j;
            C06770Uy c06770Uy = C06770Uy.A03;
            if (c06770Uy == null) {
                Context applicationContext = context.getApplicationContext();
                c06770Uy = new C06770Uy(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
                C06770Uy.A03 = c06770Uy;
            }
            AbstractC06690Up abstractC06690Up2 = new AbstractC06690Up(c06770Uy) { // from class: X.0Uz
                public final C06770Uy A00;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(this);
                    C0CN.this = this;
                    this.A00 = c06770Uy;
                }

                /* JADX WARN: Removed duplicated region for block: B:53:0x0016 A[ORIG_RETURN, RETURN] */
                @Override // X.AbstractC06690Up
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public int A00() {
                    /*
                        r23 = this;
                        r0 = r23
                        X.0Uy r3 = r0.A00
                        X.0gN r5 = r3.A02
                        long r1 = r5.A00
                        long r6 = java.lang.System.currentTimeMillis()
                        r4 = 0
                        r8 = 1
                        int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                        if (r0 <= 0) goto L18
                        boolean r4 = r5.A01
                    L14:
                        if (r4 == 0) goto L17
                    L16:
                        r8 = 2
                    L17:
                        return r8
                    L18:
                        android.content.Context r1 = r3.A00
                        java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
                        int r0 = X.C07O.A05(r1, r0)
                        r9 = 0
                        if (r0 != 0) goto L29
                        java.lang.String r0 = "network"
                        android.location.Location r9 = r3.A00(r0)
                    L29:
                        java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
                        int r0 = X.C07O.A05(r1, r0)
                        if (r0 != 0) goto Lb7
                        java.lang.String r0 = "gps"
                        android.location.Location r3 = r3.A00(r0)
                        if (r3 == 0) goto Lb7
                        if (r9 == 0) goto L47
                        long r6 = r3.getTime()
                        long r1 = r9.getTime()
                        int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                        if (r0 <= 0) goto L48
                    L47:
                        r9 = r3
                    L48:
                        long r17 = java.lang.System.currentTimeMillis()
                        X.0gM r10 = X.C10610gM.A03
                        if (r10 != 0) goto L57
                        X.0gM r10 = new X.0gM
                        r10.<init>()
                        X.C10610gM.A03 = r10
                    L57:
                        r6 = 86400000(0x5265c00, double:4.2687272E-316)
                        long r11 = r17 - r6
                        double r13 = r9.getLatitude()
                        double r15 = r9.getLongitude()
                        r10.A00(r11, r13, r15)
                        double r19 = r9.getLatitude()
                        double r21 = r9.getLongitude()
                        r16 = r10
                        r16.A00(r17, r19, r21)
                        int r0 = r10.A00
                        if (r0 != r8) goto L79
                        r4 = 1
                    L79:
                        long r2 = r10.A01
                        long r0 = r10.A02
                        long r11 = r17 + r6
                        double r13 = r9.getLatitude()
                        double r15 = r9.getLongitude()
                        r10.A00(r11, r13, r15)
                        long r6 = r10.A01
                        r12 = 0
                        r10 = -1
                        int r9 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                        if (r9 == 0) goto Lb1
                        int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
                        if (r9 == 0) goto Lb1
                        int r9 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
                        if (r9 <= 0) goto La7
                        long r6 = r6 + r12
                    L9d:
                        r0 = 60000(0xea60, double:2.9644E-319)
                        long r6 = r6 + r0
                    La1:
                        r5.A01 = r4
                        r5.A00 = r6
                        goto L14
                    La7:
                        int r6 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
                        if (r6 <= 0) goto Lae
                        long r6 = r0 + r12
                        goto L9d
                    Lae:
                        long r6 = r2 + r12
                        goto L9d
                    Lb1:
                        r6 = 43200000(0x2932e00, double:2.1343636E-316)
                        long r6 = r6 + r17
                        goto La1
                    Lb7:
                        if (r9 != 0) goto L48
                        java.lang.String r1 = "TwilightManager"
                        java.lang.String r0 = "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."
                        android.util.Log.i(r1, r0)
                        java.util.Calendar r1 = java.util.Calendar.getInstance()
                        r0 = 11
                        int r1 = r1.get(r0)
                        r0 = 6
                        if (r1 < r0) goto L16
                        r0 = 22
                        if (r1 < r0) goto L17
                        goto L16
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C06780Uz.A00():int");
                }

                @Override // X.AbstractC06690Up
                public IntentFilter A01() {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.TIME_SET");
                    intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
                    intentFilter.addAction("android.intent.action.TIME_TICK");
                    return intentFilter;
                }

                @Override // X.AbstractC06690Up
                public void A04() {
                    C0CN.this.A0Q();
                }
            };
            this.A0F = abstractC06690Up2;
            return abstractC06690Up2;
        }
        return abstractC06690Up;
    }

    public C0V0 A0U(int i) {
        C0V0[] c0v0Arr = this.A0i;
        if (c0v0Arr == null || c0v0Arr.length <= i) {
            C0V0[] c0v0Arr2 = new C0V0[i + 1];
            if (c0v0Arr != null) {
                System.arraycopy(c0v0Arr, 0, c0v0Arr2, 0, c0v0Arr.length);
            }
            this.A0i = c0v0Arr2;
            c0v0Arr = c0v0Arr2;
        }
        C0V0 c0v0 = c0v0Arr[i];
        if (c0v0 == null) {
            C0V0 c0v02 = new C0V0(i);
            c0v0Arr[i] = c0v02;
            return c0v02;
        }
        return c0v0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0068, code lost:
        if (r7 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0V() {
        /*
            Method dump skipped, instructions count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CN.A0V():void");
    }

    public final void A0W() {
        if (this.A08 == null) {
            Object obj = this.A0l;
            if (obj instanceof Activity) {
                A0a(((Activity) obj).getWindow());
            }
        }
        if (this.A08 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final void A0X() {
        C0U1 c0u1;
        A0V();
        if (this.A0Y && (c0u1 = this.A0B) == null) {
            Object obj = this.A0l;
            if (obj instanceof Activity) {
                c0u1 = new C06730Ut((Activity) obj, this.A0d);
                this.A0B = c0u1;
            } else if (obj instanceof Dialog) {
                c0u1 = new C06730Ut((Dialog) obj);
                this.A0B = c0u1;
            } else if (c0u1 == null) {
                return;
            }
            c0u1.A0J(this.A0U);
        }
    }

    public final void A0Y() {
        if (this.A0g) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public void A0Z(int i) {
        C0V0 A0U = A0U(i);
        if (A0U.A0A != null) {
            Bundle bundle = new Bundle();
            A0U.A0A.A0A(bundle);
            if (bundle.size() > 0) {
                A0U.A05 = bundle;
            }
            C06650Uk c06650Uk = A0U.A0A;
            c06650Uk.A07();
            c06650Uk.clear();
        }
        A0U.A0G = true;
        A0U.A0F = true;
        if ((i == 108 || i == 0) && this.A0L != null) {
            C0V0 A0U2 = A0U(0);
            A0U2.A0D = false;
            A0f(A0U2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Uq, android.view.Window$Callback] */
    public final void A0a(Window window) {
        if (this.A08 == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C06700Uq)) {
                ?? r0 = new Window$CallbackC06710Ur(callback) { // from class: X.0Uq
                    @Override // X.Window$CallbackC06710Ur, android.view.Window.Callback
                    public void onContentChanged() {
                    }

                    {
                        C0CN.this = this;
                    }

                    @Override // X.Window$CallbackC06710Ur, android.view.Window.Callback
                    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                        return C0CN.this.A0e(keyEvent) || super.A00.dispatchKeyEvent(keyEvent);
                    }

                    @Override // X.Window$CallbackC06710Ur, android.view.Window.Callback
                    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
                        C06650Uk c06650Uk;
                        C06650Uk c06650Uk2;
                        if (!super.A00.dispatchKeyShortcutEvent(keyEvent)) {
                            C0CN c0cn = C0CN.this;
                            int keyCode = keyEvent.getKeyCode();
                            c0cn.A0X();
                            C0U1 c0u1 = c0cn.A0B;
                            if (c0u1 == null || !c0u1.A0T(keyCode, keyEvent)) {
                                C0V0 c0v0 = c0cn.A0G;
                                if (c0v0 != null) {
                                    int keyCode2 = keyEvent.getKeyCode();
                                    boolean z = false;
                                    if (!keyEvent.isSystem() && ((c0v0.A0D || c0cn.A0f(c0v0, keyEvent)) && (c06650Uk2 = c0v0.A0A) != null)) {
                                        z = c06650Uk2.performShortcut(keyCode2, keyEvent, 1);
                                    }
                                    if (z) {
                                        C0V0 c0v02 = c0cn.A0G;
                                        if (c0v02 != null) {
                                            c0v02.A0B = true;
                                        }
                                    }
                                }
                                if (c0cn.A0G != null) {
                                    return false;
                                }
                                C0V0 A0U = c0cn.A0U(0);
                                c0cn.A0f(A0U, keyEvent);
                                int keyCode3 = keyEvent.getKeyCode();
                                boolean z2 = false;
                                if (!keyEvent.isSystem() && ((A0U.A0D || c0cn.A0f(A0U, keyEvent)) && (c06650Uk = A0U.A0A) != null)) {
                                    z2 = c06650Uk.performShortcut(keyCode3, keyEvent, 1);
                                }
                                A0U.A0D = false;
                                if (!z2) {
                                    return false;
                                }
                            }
                        }
                        return true;
                    }

                    @Override // X.Window$CallbackC06710Ur, android.view.Window.Callback
                    public boolean onCreatePanelMenu(int i, Menu menu) {
                        if (i != 0 || (menu instanceof C06650Uk)) {
                            return super.A00.onCreatePanelMenu(i, menu);
                        }
                        return false;
                    }

                    @Override // X.Window$CallbackC06710Ur, android.view.Window.Callback
                    public boolean onMenuOpened(int i, Menu menu) {
                        super.A00.onMenuOpened(i, menu);
                        C0CN c0cn = C0CN.this;
                        if (c0cn != null) {
                            if (i == 108) {
                                c0cn.A0X();
                                C0U1 c0u1 = c0cn.A0B;
                                if (c0u1 != null) {
                                    c0u1.A0I(true);
                                }
                            }
                            return true;
                        }
                        throw null;
                    }

                    @Override // X.Window$CallbackC06710Ur, android.view.Window.Callback
                    public void onPanelClosed(int i, Menu menu) {
                        super.A00.onPanelClosed(i, menu);
                        C0CN c0cn = C0CN.this;
                        if (c0cn == null) {
                            throw null;
                        }
                        if (i == 108) {
                            c0cn.A0X();
                            C0U1 c0u1 = c0cn.A0B;
                            if (c0u1 != null) {
                                c0u1.A0I(false);
                            }
                        } else if (i != 0) {
                        } else {
                            C0V0 A0U = c0cn.A0U(i);
                            if (!A0U.A0C) {
                                return;
                            }
                            c0cn.A0c(A0U, false);
                        }
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:24:0x000e, code lost:
                        if (r2 != null) goto L9;
                     */
                    @Override // android.view.Window.Callback
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public boolean onPreparePanel(int r4, android.view.View r5, android.view.Menu r6) {
                        /*
                            r3 = this;
                            boolean r0 = r6 instanceof X.C06650Uk
                            r2 = 0
                            if (r0 == 0) goto L8
                            r2 = r6
                            X.0Uk r2 = (X.C06650Uk) r2
                        L8:
                            r1 = 0
                            if (r4 != 0) goto Le
                            if (r2 != 0) goto L10
                            return r1
                        Le:
                            if (r2 == 0) goto L13
                        L10:
                            r0 = 1
                            r2.A0H = r0
                        L13:
                            android.view.Window$Callback r0 = r3.A00
                            boolean r0 = r0.onPreparePanel(r4, r5, r6)
                            if (r2 == 0) goto L1d
                            r2.A0H = r1
                        L1d:
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C06700Uq.onPreparePanel(int, android.view.View, android.view.Menu):boolean");
                    }

                    @Override // X.Window$CallbackC06710Ur, android.view.Window.Callback
                    public void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
                        C06650Uk c06650Uk = C0CN.this.A0U(0).A0A;
                        if (c06650Uk != null) {
                            super.A00.onProvideKeyboardShortcuts(list, c06650Uk, i);
                        } else {
                            super.A00.onProvideKeyboardShortcuts(list, menu, i);
                        }
                    }

                    @Override // X.Window$CallbackC06710Ur, android.view.Window.Callback
                    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback2) {
                        if (Build.VERSION.SDK_INT >= 23) {
                            return null;
                        }
                        C0CN c0cn = C0CN.this;
                        if (c0cn.A0X) {
                            C07260Xn c07260Xn = new C07260Xn(c0cn.A0j, callback2);
                            C0U0 A07 = c0cn.A07(c07260Xn);
                            if (A07 != null) {
                                return c07260Xn.A00(A07);
                            }
                            return null;
                        }
                        return super.A00.onWindowStartingActionMode(callback2);
                    }

                    @Override // X.Window$CallbackC06710Ur, android.view.Window.Callback
                    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback2, int i) {
                        C0CN c0cn = C0CN.this;
                        if (c0cn.A0X && i == 0) {
                            C07260Xn c07260Xn = new C07260Xn(c0cn.A0j, callback2);
                            C0U0 A07 = c0cn.A07(c07260Xn);
                            if (A07 != null) {
                                return c07260Xn.A00(A07);
                            }
                            return null;
                        }
                        return super.A00.onWindowStartingActionMode(callback2, i);
                    }
                };
                this.A0D = r0;
                window.setCallback(r0);
                Context context = this.A0j;
                C0V9 c0v9 = new C0V9(context, context.obtainStyledAttributes((AttributeSet) null, A0r));
                Drawable A03 = c0v9.A03(0);
                if (A03 != null) {
                    window.setBackgroundDrawable(A03);
                }
                c0v9.A02.recycle();
                this.A08 = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0063, code lost:
        if (r0.width != (-1)) goto L35;
     */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.0VE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0b(X.C0V0 r15, android.view.KeyEvent r16) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CN.A0b(X.0V0, android.view.KeyEvent):void");
    }

    public void A0c(C0V0 c0v0, boolean z) {
        ViewGroup viewGroup;
        InterfaceC06760Uw interfaceC06760Uw;
        if (z && c0v0.A01 == 0 && (interfaceC06760Uw = this.A0L) != null && interfaceC06760Uw.AFb()) {
            A0d(c0v0.A0A);
            return;
        }
        WindowManager windowManager = (WindowManager) this.A0j.getSystemService("window");
        if (windowManager != null && c0v0.A0C && (viewGroup = c0v0.A08) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                int i = c0v0.A01;
                C06650Uk c06650Uk = null;
                if (0 == 0) {
                    c06650Uk = c0v0.A0A;
                }
                if (c0v0.A0C && !this.A0a) {
                    ((Window$CallbackC06710Ur) this.A0D).A00.onPanelClosed(i, c06650Uk);
                }
            }
        }
        c0v0.A0D = false;
        c0v0.A0B = false;
        c0v0.A0C = false;
        c0v0.A07 = null;
        c0v0.A0F = true;
        if (this.A0G == c0v0) {
            this.A0G = null;
        }
    }

    public void A0d(C06650Uk c06650Uk) {
        if (this.A0S) {
            return;
        }
        this.A0S = true;
        this.A0L.A7M();
        Window.Callback callback = this.A08.getCallback();
        if (callback != null && !this.A0a) {
            callback.onPanelClosed(C0M6.A03, c06650Uk);
        }
        this.A0S = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x008d, code lost:
        if (r1 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x00bc, code lost:
        if (A0f(r2, r7) != false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0e(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CN.A0e(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x002c, code lost:
        if (r0 == 108) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x00c8, code lost:
        if (r6 != null) goto L70;
     */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0VH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0f(X.C0V0 r11, android.view.KeyEvent r12) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CN.A0f(X.0V0, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:239:0x0096, code lost:
        if (r3 == 0) goto L188;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x011b  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0g(boolean r15) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CN.A0g(boolean):boolean");
    }

    @Override // X.C0CO
    public boolean AM1(C06650Uk c06650Uk, MenuItem menuItem) {
        Window.Callback callback = this.A08.getCallback();
        if (callback != null && !this.A0a) {
            C06650Uk A01 = c06650Uk.A01();
            C0V0[] c0v0Arr = this.A0i;
            if (c0v0Arr != null) {
                for (C0V0 c0v0 : c0v0Arr) {
                    if (c0v0 != null && c0v0.A0A == A01) {
                        return callback.onMenuItemSelected(c0v0.A01, menuItem);
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // X.C0CO
    public void AM2(C06650Uk c06650Uk) {
        InterfaceC06760Uw interfaceC06760Uw = this.A0L;
        if (interfaceC06760Uw != null && interfaceC06760Uw.A5x() && (!ViewConfiguration.get(this.A0j).hasPermanentMenuKey() || this.A0L.AFa())) {
            Window.Callback callback = this.A08.getCallback();
            if (this.A0L.AFb()) {
                this.A0L.AEd();
                if (!this.A0a) {
                    callback.onPanelClosed(C0M6.A03, A0U(0).A0A);
                    return;
                }
                return;
            } else if (callback == null || this.A0a) {
                return;
            } else {
                if (this.A0Z && (1 & this.A00) != 0) {
                    View decorView = this.A08.getDecorView();
                    Runnable runnable = this.A0m;
                    decorView.removeCallbacks(runnable);
                    runnable.run();
                }
                C0V0 A0U = A0U(0);
                C06650Uk c06650Uk2 = A0U.A0A;
                if (c06650Uk2 == null || A0U.A0G || !callback.onPreparePanel(0, A0U.A06, c06650Uk2)) {
                    return;
                }
                callback.onMenuOpened(C0M6.A03, A0U.A0A);
                this.A0L.AUn();
                return;
            }
        }
        C0V0 A0U2 = A0U(0);
        A0U2.A0F = true;
        A0c(A0U2, false);
        A0b(A0U2, null);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return A04(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return A04(null, str, context, attributeSet);
    }
}
