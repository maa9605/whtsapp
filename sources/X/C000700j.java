package X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Collection;

/* renamed from: X.00j */
/* loaded from: classes.dex */
public class C000700j {
    public static volatile Boolean A00;

    public static void A00() {
        A08(!AnonymousClass024.A0c(), "should not be run in main thread");
    }

    public static void A01() {
        A08(AnonymousClass024.A0c(), "should be run in ui main thread");
    }

    public static void A02(Handler handler) {
        A07(handler.getLooper() == Looper.myLooper());
    }

    public static void A03(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            throw new IllegalArgumentException();
        }
    }

    public static void A04(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void A05(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    public static void A06(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void A07(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void A08(boolean z, String str) {
        if (z) {
            return;
        }
        Log.e(new AssertionError(str));
    }

    public static void A09(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void A0A(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void A0B(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new IllegalArgumentException();
        }
    }
}
