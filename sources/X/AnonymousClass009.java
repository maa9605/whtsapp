package X;

import com.whatsapp.util.Log;

/* renamed from: X.009 */
/* loaded from: classes.dex */
public abstract class AnonymousClass009 {
    public final AnonymousClass023 A00 = new AnonymousClass023();

    public void A00(Object obj) {
        if (obj != null) {
            C000700j.A01();
            if (this.A00.A01(obj)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(":Observer ");
            sb.append(obj);
            sb.append(" was not registered.");
            Log.e(sb.toString());
            return;
        }
        throw null;
    }

    public void A01(Object obj) {
        if (obj != null) {
            C000700j.A01();
            AnonymousClass023 anonymousClass023 = this.A00;
            if (!anonymousClass023.A01.contains(obj)) {
                anonymousClass023.A00(obj);
                return;
            }
            StringBuilder sb = new StringBuilder("Observer ");
            sb.append(obj);
            sb.append(" is already registered.");
            throw new IllegalStateException(sb.toString());
        }
        throw null;
    }
}
