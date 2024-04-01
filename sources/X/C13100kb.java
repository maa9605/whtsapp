package X;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.0kb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C13100kb {
    public static Field A00;
    public static Method A01;
    public static boolean A02;
    public static boolean A03;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
        if (r8 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ca, code lost:
        if (r1.onKey(r11, r12.getKeyCode(), r12) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(X.InterfaceC02370Ax r9, android.view.View r10, android.view.Window.Callback r11, android.view.KeyEvent r12) {
        /*
            r8 = 0
            if (r9 != 0) goto L4
            return r8
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto Lf
            boolean r0 = r9.AVH(r12)
            return r0
        Lf:
            boolean r0 = r11 instanceof android.app.Activity
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L7d
            android.app.Activity r11 = (android.app.Activity) r11
            r11.onUserInteraction()
            android.view.Window r6 = r11.getWindow()
            r0 = 8
            boolean r0 = r6.hasFeature(r0)
            if (r0 == 0) goto L5f
            android.app.ActionBar r7 = r11.getActionBar()
            int r1 = r12.getKeyCode()
            r0 = 82
            if (r1 != r0) goto L5f
            if (r7 == 0) goto L5f
            boolean r0 = X.C13100kb.A02
            if (r0 != 0) goto L4c
            java.lang.Class r5 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.Class<android.view.KeyEvent> r0 = android.view.KeyEvent.class
            r1[r8] = r0     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r0 = r5.getMethod(r4, r1)     // Catch: java.lang.NoSuchMethodException -> L4a
            X.C13100kb.A01 = r0     // Catch: java.lang.NoSuchMethodException -> L4a
        L4a:
            X.C13100kb.A02 = r2
        L4c:
            java.lang.reflect.Method r1 = X.C13100kb.A01
            if (r1 == 0) goto L5f
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L7a
            r0[r8] = r12     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = r1.invoke(r7, r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L7a
            boolean r8 = r0.booleanValue()     // Catch: java.lang.Throwable -> L7a
            goto L7a
        L5f:
            boolean r0 = r6.superDispatchKeyEvent(r12)
            if (r0 != 0) goto L7c
            android.view.View r1 = r6.getDecorView()
            boolean r0 = X.C0AT.A0k(r1, r12)
            if (r0 != 0) goto L7c
            if (r1 == 0) goto L75
            android.view.KeyEvent$DispatcherState r3 = r1.getKeyDispatcherState()
        L75:
            boolean r2 = r12.dispatch(r11, r3, r11)
            return r2
        L7a:
            if (r8 == 0) goto L5f
        L7c:
            return r2
        L7d:
            boolean r0 = r11 instanceof android.app.Dialog
            if (r0 == 0) goto Lcd
            android.app.Dialog r11 = (android.app.Dialog) r11
            boolean r0 = X.C13100kb.A03
            if (r0 != 0) goto L96
            java.lang.Class<android.app.Dialog> r1 = android.app.Dialog.class
            java.lang.String r0 = "mOnKeyListener"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L94
            X.C13100kb.A00 = r0     // Catch: java.lang.NoSuchFieldException -> L94
            r0.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L94
        L94:
            X.C13100kb.A03 = r2
        L96:
            java.lang.reflect.Field r0 = X.C13100kb.A00
            if (r0 == 0) goto La3
            java.lang.Object r1 = r0.get(r11)     // Catch: java.lang.IllegalAccessException -> La3
            android.content.DialogInterface$OnKeyListener r1 = (android.content.DialogInterface.OnKeyListener) r1     // Catch: java.lang.IllegalAccessException -> La3
            if (r1 == 0) goto La3
            goto Lc2
        La3:
            android.view.Window r1 = r11.getWindow()
            boolean r0 = r1.superDispatchKeyEvent(r12)
            if (r0 != 0) goto Lcc
            android.view.View r1 = r1.getDecorView()
            boolean r0 = X.C0AT.A0k(r1, r12)
            if (r0 != 0) goto Lcc
            if (r1 == 0) goto Lbd
            android.view.KeyEvent$DispatcherState r3 = r1.getKeyDispatcherState()
        Lbd:
            boolean r2 = r12.dispatch(r11, r3, r11)
            return r2
        Lc2:
            int r0 = r12.getKeyCode()
            boolean r0 = r1.onKey(r11, r0, r12)
            if (r0 == 0) goto La3
        Lcc:
            return r2
        Lcd:
            if (r10 == 0) goto Ld5
            boolean r0 = X.C0AT.A0k(r10, r12)
            if (r0 != 0) goto Ldb
        Ld5:
            boolean r0 = r9.AVH(r12)
            if (r0 == 0) goto Ldc
        Ldb:
            r8 = 1
        Ldc:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13100kb.A00(X.0Ax, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }
}
