package X;

import X.C0BA;
import X.C0C1;
import X.InterfaceC02360Aw;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: X.0BA */
/* loaded from: classes.dex */
public class C0BA implements InterfaceC02360Aw, InterfaceC02380Ay, InterfaceC02390Az, C0B1, ComponentCallbacks, View.OnCreateContextMenuListener {
    public static final Object A0k = new Object();
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A05;
    public Bundle A06;
    public Bundle A07;
    public SparseArray A08;
    public LayoutInflater A09;
    public View A0A;
    public ViewGroup A0B;
    public C0XM A0C;
    public C0BA A0D;
    public C0BA A0E;
    public C0UG A0F;
    public AbstractC02800Cx A0H;
    public C09730ef A0I;
    public C02520Bt A0K;
    public C0CR A0M;
    public C0U5 A0N;
    public Boolean A0P;
    public String A0Q;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public int A04 = -1;
    public String A0S = UUID.randomUUID().toString();
    public String A0R = null;
    public Boolean A0O = null;
    public AbstractC02800Cx A0G = new C0UI();
    public boolean A0e = true;
    public boolean A0j = true;
    public EnumC02560Bx A0J = EnumC02560Bx.RESUMED;
    public C0HK A0L = new C0HK();

    public void A0N(int i, String[] strArr, int[] iArr) {
    }

    public void A0h(int i, int i2, Intent intent) {
    }

    public void A0k(Bundle bundle) {
    }

    public void A0l(Menu menu) {
    }

    public void A0m(Menu menu, MenuInflater menuInflater) {
    }

    public boolean A0n(MenuItem menuItem) {
        return false;
    }

    public boolean A0o(MenuItem menuItem) {
        return false;
    }

    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void A0w(View view, Bundle bundle) {
    }

    public C0BA() {
        A0L();
    }

    public final Context A00() {
        Context A0a = A0a();
        if (A0a != null) {
            return A0a;
        }
        throw new IllegalStateException(C000200d.A0B(this, " not attached to a context."));
    }

    public final Resources A01() {
        return A00().getResources();
    }

    public final Bundle A02() {
        Bundle bundle = this.A06;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(C000200d.A0B(this, " does not have any arguments."));
    }

    public LayoutInflater A03() {
        C0UG c0ug = this.A0F;
        if (c0ug != null) {
            C0UF c0uf = (C0UF) c0ug;
            LayoutInflater cloneInContext = c0uf.A00.getLayoutInflater().cloneInContext(c0uf.A00);
            C002701i.A1F(cloneInContext, this.A0G.A0O);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public final LayoutInflater A04() {
        LayoutInflater layoutInflater = this.A09;
        if (layoutInflater == null) {
            LayoutInflater A0b = A0b(null);
            this.A09 = A0b;
            return A0b;
        }
        return layoutInflater;
    }

    public final View A05() {
        View view = this.A0A;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(C000200d.A0B(this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final C0XM A06() {
        C0XM c0xm = this.A0C;
        if (c0xm == null) {
            C0XM c0xm2 = new C0XM();
            this.A0C = c0xm2;
            return c0xm2;
        }
        return c0xm;
    }

    public final C0BA A07() {
        String str;
        C0BA c0ba = this.A0E;
        if (c0ba != null) {
            return c0ba;
        }
        AbstractC02800Cx abstractC02800Cx = this.A0H;
        if (abstractC02800Cx == null || (str = this.A0R) == null) {
            return null;
        }
        return abstractC02800Cx.A0Q.A00(str);
    }

    public final C0BA A08() {
        C0BA c0ba = this.A0D;
        if (c0ba == null) {
            if (A0a() == null) {
                throw new IllegalStateException(C000200d.A0B(this, " is not attached to any Fragment or host"));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" is not a child Fragment, it is directly attached to ");
            sb.append(A0a());
            throw new IllegalStateException(sb.toString());
        }
        return c0ba;
    }

    public final ActivityC02330At A09() {
        C0UG c0ug = this.A0F;
        if (c0ug == null) {
            return null;
        }
        return (ActivityC02330At) c0ug.A00;
    }

    public final ActivityC02330At A0A() {
        ActivityC02330At A09 = A09();
        if (A09 != null) {
            return A09;
        }
        throw new IllegalStateException(C000200d.A0B(this, " not attached to an activity."));
    }

    public final AbstractC02800Cx A0B() {
        if (this.A0F != null) {
            return this.A0G;
        }
        throw new IllegalStateException(C000200d.A0B(this, " has not been attached yet."));
    }

    public final AbstractC02800Cx A0C() {
        AbstractC02800Cx abstractC02800Cx = this.A0H;
        if (abstractC02800Cx != null) {
            return abstractC02800Cx;
        }
        throw new IllegalStateException(C000200d.A0B(this, " not associated with a fragment manager."));
    }

    public InterfaceC02360Aw A0D() {
        C09730ef c09730ef = this.A0I;
        if (c09730ef != null) {
            return c09730ef;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public final CharSequence A0E(int i) {
        return A01().getText(i);
    }

    public final String A0F(int i) {
        return A01().getString(i);
    }

    public final String A0G(int i, Object... objArr) {
        return A01().getString(i, objArr);
    }

    public void A0H() {
        C0XM c0xm = this.A0C;
        if (c0xm != null) {
            c0xm.A0C = false;
            InterfaceC13610lX interfaceC13610lX = c0xm.A06;
            c0xm.A06 = null;
            if (interfaceC13610lX != null) {
                C1TY c1ty = (C1TY) interfaceC13610lX;
                int i = c1ty.A00 - 1;
                c1ty.A00 = i;
                if (i == 0) {
                    c1ty.A01.A02.A0E();
                }
            }
        }
    }

    public void A0I() {
        this.A0U = true;
        C0UG c0ug = this.A0F;
        if (c0ug != null && c0ug.A00 != null) {
            this.A0U = false;
            this.A0U = true;
        }
    }

    public void A0J() {
        if (!this.A0Y) {
            this.A0Y = true;
            if (!A0W() || this.A0Z) {
                return;
            }
            ((C0UF) this.A0F).A00.A0R();
        }
    }

    public void A0K() {
        AbstractC02800Cx abstractC02800Cx = this.A0H;
        if (abstractC02800Cx != null && abstractC02800Cx.A06 != null) {
            if (Looper.myLooper() != this.A0H.A06.A02.getLooper()) {
                this.A0H.A06.A02.postAtFrontOfQueue(new Runnable() { // from class: X.0lV
                    {
                        C0BA.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        C0BA.this.A0H();
                    }
                });
                return;
            } else {
                A0H();
                return;
            }
        }
        A06().A0C = false;
    }

    public final void A0L() {
        this.A0K = new C02520Bt(this);
        this.A0N = new C0U5(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.A0K.A02(new C0UA() { // from class: androidx.fragment.app.Fragment$2
                {
                    C0BA.this = this;
                }

                @Override // X.C0UA
                public void AOy(InterfaceC02360Aw interfaceC02360Aw, C0C1 c0c1) {
                    View view;
                    if (c0c1 != C0C1.ON_STOP || (view = C0BA.this.A0A) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
        }
    }

    public void A0M(int i) {
        if (this.A0C == null && i == 0) {
            return;
        }
        A06().A00 = i;
    }

    public void A0O(Intent intent, int i, Bundle bundle) {
        C0UG c0ug = this.A0F;
        if (c0ug != null) {
            c0ug.A02(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException(C000200d.A0B(this, " not attached to Activity"));
    }

    public void A0P(Bundle bundle) {
        AbstractC02800Cx abstractC02800Cx = this.A0H;
        if (abstractC02800Cx != null && abstractC02800Cx.A0r()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.A06 = bundle;
    }

    public void A0Q(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.A0G.A0C();
        this.A0f = true;
        this.A0I = new C09730ef();
        View A0p = A0p(layoutInflater, viewGroup, bundle);
        this.A0A = A0p;
        if (A0p != null) {
            C09730ef c09730ef = this.A0I;
            if (c09730ef.A00 == null) {
                c09730ef.A00 = new C02520Bt(c09730ef);
            }
            this.A0L.A0B(this.A0I);
        } else if (this.A0I.A00 != null) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        } else {
            this.A0I = null;
        }
    }

    public void A0R(InterfaceC13610lX interfaceC13610lX) {
        A06();
        C0XM c0xm = this.A0C;
        InterfaceC13610lX interfaceC13610lX2 = c0xm.A06;
        if (interfaceC13610lX == interfaceC13610lX2) {
            return;
        }
        if (interfaceC13610lX != null && interfaceC13610lX2 != null) {
            StringBuilder sb = new StringBuilder("Trying to set a replacement startPostponedEnterTransition on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
        if (c0xm.A0C) {
            c0xm.A06 = interfaceC13610lX;
        }
        if (interfaceC13610lX != null) {
            ((C1TY) interfaceC13610lX).A00++;
        }
    }

    public void A0S(C0BA c0ba, int i) {
        AbstractC02800Cx abstractC02800Cx;
        AbstractC02800Cx abstractC02800Cx2 = this.A0H;
        if (c0ba != null) {
            abstractC02800Cx = c0ba.A0H;
        } else {
            abstractC02800Cx = null;
        }
        if (abstractC02800Cx2 != null && abstractC02800Cx != null && abstractC02800Cx2 != abstractC02800Cx) {
            throw new IllegalArgumentException(C000200d.A0B(c0ba, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (C0BA c0ba2 = c0ba; c0ba2 != null; c0ba2 = c0ba2.A07()) {
            if (c0ba2 == this) {
                StringBuilder sb = new StringBuilder("Setting ");
                sb.append(c0ba);
                sb.append(" as the target of ");
                sb.append(this);
                sb.append(" would create a target cycle");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (c0ba == null) {
            this.A0R = null;
            this.A0E = null;
        } else if (this.A0H != null && c0ba.A0H != null) {
            this.A0R = c0ba.A0S;
            this.A0E = null;
        } else {
            this.A0R = null;
            this.A0E = c0ba;
        }
        this.A05 = i;
    }

    public void A0T(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.A03));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.A02));
        printWriter.print(" mTag=");
        printWriter.println(this.A0Q);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.A04);
        printWriter.print(" mWho=");
        printWriter.print(this.A0S);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.A01);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.A0T);
        printWriter.print(" mRemoving=");
        printWriter.print(this.A0g);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.A0X);
        printWriter.print(" mInLayout=");
        printWriter.println(this.A0b);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.A0Z);
        printWriter.print(" mDetached=");
        printWriter.print(this.A0W);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.A0e);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.A0Y);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.A0i);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.A0j);
        if (this.A0H != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.A0H);
        }
        if (this.A0F != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.A0F);
        }
        if (this.A0D != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.A0D);
        }
        if (this.A06 != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.A06);
        }
        if (this.A07 != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.A07);
        }
        if (this.A08 != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.A08);
        }
        C0BA A07 = A07();
        if (A07 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(A07);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.A05);
        }
        C0XM c0xm = this.A0C;
        if (c0xm != null && c0xm.A00 != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            C0XM c0xm2 = this.A0C;
            printWriter.println(c0xm2 == null ? 0 : c0xm2.A00);
        }
        if (this.A0B != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.A0B);
        }
        if (this.A0A != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.A0A);
        }
        C0XM c0xm3 = this.A0C;
        if (c0xm3 != null && c0xm3.A04 != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            C0XM c0xm4 = this.A0C;
            printWriter.println(c0xm4 == null ? null : c0xm4.A04);
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            C0XM c0xm5 = this.A0C;
            printWriter.println(c0xm5 == null ? 0 : c0xm5.A02);
        }
        if (A0a() != null) {
            C0m3.A00(this).A04(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        StringBuilder sb = new StringBuilder("Child ");
        sb.append(this.A0G);
        sb.append(":");
        printWriter.println(sb.toString());
        this.A0G.A0j(C000200d.A0H(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public void A0U(boolean z) {
        if (this.A0e != z) {
            this.A0e = z;
            if (this.A0Y && A0W() && !this.A0Z) {
                ((C0UF) this.A0F).A00.A0R();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x002b, code lost:
        if (r4 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0V(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.A0j
            r2 = 3
            if (r0 != 0) goto L24
            if (r4 == 0) goto L24
            int r0 = r3.A04
            if (r0 >= r2) goto L24
            X.0Cx r1 = r3.A0H
            if (r1 == 0) goto L24
            boolean r0 = r3.A0W()
            if (r0 == 0) goto L24
            boolean r0 = r3.A0c
            if (r0 == 0) goto L24
            boolean r0 = r3.A0V
            if (r0 == 0) goto L24
            boolean r0 = r1.A0I
            if (r0 == 0) goto L3b
            r0 = 1
            r1.A0J = r0
        L24:
            r3.A0j = r4
            int r0 = r3.A04
            if (r0 >= r2) goto L2d
            r0 = 1
            if (r4 == 0) goto L2e
        L2d:
            r0 = 0
        L2e:
            r3.A0V = r0
            android.os.Bundle r0 = r3.A07
            if (r0 == 0) goto L3a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r3.A0P = r0
        L3a:
            return
        L3b:
            r0 = 0
            r3.A0V = r0
            int r0 = r1.A00
            r1.A0c(r3, r0)
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0BA.A0V(boolean):void");
    }

    public final boolean A0W() {
        return this.A0F != null && this.A0T;
    }

    public final boolean A0X() {
        C0BA c0ba = this.A0D;
        if (c0ba != null) {
            return c0ba.A0g || c0ba.A0X();
        }
        return false;
    }

    public final boolean A0Y() {
        return this.A04 >= 4;
    }

    public final boolean A0Z() {
        View view;
        return (!A0W() || this.A0Z || (view = this.A0A) == null || view.getWindowToken() == null || this.A0A.getVisibility() != 0) ? false : true;
    }

    public Context A0a() {
        C0UG c0ug = this.A0F;
        if (c0ug == null) {
            return null;
        }
        return c0ug.A01;
    }

    public LayoutInflater A0b(Bundle bundle) {
        return A03();
    }

    public void A0c(Activity activity) {
        this.A0U = true;
    }

    public void A0d(Bundle bundle) {
        this.A0U = true;
    }

    public void A0e() {
        this.A0U = true;
    }

    public void A0f() {
        this.A0U = true;
    }

    public void A0g() {
        this.A0U = true;
    }

    public void A0i(Intent intent) {
        C0UG c0ug = this.A0F;
        if (c0ug != null) {
            ((C0UF) c0ug).A00.A0Y(this, intent, -1, null);
            return;
        }
        throw new IllegalStateException(C000200d.A0B(this, " not attached to Activity"));
    }

    public void A0j(Bundle bundle) {
        this.A0U = true;
    }

    public void A0q() {
        this.A0U = true;
    }

    public void A0r() {
        this.A0U = true;
    }

    public void A0s() {
        this.A0U = true;
    }

    public void A0t() {
        this.A0U = true;
    }

    public void A0u(Context context) {
        Activity activity;
        this.A0U = true;
        C0UG c0ug = this.A0F;
        if (c0ug == null || (activity = c0ug.A00) == null) {
            return;
        }
        this.A0U = false;
        A0c(activity);
    }

    public void A0v(Bundle bundle) {
        Parcelable parcelable;
        this.A0U = true;
        if (bundle != null && (parcelable = bundle.getParcelable(ActivityC02330At.A0C)) != null) {
            this.A0G.A0M(parcelable);
            AbstractC02800Cx abstractC02800Cx = this.A0G;
            abstractC02800Cx.A0L = false;
            abstractC02800Cx.A0M = false;
            abstractC02800Cx.A0J(1);
        }
        AbstractC02800Cx abstractC02800Cx2 = this.A0G;
        if (abstractC02800Cx2.A00 < 1) {
            abstractC02800Cx2.A0L = false;
            abstractC02800Cx2.A0M = false;
            abstractC02800Cx2.A0J(1);
        }
    }

    @Override // X.C0B1
    public C0CR A9l() {
        if (this.A0H != null) {
            C0CR c0cr = this.A0M;
            if (c0cr == null) {
                C38511oL c38511oL = new C38511oL(A0A().getApplication(), this, this.A06);
                this.A0M = c38511oL;
                return c38511oL;
            }
            return c0cr;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // X.InterfaceC02360Aw
    public AbstractC02530Bu AAs() {
        return this.A0K;
    }

    @Override // X.InterfaceC02390Az
    public final C0U6 ACx() {
        return this.A0N.A00;
    }

    @Override // X.InterfaceC02380Ay
    public C0VW ADv() {
        AbstractC02800Cx abstractC02800Cx = this.A0H;
        if (abstractC02800Cx != null) {
            HashMap hashMap = abstractC02800Cx.A07.A03;
            C0VW c0vw = (C0VW) hashMap.get(this.A0S);
            if (c0vw == null) {
                C0VW c0vw2 = new C0VW();
                hashMap.put(this.A0S, c0vw2);
                return c0vw2;
            }
            return c0vw;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.A0U = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        A0A().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.A0U = true;
    }

    public void startActivityForResult(Intent intent, int i) {
        A0O(intent, i, null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.A0S);
        sb.append(")");
        int i = this.A03;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.A0Q;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append('}');
        return sb.toString();
    }
}
