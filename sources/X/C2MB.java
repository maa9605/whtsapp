package X;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.google.android.search.verification.client.R;

/* renamed from: X.2MB  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2MB {
    public static volatile C2MB A01;
    public final C02E A00;

    public C2MB(C02E c02e) {
        this.A00 = c02e;
    }

    public static boolean A00(View view) {
        Rect rect = new Rect();
        view.getRootView().getWindowVisibleDisplayFrame(rect);
        return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getHeight() - rect.bottom >= view.getRootView().getResources().getDimensionPixelSize(R.dimen.ime_utils_window_density);
    }

    public void A01(View view) {
        InputMethodManager A0I = this.A00.A0I();
        if (A0I != null) {
            A0I.hideSoftInputFromWindow(view.getWindowToken(), 0);
            return;
        }
        throw null;
    }

    public void A02(View view) {
        InputMethodManager A0I = this.A00.A0I();
        if (A0I != null) {
            A0I.showSoftInput(view, 0);
            return;
        }
        throw null;
    }
}
