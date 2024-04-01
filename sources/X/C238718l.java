package X;

import android.content.Context;
import android.os.Looper;

/* renamed from: X.18l */
/* loaded from: classes.dex */
public final class C238718l {
    public static final AbstractC30501ag A00;
    public static final C30521ai A01;
    public static final C227413u A02;
    public static final InterfaceC238818m A03;

    static {
        C30521ai c30521ai = new C30521ai();
        A01 = c30521ai;
        AbstractC30501ag abstractC30501ag = new AbstractC30501ag() { // from class: X.1og
            @Override // X.AbstractC30501ag
            public final /* synthetic */ InterfaceC30511ah A01(Context context, Looper looper, C230114w c230114w, Object obj, InterfaceC227813z interfaceC227813z, AnonymousClass140 anonymousClass140) {
                return new C17R(context, looper, c230114w, interfaceC227813z, anonymousClass140);
            }
        };
        A00 = abstractC30501ag;
        A02 = new C227413u("SafetyNet.API", abstractC30501ag, c30521ai);
        A03 = new InterfaceC238818m() { // from class: X.1cl
        };
    }
}
