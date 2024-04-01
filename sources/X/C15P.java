package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.15P  reason: invalid class name */
/* loaded from: classes.dex */
public final class C15P {
    public static final AbstractC30501ag A00;
    public static final C30521ai A01;
    public static final C227413u A02;
    public static final C15Q A03;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.15Q] */
    static {
        C30521ai c30521ai = new C30521ai();
        A01 = c30521ai;
        AbstractC30501ag abstractC30501ag = new AbstractC30501ag() { // from class: X.1qV
            @Override // X.AbstractC30501ag
            public final /* synthetic */ InterfaceC30511ah A01(Context context, Looper looper, C230114w c230114w, Object obj, InterfaceC227813z interfaceC227813z, AnonymousClass140 anonymousClass140) {
                return new AbstractC39661qU(context, looper, c230114w, interfaceC227813z, anonymousClass140) { // from class: X.18A
                    @Override // X.AbstractC229914u
                    public final String A05() {
                        return "com.google.android.gms.common.internal.service.ICommonService";
                    }

                    @Override // X.AbstractC229914u
                    public final String A06() {
                        return "com.google.android.gms.common.service.START";
                    }

                    @Override // X.AbstractC229914u
                    public final /* synthetic */ IInterface A03(IBinder iBinder) {
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
                        if (queryLocalInterface instanceof C15S) {
                            return queryLocalInterface;
                        }
                        return new C31091bh(iBinder);
                    }
                };
            }
        };
        A00 = abstractC30501ag;
        A02 = new C227413u("Common.API", abstractC30501ag, c30521ai);
        A03 = new Object() { // from class: X.15Q
        };
    }
}
