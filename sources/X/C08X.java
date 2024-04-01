package X;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.08X  reason: invalid class name */
/* loaded from: classes.dex */
public class C08X implements C08Y {
    public static AtomicReference A00 = new AtomicReference();

    @Override // X.C08Y
    public void AHi(boolean z) {
        synchronized (C08U.A09) {
            Iterator it = new ArrayList(C08U.A0E.values()).iterator();
            while (it.hasNext()) {
                C08U c08u = (C08U) it.next();
                if (c08u.A06.get()) {
                    Log.d("FirebaseApp", "Notifying background state change listeners.");
                    Iterator it2 = c08u.A05.iterator();
                    if (it2.hasNext()) {
                        it2.next();
                        throw null;
                    }
                }
            }
        }
    }
}
