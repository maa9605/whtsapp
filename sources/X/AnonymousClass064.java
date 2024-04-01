package X;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.064  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass064 {
    public final Set A00 = new CopyOnWriteArraySet();

    public void A00(Object obj) {
        if (obj != null) {
            if (this.A00.add(obj)) {
                return;
            }
            StringBuilder sb = new StringBuilder("Observer ");
            sb.append(obj);
            sb.append(" is already registered.");
            throw new IllegalStateException(sb.toString());
        }
        throw null;
    }

    public void A01(Object obj) {
        if (obj != null) {
            if (this.A00.remove(obj)) {
                return;
            }
            StringBuilder sb = new StringBuilder("Observer ");
            sb.append(obj);
            sb.append(" was not registered.");
            throw new IllegalStateException(sb.toString());
        }
        throw null;
    }
}
