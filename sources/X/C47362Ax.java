package X;

import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2Ax  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47362Ax {
    public static AtomicReference A00 = new AtomicReference(null);

    public static void A00(String str) {
        if (A00.get() != null) {
            Log.e(str);
        }
    }
}
