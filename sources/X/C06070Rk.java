package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import java.util.Arrays;

/* renamed from: X.0Rk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C06070Rk {
    public static C06070Rk A01;
    public final Context A00;

    public C06070Rk(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public static C06070Rk A00(Context context) {
        C07K.A1P(context);
        synchronized (C06070Rk.class) {
            if (A01 == null) {
                synchronized (C06100Rn.class) {
                    if (C06100Rn.A00 == null) {
                        C06100Rn.A00 = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                A01 = new C06070Rk(context);
            }
        }
        return A01;
    }

    public static AbstractBinderC06120Rp A01(PackageInfo packageInfo, AbstractBinderC06120Rp... abstractBinderC06120RpArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        final byte[] byteArray = signatureArr[0].toByteArray();
        AbstractBinderC06120Rp abstractBinderC06120Rp = new AbstractBinderC06120Rp(byteArray) { // from class: X.0Rv
            public final byte[] A00;

            {
                super(Arrays.copyOfRange(byteArray, 0, 25));
                this.A00 = byteArray;
            }

            @Override // X.AbstractBinderC06120Rp
            public final byte[] A02() {
                return this.A00;
            }
        };
        for (int i = 0; i < abstractBinderC06120RpArr.length; i++) {
            if (abstractBinderC06120RpArr[i].equals(abstractBinderC06120Rp)) {
                return abstractBinderC06120RpArr[i];
            }
        }
        return null;
    }

    public static boolean A02(PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? A01(packageInfo, C06110Ro.A00) : A01(packageInfo, C06110Ro.A00[0])) != null) {
                return true;
            }
        }
        return false;
    }
}
