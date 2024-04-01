package X;

import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: X.2jB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC54682jB {
    public final ThreadLocal A00 = new ThreadLocal() { // from class: X.2jG
        @Override // java.lang.ThreadLocal
        public Object initialValue() {
            return new WeakReference(AbstractC54682jB.this.A00());
        }
    };

    public Object A00() {
        if (this instanceof C54722jF) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        }
        if (this instanceof C54712jE) {
            return new SimpleDateFormat("MMM dd, yyyy", Locale.US);
        }
        if (this instanceof C54702jD) {
            return new GregorianCalendar();
        }
        if (!(this instanceof C54692jC)) {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.US);
        }
        return new GregorianCalendar();
    }

    public synchronized Object A01() {
        Object obj;
        ThreadLocal threadLocal = this.A00;
        obj = ((WeakReference) threadLocal.get()).get();
        if (obj == null) {
            obj = A00();
            threadLocal.set(new WeakReference(obj));
        }
        return obj;
    }
}
