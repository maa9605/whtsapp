package X;

import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2Qr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C50212Qr {
    public InputMethodSubtype A00;
    public Set A01;
    public final C02E A02;

    public C50212Qr(C02E c02e) {
        this.A02 = c02e;
    }

    public final void A00() {
        this.A01 = new HashSet();
        InputMethodManager A0I = this.A02.A0I();
        if (A0I != null) {
            for (InputMethodInfo inputMethodInfo : A0I.getEnabledInputMethodList()) {
                if (inputMethodInfo.getId().startsWith("com.google.android.inputmethod")) {
                    this.A01.addAll(A0I.getEnabledInputMethodSubtypeList(inputMethodInfo, true));
                }
            }
            return;
        }
        throw null;
    }
}
