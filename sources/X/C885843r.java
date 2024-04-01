package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.43r  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C885843r {
    public static final List A00 = Collections.emptyList();

    public static List A00(List list) {
        if (list != null && !list.isEmpty()) {
            return Collections.unmodifiableList(new ArrayList(list));
        }
        return A00;
    }
}
