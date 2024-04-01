package X;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.16s  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C234516s {
    static {
        C234516s.class.getClassLoader();
    }

    public static void A00(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
