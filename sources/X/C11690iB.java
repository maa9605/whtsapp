package X;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import android.util.Log;

/* renamed from: X.0iB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C11690iB {
    public final BiometricManager A00;
    public final InterfaceC11680iA A01;
    public final C0LI A02;

    public C11690iB(InterfaceC11680iA interfaceC11680iA) {
        this.A01 = interfaceC11680iA;
        int i = Build.VERSION.SDK_INT;
        this.A00 = i >= 29 ? (BiometricManager) ((C1SW) interfaceC11680iA).A00.getSystemService(BiometricManager.class) : null;
        this.A02 = i <= 29 ? new C0LI(((C1SW) interfaceC11680iA).A00) : null;
    }

    public int A00() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            BiometricManager biometricManager = this.A00;
            if (biometricManager == null) {
                Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                return 1;
            }
            return biometricManager.canAuthenticate(255);
        } else if (C07O.A0y(255)) {
            Context context = ((C1SW) this.A01).A00;
            if (C11800iM.A00(context) != null) {
                if (true && true) {
                    return C11800iM.A04(context) ? 0 : 11;
                } else if (i == 29) {
                    BiometricManager biometricManager2 = this.A00;
                    if (biometricManager2 == null) {
                        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                        return 1;
                    }
                    return biometricManager2.canAuthenticate();
                } else if (i == 28) {
                    if (C11800iM.A03(context)) {
                        if (C11800iM.A04(context)) {
                            return A01() == 0 ? 0 : -1;
                        }
                        return A01();
                    }
                    return 12;
                } else {
                    return A01();
                }
            }
            return 12;
        } else {
            return -2;
        }
    }

    public final int A01() {
        C0LI c0li = this.A02;
        if (c0li == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        } else if (c0li.A03()) {
            return !c0li.A02() ? 11 : 0;
        } else {
            return 12;
        }
    }
}
