package X;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.0kc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C13110kc {
    public ViewParent A00;
    public ViewParent A01;
    public boolean A02;
    public int[] A03;
    public final View A04;

    public C13110kc(View view) {
        this.A04 = view;
    }

    public final ViewParent A00(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.A00;
        }
        return this.A01;
    }

    public void A01(int i) {
        ViewParent A00 = A00(i);
        if (A00 != null) {
            View view = this.A04;
            if (A00 instanceof InterfaceC02890Dh) {
                ((InterfaceC02890Dh) A00).APB(view, i);
            } else if (i == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        A00.onStopNestedScroll(view);
                    } catch (AbstractMethodError e) {
                        StringBuilder sb = new StringBuilder("ViewParent ");
                        sb.append(A00);
                        sb.append(" does not implement interface method onStopNestedScroll");
                        Log.e("ViewParentCompat", sb.toString(), e);
                    }
                } else if (A00 instanceof InterfaceC02900Di) {
                    ((InterfaceC02900Di) A00).onStopNestedScroll(view);
                }
            }
            if (i == 0) {
                this.A01 = null;
            } else if (i == 1) {
                this.A00 = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0081 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A02(int r11, int r12) {
        /*
            r10 = this;
            android.view.ViewParent r0 = r10.A00(r12)
            r5 = 1
            r9 = 0
            if (r0 == 0) goto L9
            return r5
        L9:
            boolean r0 = r10.A02
            if (r0 == 0) goto La4
            android.view.View r6 = r10.A04
            android.view.ViewParent r4 = r6.getParent()
            r3 = r6
        L14:
            if (r4 == 0) goto La4
            boolean r2 = r4 instanceof X.InterfaceC02890Dh
            java.lang.String r7 = "ViewParentCompat"
            java.lang.String r8 = "ViewParent "
            r1 = 21
            if (r2 == 0) goto L4b
            r0 = r4
            X.0Dh r0 = (X.InterfaceC02890Dh) r0
            boolean r0 = r0.AOu(r3, r6, r11, r12)
        L27:
            if (r0 == 0) goto L7a
            if (r12 == 0) goto L48
            if (r12 != r5) goto L2f
            r10.A00 = r4
        L2f:
            if (r2 == 0) goto L37
            X.0Dh r4 = (X.InterfaceC02890Dh) r4
            r4.AMN(r3, r6, r11, r12)
        L36:
            return r5
        L37:
            if (r12 != 0) goto L36
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L3e
            goto L86
        L3e:
            boolean r0 = r4 instanceof X.InterfaceC02900Di
            if (r0 == 0) goto L36
            X.0Di r4 = (X.InterfaceC02900Di) r4
            r4.onNestedScrollAccepted(r3, r6, r11)
            return r5
        L48:
            r10.A01 = r4
            goto L2f
        L4b:
            if (r12 != 0) goto L7a
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L56
            boolean r0 = r4.onStartNestedScroll(r3, r6, r11)     // Catch: java.lang.AbstractMethodError -> L62
            goto L27
        L56:
            boolean r0 = r4 instanceof X.InterfaceC02900Di
            if (r0 == 0) goto L7a
            r0 = r4
            X.0Di r0 = (X.InterfaceC02900Di) r0
            boolean r0 = r0.onStartNestedScroll(r3, r6, r11)
            goto L27
        L62:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r4)
            java.lang.String r0 = " does not implement interface method onStartNestedScroll"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r7, r0, r2)
        L7a:
            boolean r0 = r4 instanceof android.view.View
            if (r0 == 0) goto L81
            r3 = r4
            android.view.View r3 = (android.view.View) r3
        L81:
            android.view.ViewParent r4 = r4.getParent()
            goto L14
        L86:
            r4.onNestedScrollAccepted(r3, r6, r11)     // Catch: java.lang.AbstractMethodError -> L8a
            goto La3
        L8a:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r4)
            java.lang.String r0 = " does not implement interface method onNestedScrollAccepted"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r7, r0, r2)
            return r5
        La3:
            return r5
        La4:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13110kc.A02(int, int):boolean");
    }

    public final boolean A03(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent A00;
        int i6;
        int i7;
        int[] iArr3 = iArr2;
        if (!this.A02 || (A00 = A00(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.A04.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            iArr3 = this.A03;
            if (iArr3 == null) {
                iArr3 = new int[2];
                this.A03 = iArr3;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
        }
        View view = this.A04;
        if (A00 instanceof InterfaceC02880Dg) {
            ((InterfaceC02880Dg) A00).AMM(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (A00 instanceof InterfaceC02890Dh) {
                ((InterfaceC02890Dh) A00).AML(view, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        A00.onNestedScroll(view, i, i2, i3, i4);
                    } catch (AbstractMethodError e) {
                        StringBuilder sb = new StringBuilder("ViewParent ");
                        sb.append(A00);
                        sb.append(" does not implement interface method onNestedScroll");
                        Log.e("ViewParentCompat", sb.toString(), e);
                    }
                } else if (A00 instanceof InterfaceC02900Di) {
                    ((InterfaceC02900Di) A00).onNestedScroll(view, i, i2, i3, i4);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public boolean A04(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent A00;
        int i4;
        int i5;
        int[] iArr3 = iArr;
        if (!this.A02 || (A00 = A00(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.A04.getLocationInWindow(iArr2);
                i4 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i4 = 0;
                i5 = 0;
            }
            if (iArr == null && (iArr3 = this.A03) == null) {
                iArr3 = new int[2];
                this.A03 = iArr3;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view = this.A04;
            C07O.A0e(A00, view, i, i2, iArr3, i3);
            if (iArr2 != null) {
                view.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i4;
                iArr2[1] = iArr2[1] - i5;
            }
            if (iArr3[0] != 0 || iArr3[1] != 0) {
                return true;
            }
        } else if (iArr2 != null) {
            iArr2[0] = 0;
            iArr2[1] = 0;
        }
        return false;
    }
}
