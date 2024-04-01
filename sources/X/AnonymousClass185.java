package X;

import android.content.Context;
import android.os.Looper;

/* renamed from: X.185  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass185 {
    public static final AbstractC30501ag A00;
    public static final C30521ai A01;
    public static final C227413u A02;
    public static final C236617p A03;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.17p] */
    static {
        C30521ai c30521ai = new C30521ai();
        A01 = c30521ai;
        AbstractC30501ag abstractC30501ag = new AbstractC30501ag() { // from class: X.1qy
            @Override // X.AbstractC30501ag
            public final /* synthetic */ InterfaceC30511ah A01(Context context, Looper looper, C230114w c230114w, Object obj, InterfaceC227813z interfaceC227813z, AnonymousClass140 anonymousClass140) {
                return new C16410qM(context, looper, interfaceC227813z, anonymousClass140, c230114w);
            }
        };
        A00 = abstractC30501ag;
        A02 = new C227413u("LocationServices.API", abstractC30501ag, c30521ai);
        A03 = new Object() { // from class: X.17p
        };
    }
}
