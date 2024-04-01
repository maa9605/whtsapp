package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.1qa  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39701qa extends C0ND {
    public static final AbstractC30501ag A00;
    public static final C30521ai A01;
    public static final C227413u A02;

    static {
        C30521ai c30521ai = new C30521ai();
        A01 = c30521ai;
        AbstractC30501ag abstractC30501ag = new AbstractC30501ag() { // from class: X.1qD
            @Override // X.AbstractC30501ag
            public final /* synthetic */ InterfaceC30511ah A01(Context context, Looper looper, C230114w c230114w, Object obj, InterfaceC227813z interfaceC227813z, AnonymousClass140 anonymousClass140) {
                return new AbstractC39661qU(context, looper, c230114w, interfaceC227813z, anonymousClass140) { // from class: X.189
                    @Override // X.AbstractC229914u
                    public final /* synthetic */ IInterface A03(IBinder iBinder) {
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
                        return queryLocalInterface instanceof C16V ? queryLocalInterface : new C31391cC(iBinder);
                    }

                    @Override // X.AbstractC229914u
                    public final String A05() {
                        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
                    }

                    @Override // X.AbstractC229914u
                    public final String A06() {
                        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
                    }
                };
            }
        };
        A00 = abstractC30501ag;
        A02 = new C227413u("SmsRetriever.API", abstractC30501ag, c30521ai);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C39701qa(android.app.Activity r5) {
        /*
            r4 = this;
            X.13u r3 = X.C39701qa.A02
            X.143 r2 = new X.143
            r2.<init>()
            java.lang.String r0 = "StatusExceptionMapper must not be null."
            X.C07K.A1Q(r2, r0)
            android.os.Looper r1 = r5.getMainLooper()
            java.lang.String r0 = "Looper must not be null."
            X.C07K.A1Q(r1, r0)
            X.13w r0 = new X.13w
            r0.<init>(r2, r1)
            r4.<init>(r5, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39701qa.<init>(android.app.Activity):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C39701qa(android.content.Context r5) {
        /*
            r4 = this;
            X.13u r3 = X.C39701qa.A02
            X.143 r2 = new X.143
            r2.<init>()
            java.lang.String r0 = "StatusExceptionMapper must not be null."
            X.C07K.A1Q(r2, r0)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            X.13w r0 = new X.13w
            r0.<init>(r2, r1)
            r4.<init>(r5, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39701qa.<init>(android.content.Context):void");
    }
}
