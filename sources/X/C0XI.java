package X;

import android.os.Bundle;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.0XI  reason: invalid class name */
/* loaded from: classes.dex */
public class C0XI {
    public static Field A00;
    public static boolean A01;
    public static final Object A02 = new Object();

    public static Bundle A00(C07940aL c07940aL) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("icon", c07940aL.A00);
        bundle2.putCharSequence("title", c07940aL.A03);
        bundle2.putParcelable("actionIntent", c07940aL.A01);
        Bundle bundle3 = c07940aL.A07;
        if (bundle3 != null) {
            bundle = new Bundle(bundle3);
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", c07940aL.A04);
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", A01(c07940aL.A09));
        bundle2.putBoolean("showsUserInterface", c07940aL.A05);
        bundle2.putInt("semanticAction", c07940aL.A06);
        return bundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bundle[] A01(C12830k9[] c12830k9Arr) {
        if (c12830k9Arr == null) {
            return null;
        }
        int length = c12830k9Arr.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i = 0; i < length; i++) {
            C12830k9 c12830k9 = c12830k9Arr[i];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", c12830k9.A02);
            bundle.putCharSequence("label", c12830k9.A01);
            bundle.putCharSequenceArray("choices", c12830k9.A05);
            bundle.putBoolean("allowFreeFormInput", c12830k9.A04);
            bundle.putBundle("extras", c12830k9.A00);
            Set<Object> set = c12830k9.A03;
            if (set != null && !set.isEmpty()) {
                ArrayList arrayList = new ArrayList(set.size());
                for (Object obj : set) {
                    arrayList.add(obj);
                }
                bundle.putStringArrayList("allowedDataTypes", arrayList);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }
}
