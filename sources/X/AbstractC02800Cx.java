package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import com.google.android.search.verification.client.R;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Cx */
/* loaded from: classes.dex */
public abstract class AbstractC02800Cx {
    public C0U8 A01;
    public C0BA A02;
    public C0BA A03;
    public C0UH A04;
    public C0UG A06;
    public C0YR A07;
    public ArrayList A09;
    public ArrayList A0A;
    public ArrayList A0B;
    public ArrayList A0C;
    public ArrayList A0D;
    public ArrayList A0E;
    public ArrayList A0F;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final ArrayList A0S = new ArrayList();
    public final C02810Cy A0Q = new C02810Cy();
    public final C0UJ A0O = new C0UJ(this);
    public final C0UL A0N = new C0UK(this);
    public final AtomicInteger A0T = new AtomicInteger();
    public ConcurrentHashMap A0G = new ConcurrentHashMap();
    public final C0UN A0R = new C0UM(this);
    public final C0RC A0P = new C0RC(this);
    public int A00 = -1;
    public C0UP A05 = new C0UP() { // from class: X.0UO
        {
            AbstractC02800Cx.this = this;
        }

        @Override // X.C0UP
        public C0BA A00(ClassLoader classLoader, String str) {
            try {
                ClassLoader classLoader2 = AbstractC02800Cx.this.A06.A01.getClassLoader();
                try {
                    C006802z c006802z = C0UP.A00;
                    Class<?> cls = (Class) c006802z.getOrDefault(str, null);
                    if (cls == null) {
                        cls = Class.forName(str, false, classLoader2);
                        c006802z.put(str, cls);
                    }
                    return (C0BA) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (ClassCastException e) {
                    throw new RuntimeException(C000200d.A0I("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e) { // from class: X.0lW
                    };
                } catch (ClassNotFoundException e2) {
                    throw new RuntimeException(C000200d.A0I("Unable to instantiate fragment ", str, ": make sure class name exists"), e2) { // from class: X.0lW
                    };
                }
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(C000200d.A0I("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3) { // from class: X.0lW
                };
            } catch (InstantiationException e4) {
                throw new RuntimeException(C000200d.A0I("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e4) { // from class: X.0lW
                };
            } catch (NoSuchMethodException e5) {
                throw new RuntimeException(C000200d.A0I("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e5) { // from class: X.0lW
                };
            } catch (InvocationTargetException e6) {
                throw new RuntimeException(C000200d.A0I("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e6) { // from class: X.0lW
                };
            }
        }
    };
    public Runnable A08 = new Runnable() { // from class: X.0UQ
        {
            AbstractC02800Cx.this = this;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC02800Cx.this.A0p(true);
        }
    };

    public static void A00(C0BA c0ba) {
        if (A01(2)) {
            StringBuilder sb = new StringBuilder("show: ");
            sb.append(c0ba);
            Log.v("FragmentManager", sb.toString());
        }
        if (c0ba.A0Z) {
            c0ba.A0Z = false;
            c0ba.A0a = !c0ba.A0a;
        }
    }

    public static boolean A01(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static final boolean A02(C0BA c0ba) {
        if (!c0ba.A0Y || !c0ba.A0e) {
            Iterator it = ((AbstractCollection) c0ba.A0G.A0Q.A03()).iterator();
            while (it.hasNext()) {
                C0BA c0ba2 = (C0BA) it.next();
                if (c0ba2 == null || !A02(c0ba2)) {
                }
            }
            return false;
        }
        return true;
    }

    public int A03() {
        ArrayList arrayList = this.A09;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Parcelable A04() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC02800Cx.A04():android.os.Parcelable");
    }

    public final ViewGroup A05(C0BA c0ba) {
        if (c0ba.A02 > 0 && this.A04.A01()) {
            View A00 = this.A04.A00(c0ba.A02);
            if (A00 instanceof ViewGroup) {
                return (ViewGroup) A00;
            }
        }
        return null;
    }

    public C0BA A06(int i) {
        C02810Cy c02810Cy = this.A0Q;
        ArrayList arrayList = c02810Cy.A00;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0BA c0ba = (C0BA) arrayList.get(size);
            if (c0ba != null && c0ba.A03 == i) {
                return c0ba;
            }
        }
        for (C09400dD c09400dD : c02810Cy.A01.values()) {
            if (c09400dD != null) {
                C0BA c0ba2 = c09400dD.A01;
                if (c0ba2.A03 == i) {
                    return c0ba2;
                }
            }
        }
        return null;
    }

    public C0BA A07(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        C0BA A00 = this.A0Q.A00(string);
        if (A00 != null) {
            return A00;
        }
        A0i(new IllegalStateException(C000200d.A0J("Fragment no longer exists for key ", str, ": unique id ", string)));
        throw null;
    }

    public C0UP A08() {
        C0BA c0ba = this.A02;
        if (c0ba != null) {
            return c0ba.A0H.A08();
        }
        return this.A05;
    }

    public void A09() {
        this.A0H = true;
        A0p(true);
        A0G();
        A0J(-1);
        this.A06 = null;
        this.A04 = null;
        this.A02 = null;
        if (this.A01 != null) {
            Iterator it = this.A0N.A00.iterator();
            while (it.hasNext()) {
                ((C0YQ) it.next()).cancel();
            }
            this.A01 = null;
        }
    }

    public void A0A() {
        for (C0BA c0ba : this.A0Q.A04()) {
            if (c0ba != null) {
                c0ba.onLowMemory();
                c0ba.A0G.A0A();
            }
        }
    }

    public void A0B() {
        A0p(true);
        if (this.A0C == null) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.A0C;
            if (!arrayList.isEmpty()) {
                ((C1TY) arrayList.remove(0)).A00();
            } else {
                return;
            }
        }
    }

    public void A0C() {
        this.A0L = false;
        this.A0M = false;
        for (C0BA c0ba : this.A0Q.A04()) {
            if (c0ba != null) {
                c0ba.A0G.A0C();
            }
        }
    }

    public void A0D() {
        A0g(new C0ZW(this, null, -1, 0), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x000e, code lost:
        if (r0.isEmpty() != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0E() {
        /*
            r5 = this;
            java.util.ArrayList r4 = r5.A0S
            monitor-enter(r4)
            java.util.ArrayList r0 = r5.A0C     // Catch: java.lang.Throwable -> L33
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L10
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L33
            r1 = 1
            if (r0 == 0) goto L11
        L10:
            r1 = 0
        L11:
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L33
            if (r0 != r2) goto L18
            r3 = 1
        L18:
            if (r1 != 0) goto L1c
            if (r3 == 0) goto L31
        L1c:
            X.0UG r0 = r5.A06     // Catch: java.lang.Throwable -> L33
            android.os.Handler r1 = r0.A02     // Catch: java.lang.Throwable -> L33
            java.lang.Runnable r0 = r5.A08     // Catch: java.lang.Throwable -> L33
            r1.removeCallbacks(r0)     // Catch: java.lang.Throwable -> L33
            X.0UG r0 = r5.A06     // Catch: java.lang.Throwable -> L33
            android.os.Handler r1 = r0.A02     // Catch: java.lang.Throwable -> L33
            java.lang.Runnable r0 = r5.A08     // Catch: java.lang.Throwable -> L33
            r1.post(r0)     // Catch: java.lang.Throwable -> L33
            r5.A0I()     // Catch: java.lang.Throwable -> L33
        L31:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L33
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC02800Cx.A0E():void");
    }

    public final void A0F() {
        this.A0I = false;
        this.A0E.clear();
        this.A0F.clear();
    }

    public final void A0G() {
        if (!this.A0G.isEmpty()) {
            for (C0BA c0ba : this.A0G.keySet()) {
                A0Y(c0ba);
                C0XM c0xm = c0ba.A0C;
                A0c(c0ba, c0xm == null ? 0 : c0xm.A02);
            }
        }
    }

    public final void A0H() {
        Iterator it = ((AbstractCollection) this.A0Q.A03()).iterator();
        while (it.hasNext()) {
            C0BA c0ba = (C0BA) it.next();
            if (c0ba != null && c0ba.A0V) {
                if (this.A0I) {
                    this.A0J = true;
                } else {
                    c0ba.A0V = false;
                    A0c(c0ba, this.A00);
                }
            }
        }
    }

    public final void A0I() {
        ArrayList arrayList = this.A0S;
        synchronized (arrayList) {
            boolean z = true;
            if (!arrayList.isEmpty()) {
                this.A0N.A01 = true;
                return;
            }
            this.A0N.A01 = (A03() <= 0 || !A0x(this.A02)) ? false : false;
        }
    }

    public final void A0J(int i) {
        try {
            this.A0I = true;
            C02810Cy c02810Cy = this.A0Q;
            Iterator it = c02810Cy.A00.iterator();
            while (it.hasNext()) {
                C09400dD c09400dD = (C09400dD) c02810Cy.A01.get(((C0BA) it.next()).A0S);
                if (c09400dD != null) {
                    c09400dD.A00 = i;
                }
            }
            for (C09400dD c09400dD2 : c02810Cy.A01.values()) {
                if (c09400dD2 != null) {
                    c09400dD2.A00 = i;
                }
            }
            A0K(i, false);
            this.A0I = false;
            A0p(true);
        } catch (Throwable th) {
            this.A0I = false;
            throw th;
        }
    }

    public void A0K(int i, boolean z) {
        C0UG c0ug;
        if (this.A06 == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.A00) {
            this.A00 = i;
            C02810Cy c02810Cy = this.A0Q;
            for (C0BA c0ba : c02810Cy.A04()) {
                A0V(c0ba);
            }
            Iterator it = ((AbstractCollection) c02810Cy.A03()).iterator();
            while (it.hasNext()) {
                C0BA c0ba2 = (C0BA) it.next();
                if (c0ba2 != null && !c0ba2.A0d) {
                    A0V(c0ba2);
                }
            }
            A0H();
            if (this.A0K && (c0ug = this.A06) != null && this.A00 == 4) {
                ((C0UF) c0ug).A00.A0R();
                this.A0K = false;
            }
        }
    }

    public void A0L(Configuration configuration) {
        for (C0BA c0ba : this.A0Q.A04()) {
            if (c0ba != null) {
                c0ba.onConfigurationChanged(configuration);
                c0ba.A0G.A0L(configuration);
            }
        }
    }

    public void A0M(Parcelable parcelable) {
        C09400dD c09400dD;
        if (parcelable == null) {
            return;
        }
        C13700lg c13700lg = (C13700lg) parcelable;
        if (c13700lg.A02 == null) {
            return;
        }
        C02810Cy c02810Cy = this.A0Q;
        HashMap hashMap = c02810Cy.A01;
        hashMap.clear();
        Iterator it = c13700lg.A02.iterator();
        while (it.hasNext()) {
            C13720li c13720li = (C13720li) it.next();
            if (c13720li != null) {
                C0YR c0yr = this.A07;
                C0BA c0ba = (C0BA) c0yr.A02.get(c13720li.A07);
                if (c0ba == null) {
                    c09400dD = new C09400dD(this.A0P, this.A06.A01.getClassLoader(), A08(), c13720li);
                } else {
                    if (A01(2)) {
                        StringBuilder sb = new StringBuilder("restoreSaveState: re-attaching retained ");
                        sb.append(c0ba);
                        Log.v("FragmentManager", sb.toString());
                    }
                    c09400dD = new C09400dD(this.A0P, c0ba, c13720li);
                }
                C0BA c0ba2 = c09400dD.A01;
                c0ba2.A0H = this;
                if (A01(2)) {
                    StringBuilder A0P = C000200d.A0P("restoreSaveState: active (");
                    A0P.append(c0ba2.A0S);
                    A0P.append("): ");
                    A0P.append(c0ba2);
                    Log.v("FragmentManager", A0P.toString());
                }
                c09400dD.A01(this.A06.A01.getClassLoader());
                hashMap.put(c0ba2.A0S, c09400dD);
                c09400dD.A00 = this.A00;
            }
        }
        for (C0BA c0ba3 : this.A07.A02.values()) {
            if (!hashMap.containsKey(c0ba3.A0S)) {
                if (A01(2)) {
                    StringBuilder sb2 = new StringBuilder("Discarding retained Fragment ");
                    sb2.append(c0ba3);
                    sb2.append(" that was not found in the set of active Fragments ");
                    sb2.append(c13700lg.A02);
                    Log.v("FragmentManager", sb2.toString());
                }
                A0c(c0ba3, 1);
                c0ba3.A0g = true;
                A0c(c0ba3, -1);
            }
        }
        ArrayList<String> arrayList = c13700lg.A03;
        c02810Cy.A00.clear();
        if (arrayList != null) {
            for (String str : arrayList) {
                C0BA A00 = c02810Cy.A00(str);
                if (A00 != null) {
                    if (A01(2)) {
                        StringBuilder sb3 = new StringBuilder("restoreSaveState: added (");
                        sb3.append(str);
                        sb3.append("): ");
                        sb3.append(A00);
                        Log.v("FragmentManager", sb3.toString());
                    }
                    c02810Cy.A05(A00);
                } else {
                    throw new IllegalStateException(C000200d.A0I("No instantiated fragment for (", str, ")"));
                }
            }
        }
        C13550lR[] c13550lRArr = c13700lg.A04;
        if (c13550lRArr != null) {
            this.A09 = new ArrayList(c13550lRArr.length);
            int i = 0;
            while (true) {
                C13550lR[] c13550lRArr2 = c13700lg.A04;
                if (i >= c13550lRArr2.length) {
                    break;
                }
                C13550lR c13550lR = c13550lRArr2[i];
                C02820Cz c02820Cz = new C02820Cz(this);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int[] iArr = c13550lR.A0D;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    C09320d3 c09320d3 = new C09320d3();
                    int i4 = i2 + 1;
                    c09320d3.A00 = iArr[i2];
                    if (A01(2)) {
                        StringBuilder sb4 = new StringBuilder("Instantiate ");
                        sb4.append(c02820Cz);
                        sb4.append(" op #");
                        sb4.append(i3);
                        sb4.append(" base fragment #");
                        sb4.append(iArr[i4]);
                        Log.v("FragmentManager", sb4.toString());
                    }
                    String str2 = (String) c13550lR.A07.get(i3);
                    if (str2 != null) {
                        c09320d3.A05 = c02810Cy.A00(str2);
                    } else {
                        c09320d3.A05 = null;
                    }
                    c09320d3.A07 = EnumC02560Bx.values()[c13550lR.A0C[i3]];
                    c09320d3.A06 = EnumC02560Bx.values()[c13550lR.A0B[i3]];
                    int i5 = i4 + 1;
                    int i6 = iArr[i4];
                    c09320d3.A01 = i6;
                    int i7 = i5 + 1;
                    int i8 = iArr[i5];
                    c09320d3.A02 = i8;
                    int i9 = i7 + 1;
                    int i10 = iArr[i7];
                    c09320d3.A03 = i10;
                    i2 = i9 + 1;
                    int i11 = iArr[i9];
                    c09320d3.A04 = i11;
                    ((C0D0) c02820Cz).A02 = i6;
                    c02820Cz.A03 = i8;
                    c02820Cz.A04 = i10;
                    c02820Cz.A05 = i11;
                    c02820Cz.A02(c09320d3);
                    i3++;
                }
                c02820Cz.A06 = c13550lR.A03;
                c02820Cz.A09 = c13550lR.A06;
                c02820Cz.A00 = c13550lR.A02;
                c02820Cz.A0D = true;
                ((C0D0) c02820Cz).A01 = c13550lR.A01;
                c02820Cz.A08 = c13550lR.A05;
                ((C0D0) c02820Cz).A00 = c13550lR.A00;
                c02820Cz.A07 = c13550lR.A04;
                c02820Cz.A0B = c13550lR.A08;
                c02820Cz.A0C = c13550lR.A09;
                c02820Cz.A0F = c13550lR.A0A;
                c02820Cz.A0C(1);
                if (A01(2)) {
                    StringBuilder A0Q = C000200d.A0Q("restoreAllState: back stack #", i, " (index ");
                    A0Q.append(c02820Cz.A00);
                    A0Q.append("): ");
                    A0Q.append(c02820Cz);
                    Log.v("FragmentManager", A0Q.toString());
                    PrintWriter printWriter = new PrintWriter(new C13030kU());
                    c02820Cz.A0D("  ", printWriter, false);
                    printWriter.close();
                }
                this.A09.add(c02820Cz);
                i++;
            }
        } else {
            this.A09 = null;
        }
        this.A0T.set(c13700lg.A00);
        String str3 = c13700lg.A01;
        if (str3 != null) {
            C0BA A002 = c02810Cy.A00(str3);
            this.A03 = A002;
            A0a(A002);
        }
    }

    public void A0N(Menu menu) {
        if (this.A00 < 1) {
            return;
        }
        for (C0BA c0ba : this.A0Q.A04()) {
            if (c0ba != null && !c0ba.A0Z) {
                c0ba.A0G.A0N(menu);
            }
        }
    }

    public final void A0O(AnonymousClass036 anonymousClass036) {
        int i = this.A00;
        if (i < 1) {
            return;
        }
        int min = Math.min(i, 3);
        for (C0BA c0ba : this.A0Q.A04()) {
            if (c0ba.A04 < min) {
                A0c(c0ba, min);
                if (c0ba.A0A != null && !c0ba.A0Z && c0ba.A0d) {
                    anonymousClass036.add(c0ba);
                }
            }
        }
    }

    public void A0P(C02820Cz c02820Cz, boolean z, boolean z2, boolean z3) {
        View view;
        if (z) {
            c02820Cz.A0E(z3);
        } else {
            c02820Cz.A0B();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c02820Cz);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C09370d9.A0A(this, arrayList, arrayList2, 0, 1, true, this.A0R);
        }
        if (z3) {
            A0K(this.A00, true);
        }
        Iterator it = ((AbstractCollection) this.A0Q.A03()).iterator();
        while (it.hasNext()) {
            C0BA c0ba = (C0BA) it.next();
            if (c0ba != null && (view = c0ba.A0A) != null && c0ba.A0d && c02820Cz.A0F(c0ba.A02)) {
                float f = c0ba.A00;
                if (f > 0.0f) {
                    view.setAlpha(f);
                }
                if (z3) {
                    c0ba.A00 = 0.0f;
                } else {
                    c0ba.A00 = -1.0f;
                    c0ba.A0d = false;
                }
            }
        }
    }

    public void A0Q(C0BA c0ba) {
        if (A01(2)) {
            StringBuilder sb = new StringBuilder("add: ");
            sb.append(c0ba);
            Log.v("FragmentManager", sb.toString());
        }
        A0U(c0ba);
        if (c0ba.A0W) {
            return;
        }
        this.A0Q.A05(c0ba);
        c0ba.A0g = false;
        if (c0ba.A0A == null) {
            c0ba.A0a = false;
        }
        if (A02(c0ba)) {
            this.A0K = true;
        }
    }

    public void A0R(C0BA c0ba) {
        if (A01(2)) {
            StringBuilder sb = new StringBuilder("attach: ");
            sb.append(c0ba);
            Log.v("FragmentManager", sb.toString());
        }
        if (c0ba.A0W) {
            c0ba.A0W = false;
            if (c0ba.A0T) {
                return;
            }
            this.A0Q.A05(c0ba);
            if (A01(2)) {
                StringBuilder sb2 = new StringBuilder("add from attach: ");
                sb2.append(c0ba);
                Log.v("FragmentManager", sb2.toString());
            }
            if (A02(c0ba)) {
                this.A0K = true;
            }
        }
    }

    public void A0S(C0BA c0ba) {
        if (A01(2)) {
            StringBuilder sb = new StringBuilder("detach: ");
            sb.append(c0ba);
            Log.v("FragmentManager", sb.toString());
        }
        if (c0ba.A0W) {
            return;
        }
        c0ba.A0W = true;
        if (c0ba.A0T) {
            if (A01(2)) {
                StringBuilder sb2 = new StringBuilder("remove from detach: ");
                sb2.append(c0ba);
                Log.v("FragmentManager", sb2.toString());
            }
            ArrayList arrayList = this.A0Q.A00;
            synchronized (arrayList) {
                arrayList.remove(c0ba);
            }
            c0ba.A0T = false;
            if (A02(c0ba)) {
                this.A0K = true;
            }
            A0b(c0ba);
        }
    }

    public void A0T(C0BA c0ba) {
        if (A01(2)) {
            StringBuilder sb = new StringBuilder("hide: ");
            sb.append(c0ba);
            Log.v("FragmentManager", sb.toString());
        }
        if (c0ba.A0Z) {
            return;
        }
        c0ba.A0Z = true;
        c0ba.A0a = true ^ c0ba.A0a;
        A0b(c0ba);
    }

    public void A0U(C0BA c0ba) {
        C02810Cy c02810Cy = this.A0Q;
        String str = c0ba.A0S;
        HashMap hashMap = c02810Cy.A01;
        if (hashMap.containsKey(str)) {
            return;
        }
        C09400dD c09400dD = new C09400dD(this.A0P, c0ba);
        c09400dD.A01(this.A06.A01.getClassLoader());
        hashMap.put(c09400dD.A01.A0S, c09400dD);
        c09400dD.A00 = this.A00;
        if (A01(2)) {
            StringBuilder sb = new StringBuilder("Added fragment to active set ");
            sb.append(c0ba);
            Log.v("FragmentManager", sb.toString());
        }
    }

    public void A0V(final C0BA c0ba) {
        C0XM c0xm;
        View view;
        C02810Cy c02810Cy = this.A0Q;
        if (!c02810Cy.A01.containsKey(c0ba.A0S)) {
            if (A01(3)) {
                StringBuilder sb = new StringBuilder("Ignoring moving ");
                sb.append(c0ba);
                sb.append(" to state ");
                sb.append(this.A00);
                sb.append("since it is not added to ");
                sb.append(this);
                Log.d("FragmentManager", sb.toString());
                return;
            }
            return;
        }
        A0c(c0ba, this.A00);
        if (c0ba.A0A != null) {
            if (c02810Cy != null) {
                ViewGroup viewGroup = c0ba.A0B;
                if (viewGroup != null) {
                    ArrayList arrayList = c02810Cy.A00;
                    int indexOf = arrayList.indexOf(c0ba);
                    while (true) {
                        indexOf--;
                        if (indexOf < 0) {
                            break;
                        }
                        C0BA c0ba2 = (C0BA) arrayList.get(indexOf);
                        if (c0ba2.A0B == viewGroup && (view = c0ba2.A0A) != null) {
                            ViewGroup viewGroup2 = c0ba.A0B;
                            int indexOfChild = viewGroup2.indexOfChild(view);
                            int indexOfChild2 = viewGroup2.indexOfChild(c0ba.A0A);
                            if (indexOfChild2 < indexOfChild) {
                                viewGroup2.removeViewAt(indexOfChild2);
                                viewGroup2.addView(c0ba.A0A, indexOfChild);
                            }
                        }
                    }
                }
                if (c0ba.A0d && c0ba.A0B != null) {
                    float f = c0ba.A00;
                    if (f > 0.0f) {
                        c0ba.A0A.setAlpha(f);
                    }
                    c0ba.A00 = 0.0f;
                    c0ba.A0d = false;
                    C0XN A0I = C002701i.A0I(this.A06.A01, this.A04, c0ba, true);
                    if (A0I != null) {
                        Animation animation = A0I.A01;
                        if (animation != null) {
                            c0ba.A0A.startAnimation(animation);
                        } else {
                            Animator animator = A0I.A00;
                            animator.setTarget(c0ba.A0A);
                            animator.start();
                        }
                    }
                }
            } else {
                throw null;
            }
        }
        if (c0ba.A0a) {
            if (c0ba.A0A != null) {
                C0XN A0I2 = C002701i.A0I(this.A06.A01, this.A04, c0ba, !c0ba.A0Z);
                if (A0I2 != null) {
                    Animator animator2 = A0I2.A00;
                    if (animator2 != null) {
                        animator2.setTarget(c0ba.A0A);
                        if (c0ba.A0Z) {
                            C0XM c0xm2 = c0ba.A0C;
                            if (c0xm2 != null && c0xm2.A0D) {
                                c0ba.A06().A0D = false;
                            } else {
                                final ViewGroup viewGroup3 = c0ba.A0B;
                                final View view2 = c0ba.A0A;
                                viewGroup3.startViewTransition(view2);
                                animator2.addListener(new AnimatorListenerAdapter() { // from class: X.0le
                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public void onAnimationEnd(Animator animator3) {
                                        viewGroup3.endViewTransition(view2);
                                        animator3.removeListener(this);
                                        C0BA c0ba3 = c0ba;
                                        View view3 = c0ba3.A0A;
                                        if (view3 == null || !c0ba3.A0Z) {
                                            return;
                                        }
                                        view3.setVisibility(8);
                                    }
                                });
                            }
                        } else {
                            c0ba.A0A.setVisibility(0);
                        }
                        animator2.start();
                    } else {
                        View view3 = c0ba.A0A;
                        Animation animation2 = A0I2.A01;
                        view3.startAnimation(animation2);
                        animation2.start();
                    }
                }
                c0ba.A0A.setVisibility((!c0ba.A0Z || ((c0xm = c0ba.A0C) != null && c0xm.A0D)) ? 0 : 8);
                C0XM c0xm3 = c0ba.A0C;
                if (c0xm3 != null && c0xm3.A0D) {
                    c0ba.A06().A0D = false;
                }
            }
            if (c0ba.A0T && A02(c0ba)) {
                this.A0K = true;
            }
            c0ba.A0a = false;
        }
    }

    public void A0W(C0BA c0ba) {
        if (A01(2)) {
            StringBuilder sb = new StringBuilder("remove: ");
            sb.append(c0ba);
            sb.append(" nesting=");
            sb.append(c0ba.A01);
            Log.v("FragmentManager", sb.toString());
        }
        boolean z = !(c0ba.A01 > 0);
        if (!c0ba.A0W || z) {
            ArrayList arrayList = this.A0Q.A00;
            synchronized (arrayList) {
                arrayList.remove(c0ba);
            }
            c0ba.A0T = false;
            if (A02(c0ba)) {
                this.A0K = true;
            }
            c0ba.A0g = true;
            A0b(c0ba);
        }
    }

    public void A0X(C0BA c0ba) {
        if (c0ba != null) {
            if (!c0ba.equals(this.A0Q.A00(c0ba.A0S)) || (c0ba.A0F != null && c0ba.A0H != this)) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(c0ba);
                sb.append(" is not an active fragment of FragmentManager ");
                sb.append(this);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        C0BA c0ba2 = this.A03;
        this.A03 = c0ba;
        A0a(c0ba2);
        A0a(this.A03);
    }

    public final void A0Y(C0BA c0ba) {
        AbstractCollection abstractCollection = (AbstractCollection) this.A0G.get(c0ba);
        if (abstractCollection != null) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                ((C0HE) it.next()).A01();
            }
            abstractCollection.clear();
            A0Z(c0ba);
            this.A0G.remove(c0ba);
        }
    }

    public final void A0Z(C0BA c0ba) {
        c0ba.A0G.A0J(1);
        if (c0ba.A0A != null) {
            C09730ef c09730ef = c0ba.A0I;
            c09730ef.A00.A05(C0C1.ON_DESTROY);
        }
        c0ba.A04 = 1;
        c0ba.A0U = false;
        c0ba.A0r();
        if (c0ba.A0U) {
            C0m3.A00(c0ba).A03();
            c0ba.A0f = false;
            this.A0P.A0D(c0ba, false);
            c0ba.A0B = null;
            c0ba.A0A = null;
            c0ba.A0I = null;
            c0ba.A0L.A0B(null);
            c0ba.A0b = false;
            return;
        }
        throw new C13870lx(C000200d.A0B(c0ba, " did not call through to super.onDestroyView()"));
    }

    public final void A0a(C0BA c0ba) {
        if (c0ba != null) {
            if (c0ba.equals(this.A0Q.A00(c0ba.A0S))) {
                boolean A0x = c0ba.A0H.A0x(c0ba);
                Boolean bool = c0ba.A0O;
                if (bool == null || bool.booleanValue() != A0x) {
                    c0ba.A0O = Boolean.valueOf(A0x);
                    AbstractC02800Cx abstractC02800Cx = c0ba.A0G;
                    abstractC02800Cx.A0I();
                    abstractC02800Cx.A0a(abstractC02800Cx.A03);
                }
            }
        }
    }

    public final void A0b(C0BA c0ba) {
        ViewGroup A05 = A05(c0ba);
        if (A05 != null) {
            if (A05.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                A05.setTag(R.id.visible_removing_fragment_view_tag, c0ba);
            }
            C0BA c0ba2 = (C0BA) A05.getTag(R.id.visible_removing_fragment_view_tag);
            C0XM c0xm = c0ba.A0C;
            c0ba2.A0M(c0xm == null ? 0 : c0xm.A00);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:469:0x0088, code lost:
        if (r0 != 3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x03be, code lost:
        if (r5 <= (-1)) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x04c5, code lost:
        if ((r1 != null && (r1.A0g || r1.A0X())) != false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x04c8, code lost:
        if (r0 == false) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x0679, code lost:
        if (r6.A01 > 0) goto L359;
     */
    /* JADX WARN: Removed duplicated region for block: B:569:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0336  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0c(final X.C0BA r23, int r24) {
        /*
            Method dump skipped, instructions count: 2234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC02800Cx.A0c(X.0BA, int):void");
    }

    public void A0d(C0BA c0ba, EnumC02560Bx enumC02560Bx) {
        if (c0ba.equals(this.A0Q.A00(c0ba.A0S)) && (c0ba.A0F == null || c0ba.A0H == this)) {
            c0ba.A0J = enumC02560Bx;
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(c0ba);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    public void A0e(C0BA c0ba, boolean z) {
        ViewGroup A05 = A05(c0ba);
        if (A05 != null && (A05 instanceof C0Wk)) {
            ((C0Wk) A05).A02 = !z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0f(C0UG c0ug, C0UH c0uh, C0BA c0ba) {
        if (this.A06 == null) {
            this.A06 = c0ug;
            this.A04 = c0uh;
            this.A02 = c0ba;
            if (c0ba != null) {
                A0I();
            }
            if (c0ug instanceof C0B0) {
                C0B0 c0b0 = (C0B0) c0ug;
                C0U8 ABe = c0b0.ABe();
                this.A01 = ABe;
                C0BA c0ba2 = c0b0;
                if (c0ba != null) {
                    c0ba2 = c0ba;
                }
                C0UL c0ul = this.A0N;
                AbstractC02530Bu AAs = c0ba2.AAs();
                if (((C02520Bt) AAs).A02 != EnumC02560Bx.DESTROYED) {
                    c0ul.A00.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(ABe, AAs, c0ul));
                }
            }
            if (c0ba != null) {
                C0YR c0yr = c0ba.A0H.A07;
                HashMap hashMap = c0yr.A01;
                C0YR c0yr2 = (C0YR) hashMap.get(c0ba.A0S);
                if (c0yr2 == null) {
                    c0yr2 = new C0YR(c0yr.A04);
                    hashMap.put(c0ba.A0S, c0yr2);
                }
                this.A07 = c0yr2;
                return;
            } else if (c0ug instanceof InterfaceC02380Ay) {
                C0VW ADv = ((InterfaceC02380Ay) c0ug).ADv();
                C0CR c0cr = C0YR.A05;
                String canonicalName = C0YR.class.getCanonicalName();
                if (canonicalName != null) {
                    String A0H = C000200d.A0H("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                    HashMap hashMap2 = ADv.A00;
                    C0MU c0mu = (C0MU) hashMap2.get(A0H);
                    if (C0YR.class.isInstance(c0mu)) {
                        if (c0cr instanceof C0VY) {
                            ((C0VY) c0cr).A00(c0mu);
                        }
                    } else {
                        if (c0cr instanceof C0VX) {
                            c0mu = ((C0VX) c0cr).A01(A0H, C0YR.class);
                        } else {
                            c0mu = c0cr.A6e(C0YR.class);
                        }
                        C0MU c0mu2 = (C0MU) hashMap2.put(A0H, c0mu);
                        if (c0mu2 != null) {
                            c0mu2.A01();
                        }
                    }
                    this.A07 = (C0YR) c0mu;
                    return;
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            } else {
                this.A07 = new C0YR(false);
                return;
            }
        }
        throw new IllegalStateException("Already attached");
    }

    public void A0g(C0D1 c0d1, boolean z) {
        if (!z) {
            if (this.A06 == null) {
                if (this.A0H) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (A0r()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        ArrayList arrayList = this.A0S;
        synchronized (arrayList) {
            if (this.A06 == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            arrayList.add(c0d1);
            A0E();
        }
    }

    public void A0h(C0D1 c0d1, boolean z) {
        if (z && (this.A06 == null || this.A0H)) {
            return;
        }
        A0q(z);
        if (c0d1.A89(this.A0F, this.A0E)) {
            this.A0I = true;
            try {
                A0l(this.A0F, this.A0E);
            } finally {
                A0F();
            }
        }
        A0I();
        if (this.A0J) {
            this.A0J = false;
            A0H();
        }
        this.A0Q.A01.values().removeAll(Collections.singleton(null));
    }

    public final void A0i(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C13030kU());
        C0UG c0ug = this.A06;
        if (c0ug != null) {
            try {
                ((C0UF) c0ug).A00.dump("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            A0j("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0j(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC02800Cx.A0j(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public final void A0k(ArrayList arrayList, ArrayList arrayList2) {
        boolean z;
        C02820Cz c02820Cz;
        int indexOf;
        boolean z2;
        C02820Cz c02820Cz2;
        int indexOf2;
        ArrayList arrayList3 = this.A0C;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                C1TY c1ty = (C1TY) this.A0C.get(i);
                if (arrayList != null && !(z2 = c1ty.A02) && (indexOf2 = arrayList.indexOf((c02820Cz2 = c1ty.A01))) != -1 && arrayList2 != null && ((Boolean) arrayList2.get(indexOf2)).booleanValue()) {
                    this.A0C.remove(i);
                    i--;
                    size--;
                    c02820Cz2.A02.A0P(c02820Cz2, z2, false, false);
                } else if (c1ty.A00 == 0 || (arrayList != null && c1ty.A01.A0G(arrayList, 0, arrayList.size()))) {
                    this.A0C.remove(i);
                    i--;
                    size--;
                    if (arrayList != null && !(z = c1ty.A02) && (indexOf = arrayList.indexOf((c02820Cz = c1ty.A01))) != -1 && arrayList2 != null && ((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                        c02820Cz.A02.A0P(c02820Cz, z, false, false);
                    } else {
                        c1ty.A00();
                    }
                }
                i++;
            }
        }
    }

    public final void A0l(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            A0k(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((C0D0) arrayList.get(i)).A0F) {
                    if (i2 != i) {
                        A0m(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0D0) arrayList.get(i2)).A0F) {
                            i2++;
                        }
                    }
                    A0m(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                A0m(arrayList, arrayList2, i2, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    public final void A0m(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        int i3;
        int i4 = i;
        boolean z = ((C0D0) arrayList.get(i4)).A0F;
        ArrayList arrayList3 = this.A0D;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.A0D = arrayList3;
        } else {
            arrayList3.clear();
        }
        arrayList3.addAll(this.A0Q.A04());
        C0BA c0ba = this.A03;
        boolean z2 = false;
        for (int i5 = i4; i5 < i2; i5++) {
            C0D0 c0d0 = (C0D0) arrayList.get(i5);
            if (!((Boolean) arrayList2.get(i5)).booleanValue()) {
                ArrayList arrayList4 = this.A0D;
                int i6 = 0;
                while (true) {
                    ArrayList arrayList5 = c0d0.A0A;
                    if (i6 < arrayList5.size()) {
                        C09320d3 c09320d3 = (C09320d3) arrayList5.get(i6);
                        int i7 = c09320d3.A00;
                        if (i7 != 1) {
                            if (i7 == 2) {
                                C0BA c0ba2 = c09320d3.A05;
                                int i8 = c0ba2.A02;
                                boolean z3 = false;
                                for (int size = arrayList4.size() - 1; size >= 0; size--) {
                                    C0BA c0ba3 = (C0BA) arrayList4.get(size);
                                    if (c0ba3.A02 == i8) {
                                        if (c0ba3 == c0ba2) {
                                            z3 = true;
                                        } else {
                                            if (c0ba3 == c0ba) {
                                                c0d0.A0A.add(i6, new C09320d3(9, c0ba3));
                                                i6++;
                                                c0ba = null;
                                            }
                                            C09320d3 c09320d32 = new C09320d3(3, c0ba3);
                                            c09320d32.A01 = c09320d3.A01;
                                            c09320d32.A03 = c09320d3.A03;
                                            c09320d32.A02 = c09320d3.A02;
                                            c09320d32.A04 = c09320d3.A04;
                                            c0d0.A0A.add(i6, c09320d32);
                                            arrayList4.remove(c0ba3);
                                            i6++;
                                        }
                                    }
                                }
                                if (z3) {
                                    c0d0.A0A.remove(i6);
                                    i6--;
                                } else {
                                    c09320d3.A00 = 1;
                                    arrayList4.add(c0ba2);
                                }
                            } else if (i7 == 3 || i7 == 6) {
                                arrayList4.remove(c09320d3.A05);
                                C0BA c0ba4 = c09320d3.A05;
                                if (c0ba4 == c0ba) {
                                    c0d0.A0A.add(i6, new C09320d3(9, c0ba4));
                                    i6++;
                                    c0ba = null;
                                }
                            } else if (i7 != 7) {
                                if (i7 == 8) {
                                    arrayList5.add(i6, new C09320d3(9, c0ba));
                                    i6++;
                                    c0ba = c09320d3.A05;
                                }
                            }
                            i6++;
                        }
                        arrayList4.add(c09320d3.A05);
                        i6++;
                    }
                }
            } else {
                ArrayList arrayList6 = this.A0D;
                for (int size2 = c0d0.A0A.size() - 1; size2 >= 0; size2--) {
                    C09320d3 c09320d33 = (C09320d3) c0d0.A0A.get(size2);
                    int i9 = c09320d33.A00;
                    if (i9 != 1) {
                        if (i9 != 3) {
                            switch (i9) {
                                case 8:
                                    c0ba = null;
                                    break;
                                case 9:
                                    c0ba = c09320d33.A05;
                                    break;
                                case 10:
                                    c09320d33.A06 = c09320d33.A07;
                                    break;
                            }
                        }
                        arrayList6.add(c09320d33.A05);
                    }
                    arrayList6.remove(c09320d33.A05);
                }
            }
            if (!z2) {
                z2 = false;
                if (!c0d0.A0D) {
                }
            }
            z2 = true;
        }
        this.A0D.clear();
        if (!z) {
            C09370d9.A0A(this, arrayList, arrayList2, i4, i2, false, this.A0R);
        }
        int i10 = i4;
        while (i10 < i2) {
            C02820Cz c02820Cz = (C02820Cz) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                c02820Cz.A0C(-1);
                c02820Cz.A0E(i10 == i2 + (-1));
            } else {
                c02820Cz.A0C(1);
                c02820Cz.A0B();
            }
            i10++;
        }
        if (z) {
            AnonymousClass036 anonymousClass036 = new AnonymousClass036(0);
            A0O(anonymousClass036);
            i3 = i2;
            for (int i11 = i2 - 1; i11 >= i4; i11--) {
                C02820Cz c02820Cz2 = (C02820Cz) arrayList.get(i11);
                boolean booleanValue = ((Boolean) arrayList2.get(i11)).booleanValue();
                int i12 = 0;
                while (true) {
                    ArrayList arrayList7 = c02820Cz2.A0A;
                    if (i12 >= arrayList7.size()) {
                        break;
                    } else if (C02820Cz.A00((C09320d3) arrayList7.get(i12))) {
                        if (!c02820Cz2.A0G(arrayList, i11 + 1, i2)) {
                            ArrayList arrayList8 = this.A0C;
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                                this.A0C = arrayList8;
                            }
                            C1TY c1ty = new C1TY(c02820Cz2, booleanValue);
                            arrayList8.add(c1ty);
                            int i13 = 0;
                            while (true) {
                                ArrayList arrayList9 = c02820Cz2.A0A;
                                if (i13 < arrayList9.size()) {
                                    C09320d3 c09320d34 = (C09320d3) arrayList9.get(i13);
                                    if (C02820Cz.A00(c09320d34)) {
                                        c09320d34.A05.A0R(c1ty);
                                    }
                                    i13++;
                                } else {
                                    if (booleanValue) {
                                        c02820Cz2.A0B();
                                    } else {
                                        c02820Cz2.A0E(false);
                                    }
                                    i3--;
                                    if (i11 != i3) {
                                        arrayList.remove(i11);
                                        arrayList.add(i3, c02820Cz2);
                                    }
                                    A0O(anonymousClass036);
                                }
                            }
                        }
                    } else {
                        i12++;
                    }
                }
            }
            int i14 = anonymousClass036.A00;
            for (int i15 = 0; i15 < i14; i15++) {
                C0BA c0ba5 = (C0BA) anonymousClass036.A03[i15];
                if (!c0ba5.A0T) {
                    View A05 = c0ba5.A05();
                    c0ba5.A00 = A05.getAlpha();
                    A05.setAlpha(0.0f);
                }
            }
        } else {
            i3 = i2;
        }
        if (i3 != i4 && z) {
            C09370d9.A0A(this, arrayList, arrayList2, i4, i3, true, this.A0R);
            A0K(this.A00, true);
        }
        while (i4 < i2) {
            C02820Cz c02820Cz3 = (C02820Cz) arrayList.get(i4);
            if (((Boolean) arrayList2.get(i4)).booleanValue() && c02820Cz3.A00 >= 0) {
                c02820Cz3.A00 = -1;
            }
            i4++;
        }
        if (!z2 || this.A0A == null) {
            return;
        }
        int i16 = 0;
        while (true) {
            ArrayList arrayList10 = this.A0A;
            if (i16 < arrayList10.size()) {
                ((C0Wa) arrayList10.get(i16)).onBackStackChanged();
                i16++;
            } else {
                return;
            }
        }
    }

    public void A0n(boolean z) {
        for (C0BA c0ba : this.A0Q.A04()) {
            if (c0ba != null) {
                c0ba.A0G.A0n(z);
            }
        }
    }

    public void A0o(boolean z) {
        for (C0BA c0ba : this.A0Q.A04()) {
            if (c0ba != null) {
                c0ba.A0G.A0o(z);
            }
        }
    }

    public void A0p(boolean z) {
        A0q(z);
        while (true) {
            ArrayList arrayList = this.A0F;
            ArrayList arrayList2 = this.A0E;
            ArrayList arrayList3 = this.A0S;
            synchronized (arrayList3) {
                if (arrayList3.isEmpty()) {
                    break;
                }
                int size = arrayList3.size();
                boolean z2 = false;
                for (int i = 0; i < size; i++) {
                    z2 |= ((C0D1) arrayList3.get(i)).A89(arrayList, arrayList2);
                }
                arrayList3.clear();
                this.A06.A02.removeCallbacks(this.A08);
                if (!z2) {
                    break;
                }
                this.A0I = true;
                try {
                    A0l(this.A0F, this.A0E);
                } finally {
                    A0F();
                }
            }
        }
        A0I();
        if (this.A0J) {
            this.A0J = false;
            A0H();
        }
        this.A0Q.A01.values().removeAll(Collections.singleton(null));
    }

    public final void A0q(boolean z) {
        if (!this.A0I) {
            if (this.A06 == null) {
                if (this.A0H) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.A06.A02.getLooper()) {
                if (!z && A0r()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.A0F == null) {
                    this.A0F = new ArrayList();
                    this.A0E = new ArrayList();
                }
                this.A0I = true;
                try {
                    A0k(null, null);
                    return;
                } finally {
                    this.A0I = false;
                }
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public boolean A0r() {
        return this.A0L || this.A0M;
    }

    public boolean A0s() {
        A0p(false);
        A0q(true);
        C0BA c0ba = this.A03;
        if (c0ba == null || !c0ba.A0B().A0s()) {
            ArrayList arrayList = this.A0F;
            ArrayList arrayList2 = this.A0E;
            boolean A0y = A0y(arrayList, arrayList2, null, -1, 0);
            if (A0y) {
                this.A0I = true;
                try {
                    A0l(arrayList, arrayList2);
                } finally {
                    A0F();
                }
            }
            A0I();
            if (this.A0J) {
                this.A0J = false;
                A0H();
            }
            this.A0Q.A01.values().removeAll(Collections.singleton(null));
            return A0y;
        }
        return true;
    }

    public boolean A0t(Menu menu) {
        boolean z = false;
        if (this.A00 < 1) {
            return false;
        }
        for (C0BA c0ba : this.A0Q.A04()) {
            if (c0ba != null) {
                boolean z2 = false;
                if (!c0ba.A0Z) {
                    if (c0ba.A0Y && c0ba.A0e) {
                        z2 = true;
                        c0ba.A0l(menu);
                    }
                    if (z2 | c0ba.A0G.A0t(menu)) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public boolean A0u(Menu menu, MenuInflater menuInflater) {
        int i = 0;
        if (this.A00 < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (C0BA c0ba : this.A0Q.A04()) {
            if (c0ba != null) {
                boolean z2 = false;
                if (!c0ba.A0Z) {
                    if (c0ba.A0Y && c0ba.A0e) {
                        z2 = true;
                        c0ba.A0m(menu, menuInflater);
                    }
                    if (z2 | c0ba.A0G.A0u(menu, menuInflater)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(c0ba);
                        z = true;
                    }
                }
            }
        }
        if (this.A0B != null) {
            while (true) {
                ArrayList arrayList2 = this.A0B;
                if (i >= arrayList2.size()) {
                    break;
                }
                Object obj = arrayList2.get(i);
                if ((arrayList == null || !arrayList.contains(obj)) && obj == null) {
                    throw null;
                }
                i++;
            }
        }
        this.A0B = arrayList;
        return z;
    }

    public boolean A0v(MenuItem menuItem) {
        if (this.A00 < 1) {
            return false;
        }
        for (C0BA c0ba : this.A0Q.A04()) {
            if (c0ba != null && !c0ba.A0Z && (c0ba.A0n(menuItem) || c0ba.A0G.A0v(menuItem))) {
                return true;
            }
        }
        return false;
    }

    public boolean A0w(MenuItem menuItem) {
        if (this.A00 < 1) {
            return false;
        }
        for (C0BA c0ba : this.A0Q.A04()) {
            if (c0ba != null && !c0ba.A0Z && ((c0ba.A0Y && c0ba.A0e && c0ba.A0o(menuItem)) || c0ba.A0G.A0w(menuItem))) {
                return true;
            }
        }
        return false;
    }

    public boolean A0x(C0BA c0ba) {
        if (c0ba == null) {
            return true;
        }
        AbstractC02800Cx abstractC02800Cx = c0ba.A0H;
        return c0ba.equals(abstractC02800Cx.A03) && A0x(abstractC02800Cx.A02);
    }

    public boolean A0y(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int size;
        ArrayList arrayList3 = this.A09;
        if (arrayList3 == null) {
            return false;
        }
        if (str != null || i >= 0) {
            size = arrayList3.size() - 1;
            while (size >= 0) {
                C02820Cz c02820Cz = (C02820Cz) arrayList3.get(size);
                if ((str == null || !str.equals(c02820Cz.getName())) && (i < 0 || i != c02820Cz.A00)) {
                    size--;
                } else if ((i2 & 1) != 0) {
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        C02820Cz c02820Cz2 = (C02820Cz) arrayList3.get(size);
                        if (str == null || !str.equals(c02820Cz2.getName())) {
                            if (i < 0 || i != c02820Cz2.A00) {
                                break;
                            }
                        }
                    }
                }
            }
            return false;
        } else if ((i2 & 1) == 0) {
            int size2 = arrayList3.size() - 1;
            if (size2 < 0) {
                return false;
            }
            arrayList.add(arrayList3.remove(size2));
            arrayList2.add(Boolean.TRUE);
            return true;
        } else {
            size = -1;
        }
        if (size == arrayList3.size() - 1) {
            return false;
        }
        for (int size3 = arrayList3.size() - 1; size3 > size; size3--) {
            arrayList.add(arrayList3.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0BA c0ba = this.A02;
        if (c0ba != null) {
            sb.append(c0ba.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(c0ba)));
            sb.append("}");
        } else {
            C0UG c0ug = this.A06;
            sb.append(c0ug.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(c0ug)));
            sb.append("}");
        }
        sb.append("}}");
        return sb.toString();
    }
}
