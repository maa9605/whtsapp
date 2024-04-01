package X;

import android.content.Context;
import android.os.Looper;

/* renamed from: X.18y  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C239618y {
    public static final C227413u A04;
    public static final C30521ai A02 = new C30521ai();
    public static final C30521ai A03 = new C30521ai();
    public static final AbstractC30501ag A00 = new AbstractC30501ag() { // from class: X.1fO
        @Override // X.AbstractC30501ag
        public final /* synthetic */ InterfaceC30511ah A01(Context context, Looper looper, C230114w c230114w, Object obj, InterfaceC227813z interfaceC227813z, AnonymousClass140 anonymousClass140) {
            return new AnonymousClass171(context, looper, c230114w, interfaceC227813z, anonymousClass140);
        }
    };
    public static final AbstractC30501ag A01 = new AbstractC30501ag() { // from class: X.1fN
        @Override // X.AbstractC30501ag
        public final /* synthetic */ InterfaceC30511ah A01(Context context, Looper looper, C230114w c230114w, Object obj, InterfaceC227813z interfaceC227813z, AnonymousClass140 anonymousClass140) {
            throw new NoSuchMethodError();
        }
    };

    static {
        C07K.A1V("profile", "scopeUri must not be null or empty");
        C07K.A1V("email", "scopeUri must not be null or empty");
        A04 = new C227413u("SignIn.API", A00, A02);
        AbstractC30501ag abstractC30501ag = A01;
        C30521ai c30521ai = A03;
        C07K.A1Q(abstractC30501ag, "Cannot construct an Api with a null ClientBuilder");
        C07K.A1Q(c30521ai, "Cannot construct an Api with a null ClientKey");
    }
}
