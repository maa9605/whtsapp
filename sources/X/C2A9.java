package X;

import android.content.Context;

/* renamed from: X.2A9 */
/* loaded from: classes2.dex */
public class C2A9 extends C007203d {
    public static volatile C2A9 A00;

    public C2A9(final Context context) {
        super(new InterfaceC007103c() { // from class: X.3vH
            @Override // X.InterfaceC007103c
            public final Object get() {
                return C0OP.A00(context);
            }
        }, null);
    }

    public static C2A9 A01() {
        if (A00 == null) {
            synchronized (C2A9.class) {
                if (A00 == null) {
                    A00 = new C2A9(C001200o.A01.A00);
                }
            }
        }
        return A00;
    }
}
