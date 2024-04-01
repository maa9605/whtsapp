package X;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;

/* renamed from: X.1oL */
/* loaded from: classes.dex */
public final class C38511oL extends C0VX {
    public static final Class[] A05 = {Application.class, C07750Zs.class};
    public static final Class[] A06 = {C07750Zs.class};
    public final Application A00;
    public final Bundle A01;
    public final AbstractC02530Bu A02;
    public final C38521oN A03;
    public final C0U6 A04;

    public C38511oL(Application application, InterfaceC02390Az interfaceC02390Az, Bundle bundle) {
        this.A04 = interfaceC02390Az.ACx();
        this.A02 = interfaceC02390Az.AAs();
        this.A01 = bundle;
        this.A00 = application;
        C38521oN c38521oN = C38521oN.A01;
        if (c38521oN == null) {
            c38521oN = new C38521oN(application);
            C38521oN.A01 = c38521oN;
        }
        this.A03 = c38521oN;
    }

    @Override // X.C0VY
    public void A00(C0MU c0mu) {
        SavedStateHandleController.A00(c0mu, this.A04, this.A02);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0059 A[Catch: InvocationTargetException -> 0x007a, InstantiationException -> 0x0093, IllegalAccessException -> 0x00ad, TRY_ENTER, TryCatch #2 {IllegalAccessException -> 0x00ad, InstantiationException -> 0x0093, InvocationTargetException -> 0x007a, blocks: (B:56:0x0066, B:57:0x0076, B:55:0x0059), top: B:70:0x0055 }] */
    @Override // X.C0VX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C0MU A01(java.lang.String r8, java.lang.Class r9) {
        /*
            r7 = this;
            java.lang.Class<X.0QY> r0 = X.C0QY.class
            boolean r6 = r0.isAssignableFrom(r9)
            if (r6 == 0) goto L21
            java.lang.Class[] r4 = X.C38511oL.A05
            java.lang.reflect.Constructor[] r3 = r9.getConstructors()
            int r2 = r3.length
            r1 = 0
        L10:
            if (r1 >= r2) goto Lc2
            r5 = r3[r1]
            java.lang.Class[] r0 = r5.getParameterTypes()
            boolean r0 = java.util.Arrays.equals(r4, r0)
            if (r0 != 0) goto L3a
            int r1 = r1 + 1
            goto L10
        L21:
            java.lang.Class[] r4 = X.C38511oL.A06
            java.lang.reflect.Constructor[] r3 = r9.getConstructors()
            int r2 = r3.length
            r1 = 0
        L29:
            if (r1 >= r2) goto Lc2
            r5 = r3[r1]
            java.lang.Class[] r0 = r5.getParameterTypes()
            boolean r0 = java.util.Arrays.equals(r4, r0)
            if (r0 != 0) goto L3a
            int r1 = r1 + 1
            goto L29
        L3a:
            X.0U6 r3 = r7.A04
            X.0Bu r2 = r7.A02
            android.os.Bundle r1 = r7.A01
            android.os.Bundle r0 = r3.A00(r8)
            X.0Zs r0 = X.C07750Zs.A00(r0, r1)
            androidx.lifecycle.SavedStateHandleController r4 = new androidx.lifecycle.SavedStateHandleController
            r4.<init>(r8, r0)
            r4.A02(r3, r2)
            androidx.lifecycle.SavedStateHandleController.A01(r3, r2)
            r3 = 0
            r2 = 1
            if (r6 == 0) goto L59
            r0 = 2
            goto L66
        L59:
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L7a java.lang.InstantiationException -> L93 java.lang.IllegalAccessException -> Lad
            X.0Zs r0 = r4.A01     // Catch: java.lang.reflect.InvocationTargetException -> L7a java.lang.InstantiationException -> L93 java.lang.IllegalAccessException -> Lad
            r1[r3] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L7a java.lang.InstantiationException -> L93 java.lang.IllegalAccessException -> Lad
            java.lang.Object r0 = r5.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L7a java.lang.InstantiationException -> L93 java.lang.IllegalAccessException -> Lad
            X.0MU r0 = (X.C0MU) r0     // Catch: java.lang.reflect.InvocationTargetException -> L7a java.lang.InstantiationException -> L93 java.lang.IllegalAccessException -> Lad
            goto L76
        L66:
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L7a java.lang.InstantiationException -> L93 java.lang.IllegalAccessException -> Lad
            android.app.Application r0 = r7.A00     // Catch: java.lang.reflect.InvocationTargetException -> L7a java.lang.InstantiationException -> L93 java.lang.IllegalAccessException -> Lad
            r1[r3] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L7a java.lang.InstantiationException -> L93 java.lang.IllegalAccessException -> Lad
            X.0Zs r0 = r4.A01     // Catch: java.lang.reflect.InvocationTargetException -> L7a java.lang.InstantiationException -> L93 java.lang.IllegalAccessException -> Lad
            r1[r2] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L7a java.lang.InstantiationException -> L93 java.lang.IllegalAccessException -> Lad
            java.lang.Object r0 = r5.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L7a java.lang.InstantiationException -> L93 java.lang.IllegalAccessException -> Lad
            X.0MU r0 = (X.C0MU) r0     // Catch: java.lang.reflect.InvocationTargetException -> L7a java.lang.InstantiationException -> L93 java.lang.IllegalAccessException -> Lad
        L76:
            r0.A00(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L7a java.lang.InstantiationException -> L93 java.lang.IllegalAccessException -> Lad
            return r0
        L7a:
            r3 = move-exception
            java.lang.String r1 = "An exception happened in constructor of "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r2 = r0.toString()
            java.lang.Throwable r1 = r3.getCause()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2, r1)
            throw r0
        L93:
            r2 = move-exception
            java.lang.String r0 = "A "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r9)
            java.lang.String r0 = " cannot be instantiated."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        Lad:
            r2 = move-exception
            java.lang.String r1 = "Failed to access "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = r0.toString()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        Lc2:
            X.1oN r0 = r7.A03
            X.0MU r0 = r0.A6e(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38511oL.A01(java.lang.String, java.lang.Class):X.0MU");
    }

    @Override // X.C0VX, X.C0CR
    public C0MU A6e(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return A01(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
