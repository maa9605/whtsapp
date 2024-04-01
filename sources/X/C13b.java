package X;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: X.13b  reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C13b implements Comparator {
    public static final Comparator A00 = new C13b();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Scope) obj).A01.compareTo(((Scope) obj2).A01);
    }
}
