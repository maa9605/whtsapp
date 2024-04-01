package X;

import com.whatsapp.util.Log;

/* renamed from: X.038 */
/* loaded from: classes.dex */
public abstract class AnonymousClass038 {
    public final AnonymousClass023 A00 = new AnonymousClass023();

    public void A00(Object obj) {
        if (obj != null) {
            AnonymousClass023 anonymousClass023 = this.A00;
            synchronized (anonymousClass023) {
                if (!anonymousClass023.A01.contains(obj)) {
                    anonymousClass023.A00(obj);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Observer ");
                    sb.append(obj);
                    sb.append(" is already registered.");
                    throw new IllegalStateException(sb.toString());
                }
            }
            return;
        }
        throw null;
    }

    public void A01(Object obj) {
        if (obj != null) {
            AnonymousClass023 anonymousClass023 = this.A00;
            synchronized (anonymousClass023) {
                if (!anonymousClass023.A01(obj)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(getClass().getSimpleName());
                    sb.append(":Observer ");
                    sb.append(obj);
                    sb.append(" was not registered.");
                    Log.e(sb.toString());
                }
            }
            return;
        }
        throw null;
    }
}
