package X;

import java.io.Closeable;

/* renamed from: X.0vg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC19590vg implements Closeable {
    public abstract int A00();

    public abstract boolean A01();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public void finalize() {
        if (A01()) {
            return;
        }
        C18960uc.A00.A00(5, "CloseableImage", String.format(null, "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this))));
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
