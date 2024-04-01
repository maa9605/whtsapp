package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0ca  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09070ca implements InterfaceC09030cV {
    public final Set A00 = new HashSet();

    public C09070ca(C0U6 c0u6) {
        if (c0u6.A01.A02("androidx.savedstate.Restarter", this) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    @Override // X.InterfaceC09030cV
    public Bundle ASA() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.A00));
        return bundle;
    }
}
