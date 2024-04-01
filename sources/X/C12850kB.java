package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0kB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12850kB implements Iterable {
    public final Context A00;
    public final ArrayList A01 = new ArrayList();

    public C12850kB(Context context) {
        this.A00 = context;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.A01.iterator();
    }
}
