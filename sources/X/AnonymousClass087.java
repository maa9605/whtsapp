package X;

import android.content.Context;
import android.util.SparseArray;

/* renamed from: X.087 */
/* loaded from: classes.dex */
public class AnonymousClass087 {
    public final Context A00;
    public final SparseArray A01;
    public final InterfaceC25071Dy A02;
    public final boolean A03;

    public AnonymousClass087(Context context, InterfaceC25071Dy interfaceC25071Dy, SparseArray sparseArray) {
        this.A00 = context;
        this.A02 = interfaceC25071Dy;
        this.A03 = AnonymousClass029.A1K(context);
        this.A01 = sparseArray;
    }

    public Object A00(int i) {
        Object obj = this.A01.get(i);
        if (obj != null) {
            return obj;
        }
        StringBuilder A0P = C000200d.A0P("Null value associated with key: ");
        A0P.append(this.A00.getResources().getResourceEntryName(i));
        throw new NullPointerException(A0P.toString());
    }
}
