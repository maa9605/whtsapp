package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.14a  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C227914a {
    public static final Status A03 = new Status(8, "The connection to Google Play services was lost");
    public static final BasePendingResult[] A04 = new BasePendingResult[0];
    public final Map A01;
    public final Set A02 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public final InterfaceC228014b A00 = new InterfaceC228014b() { // from class: X.1bC
        @Override // X.InterfaceC228014b
        public final void AWW(BasePendingResult basePendingResult) {
            C227914a.this.A02.remove(basePendingResult);
        }
    };

    public C227914a(Map map) {
        this.A01 = map;
    }
}
