package X;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* renamed from: X.0VJ  reason: invalid class name */
/* loaded from: classes.dex */
public class C0VJ extends C02160Ac {
    public static View A0A(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return activity.requireViewById(i);
        }
        View findViewById = activity.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void A0B(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    public static void A0C(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }

    public static void A0D(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else if (C12690jt.A00(activity)) {
        } else {
            activity.recreate();
        }
    }

    public static void A0E(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }

    public static void A0F(Activity activity, AbstractC12840kA abstractC12840kA) {
        SharedElementCallbackC12640jo sharedElementCallbackC12640jo;
        if (Build.VERSION.SDK_INT >= 21) {
            if (abstractC12840kA != null) {
                sharedElementCallbackC12640jo = new SharedElementCallbackC12640jo(abstractC12840kA);
            } else {
                sharedElementCallbackC12640jo = null;
            }
            activity.setEnterSharedElementCallback(sharedElementCallbackC12640jo);
        }
    }

    public static void A0G(Activity activity, AbstractC12840kA abstractC12840kA) {
        SharedElementCallbackC12640jo sharedElementCallbackC12640jo;
        if (Build.VERSION.SDK_INT >= 21) {
            if (abstractC12840kA != null) {
                sharedElementCallbackC12640jo = new SharedElementCallbackC12640jo(abstractC12840kA);
            } else {
                sharedElementCallbackC12640jo = null;
            }
            activity.setExitSharedElementCallback(sharedElementCallbackC12640jo);
        }
    }

    public static void A0H(final Activity activity, final String[] strArr, final int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof C0B3) {
                ((C0B3) activity).AVy(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (!(activity instanceof C0B2)) {
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: X.0jn
                @Override // java.lang.Runnable
                public void run() {
                    String[] strArr2 = strArr;
                    int length = strArr2.length;
                    int[] iArr = new int[length];
                    Activity activity2 = activity;
                    PackageManager packageManager = activity2.getPackageManager();
                    String packageName = activity2.getPackageName();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr[i2] = packageManager.checkPermission(strArr2[i2], packageName);
                    }
                    ((C0B2) activity2).onRequestPermissionsResult(i, strArr2, iArr);
                }
            });
        }
    }

    public static boolean A0I(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }
}
